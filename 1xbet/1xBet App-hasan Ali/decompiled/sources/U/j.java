package U;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j extends AbstractCollection implements Collection, j4.b {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5829k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f5830l;

    public /* synthetic */ j(int i, Object obj) {
        this.f5829k = i;
        this.f5830l = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f5829k) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.f5829k) {
            case 1:
                kotlin.jvm.internal.l.f("elements", collection);
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f5829k) {
            case 0:
                ((e) this.f5830l).clear();
                break;
            default:
                ((Y3.g) this.f5830l).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f5829k) {
            case 0:
                return ((e) this.f5830l).containsValue(obj);
            default:
                return ((Y3.g) this.f5830l).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f5829k) {
            case 1:
                return ((Y3.g) this.f5830l).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f5829k) {
            case 0:
                o[] oVarArr = new o[8];
                for (int i = 0; i < 8; i++) {
                    oVarArr[i] = new p(2);
                }
                return new i((e) this.f5830l, oVarArr);
            default:
                Y3.g gVar = (Y3.g) this.f5830l;
                gVar.getClass();
                return new Y3.d(gVar, 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f5829k) {
            case 1:
                Y3.g gVar = (Y3.g) this.f5830l;
                gVar.b();
                int h3 = gVar.h(obj);
                if (h3 < 0) {
                    return false;
                }
                gVar.k(h3);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f5829k) {
            case 1:
                kotlin.jvm.internal.l.f("elements", collection);
                ((Y3.g) this.f5830l).b();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f5829k) {
            case 1:
                kotlin.jvm.internal.l.f("elements", collection);
                ((Y3.g) this.f5830l).b();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f5829k) {
            case 0:
                e eVar = (e) this.f5830l;
                eVar.getClass();
                return eVar.f5820o;
            default:
                return ((Y3.g) this.f5830l).f6168s;
        }
    }
}
