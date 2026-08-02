package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.collect.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0960h<K, V> implements W<K, V> {
    public transient Collection<Map.Entry<K, V>> a;
    public transient Set<K> b;
    public transient Collection<V> c;
    public transient Map<K, Collection<V>> d;

    /* renamed from: com.google.common.collect.h$a */
    public class a extends Z<K, V> {
        public final /* synthetic */ AbstractC0958f a;

        public a(AbstractC0958f abstractC0958f) {
            this.a = abstractC0958f;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new C0957e();
        }
    }

    /* renamed from: com.google.common.collect.h$b */
    public class b extends AbstractC0960h<K, V>.a implements Set<Map.Entry<K, V>> {
        @Override // java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            return t0.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            return t0.c(this);
        }
    }

    /* renamed from: com.google.common.collect.h$c */
    public class c extends AbstractCollection<V> {
        public final /* synthetic */ AbstractC0958f a;

        public c(AbstractC0958f abstractC0958f) {
            this.a = abstractC0958f;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            this.a.f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return this.a.d(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new C0956d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.a.f;
        }
    }

    public final boolean c(Object obj, Object obj2) {
        Collection<V> collection = b().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean d(Object obj) {
        Iterator<Collection<V>> it = b().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(String str, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        get(str).addAll(arrayList);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof W) {
            return b().equals(((W) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    @Override // com.google.common.collect.W
    public boolean remove(Object obj, Object obj2) {
        Collection<V> collection = b().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public final String toString() {
        return b().toString();
    }
}
