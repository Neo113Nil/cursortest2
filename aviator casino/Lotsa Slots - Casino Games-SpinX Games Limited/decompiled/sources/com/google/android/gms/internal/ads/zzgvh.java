package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgvh extends com.google.android.gms.internal.ads.zzgyg implements java.io.Serializable {
    final com.google.android.gms.internal.ads.zzgta zza;
    final com.google.android.gms.internal.ads.zzgyg zzb;

    zzgvh(com.google.android.gms.internal.ads.zzgta zzgtaVar, com.google.android.gms.internal.ads.zzgyg zzgygVar) {
        this.zza = zzgtaVar;
        this.zzb = zzgygVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyg, java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.ads.zzgta zzgtaVar = this.zza;
        return this.zzb.compare(zzgtaVar.apply(obj), zzgtaVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzgvh) {
            com.google.android.gms.internal.ads.zzgvh zzgvhVar = (com.google.android.gms.internal.ads.zzgvh) obj;
            if (this.zza.equals(zzgvhVar.zza) && this.zzb.equals(zzgvhVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.zza, this.zzb);
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zzb.toString();
        int length = obj.length();
        java.lang.String obj2 = this.zza.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 12 + obj2.length() + 1);
        sb.append(obj);
        sb.append(".onResultOf(");
        sb.append(obj2);
        sb.append(")");
        return sb.toString();
    }
}
