package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzibv implements java.util.Map.Entry {
    com.google.android.gms.internal.ads.zzibv zza;
    com.google.android.gms.internal.ads.zzibv zzb;
    com.google.android.gms.internal.ads.zzibv zzc;
    com.google.android.gms.internal.ads.zzibv zzd;
    com.google.android.gms.internal.ads.zzibv zze;
    final java.lang.Object zzf;
    final boolean zzg;
    java.lang.Object zzh;
    int zzi;

    zzibv(boolean z) {
        this.zzf = null;
        this.zzg = z;
        this.zze = this;
        this.zzd = this;
    }

    zzibv(boolean z, com.google.android.gms.internal.ads.zzibv zzibvVar, java.lang.Object obj, com.google.android.gms.internal.ads.zzibv zzibvVar2, com.google.android.gms.internal.ads.zzibv zzibvVar3) {
        this.zza = zzibvVar;
        this.zzf = obj;
        this.zzg = z;
        this.zzi = 1;
        this.zzd = zzibvVar2;
        this.zze = zzibvVar3;
        zzibvVar3.zzd = this;
        zzibvVar2.zze = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            java.lang.Object obj2 = this.zzf;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                java.lang.Object obj3 = this.zzh;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.zzf;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.zzh;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        java.lang.Object obj = this.zzf;
        int hashCode = obj == null ? 0 : obj.hashCode();
        java.lang.Object obj2 = this.zzh;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        if (obj == null && !this.zzg) {
            throw new java.lang.NullPointerException("value == null");
        }
        java.lang.Object obj2 = this.zzh;
        this.zzh = obj;
        return obj2;
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.zzf);
        java.lang.String valueOf2 = java.lang.String.valueOf(this.zzh);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 1 + java.lang.String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(com.ironsource.X3.j.b);
        sb.append(valueOf2);
        return sb.toString();
    }
}
