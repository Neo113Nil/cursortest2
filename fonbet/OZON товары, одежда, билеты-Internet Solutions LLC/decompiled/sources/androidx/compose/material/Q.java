package androidx.compose.material;

import J0.O1;
import S0.B1;
import S0.InterfaceC3967k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7807Z;
import n0.InterfaceC8367H;
import n0.InterfaceC8369J;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final B1 f39934a = new B1(b.f39942b);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final S0.O f39935b = new S0.O(a.f39941b);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final S f39936c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final S f39937d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final O0.i f39938e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final O0.i f39939f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final O0.i f39940g;

    static final class a extends AbstractC7737t implements Function0<O1> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f39941b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final O1 invoke() {
            return new O1();
        }
    }

    static final class b extends AbstractC7737t implements Function0<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f39942b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    static {
        long j11;
        long j12;
        j11 = C7807Z.f72259m;
        f39936c = new S(true, Float.NaN, j11);
        j12 = C7807Z.f72259m;
        f39937d = new S(false, Float.NaN, j12);
        f39938e = new O0.i(0.16f, 0.24f, 0.08f, 0.24f);
        f39939f = new O0.i(0.08f, 0.12f, 0.04f, 0.12f);
        f39940g = new O0.i(0.08f, 0.12f, 0.04f, 0.1f);
    }

    @NotNull
    public static final S0.O d() {
        return f39935b;
    }

    @NotNull
    public static final InterfaceC8369J e(boolean z11, float f7, long j11) {
        long j12;
        if (Z1.h.b(f7, Float.NaN)) {
            j12 = C7807Z.f72259m;
            if (C7807Z.p(j11, j12)) {
                return z11 ? f39936c : f39937d;
            }
        }
        return new S(z11, f7, j11);
    }

    public static InterfaceC8369J f(int i11, long j11) {
        if ((i11 & 4) != 0) {
            j11 = C7807Z.f72259m;
        }
        return e(true, Float.NaN, j11);
    }

    @NotNull
    public static final InterfaceC8367H g(boolean z11, float f7, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        long j11;
        if ((i12 & 1) != 0) {
            z11 = true;
        }
        boolean z12 = z11;
        if ((i12 & 2) != 0) {
            f7 = Float.NaN;
        }
        float f11 = f7;
        j11 = C7807Z.f72259m;
        if (!((Boolean) interfaceC3967k.m(f39934a)).booleanValue()) {
            interfaceC3967k.o(96503175);
            interfaceC3967k.k();
            return e(z12, f11, j11);
        }
        interfaceC3967k.o(96412190);
        O0.f c11 = O0.s.c(z12, f11, j11, interfaceC3967k, i11 & 1022);
        interfaceC3967k.k();
        return c11;
    }
}
