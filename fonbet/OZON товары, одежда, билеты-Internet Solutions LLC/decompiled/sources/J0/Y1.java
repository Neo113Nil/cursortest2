package J0;

import S0.InterfaceC3967k;
import a1.C4912a;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import u0.C9915y;
import u0.InterfaceC9914x;

/* loaded from: classes8.dex */
final class Y1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u0.J f13087b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ B1.z0 f13088c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ArrayList f13089d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ArrayList f13090e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Integer f13091f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C4912a f13092g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Y1(u0.J j11, B1.z0 z0Var, ArrayList arrayList, ArrayList arrayList2, Integer num, C4912a c4912a) {
        super(2);
        this.f13087b = j11;
        this.f13088c = z0Var;
        this.f13089d = arrayList;
        this.f13090e = arrayList2;
        this.f13091f = num;
        this.f13092g = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        Integer num2;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            u0.J j11 = this.f13087b;
            B1.z0 z0Var = this.f13088c;
            InterfaceC9914x c11 = u0.N.c(j11, z0Var);
            this.f13092g.invoke(new C9915y(androidx.compose.foundation.layout.T.d(c11, z0Var.getLayoutDirection()), this.f13089d.isEmpty() ? c11.d() : 0, androidx.compose.foundation.layout.T.c(c11, z0Var.getLayoutDirection()), (this.f13090e.isEmpty() || (num2 = this.f13091f) == null) ? c11.a() : z0Var.B(num2.intValue())), interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
