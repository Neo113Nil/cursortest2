package J20;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import S20.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class A extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a.i.C0510a f13687b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f13688c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f13689d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f13690e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A(a.i.C0510a c0510a, boolean z11, androidx.compose.ui.e eVar, Function0 function0, int i11) {
        super(2);
        this.f13687b = c0510a;
        this.f13688c = z11;
        this.f13689d = eVar;
        this.f13690e = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(1);
        D.a(this.f13687b, this.f13688c, this.f13689d, this.f13690e, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
