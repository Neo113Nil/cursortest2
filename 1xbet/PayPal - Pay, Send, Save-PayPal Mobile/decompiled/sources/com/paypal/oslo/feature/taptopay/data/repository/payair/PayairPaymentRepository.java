package com.paypal.oslo.feature.taptopay.data.repository.payair;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0010J\u001d\u0010\u0019\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b \u0010\u0010R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010!\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010%\u001a\u0006*\u00020\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/payair/PayairPaymentRepository;", "Lcom/paypal/oslo/feature/taptopay/domain/repository/payment/PaymentRepository;", "Landroid/content/Context;", "context", "Lcom/payair/logic/managers/PaymentServiceManager;", "paymentServiceManager", "Lcom/paypal/oslo/feature/taptopay/data/repository/payair/PayairPaymentDataSource;", "paymentDataSource", "<init>", "(Landroid/content/Context;Lcom/payair/logic/managers/PaymentServiceManager;Lcom/paypal/oslo/feature/taptopay/data/repository/payair/PayairPaymentDataSource;)V", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/PaymentState;", "observePayment", "()Lkotlinx/coroutines/flow/Flow;", "", "isListedAsPaymentApp", "()Z", "show", "", "showAsPaymentApp", "(Z)V", "isDefaultPaymentApp", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "activityResultLauncher", "setDefaultPaymentApp", "(Landroidx/activity/result/ActivityResultLauncher;)Z", "Landroid/app/Activity;", "activity", "setPreferredAppForOneTimeUse", "(Landroid/app/Activity;)Z", "unsetPreferredAppForOneTimeUse", "isForegroundSettingEnabled", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/payair/logic/managers/PaymentServiceManager;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/data/repository/payair/PayairPaymentDataSource;", "getHighSpeedVideoFpsRangesFor", "Landroid/content/Context;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PayairPaymentRepository implements com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.payair.logic.managers.PaymentServiceManager getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentDataSource getHighResolutionOutputSizeshNQ4ISI;
    private final android.content.Context getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public PayairPaymentRepository(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, com.payair.logic.managers.PaymentServiceManager paymentServiceManager, com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentDataSource payairPaymentDataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentServiceManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payairPaymentDataSource, "");
        this.getHighSpeedVideoFpsRanges = paymentServiceManager;
        this.getHighResolutionOutputSizeshNQ4ISI = payairPaymentDataSource;
        this.getHighSpeedVideoFpsRangesFor = context.getApplicationContext();
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository
    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState> observePayment() {
        return kotlinx.coroutines.flow.FlowKt.onEach(this.getHighResolutionOutputSizeshNQ4ISI.getPaymentFlow(), new com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentRepository$observePayment$1(null));
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository
    public final boolean isListedAsPaymentApp() {
        return this.getHighSpeedVideoFpsRangesFor.getPackageManager().getComponentEnabledSetting(new android.content.ComponentName(this.getHighSpeedVideoFpsRangesFor, (java.lang.Class<?>) com.payair.hce.PayairWalletHceService.class)) == 1;
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository
    public final void showAsPaymentApp(boolean show) {
        this.getHighSpeedVideoFpsRangesFor.getPackageManager().setComponentEnabledSetting(new android.content.ComponentName(this.getHighSpeedVideoFpsRangesFor, (java.lang.Class<?>) com.payair.hce.PayairWalletHceService.class), show ? 1 : 2, 1);
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository
    public final boolean isDefaultPaymentApp() {
        boolean isDefaultPaymentApp = this.getHighSpeedVideoFpsRanges.isDefaultPaymentApp();
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Checking if default payment app", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("isDefault", java.lang.Boolean.valueOf(isDefaultPaymentApp))), null, 4, null);
        return isDefaultPaymentApp;
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository
    public final boolean setDefaultPaymentApp(androidx.view.result.ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResultLauncher, "");
        return this.getHighSpeedVideoFpsRanges.startActivityToSetDefaultPaymentApp(activityResultLauncher);
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository
    public final boolean setPreferredAppForOneTimeUse(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Setting preferred payment service for one-time use", null, null, 6, null);
        this.getHighSpeedVideoFpsRanges.setPreferredService(activity);
        return true;
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository
    public final boolean unsetPreferredAppForOneTimeUse(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        this.getHighSpeedVideoFpsRanges.removePreferredService(activity);
        return true;
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository
    public final boolean isForegroundSettingEnabled() {
        android.nfc.NfcAdapter defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(this.getHighSpeedVideoFpsRangesFor);
        if (defaultAdapter == null) {
            return false;
        }
        return android.nfc.cardemulation.CardEmulation.getInstance(defaultAdapter).categoryAllowsForegroundPreference("payment");
    }
}
