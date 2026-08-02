package r;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import s.AbstractC2351a;

/* loaded from: classes.dex */
public class Q {

    /* renamed from: k, reason: collision with root package name */
    public int[] f18959k;

    /* renamed from: l, reason: collision with root package name */
    public Object[] f18960l;

    /* renamed from: m, reason: collision with root package name */
    public int f18961m;

    public Q(int i) {
        this.f18959k = i == 0 ? AbstractC2351a.f19149a : new int[i];
        this.f18960l = i == 0 ? AbstractC2351a.f19151c : new Object[i << 1];
    }

    public final int a(Object obj) {
        int i = this.f18961m * 2;
        Object[] objArr = this.f18960l;
        if (obj == null) {
            for (int i5 = 1; i5 < i; i5 += 2) {
                if (objArr[i5] == null) {
                    return i5 >> 1;
                }
            }
            return -1;
        }
        for (int i6 = 1; i6 < i; i6 += 2) {
            if (obj.equals(objArr[i6])) {
                return i6 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i) {
        int i5 = this.f18961m;
        int[] iArr = this.f18959k;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, i);
            kotlin.jvm.internal.l.e("copyOf(...)", copyOf);
            this.f18959k = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f18960l, i * 2);
            kotlin.jvm.internal.l.e("copyOf(...)", copyOf2);
            this.f18960l = copyOf2;
        }
        if (this.f18961m != i5) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i, Object obj) {
        int i5 = this.f18961m;
        if (i5 == 0) {
            return -1;
        }
        int a5 = AbstractC2351a.a(i5, i, this.f18959k);
        if (a5 < 0 || kotlin.jvm.internal.l.a(obj, this.f18960l[a5 << 1])) {
            return a5;
        }
        int i6 = a5 + 1;
        while (i6 < i5 && this.f18959k[i6] == i) {
            if (kotlin.jvm.internal.l.a(obj, this.f18960l[i6 << 1])) {
                return i6;
            }
            i6++;
        }
        for (int i7 = a5 - 1; i7 >= 0 && this.f18959k[i7] == i; i7--) {
            if (kotlin.jvm.internal.l.a(obj, this.f18960l[i7 << 1])) {
                return i7;
            }
        }
        return ~i6;
    }

    public final void clear() {
        if (this.f18961m > 0) {
            this.f18959k = AbstractC2351a.f19149a;
            this.f18960l = AbstractC2351a.f19151c;
            this.f18961m = 0;
        }
        if (this.f18961m > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i = this.f18961m;
        if (i == 0) {
            return -1;
        }
        int a5 = AbstractC2351a.a(i, 0, this.f18959k);
        if (a5 < 0 || this.f18960l[a5 << 1] == null) {
            return a5;
        }
        int i5 = a5 + 1;
        while (i5 < i && this.f18959k[i5] == 0) {
            if (this.f18960l[i5 << 1] == null) {
                return i5;
            }
            i5++;
        }
        for (int i6 = a5 - 1; i6 >= 0 && this.f18959k[i6] == 0; i6--) {
            if (this.f18960l[i6 << 1] == null) {
                return i6;
            }
        }
        return ~i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof Q) {
                int i = this.f18961m;
                if (i != ((Q) obj).f18961m) {
                    return false;
                }
                Q q5 = (Q) obj;
                for (int i5 = 0; i5 < i; i5++) {
                    Object f = f(i5);
                    Object i6 = i(i5);
                    Object obj2 = q5.get(f);
                    if (i6 == null) {
                        if (obj2 != null || !q5.containsKey(f)) {
                            return false;
                        }
                    } else if (!i6.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f18961m != ((Map) obj).size()) {
                return false;
            }
            int i7 = this.f18961m;
            for (int i8 = 0; i8 < i7; i8++) {
                Object f5 = f(i8);
                Object i9 = i(i8);
                Object obj3 = ((Map) obj).get(f5);
                if (i9 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(f5)) {
                        return false;
                    }
                } else if (!i9.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i) {
        boolean z3 = false;
        if (i >= 0 && i < this.f18961m) {
            z3 = true;
        }
        if (z3) {
            return this.f18960l[i << 1];
        }
        AbstractC2351a.c("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public final Object g(int i) {
        if (!(i >= 0 && i < this.f18961m)) {
            AbstractC2351a.c("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        Object[] objArr = this.f18960l;
        int i5 = i << 1;
        Object obj = objArr[i5 + 1];
        int i6 = this.f18961m;
        if (i6 <= 1) {
            clear();
            return obj;
        }
        int i7 = i6 - 1;
        int[] iArr = this.f18959k;
        if (iArr.length <= 8 || i6 >= iArr.length / 3) {
            if (i < i7) {
                int i8 = i + 1;
                X3.l.s0(i, i8, i6, iArr, iArr);
                Object[] objArr2 = this.f18960l;
                X3.l.t0(i5, i8 << 1, i6 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f18960l;
            int i9 = i7 << 1;
            objArr3[i9] = null;
            objArr3[i9 + 1] = null;
        } else {
            int i10 = i6 > 8 ? i6 + (i6 >> 1) : 8;
            int[] copyOf = Arrays.copyOf(iArr, i10);
            kotlin.jvm.internal.l.e("copyOf(...)", copyOf);
            this.f18959k = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f18960l, i10 << 1);
            kotlin.jvm.internal.l.e("copyOf(...)", copyOf2);
            this.f18960l = copyOf2;
            if (i6 != this.f18961m) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                X3.l.s0(0, 0, i, iArr, this.f18959k);
                X3.l.t0(0, 0, i5, objArr, this.f18960l);
            }
            if (i < i7) {
                int i11 = i + 1;
                X3.l.s0(i, i11, i6, iArr, this.f18959k);
                X3.l.t0(i5, i11 << 1, i6 << 1, objArr, this.f18960l);
            }
        }
        if (i6 != this.f18961m) {
            throw new ConcurrentModificationException();
        }
        this.f18961m = i7;
        return obj;
    }

    public Object get(Object obj) {
        int d5 = d(obj);
        if (d5 >= 0) {
            return this.f18960l[(d5 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d5 = d(obj);
        return d5 >= 0 ? this.f18960l[(d5 << 1) + 1] : obj2;
    }

    public final Object h(int i, Object obj) {
        boolean z3 = false;
        if (i >= 0 && i < this.f18961m) {
            z3 = true;
        }
        if (!z3) {
            AbstractC2351a.c("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        int i5 = (i << 1) + 1;
        Object[] objArr = this.f18960l;
        Object obj2 = objArr[i5];
        objArr[i5] = obj;
        return obj2;
    }

    public final int hashCode() {
        int[] iArr = this.f18959k;
        Object[] objArr = this.f18960l;
        int i = this.f18961m;
        int i5 = 1;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i) {
            Object obj = objArr[i5];
            i7 += (obj != null ? obj.hashCode() : 0) ^ iArr[i6];
            i6++;
            i5 += 2;
        }
        return i7;
    }

    public final Object i(int i) {
        boolean z3 = false;
        if (i >= 0 && i < this.f18961m) {
            z3 = true;
        }
        if (z3) {
            return this.f18960l[(i << 1) + 1];
        }
        AbstractC2351a.c("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public final boolean isEmpty() {
        return this.f18961m <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.f18961m;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int c5 = obj != null ? c(hashCode, obj) : e();
        if (c5 >= 0) {
            int i5 = (c5 << 1) + 1;
            Object[] objArr = this.f18960l;
            Object obj3 = objArr[i5];
            objArr[i5] = obj2;
            return obj3;
        }
        int i6 = ~c5;
        int[] iArr = this.f18959k;
        if (i >= iArr.length) {
            int i7 = 8;
            if (i >= 8) {
                i7 = (i >> 1) + i;
            } else if (i < 4) {
                i7 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i7);
            kotlin.jvm.internal.l.e("copyOf(...)", copyOf);
            this.f18959k = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f18960l, i7 << 1);
            kotlin.jvm.internal.l.e("copyOf(...)", copyOf2);
            this.f18960l = copyOf2;
            if (i != this.f18961m) {
                throw new ConcurrentModificationException();
            }
        }
        if (i6 < i) {
            int[] iArr2 = this.f18959k;
            int i8 = i6 + 1;
            X3.l.s0(i8, i6, i, iArr2, iArr2);
            Object[] objArr2 = this.f18960l;
            X3.l.t0(i8 << 1, i6 << 1, this.f18961m << 1, objArr2, objArr2);
        }
        int i9 = this.f18961m;
        if (i == i9) {
            int[] iArr3 = this.f18959k;
            if (i6 < iArr3.length) {
                iArr3[i6] = hashCode;
                Object[] objArr3 = this.f18960l;
                int i10 = i6 << 1;
                objArr3[i10] = obj;
                objArr3[i10 + 1] = obj2;
                this.f18961m = i9 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int d5 = d(obj);
        if (d5 >= 0) {
            return g(d5);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int d5 = d(obj);
        if (d5 >= 0) {
            return h(d5, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f18961m;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f18961m * 28);
        sb.append('{');
        int i = this.f18961m;
        for (int i5 = 0; i5 < i; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            Object f = f(i5);
            if (f != sb) {
                sb.append(f);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object i6 = i(i5);
            if (i6 != sb) {
                sb.append(i6);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        kotlin.jvm.internal.l.e("toString(...)", sb2);
        return sb2;
    }

    public final boolean remove(Object obj, Object obj2) {
        int d5 = d(obj);
        if (d5 < 0 || !kotlin.jvm.internal.l.a(obj2, i(d5))) {
            return false;
        }
        g(d5);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d5 = d(obj);
        if (d5 < 0 || !kotlin.jvm.internal.l.a(obj2, i(d5))) {
            return false;
        }
        h(d5, obj3);
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Q(Q q5) {
        this(0);
        int i = q5.f18961m;
        b(this.f18961m + i);
        if (this.f18961m != 0) {
            for (int i5 = 0; i5 < i; i5++) {
                put(q5.f(i5), q5.i(i5));
            }
        } else if (i > 0) {
            X3.l.s0(0, 0, i, q5.f18959k, this.f18959k);
            X3.l.t0(0, 0, i << 1, q5.f18960l, this.f18960l);
            this.f18961m = i;
        }
    }
}
