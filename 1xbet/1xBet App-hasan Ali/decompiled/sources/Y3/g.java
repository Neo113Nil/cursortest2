package Y3;

import U.j;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class g implements Map, Serializable, j4.d {

    /* renamed from: x, reason: collision with root package name */
    public static final g f6159x;

    /* renamed from: k, reason: collision with root package name */
    public Object[] f6160k;

    /* renamed from: l, reason: collision with root package name */
    public Object[] f6161l;

    /* renamed from: m, reason: collision with root package name */
    public int[] f6162m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f6163n;

    /* renamed from: o, reason: collision with root package name */
    public int f6164o;

    /* renamed from: p, reason: collision with root package name */
    public int f6165p;

    /* renamed from: q, reason: collision with root package name */
    public int f6166q;

    /* renamed from: r, reason: collision with root package name */
    public int f6167r;

    /* renamed from: s, reason: collision with root package name */
    public int f6168s;

    /* renamed from: t, reason: collision with root package name */
    public h f6169t;

    /* renamed from: u, reason: collision with root package name */
    public j f6170u;

    /* renamed from: v, reason: collision with root package name */
    public h f6171v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f6172w;

    static {
        g gVar = new g(0);
        gVar.f6172w = true;
        f6159x = gVar;
    }

    public g(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f6160k = objArr;
        this.f6161l = null;
        this.f6162m = iArr;
        this.f6163n = new int[highestOneBit];
        this.f6164o = 2;
        this.f6165p = 0;
        this.f6166q = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    public final int a(Object obj) {
        b();
        while (true) {
            int i = i(obj);
            int i5 = this.f6164o * 2;
            int length = this.f6163n.length / 2;
            if (i5 > length) {
                i5 = length;
            }
            int i6 = 0;
            while (true) {
                int[] iArr = this.f6163n;
                int i7 = iArr[i];
                if (i7 <= 0) {
                    int i8 = this.f6165p;
                    Object[] objArr = this.f6160k;
                    if (i8 < objArr.length) {
                        int i9 = i8 + 1;
                        this.f6165p = i9;
                        objArr[i8] = obj;
                        this.f6162m[i8] = i;
                        iArr[i] = i9;
                        this.f6168s++;
                        this.f6167r++;
                        if (i6 > this.f6164o) {
                            this.f6164o = i6;
                        }
                        return i8;
                    }
                    f(1);
                } else {
                    if (l.a(this.f6160k[i7 - 1], obj)) {
                        return -i7;
                    }
                    i6++;
                    if (i6 > i5) {
                        j(this.f6163n.length * 2);
                        break;
                    }
                    i = i == 0 ? this.f6163n.length - 1 : i - 1;
                }
            }
        }
    }

    public final void b() {
        if (this.f6172w) {
            throw new UnsupportedOperationException();
        }
    }

    public final void c(boolean z3) {
        int i;
        Object[] objArr = this.f6161l;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = this.f6165p;
            if (i5 >= i) {
                break;
            }
            int[] iArr = this.f6162m;
            int i7 = iArr[i5];
            if (i7 >= 0) {
                Object[] objArr2 = this.f6160k;
                objArr2[i6] = objArr2[i5];
                if (objArr != null) {
                    objArr[i6] = objArr[i5];
                }
                if (z3) {
                    iArr[i6] = i7;
                    this.f6163n[i7] = i6 + 1;
                }
                i6++;
            }
            i5++;
        }
        G4.l.J(this.f6160k, i6, i);
        if (objArr != null) {
            G4.l.J(objArr, i6, this.f6165p);
        }
        this.f6165p = i6;
    }

    @Override // java.util.Map
    public final void clear() {
        b();
        int i = this.f6165p - 1;
        if (i >= 0) {
            int i5 = 0;
            while (true) {
                int[] iArr = this.f6162m;
                int i6 = iArr[i5];
                if (i6 >= 0) {
                    this.f6163n[i6] = 0;
                    iArr[i5] = -1;
                }
                if (i5 == i) {
                    break;
                } else {
                    i5++;
                }
            }
        }
        G4.l.J(this.f6160k, 0, this.f6165p);
        Object[] objArr = this.f6161l;
        if (objArr != null) {
            G4.l.J(objArr, 0, this.f6165p);
        }
        this.f6168s = 0;
        this.f6165p = 0;
        this.f6167r++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public final boolean d(Collection collection) {
        l.f("m", collection);
        for (Object obj : collection) {
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
        l.f("entry", entry);
        int g5 = g(entry.getKey());
        if (g5 < 0) {
            return false;
        }
        Object[] objArr = this.f6161l;
        l.c(objArr);
        return l.a(objArr[g5], entry.getValue());
    }

    @Override // java.util.Map
    public final Set entrySet() {
        h hVar = this.f6171v;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this, 0);
        this.f6171v = hVar2;
        return hVar2;
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
        return this.f6168s == map.size() && d(map.entrySet());
    }

    public final void f(int i) {
        Object[] objArr;
        Object[] objArr2 = this.f6160k;
        int length = objArr2.length;
        int i5 = this.f6165p;
        int i6 = length - i5;
        int i7 = i5 - this.f6168s;
        if (i6 < i && i6 + i7 >= i && i7 >= objArr2.length / 4) {
            c(true);
            return;
        }
        int i8 = i5 + i;
        if (i8 < 0) {
            throw new OutOfMemoryError();
        }
        if (i8 > objArr2.length) {
            int length2 = objArr2.length;
            int i9 = length2 + (length2 >> 1);
            if (i9 - i8 < 0) {
                i9 = i8;
            }
            if (i9 - 2147483639 > 0) {
                i9 = i8 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr2, i9);
            l.e("copyOf(...)", copyOf);
            this.f6160k = copyOf;
            Object[] objArr3 = this.f6161l;
            if (objArr3 != null) {
                objArr = Arrays.copyOf(objArr3, i9);
                l.e("copyOf(...)", objArr);
            } else {
                objArr = null;
            }
            this.f6161l = objArr;
            int[] copyOf2 = Arrays.copyOf(this.f6162m, i9);
            l.e("copyOf(...)", copyOf2);
            this.f6162m = copyOf2;
            int highestOneBit = Integer.highestOneBit((i9 >= 1 ? i9 : 1) * 3);
            if (highestOneBit > this.f6163n.length) {
                j(highestOneBit);
            }
        }
    }

    public final int g(Object obj) {
        int i = i(obj);
        int i5 = this.f6164o;
        while (true) {
            int i6 = this.f6163n[i];
            if (i6 == 0) {
                return -1;
            }
            if (i6 > 0) {
                int i7 = i6 - 1;
                if (l.a(this.f6160k[i7], obj)) {
                    return i7;
                }
            }
            i5--;
            if (i5 < 0) {
                return -1;
            }
            i = i == 0 ? this.f6163n.length - 1 : i - 1;
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int g5 = g(obj);
        if (g5 < 0) {
            return null;
        }
        Object[] objArr = this.f6161l;
        l.c(objArr);
        return objArr[g5];
    }

    public final int h(Object obj) {
        int i = this.f6165p;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f6162m[i] >= 0) {
                Object[] objArr = this.f6161l;
                l.c(objArr);
                if (l.a(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        d dVar = new d(this, 0);
        int i = 0;
        while (dVar.hasNext()) {
            int i5 = dVar.f6155k;
            g gVar = (g) dVar.f6158n;
            if (i5 >= gVar.f6165p) {
                throw new NoSuchElementException();
            }
            dVar.f6155k = i5 + 1;
            dVar.f6156l = i5;
            Object obj = gVar.f6160k[i5];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = gVar.f6161l;
            l.c(objArr);
            Object obj2 = objArr[dVar.f6156l];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            dVar.c();
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    public final int i(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f6166q;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f6168s == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f6162m[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(int i) {
        this.f6167r++;
        int i5 = 0;
        if (this.f6165p > this.f6168s) {
            c(false);
        }
        this.f6163n = new int[i];
        this.f6166q = Integer.numberOfLeadingZeros(i) + 1;
        while (i5 < this.f6165p) {
            int i6 = i5 + 1;
            int i7 = i(this.f6160k[i5]);
            int i8 = this.f6164o;
            while (true) {
                int[] iArr = this.f6163n;
                if (iArr[i7] == 0) {
                    break;
                }
                i8--;
                if (i8 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                i7 = i7 == 0 ? iArr.length - 1 : i7 - 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0024->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(int i) {
        Object[] objArr = this.f6160k;
        l.f("<this>", objArr);
        objArr[i] = null;
        Object[] objArr2 = this.f6161l;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int i5 = this.f6162m[i];
        int i6 = this.f6164o * 2;
        int length = this.f6163n.length / 2;
        if (i6 > length) {
            i6 = length;
        }
        int i7 = i6;
        int i8 = 0;
        int i9 = i5;
        while (true) {
            i5 = i5 == 0 ? this.f6163n.length - 1 : i5 - 1;
            i8++;
            if (i8 > this.f6164o) {
                this.f6163n[i9] = 0;
                break;
            }
            int[] iArr = this.f6163n;
            int i10 = iArr[i5];
            if (i10 == 0) {
                iArr[i9] = 0;
                break;
            }
            if (i10 < 0) {
                iArr[i9] = -1;
            } else {
                int i11 = i10 - 1;
                int i12 = i(this.f6160k[i11]) - i5;
                int[] iArr2 = this.f6163n;
                if ((i12 & (iArr2.length - 1)) >= i8) {
                    iArr2[i9] = i10;
                    this.f6162m[i11] = i9;
                }
                i7--;
                if (i7 >= 0) {
                    this.f6163n[i9] = -1;
                    break;
                }
            }
            i9 = i5;
            i8 = 0;
            i7--;
            if (i7 >= 0) {
            }
        }
        this.f6162m[i] = -1;
        this.f6168s--;
        this.f6167r++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        h hVar = this.f6169t;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this, 1);
        this.f6169t = hVar2;
        return hVar2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        b();
        int a5 = a(obj);
        Object[] objArr = this.f6161l;
        if (objArr == null) {
            int length = this.f6160k.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f6161l = objArr;
        }
        if (a5 >= 0) {
            objArr[a5] = obj2;
            return null;
        }
        int i = (-a5) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        l.f("from", map);
        b();
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        f(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int a5 = a(entry.getKey());
            Object[] objArr = this.f6161l;
            if (objArr == null) {
                int length = this.f6160k.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f6161l = objArr;
            }
            if (a5 >= 0) {
                objArr[a5] = entry.getValue();
            } else {
                int i = (-a5) - 1;
                if (!l.a(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        b();
        int g5 = g(obj);
        if (g5 < 0) {
            return null;
        }
        Object[] objArr = this.f6161l;
        l.c(objArr);
        Object obj2 = objArr[g5];
        k(g5);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f6168s;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f6168s * 3) + 2);
        sb.append("{");
        d dVar = new d(this, 0);
        int i = 0;
        while (dVar.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i5 = dVar.f6155k;
            g gVar = (g) dVar.f6158n;
            if (i5 >= gVar.f6165p) {
                throw new NoSuchElementException();
            }
            dVar.f6155k = i5 + 1;
            dVar.f6156l = i5;
            Object obj = gVar.f6160k[i5];
            if (obj == gVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = gVar.f6161l;
            l.c(objArr);
            Object obj2 = objArr[dVar.f6156l];
            if (obj2 == gVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            dVar.c();
            i++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        l.e("toString(...)", sb2);
        return sb2;
    }

    @Override // java.util.Map
    public final Collection values() {
        j jVar = this.f6170u;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(1, this);
        this.f6170u = jVar2;
        return jVar2;
    }
}
