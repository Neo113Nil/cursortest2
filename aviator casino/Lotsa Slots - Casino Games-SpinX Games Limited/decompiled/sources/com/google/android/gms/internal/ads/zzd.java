package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzd {
    public static final com.google.android.gms.internal.ads.zzd zza = new com.google.android.gms.internal.ads.zzd(0, 0, 1, 1, 0, false, true, null);
    private android.media.AudioAttributes zzb;

    static {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        java.lang.Integer.toString(0, 36);
        java.lang.Integer.toString(1, 36);
        java.lang.Integer.toString(2, 36);
        java.lang.Integer.toString(3, 36);
        java.lang.Integer.toString(4, 36);
        java.lang.Integer.toString(5, 36);
        java.lang.Integer.toString(6, 36);
    }

    /* synthetic */ zzd(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, byte[] bArr) {
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -436042064;
    }

    public final android.media.AudioAttributes zza() {
        if (this.zzb == null) {
            android.media.AudioAttributes.Builder usage = new android.media.AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                usage.setAllowedCapturePolicy(1);
                usage.setHapticChannelsMuted(true);
            }
            if (android.os.Build.VERSION.SDK_INT >= 32) {
                usage.setSpatializationBehavior(0);
                usage.setIsContentSpatialized(false);
            }
            this.zzb = usage.build();
        }
        return this.zzb;
    }
}
