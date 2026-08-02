package U;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class e extends AbstractMap implements Map, j4.d {

    /* renamed from: k, reason: collision with root package name */
    public W.b f5816k;

    /* renamed from: l, reason: collision with root package name */
    public n f5817l;

    /* renamed from: m, reason: collision with root package name */
    public Object f5818m;

    /* renamed from: n, reason: collision with root package name */
    public int f5819n;

    /* renamed from: o, reason: collision with root package name */
    public int f5820o;

    public final void a(int i) {
        this.f5820o = i;
        this.f5819n++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f5817l = n.f5834e;
        a(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f5817l.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new g(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f5817l.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new g(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f5818m = null;
        this.f5817l = this.f5817l.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f5818m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [U.c] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        X.i iVar = null;
        X.i iVar2 = map instanceof c ? (c) map : null;
        if (iVar2 == null) {
            e eVar = map instanceof e ? (e) map : null;
            if (eVar != null) {
                iVar = ((X.h) eVar).b();
            }
        } else {
            iVar = iVar2;
        }
        if (iVar == null) {
            super.putAll(map);
            return;
        }
        W.a aVar = new W.a();
        aVar.f5998a = 0;
        int i = this.f5820o;
        n nVar = this.f5817l;
        n nVar2 = iVar.f5811k;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>", nVar2);
        this.f5817l = nVar.m(nVar2, 0, aVar, this);
        int i5 = (iVar.f5812l + i) - aVar.f5998a;
        if (i != i5) {
            a(i5);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.f5820o;
        n o5 = this.f5817l.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (o5 == null) {
            o5 = n.f5834e;
        }
        this.f5817l = o5;
        return i != this.f5820o;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f5820o;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new j(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f5818m = null;
        n n5 = this.f5817l.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (n5 == null) {
            n5 = n.f5834e;
        }
        this.f5817l = n5;
        return this.f5818m;
    }
}
