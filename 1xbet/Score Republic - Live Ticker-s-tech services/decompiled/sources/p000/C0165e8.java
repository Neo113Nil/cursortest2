package p000;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: e8 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0165e8 implements Collection, Set, sg0 {

    /* JADX INFO: renamed from: j */
    public int[] f1994j = kd0.f4350b;

    /* JADX INFO: renamed from: k */
    public Object[] f1995k = kd0.f4351c;

    /* JADX INFO: renamed from: l */
    public int f1996l;

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iM3659f;
        int i2 = this.f1996l;
        if (obj == null) {
            iM3659f = oa2.m3659f(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iM3659f = oa2.m3659f(this, obj, iHashCode);
        }
        if (iM3659f >= 0) {
            return false;
        }
        int i3 = ~iM3659f;
        int[] iArr = this.f1994j;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f1995k;
            int[] iArr2 = new int[i4];
            this.f1994j = iArr2;
            this.f1995k = new Object[i4];
            if (i2 != this.f1996l) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                AbstractC0202f8.m1743t(0, 0, iArr.length, iArr, iArr2);
                AbstractC0202f8.m1745v(0, objArr.length, 6, objArr, this.f1995k);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.f1994j;
            int i5 = i3 + 1;
            AbstractC0202f8.m1743t(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.f1995k;
            AbstractC0202f8.m1744u(i5, i3, i2, objArr2, objArr2);
        }
        int i6 = this.f1996l;
        if (i2 == i6) {
            int[] iArr4 = this.f1994j;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.f1995k[i3] = obj;
                this.f1996l = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.f1996l;
        int i = this.f1996l;
        int[] iArr = this.f1994j;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f1995k;
            int[] iArr2 = new int[size];
            this.f1994j = iArr2;
            this.f1995k = new Object[size];
            if (i > 0) {
                AbstractC0202f8.m1743t(0, 0, i, iArr, iArr2);
                AbstractC0202f8.m1745v(0, this.f1996l, 6, objArr, this.f1995k);
            }
        }
        if (this.f1996l != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    /* JADX INFO: renamed from: b */
    public final Object m1385b(int i) {
        int i2 = this.f1996l;
        Object[] objArr = this.f1995k;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.f1994j;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                AbstractC0202f8.m1743t(i, i4, i2, iArr, iArr);
                Object[] objArr2 = this.f1995k;
                AbstractC0202f8.m1744u(i, i4, i2, objArr2, objArr2);
            }
            this.f1995k[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.f1994j = iArr2;
            this.f1995k = new Object[i5];
            if (i > 0) {
                AbstractC0202f8.m1743t(0, 0, i, iArr, iArr2);
                AbstractC0202f8.m1745v(0, i, 6, objArr, this.f1995k);
            }
            if (i < i3) {
                int i6 = i + 1;
                AbstractC0202f8.m1743t(i, i6, i2, iArr, this.f1994j);
                AbstractC0202f8.m1744u(i, i6, i2, objArr, this.f1995k);
            }
        }
        if (i2 != this.f1996l) {
            throw new ConcurrentModificationException();
        }
        this.f1996l = i3;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f1996l != 0) {
            this.f1994j = kd0.f4350b;
            this.f1995k = kd0.f4351c;
            this.f1996l = 0;
        }
        if (this.f1996l != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? oa2.m3659f(this, null, 0) : oa2.m3659f(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && this.f1996l == ((Set) obj).size()) {
            try {
                int i = this.f1996l;
                for (int i2 = 0; i2 < i; i2++) {
                    if (((Set) obj).contains(this.f1995k[i2])) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f1994j;
        int i = this.f1996l;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f1996l <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0904y7(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM3659f = obj == null ? oa2.m3659f(this, null, 0) : oa2.m3659f(this, obj, obj.hashCode());
        if (iM3659f < 0) {
            return false;
        }
        m1385b(iM3659f);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.f1996l - 1; -1 < i; i--) {
            if (!collection.contains(this.f1995k[i])) {
                m1385b(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f1996l;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i = this.f1996l;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        AbstractC0202f8.m1744u(0, 0, this.f1996l, this.f1995k, objArr);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1996l * 14);
        sb.append('{');
        int i = this.f1996l;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f1995k[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = this.f1995k;
        int i = this.f1996l;
        zg1.m5893d(i, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, 0, i);
        objArrCopyOfRange.getClass();
        return objArrCopyOfRange;
    }
}
