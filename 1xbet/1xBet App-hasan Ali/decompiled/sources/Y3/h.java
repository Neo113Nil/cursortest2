package Y3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class h extends X3.h {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6173k;

    /* renamed from: l, reason: collision with root package name */
    public final g f6174l;

    public /* synthetic */ h(g gVar, int i) {
        this.f6173k = i;
        this.f6174l = gVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f6173k) {
            case 0:
                l.f("element", (Map.Entry) obj);
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f6173k) {
            case 0:
                l.f("elements", collection);
                throw new UnsupportedOperationException();
            default:
                l.f("elements", collection);
                throw new UnsupportedOperationException();
        }
    }

    @Override // X3.h
    public final int c() {
        switch (this.f6173k) {
        }
        return this.f6174l.f6168s;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f6173k) {
            case 0:
                this.f6174l.clear();
                break;
            default:
                this.f6174l.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f6173k) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                l.f("element", entry);
                return this.f6174l.e(entry);
            default:
                return this.f6174l.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f6173k) {
            case 0:
                l.f("elements", collection);
                return this.f6174l.d(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f6173k) {
        }
        return this.f6174l.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f6173k) {
            case 0:
                g gVar = this.f6174l;
                gVar.getClass();
                return new d(gVar, 0);
            default:
                g gVar2 = this.f6174l;
                gVar2.getClass();
                return new d(gVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f6173k) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    l.f("element", entry);
                    g gVar = this.f6174l;
                    gVar.getClass();
                    gVar.b();
                    int g5 = gVar.g(entry.getKey());
                    if (g5 >= 0) {
                        Object[] objArr = gVar.f6161l;
                        l.c(objArr);
                        if (l.a(objArr[g5], entry.getValue())) {
                            gVar.k(g5);
                            break;
                        }
                    }
                }
                break;
            default:
                g gVar2 = this.f6174l;
                gVar2.b();
                int g6 = gVar2.g(obj);
                if (g6 >= 0) {
                    gVar2.k(g6);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f6173k) {
            case 0:
                l.f("elements", collection);
                this.f6174l.b();
                break;
            default:
                l.f("elements", collection);
                this.f6174l.b();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f6173k) {
            case 0:
                l.f("elements", collection);
                this.f6174l.b();
                break;
            default:
                l.f("elements", collection);
                this.f6174l.b();
                break;
        }
        return super.retainAll(collection);
    }
}
