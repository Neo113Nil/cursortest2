package p000;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class w71 {

    /* JADX INFO: renamed from: j */
    public int[] f8451j;

    /* JADX INFO: renamed from: k */
    public Object[] f8452k;

    /* JADX INFO: renamed from: l */
    public int f8453l;

    public w71(int i) {
        this.f8451j = i == 0 ? kd0.f4350b : new int[i];
        this.f8452k = i == 0 ? kd0.f4351c : new Object[i << 1];
    }

    /* JADX INFO: renamed from: a */
    public final int m5294a(Object obj) {
        int i = this.f8453l * 2;
        Object[] objArr = this.f8452k;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public final void m5295b(int i) {
        int i2 = this.f8453l;
        int[] iArr = this.f8451j;
        if (iArr.length < i) {
            this.f8451j = Arrays.copyOf(iArr, i);
            this.f8452k = Arrays.copyOf(this.f8452k, i * 2);
        }
        if (this.f8453l != i2) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m5296c(int i, Object obj) {
        int i2 = this.f8453l;
        if (i2 == 0) {
            return -1;
        }
        int iM3008a = kd0.m3008a(i2, i, this.f8451j);
        if (iM3008a < 0 || af0.m187a(obj, this.f8452k[iM3008a << 1])) {
            return iM3008a;
        }
        int i3 = iM3008a + 1;
        while (i3 < i2 && this.f8451j[i3] == i) {
            if (af0.m187a(obj, this.f8452k[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM3008a - 1; i4 >= 0 && this.f8451j[i4] == i; i4--) {
            if (af0.m187a(obj, this.f8452k[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public void clear() {
        if (this.f8453l > 0) {
            this.f8451j = kd0.f4350b;
            this.f8452k = kd0.f4351c;
            this.f8453l = 0;
        }
        if (this.f8453l > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m5297d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m5294a(obj) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m5297d(Object obj) {
        return obj == null ? m5298e() : m5296c(obj.hashCode(), obj);
    }

    /* JADX INFO: renamed from: e */
    public final int m5298e() {
        int i = this.f8453l;
        if (i == 0) {
            return -1;
        }
        int iM3008a = kd0.m3008a(i, 0, this.f8451j);
        if (iM3008a < 0 || this.f8452k[iM3008a << 1] == null) {
            return iM3008a;
        }
        int i2 = iM3008a + 1;
        while (i2 < i && this.f8451j[i2] == 0) {
            if (this.f8452k[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iM3008a - 1; i3 >= 0 && this.f8451j[i3] == 0; i3--) {
            if (this.f8452k[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof w71) {
                int i = this.f8453l;
                if (i != ((w71) obj).f8453l) {
                    return false;
                }
                w71 w71Var = (w71) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object objM5299f = m5299f(i2);
                    Object objM5303j = m5303j(i2);
                    Object obj2 = w71Var.get(objM5299f);
                    if (objM5303j == null) {
                        if (obj2 != null || !w71Var.containsKey(objM5299f)) {
                            return false;
                        }
                    } else if (!objM5303j.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f8453l != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.f8453l;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objM5299f2 = m5299f(i4);
                Object objM5303j2 = m5303j(i4);
                Object obj3 = ((Map) obj).get(objM5299f2);
                if (objM5303j2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objM5299f2)) {
                        return false;
                    }
                } else if (!objM5303j2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final Object m5299f(int i) {
        if (i >= 0 && i < this.f8453l) {
            return this.f8452k[i << 1];
        }
        C0270h1.m2186b(j11.m2773h("Expected index to be within 0..size()-1, but was ", i));
        return null;
    }

    /* JADX INFO: renamed from: g */
    public void mo5300g(C0910yd c0910yd) {
        int i = c0910yd.f8453l;
        m5295b(this.f8453l + i);
        if (this.f8453l != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(c0910yd.m5299f(i2), c0910yd.m5303j(i2));
            }
        } else if (i > 0) {
            AbstractC0202f8.m1743t(0, 0, i, c0910yd.f8451j, this.f8451j);
            AbstractC0202f8.m1744u(0, 0, i << 1, c0910yd.f8452k, this.f8452k);
            this.f8453l = i;
        }
    }

    public Object get(Object obj) {
        int iM5297d = m5297d(obj);
        if (iM5297d >= 0) {
            return this.f8452k[(iM5297d << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iM5297d = m5297d(obj);
        return iM5297d >= 0 ? this.f8452k[(iM5297d << 1) + 1] : obj2;
    }

    /* JADX INFO: renamed from: h */
    public Object mo5301h(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f8453l)) {
            C0270h1.m2186b(j11.m2773h("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        Object[] objArr = this.f8452k;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.f8451j;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                AbstractC0202f8.m1743t(i, i5, i2, iArr, iArr);
                Object[] objArr2 = this.f8452k;
                AbstractC0202f8.m1744u(i3, i5 << 1, i2 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f8452k;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.f8451j = Arrays.copyOf(iArr, i7);
            this.f8452k = Arrays.copyOf(this.f8452k, i7 << 1);
            if (i2 != this.f8453l) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                AbstractC0202f8.m1743t(0, 0, i, iArr, this.f8451j);
                AbstractC0202f8.m1744u(0, 0, i3, objArr, this.f8452k);
            }
            if (i < i4) {
                int i8 = i + 1;
                AbstractC0202f8.m1743t(i, i8, i2, iArr, this.f8451j);
                AbstractC0202f8.m1744u(i3, i8 << 1, i2 << 1, objArr, this.f8452k);
            }
        }
        if (i2 != this.f8453l) {
            throw new ConcurrentModificationException();
        }
        this.f8453l = i4;
        return obj;
    }

    public int hashCode() {
        int[] iArr = this.f8451j;
        Object[] objArr = this.f8452k;
        int i = this.f8453l;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public Object mo5302i(int i, Object obj) {
        if (i < 0 || i >= this.f8453l) {
            C0270h1.m2186b(j11.m2773h("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f8452k;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final boolean isEmpty() {
        return this.f8453l <= 0;
    }

    /* JADX INFO: renamed from: j */
    public final Object m5303j(int i) {
        if (i >= 0 && i < this.f8453l) {
            return this.f8452k[(i << 1) + 1];
        }
        C0270h1.m2186b(j11.m2773h("Expected index to be within 0..size()-1, but was ", i));
        return null;
    }

    public Object put(Object obj, Object obj2) {
        int i = this.f8453l;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iM5296c = obj != null ? m5296c(iHashCode, obj) : m5298e();
        if (iM5296c >= 0) {
            int i2 = (iM5296c << 1) + 1;
            Object[] objArr = this.f8452k;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iM5296c;
        int[] iArr = this.f8451j;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.f8451j = Arrays.copyOf(iArr, i4);
            this.f8452k = Arrays.copyOf(this.f8452k, i4 << 1);
            if (i != this.f8453l) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.f8451j;
            int i5 = i3 + 1;
            AbstractC0202f8.m1743t(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.f8452k;
            AbstractC0202f8.m1744u(i5 << 1, i3 << 1, this.f8453l << 1, objArr2, objArr2);
        }
        int i6 = this.f8453l;
        if (i == i6) {
            int[] iArr3 = this.f8451j;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.f8452k;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.f8453l = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iM5297d = m5297d(obj);
        if (iM5297d < 0 || !af0.m187a(obj2, m5303j(iM5297d))) {
            return false;
        }
        mo5301h(iM5297d);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM5297d = m5297d(obj);
        if (iM5297d < 0 || !af0.m187a(obj2, m5303j(iM5297d))) {
            return false;
        }
        mo5302i(iM5297d, obj3);
        return true;
    }

    public final int size() {
        return this.f8453l;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8453l * 28);
        sb.append('{');
        int i = this.f8453l;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objM5299f = m5299f(i2);
            if (objM5299f != sb) {
                sb.append(objM5299f);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objM5303j = m5303j(i2);
            if (objM5303j != sb) {
                sb.append(objM5303j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Object remove(Object obj) {
        int iM5297d = m5297d(obj);
        if (iM5297d >= 0) {
            return mo5301h(iM5297d);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iM5297d = m5297d(obj);
        if (iM5297d >= 0) {
            return mo5302i(iM5297d, obj2);
        }
        return null;
    }
}
