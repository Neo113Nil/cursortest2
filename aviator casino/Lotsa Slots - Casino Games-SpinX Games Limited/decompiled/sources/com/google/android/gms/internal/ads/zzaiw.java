package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaiw implements com.google.android.gms.internal.ads.zzaiv {
    private final long zza;
    private final java.lang.String zzb;

    public zzaiw(long j, long j2, java.lang.String str) {
        this.zza = j;
        this.zzb = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzaiw zzaiwVar = (com.google.android.gms.internal.ads.zzaiw) obj;
            if (this.zza == zzaiwVar.zza && java.util.Objects.equals(this.zzb, zzaiwVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((kotlin.UByte$$ExternalSyntheticBackport0.m(this.zza) + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(-9223372036854775807L)) * 31) + this.zzb.hashCode();
    }

    public final java.lang.String toString() {
        long j = this.zza;
        java.lang.Object valueOf = j == -9223372036854775807L ? "UNSET" : java.lang.Long.valueOf(j);
        java.lang.String str = this.zzb;
        java.lang.String obj = valueOf.toString();
        int length = obj.length();
        java.lang.String concat = ", title=".concat(str);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 21 + concat.length());
        sb.append("Chapter: startTimeMs=");
        sb.append(obj);
        sb.append("");
        sb.append(concat);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public /* synthetic */ void zza(com.google.android.gms.internal.ads.zzam zzamVar) {
        com.google.android.gms.internal.ads.zzao.CC.$default$zza(this, zzamVar);
    }
}
