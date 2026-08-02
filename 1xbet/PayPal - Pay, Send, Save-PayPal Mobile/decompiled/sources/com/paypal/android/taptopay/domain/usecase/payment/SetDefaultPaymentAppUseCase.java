package com.paypal.android.taptopay.domain.usecase.payment;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0087B¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\t\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0086\u0002¢\u0006\u0004\b\t\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/android/taptopay/domain/usecase/payment/SetDefaultPaymentAppUseCase;", "", "Lcom/paypal/android/taptopay/domain/repository/payment/PaymentRepository;", "paymentRepository", "<init>", "(Lcom/paypal/android/taptopay/domain/repository/payment/PaymentRepository;)V", "Landroidx/activity/result/ActivityResultCaller;", "activityResultCaller", "", "invoke", "(Landroidx/activity/result/ActivityResultCaller;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "activityResultLauncher", "(Landroidx/activity/result/ActivityResultLauncher;)Z", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/android/taptopay/domain/repository/payment/PaymentRepository;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SetDefaultPaymentAppUseCase {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.domain.repository.payment.PaymentRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public SetDefaultPaymentAppUseCase(com.paypal.android.taptopay.domain.repository.payment.PaymentRepository paymentRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = paymentRepository;
    }

    @kotlin.Deprecated(message = "Use setDefaultPaymentApp(ActivityResultLauncher)", replaceWith = @kotlin.ReplaceWith(expression = "setDefaultPaymentApp(activityResultLauncher)", imports = {}))
    public final java.lang.Object invoke(androidx.view.result.ActivityResultCaller activityResultCaller, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return this.getHighResolutionOutputSizeshNQ4ISI.setDefaultPaymentApp(activityResultCaller, continuation);
    }

    public final boolean invoke(androidx.view.result.ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResultLauncher, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.setDefaultPaymentApp(activityResultLauncher);
    }
}
