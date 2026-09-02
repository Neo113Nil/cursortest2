package f;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class i {

    /* renamed from: d, reason: collision with root package name */
    public static Object[] f1032d;

    /* renamed from: e, reason: collision with root package name */
    public static int f1033e;

    /* renamed from: f, reason: collision with root package name */
    public static Object[] f1034f;

    /* renamed from: g, reason: collision with root package name */
    public static int f1035g;

    /* renamed from: a, reason: collision with root package name */
    public int[] f1036a = d.f1018a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f1037b = d.f1019b;

    /* renamed from: c, reason: collision with root package name */
    public int f1038c = 0;

    public static void b(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (i.class) {
                try {
                    if (f1035g < 10) {
                        objArr[0] = f1034f;
                        objArr[1] = iArr;
                        for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f1034f = objArr;
                        f1035g++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (i.class) {
                try {
                    if (f1033e < 10) {
                        objArr[0] = f1032d;
                        objArr[1] = iArr;
                        for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f1032d = objArr;
                        f1033e++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i2) {
        if (i2 == 8) {
            synchronized (i.class) {
                try {
                    Object[] objArr = f1034f;
                    if (objArr != null) {
                        this.f1037b = objArr;
                        f1034f = (Object[]) objArr[0];
                        this.f1036a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f1035g--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i2 == 4) {
            synchronized (i.class) {
                try {
                    Object[] objArr2 = f1032d;
                    if (objArr2 != null) {
                        this.f1037b = objArr2;
                        f1032d = (Object[]) objArr2[0];
                        this.f1036a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f1033e--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f1036a = new int[i2];
        this.f1037b = new Object[i2 << 1];
    }

    public final int c(int i2, Object obj) {
        int i3 = this.f1038c;
        if (i3 == 0) {
            return -1;
        }
        try {
            int a2 = d.a(this.f1036a, i3, i2);
            if (a2 < 0) {
                return a2;
            }
            if (obj.equals(this.f1037b[a2 << 1])) {
                return a2;
            }
            int i4 = a2 + 1;
            while (i4 < i3 && this.f1036a[i4] == i2) {
                if (obj.equals(this.f1037b[i4 << 1])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = a2 - 1; i5 >= 0 && this.f1036a[i5] == i2; i5--) {
                if (obj.equals(this.f1037b[i5 << 1])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i2 = this.f1038c;
        if (i2 > 0) {
            int[] iArr = this.f1036a;
            Object[] objArr = this.f1037b;
            this.f1036a = d.f1018a;
            this.f1037b = d.f1019b;
            this.f1038c = 0;
            b(iArr, objArr, i2);
        }
        if (this.f1038c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return f(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i2 = this.f1038c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int a2 = d.a(this.f1036a, i2, 0);
            if (a2 < 0) {
                return a2;
            }
            if (this.f1037b[a2 << 1] == null) {
                return a2;
            }
            int i3 = a2 + 1;
            while (i3 < i2 && this.f1036a[i3] == 0) {
                if (this.f1037b[i3 << 1] == null) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = a2 - 1; i4 >= 0 && this.f1036a[i4] == 0; i4--) {
                if (this.f1037b[i4 << 1] == null) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f1038c != iVar.f1038c) {
                return false;
            }
            for (int i2 = 0; i2 < this.f1038c; i2++) {
                try {
                    Object[] objArr = this.f1037b;
                    int i3 = i2 << 1;
                    Object obj2 = objArr[i3];
                    Object obj3 = objArr[i3 + 1];
                    Object orDefault = iVar.getOrDefault(obj2, null);
                    if (obj3 == null) {
                        if (orDefault != null || !iVar.containsKey(obj2)) {
                            return false;
                        }
                    } else if (!obj3.equals(orDefault)) {
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
            if (this.f1038c != map.size()) {
                return false;
            }
            for (int i4 = 0; i4 < this.f1038c; i4++) {
                try {
                    Object[] objArr2 = this.f1037b;
                    int i5 = i4 << 1;
                    Object obj4 = objArr2[i5];
                    Object obj5 = objArr2[i5 + 1];
                    Object obj6 = map.get(obj4);
                    if (obj5 == null) {
                        if (obj6 != null || !map.containsKey(obj4)) {
                            return false;
                        }
                    } else if (!obj5.equals(obj6)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(Object obj) {
        int i2 = this.f1038c * 2;
        Object[] objArr = this.f1037b;
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

    public final Object g(int i2) {
        Object[] objArr = this.f1037b;
        int i3 = i2 << 1;
        Object obj = objArr[i3 + 1];
        int i4 = this.f1038c;
        int i5 = 0;
        if (i4 <= 1) {
            b(this.f1036a, objArr, i4);
            this.f1036a = d.f1018a;
            this.f1037b = d.f1019b;
        } else {
            int i6 = i4 - 1;
            int[] iArr = this.f1036a;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i2 < i6) {
                    int i7 = i2 + 1;
                    int i8 = i6 - i2;
                    System.arraycopy(iArr, i7, iArr, i2, i8);
                    Object[] objArr2 = this.f1037b;
                    System.arraycopy(objArr2, i7 << 1, objArr2, i3, i8 << 1);
                }
                Object[] objArr3 = this.f1037b;
                int i9 = i6 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                a(i4 > 8 ? i4 + (i4 >> 1) : 8);
                if (i4 != this.f1038c) {
                    throw new ConcurrentModificationException();
                }
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f1036a, 0, i2);
                    System.arraycopy(objArr, 0, this.f1037b, 0, i3);
                }
                if (i2 < i6) {
                    int i10 = i2 + 1;
                    int i11 = i6 - i2;
                    System.arraycopy(iArr, i10, this.f1036a, i2, i11);
                    System.arraycopy(objArr, i10 << 1, this.f1037b, i3, i11 << 1);
                }
            }
            i5 = i6;
        }
        if (i4 != this.f1038c) {
            throw new ConcurrentModificationException();
        }
        this.f1038c = i5;
        return obj;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d2 = d(obj);
        return d2 >= 0 ? this.f1037b[(d2 << 1) + 1] : obj2;
    }

    public final int hashCode() {
        int[] iArr = this.f1036a;
        Object[] objArr = this.f1037b;
        int i2 = this.f1038c;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            i5 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public final boolean isEmpty() {
        return this.f1038c <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i2;
        int c2;
        int i3 = this.f1038c;
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
            Object[] objArr = this.f1037b;
            Object obj3 = objArr[i4];
            objArr[i4] = obj2;
            return obj3;
        }
        int i5 = ~c2;
        int[] iArr = this.f1036a;
        if (i3 >= iArr.length) {
            int i6 = 8;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i6 = 4;
            }
            Object[] objArr2 = this.f1037b;
            a(i6);
            if (i3 != this.f1038c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f1036a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f1037b, 0, objArr2.length);
            }
            b(iArr, objArr2, i3);
        }
        if (i5 < i3) {
            int[] iArr3 = this.f1036a;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.f1037b;
            System.arraycopy(objArr3, i5 << 1, objArr3, i7 << 1, (this.f1038c - i5) << 1);
        }
        int i8 = this.f1038c;
        if (i3 == i8) {
            int[] iArr4 = this.f1036a;
            if (i5 < iArr4.length) {
                iArr4[i5] = i2;
                Object[] objArr4 = this.f1037b;
                int i9 = i5 << 1;
                objArr4[i9] = obj;
                objArr4[i9 + 1] = obj2;
                this.f1038c = i8 + 1;
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
        int d2 = d(obj);
        if (d2 >= 0) {
            return g(d2);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int d2 = d(obj);
        if (d2 < 0) {
            return null;
        }
        int i2 = (d2 << 1) + 1;
        Object[] objArr = this.f1037b;
        Object obj3 = objArr[i2];
        objArr[i2] = obj2;
        return obj3;
    }

    public final int size() {
        return this.f1038c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1038c * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1038c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            int i3 = i2 << 1;
            Object obj = this.f1037b[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object obj2 = this.f1037b[i3 + 1];
            if (obj2 != this) {
                sb.append(obj2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int d2 = d(obj);
        if (d2 < 0) {
            return false;
        }
        Object obj3 = this.f1037b[(d2 << 1) + 1];
        if (obj2 != obj3 && (obj2 == null || !obj2.equals(obj3))) {
            return false;
        }
        g(d2);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d2 = d(obj);
        if (d2 < 0) {
            return false;
        }
        int i2 = (d2 << 1) + 1;
        Object obj4 = this.f1037b[i2];
        if (obj4 != obj2 && (obj2 == null || !obj2.equals(obj4))) {
            return false;
        }
        Object[] objArr = this.f1037b;
        Object obj5 = objArr[i2];
        objArr[i2] = obj3;
        return true;
    }
}
