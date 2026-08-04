package com.google.protobuf;

import W5.AbstractC0486a1;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class G extends AbstractC0849b implements I, RandomAccess, InterfaceC0870l0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final G f12107d = new G(new int[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f12108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12109c;

    public G(int[] iArr, int i7, boolean z4) {
        super(z4);
        this.f12108b = iArr;
        this.f12109c = i7;
    }

    @Override // com.google.protobuf.J
    public final J a(int i7) {
        if (i7 >= this.f12109c) {
            return new G(Arrays.copyOf(this.f12108b, i7), this.f12109c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        int iIntValue = ((Integer) obj).intValue();
        l();
        if (i7 < 0 || i7 > (i8 = this.f12109c)) {
            StringBuilder sbJ = AbstractC0486a1.j(i7, "Index:", ", Size:");
            sbJ.append(this.f12109c);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
        int[] iArr = this.f12108b;
        if (i8 < iArr.length) {
            System.arraycopy(iArr, i7, iArr, i7 + 1, i8 - i7);
        } else {
            int[] iArr2 = new int[AbstractC0486a1.q(i8, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i7);
            System.arraycopy(this.f12108b, i7, iArr2, i7 + 1, this.f12109c - i7);
            this.f12108b = iArr2;
        }
        this.f12108b[i7] = iIntValue;
        this.f12109c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC0849b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        l();
        Charset charset = K.f12112a;
        collection.getClass();
        if (!(collection instanceof G)) {
            return super.addAll(collection);
        }
        G g3 = (G) collection;
        int i7 = g3.f12109c;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.f12109c;
        if (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        int[] iArr = this.f12108b;
        if (i9 > iArr.length) {
            this.f12108b = Arrays.copyOf(iArr, i9);
        }
        System.arraycopy(g3.f12108b, 0, this.f12108b, this.f12109c, g3.f12109c);
        this.f12109c = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.AbstractC0849b, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return super.equals(obj);
        }
        G g3 = (G) obj;
        if (this.f12109c != g3.f12109c) {
            return false;
        }
        int[] iArr = g3.f12108b;
        for (int i7 = 0; i7 < this.f12109c; i7++) {
            if (this.f12108b[i7] != iArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        y(i7);
        return Integer.valueOf(this.f12108b[i7]);
    }

    @Override // com.google.protobuf.AbstractC0849b, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.f12109c; i8++) {
            i7 = (i7 * 31) + this.f12108b[i8];
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i7 = this.f12109c;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.f12108b[i8] == iIntValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC0849b, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        l();
        y(i7);
        int[] iArr = this.f12108b;
        int i8 = iArr[i7];
        int i9 = this.f12109c;
        if (i7 < i9 - 1) {
            System.arraycopy(iArr, i7 + 1, iArr, i7, (i9 - i7) - 1);
        }
        this.f12109c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i8);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i8) {
        l();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f12108b;
        System.arraycopy(iArr, i8, iArr, i7, this.f12109c - i8);
        this.f12109c -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        l();
        y(i7);
        int[] iArr = this.f12108b;
        int i8 = iArr[i7];
        iArr[i7] = iIntValue;
        return Integer.valueOf(i8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12109c;
    }

    public final void t(int i7) {
        l();
        int i8 = this.f12109c;
        int[] iArr = this.f12108b;
        if (i8 == iArr.length) {
            int[] iArr2 = new int[AbstractC0486a1.q(i8, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i8);
            this.f12108b = iArr2;
        }
        int[] iArr3 = this.f12108b;
        int i9 = this.f12109c;
        this.f12109c = i9 + 1;
        iArr3[i9] = i7;
    }

    public final void y(int i7) {
        if (i7 < 0 || i7 >= this.f12109c) {
            StringBuilder sbJ = AbstractC0486a1.j(i7, "Index:", ", Size:");
            sbJ.append(this.f12109c);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
    }

    @Override // com.google.protobuf.AbstractC0849b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        t(((Integer) obj).intValue());
        return true;
    }
}
