package I0;

import D1.InterfaceC2801g;
import S0.F1;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;

/* renamed from: I0.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3179e extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f11483b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f11484c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f11485d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC3214w f11486e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3179e(long j11, boolean z11, androidx.compose.ui.e eVar, InterfaceC3214w interfaceC3214w) {
        super(2);
        this.f11483b = j11;
        this.f11484c = z11;
        this.f11485d = eVar;
        this.f11486e = interfaceC3214w;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            long j11 = this.f11483b;
            InterfaceC3214w interfaceC3214w = this.f11486e;
            boolean z11 = this.f11484c;
            if (j11 != 9205357640488583168L) {
                interfaceC3967k2.o(-837727128);
                C5179b.e b11 = z11 ? C5179b.a.b() : C5179b.a.a();
                androidx.compose.ui.e l11 = androidx.compose.foundation.layout.a0.l(this.f11485d, Z1.j.c(j11), Z1.j.b(j11), 0.0f, 0.0f, 12);
                androidx.compose.foundation.layout.Y b12 = androidx.compose.foundation.layout.X.b(b11, InterfaceC6250b.a.l(), interfaceC3967k2, 0);
                int I11 = interfaceC3967k2.I();
                S0.A0 d11 = interfaceC3967k2.d();
                androidx.compose.ui.e f7 = androidx.compose.ui.c.f(interfaceC3967k2, l11);
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
                Function2 f11 = C3173b.f(interfaceC3967k2, b12, interfaceC3967k2, d11);
                if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                    Nk.a.d(f11, I11, interfaceC3967k2, I11);
                }
                F1.b(interfaceC3967k2, f7, InterfaceC2801g.a.f());
                e.a aVar = androidx.compose.ui.e.f40358c0;
                boolean F11 = interfaceC3967k2.F(interfaceC3214w);
                Object C11 = interfaceC3967k2.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new C3175c(interfaceC3214w);
                    interfaceC3967k2.x(C11);
                }
                C3181f.c(z11, aVar, (Function0) C11, interfaceC3967k2, 6);
                interfaceC3967k2.f();
                interfaceC3967k2.k();
            } else {
                interfaceC3967k2.o(-836867312);
                boolean F12 = interfaceC3967k2.F(interfaceC3214w);
                Object C12 = interfaceC3967k2.C();
                if (F12 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new C3177d(interfaceC3214w);
                    interfaceC3967k2.x(C12);
                }
                C3181f.c(z11, this.f11485d, (Function0) C12, interfaceC3967k2, 0);
                interfaceC3967k2.k();
            }
        }
        return Unit.f71690a;
    }
}
