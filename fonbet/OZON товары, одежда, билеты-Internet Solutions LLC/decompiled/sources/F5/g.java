package F5;

import S0.A1;
import S0.C3991w0;
import S0.D1;
import S0.n1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import n0.C8374O;
import n0.EnumC8372M;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class g implements InterfaceC3043c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3991w0 f9026a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3991w0 f9027b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C3991w0 f9028c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C3991w0 f9029d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C3991w0 f9030e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C3991w0 f9031f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C3991w0 f9032g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final A1 f9033h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C3991w0 f9034i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final C3991w0 f9035j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final C3991w0 f9036k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final C3991w0 f9037l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final A1 f9038m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final A1 f9039n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final C8374O f9040o;

    static final class a extends AbstractC7737t implements Function0<Float> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            g gVar = g.this;
            float f7 = 0.0f;
            if (gVar.j() != null) {
                if (gVar.getSpeed() < 0.0f) {
                    o r11 = gVar.r();
                    if (r11 != null) {
                        f7 = r11.b();
                    }
                } else {
                    o r12 = gVar.r();
                    f7 = r12 != null ? r12.a() : 1.0f;
                }
            }
            return Float.valueOf(f7);
        }
    }

    static final class b extends AbstractC7737t implements Function0<Float> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            g gVar = g.this;
            return Float.valueOf((gVar.D() && gVar.p() % 2 == 0) ? -gVar.getSpeed() : gVar.getSpeed());
        }
    }

    static final class c extends AbstractC7737t implements Function0<Boolean> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            g gVar = g.this;
            return Boolean.valueOf(gVar.p() == gVar.C() && gVar.i() == g.b(gVar));
        }
    }

    public g() {
        C3991w0 f7;
        C3991w0 f11;
        C3991w0 f12;
        C3991w0 f13;
        C3991w0 f14;
        C3991w0 f15;
        C3991w0 f16;
        C3991w0 f17;
        C3991w0 f18;
        C3991w0 f19;
        C3991w0 f21;
        Boolean bool = Boolean.FALSE;
        f7 = n1.f(bool, D1.f25195a);
        this.f9026a = f7;
        f11 = n1.f(1, D1.f25195a);
        this.f9027b = f11;
        f12 = n1.f(1, D1.f25195a);
        this.f9028c = f12;
        f13 = n1.f(bool, D1.f25195a);
        this.f9029d = f13;
        f14 = n1.f(null, D1.f25195a);
        this.f9030e = f14;
        f15 = n1.f(Float.valueOf(1.0f), D1.f25195a);
        this.f9031f = f15;
        f16 = n1.f(bool, D1.f25195a);
        this.f9032g = f16;
        this.f9033h = n1.e(new b());
        f17 = n1.f(null, D1.f25195a);
        this.f9034i = f17;
        Float valueOf = Float.valueOf(0.0f);
        f18 = n1.f(valueOf, D1.f25195a);
        this.f9035j = f18;
        f19 = n1.f(valueOf, D1.f25195a);
        this.f9036k = f19;
        f21 = n1.f(Long.MIN_VALUE, D1.f25195a);
        this.f9037l = f21;
        this.f9038m = n1.e(new a());
        this.f9039n = n1.e(new c());
        this.f9040o = new C8374O();
    }

    public static final void A(g gVar) {
        gVar.f9032g.setValue(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void E(float f7) {
        B5.g j11;
        this.f9035j.setValue(Float.valueOf(f7));
        if (((Boolean) this.f9032g.getValue()).booleanValue() && (j11 = j()) != null) {
            f7 -= f7 % (1 / j11.i());
        }
        this.f9036k.setValue(Float.valueOf(f7));
    }

    public static final float b(g gVar) {
        return ((Number) gVar.f9038m.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean k(g gVar, int i11, long j11) {
        B5.g j12 = gVar.j();
        if (j12 == null) {
            return true;
        }
        C3991w0 c3991w0 = gVar.f9037l;
        long longValue = ((Number) c3991w0.getValue()).longValue() == Long.MIN_VALUE ? 0L : j11 - ((Number) c3991w0.getValue()).longValue();
        c3991w0.setValue(Long.valueOf(j11));
        o r11 = gVar.r();
        float b11 = r11 != null ? r11.b() : 0.0f;
        o r12 = gVar.r();
        float a11 = r12 != null ? r12.a() : 1.0f;
        float d11 = (longValue / 1000000) / j12.d();
        A1 a12 = gVar.f9033h;
        float floatValue = ((Number) a12.getValue()).floatValue() * d11;
        float floatValue2 = ((Number) a12.getValue()).floatValue();
        C3991w0 c3991w02 = gVar.f9035j;
        float floatValue3 = floatValue2 < 0.0f ? b11 - (((Number) c3991w02.getValue()).floatValue() + floatValue) : (((Number) c3991w02.getValue()).floatValue() + floatValue) - a11;
        if (floatValue3 < 0.0f) {
            gVar.E(kotlin.ranges.h.d(((Number) c3991w02.getValue()).floatValue(), b11, a11) + floatValue);
            return true;
        }
        float f7 = a11 - b11;
        int i12 = (int) (floatValue3 / f7);
        int i13 = i12 + 1;
        int p11 = gVar.p() + i13;
        C3991w0 c3991w03 = gVar.f9027b;
        if (p11 > i11) {
            gVar.E(((Number) gVar.f9038m.getValue()).floatValue());
            c3991w03.setValue(Integer.valueOf(i11));
            return false;
        }
        c3991w03.setValue(Integer.valueOf(gVar.p() + i13));
        float f11 = floatValue3 - (i12 * f7);
        gVar.E(((Number) a12.getValue()).floatValue() < 0.0f ? a11 - f11 : b11 + f11);
        return true;
    }

    public static final void m(g gVar) {
        gVar.f9030e.setValue(null);
    }

    public static final void o(g gVar, B5.g gVar2) {
        gVar.f9034i.setValue(gVar2);
    }

    public static final void s(g gVar, int i11) {
        gVar.f9027b.setValue(Integer.valueOf(i11));
    }

    public static final void v(g gVar) {
        gVar.f9028c.setValue(1);
    }

    public static final void w(g gVar) {
        gVar.f9037l.setValue(Long.MIN_VALUE);
    }

    public static final void x(g gVar, boolean z11) {
        gVar.f9026a.setValue(Boolean.valueOf(z11));
    }

    public static final void y(g gVar) {
        gVar.f9029d.setValue(Boolean.FALSE);
    }

    public static final void z(g gVar, float f7) {
        gVar.f9031f.setValue(Float.valueOf(f7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int C() {
        return ((Number) this.f9028c.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean D() {
        return ((Boolean) this.f9029d.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // F5.m
    public final float getSpeed() {
        return ((Number) this.f9031f.getValue()).floatValue();
    }

    @Override // S0.A1
    public final Float getValue() {
        return Float.valueOf(i());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // F5.m
    public final float i() {
        return ((Number) this.f9036k.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // F5.m
    public final B5.g j() {
        return (B5.g) this.f9034i.getValue();
    }

    @Override // F5.InterfaceC3043c
    public final Object l(B5.g gVar, int i11, float f7, float f11, @NotNull n nVar, @NotNull kotlin.coroutines.d dVar) {
        Object d11 = this.f9040o.d(EnumC8372M.Default, new C3044d(this, i11, f7, gVar, f11, nVar, null), (kotlin.coroutines.jvm.internal.c) dVar);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // F5.m
    public final int p() {
        return ((Number) this.f9027b.getValue()).intValue();
    }

    @Override // F5.InterfaceC3043c
    public final Object q(B5.g gVar, float f7, boolean z11, @NotNull kotlin.coroutines.d dVar) {
        Object d11 = this.f9040o.d(EnumC8372M.Default, new h(this, gVar, f7, z11, null), (kotlin.coroutines.jvm.internal.c) dVar);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // F5.m
    public final o r() {
        return (o) this.f9030e.getValue();
    }
}
