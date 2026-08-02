package com.paypal.oslo.feature.taptopay.data.payair.csdk;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000 E2\u00020\u0001:\u0001EB9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001b\u0010\u0014J\u000f\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\"\u0010\u001dJ\u0017\u0010%\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J#\u0010'\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b'\u0010!J\u0017\u0010(\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b*\u0010\u0014J!\u0010+\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0012H\u0016¢\u0006\u0004\b-\u0010\u001dJ\u000f\u0010.\u001a\u00020\u0012H\u0016¢\u0006\u0004\b.\u0010\u001dJ\u000f\u0010/\u001a\u00020\u0012H\u0016¢\u0006\u0004\b/\u0010\u001dJ\u000f\u00100\u001a\u00020\u0012H\u0016¢\u0006\u0004\b0\u0010\u001dR\u0014\u00103\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00101\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00108\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00104\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010;R\u0014\u00106\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R \u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020A0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010BR \u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020D0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010B"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/payair/csdk/CsdkListener;", "Lcom/payair/listener/ClientListener;", "Lcom/paypal/oslo/feature/taptopay/data/payair/replenishment/PayairCardPaymentKeysReplenisher;", "payairCardPaymentKeysReplenisher", "Lcom/paypal/oslo/feature/taptopay/data/repository/payair/PayairPaymentListener;", "paymentListener", "Lcom/paypal/oslo/feature/taptopay/data/payair/csdk/SdkTokenManager;", "sdkTokenManager", "Lcom/paypal/oslo/feature/taptopay/data/payair/csdk/SdkConfigurationManager;", "sdkConfigurationManager", "Lcom/paypal/oslo/feature/taptopay/data/payair/register/AuthToken;", "authToken", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/paypal/oslo/feature/taptopay/data/payair/replenishment/PayairCardPaymentKeysReplenisher;Lcom/paypal/oslo/feature/taptopay/data/repository/payair/PayairPaymentListener;Lcom/paypal/oslo/feature/taptopay/data/payair/csdk/SdkTokenManager;Lcom/paypal/oslo/feature/taptopay/data/payair/csdk/SdkConfigurationManager;Lcom/paypal/oslo/feature/taptopay/data/payair/register/AuthToken;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "networkTokenReference", "", "onActivateToken", "(Ljava/lang/String;)V", "Lcom/payair/listener/model/EventError;", "eventError", "onAuthenticationCancelled", "(Lcom/payair/listener/model/EventError;)V", "onAuthenticationFailed", "onCardProvisionFailure", "onCardProvisionedCompleted", "onDeviceNotSecure", "()V", "Lcom/payair/listener/model/TransactionEventData;", "transactionEventData", "onPaymentAborted", "(Ljava/lang/String;Lcom/payair/listener/model/TransactionEventData;)V", "onPaymentAuthentication", "Landroidx/biometric/BiometricPrompt$AuthenticationResult;", "result", "onPaymentAuthenticationSuccess", "(Landroidx/biometric/BiometricPrompt$AuthenticationResult;)V", "onPaymentCompleted", "onPaymentStopped", "(Lcom/payair/listener/model/TransactionEventData;)V", "onReplenishCompleted", "onReplenishFailed", "(Lcom/payair/listener/model/EventError;Ljava/lang/String;)V", "onResetSDK", "onTransactionReadyToBeResumed", "onTransactionRestartRequired", "onUploadUnlockKeys", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taptopay/data/payair/replenishment/PayairCardPaymentKeysReplenisher;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/data/repository/payair/PayairPaymentListener;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/taptopay/data/payair/csdk/SdkTokenManager;", "getHighSpeedVideoFpsRanges", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/data/payair/csdk/SdkConfigurationManager;", "Lcom/paypal/oslo/feature/taptopay/data/payair/register/AuthToken;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/CoroutineScope;", "getOutputMinFrameDuration", "Lkotlinx/coroutines/CoroutineScope;", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Ljava/util/concurrent/ConcurrentHashMap;", "getInputFormats", "Lkotlinx/coroutines/Job;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CsdkListener implements com.payair.listener.ClientListener {
    public static final int MAX_RETRIES = 5;
    public static final int RETRY_INTERVAL_SECONDS = 30;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, kotlinx.coroutines.Job> getOutputMinFrameDuration;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.payair.register.AuthToken Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> getInputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.payair.replenishment.PayairCardPaymentKeysReplenisher getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager getHighSpeedVideoFpsRanges;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkConfigurationManager getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoSizesFor;
    public static final int $stable = 8;

    @javax.inject.Inject
    public CsdkListener(com.paypal.oslo.feature.taptopay.data.payair.replenishment.PayairCardPaymentKeysReplenisher payairCardPaymentKeysReplenisher, com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener payairPaymentListener, com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager sdkTokenManager, com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkConfigurationManager sdkConfigurationManager, com.paypal.oslo.feature.taptopay.data.payair.register.AuthToken authToken, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payairCardPaymentKeysReplenisher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payairPaymentListener, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkTokenManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkConfigurationManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authToken, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoFpsRangesFor = payairCardPaymentKeysReplenisher;
        this.getHighSpeedVideoSizes = payairPaymentListener;
        this.getHighSpeedVideoFpsRanges = sdkTokenManager;
        this.getHighResolutionOutputSizeshNQ4ISI = sdkConfigurationManager;
        this.Camera2StreamConfigurationMap = authToken;
        this.getHighSpeedVideoSizesFor = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher));
        this.getInputFormats = new java.util.concurrent.ConcurrentHashMap<>();
        this.getOutputMinFrameDuration = new java.util.concurrent.ConcurrentHashMap<>();
    }

    @Override // com.payair.listener.ClientListener
    public final void onActivateToken(java.lang.String networkTokenReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTokenReference, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "onActivateToken", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("networkTokenReference", networkTokenReference)), null, 4, null);
    }

    @Override // com.payair.listener.ClientListener
    public final void onAuthenticationCancelled(com.payair.listener.model.EventError eventError) {
        java.lang.String errorCode;
        java.lang.Integer intOrNull;
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        int i = 0;
        pairArr[0] = kotlin.TuplesKt.to("errorCode", eventError != null ? eventError.getErrorCode() : null);
        pairArr[1] = kotlin.TuplesKt.to("errorMessage", eventError != null ? eventError.getErrorMessage() : null);
        com.paypal.android.logger.Logger.d$default(logger, "onAuthenticationCancelled", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener payairPaymentListener = this.getHighSpeedVideoSizes;
        if (eventError != null && (errorCode = eventError.getErrorCode()) != null && (intOrNull = kotlin.text.StringsKt.toIntOrNull(errorCode)) != null) {
            i = intOrNull.intValue();
        }
        java.lang.String errorMessage = eventError != null ? eventError.getErrorMessage() : null;
        if (errorMessage == null) {
            errorMessage = "";
        }
        payairPaymentListener.onAuthenticationCancelled(i, errorMessage);
    }

    @Override // com.payair.listener.ClientListener
    public final void onAuthenticationFailed(com.payair.listener.model.EventError eventError) {
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        pairArr[0] = kotlin.TuplesKt.to("errorCode", eventError != null ? eventError.getErrorCode() : null);
        pairArr[1] = kotlin.TuplesKt.to("errorMessage", eventError != null ? eventError.getErrorMessage() : null);
        com.paypal.android.logger.Logger.d$default(logger, "onAuthenticationFailed", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        this.getHighSpeedVideoSizes.onAuthenticationFailed();
    }

    @Override // com.payair.listener.ClientListener
    public final void onCardProvisionFailure(com.payair.listener.model.EventError eventError) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoSizesFor, null, null, new com.paypal.oslo.feature.taptopay.data.payair.csdk.CsdkListener$onCardProvisionFailure$1(this, null), 3, null);
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        pairArr[0] = kotlin.TuplesKt.to("errorCode", eventError != null ? eventError.getErrorCode() : null);
        pairArr[1] = kotlin.TuplesKt.to("errorMessage", eventError != null ? eventError.getErrorMessage() : null);
        com.paypal.android.logger.Logger.w$default(logger, "onCardProvisionFailure", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
    }

    @Override // com.payair.listener.ClientListener
    public final void onCardProvisionedCompleted(java.lang.String networkTokenReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTokenReference, "");
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "onCardProvisionedCompleted", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("networkTokenReference", networkTokenReference)), null, 4, null);
    }

    @Override // com.payair.listener.ClientListener
    public final void onDeviceNotSecure() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "onDeviceNotSecure", null, null, 6, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoSizesFor, null, null, new com.paypal.oslo.feature.taptopay.data.payair.csdk.CsdkListener$onDeviceNotSecure$1(this, null), 3, null);
    }

    @Override // com.payair.listener.ClientListener
    public final void onPaymentAborted(java.lang.String networkTokenReference, com.payair.listener.model.TransactionEventData transactionEventData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTokenReference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEventData, "");
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "onPaymentAborted", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("networkTokenReference", networkTokenReference), kotlin.TuplesKt.to("status", transactionEventData.getTransactionStatus()), kotlin.TuplesKt.to("isAccepted", java.lang.Boolean.valueOf(transactionEventData.getTransactionAccepted())), kotlin.TuplesKt.to("amount", transactionEventData.getAmount()), kotlin.TuplesKt.to("currency", transactionEventData.getCurrency())), null, 4, null);
        this.getHighSpeedVideoSizes.onPaymentAborted(networkTokenReference, transactionEventData);
    }

    @Override // com.payair.listener.ClientListener
    public final void onPaymentAuthentication() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "onPaymentAuthentication", null, null, 6, null);
        this.getHighSpeedVideoSizes.onPaymentAuthentication();
    }

    @Override // com.payair.listener.ClientListener
    public final void onPaymentAuthenticationSuccess(androidx.biometric.BiometricPrompt.AuthenticationResult result) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
        int authenticationType = result.getAuthenticationType();
        if (authenticationType == -1) {
            str = "AUTHENTICATION_RESULT_TYPE_UNKNOWN";
        } else if (authenticationType == 1) {
            str = "AUTHENTICATION_RESULT_TYPE_DEVICE_CREDENTIAL";
        } else if (authenticationType == 2) {
            str = "AUTHENTICATION_RESULT_TYPE_BIOMETRIC";
        } else {
            str = "NONE";
        }
        com.paypal.android.logger.Logger.d$default(logger, "onPaymentAuthenticationSuccess", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("result", str)), null, 4, null);
        this.getHighSpeedVideoSizes.onPaymentAuthenticationSuccess(result);
    }

    @Override // com.payair.listener.ClientListener
    public final void onPaymentCompleted(java.lang.String networkTokenReference, com.payair.listener.model.TransactionEventData transactionEventData) {
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[5];
        pairArr[0] = kotlin.TuplesKt.to("networkTokenReference", networkTokenReference);
        pairArr[1] = kotlin.TuplesKt.to("status", transactionEventData != null ? transactionEventData.getTransactionStatus() : null);
        pairArr[2] = kotlin.TuplesKt.to("isAccepted", transactionEventData != null ? java.lang.Boolean.valueOf(transactionEventData.getTransactionAccepted()) : null);
        pairArr[3] = kotlin.TuplesKt.to("amount", transactionEventData != null ? transactionEventData.getAmount() : null);
        pairArr[4] = kotlin.TuplesKt.to("currency", transactionEventData != null ? transactionEventData.getCurrency() : null);
        com.paypal.android.logger.Logger.i$default(logger, "onPaymentCompleted", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        this.getHighSpeedVideoSizes.onPaymentCompleted(networkTokenReference, transactionEventData);
    }

    @Override // com.payair.listener.ClientListener
    public final void onPaymentStopped(com.payair.listener.model.TransactionEventData transactionEventData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEventData, "");
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "onPaymentStopped", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("status", transactionEventData.getTransactionStatus()), kotlin.TuplesKt.to("isAccepted", java.lang.Boolean.valueOf(transactionEventData.getTransactionAccepted())), kotlin.TuplesKt.to("amount", transactionEventData.getAmount()), kotlin.TuplesKt.to("currency", transactionEventData.getCurrency())), null, 4, null);
        this.getHighSpeedVideoSizes.onPaymentStopped(transactionEventData);
    }

    @Override // com.payair.listener.ClientListener
    public final void onReplenishCompleted(java.lang.String networkTokenReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTokenReference, "");
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "onReplenishCompleted", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("networkTokenReference", networkTokenReference)), null, 4, null);
        kotlinx.coroutines.Job remove = this.getOutputMinFrameDuration.remove(networkTokenReference);
        if (remove != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(remove, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.getInputFormats.remove(networkTokenReference);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004c, code lost:
    
        r0 = 0;
     */
    @Override // com.payair.listener.ClientListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReplenishFailed(com.payair.listener.model.EventError eventError, java.lang.String networkTokenReference) {
        kotlinx.coroutines.Job launch$default;
        java.lang.Integer putIfAbsent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTokenReference, "");
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        pairArr[0] = kotlin.TuplesKt.to("errorCode", eventError != null ? eventError.getErrorCode() : null);
        pairArr[1] = kotlin.TuplesKt.to("errorMessage", eventError != null ? eventError.getErrorMessage() : null);
        pairArr[2] = kotlin.TuplesKt.to("networkTokenReference", networkTokenReference);
        com.paypal.android.logger.Logger.w$default(logger, "onReplenishFailed", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> concurrentHashMap = this.getInputFormats;
        java.lang.Integer num = concurrentHashMap.get(networkTokenReference);
        if (num == null && (putIfAbsent = concurrentHashMap.putIfAbsent(networkTokenReference, num)) != null) {
            num = putIfAbsent;
        }
        java.lang.Integer num2 = num;
        if (num2.intValue() < 5) {
            this.getInputFormats.put(networkTokenReference, java.lang.Integer.valueOf(num2.intValue() + 1));
            kotlinx.coroutines.Job job = this.getOutputMinFrameDuration.get(networkTokenReference);
            if (job != null) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoSizesFor, null, null, new com.paypal.oslo.feature.taptopay.data.payair.csdk.CsdkListener$onReplenishFailed$job$1(num2, this, networkTokenReference, null), 3, null);
            this.getOutputMinFrameDuration.put(networkTokenReference, launch$default);
            return;
        }
        kotlinx.coroutines.Job remove = this.getOutputMinFrameDuration.remove(networkTokenReference);
        if (remove != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(remove, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.getInputFormats.remove(networkTokenReference);
    }

    @Override // com.payair.listener.ClientListener
    public final void onResetSDK() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "onResetSDK", null, null, 6, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoSizesFor, null, null, new com.paypal.oslo.feature.taptopay.data.payair.csdk.CsdkListener$onResetSDK$1(this, null), 3, null);
    }

    @Override // com.payair.listener.ClientListener
    public final void onTransactionReadyToBeResumed() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "onTransactionReadyToBeResumed", null, null, 6, null);
    }

    @Override // com.payair.listener.ClientListener
    public final void onTransactionRestartRequired() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "onTransactionRestartRequired", null, null, 6, null);
    }

    @Override // com.payair.listener.ClientListener
    public final void onUploadUnlockKeys() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "onUploadUnlockKeys", null, null, 6, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoSizesFor, null, null, new com.paypal.oslo.feature.taptopay.data.payair.csdk.CsdkListener$onUploadUnlockKeys$1(this, null), 3, null);
    }
}
