package P0;

import B0.C2454a;
import D1.InterfaceC2801g;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.ui.platform.C5236c1;
import e1.InterfaceC6250b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m0.C7980b;
import m0.C8008p;
import m3.C8060b;

/* loaded from: classes8.dex */
final class Y extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f20908b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f20909c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3787x1 f20910d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C7980b<Float, C8008p> f20911e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ xe.M f20912f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Function1<Float, Unit> f20913g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f20914h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ float f20915i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ l1.J0 f20916j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ long f20917k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ long f20918l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ float f20919m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ C4912a f20920n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ Function2<InterfaceC3967k, Integer, u0.J> f20921o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ C4912a f20922p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Y(long j11, Function0 function0, C3787x1 c3787x1, C7980b c7980b, xe.M m11, Function1 function1, androidx.compose.ui.e eVar, float f7, l1.J0 j02, long j12, long j13, float f11, C4912a c4912a, Function2 function2, C4912a c4912a2) {
        super(2);
        this.f20908b = j11;
        this.f20909c = function0;
        this.f20910d = c3787x1;
        this.f20911e = c7980b;
        this.f20912f = m11;
        this.f20913g = function1;
        this.f20914h = eVar;
        this.f20915i = f7;
        this.f20916j = j02;
        this.f20917k = j12;
        this.f20918l = j13;
        this.f20919m = f11;
        this.f20920n = c4912a;
        this.f20921o = function2;
        this.f20922p = c4912a2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            androidx.compose.ui.e c11 = I1.o.c(androidx.compose.ui.c.b(androidx.compose.foundation.layout.a0.d(androidx.compose.ui.e.f40358c0), C5236c1.a(), new u0.P(3)), false, X.f20886b);
            B1.V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = interfaceC3967k2.I();
            S0.A0 d11 = interfaceC3967k2.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(interfaceC3967k2, c11);
            InterfaceC2801g.f5440U.getClass();
            Function0 a11 = InterfaceC2801g.a.a();
            if (interfaceC3967k2.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k2.i();
            if (interfaceC3967k2.t()) {
                interfaceC3967k2.H(a11);
            } else {
                interfaceC3967k2.e();
            }
            Function2 d12 = C2454a.d(interfaceC3967k2, f7, interfaceC3967k2, d11);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                Nk.a.d(d12, I11, interfaceC3967k2, I11);
            }
            S0.F1.b(interfaceC3967k2, f11, InterfaceC2801g.a.f());
            C3787x1 c3787x1 = this.f20910d;
            boolean z11 = c3787x1.h() != EnumC3790y1.Hidden;
            long j11 = this.f20908b;
            Function0<Unit> function0 = this.f20909c;
            B0.c(j11, function0, z11, interfaceC3967k2, 0);
            B0.b(this.f20911e, this.f20912f, function0, this.f20913g, this.f20914h, c3787x1, this.f20915i, this.f20916j, this.f20917k, this.f20918l, this.f20919m, this.f20920n, this.f20921o, this.f20922p, interfaceC3967k2, 70);
            interfaceC3967k2.f();
        }
        return Unit.f71690a;
    }
}
