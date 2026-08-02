package Z;

import P.AbstractC0316s0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class p implements Parcelable, u, List, RandomAccess, j4.c {
    public static final Parcelable.Creator<p> CREATOR = new o(0);

    /* renamed from: k, reason: collision with root package name */
    public t f6218k;

    public p(T.c cVar) {
        f k5 = l.k();
        t tVar = new t(k5.g(), cVar);
        if (!(k5 instanceof a)) {
            tVar.f6243b = new t(1, cVar);
        }
        this.f6218k = tVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        T.c cVar;
        f k5;
        boolean b3;
        do {
            synchronized (q.f6219a) {
                t tVar = this.f6218k;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>", tVar);
                t tVar2 = (t) l.i(tVar);
                i = tVar2.f6239d;
                cVar = tVar2.f6238c;
            }
            kotlin.jvm.internal.l.c(cVar);
            T.c e3 = cVar.e(obj);
            if (e3.equals(cVar)) {
                return false;
            }
            t tVar3 = this.f6218k;
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>", tVar3);
            synchronized (l.f6208c) {
                k5 = l.k();
                b3 = q.b((t) l.x(tVar3, this, k5), i, e3, true);
            }
            l.o(k5, this);
        } while (!b3);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(final int i, final Collection collection) {
        return q.h(this, new i4.c() { // from class: Z.n
            @Override // i4.c
            public final Object c(Object obj) {
                return Boolean.valueOf(((List) obj).addAll(i, collection));
            }
        });
    }

    @Override // Z.u
    public final w c() {
        return this.f6218k;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        f k5;
        t tVar = this.f6218k;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>", tVar);
        synchronized (l.f6208c) {
            k5 = l.k();
            t tVar2 = (t) l.x(tVar, this, k5);
            synchronized (q.f6219a) {
                tVar2.f6238c = T.i.f5597l;
                tVar2.f6239d++;
                tVar2.f6240e++;
            }
        }
        l.o(k5, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return q.e(this).f6238c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return q.e(this).f6238c.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // Z.u
    public final void e(w wVar) {
        wVar.f6243b = this.f6218k;
        this.f6218k = (t) wVar;
    }

    @Override // Z.u
    public final /* synthetic */ w f(w wVar, w wVar2, w wVar3) {
        return null;
    }

    public final void g(int i, int i5) {
        int i6;
        T.c cVar;
        f k5;
        boolean b3;
        do {
            synchronized (q.f6219a) {
                t tVar = this.f6218k;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>", tVar);
                t tVar2 = (t) l.i(tVar);
                i6 = tVar2.f6239d;
                cVar = tVar2.f6238c;
            }
            kotlin.jvm.internal.l.c(cVar);
            T.f g5 = cVar.g();
            g5.subList(i, i5).clear();
            T.c e3 = g5.e();
            if (kotlin.jvm.internal.l.a(e3, cVar)) {
                return;
            }
            t tVar3 = this.f6218k;
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>", tVar3);
            synchronized (l.f6208c) {
                k5 = l.k();
                b3 = q.b((t) l.x(tVar3, this, k5), i6, e3, true);
            }
            l.o(k5, this);
        } while (!b3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return q.e(this).f6238c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return q.e(this).f6238c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return q.e(this).f6238c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return q.e(this).f6238c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new Y3.a(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i5;
        T.c cVar;
        f k5;
        boolean b3;
        Object obj = get(i);
        do {
            synchronized (q.f6219a) {
                t tVar = this.f6218k;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>", tVar);
                t tVar2 = (t) l.i(tVar);
                i5 = tVar2.f6239d;
                cVar = tVar2.f6238c;
            }
            kotlin.jvm.internal.l.c(cVar);
            T.c i6 = cVar.i(i);
            if (i6.equals(cVar)) {
                break;
            }
            t tVar3 = this.f6218k;
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>", tVar3);
            synchronized (l.f6208c) {
                k5 = l.k();
                b3 = q.b((t) l.x(tVar3, this, k5), i5, i6, true);
            }
            l.o(k5, this);
        } while (!b3);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        T.c cVar;
        f k5;
        boolean b3;
        do {
            synchronized (q.f6219a) {
                t tVar = this.f6218k;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>", tVar);
                t tVar2 = (t) l.i(tVar);
                i = tVar2.f6239d;
                cVar = tVar2.f6238c;
            }
            kotlin.jvm.internal.l.c(cVar);
            T.c h3 = cVar.h(new T.b(0, collection));
            if (kotlin.jvm.internal.l.a(h3, cVar)) {
                return false;
            }
            t tVar3 = this.f6218k;
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>", tVar3);
            synchronized (l.f6208c) {
                k5 = l.k();
                b3 = q.b((t) l.x(tVar3, this, k5), i, h3, true);
            }
            l.o(k5, this);
        } while (!b3);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return q.h(this, new T.b(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i5;
        T.c cVar;
        f k5;
        boolean b3;
        Object obj2 = get(i);
        do {
            synchronized (q.f6219a) {
                t tVar = this.f6218k;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>", tVar);
                t tVar2 = (t) l.i(tVar);
                i5 = tVar2.f6239d;
                cVar = tVar2.f6238c;
            }
            kotlin.jvm.internal.l.c(cVar);
            T.c j5 = cVar.j(i, obj);
            if (j5.equals(cVar)) {
                break;
            }
            t tVar3 = this.f6218k;
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>", tVar3);
            synchronized (l.f6208c) {
                k5 = l.k();
                b3 = q.b((t) l.x(tVar3, this, k5), i5, j5, false);
            }
            l.o(k5, this);
        } while (!b3);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return q.e(this).f6238c.c();
    }

    @Override // java.util.List
    public final List subList(int i, int i5) {
        if (!(i >= 0 && i <= i5 && i5 <= size())) {
            AbstractC0316s0.a("fromIndex or toIndex are out of bounds");
        }
        return new x(this, i, i5);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.k.a(this);
    }

    public final String toString() {
        t tVar = this.f6218k;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", tVar);
        return "SnapshotStateList(value=" + ((t) l.i(tVar)).f6238c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        T.c cVar = q.e(this).f6238c;
        int c5 = cVar.c();
        parcel.writeInt(c5);
        for (int i5 = 0; i5 < c5; i5++) {
            parcel.writeValue(cVar.get(i5));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        T.c cVar;
        f k5;
        boolean b3;
        do {
            synchronized (q.f6219a) {
                t tVar = this.f6218k;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>", tVar);
                t tVar2 = (t) l.i(tVar);
                i = tVar2.f6239d;
                cVar = tVar2.f6238c;
            }
            kotlin.jvm.internal.l.c(cVar);
            T.c f = cVar.f(collection);
            if (kotlin.jvm.internal.l.a(f, cVar)) {
                return false;
            }
            t tVar3 = this.f6218k;
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>", tVar3);
            synchronized (l.f6208c) {
                k5 = l.k();
                b3 = q.b((t) l.x(tVar3, this, k5), i, f, true);
            }
            l.o(k5, this);
        } while (!b3);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new Y3.a(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.k.b(this, objArr);
    }

    public p() {
        this(T.i.f5597l);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i5;
        T.c cVar;
        f k5;
        boolean b3;
        do {
            synchronized (q.f6219a) {
                t tVar = this.f6218k;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>", tVar);
                t tVar2 = (t) l.i(tVar);
                i5 = tVar2.f6239d;
                cVar = tVar2.f6238c;
            }
            kotlin.jvm.internal.l.c(cVar);
            T.c d5 = cVar.d(i, obj);
            if (d5.equals(cVar)) {
                return;
            }
            t tVar3 = this.f6218k;
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>", tVar3);
            synchronized (l.f6208c) {
                k5 = l.k();
                b3 = q.b((t) l.x(tVar3, this, k5), i5, d5, true);
            }
            l.o(k5, this);
        } while (!b3);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        T.c cVar;
        f k5;
        boolean b3;
        do {
            synchronized (q.f6219a) {
                t tVar = this.f6218k;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>", tVar);
                t tVar2 = (t) l.i(tVar);
                i = tVar2.f6239d;
                cVar = tVar2.f6238c;
            }
            kotlin.jvm.internal.l.c(cVar);
            int indexOf = cVar.indexOf(obj);
            T.c i5 = indexOf != -1 ? cVar.i(indexOf) : cVar;
            if (i5.equals(cVar)) {
                return false;
            }
            t tVar3 = this.f6218k;
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>", tVar3);
            synchronized (l.f6208c) {
                k5 = l.k();
                b3 = q.b((t) l.x(tVar3, this, k5), i, i5, true);
            }
            l.o(k5, this);
        } while (!b3);
        return true;
    }
}
