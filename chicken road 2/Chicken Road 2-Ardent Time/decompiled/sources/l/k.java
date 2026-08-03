package l;

/* loaded from: classes.dex */
public class k {

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.Object[] f8002d;

    /* renamed from: e, reason: collision with root package name */
    public static int f8003e;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.Object[] f8004f;

    /* renamed from: g, reason: collision with root package name */
    public static int f8005g;

    /* renamed from: a, reason: collision with root package name */
    public int[] f8006a = l.d.f7978a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Object[] f8007b = l.d.f7979b;

    /* renamed from: c, reason: collision with root package name */
    public int f8008c = 0;

    public static void b(int[] iArr, java.lang.Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (l.k.class) {
                try {
                    if (f8005g < 10) {
                        objArr[0] = f8004f;
                        objArr[1] = iArr;
                        for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f8004f = objArr;
                        f8005g++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (l.k.class) {
                try {
                    if (f8003e < 10) {
                        objArr[0] = f8002d;
                        objArr[1] = iArr;
                        for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f8002d = objArr;
                        f8003e++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i2) {
        if (i2 == 8) {
            synchronized (l.k.class) {
                try {
                    java.lang.Object[] objArr = f8004f;
                    if (objArr != null) {
                        this.f8007b = objArr;
                        f8004f = (java.lang.Object[]) objArr[0];
                        this.f8006a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f8005g--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i2 == 4) {
            synchronized (l.k.class) {
                try {
                    java.lang.Object[] objArr2 = f8002d;
                    if (objArr2 != null) {
                        this.f8007b = objArr2;
                        f8002d = (java.lang.Object[]) objArr2[0];
                        this.f8006a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f8003e--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f8006a = new int[i2];
        this.f8007b = new java.lang.Object[i2 << 1];
    }

    public final int c(int i2, java.lang.Object obj) {
        int i3 = this.f8008c;
        if (i3 == 0) {
            return -1;
        }
        try {
            int a2 = l.d.a(i3, i2, this.f8006a);
            if (a2 < 0) {
                return a2;
            }
            if (obj.equals(this.f8007b[a2 << 1])) {
                return a2;
            }
            int i4 = a2 + 1;
            while (i4 < i3 && this.f8006a[i4] == i2) {
                if (obj.equals(this.f8007b[i4 << 1])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = a2 - 1; i5 >= 0 && this.f8006a[i5] == i2; i5--) {
                if (obj.equals(this.f8007b[i5 << 1])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i2 = this.f8008c;
        if (i2 > 0) {
            int[] iArr = this.f8006a;
            java.lang.Object[] objArr = this.f8007b;
            this.f8006a = l.d.f7978a;
            this.f8007b = l.d.f7979b;
            this.f8008c = 0;
            b(iArr, objArr, i2);
        }
        if (this.f8008c > 0) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public final boolean containsKey(java.lang.Object obj) {
        return d(obj) >= 0;
    }

    public final boolean containsValue(java.lang.Object obj) {
        return f(obj) >= 0;
    }

    public final int d(java.lang.Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i2 = this.f8008c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int a2 = l.d.a(i2, 0, this.f8006a);
            if (a2 < 0) {
                return a2;
            }
            if (this.f8007b[a2 << 1] == null) {
                return a2;
            }
            int i3 = a2 + 1;
            while (i3 < i2 && this.f8006a[i3] == 0) {
                if (this.f8007b[i3 << 1] == null) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = a2 - 1; i4 >= 0 && this.f8006a[i4] == 0; i4--) {
                if (this.f8007b[i4 << 1] == null) {
                    return i4;
                }
            }
            return ~i3;
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l.k) {
            l.k kVar = (l.k) obj;
            if (this.f8008c != kVar.f8008c) {
                return false;
            }
            for (int i2 = 0; i2 < this.f8008c; i2++) {
                try {
                    java.lang.Object g2 = g(i2);
                    java.lang.Object i3 = i(i2);
                    java.lang.Object orDefault = kVar.getOrDefault(g2, null);
                    if (i3 == null) {
                        if (orDefault != null || !kVar.containsKey(g2)) {
                            return false;
                        }
                    } else if (!i3.equals(orDefault)) {
                        return false;
                    }
                } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof java.util.Map) {
            java.util.Map map = (java.util.Map) obj;
            if (this.f8008c != map.size()) {
                return false;
            }
            for (int i4 = 0; i4 < this.f8008c; i4++) {
                try {
                    java.lang.Object g3 = g(i4);
                    java.lang.Object i5 = i(i4);
                    java.lang.Object obj2 = map.get(g3);
                    if (i5 == null) {
                        if (obj2 != null || !map.containsKey(g3)) {
                            return false;
                        }
                    } else if (!i5.equals(obj2)) {
                        return false;
                    }
                } catch (java.lang.ClassCastException | java.lang.NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(java.lang.Object obj) {
        int i2 = this.f8008c * 2;
        java.lang.Object[] objArr = this.f8007b;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public final java.lang.Object g(int i2) {
        return this.f8007b[i2 << 1];
    }

    public final java.lang.Object get(java.lang.Object obj) {
        return getOrDefault(obj, null);
    }

    public final java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        int d2 = d(obj);
        return d2 >= 0 ? this.f8007b[(d2 << 1) + 1] : obj2;
    }

    public final java.lang.Object h(int i2) {
        java.lang.Object[] objArr = this.f8007b;
        int i3 = i2 << 1;
        java.lang.Object obj = objArr[i3 + 1];
        int i4 = this.f8008c;
        int i5 = 0;
        if (i4 <= 1) {
            b(this.f8006a, objArr, i4);
            this.f8006a = l.d.f7978a;
            this.f8007b = l.d.f7979b;
        } else {
            int i6 = i4 - 1;
            int[] iArr = this.f8006a;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i2 < i6) {
                    int i7 = i2 + 1;
                    int i8 = i6 - i2;
                    java.lang.System.arraycopy(iArr, i7, iArr, i2, i8);
                    java.lang.Object[] objArr2 = this.f8007b;
                    java.lang.System.arraycopy(objArr2, i7 << 1, objArr2, i3, i8 << 1);
                }
                java.lang.Object[] objArr3 = this.f8007b;
                int i9 = i6 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                a(i4 > 8 ? i4 + (i4 >> 1) : 8);
                if (i4 != this.f8008c) {
                    throw new java.util.ConcurrentModificationException();
                }
                if (i2 > 0) {
                    java.lang.System.arraycopy(iArr, 0, this.f8006a, 0, i2);
                    java.lang.System.arraycopy(objArr, 0, this.f8007b, 0, i3);
                }
                if (i2 < i6) {
                    int i10 = i2 + 1;
                    int i11 = i6 - i2;
                    java.lang.System.arraycopy(iArr, i10, this.f8006a, i2, i11);
                    java.lang.System.arraycopy(objArr, i10 << 1, this.f8007b, i3, i11 << 1);
                }
            }
            i5 = i6;
        }
        if (i4 != this.f8008c) {
            throw new java.util.ConcurrentModificationException();
        }
        this.f8008c = i5;
        return obj;
    }

    public final int hashCode() {
        int[] iArr = this.f8006a;
        java.lang.Object[] objArr = this.f8007b;
        int i2 = this.f8008c;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            java.lang.Object obj = objArr[i3];
            i5 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public final java.lang.Object i(int i2) {
        return this.f8007b[(i2 << 1) + 1];
    }

    public final boolean isEmpty() {
        return this.f8008c <= 0;
    }

    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        int i2;
        int c2;
        int i3 = this.f8008c;
        if (obj == null) {
            c2 = e();
            i2 = 0;
        } else {
            int hashCode = obj.hashCode();
            i2 = hashCode;
            c2 = c(hashCode, obj);
        }
        if (c2 >= 0) {
            int i4 = (c2 << 1) + 1;
            java.lang.Object[] objArr = this.f8007b;
            java.lang.Object obj3 = objArr[i4];
            objArr[i4] = obj2;
            return obj3;
        }
        int i5 = ~c2;
        int[] iArr = this.f8006a;
        if (i3 >= iArr.length) {
            int i6 = 8;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i6 = 4;
            }
            java.lang.Object[] objArr2 = this.f8007b;
            a(i6);
            if (i3 != this.f8008c) {
                throw new java.util.ConcurrentModificationException();
            }
            int[] iArr2 = this.f8006a;
            if (iArr2.length > 0) {
                java.lang.System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                java.lang.System.arraycopy(objArr2, 0, this.f8007b, 0, objArr2.length);
            }
            b(iArr, objArr2, i3);
        }
        if (i5 < i3) {
            int[] iArr3 = this.f8006a;
            int i7 = i5 + 1;
            java.lang.System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            java.lang.Object[] objArr3 = this.f8007b;
            java.lang.System.arraycopy(objArr3, i5 << 1, objArr3, i7 << 1, (this.f8008c - i5) << 1);
        }
        int i8 = this.f8008c;
        if (i3 == i8) {
            int[] iArr4 = this.f8006a;
            if (i5 < iArr4.length) {
                iArr4[i5] = i2;
                java.lang.Object[] objArr4 = this.f8007b;
                int i9 = i5 << 1;
                objArr4[i9] = obj;
                objArr4[i9 + 1] = obj2;
                this.f8008c = i8 + 1;
                return null;
            }
        }
        throw new java.util.ConcurrentModificationException();
    }

    public final java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object orDefault = getOrDefault(obj, null);
        return orDefault == null ? put(obj, obj2) : orDefault;
    }

    public final java.lang.Object remove(java.lang.Object obj) {
        int d2 = d(obj);
        if (d2 >= 0) {
            return h(d2);
        }
        return null;
    }

    public final java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        int d2 = d(obj);
        if (d2 < 0) {
            return null;
        }
        int i2 = (d2 << 1) + 1;
        java.lang.Object[] objArr = this.f8007b;
        java.lang.Object obj3 = objArr[i2];
        objArr[i2] = obj2;
        return obj3;
    }

    public final int size() {
        return this.f8008c;
    }

    public final java.lang.String toString() {
        if (isEmpty()) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.f8008c * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f8008c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            java.lang.Object g2 = g(i2);
            if (g2 != this) {
                sb.append(g2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            java.lang.Object i3 = i(i2);
            if (i3 != this) {
                sb.append(i3);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        int d2 = d(obj);
        if (d2 < 0) {
            return false;
        }
        java.lang.Object i2 = i(d2);
        if (obj2 != i2 && (obj2 == null || !obj2.equals(i2))) {
            return false;
        }
        h(d2);
        return true;
    }

    public final boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int d2 = d(obj);
        if (d2 < 0) {
            return false;
        }
        java.lang.Object i2 = i(d2);
        if (i2 != obj2 && (obj2 == null || !obj2.equals(i2))) {
            return false;
        }
        int i3 = (d2 << 1) + 1;
        java.lang.Object[] objArr = this.f8007b;
        java.lang.Object obj4 = objArr[i3];
        objArr[i3] = obj3;
        return true;
    }
}
