package com.google.android.gms.internal.ads;

import R1.r;
import android.media.MediaCodecInfo;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzss {
    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i7, int i8, double d7) {
        List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
            return 0;
        }
        int iZzc = zzc(supportedPerformancePoints, r.e(i7, i8, (int) d7));
        boolean z4 = true;
        if (iZzc == 1 && zzst.zza == null) {
            if (zzen.zza >= 35) {
                z4 = false;
            } else {
                int iZzb = zzb(false);
                int iZzb2 = zzb(true);
                if (iZzb != 0 && (iZzb2 != 0 ? !(iZzb != 2 || iZzb2 != 2) : iZzb == 2)) {
                    z4 = false;
                }
            }
            zzst.zza = Boolean.valueOf(z4);
            if (zzst.zza.booleanValue()) {
                return 0;
            }
        }
        return iZzc;
    }

    private static int zzb(boolean z4) {
        List supportedPerformancePoints;
        try {
            zzx zzxVar = new zzx();
            zzxVar.zzad("video/avc");
            zzz zzzVarZzaj = zzxVar.zzaj();
            if (zzzVarZzaj.zzo != null) {
                List listZze = zztl.zze(zzta.zza, zzzVarZzaj, z4, false);
                for (int i7 = 0; i7 < listZze.size(); i7++) {
                    if (((zzsr) listZze.get(i7)).zzd != null && ((zzsr) listZze.get(i7)).zzd.getVideoCapabilities() != null && (supportedPerformancePoints = ((zzsr) listZze.get(i7)).zzd.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        r.l();
                        return zzc(supportedPerformancePoints, r.d());
                    }
                }
            }
        } catch (zztf unused) {
        }
        return 0;
    }

    private static int zzc(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (r.f(list.get(i7)).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }
}
