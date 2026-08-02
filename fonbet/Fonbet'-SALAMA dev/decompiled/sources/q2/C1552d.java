package q2;

import B1.l;
import E3.AbstractC0158p;
import E3.B;
import E3.C;
import E3.S;
import E3.V;
import E3.Z;
import I4.j;
import W5.AbstractC0486a1;
import Y4.D;
import android.text.Layout;
import android.text.TextUtils;
import android.util.Log;
import d1.n;
import e1.k;
import io.sentry.MeasurementUnit;
import io.sentry.SentryLogEvent;
import io.sentry.protocol.Geo;
import io.sentry.rrweb.RRWebVideoEvent;
import j2.AbstractC1308e;
import j2.C1311h;
import j2.InterfaceC1309f;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import v2.AbstractC1664a;
import v2.AbstractC1665b;
import v2.t;
import w1.L;

/* renamed from: q2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1552d extends AbstractC1308e {

    /* renamed from: E, reason: collision with root package name */
    public static final Pattern f15799E = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: F, reason: collision with root package name */
    public static final Pattern f15800F = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: G, reason: collision with root package name */
    public static final Pattern f15801G = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: H, reason: collision with root package name */
    public static final Pattern f15802H = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: I, reason: collision with root package name */
    public static final Pattern f15803I = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: J, reason: collision with root package name */
    public static final Pattern f15804J = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: K, reason: collision with root package name */
    public static final Pattern f15805K = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: L, reason: collision with root package name */
    public static final C1551c f15806L = new C1551c(30.0f, 1, 1);

    /* renamed from: M, reason: collision with root package name */
    public static final n f15807M = new n(15);

    /* renamed from: D, reason: collision with root package name */
    public final XmlPullParserFactory f15808D;

    public C1552d() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f15808D = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e7) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e7);
        }
    }

    public static h h(h hVar) {
        return hVar == null ? new h() : hVar;
    }

    public static boolean i(String str) {
        return str.equals("tt") || str.equals("head") || str.equals(SentryLogEvent.JsonKeys.BODY) || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals(Geo.JsonKeys.REGION) || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static n j(XmlPullParser xmlPullParser, n nVar) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return nVar;
        }
        Matcher matcher = f15805K.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.w("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return nVar;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt != 0 && parseInt2 != 0) {
                return new n(parseInt2);
            }
            throw new C1311h("Invalid cell resolution " + parseInt + " " + parseInt2);
        } catch (NumberFormatException unused) {
            Log.w("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return nVar;
        }
    }

    public static void k(String str, h hVar) {
        Matcher matcher;
        String group;
        int i7 = t.f17153a;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = f15801G;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (split.length != 2) {
                throw new C1311h(k.g(new StringBuilder("Invalid number of entries for fontSize: "), split.length, "."));
            }
            matcher = pattern.matcher(split[1]);
            Log.w("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new C1311h(AbstractC0486a1.h("Invalid expression for fontSize: '", str, "'."));
        }
        group = matcher.group(3);
        group.getClass();
        switch (group) {
            case "%":
                hVar.j = 3;
                break;
            case "em":
                hVar.j = 2;
                break;
            case "px":
                hVar.j = 1;
                break;
            default:
                throw new C1311h(AbstractC0486a1.h("Invalid unit for fontSize: '", group, "'."));
        }
        String group2 = matcher.group(1);
        group2.getClass();
        hVar.f15839k = Float.parseFloat(group2);
    }

    public static C1551c l(XmlPullParser xmlPullParser) {
        float f7;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", RRWebVideoEvent.JsonKeys.FRAME_RATE);
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i7 = t.f17153a;
            if (attributeValue2.split(" ", -1).length != 2) {
                throw new C1311h("frameRateMultiplier doesn't have 2 parts");
            }
            f7 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f7 = 1.0f;
        }
        C1551c c1551c = f15806L;
        int i8 = c1551c.f15797b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i8 = Integer.parseInt(attributeValue3);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        return new C1551c(parseInt * f7, i8, attributeValue4 != null ? Integer.parseInt(attributeValue4) : c1551c.f15798c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0262 A[LOOP:0: B:2:0x000a->B:22:0x0262, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0261 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m(XmlPullParser xmlPullParser, HashMap hashMap, n nVar, l lVar, HashMap hashMap2, HashMap hashMap3) {
        String p5;
        float parseFloat;
        float f7;
        float f8;
        float parseFloat2;
        n nVar2;
        int i7;
        String p7;
        int i8;
        char c3;
        String[] split;
        int i9 = -1;
        int i10 = 0;
        while (true) {
            xmlPullParser.next();
            if (AbstractC1664a.v(xmlPullParser, "style")) {
                String p8 = AbstractC1664a.p(xmlPullParser, "style");
                h o7 = o(xmlPullParser, new h());
                if (p8 != null) {
                    String trim = p8.trim();
                    if (trim.isEmpty()) {
                        split = new String[i10];
                    } else {
                        int i11 = t.f17153a;
                        split = trim.split("\\s+", i9);
                    }
                    int length = split.length;
                    for (int i12 = i10; i12 < length; i12++) {
                        o7.a((h) hashMap.get(split[i12]));
                    }
                }
                String str = o7.f15840l;
                if (str != null) {
                    hashMap.put(str, o7);
                }
            } else {
                if (AbstractC1664a.v(xmlPullParser, Geo.JsonKeys.REGION)) {
                    String p9 = AbstractC1664a.p(xmlPullParser, "id");
                    f fVar = null;
                    if (p9 != null) {
                        String p10 = AbstractC1664a.p(xmlPullParser, "origin");
                        if (p10 != null) {
                            Pattern pattern = f15803I;
                            Matcher matcher = pattern.matcher(p10);
                            Pattern pattern2 = f15804J;
                            Matcher matcher2 = pattern2.matcher(p10);
                            if (matcher.matches()) {
                                try {
                                    String group = matcher.group(1);
                                    group.getClass();
                                    float parseFloat3 = Float.parseFloat(group) / 100.0f;
                                    String group2 = matcher.group(2);
                                    group2.getClass();
                                    parseFloat = Float.parseFloat(group2) / 100.0f;
                                    f7 = parseFloat3;
                                } catch (NumberFormatException unused) {
                                    Log.w("TtmlDecoder", "Ignoring region with malformed origin: ".concat(p10));
                                }
                            } else if (!matcher2.matches()) {
                                Log.w("TtmlDecoder", "Ignoring region with unsupported origin: ".concat(p10));
                            } else if (lVar == null) {
                                Log.w("TtmlDecoder", "Ignoring region with missing tts:extent: ".concat(p10));
                            } else {
                                try {
                                    String group3 = matcher2.group(1);
                                    group3.getClass();
                                    int parseInt = Integer.parseInt(group3);
                                    String group4 = matcher2.group(2);
                                    group4.getClass();
                                    f7 = parseInt / lVar.f1011b;
                                    parseFloat = Integer.parseInt(group4) / lVar.f1012c;
                                } catch (NumberFormatException unused2) {
                                    Log.w("TtmlDecoder", "Ignoring region with malformed origin: ".concat(p10));
                                }
                            }
                            String p11 = AbstractC1664a.p(xmlPullParser, "extent");
                            if (p11 != null) {
                                Matcher matcher3 = pattern.matcher(p11);
                                Matcher matcher4 = pattern2.matcher(p11);
                                if (matcher3.matches()) {
                                    try {
                                        String group5 = matcher3.group(1);
                                        group5.getClass();
                                        float parseFloat4 = Float.parseFloat(group5) / 100.0f;
                                        String group6 = matcher3.group(2);
                                        group6.getClass();
                                        f8 = parseFloat4;
                                        parseFloat2 = Float.parseFloat(group6) / 100.0f;
                                    } catch (NumberFormatException unused3) {
                                        Log.w("TtmlDecoder", "Ignoring region with malformed extent: ".concat(p10));
                                    }
                                } else if (!matcher4.matches()) {
                                    Log.w("TtmlDecoder", "Ignoring region with unsupported extent: ".concat(p10));
                                } else if (lVar == null) {
                                    Log.w("TtmlDecoder", "Ignoring region with missing tts:extent: ".concat(p10));
                                } else {
                                    try {
                                        String group7 = matcher4.group(1);
                                        group7.getClass();
                                        int parseInt2 = Integer.parseInt(group7);
                                        String group8 = matcher4.group(2);
                                        group8.getClass();
                                        f8 = parseInt2 / lVar.f1011b;
                                        parseFloat2 = Integer.parseInt(group8) / lVar.f1012c;
                                    } catch (NumberFormatException unused4) {
                                        Log.w("TtmlDecoder", "Ignoring region with malformed extent: ".concat(p10));
                                    }
                                }
                                String p12 = AbstractC1664a.p(xmlPullParser, "displayAlign");
                                if (p12 != null) {
                                    String a02 = D.a0(p12);
                                    a02.getClass();
                                    if (a02.equals("center")) {
                                        parseFloat = (parseFloat2 / 2.0f) + parseFloat;
                                        i7 = 1;
                                        nVar2 = nVar;
                                    } else if (a02.equals("after")) {
                                        parseFloat += parseFloat2;
                                        nVar2 = nVar;
                                        i7 = 2;
                                    }
                                    float f9 = 1.0f / nVar2.f12365a;
                                    p7 = AbstractC1664a.p(xmlPullParser, "writingMode");
                                    if (p7 != null) {
                                        String a03 = D.a0(p7);
                                        a03.getClass();
                                        switch (a03.hashCode()) {
                                            case 3694:
                                                if (a03.equals("tb")) {
                                                    c3 = 0;
                                                    break;
                                                }
                                                c3 = 65535;
                                                break;
                                            case 3553396:
                                                if (a03.equals("tblr")) {
                                                    c3 = 1;
                                                    break;
                                                }
                                                c3 = 65535;
                                                break;
                                            case 3553576:
                                                if (a03.equals("tbrl")) {
                                                    c3 = 2;
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
                                            case 1:
                                                i8 = 2;
                                                break;
                                            case 2:
                                                i8 = 1;
                                                break;
                                        }
                                        fVar = new f(p9, f7, parseFloat, 0, i7, f8, parseFloat2, 1, f9, i8);
                                    }
                                    i8 = Integer.MIN_VALUE;
                                    fVar = new f(p9, f7, parseFloat, 0, i7, f8, parseFloat2, 1, f9, i8);
                                }
                                nVar2 = nVar;
                                i7 = 0;
                                float f92 = 1.0f / nVar2.f12365a;
                                p7 = AbstractC1664a.p(xmlPullParser, "writingMode");
                                if (p7 != null) {
                                }
                                i8 = Integer.MIN_VALUE;
                                fVar = new f(p9, f7, parseFloat, 0, i7, f8, parseFloat2, 1, f92, i8);
                            } else {
                                Log.w("TtmlDecoder", "Ignoring region without an extent");
                            }
                        } else {
                            Log.w("TtmlDecoder", "Ignoring region without an origin");
                        }
                        if (fVar != null) {
                            hashMap2.put(fVar.f15821a, fVar);
                        }
                    }
                    if (fVar != null) {
                    }
                } else if (AbstractC1664a.v(xmlPullParser, "metadata")) {
                    do {
                        xmlPullParser.next();
                        if (AbstractC1664a.v(xmlPullParser, "image") && (p5 = AbstractC1664a.p(xmlPullParser, "id")) != null) {
                            hashMap3.put(p5, xmlPullParser.nextText());
                        }
                    } while (!AbstractC1664a.t(xmlPullParser, "metadata"));
                    if (AbstractC1664a.t(xmlPullParser, "head")) {
                        return;
                    }
                    i9 = -1;
                    i10 = 0;
                }
                if (AbstractC1664a.t(xmlPullParser, "head")) {
                }
            }
            if (AbstractC1664a.t(xmlPullParser, "head")) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static C1553e n(XmlPullParser xmlPullParser, C1553e c1553e, HashMap hashMap, C1551c c1551c) {
        long j;
        long j3;
        char c3;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        h o7 = o(xmlPullParser, null);
        String[] strArr = null;
        String str = null;
        String str2 = "";
        long j7 = -9223372036854775807L;
        long j8 = -9223372036854775807L;
        long j9 = -9223372036854775807L;
        for (int i7 = 0; i7 < attributeCount; i7++) {
            String attributeName = xmlPullParser.getAttributeName(i7);
            String attributeValue = xmlPullParser.getAttributeValue(i7);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals(Geo.JsonKeys.REGION)) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c3 = 4;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c3 = 5;
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
                    if (!hashMap.containsKey(attributeValue)) {
                        break;
                    } else {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j9 = p(attributeValue, c1551c);
                    break;
                case 2:
                    j8 = p(attributeValue, c1551c);
                    break;
                case 3:
                    j7 = p(attributeValue, c1551c);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        int i8 = t.f17153a;
                        split = trim.split("\\s+", -1);
                    }
                    if (split.length > 0) {
                        strArr = split;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (c1553e != null) {
            long j10 = c1553e.f15812d;
            j = -9223372036854775807L;
            if (j10 != -9223372036854775807L) {
                if (j7 != -9223372036854775807L) {
                    j7 += j10;
                }
                if (j8 != -9223372036854775807L) {
                    j8 += j10;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (j8 == j) {
            if (j9 != j) {
                j3 = j7 + j9;
            } else if (c1553e != null) {
                long j11 = c1553e.f15813e;
                if (j11 != j) {
                    j3 = j11;
                }
            }
            return new C1553e(xmlPullParser.getName(), null, j7, j3, o7, strArr, str2, str, c1553e);
        }
        j3 = j8;
        return new C1553e(xmlPullParser.getName(), null, j7, j3, o7, strArr, str2, str, c1553e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x00eb. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024b  */
    /* JADX WARN: Type inference failed for: r11v84, types: [q2.b] */
    /* JADX WARN: Type inference failed for: r12v46, types: [q2.b] */
    /* JADX WARN: Type inference failed for: r12v55, types: [q2.b] */
    /* JADX WARN: Type inference failed for: r1v50, types: [q2.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static h o(XmlPullParser xmlPullParser, h hVar) {
        char c3;
        String str;
        char c4;
        int i7;
        char c7;
        char c8;
        char c9;
        V h6;
        int i8;
        int hashCode;
        char c10;
        Layout.Alignment alignment;
        int i9;
        char c11;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String str2 = "after";
        int attributeCount = xmlPullParser.getAttributeCount();
        h hVar2 = hVar;
        int i10 = 0;
        while (i10 < attributeCount) {
            String attributeValue = xmlPullParser2.getAttributeValue(i10);
            String attributeName = xmlPullParser2.getAttributeName(i10);
            attributeName.getClass();
            Layout.Alignment alignment2 = null;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        c3 = 4;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c3 = 5;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c3 = 6;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        c3 = 7;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        c3 = '\b';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c3 = '\t';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        c3 = '\n';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        c3 = 11;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c3 = '\f';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        c3 = '\r';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        c3 = 14;
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
                    str = str2;
                    hVar2 = h(hVar2);
                    hVar2.f15838i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    i7 = 1;
                    break;
                case 1:
                    str = str2;
                    hVar2 = h(hVar2);
                    hVar2.f15830a = attributeValue;
                    i7 = 1;
                    break;
                case 2:
                    str = str2;
                    hVar2 = h(hVar2);
                    String a02 = D.a0(attributeValue);
                    a02.getClass();
                    switch (a02.hashCode()) {
                        case -1364013995:
                            if (a02.equals("center")) {
                                c4 = 0;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 100571:
                            if (a02.equals("end")) {
                                c4 = 1;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 3317767:
                            if (a02.equals(RRWebVideoEvent.JsonKeys.LEFT)) {
                                c4 = 2;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 108511772:
                            if (a02.equals("right")) {
                                c4 = 3;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 109757538:
                            if (a02.equals("start")) {
                                c4 = 4;
                                break;
                            }
                            c4 = 65535;
                            break;
                        default:
                            c4 = 65535;
                            break;
                    }
                    switch (c4) {
                        case 0:
                            alignment2 = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case 1:
                        case 3:
                            alignment2 = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case 2:
                        case 4:
                            alignment2 = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    hVar2.f15843o = alignment2;
                    i7 = 1;
                    break;
                case 3:
                    str = str2;
                    String a03 = D.a0(attributeValue);
                    a03.getClass();
                    switch (a03.hashCode()) {
                        case -1461280213:
                            if (a03.equals("nounderline")) {
                                c7 = 0;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case -1026963764:
                            if (a03.equals("underline")) {
                                c7 = 1;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 913457136:
                            if (a03.equals("nolinethrough")) {
                                c7 = 2;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 1679736913:
                            if (a03.equals("linethrough")) {
                                c7 = 3;
                                break;
                            }
                            c7 = 65535;
                            break;
                        default:
                            c7 = 65535;
                            break;
                    }
                    switch (c7) {
                        case 0:
                            hVar2 = h(hVar2);
                            hVar2.f15836g = 0;
                            break;
                        case 1:
                            hVar2 = h(hVar2);
                            hVar2.f15836g = 1;
                            break;
                        case 2:
                            hVar2 = h(hVar2);
                            hVar2.f15835f = 0;
                            break;
                        case 3:
                            hVar2 = h(hVar2);
                            hVar2.f15835f = 1;
                    }
                    i7 = 1;
                    break;
                case 4:
                    str = str2;
                    hVar2 = h(hVar2);
                    hVar2.f15837h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    i7 = 1;
                    break;
                case 5:
                    str = str2;
                    if ("style".equals(xmlPullParser.getName())) {
                        hVar2 = h(hVar2);
                        hVar2.f15840l = attributeValue;
                    }
                    i7 = 1;
                    break;
                case 6:
                    str = str2;
                    String a04 = D.a0(attributeValue);
                    a04.getClass();
                    switch (a04.hashCode()) {
                        case -618561360:
                            if (a04.equals("baseContainer")) {
                                c8 = 0;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case -410956671:
                            if (a04.equals(RRWebVideoEvent.JsonKeys.CONTAINER)) {
                                c8 = 1;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case -250518009:
                            if (a04.equals("delimiter")) {
                                c8 = 2;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case -136074796:
                            if (a04.equals("textContainer")) {
                                c8 = 3;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 3016401:
                            if (a04.equals("base")) {
                                c8 = 4;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 3556653:
                            if (a04.equals("text")) {
                                c8 = 5;
                                break;
                            }
                            c8 = 65535;
                            break;
                        default:
                            c8 = 65535;
                            break;
                    }
                    switch (c8) {
                        case 0:
                        case 4:
                            hVar2 = h(hVar2);
                            hVar2.f15841m = 2;
                            break;
                        case 1:
                            hVar2 = h(hVar2);
                            hVar2.f15841m = 1;
                            break;
                        case 2:
                            hVar2 = h(hVar2);
                            hVar2.f15841m = 4;
                            break;
                        case 3:
                        case 5:
                            hVar2 = h(hVar2);
                            hVar2.f15841m = 3;
                            break;
                    }
                    i7 = 1;
                    break;
                case 7:
                    str = str2;
                    hVar2 = h(hVar2);
                    try {
                        hVar2.f15831b = AbstractC1665b.a(attributeValue, false);
                        hVar2.f15832c = true;
                    } catch (IllegalArgumentException unused) {
                        L.l("Failed parsing color value: ", attributeValue, "TtmlDecoder");
                    }
                    i7 = 1;
                    break;
                case '\b':
                    str = str2;
                    h h7 = h(hVar2);
                    Matcher matcher = f15802H.matcher(attributeValue);
                    float f7 = Float.MAX_VALUE;
                    if (matcher.matches()) {
                        try {
                            String group = matcher.group(1);
                            group.getClass();
                            f7 = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group)));
                        } catch (NumberFormatException e7) {
                            AbstractC1664a.G(e7, "TtmlDecoder", "Failed to parse shear: " + attributeValue);
                        }
                    } else {
                        L.l("Invalid value for shear: ", attributeValue, "TtmlDecoder");
                    }
                    h7.f15847s = f7;
                    hVar2 = h7;
                    i7 = 1;
                    break;
                case '\t':
                    str = str2;
                    String a05 = D.a0(attributeValue);
                    a05.getClass();
                    if (a05.equals("all")) {
                        hVar2 = h(hVar2);
                        hVar2.f15845q = 1;
                    } else if (a05.equals(MeasurementUnit.NONE)) {
                        hVar2 = h(hVar2);
                        hVar2.f15845q = 0;
                    }
                    i7 = 1;
                    break;
                case '\n':
                    str = str2;
                    try {
                        hVar2 = h(hVar2);
                        k(attributeValue, hVar2);
                    } catch (C1311h unused2) {
                        L.l("Failed parsing fontSize value: ", attributeValue, "TtmlDecoder");
                    }
                    i7 = 1;
                    break;
                case 11:
                    hVar2 = h(hVar2);
                    Pattern pattern = C1550b.f15790b;
                    if (attributeValue != null) {
                        String a06 = D.a0(attributeValue.trim());
                        if (!a06.isEmpty()) {
                            String[] split = TextUtils.split(a06, C1550b.f15790b);
                            int length = split.length;
                            B C3 = length != 0 ? length != 1 ? B.C(split.length, (Object[]) split.clone()) : new Z(split[0]) : S.f2020z;
                            String str3 = (String) AbstractC0158p.e(AbstractC0158p.h(C1550b.f15794f, C3), "outside");
                            int hashCode2 = str3.hashCode();
                            if (hashCode2 == -1392885889) {
                                if (str3.equals("before")) {
                                    c9 = 2;
                                    if (c9 == 0) {
                                    }
                                    h6 = AbstractC0158p.h(C1550b.f15791c, C3);
                                    if (h6.isEmpty()) {
                                    }
                                    alignment2 = alignment;
                                }
                                c9 = 65535;
                                if (c9 == 0) {
                                }
                                h6 = AbstractC0158p.h(C1550b.f15791c, C3);
                                if (h6.isEmpty()) {
                                }
                                alignment2 = alignment;
                            } else if (hashCode2 != -1106037339) {
                                if (hashCode2 == 92734940 && str3.equals(str2)) {
                                    c9 = 0;
                                    int i11 = c9 == 0 ? c9 != 1 ? 1 : -2 : 2;
                                    h6 = AbstractC0158p.h(C1550b.f15791c, C3);
                                    if (h6.isEmpty()) {
                                        String str4 = (String) new C(h6).next();
                                        int hashCode3 = str4.hashCode();
                                        if (hashCode3 == 3005871) {
                                            str4.equals("auto");
                                        } else if (hashCode3 == 3387192 && str4.equals(MeasurementUnit.NONE)) {
                                            i9 = 0;
                                            str = str2;
                                            alignment = new C1550b(i9, 0, i11);
                                        }
                                        i9 = -1;
                                        str = str2;
                                        alignment = new C1550b(i9, 0, i11);
                                    } else {
                                        V h8 = AbstractC0158p.h(C1550b.f15793e, C3);
                                        V h9 = AbstractC0158p.h(C1550b.f15792d, C3);
                                        if (h8.isEmpty() && h9.isEmpty()) {
                                            str = str2;
                                            alignment2 = new C1550b(-1, 0, i11);
                                        } else {
                                            String str5 = (String) AbstractC0158p.e(h8, "filled");
                                            int hashCode4 = str5.hashCode();
                                            str = str2;
                                            if (hashCode4 == -1274499742) {
                                                str5.equals("filled");
                                            } else if (hashCode4 == 3417674 && str5.equals("open")) {
                                                i8 = 2;
                                                String str6 = (String) AbstractC0158p.e(h9, "circle");
                                                hashCode = str6.hashCode();
                                                if (hashCode != -1360216880) {
                                                    if (str6.equals("circle")) {
                                                        c10 = 2;
                                                        alignment = new C1550b(c10 == 0 ? c10 != 1 ? 1 : 3 : 2, i8, i11);
                                                    }
                                                    c10 = 65535;
                                                    alignment = new C1550b(c10 == 0 ? c10 != 1 ? 1 : 3 : 2, i8, i11);
                                                } else if (hashCode != -905816648) {
                                                    if (hashCode == 99657 && str6.equals("dot")) {
                                                        c10 = 0;
                                                        alignment = new C1550b(c10 == 0 ? c10 != 1 ? 1 : 3 : 2, i8, i11);
                                                    }
                                                    c10 = 65535;
                                                    alignment = new C1550b(c10 == 0 ? c10 != 1 ? 1 : 3 : 2, i8, i11);
                                                } else {
                                                    if (str6.equals("sesame")) {
                                                        c10 = 1;
                                                        alignment = new C1550b(c10 == 0 ? c10 != 1 ? 1 : 3 : 2, i8, i11);
                                                    }
                                                    c10 = 65535;
                                                    alignment = new C1550b(c10 == 0 ? c10 != 1 ? 1 : 3 : 2, i8, i11);
                                                }
                                            }
                                            i8 = 1;
                                            String str62 = (String) AbstractC0158p.e(h9, "circle");
                                            hashCode = str62.hashCode();
                                            if (hashCode != -1360216880) {
                                            }
                                        }
                                    }
                                    alignment2 = alignment;
                                }
                                c9 = 65535;
                                if (c9 == 0) {
                                }
                                h6 = AbstractC0158p.h(C1550b.f15791c, C3);
                                if (h6.isEmpty()) {
                                }
                                alignment2 = alignment;
                            } else {
                                if (str3.equals("outside")) {
                                    c9 = 1;
                                    if (c9 == 0) {
                                    }
                                    h6 = AbstractC0158p.h(C1550b.f15791c, C3);
                                    if (h6.isEmpty()) {
                                    }
                                    alignment2 = alignment;
                                }
                                c9 = 65535;
                                if (c9 == 0) {
                                }
                                h6 = AbstractC0158p.h(C1550b.f15791c, C3);
                                if (h6.isEmpty()) {
                                }
                                alignment2 = alignment;
                            }
                            hVar2.f15846r = alignment2;
                            i7 = 1;
                            break;
                        }
                    }
                    str = str2;
                    hVar2.f15846r = alignment2;
                    i7 = 1;
                    break;
                case '\f':
                    String a07 = D.a0(attributeValue);
                    a07.getClass();
                    if (a07.equals("before")) {
                        hVar2 = h(hVar2);
                        hVar2.f15842n = 1;
                    } else if (a07.equals(str2)) {
                        hVar2 = h(hVar2);
                        hVar2.f15842n = 2;
                    }
                    str = str2;
                    i7 = 1;
                    break;
                case '\r':
                    hVar2 = h(hVar2);
                    try {
                        hVar2.f15833d = AbstractC1665b.a(attributeValue, false);
                        hVar2.f15834e = true;
                    } catch (IllegalArgumentException unused3) {
                        L.l("Failed parsing background value: ", attributeValue, "TtmlDecoder");
                    }
                    str = str2;
                    i7 = 1;
                    break;
                case 14:
                    hVar2 = h(hVar2);
                    String a08 = D.a0(attributeValue);
                    a08.getClass();
                    switch (a08.hashCode()) {
                        case -1364013995:
                            if (a08.equals("center")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 100571:
                            if (a08.equals("end")) {
                                c11 = 1;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 3317767:
                            if (a08.equals(RRWebVideoEvent.JsonKeys.LEFT)) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 108511772:
                            if (a08.equals("right")) {
                                c11 = 3;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 109757538:
                            if (a08.equals("start")) {
                                c11 = 4;
                                break;
                            }
                            c11 = 65535;
                            break;
                        default:
                            c11 = 65535;
                            break;
                    }
                    switch (c11) {
                        case 0:
                            alignment2 = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case 1:
                        case 3:
                            alignment2 = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case 2:
                        case 4:
                            alignment2 = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    hVar2.f15844p = alignment2;
                    str = str2;
                    i7 = 1;
                    break;
                default:
                    str = str2;
                    i7 = 1;
                    break;
            }
            i10 += i7;
            xmlPullParser2 = xmlPullParser;
            str2 = str;
        }
        return hVar2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a9, code lost:
    
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long p(String str, C1551c c1551c) {
        double d7;
        double d8;
        char c3 = 4;
        Matcher matcher = f15799E.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            double parseLong = Long.parseLong(group) * 3600;
            matcher.group(2).getClass();
            double parseLong2 = parseLong + (Long.parseLong(r13) * 60);
            matcher.group(3).getClass();
            double parseLong3 = parseLong2 + Long.parseLong(r13);
            String group2 = matcher.group(4);
            return (long) ((parseLong3 + (group2 != null ? Double.parseDouble(group2) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / c1551c.f15796a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / c1551c.f15797b) / c1551c.f15796a : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f15800F.matcher(str);
        if (!matcher2.matches()) {
            throw new C1311h(L.i("Malformed time expression: ", str));
        }
        String group3 = matcher2.group(1);
        group3.getClass();
        double parseDouble = Double.parseDouble(group3);
        String group4 = matcher2.group(2);
        group4.getClass();
        switch (group4.hashCode()) {
            case 102:
                if (group4.equals("f")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case 104:
                if (group4.equals("h")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case 109:
                if (group4.equals("m")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case 116:
                if (group4.equals("t")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case 3494:
                break;
            default:
                c3 = 65535;
                break;
        }
        switch (c3) {
            case 0:
                d7 = c1551c.f15796a;
                parseDouble /= d7;
                break;
            case 1:
                d8 = 3600.0d;
                break;
            case 2:
                d8 = 60.0d;
                break;
            case 3:
                d7 = c1551c.f15798c;
                parseDouble /= d7;
                break;
            case 4:
                d7 = 1000.0d;
                parseDouble /= d7;
                break;
        }
        parseDouble *= d8;
        return (long) (parseDouble * 1000000.0d);
    }

    public static l q(XmlPullParser xmlPullParser) {
        String p5 = AbstractC1664a.p(xmlPullParser, "extent");
        if (p5 == null) {
            return null;
        }
        Matcher matcher = f15804J.matcher(p5);
        if (!matcher.matches()) {
            Log.w("TtmlDecoder", "Ignoring non-pixel tts extent: ".concat(p5));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new l(parseInt, Integer.parseInt(group2), 2);
        } catch (NumberFormatException unused) {
            Log.w("TtmlDecoder", "Ignoring malformed tts extent: ".concat(p5));
            return null;
        }
    }

    @Override // j2.AbstractC1308e
    public final InterfaceC1309f e(byte[] bArr, int i7, boolean z4) {
        n nVar;
        C1551c c1551c;
        try {
            XmlPullParser newPullParser = this.f15808D.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new f("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            l lVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i7), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            C1551c c1551c2 = f15806L;
            n nVar2 = f15807M;
            int i8 = 0;
            j jVar = null;
            n nVar3 = nVar2;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                C1553e c1553e = (C1553e) arrayDeque.peek();
                if (i8 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            c1551c2 = l(newPullParser);
                            nVar3 = j(newPullParser, nVar2);
                            lVar = q(newPullParser);
                        }
                        n nVar4 = nVar3;
                        l lVar2 = lVar;
                        C1551c c1551c3 = c1551c2;
                        if (i(name)) {
                            if ("head".equals(name)) {
                                nVar = nVar4;
                                c1551c = c1551c3;
                                m(newPullParser, hashMap, nVar4, lVar2, hashMap2, hashMap3);
                            } else {
                                nVar = nVar4;
                                c1551c = c1551c3;
                                try {
                                    C1553e n2 = n(newPullParser, c1553e, hashMap2, c1551c);
                                    arrayDeque.push(n2);
                                    if (c1553e != null) {
                                        if (c1553e.f15820m == null) {
                                            c1553e.f15820m = new ArrayList();
                                        }
                                        c1553e.f15820m.add(n2);
                                    }
                                } catch (C1311h e7) {
                                    AbstractC1664a.G(e7, "TtmlDecoder", "Suppressing parser error");
                                    i8++;
                                }
                            }
                            nVar3 = nVar;
                            c1551c2 = c1551c;
                        } else {
                            Log.i("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                            i8++;
                            nVar3 = nVar4;
                            c1551c2 = c1551c3;
                        }
                        lVar = lVar2;
                    } else if (eventType == 4) {
                        c1553e.getClass();
                        C1553e a2 = C1553e.a(newPullParser.getText());
                        if (c1553e.f15820m == null) {
                            c1553e.f15820m = new ArrayList();
                        }
                        c1553e.f15820m.add(a2);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            C1553e c1553e2 = (C1553e) arrayDeque.peek();
                            c1553e2.getClass();
                            jVar = new j(c1553e2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i8++;
                } else if (eventType == 3) {
                    i8--;
                }
                newPullParser.next();
            }
            if (jVar != null) {
                return jVar;
            }
            throw new C1311h("No TTML subtitles found");
        } catch (IOException e8) {
            throw new IllegalStateException("Unexpected error when reading input.", e8);
        } catch (XmlPullParserException e9) {
            throw new C1311h("Unable to decode source", e9);
        }
    }
}
