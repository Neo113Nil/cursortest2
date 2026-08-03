package l;

/* renamed from: l.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0925c implements java.util.Collection, java.util.Set {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f7968e = new int[0];

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.Object[] f7969f = new java.lang.Object[0];

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.Object[] f7970g;

    /* renamed from: h, reason: collision with root package name */
    public static int f7971h;

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.Object[] f7972i;

    /* renamed from: j, reason: collision with root package name */
    public static int f7973j;

    /* renamed from: a, reason: collision with root package name */
    public int[] f7974a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Object[] f7975b;

    /* renamed from: c, reason: collision with root package name */
    public int f7976c;

    /* renamed from: d, reason: collision with root package name */
    public l.C0923a f7977d;

    public C0925c(int i2) {
        if (i2 == 0) {
            this.f7974a = f7968e;
            this.f7975b = f7969f;
        } else {
            a(i2);
        }
        this.f7976c = 0;
    }

    public static void b(int[] iArr, java.lang.Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (l.C0925c.class) {
                try {
                    if (f7973j < 10) {
                        objArr[0] = f7972i;
                        objArr[1] = iArr;
                        for (int i3 = i2 - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f7972i = objArr;
                        f7973j++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (l.C0925c.class) {
                try {
                    if (f7971h < 10) {
                        objArr[0] = f7970g;
                        objArr[1] = iArr;
                        for (int i4 = i2 - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f7970g = objArr;
                        f7971h++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i2) {
        if (i2 == 8) {
            synchronized (l.C0925c.class) {
                try {
                    java.lang.Object[] objArr = f7972i;
                    if (objArr != null) {
                        this.f7975b = objArr;
                        f7972i = (java.lang.Object[]) objArr[0];
                        this.f7974a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f7973j--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i2 == 4) {
            synchronized (l.C0925c.class) {
                try {
                    java.lang.Object[] objArr2 = f7970g;
                    if (objArr2 != null) {
                        this.f7975b = objArr2;
                        f7970g = (java.lang.Object[]) objArr2[0];
                        this.f7974a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f7971h--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f7974a = new int[i2];
        this.f7975b = new java.lang.Object[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object obj) {
        int i2;
        int c2;
        if (obj == null) {
            c2 = d();
            i2 = 0;
        } else {
            int hashCode = obj.hashCode();
            i2 = hashCode;
            c2 = c(hashCode, obj);
        }
        if (c2 >= 0) {
            return false;
        }
        int i3 = ~c2;
        int i4 = this.f7976c;
        int[] iArr = this.f7974a;
        if (i4 >= iArr.length) {
            int i5 = 8;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i5 = 4;
            }
            java.lang.Object[] objArr = this.f7975b;
            a(i5);
            int[] iArr2 = this.f7974a;
            if (iArr2.length > 0) {
                java.lang.System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                java.lang.System.arraycopy(objArr, 0, this.f7975b, 0, objArr.length);
            }
            b(iArr, objArr, this.f7976c);
        }
        int i6 = this.f7976c;
        if (i3 < i6) {
            int[] iArr3 = this.f7974a;
            int i7 = i3 + 1;
            java.lang.System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            java.lang.Object[] objArr2 = this.f7975b;
            java.lang.System.arraycopy(objArr2, i3, objArr2, i7, this.f7976c - i3);
        }
        this.f7974a[i3] = i2;
        this.f7975b[i3] = obj;
        this.f7976c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection collection) {
        int size = collection.size() + this.f7976c;
        int[] iArr = this.f7974a;
        boolean z2 = false;
        if (iArr.length < size) {
            java.lang.Object[] objArr = this.f7975b;
            a(size);
            int i2 = this.f7976c;
            if (i2 > 0) {
                java.lang.System.arraycopy(iArr, 0, this.f7974a, 0, i2);
                java.lang.System.arraycopy(objArr, 0, this.f7975b, 0, this.f7976c);
            }
            b(iArr, objArr, this.f7976c);
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            z2 |= add(it.next());
        }
        return z2;
    }

    public final int c(int i2, java.lang.Object obj) {
        int i3 = this.f7976c;
        if (i3 == 0) {
            return -1;
        }
        int a2 = l.d.a(i3, i2, this.f7974a);
        if (a2 < 0) {
            return a2;
        }
        if (obj.equals(this.f7975b[a2])) {
            return a2;
        }
        int i4 = a2 + 1;
        while (i4 < i3 && this.f7974a[i4] == i2) {
            if (obj.equals(this.f7975b[i4])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = a2 - 1; i5 >= 0 && this.f7974a[i5] == i2; i5--) {
            if (obj.equals(this.f7975b[i5])) {
                return i5;
            }
        }
        return ~i4;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i2 = this.f7976c;
        if (i2 != 0) {
            b(this.f7974a, this.f7975b, i2);
            this.f7974a = f7968e;
            this.f7975b = f7969f;
            this.f7976c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int d() {
        int i2 = this.f7976c;
        if (i2 == 0) {
            return -1;
        }
        int a2 = l.d.a(i2, 0, this.f7974a);
        if (a2 < 0) {
            return a2;
        }
        if (this.f7975b[a2] == null) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.f7974a[i3] == 0) {
            if (this.f7975b[i3] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = a2 - 1; i4 >= 0 && this.f7974a[i4] == 0; i4--) {
            if (this.f7975b[i4] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    public final void e(int i2) {
        java.lang.Object[] objArr = this.f7975b;
        java.lang.Object obj = objArr[i2];
        int i3 = this.f7976c;
        if (i3 <= 1) {
            b(this.f7974a, objArr, i3);
            this.f7974a = f7968e;
            this.f7975b = f7969f;
            this.f7976c = 0;
            return;
        }
        int[] iArr = this.f7974a;
        if (iArr.length <= 8 || i3 >= iArr.length / 3) {
            int i4 = i3 - 1;
            this.f7976c = i4;
            if (i2 < i4) {
                int i5 = i2 + 1;
                java.lang.System.arraycopy(iArr, i5, iArr, i2, i4 - i2);
                java.lang.Object[] objArr2 = this.f7975b;
                java.lang.System.arraycopy(objArr2, i5, objArr2, i2, this.f7976c - i2);
            }
            this.f7975b[this.f7976c] = null;
            return;
        }
        a(i3 > 8 ? i3 + (i3 >> 1) : 8);
        this.f7976c--;
        if (i2 > 0) {
            java.lang.System.arraycopy(iArr, 0, this.f7974a, 0, i2);
            java.lang.System.arraycopy(objArr, 0, this.f7975b, 0, i2);
        }
        int i6 = this.f7976c;
        if (i2 < i6) {
            int i7 = i2 + 1;
            java.lang.System.arraycopy(iArr, i7, this.f7974a, i2, i6 - i2);
            java.lang.System.arraycopy(objArr, i7, this.f7975b, i2, this.f7976c - i2);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set = (java.util.Set) obj;
            if (this.f7976c != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f7976c; i2++) {
                try {
                    if (!set.contains(this.f7975b[i2])) {
                        return false;
                    }
                } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f7974a;
        int i2 = this.f7976c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public final int indexOf(java.lang.Object obj) {
        return obj == null ? d() : c(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f7976c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        if (this.f7977d == null) {
            this.f7977d = new l.C0923a(1, this);
        }
        l.C0923a c0923a = this.f7977d;
        if (c0923a.f7963b == null) {
            c0923a.f7963b = new l.h(c0923a, 1);
        }
        return c0923a.f7963b.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        e(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= remove(it.next());
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection collection) {
        boolean z2 = false;
        for (int i2 = this.f7976c - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f7975b[i2])) {
                e(i2);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f7976c;
    }

    @Override // java.util.Collection, java.util.Set
    public final java.lang.Object[] toArray() {
        int i2 = this.f7976c;
        java.lang.Object[] objArr = new java.lang.Object[i2];
        java.lang.System.arraycopy(this.f7975b, 0, objArr, 0, i2);
        return objArr;
    }

    public final java.lang.String toString() {
        if (isEmpty()) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.f7976c * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f7976c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            java.lang.Object obj = this.f7975b[i2];
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
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        if (objArr.length < this.f7976c) {
            objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), this.f7976c);
        }
        java.lang.System.arraycopy(this.f7975b, 0, objArr, 0, this.f7976c);
        int length = objArr.length;
        int i2 = this.f7976c;
        if (length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }
}
