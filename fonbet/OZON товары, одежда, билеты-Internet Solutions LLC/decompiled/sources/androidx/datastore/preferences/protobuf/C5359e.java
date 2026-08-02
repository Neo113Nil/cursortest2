package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C5378y;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5359e extends AbstractC5357c<Boolean> implements RandomAccess, a0 {

    /* renamed from: b, reason: collision with root package name */
    private boolean[] f42511b;

    /* renamed from: c, reason: collision with root package name */
    private int f42512c;

    static {
        new C5359e(new boolean[0], 0, false);
    }

    C5359e() {
        this(new boolean[10], 0, true);
    }

    private void b(int i11) {
        if (i11 < 0 || i11 >= this.f42512c) {
            StringBuilder f7 = P4.f.f(i11, "Index:", ", Size:");
            f7.append(this.f42512c);
            throw new IndexOutOfBoundsException(f7.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i11 < 0 || i11 > (i12 = this.f42512c)) {
            StringBuilder f7 = P4.f.f(i11, "Index:", ", Size:");
            f7.append(this.f42512c);
            throw new IndexOutOfBoundsException(f7.toString());
        }
        boolean[] zArr = this.f42511b;
        if (i12 < zArr.length) {
            System.arraycopy(zArr, i11, zArr, i11 + 1, i12 - i11);
        } else {
            boolean[] zArr2 = new boolean[U7.i.a(i12, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i11);
            System.arraycopy(this.f42511b, i11, zArr2, i11 + 1, this.f42512c - i11);
            this.f42511b = zArr2;
        }
        this.f42511b[i11] = booleanValue;
        this.f42512c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5357c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        a();
        byte[] bArr = C5378y.f42629b;
        collection.getClass();
        if (!(collection instanceof C5359e)) {
            return super.addAll(collection);
        }
        C5359e c5359e = (C5359e) collection;
        int i11 = c5359e.f42512c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f42512c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        boolean[] zArr = this.f42511b;
        if (i13 > zArr.length) {
            this.f42511b = Arrays.copyOf(zArr, i13);
        }
        System.arraycopy(c5359e.f42511b, 0, this.f42511b, this.f42512c, c5359e.f42512c);
        this.f42512c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addBoolean(boolean z11) {
        a();
        int i11 = this.f42512c;
        boolean[] zArr = this.f42511b;
        if (i11 == zArr.length) {
            boolean[] zArr2 = new boolean[U7.i.a(i11, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i11);
            this.f42511b = zArr2;
        }
        boolean[] zArr3 = this.f42511b;
        int i12 = this.f42512c;
        this.f42512c = i12 + 1;
        zArr3[i12] = z11;
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
        if (!(obj instanceof C5359e)) {
            return super.equals(obj);
        }
        C5359e c5359e = (C5359e) obj;
        if (this.f42512c != c5359e.f42512c) {
            return false;
        }
        boolean[] zArr = c5359e.f42511b;
        for (int i11 = 0; i11 < this.f42512c; i11++) {
            if (this.f42511b[i11] != zArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        return Boolean.valueOf(getBoolean(i11));
    }

    public final boolean getBoolean(int i11) {
        b(i11);
        return this.f42511b[i11];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5357c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f42512c; i12++) {
            int i13 = i11 * 31;
            boolean z11 = this.f42511b[i12];
            byte[] bArr = C5378y.f42629b;
            i11 = i13 + (z11 ? 1231 : 1237);
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i11 = this.f42512c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f42511b[i12] == booleanValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.C5378y.c
    public final C5378y.c mutableCopyWithCapacity(int i11) {
        if (i11 >= this.f42512c) {
            return new C5359e(Arrays.copyOf(this.f42511b, i11), this.f42512c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5357c, java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        a();
        b(i11);
        boolean[] zArr = this.f42511b;
        boolean z11 = zArr[i11];
        if (i11 < this.f42512c - 1) {
            System.arraycopy(zArr, i11 + 1, zArr, i11, (r2 - i11) - 1);
        }
        this.f42512c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i11, int i12) {
        a();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f42511b;
        System.arraycopy(zArr, i12, zArr, i11, this.f42512c - i12);
        this.f42512c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        b(i11);
        boolean[] zArr = this.f42511b;
        boolean z11 = zArr[i11];
        zArr[i11] = booleanValue;
        return Boolean.valueOf(z11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f42512c;
    }

    private C5359e(boolean[] zArr, int i11, boolean z11) {
        super(z11);
        this.f42511b = zArr;
        this.f42512c = i11;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addBoolean(((Boolean) obj).booleanValue());
        return true;
    }
}
