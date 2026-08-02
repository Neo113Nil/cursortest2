package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import android.text.Layout;
import io.sentry.MeasurementUnit;
import io.sentry.SentryLogEvent;
import io.sentry.protocol.Geo;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public final class zzaks implements zzajs {
    private final XmlPullParserFactory zzi;
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern zzb = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final Pattern zzf = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzakq zzh = new zzakq(30.0f, 1, 1);

    public zzaks() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.zzi = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e7) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c7, code lost:
    
        if (r13.equals("s") != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static long zzc(String str, zzakq zzakqVar) {
        double d7;
        double d8;
        Matcher matcher = zzc.matcher(str);
        char c3 = 2;
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            long parseLong = Long.parseLong(group) * 3600;
            String group2 = matcher.group(2);
            group2.getClass();
            long parseLong2 = Long.parseLong(group2) * 60;
            String group3 = matcher.group(3);
            group3.getClass();
            double d9 = parseLong + parseLong2;
            double parseLong3 = Long.parseLong(group3);
            String group4 = matcher.group(4);
            double parseDouble = group4 != null ? Double.parseDouble(group4) : 0.0d;
            double d10 = d9 + parseLong3;
            return (long) ((d10 + parseDouble + (matcher.group(5) != null ? Long.parseLong(r13) / zzakqVar.zza : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / zzakqVar.zzb) / zzakqVar.zza : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = zzd.matcher(str);
        if (!matcher2.matches()) {
            throw new zzajo("Malformed time expression: ".concat(String.valueOf(str)));
        }
        String group5 = matcher2.group(1);
        group5.getClass();
        double parseDouble2 = Double.parseDouble(group5);
        String group6 = matcher2.group(2);
        group6.getClass();
        int hashCode = group6.hashCode();
        if (hashCode == 102) {
            if (group6.equals("f")) {
                c3 = 4;
            }
            c3 = 65535;
        } else if (hashCode == 104) {
            if (group6.equals("h")) {
                c3 = 0;
            }
            c3 = 65535;
        } else if (hashCode == 109) {
            if (group6.equals("m")) {
                c3 = 1;
            }
            c3 = 65535;
        } else if (hashCode == 3494) {
            if (group6.equals("ms")) {
                c3 = 3;
            }
            c3 = 65535;
        } else if (hashCode != 115) {
            if (hashCode == 116 && group6.equals("t")) {
                c3 = 5;
            }
            c3 = 65535;
        }
        if (c3 == 0) {
            d7 = 3600.0d;
        } else {
            if (c3 != 1) {
                if (c3 == 3) {
                    d8 = 1000.0d;
                } else {
                    if (c3 != 4) {
                        if (c3 == 5) {
                            d8 = zzakqVar.zzc;
                        }
                        return (long) (parseDouble2 * 1000000.0d);
                    }
                    d8 = zzakqVar.zza;
                }
                parseDouble2 /= d8;
                return (long) (parseDouble2 * 1000000.0d);
            }
            d7 = 60.0d;
        }
        parseDouble2 *= d7;
        return (long) (parseDouble2 * 1000000.0d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static Layout.Alignment zzd(String str) {
        char c3;
        String zza2 = zzfsn.zza(str);
        switch (zza2.hashCode()) {
            case -1364013995:
                if (zza2.equals("center")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case 100571:
                if (zza2.equals("end")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case 3317767:
                if (zza2.equals(RRWebVideoEvent.JsonKeys.LEFT)) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case 108511772:
                if (zza2.equals("right")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case 109757538:
                if (zza2.equals("start")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        if (c3 == 0 || c3 == 1) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (c3 == 2 || c3 == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (c3 != 4) {
            return null;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private static zzakv zze(zzakv zzakvVar) {
        return zzakvVar == null ? new zzakv() : zzakvVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v71 */
    /* JADX WARN: Type inference failed for: r7v9 */
    private static zzakv zzf(XmlPullParser xmlPullParser, zzakv zzakvVar) {
        ?? r7;
        Matcher matcher;
        int attributeCount = xmlPullParser.getAttributeCount();
        boolean z4 = false;
        zzakv zzakvVar2 = zzakvVar;
        int i7 = 0;
        while (i7 < attributeCount) {
            String attributeValue = xmlPullParser.getAttributeValue(i7);
            String attributeName = xmlPullParser.getAttributeName(i7);
            ?? r11 = -1;
            r11 = -1;
            r11 = -1;
            r11 = -1;
            r11 = -1;
            ?? r112 = -1;
            r11 = -1;
            r11 = -1;
            ?? r113 = -1;
            r11 = -1;
            r11 = -1;
            r11 = -1;
            r11 = -1;
            r11 = -1;
            r11 = -1;
            ?? r114 = -1;
            r11 = -1;
            r11 = -1;
            ?? r115 = -1;
            r11 = -1;
            r11 = -1;
            r11 = -1;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        r7 = 6;
                        break;
                    }
                    r7 = -1;
                    break;
                case -1289044182:
                    if (attributeName.equals("extent")) {
                        r7 = 16;
                        break;
                    }
                    r7 = -1;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        r7 = 3;
                        break;
                    }
                    r7 = -1;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        r7 = 7;
                        break;
                    }
                    r7 = -1;
                    break;
                case -1008619738:
                    if (attributeName.equals("origin")) {
                        r7 = 15;
                        break;
                    }
                    r7 = -1;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        r7 = 12;
                        break;
                    }
                    r7 = -1;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        r7 = 5;
                        break;
                    }
                    r7 = -1;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        r7 = z4;
                        break;
                    }
                    r7 = -1;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        r7 = 10;
                        break;
                    }
                    r7 = -1;
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        r7 = 2;
                        break;
                    }
                    r7 = -1;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        r7 = 14;
                        break;
                    }
                    r7 = -1;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        r7 = 9;
                        break;
                    }
                    r7 = -1;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        r7 = 4;
                        break;
                    }
                    r7 = -1;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        r7 = 13;
                        break;
                    }
                    r7 = -1;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        r7 = 11;
                        break;
                    }
                    r7 = -1;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        r7 = 1;
                        break;
                    }
                    r7 = -1;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        r7 = 8;
                        break;
                    }
                    r7 = -1;
                    break;
                default:
                    r7 = -1;
                    break;
            }
            switch (r7) {
                case 0:
                    if (!"style".equals(xmlPullParser.getName())) {
                        break;
                    } else {
                        zzakvVar2 = zze(zzakvVar2);
                        zzakvVar2.zzt(attributeValue);
                        break;
                    }
                case 1:
                    zzakvVar2 = zze(zzakvVar2);
                    try {
                        zzakvVar2.zzm(zzdb.zzb(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        AbstractC0486a1.o(attributeValue, "Failed parsing background value: ", "TtmlParser");
                        break;
                    }
                case 2:
                    zzakvVar2 = zze(zzakvVar2);
                    try {
                        zzakvVar2.zzp(zzdb.zzb(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused2) {
                        AbstractC0486a1.o(attributeValue, "Failed parsing color value: ", "TtmlParser");
                        break;
                    }
                case 3:
                    zzakvVar2 = zze(zzakvVar2);
                    zzakvVar2.zzq(attributeValue);
                    break;
                case 4:
                    try {
                        zzakvVar2 = zze(zzakvVar2);
                        int i8 = zzen.zza;
                        String[] split = attributeValue.split("\\s+", -1);
                        int length = split.length;
                        if (length == 1) {
                            matcher = zze.matcher(attributeValue);
                        } else {
                            if (length != 2) {
                                throw new zzajo("Invalid number of entries for fontSize: " + length + ".");
                            }
                            matcher = zze.matcher(split[1]);
                            zzdq.zzf("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                        }
                        if (!matcher.matches()) {
                            throw new zzajo("Invalid expression for fontSize: '" + attributeValue + "'.");
                        }
                        String group = matcher.group(3);
                        if (group == null) {
                            throw null;
                        }
                        int hashCode = group.hashCode();
                        if (hashCode != 37) {
                            if (hashCode != 3240) {
                                if (hashCode == 3592 && group.equals("px")) {
                                    r11 = 0;
                                }
                            } else if (group.equals("em")) {
                                r11 = 1;
                            }
                        } else if (group.equals("%")) {
                            r11 = 2;
                        }
                        if (r11 == 0) {
                            zzakvVar2.zzs(1);
                        } else if (r11 == 1) {
                            zzakvVar2.zzs(2);
                        } else {
                            if (r11 != 2) {
                                throw new zzajo("Invalid unit for fontSize: '" + group + "'.");
                            }
                            zzakvVar2.zzs(3);
                        }
                        String group2 = matcher.group(1);
                        if (group2 == null) {
                            throw null;
                        }
                        zzakvVar2.zzr(Float.parseFloat(group2));
                        break;
                    } catch (zzajo unused3) {
                        AbstractC0486a1.o(attributeValue, "Failed parsing fontSize value: ", "TtmlParser");
                        break;
                    }
                    break;
                case 5:
                    zzakvVar2 = zze(zzakvVar2);
                    zzakvVar2.zzn("bold".equalsIgnoreCase(attributeValue));
                    break;
                case 6:
                    zzakvVar2 = zze(zzakvVar2);
                    zzakvVar2.zzu("italic".equalsIgnoreCase(attributeValue));
                    break;
                case 7:
                    zzakvVar2 = zze(zzakvVar2);
                    zzakvVar2.zzB(zzd(attributeValue));
                    break;
                case 8:
                    zzakvVar2 = zze(zzakvVar2);
                    zzakvVar2.zzw(zzd(attributeValue));
                    break;
                case 9:
                    String zza2 = zzfsn.zza(attributeValue);
                    int hashCode2 = zza2.hashCode();
                    if (hashCode2 != 96673) {
                        if (hashCode2 == 3387192 && zza2.equals(MeasurementUnit.NONE)) {
                            r115 = z4;
                        }
                    } else if (zza2.equals("all")) {
                        r115 = 1;
                    }
                    if (r115 == 0) {
                        zzakvVar2 = zze(zzakvVar2);
                        zzakvVar2.zzC(z4);
                        break;
                    } else if (r115 == 1) {
                        zzakvVar2 = zze(zzakvVar2);
                        zzakvVar2.zzC(true);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    String zza3 = zzfsn.zza(attributeValue);
                    switch (zza3.hashCode()) {
                        case -618561360:
                            if (zza3.equals("baseContainer")) {
                                r114 = 2;
                                break;
                            }
                            break;
                        case -410956671:
                            if (zza3.equals(RRWebVideoEvent.JsonKeys.CONTAINER)) {
                                r114 = z4;
                                break;
                            }
                            break;
                        case -250518009:
                            if (zza3.equals("delimiter")) {
                                r114 = 5;
                                break;
                            }
                            break;
                        case -136074796:
                            if (zza3.equals("textContainer")) {
                                r114 = 4;
                                break;
                            }
                            break;
                        case 3016401:
                            if (zza3.equals("base")) {
                                r114 = 1;
                                break;
                            }
                            break;
                        case 3556653:
                            if (zza3.equals("text")) {
                                r114 = 3;
                                break;
                            }
                            break;
                    }
                    if (r114 == 0) {
                        zzakvVar2 = zze(zzakvVar2);
                        zzakvVar2.zzz(1);
                        break;
                    } else if (r114 != 1 && r114 != 2) {
                        if (r114 != 3 && r114 != 4) {
                            if (r114 == 5) {
                                zzakvVar2 = zze(zzakvVar2);
                                zzakvVar2.zzz(4);
                                break;
                            } else {
                                break;
                            }
                        } else {
                            zzakvVar2 = zze(zzakvVar2);
                            zzakvVar2.zzz(3);
                            break;
                        }
                    } else {
                        zzakvVar2 = zze(zzakvVar2);
                        zzakvVar2.zzz(2);
                        break;
                    }
                case 11:
                    String zza4 = zzfsn.zza(attributeValue);
                    int hashCode3 = zza4.hashCode();
                    if (hashCode3 != -1392885889) {
                        if (hashCode3 == 92734940 && zza4.equals("after")) {
                            r113 = 1;
                        }
                    } else if (zza4.equals("before")) {
                        r113 = z4;
                    }
                    if (r113 == 0) {
                        zzakvVar2 = zze(zzakvVar2);
                        zzakvVar2.zzy(1);
                        break;
                    } else if (r113 == 1) {
                        zzakvVar2 = zze(zzakvVar2);
                        zzakvVar2.zzy(2);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    String zza5 = zzfsn.zza(attributeValue);
                    switch (zza5.hashCode()) {
                        case -1461280213:
                            if (zza5.equals("nounderline")) {
                                r112 = 3;
                                break;
                            }
                            break;
                        case -1026963764:
                            if (zza5.equals("underline")) {
                                r112 = 2;
                                break;
                            }
                            break;
                        case 913457136:
                            if (zza5.equals("nolinethrough")) {
                                r112 = 1;
                                break;
                            }
                            break;
                        case 1679736913:
                            if (zza5.equals("linethrough")) {
                                r112 = z4;
                                break;
                            }
                            break;
                    }
                    if (r112 == 0) {
                        zzakvVar2 = zze(zzakvVar2);
                        zzakvVar2.zzv(true);
                        break;
                    } else if (r112 == 1) {
                        zzakvVar2 = zze(zzakvVar2);
                        zzakvVar2.zzv(z4);
                        break;
                    } else if (r112 == 2) {
                        zzakvVar2 = zze(zzakvVar2);
                        zzakvVar2.zzE(true);
                        break;
                    } else if (r112 == 3) {
                        zzakvVar2 = zze(zzakvVar2);
                        zzakvVar2.zzE(z4);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    zzakvVar2 = zze(zzakvVar2);
                    zzakvVar2.zzD(zzako.zza(attributeValue));
                    break;
                case 14:
                    zzakv zze2 = zze(zzakvVar2);
                    Matcher matcher2 = zza.matcher(attributeValue);
                    float f7 = Float.MAX_VALUE;
                    if (matcher2.matches()) {
                        try {
                            String group3 = matcher2.group(1);
                            if (group3 == null) {
                                throw null;
                                break;
                            } else {
                                f7 = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group3)));
                            }
                        } catch (NumberFormatException e7) {
                            zzdq.zzg("TtmlParser", "Failed to parse shear: ".concat(String.valueOf(attributeValue)), e7);
                        }
                    } else {
                        AbstractC0486a1.o(attributeValue, "Invalid value for shear: ", "TtmlParser");
                    }
                    zze2.zzA(f7);
                    zzakvVar2 = zze2;
                    break;
                case 15:
                    zzakvVar2 = zze(zzakvVar2);
                    zzakvVar2.zzx(attributeValue);
                    break;
                case 16:
                    zzakvVar2 = zze(zzakvVar2);
                    zzakvVar2.zzo(attributeValue);
                    break;
            }
            i7++;
            z4 = false;
        }
        return zzakvVar2;
    }

    private static String[] zzg(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        int i7 = zzen.zza;
        return trim.split("\\s+", -1);
    }

    @Override // com.google.android.gms.internal.ads.zzajs
    public final void zza(byte[] bArr, int i7, int i8, zzajr zzajrVar, zzdd zzddVar) {
        zzajm.zza(zzb(bArr, i7, i8), zzajrVar, zzddVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:118:0x05e7 A[Catch: IOException -> 0x00a1, XmlPullParserException -> 0x00a5, TryCatch #20 {IOException -> 0x00a1, XmlPullParserException -> 0x00a5, blocks: (B:3:0x0010, B:5:0x006f, B:7:0x0079, B:10:0x0084, B:13:0x0092, B:15:0x009a, B:17:0x00ac, B:20:0x00b8, B:23:0x00cb, B:24:0x00e7, B:26:0x00f5, B:27:0x00fc, B:29:0x0108, B:30:0x0113, B:34:0x01ad, B:38:0x020e, B:41:0x021c, B:43:0x0222, B:45:0x022a, B:47:0x0232, B:49:0x023a, B:51:0x0242, B:53:0x024a, B:55:0x0250, B:57:0x0258, B:59:0x0260, B:61:0x0266, B:63:0x026c, B:65:0x0272, B:67:0x027a, B:70:0x0283, B:72:0x07e9, B:73:0x02b8, B:75:0x02be, B:77:0x02c7, B:79:0x02d6, B:81:0x02e1, B:83:0x02f5, B:85:0x02fb, B:88:0x05f1, B:96:0x0312, B:98:0x031a, B:100:0x0320, B:102:0x0329, B:104:0x0331, B:105:0x0342, B:112:0x035c, B:118:0x05e7, B:120:0x0379, B:122:0x0381, B:124:0x0387, B:126:0x038f, B:128:0x0395, B:132:0x03ac, B:134:0x03b2, B:136:0x03c0, B:137:0x0467, B:139:0x046d, B:141:0x0473, B:143:0x047b, B:145:0x0481, B:149:0x0496, B:151:0x049c, B:153:0x04aa, B:154:0x053d, B:156:0x0545, B:169:0x058b, B:171:0x0593, B:187:0x05da, B:205:0x04bc, B:209:0x04be, B:210:0x04bf, B:213:0x04d1, B:216:0x04db, B:219:0x04e8, B:221:0x04ee, B:224:0x04f5, B:226:0x04fb, B:229:0x050f, B:231:0x0517, B:234:0x0516, B:237:0x0523, B:241:0x03d8, B:244:0x03da, B:246:0x03db, B:247:0x03ec, B:250:0x03f8, B:255:0x0411, B:257:0x0417, B:260:0x041e, B:262:0x0424, B:265:0x0436, B:267:0x043e, B:271:0x043d, B:274:0x0448, B:278:0x0624, B:282:0x0642, B:302:0x069e, B:304:0x06a6, B:309:0x0769, B:311:0x06ba, B:314:0x06c4, B:319:0x06d2, B:323:0x06db, B:324:0x06e3, B:349:0x06fd, B:353:0x0707, B:356:0x0710, B:362:0x0727, B:364:0x0739, B:367:0x0749, B:369:0x074e, B:377:0x072e, B:391:0x01b6, B:393:0x01c2, B:396:0x01cd, B:398:0x01d3, B:400:0x01de, B:403:0x01eb, B:406:0x01ed, B:407:0x01ee, B:408:0x012c, B:411:0x013a, B:414:0x0143, B:416:0x0149, B:419:0x0150, B:421:0x0156, B:426:0x016c, B:429:0x0173, B:431:0x01a4, B:438:0x0198, B:444:0x01a3, B:456:0x0791, B:463:0x07a0, B:466:0x07a4, B:468:0x07ae, B:470:0x07b8, B:473:0x07bf, B:474:0x07c0, B:479:0x07da, B:482:0x07e4, B:487:0x0808), top: B:2:0x0010, inners: #6, #13, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0593 A[Catch: IOException -> 0x00a1, XmlPullParserException -> 0x00a5, TRY_LEAVE, TryCatch #20 {IOException -> 0x00a1, XmlPullParserException -> 0x00a5, blocks: (B:3:0x0010, B:5:0x006f, B:7:0x0079, B:10:0x0084, B:13:0x0092, B:15:0x009a, B:17:0x00ac, B:20:0x00b8, B:23:0x00cb, B:24:0x00e7, B:26:0x00f5, B:27:0x00fc, B:29:0x0108, B:30:0x0113, B:34:0x01ad, B:38:0x020e, B:41:0x021c, B:43:0x0222, B:45:0x022a, B:47:0x0232, B:49:0x023a, B:51:0x0242, B:53:0x024a, B:55:0x0250, B:57:0x0258, B:59:0x0260, B:61:0x0266, B:63:0x026c, B:65:0x0272, B:67:0x027a, B:70:0x0283, B:72:0x07e9, B:73:0x02b8, B:75:0x02be, B:77:0x02c7, B:79:0x02d6, B:81:0x02e1, B:83:0x02f5, B:85:0x02fb, B:88:0x05f1, B:96:0x0312, B:98:0x031a, B:100:0x0320, B:102:0x0329, B:104:0x0331, B:105:0x0342, B:112:0x035c, B:118:0x05e7, B:120:0x0379, B:122:0x0381, B:124:0x0387, B:126:0x038f, B:128:0x0395, B:132:0x03ac, B:134:0x03b2, B:136:0x03c0, B:137:0x0467, B:139:0x046d, B:141:0x0473, B:143:0x047b, B:145:0x0481, B:149:0x0496, B:151:0x049c, B:153:0x04aa, B:154:0x053d, B:156:0x0545, B:169:0x058b, B:171:0x0593, B:187:0x05da, B:205:0x04bc, B:209:0x04be, B:210:0x04bf, B:213:0x04d1, B:216:0x04db, B:219:0x04e8, B:221:0x04ee, B:224:0x04f5, B:226:0x04fb, B:229:0x050f, B:231:0x0517, B:234:0x0516, B:237:0x0523, B:241:0x03d8, B:244:0x03da, B:246:0x03db, B:247:0x03ec, B:250:0x03f8, B:255:0x0411, B:257:0x0417, B:260:0x041e, B:262:0x0424, B:265:0x0436, B:267:0x043e, B:271:0x043d, B:274:0x0448, B:278:0x0624, B:282:0x0642, B:302:0x069e, B:304:0x06a6, B:309:0x0769, B:311:0x06ba, B:314:0x06c4, B:319:0x06d2, B:323:0x06db, B:324:0x06e3, B:349:0x06fd, B:353:0x0707, B:356:0x0710, B:362:0x0727, B:364:0x0739, B:367:0x0749, B:369:0x074e, B:377:0x072e, B:391:0x01b6, B:393:0x01c2, B:396:0x01cd, B:398:0x01d3, B:400:0x01de, B:403:0x01eb, B:406:0x01ed, B:407:0x01ee, B:408:0x012c, B:411:0x013a, B:414:0x0143, B:416:0x0149, B:419:0x0150, B:421:0x0156, B:426:0x016c, B:429:0x0173, B:431:0x01a4, B:438:0x0198, B:444:0x01a3, B:456:0x0791, B:463:0x07a0, B:466:0x07a4, B:468:0x07ae, B:470:0x07b8, B:473:0x07bf, B:474:0x07c0, B:479:0x07da, B:482:0x07e4, B:487:0x0808), top: B:2:0x0010, inners: #6, #13, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x01b6 A[Catch: IOException -> 0x00a1, XmlPullParserException -> 0x00a5, TryCatch #20 {IOException -> 0x00a1, XmlPullParserException -> 0x00a5, blocks: (B:3:0x0010, B:5:0x006f, B:7:0x0079, B:10:0x0084, B:13:0x0092, B:15:0x009a, B:17:0x00ac, B:20:0x00b8, B:23:0x00cb, B:24:0x00e7, B:26:0x00f5, B:27:0x00fc, B:29:0x0108, B:30:0x0113, B:34:0x01ad, B:38:0x020e, B:41:0x021c, B:43:0x0222, B:45:0x022a, B:47:0x0232, B:49:0x023a, B:51:0x0242, B:53:0x024a, B:55:0x0250, B:57:0x0258, B:59:0x0260, B:61:0x0266, B:63:0x026c, B:65:0x0272, B:67:0x027a, B:70:0x0283, B:72:0x07e9, B:73:0x02b8, B:75:0x02be, B:77:0x02c7, B:79:0x02d6, B:81:0x02e1, B:83:0x02f5, B:85:0x02fb, B:88:0x05f1, B:96:0x0312, B:98:0x031a, B:100:0x0320, B:102:0x0329, B:104:0x0331, B:105:0x0342, B:112:0x035c, B:118:0x05e7, B:120:0x0379, B:122:0x0381, B:124:0x0387, B:126:0x038f, B:128:0x0395, B:132:0x03ac, B:134:0x03b2, B:136:0x03c0, B:137:0x0467, B:139:0x046d, B:141:0x0473, B:143:0x047b, B:145:0x0481, B:149:0x0496, B:151:0x049c, B:153:0x04aa, B:154:0x053d, B:156:0x0545, B:169:0x058b, B:171:0x0593, B:187:0x05da, B:205:0x04bc, B:209:0x04be, B:210:0x04bf, B:213:0x04d1, B:216:0x04db, B:219:0x04e8, B:221:0x04ee, B:224:0x04f5, B:226:0x04fb, B:229:0x050f, B:231:0x0517, B:234:0x0516, B:237:0x0523, B:241:0x03d8, B:244:0x03da, B:246:0x03db, B:247:0x03ec, B:250:0x03f8, B:255:0x0411, B:257:0x0417, B:260:0x041e, B:262:0x0424, B:265:0x0436, B:267:0x043e, B:271:0x043d, B:274:0x0448, B:278:0x0624, B:282:0x0642, B:302:0x069e, B:304:0x06a6, B:309:0x0769, B:311:0x06ba, B:314:0x06c4, B:319:0x06d2, B:323:0x06db, B:324:0x06e3, B:349:0x06fd, B:353:0x0707, B:356:0x0710, B:362:0x0727, B:364:0x0739, B:367:0x0749, B:369:0x074e, B:377:0x072e, B:391:0x01b6, B:393:0x01c2, B:396:0x01cd, B:398:0x01d3, B:400:0x01de, B:403:0x01eb, B:406:0x01ed, B:407:0x01ee, B:408:0x012c, B:411:0x013a, B:414:0x0143, B:416:0x0149, B:419:0x0150, B:421:0x0156, B:426:0x016c, B:429:0x0173, B:431:0x01a4, B:438:0x0198, B:444:0x01a3, B:456:0x0791, B:463:0x07a0, B:466:0x07a4, B:468:0x07ae, B:470:0x07b8, B:473:0x07bf, B:474:0x07c0, B:479:0x07da, B:482:0x07e4, B:487:0x0808), top: B:2:0x0010, inners: #6, #13, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x021c A[Catch: IOException -> 0x00a1, XmlPullParserException -> 0x00a5, TRY_ENTER, TryCatch #20 {IOException -> 0x00a1, XmlPullParserException -> 0x00a5, blocks: (B:3:0x0010, B:5:0x006f, B:7:0x0079, B:10:0x0084, B:13:0x0092, B:15:0x009a, B:17:0x00ac, B:20:0x00b8, B:23:0x00cb, B:24:0x00e7, B:26:0x00f5, B:27:0x00fc, B:29:0x0108, B:30:0x0113, B:34:0x01ad, B:38:0x020e, B:41:0x021c, B:43:0x0222, B:45:0x022a, B:47:0x0232, B:49:0x023a, B:51:0x0242, B:53:0x024a, B:55:0x0250, B:57:0x0258, B:59:0x0260, B:61:0x0266, B:63:0x026c, B:65:0x0272, B:67:0x027a, B:70:0x0283, B:72:0x07e9, B:73:0x02b8, B:75:0x02be, B:77:0x02c7, B:79:0x02d6, B:81:0x02e1, B:83:0x02f5, B:85:0x02fb, B:88:0x05f1, B:96:0x0312, B:98:0x031a, B:100:0x0320, B:102:0x0329, B:104:0x0331, B:105:0x0342, B:112:0x035c, B:118:0x05e7, B:120:0x0379, B:122:0x0381, B:124:0x0387, B:126:0x038f, B:128:0x0395, B:132:0x03ac, B:134:0x03b2, B:136:0x03c0, B:137:0x0467, B:139:0x046d, B:141:0x0473, B:143:0x047b, B:145:0x0481, B:149:0x0496, B:151:0x049c, B:153:0x04aa, B:154:0x053d, B:156:0x0545, B:169:0x058b, B:171:0x0593, B:187:0x05da, B:205:0x04bc, B:209:0x04be, B:210:0x04bf, B:213:0x04d1, B:216:0x04db, B:219:0x04e8, B:221:0x04ee, B:224:0x04f5, B:226:0x04fb, B:229:0x050f, B:231:0x0517, B:234:0x0516, B:237:0x0523, B:241:0x03d8, B:244:0x03da, B:246:0x03db, B:247:0x03ec, B:250:0x03f8, B:255:0x0411, B:257:0x0417, B:260:0x041e, B:262:0x0424, B:265:0x0436, B:267:0x043e, B:271:0x043d, B:274:0x0448, B:278:0x0624, B:282:0x0642, B:302:0x069e, B:304:0x06a6, B:309:0x0769, B:311:0x06ba, B:314:0x06c4, B:319:0x06d2, B:323:0x06db, B:324:0x06e3, B:349:0x06fd, B:353:0x0707, B:356:0x0710, B:362:0x0727, B:364:0x0739, B:367:0x0749, B:369:0x074e, B:377:0x072e, B:391:0x01b6, B:393:0x01c2, B:396:0x01cd, B:398:0x01d3, B:400:0x01de, B:403:0x01eb, B:406:0x01ed, B:407:0x01ee, B:408:0x012c, B:411:0x013a, B:414:0x0143, B:416:0x0149, B:419:0x0150, B:421:0x0156, B:426:0x016c, B:429:0x0173, B:431:0x01a4, B:438:0x0198, B:444:0x01a3, B:456:0x0791, B:463:0x07a0, B:466:0x07a4, B:468:0x07ae, B:470:0x07b8, B:473:0x07bf, B:474:0x07c0, B:479:0x07da, B:482:0x07e4, B:487:0x0808), top: B:2:0x0010, inners: #6, #13, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02be A[Catch: IOException -> 0x00a1, XmlPullParserException -> 0x00a5, LOOP:1: B:75:0x02be->B:90:0x05fe, LOOP_START, PHI: r1 r5 r8 r10 r30 r31 r32 r33 r34 r36
      0x02be: PHI (r1v39 com.google.android.gms.internal.ads.zzakq) = (r1v26 com.google.android.gms.internal.ads.zzakq), (r1v102 com.google.android.gms.internal.ads.zzakq) binds: [B:74:0x02bc, B:90:0x05fe] A[DONT_GENERATE, DONT_INLINE]
      0x02be: PHI (r5v12 java.lang.String) = (r5v9 java.lang.String), (r5v43 java.lang.String) binds: [B:74:0x02bc, B:90:0x05fe] A[DONT_GENERATE, DONT_INLINE]
      0x02be: PHI (r8v11 java.lang.String) = (r8v1 java.lang.String), (r8v36 java.lang.String) binds: [B:74:0x02bc, B:90:0x05fe] A[DONT_GENERATE, DONT_INLINE]
      0x02be: PHI (r10v12 java.lang.String) = (r10v4 java.lang.String), (r10v18 java.lang.String) binds: [B:74:0x02bc, B:90:0x05fe] A[DONT_GENERATE, DONT_INLINE]
      0x02be: PHI (r30v7 java.util.HashMap) = (r30v1 java.util.HashMap), (r30v8 java.util.HashMap) binds: [B:74:0x02bc, B:90:0x05fe] A[DONT_GENERATE, DONT_INLINE]
      0x02be: PHI (r31v2 java.lang.String) = (r31v1 java.lang.String), (r31v16 java.lang.String) binds: [B:74:0x02bc, B:90:0x05fe] A[DONT_GENERATE, DONT_INLINE]
      0x02be: PHI (r32v10 java.lang.String) = (r32v7 java.lang.String), (r32v26 java.lang.String) binds: [B:74:0x02bc, B:90:0x05fe] A[DONT_GENERATE, DONT_INLINE]
      0x02be: PHI (r33v4 java.lang.String) = (r33v1 java.lang.String), (r33v23 java.lang.String) binds: [B:74:0x02bc, B:90:0x05fe] A[DONT_GENERATE, DONT_INLINE]
      0x02be: PHI (r34v10 java.util.HashMap) = (r34v7 java.util.HashMap), (r34v22 java.util.HashMap) binds: [B:74:0x02bc, B:90:0x05fe] A[DONT_GENERATE, DONT_INLINE]
      0x02be: PHI (r36v11 java.lang.String) = (r36v1 java.lang.String), (r36v15 java.lang.String) binds: [B:74:0x02bc, B:90:0x05fe] A[DONT_GENERATE, DONT_INLINE], TryCatch #20 {IOException -> 0x00a1, XmlPullParserException -> 0x00a5, blocks: (B:3:0x0010, B:5:0x006f, B:7:0x0079, B:10:0x0084, B:13:0x0092, B:15:0x009a, B:17:0x00ac, B:20:0x00b8, B:23:0x00cb, B:24:0x00e7, B:26:0x00f5, B:27:0x00fc, B:29:0x0108, B:30:0x0113, B:34:0x01ad, B:38:0x020e, B:41:0x021c, B:43:0x0222, B:45:0x022a, B:47:0x0232, B:49:0x023a, B:51:0x0242, B:53:0x024a, B:55:0x0250, B:57:0x0258, B:59:0x0260, B:61:0x0266, B:63:0x026c, B:65:0x0272, B:67:0x027a, B:70:0x0283, B:72:0x07e9, B:73:0x02b8, B:75:0x02be, B:77:0x02c7, B:79:0x02d6, B:81:0x02e1, B:83:0x02f5, B:85:0x02fb, B:88:0x05f1, B:96:0x0312, B:98:0x031a, B:100:0x0320, B:102:0x0329, B:104:0x0331, B:105:0x0342, B:112:0x035c, B:118:0x05e7, B:120:0x0379, B:122:0x0381, B:124:0x0387, B:126:0x038f, B:128:0x0395, B:132:0x03ac, B:134:0x03b2, B:136:0x03c0, B:137:0x0467, B:139:0x046d, B:141:0x0473, B:143:0x047b, B:145:0x0481, B:149:0x0496, B:151:0x049c, B:153:0x04aa, B:154:0x053d, B:156:0x0545, B:169:0x058b, B:171:0x0593, B:187:0x05da, B:205:0x04bc, B:209:0x04be, B:210:0x04bf, B:213:0x04d1, B:216:0x04db, B:219:0x04e8, B:221:0x04ee, B:224:0x04f5, B:226:0x04fb, B:229:0x050f, B:231:0x0517, B:234:0x0516, B:237:0x0523, B:241:0x03d8, B:244:0x03da, B:246:0x03db, B:247:0x03ec, B:250:0x03f8, B:255:0x0411, B:257:0x0417, B:260:0x041e, B:262:0x0424, B:265:0x0436, B:267:0x043e, B:271:0x043d, B:274:0x0448, B:278:0x0624, B:282:0x0642, B:302:0x069e, B:304:0x06a6, B:309:0x0769, B:311:0x06ba, B:314:0x06c4, B:319:0x06d2, B:323:0x06db, B:324:0x06e3, B:349:0x06fd, B:353:0x0707, B:356:0x0710, B:362:0x0727, B:364:0x0739, B:367:0x0749, B:369:0x074e, B:377:0x072e, B:391:0x01b6, B:393:0x01c2, B:396:0x01cd, B:398:0x01d3, B:400:0x01de, B:403:0x01eb, B:406:0x01ed, B:407:0x01ee, B:408:0x012c, B:411:0x013a, B:414:0x0143, B:416:0x0149, B:419:0x0150, B:421:0x0156, B:426:0x016c, B:429:0x0173, B:431:0x01a4, B:438:0x0198, B:444:0x01a3, B:456:0x0791, B:463:0x07a0, B:466:0x07a4, B:468:0x07ae, B:470:0x07b8, B:473:0x07bf, B:474:0x07c0, B:479:0x07da, B:482:0x07e4, B:487:0x0808), top: B:2:0x0010, inners: #6, #13, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x05fe A[LOOP:1: B:75:0x02be->B:90:0x05fe, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x05f7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzajn zzb(byte[] bArr, int i7, int i8) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        ArrayDeque arrayDeque;
        HashMap hashMap;
        String str6;
        HashMap hashMap2;
        XmlPullParser xmlPullParser;
        int i9;
        zzakq zzakqVar;
        HashMap hashMap3;
        String str7;
        HashMap hashMap4;
        String str8;
        String str9;
        String str10;
        zzakq zzakqVar2;
        int i10;
        zzakr zzakrVar;
        HashMap hashMap5;
        zzajo zzajoVar;
        zzakp zzakpVar;
        zzakp zzakpVar2;
        char c3;
        zzakq zzakqVar3;
        String str11;
        String str12;
        float f7;
        float f8;
        String str13;
        float f9;
        float f10;
        float f11;
        int i11;
        String zza2;
        int i12;
        zzakt zzaktVar;
        char c4;
        char c7;
        String zza3;
        zzakv zzakvVar;
        String zza4;
        zzakv zzakvVar2;
        HashMap hashMap6;
        String str14;
        float f12;
        int i13;
        String group;
        String group2;
        boolean z4;
        String zza5;
        String str15 = "Ignoring region with malformed extent: ";
        String str16 = "Ignoring region with missing tts:extent: ";
        String str17 = "Ignoring region with malformed origin: ";
        String str18 = "id";
        String str19 = "image";
        String str20 = "http://www.w3.org/ns/ttml#parameter";
        try {
            XmlPullParser newPullParser = this.zzi.newPullParser();
            HashMap hashMap7 = new HashMap();
            HashMap hashMap8 = new HashMap();
            HashMap hashMap9 = new HashMap();
            hashMap8.put("", new zzakt("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            newPullParser.setInput(new ByteArrayInputStream(bArr, i7, i8), null);
            ArrayDeque arrayDeque2 = new ArrayDeque();
            int eventType = newPullParser.getEventType();
            zzakq zzakqVar4 = zzh;
            zzakw zzakwVar = null;
            zzakr zzakrVar2 = null;
            int i14 = 15;
            int i15 = 0;
            int i16 = 1;
            while (eventType != i16) {
                zzakp zzakpVar3 = (zzakp) arrayDeque2.peek();
                zzakq zzakqVar5 = zzakqVar4;
                if (i15 == 0) {
                    String name = newPullParser.getName();
                    ArrayDeque arrayDeque3 = arrayDeque2;
                    if (eventType == 2) {
                        String str21 = "extent";
                        if ("tt".equals(name)) {
                            String attributeValue = newPullParser.getAttributeValue(str20, RRWebVideoEvent.JsonKeys.FRAME_RATE);
                            int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
                            hashMap3 = hashMap8;
                            String attributeValue2 = newPullParser.getAttributeValue(str20, "frameRateMultiplier");
                            str7 = str15;
                            if (attributeValue2 != null) {
                                int i17 = zzen.zza;
                                str8 = str16;
                                str9 = str17;
                                zzcv.zze(attributeValue2.split(" ", -1).length == 2, "frameRateMultiplier doesn't have 2 parts");
                                f12 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
                            } else {
                                str8 = str16;
                                str9 = str17;
                                f12 = 1.0f;
                            }
                            zzakq zzakqVar6 = zzh;
                            int i18 = zzakqVar6.zzb;
                            String attributeValue3 = newPullParser.getAttributeValue(str20, "subFrameRate");
                            int parseInt2 = attributeValue3 != null ? Integer.parseInt(attributeValue3) : i18;
                            int i19 = zzakqVar6.zzc;
                            String attributeValue4 = newPullParser.getAttributeValue(str20, "tickRate");
                            if (attributeValue4 != null) {
                                i13 = Integer.parseInt(attributeValue4);
                                hashMap4 = hashMap9;
                            } else {
                                hashMap4 = hashMap9;
                                i13 = i19;
                            }
                            zzakq zzakqVar7 = new zzakq(parseInt * f12, parseInt2, i13);
                            String attributeValue5 = newPullParser.getAttributeValue(str20, "cellResolution");
                            if (attributeValue5 != null) {
                                Matcher matcher = zzg.matcher(attributeValue5);
                                if (matcher.matches()) {
                                    try {
                                        group = matcher.group(1);
                                    } catch (NumberFormatException unused) {
                                        zzakqVar5 = zzakqVar7;
                                    }
                                    if (group == null) {
                                        throw null;
                                    }
                                    int parseInt3 = Integer.parseInt(group);
                                    zzakqVar5 = zzakqVar7;
                                    try {
                                        group2 = matcher.group(2);
                                    } catch (NumberFormatException unused2) {
                                        str10 = str18;
                                        str5 = str20;
                                        zzdq.zzf("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                        i14 = 15;
                                        zza5 = zzeo.zza(newPullParser, "extent");
                                        if (zza5 != null) {
                                        }
                                        zzakrVar2 = null;
                                        zzakqVar2 = zzakqVar5;
                                        i10 = i14;
                                        zzakrVar = zzakrVar2;
                                        String str22 = "metadata";
                                        if (!name.equals("tt")) {
                                        }
                                        if ("head".equals(name)) {
                                        }
                                        i14 = i10;
                                        zzakrVar2 = zzakrVar;
                                        hashMap2 = hashMap5;
                                        i9 = 1;
                                        xmlPullParser.next();
                                        eventType = xmlPullParser.getEventType();
                                        i16 = i9;
                                        newPullParser = xmlPullParser;
                                        str15 = str6;
                                        arrayDeque2 = arrayDeque;
                                        str19 = str4;
                                        str20 = str5;
                                        str17 = str2;
                                        hashMap9 = hashMap2;
                                        hashMap8 = hashMap;
                                        str16 = str;
                                        zzakqVar4 = zzakqVar;
                                        str18 = str3;
                                    }
                                    if (group2 == null) {
                                        throw null;
                                    }
                                    int parseInt4 = Integer.parseInt(group2);
                                    if (parseInt3 == 0) {
                                        str5 = str20;
                                        z4 = false;
                                    } else if (parseInt4 != 0) {
                                        str5 = str20;
                                        z4 = true;
                                    } else {
                                        str5 = str20;
                                        parseInt4 = 0;
                                        z4 = false;
                                    }
                                    try {
                                        StringBuilder sb = new StringBuilder();
                                        str10 = str18;
                                        try {
                                            sb.append("Invalid cell resolution ");
                                            sb.append(parseInt3);
                                            sb.append(" ");
                                            sb.append(parseInt4);
                                            zzcv.zze(z4, sb.toString());
                                            i14 = parseInt4;
                                        } catch (NumberFormatException unused3) {
                                            zzdq.zzf("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                            i14 = 15;
                                            zza5 = zzeo.zza(newPullParser, "extent");
                                            if (zza5 != null) {
                                            }
                                            zzakrVar2 = null;
                                            zzakqVar2 = zzakqVar5;
                                            i10 = i14;
                                            zzakrVar = zzakrVar2;
                                            String str222 = "metadata";
                                            if (!name.equals("tt")) {
                                                zzdq.zze("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                                                zzakqVar = zzakqVar2;
                                                i14 = i10;
                                                zzakrVar2 = zzakrVar;
                                                xmlPullParser = newPullParser;
                                                arrayDeque = arrayDeque3;
                                                hashMap = hashMap3;
                                                str = str8;
                                                str2 = str9;
                                                hashMap2 = hashMap4;
                                                str3 = str10;
                                                i9 = 1;
                                                i15 = 1;
                                                str4 = str19;
                                                str6 = str7;
                                                xmlPullParser.next();
                                                eventType = xmlPullParser.getEventType();
                                                i16 = i9;
                                                newPullParser = xmlPullParser;
                                                str15 = str6;
                                                arrayDeque2 = arrayDeque;
                                                str19 = str4;
                                                str20 = str5;
                                                str17 = str2;
                                                hashMap9 = hashMap2;
                                                hashMap8 = hashMap;
                                                str16 = str;
                                                zzakqVar4 = zzakqVar;
                                                str18 = str3;
                                            }
                                            if ("head".equals(name)) {
                                            }
                                            i14 = i10;
                                            zzakrVar2 = zzakrVar;
                                            hashMap2 = hashMap5;
                                            i9 = 1;
                                            xmlPullParser.next();
                                            eventType = xmlPullParser.getEventType();
                                            i16 = i9;
                                            newPullParser = xmlPullParser;
                                            str15 = str6;
                                            arrayDeque2 = arrayDeque;
                                            str19 = str4;
                                            str20 = str5;
                                            str17 = str2;
                                            hashMap9 = hashMap2;
                                            hashMap8 = hashMap;
                                            str16 = str;
                                            zzakqVar4 = zzakqVar;
                                            str18 = str3;
                                        }
                                    } catch (NumberFormatException unused4) {
                                        str10 = str18;
                                    }
                                    zza5 = zzeo.zza(newPullParser, "extent");
                                    if (zza5 != null) {
                                        Matcher matcher2 = zzf.matcher(zza5);
                                        if (matcher2.matches()) {
                                            try {
                                                String group3 = matcher2.group(1);
                                                if (group3 == null) {
                                                    throw null;
                                                }
                                                int parseInt5 = Integer.parseInt(group3);
                                                String group4 = matcher2.group(2);
                                                if (group4 == null) {
                                                    throw null;
                                                }
                                                zzakrVar2 = new zzakr(parseInt5, Integer.parseInt(group4));
                                            } catch (NumberFormatException unused5) {
                                                zzdq.zzf("TtmlParser", "Ignoring malformed tts extent: ".concat(zza5));
                                            }
                                        } else {
                                            zzdq.zzf("TtmlParser", "Ignoring non-pixel tts extent: ".concat(zza5));
                                        }
                                    }
                                    zzakrVar2 = null;
                                } else {
                                    zzdq.zzf("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                }
                            }
                            zzakqVar5 = zzakqVar7;
                            str10 = str18;
                            str5 = str20;
                            i14 = 15;
                            zza5 = zzeo.zza(newPullParser, "extent");
                            if (zza5 != null) {
                            }
                            zzakrVar2 = null;
                        } else {
                            hashMap3 = hashMap8;
                            str7 = str15;
                            hashMap4 = hashMap9;
                            str8 = str16;
                            str9 = str17;
                            str10 = str18;
                            str5 = str20;
                        }
                        zzakqVar2 = zzakqVar5;
                        i10 = i14;
                        zzakrVar = zzakrVar2;
                        String str2222 = "metadata";
                        if (!name.equals("tt") && !name.equals("head") && !name.equals(SentryLogEvent.JsonKeys.BODY) && !name.equals("div") && !name.equals("p") && !name.equals("span") && !name.equals("br") && !name.equals("style") && !name.equals("styling") && !name.equals("layout") && !name.equals(Geo.JsonKeys.REGION) && !name.equals("metadata") && !name.equals(str19) && !name.equals("data") && !name.equals("information")) {
                            zzdq.zze("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                            zzakqVar = zzakqVar2;
                            i14 = i10;
                            zzakrVar2 = zzakrVar;
                            xmlPullParser = newPullParser;
                            arrayDeque = arrayDeque3;
                            hashMap = hashMap3;
                            str = str8;
                            str2 = str9;
                            hashMap2 = hashMap4;
                            str3 = str10;
                            i9 = 1;
                            i15 = 1;
                            str4 = str19;
                            str6 = str7;
                        }
                        if ("head".equals(name)) {
                            while (true) {
                                newPullParser.next();
                                if (zzeo.zzc(newPullParser, "style")) {
                                    String zza6 = zzeo.zza(newPullParser, "style");
                                    zzakv zzf2 = zzf(newPullParser, new zzakv());
                                    if (zza6 != null) {
                                        String[] zzg2 = zzg(zza6);
                                        zzakqVar3 = zzakqVar2;
                                        int i20 = 0;
                                        for (int length = zzg2.length; i20 < length; length = length) {
                                            zzf2.zzl((zzakv) hashMap7.get(zzg2[i20]));
                                            i20++;
                                        }
                                    } else {
                                        zzakqVar3 = zzakqVar2;
                                    }
                                    String zzH = zzf2.zzH();
                                    if (zzH != null) {
                                        hashMap7.put(zzH, zzf2);
                                    }
                                } else {
                                    zzakqVar3 = zzakqVar2;
                                    if (zzeo.zzc(newPullParser, Geo.JsonKeys.REGION)) {
                                        HashMap hashMap10 = hashMap4;
                                        String str23 = str10;
                                        String zza7 = zzeo.zza(newPullParser, str23);
                                        if (zza7 == null) {
                                            str3 = str23;
                                            str11 = str2222;
                                            str = str8;
                                            str2 = str9;
                                            zzaktVar = null;
                                            str4 = str19;
                                            hashMap5 = hashMap10;
                                        } else {
                                            String zza8 = zzeo.zza(newPullParser, "origin");
                                            if (zza8 == null && (zza4 = zzeo.zza(newPullParser, "style")) != null && (zzakvVar2 = (zzakv) hashMap7.get(zza4)) != null) {
                                                zza8 = zzakvVar2.zzI();
                                            }
                                            if (zza8 != null) {
                                                Matcher matcher3 = zzb.matcher(zza8);
                                                str3 = str23;
                                                Matcher matcher4 = zzf.matcher(zza8);
                                                if (matcher3.matches()) {
                                                    str11 = str2222;
                                                    try {
                                                        String group5 = matcher3.group(1);
                                                        if (group5 == null) {
                                                            throw null;
                                                        }
                                                        float parseFloat = Float.parseFloat(group5) / 100.0f;
                                                        String group6 = matcher3.group(2);
                                                        if (group6 == null) {
                                                            throw null;
                                                        }
                                                        f8 = parseFloat;
                                                        f7 = Float.parseFloat(group6) / 100.0f;
                                                        str = str8;
                                                        str12 = str9;
                                                        str4 = str19;
                                                        hashMap5 = hashMap10;
                                                    } catch (NumberFormatException unused6) {
                                                        String str24 = str9;
                                                        zzdq.zzf("TtmlParser", str24.concat(zza8));
                                                        str2 = str24;
                                                        hashMap5 = hashMap10;
                                                        str = str8;
                                                        zzaktVar = null;
                                                        str4 = str19;
                                                    }
                                                } else {
                                                    str11 = str2222;
                                                    str12 = str9;
                                                    if (!matcher4.matches()) {
                                                        hashMap5 = hashMap10;
                                                        str = str8;
                                                        str4 = str19;
                                                        zzdq.zzf("TtmlParser", "Ignoring region with unsupported origin: ".concat(zza8));
                                                    } else if (zzakrVar == null) {
                                                        str = str8;
                                                        zzdq.zzf("TtmlParser", str.concat(zza8));
                                                        str2 = str12;
                                                        str4 = str19;
                                                        hashMap5 = hashMap10;
                                                        str6 = str7;
                                                        zzaktVar = null;
                                                        str13 = str21;
                                                        if (zzaktVar != null) {
                                                            hashMap = hashMap3;
                                                            hashMap.put(zzaktVar.zza, zzaktVar);
                                                        } else {
                                                            hashMap = hashMap3;
                                                        }
                                                        if (zzeo.zzb(newPullParser, "head")) {
                                                        }
                                                    } else {
                                                        str = str8;
                                                        str4 = str19;
                                                        try {
                                                            String group7 = matcher4.group(1);
                                                            if (group7 == null) {
                                                                throw null;
                                                            }
                                                            int parseInt6 = Integer.parseInt(group7);
                                                            hashMap5 = hashMap10;
                                                            try {
                                                                String group8 = matcher4.group(2);
                                                                if (group8 == null) {
                                                                    throw null;
                                                                }
                                                                f7 = Integer.parseInt(group8) / zzakrVar.zzb;
                                                                f8 = parseInt6 / zzakrVar.zza;
                                                            } catch (NumberFormatException unused7) {
                                                                zzdq.zzf("TtmlParser", str12.concat(zza8));
                                                                str2 = str12;
                                                                str6 = str7;
                                                                zzaktVar = null;
                                                                str13 = str21;
                                                                if (zzaktVar != null) {
                                                                }
                                                                if (zzeo.zzb(newPullParser, "head")) {
                                                                }
                                                            }
                                                        } catch (NumberFormatException unused8) {
                                                            hashMap5 = hashMap10;
                                                        }
                                                    }
                                                    str2 = str12;
                                                    str6 = str7;
                                                    zzaktVar = null;
                                                    str13 = str21;
                                                    if (zzaktVar != null) {
                                                    }
                                                    if (zzeo.zzb(newPullParser, "head")) {
                                                    }
                                                }
                                            } else {
                                                str3 = str23;
                                                str11 = str2222;
                                                str = str8;
                                                str12 = str9;
                                                str4 = str19;
                                                hashMap5 = hashMap10;
                                                f7 = 0.0f;
                                                f8 = 0.0f;
                                            }
                                            String zza9 = zzeo.zza(newPullParser, str21);
                                            if (zza9 == null && (zza3 = zzeo.zza(newPullParser, "style")) != null && (zzakvVar = (zzakv) hashMap7.get(zza3)) != null) {
                                                zza9 = zzakvVar.zzF();
                                            }
                                            if (zza9 != null) {
                                                Matcher matcher5 = zzb.matcher(zza9);
                                                str2 = str12;
                                                Matcher matcher6 = zzf.matcher(zza9);
                                                if (matcher5.matches()) {
                                                    try {
                                                        String group9 = matcher5.group(1);
                                                        if (group9 == null) {
                                                            throw null;
                                                        }
                                                        float parseFloat2 = Float.parseFloat(group9) / 100.0f;
                                                        String group10 = matcher5.group(2);
                                                        if (group10 == null) {
                                                            throw null;
                                                        }
                                                        f10 = Float.parseFloat(group10) / 100.0f;
                                                        f9 = parseFloat2;
                                                        str6 = str7;
                                                        str13 = str21;
                                                    } catch (NumberFormatException unused9) {
                                                        str6 = str7;
                                                        zzdq.zzf("TtmlParser", str6.concat(String.valueOf(zza8)));
                                                    }
                                                } else {
                                                    str6 = str7;
                                                    if (!matcher6.matches()) {
                                                        str13 = str21;
                                                        zzdq.zzf("TtmlParser", "Ignoring region with unsupported extent: ".concat(String.valueOf(zza8)));
                                                    } else if (zzakrVar == null) {
                                                        zzdq.zzf("TtmlParser", str.concat(String.valueOf(zza8)));
                                                        str13 = str21;
                                                    } else {
                                                        try {
                                                            String group11 = matcher6.group(1);
                                                            if (group11 == null) {
                                                                throw null;
                                                            }
                                                            int parseInt7 = Integer.parseInt(group11);
                                                            str13 = str21;
                                                            try {
                                                                String group12 = matcher6.group(2);
                                                                if (group12 == null) {
                                                                    throw null;
                                                                }
                                                                f10 = Integer.parseInt(group12) / zzakrVar.zzb;
                                                                f9 = parseInt7 / zzakrVar.zza;
                                                            } catch (NumberFormatException unused10) {
                                                                zzdq.zzf("TtmlParser", str6.concat(String.valueOf(zza8)));
                                                                zzaktVar = null;
                                                                if (zzaktVar != null) {
                                                                }
                                                                if (zzeo.zzb(newPullParser, "head")) {
                                                                }
                                                            }
                                                        } catch (NumberFormatException unused11) {
                                                            str13 = str21;
                                                        }
                                                    }
                                                    zzaktVar = null;
                                                    if (zzaktVar != null) {
                                                    }
                                                    if (zzeo.zzb(newPullParser, "head")) {
                                                    }
                                                }
                                            } else {
                                                str2 = str12;
                                                str6 = str7;
                                                str13 = str21;
                                                f9 = 1.0f;
                                                f10 = 1.0f;
                                            }
                                            String zza10 = zzeo.zza(newPullParser, "displayAlign");
                                            if (zza10 != null) {
                                                String zza11 = zzfsn.zza(zza10);
                                                int hashCode = zza11.hashCode();
                                                if (hashCode != -1364013995) {
                                                    if (hashCode == 92734940 && zza11.equals("after")) {
                                                        c7 = 1;
                                                        if (c7 != 0) {
                                                            f11 = (f10 / 2.0f) + f7;
                                                            i11 = 1;
                                                        } else if (c7 == 1) {
                                                            f11 = f7 + f10;
                                                            i11 = 2;
                                                        }
                                                        float f13 = 1.0f / i10;
                                                        zza2 = zzeo.zza(newPullParser, "writingMode");
                                                        if (zza2 != null) {
                                                            String zza12 = zzfsn.zza(zza2);
                                                            int hashCode2 = zza12.hashCode();
                                                            if (hashCode2 == 3694) {
                                                                if (zza12.equals("tb")) {
                                                                    c4 = 0;
                                                                    if (c4 != 0) {
                                                                    }
                                                                    i12 = 2;
                                                                    zzaktVar = new zzakt(zza7, f8, f11, 0, i11, f9, f10, 1, f13, i12);
                                                                    if (zzaktVar != null) {
                                                                    }
                                                                    if (zzeo.zzb(newPullParser, "head")) {
                                                                    }
                                                                }
                                                                c4 = 65535;
                                                                if (c4 != 0) {
                                                                }
                                                                i12 = 2;
                                                                zzaktVar = new zzakt(zza7, f8, f11, 0, i11, f9, f10, 1, f13, i12);
                                                                if (zzaktVar != null) {
                                                                }
                                                                if (zzeo.zzb(newPullParser, "head")) {
                                                                }
                                                            } else if (hashCode2 != 3553396) {
                                                                if (hashCode2 == 3553576 && zza12.equals("tbrl")) {
                                                                    c4 = 2;
                                                                    if (c4 != 0 || c4 == 1) {
                                                                        i12 = 2;
                                                                    } else if (c4 == 2) {
                                                                        i12 = 1;
                                                                    }
                                                                    zzaktVar = new zzakt(zza7, f8, f11, 0, i11, f9, f10, 1, f13, i12);
                                                                    if (zzaktVar != null) {
                                                                    }
                                                                    if (zzeo.zzb(newPullParser, "head")) {
                                                                    }
                                                                }
                                                                c4 = 65535;
                                                                if (c4 != 0) {
                                                                }
                                                                i12 = 2;
                                                                zzaktVar = new zzakt(zza7, f8, f11, 0, i11, f9, f10, 1, f13, i12);
                                                                if (zzaktVar != null) {
                                                                }
                                                                if (zzeo.zzb(newPullParser, "head")) {
                                                                }
                                                            } else {
                                                                if (zza12.equals("tblr")) {
                                                                    c4 = 1;
                                                                    if (c4 != 0) {
                                                                    }
                                                                    i12 = 2;
                                                                    zzaktVar = new zzakt(zza7, f8, f11, 0, i11, f9, f10, 1, f13, i12);
                                                                    if (zzaktVar != null) {
                                                                    }
                                                                    if (zzeo.zzb(newPullParser, "head")) {
                                                                    }
                                                                }
                                                                c4 = 65535;
                                                                if (c4 != 0) {
                                                                }
                                                                i12 = 2;
                                                                zzaktVar = new zzakt(zza7, f8, f11, 0, i11, f9, f10, 1, f13, i12);
                                                                if (zzaktVar != null) {
                                                                }
                                                                if (zzeo.zzb(newPullParser, "head")) {
                                                                }
                                                            }
                                                        }
                                                        i12 = Integer.MIN_VALUE;
                                                        zzaktVar = new zzakt(zza7, f8, f11, 0, i11, f9, f10, 1, f13, i12);
                                                        if (zzaktVar != null) {
                                                        }
                                                        if (zzeo.zzb(newPullParser, "head")) {
                                                        }
                                                    }
                                                    c7 = 65535;
                                                    if (c7 != 0) {
                                                    }
                                                    float f132 = 1.0f / i10;
                                                    zza2 = zzeo.zza(newPullParser, "writingMode");
                                                    if (zza2 != null) {
                                                    }
                                                    i12 = Integer.MIN_VALUE;
                                                    zzaktVar = new zzakt(zza7, f8, f11, 0, i11, f9, f10, 1, f132, i12);
                                                    if (zzaktVar != null) {
                                                    }
                                                    if (zzeo.zzb(newPullParser, "head")) {
                                                    }
                                                } else {
                                                    if (zza11.equals("center")) {
                                                        c7 = 0;
                                                        if (c7 != 0) {
                                                        }
                                                        float f1322 = 1.0f / i10;
                                                        zza2 = zzeo.zza(newPullParser, "writingMode");
                                                        if (zza2 != null) {
                                                        }
                                                        i12 = Integer.MIN_VALUE;
                                                        zzaktVar = new zzakt(zza7, f8, f11, 0, i11, f9, f10, 1, f1322, i12);
                                                        if (zzaktVar != null) {
                                                        }
                                                        if (zzeo.zzb(newPullParser, "head")) {
                                                        }
                                                    }
                                                    c7 = 65535;
                                                    if (c7 != 0) {
                                                    }
                                                    float f13222 = 1.0f / i10;
                                                    zza2 = zzeo.zza(newPullParser, "writingMode");
                                                    if (zza2 != null) {
                                                    }
                                                    i12 = Integer.MIN_VALUE;
                                                    zzaktVar = new zzakt(zza7, f8, f11, 0, i11, f9, f10, 1, f13222, i12);
                                                    if (zzaktVar != null) {
                                                    }
                                                    if (zzeo.zzb(newPullParser, "head")) {
                                                    }
                                                }
                                            }
                                            f11 = f7;
                                            i11 = 0;
                                            float f132222 = 1.0f / i10;
                                            zza2 = zzeo.zza(newPullParser, "writingMode");
                                            if (zza2 != null) {
                                            }
                                            i12 = Integer.MIN_VALUE;
                                            zzaktVar = new zzakt(zza7, f8, f11, 0, i11, f9, f10, 1, f132222, i12);
                                            if (zzaktVar != null) {
                                            }
                                            if (zzeo.zzb(newPullParser, "head")) {
                                            }
                                        }
                                        str6 = str7;
                                        str13 = str21;
                                        if (zzaktVar != null) {
                                        }
                                        if (zzeo.zzb(newPullParser, "head")) {
                                        }
                                    } else if (zzeo.zzc(newPullParser, str2222)) {
                                        while (true) {
                                            newPullParser.next();
                                            if (zzeo.zzc(newPullParser, str19)) {
                                                str14 = str10;
                                                String zza13 = zzeo.zza(newPullParser, str14);
                                                if (zza13 != null) {
                                                    hashMap6 = hashMap4;
                                                    hashMap6.put(zza13, newPullParser.nextText());
                                                } else {
                                                    hashMap6 = hashMap4;
                                                }
                                            } else {
                                                hashMap6 = hashMap4;
                                                str14 = str10;
                                            }
                                            if (zzeo.zzb(newPullParser, str2222)) {
                                                str3 = str14;
                                                str11 = str2222;
                                                hashMap = hashMap3;
                                                str = str8;
                                                str2 = str9;
                                                str4 = str19;
                                                hashMap5 = hashMap6;
                                                str6 = str7;
                                                str13 = str21;
                                                if (zzeo.zzb(newPullParser, "head")) {
                                                    xmlPullParser = newPullParser;
                                                    zzakqVar = zzakqVar3;
                                                    arrayDeque = arrayDeque3;
                                                } else {
                                                    hashMap3 = hashMap;
                                                    zzakqVar2 = zzakqVar3;
                                                    str2222 = str11;
                                                    str21 = str13;
                                                    str10 = str3;
                                                    str7 = str6;
                                                    str19 = str4;
                                                    hashMap4 = hashMap5;
                                                    str9 = str2;
                                                    str8 = str;
                                                }
                                            } else {
                                                str10 = str14;
                                                hashMap4 = hashMap6;
                                            }
                                        }
                                    }
                                }
                                str11 = str2222;
                                hashMap = hashMap3;
                                str = str8;
                                str2 = str9;
                                hashMap5 = hashMap4;
                                str3 = str10;
                                str4 = str19;
                                str6 = str7;
                                str13 = str21;
                                if (zzeo.zzb(newPullParser, "head")) {
                                }
                            }
                        } else {
                            zzakq zzakqVar8 = zzakqVar2;
                            hashMap = hashMap3;
                            str = str8;
                            str2 = str9;
                            hashMap5 = hashMap4;
                            str3 = str10;
                            str4 = str19;
                            str6 = str7;
                            try {
                                int attributeCount = newPullParser.getAttributeCount();
                                zzakv zzf3 = zzf(newPullParser, null);
                                long j = -9223372036854775807L;
                                String str25 = "";
                                int i21 = 0;
                                long j3 = -9223372036854775807L;
                                long j7 = -9223372036854775807L;
                                long j8 = -9223372036854775807L;
                                String[] strArr = null;
                                String str26 = null;
                                while (i21 < attributeCount) {
                                    try {
                                        String attributeName = newPullParser.getAttributeName(i21);
                                        String attributeValue6 = newPullParser.getAttributeValue(i21);
                                        switch (attributeName.hashCode()) {
                                            case -934795532:
                                                if (attributeName.equals(Geo.JsonKeys.REGION)) {
                                                    c3 = 4;
                                                    break;
                                                }
                                                c3 = 65535;
                                                break;
                                            case 99841:
                                                if (attributeName.equals("dur")) {
                                                    c3 = 2;
                                                    break;
                                                }
                                                c3 = 65535;
                                                break;
                                            case 100571:
                                                if (attributeName.equals("end")) {
                                                    c3 = 1;
                                                    break;
                                                }
                                                c3 = 65535;
                                                break;
                                            case 93616297:
                                                if (attributeName.equals("begin")) {
                                                    c3 = 0;
                                                    break;
                                                }
                                                c3 = 65535;
                                                break;
                                            case 109780401:
                                                if (attributeName.equals("style")) {
                                                    c3 = 3;
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
                                        if (c3 == 0) {
                                            zzakqVar = zzakqVar8;
                                            j7 = zzc(attributeValue6, zzakqVar);
                                        } else if (c3 == 1) {
                                            zzakqVar = zzakqVar8;
                                            j3 = zzc(attributeValue6, zzakqVar);
                                        } else if (c3 != 2) {
                                            if (c3 == 3) {
                                                String[] zzg3 = zzg(attributeValue6);
                                                if (zzg3.length > 0) {
                                                    strArr = zzg3;
                                                }
                                            } else if (c3 != 4) {
                                                if (c3 == 5) {
                                                    try {
                                                        if (attributeValue6.startsWith("#")) {
                                                            str26 = attributeValue6.substring(1);
                                                        }
                                                    } catch (zzajo e7) {
                                                        zzajoVar = e7;
                                                        xmlPullParser = newPullParser;
                                                        zzakqVar = zzakqVar8;
                                                        arrayDeque = arrayDeque3;
                                                        zzdq.zzg("TtmlParser", "Suppressing parser error", zzajoVar);
                                                        i14 = i10;
                                                        zzakrVar2 = zzakrVar;
                                                        hashMap2 = hashMap5;
                                                        i9 = 1;
                                                        i15 = 1;
                                                        xmlPullParser.next();
                                                        eventType = xmlPullParser.getEventType();
                                                        i16 = i9;
                                                        newPullParser = xmlPullParser;
                                                        str15 = str6;
                                                        arrayDeque2 = arrayDeque;
                                                        str19 = str4;
                                                        str20 = str5;
                                                        str17 = str2;
                                                        hashMap9 = hashMap2;
                                                        hashMap8 = hashMap;
                                                        str16 = str;
                                                        zzakqVar4 = zzakqVar;
                                                        str18 = str3;
                                                    }
                                                }
                                            } else if (hashMap.containsKey(attributeValue6)) {
                                                str25 = attributeValue6;
                                            }
                                            zzakqVar = zzakqVar8;
                                        } else {
                                            zzakqVar = zzakqVar8;
                                            try {
                                                j8 = zzc(attributeValue6, zzakqVar);
                                            } catch (zzajo e8) {
                                                e = e8;
                                                zzajoVar = e;
                                                xmlPullParser = newPullParser;
                                                arrayDeque = arrayDeque3;
                                                zzdq.zzg("TtmlParser", "Suppressing parser error", zzajoVar);
                                                i14 = i10;
                                                zzakrVar2 = zzakrVar;
                                                hashMap2 = hashMap5;
                                                i9 = 1;
                                                i15 = 1;
                                                xmlPullParser.next();
                                                eventType = xmlPullParser.getEventType();
                                                i16 = i9;
                                                newPullParser = xmlPullParser;
                                                str15 = str6;
                                                arrayDeque2 = arrayDeque;
                                                str19 = str4;
                                                str20 = str5;
                                                str17 = str2;
                                                hashMap9 = hashMap2;
                                                hashMap8 = hashMap;
                                                str16 = str;
                                                zzakqVar4 = zzakqVar;
                                                str18 = str3;
                                            }
                                        }
                                        i21++;
                                        zzakqVar8 = zzakqVar;
                                    } catch (zzajo e9) {
                                        e = e9;
                                        zzakqVar = zzakqVar8;
                                    }
                                }
                                zzakqVar = zzakqVar8;
                                if (zzakpVar3 != null) {
                                    xmlPullParser = newPullParser;
                                    zzakpVar = zzakpVar3;
                                    try {
                                        long j9 = zzakpVar.zzd;
                                        if (j9 != -9223372036854775807L) {
                                            j7 = j7 != -9223372036854775807L ? j7 + j9 : -9223372036854775807L;
                                            if (j3 != -9223372036854775807L) {
                                                j3 += j9;
                                            } else {
                                                zzakpVar2 = zzakpVar;
                                                j3 = -9223372036854775807L;
                                            }
                                        }
                                        zzakpVar2 = zzakpVar;
                                    } catch (zzajo e10) {
                                        zzajoVar = e10;
                                        arrayDeque = arrayDeque3;
                                        zzdq.zzg("TtmlParser", "Suppressing parser error", zzajoVar);
                                        i14 = i10;
                                        zzakrVar2 = zzakrVar;
                                        hashMap2 = hashMap5;
                                        i9 = 1;
                                        i15 = 1;
                                        xmlPullParser.next();
                                        eventType = xmlPullParser.getEventType();
                                        i16 = i9;
                                        newPullParser = xmlPullParser;
                                        str15 = str6;
                                        arrayDeque2 = arrayDeque;
                                        str19 = str4;
                                        str20 = str5;
                                        str17 = str2;
                                        hashMap9 = hashMap2;
                                        hashMap8 = hashMap;
                                        str16 = str;
                                        zzakqVar4 = zzakqVar;
                                        str18 = str3;
                                    }
                                } else {
                                    xmlPullParser = newPullParser;
                                    zzakpVar = zzakpVar3;
                                    zzakpVar2 = null;
                                }
                                if (j3 != -9223372036854775807L) {
                                    j = j3;
                                } else if (j8 != -9223372036854775807L) {
                                    j = j7 + j8;
                                } else if (zzakpVar2 != null) {
                                    long j10 = zzakpVar2.zze;
                                    if (j10 != -9223372036854775807L) {
                                        j = j10;
                                    }
                                }
                                try {
                                    zzakp zzb2 = zzakp.zzb(xmlPullParser.getName(), j7, j, zzf3, strArr, str25, str26, zzakpVar2);
                                    arrayDeque = arrayDeque3;
                                    try {
                                        arrayDeque.push(zzb2);
                                        if (zzakpVar != null) {
                                            zzakpVar.zzf(zzb2);
                                        }
                                    } catch (zzajo e11) {
                                        e = e11;
                                        zzajoVar = e;
                                        zzdq.zzg("TtmlParser", "Suppressing parser error", zzajoVar);
                                        i14 = i10;
                                        zzakrVar2 = zzakrVar;
                                        hashMap2 = hashMap5;
                                        i9 = 1;
                                        i15 = 1;
                                        xmlPullParser.next();
                                        eventType = xmlPullParser.getEventType();
                                        i16 = i9;
                                        newPullParser = xmlPullParser;
                                        str15 = str6;
                                        arrayDeque2 = arrayDeque;
                                        str19 = str4;
                                        str20 = str5;
                                        str17 = str2;
                                        hashMap9 = hashMap2;
                                        hashMap8 = hashMap;
                                        str16 = str;
                                        zzakqVar4 = zzakqVar;
                                        str18 = str3;
                                    }
                                } catch (zzajo e12) {
                                    e = e12;
                                    arrayDeque = arrayDeque3;
                                    zzajoVar = e;
                                    zzdq.zzg("TtmlParser", "Suppressing parser error", zzajoVar);
                                    i14 = i10;
                                    zzakrVar2 = zzakrVar;
                                    hashMap2 = hashMap5;
                                    i9 = 1;
                                    i15 = 1;
                                    xmlPullParser.next();
                                    eventType = xmlPullParser.getEventType();
                                    i16 = i9;
                                    newPullParser = xmlPullParser;
                                    str15 = str6;
                                    arrayDeque2 = arrayDeque;
                                    str19 = str4;
                                    str20 = str5;
                                    str17 = str2;
                                    hashMap9 = hashMap2;
                                    hashMap8 = hashMap;
                                    str16 = str;
                                    zzakqVar4 = zzakqVar;
                                    str18 = str3;
                                }
                            } catch (zzajo e13) {
                                e = e13;
                                xmlPullParser = newPullParser;
                                zzakqVar = zzakqVar8;
                            }
                        }
                        i14 = i10;
                        zzakrVar2 = zzakrVar;
                        hashMap2 = hashMap5;
                        i9 = 1;
                    } else {
                        str = str16;
                        str2 = str17;
                        str3 = str18;
                        str4 = str19;
                        str5 = str20;
                        arrayDeque = arrayDeque3;
                        hashMap = hashMap8;
                        str6 = str15;
                        hashMap2 = hashMap9;
                        xmlPullParser = newPullParser;
                        if (eventType == 4) {
                            if (zzakpVar3 == null) {
                                throw null;
                            }
                            zzakpVar3.zzf(zzakp.zzc(xmlPullParser.getText()));
                        } else if (eventType == 3) {
                            if (xmlPullParser.getName().equals("tt")) {
                                zzakp zzakpVar4 = (zzakp) arrayDeque.peek();
                                if (zzakpVar4 == null) {
                                    throw null;
                                }
                                zzakwVar = new zzakw(zzakpVar4, hashMap7, hashMap, hashMap2);
                            }
                            arrayDeque.pop();
                            zzakqVar = zzakqVar5;
                            i9 = 1;
                        }
                        i9 = 1;
                        zzakqVar = zzakqVar5;
                    }
                } else {
                    str = str16;
                    str2 = str17;
                    str3 = str18;
                    str4 = str19;
                    str5 = str20;
                    arrayDeque = arrayDeque2;
                    hashMap = hashMap8;
                    str6 = str15;
                    hashMap2 = hashMap9;
                    xmlPullParser = newPullParser;
                    if (eventType == 2) {
                        i9 = 1;
                        i15++;
                        zzakqVar = zzakqVar5;
                    } else {
                        i9 = 1;
                        if (eventType == 3) {
                            i15--;
                            zzakqVar = zzakqVar5;
                        }
                        zzakqVar = zzakqVar5;
                    }
                }
                xmlPullParser.next();
                eventType = xmlPullParser.getEventType();
                i16 = i9;
                newPullParser = xmlPullParser;
                str15 = str6;
                arrayDeque2 = arrayDeque;
                str19 = str4;
                str20 = str5;
                str17 = str2;
                hashMap9 = hashMap2;
                hashMap8 = hashMap;
                str16 = str;
                zzakqVar4 = zzakqVar;
                str18 = str3;
            }
            if (zzakwVar != null) {
                return zzakwVar;
            }
            throw null;
        } catch (IOException e14) {
            throw new IllegalStateException("Unexpected error when reading input.", e14);
        } catch (XmlPullParserException e15) {
            throw new IllegalStateException("Unable to decode source", e15);
        }
    }
}
