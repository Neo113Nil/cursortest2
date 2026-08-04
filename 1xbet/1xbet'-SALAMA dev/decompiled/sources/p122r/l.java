package p122r;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Object[] f16007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f16008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Object[] f16009f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static int f16010x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f16011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f16012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16013c;

    public l() {
        this.f16011a = e.f15988a;
        this.f16012b = e.f15989b;
        this.f16013c = 0;
    }

    public static void c(int[] iArr, Object[] objArr, int i7) {
        if (iArr.length == 8) {
            synchronized (l.class) {
                try {
                    if (f16010x < 10) {
                        objArr[0] = f16009f;
                        objArr[1] = iArr;
                        for (int i8 = (i7 << 1) - 1; i8 >= 2; i8--) {
                            objArr[i8] = null;
                        }
                        f16009f = objArr;
                        f16010x++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (l.class) {
                try {
                    if (f16008e < 10) {
                        objArr[0] = f16007d;
                        objArr[1] = iArr;
                        for (int i9 = (i7 << 1) - 1; i9 >= 2; i9--) {
                            objArr[i9] = null;
                        }
                        f16007d = objArr;
                        f16008e++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void a(int i7) {
        if (i7 == 8) {
            synchronized (l.class) {
                try {
                    Object[] objArr = f16009f;
                    if (objArr != null) {
                        this.f16012b = objArr;
                        f16009f = (Object[]) objArr[0];
                        this.f16011a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f16010x--;
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (i7 == 4) {
            synchronized (l.class) {
                try {
                    Object[] objArr2 = f16007d;
                    if (objArr2 != null) {
                        this.f16012b = objArr2;
                        f16007d = (Object[]) objArr2[0];
                        this.f16011a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f16008e--;
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f16011a = new int[i7];
        this.f16012b = new Object[i7 << 1];
    }

    public final void b(int i7) {
        int i8 = this.f16013c;
        int[] iArr = this.f16011a;
        if (iArr.length < i7) {
            Object[] objArr = this.f16012b;
            a(i7);
            if (this.f16013c > 0) {
                System.arraycopy(iArr, 0, this.f16011a, 0, i8);
                System.arraycopy(objArr, 0, this.f16012b, 0, i8 << 1);
            }
            c(iArr, objArr, i8);
        }
        if (this.f16013c != i8) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i7 = this.f16013c;
        if (i7 > 0) {
            int[] iArr = this.f16011a;
            Object[] objArr = this.f16012b;
            this.f16011a = e.f15988a;
            this.f16012b = e.f15989b;
            this.f16013c = 0;
            c(iArr, objArr, i7);
        }
        if (this.f16013c > 0) {
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
        int i8 = this.f16013c;
        if (i8 == 0) {
            return -1;
        }
        try {
            int iA = e.a(this.f16011a, i8, i7);
            if (iA < 0 || obj.equals(this.f16012b[iA << 1])) {
                return iA;
            }
            int i9 = iA + 1;
            while (i9 < i8 && this.f16011a[i9] == i7) {
                if (obj.equals(this.f16012b[i9 << 1])) {
                    return i9;
                }
                i9++;
            }
            for (int i10 = iA - 1; i10 >= 0 && this.f16011a[i10] == i7; i10--) {
                if (obj.equals(this.f16012b[i10 << 1])) {
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
            if (this.f16013c != lVar.f16013c) {
                return false;
            }
            for (int i7 = 0; i7 < this.f16013c; i7++) {
                try {
                    Object objH = h(i7);
                    Object objJ = j(i7);
                    Object orDefault = lVar.getOrDefault(objH, null);
                    if (objJ == null) {
                        if (orDefault != null || !lVar.containsKey(objH)) {
                            return false;
                        }
                    } else if (!objJ.equals(orDefault)) {
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
            if (this.f16013c != map.size()) {
                return false;
            }
            for (int i8 = 0; i8 < this.f16013c; i8++) {
                try {
                    Object objH2 = h(i8);
                    Object objJ2 = j(i8);
                    Object obj2 = map.get(objH2);
                    if (objJ2 == null) {
                        if (obj2 != null || !map.containsKey(objH2)) {
                            return false;
                        }
                    } else if (!objJ2.equals(obj2)) {
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
        int i7 = this.f16013c;
        if (i7 == 0) {
            return -1;
        }
        try {
            int iA = e.a(this.f16011a, i7, 0);
            if (iA < 0 || this.f16012b[iA << 1] == null) {
                return iA;
            }
            int i8 = iA + 1;
            while (i8 < i7 && this.f16011a[i8] == 0) {
                if (this.f16012b[i8 << 1] == null) {
                    return i8;
                }
                i8++;
            }
            for (int i9 = iA - 1; i9 >= 0 && this.f16011a[i9] == 0; i9--) {
                if (this.f16012b[i9 << 1] == null) {
                    return i9;
                }
            }
            return ~i8;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int g(Object obj) {
        int i7 = this.f16013c * 2;
        Object[] objArr = this.f16012b;
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
        int iE = e(obj);
        return iE >= 0 ? this.f16012b[(iE << 1) + 1] : obj2;
    }

    public final Object h(int i7) {
        return this.f16012b[i7 << 1];
    }

    public final int hashCode() {
        int[] iArr = this.f16011a;
        Object[] objArr = this.f16012b;
        int i7 = this.f16013c;
        int i8 = 1;
        int i9 = 0;
        int iHashCode = 0;
        while (i9 < i7) {
            Object obj = objArr[i8];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i9];
            i9++;
            i8 += 2;
        }
        return iHashCode;
    }

    public final Object i(int i7) {
        Object[] objArr = this.f16012b;
        int i8 = i7 << 1;
        Object obj = objArr[i8 + 1];
        int i9 = this.f16013c;
        int i10 = 0;
        if (i9 <= 1) {
            c(this.f16011a, objArr, i9);
            this.f16011a = e.f15988a;
            this.f16012b = e.f15989b;
        } else {
            int i11 = i9 - 1;
            int[] iArr = this.f16011a;
            if (iArr.length <= 8 || i9 >= iArr.length / 3) {
                if (i7 < i11) {
                    int i12 = i7 + 1;
                    int i13 = i11 - i7;
                    System.arraycopy(iArr, i12, iArr, i7, i13);
                    Object[] objArr2 = this.f16012b;
                    System.arraycopy(objArr2, i12 << 1, objArr2, i8, i13 << 1);
                }
                Object[] objArr3 = this.f16012b;
                int i14 = i11 << 1;
                objArr3[i14] = null;
                objArr3[i14 + 1] = null;
            } else {
                a(i9 > 8 ? i9 + (i9 >> 1) : 8);
                if (i9 != this.f16013c) {
                    throw new ConcurrentModificationException();
                }
                if (i7 > 0) {
                    System.arraycopy(iArr, 0, this.f16011a, 0, i7);
                    System.arraycopy(objArr, 0, this.f16012b, 0, i8);
                }
                if (i7 < i11) {
                    int i15 = i7 + 1;
                    int i16 = i11 - i7;
                    System.arraycopy(iArr, i15, this.f16011a, i7, i16);
                    System.arraycopy(objArr, i15 << 1, this.f16012b, i8, i16 << 1);
                }
            }
            i10 = i11;
        }
        if (i9 != this.f16013c) {
            throw new ConcurrentModificationException();
        }
        this.f16013c = i10;
        return obj;
    }

    public final boolean isEmpty() {
        return this.f16013c <= 0;
    }

    public final Object j(int i7) {
        return this.f16012b[(i7 << 1) + 1];
    }

    public final Object put(Object obj, Object obj2) {
        int i7;
        int iD;
        int i8 = this.f16013c;
        if (obj == null) {
            iD = f();
            i7 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i7 = iHashCode;
            iD = d(iHashCode, obj);
        }
        if (iD >= 0) {
            int i9 = (iD << 1) + 1;
            Object[] objArr = this.f16012b;
            Object obj3 = objArr[i9];
            objArr[i9] = obj2;
            return obj3;
        }
        int i10 = ~iD;
        int[] iArr = this.f16011a;
        if (i8 >= iArr.length) {
            int i11 = 8;
            if (i8 >= 8) {
                i11 = (i8 >> 1) + i8;
            } else if (i8 < 4) {
                i11 = 4;
            }
            Object[] objArr2 = this.f16012b;
            a(i11);
            if (i8 != this.f16013c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f16011a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f16012b, 0, objArr2.length);
            }
            c(iArr, objArr2, i8);
        }
        if (i10 < i8) {
            int[] iArr3 = this.f16011a;
            int i12 = i10 + 1;
            System.arraycopy(iArr3, i10, iArr3, i12, i8 - i10);
            Object[] objArr3 = this.f16012b;
            System.arraycopy(objArr3, i10 << 1, objArr3, i12 << 1, (this.f16013c - i10) << 1);
        }
        int i13 = this.f16013c;
        if (i8 == i13) {
            int[] iArr4 = this.f16011a;
            if (i10 < iArr4.length) {
                iArr4[i10] = i7;
                Object[] objArr4 = this.f16012b;
                int i14 = i10 << 1;
                objArr4[i14] = obj;
                objArr4[i14 + 1] = obj2;
                this.f16013c = i13 + 1;
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
        int iE = e(obj);
        if (iE >= 0) {
            return i(iE);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iE = e(obj);
        if (iE < 0) {
            return null;
        }
        int i7 = (iE << 1) + 1;
        Object[] objArr = this.f16012b;
        Object obj3 = objArr[i7];
        objArr[i7] = obj2;
        return obj3;
    }

    public final int size() {
        return this.f16013c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f16013c * 28);
        sb.append('{');
        for (int i7 = 0; i7 < this.f16013c; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            Object objH = h(i7);
            if (objH != this) {
                sb.append(objH);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objJ = j(i7);
            if (objJ != this) {
                sb.append(objJ);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int iE = e(obj);
        if (iE < 0) {
            return false;
        }
        Object objJ = j(iE);
        if (obj2 != objJ && (obj2 == null || !obj2.equals(objJ))) {
            return false;
        }
        i(iE);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iE = e(obj);
        if (iE < 0) {
            return false;
        }
        Object objJ = j(iE);
        if (objJ != obj2 && (obj2 == null || !obj2.equals(objJ))) {
            return false;
        }
        int i7 = (iE << 1) + 1;
        Object[] objArr = this.f16012b;
        Object obj4 = objArr[i7];
        objArr[i7] = obj3;
        return true;
    }

    public l(l lVar) {
        this();
        if (lVar != null) {
            int i7 = lVar.f16013c;
            b(i7);
            if (this.f16013c != 0) {
                for (int i8 = 0; i8 < i7; i8++) {
                    put(lVar.h(i8), lVar.j(i8));
                }
            } else if (i7 > 0) {
                System.arraycopy(lVar.f16011a, 0, this.f16011a, 0, i7);
                System.arraycopy(lVar.f16012b, 0, this.f16012b, 0, i7 << 1);
                this.f16013c = i7;
            }
        }
    }
}
