package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.play_billing.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0193h1 extends T0 implements RandomAccess, InterfaceC0199j1, InterfaceC0246z1 {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f2760d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0193h1 f2761e;

    /* renamed from: b, reason: collision with root package name */
    public int[] f2762b;

    /* renamed from: c, reason: collision with root package name */
    public int f2763c;

    static {
        int[] iArr = new int[0];
        f2760d = iArr;
        f2761e = new C0193h1(iArr, 0, false);
    }

    public C0193h1(int[] iArr, int i3, boolean z3) {
        super(z3);
        this.f2762b = iArr;
        this.f2763c = i3;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0202k1
    public final /* bridge */ /* synthetic */ InterfaceC0202k1 a(int i3) {
        if (i3 >= this.f2763c) {
            return new C0193h1(i3 == 0 ? f2760d : Arrays.copyOf(this.f2762b, i3), this.f2763c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int i4;
        int intValue = ((Integer) obj).intValue();
        b();
        if (i3 < 0 || i3 > (i4 = this.f2763c)) {
            throw new IndexOutOfBoundsException(B0.c.g(i3, this.f2763c, "Index:", ", Size:"));
        }
        int i5 = i3 + 1;
        int[] iArr = this.f2762b;
        int length = iArr.length;
        if (i4 < length) {
            System.arraycopy(iArr, i3, iArr, i5, i4 - i3);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f2762b, 0, iArr2, 0, i3);
            System.arraycopy(this.f2762b, i3, iArr2, i5, this.f2763c - i3);
            this.f2762b = iArr2;
        }
        this.f2762b[i3] = intValue;
        this.f2763c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.T0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = AbstractC0205l1.f2772a;
        collection.getClass();
        if (!(collection instanceof C0193h1)) {
            return super.addAll(collection);
        }
        C0193h1 c0193h1 = (C0193h1) collection;
        int i3 = c0193h1.f2763c;
        if (i3 == 0) {
            return false;
        }
        int i4 = this.f2763c;
        if (Integer.MAX_VALUE - i4 < i3) {
            throw new OutOfMemoryError();
        }
        int i5 = i4 + i3;
        int[] iArr = this.f2762b;
        if (i5 > iArr.length) {
            this.f2762b = Arrays.copyOf(iArr, i5);
        }
        System.arraycopy(c0193h1.f2762b, 0, this.f2762b, this.f2763c, c0193h1.f2763c);
        this.f2763c = i5;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final int c(int i3) {
        e(i3);
        return this.f2762b[i3];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i3) {
        b();
        int i4 = this.f2763c;
        int length = this.f2762b.length;
        if (i4 == length) {
            int[] iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f2762b, 0, iArr, 0, this.f2763c);
            this.f2762b = iArr;
        }
        int[] iArr2 = this.f2762b;
        int i5 = this.f2763c;
        this.f2763c = i5 + 1;
        iArr2[i5] = i3;
    }

    public final void e(int i3) {
        if (i3 < 0 || i3 >= this.f2763c) {
            throw new IndexOutOfBoundsException(B0.c.g(i3, this.f2763c, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.T0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0193h1)) {
            return super.equals(obj);
        }
        C0193h1 c0193h1 = (C0193h1) obj;
        if (this.f2763c != c0193h1.f2763c) {
            return false;
        }
        int[] iArr = c0193h1.f2762b;
        for (int i3 = 0; i3 < this.f2763c; i3++) {
            if (this.f2762b[i3] != iArr[i3]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i3) {
        e(i3);
        return Integer.valueOf(this.f2762b[i3]);
    }

    @Override // com.google.android.gms.internal.play_billing.T0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i3 = 1;
        for (int i4 = 0; i4 < this.f2763c; i4++) {
            i3 = (i3 * 31) + this.f2762b[i4];
        }
        return i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i3 = this.f2763c;
        for (int i4 = 0; i4 < i3; i4++) {
            if (this.f2762b[i4] == intValue) {
                return i4;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.T0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i3) {
        b();
        e(i3);
        int[] iArr = this.f2762b;
        int i4 = iArr[i3];
        if (i3 < this.f2763c - 1) {
            System.arraycopy(iArr, i3 + 1, iArr, i3, (r2 - i3) - 1);
        }
        this.f2763c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i4);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i3, int i4) {
        b();
        if (i4 < i3) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f2762b;
        System.arraycopy(iArr, i4, iArr, i3, this.f2763c - i4);
        this.f2763c -= i4 - i3;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i3, Object obj) {
        int intValue = ((Integer) obj).intValue();
        b();
        e(i3);
        int[] iArr = this.f2762b;
        int i4 = iArr[i3];
        iArr[i3] = intValue;
        return Integer.valueOf(i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2763c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Integer) obj).intValue());
        return true;
    }
}
