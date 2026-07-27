package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class B1 extends T0 implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final Object[] f2602d;

    /* renamed from: e, reason: collision with root package name */
    public static final B1 f2603e;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f2604b;

    /* renamed from: c, reason: collision with root package name */
    public int f2605c;

    static {
        Object[] objArr = new Object[0];
        f2602d = objArr;
        f2603e = new B1(objArr, 0, false);
    }

    public B1(Object[] objArr, int i3, boolean z3) {
        super(z3);
        this.f2604b = objArr;
        this.f2605c = i3;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0202k1
    public final /* bridge */ /* synthetic */ InterfaceC0202k1 a(int i3) {
        if (i3 >= this.f2605c) {
            return new B1(i3 == 0 ? f2602d : Arrays.copyOf(this.f2604b, i3), this.f2605c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int i4;
        b();
        if (i3 < 0 || i3 > (i4 = this.f2605c)) {
            throw new IndexOutOfBoundsException(B0.c.g(i3, this.f2605c, "Index:", ", Size:"));
        }
        int i5 = i3 + 1;
        Object[] objArr = this.f2604b;
        int length = objArr.length;
        if (i4 < length) {
            System.arraycopy(objArr, i3, objArr, i5, i4 - i3);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f2604b, 0, objArr2, 0, i3);
            System.arraycopy(this.f2604b, i3, objArr2, i5, this.f2605c - i3);
            this.f2604b = objArr2;
        }
        this.f2604b[i3] = obj;
        this.f2605c++;
        ((AbstractList) this).modCount++;
    }

    public final void c(int i3) {
        if (i3 < 0 || i3 >= this.f2605c) {
            throw new IndexOutOfBoundsException(B0.c.g(i3, this.f2605c, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        c(i3);
        return this.f2604b[i3];
    }

    @Override // com.google.android.gms.internal.play_billing.T0, java.util.AbstractList, java.util.List
    public final Object remove(int i3) {
        b();
        c(i3);
        Object[] objArr = this.f2604b;
        Object obj = objArr[i3];
        if (i3 < this.f2605c - 1) {
            System.arraycopy(objArr, i3 + 1, objArr, i3, (r2 - i3) - 1);
        }
        this.f2605c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        b();
        c(i3);
        Object[] objArr = this.f2604b;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2605c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i3 = this.f2605c;
        int length = this.f2604b.length;
        if (i3 == length) {
            this.f2604b = Arrays.copyOf(this.f2604b, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.f2604b;
        int i4 = this.f2605c;
        this.f2605c = i4 + 1;
        objArr[i4] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
