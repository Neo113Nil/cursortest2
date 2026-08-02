package r;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class J implements j4.e, Set, j4.a {

    /* renamed from: k, reason: collision with root package name */
    public final C2322H f18950k;

    /* renamed from: l, reason: collision with root package name */
    public final C2322H f18951l;

    public J(C2322H c2322h) {
        this.f18950k = c2322h;
        this.f18951l = c2322h;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f18951l.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        kotlin.jvm.internal.l.f("elements", collection);
        C2322H c2322h = this.f18951l;
        int i = c2322h.f18936d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c2322h.i(it.next());
        }
        return i != c2322h.f18936d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f18951l.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f18950k.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        kotlin.jvm.internal.l.f("elements", collection);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f18950k.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || J.class != obj.getClass()) {
            return false;
        }
        return kotlin.jvm.internal.l.a(this.f18950k, ((J) obj).f18950k);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f18950k.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f18950k.g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new V.c(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f18951l.k(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0093, code lost:
    
        if (((r5 & ((~r5) << 6)) & r12) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
    
        r14 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(Collection collection) {
        int i;
        kotlin.jvm.internal.l.f("elements", collection);
        C2322H c2322h = this.f18951l;
        c2322h.getClass();
        int i5 = c2322h.f18936d;
        Iterator it = collection.iterator();
        while (true) {
            int i6 = 1;
            int i7 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int hashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i8 = hashCode ^ (hashCode << 16);
            int i9 = i8 & 127;
            int i10 = c2322h.f18935c;
            int i11 = (i8 >>> 7) & i10;
            while (true) {
                long[] jArr = c2322h.f18933a;
                int i12 = i11 >> 3;
                int i13 = (i11 & 7) << 3;
                int i14 = i6;
                int i15 = i7;
                long j5 = (((-i13) >> 63) & (jArr[i12 + i6] << (64 - i13))) | (jArr[i12] >>> i13);
                long j6 = (i9 * 72340172838076673L) ^ j5;
                long j7 = -9187201950435737472L;
                long j8 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j8 == 0) {
                        break;
                    }
                    i = ((Long.numberOfTrailingZeros(j8) >> 3) + i11) & i10;
                    long j9 = j7;
                    if (kotlin.jvm.internal.l.a(c2322h.f18934b[i], next)) {
                        break;
                    }
                    j8 &= j8 - 1;
                    j7 = j9;
                }
                i7 = i15 + 8;
                i11 = (i11 + i7) & i10;
                i6 = i14;
            }
            if (i >= 0) {
                c2322h.l(i);
            }
        }
        return i5 != c2322h.f18936d;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        boolean z3;
        kotlin.jvm.internal.l.f("elements", collection);
        C2322H c2322h = this.f18951l;
        c2322h.getClass();
        Object[] objArr = c2322h.f18934b;
        int i = c2322h.f18936d;
        long[] jArr = c2322h.f18933a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j5) < 128) {
                            int i8 = (i5 << 3) + i7;
                            if (!X3.m.V(collection, objArr[i8])) {
                                c2322h.l(i8);
                            }
                        }
                        j5 >>= 8;
                    }
                    z3 = false;
                    if (i6 != 8) {
                        break;
                    }
                } else {
                    z3 = false;
                }
                if (i5 == length) {
                    break;
                }
                i5++;
            }
        } else {
            z3 = false;
        }
        if (i != c2322h.f18936d) {
            return true;
        }
        return z3;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f18950k.f18936d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.k.a(this);
    }

    public final String toString() {
        return this.f18950k.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        kotlin.jvm.internal.l.f("array", objArr);
        return kotlin.jvm.internal.k.b(this, objArr);
    }
}
