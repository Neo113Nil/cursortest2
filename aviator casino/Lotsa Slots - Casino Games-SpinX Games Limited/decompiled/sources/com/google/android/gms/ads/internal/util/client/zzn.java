package com.google.android.gms.ads.internal.util.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
final class zzn extends com.google.android.gms.ads.internal.util.client.zzx {
    private final int zza;
    private final int zzb;
    private final double zzc;
    private final boolean zzd;

    zzn(int i, int i2, double d, boolean z) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = d;
        this.zzd = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.ads.internal.util.client.zzx) {
            com.google.android.gms.ads.internal.util.client.zzx zzxVar = (com.google.android.gms.ads.internal.util.client.zzx) obj;
            if (this.zza == zzxVar.zza() && this.zzb == zzxVar.zzb() && java.lang.Double.doubleToLongBits(this.zzc) == java.lang.Double.doubleToLongBits(zzxVar.zzc()) && this.zzd == zzxVar.zzd()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        double d = this.zzc;
        return ((((int) (java.lang.Double.doubleToLongBits(d) ^ (java.lang.Double.doubleToLongBits(d) >>> 32))) ^ ((((this.zza ^ 1000003) * 1000003) ^ this.zzb) * 1000003)) * 1000003) ^ (true != this.zzd ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        int i = this.zza;
        int length = java.lang.String.valueOf(i).length();
        int i2 = this.zzb;
        int length2 = java.lang.String.valueOf(i2).length();
        double d = this.zzc;
        int length3 = java.lang.String.valueOf(d).length();
        boolean z = this.zzd;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 44 + length2 + 20 + length3 + 25 + java.lang.String.valueOf(z).length() + 1);
        sb.append("PingStrategy{maxAttempts=");
        sb.append(i);
        sb.append(", initialBackoffMs=");
        sb.append(i2);
        sb.append(", backoffMultiplier=");
        sb.append(d);
        sb.append(", bufferAfterMaxAttempts=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final double zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final boolean zzd() {
        return this.zzd;
    }
}
