package com.google.common.collect;

import com.google.common.collect.AbstractC0958f;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* renamed from: com.google.common.collect.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0955c<K, V> extends AbstractC0958f<K, V> implements Q<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

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
        return (List) super.get((AbstractC0955c<K, V>) obj);
    }

    @Override // com.google.common.collect.AbstractC0958f
    public final Collection k(Collection collection, Object obj) {
        List list = (List) collection;
        return list instanceof RandomAccess ? new AbstractC0958f.C0134f(obj, list, null) : new AbstractC0958f.j(obj, list, null);
    }

    @Override // com.google.common.collect.AbstractC0958f, com.google.common.collect.W
    public final List<V> get(K k) {
        return (List) super.get((AbstractC0955c<K, V>) k);
    }
}
