package X0;

import Bl0.C2652m;
import Bl0.k0;
import S0.B0;
import java.util.Arrays;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class t<K, V> {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final t f33937e = new t(0, 0, new Object[0], null);

    /* renamed from: a, reason: collision with root package name */
    private int f33938a;

    /* renamed from: b, reason: collision with root package name */
    private int f33939b;

    /* renamed from: c, reason: collision with root package name */
    private final k0 f33940c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private Object[] f33941d;

    public static final class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private t<K, V> f33942a;

        /* renamed from: b, reason: collision with root package name */
        private final int f33943b;

        public a(@NotNull t<K, V> tVar, int i11) {
            this.f33942a = tVar;
            this.f33943b = i11;
        }

        @NotNull
        public final t<K, V> a() {
            return this.f33942a;
        }

        public final int b() {
            return this.f33943b;
        }

        public final void c(@NotNull t<K, V> tVar) {
            this.f33942a = tVar;
        }
    }

    public t(int i11, int i12, @NotNull Object[] objArr, k0 k0Var) {
        this.f33938a = i11;
        this.f33939b = i12;
        this.f33940c = k0Var;
        this.f33941d = objArr;
    }

    private final V A(int i11) {
        return (V) this.f33941d[i11 + 1];
    }

    private final Object[] b(int i11, int i12, int i13, K k11, V v11, int i14, k0 k0Var) {
        Object obj = this.f33941d[i11];
        t m11 = m(obj != null ? obj.hashCode() : 0, obj, A(i11), i13, k11, v11, i14 + 5, k0Var);
        int w11 = w(i12);
        int i15 = w11 + 1;
        Object[] objArr = this.f33941d;
        Object[] objArr2 = new Object[objArr.length - 1];
        C7705l.u(objArr, 0, objArr2, i11, 6);
        C7705l.r(objArr, i11, objArr2, i11 + 2, i15);
        objArr2[w11 - 1] = m11;
        C7705l.r(objArr, w11, objArr2, i15, objArr.length);
        return objArr2;
    }

    private final int c() {
        if (this.f33939b == 0) {
            return this.f33941d.length / 2;
        }
        int bitCount = Integer.bitCount(this.f33938a);
        int length = this.f33941d.length;
        for (int i11 = bitCount * 2; i11 < length; i11++) {
            bitCount += v(i11).c();
        }
        return bitCount;
    }

    private final boolean d(K k11) {
        kotlin.ranges.e m11 = kotlin.ranges.h.m(kotlin.ranges.h.o(0, this.f33941d.length), 2);
        int f71842a = m11.getF71842a();
        int f71843b = m11.getF71843b();
        int f71844c = m11.getF71844c();
        if ((f71844c > 0 && f71842a <= f71843b) || (f71844c < 0 && f71843b <= f71842a)) {
            while (!Intrinsics.d(k11, this.f33941d[f71842a])) {
                if (f71842a != f71843b) {
                    f71842a += f71844c;
                }
            }
            return true;
        }
        return false;
    }

    private final boolean f(t<K, V> tVar) {
        if (this == tVar) {
            return true;
        }
        if (this.f33939b != tVar.f33939b || this.f33938a != tVar.f33938a) {
            return false;
        }
        int length = this.f33941d.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.f33941d[i11] != tVar.f33941d[i11]) {
                return false;
            }
        }
        return true;
    }

    private final boolean l(int i11) {
        return (i11 & this.f33939b) != 0;
    }

    private static t m(int i11, Object obj, Object obj2, int i12, Object obj3, Object obj4, int i13, k0 k0Var) {
        if (i13 > 30) {
            return new t(0, 0, new Object[]{obj, obj2, obj3, obj4}, k0Var);
        }
        int d11 = C2652m.d(i11, i13);
        int d12 = C2652m.d(i12, i13);
        if (d11 != d12) {
            return new t((1 << d11) | (1 << d12), 0, d11 < d12 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, k0Var);
        }
        return new t(0, 1 << d11, new Object[]{m(i11, obj, obj2, i12, obj3, obj4, i13 + 5, k0Var)}, k0Var);
    }

    private final t<K, V> n(int i11, f<K, V> fVar) {
        fVar.y(fVar.h() - 1);
        fVar.u(A(i11));
        if (this.f33941d.length == 2) {
            return null;
        }
        if (this.f33940c != fVar.p()) {
            return new t<>(0, 0, C2652m.b(i11, this.f33941d), fVar.p());
        }
        this.f33941d = C2652m.b(i11, this.f33941d);
        return this;
    }

    private final t<K, V> s(int i11, int i12, f<K, V> fVar) {
        fVar.y(fVar.h() - 1);
        fVar.u(A(i11));
        if (this.f33941d.length == 2) {
            return null;
        }
        if (this.f33940c != fVar.p()) {
            return new t<>(i12 ^ this.f33938a, this.f33939b, C2652m.b(i11, this.f33941d), fVar.p());
        }
        this.f33941d = C2652m.b(i11, this.f33941d);
        this.f33938a ^= i12;
        return this;
    }

    private final t<K, V> t(t<K, V> tVar, t<K, V> tVar2, int i11, int i12, k0 k0Var) {
        k0 k0Var2 = this.f33940c;
        if (tVar2 != null) {
            return (k0Var2 == k0Var || tVar != tVar2) ? u(i11, tVar2, k0Var) : this;
        }
        Object[] objArr = this.f33941d;
        if (objArr.length == 1) {
            return null;
        }
        if (k0Var2 != k0Var) {
            return new t<>(this.f33938a, i12 ^ this.f33939b, C2652m.c(i11, objArr), k0Var);
        }
        this.f33941d = C2652m.c(i11, objArr);
        this.f33939b ^= i12;
        return this;
    }

    private final t<K, V> u(int i11, t<K, V> tVar, k0 k0Var) {
        Object[] objArr = this.f33941d;
        if (objArr.length == 1 && tVar.f33941d.length == 2 && tVar.f33939b == 0) {
            tVar.f33938a = this.f33939b;
            return tVar;
        }
        if (this.f33940c == k0Var) {
            objArr[i11] = tVar;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i11] = tVar;
        return new t<>(this.f33938a, this.f33939b, copyOf, k0Var);
    }

    private final t<K, V> z(int i11, int i12, t<K, V> tVar) {
        Object[] objArr = tVar.f33941d;
        if (objArr.length != 2 || tVar.f33939b != 0) {
            Object[] objArr2 = this.f33941d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            copyOf[i11] = tVar;
            return new t<>(this.f33938a, this.f33939b, copyOf, null);
        }
        if (this.f33941d.length == 1) {
            tVar.f33938a = this.f33939b;
            return tVar;
        }
        int h11 = h(i12);
        Object[] objArr3 = this.f33941d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        C7705l.r(copyOf2, i11 + 2, copyOf2, i11 + 1, objArr3.length);
        C7705l.r(copyOf2, h11 + 2, copyOf2, h11, i11);
        copyOf2[h11] = obj;
        copyOf2[h11 + 1] = obj2;
        return new t<>(this.f33938a ^ i12, i12 ^ this.f33939b, copyOf2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e(int i11, int i12, Object obj) {
        int d11 = 1 << C2652m.d(i11, i12);
        if (k(d11)) {
            return Intrinsics.d(obj, this.f33941d[h(d11)]);
        }
        if (!l(d11)) {
            return false;
        }
        t<K, V> v11 = v(w(d11));
        return i12 == 30 ? v11.d(obj) : v11.e(i11, i12 + 5, obj);
    }

    public final int g() {
        return Integer.bitCount(this.f33938a);
    }

    public final int h(int i11) {
        return Integer.bitCount((i11 - 1) & this.f33938a) * 2;
    }

    public final Object i(int i11, int i12, Object obj) {
        int d11 = 1 << C2652m.d(i11, i12);
        if (k(d11)) {
            int h11 = h(d11);
            if (Intrinsics.d(obj, this.f33941d[h11])) {
                return A(h11);
            }
            return null;
        }
        if (!l(d11)) {
            return null;
        }
        t<K, V> v11 = v(w(d11));
        if (i12 != 30) {
            return v11.i(i11, i12 + 5, obj);
        }
        kotlin.ranges.e m11 = kotlin.ranges.h.m(kotlin.ranges.h.o(0, v11.f33941d.length), 2);
        int f71842a = m11.getF71842a();
        int f71843b = m11.getF71843b();
        int f71844c = m11.getF71844c();
        if ((f71844c > 0 && f71842a <= f71843b) || (f71844c < 0 && f71843b <= f71842a)) {
            while (!Intrinsics.d(obj, v11.f33941d[f71842a])) {
                if (f71842a != f71843b) {
                    f71842a += f71844c;
                }
            }
            return v11.A(f71842a);
        }
        return null;
    }

    @NotNull
    public final Object[] j() {
        return this.f33941d;
    }

    public final boolean k(int i11) {
        return (i11 & this.f33938a) != 0;
    }

    @NotNull
    public final t<K, V> o(int i11, K k11, V v11, int i12, @NotNull f<K, V> fVar) {
        f<K, V> fVar2;
        t<K, V> o11;
        int d11 = 1 << C2652m.d(i11, i12);
        boolean k12 = k(d11);
        k0 k0Var = this.f33940c;
        if (k12) {
            int h11 = h(d11);
            if (!Intrinsics.d(k11, this.f33941d[h11])) {
                fVar.y(fVar.h() + 1);
                k0 p11 = fVar.p();
                if (k0Var != p11) {
                    return new t<>(this.f33938a ^ d11, this.f33939b | d11, b(h11, d11, i11, k11, v11, i12, p11), p11);
                }
                this.f33941d = b(h11, d11, i11, k11, v11, i12, p11);
                this.f33938a ^= d11;
                this.f33939b |= d11;
                return this;
            }
            fVar.u(A(h11));
            if (A(h11) == v11) {
                return this;
            }
            if (k0Var == fVar.p()) {
                this.f33941d[h11 + 1] = v11;
                return this;
            }
            fVar.s(fVar.m() + 1);
            Object[] objArr = this.f33941d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
            copyOf[h11 + 1] = v11;
            return new t<>(this.f33938a, this.f33939b, copyOf, fVar.p());
        }
        if (!l(d11)) {
            fVar.y(fVar.h() + 1);
            k0 p12 = fVar.p();
            int h12 = h(d11);
            if (k0Var != p12) {
                return new t<>(this.f33938a | d11, this.f33939b, C2652m.a(this.f33941d, h12, k11, v11), p12);
            }
            this.f33941d = C2652m.a(this.f33941d, h12, k11, v11);
            this.f33938a |= d11;
            return this;
        }
        int w11 = w(d11);
        t<K, V> v12 = v(w11);
        if (i12 == 30) {
            kotlin.ranges.e m11 = kotlin.ranges.h.m(kotlin.ranges.h.o(0, v12.f33941d.length), 2);
            int f71842a = m11.getF71842a();
            int f71843b = m11.getF71843b();
            int f71844c = m11.getF71844c();
            if ((f71844c > 0 && f71842a <= f71843b) || (f71844c < 0 && f71843b <= f71842a)) {
                while (!Intrinsics.d(k11, v12.f33941d[f71842a])) {
                    if (f71842a != f71843b) {
                        f71842a += f71844c;
                    }
                }
                fVar.u(v12.A(f71842a));
                if (v12.f33940c == fVar.p()) {
                    v12.f33941d[f71842a + 1] = v11;
                    o11 = v12;
                } else {
                    fVar.s(fVar.m() + 1);
                    Object[] objArr2 = v12.f33941d;
                    Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, size)");
                    copyOf2[f71842a + 1] = v11;
                    o11 = new t<>(0, 0, copyOf2, fVar.p());
                }
                fVar2 = fVar;
            }
            fVar.y(fVar.h() + 1);
            o11 = new t<>(0, 0, C2652m.a(v12.f33941d, 0, k11, v11), fVar.p());
            fVar2 = fVar;
        } else {
            fVar2 = fVar;
            o11 = v12.o(i11, k11, v11, i12 + 5, fVar2);
        }
        return v12 == o11 ? this : u(w11, o11, fVar2.p());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r14v1, types: [X0.t] */
    /* JADX WARN: Type inference failed for: r14v2, types: [X0.t] */
    /* JADX WARN: Type inference failed for: r14v3, types: [X0.t] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [X0.t] */
    /* JADX WARN: Type inference failed for: r14v6, types: [X0.t] */
    /* JADX WARN: Type inference failed for: r14v7, types: [X0.t] */
    /* JADX WARN: Type inference failed for: r23v0, types: [X0.t, X0.t<K, V>] */
    @NotNull
    public final t<K, V> p(@NotNull t<K, V> tVar, int i11, @NotNull Z0.a aVar, @NotNull f<K, V> fVar) {
        int i12;
        t<K, V> tVar2;
        if (this == tVar) {
            aVar.b(c());
            return this;
        }
        int i13 = 1;
        int i14 = 0;
        if (i11 > 30) {
            k0 p11 = fVar.p();
            Object[] objArr = this.f33941d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + tVar.f33941d.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            int length = this.f33941d.length;
            kotlin.ranges.e m11 = kotlin.ranges.h.m(kotlin.ranges.h.o(0, tVar.f33941d.length), 2);
            int f71842a = m11.getF71842a();
            int f71843b = m11.getF71843b();
            int f71844c = m11.getF71844c();
            if ((f71844c > 0 && f71842a <= f71843b) || (f71844c < 0 && f71843b <= f71842a)) {
                while (true) {
                    if (d(tVar.f33941d[f71842a])) {
                        aVar.c(aVar.a() + 1);
                    } else {
                        Object[] objArr2 = tVar.f33941d;
                        copyOf[length] = objArr2[f71842a];
                        copyOf[length + 1] = objArr2[f71842a + 1];
                        length += 2;
                    }
                    if (f71842a == f71843b) {
                        break;
                    }
                    f71842a += f71844c;
                }
            }
            if (length != this.f33941d.length) {
                if (length != tVar.f33941d.length) {
                    if (length == copyOf.length) {
                        return new t<>(0, 0, copyOf, p11);
                    }
                    Object[] copyOf2 = Arrays.copyOf(copyOf, length);
                    Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
                    return new t<>(0, 0, copyOf2, p11);
                }
            }
            return this;
        }
        int i15 = this.f33939b | tVar.f33939b;
        int i16 = this.f33938a;
        int i17 = tVar.f33938a;
        int i18 = (i16 ^ i17) & (~i15);
        int i19 = i16 & i17;
        while (i19 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i19);
            if (Intrinsics.d(this.f33941d[h(lowestOneBit)], tVar.f33941d[tVar.h(lowestOneBit)])) {
                i18 |= lowestOneBit;
            } else {
                i15 |= lowestOneBit;
            }
            i19 ^= lowestOneBit;
        }
        if (!((i15 & i18) == 0)) {
            B0.b("Check failed.");
            throw null;
        }
        t<K, V> tVar3 = (Intrinsics.d(this.f33940c, fVar.p()) && this.f33938a == i18 && this.f33939b == i15) ? this : new t<>(i18, i15, new Object[Integer.bitCount(i15) + (Integer.bitCount(i18) * 2)], null);
        int i21 = 0;
        while (i15 != 0) {
            int lowestOneBit2 = Integer.lowestOneBit(i15);
            ?? r11 = tVar3.f33941d;
            int length2 = (r11.length - i13) - i21;
            if (l(lowestOneBit2)) {
                tVar2 = (t<K, V>) v(w(lowestOneBit2));
                if (tVar.l(lowestOneBit2)) {
                    i12 = i13;
                    tVar2 = (t<K, V>) tVar2.p(tVar.v(tVar.w(lowestOneBit2)), i11 + 5, aVar, fVar);
                } else {
                    i12 = i13;
                    if (tVar.k(lowestOneBit2)) {
                        int h11 = tVar.h(lowestOneBit2);
                        Object obj = tVar.f33941d[h11];
                        V A11 = tVar.A(h11);
                        int h12 = fVar.h();
                        tVar2 = (t<K, V>) tVar2.o(obj != null ? obj.hashCode() : i14, obj, A11, i11 + 5, fVar);
                        if (fVar.h() == h12) {
                            aVar.c(aVar.a() + 1);
                        }
                    }
                }
            } else {
                i12 = i13;
                if (tVar.l(lowestOneBit2)) {
                    tVar2 = tVar.v(tVar.w(lowestOneBit2));
                    if (k(lowestOneBit2)) {
                        int h13 = h(lowestOneBit2);
                        Object obj2 = this.f33941d[h13];
                        int hashCode = obj2 != null ? obj2.hashCode() : i14;
                        int i22 = i11 + 5;
                        if (tVar2.e(hashCode, i22, obj2)) {
                            aVar.c(aVar.a() + 1);
                        } else {
                            tVar2 = (t<K, V>) tVar2.o(obj2 != null ? obj2.hashCode() : 0, obj2, A(h13), i22, fVar);
                        }
                    }
                } else {
                    int h14 = h(lowestOneBit2);
                    Object obj3 = this.f33941d[h14];
                    Object A12 = A(h14);
                    int h15 = tVar.h(lowestOneBit2);
                    Object obj4 = tVar.f33941d[h15];
                    tVar2 = (t<K, V>) m(obj3 != null ? obj3.hashCode() : 0, obj3, A12, obj4 != null ? obj4.hashCode() : 0, obj4, tVar.A(h15), i11 + 5, fVar.p());
                }
            }
            r11[length2] = tVar2;
            i21++;
            i15 ^= lowestOneBit2;
            i13 = i12;
            i14 = 0;
        }
        int i23 = 0;
        while (i18 != 0) {
            int lowestOneBit3 = Integer.lowestOneBit(i18);
            int i24 = i23 * 2;
            if (tVar.k(lowestOneBit3)) {
                int h16 = tVar.h(lowestOneBit3);
                Object[] objArr3 = tVar3.f33941d;
                objArr3[i24] = tVar.f33941d[h16];
                objArr3[i24 + 1] = tVar.A(h16);
                if (k(lowestOneBit3)) {
                    aVar.c(aVar.a() + 1);
                }
            } else {
                int h17 = h(lowestOneBit3);
                Object[] objArr4 = tVar3.f33941d;
                objArr4[i24] = this.f33941d[h17];
                objArr4[i24 + 1] = A(h17);
            }
            i23++;
            i18 ^= lowestOneBit3;
        }
        if (!f(tVar3)) {
            return tVar.f(tVar3) ? tVar : tVar3;
        }
        return this;
    }

    public final t<K, V> q(int i11, K k11, int i12, @NotNull f<K, V> fVar) {
        t<K, V> q11;
        int d11 = 1 << C2652m.d(i11, i12);
        if (k(d11)) {
            int h11 = h(d11);
            if (Intrinsics.d(k11, this.f33941d[h11])) {
                return s(h11, d11, fVar);
            }
        } else if (l(d11)) {
            int w11 = w(d11);
            t<K, V> v11 = v(w11);
            if (i12 == 30) {
                kotlin.ranges.e m11 = kotlin.ranges.h.m(kotlin.ranges.h.o(0, v11.f33941d.length), 2);
                int f71842a = m11.getF71842a();
                int f71843b = m11.getF71843b();
                int f71844c = m11.getF71844c();
                if ((f71844c > 0 && f71842a <= f71843b) || (f71844c < 0 && f71843b <= f71842a)) {
                    while (!Intrinsics.d(k11, v11.f33941d[f71842a])) {
                        if (f71842a != f71843b) {
                            f71842a += f71844c;
                        }
                    }
                    q11 = v11.n(f71842a, fVar);
                }
                q11 = v11;
                break;
            }
            q11 = v11.q(i11, k11, i12 + 5, fVar);
            return t(v11, q11, w11, d11, fVar.p());
        }
        return this;
    }

    public final t<K, V> r(int i11, K k11, V v11, int i12, @NotNull f<K, V> fVar) {
        t<K, V> tVar;
        t<K, V> r11;
        int d11 = 1 << C2652m.d(i11, i12);
        if (k(d11)) {
            int h11 = h(d11);
            if (Intrinsics.d(k11, this.f33941d[h11]) && Intrinsics.d(v11, A(h11))) {
                return s(h11, d11, fVar);
            }
        } else if (l(d11)) {
            int w11 = w(d11);
            t<K, V> v12 = v(w11);
            if (i12 == 30) {
                kotlin.ranges.e m11 = kotlin.ranges.h.m(kotlin.ranges.h.o(0, v12.f33941d.length), 2);
                int f71842a = m11.getF71842a();
                int f71843b = m11.getF71843b();
                int f71844c = m11.getF71844c();
                if ((f71844c > 0 && f71842a <= f71843b) || (f71844c < 0 && f71843b <= f71842a)) {
                    while (true) {
                        if (!Intrinsics.d(k11, v12.f33941d[f71842a]) || !Intrinsics.d(v11, v12.A(f71842a))) {
                            if (f71842a == f71843b) {
                                break;
                            }
                            f71842a += f71844c;
                        } else {
                            r11 = v12.n(f71842a, fVar);
                            break;
                        }
                    }
                    tVar = v12;
                }
                r11 = v12;
                tVar = v12;
            } else {
                tVar = v12;
                r11 = tVar.r(i11, k11, v11, i12 + 5, fVar);
            }
            return t(tVar, r11, w11, d11, fVar.p());
        }
        return this;
    }

    @NotNull
    public final t<K, V> v(int i11) {
        Object obj = this.f33941d[i11];
        Intrinsics.g(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (t) obj;
    }

    public final int w(int i11) {
        return (this.f33941d.length - 1) - Integer.bitCount((i11 - 1) & this.f33939b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d7, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e3, code lost:
    
        r14.c(z(r12, r4, r14.a()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ee, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e0, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a x(Object obj, int i11, int i12, Object obj2) {
        a x11;
        int d11 = 1 << C2652m.d(i11, i12);
        if (k(d11)) {
            int h11 = h(d11);
            if (!Intrinsics.d(obj, this.f33941d[h11])) {
                return new a(new t(this.f33938a ^ d11, this.f33939b | d11, b(h11, d11, i11, obj, obj2, i12, null), null), 1);
            }
            if (A(h11) != obj2) {
                Object[] objArr = this.f33941d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
                copyOf[h11 + 1] = obj2;
                return new a(new t(this.f33938a, this.f33939b, copyOf, null), 0);
            }
        } else {
            if (!l(d11)) {
                return new a(new t(this.f33938a | d11, this.f33939b, C2652m.a(this.f33941d, h(d11), obj, obj2), null), 1);
            }
            int w11 = w(d11);
            t<K, V> v11 = v(w11);
            if (i12 == 30) {
                kotlin.ranges.e m11 = kotlin.ranges.h.m(kotlin.ranges.h.o(0, v11.f33941d.length), 2);
                int f71842a = m11.getF71842a();
                int f71843b = m11.getF71843b();
                int f71844c = m11.getF71844c();
                if ((f71844c > 0 && f71842a <= f71843b) || (f71844c < 0 && f71843b <= f71842a)) {
                    while (!Intrinsics.d(obj, v11.f33941d[f71842a])) {
                        if (f71842a != f71843b) {
                            f71842a += f71844c;
                        }
                    }
                    if (obj2 == v11.A(f71842a)) {
                        x11 = null;
                    } else {
                        Object[] objArr2 = v11.f33941d;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, size)");
                        copyOf2[f71842a + 1] = obj2;
                        x11 = new a(new t(0, 0, copyOf2, null), 0);
                    }
                }
                x11 = new a(new t(0, 0, C2652m.a(v11.f33941d, 0, obj, obj2), null), 1);
                break;
            }
            x11 = v11.x(obj, i11, i12 + 5, obj2);
        }
        return null;
    }

    public final t y(int i11, int i12, Object obj) {
        t<K, V> y11;
        int d11 = 1 << C2652m.d(i11, i12);
        if (k(d11)) {
            int h11 = h(d11);
            if (Intrinsics.d(obj, this.f33941d[h11])) {
                Object[] objArr = this.f33941d;
                if (objArr.length != 2) {
                    return new t(this.f33938a ^ d11, this.f33939b, C2652m.b(h11, objArr), null);
                }
                return null;
            }
            return this;
        }
        if (l(d11)) {
            int w11 = w(d11);
            t<K, V> v11 = v(w11);
            if (i12 == 30) {
                kotlin.ranges.e m11 = kotlin.ranges.h.m(kotlin.ranges.h.o(0, v11.f33941d.length), 2);
                int f71842a = m11.getF71842a();
                int f71843b = m11.getF71843b();
                int f71844c = m11.getF71844c();
                if ((f71844c > 0 && f71842a <= f71843b) || (f71844c < 0 && f71843b <= f71842a)) {
                    while (!Intrinsics.d(obj, v11.f33941d[f71842a])) {
                        if (f71842a != f71843b) {
                            f71842a += f71844c;
                        }
                    }
                    Object[] objArr2 = v11.f33941d;
                    y11 = objArr2.length == 2 ? null : new t<>(0, 0, C2652m.b(f71842a, objArr2), null);
                }
                y11 = v11;
                break;
            }
            y11 = v11.y(i11, i12 + 5, obj);
            if (y11 == null) {
                Object[] objArr3 = this.f33941d;
                if (objArr3.length != 1) {
                    return new t(this.f33938a, d11 ^ this.f33939b, C2652m.c(w11, objArr3), null);
                }
                return null;
            }
            if (v11 != y11) {
                return z(w11, d11, y11);
            }
        }
        return this;
    }
}
