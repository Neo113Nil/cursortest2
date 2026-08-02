package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class Uu extends AbstractMap implements Serializable {

    /* renamed from: t, reason: collision with root package name */
    public static final Object f11832t = new Object();

    /* renamed from: k, reason: collision with root package name */
    public transient Object f11833k;

    /* renamed from: l, reason: collision with root package name */
    public transient int[] f11834l;

    /* renamed from: m, reason: collision with root package name */
    public transient Object[] f11835m;

    /* renamed from: n, reason: collision with root package name */
    public transient Object[] f11836n;

    /* renamed from: o, reason: collision with root package name */
    public transient int f11837o = AbstractC1400ot.G(8, 1);

    /* renamed from: p, reason: collision with root package name */
    public transient int f11838p;

    /* renamed from: q, reason: collision with root package name */
    public transient Su f11839q;

    /* renamed from: r, reason: collision with root package name */
    public transient Su f11840r;

    /* renamed from: s, reason: collision with root package name */
    public transient Pu f11841s;

    public final int[] a() {
        int[] iArr = this.f11834l;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] b() {
        Object[] objArr = this.f11835m;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] c() {
        Object[] objArr = this.f11836n;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (f()) {
            return;
        }
        this.f11837o += 32;
        Map d5 = d();
        if (d5 != null) {
            this.f11837o = AbstractC1400ot.G(size(), 3);
            d5.clear();
            this.f11833k = null;
            this.f11838p = 0;
            return;
        }
        Arrays.fill(b(), 0, this.f11838p, (Object) null);
        Arrays.fill(c(), 0, this.f11838p, (Object) null);
        Object obj = this.f11833k;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(a(), 0, this.f11838p, 0);
        this.f11838p = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map d5 = d();
        return d5 != null ? d5.containsKey(obj) : h(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map d5 = d();
        if (d5 != null) {
            return d5.containsValue(obj);
        }
        for (int i = 0; i < this.f11838p; i++) {
            if (AbstractC1400ot.q(obj, c()[i])) {
                return true;
            }
        }
        return false;
    }

    public final Map d() {
        Object obj = this.f11833k;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void e(int i, int i5) {
        Object obj = this.f11833k;
        Objects.requireNonNull(obj);
        int[] a5 = a();
        Object[] b3 = b();
        Object[] c5 = c();
        int size = size();
        int i6 = size - 1;
        if (i >= i6) {
            b3[i] = null;
            c5[i] = null;
            a5[i] = 0;
            return;
        }
        int i7 = i + 1;
        Object obj2 = b3[i6];
        b3[i] = obj2;
        c5[i] = c5[i6];
        b3[i6] = null;
        c5[i6] = null;
        a5[i] = a5[i6];
        a5[i6] = 0;
        int v4 = AbstractC1400ot.v(obj2) & i5;
        int H5 = AbstractC1400ot.H(v4, obj);
        if (H5 == size) {
            AbstractC1400ot.V(v4, i7, obj);
            return;
        }
        while (true) {
            int i8 = H5 - 1;
            int i9 = a5[i8];
            int i10 = i9 & i5;
            if (i10 == size) {
                a5[i8] = (i9 & (~i5)) | (i5 & i7);
                return;
            }
            H5 = i10;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Su su = this.f11840r;
        if (su != null) {
            return su;
        }
        Su su2 = new Su(this, 0);
        this.f11840r = su2;
        return su2;
    }

    public final boolean f() {
        return this.f11833k == null;
    }

    public final int g() {
        return (1 << (this.f11837o & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map d5 = d();
        if (d5 != null) {
            return d5.get(obj);
        }
        int h3 = h(obj);
        if (h3 == -1) {
            return null;
        }
        return c()[h3];
    }

    public final int h(Object obj) {
        if (f()) {
            return -1;
        }
        int v4 = AbstractC1400ot.v(obj);
        int g5 = g();
        Object obj2 = this.f11833k;
        Objects.requireNonNull(obj2);
        int H5 = AbstractC1400ot.H(v4 & g5, obj2);
        if (H5 != 0) {
            int i = ~g5;
            int i5 = v4 & i;
            do {
                int i6 = H5 - 1;
                int i7 = a()[i6];
                if ((i7 & i) == i5 && AbstractC1400ot.q(obj, b()[i6])) {
                    return i6;
                }
                H5 = i7 & g5;
            } while (H5 != 0);
        }
        return -1;
    }

    public final int i(int i, int i5, int i6, int i7) {
        int i8 = i5 - 1;
        Object Q5 = AbstractC1400ot.Q(i5);
        if (i7 != 0) {
            AbstractC1400ot.V(i6 & i8, i7 + 1, Q5);
        }
        Object obj = this.f11833k;
        Objects.requireNonNull(obj);
        int[] a5 = a();
        for (int i9 = 0; i9 <= i; i9++) {
            int H5 = AbstractC1400ot.H(i9, obj);
            while (H5 != 0) {
                int i10 = H5 - 1;
                int i11 = a5[i10];
                int i12 = ((~i) & i11) | i9;
                int i13 = i12 & i8;
                int H6 = AbstractC1400ot.H(i13, Q5);
                AbstractC1400ot.V(i13, H5, Q5);
                a5[i10] = ((~i8) & i12) | (H6 & i8);
                H5 = i11 & i;
            }
        }
        this.f11833k = Q5;
        this.f11837o = ((32 - Integer.numberOfLeadingZeros(i8)) & 31) | (this.f11837o & (-32));
        return i8;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object j(Object obj) {
        if (!f()) {
            int g5 = g();
            Object obj2 = this.f11833k;
            Objects.requireNonNull(obj2);
            int w5 = AbstractC1400ot.w(obj, null, g5, obj2, a(), b(), null);
            if (w5 != -1) {
                Object obj3 = c()[w5];
                e(w5, g5);
                this.f11838p--;
                this.f11837o += 32;
                return obj3;
            }
        }
        return f11832t;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Su su = this.f11839q;
        if (su != null) {
            return su;
        }
        Su su2 = new Su(this, 1);
        this.f11839q = su2;
        return su2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        int i5 = 32;
        if (f()) {
            AbstractC1400ot.i0("Arrays already allocated", f());
            int i6 = this.f11837o;
            int max = Math.max(i6 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f11833k = AbstractC1400ot.Q(max2);
            this.f11837o = ((32 - Integer.numberOfLeadingZeros(max2 - 1)) & 31) | (this.f11837o & (-32));
            this.f11834l = new int[i6];
            this.f11835m = new Object[i6];
            this.f11836n = new Object[i6];
        }
        Map d5 = d();
        if (d5 != null) {
            return d5.put(obj, obj2);
        }
        int[] a5 = a();
        Object[] b3 = b();
        Object[] c5 = c();
        int i7 = this.f11838p;
        int i8 = i7 + 1;
        int v4 = AbstractC1400ot.v(obj);
        int g5 = g();
        int i9 = v4 & g5;
        Object obj3 = this.f11833k;
        Objects.requireNonNull(obj3);
        int H5 = AbstractC1400ot.H(i9, obj3);
        if (H5 == 0) {
            if (i8 > g5) {
                g5 = i(g5, (g5 + 1) * (g5 < 32 ? 4 : 2), v4, i7);
            } else {
                Object obj4 = this.f11833k;
                Objects.requireNonNull(obj4);
                AbstractC1400ot.V(i9, i8, obj4);
            }
            i = 1;
        } else {
            int i10 = ~g5;
            int i11 = v4 & i10;
            int i12 = 0;
            while (true) {
                int i13 = H5 - 1;
                int i14 = a5[i13];
                i = 1;
                int i15 = i14 & i10;
                int i16 = i5;
                if (i15 == i11 && AbstractC1400ot.q(obj, b3[i13])) {
                    Object obj5 = c5[i13];
                    c5[i13] = obj2;
                    return obj5;
                }
                int i17 = i14 & g5;
                int i18 = i12 + 1;
                if (i17 != 0) {
                    i12 = i18;
                    H5 = i17;
                    i5 = i16;
                } else {
                    if (i18 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(g() + 1, 1.0f);
                        int i19 = isEmpty() ? -1 : 0;
                        while (i19 >= 0) {
                            linkedHashMap.put(b()[i19], c()[i19]);
                            int i20 = i19 + 1;
                            i19 = i20 < this.f11838p ? i20 : -1;
                        }
                        this.f11833k = linkedHashMap;
                        this.f11834l = null;
                        this.f11835m = null;
                        this.f11836n = null;
                        this.f11837o += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i8 > g5) {
                        g5 = i(g5, (g5 + 1) * (g5 < i16 ? 4 : 2), v4, i7);
                    } else {
                        a5[i13] = i15 | (i8 & g5);
                    }
                }
            }
        }
        int length = a().length;
        if (i8 > length) {
            int i21 = i;
            int min = Math.min(1073741823, (Math.max(i21, length >>> 1) + length) | i21);
            if (min != length) {
                this.f11834l = Arrays.copyOf(a(), min);
                this.f11835m = Arrays.copyOf(b(), min);
                this.f11836n = Arrays.copyOf(c(), min);
            }
        }
        a()[i7] = (~g5) & v4;
        b()[i7] = obj;
        c()[i7] = obj2;
        this.f11838p = i8;
        this.f11837o += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map d5 = d();
        if (d5 != null) {
            return d5.remove(obj);
        }
        Object j5 = j(obj);
        if (j5 == f11832t) {
            return null;
        }
        return j5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map d5 = d();
        return d5 != null ? d5.size() : this.f11838p;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Pu pu = this.f11841s;
        if (pu != null) {
            return pu;
        }
        Pu pu2 = new Pu(1, this);
        this.f11841s = pu2;
        return pu2;
    }
}
