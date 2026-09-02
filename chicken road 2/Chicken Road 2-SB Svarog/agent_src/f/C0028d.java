package f;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: f.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0028d implements Set {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f503b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C.e f504c;

    public /* synthetic */ C0028d(C.e eVar, int i2) {
        this.f503b = i2;
        this.f504c = eVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f503b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f503b) {
            case 0:
                C.e eVar = this.f504c;
                int i2 = ((C0025a) eVar.f11d).f494d;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    ((C0025a) eVar.f11d).put(entry.getKey(), entry.getValue());
                }
                return i2 != ((C0025a) eVar.f11d).f494d;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f503b) {
            case 0:
                ((C0025a) this.f504c.f11d).clear();
                break;
            default:
                ((C0025a) this.f504c.f11d).clear();
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f503b) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C.e eVar = this.f504c;
                int e2 = ((C0025a) eVar.f11d).e(key);
                if (e2 < 0) {
                    return false;
                }
                Object b2 = eVar.b(e2, 1);
                Object value = entry.getValue();
                return b2 == value || (b2 != null && b2.equals(value));
            default:
                return ((C0025a) this.f504c.f11d).e(obj) >= 0;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f503b) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                C0025a c0025a = (C0025a) this.f504c.f11d;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!c0025a.containsKey(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f503b) {
        }
        return C.e.d(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        switch (this.f503b) {
            case 0:
                C.e eVar = this.f504c;
                int i2 = 0;
                for (int i3 = ((C0025a) eVar.f11d).f494d - 1; i3 >= 0; i3--) {
                    Object b2 = eVar.b(i3, 0);
                    Object b3 = eVar.b(i3, 1);
                    i2 += (b2 == null ? 0 : b2.hashCode()) ^ (b3 == null ? 0 : b3.hashCode());
                }
                return i2;
            default:
                C.e eVar2 = this.f504c;
                int i4 = 0;
                for (int i5 = ((C0025a) eVar2.f11d).f494d - 1; i5 >= 0; i5--) {
                    Object b4 = eVar2.b(i5, 0);
                    i4 += b4 == null ? 0 : b4.hashCode();
                }
                return i4;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f503b) {
            case 0:
                if (((C0025a) this.f504c.f11d).f494d == 0) {
                }
                break;
            default:
                if (((C0025a) this.f504c.f11d).f494d == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f503b) {
            case 0:
                return new C0029e(this.f504c);
            default:
                return new C0027c(this.f504c, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f503b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C.e eVar = this.f504c;
                int e2 = ((C0025a) eVar.f11d).e(obj);
                if (e2 < 0) {
                    return false;
                }
                eVar.c(e2);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f503b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0025a c0025a = (C0025a) this.f504c.f11d;
                int size = c0025a.size();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    c0025a.remove(it.next());
                }
                return size != c0025a.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f503b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0025a c0025a = (C0025a) this.f504c.f11d;
                int size = c0025a.size();
                Iterator it = c0025a.keySet().iterator();
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                    }
                }
                return size != c0025a.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f503b) {
        }
        return ((C0025a) this.f504c.f11d).f494d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f503b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C.e eVar = this.f504c;
                int i2 = ((C0025a) eVar.f11d).f494d;
                Object[] objArr = new Object[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    objArr[i3] = eVar.b(i3, 0);
                }
                return objArr;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f503b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f504c.i(objArr, 0);
        }
    }
}
