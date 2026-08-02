package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.api.PaymentResult;
import spay.sdk.api.model.SPaymentRequest;

/* renamed from: Ve.lr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4427lr extends AbstractC7737t implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SPaymentRequest f31543b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ spay.sdk.d f31544c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4427lr(SPaymentRequest sPaymentRequest, spay.sdk.d dVar) {
        super(1);
        this.f31543b = sPaymentRequest;
        this.f31544c = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PaymentResult paymentResult = (PaymentResult) obj;
        Intrinsics.checkNotNullParameter(paymentResult, "paymentResult");
        this.f31543b.getCallback().invoke(paymentResult);
        Te te2 = this.f31544c.f98854e;
        if (te2 != null) {
            te2.b(new Bi(EnumC4464n6.MACPay, null, Pe.MAC, null, null, null, null, 122));
        }
        return Unit.f71690a;
    }
}
