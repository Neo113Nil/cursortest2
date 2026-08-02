package com.google.android.gms.internal.ads;

import android.view.Surface;

/* loaded from: classes.dex */
final class zzaav {
    public static void zza(Surface surface, float f7) {
        try {
            surface.setFrameRate(f7, f7 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e7) {
            zzdq.zzd("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e7);
        }
    }
}
