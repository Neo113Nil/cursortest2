package p;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: p.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1161k {

    /* renamed from: d, reason: collision with root package name */
    public static Object[] f10219d;

    /* renamed from: e, reason: collision with root package name */
    public static int f10220e;
    public static Object[] f;

    /* renamed from: g, reason: collision with root package name */
    public static int f10221g;

    /* renamed from: a, reason: collision with root package name */
    public int[] f10222a = AbstractC1154d.f10195a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f10223b = AbstractC1154d.f10196b;

    /* renamed from: c, reason: collision with root package name */
    public int f10224c = 0;

    public static void b(int[] iArr, Object[] objArr, int i3) {
        if (iArr.length == 8) {
            synchronized (C1161k.class) {
                try {
                    if (f10221g < 10) {
                        objArr[0] = f;
                        objArr[1] = iArr;
                        for (int i4 = (i3 << 1) - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f = objArr;
                        f10221g++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C1161k.class) {
                try {
                    if (f10220e < 10) {
                        objArr[0] = f10219d;
                        objArr[1] = iArr;
                        for (int i5 = (i3 << 1) - 1; i5 >= 2; i5--) {
                            objArr[i5] = null;
                        }
                        f10219d = objArr;
                        f10220e++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i3) {
        if (i3 == 8) {
            synchronized (C1161k.class) {
                try {
                    Object[] objArr = f;
                    if (objArr != null) {
                        this.f10223b = objArr;
                        f = (Object[]) objArr[0];
                        this.f10222a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f10221g--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i3 == 4) {
            synchronized (C1161k.class) {
                try {
                    Object[] objArr2 = f10219d;
                    if (objArr2 != null) {
                        this.f10223b = objArr2;
                        f10219d = (Object[]) objArr2[0];
                        this.f10222a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f10220e--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f10222a = new int[i3];
        this.f10223b = new Object[i3 << 1];
    }

    public final int c(int i3, Object obj) {
        int i4 = this.f10224c;
        if (i4 == 0) {
            return -1;
        }
        try {
            int a3 = AbstractC1154d.a(i4, i3, this.f10222a);
            if (a3 < 0 || obj.equals(this.f10223b[a3 << 1])) {
                return a3;
            }
            int i5 = a3 + 1;
            while (i5 < i4 && this.f10222a[i5] == i3) {
                if (obj.equals(this.f10223b[i5 << 1])) {
                    return i5;
                }
                i5++;
            }
            for (int i6 = a3 - 1; i6 >= 0 && this.f10222a[i6] == i3; i6--) {
                if (obj.equals(this.f10223b[i6 << 1])) {
                    return i6;
                }
            }
            return ~i5;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i3 = this.f10224c;
        if (i3 > 0) {
            int[] iArr = this.f10222a;
            Object[] objArr = this.f10223b;
            this.f10222a = AbstractC1154d.f10195a;
            this.f10223b = AbstractC1154d.f10196b;
            this.f10224c = 0;
            b(iArr, objArr, i3);
        }
        if (this.f10224c > 0) {
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
        int i3 = this.f10224c;
        if (i3 == 0) {
            return -1;
        }
        try {
            int a3 = AbstractC1154d.a(i3, 0, this.f10222a);
            if (a3 < 0 || this.f10223b[a3 << 1] == null) {
                return a3;
            }
            int i4 = a3 + 1;
            while (i4 < i3 && this.f10222a[i4] == 0) {
                if (this.f10223b[i4 << 1] == null) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = a3 - 1; i5 >= 0 && this.f10222a[i5] == 0; i5--) {
                if (this.f10223b[i5 << 1] == null) {
                    return i5;
                }
            }
            return ~i4;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1161k) {
            C1161k c1161k = (C1161k) obj;
            if (this.f10224c != c1161k.f10224c) {
                return false;
            }
            for (int i3 = 0; i3 < this.f10224c; i3++) {
                try {
                    Object g3 = g(i3);
                    Object i4 = i(i3);
                    Object orDefault = c1161k.getOrDefault(g3, null);
                    if (i4 == null) {
                        if (orDefault != null || !c1161k.containsKey(g3)) {
                            return false;
                        }
                    } else if (!i4.equals(orDefault)) {
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
            if (this.f10224c != map.size()) {
                return false;
            }
            for (int i5 = 0; i5 < this.f10224c; i5++) {
                try {
                    Object g4 = g(i5);
                    Object i6 = i(i5);
                    Object obj2 = map.get(g4);
                    if (i6 == null) {
                        if (obj2 != null || !map.containsKey(g4)) {
                            return false;
                        }
                    } else if (!i6.equals(obj2)) {
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
        int i3 = this.f10224c * 2;
        Object[] objArr = this.f10223b;
        if (obj == null) {
            for (int i4 = 1; i4 < i3; i4 += 2) {
                if (objArr[i4] == null) {
                    return i4 >> 1;
                }
            }
            return -1;
        }
        for (int i5 = 1; i5 < i3; i5 += 2) {
            if (obj.equals(objArr[i5])) {
                return i5 >> 1;
            }
        }
        return -1;
    }

    public final Object g(int i3) {
        return this.f10223b[i3 << 1];
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d3 = d(obj);
        return d3 >= 0 ? this.f10223b[(d3 << 1) + 1] : obj2;
    }

    public final Object h(int i3) {
        Object[] objArr = this.f10223b;
        int i4 = i3 << 1;
        Object obj = objArr[i4 + 1];
        int i5 = this.f10224c;
        int i6 = 0;
        if (i5 <= 1) {
            b(this.f10222a, objArr, i5);
            this.f10222a = AbstractC1154d.f10195a;
            this.f10223b = AbstractC1154d.f10196b;
        } else {
            int i7 = i5 - 1;
            int[] iArr = this.f10222a;
            if (iArr.length <= 8 || i5 >= iArr.length / 3) {
                if (i3 < i7) {
                    int i8 = i3 + 1;
                    int i9 = i7 - i3;
                    System.arraycopy(iArr, i8, iArr, i3, i9);
                    Object[] objArr2 = this.f10223b;
                    System.arraycopy(objArr2, i8 << 1, objArr2, i4, i9 << 1);
                }
                Object[] objArr3 = this.f10223b;
                int i10 = i7 << 1;
                objArr3[i10] = null;
                objArr3[i10 + 1] = null;
            } else {
                a(i5 > 8 ? i5 + (i5 >> 1) : 8);
                if (i5 != this.f10224c) {
                    throw new ConcurrentModificationException();
                }
                if (i3 > 0) {
                    System.arraycopy(iArr, 0, this.f10222a, 0, i3);
                    System.arraycopy(objArr, 0, this.f10223b, 0, i4);
                }
                if (i3 < i7) {
                    int i11 = i3 + 1;
                    int i12 = i7 - i3;
                    System.arraycopy(iArr, i11, this.f10222a, i3, i12);
                    System.arraycopy(objArr, i11 << 1, this.f10223b, i4, i12 << 1);
                }
            }
            i6 = i7;
        }
        if (i5 != this.f10224c) {
            throw new ConcurrentModificationException();
        }
        this.f10224c = i6;
        return obj;
    }

    public final int hashCode() {
        int[] iArr = this.f10222a;
        Object[] objArr = this.f10223b;
        int i3 = this.f10224c;
        int i4 = 1;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i3) {
            Object obj = objArr[i4];
            i6 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i5];
            i5++;
            i4 += 2;
        }
        return i6;
    }

    public final Object i(int i3) {
        return this.f10223b[(i3 << 1) + 1];
    }

    public final boolean isEmpty() {
        return this.f10224c <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i3;
        int c3;
        int i4 = this.f10224c;
        if (obj == null) {
            c3 = e();
            i3 = 0;
        } else {
            int hashCode = obj.hashCode();
            i3 = hashCode;
            c3 = c(hashCode, obj);
        }
        if (c3 >= 0) {
            int i5 = (c3 << 1) + 1;
            Object[] objArr = this.f10223b;
            Object obj3 = objArr[i5];
            objArr[i5] = obj2;
            return obj3;
        }
        int i6 = ~c3;
        int[] iArr = this.f10222a;
        if (i4 >= iArr.length) {
            int i7 = 8;
            if (i4 >= 8) {
                i7 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i7 = 4;
            }
            Object[] objArr2 = this.f10223b;
            a(i7);
            if (i4 != this.f10224c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f10222a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f10223b, 0, objArr2.length);
            }
            b(iArr, objArr2, i4);
        }
        if (i6 < i4) {
            int[] iArr3 = this.f10222a;
            int i8 = i6 + 1;
            System.arraycopy(iArr3, i6, iArr3, i8, i4 - i6);
            Object[] objArr3 = this.f10223b;
            System.arraycopy(objArr3, i6 << 1, objArr3, i8 << 1, (this.f10224c - i6) << 1);
        }
        int i9 = this.f10224c;
        if (i4 == i9) {
            int[] iArr4 = this.f10222a;
            if (i6 < iArr4.length) {
                iArr4[i6] = i3;
                Object[] objArr4 = this.f10223b;
                int i10 = i6 << 1;
                objArr4[i10] = obj;
                objArr4[i10 + 1] = obj2;
                this.f10224c = i9 + 1;
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
        int d3 = d(obj);
        if (d3 >= 0) {
            return h(d3);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int d3 = d(obj);
        if (d3 < 0) {
            return null;
        }
        int i3 = (d3 << 1) + 1;
        Object[] objArr = this.f10223b;
        Object obj3 = objArr[i3];
        objArr[i3] = obj2;
        return obj3;
    }

    public final int size() {
        return this.f10224c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f10224c * 28);
        sb.append('{');
        for (int i3 = 0; i3 < this.f10224c; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object g3 = g(i3);
            if (g3 != this) {
                sb.append(g3);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object i4 = i(i3);
            if (i4 != this) {
                sb.append(i4);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int d3 = d(obj);
        if (d3 < 0) {
            return false;
        }
        Object i3 = i(d3);
        if (obj2 != i3 && (obj2 == null || !obj2.equals(i3))) {
            return false;
        }
        h(d3);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d3 = d(obj);
        if (d3 < 0) {
            return false;
        }
        Object i3 = i(d3);
        if (i3 != obj2 && (obj2 == null || !obj2.equals(i3))) {
            return false;
        }
        int i4 = (d3 << 1) + 1;
        Object[] objArr = this.f10223b;
        Object obj4 = objArr[i4];
        objArr[i4] = obj3;
        return true;
    }
}
