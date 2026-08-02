package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.UriUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.N;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Deprecated
/* loaded from: classes4.dex */
public final class HlsPlaylistParser implements ParsingLoadable.Parser<HlsPlaylist> {
    private static final String ATTR_CLOSED_CAPTIONS_NONE = "CLOSED-CAPTIONS=NONE";
    private static final String BOOLEAN_FALSE = "NO";
    private static final String BOOLEAN_TRUE = "YES";
    private static final String KEYFORMAT_IDENTITY = "identity";
    private static final String KEYFORMAT_PLAYREADY = "com.microsoft.playready";
    private static final String KEYFORMAT_WIDEVINE_PSSH_BINARY = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed";
    private static final String KEYFORMAT_WIDEVINE_PSSH_JSON = "com.widevine";
    private static final String LOG_TAG = "HlsPlaylistParser";
    private static final String METHOD_AES_128 = "AES-128";
    private static final String METHOD_NONE = "NONE";
    private static final String METHOD_SAMPLE_AES = "SAMPLE-AES";
    private static final String METHOD_SAMPLE_AES_CENC = "SAMPLE-AES-CENC";
    private static final String METHOD_SAMPLE_AES_CTR = "SAMPLE-AES-CTR";
    private static final String PLAYLIST_HEADER = "#EXTM3U";
    private static final String TAG_BYTERANGE = "#EXT-X-BYTERANGE";
    private static final String TAG_DEFINE = "#EXT-X-DEFINE";
    private static final String TAG_DISCONTINUITY = "#EXT-X-DISCONTINUITY";
    private static final String TAG_DISCONTINUITY_SEQUENCE = "#EXT-X-DISCONTINUITY-SEQUENCE";
    private static final String TAG_ENDLIST = "#EXT-X-ENDLIST";
    private static final String TAG_GAP = "#EXT-X-GAP";
    private static final String TAG_IFRAME = "#EXT-X-I-FRAMES-ONLY";
    private static final String TAG_INDEPENDENT_SEGMENTS = "#EXT-X-INDEPENDENT-SEGMENTS";
    private static final String TAG_INIT_SEGMENT = "#EXT-X-MAP";
    private static final String TAG_I_FRAME_STREAM_INF = "#EXT-X-I-FRAME-STREAM-INF";
    private static final String TAG_KEY = "#EXT-X-KEY";
    private static final String TAG_MEDIA = "#EXT-X-MEDIA";
    private static final String TAG_MEDIA_DURATION = "#EXTINF";
    private static final String TAG_MEDIA_SEQUENCE = "#EXT-X-MEDIA-SEQUENCE";
    private static final String TAG_PART = "#EXT-X-PART";
    private static final String TAG_PART_INF = "#EXT-X-PART-INF";
    private static final String TAG_PLAYLIST_TYPE = "#EXT-X-PLAYLIST-TYPE";
    private static final String TAG_PREFIX = "#EXT";
    private static final String TAG_PRELOAD_HINT = "#EXT-X-PRELOAD-HINT";
    private static final String TAG_PROGRAM_DATE_TIME = "#EXT-X-PROGRAM-DATE-TIME";
    private static final String TAG_RENDITION_REPORT = "#EXT-X-RENDITION-REPORT";
    private static final String TAG_SERVER_CONTROL = "#EXT-X-SERVER-CONTROL";
    private static final String TAG_SESSION_KEY = "#EXT-X-SESSION-KEY";
    private static final String TAG_SKIP = "#EXT-X-SKIP";
    private static final String TAG_START = "#EXT-X-START";
    private static final String TAG_STREAM_INF = "#EXT-X-STREAM-INF";
    private static final String TAG_TARGET_DURATION = "#EXT-X-TARGETDURATION";
    private static final String TAG_VERSION = "#EXT-X-VERSION";
    private static final String TYPE_AUDIO = "AUDIO";
    private static final String TYPE_CLOSED_CAPTIONS = "CLOSED-CAPTIONS";
    private static final String TYPE_MAP = "MAP";
    private static final String TYPE_PART = "PART";
    private static final String TYPE_SUBTITLES = "SUBTITLES";
    private static final String TYPE_VIDEO = "VIDEO";
    private final HlsMultivariantPlaylist multivariantPlaylist;

    @Nullable
    private final HlsMediaPlaylist previousMediaPlaylist;
    private static final Pattern REGEX_AVERAGE_BANDWIDTH = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    private static final Pattern REGEX_VIDEO = Pattern.compile("VIDEO=\"(.+?)\"");
    private static final Pattern REGEX_AUDIO = Pattern.compile("AUDIO=\"(.+?)\"");
    private static final Pattern REGEX_SUBTITLES = Pattern.compile("SUBTITLES=\"(.+?)\"");
    private static final Pattern REGEX_CLOSED_CAPTIONS = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    private static final Pattern REGEX_BANDWIDTH = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    private static final Pattern REGEX_CHANNELS = Pattern.compile("CHANNELS=\"(.+?)\"");
    private static final Pattern REGEX_CODECS = Pattern.compile("CODECS=\"(.+?)\"");
    private static final Pattern REGEX_RESOLUTION = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    private static final Pattern REGEX_FRAME_RATE = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    private static final Pattern REGEX_TARGET_DURATION = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    private static final Pattern REGEX_ATTR_DURATION = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    private static final Pattern REGEX_PART_TARGET_DURATION = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    private static final Pattern REGEX_VERSION = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    private static final Pattern REGEX_PLAYLIST_TYPE = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    private static final Pattern REGEX_CAN_SKIP_UNTIL = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    private static final Pattern REGEX_CAN_SKIP_DATE_RANGES = compileBooleanAttrPattern("CAN-SKIP-DATERANGES");
    private static final Pattern REGEX_SKIPPED_SEGMENTS = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    private static final Pattern REGEX_HOLD_BACK = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern REGEX_PART_HOLD_BACK = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern REGEX_CAN_BLOCK_RELOAD = compileBooleanAttrPattern("CAN-BLOCK-RELOAD");
    private static final Pattern REGEX_MEDIA_SEQUENCE = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    private static final Pattern REGEX_MEDIA_DURATION = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    private static final Pattern REGEX_MEDIA_TITLE = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    private static final Pattern REGEX_LAST_MSN = Pattern.compile("LAST-MSN=(\\d+)\\b");
    private static final Pattern REGEX_LAST_PART = Pattern.compile("LAST-PART=(\\d+)\\b");
    private static final Pattern REGEX_TIME_OFFSET = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern REGEX_BYTERANGE = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern REGEX_ATTR_BYTERANGE = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final Pattern REGEX_BYTERANGE_START = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    private static final Pattern REGEX_BYTERANGE_LENGTH = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    private static final Pattern REGEX_METHOD = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    private static final Pattern REGEX_KEYFORMAT = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    private static final Pattern REGEX_KEYFORMATVERSIONS = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    private static final Pattern REGEX_URI = Pattern.compile("URI=\"(.+?)\"");
    private static final Pattern REGEX_IV = Pattern.compile("IV=([^,.*]+)");
    private static final Pattern REGEX_TYPE = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private static final Pattern REGEX_PRELOAD_HINT_TYPE = Pattern.compile("TYPE=(PART|MAP)");
    private static final Pattern REGEX_LANGUAGE = Pattern.compile("LANGUAGE=\"(.+?)\"");
    private static final Pattern REGEX_NAME = Pattern.compile("NAME=\"(.+?)\"");
    private static final Pattern REGEX_GROUP_ID = Pattern.compile("GROUP-ID=\"(.+?)\"");
    private static final Pattern REGEX_CHARACTERISTICS = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    private static final Pattern REGEX_INSTREAM_ID = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    private static final Pattern REGEX_AUTOSELECT = compileBooleanAttrPattern("AUTOSELECT");
    private static final Pattern REGEX_DEFAULT = compileBooleanAttrPattern("DEFAULT");
    private static final Pattern REGEX_FORCED = compileBooleanAttrPattern("FORCED");
    private static final Pattern REGEX_INDEPENDENT = compileBooleanAttrPattern("INDEPENDENT");
    private static final Pattern REGEX_GAP = compileBooleanAttrPattern("GAP");
    private static final Pattern REGEX_PRECISE = compileBooleanAttrPattern("PRECISE");
    private static final Pattern REGEX_VALUE = Pattern.compile("VALUE=\"(.+?)\"");
    private static final Pattern REGEX_IMPORT = Pattern.compile("IMPORT=\"(.+?)\"");
    private static final Pattern REGEX_VARIABLE_REFERENCE = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public static final class DeltaUpdateException extends IOException {
    }

    public static class LineIterator {
        private final Queue<String> extraLines;

        @Nullable
        private String next;
        private final BufferedReader reader;

        public LineIterator(Queue<String> queue, BufferedReader bufferedReader) {
            this.extraLines = queue;
            this.reader = bufferedReader;
        }

        public boolean hasNext() throws IOException {
            String trim;
            if (this.next != null) {
                return true;
            }
            if (!this.extraLines.isEmpty()) {
                this.next = (String) Assertions.checkNotNull(this.extraLines.poll());
                return true;
            }
            do {
                String readLine = this.reader.readLine();
                this.next = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.next = trim;
            } while (trim.isEmpty());
            return true;
        }

        public String next() throws IOException {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.next;
            this.next = null;
            return str;
        }
    }

    public HlsPlaylistParser() {
        this(HlsMultivariantPlaylist.EMPTY, null);
    }

    private static boolean checkPlaylistHeader(BufferedReader bufferedReader) throws IOException {
        int read = bufferedReader.read();
        if (read == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            read = bufferedReader.read();
        }
        int skipIgnorableWhitespace = skipIgnorableWhitespace(bufferedReader, true, read);
        for (int i = 0; i < 7; i++) {
            if (skipIgnorableWhitespace != PLAYLIST_HEADER.charAt(i)) {
                return false;
            }
            skipIgnorableWhitespace = bufferedReader.read();
        }
        return Util.isLinebreak(skipIgnorableWhitespace(bufferedReader, false, skipIgnorableWhitespace));
    }

    private static Pattern compileBooleanAttrPattern(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    private static DrmInitData getPlaylistProtectionSchemes(@Nullable String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i = 0; i < schemeDataArr.length; i++) {
            schemeDataArr2[i] = schemeDataArr[i].copyWithData(null);
        }
        return new DrmInitData(str, schemeDataArr2);
    }

    @Nullable
    private static String getSegmentEncryptionIV(long j, @Nullable String str, @Nullable String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j);
    }

    @Nullable
    private static HlsMultivariantPlaylist.Variant getVariantWithAudioGroup(ArrayList<HlsMultivariantPlaylist.Variant> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            HlsMultivariantPlaylist.Variant variant = arrayList.get(i);
            if (str.equals(variant.audioGroupId)) {
                return variant;
            }
        }
        return null;
    }

    @Nullable
    private static HlsMultivariantPlaylist.Variant getVariantWithSubtitleGroup(ArrayList<HlsMultivariantPlaylist.Variant> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            HlsMultivariantPlaylist.Variant variant = arrayList.get(i);
            if (str.equals(variant.subtitleGroupId)) {
                return variant;
            }
        }
        return null;
    }

    @Nullable
    private static HlsMultivariantPlaylist.Variant getVariantWithVideoGroup(ArrayList<HlsMultivariantPlaylist.Variant> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            HlsMultivariantPlaylist.Variant variant = arrayList.get(i);
            if (str.equals(variant.videoGroupId)) {
                return variant;
            }
        }
        return null;
    }

    private static double parseDoubleAttr(String str, Pattern pattern) throws ParserException {
        return Double.parseDouble(parseStringAttr(str, pattern, Collections.EMPTY_MAP));
    }

    @Nullable
    private static DrmInitData.SchemeData parseDrmSchemeData(String str, String str2, Map<String, String> map) throws ParserException {
        String parseOptionalStringAttr = parseOptionalStringAttr(str, REGEX_KEYFORMATVERSIONS, "1", map);
        if (KEYFORMAT_WIDEVINE_PSSH_BINARY.equals(str2)) {
            String parseStringAttr = parseStringAttr(str, REGEX_URI, map);
            return new DrmInitData.SchemeData(C.WIDEVINE_UUID, "video/mp4", Base64.decode(parseStringAttr.substring(parseStringAttr.indexOf(44)), 0));
        }
        if (KEYFORMAT_WIDEVINE_PSSH_JSON.equals(str2)) {
            return new DrmInitData.SchemeData(C.WIDEVINE_UUID, "hls", Util.getUtf8Bytes(str));
        }
        if (!KEYFORMAT_PLAYREADY.equals(str2) || !"1".equals(parseOptionalStringAttr)) {
            return null;
        }
        String parseStringAttr2 = parseStringAttr(str, REGEX_URI, map);
        byte[] decode = Base64.decode(parseStringAttr2.substring(parseStringAttr2.indexOf(44)), 0);
        UUID uuid = C.PLAYREADY_UUID;
        return new DrmInitData.SchemeData(uuid, "video/mp4", PsshAtomUtil.buildPsshAtom(uuid, decode));
    }

    private static String parseEncryptionScheme(String str) {
        return (METHOD_SAMPLE_AES_CENC.equals(str) || METHOD_SAMPLE_AES_CTR.equals(str)) ? "cenc" : "cbcs";
    }

    private static int parseIntAttr(String str, Pattern pattern) throws ParserException {
        return Integer.parseInt(parseStringAttr(str, pattern, Collections.EMPTY_MAP));
    }

    private static long parseLongAttr(String str, Pattern pattern) throws ParserException {
        return Long.parseLong(parseStringAttr(str, pattern, Collections.EMPTY_MAP));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0647  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static HlsMediaPlaylist parseMediaPlaylist(HlsMultivariantPlaylist hlsMultivariantPlaylist, @Nullable HlsMediaPlaylist hlsMediaPlaylist, LineIterator lineIterator, String str) throws IOException {
        HlsMediaPlaylist.ServerControl serverControl;
        TreeMap treeMap;
        long j;
        String str2;
        HlsMediaPlaylist.Segment segment;
        int i;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        HlsMediaPlaylist.Segment segment2;
        long j7;
        boolean z;
        DrmInitData drmInitData;
        DrmInitData drmInitData2;
        HlsMultivariantPlaylist hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
        HlsMediaPlaylist hlsMediaPlaylist2 = hlsMediaPlaylist;
        boolean z2 = hlsMultivariantPlaylist2.hasIndependentSegments;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        HlsMediaPlaylist.ServerControl serverControl2 = new HlsMediaPlaylist.ServerControl(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap2 = new TreeMap();
        boolean z3 = z2;
        long j8 = -9223372036854775807L;
        long j9 = -9223372036854775807L;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        String str3 = "";
        String str4 = str3;
        boolean z4 = false;
        String str5 = null;
        DrmInitData drmInitData3 = null;
        HlsMediaPlaylist.Part part = null;
        int i2 = 0;
        boolean z5 = false;
        DrmInitData drmInitData4 = null;
        String str6 = null;
        long j17 = -1;
        boolean z6 = false;
        boolean z7 = false;
        int i3 = 0;
        HlsMediaPlaylist.Segment segment3 = null;
        int i4 = 0;
        String str7 = null;
        long j18 = -1;
        boolean z8 = false;
        long j19 = -9223372036854775807L;
        long j20 = 0;
        int i5 = 1;
        while (lineIterator.hasNext()) {
            String next = lineIterator.next();
            if (next.startsWith(TAG_PREFIX)) {
                arrayList4.add(next);
            }
            if (next.startsWith(TAG_PLAYLIST_TYPE)) {
                String parseStringAttr = parseStringAttr(next, REGEX_PLAYLIST_TYPE, hashMap);
                if ("VOD".equals(parseStringAttr)) {
                    i2 = 1;
                } else if ("EVENT".equals(parseStringAttr)) {
                    i2 = 2;
                }
            } else if (next.equals(TAG_IFRAME)) {
                z8 = true;
            } else {
                if (next.startsWith(TAG_START)) {
                    ArrayList arrayList5 = arrayList4;
                    serverControl = serverControl2;
                    long parseDoubleAttr = (long) (parseDoubleAttr(next, REGEX_TIME_OFFSET) * 1000000.0d);
                    z4 = parseOptionalBooleanAttribute(next, REGEX_PRECISE, false);
                    arrayList4 = arrayList5;
                    j8 = parseDoubleAttr;
                } else {
                    ArrayList arrayList6 = arrayList4;
                    serverControl = serverControl2;
                    if (next.startsWith(TAG_SERVER_CONTROL)) {
                        serverControl2 = parseServerControl(next);
                        arrayList4 = arrayList6;
                    } else if (next.startsWith(TAG_PART_INF)) {
                        j9 = (long) (parseDoubleAttr(next, REGEX_PART_TARGET_DURATION) * 1000000.0d);
                        arrayList4 = arrayList6;
                    } else if (next.startsWith(TAG_INIT_SEGMENT)) {
                        String parseStringAttr2 = parseStringAttr(next, REGEX_URI, hashMap);
                        boolean z9 = z4;
                        String parseOptionalStringAttr = parseOptionalStringAttr(next, REGEX_ATTR_BYTERANGE, hashMap);
                        if (parseOptionalStringAttr != null) {
                            String[] split = Util.split(parseOptionalStringAttr, "@");
                            j17 = Long.parseLong(split[0]);
                            if (split.length > 1) {
                                j10 = Long.parseLong(split[1]);
                            }
                        }
                        long j21 = j17;
                        long j22 = j21 == j18 ? 0L : j10;
                        if (str7 != null && str6 == null) {
                            throw ParserException.createForMalformedManifest("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                        }
                        HlsMediaPlaylist.Segment segment4 = new HlsMediaPlaylist.Segment(parseStringAttr2, j22, j21, str7, str6);
                        String str8 = str6;
                        if (j21 != j18) {
                            j22 += j21;
                        }
                        str6 = str8;
                        arrayList4 = arrayList6;
                        segment3 = segment4;
                        j10 = j22;
                        j17 = j18;
                        serverControl2 = serverControl;
                        z4 = z9;
                    } else {
                        boolean z10 = z4;
                        String str9 = str6;
                        String str10 = str7;
                        if (next.startsWith(TAG_TARGET_DURATION)) {
                            j19 = 1000000 * parseIntAttr(next, REGEX_TARGET_DURATION);
                        } else if (next.startsWith(TAG_MEDIA_SEQUENCE)) {
                            j14 = parseLongAttr(next, REGEX_MEDIA_SEQUENCE);
                            str7 = str10;
                            str6 = str9;
                            j20 = j14;
                            serverControl2 = serverControl;
                            z4 = z10;
                            arrayList4 = arrayList6;
                        } else if (next.startsWith(TAG_VERSION)) {
                            i5 = parseIntAttr(next, REGEX_VERSION);
                        } else {
                            if (next.startsWith(TAG_DEFINE)) {
                                String parseOptionalStringAttr2 = parseOptionalStringAttr(next, REGEX_IMPORT, hashMap);
                                if (parseOptionalStringAttr2 != null) {
                                    String str11 = hlsMultivariantPlaylist2.variableDefinitions.get(parseOptionalStringAttr2);
                                    if (str11 != null) {
                                        hashMap.put(parseOptionalStringAttr2, str11);
                                    }
                                } else {
                                    hashMap.put(parseStringAttr(next, REGEX_NAME, hashMap), parseStringAttr(next, REGEX_VALUE, hashMap));
                                }
                                treeMap = treeMap2;
                                j = j11;
                                str2 = str4;
                            } else if (next.startsWith(TAG_MEDIA_DURATION)) {
                                j15 = parseTimeSecondsToUs(next, REGEX_MEDIA_DURATION);
                                str3 = parseOptionalStringAttr(next, REGEX_MEDIA_TITLE, str4, hashMap);
                            } else {
                                String str12 = str4;
                                if (next.startsWith(TAG_SKIP)) {
                                    int parseIntAttr = parseIntAttr(next, REGEX_SKIPPED_SEGMENTS);
                                    Assertions.checkState(hlsMediaPlaylist2 != null && arrayList.isEmpty());
                                    str2 = str12;
                                    int i6 = (int) (j20 - ((HlsMediaPlaylist) Util.castNonNull(hlsMediaPlaylist2)).mediaSequence);
                                    int i7 = parseIntAttr + i6;
                                    if (i6 < 0 || i7 > hlsMediaPlaylist2.segments.size()) {
                                        throw new DeltaUpdateException();
                                    }
                                    str7 = str10;
                                    str6 = str9;
                                    long j23 = j11;
                                    while (i6 < i7) {
                                        HlsMediaPlaylist.Segment segment5 = hlsMediaPlaylist2.segments.get(i6);
                                        int i8 = i6;
                                        if (j20 != hlsMediaPlaylist2.mediaSequence) {
                                            segment5 = segment5.copyWith(j23, (hlsMediaPlaylist2.discontinuitySequence - i3) + segment5.relativeDiscontinuitySequence);
                                        }
                                        arrayList.add(segment5);
                                        j13 = j23 + segment5.durationUs;
                                        long j24 = segment5.byteRangeLength;
                                        if (j24 != j18) {
                                            j10 = segment5.byteRangeOffset + j24;
                                        }
                                        int i9 = segment5.relativeDiscontinuitySequence;
                                        HlsMediaPlaylist.Segment segment6 = segment5.initializationSegment;
                                        drmInitData3 = segment5.drmInitData;
                                        String str13 = segment5.fullSegmentEncryptionKeyUri;
                                        String str14 = segment5.encryptionIV;
                                        int i10 = i7;
                                        if (str14 == null || !str14.equals(Long.toHexString(j14))) {
                                            str6 = segment5.encryptionIV;
                                        }
                                        j14++;
                                        i4 = i9;
                                        segment3 = segment6;
                                        str7 = str13;
                                        j23 = j13;
                                        i6 = i8 + 1;
                                        i7 = i10;
                                    }
                                    hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                    j11 = j23;
                                } else {
                                    str2 = str12;
                                    if (next.startsWith(TAG_KEY)) {
                                        String parseStringAttr3 = parseStringAttr(next, REGEX_METHOD, hashMap);
                                        String parseOptionalStringAttr3 = parseOptionalStringAttr(next, REGEX_KEYFORMAT, KEYFORMAT_IDENTITY, hashMap);
                                        if (METHOD_NONE.equals(parseStringAttr3)) {
                                            treeMap2.clear();
                                            drmInitData3 = null;
                                            str6 = null;
                                            str7 = null;
                                        } else {
                                            String parseOptionalStringAttr4 = parseOptionalStringAttr(next, REGEX_IV, hashMap);
                                            if (KEYFORMAT_IDENTITY.equals(parseOptionalStringAttr3)) {
                                                if (METHOD_AES_128.equals(parseStringAttr3)) {
                                                    str7 = parseStringAttr(next, REGEX_URI, hashMap);
                                                    str6 = parseOptionalStringAttr4;
                                                }
                                                str6 = parseOptionalStringAttr4;
                                                str7 = null;
                                            } else {
                                                if (str5 == null) {
                                                    str5 = parseEncryptionScheme(parseStringAttr3);
                                                }
                                                DrmInitData.SchemeData parseDrmSchemeData = parseDrmSchemeData(next, parseOptionalStringAttr3, hashMap);
                                                if (parseDrmSchemeData != null) {
                                                    treeMap2.put(parseOptionalStringAttr3, parseDrmSchemeData);
                                                    str6 = parseOptionalStringAttr4;
                                                    drmInitData3 = null;
                                                    str7 = null;
                                                }
                                                str6 = parseOptionalStringAttr4;
                                                str7 = null;
                                            }
                                        }
                                        hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                    } else {
                                        if (next.startsWith(TAG_BYTERANGE)) {
                                            String[] split2 = Util.split(parseStringAttr(next, REGEX_BYTERANGE, hashMap), "@");
                                            j17 = Long.parseLong(split2[0]);
                                            if (split2.length > 1) {
                                                j10 = Long.parseLong(split2[1]);
                                            }
                                        } else if (next.startsWith(TAG_DISCONTINUITY_SEQUENCE)) {
                                            i3 = Integer.parseInt(next.substring(next.indexOf(58) + 1));
                                            hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                            str7 = str10;
                                            str6 = str9;
                                            serverControl2 = serverControl;
                                            z4 = z10;
                                            arrayList4 = arrayList6;
                                            str4 = str2;
                                            z7 = true;
                                        } else if (next.equals(TAG_DISCONTINUITY)) {
                                            i4++;
                                        } else {
                                            if (next.startsWith(TAG_PROGRAM_DATE_TIME)) {
                                                if (j12 == 0) {
                                                    j12 = Util.msToUs(Util.parseXsDateTime(next.substring(next.indexOf(58) + 1))) - j11;
                                                } else {
                                                    treeMap = treeMap2;
                                                }
                                            } else if (next.equals(TAG_GAP)) {
                                                hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                str7 = str10;
                                                str6 = str9;
                                                serverControl2 = serverControl;
                                                z4 = z10;
                                                arrayList4 = arrayList6;
                                                str4 = str2;
                                                z6 = true;
                                            } else if (next.equals(TAG_INDEPENDENT_SEGMENTS)) {
                                                hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                str7 = str10;
                                                str6 = str9;
                                                serverControl2 = serverControl;
                                                z4 = z10;
                                                arrayList4 = arrayList6;
                                                str4 = str2;
                                                z3 = true;
                                            } else if (next.equals(TAG_ENDLIST)) {
                                                hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                str7 = str10;
                                                str6 = str9;
                                                serverControl2 = serverControl;
                                                z4 = z10;
                                                arrayList4 = arrayList6;
                                                str4 = str2;
                                                z5 = true;
                                            } else if (next.startsWith(TAG_RENDITION_REPORT)) {
                                                treeMap = treeMap2;
                                                arrayList3.add(new HlsMediaPlaylist.RenditionReport(Uri.parse(UriUtil.resolve(str, parseStringAttr(next, REGEX_URI, hashMap))), parseOptionalLongAttr(next, REGEX_LAST_MSN, j18), parseOptionalIntAttr(next, REGEX_LAST_PART, -1)));
                                            } else {
                                                treeMap = treeMap2;
                                                if (!next.startsWith(TAG_PRELOAD_HINT)) {
                                                    j2 = j14;
                                                    if (next.startsWith(TAG_PART)) {
                                                        String segmentEncryptionIV = getSegmentEncryptionIV(j2, str10, str9);
                                                        String parseStringAttr4 = parseStringAttr(next, REGEX_URI, hashMap);
                                                        long parseDoubleAttr2 = (long) (parseDoubleAttr(next, REGEX_ATTR_DURATION) * 1000000.0d);
                                                        boolean parseOptionalBooleanAttribute = parseOptionalBooleanAttribute(next, REGEX_INDEPENDENT, false) | (z3 && arrayList2.isEmpty());
                                                        boolean parseOptionalBooleanAttribute2 = parseOptionalBooleanAttribute(next, REGEX_GAP, false);
                                                        String parseOptionalStringAttr5 = parseOptionalStringAttr(next, REGEX_ATTR_BYTERANGE, hashMap);
                                                        if (parseOptionalStringAttr5 != null) {
                                                            String[] split3 = Util.split(parseOptionalStringAttr5, "@");
                                                            long parseLong = Long.parseLong(split3[0]);
                                                            if (split3.length > 1) {
                                                                j16 = Long.parseLong(split3[1]);
                                                            }
                                                            j5 = parseLong;
                                                        } else {
                                                            j5 = -1;
                                                        }
                                                        long j25 = j5 == -1 ? 0L : j16;
                                                        if (drmInitData3 == null && !treeMap.isEmpty()) {
                                                            DrmInitData.SchemeData[] schemeDataArr = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                            drmInitData3 = new DrmInitData(str5, schemeDataArr);
                                                            if (drmInitData4 == null) {
                                                                drmInitData4 = getPlaylistProtectionSchemes(str5, schemeDataArr);
                                                            }
                                                        }
                                                        DrmInitData drmInitData5 = drmInitData3;
                                                        HlsMediaPlaylist.Segment segment7 = segment3;
                                                        int i11 = i4;
                                                        arrayList2.add(new HlsMediaPlaylist.Part(parseStringAttr4, segment3, parseDoubleAttr2, i4, j13, drmInitData5, str10, segmentEncryptionIV, j25, j5, parseOptionalBooleanAttribute2, parseOptionalBooleanAttribute, false));
                                                        j13 += parseDoubleAttr2;
                                                        if (j5 != -1) {
                                                            j25 += j5;
                                                        }
                                                        j16 = j25;
                                                        hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                        segment3 = segment7;
                                                        str7 = str10;
                                                        str6 = str9;
                                                        j14 = j2;
                                                        i4 = i11;
                                                        drmInitData3 = drmInitData5;
                                                        serverControl2 = serverControl;
                                                        z4 = z10;
                                                        arrayList4 = arrayList6;
                                                        str4 = str2;
                                                        treeMap2 = treeMap;
                                                    } else {
                                                        segment = segment3;
                                                        i = i4;
                                                        if (next.startsWith("#")) {
                                                            j3 = j10;
                                                            j = j11;
                                                            j4 = j15;
                                                            hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                            segment3 = segment;
                                                            str7 = str10;
                                                            str6 = str9;
                                                            j14 = j2;
                                                            str3 = str3;
                                                            j15 = j4;
                                                            j11 = j;
                                                            j10 = j3;
                                                            serverControl2 = serverControl;
                                                            z4 = z10;
                                                            arrayList4 = arrayList6;
                                                            str4 = str2;
                                                            treeMap2 = treeMap;
                                                            j18 = -1;
                                                            hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                            i4 = i;
                                                        } else {
                                                            long j26 = j11;
                                                            String segmentEncryptionIV2 = getSegmentEncryptionIV(j2, str10, str9);
                                                            j14 = j2 + 1;
                                                            String replaceVariableReferences = replaceVariableReferences(next, hashMap);
                                                            HlsMediaPlaylist.Segment segment8 = (HlsMediaPlaylist.Segment) hashMap2.get(replaceVariableReferences);
                                                            if (j17 == -1) {
                                                                segment2 = segment8;
                                                                j7 = 0;
                                                            } else {
                                                                if (z8 && segment == null && segment8 == null) {
                                                                    j6 = j10;
                                                                    segment8 = new HlsMediaPlaylist.Segment(replaceVariableReferences, 0L, j6, null, null);
                                                                    hashMap2.put(replaceVariableReferences, segment8);
                                                                } else {
                                                                    j6 = j10;
                                                                }
                                                                segment2 = segment8;
                                                                j7 = j6;
                                                            }
                                                            if (drmInitData3 != null || treeMap.isEmpty()) {
                                                                z = false;
                                                            } else {
                                                                z = false;
                                                                DrmInitData.SchemeData[] schemeDataArr2 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                                drmInitData3 = new DrmInitData(str5, schemeDataArr2);
                                                                if (drmInitData4 == null) {
                                                                    drmInitData2 = getPlaylistProtectionSchemes(str5, schemeDataArr2);
                                                                    drmInitData = drmInitData3;
                                                                    long j27 = j15;
                                                                    arrayList.add(new HlsMediaPlaylist.Segment(replaceVariableReferences, segment == null ? segment : segment2, str3, j27, i, j26, drmInitData, str10, segmentEncryptionIV2, j7, j17, z6, arrayList2));
                                                                    j13 = j26 + j27;
                                                                    arrayList2 = new ArrayList();
                                                                    if (j17 != -1) {
                                                                        j7 += j17;
                                                                    }
                                                                    j10 = j7;
                                                                    hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                                    segment3 = segment;
                                                                    str7 = str10;
                                                                    str6 = str9;
                                                                    drmInitData4 = drmInitData2;
                                                                    z6 = z;
                                                                    i4 = i;
                                                                    drmInitData3 = drmInitData;
                                                                    j11 = j13;
                                                                    j15 = 0;
                                                                    serverControl2 = serverControl;
                                                                    z4 = z10;
                                                                    arrayList4 = arrayList6;
                                                                    str3 = str2;
                                                                    str4 = str3;
                                                                    treeMap2 = treeMap;
                                                                    j17 = -1;
                                                                }
                                                            }
                                                            drmInitData = drmInitData3;
                                                            drmInitData2 = drmInitData4;
                                                            long j272 = j15;
                                                            arrayList.add(new HlsMediaPlaylist.Segment(replaceVariableReferences, segment == null ? segment : segment2, str3, j272, i, j26, drmInitData, str10, segmentEncryptionIV2, j7, j17, z6, arrayList2));
                                                            j13 = j26 + j272;
                                                            arrayList2 = new ArrayList();
                                                            if (j17 != -1) {
                                                            }
                                                            j10 = j7;
                                                            hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                            segment3 = segment;
                                                            str7 = str10;
                                                            str6 = str9;
                                                            drmInitData4 = drmInitData2;
                                                            z6 = z;
                                                            i4 = i;
                                                            drmInitData3 = drmInitData;
                                                            j11 = j13;
                                                            j15 = 0;
                                                            serverControl2 = serverControl;
                                                            z4 = z10;
                                                            arrayList4 = arrayList6;
                                                            str3 = str2;
                                                            str4 = str3;
                                                            treeMap2 = treeMap;
                                                            j17 = -1;
                                                        }
                                                    }
                                                    j18 = -1;
                                                    hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                } else if (part == null && TYPE_PART.equals(parseStringAttr(next, REGEX_PRELOAD_HINT_TYPE, hashMap))) {
                                                    String parseStringAttr5 = parseStringAttr(next, REGEX_URI, hashMap);
                                                    long parseOptionalLongAttr = parseOptionalLongAttr(next, REGEX_BYTERANGE_START, -1L);
                                                    long parseOptionalLongAttr2 = parseOptionalLongAttr(next, REGEX_BYTERANGE_LENGTH, -1L);
                                                    long j28 = j14;
                                                    String segmentEncryptionIV3 = getSegmentEncryptionIV(j28, str10, str9);
                                                    if (drmInitData3 == null && !treeMap.isEmpty()) {
                                                        DrmInitData.SchemeData[] schemeDataArr3 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                        drmInitData3 = new DrmInitData(str5, schemeDataArr3);
                                                        if (drmInitData4 == null) {
                                                            drmInitData4 = getPlaylistProtectionSchemes(str5, schemeDataArr3);
                                                        }
                                                    }
                                                    DrmInitData drmInitData6 = drmInitData3;
                                                    if (parseOptionalLongAttr == -1 || parseOptionalLongAttr2 != -1) {
                                                        part = new HlsMediaPlaylist.Part(parseStringAttr5, segment3, 0L, i4, j13, drmInitData6, str10, segmentEncryptionIV3, parseOptionalLongAttr != -1 ? parseOptionalLongAttr : 0L, parseOptionalLongAttr2, false, false, true);
                                                    }
                                                    hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                    hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                    str7 = str10;
                                                    str6 = str9;
                                                    j14 = j28;
                                                    drmInitData3 = drmInitData6;
                                                    serverControl2 = serverControl;
                                                    z4 = z10;
                                                    arrayList4 = arrayList6;
                                                    str4 = str2;
                                                    treeMap2 = treeMap;
                                                    j18 = -1;
                                                }
                                            }
                                            j = j11;
                                        }
                                        hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                        str7 = str10;
                                        str6 = str9;
                                    }
                                }
                                serverControl2 = serverControl;
                                z4 = z10;
                                arrayList4 = arrayList6;
                                str4 = str2;
                            }
                            segment = segment3;
                            i = i4;
                            j2 = j14;
                            j3 = j10;
                            j4 = j15;
                            hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                            segment3 = segment;
                            str7 = str10;
                            str6 = str9;
                            j14 = j2;
                            str3 = str3;
                            j15 = j4;
                            j11 = j;
                            j10 = j3;
                            serverControl2 = serverControl;
                            z4 = z10;
                            arrayList4 = arrayList6;
                            str4 = str2;
                            treeMap2 = treeMap;
                            j18 = -1;
                            hlsMediaPlaylist2 = hlsMediaPlaylist;
                            i4 = i;
                        }
                        str7 = str10;
                        str6 = str9;
                        serverControl2 = serverControl;
                        z4 = z10;
                        arrayList4 = arrayList6;
                    }
                }
                serverControl2 = serverControl;
            }
        }
        boolean z11 = z4;
        ArrayList arrayList7 = arrayList4;
        HlsMediaPlaylist.ServerControl serverControl3 = serverControl2;
        HashMap hashMap3 = new HashMap();
        for (int i12 = 0; i12 < arrayList3.size(); i12++) {
            HlsMediaPlaylist.RenditionReport renditionReport = (HlsMediaPlaylist.RenditionReport) arrayList3.get(i12);
            long j29 = renditionReport.lastMediaSequence;
            if (j29 == -1) {
                j29 = (j20 + arrayList.size()) - (arrayList2.isEmpty() ? 1L : 0L);
            }
            int i13 = renditionReport.lastPartIndex;
            if (i13 == -1 && j9 != -9223372036854775807L) {
                i13 = (arrayList2.isEmpty() ? ((HlsMediaPlaylist.Segment) N.b(arrayList)).parts : arrayList2).size() - 1;
            }
            Uri uri = renditionReport.playlistUri;
            hashMap3.put(uri, new HlsMediaPlaylist.RenditionReport(uri, j29, i13));
        }
        if (part != null) {
            arrayList2.add(part);
        }
        return new HlsMediaPlaylist(i2, str, arrayList7, j8, z11, j12, z7, i3, j20, i5, j19, j9, z3, z5, j12 != 0, drmInitData4, arrayList, arrayList2, serverControl3, hashMap3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:88:0x032b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    private static HlsMultivariantPlaylist parseMultivariantPlaylist(LineIterator lineIterator, String str) throws IOException {
        char c;
        ArrayList arrayList;
        String str2;
        ArrayList arrayList2;
        int parseInt;
        String str3;
        ArrayList arrayList3;
        HlsMultivariantPlaylist.Variant variant;
        String str4;
        ArrayList arrayList4;
        ArrayList arrayList5;
        boolean z;
        int i;
        int i2;
        ArrayList arrayList6;
        ArrayList arrayList7;
        Uri resolveToUri;
        int i3;
        String str5 = str;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            int i4 = 1;
            if (!lineIterator.hasNext()) {
                ArrayList arrayList16 = arrayList10;
                ArrayList arrayList17 = arrayList11;
                ArrayList arrayList18 = arrayList12;
                ArrayList arrayList19 = arrayList15;
                boolean z4 = z2;
                ArrayList arrayList20 = arrayList14;
                boolean z5 = z3;
                ArrayList arrayList21 = new ArrayList();
                HashSet hashSet = new HashSet();
                int i5 = 0;
                while (i5 < arrayList8.size()) {
                    HlsMultivariantPlaylist.Variant variant2 = (HlsMultivariantPlaylist.Variant) arrayList8.get(i5);
                    if (hashSet.add(variant2.url)) {
                        Assertions.checkState(variant2.format.metadata == null ? i4 : 0);
                        Metadata.Entry[] entryArr = new Metadata.Entry[i4];
                        entryArr[0] = new HlsTrackMetadataEntry(null, null, (List) Assertions.checkNotNull((ArrayList) hashMap.get(variant2.url)));
                        arrayList21.add(variant2.copyWithFormat(variant2.format.buildUpon().setMetadata(new Metadata(entryArr)).build()));
                    }
                    i5++;
                    i4 = 1;
                }
                int i6 = 0;
                ArrayList arrayList22 = null;
                Format format = null;
                while (i6 < arrayList13.size()) {
                    String str6 = (String) arrayList13.get(i6);
                    String parseStringAttr = parseStringAttr(str6, REGEX_GROUP_ID, hashMap2);
                    String parseStringAttr2 = parseStringAttr(str6, REGEX_NAME, hashMap2);
                    Format.Builder builder = new Format.Builder();
                    StringBuilder sb = new StringBuilder();
                    sb.append(parseStringAttr);
                    ArrayList arrayList23 = arrayList22;
                    sb.append(":");
                    sb.append(parseStringAttr2);
                    Format.Builder language = builder.setId(sb.toString()).setLabel(parseStringAttr2).setContainerMimeType("application/x-mpegURL").setSelectionFlags(parseSelectionFlags(str6)).setRoleFlags(parseRoleFlags(str6, hashMap2)).setLanguage(parseOptionalStringAttr(str6, REGEX_LANGUAGE, hashMap2));
                    String parseOptionalStringAttr = parseOptionalStringAttr(str6, REGEX_URI, hashMap2);
                    Uri resolveToUri2 = parseOptionalStringAttr == null ? null : UriUtil.resolveToUri(str5, parseOptionalStringAttr);
                    ArrayList arrayList24 = arrayList13;
                    Metadata metadata = new Metadata(new HlsTrackMetadataEntry(parseStringAttr, parseStringAttr2, Collections.EMPTY_LIST));
                    String parseStringAttr3 = parseStringAttr(str6, REGEX_TYPE, hashMap2);
                    parseStringAttr3.getClass();
                    switch (parseStringAttr3.hashCode()) {
                        case -959297733:
                            if (parseStringAttr3.equals(TYPE_SUBTITLES)) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -333210994:
                            if (parseStringAttr3.equals(TYPE_CLOSED_CAPTIONS)) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 62628790:
                            if (parseStringAttr3.equals(TYPE_AUDIO)) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 81665115:
                            if (parseStringAttr3.equals(TYPE_VIDEO)) {
                                c = 3;
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
                            arrayList = arrayList16;
                            HlsMultivariantPlaylist.Variant variantWithSubtitleGroup = getVariantWithSubtitleGroup(arrayList8, parseStringAttr);
                            if (variantWithSubtitleGroup != null) {
                                String codecsOfType = Util.getCodecsOfType(variantWithSubtitleGroup.format.codecs, 3);
                                language.setCodecs(codecsOfType);
                                str2 = MimeTypes.getMediaMimeType(codecsOfType);
                            } else {
                                str2 = null;
                            }
                            if (str2 == null) {
                                str2 = "text/vtt";
                            }
                            language.setSampleMimeType(str2).setMetadata(metadata);
                            if (resolveToUri2 != null) {
                                HlsMultivariantPlaylist.Rendition rendition = new HlsMultivariantPlaylist.Rendition(resolveToUri2, language.build(), parseStringAttr, parseStringAttr2);
                                arrayList2 = arrayList17;
                                arrayList2.add(rendition);
                            } else {
                                arrayList2 = arrayList17;
                                Log.w(LOG_TAG, "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                            }
                            arrayList3 = arrayList23;
                            break;
                        case 1:
                            arrayList = arrayList16;
                            String parseStringAttr4 = parseStringAttr(str6, REGEX_INSTREAM_ID, hashMap2);
                            if (parseStringAttr4.startsWith("CC")) {
                                parseInt = Integer.parseInt(parseStringAttr4.substring(2));
                                str3 = "application/cea-608";
                            } else {
                                parseInt = Integer.parseInt(parseStringAttr4.substring(7));
                                str3 = "application/cea-708";
                            }
                            arrayList3 = arrayList23 == null ? new ArrayList() : arrayList23;
                            language.setSampleMimeType(str3).setAccessibilityChannel(parseInt);
                            arrayList3.add(language.build());
                            arrayList2 = arrayList17;
                            break;
                        case 2:
                            HlsMultivariantPlaylist.Variant variantWithAudioGroup = getVariantWithAudioGroup(arrayList8, parseStringAttr);
                            if (variantWithAudioGroup != null) {
                                variant = variantWithAudioGroup;
                                String codecsOfType2 = Util.getCodecsOfType(variantWithAudioGroup.format.codecs, 1);
                                language.setCodecs(codecsOfType2);
                                str4 = MimeTypes.getMediaMimeType(codecsOfType2);
                            } else {
                                variant = variantWithAudioGroup;
                                str4 = null;
                            }
                            String parseOptionalStringAttr2 = parseOptionalStringAttr(str6, REGEX_CHANNELS, hashMap2);
                            if (parseOptionalStringAttr2 != null) {
                                language.setChannelCount(Integer.parseInt(Util.splitAtFirst(parseOptionalStringAttr2, DomExceptionUtils.SEPARATOR)[0]));
                                if ("audio/eac3".equals(str4) && parseOptionalStringAttr2.endsWith("/JOC")) {
                                    language.setCodecs("ec+3");
                                    str4 = "audio/eac3-joc";
                                }
                            }
                            language.setSampleMimeType(str4);
                            if (resolveToUri2 == null) {
                                arrayList = arrayList16;
                                if (variant != null) {
                                    arrayList3 = arrayList23;
                                    format = language.build();
                                    arrayList2 = arrayList17;
                                    break;
                                }
                            } else {
                                language.setMetadata(metadata);
                                arrayList = arrayList16;
                                arrayList.add(new HlsMultivariantPlaylist.Rendition(resolveToUri2, language.build(), parseStringAttr, parseStringAttr2));
                            }
                            arrayList2 = arrayList17;
                            arrayList3 = arrayList23;
                            break;
                        case 3:
                            HlsMultivariantPlaylist.Variant variantWithVideoGroup = getVariantWithVideoGroup(arrayList8, parseStringAttr);
                            if (variantWithVideoGroup != null) {
                                Format format2 = variantWithVideoGroup.format;
                                String codecsOfType3 = Util.getCodecsOfType(format2.codecs, 2);
                                language.setCodecs(codecsOfType3).setSampleMimeType(MimeTypes.getMediaMimeType(codecsOfType3)).setWidth(format2.width).setHeight(format2.height).setFrameRate(format2.frameRate);
                            }
                            if (resolveToUri2 != null) {
                                language.setMetadata(metadata);
                                arrayList9.add(new HlsMultivariantPlaylist.Rendition(resolveToUri2, language.build(), parseStringAttr, parseStringAttr2));
                            }
                        default:
                            arrayList2 = arrayList17;
                            arrayList = arrayList16;
                            arrayList3 = arrayList23;
                            break;
                    }
                    i6++;
                    str5 = str;
                    arrayList17 = arrayList2;
                    arrayList16 = arrayList;
                    arrayList22 = arrayList3;
                    arrayList13 = arrayList24;
                }
                return new HlsMultivariantPlaylist(str, arrayList19, arrayList21, arrayList9, arrayList16, arrayList17, arrayList18, format, z4 ? Collections.EMPTY_LIST : arrayList22, z5, hashMap2, arrayList20);
            }
            String next = lineIterator.next();
            if (next.startsWith(TAG_PREFIX)) {
                arrayList15.add(next);
            }
            boolean startsWith = next.startsWith(TAG_I_FRAME_STREAM_INF);
            ArrayList arrayList25 = arrayList12;
            if (next.startsWith(TAG_DEFINE)) {
                hashMap2.put(parseStringAttr(next, REGEX_NAME, hashMap2), parseStringAttr(next, REGEX_VALUE, hashMap2));
            } else {
                if (next.equals(TAG_INDEPENDENT_SEGMENTS)) {
                    arrayList7 = arrayList10;
                    arrayList6 = arrayList11;
                    arrayList4 = arrayList15;
                    arrayList5 = arrayList14;
                    z3 = true;
                } else if (next.startsWith(TAG_MEDIA)) {
                    arrayList13.add(next);
                } else if (next.startsWith(TAG_SESSION_KEY)) {
                    DrmInitData.SchemeData parseDrmSchemeData = parseDrmSchemeData(next, parseOptionalStringAttr(next, REGEX_KEYFORMAT, KEYFORMAT_IDENTITY, hashMap2), hashMap2);
                    if (parseDrmSchemeData != null) {
                        arrayList14.add(new DrmInitData(parseEncryptionScheme(parseStringAttr(next, REGEX_METHOD, hashMap2)), parseDrmSchemeData));
                    }
                } else if (next.startsWith(TAG_STREAM_INF) || startsWith) {
                    boolean contains = z2 | next.contains(ATTR_CLOSED_CAPTIONS_NONE);
                    int i7 = startsWith ? 16384 : 0;
                    arrayList4 = arrayList15;
                    int parseIntAttr = parseIntAttr(next, REGEX_BANDWIDTH);
                    int parseOptionalIntAttr = parseOptionalIntAttr(next, REGEX_AVERAGE_BANDWIDTH, -1);
                    String parseOptionalStringAttr3 = parseOptionalStringAttr(next, REGEX_CODECS, hashMap2);
                    arrayList5 = arrayList14;
                    String parseOptionalStringAttr4 = parseOptionalStringAttr(next, REGEX_RESOLUTION, hashMap2);
                    if (parseOptionalStringAttr4 != null) {
                        z = z3;
                        String[] split = Util.split(parseOptionalStringAttr4, "x");
                        int parseInt2 = Integer.parseInt(split[0]);
                        int parseInt3 = Integer.parseInt(split[1]);
                        if (parseInt2 <= 0 || parseInt3 <= 0) {
                            parseInt3 = -1;
                            i3 = -1;
                        } else {
                            i3 = parseInt2;
                        }
                        i2 = parseInt3;
                        i = i3;
                    } else {
                        z = z3;
                        i = -1;
                        i2 = -1;
                    }
                    arrayList6 = arrayList11;
                    String parseOptionalStringAttr5 = parseOptionalStringAttr(next, REGEX_FRAME_RATE, hashMap2);
                    float parseFloat = parseOptionalStringAttr5 != null ? Float.parseFloat(parseOptionalStringAttr5) : -1.0f;
                    arrayList7 = arrayList10;
                    String parseOptionalStringAttr6 = parseOptionalStringAttr(next, REGEX_VIDEO, hashMap2);
                    String parseOptionalStringAttr7 = parseOptionalStringAttr(next, REGEX_AUDIO, hashMap2);
                    String parseOptionalStringAttr8 = parseOptionalStringAttr(next, REGEX_SUBTITLES, hashMap2);
                    String parseOptionalStringAttr9 = parseOptionalStringAttr(next, REGEX_CLOSED_CAPTIONS, hashMap2);
                    if (startsWith) {
                        resolveToUri = UriUtil.resolveToUri(str5, parseStringAttr(next, REGEX_URI, hashMap2));
                    } else {
                        if (!lineIterator.hasNext()) {
                            throw ParserException.createForMalformedManifest("#EXT-X-STREAM-INF must be followed by another line", null);
                        }
                        resolveToUri = UriUtil.resolveToUri(str5, replaceVariableReferences(lineIterator.next(), hashMap2));
                    }
                    Uri uri = resolveToUri;
                    arrayList8.add(new HlsMultivariantPlaylist.Variant(uri, new Format.Builder().setId(arrayList8.size()).setContainerMimeType("application/x-mpegURL").setCodecs(parseOptionalStringAttr3).setAverageBitrate(parseOptionalIntAttr).setPeakBitrate(parseIntAttr).setWidth(i).setHeight(i2).setFrameRate(parseFloat).setRoleFlags(i7).build(), parseOptionalStringAttr6, parseOptionalStringAttr7, parseOptionalStringAttr8, parseOptionalStringAttr9));
                    ArrayList arrayList26 = (ArrayList) hashMap.get(uri);
                    if (arrayList26 == null) {
                        arrayList26 = new ArrayList();
                        hashMap.put(uri, arrayList26);
                    }
                    arrayList26.add(new HlsTrackMetadataEntry.VariantInfo(parseOptionalIntAttr, parseIntAttr, parseOptionalStringAttr6, parseOptionalStringAttr7, parseOptionalStringAttr8, parseOptionalStringAttr9));
                    z2 = contains;
                    z3 = z;
                }
                arrayList12 = arrayList25;
                arrayList15 = arrayList4;
                arrayList14 = arrayList5;
                arrayList11 = arrayList6;
                arrayList10 = arrayList7;
            }
            arrayList7 = arrayList10;
            arrayList6 = arrayList11;
            arrayList4 = arrayList15;
            arrayList5 = arrayList14;
            arrayList12 = arrayList25;
            arrayList15 = arrayList4;
            arrayList14 = arrayList5;
            arrayList11 = arrayList6;
            arrayList10 = arrayList7;
        }
    }

    private static boolean parseOptionalBooleanAttribute(String str, Pattern pattern, boolean z) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? BOOLEAN_TRUE.equals(matcher.group(1)) : z;
    }

    private static double parseOptionalDoubleAttr(String str, Pattern pattern, double d) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) Assertions.checkNotNull(matcher.group(1))) : d;
    }

    private static int parseOptionalIntAttr(String str, Pattern pattern, int i) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1))) : i;
    }

    private static long parseOptionalLongAttr(String str, Pattern pattern, long j) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) Assertions.checkNotNull(matcher.group(1))) : j;
    }

    @Nullable
    private static String parseOptionalStringAttr(String str, Pattern pattern, Map<String, String> map) {
        return parseOptionalStringAttr(str, pattern, null, map);
    }

    private static int parseRoleFlags(String str, Map<String, String> map) {
        String parseOptionalStringAttr = parseOptionalStringAttr(str, REGEX_CHARACTERISTICS, map);
        if (TextUtils.isEmpty(parseOptionalStringAttr)) {
            return 0;
        }
        String[] split = Util.split(parseOptionalStringAttr, ",");
        int i = Util.contains(split, "public.accessibility.describes-video") ? 512 : 0;
        if (Util.contains(split, "public.accessibility.transcribes-spoken-dialog")) {
            i |= 4096;
        }
        if (Util.contains(split, "public.accessibility.describes-music-and-sound")) {
            i |= 1024;
        }
        return Util.contains(split, "public.easy-to-read") ? i | 8192 : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    private static int parseSelectionFlags(String str) {
        boolean parseOptionalBooleanAttribute = parseOptionalBooleanAttribute(str, REGEX_DEFAULT, false);
        ?? r0 = parseOptionalBooleanAttribute;
        if (parseOptionalBooleanAttribute(str, REGEX_FORCED, false)) {
            r0 = (parseOptionalBooleanAttribute ? 1 : 0) | 2;
        }
        return parseOptionalBooleanAttribute(str, REGEX_AUTOSELECT, false) ? r0 | 4 : r0;
    }

    private static HlsMediaPlaylist.ServerControl parseServerControl(String str) {
        double parseOptionalDoubleAttr = parseOptionalDoubleAttr(str, REGEX_CAN_SKIP_UNTIL, -9.223372036854776E18d);
        long j = parseOptionalDoubleAttr == -9.223372036854776E18d ? -9223372036854775807L : (long) (parseOptionalDoubleAttr * 1000000.0d);
        boolean parseOptionalBooleanAttribute = parseOptionalBooleanAttribute(str, REGEX_CAN_SKIP_DATE_RANGES, false);
        double parseOptionalDoubleAttr2 = parseOptionalDoubleAttr(str, REGEX_HOLD_BACK, -9.223372036854776E18d);
        long j2 = parseOptionalDoubleAttr2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (parseOptionalDoubleAttr2 * 1000000.0d);
        double parseOptionalDoubleAttr3 = parseOptionalDoubleAttr(str, REGEX_PART_HOLD_BACK, -9.223372036854776E18d);
        return new HlsMediaPlaylist.ServerControl(j, parseOptionalBooleanAttribute, j2, parseOptionalDoubleAttr3 != -9.223372036854776E18d ? (long) (parseOptionalDoubleAttr3 * 1000000.0d) : -9223372036854775807L, parseOptionalBooleanAttribute(str, REGEX_CAN_BLOCK_RELOAD, false));
    }

    private static String parseStringAttr(String str, Pattern pattern, Map<String, String> map) throws ParserException {
        String parseOptionalStringAttr = parseOptionalStringAttr(str, pattern, map);
        if (parseOptionalStringAttr != null) {
            return parseOptionalStringAttr;
        }
        throw ParserException.createForMalformedManifest("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    private static long parseTimeSecondsToUs(String str, Pattern pattern) throws ParserException {
        return new BigDecimal(parseStringAttr(str, pattern, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
    }

    private static String replaceVariableReferences(String str, Map<String, String> map) {
        Matcher matcher = REGEX_VARIABLE_REFERENCE.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static int skipIgnorableWhitespace(BufferedReader bufferedReader, boolean z, int i) throws IOException {
        while (i != -1 && Character.isWhitespace(i) && (z || !Util.isLinebreak(i))) {
            i = bufferedReader.read();
        }
        return i;
    }

    public HlsPlaylistParser(HlsMultivariantPlaylist hlsMultivariantPlaylist, @Nullable HlsMediaPlaylist hlsMediaPlaylist) {
        this.multivariantPlaylist = hlsMultivariantPlaylist;
        this.previousMediaPlaylist = hlsMediaPlaylist;
    }

    private static String parseOptionalStringAttr(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) Assertions.checkNotNull(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : replaceVariableReferences(str2, map);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
    public HlsPlaylist parse(Uri uri, InputStream inputStream) throws IOException {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!checkPlaylistHeader(bufferedReader)) {
                throw ParserException.createForMalformedManifest("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    Util.closeQuietly(bufferedReader);
                    throw ParserException.createForMalformedManifest("Failed to parse the playlist, could not identify any tags.", null);
                }
                trim = readLine.trim();
                if (!trim.isEmpty()) {
                    if (!trim.startsWith(TAG_STREAM_INF)) {
                        if (trim.startsWith(TAG_TARGET_DURATION) || trim.startsWith(TAG_MEDIA_SEQUENCE) || trim.startsWith(TAG_MEDIA_DURATION) || trim.startsWith(TAG_KEY) || trim.startsWith(TAG_BYTERANGE) || trim.equals(TAG_DISCONTINUITY) || trim.equals(TAG_DISCONTINUITY_SEQUENCE) || trim.equals(TAG_ENDLIST)) {
                            break;
                        }
                        arrayDeque.add(trim);
                    } else {
                        arrayDeque.add(trim);
                        return parseMultivariantPlaylist(new LineIterator(arrayDeque, bufferedReader), uri.toString());
                    }
                }
            }
            arrayDeque.add(trim);
            return parseMediaPlaylist(this.multivariantPlaylist, this.previousMediaPlaylist, new LineIterator(arrayDeque, bufferedReader), uri.toString());
        } finally {
            Util.closeQuietly(bufferedReader);
        }
    }
}
