package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.bC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0794bC extends AbstractC1508rB implements RandomAccess, TB, InterfaceC1240lC {

    /* renamed from: n, reason: collision with root package name */
    public static final long[] f12776n;

    /* renamed from: o, reason: collision with root package name */
    public static final C0794bC f12777o;

    /* renamed from: l, reason: collision with root package name */
    public long[] f12778l;

    /* renamed from: m, reason: collision with root package name */
    public int f12779m;

    static {
        long[] jArr = new long[0];
        f12776n = jArr;
        f12777o = new C0794bC(jArr, 0, false);
    }

    public C0794bC(long[] jArr, int i, boolean z3) {
        super(z3);
        this.f12778l = jArr;
        this.f12779m = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i5;
        long longValue = ((Long) obj).longValue();
        c();
        if (i < 0 || i > (i5 = this.f12779m)) {
            throw new IndexOutOfBoundsException(L1.a.k(i, this.f12779m, "Index:", ", Size:"));
        }
        int i6 = i + 1;
        long[] jArr = this.f12778l;
        int length = jArr.length;
        if (i5 < length) {
            System.arraycopy(jArr, i, jArr, i6, i5 - i);
        } else {
            long[] jArr2 = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f12778l, 0, jArr2, 0, i);
            System.arraycopy(this.f12778l, i, jArr2, i6, this.f12779m - i);
            this.f12778l = jArr2;
        }
        this.f12778l[i] = longValue;
        this.f12779m++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1508rB, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        Charset charset = VB.f11871a;
        collection.getClass();
        if (!(collection instanceof C0794bC)) {
            return super.addAll(collection);
        }
        C0794bC c0794bC = (C0794bC) collection;
        int i = c0794bC.f12779m;
        if (i == 0) {
            return false;
        }
        int i5 = this.f12779m;
        if (Integer.MAX_VALUE - i5 < i) {
            throw new OutOfMemoryError();
        }
        int i6 = i5 + i;
        long[] jArr = this.f12778l;
        if (i6 > jArr.length) {
            this.f12778l = Arrays.copyOf(jArr, i6);
        }
        System.arraycopy(c0794bC.f12778l, 0, this.f12778l, this.f12779m, c0794bC.f12779m);
        this.f12779m = i6;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final long d(int i) {
        g(i);
        return this.f12778l[i];
    }

    @Override // com.google.android.gms.internal.ads.UB
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final C0794bC b(int i) {
        if (i >= this.f12779m) {
            return new C0794bC(i == 0 ? f12776n : Arrays.copyOf(this.f12778l, i), this.f12779m, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1508rB, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0794bC)) {
            return super.equals(obj);
        }
        C0794bC c0794bC = (C0794bC) obj;
        if (this.f12779m != c0794bC.f12779m) {
            return false;
        }
        long[] jArr = c0794bC.f12778l;
        for (int i = 0; i < this.f12779m; i++) {
            if (this.f12778l[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void f(long j5) {
        c();
        int i = this.f12779m;
        int length = this.f12778l.length;
        if (i == length) {
            long[] jArr = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f12778l, 0, jArr, 0, this.f12779m);
            this.f12778l = jArr;
        }
        long[] jArr2 = this.f12778l;
        int i5 = this.f12779m;
        this.f12779m = i5 + 1;
        jArr2[i5] = j5;
    }

    public final void g(int i) {
        if (i < 0 || i >= this.f12779m) {
            throw new IndexOutOfBoundsException(L1.a.k(i, this.f12779m, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        g(i);
        return Long.valueOf(this.f12778l[i]);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1508rB, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i5 = 0; i5 < this.f12779m; i5++) {
            long j5 = this.f12778l[i5];
            Charset charset = VB.f11871a;
            i = (i * 31) + ((int) (j5 ^ (j5 >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f12779m;
        for (int i5 = 0; i5 < i; i5++) {
            if (this.f12778l[i5] == longValue) {
                return i5;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1508rB, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        c();
        g(i);
        long[] jArr = this.f12778l;
        long j5 = jArr[i];
        if (i < this.f12779m - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.f12779m--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j5);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i5) {
        c();
        if (i5 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f12778l;
        System.arraycopy(jArr, i5, jArr, i, this.f12779m - i5);
        this.f12779m -= i5 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        c();
        g(i);
        long[] jArr = this.f12778l;
        long j5 = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12779m;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Long) obj).longValue());
        return true;
    }
}
