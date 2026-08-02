package com.google.android.gms.internal.firebase_auth;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzeb<K, V> extends LinkedHashMap<K, V> {
    private static final zzeb zztf;
    private boolean zzmd;

    static {
        zzeb zzebVar = new zzeb();
        zztf = zzebVar;
        zzebVar.zzmd = false;
    }

    private zzeb() {
        this.zzmd = true;
    }

    private zzeb(Map<K, V> map) {
        super(map);
        this.zzmd = true;
    }

    public static <K, V> zzeb<K, V> zzet() {
        return zztf;
    }

    private final void zzev() {
        if (!this.zzmd) {
            throw new UnsupportedOperationException();
        }
    }

    private static int zzh(Object obj) {
        if (obj instanceof byte[]) {
            return zzdd.hashCode((byte[]) obj);
        }
        if (obj instanceof zzde) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzev();
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
        boolean z;
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
                z = false;
                if (!z) {
                    return true;
                }
            }
            z = true;
            if (!z) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i += zzh(entry.getValue()) ^ zzh(entry.getKey());
        }
        return i;
    }

    public final boolean isMutable() {
        return this.zzmd;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        zzev();
        zzdd.checkNotNull(k);
        zzdd.checkNotNull(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        zzev();
        for (K k : map.keySet()) {
            zzdd.checkNotNull(k);
            zzdd.checkNotNull(map.get(k));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        zzev();
        return (V) super.remove(obj);
    }

    public final void zza(zzeb<K, V> zzebVar) {
        zzev();
        if (zzebVar.isEmpty()) {
            return;
        }
        putAll(zzebVar);
    }

    public final void zzbs() {
        this.zzmd = false;
    }

    public final zzeb<K, V> zzeu() {
        return isEmpty() ? new zzeb<>() : new zzeb<>(this);
    }
}
