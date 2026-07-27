package f2;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class f implements Map, Serializable, p2.b {

    /* renamed from: n, reason: collision with root package name */
    public static final f f4908n;

    /* renamed from: a, reason: collision with root package name */
    public Object[] f4909a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f4910b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f4911c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f4912d;

    /* renamed from: e, reason: collision with root package name */
    public int f4913e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f4914g;

    /* renamed from: h, reason: collision with root package name */
    public int f4915h;

    /* renamed from: i, reason: collision with root package name */
    public int f4916i;

    /* renamed from: j, reason: collision with root package name */
    public g f4917j;

    /* renamed from: k, reason: collision with root package name */
    public h f4918k;

    /* renamed from: l, reason: collision with root package name */
    public g f4919l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4920m;

    static {
        f fVar = new f(0);
        fVar.f4920m = true;
        f4908n = fVar;
    }

    public f(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i3];
        int[] iArr = new int[i3];
        int highestOneBit = Integer.highestOneBit((i3 < 1 ? 1 : i3) * 3);
        this.f4909a = objArr;
        this.f4910b = null;
        this.f4911c = iArr;
        this.f4912d = new int[highestOneBit];
        this.f4913e = 2;
        this.f = 0;
        this.f4914g = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    public final int a(Object obj) {
        b();
        while (true) {
            int i3 = i(obj);
            int i4 = this.f4913e * 2;
            int length = this.f4912d.length / 2;
            if (i4 > length) {
                i4 = length;
            }
            int i5 = 0;
            while (true) {
                int[] iArr = this.f4912d;
                int i6 = iArr[i3];
                if (i6 <= 0) {
                    int i7 = this.f;
                    Object[] objArr = this.f4909a;
                    if (i7 < objArr.length) {
                        int i8 = i7 + 1;
                        this.f = i8;
                        objArr[i7] = obj;
                        this.f4911c[i7] = i3;
                        iArr[i3] = i8;
                        this.f4916i++;
                        this.f4915h++;
                        if (i5 > this.f4913e) {
                            this.f4913e = i5;
                        }
                        return i7;
                    }
                    f(1);
                } else {
                    if (j.a(this.f4909a[i6 - 1], obj)) {
                        return -i6;
                    }
                    i5++;
                    if (i5 > i4) {
                        j(this.f4912d.length * 2);
                        break;
                    }
                    i3 = i3 == 0 ? this.f4912d.length - 1 : i3 - 1;
                }
            }
        }
    }

    public final void b() {
        if (this.f4920m) {
            throw new UnsupportedOperationException();
        }
    }

    public final void c(boolean z3) {
        int i3;
        Object[] objArr = this.f4910b;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i3 = this.f;
            if (i4 >= i3) {
                break;
            }
            int[] iArr = this.f4911c;
            int i6 = iArr[i4];
            if (i6 >= 0) {
                Object[] objArr2 = this.f4909a;
                objArr2[i5] = objArr2[i4];
                if (objArr != null) {
                    objArr[i5] = objArr[i4];
                }
                if (z3) {
                    iArr[i5] = i6;
                    this.f4912d[i6] = i5 + 1;
                }
                i5++;
            }
            i4++;
        }
        X0.a.F(this.f4909a, i5, i3);
        if (objArr != null) {
            X0.a.F(objArr, i5, this.f);
        }
        this.f = i5;
    }

    @Override // java.util.Map
    public final void clear() {
        b();
        int i3 = this.f - 1;
        if (i3 >= 0) {
            int i4 = 0;
            while (true) {
                int[] iArr = this.f4911c;
                int i5 = iArr[i4];
                if (i5 >= 0) {
                    this.f4912d[i5] = 0;
                    iArr[i4] = -1;
                }
                if (i4 == i3) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        X0.a.F(this.f4909a, 0, this.f);
        Object[] objArr = this.f4910b;
        if (objArr != null) {
            X0.a.F(objArr, 0, this.f);
        }
        this.f4916i = 0;
        this.f = 0;
        this.f4915h++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public final boolean d(Collection m3) {
        j.e(m3, "m");
        for (Object obj : m3) {
            if (obj != null) {
                try {
                    if (!e((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean e(Map.Entry entry) {
        j.e(entry, "entry");
        int g3 = g(entry.getKey());
        if (g3 < 0) {
            return false;
        }
        Object[] objArr = this.f4910b;
        j.b(objArr);
        return j.a(objArr[g3], entry.getValue());
    }

    @Override // java.util.Map
    public final Set entrySet() {
        g gVar = this.f4919l;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this, 0);
        this.f4919l = gVar2;
        return gVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.f4916i == map.size() && d(map.entrySet());
    }

    public final void f(int i3) {
        Object[] objArr;
        Object[] objArr2 = this.f4909a;
        int length = objArr2.length;
        int i4 = this.f;
        int i5 = length - i4;
        int i6 = i4 - this.f4916i;
        if (i5 < i3 && i5 + i6 >= i3 && i6 >= objArr2.length / 4) {
            c(true);
            return;
        }
        int i7 = i4 + i3;
        if (i7 < 0) {
            throw new OutOfMemoryError();
        }
        if (i7 > objArr2.length) {
            int length2 = objArr2.length;
            int i8 = length2 + (length2 >> 1);
            if (i8 - i7 < 0) {
                i8 = i7;
            }
            if (i8 - 2147483639 > 0) {
                i8 = i7 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr2, i8);
            j.d(copyOf, "copyOf(...)");
            this.f4909a = copyOf;
            Object[] objArr3 = this.f4910b;
            if (objArr3 != null) {
                objArr = Arrays.copyOf(objArr3, i8);
                j.d(objArr, "copyOf(...)");
            } else {
                objArr = null;
            }
            this.f4910b = objArr;
            int[] copyOf2 = Arrays.copyOf(this.f4911c, i8);
            j.d(copyOf2, "copyOf(...)");
            this.f4911c = copyOf2;
            int highestOneBit = Integer.highestOneBit((i8 >= 1 ? i8 : 1) * 3);
            if (highestOneBit > this.f4912d.length) {
                j(highestOneBit);
            }
        }
    }

    public final int g(Object obj) {
        int i3 = i(obj);
        int i4 = this.f4913e;
        while (true) {
            int i5 = this.f4912d[i3];
            if (i5 == 0) {
                return -1;
            }
            if (i5 > 0) {
                int i6 = i5 - 1;
                if (j.a(this.f4909a[i6], obj)) {
                    return i6;
                }
            }
            i4--;
            if (i4 < 0) {
                return -1;
            }
            i3 = i3 == 0 ? this.f4912d.length - 1 : i3 - 1;
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int g3 = g(obj);
        if (g3 < 0) {
            return null;
        }
        Object[] objArr = this.f4910b;
        j.b(objArr);
        return objArr[g3];
    }

    public final int h(Object obj) {
        int i3 = this.f;
        while (true) {
            i3--;
            if (i3 < 0) {
                return -1;
            }
            if (this.f4911c[i3] >= 0) {
                Object[] objArr = this.f4910b;
                j.b(objArr);
                if (j.a(objArr[i3], obj)) {
                    return i3;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        d dVar = new d(this, 0);
        int i3 = 0;
        while (dVar.hasNext()) {
            int i4 = dVar.f4901b;
            f fVar = dVar.f4900a;
            if (i4 >= fVar.f) {
                throw new NoSuchElementException();
            }
            dVar.f4901b = i4 + 1;
            dVar.f4902c = i4;
            Object obj = fVar.f4909a[i4];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = fVar.f4910b;
            j.b(objArr);
            Object obj2 = objArr[dVar.f4902c];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            dVar.b();
            i3 += hashCode ^ hashCode2;
        }
        return i3;
    }

    public final int i(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f4914g;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f4916i == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f4911c[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(int i3) {
        this.f4915h++;
        int i4 = 0;
        if (this.f > this.f4916i) {
            c(false);
        }
        this.f4912d = new int[i3];
        this.f4914g = Integer.numberOfLeadingZeros(i3) + 1;
        while (i4 < this.f) {
            int i5 = i4 + 1;
            int i6 = i(this.f4909a[i4]);
            int i7 = this.f4913e;
            while (true) {
                int[] iArr = this.f4912d;
                if (iArr[i6] == 0) {
                    break;
                }
                i7--;
                if (i7 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                i6 = i6 == 0 ? iArr.length - 1 : i6 - 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0024->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(int i3) {
        Object[] objArr = this.f4909a;
        j.e(objArr, "<this>");
        objArr[i3] = null;
        Object[] objArr2 = this.f4910b;
        if (objArr2 != null) {
            objArr2[i3] = null;
        }
        int i4 = this.f4911c[i3];
        int i5 = this.f4913e * 2;
        int length = this.f4912d.length / 2;
        if (i5 > length) {
            i5 = length;
        }
        int i6 = i5;
        int i7 = 0;
        int i8 = i4;
        while (true) {
            i4 = i4 == 0 ? this.f4912d.length - 1 : i4 - 1;
            i7++;
            if (i7 > this.f4913e) {
                this.f4912d[i8] = 0;
                break;
            }
            int[] iArr = this.f4912d;
            int i9 = iArr[i4];
            if (i9 == 0) {
                iArr[i8] = 0;
                break;
            }
            if (i9 < 0) {
                iArr[i8] = -1;
            } else {
                int i10 = i9 - 1;
                int i11 = i(this.f4909a[i10]) - i4;
                int[] iArr2 = this.f4912d;
                if ((i11 & (iArr2.length - 1)) >= i7) {
                    iArr2[i8] = i9;
                    this.f4911c[i10] = i8;
                }
                i6--;
                if (i6 >= 0) {
                    this.f4912d[i8] = -1;
                    break;
                }
            }
            i8 = i4;
            i7 = 0;
            i6--;
            if (i6 >= 0) {
            }
        }
        this.f4911c[i3] = -1;
        this.f4916i--;
        this.f4915h++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        g gVar = this.f4917j;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this, 1);
        this.f4917j = gVar2;
        return gVar2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        b();
        int a3 = a(obj);
        Object[] objArr = this.f4910b;
        if (objArr == null) {
            int length = this.f4909a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f4910b = objArr;
        }
        if (a3 >= 0) {
            objArr[a3] = obj2;
            return null;
        }
        int i3 = (-a3) - 1;
        Object obj3 = objArr[i3];
        objArr[i3] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        j.e(from, "from");
        b();
        Set<Map.Entry> entrySet = from.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        f(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int a3 = a(entry.getKey());
            Object[] objArr = this.f4910b;
            if (objArr == null) {
                int length = this.f4909a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f4910b = objArr;
            }
            if (a3 >= 0) {
                objArr[a3] = entry.getValue();
            } else {
                int i3 = (-a3) - 1;
                if (!j.a(entry.getValue(), objArr[i3])) {
                    objArr[i3] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        b();
        int g3 = g(obj);
        if (g3 < 0) {
            return null;
        }
        Object[] objArr = this.f4910b;
        j.b(objArr);
        Object obj2 = objArr[g3];
        k(g3);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f4916i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f4916i * 3) + 2);
        sb.append("{");
        d dVar = new d(this, 0);
        int i3 = 0;
        while (dVar.hasNext()) {
            if (i3 > 0) {
                sb.append(", ");
            }
            int i4 = dVar.f4901b;
            f fVar = dVar.f4900a;
            if (i4 >= fVar.f) {
                throw new NoSuchElementException();
            }
            dVar.f4901b = i4 + 1;
            dVar.f4902c = i4;
            Object obj = fVar.f4909a[i4];
            if (obj == fVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = fVar.f4910b;
            j.b(objArr);
            Object obj2 = objArr[dVar.f4902c];
            if (obj2 == fVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            dVar.b();
            i3++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        j.d(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Map
    public final Collection values() {
        h hVar = this.f4918k;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this);
        this.f4918k = hVar2;
        return hVar2;
    }
}
