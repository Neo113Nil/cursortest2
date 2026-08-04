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

/* JADX INFO: loaded from: classes.dex */
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
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.zzi = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e7) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f2  */
    private static long zzc(String str, zzakq zzakqVar) throws zzajo {
        double d7;
        double d8;
        Matcher matcher = zzc.matcher(str);
        byte b7 = 2;
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            long j = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            long j3 = Long.parseLong(strGroup2) * 60;
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            double d9 = j + j3;
            double d10 = Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d11 = 0.0d;
            double d12 = strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d;
            double d13 = d9 + d10;
            String strGroup5 = matcher.group(5);
            double d14 = strGroup5 != null ? Long.parseLong(strGroup5) / zzakqVar.zza : 0.0d;
            double d15 = d13 + d12;
            String strGroup6 = matcher.group(6);
            if (strGroup6 != null) {
                d11 = (Long.parseLong(strGroup6) / ((double) zzakqVar.zzb)) / ((double) zzakqVar.zza);
            }
            return (long) ((d15 + d14 + d11) * 1000000.0d);
        }
        Matcher matcher2 = zzd.matcher(str);
        if (!matcher2.matches()) {
            throw new zzajo("Malformed time expression: ".concat(String.valueOf(str)));
        }
        String strGroup7 = matcher2.group(1);
        strGroup7.getClass();
        double d16 = Double.parseDouble(strGroup7);
        String strGroup8 = matcher2.group(2);
        strGroup8.getClass();
        int iHashCode = strGroup8.hashCode();
        if (iHashCode != 102) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 3494) {
                        if (iHashCode != 115) {
                            if (iHashCode == 116 && strGroup8.equals("t")) {
                                b7 = 5;
                            } else {
                                b7 = -1;
                            }
                        } else if (!strGroup8.equals("s")) {
                            b7 = -1;
                        }
                    } else if (strGroup8.equals("ms")) {
                        b7 = 3;
                    } else {
                        b7 = -1;
                    }
                } else if (strGroup8.equals("m")) {
                    b7 = 1;
                } else {
                    b7 = -1;
                }
            } else if (strGroup8.equals("h")) {
                b7 = 0;
            } else {
                b7 = -1;
            }
        } else if (strGroup8.equals("f")) {
            b7 = 4;
        } else {
            b7 = -1;
        }
        if (b7 != 0) {
            if (b7 != 1) {
                if (b7 == 3) {
                    d8 = 1000.0d;
                } else if (b7 == 4) {
                    d8 = zzakqVar.zza;
                } else if (b7 == 5) {
                    d8 = zzakqVar.zzc;
                }
                d16 /= d8;
            } else {
                d7 = 60.0d;
            }
            return (long) (d16 * 1000000.0d);
        }
        d7 = 3600.0d;
        d16 *= d7;
        return (long) (d16 * 1000000.0d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    private static Layout.Alignment zzd(String str) {
        byte b7;
        switch (zzfsn.zza(str)) {
            case "center":
                b7 = 4;
                break;
            case "end":
                b7 = 3;
                break;
            case "left":
                b7 = 0;
                break;
            case "right":
                b7 = 2;
                break;
            case "start":
                b7 = 1;
                break;
            default:
                b7 = -1;
                break;
        }
        if (b7 == 0 || b7 == 1) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (b7 == 2 || b7 == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (b7 != 4) {
            return null;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private static zzakv zze(zzakv zzakvVar) {
        return zzakvVar == null ? new zzakv() : zzakvVar;
    }

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
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v87 */
    /* JADX WARN: Type inference failed for: r7v88 */
    /* JADX WARN: Type inference failed for: r7v9 */
    private static zzakv zzf(XmlPullParser xmlPullParser, zzakv zzakvVar) {
        ?? r7;
        Matcher matcher;
        int attributeCount = xmlPullParser.getAttributeCount();
        boolean z4 = false;
        zzakv zzakvVarZze = zzakvVar;
        int i7 = 0;
        while (i7 < attributeCount) {
            String attributeValue = xmlPullParser.getAttributeValue(i7);
            String attributeName = xmlPullParser.getAttributeName(i7);
            ?? r11 = -1;
             = -1;
             = -1;
             = -1;
             = -1;
            ?? r12 = -1;
             = -1;
             = -1;
            ?? r13 = -1;
             = -1;
             = -1;
             = -1;
             = -1;
             = -1;
             = -1;
            ?? r14 = -1;
             = -1;
             = -1;
            ?? r15 = -1;
            r11 = -1;
            r11 = -1;
            r11 = -1;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    r7 = !attributeName.equals("fontStyle") ? -1 : 6;
                    break;
                case -1289044182:
                    r7 = !attributeName.equals("extent") ? -1 : 16;
                    break;
                case -1224696685:
                    r7 = !attributeName.equals("fontFamily") ? -1 : 3;
                    break;
                case -1065511464:
                    r7 = !attributeName.equals("textAlign") ? -1 : 7;
                    break;
                case -1008619738:
                    r7 = !attributeName.equals("origin") ? -1 : 15;
                    break;
                case -879295043:
                    r7 = !attributeName.equals("textDecoration") ? -1 : 12;
                    break;
                case -734428249:
                    r7 = !attributeName.equals("fontWeight") ? -1 : 5;
                    break;
                case 3355:
                    r7 = !attributeName.equals("id") ? -1 : z4;
                    break;
                case 3511770:
                    r7 = !attributeName.equals("ruby") ? -1 : 10;
                    break;
                case 94842723:
                    r7 = !attributeName.equals("color") ? -1 : 2;
                    break;
                case 109403361:
                    r7 = !attributeName.equals("shear") ? -1 : 14;
                    break;
                case 110138194:
                    r7 = !attributeName.equals("textCombine") ? -1 : 9;
                    break;
                case 365601008:
                    r7 = !attributeName.equals("fontSize") ? -1 : 4;
                    break;
                case 921125321:
                    r7 = !attributeName.equals("textEmphasis") ? -1 : 13;
                    break;
                case 1115953443:
                    r7 = !attributeName.equals("rubyPosition") ? -1 : 11;
                    break;
                case 1287124693:
                    r7 = !attributeName.equals("backgroundColor") ? -1 : 1;
                    break;
                case 1754920356:
                    r7 = !attributeName.equals("multiRowAlign") ? -1 : 8;
                    break;
                default:
                    r7 = -1;
                    break;
            }
            switch (r7) {
                case 0:
                    if ("style".equals(xmlPullParser.getName())) {
                        zzakvVarZze = zze(zzakvVarZze);
                        zzakvVarZze.zzt(attributeValue);
                    }
                    break;
                case 1:
                    zzakvVarZze = zze(zzakvVarZze);
                    try {
                        zzakvVarZze.zzm(zzdb.zzb(attributeValue));
                    } catch (IllegalArgumentException unused) {
                        AbstractC0486a1.o(attributeValue, "Failed parsing background value: ", "TtmlParser");
                    }
                    break;
                case 2:
                    zzakvVarZze = zze(zzakvVarZze);
                    try {
                        zzakvVarZze.zzp(zzdb.zzb(attributeValue));
                    } catch (IllegalArgumentException unused2) {
                        AbstractC0486a1.o(attributeValue, "Failed parsing color value: ", "TtmlParser");
                    }
                    break;
                case 3:
                    zzakvVarZze = zze(zzakvVarZze);
                    zzakvVarZze.zzq(attributeValue);
                    break;
                case 4:
                    try {
                        zzakvVarZze = zze(zzakvVarZze);
                        int i8 = zzen.zza;
                        String[] strArrSplit = attributeValue.split("\\s+", -1);
                        int length = strArrSplit.length;
                        if (length == 1) {
                            matcher = zze.matcher(attributeValue);
                        } else {
                            if (length != 2) {
                                throw new zzajo("Invalid number of entries for fontSize: " + length + ".");
                            }
                            matcher = zze.matcher(strArrSplit[1]);
                            zzdq.zzf("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                        }
                        if (!matcher.matches()) {
                            throw new zzajo("Invalid expression for fontSize: '" + attributeValue + "'.");
                        }
                        String strGroup = matcher.group(3);
                        if (strGroup == null) {
                            throw null;
                        }
                        int iHashCode = strGroup.hashCode();
                        if (iHashCode != 37) {
                            if (iHashCode != 3240) {
                                if (iHashCode == 3592 && strGroup.equals("px")) {
                                    r11 = 0;
                                }
                            } else if (strGroup.equals("em")) {
                                r11 = 1;
                            }
                        } else if (strGroup.equals("%")) {
                            r11 = 2;
                        }
                        if (r11 == 0) {
                            zzakvVarZze.zzs(1);
                        } else if (r11 == 1) {
                            zzakvVarZze.zzs(2);
                        } else {
                            if (r11 != 2) {
                                throw new zzajo("Invalid unit for fontSize: '" + strGroup + "'.");
                            }
                            zzakvVarZze.zzs(3);
                        }
                        String strGroup2 = matcher.group(1);
                        if (strGroup2 == null) {
                            throw null;
                        }
                        zzakvVarZze.zzr(Float.parseFloat(strGroup2));
                    } catch (zzajo unused3) {
                        AbstractC0486a1.o(attributeValue, "Failed parsing fontSize value: ", "TtmlParser");
                    }
                    break;
                case 5:
                    zzakvVarZze = zze(zzakvVarZze);
                    zzakvVarZze.zzn("bold".equalsIgnoreCase(attributeValue));
                    break;
                case 6:
                    zzakvVarZze = zze(zzakvVarZze);
                    zzakvVarZze.zzu("italic".equalsIgnoreCase(attributeValue));
                    break;
                case 7:
                    zzakvVarZze = zze(zzakvVarZze);
                    zzakvVarZze.zzB(zzd(attributeValue));
                    break;
                case 8:
                    zzakvVarZze = zze(zzakvVarZze);
                    zzakvVarZze.zzw(zzd(attributeValue));
                    break;
                case 9:
                    String strZza = zzfsn.zza(attributeValue);
                    int iHashCode2 = strZza.hashCode();
                    if (iHashCode2 != 96673) {
                        if (iHashCode2 == 3387192 && strZza.equals(MeasurementUnit.NONE)) {
                            r15 = z4;
                        }
                    } else if (strZza.equals("all")) {
                        r15 = 1;
                    }
                    if (r15 == 0) {
                        zzakvVarZze = zze(zzakvVarZze);
                        zzakvVarZze.zzC(z4);
                    } else if (r15 == 1) {
                        zzakvVarZze = zze(zzakvVarZze);
                        zzakvVarZze.zzC(true);
                    }
                    break;
                case 10:
                    String strZza2 = zzfsn.zza(attributeValue);
                    switch (strZza2.hashCode()) {
                        case -618561360:
                            if (strZza2.equals("baseContainer")) {
                                r14 = 2;
                            }
                            break;
                        case -410956671:
                            if (strZza2.equals(RRWebVideoEvent.JsonKeys.CONTAINER)) {
                                r14 = z4;
                            }
                            break;
                        case -250518009:
                            if (strZza2.equals("delimiter")) {
                                r14 = 5;
                            }
                            break;
                        case -136074796:
                            if (strZza2.equals("textContainer")) {
                                r14 = 4;
                            }
                            break;
                        case 3016401:
                            if (strZza2.equals("base")) {
                                r14 = 1;
                            }
                            break;
                        case 3556653:
                            if (strZza2.equals("text")) {
                                r14 = 3;
                            }
                            break;
                    }
                    if (r14 == 0) {
                        zzakvVarZze = zze(zzakvVarZze);
                        zzakvVarZze.zzz(1);
                    } else if (r14 == 1 || r14 == 2) {
                        zzakvVarZze = zze(zzakvVarZze);
                        zzakvVarZze.zzz(2);
                    } else if (r14 == 3 || r14 == 4) {
                        zzakvVarZze = zze(zzakvVarZze);
                        zzakvVarZze.zzz(3);
                    } else if (r14 == 5) {
                        zzakvVarZze = zze(zzakvVarZze);
                        zzakvVarZze.zzz(4);
                    }
                    break;
                case 11:
                    String strZza3 = zzfsn.zza(attributeValue);
                    int iHashCode3 = strZza3.hashCode();
                    if (iHashCode3 != -1392885889) {
                        if (iHashCode3 == 92734940 && strZza3.equals("after")) {
                            r13 = 1;
                        }
                    } else if (strZza3.equals("before")) {
                        r13 = z4;
                    }
                    if (r13 == 0) {
                        zzakvVarZze = zze(zzakvVarZze);
                        zzakvVarZze.zzy(1);
                    } else if (r13 == 1) {
                        zzakvVarZze = zze(zzakvVarZze);
                        zzakvVarZze.zzy(2);
                    }
                    break;
                case 12:
                    String strZza4 = zzfsn.zza(attributeValue);
                    switch (strZza4.hashCode()) {
                        case -1461280213:
                            if (strZza4.equals("nounderline")) {
                                r12 = 3;
                            }
                            break;
                        case -1026963764:
                            if (strZza4.equals("underline")) {
                                r12 = 2;
                            }
                            break;
                        case 913457136:
                            if (strZza4.equals("nolinethrough")) {
                                r12 = 1;
                            }
                            break;
                        case 1679736913:
                            if (strZza4.equals("linethrough")) {
                                r12 = z4;
                            }
                            break;
                    }
                    if (r12 == 0) {
                        zzakvVarZze = zze(zzakvVarZze);
                        zzakvVarZze.zzv(true);
                    } else if (r12 == 1) {
                        zzakvVarZze = zze(zzakvVarZze);
                        zzakvVarZze.zzv(z4);
                    } else if (r12 == 2) {
                        zzakvVarZze = zze(zzakvVarZze);
                        zzakvVarZze.zzE(true);
                    } else if (r12 == 3) {
                        zzakvVarZze = zze(zzakvVarZze);
                        zzakvVarZze.zzE(z4);
                    }
                    break;
                case 13:
                    zzakvVarZze = zze(zzakvVarZze);
                    zzakvVarZze.zzD(zzako.zza(attributeValue));
                    break;
                case 14:
                    zzakv zzakvVarZze2 = zze(zzakvVarZze);
                    Matcher matcher2 = zza.matcher(attributeValue);
                    float fMin = Float.MAX_VALUE;
                    if (matcher2.matches()) {
                        try {
                            String strGroup3 = matcher2.group(1);
                            if (strGroup3 == null) {
                                throw null;
                            }
                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup3)));
                        } catch (NumberFormatException e7) {
                            zzdq.zzg("TtmlParser", "Failed to parse shear: ".concat(String.valueOf(attributeValue)), e7);
                        }
                    } else {
                        AbstractC0486a1.o(attributeValue, "Invalid value for shear: ", "TtmlParser");
                    }
                    zzakvVarZze2.zzA(fMin);
                    zzakvVarZze = zzakvVarZze2;
                    break;
                case 15:
                    zzakvVarZze = zze(zzakvVarZze);
                    zzakvVarZze.zzx(attributeValue);
                    break;
                case 16:
                    zzakvVarZze = zze(zzakvVarZze);
                    zzakvVarZze.zzo(attributeValue);
                    break;
            }
            i7++;
            z4 = false;
        }
        return zzakvVarZze;
    }

    private static String[] zzg(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return new String[0];
        }
        int i7 = zzen.zza;
        return strTrim.split("\\s+", -1);
    }

    @Override // com.google.android.gms.internal.ads.zzajs
    public final void zza(byte[] bArr, int i7, int i8, zzajr zzajrVar, zzdd zzddVar) {
        zzajm.zza(zzb(bArr, i7, i8), zzajrVar, zzddVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:263:0x056d  */
    /* JADX WARN: Code duplicated, block: B:267:0x0573  */
    /* JADX WARN: Code duplicated, block: B:290:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:296:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:301:0x05e7 A[Catch: IOException -> 0x00a1, XmlPullParserException -> 0x00a5, TryCatch #20 {IOException -> 0x00a1, XmlPullParserException -> 0x00a5, blocks: (B:3:0x0010, B:5:0x006f, B:7:0x0079, B:10:0x0084, B:13:0x0092, B:15:0x009a, B:22:0x00ac, B:25:0x00b8, B:29:0x00cb, B:31:0x00e7, B:33:0x00f5, B:35:0x00fc, B:37:0x0108, B:39:0x0113, B:72:0x01ad, B:92:0x020e, B:95:0x021c, B:97:0x0222, B:99:0x022a, B:101:0x0232, B:103:0x023a, B:105:0x0242, B:107:0x024a, B:109:0x0250, B:111:0x0258, B:113:0x0260, B:115:0x0266, B:117:0x026c, B:119:0x0272, B:121:0x027a, B:124:0x0283, B:437:0x07e9, B:125:0x02b8, B:127:0x02be, B:129:0x02c7, B:131:0x02d6, B:133:0x02e1, B:135:0x02f5, B:137:0x02fb, B:303:0x05f1, B:140:0x0312, B:142:0x031a, B:144:0x0320, B:146:0x0329, B:148:0x0331, B:151:0x0342, B:155:0x035c, B:301:0x05e7, B:160:0x0379, B:162:0x0381, B:164:0x0387, B:166:0x038f, B:168:0x0395, B:171:0x03ac, B:173:0x03b2, B:175:0x03c0, B:205:0x0467, B:207:0x046d, B:209:0x0473, B:211:0x047b, B:213:0x0481, B:216:0x0496, B:218:0x049c, B:220:0x04aa, B:249:0x053d, B:251:0x0545, B:271:0x058b, B:273:0x0593, B:299:0x05da, B:222:0x04bc, B:224:0x04be, B:225:0x04bf, B:228:0x04d1, B:231:0x04db, B:234:0x04e8, B:236:0x04ee, B:238:0x04f5, B:240:0x04fb, B:242:0x050f, B:246:0x0517, B:245:0x0516, B:247:0x0523, B:178:0x03d8, B:180:0x03da, B:181:0x03db, B:182:0x03ec, B:185:0x03f8, B:189:0x0411, B:191:0x0417, B:193:0x041e, B:195:0x0424, B:197:0x0436, B:201:0x043e, B:200:0x043d, B:203:0x0448, B:308:0x0624, B:311:0x0642, B:345:0x069e, B:347:0x06a6, B:410:0x0769, B:353:0x06ba, B:356:0x06c4, B:360:0x06d2, B:363:0x06db, B:364:0x06e3, B:372:0x06fd, B:376:0x0707, B:380:0x0710, B:390:0x0727, B:397:0x0739, B:399:0x0749, B:401:0x074e, B:392:0x072e, B:75:0x01b6, B:77:0x01c2, B:80:0x01cd, B:82:0x01d3, B:84:0x01de, B:86:0x01eb, B:88:0x01ed, B:89:0x01ee, B:43:0x012c, B:46:0x013a, B:49:0x0143, B:51:0x0149, B:53:0x0150, B:55:0x0156, B:61:0x016c, B:63:0x0173, B:71:0x01a4, B:67:0x0198, B:70:0x01a3, B:414:0x0791, B:418:0x07a0, B:421:0x07a4, B:423:0x07ae, B:425:0x07b8, B:427:0x07bf, B:428:0x07c0, B:432:0x07da, B:435:0x07e4, B:441:0x0808), top: B:480:0x0010, inners: #6, #13, #16 }] */
    /* JADX WARN: Code duplicated, block: B:302:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:306:0x05fe A[LOOP:1: B:127:0x02be->B:306:0x05fe, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:332:0x068b  */
    /* JADX WARN: Code duplicated, block: B:501:0x05f7 A[SYNTHETIC] */
    public final zzajn zzb(byte[] bArr, int i7, int i8) {
        String str;
        ArrayDeque arrayDeque;
        HashMap map;
        String str2;
        HashMap map2;
        XmlPullParser xmlPullParser;
        int i9;
        String str3;
        HashMap map3;
        zzajo zzajoVar;
        zzakp zzakpVar;
        zzakp zzakpVar2;
        byte b7;
        float f7;
        float f8;
        String str4;
        float f9;
        float f10;
        float f11;
        int i10;
        int i11;
        zzakt zzaktVar;
        byte b8;
        byte b9;
        String strZza;
        zzakv zzakvVar;
        String strZza2;
        zzakv zzakvVar2;
        HashMap map4;
        String str5;
        float f12;
        boolean z4;
        String str6 = "Ignoring region with malformed extent: ";
        String str7 = "Ignoring region with missing tts:extent: ";
        String str8 = "Ignoring region with malformed origin: ";
        String str9 = "id";
        String str10 = "image";
        String str11 = "http://www.w3.org/ns/ttml#parameter";
        try {
            XmlPullParser xmlPullParserNewPullParser = this.zzi.newPullParser();
            HashMap map5 = new HashMap();
            HashMap map6 = new HashMap();
            HashMap map7 = new HashMap();
            map6.put("", new zzakt("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i7, i8), null);
            ArrayDeque arrayDeque2 = new ArrayDeque();
            int eventType = xmlPullParserNewPullParser.getEventType();
            zzakq zzakqVar = zzh;
            zzakw zzakwVar = null;
            zzakr zzakrVar = null;
            int i12 = 15;
            int i13 = 0;
            int i14 = 1;
            while (eventType != i14) {
                zzakp zzakpVar3 = (zzakp) arrayDeque2.peek();
                zzakq zzakqVar2 = zzakqVar;
                if (i13 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    ArrayDeque arrayDeque3 = arrayDeque2;
                    if (eventType == 2) {
                        String str12 = "extent";
                        if ("tt".equals(name)) {
                            String attributeValue = xmlPullParserNewPullParser.getAttributeValue(str11, RRWebVideoEvent.JsonKeys.FRAME_RATE);
                            int i15 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
                            map = map6;
                            String attributeValue2 = xmlPullParserNewPullParser.getAttributeValue(str11, "frameRateMultiplier");
                            str2 = str6;
                            if (attributeValue2 != null) {
                                int i16 = zzen.zza;
                                String[] strArrSplit = attributeValue2.split(" ", -1);
                                zzcv.zze(strArrSplit.length == 2, "frameRateMultiplier doesn't have 2 parts");
                                f12 = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
                            } else {
                                f12 = 1.0f;
                            }
                            zzakq zzakqVar3 = zzh;
                            int i17 = zzakqVar3.zzb;
                            String attributeValue3 = xmlPullParserNewPullParser.getAttributeValue(str11, "subFrameRate");
                            int i18 = attributeValue3 != null ? Integer.parseInt(attributeValue3) : i17;
                            int i19 = zzakqVar3.zzc;
                            String attributeValue4 = xmlPullParserNewPullParser.getAttributeValue(str11, "tickRate");
                            zzakq zzakqVar4 = new zzakq(i15 * f12, i18, attributeValue4 != null ? Integer.parseInt(attributeValue4) : i19);
                            String attributeValue5 = xmlPullParserNewPullParser.getAttributeValue(str11, "cellResolution");
                            if (attributeValue5 == null) {
                                zzakqVar2 = zzakqVar4;
                                str3 = str9;
                                str11 = str11;
                                i12 = 15;
                            } else {
                                Matcher matcher = zzg.matcher(attributeValue5);
                                if (matcher.matches()) {
                                    try {
                                        String strGroup = matcher.group(1);
                                        if (strGroup == null) {
                                            throw null;
                                        }
                                        int i20 = Integer.parseInt(strGroup);
                                        zzakqVar2 = zzakqVar4;
                                        try {
                                            String strGroup2 = matcher.group(2);
                                            if (strGroup2 == null) {
                                                throw null;
                                            }
                                            int i21 = Integer.parseInt(strGroup2);
                                            if (i20 == 0) {
                                                z4 = false;
                                            } else if (i21 != 0) {
                                                z4 = true;
                                            } else {
                                                i21 = 0;
                                                z4 = false;
                                            }
                                            try {
                                                StringBuilder sb = new StringBuilder();
                                                str3 = str9;
                                                try {
                                                    sb.append("Invalid cell resolution ");
                                                    sb.append(i20);
                                                    sb.append(" ");
                                                    sb.append(i21);
                                                    zzcv.zze(z4, sb.toString());
                                                    i12 = i21;
                                                } catch (NumberFormatException unused) {
                                                    zzdq.zzf("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                                    i12 = 15;
                                                }
                                            } catch (NumberFormatException unused2) {
                                                str3 = str9;
                                            }
                                        } catch (NumberFormatException unused3) {
                                            str3 = str9;
                                            str11 = str11;
                                        }
                                    } catch (NumberFormatException unused4) {
                                        zzakqVar2 = zzakqVar4;
                                    }
                                    str3 = str9;
                                    str11 = str11;
                                    zzdq.zzf("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                    i12 = 15;
                                } else {
                                    zzdq.zzf("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                    zzakqVar2 = zzakqVar4;
                                    str3 = str9;
                                    str11 = str11;
                                    i12 = 15;
                                }
                            }
                            String strZza3 = zzeo.zza(xmlPullParserNewPullParser, "extent");
                            if (strZza3 == null) {
                                zzakrVar = null;
                            } else {
                                Matcher matcher2 = zzf.matcher(strZza3);
                                if (matcher2.matches()) {
                                    try {
                                        String strGroup3 = matcher2.group(1);
                                        if (strGroup3 == null) {
                                            throw null;
                                        }
                                        int i22 = Integer.parseInt(strGroup3);
                                        String strGroup4 = matcher2.group(2);
                                        if (strGroup4 == null) {
                                            throw null;
                                        }
                                        zzakrVar = new zzakr(i22, Integer.parseInt(strGroup4));
                                    } catch (NumberFormatException unused5) {
                                        zzdq.zzf("TtmlParser", "Ignoring malformed tts extent: ".concat(strZza3));
                                        zzakrVar = null;
                                    }
                                } else {
                                    zzdq.zzf("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strZza3));
                                }
                                zzakrVar = null;
                            }
                        } else {
                            map = map6;
                            str2 = str6;
                            map7 = map7;
                            str7 = str7;
                            str8 = str8;
                            str3 = str9;
                            str11 = str11;
                        }
                        zzakq zzakqVar5 = zzakqVar2;
                        int i23 = i12;
                        zzakr zzakrVar2 = zzakrVar;
                        String str13 = "metadata";
                        if (name.equals("tt") || name.equals("head") || name.equals(SentryLogEvent.JsonKeys.BODY) || name.equals("div") || name.equals("p") || name.equals("span") || name.equals("br") || name.equals("style") || name.equals("styling") || name.equals("layout") || name.equals(Geo.JsonKeys.REGION) || name.equals("metadata") || name.equals(str10) || name.equals("data") || name.equals("information")) {
                            if ("head".equals(name)) {
                                while (true) {
                                    xmlPullParserNewPullParser.next();
                                    if (zzeo.zzc(xmlPullParserNewPullParser, "style")) {
                                        String strZza4 = zzeo.zza(xmlPullParserNewPullParser, "style");
                                        zzakv zzakvVarZzf = zzf(xmlPullParserNewPullParser, new zzakv());
                                        if (strZza4 != null) {
                                            String[] strArrZzg = zzg(strZza4);
                                            int i24 = 0;
                                            for (int length = strArrZzg.length; i24 < length; length = length) {
                                                zzakvVarZzf.zzl((zzakv) map5.get(strArrZzg[i24]));
                                                i24++;
                                            }
                                        }
                                        String strZzH = zzakvVarZzf.zzH();
                                        if (strZzH != null) {
                                            map5.put(strZzH, zzakvVarZzf);
                                        }
                                    } else {
                                        zzakqVar5 = zzakqVar5;
                                        if (zzeo.zzc(xmlPullParserNewPullParser, Geo.JsonKeys.REGION)) {
                                            map3 = map7;
                                            String str14 = str3;
                                            String strZza5 = zzeo.zza(xmlPullParserNewPullParser, str14);
                                            if (strZza5 == null) {
                                                str = str14;
                                                str13 = str13;
                                                str8 = str8;
                                                zzaktVar = null;
                                            } else {
                                                String strZza6 = zzeo.zza(xmlPullParserNewPullParser, "origin");
                                                if (strZza6 == null && (strZza2 = zzeo.zza(xmlPullParserNewPullParser, "style")) != null && (zzakvVar2 = (zzakv) map5.get(strZza2)) != null) {
                                                    strZza6 = zzakvVar2.zzI();
                                                }
                                                if (strZza6 != null) {
                                                    Matcher matcher3 = zzb.matcher(strZza6);
                                                    str = str14;
                                                    Matcher matcher4 = zzf.matcher(strZza6);
                                                    if (matcher3.matches()) {
                                                        str13 = str13;
                                                        try {
                                                            String strGroup5 = matcher3.group(1);
                                                            if (strGroup5 == null) {
                                                                throw null;
                                                            }
                                                            float f13 = Float.parseFloat(strGroup5) / 100.0f;
                                                            String strGroup6 = matcher3.group(2);
                                                            if (strGroup6 == null) {
                                                                throw null;
                                                            }
                                                            f8 = f13;
                                                            f7 = Float.parseFloat(strGroup6) / 100.0f;
                                                            str7 = str7;
                                                            str8 = str8;
                                                            str10 = str10;
                                                            map3 = map3;
                                                        } catch (NumberFormatException unused6) {
                                                            String str15 = str8;
                                                            zzdq.zzf("TtmlParser", str15.concat(strZza6));
                                                            str8 = str15;
                                                            zzaktVar = null;
                                                            str4 = str12;
                                                        }
                                                    } else {
                                                        str13 = str13;
                                                        str8 = str8;
                                                        if (!matcher4.matches()) {
                                                            map3 = map3;
                                                            str7 = str7;
                                                            str10 = str10;
                                                            zzdq.zzf("TtmlParser", "Ignoring region with unsupported origin: ".concat(strZza6));
                                                        } else if (zzakrVar2 == null) {
                                                            str7 = str7;
                                                            zzdq.zzf("TtmlParser", str7.concat(strZza6));
                                                            str10 = str10;
                                                            map3 = map3;
                                                            zzaktVar = null;
                                                            str4 = str12;
                                                            if (zzaktVar != null) {
                                                                map = map;
                                                                map.put(zzaktVar.zza, zzaktVar);
                                                            } else {
                                                                map = map;
                                                            }
                                                        } else {
                                                            str7 = str7;
                                                            str10 = str10;
                                                            try {
                                                                String strGroup7 = matcher4.group(1);
                                                                if (strGroup7 == null) {
                                                                    throw null;
                                                                }
                                                                int i25 = Integer.parseInt(strGroup7);
                                                                map3 = map3;
                                                                try {
                                                                    String strGroup8 = matcher4.group(2);
                                                                    if (strGroup8 == null) {
                                                                        throw null;
                                                                    }
                                                                    int i26 = Integer.parseInt(strGroup8);
                                                                    float f14 = i25 / zzakrVar2.zza;
                                                                    f7 = i26 / zzakrVar2.zzb;
                                                                    f8 = f14;
                                                                } catch (NumberFormatException unused7) {
                                                                    zzdq.zzf("TtmlParser", str8.concat(strZza6));
                                                                    zzaktVar = null;
                                                                    str4 = str12;
                                                                }
                                                            } catch (NumberFormatException unused8) {
                                                                map3 = map3;
                                                            }
                                                            zzdq.zzf("TtmlParser", str8.concat(strZza6));
                                                        }
                                                        zzaktVar = null;
                                                        str4 = str12;
                                                        if (zzaktVar != null) {
                                                            map = map;
                                                            map.put(zzaktVar.zza, zzaktVar);
                                                        } else {
                                                            map = map;
                                                        }
                                                    }
                                                } else {
                                                    str = str14;
                                                    str13 = str13;
                                                    str7 = str7;
                                                    str8 = str8;
                                                    str10 = str10;
                                                    map3 = map3;
                                                    f7 = 0.0f;
                                                    f8 = 0.0f;
                                                }
                                                String strZza7 = zzeo.zza(xmlPullParserNewPullParser, str12);
                                                if (strZza7 == null && (strZza = zzeo.zza(xmlPullParserNewPullParser, "style")) != null && (zzakvVar = (zzakv) map5.get(strZza)) != null) {
                                                    strZza7 = zzakvVar.zzF();
                                                }
                                                if (strZza7 != null) {
                                                    Matcher matcher5 = zzb.matcher(strZza7);
                                                    str8 = str8;
                                                    Matcher matcher6 = zzf.matcher(strZza7);
                                                    if (matcher5.matches()) {
                                                        try {
                                                            String strGroup9 = matcher5.group(1);
                                                            if (strGroup9 == null) {
                                                                throw null;
                                                            }
                                                            float f15 = Float.parseFloat(strGroup9) / 100.0f;
                                                            String strGroup10 = matcher5.group(2);
                                                            if (strGroup10 == null) {
                                                                throw null;
                                                            }
                                                            f10 = Float.parseFloat(strGroup10) / 100.0f;
                                                            f9 = f15;
                                                            str2 = str2;
                                                            str4 = str12;
                                                        } catch (NumberFormatException unused9) {
                                                            str2 = str2;
                                                            zzdq.zzf("TtmlParser", str2.concat(String.valueOf(strZza6)));
                                                            str4 = str12;
                                                            zzaktVar = null;
                                                        }
                                                    } else {
                                                        str2 = str2;
                                                        if (!matcher6.matches()) {
                                                            str4 = str12;
                                                            zzdq.zzf("TtmlParser", "Ignoring region with unsupported extent: ".concat(String.valueOf(strZza6)));
                                                        } else if (zzakrVar2 == null) {
                                                            zzdq.zzf("TtmlParser", str7.concat(String.valueOf(strZza6)));
                                                            str4 = str12;
                                                        } else {
                                                            try {
                                                                String strGroup11 = matcher6.group(1);
                                                                if (strGroup11 == null) {
                                                                    throw null;
                                                                }
                                                                int i27 = Integer.parseInt(strGroup11);
                                                                str4 = str12;
                                                                try {
                                                                    String strGroup12 = matcher6.group(2);
                                                                    if (strGroup12 == null) {
                                                                        throw null;
                                                                    }
                                                                    int i28 = Integer.parseInt(strGroup12);
                                                                    float f16 = i27 / zzakrVar2.zza;
                                                                    f10 = i28 / zzakrVar2.zzb;
                                                                    f9 = f16;
                                                                } catch (NumberFormatException unused10) {
                                                                    zzdq.zzf("TtmlParser", str2.concat(String.valueOf(strZza6)));
                                                                    zzaktVar = null;
                                                                }
                                                            } catch (NumberFormatException unused11) {
                                                                str4 = str12;
                                                            }
                                                            zzdq.zzf("TtmlParser", str2.concat(String.valueOf(strZza6)));
                                                        }
                                                        zzaktVar = null;
                                                        if (zzaktVar != null) {
                                                            map = map;
                                                            map.put(zzaktVar.zza, zzaktVar);
                                                        } else {
                                                            map = map;
                                                        }
                                                    }
                                                } else {
                                                    str8 = str8;
                                                    str2 = str2;
                                                    str4 = str12;
                                                    f9 = 1.0f;
                                                    f10 = 1.0f;
                                                }
                                                String strZza8 = zzeo.zza(xmlPullParserNewPullParser, "displayAlign");
                                                if (strZza8 != null) {
                                                    String strZza9 = zzfsn.zza(strZza8);
                                                    int iHashCode = strZza9.hashCode();
                                                    if (iHashCode != -1364013995) {
                                                        if (iHashCode == 92734940 && strZza9.equals("after")) {
                                                            b9 = 1;
                                                        } else {
                                                            b9 = -1;
                                                        }
                                                    } else if (strZza9.equals("center")) {
                                                        b9 = 0;
                                                    } else {
                                                        b9 = -1;
                                                    }
                                                    if (b9 == 0) {
                                                        f11 = (f10 / 2.0f) + f7;
                                                        i10 = 1;
                                                    } else if (b9 != 1) {
                                                        f11 = f7;
                                                        i10 = 0;
                                                    } else {
                                                        f11 = f7 + f10;
                                                        i10 = 2;
                                                    }
                                                } else {
                                                    f11 = f7;
                                                    i10 = 0;
                                                }
                                                float f17 = 1.0f / i23;
                                                String strZza10 = zzeo.zza(xmlPullParserNewPullParser, "writingMode");
                                                if (strZza10 != null) {
                                                    String strZza11 = zzfsn.zza(strZza10);
                                                    int iHashCode2 = strZza11.hashCode();
                                                    if (iHashCode2 != 3694) {
                                                        if (iHashCode2 != 3553396) {
                                                            if (iHashCode2 == 3553576 && strZza11.equals("tbrl")) {
                                                                b8 = 2;
                                                            } else {
                                                                b8 = -1;
                                                            }
                                                        } else if (strZza11.equals("tblr")) {
                                                            b8 = 1;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                    } else if (strZza11.equals("tb")) {
                                                        b8 = 0;
                                                    } else {
                                                        b8 = -1;
                                                    }
                                                    if (b8 == 0 || b8 == 1) {
                                                        i11 = 2;
                                                    } else if (b8 != 2) {
                                                        i11 = Integer.MIN_VALUE;
                                                    } else {
                                                        i11 = 1;
                                                    }
                                                } else {
                                                    i11 = Integer.MIN_VALUE;
                                                }
                                                zzaktVar = new zzakt(strZza5, f8, f11, 0, i10, f9, f10, 1, f17, i11);
                                                if (zzaktVar != null) {
                                                    map = map;
                                                    map.put(zzaktVar.zza, zzaktVar);
                                                } else {
                                                    map = map;
                                                }
                                            }
                                            str4 = str12;
                                            if (zzaktVar != null) {
                                                map = map;
                                                map.put(zzaktVar.zza, zzaktVar);
                                            } else {
                                                map = map;
                                            }
                                        } else {
                                            if (zzeo.zzc(xmlPullParserNewPullParser, str13)) {
                                                while (true) {
                                                    xmlPullParserNewPullParser.next();
                                                    if (zzeo.zzc(xmlPullParserNewPullParser, str10)) {
                                                        str5 = str3;
                                                        String strZza12 = zzeo.zza(xmlPullParserNewPullParser, str5);
                                                        if (strZza12 != null) {
                                                            map4 = map7;
                                                            map4.put(strZza12, xmlPullParserNewPullParser.nextText());
                                                        } else {
                                                            map4 = map7;
                                                        }
                                                    } else {
                                                        map4 = map7;
                                                        str5 = str3;
                                                    }
                                                    if (zzeo.zzb(xmlPullParserNewPullParser, str13)) {
                                                        str = str5;
                                                        map3 = map4;
                                                    } else {
                                                        str3 = str5;
                                                        map7 = map4;
                                                    }
                                                }
                                            }
                                            str2 = str2;
                                            str4 = str12;
                                        }
                                        if (zzeo.zzb(xmlPullParserNewPullParser, "head")) {
                                            xmlPullParser = xmlPullParserNewPullParser;
                                            zzakqVar2 = zzakqVar5;
                                            arrayDeque = arrayDeque3;
                                        } else {
                                            map = map;
                                            zzakqVar5 = zzakqVar5;
                                            str13 = str13;
                                            str12 = str4;
                                            str3 = str;
                                            str2 = str2;
                                            str10 = str10;
                                            map7 = map3;
                                            str8 = str8;
                                            str7 = str7;
                                        }
                                    }
                                    map3 = map7;
                                    str = str3;
                                    str2 = str2;
                                    str4 = str12;
                                    if (zzeo.zzb(xmlPullParserNewPullParser, "head")) {
                                        xmlPullParser = xmlPullParserNewPullParser;
                                        zzakqVar2 = zzakqVar5;
                                        arrayDeque = arrayDeque3;
                                    } else {
                                        map = map;
                                        zzakqVar5 = zzakqVar5;
                                        str13 = str13;
                                        str12 = str4;
                                        str3 = str;
                                        str2 = str2;
                                        str10 = str10;
                                        map7 = map3;
                                        str8 = str8;
                                        str7 = str7;
                                    }
                                }
                            } else {
                                zzakq zzakqVar6 = zzakqVar5;
                                map = map;
                                str7 = str7;
                                str8 = str8;
                                map3 = map7;
                                str = str3;
                                str10 = str10;
                                str2 = str2;
                                try {
                                    int attributeCount = xmlPullParserNewPullParser.getAttributeCount();
                                    zzakv zzakvVarZzf2 = zzf(xmlPullParserNewPullParser, null);
                                    long j = -9223372036854775807L;
                                    String str16 = "";
                                    int i29 = 0;
                                    long jZzc = -9223372036854775807L;
                                    long jZzc2 = -9223372036854775807L;
                                    long jZzc3 = -9223372036854775807L;
                                    String[] strArr = null;
                                    String strSubstring = null;
                                    while (i29 < attributeCount) {
                                        try {
                                            String attributeName = xmlPullParserNewPullParser.getAttributeName(i29);
                                            String attributeValue6 = xmlPullParserNewPullParser.getAttributeValue(i29);
                                            switch (attributeName) {
                                                case "region":
                                                    b7 = 4;
                                                    break;
                                                case "dur":
                                                    b7 = 2;
                                                    break;
                                                case "end":
                                                    b7 = 1;
                                                    break;
                                                case "begin":
                                                    b7 = 0;
                                                    break;
                                                case "style":
                                                    b7 = 3;
                                                    break;
                                                case "backgroundImage":
                                                    b7 = 5;
                                                    break;
                                                default:
                                                    b7 = -1;
                                                    break;
                                            }
                                            if (b7 == 0) {
                                                zzakqVar2 = zzakqVar6;
                                                jZzc2 = zzc(attributeValue6, zzakqVar2);
                                            } else if (b7 == 1) {
                                                zzakqVar2 = zzakqVar6;
                                                jZzc = zzc(attributeValue6, zzakqVar2);
                                            } else if (b7 != 2) {
                                                if (b7 == 3) {
                                                    String[] strArrZzg2 = zzg(attributeValue6);
                                                    if (strArrZzg2.length > 0) {
                                                        strArr = strArrZzg2;
                                                    }
                                                } else if (b7 != 4) {
                                                    if (b7 == 5) {
                                                        try {
                                                            if (attributeValue6.startsWith("#")) {
                                                                strSubstring = attributeValue6.substring(1);
                                                            }
                                                        } catch (zzajo e7) {
                                                            zzajoVar = e7;
                                                            xmlPullParser = xmlPullParserNewPullParser;
                                                            zzakqVar2 = zzakqVar6;
                                                            arrayDeque = arrayDeque3;
                                                            zzdq.zzg("TtmlParser", "Suppressing parser error", zzajoVar);
                                                            i12 = i23;
                                                            zzakrVar = zzakrVar2;
                                                            map2 = map3;
                                                            i9 = 1;
                                                            i13 = 1;
                                                            xmlPullParser.next();
                                                            eventType = xmlPullParser.getEventType();
                                                            i14 = i9;
                                                            xmlPullParserNewPullParser = xmlPullParser;
                                                            str6 = str2;
                                                            arrayDeque2 = arrayDeque;
                                                            str10 = str10;
                                                            str11 = str11;
                                                            str8 = str8;
                                                            map7 = map2;
                                                            map6 = map;
                                                            str7 = str7;
                                                            zzakqVar = zzakqVar2;
                                                            str9 = str;
                                                        }
                                                    }
                                                } else if (map.containsKey(attributeValue6)) {
                                                    str16 = attributeValue6;
                                                }
                                                zzakqVar2 = zzakqVar6;
                                            } else {
                                                zzakqVar2 = zzakqVar6;
                                                try {
                                                    jZzc3 = zzc(attributeValue6, zzakqVar2);
                                                } catch (zzajo e8) {
                                                    e = e8;
                                                    zzajoVar = e;
                                                    xmlPullParser = xmlPullParserNewPullParser;
                                                    arrayDeque = arrayDeque3;
                                                    zzdq.zzg("TtmlParser", "Suppressing parser error", zzajoVar);
                                                    i12 = i23;
                                                    zzakrVar = zzakrVar2;
                                                    map2 = map3;
                                                    i9 = 1;
                                                    i13 = 1;
                                                    xmlPullParser.next();
                                                    eventType = xmlPullParser.getEventType();
                                                    i14 = i9;
                                                    xmlPullParserNewPullParser = xmlPullParser;
                                                    str6 = str2;
                                                    arrayDeque2 = arrayDeque;
                                                    str10 = str10;
                                                    str11 = str11;
                                                    str8 = str8;
                                                    map7 = map2;
                                                    map6 = map;
                                                    str7 = str7;
                                                    zzakqVar = zzakqVar2;
                                                    str9 = str;
                                                }
                                            }
                                            i29++;
                                            zzakqVar6 = zzakqVar2;
                                        } catch (zzajo e9) {
                                            e = e9;
                                            zzakqVar2 = zzakqVar6;
                                        }
                                    }
                                    zzakqVar2 = zzakqVar6;
                                    if (zzakpVar3 != null) {
                                        xmlPullParser = xmlPullParserNewPullParser;
                                        zzakpVar = zzakpVar3;
                                        try {
                                            long j3 = zzakpVar.zzd;
                                            if (j3 == -9223372036854775807L) {
                                                zzakpVar2 = zzakpVar;
                                            } else {
                                                jZzc2 = jZzc2 != -9223372036854775807L ? jZzc2 + j3 : -9223372036854775807L;
                                                if (jZzc != -9223372036854775807L) {
                                                    jZzc += j3;
                                                    zzakpVar2 = zzakpVar;
                                                } else {
                                                    zzakpVar2 = zzakpVar;
                                                    jZzc = -9223372036854775807L;
                                                }
                                            }
                                        } catch (zzajo e10) {
                                            zzajoVar = e10;
                                            arrayDeque = arrayDeque3;
                                            zzdq.zzg("TtmlParser", "Suppressing parser error", zzajoVar);
                                            i12 = i23;
                                            zzakrVar = zzakrVar2;
                                            map2 = map3;
                                            i9 = 1;
                                            i13 = 1;
                                        }
                                    } else {
                                        xmlPullParser = xmlPullParserNewPullParser;
                                        zzakpVar = zzakpVar3;
                                        zzakpVar2 = null;
                                    }
                                    if (jZzc != -9223372036854775807L) {
                                        j = jZzc;
                                    } else if (jZzc3 != -9223372036854775807L) {
                                        j = jZzc2 + jZzc3;
                                    } else if (zzakpVar2 != null) {
                                        long j7 = zzakpVar2.zze;
                                        if (j7 != -9223372036854775807L) {
                                            j = j7;
                                        }
                                    }
                                    try {
                                        zzakp zzakpVarZzb = zzakp.zzb(xmlPullParser.getName(), jZzc2, j, zzakvVarZzf2, strArr, str16, strSubstring, zzakpVar2);
                                        arrayDeque = arrayDeque3;
                                        try {
                                            arrayDeque.push(zzakpVarZzb);
                                            if (zzakpVar != null) {
                                                zzakpVar.zzf(zzakpVarZzb);
                                            }
                                        } catch (zzajo e11) {
                                            e = e11;
                                            zzajoVar = e;
                                            zzdq.zzg("TtmlParser", "Suppressing parser error", zzajoVar);
                                            i12 = i23;
                                            zzakrVar = zzakrVar2;
                                            map2 = map3;
                                            i9 = 1;
                                            i13 = 1;
                                        }
                                    } catch (zzajo e12) {
                                        e = e12;
                                        arrayDeque = arrayDeque3;
                                        zzajoVar = e;
                                        zzdq.zzg("TtmlParser", "Suppressing parser error", zzajoVar);
                                        i12 = i23;
                                        zzakrVar = zzakrVar2;
                                        map2 = map3;
                                        i9 = 1;
                                        i13 = 1;
                                        xmlPullParser.next();
                                        eventType = xmlPullParser.getEventType();
                                        i14 = i9;
                                        xmlPullParserNewPullParser = xmlPullParser;
                                        str6 = str2;
                                        arrayDeque2 = arrayDeque;
                                        str10 = str10;
                                        str11 = str11;
                                        str8 = str8;
                                        map7 = map2;
                                        map6 = map;
                                        str7 = str7;
                                        zzakqVar = zzakqVar2;
                                        str9 = str;
                                    }
                                } catch (zzajo e13) {
                                    e = e13;
                                    xmlPullParser = xmlPullParserNewPullParser;
                                    zzakqVar2 = zzakqVar6;
                                }
                            }
                            i12 = i23;
                            zzakrVar = zzakrVar2;
                            map2 = map3;
                            i9 = 1;
                        } else {
                            zzdq.zze("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            zzakqVar2 = zzakqVar5;
                            i12 = i23;
                            zzakrVar = zzakrVar2;
                            xmlPullParser = xmlPullParserNewPullParser;
                            arrayDeque = arrayDeque3;
                            map = map;
                            str7 = str7;
                            str8 = str8;
                            map2 = map7;
                            str = str3;
                            i9 = 1;
                            i13 = 1;
                            str10 = str10;
                            str2 = str2;
                        }
                    } else {
                        str7 = str7;
                        str8 = str8;
                        str = str9;
                        str10 = str10;
                        str11 = str11;
                        arrayDeque = arrayDeque3;
                        map = map6;
                        str2 = str6;
                        map2 = map7;
                        xmlPullParser = xmlPullParserNewPullParser;
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
                                zzakwVar = new zzakw(zzakpVar4, map5, map, map2);
                            }
                            arrayDeque.pop();
                            i9 = 1;
                        }
                        i9 = 1;
                        zzakqVar2 = zzakqVar2;
                    }
                } else {
                    str7 = str7;
                    str8 = str8;
                    str = str9;
                    str10 = str10;
                    str11 = str11;
                    arrayDeque = arrayDeque2;
                    map = map6;
                    str2 = str6;
                    map2 = map7;
                    xmlPullParser = xmlPullParserNewPullParser;
                    if (eventType == 2) {
                        i9 = 1;
                        i13++;
                    } else {
                        i9 = 1;
                        if (eventType == 3) {
                            i13--;
                        }
                        zzakqVar2 = zzakqVar2;
                    }
                }
                xmlPullParser.next();
                eventType = xmlPullParser.getEventType();
                i14 = i9;
                xmlPullParserNewPullParser = xmlPullParser;
                str6 = str2;
                arrayDeque2 = arrayDeque;
                str10 = str10;
                str11 = str11;
                str8 = str8;
                map7 = map2;
                map6 = map;
                str7 = str7;
                zzakqVar = zzakqVar2;
                str9 = str;
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
