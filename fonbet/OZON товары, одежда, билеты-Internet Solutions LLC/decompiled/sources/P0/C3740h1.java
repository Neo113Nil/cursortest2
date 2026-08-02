package P0;

import S0.InterfaceC3967k;
import a1.C4912a;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import u0.C9915y;
import u0.InterfaceC9914x;

/* renamed from: P0.h1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3740h1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u0.J f21063b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ B1.z0 f21064c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ArrayList f21065d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f21066e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ArrayList f21067f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Integer f21068g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C4912a f21069h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3740h1(u0.J j11, B1.z0 z0Var, ArrayList arrayList, int i11, ArrayList arrayList2, Integer num, C4912a c4912a) {
        super(2);
        this.f21063b = j11;
        this.f21064c = z0Var;
        this.f21065d = arrayList;
        this.f21066e = i11;
        this.f21067f = arrayList2;
        this.f21068g = num;
        this.f21069h = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        Integer num2;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            u0.J j11 = this.f21063b;
            B1.z0 z0Var = this.f21064c;
            InterfaceC9914x c11 = u0.N.c(j11, z0Var);
            this.f21069h.invoke(new C9915y(androidx.compose.foundation.layout.T.d(c11, z0Var.getLayoutDirection()), this.f21065d.isEmpty() ? c11.d() : z0Var.B(this.f21066e), androidx.compose.foundation.layout.T.c(c11, z0Var.getLayoutDirection()), (this.f21067f.isEmpty() || (num2 = this.f21068g) == null) ? c11.a() : z0Var.B(num2.intValue())), interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
