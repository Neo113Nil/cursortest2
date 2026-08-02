package If0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: If0.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3252s extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ J f12468b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<I, Unit> f12469c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f12470d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C3252s(J j11, Function1<? super I, Unit> function1, int i11) {
        super(2);
        this.f12468b = j11;
        this.f12469c = function1;
        this.f12470d = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f12470d | 1);
        C3250p.h(this.f12468b, this.f12469c, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
