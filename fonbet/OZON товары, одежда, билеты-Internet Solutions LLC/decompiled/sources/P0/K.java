package P0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class K extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3756n f20664b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C3761o1 f20665c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ u2 f20666d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C4912a f20667e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    K(C3756n c3756n, C3761o1 c3761o1, u2 u2Var, C4912a c4912a, int i11) {
        super(2);
        this.f20664b = c3756n;
        this.f20665c = c3761o1;
        this.f20666d = u2Var;
        this.f20667e = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(3073);
        C4912a c4912a = this.f20667e;
        I.a(this.f20664b, this.f20665c, this.f20666d, c4912a, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
