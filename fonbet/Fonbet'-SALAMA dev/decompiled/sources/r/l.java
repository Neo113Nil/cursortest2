package r;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class l {

    /* renamed from: d, reason: collision with root package name */
    public static Object[] f16001d;

    /* renamed from: e, reason: collision with root package name */
    public static int f16002e;

    /* renamed from: f, reason: collision with root package name */
    public static Object[] f16003f;

    /* renamed from: x, reason: collision with root package name */
    public static int f16004x;

    /* renamed from: a, reason: collision with root package name */
    public int[] f16005a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f16006b;

    /* renamed from: c, reason: collision with root package name */
    public int f16007c;

    public l() {
        this.f16005a = e.f15982a;
        this.f16006b = e.f15983b;
        this.f16007c = 0;
    }

    public static void c(int[] iArr, Object[] objArr, int i7) {
        if (iArr.length == 8) {
            synchronized (l.class) {
                try {
                    if (f16004x < 10) {
                        objArr[0] = f16003f;
                        objArr[1] = iArr;
                        for (int i8 = (i7 << 1) - 1; i8 >= 2; i8--) {
                            objArr[i8] = null;
                        }
                        f16003f = objArr;
                        f16004x++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (l.class) {
                try {
                    if (f16002e < 10) {
                        objArr[0] = f16001d;
                        objArr[1] = iArr;
                        for (int i9 = (i7 << 1) - 1; i9 >= 2; i9--) {
                            objArr[i9] = null;
                        }
                        f16001d = objArr;
                        f16002e++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i7) {
        if (i7 == 8) {
            synchronized (l.class) {
                try {
                    Object[] objArr = f16003f;
                    if (objArr != null) {
                        this.f16006b = objArr;
                        f16003f = (Object[]) objArr[0];
                        this.f16005a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f16004x--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i7 == 4) {
            synchronized (l.class) {
                try {
                    Object[] objArr2 = f16001d;
                    if (objArr2 != null) {
                        this.f16006b = objArr2;
                        f16001d = (Object[]) objArr2[0];
                        this.f16005a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f16002e--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f16005a = new int[i7];
        this.f16006b = new Object[i7 << 1];
    }

    public final void b(int i7) {
        int i8 = this.f16007c;
        int[] iArr = this.f16005a;
        if (iArr.length < i7) {
            Object[] objArr = this.f16006b;
            a(i7);
            if (this.f16007c > 0) {
                System.arraycopy(iArr, 0, this.f16005a, 0, i8);
                System.arraycopy(objArr, 0, this.f16006b, 0, i8 << 1);
            }
            c(iArr, objArr, i8);
        }
        if (this.f16007c != i8) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i7 = this.f16007c;
        if (i7 > 0) {
            int[] iArr = this.f16005a;
            Object[] objArr = this.f16006b;
            this.f16005a = e.f15982a;
            this.f16006b = e.f15983b;
            this.f16007c = 0;
            c(iArr, objArr, i7);
        }
        if (this.f16007c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public final int d(int i7, Object obj) {
        int i8 = this.f16007c;
        if (i8 == 0) {
            return -1;
        }
        try {
            int a2 = e.a(this.f16005a, i8, i7);
            if (a2 < 0) {
                return a2;
            }
            if (obj.equals(this.f16006b[a2 << 1])) {
                return a2;
            }
            int i9 = a2 + 1;
            while (i9 < i8 && this.f16005a[i9] == i7) {
                if (obj.equals(this.f16006b[i9 << 1])) {
                    return i9;
                }
                i9++;
            }
            for (int i10 = a2 - 1; i10 >= 0 && this.f16005a[i10] == i7; i10--) {
                if (obj.equals(this.f16006b[i10 << 1])) {
                    return i10;
                }
            }
            return ~i9;
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
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f16007c != lVar.f16007c) {
                return false;
            }
            for (int i7 = 0; i7 < this.f16007c; i7++) {
                try {
                    Object h6 = h(i7);
                    Object j = j(i7);
                    Object orDefault = lVar.getOrDefault(h6, null);
                    if (j == null) {
                        if (orDefault != null || !lVar.containsKey(h6)) {
                            return false;
                        }
                    } else if (!j.equals(orDefault)) {
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
            if (this.f16007c != map.size()) {
                return false;
            }
            for (int i8 = 0; i8 < this.f16007c; i8++) {
                try {
                    Object h7 = h(i8);
                    Object j3 = j(i8);
                    Object obj2 = map.get(h7);
                    if (j3 == null) {
                        if (obj2 != null || !map.containsKey(h7)) {
                            return false;
                        }
                    } else if (!j3.equals(obj2)) {
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
        int i7 = this.f16007c;
        if (i7 == 0) {
            return -1;
        }
        try {
            int a2 = e.a(this.f16005a, i7, 0);
            if (a2 < 0) {
                return a2;
            }
            if (this.f16006b[a2 << 1] == null) {
                return a2;
            }
            int i8 = a2 + 1;
            while (i8 < i7 && this.f16005a[i8] == 0) {
                if (this.f16006b[i8 << 1] == null) {
                    return i8;
                }
                i8++;
            }
            for (int i9 = a2 - 1; i9 >= 0 && this.f16005a[i9] == 0; i9--) {
                if (this.f16006b[i9 << 1] == null) {
                    return i9;
                }
            }
            return ~i8;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int g(Object obj) {
        int i7 = this.f16007c * 2;
        Object[] objArr = this.f16006b;
        if (obj == null) {
            for (int i8 = 1; i8 < i7; i8 += 2) {
                if (objArr[i8] == null) {
                    return i8 >> 1;
                }
            }
            return -1;
        }
        for (int i9 = 1; i9 < i7; i9 += 2) {
            if (obj.equals(objArr[i9])) {
                return i9 >> 1;
            }
        }
        return -1;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int e7 = e(obj);
        return e7 >= 0 ? this.f16006b[(e7 << 1) + 1] : obj2;
    }

    public final Object h(int i7) {
        return this.f16006b[i7 << 1];
    }

    public final int hashCode() {
        int[] iArr = this.f16005a;
        Object[] objArr = this.f16006b;
        int i7 = this.f16007c;
        int i8 = 1;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i7) {
            Object obj = objArr[i8];
            i10 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i9];
            i9++;
            i8 += 2;
        }
        return i10;
    }

    public final Object i(int i7) {
        Object[] objArr = this.f16006b;
        int i8 = i7 << 1;
        Object obj = objArr[i8 + 1];
        int i9 = this.f16007c;
        int i10 = 0;
        if (i9 <= 1) {
            c(this.f16005a, objArr, i9);
            this.f16005a = e.f15982a;
            this.f16006b = e.f15983b;
        } else {
            int i11 = i9 - 1;
            int[] iArr = this.f16005a;
            if (iArr.length <= 8 || i9 >= iArr.length / 3) {
                if (i7 < i11) {
                    int i12 = i7 + 1;
                    int i13 = i11 - i7;
                    System.arraycopy(iArr, i12, iArr, i7, i13);
                    Object[] objArr2 = this.f16006b;
                    System.arraycopy(objArr2, i12 << 1, objArr2, i8, i13 << 1);
                }
                Object[] objArr3 = this.f16006b;
                int i14 = i11 << 1;
                objArr3[i14] = null;
                objArr3[i14 + 1] = null;
            } else {
                a(i9 > 8 ? i9 + (i9 >> 1) : 8);
                if (i9 != this.f16007c) {
                    throw new ConcurrentModificationException();
                }
                if (i7 > 0) {
                    System.arraycopy(iArr, 0, this.f16005a, 0, i7);
                    System.arraycopy(objArr, 0, this.f16006b, 0, i8);
                }
                if (i7 < i11) {
                    int i15 = i7 + 1;
                    int i16 = i11 - i7;
                    System.arraycopy(iArr, i15, this.f16005a, i7, i16);
                    System.arraycopy(objArr, i15 << 1, this.f16006b, i8, i16 << 1);
                }
            }
            i10 = i11;
        }
        if (i9 != this.f16007c) {
            throw new ConcurrentModificationException();
        }
        this.f16007c = i10;
        return obj;
    }

    public final boolean isEmpty() {
        return this.f16007c <= 0;
    }

    public final Object j(int i7) {
        return this.f16006b[(i7 << 1) + 1];
    }

    public final Object put(Object obj, Object obj2) {
        int i7;
        int d7;
        int i8 = this.f16007c;
        if (obj == null) {
            d7 = f();
            i7 = 0;
        } else {
            int hashCode = obj.hashCode();
            i7 = hashCode;
            d7 = d(hashCode, obj);
        }
        if (d7 >= 0) {
            int i9 = (d7 << 1) + 1;
            Object[] objArr = this.f16006b;
            Object obj3 = objArr[i9];
            objArr[i9] = obj2;
            return obj3;
        }
        int i10 = ~d7;
        int[] iArr = this.f16005a;
        if (i8 >= iArr.length) {
            int i11 = 8;
            if (i8 >= 8) {
                i11 = (i8 >> 1) + i8;
            } else if (i8 < 4) {
                i11 = 4;
            }
            Object[] objArr2 = this.f16006b;
            a(i11);
            if (i8 != this.f16007c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f16005a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f16006b, 0, objArr2.length);
            }
            c(iArr, objArr2, i8);
        }
        if (i10 < i8) {
            int[] iArr3 = this.f16005a;
            int i12 = i10 + 1;
            System.arraycopy(iArr3, i10, iArr3, i12, i8 - i10);
            Object[] objArr3 = this.f16006b;
            System.arraycopy(objArr3, i10 << 1, objArr3, i12 << 1, (this.f16007c - i10) << 1);
        }
        int i13 = this.f16007c;
        if (i8 == i13) {
            int[] iArr4 = this.f16005a;
            if (i10 < iArr4.length) {
                iArr4[i10] = i7;
                Object[] objArr4 = this.f16006b;
                int i14 = i10 << 1;
                objArr4[i14] = obj;
                objArr4[i14 + 1] = obj2;
                this.f16007c = i13 + 1;
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
        int e7 = e(obj);
        if (e7 >= 0) {
            return i(e7);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int e7 = e(obj);
        if (e7 < 0) {
            return null;
        }
        int i7 = (e7 << 1) + 1;
        Object[] objArr = this.f16006b;
        Object obj3 = objArr[i7];
        objArr[i7] = obj2;
        return obj3;
    }

    public final int size() {
        return this.f16007c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f16007c * 28);
        sb.append('{');
        for (int i7 = 0; i7 < this.f16007c; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            Object h6 = h(i7);
            if (h6 != this) {
                sb.append(h6);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object j = j(i7);
            if (j != this) {
                sb.append(j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int e7 = e(obj);
        if (e7 < 0) {
            return false;
        }
        Object j = j(e7);
        if (obj2 != j && (obj2 == null || !obj2.equals(j))) {
            return false;
        }
        i(e7);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int e7 = e(obj);
        if (e7 < 0) {
            return false;
        }
        Object j = j(e7);
        if (j != obj2 && (obj2 == null || !obj2.equals(j))) {
            return false;
        }
        int i7 = (e7 << 1) + 1;
        Object[] objArr = this.f16006b;
        Object obj4 = objArr[i7];
        objArr[i7] = obj3;
        return true;
    }

    public l(l lVar) {
        this();
        if (lVar != null) {
            int i7 = lVar.f16007c;
            b(i7);
            if (this.f16007c != 0) {
                for (int i8 = 0; i8 < i7; i8++) {
                    put(lVar.h(i8), lVar.j(i8));
                }
            } else if (i7 > 0) {
                System.arraycopy(lVar.f16005a, 0, this.f16005a, 0, i7);
                System.arraycopy(lVar.f16006b, 0, this.f16006b, 0, i7 << 1);
                this.f16007c = i7;
            }
        }
    }
}
