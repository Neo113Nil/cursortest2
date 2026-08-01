package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzwl {
    public static final /* synthetic */ int zza = 0;
    private static final HashMap zzb = new HashMap();

    public static zzvs zza() throws zzwd {
        List zzb2 = zzb("audio/raw", false, false);
        if (zzb2.isEmpty()) {
            return null;
        }
        return (zzvs) zzb2.get(0);
    }

    public static synchronized List zzb(String str, boolean z, boolean z2) throws zzwd {
        synchronized (zzwl.class) {
            zzwc zzwcVar = new zzwc(str, z, z2);
            HashMap hashMap = zzb;
            List list = (List) hashMap.get(zzwcVar);
            if (list != null) {
                return list;
            }
            ArrayList zzh = zzh(zzwcVar, new zzwg(z, z2, str.equals("video/mv-hevc")));
            if (z) {
                zzh.isEmpty();
            }
            if ("audio/raw".equals(str)) {
                if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && zzh.size() == 1 && ((zzvs) zzh.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    zzh.add(zzvs.zza("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                zzj(zzh, zzwh.zza);
            }
            if (Build.VERSION.SDK_INT < 32 && zzh.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzvs) zzh.get(0)).zza)) {
                zzh.add((zzvs) zzh.remove(0));
            }
            zzgxm zzq = zzgxm.zzq(zzh);
            hashMap.put(zzwcVar, zzq);
            return zzq;
        }
    }

    @RequiresNonNull({"#2.sampleMimeType"})
    public static List zzc(zzwb zzwbVar, zzv zzvVar, boolean z, boolean z2) throws zzwd {
        List zza2 = zzwbVar.zza(zzvVar.zzp, z, z2);
        List zzd = zzd(zzwbVar, zzvVar, z, z2);
        int i = zzgxm.zzd;
        zzgxj zzgxjVar = new zzgxj();
        zzgxjVar.zzh(zza2);
        zzgxjVar.zzh(zzd);
        return zzgxjVar.zzi();
    }

    public static List zzd(zzwb zzwbVar, zzv zzvVar, boolean z, boolean z2) throws zzwd {
        String zzg = zzg(zzvVar);
        return zzg == null ? zzgxm.zzi() : zzwbVar.zza(zzg, z, z2);
    }

    public static List zze(final Context context, List list, final zzv zzvVar) {
        ArrayList arrayList = new ArrayList(list);
        zzj(arrayList, new zzwk() { // from class: com.google.android.gms.internal.ads.zzwj
            @Override // com.google.android.gms.internal.ads.zzwk
            public final /* synthetic */ int zza(Object obj) {
                int i = zzwl.zza;
                return ((zzvs) obj).zzd(context, zzvVar) ? 1 : 0;
            }
        });
        return arrayList;
    }

    public static MediaCodecInfo.CodecProfileLevel zzf(int i, int i2) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i2;
        return codecProfileLevel;
    }

    public static String zzg(zzv zzvVar) {
        zzdq zzf;
        String str = zzvVar.zzp;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("audio/vnd.dts.hd".equals(str) || "audio/vnd.dts.uhd;profile=p2".equals(str)) {
            return "audio/vnd.dts";
        }
        if ("video/dolby-vision".equals(str) && (zzf = zzdr.zzf(zzvVar)) != null && zzf.zzc()) {
            int zza2 = zzf.zza();
            if (zza2 == 16 || zza2 == 256) {
                return "video/hevc";
            }
            if (zza2 == 512) {
                return "video/avc";
            }
            if (zza2 == 1024) {
                zzi zziVar = zzvVar.zzG;
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

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        r7 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a1, code lost:
    
        r9 = new java.lang.StringBuilder(java.lang.String.valueOf(r1).length() + 7);
        r9.append(r1);
        r9.append(".secure");
        r8.add(com.google.android.gms.internal.ads.zzvs.zza(r9.toString(), r26, r7, r13, r0, r21, r2, false, true));
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0128 A[Catch: Exception -> 0x01d0, TryCatch #0 {Exception -> 0x01d0, blocks: (B:28:0x00f2, B:32:0x010e, B:38:0x0122, B:40:0x0128, B:41:0x0138, B:43:0x0144, B:69:0x0149, B:71:0x0159, B:73:0x0161, B:77:0x012d), top: B:27:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0144 A[Catch: Exception -> 0x01d0, TryCatch #0 {Exception -> 0x01d0, blocks: (B:28:0x00f2, B:32:0x010e, B:38:0x0122, B:40:0x0128, B:41:0x0138, B:43:0x0144, B:69:0x0149, B:71:0x0159, B:73:0x0161, B:77:0x012d), top: B:27:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0149 A[Catch: Exception -> 0x01d0, TryCatch #0 {Exception -> 0x01d0, blocks: (B:28:0x00f2, B:32:0x010e, B:38:0x0122, B:40:0x0128, B:41:0x0138, B:43:0x0144, B:69:0x0149, B:71:0x0159, B:73:0x0161, B:77:0x012d), top: B:27:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012d A[Catch: Exception -> 0x01d0, TryCatch #0 {Exception -> 0x01d0, blocks: (B:28:0x00f2, B:32:0x010e, B:38:0x0122, B:40:0x0128, B:41:0x0138, B:43:0x0144, B:69:0x0149, B:71:0x0159, B:73:0x0161, B:77:0x012d), top: B:27:0x00f2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ArrayList zzh(zzwc zzwcVar, zzwe zzweVar) throws zzwd {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        String str5;
        int i2;
        String str6;
        boolean z;
        boolean z2;
        zzwc zzwcVar2 = zzwcVar;
        zzwe zzweVar2 = zzweVar;
        String str7 = "secure-playback";
        String str8 = "tunneled-playback";
        try {
            ArrayList arrayList = new ArrayList();
            String str9 = zzwcVar2.zza;
            int zza2 = zzweVar.zza();
            boolean zzc = zzweVar.zzc();
            int i3 = 0;
            while (true) {
                if (i3 >= zza2) {
                    break;
                }
                MediaCodecInfo zzb2 = zzweVar2.zzb(i3);
                if (Build.VERSION.SDK_INT < 29 || !zzb2.isAlias()) {
                    String name = zzb2.getName();
                    if (!zzb2.isEncoder() && (zzc || !name.endsWith(".secure"))) {
                        String[] supportedTypes = zzb2.getSupportedTypes();
                        int length = supportedTypes.length;
                        int i4 = i3;
                        int i5 = 0;
                        while (true) {
                            if (i5 < length) {
                                int i6 = length;
                                str = supportedTypes[i5];
                                if (str.equalsIgnoreCase(str9)) {
                                    break;
                                }
                                i5++;
                                length = i6;
                            } else if (str9.equals("video/dolby-vision")) {
                                if ("OMX.MS.HEVCDV.Decoder".equals(name)) {
                                    str = "video/hevcdv";
                                } else {
                                    if ("OMX.RTK.video.decoder".equals(name) || "OMX.realtek.video.decoder.tunneled".equals(name)) {
                                        str = "video/dv_hevc";
                                    }
                                    str2 = null;
                                }
                            } else if (str9.equals("video/mv-hevc")) {
                                if (!"c2.qti.mvhevc.decoder".equals(name)) {
                                    if ("c2.qti.mvhevc.decoder.secure".equals(name)) {
                                    }
                                    str2 = null;
                                }
                                str = "video/x-mvhevc";
                            } else if (str9.equals("audio/alac") && "OMX.lge.alac.decoder".equals(name)) {
                                str = "audio/x-lg-alac";
                            } else if (str9.equals("audio/flac") && "OMX.lge.flac.decoder".equals(name)) {
                                str = "audio/x-lg-flac";
                            } else {
                                if (str9.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(name)) {
                                    str = "audio/lg-ac3";
                                }
                                str2 = null;
                            }
                        }
                        if (str2 != null) {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = zzb2.getCapabilitiesForType(str2);
                                boolean zzd = zzweVar2.zzd(str8, str2, capabilitiesForType);
                                boolean zze = zzweVar2.zze(str8, str2, capabilitiesForType);
                                str4 = str8;
                                if (zzwcVar2.zzc) {
                                    if (!zzd) {
                                        str3 = str7;
                                    }
                                    boolean zzd2 = zzweVar2.zzd(str7, str2, capabilitiesForType);
                                    boolean zze2 = zzweVar2.zze(str7, str2, capabilitiesForType);
                                    z = zzwcVar2.zzb;
                                    if (!z) {
                                    }
                                    if (z) {
                                    }
                                    if (Build.VERSION.SDK_INT < 29) {
                                    }
                                    boolean zzi = zzi(zzb2, str9);
                                    str3 = str7;
                                    if (Build.VERSION.SDK_INT < 29) {
                                    }
                                    if (zzc) {
                                    }
                                    str6 = name;
                                    i = zza2;
                                    str5 = str9;
                                    i2 = i4;
                                    if (!zzc) {
                                        break;
                                        break;
                                    }
                                    continue;
                                } else {
                                    if (!zze) {
                                        boolean zzd22 = zzweVar2.zzd(str7, str2, capabilitiesForType);
                                        boolean zze22 = zzweVar2.zze(str7, str2, capabilitiesForType);
                                        z = zzwcVar2.zzb;
                                        if (!z || !zze22) {
                                            if (z) {
                                                if (zzd22) {
                                                    zzd22 = true;
                                                }
                                            }
                                            boolean isHardwareAccelerated = Build.VERSION.SDK_INT < 29 ? zzb2.isHardwareAccelerated() : !zzi(zzb2, str9);
                                            boolean zzi2 = zzi(zzb2, str9);
                                            str3 = str7;
                                            if (Build.VERSION.SDK_INT < 29) {
                                                z2 = zzb2.isVendor();
                                            } else {
                                                String zza3 = zzgts.zza(zzb2.getName());
                                                z2 = (zza3.startsWith("omx.google.") || zza3.startsWith("c2.android.") || zza3.startsWith("c2.google.")) ? false : true;
                                            }
                                            if ((zzc || z != zzd22) && (zzc || z)) {
                                                str6 = name;
                                                i = zza2;
                                                str5 = str9;
                                                i2 = i4;
                                                if (!zzc && zzd22) {
                                                    try {
                                                        break;
                                                    } catch (Exception e) {
                                                        e = e;
                                                        StringBuilder sb = new StringBuilder(String.valueOf(str6).length() + 24 + str2.length() + 1);
                                                        sb.append("Failed to query codec ");
                                                        sb.append(str6);
                                                        sb.append(" (");
                                                        sb.append(str2);
                                                        sb.append(")");
                                                        zzeh.zze("MediaCodecUtil", sb.toString());
                                                        throw e;
                                                    }
                                                }
                                            } else {
                                                i2 = i4;
                                                i = zza2;
                                                str5 = str9;
                                                try {
                                                    arrayList.add(zzvs.zza(name, str9, str2, capabilitiesForType, isHardwareAccelerated, zzi2, z2, false, false));
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    str6 = name;
                                                    StringBuilder sb2 = new StringBuilder(String.valueOf(str6).length() + 24 + str2.length() + 1);
                                                    sb2.append("Failed to query codec ");
                                                    sb2.append(str6);
                                                    sb2.append(" (");
                                                    sb2.append(str2);
                                                    sb2.append(")");
                                                    zzeh.zze("MediaCodecUtil", sb2.toString());
                                                    throw e;
                                                }
                                            }
                                        }
                                    }
                                    str3 = str7;
                                }
                                i3 = i2 + 1;
                                zzwcVar2 = zzwcVar;
                                zzweVar2 = zzweVar;
                                str8 = str4;
                                str7 = str3;
                                zza2 = i;
                                str9 = str5;
                            } catch (Exception e3) {
                                e = e3;
                                str6 = name;
                            }
                        } else {
                            str3 = str7;
                            str4 = str8;
                        }
                        i = zza2;
                        str5 = str9;
                        i2 = i4;
                        i3 = i2 + 1;
                        zzwcVar2 = zzwcVar;
                        zzweVar2 = zzweVar;
                        str8 = str4;
                        str7 = str3;
                        zza2 = i;
                        str9 = str5;
                    }
                }
                str3 = str7;
                str4 = str8;
                i2 = i3;
                i = zza2;
                str5 = str9;
                i3 = i2 + 1;
                zzwcVar2 = zzwcVar;
                zzweVar2 = zzweVar;
                str8 = str4;
                str7 = str3;
                zza2 = i;
                str9 = str5;
            }
            return arrayList;
        } catch (Exception e4) {
            throw new zzwd(e4, null);
        }
    }

    private static boolean zzi(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzas.zza(str)) {
            return true;
        }
        String zza2 = zzgts.zza(mediaCodecInfo.getName());
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

    private static void zzj(List list, final zzwk zzwkVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzwi
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                int i = zzwl.zza;
                zzwk zzwkVar2 = zzwk.this;
                return zzwkVar2.zza(obj2) - zzwkVar2.zza(obj);
            }
        });
    }
}
