package com.google.mlkit.common.sdkinternal;

/* loaded from: classes9.dex */
public abstract class LazyInstanceMap<K, V> {
    private final java.util.Map zza = new java.util.HashMap();

    protected abstract V create(K k);

    public V get(K k) {
        synchronized (this.zza) {
            if (this.zza.containsKey(k)) {
                return (V) this.zza.get(k);
            }
            V create = create(k);
            this.zza.put(k, create);
            return create;
        }
    }
}
