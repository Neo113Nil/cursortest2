package com.google.common.collect;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class F<K, V> extends AbstractC0959g<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    public final K a;
    public final V b;

    public F(K k, V v) {
        this.a = k;
        this.b = v;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.b;
    }

    @Override // com.google.common.collect.AbstractC0959g, java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
