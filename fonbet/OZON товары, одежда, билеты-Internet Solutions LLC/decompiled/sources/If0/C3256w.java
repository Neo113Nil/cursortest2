package If0;

import Bl0.C2652m;
import If0.J;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: If0.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3256w extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ J.a f12476b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f12477c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function1<I, Unit> f12478d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f12479e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C3256w(J.a aVar, boolean z11, Function1<? super I, Unit> function1, int i11) {
        super(2);
        this.f12476b = aVar;
        this.f12477c = z11;
        this.f12478d = function1;
        this.f12479e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f12479e | 1);
        boolean z11 = this.f12477c;
        Function1<I, Unit> function1 = this.f12478d;
        C3250p.i(this.f12476b, z11, function1, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
