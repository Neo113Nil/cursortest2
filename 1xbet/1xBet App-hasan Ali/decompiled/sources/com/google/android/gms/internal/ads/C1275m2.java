package com.google.android.gms.internal.ads;

import Q2.C0375o;
import a3.AbstractC0467k;
import android.text.Layout;
import android.text.TextUtils;
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

/* renamed from: com.google.android.gms.internal.ads.m2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1275m2 implements P1 {

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f14456l = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f14457m = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f14458n = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f14459o = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f14460p = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f14461q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f14462r = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: s, reason: collision with root package name */
    public static final C1230l2 f14463s = new C1230l2(30.0f, 1, 1);

    /* renamed from: k, reason: collision with root package name */
    public final XmlPullParserFactory f14464k;

    public C1275m2() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f14464k = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e3) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c7, code lost:
    
        if (r13.equals("s") != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long b(String str, C1230l2 c1230l2) {
        double d5;
        double d6;
        Matcher matcher = f14456l.matcher(str);
        char c5 = 2;
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            long parseLong = Long.parseLong(group) * 3600;
            String group2 = matcher.group(2);
            group2.getClass();
            long parseLong2 = Long.parseLong(group2) * 60;
            String group3 = matcher.group(3);
            group3.getClass();
            double d7 = parseLong + parseLong2;
            double parseLong3 = Long.parseLong(group3);
            String group4 = matcher.group(4);
            double parseDouble = group4 != null ? Double.parseDouble(group4) : 0.0d;
            double d8 = d7 + parseLong3;
            return (long) ((d8 + parseDouble + (matcher.group(5) != null ? Long.parseLong(r13) / c1230l2.f14314a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / c1230l2.f14315b) / c1230l2.f14314a : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f14457m.matcher(str);
        if (!matcher2.matches()) {
            throw new N1("Malformed time expression: ".concat(String.valueOf(str)));
        }
        String group5 = matcher2.group(1);
        group5.getClass();
        double parseDouble2 = Double.parseDouble(group5);
        String group6 = matcher2.group(2);
        group6.getClass();
        int hashCode = group6.hashCode();
        if (hashCode == 102) {
            if (group6.equals("f")) {
                c5 = 4;
            }
            c5 = 65535;
        } else if (hashCode == 104) {
            if (group6.equals("h")) {
                c5 = 0;
            }
            c5 = 65535;
        } else if (hashCode == 109) {
            if (group6.equals("m")) {
                c5 = 1;
            }
            c5 = 65535;
        } else if (hashCode == 3494) {
            if (group6.equals("ms")) {
                c5 = 3;
            }
            c5 = 65535;
        } else if (hashCode != 115) {
            if (hashCode == 116 && group6.equals("t")) {
                c5 = 5;
            }
            c5 = 65535;
        }
        if (c5 == 0) {
            d5 = 3600.0d;
        } else {
            if (c5 != 1) {
                if (c5 == 3) {
                    d6 = 1000.0d;
                } else {
                    if (c5 != 4) {
                        if (c5 == 5) {
                            d6 = c1230l2.f14316c;
                        }
                        return (long) (parseDouble2 * 1000000.0d);
                    }
                    d6 = c1230l2.f14314a;
                }
                parseDouble2 /= d6;
                return (long) (parseDouble2 * 1000000.0d);
            }
            d5 = 60.0d;
        }
        parseDouble2 *= d5;
        return (long) (parseDouble2 * 1000000.0d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Layout.Alignment c(String str) {
        char c5;
        String n5 = AbstractC0952et.n(str);
        switch (n5.hashCode()) {
            case -1364013995:
                if (n5.equals("center")) {
                    c5 = 4;
                    break;
                }
                c5 = 65535;
                break;
            case 100571:
                if (n5.equals("end")) {
                    c5 = 3;
                    break;
                }
                c5 = 65535;
                break;
            case 3317767:
                if (n5.equals("left")) {
                    c5 = 0;
                    break;
                }
                c5 = 65535;
                break;
            case 108511772:
                if (n5.equals("right")) {
                    c5 = 2;
                    break;
                }
                c5 = 65535;
                break;
            case 109757538:
                if (n5.equals("start")) {
                    c5 = 1;
                    break;
                }
                c5 = 65535;
                break;
            default:
                c5 = 65535;
                break;
        }
        if (c5 == 0 || c5 == 1) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (c5 == 2 || c5 == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (c5 != 4) {
            return null;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    public static C1365o2 d(C1365o2 c1365o2) {
        return c1365o2 == null ? new C1365o2() : c1365o2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1365o2 e(XmlPullParser xmlPullParser, C1365o2 c1365o2) {
        char c5;
        Matcher matcher;
        char c6;
        char c7;
        char c8;
        char c9;
        char c10;
        C1140j2 c1140j2;
        char c11;
        Fv B5;
        int i;
        char c12;
        int i5;
        int attributeCount = xmlPullParser.getAttributeCount();
        char c13 = 0;
        C1365o2 c1365o22 = c1365o2;
        for (int i6 = 0; i6 < attributeCount; i6++) {
            String attributeValue = xmlPullParser.getAttributeValue(i6);
            String attributeName = xmlPullParser.getAttributeName(i6);
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        c5 = 6;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        c5 = 3;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        c5 = 7;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        c5 = '\f';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        c5 = 5;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c5 = c13;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c5 = '\n';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        c5 = 2;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        c5 = 14;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c5 = '\t';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        c5 = 4;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        c5 = '\r';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c5 = 11;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        c5 = 1;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        c5 = '\b';
                        break;
                    }
                    c5 = 65535;
                    break;
                default:
                    c5 = 65535;
                    break;
            }
            switch (c5) {
                case 0:
                    if ("style".equals(xmlPullParser.getName())) {
                        c1365o22 = d(c1365o22);
                        c1365o22.f14755l = attributeValue;
                        continue;
                    }
                case 1:
                    c1365o22 = d(c1365o22);
                    c13 = 0;
                    try {
                        c1365o22.f14749d = AbstractC1479qi.a(attributeValue, false);
                        c1365o22.f14750e = true;
                        continue;
                    } catch (IllegalArgumentException unused) {
                        AbstractC0467k.B(attributeValue, "Failed parsing background value: ", "TtmlParser");
                    }
                case 2:
                    c1365o22 = d(c1365o22);
                    try {
                        c1365o22.f14747b = AbstractC1479qi.a(attributeValue, false);
                        c1365o22.f14748c = true;
                        break;
                    } catch (IllegalArgumentException unused2) {
                        AbstractC0467k.B(attributeValue, "Failed parsing color value: ", "TtmlParser");
                        break;
                    }
                case 3:
                    c1365o22 = d(c1365o22);
                    c1365o22.f14746a = attributeValue;
                    break;
                case 4:
                    try {
                        c1365o22 = d(c1365o22);
                        int i7 = AbstractC1260lo.f14419a;
                        String[] split = attributeValue.split("\\s+", -1);
                        int length = split.length;
                        Pattern pattern = f14458n;
                        if (length == 1) {
                            matcher = pattern.matcher(attributeValue);
                        } else {
                            if (length != 2) {
                                throw new N1("Invalid number of entries for fontSize: " + length + ".");
                            }
                            matcher = pattern.matcher(split[1]);
                            JB.l("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                        }
                        if (!matcher.matches()) {
                            throw new N1("Invalid expression for fontSize: '" + attributeValue + "'.");
                        }
                        String group = matcher.group(3);
                        if (group == null) {
                            throw null;
                        }
                        int hashCode = group.hashCode();
                        if (hashCode == 37) {
                            if (group.equals("%")) {
                                c6 = 2;
                            }
                            c6 = 65535;
                        } else if (hashCode != 3240) {
                            if (hashCode == 3592 && group.equals("px")) {
                                c6 = 0;
                            }
                            c6 = 65535;
                        } else {
                            if (group.equals("em")) {
                                c6 = 1;
                            }
                            c6 = 65535;
                        }
                        if (c6 == 0) {
                            c1365o22.f14753j = 1;
                        } else if (c6 == 1) {
                            c1365o22.f14753j = 2;
                        } else {
                            if (c6 != 2) {
                                throw new N1("Invalid unit for fontSize: '" + group + "'.");
                            }
                            c1365o22.f14753j = 3;
                        }
                        String group2 = matcher.group(1);
                        if (group2 == null) {
                            throw null;
                        }
                        c1365o22.f14754k = Float.parseFloat(group2);
                        break;
                    } catch (N1 unused3) {
                        AbstractC0467k.B(attributeValue, "Failed parsing fontSize value: ", "TtmlParser");
                        break;
                    }
                case 5:
                    c1365o22 = d(c1365o22);
                    c1365o22.f14752h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 6:
                    c1365o22 = d(c1365o22);
                    c1365o22.i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 7:
                    c1365o22 = d(c1365o22);
                    c1365o22.f14758o = c(attributeValue);
                    break;
                case '\b':
                    c1365o22 = d(c1365o22);
                    c1365o22.f14759p = c(attributeValue);
                    break;
                case '\t':
                    String n5 = AbstractC0952et.n(attributeValue);
                    int hashCode2 = n5.hashCode();
                    if (hashCode2 != 96673) {
                        if (hashCode2 == 3387192 && n5.equals("none")) {
                            c7 = 0;
                        }
                        c7 = 65535;
                    } else {
                        if (n5.equals("all")) {
                            c7 = 1;
                        }
                        c7 = 65535;
                    }
                    if (c7 != 0) {
                        if (c7 == 1) {
                            c1365o22 = d(c1365o22);
                            c1365o22.f14760q = 1;
                            break;
                        }
                    } else {
                        c1365o22 = d(c1365o22);
                        c1365o22.f14760q = 0;
                        break;
                    }
                    break;
                case '\n':
                    String n6 = AbstractC0952et.n(attributeValue);
                    switch (n6.hashCode()) {
                        case -618561360:
                            if (n6.equals("baseContainer")) {
                                c8 = 2;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case -410956671:
                            if (n6.equals("container")) {
                                c8 = 0;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case -250518009:
                            if (n6.equals("delimiter")) {
                                c8 = 5;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case -136074796:
                            if (n6.equals("textContainer")) {
                                c8 = 4;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 3016401:
                            if (n6.equals("base")) {
                                c8 = 1;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 3556653:
                            if (n6.equals("text")) {
                                c8 = 3;
                                break;
                            }
                            c8 = 65535;
                            break;
                        default:
                            c8 = 65535;
                            break;
                    }
                    if (c8 != 0) {
                        if (c8 != 1 && c8 != 2) {
                            if (c8 != 3 && c8 != 4) {
                                if (c8 == 5) {
                                    c1365o22 = d(c1365o22);
                                    c1365o22.f14756m = 4;
                                    break;
                                }
                            } else {
                                c1365o22 = d(c1365o22);
                                c1365o22.f14756m = 3;
                                break;
                            }
                        } else {
                            c1365o22 = d(c1365o22);
                            c1365o22.f14756m = 2;
                            break;
                        }
                    } else {
                        c1365o22 = d(c1365o22);
                        c1365o22.f14756m = 1;
                        break;
                    }
                    break;
                case 11:
                    String n7 = AbstractC0952et.n(attributeValue);
                    int hashCode3 = n7.hashCode();
                    if (hashCode3 != -1392885889) {
                        if (hashCode3 == 92734940 && n7.equals("after")) {
                            c9 = 1;
                        }
                        c9 = 65535;
                    } else {
                        if (n7.equals("before")) {
                            c9 = 0;
                        }
                        c9 = 65535;
                    }
                    if (c9 != 0) {
                        if (c9 == 1) {
                            c1365o22 = d(c1365o22);
                            c1365o22.f14757n = 2;
                            break;
                        }
                    } else {
                        c1365o22 = d(c1365o22);
                        c1365o22.f14757n = 1;
                        break;
                    }
                    break;
                case '\f':
                    String n8 = AbstractC0952et.n(attributeValue);
                    switch (n8.hashCode()) {
                        case -1461280213:
                            if (n8.equals("nounderline")) {
                                c10 = 3;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1026963764:
                            if (n8.equals("underline")) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 913457136:
                            if (n8.equals("nolinethrough")) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1679736913:
                            if (n8.equals("linethrough")) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        default:
                            c10 = 65535;
                            break;
                    }
                    if (c10 == 0) {
                        c1365o22 = d(c1365o22);
                        c1365o22.f = 1;
                        break;
                    } else if (c10 == 1) {
                        c1365o22 = d(c1365o22);
                        c1365o22.f = 0;
                        break;
                    } else {
                        if (c10 == 2) {
                            c13 = 0;
                            c1365o22 = d(c1365o22);
                            c1365o22.f14751g = 1;
                        } else if (c10 == 3) {
                            c1365o22 = d(c1365o22);
                            c13 = 0;
                            c1365o22.f14751g = 0;
                        }
                    }
                    break;
                case '\r':
                    c1365o22 = d(c1365o22);
                    Pattern pattern2 = C1140j2.f14052d;
                    if (attributeValue != null) {
                        String n9 = AbstractC0952et.n(attributeValue.trim());
                        if (!n9.isEmpty()) {
                            String[] split2 = TextUtils.split(n9, C1140j2.f14052d);
                            int length2 = split2.length;
                            AbstractC1177jv m5 = length2 != 0 ? length2 != 1 ? AbstractC1177jv.m(length2, (Object[]) split2.clone()) : new Jv(split2[c13]) : Dv.f8414t;
                            String str = (String) AbstractC0952et.k(AbstractC0952et.B(C1140j2.f14055h, m5), "outside");
                            int hashCode4 = str.hashCode();
                            if (hashCode4 != -1106037339) {
                                if (hashCode4 == 92734940 && str.equals("after")) {
                                    c11 = 0;
                                    int i8 = c11 == 0 ? c11 != 1 ? 1 : -2 : 2;
                                    B5 = AbstractC0952et.B(C1140j2.f14053e, m5);
                                    if (B5.isEmpty()) {
                                        String str2 = (String) new C1222kv(B5.f9141k, B5.f9142l).next();
                                        if (str2.hashCode() == 3387192 && str2.equals("none")) {
                                            i = 0;
                                            i5 = 0;
                                            c1140j2 = new C1140j2(i5, i, i8);
                                            c1365o22.f14761r = c1140j2;
                                            break;
                                        }
                                        i = 0;
                                        i5 = -1;
                                        c1140j2 = new C1140j2(i5, i, i8);
                                        c1365o22.f14761r = c1140j2;
                                    } else {
                                        Fv B6 = AbstractC0952et.B(C1140j2.f14054g, m5);
                                        Fv B7 = AbstractC0952et.B(C1140j2.f, m5);
                                        if (!B6.isEmpty() || !B7.isEmpty()) {
                                            String str3 = (String) AbstractC0952et.k(B6, "filled");
                                            i = (str3.hashCode() == 3417674 && str3.equals("open")) ? 2 : 1;
                                            String str4 = (String) AbstractC0952et.k(B7, "circle");
                                            int hashCode5 = str4.hashCode();
                                            if (hashCode5 != -905816648) {
                                                if (hashCode5 == 99657 && str4.equals("dot")) {
                                                    c12 = 0;
                                                    i5 = c12 == 0 ? c12 != 1 ? 1 : 3 : 2;
                                                    c1140j2 = new C1140j2(i5, i, i8);
                                                    c1365o22.f14761r = c1140j2;
                                                }
                                                c12 = 65535;
                                                if (c12 == 0) {
                                                }
                                                c1140j2 = new C1140j2(i5, i, i8);
                                                c1365o22.f14761r = c1140j2;
                                            } else {
                                                if (str4.equals("sesame")) {
                                                    c12 = 1;
                                                    if (c12 == 0) {
                                                    }
                                                    c1140j2 = new C1140j2(i5, i, i8);
                                                    c1365o22.f14761r = c1140j2;
                                                }
                                                c12 = 65535;
                                                if (c12 == 0) {
                                                }
                                                c1140j2 = new C1140j2(i5, i, i8);
                                                c1365o22.f14761r = c1140j2;
                                            }
                                        }
                                        i = 0;
                                        i5 = -1;
                                        c1140j2 = new C1140j2(i5, i, i8);
                                        c1365o22.f14761r = c1140j2;
                                    }
                                }
                                c11 = 65535;
                                if (c11 == 0) {
                                }
                                B5 = AbstractC0952et.B(C1140j2.f14053e, m5);
                                if (B5.isEmpty()) {
                                }
                            } else {
                                if (str.equals("outside")) {
                                    c11 = 1;
                                    if (c11 == 0) {
                                    }
                                    B5 = AbstractC0952et.B(C1140j2.f14053e, m5);
                                    if (B5.isEmpty()) {
                                    }
                                }
                                c11 = 65535;
                                if (c11 == 0) {
                                }
                                B5 = AbstractC0952et.B(C1140j2.f14053e, m5);
                                if (B5.isEmpty()) {
                                }
                            }
                        }
                    }
                    c1140j2 = null;
                    c1365o22.f14761r = c1140j2;
                    break;
                case 14:
                    C1365o2 d5 = d(c1365o22);
                    Matcher matcher2 = f14459o.matcher(attributeValue);
                    float f = Float.MAX_VALUE;
                    if (matcher2.matches()) {
                        try {
                            String group3 = matcher2.group(1);
                            if (group3 == null) {
                                throw null;
                                break;
                            } else {
                                f = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group3)));
                            }
                        } catch (NumberFormatException e3) {
                            JB.n("TtmlParser", "Failed to parse shear: ".concat(String.valueOf(attributeValue)), e3);
                        }
                    } else {
                        AbstractC0467k.B(attributeValue, "Invalid value for shear: ", "TtmlParser");
                    }
                    d5.f14762s = f;
                    c1365o22 = d5;
                    continue;
                default:
            }
            c13 = 0;
        }
        return c1365o22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0534 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03d0 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #17 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0007, B:6:0x005c, B:8:0x0069, B:11:0x0075, B:14:0x0085, B:16:0x008d, B:17:0x009a, B:20:0x00a6, B:23:0x00ba, B:24:0x00d3, B:26:0x00df, B:27:0x00e3, B:29:0x00ef, B:31:0x00f9, B:36:0x019b, B:40:0x01f6, B:43:0x0206, B:45:0x020c, B:47:0x0214, B:49:0x021c, B:51:0x0224, B:53:0x022c, B:55:0x0234, B:57:0x023a, B:59:0x0242, B:61:0x024a, B:63:0x0250, B:65:0x0256, B:67:0x025c, B:69:0x0264, B:72:0x026d, B:77:0x0771, B:78:0x029c, B:81:0x02a4, B:83:0x02ad, B:85:0x02be, B:87:0x02c8, B:88:0x02d8, B:90:0x02de, B:92:0x02f4, B:94:0x02fa, B:97:0x052e, B:103:0x02cf, B:105:0x0307, B:108:0x0315, B:110:0x031b, B:112:0x0324, B:114:0x032a, B:115:0x0331, B:120:0x0338, B:124:0x0527, B:125:0x0348, B:127:0x0350, B:132:0x036d, B:134:0x0373, B:136:0x0380, B:138:0x03ca, B:140:0x03d0, B:145:0x03e1, B:147:0x03e7, B:149:0x03f4, B:151:0x043c, B:153:0x0444, B:166:0x0489, B:168:0x0493, B:184:0x04d9, B:202:0x03ff, B:205:0x0400, B:206:0x0401, B:208:0x0409, B:211:0x0411, B:214:0x041b, B:216:0x0421, B:218:0x042c, B:221:0x04e5, B:223:0x04e6, B:224:0x04e7, B:225:0x04f0, B:226:0x04fb, B:228:0x0389, B:230:0x038a, B:231:0x038b, B:232:0x0396, B:235:0x03a0, B:238:0x03a9, B:240:0x03af, B:242:0x03ba, B:245:0x0502, B:247:0x0503, B:248:0x0504, B:249:0x050d, B:250:0x0518, B:253:0x0557, B:257:0x0579, B:276:0x065f, B:283:0x05ea, B:285:0x05f2, B:287:0x060a, B:291:0x0613, B:295:0x061e, B:296:0x062d, B:282:0x06e1, B:302:0x0623, B:307:0x0644, B:308:0x064b, B:309:0x0655, B:334:0x0678, B:338:0x0684, B:341:0x068d, B:347:0x069f, B:349:0x06a8, B:353:0x06b3, B:356:0x06bf, B:358:0x06c4, B:360:0x06c8, B:361:0x06cf, B:371:0x01a4, B:373:0x01ae, B:376:0x01b9, B:378:0x01bf, B:380:0x01ca, B:382:0x01d6, B:384:0x01d7, B:385:0x01d8, B:386:0x0115, B:389:0x0125, B:392:0x012f, B:394:0x0135, B:397:0x013c, B:399:0x0142, B:404:0x015a, B:407:0x0161, B:409:0x0192, B:416:0x0185, B:422:0x0191, B:433:0x0706, B:435:0x0712, B:436:0x0719, B:442:0x0726, B:445:0x072a, B:447:0x0734, B:449:0x073e, B:450:0x074a, B:453:0x0745, B:457:0x075e, B:460:0x076d, B:466:0x078e), top: B:2:0x0007, inners: #1, #2, #5, #11, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0444 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #17 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0007, B:6:0x005c, B:8:0x0069, B:11:0x0075, B:14:0x0085, B:16:0x008d, B:17:0x009a, B:20:0x00a6, B:23:0x00ba, B:24:0x00d3, B:26:0x00df, B:27:0x00e3, B:29:0x00ef, B:31:0x00f9, B:36:0x019b, B:40:0x01f6, B:43:0x0206, B:45:0x020c, B:47:0x0214, B:49:0x021c, B:51:0x0224, B:53:0x022c, B:55:0x0234, B:57:0x023a, B:59:0x0242, B:61:0x024a, B:63:0x0250, B:65:0x0256, B:67:0x025c, B:69:0x0264, B:72:0x026d, B:77:0x0771, B:78:0x029c, B:81:0x02a4, B:83:0x02ad, B:85:0x02be, B:87:0x02c8, B:88:0x02d8, B:90:0x02de, B:92:0x02f4, B:94:0x02fa, B:97:0x052e, B:103:0x02cf, B:105:0x0307, B:108:0x0315, B:110:0x031b, B:112:0x0324, B:114:0x032a, B:115:0x0331, B:120:0x0338, B:124:0x0527, B:125:0x0348, B:127:0x0350, B:132:0x036d, B:134:0x0373, B:136:0x0380, B:138:0x03ca, B:140:0x03d0, B:145:0x03e1, B:147:0x03e7, B:149:0x03f4, B:151:0x043c, B:153:0x0444, B:166:0x0489, B:168:0x0493, B:184:0x04d9, B:202:0x03ff, B:205:0x0400, B:206:0x0401, B:208:0x0409, B:211:0x0411, B:214:0x041b, B:216:0x0421, B:218:0x042c, B:221:0x04e5, B:223:0x04e6, B:224:0x04e7, B:225:0x04f0, B:226:0x04fb, B:228:0x0389, B:230:0x038a, B:231:0x038b, B:232:0x0396, B:235:0x03a0, B:238:0x03a9, B:240:0x03af, B:242:0x03ba, B:245:0x0502, B:247:0x0503, B:248:0x0504, B:249:0x050d, B:250:0x0518, B:253:0x0557, B:257:0x0579, B:276:0x065f, B:283:0x05ea, B:285:0x05f2, B:287:0x060a, B:291:0x0613, B:295:0x061e, B:296:0x062d, B:282:0x06e1, B:302:0x0623, B:307:0x0644, B:308:0x064b, B:309:0x0655, B:334:0x0678, B:338:0x0684, B:341:0x068d, B:347:0x069f, B:349:0x06a8, B:353:0x06b3, B:356:0x06bf, B:358:0x06c4, B:360:0x06c8, B:361:0x06cf, B:371:0x01a4, B:373:0x01ae, B:376:0x01b9, B:378:0x01bf, B:380:0x01ca, B:382:0x01d6, B:384:0x01d7, B:385:0x01d8, B:386:0x0115, B:389:0x0125, B:392:0x012f, B:394:0x0135, B:397:0x013c, B:399:0x0142, B:404:0x015a, B:407:0x0161, B:409:0x0192, B:416:0x0185, B:422:0x0191, B:433:0x0706, B:435:0x0712, B:436:0x0719, B:442:0x0726, B:445:0x072a, B:447:0x0734, B:449:0x073e, B:450:0x074a, B:453:0x0745, B:457:0x075e, B:460:0x076d, B:466:0x078e), top: B:2:0x0007, inners: #1, #2, #5, #11, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0493 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #17 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0007, B:6:0x005c, B:8:0x0069, B:11:0x0075, B:14:0x0085, B:16:0x008d, B:17:0x009a, B:20:0x00a6, B:23:0x00ba, B:24:0x00d3, B:26:0x00df, B:27:0x00e3, B:29:0x00ef, B:31:0x00f9, B:36:0x019b, B:40:0x01f6, B:43:0x0206, B:45:0x020c, B:47:0x0214, B:49:0x021c, B:51:0x0224, B:53:0x022c, B:55:0x0234, B:57:0x023a, B:59:0x0242, B:61:0x024a, B:63:0x0250, B:65:0x0256, B:67:0x025c, B:69:0x0264, B:72:0x026d, B:77:0x0771, B:78:0x029c, B:81:0x02a4, B:83:0x02ad, B:85:0x02be, B:87:0x02c8, B:88:0x02d8, B:90:0x02de, B:92:0x02f4, B:94:0x02fa, B:97:0x052e, B:103:0x02cf, B:105:0x0307, B:108:0x0315, B:110:0x031b, B:112:0x0324, B:114:0x032a, B:115:0x0331, B:120:0x0338, B:124:0x0527, B:125:0x0348, B:127:0x0350, B:132:0x036d, B:134:0x0373, B:136:0x0380, B:138:0x03ca, B:140:0x03d0, B:145:0x03e1, B:147:0x03e7, B:149:0x03f4, B:151:0x043c, B:153:0x0444, B:166:0x0489, B:168:0x0493, B:184:0x04d9, B:202:0x03ff, B:205:0x0400, B:206:0x0401, B:208:0x0409, B:211:0x0411, B:214:0x041b, B:216:0x0421, B:218:0x042c, B:221:0x04e5, B:223:0x04e6, B:224:0x04e7, B:225:0x04f0, B:226:0x04fb, B:228:0x0389, B:230:0x038a, B:231:0x038b, B:232:0x0396, B:235:0x03a0, B:238:0x03a9, B:240:0x03af, B:242:0x03ba, B:245:0x0502, B:247:0x0503, B:248:0x0504, B:249:0x050d, B:250:0x0518, B:253:0x0557, B:257:0x0579, B:276:0x065f, B:283:0x05ea, B:285:0x05f2, B:287:0x060a, B:291:0x0613, B:295:0x061e, B:296:0x062d, B:282:0x06e1, B:302:0x0623, B:307:0x0644, B:308:0x064b, B:309:0x0655, B:334:0x0678, B:338:0x0684, B:341:0x068d, B:347:0x069f, B:349:0x06a8, B:353:0x06b3, B:356:0x06bf, B:358:0x06c4, B:360:0x06c8, B:361:0x06cf, B:371:0x01a4, B:373:0x01ae, B:376:0x01b9, B:378:0x01bf, B:380:0x01ca, B:382:0x01d6, B:384:0x01d7, B:385:0x01d8, B:386:0x0115, B:389:0x0125, B:392:0x012f, B:394:0x0135, B:397:0x013c, B:399:0x0142, B:404:0x015a, B:407:0x0161, B:409:0x0192, B:416:0x0185, B:422:0x0191, B:433:0x0706, B:435:0x0712, B:436:0x0719, B:442:0x0726, B:445:0x072a, B:447:0x0734, B:449:0x073e, B:450:0x074a, B:453:0x0745, B:457:0x075e, B:460:0x076d, B:466:0x078e), top: B:2:0x0007, inners: #1, #2, #5, #11, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04fb A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #17 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0007, B:6:0x005c, B:8:0x0069, B:11:0x0075, B:14:0x0085, B:16:0x008d, B:17:0x009a, B:20:0x00a6, B:23:0x00ba, B:24:0x00d3, B:26:0x00df, B:27:0x00e3, B:29:0x00ef, B:31:0x00f9, B:36:0x019b, B:40:0x01f6, B:43:0x0206, B:45:0x020c, B:47:0x0214, B:49:0x021c, B:51:0x0224, B:53:0x022c, B:55:0x0234, B:57:0x023a, B:59:0x0242, B:61:0x024a, B:63:0x0250, B:65:0x0256, B:67:0x025c, B:69:0x0264, B:72:0x026d, B:77:0x0771, B:78:0x029c, B:81:0x02a4, B:83:0x02ad, B:85:0x02be, B:87:0x02c8, B:88:0x02d8, B:90:0x02de, B:92:0x02f4, B:94:0x02fa, B:97:0x052e, B:103:0x02cf, B:105:0x0307, B:108:0x0315, B:110:0x031b, B:112:0x0324, B:114:0x032a, B:115:0x0331, B:120:0x0338, B:124:0x0527, B:125:0x0348, B:127:0x0350, B:132:0x036d, B:134:0x0373, B:136:0x0380, B:138:0x03ca, B:140:0x03d0, B:145:0x03e1, B:147:0x03e7, B:149:0x03f4, B:151:0x043c, B:153:0x0444, B:166:0x0489, B:168:0x0493, B:184:0x04d9, B:202:0x03ff, B:205:0x0400, B:206:0x0401, B:208:0x0409, B:211:0x0411, B:214:0x041b, B:216:0x0421, B:218:0x042c, B:221:0x04e5, B:223:0x04e6, B:224:0x04e7, B:225:0x04f0, B:226:0x04fb, B:228:0x0389, B:230:0x038a, B:231:0x038b, B:232:0x0396, B:235:0x03a0, B:238:0x03a9, B:240:0x03af, B:242:0x03ba, B:245:0x0502, B:247:0x0503, B:248:0x0504, B:249:0x050d, B:250:0x0518, B:253:0x0557, B:257:0x0579, B:276:0x065f, B:283:0x05ea, B:285:0x05f2, B:287:0x060a, B:291:0x0613, B:295:0x061e, B:296:0x062d, B:282:0x06e1, B:302:0x0623, B:307:0x0644, B:308:0x064b, B:309:0x0655, B:334:0x0678, B:338:0x0684, B:341:0x068d, B:347:0x069f, B:349:0x06a8, B:353:0x06b3, B:356:0x06bf, B:358:0x06c4, B:360:0x06c8, B:361:0x06cf, B:371:0x01a4, B:373:0x01ae, B:376:0x01b9, B:378:0x01bf, B:380:0x01ca, B:382:0x01d6, B:384:0x01d7, B:385:0x01d8, B:386:0x0115, B:389:0x0125, B:392:0x012f, B:394:0x0135, B:397:0x013c, B:399:0x0142, B:404:0x015a, B:407:0x0161, B:409:0x0192, B:416:0x0185, B:422:0x0191, B:433:0x0706, B:435:0x0712, B:436:0x0719, B:442:0x0726, B:445:0x072a, B:447:0x0734, B:449:0x073e, B:450:0x074a, B:453:0x0745, B:457:0x075e, B:460:0x076d, B:466:0x078e), top: B:2:0x0007, inners: #1, #2, #5, #11, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x06c4 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, N1 -> 0x06e0, TryCatch #16 {N1 -> 0x06e0, blocks: (B:356:0x06bf, B:358:0x06c4, B:360:0x06c8, B:361:0x06cf), top: B:355:0x06bf }] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x01a4 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TryCatch #17 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0007, B:6:0x005c, B:8:0x0069, B:11:0x0075, B:14:0x0085, B:16:0x008d, B:17:0x009a, B:20:0x00a6, B:23:0x00ba, B:24:0x00d3, B:26:0x00df, B:27:0x00e3, B:29:0x00ef, B:31:0x00f9, B:36:0x019b, B:40:0x01f6, B:43:0x0206, B:45:0x020c, B:47:0x0214, B:49:0x021c, B:51:0x0224, B:53:0x022c, B:55:0x0234, B:57:0x023a, B:59:0x0242, B:61:0x024a, B:63:0x0250, B:65:0x0256, B:67:0x025c, B:69:0x0264, B:72:0x026d, B:77:0x0771, B:78:0x029c, B:81:0x02a4, B:83:0x02ad, B:85:0x02be, B:87:0x02c8, B:88:0x02d8, B:90:0x02de, B:92:0x02f4, B:94:0x02fa, B:97:0x052e, B:103:0x02cf, B:105:0x0307, B:108:0x0315, B:110:0x031b, B:112:0x0324, B:114:0x032a, B:115:0x0331, B:120:0x0338, B:124:0x0527, B:125:0x0348, B:127:0x0350, B:132:0x036d, B:134:0x0373, B:136:0x0380, B:138:0x03ca, B:140:0x03d0, B:145:0x03e1, B:147:0x03e7, B:149:0x03f4, B:151:0x043c, B:153:0x0444, B:166:0x0489, B:168:0x0493, B:184:0x04d9, B:202:0x03ff, B:205:0x0400, B:206:0x0401, B:208:0x0409, B:211:0x0411, B:214:0x041b, B:216:0x0421, B:218:0x042c, B:221:0x04e5, B:223:0x04e6, B:224:0x04e7, B:225:0x04f0, B:226:0x04fb, B:228:0x0389, B:230:0x038a, B:231:0x038b, B:232:0x0396, B:235:0x03a0, B:238:0x03a9, B:240:0x03af, B:242:0x03ba, B:245:0x0502, B:247:0x0503, B:248:0x0504, B:249:0x050d, B:250:0x0518, B:253:0x0557, B:257:0x0579, B:276:0x065f, B:283:0x05ea, B:285:0x05f2, B:287:0x060a, B:291:0x0613, B:295:0x061e, B:296:0x062d, B:282:0x06e1, B:302:0x0623, B:307:0x0644, B:308:0x064b, B:309:0x0655, B:334:0x0678, B:338:0x0684, B:341:0x068d, B:347:0x069f, B:349:0x06a8, B:353:0x06b3, B:356:0x06bf, B:358:0x06c4, B:360:0x06c8, B:361:0x06cf, B:371:0x01a4, B:373:0x01ae, B:376:0x01b9, B:378:0x01bf, B:380:0x01ca, B:382:0x01d6, B:384:0x01d7, B:385:0x01d8, B:386:0x0115, B:389:0x0125, B:392:0x012f, B:394:0x0135, B:397:0x013c, B:399:0x0142, B:404:0x015a, B:407:0x0161, B:409:0x0192, B:416:0x0185, B:422:0x0191, B:433:0x0706, B:435:0x0712, B:436:0x0719, B:442:0x0726, B:445:0x072a, B:447:0x0734, B:449:0x073e, B:450:0x074a, B:453:0x0745, B:457:0x075e, B:460:0x076d, B:466:0x078e), top: B:2:0x0007, inners: #1, #2, #5, #11, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0206 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_ENTER, TryCatch #17 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0007, B:6:0x005c, B:8:0x0069, B:11:0x0075, B:14:0x0085, B:16:0x008d, B:17:0x009a, B:20:0x00a6, B:23:0x00ba, B:24:0x00d3, B:26:0x00df, B:27:0x00e3, B:29:0x00ef, B:31:0x00f9, B:36:0x019b, B:40:0x01f6, B:43:0x0206, B:45:0x020c, B:47:0x0214, B:49:0x021c, B:51:0x0224, B:53:0x022c, B:55:0x0234, B:57:0x023a, B:59:0x0242, B:61:0x024a, B:63:0x0250, B:65:0x0256, B:67:0x025c, B:69:0x0264, B:72:0x026d, B:77:0x0771, B:78:0x029c, B:81:0x02a4, B:83:0x02ad, B:85:0x02be, B:87:0x02c8, B:88:0x02d8, B:90:0x02de, B:92:0x02f4, B:94:0x02fa, B:97:0x052e, B:103:0x02cf, B:105:0x0307, B:108:0x0315, B:110:0x031b, B:112:0x0324, B:114:0x032a, B:115:0x0331, B:120:0x0338, B:124:0x0527, B:125:0x0348, B:127:0x0350, B:132:0x036d, B:134:0x0373, B:136:0x0380, B:138:0x03ca, B:140:0x03d0, B:145:0x03e1, B:147:0x03e7, B:149:0x03f4, B:151:0x043c, B:153:0x0444, B:166:0x0489, B:168:0x0493, B:184:0x04d9, B:202:0x03ff, B:205:0x0400, B:206:0x0401, B:208:0x0409, B:211:0x0411, B:214:0x041b, B:216:0x0421, B:218:0x042c, B:221:0x04e5, B:223:0x04e6, B:224:0x04e7, B:225:0x04f0, B:226:0x04fb, B:228:0x0389, B:230:0x038a, B:231:0x038b, B:232:0x0396, B:235:0x03a0, B:238:0x03a9, B:240:0x03af, B:242:0x03ba, B:245:0x0502, B:247:0x0503, B:248:0x0504, B:249:0x050d, B:250:0x0518, B:253:0x0557, B:257:0x0579, B:276:0x065f, B:283:0x05ea, B:285:0x05f2, B:287:0x060a, B:291:0x0613, B:295:0x061e, B:296:0x062d, B:282:0x06e1, B:302:0x0623, B:307:0x0644, B:308:0x064b, B:309:0x0655, B:334:0x0678, B:338:0x0684, B:341:0x068d, B:347:0x069f, B:349:0x06a8, B:353:0x06b3, B:356:0x06bf, B:358:0x06c4, B:360:0x06c8, B:361:0x06cf, B:371:0x01a4, B:373:0x01ae, B:376:0x01b9, B:378:0x01bf, B:380:0x01ca, B:382:0x01d6, B:384:0x01d7, B:385:0x01d8, B:386:0x0115, B:389:0x0125, B:392:0x012f, B:394:0x0135, B:397:0x013c, B:399:0x0142, B:404:0x015a, B:407:0x0161, B:409:0x0192, B:416:0x0185, B:422:0x0191, B:433:0x0706, B:435:0x0712, B:436:0x0719, B:442:0x0726, B:445:0x072a, B:447:0x0734, B:449:0x073e, B:450:0x074a, B:453:0x0745, B:457:0x075e, B:460:0x076d, B:466:0x078e), top: B:2:0x0007, inners: #1, #2, #5, #11, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02a4 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, LOOP:1: B:81:0x02a4->B:99:0x053b, LOOP_START, PHI: r2 r4 r7 r11 r12 r15 r20 r31
      0x02a4: PHI (r2v25 java.lang.String) = (r2v6 java.lang.String), (r2v42 java.lang.String) binds: [B:80:0x02a2, B:99:0x053b] A[DONT_GENERATE, DONT_INLINE]
      0x02a4: PHI (r4v12 com.google.android.gms.internal.ads.l2) = (r4v9 com.google.android.gms.internal.ads.l2), (r4v29 com.google.android.gms.internal.ads.l2) binds: [B:80:0x02a2, B:99:0x053b] A[DONT_GENERATE, DONT_INLINE]
      0x02a4: PHI (r7v32 java.util.HashMap) = (r7v1 java.util.HashMap), (r7v50 java.util.HashMap) binds: [B:80:0x02a2, B:99:0x053b] A[DONT_GENERATE, DONT_INLINE]
      0x02a4: PHI (r11v6 java.lang.String) = (r11v5 java.lang.String), (r11v16 java.lang.String) binds: [B:80:0x02a2, B:99:0x053b] A[DONT_GENERATE, DONT_INLINE]
      0x02a4: PHI (r12v13 java.lang.String) = (r12v5 java.lang.String), (r12v29 java.lang.String) binds: [B:80:0x02a2, B:99:0x053b] A[DONT_GENERATE, DONT_INLINE]
      0x02a4: PHI (r15v17 java.lang.String) = (r15v11 java.lang.String), (r15v25 java.lang.String) binds: [B:80:0x02a2, B:99:0x053b] A[DONT_GENERATE, DONT_INLINE]
      0x02a4: PHI (r20v3 int) = (r20v2 int), (r20v4 int) binds: [B:80:0x02a2, B:99:0x053b] A[DONT_GENERATE, DONT_INLINE]
      0x02a4: PHI (r31v12 java.util.HashMap) = (r31v1 java.util.HashMap), (r31v13 java.util.HashMap) binds: [B:80:0x02a2, B:99:0x053b] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #17 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0007, B:6:0x005c, B:8:0x0069, B:11:0x0075, B:14:0x0085, B:16:0x008d, B:17:0x009a, B:20:0x00a6, B:23:0x00ba, B:24:0x00d3, B:26:0x00df, B:27:0x00e3, B:29:0x00ef, B:31:0x00f9, B:36:0x019b, B:40:0x01f6, B:43:0x0206, B:45:0x020c, B:47:0x0214, B:49:0x021c, B:51:0x0224, B:53:0x022c, B:55:0x0234, B:57:0x023a, B:59:0x0242, B:61:0x024a, B:63:0x0250, B:65:0x0256, B:67:0x025c, B:69:0x0264, B:72:0x026d, B:77:0x0771, B:78:0x029c, B:81:0x02a4, B:83:0x02ad, B:85:0x02be, B:87:0x02c8, B:88:0x02d8, B:90:0x02de, B:92:0x02f4, B:94:0x02fa, B:97:0x052e, B:103:0x02cf, B:105:0x0307, B:108:0x0315, B:110:0x031b, B:112:0x0324, B:114:0x032a, B:115:0x0331, B:120:0x0338, B:124:0x0527, B:125:0x0348, B:127:0x0350, B:132:0x036d, B:134:0x0373, B:136:0x0380, B:138:0x03ca, B:140:0x03d0, B:145:0x03e1, B:147:0x03e7, B:149:0x03f4, B:151:0x043c, B:153:0x0444, B:166:0x0489, B:168:0x0493, B:184:0x04d9, B:202:0x03ff, B:205:0x0400, B:206:0x0401, B:208:0x0409, B:211:0x0411, B:214:0x041b, B:216:0x0421, B:218:0x042c, B:221:0x04e5, B:223:0x04e6, B:224:0x04e7, B:225:0x04f0, B:226:0x04fb, B:228:0x0389, B:230:0x038a, B:231:0x038b, B:232:0x0396, B:235:0x03a0, B:238:0x03a9, B:240:0x03af, B:242:0x03ba, B:245:0x0502, B:247:0x0503, B:248:0x0504, B:249:0x050d, B:250:0x0518, B:253:0x0557, B:257:0x0579, B:276:0x065f, B:283:0x05ea, B:285:0x05f2, B:287:0x060a, B:291:0x0613, B:295:0x061e, B:296:0x062d, B:282:0x06e1, B:302:0x0623, B:307:0x0644, B:308:0x064b, B:309:0x0655, B:334:0x0678, B:338:0x0684, B:341:0x068d, B:347:0x069f, B:349:0x06a8, B:353:0x06b3, B:356:0x06bf, B:358:0x06c4, B:360:0x06c8, B:361:0x06cf, B:371:0x01a4, B:373:0x01ae, B:376:0x01b9, B:378:0x01bf, B:380:0x01ca, B:382:0x01d6, B:384:0x01d7, B:385:0x01d8, B:386:0x0115, B:389:0x0125, B:392:0x012f, B:394:0x0135, B:397:0x013c, B:399:0x0142, B:404:0x015a, B:407:0x0161, B:409:0x0192, B:416:0x0185, B:422:0x0191, B:433:0x0706, B:435:0x0712, B:436:0x0719, B:442:0x0726, B:445:0x072a, B:447:0x0734, B:449:0x073e, B:450:0x074a, B:453:0x0745, B:457:0x075e, B:460:0x076d, B:466:0x078e), top: B:2:0x0007, inners: #1, #2, #5, #11, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x053b A[LOOP:1: B:81:0x02a4->B:99:0x053b, LOOP_END] */
    /* JADX WARN: Type inference failed for: r48v1, types: [com.google.android.gms.internal.ads.o2, java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0375o a(byte[] bArr, int i, int i5) {
        String str;
        String str2;
        HashMap hashMap;
        HashMap hashMap2;
        ArrayDeque arrayDeque;
        C1230l2 c1230l2;
        C0375o c0375o;
        int i6;
        HashMap hashMap3;
        ArrayDeque arrayDeque2;
        C1185k2 c1185k2;
        C0375o c0375o2;
        C1230l2 c1230l22;
        E.H0 h02;
        int i7;
        boolean equals;
        HashMap hashMap4;
        C1230l2 c1230l23;
        C1365o2 e3;
        String str3;
        long j5;
        long j6;
        long j7;
        String[] strArr;
        String str4;
        C1185k2 c1185k22;
        C1185k2 c1185k23;
        long j8;
        long j9;
        Object obj;
        char c5;
        String str5;
        String[] split;
        C1230l2 c1230l24;
        String str6;
        String str7;
        String str8;
        String str9;
        C1320n2 c1320n2;
        float f;
        float parseInt;
        String h3;
        float f5;
        float parseInt2;
        String h4;
        float f6;
        int i8;
        String h5;
        int i9;
        char c6;
        char c7;
        String h6;
        String[] split2;
        float f7;
        String group;
        String group2;
        int i10;
        boolean z3;
        StringBuilder sb;
        String h7;
        int i11 = 1;
        String str10 = "";
        String str11 = "http://www.w3.org/ns/ttml#parameter";
        try {
            XmlPullParser newPullParser = this.f14464k.newPullParser();
            HashMap hashMap5 = new HashMap();
            HashMap hashMap6 = new HashMap();
            HashMap hashMap7 = new HashMap();
            hashMap6.put("", new C1320n2("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            Object obj2 = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i, i5), null);
            ArrayDeque arrayDeque3 = new ArrayDeque();
            int eventType = newPullParser.getEventType();
            C1230l2 c1230l25 = f14463s;
            C0375o c0375o3 = null;
            E.H0 h03 = null;
            C1230l2 c1230l26 = c1230l25;
            int i12 = 0;
            int i13 = 15;
            while (eventType != i11) {
                C1185k2 c1185k24 = (C1185k2) arrayDeque3.peek();
                ?? r48 = obj2;
                if (i12 == 0) {
                    int i14 = 0;
                    String name = newPullParser.getName();
                    int i15 = i11;
                    if (eventType == 2) {
                        boolean equals2 = "tt".equals(name);
                        Pattern pattern = f14461q;
                        str = str10;
                        if (equals2) {
                            String attributeValue = newPullParser.getAttributeValue(str11, "frameRate");
                            int parseInt3 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
                            String attributeValue2 = newPullParser.getAttributeValue(str11, "frameRateMultiplier");
                            c0375o2 = c0375o3;
                            if (attributeValue2 != null) {
                                int i16 = AbstractC1260lo.f14419a;
                                arrayDeque2 = arrayDeque3;
                                AbstractC1668us.W("frameRateMultiplier doesn't have 2 parts", attributeValue2.split(" ", -1).length == 2 ? i15 : 0);
                                f7 = Integer.parseInt(r5[0]) / Integer.parseInt(r5[i15]);
                            } else {
                                arrayDeque2 = arrayDeque3;
                                f7 = 1.0f;
                            }
                            int i17 = c1230l25.f14315b;
                            float f8 = f7;
                            String attributeValue3 = newPullParser.getAttributeValue(str11, "subFrameRate");
                            if (attributeValue3 != null) {
                                i17 = Integer.parseInt(attributeValue3);
                            }
                            int i18 = c1230l25.f14316c;
                            String attributeValue4 = newPullParser.getAttributeValue(str11, "tickRate");
                            c1230l2 = c1230l25;
                            C1230l2 c1230l27 = new C1230l2(parseInt3 * f8, i17, attributeValue4 != null ? Integer.parseInt(attributeValue4) : i18);
                            String attributeValue5 = newPullParser.getAttributeValue(str11, "cellResolution");
                            if (attributeValue5 == null) {
                                str2 = str11;
                            } else {
                                Matcher matcher = f14462r.matcher(attributeValue5);
                                str2 = str11;
                                if (matcher.matches()) {
                                    try {
                                        group = matcher.group(i15);
                                    } catch (NumberFormatException unused) {
                                        hashMap3 = hashMap6;
                                        c1230l26 = c1230l27;
                                    }
                                    if (group == null) {
                                        throw r48;
                                    }
                                    int parseInt4 = Integer.parseInt(group);
                                    c1230l26 = c1230l27;
                                    try {
                                        group2 = matcher.group(2);
                                    } catch (NumberFormatException unused2) {
                                        hashMap3 = hashMap6;
                                        c1185k2 = c1185k24;
                                        JB.l("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                        i13 = 15;
                                        h7 = AbstractC1803xs.h(newPullParser, "extent");
                                        if (h7 != null) {
                                        }
                                        h03 = r48;
                                        c1230l22 = c1230l26;
                                        h02 = h03;
                                        i7 = i13;
                                        String str12 = "image";
                                        String str13 = "metadata";
                                        String str14 = "style";
                                        if (!name.equals("tt")) {
                                            JB.i("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                                            c1230l26 = c1230l22;
                                            h03 = h02;
                                            hashMap = hashMap5;
                                            i13 = i7;
                                            c0375o3 = c0375o2;
                                            arrayDeque = arrayDeque2;
                                            hashMap2 = hashMap3;
                                            i12 = 1;
                                            i6 = 1;
                                            newPullParser.next();
                                            eventType = newPullParser.getEventType();
                                            hashMap5 = hashMap;
                                            hashMap6 = hashMap2;
                                            arrayDeque3 = arrayDeque;
                                            i11 = i6;
                                            str10 = str;
                                            c1230l25 = c1230l2;
                                            str11 = str2;
                                            obj2 = null;
                                        }
                                        equals = "head".equals(name);
                                        String str15 = "\\s+";
                                        if (equals) {
                                        }
                                        c1230l26 = c1230l23;
                                        h03 = h02;
                                        i13 = i7;
                                        c0375o3 = c0375o2;
                                        hashMap = hashMap4;
                                        i6 = 1;
                                        newPullParser.next();
                                        eventType = newPullParser.getEventType();
                                        hashMap5 = hashMap;
                                        hashMap6 = hashMap2;
                                        arrayDeque3 = arrayDeque;
                                        i11 = i6;
                                        str10 = str;
                                        c1230l25 = c1230l2;
                                        str11 = str2;
                                        obj2 = null;
                                    }
                                    if (group2 == null) {
                                        throw r48;
                                    }
                                    int parseInt5 = Integer.parseInt(group2);
                                    if (parseInt4 == 0) {
                                        i10 = parseInt5;
                                        c1185k2 = c1185k24;
                                        z3 = false;
                                    } else if (parseInt5 != 0) {
                                        i10 = parseInt5;
                                        c1185k2 = c1185k24;
                                        z3 = true;
                                    } else {
                                        c1185k2 = c1185k24;
                                        z3 = false;
                                        i10 = 0;
                                    }
                                    try {
                                        sb = new StringBuilder();
                                        hashMap3 = hashMap6;
                                    } catch (NumberFormatException unused3) {
                                        hashMap3 = hashMap6;
                                    }
                                    try {
                                        sb.append("Invalid cell resolution ");
                                        sb.append(parseInt4);
                                        sb.append(" ");
                                        sb.append(i10);
                                        AbstractC1668us.W(sb.toString(), z3);
                                        i13 = i10;
                                    } catch (NumberFormatException unused4) {
                                        JB.l("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                        i13 = 15;
                                        h7 = AbstractC1803xs.h(newPullParser, "extent");
                                        if (h7 != null) {
                                        }
                                        h03 = r48;
                                        c1230l22 = c1230l26;
                                        h02 = h03;
                                        i7 = i13;
                                        String str122 = "image";
                                        String str132 = "metadata";
                                        String str142 = "style";
                                        if (!name.equals("tt")) {
                                        }
                                        equals = "head".equals(name);
                                        String str152 = "\\s+";
                                        if (equals) {
                                        }
                                        c1230l26 = c1230l23;
                                        h03 = h02;
                                        i13 = i7;
                                        c0375o3 = c0375o2;
                                        hashMap = hashMap4;
                                        i6 = 1;
                                        newPullParser.next();
                                        eventType = newPullParser.getEventType();
                                        hashMap5 = hashMap;
                                        hashMap6 = hashMap2;
                                        arrayDeque3 = arrayDeque;
                                        i11 = i6;
                                        str10 = str;
                                        c1230l25 = c1230l2;
                                        str11 = str2;
                                        obj2 = null;
                                    }
                                    h7 = AbstractC1803xs.h(newPullParser, "extent");
                                    if (h7 != null) {
                                        Matcher matcher2 = pattern.matcher(h7);
                                        if (matcher2.matches()) {
                                            try {
                                                String group3 = matcher2.group(1);
                                                if (group3 == null) {
                                                    throw r48;
                                                }
                                                int parseInt6 = Integer.parseInt(group3);
                                                String group4 = matcher2.group(2);
                                                if (group4 == null) {
                                                    throw r48;
                                                }
                                                h03 = new E.H0(parseInt6, Integer.parseInt(group4));
                                            } catch (NumberFormatException unused5) {
                                                JB.l("TtmlParser", "Ignoring malformed tts extent: ".concat(h7));
                                            }
                                        } else {
                                            JB.l("TtmlParser", "Ignoring non-pixel tts extent: ".concat(h7));
                                        }
                                    }
                                    h03 = r48;
                                } else {
                                    JB.l("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                }
                            }
                            hashMap3 = hashMap6;
                            c1230l26 = c1230l27;
                            c1185k2 = c1185k24;
                            i13 = 15;
                            h7 = AbstractC1803xs.h(newPullParser, "extent");
                            if (h7 != null) {
                            }
                            h03 = r48;
                        } else {
                            str2 = str11;
                            hashMap3 = hashMap6;
                            arrayDeque2 = arrayDeque3;
                            c1230l2 = c1230l25;
                            c1185k2 = c1185k24;
                            c0375o2 = c0375o3;
                        }
                        c1230l22 = c1230l26;
                        h02 = h03;
                        i7 = i13;
                        String str1222 = "image";
                        String str1322 = "metadata";
                        String str1422 = "style";
                        if (!name.equals("tt") && !name.equals("head") && !name.equals("body") && !name.equals("div") && !name.equals("p") && !name.equals("span") && !name.equals("br") && !name.equals("style") && !name.equals("styling") && !name.equals("layout") && !name.equals("region") && !name.equals("metadata") && !name.equals("image") && !name.equals("data") && !name.equals("information")) {
                            JB.i("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                            c1230l26 = c1230l22;
                            h03 = h02;
                            hashMap = hashMap5;
                            i13 = i7;
                            c0375o3 = c0375o2;
                            arrayDeque = arrayDeque2;
                            hashMap2 = hashMap3;
                            i12 = 1;
                        }
                        equals = "head".equals(name);
                        String str1522 = "\\s+";
                        if (equals) {
                            while (true) {
                                newPullParser.next();
                                if (AbstractC1803xs.H(newPullParser, str1422)) {
                                    String h8 = AbstractC1803xs.h(newPullParser, str1422);
                                    c1230l24 = c1230l22;
                                    C1365o2 e5 = e(newPullParser, new C1365o2());
                                    if (h8 != null) {
                                        String trim = h8.trim();
                                        if (trim.isEmpty()) {
                                            str7 = str1422;
                                            split2 = new String[i14];
                                        } else {
                                            str7 = str1422;
                                            int i19 = AbstractC1260lo.f14419a;
                                            split2 = trim.split(str1522, -1);
                                        }
                                        int length = split2.length;
                                        str6 = str1522;
                                        int i20 = 0;
                                        while (i20 < length) {
                                            int i21 = i20;
                                            e5.b((C1365o2) hashMap5.get(split2[i21]));
                                            i20 = i21 + 1;
                                        }
                                    } else {
                                        str6 = str1522;
                                        str7 = str1422;
                                    }
                                    String a5 = e5.a();
                                    if (a5 != null) {
                                        hashMap5.put(a5, e5);
                                    }
                                } else {
                                    c1230l24 = c1230l22;
                                    str6 = str1522;
                                    str7 = str1422;
                                    if (AbstractC1803xs.H(newPullParser, "region")) {
                                        String h9 = AbstractC1803xs.h(newPullParser, "id");
                                        if (h9 == null) {
                                            c1320n2 = r48;
                                            str8 = str1222;
                                            hashMap4 = hashMap5;
                                            str9 = str1322;
                                        } else {
                                            String h10 = AbstractC1803xs.h(newPullParser, "origin");
                                            if (h10 != null) {
                                                Pattern pattern2 = f14460p;
                                                Matcher matcher3 = pattern2.matcher(h10);
                                                Matcher matcher4 = pattern.matcher(h10);
                                                str8 = str1222;
                                                str9 = str1322;
                                                if (matcher3.matches()) {
                                                    hashMap4 = hashMap5;
                                                    try {
                                                        String group5 = matcher3.group(1);
                                                        if (group5 == null) {
                                                            throw r48;
                                                        }
                                                        f = Float.parseFloat(group5) / 100.0f;
                                                        String group6 = matcher3.group(2);
                                                        if (group6 == null) {
                                                            throw r48;
                                                        }
                                                        parseInt = Float.parseFloat(group6) / 100.0f;
                                                        float f9 = f;
                                                        h3 = AbstractC1803xs.h(newPullParser, "extent");
                                                        if (h3 == null) {
                                                            Matcher matcher5 = pattern2.matcher(h3);
                                                            Matcher matcher6 = pattern.matcher(h3);
                                                            if (matcher5.matches()) {
                                                                try {
                                                                    String group7 = matcher5.group(1);
                                                                    if (group7 == null) {
                                                                        throw r48;
                                                                    }
                                                                    f5 = Float.parseFloat(group7) / 100.0f;
                                                                    String group8 = matcher5.group(2);
                                                                    if (group8 == null) {
                                                                        throw r48;
                                                                    }
                                                                    parseInt2 = Float.parseFloat(group8) / 100.0f;
                                                                    float f10 = parseInt2;
                                                                    float f11 = f5;
                                                                    h4 = AbstractC1803xs.h(newPullParser, "displayAlign");
                                                                    if (h4 != null) {
                                                                        String n5 = AbstractC0952et.n(h4);
                                                                        int hashCode = n5.hashCode();
                                                                        if (hashCode != -1364013995) {
                                                                            if (hashCode == 92734940 && n5.equals("after")) {
                                                                                c7 = 1;
                                                                                if (c7 != 0) {
                                                                                    f6 = parseInt + (f10 / 2.0f);
                                                                                    i8 = 1;
                                                                                } else if (c7 == 1) {
                                                                                    f6 = parseInt + f10;
                                                                                    i8 = 2;
                                                                                }
                                                                                float f12 = 1.0f / i7;
                                                                                h5 = AbstractC1803xs.h(newPullParser, "writingMode");
                                                                                if (h5 != null) {
                                                                                    String n6 = AbstractC0952et.n(h5);
                                                                                    int hashCode2 = n6.hashCode();
                                                                                    if (hashCode2 == 3694) {
                                                                                        if (n6.equals("tb")) {
                                                                                            c6 = 0;
                                                                                            if (c6 != 0) {
                                                                                            }
                                                                                            i9 = 2;
                                                                                            c1320n2 = new C1320n2(h9, f9, f6, 0, i8, f11, f10, 1, f12, i9);
                                                                                        }
                                                                                        c6 = 65535;
                                                                                        if (c6 != 0) {
                                                                                        }
                                                                                        i9 = 2;
                                                                                        c1320n2 = new C1320n2(h9, f9, f6, 0, i8, f11, f10, 1, f12, i9);
                                                                                    } else if (hashCode2 != 3553396) {
                                                                                        if (hashCode2 == 3553576 && n6.equals("tbrl")) {
                                                                                            c6 = 2;
                                                                                            if (c6 != 0 || c6 == 1) {
                                                                                                i9 = 2;
                                                                                            } else if (c6 == 2) {
                                                                                                i9 = 1;
                                                                                            }
                                                                                            c1320n2 = new C1320n2(h9, f9, f6, 0, i8, f11, f10, 1, f12, i9);
                                                                                        }
                                                                                        c6 = 65535;
                                                                                        if (c6 != 0) {
                                                                                        }
                                                                                        i9 = 2;
                                                                                        c1320n2 = new C1320n2(h9, f9, f6, 0, i8, f11, f10, 1, f12, i9);
                                                                                    } else {
                                                                                        if (n6.equals("tblr")) {
                                                                                            c6 = 1;
                                                                                            if (c6 != 0) {
                                                                                            }
                                                                                            i9 = 2;
                                                                                            c1320n2 = new C1320n2(h9, f9, f6, 0, i8, f11, f10, 1, f12, i9);
                                                                                        }
                                                                                        c6 = 65535;
                                                                                        if (c6 != 0) {
                                                                                        }
                                                                                        i9 = 2;
                                                                                        c1320n2 = new C1320n2(h9, f9, f6, 0, i8, f11, f10, 1, f12, i9);
                                                                                    }
                                                                                }
                                                                                i9 = Integer.MIN_VALUE;
                                                                                c1320n2 = new C1320n2(h9, f9, f6, 0, i8, f11, f10, 1, f12, i9);
                                                                            }
                                                                            c7 = 65535;
                                                                            if (c7 != 0) {
                                                                            }
                                                                            float f122 = 1.0f / i7;
                                                                            h5 = AbstractC1803xs.h(newPullParser, "writingMode");
                                                                            if (h5 != null) {
                                                                            }
                                                                            i9 = Integer.MIN_VALUE;
                                                                            c1320n2 = new C1320n2(h9, f9, f6, 0, i8, f11, f10, 1, f122, i9);
                                                                        } else {
                                                                            if (n5.equals("center")) {
                                                                                c7 = 0;
                                                                                if (c7 != 0) {
                                                                                }
                                                                                float f1222 = 1.0f / i7;
                                                                                h5 = AbstractC1803xs.h(newPullParser, "writingMode");
                                                                                if (h5 != null) {
                                                                                }
                                                                                i9 = Integer.MIN_VALUE;
                                                                                c1320n2 = new C1320n2(h9, f9, f6, 0, i8, f11, f10, 1, f1222, i9);
                                                                            }
                                                                            c7 = 65535;
                                                                            if (c7 != 0) {
                                                                            }
                                                                            float f12222 = 1.0f / i7;
                                                                            h5 = AbstractC1803xs.h(newPullParser, "writingMode");
                                                                            if (h5 != null) {
                                                                            }
                                                                            i9 = Integer.MIN_VALUE;
                                                                            c1320n2 = new C1320n2(h9, f9, f6, 0, i8, f11, f10, 1, f12222, i9);
                                                                        }
                                                                    }
                                                                    f6 = parseInt;
                                                                    i8 = 0;
                                                                    float f122222 = 1.0f / i7;
                                                                    h5 = AbstractC1803xs.h(newPullParser, "writingMode");
                                                                    if (h5 != null) {
                                                                    }
                                                                    i9 = Integer.MIN_VALUE;
                                                                    c1320n2 = new C1320n2(h9, f9, f6, 0, i8, f11, f10, 1, f122222, i9);
                                                                } catch (NumberFormatException unused6) {
                                                                    JB.l("TtmlParser", "Ignoring region with malformed extent: ".concat(h10));
                                                                }
                                                            } else if (!matcher6.matches()) {
                                                                JB.l("TtmlParser", "Ignoring region with unsupported extent: ".concat(h10));
                                                            } else if (h02 == null) {
                                                                JB.l("TtmlParser", "Ignoring region with missing tts:extent: ".concat(h10));
                                                            } else {
                                                                try {
                                                                    String group9 = matcher6.group(1);
                                                                    if (group9 == null) {
                                                                        throw r48;
                                                                    }
                                                                    int parseInt7 = Integer.parseInt(group9);
                                                                    String group10 = matcher6.group(2);
                                                                    if (group10 == null) {
                                                                        throw r48;
                                                                    }
                                                                    f5 = parseInt7 / h02.f1041a;
                                                                    parseInt2 = Integer.parseInt(group10) / h02.f1042b;
                                                                    float f102 = parseInt2;
                                                                    float f112 = f5;
                                                                    h4 = AbstractC1803xs.h(newPullParser, "displayAlign");
                                                                    if (h4 != null) {
                                                                    }
                                                                    f6 = parseInt;
                                                                    i8 = 0;
                                                                    float f1222222 = 1.0f / i7;
                                                                    h5 = AbstractC1803xs.h(newPullParser, "writingMode");
                                                                    if (h5 != null) {
                                                                    }
                                                                    i9 = Integer.MIN_VALUE;
                                                                    c1320n2 = new C1320n2(h9, f9, f6, 0, i8, f112, f102, 1, f1222222, i9);
                                                                } catch (NumberFormatException unused7) {
                                                                    JB.l("TtmlParser", "Ignoring region with malformed extent: ".concat(h10));
                                                                }
                                                            }
                                                        } else {
                                                            JB.l("TtmlParser", "Ignoring region without an extent");
                                                        }
                                                    } catch (NumberFormatException unused8) {
                                                        JB.l("TtmlParser", "Ignoring region with malformed origin: ".concat(h10));
                                                    }
                                                } else {
                                                    hashMap4 = hashMap5;
                                                    if (!matcher4.matches()) {
                                                        JB.l("TtmlParser", "Ignoring region with unsupported origin: ".concat(h10));
                                                    } else if (h02 == null) {
                                                        JB.l("TtmlParser", "Ignoring region with missing tts:extent: ".concat(h10));
                                                    } else {
                                                        try {
                                                            String group11 = matcher4.group(1);
                                                            if (group11 == null) {
                                                                throw r48;
                                                            }
                                                            int parseInt8 = Integer.parseInt(group11);
                                                            String group12 = matcher4.group(2);
                                                            if (group12 == null) {
                                                                throw r48;
                                                            }
                                                            f = parseInt8 / h02.f1041a;
                                                            parseInt = Integer.parseInt(group12) / h02.f1042b;
                                                            float f92 = f;
                                                            h3 = AbstractC1803xs.h(newPullParser, "extent");
                                                            if (h3 == null) {
                                                            }
                                                        } catch (NumberFormatException unused9) {
                                                            JB.l("TtmlParser", "Ignoring region with malformed origin: ".concat(h10));
                                                        }
                                                    }
                                                }
                                            } else {
                                                str8 = str1222;
                                                hashMap4 = hashMap5;
                                                str9 = str1322;
                                                JB.l("TtmlParser", "Ignoring region without an origin");
                                            }
                                            c1320n2 = r48;
                                        }
                                        if (c1320n2 != null) {
                                            hashMap2 = hashMap3;
                                            hashMap2.put(c1320n2.f14569a, c1320n2);
                                            if (AbstractC1803xs.z(newPullParser, "head")) {
                                                c1230l23 = c1230l24;
                                                arrayDeque = arrayDeque2;
                                            } else {
                                                hashMap3 = hashMap2;
                                                c1230l22 = c1230l24;
                                                str1422 = str7;
                                                str1522 = str6;
                                                str1222 = str8;
                                                str1322 = str9;
                                                hashMap5 = hashMap4;
                                                i14 = 0;
                                            }
                                        }
                                        hashMap2 = hashMap3;
                                        if (AbstractC1803xs.z(newPullParser, "head")) {
                                        }
                                    } else if (AbstractC1803xs.H(newPullParser, str1322)) {
                                        do {
                                            newPullParser.next();
                                            if (AbstractC1803xs.H(newPullParser, str1222) && (h6 = AbstractC1803xs.h(newPullParser, "id")) != null) {
                                                hashMap7.put(h6, newPullParser.nextText());
                                            }
                                        } while (!AbstractC1803xs.z(newPullParser, str1322));
                                    }
                                }
                                str8 = str1222;
                                hashMap4 = hashMap5;
                                str9 = str1322;
                                hashMap2 = hashMap3;
                                if (AbstractC1803xs.z(newPullParser, "head")) {
                                }
                            }
                        } else {
                            C1230l2 c1230l28 = c1230l22;
                            hashMap4 = hashMap5;
                            String str16 = "\\s+";
                            Object obj3 = "style";
                            hashMap2 = hashMap3;
                            try {
                                int attributeCount = newPullParser.getAttributeCount();
                                e3 = e(newPullParser, r48);
                                str3 = str;
                                j5 = -9223372036854775807L;
                                int i22 = 0;
                                j6 = -9223372036854775807L;
                                j7 = -9223372036854775807L;
                                strArr = null;
                                str4 = null;
                                while (i22 < attributeCount) {
                                    try {
                                        String attributeName = newPullParser.getAttributeName(i22);
                                        String attributeValue6 = newPullParser.getAttributeValue(i22);
                                        switch (attributeName.hashCode()) {
                                            case -934795532:
                                                obj = obj3;
                                                if (attributeName.equals("region")) {
                                                    c5 = 4;
                                                    break;
                                                }
                                                c5 = 65535;
                                                break;
                                            case 99841:
                                                obj = obj3;
                                                if (attributeName.equals("dur")) {
                                                    c5 = 2;
                                                    break;
                                                }
                                                c5 = 65535;
                                                break;
                                            case 100571:
                                                obj = obj3;
                                                if (attributeName.equals("end")) {
                                                    c5 = 1;
                                                    break;
                                                }
                                                c5 = 65535;
                                                break;
                                            case 93616297:
                                                obj = obj3;
                                                if (attributeName.equals("begin")) {
                                                    c5 = 0;
                                                    break;
                                                }
                                                c5 = 65535;
                                                break;
                                            case 109780401:
                                                obj = obj3;
                                                if (attributeName.equals(obj)) {
                                                    c5 = 3;
                                                    break;
                                                }
                                                c5 = 65535;
                                                break;
                                            case 1292595405:
                                                if (attributeName.equals("backgroundImage")) {
                                                    c5 = 5;
                                                    obj = obj3;
                                                    break;
                                                }
                                            default:
                                                obj = obj3;
                                                c5 = 65535;
                                                break;
                                        }
                                        if (c5 == 0) {
                                            c1230l23 = c1230l28;
                                            str5 = str16;
                                            j6 = b(attributeValue6, c1230l23);
                                        } else if (c5 == 1) {
                                            c1230l23 = c1230l28;
                                            str5 = str16;
                                            j5 = b(attributeValue6, c1230l23);
                                        } else if (c5 != 2) {
                                            if (c5 == 3) {
                                                try {
                                                    String trim2 = attributeValue6.trim();
                                                    if (trim2.isEmpty()) {
                                                        try {
                                                            split = new String[0];
                                                            str5 = str16;
                                                        } catch (N1 e6) {
                                                            e = e6;
                                                            c1230l23 = c1230l28;
                                                            arrayDeque = arrayDeque2;
                                                            JB.n("TtmlParser", "Suppressing parser error", e);
                                                            c1230l26 = c1230l23;
                                                            h03 = h02;
                                                            i13 = i7;
                                                            c0375o3 = c0375o2;
                                                            hashMap = hashMap4;
                                                            i12 = 1;
                                                            i6 = 1;
                                                            newPullParser.next();
                                                            eventType = newPullParser.getEventType();
                                                            hashMap5 = hashMap;
                                                            hashMap6 = hashMap2;
                                                            arrayDeque3 = arrayDeque;
                                                            i11 = i6;
                                                            str10 = str;
                                                            c1230l25 = c1230l2;
                                                            str11 = str2;
                                                            obj2 = null;
                                                        }
                                                    } else {
                                                        int i23 = AbstractC1260lo.f14419a;
                                                        str5 = str16;
                                                        split = trim2.split(str5, -1);
                                                    }
                                                    if (split.length > 0) {
                                                        strArr = split;
                                                    }
                                                } catch (N1 e7) {
                                                    e = e7;
                                                }
                                            } else if (c5 != 4) {
                                                if (c5 == 5 && attributeValue6.startsWith("#")) {
                                                    str4 = attributeValue6.substring(1);
                                                    c1230l23 = c1230l28;
                                                    str5 = str16;
                                                }
                                                str5 = str16;
                                            } else {
                                                if (hashMap2.containsKey(attributeValue6)) {
                                                    str3 = attributeValue6;
                                                    c1230l23 = c1230l28;
                                                    str5 = str16;
                                                }
                                                str5 = str16;
                                            }
                                            c1230l23 = c1230l28;
                                        } else {
                                            c1230l23 = c1230l28;
                                            str5 = str16;
                                            j7 = b(attributeValue6, c1230l23);
                                        }
                                        try {
                                            i22++;
                                            c1230l28 = c1230l23;
                                            obj3 = obj;
                                            str16 = str5;
                                        } catch (N1 e8) {
                                            e = e8;
                                            arrayDeque = arrayDeque2;
                                            JB.n("TtmlParser", "Suppressing parser error", e);
                                            c1230l26 = c1230l23;
                                            h03 = h02;
                                            i13 = i7;
                                            c0375o3 = c0375o2;
                                            hashMap = hashMap4;
                                            i12 = 1;
                                            i6 = 1;
                                            newPullParser.next();
                                            eventType = newPullParser.getEventType();
                                            hashMap5 = hashMap;
                                            hashMap6 = hashMap2;
                                            arrayDeque3 = arrayDeque;
                                            i11 = i6;
                                            str10 = str;
                                            c1230l25 = c1230l2;
                                            str11 = str2;
                                            obj2 = null;
                                        }
                                    } catch (N1 e9) {
                                        e = e9;
                                        c1230l23 = c1230l28;
                                    }
                                }
                                c1230l23 = c1230l28;
                                if (c1185k2 != null) {
                                    c1185k22 = c1185k2;
                                    long j10 = c1185k22.f14210d;
                                    if (j10 != -9223372036854775807L) {
                                        j6 = j6 != -9223372036854775807L ? j6 + j10 : -9223372036854775807L;
                                        if (j5 != -9223372036854775807L) {
                                            j5 += j10;
                                        } else {
                                            c1185k23 = c1185k22;
                                            j5 = -9223372036854775807L;
                                        }
                                    }
                                    c1185k23 = c1185k22;
                                } else {
                                    c1185k22 = c1185k2;
                                    c1185k23 = null;
                                }
                            } catch (N1 e10) {
                                e = e10;
                                c1230l23 = c1230l28;
                                arrayDeque = arrayDeque2;
                            }
                            try {
                                if (j5 == -9223372036854775807L) {
                                    if (j7 != -9223372036854775807L) {
                                        j5 = j6 + j7;
                                    } else {
                                        if (c1185k23 != null) {
                                            j5 = c1185k23.f14211e;
                                            if (j5 != -9223372036854775807L) {
                                            }
                                        }
                                        j9 = j6;
                                        j8 = -9223372036854775807L;
                                        C1185k2 b3 = C1185k2.b(newPullParser.getName(), j9, j8, e3, strArr, str3, str4, c1185k23);
                                        arrayDeque = arrayDeque2;
                                        arrayDeque.push(b3);
                                        if (c1185k22 != null) {
                                            if (c1185k22.f14217m == null) {
                                                c1185k22.f14217m = new ArrayList();
                                            }
                                            c1185k22.f14217m.add(b3);
                                        }
                                    }
                                }
                                arrayDeque.push(b3);
                                if (c1185k22 != null) {
                                }
                            } catch (N1 e11) {
                                e = e11;
                                JB.n("TtmlParser", "Suppressing parser error", e);
                                c1230l26 = c1230l23;
                                h03 = h02;
                                i13 = i7;
                                c0375o3 = c0375o2;
                                hashMap = hashMap4;
                                i12 = 1;
                                i6 = 1;
                                newPullParser.next();
                                eventType = newPullParser.getEventType();
                                hashMap5 = hashMap;
                                hashMap6 = hashMap2;
                                arrayDeque3 = arrayDeque;
                                i11 = i6;
                                str10 = str;
                                c1230l25 = c1230l2;
                                str11 = str2;
                                obj2 = null;
                            }
                            j8 = j5;
                            j9 = j6;
                            C1185k2 b32 = C1185k2.b(newPullParser.getName(), j9, j8, e3, strArr, str3, str4, c1185k23);
                            arrayDeque = arrayDeque2;
                        }
                        c1230l26 = c1230l23;
                        h03 = h02;
                        i13 = i7;
                        c0375o3 = c0375o2;
                        hashMap = hashMap4;
                    } else {
                        str = str10;
                        str2 = str11;
                        HashMap hashMap8 = hashMap5;
                        hashMap2 = hashMap6;
                        arrayDeque = arrayDeque3;
                        c1230l2 = c1230l25;
                        c0375o = c0375o3;
                        if (eventType == 4) {
                            if (c1185k24 == null) {
                                throw null;
                            }
                            C1185k2 c8 = C1185k2.c(newPullParser.getText());
                            if (c1185k24.f14217m == null) {
                                c1185k24.f14217m = new ArrayList();
                            }
                            c1185k24.f14217m.add(c8);
                        } else if (eventType == 3) {
                            if (newPullParser.getName().equals("tt")) {
                                C1185k2 c1185k25 = (C1185k2) arrayDeque.peek();
                                if (c1185k25 == null) {
                                    throw null;
                                }
                                hashMap = hashMap8;
                                c0375o3 = new C0375o(c1185k25, hashMap, hashMap2, hashMap7);
                            } else {
                                hashMap = hashMap8;
                                c0375o3 = c0375o;
                            }
                            arrayDeque.pop();
                        }
                        hashMap = hashMap8;
                        i6 = 1;
                        c0375o3 = c0375o;
                    }
                    i6 = 1;
                } else {
                    str = str10;
                    str2 = str11;
                    hashMap = hashMap5;
                    hashMap2 = hashMap6;
                    arrayDeque = arrayDeque3;
                    c1230l2 = c1230l25;
                    c0375o = c0375o3;
                    if (eventType == 2) {
                        i6 = 1;
                        i12++;
                        c0375o3 = c0375o;
                    } else {
                        i6 = 1;
                        if (eventType == 3) {
                            i12--;
                        }
                        c0375o3 = c0375o;
                    }
                }
                newPullParser.next();
                eventType = newPullParser.getEventType();
                hashMap5 = hashMap;
                hashMap6 = hashMap2;
                arrayDeque3 = arrayDeque;
                i11 = i6;
                str10 = str;
                c1230l25 = c1230l2;
                str11 = str2;
                obj2 = null;
            }
            C0375o c0375o4 = c0375o3;
            if (c0375o4 != null) {
                return c0375o4;
            }
            throw null;
        } catch (IOException e12) {
            throw new IllegalStateException("Unexpected error when reading input.", e12);
        } catch (XmlPullParserException e13) {
            throw new IllegalStateException("Unable to decode source", e13);
        }
    }

    @Override // com.google.android.gms.internal.ads.P1
    public final void f(byte[] bArr, int i, int i5, Q1 q12) {
        AbstractC1668us.p(a(bArr, i, i5), q12);
    }
}
