package com.google.protobuf;

import W5.AbstractC0486a1;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.n0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0918n0 extends AbstractC0893b implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final C0918n0 f12243d = new C0918n0(new Object[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    public Object[] f12244b;

    /* renamed from: c, reason: collision with root package name */
    public int f12245c;

    public C0918n0(Object[] objArr, int i7, boolean z4) {
        super(z4);
        this.f12244b = objArr;
        this.f12245c = i7;
    }

    @Override // com.google.protobuf.J
    public final J a(int i7) {
        if (i7 >= this.f12245c) {
            return new C0918n0(Arrays.copyOf(this.f12244b, i7), this.f12245c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC0893b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        l();
        int i7 = this.f12245c;
        Object[] objArr = this.f12244b;
        if (i7 == objArr.length) {
            this.f12244b = Arrays.copyOf(objArr, ((i7 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f12244b;
        int i8 = this.f12245c;
        this.f12245c = i8 + 1;
        objArr2[i8] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        t(i7);
        return this.f12244b[i7];
    }

    @Override // com.google.protobuf.AbstractC0893b, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        l();
        t(i7);
        Object[] objArr = this.f12244b;
        Object obj = objArr[i7];
        if (i7 < this.f12245c - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (r2 - i7) - 1);
        }
        this.f12245c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        l();
        t(i7);
        Object[] objArr = this.f12244b;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12245c;
    }

    public final void t(int i7) {
        if (i7 < 0 || i7 >= this.f12245c) {
            StringBuilder j = AbstractC0486a1.j(i7, "Index:", ", Size:");
            j.append(this.f12245c);
            throw new IndexOutOfBoundsException(j.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        l();
        if (i7 >= 0 && i7 <= (i8 = this.f12245c)) {
            Object[] objArr = this.f12244b;
            if (i8 < objArr.length) {
                System.arraycopy(objArr, i7, objArr, i7 + 1, i8 - i7);
            } else {
                Object[] objArr2 = new Object[AbstractC0486a1.q(i8, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i7);
                System.arraycopy(this.f12244b, i7, objArr2, i7 + 1, this.f12245c - i7);
                this.f12244b = objArr2;
            }
            this.f12244b[i7] = obj;
            this.f12245c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder j = AbstractC0486a1.j(i7, "Index:", ", Size:");
        j.append(this.f12245c);
        throw new IndexOutOfBoundsException(j.toString());
    }
}
