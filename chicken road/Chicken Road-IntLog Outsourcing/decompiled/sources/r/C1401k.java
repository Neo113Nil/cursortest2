package r;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: r.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1401k {

    /* renamed from: d, reason: collision with root package name */
    public static Object[] f11707d;

    /* renamed from: e, reason: collision with root package name */
    public static int f11708e;

    /* renamed from: f, reason: collision with root package name */
    public static Object[] f11709f;

    /* renamed from: g, reason: collision with root package name */
    public static int f11710g;

    /* renamed from: a, reason: collision with root package name */
    public int[] f11711a = AbstractC1394d.f11683a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f11712b = AbstractC1394d.f11684b;

    /* renamed from: c, reason: collision with root package name */
    public int f11713c = 0;

    public static void c(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (C1401k.class) {
                try {
                    if (f11710g < 10) {
                        objArr[0] = f11709f;
                        objArr[1] = iArr;
                        for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f11709f = objArr;
                        f11710g++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C1401k.class) {
                try {
                    if (f11708e < 10) {
                        objArr[0] = f11707d;
                        objArr[1] = iArr;
                        for (int i6 = (i2 << 1) - 1; i6 >= 2; i6--) {
                            objArr[i6] = null;
                        }
                        f11707d = objArr;
                        f11708e++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i2) {
        if (i2 == 8) {
            synchronized (C1401k.class) {
                try {
                    Object[] objArr = f11709f;
                    if (objArr != null) {
                        this.f11712b = objArr;
                        f11709f = (Object[]) objArr[0];
                        this.f11711a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f11710g--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i2 == 4) {
            synchronized (C1401k.class) {
                try {
                    Object[] objArr2 = f11707d;
                    if (objArr2 != null) {
                        this.f11712b = objArr2;
                        f11707d = (Object[]) objArr2[0];
                        this.f11711a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f11708e--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f11711a = new int[i2];
        this.f11712b = new Object[i2 << 1];
    }

    public final void clear() {
        int i2 = this.f11713c;
        if (i2 > 0) {
            int[] iArr = this.f11711a;
            Object[] objArr = this.f11712b;
            this.f11711a = AbstractC1394d.f11683a;
            this.f11712b = AbstractC1394d.f11684b;
            this.f11713c = 0;
            c(iArr, objArr, i2);
        }
        if (this.f11713c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public final int d(int i2, Object obj) {
        int i3 = this.f11713c;
        if (i3 == 0) {
            return -1;
        }
        try {
            int a6 = AbstractC1394d.a(i3, i2, this.f11711a);
            if (a6 < 0) {
                return a6;
            }
            if (obj.equals(this.f11712b[a6 << 1])) {
                return a6;
            }
            int i6 = a6 + 1;
            while (i6 < i3 && this.f11711a[i6] == i2) {
                if (obj.equals(this.f11712b[i6 << 1])) {
                    return i6;
                }
                i6++;
            }
            for (int i7 = a6 - 1; i7 >= 0 && this.f11711a[i7] == i2; i7--) {
                if (obj.equals(this.f11712b[i7 << 1])) {
                    return i7;
                }
            }
            return ~i6;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int e(Object obj) {
        return obj == null ? f() : d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1401k) {
            C1401k c1401k = (C1401k) obj;
            if (this.f11713c != c1401k.f11713c) {
                return false;
            }
            for (int i2 = 0; i2 < this.f11713c; i2++) {
                try {
                    Object h3 = h(i2);
                    Object j2 = j(i2);
                    Object orDefault = c1401k.getOrDefault(h3, null);
                    if (j2 == null) {
                        if (orDefault != null || !c1401k.containsKey(h3)) {
                            return false;
                        }
                    } else if (!j2.equals(orDefault)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f11713c != map.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.f11713c; i3++) {
                try {
                    Object h6 = h(i3);
                    Object j6 = j(i3);
                    Object obj2 = map.get(h6);
                    if (j6 == null) {
                        if (obj2 != null || !map.containsKey(h6)) {
                            return false;
                        }
                    } else if (!j6.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        int i2 = this.f11713c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int a6 = AbstractC1394d.a(i2, 0, this.f11711a);
            if (a6 < 0) {
                return a6;
            }
            if (this.f11712b[a6 << 1] == null) {
                return a6;
            }
            int i3 = a6 + 1;
            while (i3 < i2 && this.f11711a[i3] == 0) {
                if (this.f11712b[i3 << 1] == null) {
                    return i3;
                }
                i3++;
            }
            for (int i6 = a6 - 1; i6 >= 0 && this.f11711a[i6] == 0; i6--) {
                if (this.f11712b[i6 << 1] == null) {
                    return i6;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int g(Object obj) {
        int i2 = this.f11713c * 2;
        Object[] objArr = this.f11712b;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i6 = 1; i6 < i2; i6 += 2) {
            if (obj.equals(objArr[i6])) {
                return i6 >> 1;
            }
        }
        return -1;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int e3 = e(obj);
        return e3 >= 0 ? this.f11712b[(e3 << 1) + 1] : obj2;
    }

    public final Object h(int i2) {
        return this.f11712b[i2 << 1];
    }

    public final int hashCode() {
        int[] iArr = this.f11711a;
        Object[] objArr = this.f11712b;
        int i2 = this.f11713c;
        int i3 = 1;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i2) {
            Object obj = objArr[i3];
            i7 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i6];
            i6++;
            i3 += 2;
        }
        return i7;
    }

    public final Object i(int i2) {
        Object[] objArr = this.f11712b;
        int i3 = i2 << 1;
        Object obj = objArr[i3 + 1];
        int i6 = this.f11713c;
        int i7 = 0;
        if (i6 <= 1) {
            c(this.f11711a, objArr, i6);
            this.f11711a = AbstractC1394d.f11683a;
            this.f11712b = AbstractC1394d.f11684b;
        } else {
            int i8 = i6 - 1;
            int[] iArr = this.f11711a;
            if (iArr.length <= 8 || i6 >= iArr.length / 3) {
                if (i2 < i8) {
                    int i9 = i2 + 1;
                    int i10 = i8 - i2;
                    System.arraycopy(iArr, i9, iArr, i2, i10);
                    Object[] objArr2 = this.f11712b;
                    System.arraycopy(objArr2, i9 << 1, objArr2, i3, i10 << 1);
                }
                Object[] objArr3 = this.f11712b;
                int i11 = i8 << 1;
                objArr3[i11] = null;
                objArr3[i11 + 1] = null;
            } else {
                a(i6 > 8 ? i6 + (i6 >> 1) : 8);
                if (i6 != this.f11713c) {
                    throw new ConcurrentModificationException();
                }
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f11711a, 0, i2);
                    System.arraycopy(objArr, 0, this.f11712b, 0, i3);
                }
                if (i2 < i8) {
                    int i12 = i2 + 1;
                    int i13 = i8 - i2;
                    System.arraycopy(iArr, i12, this.f11711a, i2, i13);
                    System.arraycopy(objArr, i12 << 1, this.f11712b, i3, i13 << 1);
                }
            }
            i7 = i8;
        }
        if (i6 != this.f11713c) {
            throw new ConcurrentModificationException();
        }
        this.f11713c = i7;
        return obj;
    }

    public final boolean isEmpty() {
        return this.f11713c <= 0;
    }

    public final Object j(int i2) {
        return this.f11712b[(i2 << 1) + 1];
    }

    public final Object put(Object obj, Object obj2) {
        int i2;
        int d6;
        int i3 = this.f11713c;
        if (obj == null) {
            d6 = f();
            i2 = 0;
        } else {
            int hashCode = obj.hashCode();
            i2 = hashCode;
            d6 = d(hashCode, obj);
        }
        if (d6 >= 0) {
            int i6 = (d6 << 1) + 1;
            Object[] objArr = this.f11712b;
            Object obj3 = objArr[i6];
            objArr[i6] = obj2;
            return obj3;
        }
        int i7 = ~d6;
        int[] iArr = this.f11711a;
        if (i3 >= iArr.length) {
            int i8 = 8;
            if (i3 >= 8) {
                i8 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i8 = 4;
            }
            Object[] objArr2 = this.f11712b;
            a(i8);
            if (i3 != this.f11713c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f11711a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f11712b, 0, objArr2.length);
            }
            c(iArr, objArr2, i3);
        }
        if (i7 < i3) {
            int[] iArr3 = this.f11711a;
            int i9 = i7 + 1;
            System.arraycopy(iArr3, i7, iArr3, i9, i3 - i7);
            Object[] objArr3 = this.f11712b;
            System.arraycopy(objArr3, i7 << 1, objArr3, i9 << 1, (this.f11713c - i7) << 1);
        }
        int i10 = this.f11713c;
        if (i3 == i10) {
            int[] iArr4 = this.f11711a;
            if (i7 < iArr4.length) {
                iArr4[i7] = i2;
                Object[] objArr4 = this.f11712b;
                int i11 = i7 << 1;
                objArr4[i11] = obj;
                objArr4[i11 + 1] = obj2;
                this.f11713c = i10 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, null);
        return orDefault == null ? put(obj, obj2) : orDefault;
    }

    public final Object remove(Object obj) {
        int e3 = e(obj);
        if (e3 >= 0) {
            return i(e3);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int e3 = e(obj);
        if (e3 < 0) {
            return null;
        }
        int i2 = (e3 << 1) + 1;
        Object[] objArr = this.f11712b;
        Object obj3 = objArr[i2];
        objArr[i2] = obj2;
        return obj3;
    }

    public final int size() {
        return this.f11713c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f11713c * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f11713c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object h3 = h(i2);
            if (h3 != this) {
                sb.append(h3);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object j2 = j(i2);
            if (j2 != this) {
                sb.append(j2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int e3 = e(obj);
        if (e3 < 0) {
            return false;
        }
        Object j2 = j(e3);
        if (obj2 != j2 && (obj2 == null || !obj2.equals(j2))) {
            return false;
        }
        i(e3);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int e3 = e(obj);
        if (e3 < 0) {
            return false;
        }
        Object j2 = j(e3);
        if (j2 != obj2 && (obj2 == null || !obj2.equals(j2))) {
            return false;
        }
        int i2 = (e3 << 1) + 1;
        Object[] objArr = this.f11712b;
        Object obj4 = objArr[i2];
        objArr[i2] = obj3;
        return true;
    }
}
