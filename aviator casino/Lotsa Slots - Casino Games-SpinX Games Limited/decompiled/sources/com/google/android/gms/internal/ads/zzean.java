package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzean extends com.google.android.gms.internal.ads.zzear {
    private final long zza;
    private final int zzb;

    /* synthetic */ zzean(long j, int i, byte[] bArr) {
        this.zza = j;
        this.zzb = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzear) {
            com.google.android.gms.internal.ads.zzear zzearVar = (com.google.android.gms.internal.ads.zzear) obj;
            if (this.zza == zzearVar.zza() && this.zzb == zzearVar.zzb()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.zza;
        return this.zzb ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final java.lang.String toString() {
        long j = this.zza;
        int length = java.lang.String.valueOf(j).length();
        int i = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 34 + java.lang.String.valueOf(i).length() + 1);
        sb.append("OnDeviceStorageKey{id=");
        sb.append(j);
        sb.append(", eventType=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzear
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzear
    public final int zzb() {
        return this.zzb;
    }
}
