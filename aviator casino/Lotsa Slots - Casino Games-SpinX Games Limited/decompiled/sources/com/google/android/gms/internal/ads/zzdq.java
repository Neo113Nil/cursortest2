package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdq {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 1};
    private static final java.lang.String[] zzc = {"", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C"};
    private static final java.util.regex.Pattern zzd = java.util.regex.Pattern.compile("^\\D?(\\d+)$");

    public static com.google.android.gms.internal.ads.zzgwm zza(byte b, byte b2, byte b3, byte b4) {
        return com.google.android.gms.internal.ads.zzgwm.zzj(new byte[]{1, 1, b, 2, 1, b2, 3, 1, b3, 4, 1, b4});
    }

    public static java.lang.String zzb(int i, int i2, int i3) {
        return java.lang.String.format("avc1.%02X%02X%02X", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3));
    }

    public static java.lang.String zzc(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = zzc[i];
        objArr[1] = java.lang.Integer.valueOf(i2);
        objArr[2] = java.lang.Integer.valueOf(i3);
        objArr[3] = java.lang.Character.valueOf(true != z ? 'L' : 'H');
        objArr[4] = java.lang.Integer.valueOf(i4);
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.format(java.util.Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i5 = 6;
        while (i5 > 0) {
            int i6 = i5 - 1;
            if (iArr[i6] != 0) {
                break;
            }
            i5 = i6;
        }
        for (int i7 = 0; i7 < i5; i7++) {
            sb.append(java.lang.String.format(".%02X", java.lang.Integer.valueOf(iArr[i7])));
        }
        return sb.toString();
    }

    public static java.lang.String zzd(byte[] bArr) {
        int length = bArr.length;
        com.google.android.gms.internal.ads.zzgtj.zzd(length >= 17, "Invalid APV CSD length: %s", length);
        byte b = bArr[0];
        com.google.android.gms.internal.ads.zzgtj.zzd(b == 1, "Invalid APV CSD version: %s", b);
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(bArr[5]), java.lang.Integer.valueOf(bArr[6]), java.lang.Integer.valueOf(bArr[7])};
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        return java.lang.String.format(java.util.Locale.US, "apv1.apvf%d.apvl%d.apvb%d", objArr);
    }

    public static android.util.Pair zze(com.google.android.gms.internal.ads.zzv zzvVar) {
        com.google.android.gms.internal.ads.zzdp zzf = zzf(zzvVar);
        if (zzf == null || !zzf.zzc()) {
            return null;
        }
        return new android.util.Pair(java.lang.Integer.valueOf(zzf.zza()), java.lang.Integer.valueOf(zzf.zzb()));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x07c5, code lost:
    
        if (r2.equals("L48") != false) goto L434;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0464  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.google.android.gms.internal.ads.zzdp zzf(com.google.android.gms.internal.ads.zzv zzvVar) {
        char c;
        int i;
        int parseInt;
        int parseInt2;
        int i2;
        int i3;
        java.lang.Integer num;
        com.google.android.gms.internal.ads.zzdp zzdpVar;
        int i4;
        int i5;
        int i6;
        int i7;
        char c2;
        int i8;
        int i9;
        java.lang.Integer num2;
        java.lang.Integer num3;
        java.lang.String str = zzvVar.zzk;
        if (str != null) {
            java.lang.String[] split = str.split("\\.");
            int i10 = 16;
            int i11 = 8;
            int i12 = 3;
            int i13 = 1;
            if (!"video/dolby-vision".equals(zzvVar.zzp)) {
                java.lang.String str2 = split[0];
                switch (str2.hashCode()) {
                    case 2986313:
                        if (str2.equals("ac-4")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3001066:
                        if (str2.equals("apv1")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3004662:
                        if (str2.equals("av01")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3006243:
                        if (str2.equals("avc1")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3006244:
                        if (str2.equals("avc2")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3199032:
                        if (str2.equals("hev1")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3214780:
                        if (str2.equals("hvc1")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3224753:
                        if (str2.equals("iamf")) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3356560:
                        if (str2.equals("mp4a")) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3475740:
                        if (str2.equals("s263")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3624515:
                        if (str2.equals("vp09")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3631854:
                        if (str2.equals("vvc1")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3632040:
                        if (str2.equals("vvi1")) {
                            c = 7;
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
                        java.lang.String str3 = zzvVar.zzk;
                        if (split.length >= 3) {
                            try {
                                int parseInt3 = java.lang.Integer.parseInt(split[1]);
                                int parseInt4 = java.lang.Integer.parseInt(split[2]);
                                switch (parseInt3) {
                                    case 0:
                                        i = 1;
                                        break;
                                    case 1:
                                        i = 2;
                                        break;
                                    case 2:
                                        i = 4;
                                        break;
                                    case 3:
                                        i = 8;
                                        break;
                                    case 4:
                                        i = 16;
                                        break;
                                    case 5:
                                        i = 32;
                                        break;
                                    case 6:
                                        i = 64;
                                        break;
                                    case 7:
                                        i = 128;
                                        break;
                                    case 8:
                                        i = 256;
                                        break;
                                    default:
                                        i = -1;
                                        break;
                                }
                                if (i == -1) {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(parseInt3).length() + 22);
                                    sb.append("Unknown H263 profile: ");
                                    sb.append(parseInt3);
                                    com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", sb.toString());
                                    return com.google.android.gms.internal.ads.zzdp.zza;
                                }
                                if (parseInt4 == 10) {
                                    i11 = 1;
                                } else if (parseInt4 == 20) {
                                    i11 = 2;
                                } else if (parseInt4 == 30) {
                                    i11 = 4;
                                } else if (parseInt4 != 40) {
                                    i11 = parseInt4 != 45 ? parseInt4 != 50 ? parseInt4 != 60 ? parseInt4 != 70 ? -1 : 128 : 64 : 32 : 16;
                                }
                                if (i11 != -1) {
                                    return new com.google.android.gms.internal.ads.zzdp(i, i11);
                                }
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(parseInt4).length() + 20);
                                sb2.append("Unknown H263 level: ");
                                sb2.append(parseInt4);
                                com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", sb2.toString());
                                return com.google.android.gms.internal.ads.zzdp.zza;
                            } catch (java.lang.NumberFormatException unused) {
                                java.lang.String.valueOf(str3);
                                com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: ".concat(java.lang.String.valueOf(str3)));
                                break;
                            }
                        } else {
                            java.lang.String.valueOf(str3);
                            com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: ".concat(java.lang.String.valueOf(str3)));
                            break;
                        }
                    case 1:
                    case 2:
                        java.lang.String str4 = zzvVar.zzk;
                        int length = split.length;
                        if (length >= 2) {
                            try {
                                if (split[1].length() != 6) {
                                    if (length < 3) {
                                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(str4).length() + 37);
                                        sb3.append("Ignoring malformed AVC codec string: ");
                                        sb3.append(str4);
                                        com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", sb3.toString());
                                        break;
                                    } else {
                                        parseInt = java.lang.Integer.parseInt(split[1]);
                                        parseInt2 = java.lang.Integer.parseInt(split[2]);
                                    }
                                } else {
                                    parseInt = java.lang.Integer.parseInt(split[1].substring(0, 2), 16);
                                    parseInt2 = java.lang.Integer.parseInt(split[1].substring(4), 16);
                                }
                                int i14 = parseInt != 66 ? parseInt != 77 ? parseInt != 88 ? parseInt != 100 ? parseInt != 110 ? parseInt != 122 ? parseInt != 244 ? -1 : 64 : 32 : 16 : 8 : 4 : 2 : 1;
                                if (i14 == -1) {
                                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder(java.lang.String.valueOf(parseInt).length() + 21);
                                    sb4.append("Unknown AVC profile: ");
                                    sb4.append(parseInt);
                                    com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", sb4.toString());
                                    return com.google.android.gms.internal.ads.zzdp.zza;
                                }
                                switch (parseInt2) {
                                    case 10:
                                        i2 = 1;
                                        break;
                                    case 11:
                                        i2 = 4;
                                        break;
                                    case 12:
                                        i2 = 8;
                                        break;
                                    case 13:
                                        i2 = 16;
                                        break;
                                    default:
                                        switch (parseInt2) {
                                            case 20:
                                                i2 = 32;
                                                break;
                                            case 21:
                                                i2 = 64;
                                                break;
                                            case 22:
                                                i2 = 128;
                                                break;
                                            default:
                                                switch (parseInt2) {
                                                    case 30:
                                                        i2 = 256;
                                                        break;
                                                    case 31:
                                                        i2 = 512;
                                                        break;
                                                    case 32:
                                                        i2 = 1024;
                                                        break;
                                                    default:
                                                        switch (parseInt2) {
                                                            case 40:
                                                                i2 = 2048;
                                                                break;
                                                            case 41:
                                                                i2 = 4096;
                                                                break;
                                                            case 42:
                                                                i2 = 8192;
                                                                break;
                                                            default:
                                                                switch (parseInt2) {
                                                                    case 50:
                                                                        i2 = 16384;
                                                                        break;
                                                                    case 51:
                                                                        i2 = 32768;
                                                                        break;
                                                                    case 52:
                                                                        i2 = 65536;
                                                                        break;
                                                                    default:
                                                                        i2 = -1;
                                                                        break;
                                                                }
                                                        }
                                                }
                                        }
                                }
                                if (i2 != -1) {
                                    return new com.google.android.gms.internal.ads.zzdp(i14, i2);
                                }
                                java.lang.StringBuilder sb5 = new java.lang.StringBuilder(java.lang.String.valueOf(parseInt2).length() + 19);
                                sb5.append("Unknown AVC level: ");
                                sb5.append(parseInt2);
                                com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", sb5.toString());
                                return com.google.android.gms.internal.ads.zzdp.zza;
                            } catch (java.lang.NumberFormatException unused2) {
                                java.lang.String.valueOf(str4);
                                com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: ".concat(java.lang.String.valueOf(str4)));
                                break;
                            }
                        } else {
                            java.lang.String.valueOf(str4);
                            com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: ".concat(java.lang.String.valueOf(str4)));
                            break;
                        }
                    case 3:
                        int i15 = 2048;
                        java.lang.String str5 = zzvVar.zzk;
                        if (split.length >= 3) {
                            try {
                                int parseInt5 = java.lang.Integer.parseInt(split[1]);
                                int parseInt6 = java.lang.Integer.parseInt(split[2]);
                                int i16 = parseInt5 != 0 ? parseInt5 != 1 ? parseInt5 != 2 ? parseInt5 != 3 ? -1 : 8 : 4 : 2 : 1;
                                if (i16 == -1) {
                                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(parseInt5).length() + 21);
                                    sb6.append("Unknown VP9 profile: ");
                                    sb6.append(parseInt5);
                                    com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", sb6.toString());
                                    return com.google.android.gms.internal.ads.zzdp.zza;
                                }
                                if (parseInt6 == 10) {
                                    i15 = 1;
                                } else if (parseInt6 == 11) {
                                    i15 = 2;
                                } else if (parseInt6 == 20) {
                                    i15 = 4;
                                } else if (parseInt6 == 21) {
                                    i15 = 8;
                                } else if (parseInt6 == 30) {
                                    i15 = 16;
                                } else if (parseInt6 == 31) {
                                    i15 = 32;
                                } else if (parseInt6 == 40) {
                                    i15 = 64;
                                } else if (parseInt6 == 41) {
                                    i15 = 128;
                                } else if (parseInt6 == 50) {
                                    i15 = 256;
                                } else if (parseInt6 != 51) {
                                    switch (parseInt6) {
                                        case 60:
                                            break;
                                        case 61:
                                            i15 = 4096;
                                            break;
                                        case 62:
                                            i15 = 8192;
                                            break;
                                        default:
                                            i15 = -1;
                                            break;
                                    }
                                } else {
                                    i15 = 512;
                                }
                                if (i15 != -1) {
                                    return new com.google.android.gms.internal.ads.zzdp(i16, i15);
                                }
                                java.lang.StringBuilder sb7 = new java.lang.StringBuilder(java.lang.String.valueOf(parseInt6).length() + 19);
                                sb7.append("Unknown VP9 level: ");
                                sb7.append(parseInt6);
                                com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", sb7.toString());
                                return com.google.android.gms.internal.ads.zzdp.zza;
                            } catch (java.lang.NumberFormatException unused3) {
                                java.lang.String.valueOf(str5);
                                com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: ".concat(java.lang.String.valueOf(str5)));
                                break;
                            }
                        } else {
                            java.lang.String.valueOf(str5);
                            com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: ".concat(java.lang.String.valueOf(str5)));
                            break;
                        }
                    case 4:
                    case 5:
                        return zzg(zzvVar.zzk, split, zzvVar.zzF);
                    case 6:
                    case 7:
                        java.lang.String str6 = zzvVar.zzk;
                        com.google.android.gms.internal.ads.zzi zziVar = zzvVar.zzF;
                        if (split.length >= 3) {
                            try {
                                int parseInt7 = java.lang.Integer.parseInt(split[1]);
                                if (parseInt7 == 1) {
                                    i3 = (zziVar == null || zziVar.zzd != 6) ? (zziVar == null || zziVar.zzf != 8) ? 2 : 1 : 4096;
                                } else {
                                    if (parseInt7 != 65) {
                                        java.lang.String str7 = split[1];
                                        java.lang.String.valueOf(str7);
                                        com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", "Unknown VVC profile IDC: ".concat(java.lang.String.valueOf(str7)));
                                        return com.google.android.gms.internal.ads.zzdp.zza;
                                    }
                                    i3 = 4;
                                }
                                java.lang.String str8 = split[2];
                                switch (str8.hashCode()) {
                                    case 70918:
                                        if (str8.equals("H64")) {
                                            i12 = 6;
                                            break;
                                        }
                                        i12 = -1;
                                        break;
                                    case 70921:
                                        if (str8.equals("H67")) {
                                            i12 = 8;
                                            break;
                                        }
                                        i12 = -1;
                                        break;
                                    case 70976:
                                        if (str8.equals("H80")) {
                                            i12 = 10;
                                            break;
                                        }
                                        i12 = -1;
                                        break;
                                    case 70979:
                                        if (str8.equals("H83")) {
                                            i12 = 12;
                                            break;
                                        }
                                        i12 = -1;
                                        break;
                                    case 70982:
                                        if (str8.equals("H86")) {
                                            i12 = 14;
                                            break;
                                        }
                                        i12 = -1;
                                        break;
                                    case 71013:
                                        if (str8.equals("H96")) {
                                            i12 = 16;
                                            break;
                                        }
                                        i12 = -1;
                                        break;
                                    case 74609:
                                        if (str8.equals("L16")) {
                                            i12 = 0;
                                            break;
                                        }
                                        i12 = -1;
                                        break;
                                    case 74667:
                                        if (str8.equals("L32")) {
                                            i12 = 1;
                                            break;
                                        }
                                        i12 = -1;
                                        break;
                                    case 74670:
                                        if (str8.equals("L35")) {
                                            i12 = 2;
                                            break;
                                        }
                                        i12 = -1;
                                        break;
                                    case 74704:
                                        break;
                                    case 74728:
                                        if (str8.equals("L51")) {
                                            i12 = 4;
                                            break;
                                        }
                                        i12 = -1;
                                        break;
                                    case 74762:
                                        if (str8.equals("L64")) {
                                            i12 = 5;
                                            break;
                                        }
                                        i12 = -1;
                                        break;
                                    case 74765:
                                        if (str8.equals("L67")) {
                                            i12 = 7;
                                            break;
                                        }
                                        i12 = -1;
                                        break;
                                    case 74820:
                                        if (str8.equals("L80")) {
                                            i12 = 9;
                                            break;
                                        }
                                        i12 = -1;
                                        break;
                                    case 74823:
                                        if (str8.equals("L83")) {
                                            i12 = 11;
                                            break;
                                        }
                                        i12 = -1;
                                        break;
                                    case 74826:
                                        if (str8.equals("L86")) {
                                            i12 = 13;
                                            break;
                                        }
                                        i12 = -1;
                                        break;
                                    case 74857:
                                        if (str8.equals("L96")) {
                                            i12 = 15;
                                            break;
                                        }
                                        i12 = -1;
                                        break;
                                    case 2193610:
                                        if (str8.equals("H112")) {
                                            i12 = 18;
                                            break;
                                        }
                                        i12 = -1;
                                        break;
                                    case 2193647:
                                        if (str8.equals("H128")) {
                                            i12 = 20;
                                            break;
                                        }
                                        i12 = -1;
                                        break;
                                    case 2193705:
                                        if (str8.equals("H144")) {
                                            i12 = 22;
                                            break;
                                        }
                                        i12 = -1;
                                        break;
                                    case 2312774:
                                        if (str8.equals("L112")) {
                                            i12 = 17;
                                            break;
                                        }
                                        i12 = -1;
                                        break;
                                    case 2312811:
                                        if (str8.equals("L128")) {
                                            i12 = 19;
                                            break;
                                        }
                                        i12 = -1;
                                        break;
                                    case 2312869:
                                        if (str8.equals("L144")) {
                                            i12 = 21;
                                            break;
                                        }
                                        i12 = -1;
                                        break;
                                    default:
                                        i12 = -1;
                                        break;
                                }
                                switch (i12) {
                                    case 0:
                                        num = 1;
                                        break;
                                    case 1:
                                        num = 2;
                                        break;
                                    case 2:
                                        num = 4;
                                        break;
                                    case 3:
                                        num = 8;
                                        break;
                                    case 4:
                                        num = 16;
                                        break;
                                    case 5:
                                        num = 32;
                                        break;
                                    case 6:
                                        num = 64;
                                        break;
                                    case 7:
                                        num = 128;
                                        break;
                                    case 8:
                                        num = 256;
                                        break;
                                    case 9:
                                        num = 512;
                                        break;
                                    case 10:
                                        num = 1024;
                                        break;
                                    case 11:
                                        num = 2048;
                                        break;
                                    case 12:
                                        num = 4096;
                                        break;
                                    case 13:
                                        num = 8192;
                                        break;
                                    case 14:
                                        num = 16384;
                                        break;
                                    case 15:
                                        num = 32768;
                                        break;
                                    case 16:
                                        num = 65536;
                                        break;
                                    case 17:
                                        num = 131072;
                                        break;
                                    case 18:
                                        num = 262144;
                                        break;
                                    case 19:
                                        num = 524288;
                                        break;
                                    case 20:
                                        num = 1048576;
                                        break;
                                    case 21:
                                        num = 2097152;
                                        break;
                                    case 22:
                                        num = 4194304;
                                        break;
                                    default:
                                        num = null;
                                        break;
                                }
                                if (num != null) {
                                    zzdpVar = new com.google.android.gms.internal.ads.zzdp(i3, num.intValue());
                                    return zzdpVar;
                                }
                                java.lang.String.valueOf(str8);
                                com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", "Unknown VVC level string: ".concat(java.lang.String.valueOf(str8)));
                                return com.google.android.gms.internal.ads.zzdp.zza;
                            } catch (java.lang.NumberFormatException unused4) {
                                java.lang.String.valueOf(str6);
                                com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", "Ignoring malformed VVC codec string: ".concat(java.lang.String.valueOf(str6)));
                                break;
                            }
                        } else {
                            java.lang.String.valueOf(str6);
                            com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", "Ignoring malformed VVC codec string: ".concat(java.lang.String.valueOf(str6)));
                            break;
                        }
                        break;
                    case '\b':
                        java.lang.String str9 = zzvVar.zzk;
                        com.google.android.gms.internal.ads.zzi zziVar2 = zzvVar.zzF;
                        if (split.length >= 4) {
                            try {
                                int parseInt8 = java.lang.Integer.parseInt(split[1]);
                                int parseInt9 = java.lang.Integer.parseInt(split[2].substring(0, 2));
                                int parseInt10 = java.lang.Integer.parseInt(split[3]);
                                if (parseInt8 != 0) {
                                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder(java.lang.String.valueOf(parseInt8).length() + 21);
                                    sb8.append("Unknown AV1 profile: ");
                                    sb8.append(parseInt8);
                                    com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", sb8.toString());
                                    return com.google.android.gms.internal.ads.zzdp.zza;
                                }
                                if (parseInt10 == 8) {
                                    i4 = 1;
                                } else {
                                    if (parseInt10 != 10) {
                                        java.lang.StringBuilder sb9 = new java.lang.StringBuilder(java.lang.String.valueOf(parseInt10).length() + 23);
                                        sb9.append("Unknown AV1 bit depth: ");
                                        sb9.append(parseInt10);
                                        com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", sb9.toString());
                                        return com.google.android.gms.internal.ads.zzdp.zza;
                                    }
                                    i4 = (zziVar2 == null || !(zziVar2.zze != null || (i6 = zziVar2.zzd) == 7 || i6 == 6)) ? 2 : 4096;
                                }
                                switch (parseInt9) {
                                    case 0:
                                        i5 = 1;
                                        break;
                                    case 1:
                                        i5 = 2;
                                        break;
                                    case 2:
                                        i5 = 4;
                                        break;
                                    case 3:
                                        i5 = 8;
                                        break;
                                    case 4:
                                        i5 = 16;
                                        break;
                                    case 5:
                                        i5 = 32;
                                        break;
                                    case 6:
                                        i5 = 64;
                                        break;
                                    case 7:
                                        i5 = 128;
                                        break;
                                    case 8:
                                        i5 = 256;
                                        break;
                                    case 9:
                                        i5 = 512;
                                        break;
                                    case 10:
                                        i5 = 1024;
                                        break;
                                    case 11:
                                        i5 = 2048;
                                        break;
                                    case 12:
                                        i5 = 4096;
                                        break;
                                    case 13:
                                        i5 = 8192;
                                        break;
                                    case 14:
                                        i5 = 16384;
                                        break;
                                    case 15:
                                        i5 = 32768;
                                        break;
                                    case 16:
                                        i5 = 65536;
                                        break;
                                    case 17:
                                        i5 = 131072;
                                        break;
                                    case 18:
                                        i5 = 262144;
                                        break;
                                    case 19:
                                        i5 = 524288;
                                        break;
                                    case 20:
                                        i5 = 1048576;
                                        break;
                                    case 21:
                                        i5 = 2097152;
                                        break;
                                    case 22:
                                        i5 = 4194304;
                                        break;
                                    case 23:
                                        i5 = 8388608;
                                        break;
                                    default:
                                        i5 = -1;
                                        break;
                                }
                                if (i5 != -1) {
                                    return new com.google.android.gms.internal.ads.zzdp(i4, i5);
                                }
                                java.lang.StringBuilder sb10 = new java.lang.StringBuilder(java.lang.String.valueOf(parseInt9).length() + 19);
                                sb10.append("Unknown AV1 level: ");
                                sb10.append(parseInt9);
                                com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", sb10.toString());
                                return com.google.android.gms.internal.ads.zzdp.zza;
                            } catch (java.lang.NumberFormatException unused5) {
                                java.lang.String.valueOf(str9);
                                com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: ".concat(java.lang.String.valueOf(str9)));
                                break;
                            }
                        } else {
                            java.lang.String.valueOf(str9);
                            com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: ".concat(java.lang.String.valueOf(str9)));
                            break;
                        }
                        break;
                    case '\t':
                        java.lang.String str10 = zzvVar.zzk;
                        if (split.length >= 4) {
                            try {
                                int parseInt11 = java.lang.Integer.parseInt(split[1].substring(4));
                                int parseInt12 = java.lang.Integer.parseInt(split[2].substring(4));
                                int parseInt13 = java.lang.Integer.parseInt(split[3].substring(4));
                                if (parseInt11 != 33) {
                                    if (parseInt11 != 44) {
                                        java.lang.StringBuilder sb11 = new java.lang.StringBuilder(java.lang.String.valueOf(parseInt11).length() + 26);
                                        sb11.append("Unrecognized APV profile: ");
                                        sb11.append(parseInt11);
                                        com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", sb11.toString());
                                        return com.google.android.gms.internal.ads.zzdp.zza;
                                    }
                                    i13 = 8192;
                                }
                                int zzi = zzi(parseInt12, parseInt13);
                                return zzi == -1 ? com.google.android.gms.internal.ads.zzdp.zza : new com.google.android.gms.internal.ads.zzdp(i13, zzi);
                            } catch (java.lang.NumberFormatException e) {
                                java.lang.String.valueOf(str10);
                                com.google.android.gms.internal.ads.zzeg.zzd("CodecSpecificDataUtil", "Ignoring malformed APV codec string: ".concat(java.lang.String.valueOf(str10)), e);
                                break;
                            }
                        } else {
                            java.lang.String.valueOf(str10);
                            com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", "Ignoring malformed APV codec string: ".concat(java.lang.String.valueOf(str10)));
                            break;
                        }
                    case '\n':
                        java.lang.String str11 = zzvVar.zzk;
                        if (split.length == 3) {
                            try {
                                if ("audio/mp4a-latm".equals(com.google.android.gms.internal.ads.zzas.zze(java.lang.Integer.parseInt(split[1], 16)))) {
                                    int parseInt14 = java.lang.Integer.parseInt(split[2]);
                                    if (parseInt14 == 17) {
                                        i12 = 17;
                                    } else if (parseInt14 == 20) {
                                        i12 = 20;
                                    } else if (parseInt14 == 23) {
                                        i12 = 23;
                                    } else if (parseInt14 == 29) {
                                        i12 = 29;
                                    } else if (parseInt14 == 39) {
                                        i12 = 39;
                                    } else if (parseInt14 != 42) {
                                        switch (parseInt14) {
                                            case 1:
                                                i12 = 1;
                                                break;
                                            case 2:
                                                i12 = 2;
                                                break;
                                            case 3:
                                                break;
                                            case 4:
                                                i12 = 4;
                                                break;
                                            case 5:
                                                i12 = 5;
                                                break;
                                            case 6:
                                                i12 = 6;
                                                break;
                                            default:
                                                i12 = -1;
                                                break;
                                        }
                                    } else {
                                        i12 = 42;
                                    }
                                    if (i12 != -1) {
                                        zzdpVar = new com.google.android.gms.internal.ads.zzdp(i12, 0);
                                        return zzdpVar;
                                    }
                                    java.lang.StringBuilder sb12 = new java.lang.StringBuilder(29);
                                    sb12.append("Unrecognized MP4A profile: -1");
                                    com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", sb12.toString());
                                    return com.google.android.gms.internal.ads.zzdp.zza;
                                }
                            } catch (java.lang.NumberFormatException unused6) {
                                java.lang.String.valueOf(str11);
                                com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: ".concat(java.lang.String.valueOf(str11)));
                                break;
                            }
                        } else {
                            java.lang.String.valueOf(str11);
                            com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: ".concat(java.lang.String.valueOf(str11)));
                            break;
                        }
                        break;
                    case 11:
                        java.lang.String str12 = zzvVar.zzk;
                        if (split.length == 4) {
                            try {
                                int parseInt15 = java.lang.Integer.parseInt(split[1]);
                                int parseInt16 = java.lang.Integer.parseInt(split[2]);
                                int parseInt17 = java.lang.Integer.parseInt(split[3]);
                                if (parseInt15 == 0) {
                                    if (parseInt16 == 0) {
                                        i7 = 257;
                                        if (i7 == -1) {
                                        }
                                    }
                                    i7 = -1;
                                    if (i7 == -1) {
                                    }
                                } else if (parseInt15 != 1) {
                                    if (parseInt15 == 2) {
                                        if (parseInt16 == 1) {
                                            i7 = 1026;
                                        } else if (parseInt16 == 2) {
                                            i7 = 1028;
                                        }
                                        if (i7 == -1) {
                                            java.lang.StringBuilder sb13 = new java.lang.StringBuilder(java.lang.String.valueOf(parseInt15).length() + 23 + java.lang.String.valueOf(parseInt16).length());
                                            sb13.append("Unknown AC-4 profile: ");
                                            sb13.append(parseInt15);
                                            sb13.append(".");
                                            sb13.append(parseInt16);
                                            com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", sb13.toString());
                                            return com.google.android.gms.internal.ads.zzdp.zza;
                                        }
                                        if (parseInt17 == 0) {
                                            i10 = 1;
                                        } else if (parseInt17 == 1) {
                                            i10 = 2;
                                        } else if (parseInt17 == 2) {
                                            i10 = 4;
                                        } else if (parseInt17 == 3) {
                                            i10 = 8;
                                        } else if (parseInt17 != 4) {
                                            i10 = -1;
                                        }
                                        if (i10 != -1) {
                                            return new com.google.android.gms.internal.ads.zzdp(i7, i10);
                                        }
                                        java.lang.StringBuilder sb14 = new java.lang.StringBuilder(java.lang.String.valueOf(parseInt17).length() + 20);
                                        sb14.append("Unknown AC-4 level: ");
                                        sb14.append(parseInt17);
                                        com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", sb14.toString());
                                        return com.google.android.gms.internal.ads.zzdp.zza;
                                    }
                                    i7 = -1;
                                    if (i7 == -1) {
                                    }
                                } else {
                                    if (parseInt16 == 0) {
                                        i7 = androidx.core.view.InputDeviceCompat.SOURCE_DPAD;
                                    } else {
                                        if (parseInt16 == 1) {
                                            i7 = 514;
                                        }
                                        i7 = -1;
                                    }
                                    if (i7 == -1) {
                                    }
                                }
                            } catch (java.lang.NumberFormatException unused7) {
                                java.lang.String.valueOf(str12);
                                com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", "Ignoring malformed AC-4 codec string: ".concat(java.lang.String.valueOf(str12)));
                                break;
                            }
                        } else {
                            java.lang.String.valueOf(str12);
                            com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", "Ignoring malformed AC-4 codec string: ".concat(java.lang.String.valueOf(str12)));
                            break;
                        }
                    case '\f':
                        if (split.length >= 4) {
                            try {
                                int parseInt18 = java.lang.Integer.parseInt(split[1]);
                                java.lang.String str13 = split[3];
                                switch (str13.hashCode()) {
                                    case 2464863:
                                        if (str13.equals("Opus")) {
                                            c2 = 0;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 3114792:
                                        if (str13.equals("fLaC")) {
                                            c2 = 2;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 3238865:
                                        if (str13.equals("ipcm")) {
                                            c2 = 3;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 3356560:
                                        if (str13.equals("mp4a")) {
                                            c2 = 1;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    default:
                                        c2 = 65535;
                                        break;
                                }
                                if (c2 == 0) {
                                    if (parseInt18 == 0) {
                                        i8 = android.R.attr.label;
                                    } else if (parseInt18 == 1) {
                                        i8 = android.R.id.checkbox;
                                    } else if (parseInt18 != 2) {
                                        java.lang.StringBuilder sb15 = new java.lang.StringBuilder(java.lang.String.valueOf(parseInt18).length() + 32);
                                        sb15.append("Unrecognized IAMF Opus profile: ");
                                        sb15.append(parseInt18);
                                        com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", sb15.toString());
                                        i8 = -1;
                                    } else {
                                        i8 = android.R.string.copy;
                                    }
                                    if (i8 == -1) {
                                    }
                                } else if (c2 == 1) {
                                    if (parseInt18 == 0) {
                                        i8 = android.R.attr.icon;
                                    } else if (parseInt18 == 1) {
                                        i8 = android.R.id.content;
                                    } else if (parseInt18 != 2) {
                                        java.lang.StringBuilder sb16 = new java.lang.StringBuilder(java.lang.String.valueOf(parseInt18).length() + 31);
                                        sb16.append("Unrecognized IAMF AAC profile: ");
                                        sb16.append(parseInt18);
                                        com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", sb16.toString());
                                        i8 = -1;
                                    } else {
                                        i8 = android.R.string.copyUrl;
                                    }
                                    if (i8 == -1) {
                                    }
                                } else if (c2 != 2) {
                                    if (c2 == 3) {
                                        if (parseInt18 == 0) {
                                            i8 = android.R.attr.writePermission;
                                        } else if (parseInt18 == 1) {
                                            i8 = android.R.id.icon2;
                                        } else if (parseInt18 != 2) {
                                            java.lang.StringBuilder sb17 = new java.lang.StringBuilder(java.lang.String.valueOf(parseInt18).length() + 31);
                                            sb17.append("Unrecognized IAMF PCM profile: ");
                                            sb17.append(parseInt18);
                                            com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", sb17.toString());
                                        } else {
                                            i8 = android.R.string.httpErrorUnsupportedScheme;
                                        }
                                        return i8 == -1 ? com.google.android.gms.internal.ads.zzdp.zza : new com.google.android.gms.internal.ads.zzdp(i8, 0);
                                    }
                                    java.lang.String.valueOf(str13);
                                    com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", "Unrecognized codec identifier for IAMF auxiliary profile: ".concat(java.lang.String.valueOf(str13)));
                                    i8 = -1;
                                    if (i8 == -1) {
                                    }
                                } else {
                                    if (parseInt18 == 0) {
                                        i8 = android.R.attr.manageSpaceActivity;
                                    } else if (parseInt18 == 1) {
                                        i8 = android.R.id.empty;
                                    } else if (parseInt18 != 2) {
                                        java.lang.StringBuilder sb18 = new java.lang.StringBuilder(java.lang.String.valueOf(parseInt18).length() + 32);
                                        sb18.append("Unrecognized IAMF FLAC profile: ");
                                        sb18.append(parseInt18);
                                        com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", sb18.toString());
                                        i8 = -1;
                                    } else {
                                        i8 = android.R.string.defaultVoiceMailAlphaTag;
                                    }
                                    if (i8 == -1) {
                                    }
                                }
                            } catch (java.lang.NumberFormatException e2) {
                                java.lang.String str14 = split[1];
                                java.lang.String.valueOf(str14);
                                com.google.android.gms.internal.ads.zzeg.zzd("CodecSpecificDataUtil", "Ignoring malformed primary profile in IAMF codec string: ".concat(java.lang.String.valueOf(str14)), e2);
                                break;
                            }
                        } else {
                            com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", "Ignoring malformed IAMF codec string: ".concat(str));
                            break;
                        }
                }
            } else if (split.length < 3) {
                com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: ".concat(str));
            } else {
                java.util.regex.Matcher matcher = zzd.matcher(split[1]);
                if (matcher.matches()) {
                    java.lang.String group = matcher.group(1);
                    group.getClass();
                    int hashCode = group.hashCode();
                    if (hashCode != 1567) {
                        switch (hashCode) {
                            case 1536:
                                if (group.equals("00")) {
                                    num2 = 1;
                                    break;
                                }
                                num2 = null;
                                break;
                            case 1537:
                                if (group.equals("01")) {
                                    i9 = 2;
                                    num2 = i9;
                                    break;
                                }
                                num2 = null;
                                break;
                            case 1538:
                                if (group.equals("02")) {
                                    num2 = 4;
                                    break;
                                }
                                num2 = null;
                                break;
                            case 1539:
                                if (group.equals("03")) {
                                    num2 = 8;
                                    break;
                                }
                                num2 = null;
                                break;
                            case 1540:
                                if (group.equals("04")) {
                                    num2 = 16;
                                    break;
                                }
                                num2 = null;
                                break;
                            case 1541:
                                if (group.equals("05")) {
                                    num2 = 32;
                                    break;
                                }
                                num2 = null;
                                break;
                            case 1542:
                                if (group.equals("06")) {
                                    num2 = 64;
                                    break;
                                }
                                num2 = null;
                                break;
                            case 1543:
                                if (group.equals("07")) {
                                    num2 = 128;
                                    break;
                                }
                                num2 = null;
                                break;
                            case 1544:
                                if (group.equals("08")) {
                                    num2 = 256;
                                    break;
                                }
                                num2 = null;
                                break;
                            case 1545:
                                if (group.equals("09")) {
                                    num2 = 512;
                                    break;
                                }
                                num2 = null;
                                break;
                            default:
                                num2 = null;
                                break;
                        }
                    } else {
                        if (group.equals("10")) {
                            i9 = 1024;
                            num2 = i9;
                        }
                        num2 = null;
                    }
                    if (num2 == null) {
                        com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", "Unknown Dolby Vision profile string: ".concat(group));
                        return com.google.android.gms.internal.ads.zzdp.zza;
                    }
                    java.lang.String str15 = split[2];
                    int hashCode2 = str15.hashCode();
                    switch (hashCode2) {
                        case 1537:
                            if (str15.equals("01")) {
                                num3 = 1;
                                break;
                            }
                            num3 = null;
                            break;
                        case 1538:
                            if (str15.equals("02")) {
                                num3 = 2;
                                break;
                            }
                            num3 = null;
                            break;
                        case 1539:
                            if (str15.equals("03")) {
                                num3 = 4;
                                break;
                            }
                            num3 = null;
                            break;
                        case 1540:
                            if (str15.equals("04")) {
                                num3 = 8;
                                break;
                            }
                            num3 = null;
                            break;
                        case 1541:
                            if (str15.equals("05")) {
                                num3 = 16;
                                break;
                            }
                            num3 = null;
                            break;
                        case 1542:
                            if (str15.equals("06")) {
                                num3 = 32;
                                break;
                            }
                            num3 = null;
                            break;
                        case 1543:
                            if (str15.equals("07")) {
                                num3 = 64;
                                break;
                            }
                            num3 = null;
                            break;
                        case 1544:
                            if (str15.equals("08")) {
                                num3 = 128;
                                break;
                            }
                            num3 = null;
                            break;
                        case 1545:
                            if (str15.equals("09")) {
                                num3 = 256;
                                break;
                            }
                            num3 = null;
                            break;
                        default:
                            switch (hashCode2) {
                                case 1567:
                                    if (str15.equals("10")) {
                                        num3 = 512;
                                        break;
                                    }
                                    num3 = null;
                                    break;
                                case 1568:
                                    if (str15.equals("11")) {
                                        num3 = 1024;
                                        break;
                                    }
                                    num3 = null;
                                    break;
                                case 1569:
                                    if (str15.equals("12")) {
                                        num3 = 2048;
                                        break;
                                    }
                                    num3 = null;
                                    break;
                                case 1570:
                                    if (str15.equals("13")) {
                                        num3 = 4096;
                                        break;
                                    }
                                    num3 = null;
                                    break;
                                default:
                                    num3 = null;
                                    break;
                            }
                    }
                    if (num3 != null) {
                        return new com.google.android.gms.internal.ads.zzdp(num2.intValue(), num3.intValue());
                    }
                    java.lang.String.valueOf(str15);
                    com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", "Unknown Dolby Vision level string: ".concat(java.lang.String.valueOf(str15)));
                } else {
                    com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: ".concat(str));
                }
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b7, code lost:
    
        if (r11.equals("L123") != false) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.google.android.gms.internal.ads.zzdp zzg(java.lang.String str, java.lang.String[] strArr, com.google.android.gms.internal.ads.zzi zziVar) {
        int i;
        java.lang.Integer num = null;
        if (strArr.length < 4) {
            java.lang.String.valueOf(str);
            com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: ".concat(java.lang.String.valueOf(str)));
            return null;
        }
        java.util.regex.Matcher matcher = zzd.matcher(strArr[1]);
        if (!matcher.matches()) {
            java.lang.String.valueOf(str);
            com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: ".concat(java.lang.String.valueOf(str)));
            return null;
        }
        java.lang.String group = matcher.group(1);
        char c = 6;
        if ("1".equals(group)) {
            i = 1;
        } else {
            if (!"2".equals(group)) {
                java.lang.String.valueOf(group);
                com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", "Unknown HEVC profile string: ".concat(java.lang.String.valueOf(group)));
                return com.google.android.gms.internal.ads.zzdp.zza;
            }
            i = (zziVar == null || zziVar.zzd != 6) ? 2 : 4096;
        }
        java.lang.String str2 = strArr[3];
        switch (str2.hashCode()) {
            case 70821:
                if (str2.equals("H30")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 70914:
                if (str2.equals("H60")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 70917:
                if (str2.equals("H63")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 71007:
                if (str2.equals("H90")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 71010:
                if (str2.equals("H93")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 74665:
                if (str2.equals("L30")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 74758:
                if (str2.equals("L60")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 74761:
                if (str2.equals("L63")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 74851:
                if (str2.equals("L90")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 74854:
                if (str2.equals("L93")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 2193639:
                if (str2.equals("H120")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 2193642:
                if (str2.equals("H123")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 2193732:
                if (str2.equals("H150")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 2193735:
                if (str2.equals("H153")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 2193738:
                if (str2.equals("H156")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 2193825:
                if (str2.equals("H180")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 2193828:
                if (str2.equals("H183")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 2193831:
                if (str2.equals("H186")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 2312803:
                if (str2.equals("L120")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 2312806:
                break;
            case 2312896:
                if (str2.equals("L150")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 2312899:
                if (str2.equals("L153")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 2312902:
                if (str2.equals("L156")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2312989:
                if (str2.equals("L180")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 2312992:
                if (str2.equals("L183")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2312995:
                if (str2.equals("L186")) {
                    c = '\f';
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
                num = 1;
                break;
            case 1:
                num = 4;
                break;
            case 2:
                num = 16;
                break;
            case 3:
                num = 64;
                break;
            case 4:
                num = 256;
                break;
            case 5:
                num = 1024;
                break;
            case 6:
                num = 4096;
                break;
            case 7:
                num = 16384;
                break;
            case '\b':
                num = 65536;
                break;
            case '\t':
                num = 262144;
                break;
            case '\n':
                num = 1048576;
                break;
            case 11:
                num = 4194304;
                break;
            case '\f':
                num = 16777216;
                break;
            case '\r':
                num = 2;
                break;
            case 14:
                num = 8;
                break;
            case 15:
                num = 32;
                break;
            case 16:
                num = 128;
                break;
            case 17:
                num = 512;
                break;
            case 18:
                num = 2048;
                break;
            case 19:
                num = 8192;
                break;
            case 20:
                num = 32768;
                break;
            case 21:
                num = 131072;
                break;
            case 22:
                num = 524288;
                break;
            case 23:
                num = 2097152;
                break;
            case 24:
                num = 8388608;
                break;
            case 25:
                num = 33554432;
                break;
        }
        if (num != null) {
            return new com.google.android.gms.internal.ads.zzdp(i, num.intValue());
        }
        java.lang.String.valueOf(str2);
        com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", "Unknown HEVC level string: ".concat(java.lang.String.valueOf(str2)));
        return com.google.android.gms.internal.ads.zzdp.zza;
    }

    public static byte[] zzh(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2 + 4];
        java.lang.System.arraycopy(zzb, 0, bArr2, 0, 4);
        java.lang.System.arraycopy(bArr, i, bArr2, 4, i2);
        return bArr2;
    }

    private static int zzi(int i, int i2) {
        switch (i) {
            case 30:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 23);
                                sb.append("Unrecognized APV band: ");
                                sb.append(i2);
                                com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", sb.toString());
                                break;
                            }
                        }
                    }
                }
                break;
            case 33:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 23);
                                sb2.append("Unrecognized APV band: ");
                                sb2.append(i2);
                                com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", sb2.toString());
                                break;
                            }
                        }
                    }
                }
                break;
            case 60:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 23);
                                sb3.append("Unrecognized APV band: ");
                                sb3.append(i2);
                                com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", sb3.toString());
                                break;
                            }
                        }
                    }
                }
                break;
            case 63:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                java.lang.StringBuilder sb4 = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 23);
                                sb4.append("Unrecognized APV band: ");
                                sb4.append(i2);
                                com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", sb4.toString());
                                break;
                            }
                        }
                    }
                }
                break;
            case 90:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                java.lang.StringBuilder sb5 = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 23);
                                sb5.append("Unrecognized APV band: ");
                                sb5.append(i2);
                                com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", sb5.toString());
                                break;
                            }
                        }
                    }
                }
                break;
            case 93:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 23);
                                sb6.append("Unrecognized APV band: ");
                                sb6.append(i2);
                                com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", sb6.toString());
                                break;
                            }
                        }
                    }
                }
                break;
            case 120:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                java.lang.StringBuilder sb7 = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 23);
                                sb7.append("Unrecognized APV band: ");
                                sb7.append(i2);
                                com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", sb7.toString());
                                break;
                            }
                        }
                    }
                }
                break;
            case 123:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                java.lang.StringBuilder sb8 = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 23);
                                sb8.append("Unrecognized APV band: ");
                                sb8.append(i2);
                                com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", sb8.toString());
                                break;
                            }
                        }
                    }
                }
                break;
            case androidx.compose.material.TextFieldImplKt.AnimationDuration /* 150 */:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                java.lang.StringBuilder sb9 = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 23);
                                sb9.append("Unrecognized APV band: ");
                                sb9.append(i2);
                                com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", sb9.toString());
                                break;
                            }
                        }
                    }
                }
                break;
            case 153:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                java.lang.StringBuilder sb10 = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 23);
                                sb10.append("Unrecognized APV band: ");
                                sb10.append(i2);
                                com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", sb10.toString());
                                break;
                            }
                        }
                    }
                }
                break;
            case 180:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                java.lang.StringBuilder sb11 = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 23);
                                sb11.append("Unrecognized APV band: ");
                                sb11.append(i2);
                                com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", sb11.toString());
                                break;
                            }
                        }
                    }
                }
                break;
            case 183:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                java.lang.StringBuilder sb12 = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 23);
                                sb12.append("Unrecognized APV band: ");
                                sb12.append(i2);
                                com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", sb12.toString());
                                break;
                            }
                        }
                    }
                }
                break;
            case AD_NOT_LOADED_VALUE:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                java.lang.StringBuilder sb13 = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 23);
                                sb13.append("Unrecognized APV band: ");
                                sb13.append(i2);
                                com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", sb13.toString());
                                break;
                            }
                        }
                    }
                }
                break;
            case INVALID_ADUNIT_BID_PAYLOAD_VALUE:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                java.lang.StringBuilder sb14 = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 23);
                                sb14.append("Unrecognized APV band: ");
                                sb14.append(i2);
                                com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", sb14.toString());
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                java.lang.StringBuilder sb15 = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 30);
                sb15.append("Unrecognized APV level index: ");
                sb15.append(i);
                com.google.android.gms.internal.ads.zzeg.zzc("CodecSpecificDataUtil", sb15.toString());
                break;
        }
        return -1;
    }
}
