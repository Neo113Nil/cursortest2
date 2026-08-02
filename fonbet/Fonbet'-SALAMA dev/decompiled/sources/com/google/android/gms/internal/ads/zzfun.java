package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
class zzfun extends zzfxd {
    final transient Map zza;
    final /* synthetic */ zzfva zzb;

    public zzfun(zzfva zzfvaVar, Map map) {
        this.zzb = zzfvaVar;
        this.zza = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map;
        zzfva zzfvaVar = this.zzb;
        Map map2 = this.zza;
        map = zzfvaVar.zza;
        if (map2 == map) {
            zzfvaVar.zzp();
        } else {
            zzfwr.zzb(new zzfum(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.zza;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.zza.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) zzfxe.zza(this.zza, obj);
        if (collection == null) {
            return null;
        }
        return this.zzb.zzc(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzfxd, java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.zzb.zzt();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        int i7;
        Collection collection = (Collection) this.zza.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection zza = this.zzb.zza();
        zza.addAll(collection);
        zzfva zzfvaVar = this.zzb;
        i7 = zzfvaVar.zzb;
        zzfvaVar.zzb = i7 - collection.size();
        collection.clear();
        return zza;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zza.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.zza.toString();
    }

    public final Map.Entry zza(Map.Entry entry) {
        Object key = entry.getKey();
        return new zzfwd(key, this.zzb.zzc(key, (Collection) entry.getValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzfxd
    public final Set zzb() {
        return new zzful(this);
    }
}
