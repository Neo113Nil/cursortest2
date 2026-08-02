package com.paypal.android.taptopay.domain.repository.payment;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\f\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH&¢\u0006\u0004\b\f\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u001a\u0010\u0015"}, d2 = {"Lcom/paypal/android/taptopay/domain/repository/payment/PaymentRepository;", "", "", "isDefaultPaymentApp", "()Z", "isListedAsPaymentApp", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/android/taptopay/domain/model/payment/PaymentState;", "observePayment", "()Lkotlinx/coroutines/flow/Flow;", "Landroidx/activity/result/ActivityResultCaller;", "activityResultCaller", "setDefaultPaymentApp", "(Landroidx/activity/result/ActivityResultCaller;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "activityResultLauncher", "(Landroidx/activity/result/ActivityResultLauncher;)Z", "Landroid/app/Activity;", "activity", "setPreferredAppForOneTimeUse", "(Landroid/app/Activity;)Z", "show", "", "showAsPaymentApp", "(Z)V", "unsetPreferredAppForOneTimeUse"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface PaymentRepository {
    boolean isDefaultPaymentApp();

    boolean isListedAsPaymentApp();

    kotlinx.coroutines.flow.Flow<com.paypal.android.taptopay.domain.model.payment.PaymentState> observePayment();

    @kotlin.Deprecated(message = "Use setDefaultPaymentApp(ActivityResultLauncher)", replaceWith = @kotlin.ReplaceWith(expression = "setDefaultPaymentApp(activityResultLauncher)", imports = {}))
    java.lang.Object setDefaultPaymentApp(androidx.view.result.ActivityResultCaller activityResultCaller, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);

    boolean setDefaultPaymentApp(androidx.view.result.ActivityResultLauncher<android.content.Intent> activityResultLauncher);

    boolean setPreferredAppForOneTimeUse(android.app.Activity activity);

    void showAsPaymentApp(boolean show);

    boolean unsetPreferredAppForOneTimeUse(android.app.Activity activity);
}
