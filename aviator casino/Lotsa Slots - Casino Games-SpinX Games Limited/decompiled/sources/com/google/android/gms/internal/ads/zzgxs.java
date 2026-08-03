package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
abstract class zzgxs extends java.util.AbstractMap {
    private transient java.util.Set zza;
    private transient java.util.Set zzb;
    private transient java.util.Collection zzc;

    zzgxs() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        java.util.Set set = this.zza;
        if (set != null) {
            return set;
        }
        java.util.Set zza = zza();
        this.zza = zza;
        return zza;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set keySet() {
        java.util.Set set = this.zzb;
        if (set != null) {
            return set;
        }
        java.util.Set zzh = zzh();
        this.zzb = zzh;
        return zzh;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Collection values() {
        java.util.Collection collection = this.zzc;
        if (collection != null) {
            return collection;
        }
        com.google.android.gms.internal.ads.zzgxr zzgxrVar = new com.google.android.gms.internal.ads.zzgxr(this);
        this.zzc = zzgxrVar;
        return zzgxrVar;
    }

    abstract java.util.Set zza();

    java.util.Set zzh() {
        return new com.google.android.gms.internal.ads.zzgxq(this);
    }
}
