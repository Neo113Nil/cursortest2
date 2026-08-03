package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgb implements com.google.android.gms.internal.ads.zzao {
    public final long zza;
    public final long zzb;
    public final long zzc;

    public zzgb(long j, long j2, long j3) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = j3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzgb)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzgb zzgbVar = (com.google.android.gms.internal.ads.zzgb) obj;
        return this.zza == zzgbVar.zza && this.zzb == zzgbVar.zzb && this.zzc == zzgbVar.zzc;
    }

    public final int hashCode() {
        return ((((kotlin.UByte$$ExternalSyntheticBackport0.m(this.zza) + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.zzb)) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.zzc);
    }

    public final java.lang.String toString() {
        long j = this.zza;
        int length = java.lang.String.valueOf(j).length();
        long j2 = this.zzb;
        int length2 = java.lang.String.valueOf(j2).length();
        long j3 = this.zzc;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 48 + length2 + 12 + java.lang.String.valueOf(j3).length());
        sb.append("Mp4Timestamp: creation time=");
        sb.append(j);
        sb.append(", modification time=");
        sb.append(j2);
        sb.append(", timescale=");
        sb.append(j3);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public /* synthetic */ void zza(com.google.android.gms.internal.ads.zzam zzamVar) {
        com.google.android.gms.internal.ads.zzao.CC.$default$zza(this, zzamVar);
    }
}
