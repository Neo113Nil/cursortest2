package com.paypal.oslo.feature.taptopay.data;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/PreTransactionManagerImpl;", "Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/payment/PreTransactionManager;", "Lcom/paypal/oslo/feature/taptopay/domain/remoteconfig/TapToPayConfig$Manager;", "tapToPayConfig", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsNfcSupportedUseCase;", "isNfcSupportedUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/IsDefaultPaymentAppUseCase;", "isDefaultPaymentAppUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetDefaultCardUseCase;", "getDefaultCardUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/paypal/PayPalSetPreferredAppForOneTimeUseCase;", "setPreferredAppForOneTimeUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/paypal/PayPalUnsetPreferredAppForOneTimeUseCase;", "unsetPreferredAppForOneTimeUseCase", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/remoteconfig/TapToPayConfig$Manager;Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsNfcSupportedUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/IsDefaultPaymentAppUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetDefaultCardUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/paypal/PayPalSetPreferredAppForOneTimeUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/paypal/PayPalUnsetPreferredAppForOneTimeUseCase;)V", "Landroid/app/Activity;", "activity", "", "onHomeResumed", "(Landroid/app/Activity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onHomePaused", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/domain/remoteconfig/TapToPayConfig$Manager;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsNfcSupportedUseCase;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/IsDefaultPaymentAppUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetDefaultCardUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/paypal/PayPalSetPreferredAppForOneTimeUseCase;", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/paypal/PayPalUnsetPreferredAppForOneTimeUseCase;", "getOutputFormats", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PreTransactionManagerImpl implements com.paypal.oslo.feature.taptopay.api.domain.usecase.payment.PreTransactionManager {

    @java.lang.Deprecated
    public static final java.lang.String PAY_MODE_ACTIVITY_CLASS_NAME = "com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetDefaultCardUseCase getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalSetPreferredAppForOneTimeUseCase getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcSupportedUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.payment.IsDefaultPaymentAppUseCase Camera2StreamConfigurationMap;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalUnsetPreferredAppForOneTimeUseCase getOutputFormats;
    private static final com.paypal.oslo.feature.taptopay.data.PreTransactionManagerImpl.Companion Companion = new com.paypal.oslo.feature.taptopay.data.PreTransactionManagerImpl.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public PreTransactionManagerImpl(com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager manager, com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcSupportedUseCase isNfcSupportedUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.payment.IsDefaultPaymentAppUseCase isDefaultPaymentAppUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetDefaultCardUseCase payPalGetDefaultCardUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalSetPreferredAppForOneTimeUseCase payPalSetPreferredAppForOneTimeUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalUnsetPreferredAppForOneTimeUseCase payPalUnsetPreferredAppForOneTimeUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isNfcSupportedUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isDefaultPaymentAppUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalGetDefaultCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalSetPreferredAppForOneTimeUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalUnsetPreferredAppForOneTimeUseCase, "");
        this.getHighSpeedVideoFpsRanges = manager;
        this.getHighSpeedVideoSizes = isNfcSupportedUseCase;
        this.Camera2StreamConfigurationMap = isDefaultPaymentAppUseCase;
        this.getHighSpeedVideoFpsRangesFor = payPalGetDefaultCardUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = payPalSetPreferredAppForOneTimeUseCase;
        this.getOutputFormats = payPalUnsetPreferredAppForOneTimeUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.taptopay.api.domain.usecase.payment.PreTransactionManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object onHomeResumed(android.app.Activity activity, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.taptopay.data.PreTransactionManagerImpl$onHomeResumed$1 preTransactionManagerImpl$onHomeResumed$1;
        int i;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.PreTransactionManagerImpl$onHomeResumed$1) {
            preTransactionManagerImpl$onHomeResumed$1 = (com.paypal.oslo.feature.taptopay.data.PreTransactionManagerImpl$onHomeResumed$1) continuation;
            if ((preTransactionManagerImpl$onHomeResumed$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                preTransactionManagerImpl$onHomeResumed$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = preTransactionManagerImpl$onHomeResumed$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = preTransactionManagerImpl$onHomeResumed$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!this.getHighSpeedVideoFpsRanges.isTapToPayMockEnabled()) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Pre-transaction: Tap to Pay mock not enabled, skipping", null, null, 6, null);
                        return kotlin.Unit.INSTANCE;
                    }
                    if (!this.getHighSpeedVideoSizes.invoke()) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Pre-transaction: NFC not supported, skipping", null, null, 6, null);
                        return kotlin.Unit.INSTANCE;
                    }
                    if (this.Camera2StreamConfigurationMap.invoke()) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Pre-transaction: already default payment app, skipping", null, null, 6, null);
                        return kotlin.Unit.INSTANCE;
                    }
                    com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetDefaultCardUseCase payPalGetDefaultCardUseCase = this.getHighSpeedVideoFpsRangesFor;
                    preTransactionManagerImpl$onHomeResumed$1.getHighSpeedVideoFpsRangesFor = activity;
                    preTransactionManagerImpl$onHomeResumed$1.Camera2StreamConfigurationMap = 1;
                    obj = payPalGetDefaultCardUseCase.invoke(preTransactionManagerImpl$onHomeResumed$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    activity = (android.app.Activity) preTransactionManagerImpl$onHomeResumed$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                payPalDigitizedCard = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard) ((arrow.core.Either) obj).getOrNull();
                if (payPalDigitizedCard != null || payPalDigitizedCard.getDigitizedCard().getStatus() != com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.Active) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Pre-transaction: no active default card, skipping", null, null, 6, null);
                    return kotlin.Unit.INSTANCE;
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Pre-transaction: registering as contactless payment app", null, null, 6, null);
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Pre-transaction: set preferred app result", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("result", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.getHighResolutionOutputSizeshNQ4ISI.invoke(activity)))), null, 4, null);
                return kotlin.Unit.INSTANCE;
            }
        }
        preTransactionManagerImpl$onHomeResumed$1 = new com.paypal.oslo.feature.taptopay.data.PreTransactionManagerImpl$onHomeResumed$1(this, continuation);
        java.lang.Object obj2 = preTransactionManagerImpl$onHomeResumed$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = preTransactionManagerImpl$onHomeResumed$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        payPalDigitizedCard = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard) ((arrow.core.Either) obj2).getOrNull();
        if (payPalDigitizedCard != null) {
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Pre-transaction: no active default card, skipping", null, null, 6, null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.taptopay.api.domain.usecase.payment.PreTransactionManager
    public final java.lang.Object onHomePaused(android.app.Activity activity, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        android.content.ComponentName component;
        java.util.List<android.app.ActivityManager.AppTask> appTasks;
        if (!this.getHighSpeedVideoFpsRanges.isTapToPayMockEnabled()) {
            return kotlin.Unit.INSTANCE;
        }
        if (!this.getHighSpeedVideoSizes.invoke()) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object systemService = activity.getSystemService("activity");
        java.lang.String str = null;
        android.app.ActivityManager activityManager = systemService instanceof android.app.ActivityManager ? (android.app.ActivityManager) systemService : null;
        android.app.ActivityManager.AppTask appTask = (activityManager == null || (appTasks = activityManager.getAppTasks()) == null) ? null : (android.app.ActivityManager.AppTask) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) appTasks);
        if (appTask != null && (component = appTask.getTaskInfo().baseIntent.getComponent()) != null) {
            str = component.getClassName();
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, PAY_MODE_ACTIVITY_CLASS_NAME)) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Pre-transaction: PayMode in foreground, skipping unregister", null, null, 6, null);
            return kotlin.Unit.INSTANCE;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Pre-transaction: unregistering one-time preference", null, null, 6, null);
        this.getOutputFormats.invoke(activity);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/PreTransactionManagerImpl$Companion;", "", "<init>", "()V", "", "PAY_MODE_ACTIVITY_CLASS_NAME", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
