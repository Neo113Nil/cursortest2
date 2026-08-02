package Ve;

import fd.InterfaceC6512o;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.api.SPaymentTool;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* loaded from: classes10.dex */
public final class Q7 extends kotlin.coroutines.jvm.internal.j implements InterfaceC6512o {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Fh f29759d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ int f29760e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ PayStrategy f29761f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C4248fl f29762g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q7(C4248fl c4248fl, kotlin.coroutines.d dVar) {
        super(4, dVar);
        this.f29762g = c4248fl;
    }

    @Override // fd.InterfaceC6512o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj2).intValue();
        Q7 q72 = new Q7(this.f29762g, (kotlin.coroutines.d) obj4);
        q72.f29759d = (Fh) obj;
        q72.f29760e = intValue;
        q72.f29761f = (PayStrategy) obj3;
        return q72.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        Fh fh2 = this.f29759d;
        int i11 = this.f29760e;
        PayStrategy payStrategy = this.f29761f;
        boolean d11 = Intrinsics.d(payStrategy, PayStrategy.PayWithBonuses.INSTANCE);
        C4248fl c4248fl = this.f29762g;
        if (!d11 || !Lf.a.u0(c4248fl, Qk.f29796d)) {
            if (payStrategy.getToolType() != SPaymentTool.PAYMENT_ACCOUNTS) {
                if (Lf.a.r0(c4248fl, EnumC4290h5.S_BONUSES, null)) {
                    ListOfCardsResponseBody.PaymentToolInfo.Tool tool = fh2.f29005b;
                    i11 = M1.b.o(tool != null ? tool.getPrecalculateBonuses() : null);
                }
            }
            i11 = 0;
        }
        return new Integer(i11);
    }
}
