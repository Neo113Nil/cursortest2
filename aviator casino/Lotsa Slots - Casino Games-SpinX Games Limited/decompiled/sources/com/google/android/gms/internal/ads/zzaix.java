package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaix implements com.google.android.gms.internal.ads.zzao {
    public final long zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;

    public zzaix(long j, long j2, long j3, long j4, long j5) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = j3;
        this.zzd = j4;
        this.zze = j5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzaix zzaixVar = (com.google.android.gms.internal.ads.zzaix) obj;
            if (this.zza == zzaixVar.zza && this.zzb == zzaixVar.zzb && this.zzc == zzaixVar.zzc && this.zzd == zzaixVar.zzd && this.zze == zzaixVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((kotlin.UByte$$ExternalSyntheticBackport0.m(this.zza) + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.zzb)) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.zzc)) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.zzd)) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.zze);
    }

    public final java.lang.String toString() {
        long j = this.zza;
        int length = java.lang.String.valueOf(j).length();
        long j2 = this.zzb;
        int length2 = java.lang.String.valueOf(j2).length();
        long j3 = this.zzc;
        int length3 = java.lang.String.valueOf(j3).length();
        long j4 = this.zzd;
        int length4 = java.lang.String.valueOf(j4).length();
        long j5 = this.zze;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 54 + length2 + 31 + length3 + 21 + length4 + 12 + java.lang.String.valueOf(j5).length());
        sb.append("Motion photo metadata: photoStartPosition=");
        sb.append(j);
        sb.append(", photoSize=");
        sb.append(j2);
        sb.append(", photoPresentationTimestampUs=");
        sb.append(j3);
        sb.append(", videoStartPosition=");
        sb.append(j4);
        sb.append(", videoSize=");
        sb.append(j5);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public /* synthetic */ void zza(com.google.android.gms.internal.ads.zzam zzamVar) {
        com.google.android.gms.internal.ads.zzao.CC.$default$zza(this, zzamVar);
    }
}
