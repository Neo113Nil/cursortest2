package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgto extends com.google.android.gms.internal.ads.zzgth {
    private final java.lang.Object zza;

    zzgto(java.lang.Object obj) {
        this.zza = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.ads.zzgto) {
            return this.zza.equals(((com.google.android.gms.internal.ads.zzgto) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 13);
        sb.append("Optional.of(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgth
    public final java.lang.Object zza(java.lang.Object obj) {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgth
    public final com.google.android.gms.internal.ads.zzgth zzb(com.google.android.gms.internal.ads.zzgta zzgtaVar) {
        java.lang.Object apply = zzgtaVar.apply(this.zza);
        com.google.android.gms.internal.ads.zzgtj.zzk(apply, "the Function passed to Optional.transform() must not return null.");
        return new com.google.android.gms.internal.ads.zzgto(apply);
    }
}
