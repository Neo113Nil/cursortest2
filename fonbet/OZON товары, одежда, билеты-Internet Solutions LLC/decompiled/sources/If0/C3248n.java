package If0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: If0.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3248n extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ J f12449b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<I, Unit> f12450c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f12451d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C3248n(J j11, Function1<? super I, Unit> function1, int i11) {
        super(2);
        this.f12449b = j11;
        this.f12450c = function1;
        this.f12451d = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f12451d | 1);
        C3250p.e(this.f12449b, this.f12450c, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
