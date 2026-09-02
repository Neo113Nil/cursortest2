package f;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class f implements Set {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1025a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f1026b;

    public /* synthetic */ f(a aVar, int i2) {
        this.f1025a = i2;
        this.f1026b = aVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f1025a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f1025a) {
            case 0:
                a aVar = this.f1026b;
                int d2 = aVar.d();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    switch (aVar.f1005d) {
                        case 0:
                            ((b) aVar.f1006e).put(key, value);
                            break;
                        default:
                            ((c) aVar.f1006e).add(key);
                            break;
                    }
                }
                return d2 != aVar.d();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f1025a) {
            case 0:
                this.f1026b.a();
                break;
            default:
                this.f1026b.a();
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f1025a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                a aVar = this.f1026b;
                int e2 = aVar.e(key);
                if (e2 < 0) {
                    return false;
                }
                Object b2 = aVar.b(e2, 1);
                Object value = entry.getValue();
                return b2 == value || (b2 != null && b2.equals(value));
            default:
                return this.f1026b.e(obj) >= 0;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f1025a) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                Map c2 = this.f1026b.c();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!c2.containsKey(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f1025a) {
        }
        return a.h(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        switch (this.f1025a) {
            case 0:
                a aVar = this.f1026b;
                int i2 = 0;
                for (int d2 = aVar.d() - 1; d2 >= 0; d2--) {
                    Object b2 = aVar.b(d2, 0);
                    Object b3 = aVar.b(d2, 1);
                    i2 += (b2 == null ? 0 : b2.hashCode()) ^ (b3 == null ? 0 : b3.hashCode());
                }
                return i2;
            default:
                a aVar2 = this.f1026b;
                int i3 = 0;
                for (int d3 = aVar2.d() - 1; d3 >= 0; d3--) {
                    Object b4 = aVar2.b(d3, 0);
                    i3 += b4 == null ? 0 : b4.hashCode();
                }
                return i3;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f1025a) {
            case 0:
                if (this.f1026b.d() == 0) {
                }
                break;
            default:
                if (this.f1026b.d() == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f1025a) {
            case 0:
                return new g(this.f1026b);
            default:
                return new e(this.f1026b, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f1025a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                a aVar = this.f1026b;
                int e2 = aVar.e(obj);
                if (e2 < 0) {
                    return false;
                }
                aVar.g(e2);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f1025a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map c2 = this.f1026b.c();
                int size = c2.size();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    c2.remove(it.next());
                }
                return size != c2.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f1025a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map c2 = this.f1026b.c();
                int size = c2.size();
                Iterator it = c2.keySet().iterator();
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                    }
                }
                return size != c2.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f1025a) {
        }
        return this.f1026b.d();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f1025a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f1026b.i(objArr, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f1025a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                a aVar = this.f1026b;
                int d2 = aVar.d();
                Object[] objArr = new Object[d2];
                for (int i2 = 0; i2 < d2; i2++) {
                    objArr[i2] = aVar.b(i2, 0);
                }
                return objArr;
        }
    }
}
