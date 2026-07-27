package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: p.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1158h implements Set {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10212a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1151a f10213b;

    public /* synthetic */ C1158h(C1151a c1151a, int i3) {
        this.f10212a = i3;
        this.f10213b = c1151a;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f10212a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f10212a) {
            case 0:
                C1151a c1151a = this.f10213b;
                int d3 = c1151a.d();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    switch (c1151a.f10183d) {
                        case 0:
                            ((C1152b) c1151a.f10184e).put(key, value);
                            break;
                        default:
                            ((C1153c) c1151a.f10184e).add(key);
                            break;
                    }
                }
                return d3 != c1151a.d();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f10212a) {
            case 0:
                this.f10213b.a();
                break;
            default:
                this.f10213b.a();
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f10212a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C1151a c1151a = this.f10213b;
                int e3 = c1151a.e(key);
                if (e3 < 0) {
                    return false;
                }
                Object b3 = c1151a.b(e3, 1);
                Object value = entry.getValue();
                return b3 == value || (b3 != null && b3.equals(value));
            default:
                return this.f10213b.e(obj) >= 0;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f10212a) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                Map c3 = this.f10213b.c();
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
        switch (this.f10212a) {
        }
        return C1151a.h(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        switch (this.f10212a) {
            case 0:
                C1151a c1151a = this.f10213b;
                int i3 = 0;
                for (int d3 = c1151a.d() - 1; d3 >= 0; d3--) {
                    Object b3 = c1151a.b(d3, 0);
                    Object b4 = c1151a.b(d3, 1);
                    i3 += (b3 == null ? 0 : b3.hashCode()) ^ (b4 == null ? 0 : b4.hashCode());
                }
                return i3;
            default:
                C1151a c1151a2 = this.f10213b;
                int i4 = 0;
                for (int d4 = c1151a2.d() - 1; d4 >= 0; d4--) {
                    Object b5 = c1151a2.b(d4, 0);
                    i4 += b5 == null ? 0 : b5.hashCode();
                }
                return i4;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f10212a) {
            case 0:
                if (this.f10213b.d() == 0) {
                }
                break;
            default:
                if (this.f10213b.d() == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f10212a) {
            case 0:
                return new C1159i(this.f10213b);
            default:
                return new C1157g(this.f10213b, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f10212a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C1151a c1151a = this.f10213b;
                int e3 = c1151a.e(obj);
                if (e3 < 0) {
                    return false;
                }
                c1151a.g(e3);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f10212a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map c3 = this.f10213b.c();
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
        switch (this.f10212a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map c3 = this.f10213b.c();
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
        switch (this.f10212a) {
        }
        return this.f10213b.d();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f10212a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f10213b.i(0, objArr);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f10212a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C1151a c1151a = this.f10213b;
                int d3 = c1151a.d();
                Object[] objArr = new Object[d3];
                for (int i3 = 0; i3 < d3; i3++) {
                    objArr[i3] = c1151a.b(i3, 0);
                }
                return objArr;
        }
    }
}
