package com.paypal.oslo.feature.taptopay.domain.usecase.payment;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/SetDefaultPaymentAppUseCase;", "", "Lcom/paypal/oslo/feature/taptopay/domain/repository/payment/PaymentRepository;", "paymentRepository", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/repository/payment/PaymentRepository;)V", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "activityResultLauncher", "", "invoke", "(Landroidx/activity/result/ActivityResultLauncher;)Z", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/taptopay/domain/repository/payment/PaymentRepository;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SetDefaultPaymentAppUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public SetDefaultPaymentAppUseCase(com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository paymentRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentRepository, "");
        this.getHighSpeedVideoFpsRangesFor = paymentRepository;
    }

    public final boolean invoke(androidx.view.result.ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResultLauncher, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Running set default payment app use case", null, null, 6, null);
        return this.getHighSpeedVideoFpsRangesFor.setDefaultPaymentApp(activityResultLauncher);
    }
}
