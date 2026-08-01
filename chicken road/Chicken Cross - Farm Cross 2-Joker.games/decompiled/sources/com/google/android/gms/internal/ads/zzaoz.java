package com.google.android.gms.internal.ads;

import android.text.Layout;
import com.facebook.appevents.UserDataStore;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import io.ktor.sse.ServerSentEventKt;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzaoz implements zzanz {
    private final XmlPullParserFactory zzi;
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern zzb = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final Pattern zzf = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzaox zzh = new zzaox(30.0f, 1, 1);

    private static String[] zzc(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        String str2 = zzfm.zza;
        return trim.split("\\s+", -1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v45 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v75 */
    /* JADX WARN: Type inference failed for: r6v9 */
    private static zzapc zzd(XmlPullParser xmlPullParser, zzapc zzapcVar) {
        ?? r6;
        Matcher matcher;
        char c;
        int attributeCount = xmlPullParser.getAttributeCount();
        boolean z = false;
        zzapc zzapcVar2 = zzapcVar;
        int i = 0;
        while (i < attributeCount) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            ?? r10 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            ?? r102 = -1;
            r10 = -1;
            r10 = -1;
            ?? r103 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            ?? r104 = -1;
            r10 = -1;
            r10 = -1;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        r6 = 6;
                        break;
                    }
                    r6 = -1;
                    break;
                case -1289044182:
                    if (attributeName.equals("extent")) {
                        r6 = 16;
                        break;
                    }
                    r6 = -1;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        r6 = 3;
                        break;
                    }
                    r6 = -1;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        r6 = 7;
                        break;
                    }
                    r6 = -1;
                    break;
                case -1008619738:
                    if (attributeName.equals("origin")) {
                        r6 = 15;
                        break;
                    }
                    r6 = -1;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        r6 = 12;
                        break;
                    }
                    r6 = -1;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        r6 = 5;
                        break;
                    }
                    r6 = -1;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        r6 = z;
                        break;
                    }
                    r6 = -1;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        r6 = 10;
                        break;
                    }
                    r6 = -1;
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        r6 = 2;
                        break;
                    }
                    r6 = -1;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        r6 = 14;
                        break;
                    }
                    r6 = -1;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        r6 = 9;
                        break;
                    }
                    r6 = -1;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        r6 = 4;
                        break;
                    }
                    r6 = -1;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        r6 = 13;
                        break;
                    }
                    r6 = -1;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        r6 = 11;
                        break;
                    }
                    r6 = -1;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        r6 = 1;
                        break;
                    }
                    r6 = -1;
                    break;
                case 1587328867:
                    if (attributeName.equals("displayAlign")) {
                        r6 = 17;
                        break;
                    }
                    r6 = -1;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        r6 = 8;
                        break;
                    }
                    r6 = -1;
                    break;
                default:
                    r6 = -1;
                    break;
            }
            switch (r6) {
                case 0:
                    if (!"style".equals(xmlPullParser.getName())) {
                        break;
                    } else {
                        zzapcVar2 = zze(zzapcVar2);
                        zzapcVar2.zzs(attributeValue);
                        break;
                    }
                case 1:
                    zzapcVar2 = zze(zzapcVar2);
                    try {
                        zzapcVar2.zzn(zzds.zza(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        String.valueOf(attributeValue);
                        zzeh.zzc("TtmlParser", "Failed parsing background value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                case 2:
                    zzapcVar2 = zze(zzapcVar2);
                    try {
                        zzapcVar2.zzk(zzds.zza(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused2) {
                        String.valueOf(attributeValue);
                        zzeh.zzc("TtmlParser", "Failed parsing color value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                case 3:
                    zzapcVar2 = zze(zzapcVar2);
                    zzapcVar2.zzi(attributeValue);
                    break;
                case 4:
                    try {
                        zzapcVar2 = zze(zzapcVar2);
                        String str = zzfm.zza;
                        String[] split = attributeValue.split("\\s+", -1);
                        int length = split.length;
                        if (length == 1) {
                            matcher = zze.matcher(attributeValue);
                        } else {
                            if (length != 2) {
                                StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 41);
                                sb.append("Invalid number of entries for fontSize: ");
                                sb.append(length);
                                sb.append(".");
                                throw new zzanv(sb.toString());
                            }
                            matcher = zze.matcher(split[1]);
                            zzeh.zzc("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                        }
                        if (!matcher.matches()) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(attributeValue).length() + 36);
                            sb2.append("Invalid expression for fontSize: '");
                            sb2.append(attributeValue);
                            sb2.append("'.");
                            throw new zzanv(sb2.toString());
                        }
                        String group = matcher.group(3);
                        if (group == null) {
                            throw null;
                        }
                        String str2 = group;
                        int hashCode = group.hashCode();
                        if (hashCode == 37) {
                            if (group.equals("%")) {
                                c = 2;
                            }
                            c = 65535;
                        } else if (hashCode != 3240) {
                            if (hashCode == 3592 && group.equals("px")) {
                                c = 0;
                            }
                            c = 65535;
                        } else {
                            if (group.equals(UserDataStore.EMAIL)) {
                                c = 1;
                            }
                            c = 65535;
                        }
                        if (c == 0) {
                            zzapcVar2.zzH(1);
                        } else if (c == 1) {
                            zzapcVar2.zzH(2);
                        } else {
                            if (c != 2) {
                                StringBuilder sb3 = new StringBuilder(group.length() + 30);
                                sb3.append("Invalid unit for fontSize: '");
                                sb3.append(group);
                                sb3.append("'.");
                                throw new zzanv(sb3.toString());
                            }
                            zzapcVar2.zzH(3);
                        }
                        String group2 = matcher.group(1);
                        if (group2 == null) {
                            throw null;
                        }
                        String str3 = group2;
                        zzapcVar2.zzG(Float.parseFloat(group2));
                        break;
                    } catch (zzanv unused3) {
                        String.valueOf(attributeValue);
                        zzeh.zzc("TtmlParser", "Failed parsing fontSize value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                    break;
                case 5:
                    zzapcVar2 = zze(zzapcVar2);
                    zzapcVar2.zzf("bold".equalsIgnoreCase(attributeValue));
                    break;
                case 6:
                    zzapcVar2 = zze(zzapcVar2);
                    zzapcVar2.zzg("italic".equalsIgnoreCase(attributeValue));
                    break;
                case 7:
                    zzapcVar2 = zze(zzapcVar2);
                    zzapcVar2.zzz(zzf(attributeValue));
                    break;
                case 8:
                    zzapcVar2 = zze(zzapcVar2);
                    zzapcVar2.zzB(zzf(attributeValue));
                    break;
                case 9:
                    String zza2 = zzgts.zza(attributeValue);
                    int hashCode2 = zza2.hashCode();
                    if (hashCode2 != 96673) {
                        if (hashCode2 == 3387192 && zza2.equals("none")) {
                            r10 = z;
                        }
                    } else if (zza2.equals("all")) {
                        r10 = 1;
                    }
                    if (r10 == 0) {
                        zzapcVar2 = zze(zzapcVar2);
                        zzapcVar2.zzD(z);
                        break;
                    } else if (r10 == 1) {
                        zzapcVar2 = zze(zzapcVar2);
                        zzapcVar2.zzD(true);
                        break;
                    } else {
                        break;
                    }
                    break;
                case 10:
                    String zza3 = zzgts.zza(attributeValue);
                    switch (zza3.hashCode()) {
                        case -618561360:
                            if (zza3.equals("baseContainer")) {
                                r104 = 2;
                                break;
                            }
                            break;
                        case -410956671:
                            if (zza3.equals("container")) {
                                r104 = z;
                                break;
                            }
                            break;
                        case -250518009:
                            if (zza3.equals("delimiter")) {
                                r104 = 5;
                                break;
                            }
                            break;
                        case -136074796:
                            if (zza3.equals("textContainer")) {
                                r104 = 4;
                                break;
                            }
                            break;
                        case 3016401:
                            if (zza3.equals("base")) {
                                r104 = 1;
                                break;
                            }
                            break;
                        case 3556653:
                            if (zza3.equals("text")) {
                                r104 = 3;
                                break;
                            }
                            break;
                    }
                    if (r104 == 0) {
                        zzapcVar2 = zze(zzapcVar2);
                        zzapcVar2.zzu(1);
                        break;
                    } else if (r104 != 1 && r104 != 2) {
                        if (r104 != 3 && r104 != 4) {
                            if (r104 == 5) {
                                zzapcVar2 = zze(zzapcVar2);
                                zzapcVar2.zzu(4);
                                break;
                            } else {
                                break;
                            }
                        } else {
                            zzapcVar2 = zze(zzapcVar2);
                            zzapcVar2.zzu(3);
                            break;
                        }
                    } else {
                        zzapcVar2 = zze(zzapcVar2);
                        zzapcVar2.zzu(2);
                        break;
                    }
                case 11:
                    String zza4 = zzgts.zza(attributeValue);
                    int hashCode3 = zza4.hashCode();
                    if (hashCode3 != -1392885889) {
                        if (hashCode3 == 92734940 && zza4.equals("after")) {
                            r103 = 1;
                        }
                    } else if (zza4.equals("before")) {
                        r103 = z;
                    }
                    if (r103 == 0) {
                        zzapcVar2 = zze(zzapcVar2);
                        zzapcVar2.zzw(1);
                        break;
                    } else if (r103 == 1) {
                        zzapcVar2 = zze(zzapcVar2);
                        zzapcVar2.zzw(2);
                        break;
                    } else {
                        break;
                    }
                    break;
                case 12:
                    String zza5 = zzgts.zza(attributeValue);
                    switch (zza5.hashCode()) {
                        case -1461280213:
                            if (zza5.equals("nounderline")) {
                                r102 = 3;
                                break;
                            }
                            break;
                        case -1026963764:
                            if (zza5.equals("underline")) {
                                r102 = 2;
                                break;
                            }
                            break;
                        case 913457136:
                            if (zza5.equals("nolinethrough")) {
                                r102 = 1;
                                break;
                            }
                            break;
                        case 1679736913:
                            if (zza5.equals("linethrough")) {
                                r102 = z;
                                break;
                            }
                            break;
                    }
                    if (r102 == 0) {
                        zzapcVar2 = zze(zzapcVar2);
                        zzapcVar2.zzc(true);
                        break;
                    } else if (r102 == 1) {
                        zzapcVar2 = zze(zzapcVar2);
                        zzapcVar2.zzc(z);
                        break;
                    } else if (r102 == 2) {
                        zzapcVar2 = zze(zzapcVar2);
                        zzapcVar2.zze(true);
                        break;
                    } else if (r102 == 3) {
                        zzapcVar2 = zze(zzapcVar2);
                        zzapcVar2.zze(z);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    zzapcVar2 = zze(zzapcVar2);
                    zzapcVar2.zzF(zzaov.zza(attributeValue));
                    break;
                case 14:
                    zzapc zze2 = zze(zzapcVar2);
                    Matcher matcher2 = zza.matcher(attributeValue);
                    float f = Float.MAX_VALUE;
                    if (matcher2.matches()) {
                        try {
                            String group3 = matcher2.group(1);
                            if (group3 == null) {
                                throw null;
                                break;
                            } else {
                                String str4 = group3;
                                f = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group3)));
                            }
                        } catch (NumberFormatException e) {
                            String.valueOf(attributeValue);
                            zzeh.zzd("TtmlParser", "Failed to parse shear: ".concat(String.valueOf(attributeValue)), e);
                        }
                    } else {
                        String.valueOf(attributeValue);
                        zzeh.zzc("TtmlParser", "Invalid value for shear: ".concat(String.valueOf(attributeValue)));
                    }
                    zze2.zzp(f);
                    zzapcVar2 = zze2;
                    break;
                case 15:
                    zzapcVar2 = zze(zzapcVar2);
                    zzapcVar2.zzK(attributeValue);
                    break;
                case 16:
                    zzapcVar2 = zze(zzapcVar2);
                    zzapcVar2.zzM(attributeValue);
                    break;
                case 17:
                    zzapcVar2 = zze(zzapcVar2);
                    zzapcVar2.zzO(attributeValue);
                    break;
            }
            i++;
            z = false;
        }
        return zzapcVar2;
    }

    private static zzapc zze(zzapc zzapcVar) {
        return zzapcVar == null ? new zzapc() : zzapcVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static Layout.Alignment zzf(String str) {
        char c;
        String zza2 = zzgts.zza(str);
        switch (zza2.hashCode()) {
            case -1364013995:
                if (zza2.equals("center")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 100571:
                if (zza2.equals("end")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3317767:
                if (zza2.equals("left")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 108511772:
                if (zza2.equals("right")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 109757538:
                if (zza2.equals("start")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (c == 2 || c == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (c != 4) {
            return null;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d6, code lost:
    
        if (r13.equals(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS) != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static long zzg(String str, zzaox zzaoxVar) throws zzanv {
        double d;
        double d2;
        Matcher matcher = zzc.matcher(str);
        char c = 2;
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            long parseLong = Long.parseLong(group) * 3600;
            String group2 = matcher.group(2);
            group2.getClass();
            long parseLong2 = Long.parseLong(group2) * 60;
            String group3 = matcher.group(3);
            group3.getClass();
            double d3 = parseLong + parseLong2;
            double parseLong3 = Long.parseLong(group3);
            String group4 = matcher.group(4);
            double parseDouble = group4 != null ? Double.parseDouble(group4) : 0.0d;
            double d4 = d3 + parseLong3;
            return (long) ((d4 + parseDouble + (matcher.group(5) != null ? Long.parseLong(r13) / zzaoxVar.zza : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / zzaoxVar.zzb) / zzaoxVar.zza : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = zzd.matcher(str);
        if (!matcher2.matches()) {
            String.valueOf(str);
            throw new zzanv("Malformed time expression: ".concat(String.valueOf(str)));
        }
        String group5 = matcher2.group(1);
        group5.getClass();
        double parseDouble2 = Double.parseDouble(group5);
        String group6 = matcher2.group(2);
        group6.getClass();
        int hashCode = group6.hashCode();
        if (hashCode == 102) {
            if (group6.equals("f")) {
                c = 4;
            }
            c = 65535;
        } else if (hashCode == 104) {
            if (group6.equals("h")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode == 109) {
            if (group6.equals(InneractiveMediationDefs.GENDER_MALE)) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode == 3494) {
            if (group6.equals("ms")) {
                c = 3;
            }
            c = 65535;
        } else if (hashCode != 115) {
            if (hashCode == 116 && group6.equals("t")) {
                c = 5;
            }
            c = 65535;
        }
        if (c == 0) {
            d = 3600.0d;
        } else {
            if (c != 1) {
                if (c == 3) {
                    d2 = 1000.0d;
                } else {
                    if (c != 4) {
                        if (c == 5) {
                            d2 = zzaoxVar.zzc;
                        }
                        return (long) (parseDouble2 * 1000000.0d);
                    }
                    d2 = zzaoxVar.zza;
                }
                parseDouble2 /= d2;
                return (long) (parseDouble2 * 1000000.0d);
            }
            d = 60.0d;
        }
        parseDouble2 *= d;
        return (long) (parseDouble2 * 1000000.0d);
    }

    @Override // com.google.android.gms.internal.ads.zzanz
    public final void zza(byte[] bArr, int i, int i2, zzany zzanyVar, zzdu zzduVar) {
        zzant.zza(zzb(bArr, i, i2), zzanyVar, zzduVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x06ec, code lost:
    
        if (r14 != r10) goto L388;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x054c A[Catch: IOException -> 0x07a8, XmlPullParserException -> 0x07b2, TryCatch #17 {IOException -> 0x07a8, XmlPullParserException -> 0x07b2, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:17:0x0093, B:19:0x009b, B:22:0x00af, B:23:0x00ce, B:25:0x00d8, B:26:0x00dc, B:28:0x00e8, B:29:0x00f3, B:33:0x016f, B:36:0x01ca, B:39:0x01e4, B:41:0x01ea, B:43:0x01f2, B:45:0x01fa, B:47:0x0202, B:49:0x020a, B:51:0x0212, B:53:0x0218, B:55:0x0220, B:57:0x0228, B:59:0x022e, B:61:0x0234, B:63:0x023a, B:65:0x0242, B:68:0x024b, B:70:0x0787, B:71:0x027a, B:73:0x0280, B:75:0x0289, B:77:0x0298, B:79:0x02a4, B:81:0x02ba, B:83:0x02c0, B:85:0x059b, B:94:0x02cc, B:97:0x02d8, B:102:0x054c, B:105:0x02f5, B:107:0x02fd, B:109:0x0305, B:111:0x030d, B:114:0x031a, B:118:0x0333, B:120:0x0339, B:122:0x0349, B:123:0x03b7, B:125:0x03c1, B:127:0x03c7, B:129:0x03cf, B:131:0x03d5, B:135:0x03e8, B:137:0x03ee, B:139:0x03fe, B:140:0x048c, B:142:0x0494, B:144:0x049a, B:146:0x04a2, B:148:0x04a8, B:161:0x04ee, B:163:0x04f6, B:179:0x053f, B:197:0x040e, B:201:0x0410, B:202:0x0411, B:203:0x0421, B:206:0x0429, B:209:0x043a, B:211:0x0440, B:213:0x044e, B:216:0x0465, B:219:0x0467, B:220:0x0468, B:221:0x0478, B:225:0x0354, B:228:0x0356, B:229:0x0357, B:230:0x035f, B:233:0x0369, B:236:0x0372, B:238:0x0378, B:240:0x0386, B:243:0x039a, B:246:0x039c, B:247:0x039d, B:248:0x03a6, B:252:0x055f, B:254:0x056c, B:256:0x0577, B:258:0x057d, B:259:0x0589, B:269:0x05b6, B:273:0x05d7, B:292:0x0688, B:301:0x0643, B:305:0x064c, B:298:0x0718, B:312:0x0656, B:315:0x0660, B:320:0x0675, B:322:0x067a, B:324:0x0681, B:350:0x06a0, B:354:0x06b1, B:357:0x06ba, B:363:0x06e1, B:365:0x06f4, B:368:0x0702, B:370:0x0707, B:378:0x06e8, B:390:0x017e, B:392:0x018a, B:395:0x0193, B:397:0x0199, B:399:0x01a7, B:402:0x01b7, B:405:0x01b9, B:406:0x01ba, B:407:0x010c, B:409:0x0118, B:412:0x0121, B:414:0x0127, B:417:0x0132, B:419:0x0138, B:424:0x0151, B:426:0x0167, B:431:0x015c, B:437:0x0162, B:448:0x0737, B:451:0x0747, B:454:0x074b, B:456:0x0755, B:458:0x075f, B:459:0x076a, B:463:0x0767, B:467:0x077d, B:470:0x0783, B:474:0x07a1, B:477:0x07a7), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x031a A[Catch: IOException -> 0x07a8, XmlPullParserException -> 0x07b2, TRY_LEAVE, TryCatch #17 {IOException -> 0x07a8, XmlPullParserException -> 0x07b2, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:17:0x0093, B:19:0x009b, B:22:0x00af, B:23:0x00ce, B:25:0x00d8, B:26:0x00dc, B:28:0x00e8, B:29:0x00f3, B:33:0x016f, B:36:0x01ca, B:39:0x01e4, B:41:0x01ea, B:43:0x01f2, B:45:0x01fa, B:47:0x0202, B:49:0x020a, B:51:0x0212, B:53:0x0218, B:55:0x0220, B:57:0x0228, B:59:0x022e, B:61:0x0234, B:63:0x023a, B:65:0x0242, B:68:0x024b, B:70:0x0787, B:71:0x027a, B:73:0x0280, B:75:0x0289, B:77:0x0298, B:79:0x02a4, B:81:0x02ba, B:83:0x02c0, B:85:0x059b, B:94:0x02cc, B:97:0x02d8, B:102:0x054c, B:105:0x02f5, B:107:0x02fd, B:109:0x0305, B:111:0x030d, B:114:0x031a, B:118:0x0333, B:120:0x0339, B:122:0x0349, B:123:0x03b7, B:125:0x03c1, B:127:0x03c7, B:129:0x03cf, B:131:0x03d5, B:135:0x03e8, B:137:0x03ee, B:139:0x03fe, B:140:0x048c, B:142:0x0494, B:144:0x049a, B:146:0x04a2, B:148:0x04a8, B:161:0x04ee, B:163:0x04f6, B:179:0x053f, B:197:0x040e, B:201:0x0410, B:202:0x0411, B:203:0x0421, B:206:0x0429, B:209:0x043a, B:211:0x0440, B:213:0x044e, B:216:0x0465, B:219:0x0467, B:220:0x0468, B:221:0x0478, B:225:0x0354, B:228:0x0356, B:229:0x0357, B:230:0x035f, B:233:0x0369, B:236:0x0372, B:238:0x0378, B:240:0x0386, B:243:0x039a, B:246:0x039c, B:247:0x039d, B:248:0x03a6, B:252:0x055f, B:254:0x056c, B:256:0x0577, B:258:0x057d, B:259:0x0589, B:269:0x05b6, B:273:0x05d7, B:292:0x0688, B:301:0x0643, B:305:0x064c, B:298:0x0718, B:312:0x0656, B:315:0x0660, B:320:0x0675, B:322:0x067a, B:324:0x0681, B:350:0x06a0, B:354:0x06b1, B:357:0x06ba, B:363:0x06e1, B:365:0x06f4, B:368:0x0702, B:370:0x0707, B:378:0x06e8, B:390:0x017e, B:392:0x018a, B:395:0x0193, B:397:0x0199, B:399:0x01a7, B:402:0x01b7, B:405:0x01b9, B:406:0x01ba, B:407:0x010c, B:409:0x0118, B:412:0x0121, B:414:0x0127, B:417:0x0132, B:419:0x0138, B:424:0x0151, B:426:0x0167, B:431:0x015c, B:437:0x0162, B:448:0x0737, B:451:0x0747, B:454:0x074b, B:456:0x0755, B:458:0x075f, B:459:0x076a, B:463:0x0767, B:467:0x077d, B:470:0x0783, B:474:0x07a1, B:477:0x07a7), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03d5 A[Catch: IOException -> 0x07a8, XmlPullParserException -> 0x07b2, TRY_LEAVE, TryCatch #17 {IOException -> 0x07a8, XmlPullParserException -> 0x07b2, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:17:0x0093, B:19:0x009b, B:22:0x00af, B:23:0x00ce, B:25:0x00d8, B:26:0x00dc, B:28:0x00e8, B:29:0x00f3, B:33:0x016f, B:36:0x01ca, B:39:0x01e4, B:41:0x01ea, B:43:0x01f2, B:45:0x01fa, B:47:0x0202, B:49:0x020a, B:51:0x0212, B:53:0x0218, B:55:0x0220, B:57:0x0228, B:59:0x022e, B:61:0x0234, B:63:0x023a, B:65:0x0242, B:68:0x024b, B:70:0x0787, B:71:0x027a, B:73:0x0280, B:75:0x0289, B:77:0x0298, B:79:0x02a4, B:81:0x02ba, B:83:0x02c0, B:85:0x059b, B:94:0x02cc, B:97:0x02d8, B:102:0x054c, B:105:0x02f5, B:107:0x02fd, B:109:0x0305, B:111:0x030d, B:114:0x031a, B:118:0x0333, B:120:0x0339, B:122:0x0349, B:123:0x03b7, B:125:0x03c1, B:127:0x03c7, B:129:0x03cf, B:131:0x03d5, B:135:0x03e8, B:137:0x03ee, B:139:0x03fe, B:140:0x048c, B:142:0x0494, B:144:0x049a, B:146:0x04a2, B:148:0x04a8, B:161:0x04ee, B:163:0x04f6, B:179:0x053f, B:197:0x040e, B:201:0x0410, B:202:0x0411, B:203:0x0421, B:206:0x0429, B:209:0x043a, B:211:0x0440, B:213:0x044e, B:216:0x0465, B:219:0x0467, B:220:0x0468, B:221:0x0478, B:225:0x0354, B:228:0x0356, B:229:0x0357, B:230:0x035f, B:233:0x0369, B:236:0x0372, B:238:0x0378, B:240:0x0386, B:243:0x039a, B:246:0x039c, B:247:0x039d, B:248:0x03a6, B:252:0x055f, B:254:0x056c, B:256:0x0577, B:258:0x057d, B:259:0x0589, B:269:0x05b6, B:273:0x05d7, B:292:0x0688, B:301:0x0643, B:305:0x064c, B:298:0x0718, B:312:0x0656, B:315:0x0660, B:320:0x0675, B:322:0x067a, B:324:0x0681, B:350:0x06a0, B:354:0x06b1, B:357:0x06ba, B:363:0x06e1, B:365:0x06f4, B:368:0x0702, B:370:0x0707, B:378:0x06e8, B:390:0x017e, B:392:0x018a, B:395:0x0193, B:397:0x0199, B:399:0x01a7, B:402:0x01b7, B:405:0x01b9, B:406:0x01ba, B:407:0x010c, B:409:0x0118, B:412:0x0121, B:414:0x0127, B:417:0x0132, B:419:0x0138, B:424:0x0151, B:426:0x0167, B:431:0x015c, B:437:0x0162, B:448:0x0737, B:451:0x0747, B:454:0x074b, B:456:0x0755, B:458:0x075f, B:459:0x076a, B:463:0x0767, B:467:0x077d, B:470:0x0783, B:474:0x07a1, B:477:0x07a7), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04a8 A[Catch: IOException -> 0x07a8, XmlPullParserException -> 0x07b2, TRY_LEAVE, TryCatch #17 {IOException -> 0x07a8, XmlPullParserException -> 0x07b2, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:17:0x0093, B:19:0x009b, B:22:0x00af, B:23:0x00ce, B:25:0x00d8, B:26:0x00dc, B:28:0x00e8, B:29:0x00f3, B:33:0x016f, B:36:0x01ca, B:39:0x01e4, B:41:0x01ea, B:43:0x01f2, B:45:0x01fa, B:47:0x0202, B:49:0x020a, B:51:0x0212, B:53:0x0218, B:55:0x0220, B:57:0x0228, B:59:0x022e, B:61:0x0234, B:63:0x023a, B:65:0x0242, B:68:0x024b, B:70:0x0787, B:71:0x027a, B:73:0x0280, B:75:0x0289, B:77:0x0298, B:79:0x02a4, B:81:0x02ba, B:83:0x02c0, B:85:0x059b, B:94:0x02cc, B:97:0x02d8, B:102:0x054c, B:105:0x02f5, B:107:0x02fd, B:109:0x0305, B:111:0x030d, B:114:0x031a, B:118:0x0333, B:120:0x0339, B:122:0x0349, B:123:0x03b7, B:125:0x03c1, B:127:0x03c7, B:129:0x03cf, B:131:0x03d5, B:135:0x03e8, B:137:0x03ee, B:139:0x03fe, B:140:0x048c, B:142:0x0494, B:144:0x049a, B:146:0x04a2, B:148:0x04a8, B:161:0x04ee, B:163:0x04f6, B:179:0x053f, B:197:0x040e, B:201:0x0410, B:202:0x0411, B:203:0x0421, B:206:0x0429, B:209:0x043a, B:211:0x0440, B:213:0x044e, B:216:0x0465, B:219:0x0467, B:220:0x0468, B:221:0x0478, B:225:0x0354, B:228:0x0356, B:229:0x0357, B:230:0x035f, B:233:0x0369, B:236:0x0372, B:238:0x0378, B:240:0x0386, B:243:0x039a, B:246:0x039c, B:247:0x039d, B:248:0x03a6, B:252:0x055f, B:254:0x056c, B:256:0x0577, B:258:0x057d, B:259:0x0589, B:269:0x05b6, B:273:0x05d7, B:292:0x0688, B:301:0x0643, B:305:0x064c, B:298:0x0718, B:312:0x0656, B:315:0x0660, B:320:0x0675, B:322:0x067a, B:324:0x0681, B:350:0x06a0, B:354:0x06b1, B:357:0x06ba, B:363:0x06e1, B:365:0x06f4, B:368:0x0702, B:370:0x0707, B:378:0x06e8, B:390:0x017e, B:392:0x018a, B:395:0x0193, B:397:0x0199, B:399:0x01a7, B:402:0x01b7, B:405:0x01b9, B:406:0x01ba, B:407:0x010c, B:409:0x0118, B:412:0x0121, B:414:0x0127, B:417:0x0132, B:419:0x0138, B:424:0x0151, B:426:0x0167, B:431:0x015c, B:437:0x0162, B:448:0x0737, B:451:0x0747, B:454:0x074b, B:456:0x0755, B:458:0x075f, B:459:0x076a, B:463:0x0767, B:467:0x077d, B:470:0x0783, B:474:0x07a1, B:477:0x07a7), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04f6 A[Catch: IOException -> 0x07a8, XmlPullParserException -> 0x07b2, TRY_LEAVE, TryCatch #17 {IOException -> 0x07a8, XmlPullParserException -> 0x07b2, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:17:0x0093, B:19:0x009b, B:22:0x00af, B:23:0x00ce, B:25:0x00d8, B:26:0x00dc, B:28:0x00e8, B:29:0x00f3, B:33:0x016f, B:36:0x01ca, B:39:0x01e4, B:41:0x01ea, B:43:0x01f2, B:45:0x01fa, B:47:0x0202, B:49:0x020a, B:51:0x0212, B:53:0x0218, B:55:0x0220, B:57:0x0228, B:59:0x022e, B:61:0x0234, B:63:0x023a, B:65:0x0242, B:68:0x024b, B:70:0x0787, B:71:0x027a, B:73:0x0280, B:75:0x0289, B:77:0x0298, B:79:0x02a4, B:81:0x02ba, B:83:0x02c0, B:85:0x059b, B:94:0x02cc, B:97:0x02d8, B:102:0x054c, B:105:0x02f5, B:107:0x02fd, B:109:0x0305, B:111:0x030d, B:114:0x031a, B:118:0x0333, B:120:0x0339, B:122:0x0349, B:123:0x03b7, B:125:0x03c1, B:127:0x03c7, B:129:0x03cf, B:131:0x03d5, B:135:0x03e8, B:137:0x03ee, B:139:0x03fe, B:140:0x048c, B:142:0x0494, B:144:0x049a, B:146:0x04a2, B:148:0x04a8, B:161:0x04ee, B:163:0x04f6, B:179:0x053f, B:197:0x040e, B:201:0x0410, B:202:0x0411, B:203:0x0421, B:206:0x0429, B:209:0x043a, B:211:0x0440, B:213:0x044e, B:216:0x0465, B:219:0x0467, B:220:0x0468, B:221:0x0478, B:225:0x0354, B:228:0x0356, B:229:0x0357, B:230:0x035f, B:233:0x0369, B:236:0x0372, B:238:0x0378, B:240:0x0386, B:243:0x039a, B:246:0x039c, B:247:0x039d, B:248:0x03a6, B:252:0x055f, B:254:0x056c, B:256:0x0577, B:258:0x057d, B:259:0x0589, B:269:0x05b6, B:273:0x05d7, B:292:0x0688, B:301:0x0643, B:305:0x064c, B:298:0x0718, B:312:0x0656, B:315:0x0660, B:320:0x0675, B:322:0x067a, B:324:0x0681, B:350:0x06a0, B:354:0x06b1, B:357:0x06ba, B:363:0x06e1, B:365:0x06f4, B:368:0x0702, B:370:0x0707, B:378:0x06e8, B:390:0x017e, B:392:0x018a, B:395:0x0193, B:397:0x0199, B:399:0x01a7, B:402:0x01b7, B:405:0x01b9, B:406:0x01ba, B:407:0x010c, B:409:0x0118, B:412:0x0121, B:414:0x0127, B:417:0x0132, B:419:0x0138, B:424:0x0151, B:426:0x0167, B:431:0x015c, B:437:0x0162, B:448:0x0737, B:451:0x0747, B:454:0x074b, B:456:0x0755, B:458:0x075f, B:459:0x076a, B:463:0x0767, B:467:0x077d, B:470:0x0783, B:474:0x07a1, B:477:0x07a7), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0707 A[Catch: zzanv -> 0x070b, IOException -> 0x07a8, XmlPullParserException -> 0x07b2, TRY_LEAVE, TryCatch #13 {zzanv -> 0x070b, blocks: (B:368:0x0702, B:370:0x0707), top: B:367:0x0702 }] */
    /* JADX WARN: Removed duplicated region for block: B:390:0x017e A[Catch: IOException -> 0x07a8, XmlPullParserException -> 0x07b2, TryCatch #17 {IOException -> 0x07a8, XmlPullParserException -> 0x07b2, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:17:0x0093, B:19:0x009b, B:22:0x00af, B:23:0x00ce, B:25:0x00d8, B:26:0x00dc, B:28:0x00e8, B:29:0x00f3, B:33:0x016f, B:36:0x01ca, B:39:0x01e4, B:41:0x01ea, B:43:0x01f2, B:45:0x01fa, B:47:0x0202, B:49:0x020a, B:51:0x0212, B:53:0x0218, B:55:0x0220, B:57:0x0228, B:59:0x022e, B:61:0x0234, B:63:0x023a, B:65:0x0242, B:68:0x024b, B:70:0x0787, B:71:0x027a, B:73:0x0280, B:75:0x0289, B:77:0x0298, B:79:0x02a4, B:81:0x02ba, B:83:0x02c0, B:85:0x059b, B:94:0x02cc, B:97:0x02d8, B:102:0x054c, B:105:0x02f5, B:107:0x02fd, B:109:0x0305, B:111:0x030d, B:114:0x031a, B:118:0x0333, B:120:0x0339, B:122:0x0349, B:123:0x03b7, B:125:0x03c1, B:127:0x03c7, B:129:0x03cf, B:131:0x03d5, B:135:0x03e8, B:137:0x03ee, B:139:0x03fe, B:140:0x048c, B:142:0x0494, B:144:0x049a, B:146:0x04a2, B:148:0x04a8, B:161:0x04ee, B:163:0x04f6, B:179:0x053f, B:197:0x040e, B:201:0x0410, B:202:0x0411, B:203:0x0421, B:206:0x0429, B:209:0x043a, B:211:0x0440, B:213:0x044e, B:216:0x0465, B:219:0x0467, B:220:0x0468, B:221:0x0478, B:225:0x0354, B:228:0x0356, B:229:0x0357, B:230:0x035f, B:233:0x0369, B:236:0x0372, B:238:0x0378, B:240:0x0386, B:243:0x039a, B:246:0x039c, B:247:0x039d, B:248:0x03a6, B:252:0x055f, B:254:0x056c, B:256:0x0577, B:258:0x057d, B:259:0x0589, B:269:0x05b6, B:273:0x05d7, B:292:0x0688, B:301:0x0643, B:305:0x064c, B:298:0x0718, B:312:0x0656, B:315:0x0660, B:320:0x0675, B:322:0x067a, B:324:0x0681, B:350:0x06a0, B:354:0x06b1, B:357:0x06ba, B:363:0x06e1, B:365:0x06f4, B:368:0x0702, B:370:0x0707, B:378:0x06e8, B:390:0x017e, B:392:0x018a, B:395:0x0193, B:397:0x0199, B:399:0x01a7, B:402:0x01b7, B:405:0x01b9, B:406:0x01ba, B:407:0x010c, B:409:0x0118, B:412:0x0121, B:414:0x0127, B:417:0x0132, B:419:0x0138, B:424:0x0151, B:426:0x0167, B:431:0x015c, B:437:0x0162, B:448:0x0737, B:451:0x0747, B:454:0x074b, B:456:0x0755, B:458:0x075f, B:459:0x076a, B:463:0x0767, B:467:0x077d, B:470:0x0783, B:474:0x07a1, B:477:0x07a7), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01e4 A[Catch: IOException -> 0x07a8, XmlPullParserException -> 0x07b2, TRY_ENTER, TryCatch #17 {IOException -> 0x07a8, XmlPullParserException -> 0x07b2, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:17:0x0093, B:19:0x009b, B:22:0x00af, B:23:0x00ce, B:25:0x00d8, B:26:0x00dc, B:28:0x00e8, B:29:0x00f3, B:33:0x016f, B:36:0x01ca, B:39:0x01e4, B:41:0x01ea, B:43:0x01f2, B:45:0x01fa, B:47:0x0202, B:49:0x020a, B:51:0x0212, B:53:0x0218, B:55:0x0220, B:57:0x0228, B:59:0x022e, B:61:0x0234, B:63:0x023a, B:65:0x0242, B:68:0x024b, B:70:0x0787, B:71:0x027a, B:73:0x0280, B:75:0x0289, B:77:0x0298, B:79:0x02a4, B:81:0x02ba, B:83:0x02c0, B:85:0x059b, B:94:0x02cc, B:97:0x02d8, B:102:0x054c, B:105:0x02f5, B:107:0x02fd, B:109:0x0305, B:111:0x030d, B:114:0x031a, B:118:0x0333, B:120:0x0339, B:122:0x0349, B:123:0x03b7, B:125:0x03c1, B:127:0x03c7, B:129:0x03cf, B:131:0x03d5, B:135:0x03e8, B:137:0x03ee, B:139:0x03fe, B:140:0x048c, B:142:0x0494, B:144:0x049a, B:146:0x04a2, B:148:0x04a8, B:161:0x04ee, B:163:0x04f6, B:179:0x053f, B:197:0x040e, B:201:0x0410, B:202:0x0411, B:203:0x0421, B:206:0x0429, B:209:0x043a, B:211:0x0440, B:213:0x044e, B:216:0x0465, B:219:0x0467, B:220:0x0468, B:221:0x0478, B:225:0x0354, B:228:0x0356, B:229:0x0357, B:230:0x035f, B:233:0x0369, B:236:0x0372, B:238:0x0378, B:240:0x0386, B:243:0x039a, B:246:0x039c, B:247:0x039d, B:248:0x03a6, B:252:0x055f, B:254:0x056c, B:256:0x0577, B:258:0x057d, B:259:0x0589, B:269:0x05b6, B:273:0x05d7, B:292:0x0688, B:301:0x0643, B:305:0x064c, B:298:0x0718, B:312:0x0656, B:315:0x0660, B:320:0x0675, B:322:0x067a, B:324:0x0681, B:350:0x06a0, B:354:0x06b1, B:357:0x06ba, B:363:0x06e1, B:365:0x06f4, B:368:0x0702, B:370:0x0707, B:378:0x06e8, B:390:0x017e, B:392:0x018a, B:395:0x0193, B:397:0x0199, B:399:0x01a7, B:402:0x01b7, B:405:0x01b9, B:406:0x01ba, B:407:0x010c, B:409:0x0118, B:412:0x0121, B:414:0x0127, B:417:0x0132, B:419:0x0138, B:424:0x0151, B:426:0x0167, B:431:0x015c, B:437:0x0162, B:448:0x0737, B:451:0x0747, B:454:0x074b, B:456:0x0755, B:458:0x075f, B:459:0x076a, B:463:0x0767, B:467:0x077d, B:470:0x0783, B:474:0x07a1, B:477:0x07a7), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0280 A[Catch: IOException -> 0x07a8, XmlPullParserException -> 0x07b2, LOOP:1: B:73:0x0280->B:87:0x05a7, LOOP_START, PHI: r3 r7 r8 r10 r11 r12 r15
      0x0280: PHI (r3v21 java.lang.String) = (r3v3 java.lang.String), (r3v58 java.lang.String) binds: [B:72:0x027e, B:87:0x05a7] A[DONT_GENERATE, DONT_INLINE]
      0x0280: PHI (r7v5 java.util.HashMap) = (r7v1 java.util.HashMap), (r7v49 java.util.HashMap) binds: [B:72:0x027e, B:87:0x05a7] A[DONT_GENERATE, DONT_INLINE]
      0x0280: PHI (r8v36 java.util.HashMap) = (r8v1 java.util.HashMap), (r8v58 java.util.HashMap) binds: [B:72:0x027e, B:87:0x05a7] A[DONT_GENERATE, DONT_INLINE]
      0x0280: PHI (r10v24 java.lang.String) = (r10v10 java.lang.String), (r10v31 java.lang.String) binds: [B:72:0x027e, B:87:0x05a7] A[DONT_GENERATE, DONT_INLINE]
      0x0280: PHI (r11v21 java.lang.String) = (r11v6 java.lang.String), (r11v45 java.lang.String) binds: [B:72:0x027e, B:87:0x05a7] A[DONT_GENERATE, DONT_INLINE]
      0x0280: PHI (r12v12 java.lang.String) = (r12v9 java.lang.String), (r12v32 java.lang.String) binds: [B:72:0x027e, B:87:0x05a7] A[DONT_GENERATE, DONT_INLINE]
      0x0280: PHI (r15v12 java.lang.String) = (r15v11 java.lang.String), (r15v14 java.lang.String) binds: [B:72:0x027e, B:87:0x05a7] A[DONT_GENERATE, DONT_INLINE], TryCatch #17 {IOException -> 0x07a8, XmlPullParserException -> 0x07b2, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:17:0x0093, B:19:0x009b, B:22:0x00af, B:23:0x00ce, B:25:0x00d8, B:26:0x00dc, B:28:0x00e8, B:29:0x00f3, B:33:0x016f, B:36:0x01ca, B:39:0x01e4, B:41:0x01ea, B:43:0x01f2, B:45:0x01fa, B:47:0x0202, B:49:0x020a, B:51:0x0212, B:53:0x0218, B:55:0x0220, B:57:0x0228, B:59:0x022e, B:61:0x0234, B:63:0x023a, B:65:0x0242, B:68:0x024b, B:70:0x0787, B:71:0x027a, B:73:0x0280, B:75:0x0289, B:77:0x0298, B:79:0x02a4, B:81:0x02ba, B:83:0x02c0, B:85:0x059b, B:94:0x02cc, B:97:0x02d8, B:102:0x054c, B:105:0x02f5, B:107:0x02fd, B:109:0x0305, B:111:0x030d, B:114:0x031a, B:118:0x0333, B:120:0x0339, B:122:0x0349, B:123:0x03b7, B:125:0x03c1, B:127:0x03c7, B:129:0x03cf, B:131:0x03d5, B:135:0x03e8, B:137:0x03ee, B:139:0x03fe, B:140:0x048c, B:142:0x0494, B:144:0x049a, B:146:0x04a2, B:148:0x04a8, B:161:0x04ee, B:163:0x04f6, B:179:0x053f, B:197:0x040e, B:201:0x0410, B:202:0x0411, B:203:0x0421, B:206:0x0429, B:209:0x043a, B:211:0x0440, B:213:0x044e, B:216:0x0465, B:219:0x0467, B:220:0x0468, B:221:0x0478, B:225:0x0354, B:228:0x0356, B:229:0x0357, B:230:0x035f, B:233:0x0369, B:236:0x0372, B:238:0x0378, B:240:0x0386, B:243:0x039a, B:246:0x039c, B:247:0x039d, B:248:0x03a6, B:252:0x055f, B:254:0x056c, B:256:0x0577, B:258:0x057d, B:259:0x0589, B:269:0x05b6, B:273:0x05d7, B:292:0x0688, B:301:0x0643, B:305:0x064c, B:298:0x0718, B:312:0x0656, B:315:0x0660, B:320:0x0675, B:322:0x067a, B:324:0x0681, B:350:0x06a0, B:354:0x06b1, B:357:0x06ba, B:363:0x06e1, B:365:0x06f4, B:368:0x0702, B:370:0x0707, B:378:0x06e8, B:390:0x017e, B:392:0x018a, B:395:0x0193, B:397:0x0199, B:399:0x01a7, B:402:0x01b7, B:405:0x01b9, B:406:0x01ba, B:407:0x010c, B:409:0x0118, B:412:0x0121, B:414:0x0127, B:417:0x0132, B:419:0x0138, B:424:0x0151, B:426:0x0167, B:431:0x015c, B:437:0x0162, B:448:0x0737, B:451:0x0747, B:454:0x074b, B:456:0x0755, B:458:0x075f, B:459:0x076a, B:463:0x0767, B:467:0x077d, B:470:0x0783, B:474:0x07a1, B:477:0x07a7), top: B:2:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzanu zzb(byte[] bArr, int i, int i2) {
        String str;
        String str2;
        String str3;
        ArrayDeque arrayDeque;
        zzaox zzaoxVar;
        zzapd zzapdVar;
        HashMap hashMap;
        ArrayDeque arrayDeque2;
        zzaoy zzaoyVar;
        int i3;
        zzaox zzaoxVar2;
        int i4;
        zzanv zzanvVar;
        zzaow zzaowVar;
        long j;
        zzaow zzaowVar2;
        long j2;
        long j3;
        Object obj;
        char c;
        String str4;
        String str5;
        String str6;
        String str7;
        String zzc2;
        String str8;
        String str9;
        HashMap hashMap2;
        String str10;
        String str11;
        float f;
        float f2;
        String zzc3;
        float f3;
        float f4;
        String zzc4;
        float f5;
        int i5;
        String zzc5;
        int i6;
        zzapa zzapaVar;
        char c2;
        char c3;
        String zzc6;
        zzapc zzapcVar;
        String zzc7;
        zzapc zzapcVar2;
        zzapc zzapcVar3;
        String str12;
        float f6;
        int i7;
        String group;
        String group2;
        int i8;
        boolean z;
        String zzc8;
        String str13 = "";
        String str14 = "http://www.w3.org/ns/ttml#parameter";
        String str15 = "Ignoring unsupported tag: ";
        try {
            XmlPullParser newPullParser = this.zzi.newPullParser();
            HashMap hashMap3 = new HashMap();
            HashMap hashMap4 = new HashMap();
            HashMap hashMap5 = new HashMap();
            hashMap4.put("", new zzapa("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            newPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque3 = new ArrayDeque();
            int eventType = newPullParser.getEventType();
            zzaox zzaoxVar3 = zzh;
            zzapd zzapdVar2 = null;
            zzaoy zzaoyVar2 = null;
            zzaox zzaoxVar4 = zzaoxVar3;
            int i9 = 0;
            int i10 = 15;
            while (eventType != 1) {
                zzaow zzaowVar3 = (zzaow) arrayDeque3.peek();
                if (i9 == 0) {
                    String name = newPullParser.getName();
                    str = str13;
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            String attributeValue = newPullParser.getAttributeValue(str14, "frameRate");
                            int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
                            String attributeValue2 = newPullParser.getAttributeValue(str14, "frameRateMultiplier");
                            if (attributeValue2 != null) {
                                zzapdVar = zzapdVar2;
                                String str16 = zzfm.zza;
                                arrayDeque2 = arrayDeque3;
                                zzguk.zzb(attributeValue2.split(ServerSentEventKt.SPACE, -1).length == 2, "frameRateMultiplier doesn't have 2 parts");
                                f6 = Integer.parseInt(r4[0]) / Integer.parseInt(r4[1]);
                            } else {
                                arrayDeque2 = arrayDeque3;
                                zzapdVar = zzapdVar2;
                                f6 = 1.0f;
                            }
                            int i11 = zzaoxVar3.zzb;
                            String attributeValue3 = newPullParser.getAttributeValue(str14, "subFrameRate");
                            if (attributeValue3 != null) {
                                i11 = Integer.parseInt(attributeValue3);
                            }
                            int i12 = zzaoxVar3.zzc;
                            String attributeValue4 = newPullParser.getAttributeValue(str14, "tickRate");
                            if (attributeValue4 != null) {
                                i7 = Integer.parseInt(attributeValue4);
                                zzaoxVar = zzaoxVar3;
                            } else {
                                zzaoxVar = zzaoxVar3;
                                i7 = i12;
                            }
                            zzaox zzaoxVar5 = new zzaox(parseInt * f6, i11, i7);
                            String attributeValue5 = newPullParser.getAttributeValue(str14, "cellResolution");
                            if (attributeValue5 != null) {
                                Matcher matcher = zzg.matcher(attributeValue5);
                                if (matcher.matches()) {
                                    try {
                                        group = matcher.group(1);
                                    } catch (NumberFormatException unused) {
                                        str2 = str14;
                                    }
                                    if (group == null) {
                                        throw null;
                                    }
                                    String str17 = group;
                                    int parseInt2 = Integer.parseInt(group);
                                    str2 = str14;
                                    try {
                                        group2 = matcher.group(2);
                                    } catch (NumberFormatException unused2) {
                                        zzaoxVar4 = zzaoxVar5;
                                        zzeh.zzc("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                        i10 = 15;
                                        zzc8 = zzfv.zzc(newPullParser, "extent");
                                        if (zzc8 != null) {
                                        }
                                        zzaoyVar2 = null;
                                        zzaoyVar = zzaoyVar2;
                                        i3 = i10;
                                        String str18 = "image";
                                        String str19 = "metadata";
                                        String str20 = "region";
                                        String str21 = "head";
                                        zzaoxVar4 = zzaoxVar4;
                                        if (!name.equals("tt")) {
                                            String name2 = newPullParser.getName();
                                            StringBuilder sb = new StringBuilder(String.valueOf(name2).length() + 26);
                                            sb.append(str15);
                                            sb.append(name2);
                                            zzeh.zzb("TtmlParser", sb.toString());
                                            str3 = str15;
                                            zzaoyVar2 = zzaoyVar;
                                            hashMap = hashMap5;
                                            i10 = i3;
                                            zzapdVar2 = zzapdVar;
                                            arrayDeque = arrayDeque2;
                                            i9 = 1;
                                            newPullParser.next();
                                            eventType = newPullParser.getEventType();
                                            arrayDeque3 = arrayDeque;
                                            hashMap5 = hashMap;
                                            str13 = str;
                                            zzaoxVar3 = zzaoxVar;
                                            str14 = str2;
                                            str15 = str3;
                                        }
                                        if ("head".equals(name)) {
                                        }
                                        zzaoyVar2 = zzaoyVar;
                                        zzaoxVar4 = zzaoxVar2;
                                        i10 = i3;
                                        zzapdVar2 = zzapdVar;
                                        newPullParser.next();
                                        eventType = newPullParser.getEventType();
                                        arrayDeque3 = arrayDeque;
                                        hashMap5 = hashMap;
                                        str13 = str;
                                        zzaoxVar3 = zzaoxVar;
                                        str14 = str2;
                                        str15 = str3;
                                    }
                                    if (group2 == null) {
                                        throw null;
                                    }
                                    String str22 = group2;
                                    int parseInt3 = Integer.parseInt(group2);
                                    if (parseInt2 == 0) {
                                        i8 = parseInt3;
                                        zzaoxVar4 = zzaoxVar5;
                                        z = false;
                                    } else if (parseInt3 != 0) {
                                        i8 = parseInt3;
                                        zzaoxVar4 = zzaoxVar5;
                                        z = true;
                                    } else {
                                        zzaoxVar4 = zzaoxVar5;
                                        z = false;
                                        i8 = 0;
                                    }
                                    try {
                                        zzguk.zzg(z, "Invalid cell resolution %s %s", parseInt2, i8);
                                        i10 = i8;
                                    } catch (NumberFormatException unused3) {
                                        zzeh.zzc("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                        i10 = 15;
                                        zzc8 = zzfv.zzc(newPullParser, "extent");
                                        if (zzc8 != null) {
                                        }
                                        zzaoyVar2 = null;
                                        zzaoyVar = zzaoyVar2;
                                        i3 = i10;
                                        String str182 = "image";
                                        String str192 = "metadata";
                                        String str202 = "region";
                                        String str212 = "head";
                                        zzaoxVar4 = zzaoxVar4;
                                        if (!name.equals("tt")) {
                                        }
                                        if ("head".equals(name)) {
                                        }
                                        zzaoyVar2 = zzaoyVar;
                                        zzaoxVar4 = zzaoxVar2;
                                        i10 = i3;
                                        zzapdVar2 = zzapdVar;
                                        newPullParser.next();
                                        eventType = newPullParser.getEventType();
                                        arrayDeque3 = arrayDeque;
                                        hashMap5 = hashMap;
                                        str13 = str;
                                        zzaoxVar3 = zzaoxVar;
                                        str14 = str2;
                                        str15 = str3;
                                    }
                                    zzc8 = zzfv.zzc(newPullParser, "extent");
                                    if (zzc8 != null) {
                                        Matcher matcher2 = zzf.matcher(zzc8);
                                        if (matcher2.matches()) {
                                            try {
                                                String group3 = matcher2.group(1);
                                                if (group3 == null) {
                                                    throw null;
                                                }
                                                String str23 = group3;
                                                int parseInt4 = Integer.parseInt(group3);
                                                String group4 = matcher2.group(2);
                                                if (group4 == null) {
                                                    throw null;
                                                }
                                                String str24 = group4;
                                                zzaoyVar2 = new zzaoy(parseInt4, Integer.parseInt(group4));
                                            } catch (NumberFormatException unused4) {
                                                zzeh.zzc("TtmlParser", "Ignoring malformed tts extent: ".concat(zzc8));
                                            }
                                        } else {
                                            zzeh.zzc("TtmlParser", "Ignoring non-pixel tts extent: ".concat(zzc8));
                                        }
                                    }
                                    zzaoyVar2 = null;
                                } else {
                                    zzeh.zzc("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                }
                            }
                            str2 = str14;
                            zzaoxVar4 = zzaoxVar5;
                            i10 = 15;
                            zzc8 = zzfv.zzc(newPullParser, "extent");
                            if (zzc8 != null) {
                            }
                            zzaoyVar2 = null;
                        } else {
                            str2 = str14;
                            arrayDeque2 = arrayDeque3;
                            zzaoxVar = zzaoxVar3;
                            zzapdVar = zzapdVar2;
                        }
                        zzaoyVar = zzaoyVar2;
                        i3 = i10;
                        String str1822 = "image";
                        String str1922 = "metadata";
                        String str2022 = "region";
                        String str2122 = "head";
                        zzaoxVar4 = zzaoxVar4;
                        if (!name.equals("tt") && !name.equals("head") && !name.equals("body") && !name.equals("div") && !name.equals("p") && !name.equals("span") && !name.equals("br") && !name.equals("style") && !name.equals("styling") && !name.equals("layout") && !name.equals("region") && !name.equals("metadata") && !name.equals("image") && !name.equals("data") && !name.equals("information")) {
                            String name22 = newPullParser.getName();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(name22).length() + 26);
                            sb2.append(str15);
                            sb2.append(name22);
                            zzeh.zzb("TtmlParser", sb2.toString());
                            str3 = str15;
                            zzaoyVar2 = zzaoyVar;
                            hashMap = hashMap5;
                            i10 = i3;
                            zzapdVar2 = zzapdVar;
                            arrayDeque = arrayDeque2;
                            i9 = 1;
                        }
                        if ("head".equals(name)) {
                            while (true) {
                                newPullParser.next();
                                if (zzfv.zzb(newPullParser, "style")) {
                                    String zzc9 = zzfv.zzc(newPullParser, "style");
                                    zzapc zzd2 = zzd(newPullParser, new zzapc());
                                    if (zzc9 != null) {
                                        String[] zzc10 = zzc(zzc9);
                                        str3 = str15;
                                        str12 = str2122;
                                        int i13 = 0;
                                        for (int length = zzc10.length; i13 < length; length = length) {
                                            zzd2.zzr((zzapc) hashMap3.get(zzc10[i13]));
                                            i13++;
                                        }
                                    } else {
                                        str3 = str15;
                                        str12 = str2122;
                                    }
                                    String zzt = zzd2.zzt();
                                    if (zzt != null) {
                                        hashMap3.put(zzt, zzd2);
                                    }
                                    str4 = str1922;
                                    str5 = str2022;
                                    str7 = str12;
                                    hashMap = hashMap5;
                                    str6 = str1822;
                                } else {
                                    str3 = str15;
                                    String str25 = str2122;
                                    if (zzfv.zzb(newPullParser, str2022)) {
                                        str5 = str2022;
                                        HashMap hashMap6 = hashMap5;
                                        String zzc11 = zzfv.zzc(newPullParser, "id");
                                        if (zzc11 == null) {
                                            hashMap2 = hashMap4;
                                            str10 = str1822;
                                            str11 = str1922;
                                        } else {
                                            String zzc12 = zzfv.zzc(newPullParser, "origin");
                                            if (zzc12 == null) {
                                                str8 = zzc12;
                                                String zzc13 = zzfv.zzc(newPullParser, "style");
                                                if (zzc13 != null && (zzapcVar3 = (zzapc) hashMap3.get(zzc13)) != null) {
                                                    str9 = zzapcVar3.zzL();
                                                    if (str9 == null) {
                                                        str10 = str1822;
                                                        Matcher matcher3 = zzb.matcher(str9);
                                                        str11 = str1922;
                                                        Matcher matcher4 = zzf.matcher(str9);
                                                        if (matcher3.matches()) {
                                                            hashMap2 = hashMap4;
                                                            try {
                                                                String group5 = matcher3.group(1);
                                                                if (group5 == null) {
                                                                    throw null;
                                                                }
                                                                String str26 = group5;
                                                                f2 = Float.parseFloat(group5) / 100.0f;
                                                                String group6 = matcher3.group(2);
                                                                if (group6 == null) {
                                                                    throw null;
                                                                }
                                                                String str27 = group6;
                                                                f = Float.parseFloat(group6) / 100.0f;
                                                            } catch (NumberFormatException unused5) {
                                                                zzeh.zzc("TtmlParser", "Ignoring region with malformed origin: ".concat(str9));
                                                            }
                                                        } else {
                                                            hashMap2 = hashMap4;
                                                            if (!matcher4.matches()) {
                                                                zzeh.zzc("TtmlParser", "Ignoring region with unsupported origin: ".concat(str9));
                                                            } else if (zzaoyVar == null) {
                                                                zzeh.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(str9));
                                                            } else {
                                                                try {
                                                                    String group7 = matcher4.group(1);
                                                                    if (group7 == null) {
                                                                        throw null;
                                                                    }
                                                                    String str28 = group7;
                                                                    int parseInt5 = Integer.parseInt(group7);
                                                                    String group8 = matcher4.group(2);
                                                                    if (group8 == null) {
                                                                        throw null;
                                                                    }
                                                                    String str29 = group8;
                                                                    f2 = parseInt5 / zzaoyVar.zza;
                                                                    f = Integer.parseInt(group8) / zzaoyVar.zzb;
                                                                } catch (NumberFormatException unused6) {
                                                                    zzeh.zzc("TtmlParser", "Ignoring region with malformed origin: ".concat(str9));
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        hashMap2 = hashMap4;
                                                        str10 = str1822;
                                                        str11 = str1922;
                                                        f = 0.0f;
                                                        f2 = 0.0f;
                                                    }
                                                    float f7 = f2;
                                                    zzc3 = zzfv.zzc(newPullParser, "extent");
                                                    if (zzc3 == null && (zzc7 = zzfv.zzc(newPullParser, "style")) != null && (zzapcVar2 = (zzapc) hashMap3.get(zzc7)) != null) {
                                                        zzc3 = zzapcVar2.zzN();
                                                    }
                                                    if (zzc3 == null) {
                                                        Matcher matcher5 = zzb.matcher(zzc3);
                                                        Matcher matcher6 = zzf.matcher(zzc3);
                                                        if (matcher5.matches()) {
                                                            try {
                                                                String group9 = matcher5.group(1);
                                                                if (group9 == null) {
                                                                    throw null;
                                                                }
                                                                String str30 = group9;
                                                                float parseFloat = Float.parseFloat(group9) / 100.0f;
                                                                String group10 = matcher5.group(2);
                                                                if (group10 == null) {
                                                                    throw null;
                                                                }
                                                                String str31 = group10;
                                                                f4 = Float.parseFloat(group10) / 100.0f;
                                                                f3 = parseFloat;
                                                            } catch (NumberFormatException unused7) {
                                                                String.valueOf(str9);
                                                                zzeh.zzc("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(str9)));
                                                            }
                                                        } else if (!matcher6.matches()) {
                                                            String.valueOf(str9);
                                                            zzeh.zzc("TtmlParser", "Ignoring region with unsupported extent: ".concat(String.valueOf(str9)));
                                                        } else if (zzaoyVar == null) {
                                                            String.valueOf(str9);
                                                            zzeh.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(String.valueOf(str9)));
                                                        } else {
                                                            try {
                                                                String group11 = matcher6.group(1);
                                                                if (group11 == null) {
                                                                    throw null;
                                                                }
                                                                String str32 = group11;
                                                                int parseInt6 = Integer.parseInt(group11);
                                                                String group12 = matcher6.group(2);
                                                                if (group12 == null) {
                                                                    throw null;
                                                                }
                                                                String str33 = group12;
                                                                f4 = Integer.parseInt(group12) / zzaoyVar.zzb;
                                                                f3 = parseInt6 / zzaoyVar.zza;
                                                            } catch (NumberFormatException unused8) {
                                                                String.valueOf(str9);
                                                                zzeh.zzc("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(str9)));
                                                            }
                                                        }
                                                    } else {
                                                        f3 = 1.0f;
                                                        f4 = 1.0f;
                                                    }
                                                    zzc4 = zzfv.zzc(newPullParser, "displayAlign");
                                                    if (zzc4 == null && (zzc6 = zzfv.zzc(newPullParser, "style")) != null && (zzapcVar = (zzapc) hashMap3.get(zzc6)) != null) {
                                                        zzc4 = zzapcVar.zzP();
                                                    }
                                                    if (zzc4 != null) {
                                                        String zza2 = zzgts.zza(zzc4);
                                                        int hashCode = zza2.hashCode();
                                                        if (hashCode != -1364013995) {
                                                            if (hashCode == 92734940 && zza2.equals("after")) {
                                                                c3 = 1;
                                                                if (c3 != 0) {
                                                                    f5 = f + (f4 / 2.0f);
                                                                    i5 = 1;
                                                                } else if (c3 == 1) {
                                                                    f5 = f + f4;
                                                                    i5 = 2;
                                                                }
                                                                float f8 = 1.0f / i3;
                                                                zzc5 = zzfv.zzc(newPullParser, "writingMode");
                                                                if (zzc5 != null) {
                                                                    String zza3 = zzgts.zza(zzc5);
                                                                    int hashCode2 = zza3.hashCode();
                                                                    if (hashCode2 == 3694) {
                                                                        if (zza3.equals("tb")) {
                                                                            c2 = 0;
                                                                            if (c2 != 0) {
                                                                            }
                                                                            i6 = 2;
                                                                            zzapaVar = new zzapa(zzc11, f7, f5, 0, i5, f3, f4, 1, f8, i6);
                                                                            if (zzapaVar != null) {
                                                                            }
                                                                            str7 = str25;
                                                                            hashMap = hashMap6;
                                                                            str6 = str10;
                                                                            str4 = str11;
                                                                        }
                                                                        c2 = 65535;
                                                                        if (c2 != 0) {
                                                                        }
                                                                        i6 = 2;
                                                                        zzapaVar = new zzapa(zzc11, f7, f5, 0, i5, f3, f4, 1, f8, i6);
                                                                        if (zzapaVar != null) {
                                                                        }
                                                                        str7 = str25;
                                                                        hashMap = hashMap6;
                                                                        str6 = str10;
                                                                        str4 = str11;
                                                                    } else if (hashCode2 != 3553396) {
                                                                        if (hashCode2 == 3553576 && zza3.equals("tbrl")) {
                                                                            c2 = 2;
                                                                            if (c2 != 0 || c2 == 1) {
                                                                                i6 = 2;
                                                                            } else if (c2 == 2) {
                                                                                i6 = 1;
                                                                            }
                                                                            zzapaVar = new zzapa(zzc11, f7, f5, 0, i5, f3, f4, 1, f8, i6);
                                                                            if (zzapaVar != null) {
                                                                                hashMap4 = hashMap2;
                                                                                hashMap4.put(zzapaVar.zza, zzapaVar);
                                                                            } else {
                                                                                hashMap4 = hashMap2;
                                                                            }
                                                                            str7 = str25;
                                                                            hashMap = hashMap6;
                                                                            str6 = str10;
                                                                            str4 = str11;
                                                                        }
                                                                        c2 = 65535;
                                                                        if (c2 != 0) {
                                                                        }
                                                                        i6 = 2;
                                                                        zzapaVar = new zzapa(zzc11, f7, f5, 0, i5, f3, f4, 1, f8, i6);
                                                                        if (zzapaVar != null) {
                                                                        }
                                                                        str7 = str25;
                                                                        hashMap = hashMap6;
                                                                        str6 = str10;
                                                                        str4 = str11;
                                                                    } else {
                                                                        if (zza3.equals("tblr")) {
                                                                            c2 = 1;
                                                                            if (c2 != 0) {
                                                                            }
                                                                            i6 = 2;
                                                                            zzapaVar = new zzapa(zzc11, f7, f5, 0, i5, f3, f4, 1, f8, i6);
                                                                            if (zzapaVar != null) {
                                                                            }
                                                                            str7 = str25;
                                                                            hashMap = hashMap6;
                                                                            str6 = str10;
                                                                            str4 = str11;
                                                                        }
                                                                        c2 = 65535;
                                                                        if (c2 != 0) {
                                                                        }
                                                                        i6 = 2;
                                                                        zzapaVar = new zzapa(zzc11, f7, f5, 0, i5, f3, f4, 1, f8, i6);
                                                                        if (zzapaVar != null) {
                                                                        }
                                                                        str7 = str25;
                                                                        hashMap = hashMap6;
                                                                        str6 = str10;
                                                                        str4 = str11;
                                                                    }
                                                                }
                                                                i6 = Integer.MIN_VALUE;
                                                                zzapaVar = new zzapa(zzc11, f7, f5, 0, i5, f3, f4, 1, f8, i6);
                                                                if (zzapaVar != null) {
                                                                }
                                                                str7 = str25;
                                                                hashMap = hashMap6;
                                                                str6 = str10;
                                                                str4 = str11;
                                                            }
                                                            c3 = 65535;
                                                            if (c3 != 0) {
                                                            }
                                                            float f82 = 1.0f / i3;
                                                            zzc5 = zzfv.zzc(newPullParser, "writingMode");
                                                            if (zzc5 != null) {
                                                            }
                                                            i6 = Integer.MIN_VALUE;
                                                            zzapaVar = new zzapa(zzc11, f7, f5, 0, i5, f3, f4, 1, f82, i6);
                                                            if (zzapaVar != null) {
                                                            }
                                                            str7 = str25;
                                                            hashMap = hashMap6;
                                                            str6 = str10;
                                                            str4 = str11;
                                                        } else {
                                                            if (zza2.equals("center")) {
                                                                c3 = 0;
                                                                if (c3 != 0) {
                                                                }
                                                                float f822 = 1.0f / i3;
                                                                zzc5 = zzfv.zzc(newPullParser, "writingMode");
                                                                if (zzc5 != null) {
                                                                }
                                                                i6 = Integer.MIN_VALUE;
                                                                zzapaVar = new zzapa(zzc11, f7, f5, 0, i5, f3, f4, 1, f822, i6);
                                                                if (zzapaVar != null) {
                                                                }
                                                                str7 = str25;
                                                                hashMap = hashMap6;
                                                                str6 = str10;
                                                                str4 = str11;
                                                            }
                                                            c3 = 65535;
                                                            if (c3 != 0) {
                                                            }
                                                            float f8222 = 1.0f / i3;
                                                            zzc5 = zzfv.zzc(newPullParser, "writingMode");
                                                            if (zzc5 != null) {
                                                            }
                                                            i6 = Integer.MIN_VALUE;
                                                            zzapaVar = new zzapa(zzc11, f7, f5, 0, i5, f3, f4, 1, f8222, i6);
                                                            if (zzapaVar != null) {
                                                            }
                                                            str7 = str25;
                                                            hashMap = hashMap6;
                                                            str6 = str10;
                                                            str4 = str11;
                                                        }
                                                    }
                                                    f5 = f;
                                                    i5 = 0;
                                                    float f82222 = 1.0f / i3;
                                                    zzc5 = zzfv.zzc(newPullParser, "writingMode");
                                                    if (zzc5 != null) {
                                                    }
                                                    i6 = Integer.MIN_VALUE;
                                                    zzapaVar = new zzapa(zzc11, f7, f5, 0, i5, f3, f4, 1, f82222, i6);
                                                    if (zzapaVar != null) {
                                                    }
                                                    str7 = str25;
                                                    hashMap = hashMap6;
                                                    str6 = str10;
                                                    str4 = str11;
                                                }
                                            } else {
                                                str8 = zzc12;
                                            }
                                            str9 = str8;
                                            if (str9 == null) {
                                            }
                                            float f72 = f2;
                                            zzc3 = zzfv.zzc(newPullParser, "extent");
                                            if (zzc3 == null) {
                                                zzc3 = zzapcVar2.zzN();
                                            }
                                            if (zzc3 == null) {
                                            }
                                            zzc4 = zzfv.zzc(newPullParser, "displayAlign");
                                            if (zzc4 == null) {
                                                zzc4 = zzapcVar.zzP();
                                            }
                                            if (zzc4 != null) {
                                            }
                                            f5 = f;
                                            i5 = 0;
                                            float f822222 = 1.0f / i3;
                                            zzc5 = zzfv.zzc(newPullParser, "writingMode");
                                            if (zzc5 != null) {
                                            }
                                            i6 = Integer.MIN_VALUE;
                                            zzapaVar = new zzapa(zzc11, f72, f5, 0, i5, f3, f4, 1, f822222, i6);
                                            if (zzapaVar != null) {
                                            }
                                            str7 = str25;
                                            hashMap = hashMap6;
                                            str6 = str10;
                                            str4 = str11;
                                        }
                                        zzapaVar = null;
                                        if (zzapaVar != null) {
                                        }
                                        str7 = str25;
                                        hashMap = hashMap6;
                                        str6 = str10;
                                        str4 = str11;
                                    } else {
                                        HashMap hashMap7 = hashMap5;
                                        String str34 = str1822;
                                        str4 = str1922;
                                        str5 = str2022;
                                        if (zzfv.zzb(newPullParser, str4)) {
                                            while (true) {
                                                newPullParser.next();
                                                str6 = str34;
                                                if (!zzfv.zzb(newPullParser, str6) || (zzc2 = zzfv.zzc(newPullParser, "id")) == null) {
                                                    hashMap = hashMap7;
                                                } else {
                                                    hashMap = hashMap7;
                                                    hashMap.put(zzc2, newPullParser.nextText());
                                                }
                                                if (!zzfv.zza(newPullParser, str4)) {
                                                    str34 = str6;
                                                    hashMap7 = hashMap;
                                                }
                                            }
                                        } else {
                                            hashMap = hashMap7;
                                            str6 = str34;
                                        }
                                        str7 = str25;
                                    }
                                }
                                if (zzfv.zza(newPullParser, str7)) {
                                    zzaoxVar2 = zzaoxVar4;
                                    arrayDeque = arrayDeque2;
                                } else {
                                    str2122 = str7;
                                    str1822 = str6;
                                    hashMap5 = hashMap;
                                    str2022 = str5;
                                    str15 = str3;
                                    str1922 = str4;
                                }
                            }
                        } else {
                            str3 = str15;
                            hashMap = hashMap5;
                            Object obj2 = "region";
                            try {
                                i4 = newPullParser.getAttributeCount();
                                zzapc zzd3 = zzd(newPullParser, null);
                                String str35 = str;
                                int i14 = 0;
                                long j4 = -9223372036854775807L;
                                long j5 = -9223372036854775807L;
                                long j6 = -9223372036854775807L;
                                String[] strArr = null;
                                String str36 = null;
                                while (i14 < i4) {
                                    try {
                                        String attributeName = newPullParser.getAttributeName(i14);
                                        String attributeValue6 = newPullParser.getAttributeValue(i14);
                                        int i15 = i4;
                                        switch (attributeName.hashCode()) {
                                            case -934795532:
                                                obj = obj2;
                                                if (attributeName.equals(obj)) {
                                                    c = 4;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 99841:
                                                if (attributeName.equals("dur")) {
                                                    obj = obj2;
                                                    c = 2;
                                                    break;
                                                }
                                                obj = obj2;
                                                c = 65535;
                                                break;
                                            case 100571:
                                                if (attributeName.equals("end")) {
                                                    obj = obj2;
                                                    c = 1;
                                                    break;
                                                }
                                                obj = obj2;
                                                c = 65535;
                                                break;
                                            case 93616297:
                                                if (attributeName.equals("begin")) {
                                                    obj = obj2;
                                                    c = 0;
                                                    break;
                                                }
                                                obj = obj2;
                                                c = 65535;
                                                break;
                                            case 109780401:
                                                if (attributeName.equals("style")) {
                                                    obj = obj2;
                                                    c = 3;
                                                    break;
                                                }
                                                obj = obj2;
                                                c = 65535;
                                                break;
                                            case 1292595405:
                                                if (attributeName.equals("backgroundImage")) {
                                                    obj = obj2;
                                                    c = 5;
                                                    break;
                                                }
                                                obj = obj2;
                                                c = 65535;
                                                break;
                                            default:
                                                obj = obj2;
                                                c = 65535;
                                                break;
                                        }
                                        if (c == 0) {
                                            zzaoxVar2 = zzaoxVar4;
                                            j5 = zzg(attributeValue6, zzaoxVar2);
                                        } else if (c == 1) {
                                            zzaoxVar2 = zzaoxVar4;
                                            j4 = zzg(attributeValue6, zzaoxVar2);
                                        } else if (c != 2) {
                                            if (c == 3) {
                                                String[] zzc14 = zzc(attributeValue6);
                                                if (zzc14.length > 0) {
                                                    strArr = zzc14;
                                                }
                                            } else if (c != 4) {
                                                if (c == 5) {
                                                    try {
                                                        if (attributeValue6.startsWith("#")) {
                                                            i4 = 1;
                                                            try {
                                                                str36 = attributeValue6.substring(1);
                                                            } catch (zzanv e) {
                                                                e = e;
                                                                zzanvVar = e;
                                                                zzaoxVar2 = zzaoxVar4;
                                                                arrayDeque = arrayDeque2;
                                                                zzeh.zzd("TtmlParser", "Suppressing parser error", zzanvVar);
                                                                i9 = i4;
                                                                zzaoyVar2 = zzaoyVar;
                                                                zzaoxVar4 = zzaoxVar2;
                                                                i10 = i3;
                                                                zzapdVar2 = zzapdVar;
                                                                newPullParser.next();
                                                                eventType = newPullParser.getEventType();
                                                                arrayDeque3 = arrayDeque;
                                                                hashMap5 = hashMap;
                                                                str13 = str;
                                                                zzaoxVar3 = zzaoxVar;
                                                                str14 = str2;
                                                                str15 = str3;
                                                            }
                                                        }
                                                    } catch (zzanv e2) {
                                                        e = e2;
                                                        i4 = 1;
                                                    }
                                                }
                                            } else if (hashMap4.containsKey(attributeValue6)) {
                                                str35 = attributeValue6;
                                            }
                                            zzaoxVar2 = zzaoxVar4;
                                        } else {
                                            zzaoxVar2 = zzaoxVar4;
                                            i4 = 1;
                                            try {
                                                j6 = zzg(attributeValue6, zzaoxVar2);
                                            } catch (zzanv e3) {
                                                e = e3;
                                                zzanvVar = e;
                                                arrayDeque = arrayDeque2;
                                                zzeh.zzd("TtmlParser", "Suppressing parser error", zzanvVar);
                                                i9 = i4;
                                                zzaoyVar2 = zzaoyVar;
                                                zzaoxVar4 = zzaoxVar2;
                                                i10 = i3;
                                                zzapdVar2 = zzapdVar;
                                                newPullParser.next();
                                                eventType = newPullParser.getEventType();
                                                arrayDeque3 = arrayDeque;
                                                hashMap5 = hashMap;
                                                str13 = str;
                                                zzaoxVar3 = zzaoxVar;
                                                str14 = str2;
                                                str15 = str3;
                                            }
                                        }
                                        i14++;
                                        zzaoxVar4 = zzaoxVar2;
                                        obj2 = obj;
                                        i4 = i15;
                                    } catch (zzanv e4) {
                                        e = e4;
                                        zzaoxVar2 = zzaoxVar4;
                                        i4 = 1;
                                    }
                                }
                                zzaoxVar2 = zzaoxVar4;
                                i4 = 1;
                                try {
                                    try {
                                        if (zzaowVar3 != null) {
                                            zzaowVar = zzaowVar3;
                                            long j7 = zzaowVar.zzd;
                                            if (j7 != -9223372036854775807L) {
                                                j = j5 != -9223372036854775807L ? j5 + j7 : -9223372036854775807L;
                                                if (j4 != -9223372036854775807L) {
                                                    j4 += j7;
                                                    zzaowVar2 = zzaowVar;
                                                } else {
                                                    zzaowVar2 = zzaowVar;
                                                    j2 = -9223372036854775807L;
                                                    j4 = -9223372036854775807L;
                                                    if (j4 == j2) {
                                                        if (j6 != j2) {
                                                            j3 = j + j6;
                                                        } else {
                                                            if (zzaowVar2 != null) {
                                                                j4 = zzaowVar2.zze;
                                                            }
                                                            j3 = j2;
                                                        }
                                                        zzaow zzb2 = zzaow.zzb(newPullParser.getName(), j, j3, zzd3, strArr, str35, str36, zzaowVar2);
                                                        arrayDeque = arrayDeque2;
                                                        arrayDeque.push(zzb2);
                                                        if (zzaowVar != null) {
                                                            zzaowVar.zzd(zzb2);
                                                        }
                                                    }
                                                    j3 = j4;
                                                    zzaow zzb22 = zzaow.zzb(newPullParser.getName(), j, j3, zzd3, strArr, str35, str36, zzaowVar2);
                                                    arrayDeque = arrayDeque2;
                                                    arrayDeque.push(zzb22);
                                                    if (zzaowVar != null) {
                                                    }
                                                }
                                            } else {
                                                zzaowVar2 = zzaowVar;
                                                j = j5;
                                            }
                                        } else {
                                            zzaowVar = zzaowVar3;
                                            j = j5;
                                            zzaowVar2 = null;
                                        }
                                        arrayDeque.push(zzb22);
                                        if (zzaowVar != null) {
                                        }
                                    } catch (zzanv e5) {
                                        e = e5;
                                        zzanvVar = e;
                                        zzeh.zzd("TtmlParser", "Suppressing parser error", zzanvVar);
                                        i9 = i4;
                                        zzaoyVar2 = zzaoyVar;
                                        zzaoxVar4 = zzaoxVar2;
                                        i10 = i3;
                                        zzapdVar2 = zzapdVar;
                                        newPullParser.next();
                                        eventType = newPullParser.getEventType();
                                        arrayDeque3 = arrayDeque;
                                        hashMap5 = hashMap;
                                        str13 = str;
                                        zzaoxVar3 = zzaoxVar;
                                        str14 = str2;
                                        str15 = str3;
                                    }
                                    zzaow zzb222 = zzaow.zzb(newPullParser.getName(), j, j3, zzd3, strArr, str35, str36, zzaowVar2);
                                    arrayDeque = arrayDeque2;
                                } catch (zzanv e6) {
                                    e = e6;
                                    arrayDeque = arrayDeque2;
                                }
                                j2 = -9223372036854775807L;
                                if (j4 == j2) {
                                }
                                j3 = j4;
                            } catch (zzanv e7) {
                                e = e7;
                                zzaoxVar2 = zzaoxVar4;
                                arrayDeque = arrayDeque2;
                                i4 = 1;
                            }
                        }
                        zzaoyVar2 = zzaoyVar;
                        zzaoxVar4 = zzaoxVar2;
                        i10 = i3;
                    } else {
                        str2 = str14;
                        str3 = str15;
                        zzaoxVar = zzaoxVar3;
                        zzapdVar = zzapdVar2;
                        hashMap = hashMap5;
                        arrayDeque = arrayDeque3;
                        if (eventType == 4) {
                            if (zzaowVar3 == null) {
                                throw null;
                            }
                            zzaow zzaowVar4 = zzaowVar3;
                            zzaowVar3.zzd(zzaow.zza(newPullParser.getText()));
                        } else if (eventType == 3) {
                            if (newPullParser.getName().equals("tt")) {
                                zzaow zzaowVar5 = (zzaow) arrayDeque.peek();
                                if (zzaowVar5 == null) {
                                    throw null;
                                }
                                zzaow zzaowVar6 = zzaowVar5;
                                zzapdVar2 = new zzapd(zzaowVar5, hashMap3, hashMap4, hashMap);
                            } else {
                                zzapdVar2 = zzapdVar;
                            }
                            arrayDeque.pop();
                        }
                    }
                    newPullParser.next();
                    eventType = newPullParser.getEventType();
                    arrayDeque3 = arrayDeque;
                    hashMap5 = hashMap;
                    str13 = str;
                    zzaoxVar3 = zzaoxVar;
                    str14 = str2;
                    str15 = str3;
                } else {
                    str = str13;
                    str2 = str14;
                    str3 = str15;
                    arrayDeque = arrayDeque3;
                    zzaoxVar = zzaoxVar3;
                    zzapdVar = zzapdVar2;
                    hashMap = hashMap5;
                    if (eventType == 2) {
                        i9++;
                    } else if (eventType == 3) {
                        i9--;
                    }
                }
                zzapdVar2 = zzapdVar;
                newPullParser.next();
                eventType = newPullParser.getEventType();
                arrayDeque3 = arrayDeque;
                hashMap5 = hashMap;
                str13 = str;
                zzaoxVar3 = zzaoxVar;
                str14 = str2;
                str15 = str3;
            }
            zzapd zzapdVar3 = zzapdVar2;
            if (zzapdVar3 != null) {
                return zzapdVar3;
            }
            throw null;
        } catch (IOException e8) {
            throw new IllegalStateException("Unexpected error when reading input.", e8);
        } catch (XmlPullParserException e9) {
            throw new IllegalStateException("Unable to decode source", e9);
        }
    }

    public zzaoz() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.zzi = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }
}
