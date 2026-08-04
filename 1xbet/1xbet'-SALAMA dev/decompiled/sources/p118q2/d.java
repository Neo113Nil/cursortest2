package p118q2;

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
import io.sentry.MeasurementUnit;
import io.sentry.SentryLogEvent;
import io.sentry.protocol.Geo;
import io.sentry.rrweb.RRWebVideoEvent;
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
import p023d1.n;
import p031e1.k;
import p068j2.e;
import p068j2.f;
import p068j2.h;
import p151v2.a;
import p151v2.b;
import p151v2.t;
import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final Pattern f15805E = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final Pattern f15806F = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final Pattern f15807G = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final Pattern f15808H = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final Pattern f15809I = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final Pattern f15810J = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final Pattern f15811K = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final c f15812L = new c(30.0f, 1, 1);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final n f15813M = new n(15);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final XmlPullParserFactory f15814D;

    public d() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f15814D = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
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

    public static n j(XmlPullParser xmlPullParser, n nVar) throws h {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return nVar;
        }
        Matcher matcher = f15811K.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.w("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return nVar;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i7 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i8 = Integer.parseInt(strGroup2);
            if (i7 != 0 && i8 != 0) {
                return new n(i8);
            }
            throw new h("Invalid cell resolution " + i7 + " " + i8);
        } catch (NumberFormatException unused) {
            Log.w("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return nVar;
        }
    }

    public static void k(String str, h hVar) throws h {
        Matcher matcher;
        int i7 = t.f17159a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = f15807G;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new h(k.g(new StringBuilder("Invalid number of entries for fontSize: "), strArrSplit.length, "."));
            }
            matcher = pattern.matcher(strArrSplit[1]);
            Log.w("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new h(AbstractC0486a1.h("Invalid expression for fontSize: '", str, "'."));
        }
        String strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
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
                throw new h(AbstractC0486a1.h("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        hVar.f15845k = Float.parseFloat(strGroup2);
    }

    public static c l(XmlPullParser xmlPullParser) throws h {
        float f7;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", RRWebVideoEvent.JsonKeys.FRAME_RATE);
        int i7 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i8 = t.f17159a;
            String[] strArrSplit = attributeValue2.split(" ", -1);
            if (strArrSplit.length != 2) {
                throw new h("frameRateMultiplier doesn't have 2 parts");
            }
            f7 = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
        } else {
            f7 = 1.0f;
        }
        c cVar = f15812L;
        int i9 = cVar.f15803b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i9 = Integer.parseInt(attributeValue3);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        return new c(i7 * f7, i9, attributeValue4 != null ? Integer.parseInt(attributeValue4) : cVar.f15804c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:105:0x0262 A[LOOP:0: B:3:0x000a->B:105:0x0262, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:108:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x00fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0261 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:45:0x0124  */
    /* JADX WARN: Code duplicated, block: B:47:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x012c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0160  */
    /* JADX WARN: Code duplicated, block: B:55:0x016f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0178  */
    /* JADX WARN: Code duplicated, block: B:59:0x017e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0188  */
    /* JADX WARN: Code duplicated, block: B:63:0x019a  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:66:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:73:0x01be  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:86:0x01fa  */
    public static void m(XmlPullParser xmlPullParser, HashMap map, n nVar, l lVar, HashMap map2, HashMap map3) throws XmlPullParserException, IOException {
        String strP;
        float f7;
        float f8;
        String strP2;
        Matcher matcher;
        Matcher matcher2;
        float f9;
        float f10;
        String strP3;
        int i7;
        String strP4;
        int i8;
        String strA0;
        String strA1;
        String[] strArrSplit;
        int i9 = -1;
        int i10 = 0;
        while (true) {
            xmlPullParser.next();
            if (a.v(xmlPullParser, "style")) {
                String strP5 = a.p(xmlPullParser, "style");
                h hVarO = o(xmlPullParser, new h());
                if (strP5 != null) {
                    String strTrim = strP5.trim();
                    if (strTrim.isEmpty()) {
                        strArrSplit = new String[i10];
                    } else {
                        int i11 = t.f17159a;
                        strArrSplit = strTrim.split("\\s+", i9);
                    }
                    int length = strArrSplit.length;
                    for (int i12 = i10; i12 < length; i12++) {
                        hVarO.a((h) map.get(strArrSplit[i12]));
                    }
                }
                String str = hVarO.f15846l;
                if (str != null) {
                    map.put(str, hVarO);
                }
            } else {
                if (a.v(xmlPullParser, Geo.JsonKeys.REGION)) {
                    String strP6 = a.p(xmlPullParser, "id");
                    f fVar = null;
                    if (strP6 != null) {
                        String strP7 = a.p(xmlPullParser, "origin");
                        if (strP7 != null) {
                            Pattern pattern = f15809I;
                            Matcher matcher3 = pattern.matcher(strP7);
                            Pattern pattern2 = f15810J;
                            Matcher matcher4 = pattern2.matcher(strP7);
                            if (matcher3.matches()) {
                                try {
                                    String strGroup = matcher3.group(1);
                                    strGroup.getClass();
                                    float f11 = Float.parseFloat(strGroup) / 100.0f;
                                    String strGroup2 = matcher3.group(2);
                                    strGroup2.getClass();
                                    f7 = Float.parseFloat(strGroup2) / 100.0f;
                                    f8 = f11;
                                    strP2 = a.p(xmlPullParser, "extent");
                                    if (strP2 != null) {
                                        matcher = pattern.matcher(strP2);
                                        matcher2 = pattern2.matcher(strP2);
                                        if (matcher.matches()) {
                                            try {
                                                String strGroup3 = matcher.group(1);
                                                strGroup3.getClass();
                                                float f12 = Float.parseFloat(strGroup3) / 100.0f;
                                                String strGroup4 = matcher.group(2);
                                                strGroup4.getClass();
                                                f9 = f12;
                                                f10 = Float.parseFloat(strGroup4) / 100.0f;
                                                strP3 = a.p(xmlPullParser, "displayAlign");
                                                if (strP3 != null) {
                                                    strA1 = D.a0(strP3);
                                                    strA1.getClass();
                                                    if (!strA1.equals("center")) {
                                                        f7 = (f10 / 2.0f) + f7;
                                                        i7 = 1;
                                                    } else if (strA1.equals("after")) {
                                                        f7 += f10;
                                                        i7 = 2;
                                                    } else {
                                                        i7 = 0;
                                                    }
                                                } else {
                                                    i7 = 0;
                                                }
                                                float f13 = 1.0f / nVar.f12371a;
                                                strP4 = a.p(xmlPullParser, "writingMode");
                                                if (strP4 != null) {
                                                    strA0 = D.a0(strP4);
                                                    strA0.getClass();
                                                    switch (strA0) {
                                                        case "tb":
                                                        case "tblr":
                                                            i8 = 2;
                                                            break;
                                                        case "tbrl":
                                                            i8 = 1;
                                                            break;
                                                        default:
                                                            i8 = Integer.MIN_VALUE;
                                                            break;
                                                    }
                                                } else {
                                                    i8 = Integer.MIN_VALUE;
                                                }
                                                fVar = new f(strP6, f8, f7, 0, i7, f9, f10, 1, f13, i8);
                                            } catch (NumberFormatException unused) {
                                                Log.w("TtmlDecoder", "Ignoring region with malformed extent: ".concat(strP7));
                                            }
                                        } else if (matcher2.matches()) {
                                            Log.w("TtmlDecoder", "Ignoring region with unsupported extent: ".concat(strP7));
                                        } else if (lVar == null) {
                                            Log.w("TtmlDecoder", "Ignoring region with missing tts:extent: ".concat(strP7));
                                        } else {
                                            try {
                                                String strGroup5 = matcher2.group(1);
                                                strGroup5.getClass();
                                                int i13 = Integer.parseInt(strGroup5);
                                                String strGroup6 = matcher2.group(2);
                                                strGroup6.getClass();
                                                float f14 = Integer.parseInt(strGroup6);
                                                f9 = i13 / lVar.f1011b;
                                                f10 = f14 / lVar.f1012c;
                                                strP3 = a.p(xmlPullParser, "displayAlign");
                                                if (strP3 != null) {
                                                    strA1 = D.a0(strP3);
                                                    strA1.getClass();
                                                    if (!strA1.equals("center")) {
                                                        f7 = (f10 / 2.0f) + f7;
                                                        i7 = 1;
                                                    } else if (strA1.equals("after")) {
                                                        i7 = 0;
                                                    } else {
                                                        f7 += f10;
                                                        i7 = 2;
                                                    }
                                                } else {
                                                    i7 = 0;
                                                }
                                                float f15 = 1.0f / nVar.f12371a;
                                                strP4 = a.p(xmlPullParser, "writingMode");
                                                if (strP4 != null) {
                                                    strA0 = D.a0(strP4);
                                                    strA0.getClass();
                                                    switch (strA0) {
                                                        case 3694:
                                                            if (!strA0.equals("tb")) {
                                                            }
                                                            break;
                                                        case 3553396:
                                                            if (!strA0.equals("tblr")) {
                                                            }
                                                            break;
                                                        case 3553576:
                                                            if (!strA0.equals("tbrl")) {
                                                            }
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                    /*  JADX ERROR: Method code generation error
                                                        java.lang.NullPointerException: Switch insn not found in header
                                                        	at java.base/java.util.Objects.requireNonNull(Objects.java:259)
                                                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                                                        	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                                                        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                                                        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:175)
                                                        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                                        */
                                                    /*
                                                        Method dump skipped, instruction units count: 638
                                                        To view this dump add '--comments-level debug' option
                                                    */
                                                    throw new UnsupportedOperationException("Method not decompiled: p118q2.d.m(org.xmlpull.v1.XmlPullParser, java.util.HashMap, d1.n, B1.l, java.util.HashMap, java.util.HashMap):void");
                                                }

                                                /* JADX WARN: Code duplicated, block: B:70:0x00fb  */
                                                public static e n(XmlPullParser xmlPullParser, e eVar, HashMap map, c cVar) throws h {
                                                    long j;
                                                    long j3;
                                                    String[] strArrSplit;
                                                    int attributeCount = xmlPullParser.getAttributeCount();
                                                    h hVarO = o(xmlPullParser, null);
                                                    String[] strArr = null;
                                                    String strSubstring = null;
                                                    String str = "";
                                                    long jP = -9223372036854775807L;
                                                    long jP2 = -9223372036854775807L;
                                                    long jP3 = -9223372036854775807L;
                                                    for (int i7 = 0; i7 < attributeCount; i7++) {
                                                        String attributeName = xmlPullParser.getAttributeName(i7);
                                                        String attributeValue = xmlPullParser.getAttributeValue(i7);
                                                        attributeName.getClass();
                                                        switch (attributeName) {
                                                            case "region":
                                                                if (map.containsKey(attributeValue)) {
                                                                    str = attributeValue;
                                                                    continue;
                                                                }
                                                                break;
                                                            case "dur":
                                                                jP3 = p(attributeValue, cVar);
                                                                break;
                                                            case "end":
                                                                jP2 = p(attributeValue, cVar);
                                                                break;
                                                            case "begin":
                                                                jP = p(attributeValue, cVar);
                                                                break;
                                                            case "style":
                                                                String strTrim = attributeValue.trim();
                                                                if (strTrim.isEmpty()) {
                                                                    strArrSplit = new String[0];
                                                                } else {
                                                                    int i8 = t.f17159a;
                                                                    strArrSplit = strTrim.split("\\s+", -1);
                                                                }
                                                                if (strArrSplit.length > 0) {
                                                                    strArr = strArrSplit;
                                                                    break;
                                                                }
                                                                break;
                                                            case "backgroundImage":
                                                                if (attributeValue.startsWith("#")) {
                                                                    strSubstring = attributeValue.substring(1);
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                    if (eVar != null) {
                                                        long j7 = eVar.f15818d;
                                                        j = -9223372036854775807L;
                                                        if (j7 != -9223372036854775807L) {
                                                            if (jP != -9223372036854775807L) {
                                                                jP += j7;
                                                            }
                                                            if (jP2 != -9223372036854775807L) {
                                                                jP2 += j7;
                                                            }
                                                        }
                                                    } else {
                                                        j = -9223372036854775807L;
                                                    }
                                                    if (jP2 != j) {
                                                        j3 = jP2;
                                                    } else if (jP3 != j) {
                                                        j3 = jP + jP3;
                                                    } else if (eVar != null) {
                                                        long j8 = eVar.f15819e;
                                                        if (j8 != j) {
                                                            j3 = j8;
                                                        } else {
                                                            j3 = jP2;
                                                        }
                                                    } else {
                                                        j3 = jP2;
                                                    }
                                                    return new e(xmlPullParser.getName(), null, jP, j3, hVarO, strArr, str, strSubstring, eVar);
                                                }

                                                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                                                /* JADX WARN: Code duplicated, block: B:114:0x018c  */
                                                /* JADX WARN: Code duplicated, block: B:142:0x01ff  */
                                                /* JADX WARN: Code duplicated, block: B:180:0x02aa  */
                                                /* JADX WARN: Code duplicated, block: B:182:0x02af  */
                                                /* JADX WARN: Code duplicated, block: B:188:0x02bf  */
                                                /* JADX WARN: Code duplicated, block: B:190:0x02c7  */
                                                /* JADX WARN: Code duplicated, block: B:191:0x02c9  */
                                                /* JADX WARN: Code duplicated, block: B:193:0x02cf  */
                                                /* JADX WARN: Code duplicated, block: B:194:0x02d1  */
                                                /* JADX WARN: Code duplicated, block: B:196:0x02d4  */
                                                /* JADX WARN: Code duplicated, block: B:198:0x02d7  */
                                                /* JADX WARN: Code duplicated, block: B:199:0x02d9  */
                                                /* JADX WARN: Code duplicated, block: B:200:0x02db  */
                                                /* JADX WARN: Code duplicated, block: B:229:0x039b  */
                                                /* JADX WARN: Code duplicated, block: B:267:0x044b  */
                                                /* JADX WARN: Code duplicated, block: B:293:0x04b9  */
                                                /* JADX WARN: Code duplicated, block: B:6:0x0031  */
                                                /* JADX WARN: Code duplicated, block: B:71:0x0103  */
                                                /* JADX WARN: Failed to find 'out' block for switch in B:67:0x00eb. Please report as an issue. */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                /* JADX WARN: Type inference failed for: r11v117, types: [android.text.Layout$Alignment] */
                                                /* JADX WARN: Type inference failed for: r12v14, types: [android.text.Layout$Alignment] */
                                                /* JADX WARN: Type inference failed for: r16v0 */
                                                /* JADX WARN: Type inference failed for: r16v1, types: [android.text.Layout$Alignment] */
                                                /* JADX WARN: Type inference failed for: r16v10, types: [android.text.Layout$Alignment] */
                                                /* JADX WARN: Type inference failed for: r16v11 */
                                                /* JADX WARN: Type inference failed for: r16v2, types: [android.text.Layout$Alignment] */
                                                /* JADX WARN: Type inference failed for: r16v3, types: [android.text.Layout$Alignment] */
                                                /* JADX WARN: Type inference failed for: r16v4 */
                                                /* JADX WARN: Type inference failed for: r16v5 */
                                                /* JADX WARN: Type inference failed for: r16v6 */
                                                /* JADX WARN: Type inference failed for: r16v7 */
                                                /* JADX WARN: Type inference failed for: r16v8, types: [android.text.Layout$Alignment] */
                                                /* JADX WARN: Type inference failed for: r16v9, types: [android.text.Layout$Alignment] */
                                                /* JADX WARN: Type inference failed for: r1v50, types: [q2.b] */
                                                public static h o(XmlPullParser xmlPullParser, h hVar) {
                                                    int i7;
                                                    byte b7;
                                                    String str;
                                                    int iHashCode;
                                                    byte b8;
                                                    int i8;
                                                    b bVar;
                                                    String str2 = "after";
                                                    int attributeCount = xmlPullParser.getAttributeCount();
                                                    h hVarH = hVar;
                                                    int i9 = 0;
                                                    while (i9 < attributeCount) {
                                                        String attributeValue = xmlPullParser.getAttributeValue(i9);
                                                        String attributeName = xmlPullParser.getAttributeName(i9);
                                                        attributeName.getClass();
                                                        ?? bVar2 = null;
                                                        switch (attributeName) {
                                                            case "fontStyle":
                                                                str2 = str2;
                                                                hVarH = h(hVarH);
                                                                hVarH.f15844i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                                                                i7 = 1;
                                                                break;
                                                            case "fontFamily":
                                                                str2 = str2;
                                                                hVarH = h(hVarH);
                                                                hVarH.f15836a = attributeValue;
                                                                i7 = 1;
                                                                break;
                                                            case "textAlign":
                                                                str2 = str2;
                                                                hVarH = h(hVarH);
                                                                String strA0 = D.a0(attributeValue);
                                                                strA0.getClass();
                                                                switch (strA0) {
                                                                    case "center":
                                                                        bVar2 = Layout.Alignment.ALIGN_CENTER;
                                                                        break;
                                                                    case "end":
                                                                    case "right":
                                                                        bVar2 = Layout.Alignment.ALIGN_OPPOSITE;
                                                                        break;
                                                                    case "left":
                                                                    case "start":
                                                                        bVar2 = Layout.Alignment.ALIGN_NORMAL;
                                                                        break;
                                                                }
                                                                hVarH.f15849o = bVar2;
                                                                i7 = 1;
                                                                break;
                                                            case "textDecoration":
                                                                str2 = str2;
                                                                String strA1 = D.a0(attributeValue);
                                                                strA1.getClass();
                                                                switch (strA1) {
                                                                    case "nounderline":
                                                                        hVarH = h(hVarH);
                                                                        hVarH.f15842g = 0;
                                                                        break;
                                                                    case "underline":
                                                                        hVarH = h(hVarH);
                                                                        hVarH.f15842g = 1;
                                                                        break;
                                                                    case "nolinethrough":
                                                                        hVarH = h(hVarH);
                                                                        hVarH.f15841f = 0;
                                                                        break;
                                                                    case "linethrough":
                                                                        hVarH = h(hVarH);
                                                                        hVarH.f15841f = 1;
                                                                    default:
                                                                        break;
                                                                }
                                                                i7 = 1;
                                                                break;
                                                            case "fontWeight":
                                                                str2 = str2;
                                                                hVarH = h(hVarH);
                                                                hVarH.f15843h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                                                                i7 = 1;
                                                                break;
                                                            case "id":
                                                                str2 = str2;
                                                                if ("style".equals(xmlPullParser.getName())) {
                                                                    hVarH = h(hVarH);
                                                                    hVarH.f15846l = attributeValue;
                                                                }
                                                                i7 = 1;
                                                                break;
                                                            case "ruby":
                                                                str2 = str2;
                                                                String strA2 = D.a0(attributeValue);
                                                                strA2.getClass();
                                                                switch (strA2) {
                                                                    case "baseContainer":
                                                                    case "base":
                                                                        hVarH = h(hVarH);
                                                                        hVarH.f15847m = 2;
                                                                        break;
                                                                    case "container":
                                                                        hVarH = h(hVarH);
                                                                        hVarH.f15847m = 1;
                                                                        break;
                                                                    case "delimiter":
                                                                        hVarH = h(hVarH);
                                                                        hVarH.f15847m = 4;
                                                                        break;
                                                                    case "textContainer":
                                                                    case "text":
                                                                        hVarH = h(hVarH);
                                                                        hVarH.f15847m = 3;
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                                i7 = 1;
                                                                break;
                                                            case "color":
                                                                str2 = str2;
                                                                hVarH = h(hVarH);
                                                                try {
                                                                    hVarH.f15837b = b.a(attributeValue, false);
                                                                    hVarH.f15838c = true;
                                                                    break;
                                                                } catch (IllegalArgumentException unused) {
                                                                    L.l("Failed parsing color value: ", attributeValue, "TtmlDecoder");
                                                                }
                                                                i7 = 1;
                                                                break;
                                                            case "shear":
                                                                str2 = str2;
                                                                h hVarH2 = h(hVarH);
                                                                Matcher matcher = f15808H.matcher(attributeValue);
                                                                float fMin = Float.MAX_VALUE;
                                                                if (matcher.matches()) {
                                                                    try {
                                                                        String strGroup = matcher.group(1);
                                                                        strGroup.getClass();
                                                                        fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup)));
                                                                    } catch (NumberFormatException e7) {
                                                                        a.G(e7, "TtmlDecoder", "Failed to parse shear: " + attributeValue);
                                                                    }
                                                                    break;
                                                                } else {
                                                                    L.l("Invalid value for shear: ", attributeValue, "TtmlDecoder");
                                                                }
                                                                hVarH2.f15853s = fMin;
                                                                hVarH = hVarH2;
                                                                i7 = 1;
                                                                break;
                                                            case "textCombine":
                                                                str2 = str2;
                                                                String strA3 = D.a0(attributeValue);
                                                                strA3.getClass();
                                                                if (strA3.equals("all")) {
                                                                    hVarH = h(hVarH);
                                                                    hVarH.f15851q = 1;
                                                                } else if (strA3.equals(MeasurementUnit.NONE)) {
                                                                    hVarH = h(hVarH);
                                                                    hVarH.f15851q = 0;
                                                                }
                                                                i7 = 1;
                                                                break;
                                                            case "fontSize":
                                                                str2 = str2;
                                                                try {
                                                                    hVarH = h(hVarH);
                                                                    k(attributeValue, hVarH);
                                                                    break;
                                                                } catch (h unused2) {
                                                                    L.l("Failed parsing fontSize value: ", attributeValue, "TtmlDecoder");
                                                                }
                                                                i7 = 1;
                                                                break;
                                                            case "textEmphasis":
                                                                hVarH = h(hVarH);
                                                                Pattern pattern = b.f15796b;
                                                                if (attributeValue == null) {
                                                                    str2 = str2;
                                                                } else {
                                                                    String strA4 = D.a0(attributeValue.trim());
                                                                    if (strA4.isEmpty()) {
                                                                        str2 = str2;
                                                                    } else {
                                                                        String[] strArrSplit = TextUtils.split(strA4, b.f15796b);
                                                                        int length = strArrSplit.length;
                                                                        B bC = length != 0 ? length != 1 ? B.C(strArrSplit.length, (Object[]) strArrSplit.clone()) : new Z(strArrSplit[0]) : S.f2020z;
                                                                        String str3 = (String) AbstractC0158p.e(AbstractC0158p.h(b.f15800f, bC), "outside");
                                                                        int iHashCode2 = str3.hashCode();
                                                                        if (iHashCode2 != -1392885889) {
                                                                            if (iHashCode2 != -1106037339) {
                                                                                if (iHashCode2 == 92734940 && str3.equals(str2)) {
                                                                                    b7 = 0;
                                                                                } else {
                                                                                    b7 = -1;
                                                                                }
                                                                            } else if (str3.equals("outside")) {
                                                                                b7 = 1;
                                                                            } else {
                                                                                b7 = -1;
                                                                            }
                                                                        } else if (str3.equals("before")) {
                                                                            b7 = 2;
                                                                        } else {
                                                                            b7 = -1;
                                                                        }
                                                                        int i10 = b7 != 0 ? b7 != 1 ? 1 : -2 : 2;
                                                                        V vH = AbstractC0158p.h(b.f15797c, bC);
                                                                        if (vH.isEmpty()) {
                                                                            V vH2 = AbstractC0158p.h(b.f15799e, bC);
                                                                            V vH3 = AbstractC0158p.h(b.f15798d, bC);
                                                                            if (vH2.isEmpty() && vH3.isEmpty()) {
                                                                                str2 = str2;
                                                                                bVar2 = new b(-1, 0, i10);
                                                                            } else {
                                                                                String str4 = (String) AbstractC0158p.e(vH2, "filled");
                                                                                int iHashCode3 = str4.hashCode();
                                                                                if (iHashCode3 != -1274499742) {
                                                                                    int i11 = (iHashCode3 == 3417674 && str4.equals("open")) ? 2 : 1;
                                                                                    str = (String) AbstractC0158p.e(vH3, "circle");
                                                                                    iHashCode = str.hashCode();
                                                                                    if (iHashCode != -1360216880) {
                                                                                        if (iHashCode != -905816648) {
                                                                                            if (iHashCode != 99657 && str.equals("dot")) {
                                                                                                b8 = 0;
                                                                                            } else {
                                                                                                b8 = -1;
                                                                                            }
                                                                                        } else if (str.equals("sesame")) {
                                                                                            b8 = 1;
                                                                                        } else {
                                                                                            b8 = -1;
                                                                                        }
                                                                                    } else if (str.equals("circle")) {
                                                                                        b8 = 2;
                                                                                    } else {
                                                                                        b8 = -1;
                                                                                    }
                                                                                    if (b8 != 0) {
                                                                                        i8 = 2;
                                                                                    } else if (b8 != 1) {
                                                                                        i8 = 1;
                                                                                    } else {
                                                                                        i8 = 3;
                                                                                    }
                                                                                    bVar = new b(i8, i11, i10);
                                                                                } else {
                                                                                    str4.equals("filled");
                                                                                }
                                                                                str = (String) AbstractC0158p.e(vH3, "circle");
                                                                                iHashCode = str.hashCode();
                                                                                if (iHashCode != -1360216880) {
                                                                                    if (iHashCode != -905816648) {
                                                                                        if (iHashCode != 99657) {
                                                                                            b8 = -1;
                                                                                        } else {
                                                                                            b8 = 0;
                                                                                        }
                                                                                    } else if (str.equals("sesame")) {
                                                                                        b8 = 1;
                                                                                    } else {
                                                                                        b8 = -1;
                                                                                    }
                                                                                } else if (str.equals("circle")) {
                                                                                    b8 = 2;
                                                                                } else {
                                                                                    b8 = -1;
                                                                                }
                                                                                if (b8 != 0) {
                                                                                    i8 = 2;
                                                                                } else if (b8 != 1) {
                                                                                    i8 = 1;
                                                                                } else {
                                                                                    i8 = 3;
                                                                                }
                                                                                bVar = new b(i8, i11, i10);
                                                                            }
                                                                        } else {
                                                                            String str5 = (String) new C(vH).next();
                                                                            int iHashCode4 = str5.hashCode();
                                                                            if (iHashCode4 != 3005871) {
                                                                                int i12 = (iHashCode4 == 3387192 && str5.equals(MeasurementUnit.NONE)) ? 0 : -1;
                                                                                bVar = new b(i12, 0, i10);
                                                                            } else {
                                                                                str5.equals("auto");
                                                                            }
                                                                            bVar = new b(i12, 0, i10);
                                                                        }
                                                                        bVar2 = bVar;
                                                                    }
                                                                }
                                                                hVarH.f15852r = bVar2;
                                                                i7 = 1;
                                                                break;
                                                            case "rubyPosition":
                                                                String strA5 = D.a0(attributeValue);
                                                                strA5.getClass();
                                                                if (strA5.equals("before")) {
                                                                    hVarH = h(hVarH);
                                                                    hVarH.f15848n = 1;
                                                                } else if (strA5.equals(str2)) {
                                                                    hVarH = h(hVarH);
                                                                    hVarH.f15848n = 2;
                                                                }
                                                                str2 = str2;
                                                                i7 = 1;
                                                                break;
                                                            case "backgroundColor":
                                                                hVarH = h(hVarH);
                                                                try {
                                                                    hVarH.f15839d = b.a(attributeValue, false);
                                                                    hVarH.f15840e = true;
                                                                    break;
                                                                } catch (IllegalArgumentException unused3) {
                                                                    L.l("Failed parsing background value: ", attributeValue, "TtmlDecoder");
                                                                }
                                                                str2 = str2;
                                                                i7 = 1;
                                                                break;
                                                            case "multiRowAlign":
                                                                hVarH = h(hVarH);
                                                                String strA6 = D.a0(attributeValue);
                                                                strA6.getClass();
                                                                switch (strA6) {
                                                                    case "center":
                                                                        bVar2 = Layout.Alignment.ALIGN_CENTER;
                                                                        break;
                                                                    case "end":
                                                                    case "right":
                                                                        bVar2 = Layout.Alignment.ALIGN_OPPOSITE;
                                                                        break;
                                                                    case "left":
                                                                    case "start":
                                                                        bVar2 = Layout.Alignment.ALIGN_NORMAL;
                                                                        break;
                                                                }
                                                                hVarH.f15850p = bVar2;
                                                                str2 = str2;
                                                                i7 = 1;
                                                                break;
                                                            default:
                                                                str2 = str2;
                                                                i7 = 1;
                                                                break;
                                                        }
                                                        i9 += i7;
                                                        str2 = str2;
                                                    }
                                                    return hVarH;
                                                }

                                                public static long p(String str, c cVar) throws h {
                                                    double d7;
                                                    double d8;
                                                    byte b7 = 4;
                                                    Matcher matcher = f15805E.matcher(str);
                                                    if (matcher.matches()) {
                                                        String strGroup = matcher.group(1);
                                                        strGroup.getClass();
                                                        double d9 = Long.parseLong(strGroup) * 3600;
                                                        String strGroup2 = matcher.group(2);
                                                        strGroup2.getClass();
                                                        double d10 = d9 + (Long.parseLong(strGroup2) * 60);
                                                        String strGroup3 = matcher.group(3);
                                                        strGroup3.getClass();
                                                        double d11 = d10 + Long.parseLong(strGroup3);
                                                        String strGroup4 = matcher.group(4);
                                                        double d12 = d11 + (strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d);
                                                        String strGroup5 = matcher.group(5);
                                                        double d13 = d12 + (strGroup5 != null ? Long.parseLong(strGroup5) / cVar.f15802a : 0.0d);
                                                        String strGroup6 = matcher.group(6);
                                                        return (long) ((d13 + (strGroup6 != null ? (Long.parseLong(strGroup6) / ((double) cVar.f15803b)) / ((double) cVar.f15802a) : 0.0d)) * 1000000.0d);
                                                    }
                                                    Matcher matcher2 = f15806F.matcher(str);
                                                    if (!matcher2.matches()) {
                                                        throw new h(L.i("Malformed time expression: ", str));
                                                    }
                                                    String strGroup7 = matcher2.group(1);
                                                    strGroup7.getClass();
                                                    double d14 = Double.parseDouble(strGroup7);
                                                    String strGroup8 = matcher2.group(2);
                                                    strGroup8.getClass();
                                                    switch (strGroup8.hashCode()) {
                                                        case 102:
                                                            b7 = !strGroup8.equals("f") ? (byte) -1 : (byte) 0;
                                                            break;
                                                        case 104:
                                                            b7 = !strGroup8.equals("h") ? (byte) -1 : (byte) 1;
                                                            break;
                                                        case 109:
                                                            b7 = !strGroup8.equals("m") ? (byte) -1 : (byte) 2;
                                                            break;
                                                        case 116:
                                                            b7 = !strGroup8.equals("t") ? (byte) -1 : (byte) 3;
                                                            break;
                                                        case 3494:
                                                            if (!strGroup8.equals("ms")) {
                                                                b7 = -1;
                                                            }
                                                            break;
                                                        default:
                                                            b7 = -1;
                                                            break;
                                                    }
                                                    switch (b7) {
                                                        case 0:
                                                            d7 = cVar.f15802a;
                                                            d14 /= d7;
                                                            return (long) (d14 * 1000000.0d);
                                                        case 1:
                                                            d8 = 3600.0d;
                                                            break;
                                                        case 2:
                                                            d8 = 60.0d;
                                                            break;
                                                        case 3:
                                                            d7 = cVar.f15804c;
                                                            d14 /= d7;
                                                            return (long) (d14 * 1000000.0d);
                                                        case 4:
                                                            d7 = 1000.0d;
                                                            d14 /= d7;
                                                            return (long) (d14 * 1000000.0d);
                                                        default:
                                                            return (long) (d14 * 1000000.0d);
                                                    }
                                                    d14 *= d8;
                                                    return (long) (d14 * 1000000.0d);
                                                }

                                                public static l q(XmlPullParser xmlPullParser) {
                                                    String strP = a.p(xmlPullParser, "extent");
                                                    if (strP == null) {
                                                        return null;
                                                    }
                                                    Matcher matcher = f15810J.matcher(strP);
                                                    if (!matcher.matches()) {
                                                        Log.w("TtmlDecoder", "Ignoring non-pixel tts extent: ".concat(strP));
                                                        return null;
                                                    }
                                                    try {
                                                        String strGroup = matcher.group(1);
                                                        strGroup.getClass();
                                                        int i7 = Integer.parseInt(strGroup);
                                                        String strGroup2 = matcher.group(2);
                                                        strGroup2.getClass();
                                                        return new l(i7, Integer.parseInt(strGroup2), 2);
                                                    } catch (NumberFormatException unused) {
                                                        Log.w("TtmlDecoder", "Ignoring malformed tts extent: ".concat(strP));
                                                        return null;
                                                    }
                                                }

                                                @Override // p068j2.e
                                                public final f e(byte[] bArr, int i7, boolean z4) throws h {
                                                    n nVar;
                                                    c cVar;
                                                    try {
                                                        XmlPullParser xmlPullParserNewPullParser = this.f15814D.newPullParser();
                                                        HashMap map = new HashMap();
                                                        HashMap map2 = new HashMap();
                                                        HashMap map3 = new HashMap();
                                                        map2.put("", new f("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
                                                        l lVarQ = null;
                                                        xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i7), null);
                                                        ArrayDeque arrayDeque = new ArrayDeque();
                                                        c cVarL = f15812L;
                                                        n nVar2 = f15813M;
                                                        int i8 = 0;
                                                        j jVar = null;
                                                        n nVarJ = nVar2;
                                                        for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                                                            e eVar = (e) arrayDeque.peek();
                                                            if (i8 == 0) {
                                                                String name = xmlPullParserNewPullParser.getName();
                                                                if (eventType == 2) {
                                                                    if ("tt".equals(name)) {
                                                                        cVarL = l(xmlPullParserNewPullParser);
                                                                        nVarJ = j(xmlPullParserNewPullParser, nVar2);
                                                                        lVarQ = q(xmlPullParserNewPullParser);
                                                                    }
                                                                    n nVar3 = nVarJ;
                                                                    l lVar = lVarQ;
                                                                    c cVar2 = cVarL;
                                                                    if (i(name)) {
                                                                        if ("head".equals(name)) {
                                                                            nVar = nVar3;
                                                                            cVar = cVar2;
                                                                            m(xmlPullParserNewPullParser, map, nVar3, lVar, map2, map3);
                                                                        } else {
                                                                            nVar = nVar3;
                                                                            cVar = cVar2;
                                                                            try {
                                                                                e eVarN = n(xmlPullParserNewPullParser, eVar, map2, cVar);
                                                                                arrayDeque.push(eVarN);
                                                                                if (eVar != null) {
                                                                                    if (eVar.f15826m == null) {
                                                                                        eVar.f15826m = new ArrayList();
                                                                                    }
                                                                                    eVar.f15826m.add(eVarN);
                                                                                }
                                                                            } catch (h e7) {
                                                                                a.G(e7, "TtmlDecoder", "Suppressing parser error");
                                                                                i8++;
                                                                            }
                                                                        }
                                                                        nVarJ = nVar;
                                                                        cVarL = cVar;
                                                                    } else {
                                                                        Log.i("TtmlDecoder", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                                                                        i8++;
                                                                        nVarJ = nVar3;
                                                                        cVarL = cVar2;
                                                                    }
                                                                    lVarQ = lVar;
                                                                } else if (eventType == 4) {
                                                                    eVar.getClass();
                                                                    e eVarA = e.a(xmlPullParserNewPullParser.getText());
                                                                    if (eVar.f15826m == null) {
                                                                        eVar.f15826m = new ArrayList();
                                                                    }
                                                                    eVar.f15826m.add(eVarA);
                                                                } else if (eventType == 3) {
                                                                    if (xmlPullParserNewPullParser.getName().equals("tt")) {
                                                                        e eVar2 = (e) arrayDeque.peek();
                                                                        eVar2.getClass();
                                                                        jVar = new j(eVar2, map, map2, map3);
                                                                    }
                                                                    arrayDeque.pop();
                                                                }
                                                            } else if (eventType == 2) {
                                                                i8++;
                                                            } else if (eventType == 3) {
                                                                i8--;
                                                            }
                                                            xmlPullParserNewPullParser.next();
                                                        }
                                                        if (jVar != null) {
                                                            return jVar;
                                                        }
                                                        throw new h("No TTML subtitles found");
                                                    } catch (IOException e8) {
                                                        throw new IllegalStateException("Unexpected error when reading input.", e8);
                                                    } catch (XmlPullParserException e9) {
                                                        throw new h("Unable to decode source", e9);
                                                    }
                                                }
                                            }
