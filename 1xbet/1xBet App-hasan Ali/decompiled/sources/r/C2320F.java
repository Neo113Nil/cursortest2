package r;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: r.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2320F implements j4.e, Set, j4.a {

    /* renamed from: k, reason: collision with root package name */
    public final C2318D f18926k;

    /* renamed from: l, reason: collision with root package name */
    public final C2318D f18927l;

    public C2320F(C2318D c2318d) {
        kotlin.jvm.internal.l.f("parent", c2318d);
        this.f18926k = c2318d;
        this.f18927l = c2318d;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f18927l.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        kotlin.jvm.internal.l.f("elements", collection);
        C2318D c2318d = this.f18927l;
        c2318d.getClass();
        int i = c2318d.f18916g;
        for (Object obj : collection) {
            int d5 = c2318d.d(obj);
            c2318d.f18912b[d5] = obj;
            long[] jArr = c2318d.f18913c;
            int i5 = c2318d.f18914d;
            jArr[d5] = (i5 & 2147483647L) | 4611686016279904256L;
            if (i5 != Integer.MAX_VALUE) {
                jArr[i5] = ((2147483647L & d5) << 31) | (jArr[i5] & (-4611686016279904257L));
            }
            c2318d.f18914d = d5;
            if (c2318d.f18915e == Integer.MAX_VALUE) {
                c2318d.f18915e = d5;
            }
        }
        return i != c2318d.f18916g;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f18927l.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f18926k.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        kotlin.jvm.internal.l.f("elements", collection);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f18926k.c(it.next())) {
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
        if (obj == null || C2320F.class != obj.getClass()) {
            return false;
        }
        return kotlin.jvm.internal.l.a(this.f18926k, ((C2320F) obj).f18926k);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f18926k.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f18926k.f18916g == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new V.c(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f18927l.g(obj);
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
        C2318D c2318d = this.f18927l;
        c2318d.getClass();
        int i5 = c2318d.f18916g;
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
            int i10 = c2318d.f;
            int i11 = (i8 >>> 7) & i10;
            while (true) {
                long[] jArr = c2318d.f18911a;
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
                    if (kotlin.jvm.internal.l.a(c2318d.f18912b[i], next)) {
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
                c2318d.h(i);
            }
        }
        return i5 != c2318d.f18916g;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        kotlin.jvm.internal.l.f("elements", collection);
        return this.f18927l.i(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f18926k.f18916g;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.k.a(this);
    }

    public final String toString() {
        return this.f18926k.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        kotlin.jvm.internal.l.f("array", objArr);
        return kotlin.jvm.internal.k.b(this, objArr);
    }
}
