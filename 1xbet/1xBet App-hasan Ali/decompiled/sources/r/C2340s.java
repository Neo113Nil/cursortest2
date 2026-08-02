package r;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* renamed from: r.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2340s implements Map, j4.a {

    /* renamed from: k, reason: collision with root package name */
    public final C2321G f19041k;

    /* renamed from: l, reason: collision with root package name */
    public C2330h f19042l;

    /* renamed from: m, reason: collision with root package name */
    public C2330h f19043m;

    /* renamed from: n, reason: collision with root package name */
    public V f19044n;

    public C2340s(C2321G c2321g) {
        kotlin.jvm.internal.l.f("parent", c2321g);
        this.f19041k = c2321g;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f19041k.c(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f19041k.d(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C2330h c2330h = this.f19042l;
        if (c2330h != null) {
            return c2330h;
        }
        C2330h c2330h2 = new C2330h(this.f19041k, 0);
        this.f19042l = c2330h2;
        return c2330h2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2340s.class != obj.getClass()) {
            return false;
        }
        return kotlin.jvm.internal.l.a(this.f19041k, ((C2340s) obj).f19041k);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f19041k.g(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f19041k.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f19041k.i();
    }

    @Override // java.util.Map
    public final Set keySet() {
        C2330h c2330h = this.f19043m;
        if (c2330h != null) {
            return c2330h;
        }
        C2330h c2330h2 = new C2330h(this.f19041k, 1);
        this.f19043m = c2330h2;
        return c2330h2;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f19041k.f18932e;
    }

    public final String toString() {
        return this.f19041k.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        V v4 = this.f19044n;
        if (v4 != null) {
            return v4;
        }
        V v5 = new V(this.f19041k);
        this.f19044n = v5;
        return v5;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
