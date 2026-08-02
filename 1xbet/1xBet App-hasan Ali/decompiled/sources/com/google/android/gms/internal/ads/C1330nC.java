package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.nC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1330nC extends AbstractC1508rB implements RandomAccess {

    /* renamed from: n, reason: collision with root package name */
    public static final Object[] f14597n;

    /* renamed from: o, reason: collision with root package name */
    public static final C1330nC f14598o;

    /* renamed from: l, reason: collision with root package name */
    public Object[] f14599l;

    /* renamed from: m, reason: collision with root package name */
    public int f14600m;

    static {
        Object[] objArr = new Object[0];
        f14597n = objArr;
        f14598o = new C1330nC(objArr, 0, false);
    }

    public C1330nC(Object[] objArr, int i, boolean z3) {
        super(z3);
        this.f14599l = objArr;
        this.f14600m = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i5;
        c();
        if (i < 0 || i > (i5 = this.f14600m)) {
            throw new IndexOutOfBoundsException(L1.a.k(i, this.f14600m, "Index:", ", Size:"));
        }
        int i6 = i + 1;
        Object[] objArr = this.f14599l;
        int length = objArr.length;
        if (i5 < length) {
            System.arraycopy(objArr, i, objArr, i6, i5 - i);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f14599l, 0, objArr2, 0, i);
            System.arraycopy(this.f14599l, i, objArr2, i6, this.f14600m - i);
            this.f14599l = objArr2;
        }
        this.f14599l[i] = obj;
        this.f14600m++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.UB
    public final /* bridge */ /* synthetic */ UB b(int i) {
        if (i >= this.f14600m) {
            return new C1330nC(i == 0 ? f14597n : Arrays.copyOf(this.f14599l, i), this.f14600m, true);
        }
        throw new IllegalArgumentException();
    }

    public final void d(int i) {
        if (i < 0 || i >= this.f14600m) {
            throw new IndexOutOfBoundsException(L1.a.k(i, this.f14600m, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        d(i);
        return this.f14599l[i];
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1508rB, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        c();
        d(i);
        Object[] objArr = this.f14599l;
        Object obj = objArr[i];
        if (i < this.f14600m - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f14600m--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        c();
        d(i);
        Object[] objArr = this.f14599l;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14600m;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        int i = this.f14600m;
        int length = this.f14599l.length;
        if (i == length) {
            this.f14599l = Arrays.copyOf(this.f14599l, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.f14599l;
        int i5 = this.f14600m;
        this.f14600m = i5 + 1;
        objArr[i5] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
