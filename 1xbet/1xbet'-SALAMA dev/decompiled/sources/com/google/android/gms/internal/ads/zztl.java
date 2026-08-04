package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zztl {
    public static final /* synthetic */ int zza = 0;
    private static final HashMap zzb = new HashMap();

    public static zzsr zza() {
        List listZzd = zzd("audio/raw", false, false);
        if (listZzd.isEmpty()) {
            return null;
        }
        return (zzsr) listZzd.get(0);
    }

    public static String zzb(zzz zzzVar) {
        Pair pairZza;
        if ("audio/eac3-joc".equals(zzzVar.zzo)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(zzzVar.zzo) && (pairZza = zzda.zza(zzzVar)) != null) {
            int iIntValue = ((Integer) pairZza.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(zzzVar.zzo)) {
            return "video/hevc";
        }
        return null;
    }

    public static List zzc(zzta zztaVar, zzz zzzVar, boolean z4, boolean z7) {
        String strZzb = zzb(zzzVar);
        return strZzb == null ? zzfwh.zzn() : zztaVar.zza(strZzb, z4, z7);
    }

    public static synchronized List zzd(String str, boolean z4, boolean z7) {
        try {
            zzte zzteVar = new zzte(str, z4, z7);
            HashMap map = zzb;
            List list = (List) map.get(zzteVar);
            if (list != null) {
                return list;
            }
            ArrayList arrayListZzg = zzg(zzteVar, new zzti(z4, z7, str.equals("video/mv-hevc")));
            if (z4 && arrayListZzg.isEmpty() && zzen.zza <= 23) {
                arrayListZzg = zzg(zzteVar, new zzth(null));
                if (!arrayListZzg.isEmpty()) {
                    zzdq.zzf("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((zzsr) arrayListZzg.get(0)).zza);
                }
            }
            if ("audio/raw".equals(str)) {
                if (zzen.zza < 26 && Build.DEVICE.equals("R9") && arrayListZzg.size() == 1 && ((zzsr) arrayListZzg.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    arrayListZzg.add(zzsr.zzc("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                zzh(arrayListZzg, new zztj() { // from class: com.google.android.gms.internal.ads.zztc
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
            if (zzen.zza < 32 && arrayListZzg.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzsr) arrayListZzg.get(0)).zza)) {
                arrayListZzg.add((zzsr) arrayListZzg.remove(0));
            }
            zzfwh zzfwhVarZzl = zzfwh.zzl(arrayListZzg);
            map.put(zzteVar, zzfwhVarZzl);
            return zzfwhVarZzl;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static List zze(zzta zztaVar, zzz zzzVar, boolean z4, boolean z7) {
        List listZza = zztaVar.zza(zzzVar.zzo, z4, z7);
        List listZzc = zzc(zztaVar, zzzVar, z4, z7);
        int i7 = zzfwh.zzd;
        zzfwe zzfweVar = new zzfwe();
        zzfweVar.zzh(listZza);
        zzfweVar.zzh(listZzc);
        return zzfweVar.zzi();
    }

    public static List zzf(List list, final zzz zzzVar) {
        ArrayList arrayList = new ArrayList(list);
        zzh(arrayList, new zztj() { // from class: com.google.android.gms.internal.ads.zztd
            @Override // com.google.android.gms.internal.ads.zztj
            public final int zza(Object obj) {
                int i7 = zztl.zza;
                return ((zzsr) obj).zzd(zzzVar) ? 1 : 0;
            }
        });
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x017e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0186 A[Catch: Exception -> 0x018b, TryCatch #0 {Exception -> 0x018b, blocks: (B:89:0x0154, B:95:0x016b, B:101:0x0180, B:103:0x0186, B:110:0x019f, B:112:0x01a7, B:122:0x01d3, B:113:0x01ac, B:115:0x01bc, B:117:0x01c4, B:106:0x0194), top: B:158:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0194 A[Catch: Exception -> 0x018b, TryCatch #0 {Exception -> 0x018b, blocks: (B:89:0x0154, B:95:0x016b, B:101:0x0180, B:103:0x0186, B:110:0x019f, B:112:0x01a7, B:122:0x01d3, B:113:0x01ac, B:115:0x01bc, B:117:0x01c4, B:106:0x0194), top: B:158:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x019a  */
    /* JADX WARN: Code duplicated, block: B:109:0x019d  */
    /* JADX WARN: Code duplicated, block: B:112:0x01a7 A[Catch: Exception -> 0x018b, TryCatch #0 {Exception -> 0x018b, blocks: (B:89:0x0154, B:95:0x016b, B:101:0x0180, B:103:0x0186, B:110:0x019f, B:112:0x01a7, B:122:0x01d3, B:113:0x01ac, B:115:0x01bc, B:117:0x01c4, B:106:0x0194), top: B:158:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x01ac A[Catch: Exception -> 0x018b, TryCatch #0 {Exception -> 0x018b, blocks: (B:89:0x0154, B:95:0x016b, B:101:0x0180, B:103:0x0186, B:110:0x019f, B:112:0x01a7, B:122:0x01d3, B:113:0x01ac, B:115:0x01bc, B:117:0x01c4, B:106:0x0194), top: B:158:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x01bc A[Catch: Exception -> 0x018b, TryCatch #0 {Exception -> 0x018b, blocks: (B:89:0x0154, B:95:0x016b, B:101:0x0180, B:103:0x0186, B:110:0x019f, B:112:0x01a7, B:122:0x01d3, B:113:0x01ac, B:115:0x01bc, B:117:0x01c4, B:106:0x0194), top: B:158:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:122:0x01d3 A[Catch: Exception -> 0x018b, TRY_LEAVE, TryCatch #0 {Exception -> 0x018b, blocks: (B:89:0x0154, B:95:0x016b, B:101:0x0180, B:103:0x0186, B:110:0x019f, B:112:0x01a7, B:122:0x01d3, B:113:0x01ac, B:115:0x01bc, B:117:0x01c4, B:106:0x0194), top: B:158:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x01d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:135:0x0210 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:149:0x0242 A[Catch: Exception -> 0x0034, TRY_ENTER, TryCatch #5 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0037, B:16:0x0045, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:26:0x0069, B:28:0x0073, B:30:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a3, B:44:0x00af, B:46:0x00b7, B:48:0x00bf, B:50:0x00c8, B:146:0x023a, B:149:0x0242, B:151:0x0248, B:152:0x0262, B:153:0x0283, B:53:0x00d2, B:54:0x00d5, B:56:0x00dd, B:59:0x00e9, B:61:0x00f1, B:66:0x00ff, B:68:0x0107, B:70:0x010f, B:73:0x011a, B:75:0x0122, B:78:0x012d, B:80:0x0135, B:83:0x0140, B:85:0x0148), top: B:168:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x0154 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x01d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0262 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x0284 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bf A[Catch: Exception -> 0x0034, TryCatch #5 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0037, B:16:0x0045, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:26:0x0069, B:28:0x0073, B:30:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a3, B:44:0x00af, B:46:0x00b7, B:48:0x00bf, B:50:0x00c8, B:146:0x023a, B:149:0x0242, B:151:0x0248, B:152:0x0262, B:153:0x0283, B:53:0x00d2, B:54:0x00d5, B:56:0x00dd, B:59:0x00e9, B:61:0x00f1, B:66:0x00ff, B:68:0x0107, B:70:0x010f, B:73:0x011a, B:75:0x0122, B:78:0x012d, B:80:0x0135, B:83:0x0140, B:85:0x0148), top: B:168:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c8 A[Catch: Exception -> 0x0034, TryCatch #5 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0037, B:16:0x0045, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:26:0x0069, B:28:0x0073, B:30:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a3, B:44:0x00af, B:46:0x00b7, B:48:0x00bf, B:50:0x00c8, B:146:0x023a, B:149:0x0242, B:151:0x0248, B:152:0x0262, B:153:0x0283, B:53:0x00d2, B:54:0x00d5, B:56:0x00dd, B:59:0x00e9, B:61:0x00f1, B:66:0x00ff, B:68:0x0107, B:70:0x010f, B:73:0x011a, B:75:0x0122, B:78:0x012d, B:80:0x0135, B:83:0x0140, B:85:0x0148), top: B:168:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d2 A[Catch: Exception -> 0x0034, LOOP:1: B:49:0x00c6->B:53:0x00d2, LOOP_END, TryCatch #5 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0037, B:16:0x0045, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:26:0x0069, B:28:0x0073, B:30:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a3, B:44:0x00af, B:46:0x00b7, B:48:0x00bf, B:50:0x00c8, B:146:0x023a, B:149:0x0242, B:151:0x0248, B:152:0x0262, B:153:0x0283, B:53:0x00d2, B:54:0x00d5, B:56:0x00dd, B:59:0x00e9, B:61:0x00f1, B:66:0x00ff, B:68:0x0107, B:70:0x010f, B:73:0x011a, B:75:0x0122, B:78:0x012d, B:80:0x0135, B:83:0x0140, B:85:0x0148), top: B:168:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00dd A[Catch: Exception -> 0x0034, TryCatch #5 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0037, B:16:0x0045, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:26:0x0069, B:28:0x0073, B:30:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a3, B:44:0x00af, B:46:0x00b7, B:48:0x00bf, B:50:0x00c8, B:146:0x023a, B:149:0x0242, B:151:0x0248, B:152:0x0262, B:153:0x0283, B:53:0x00d2, B:54:0x00d5, B:56:0x00dd, B:59:0x00e9, B:61:0x00f1, B:66:0x00ff, B:68:0x0107, B:70:0x010f, B:73:0x011a, B:75:0x0122, B:78:0x012d, B:80:0x0135, B:83:0x0140, B:85:0x0148), top: B:168:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00e5 A[EDGE_INSN: B:58:0x00e5->B:88:0x0152 BREAK  A[LOOP:1: B:49:0x00c6->B:53:0x00d2]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00e9 A[Catch: Exception -> 0x0034, TryCatch #5 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0037, B:16:0x0045, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:26:0x0069, B:28:0x0073, B:30:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a3, B:44:0x00af, B:46:0x00b7, B:48:0x00bf, B:50:0x00c8, B:146:0x023a, B:149:0x0242, B:151:0x0248, B:152:0x0262, B:153:0x0283, B:53:0x00d2, B:54:0x00d5, B:56:0x00dd, B:59:0x00e9, B:61:0x00f1, B:66:0x00ff, B:68:0x0107, B:70:0x010f, B:73:0x011a, B:75:0x0122, B:78:0x012d, B:80:0x0135, B:83:0x0140, B:85:0x0148), top: B:168:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00f1 A[Catch: Exception -> 0x0034, TryCatch #5 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0037, B:16:0x0045, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:26:0x0069, B:28:0x0073, B:30:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a3, B:44:0x00af, B:46:0x00b7, B:48:0x00bf, B:50:0x00c8, B:146:0x023a, B:149:0x0242, B:151:0x0248, B:152:0x0262, B:153:0x0283, B:53:0x00d2, B:54:0x00d5, B:56:0x00dd, B:59:0x00e9, B:61:0x00f1, B:66:0x00ff, B:68:0x0107, B:70:0x010f, B:73:0x011a, B:75:0x0122, B:78:0x012d, B:80:0x0135, B:83:0x0140, B:85:0x0148), top: B:168:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00fa A[EDGE_INSN: B:64:0x00fa->B:88:0x0152 BREAK  A[LOOP:1: B:49:0x00c6->B:53:0x00d2]] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ff A[Catch: Exception -> 0x0034, TryCatch #5 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0037, B:16:0x0045, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:26:0x0069, B:28:0x0073, B:30:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a3, B:44:0x00af, B:46:0x00b7, B:48:0x00bf, B:50:0x00c8, B:146:0x023a, B:149:0x0242, B:151:0x0248, B:152:0x0262, B:153:0x0283, B:53:0x00d2, B:54:0x00d5, B:56:0x00dd, B:59:0x00e9, B:61:0x00f1, B:66:0x00ff, B:68:0x0107, B:70:0x010f, B:73:0x011a, B:75:0x0122, B:78:0x012d, B:80:0x0135, B:83:0x0140, B:85:0x0148), top: B:168:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0107 A[Catch: Exception -> 0x0034, TryCatch #5 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0037, B:16:0x0045, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:26:0x0069, B:28:0x0073, B:30:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a3, B:44:0x00af, B:46:0x00b7, B:48:0x00bf, B:50:0x00c8, B:146:0x023a, B:149:0x0242, B:151:0x0248, B:152:0x0262, B:153:0x0283, B:53:0x00d2, B:54:0x00d5, B:56:0x00dd, B:59:0x00e9, B:61:0x00f1, B:66:0x00ff, B:68:0x0107, B:70:0x010f, B:73:0x011a, B:75:0x0122, B:78:0x012d, B:80:0x0135, B:83:0x0140, B:85:0x0148), top: B:168:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x010f A[Catch: Exception -> 0x0034, TryCatch #5 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0037, B:16:0x0045, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:26:0x0069, B:28:0x0073, B:30:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a3, B:44:0x00af, B:46:0x00b7, B:48:0x00bf, B:50:0x00c8, B:146:0x023a, B:149:0x0242, B:151:0x0248, B:152:0x0262, B:153:0x0283, B:53:0x00d2, B:54:0x00d5, B:56:0x00dd, B:59:0x00e9, B:61:0x00f1, B:66:0x00ff, B:68:0x0107, B:70:0x010f, B:73:0x011a, B:75:0x0122, B:78:0x012d, B:80:0x0135, B:83:0x0140, B:85:0x0148), top: B:168:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x011a A[Catch: Exception -> 0x0034, TryCatch #5 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0037, B:16:0x0045, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:26:0x0069, B:28:0x0073, B:30:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a3, B:44:0x00af, B:46:0x00b7, B:48:0x00bf, B:50:0x00c8, B:146:0x023a, B:149:0x0242, B:151:0x0248, B:152:0x0262, B:153:0x0283, B:53:0x00d2, B:54:0x00d5, B:56:0x00dd, B:59:0x00e9, B:61:0x00f1, B:66:0x00ff, B:68:0x0107, B:70:0x010f, B:73:0x011a, B:75:0x0122, B:78:0x012d, B:80:0x0135, B:83:0x0140, B:85:0x0148), top: B:168:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0122 A[Catch: Exception -> 0x0034, TryCatch #5 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0037, B:16:0x0045, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:26:0x0069, B:28:0x0073, B:30:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a3, B:44:0x00af, B:46:0x00b7, B:48:0x00bf, B:50:0x00c8, B:146:0x023a, B:149:0x0242, B:151:0x0248, B:152:0x0262, B:153:0x0283, B:53:0x00d2, B:54:0x00d5, B:56:0x00dd, B:59:0x00e9, B:61:0x00f1, B:66:0x00ff, B:68:0x0107, B:70:0x010f, B:73:0x011a, B:75:0x0122, B:78:0x012d, B:80:0x0135, B:83:0x0140, B:85:0x0148), top: B:168:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x012d A[Catch: Exception -> 0x0034, TryCatch #5 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0037, B:16:0x0045, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:26:0x0069, B:28:0x0073, B:30:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a3, B:44:0x00af, B:46:0x00b7, B:48:0x00bf, B:50:0x00c8, B:146:0x023a, B:149:0x0242, B:151:0x0248, B:152:0x0262, B:153:0x0283, B:53:0x00d2, B:54:0x00d5, B:56:0x00dd, B:59:0x00e9, B:61:0x00f1, B:66:0x00ff, B:68:0x0107, B:70:0x010f, B:73:0x011a, B:75:0x0122, B:78:0x012d, B:80:0x0135, B:83:0x0140, B:85:0x0148), top: B:168:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0135 A[Catch: Exception -> 0x0034, TryCatch #5 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0037, B:16:0x0045, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:26:0x0069, B:28:0x0073, B:30:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a3, B:44:0x00af, B:46:0x00b7, B:48:0x00bf, B:50:0x00c8, B:146:0x023a, B:149:0x0242, B:151:0x0248, B:152:0x0262, B:153:0x0283, B:53:0x00d2, B:54:0x00d5, B:56:0x00dd, B:59:0x00e9, B:61:0x00f1, B:66:0x00ff, B:68:0x0107, B:70:0x010f, B:73:0x011a, B:75:0x0122, B:78:0x012d, B:80:0x0135, B:83:0x0140, B:85:0x0148), top: B:168:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0140 A[Catch: Exception -> 0x0034, TryCatch #5 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0037, B:16:0x0045, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:26:0x0069, B:28:0x0073, B:30:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a3, B:44:0x00af, B:46:0x00b7, B:48:0x00bf, B:50:0x00c8, B:146:0x023a, B:149:0x0242, B:151:0x0248, B:152:0x0262, B:153:0x0283, B:53:0x00d2, B:54:0x00d5, B:56:0x00dd, B:59:0x00e9, B:61:0x00f1, B:66:0x00ff, B:68:0x0107, B:70:0x010f, B:73:0x011a, B:75:0x0122, B:78:0x012d, B:80:0x0135, B:83:0x0140, B:85:0x0148), top: B:168:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0148 A[Catch: Exception -> 0x0034, TryCatch #5 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0037, B:16:0x0045, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:26:0x0069, B:28:0x0073, B:30:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a3, B:44:0x00af, B:46:0x00b7, B:48:0x00bf, B:50:0x00c8, B:146:0x023a, B:149:0x0242, B:151:0x0248, B:152:0x0262, B:153:0x0283, B:53:0x00d2, B:54:0x00d5, B:56:0x00dd, B:59:0x00e9, B:61:0x00f1, B:66:0x00ff, B:68:0x0107, B:70:0x010f, B:73:0x011a, B:75:0x0122, B:78:0x012d, B:80:0x0135, B:83:0x0140, B:85:0x0148), top: B:168:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0164 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0166  */
    /* JADX WARN: Code duplicated, block: B:93:0x0167 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0169  */
    /* JADX WARN: Code duplicated, block: B:95:0x016b A[Catch: Exception -> 0x018b, TryCatch #0 {Exception -> 0x018b, blocks: (B:89:0x0154, B:95:0x016b, B:101:0x0180, B:103:0x0186, B:110:0x019f, B:112:0x01a7, B:122:0x01d3, B:113:0x01ac, B:115:0x01bc, B:117:0x01c4, B:106:0x0194), top: B:158:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0179 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x017b  */
    /* JADX WARN: Code duplicated, block: B:99:0x017c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    private static ArrayList zzg(zzte zzteVar, zztg zztgVar) throws zztf {
        String[] supportedTypes;
        int length;
        int i7;
        String str;
        String str2;
        int i8;
        int i9;
        String str3;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean zZzd;
        boolean zZzc;
        boolean zZzd2;
        boolean zZzc2;
        int i10;
        boolean zIsHardwareAccelerated;
        boolean zZzi;
        String strZza;
        boolean zIsVendor;
        String str4;
        zzte zzteVar2 = zzteVar;
        try {
            ArrayList arrayList = new ArrayList();
            String str5 = zzteVar2.zza;
            boolean zZze = zztgVar.zze();
            int i11 = 0;
            for (int iZza = zztgVar.zza(); i11 < iZza; iZza = i9) {
                MediaCodecInfo mediaCodecInfoZzb = zztgVar.zzb(i11);
                int i12 = zzen.zza;
                if (i12 < 29 || !mediaCodecInfoZzb.isAlias()) {
                    String name = mediaCodecInfoZzb.getName();
                    if (mediaCodecInfoZzb.isEncoder() || (!zZze && name.endsWith(".secure"))) {
                        i8 = i11;
                        i9 = iZza;
                        str3 = str5;
                    } else if (i12 < 24 && (("OMX.SEC.aac.dec".equals(name) || "OMX.Exynos.AAC.Decoder".equals(name)) && "samsung".equals(Build.MANUFACTURER))) {
                        String str6 = Build.DEVICE;
                        if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                            i8 = i11;
                            i9 = iZza;
                            str3 = str5;
                        } else if (i12 > 23) {
                            supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                            length = supportedTypes.length;
                            i7 = 0;
                            while (true) {
                                if (i7 >= length) {
                                    if (!str5.equals("video/dolby-vision")) {
                                        if (!str5.equals("video/mv-hevc")) {
                                            if (!str5.equals("audio/alac")) {
                                                if (!str5.equals("audio/flac")) {
                                                    if (!str5.equals("audio/ac3")) {
                                                        str = null;
                                                        break;
                                                    }
                                                    str = null;
                                                    break;
                                                }
                                                if (!str5.equals("audio/ac3")) {
                                                    str = null;
                                                    break;
                                                }
                                                str = null;
                                                break;
                                            }
                                            if (!str5.equals("audio/flac")) {
                                                if (!str5.equals("audio/ac3")) {
                                                    str = null;
                                                    break;
                                                }
                                                str = null;
                                                break;
                                            }
                                            if (!str5.equals("audio/ac3")) {
                                                str = null;
                                                break;
                                            }
                                            str = null;
                                            break;
                                        }
                                        if ("c2.qti.mvhevc.decoder".equals(name)) {
                                        }
                                        str = "video/x-mvhevc";
                                        break;
                                    }
                                    if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                        if ("OMX.RTK.video.decoder".equals(name)) {
                                        }
                                        str = "video/dv_hevc";
                                        break;
                                    }
                                    str = "video/hevcdv";
                                    break;
                                }
                                str = supportedTypes[i7];
                                if (str.equalsIgnoreCase(str5)) {
                                    break;
                                    break;
                                }
                                i7++;
                            }
                            if (str != null) {
                                capabilitiesForType = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                zZzd = zztgVar.zzd("tunneled-playback", str, capabilitiesForType);
                                zZzc = zztgVar.zzc("tunneled-playback", str, capabilitiesForType);
                                if (zzteVar2.zzc) {
                                    if (zZzd) {
                                        zZzd2 = zztgVar.zzd("secure-playback", str, capabilitiesForType);
                                        zZzc2 = zztgVar.zzc("secure-playback", str, capabilitiesForType);
                                        if (zzteVar2.zzb) {
                                            if (zZzd2) {
                                                zZzd2 = true;
                                                i10 = zzen.zza;
                                                if (i10 >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                } else if (zzi(mediaCodecInfoZzb, str5)) {
                                                    zIsHardwareAccelerated = false;
                                                } else {
                                                    zIsHardwareAccelerated = true;
                                                }
                                                zZzi = zzi(mediaCodecInfoZzb, str5);
                                                if (i10 >= 29) {
                                                    zIsVendor = mediaCodecInfoZzb.isVendor();
                                                } else {
                                                    strZza = zzfsn.zza(mediaCodecInfoZzb.getName());
                                                    if (strZza.startsWith("omx.google.")) {
                                                        zIsVendor = false;
                                                    } else {
                                                        zIsVendor = false;
                                                    }
                                                }
                                                if (zZze) {
                                                    if (!zZze) {
                                                        if (!zzteVar2.zzb) {
                                                            str4 = name;
                                                            i8 = i11;
                                                            i9 = iZza;
                                                            str3 = str5;
                                                            arrayList.add(zzsr.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                        }
                                                    }
                                                    str4 = name;
                                                    i8 = i11;
                                                    i9 = iZza;
                                                    str3 = str5;
                                                    if (zZze) {
                                                        continue;
                                                    }
                                                } else {
                                                    if (!zZze) {
                                                        if (!zzteVar2.zzb) {
                                                            str4 = name;
                                                            i8 = i11;
                                                            i9 = iZza;
                                                            str3 = str5;
                                                            arrayList.add(zzsr.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                        }
                                                    }
                                                    str4 = name;
                                                    i8 = i11;
                                                    i9 = iZza;
                                                    str3 = str5;
                                                    if (zZze) {
                                                        continue;
                                                    }
                                                }
                                            }
                                        } else if (!zZzc2) {
                                            i10 = zzen.zza;
                                            if (i10 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (zzi(mediaCodecInfoZzb, str5)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zZzi = zzi(mediaCodecInfoZzb, str5);
                                            if (i10 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzfsn.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZze) {
                                                if (!zZze) {
                                                    if (!zzteVar2.zzb) {
                                                        str4 = name;
                                                        i8 = i11;
                                                        i9 = iZza;
                                                        str3 = str5;
                                                        arrayList.add(zzsr.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                    }
                                                }
                                                str4 = name;
                                                i8 = i11;
                                                i9 = iZza;
                                                str3 = str5;
                                                if (zZze) {
                                                    continue;
                                                }
                                            } else {
                                                if (!zZze) {
                                                    if (!zzteVar2.zzb) {
                                                        str4 = name;
                                                        i8 = i11;
                                                        i9 = iZza;
                                                        str3 = str5;
                                                        arrayList.add(zzsr.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                    }
                                                }
                                                str4 = name;
                                                i8 = i11;
                                                i9 = iZza;
                                                str3 = str5;
                                                if (zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                } else if (!zZzc) {
                                    zZzd2 = zztgVar.zzd("secure-playback", str, capabilitiesForType);
                                    zZzc2 = zztgVar.zzc("secure-playback", str, capabilitiesForType);
                                    if (zzteVar2.zzb) {
                                        if (!zZzc2) {
                                            i10 = zzen.zza;
                                            if (i10 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (zzi(mediaCodecInfoZzb, str5)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zZzi = zzi(mediaCodecInfoZzb, str5);
                                            if (i10 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzfsn.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZze) {
                                                if (!zZze) {
                                                    if (!zzteVar2.zzb) {
                                                        str4 = name;
                                                        i8 = i11;
                                                        i9 = iZza;
                                                        str3 = str5;
                                                        arrayList.add(zzsr.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                    }
                                                }
                                                str4 = name;
                                                i8 = i11;
                                                i9 = iZza;
                                                str3 = str5;
                                                if (zZze) {
                                                    continue;
                                                }
                                            } else {
                                                if (!zZze) {
                                                    if (!zzteVar2.zzb) {
                                                        str4 = name;
                                                        i8 = i11;
                                                        i9 = iZza;
                                                        str3 = str5;
                                                        arrayList.add(zzsr.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                    }
                                                }
                                                str4 = name;
                                                i8 = i11;
                                                i9 = iZza;
                                                str3 = str5;
                                                if (zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    } else if (zZzd2) {
                                        zZzd2 = true;
                                        i10 = zzen.zza;
                                        if (i10 >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                        } else if (zzi(mediaCodecInfoZzb, str5)) {
                                            zIsHardwareAccelerated = true;
                                        } else {
                                            zIsHardwareAccelerated = false;
                                        }
                                        zZzi = zzi(mediaCodecInfoZzb, str5);
                                        if (i10 >= 29) {
                                            zIsVendor = mediaCodecInfoZzb.isVendor();
                                        } else {
                                            strZza = zzfsn.zza(mediaCodecInfoZzb.getName());
                                            if (strZza.startsWith("omx.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = false;
                                            }
                                        }
                                        if (zZze) {
                                            if (!zZze) {
                                                if (!zzteVar2.zzb) {
                                                    str4 = name;
                                                    i8 = i11;
                                                    i9 = iZza;
                                                    str3 = str5;
                                                    arrayList.add(zzsr.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                }
                                            }
                                            str4 = name;
                                            i8 = i11;
                                            i9 = iZza;
                                            str3 = str5;
                                            if (zZze) {
                                                continue;
                                            }
                                        } else {
                                            if (!zZze) {
                                                if (!zzteVar2.zzb) {
                                                    str4 = name;
                                                    i8 = i11;
                                                    i9 = iZza;
                                                    str3 = str5;
                                                    arrayList.add(zzsr.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                }
                                            }
                                            str4 = name;
                                            i8 = i11;
                                            i9 = iZza;
                                            str3 = str5;
                                            if (zZze) {
                                                continue;
                                            }
                                        }
                                    }
                                }
                                i8 = i11;
                                i9 = iZza;
                                str3 = str5;
                            } else {
                                i8 = i11;
                                i9 = iZza;
                                str3 = str5;
                            }
                        } else {
                            supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                            length = supportedTypes.length;
                            i7 = 0;
                            while (true) {
                                if (i7 >= length) {
                                    if (!str5.equals("video/dolby-vision")) {
                                        if (!str5.equals("video/mv-hevc")) {
                                            if (!str5.equals("audio/alac")) {
                                                if (!str5.equals("audio/flac")) {
                                                    if (!str5.equals("audio/ac3")) {
                                                        str = null;
                                                        break;
                                                    }
                                                    str = null;
                                                    break;
                                                }
                                                if (!str5.equals("audio/ac3")) {
                                                    str = null;
                                                    break;
                                                }
                                                str = null;
                                                break;
                                            }
                                            if (!str5.equals("audio/flac")) {
                                                if (!str5.equals("audio/ac3")) {
                                                    str = null;
                                                    break;
                                                }
                                                str = null;
                                                break;
                                            }
                                            if (!str5.equals("audio/ac3")) {
                                                str = null;
                                                break;
                                            }
                                            str = null;
                                            break;
                                        }
                                        if ("c2.qti.mvhevc.decoder".equals(name)) {
                                        }
                                        str = "video/x-mvhevc";
                                        break;
                                    }
                                    if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                        if ("OMX.RTK.video.decoder".equals(name)) {
                                        }
                                        str = "video/dv_hevc";
                                        break;
                                    }
                                    str = "video/hevcdv";
                                    break;
                                }
                                str = supportedTypes[i7];
                                if (str.equalsIgnoreCase(str5)) {
                                    break;
                                    break;
                                }
                                i7++;
                            }
                            if (str != null) {
                                capabilitiesForType = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                zZzd = zztgVar.zzd("tunneled-playback", str, capabilitiesForType);
                                zZzc = zztgVar.zzc("tunneled-playback", str, capabilitiesForType);
                                if (zzteVar2.zzc) {
                                    if (!zZzc) {
                                        zZzd2 = zztgVar.zzd("secure-playback", str, capabilitiesForType);
                                        zZzc2 = zztgVar.zzc("secure-playback", str, capabilitiesForType);
                                        if (zzteVar2.zzb) {
                                            if (!zZzc2) {
                                                i10 = zzen.zza;
                                                if (i10 >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                } else if (zzi(mediaCodecInfoZzb, str5)) {
                                                    zIsHardwareAccelerated = true;
                                                } else {
                                                    zIsHardwareAccelerated = false;
                                                }
                                                zZzi = zzi(mediaCodecInfoZzb, str5);
                                                if (i10 >= 29) {
                                                    zIsVendor = mediaCodecInfoZzb.isVendor();
                                                } else {
                                                    strZza = zzfsn.zza(mediaCodecInfoZzb.getName());
                                                    if (strZza.startsWith("omx.google.")) {
                                                        zIsVendor = false;
                                                    } else {
                                                        zIsVendor = false;
                                                    }
                                                }
                                                if (zZze) {
                                                    if (!zZze) {
                                                        if (!zzteVar2.zzb) {
                                                            str4 = name;
                                                            i8 = i11;
                                                            i9 = iZza;
                                                            str3 = str5;
                                                            arrayList.add(zzsr.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                        }
                                                    }
                                                    str4 = name;
                                                    i8 = i11;
                                                    i9 = iZza;
                                                    str3 = str5;
                                                    if (zZze) {
                                                        continue;
                                                    }
                                                } else {
                                                    if (!zZze) {
                                                        if (!zzteVar2.zzb) {
                                                            str4 = name;
                                                            i8 = i11;
                                                            i9 = iZza;
                                                            str3 = str5;
                                                            arrayList.add(zzsr.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                        }
                                                    }
                                                    str4 = name;
                                                    i8 = i11;
                                                    i9 = iZza;
                                                    str3 = str5;
                                                    if (zZze) {
                                                        continue;
                                                    }
                                                }
                                            }
                                        } else if (zZzd2) {
                                            zZzd2 = true;
                                            i10 = zzen.zza;
                                            if (i10 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (zzi(mediaCodecInfoZzb, str5)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zZzi = zzi(mediaCodecInfoZzb, str5);
                                            if (i10 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzfsn.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZze) {
                                                if (!zZze) {
                                                    if (!zzteVar2.zzb) {
                                                        str4 = name;
                                                        i8 = i11;
                                                        i9 = iZza;
                                                        str3 = str5;
                                                        arrayList.add(zzsr.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                    }
                                                }
                                                str4 = name;
                                                i8 = i11;
                                                i9 = iZza;
                                                str3 = str5;
                                                if (zZze) {
                                                    continue;
                                                }
                                            } else {
                                                if (!zZze) {
                                                    if (!zzteVar2.zzb) {
                                                        str4 = name;
                                                        i8 = i11;
                                                        i9 = iZza;
                                                        str3 = str5;
                                                        arrayList.add(zzsr.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                    }
                                                }
                                                str4 = name;
                                                i8 = i11;
                                                i9 = iZza;
                                                str3 = str5;
                                                if (zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                } else if (zZzd) {
                                    zZzd2 = zztgVar.zzd("secure-playback", str, capabilitiesForType);
                                    zZzc2 = zztgVar.zzc("secure-playback", str, capabilitiesForType);
                                    if (zzteVar2.zzb) {
                                        if (!zZzc2) {
                                            i10 = zzen.zza;
                                            if (i10 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (zzi(mediaCodecInfoZzb, str5)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zZzi = zzi(mediaCodecInfoZzb, str5);
                                            if (i10 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzfsn.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZze) {
                                                if (!zZze) {
                                                    if (!zzteVar2.zzb) {
                                                        str4 = name;
                                                        i8 = i11;
                                                        i9 = iZza;
                                                        str3 = str5;
                                                        arrayList.add(zzsr.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                    }
                                                }
                                                str4 = name;
                                                i8 = i11;
                                                i9 = iZza;
                                                str3 = str5;
                                                if (zZze) {
                                                    continue;
                                                }
                                            } else {
                                                if (!zZze) {
                                                    if (!zzteVar2.zzb) {
                                                        str4 = name;
                                                        i8 = i11;
                                                        i9 = iZza;
                                                        str3 = str5;
                                                        arrayList.add(zzsr.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                    }
                                                }
                                                str4 = name;
                                                i8 = i11;
                                                i9 = iZza;
                                                str3 = str5;
                                                if (zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    } else if (zZzd2) {
                                        zZzd2 = true;
                                        i10 = zzen.zza;
                                        if (i10 >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                        } else if (zzi(mediaCodecInfoZzb, str5)) {
                                            zIsHardwareAccelerated = true;
                                        } else {
                                            zIsHardwareAccelerated = false;
                                        }
                                        zZzi = zzi(mediaCodecInfoZzb, str5);
                                        if (i10 >= 29) {
                                            zIsVendor = mediaCodecInfoZzb.isVendor();
                                        } else {
                                            strZza = zzfsn.zza(mediaCodecInfoZzb.getName());
                                            if (strZza.startsWith("omx.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = false;
                                            }
                                        }
                                        if (zZze) {
                                            if (!zZze) {
                                                if (!zzteVar2.zzb) {
                                                    str4 = name;
                                                    i8 = i11;
                                                    i9 = iZza;
                                                    str3 = str5;
                                                    arrayList.add(zzsr.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                }
                                            }
                                            str4 = name;
                                            i8 = i11;
                                            i9 = iZza;
                                            str3 = str5;
                                            if (zZze) {
                                                continue;
                                            }
                                        } else {
                                            if (!zZze) {
                                                if (!zzteVar2.zzb) {
                                                    str4 = name;
                                                    i8 = i11;
                                                    i9 = iZza;
                                                    str3 = str5;
                                                    arrayList.add(zzsr.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                }
                                            }
                                            str4 = name;
                                            i8 = i11;
                                            i9 = iZza;
                                            str3 = str5;
                                            if (zZze) {
                                                continue;
                                            }
                                        }
                                    }
                                }
                                i8 = i11;
                                i9 = iZza;
                                str3 = str5;
                            } else {
                                i8 = i11;
                                i9 = iZza;
                                str3 = str5;
                            }
                        }
                    } else if (i12 > 23 && "audio/eac3-joc".equals(str5) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(name)) {
                        i8 = i11;
                        i9 = iZza;
                        str3 = str5;
                    } else {
                        supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                        length = supportedTypes.length;
                        i7 = 0;
                        while (true) {
                            if (i7 >= length) {
                                if (!str5.equals("video/dolby-vision")) {
                                    if (!str5.equals("video/mv-hevc")) {
                                        if (!str5.equals("audio/alac") && "OMX.lge.alac.decoder".equals(name)) {
                                            str = "audio/x-lg-alac";
                                            break;
                                        }
                                        if (!str5.equals("audio/flac") && "OMX.lge.flac.decoder".equals(name)) {
                                            str = "audio/x-lg-flac";
                                            break;
                                        }
                                        if (!str5.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(name)) {
                                            str = "audio/lg-ac3";
                                            break;
                                        }
                                        str = null;
                                        break;
                                    }
                                    if ("c2.qti.mvhevc.decoder".equals(name) && !"c2.qti.mvhevc.decoder.secure".equals(name)) {
                                        str = null;
                                        break;
                                    }
                                    str = "video/x-mvhevc";
                                    break;
                                }
                                if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                    if ("OMX.RTK.video.decoder".equals(name) && !"OMX.realtek.video.decoder.tunneled".equals(name)) {
                                        str = null;
                                        break;
                                    }
                                    str = "video/dv_hevc";
                                    break;
                                }
                                str = "video/hevcdv";
                                break;
                            }
                            str = supportedTypes[i7];
                            if (str.equalsIgnoreCase(str5)) {
                                break;
                            }
                            i7++;
                        }
                        if (str != null) {
                            try {
                                capabilitiesForType = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                zZzd = zztgVar.zzd("tunneled-playback", str, capabilitiesForType);
                                zZzc = zztgVar.zzc("tunneled-playback", str, capabilitiesForType);
                                if (zzteVar2.zzc) {
                                    if (!zZzc) {
                                        zZzd2 = zztgVar.zzd("secure-playback", str, capabilitiesForType);
                                        zZzc2 = zztgVar.zzc("secure-playback", str, capabilitiesForType);
                                        if (zzteVar2.zzb) {
                                            if (!zZzc2) {
                                                i10 = zzen.zza;
                                                if (i10 >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                } else if (zzi(mediaCodecInfoZzb, str5)) {
                                                    zIsHardwareAccelerated = true;
                                                } else {
                                                    zIsHardwareAccelerated = false;
                                                }
                                                zZzi = zzi(mediaCodecInfoZzb, str5);
                                                if (i10 >= 29) {
                                                    zIsVendor = mediaCodecInfoZzb.isVendor();
                                                } else {
                                                    strZza = zzfsn.zza(mediaCodecInfoZzb.getName());
                                                    if (strZza.startsWith("omx.google.") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google.")) {
                                                        zIsVendor = false;
                                                    } else {
                                                        zIsVendor = true;
                                                    }
                                                }
                                                if (zZze || zzteVar2.zzb != zZzd2) {
                                                    if (!zZze) {
                                                        try {
                                                            if (!zzteVar2.zzb) {
                                                                str4 = name;
                                                                i8 = i11;
                                                                i9 = iZza;
                                                                str3 = str5;
                                                                try {
                                                                    arrayList.add(zzsr.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                                } catch (Exception e7) {
                                                                    e = e7;
                                                                    str2 = str4;
                                                                    if (zzen.zza <= 23 || arrayList.isEmpty()) {
                                                                        zzdq.zzc("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                                        throw e;
                                                                    }
                                                                    zzdq.zzc("MediaCodecUtil", "Skipping codec " + str2 + " (failed to query capabilities)");
                                                                }
                                                            }
                                                        } catch (Exception e8) {
                                                            e = e8;
                                                            str4 = name;
                                                            i8 = i11;
                                                            i9 = iZza;
                                                            str3 = str5;
                                                            str2 = str4;
                                                            if (zzen.zza <= 23) {
                                                            }
                                                            zzdq.zzc("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                            throw e;
                                                        }
                                                    }
                                                    str4 = name;
                                                    i8 = i11;
                                                    i9 = iZza;
                                                    str3 = str5;
                                                    if (zZze && zZzd2) {
                                                        StringBuilder sb = new StringBuilder();
                                                        try {
                                                            sb.append(str4);
                                                            sb.append(".secure");
                                                            str2 = str4;
                                                            try {
                                                                arrayList.add(zzsr.zzc(sb.toString(), str3, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, true));
                                                                break;
                                                            } catch (Exception e9) {
                                                                e = e9;
                                                                if (zzen.zza <= 23) {
                                                                }
                                                                zzdq.zzc("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                                throw e;
                                                            }
                                                        } catch (Exception e10) {
                                                            e = e10;
                                                            str2 = str4;
                                                        }
                                                    }
                                                } else {
                                                    str4 = name;
                                                    i8 = i11;
                                                    i9 = iZza;
                                                    str3 = str5;
                                                    arrayList.add(zzsr.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                }
                                            }
                                        } else if (zZzd2) {
                                            zZzd2 = true;
                                            i10 = zzen.zza;
                                            if (i10 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (zzi(mediaCodecInfoZzb, str5)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zZzi = zzi(mediaCodecInfoZzb, str5);
                                            if (i10 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzfsn.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZze) {
                                                if (!zZze) {
                                                    if (!zzteVar2.zzb) {
                                                        str4 = name;
                                                        i8 = i11;
                                                        i9 = iZza;
                                                        str3 = str5;
                                                        arrayList.add(zzsr.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                    }
                                                }
                                                str4 = name;
                                                i8 = i11;
                                                i9 = iZza;
                                                str3 = str5;
                                                if (zZze) {
                                                    continue;
                                                }
                                            } else {
                                                if (!zZze) {
                                                    if (!zzteVar2.zzb) {
                                                        str4 = name;
                                                        i8 = i11;
                                                        i9 = iZza;
                                                        str3 = str5;
                                                        arrayList.add(zzsr.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                    }
                                                }
                                                str4 = name;
                                                i8 = i11;
                                                i9 = iZza;
                                                str3 = str5;
                                                if (zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                } else if (zZzd) {
                                    zZzd2 = zztgVar.zzd("secure-playback", str, capabilitiesForType);
                                    zZzc2 = zztgVar.zzc("secure-playback", str, capabilitiesForType);
                                    if (zzteVar2.zzb) {
                                        if (!zZzc2) {
                                            i10 = zzen.zza;
                                            if (i10 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (zzi(mediaCodecInfoZzb, str5)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zZzi = zzi(mediaCodecInfoZzb, str5);
                                            if (i10 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzfsn.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZze) {
                                                if (!zZze) {
                                                    if (!zzteVar2.zzb) {
                                                        str4 = name;
                                                        i8 = i11;
                                                        i9 = iZza;
                                                        str3 = str5;
                                                        arrayList.add(zzsr.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                    }
                                                }
                                                str4 = name;
                                                i8 = i11;
                                                i9 = iZza;
                                                str3 = str5;
                                                if (zZze) {
                                                    continue;
                                                }
                                            } else {
                                                if (!zZze) {
                                                    if (!zzteVar2.zzb) {
                                                        str4 = name;
                                                        i8 = i11;
                                                        i9 = iZza;
                                                        str3 = str5;
                                                        arrayList.add(zzsr.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                    }
                                                }
                                                str4 = name;
                                                i8 = i11;
                                                i9 = iZza;
                                                str3 = str5;
                                                if (zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    } else if (zZzd2) {
                                        zZzd2 = true;
                                        i10 = zzen.zza;
                                        if (i10 >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                        } else if (zzi(mediaCodecInfoZzb, str5)) {
                                            zIsHardwareAccelerated = true;
                                        } else {
                                            zIsHardwareAccelerated = false;
                                        }
                                        zZzi = zzi(mediaCodecInfoZzb, str5);
                                        if (i10 >= 29) {
                                            zIsVendor = mediaCodecInfoZzb.isVendor();
                                        } else {
                                            strZza = zzfsn.zza(mediaCodecInfoZzb.getName());
                                            if (strZza.startsWith("omx.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = false;
                                            }
                                        }
                                        if (zZze) {
                                            if (!zZze) {
                                                if (!zzteVar2.zzb) {
                                                    str4 = name;
                                                    i8 = i11;
                                                    i9 = iZza;
                                                    str3 = str5;
                                                    arrayList.add(zzsr.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                }
                                            }
                                            str4 = name;
                                            i8 = i11;
                                            i9 = iZza;
                                            str3 = str5;
                                            if (zZze) {
                                                continue;
                                            }
                                        } else {
                                            if (!zZze) {
                                                if (!zzteVar2.zzb) {
                                                    str4 = name;
                                                    i8 = i11;
                                                    i9 = iZza;
                                                    str3 = str5;
                                                    arrayList.add(zzsr.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                }
                                            }
                                            str4 = name;
                                            i8 = i11;
                                            i9 = iZza;
                                            str3 = str5;
                                            if (zZze) {
                                                continue;
                                            }
                                        }
                                    }
                                }
                                i8 = i11;
                                i9 = iZza;
                                str3 = str5;
                            } catch (Exception e11) {
                                e = e11;
                                str2 = name;
                                i8 = i11;
                                i9 = iZza;
                                str3 = str5;
                            }
                        } else {
                            i8 = i11;
                            i9 = iZza;
                            str3 = str5;
                        }
                    }
                } else {
                    i8 = i11;
                    i9 = iZza;
                    str3 = str5;
                }
                i11 = i8 + 1;
                zzteVar2 = zzteVar;
                str5 = str3;
            }
            return arrayList;
        } catch (Exception e12) {
            throw new zztf(e12, null);
        }
    }

    private static void zzh(List list, final zztj zztjVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zztb
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i7 = zztl.zza;
                zztj zztjVar2 = zztjVar;
                return zztjVar2.zza(obj2) - zztjVar2.zza(obj);
            }
        });
    }

    private static boolean zzi(MediaCodecInfo mediaCodecInfo, String str) {
        if (zzen.zza >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzay.zzh(str)) {
            return true;
        }
        String strZza = zzfsn.zza(mediaCodecInfo.getName());
        if (strZza.startsWith("arc.")) {
            return false;
        }
        if (strZza.startsWith("omx.google.") || strZza.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strZza.startsWith("omx.sec.") && strZza.contains(".sw.")) || strZza.equals("omx.qcom.video.decoder.hevcswvdec") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google.")) {
            return true;
        }
        return (strZza.startsWith("omx.") || strZza.startsWith("c2.")) ? false : true;
    }
}
