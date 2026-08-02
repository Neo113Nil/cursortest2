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
import com.google.android.gms.common.internal.C0859k;
import io.sentry.rrweb.RRWebVideoEvent;
import io.sentry.util.StringUtils;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n1.C1450e;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import u2.C1638o;
import u2.M;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public final class e extends DefaultHandler implements M {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f13130b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f13131c = Pattern.compile("CC([1-4])=.*");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f13132d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f13133e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f13134a;

    public e() {
        try {
            this.f13134a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e7) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e7);
        }
    }

    public static long a(ArrayList arrayList, long j, long j3, int i7, long j7) {
        int i8;
        if (i7 >= 0) {
            i8 = i7 + 1;
        } else {
            int i9 = v2.t.f17153a;
            i8 = (int) ((((j7 - j) + j3) - 1) / j3);
        }
        for (int i10 = 0; i10 < i8; i10++) {
            arrayList.add(new q(j, j3));
            j += j3;
        }
        return j;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static X b(String str, String str2, int i7, int i8, float f7, int i9, int i10, int i11, String str3, ArrayList arrayList, ArrayList arrayList2, String str4, ArrayList arrayList3, ArrayList arrayList4) {
        String str5;
        String str6;
        int i12;
        int i13;
        Pair pair;
        int i14;
        String str7;
        int parseInt;
        int i15;
        String str8;
        int i16;
        char c3;
        int i17;
        int i18;
        if (v2.i.h(str2)) {
            if (str4 != null) {
                for (String str9 : v2.t.M(str4)) {
                    str5 = v2.i.c(str9);
                    if (str5 != null && v2.i.h(str5)) {
                        break;
                    }
                }
            }
            str5 = null;
        } else if (v2.i.j(str2)) {
            if (str4 != null) {
                for (String str10 : v2.t.M(str4)) {
                    str5 = v2.i.c(str10);
                    if (str5 != null && v2.i.j(str5)) {
                        break;
                    }
                }
            }
            str5 = null;
        } else if (v2.i.i(str2) || "image".equals(v2.i.f(str2))) {
            str5 = str2;
        } else {
            if ("application/mp4".equals(str2)) {
                String c4 = v2.i.c(str4);
                if ("text/vtt".equals(c4)) {
                    c4 = "application/x-mp4-vtt";
                }
                str5 = c4;
            }
            str5 = null;
        }
        String str11 = "audio/eac3";
        if ("audio/eac3".equals(str5)) {
            while (true) {
                if (i18 >= arrayList4.size()) {
                    break;
                }
                f fVar = (f) arrayList4.get(i18);
                String str12 = fVar.f13135a;
                boolean equals = "tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str12);
                String str13 = fVar.f13136b;
                i18 = ((equals && "JOC".equals(str13)) || ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str12) && "ec+3".equals(str13))) ? 0 : i18 + 1;
            }
            str11 = "audio/eac3-joc";
            str6 = "audio/eac3-joc".equals(str11) ? "ec+3" : str4;
            str5 = str11;
        } else {
            str6 = str4;
        }
        int i19 = 0;
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            f fVar2 = (f) arrayList.get(i20);
            if (D.n("urn:mpeg:dash:role:2011", fVar2.f13135a)) {
                String str14 = fVar2.f13136b;
                i19 |= (str14 != null && (str14.equals("forced_subtitle") || str14.equals("forced-subtitle"))) ? 2 : 0;
            }
        }
        int i21 = 0;
        for (int i22 = 0; i22 < arrayList.size(); i22++) {
            f fVar3 = (f) arrayList.get(i22);
            if (D.n("urn:mpeg:dash:role:2011", fVar3.f13135a)) {
                i21 |= q(fVar3.f13136b);
            }
        }
        int i23 = 0;
        for (int i24 = 0; i24 < arrayList2.size(); i24++) {
            f fVar4 = (f) arrayList2.get(i24);
            boolean n2 = D.n("urn:mpeg:dash:role:2011", fVar4.f13135a);
            String str15 = fVar4.f13136b;
            if (n2) {
                i17 = q(str15);
            } else {
                if (D.n("urn:tva:metadata:cs:AudioPurposeCS:2007", fVar4.f13135a)) {
                    if (str15 != null) {
                        switch (str15.hashCode()) {
                            case 49:
                                if (str15.equals("1")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 50:
                                if (str15.equals("2")) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 51:
                                if (str15.equals("3")) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 52:
                                if (str15.equals("4")) {
                                    c3 = 3;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 53:
                            default:
                                c3 = 65535;
                                break;
                            case 54:
                                if (str15.equals("6")) {
                                    c3 = 4;
                                    break;
                                }
                                c3 = 65535;
                                break;
                        }
                        switch (c3) {
                            case 0:
                                i17 = 512;
                                break;
                            case 1:
                                i17 = 2048;
                                break;
                            case 2:
                                i17 = 4;
                                break;
                            case 3:
                                i17 = 8;
                                break;
                            case 4:
                                i17 = 1;
                                break;
                        }
                    }
                    i17 = 0;
                }
            }
            i23 |= i17;
        }
        int r7 = i21 | i23 | r(arrayList3) | r(arrayList4);
        int i25 = 0;
        while (true) {
            if (i25 < arrayList3.size()) {
                f fVar5 = (f) arrayList3.get(i25);
                if (D.n("http://dashif.org/thumbnail_tile", fVar5.f13135a) || D.n("http://dashif.org/guidelines/thumbnail_tile", fVar5.f13135a)) {
                    String str16 = fVar5.f13136b;
                    if (str16 != null) {
                        int i26 = v2.t.f17153a;
                        i13 = -1;
                        String[] split = str16.split("x", -1);
                        if (split.length != 2) {
                            i16 = 1;
                        } else {
                            i12 = 0;
                            try {
                                pair = Pair.create(Integer.valueOf(Integer.parseInt(split[0])), Integer.valueOf(Integer.parseInt(split[1])));
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                    i16 = 1;
                } else {
                    i16 = 1;
                }
                i25 += i16;
            } else {
                i12 = 0;
                i13 = -1;
                pair = null;
            }
        }
        Format$Builder format$Builder = new Format$Builder();
        format$Builder.f10528a = str;
        format$Builder.j = str2;
        format$Builder.f10537k = str5;
        format$Builder.f10535h = str6;
        format$Builder.f10534g = i11;
        format$Builder.f10531d = i19;
        format$Builder.f10532e = r7;
        format$Builder.f10530c = str3;
        Format$Builder tileCountVertical = format$Builder.setTileCountHorizontal(pair != null ? ((Integer) pair.first).intValue() : i13).setTileCountVertical(pair != null ? ((Integer) pair.second).intValue() : i13);
        if (v2.i.j(str5)) {
            tileCountVertical.f10542p = i7;
            tileCountVertical.f10543q = i8;
            tileCountVertical.f10544r = f7;
        } else if (v2.i.h(str5)) {
            tileCountVertical.f10550x = i9;
            tileCountVertical.f10551y = i10;
        } else if (v2.i.i(str5)) {
            if ("application/cea-608".equals(str5)) {
                int i27 = i12;
                while (i27 < arrayList2.size()) {
                    f fVar6 = (f) arrayList2.get(i27);
                    if (!"urn:scte:dash:cc:cea-608:2015".equals(fVar6.f13135a) || (str8 = fVar6.f13136b) == null) {
                        i15 = 1;
                    } else {
                        Matcher matcher = f13131c.matcher(str8);
                        if (matcher.matches()) {
                            parseInt = Integer.parseInt(matcher.group(1));
                            tileCountVertical.f10526C = parseInt;
                        } else {
                            i15 = 1;
                            Log.w("MpdParser", "Unable to parse CEA-608 channel number from: ".concat(str8));
                        }
                    }
                    i27 += i15;
                }
                parseInt = i13;
                tileCountVertical.f10526C = parseInt;
            } else {
                if ("application/cea-708".equals(str5)) {
                    int i28 = i12;
                    while (i28 < arrayList2.size()) {
                        f fVar7 = (f) arrayList2.get(i28);
                        if (!"urn:scte:dash:cc:cea-708:2015".equals(fVar7.f13135a) || (str7 = fVar7.f13136b) == null) {
                            i14 = 1;
                        } else {
                            Matcher matcher2 = f13132d.matcher(str7);
                            if (matcher2.matches()) {
                                parseInt = Integer.parseInt(matcher2.group(1));
                                tileCountVertical.f10526C = parseInt;
                            } else {
                                i14 = 1;
                                Log.w("MpdParser", "Unable to parse CEA-708 service block number from: ".concat(str7));
                            }
                        }
                        i28 += i14;
                    }
                }
                parseInt = i13;
                tileCountVertical.f10526C = parseInt;
            }
        } else if ("image".equals(v2.i.f(str5))) {
            tileCountVertical.f10542p = i7;
            tileCountVertical.f10543q = i8;
        }
        tileCountVertical.getClass();
        return new X(tileCountVertical);
    }

    public static void d(XmlPullParser xmlPullParser) {
        if (AbstractC1664a.u(xmlPullParser)) {
            int i7 = 1;
            while (i7 != 0) {
                xmlPullParser.next();
                if (AbstractC1664a.u(xmlPullParser)) {
                    i7++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i7--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0081, code lost:
    
        if (r0 == 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b2, code lost:
    
        if (r6.equals("fa01") == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ee, code lost:
    
        if (r0 < 33) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int e(XmlPullParser xmlPullParser) {
        char c3;
        int i7 = 6;
        char c4 = 3;
        int i8 = -1;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = null;
        }
        attributeValue.getClass();
        switch (attributeValue.hashCode()) {
            case -2128649360:
                if (attributeValue.equals("urn:dts:dash:audio_channel_configuration:2012")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case -1352850286:
                if (attributeValue.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case -1138141449:
                if (attributeValue.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case -986633423:
                if (attributeValue.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case -79006963:
                if (attributeValue.equals("tag:dts.com,2014:dash:audio_channel_configuration:2012")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case 312179081:
                if (attributeValue.equals("tag:dts.com,2018:uhd:audio_channel_configuration")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            case 2036691300:
                if (attributeValue.equals("urn:dolby:dash:audio_channel_configuration:2011")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        switch (c3) {
            case 0:
            case 4:
                i7 = m(xmlPullParser, "value", -1);
                if (i7 > 0) {
                    break;
                }
                break;
            case 1:
                i8 = m(xmlPullParser, "value", -1);
                break;
            case 2:
            case 6:
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue2 != null) {
                    String a02 = D.a0(attributeValue2);
                    a02.getClass();
                    switch (a02.hashCode()) {
                        case 1596796:
                            if (a02.equals("4000")) {
                                c4 = 0;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 2937391:
                            if (a02.equals("a000")) {
                                c4 = 1;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 3094035:
                            if (a02.equals("f801")) {
                                c4 = 2;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 3133436:
                            break;
                        default:
                            c4 = 65535;
                            break;
                    }
                    switch (c4) {
                        case 0:
                            i7 = 1;
                            break;
                        case 1:
                            i7 = 2;
                            break;
                        case 3:
                            i7 = 8;
                            break;
                    }
                    i8 = i7;
                    break;
                }
                i7 = -1;
                i8 = i7;
            case 3:
                int m7 = m(xmlPullParser, "value", -1);
                if (m7 >= 0) {
                    int[] iArr = f13133e;
                    if (m7 < iArr.length) {
                        i8 = iArr[m7];
                        break;
                    }
                }
                break;
            case 5:
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue3 != null) {
                    i7 = Integer.bitCount(Integer.parseInt(attributeValue3, 16));
                    break;
                }
                break;
        }
        do {
            xmlPullParser.next();
        } while (!AbstractC1664a.t(xmlPullParser, "AudioChannelConfiguration"));
        return i8;
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

    public static ArrayList g(XmlPullParser xmlPullParser, List list, boolean z4) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : z4 ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int parseInt2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String str = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str = xmlPullParser.getText();
            } else {
                d(xmlPullParser);
            }
        } while (!AbstractC1664a.t(xmlPullParser, "BaseURL"));
        if (str != null && AbstractC1664a.q(str)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = str;
            }
            return AbstractC0158p.i(new b(str, attributeValue3, parseInt, parseInt2));
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            b bVar = (b) list.get(i7);
            String C3 = AbstractC1664a.C(bVar.f13105a, str);
            String str2 = attributeValue3 == null ? C3 : attributeValue3;
            if (z4) {
                parseInt = bVar.f13107c;
                parseInt2 = bVar.f13108d;
                str2 = bVar.f13106b;
            }
            arrayList.add(new b(C3, str2, parseInt, parseInt2));
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
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
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.UUID] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair h(XmlPullParser xmlPullParser) {
        String str;
        ?? r62;
        String str2;
        String str3;
        ?? r7;
        char c3;
        String str4;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue != null) {
            String a02 = D.a0(attributeValue);
            a02.getClass();
            switch (a02.hashCode()) {
                case -1980789791:
                    if (a02.equals("urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 489446379:
                    if (a02.equals("urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 755418770:
                    if (a02.equals("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1812765994:
                    if (a02.equals("urn:mpeg:dash:mp4protection:2011")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            switch (c3) {
                case 0:
                    r62 = AbstractC0029l.f464c;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r7 = str2;
                    break;
                case 1:
                    r62 = AbstractC0029l.f466e;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r7 = str2;
                    break;
                case 2:
                    r62 = AbstractC0029l.f465d;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r7 = str2;
                    break;
                case 3:
                    str = xmlPullParser.getAttributeValue(null, "value");
                    int attributeCount = xmlPullParser.getAttributeCount();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= attributeCount) {
                            str4 = null;
                        } else {
                            String attributeName = xmlPullParser.getAttributeName(i7);
                            int indexOf = attributeName.indexOf(58);
                            if (indexOf != -1) {
                                attributeName = attributeName.substring(indexOf + 1);
                            }
                            if (attributeName.equals("default_KID")) {
                                str4 = xmlPullParser.getAttributeValue(i7);
                            } else {
                                i7++;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str4) && !StringUtils.PROPER_NIL_UUID.equals(str4)) {
                        String[] split = str4.split("\\s+");
                        UUID[] uuidArr = new UUID[split.length];
                        for (int i8 = 0; i8 < split.length; i8++) {
                            uuidArr[i8] = UUID.fromString(split[i8]);
                        }
                        r62 = AbstractC0029l.f463b;
                        str3 = null;
                        r7 = N1.p.a(r62, uuidArr, null);
                        break;
                    } else {
                        r62 = null;
                        str2 = r62;
                        str3 = str2;
                        r7 = str2;
                        break;
                    }
            }
            do {
                xmlPullParser.next();
                if (!AbstractC1664a.v(xmlPullParser, "clearkey:Laurl") && xmlPullParser.next() == 4) {
                    str3 = xmlPullParser.getText();
                    r7 = r7;
                } else if (AbstractC1664a.v(xmlPullParser, "ms:laurl")) {
                    if (r7 == 0 && AbstractC1664a.u(xmlPullParser)) {
                        String name = xmlPullParser.getName();
                        int indexOf2 = name.indexOf(58);
                        if (indexOf2 != -1) {
                            name = name.substring(indexOf2 + 1);
                        }
                        if (name.equals("pssh") && xmlPullParser.next() == 4) {
                            byte[] decode = Base64.decode(xmlPullParser.getText(), 0);
                            C1450e b7 = N1.p.b(decode);
                            UUID uuid = b7 == null ? null : (UUID) b7.f15308b;
                            if (uuid == null) {
                                Log.w("MpdParser", "Skipping malformed cenc:pssh data");
                                r62 = uuid;
                                r7 = 0;
                            } else {
                                UUID uuid2 = uuid;
                                r7 = decode;
                                r62 = uuid2;
                            }
                        }
                    }
                    if (r7 == 0) {
                        ?? r9 = AbstractC0029l.f466e;
                        if (r9.equals(r62) && AbstractC1664a.v(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                            r7 = N1.p.a(r9, null, Base64.decode(xmlPullParser.getText(), 0));
                        }
                    }
                    d(xmlPullParser);
                    r7 = r7;
                } else {
                    str3 = xmlPullParser.getAttributeValue(null, "licenseUrl");
                    r7 = r7;
                }
            } while (!AbstractC1664a.t(xmlPullParser, "ContentProtection"));
            return Pair.create(str, r62 != null ? new DrmInitData.SchemeData(r62, str3, "video/mp4", r7) : null);
        }
        str = null;
        r62 = null;
        str2 = r62;
        str3 = str2;
        r7 = str2;
        do {
            xmlPullParser.next();
            if (!AbstractC1664a.v(xmlPullParser, "clearkey:Laurl")) {
            }
            if (AbstractC1664a.v(xmlPullParser, "ms:laurl")) {
            }
        } while (!AbstractC1664a.t(xmlPullParser, "ContentProtection"));
        return Pair.create(str, r62 != null ? new DrmInitData.SchemeData(r62, str3, "video/mp4", r7) : null);
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

    public static f j(XmlPullParser xmlPullParser, String str) {
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
        } while (!AbstractC1664a.t(xmlPullParser, str));
        return new f(attributeValue, attributeValue2, str2);
    }

    public static long k(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = v2.t.f17160h.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
        String group2 = matcher.group(5);
        double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
        String group3 = matcher.group(7);
        double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
        String group4 = matcher.group(10);
        double parseDouble4 = parseDouble3 + (group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d);
        String group5 = matcher.group(12);
        double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
        String group6 = matcher.group(14);
        long parseDouble6 = (long) ((parseDouble5 + (group6 != null ? Double.parseDouble(group6) : 0.0d)) * 1000.0d);
        return !isEmpty ? -parseDouble6 : parseDouble6;
    }

    public static float l(XmlPullParser xmlPullParser, float f7) {
        String attributeValue = xmlPullParser.getAttributeValue(null, RRWebVideoEvent.JsonKeys.FRAME_RATE);
        if (attributeValue == null) {
            return f7;
        }
        Matcher matcher = f13130b.matcher(attributeValue);
        if (!matcher.matches()) {
            return f7;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        return !TextUtils.isEmpty(matcher.group(2)) ? parseInt / Integer.parseInt(r2) : parseInt;
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
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0f6e A[LOOP:4: B:125:0x02c2->B:133:0x0f6e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0f15 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0c25 A[LOOP:5: B:156:0x03c2->B:165:0x0c25, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0a9b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0921 A[LOOP:11: B:307:0x064a->B:315:0x0921, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x089c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c o(XmlPullParser xmlPullParser, Uri uri) {
        boolean z4;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        boolean z7;
        long j;
        long j3;
        int i7;
        long j7;
        String str;
        long j8;
        ArrayList arrayList4;
        String str2;
        ArrayList arrayList5;
        String str3;
        String str4;
        String str5;
        boolean z8;
        ArrayList arrayList6;
        ArrayList arrayList7;
        String str6;
        String str7;
        long f7;
        s u4;
        String str8;
        ByteArrayOutputStream byteArrayOutputStream;
        long j9;
        String str9;
        String str10;
        ArrayList arrayList8;
        String str11;
        ArrayList arrayList9;
        String str12;
        long j10;
        ArrayList arrayList10;
        ArrayList arrayList11;
        String str13;
        ArrayList arrayList12;
        ArrayList arrayList13;
        String str14;
        String str15;
        String str16;
        String str17;
        ArrayList arrayList14;
        float f8;
        int i8;
        String str18;
        String str19;
        int i9;
        String str20;
        ArrayList arrayList15;
        long j11;
        int i10;
        String str21;
        ArrayList arrayList16;
        String str22;
        String str23;
        ArrayList arrayList17;
        String str24;
        ArrayList arrayList18;
        long j12;
        String str25;
        int i11;
        ArrayList arrayList19;
        String str26;
        String str27;
        ArrayList arrayList20;
        String str28;
        String str29;
        String str30;
        ArrayList arrayList21;
        int i12;
        String str31;
        String str32;
        ArrayList arrayList22;
        int i13;
        String str33;
        long j13;
        ArrayList arrayList23;
        ArrayList arrayList24;
        String str34;
        String str35;
        String str36;
        ArrayList arrayList25;
        String str37;
        ArrayList arrayList26;
        String str38;
        ArrayList arrayList27;
        ArrayList arrayList28;
        String str39;
        String str40;
        String str41;
        m kVar;
        String str42;
        String str43;
        String str44;
        float f9;
        long j14;
        float f10;
        long j15;
        int i14 = 0;
        String[] strArr = new String[0];
        String str45 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "profiles");
        if (attributeValue != null) {
            strArr = attributeValue.split(",");
        }
        int length = strArr.length;
        int i15 = 0;
        while (true) {
            if (i15 >= length) {
                z4 = false;
                break;
            }
            if (strArr[i15].startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                z4 = true;
                break;
            }
            i15++;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "availabilityStartTime");
        long j16 = -9223372036854775807L;
        long H7 = attributeValue2 == null ? -9223372036854775807L : v2.t.H(attributeValue2);
        long k7 = k(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long k8 = k(xmlPullParser, "minBufferTime", -9223372036854775807L);
        boolean equals = "dynamic".equals(xmlPullParser.getAttributeValue(null, "type"));
        long k9 = equals ? k(xmlPullParser, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long k10 = equals ? k(xmlPullParser, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long k11 = equals ? k(xmlPullParser, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "publishTime");
        long H8 = attributeValue3 == null ? -9223372036854775807L : v2.t.H(attributeValue3);
        long j17 = equals ? 0L : -9223372036854775807L;
        ArrayList i16 = AbstractC0158p.i(new b(uri.toString(), uri.toString(), z4 ? 1 : Integer.MIN_VALUE, 1));
        ArrayList arrayList29 = new ArrayList();
        ArrayList arrayList30 = new ArrayList();
        i iVar = null;
        C0859k c0859k = null;
        Uri uri2 = null;
        t tVar = null;
        boolean z9 = false;
        long j18 = equals ? -9223372036854775807L : 0L;
        boolean z10 = false;
        while (true) {
            xmlPullParser.next();
            String str46 = "BaseURL";
            if (AbstractC1664a.v(xmlPullParser, "BaseURL")) {
                if (!z10) {
                    j17 = f(xmlPullParser, j17);
                    z10 = true;
                }
                arrayList30.addAll(g(xmlPullParser, i16, z4));
                arrayList = arrayList30;
                arrayList2 = i16;
                arrayList3 = arrayList29;
                z7 = z4;
                i7 = i14;
                long j19 = j16;
                j7 = j18;
                j3 = j19;
            } else {
                String str47 = "lang";
                if (AbstractC1664a.v(xmlPullParser, "ProgramInformation")) {
                    String attributeValue4 = xmlPullParser.getAttributeValue(str45, "moreInformationURL");
                    String str48 = attributeValue4 == null ? str45 : attributeValue4;
                    String attributeValue5 = xmlPullParser.getAttributeValue(str45, "lang");
                    String str49 = attributeValue5 == null ? str45 : attributeValue5;
                    String str50 = str45;
                    String str51 = str50;
                    String str52 = str51;
                    do {
                        xmlPullParser.next();
                        if (AbstractC1664a.v(xmlPullParser, "Title")) {
                            str50 = xmlPullParser.nextText();
                        } else if (AbstractC1664a.v(xmlPullParser, "Source")) {
                            str51 = xmlPullParser.nextText();
                        } else if (AbstractC1664a.v(xmlPullParser, "Copyright")) {
                            str52 = xmlPullParser.nextText();
                        } else {
                            d(xmlPullParser);
                        }
                    } while (!AbstractC1664a.t(xmlPullParser, "ProgramInformation"));
                    arrayList = arrayList30;
                    arrayList2 = i16;
                    arrayList3 = arrayList29;
                    iVar = new i(str50, str51, str52, str48, str49);
                } else {
                    String str53 = "value";
                    String str54 = "schemeIdUri";
                    if (AbstractC1664a.v(xmlPullParser, "UTCTiming")) {
                        arrayList = arrayList30;
                        arrayList2 = i16;
                        arrayList3 = arrayList29;
                        c0859k = new C0859k(xmlPullParser.getAttributeValue(str45, "schemeIdUri"), xmlPullParser.getAttributeValue(str45, "value"));
                    } else if (AbstractC1664a.v(xmlPullParser, "Location")) {
                        arrayList = arrayList30;
                        uri2 = AbstractC1664a.D(uri.toString(), xmlPullParser.nextText());
                        arrayList2 = i16;
                        arrayList3 = arrayList29;
                    } else if (AbstractC1664a.v(xmlPullParser, "ServiceDescription")) {
                        float f11 = -3.4028235E38f;
                        float f12 = -3.4028235E38f;
                        long j20 = -9223372036854775807L;
                        long j21 = -9223372036854775807L;
                        long j22 = -9223372036854775807L;
                        while (true) {
                            xmlPullParser.next();
                            long j23 = j17;
                            if (AbstractC1664a.v(xmlPullParser, "Latency")) {
                                long n2 = n(xmlPullParser, "target", -9223372036854775807L);
                                long n7 = n(xmlPullParser, "min", -9223372036854775807L);
                                j22 = n(xmlPullParser, "max", -9223372036854775807L);
                                j15 = n7;
                                f9 = f11;
                                f10 = f12;
                                j14 = n2;
                            } else {
                                if (AbstractC1664a.v(xmlPullParser, "PlaybackRate")) {
                                    String attributeValue6 = xmlPullParser.getAttributeValue(null, "min");
                                    f11 = attributeValue6 == null ? -3.4028235E38f : Float.parseFloat(attributeValue6);
                                    String attributeValue7 = xmlPullParser.getAttributeValue(null, "max");
                                    f12 = attributeValue7 == null ? -3.4028235E38f : Float.parseFloat(attributeValue7);
                                }
                                f9 = f11;
                                j14 = j20;
                                f10 = f12;
                                j15 = j21;
                            }
                            long j24 = j22;
                            if (AbstractC1664a.t(xmlPullParser, "ServiceDescription")) {
                                tVar = new t(j14, j15, j24, f9, f10);
                                arrayList = arrayList30;
                                arrayList2 = i16;
                                arrayList3 = arrayList29;
                                z7 = z4;
                                j7 = j18;
                                j17 = j23;
                                j3 = -9223372036854775807L;
                                i7 = 0;
                            } else {
                                j17 = j23;
                                j20 = j14;
                                j21 = j15;
                                j22 = j24;
                                f11 = f9;
                                f12 = f10;
                            }
                        }
                    } else {
                        long j25 = j17;
                        String str55 = "Period";
                        if (!AbstractC1664a.v(xmlPullParser, "Period") || z9) {
                            arrayList = arrayList30;
                            arrayList2 = i16;
                            arrayList3 = arrayList29;
                            z7 = z4;
                            long j26 = j18;
                            j = j25;
                            j3 = -9223372036854775807L;
                            i7 = 0;
                            d(xmlPullParser);
                            j7 = j26;
                        } else {
                            ArrayList arrayList31 = !arrayList30.isEmpty() ? arrayList30 : i16;
                            String str56 = "id";
                            String attributeValue8 = xmlPullParser.getAttributeValue(null, "id");
                            long k12 = k(xmlPullParser, "start", j18);
                            long j27 = H7 != -9223372036854775807L ? H7 + k12 : -9223372036854775807L;
                            long j28 = j18;
                            long k13 = k(xmlPullParser, "duration", -9223372036854775807L);
                            ArrayList arrayList32 = new ArrayList();
                            String str57 = "duration";
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = new ArrayList();
                            long j29 = -9223372036854775807L;
                            arrayList2 = i16;
                            ArrayList arrayList35 = arrayList29;
                            long j30 = j25;
                            s sVar = null;
                            boolean z11 = false;
                            while (true) {
                                xmlPullParser.next();
                                if (AbstractC1664a.v(xmlPullParser, str46)) {
                                    if (!z11) {
                                        j30 = f(xmlPullParser, j30);
                                        z11 = true;
                                    }
                                    arrayList34.addAll(g(xmlPullParser, arrayList31, z4));
                                    arrayList = arrayList30;
                                    str = str46;
                                    str4 = str56;
                                    str5 = str53;
                                    arrayList5 = arrayList31;
                                    z7 = z4;
                                    str8 = str55;
                                    arrayList4 = arrayList34;
                                    j = j25;
                                    arrayList7 = arrayList33;
                                    z8 = true;
                                    i7 = 0;
                                    str7 = str54;
                                    str3 = str47;
                                    str6 = str57;
                                    arrayList6 = arrayList32;
                                } else {
                                    ArrayList arrayList36 = arrayList32;
                                    String str58 = str55;
                                    ArrayList arrayList37 = arrayList31;
                                    if (AbstractC1664a.v(xmlPullParser, "AdaptationSet")) {
                                        String str59 = "AdaptationSet";
                                        ArrayList arrayList38 = !arrayList34.isEmpty() ? arrayList34 : arrayList37;
                                        int m7 = m(xmlPullParser, str56, -1);
                                        int i17 = i(xmlPullParser);
                                        String str60 = "mimeType";
                                        ArrayList arrayList39 = arrayList30;
                                        String attributeValue9 = xmlPullParser.getAttributeValue(null, "mimeType");
                                        arrayList4 = arrayList34;
                                        String str61 = "codecs";
                                        String attributeValue10 = xmlPullParser.getAttributeValue(null, "codecs");
                                        long j31 = j30;
                                        int m8 = m(xmlPullParser, "width", -1);
                                        String str62 = "SegmentTemplate";
                                        String str63 = str53;
                                        int m9 = m(xmlPullParser, "height", -1);
                                        float l7 = l(xmlPullParser, -1.0f);
                                        String str64 = str54;
                                        String str65 = "SegmentList";
                                        String str66 = "SegmentBase";
                                        int m10 = m(xmlPullParser, "audioSamplingRate", -1);
                                        String attributeValue11 = xmlPullParser.getAttributeValue(null, str47);
                                        String str67 = "audioSamplingRate";
                                        String attributeValue12 = xmlPullParser.getAttributeValue(null, "label");
                                        ArrayList arrayList40 = new ArrayList();
                                        String str68 = attributeValue12;
                                        ArrayList arrayList41 = new ArrayList();
                                        ArrayList arrayList42 = new ArrayList();
                                        int i18 = m10;
                                        ArrayList arrayList43 = new ArrayList();
                                        float f13 = l7;
                                        ArrayList arrayList44 = new ArrayList();
                                        int i19 = m9;
                                        ArrayList arrayList45 = new ArrayList();
                                        String str69 = "height";
                                        ArrayList arrayList46 = new ArrayList();
                                        ArrayList arrayList47 = new ArrayList();
                                        String str70 = "width";
                                        int i20 = m8;
                                        String str71 = str56;
                                        ArrayList arrayList48 = arrayList42;
                                        s sVar2 = sVar;
                                        long j32 = j29;
                                        int i21 = i17;
                                        long j33 = j31;
                                        String str72 = attributeValue11;
                                        int i22 = -1;
                                        String str73 = null;
                                        boolean z12 = false;
                                        while (true) {
                                            xmlPullParser.next();
                                            if (AbstractC1664a.v(xmlPullParser, str46)) {
                                                if (z12) {
                                                    j10 = j33;
                                                } else {
                                                    j10 = f(xmlPullParser, j33);
                                                    z12 = true;
                                                }
                                                arrayList47.addAll(g(xmlPullParser, arrayList38, z4));
                                            } else {
                                                j10 = j33;
                                                if (AbstractC1664a.v(xmlPullParser, "ContentProtection")) {
                                                    Pair h6 = h(xmlPullParser);
                                                    Object obj = h6.first;
                                                    if (obj != null) {
                                                        str73 = (String) obj;
                                                    }
                                                    Object obj2 = h6.second;
                                                    if (obj2 != null) {
                                                        arrayList40.add((DrmInitData.SchemeData) obj2);
                                                    }
                                                } else if (AbstractC1664a.v(xmlPullParser, "ContentComponent")) {
                                                    String attributeValue13 = xmlPullParser.getAttributeValue(null, str47);
                                                    if (str72 == null) {
                                                        str72 = attributeValue13;
                                                    } else if (attributeValue13 != null) {
                                                        AbstractC1664a.h(str72.equals(attributeValue13));
                                                    }
                                                    int i23 = i(xmlPullParser);
                                                    if (i21 == -1) {
                                                        i21 = i23;
                                                    } else if (i23 != -1) {
                                                        AbstractC1664a.h(i21 == i23);
                                                    }
                                                } else {
                                                    if (AbstractC1664a.v(xmlPullParser, "Role")) {
                                                        arrayList43.add(j(xmlPullParser, "Role"));
                                                        i11 = i21;
                                                        str = str46;
                                                        arrayList11 = arrayList44;
                                                        str13 = str72;
                                                        arrayList12 = arrayList47;
                                                        arrayList13 = arrayList40;
                                                        arrayList10 = arrayList43;
                                                        j = j25;
                                                        str2 = str58;
                                                        str14 = str59;
                                                        j8 = j31;
                                                        str25 = str62;
                                                        str15 = str63;
                                                        str16 = str64;
                                                        str23 = str65;
                                                        str17 = str67;
                                                        arrayList19 = arrayList41;
                                                        f8 = f13;
                                                        i8 = i19;
                                                        str18 = str69;
                                                        arrayList18 = arrayList46;
                                                        str19 = str70;
                                                        i9 = i20;
                                                        str20 = str71;
                                                        arrayList15 = arrayList48;
                                                        j11 = j10;
                                                        i10 = i18;
                                                        i7 = 0;
                                                        arrayList17 = arrayList38;
                                                    } else {
                                                        String str74 = "AudioChannelConfiguration";
                                                        if (AbstractC1664a.v(xmlPullParser, "AudioChannelConfiguration")) {
                                                            str = str46;
                                                            arrayList11 = arrayList44;
                                                            i22 = e(xmlPullParser);
                                                            arrayList12 = arrayList47;
                                                            arrayList13 = arrayList40;
                                                            arrayList10 = arrayList43;
                                                            j = j25;
                                                            str2 = str58;
                                                            j8 = j31;
                                                            str25 = str62;
                                                            str15 = str63;
                                                            str16 = str64;
                                                            str23 = str65;
                                                            str17 = str67;
                                                            str26 = str68;
                                                            arrayList19 = arrayList41;
                                                            f8 = f13;
                                                            i8 = i19;
                                                            str18 = str69;
                                                            arrayList18 = arrayList46;
                                                            str19 = str70;
                                                            i9 = i20;
                                                            str20 = str71;
                                                            arrayList15 = arrayList48;
                                                            j33 = j10;
                                                            i10 = i18;
                                                            i7 = 0;
                                                            arrayList17 = arrayList38;
                                                            str3 = str47;
                                                            arrayList16 = arrayList45;
                                                            str22 = str61;
                                                            arrayList5 = arrayList37;
                                                            str27 = str59;
                                                            str24 = str66;
                                                            str21 = str60;
                                                            z7 = z4;
                                                            arrayList = arrayList39;
                                                            if (AbstractC1664a.t(xmlPullParser, str27)) {
                                                                ArrayList arrayList49 = new ArrayList(arrayList18.size());
                                                                int i24 = i7;
                                                                while (i24 < arrayList18.size()) {
                                                                    ArrayList arrayList50 = arrayList18;
                                                                    d dVar = (d) arrayList50.get(i24);
                                                                    Format$Builder a2 = dVar.f13121a.a();
                                                                    if (str26 != null) {
                                                                        a2.f10529b = str26;
                                                                    }
                                                                    String str75 = dVar.f13124d;
                                                                    if (str75 == null) {
                                                                        str75 = str73;
                                                                    }
                                                                    ArrayList arrayList51 = dVar.f13125e;
                                                                    ArrayList arrayList52 = arrayList13;
                                                                    arrayList51.addAll(arrayList52);
                                                                    if (arrayList51.isEmpty()) {
                                                                        arrayList18 = arrayList50;
                                                                        str41 = str26;
                                                                    } else {
                                                                        int i25 = i7;
                                                                        while (true) {
                                                                            if (i25 < arrayList51.size()) {
                                                                                DrmInitData.SchemeData schemeData = (DrmInitData.SchemeData) arrayList51.get(i25);
                                                                                if (!AbstractC0029l.f464c.equals(schemeData.f10558b) || (str44 = schemeData.f10559c) == null) {
                                                                                    i25++;
                                                                                } else {
                                                                                    arrayList51.remove(i25);
                                                                                    str42 = str44;
                                                                                }
                                                                            } else {
                                                                                str42 = null;
                                                                            }
                                                                        }
                                                                        if (str42 != null) {
                                                                            int i26 = i7;
                                                                            while (i26 < arrayList51.size()) {
                                                                                DrmInitData.SchemeData schemeData2 = (DrmInitData.SchemeData) arrayList51.get(i26);
                                                                                ArrayList arrayList53 = arrayList50;
                                                                                if (AbstractC0029l.f463b.equals(schemeData2.f10558b) && schemeData2.f10559c == null) {
                                                                                    str43 = str26;
                                                                                    arrayList51.set(i26, new DrmInitData.SchemeData(AbstractC0029l.f464c, str42, schemeData2.f10560d, schemeData2.f10561e));
                                                                                } else {
                                                                                    str43 = str26;
                                                                                }
                                                                                i26++;
                                                                                str26 = str43;
                                                                                arrayList50 = arrayList53;
                                                                            }
                                                                        }
                                                                        arrayList18 = arrayList50;
                                                                        str41 = str26;
                                                                        for (int size = arrayList51.size() - 1; size >= 0; size--) {
                                                                            DrmInitData.SchemeData schemeData3 = (DrmInitData.SchemeData) arrayList51.get(size);
                                                                            if (schemeData3.f10561e == null) {
                                                                                int i27 = i7;
                                                                                while (true) {
                                                                                    if (i27 < arrayList51.size()) {
                                                                                        DrmInitData.SchemeData schemeData4 = (DrmInitData.SchemeData) arrayList51.get(i27);
                                                                                        if (schemeData4.f10561e != null && schemeData3.f10561e == null) {
                                                                                            UUID uuid = schemeData3.f10558b;
                                                                                            schemeData4.getClass();
                                                                                            UUID uuid2 = AbstractC0029l.f462a;
                                                                                            UUID uuid3 = schemeData4.f10558b;
                                                                                            if (((uuid2.equals(uuid3) || uuid.equals(uuid3)) ? 1 : i7) != 0) {
                                                                                                arrayList51.remove(size);
                                                                                            }
                                                                                        }
                                                                                        i27++;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        a2.f10540n = new DrmInitData(str75, arrayList51);
                                                                    }
                                                                    ArrayList arrayList54 = dVar.f13126f;
                                                                    arrayList54.addAll(arrayList19);
                                                                    X x4 = new X(a2);
                                                                    s sVar3 = dVar.f13123c;
                                                                    boolean z13 = sVar3 instanceof r;
                                                                    ArrayList arrayList55 = dVar.f13128h;
                                                                    ArrayList arrayList56 = dVar.f13129i;
                                                                    long j34 = dVar.f13127g;
                                                                    AbstractC0167z abstractC0167z = dVar.f13122b;
                                                                    if (z13) {
                                                                        kVar = new l(j34, x4, abstractC0167z, (r) sVar3, arrayList54, arrayList55, arrayList56);
                                                                    } else {
                                                                        if (!(sVar3 instanceof n)) {
                                                                            throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                                                        }
                                                                        kVar = new k(j34, x4, abstractC0167z, (n) sVar3, arrayList54, arrayList55, arrayList56);
                                                                    }
                                                                    arrayList49.add(kVar);
                                                                    i24++;
                                                                    arrayList13 = arrayList52;
                                                                    str26 = str41;
                                                                }
                                                                arrayList36.add(new a(m7, i21, arrayList49, arrayList15, arrayList11, arrayList16));
                                                                arrayList7 = arrayList33;
                                                                str7 = str16;
                                                                str4 = str20;
                                                                str5 = str15;
                                                                j3 = -9223372036854775807L;
                                                                z8 = true;
                                                                str6 = str57;
                                                                arrayList6 = arrayList36;
                                                            } else {
                                                                arrayList41 = arrayList19;
                                                                arrayList48 = arrayList15;
                                                                str68 = str26;
                                                                str47 = str3;
                                                                i19 = i8;
                                                                j25 = j;
                                                                z4 = z7;
                                                                str60 = str21;
                                                                i20 = i9;
                                                                f13 = f8;
                                                                arrayList37 = arrayList5;
                                                                arrayList45 = arrayList16;
                                                                arrayList39 = arrayList;
                                                                j31 = j8;
                                                                i18 = i10;
                                                                str46 = str;
                                                                str70 = str19;
                                                                arrayList44 = arrayList11;
                                                                str64 = str16;
                                                                str71 = str20;
                                                                str63 = str15;
                                                                str69 = str18;
                                                                arrayList46 = arrayList18;
                                                                arrayList47 = arrayList12;
                                                                str58 = str2;
                                                                arrayList40 = arrayList13;
                                                                str62 = str25;
                                                                str59 = str27;
                                                                str66 = str24;
                                                                arrayList38 = arrayList17;
                                                                str61 = str22;
                                                                str65 = str23;
                                                                str67 = str17;
                                                                arrayList43 = arrayList10;
                                                            }
                                                        } else {
                                                            ArrayList arrayList57 = arrayList38;
                                                            if (AbstractC1664a.v(xmlPullParser, "Accessibility")) {
                                                                ArrayList arrayList58 = arrayList48;
                                                                arrayList58.add(j(xmlPullParser, "Accessibility"));
                                                                i11 = i21;
                                                                str = str46;
                                                                arrayList11 = arrayList44;
                                                                str13 = str72;
                                                                arrayList15 = arrayList58;
                                                                arrayList12 = arrayList47;
                                                                arrayList13 = arrayList40;
                                                                arrayList10 = arrayList43;
                                                                j = j25;
                                                                str2 = str58;
                                                                str14 = str59;
                                                                j8 = j31;
                                                                str25 = str62;
                                                                str15 = str63;
                                                                str16 = str64;
                                                                str23 = str65;
                                                                str17 = str67;
                                                                arrayList19 = arrayList41;
                                                                f8 = f13;
                                                                i8 = i19;
                                                                str18 = str69;
                                                                arrayList18 = arrayList46;
                                                                str19 = str70;
                                                                i9 = i20;
                                                                str20 = str71;
                                                            } else {
                                                                if (AbstractC1664a.v(xmlPullParser, "EssentialProperty")) {
                                                                    arrayList44.add(j(xmlPullParser, "EssentialProperty"));
                                                                    i11 = i21;
                                                                    str = str46;
                                                                    arrayList11 = arrayList44;
                                                                    str13 = str72;
                                                                    arrayList12 = arrayList47;
                                                                    arrayList13 = arrayList40;
                                                                    arrayList10 = arrayList43;
                                                                } else {
                                                                    arrayList10 = arrayList43;
                                                                    if (AbstractC1664a.v(xmlPullParser, "SupplementalProperty")) {
                                                                        arrayList45.add(j(xmlPullParser, "SupplementalProperty"));
                                                                        i11 = i21;
                                                                        str = str46;
                                                                        arrayList11 = arrayList44;
                                                                        str13 = str72;
                                                                        arrayList12 = arrayList47;
                                                                        arrayList13 = arrayList40;
                                                                    } else {
                                                                        String str76 = "SupplementalProperty";
                                                                        String str77 = "Representation";
                                                                        if (AbstractC1664a.v(xmlPullParser, "Representation")) {
                                                                            String str78 = "ContentProtection";
                                                                            if (arrayList47.isEmpty()) {
                                                                                arrayList20 = arrayList47;
                                                                                str28 = str71;
                                                                                str29 = null;
                                                                                str30 = "InbandEventStream";
                                                                                arrayList21 = arrayList57;
                                                                            } else {
                                                                                arrayList20 = arrayList47;
                                                                                str28 = str71;
                                                                                str30 = "InbandEventStream";
                                                                                arrayList21 = arrayList20;
                                                                                str29 = null;
                                                                            }
                                                                            String attributeValue14 = xmlPullParser.getAttributeValue(str29, str28);
                                                                            String str79 = "EssentialProperty";
                                                                            int m11 = m(xmlPullParser, "bandwidth", -1);
                                                                            String attributeValue15 = xmlPullParser.getAttributeValue(null, str60);
                                                                            String str80 = attributeValue15 == null ? attributeValue9 : attributeValue15;
                                                                            String attributeValue16 = xmlPullParser.getAttributeValue(null, str61);
                                                                            String str81 = attributeValue16 == null ? attributeValue10 : attributeValue16;
                                                                            String str82 = str70;
                                                                            int i28 = i20;
                                                                            int m12 = m(xmlPullParser, str82, i28);
                                                                            int i29 = i28;
                                                                            String str83 = str69;
                                                                            int i30 = i19;
                                                                            String str84 = str47;
                                                                            int m13 = m(xmlPullParser, str83, i30);
                                                                            String str85 = str72;
                                                                            float f14 = f13;
                                                                            float l8 = l(xmlPullParser, f14);
                                                                            String str86 = str28;
                                                                            String str87 = str67;
                                                                            str22 = str61;
                                                                            int i31 = i18;
                                                                            int m14 = m(xmlPullParser, str87, i31);
                                                                            i10 = i31;
                                                                            ArrayList arrayList59 = new ArrayList();
                                                                            ArrayList arrayList60 = new ArrayList();
                                                                            ArrayList arrayList61 = new ArrayList(arrayList44);
                                                                            ArrayList arrayList62 = new ArrayList(arrayList45);
                                                                            ArrayList arrayList63 = new ArrayList();
                                                                            str19 = str82;
                                                                            String str88 = str60;
                                                                            int i32 = i30;
                                                                            ArrayList arrayList64 = arrayList45;
                                                                            int i33 = i22;
                                                                            long j35 = j10;
                                                                            s sVar4 = sVar2;
                                                                            long j36 = j32;
                                                                            String str89 = null;
                                                                            boolean z14 = false;
                                                                            while (true) {
                                                                                xmlPullParser.next();
                                                                                if (AbstractC1664a.v(xmlPullParser, str46)) {
                                                                                    if (z14) {
                                                                                        i12 = i21;
                                                                                    } else {
                                                                                        j35 = f(xmlPullParser, j35);
                                                                                        i12 = i21;
                                                                                        z14 = true;
                                                                                    }
                                                                                    arrayList63.addAll(g(xmlPullParser, arrayList21, z4));
                                                                                } else {
                                                                                    i12 = i21;
                                                                                    if (AbstractC1664a.v(xmlPullParser, str74)) {
                                                                                        i33 = e(xmlPullParser);
                                                                                    } else {
                                                                                        String str90 = str66;
                                                                                        if (AbstractC1664a.v(xmlPullParser, str90)) {
                                                                                            str66 = str90;
                                                                                            sVar4 = s(xmlPullParser, (r) sVar4);
                                                                                        } else {
                                                                                            String str91 = str65;
                                                                                            if (AbstractC1664a.v(xmlPullParser, str91)) {
                                                                                                long f15 = f(xmlPullParser, j36);
                                                                                                j = j25;
                                                                                                arrayList17 = arrayList57;
                                                                                                String str92 = str79;
                                                                                                arrayList23 = arrayList21;
                                                                                                str31 = str59;
                                                                                                str21 = str88;
                                                                                                str = str46;
                                                                                                str32 = str90;
                                                                                                i13 = i12;
                                                                                                arrayList = arrayList39;
                                                                                                arrayList11 = arrayList44;
                                                                                                str13 = str85;
                                                                                                long j37 = j31;
                                                                                                f8 = f14;
                                                                                                i9 = i29;
                                                                                                j8 = j37;
                                                                                                str17 = str87;
                                                                                                str16 = str64;
                                                                                                arrayList14 = arrayList41;
                                                                                                str20 = str86;
                                                                                                arrayList15 = arrayList48;
                                                                                                j11 = j10;
                                                                                                str33 = str74;
                                                                                                String str93 = str78;
                                                                                                arrayList24 = arrayList63;
                                                                                                str34 = str93;
                                                                                                j13 = j35;
                                                                                                str15 = str63;
                                                                                                str3 = str84;
                                                                                                arrayList16 = arrayList64;
                                                                                                i8 = i32;
                                                                                                str18 = str83;
                                                                                                String str94 = str62;
                                                                                                arrayList22 = arrayList46;
                                                                                                arrayList12 = arrayList20;
                                                                                                arrayList5 = arrayList37;
                                                                                                z7 = z4;
                                                                                                sVar4 = t(xmlPullParser, (o) sVar4, j27, k13, j35, f15, k10);
                                                                                                arrayList13 = arrayList40;
                                                                                                str2 = str58;
                                                                                                str37 = str92;
                                                                                                str36 = str30;
                                                                                                str38 = str76;
                                                                                                str39 = str77;
                                                                                                str40 = str89;
                                                                                                arrayList25 = arrayList59;
                                                                                                arrayList26 = arrayList60;
                                                                                                arrayList27 = arrayList61;
                                                                                                arrayList28 = arrayList62;
                                                                                                j36 = f15;
                                                                                                i7 = 0;
                                                                                                str35 = str94;
                                                                                                str23 = str91;
                                                                                            } else {
                                                                                                str17 = str87;
                                                                                                str18 = str83;
                                                                                                j = j25;
                                                                                                str31 = str59;
                                                                                                str15 = str63;
                                                                                                str16 = str64;
                                                                                                str32 = str90;
                                                                                                arrayList14 = arrayList41;
                                                                                                str20 = str86;
                                                                                                str3 = str84;
                                                                                                arrayList22 = arrayList46;
                                                                                                arrayList15 = arrayList48;
                                                                                                j11 = j10;
                                                                                                arrayList17 = arrayList57;
                                                                                                arrayList12 = arrayList20;
                                                                                                String str95 = str79;
                                                                                                str13 = str85;
                                                                                                arrayList16 = arrayList64;
                                                                                                i8 = i32;
                                                                                                str21 = str88;
                                                                                                i13 = i12;
                                                                                                str = str46;
                                                                                                arrayList11 = arrayList44;
                                                                                                str33 = str74;
                                                                                                j13 = j35;
                                                                                                arrayList23 = arrayList21;
                                                                                                arrayList = arrayList39;
                                                                                                String str96 = str62;
                                                                                                arrayList5 = arrayList37;
                                                                                                z7 = z4;
                                                                                                long j38 = j31;
                                                                                                f8 = f14;
                                                                                                i9 = i29;
                                                                                                j8 = j38;
                                                                                                String str97 = str78;
                                                                                                arrayList24 = arrayList63;
                                                                                                str34 = str97;
                                                                                                if (AbstractC1664a.v(xmlPullParser, str96)) {
                                                                                                    long f16 = f(xmlPullParser, j36);
                                                                                                    arrayList13 = arrayList40;
                                                                                                    str2 = str58;
                                                                                                    i7 = 0;
                                                                                                    str35 = str96;
                                                                                                    str23 = str91;
                                                                                                    sVar4 = u(xmlPullParser, (p) sVar4, arrayList16, j27, k13, j13, f16, k10);
                                                                                                    str37 = str95;
                                                                                                    j36 = f16;
                                                                                                    str36 = str30;
                                                                                                    str38 = str76;
                                                                                                    str39 = str77;
                                                                                                    str40 = str89;
                                                                                                    arrayList25 = arrayList59;
                                                                                                } else {
                                                                                                    arrayList13 = arrayList40;
                                                                                                    str2 = str58;
                                                                                                    i7 = 0;
                                                                                                    str35 = str96;
                                                                                                    str23 = str91;
                                                                                                    if (AbstractC1664a.v(xmlPullParser, str34)) {
                                                                                                        Pair h7 = h(xmlPullParser);
                                                                                                        Object obj3 = h7.first;
                                                                                                        if (obj3 != null) {
                                                                                                            str89 = (String) obj3;
                                                                                                        }
                                                                                                        Object obj4 = h7.second;
                                                                                                        if (obj4 != null) {
                                                                                                            arrayList25 = arrayList59;
                                                                                                            arrayList25.add((DrmInitData.SchemeData) obj4);
                                                                                                        } else {
                                                                                                            arrayList25 = arrayList59;
                                                                                                        }
                                                                                                        str37 = str95;
                                                                                                        str36 = str30;
                                                                                                        str38 = str76;
                                                                                                        str39 = str77;
                                                                                                        str40 = str89;
                                                                                                    } else {
                                                                                                        str36 = str30;
                                                                                                        arrayList25 = arrayList59;
                                                                                                        if (AbstractC1664a.v(xmlPullParser, str36)) {
                                                                                                            arrayList26 = arrayList60;
                                                                                                            arrayList26.add(j(xmlPullParser, str36));
                                                                                                            str37 = str95;
                                                                                                            str38 = str76;
                                                                                                            arrayList27 = arrayList61;
                                                                                                        } else {
                                                                                                            str37 = str95;
                                                                                                            arrayList26 = arrayList60;
                                                                                                            if (AbstractC1664a.v(xmlPullParser, str37)) {
                                                                                                                arrayList27 = arrayList61;
                                                                                                                arrayList27.add(j(xmlPullParser, str37));
                                                                                                                str38 = str76;
                                                                                                            } else {
                                                                                                                str38 = str76;
                                                                                                                arrayList27 = arrayList61;
                                                                                                                if (AbstractC1664a.v(xmlPullParser, str38)) {
                                                                                                                    arrayList28 = arrayList62;
                                                                                                                    arrayList28.add(j(xmlPullParser, str38));
                                                                                                                } else {
                                                                                                                    arrayList28 = arrayList62;
                                                                                                                    d(xmlPullParser);
                                                                                                                }
                                                                                                                str39 = str77;
                                                                                                                str40 = str89;
                                                                                                            }
                                                                                                        }
                                                                                                        arrayList28 = arrayList62;
                                                                                                        str39 = str77;
                                                                                                        str40 = str89;
                                                                                                    }
                                                                                                }
                                                                                                arrayList26 = arrayList60;
                                                                                                arrayList27 = arrayList61;
                                                                                                arrayList28 = arrayList62;
                                                                                            }
                                                                                            if (AbstractC1664a.t(xmlPullParser, str39)) {
                                                                                                str30 = str36;
                                                                                                arrayList59 = arrayList25;
                                                                                                arrayList60 = arrayList26;
                                                                                                str76 = str38;
                                                                                                arrayList61 = arrayList27;
                                                                                                str89 = str40;
                                                                                                arrayList62 = arrayList28;
                                                                                                str77 = str39;
                                                                                                str87 = str17;
                                                                                                arrayList48 = arrayList15;
                                                                                                str84 = str3;
                                                                                                i32 = i8;
                                                                                                j25 = j;
                                                                                                z4 = z7;
                                                                                                f14 = f8;
                                                                                                arrayList37 = arrayList5;
                                                                                                arrayList64 = arrayList16;
                                                                                                str74 = str33;
                                                                                                arrayList57 = arrayList17;
                                                                                                arrayList39 = arrayList;
                                                                                                j35 = j13;
                                                                                                str46 = str;
                                                                                                i21 = i13;
                                                                                                str66 = str32;
                                                                                                str64 = str16;
                                                                                                str86 = str20;
                                                                                                arrayList41 = arrayList14;
                                                                                                j10 = j11;
                                                                                                str63 = str15;
                                                                                                str83 = str18;
                                                                                                arrayList46 = arrayList22;
                                                                                                arrayList20 = arrayList12;
                                                                                                arrayList40 = arrayList13;
                                                                                                str65 = str23;
                                                                                                str62 = str35;
                                                                                                str88 = str21;
                                                                                                arrayList21 = arrayList23;
                                                                                                str59 = str31;
                                                                                                str58 = str2;
                                                                                                str79 = str37;
                                                                                                arrayList44 = arrayList11;
                                                                                                ArrayList arrayList65 = arrayList24;
                                                                                                str78 = str34;
                                                                                                arrayList63 = arrayList65;
                                                                                                long j39 = j8;
                                                                                                i29 = i9;
                                                                                                j31 = j39;
                                                                                                str85 = str13;
                                                                                            } else {
                                                                                                X b7 = b(attributeValue14, str80, m12, m13, l8, i33, m14, m11, str13, arrayList10, arrayList15, str81, arrayList27, arrayList28);
                                                                                                d dVar2 = new d(b7, !arrayList24.isEmpty() ? arrayList24 : arrayList23, sVar4 != null ? sVar4 : new r(null, 1L, 0L, 0L, 0L), str40, arrayList25, arrayList26, arrayList27, arrayList28);
                                                                                                i21 = v2.i.g(b7.f283C);
                                                                                                int i34 = i13;
                                                                                                if (i34 != -1) {
                                                                                                    if (i21 != -1) {
                                                                                                        AbstractC1664a.h(i34 == i21 ? 1 : i7);
                                                                                                    }
                                                                                                    i21 = i34;
                                                                                                }
                                                                                                ArrayList arrayList66 = arrayList22;
                                                                                                arrayList66.add(dVar2);
                                                                                                arrayList18 = arrayList66;
                                                                                                str25 = str35;
                                                                                                str26 = str68;
                                                                                                str27 = str31;
                                                                                                str24 = str32;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                str17 = str87;
                                                                                str18 = str83;
                                                                                arrayList13 = arrayList40;
                                                                                j = j25;
                                                                                str2 = str58;
                                                                                str31 = str59;
                                                                                str35 = str62;
                                                                                str15 = str63;
                                                                                str16 = str64;
                                                                                str32 = str66;
                                                                                arrayList14 = arrayList41;
                                                                                str20 = str86;
                                                                                str3 = str84;
                                                                                arrayList22 = arrayList46;
                                                                                str36 = str30;
                                                                                arrayList15 = arrayList48;
                                                                                j11 = j10;
                                                                                str38 = str76;
                                                                                arrayList12 = arrayList20;
                                                                                str39 = str77;
                                                                                str13 = str85;
                                                                                arrayList16 = arrayList64;
                                                                                i8 = i32;
                                                                                str21 = str88;
                                                                                i13 = i12;
                                                                                i7 = 0;
                                                                                str = str46;
                                                                                arrayList11 = arrayList44;
                                                                                str33 = str74;
                                                                                j13 = j35;
                                                                                arrayList5 = arrayList37;
                                                                                arrayList = arrayList39;
                                                                                str37 = str79;
                                                                                str40 = str89;
                                                                                arrayList25 = arrayList59;
                                                                                arrayList27 = arrayList61;
                                                                                arrayList28 = arrayList62;
                                                                                z7 = z4;
                                                                                arrayList23 = arrayList21;
                                                                                str23 = str65;
                                                                                arrayList17 = arrayList57;
                                                                                long j40 = j31;
                                                                                f8 = f14;
                                                                                i9 = i29;
                                                                                arrayList26 = arrayList60;
                                                                                j8 = j40;
                                                                                String str98 = str78;
                                                                                arrayList24 = arrayList63;
                                                                                str34 = str98;
                                                                                if (AbstractC1664a.t(xmlPullParser, str39)) {
                                                                                }
                                                                            }
                                                                        } else {
                                                                            str = str46;
                                                                            arrayList11 = arrayList44;
                                                                            str13 = str72;
                                                                            arrayList12 = arrayList47;
                                                                            arrayList13 = arrayList40;
                                                                            j = j25;
                                                                            str2 = str58;
                                                                            str14 = str59;
                                                                            j8 = j31;
                                                                            String str99 = str62;
                                                                            str15 = str63;
                                                                            str16 = str64;
                                                                            str17 = str67;
                                                                            arrayList14 = arrayList41;
                                                                            f8 = f13;
                                                                            i8 = i19;
                                                                            str18 = str69;
                                                                            str19 = str70;
                                                                            i9 = i20;
                                                                            str20 = str71;
                                                                            arrayList15 = arrayList48;
                                                                            j11 = j10;
                                                                            i10 = i18;
                                                                            i7 = 0;
                                                                            str21 = str60;
                                                                            int i35 = i21;
                                                                            str3 = str47;
                                                                            arrayList16 = arrayList45;
                                                                            str22 = str61;
                                                                            arrayList5 = arrayList37;
                                                                            str23 = str65;
                                                                            String str100 = str66;
                                                                            arrayList17 = arrayList57;
                                                                            z7 = z4;
                                                                            arrayList = arrayList39;
                                                                            ArrayList arrayList67 = arrayList46;
                                                                            if (AbstractC1664a.v(xmlPullParser, str100)) {
                                                                                sVar2 = s(xmlPullParser, (r) sVar2);
                                                                                str24 = str100;
                                                                                arrayList18 = arrayList67;
                                                                                i21 = i35;
                                                                                str25 = str99;
                                                                            } else if (AbstractC1664a.v(xmlPullParser, str23)) {
                                                                                j32 = f(xmlPullParser, j32);
                                                                                j33 = j11;
                                                                                str24 = str100;
                                                                                arrayList18 = arrayList67;
                                                                                sVar2 = t(xmlPullParser, (o) sVar2, j27, k13, j33, j32, k10);
                                                                                i21 = i35;
                                                                                str25 = str99;
                                                                                str26 = str68;
                                                                                str27 = str14;
                                                                                str72 = str13;
                                                                                arrayList19 = arrayList14;
                                                                                if (AbstractC1664a.t(xmlPullParser, str27)) {
                                                                                }
                                                                            } else {
                                                                                str24 = str100;
                                                                                arrayList18 = arrayList67;
                                                                                j12 = j32;
                                                                                if (AbstractC1664a.v(xmlPullParser, str99)) {
                                                                                    j32 = f(xmlPullParser, j12);
                                                                                    str25 = str99;
                                                                                    sVar2 = u(xmlPullParser, (p) sVar2, arrayList16, j27, k13, j11, j32, k10);
                                                                                    i21 = i35;
                                                                                } else {
                                                                                    str25 = str99;
                                                                                    i11 = i35;
                                                                                    if (AbstractC1664a.v(xmlPullParser, "InbandEventStream")) {
                                                                                        arrayList19 = arrayList14;
                                                                                        arrayList19.add(j(xmlPullParser, "InbandEventStream"));
                                                                                    } else {
                                                                                        arrayList19 = arrayList14;
                                                                                        if (AbstractC1664a.v(xmlPullParser, "Label")) {
                                                                                            str26 = "";
                                                                                            do {
                                                                                                xmlPullParser.next();
                                                                                                if (xmlPullParser.getEventType() == 4) {
                                                                                                    str26 = xmlPullParser.getText();
                                                                                                } else {
                                                                                                    d(xmlPullParser);
                                                                                                }
                                                                                            } while (!AbstractC1664a.t(xmlPullParser, "Label"));
                                                                                            j32 = j12;
                                                                                            i21 = i11;
                                                                                            str27 = str14;
                                                                                            str72 = str13;
                                                                                            j33 = j11;
                                                                                            if (AbstractC1664a.t(xmlPullParser, str27)) {
                                                                                            }
                                                                                        } else if (AbstractC1664a.u(xmlPullParser)) {
                                                                                            d(xmlPullParser);
                                                                                        }
                                                                                    }
                                                                                    j32 = j12;
                                                                                    i21 = i11;
                                                                                    str26 = str68;
                                                                                    str27 = str14;
                                                                                    str72 = str13;
                                                                                    j33 = j11;
                                                                                    if (AbstractC1664a.t(xmlPullParser, str27)) {
                                                                                    }
                                                                                }
                                                                            }
                                                                            str26 = str68;
                                                                            str27 = str14;
                                                                        }
                                                                        str72 = str13;
                                                                        arrayList19 = arrayList14;
                                                                        j33 = j11;
                                                                        if (AbstractC1664a.t(xmlPullParser, str27)) {
                                                                        }
                                                                    }
                                                                }
                                                                j = j25;
                                                                str2 = str58;
                                                                str14 = str59;
                                                                j8 = j31;
                                                                str25 = str62;
                                                                str15 = str63;
                                                                str16 = str64;
                                                                str23 = str65;
                                                                str17 = str67;
                                                                arrayList19 = arrayList41;
                                                                f8 = f13;
                                                                i8 = i19;
                                                                str18 = str69;
                                                                arrayList18 = arrayList46;
                                                                str19 = str70;
                                                                i9 = i20;
                                                                str20 = str71;
                                                                arrayList15 = arrayList48;
                                                            }
                                                            j11 = j10;
                                                            arrayList17 = arrayList57;
                                                            i10 = i18;
                                                            i7 = 0;
                                                        }
                                                    }
                                                    str21 = str60;
                                                    str3 = str47;
                                                    arrayList16 = arrayList45;
                                                    str22 = str61;
                                                    arrayList5 = arrayList37;
                                                    str24 = str66;
                                                    j12 = j32;
                                                    z7 = z4;
                                                    arrayList = arrayList39;
                                                    j32 = j12;
                                                    i21 = i11;
                                                    str26 = str68;
                                                    str27 = str14;
                                                    str72 = str13;
                                                    j33 = j11;
                                                    if (AbstractC1664a.t(xmlPullParser, str27)) {
                                                    }
                                                }
                                            }
                                            str = str46;
                                            arrayList11 = arrayList44;
                                            arrayList12 = arrayList47;
                                            arrayList13 = arrayList40;
                                            arrayList10 = arrayList43;
                                            j = j25;
                                            str2 = str58;
                                            j8 = j31;
                                            str25 = str62;
                                            str15 = str63;
                                            str16 = str64;
                                            str23 = str65;
                                            str17 = str67;
                                            str26 = str68;
                                            arrayList19 = arrayList41;
                                            f8 = f13;
                                            i8 = i19;
                                            str18 = str69;
                                            arrayList18 = arrayList46;
                                            str19 = str70;
                                            i9 = i20;
                                            str20 = str71;
                                            arrayList15 = arrayList48;
                                            j33 = j10;
                                            i10 = i18;
                                            i7 = 0;
                                            arrayList17 = arrayList38;
                                            str3 = str47;
                                            arrayList16 = arrayList45;
                                            str22 = str61;
                                            arrayList5 = arrayList37;
                                            str27 = str59;
                                            str24 = str66;
                                            str21 = str60;
                                            z7 = z4;
                                            arrayList = arrayList39;
                                            if (AbstractC1664a.t(xmlPullParser, str27)) {
                                            }
                                        }
                                    } else {
                                        arrayList = arrayList30;
                                        str = str46;
                                        j8 = j30;
                                        String str101 = str56;
                                        String str102 = str54;
                                        String str103 = str53;
                                        arrayList4 = arrayList34;
                                        j = j25;
                                        str2 = str58;
                                        arrayList5 = arrayList37;
                                        i7 = 0;
                                        str3 = str47;
                                        z7 = z4;
                                        ArrayList arrayList68 = arrayList36;
                                        if (AbstractC1664a.v(xmlPullParser, "EventStream")) {
                                            String str104 = str102;
                                            String attributeValue17 = xmlPullParser.getAttributeValue(null, str104);
                                            if (attributeValue17 == null) {
                                                attributeValue17 = "";
                                            }
                                            String attributeValue18 = xmlPullParser.getAttributeValue(null, str103);
                                            String str105 = attributeValue18 == null ? "" : attributeValue18;
                                            long n8 = n(xmlPullParser, "timescale", 1L);
                                            long j41 = 0;
                                            long n9 = n(xmlPullParser, "presentationTimeOffset", 0L);
                                            ArrayList arrayList69 = new ArrayList();
                                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(512);
                                            while (true) {
                                                xmlPullParser.next();
                                                String str106 = "Event";
                                                if (AbstractC1664a.v(xmlPullParser, "Event")) {
                                                    String str107 = str101;
                                                    long n10 = n(xmlPullParser, str107, j41);
                                                    String str108 = str57;
                                                    long n11 = n(xmlPullParser, str108, -9223372036854775807L);
                                                    long n12 = n(xmlPullParser, "presentationTime", j41);
                                                    long K7 = v2.t.K(n11, 1000L, n8);
                                                    long K8 = v2.t.K(n12 - n9, 1000000L, n8);
                                                    String attributeValue19 = xmlPullParser.getAttributeValue(null, "messageData");
                                                    if (attributeValue19 == null) {
                                                        attributeValue19 = null;
                                                    }
                                                    byteArrayOutputStream2.reset();
                                                    XmlSerializer newSerializer = Xml.newSerializer();
                                                    newSerializer.setOutput(byteArrayOutputStream2, D3.f.f1719c.name());
                                                    xmlPullParser.nextToken();
                                                    while (!AbstractC1664a.t(xmlPullParser, str106)) {
                                                        switch (xmlPullParser.getEventType()) {
                                                            case 0:
                                                                str11 = str106;
                                                                arrayList9 = arrayList69;
                                                                str12 = str108;
                                                                newSerializer.startDocument(null, Boolean.FALSE);
                                                                break;
                                                            case 1:
                                                                str11 = str106;
                                                                arrayList9 = arrayList69;
                                                                str12 = str108;
                                                                newSerializer.endDocument();
                                                                break;
                                                            case 2:
                                                                str11 = str106;
                                                                newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                int i36 = 0;
                                                                while (i36 < xmlPullParser.getAttributeCount()) {
                                                                    newSerializer.attribute(xmlPullParser.getAttributeNamespace(i36), xmlPullParser.getAttributeName(i36), xmlPullParser.getAttributeValue(i36));
                                                                    i36++;
                                                                    arrayList69 = arrayList69;
                                                                    str108 = str108;
                                                                }
                                                                arrayList9 = arrayList69;
                                                                str12 = str108;
                                                                break;
                                                            case 3:
                                                                str11 = str106;
                                                                newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                arrayList9 = arrayList69;
                                                                str12 = str108;
                                                                break;
                                                            case 4:
                                                                newSerializer.text(xmlPullParser.getText());
                                                                str11 = str106;
                                                                arrayList9 = arrayList69;
                                                                str12 = str108;
                                                                break;
                                                            case 5:
                                                                newSerializer.cdsect(xmlPullParser.getText());
                                                                str11 = str106;
                                                                arrayList9 = arrayList69;
                                                                str12 = str108;
                                                                break;
                                                            case 6:
                                                                newSerializer.entityRef(xmlPullParser.getText());
                                                                str11 = str106;
                                                                arrayList9 = arrayList69;
                                                                str12 = str108;
                                                                break;
                                                            case 7:
                                                                newSerializer.ignorableWhitespace(xmlPullParser.getText());
                                                                str11 = str106;
                                                                arrayList9 = arrayList69;
                                                                str12 = str108;
                                                                break;
                                                            case 8:
                                                                newSerializer.processingInstruction(xmlPullParser.getText());
                                                                str11 = str106;
                                                                arrayList9 = arrayList69;
                                                                str12 = str108;
                                                                break;
                                                            case 9:
                                                                newSerializer.comment(xmlPullParser.getText());
                                                                str11 = str106;
                                                                arrayList9 = arrayList69;
                                                                str12 = str108;
                                                                break;
                                                            case 10:
                                                                newSerializer.docdecl(xmlPullParser.getText());
                                                                str11 = str106;
                                                                arrayList9 = arrayList69;
                                                                str12 = str108;
                                                                break;
                                                            default:
                                                                str11 = str106;
                                                                arrayList9 = arrayList69;
                                                                str12 = str108;
                                                                break;
                                                        }
                                                        xmlPullParser.nextToken();
                                                        str106 = str11;
                                                        arrayList69 = arrayList9;
                                                        str108 = str12;
                                                    }
                                                    ArrayList arrayList70 = arrayList69;
                                                    str10 = str108;
                                                    newSerializer.flush();
                                                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                                                    Long valueOf = Long.valueOf(K8);
                                                    if (attributeValue19 != null) {
                                                        byteArray = attributeValue19.getBytes(D3.f.f1719c);
                                                    }
                                                    str9 = str104;
                                                    arrayList6 = arrayList68;
                                                    byteArrayOutputStream = byteArrayOutputStream2;
                                                    str4 = str107;
                                                    j9 = 0;
                                                    arrayList8 = arrayList70;
                                                    arrayList8.add(Pair.create(valueOf, new EventMessage(attributeValue17, str105, K7, n10, byteArray)));
                                                } else {
                                                    byteArrayOutputStream = byteArrayOutputStream2;
                                                    j9 = j41;
                                                    str9 = str104;
                                                    str10 = str57;
                                                    str4 = str101;
                                                    arrayList6 = arrayList68;
                                                    arrayList8 = arrayList69;
                                                    d(xmlPullParser);
                                                }
                                                if (AbstractC1664a.t(xmlPullParser, "EventStream")) {
                                                    long[] jArr = new long[arrayList8.size()];
                                                    EventMessage[] eventMessageArr = new EventMessage[arrayList8.size()];
                                                    for (int i37 = 0; i37 < arrayList8.size(); i37++) {
                                                        Pair pair = (Pair) arrayList8.get(i37);
                                                        jArr[i37] = ((Long) pair.first).longValue();
                                                        eventMessageArr[i37] = (EventMessage) pair.second;
                                                    }
                                                    z8 = true;
                                                    ArrayList arrayList71 = arrayList33;
                                                    arrayList71.add(new g(attributeValue17, str105, jArr, eventMessageArr));
                                                    arrayList7 = arrayList71;
                                                    str5 = str103;
                                                    str6 = str10;
                                                    str7 = str9;
                                                    j3 = -9223372036854775807L;
                                                } else {
                                                    arrayList69 = arrayList8;
                                                    arrayList68 = arrayList6;
                                                    str57 = str10;
                                                    str101 = str4;
                                                    byteArrayOutputStream2 = byteArrayOutputStream;
                                                    j41 = j9;
                                                    str104 = str9;
                                                }
                                            }
                                        } else {
                                            String str109 = str57;
                                            ArrayList arrayList72 = arrayList33;
                                            str4 = str101;
                                            str5 = str103;
                                            z8 = true;
                                            arrayList6 = arrayList68;
                                            if (AbstractC1664a.v(xmlPullParser, "SegmentBase")) {
                                                sVar = s(xmlPullParser, null);
                                                arrayList7 = arrayList72;
                                                str6 = str109;
                                                j30 = j8;
                                                str7 = str102;
                                                str8 = str2;
                                            } else {
                                                if (AbstractC1664a.v(xmlPullParser, "SegmentList")) {
                                                    j3 = -9223372036854775807L;
                                                    f7 = f(xmlPullParser, -9223372036854775807L);
                                                    arrayList7 = arrayList72;
                                                    str6 = str109;
                                                    str7 = str102;
                                                    u4 = t(xmlPullParser, null, j27, k13, j8, f7, k10);
                                                } else {
                                                    arrayList7 = arrayList72;
                                                    str6 = str109;
                                                    str7 = str102;
                                                    j3 = -9223372036854775807L;
                                                    if (AbstractC1664a.v(xmlPullParser, "SegmentTemplate")) {
                                                        f7 = f(xmlPullParser, -9223372036854775807L);
                                                        C0165x c0165x = AbstractC0167z.f2083b;
                                                        u4 = u(xmlPullParser, null, L.f2000e, j27, k13, j8, f7, k10);
                                                    } else if (AbstractC1664a.v(xmlPullParser, "AssetIdentifier")) {
                                                        j(xmlPullParser, "AssetIdentifier");
                                                    } else {
                                                        d(xmlPullParser);
                                                    }
                                                }
                                                sVar = u4;
                                                j29 = f7;
                                            }
                                        }
                                    }
                                    j30 = j8;
                                    str8 = str2;
                                    if (AbstractC1664a.t(xmlPullParser, str8)) {
                                        str55 = str8;
                                        arrayList32 = arrayList6;
                                        str53 = str5;
                                        str47 = str3;
                                        str54 = str7;
                                        str57 = str6;
                                        j25 = j;
                                        arrayList33 = arrayList7;
                                        str56 = str4;
                                        z4 = z7;
                                        arrayList34 = arrayList4;
                                        arrayList31 = arrayList5;
                                        arrayList30 = arrayList;
                                        str46 = str;
                                    } else {
                                        Pair create = Pair.create(new h(attributeValue8, k12, arrayList6, arrayList7), Long.valueOf(k13));
                                        h hVar = (h) create.first;
                                        if (hVar.f13143b != j3) {
                                            long longValue = ((Long) create.second).longValue();
                                            j7 = longValue == j3 ? j3 : hVar.f13143b + longValue;
                                            arrayList3 = arrayList35;
                                            arrayList3.add(hVar);
                                        } else {
                                            if (!equals) {
                                                throw C0045t0.b("Unable to determine start of period " + arrayList35.size(), null);
                                            }
                                            z9 = z8;
                                            j7 = j28;
                                            arrayList3 = arrayList35;
                                        }
                                    }
                                }
                                j3 = -9223372036854775807L;
                                if (AbstractC1664a.t(xmlPullParser, str8)) {
                                }
                            }
                        }
                        j17 = j;
                    }
                }
                z7 = z4;
                i7 = i14;
                j7 = j18;
                j3 = -9223372036854775807L;
            }
            if (AbstractC1664a.t(xmlPullParser, "MPD")) {
                if (k7 == j3) {
                    if (j7 != j3) {
                        k7 = j7;
                    } else if (!equals) {
                        throw C0045t0.b("Unable to determine duration of static manifest.", null);
                    }
                }
                if (arrayList3.isEmpty()) {
                    throw C0045t0.b("No periods found.", null);
                }
                return new c(H7, k7, k8, equals, k9, k10, k11, H8, iVar, c0859k, tVar, uri2, arrayList3);
            }
            arrayList29 = arrayList3;
            i14 = i7;
            i16 = arrayList2;
            z4 = z7;
            arrayList30 = arrayList;
            str45 = null;
            long j42 = j7;
            j16 = j3;
            j18 = j42;
        }
    }

    public static j p(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j3;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j = Long.parseLong(split[0]);
            if (split.length == 2) {
                j3 = (Long.parseLong(split[1]) - j) + 1;
                return new j(attributeValue, j, j3);
            }
        } else {
            j = 0;
        }
        j3 = -1;
        return new j(attributeValue, j, j3);
    }

    public static int q(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    public static int r(ArrayList arrayList) {
        int i7 = 0;
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            if (D.n("http://dashif.org/guidelines/trickmode", ((f) arrayList.get(i8)).f13135a)) {
                i7 = 16384;
            }
        }
        return i7;
    }

    public static r s(XmlPullParser xmlPullParser, r rVar) {
        long j;
        long j3;
        long n2 = n(xmlPullParser, "timescale", rVar != null ? rVar.f13176b : 1L);
        long n7 = n(xmlPullParser, "presentationTimeOffset", rVar != null ? rVar.f13177c : 0L);
        long j7 = rVar != null ? rVar.f13173d : 0L;
        long j8 = rVar != null ? rVar.f13174e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            long parseLong = Long.parseLong(split[0]);
            j = (Long.parseLong(split[1]) - parseLong) + 1;
            j3 = parseLong;
        } else {
            j = j8;
            j3 = j7;
        }
        j jVar = rVar != null ? rVar.f13175a : null;
        do {
            xmlPullParser.next();
            if (AbstractC1664a.v(xmlPullParser, "Initialization")) {
                jVar = p(xmlPullParser, "sourceURL", "range");
            } else {
                d(xmlPullParser);
            }
        } while (!AbstractC1664a.t(xmlPullParser, "SegmentBase"));
        return new r(jVar, n2, n7, j3, j);
    }

    public static o t(XmlPullParser xmlPullParser, o oVar, long j, long j3, long j7, long j8, long j9) {
        long n2 = n(xmlPullParser, "timescale", oVar != null ? oVar.f13176b : 1L);
        long n7 = n(xmlPullParser, "presentationTimeOffset", oVar != null ? oVar.f13177c : 0L);
        long n8 = n(xmlPullParser, "duration", oVar != null ? oVar.f13164e : -9223372036854775807L);
        long n9 = n(xmlPullParser, "startNumber", oVar != null ? oVar.f13163d : 1L);
        long j10 = j8 == -9223372036854775807L ? j7 : j8;
        long j11 = j10 == Long.MAX_VALUE ? -9223372036854775807L : j10;
        List list = null;
        j jVar = null;
        List list2 = null;
        do {
            xmlPullParser.next();
            if (AbstractC1664a.v(xmlPullParser, "Initialization")) {
                jVar = p(xmlPullParser, "sourceURL", "range");
            } else if (AbstractC1664a.v(xmlPullParser, "SegmentTimeline")) {
                list2 = v(xmlPullParser, n2, j3);
            } else if (AbstractC1664a.v(xmlPullParser, "SegmentURL")) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(p(xmlPullParser, "media", "mediaRange"));
            } else {
                d(xmlPullParser);
            }
        } while (!AbstractC1664a.t(xmlPullParser, "SegmentList"));
        if (oVar != null) {
            if (jVar == null) {
                jVar = oVar.f13175a;
            }
            if (list2 == null) {
                list2 = oVar.f13165f;
            }
            if (list == null) {
                list = oVar.j;
            }
        }
        return new o(jVar, n2, n7, n9, n8, list2, j11, list, v2.t.E(j9), v2.t.E(j));
    }

    public static p u(XmlPullParser xmlPullParser, p pVar, List list, long j, long j3, long j7, long j8, long j9) {
        long j10;
        long n2 = n(xmlPullParser, "timescale", pVar != null ? pVar.f13176b : 1L);
        long n7 = n(xmlPullParser, "presentationTimeOffset", pVar != null ? pVar.f13177c : 0L);
        long n8 = n(xmlPullParser, "duration", pVar != null ? pVar.f13164e : -9223372036854775807L);
        long n9 = n(xmlPullParser, "startNumber", pVar != null ? pVar.f13163d : 1L);
        int i7 = 0;
        while (true) {
            if (i7 >= list.size()) {
                j10 = -1;
                break;
            }
            f fVar = (f) list.get(i7);
            if (D.n("http://dashif.org/guidelines/last-segment-number", fVar.f13135a)) {
                j10 = Long.parseLong(fVar.f13136b);
                break;
            }
            i7++;
        }
        long j11 = j10;
        long j12 = j8 == -9223372036854775807L ? j7 : j8;
        long j13 = j12 == Long.MAX_VALUE ? -9223372036854775807L : j12;
        j jVar = null;
        v2.n w7 = w(xmlPullParser, "media", pVar != null ? pVar.f13169k : null);
        v2.n w8 = w(xmlPullParser, "initialization", pVar != null ? pVar.j : null);
        List list2 = null;
        do {
            xmlPullParser.next();
            if (AbstractC1664a.v(xmlPullParser, "Initialization")) {
                jVar = p(xmlPullParser, "sourceURL", "range");
            } else if (AbstractC1664a.v(xmlPullParser, "SegmentTimeline")) {
                list2 = v(xmlPullParser, n2, j3);
            } else {
                d(xmlPullParser);
            }
        } while (!AbstractC1664a.t(xmlPullParser, "SegmentTemplate"));
        if (pVar != null) {
            if (jVar == null) {
                jVar = pVar.f13175a;
            }
            if (list2 == null) {
                list2 = pVar.f13165f;
            }
        }
        return new p(jVar, n2, n7, n9, j11, n8, list2, j13, w8, w7, v2.t.E(j9), v2.t.E(j));
    }

    public static ArrayList v(XmlPullParser xmlPullParser, long j, long j3) {
        ArrayList arrayList = new ArrayList();
        long j7 = 0;
        long j8 = -9223372036854775807L;
        boolean z4 = false;
        int i7 = 0;
        do {
            xmlPullParser.next();
            if (AbstractC1664a.v(xmlPullParser, "S")) {
                long n2 = n(xmlPullParser, "t", -9223372036854775807L);
                if (z4) {
                    j7 = a(arrayList, j7, j8, i7, n2);
                }
                if (n2 == -9223372036854775807L) {
                    n2 = j7;
                }
                long n7 = n(xmlPullParser, "d", -9223372036854775807L);
                i7 = m(xmlPullParser, "r", 0);
                z4 = true;
                j8 = n7;
                j7 = n2;
            } else {
                d(xmlPullParser);
            }
        } while (!AbstractC1664a.t(xmlPullParser, "SegmentTimeline"));
        if (z4) {
            a(arrayList, j7, j8, i7, v2.t.K(j3, j, 1000L));
        }
        return arrayList;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static v2.n w(XmlPullParser xmlPullParser, String str, v2.n nVar) {
        String str2;
        char c3;
        int i7 = -1;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return nVar;
        }
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        strArr[0] = "";
        int i8 = 0;
        int i9 = 0;
        while (i8 < attributeValue.length()) {
            int indexOf = attributeValue.indexOf("$", i8);
            if (indexOf == i7) {
                strArr[i9] = strArr[i9] + attributeValue.substring(i8);
                i8 = attributeValue.length();
            } else if (indexOf != i8) {
                strArr[i9] = strArr[i9] + attributeValue.substring(i8, indexOf);
                i8 = indexOf;
            } else if (attributeValue.startsWith("$$", i8)) {
                strArr[i9] = e1.k.i(new StringBuilder(), strArr[i9], "$");
                i8 += 2;
            } else {
                int i10 = i8 + 1;
                int indexOf2 = attributeValue.indexOf("$", i10);
                String substring = attributeValue.substring(i10, indexOf2);
                if (substring.equals("RepresentationID")) {
                    iArr[i9] = 1;
                } else {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != i7) {
                        str2 = substring.substring(indexOf3);
                        if (!str2.endsWith("d") && !str2.endsWith("x") && !str2.endsWith("X")) {
                            str2 = str2.concat("d");
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        str2 = "%01d";
                    }
                    substring.getClass();
                    switch (substring.hashCode()) {
                        case -1950496919:
                            if (substring.equals("Number")) {
                                c3 = 0;
                                break;
                            }
                            break;
                        case 2606829:
                            if (substring.equals("Time")) {
                                c3 = 1;
                                break;
                            }
                            break;
                        case 38199441:
                            if (substring.equals("Bandwidth")) {
                                c3 = 2;
                                break;
                            }
                            break;
                    }
                    c3 = 65535;
                    switch (c3) {
                        case 0:
                            iArr[i9] = 2;
                            break;
                        case 1:
                            iArr[i9] = 4;
                            break;
                        case 2:
                            iArr[i9] = 3;
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                    }
                    strArr2[i9] = str2;
                }
                i9++;
                strArr[i9] = "";
                i8 = indexOf2 + 1;
            }
            i7 = -1;
        }
        v2.n nVar2 = new v2.n();
        nVar2.f17137b = strArr;
        nVar2.f17138c = iArr;
        nVar2.f17139d = strArr2;
        nVar2.f17136a = i9;
        return nVar2;
    }

    @Override // u2.M
    public final Object c(Uri uri, C1638o c1638o) {
        try {
            XmlPullParser newPullParser = this.f13134a.newPullParser();
            newPullParser.setInput(c1638o, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return o(newPullParser, uri);
            }
            throw C0045t0.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e7) {
            throw C0045t0.b(null, e7);
        }
    }
}
