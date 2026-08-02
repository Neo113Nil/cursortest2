package androidx.media3.exoplayer.dash.manifest;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.common.C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.Label;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.UriUtil;
import androidx.media3.common.util.Util;
import androidx.media3.common.util.XmlPullParserUtil;
import androidx.media3.exoplayer.dash.manifest.SegmentBase;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import androidx.media3.extractor.mp4.PsshAtomUtil;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.common.base.c;
import com.google.common.base.q;
import com.google.common.collect.G;
import com.google.common.collect.S;
import com.google.common.collect.i0;
import com.google.firebase.messaging.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

@UnstableApi
/* loaded from: classes3.dex */
public class DashManifestParser extends DefaultHandler implements ParsingLoadable.Parser<DashManifest> {
    private static final String TAG = "MpdParser";
    private final XmlPullParserFactory xmlParserFactory;
    private static final Pattern FRAME_RATE_PATTERN = Pattern.compile("(\\d+)(?:/(\\d+))?");
    private static final Pattern CEA_608_ACCESSIBILITY_PATTERN = Pattern.compile("CC([1-4])=.*");
    private static final Pattern CEA_708_ACCESSIBILITY_PATTERN = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    private static final int[] DOLBY_AC4_CHANNEL_CONFIGURATION_MAPPING = {2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2};
    private static final int[] MPEG_CHANNEL_CONFIGURATION_MAPPING = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    public static final class RepresentationInfo {
        public final G<BaseUrl> baseUrls;
        public final ArrayList<DrmInitData.SchemeData> drmSchemeDatas;

        @Nullable
        public final String drmSchemeType;
        public final List<Descriptor> essentialProperties;
        public final Format format;
        public final ArrayList<Descriptor> inbandEventStreams;
        public final long revisionId;
        public final SegmentBase segmentBase;
        public final List<Descriptor> supplementalProperties;

        public RepresentationInfo(Format format, List<BaseUrl> list, SegmentBase segmentBase, @Nullable String str, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<Descriptor> arrayList2, List<Descriptor> list2, List<Descriptor> list3, long j) {
            this.format = format;
            this.baseUrls = G.j(list);
            this.segmentBase = segmentBase;
            this.drmSchemeType = str;
            this.drmSchemeDatas = arrayList;
            this.inbandEventStreams = arrayList2;
            this.essentialProperties = list2;
            this.supplementalProperties = list3;
            this.revisionId = j;
        }
    }

    public DashManifestParser() {
        try {
            this.xmlParserFactory = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    private long addSegmentTimelineElementsToList(List<SegmentBase.SegmentTimelineElement> list, long j, long j2, int i, long j3) {
        int ceilDivide = i >= 0 ? i + 1 : (int) Util.ceilDivide(j3 - j, j2);
        for (int i2 = 0; i2 < ceilDivide; i2++) {
            list.add(buildSegmentTimelineElement(j, j2));
            j += j2;
        }
        return j;
    }

    private static int checkContentTypeConsistency(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        Assertions.checkState(i == i2);
        return i;
    }

    @Nullable
    private static String checkLanguageConsistency(@Nullable String str, @Nullable String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        Assertions.checkState(str.equals(str2));
        return str;
    }

    private static void fillInClearKeyInformation(ArrayList<DrmInitData.SchemeData> arrayList) {
        String str;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                str = null;
                break;
            }
            DrmInitData.SchemeData schemeData = arrayList.get(i);
            if (C.CLEARKEY_UUID.equals(schemeData.uuid) && (str = schemeData.licenseServerUrl) != null) {
                arrayList.remove(i);
                break;
            }
            i++;
        }
        if (str == null) {
            return;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            DrmInitData.SchemeData schemeData2 = arrayList.get(i2);
            if (C.COMMON_PSSH_UUID.equals(schemeData2.uuid) && schemeData2.licenseServerUrl == null) {
                arrayList.set(i2, new DrmInitData.SchemeData(C.CLEARKEY_UUID, str, schemeData2.mimeType, schemeData2.data));
            }
        }
    }

    private static void filterRedundantIncompleteSchemeDatas(ArrayList<DrmInitData.SchemeData> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            DrmInitData.SchemeData schemeData = arrayList.get(size);
            if (!schemeData.hasData()) {
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    }
                    if (arrayList.get(i).canReplace(schemeData)) {
                        arrayList.remove(size);
                        break;
                    }
                    i++;
                }
            }
        }
    }

    private static long getFinalAvailabilityTimeOffset(long j, long j2) {
        if (j2 != -9223372036854775807L) {
            j = j2;
        }
        if (j == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j;
    }

    @Nullable
    private static String getSampleMimeType(@Nullable String str, @Nullable String str2) {
        if (MimeTypes.isAudio(str)) {
            return MimeTypes.getAudioMediaMimeType(str2);
        }
        if (MimeTypes.isVideo(str)) {
            return MimeTypes.getVideoMediaMimeType(str2);
        }
        if (MimeTypes.isText(str) || MimeTypes.isImage(str)) {
            return str;
        }
        if (!"application/mp4".equals(str)) {
            return null;
        }
        String mediaMimeType = MimeTypes.getMediaMimeType(str2);
        return "text/vtt".equals(mediaMimeType) ? "application/x-mp4-vtt" : mediaMimeType;
    }

    private boolean isDvbProfileDeclared(String[] strArr) {
        for (String str : strArr) {
            if (str.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    public static void maybeSkipTag(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        if (XmlPullParserUtil.isStartTag(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (XmlPullParserUtil.isStartTag(xmlPullParser)) {
                    i++;
                } else if (XmlPullParserUtil.isEndTag(xmlPullParser)) {
                    i--;
                }
            }
        }
    }

    public static int parseCea608AccessibilityChannel(List<Descriptor> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = list.get(i);
            if ("urn:scte:dash:cc:cea-608:2015".equals(descriptor.schemeIdUri) && (str = descriptor.value) != null) {
                Matcher matcher = CEA_608_ACCESSIBILITY_PATTERN.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                Log.w(TAG, "Unable to parse CEA-608 channel number from: " + descriptor.value);
            }
        }
        return -1;
    }

    public static int parseCea708AccessibilityChannel(List<Descriptor> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = list.get(i);
            if ("urn:scte:dash:cc:cea-708:2015".equals(descriptor.schemeIdUri) && (str = descriptor.value) != null) {
                Matcher matcher = CEA_708_ACCESSIBILITY_PATTERN.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                Log.w(TAG, "Unable to parse CEA-708 service block number from: " + descriptor.value);
            }
        }
        return -1;
    }

    public static long parseDateTime(XmlPullParser xmlPullParser, String str, long j) throws ParserException {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Util.parseXsDateTime(attributeValue);
    }

    public static Descriptor parseDescriptor(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String parseString = parseString(xmlPullParser, "schemeIdUri", "");
        String parseString2 = parseString(xmlPullParser, "value", null);
        String parseString3 = parseString(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, str));
        return new Descriptor(parseString, parseString2, parseString3);
    }

    public static int parseDolbyAC4ChannelConfiguration(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null || attributeValue.length() != 6) {
            return -1;
        }
        int parseInt = Integer.parseInt(attributeValue, 16);
        return (8388608 & parseInt) != 0 ? parseDolbyAc4ObjectBasedChannelConfiguration(str) : parseDolbyAc4ChannelBasedChannelConfiguration(parseInt);
    }

    private static int parseDolbyAc4ChannelBasedChannelConfiguration(int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = DOLBY_AC4_CHANNEL_CONFIGURATION_MAPPING;
            if (i2 >= iArr.length) {
                break;
            }
            i3 += ((i >> i2) & 1) * iArr[i2];
            i2++;
        }
        if (i3 == 0) {
            return -1;
        }
        return i3;
    }

    private static int parseDolbyAc4ObjectBasedChannelConfiguration(String str) {
        String[] splitCodecs = Util.splitCodecs(str);
        if (splitCodecs.length == 0) {
            return -1;
        }
        List<String> b = q.a('.').b(c.b(splitCodecs[0].trim()));
        if (b.size() != 4 || !b.get(0).equals("ac-4")) {
            return -1;
        }
        String str2 = b.get(3);
        str2.getClass();
        if (str2.equals("03")) {
            return 18;
        }
        return !str2.equals("04") ? -1 : 21;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int parseDolbyChannelConfiguration(XmlPullParser xmlPullParser) {
        char c;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null) {
            return -1;
        }
        String b = c.b(attributeValue);
        b.getClass();
        switch (b.hashCode()) {
            case 1596796:
                if (b.equals("4000")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 2937391:
                if (b.equals("a000")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3094034:
                if (b.equals("f800")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3094035:
                if (b.equals("f801")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3133436:
                if (b.equals("fa01")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
        }
        return -1;
    }

    public static int parseDtsChannelConfiguration(XmlPullParser xmlPullParser) {
        int parseInt = parseInt(xmlPullParser, "value", -1);
        if (parseInt <= 0 || parseInt >= 33) {
            return -1;
        }
        return parseInt;
    }

    public static int parseDtsxChannelConfiguration(XmlPullParser xmlPullParser) {
        int bitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null || (bitCount = Integer.bitCount(Integer.parseInt(attributeValue, 16))) == 0) {
            return -1;
        }
        return bitCount;
    }

    public static long parseDuration(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Util.parseXsDuration(attributeValue);
    }

    public static String parseEac3SupplementalProperties(List<Descriptor> list) {
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = list.get(i);
            String str = descriptor.schemeIdUri;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(descriptor.value)) {
                return "audio/eac3-joc";
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(descriptor.value)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    public static float parseFloat(XmlPullParser xmlPullParser, String str, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? f : Float.parseFloat(attributeValue);
    }

    public static float parseFrameRate(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = FRAME_RATE_PATTERN.matcher(attributeValue);
            if (matcher.matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                return !TextUtils.isEmpty(matcher.group(2)) ? parseInt / Integer.parseInt(r2) : parseInt;
            }
        }
        return f;
    }

    public static int parseInt(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    public static long parseLastSegmentNumberSupplementalProperty(List<Descriptor> list) {
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = list.get(i);
            if (c.a("http://dashif.org/guidelines/last-segment-number", descriptor.schemeIdUri)) {
                return Long.parseLong(descriptor.value);
            }
        }
        return -1L;
    }

    public static long parseLong(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    public static int parseMpegChannelConfiguration(XmlPullParser xmlPullParser) {
        int parseInt = parseInt(xmlPullParser, "value", -1);
        if (parseInt >= 0) {
            int[] iArr = MPEG_CHANNEL_CONFIGURATION_MAPPING;
            if (parseInt < iArr.length) {
                return iArr[parseInt];
            }
        }
        return -1;
    }

    public static String parseString(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    public static String parseText(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String str2 = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, str));
        return str2;
    }

    public AdaptationSet buildAdaptationSet(long j, int i, List<Representation> list, List<Descriptor> list2, List<Descriptor> list3, List<Descriptor> list4) {
        return new AdaptationSet(j, i, list, list2, list3, list4);
    }

    public EventMessage buildEvent(String str, String str2, long j, long j2, byte[] bArr) {
        return new EventMessage(str, str2, j2, j, bArr);
    }

    public EventStream buildEventStream(String str, String str2, long j, long[] jArr, EventMessage[] eventMessageArr) {
        return new EventStream(str, str2, j, jArr, eventMessageArr);
    }

    public Format buildFormat(@Nullable String str, @Nullable String str2, int i, int i2, float f, int i3, int i4, int i5, @Nullable String str3, List<Descriptor> list, List<Descriptor> list2, @Nullable String str4, @Nullable String str5, @Nullable String str6, List<Descriptor> list3, List<Descriptor> list4) {
        String str7 = str5;
        String str8 = str4;
        String sampleMimeType = getSampleMimeType(str2, str8);
        if ("audio/eac3".equals(sampleMimeType)) {
            sampleMimeType = parseEac3SupplementalProperties(list4);
            if ("audio/eac3-joc".equals(sampleMimeType)) {
                str8 = "ec+3";
            }
        }
        if (MimeTypes.isDolbyVisionCodec(str8, str7)) {
            if (str7 == null) {
                str7 = str8;
            }
            sampleMimeType = "video/dolby-vision";
            str8 = str7;
        }
        int parseSelectionFlagsFromRoleDescriptors = parseSelectionFlagsFromRoleDescriptors(list);
        int parseRoleFlagsFromRoleDescriptors = parseRoleFlagsFromRoleDescriptors(list) | parseRoleFlagsFromAccessibilityDescriptors(list2) | parseRoleFlagsFromProperties(list3) | parseRoleFlagsFromProperties(list4);
        Pair<Integer, Integer> parseTileCountFromProperties = parseTileCountFromProperties(list3);
        Format.Builder language = new Format.Builder().setId(str).setContainerMimeType(str2).setSampleMimeType(sampleMimeType).setCodecs(str8).setPeakBitrate(i5).setSelectionFlags(parseSelectionFlagsFromRoleDescriptors).setRoleFlags(parseRoleFlagsFromRoleDescriptors).setLanguage(str3);
        int i6 = -1;
        Format.Builder tileCountVertical = language.setTileCountHorizontal(parseTileCountFromProperties != null ? ((Integer) parseTileCountFromProperties.first).intValue() : -1).setTileCountVertical(parseTileCountFromProperties != null ? ((Integer) parseTileCountFromProperties.second).intValue() : -1);
        if (MimeTypes.isVideo(sampleMimeType)) {
            tileCountVertical.setWidth(i).setHeight(i2).setFrameRate(f);
        } else if (MimeTypes.isAudio(sampleMimeType)) {
            tileCountVertical.setChannelCount(i3).setSampleRate(i4);
        } else if (MimeTypes.isText(sampleMimeType)) {
            if ("application/cea-608".equals(sampleMimeType)) {
                i6 = parseCea608AccessibilityChannel(list2);
            } else if ("application/cea-708".equals(sampleMimeType)) {
                i6 = parseCea708AccessibilityChannel(list2);
            }
            tileCountVertical.setAccessibilityChannel(i6);
        } else if (MimeTypes.isImage(sampleMimeType)) {
            tileCountVertical.setWidth(i).setHeight(i2);
        }
        return tileCountVertical.build();
    }

    public DashManifest buildMediaPresentationDescription(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, @Nullable ProgramInformation programInformation, @Nullable UtcTimingElement utcTimingElement, @Nullable ServiceDescriptionElement serviceDescriptionElement, @Nullable Uri uri, List<Period> list) {
        return new DashManifest(j, j2, j3, z, j4, j5, j6, j7, programInformation, utcTimingElement, serviceDescriptionElement, uri, list);
    }

    public Period buildPeriod(@Nullable String str, long j, List<AdaptationSet> list, List<EventStream> list2, @Nullable Descriptor descriptor) {
        return new Period(str, j, list, list2, descriptor);
    }

    public RangedUri buildRangedUri(String str, long j, long j2) {
        return new RangedUri(str, j, j2);
    }

    public Representation buildRepresentation(RepresentationInfo representationInfo, @Nullable String str, List<Label> list, @Nullable String str2, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<Descriptor> arrayList2) {
        Format.Builder buildUpon = representationInfo.format.buildUpon();
        if (str == null || !list.isEmpty()) {
            buildUpon.setLabels(list);
        } else {
            buildUpon.setLabel(str);
        }
        String str3 = representationInfo.drmSchemeType;
        if (str3 == null) {
            str3 = str2;
        }
        ArrayList<DrmInitData.SchemeData> arrayList3 = representationInfo.drmSchemeDatas;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            fillInClearKeyInformation(arrayList3);
            filterRedundantIncompleteSchemeDatas(arrayList3);
            buildUpon.setDrmInitData(new DrmInitData(str3, arrayList3));
        }
        ArrayList<Descriptor> arrayList4 = representationInfo.inbandEventStreams;
        arrayList4.addAll(arrayList2);
        return Representation.newInstance(representationInfo.revisionId, buildUpon.build(), representationInfo.baseUrls, representationInfo.segmentBase, arrayList4, representationInfo.essentialProperties, representationInfo.supplementalProperties, null);
    }

    public SegmentBase.SegmentList buildSegmentList(RangedUri rangedUri, long j, long j2, long j3, long j4, @Nullable List<SegmentBase.SegmentTimelineElement> list, long j5, @Nullable List<RangedUri> list2, long j6, long j7) {
        return new SegmentBase.SegmentList(rangedUri, j, j2, j3, j4, list, j5, list2, Util.msToUs(j6), Util.msToUs(j7));
    }

    public SegmentBase.SegmentTemplate buildSegmentTemplate(RangedUri rangedUri, long j, long j2, long j3, long j4, long j5, List<SegmentBase.SegmentTimelineElement> list, long j6, @Nullable UrlTemplate urlTemplate, @Nullable UrlTemplate urlTemplate2, long j7, long j8) {
        return new SegmentBase.SegmentTemplate(rangedUri, j, j2, j3, j4, j5, list, j6, urlTemplate, urlTemplate2, Util.msToUs(j7), Util.msToUs(j8));
    }

    public SegmentBase.SegmentTimelineElement buildSegmentTimelineElement(long j, long j2) {
        return new SegmentBase.SegmentTimelineElement(j, j2);
    }

    public SegmentBase.SingleSegmentBase buildSingleSegmentBase(RangedUri rangedUri, long j, long j2, long j3, long j4) {
        return new SegmentBase.SingleSegmentBase(rangedUri, j, j2, j3, j4);
    }

    public UtcTimingElement buildUtcTimingElement(String str, String str2) {
        return new UtcTimingElement(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x03cc A[LOOP:0: B:2:0x00a3->B:10:0x03cc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x037c A[EDGE_INSN: B:11:0x037c->B:12:0x037c BREAK  A[LOOP:0: B:2:0x00a3->B:10:0x03cc], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r45v0, types: [androidx.media3.exoplayer.dash.manifest.DashManifestParser] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AdaptationSet parseAdaptationSet(XmlPullParser xmlPullParser, List<BaseUrl> list, @Nullable SegmentBase segmentBase, long j, long j2, long j3, long j4, long j5, boolean z) throws XmlPullParserException, IOException {
        ArrayList arrayList;
        String str;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        String str2;
        int i;
        int i2;
        int i3;
        long j6;
        ArrayList arrayList6;
        SegmentBase segmentBase2;
        List<BaseUrl> list2;
        ArrayList arrayList7;
        String str3;
        long j7;
        int i4;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        ArrayList arrayList11;
        List<BaseUrl> list3;
        ArrayList arrayList12;
        SegmentBase segmentBase3;
        ArrayList arrayList13;
        XmlPullParser xmlPullParser2;
        DashManifestParser dashManifestParser;
        int i5;
        int i6;
        long j8;
        ArrayList arrayList14;
        String str4;
        int i7;
        String str5;
        float f;
        long j9;
        String str6;
        long j10;
        boolean z2;
        String str7;
        long j11;
        DashManifestParser dashManifestParser2 = this;
        XmlPullParser xmlPullParser3 = xmlPullParser;
        long parseLong = parseLong(xmlPullParser3, "id", -1L);
        int parseContentType = parseContentType(xmlPullParser);
        String attributeValue = xmlPullParser3.getAttributeValue(null, "mimeType");
        String attributeValue2 = xmlPullParser3.getAttributeValue(null, "codecs");
        String attributeValue3 = xmlPullParser3.getAttributeValue(null, "scte214:supplementalCodecs");
        String attributeValue4 = xmlPullParser3.getAttributeValue(null, "scte214:supplementalProfiles");
        int parseInt = parseInt(xmlPullParser3, "width", -1);
        int parseInt2 = parseInt(xmlPullParser3, "height", -1);
        float parseFrameRate = parseFrameRate(xmlPullParser3, -1.0f);
        int parseInt3 = parseInt(xmlPullParser3, "audioSamplingRate", -1);
        String str8 = "lang";
        String attributeValue5 = xmlPullParser3.getAttributeValue(null, "lang");
        String attributeValue6 = xmlPullParser3.getAttributeValue(null, Constants.ScionAnalytics.PARAM_LABEL);
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        ArrayList arrayList17 = new ArrayList();
        ArrayList arrayList18 = arrayList15;
        ArrayList arrayList19 = new ArrayList();
        ArrayList arrayList20 = new ArrayList();
        ArrayList arrayList21 = new ArrayList();
        ArrayList arrayList22 = arrayList17;
        ArrayList arrayList23 = new ArrayList();
        String str9 = attributeValue;
        ArrayList arrayList24 = new ArrayList();
        long j12 = j3;
        String str10 = attributeValue4;
        int i8 = parseInt;
        int i9 = parseInt2;
        float f2 = parseFrameRate;
        int i10 = parseContentType;
        String str11 = attributeValue5;
        boolean z3 = false;
        int i11 = -1;
        String str12 = null;
        SegmentBase segmentBase4 = segmentBase;
        String str13 = attributeValue3;
        long j13 = j2;
        ?? r3 = new ArrayList();
        while (true) {
            xmlPullParser3.next();
            int i12 = i11;
            if (XmlPullParserUtil.isStartTag(xmlPullParser3, "BaseURL")) {
                if (!z3) {
                    j13 = dashManifestParser2.parseAvailabilityTimeOffsetUs(xmlPullParser3, j13);
                    z3 = true;
                }
                r3.addAll(dashManifestParser2.parseBaseUrl(xmlPullParser3, list, z));
                ArrayList arrayList25 = arrayList18;
                arrayList5 = arrayList21;
                arrayList11 = arrayList25;
                i11 = i12;
                j13 = j13;
                list2 = r3;
                arrayList6 = arrayList16;
                str = str8;
                arrayList2 = arrayList19;
                segmentBase2 = segmentBase4;
                arrayList8 = arrayList24;
                arrayList9 = arrayList23;
                i = parseInt3;
                arrayList7 = arrayList20;
                arrayList10 = arrayList22;
            } else {
                long j14 = j13;
                if (XmlPullParserUtil.isStartTag(xmlPullParser3, "ContentProtection")) {
                    Pair<String, DrmInitData.SchemeData> parseContentProtection = parseContentProtection(xmlPullParser);
                    arrayList = r3;
                    Object obj = parseContentProtection.first;
                    if (obj != null) {
                        str12 = (String) obj;
                    }
                    Object obj2 = parseContentProtection.second;
                    if (obj2 != null) {
                        arrayList16.add((DrmInitData.SchemeData) obj2);
                    }
                    ArrayList arrayList26 = arrayList18;
                    arrayList5 = arrayList21;
                    arrayList11 = arrayList26;
                    i11 = i12;
                    arrayList9 = arrayList23;
                    str = str8;
                    arrayList2 = arrayList19;
                    arrayList10 = arrayList22;
                    arrayList8 = arrayList24;
                    j13 = j14;
                    arrayList6 = arrayList16;
                    i = parseInt3;
                    segmentBase2 = segmentBase4;
                } else {
                    arrayList = r3;
                    if (XmlPullParserUtil.isStartTag(xmlPullParser3, "ContentComponent")) {
                        String checkLanguageConsistency = checkLanguageConsistency(str11, xmlPullParser3.getAttributeValue(null, str8));
                        i10 = checkContentTypeConsistency(i10, parseContentType(xmlPullParser));
                        ArrayList arrayList27 = arrayList18;
                        arrayList5 = arrayList21;
                        arrayList11 = arrayList27;
                        i11 = i12;
                        str11 = checkLanguageConsistency;
                    } else {
                        if (XmlPullParserUtil.isStartTag(xmlPullParser3, "Role")) {
                            arrayList20.add(parseDescriptor(xmlPullParser3, "Role"));
                        } else if (XmlPullParserUtil.isStartTag(xmlPullParser3, "AudioChannelConfiguration")) {
                            ArrayList arrayList28 = arrayList18;
                            arrayList5 = arrayList21;
                            arrayList11 = arrayList28;
                            i11 = dashManifestParser2.parseAudioChannelConfiguration(xmlPullParser3, attributeValue2);
                        } else if (XmlPullParserUtil.isStartTag(xmlPullParser3, "Accessibility")) {
                            arrayList19.add(parseDescriptor(xmlPullParser3, "Accessibility"));
                        } else if (XmlPullParserUtil.isStartTag(xmlPullParser3, "EssentialProperty")) {
                            arrayList21.add(parseDescriptor(xmlPullParser3, "EssentialProperty"));
                        } else if (XmlPullParserUtil.isStartTag(xmlPullParser3, "SupplementalProperty")) {
                            arrayList23.add(parseDescriptor(xmlPullParser3, "SupplementalProperty"));
                        } else {
                            if (XmlPullParserUtil.isStartTag(xmlPullParser3, "Representation")) {
                                if (arrayList.isEmpty()) {
                                    list3 = list;
                                    arrayList3 = arrayList18;
                                    arrayList12 = arrayList24;
                                    segmentBase3 = segmentBase4;
                                    arrayList13 = arrayList23;
                                    xmlPullParser2 = xmlPullParser3;
                                    dashManifestParser = dashManifestParser2;
                                    i5 = i10;
                                    i6 = i8;
                                    j8 = j14;
                                    list2 = arrayList;
                                    arrayList14 = arrayList21;
                                    str = str8;
                                    str4 = str10;
                                    arrayList4 = arrayList22;
                                    i7 = i9;
                                    i11 = i12;
                                    str5 = str11;
                                    f = f2;
                                    j9 = j5;
                                    arrayList6 = arrayList16;
                                    str6 = str9;
                                    j10 = j;
                                    z2 = z;
                                    str7 = str13;
                                    j11 = j4;
                                } else {
                                    arrayList3 = arrayList18;
                                    arrayList12 = arrayList24;
                                    list3 = arrayList;
                                    segmentBase3 = segmentBase4;
                                    arrayList13 = arrayList23;
                                    xmlPullParser2 = xmlPullParser3;
                                    dashManifestParser = dashManifestParser2;
                                    i5 = i10;
                                    i6 = i8;
                                    j8 = j14;
                                    list2 = list3;
                                    i11 = i12;
                                    arrayList14 = arrayList21;
                                    str = str8;
                                    str4 = str10;
                                    arrayList4 = arrayList22;
                                    i7 = i9;
                                    z2 = z;
                                    str5 = str11;
                                    str7 = str13;
                                    f = f2;
                                    j11 = j4;
                                    j9 = j5;
                                    arrayList6 = arrayList16;
                                    str6 = str9;
                                    j10 = j;
                                }
                                RepresentationInfo parseRepresentation = dashManifestParser.parseRepresentation(xmlPullParser2, list3, str6, attributeValue2, str7, str4, i6, i7, f, i11, parseInt3, str5, arrayList20, arrayList19, arrayList14, arrayList13, segmentBase3, j11, j10, j8, j12, j9, z2);
                                str9 = str6;
                                str13 = str7;
                                str10 = str4;
                                i9 = i7;
                                f2 = f;
                                String str14 = str5;
                                ArrayList arrayList29 = arrayList13;
                                segmentBase2 = segmentBase3;
                                arrayList7 = arrayList20;
                                arrayList5 = arrayList14;
                                str3 = attributeValue2;
                                arrayList2 = arrayList19;
                                i = parseInt3;
                                i8 = i6;
                                i3 = checkContentTypeConsistency(i5, MimeTypes.getTrackType(parseRepresentation.format.sampleMimeType));
                                ArrayList arrayList30 = arrayList12;
                                arrayList30.add(parseRepresentation);
                                xmlPullParser3 = xmlPullParser2;
                                j13 = j8;
                                arrayList8 = arrayList30;
                                arrayList9 = arrayList29;
                                str11 = str14;
                            } else {
                                str = str8;
                                arrayList2 = arrayList19;
                                arrayList3 = arrayList18;
                                arrayList4 = arrayList22;
                                ArrayList arrayList31 = arrayList23;
                                arrayList5 = arrayList21;
                                str2 = str11;
                                i = parseInt3;
                                ArrayList arrayList32 = arrayList24;
                                i2 = i12;
                                XmlPullParser xmlPullParser4 = xmlPullParser3;
                                DashManifestParser dashManifestParser3 = dashManifestParser2;
                                i3 = i10;
                                j6 = j14;
                                arrayList6 = arrayList16;
                                segmentBase2 = segmentBase4;
                                list2 = arrayList;
                                arrayList7 = arrayList20;
                                str3 = attributeValue2;
                                j7 = j12;
                                if (XmlPullParserUtil.isStartTag(xmlPullParser4, "SegmentBase")) {
                                    SegmentBase.SingleSegmentBase parseSegmentBase = dashManifestParser3.parseSegmentBase(xmlPullParser4, (SegmentBase.SingleSegmentBase) segmentBase2);
                                    xmlPullParser3 = xmlPullParser4;
                                    segmentBase2 = parseSegmentBase;
                                    j12 = j7;
                                    j13 = j6;
                                    arrayList8 = arrayList32;
                                    arrayList9 = arrayList31;
                                    str11 = str2;
                                    i11 = i2;
                                } else if (XmlPullParserUtil.isStartTag(xmlPullParser4, "SegmentList")) {
                                    long parseAvailabilityTimeOffsetUs = dashManifestParser3.parseAvailabilityTimeOffsetUs(xmlPullParser4, j7);
                                    arrayList8 = arrayList32;
                                    xmlPullParser3 = xmlPullParser;
                                    segmentBase2 = dashManifestParser3.parseSegmentList(xmlPullParser3, (SegmentBase.SegmentList) segmentBase2, j4, j, j6, parseAvailabilityTimeOffsetUs, j5);
                                    j13 = j6;
                                    arrayList9 = arrayList31;
                                    i11 = i2;
                                    i10 = i3;
                                    arrayList10 = arrayList4;
                                    j12 = parseAvailabilityTimeOffsetUs;
                                    str11 = str2;
                                    arrayList11 = arrayList3;
                                    if (!XmlPullParserUtil.isEndTag(xmlPullParser3, "AdaptationSet")) {
                                        break;
                                    }
                                    ArrayList arrayList33 = arrayList5;
                                    arrayList18 = arrayList11;
                                    arrayList21 = arrayList33;
                                    dashManifestParser2 = this;
                                    arrayList24 = arrayList8;
                                    arrayList22 = arrayList10;
                                    arrayList23 = arrayList9;
                                    attributeValue2 = str3;
                                    parseInt3 = i;
                                    arrayList19 = arrayList2;
                                    arrayList20 = arrayList7;
                                    r3 = list2;
                                    str8 = str;
                                    segmentBase4 = segmentBase2;
                                    arrayList16 = arrayList6;
                                } else {
                                    i4 = i3;
                                    xmlPullParser3 = xmlPullParser4;
                                    arrayList8 = arrayList32;
                                    if (XmlPullParserUtil.isStartTag(xmlPullParser3, "SegmentTemplate")) {
                                        long parseAvailabilityTimeOffsetUs2 = dashManifestParser3.parseAvailabilityTimeOffsetUs(xmlPullParser3, j7);
                                        arrayList9 = arrayList31;
                                        segmentBase2 = dashManifestParser3.parseSegmentTemplate(xmlPullParser3, (SegmentBase.SegmentTemplate) segmentBase2, arrayList9, j4, j, j6, parseAvailabilityTimeOffsetUs2, j5);
                                        j13 = j6;
                                        i10 = i4;
                                        arrayList11 = arrayList3;
                                        arrayList10 = arrayList4;
                                        j12 = parseAvailabilityTimeOffsetUs2;
                                        str11 = str2;
                                        i11 = i2;
                                        if (!XmlPullParserUtil.isEndTag(xmlPullParser3, "AdaptationSet")) {
                                        }
                                    } else {
                                        arrayList9 = arrayList31;
                                        if (XmlPullParserUtil.isStartTag(xmlPullParser3, "InbandEventStream")) {
                                            arrayList10 = arrayList4;
                                            arrayList10.add(parseDescriptor(xmlPullParser3, "InbandEventStream"));
                                            arrayList11 = arrayList3;
                                        } else {
                                            arrayList10 = arrayList4;
                                            if (XmlPullParserUtil.isStartTag(xmlPullParser3, "Label")) {
                                                arrayList11 = arrayList3;
                                                arrayList11.add(parseLabel(xmlPullParser));
                                            } else {
                                                arrayList11 = arrayList3;
                                                if (XmlPullParserUtil.isStartTag(xmlPullParser3)) {
                                                    parseAdaptationSetChild(xmlPullParser);
                                                }
                                            }
                                        }
                                        i10 = i4;
                                        j12 = j7;
                                        j13 = j6;
                                        str11 = str2;
                                        i11 = i2;
                                        if (!XmlPullParserUtil.isEndTag(xmlPullParser3, "AdaptationSet")) {
                                        }
                                    }
                                }
                            }
                            arrayList11 = arrayList3;
                            arrayList10 = arrayList4;
                            i10 = i3;
                            if (!XmlPullParserUtil.isEndTag(xmlPullParser3, "AdaptationSet")) {
                            }
                        }
                        arrayList6 = arrayList16;
                        segmentBase2 = segmentBase4;
                        arrayList7 = arrayList20;
                        str3 = attributeValue2;
                        j7 = j12;
                        i4 = i10;
                        j6 = j14;
                        ArrayList arrayList34 = arrayList18;
                        arrayList5 = arrayList21;
                        arrayList11 = arrayList34;
                        str = str8;
                        arrayList2 = arrayList19;
                        arrayList8 = arrayList24;
                        list2 = arrayList;
                        i2 = i12;
                        arrayList9 = arrayList23;
                        i = parseInt3;
                        arrayList10 = arrayList22;
                        str2 = str11;
                        i10 = i4;
                        j12 = j7;
                        j13 = j6;
                        str11 = str2;
                        i11 = i2;
                        if (!XmlPullParserUtil.isEndTag(xmlPullParser3, "AdaptationSet")) {
                        }
                    }
                    str = str8;
                    arrayList2 = arrayList19;
                    arrayList8 = arrayList24;
                    j13 = j14;
                    arrayList9 = arrayList23;
                    arrayList6 = arrayList16;
                    i = parseInt3;
                    segmentBase2 = segmentBase4;
                    arrayList10 = arrayList22;
                }
                list2 = arrayList;
                arrayList7 = arrayList20;
            }
            str3 = attributeValue2;
            if (!XmlPullParserUtil.isEndTag(xmlPullParser3, "AdaptationSet")) {
            }
        }
        ArrayList arrayList35 = new ArrayList(arrayList8.size());
        int i13 = 0;
        while (i13 < arrayList8.size()) {
            ArrayList arrayList36 = arrayList10;
            ArrayList arrayList37 = arrayList11;
            String str15 = attributeValue6;
            arrayList35.add(buildRepresentation((RepresentationInfo) arrayList8.get(i13), str15, arrayList37, str12, arrayList6, arrayList36));
            i13++;
            attributeValue6 = str15;
            arrayList10 = arrayList36;
            arrayList11 = arrayList37;
        }
        return buildAdaptationSet(parseLong, i10, arrayList35, arrayList2, arrayList5, arrayList9);
    }

    public void parseAdaptationSetChild(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        maybeSkipTag(xmlPullParser);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public int parseAudioChannelConfiguration(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        char c;
        String parseString = parseString(xmlPullParser, "schemeIdUri", null);
        parseString.getClass();
        int i = -1;
        switch (parseString.hashCode()) {
            case -2128649360:
                if (parseString.equals("urn:dts:dash:audio_channel_configuration:2012")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -2060825028:
                if (parseString.equals("tag:dolby.com,2015:dash:audio_channel_configuration:2015")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1352850286:
                if (parseString.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1138141449:
                if (parseString.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -986633423:
                if (parseString.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -79006963:
                if (parseString.equals("tag:dts.com,2014:dash:audio_channel_configuration:2012")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 312179081:
                if (parseString.equals("tag:dts.com,2018:uhd:audio_channel_configuration")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 2036691300:
                if (parseString.equals("urn:dolby:dash:audio_channel_configuration:2011")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 5:
                i = parseDtsChannelConfiguration(xmlPullParser);
                break;
            case 1:
                i = parseDolbyAC4ChannelConfiguration(xmlPullParser, str);
                break;
            case 2:
                i = parseInt(xmlPullParser, "value", -1);
                break;
            case 3:
            case 7:
                i = parseDolbyChannelConfiguration(xmlPullParser);
                break;
            case 4:
                i = parseMpegChannelConfiguration(xmlPullParser);
                break;
            case 6:
                i = parseDtsxChannelConfiguration(xmlPullParser);
                break;
        }
        do {
            xmlPullParser.next();
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "AudioChannelConfiguration"));
        return i;
    }

    public long parseAvailabilityTimeOffsetUs(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public List<BaseUrl> parseBaseUrl(XmlPullParser xmlPullParser, List<BaseUrl> list, boolean z) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : z ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int parseInt2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String parseText = parseText(xmlPullParser, "BaseURL");
        if (UriUtil.isAbsolute(parseText)) {
            if (attributeValue3 == null) {
                attributeValue3 = parseText;
            }
            return S.a(new BaseUrl(parseText, attributeValue3, parseInt, parseInt2));
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            BaseUrl baseUrl = list.get(i);
            String resolve = UriUtil.resolve(baseUrl.url, parseText);
            String str = attributeValue3 == null ? resolve : attributeValue3;
            if (z) {
                parseInt = baseUrl.priority;
                parseInt2 = baseUrl.weight;
                str = baseUrl.serviceLocation;
            }
            arrayList.add(new BaseUrl(resolve, str, parseInt, parseInt2));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012b  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.UUID] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Pair<String, DrmInitData.SchemeData> parseContentProtection(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String str;
        ?? r4;
        String str2;
        String str3;
        ?? r5;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue != null) {
            String b = c.b(attributeValue);
            b.getClass();
            switch (b) {
                case "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e":
                    r4 = C.CLEARKEY_UUID;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r5 = str2;
                    break;
                case "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95":
                    r4 = C.PLAYREADY_UUID;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r5 = str2;
                    break;
                case "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed":
                    r4 = C.WIDEVINE_UUID;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r5 = str2;
                    break;
                case "urn:mpeg:dash:mp4protection:2011":
                    str = xmlPullParser.getAttributeValue(null, "value");
                    String attributeValueIgnorePrefix = XmlPullParserUtil.getAttributeValueIgnorePrefix(xmlPullParser, "default_KID");
                    if (!TextUtils.isEmpty(attributeValueIgnorePrefix) && !"00000000-0000-0000-0000-000000000000".equals(attributeValueIgnorePrefix)) {
                        String[] split = attributeValueIgnorePrefix.split("\\s+");
                        UUID[] uuidArr = new UUID[split.length];
                        for (int i = 0; i < split.length; i++) {
                            uuidArr[i] = UUID.fromString(split[i]);
                        }
                        r4 = C.COMMON_PSSH_UUID;
                        str3 = null;
                        r5 = PsshAtomUtil.buildPsshAtom(r4, uuidArr, null);
                        break;
                    } else {
                        Log.w(TAG, "Ignoring <ContentProtection> with schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" (ClearKey) due to missing required default_KID attribute.");
                        r4 = null;
                        str2 = r4;
                        str3 = str2;
                        r5 = str2;
                        break;
                    }
                    break;
            }
            do {
                xmlPullParser.next();
                if ((!XmlPullParserUtil.isStartTag(xmlPullParser, "clearkey:Laurl") || XmlPullParserUtil.isStartTag(xmlPullParser, "dashif:Laurl")) && xmlPullParser.next() == 4) {
                    str3 = xmlPullParser.getText();
                    r5 = r5;
                } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "ms:laurl")) {
                    str3 = xmlPullParser.getAttributeValue(null, "licenseUrl");
                    r5 = r5;
                } else if (r5 == 0 && XmlPullParserUtil.isStartTagIgnorePrefix(xmlPullParser, "pssh") && xmlPullParser.next() == 4) {
                    byte[] decode = Base64.decode(xmlPullParser.getText(), 0);
                    UUID parseUuid = PsshAtomUtil.parseUuid(decode);
                    if (parseUuid == null) {
                        Log.w(TAG, "Skipping malformed cenc:pssh data");
                        r4 = parseUuid;
                        r5 = 0;
                    } else {
                        r5 = decode;
                        r4 = parseUuid;
                    }
                } else {
                    if (r5 == 0) {
                        ?? r7 = C.PLAYREADY_UUID;
                        if (r7.equals(r4) && XmlPullParserUtil.isStartTag(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                            r5 = PsshAtomUtil.buildPsshAtom(r7, Base64.decode(xmlPullParser.getText(), 0));
                        }
                    }
                    maybeSkipTag(xmlPullParser);
                    r5 = r5;
                }
            } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "ContentProtection"));
            return Pair.create(str, r4 != null ? new DrmInitData.SchemeData(r4, str3, "video/mp4", r5) : null);
        }
        str = null;
        r4 = null;
        str2 = r4;
        str3 = str2;
        r5 = str2;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "clearkey:Laurl")) {
            }
            str3 = xmlPullParser.getText();
            r5 = r5;
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "ContentProtection"));
        return Pair.create(str, r4 != null ? new DrmInitData.SchemeData(r4, str3, "video/mp4", r5) : null);
    }

    public int parseContentType(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public Pair<Long, EventMessage> parseEvent(XmlPullParser xmlPullParser, String str, String str2, long j, long j2, ByteArrayOutputStream byteArrayOutputStream) throws IOException, XmlPullParserException {
        long parseLong = parseLong(xmlPullParser, "id", 0L);
        long parseLong2 = parseLong(xmlPullParser, "duration", -9223372036854775807L);
        long parseLong3 = parseLong(xmlPullParser, "presentationTime", 0L);
        long scaleLargeTimestamp = Util.scaleLargeTimestamp(parseLong2, 1000L, j);
        long scaleLargeTimestamp2 = Util.scaleLargeTimestamp(parseLong3 - j2, 1000000L, j);
        String parseString = parseString(xmlPullParser, "messageData", null);
        byte[] parseEventObject = parseEventObject(xmlPullParser, byteArrayOutputStream);
        Long valueOf = Long.valueOf(scaleLargeTimestamp2);
        if (parseString != null) {
            parseEventObject = Util.getUtf8Bytes(parseString);
        }
        return Pair.create(valueOf, buildEvent(str, str2, parseLong, scaleLargeTimestamp, parseEventObject));
    }

    public byte[] parseEventObject(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        byteArrayOutputStream.reset();
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(byteArrayOutputStream, StandardCharsets.UTF_8.name());
        xmlPullParser.nextToken();
        while (!XmlPullParserUtil.isEndTag(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    newSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    newSerializer.endDocument();
                    break;
                case 2:
                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i), xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
                    }
                    break;
                case 3:
                    newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    newSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    newSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    newSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    newSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    newSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    newSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        newSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public EventStream parseEventStream(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        long j;
        String str;
        String str2;
        XmlPullParser xmlPullParser2;
        String parseString = parseString(xmlPullParser, "schemeIdUri", "");
        String parseString2 = parseString(xmlPullParser, "value", "");
        long parseLong = parseLong(xmlPullParser, "timescale", 1L);
        long parseLong2 = parseLong(xmlPullParser, "presentationTimeOffset", 0L);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Event")) {
                j = parseLong;
                str = parseString2;
                str2 = parseString;
                xmlPullParser2 = xmlPullParser;
                arrayList.add(parseEvent(xmlPullParser2, str2, str, j, parseLong2, byteArrayOutputStream));
            } else {
                j = parseLong;
                str = parseString2;
                str2 = parseString;
                xmlPullParser2 = xmlPullParser;
                maybeSkipTag(xmlPullParser2);
            }
            if (XmlPullParserUtil.isEndTag(xmlPullParser2, "EventStream")) {
                break;
            }
            xmlPullParser = xmlPullParser2;
            parseString = str2;
            parseString2 = str;
            parseLong = j;
        }
        long[] jArr = new long[arrayList.size()];
        EventMessage[] eventMessageArr = new EventMessage[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            Pair pair = (Pair) arrayList.get(i);
            jArr[i] = ((Long) pair.first).longValue();
            eventMessageArr[i] = (EventMessage) pair.second;
        }
        return buildEventStream(str2, str, j, jArr, eventMessageArr);
    }

    public RangedUri parseInitialization(XmlPullParser xmlPullParser) {
        return parseRangedUrl(xmlPullParser, "sourceURL", SessionDescription.ATTR_RANGE);
    }

    public Label parseLabel(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return new Label(xmlPullParser.getAttributeValue(null, "lang"), parseText(xmlPullParser, "Label"));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01e0 A[LOOP:0: B:18:0x00a8->B:26:0x01e0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x019c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DashManifest parseMediaPresentationDescription(XmlPullParser xmlPullParser, Uri uri) throws XmlPullParserException, IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        long j;
        ArrayList arrayList4;
        long j2;
        ArrayList arrayList5;
        long j3;
        long j4;
        long j5;
        Throwable th;
        long j6;
        DashManifestParser dashManifestParser = this;
        boolean isDvbProfileDeclared = dashManifestParser.isDvbProfileDeclared(dashManifestParser.parseProfiles(xmlPullParser, "profiles", new String[0]));
        long parseDateTime = parseDateTime(xmlPullParser, "availabilityStartTime", -9223372036854775807L);
        long parseDuration = parseDuration(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long parseDuration2 = parseDuration(xmlPullParser, "minBufferTime", -9223372036854775807L);
        boolean equals = "dynamic".equals(xmlPullParser.getAttributeValue(null, "type"));
        long parseDuration3 = equals ? parseDuration(xmlPullParser, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long parseDuration4 = equals ? parseDuration(xmlPullParser, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long parseDuration5 = equals ? parseDuration(xmlPullParser, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        long parseDateTime2 = parseDateTime(xmlPullParser, "publishTime", -9223372036854775807L);
        long j7 = equals ? 0L : -9223372036854775807L;
        ArrayList a = S.a(new BaseUrl(uri.toString(), uri.toString(), isDvbProfileDeclared ? 1 : Integer.MIN_VALUE, 1));
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        long j8 = equals ? -9223372036854775807L : 0L;
        ArrayList arrayList8 = a;
        long j9 = j7;
        boolean z = false;
        boolean z2 = false;
        ProgramInformation programInformation = null;
        UtcTimingElement utcTimingElement = null;
        Uri uri2 = null;
        ServiceDescriptionElement serviceDescriptionElement = null;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "BaseURL")) {
                if (!z2) {
                    j9 = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser, j9);
                    z2 = true;
                }
                arrayList = arrayList8;
                arrayList2 = arrayList6;
                arrayList7.addAll(dashManifestParser.parseBaseUrl(xmlPullParser, arrayList, isDvbProfileDeclared));
            } else {
                arrayList = arrayList8;
                arrayList2 = arrayList6;
                if (XmlPullParserUtil.isStartTag(xmlPullParser, "ProgramInformation")) {
                    programInformation = parseProgramInformation(xmlPullParser);
                } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "UTCTiming")) {
                    utcTimingElement = parseUtcTiming(xmlPullParser);
                } else if (XmlPullParserUtil.isStartTag(xmlPullParser, RtspHeaders.LOCATION)) {
                    uri2 = UriUtil.resolveToUri(uri.toString(), xmlPullParser.nextText());
                } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "ServiceDescription")) {
                    serviceDescriptionElement = parseServiceDescription(xmlPullParser);
                } else {
                    if (!XmlPullParserUtil.isStartTag(xmlPullParser, "Period") || z) {
                        arrayList3 = arrayList7;
                        j = parseDuration;
                        arrayList8 = arrayList;
                        long j10 = j8;
                        long j11 = j9;
                        arrayList4 = arrayList2;
                        maybeSkipTag(xmlPullParser);
                        j8 = j10;
                        j2 = j11;
                    } else {
                        if (arrayList7.isEmpty()) {
                            arrayList3 = arrayList7;
                            arrayList5 = arrayList;
                            j3 = j8;
                            j4 = j9;
                            arrayList4 = arrayList2;
                            arrayList8 = arrayList5;
                        } else {
                            arrayList5 = arrayList7;
                            arrayList3 = arrayList5;
                            arrayList8 = arrayList;
                            j3 = j8;
                            j4 = j9;
                            arrayList4 = arrayList2;
                        }
                        Pair<Period, Long> parsePeriod = parsePeriod(xmlPullParser, arrayList5, j3, j4, parseDateTime, parseDuration4, isDvbProfileDeclared);
                        Period period = (Period) parsePeriod.first;
                        j = parseDuration;
                        if (period.startMs != -9223372036854775807L) {
                            long longValue = ((Long) parsePeriod.second).longValue();
                            j5 = longValue == -9223372036854775807L ? -9223372036854775807L : period.startMs + longValue;
                            arrayList4.add(period);
                        } else {
                            if (!equals) {
                                throw ParserException.createForMalformedManifest("Unable to determine start of period " + arrayList4.size(), null);
                            }
                            j5 = j3;
                            z = true;
                        }
                        j2 = j4;
                        j8 = j5;
                    }
                    if (XmlPullParserUtil.isEndTag(xmlPullParser, "MPD")) {
                        long j12 = parseDuration4;
                        long j13 = parseDuration2;
                        ArrayList arrayList9 = arrayList4;
                        dashManifestParser = this;
                        equals = equals;
                        parseDuration3 = parseDuration3;
                        j9 = j2;
                        arrayList6 = arrayList9;
                        arrayList7 = arrayList3;
                        parseDuration2 = j13;
                        parseDuration4 = j12;
                        parseDuration = j;
                    } else {
                        if (j == -9223372036854775807L) {
                            if (j8 != -9223372036854775807L) {
                                j6 = j8;
                                th = null;
                                if (arrayList4.isEmpty()) {
                                    return buildMediaPresentationDescription(parseDateTime, j6, parseDuration2, equals, parseDuration3, parseDuration4, parseDuration5, parseDateTime2, programInformation, utcTimingElement, serviceDescriptionElement, uri2, arrayList4);
                                }
                                throw ParserException.createForMalformedManifest("No periods found.", th);
                            }
                            if (!equals) {
                                throw ParserException.createForMalformedManifest("Unable to determine duration of static manifest.", null);
                            }
                        }
                        th = null;
                        j6 = j;
                        if (arrayList4.isEmpty()) {
                        }
                    }
                }
            }
            arrayList3 = arrayList7;
            j2 = j9;
            j = parseDuration;
            arrayList4 = arrayList2;
            arrayList8 = arrayList;
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "MPD")) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v17 */
    public Pair<Period, Long> parsePeriod(XmlPullParser xmlPullParser, List<BaseUrl> list, long j, long j2, long j3, long j4, boolean z) throws XmlPullParserException, IOException {
        List<BaseUrl> list2;
        long j5;
        SegmentBase segmentBase;
        ArrayList arrayList;
        ArrayList arrayList2;
        long j6;
        Object obj;
        long j7;
        XmlPullParser xmlPullParser2;
        long j8;
        long j9;
        SegmentBase parseSegmentTemplate;
        long j10;
        Descriptor descriptor;
        long j11;
        SegmentBase segmentBase2;
        boolean z2;
        long j12;
        List<BaseUrl> list3;
        DashManifestParser dashManifestParser = this;
        XmlPullParser xmlPullParser3 = xmlPullParser;
        String attributeValue = xmlPullParser3.getAttributeValue(null, "id");
        long parseDuration = parseDuration(xmlPullParser3, "start", j);
        long j13 = j3 != -9223372036854775807L ? j3 + parseDuration : -9223372036854775807L;
        long parseDuration2 = parseDuration(xmlPullParser3, "duration", -9223372036854775807L);
        ArrayList arrayList3 = new ArrayList();
        long j14 = -9223372036854775807L;
        ArrayList arrayList4 = new ArrayList();
        boolean z3 = false;
        Descriptor descriptor2 = null;
        long j15 = j2;
        ArrayList arrayList5 = arrayList3;
        SegmentBase segmentBase3 = null;
        long j16 = -9223372036854775807L;
        ?? r10 = new ArrayList();
        while (true) {
            xmlPullParser3.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser3, "BaseURL")) {
                if (!z3) {
                    j15 = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser3, j15);
                    z3 = true;
                }
                r10.addAll(dashManifestParser.parseBaseUrl(xmlPullParser3, list, z));
                arrayList2 = arrayList5;
                j10 = j15;
                arrayList = arrayList4;
                z2 = z3;
                j6 = j14;
                obj = null;
                j7 = parseDuration2;
                list2 = r10;
                descriptor = descriptor2;
                xmlPullParser2 = xmlPullParser3;
                segmentBase2 = segmentBase3;
                j12 = j16;
                j9 = j13;
            } else {
                ArrayList arrayList6 = arrayList5;
                if (XmlPullParserUtil.isStartTag(xmlPullParser3, "AdaptationSet")) {
                    if (r10.isEmpty()) {
                        list2 = r10;
                        list3 = list;
                    } else {
                        list3 = r10;
                        list2 = list3;
                    }
                    ArrayList arrayList7 = arrayList4;
                    long j17 = j15;
                    long j18 = j13;
                    long j19 = parseDuration2;
                    AdaptationSet parseAdaptationSet = dashManifestParser.parseAdaptationSet(xmlPullParser3, list3, segmentBase3, j19, j17, j16, j18, j4, z);
                    j13 = j18;
                    j5 = j16;
                    arrayList6.add(parseAdaptationSet);
                    segmentBase = segmentBase3;
                    j7 = j19;
                    arrayList = arrayList7;
                    obj = null;
                    xmlPullParser2 = xmlPullParser3;
                    j8 = j17;
                    arrayList2 = arrayList6;
                    j6 = -9223372036854775807L;
                } else {
                    list2 = r10;
                    ArrayList arrayList8 = arrayList4;
                    long j20 = j15;
                    j5 = j16;
                    if (XmlPullParserUtil.isStartTag(xmlPullParser3, "EventStream")) {
                        arrayList8.add(parseEventStream(xmlPullParser));
                        segmentBase = segmentBase3;
                        j7 = parseDuration2;
                        arrayList = arrayList8;
                        arrayList2 = arrayList6;
                        j6 = -9223372036854775807L;
                        obj = null;
                        xmlPullParser2 = xmlPullParser3;
                        j8 = j20;
                    } else {
                        if (XmlPullParserUtil.isStartTag(xmlPullParser3, "SegmentBase")) {
                            parseSegmentTemplate = dashManifestParser.parseSegmentBase(xmlPullParser3, null);
                            j10 = j20;
                            obj = null;
                            arrayList = arrayList8;
                            arrayList2 = arrayList6;
                            j6 = -9223372036854775807L;
                            j9 = j13;
                            j7 = parseDuration2;
                            descriptor = descriptor2;
                            xmlPullParser2 = xmlPullParser3;
                        } else if (XmlPullParserUtil.isStartTag(xmlPullParser3, "SegmentList")) {
                            long j21 = j13;
                            long j22 = parseDuration2;
                            long parseAvailabilityTimeOffsetUs = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser3, -9223372036854775807L);
                            arrayList = arrayList8;
                            arrayList2 = arrayList6;
                            j6 = -9223372036854775807L;
                            SegmentBase parseSegmentList = dashManifestParser.parseSegmentList(xmlPullParser3, null, j21, j22, j20, parseAvailabilityTimeOffsetUs, j4);
                            j10 = j20;
                            obj = null;
                            j9 = j21;
                            j7 = j22;
                            descriptor = descriptor2;
                            xmlPullParser2 = xmlPullParser3;
                            j11 = parseAvailabilityTimeOffsetUs;
                            segmentBase2 = parseSegmentList;
                            z2 = z3;
                            j12 = j11;
                        } else {
                            segmentBase = segmentBase3;
                            arrayList = arrayList8;
                            arrayList2 = arrayList6;
                            j6 = -9223372036854775807L;
                            if (XmlPullParserUtil.isStartTag(xmlPullParser3, "SegmentTemplate")) {
                                j5 = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser3, -9223372036854775807L);
                                G.b bVar = G.b;
                                obj = null;
                                parseSegmentTemplate = dashManifestParser.parseSegmentTemplate(xmlPullParser3, null, i0.e, j13, parseDuration2, j20, j5, j4);
                                j7 = parseDuration2;
                                xmlPullParser2 = xmlPullParser3;
                                j9 = j13;
                                j10 = j20;
                                descriptor = descriptor2;
                            } else {
                                obj = null;
                                j7 = parseDuration2;
                                xmlPullParser2 = xmlPullParser3;
                                j8 = j20;
                                j9 = j13;
                                if (XmlPullParserUtil.isStartTag(xmlPullParser2, "AssetIdentifier")) {
                                    descriptor2 = parseDescriptor(xmlPullParser2, "AssetIdentifier");
                                } else {
                                    maybeSkipTag(xmlPullParser2);
                                }
                                j10 = j8;
                                descriptor = descriptor2;
                                j11 = j5;
                                segmentBase2 = segmentBase;
                                z2 = z3;
                                j12 = j11;
                            }
                        }
                        j11 = j5;
                        segmentBase2 = parseSegmentTemplate;
                        z2 = z3;
                        j12 = j11;
                    }
                }
                j9 = j13;
                j10 = j8;
                descriptor = descriptor2;
                j11 = j5;
                segmentBase2 = segmentBase;
                z2 = z3;
                j12 = j11;
            }
            if (XmlPullParserUtil.isEndTag(xmlPullParser2, "Period")) {
                return Pair.create(buildPeriod(attributeValue, parseDuration, arrayList2, arrayList, descriptor), Long.valueOf(j7));
            }
            dashManifestParser = this;
            xmlPullParser3 = xmlPullParser2;
            j13 = j9;
            segmentBase3 = segmentBase2;
            j16 = j12;
            r10 = list2;
            arrayList5 = arrayList2;
            descriptor2 = descriptor;
            z3 = z2;
            parseDuration2 = j7;
            j14 = j6;
            j15 = j10;
            arrayList4 = arrayList;
        }
    }

    public String[] parseProfiles(XmlPullParser xmlPullParser, String str, String[] strArr) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? strArr : attributeValue.split(",");
    }

    public ProgramInformation parseProgramInformation(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        String str = null;
        String parseString = parseString(xmlPullParser, "moreInformationURL", null);
        String parseString2 = parseString(xmlPullParser, "lang", null);
        String str2 = null;
        String str3 = null;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Title")) {
                str = xmlPullParser.nextText();
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "Source")) {
                str2 = xmlPullParser.nextText();
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, ExifInterface.TAG_COPYRIGHT)) {
                str3 = xmlPullParser.nextText();
            } else {
                maybeSkipTag(xmlPullParser);
            }
            String str4 = str2;
            String str5 = str;
            String str6 = str3;
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "ProgramInformation")) {
                return new ProgramInformation(str5, str4, str6, parseString, parseString2);
            }
            str = str5;
            str2 = str4;
            str3 = str6;
        }
    }

    public RangedUri parseRangedUrl(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        long j2 = -1;
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j = Long.parseLong(split[0]);
            if (split.length == 2) {
                j2 = (Long.parseLong(split[1]) - j) + 1;
            }
        } else {
            j = 0;
        }
        return buildRangedUri(attributeValue, j, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0260 A[LOOP:0: B:2:0x007b->B:11:0x0260, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0205 A[EDGE_INSN: B:12:0x0205->B:13:0x0205 BREAK  A[LOOP:0: B:2:0x007b->B:11:0x0260], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RepresentationInfo parseRepresentation(XmlPullParser xmlPullParser, List<BaseUrl> list, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i, int i2, float f, int i3, int i4, @Nullable String str5, List<Descriptor> list2, List<Descriptor> list3, List<Descriptor> list4, List<Descriptor> list5, @Nullable SegmentBase segmentBase, long j, long j2, long j3, long j4, long j5, boolean z) throws XmlPullParserException, IOException {
        String str6;
        ArrayList arrayList;
        int i5;
        ArrayList arrayList2;
        XmlPullParser xmlPullParser2;
        String str7;
        ArrayList arrayList3;
        ArrayList arrayList4;
        long j6;
        String str8;
        boolean z2;
        long j7;
        int i6;
        SegmentBase segmentBase2;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        DashManifestParser dashManifestParser = this;
        XmlPullParser xmlPullParser3 = xmlPullParser;
        String attributeValue = xmlPullParser3.getAttributeValue(null, "id");
        int parseInt = parseInt(xmlPullParser3, "bandwidth", -1);
        String parseString = parseString(xmlPullParser3, "mimeType", str);
        String parseString2 = parseString(xmlPullParser3, "codecs", str2);
        String parseString3 = parseString(xmlPullParser3, "scte214:supplementalCodecs", str3);
        String parseString4 = parseString(xmlPullParser3, "scte214:supplementalProfiles", str4);
        int parseInt2 = parseInt(xmlPullParser3, "width", i);
        int parseInt3 = parseInt(xmlPullParser3, "height", i2);
        float parseFrameRate = parseFrameRate(xmlPullParser3, f);
        int parseInt4 = parseInt(xmlPullParser3, "audioSamplingRate", i4);
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList(list4);
        ArrayList arrayList11 = new ArrayList(list5);
        ArrayList arrayList12 = new ArrayList();
        int i7 = i3;
        long j8 = j4;
        String str9 = null;
        boolean z3 = false;
        SegmentBase segmentBase3 = segmentBase;
        long j9 = j3;
        while (true) {
            xmlPullParser3.next();
            ArrayList arrayList13 = arrayList8;
            if (XmlPullParserUtil.isStartTag(xmlPullParser3, "BaseURL")) {
                if (!z3) {
                    j9 = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser3, j9);
                    z3 = true;
                }
                SegmentBase segmentBase4 = segmentBase3;
                str6 = attributeValue;
                arrayList12.addAll(dashManifestParser.parseBaseUrl(xmlPullParser3, list, z));
                arrayList = arrayList13;
                xmlPullParser2 = xmlPullParser3;
                arrayList3 = arrayList10;
                arrayList4 = arrayList11;
                arrayList7 = arrayList12;
                j6 = j8;
                str7 = parseString2;
                i5 = parseInt;
                i6 = i7;
                str8 = str9;
                z2 = z3;
                segmentBase2 = segmentBase4;
            } else {
                SegmentBase segmentBase5 = segmentBase3;
                str6 = attributeValue;
                if (XmlPullParserUtil.isStartTag(xmlPullParser3, "AudioChannelConfiguration")) {
                    int parseAudioChannelConfiguration = dashManifestParser.parseAudioChannelConfiguration(xmlPullParser3, parseString2);
                    segmentBase2 = segmentBase5;
                    arrayList = arrayList13;
                    xmlPullParser2 = xmlPullParser3;
                    i6 = parseAudioChannelConfiguration;
                    arrayList3 = arrayList10;
                    arrayList4 = arrayList11;
                    arrayList7 = arrayList12;
                    j6 = j8;
                    str7 = parseString2;
                    i5 = parseInt;
                    str8 = str9;
                    z2 = z3;
                } else if (XmlPullParserUtil.isStartTag(xmlPullParser3, "SegmentBase")) {
                    SegmentBase.SingleSegmentBase parseSegmentBase = dashManifestParser.parseSegmentBase(xmlPullParser3, (SegmentBase.SingleSegmentBase) segmentBase5);
                    arrayList = arrayList13;
                    xmlPullParser2 = xmlPullParser3;
                    arrayList3 = arrayList10;
                    arrayList6 = arrayList12;
                    j6 = j8;
                    str7 = parseString2;
                    i5 = parseInt;
                    i6 = i7;
                    str8 = str9;
                    z2 = z3;
                    segmentBase2 = parseSegmentBase;
                    arrayList2 = arrayList9;
                    arrayList4 = arrayList11;
                    j7 = j9;
                    arrayList5 = arrayList6;
                    if (XmlPullParserUtil.isEndTag(xmlPullParser2, "Representation")) {
                        break;
                    }
                    int i8 = parseInt2;
                    ArrayList arrayList14 = arrayList2;
                    String str10 = parseString4;
                    parseInt2 = i8;
                    arrayList9 = arrayList14;
                    arrayList10 = arrayList3;
                    arrayList11 = arrayList4;
                    arrayList8 = arrayList;
                    segmentBase3 = segmentBase2;
                    j9 = j7;
                    j8 = j6;
                    arrayList12 = arrayList5;
                    parseString2 = str7;
                    z3 = z2;
                    str9 = str8;
                    i7 = i6;
                    parseString3 = parseString3;
                    parseString4 = str10;
                    attributeValue = str6;
                    parseInt = i5;
                    xmlPullParser3 = xmlPullParser2;
                    dashManifestParser = this;
                } else {
                    if (XmlPullParserUtil.isStartTag(xmlPullParser3, "SegmentList")) {
                        long j10 = j9;
                        long parseAvailabilityTimeOffsetUs = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser3, j8);
                        arrayList = arrayList13;
                        arrayList5 = arrayList12;
                        i5 = parseInt;
                        arrayList2 = arrayList9;
                        SegmentBase.SegmentList parseSegmentList = dashManifestParser.parseSegmentList(xmlPullParser3, (SegmentBase.SegmentList) segmentBase5, j, j2, j10, parseAvailabilityTimeOffsetUs, j5);
                        xmlPullParser2 = xmlPullParser3;
                        str7 = parseString2;
                        str8 = str9;
                        z2 = z3;
                        arrayList4 = arrayList11;
                        j7 = j10;
                        i6 = i7;
                        segmentBase2 = parseSegmentList;
                        arrayList3 = arrayList10;
                        j6 = parseAvailabilityTimeOffsetUs;
                    } else {
                        arrayList = arrayList13;
                        ArrayList arrayList15 = arrayList10;
                        ArrayList arrayList16 = arrayList11;
                        ArrayList arrayList17 = arrayList12;
                        long j11 = j9;
                        i5 = parseInt;
                        arrayList2 = arrayList9;
                        if (XmlPullParserUtil.isStartTag(xmlPullParser3, "SegmentTemplate")) {
                            long parseAvailabilityTimeOffsetUs2 = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser3, j8);
                            str7 = parseString2;
                            SegmentBase.SegmentTemplate parseSegmentTemplate = dashManifestParser.parseSegmentTemplate(xmlPullParser3, (SegmentBase.SegmentTemplate) segmentBase5, list5, j, j2, j11, parseAvailabilityTimeOffsetUs2, j5);
                            xmlPullParser2 = xmlPullParser3;
                            str8 = str9;
                            z2 = z3;
                            arrayList4 = arrayList16;
                            j7 = j11;
                            i6 = i7;
                            segmentBase2 = parseSegmentTemplate;
                            arrayList3 = arrayList15;
                            j6 = parseAvailabilityTimeOffsetUs2;
                            arrayList5 = arrayList17;
                        } else {
                            xmlPullParser2 = xmlPullParser3;
                            str7 = parseString2;
                            if (XmlPullParserUtil.isStartTag(xmlPullParser2, "ContentProtection")) {
                                Pair<String, DrmInitData.SchemeData> parseContentProtection = parseContentProtection(xmlPullParser);
                                Object obj = parseContentProtection.first;
                                if (obj != null) {
                                    str9 = (String) obj;
                                }
                                Object obj2 = parseContentProtection.second;
                                if (obj2 != null) {
                                    arrayList.add((DrmInitData.SchemeData) obj2);
                                }
                                str8 = str9;
                                z2 = z3;
                                arrayList3 = arrayList15;
                                arrayList4 = arrayList16;
                                j7 = j11;
                                j6 = j8;
                            } else {
                                if (XmlPullParserUtil.isStartTag(xmlPullParser2, "InbandEventStream")) {
                                    arrayList2.add(parseDescriptor(xmlPullParser2, "InbandEventStream"));
                                    arrayList3 = arrayList15;
                                } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "EssentialProperty")) {
                                    arrayList3 = arrayList15;
                                    arrayList3.add(parseDescriptor(xmlPullParser2, "EssentialProperty"));
                                } else {
                                    arrayList3 = arrayList15;
                                    if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SupplementalProperty")) {
                                        arrayList4 = arrayList16;
                                        arrayList4.add(parseDescriptor(xmlPullParser2, "SupplementalProperty"));
                                    } else {
                                        arrayList4 = arrayList16;
                                        maybeSkipTag(xmlPullParser2);
                                    }
                                    j6 = j8;
                                    str8 = str9;
                                    z2 = z3;
                                    j7 = j11;
                                }
                                arrayList4 = arrayList16;
                                j6 = j8;
                                str8 = str9;
                                z2 = z3;
                                j7 = j11;
                            }
                            i6 = i7;
                            segmentBase2 = segmentBase5;
                            arrayList5 = arrayList17;
                        }
                    }
                    if (XmlPullParserUtil.isEndTag(xmlPullParser2, "Representation")) {
                    }
                }
            }
            arrayList2 = arrayList9;
            arrayList6 = arrayList7;
            j7 = j9;
            arrayList5 = arrayList6;
            if (XmlPullParserUtil.isEndTag(xmlPullParser2, "Representation")) {
            }
        }
        ArrayList arrayList18 = arrayList2;
        String str11 = parseString4;
        ArrayList arrayList19 = arrayList;
        String str12 = parseString3;
        ArrayList arrayList20 = arrayList4;
        ArrayList arrayList21 = arrayList3;
        Format buildFormat = buildFormat(str6, parseString, parseInt2, parseInt3, parseFrameRate, i6, parseInt4, i5, str5, list2, list3, str7, str12, str11, arrayList21, arrayList20);
        if (segmentBase2 == null) {
            segmentBase2 = new SegmentBase.SingleSegmentBase();
        }
        boolean isEmpty = arrayList5.isEmpty();
        List<BaseUrl> list6 = arrayList5;
        if (isEmpty) {
            list6 = list;
        }
        return new RepresentationInfo(buildFormat, list6, segmentBase2, str8, arrayList19, arrayList18, arrayList21, arrayList20, -1L);
    }

    public int parseRoleFlagsFromAccessibilityDescriptors(List<Descriptor> list) {
        int parseTvaAudioPurposeCsValue;
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Descriptor descriptor = list.get(i2);
            if (c.a("urn:mpeg:dash:role:2011", descriptor.schemeIdUri)) {
                parseTvaAudioPurposeCsValue = parseRoleFlagsFromDashRoleScheme(descriptor.value);
            } else if (c.a("urn:tva:metadata:cs:AudioPurposeCS:2007", descriptor.schemeIdUri)) {
                parseTvaAudioPurposeCsValue = parseTvaAudioPurposeCsValue(descriptor.value);
            }
            i |= parseTvaAudioPurposeCsValue;
        }
        return i;
    }

    public int parseRoleFlagsFromDashRoleScheme(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    public int parseRoleFlagsFromProperties(List<Descriptor> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (c.a("http://dashif.org/guidelines/trickmode", list.get(i2).schemeIdUri)) {
                i = 16384;
            }
        }
        return i;
    }

    public int parseRoleFlagsFromRoleDescriptors(List<Descriptor> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Descriptor descriptor = list.get(i2);
            if (c.a("urn:mpeg:dash:role:2011", descriptor.schemeIdUri)) {
                i |= parseRoleFlagsFromDashRoleScheme(descriptor.value);
            }
        }
        return i;
    }

    public SegmentBase.SingleSegmentBase parseSegmentBase(XmlPullParser xmlPullParser, @Nullable SegmentBase.SingleSegmentBase singleSegmentBase) throws XmlPullParserException, IOException {
        long parseLong = parseLong(xmlPullParser, "timescale", singleSegmentBase != null ? singleSegmentBase.timescale : 1L);
        long parseLong2 = parseLong(xmlPullParser, "presentationTimeOffset", singleSegmentBase != null ? singleSegmentBase.presentationTimeOffset : 0L);
        long j = singleSegmentBase != null ? singleSegmentBase.indexStart : 0L;
        long j2 = singleSegmentBase != null ? singleSegmentBase.indexLength : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            j = Long.parseLong(split[0]);
            j2 = (Long.parseLong(split[1]) - j) + 1;
        }
        long j3 = j2;
        RangedUri rangedUri = singleSegmentBase != null ? singleSegmentBase.initialization : null;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Initialization")) {
                rangedUri = parseInitialization(xmlPullParser);
            } else {
                maybeSkipTag(xmlPullParser);
            }
            RangedUri rangedUri2 = rangedUri;
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentBase")) {
                return buildSingleSegmentBase(rangedUri2, parseLong, parseLong2, j, j3);
            }
            rangedUri = rangedUri2;
        }
    }

    public SegmentBase.SegmentList parseSegmentList(XmlPullParser xmlPullParser, @Nullable SegmentBase.SegmentList segmentList, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long j6;
        long parseLong = parseLong(xmlPullParser, "timescale", segmentList != null ? segmentList.timescale : 1L);
        long parseLong2 = parseLong(xmlPullParser, "presentationTimeOffset", segmentList != null ? segmentList.presentationTimeOffset : 0L);
        long parseLong3 = parseLong(xmlPullParser, "duration", segmentList != null ? segmentList.duration : -9223372036854775807L);
        long parseLong4 = parseLong(xmlPullParser, "startNumber", segmentList != null ? segmentList.startNumber : 1L);
        long finalAvailabilityTimeOffset = getFinalAvailabilityTimeOffset(j3, j4);
        List<RangedUri> list = null;
        RangedUri rangedUri = null;
        List<SegmentBase.SegmentTimelineElement> list2 = null;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Initialization")) {
                rangedUri = parseInitialization(xmlPullParser);
                j6 = parseLong;
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentTimeline")) {
                j6 = parseLong;
                list2 = parseSegmentTimeline(xmlPullParser, j6, j2);
            } else {
                j6 = parseLong;
                if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentURL")) {
                    if (list == null) {
                        list = new ArrayList<>();
                    }
                    list.add(parseSegmentUrl(xmlPullParser));
                } else {
                    maybeSkipTag(xmlPullParser);
                }
            }
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentList")) {
                break;
            }
            parseLong = j6;
        }
        if (segmentList != null) {
            if (rangedUri == null) {
                rangedUri = segmentList.initialization;
            }
            if (list2 == null) {
                list2 = segmentList.segmentTimeline;
            }
            if (list == null) {
                list = segmentList.mediaSegments;
            }
        }
        return buildSegmentList(rangedUri, j6, parseLong2, parseLong4, parseLong3, list2, finalAvailabilityTimeOffset, list, j5, j);
    }

    public SegmentBase.SegmentTemplate parseSegmentTemplate(XmlPullParser xmlPullParser, @Nullable SegmentBase.SegmentTemplate segmentTemplate, List<Descriptor> list, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long j6;
        DashManifestParser dashManifestParser = this;
        long parseLong = parseLong(xmlPullParser, "timescale", segmentTemplate != null ? segmentTemplate.timescale : 1L);
        long parseLong2 = parseLong(xmlPullParser, "presentationTimeOffset", segmentTemplate != null ? segmentTemplate.presentationTimeOffset : 0L);
        long parseLong3 = parseLong(xmlPullParser, "duration", segmentTemplate != null ? segmentTemplate.duration : -9223372036854775807L);
        long parseLong4 = parseLong(xmlPullParser, "startNumber", segmentTemplate != null ? segmentTemplate.startNumber : 1L);
        long parseLastSegmentNumberSupplementalProperty = parseLastSegmentNumberSupplementalProperty(list);
        long finalAvailabilityTimeOffset = getFinalAvailabilityTimeOffset(j3, j4);
        UrlTemplate parseUrlTemplate = dashManifestParser.parseUrlTemplate(xmlPullParser, "media", segmentTemplate != null ? segmentTemplate.mediaTemplate : null);
        UrlTemplate parseUrlTemplate2 = dashManifestParser.parseUrlTemplate(xmlPullParser, "initialization", segmentTemplate != null ? segmentTemplate.initializationTemplate : null);
        RangedUri rangedUri = null;
        List<SegmentBase.SegmentTimelineElement> list2 = null;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Initialization")) {
                rangedUri = parseInitialization(xmlPullParser);
                j6 = parseLong;
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentTimeline")) {
                j6 = parseLong;
                list2 = dashManifestParser.parseSegmentTimeline(xmlPullParser, j6, j2);
            } else {
                j6 = parseLong;
                maybeSkipTag(xmlPullParser);
            }
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentTemplate")) {
                break;
            }
            dashManifestParser = this;
            finalAvailabilityTimeOffset = finalAvailabilityTimeOffset;
            parseLastSegmentNumberSupplementalProperty = parseLastSegmentNumberSupplementalProperty;
            parseLong4 = parseLong4;
            parseLong2 = parseLong2;
            parseLong = j6;
        }
        if (segmentTemplate != null) {
            if (rangedUri == null) {
                rangedUri = segmentTemplate.initialization;
            }
            if (list2 == null) {
                list2 = segmentTemplate.segmentTimeline;
            }
        }
        return buildSegmentTemplate(rangedUri, j6, parseLong2, parseLong4, parseLastSegmentNumberSupplementalProperty, parseLong3, list2, finalAvailabilityTimeOffset, parseUrlTemplate2, parseUrlTemplate, j5, j);
    }

    public List<SegmentBase.SegmentTimelineElement> parseSegmentTimeline(XmlPullParser xmlPullParser, long j, long j2) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long j3 = 0;
        long j4 = -9223372036854775807L;
        boolean z = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, ExifInterface.LATITUDE_SOUTH)) {
                long parseLong = parseLong(xmlPullParser, "t", -9223372036854775807L);
                if (z) {
                    ArrayList arrayList2 = arrayList;
                    j3 = addSegmentTimelineElementsToList(arrayList2, j3, j4, i, parseLong);
                    arrayList = arrayList2;
                }
                if (parseLong != -9223372036854775807L) {
                    j3 = parseLong;
                }
                j4 = parseLong(xmlPullParser, "d", -9223372036854775807L);
                i = parseInt(xmlPullParser, "r", 0);
                z = true;
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentTimeline"));
        if (z) {
            addSegmentTimelineElementsToList(arrayList, j3, j4, i, Util.scaleLargeTimestamp(j2, j, 1000L));
        }
        return arrayList;
    }

    public RangedUri parseSegmentUrl(XmlPullParser xmlPullParser) {
        return parseRangedUrl(xmlPullParser, "media", "mediaRange");
    }

    public int parseSelectionFlagsFromDashRoleScheme(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        return (str.equals("forced_subtitle") || str.equals("forced-subtitle")) ? 2 : 0;
    }

    public int parseSelectionFlagsFromRoleDescriptors(List<Descriptor> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Descriptor descriptor = list.get(i2);
            if (c.a("urn:mpeg:dash:role:2011", descriptor.schemeIdUri)) {
                i |= parseSelectionFlagsFromDashRoleScheme(descriptor.value);
            }
        }
        return i;
    }

    public ServiceDescriptionElement parseServiceDescription(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        long j = -9223372036854775807L;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        float f = -3.4028235E38f;
        float f2 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Latency")) {
                j = parseLong(xmlPullParser, "target", -9223372036854775807L);
                j2 = parseLong(xmlPullParser, "min", -9223372036854775807L);
                j3 = parseLong(xmlPullParser, "max", -9223372036854775807L);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "PlaybackRate")) {
                f = parseFloat(xmlPullParser, "min", -3.4028235E38f);
                f2 = parseFloat(xmlPullParser, "max", -3.4028235E38f);
            }
            long j4 = j;
            long j5 = j2;
            long j6 = j3;
            float f3 = f;
            float f4 = f2;
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "ServiceDescription")) {
                return new ServiceDescriptionElement(j4, j5, j6, f3, f4);
            }
            j = j4;
            j2 = j5;
            j3 = j6;
            f = f3;
            f2 = f4;
        }
    }

    @Nullable
    public Pair<Integer, Integer> parseTileCountFromProperties(List<Descriptor> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = list.get(i);
            if ((c.a("http://dashif.org/thumbnail_tile", descriptor.schemeIdUri) || c.a("http://dashif.org/guidelines/thumbnail_tile", descriptor.schemeIdUri)) && (str = descriptor.value) != null) {
                String[] split = Util.split(str, "x");
                if (split.length != 2) {
                    continue;
                } else {
                    try {
                        return Pair.create(Integer.valueOf(Integer.parseInt(split[0])), Integer.valueOf(Integer.parseInt(split[1])));
                    } catch (NumberFormatException unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public int parseTvaAudioPurposeCsValue(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    @Nullable
    public UrlTemplate parseUrlTemplate(XmlPullParser xmlPullParser, String str, @Nullable UrlTemplate urlTemplate) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? UrlTemplate.compile(attributeValue) : urlTemplate;
    }

    public UtcTimingElement parseUtcTiming(XmlPullParser xmlPullParser) {
        return buildUtcTimingElement(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.exoplayer.upstream.ParsingLoadable.Parser
    public DashManifest parse(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser newPullParser = this.xmlParserFactory.newPullParser();
            newPullParser.setInput(inputStream, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return parseMediaPresentationDescription(newPullParser, uri);
            }
            throw ParserException.createForMalformedManifest("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e) {
            throw ParserException.createForMalformedManifest(null, e);
        }
    }
}
