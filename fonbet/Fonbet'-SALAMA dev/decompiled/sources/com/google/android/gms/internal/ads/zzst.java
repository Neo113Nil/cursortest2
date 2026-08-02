package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;

/* loaded from: classes.dex */
final class zzst {
    private static Boolean zza;

    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i7, int i8, double d7) {
        if (zzen.zza < 29) {
            return 0;
        }
        Boolean bool = zza;
        if (bool == null || !bool.booleanValue()) {
            return zzss.zza(videoCapabilities, i7, i8, d7);
        }
        return 0;
    }
}
