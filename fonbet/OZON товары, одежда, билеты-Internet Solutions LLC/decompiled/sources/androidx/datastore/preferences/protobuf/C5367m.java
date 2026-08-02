package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C5378y;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5367m extends AbstractC5357c<Double> implements RandomAccess, a0 {

    /* renamed from: b, reason: collision with root package name */
    private double[] f42586b;

    /* renamed from: c, reason: collision with root package name */
    private int f42587c;

    static {
        new C5367m(new double[0], 0, false);
    }

    C5367m() {
        this(new double[10], 0, true);
    }

    private void b(int i11) {
        if (i11 < 0 || i11 >= this.f42587c) {
            StringBuilder f7 = P4.f.f(i11, "Index:", ", Size:");
            f7.append(this.f42587c);
            throw new IndexOutOfBoundsException(f7.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        double doubleValue = ((Double) obj).doubleValue();
        a();
        if (i11 < 0 || i11 > (i12 = this.f42587c)) {
            StringBuilder f7 = P4.f.f(i11, "Index:", ", Size:");
            f7.append(this.f42587c);
            throw new IndexOutOfBoundsException(f7.toString());
        }
        double[] dArr = this.f42586b;
        if (i12 < dArr.length) {
            System.arraycopy(dArr, i11, dArr, i11 + 1, i12 - i11);
        } else {
            double[] dArr2 = new double[U7.i.a(i12, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i11);
            System.arraycopy(this.f42586b, i11, dArr2, i11 + 1, this.f42587c - i11);
            this.f42586b = dArr2;
        }
        this.f42586b[i11] = doubleValue;
        this.f42587c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5357c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        a();
        byte[] bArr = C5378y.f42629b;
        collection.getClass();
        if (!(collection instanceof C5367m)) {
            return super.addAll(collection);
        }
        C5367m c5367m = (C5367m) collection;
        int i11 = c5367m.f42587c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f42587c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        double[] dArr = this.f42586b;
        if (i13 > dArr.length) {
            this.f42586b = Arrays.copyOf(dArr, i13);
        }
        System.arraycopy(c5367m.f42586b, 0, this.f42586b, this.f42587c, c5367m.f42587c);
        this.f42587c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addDouble(double d11) {
        a();
        int i11 = this.f42587c;
        double[] dArr = this.f42586b;
        if (i11 == dArr.length) {
            double[] dArr2 = new double[U7.i.a(i11, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i11);
            this.f42586b = dArr2;
        }
        double[] dArr3 = this.f42586b;
        int i12 = this.f42587c;
        this.f42587c = i12 + 1;
        dArr3[i12] = d11;
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
        if (!(obj instanceof C5367m)) {
            return super.equals(obj);
        }
        C5367m c5367m = (C5367m) obj;
        if (this.f42587c != c5367m.f42587c) {
            return false;
        }
        double[] dArr = c5367m.f42586b;
        for (int i11 = 0; i11 < this.f42587c; i11++) {
            if (Double.doubleToLongBits(this.f42586b[i11]) != Double.doubleToLongBits(dArr[i11])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        return Double.valueOf(getDouble(i11));
    }

    public final double getDouble(int i11) {
        b(i11);
        return this.f42586b[i11];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5357c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f42587c; i12++) {
            i11 = (i11 * 31) + C5378y.b(Double.doubleToLongBits(this.f42586b[i12]));
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i11 = this.f42587c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f42586b[i12] == doubleValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.C5378y.c
    public final C5378y.c mutableCopyWithCapacity(int i11) {
        if (i11 >= this.f42587c) {
            return new C5367m(Arrays.copyOf(this.f42586b, i11), this.f42587c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5357c, java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        a();
        b(i11);
        double[] dArr = this.f42586b;
        double d11 = dArr[i11];
        if (i11 < this.f42587c - 1) {
            System.arraycopy(dArr, i11 + 1, dArr, i11, (r3 - i11) - 1);
        }
        this.f42587c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i11, int i12) {
        a();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f42586b;
        System.arraycopy(dArr, i12, dArr, i11, this.f42587c - i12);
        this.f42587c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        a();
        b(i11);
        double[] dArr = this.f42586b;
        double d11 = dArr[i11];
        dArr[i11] = doubleValue;
        return Double.valueOf(d11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f42587c;
    }

    private C5367m(double[] dArr, int i11, boolean z11) {
        super(z11);
        this.f42586b = dArr;
        this.f42587c = i11;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addDouble(((Double) obj).doubleValue());
        return true;
    }
}
