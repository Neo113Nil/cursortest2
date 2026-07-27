package p;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: p.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1153c implements Collection, Set {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f10186e = new int[0];
    public static final Object[] f = new Object[0];

    /* renamed from: g, reason: collision with root package name */
    public static Object[] f10187g;

    /* renamed from: h, reason: collision with root package name */
    public static int f10188h;

    /* renamed from: i, reason: collision with root package name */
    public static Object[] f10189i;

    /* renamed from: j, reason: collision with root package name */
    public static int f10190j;

    /* renamed from: a, reason: collision with root package name */
    public int[] f10191a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f10192b;

    /* renamed from: c, reason: collision with root package name */
    public int f10193c;

    /* renamed from: d, reason: collision with root package name */
    public C1151a f10194d;

    public C1153c(int i3) {
        if (i3 == 0) {
            this.f10191a = f10186e;
            this.f10192b = f;
        } else {
            b(i3);
        }
        this.f10193c = 0;
    }

    public static void c(int[] iArr, Object[] objArr, int i3) {
        if (iArr.length == 8) {
            synchronized (C1153c.class) {
                try {
                    if (f10190j < 10) {
                        objArr[0] = f10189i;
                        objArr[1] = iArr;
                        for (int i4 = i3 - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f10189i = objArr;
                        f10190j++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C1153c.class) {
                try {
                    if (f10188h < 10) {
                        objArr[0] = f10187g;
                        objArr[1] = iArr;
                        for (int i5 = i3 - 1; i5 >= 2; i5--) {
                            objArr[i5] = null;
                        }
                        f10187g = objArr;
                        f10188h++;
                    }
                } finally {
                }
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i3;
        int d3;
        if (obj == null) {
            d3 = e();
            i3 = 0;
        } else {
            int hashCode = obj.hashCode();
            i3 = hashCode;
            d3 = d(hashCode, obj);
        }
        if (d3 >= 0) {
            return false;
        }
        int i4 = ~d3;
        int i5 = this.f10193c;
        int[] iArr = this.f10191a;
        if (i5 >= iArr.length) {
            int i6 = 8;
            if (i5 >= 8) {
                i6 = (i5 >> 1) + i5;
            } else if (i5 < 4) {
                i6 = 4;
            }
            Object[] objArr = this.f10192b;
            b(i6);
            int[] iArr2 = this.f10191a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f10192b, 0, objArr.length);
            }
            c(iArr, objArr, this.f10193c);
        }
        int i7 = this.f10193c;
        if (i4 < i7) {
            int[] iArr3 = this.f10191a;
            int i8 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i8, i7 - i4);
            Object[] objArr2 = this.f10192b;
            System.arraycopy(objArr2, i4, objArr2, i8, this.f10193c - i4);
        }
        this.f10191a[i4] = i3;
        this.f10192b[i4] = obj;
        this.f10193c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f10193c;
        int[] iArr = this.f10191a;
        boolean z3 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f10192b;
            b(size);
            int i3 = this.f10193c;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.f10191a, 0, i3);
                System.arraycopy(objArr, 0, this.f10192b, 0, this.f10193c);
            }
            c(iArr, objArr, this.f10193c);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z3 |= add(it.next());
        }
        return z3;
    }

    public final void b(int i3) {
        if (i3 == 8) {
            synchronized (C1153c.class) {
                try {
                    Object[] objArr = f10189i;
                    if (objArr != null) {
                        this.f10192b = objArr;
                        f10189i = (Object[]) objArr[0];
                        this.f10191a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f10190j--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i3 == 4) {
            synchronized (C1153c.class) {
                try {
                    Object[] objArr2 = f10187g;
                    if (objArr2 != null) {
                        this.f10192b = objArr2;
                        f10187g = (Object[]) objArr2[0];
                        this.f10191a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f10188h--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f10191a = new int[i3];
        this.f10192b = new Object[i3];
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i3 = this.f10193c;
        if (i3 != 0) {
            c(this.f10191a, this.f10192b, i3);
            this.f10191a = f10186e;
            this.f10192b = f;
            this.f10193c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? e() : d(obj.hashCode(), obj)) >= 0;
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

    public final int d(int i3, Object obj) {
        int i4 = this.f10193c;
        if (i4 == 0) {
            return -1;
        }
        int a3 = AbstractC1154d.a(i4, i3, this.f10191a);
        if (a3 < 0 || obj.equals(this.f10192b[a3])) {
            return a3;
        }
        int i5 = a3 + 1;
        while (i5 < i4 && this.f10191a[i5] == i3) {
            if (obj.equals(this.f10192b[i5])) {
                return i5;
            }
            i5++;
        }
        for (int i6 = a3 - 1; i6 >= 0 && this.f10191a[i6] == i3; i6--) {
            if (obj.equals(this.f10192b[i6])) {
                return i6;
            }
        }
        return ~i5;
    }

    public final int e() {
        int i3 = this.f10193c;
        if (i3 == 0) {
            return -1;
        }
        int a3 = AbstractC1154d.a(i3, 0, this.f10191a);
        if (a3 < 0 || this.f10192b[a3] == null) {
            return a3;
        }
        int i4 = a3 + 1;
        while (i4 < i3 && this.f10191a[i4] == 0) {
            if (this.f10192b[i4] == null) {
                return i4;
            }
            i4++;
        }
        for (int i5 = a3 - 1; i5 >= 0 && this.f10191a[i5] == 0; i5--) {
            if (this.f10192b[i5] == null) {
                return i5;
            }
        }
        return ~i4;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f10193c != set.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.f10193c; i3++) {
                try {
                    if (!set.contains(this.f10192b[i3])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f(int i3) {
        Object[] objArr = this.f10192b;
        Object obj = objArr[i3];
        int i4 = this.f10193c;
        if (i4 <= 1) {
            c(this.f10191a, objArr, i4);
            this.f10191a = f10186e;
            this.f10192b = f;
            this.f10193c = 0;
            return;
        }
        int[] iArr = this.f10191a;
        if (iArr.length <= 8 || i4 >= iArr.length / 3) {
            int i5 = i4 - 1;
            this.f10193c = i5;
            if (i3 < i5) {
                int i6 = i3 + 1;
                System.arraycopy(iArr, i6, iArr, i3, i5 - i3);
                Object[] objArr2 = this.f10192b;
                System.arraycopy(objArr2, i6, objArr2, i3, this.f10193c - i3);
            }
            this.f10192b[this.f10193c] = null;
            return;
        }
        b(i4 > 8 ? i4 + (i4 >> 1) : 8);
        this.f10193c--;
        if (i3 > 0) {
            System.arraycopy(iArr, 0, this.f10191a, 0, i3);
            System.arraycopy(objArr, 0, this.f10192b, 0, i3);
        }
        int i7 = this.f10193c;
        if (i3 < i7) {
            int i8 = i3 + 1;
            System.arraycopy(iArr, i8, this.f10191a, i3, i7 - i3);
            System.arraycopy(objArr, i8, this.f10192b, i3, this.f10193c - i3);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f10191a;
        int i3 = this.f10193c;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            i4 += iArr[i5];
        }
        return i4;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f10193c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (this.f10194d == null) {
            this.f10194d = new C1151a(1, this);
        }
        C1151a c1151a = this.f10194d;
        if (c1151a.f10181b == null) {
            c1151a.f10181b = new C1158h(c1151a, 1);
        }
        return c1151a.f10181b.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int e3 = obj == null ? e() : d(obj.hashCode(), obj);
        if (e3 < 0) {
            return false;
        }
        f(e3);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= remove(it.next());
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z3 = false;
        for (int i3 = this.f10193c - 1; i3 >= 0; i3--) {
            if (!collection.contains(this.f10192b[i3])) {
                f(i3);
                z3 = true;
            }
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f10193c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i3 = this.f10193c;
        Object[] objArr = new Object[i3];
        System.arraycopy(this.f10192b, 0, objArr, 0, i3);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f10193c * 14);
        sb.append('{');
        for (int i3 = 0; i3 < this.f10193c; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = this.f10192b[i3];
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
        if (objArr.length < this.f10193c) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f10193c);
        }
        System.arraycopy(this.f10192b, 0, objArr, 0, this.f10193c);
        int length = objArr.length;
        int i3 = this.f10193c;
        if (length > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }
}
