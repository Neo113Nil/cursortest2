package r;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: r.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1393c implements Collection, Set {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f11673e = new int[0];

    /* renamed from: f, reason: collision with root package name */
    public static final Object[] f11674f = new Object[0];

    /* renamed from: g, reason: collision with root package name */
    public static Object[] f11675g;

    /* renamed from: h, reason: collision with root package name */
    public static int f11676h;

    /* renamed from: i, reason: collision with root package name */
    public static Object[] f11677i;

    /* renamed from: j, reason: collision with root package name */
    public static int f11678j;

    /* renamed from: a, reason: collision with root package name */
    public int[] f11679a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f11680b;

    /* renamed from: c, reason: collision with root package name */
    public int f11681c;

    /* renamed from: d, reason: collision with root package name */
    public C1391a f11682d;

    public C1393c(int i2) {
        if (i2 == 0) {
            this.f11679a = f11673e;
            this.f11680b = f11674f;
        } else {
            b(i2);
        }
        this.f11681c = 0;
    }

    public static void c(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (C1393c.class) {
                try {
                    if (f11678j < 10) {
                        objArr[0] = f11677i;
                        objArr[1] = iArr;
                        for (int i3 = i2 - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f11677i = objArr;
                        f11678j++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C1393c.class) {
                try {
                    if (f11676h < 10) {
                        objArr[0] = f11675g;
                        objArr[1] = iArr;
                        for (int i6 = i2 - 1; i6 >= 2; i6--) {
                            objArr[i6] = null;
                        }
                        f11675g = objArr;
                        f11676h++;
                    }
                } finally {
                }
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i2;
        int d6;
        if (obj == null) {
            d6 = e();
            i2 = 0;
        } else {
            int hashCode = obj.hashCode();
            i2 = hashCode;
            d6 = d(hashCode, obj);
        }
        if (d6 >= 0) {
            return false;
        }
        int i3 = ~d6;
        int i6 = this.f11681c;
        int[] iArr = this.f11679a;
        if (i6 >= iArr.length) {
            int i7 = 8;
            if (i6 >= 8) {
                i7 = (i6 >> 1) + i6;
            } else if (i6 < 4) {
                i7 = 4;
            }
            Object[] objArr = this.f11680b;
            b(i7);
            int[] iArr2 = this.f11679a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f11680b, 0, objArr.length);
            }
            c(iArr, objArr, this.f11681c);
        }
        int i8 = this.f11681c;
        if (i3 < i8) {
            int[] iArr3 = this.f11679a;
            int i9 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i9, i8 - i3);
            Object[] objArr2 = this.f11680b;
            System.arraycopy(objArr2, i3, objArr2, i9, this.f11681c - i3);
        }
        this.f11679a[i3] = i2;
        this.f11680b[i3] = obj;
        this.f11681c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f11681c;
        int[] iArr = this.f11679a;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.f11680b;
            b(size);
            int i2 = this.f11681c;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f11679a, 0, i2);
                System.arraycopy(objArr, 0, this.f11680b, 0, this.f11681c);
            }
            c(iArr, objArr, this.f11681c);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    public final void b(int i2) {
        if (i2 == 8) {
            synchronized (C1393c.class) {
                try {
                    Object[] objArr = f11677i;
                    if (objArr != null) {
                        this.f11680b = objArr;
                        f11677i = (Object[]) objArr[0];
                        this.f11679a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f11678j--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i2 == 4) {
            synchronized (C1393c.class) {
                try {
                    Object[] objArr2 = f11675g;
                    if (objArr2 != null) {
                        this.f11680b = objArr2;
                        f11675g = (Object[]) objArr2[0];
                        this.f11679a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f11676h--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f11679a = new int[i2];
        this.f11680b = new Object[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i2 = this.f11681c;
        if (i2 != 0) {
            c(this.f11679a, this.f11680b, i2);
            this.f11679a = f11673e;
            this.f11680b = f11674f;
            this.f11681c = 0;
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

    public final int d(int i2, Object obj) {
        int i3 = this.f11681c;
        if (i3 == 0) {
            return -1;
        }
        int a6 = AbstractC1394d.a(i3, i2, this.f11679a);
        if (a6 < 0) {
            return a6;
        }
        if (obj.equals(this.f11680b[a6])) {
            return a6;
        }
        int i6 = a6 + 1;
        while (i6 < i3 && this.f11679a[i6] == i2) {
            if (obj.equals(this.f11680b[i6])) {
                return i6;
            }
            i6++;
        }
        for (int i7 = a6 - 1; i7 >= 0 && this.f11679a[i7] == i2; i7--) {
            if (obj.equals(this.f11680b[i7])) {
                return i7;
            }
        }
        return ~i6;
    }

    public final int e() {
        int i2 = this.f11681c;
        if (i2 == 0) {
            return -1;
        }
        int a6 = AbstractC1394d.a(i2, 0, this.f11679a);
        if (a6 < 0) {
            return a6;
        }
        if (this.f11680b[a6] == null) {
            return a6;
        }
        int i3 = a6 + 1;
        while (i3 < i2 && this.f11679a[i3] == 0) {
            if (this.f11680b[i3] == null) {
                return i3;
            }
            i3++;
        }
        for (int i6 = a6 - 1; i6 >= 0 && this.f11679a[i6] == 0; i6--) {
            if (this.f11680b[i6] == null) {
                return i6;
            }
        }
        return ~i3;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f11681c != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f11681c; i2++) {
                try {
                    if (!set.contains(this.f11680b[i2])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f(int i2) {
        Object[] objArr = this.f11680b;
        Object obj = objArr[i2];
        int i3 = this.f11681c;
        if (i3 <= 1) {
            c(this.f11679a, objArr, i3);
            this.f11679a = f11673e;
            this.f11680b = f11674f;
            this.f11681c = 0;
            return;
        }
        int[] iArr = this.f11679a;
        if (iArr.length <= 8 || i3 >= iArr.length / 3) {
            int i6 = i3 - 1;
            this.f11681c = i6;
            if (i2 < i6) {
                int i7 = i2 + 1;
                System.arraycopy(iArr, i7, iArr, i2, i6 - i2);
                Object[] objArr2 = this.f11680b;
                System.arraycopy(objArr2, i7, objArr2, i2, this.f11681c - i2);
            }
            this.f11680b[this.f11681c] = null;
            return;
        }
        b(i3 > 8 ? i3 + (i3 >> 1) : 8);
        this.f11681c--;
        if (i2 > 0) {
            System.arraycopy(iArr, 0, this.f11679a, 0, i2);
            System.arraycopy(objArr, 0, this.f11680b, 0, i2);
        }
        int i8 = this.f11681c;
        if (i2 < i8) {
            int i9 = i2 + 1;
            System.arraycopy(iArr, i9, this.f11679a, i2, i8 - i2);
            System.arraycopy(objArr, i9, this.f11680b, i2, this.f11681c - i2);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f11679a;
        int i2 = this.f11681c;
        int i3 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            i3 += iArr[i6];
        }
        return i3;
    }

    public final int indexOf(Object obj) {
        return obj == null ? e() : d(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f11681c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (this.f11682d == null) {
            this.f11682d = new C1391a(1, this);
        }
        C1391a c1391a = this.f11682d;
        if (((C1398h) c1391a.f3503b) == null) {
            c1391a.f3503b = new C1398h(c1391a, 1);
        }
        return ((C1398h) c1391a.f3503b).iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        f(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i2 = this.f11681c - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f11680b[i2])) {
                f(i2);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f11681c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i2 = this.f11681c;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f11680b, 0, objArr, 0, i2);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f11681c * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f11681c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f11680b[i2];
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
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f11681c) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f11681c);
        }
        System.arraycopy(this.f11680b, 0, objArr, 0, this.f11681c);
        int length = objArr.length;
        int i2 = this.f11681c;
        if (length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }
}
