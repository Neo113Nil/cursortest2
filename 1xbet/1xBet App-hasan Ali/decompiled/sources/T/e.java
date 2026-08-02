package T;

import P.AbstractC0316s0;
import e2.C1930k;
import java.util.Arrays;
import java.util.ListIterator;
import k4.AbstractC2036a;
import kotlin.jvm.internal.l;
import r3.AbstractC2349a;

/* loaded from: classes.dex */
public final class e extends c {

    /* renamed from: k, reason: collision with root package name */
    public final Object[] f5579k;

    /* renamed from: l, reason: collision with root package name */
    public final Object[] f5580l;

    /* renamed from: m, reason: collision with root package name */
    public final int f5581m;

    /* renamed from: n, reason: collision with root package name */
    public final int f5582n;

    public e(Object[] objArr, Object[] objArr2, int i, int i5) {
        this.f5579k = objArr;
        this.f5580l = objArr2;
        this.f5581m = i;
        this.f5582n = i5;
        if (!(c() > 32)) {
            AbstractC0316s0.a("Trie-based persistent vector should have at least 33 elements, got " + c());
        }
        int length = objArr2.length;
    }

    public static Object[] k(Object[] objArr, int i, int i5, Object obj, C1930k c1930k) {
        Object[] copyOf;
        int E5 = AbstractC2349a.E(i5, i);
        if (i == 0) {
            if (E5 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                l.e("copyOf(...)", copyOf);
            }
            X3.l.t0(E5 + 1, E5, 31, objArr, copyOf);
            c1930k.f16910l = objArr[31];
            copyOf[E5] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        l.e("copyOf(...)", copyOf2);
        int i6 = i - 5;
        Object obj2 = objArr[E5];
        l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj2);
        copyOf2[E5] = k((Object[]) obj2, i6, i5, obj, c1930k);
        while (true) {
            E5++;
            if (E5 >= 32 || copyOf2[E5] == null) {
                break;
            }
            Object obj3 = objArr[E5];
            l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj3);
            copyOf2[E5] = k((Object[]) obj3, i6, 0, c1930k.f16910l, c1930k);
        }
        return copyOf2;
    }

    public static Object[] m(Object[] objArr, int i, int i5, C1930k c1930k) {
        Object[] m5;
        int E5 = AbstractC2349a.E(i5, i);
        if (i == 5) {
            c1930k.f16910l = objArr[E5];
            m5 = null;
        } else {
            Object obj = objArr[E5];
            l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
            m5 = m((Object[]) obj, i - 5, i5, c1930k);
        }
        if (m5 == null && E5 == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        l.e("copyOf(...)", copyOf);
        copyOf[E5] = m5;
        return copyOf;
    }

    public static Object[] s(Object[] objArr, int i, int i5, Object obj) {
        int E5 = AbstractC2349a.E(i5, i);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        l.e("copyOf(...)", copyOf);
        if (i == 0) {
            copyOf[E5] = obj;
            return copyOf;
        }
        Object obj2 = copyOf[E5];
        l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj2);
        copyOf[E5] = s((Object[]) obj2, i - 5, i5, obj);
        return copyOf;
    }

    @Override // X3.AbstractC0441a
    public final int c() {
        return this.f5581m;
    }

    @Override // T.c
    public final c d(int i, Object obj) {
        int i5 = this.f5581m;
        AbstractC2036a.p(i, i5);
        if (i == i5) {
            return e(obj);
        }
        int r5 = r();
        Object[] objArr = this.f5579k;
        if (i >= r5) {
            return l(i - r5, obj, objArr);
        }
        C1930k c1930k = new C1930k(17, (Object) null);
        return l(0, c1930k.f16910l, k(objArr, this.f5582n, i, obj, c1930k));
    }

    @Override // T.c
    public final c e(Object obj) {
        int r5 = r();
        int i = this.f5581m;
        int i5 = i - r5;
        Object[] objArr = this.f5579k;
        Object[] objArr2 = this.f5580l;
        if (i5 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = obj;
            return n(objArr, objArr2, objArr3);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        l.e("copyOf(...)", copyOf);
        copyOf[i5] = obj;
        return new e(objArr, copyOf, i + 1, this.f5582n);
    }

    @Override // T.c
    public final f g() {
        return new f(this, this.f5579k, this.f5580l, this.f5582n);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        AbstractC2036a.n(i, c());
        if (r() <= i) {
            objArr = this.f5580l;
        } else {
            objArr = this.f5579k;
            for (int i5 = this.f5582n; i5 > 0; i5 -= 5) {
                Object obj = objArr[AbstractC2349a.E(i, i5)];
                l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    @Override // T.c
    public final c h(b bVar) {
        f fVar = new f(this, this.f5579k, this.f5580l, this.f5582n);
        fVar.A(bVar);
        return fVar.e();
    }

    @Override // T.c
    public final c i(int i) {
        AbstractC2036a.n(i, this.f5581m);
        int r5 = r();
        Object[] objArr = this.f5579k;
        int i5 = this.f5582n;
        if (i >= r5) {
            return q(objArr, r5, i5, i - r5);
        }
        return q(p(objArr, i5, i, new C1930k(17, this.f5580l[0])), r5, i5, 0);
    }

    @Override // T.c
    public final c j(int i, Object obj) {
        int i5 = this.f5581m;
        AbstractC2036a.n(i, i5);
        int r5 = r();
        Object[] objArr = this.f5579k;
        Object[] objArr2 = this.f5580l;
        int i6 = this.f5582n;
        if (r5 > i) {
            return new e(s(objArr, i6, i, obj), objArr2, i5, i6);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        l.e("copyOf(...)", copyOf);
        copyOf[i & 31] = obj;
        return new e(objArr, copyOf, i5, i6);
    }

    public final e l(int i, Object obj, Object[] objArr) {
        int r5 = r();
        int i5 = this.f5581m;
        int i6 = i5 - r5;
        Object[] objArr2 = this.f5580l;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        l.e("copyOf(...)", copyOf);
        if (i6 < 32) {
            X3.l.t0(i + 1, i, i6, objArr2, copyOf);
            copyOf[i] = obj;
            return new e(objArr, copyOf, i5 + 1, this.f5582n);
        }
        Object obj2 = objArr2[31];
        X3.l.t0(i + 1, i, i6 - 1, objArr2, copyOf);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return n(objArr, copyOf, objArr3);
    }

    @Override // X3.e, java.util.List
    public final ListIterator listIterator(int i) {
        AbstractC2036a.p(i, this.f5581m);
        return new g(i, this.f5581m, (this.f5582n / 5) + 1, this.f5579k, this.f5580l);
    }

    public final e n(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f5581m;
        int i5 = i >> 5;
        int i6 = this.f5582n;
        if (i5 <= (1 << i6)) {
            return new e(o(i6, objArr, objArr2), objArr3, i + 1, i6);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i7 = i6 + 5;
        return new e(o(i7, objArr4, objArr2), objArr3, i + 1, i7);
    }

    public final Object[] o(int i, Object[] objArr, Object[] objArr2) {
        Object[] objArr3;
        int E5 = AbstractC2349a.E(c() - 1, i);
        if (objArr != null) {
            objArr3 = Arrays.copyOf(objArr, 32);
            l.e("copyOf(...)", objArr3);
        } else {
            objArr3 = new Object[32];
        }
        if (i == 5) {
            objArr3[E5] = objArr2;
            return objArr3;
        }
        objArr3[E5] = o(i - 5, (Object[]) objArr3[E5], objArr2);
        return objArr3;
    }

    public final Object[] p(Object[] objArr, int i, int i5, C1930k c1930k) {
        Object[] copyOf;
        int E5 = AbstractC2349a.E(i5, i);
        if (i == 0) {
            if (E5 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                l.e("copyOf(...)", copyOf);
            }
            X3.l.t0(E5, E5 + 1, 32, objArr, copyOf);
            copyOf[31] = c1930k.f16910l;
            c1930k.f16910l = objArr[E5];
            return copyOf;
        }
        int E6 = objArr[31] == null ? AbstractC2349a.E(r() - 1, i) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        l.e("copyOf(...)", copyOf2);
        int i6 = i - 5;
        int i7 = E5 + 1;
        if (i7 <= E6) {
            while (true) {
                Object obj = copyOf2[E6];
                l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
                copyOf2[E6] = p((Object[]) obj, i6, 0, c1930k);
                if (E6 == i7) {
                    break;
                }
                E6--;
            }
        }
        Object obj2 = copyOf2[E5];
        l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj2);
        copyOf2[E5] = p((Object[]) obj2, i6, i5, c1930k);
        return copyOf2;
    }

    public final c q(Object[] objArr, int i, int i5, int i6) {
        int i7 = this.f5581m - i;
        Object obj = null;
        if (i7 != 1) {
            Object[] objArr2 = this.f5580l;
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            l.e("copyOf(...)", copyOf);
            int i8 = i7 - 1;
            if (i6 < i8) {
                X3.l.t0(i6, i6 + 1, i7, objArr2, copyOf);
            }
            copyOf[i8] = null;
            return new e(objArr, copyOf, (i + i7) - 1, i5);
        }
        if (i5 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                l.e("copyOf(...)", objArr);
            }
            return new i(objArr);
        }
        C1930k c1930k = new C1930k(17, obj);
        Object[] m5 = m(objArr, i5, i - 1, c1930k);
        l.c(m5);
        Object obj2 = c1930k.f16910l;
        l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj2);
        Object[] objArr3 = (Object[]) obj2;
        if (m5[1] != null) {
            return new e(m5, objArr3, i, i5);
        }
        Object obj3 = m5[0];
        l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj3);
        return new e((Object[]) obj3, objArr3, i, i5 - 5);
    }

    public final int r() {
        return (this.f5581m - 1) & (-32);
    }
}
