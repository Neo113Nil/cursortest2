package J0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: J0.t0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3344t0 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f13403b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<Boolean, Unit> f13404c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f13405d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C4912a f13406e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3344t0(boolean z11, Function1 function1, androidx.compose.ui.e eVar, C4912a c4912a, int i11) {
        super(2);
        this.f13403b = z11;
        this.f13404c = function1;
        this.f13405d = eVar;
        this.f13406e = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(3121);
        C4912a c4912a = this.f13406e;
        C3364y0.a(this.f13403b, this.f13404c, this.f13405d, c4912a, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
