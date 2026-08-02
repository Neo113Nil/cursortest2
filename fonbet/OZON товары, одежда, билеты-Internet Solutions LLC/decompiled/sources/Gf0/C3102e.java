package Gf0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: Gf0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3102e extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ D f10167b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<C, Unit> f10168c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f10169d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C3102e(D d11, Function1<? super C, Unit> function1, int i11) {
        super(2);
        this.f10167b = d11;
        this.f10168c = function1;
        this.f10169d = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f10169d | 1);
        C3105h.e(this.f10167b, this.f10168c, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
