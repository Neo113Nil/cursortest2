package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class zztl {
    public static final /* synthetic */ int zza = 0;
    private static final HashMap zzb = new HashMap();

    public static zzsr zza() {
        List zzd = zzd("audio/raw", false, false);
        if (zzd.isEmpty()) {
            return null;
        }
        return (zzsr) zzd.get(0);
    }

    public static String zzb(zzz zzzVar) {
        Pair zza2;
        if ("audio/eac3-joc".equals(zzzVar.zzo)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(zzzVar.zzo) && (zza2 = zzda.zza(zzzVar)) != null) {
            int intValue = ((Integer) zza2.first).intValue();
            if (intValue == 16 || intValue == 256) {
                return "video/hevc";
            }
            if (intValue == 512) {
                return "video/avc";
            }
            if (intValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(zzzVar.zzo)) {
            return "video/hevc";
        }
        return null;
    }

    public static List zzc(zzta zztaVar, zzz zzzVar, boolean z4, boolean z7) {
        String zzb2 = zzb(zzzVar);
        return zzb2 == null ? zzfwh.zzn() : zztaVar.zza(zzb2, z4, z7);
    }

    public static synchronized List zzd(String str, boolean z4, boolean z7) {
        synchronized (zztl.class) {
            try {
                zzte zzteVar = new zzte(str, z4, z7);
                HashMap hashMap = zzb;
                List list = (List) hashMap.get(zzteVar);
                if (list != null) {
                    return list;
                }
                ArrayList zzg = zzg(zzteVar, new zzti(z4, z7, str.equals("video/mv-hevc")));
                if (z4 && zzg.isEmpty() && zzen.zza <= 23) {
                    zzg = zzg(zzteVar, new zzth(null));
                    if (!zzg.isEmpty()) {
                        zzdq.zzf("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((zzsr) zzg.get(0)).zza);
                    }
                }
                if ("audio/raw".equals(str)) {
                    if (zzen.zza < 26 && Build.DEVICE.equals("R9") && zzg.size() == 1 && ((zzsr) zzg.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                        zzg.add(zzsr.zzc("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                    }
                    zzh(zzg, new zztj() { // from class: com.google.android.gms.internal.ads.zztc
                        @Override // com.google.android.gms.internal.ads.zztj
                        public final int zza(Object obj) {
                            int i7 = zztl.zza;
                            String str2 = ((zzsr) obj).zza;
                            if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                                return 1;
                            }
                            return (zzen.zza >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                        }
                    });
                }
                if (zzen.zza < 32 && zzg.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzsr) zzg.get(0)).zza)) {
                    zzg.add((zzsr) zzg.remove(0));
                }
                zzfwh zzl = zzfwh.zzl(zzg);
                hashMap.put(zzteVar, zzl);
                return zzl;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static List zze(zzta zztaVar, zzz zzzVar, boolean z4, boolean z7) {
        List zza2 = zztaVar.zza(zzzVar.zzo, z4, z7);
        List zzc = zzc(zztaVar, zzzVar, z4, z7);
        int i7 = zzfwh.zzd;
        zzfwe zzfweVar = new zzfwe();
        zzfweVar.zzh(zza2);
        zzfweVar.zzh(zzc);
        return zzfweVar.zzi();
    }

    public static List zzf(List list, final zzz zzzVar) {
        ArrayList arrayList = new ArrayList(list);
        zzh(arrayList, new zztj() { // from class: com.google.android.gms.internal.ads.zztd
            @Override // com.google.android.gms.internal.ads.zztj
            public final int zza(Object obj) {
                int i7 = zztl.zza;
                return ((zzsr) obj).zzd(zzz.this) ? 1 : 0;
            }
        });
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:64|65|(1:67)(2:128|(1:130)(1:131))|68|(1:70)(2:120|(1:127)(1:126))|(4:(2:114|115)|94|(8:97|98|99|100|101|102|103|105)|11)|74|75|76|77|11) */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01db, code lost:
    
        if (r1.zzb == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a9, code lost:
    
        if ("SCV31".equals(r10) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01f9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0248, code lost:
    
        com.google.android.gms.internal.ads.zzdq.zzc("MediaCodecUtil", "Skipping codec " + r1 + " (failed to query capabilities)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r9 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ac A[Catch: Exception -> 0x018b, TryCatch #0 {Exception -> 0x018b, blocks: (B:57:0x0154, B:61:0x016b, B:65:0x0180, B:67:0x0186, B:68:0x019f, B:70:0x01a7, B:72:0x01d3, B:120:0x01ac, B:122:0x01bc, B:124:0x01c4, B:128:0x0194), top: B:56:0x0154 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0194 A[Catch: Exception -> 0x018b, TryCatch #0 {Exception -> 0x018b, blocks: (B:57:0x0154, B:61:0x016b, B:65:0x0180, B:67:0x0186, B:68:0x019f, B:70:0x01a7, B:72:0x01d3, B:120:0x01ac, B:122:0x01bc, B:124:0x01c4, B:128:0x0194), top: B:56:0x0154 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0186 A[Catch: Exception -> 0x018b, TryCatch #0 {Exception -> 0x018b, blocks: (B:57:0x0154, B:61:0x016b, B:65:0x0180, B:67:0x0186, B:68:0x019f, B:70:0x01a7, B:72:0x01d3, B:120:0x01ac, B:122:0x01bc, B:124:0x01c4, B:128:0x0194), top: B:56:0x0154 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a7 A[Catch: Exception -> 0x018b, TryCatch #0 {Exception -> 0x018b, blocks: (B:57:0x0154, B:61:0x016b, B:65:0x0180, B:67:0x0186, B:68:0x019f, B:70:0x01a7, B:72:0x01d3, B:120:0x01ac, B:122:0x01bc, B:124:0x01c4, B:128:0x0194), top: B:56:0x0154 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0242 A[Catch: Exception -> 0x0034, TRY_ENTER, TryCatch #5 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0037, B:16:0x0045, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:26:0x0069, B:28:0x0073, B:30:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a3, B:44:0x00af, B:46:0x00b7, B:48:0x00bf, B:50:0x00c8, B:80:0x023a, B:83:0x0242, B:85:0x0248, B:88:0x0262, B:89:0x0283, B:52:0x00d2, B:140:0x00d5, B:142:0x00dd, B:145:0x00e9, B:147:0x00f1, B:152:0x00ff, B:154:0x0107, B:156:0x010f, B:159:0x011a, B:161:0x0122, B:164:0x012d, B:166:0x0135, B:169:0x0140, B:171:0x0148), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0262 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ArrayList zzg(zzte zzteVar, zztg zztgVar) {
        String str;
        String str2;
        int i7;
        int i8;
        String str3;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean zzd;
        boolean zzc;
        int i9;
        boolean isHardwareAccelerated;
        boolean zzi;
        boolean z4;
        String str4;
        boolean isAlias;
        zzte zzteVar2 = zzteVar;
        zztg zztgVar2 = zztgVar;
        try {
            ArrayList arrayList = new ArrayList();
            String str5 = zzteVar2.zza;
            int zza2 = zztgVar.zza();
            boolean zze = zztgVar.zze();
            int i10 = 0;
            while (i10 < zza2) {
                MediaCodecInfo zzb2 = zztgVar2.zzb(i10);
                int i11 = zzen.zza;
                if (i11 >= 29) {
                    isAlias = zzb2.isAlias();
                }
                String name = zzb2.getName();
                if (!zzb2.isEncoder() && (zze || !name.endsWith(".secure"))) {
                    if (i11 < 24 && (("OMX.SEC.aac.dec".equals(name) || "OMX.Exynos.AAC.Decoder".equals(name)) && "samsung".equals(Build.MANUFACTURER))) {
                        String str6 = Build.DEVICE;
                        if (!str6.startsWith("zeroflte")) {
                            if (!str6.startsWith("zerolte")) {
                                if (!str6.startsWith("zenlte")) {
                                    if (!"SC-05G".equals(str6)) {
                                        if (!"marinelteatt".equals(str6)) {
                                            if (!"404SC".equals(str6)) {
                                                if (!"SC-04G".equals(str6)) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (i11 > 23 || !"audio/eac3-joc".equals(str5) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(name)) {
                        String[] supportedTypes = zzb2.getSupportedTypes();
                        int length = supportedTypes.length;
                        int i12 = 0;
                        while (true) {
                            if (i12 < length) {
                                str = supportedTypes[i12];
                                if (str.equalsIgnoreCase(str5)) {
                                    break;
                                }
                                i12++;
                            } else if (str5.equals("video/dolby-vision")) {
                                if ("OMX.MS.HEVCDV.Decoder".equals(name)) {
                                    str = "video/hevcdv";
                                } else {
                                    if (!"OMX.RTK.video.decoder".equals(name)) {
                                        if ("OMX.realtek.video.decoder.tunneled".equals(name)) {
                                        }
                                        str = null;
                                    }
                                    str = "video/dv_hevc";
                                }
                            } else if (str5.equals("video/mv-hevc")) {
                                if ("c2.qti.mvhevc.decoder".equals(name) || "c2.qti.mvhevc.decoder.secure".equals(name)) {
                                    str = "video/x-mvhevc";
                                }
                                str = null;
                            } else if (str5.equals("audio/alac") && "OMX.lge.alac.decoder".equals(name)) {
                                str = "audio/x-lg-alac";
                            } else if (str5.equals("audio/flac") && "OMX.lge.flac.decoder".equals(name)) {
                                str = "audio/x-lg-flac";
                            } else {
                                if (str5.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(name)) {
                                    str = "audio/lg-ac3";
                                }
                                str = null;
                            }
                        }
                        if (str != null) {
                            try {
                                capabilitiesForType = zzb2.getCapabilitiesForType(str);
                                zzd = zztgVar2.zzd("tunneled-playback", str, capabilitiesForType);
                                zzc = zztgVar2.zzc("tunneled-playback", str, capabilitiesForType);
                            } catch (Exception e7) {
                                e = e7;
                                str2 = name;
                                i7 = i10;
                                i8 = zza2;
                                str3 = str5;
                            }
                            if (zzteVar2.zzc) {
                                if (!zzd) {
                                }
                                boolean zzd2 = zztgVar2.zzd("secure-playback", str, capabilitiesForType);
                                boolean zzc2 = zztgVar2.zzc("secure-playback", str, capabilitiesForType);
                                if (zzteVar2.zzb) {
                                }
                            } else if (!zzc) {
                                boolean zzd22 = zztgVar2.zzd("secure-playback", str, capabilitiesForType);
                                boolean zzc22 = zztgVar2.zzc("secure-playback", str, capabilitiesForType);
                                if (zzteVar2.zzb) {
                                    if (!zzc22) {
                                        i9 = zzen.zza;
                                        isHardwareAccelerated = i9 < 29 ? zzb2.isHardwareAccelerated() : !zzi(zzb2, str5);
                                        zzi = zzi(zzb2, str5);
                                        if (i9 < 29) {
                                            z4 = zzb2.isVendor();
                                        } else {
                                            String zza3 = zzfsn.zza(zzb2.getName());
                                            z4 = (zza3.startsWith("omx.google.") || zza3.startsWith("c2.android.") || zza3.startsWith("c2.google.")) ? false : true;
                                        }
                                        if (zze || zzteVar2.zzb != zzd22) {
                                            if (!zze) {
                                                try {
                                                } catch (Exception e8) {
                                                    e = e8;
                                                    str4 = name;
                                                    i7 = i10;
                                                    i8 = zza2;
                                                    str3 = str5;
                                                    str2 = str4;
                                                    if (zzen.zza > 23) {
                                                    }
                                                    zzdq.zzc("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                    throw e;
                                                }
                                            }
                                            str4 = name;
                                            i7 = i10;
                                            i8 = zza2;
                                            str3 = str5;
                                            if (!zze && zzd22) {
                                                StringBuilder sb = new StringBuilder();
                                                try {
                                                    sb.append(str4);
                                                    sb.append(".secure");
                                                    str2 = str4;
                                                } catch (Exception e9) {
                                                    e = e9;
                                                    str2 = str4;
                                                }
                                                try {
                                                    arrayList.add(zzsr.zzc(sb.toString(), str3, str, capabilitiesForType, isHardwareAccelerated, zzi, z4, false, true));
                                                    break;
                                                } catch (Exception e10) {
                                                    e = e10;
                                                    if (zzen.zza > 23) {
                                                    }
                                                    zzdq.zzc("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                    throw e;
                                                }
                                            }
                                            i10 = i7 + 1;
                                            zzteVar2 = zzteVar;
                                            str5 = str3;
                                            zza2 = i8;
                                            zztgVar2 = zztgVar;
                                        }
                                        str4 = name;
                                        i7 = i10;
                                        i8 = zza2;
                                        str3 = str5;
                                        arrayList.add(zzsr.zzc(name, str5, str, capabilitiesForType, isHardwareAccelerated, zzi, z4, false, false));
                                        i10 = i7 + 1;
                                        zzteVar2 = zzteVar;
                                        str5 = str3;
                                        zza2 = i8;
                                        zztgVar2 = zztgVar;
                                    }
                                } else if (zzd22) {
                                    zzd22 = true;
                                    i9 = zzen.zza;
                                    if (i9 < 29) {
                                    }
                                    zzi = zzi(zzb2, str5);
                                    if (i9 < 29) {
                                    }
                                    if (zze) {
                                    }
                                    if (!zze) {
                                    }
                                    str4 = name;
                                    i7 = i10;
                                    i8 = zza2;
                                    str3 = str5;
                                    if (!zze) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(str4);
                                        sb2.append(".secure");
                                        str2 = str4;
                                        arrayList.add(zzsr.zzc(sb2.toString(), str3, str, capabilitiesForType, isHardwareAccelerated, zzi, z4, false, true));
                                        break;
                                        break;
                                    }
                                    continue;
                                    i10 = i7 + 1;
                                    zzteVar2 = zzteVar;
                                    str5 = str3;
                                    zza2 = i8;
                                    zztgVar2 = zztgVar;
                                }
                            }
                        }
                    }
                }
                i7 = i10;
                i8 = zza2;
                str3 = str5;
                i10 = i7 + 1;
                zzteVar2 = zzteVar;
                str5 = str3;
                zza2 = i8;
                zztgVar2 = zztgVar;
            }
            return arrayList;
        } catch (Exception e11) {
            throw new zztf(e11, null);
        }
    }

    private static void zzh(List list, final zztj zztjVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zztb
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i7 = zztl.zza;
                zztj zztjVar2 = zztj.this;
                return zztjVar2.zza(obj2) - zztjVar2.zza(obj);
            }
        });
    }

    private static boolean zzi(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (zzen.zza >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if (zzay.zzh(str)) {
            return true;
        }
        String zza2 = zzfsn.zza(mediaCodecInfo.getName());
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
}
