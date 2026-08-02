package R;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class c implements List, j4.c {

    /* renamed from: k, reason: collision with root package name */
    public final Object f5101k;

    /* renamed from: l, reason: collision with root package name */
    public final int f5102l;

    /* renamed from: m, reason: collision with root package name */
    public int f5103m;

    public c(int i, int i5, List list) {
        this.f5101k = list;
        this.f5102l = i;
        this.f5103m = i5;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.f5103m;
        this.f5103m = i + 1;
        this.f5101k.add(i, obj);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        this.f5101k.addAll(i + this.f5102l, collection);
        int size = collection.size();
        this.f5103m += size;
        return size > 0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.f5103m - 1;
        int i5 = this.f5102l;
        if (i5 <= i) {
            while (true) {
                this.f5101k.remove(i);
                if (i == i5) {
                    break;
                } else {
                    i--;
                }
            }
        }
        this.f5103m = i5;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.f5103m;
        for (int i5 = this.f5102l; i5 < i; i5++) {
            if (l.a(this.f5101k.get(i5), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object get(int i) {
        f.a(i, this);
        return this.f5101k.get(i + this.f5102l);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.f5103m;
        int i5 = this.f5102l;
        for (int i6 = i5; i6 < i; i6++) {
            if (l.a(this.f5101k.get(i6), obj)) {
                return i6 - i5;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f5103m == this.f5102l;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new d(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.f5103m - 1;
        int i5 = this.f5102l;
        if (i5 > i) {
            return -1;
        }
        while (!l.a(this.f5101k.get(i), obj)) {
            if (i == i5) {
                return -1;
            }
            i--;
        }
        return i - i5;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new d(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.f5103m;
        for (int i5 = this.f5102l; i5 < i; i5++) {
            ?? r22 = this.f5101k;
            if (l.a(r22.get(i5), obj)) {
                r22.remove(i5);
                this.f5103m--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.f5103m;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i != this.f5103m;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.f5103m;
        int i5 = i - 1;
        int i6 = this.f5102l;
        if (i6 <= i5) {
            while (true) {
                ?? r32 = this.f5101k;
                if (!collection.contains(r32.get(i5))) {
                    r32.remove(i5);
                    this.f5103m--;
                }
                if (i5 == i6) {
                    break;
                }
                i5--;
            }
        }
        return i != this.f5103m;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object set(int i, Object obj) {
        f.a(i, this);
        return this.f5101k.set(i + this.f5102l, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f5103m - this.f5102l;
    }

    @Override // java.util.List
    public final List subList(int i, int i5) {
        f.b(i, i5, this);
        return new c(i, i5, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return k.a(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.f5101k.add(i + this.f5102l, obj);
        this.f5103m++;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new d(i, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return k.b(this, objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.f5101k.addAll(this.f5103m, collection);
        int size = collection.size();
        this.f5103m += size;
        return size > 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object remove(int i) {
        f.a(i, this);
        this.f5103m--;
        return this.f5101k.remove(i + this.f5102l);
    }
}
