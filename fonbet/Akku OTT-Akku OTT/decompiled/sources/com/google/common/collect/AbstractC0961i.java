package com.google.common.collect;

import com.google.common.collect.AbstractC0958f;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.collect.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0961i<K, V> extends AbstractC0958f<K, V> implements o0<K, V> {
    private static final long serialVersionUID = 7431625294878419160L;

    @Override // com.google.common.collect.AbstractC0958f, com.google.common.collect.W
    public final Collection a() {
        return (Set) super.a();
    }

    @Override // com.google.common.collect.W
    public final Map<K, Collection<V>> b() {
        Map<K, Collection<V>> map = this.d;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> g = g();
        this.d = g;
        return g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractC0958f, com.google.common.collect.W
    public final Collection get(Object obj) {
        return (Set) super.get(obj);
    }

    @Override // com.google.common.collect.AbstractC0958f
    public final Collection k(Collection collection, Object obj) {
        return new AbstractC0958f.k(this, obj, (Set) collection);
    }

    public final Set<V> l(K k) {
        return (Set) super.get(k);
    }
}
