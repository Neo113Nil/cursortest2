package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzvn {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zza(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        java.lang.Boolean bool;
        java.lang.Boolean bool2;
        java.util.List<android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
            return 0;
        }
        int zzc = zzc(supportedPerformancePoints, new android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, (int) d));
        boolean z = true;
        if (zzc == 1) {
            bool = com.google.android.gms.internal.ads.zzvo.zza;
            if (bool == null) {
                if (android.os.Build.VERSION.SDK_INT < 37) {
                    int zzb = zzb(true);
                    if (android.os.Build.VERSION.SDK_INT < 35) {
                        com.google.android.gms.internal.ads.zzvo.zza = java.lang.Boolean.valueOf(z);
                        bool2 = com.google.android.gms.internal.ads.zzvo.zza;
                        if (bool2.booleanValue()) {
                            return 0;
                        }
                    } else {
                        com.google.android.gms.internal.ads.zzvo.zza = java.lang.Boolean.valueOf(z);
                        bool2 = com.google.android.gms.internal.ads.zzvo.zza;
                        if (bool2.booleanValue()) {
                        }
                    }
                }
                z = false;
                com.google.android.gms.internal.ads.zzvo.zza = java.lang.Boolean.valueOf(z);
                bool2 = com.google.android.gms.internal.ads.zzvo.zza;
                if (bool2.booleanValue()) {
                }
            }
        }
        return zzc;
    }

    private static int zzb(boolean z) {
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities;
        java.util.List<android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
            zztVar.zzo("video/avc");
            com.google.android.gms.internal.ads.zzv zzO = zztVar.zzO();
            if (zzO.zzp != null) {
                java.util.List zzc = com.google.android.gms.internal.ads.zzwf.zzc(com.google.android.gms.internal.ads.zzvv.zzb, zzO, z, false);
                for (int i = 0; i < zzc.size(); i++) {
                    if (((com.google.android.gms.internal.ads.zzvm) zzc.get(i)).zzd != null && (videoCapabilities = ((com.google.android.gms.internal.ads.zzvm) zzc.get(i)).zzd.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        return zzc(supportedPerformancePoints, new android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60));
                    }
                }
            }
        } catch (com.google.android.gms.internal.ads.zzvx unused) {
        }
        return 0;
    }

    private static int zzc(java.util.List list, android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        for (int i = 0; i < list.size(); i++) {
            if (((android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint) list.get(i)).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }
}
