package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzvo {
    private static java.lang.Boolean zza;

    public static int zza(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            return 0;
        }
        java.lang.Boolean bool = zza;
        if (bool == null || !bool.booleanValue()) {
            return com.google.android.gms.internal.ads.zzvn.zza(videoCapabilities, i, i2, d);
        }
        return 0;
    }
}
