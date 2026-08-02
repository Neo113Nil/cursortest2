package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class NB extends AbstractC1508rB implements RandomAccess, QB, InterfaceC1240lC {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f10780n;

    /* renamed from: o, reason: collision with root package name */
    public static final NB f10781o;

    /* renamed from: l, reason: collision with root package name */
    public int[] f10782l;

    /* renamed from: m, reason: collision with root package name */
    public int f10783m;

    static {
        int[] iArr = new int[0];
        f10780n = iArr;
        f10781o = new NB(iArr, 0, false);
    }

    public NB(int[] iArr, int i, boolean z3) {
        super(z3);
        this.f10782l = iArr;
        this.f10783m = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i5;
        int intValue = ((Integer) obj).intValue();
        c();
        if (i < 0 || i > (i5 = this.f10783m)) {
            throw new IndexOutOfBoundsException(L1.a.k(i, this.f10783m, "Index:", ", Size:"));
        }
        int i6 = i + 1;
        int[] iArr = this.f10782l;
        int length = iArr.length;
        if (i5 < length) {
            System.arraycopy(iArr, i, iArr, i6, i5 - i);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f10782l, 0, iArr2, 0, i);
            System.arraycopy(this.f10782l, i, iArr2, i6, this.f10783m - i);
            this.f10782l = iArr2;
        }
        this.f10782l[i] = intValue;
        this.f10783m++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1508rB, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        Charset charset = VB.f11871a;
        collection.getClass();
        if (!(collection instanceof NB)) {
            return super.addAll(collection);
        }
        NB nb = (NB) collection;
        int i = nb.f10783m;
        if (i == 0) {
            return false;
        }
        int i5 = this.f10783m;
        if (Integer.MAX_VALUE - i5 < i) {
            throw new OutOfMemoryError();
        }
        int i6 = i5 + i;
        int[] iArr = this.f10782l;
        if (i6 > iArr.length) {
            this.f10782l = Arrays.copyOf(iArr, i6);
        }
        System.arraycopy(nb.f10782l, 0, this.f10782l, this.f10783m, nb.f10783m);
        this.f10783m = i6;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i) {
        g(i);
        return this.f10782l[i];
    }

    @Override // com.google.android.gms.internal.ads.UB
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final NB b(int i) {
        if (i >= this.f10783m) {
            return new NB(i == 0 ? f10780n : Arrays.copyOf(this.f10782l, i), this.f10783m, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1508rB, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NB)) {
            return super.equals(obj);
        }
        NB nb = (NB) obj;
        if (this.f10783m != nb.f10783m) {
            return false;
        }
        int[] iArr = nb.f10782l;
        for (int i = 0; i < this.f10783m; i++) {
            if (this.f10782l[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i) {
        c();
        int i5 = this.f10783m;
        int length = this.f10782l.length;
        if (i5 == length) {
            int[] iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f10782l, 0, iArr, 0, this.f10783m);
            this.f10782l = iArr;
        }
        int[] iArr2 = this.f10782l;
        int i6 = this.f10783m;
        this.f10783m = i6 + 1;
        iArr2[i6] = i;
    }

    public final void g(int i) {
        if (i < 0 || i >= this.f10783m) {
            throw new IndexOutOfBoundsException(L1.a.k(i, this.f10783m, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        g(i);
        return Integer.valueOf(this.f10782l[i]);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1508rB, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i5 = 0; i5 < this.f10783m; i5++) {
            i = (i * 31) + this.f10782l[i5];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f10783m;
        for (int i5 = 0; i5 < i; i5++) {
            if (this.f10782l[i5] == intValue) {
                return i5;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1508rB, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        c();
        g(i);
        int[] iArr = this.f10782l;
        int i5 = iArr[i];
        if (i < this.f10783m - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f10783m--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i5);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i5) {
        c();
        if (i5 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f10782l;
        System.arraycopy(iArr, i5, iArr, i, this.f10783m - i5);
        this.f10783m -= i5 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        c();
        g(i);
        int[] iArr = this.f10782l;
        int i5 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10783m;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Integer) obj).intValue());
        return true;
    }
}
