package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class U extends AbstractC0127b implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final U f2193d = new U(new Object[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    public Object[] f2194b;

    /* renamed from: c, reason: collision with root package name */
    public int f2195c;

    public U(Object[] objArr, int i3, boolean z3) {
        this.f2215a = z3;
        this.f2194b = objArr;
        this.f2195c = i3;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i3 = this.f2195c;
        Object[] objArr = this.f2194b;
        if (i3 == objArr.length) {
            this.f2194b = Arrays.copyOf(objArr, ((i3 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f2194b;
        int i4 = this.f2195c;
        this.f2195c = i4 + 1;
        objArr2[i4] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(int i3) {
        if (i3 < 0 || i3 >= this.f2195c) {
            throw new IndexOutOfBoundsException("Index:" + i3 + ", Size:" + this.f2195c);
        }
    }

    public final U d(int i3) {
        if (i3 >= this.f2195c) {
            return new U(Arrays.copyOf(this.f2194b, i3), this.f2195c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        c(i3);
        return this.f2194b[i3];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0127b, java.util.AbstractList, java.util.List
    public final Object remove(int i3) {
        b();
        c(i3);
        Object[] objArr = this.f2194b;
        Object obj = objArr[i3];
        if (i3 < this.f2195c - 1) {
            System.arraycopy(objArr, i3 + 1, objArr, i3, (r2 - i3) - 1);
        }
        this.f2195c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        b();
        c(i3);
        Object[] objArr = this.f2194b;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2195c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int i4;
        b();
        if (i3 >= 0 && i3 <= (i4 = this.f2195c)) {
            Object[] objArr = this.f2194b;
            if (i4 < objArr.length) {
                System.arraycopy(objArr, i3, objArr, i3 + 1, i4 - i3);
            } else {
                Object[] objArr2 = new Object[((i4 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(this.f2194b, i3, objArr2, i3 + 1, this.f2195c - i3);
                this.f2194b = objArr2;
            }
            this.f2194b[i3] = obj;
            this.f2195c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("Index:" + i3 + ", Size:" + this.f2195c);
    }
}
