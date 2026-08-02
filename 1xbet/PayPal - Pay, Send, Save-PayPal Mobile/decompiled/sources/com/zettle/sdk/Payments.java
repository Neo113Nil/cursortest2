package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/Payments;", "", "Lkotlinx/coroutines/flow/Flow;", "Lcom/zettle/sdk/OfflinePaymentEvent;", "offlinePaymentEvents", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zettle/sdk/PaymentParameters;", "parameters", "Lcom/zettle/sdk/PaymentSession;", "startPayment", "(Lcom/zettle/sdk/PaymentParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface Payments {
    java.lang.Object offlinePaymentEvents(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.zettle.sdk.OfflinePaymentEvent>> continuation);

    java.lang.Object startPayment(com.zettle.sdk.PaymentParameters paymentParameters, kotlin.coroutines.Continuation<? super com.zettle.sdk.PaymentSession> continuation);
}
