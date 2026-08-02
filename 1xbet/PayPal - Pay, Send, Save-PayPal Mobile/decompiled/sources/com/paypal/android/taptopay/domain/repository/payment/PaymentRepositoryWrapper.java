package com.paypal.android.taptopay.domain.repository.payment;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0097@¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0012\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0012\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b \u0010\u001bR\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00018CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010#\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010$"}, d2 = {"Lcom/paypal/android/taptopay/domain/repository/payment/PaymentRepositoryWrapper;", "Lcom/paypal/android/taptopay/domain/repository/payment/PaymentRepository;", "thalesRepository", "payairRepository", "Lcom/paypal/android/taptopay/domain/di/ImplementationSelector;", "implementationSelector", "<init>", "(Lcom/paypal/android/taptopay/domain/repository/payment/PaymentRepository;Lcom/paypal/android/taptopay/domain/repository/payment/PaymentRepository;Lcom/paypal/android/taptopay/domain/di/ImplementationSelector;)V", "", "isDefaultPaymentApp", "()Z", "isListedAsPaymentApp", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/android/taptopay/domain/model/payment/PaymentState;", "observePayment", "()Lkotlinx/coroutines/flow/Flow;", "Landroidx/activity/result/ActivityResultCaller;", "activityResultCaller", "setDefaultPaymentApp", "(Landroidx/activity/result/ActivityResultCaller;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "activityResultLauncher", "(Landroidx/activity/result/ActivityResultLauncher;)Z", "Landroid/app/Activity;", "activity", "setPreferredAppForOneTimeUse", "(Landroid/app/Activity;)Z", "show", "", "showAsPaymentApp", "(Z)V", "unsetPreferredAppForOneTimeUse", "getHighSpeedVideoFpsRanges", "Lcom/paypal/android/taptopay/domain/di/ImplementationSelector;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/android/taptopay/domain/repository/payment/PaymentRepository;", "Camera2StreamConfigurationMap", "()Lcom/paypal/android/taptopay/domain/repository/payment/PaymentRepository;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PaymentRepositoryWrapper implements com.paypal.android.taptopay.domain.repository.payment.PaymentRepository {
    private final com.paypal.android.taptopay.domain.di.ImplementationSelector getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.domain.repository.payment.PaymentRepository Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.domain.repository.payment.PaymentRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public PaymentRepositoryWrapper(com.paypal.android.taptopay.domain.repository.payment.PaymentRepository paymentRepository, com.paypal.android.taptopay.domain.repository.payment.PaymentRepository paymentRepository2, com.paypal.android.taptopay.domain.di.ImplementationSelector implementationSelector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentRepository2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(implementationSelector, "");
        this.getHighSpeedVideoFpsRangesFor = paymentRepository;
        this.Camera2StreamConfigurationMap = paymentRepository2;
        this.getHighSpeedVideoFpsRanges = implementationSelector;
    }

    private final com.paypal.android.taptopay.domain.repository.payment.PaymentRepository Camera2StreamConfigurationMap() {
        java.lang.String selectedVendor = this.getHighSpeedVideoFpsRanges.getSelectedVendor();
        return kotlin.jvm.internal.Intrinsics.areEqual(selectedVendor, "payair") ? this.Camera2StreamConfigurationMap : kotlin.jvm.internal.Intrinsics.areEqual(selectedVendor, "thales") ? this.getHighSpeedVideoFpsRangesFor : this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // com.paypal.android.taptopay.domain.repository.payment.PaymentRepository
    public final kotlinx.coroutines.flow.Flow<com.paypal.android.taptopay.domain.model.payment.PaymentState> observePayment() {
        return kotlinx.coroutines.flow.FlowKt.transformLatest(this.getHighSpeedVideoFpsRanges.getVendorFlow(), new com.paypal.android.taptopay.domain.repository.payment.PaymentRepositoryWrapper$observePayment$$inlined$flatMapLatest$1(null, this));
    }

    @Override // com.paypal.android.taptopay.domain.repository.payment.PaymentRepository
    public final boolean isListedAsPaymentApp() {
        return Camera2StreamConfigurationMap().isListedAsPaymentApp();
    }

    @Override // com.paypal.android.taptopay.domain.repository.payment.PaymentRepository
    public final void showAsPaymentApp(boolean show) {
        Camera2StreamConfigurationMap().showAsPaymentApp(show);
    }

    @Override // com.paypal.android.taptopay.domain.repository.payment.PaymentRepository
    public final boolean isDefaultPaymentApp() {
        return Camera2StreamConfigurationMap().isDefaultPaymentApp();
    }

    @Override // com.paypal.android.taptopay.domain.repository.payment.PaymentRepository
    @kotlin.Deprecated(message = "Use setDefaultPaymentApp(ActivityResultLauncher)", replaceWith = @kotlin.ReplaceWith(expression = "setDefaultPaymentApp(activityResultLauncher)", imports = {}))
    public final java.lang.Object setDefaultPaymentApp(androidx.view.result.ActivityResultCaller activityResultCaller, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return Camera2StreamConfigurationMap().setDefaultPaymentApp(activityResultCaller, continuation);
    }

    @Override // com.paypal.android.taptopay.domain.repository.payment.PaymentRepository
    public final boolean setDefaultPaymentApp(androidx.view.result.ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResultLauncher, "");
        return Camera2StreamConfigurationMap().setDefaultPaymentApp(activityResultLauncher);
    }

    @Override // com.paypal.android.taptopay.domain.repository.payment.PaymentRepository
    public final boolean setPreferredAppForOneTimeUse(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        return Camera2StreamConfigurationMap().setPreferredAppForOneTimeUse(activity);
    }

    @Override // com.paypal.android.taptopay.domain.repository.payment.PaymentRepository
    public final boolean unsetPreferredAppForOneTimeUse(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        return Camera2StreamConfigurationMap().unsetPreferredAppForOneTimeUse(activity);
    }
}
