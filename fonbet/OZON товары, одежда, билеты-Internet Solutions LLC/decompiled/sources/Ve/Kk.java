package Ve;

import fd.InterfaceC6511n;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.api.SPaymentTool;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* loaded from: classes10.dex */
public final class Kk extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ ListOfCardsResponseBody f29359d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ ListOfCardsResponseBody.PaymentToolInfo.Tool f29360e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4318i4 f29361f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Vm f29362g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kk(C4318i4 c4318i4, Vm vm, kotlin.coroutines.d dVar) {
        super(3, dVar);
        this.f29361f = c4318i4;
        this.f29362g = vm;
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Kk kk = new Kk(this.f29361f, this.f29362g, (kotlin.coroutines.d) obj3);
        kk.f29359d = (ListOfCardsResponseBody) obj;
        kk.f29360e = (ListOfCardsResponseBody.PaymentToolInfo.Tool) obj2;
        return kk.invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if (r3 == null) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
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
        ListOfCardsResponseBody listOfCardsResponseBody = this.f29359d;
        ListOfCardsResponseBody.PaymentToolInfo.Tool tool2 = this.f29360e;
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
        C4318i4 c4318i4 = this.f29361f;
        boolean r02 = Lf.a.r0(c4318i4.f31241d, EnumC4290h5.CARD_BALANCE, null);
        if (Lf.a.r0(c4318i4.f31241d, EnumC4290h5.COMPOUND_WALLET, null)) {
            Integer countAdditionalCards = tool != null ? tool.getCountAdditionalCards() : null;
            if (countAdditionalCards != null && countAdditionalCards.intValue() > 0) {
                z11 = true;
                return Cm.a(r02, z11, ((PayStrategy) ((C4654tn) this.f29362g).f32129F.getValue()).getToolType() == SPaymentTool.PAYMENT_ACCOUNTS, tool);
            }
        }
        z11 = false;
        return Cm.a(r02, z11, ((PayStrategy) ((C4654tn) this.f29362g).f32129F.getValue()).getToolType() == SPaymentTool.PAYMENT_ACCOUNTS, tool);
    }
}
