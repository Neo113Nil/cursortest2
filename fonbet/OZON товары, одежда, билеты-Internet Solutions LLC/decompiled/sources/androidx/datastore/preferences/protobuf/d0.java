package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C5378y;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes8.dex */
final class d0<E> extends AbstractC5357c<E> implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final d0<Object> f42508d = new d0<>(new Object[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    private E[] f42509b;

    /* renamed from: c, reason: collision with root package name */
    private int f42510c;

    private d0(E[] eArr, int i11, boolean z11) {
        super(z11);
        this.f42509b = eArr;
        this.f42510c = i11;
    }

    public static <E> d0<E> b() {
        return (d0<E>) f42508d;
    }

    private void c(int i11) {
        if (i11 < 0 || i11 >= this.f42510c) {
            StringBuilder f7 = P4.f.f(i11, "Index:", ", Size:");
            f7.append(this.f42510c);
            throw new IndexOutOfBoundsException(f7.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e11) {
        a();
        int i11 = this.f42510c;
        E[] eArr = this.f42509b;
        if (i11 == eArr.length) {
            this.f42509b = (E[]) Arrays.copyOf(eArr, ((i11 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f42509b;
        int i12 = this.f42510c;
        this.f42510c = i12 + 1;
        eArr2[i12] = e11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i11) {
        c(i11);
        return this.f42509b[i11];
    }

    @Override // androidx.datastore.preferences.protobuf.C5378y.c
    public final C5378y.c mutableCopyWithCapacity(int i11) {
        if (i11 >= this.f42510c) {
            return new d0(Arrays.copyOf(this.f42509b, i11), this.f42510c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5357c, java.util.AbstractList, java.util.List
    public final E remove(int i11) {
        a();
        c(i11);
        E[] eArr = this.f42509b;
        E e11 = eArr[i11];
        if (i11 < this.f42510c - 1) {
            System.arraycopy(eArr, i11 + 1, eArr, i11, (r2 - i11) - 1);
        }
        this.f42510c--;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i11, E e11) {
        a();
        c(i11);
        E[] eArr = this.f42509b;
        E e12 = eArr[i11];
        eArr[i11] = e11;
        ((AbstractList) this).modCount++;
        return e12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f42510c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, E e11) {
        int i12;
        a();
        if (i11 >= 0 && i11 <= (i12 = this.f42510c)) {
            E[] eArr = this.f42509b;
            if (i12 < eArr.length) {
                System.arraycopy(eArr, i11, eArr, i11 + 1, i12 - i11);
            } else {
                E[] eArr2 = (E[]) new Object[U7.i.a(i12, 3, 2, 1)];
                System.arraycopy(eArr, 0, eArr2, 0, i11);
                System.arraycopy(this.f42509b, i11, eArr2, i11 + 1, this.f42510c - i11);
                this.f42509b = eArr2;
            }
            this.f42509b[i11] = e11;
            this.f42510c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder f7 = P4.f.f(i11, "Index:", ", Size:");
        f7.append(this.f42510c);
        throw new IndexOutOfBoundsException(f7.toString());
    }
}
