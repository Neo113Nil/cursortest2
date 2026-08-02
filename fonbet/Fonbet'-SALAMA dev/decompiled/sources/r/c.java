package r;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class c implements Collection, Set {

    /* renamed from: A, reason: collision with root package name */
    public static int f15968A;

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f15969e = new int[0];

    /* renamed from: f, reason: collision with root package name */
    public static final Object[] f15970f = new Object[0];

    /* renamed from: x, reason: collision with root package name */
    public static Object[] f15971x;

    /* renamed from: y, reason: collision with root package name */
    public static int f15972y;

    /* renamed from: z, reason: collision with root package name */
    public static Object[] f15973z;

    /* renamed from: a, reason: collision with root package name */
    public int[] f15974a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f15975b;

    /* renamed from: c, reason: collision with root package name */
    public int f15976c;

    /* renamed from: d, reason: collision with root package name */
    public C1566a f15977d;

    public c(int i7) {
        if (i7 == 0) {
            this.f15974a = f15969e;
            this.f15975b = f15970f;
        } else {
            l(i7);
        }
        this.f15976c = 0;
    }

    public static void m(int[] iArr, Object[] objArr, int i7) {
        if (iArr.length == 8) {
            synchronized (c.class) {
                try {
                    if (f15968A < 10) {
                        objArr[0] = f15973z;
                        objArr[1] = iArr;
                        for (int i8 = i7 - 1; i8 >= 2; i8--) {
                            objArr[i8] = null;
                        }
                        f15973z = objArr;
                        f15968A++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (c.class) {
                try {
                    if (f15972y < 10) {
                        objArr[0] = f15971x;
                        objArr[1] = iArr;
                        for (int i9 = i7 - 1; i9 >= 2; i9--) {
                            objArr[i9] = null;
                        }
                        f15971x = objArr;
                        f15972y++;
                    }
                } finally {
                }
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i7;
        int t7;
        if (obj == null) {
            t7 = y();
            i7 = 0;
        } else {
            int hashCode = obj.hashCode();
            i7 = hashCode;
            t7 = t(hashCode, obj);
        }
        if (t7 >= 0) {
            return false;
        }
        int i8 = ~t7;
        int i9 = this.f15976c;
        int[] iArr = this.f15974a;
        if (i9 >= iArr.length) {
            int i10 = 8;
            if (i9 >= 8) {
                i10 = (i9 >> 1) + i9;
            } else if (i9 < 4) {
                i10 = 4;
            }
            Object[] objArr = this.f15975b;
            l(i10);
            int[] iArr2 = this.f15974a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f15975b, 0, objArr.length);
            }
            m(iArr, objArr, this.f15976c);
        }
        int i11 = this.f15976c;
        if (i8 < i11) {
            int[] iArr3 = this.f15974a;
            int i12 = i8 + 1;
            System.arraycopy(iArr3, i8, iArr3, i12, i11 - i8);
            Object[] objArr2 = this.f15975b;
            System.arraycopy(objArr2, i8, objArr2, i12, this.f15976c - i8);
        }
        this.f15974a[i8] = i7;
        this.f15975b[i8] = obj;
        this.f15976c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f15976c;
        int[] iArr = this.f15974a;
        boolean z4 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f15975b;
            l(size);
            int i7 = this.f15976c;
            if (i7 > 0) {
                System.arraycopy(iArr, 0, this.f15974a, 0, i7);
                System.arraycopy(objArr, 0, this.f15975b, 0, this.f15976c);
            }
            m(iArr, objArr, this.f15976c);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z4 |= add(it.next());
        }
        return z4;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i7 = this.f15976c;
        if (i7 != 0) {
            m(this.f15974a, this.f15975b, i7);
            this.f15974a = f15969e;
            this.f15975b = f15970f;
            this.f15976c = 0;
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
            if (this.f15976c != set.size()) {
                return false;
            }
            for (int i7 = 0; i7 < this.f15976c; i7++) {
                try {
                    if (!set.contains(this.f15975b[i7])) {
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
        int[] iArr = this.f15974a;
        int i7 = this.f15976c;
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
        return this.f15976c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (this.f15977d == null) {
            this.f15977d = new C1566a(this, 1);
        }
        C1566a c1566a = this.f15977d;
        if (((i) c1566a.f5805b) == null) {
            c1566a.f5805b = new i(c1566a, 1);
        }
        return ((i) c1566a.f5805b).iterator();
    }

    public final void l(int i7) {
        if (i7 == 8) {
            synchronized (c.class) {
                try {
                    Object[] objArr = f15973z;
                    if (objArr != null) {
                        this.f15975b = objArr;
                        f15973z = (Object[]) objArr[0];
                        this.f15974a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f15968A--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i7 == 4) {
            synchronized (c.class) {
                try {
                    Object[] objArr2 = f15971x;
                    if (objArr2 != null) {
                        this.f15975b = objArr2;
                        f15971x = (Object[]) objArr2[0];
                        this.f15974a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f15972y--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f15974a = new int[i7];
        this.f15975b = new Object[i7];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        z(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            z4 |= remove(it.next());
        }
        return z4;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z4 = false;
        for (int i7 = this.f15976c - 1; i7 >= 0; i7--) {
            if (!collection.contains(this.f15975b[i7])) {
                z(i7);
                z4 = true;
            }
        }
        return z4;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f15976c;
    }

    public final int t(int i7, Object obj) {
        int i8 = this.f15976c;
        if (i8 == 0) {
            return -1;
        }
        int a2 = e.a(this.f15974a, i8, i7);
        if (a2 < 0) {
            return a2;
        }
        if (obj.equals(this.f15975b[a2])) {
            return a2;
        }
        int i9 = a2 + 1;
        while (i9 < i8 && this.f15974a[i9] == i7) {
            if (obj.equals(this.f15975b[i9])) {
                return i9;
            }
            i9++;
        }
        for (int i10 = a2 - 1; i10 >= 0 && this.f15974a[i10] == i7; i10--) {
            if (obj.equals(this.f15975b[i10])) {
                return i10;
            }
        }
        return ~i9;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i7 = this.f15976c;
        Object[] objArr = new Object[i7];
        System.arraycopy(this.f15975b, 0, objArr, 0, i7);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f15976c * 14);
        sb.append('{');
        for (int i7 = 0; i7 < this.f15976c; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            Object obj = this.f15975b[i7];
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
        int i7 = this.f15976c;
        if (i7 == 0) {
            return -1;
        }
        int a2 = e.a(this.f15974a, i7, 0);
        if (a2 < 0) {
            return a2;
        }
        if (this.f15975b[a2] == null) {
            return a2;
        }
        int i8 = a2 + 1;
        while (i8 < i7 && this.f15974a[i8] == 0) {
            if (this.f15975b[i8] == null) {
                return i8;
            }
            i8++;
        }
        for (int i9 = a2 - 1; i9 >= 0 && this.f15974a[i9] == 0; i9--) {
            if (this.f15975b[i9] == null) {
                return i9;
            }
        }
        return ~i8;
    }

    public final void z(int i7) {
        Object[] objArr = this.f15975b;
        Object obj = objArr[i7];
        int i8 = this.f15976c;
        if (i8 <= 1) {
            m(this.f15974a, objArr, i8);
            this.f15974a = f15969e;
            this.f15975b = f15970f;
            this.f15976c = 0;
            return;
        }
        int[] iArr = this.f15974a;
        if (iArr.length <= 8 || i8 >= iArr.length / 3) {
            int i9 = i8 - 1;
            this.f15976c = i9;
            if (i7 < i9) {
                int i10 = i7 + 1;
                System.arraycopy(iArr, i10, iArr, i7, i9 - i7);
                Object[] objArr2 = this.f15975b;
                System.arraycopy(objArr2, i10, objArr2, i7, this.f15976c - i7);
            }
            this.f15975b[this.f15976c] = null;
            return;
        }
        l(i8 > 8 ? i8 + (i8 >> 1) : 8);
        this.f15976c--;
        if (i7 > 0) {
            System.arraycopy(iArr, 0, this.f15974a, 0, i7);
            System.arraycopy(objArr, 0, this.f15975b, 0, i7);
        }
        int i11 = this.f15976c;
        if (i7 < i11) {
            int i12 = i7 + 1;
            System.arraycopy(iArr, i12, this.f15974a, i7, i11 - i7);
            System.arraycopy(objArr, i12, this.f15975b, i7, this.f15976c - i7);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f15976c) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f15976c);
        }
        System.arraycopy(this.f15975b, 0, objArr, 0, this.f15976c);
        int length = objArr.length;
        int i7 = this.f15976c;
        if (length > i7) {
            objArr[i7] = null;
        }
        return objArr;
    }
}
