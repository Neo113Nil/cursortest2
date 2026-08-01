package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
class zzgvp extends zzgys {
    final transient Map zza;
    final /* synthetic */ zzgwc zzb;

    zzgvp(zzgwc zzgwcVar, Map map) {
        Objects.requireNonNull(zzgwcVar);
        this.zzb = zzgwcVar;
        this.zza = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzgwc zzgwcVar = this.zzb;
        if (this.zza == zzgwcVar.zzo()) {
            zzgwcVar.zzf();
        } else {
            zzgyf.zzb(new zzgvo(this));
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
        Collection collection = (Collection) zzgyt.zza(this.zza, obj);
        if (collection == null) {
            return null;
        }
        return this.zzb.zzb(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzgys, java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.zzb.zzs();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.zza.remove(obj);
        if (collection == null) {
            return null;
        }
        zzgwc zzgwcVar = this.zzb;
        Collection zzc = zzgwcVar.zzc();
        zzc.addAll(collection);
        zzgwcVar.zzq(zzgwcVar.zzp() - collection.size());
        collection.clear();
        return zzc;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zza.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgys
    protected final Set zza() {
        return new zzgvn(this);
    }

    final Map.Entry zzb(Map.Entry entry) {
        Object key = entry.getKey();
        return new AbstractMap.SimpleImmutableEntry(key, this.zzb.zzb(key, (Collection) entry.getValue()));
    }
}
