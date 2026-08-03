package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
abstract class zzgvf<K, V> implements com.google.android.gms.internal.ads.zzgxu<K, V> {
    private transient java.util.Set zza;
    private transient java.util.Collection zzb;
    private transient java.util.Map zzc;

    zzgvf() {
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzgxu) {
            return zzu().equals(((com.google.android.gms.internal.ads.zzgxu) obj).zzu());
        }
        return false;
    }

    public final int hashCode() {
        return zzu().hashCode();
    }

    public final java.lang.String toString() {
        return zzu().toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgxu
    public boolean zze(java.lang.Object obj, java.lang.Object obj2) {
        throw null;
    }

    abstract java.util.Set zzh();

    abstract java.util.Collection zzj();

    java.util.Iterator zzk() {
        throw null;
    }

    abstract java.util.Map zzl();

    public boolean zzr(java.lang.Object obj) {
        java.util.Iterator<V> it = zzu().values().iterator();
        while (it.hasNext()) {
            if (((java.util.Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public final java.util.Set zzs() {
        java.util.Set set = this.zza;
        if (set != null) {
            return set;
        }
        java.util.Set zzh = zzh();
        this.zza = zzh;
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzgxu
    public java.util.Collection zzt() {
        java.util.Collection collection = this.zzb;
        if (collection != null) {
            return collection;
        }
        java.util.Collection zzj = zzj();
        this.zzb = zzj;
        return zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzgxu
    public java.util.Map zzu() {
        java.util.Map map = this.zzc;
        if (map != null) {
            return map;
        }
        java.util.Map zzl = zzl();
        this.zzc = zzl;
        return zzl;
    }
}
