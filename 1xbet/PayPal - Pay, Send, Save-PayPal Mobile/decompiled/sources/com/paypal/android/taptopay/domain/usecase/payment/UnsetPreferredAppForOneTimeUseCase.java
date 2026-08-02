package com.paypal.android.taptopay.domain.usecase.payment;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/android/taptopay/domain/usecase/payment/UnsetPreferredAppForOneTimeUseCase;", "", "Lcom/paypal/android/taptopay/domain/repository/payment/PaymentRepository;", "paymentRepository", "<init>", "(Lcom/paypal/android/taptopay/domain/repository/payment/PaymentRepository;)V", "Landroid/app/Activity;", "activity", "", "invoke", "(Landroid/app/Activity;)Z", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/android/taptopay/domain/repository/payment/PaymentRepository;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class UnsetPreferredAppForOneTimeUseCase {
    private final com.paypal.android.taptopay.domain.repository.payment.PaymentRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public UnsetPreferredAppForOneTimeUseCase(com.paypal.android.taptopay.domain.repository.payment.PaymentRepository paymentRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentRepository, "");
        this.getHighSpeedVideoFpsRangesFor = paymentRepository;
    }

    public final boolean invoke(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        return this.getHighSpeedVideoFpsRangesFor.unsetPreferredAppForOneTimeUse(activity);
    }
}
