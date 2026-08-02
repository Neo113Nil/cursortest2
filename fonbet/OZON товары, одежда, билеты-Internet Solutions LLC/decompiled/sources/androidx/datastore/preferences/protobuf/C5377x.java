package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C5378y;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5377x extends AbstractC5357c<Integer> implements RandomAccess, a0 {

    /* renamed from: b, reason: collision with root package name */
    private int[] f42626b;

    /* renamed from: c, reason: collision with root package name */
    private int f42627c;

    static {
        new C5377x(new int[0], 0, false);
    }

    C5377x() {
        this(new int[10], 0, true);
    }

    private void b(int i11) {
        if (i11 < 0 || i11 >= this.f42627c) {
            StringBuilder f7 = P4.f.f(i11, "Index:", ", Size:");
            f7.append(this.f42627c);
            throw new IndexOutOfBoundsException(f7.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        int intValue = ((Integer) obj).intValue();
        a();
        if (i11 < 0 || i11 > (i12 = this.f42627c)) {
            StringBuilder f7 = P4.f.f(i11, "Index:", ", Size:");
            f7.append(this.f42627c);
            throw new IndexOutOfBoundsException(f7.toString());
        }
        int[] iArr = this.f42626b;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i11, iArr, i11 + 1, i12 - i11);
        } else {
            int[] iArr2 = new int[U7.i.a(i12, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            System.arraycopy(this.f42626b, i11, iArr2, i11 + 1, this.f42627c - i11);
            this.f42626b = iArr2;
        }
        this.f42626b[i11] = intValue;
        this.f42627c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5357c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        a();
        byte[] bArr = C5378y.f42629b;
        collection.getClass();
        if (!(collection instanceof C5377x)) {
            return super.addAll(collection);
        }
        C5377x c5377x = (C5377x) collection;
        int i11 = c5377x.f42627c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f42627c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        int[] iArr = this.f42626b;
        if (i13 > iArr.length) {
            this.f42626b = Arrays.copyOf(iArr, i13);
        }
        System.arraycopy(c5377x.f42626b, 0, this.f42626b, this.f42627c, c5377x.f42627c);
        this.f42627c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addInt(int i11) {
        a();
        int i12 = this.f42627c;
        int[] iArr = this.f42626b;
        if (i12 == iArr.length) {
            int[] iArr2 = new int[U7.i.a(i12, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i12);
            this.f42626b = iArr2;
        }
        int[] iArr3 = this.f42626b;
        int i13 = this.f42627c;
        this.f42627c = i13 + 1;
        iArr3[i13] = i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5357c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5377x)) {
            return super.equals(obj);
        }
        C5377x c5377x = (C5377x) obj;
        if (this.f42627c != c5377x.f42627c) {
            return false;
        }
        int[] iArr = c5377x.f42626b;
        for (int i11 = 0; i11 < this.f42627c; i11++) {
            if (this.f42626b[i11] != iArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        return Integer.valueOf(getInt(i11));
    }

    public final int getInt(int i11) {
        b(i11);
        return this.f42626b[i11];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5357c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f42627c; i12++) {
            i11 = (i11 * 31) + this.f42626b[i12];
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i11 = this.f42627c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f42626b[i12] == intValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.C5378y.c
    public final C5378y.c mutableCopyWithCapacity(int i11) {
        if (i11 >= this.f42627c) {
            return new C5377x(Arrays.copyOf(this.f42626b, i11), this.f42627c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5357c, java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        a();
        b(i11);
        int[] iArr = this.f42626b;
        int i12 = iArr[i11];
        if (i11 < this.f42627c - 1) {
            System.arraycopy(iArr, i11 + 1, iArr, i11, (r2 - i11) - 1);
        }
        this.f42627c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i11, int i12) {
        a();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f42626b;
        System.arraycopy(iArr, i12, iArr, i11, this.f42627c - i12);
        this.f42627c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        b(i11);
        int[] iArr = this.f42626b;
        int i12 = iArr[i11];
        iArr[i11] = intValue;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f42627c;
    }

    private C5377x(int[] iArr, int i11, boolean z11) {
        super(z11);
        this.f42626b = iArr;
        this.f42627c = i11;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addInt(((Integer) obj).intValue());
        return true;
    }
}
