package com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/paypal/PayPalSetPreferredAppForOneTimeUseCase;", "", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/SetPreferredAppForOneTimeUseCase;", "setPreferredAppForOneTimeUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/paypal/PayPalIsDefaultPaymentAppUseCase;", "isPayPalDefaultPaymentAppUseCase", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/SetPreferredAppForOneTimeUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/paypal/PayPalIsDefaultPaymentAppUseCase;)V", "Landroid/app/Activity;", "activity", "", "invoke", "(Landroid/app/Activity;)Z", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/SetPreferredAppForOneTimeUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/paypal/PayPalIsDefaultPaymentAppUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PayPalSetPreferredAppForOneTimeUseCase {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.payment.SetPreferredAppForOneTimeUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalIsDefaultPaymentAppUseCase Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public PayPalSetPreferredAppForOneTimeUseCase(com.paypal.oslo.feature.taptopay.domain.usecase.payment.SetPreferredAppForOneTimeUseCase setPreferredAppForOneTimeUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalIsDefaultPaymentAppUseCase payPalIsDefaultPaymentAppUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setPreferredAppForOneTimeUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalIsDefaultPaymentAppUseCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = setPreferredAppForOneTimeUseCase;
        this.Camera2StreamConfigurationMap = payPalIsDefaultPaymentAppUseCase;
    }

    public final boolean invoke(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        if (!this.Camera2StreamConfigurationMap.invoke()) {
            return this.getHighResolutionOutputSizeshNQ4ISI.invoke(activity);
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "No-op; PayPal is already the default contactless payment app.", null, null, 6, null);
        return true;
    }
}
