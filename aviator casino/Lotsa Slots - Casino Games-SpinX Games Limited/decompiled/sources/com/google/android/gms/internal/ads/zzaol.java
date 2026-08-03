package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaol implements com.google.android.gms.internal.ads.zzanl {
    private final org.xmlpull.v1.XmlPullParserFactory zzi;
    private static final java.util.regex.Pattern zzc = java.util.regex.Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final java.util.regex.Pattern zzd = java.util.regex.Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final java.util.regex.Pattern zze = java.util.regex.Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final java.util.regex.Pattern zzb = java.util.regex.Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final java.util.regex.Pattern zzf = java.util.regex.Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final java.util.regex.Pattern zzg = java.util.regex.Pattern.compile("^(\\d+) (\\d+)$");
    private static final com.google.android.gms.internal.ads.zzaoj zzh = new com.google.android.gms.internal.ads.zzaoj(30.0f, 1, 1);

    private static java.lang.String[] zzc(java.lang.String str) {
        java.lang.String trim = str.trim();
        if (trim.isEmpty()) {
            return new java.lang.String[0];
        }
        java.lang.String str2 = com.google.android.gms.internal.ads.zzfl.zza;
        return trim.split("\\s+", -1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static com.google.android.gms.internal.ads.zzaoo zzd(org.xmlpull.v1.XmlPullParser xmlPullParser, com.google.android.gms.internal.ads.zzaoo zzaooVar) {
        char c;
        java.util.regex.Matcher matcher;
        char c2;
        int attributeCount = xmlPullParser.getAttributeCount();
        boolean z = false;
        com.google.android.gms.internal.ads.zzaoo zzaooVar2 = zzaooVar;
        int i = 0;
        while (i < attributeCount) {
            java.lang.String attributeValue = xmlPullParser.getAttributeValue(i);
            java.lang.String attributeName = xmlPullParser.getAttributeName(i);
            char c3 = 65535;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1289044182:
                    if (attributeName.equals("extent")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -1008619738:
                    if (attributeName.equals("origin")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        c = '\b';
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
                    if (!"style".equals(xmlPullParser.getName())) {
                        break;
                    } else {
                        zzaooVar2 = zze(zzaooVar2);
                        zzaooVar2.zzs(attributeValue);
                        break;
                    }
                case 1:
                    zzaooVar2 = zze(zzaooVar2);
                    try {
                        zzaooVar2.zzn(com.google.android.gms.internal.ads.zzdr.zza(attributeValue));
                        break;
                    } catch (java.lang.IllegalArgumentException unused) {
                        java.lang.String.valueOf(attributeValue);
                        com.google.android.gms.internal.ads.zzeg.zzc("TtmlParser", "Failed parsing background value: ".concat(java.lang.String.valueOf(attributeValue)));
                        break;
                    }
                case 2:
                    zzaooVar2 = zze(zzaooVar2);
                    try {
                        zzaooVar2.zzk(com.google.android.gms.internal.ads.zzdr.zza(attributeValue));
                        break;
                    } catch (java.lang.IllegalArgumentException unused2) {
                        java.lang.String.valueOf(attributeValue);
                        com.google.android.gms.internal.ads.zzeg.zzc("TtmlParser", "Failed parsing color value: ".concat(java.lang.String.valueOf(attributeValue)));
                        break;
                    }
                case 3:
                    zzaooVar2 = zze(zzaooVar2);
                    zzaooVar2.zzi(attributeValue);
                    break;
                case 4:
                    try {
                        zzaooVar2 = zze(zzaooVar2);
                        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
                        java.lang.String[] split = attributeValue.split("\\s+", -1);
                        int length = split.length;
                        if (length == 1) {
                            matcher = zze.matcher(attributeValue);
                        } else {
                            if (length != 2) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(length).length() + 41);
                                sb.append("Invalid number of entries for fontSize: ");
                                sb.append(length);
                                sb.append(".");
                                throw new com.google.android.gms.internal.ads.zzanh(sb.toString());
                            }
                            matcher = zze.matcher(split[1]);
                            com.google.android.gms.internal.ads.zzeg.zzc("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                        }
                        if (!matcher.matches()) {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(attributeValue).length() + 36);
                            sb2.append("Invalid expression for fontSize: '");
                            sb2.append(attributeValue);
                            sb2.append("'.");
                            throw new com.google.android.gms.internal.ads.zzanh(sb2.toString());
                        }
                        java.lang.String group = matcher.group(3);
                        group.getClass();
                        java.lang.String str2 = group;
                        int hashCode = group.hashCode();
                        if (hashCode == 37) {
                            if (group.equals("%")) {
                                c2 = 2;
                            }
                            c2 = 65535;
                        } else if (hashCode != 3240) {
                            if (hashCode == 3592 && group.equals("px")) {
                                c2 = 0;
                            }
                            c2 = 65535;
                        } else {
                            if (group.equals(com.facebook.appevents.UserDataStore.EMAIL)) {
                                c2 = 1;
                            }
                            c2 = 65535;
                        }
                        if (c2 == 0) {
                            zzaooVar2.zzH(1);
                        } else if (c2 == 1) {
                            zzaooVar2.zzH(2);
                        } else {
                            if (c2 != 2) {
                                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(group.length() + 30);
                                sb3.append("Invalid unit for fontSize: '");
                                sb3.append(group);
                                sb3.append("'.");
                                throw new com.google.android.gms.internal.ads.zzanh(sb3.toString());
                            }
                            zzaooVar2.zzH(3);
                        }
                        java.lang.String group2 = matcher.group(1);
                        group2.getClass();
                        java.lang.String str3 = group2;
                        zzaooVar2.zzG(java.lang.Float.parseFloat(group2));
                        break;
                    } catch (com.google.android.gms.internal.ads.zzanh unused3) {
                        java.lang.String.valueOf(attributeValue);
                        com.google.android.gms.internal.ads.zzeg.zzc("TtmlParser", "Failed parsing fontSize value: ".concat(java.lang.String.valueOf(attributeValue)));
                        break;
                    }
                case 5:
                    zzaooVar2 = zze(zzaooVar2);
                    zzaooVar2.zzf("bold".equalsIgnoreCase(attributeValue));
                    break;
                case 6:
                    zzaooVar2 = zze(zzaooVar2);
                    zzaooVar2.zzg("italic".equalsIgnoreCase(attributeValue));
                    break;
                case 7:
                    zzaooVar2 = zze(zzaooVar2);
                    zzaooVar2.zzz(zzf(attributeValue));
                    break;
                case '\b':
                    zzaooVar2 = zze(zzaooVar2);
                    zzaooVar2.zzB(zzf(attributeValue));
                    break;
                case '\t':
                    java.lang.String zza2 = com.google.android.gms.internal.ads.zzgss.zza(attributeValue);
                    int hashCode2 = zza2.hashCode();
                    if (hashCode2 != 96673) {
                        if (hashCode2 == 3387192 && zza2.equals("none")) {
                            c3 = 0;
                        }
                    } else if (zza2.equals("all")) {
                        c3 = 1;
                    }
                    if (c3 == 0) {
                        zzaooVar2 = zze(zzaooVar2);
                        zzaooVar2.zzD(z);
                        break;
                    } else if (c3 == 1) {
                        zzaooVar2 = zze(zzaooVar2);
                        zzaooVar2.zzD(true);
                        break;
                    } else {
                        break;
                    }
                    break;
                case '\n':
                    java.lang.String zza3 = com.google.android.gms.internal.ads.zzgss.zza(attributeValue);
                    switch (zza3.hashCode()) {
                        case -618561360:
                            if (zza3.equals("baseContainer")) {
                                c3 = 2;
                                break;
                            }
                            break;
                        case -410956671:
                            if (zza3.equals("container")) {
                                c3 = 0;
                                break;
                            }
                            break;
                        case -250518009:
                            if (zza3.equals("delimiter")) {
                                c3 = 5;
                                break;
                            }
                            break;
                        case -136074796:
                            if (zza3.equals("textContainer")) {
                                c3 = 4;
                                break;
                            }
                            break;
                        case 3016401:
                            if (zza3.equals("base")) {
                                c3 = 1;
                                break;
                            }
                            break;
                        case 3556653:
                            if (zza3.equals("text")) {
                                c3 = 3;
                                break;
                            }
                            break;
                    }
                    if (c3 == 0) {
                        zzaooVar2 = zze(zzaooVar2);
                        zzaooVar2.zzu(1);
                        break;
                    } else if (c3 != 1 && c3 != 2) {
                        if (c3 != 3 && c3 != 4) {
                            if (c3 == 5) {
                                zzaooVar2 = zze(zzaooVar2);
                                zzaooVar2.zzu(4);
                                break;
                            } else {
                                break;
                            }
                        } else {
                            zzaooVar2 = zze(zzaooVar2);
                            zzaooVar2.zzu(3);
                            break;
                        }
                    } else {
                        zzaooVar2 = zze(zzaooVar2);
                        zzaooVar2.zzu(2);
                        break;
                    }
                case 11:
                    java.lang.String zza4 = com.google.android.gms.internal.ads.zzgss.zza(attributeValue);
                    int hashCode3 = zza4.hashCode();
                    if (hashCode3 != -1392885889) {
                        if (hashCode3 == 92734940 && zza4.equals("after")) {
                            c3 = 1;
                        }
                    } else if (zza4.equals("before")) {
                        c3 = 0;
                    }
                    if (c3 == 0) {
                        zzaooVar2 = zze(zzaooVar2);
                        zzaooVar2.zzw(1);
                        break;
                    } else if (c3 == 1) {
                        zzaooVar2 = zze(zzaooVar2);
                        zzaooVar2.zzw(2);
                        break;
                    } else {
                        break;
                    }
                case '\f':
                    java.lang.String zza5 = com.google.android.gms.internal.ads.zzgss.zza(attributeValue);
                    switch (zza5.hashCode()) {
                        case -1461280213:
                            if (zza5.equals("nounderline")) {
                                c3 = 3;
                                break;
                            }
                            break;
                        case -1026963764:
                            if (zza5.equals("underline")) {
                                c3 = 2;
                                break;
                            }
                            break;
                        case 913457136:
                            if (zza5.equals("nolinethrough")) {
                                c3 = 1;
                                break;
                            }
                            break;
                        case 1679736913:
                            if (zza5.equals("linethrough")) {
                                c3 = 0;
                                break;
                            }
                            break;
                    }
                    if (c3 == 0) {
                        zzaooVar2 = zze(zzaooVar2);
                        zzaooVar2.zzc(true);
                        break;
                    } else if (c3 == 1) {
                        zzaooVar2 = zze(zzaooVar2);
                        zzaooVar2.zzc(z);
                        break;
                    } else if (c3 == 2) {
                        zzaooVar2 = zze(zzaooVar2);
                        zzaooVar2.zze(true);
                        break;
                    } else if (c3 == 3) {
                        zzaooVar2 = zze(zzaooVar2);
                        zzaooVar2.zze(z);
                        break;
                    } else {
                        break;
                    }
                case '\r':
                    zzaooVar2 = zze(zzaooVar2);
                    zzaooVar2.zzF(com.google.android.gms.internal.ads.zzaoh.zza(attributeValue));
                    break;
                case 14:
                    com.google.android.gms.internal.ads.zzaoo zze2 = zze(zzaooVar2);
                    java.util.regex.Matcher matcher2 = zza.matcher(attributeValue);
                    float f = Float.MAX_VALUE;
                    if (matcher2.matches()) {
                        try {
                            java.lang.String group3 = matcher2.group(1);
                            group3.getClass();
                            java.lang.String str4 = group3;
                            f = java.lang.Math.min(100.0f, java.lang.Math.max(-100.0f, java.lang.Float.parseFloat(group3)));
                        } catch (java.lang.NumberFormatException e) {
                            java.lang.String.valueOf(attributeValue);
                            com.google.android.gms.internal.ads.zzeg.zzd("TtmlParser", "Failed to parse shear: ".concat(java.lang.String.valueOf(attributeValue)), e);
                        }
                    } else {
                        java.lang.String.valueOf(attributeValue);
                        com.google.android.gms.internal.ads.zzeg.zzc("TtmlParser", "Invalid value for shear: ".concat(java.lang.String.valueOf(attributeValue)));
                    }
                    zze2.zzp(f);
                    zzaooVar2 = zze2;
                    break;
                case 15:
                    zzaooVar2 = zze(zzaooVar2);
                    zzaooVar2.zzK(attributeValue);
                    break;
                case 16:
                    zzaooVar2 = zze(zzaooVar2);
                    zzaooVar2.zzM(attributeValue);
                    break;
            }
            i++;
            z = false;
        }
        return zzaooVar2;
    }

    private static com.google.android.gms.internal.ads.zzaoo zze(com.google.android.gms.internal.ads.zzaoo zzaooVar) {
        return zzaooVar == null ? new com.google.android.gms.internal.ads.zzaoo() : zzaooVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static android.text.Layout.Alignment zzf(java.lang.String str) {
        char c;
        java.lang.String zza2 = com.google.android.gms.internal.ads.zzgss.zza(str);
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
            return android.text.Layout.Alignment.ALIGN_NORMAL;
        }
        if (c == 2 || c == 3) {
            return android.text.Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (c != 4) {
            return null;
        }
        return android.text.Layout.Alignment.ALIGN_CENTER;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d9, code lost:
    
        if (r13.equals(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS) != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static long zzg(java.lang.String str, com.google.android.gms.internal.ads.zzaoj zzaojVar) throws com.google.android.gms.internal.ads.zzanh {
        double d;
        double d2;
        java.util.regex.Matcher matcher = zzc.matcher(str);
        char c = 2;
        if (matcher.matches()) {
            java.lang.String group = matcher.group(1);
            group.getClass();
            long parseLong = java.lang.Long.parseLong(group) * 3600;
            java.lang.String group2 = matcher.group(2);
            group2.getClass();
            long parseLong2 = java.lang.Long.parseLong(group2) * 60;
            java.lang.String group3 = matcher.group(3);
            group3.getClass();
            double d3 = parseLong + parseLong2;
            double parseLong3 = java.lang.Long.parseLong(group3);
            java.lang.String group4 = matcher.group(4);
            double parseDouble = group4 != null ? java.lang.Double.parseDouble(group4) : 0.0d;
            double d4 = d3 + parseLong3;
            return (long) ((d4 + parseDouble + (matcher.group(5) != null ? java.lang.Long.parseLong(r13) / zzaojVar.zza : 0.0d) + (matcher.group(6) != null ? (java.lang.Long.parseLong(r13) / zzaojVar.zzb) / zzaojVar.zza : 0.0d)) * 1000000.0d);
        }
        java.util.regex.Matcher matcher2 = zzd.matcher(str);
        if (!matcher2.matches()) {
            java.lang.String.valueOf(str);
            throw new com.google.android.gms.internal.ads.zzanh("Malformed time expression: ".concat(java.lang.String.valueOf(str)));
        }
        java.lang.String group5 = matcher2.group(1);
        group5.getClass();
        double parseDouble2 = java.lang.Double.parseDouble(group5);
        java.lang.String group6 = matcher2.group(2);
        group6.getClass();
        int hashCode = group6.hashCode();
        if (hashCode == 102) {
            if (group6.equals(com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_FEMALE)) {
                c = 4;
            }
            c = 65535;
        } else if (hashCode == 104) {
            if (group6.equals(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS)) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode == 109) {
            if (group6.equals(com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_MALE)) {
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
                            d2 = zzaojVar.zzc;
                        }
                        return (long) (parseDouble2 * 1000000.0d);
                    }
                    d2 = zzaojVar.zza;
                }
                parseDouble2 /= d2;
                return (long) (parseDouble2 * 1000000.0d);
            }
            d = 60.0d;
        }
        parseDouble2 *= d;
        return (long) (parseDouble2 * 1000000.0d);
    }

    @Override // com.google.android.gms.internal.ads.zzanl
    public final void zza(byte[] bArr, int i, int i2, com.google.android.gms.internal.ads.zzank zzankVar, com.google.android.gms.internal.ads.zzdt zzdtVar) {
        com.google.android.gms.internal.ads.zzanf.zza(zzb(bArr, i, i2), zzankVar, zzdtVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(14:246|247|248|(7:250|251|252|253|(2:257|(2:259|(4:261|(2:263|(3:265|(3:279|280|(3:282|283|284))|267)(2:291|(1:293)))(2:294|(1:296))|268|269)(4:297|298|299|300))(2:301|302))(2:303|304)|270|278)|326|327|(4:(2:329|(4:331|(1:333)(1:363)|334|(1:336)(10:362|338|(8:340|(1:342)(2:(2:357|358)|360)|343|344|345|346|347|(1:349))|361|343|344|345|346|347|(0)))(1:364))(1:365)|346|347|(0))|337|338|(0)|361|343|344|345) */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x06ed, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x06ee, code lost:
    
        r10 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x06c5, code lost:
    
        if (r14 != r10) goto L365;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0526 A[Catch: IOException -> 0x0787, XmlPullParserException -> 0x0791, TryCatch #17 {IOException -> 0x0787, XmlPullParserException -> 0x0791, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:17:0x0093, B:19:0x009b, B:22:0x00af, B:23:0x00ce, B:25:0x00d8, B:26:0x00dc, B:28:0x00e8, B:29:0x00f3, B:33:0x0167, B:36:0x01c0, B:39:0x01da, B:41:0x01e0, B:43:0x01e8, B:45:0x01f0, B:47:0x01f8, B:49:0x0200, B:51:0x0208, B:53:0x020e, B:55:0x0216, B:57:0x021e, B:59:0x0224, B:61:0x022a, B:63:0x0230, B:65:0x0238, B:68:0x0241, B:70:0x0767, B:72:0x026e, B:74:0x0274, B:76:0x027d, B:78:0x028c, B:80:0x0298, B:82:0x02ae, B:84:0x02b4, B:86:0x0575, B:94:0x02c0, B:97:0x02cc, B:102:0x0526, B:105:0x02e9, B:107:0x02f1, B:109:0x02f9, B:111:0x0301, B:114:0x030e, B:118:0x0327, B:120:0x032e, B:122:0x033f, B:125:0x03ab, B:127:0x03b3, B:129:0x03b9, B:131:0x03c1, B:133:0x03c7, B:137:0x03da, B:139:0x03e1, B:141:0x03f2, B:143:0x047a, B:145:0x0482, B:158:0x04c8, B:160:0x04d0, B:176:0x0519, B:193:0x0401, B:194:0x0411, B:197:0x0419, B:200:0x042a, B:202:0x0431, B:204:0x0440, B:207:0x0456, B:208:0x0466, B:211:0x034b, B:212:0x0353, B:215:0x035d, B:218:0x0366, B:220:0x036d, B:222:0x037c, B:225:0x038f, B:226:0x0398, B:230:0x0539, B:232:0x0546, B:234:0x0551, B:236:0x0557, B:237:0x0563, B:247:0x0590, B:251:0x05b1, B:270:0x0660, B:280:0x061d, B:284:0x0626, B:276:0x06f8, B:291:0x062e, B:294:0x0638, B:299:0x064d, B:301:0x0652, B:303:0x0659, B:329:0x0679, B:333:0x068a, B:336:0x0693, B:342:0x06ba, B:344:0x06cd, B:347:0x06db, B:349:0x06e0, B:357:0x06c1, B:369:0x0176, B:371:0x0182, B:374:0x018b, B:376:0x0192, B:378:0x01a1, B:381:0x01b0, B:382:0x010c, B:384:0x0118, B:387:0x0121, B:389:0x0128, B:392:0x0133, B:394:0x013a, B:399:0x0153, B:403:0x015f, B:419:0x071a, B:422:0x072c, B:424:0x0736, B:426:0x0741, B:427:0x074a, B:431:0x075d, B:434:0x0763, B:437:0x0782), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x030e A[Catch: IOException -> 0x0787, XmlPullParserException -> 0x0791, TRY_LEAVE, TryCatch #17 {IOException -> 0x0787, XmlPullParserException -> 0x0791, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:17:0x0093, B:19:0x009b, B:22:0x00af, B:23:0x00ce, B:25:0x00d8, B:26:0x00dc, B:28:0x00e8, B:29:0x00f3, B:33:0x0167, B:36:0x01c0, B:39:0x01da, B:41:0x01e0, B:43:0x01e8, B:45:0x01f0, B:47:0x01f8, B:49:0x0200, B:51:0x0208, B:53:0x020e, B:55:0x0216, B:57:0x021e, B:59:0x0224, B:61:0x022a, B:63:0x0230, B:65:0x0238, B:68:0x0241, B:70:0x0767, B:72:0x026e, B:74:0x0274, B:76:0x027d, B:78:0x028c, B:80:0x0298, B:82:0x02ae, B:84:0x02b4, B:86:0x0575, B:94:0x02c0, B:97:0x02cc, B:102:0x0526, B:105:0x02e9, B:107:0x02f1, B:109:0x02f9, B:111:0x0301, B:114:0x030e, B:118:0x0327, B:120:0x032e, B:122:0x033f, B:125:0x03ab, B:127:0x03b3, B:129:0x03b9, B:131:0x03c1, B:133:0x03c7, B:137:0x03da, B:139:0x03e1, B:141:0x03f2, B:143:0x047a, B:145:0x0482, B:158:0x04c8, B:160:0x04d0, B:176:0x0519, B:193:0x0401, B:194:0x0411, B:197:0x0419, B:200:0x042a, B:202:0x0431, B:204:0x0440, B:207:0x0456, B:208:0x0466, B:211:0x034b, B:212:0x0353, B:215:0x035d, B:218:0x0366, B:220:0x036d, B:222:0x037c, B:225:0x038f, B:226:0x0398, B:230:0x0539, B:232:0x0546, B:234:0x0551, B:236:0x0557, B:237:0x0563, B:247:0x0590, B:251:0x05b1, B:270:0x0660, B:280:0x061d, B:284:0x0626, B:276:0x06f8, B:291:0x062e, B:294:0x0638, B:299:0x064d, B:301:0x0652, B:303:0x0659, B:329:0x0679, B:333:0x068a, B:336:0x0693, B:342:0x06ba, B:344:0x06cd, B:347:0x06db, B:349:0x06e0, B:357:0x06c1, B:369:0x0176, B:371:0x0182, B:374:0x018b, B:376:0x0192, B:378:0x01a1, B:381:0x01b0, B:382:0x010c, B:384:0x0118, B:387:0x0121, B:389:0x0128, B:392:0x0133, B:394:0x013a, B:399:0x0153, B:403:0x015f, B:419:0x071a, B:422:0x072c, B:424:0x0736, B:426:0x0741, B:427:0x074a, B:431:0x075d, B:434:0x0763, B:437:0x0782), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03c7 A[Catch: IOException -> 0x0787, XmlPullParserException -> 0x0791, TRY_LEAVE, TryCatch #17 {IOException -> 0x0787, XmlPullParserException -> 0x0791, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:17:0x0093, B:19:0x009b, B:22:0x00af, B:23:0x00ce, B:25:0x00d8, B:26:0x00dc, B:28:0x00e8, B:29:0x00f3, B:33:0x0167, B:36:0x01c0, B:39:0x01da, B:41:0x01e0, B:43:0x01e8, B:45:0x01f0, B:47:0x01f8, B:49:0x0200, B:51:0x0208, B:53:0x020e, B:55:0x0216, B:57:0x021e, B:59:0x0224, B:61:0x022a, B:63:0x0230, B:65:0x0238, B:68:0x0241, B:70:0x0767, B:72:0x026e, B:74:0x0274, B:76:0x027d, B:78:0x028c, B:80:0x0298, B:82:0x02ae, B:84:0x02b4, B:86:0x0575, B:94:0x02c0, B:97:0x02cc, B:102:0x0526, B:105:0x02e9, B:107:0x02f1, B:109:0x02f9, B:111:0x0301, B:114:0x030e, B:118:0x0327, B:120:0x032e, B:122:0x033f, B:125:0x03ab, B:127:0x03b3, B:129:0x03b9, B:131:0x03c1, B:133:0x03c7, B:137:0x03da, B:139:0x03e1, B:141:0x03f2, B:143:0x047a, B:145:0x0482, B:158:0x04c8, B:160:0x04d0, B:176:0x0519, B:193:0x0401, B:194:0x0411, B:197:0x0419, B:200:0x042a, B:202:0x0431, B:204:0x0440, B:207:0x0456, B:208:0x0466, B:211:0x034b, B:212:0x0353, B:215:0x035d, B:218:0x0366, B:220:0x036d, B:222:0x037c, B:225:0x038f, B:226:0x0398, B:230:0x0539, B:232:0x0546, B:234:0x0551, B:236:0x0557, B:237:0x0563, B:247:0x0590, B:251:0x05b1, B:270:0x0660, B:280:0x061d, B:284:0x0626, B:276:0x06f8, B:291:0x062e, B:294:0x0638, B:299:0x064d, B:301:0x0652, B:303:0x0659, B:329:0x0679, B:333:0x068a, B:336:0x0693, B:342:0x06ba, B:344:0x06cd, B:347:0x06db, B:349:0x06e0, B:357:0x06c1, B:369:0x0176, B:371:0x0182, B:374:0x018b, B:376:0x0192, B:378:0x01a1, B:381:0x01b0, B:382:0x010c, B:384:0x0118, B:387:0x0121, B:389:0x0128, B:392:0x0133, B:394:0x013a, B:399:0x0153, B:403:0x015f, B:419:0x071a, B:422:0x072c, B:424:0x0736, B:426:0x0741, B:427:0x074a, B:431:0x075d, B:434:0x0763, B:437:0x0782), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0482 A[Catch: IOException -> 0x0787, XmlPullParserException -> 0x0791, TRY_LEAVE, TryCatch #17 {IOException -> 0x0787, XmlPullParserException -> 0x0791, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:17:0x0093, B:19:0x009b, B:22:0x00af, B:23:0x00ce, B:25:0x00d8, B:26:0x00dc, B:28:0x00e8, B:29:0x00f3, B:33:0x0167, B:36:0x01c0, B:39:0x01da, B:41:0x01e0, B:43:0x01e8, B:45:0x01f0, B:47:0x01f8, B:49:0x0200, B:51:0x0208, B:53:0x020e, B:55:0x0216, B:57:0x021e, B:59:0x0224, B:61:0x022a, B:63:0x0230, B:65:0x0238, B:68:0x0241, B:70:0x0767, B:72:0x026e, B:74:0x0274, B:76:0x027d, B:78:0x028c, B:80:0x0298, B:82:0x02ae, B:84:0x02b4, B:86:0x0575, B:94:0x02c0, B:97:0x02cc, B:102:0x0526, B:105:0x02e9, B:107:0x02f1, B:109:0x02f9, B:111:0x0301, B:114:0x030e, B:118:0x0327, B:120:0x032e, B:122:0x033f, B:125:0x03ab, B:127:0x03b3, B:129:0x03b9, B:131:0x03c1, B:133:0x03c7, B:137:0x03da, B:139:0x03e1, B:141:0x03f2, B:143:0x047a, B:145:0x0482, B:158:0x04c8, B:160:0x04d0, B:176:0x0519, B:193:0x0401, B:194:0x0411, B:197:0x0419, B:200:0x042a, B:202:0x0431, B:204:0x0440, B:207:0x0456, B:208:0x0466, B:211:0x034b, B:212:0x0353, B:215:0x035d, B:218:0x0366, B:220:0x036d, B:222:0x037c, B:225:0x038f, B:226:0x0398, B:230:0x0539, B:232:0x0546, B:234:0x0551, B:236:0x0557, B:237:0x0563, B:247:0x0590, B:251:0x05b1, B:270:0x0660, B:280:0x061d, B:284:0x0626, B:276:0x06f8, B:291:0x062e, B:294:0x0638, B:299:0x064d, B:301:0x0652, B:303:0x0659, B:329:0x0679, B:333:0x068a, B:336:0x0693, B:342:0x06ba, B:344:0x06cd, B:347:0x06db, B:349:0x06e0, B:357:0x06c1, B:369:0x0176, B:371:0x0182, B:374:0x018b, B:376:0x0192, B:378:0x01a1, B:381:0x01b0, B:382:0x010c, B:384:0x0118, B:387:0x0121, B:389:0x0128, B:392:0x0133, B:394:0x013a, B:399:0x0153, B:403:0x015f, B:419:0x071a, B:422:0x072c, B:424:0x0736, B:426:0x0741, B:427:0x074a, B:431:0x075d, B:434:0x0763, B:437:0x0782), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04d0 A[Catch: IOException -> 0x0787, XmlPullParserException -> 0x0791, TRY_LEAVE, TryCatch #17 {IOException -> 0x0787, XmlPullParserException -> 0x0791, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:17:0x0093, B:19:0x009b, B:22:0x00af, B:23:0x00ce, B:25:0x00d8, B:26:0x00dc, B:28:0x00e8, B:29:0x00f3, B:33:0x0167, B:36:0x01c0, B:39:0x01da, B:41:0x01e0, B:43:0x01e8, B:45:0x01f0, B:47:0x01f8, B:49:0x0200, B:51:0x0208, B:53:0x020e, B:55:0x0216, B:57:0x021e, B:59:0x0224, B:61:0x022a, B:63:0x0230, B:65:0x0238, B:68:0x0241, B:70:0x0767, B:72:0x026e, B:74:0x0274, B:76:0x027d, B:78:0x028c, B:80:0x0298, B:82:0x02ae, B:84:0x02b4, B:86:0x0575, B:94:0x02c0, B:97:0x02cc, B:102:0x0526, B:105:0x02e9, B:107:0x02f1, B:109:0x02f9, B:111:0x0301, B:114:0x030e, B:118:0x0327, B:120:0x032e, B:122:0x033f, B:125:0x03ab, B:127:0x03b3, B:129:0x03b9, B:131:0x03c1, B:133:0x03c7, B:137:0x03da, B:139:0x03e1, B:141:0x03f2, B:143:0x047a, B:145:0x0482, B:158:0x04c8, B:160:0x04d0, B:176:0x0519, B:193:0x0401, B:194:0x0411, B:197:0x0419, B:200:0x042a, B:202:0x0431, B:204:0x0440, B:207:0x0456, B:208:0x0466, B:211:0x034b, B:212:0x0353, B:215:0x035d, B:218:0x0366, B:220:0x036d, B:222:0x037c, B:225:0x038f, B:226:0x0398, B:230:0x0539, B:232:0x0546, B:234:0x0551, B:236:0x0557, B:237:0x0563, B:247:0x0590, B:251:0x05b1, B:270:0x0660, B:280:0x061d, B:284:0x0626, B:276:0x06f8, B:291:0x062e, B:294:0x0638, B:299:0x064d, B:301:0x0652, B:303:0x0659, B:329:0x0679, B:333:0x068a, B:336:0x0693, B:342:0x06ba, B:344:0x06cd, B:347:0x06db, B:349:0x06e0, B:357:0x06c1, B:369:0x0176, B:371:0x0182, B:374:0x018b, B:376:0x0192, B:378:0x01a1, B:381:0x01b0, B:382:0x010c, B:384:0x0118, B:387:0x0121, B:389:0x0128, B:392:0x0133, B:394:0x013a, B:399:0x0153, B:403:0x015f, B:419:0x071a, B:422:0x072c, B:424:0x0736, B:426:0x0741, B:427:0x074a, B:431:0x075d, B:434:0x0763, B:437:0x0782), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x06e0 A[Catch: zzanh -> 0x06eb, IOException -> 0x0787, XmlPullParserException -> 0x0791, TRY_LEAVE, TryCatch #7 {zzanh -> 0x06eb, blocks: (B:347:0x06db, B:349:0x06e0), top: B:346:0x06db }] */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0176 A[Catch: IOException -> 0x0787, XmlPullParserException -> 0x0791, TryCatch #17 {IOException -> 0x0787, XmlPullParserException -> 0x0791, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:17:0x0093, B:19:0x009b, B:22:0x00af, B:23:0x00ce, B:25:0x00d8, B:26:0x00dc, B:28:0x00e8, B:29:0x00f3, B:33:0x0167, B:36:0x01c0, B:39:0x01da, B:41:0x01e0, B:43:0x01e8, B:45:0x01f0, B:47:0x01f8, B:49:0x0200, B:51:0x0208, B:53:0x020e, B:55:0x0216, B:57:0x021e, B:59:0x0224, B:61:0x022a, B:63:0x0230, B:65:0x0238, B:68:0x0241, B:70:0x0767, B:72:0x026e, B:74:0x0274, B:76:0x027d, B:78:0x028c, B:80:0x0298, B:82:0x02ae, B:84:0x02b4, B:86:0x0575, B:94:0x02c0, B:97:0x02cc, B:102:0x0526, B:105:0x02e9, B:107:0x02f1, B:109:0x02f9, B:111:0x0301, B:114:0x030e, B:118:0x0327, B:120:0x032e, B:122:0x033f, B:125:0x03ab, B:127:0x03b3, B:129:0x03b9, B:131:0x03c1, B:133:0x03c7, B:137:0x03da, B:139:0x03e1, B:141:0x03f2, B:143:0x047a, B:145:0x0482, B:158:0x04c8, B:160:0x04d0, B:176:0x0519, B:193:0x0401, B:194:0x0411, B:197:0x0419, B:200:0x042a, B:202:0x0431, B:204:0x0440, B:207:0x0456, B:208:0x0466, B:211:0x034b, B:212:0x0353, B:215:0x035d, B:218:0x0366, B:220:0x036d, B:222:0x037c, B:225:0x038f, B:226:0x0398, B:230:0x0539, B:232:0x0546, B:234:0x0551, B:236:0x0557, B:237:0x0563, B:247:0x0590, B:251:0x05b1, B:270:0x0660, B:280:0x061d, B:284:0x0626, B:276:0x06f8, B:291:0x062e, B:294:0x0638, B:299:0x064d, B:301:0x0652, B:303:0x0659, B:329:0x0679, B:333:0x068a, B:336:0x0693, B:342:0x06ba, B:344:0x06cd, B:347:0x06db, B:349:0x06e0, B:357:0x06c1, B:369:0x0176, B:371:0x0182, B:374:0x018b, B:376:0x0192, B:378:0x01a1, B:381:0x01b0, B:382:0x010c, B:384:0x0118, B:387:0x0121, B:389:0x0128, B:392:0x0133, B:394:0x013a, B:399:0x0153, B:403:0x015f, B:419:0x071a, B:422:0x072c, B:424:0x0736, B:426:0x0741, B:427:0x074a, B:431:0x075d, B:434:0x0763, B:437:0x0782), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01da A[Catch: IOException -> 0x0787, XmlPullParserException -> 0x0791, TRY_ENTER, TryCatch #17 {IOException -> 0x0787, XmlPullParserException -> 0x0791, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:17:0x0093, B:19:0x009b, B:22:0x00af, B:23:0x00ce, B:25:0x00d8, B:26:0x00dc, B:28:0x00e8, B:29:0x00f3, B:33:0x0167, B:36:0x01c0, B:39:0x01da, B:41:0x01e0, B:43:0x01e8, B:45:0x01f0, B:47:0x01f8, B:49:0x0200, B:51:0x0208, B:53:0x020e, B:55:0x0216, B:57:0x021e, B:59:0x0224, B:61:0x022a, B:63:0x0230, B:65:0x0238, B:68:0x0241, B:70:0x0767, B:72:0x026e, B:74:0x0274, B:76:0x027d, B:78:0x028c, B:80:0x0298, B:82:0x02ae, B:84:0x02b4, B:86:0x0575, B:94:0x02c0, B:97:0x02cc, B:102:0x0526, B:105:0x02e9, B:107:0x02f1, B:109:0x02f9, B:111:0x0301, B:114:0x030e, B:118:0x0327, B:120:0x032e, B:122:0x033f, B:125:0x03ab, B:127:0x03b3, B:129:0x03b9, B:131:0x03c1, B:133:0x03c7, B:137:0x03da, B:139:0x03e1, B:141:0x03f2, B:143:0x047a, B:145:0x0482, B:158:0x04c8, B:160:0x04d0, B:176:0x0519, B:193:0x0401, B:194:0x0411, B:197:0x0419, B:200:0x042a, B:202:0x0431, B:204:0x0440, B:207:0x0456, B:208:0x0466, B:211:0x034b, B:212:0x0353, B:215:0x035d, B:218:0x0366, B:220:0x036d, B:222:0x037c, B:225:0x038f, B:226:0x0398, B:230:0x0539, B:232:0x0546, B:234:0x0551, B:236:0x0557, B:237:0x0563, B:247:0x0590, B:251:0x05b1, B:270:0x0660, B:280:0x061d, B:284:0x0626, B:276:0x06f8, B:291:0x062e, B:294:0x0638, B:299:0x064d, B:301:0x0652, B:303:0x0659, B:329:0x0679, B:333:0x068a, B:336:0x0693, B:342:0x06ba, B:344:0x06cd, B:347:0x06db, B:349:0x06e0, B:357:0x06c1, B:369:0x0176, B:371:0x0182, B:374:0x018b, B:376:0x0192, B:378:0x01a1, B:381:0x01b0, B:382:0x010c, B:384:0x0118, B:387:0x0121, B:389:0x0128, B:392:0x0133, B:394:0x013a, B:399:0x0153, B:403:0x015f, B:419:0x071a, B:422:0x072c, B:424:0x0736, B:426:0x0741, B:427:0x074a, B:431:0x075d, B:434:0x0763, B:437:0x0782), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0274 A[Catch: IOException -> 0x0787, XmlPullParserException -> 0x0791, LOOP:1: B:74:0x0274->B:88:0x0581, LOOP_START, PHI: r3 r7 r8 r10 r11 r12 r15
      0x0274: PHI (r3v40 java.lang.String) = (r3v3 java.lang.String), (r3v76 java.lang.String) binds: [B:73:0x0272, B:88:0x0581] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r7v5 java.util.HashMap) = (r7v1 java.util.HashMap), (r7v42 java.util.HashMap) binds: [B:73:0x0272, B:88:0x0581] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r8v17 java.util.HashMap) = (r8v1 java.util.HashMap), (r8v38 java.util.HashMap) binds: [B:73:0x0272, B:88:0x0581] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r10v24 java.lang.String) = (r10v10 java.lang.String), (r10v31 java.lang.String) binds: [B:73:0x0272, B:88:0x0581] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r11v21 java.lang.String) = (r11v6 java.lang.String), (r11v45 java.lang.String) binds: [B:73:0x0272, B:88:0x0581] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r12v12 java.lang.String) = (r12v9 java.lang.String), (r12v32 java.lang.String) binds: [B:73:0x0272, B:88:0x0581] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r15v13 java.lang.String) = (r15v11 java.lang.String), (r15v15 java.lang.String) binds: [B:73:0x0272, B:88:0x0581] A[DONT_GENERATE, DONT_INLINE], TryCatch #17 {IOException -> 0x0787, XmlPullParserException -> 0x0791, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:17:0x0093, B:19:0x009b, B:22:0x00af, B:23:0x00ce, B:25:0x00d8, B:26:0x00dc, B:28:0x00e8, B:29:0x00f3, B:33:0x0167, B:36:0x01c0, B:39:0x01da, B:41:0x01e0, B:43:0x01e8, B:45:0x01f0, B:47:0x01f8, B:49:0x0200, B:51:0x0208, B:53:0x020e, B:55:0x0216, B:57:0x021e, B:59:0x0224, B:61:0x022a, B:63:0x0230, B:65:0x0238, B:68:0x0241, B:70:0x0767, B:72:0x026e, B:74:0x0274, B:76:0x027d, B:78:0x028c, B:80:0x0298, B:82:0x02ae, B:84:0x02b4, B:86:0x0575, B:94:0x02c0, B:97:0x02cc, B:102:0x0526, B:105:0x02e9, B:107:0x02f1, B:109:0x02f9, B:111:0x0301, B:114:0x030e, B:118:0x0327, B:120:0x032e, B:122:0x033f, B:125:0x03ab, B:127:0x03b3, B:129:0x03b9, B:131:0x03c1, B:133:0x03c7, B:137:0x03da, B:139:0x03e1, B:141:0x03f2, B:143:0x047a, B:145:0x0482, B:158:0x04c8, B:160:0x04d0, B:176:0x0519, B:193:0x0401, B:194:0x0411, B:197:0x0419, B:200:0x042a, B:202:0x0431, B:204:0x0440, B:207:0x0456, B:208:0x0466, B:211:0x034b, B:212:0x0353, B:215:0x035d, B:218:0x0366, B:220:0x036d, B:222:0x037c, B:225:0x038f, B:226:0x0398, B:230:0x0539, B:232:0x0546, B:234:0x0551, B:236:0x0557, B:237:0x0563, B:247:0x0590, B:251:0x05b1, B:270:0x0660, B:280:0x061d, B:284:0x0626, B:276:0x06f8, B:291:0x062e, B:294:0x0638, B:299:0x064d, B:301:0x0652, B:303:0x0659, B:329:0x0679, B:333:0x068a, B:336:0x0693, B:342:0x06ba, B:344:0x06cd, B:347:0x06db, B:349:0x06e0, B:357:0x06c1, B:369:0x0176, B:371:0x0182, B:374:0x018b, B:376:0x0192, B:378:0x01a1, B:381:0x01b0, B:382:0x010c, B:384:0x0118, B:387:0x0121, B:389:0x0128, B:392:0x0133, B:394:0x013a, B:399:0x0153, B:403:0x015f, B:419:0x071a, B:422:0x072c, B:424:0x0736, B:426:0x0741, B:427:0x074a, B:431:0x075d, B:434:0x0763, B:437:0x0782), top: B:2:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.android.gms.internal.ads.zzang zzb(byte[] bArr, int i, int i2) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.util.ArrayDeque arrayDeque;
        com.google.android.gms.internal.ads.zzaoj zzaojVar;
        com.google.android.gms.internal.ads.zzaop zzaopVar;
        java.util.HashMap hashMap;
        java.util.ArrayDeque arrayDeque2;
        com.google.android.gms.internal.ads.zzaok zzaokVar;
        int i3;
        com.google.android.gms.internal.ads.zzaoj zzaojVar2;
        com.google.android.gms.internal.ads.zzanh zzanhVar;
        com.google.android.gms.internal.ads.zzaoi zzaoiVar;
        long j;
        com.google.android.gms.internal.ads.zzaoi zzaoiVar2;
        long j2;
        long j3;
        java.lang.Object obj;
        char c;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String zzc2;
        java.lang.String str8;
        java.lang.String str9;
        java.util.HashMap hashMap2;
        java.lang.String str10;
        java.lang.String str11;
        float f;
        float f2;
        java.lang.String zzc3;
        float f3;
        float f4;
        java.lang.String zzc4;
        float f5;
        int i4;
        java.lang.String zzc5;
        int i5;
        com.google.android.gms.internal.ads.zzaom zzaomVar;
        char c2;
        char c3;
        java.lang.String zzc6;
        com.google.android.gms.internal.ads.zzaoo zzaooVar;
        float f6;
        com.google.android.gms.internal.ads.zzaoo zzaooVar2;
        java.lang.String str12;
        float f7;
        int i6;
        int i7;
        boolean z;
        java.lang.String zzc7;
        java.lang.String str13 = "";
        java.lang.String str14 = "http://www.w3.org/ns/ttml#parameter";
        java.lang.String str15 = "Ignoring unsupported tag: ";
        try {
            org.xmlpull.v1.XmlPullParser newPullParser = this.zzi.newPullParser();
            java.util.HashMap hashMap3 = new java.util.HashMap();
            java.util.HashMap hashMap4 = new java.util.HashMap();
            java.util.HashMap hashMap5 = new java.util.HashMap();
            hashMap4.put("", new com.google.android.gms.internal.ads.zzaom("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            newPullParser.setInput(new java.io.ByteArrayInputStream(bArr, i, i2), null);
            java.util.ArrayDeque arrayDeque3 = new java.util.ArrayDeque();
            int eventType = newPullParser.getEventType();
            com.google.android.gms.internal.ads.zzaoj zzaojVar3 = zzh;
            com.google.android.gms.internal.ads.zzaop zzaopVar2 = null;
            com.google.android.gms.internal.ads.zzaok zzaokVar2 = null;
            com.google.android.gms.internal.ads.zzaoj zzaojVar4 = zzaojVar3;
            int i8 = 0;
            int i9 = 15;
            while (eventType != 1) {
                com.google.android.gms.internal.ads.zzaoi zzaoiVar3 = (com.google.android.gms.internal.ads.zzaoi) arrayDeque3.peek();
                if (i8 == 0) {
                    java.lang.String name = newPullParser.getName();
                    str = str13;
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            java.lang.String attributeValue = newPullParser.getAttributeValue(str14, "frameRate");
                            int parseInt = attributeValue != null ? java.lang.Integer.parseInt(attributeValue) : 30;
                            java.lang.String attributeValue2 = newPullParser.getAttributeValue(str14, "frameRateMultiplier");
                            if (attributeValue2 != null) {
                                zzaopVar = zzaopVar2;
                                java.lang.String str16 = com.google.android.gms.internal.ads.zzfl.zza;
                                arrayDeque2 = arrayDeque3;
                                com.google.android.gms.internal.ads.zzgtj.zzb(attributeValue2.split(io.ktor.sse.ServerSentEventKt.SPACE, -1).length == 2, "frameRateMultiplier doesn't have 2 parts");
                                f7 = java.lang.Integer.parseInt(r4[0]) / java.lang.Integer.parseInt(r4[1]);
                            } else {
                                arrayDeque2 = arrayDeque3;
                                zzaopVar = zzaopVar2;
                                f7 = 1.0f;
                            }
                            int i10 = zzaojVar3.zzb;
                            java.lang.String attributeValue3 = newPullParser.getAttributeValue(str14, "subFrameRate");
                            if (attributeValue3 != null) {
                                i10 = java.lang.Integer.parseInt(attributeValue3);
                            }
                            int i11 = zzaojVar3.zzc;
                            java.lang.String attributeValue4 = newPullParser.getAttributeValue(str14, "tickRate");
                            if (attributeValue4 != null) {
                                i6 = java.lang.Integer.parseInt(attributeValue4);
                                zzaojVar = zzaojVar3;
                            } else {
                                zzaojVar = zzaojVar3;
                                i6 = i11;
                            }
                            com.google.android.gms.internal.ads.zzaoj zzaojVar5 = new com.google.android.gms.internal.ads.zzaoj(parseInt * f7, i10, i6);
                            java.lang.String attributeValue5 = newPullParser.getAttributeValue(str14, "cellResolution");
                            if (attributeValue5 != null) {
                                java.util.regex.Matcher matcher = zzg.matcher(attributeValue5);
                                if (matcher.matches()) {
                                    try {
                                        java.lang.String group = matcher.group(1);
                                        group.getClass();
                                        java.lang.String str17 = group;
                                        int parseInt2 = java.lang.Integer.parseInt(group);
                                        str2 = str14;
                                        try {
                                            java.lang.String group2 = matcher.group(2);
                                            group2.getClass();
                                            java.lang.String str18 = group2;
                                            int parseInt3 = java.lang.Integer.parseInt(group2);
                                            if (parseInt2 == 0) {
                                                i7 = parseInt3;
                                                zzaojVar4 = zzaojVar5;
                                                z = false;
                                            } else if (parseInt3 != 0) {
                                                i7 = parseInt3;
                                                zzaojVar4 = zzaojVar5;
                                                z = true;
                                            } else {
                                                zzaojVar4 = zzaojVar5;
                                                z = false;
                                                i7 = 0;
                                            }
                                        } catch (java.lang.NumberFormatException unused) {
                                            zzaojVar4 = zzaojVar5;
                                            com.google.android.gms.internal.ads.zzeg.zzc("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                            i9 = 15;
                                            zzc7 = com.google.android.gms.internal.ads.zzft.zzc(newPullParser, "extent");
                                            if (zzc7 != null) {
                                            }
                                            zzaokVar2 = null;
                                            zzaokVar = zzaokVar2;
                                            i3 = i9;
                                            java.lang.String str19 = "image";
                                            java.lang.String str20 = "metadata";
                                            java.lang.String str21 = "region";
                                            java.lang.String str22 = "head";
                                            zzaojVar4 = zzaojVar4;
                                            if (!name.equals("tt")) {
                                                java.lang.String name2 = newPullParser.getName();
                                                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(name2).length() + 26);
                                                sb.append(str15);
                                                sb.append(name2);
                                                com.google.android.gms.internal.ads.zzeg.zzb("TtmlParser", sb.toString());
                                                str3 = str15;
                                                zzaokVar2 = zzaokVar;
                                                hashMap = hashMap5;
                                                i9 = i3;
                                                zzaopVar2 = zzaopVar;
                                                arrayDeque = arrayDeque2;
                                                i8 = 1;
                                                newPullParser.next();
                                                eventType = newPullParser.getEventType();
                                                arrayDeque3 = arrayDeque;
                                                hashMap5 = hashMap;
                                                str13 = str;
                                                zzaojVar3 = zzaojVar;
                                                str14 = str2;
                                                str15 = str3;
                                            }
                                            if ("head".equals(name)) {
                                            }
                                            zzaojVar4 = zzaojVar2;
                                            zzaokVar2 = zzaokVar;
                                            i9 = i3;
                                            zzaopVar2 = zzaopVar;
                                            newPullParser.next();
                                            eventType = newPullParser.getEventType();
                                            arrayDeque3 = arrayDeque;
                                            hashMap5 = hashMap;
                                            str13 = str;
                                            zzaojVar3 = zzaojVar;
                                            str14 = str2;
                                            str15 = str3;
                                        }
                                        try {
                                            com.google.android.gms.internal.ads.zzgtj.zzg(z, "Invalid cell resolution %s %s", parseInt2, i7);
                                            i9 = i7;
                                        } catch (java.lang.NumberFormatException unused2) {
                                            com.google.android.gms.internal.ads.zzeg.zzc("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                            i9 = 15;
                                            zzc7 = com.google.android.gms.internal.ads.zzft.zzc(newPullParser, "extent");
                                            if (zzc7 != null) {
                                            }
                                            zzaokVar2 = null;
                                            zzaokVar = zzaokVar2;
                                            i3 = i9;
                                            java.lang.String str192 = "image";
                                            java.lang.String str202 = "metadata";
                                            java.lang.String str212 = "region";
                                            java.lang.String str222 = "head";
                                            zzaojVar4 = zzaojVar4;
                                            if (!name.equals("tt")) {
                                            }
                                            if ("head".equals(name)) {
                                            }
                                            zzaojVar4 = zzaojVar2;
                                            zzaokVar2 = zzaokVar;
                                            i9 = i3;
                                            zzaopVar2 = zzaopVar;
                                            newPullParser.next();
                                            eventType = newPullParser.getEventType();
                                            arrayDeque3 = arrayDeque;
                                            hashMap5 = hashMap;
                                            str13 = str;
                                            zzaojVar3 = zzaojVar;
                                            str14 = str2;
                                            str15 = str3;
                                        }
                                    } catch (java.lang.NumberFormatException unused3) {
                                        str2 = str14;
                                    }
                                    zzc7 = com.google.android.gms.internal.ads.zzft.zzc(newPullParser, "extent");
                                    if (zzc7 != null) {
                                        java.util.regex.Matcher matcher2 = zzf.matcher(zzc7);
                                        if (matcher2.matches()) {
                                            try {
                                                java.lang.String group3 = matcher2.group(1);
                                                group3.getClass();
                                                java.lang.String str23 = group3;
                                                int parseInt4 = java.lang.Integer.parseInt(group3);
                                                java.lang.String group4 = matcher2.group(2);
                                                group4.getClass();
                                                java.lang.String str24 = group4;
                                                zzaokVar2 = new com.google.android.gms.internal.ads.zzaok(parseInt4, java.lang.Integer.parseInt(group4));
                                            } catch (java.lang.NumberFormatException unused4) {
                                                com.google.android.gms.internal.ads.zzeg.zzc("TtmlParser", "Ignoring malformed tts extent: ".concat(zzc7));
                                            }
                                        } else {
                                            com.google.android.gms.internal.ads.zzeg.zzc("TtmlParser", "Ignoring non-pixel tts extent: ".concat(zzc7));
                                        }
                                    }
                                    zzaokVar2 = null;
                                } else {
                                    com.google.android.gms.internal.ads.zzeg.zzc("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                }
                            }
                            str2 = str14;
                            zzaojVar4 = zzaojVar5;
                            i9 = 15;
                            zzc7 = com.google.android.gms.internal.ads.zzft.zzc(newPullParser, "extent");
                            if (zzc7 != null) {
                            }
                            zzaokVar2 = null;
                        } else {
                            str2 = str14;
                            arrayDeque2 = arrayDeque3;
                            zzaojVar = zzaojVar3;
                            zzaopVar = zzaopVar2;
                        }
                        zzaokVar = zzaokVar2;
                        i3 = i9;
                        java.lang.String str1922 = "image";
                        java.lang.String str2022 = "metadata";
                        java.lang.String str2122 = "region";
                        java.lang.String str2222 = "head";
                        zzaojVar4 = zzaojVar4;
                        if (!name.equals("tt") && !name.equals("head") && !name.equals("body") && !name.equals("div") && !name.equals("p") && !name.equals("span") && !name.equals("br") && !name.equals("style") && !name.equals("styling") && !name.equals("layout") && !name.equals("region") && !name.equals("metadata") && !name.equals("image") && !name.equals("data") && !name.equals("information")) {
                            java.lang.String name22 = newPullParser.getName();
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(name22).length() + 26);
                            sb2.append(str15);
                            sb2.append(name22);
                            com.google.android.gms.internal.ads.zzeg.zzb("TtmlParser", sb2.toString());
                            str3 = str15;
                            zzaokVar2 = zzaokVar;
                            hashMap = hashMap5;
                            i9 = i3;
                            zzaopVar2 = zzaopVar;
                            arrayDeque = arrayDeque2;
                            i8 = 1;
                        }
                        if ("head".equals(name)) {
                            while (true) {
                                newPullParser.next();
                                if (com.google.android.gms.internal.ads.zzft.zzb(newPullParser, "style")) {
                                    java.lang.String zzc8 = com.google.android.gms.internal.ads.zzft.zzc(newPullParser, "style");
                                    com.google.android.gms.internal.ads.zzaoo zzd2 = zzd(newPullParser, new com.google.android.gms.internal.ads.zzaoo());
                                    if (zzc8 != null) {
                                        java.lang.String[] zzc9 = zzc(zzc8);
                                        str3 = str15;
                                        str12 = str2222;
                                        int i12 = 0;
                                        for (int length = zzc9.length; i12 < length; length = length) {
                                            zzd2.zzr((com.google.android.gms.internal.ads.zzaoo) hashMap3.get(zzc9[i12]));
                                            i12++;
                                        }
                                    } else {
                                        str3 = str15;
                                        str12 = str2222;
                                    }
                                    java.lang.String zzt = zzd2.zzt();
                                    if (zzt != null) {
                                        hashMap3.put(zzt, zzd2);
                                    }
                                    str4 = str2022;
                                    str5 = str2122;
                                    str7 = str12;
                                    hashMap = hashMap5;
                                    str6 = str1922;
                                } else {
                                    str3 = str15;
                                    java.lang.String str25 = str2222;
                                    if (com.google.android.gms.internal.ads.zzft.zzb(newPullParser, str2122)) {
                                        str5 = str2122;
                                        java.util.HashMap hashMap6 = hashMap5;
                                        java.lang.String zzc10 = com.google.android.gms.internal.ads.zzft.zzc(newPullParser, "id");
                                        if (zzc10 == null) {
                                            hashMap2 = hashMap4;
                                            str10 = str1922;
                                            str11 = str2022;
                                        } else {
                                            java.lang.String zzc11 = com.google.android.gms.internal.ads.zzft.zzc(newPullParser, "origin");
                                            if (zzc11 == null) {
                                                str8 = zzc11;
                                                java.lang.String zzc12 = com.google.android.gms.internal.ads.zzft.zzc(newPullParser, "style");
                                                if (zzc12 != null && (zzaooVar2 = (com.google.android.gms.internal.ads.zzaoo) hashMap3.get(zzc12)) != null) {
                                                    str9 = zzaooVar2.zzL();
                                                    if (str9 == null) {
                                                        str10 = str1922;
                                                        java.util.regex.Matcher matcher3 = zzb.matcher(str9);
                                                        str11 = str2022;
                                                        java.util.regex.Matcher matcher4 = zzf.matcher(str9);
                                                        if (matcher3.matches()) {
                                                            hashMap2 = hashMap4;
                                                            try {
                                                                java.lang.String group5 = matcher3.group(1);
                                                                group5.getClass();
                                                                java.lang.String str26 = group5;
                                                                f6 = java.lang.Float.parseFloat(group5) / 100.0f;
                                                                java.lang.String group6 = matcher3.group(2);
                                                                group6.getClass();
                                                                java.lang.String str27 = group6;
                                                                f = java.lang.Float.parseFloat(group6) / 100.0f;
                                                            } catch (java.lang.NumberFormatException unused5) {
                                                                com.google.android.gms.internal.ads.zzeg.zzc("TtmlParser", "Ignoring region with malformed origin: ".concat(str9));
                                                            }
                                                        } else {
                                                            hashMap2 = hashMap4;
                                                            if (!matcher4.matches()) {
                                                                com.google.android.gms.internal.ads.zzeg.zzc("TtmlParser", "Ignoring region with unsupported origin: ".concat(str9));
                                                            } else if (zzaokVar == null) {
                                                                com.google.android.gms.internal.ads.zzeg.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(str9));
                                                            } else {
                                                                try {
                                                                    java.lang.String group7 = matcher4.group(1);
                                                                    group7.getClass();
                                                                    java.lang.String str28 = group7;
                                                                    int parseInt5 = java.lang.Integer.parseInt(group7);
                                                                    java.lang.String group8 = matcher4.group(2);
                                                                    group8.getClass();
                                                                    java.lang.String str29 = group8;
                                                                    f6 = parseInt5 / zzaokVar.zza;
                                                                    f = java.lang.Integer.parseInt(group8) / zzaokVar.zzb;
                                                                } catch (java.lang.NumberFormatException unused6) {
                                                                    com.google.android.gms.internal.ads.zzeg.zzc("TtmlParser", "Ignoring region with malformed origin: ".concat(str9));
                                                                }
                                                            }
                                                        }
                                                        f2 = f6;
                                                    } else {
                                                        hashMap2 = hashMap4;
                                                        str10 = str1922;
                                                        str11 = str2022;
                                                        f = 0.0f;
                                                        f2 = 0.0f;
                                                    }
                                                    zzc3 = com.google.android.gms.internal.ads.zzft.zzc(newPullParser, "extent");
                                                    if (zzc3 == null && (zzc6 = com.google.android.gms.internal.ads.zzft.zzc(newPullParser, "style")) != null && (zzaooVar = (com.google.android.gms.internal.ads.zzaoo) hashMap3.get(zzc6)) != null) {
                                                        zzc3 = zzaooVar.zzN();
                                                    }
                                                    if (zzc3 == null) {
                                                        java.util.regex.Matcher matcher5 = zzb.matcher(zzc3);
                                                        java.util.regex.Matcher matcher6 = zzf.matcher(zzc3);
                                                        if (matcher5.matches()) {
                                                            try {
                                                                java.lang.String group9 = matcher5.group(1);
                                                                group9.getClass();
                                                                java.lang.String str30 = group9;
                                                                float parseFloat = java.lang.Float.parseFloat(group9) / 100.0f;
                                                                java.lang.String group10 = matcher5.group(2);
                                                                group10.getClass();
                                                                java.lang.String str31 = group10;
                                                                f4 = java.lang.Float.parseFloat(group10) / 100.0f;
                                                                f3 = parseFloat;
                                                            } catch (java.lang.NumberFormatException unused7) {
                                                                java.lang.String.valueOf(str9);
                                                                com.google.android.gms.internal.ads.zzeg.zzc("TtmlParser", "Ignoring region with malformed extent: ".concat(java.lang.String.valueOf(str9)));
                                                            }
                                                        } else if (!matcher6.matches()) {
                                                            java.lang.String.valueOf(str9);
                                                            com.google.android.gms.internal.ads.zzeg.zzc("TtmlParser", "Ignoring region with unsupported extent: ".concat(java.lang.String.valueOf(str9)));
                                                        } else if (zzaokVar == null) {
                                                            java.lang.String.valueOf(str9);
                                                            com.google.android.gms.internal.ads.zzeg.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(java.lang.String.valueOf(str9)));
                                                        } else {
                                                            try {
                                                                java.lang.String group11 = matcher6.group(1);
                                                                group11.getClass();
                                                                java.lang.String str32 = group11;
                                                                int parseInt6 = java.lang.Integer.parseInt(group11);
                                                                java.lang.String group12 = matcher6.group(2);
                                                                group12.getClass();
                                                                java.lang.String str33 = group12;
                                                                float f8 = parseInt6 / zzaokVar.zza;
                                                                f4 = java.lang.Integer.parseInt(group12) / zzaokVar.zzb;
                                                                f3 = f8;
                                                            } catch (java.lang.NumberFormatException unused8) {
                                                                java.lang.String.valueOf(str9);
                                                                com.google.android.gms.internal.ads.zzeg.zzc("TtmlParser", "Ignoring region with malformed extent: ".concat(java.lang.String.valueOf(str9)));
                                                            }
                                                        }
                                                    } else {
                                                        f3 = 1.0f;
                                                        f4 = 1.0f;
                                                    }
                                                    zzc4 = com.google.android.gms.internal.ads.zzft.zzc(newPullParser, "displayAlign");
                                                    if (zzc4 != null) {
                                                        java.lang.String zza2 = com.google.android.gms.internal.ads.zzgss.zza(zzc4);
                                                        int hashCode = zza2.hashCode();
                                                        if (hashCode != -1364013995) {
                                                            if (hashCode == 92734940 && zza2.equals("after")) {
                                                                c3 = 1;
                                                                if (c3 != 0) {
                                                                    f5 = f + (f4 / 2.0f);
                                                                    i4 = 1;
                                                                } else if (c3 == 1) {
                                                                    f5 = f + f4;
                                                                    i4 = 2;
                                                                }
                                                                float f9 = 1.0f / i3;
                                                                zzc5 = com.google.android.gms.internal.ads.zzft.zzc(newPullParser, "writingMode");
                                                                if (zzc5 != null) {
                                                                    java.lang.String zza3 = com.google.android.gms.internal.ads.zzgss.zza(zzc5);
                                                                    int hashCode2 = zza3.hashCode();
                                                                    if (hashCode2 == 3694) {
                                                                        if (zza3.equals("tb")) {
                                                                            c2 = 0;
                                                                            if (c2 != 0) {
                                                                            }
                                                                            i5 = 2;
                                                                            zzaomVar = new com.google.android.gms.internal.ads.zzaom(zzc10, f2, f5, 0, i4, f3, f4, 1, f9, i5);
                                                                            if (zzaomVar != null) {
                                                                            }
                                                                            str7 = str25;
                                                                            hashMap = hashMap6;
                                                                            str6 = str10;
                                                                            str4 = str11;
                                                                        }
                                                                        c2 = 65535;
                                                                        if (c2 != 0) {
                                                                        }
                                                                        i5 = 2;
                                                                        zzaomVar = new com.google.android.gms.internal.ads.zzaom(zzc10, f2, f5, 0, i4, f3, f4, 1, f9, i5);
                                                                        if (zzaomVar != null) {
                                                                        }
                                                                        str7 = str25;
                                                                        hashMap = hashMap6;
                                                                        str6 = str10;
                                                                        str4 = str11;
                                                                    } else if (hashCode2 != 3553396) {
                                                                        if (hashCode2 == 3553576 && zza3.equals("tbrl")) {
                                                                            c2 = 2;
                                                                            if (c2 != 0 || c2 == 1) {
                                                                                i5 = 2;
                                                                            } else if (c2 == 2) {
                                                                                i5 = 1;
                                                                            }
                                                                            zzaomVar = new com.google.android.gms.internal.ads.zzaom(zzc10, f2, f5, 0, i4, f3, f4, 1, f9, i5);
                                                                            if (zzaomVar != null) {
                                                                                hashMap4 = hashMap2;
                                                                                hashMap4.put(zzaomVar.zza, zzaomVar);
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
                                                                        i5 = 2;
                                                                        zzaomVar = new com.google.android.gms.internal.ads.zzaom(zzc10, f2, f5, 0, i4, f3, f4, 1, f9, i5);
                                                                        if (zzaomVar != null) {
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
                                                                            i5 = 2;
                                                                            zzaomVar = new com.google.android.gms.internal.ads.zzaom(zzc10, f2, f5, 0, i4, f3, f4, 1, f9, i5);
                                                                            if (zzaomVar != null) {
                                                                            }
                                                                            str7 = str25;
                                                                            hashMap = hashMap6;
                                                                            str6 = str10;
                                                                            str4 = str11;
                                                                        }
                                                                        c2 = 65535;
                                                                        if (c2 != 0) {
                                                                        }
                                                                        i5 = 2;
                                                                        zzaomVar = new com.google.android.gms.internal.ads.zzaom(zzc10, f2, f5, 0, i4, f3, f4, 1, f9, i5);
                                                                        if (zzaomVar != null) {
                                                                        }
                                                                        str7 = str25;
                                                                        hashMap = hashMap6;
                                                                        str6 = str10;
                                                                        str4 = str11;
                                                                    }
                                                                }
                                                                i5 = Integer.MIN_VALUE;
                                                                zzaomVar = new com.google.android.gms.internal.ads.zzaom(zzc10, f2, f5, 0, i4, f3, f4, 1, f9, i5);
                                                                if (zzaomVar != null) {
                                                                }
                                                                str7 = str25;
                                                                hashMap = hashMap6;
                                                                str6 = str10;
                                                                str4 = str11;
                                                            }
                                                            c3 = 65535;
                                                            if (c3 != 0) {
                                                            }
                                                            float f92 = 1.0f / i3;
                                                            zzc5 = com.google.android.gms.internal.ads.zzft.zzc(newPullParser, "writingMode");
                                                            if (zzc5 != null) {
                                                            }
                                                            i5 = Integer.MIN_VALUE;
                                                            zzaomVar = new com.google.android.gms.internal.ads.zzaom(zzc10, f2, f5, 0, i4, f3, f4, 1, f92, i5);
                                                            if (zzaomVar != null) {
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
                                                                float f922 = 1.0f / i3;
                                                                zzc5 = com.google.android.gms.internal.ads.zzft.zzc(newPullParser, "writingMode");
                                                                if (zzc5 != null) {
                                                                }
                                                                i5 = Integer.MIN_VALUE;
                                                                zzaomVar = new com.google.android.gms.internal.ads.zzaom(zzc10, f2, f5, 0, i4, f3, f4, 1, f922, i5);
                                                                if (zzaomVar != null) {
                                                                }
                                                                str7 = str25;
                                                                hashMap = hashMap6;
                                                                str6 = str10;
                                                                str4 = str11;
                                                            }
                                                            c3 = 65535;
                                                            if (c3 != 0) {
                                                            }
                                                            float f9222 = 1.0f / i3;
                                                            zzc5 = com.google.android.gms.internal.ads.zzft.zzc(newPullParser, "writingMode");
                                                            if (zzc5 != null) {
                                                            }
                                                            i5 = Integer.MIN_VALUE;
                                                            zzaomVar = new com.google.android.gms.internal.ads.zzaom(zzc10, f2, f5, 0, i4, f3, f4, 1, f9222, i5);
                                                            if (zzaomVar != null) {
                                                            }
                                                            str7 = str25;
                                                            hashMap = hashMap6;
                                                            str6 = str10;
                                                            str4 = str11;
                                                        }
                                                    }
                                                    f5 = f;
                                                    i4 = 0;
                                                    float f92222 = 1.0f / i3;
                                                    zzc5 = com.google.android.gms.internal.ads.zzft.zzc(newPullParser, "writingMode");
                                                    if (zzc5 != null) {
                                                    }
                                                    i5 = Integer.MIN_VALUE;
                                                    zzaomVar = new com.google.android.gms.internal.ads.zzaom(zzc10, f2, f5, 0, i4, f3, f4, 1, f92222, i5);
                                                    if (zzaomVar != null) {
                                                    }
                                                    str7 = str25;
                                                    hashMap = hashMap6;
                                                    str6 = str10;
                                                    str4 = str11;
                                                }
                                            } else {
                                                str8 = zzc11;
                                            }
                                            str9 = str8;
                                            if (str9 == null) {
                                            }
                                            zzc3 = com.google.android.gms.internal.ads.zzft.zzc(newPullParser, "extent");
                                            if (zzc3 == null) {
                                                zzc3 = zzaooVar.zzN();
                                            }
                                            if (zzc3 == null) {
                                            }
                                            zzc4 = com.google.android.gms.internal.ads.zzft.zzc(newPullParser, "displayAlign");
                                            if (zzc4 != null) {
                                            }
                                            f5 = f;
                                            i4 = 0;
                                            float f922222 = 1.0f / i3;
                                            zzc5 = com.google.android.gms.internal.ads.zzft.zzc(newPullParser, "writingMode");
                                            if (zzc5 != null) {
                                            }
                                            i5 = Integer.MIN_VALUE;
                                            zzaomVar = new com.google.android.gms.internal.ads.zzaom(zzc10, f2, f5, 0, i4, f3, f4, 1, f922222, i5);
                                            if (zzaomVar != null) {
                                            }
                                            str7 = str25;
                                            hashMap = hashMap6;
                                            str6 = str10;
                                            str4 = str11;
                                        }
                                        zzaomVar = null;
                                        if (zzaomVar != null) {
                                        }
                                        str7 = str25;
                                        hashMap = hashMap6;
                                        str6 = str10;
                                        str4 = str11;
                                    } else {
                                        java.util.HashMap hashMap7 = hashMap5;
                                        java.lang.String str34 = str1922;
                                        str4 = str2022;
                                        str5 = str2122;
                                        if (com.google.android.gms.internal.ads.zzft.zzb(newPullParser, str4)) {
                                            while (true) {
                                                newPullParser.next();
                                                str6 = str34;
                                                if (!com.google.android.gms.internal.ads.zzft.zzb(newPullParser, str6) || (zzc2 = com.google.android.gms.internal.ads.zzft.zzc(newPullParser, "id")) == null) {
                                                    hashMap = hashMap7;
                                                } else {
                                                    hashMap = hashMap7;
                                                    hashMap.put(zzc2, newPullParser.nextText());
                                                }
                                                if (!com.google.android.gms.internal.ads.zzft.zza(newPullParser, str4)) {
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
                                if (com.google.android.gms.internal.ads.zzft.zza(newPullParser, str7)) {
                                    zzaojVar2 = zzaojVar4;
                                    arrayDeque = arrayDeque2;
                                } else {
                                    str2222 = str7;
                                    str1922 = str6;
                                    hashMap5 = hashMap;
                                    str2122 = str5;
                                    str15 = str3;
                                    str2022 = str4;
                                }
                            }
                        } else {
                            str3 = str15;
                            hashMap = hashMap5;
                            java.lang.Object obj2 = "region";
                            try {
                                int attributeCount = newPullParser.getAttributeCount();
                                com.google.android.gms.internal.ads.zzaoo zzd3 = zzd(newPullParser, null);
                                java.lang.String[] strArr = null;
                                java.lang.String str35 = null;
                                java.lang.String str36 = str;
                                int i13 = 0;
                                long j4 = -9223372036854775807L;
                                long j5 = -9223372036854775807L;
                                long j6 = -9223372036854775807L;
                                while (i13 < attributeCount) {
                                    try {
                                        java.lang.String attributeName = newPullParser.getAttributeName(i13);
                                        java.lang.String attributeValue6 = newPullParser.getAttributeValue(i13);
                                        int i14 = attributeCount;
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
                                            zzaojVar2 = zzaojVar4;
                                            j5 = zzg(attributeValue6, zzaojVar2);
                                        } else if (c == 1) {
                                            zzaojVar2 = zzaojVar4;
                                            j4 = zzg(attributeValue6, zzaojVar2);
                                        } else if (c != 2) {
                                            if (c == 3) {
                                                java.lang.String[] zzc13 = zzc(attributeValue6);
                                                if (zzc13.length > 0) {
                                                    strArr = zzc13;
                                                }
                                            } else if (c != 4) {
                                                if (c == 5) {
                                                    try {
                                                        if (attributeValue6.startsWith("#")) {
                                                            try {
                                                                str35 = attributeValue6.substring(1);
                                                            } catch (com.google.android.gms.internal.ads.zzanh e) {
                                                                e = e;
                                                                zzanhVar = e;
                                                                zzaojVar2 = zzaojVar4;
                                                                arrayDeque = arrayDeque2;
                                                                com.google.android.gms.internal.ads.zzeg.zzd("TtmlParser", "Suppressing parser error", zzanhVar);
                                                                zzaojVar4 = zzaojVar2;
                                                                zzaokVar2 = zzaokVar;
                                                                i9 = i3;
                                                                zzaopVar2 = zzaopVar;
                                                                i8 = 1;
                                                                newPullParser.next();
                                                                eventType = newPullParser.getEventType();
                                                                arrayDeque3 = arrayDeque;
                                                                hashMap5 = hashMap;
                                                                str13 = str;
                                                                zzaojVar3 = zzaojVar;
                                                                str14 = str2;
                                                                str15 = str3;
                                                            }
                                                        }
                                                    } catch (com.google.android.gms.internal.ads.zzanh e2) {
                                                        e = e2;
                                                    }
                                                }
                                            } else if (hashMap4.containsKey(attributeValue6)) {
                                                str36 = attributeValue6;
                                            }
                                            zzaojVar2 = zzaojVar4;
                                        } else {
                                            zzaojVar2 = zzaojVar4;
                                            try {
                                                j6 = zzg(attributeValue6, zzaojVar2);
                                            } catch (com.google.android.gms.internal.ads.zzanh e3) {
                                                e = e3;
                                                zzanhVar = e;
                                                arrayDeque = arrayDeque2;
                                                com.google.android.gms.internal.ads.zzeg.zzd("TtmlParser", "Suppressing parser error", zzanhVar);
                                                zzaojVar4 = zzaojVar2;
                                                zzaokVar2 = zzaokVar;
                                                i9 = i3;
                                                zzaopVar2 = zzaopVar;
                                                i8 = 1;
                                                newPullParser.next();
                                                eventType = newPullParser.getEventType();
                                                arrayDeque3 = arrayDeque;
                                                hashMap5 = hashMap;
                                                str13 = str;
                                                zzaojVar3 = zzaojVar;
                                                str14 = str2;
                                                str15 = str3;
                                            }
                                        }
                                        i13++;
                                        zzaojVar4 = zzaojVar2;
                                        obj2 = obj;
                                        attributeCount = i14;
                                        zzaojVar2 = null;
                                    } catch (com.google.android.gms.internal.ads.zzanh e4) {
                                        e = e4;
                                        zzaojVar2 = zzaojVar4;
                                    }
                                }
                                zzaojVar2 = zzaojVar4;
                                try {
                                    if (zzaoiVar3 != null) {
                                        zzaoiVar = zzaoiVar3;
                                        long j7 = zzaoiVar.zzd;
                                        if (j7 != -9223372036854775807L) {
                                            j = j5 != -9223372036854775807L ? j5 + j7 : -9223372036854775807L;
                                            if (j4 != -9223372036854775807L) {
                                                j4 += j7;
                                                zzaoiVar2 = zzaoiVar;
                                            } else {
                                                zzaoiVar2 = zzaoiVar;
                                                j2 = -9223372036854775807L;
                                                j4 = -9223372036854775807L;
                                                if (j4 == j2) {
                                                    if (j6 != j2) {
                                                        j3 = j + j6;
                                                    } else {
                                                        if (zzaoiVar2 != null) {
                                                            j4 = zzaoiVar2.zze;
                                                        }
                                                        j3 = j2;
                                                    }
                                                    com.google.android.gms.internal.ads.zzaoi zzb2 = com.google.android.gms.internal.ads.zzaoi.zzb(newPullParser.getName(), j, j3, zzd3, strArr, str36, str35, zzaoiVar2);
                                                    arrayDeque = arrayDeque2;
                                                    arrayDeque.push(zzb2);
                                                    if (zzaoiVar != null) {
                                                        zzaoiVar.zzd(zzb2);
                                                    }
                                                }
                                                j3 = j4;
                                                com.google.android.gms.internal.ads.zzaoi zzb22 = com.google.android.gms.internal.ads.zzaoi.zzb(newPullParser.getName(), j, j3, zzd3, strArr, str36, str35, zzaoiVar2);
                                                arrayDeque = arrayDeque2;
                                                arrayDeque.push(zzb22);
                                                if (zzaoiVar != null) {
                                                }
                                            }
                                        } else {
                                            zzaoiVar2 = zzaoiVar;
                                            j = j5;
                                        }
                                    } else {
                                        zzaoiVar = zzaoiVar3;
                                        j = j5;
                                        zzaoiVar2 = null;
                                    }
                                    arrayDeque.push(zzb22);
                                    if (zzaoiVar != null) {
                                    }
                                } catch (com.google.android.gms.internal.ads.zzanh e5) {
                                    e = e5;
                                    zzanhVar = e;
                                    com.google.android.gms.internal.ads.zzeg.zzd("TtmlParser", "Suppressing parser error", zzanhVar);
                                    zzaojVar4 = zzaojVar2;
                                    zzaokVar2 = zzaokVar;
                                    i9 = i3;
                                    zzaopVar2 = zzaopVar;
                                    i8 = 1;
                                    newPullParser.next();
                                    eventType = newPullParser.getEventType();
                                    arrayDeque3 = arrayDeque;
                                    hashMap5 = hashMap;
                                    str13 = str;
                                    zzaojVar3 = zzaojVar;
                                    str14 = str2;
                                    str15 = str3;
                                }
                                j2 = -9223372036854775807L;
                                if (j4 == j2) {
                                }
                                j3 = j4;
                                com.google.android.gms.internal.ads.zzaoi zzb222 = com.google.android.gms.internal.ads.zzaoi.zzb(newPullParser.getName(), j, j3, zzd3, strArr, str36, str35, zzaoiVar2);
                                arrayDeque = arrayDeque2;
                            } catch (com.google.android.gms.internal.ads.zzanh e6) {
                                e = e6;
                                zzaojVar2 = zzaojVar4;
                                arrayDeque = arrayDeque2;
                            }
                        }
                        zzaojVar4 = zzaojVar2;
                        zzaokVar2 = zzaokVar;
                        i9 = i3;
                    } else {
                        str2 = str14;
                        str3 = str15;
                        zzaojVar = zzaojVar3;
                        zzaopVar = zzaopVar2;
                        hashMap = hashMap5;
                        arrayDeque = arrayDeque3;
                        if (eventType == 4) {
                            zzaoiVar3.getClass();
                            com.google.android.gms.internal.ads.zzaoi zzaoiVar4 = zzaoiVar3;
                            zzaoiVar3.zzd(com.google.android.gms.internal.ads.zzaoi.zza(newPullParser.getText()));
                        } else if (eventType == 3) {
                            if (newPullParser.getName().equals("tt")) {
                                com.google.android.gms.internal.ads.zzaoi zzaoiVar5 = (com.google.android.gms.internal.ads.zzaoi) arrayDeque.peek();
                                zzaoiVar5.getClass();
                                com.google.android.gms.internal.ads.zzaoi zzaoiVar6 = zzaoiVar5;
                                zzaopVar2 = new com.google.android.gms.internal.ads.zzaop(zzaoiVar5, hashMap3, hashMap4, hashMap);
                            } else {
                                zzaopVar2 = zzaopVar;
                            }
                            arrayDeque.pop();
                        }
                    }
                    newPullParser.next();
                    eventType = newPullParser.getEventType();
                    arrayDeque3 = arrayDeque;
                    hashMap5 = hashMap;
                    str13 = str;
                    zzaojVar3 = zzaojVar;
                    str14 = str2;
                    str15 = str3;
                } else {
                    str = str13;
                    str2 = str14;
                    str3 = str15;
                    arrayDeque = arrayDeque3;
                    zzaojVar = zzaojVar3;
                    zzaopVar = zzaopVar2;
                    hashMap = hashMap5;
                    if (eventType == 2) {
                        i8++;
                    } else if (eventType == 3) {
                        i8--;
                    }
                }
                zzaopVar2 = zzaopVar;
                newPullParser.next();
                eventType = newPullParser.getEventType();
                arrayDeque3 = arrayDeque;
                hashMap5 = hashMap;
                str13 = str;
                zzaojVar3 = zzaojVar;
                str14 = str2;
                str15 = str3;
            }
            com.google.android.gms.internal.ads.zzaop zzaopVar3 = zzaopVar2;
            zzaopVar3.getClass();
            return zzaopVar3;
        } catch (java.io.IOException e7) {
            throw new java.lang.IllegalStateException("Unexpected error when reading input.", e7);
        } catch (org.xmlpull.v1.XmlPullParserException e8) {
            throw new java.lang.IllegalStateException("Unable to decode source", e8);
        }
    }

    public zzaol() {
        try {
            org.xmlpull.v1.XmlPullParserFactory newInstance = org.xmlpull.v1.XmlPullParserFactory.newInstance();
            this.zzi = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (org.xmlpull.v1.XmlPullParserException e) {
            throw new java.lang.RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }
}
