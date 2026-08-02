package com.google.android.gms.internal.ads;

import R1.r;
import android.media.MediaCodecInfo;
import java.util.List;

/* loaded from: classes.dex */
final class zzss {
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i7, int i8, double d7) {
        List supportedPerformancePoints;
        Boolean bool;
        Boolean bool2;
        supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
            return 0;
        }
        int zzc = zzc(supportedPerformancePoints, r.e(i7, i8, (int) d7));
        boolean z4 = true;
        if (zzc == 1) {
            bool = zzst.zza;
            if (bool == null) {
                if (zzen.zza < 35) {
                    int zzb = zzb(false);
                    int zzb2 = zzb(true);
                    if (zzb != 0) {
                        if (zzb2 == 0) {
                        }
                    }
                    zzst.zza = Boolean.valueOf(z4);
                    bool2 = zzst.zza;
                    if (!bool2.booleanValue()) {
                        return 0;
                    }
                }
                z4 = false;
                zzst.zza = Boolean.valueOf(z4);
                bool2 = zzst.zza;
                if (!bool2.booleanValue()) {
                }
            }
        }
        return zzc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        r2 = ((com.google.android.gms.internal.ads.zzsr) r4.get(r1)).zzd.getVideoCapabilities().getSupportedPerformancePoints();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int zzb(boolean z4) {
        List supportedPerformancePoints;
        try {
            zzx zzxVar = new zzx();
            zzxVar.zzad("video/avc");
            zzz zzaj = zzxVar.zzaj();
            if (zzaj.zzo != null) {
                List zze = zztl.zze(zzta.zza, zzaj, z4, false);
                int i7 = 0;
                while (i7 < zze.size()) {
                    if (((zzsr) zze.get(i7)).zzd != null && ((zzsr) zze.get(i7)).zzd.getVideoCapabilities() != null && supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
                        r.l();
                        return zzc(supportedPerformancePoints, r.d());
                    }
                    i7++;
                }
            }
        } catch (zztf unused) {
        }
        return 0;
    }

    private static int zzc(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        boolean covers;
        for (int i7 = 0; i7 < list.size(); i7++) {
            covers = r.f(list.get(i7)).covers(performancePoint);
            if (covers) {
                return 2;
            }
        }
        return 1;
    }
}
