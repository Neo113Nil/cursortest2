package com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/shared/defaultpayment/ChooseDefaultPaymentViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/paypal/PayPalIsDefaultPaymentAppUseCase;", "payPalIsDefaultPaymentAppUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/SetDefaultPaymentAppUseCase;", "setDefaultPaymentAppUseCase", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/paypal/PayPalIsDefaultPaymentAppUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/SetDefaultPaymentAppUseCase;)V", "", "isPaypalDefaultPaymentApp", "()Z", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "activityResultLauncher", "setPaypalAsDefaultPaymentApp", "(Landroidx/activity/result/ActivityResultLauncher;)Z", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/paypal/PayPalIsDefaultPaymentAppUseCase;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/SetDefaultPaymentAppUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChooseDefaultPaymentViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalIsDefaultPaymentAppUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.payment.SetDefaultPaymentAppUseCase getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public ChooseDefaultPaymentViewModel(com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalIsDefaultPaymentAppUseCase payPalIsDefaultPaymentAppUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.payment.SetDefaultPaymentAppUseCase setDefaultPaymentAppUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalIsDefaultPaymentAppUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setDefaultPaymentAppUseCase, "");
        this.getHighSpeedVideoSizes = payPalIsDefaultPaymentAppUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = setDefaultPaymentAppUseCase;
    }

    public final boolean isPaypalDefaultPaymentApp() {
        return this.getHighSpeedVideoSizes.invoke();
    }

    public final boolean setPaypalAsDefaultPaymentApp(androidx.view.result.ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResultLauncher, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.invoke(activityResultLauncher);
    }
}
