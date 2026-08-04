package androidx.datastore.preferences.protobuf;

import W5.AbstractC0486a1;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class S extends AbstractC0657b implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final S f9139d = new S(new Object[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f9140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9141c;

    public S(Object[] objArr, int i7, boolean z4) {
        this.f9165a = z4;
        this.f9140b = objArr;
        this.f9141c = i7;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        l();
        int i7 = this.f9141c;
        Object[] objArr = this.f9140b;
        if (i7 == objArr.length) {
            this.f9140b = Arrays.copyOf(objArr, ((i7 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f9140b;
        int i8 = this.f9141c;
        this.f9141c = i8 + 1;
        objArr2[i8] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        m(i7);
        return this.f9140b[i7];
    }

    public final void m(int i7) {
        if (i7 < 0 || i7 >= this.f9141c) {
            StringBuilder sbJ = AbstractC0486a1.j(i7, "Index:", ", Size:");
            sbJ.append(this.f9141c);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0657b, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        l();
        m(i7);
        Object[] objArr = this.f9140b;
        Object obj = objArr[i7];
        int i8 = this.f9141c;
        if (i7 < i8 - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (i8 - i7) - 1);
        }
        this.f9141c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        l();
        m(i7);
        Object[] objArr = this.f9140b;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9141c;
    }

    public final S t(int i7) {
        if (i7 >= this.f9141c) {
            return new S(Arrays.copyOf(this.f9140b, i7), this.f9141c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        l();
        if (i7 >= 0 && i7 <= (i8 = this.f9141c)) {
            Object[] objArr = this.f9140b;
            if (i8 < objArr.length) {
                System.arraycopy(objArr, i7, objArr, i7 + 1, i8 - i7);
            } else {
                Object[] objArr2 = new Object[AbstractC0486a1.q(i8, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i7);
                System.arraycopy(this.f9140b, i7, objArr2, i7 + 1, this.f9141c - i7);
                this.f9140b = objArr2;
            }
            this.f9140b[i7] = obj;
            this.f9141c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbJ = AbstractC0486a1.j(i7, "Index:", ", Size:");
        sbJ.append(this.f9141c);
        throw new IndexOutOfBoundsException(sbJ.toString());
    }
}
