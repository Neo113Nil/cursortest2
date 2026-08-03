package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzvm {
    public final java.lang.String zza;
    public final java.lang.String zzb;
    public final java.lang.String zzc;
    public final android.media.MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    private final boolean zzi;
    private int zzj;
    private int zzk;
    private float zzl;

    public static com.google.android.gms.internal.ads.zzvm zza(java.lang.String str, java.lang.String str2, java.lang.String str3, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new com.google.android.gms.internal.ads.zzvm(str, str2, str3, codecCapabilities, z, z2, z3, codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback"), codecCapabilities != null && codecCapabilities.isFeatureSupported("tunneled-playback"), z5 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback")), (android.os.Build.VERSION.SDK_INT < 35 || codecCapabilities == null || !codecCapabilities.isFeatureSupported("detached-surface") || android.os.Build.MANUFACTURER.equals("Xiaomi") || android.os.Build.MANUFACTURER.equals("OPPO") || android.os.Build.MANUFACTURER.equals("realme") || android.os.Build.MANUFACTURER.equals("motorola") || android.os.Build.MANUFACTURER.equals("LENOVO")) ? false : true);
    }

    private final boolean zzj(com.google.android.gms.internal.ads.zzv zzvVar) {
        java.lang.String str = this.zzb;
        return str.equals(zzvVar.zzp) || str.equals(com.google.android.gms.internal.ads.zzwf.zzg(zzvVar));
    }

    private final boolean zzk(android.content.Context context, com.google.android.gms.internal.ads.zzv zzvVar, boolean z) {
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities;
        android.media.MediaCodecInfo.AudioCapabilities audioCapabilities;
        com.google.android.gms.internal.ads.zzdp zzf = com.google.android.gms.internal.ads.zzdq.zzf(zzvVar);
        java.lang.String str = zzvVar.zzp;
        char c = 65535;
        if (str != null && str.equals("video/mv-hevc")) {
            java.lang.String zzh = com.google.android.gms.internal.ads.zzas.zzh(this.zzc);
            if (zzh.equals("video/mv-hevc")) {
                return true;
            }
            if (zzh.equals("video/hevc")) {
                int i = com.google.android.gms.internal.ads.zzwf.zza;
                java.lang.String zzk = com.google.android.gms.internal.ads.zzgp.zzk(zzvVar.zzs);
                if (zzk == null) {
                    zzf = null;
                } else {
                    java.lang.String trim = zzk.trim();
                    java.lang.String str2 = com.google.android.gms.internal.ads.zzfl.zza;
                    zzf = com.google.android.gms.internal.ads.zzdq.zzg(zzk, trim.split("\\.", -1), zzvVar.zzF);
                }
            }
        }
        if (zzf == null) {
            return true;
        }
        if (!zzf.zzc()) {
            return false;
        }
        int zza = zzf.zza();
        int zzb = zzf.zzb();
        if ("video/dolby-vision".equals(str)) {
            java.lang.String str3 = this.zzb;
            int hashCode = str3.hashCode();
            if (hashCode != -1662735862) {
                if (hashCode != -1662541442) {
                    if (hashCode == 1331836730 && str3.equals("video/avc")) {
                        c = 0;
                    }
                } else if (str3.equals("video/hevc")) {
                    c = 1;
                }
            } else if (str3.equals("video/av01")) {
                c = 2;
            }
            if (c == 0) {
                zzb = 0;
                zza = 8;
            } else if (c == 1 || c == 2) {
                zzb = 0;
                zza = 2;
            }
        }
        if (!this.zzi && !this.zzb.equals("audio/ac4") && zza != 42) {
            return true;
        }
        android.media.MediaCodecInfo.CodecProfileLevel[] zzb2 = zzb();
        java.lang.String str4 = this.zzb;
        if (str4.equals("audio/ac4") && zzb2.length == 0) {
            android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            int i2 = (codecCapabilities == null || (audioCapabilities = codecCapabilities.getAudioCapabilities()) == null || audioCapabilities.getMaxInputChannelCount() <= 18) ? 8 : 16;
            zzb2 = com.google.android.gms.internal.ads.zzfl.zzQ(context) ? new android.media.MediaCodecInfo.CodecProfileLevel[]{com.google.android.gms.internal.ads.zzwf.zzf(1026, i2)} : new android.media.MediaCodecInfo.CodecProfileLevel[]{com.google.android.gms.internal.ads.zzwf.zzf(257, i2), com.google.android.gms.internal.ads.zzwf.zzf(androidx.core.view.InputDeviceCompat.SOURCE_DPAD, i2), com.google.android.gms.internal.ads.zzwf.zzf(514, i2), com.google.android.gms.internal.ads.zzwf.zzf(1026, i2), com.google.android.gms.internal.ads.zzwf.zzf(1028, i2)};
        }
        if (android.os.Build.VERSION.SDK_INT == 23 && "video/x-vnd.on2.vp9".equals(str4) && zzb2.length == 0) {
            android.media.MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
            int intValue = (codecCapabilities2 == null || (videoCapabilities = codecCapabilities2.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
            zzb2 = new android.media.MediaCodecInfo.CodecProfileLevel[]{com.google.android.gms.internal.ads.zzwf.zzf(1, intValue >= 180000000 ? 1024 : intValue >= 120000000 ? 512 : intValue >= 60000000 ? 256 : intValue >= 30000000 ? 128 : intValue >= 18000000 ? 64 : intValue >= 12000000 ? 32 : intValue >= 7200000 ? 16 : intValue >= 3600000 ? 8 : intValue >= 1800000 ? 4 : intValue >= 800000 ? 2 : 1)};
        }
        for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzb2) {
            if (codecProfileLevel.profile == zza && ((codecProfileLevel.level >= zzb || !z) && (!"video/hevc".equals(str4) || zza != 2 || (!"sailfish".equals(android.os.Build.DEVICE) && !"marlin".equals(android.os.Build.DEVICE))))) {
                return true;
            }
        }
        java.lang.String str5 = zzvVar.zzk;
        java.lang.String str6 = this.zzc;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str5).length() + 22 + str6.length());
        sb.append("codec.profileLevel, ");
        sb.append(str5);
        sb.append(", ");
        sb.append(str6);
        zzm(sb.toString());
        return false;
    }

    private final boolean zzl(com.google.android.gms.internal.ads.zzv zzvVar) {
        return (java.util.Objects.equals(zzvVar.zzp, "audio/flac") && zzvVar.zzJ == 22 && android.os.Build.VERSION.SDK_INT < 34 && this.zza.equals("c2.android.flac.decoder")) ? false : true;
    }

    private final void zzm(java.lang.String str) {
        java.lang.String str2 = com.google.android.gms.internal.ads.zzfl.zza;
        java.lang.String str3 = this.zzb;
        int length = java.lang.String.valueOf(str3).length();
        int length2 = java.lang.String.valueOf(str2).length();
        int length3 = str.length();
        java.lang.String str4 = this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length3 + 14 + str4.length() + 2 + length + 3 + length2 + 1);
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str4);
        sb.append(", ");
        sb.append(str3);
        sb.append("] [");
        sb.append(str2);
        sb.append(com.ironsource.X3.j.e);
        com.google.android.gms.internal.ads.zzeg.zza("MediaCodecInfo", sb.toString());
    }

    private static boolean zzn(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        android.util.Range<java.lang.Double> achievableFrameRatesFor;
        android.graphics.Point zzo = zzo(videoCapabilities, i, i2);
        int i3 = zzo.x;
        int i4 = zzo.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        double floor = java.lang.Math.floor(d);
        if (videoCapabilities.areSizeAndRateSupported(i3, i4, floor)) {
            return android.os.Build.VERSION.SDK_INT < 24 || (achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4)) == null || floor <= achievableFrameRatesFor.getUpper().doubleValue();
        }
        return false;
    }

    private static android.graphics.Point zzo(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        return new android.graphics.Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final java.lang.String toString() {
        return this.zza;
    }

    public final android.media.MediaCodecInfo.CodecProfileLevel[] zzb() {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || codecCapabilities.profileLevels == null) ? new android.media.MediaCodecInfo.CodecProfileLevel[0] : codecCapabilities.profileLevels;
    }

    public final boolean zzc(android.content.Context context, com.google.android.gms.internal.ads.zzv zzvVar) {
        int i;
        if (!zzj(zzvVar) || !zzk(context, zzvVar, true) || !zzl(zzvVar)) {
            return false;
        }
        if (this.zzi) {
            int i2 = zzvVar.zzw;
            if (i2 <= 0 || (i = zzvVar.zzx) <= 0) {
                return true;
            }
            return zzg(i2, i, zzvVar.zzA);
        }
        int i3 = zzvVar.zzI;
        if (i3 != -1) {
            android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            if (codecCapabilities == null) {
                zzm("sampleRate.caps");
                return false;
            }
            android.media.MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                zzm("sampleRate.aCaps");
                return false;
            }
            if (!audioCapabilities.isSampleRateSupported(i3)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i3).length() + 20);
                sb.append("sampleRate.support, ");
                sb.append(i3);
                zzm(sb.toString());
                return false;
            }
        }
        int i4 = zzvVar.zzH;
        if (i4 == -1) {
            return true;
        }
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
        if (codecCapabilities2 == null) {
            zzm("channelCount.caps");
            return false;
        }
        android.media.MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
        if (audioCapabilities2 == null) {
            zzm("channelCount.aCaps");
            return false;
        }
        java.lang.String str = this.zza;
        java.lang.String str2 = this.zzb;
        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
        if (maxInputChannelCount <= 1 && ((android.os.Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
            int i5 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(str.length() + 32 + java.lang.String.valueOf(maxInputChannelCount).length() + 4 + java.lang.String.valueOf(i5).length() + 1);
            sb2.append("AssumedMaxChannelAdjustment: ");
            sb2.append(str);
            sb2.append(", [");
            sb2.append(maxInputChannelCount);
            sb2.append(" to ");
            sb2.append(i5);
            sb2.append(com.ironsource.X3.j.e);
            com.google.android.gms.internal.ads.zzeg.zzc("MediaCodecInfo", sb2.toString());
            maxInputChannelCount = i5;
        }
        if (maxInputChannelCount >= i4) {
            return true;
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(i4).length() + 22);
        sb3.append("channelCount.support, ");
        sb3.append(i4);
        zzm(sb3.toString());
        return false;
    }

    public final boolean zzd(android.content.Context context, com.google.android.gms.internal.ads.zzv zzvVar) {
        return zzj(zzvVar) && zzk(context, zzvVar, false) && zzl(zzvVar);
    }

    public final boolean zze(com.google.android.gms.internal.ads.zzv zzvVar) {
        if (this.zzi) {
            return this.zze;
        }
        com.google.android.gms.internal.ads.zzdp zzf = com.google.android.gms.internal.ads.zzdq.zzf(zzvVar);
        return zzf != null && zzf.zzc() && zzf.zza() == 42;
    }

    public final com.google.android.gms.internal.ads.zzjc zzf(com.google.android.gms.internal.ads.zzv zzvVar, com.google.android.gms.internal.ads.zzv zzvVar2) {
        int i;
        java.lang.String str = zzvVar.zzp;
        java.lang.String str2 = zzvVar2.zzp;
        int i2 = true != java.util.Objects.equals(str, str2) ? 8 : 0;
        if (this.zzi) {
            if (zzvVar.zzB != zzvVar2.zzB) {
                i2 |= 1024;
            }
            boolean z = (zzvVar.zzw == zzvVar2.zzw && zzvVar.zzx == zzvVar2.zzx) ? false : true;
            if (!this.zze && z) {
                i2 |= 512;
            }
            com.google.android.gms.internal.ads.zzi zziVar = zzvVar.zzF;
            if ((!com.google.android.gms.internal.ads.zzi.zza(zziVar) || !com.google.android.gms.internal.ads.zzi.zza(zzvVar2.zzF)) && !java.util.Objects.equals(zziVar, zzvVar2.zzF)) {
                i2 |= 2048;
            }
            java.lang.String str3 = this.zza;
            if (android.os.Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str3) && !zzvVar.zzd(zzvVar2)) {
                i2 |= 2;
            }
            int i3 = zzvVar.zzy;
            if (i3 != -1 && (i = zzvVar.zzz) != -1 && i3 == zzvVar2.zzy && i == zzvVar2.zzz && z) {
                i2 |= 2;
            }
            if (i2 == 0 && java.util.Objects.equals(str2, "video/dolby-vision")) {
                android.util.Pair zze = com.google.android.gms.internal.ads.zzdq.zze(zzvVar);
                android.util.Pair zze2 = com.google.android.gms.internal.ads.zzdq.zze(zzvVar2);
                if (zze == null || zze2 == null || !((java.lang.Integer) zze.first).equals(zze2.first)) {
                    i2 = 2;
                }
            }
            if (i2 == 0) {
                return new com.google.android.gms.internal.ads.zzjc(str3, zzvVar, zzvVar2, true == zzvVar.zzd(zzvVar2) ? 3 : 2, 0);
            }
        } else {
            if (zzvVar.zzH != zzvVar2.zzH) {
                i2 |= 4096;
            }
            if (zzvVar.zzI != zzvVar2.zzI) {
                i2 |= 8192;
            }
            if (zzvVar.zzJ != zzvVar2.zzJ) {
                i2 |= 16384;
            }
            if (i2 == 0) {
                java.lang.String str4 = this.zzb;
                if (str4.equals("audio/mp4a-latm") || str4.equals("audio/ac4")) {
                    android.util.Pair zze3 = com.google.android.gms.internal.ads.zzdq.zze(zzvVar);
                    android.util.Pair zze4 = com.google.android.gms.internal.ads.zzdq.zze(zzvVar2);
                    if (zze3 != null && zze4 != null) {
                        int intValue = ((java.lang.Integer) zze3.first).intValue();
                        int intValue2 = ((java.lang.Integer) zze4.first).intValue();
                        if (intValue == 42 && intValue2 == 42) {
                            return new com.google.android.gms.internal.ads.zzjc(this.zza, zzvVar, zzvVar2, 3, 0);
                        }
                        if (str4.equals("audio/ac4") && zze3.equals(zze4)) {
                            return new com.google.android.gms.internal.ads.zzjc(this.zza, zzvVar, zzvVar2, 3, 0);
                        }
                    }
                }
            }
            if (i2 == 0) {
                java.lang.String str5 = this.zzb;
                if (str5.equals("audio/eac3-joc") || str5.equals("audio/eac3")) {
                    return new com.google.android.gms.internal.ads.zzjc(this.zza, zzvVar, zzvVar2, 3, 0);
                }
            }
            if (!zzvVar.zzd(zzvVar2)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new com.google.android.gms.internal.ads.zzjc(this.zza, zzvVar, zzvVar2, 1, 0);
            }
        }
        return new com.google.android.gms.internal.ads.zzjc(this.zza, zzvVar, zzvVar2, 0, i2);
    }

    public final boolean zzg(int i, int i2, double d) {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            zzm("sizeAndRate.caps");
            return false;
        }
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzm("sizeAndRate.vCaps");
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            int zza = com.google.android.gms.internal.ads.zzvo.zza(videoCapabilities, i, i2, d);
            if (zza != 2) {
                if (zza == 1) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 20 + java.lang.String.valueOf(i2).length() + 1 + java.lang.String.valueOf(d).length());
                    sb.append("sizeAndRate.cover, ");
                    sb.append(i);
                    sb.append("x");
                    sb.append(i2);
                    sb.append("@");
                    sb.append(d);
                    zzm(sb.toString());
                    return false;
                }
            }
            return true;
        }
        if (!zzn(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                java.lang.String str = this.zza;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(android.os.Build.DEVICE)) && zzn(videoCapabilities, i2, i, d)) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 22 + java.lang.String.valueOf(i2).length() + 1 + java.lang.String.valueOf(d).length());
                    sb2.append("sizeAndRate.rotated, ");
                    sb2.append(i);
                    sb2.append("x");
                    sb2.append(i2);
                    sb2.append("@");
                    sb2.append(d);
                    java.lang.String sb3 = sb2.toString();
                    java.lang.String str2 = this.zzb;
                    int length = str.length();
                    java.lang.String str3 = com.google.android.gms.internal.ads.zzfl.zza;
                    int length2 = java.lang.String.valueOf(str2).length();
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder(sb3.length() + 19 + length + 2 + length2 + 3 + java.lang.String.valueOf(str3).length() + 1);
                    sb4.append("AssumedSupport [");
                    sb4.append(sb3);
                    sb4.append("] [");
                    sb4.append(str);
                    sb4.append(", ");
                    sb4.append(str2);
                    sb4.append("] [");
                    sb4.append(str3);
                    sb4.append(com.ironsource.X3.j.e);
                    com.google.android.gms.internal.ads.zzeg.zza("MediaCodecInfo", sb4.toString());
                }
            }
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 22 + java.lang.String.valueOf(i2).length() + 1 + java.lang.String.valueOf(d).length());
            sb5.append("sizeAndRate.support, ");
            sb5.append(i);
            sb5.append("x");
            sb5.append(i2);
            sb5.append("@");
            sb5.append(d);
            zzm(sb5.toString());
            return false;
        }
        return true;
    }

    public final float zzh(int i, int i2) {
        if (!this.zzi) {
            return -3.4028235E38f;
        }
        float f = this.zzl;
        if (f != -3.4028235E38f && this.zzj == i && this.zzk == i2) {
            return f;
        }
        float f2 = 1024.0f;
        if (!zzg(i, i2, 1024.0d)) {
            float f3 = 0.0f;
            while (true) {
                float f4 = f2 - f3;
                if (java.lang.Math.abs(f4) <= 5.0f) {
                    break;
                }
                float f5 = (f4 / 2.0f) + f3;
                boolean zzg = zzg(i, i2, f5);
                if (true == zzg) {
                    f3 = f5;
                }
                if (true != zzg) {
                    f2 = f5;
                }
            }
            f2 = f3;
        }
        this.zzl = f2;
        this.zzj = i;
        this.zzk = i2;
        return f2;
    }

    public final android.graphics.Point zzi(int i, int i2) {
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities;
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzo(videoCapabilities, i, i2);
    }

    zzvm(java.lang.String str, java.lang.String str2, java.lang.String str3, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z;
        this.zze = z4;
        this.zzf = z6;
        this.zzh = z7;
        this.zzi = com.google.android.gms.internal.ads.zzas.zzb(str2);
        this.zzl = -3.4028235E38f;
        this.zzj = -1;
        this.zzk = -1;
    }
}
