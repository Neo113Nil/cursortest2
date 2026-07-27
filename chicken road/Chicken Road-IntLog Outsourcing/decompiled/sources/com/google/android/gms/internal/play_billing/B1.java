package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class B1 extends T0 implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final Object[] f5026d;

    /* renamed from: e, reason: collision with root package name */
    public static final B1 f5027e;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f5028b;

    /* renamed from: c, reason: collision with root package name */
    public int f5029c;

    static {
        Object[] objArr = new Object[0];
        f5026d = objArr;
        f5027e = new B1(objArr, 0, false);
    }

    public B1(Object[] objArr, int i2, boolean z) {
        super(z);
        this.f5028b = objArr;
        this.f5029c = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0346k1
    public final /* bridge */ /* synthetic */ InterfaceC0346k1 a(int i2) {
        if (i2 >= this.f5029c) {
            return new B1(i2 == 0 ? f5026d : Arrays.copyOf(this.f5028b, i2), this.f5029c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        b();
        if (i2 < 0 || i2 > (i3 = this.f5029c)) {
            throw new IndexOutOfBoundsException(B0.o.h("Index:", i2, this.f5029c, ", Size:"));
        }
        int i6 = i2 + 1;
        Object[] objArr = this.f5028b;
        int length = objArr.length;
        if (i3 < length) {
            System.arraycopy(objArr, i2, objArr, i6, i3 - i2);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f5028b, 0, objArr2, 0, i2);
            System.arraycopy(this.f5028b, i2, objArr2, i6, this.f5029c - i2);
            this.f5028b = objArr2;
        }
        this.f5028b[i2] = obj;
        this.f5029c++;
        ((AbstractList) this).modCount++;
    }

    public final void e(int i2) {
        if (i2 < 0 || i2 >= this.f5029c) {
            throw new IndexOutOfBoundsException(B0.o.h("Index:", i2, this.f5029c, ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        e(i2);
        return this.f5028b[i2];
    }

    @Override // com.google.android.gms.internal.play_billing.T0, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        b();
        e(i2);
        Object[] objArr = this.f5028b;
        Object obj = objArr[i2];
        if (i2 < this.f5029c - 1) {
            System.arraycopy(objArr, i2 + 1, objArr, i2, (r2 - i2) - 1);
        }
        this.f5029c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        b();
        e(i2);
        Object[] objArr = this.f5028b;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5029c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i2 = this.f5029c;
        int length = this.f5028b.length;
        if (i2 == length) {
            this.f5028b = Arrays.copyOf(this.f5028b, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.f5028b;
        int i3 = this.f5029c;
        this.f5029c = i3 + 1;
        objArr[i3] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
