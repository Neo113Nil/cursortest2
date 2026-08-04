package p122r;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Collection, Set {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static int f15974A;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f15975e = new int[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object[] f15976f = new Object[0];

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static Object[] f15977x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static int f15978y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static Object[] f15979z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f15980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f15981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f15983d;

    public c(int i7) {
        if (i7 == 0) {
            this.f15980a = f15975e;
            this.f15981b = f15976f;
        } else {
            l(i7);
        }
        this.f15982c = 0;
    }

    public static void m(int[] iArr, Object[] objArr, int i7) {
        if (iArr.length == 8) {
            synchronized (c.class) {
                try {
                    if (f15974A < 10) {
                        objArr[0] = f15979z;
                        objArr[1] = iArr;
                        for (int i8 = i7 - 1; i8 >= 2; i8--) {
                            objArr[i8] = null;
                        }
                        f15979z = objArr;
                        f15974A++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (c.class) {
                try {
                    if (f15978y < 10) {
                        objArr[0] = f15977x;
                        objArr[1] = iArr;
                        for (int i9 = i7 - 1; i9 >= 2; i9--) {
                            objArr[i9] = null;
                        }
                        f15977x = objArr;
                        f15978y++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i7;
        int iT;
        if (obj == null) {
            iT = y();
            i7 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i7 = iHashCode;
            iT = t(iHashCode, obj);
        }
        if (iT >= 0) {
            return false;
        }
        int i8 = ~iT;
        int i9 = this.f15982c;
        int[] iArr = this.f15980a;
        if (i9 >= iArr.length) {
            int i10 = 8;
            if (i9 >= 8) {
                i10 = (i9 >> 1) + i9;
            } else if (i9 < 4) {
                i10 = 4;
            }
            Object[] objArr = this.f15981b;
            l(i10);
            int[] iArr2 = this.f15980a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f15981b, 0, objArr.length);
            }
            m(iArr, objArr, this.f15982c);
        }
        int i11 = this.f15982c;
        if (i8 < i11) {
            int[] iArr3 = this.f15980a;
            int i12 = i8 + 1;
            System.arraycopy(iArr3, i8, iArr3, i12, i11 - i8);
            Object[] objArr2 = this.f15981b;
            System.arraycopy(objArr2, i8, objArr2, i12, this.f15982c - i8);
        }
        this.f15980a[i8] = i7;
        this.f15981b[i8] = obj;
        this.f15982c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f15982c;
        int[] iArr = this.f15980a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f15981b;
            l(size);
            int i7 = this.f15982c;
            if (i7 > 0) {
                System.arraycopy(iArr, 0, this.f15980a, 0, i7);
                System.arraycopy(objArr, 0, this.f15981b, 0, this.f15982c);
            }
            m(iArr, objArr, this.f15982c);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i7 = this.f15982c;
        if (i7 != 0) {
            m(this.f15980a, this.f15981b, i7);
            this.f15980a = f15975e;
            this.f15981b = f15976f;
            this.f15982c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
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
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f15982c != set.size()) {
                return false;
            }
            for (int i7 = 0; i7 < this.f15982c; i7++) {
                try {
                    if (!set.contains(this.f15981b[i7])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f15980a;
        int i7 = this.f15982c;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 += iArr[i9];
        }
        return i8;
    }

    public final int indexOf(Object obj) {
        return obj == null ? y() : t(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f15982c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (this.f15983d == null) {
            this.f15983d = new a(this, 1);
        }
        a aVar = this.f15983d;
        if (((i) aVar.f5805b) == null) {
            aVar.f5805b = new i(aVar, 1);
        }
        return ((i) aVar.f5805b).iterator();
    }

    public final void l(int i7) {
        if (i7 == 8) {
            synchronized (c.class) {
                try {
                    Object[] objArr = f15979z;
                    if (objArr != null) {
                        this.f15981b = objArr;
                        f15979z = (Object[]) objArr[0];
                        this.f15980a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f15974A--;
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (i7 == 4) {
            synchronized (c.class) {
                try {
                    Object[] objArr2 = f15977x;
                    if (objArr2 != null) {
                        this.f15981b = objArr2;
                        f15977x = (Object[]) objArr2[0];
                        this.f15980a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f15978y--;
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f15980a = new int[i7];
        this.f15981b = new Object[i7];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        z(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z4 = false;
        for (int i7 = this.f15982c - 1; i7 >= 0; i7--) {
            if (!collection.contains(this.f15981b[i7])) {
                z(i7);
                z4 = true;
            }
        }
        return z4;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f15982c;
    }

    public final int t(int i7, Object obj) {
        int i8 = this.f15982c;
        if (i8 == 0) {
            return -1;
        }
        int iA = e.a(this.f15980a, i8, i7);
        if (iA < 0 || obj.equals(this.f15981b[iA])) {
            return iA;
        }
        int i9 = iA + 1;
        while (i9 < i8 && this.f15980a[i9] == i7) {
            if (obj.equals(this.f15981b[i9])) {
                return i9;
            }
            i9++;
        }
        for (int i10 = iA - 1; i10 >= 0 && this.f15980a[i10] == i7; i10--) {
            if (obj.equals(this.f15981b[i10])) {
                return i10;
            }
        }
        return ~i9;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i7 = this.f15982c;
        Object[] objArr = new Object[i7];
        System.arraycopy(this.f15981b, 0, objArr, 0, i7);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f15982c * 14);
        sb.append('{');
        for (int i7 = 0; i7 < this.f15982c; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            Object obj = this.f15981b[i7];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final int y() {
        int i7 = this.f15982c;
        if (i7 == 0) {
            return -1;
        }
        int iA = e.a(this.f15980a, i7, 0);
        if (iA < 0 || this.f15981b[iA] == null) {
            return iA;
        }
        int i8 = iA + 1;
        while (i8 < i7 && this.f15980a[i8] == 0) {
            if (this.f15981b[i8] == null) {
                return i8;
            }
            i8++;
        }
        for (int i9 = iA - 1; i9 >= 0 && this.f15980a[i9] == 0; i9--) {
            if (this.f15981b[i9] == null) {
                return i9;
            }
        }
        return ~i8;
    }

    public final void z(int i7) {
        Object[] objArr = this.f15981b;
        Object obj = objArr[i7];
        int i8 = this.f15982c;
        if (i8 <= 1) {
            m(this.f15980a, objArr, i8);
            this.f15980a = f15975e;
            this.f15981b = f15976f;
            this.f15982c = 0;
            return;
        }
        int[] iArr = this.f15980a;
        if (iArr.length <= 8 || i8 >= iArr.length / 3) {
            int i9 = i8 - 1;
            this.f15982c = i9;
            if (i7 < i9) {
                int i10 = i7 + 1;
                System.arraycopy(iArr, i10, iArr, i7, i9 - i7);
                Object[] objArr2 = this.f15981b;
                System.arraycopy(objArr2, i10, objArr2, i7, this.f15982c - i7);
            }
            this.f15981b[this.f15982c] = null;
            return;
        }
        l(i8 > 8 ? i8 + (i8 >> 1) : 8);
        this.f15982c--;
        if (i7 > 0) {
            System.arraycopy(iArr, 0, this.f15980a, 0, i7);
            System.arraycopy(objArr, 0, this.f15981b, 0, i7);
        }
        int i11 = this.f15982c;
        if (i7 < i11) {
            int i12 = i7 + 1;
            System.arraycopy(iArr, i12, this.f15980a, i7, i11 - i7);
            System.arraycopy(objArr, i12, this.f15981b, i7, this.f15982c - i7);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f15982c) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f15982c);
        }
        System.arraycopy(this.f15981b, 0, objArr, 0, this.f15982c);
        int length = objArr.length;
        int i7 = this.f15982c;
        if (length > i7) {
            objArr[i7] = null;
        }
        return objArr;
    }
}
