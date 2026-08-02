package Q0;

import B0.C2454a;
import B1.V;
import D1.InterfaceC2801g;
import P0.W0;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import a1.C4912a;
import androidx.compose.foundation.layout.C5185h;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e1.InterfaceC6250b;
import k1.C7464j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import u0.C9915y;

/* loaded from: classes8.dex */
final class m extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<C7464j> f22767b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C9915y f22768c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4912a f22769d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(InterfaceC3978p0 interfaceC3978p0, C9915y c9915y, C4912a c4912a) {
        super(2);
        this.f22767b = interfaceC3978p0;
        this.f22768c = c9915y;
        this.f22769d = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            androidx.compose.ui.e h11 = W0.h(androidx.compose.ui.layout.a.b(androidx.compose.ui.e.f40358c0, "Container"), new l(this.f22767b, InterfaceC3978p0.class, AppMeasurementSdk.ConditionalUserProperty.VALUE, "getValue()Ljava/lang/Object;", 0), this.f22768c);
            V f7 = C5185h.f(InterfaceC6250b.a.o(), true);
            int I11 = interfaceC3967k2.I();
            A0 d11 = interfaceC3967k2.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(interfaceC3967k2, h11);
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
            F1.b(interfaceC3967k2, f11, InterfaceC2801g.a.f());
            this.f22769d.invoke(interfaceC3967k2, 0);
            interfaceC3967k2.f();
        }
        return Unit.f71690a;
    }
}
