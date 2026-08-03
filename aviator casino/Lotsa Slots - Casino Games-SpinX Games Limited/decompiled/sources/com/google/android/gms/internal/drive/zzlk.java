package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
public final class zzlk<K, V> extends java.util.LinkedHashMap<K, V> {
    private static final com.google.android.gms.internal.drive.zzlk zzty;
    private boolean zznh;

    private zzlk() {
        this.zznh = true;
    }

    private zzlk(java.util.Map<K, V> map) {
        super(map);
        this.zznh = true;
    }

    public static <K, V> com.google.android.gms.internal.drive.zzlk<K, V> zzdw() {
        return zzty;
    }

    public final void zza(com.google.android.gms.internal.drive.zzlk<K, V> zzlkVar) {
        zzdy();
        if (zzlkVar.isEmpty()) {
            return;
        }
        putAll(zzlkVar);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        return isEmpty() ? java.util.Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzdy();
        super.clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        zzdy();
        com.google.android.gms.internal.drive.zzkm.checkNotNull(k);
        com.google.android.gms.internal.drive.zzkm.checkNotNull(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        zzdy();
        for (K k : map.keySet()) {
            com.google.android.gms.internal.drive.zzkm.checkNotNull(k);
            com.google.android.gms.internal.drive.zzkm.checkNotNull(map.get(k));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(java.lang.Object obj) {
        zzdy();
        return (V) super.remove(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        boolean equals;
        if (!(obj instanceof java.util.Map)) {
            return false;
        }
        java.util.Map map = (java.util.Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (java.util.Map.Entry<K, V> entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            V value = entry.getValue();
            java.lang.Object obj2 = map.get(entry.getKey());
            if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                equals = java.util.Arrays.equals((byte[]) value, (byte[]) obj2);
            } else {
                equals = value.equals(obj2);
            }
            if (!equals) {
                return false;
            }
        }
        return true;
    }

    private static int zzg(java.lang.Object obj) {
        if (obj instanceof byte[]) {
            return com.google.android.gms.internal.drive.zzkm.hashCode((byte[]) obj);
        }
        if (obj instanceof com.google.android.gms.internal.drive.zzkn) {
            throw new java.lang.UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = 0;
        for (java.util.Map.Entry<K, V> entry : entrySet()) {
            i += zzg(entry.getValue()) ^ zzg(entry.getKey());
        }
        return i;
    }

    public final com.google.android.gms.internal.drive.zzlk<K, V> zzdx() {
        return isEmpty() ? new com.google.android.gms.internal.drive.zzlk<>() : new com.google.android.gms.internal.drive.zzlk<>(this);
    }

    public final void zzbp() {
        this.zznh = false;
    }

    public final boolean isMutable() {
        return this.zznh;
    }

    private final void zzdy() {
        if (!this.zznh) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    static {
        com.google.android.gms.internal.drive.zzlk zzlkVar = new com.google.android.gms.internal.drive.zzlk();
        zzty = zzlkVar;
        zzlkVar.zznh = false;
    }
}
