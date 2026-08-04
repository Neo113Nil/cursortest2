package g2;

import A1.AbstractC0029l;
import A1.C0045t0;
import A1.X;
import E3.AbstractC0158p;
import E3.AbstractC0167z;
import E3.C0165x;
import E3.L;
import Y4.D;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.util.Xml;
import com.google.android.exoplayer2.Format$Builder;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.gms.common.internal.C0815k;
import io.sentry.rrweb.RRWebVideoEvent;
import io.sentry.util.StringUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
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
import p146u2.C0956o;
import p146u2.M;

/* JADX INFO: loaded from: classes.dex */
public final class e extends DefaultHandler implements M {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f13136b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f13137c = Pattern.compile("CC([1-4])=.*");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f13138d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f13139e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f13140a;

    public e() {
        try {
            this.f13140a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e7) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e7);
        }
    }

    public static long a(ArrayList arrayList, long j, long j3, int i7, long j7) {
        int i8;
        if (i7 >= 0) {
            i8 = i7 + 1;
        } else {
            int i9 = p151v2.t.f17159a;
            i8 = (int) ((((j7 - j) + j3) - 1) / j3);
        }
        for (int i10 = 0; i10 < i8; i10++) {
            arrayList.add(new q(j, j3));
            j += j3;
        }
        return j;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x007d A[EDGE_INSN: B:38:0x007d->B:39:0x007e BREAK  A[LOOP:0: B:7:0x001d->B:13:0x002e]] */
    /* JADX WARN: Code duplicated, block: B:94:0x0150  */
    /* JADX WARN: Code duplicated, block: B:97:0x0159  */
    public static X b(String str, String str2, int i7, int i8, float f7, int i9, int i10, int i11, String str3, ArrayList arrayList, ArrayList arrayList2, String str4, ArrayList arrayList3, ArrayList arrayList4) {
        String strC;
        String str5;
        int i12;
        int i13;
        Pair pairCreate;
        int i14;
        String str6;
        int i15;
        int i16;
        String str7;
        int i17;
        byte b7;
        int iQ;
        if (p151v2.i.h(str2)) {
            if (str4 == null) {
                strC = null;
                break;
            }
            String[] strArrM = p151v2.t.M(str4);
            int length = strArrM.length;
            int i18 = 0;
            while (true) {
                if (i18 >= length) {
                    strC = null;
                    break;
                }
                strC = p151v2.i.c(strArrM[i18]);
                if (strC != null && p151v2.i.h(strC)) {
                    break;
                }
                i18++;
            }
        } else if (p151v2.i.j(str2)) {
            if (str4 == null) {
                strC = null;
                break;
            }
            String[] strArrM2 = p151v2.t.M(str4);
            int length2 = strArrM2.length;
            int i19 = 0;
            while (true) {
                if (i19 >= length2) {
                    strC = null;
                    break;
                }
                strC = p151v2.i.c(strArrM2[i19]);
                if (strC != null && p151v2.i.j(strC)) {
                    break;
                }
                i19++;
            }
        } else if (p151v2.i.i(str2) || "image".equals(p151v2.i.f(str2))) {
            strC = str2;
        } else {
            if (!"application/mp4".equals(str2)) {
                strC = null;
                break;
            }
            String strC2 = p151v2.i.c(str4);
            if ("text/vtt".equals(strC2)) {
                strC2 = "application/x-mp4-vtt";
            }
            strC = strC2;
        }
        String str8 = "audio/eac3";
        if ("audio/eac3".equals(strC)) {
            int i20 = 0;
            while (true) {
                if (i20 >= arrayList4.size()) {
                    break;
                }
                f fVar = (f) arrayList4.get(i20);
                String str9 = fVar.f13141a;
                boolean zEquals = "tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str9);
                String str10 = fVar.f13142b;
                if ((zEquals && "JOC".equals(str10)) || ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str9) && "ec+3".equals(str10))) {
                    str8 = "audio/eac3-joc";
                    break;
                }
                i20++;
            }
            str5 = "audio/eac3-joc".equals(str8) ? "ec+3" : str4;
            strC = str8;
        } else {
            str5 = str4;
        }
        int i21 = 0;
        for (int i22 = 0; i22 < arrayList.size(); i22++) {
            f fVar2 = (f) arrayList.get(i22);
            if (D.n("urn:mpeg:dash:role:2011", fVar2.f13141a)) {
                String str11 = fVar2.f13142b;
                i21 |= (str11 != null && (str11.equals("forced_subtitle") || str11.equals("forced-subtitle"))) ? 2 : 0;
            }
        }
        int iQ2 = 0;
        for (int i23 = 0; i23 < arrayList.size(); i23++) {
            f fVar3 = (f) arrayList.get(i23);
            if (D.n("urn:mpeg:dash:role:2011", fVar3.f13141a)) {
                iQ2 |= q(fVar3.f13142b);
            }
        }
        int i24 = 0;
        for (int i25 = 0; i25 < arrayList2.size(); i25++) {
            f fVar4 = (f) arrayList2.get(i25);
            boolean zN = D.n("urn:mpeg:dash:role:2011", fVar4.f13141a);
            String str12 = fVar4.f13142b;
            if (zN) {
                iQ = q(str12);
            } else {
                if (D.n("urn:tva:metadata:cs:AudioPurposeCS:2007", fVar4.f13141a)) {
                    if (str12 != null) {
                        switch (str12.hashCode()) {
                            case 49:
                                if (str12.equals("1")) {
                                    b7 = 0;
                                } else {
                                    b7 = -1;
                                }
                                break;
                            case 50:
                                if (str12.equals("2")) {
                                    b7 = 1;
                                } else {
                                    b7 = -1;
                                }
                                break;
                            case 51:
                                if (str12.equals("3")) {
                                    b7 = 2;
                                } else {
                                    b7 = -1;
                                }
                                break;
                            case 52:
                                if (str12.equals("4")) {
                                    b7 = 3;
                                } else {
                                    b7 = -1;
                                }
                                break;
                            case 53:
                            default:
                                b7 = -1;
                                break;
                            case 54:
                                if (str12.equals("6")) {
                                    b7 = 4;
                                } else {
                                    b7 = -1;
                                }
                                break;
                        }
                        switch (b7) {
                            case 0:
                                iQ = 512;
                                break;
                            case 1:
                                iQ = 2048;
                                break;
                            case 2:
                                iQ = 4;
                                break;
                            case 3:
                                iQ = 8;
                                break;
                            case 4:
                                iQ = 1;
                                break;
                            default:
                                iQ = 0;
                                break;
                        }
                    } else {
                        iQ = 0;
                    }
                }
            }
            i24 |= iQ;
        }
        int iR = iQ2 | i24 | r(arrayList3) | r(arrayList4);
        int i26 = 0;
        while (true) {
            if (i26 < arrayList3.size()) {
                f fVar5 = (f) arrayList3.get(i26);
                if (D.n("http://dashif.org/thumbnail_tile", fVar5.f13141a) || D.n("http://dashif.org/guidelines/thumbnail_tile", fVar5.f13141a)) {
                    String str13 = fVar5.f13142b;
                    if (str13 != null) {
                        int i27 = p151v2.t.f17159a;
                        i13 = -1;
                        String[] strArrSplit = str13.split("x", -1);
                        if (strArrSplit.length != 2) {
                            i17 = 1;
                        } else {
                            i12 = 0;
                            try {
                                pairCreate = Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[1])));
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                    i17 = 1;
                } else {
                    i17 = 1;
                }
                i26 += i17;
            } else {
                i12 = 0;
                i13 = -1;
                pairCreate = null;
            }
        }
        Format$Builder format$Builder = new Format$Builder();
        format$Builder.f10528a = str;
        format$Builder.j = str2;
        format$Builder.f10537k = strC;
        format$Builder.f10535h = str5;
        format$Builder.f10534g = i11;
        format$Builder.f10531d = i21;
        format$Builder.f10532e = iR;
        format$Builder.f10530c = str3;
        Format$Builder tileCountVertical = format$Builder.setTileCountHorizontal(pairCreate != null ? ((Integer) pairCreate.first).intValue() : i13).setTileCountVertical(pairCreate != null ? ((Integer) pairCreate.second).intValue() : i13);
        if (p151v2.i.j(strC)) {
            tileCountVertical.f10542p = i7;
            tileCountVertical.f10543q = i8;
            tileCountVertical.f10544r = f7;
        } else if (p151v2.i.h(strC)) {
            tileCountVertical.f10550x = i9;
            tileCountVertical.f10551y = i10;
        } else if (p151v2.i.i(strC)) {
            if ("application/cea-608".equals(strC)) {
                int i28 = i12;
                while (true) {
                    if (i28 < arrayList2.size()) {
                        f fVar6 = (f) arrayList2.get(i28);
                        if (!"urn:scte:dash:cc:cea-608:2015".equals(fVar6.f13141a) || (str7 = fVar6.f13142b) == null) {
                            i16 = 1;
                        } else {
                            Matcher matcher = f13137c.matcher(str7);
                            if (matcher.matches()) {
                                i15 = Integer.parseInt(matcher.group(1));
                            } else {
                                i16 = 1;
                                Log.w("MpdParser", "Unable to parse CEA-608 channel number from: ".concat(str7));
                            }
                        }
                        i28 += i16;
                    } else {
                        i15 = i13;
                    }
                }
            } else if ("application/cea-708".equals(strC)) {
                int i29 = i12;
                while (true) {
                    if (i29 < arrayList2.size()) {
                        f fVar7 = (f) arrayList2.get(i29);
                        if (!"urn:scte:dash:cc:cea-708:2015".equals(fVar7.f13141a) || (str6 = fVar7.f13142b) == null) {
                            i14 = 1;
                        } else {
                            Matcher matcher2 = f13138d.matcher(str6);
                            if (matcher2.matches()) {
                                i15 = Integer.parseInt(matcher2.group(1));
                            } else {
                                i14 = 1;
                                Log.w("MpdParser", "Unable to parse CEA-708 service block number from: ".concat(str6));
                            }
                        }
                        i29 += i14;
                    } else {
                        i15 = i13;
                    }
                }
            } else {
                i15 = i13;
            }
            tileCountVertical.f10526C = i15;
        } else if ("image".equals(p151v2.i.f(strC))) {
            tileCountVertical.f10542p = i7;
            tileCountVertical.f10543q = i8;
        }
        tileCountVertical.getClass();
        return new X(tileCountVertical);
    }

    public static void d(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (p151v2.a.u(xmlPullParser)) {
            int i7 = 1;
            while (i7 != 0) {
                xmlPullParser.next();
                if (p151v2.a.u(xmlPullParser)) {
                    i7++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i7--;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x009a  */
    /* JADX WARN: Code duplicated, block: B:75:0x00df A[PHI: r0
      0x00df: PHI (r0v9 int) = (r0v3 int), (r0v0 int), (r0v4 int), (r0v5 int), (r0v6 int), (r0v7 int), (r0v12 int) binds: [B:80:0x00ee, B:70:0x00d5, B:74:0x00de, B:73:0x00dc, B:72:0x00d9, B:51:0x009a, B:42:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Switch 'out' block B:75:0x00df for B:70:0x00d5 already processed. Defaulting to fallback option. */
    public static int e(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int iM = 6;
        byte b7 = 3;
        int iM2 = -1;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = null;
        }
        attributeValue.getClass();
        switch (attributeValue) {
            case "urn:dts:dash:audio_channel_configuration:2012":
            case "tag:dts.com,2014:dash:audio_channel_configuration:2012":
                iM = m(xmlPullParser, "value", -1);
                if (iM > 0 && iM < 33) {
                    iM2 = iM;
                    break;
                }
                break;
            case "urn:mpeg:dash:23003:3:audio_channel_configuration:2011":
                iM2 = m(xmlPullParser, "value", -1);
                break;
            case "tag:dolby.com,2014:dash:audio_channel_configuration:2011":
            case "urn:dolby:dash:audio_channel_configuration:2011":
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue2 != null) {
                    String strA0 = D.a0(attributeValue2);
                    strA0.getClass();
                    switch (strA0.hashCode()) {
                        case 1596796:
                            b7 = !strA0.equals("4000") ? (byte) -1 : (byte) 0;
                            break;
                        case 2937391:
                            b7 = !strA0.equals("a000") ? (byte) -1 : (byte) 1;
                            break;
                        case 3094035:
                            b7 = !strA0.equals("f801") ? (byte) -1 : (byte) 2;
                            break;
                        case 3133436:
                            if (!strA0.equals("fa01")) {
                                b7 = -1;
                            }
                            break;
                        default:
                            b7 = -1;
                            break;
                    }
                    switch (b7) {
                        case 0:
                            iM = 1;
                            break;
                        case 1:
                            iM = 2;
                            break;
                        case 2:
                            break;
                        case 3:
                            iM = 8;
                            break;
                        default:
                            iM = -1;
                            break;
                    }
                } else {
                    iM = -1;
                }
                iM2 = iM;
                break;
            case "urn:mpeg:mpegB:cicp:ChannelConfiguration":
                int iM3 = m(xmlPullParser, "value", -1);
                if (iM3 >= 0) {
                    int[] iArr = f13139e;
                    if (iM3 < iArr.length) {
                        iM2 = iArr[iM3];
                    }
                    break;
                }
                break;
            case "tag:dts.com,2018:uhd:audio_channel_configuration":
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue3 != null && (iM = Integer.bitCount(Integer.parseInt(attributeValue3, 16))) != 0) {
                    iM2 = iM;
                    break;
                }
                break;
        }
        do {
            xmlPullParser.next();
        } while (!p151v2.a.t(xmlPullParser, "AudioChannelConfiguration"));
        return iM2;
    }

    public static long f(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static ArrayList g(XmlPullParser xmlPullParser, List list, boolean z4) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i7 = attributeValue != null ? Integer.parseInt(attributeValue) : z4 ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i8 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                d(xmlPullParser);
            }
        } while (!p151v2.a.t(xmlPullParser, "BaseURL"));
        if (text != null && p151v2.a.q(text)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = text;
            }
            return AbstractC0158p.i(new b(text, attributeValue3, i7, i8));
        }
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < list.size(); i9++) {
            b bVar = (b) list.get(i9);
            String strC = p151v2.a.C(bVar.f13111a, text);
            String str = attributeValue3 == null ? strC : attributeValue3;
            if (z4) {
                i7 = bVar.f13113c;
                i8 = bVar.f13114d;
                str = bVar.f13112b;
            }
            arrayList.add(new b(strC, str, i7, i8));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:79:0x012c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x012e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0151  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v14, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static Pair h(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String attributeValue;
        UUID uuid;
        UUID uuid2;
        ?? attributeValue2;
        ?? A7;
        UUID uuid3;
        String attributeValue3;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue4 != null) {
            String strA0 = D.a0(attributeValue4);
            strA0.getClass();
            switch (strA0) {
                case "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e":
                    uuid = AbstractC0029l.f464c;
                    attributeValue = null;
                    uuid2 = null;
                    attributeValue2 = uuid2;
                    A7 = uuid2;
                    break;
                case "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95":
                    uuid = AbstractC0029l.f466e;
                    attributeValue = null;
                    uuid2 = null;
                    attributeValue2 = uuid2;
                    A7 = uuid2;
                    break;
                case "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed":
                    uuid = AbstractC0029l.f465d;
                    attributeValue = null;
                    uuid2 = null;
                    attributeValue2 = uuid2;
                    A7 = uuid2;
                    break;
                case "urn:mpeg:dash:mp4protection:2011":
                    attributeValue = xmlPullParser.getAttributeValue(null, "value");
                    int attributeCount = xmlPullParser.getAttributeCount();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= attributeCount) {
                            attributeValue3 = null;
                        } else {
                            String attributeName = xmlPullParser.getAttributeName(i7);
                            int iIndexOf = attributeName.indexOf(58);
                            if (iIndexOf != -1) {
                                attributeName = attributeName.substring(iIndexOf + 1);
                            }
                            if (attributeName.equals("default_KID")) {
                                attributeValue3 = xmlPullParser.getAttributeValue(i7);
                            } else {
                                i7++;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(attributeValue3) && !StringUtils.PROPER_NIL_UUID.equals(attributeValue3)) {
                        String[] strArrSplit = attributeValue3.split("\\s+");
                        UUID[] uuidArr = new UUID[strArrSplit.length];
                        for (int i8 = 0; i8 < strArrSplit.length; i8++) {
                            uuidArr[i8] = UUID.fromString(strArrSplit[i8]);
                        }
                        uuid = AbstractC0029l.f463b;
                        attributeValue2 = 0;
                        A7 = N1.p.a(uuid, uuidArr, null);
                        break;
                    } else {
                        uuid = null;
                        uuid2 = uuid;
                        attributeValue2 = uuid2;
                        A7 = uuid2;
                        break;
                    }
                    break;
                default:
                    attributeValue = null;
                    uuid = null;
                    uuid2 = uuid;
                    attributeValue2 = uuid2;
                    A7 = uuid2;
                    break;
            }
        } else {
            attributeValue = null;
            uuid = null;
            uuid2 = uuid;
            attributeValue2 = uuid2;
            A7 = uuid2;
        }
        do {
            xmlPullParser.next();
            if (p151v2.a.v(xmlPullParser, "clearkey:Laurl") && xmlPullParser.next() == 4) {
                A7 = A7;
                attributeValue2 = xmlPullParser.getText();
            } else if (p151v2.a.v(xmlPullParser, "ms:laurl")) {
                A7 = A7;
                attributeValue2 = xmlPullParser.getAttributeValue(null, "licenseUrl");
            } else if (A7 == 0 && p151v2.a.u(xmlPullParser)) {
                String name = xmlPullParser.getName();
                int iIndexOf2 = name.indexOf(58);
                if (iIndexOf2 != -1) {
                    name = name.substring(iIndexOf2 + 1);
                }
                if (name.equals("pssh") && xmlPullParser.next() == 4) {
                    byte[] bArrDecode = Base64.decode(xmlPullParser.getText(), 0);
                    p096n1.e eVarB = N1.p.b(bArrDecode);
                    UUID uuid4 = eVarB == null ? null : (UUID) eVarB.f15314b;
                    if (uuid4 == null) {
                        Log.w("MpdParser", "Skipping malformed cenc:pssh data");
                        uuid = uuid4;
                        A7 = 0;
                        attributeValue2 = attributeValue2;
                    } else {
                        UUID uuid5 = uuid4;
                        A7 = bArrDecode;
                        uuid = uuid5;
                        attributeValue2 = attributeValue2;
                    }
                } else if (A7 == 0) {
                    uuid3 = AbstractC0029l.f466e;
                    if (!uuid3.equals(uuid)) {
                        d(xmlPullParser);
                        A7 = A7;
                        attributeValue2 = attributeValue2;
                    } else {
                        d(xmlPullParser);
                        A7 = A7;
                        attributeValue2 = attributeValue2;
                    }
                } else {
                    d(xmlPullParser);
                    A7 = A7;
                    attributeValue2 = attributeValue2;
                }
            } else if (A7 == 0) {
                uuid3 = AbstractC0029l.f466e;
                if (!uuid3.equals(uuid) && p151v2.a.v(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                    A7 = N1.p.a(uuid3, null, Base64.decode(xmlPullParser.getText(), 0));
                    attributeValue2 = attributeValue2;
                } else {
                    d(xmlPullParser);
                    A7 = A7;
                    attributeValue2 = attributeValue2;
                }
            } else {
                d(xmlPullParser);
                A7 = A7;
                attributeValue2 = attributeValue2;
            }
        } while (!p151v2.a.t(xmlPullParser, "ContentProtection"));
        return Pair.create(attributeValue, uuid != null ? new DrmInitData.SchemeData(uuid, attributeValue2, "video/mp4", A7) : null);
    }

    public static int i(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if (RRWebVideoEvent.EVENT_TAG.equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public static f j(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!p151v2.a.t(xmlPullParser, str));
        return new f(attributeValue, attributeValue2, str2);
    }

    public static long k(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = p151v2.t.f17166h.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d7 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d8 = d7 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d9 = d8 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d10 = d9 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d11 = d10 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j3 = (long) ((d11 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return !zIsEmpty ? -j3 : j3;
    }

    public static float l(XmlPullParser xmlPullParser, float f7) {
        String attributeValue = xmlPullParser.getAttributeValue(null, RRWebVideoEvent.JsonKeys.FRAME_RATE);
        if (attributeValue == null) {
            return f7;
        }
        Matcher matcher = f13136b.matcher(attributeValue);
        if (!matcher.matches()) {
            return f7;
        }
        int i7 = Integer.parseInt(matcher.group(1));
        String strGroup = matcher.group(2);
        return !TextUtils.isEmpty(strGroup) ? i7 / Integer.parseInt(strGroup) : i7;
    }

    public static int m(XmlPullParser xmlPullParser, String str, int i7) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i7 : Integer.parseInt(attributeValue);
    }

    public static long n(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:242:0x08bc  */
    /* JADX WARN: Code duplicated, block: B:243:0x08bf  */
    /* JADX WARN: Code duplicated, block: B:246:0x08da  */
    /* JADX WARN: Code duplicated, block: B:247:0x08dd  */
    /* JADX WARN: Code duplicated, block: B:251:0x08fe  */
    /* JADX WARN: Code duplicated, block: B:253:0x0902 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:254:0x0904  */
    /* JADX WARN: Code duplicated, block: B:255:0x0906  */
    /* JADX WARN: Code duplicated, block: B:260:0x0921 A[LOOP:11: B:196:0x064a->B:260:0x0921, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:294:0x0aac  */
    /* JADX WARN: Code duplicated, block: B:296:0x0abc  */
    /* JADX WARN: Code duplicated, block: B:299:0x0ac2  */
    /* JADX WARN: Code duplicated, block: B:302:0x0ad1  */
    /* JADX WARN: Code duplicated, block: B:305:0x0ad9  */
    /* JADX WARN: Code duplicated, block: B:314:0x0afe  */
    /* JADX WARN: Code duplicated, block: B:317:0x0b06  */
    /* JADX WARN: Code duplicated, block: B:323:0x0b2e  */
    /* JADX WARN: Code duplicated, block: B:327:0x0b3e  */
    /* JADX WARN: Code duplicated, block: B:330:0x0b4b  */
    /* JADX WARN: Code duplicated, block: B:333:0x0b53  */
    /* JADX WARN: Code duplicated, block: B:344:0x0b7c  */
    /* JADX WARN: Code duplicated, block: B:350:0x0b92  */
    /* JADX WARN: Code duplicated, block: B:353:0x0bb0  */
    /* JADX WARN: Code duplicated, block: B:354:0x0bc8  */
    /* JADX WARN: Code duplicated, block: B:356:0x0bcc  */
    /* JADX WARN: Code duplicated, block: B:361:0x0c25 A[LOOP:5: B:129:0x03c2->B:361:0x0c25, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:432:0x0f32 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:433:0x0f34  */
    /* JADX WARN: Code duplicated, block: B:436:0x0f53  */
    /* JADX WARN: Code duplicated, block: B:438:0x0f5f  */
    /* JADX WARN: Code duplicated, block: B:440:0x0f63  */
    /* JADX WARN: Code duplicated, block: B:443:0x0f6e A[LOOP:4: B:115:0x02c2->B:443:0x0f6e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:465:0x0bee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:466:0x0f3b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:471:0x0f15 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:472:0x0a9b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:476:0x0af5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:482:0x0b7f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:484:0x089c A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static c o(XmlPullParser xmlPullParser, Uri uri) throws XmlPullParserException, IOException {
        boolean z4;
        long j;
        int i7;
        long j3;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        ArrayList arrayList3;
        String str2;
        String str3;
        boolean z7;
        ArrayList arrayList4;
        String str4;
        String str5;
        long jF;
        s sVarU;
        String str6;
        long j7;
        String str7;
        ArrayList arrayList5;
        ArrayList arrayList6;
        String str8;
        long jF2;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        String str9;
        ArrayList arrayList10;
        String str10;
        ArrayList arrayList11;
        String str11;
        long j8;
        String str12;
        ArrayList arrayList12;
        String str13;
        ArrayList arrayList13;
        String str14;
        String str15;
        ArrayList arrayList14;
        String str16;
        int i8;
        String str17;
        long j9;
        ArrayList arrayList15;
        ArrayList arrayList16;
        String str18;
        String str19;
        ArrayList arrayList17;
        ArrayList arrayList18;
        ArrayList arrayList19;
        ArrayList arrayList20;
        String str20;
        s rVar;
        ArrayList arrayList21;
        int i9;
        boolean z8;
        ArrayList arrayList22;
        int i10;
        ArrayList arrayList23;
        Format$Builder format$BuilderA;
        String str21;
        ArrayList arrayList24;
        String str22;
        ArrayList arrayList25;
        X x4;
        s sVar;
        boolean z9;
        ArrayList arrayList26;
        ArrayList arrayList27;
        long j10;
        AbstractC0167z abstractC0167z;
        m kVar;
        int i11;
        String str23;
        int i12;
        DrmInitData.SchemeData schemeData;
        int size;
        DrmInitData.SchemeData schemeData2;
        int i13;
        DrmInitData.SchemeData schemeData3;
        UUID uuid;
        UUID uuid2;
        int i14;
        DrmInitData.SchemeData schemeData4;
        String str24;
        Pair pairCreate;
        h hVar;
        long jLongValue;
        float f7;
        long j11;
        float f8;
        long j12;
        int i15 = 0;
        String[] strArrSplit = new String[0];
        String str25 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "profiles");
        if (attributeValue != null) {
            strArrSplit = attributeValue.split(",");
        }
        int length = strArrSplit.length;
        int i16 = 0;
        while (true) {
            if (i16 >= length) {
                z4 = false;
                break;
            }
            if (strArrSplit[i16].startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                z4 = true;
                break;
            }
            i16++;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "availabilityStartTime");
        long j13 = -9223372036854775807L;
        long jH = attributeValue2 == null ? -9223372036854775807L : p151v2.t.H(attributeValue2);
        long jK = k(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long jK2 = k(xmlPullParser, "minBufferTime", -9223372036854775807L);
        boolean zEquals = "dynamic".equals(xmlPullParser.getAttributeValue(null, "type"));
        long jK3 = zEquals ? k(xmlPullParser, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long jK4 = zEquals ? k(xmlPullParser, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long jK5 = zEquals ? k(xmlPullParser, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "publishTime");
        long jH2 = attributeValue3 == null ? -9223372036854775807L : p151v2.t.H(attributeValue3);
        long jF3 = zEquals ? 0L : -9223372036854775807L;
        ArrayList arrayListI = AbstractC0158p.i(new b(uri.toString(), uri.toString(), z4 ? 1 : Integer.MIN_VALUE, 1));
        ArrayList arrayList28 = new ArrayList();
        ArrayList arrayList29 = new ArrayList();
        i iVar = null;
        C0815k c0815k = null;
        Uri uriD = null;
        t tVar = null;
        boolean z10 = false;
        long j14 = zEquals ? -9223372036854775807L : 0L;
        boolean z11 = false;
        while (true) {
            xmlPullParser.next();
            String str26 = "BaseURL";
            if (p151v2.a.v(xmlPullParser, "BaseURL")) {
                if (!z11) {
                    jF3 = f(xmlPullParser, jF3);
                    z11 = true;
                }
                arrayList29.addAll(g(xmlPullParser, arrayListI, z4));
                arrayList29 = arrayList29;
                arrayListI = arrayListI;
                arrayList28 = arrayList28;
                z4 = z4;
                i7 = i15;
                long j15 = j13;
                j14 = j14;
                j = j15;
            } else {
                String str27 = "lang";
                if (p151v2.a.v(xmlPullParser, "ProgramInformation")) {
                    String attributeValue4 = xmlPullParser.getAttributeValue(str25, "moreInformationURL");
                    String str28 = attributeValue4 == null ? str25 : attributeValue4;
                    String attributeValue5 = xmlPullParser.getAttributeValue(str25, "lang");
                    String str29 = attributeValue5 == null ? str25 : attributeValue5;
                    String strNextText = str25;
                    String strNextText2 = strNextText;
                    String strNextText3 = strNextText2;
                    do {
                        xmlPullParser.next();
                        if (p151v2.a.v(xmlPullParser, "Title")) {
                            strNextText = xmlPullParser.nextText();
                        } else if (p151v2.a.v(xmlPullParser, "Source")) {
                            strNextText2 = xmlPullParser.nextText();
                        } else if (p151v2.a.v(xmlPullParser, "Copyright")) {
                            strNextText3 = xmlPullParser.nextText();
                        } else {
                            d(xmlPullParser);
                        }
                    } while (!p151v2.a.t(xmlPullParser, "ProgramInformation"));
                    iVar = new i(strNextText, strNextText2, strNextText3, str28, str29);
                } else {
                    String str30 = "value";
                    String str31 = "schemeIdUri";
                    if (p151v2.a.v(xmlPullParser, "UTCTiming")) {
                        c0815k = new C0815k(xmlPullParser.getAttributeValue(str25, "schemeIdUri"), xmlPullParser.getAttributeValue(str25, "value"));
                    } else if (p151v2.a.v(xmlPullParser, "Location")) {
                        uriD = p151v2.a.D(uri.toString(), xmlPullParser.nextText());
                    } else if (p151v2.a.v(xmlPullParser, "ServiceDescription")) {
                        float f9 = -3.4028235E38f;
                        float f10 = -3.4028235E38f;
                        long j16 = -9223372036854775807L;
                        long j17 = -9223372036854775807L;
                        long jN = -9223372036854775807L;
                        while (true) {
                            xmlPullParser.next();
                            long j18 = jF3;
                            if (p151v2.a.v(xmlPullParser, "Latency")) {
                                long jN2 = n(xmlPullParser, "target", -9223372036854775807L);
                                long jN3 = n(xmlPullParser, "min", -9223372036854775807L);
                                jN = n(xmlPullParser, "max", -9223372036854775807L);
                                j12 = jN3;
                                f7 = f9;
                                f8 = f10;
                                j11 = jN2;
                            } else {
                                if (p151v2.a.v(xmlPullParser, "PlaybackRate")) {
                                    String attributeValue6 = xmlPullParser.getAttributeValue(null, "min");
                                    f9 = attributeValue6 == null ? -3.4028235E38f : Float.parseFloat(attributeValue6);
                                    String attributeValue7 = xmlPullParser.getAttributeValue(null, "max");
                                    f10 = attributeValue7 == null ? -3.4028235E38f : Float.parseFloat(attributeValue7);
                                }
                                f7 = f9;
                                j11 = j16;
                                f8 = f10;
                                j12 = j17;
                            }
                            long j19 = jN;
                            if (p151v2.a.t(xmlPullParser, "ServiceDescription")) {
                                tVar = new t(j11, j12, j19, f7, f8);
                                arrayList29 = arrayList29;
                                arrayListI = arrayListI;
                                arrayList28 = arrayList28;
                                jF3 = j18;
                                j = -9223372036854775807L;
                                i7 = 0;
                            } else {
                                jF3 = j18;
                                j16 = j11;
                                j17 = j12;
                                jN = j19;
                                f9 = f7;
                                f10 = f8;
                            }
                        }
                    } else {
                        long j20 = jF3;
                        String str32 = "Period";
                        if (!p151v2.a.v(xmlPullParser, "Period") || z10) {
                            arrayList29 = arrayList29;
                            arrayListI = arrayListI;
                            arrayList28 = arrayList28;
                            z4 = z4;
                            long j21 = j14;
                            j20 = j20;
                            j = -9223372036854775807L;
                            i7 = 0;
                            d(xmlPullParser);
                            j14 = j21;
                        } else {
                            ArrayList arrayList30 = !arrayList29.isEmpty() ? arrayList29 : arrayListI;
                            String str33 = "id";
                            String attributeValue8 = xmlPullParser.getAttributeValue(null, "id");
                            long jK6 = k(xmlPullParser, "start", j14);
                            long j22 = jH != -9223372036854775807L ? jH + jK6 : -9223372036854775807L;
                            long j23 = j14;
                            long jK7 = k(xmlPullParser, "duration", -9223372036854775807L);
                            ArrayList arrayList31 = new ArrayList();
                            String str34 = "duration";
                            ArrayList arrayList32 = new ArrayList();
                            ArrayList arrayList33 = new ArrayList();
                            long j24 = -9223372036854775807L;
                            arrayListI = arrayListI;
                            ArrayList arrayList34 = arrayList28;
                            long jF4 = j20;
                            s sVarS = null;
                            boolean z12 = false;
                            while (true) {
                                xmlPullParser.next();
                                if (p151v2.a.v(xmlPullParser, str26)) {
                                    if (!z12) {
                                        jF4 = f(xmlPullParser, jF4);
                                        z12 = true;
                                    }
                                    arrayList33.addAll(g(xmlPullParser, arrayList30, z4));
                                    arrayList29 = arrayList29;
                                    str26 = str26;
                                    str2 = str33;
                                    str3 = str30;
                                    arrayList2 = arrayList30;
                                    z4 = z4;
                                    str6 = str32;
                                    arrayList = arrayList33;
                                    j20 = j20;
                                    arrayList4 = arrayList32;
                                    z7 = true;
                                    i7 = 0;
                                    str5 = str31;
                                    str = str27;
                                    str4 = str34;
                                    arrayList3 = arrayList31;
                                } else {
                                    ArrayList arrayList35 = arrayList31;
                                    String str35 = str32;
                                    ArrayList arrayList36 = arrayList30;
                                    if (p151v2.a.v(xmlPullParser, "AdaptationSet")) {
                                        String str36 = "AdaptationSet";
                                        ArrayList arrayList37 = !arrayList33.isEmpty() ? arrayList33 : arrayList36;
                                        int iM = m(xmlPullParser, str33, -1);
                                        int i17 = i(xmlPullParser);
                                        String str37 = "mimeType";
                                        ArrayList arrayList38 = arrayList29;
                                        String attributeValue9 = xmlPullParser.getAttributeValue(null, "mimeType");
                                        arrayList = arrayList33;
                                        String str38 = "codecs";
                                        String attributeValue10 = xmlPullParser.getAttributeValue(null, "codecs");
                                        j3 = jF4;
                                        int iM2 = m(xmlPullParser, "width", -1);
                                        String str39 = "SegmentTemplate";
                                        String str40 = str30;
                                        int iM3 = m(xmlPullParser, "height", -1);
                                        float fL = l(xmlPullParser, -1.0f);
                                        String str41 = str31;
                                        String str42 = "SegmentList";
                                        String str43 = "SegmentBase";
                                        int iM4 = m(xmlPullParser, "audioSamplingRate", -1);
                                        String attributeValue11 = xmlPullParser.getAttributeValue(null, str27);
                                        String str44 = "audioSamplingRate";
                                        String attributeValue12 = xmlPullParser.getAttributeValue(null, "label");
                                        ArrayList arrayList39 = new ArrayList();
                                        String text = attributeValue12;
                                        ArrayList arrayList40 = new ArrayList();
                                        ArrayList arrayList41 = new ArrayList();
                                        int i18 = iM4;
                                        ArrayList arrayList42 = new ArrayList();
                                        float f11 = fL;
                                        ArrayList arrayList43 = new ArrayList();
                                        int i19 = iM3;
                                        ArrayList arrayList44 = new ArrayList();
                                        String str45 = "height";
                                        ArrayList arrayList45 = new ArrayList();
                                        ArrayList arrayList46 = new ArrayList();
                                        String str46 = "width";
                                        int i20 = iM2;
                                        String str47 = str33;
                                        ArrayList arrayList47 = arrayList41;
                                        s sVarU2 = sVarS;
                                        long jF5 = j24;
                                        int iG = i17;
                                        long j25 = j3;
                                        String str48 = attributeValue11;
                                        int iE = -1;
                                        String str49 = null;
                                        boolean z13 = false;
                                        while (true) {
                                            xmlPullParser.next();
                                            if (p151v2.a.v(xmlPullParser, str26)) {
                                                if (z13) {
                                                    jF2 = j25;
                                                } else {
                                                    jF2 = f(xmlPullParser, j25);
                                                    z13 = true;
                                                }
                                                arrayList46.addAll(g(xmlPullParser, arrayList37, z4));
                                            } else {
                                                jF2 = j25;
                                                if (p151v2.a.v(xmlPullParser, "ContentProtection")) {
                                                    Pair pairH = h(xmlPullParser);
                                                    Object obj = pairH.first;
                                                    if (obj != null) {
                                                        str49 = (String) obj;
                                                    }
                                                    Object obj2 = pairH.second;
                                                    if (obj2 != null) {
                                                        arrayList39.add((DrmInitData.SchemeData) obj2);
                                                    }
                                                } else {
                                                    if (p151v2.a.v(xmlPullParser, "ContentComponent")) {
                                                        String attributeValue13 = xmlPullParser.getAttributeValue(null, str27);
                                                        if (str48 == null) {
                                                            str48 = attributeValue13;
                                                        } else if (attributeValue13 != null) {
                                                            p151v2.a.h(str48.equals(attributeValue13));
                                                        }
                                                        int i21 = i(xmlPullParser);
                                                        if (iG == -1) {
                                                            iG = i21;
                                                        } else if (i21 != -1) {
                                                            p151v2.a.h(iG == i21);
                                                        }
                                                    } else {
                                                        if (p151v2.a.v(xmlPullParser, "Role")) {
                                                            arrayList42.add(j(xmlPullParser, "Role"));
                                                            iG = iG;
                                                            str26 = str26;
                                                            arrayList43 = arrayList43;
                                                            str48 = str48;
                                                            arrayList46 = arrayList46;
                                                            arrayList39 = arrayList39;
                                                            arrayList7 = arrayList42;
                                                            j20 = j20;
                                                            str35 = str35;
                                                            str36 = str36;
                                                            j3 = j3;
                                                            str39 = str39;
                                                            str40 = str40;
                                                            str41 = str41;
                                                            str42 = str42;
                                                            str44 = str44;
                                                            arrayList40 = arrayList40;
                                                            f11 = f11;
                                                            i19 = i19;
                                                            str45 = str45;
                                                            arrayList45 = arrayList45;
                                                            str46 = str46;
                                                            i20 = i20;
                                                            str47 = str47;
                                                            arrayList9 = arrayList47;
                                                            i7 = 0;
                                                            arrayList11 = arrayList37;
                                                        } else {
                                                            String str50 = "AudioChannelConfiguration";
                                                            if (p151v2.a.v(xmlPullParser, "AudioChannelConfiguration")) {
                                                                iE = e(xmlPullParser);
                                                                arrayList46 = arrayList46;
                                                                arrayList39 = arrayList39;
                                                                arrayList7 = arrayList42;
                                                                j20 = j20;
                                                                str35 = str35;
                                                                j3 = j3;
                                                                str39 = str39;
                                                                str40 = str40;
                                                                str41 = str41;
                                                                str42 = str42;
                                                                str44 = str44;
                                                                text = text;
                                                                arrayList40 = arrayList40;
                                                                f11 = f11;
                                                                i19 = i19;
                                                                str45 = str45;
                                                                arrayList45 = arrayList45;
                                                                str46 = str46;
                                                                i20 = i20;
                                                                str47 = str47;
                                                                arrayList9 = arrayList47;
                                                                j25 = jF2;
                                                                i18 = i18;
                                                                i7 = 0;
                                                                arrayList11 = arrayList37;
                                                                str = str27;
                                                                arrayList10 = arrayList44;
                                                                str10 = str38;
                                                                arrayList2 = arrayList36;
                                                                str12 = str36;
                                                                str11 = str43;
                                                                str9 = str37;
                                                                z4 = z4;
                                                                arrayList29 = arrayList38;
                                                            } else {
                                                                ArrayList arrayList48 = arrayList37;
                                                                if (p151v2.a.v(xmlPullParser, "Accessibility")) {
                                                                    ArrayList arrayList49 = arrayList47;
                                                                    arrayList49.add(j(xmlPullParser, "Accessibility"));
                                                                    iG = iG;
                                                                    str26 = str26;
                                                                    arrayList43 = arrayList43;
                                                                    str48 = str48;
                                                                    arrayList9 = arrayList49;
                                                                    arrayList46 = arrayList46;
                                                                    arrayList39 = arrayList39;
                                                                    arrayList7 = arrayList42;
                                                                } else {
                                                                    if (p151v2.a.v(xmlPullParser, "EssentialProperty")) {
                                                                        arrayList43.add(j(xmlPullParser, "EssentialProperty"));
                                                                        arrayList7 = arrayList42;
                                                                    } else {
                                                                        arrayList7 = arrayList42;
                                                                        if (p151v2.a.v(xmlPullParser, "SupplementalProperty")) {
                                                                            arrayList44.add(j(xmlPullParser, "SupplementalProperty"));
                                                                        } else {
                                                                            String str51 = "SupplementalProperty";
                                                                            String str52 = "Representation";
                                                                            String str53 = "InbandEventStream";
                                                                            if (p151v2.a.v(xmlPullParser, "Representation")) {
                                                                                String str54 = "ContentProtection";
                                                                                if (arrayList46.isEmpty()) {
                                                                                    arrayList12 = arrayList46;
                                                                                    str13 = null;
                                                                                    arrayList13 = arrayList48;
                                                                                } else {
                                                                                    arrayList12 = arrayList46;
                                                                                    arrayList13 = arrayList12;
                                                                                    str13 = null;
                                                                                }
                                                                                String attributeValue14 = xmlPullParser.getAttributeValue(str13, str47);
                                                                                String str55 = "EssentialProperty";
                                                                                int iM5 = m(xmlPullParser, "bandwidth", -1);
                                                                                String attributeValue15 = xmlPullParser.getAttributeValue(null, str37);
                                                                                String str56 = attributeValue15 == null ? attributeValue9 : attributeValue15;
                                                                                String attributeValue16 = xmlPullParser.getAttributeValue(null, str38);
                                                                                String str57 = attributeValue16 == null ? attributeValue10 : attributeValue16;
                                                                                String str58 = str46;
                                                                                int i22 = i20;
                                                                                int iM6 = m(xmlPullParser, str58, i22);
                                                                                int i23 = i22;
                                                                                String str59 = str45;
                                                                                int i24 = i19;
                                                                                String str60 = str27;
                                                                                int iM7 = m(xmlPullParser, str59, i24);
                                                                                String str61 = str48;
                                                                                float f12 = f11;
                                                                                float fL2 = l(xmlPullParser, f12);
                                                                                String str62 = str47;
                                                                                String str63 = str44;
                                                                                str10 = str38;
                                                                                int i25 = i18;
                                                                                int iM8 = m(xmlPullParser, str63, i25);
                                                                                i18 = i25;
                                                                                ArrayList arrayList50 = new ArrayList();
                                                                                ArrayList arrayList51 = new ArrayList();
                                                                                ArrayList arrayList52 = new ArrayList(arrayList43);
                                                                                ArrayList arrayList53 = new ArrayList(arrayList44);
                                                                                ArrayList arrayList54 = new ArrayList();
                                                                                str46 = str58;
                                                                                String str64 = str37;
                                                                                int i26 = i24;
                                                                                ArrayList arrayList55 = arrayList44;
                                                                                int iE2 = iE;
                                                                                long jF6 = jF2;
                                                                                s sVarU3 = sVarU2;
                                                                                long j26 = jF5;
                                                                                String str65 = null;
                                                                                boolean z14 = false;
                                                                                while (true) {
                                                                                    xmlPullParser.next();
                                                                                    if (p151v2.a.v(xmlPullParser, str26)) {
                                                                                        if (!z14) {
                                                                                            jF6 = f(xmlPullParser, jF6);
                                                                                            z14 = true;
                                                                                        }
                                                                                        arrayList54.addAll(g(xmlPullParser, arrayList13, z4));
                                                                                    } else {
                                                                                        iG = iG;
                                                                                        if (p151v2.a.v(xmlPullParser, str50)) {
                                                                                            iE2 = e(xmlPullParser);
                                                                                        } else {
                                                                                            String str66 = str43;
                                                                                            if (p151v2.a.v(xmlPullParser, str66)) {
                                                                                                str43 = str66;
                                                                                                sVarU3 = s(xmlPullParser, (r) sVarU3);
                                                                                            } else {
                                                                                                String str67 = str42;
                                                                                                if (p151v2.a.v(xmlPullParser, str67)) {
                                                                                                    long jF7 = f(xmlPullParser, j26);
                                                                                                    j20 = j20;
                                                                                                    arrayList11 = arrayList48;
                                                                                                    String str68 = str55;
                                                                                                    arrayList15 = arrayList13;
                                                                                                    str14 = str36;
                                                                                                    str9 = str64;
                                                                                                    str26 = str26;
                                                                                                    str15 = str66;
                                                                                                    i8 = iG;
                                                                                                    arrayList29 = arrayList38;
                                                                                                    arrayList43 = arrayList43;
                                                                                                    str48 = str61;
                                                                                                    long j27 = j3;
                                                                                                    f11 = f12;
                                                                                                    i20 = i23;
                                                                                                    j3 = j27;
                                                                                                    str44 = str63;
                                                                                                    str41 = str41;
                                                                                                    arrayList8 = arrayList40;
                                                                                                    str47 = str62;
                                                                                                    arrayList9 = arrayList47;
                                                                                                    jF2 = jF2;
                                                                                                    str17 = str50;
                                                                                                    String str69 = str54;
                                                                                                    arrayList16 = arrayList54;
                                                                                                    str18 = str69;
                                                                                                    j9 = jF6;
                                                                                                    str40 = str40;
                                                                                                    str = str60;
                                                                                                    arrayList10 = arrayList55;
                                                                                                    i19 = i26;
                                                                                                    str45 = str59;
                                                                                                    String str70 = str39;
                                                                                                    arrayList14 = arrayList45;
                                                                                                    arrayList46 = arrayList12;
                                                                                                    arrayList2 = arrayList36;
                                                                                                    z4 = z4;
                                                                                                    sVarU3 = t(xmlPullParser, (o) sVarU3, j22, jK7, jF6, jF7, jK4);
                                                                                                    arrayList39 = arrayList39;
                                                                                                    str35 = str35;
                                                                                                    str16 = str68;
                                                                                                    str53 = str53;
                                                                                                    str51 = str51;
                                                                                                    str52 = str52;
                                                                                                    str20 = str65;
                                                                                                    arrayList17 = arrayList50;
                                                                                                    arrayList18 = arrayList51;
                                                                                                    arrayList19 = arrayList52;
                                                                                                    arrayList20 = arrayList53;
                                                                                                    j26 = jF7;
                                                                                                    i7 = 0;
                                                                                                    str19 = str70;
                                                                                                    str42 = str67;
                                                                                                } else {
                                                                                                    str44 = str63;
                                                                                                    str45 = str59;
                                                                                                    j20 = j20;
                                                                                                    str14 = str36;
                                                                                                    str40 = str40;
                                                                                                    str41 = str41;
                                                                                                    str15 = str66;
                                                                                                    arrayList8 = arrayList40;
                                                                                                    str47 = str62;
                                                                                                    str = str60;
                                                                                                    arrayList14 = arrayList45;
                                                                                                    arrayList9 = arrayList47;
                                                                                                    jF2 = jF2;
                                                                                                    arrayList11 = arrayList48;
                                                                                                    arrayList46 = arrayList12;
                                                                                                    str16 = str55;
                                                                                                    str48 = str61;
                                                                                                    arrayList10 = arrayList55;
                                                                                                    i19 = i26;
                                                                                                    str9 = str64;
                                                                                                    i8 = iG;
                                                                                                    str26 = str26;
                                                                                                    arrayList43 = arrayList43;
                                                                                                    str17 = str50;
                                                                                                    j9 = jF6;
                                                                                                    arrayList15 = arrayList13;
                                                                                                    arrayList29 = arrayList38;
                                                                                                    String str71 = str39;
                                                                                                    arrayList2 = arrayList36;
                                                                                                    z4 = z4;
                                                                                                    long j28 = j3;
                                                                                                    f11 = f12;
                                                                                                    i20 = i23;
                                                                                                    j3 = j28;
                                                                                                    String str72 = str54;
                                                                                                    arrayList16 = arrayList54;
                                                                                                    str18 = str72;
                                                                                                    if (p151v2.a.v(xmlPullParser, str71)) {
                                                                                                        long jF8 = f(xmlPullParser, j26);
                                                                                                        arrayList39 = arrayList39;
                                                                                                        str35 = str35;
                                                                                                        i7 = 0;
                                                                                                        str19 = str71;
                                                                                                        str42 = str67;
                                                                                                        sVarU3 = u(xmlPullParser, (p) sVarU3, arrayList10, j22, jK7, j9, jF8, jK4);
                                                                                                        j26 = jF8;
                                                                                                        str20 = str65;
                                                                                                        arrayList17 = arrayList50;
                                                                                                    } else {
                                                                                                        arrayList39 = arrayList39;
                                                                                                        str35 = str35;
                                                                                                        i7 = 0;
                                                                                                        str19 = str71;
                                                                                                        str42 = str67;
                                                                                                        if (p151v2.a.v(xmlPullParser, str18)) {
                                                                                                            Pair pairH2 = h(xmlPullParser);
                                                                                                            Object obj3 = pairH2.first;
                                                                                                            if (obj3 != null) {
                                                                                                                str65 = (String) obj3;
                                                                                                            }
                                                                                                            Object obj4 = pairH2.second;
                                                                                                            if (obj4 != null) {
                                                                                                                arrayList17 = arrayList50;
                                                                                                                arrayList17.add((DrmInitData.SchemeData) obj4);
                                                                                                            } else {
                                                                                                                arrayList17 = arrayList50;
                                                                                                            }
                                                                                                            str20 = str65;
                                                                                                        } else {
                                                                                                            str53 = str53;
                                                                                                            arrayList17 = arrayList50;
                                                                                                            if (p151v2.a.v(xmlPullParser, str53)) {
                                                                                                                arrayList18 = arrayList51;
                                                                                                                arrayList18.add(j(xmlPullParser, str53));
                                                                                                                str16 = str16;
                                                                                                                arrayList19 = arrayList52;
                                                                                                            } else {
                                                                                                                str16 = str16;
                                                                                                                arrayList18 = arrayList51;
                                                                                                                if (p151v2.a.v(xmlPullParser, str16)) {
                                                                                                                    arrayList19 = arrayList52;
                                                                                                                    arrayList19.add(j(xmlPullParser, str16));
                                                                                                                } else {
                                                                                                                    str51 = str51;
                                                                                                                    arrayList19 = arrayList52;
                                                                                                                    if (p151v2.a.v(xmlPullParser, str51)) {
                                                                                                                        arrayList20 = arrayList53;
                                                                                                                        arrayList20.add(j(xmlPullParser, str51));
                                                                                                                    } else {
                                                                                                                        arrayList20 = arrayList53;
                                                                                                                        d(xmlPullParser);
                                                                                                                    }
                                                                                                                }
                                                                                                                str52 = str52;
                                                                                                                str20 = str65;
                                                                                                            }
                                                                                                            arrayList20 = arrayList53;
                                                                                                            str52 = str52;
                                                                                                            str20 = str65;
                                                                                                        }
                                                                                                    }
                                                                                                    arrayList18 = arrayList51;
                                                                                                    arrayList19 = arrayList52;
                                                                                                    arrayList20 = arrayList53;
                                                                                                }
                                                                                            }
                                                                                            if (p151v2.a.t(xmlPullParser, str52)) {
                                                                                                X xB = b(attributeValue14, str56, iM6, iM7, fL2, iE2, iM8, iM5, str48, arrayList7, arrayList9, str57, arrayList19, arrayList20);
                                                                                                if (sVarU3 != null) {
                                                                                                    rVar = sVarU3;
                                                                                                } else {
                                                                                                    rVar = new r(null, 1L, 0L, 0L, 0L);
                                                                                                }
                                                                                                if (arrayList16.isEmpty()) {
                                                                                                    arrayList21 = arrayList15;
                                                                                                } else {
                                                                                                    arrayList21 = arrayList16;
                                                                                                }
                                                                                                d dVar = new d(xB, arrayList21, rVar, str20, arrayList17, arrayList18, arrayList19, arrayList20);
                                                                                                iG = p151v2.i.g(xB.f283C);
                                                                                                i9 = i8;
                                                                                                if (i9 != -1) {
                                                                                                    if (iG != -1) {
                                                                                                        if (i9 == iG) {
                                                                                                            z8 = 1;
                                                                                                        } else {
                                                                                                            z8 = i7;
                                                                                                        }
                                                                                                        p151v2.a.h(z8);
                                                                                                    }
                                                                                                    iG = i9;
                                                                                                }
                                                                                                ArrayList arrayList56 = arrayList14;
                                                                                                arrayList56.add(dVar);
                                                                                                arrayList45 = arrayList56;
                                                                                                str39 = str19;
                                                                                                str12 = str14;
                                                                                                str11 = str15;
                                                                                            } else {
                                                                                                str53 = str53;
                                                                                                arrayList50 = arrayList17;
                                                                                                arrayList51 = arrayList18;
                                                                                                str51 = str51;
                                                                                                arrayList52 = arrayList19;
                                                                                                str65 = str20;
                                                                                                arrayList53 = arrayList20;
                                                                                                str52 = str52;
                                                                                                str63 = str44;
                                                                                                arrayList47 = arrayList9;
                                                                                                str60 = str;
                                                                                                i26 = i19;
                                                                                                j20 = j20;
                                                                                                z4 = z4;
                                                                                                f12 = f11;
                                                                                                arrayList36 = arrayList2;
                                                                                                arrayList55 = arrayList10;
                                                                                                str50 = str17;
                                                                                                arrayList48 = arrayList11;
                                                                                                arrayList38 = arrayList29;
                                                                                                jF6 = j9;
                                                                                                str26 = str26;
                                                                                                iG = i8;
                                                                                                str43 = str15;
                                                                                                str41 = str41;
                                                                                                str62 = str47;
                                                                                                arrayList40 = arrayList8;
                                                                                                jF2 = jF2;
                                                                                                str40 = str40;
                                                                                                str59 = str45;
                                                                                                arrayList45 = arrayList14;
                                                                                                arrayList12 = arrayList46;
                                                                                                arrayList39 = arrayList39;
                                                                                                str42 = str42;
                                                                                                str39 = str19;
                                                                                                str64 = str9;
                                                                                                arrayList13 = arrayList15;
                                                                                                str36 = str14;
                                                                                                str35 = str35;
                                                                                                str55 = str16;
                                                                                                arrayList43 = arrayList43;
                                                                                                ArrayList arrayList57 = arrayList16;
                                                                                                str54 = str18;
                                                                                                arrayList54 = arrayList57;
                                                                                                long j29 = j3;
                                                                                                i23 = i20;
                                                                                                j3 = j29;
                                                                                                str61 = str48;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    str44 = str63;
                                                                                    str45 = str59;
                                                                                    arrayList39 = arrayList39;
                                                                                    j20 = j20;
                                                                                    str35 = str35;
                                                                                    str14 = str36;
                                                                                    str19 = str39;
                                                                                    str40 = str40;
                                                                                    str41 = str41;
                                                                                    str15 = str43;
                                                                                    arrayList8 = arrayList40;
                                                                                    str47 = str62;
                                                                                    str = str60;
                                                                                    arrayList14 = arrayList45;
                                                                                    str53 = str53;
                                                                                    arrayList9 = arrayList47;
                                                                                    jF2 = jF2;
                                                                                    str51 = str51;
                                                                                    arrayList46 = arrayList12;
                                                                                    str52 = str52;
                                                                                    str48 = str61;
                                                                                    arrayList10 = arrayList55;
                                                                                    i19 = i26;
                                                                                    str9 = str64;
                                                                                    i8 = iG;
                                                                                    i7 = 0;
                                                                                    str26 = str26;
                                                                                    arrayList43 = arrayList43;
                                                                                    str17 = str50;
                                                                                    j9 = jF6;
                                                                                    arrayList2 = arrayList36;
                                                                                    arrayList29 = arrayList38;
                                                                                    str16 = str55;
                                                                                    str20 = str65;
                                                                                    arrayList17 = arrayList50;
                                                                                    arrayList19 = arrayList52;
                                                                                    arrayList20 = arrayList53;
                                                                                    z4 = z4;
                                                                                    arrayList15 = arrayList13;
                                                                                    str42 = str42;
                                                                                    arrayList11 = arrayList48;
                                                                                    long j30 = j3;
                                                                                    f11 = f12;
                                                                                    i20 = i23;
                                                                                    arrayList18 = arrayList51;
                                                                                    j3 = j30;
                                                                                    String str73 = str54;
                                                                                    arrayList16 = arrayList54;
                                                                                    str18 = str73;
                                                                                    if (p151v2.a.t(xmlPullParser, str52)) {
                                                                                        X xB2 = b(attributeValue14, str56, iM6, iM7, fL2, iE2, iM8, iM5, str48, arrayList7, arrayList9, str57, arrayList19, arrayList20);
                                                                                        if (sVarU3 != null) {
                                                                                            rVar = sVarU3;
                                                                                        } else {
                                                                                            rVar = new r(null, 1L, 0L, 0L, 0L);
                                                                                        }
                                                                                        if (arrayList16.isEmpty()) {
                                                                                            arrayList21 = arrayList16;
                                                                                        } else {
                                                                                            arrayList21 = arrayList15;
                                                                                        }
                                                                                        d dVar2 = new d(xB2, arrayList21, rVar, str20, arrayList17, arrayList18, arrayList19, arrayList20);
                                                                                        iG = p151v2.i.g(xB2.f283C);
                                                                                        i9 = i8;
                                                                                        if (i9 != -1) {
                                                                                            if (iG != -1) {
                                                                                                if (i9 == iG) {
                                                                                                    z8 = 1;
                                                                                                } else {
                                                                                                    z8 = i7;
                                                                                                }
                                                                                                p151v2.a.h(z8);
                                                                                            }
                                                                                            iG = i9;
                                                                                        }
                                                                                        ArrayList arrayList58 = arrayList14;
                                                                                        arrayList58.add(dVar2);
                                                                                        arrayList45 = arrayList58;
                                                                                        str39 = str19;
                                                                                        str12 = str14;
                                                                                        str11 = str15;
                                                                                    } else {
                                                                                        str53 = str53;
                                                                                        arrayList50 = arrayList17;
                                                                                        arrayList51 = arrayList18;
                                                                                        str51 = str51;
                                                                                        arrayList52 = arrayList19;
                                                                                        str65 = str20;
                                                                                        arrayList53 = arrayList20;
                                                                                        str52 = str52;
                                                                                        str63 = str44;
                                                                                        arrayList47 = arrayList9;
                                                                                        str60 = str;
                                                                                        i26 = i19;
                                                                                        j20 = j20;
                                                                                        z4 = z4;
                                                                                        f12 = f11;
                                                                                        arrayList36 = arrayList2;
                                                                                        arrayList55 = arrayList10;
                                                                                        str50 = str17;
                                                                                        arrayList48 = arrayList11;
                                                                                        arrayList38 = arrayList29;
                                                                                        jF6 = j9;
                                                                                        str26 = str26;
                                                                                        iG = i8;
                                                                                        str43 = str15;
                                                                                        str41 = str41;
                                                                                        str62 = str47;
                                                                                        arrayList40 = arrayList8;
                                                                                        jF2 = jF2;
                                                                                        str40 = str40;
                                                                                        str59 = str45;
                                                                                        arrayList45 = arrayList14;
                                                                                        arrayList12 = arrayList46;
                                                                                        arrayList39 = arrayList39;
                                                                                        str42 = str42;
                                                                                        str39 = str19;
                                                                                        str64 = str9;
                                                                                        arrayList13 = arrayList15;
                                                                                        str36 = str14;
                                                                                        str35 = str35;
                                                                                        str55 = str16;
                                                                                        arrayList43 = arrayList43;
                                                                                        ArrayList arrayList59 = arrayList16;
                                                                                        str54 = str18;
                                                                                        arrayList54 = arrayList59;
                                                                                        long j210 = j3;
                                                                                        i23 = i20;
                                                                                        j3 = j210;
                                                                                        str61 = str48;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                str26 = str26;
                                                                                arrayList43 = arrayList43;
                                                                                str48 = str48;
                                                                                arrayList46 = arrayList46;
                                                                                arrayList39 = arrayList39;
                                                                                j20 = j20;
                                                                                str35 = str35;
                                                                                str36 = str36;
                                                                                j3 = j3;
                                                                                String str74 = str39;
                                                                                str40 = str40;
                                                                                str41 = str41;
                                                                                str44 = str44;
                                                                                arrayList8 = arrayList40;
                                                                                f11 = f11;
                                                                                i19 = i19;
                                                                                str45 = str45;
                                                                                str46 = str46;
                                                                                i20 = i20;
                                                                                str47 = str47;
                                                                                arrayList9 = arrayList47;
                                                                                jF2 = jF2;
                                                                                i18 = i18;
                                                                                i7 = 0;
                                                                                str9 = str37;
                                                                                int i27 = iG;
                                                                                str = str27;
                                                                                arrayList10 = arrayList44;
                                                                                str10 = str38;
                                                                                arrayList2 = arrayList36;
                                                                                str42 = str42;
                                                                                String str75 = str43;
                                                                                arrayList11 = arrayList48;
                                                                                z4 = z4;
                                                                                arrayList29 = arrayList38;
                                                                                ArrayList arrayList60 = arrayList45;
                                                                                if (p151v2.a.v(xmlPullParser, str75)) {
                                                                                    sVarU2 = s(xmlPullParser, (r) sVarU2);
                                                                                    str11 = str75;
                                                                                    arrayList45 = arrayList60;
                                                                                    iG = i27;
                                                                                    str39 = str74;
                                                                                } else if (p151v2.a.v(xmlPullParser, str42)) {
                                                                                    jF5 = f(xmlPullParser, jF5);
                                                                                    j25 = jF2;
                                                                                    str11 = str75;
                                                                                    arrayList45 = arrayList60;
                                                                                    sVarU2 = t(xmlPullParser, (o) sVarU2, j22, jK7, j25, jF5, jK4);
                                                                                    iG = i27;
                                                                                    str39 = str74;
                                                                                    text = text;
                                                                                    str12 = str36;
                                                                                    str48 = str48;
                                                                                    arrayList40 = arrayList8;
                                                                                } else {
                                                                                    str11 = str75;
                                                                                    arrayList45 = arrayList60;
                                                                                    j8 = jF5;
                                                                                    if (p151v2.a.v(xmlPullParser, str74)) {
                                                                                        jF5 = f(xmlPullParser, j8);
                                                                                        str39 = str74;
                                                                                        sVarU2 = u(xmlPullParser, (p) sVarU2, arrayList10, j22, jK7, jF2, jF5, jK4);
                                                                                        iG = i27;
                                                                                    } else {
                                                                                        str39 = str74;
                                                                                        iG = i27;
                                                                                        if (p151v2.a.v(xmlPullParser, "InbandEventStream")) {
                                                                                            arrayList40 = arrayList8;
                                                                                            arrayList40.add(j(xmlPullParser, "InbandEventStream"));
                                                                                        } else {
                                                                                            arrayList40 = arrayList8;
                                                                                            if (p151v2.a.v(xmlPullParser, "Label")) {
                                                                                                text = "";
                                                                                                do {
                                                                                                    xmlPullParser.next();
                                                                                                    if (xmlPullParser.getEventType() == 4) {
                                                                                                        text = xmlPullParser.getText();
                                                                                                    } else {
                                                                                                        d(xmlPullParser);
                                                                                                    }
                                                                                                } while (!p151v2.a.t(xmlPullParser, "Label"));
                                                                                                jF5 = j8;
                                                                                                iG = iG;
                                                                                            } else if (p151v2.a.u(xmlPullParser)) {
                                                                                                d(xmlPullParser);
                                                                                            }
                                                                                            str12 = str36;
                                                                                            str48 = str48;
                                                                                            j25 = jF2;
                                                                                        }
                                                                                        jF5 = j8;
                                                                                        iG = iG;
                                                                                        text = text;
                                                                                        str12 = str36;
                                                                                        str48 = str48;
                                                                                        j25 = jF2;
                                                                                    }
                                                                                }
                                                                                str12 = str36;
                                                                            }
                                                                            str48 = str48;
                                                                            arrayList40 = arrayList8;
                                                                            j25 = jF2;
                                                                        }
                                                                    }
                                                                    arrayList9 = arrayList47;
                                                                }
                                                                arrayList11 = arrayList48;
                                                                i7 = 0;
                                                            }
                                                        }
                                                        str9 = str37;
                                                        str = str27;
                                                        arrayList10 = arrayList44;
                                                        str10 = str38;
                                                        arrayList2 = arrayList36;
                                                        str11 = str43;
                                                        j8 = jF5;
                                                        z4 = z4;
                                                        arrayList29 = arrayList38;
                                                        jF5 = j8;
                                                        iG = iG;
                                                        text = text;
                                                        str12 = str36;
                                                        str48 = str48;
                                                        j25 = jF2;
                                                    }
                                                    if (p151v2.a.t(xmlPullParser, str12)) {
                                                        arrayList22 = new ArrayList(arrayList45.size());
                                                        i10 = i7;
                                                        while (i10 < arrayList45.size()) {
                                                            arrayList23 = arrayList45;
                                                            d dVar3 = (d) arrayList23.get(i10);
                                                            format$BuilderA = dVar3.f13127a.a();
                                                            if (text != null) {
                                                                format$BuilderA.f10529b = text;
                                                            }
                                                            str21 = dVar3.f13130d;
                                                            if (str21 == null) {
                                                                str21 = str49;
                                                            }
                                                            arrayList24 = dVar3.f13131e;
                                                            ArrayList arrayList61 = arrayList39;
                                                            arrayList24.addAll(arrayList61);
                                                            if (arrayList24.isEmpty()) {
                                                                arrayList45 = arrayList23;
                                                                str22 = text;
                                                            } else {
                                                                i11 = i7;
                                                                while (true) {
                                                                    if (i11 < arrayList24.size()) {
                                                                        schemeData4 = (DrmInitData.SchemeData) arrayList24.get(i11);
                                                                        if (AbstractC0029l.f464c.equals(schemeData4.f10558b) || (str24 = schemeData4.f10559c) == null) {
                                                                            i11++;
                                                                        } else {
                                                                            arrayList24.remove(i11);
                                                                            str23 = str24;
                                                                        }
                                                                    } else {
                                                                        str23 = null;
                                                                    }
                                                                }
                                                                if (str23 != null) {
                                                                    i12 = i7;
                                                                    while (i12 < arrayList24.size()) {
                                                                        schemeData = (DrmInitData.SchemeData) arrayList24.get(i12);
                                                                        ArrayList arrayList62 = arrayList23;
                                                                        if (!AbstractC0029l.f463b.equals(schemeData.f10558b) && schemeData.f10559c == null) {
                                                                            arrayList24.set(i12, new DrmInitData.SchemeData(AbstractC0029l.f464c, str23, schemeData.f10560d, schemeData.f10561e));
                                                                        }
                                                                        i12++;
                                                                        text = text;
                                                                        arrayList23 = arrayList62;
                                                                    }
                                                                }
                                                                arrayList45 = arrayList23;
                                                                str22 = text;
                                                                for (size = arrayList24.size() - 1; size >= 0; size--) {
                                                                    schemeData2 = (DrmInitData.SchemeData) arrayList24.get(size);
                                                                    if (schemeData2.f10561e == null) {
                                                                        for (i13 = i7; i13 < arrayList24.size(); i13++) {
                                                                            schemeData3 = (DrmInitData.SchemeData) arrayList24.get(i13);
                                                                            if (schemeData3.f10561e != null && schemeData2.f10561e == null) {
                                                                                UUID uuid3 = schemeData2.f10558b;
                                                                                schemeData3.getClass();
                                                                                uuid = AbstractC0029l.f462a;
                                                                                uuid2 = schemeData3.f10558b;
                                                                                if (!uuid.equals(uuid2) || uuid3.equals(uuid2)) {
                                                                                    i14 = 1;
                                                                                } else {
                                                                                    i14 = i7;
                                                                                }
                                                                                if (i14 != 0) {
                                                                                    arrayList24.remove(size);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                format$BuilderA.f10540n = new DrmInitData(str21, arrayList24);
                                                            }
                                                            arrayList25 = dVar3.f13132f;
                                                            arrayList25.addAll(arrayList40);
                                                            x4 = new X(format$BuilderA);
                                                            sVar = dVar3.f13129c;
                                                            z9 = sVar instanceof r;
                                                            arrayList26 = dVar3.f13134h;
                                                            arrayList27 = dVar3.f13135i;
                                                            j10 = dVar3.f13133g;
                                                            abstractC0167z = dVar3.f13128b;
                                                            if (z9) {
                                                                kVar = new l(j10, x4, abstractC0167z, (r) sVar, arrayList25, arrayList26, arrayList27);
                                                            } else {
                                                                if (sVar instanceof n) {
                                                                    throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                                                }
                                                                kVar = new k(j10, x4, abstractC0167z, (n) sVar, arrayList25, arrayList26, arrayList27);
                                                            }
                                                            arrayList22.add(kVar);
                                                            i10++;
                                                            arrayList39 = arrayList61;
                                                            text = str22;
                                                        }
                                                        arrayList35.add(new a(iM, iG, arrayList22, arrayList9, arrayList43, arrayList10));
                                                        arrayList4 = arrayList32;
                                                        str5 = str41;
                                                        str2 = str47;
                                                        str3 = str40;
                                                        j = -9223372036854775807L;
                                                        z7 = true;
                                                        str4 = str34;
                                                        arrayList3 = arrayList35;
                                                    } else {
                                                        arrayList40 = arrayList40;
                                                        arrayList47 = arrayList9;
                                                        text = text;
                                                        str27 = str;
                                                        i19 = i19;
                                                        j20 = j20;
                                                        z4 = z4;
                                                        str37 = str9;
                                                        i20 = i20;
                                                        f11 = f11;
                                                        arrayList36 = arrayList2;
                                                        arrayList44 = arrayList10;
                                                        arrayList38 = arrayList29;
                                                        j3 = j3;
                                                        i18 = i18;
                                                        str26 = str26;
                                                        str46 = str46;
                                                        arrayList43 = arrayList43;
                                                        str41 = str41;
                                                        str47 = str47;
                                                        str40 = str40;
                                                        str45 = str45;
                                                        arrayList45 = arrayList45;
                                                        arrayList46 = arrayList46;
                                                        str35 = str35;
                                                        arrayList39 = arrayList39;
                                                        str39 = str39;
                                                        str36 = str12;
                                                        str43 = str11;
                                                        arrayList37 = arrayList11;
                                                        str38 = str10;
                                                        str42 = str42;
                                                        str44 = str44;
                                                        arrayList42 = arrayList7;
                                                    }
                                                }
                                            }
                                            arrayList46 = arrayList46;
                                            arrayList39 = arrayList39;
                                            arrayList7 = arrayList42;
                                            j20 = j20;
                                            str35 = str35;
                                            j3 = j3;
                                            str39 = str39;
                                            str40 = str40;
                                            str41 = str41;
                                            str42 = str42;
                                            str44 = str44;
                                            text = text;
                                            arrayList40 = arrayList40;
                                            f11 = f11;
                                            i19 = i19;
                                            str45 = str45;
                                            arrayList45 = arrayList45;
                                            str46 = str46;
                                            i20 = i20;
                                            str47 = str47;
                                            arrayList9 = arrayList47;
                                            j25 = jF2;
                                            i18 = i18;
                                            i7 = 0;
                                            arrayList11 = arrayList37;
                                            str = str27;
                                            arrayList10 = arrayList44;
                                            str10 = str38;
                                            arrayList2 = arrayList36;
                                            str12 = str36;
                                            str11 = str43;
                                            str9 = str37;
                                            z4 = z4;
                                            arrayList29 = arrayList38;
                                            if (p151v2.a.t(xmlPullParser, str12)) {
                                                arrayList22 = new ArrayList(arrayList45.size());
                                                i10 = i7;
                                                while (i10 < arrayList45.size()) {
                                                    arrayList23 = arrayList45;
                                                    d dVar4 = (d) arrayList23.get(i10);
                                                    format$BuilderA = dVar4.f13127a.a();
                                                    if (text != null) {
                                                        format$BuilderA.f10529b = text;
                                                    }
                                                    str21 = dVar4.f13130d;
                                                    if (str21 == null) {
                                                        str21 = str49;
                                                    }
                                                    arrayList24 = dVar4.f13131e;
                                                    ArrayList arrayList63 = arrayList39;
                                                    arrayList24.addAll(arrayList63);
                                                    if (arrayList24.isEmpty()) {
                                                        i11 = i7;
                                                        while (true) {
                                                            if (i11 < arrayList24.size()) {
                                                                schemeData4 = (DrmInitData.SchemeData) arrayList24.get(i11);
                                                                if (AbstractC0029l.f464c.equals(schemeData4.f10558b)) {
                                                                }
                                                                i11++;
                                                            } else {
                                                                str23 = null;
                                                            }
                                                        }
                                                        if (str23 != null) {
                                                            i12 = i7;
                                                            while (i12 < arrayList24.size()) {
                                                                schemeData = (DrmInitData.SchemeData) arrayList24.get(i12);
                                                                ArrayList arrayList64 = arrayList23;
                                                                if (!AbstractC0029l.f463b.equals(schemeData.f10558b)) {
                                                                }
                                                                i12++;
                                                                text = text;
                                                                arrayList23 = arrayList64;
                                                            }
                                                        }
                                                        arrayList45 = arrayList23;
                                                        str22 = text;
                                                        while (size >= 0) {
                                                            schemeData2 = (DrmInitData.SchemeData) arrayList24.get(size);
                                                            if (schemeData2.f10561e == null) {
                                                                while (i13 < arrayList24.size()) {
                                                                    schemeData3 = (DrmInitData.SchemeData) arrayList24.get(i13);
                                                                    if (schemeData3.f10561e != null) {
                                                                        UUID uuid4 = schemeData2.f10558b;
                                                                        schemeData3.getClass();
                                                                        uuid = AbstractC0029l.f462a;
                                                                        uuid2 = schemeData3.f10558b;
                                                                        if (uuid.equals(uuid2)) {
                                                                            i14 = 1;
                                                                        } else {
                                                                            i14 = 1;
                                                                        }
                                                                        if (i14 != 0) {
                                                                            arrayList24.remove(size);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        format$BuilderA.f10540n = new DrmInitData(str21, arrayList24);
                                                    } else {
                                                        arrayList45 = arrayList23;
                                                        str22 = text;
                                                    }
                                                    arrayList25 = dVar4.f13132f;
                                                    arrayList25.addAll(arrayList40);
                                                    x4 = new X(format$BuilderA);
                                                    sVar = dVar4.f13129c;
                                                    z9 = sVar instanceof r;
                                                    arrayList26 = dVar4.f13134h;
                                                    arrayList27 = dVar4.f13135i;
                                                    j10 = dVar4.f13133g;
                                                    abstractC0167z = dVar4.f13128b;
                                                    if (z9) {
                                                        kVar = new l(j10, x4, abstractC0167z, (r) sVar, arrayList25, arrayList26, arrayList27);
                                                    } else {
                                                        if (sVar instanceof n) {
                                                            throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                                        }
                                                        kVar = new k(j10, x4, abstractC0167z, (n) sVar, arrayList25, arrayList26, arrayList27);
                                                    }
                                                    arrayList22.add(kVar);
                                                    i10++;
                                                    arrayList39 = arrayList63;
                                                    text = str22;
                                                }
                                                arrayList35.add(new a(iM, iG, arrayList22, arrayList9, arrayList43, arrayList10));
                                                arrayList4 = arrayList32;
                                                str5 = str41;
                                                str2 = str47;
                                                str3 = str40;
                                                j = -9223372036854775807L;
                                                z7 = true;
                                                str4 = str34;
                                                arrayList3 = arrayList35;
                                            } else {
                                                arrayList40 = arrayList40;
                                                arrayList47 = arrayList9;
                                                text = text;
                                                str27 = str;
                                                i19 = i19;
                                                j20 = j20;
                                                z4 = z4;
                                                str37 = str9;
                                                i20 = i20;
                                                f11 = f11;
                                                arrayList36 = arrayList2;
                                                arrayList44 = arrayList10;
                                                arrayList38 = arrayList29;
                                                j3 = j3;
                                                i18 = i18;
                                                str26 = str26;
                                                str46 = str46;
                                                arrayList43 = arrayList43;
                                                str41 = str41;
                                                str47 = str47;
                                                str40 = str40;
                                                str45 = str45;
                                                arrayList45 = arrayList45;
                                                arrayList46 = arrayList46;
                                                str35 = str35;
                                                arrayList39 = arrayList39;
                                                str39 = str39;
                                                str36 = str12;
                                                str43 = str11;
                                                arrayList37 = arrayList11;
                                                str38 = str10;
                                                str42 = str42;
                                                str44 = str44;
                                                arrayList42 = arrayList7;
                                            }
                                        }
                                    } else {
                                        arrayList29 = arrayList29;
                                        str26 = str26;
                                        j3 = jF4;
                                        String str76 = str33;
                                        String str77 = str31;
                                        String str78 = str30;
                                        arrayList = arrayList33;
                                        j20 = j20;
                                        str35 = str35;
                                        arrayList2 = arrayList36;
                                        i7 = 0;
                                        str = str27;
                                        z4 = z4;
                                        arrayList3 = arrayList35;
                                        if (p151v2.a.v(xmlPullParser, "EventStream")) {
                                            String str79 = str77;
                                            String attributeValue17 = xmlPullParser.getAttributeValue(null, str79);
                                            if (attributeValue17 == null) {
                                                attributeValue17 = "";
                                            }
                                            String attributeValue18 = xmlPullParser.getAttributeValue(null, str78);
                                            String str80 = attributeValue18 == null ? "" : attributeValue18;
                                            long jN4 = n(xmlPullParser, "timescale", 1L);
                                            long j31 = 0;
                                            long jN5 = n(xmlPullParser, "presentationTimeOffset", 0L);
                                            ArrayList arrayList65 = new ArrayList();
                                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                                            while (true) {
                                                xmlPullParser.next();
                                                String str81 = "Event";
                                                if (p151v2.a.v(xmlPullParser, "Event")) {
                                                    String str82 = str76;
                                                    long jN6 = n(xmlPullParser, str82, j31);
                                                    String str83 = str34;
                                                    long jN7 = n(xmlPullParser, str83, -9223372036854775807L);
                                                    long jN8 = n(xmlPullParser, "presentationTime", j31);
                                                    long jK8 = p151v2.t.K(jN7, 1000L, jN4);
                                                    long jK9 = p151v2.t.K(jN8 - jN5, 1000000L, jN4);
                                                    String attributeValue19 = xmlPullParser.getAttributeValue(null, "messageData");
                                                    if (attributeValue19 == null) {
                                                        attributeValue19 = null;
                                                    }
                                                    byteArrayOutputStream.reset();
                                                    XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                                                    xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, D3.f.f1719c.name());
                                                    xmlPullParser.nextToken();
                                                    while (!p151v2.a.t(xmlPullParser, str81)) {
                                                        switch (xmlPullParser.getEventType()) {
                                                            case 0:
                                                                str81 = str81;
                                                                arrayList6 = arrayList65;
                                                                str8 = str83;
                                                                xmlSerializerNewSerializer.startDocument(null, Boolean.FALSE);
                                                                break;
                                                            case 1:
                                                                str81 = str81;
                                                                arrayList6 = arrayList65;
                                                                str8 = str83;
                                                                xmlSerializerNewSerializer.endDocument();
                                                                break;
                                                            case 2:
                                                                xmlSerializerNewSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                int i28 = 0;
                                                                while (i28 < xmlPullParser.getAttributeCount()) {
                                                                    xmlSerializerNewSerializer.attribute(xmlPullParser.getAttributeNamespace(i28), xmlPullParser.getAttributeName(i28), xmlPullParser.getAttributeValue(i28));
                                                                    i28++;
                                                                    arrayList65 = arrayList65;
                                                                    str83 = str83;
                                                                }
                                                                arrayList6 = arrayList65;
                                                                str8 = str83;
                                                                break;
                                                            case 3:
                                                                xmlSerializerNewSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                arrayList6 = arrayList65;
                                                                str8 = str83;
                                                                break;
                                                            case 4:
                                                                xmlSerializerNewSerializer.text(xmlPullParser.getText());
                                                                arrayList6 = arrayList65;
                                                                str8 = str83;
                                                                break;
                                                            case 5:
                                                                xmlSerializerNewSerializer.cdsect(xmlPullParser.getText());
                                                                arrayList6 = arrayList65;
                                                                str8 = str83;
                                                                break;
                                                            case 6:
                                                                xmlSerializerNewSerializer.entityRef(xmlPullParser.getText());
                                                                arrayList6 = arrayList65;
                                                                str8 = str83;
                                                                break;
                                                            case 7:
                                                                xmlSerializerNewSerializer.ignorableWhitespace(xmlPullParser.getText());
                                                                arrayList6 = arrayList65;
                                                                str8 = str83;
                                                                break;
                                                            case 8:
                                                                xmlSerializerNewSerializer.processingInstruction(xmlPullParser.getText());
                                                                arrayList6 = arrayList65;
                                                                str8 = str83;
                                                                break;
                                                            case 9:
                                                                xmlSerializerNewSerializer.comment(xmlPullParser.getText());
                                                                arrayList6 = arrayList65;
                                                                str8 = str83;
                                                                break;
                                                            case 10:
                                                                xmlSerializerNewSerializer.docdecl(xmlPullParser.getText());
                                                                arrayList6 = arrayList65;
                                                                str8 = str83;
                                                                break;
                                                            default:
                                                                arrayList6 = arrayList65;
                                                                str8 = str83;
                                                                break;
                                                        }
                                                        xmlPullParser.nextToken();
                                                        str81 = str81;
                                                        arrayList65 = arrayList6;
                                                        str83 = str8;
                                                    }
                                                    ArrayList arrayList66 = arrayList65;
                                                    str7 = str83;
                                                    xmlSerializerNewSerializer.flush();
                                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                    Long lValueOf = Long.valueOf(jK9);
                                                    if (attributeValue19 != null) {
                                                        byteArray = attributeValue19.getBytes(D3.f.f1719c);
                                                    }
                                                    str2 = str82;
                                                    j7 = 0;
                                                    arrayList5 = arrayList66;
                                                    arrayList5.add(Pair.create(lValueOf, new EventMessage(attributeValue17, str80, jK8, jN6, byteArray)));
                                                } else {
                                                    j7 = j31;
                                                    str7 = str34;
                                                    str2 = str76;
                                                    arrayList5 = arrayList65;
                                                    d(xmlPullParser);
                                                }
                                                if (p151v2.a.t(xmlPullParser, "EventStream")) {
                                                    long[] jArr = new long[arrayList5.size()];
                                                    EventMessage[] eventMessageArr = new EventMessage[arrayList5.size()];
                                                    for (int i29 = 0; i29 < arrayList5.size(); i29++) {
                                                        Pair pair = (Pair) arrayList5.get(i29);
                                                        jArr[i29] = ((Long) pair.first).longValue();
                                                        eventMessageArr[i29] = (EventMessage) pair.second;
                                                    }
                                                    z7 = true;
                                                    ArrayList arrayList67 = arrayList32;
                                                    arrayList67.add(new g(attributeValue17, str80, jArr, eventMessageArr));
                                                    arrayList4 = arrayList67;
                                                    str3 = str78;
                                                    str4 = str7;
                                                    str5 = str79;
                                                    j = -9223372036854775807L;
                                                } else {
                                                    arrayList65 = arrayList5;
                                                    arrayList3 = arrayList3;
                                                    str34 = str7;
                                                    str76 = str2;
                                                    byteArrayOutputStream = byteArrayOutputStream;
                                                    j31 = j7;
                                                    str79 = str79;
                                                }
                                            }
                                        } else {
                                            String str84 = str34;
                                            ArrayList arrayList68 = arrayList32;
                                            str2 = str76;
                                            str3 = str78;
                                            z7 = true;
                                            arrayList3 = arrayList3;
                                            if (p151v2.a.v(xmlPullParser, "SegmentBase")) {
                                                sVarS = s(xmlPullParser, null);
                                                arrayList4 = arrayList68;
                                                str4 = str84;
                                                jF4 = j3;
                                                str5 = str77;
                                                str6 = str35;
                                            } else {
                                                if (p151v2.a.v(xmlPullParser, "SegmentList")) {
                                                    j = -9223372036854775807L;
                                                    jF = f(xmlPullParser, -9223372036854775807L);
                                                    arrayList4 = arrayList68;
                                                    str4 = str84;
                                                    str5 = str77;
                                                    sVarU = t(xmlPullParser, null, j22, jK7, j3, jF, jK4);
                                                } else {
                                                    arrayList4 = arrayList68;
                                                    str4 = str84;
                                                    str5 = str77;
                                                    j = -9223372036854775807L;
                                                    if (p151v2.a.v(xmlPullParser, "SegmentTemplate")) {
                                                        jF = f(xmlPullParser, -9223372036854775807L);
                                                        C0165x c0165x = AbstractC0167z.f2083b;
                                                        sVarU = u(xmlPullParser, null, L.f2000e, j22, jK7, j3, jF, jK4);
                                                    } else if (p151v2.a.v(xmlPullParser, "AssetIdentifier")) {
                                                        j(xmlPullParser, "AssetIdentifier");
                                                    } else {
                                                        d(xmlPullParser);
                                                    }
                                                }
                                                sVarS = sVarU;
                                                j24 = jF;
                                            }
                                        }
                                    }
                                    jF4 = j3;
                                    str6 = str35;
                                    if (p151v2.a.t(xmlPullParser, str6)) {
                                        pairCreate = Pair.create(new h(attributeValue8, jK6, arrayList3, arrayList4), Long.valueOf(jK7));
                                        hVar = (h) pairCreate.first;
                                        if (hVar.f13149b == j) {
                                            jLongValue = ((Long) pairCreate.second).longValue();
                                            if (jLongValue == j) {
                                                j14 = j;
                                            } else {
                                                j14 = hVar.f13149b + jLongValue;
                                            }
                                            arrayList28 = arrayList34;
                                            arrayList28.add(hVar);
                                        } else {
                                            if (zEquals) {
                                                throw C0045t0.b("Unable to determine start of period " + arrayList34.size(), null);
                                            }
                                            z10 = z7;
                                            j14 = j23;
                                            arrayList28 = arrayList34;
                                        }
                                    } else {
                                        str32 = str6;
                                        arrayList31 = arrayList3;
                                        str30 = str3;
                                        str27 = str;
                                        str31 = str5;
                                        str34 = str4;
                                        j20 = j20;
                                        arrayList32 = arrayList4;
                                        str33 = str2;
                                        z4 = z4;
                                        arrayList33 = arrayList;
                                        arrayList30 = arrayList2;
                                        arrayList29 = arrayList29;
                                        str26 = str26;
                                    }
                                }
                                j = -9223372036854775807L;
                                if (p151v2.a.t(xmlPullParser, str6)) {
                                    pairCreate = Pair.create(new h(attributeValue8, jK6, arrayList3, arrayList4), Long.valueOf(jK7));
                                    hVar = (h) pairCreate.first;
                                    if (hVar.f13149b == j) {
                                        jLongValue = ((Long) pairCreate.second).longValue();
                                        if (jLongValue == j) {
                                            j14 = j;
                                        } else {
                                            j14 = hVar.f13149b + jLongValue;
                                        }
                                        arrayList28 = arrayList34;
                                        arrayList28.add(hVar);
                                    } else {
                                        if (zEquals) {
                                            throw C0045t0.b("Unable to determine start of period " + arrayList34.size(), null);
                                        }
                                        z10 = z7;
                                        j14 = j23;
                                        arrayList28 = arrayList34;
                                    }
                                } else {
                                    str32 = str6;
                                    arrayList31 = arrayList3;
                                    str30 = str3;
                                    str27 = str;
                                    str31 = str5;
                                    str34 = str4;
                                    j20 = j20;
                                    arrayList32 = arrayList4;
                                    str33 = str2;
                                    z4 = z4;
                                    arrayList33 = arrayList;
                                    arrayList30 = arrayList2;
                                    arrayList29 = arrayList29;
                                    str26 = str26;
                                }
                            }
                        }
                        jF3 = j20;
                    }
                }
                i7 = i15;
                j = -9223372036854775807L;
            }
            if (p151v2.a.t(xmlPullParser, "MPD")) {
                if (jK == j) {
                    if (j14 != j) {
                        jK = j14;
                    } else if (!zEquals) {
                        throw C0045t0.b("Unable to determine duration of static manifest.", null);
                    }
                }
                if (arrayList28.isEmpty()) {
                    throw C0045t0.b("No periods found.", null);
                }
                return new c(jH, jK, jK2, zEquals, jK3, jK4, jK5, jH2, iVar, c0815k, tVar, uriD, arrayList28);
            }
            arrayList28 = arrayList28;
            i15 = i7;
            arrayListI = arrayListI;
            z4 = z4;
            arrayList29 = arrayList29;
            str25 = null;
            long j32 = j14;
            j13 = j;
            j14 = j32;
        }
    }

    public static j p(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j3;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j3 = (Long.parseLong(strArrSplit[1]) - j) + 1;
            }
            return new j(attributeValue, j, j3);
        }
        j = 0;
        j3 = -1;
        return new j(attributeValue, j, j3);
    }

    public static int q(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
            case "subtitle":
            case "forced_subtitle":
            case "forced-subtitle":
                return 128;
            case "description":
                return 512;
            case "enhanced-audio-intelligibility":
                return 2048;
            case "alternate":
                return 2;
            case "dub":
                return 16;
            case "main":
                return 1;
            case "sign":
                return 256;
            case "caption":
                return 64;
            case "commentary":
                return 8;
            case "emergency":
                return 32;
            case "supplementary":
                return 4;
            default:
                return 0;
        }
    }

    public static int r(ArrayList arrayList) {
        int i7 = 0;
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            if (D.n("http://dashif.org/guidelines/trickmode", ((f) arrayList.get(i8)).f13141a)) {
                i7 = 16384;
            }
        }
        return i7;
    }

    public static r s(XmlPullParser xmlPullParser, r rVar) throws XmlPullParserException, IOException {
        long j;
        long j3;
        long jN = n(xmlPullParser, "timescale", rVar != null ? rVar.f13182b : 1L);
        long jN2 = n(xmlPullParser, "presentationTimeOffset", rVar != null ? rVar.f13183c : 0L);
        long j7 = rVar != null ? rVar.f13179d : 0L;
        long j8 = rVar != null ? rVar.f13180e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split("-");
            long j9 = Long.parseLong(strArrSplit[0]);
            j = (Long.parseLong(strArrSplit[1]) - j9) + 1;
            j3 = j9;
        } else {
            j = j8;
            j3 = j7;
        }
        j jVarP = rVar != null ? rVar.f13181a : null;
        do {
            xmlPullParser.next();
            if (p151v2.a.v(xmlPullParser, "Initialization")) {
                jVarP = p(xmlPullParser, "sourceURL", "range");
            } else {
                d(xmlPullParser);
            }
        } while (!p151v2.a.t(xmlPullParser, "SegmentBase"));
        return new r(jVarP, jN, jN2, j3, j);
    }

    public static o t(XmlPullParser xmlPullParser, o oVar, long j, long j3, long j7, long j8, long j9) throws XmlPullParserException, IOException {
        long jN = n(xmlPullParser, "timescale", oVar != null ? oVar.f13182b : 1L);
        long jN2 = n(xmlPullParser, "presentationTimeOffset", oVar != null ? oVar.f13183c : 0L);
        long jN3 = n(xmlPullParser, "duration", oVar != null ? oVar.f13170e : -9223372036854775807L);
        long jN4 = n(xmlPullParser, "startNumber", oVar != null ? oVar.f13169d : 1L);
        long j10 = j8 == -9223372036854775807L ? j7 : j8;
        long j11 = j10 == Long.MAX_VALUE ? -9223372036854775807L : j10;
        List arrayList = null;
        j jVarP = null;
        List listV = null;
        do {
            xmlPullParser.next();
            if (p151v2.a.v(xmlPullParser, "Initialization")) {
                jVarP = p(xmlPullParser, "sourceURL", "range");
            } else if (p151v2.a.v(xmlPullParser, "SegmentTimeline")) {
                listV = v(xmlPullParser, jN, j3);
            } else if (p151v2.a.v(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(p(xmlPullParser, "media", "mediaRange"));
            } else {
                d(xmlPullParser);
            }
        } while (!p151v2.a.t(xmlPullParser, "SegmentList"));
        if (oVar != null) {
            if (jVarP == null) {
                jVarP = oVar.f13181a;
            }
            if (listV == null) {
                listV = oVar.f13171f;
            }
            if (arrayList == null) {
                arrayList = oVar.j;
            }
        }
        return new o(jVarP, jN, jN2, jN4, jN3, listV, j11, arrayList, p151v2.t.E(j9), p151v2.t.E(j));
    }

    public static p u(XmlPullParser xmlPullParser, p pVar, List list, long j, long j3, long j7, long j8, long j9) throws XmlPullParserException, IOException {
        long j10;
        long jN = n(xmlPullParser, "timescale", pVar != null ? pVar.f13182b : 1L);
        long jN2 = n(xmlPullParser, "presentationTimeOffset", pVar != null ? pVar.f13183c : 0L);
        long jN3 = n(xmlPullParser, "duration", pVar != null ? pVar.f13170e : -9223372036854775807L);
        long jN4 = n(xmlPullParser, "startNumber", pVar != null ? pVar.f13169d : 1L);
        int i7 = 0;
        while (true) {
            if (i7 >= list.size()) {
                j10 = -1;
                break;
            }
            f fVar = (f) list.get(i7);
            if (D.n("http://dashif.org/guidelines/last-segment-number", fVar.f13141a)) {
                j10 = Long.parseLong(fVar.f13142b);
                break;
            }
            i7++;
        }
        long j11 = j10;
        long j12 = j8 == -9223372036854775807L ? j7 : j8;
        long j13 = j12 == Long.MAX_VALUE ? -9223372036854775807L : j12;
        j jVarP = null;
        p151v2.n nVarW = w(xmlPullParser, "media", pVar != null ? pVar.f13175k : null);
        p151v2.n nVarW2 = w(xmlPullParser, "initialization", pVar != null ? pVar.j : null);
        List listV = null;
        do {
            xmlPullParser.next();
            if (p151v2.a.v(xmlPullParser, "Initialization")) {
                jVarP = p(xmlPullParser, "sourceURL", "range");
            } else if (p151v2.a.v(xmlPullParser, "SegmentTimeline")) {
                listV = v(xmlPullParser, jN, j3);
            } else {
                d(xmlPullParser);
            }
        } while (!p151v2.a.t(xmlPullParser, "SegmentTemplate"));
        if (pVar != null) {
            if (jVarP == null) {
                jVarP = pVar.f13181a;
            }
            if (listV == null) {
                listV = pVar.f13171f;
            }
        }
        return new p(jVarP, jN, jN2, jN4, j11, jN3, listV, j13, nVarW2, nVarW, p151v2.t.E(j9), p151v2.t.E(j));
    }

    public static ArrayList v(XmlPullParser xmlPullParser, long j, long j3) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jA = 0;
        long j7 = -9223372036854775807L;
        boolean z4 = false;
        int iM = 0;
        do {
            xmlPullParser.next();
            if (p151v2.a.v(xmlPullParser, "S")) {
                long jN = n(xmlPullParser, "t", -9223372036854775807L);
                if (z4) {
                    jA = a(arrayList, jA, j7, iM, jN);
                }
                if (jN == -9223372036854775807L) {
                    jN = jA;
                }
                long jN2 = n(xmlPullParser, "d", -9223372036854775807L);
                iM = m(xmlPullParser, "r", 0);
                z4 = true;
                j7 = jN2;
                jA = jN;
            } else {
                d(xmlPullParser);
            }
        } while (!p151v2.a.t(xmlPullParser, "SegmentTimeline"));
        if (z4) {
            a(arrayList, jA, j7, iM, p151v2.t.K(j3, j, 1000L));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:49:0x0102  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static p151v2.n w(XmlPullParser xmlPullParser, String str, p151v2.n nVar) {
        String strSubstring;
        byte b7;
        int i7 = -1;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return nVar;
        }
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        strArr[0] = "";
        int length = 0;
        int i8 = 0;
        while (length < attributeValue.length()) {
            int iIndexOf = attributeValue.indexOf("$", length);
            if (iIndexOf == i7) {
                strArr[i8] = strArr[i8] + attributeValue.substring(length);
                length = attributeValue.length();
            } else if (iIndexOf != length) {
                strArr[i8] = strArr[i8] + attributeValue.substring(length, iIndexOf);
                length = iIndexOf;
            } else if (attributeValue.startsWith("$$", length)) {
                strArr[i8] = p031e1.k.i(new StringBuilder(), strArr[i8], "$");
                length += 2;
            } else {
                int i9 = length + 1;
                int iIndexOf2 = attributeValue.indexOf("$", i9);
                String strSubstring2 = attributeValue.substring(i9, iIndexOf2);
                if (strSubstring2.equals("RepresentationID")) {
                    iArr[i8] = 1;
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != i7) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith("d") && !strSubstring.endsWith("x") && !strSubstring.endsWith("X")) {
                            strSubstring = strSubstring.concat("d");
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = "%01d";
                    }
                    strSubstring2.getClass();
                    switch (strSubstring2.hashCode()) {
                        case -1950496919:
                            if (strSubstring2.equals("Number")) {
                                b7 = 0;
                            }
                            switch (b7) {
                                case 0:
                                    iArr[i8] = 2;
                                    break;
                                case 1:
                                    iArr[i8] = 4;
                                    break;
                                case 2:
                                    iArr[i8] = 3;
                                    break;
                                default:
                                    throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                            }
                            strArr2[i8] = strSubstring;
                            break;
                        case 2606829:
                            if (strSubstring2.equals("Time")) {
                                b7 = 1;
                            }
                            switch (b7) {
                                case 0:
                                    iArr[i8] = 2;
                                    break;
                                case 1:
                                    iArr[i8] = 4;
                                    break;
                                case 2:
                                    iArr[i8] = 3;
                                    break;
                                default:
                                    throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                            }
                            strArr2[i8] = strSubstring;
                            break;
                        case 38199441:
                            if (strSubstring2.equals("Bandwidth")) {
                                b7 = 2;
                            }
                            switch (b7) {
                                case 0:
                                    iArr[i8] = 2;
                                    break;
                                case 1:
                                    iArr[i8] = 4;
                                    break;
                                case 2:
                                    iArr[i8] = 3;
                                    break;
                                default:
                                    throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                            }
                            strArr2[i8] = strSubstring;
                            break;
                    }
                    b7 = -1;
                    switch (b7) {
                        case 0:
                            iArr[i8] = 2;
                            break;
                        case 1:
                            iArr[i8] = 4;
                            break;
                        case 2:
                            iArr[i8] = 3;
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                    }
                    strArr2[i8] = strSubstring;
                }
                i8++;
                strArr[i8] = "";
                length = iIndexOf2 + 1;
            }
            i7 = -1;
        }
        p151v2.n nVar2 = new p151v2.n();
        nVar2.f17143b = strArr;
        nVar2.f17144c = iArr;
        nVar2.f17145d = strArr2;
        nVar2.f17142a = i8;
        return nVar2;
    }

    @Override // p146u2.M
    public final Object c(Uri uri, C0956o c0956o) throws C0045t0 {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f13140a.newPullParser();
            xmlPullParserNewPullParser.setInput(c0956o, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return o(xmlPullParserNewPullParser, uri);
            }
            throw C0045t0.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e7) {
            throw C0045t0.b(null, e7);
        }
    }
}
