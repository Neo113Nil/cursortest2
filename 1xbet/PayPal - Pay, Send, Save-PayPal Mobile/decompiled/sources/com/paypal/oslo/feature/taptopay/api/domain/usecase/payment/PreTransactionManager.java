package com.paypal.oslo.feature.taptopay.api.domain.usecase.payment;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/payment/PreTransactionManager;", "", "Landroid/app/Activity;", "activity", "", "onHomeResumed", "(Landroid/app/Activity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onHomePaused"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface PreTransactionManager {
    java.lang.Object onHomePaused(android.app.Activity activity, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object onHomeResumed(android.app.Activity activity, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
