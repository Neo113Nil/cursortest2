package B0;

import S0.C3985t0;
import S0.C3991w0;
import b1.C5499b;
import b1.C5517t;
import b1.InterfaceC5518u;
import java.util.List;
import k1.C7460f;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;

/* loaded from: classes.dex */
public final class M1 {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final C5517t f1439f = C5499b.a(a.f1445b, b.f1446b);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3985t0 f1440a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3985t0 f1441b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private C7460f f1442c;

    /* renamed from: d, reason: collision with root package name */
    private long f1443d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C3991w0 f1444e;

    static final class a extends AbstractC7737t implements Function2<InterfaceC5518u, M1, List<? extends Object>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f1445b = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final List<? extends Object> invoke(InterfaceC5518u interfaceC5518u, M1 m12) {
            M1 m13 = m12;
            return C7714v.b0(Float.valueOf(m13.c()), Boolean.valueOf(m13.e() == EnumC9142v.Vertical));
        }
    }

    static final class b extends AbstractC7737t implements Function1<List<? extends Object>, M1> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f1446b = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final M1 invoke(List<? extends Object> list) {
            List<? extends Object> list2 = list;
            Object obj = list2.get(1);
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Boolean");
            EnumC9142v enumC9142v = ((Boolean) obj).booleanValue() ? EnumC9142v.Vertical : EnumC9142v.Horizontal;
            Object obj2 = list2.get(0);
            Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new M1(enumC9142v, ((Float) obj2).floatValue());
        }
    }

    public M1(@NotNull EnumC9142v enumC9142v, float f7) {
        C7460f c7460f;
        long j11;
        this.f1440a = S0.C0.a(f7);
        this.f1441b = S0.C0.a(0.0f);
        c7460f = C7460f.f70279e;
        this.f1442c = c7460f;
        j11 = K1.Q.f15009b;
        this.f1443d = j11;
        this.f1444e = S0.n1.f(enumC9142v, S0.n1.n());
    }

    public final float b() {
        return this.f1441b.getFloatValue();
    }

    public final float c() {
        return this.f1440a.getFloatValue();
    }

    public final int d(long j11) {
        int i11 = K1.Q.f15010c;
        int i12 = (int) (j11 >> 32);
        long j12 = this.f1443d;
        if (i12 != ((int) (j12 >> 32))) {
            return i12;
        }
        int i13 = (int) (j11 & 4294967295L);
        return i13 != ((int) (4294967295L & j12)) ? i13 : K1.Q.h(j11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final EnumC9142v e() {
        return (EnumC9142v) this.f1444e.getValue();
    }

    public final void f(float f7) {
        this.f1440a.h(f7);
    }

    public final void g(long j11) {
        this.f1443d = j11;
    }

    public final void h(@NotNull EnumC9142v enumC9142v, @NotNull C7460f c7460f, int i11, int i12) {
        float f7 = i12 - i11;
        this.f1441b.h(f7);
        float n11 = c7460f.n();
        float n12 = this.f1442c.n();
        C3985t0 c3985t0 = this.f1440a;
        if (n11 != n12 || c7460f.q() != this.f1442c.q()) {
            boolean z11 = enumC9142v == EnumC9142v.Vertical;
            float q11 = z11 ? c7460f.q() : c7460f.n();
            float h11 = z11 ? c7460f.h() : c7460f.o();
            float floatValue = c3985t0.getFloatValue();
            float f11 = i11;
            float f12 = floatValue + f11;
            f(c3985t0.getFloatValue() + ((h11 <= f12 && (q11 >= floatValue || h11 - q11 <= f11)) ? (q11 >= floatValue || h11 - q11 > f11) ? 0.0f : q11 - floatValue : h11 - f12));
            this.f1442c = c7460f;
        }
        f(kotlin.ranges.h.d(c3985t0.getFloatValue(), 0.0f, f7));
    }

    public /* synthetic */ M1(EnumC9142v enumC9142v) {
        this(enumC9142v, 0.0f);
    }

    public M1() {
        this(EnumC9142v.Vertical);
    }
}
