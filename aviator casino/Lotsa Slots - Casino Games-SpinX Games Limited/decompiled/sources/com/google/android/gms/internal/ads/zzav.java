package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzav {
    public static final com.google.android.gms.internal.ads.zzav zza = new com.google.android.gms.internal.ads.zzav(1.0f, 1.0f);
    public final float zzb;
    public final float zzc;
    private final int zzd;

    static {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        java.lang.Integer.toString(0, 36);
        java.lang.Integer.toString(1, 36);
    }

    public zzav(float f, float f2) {
        com.google.android.gms.internal.ads.zzgtj.zza(f > 0.0f);
        com.google.android.gms.internal.ads.zzgtj.zza(f2 > 0.0f);
        this.zzb = f;
        this.zzc = f2;
        this.zzd = java.lang.Math.round(f * 1000.0f);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzav zzavVar = (com.google.android.gms.internal.ads.zzav) obj;
            if (this.zzb == zzavVar.zzb && this.zzc == zzavVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((java.lang.Float.floatToRawIntBits(this.zzb) + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + java.lang.Float.floatToRawIntBits(this.zzc);
    }

    public final java.lang.String toString() {
        java.lang.Object[] objArr = {java.lang.Float.valueOf(this.zzb), java.lang.Float.valueOf(this.zzc)};
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        return java.lang.String.format(java.util.Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public final long zza(long j) {
        return j * this.zzd;
    }
}
