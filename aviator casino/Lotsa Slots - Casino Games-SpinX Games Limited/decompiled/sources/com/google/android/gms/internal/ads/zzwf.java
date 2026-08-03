package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzwf {
    public static final /* synthetic */ int zza = 0;
    private static final java.util.HashMap zzb = new java.util.HashMap();

    public static com.google.android.gms.internal.ads.zzvm zza() throws com.google.android.gms.internal.ads.zzvx {
        java.util.List zzb2 = zzb("audio/raw", false, false);
        if (zzb2.isEmpty()) {
            return null;
        }
        return (com.google.android.gms.internal.ads.zzvm) zzb2.get(0);
    }

    public static synchronized java.util.List zzb(java.lang.String str, boolean z, boolean z2) throws com.google.android.gms.internal.ads.zzvx {
        synchronized (com.google.android.gms.internal.ads.zzwf.class) {
            com.google.android.gms.internal.ads.zzvw zzvwVar = new com.google.android.gms.internal.ads.zzvw(str, z, z2);
            java.util.HashMap hashMap = zzb;
            java.util.List list = (java.util.List) hashMap.get(zzvwVar);
            if (list != null) {
                return list;
            }
            java.util.ArrayList zzh = zzh(zzvwVar, new com.google.android.gms.internal.ads.zzwa(z, z2, str.equals("video/mv-hevc")));
            if (z && zzh.isEmpty() && android.os.Build.VERSION.SDK_INT == 23) {
                zzh = zzh(zzvwVar, new com.google.android.gms.internal.ads.zzvz(null));
                if (!zzh.isEmpty()) {
                    java.lang.String str2 = ((com.google.android.gms.internal.ads.zzvm) zzh.get(0)).zza;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 63 + str2.length());
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(str2);
                    com.google.android.gms.internal.ads.zzeg.zzc("MediaCodecUtil", sb.toString());
                }
            }
            if ("audio/raw".equals(str)) {
                if (android.os.Build.VERSION.SDK_INT < 26 && android.os.Build.DEVICE.equals("R9") && zzh.size() == 1 && ((com.google.android.gms.internal.ads.zzvm) zzh.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    zzh.add(com.google.android.gms.internal.ads.zzvm.zza("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                zzj(zzh, com.google.android.gms.internal.ads.zzwb.zza);
            }
            if (android.os.Build.VERSION.SDK_INT < 32 && zzh.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((com.google.android.gms.internal.ads.zzvm) zzh.get(0)).zza)) {
                zzh.add((com.google.android.gms.internal.ads.zzvm) zzh.remove(0));
            }
            com.google.android.gms.internal.ads.zzgwm zzq = com.google.android.gms.internal.ads.zzgwm.zzq(zzh);
            hashMap.put(zzvwVar, zzq);
            return zzq;
        }
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#2.sampleMimeType"})
    public static java.util.List zzc(com.google.android.gms.internal.ads.zzvv zzvvVar, com.google.android.gms.internal.ads.zzv zzvVar, boolean z, boolean z2) throws com.google.android.gms.internal.ads.zzvx {
        java.util.List zza2 = zzvvVar.zza(zzvVar.zzp, z, z2);
        java.util.List zzd = zzd(zzvvVar, zzvVar, z, z2);
        int i = com.google.android.gms.internal.ads.zzgwm.zzd;
        com.google.android.gms.internal.ads.zzgwj zzgwjVar = new com.google.android.gms.internal.ads.zzgwj();
        zzgwjVar.zzh(zza2);
        zzgwjVar.zzh(zzd);
        return zzgwjVar.zzi();
    }

    public static java.util.List zzd(com.google.android.gms.internal.ads.zzvv zzvvVar, com.google.android.gms.internal.ads.zzv zzvVar, boolean z, boolean z2) throws com.google.android.gms.internal.ads.zzvx {
        java.lang.String zzg = zzg(zzvVar);
        return zzg == null ? com.google.android.gms.internal.ads.zzgwm.zzi() : zzvvVar.zza(zzg, z, z2);
    }

    public static java.util.List zze(final android.content.Context context, java.util.List list, final com.google.android.gms.internal.ads.zzv zzvVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        zzj(arrayList, new com.google.android.gms.internal.ads.zzwe() { // from class: com.google.android.gms.internal.ads.zzwd
            @Override // com.google.android.gms.internal.ads.zzwe
            public final /* synthetic */ int zza(java.lang.Object obj) {
                int i = com.google.android.gms.internal.ads.zzwf.zza;
                return ((com.google.android.gms.internal.ads.zzvm) obj).zzd(context, zzvVar) ? 1 : 0;
            }
        });
        return arrayList;
    }

    public static android.media.MediaCodecInfo.CodecProfileLevel zzf(int i, int i2) {
        android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel = new android.media.MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i2;
        return codecProfileLevel;
    }

    public static java.lang.String zzg(com.google.android.gms.internal.ads.zzv zzvVar) {
        com.google.android.gms.internal.ads.zzdp zzf;
        java.lang.String str = zzvVar.zzp;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str) && (zzf = com.google.android.gms.internal.ads.zzdq.zzf(zzvVar)) != null && zzf.zzc()) {
            int zza2 = zzf.zza();
            if (zza2 == 16 || zza2 == 256) {
                return "video/hevc";
            }
            if (zza2 == 512) {
                return "video/avc";
            }
            if (zza2 == 1024) {
                com.google.android.gms.internal.ads.zzi zziVar = zzvVar.zzF;
                if (zziVar != null && zziVar.zzd == 6 && zziVar.zzc == 1) {
                    return null;
                }
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0104, code lost:
    
        r7 = r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0291 A[Catch: Exception -> 0x0306, TRY_ENTER, TryCatch #3 {Exception -> 0x0306, blocks: (B:3:0x0012, B:5:0x0026, B:7:0x0030, B:12:0x0043, B:16:0x0051, B:18:0x0057, B:20:0x0061, B:22:0x0069, B:24:0x0071, B:26:0x007b, B:28:0x0085, B:30:0x008f, B:32:0x0099, B:34:0x00a3, B:36:0x00ad, B:38:0x00b7, B:40:0x00c1, B:45:0x00cb, B:47:0x00d1, B:49:0x00d9, B:52:0x00f0, B:54:0x00fa, B:97:0x028b, B:100:0x0291, B:102:0x0297, B:104:0x02b8, B:105:0x02e7, B:56:0x0107, B:142:0x010c, B:144:0x0114, B:147:0x011f, B:149:0x0127, B:153:0x0132, B:155:0x013a, B:157:0x0142, B:161:0x0150, B:163:0x0158, B:166:0x0163, B:168:0x016b, B:171:0x0176, B:173:0x017e), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b8 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01c8 A[Catch: Exception -> 0x0279, TryCatch #1 {Exception -> 0x0279, blocks: (B:65:0x019c, B:69:0x01aa, B:75:0x01bd, B:77:0x01c3, B:78:0x01d1, B:126:0x01c8), top: B:64:0x019c }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c3 A[Catch: Exception -> 0x0279, TryCatch #1 {Exception -> 0x0279, blocks: (B:65:0x019c, B:69:0x01aa, B:75:0x01bd, B:77:0x01c3, B:78:0x01d1, B:126:0x01c8), top: B:64:0x019c }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e2 A[Catch: Exception -> 0x0277, TryCatch #2 {Exception -> 0x0277, blocks: (B:122:0x01dd, B:81:0x01e2, B:83:0x01f2, B:85:0x01fa), top: B:121:0x01dd }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.util.ArrayList zzh(com.google.android.gms.internal.ads.zzvw zzvwVar, com.google.android.gms.internal.ads.zzvy zzvyVar) throws com.google.android.gms.internal.ads.zzvx {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        int i;
        int i2;
        java.lang.String str6;
        int i3;
        android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean zzd;
        boolean zze;
        boolean z;
        boolean isHardwareAccelerated;
        boolean zzi;
        boolean isVendor;
        java.lang.String str7;
        com.google.android.gms.internal.ads.zzvw zzvwVar2 = zzvwVar;
        com.google.android.gms.internal.ads.zzvy zzvyVar2 = zzvyVar;
        java.lang.String str8 = "secure-playback";
        java.lang.String str9 = "tunneled-playback";
        java.lang.String str10 = ")";
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String str11 = zzvwVar2.zza;
            int zza2 = zzvyVar.zza();
            boolean zzc = zzvyVar.zzc();
            int i4 = 0;
            while (i4 < zza2) {
                android.media.MediaCodecInfo zzb2 = zzvyVar2.zzb(i4);
                if (android.os.Build.VERSION.SDK_INT < 29 || !zzb2.isAlias()) {
                    java.lang.String name = zzb2.getName();
                    if (!zzb2.isEncoder() && (zzc || !name.endsWith(".secure"))) {
                        int i5 = i4;
                        java.lang.String str12 = str10;
                        if ((android.os.Build.VERSION.SDK_INT < 24 && (("OMX.SEC.aac.dec".equals(name) || "OMX.Exynos.AAC.Decoder".equals(name)) && com.adjust.sdk.Constants.REFERRER_API_SAMSUNG.equals(android.os.Build.MANUFACTURER) && (android.os.Build.DEVICE.startsWith("zeroflte") || android.os.Build.DEVICE.startsWith("zerolte") || android.os.Build.DEVICE.startsWith("zenlte") || "SC-05G".equals(android.os.Build.DEVICE) || "marinelteatt".equals(android.os.Build.DEVICE) || "404SC".equals(android.os.Build.DEVICE) || "SC-04G".equals(android.os.Build.DEVICE) || "SCV31".equals(android.os.Build.DEVICE)))) || (android.os.Build.VERSION.SDK_INT == 23 && "audio/eac3-joc".equals(str11) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(name))) {
                            str3 = str8;
                            str4 = str9;
                            i2 = zza2;
                            str5 = str11;
                            i = i5;
                            str7 = str12;
                            i4 = i + 1;
                            zzvyVar2 = zzvyVar;
                            str10 = str7;
                            str9 = str4;
                            str8 = str3;
                            zza2 = i2;
                            str11 = str5;
                            zzvwVar2 = zzvwVar;
                        }
                        java.lang.String[] supportedTypes = zzb2.getSupportedTypes();
                        int length = supportedTypes.length;
                        int i6 = zza2;
                        int i7 = 0;
                        while (true) {
                            if (i7 < length) {
                                int i8 = length;
                                str = supportedTypes[i7];
                                if (str.equalsIgnoreCase(str11)) {
                                    break;
                                }
                                i7++;
                                length = i8;
                            } else if (str11.equals("video/dolby-vision")) {
                                if ("OMX.MS.HEVCDV.Decoder".equals(name)) {
                                    str = "video/hevcdv";
                                } else {
                                    if ("OMX.RTK.video.decoder".equals(name) || "OMX.realtek.video.decoder.tunneled".equals(name)) {
                                        str = "video/dv_hevc";
                                    }
                                    str2 = null;
                                }
                            } else if (str11.equals("video/mv-hevc")) {
                                if (!"c2.qti.mvhevc.decoder".equals(name)) {
                                    if ("c2.qti.mvhevc.decoder.secure".equals(name)) {
                                    }
                                    str2 = null;
                                }
                                str = "video/x-mvhevc";
                            } else if (str11.equals("audio/alac") && "OMX.lge.alac.decoder".equals(name)) {
                                str = "audio/x-lg-alac";
                            } else if (str11.equals("audio/flac") && "OMX.lge.flac.decoder".equals(name)) {
                                str = "audio/x-lg-flac";
                            } else {
                                if (str11.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(name)) {
                                    str = "audio/lg-ac3";
                                }
                                str2 = null;
                            }
                        }
                        if (str2 != null) {
                            try {
                                capabilitiesForType = zzb2.getCapabilitiesForType(str2);
                                zzd = zzvyVar2.zzd(str9, str2, capabilitiesForType);
                                zze = zzvyVar2.zze(str9, str2, capabilitiesForType);
                                str4 = str9;
                                try {
                                } catch (java.lang.Exception e) {
                                    e = e;
                                    str3 = str8;
                                }
                            } catch (java.lang.Exception e2) {
                                e = e2;
                                str3 = str8;
                                str4 = str9;
                            }
                            if (zzvwVar2.zzc) {
                                if (!zzd) {
                                    str3 = str8;
                                }
                                boolean zzd2 = zzvyVar2.zzd(str8, str2, capabilitiesForType);
                                boolean zze2 = zzvyVar2.zze(str8, str2, capabilitiesForType);
                                z = zzvwVar2.zzb;
                                if (!z) {
                                }
                                if (z) {
                                }
                                if (android.os.Build.VERSION.SDK_INT < 29) {
                                }
                                zzi = zzi(zzb2, str11);
                                str3 = str8;
                                if (android.os.Build.VERSION.SDK_INT < 29) {
                                }
                                if (zzc) {
                                }
                                str6 = name;
                                str5 = str11;
                                i = i5;
                                i2 = i6;
                                i3 = 23;
                                if (!zzc) {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str6).length() + 7);
                                    sb.append(str6);
                                    sb.append(".secure");
                                    arrayList.add(com.google.android.gms.internal.ads.zzvm.zza(sb.toString(), str5, str2, capabilitiesForType, isHardwareAccelerated, zzi, isVendor, false, true));
                                    break;
                                    break;
                                }
                                str7 = str12;
                            } else {
                                if (!zze) {
                                    boolean zzd22 = zzvyVar2.zzd(str8, str2, capabilitiesForType);
                                    boolean zze22 = zzvyVar2.zze(str8, str2, capabilitiesForType);
                                    z = zzvwVar2.zzb;
                                    if (!z || !zze22) {
                                        if (z) {
                                            if (zzd22) {
                                                zzd22 = true;
                                            }
                                        }
                                        isHardwareAccelerated = android.os.Build.VERSION.SDK_INT < 29 ? zzb2.isHardwareAccelerated() : !zzi(zzb2, str11);
                                        zzi = zzi(zzb2, str11);
                                        str3 = str8;
                                        if (android.os.Build.VERSION.SDK_INT < 29) {
                                            try {
                                                isVendor = zzb2.isVendor();
                                            } catch (java.lang.Exception e3) {
                                                e = e3;
                                                str6 = name;
                                                str5 = str11;
                                                i = i5;
                                                i2 = i6;
                                                i3 = 23;
                                                if (android.os.Build.VERSION.SDK_INT != i3 || arrayList.isEmpty()) {
                                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(str6).length() + 24 + str2.length() + 1);
                                                    sb2.append("Failed to query codec ");
                                                    sb2.append(str6);
                                                    sb2.append(" (");
                                                    sb2.append(str2);
                                                    sb2.append(str12);
                                                    com.google.android.gms.internal.ads.zzeg.zze("MediaCodecUtil", sb2.toString());
                                                    throw e;
                                                }
                                                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(str6).length() + 46);
                                                sb3.append("Skipping codec ");
                                                sb3.append(str6);
                                                sb3.append(" (failed to query capabilities)");
                                                com.google.android.gms.internal.ads.zzeg.zze("MediaCodecUtil", sb3.toString());
                                                str7 = str12;
                                                i4 = i + 1;
                                                zzvyVar2 = zzvyVar;
                                                str10 = str7;
                                                str9 = str4;
                                                str8 = str3;
                                                zza2 = i2;
                                                str11 = str5;
                                                zzvwVar2 = zzvwVar;
                                            }
                                        } else {
                                            java.lang.String zza3 = com.google.android.gms.internal.ads.zzgss.zza(zzb2.getName());
                                            isVendor = (zza3.startsWith("omx.google.") || zza3.startsWith("c2.android.") || zza3.startsWith("c2.google.")) ? false : true;
                                        }
                                        if ((zzc || z != zzd22) && (zzc || z)) {
                                            str6 = name;
                                            str5 = str11;
                                            i = i5;
                                            i2 = i6;
                                            i3 = 23;
                                            if (!zzc && zzd22) {
                                                try {
                                                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder(java.lang.String.valueOf(str6).length() + 7);
                                                    sb4.append(str6);
                                                    sb4.append(".secure");
                                                    arrayList.add(com.google.android.gms.internal.ads.zzvm.zza(sb4.toString(), str5, str2, capabilitiesForType, isHardwareAccelerated, zzi, isVendor, false, true));
                                                    break;
                                                } catch (java.lang.Exception e4) {
                                                    e = e4;
                                                    if (android.os.Build.VERSION.SDK_INT != i3) {
                                                    }
                                                    java.lang.StringBuilder sb22 = new java.lang.StringBuilder(java.lang.String.valueOf(str6).length() + 24 + str2.length() + 1);
                                                    sb22.append("Failed to query codec ");
                                                    sb22.append(str6);
                                                    sb22.append(" (");
                                                    sb22.append(str2);
                                                    sb22.append(str12);
                                                    com.google.android.gms.internal.ads.zzeg.zze("MediaCodecUtil", sb22.toString());
                                                    throw e;
                                                }
                                            }
                                        } else {
                                            i = i5;
                                            i2 = i6;
                                            str5 = str11;
                                            try {
                                                arrayList.add(com.google.android.gms.internal.ads.zzvm.zza(name, str11, str2, capabilitiesForType, isHardwareAccelerated, zzi, isVendor, false, false));
                                            } catch (java.lang.Exception e5) {
                                                e = e5;
                                                str6 = name;
                                                i3 = 23;
                                                if (android.os.Build.VERSION.SDK_INT != i3) {
                                                }
                                                java.lang.StringBuilder sb222 = new java.lang.StringBuilder(java.lang.String.valueOf(str6).length() + 24 + str2.length() + 1);
                                                sb222.append("Failed to query codec ");
                                                sb222.append(str6);
                                                sb222.append(" (");
                                                sb222.append(str2);
                                                sb222.append(str12);
                                                com.google.android.gms.internal.ads.zzeg.zze("MediaCodecUtil", sb222.toString());
                                                throw e;
                                            }
                                        }
                                        str7 = str12;
                                    }
                                }
                                str3 = str8;
                            }
                            i4 = i + 1;
                            zzvyVar2 = zzvyVar;
                            str10 = str7;
                            str9 = str4;
                            str8 = str3;
                            zza2 = i2;
                            str11 = str5;
                            zzvwVar2 = zzvwVar;
                        } else {
                            str3 = str8;
                            str4 = str9;
                        }
                        str5 = str11;
                        i = i5;
                        i2 = i6;
                        str7 = str12;
                        i4 = i + 1;
                        zzvyVar2 = zzvyVar;
                        str10 = str7;
                        str9 = str4;
                        str8 = str3;
                        zza2 = i2;
                        str11 = str5;
                        zzvwVar2 = zzvwVar;
                    }
                }
                str3 = str8;
                str4 = str9;
                str7 = str10;
                i = i4;
                i2 = zza2;
                str5 = str11;
                i4 = i + 1;
                zzvyVar2 = zzvyVar;
                str10 = str7;
                str9 = str4;
                str8 = str3;
                zza2 = i2;
                str11 = str5;
                zzvwVar2 = zzvwVar;
            }
            return arrayList;
        } catch (java.lang.Exception e6) {
            throw new com.google.android.gms.internal.ads.zzvx(e6, null);
        }
    }

    private static boolean zzi(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (com.google.android.gms.internal.ads.zzas.zza(str)) {
            return true;
        }
        java.lang.String zza2 = com.google.android.gms.internal.ads.zzgss.zza(mediaCodecInfo.getName());
        if (zza2.startsWith("arc.")) {
            return false;
        }
        if (zza2.startsWith("omx.google.") || zza2.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((zza2.startsWith("omx.sec.") && zza2.contains(".sw.")) || zza2.equals("omx.qcom.video.decoder.hevcswvdec") || zza2.startsWith("c2.android.") || zza2.startsWith("c2.google.")) {
            return true;
        }
        return (zza2.startsWith("omx.") || zza2.startsWith("c2.")) ? false : true;
    }

    private static void zzj(java.util.List list, final com.google.android.gms.internal.ads.zzwe zzweVar) {
        java.util.Collections.sort(list, new java.util.Comparator() { // from class: com.google.android.gms.internal.ads.zzwc
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
                int i = com.google.android.gms.internal.ads.zzwf.zza;
                com.google.android.gms.internal.ads.zzwe zzweVar2 = com.google.android.gms.internal.ads.zzwe.this;
                return zzweVar2.zza(obj2) - zzweVar2.zza(obj);
            }
        });
    }
}
