package com.paypal.oslo.feature.taptopay.data.repository.payment;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001BC\b\u0007\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u001d\u0010\u001b\u001a\u00020\u00102\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\"\u0010\u0012R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010$R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020\u00018CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010+"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/payment/PaymentRepositoryWrapper;", "Lcom/paypal/oslo/feature/taptopay/domain/repository/payment/PaymentRepository;", "Ljavax/inject/Provider;", "thalesRepositoryProvider", "payairRepositoryProvider", "mockRepositoryProvider", "Lcom/paypal/oslo/feature/taptopay/data/wallet/ImplementationSelector;", "implementationSelector", "Lcom/paypal/oslo/feature/taptopay/domain/remoteconfig/TapToPayConfig$Manager;", "tapToPayConfig", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Lcom/paypal/oslo/feature/taptopay/data/wallet/ImplementationSelector;Lcom/paypal/oslo/feature/taptopay/domain/remoteconfig/TapToPayConfig$Manager;)V", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/PaymentState;", "observePayment", "()Lkotlinx/coroutines/flow/Flow;", "", "isListedAsPaymentApp", "()Z", "show", "", "showAsPaymentApp", "(Z)V", "isDefaultPaymentApp", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "activityResultLauncher", "setDefaultPaymentApp", "(Landroidx/activity/result/ActivityResultLauncher;)Z", "Landroid/app/Activity;", "activity", "setPreferredAppForOneTimeUse", "(Landroid/app/Activity;)Z", "unsetPreferredAppForOneTimeUse", "isForegroundSettingEnabled", "getHighSpeedVideoFpsRangesFor", "Ljavax/inject/Provider;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/data/wallet/ImplementationSelector;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/taptopay/domain/remoteconfig/TapToPayConfig$Manager;", "()Lcom/paypal/oslo/feature/taptopay/domain/repository/payment/PaymentRepository;", "getOutputFormats"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentRepositoryWrapper implements com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.wallet.ImplementationSelector getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final javax.inject.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository> getHighSpeedVideoSizes;
    private final javax.inject.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final javax.inject.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository> getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public PaymentRepositoryWrapper(javax.inject.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository> provider, javax.inject.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository> provider2, javax.inject.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository> provider3, com.paypal.oslo.feature.taptopay.data.wallet.ImplementationSelector implementationSelector, com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager manager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(implementationSelector, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manager, "");
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getHighSpeedVideoFpsRanges = implementationSelector;
        this.Camera2StreamConfigurationMap = manager;
    }

    private final com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository getHighSpeedVideoSizes() {
        java.lang.String selectedVendor = this.getHighSpeedVideoFpsRanges.getSelectedVendor();
        if (this.Camera2StreamConfigurationMap.isTapToPayMockEnabled()) {
            com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository paymentRepository = this.getHighResolutionOutputSizeshNQ4ISI.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(paymentRepository, "");
            return paymentRepository;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(selectedVendor, "payair")) {
            com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository paymentRepository2 = this.getHighSpeedVideoSizes.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(paymentRepository2, "");
            return paymentRepository2;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(selectedVendor, "thales")) {
            com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository paymentRepository3 = this.getHighSpeedVideoFpsRangesFor.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(paymentRepository3, "");
            return paymentRepository3;
        }
        com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository paymentRepository4 = this.getHighSpeedVideoFpsRangesFor.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(paymentRepository4, "");
        return paymentRepository4;
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository
    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState> observePayment() {
        return getHighSpeedVideoSizes().observePayment();
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository
    public final boolean isListedAsPaymentApp() {
        return getHighSpeedVideoSizes().isListedAsPaymentApp();
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository
    public final void showAsPaymentApp(boolean show) {
        getHighSpeedVideoSizes().showAsPaymentApp(show);
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository
    public final boolean isDefaultPaymentApp() {
        return getHighSpeedVideoSizes().isDefaultPaymentApp();
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository
    public final boolean setDefaultPaymentApp(androidx.view.result.ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResultLauncher, "");
        return getHighSpeedVideoSizes().setDefaultPaymentApp(activityResultLauncher);
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository
    public final boolean setPreferredAppForOneTimeUse(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        return getHighSpeedVideoSizes().setPreferredAppForOneTimeUse(activity);
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository
    public final boolean unsetPreferredAppForOneTimeUse(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        return getHighSpeedVideoSizes().unsetPreferredAppForOneTimeUse(activity);
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository
    public final boolean isForegroundSettingEnabled() {
        return getHighSpeedVideoSizes().isForegroundSettingEnabled();
    }
}
