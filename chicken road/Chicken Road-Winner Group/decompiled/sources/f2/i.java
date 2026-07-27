package f2;

import e2.AbstractC0287b;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class i extends AbstractC0287b implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final i f4924b;

    /* renamed from: a, reason: collision with root package name */
    public final f f4925a;

    static {
        f fVar = f.f4908n;
        f4924b = new i(f.f4908n);
    }

    public i(f backing) {
        j.e(backing, "backing");
        this.f4925a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f4925a.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        j.e(elements, "elements");
        this.f4925a.b();
        return super.addAll(elements);
    }

    @Override // e2.AbstractC0287b
    public final int b() {
        return this.f4925a.f4916i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f4925a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f4925a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f4925a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        f fVar = this.f4925a;
        fVar.getClass();
        return new d(fVar, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        f fVar = this.f4925a;
        fVar.b();
        int g3 = fVar.g(obj);
        if (g3 < 0) {
            return false;
        }
        fVar.k(g3);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        j.e(elements, "elements");
        this.f4925a.b();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        j.e(elements, "elements");
        this.f4925a.b();
        return super.retainAll(elements);
    }
}
