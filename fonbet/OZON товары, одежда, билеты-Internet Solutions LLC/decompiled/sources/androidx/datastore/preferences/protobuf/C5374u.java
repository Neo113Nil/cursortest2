package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C5378y;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5374u extends AbstractC5357c<Float> implements RandomAccess, a0 {

    /* renamed from: b, reason: collision with root package name */
    private float[] f42621b;

    /* renamed from: c, reason: collision with root package name */
    private int f42622c;

    static {
        new C5374u(new float[0], 0, false);
    }

    C5374u() {
        this(new float[10], 0, true);
    }

    private void b(int i11) {
        if (i11 < 0 || i11 >= this.f42622c) {
            StringBuilder f7 = P4.f.f(i11, "Index:", ", Size:");
            f7.append(this.f42622c);
            throw new IndexOutOfBoundsException(f7.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        float floatValue = ((Float) obj).floatValue();
        a();
        if (i11 < 0 || i11 > (i12 = this.f42622c)) {
            StringBuilder f7 = P4.f.f(i11, "Index:", ", Size:");
            f7.append(this.f42622c);
            throw new IndexOutOfBoundsException(f7.toString());
        }
        float[] fArr = this.f42621b;
        if (i12 < fArr.length) {
            System.arraycopy(fArr, i11, fArr, i11 + 1, i12 - i11);
        } else {
            float[] fArr2 = new float[U7.i.a(i12, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i11);
            System.arraycopy(this.f42621b, i11, fArr2, i11 + 1, this.f42622c - i11);
            this.f42621b = fArr2;
        }
        this.f42621b[i11] = floatValue;
        this.f42622c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5357c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        a();
        byte[] bArr = C5378y.f42629b;
        collection.getClass();
        if (!(collection instanceof C5374u)) {
            return super.addAll(collection);
        }
        C5374u c5374u = (C5374u) collection;
        int i11 = c5374u.f42622c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f42622c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        float[] fArr = this.f42621b;
        if (i13 > fArr.length) {
            this.f42621b = Arrays.copyOf(fArr, i13);
        }
        System.arraycopy(c5374u.f42621b, 0, this.f42621b, this.f42622c, c5374u.f42622c);
        this.f42622c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addFloat(float f7) {
        a();
        int i11 = this.f42622c;
        float[] fArr = this.f42621b;
        if (i11 == fArr.length) {
            float[] fArr2 = new float[U7.i.a(i11, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i11);
            this.f42621b = fArr2;
        }
        float[] fArr3 = this.f42621b;
        int i12 = this.f42622c;
        this.f42622c = i12 + 1;
        fArr3[i12] = f7;
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
        if (!(obj instanceof C5374u)) {
            return super.equals(obj);
        }
        C5374u c5374u = (C5374u) obj;
        if (this.f42622c != c5374u.f42622c) {
            return false;
        }
        float[] fArr = c5374u.f42621b;
        for (int i11 = 0; i11 < this.f42622c; i11++) {
            if (Float.floatToIntBits(this.f42621b[i11]) != Float.floatToIntBits(fArr[i11])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        return Float.valueOf(getFloat(i11));
    }

    public final float getFloat(int i11) {
        b(i11);
        return this.f42621b[i11];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5357c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f42622c; i12++) {
            i11 = (i11 * 31) + Float.floatToIntBits(this.f42621b[i12]);
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i11 = this.f42622c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f42621b[i12] == floatValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.C5378y.c
    public final C5378y.c mutableCopyWithCapacity(int i11) {
        if (i11 >= this.f42622c) {
            return new C5374u(Arrays.copyOf(this.f42621b, i11), this.f42622c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5357c, java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        a();
        b(i11);
        float[] fArr = this.f42621b;
        float f7 = fArr[i11];
        if (i11 < this.f42622c - 1) {
            System.arraycopy(fArr, i11 + 1, fArr, i11, (r2 - i11) - 1);
        }
        this.f42622c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f7);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i11, int i12) {
        a();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f42621b;
        System.arraycopy(fArr, i12, fArr, i11, this.f42622c - i12);
        this.f42622c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        a();
        b(i11);
        float[] fArr = this.f42621b;
        float f7 = fArr[i11];
        fArr[i11] = floatValue;
        return Float.valueOf(f7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f42622c;
    }

    private C5374u(float[] fArr, int i11, boolean z11) {
        super(z11);
        this.f42621b = fArr;
        this.f42622c = i11;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addFloat(((Float) obj).floatValue());
        return true;
    }
}
