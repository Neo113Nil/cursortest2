package S0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class J0 implements I0 {

    /* renamed from: a, reason: collision with root package name */
    private int f25228a;

    /* renamed from: b, reason: collision with root package name */
    private K0 f25229b;

    /* renamed from: c, reason: collision with root package name */
    private C3945c f25230c;

    /* renamed from: d, reason: collision with root package name */
    private Function2<? super InterfaceC3967k, ? super Integer, Unit> f25231d;

    /* renamed from: e, reason: collision with root package name */
    private int f25232e;

    /* renamed from: f, reason: collision with root package name */
    private androidx.collection.I<Object> f25233f;

    /* renamed from: g, reason: collision with root package name */
    private androidx.collection.L<J<?>, Object> f25234g;

    static final class a extends AbstractC7737t implements Function1<InterfaceC3982s, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f25236c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.collection.I<Object> f25237d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11, androidx.collection.I<Object> i12) {
            super(1);
            this.f25236c = i11;
            this.f25237d = i12;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InterfaceC3982s interfaceC3982s) {
            int i11;
            InterfaceC3982s interfaceC3982s2 = interfaceC3982s;
            J0 j02 = J0.this;
            int i12 = j02.f25232e;
            int i13 = this.f25236c;
            if (i12 == i13) {
                androidx.collection.I i14 = j02.f25233f;
                androidx.collection.I<Object> i15 = this.f25237d;
                if (Intrinsics.d(i15, i14) && (interfaceC3982s2 instanceof C3988v)) {
                    long[] jArr = i15.f38639a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i16 = 0;
                        while (true) {
                            long j11 = jArr[i16];
                            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i17 = 8;
                                int i18 = 8 - ((~(i16 - length)) >>> 31);
                                int i19 = 0;
                                while (i19 < i18) {
                                    if ((255 & j11) < 128) {
                                        int i21 = (i16 << 3) + i19;
                                        Object obj = i15.f38640b[i21];
                                        boolean z11 = i15.f38641c[i21] != i13;
                                        i11 = i17;
                                        if (z11) {
                                            C3988v c3988v = (C3988v) interfaceC3982s2;
                                            c3988v.F(j02, obj);
                                            if (obj instanceof J) {
                                                c3988v.E((J) obj);
                                                androidx.collection.L l11 = j02.f25234g;
                                                if (l11 != null) {
                                                    l11.g(obj);
                                                }
                                            }
                                        }
                                        if (z11) {
                                            i15.g(i21);
                                        }
                                    } else {
                                        i11 = i17;
                                    }
                                    j11 >>= i11;
                                    i19++;
                                    i17 = i11;
                                }
                                if (i18 != i17) {
                                    break;
                                }
                            }
                            if (i16 == length) {
                                break;
                            }
                            i16++;
                        }
                    }
                }
            }
            return Unit.f71690a;
        }
    }

    public J0(C3988v c3988v) {
        this.f25229b = c3988v;
    }

    private final void D(boolean z11) {
        if (z11) {
            this.f25228a |= 32;
        } else {
            this.f25228a &= -33;
        }
    }

    private static boolean e(J j11, androidx.collection.L l11) {
        Intrinsics.g(j11, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        l1 a11 = j11.a();
        if (a11 == null) {
            a11 = D1.f25195a;
        }
        return !a11.a(j11.u().h(), l11.b(j11));
    }

    public final void A(boolean z11) {
        if (z11) {
            this.f25228a |= 4;
        } else {
            this.f25228a &= -5;
        }
    }

    public final void B() {
        this.f25228a &= -65;
    }

    public final void C(boolean z11) {
        if (z11) {
            this.f25228a |= 8;
        } else {
            this.f25228a &= -9;
        }
    }

    public final void E() {
        this.f25228a |= 1;
    }

    public final void F(int i11) {
        this.f25232e = i11;
        this.f25228a &= -17;
    }

    public final void G(@NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> function2) {
        this.f25231d = function2;
    }

    public final void d(@NotNull K0 k02) {
        this.f25229b = k02;
    }

    public final void f(@NotNull C3969l c3969l) {
        Unit unit;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function2 = this.f25231d;
        if (function2 != null) {
            function2.invoke(c3969l, 1);
            unit = Unit.f71690a;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalStateException("Invalid restart scope");
        }
    }

    public final Function1<InterfaceC3982s, Unit> g(int i11) {
        androidx.collection.I<Object> i12 = this.f25233f;
        if (i12 == null || n()) {
            return null;
        }
        Object[] objArr = i12.f38640b;
        int[] iArr = i12.f38641c;
        long[] jArr = i12.f38639a;
        int length = jArr.length - 2;
        if (length < 0) {
            return null;
        }
        int i13 = 0;
        while (true) {
            long j11 = jArr[i13];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((255 & j11) < 128) {
                        int i16 = (i13 << 3) + i15;
                        Object obj = objArr[i16];
                        if (iArr[i16] != i11) {
                            return new a(i11, i12);
                        }
                    }
                    j11 >>= 8;
                }
                if (i14 != 8) {
                    return null;
                }
            }
            if (i13 == length) {
                return null;
            }
            i13++;
        }
    }

    public final C3945c h() {
        return this.f25230c;
    }

    public final boolean i() {
        return this.f25231d != null;
    }

    @Override // S0.I0
    public final void invalidate() {
        K0 k02 = this.f25229b;
        if (k02 != null) {
            k02.f(this, null);
        }
    }

    public final boolean j() {
        return (this.f25228a & 2) != 0;
    }

    public final boolean k() {
        return (this.f25228a & 4) != 0;
    }

    public final boolean l() {
        return (this.f25228a & 64) != 0;
    }

    public final boolean m() {
        return (this.f25228a & 8) != 0;
    }

    public final boolean n() {
        return (this.f25228a & 16) != 0;
    }

    public final boolean o() {
        return (this.f25228a & 1) != 0;
    }

    public final boolean p() {
        if (this.f25229b != null) {
            C3945c c3945c = this.f25230c;
            if (c3945c != null ? c3945c.b() : false) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final Y q(Object obj) {
        Y f7;
        K0 k02 = this.f25229b;
        return (k02 == null || (f7 = k02.f(this, obj)) == null) ? Y.IGNORED : f7;
    }

    public final boolean r() {
        return this.f25234g != null;
    }

    public final boolean s(Object obj) {
        androidx.collection.L<J<?>, Object> l11;
        if (obj == null || (l11 = this.f25234g) == null) {
            return true;
        }
        if (obj instanceof J) {
            return e((J) obj, l11);
        }
        if (!(obj instanceof androidx.collection.X)) {
            return true;
        }
        androidx.collection.X x11 = (androidx.collection.X) obj;
        if (x11.c()) {
            Object[] objArr = x11.f38663b;
            long[] jArr = x11.f38662a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j11 = jArr[i11];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((255 & j11) < 128) {
                                Object obj2 = objArr[(i11 << 3) + i13];
                                if (!(obj2 instanceof J) || e((J) obj2, l11)) {
                                    return true;
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i12 != 8) {
                            break;
                        }
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return false;
    }

    public final void t(@NotNull J<?> j11, Object obj) {
        androidx.collection.L<J<?>, Object> l11 = this.f25234g;
        if (l11 == null) {
            l11 = new androidx.collection.L<>((Object) null);
            this.f25234g = l11;
        }
        l11.i(j11, obj);
    }

    public final boolean u(@NotNull Object obj) {
        if ((this.f25228a & 32) != 0) {
            return false;
        }
        androidx.collection.I<Object> i11 = this.f25233f;
        if (i11 == null) {
            i11 = new androidx.collection.I<>((Object) null);
            this.f25233f = i11;
        }
        return i11.f(this.f25232e, obj) == this.f25232e;
    }

    public final void v() {
        K0 k02 = this.f25229b;
        if (k02 != null) {
            k02.g();
        }
        this.f25229b = null;
        this.f25233f = null;
        this.f25234g = null;
    }

    public final void w() {
        androidx.collection.I<Object> i11;
        K0 k02 = this.f25229b;
        if (k02 == null || (i11 = this.f25233f) == null) {
            return;
        }
        D(true);
        try {
            Object[] objArr = i11.f38640b;
            int[] iArr = i11.f38641c;
            long[] jArr = i11.f38639a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i12 = 0;
                while (true) {
                    long j11 = jArr[i12];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                        for (int i14 = 0; i14 < i13; i14++) {
                            if ((255 & j11) < 128) {
                                int i15 = (i12 << 3) + i14;
                                Object obj = objArr[i15];
                                int i16 = iArr[i15];
                                k02.a(obj);
                            }
                            j11 >>= 8;
                        }
                        if (i13 != 8) {
                            break;
                        }
                    }
                    if (i12 == length) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
        } finally {
            D(false);
        }
    }

    public final void x() {
        this.f25228a |= 16;
    }

    public final void y(C3945c c3945c) {
        this.f25230c = c3945c;
    }

    public final void z() {
        this.f25228a |= 2;
    }
}
