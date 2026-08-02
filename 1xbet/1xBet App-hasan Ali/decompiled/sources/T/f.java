package T;

import P.AbstractC0316s0;
import X3.C0442b;
import e2.C1930k;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import k4.AbstractC2036a;
import kotlin.jvm.internal.l;
import r3.AbstractC2349a;

/* loaded from: classes.dex */
public final class f extends X3.g implements Collection, j4.b {

    /* renamed from: k, reason: collision with root package name */
    public c f5583k;

    /* renamed from: l, reason: collision with root package name */
    public Object[] f5584l;

    /* renamed from: m, reason: collision with root package name */
    public Object[] f5585m;

    /* renamed from: n, reason: collision with root package name */
    public int f5586n;

    /* renamed from: o, reason: collision with root package name */
    public W.b f5587o = new W.b();

    /* renamed from: p, reason: collision with root package name */
    public Object[] f5588p;

    /* renamed from: q, reason: collision with root package name */
    public Object[] f5589q;

    /* renamed from: r, reason: collision with root package name */
    public int f5590r;

    public f(c cVar, Object[] objArr, Object[] objArr2, int i) {
        this.f5583k = cVar;
        this.f5584l = objArr;
        this.f5585m = objArr2;
        this.f5586n = i;
        this.f5588p = objArr;
        this.f5589q = objArr2;
        this.f5590r = cVar.c();
    }

    public static void f(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (r0 != r8) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (z(r1, r8, r5) != r8) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A(i4.c cVar) {
        Object[] t5;
        int i;
        i4.c cVar2 = cVar;
        int G5 = G();
        Object[] objArr = null;
        C1930k c1930k = new C1930k(17, objArr);
        boolean z3 = false;
        if (this.f5588p != null) {
            a l5 = l(0);
            int i5 = 32;
            while (i5 == 32 && l5.hasNext()) {
                i5 = y(cVar2, (Object[]) l5.next(), 32, c1930k);
            }
            if (i5 == 32) {
                int z5 = z(cVar2, G5, c1930k);
                if (z5 == 0) {
                    s(this.f5588p, this.f5590r, this.f5586n);
                }
            } else {
                int i6 = (l5.f5573k - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i7 = i5;
                while (l5.hasNext()) {
                    i7 = x(cVar2, (Object[]) l5.next(), 32, i7, c1930k, arrayList2, arrayList);
                    cVar2 = cVar;
                }
                int x5 = x(cVar, this.f5589q, G5, i7, c1930k, arrayList2, arrayList);
                Object obj = c1930k.f16910l;
                l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
                Object[] objArr2 = (Object[]) obj;
                Arrays.fill(objArr2, x5, 32, (Object) null);
                if (arrayList.isEmpty()) {
                    t5 = this.f5588p;
                    l.c(t5);
                } else {
                    t5 = t(this.f5588p, i6, this.f5586n, arrayList.iterator());
                }
                int size = i6 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    AbstractC0316s0.a("invalid size");
                }
                if (size == 0) {
                    this.f5586n = 0;
                } else {
                    int i8 = size - 1;
                    while (true) {
                        i = this.f5586n;
                        if ((i8 >> i) != 0) {
                            break;
                        }
                        this.f5586n = i - 5;
                        Object[] objArr3 = t5[0];
                        l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", objArr3);
                        t5 = objArr3;
                    }
                    objArr = q(t5, i8, i);
                }
                this.f5588p = objArr;
                this.f5589q = objArr2;
                this.f5590r = size + x5;
            }
            z3 = true;
        }
        if (z3) {
            ((AbstractList) this).modCount++;
        }
        return z3;
    }

    public final Object[] B(Object[] objArr, int i, int i5, C1930k c1930k) {
        int E5 = AbstractC2349a.E(i5, i);
        if (i == 0) {
            Object obj = objArr[E5];
            Object[] m5 = m(objArr);
            X3.l.t0(E5, E5 + 1, 32, objArr, m5);
            m5[31] = c1930k.f16910l;
            c1930k.f16910l = obj;
            return m5;
        }
        int E6 = objArr[31] == null ? AbstractC2349a.E(D() - 1, i) : 31;
        Object[] m6 = m(objArr);
        int i6 = i - 5;
        int i7 = E5 + 1;
        if (i7 <= E6) {
            while (true) {
                Object obj2 = m6[E6];
                l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj2);
                m6[E6] = B((Object[]) obj2, i6, 0, c1930k);
                if (E6 == i7) {
                    break;
                }
                E6--;
            }
        }
        Object obj3 = m6[E5];
        l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj3);
        m6[E5] = B((Object[]) obj3, i6, i5, c1930k);
        return m6;
    }

    public final Object C(Object[] objArr, int i, int i5, int i6) {
        int i7 = this.f5590r - i;
        if (i7 == 1) {
            Object obj = this.f5589q[0];
            s(objArr, i, i5);
            return obj;
        }
        Object[] objArr2 = this.f5589q;
        Object obj2 = objArr2[i6];
        Object[] m5 = m(objArr2);
        X3.l.t0(i6, i6 + 1, i7, objArr2, m5);
        m5[i7 - 1] = null;
        this.f5588p = objArr;
        this.f5589q = m5;
        this.f5590r = (i + i7) - 1;
        this.f5586n = i5;
        return obj2;
    }

    public final int D() {
        int i = this.f5590r;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] E(Object[] objArr, int i, int i5, Object obj, C1930k c1930k) {
        int E5 = AbstractC2349a.E(i5, i);
        Object[] m5 = m(objArr);
        if (i != 0) {
            Object obj2 = m5[E5];
            l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj2);
            m5[E5] = E((Object[]) obj2, i - 5, i5, obj, c1930k);
            return m5;
        }
        if (m5 != objArr) {
            ((AbstractList) this).modCount++;
        }
        c1930k.f16910l = m5[E5];
        m5[E5] = obj;
        return m5;
    }

    public final void F(Collection collection, int i, Object[] objArr, int i5, Object[][] objArr2, int i6, Object[] objArr3) {
        Object[] o5;
        if (i6 < 1) {
            AbstractC0316s0.a("requires at least one nullBuffer");
        }
        Object[] m5 = m(objArr);
        objArr2[0] = m5;
        int i7 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i8 = (i5 - i7) + size;
        if (i8 < 32) {
            X3.l.t0(size + 1, i7, i5, m5, objArr3);
        } else {
            int i9 = i8 - 31;
            if (i6 == 1) {
                o5 = m5;
            } else {
                o5 = o();
                i6--;
                objArr2[i6] = o5;
            }
            int i10 = i5 - i9;
            X3.l.t0(0, i10, i5, m5, objArr3);
            X3.l.t0(size + 1, i7, i10, m5, o5);
            objArr3 = o5;
        }
        Iterator it = collection.iterator();
        f(m5, i7, it);
        for (int i11 = 1; i11 < i6; i11++) {
            Object[] o6 = o();
            f(o6, 0, it);
            objArr2[i11] = o6;
        }
        f(objArr3, 0, it);
    }

    public final int G() {
        int i = this.f5590r;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        AbstractC2036a.p(i, c());
        if (i == c()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int D5 = D();
        if (i >= D5) {
            j(i - D5, obj, this.f5588p);
            return;
        }
        C1930k c1930k = new C1930k(17, (Object) null);
        Object[] objArr = this.f5588p;
        l.c(objArr);
        j(0, c1930k.f16910l, i(objArr, this.f5586n, i, obj, c1930k));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        f fVar;
        Object[] o5;
        AbstractC2036a.p(i, this.f5590r);
        if (i == this.f5590r) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i5 = (i >> 5) << 5;
        int size = ((collection.size() + (this.f5590r - i5)) - 1) / 32;
        if (size == 0) {
            int i6 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.f5589q;
            Object[] m5 = m(objArr);
            X3.l.t0(size2 + 1, i6, G(), objArr, m5);
            f(m5, i6, collection.iterator());
            this.f5589q = m5;
            this.f5590r = collection.size() + this.f5590r;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int G5 = G();
        int size3 = collection.size() + this.f5590r;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= D()) {
            o5 = o();
            collection2 = collection;
            F(collection2, i, this.f5589q, G5, objArr2, size, o5);
            fVar = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            fVar = this;
            if (size3 > G5) {
                int i7 = size3 - G5;
                Object[] n5 = n(i7, fVar.f5589q);
                fVar.h(collection2, i, i7, objArr2, size, n5);
                objArr2 = objArr2;
                o5 = n5;
            } else {
                Object[] objArr3 = fVar.f5589q;
                o5 = o();
                int i8 = G5 - size3;
                X3.l.t0(0, i8, G5, objArr3, o5);
                int i9 = 32 - i8;
                Object[] n6 = n(i9, fVar.f5589q);
                int i10 = size - 1;
                objArr2[i10] = n6;
                fVar.h(collection2, i, i9, objArr2, i10, n6);
                collection2 = collection2;
            }
        }
        fVar.f5588p = u(fVar.f5588p, i5, objArr2);
        fVar.f5589q = o5;
        fVar.f5590r = collection2.size() + fVar.f5590r;
        return true;
    }

    @Override // X3.g
    public final int c() {
        return this.f5590r;
    }

    @Override // X3.g
    public final Object d(int i) {
        AbstractC2036a.n(i, c());
        ((AbstractList) this).modCount++;
        int D5 = D();
        if (i >= D5) {
            return C(this.f5588p, D5, this.f5586n, i - D5);
        }
        C1930k c1930k = new C1930k(17, this.f5589q[0]);
        Object[] objArr = this.f5588p;
        l.c(objArr);
        C(B(objArr, this.f5586n, i, c1930k), D5, this.f5586n, 0);
        return c1930k.f16910l;
    }

    public final c e() {
        c eVar;
        Object[] objArr = this.f5588p;
        if (objArr == this.f5584l && this.f5589q == this.f5585m) {
            eVar = this.f5583k;
        } else {
            this.f5587o = new W.b();
            this.f5584l = objArr;
            Object[] objArr2 = this.f5589q;
            this.f5585m = objArr2;
            if (objArr != null) {
                eVar = new e(objArr, objArr2, this.f5590r, this.f5586n);
            } else if (objArr2.length == 0) {
                eVar = i.f5597l;
            } else {
                Object[] copyOf = Arrays.copyOf(objArr2, this.f5590r);
                l.e("copyOf(...)", copyOf);
                eVar = new i(copyOf);
            }
        }
        this.f5583k = eVar;
        return eVar;
    }

    public final int g() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        AbstractC2036a.n(i, c());
        if (D() <= i) {
            objArr = this.f5589q;
        } else {
            objArr = this.f5588p;
            l.c(objArr);
            for (int i5 = this.f5586n; i5 > 0; i5 -= 5) {
                Object obj = objArr[AbstractC2349a.E(i, i5)];
                l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    public final void h(Collection collection, int i, int i5, Object[][] objArr, int i6, Object[] objArr2) {
        if (this.f5588p == null) {
            throw new IllegalStateException("root is null");
        }
        int i7 = i >> 5;
        a l5 = l(D() >> 5);
        int i8 = i6;
        Object[] objArr3 = objArr2;
        while (l5.f5573k - 1 != i7) {
            Object[] objArr4 = (Object[]) l5.previous();
            X3.l.t0(0, 32 - i5, 32, objArr4, objArr3);
            objArr3 = n(i5, objArr4);
            i8--;
            objArr[i8] = objArr3;
        }
        Object[] objArr5 = (Object[]) l5.previous();
        int D5 = i6 - (((D() >> 5) - 1) - i7);
        if (D5 < i6) {
            objArr2 = objArr[D5];
            l.c(objArr2);
        }
        F(collection, i, objArr5, 32, objArr, D5, objArr2);
    }

    public final Object[] i(Object[] objArr, int i, int i5, Object obj, C1930k c1930k) {
        Object obj2;
        int E5 = AbstractC2349a.E(i5, i);
        if (i == 0) {
            c1930k.f16910l = objArr[31];
            Object[] m5 = m(objArr);
            X3.l.t0(E5 + 1, E5, 31, objArr, m5);
            m5[E5] = obj;
            return m5;
        }
        Object[] m6 = m(objArr);
        int i6 = i - 5;
        Object obj3 = m6[E5];
        l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj3);
        m6[E5] = i((Object[]) obj3, i6, i5, obj, c1930k);
        while (true) {
            E5++;
            if (E5 >= 32 || (obj2 = m6[E5]) == null) {
                break;
            }
            m6[E5] = i((Object[]) obj2, i6, 0, c1930k.f16910l, c1930k);
        }
        return m6;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i, Object obj, Object[] objArr) {
        int G5 = G();
        Object[] m5 = m(this.f5589q);
        if (G5 >= 32) {
            Object[] objArr2 = this.f5589q;
            Object obj2 = objArr2[31];
            X3.l.t0(i + 1, i, 31, objArr2, m5);
            m5[i] = obj;
            v(objArr, m5, p(obj2));
            return;
        }
        X3.l.t0(i + 1, i, G5, this.f5589q, m5);
        m5[i] = obj;
        this.f5588p = objArr;
        this.f5589q = m5;
        this.f5590r++;
    }

    public final boolean k(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f5587o;
    }

    public final a l(int i) {
        Object[] objArr = this.f5588p;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int D5 = D() >> 5;
        AbstractC2036a.p(i, D5);
        int i5 = this.f5586n;
        return i5 == 0 ? new d(i, objArr) : new j(objArr, i, D5, i5 / 5);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        AbstractC2036a.p(i, this.f5590r);
        return new h(this, i);
    }

    public final Object[] m(Object[] objArr) {
        if (objArr == null) {
            return o();
        }
        if (k(objArr)) {
            return objArr;
        }
        Object[] o5 = o();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        X3.l.y0(0, length, 6, objArr, o5);
        return o5;
    }

    public final Object[] n(int i, Object[] objArr) {
        if (k(objArr)) {
            X3.l.t0(i, 0, 32 - i, objArr, objArr);
            return objArr;
        }
        Object[] o5 = o();
        X3.l.t0(i, 0, 32 - i, objArr, o5);
        return o5;
    }

    public final Object[] o() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f5587o;
        return objArr;
    }

    public final Object[] p(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f5587o;
        return objArr;
    }

    public final Object[] q(Object[] objArr, int i, int i5) {
        if (i5 < 0) {
            AbstractC0316s0.a("shift should be positive");
        }
        if (i5 == 0) {
            return objArr;
        }
        int E5 = AbstractC2349a.E(i, i5);
        Object obj = objArr[E5];
        l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
        Object q5 = q((Object[]) obj, i, i5 - 5);
        if (E5 < 31) {
            int i6 = E5 + 1;
            if (objArr[i6] != null) {
                if (k(objArr)) {
                    Arrays.fill(objArr, i6, 32, (Object) null);
                }
                Object[] o5 = o();
                X3.l.t0(0, 0, i6, objArr, o5);
                objArr = o5;
            }
        }
        if (q5 == objArr[E5]) {
            return objArr;
        }
        Object[] m5 = m(objArr);
        m5[E5] = q5;
        return m5;
    }

    public final Object[] r(Object[] objArr, int i, int i5, C1930k c1930k) {
        Object[] r5;
        int E5 = AbstractC2349a.E(i5 - 1, i);
        if (i == 5) {
            c1930k.f16910l = objArr[E5];
            r5 = null;
        } else {
            Object obj = objArr[E5];
            l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
            r5 = r((Object[]) obj, i - 5, i5, c1930k);
        }
        if (r5 == null && E5 == 0) {
            return null;
        }
        Object[] m5 = m(objArr);
        m5[E5] = r5;
        return m5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return A(new b(1, collection));
    }

    public final void s(Object[] objArr, int i, int i5) {
        Object obj = null;
        if (i5 == 0) {
            this.f5588p = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f5589q = objArr;
            this.f5590r = i;
            this.f5586n = i5;
            return;
        }
        C1930k c1930k = new C1930k(17, obj);
        l.c(objArr);
        Object[] r5 = r(objArr, i5, i, c1930k);
        l.c(r5);
        Object obj2 = c1930k.f16910l;
        l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj2);
        this.f5589q = (Object[]) obj2;
        this.f5590r = i;
        if (r5[1] == null) {
            this.f5588p = (Object[]) r5[0];
            this.f5586n = i5 - 5;
        } else {
            this.f5588p = r5;
            this.f5586n = i5;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        AbstractC2036a.n(i, c());
        if (D() > i) {
            C1930k c1930k = new C1930k(17, (Object) null);
            Object[] objArr = this.f5588p;
            l.c(objArr);
            this.f5588p = E(objArr, this.f5586n, i, obj, c1930k);
            return c1930k.f16910l;
        }
        Object[] m5 = m(this.f5589q);
        if (m5 != this.f5589q) {
            ((AbstractList) this).modCount++;
        }
        int i5 = i & 31;
        Object obj2 = m5[i5];
        m5[i5] = obj;
        this.f5589q = m5;
        return obj2;
    }

    public final Object[] t(Object[] objArr, int i, int i5, Iterator it) {
        if (!it.hasNext()) {
            AbstractC0316s0.a("invalid buffersIterator");
        }
        if (!(i5 >= 0)) {
            AbstractC0316s0.a("negative shift");
        }
        if (i5 == 0) {
            return (Object[]) it.next();
        }
        Object[] m5 = m(objArr);
        int E5 = AbstractC2349a.E(i, i5);
        int i6 = i5 - 5;
        m5[E5] = t((Object[]) m5[E5], i, i6, it);
        while (true) {
            E5++;
            if (E5 >= 32 || !it.hasNext()) {
                break;
            }
            m5[E5] = t((Object[]) m5[E5], 0, i6, it);
        }
        return m5;
    }

    public final Object[] u(Object[] objArr, int i, Object[][] objArr2) {
        C0442b i5 = l.i(objArr2);
        int i6 = i >> 5;
        int i7 = this.f5586n;
        Object[] t5 = i6 < (1 << i7) ? t(objArr, i, i7, i5) : m(objArr);
        while (i5.hasNext()) {
            this.f5586n += 5;
            t5 = p(t5);
            int i8 = this.f5586n;
            t(t5, 1 << i8, i8, i5);
        }
        return t5;
    }

    public final void v(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f5590r;
        int i5 = i >> 5;
        int i6 = this.f5586n;
        if (i5 > (1 << i6)) {
            this.f5588p = w(this.f5586n + 5, p(objArr), objArr2);
            this.f5589q = objArr3;
            this.f5586n += 5;
            this.f5590r++;
            return;
        }
        if (objArr == null) {
            this.f5588p = objArr2;
            this.f5589q = objArr3;
            this.f5590r = i + 1;
        } else {
            this.f5588p = w(i6, objArr, objArr2);
            this.f5589q = objArr3;
            this.f5590r++;
        }
    }

    public final Object[] w(int i, Object[] objArr, Object[] objArr2) {
        int E5 = AbstractC2349a.E(c() - 1, i);
        Object[] m5 = m(objArr);
        if (i == 5) {
            m5[E5] = objArr2;
            return m5;
        }
        m5[E5] = w(i - 5, (Object[]) m5[E5], objArr2);
        return m5;
    }

    public final int x(i4.c cVar, Object[] objArr, int i, int i5, C1930k c1930k, ArrayList arrayList, ArrayList arrayList2) {
        if (k(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = c1930k.f16910l;
        l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i6 = 0; i6 < i; i6++) {
            Object obj2 = objArr[i6];
            if (!((Boolean) cVar.c(obj2)).booleanValue()) {
                if (i5 == 32) {
                    objArr3 = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : o();
                    i5 = 0;
                }
                objArr3[i5] = obj2;
                i5++;
            }
        }
        c1930k.f16910l = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i5;
    }

    public final int y(i4.c cVar, Object[] objArr, int i, C1930k c1930k) {
        Object[] objArr2 = objArr;
        int i5 = i;
        boolean z3 = false;
        for (int i6 = 0; i6 < i; i6++) {
            Object obj = objArr[i6];
            if (((Boolean) cVar.c(obj)).booleanValue()) {
                if (!z3) {
                    objArr2 = m(objArr);
                    z3 = true;
                    i5 = i6;
                }
            } else if (z3) {
                objArr2[i5] = obj;
                i5++;
            }
        }
        c1930k.f16910l = objArr2;
        return i5;
    }

    public final int z(i4.c cVar, int i, C1930k c1930k) {
        int y5 = y(cVar, this.f5589q, i, c1930k);
        if (y5 == i) {
            return i;
        }
        Object obj = c1930k.f16910l;
        l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, y5, i, (Object) null);
        this.f5589q = objArr;
        this.f5590r -= i - y5;
        return y5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int G5 = G();
        if (G5 < 32) {
            Object[] m5 = m(this.f5589q);
            m5[G5] = obj;
            this.f5589q = m5;
            this.f5590r = c() + 1;
        } else {
            v(this.f5588p, this.f5589q, p(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int G5 = G();
        Iterator it = collection.iterator();
        if (32 - G5 >= collection.size()) {
            Object[] m5 = m(this.f5589q);
            f(m5, G5, it);
            this.f5589q = m5;
            this.f5590r = collection.size() + this.f5590r;
            return true;
        }
        int size = ((collection.size() + G5) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] m6 = m(this.f5589q);
        f(m6, G5, it);
        objArr[0] = m6;
        for (int i = 1; i < size; i++) {
            Object[] o5 = o();
            f(o5, 0, it);
            objArr[i] = o5;
        }
        this.f5588p = u(this.f5588p, D(), objArr);
        Object[] o6 = o();
        f(o6, 0, it);
        this.f5589q = o6;
        this.f5590r = collection.size() + this.f5590r;
        return true;
    }
}
