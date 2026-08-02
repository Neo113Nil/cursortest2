package J0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: J0.j0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3305j0 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3309k0 f13246b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f13247c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f13248d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3305j0(C3309k0 c3309k0, boolean z11, Function0 function0, int i11) {
        super(2);
        this.f13246b = c3309k0;
        this.f13247c = z11;
        this.f13248d = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(1);
        Function0<Unit> function0 = this.f13248d;
        this.f13246b.a(this.f13247c, function0, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
