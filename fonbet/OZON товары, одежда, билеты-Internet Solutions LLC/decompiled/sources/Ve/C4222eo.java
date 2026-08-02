package Ve;

import fd.InterfaceC6511n;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* renamed from: Ve.eo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4222eo extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ ListOfCardsResponseBody f30949d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ ListOfCardsResponseBody.PaymentToolInfo.Tool f30950e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ D1 f30951f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4222eo(D1 d12, kotlin.coroutines.d dVar) {
        super(3, dVar);
        this.f30951f = d12;
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C4222eo c4222eo = new C4222eo(this.f30951f, (kotlin.coroutines.d) obj3);
        c4222eo.f30949d = (ListOfCardsResponseBody) obj;
        c4222eo.f30950e = (ListOfCardsResponseBody.PaymentToolInfo.Tool) obj2;
        return c4222eo.invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if (r3 == null) goto L13;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ListOfCardsResponseBody.PaymentToolInfo.Tool tool;
        boolean z11;
        Object obj2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        ListOfCardsResponseBody listOfCardsResponseBody = this.f30949d;
        ListOfCardsResponseBody.PaymentToolInfo.Tool tool2 = this.f30950e;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList = listOfCardsResponseBody.getPaymentToolInfo().getToolList();
        if (toolList != null) {
            Iterator<T> it = toolList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (Intrinsics.d(((ListOfCardsResponseBody.PaymentToolInfo.Tool) obj2).getCardNumber(), tool2.getCardNumber())) {
                    break;
                }
            }
            tool = (ListOfCardsResponseBody.PaymentToolInfo.Tool) obj2;
        }
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList2 = listOfCardsResponseBody.getPaymentToolInfo().getToolList();
        tool = toolList2 != null ? (ListOfCardsResponseBody.PaymentToolInfo.Tool) C7714v.K(toolList2) : null;
        D1 d12 = this.f30951f;
        boolean r02 = Lf.a.r0(d12.f28802f, EnumC4290h5.CARD_BALANCE, null);
        if (Lf.a.r0(d12.f28802f, EnumC4290h5.COMPOUND_WALLET, null)) {
            Integer countAdditionalCards = tool != null ? tool.getCountAdditionalCards() : null;
            if (countAdditionalCards != null && countAdditionalCards.intValue() > 0) {
                z11 = true;
                return Cm.a(r02, z11, false, tool);
            }
        }
        z11 = false;
        return Cm.a(r02, z11, false, tool);
    }
}
