package com.google.crypto.tink.shaded.protobuf;

import W5.AbstractC0486a1;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class a0 extends AbstractC0866b implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final a0 f11751d;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f11752b;

    /* renamed from: c, reason: collision with root package name */
    public int f11753c;

    static {
        a0 a0Var = new a0(new Object[0], 0);
        f11751d = a0Var;
        a0Var.f11754a = false;
    }

    public a0(Object[] objArr, int i7) {
        this.f11752b = objArr;
        this.f11753c = i7;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0889z
    public final InterfaceC0889z a(int i7) {
        if (i7 >= this.f11753c) {
            return new a0(Arrays.copyOf(this.f11752b, i7), this.f11753c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0866b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        l();
        int i7 = this.f11753c;
        Object[] objArr = this.f11752b;
        if (i7 == objArr.length) {
            this.f11752b = Arrays.copyOf(objArr, ((i7 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f11752b;
        int i8 = this.f11753c;
        this.f11753c = i8 + 1;
        objArr2[i8] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        t(i7);
        return this.f11752b[i7];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0866b, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        l();
        t(i7);
        Object[] objArr = this.f11752b;
        Object obj = objArr[i7];
        if (i7 < this.f11753c - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (r2 - i7) - 1);
        }
        this.f11753c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        l();
        t(i7);
        Object[] objArr = this.f11752b;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11753c;
    }

    public final void t(int i7) {
        if (i7 < 0 || i7 >= this.f11753c) {
            StringBuilder j = AbstractC0486a1.j(i7, "Index:", ", Size:");
            j.append(this.f11753c);
            throw new IndexOutOfBoundsException(j.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        l();
        if (i7 >= 0 && i7 <= (i8 = this.f11753c)) {
            Object[] objArr = this.f11752b;
            if (i8 < objArr.length) {
                System.arraycopy(objArr, i7, objArr, i7 + 1, i8 - i7);
            } else {
                Object[] objArr2 = new Object[AbstractC0486a1.q(i8, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i7);
                System.arraycopy(this.f11752b, i7, objArr2, i7 + 1, this.f11753c - i7);
                this.f11752b = objArr2;
            }
            this.f11752b[i7] = obj;
            this.f11753c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder j = AbstractC0486a1.j(i7, "Index:", ", Size:");
        j.append(this.f11753c);
        throw new IndexOutOfBoundsException(j.toString());
    }
}
