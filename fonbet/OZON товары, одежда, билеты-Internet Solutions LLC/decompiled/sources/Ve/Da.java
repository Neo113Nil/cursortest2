package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import spay.sdk.domain.model.DeprecatedPaymentMethod;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* loaded from: classes10.dex */
public final class Da extends AbstractC7737t implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4238fb f28845b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ListOfCardsResponseBody.PaymentToolInfo.Tool f28846c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f28847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4112b0 f28848e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Da(C4238fb c4238fb, ListOfCardsResponseBody.PaymentToolInfo.Tool tool, boolean z11, C4112b0 c4112b0) {
        super(0);
        this.f28845b = c4238fb;
        this.f28846c = tool;
        this.f28847d = z11;
        this.f28848e = c4112b0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C4238fb c4238fb = this.f28845b;
        Ib ib2 = c4238fb.f31017a;
        boolean z11 = ((PayStrategy) ((C4654tn) c4238fb.f31018b).f32129F.getValue()) instanceof DeprecatedPaymentMethod;
        ListOfCardsResponseBody.PaymentToolInfo.Tool tool = this.f28846c;
        boolean z12 = this.f28847d;
        ((C4673ud) ib2).c(z11 ? new C4459n1(tool, z12) : new I0(tool, z12, this.f28848e));
        return Unit.f71690a;
    }
}
