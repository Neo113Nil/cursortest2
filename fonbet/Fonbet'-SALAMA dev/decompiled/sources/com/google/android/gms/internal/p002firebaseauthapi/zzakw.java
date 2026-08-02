package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzakw<K, V> extends LinkedHashMap<K, V> {
    private static final zzakw<?, ?> zza;
    private boolean zzb;

    static {
        zzakw<?, ?> zzakwVar = new zzakw<>();
        zza = zzakwVar;
        ((zzakw) zzakwVar).zzb = false;
    }

    private zzakw() {
        this.zzb = true;
    }

    private static int zza(Object obj) {
        if (obj instanceof byte[]) {
            return zzakb.zza((byte[]) obj);
        }
        if (obj instanceof zzaka) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private final void zze() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        zze();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005c A[RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z4;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    for (Map.Entry<K, V> entry : entrySet()) {
                        if (map.containsKey(entry.getKey())) {
                            V value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                            }
                        }
                    }
                }
                z4 = false;
                if (!z4) {
                    return true;
                }
            }
            z4 = true;
            if (!z4) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i7 = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i7 += zza(entry.getValue()) ^ zza(entry.getKey());
        }
        return i7;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k7, V v6) {
        zze();
        zzakb.zza(k7);
        zzakb.zza(v6);
        return (V) super.put(k7, v6);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        zze();
        for (K k7 : map.keySet()) {
            zzakb.zza(k7);
            zzakb.zza(map.get(k7));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        zze();
        return (V) super.remove(obj);
    }

    public final zzakw<K, V> zzb() {
        return isEmpty() ? new zzakw<>() : new zzakw<>(this);
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final boolean zzd() {
        return this.zzb;
    }

    private zzakw(Map<K, V> map) {
        super(map);
        this.zzb = true;
    }

    public static <K, V> zzakw<K, V> zza() {
        return (zzakw<K, V>) zza;
    }

    public final void zza(zzakw<K, V> zzakwVar) {
        zze();
        if (zzakwVar.isEmpty()) {
            return;
        }
        putAll(zzakwVar);
    }
}
