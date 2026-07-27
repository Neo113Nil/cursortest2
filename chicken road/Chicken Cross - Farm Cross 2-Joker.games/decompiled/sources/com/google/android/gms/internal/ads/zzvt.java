package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzvt {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Boolean bool;
        Boolean bool2;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
            return 0;
        }
        int zzc = zzc(supportedPerformancePoints, new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, (int) d));
        boolean z = true;
        if (zzc == 1) {
            bool = zzvu.zza;
            if (bool == null) {
                if (Build.VERSION.SDK_INT < 37) {
                    int zzb = zzb(true);
                    if (Build.VERSION.SDK_INT < 35) {
                        zzvu.zza = Boolean.valueOf(z);
                        bool2 = zzvu.zza;
                        if (bool2.booleanValue()) {
                            return 0;
                        }
                    } else {
                        zzvu.zza = Boolean.valueOf(z);
                        bool2 = zzvu.zza;
                        if (bool2.booleanValue()) {
                        }
                    }
                }
                z = false;
                zzvu.zza = Boolean.valueOf(z);
                bool2 = zzvu.zza;
                if (bool2.booleanValue()) {
                }
            }
        }
        return zzc;
    }

    private static int zzb(boolean z) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            zzt zztVar = new zzt();
            zztVar.zzo("video/avc");
            zzv zzQ = zztVar.zzQ();
            if (zzQ.zzp != null) {
                List zzc = zzwl.zzc(zzwb.zzb, zzQ, z, false);
                for (int i = 0; i < zzc.size(); i++) {
                    if (((zzvs) zzc.get(i)).zzd != null && (videoCapabilities = ((zzvs) zzc.get(i)).zzd.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        return zzc(supportedPerformancePoints, new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60));
                    }
                }
            }
        } catch (zzwd unused) {
        }
        return 0;
    }

    private static int zzc(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        for (int i = 0; i < list.size(); i++) {
            if (((MediaCodecInfo.VideoCapabilities.PerformancePoint) list.get(i)).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }
}
