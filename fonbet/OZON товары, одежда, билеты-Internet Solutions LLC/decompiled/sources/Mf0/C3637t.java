package Mf0;

import J0.u3;
import Mf0.N;
import N3.C3660k;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.a0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Mf0.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3637t extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ N f18055b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3637t(N n11) {
        super(2);
        this.f18055b = n11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        String str;
        P1.F f7;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            N.a d11 = this.f18055b.d();
            if (d11 instanceof N.a.C0349a) {
                N.a.C0349a c0349a = (N.a.C0349a) d11;
                if (c0349a.g()) {
                    String b11 = c0349a.b();
                    String f11 = c0349a.f();
                    String a11 = c0349a.a();
                    String d12 = c0349a.d();
                    String e11 = c0349a.e();
                    String c11 = c0349a.c();
                    StringBuilder d13 = C3660k.d("\nsuccess\n\nresponseCode = ", b11, "\n\nresponseProtocol = ", f11, "\n\ncipherSuite = ");
                    Nh.a.h(d13, a11, "\n\nrequest headers = ", d12, "\n\nresponse headers = ");
                    d13.append(e11);
                    d13.append("\n\n");
                    d13.append(c11);
                    d13.append("\n        ");
                    str = kotlin.text.h.E0(d13.toString());
                } else {
                    str = Nk.a.b("fail\nerrorMessage = ", c0349a.b());
                }
            } else if (Intrinsics.d(d11, N.a.b.f17978a)) {
                str = "idle";
            } else {
                if (!Intrinsics.d(d11, N.a.c.f17979a)) {
                    throw new Sc.o();
                }
                str = "in progress";
            }
            f7 = P1.F.f21512j;
            u3.b(str, androidx.compose.foundation.layout.T.h(a0.e(androidx.compose.ui.e.f40358c0, 1.0f), 16, 0.0f, 2), 0L, 0L, f7, 0L, null, 0L, 0, false, 0, 0, null, null, interfaceC3967k2, 196656, 0, 131036);
        }
        return Unit.f71690a;
    }
}
