package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzakq {
    public final int zza;
    public final int zzb;
    public final float zzc;

    private zzakq(int i, int i2, float f) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = f;
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzakq zza(int i) {
        int i2 = i >> 13;
        if (i2 == 0) {
            return null;
        }
        return new com.google.android.gms.internal.ads.zzakq(i2, (i >> 10) & 7, ((i & androidx.core.app.FrameMetricsAggregator.EVERY_DURATION) * ((i & 512) != 0 ? -1 : 1)) / 10.0f);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzakq)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzakq zzakqVar = (com.google.android.gms.internal.ads.zzakq) obj;
        return this.zza == zzakqVar.zza && this.zzb == zzakqVar.zzb && java.lang.Float.compare(this.zzc, zzakqVar.zzc) == 0;
    }

    public final int hashCode() {
        return (((this.zza * 31) + this.zzb) * 31) + java.lang.Float.floatToIntBits(this.zzc);
    }

    public final java.lang.String toString() {
        int i = this.zza;
        int length = java.lang.String.valueOf(i).length();
        int i2 = this.zzb;
        int length2 = java.lang.String.valueOf(i2).length();
        float f = this.zzc;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 28 + length2 + 7 + java.lang.String.valueOf(f).length() + 1);
        sb.append("GainField{name=");
        sb.append(i);
        sb.append(", originator=");
        sb.append(i2);
        sb.append(", gain=");
        sb.append(f);
        sb.append("}");
        return sb.toString();
    }
}
