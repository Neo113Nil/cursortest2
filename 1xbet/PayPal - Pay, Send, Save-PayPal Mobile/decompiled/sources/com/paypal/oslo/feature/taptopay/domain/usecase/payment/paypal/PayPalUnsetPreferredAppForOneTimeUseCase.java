package com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/paypal/PayPalUnsetPreferredAppForOneTimeUseCase;", "", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/UnsetPreferredAppForOneTimeUseCase;", "unsetPreferredAppForOneTimeUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/paypal/PayPalIsDefaultPaymentAppUseCase;", "isPayPalDefaultPaymentAppUseCase", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/UnsetPreferredAppForOneTimeUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/paypal/PayPalIsDefaultPaymentAppUseCase;)V", "Landroid/app/Activity;", "activity", "", "invoke", "(Landroid/app/Activity;)Z", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/UnsetPreferredAppForOneTimeUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/paypal/PayPalIsDefaultPaymentAppUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PayPalUnsetPreferredAppForOneTimeUseCase {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.payment.UnsetPreferredAppForOneTimeUseCase getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalIsDefaultPaymentAppUseCase getHighSpeedVideoSizes;

    @javax.inject.Inject
    public PayPalUnsetPreferredAppForOneTimeUseCase(com.paypal.oslo.feature.taptopay.domain.usecase.payment.UnsetPreferredAppForOneTimeUseCase unsetPreferredAppForOneTimeUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalIsDefaultPaymentAppUseCase payPalIsDefaultPaymentAppUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unsetPreferredAppForOneTimeUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalIsDefaultPaymentAppUseCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = unsetPreferredAppForOneTimeUseCase;
        this.getHighSpeedVideoSizes = payPalIsDefaultPaymentAppUseCase;
    }

    public final boolean invoke(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        if (!this.getHighSpeedVideoSizes.invoke()) {
            return this.getHighResolutionOutputSizeshNQ4ISI.invoke(activity);
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "No-op; PayPal is already the default contactless payment app.", null, null, 6, null);
        return true;
    }
}
