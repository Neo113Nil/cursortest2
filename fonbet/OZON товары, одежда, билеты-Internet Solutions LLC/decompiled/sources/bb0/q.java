package bb0;

import S0.InterfaceC3967k;
import eb0.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.ozi.components.island.OziIslandKt;

/* loaded from: classes3.dex */
final class q extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ eb0.f f55826b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ f.a f55827c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f55828d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f55829e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(eb0.f fVar, f.a aVar, Function0<Unit> function0, Function0<Unit> function02) {
        super(2);
        this.f55826b = fVar;
        this.f55827c = aVar;
        this.f55828d = function0;
        this.f55829e = function02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            OziIslandKt.m3103OziIslandgNPyAyM(null, false, null, null, 0.0f, null, null, null, a1.c.c(-1175112496, new p(this.f55826b, this.f55827c, this.f55828d, this.f55829e), interfaceC3967k2), interfaceC3967k2, 100663296, 255);
        }
        return Unit.f71690a;
    }
}
