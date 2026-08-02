package com.google.android.gms.internal.p002firebaseauthapi;

import io.sentry.rrweb.RRWebVideoEvent;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes.dex */
public abstract class zzap<K, V> implements Serializable, Map<K, V> {
    private transient zzau<Map.Entry<K, V>> zza;
    private transient zzau<K> zzb;
    private transient zzak<V> zzc;

    public static <K, V> zzap<K, V> zza(Map<? extends K, ? extends V> map) {
        if ((map instanceof zzap) && !(map instanceof SortedMap)) {
            zzap<K, V> zzapVar = (zzap) map;
            zzapVar.zzd();
            return zzapVar;
        }
        Set<Map.Entry<? extends K, ? extends V>> entrySet = map.entrySet();
        zzas zzasVar = new zzas(entrySet != null ? entrySet.size() : 4);
        zzasVar.zza(entrySet);
        return zzasVar.zza();
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return ((zzak) values()).contains(obj);
    }

    @Override // java.util.Map
    public /* synthetic */ Set entrySet() {
        zzau<Map.Entry<K, V>> zzauVar = this.zza;
        if (zzauVar != null) {
            return zzauVar;
        }
        zzau<Map.Entry<K, V>> zzb = zzb();
        this.zza = zzb;
        return zzb;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v6) {
        V v7 = get(obj);
        return v7 != null ? v7 : v6;
    }

    @Override // java.util.Map
    public int hashCode() {
        return zzaz.zza((zzau) entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public /* synthetic */ Set keySet() {
        zzau<K> zzauVar = this.zzb;
        if (zzauVar != null) {
            return zzauVar;
        }
        zzau<K> zzc = zzc();
        this.zzb = zzc;
        return zzc;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k7, V v6) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        int size = size();
        zzai.zza(size, RRWebVideoEvent.JsonKeys.SIZE);
        StringBuilder sb = new StringBuilder((int) Math.min(size << 3, 1073741824L));
        sb.append('{');
        boolean z4 = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z4) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z4 = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public /* synthetic */ Collection values() {
        zzak<V> zzakVar = this.zzc;
        if (zzakVar != null) {
            return zzakVar;
        }
        zzak<V> zza = zza();
        this.zzc = zza;
        return zza;
    }

    public abstract zzak<V> zza();

    public abstract zzau<Map.Entry<K, V>> zzb();

    public abstract zzau<K> zzc();

    public abstract boolean zzd();
}
