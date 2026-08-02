package com.paypal.android.taptopay.data.thales.payment;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0097@¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0015\u001a\u00020\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0017H\u0016¢\u0006\u0004\b\u0015\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\"\u0010\u001dR\u0018\u0010#\u001a\u0006*\u00020\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/payment/ThalesPaymentRepository;", "Lcom/paypal/android/taptopay/domain/repository/payment/PaymentRepository;", "Landroid/content/Context;", "context", "Lcom/paypal/android/taptopay/data/thales/payment/ThalesPaymentDataSource;", "paymentDataSource", "<init>", "(Landroid/content/Context;Lcom/paypal/android/taptopay/data/thales/payment/ThalesPaymentDataSource;)V", "Landroid/content/Intent;", "getHighResolutionOutputSizeshNQ4ISI", "()Landroid/content/Intent;", "", "isDefaultPaymentApp", "()Z", "isListedAsPaymentApp", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/android/taptopay/domain/model/payment/PaymentState;", "observePayment", "()Lkotlinx/coroutines/flow/Flow;", "Landroidx/activity/result/ActivityResultCaller;", "activityResultCaller", "setDefaultPaymentApp", "(Landroidx/activity/result/ActivityResultCaller;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/activity/result/ActivityResultLauncher;", "activityResultLauncher", "(Landroidx/activity/result/ActivityResultLauncher;)Z", "Landroid/app/Activity;", "activity", "setPreferredAppForOneTimeUse", "(Landroid/app/Activity;)Z", "show", "", "showAsPaymentApp", "(Z)V", "unsetPreferredAppForOneTimeUse", "getHighSpeedVideoFpsRanges", "Landroid/content/Context;", "Camera2StreamConfigurationMap", "Lcom/paypal/android/taptopay/data/thales/payment/ThalesPaymentDataSource;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ThalesPaymentRepository implements com.paypal.android.taptopay.domain.repository.payment.PaymentRepository {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource getHighSpeedVideoFpsRangesFor;
    private final android.content.Context getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public ThalesPaymentRepository(android.content.Context context, com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource thalesPaymentDataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thalesPaymentDataSource, "");
        this.getHighSpeedVideoFpsRangesFor = thalesPaymentDataSource;
        this.getHighSpeedVideoFpsRanges = context.getApplicationContext();
    }

    @Override // com.paypal.android.taptopay.domain.repository.payment.PaymentRepository
    public final kotlinx.coroutines.flow.Flow<com.paypal.android.taptopay.domain.model.payment.PaymentState> observePayment() {
        return kotlinx.coroutines.flow.FlowKt.onEach(this.getHighSpeedVideoFpsRangesFor.getPaymentFlow(), new com.paypal.android.taptopay.data.thales.payment.ThalesPaymentRepository$observePayment$1(null));
    }

    @Override // com.paypal.android.taptopay.domain.repository.payment.PaymentRepository
    public final boolean isListedAsPaymentApp() {
        return this.getHighSpeedVideoFpsRanges.getPackageManager().getComponentEnabledSetting(new android.content.ComponentName(this.getHighSpeedVideoFpsRanges, (java.lang.Class<?>) com.paypal.android.taptopay.data.thales.payment.ThalesPaymentHCEService.class)) == 1;
    }

    @Override // com.paypal.android.taptopay.domain.repository.payment.PaymentRepository
    public final void showAsPaymentApp(boolean show) {
        this.getHighSpeedVideoFpsRanges.getPackageManager().setComponentEnabledSetting(new android.content.ComponentName(this.getHighSpeedVideoFpsRanges, (java.lang.Class<?>) com.paypal.android.taptopay.data.thales.payment.ThalesPaymentHCEService.class), show ? 1 : 2, 1);
    }

    @Override // com.paypal.android.taptopay.domain.repository.payment.PaymentRepository
    public final boolean isDefaultPaymentApp() {
        android.nfc.NfcAdapter defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(this.getHighSpeedVideoFpsRanges);
        if (defaultAdapter != null) {
            return android.nfc.cardemulation.CardEmulation.getInstance(defaultAdapter).isDefaultServiceForCategory(new android.content.ComponentName(this.getHighSpeedVideoFpsRanges, (java.lang.Class<?>) com.paypal.android.taptopay.data.thales.payment.ThalesPaymentHCEService.class), "payment");
        }
        return false;
    }

    @Override // com.paypal.android.taptopay.domain.repository.payment.PaymentRepository
    @kotlin.Deprecated(message = "Use setDefaultPaymentApp(ActivityResultLauncher)", replaceWith = @kotlin.ReplaceWith(expression = "setDefaultPaymentApp(activityResultLauncher)", imports = {}))
    public final java.lang.Object setDefaultPaymentApp(androidx.view.result.ActivityResultCaller activityResultCaller, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        if (android.nfc.NfcAdapter.getDefaultAdapter(this.getHighSpeedVideoFpsRanges) != null) {
            kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
            final kotlin.coroutines.SafeContinuation safeContinuation2 = safeContinuation;
            android.content.Intent highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
            if (highResolutionOutputSizeshNQ4ISI != null) {
                activityResultCaller.registerForActivityResult(new androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult(), new androidx.view.result.ActivityResultCallback() { // from class: com.paypal.android.taptopay.data.thales.payment.ThalesPaymentRepository$setDefaultPaymentApp$2$1
                    @Override // androidx.view.result.ActivityResultCallback
                    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                    public final void onActivityResult(androidx.view.result.ActivityResult activityResult) {
                        kotlin.coroutines.Continuation<java.lang.Boolean> continuation2 = safeContinuation2;
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        continuation2.resumeWith(kotlin.Result.m23436constructorimpl(java.lang.Boolean.valueOf(activityResult.getResultCode() == -1)));
                    }
                }).launch(highResolutionOutputSizeshNQ4ISI);
            } else {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                safeContinuation2.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false)));
            }
            java.lang.Object orThrow = safeContinuation.getOrThrow();
            if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return orThrow;
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
    }

    @Override // com.paypal.android.taptopay.domain.repository.payment.PaymentRepository
    public final boolean setDefaultPaymentApp(androidx.view.result.ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
        java.lang.Boolean bool;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResultLauncher, "");
        if (android.nfc.NfcAdapter.getDefaultAdapter(this.getHighSpeedVideoFpsRanges) != null) {
            android.content.Intent highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
            if (highResolutionOutputSizeshNQ4ISI != null) {
                activityResultLauncher.launch(highResolutionOutputSizeshNQ4ISI);
                bool = java.lang.Boolean.TRUE;
            } else {
                bool = null;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "NFC adapter is NULL", null, null, 6, null);
        return false;
    }

    private final android.content.Intent getHighResolutionOutputSizeshNQ4ISI() {
        android.content.Intent intent;
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            java.lang.Object systemService = this.getHighSpeedVideoFpsRanges.getSystemService("role");
            android.app.role.RoleManager roleManager = systemService instanceof android.app.role.RoleManager ? (android.app.role.RoleManager) systemService : null;
            if (roleManager != null) {
                if (roleManager.isRoleAvailable("android.app.role.WALLET")) {
                    intent = roleManager.createRequestRoleIntent("android.app.role.WALLET");
                } else {
                    com.paypal.android.logger.Logger.w$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "android.app.role.WALLET role is not available.", null, null, 6, null);
                    intent = null;
                }
                if (intent != null) {
                    return intent;
                }
            }
            com.paypal.android.logger.Logger.w$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "RoleManager is not available.", null, null, 6, null);
            return null;
        }
        return new android.content.Intent("android.nfc.cardemulation.action.ACTION_CHANGE_DEFAULT").putExtra(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, new android.content.ComponentName(this.getHighSpeedVideoFpsRanges, (java.lang.Class<?>) com.paypal.android.taptopay.data.thales.payment.ThalesPaymentHCEService.class)).putExtra("category", "payment");
    }

    @Override // com.paypal.android.taptopay.domain.repository.payment.PaymentRepository
    public final boolean setPreferredAppForOneTimeUse(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        android.nfc.NfcAdapter defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(this.getHighSpeedVideoFpsRanges);
        if (defaultAdapter == null) {
            com.paypal.android.logger.Logger.w$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "NfcAdapter.getDefaultAdapter is null. Can not set preferred service for contactless payment.", null, null, 6, null);
            return false;
        }
        android.nfc.cardemulation.CardEmulation cardEmulation = android.nfc.cardemulation.CardEmulation.getInstance(defaultAdapter);
        if (cardEmulation == null) {
            com.paypal.android.logger.Logger.w$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "CardEmulation.getInstance is null. Can not set preferred service for contactless payment.", null, null, 6, null);
            return false;
        }
        android.content.ComponentName componentName = new android.content.ComponentName(this.getHighSpeedVideoFpsRanges, (java.lang.Class<?>) com.paypal.android.taptopay.data.thales.payment.ThalesPaymentHCEService.class);
        if (cardEmulation.isDefaultServiceForCategory(componentName, "payment")) {
            com.paypal.android.logger.Logger.i$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Service is already the default for payment.", null, null, 6, null);
            return true;
        }
        if (!cardEmulation.categoryAllowsForegroundPreference("payment")) {
            com.paypal.android.logger.Logger.i$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Cannot set the preferred service for payment.", null, null, 6, null);
            return false;
        }
        boolean preferredService = cardEmulation.setPreferredService(activity, componentName);
        com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Set the preferred service", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("result", java.lang.Boolean.valueOf(preferredService))), null, 4, null);
        return preferredService;
    }

    @Override // com.paypal.android.taptopay.domain.repository.payment.PaymentRepository
    public final boolean unsetPreferredAppForOneTimeUse(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        android.nfc.NfcAdapter defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(this.getHighSpeedVideoFpsRanges);
        if (defaultAdapter == null) {
            com.paypal.android.logger.Logger.w$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "NfcAdapter.getDefaultAdapter is null. Can not unset preferred service for contactless payment.", null, null, 6, null);
            return false;
        }
        android.nfc.cardemulation.CardEmulation cardEmulation = android.nfc.cardemulation.CardEmulation.getInstance(defaultAdapter);
        if (cardEmulation == null) {
            com.paypal.android.logger.Logger.w$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "CardEmulation.getInstance is null. Can not unset preferred service for contactless payment.", null, null, 6, null);
            return false;
        }
        if (cardEmulation.isDefaultServiceForCategory(new android.content.ComponentName(this.getHighSpeedVideoFpsRanges, (java.lang.Class<?>) com.paypal.android.taptopay.data.thales.payment.ThalesPaymentHCEService.class), "payment")) {
            com.paypal.android.logger.Logger.i$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Service is already the default for payment.", null, null, 6, null);
            return true;
        }
        boolean unsetPreferredService = cardEmulation.unsetPreferredService(activity);
        com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Unset the preferred service", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("result", java.lang.Boolean.valueOf(unsetPreferredService))), null, 4, null);
        return unsetPreferredService;
    }
}
