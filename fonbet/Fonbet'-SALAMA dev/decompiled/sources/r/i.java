package r;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class i implements Set {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15994a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q3.d f15995b;

    public /* synthetic */ i(Q3.d dVar, int i7) {
        this.f15994a = i7;
        this.f15995b = dVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f15994a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f15994a) {
            case 0:
                Q3.d dVar = this.f15995b;
                int d7 = dVar.d();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    dVar.g(entry.getKey(), entry.getValue());
                }
                return d7 != dVar.d();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f15994a) {
            case 0:
                this.f15995b.a();
                break;
            default:
                this.f15995b.a();
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f15994a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Q3.d dVar = this.f15995b;
                int e7 = dVar.e(key);
                if (e7 < 0) {
                    return false;
                }
                Object b7 = dVar.b(e7, 1);
                Object value = entry.getValue();
                return b7 == value || (b7 != null && b7.equals(value));
            default:
                return this.f15995b.e(obj) >= 0;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f15994a) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                Map c3 = this.f15995b.c();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!c3.containsKey(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f15994a) {
        }
        return Q3.d.j(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        switch (this.f15994a) {
            case 0:
                Q3.d dVar = this.f15995b;
                int i7 = 0;
                for (int d7 = dVar.d() - 1; d7 >= 0; d7--) {
                    Object b7 = dVar.b(d7, 0);
                    Object b8 = dVar.b(d7, 1);
                    i7 += (b7 == null ? 0 : b7.hashCode()) ^ (b8 == null ? 0 : b8.hashCode());
                }
                return i7;
            default:
                Q3.d dVar2 = this.f15995b;
                int i8 = 0;
                for (int d8 = dVar2.d() - 1; d8 >= 0; d8--) {
                    Object b9 = dVar2.b(d8, 0);
                    i8 += b9 == null ? 0 : b9.hashCode();
                }
                return i8;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f15994a) {
            case 0:
                if (this.f15995b.d() == 0) {
                }
                break;
            default:
                if (this.f15995b.d() == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f15994a) {
            case 0:
                return new j(this.f15995b);
            default:
                return new h(this.f15995b, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f15994a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Q3.d dVar = this.f15995b;
                int e7 = dVar.e(obj);
                if (e7 < 0) {
                    return false;
                }
                dVar.h(e7);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f15994a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map c3 = this.f15995b.c();
                int size = c3.size();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    c3.remove(it.next());
                }
                return size != c3.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f15994a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map c3 = this.f15995b.c();
                int size = c3.size();
                Iterator it = c3.keySet().iterator();
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                    }
                }
                return size != c3.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f15994a) {
        }
        return this.f15995b.d();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f15994a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f15995b.q(0, objArr);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f15994a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Q3.d dVar = this.f15995b;
                int d7 = dVar.d();
                Object[] objArr = new Object[d7];
                for (int i7 = 0; i7 < d7; i7++) {
                    objArr[i7] = dVar.b(i7, 0);
                }
                return objArr;
        }
    }
}
