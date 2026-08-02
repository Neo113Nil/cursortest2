package com.zettle.sdk.feature.taptopay.core.transaction;

@kotlin.Metadata(d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002Bü\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012=\b\u0002\u00107\u001a7\u0012\u001d\u0012\u001b\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000203\u0018\u000101¢\u0006\u0002\b4\u0012\n\u0012\b\u0012\u0004\u0012\u0002020500j\b\u0012\u0004\u0012\u000202`6¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u0002032\u0006\u0010;\u001a\u00020:H\u0000¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u0002032\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u000203H\u0016¢\u0006\u0004\bB\u0010CJ=\u0010N\u001a\u0002032\f\u0010F\u001a\b\u0012\u0004\u0012\u00020E0D2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020G2\u0006\u0010K\u001a\u00020J2\u0006\u0010M\u001a\u00020LH\u0016¢\u0006\u0004\bN\u0010OJ\u0017\u0010R\u001a\u0002032\u0006\u0010Q\u001a\u00020PH\u0016¢\u0006\u0004\bR\u0010SJ\u0013\u0010V\u001a\u00020U*\u00020TH\u0002¢\u0006\u0004\bV\u0010WR\u0014\u0010V\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010[\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010ZR\u0014\u0010^\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010X\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\\\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010`R\u0014\u0010a\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010c\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010g\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010m\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010p\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010q\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010k\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010sR\u0014\u0010n\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010tR\u0014\u0010w\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010z\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR \u0010{\u001a\b\u0012\u0004\u0012\u000202058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R\u0015\u0010u\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0015\u0010x\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\bw\u0010\u0081\u0001R\u0016\u0010\u007f\u001a\u00030\u0082\u00018\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\bz\u0010\u0083\u0001R\u0017\u0010\u0086\u0001\u001a\u00020\u00198\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0017\u0010\u0087\u0001\u001a\u00020,8\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0017\u0010\u0084\u0001\u001a\u00020#8\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternalImpl;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal;", "Lcom/zettle/sdk/core/log/Loggable;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation;", "attestation", "Lcom/zettle/sdk/feature/taptopay/core/transaction/analytics/TransactionAnalytics;", "transactionAnalytics", "Lcom/zettle/sdk/feature/taptopay/core/transaction/analytics/TransactionHerdAnalytics;", "transactionHerdAnalytics", "Lcom/zettle/sdk/commons/thread/EventsLoop;", "eventsLoop", "Lcom/zettle/sdk/core/network/NetworkModule;", "networkModule", "Lcom/zettle/sdk/core/os/LocationInfo;", "locationInfo", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/StartTransactionUseCase;", "startTransactionUsecase", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/EnterPinUseCase;", "enterPinUsecase", "Lcom/zettle/sdk/feature/taptopay/core/configuration/cvmlimits/CvmLimitsUsecase;", "cvmLimitsUsecase", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/CancelTransactionUseCase;", "cancelTransactionUseCase", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/RequestOnlineAuthUseCase;", "requestOnlineAuthUseCase", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/TransactionRequestUseCase;", "transactionRequestUseCase", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/RecoverTransactionRequestUseCase;", "recoverTransactionRequestUseCase", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/FinalizeRequestUseCase;", "finalizeRequestUseCase", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/AbortRequestUseCase;", "abortRequestUseCase", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/PermissiveSignatureUseCase;", "permissiveSignatureUseCase", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/UploadSignatureUseCase;", "uploadSignatureUseCase", "Lcom/zettle/sdk/feature/taptopay/core/configuration/init/ConfigurationInitUsecase;", "configurationInitUseCase", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/ReinitialiseUseCase;", "reinitialiseUseCase", "Lkotlin/Function0;", "", "magnesId", "Lcom/zettle/sdk/feature/taptopay/core/Translations;", "translations", "Lcom/zettle/sdk/core/auth/merchant/MerchantConfig;", "merchantConfig", "Lkotlin/Function1;", "Lkotlin/Function2;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State;", "", "Lkotlin/ParameterName;", "Lcom/zettle/sdk/commons/state/MutableState;", "Lcom/zettle/sdk/feature/taptopay/core/StateFactory;", "stateFactory", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation;Lcom/zettle/sdk/feature/taptopay/core/transaction/analytics/TransactionAnalytics;Lcom/zettle/sdk/feature/taptopay/core/transaction/analytics/TransactionHerdAnalytics;Lcom/zettle/sdk/commons/thread/EventsLoop;Lcom/zettle/sdk/core/network/NetworkModule;Lcom/zettle/sdk/core/os/LocationInfo;Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/StartTransactionUseCase;Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/EnterPinUseCase;Lcom/zettle/sdk/feature/taptopay/core/configuration/cvmlimits/CvmLimitsUsecase;Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/CancelTransactionUseCase;Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/RequestOnlineAuthUseCase;Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/TransactionRequestUseCase;Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/RecoverTransactionRequestUseCase;Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/FinalizeRequestUseCase;Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/AbortRequestUseCase;Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/PermissiveSignatureUseCase;Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/UploadSignatureUseCase;Lcom/zettle/sdk/feature/taptopay/core/configuration/init/ConfigurationInitUsecase;Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/ReinitialiseUseCase;Lkotlin/jvm/functions/Function0;Lcom/zettle/sdk/feature/taptopay/core/Translations;Lcom/zettle/sdk/core/auth/merchant/MerchantConfig;Lkotlin/jvm/functions/Function1;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action;", "action", "action$core_publicRelease", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action;)V", "Lcom/zettle/sdk/feature/taptopay/core/FailureReason;", "reason", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "(Lcom/zettle/sdk/feature/taptopay/core/FailureReason;)V", "reset", "()V", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "weakReferenceActivity", "", "amount", "gratuity", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_REFERENCE, "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/PaymentProperties;", "paymentProperties", "startTransaction", "(Ljava/lang/ref/WeakReference;JJLcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/PaymentProperties;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/Signature;", "signature", "uploadSignature", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/Signature;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$Failed;", "", "Camera2StreamConfigurationMap", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$Failed;)Z", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/AbortRequestUseCase;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/CancelTransactionUseCase;", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/feature/taptopay/core/configuration/init/ConfigurationInitUsecase;", "Lcom/zettle/sdk/feature/taptopay/core/configuration/cvmlimits/CvmLimitsUsecase;", "getOutputFormats", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/EnterPinUseCase;", "getInputFormats", "Lcom/zettle/sdk/commons/thread/EventsLoop;", "getHighSpeedVideoSizesFor", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/FinalizeRequestUseCase;", "getOutputMinFrameDuration", "Lcom/zettle/sdk/core/os/LocationInfo;", "getInputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function0;", "getOutputSizeshNQ4ISI", "Lcom/zettle/sdk/core/auth/merchant/MerchantConfig;", "getOutputStallDurationlomOqCM", "getOutputStallDuration", "Lcom/zettle/sdk/core/network/NetworkModule;", "getOutputMinFrameDurationlomOqCM", "getOutputSizes", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/PermissiveSignatureUseCase;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/RecoverTransactionRequestUseCase;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/ReinitialiseUseCase;", "isOutputSupportedFor", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/RequestOnlineAuthUseCase;", "getValidOutputFormatsForInputhNQ4ISI", "unwrapAs", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/StartTransactionUseCase;", "isOutputSupportedForhNQ4ISI", "state", "Lcom/zettle/sdk/commons/state/MutableState;", "getState", "()Lcom/zettle/sdk/commons/state/MutableState;", "toString", "Lcom/zettle/sdk/feature/taptopay/core/transaction/analytics/TransactionAnalytics;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/analytics/TransactionHerdAnalytics;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionEvents;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionEvents;", "coroutineCreation", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/TransactionRequestUseCase;", "coroutineBoundary", "ArtificialStackFrames", "Lcom/zettle/sdk/feature/taptopay/core/Translations;", "CoroutineDebuggingKt", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/UploadSignatureUseCase;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TransactionInternalImpl implements com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal, com.zettle.sdk.core.log.Loggable {
    private final com.zettle.sdk.feature.taptopay.core.Translations ArtificialStackFrames;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.attestation.Attestation getHighSpeedVideoFpsRanges;

    /* renamed from: CoroutineDebuggingKt, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.transaction.usecase.UploadSignatureUseCase coroutineCreation;

    /* renamed from: coroutineCreation, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.transaction.usecase.TransactionRequestUseCase coroutineBoundary;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.transaction.usecase.AbortRequestUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.transaction.usecase.CancelTransactionUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUsecase getHighResolutionOutputSizeshNQ4ISI;
    private final com.zettle.sdk.feature.taptopay.core.transaction.usecase.FinalizeRequestUseCase getHighSpeedVideoSizesFor;
    private final com.zettle.sdk.commons.thread.EventsLoop getInputFormats;
    private final kotlin.jvm.functions.Function0<java.lang.String> getInputSizeshNQ4ISI;
    private final com.zettle.sdk.feature.taptopay.core.transaction.usecase.EnterPinUseCase getOutputFormats;
    private final com.zettle.sdk.core.os.LocationInfo getOutputMinFrameDuration;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.transaction.usecase.ReinitialiseUseCase getOutputStallDuration;
    private final com.zettle.sdk.feature.taptopay.core.transaction.usecase.PermissiveSignatureUseCase getOutputSizes;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.zettle.sdk.core.auth.merchant.MerchantConfig getOutputStallDurationlomOqCM;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private final com.zettle.sdk.core.network.NetworkModule getOutputMinFrameDurationlomOqCM;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCase getOutputSizeshNQ4ISI;

    /* renamed from: getValidOutputFormatsForInputhNQ4ISI, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.transaction.analytics.TransactionHerdAnalytics unwrapAs;

    /* renamed from: isOutputSupportedFor, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.transaction.usecase.RequestOnlineAuthUseCase getValidOutputFormatsForInputhNQ4ISI;

    /* renamed from: isOutputSupportedForhNQ4ISI, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.transaction.TransactionEvents toString;
    private final com.zettle.sdk.commons.state.MutableState<com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State> state;

    /* renamed from: toString, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.transaction.analytics.TransactionAnalytics isOutputSupportedFor;

    /* renamed from: unwrapAs, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.transaction.usecase.StartTransactionUseCase isOutputSupportedForhNQ4ISI;

    public TransactionInternalImpl(com.zettle.sdk.feature.taptopay.core.attestation.Attestation attestation, com.zettle.sdk.feature.taptopay.core.transaction.analytics.TransactionAnalytics transactionAnalytics, com.zettle.sdk.feature.taptopay.core.transaction.analytics.TransactionHerdAnalytics transactionHerdAnalytics, com.zettle.sdk.commons.thread.EventsLoop eventsLoop, com.zettle.sdk.core.network.NetworkModule networkModule, com.zettle.sdk.core.os.LocationInfo locationInfo, com.zettle.sdk.feature.taptopay.core.transaction.usecase.StartTransactionUseCase startTransactionUseCase, com.zettle.sdk.feature.taptopay.core.transaction.usecase.EnterPinUseCase enterPinUseCase, com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecase cvmLimitsUsecase, com.zettle.sdk.feature.taptopay.core.transaction.usecase.CancelTransactionUseCase cancelTransactionUseCase, com.zettle.sdk.feature.taptopay.core.transaction.usecase.RequestOnlineAuthUseCase requestOnlineAuthUseCase, com.zettle.sdk.feature.taptopay.core.transaction.usecase.TransactionRequestUseCase transactionRequestUseCase, com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCase recoverTransactionRequestUseCase, com.zettle.sdk.feature.taptopay.core.transaction.usecase.FinalizeRequestUseCase finalizeRequestUseCase, com.zettle.sdk.feature.taptopay.core.transaction.usecase.AbortRequestUseCase abortRequestUseCase, com.zettle.sdk.feature.taptopay.core.transaction.usecase.PermissiveSignatureUseCase permissiveSignatureUseCase, com.zettle.sdk.feature.taptopay.core.transaction.usecase.UploadSignatureUseCase uploadSignatureUseCase, com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUsecase configurationInitUsecase, com.zettle.sdk.feature.taptopay.core.transaction.usecase.ReinitialiseUseCase reinitialiseUseCase, kotlin.jvm.functions.Function0<java.lang.String> function0, com.zettle.sdk.feature.taptopay.core.Translations translations, com.zettle.sdk.core.auth.merchant.MerchantConfig merchantConfig, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function2<? super com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State, ? super com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State, kotlin.Unit>, ? extends com.zettle.sdk.commons.state.MutableState<com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State>> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attestation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionAnalytics, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionHerdAnalytics, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventsLoop, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkModule, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locationInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startTransactionUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enterPinUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cvmLimitsUsecase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelTransactionUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestOnlineAuthUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionRequestUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recoverTransactionRequestUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(finalizeRequestUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(abortRequestUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissiveSignatureUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uploadSignatureUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configurationInitUsecase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reinitialiseUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(translations, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoFpsRanges = attestation;
        this.isOutputSupportedFor = transactionAnalytics;
        this.unwrapAs = transactionHerdAnalytics;
        this.getInputFormats = eventsLoop;
        this.getOutputMinFrameDurationlomOqCM = networkModule;
        this.getOutputMinFrameDuration = locationInfo;
        this.isOutputSupportedForhNQ4ISI = startTransactionUseCase;
        this.getOutputFormats = enterPinUseCase;
        this.getHighSpeedVideoFpsRangesFor = cvmLimitsUsecase;
        this.getHighSpeedVideoSizes = cancelTransactionUseCase;
        this.getValidOutputFormatsForInputhNQ4ISI = requestOnlineAuthUseCase;
        this.coroutineBoundary = transactionRequestUseCase;
        this.getOutputSizeshNQ4ISI = recoverTransactionRequestUseCase;
        this.getHighSpeedVideoSizesFor = finalizeRequestUseCase;
        this.Camera2StreamConfigurationMap = abortRequestUseCase;
        this.getOutputSizes = permissiveSignatureUseCase;
        this.coroutineCreation = uploadSignatureUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = configurationInitUsecase;
        this.getOutputStallDuration = reinitialiseUseCase;
        this.getInputSizeshNQ4ISI = function0;
        this.ArtificialStackFrames = translations;
        this.getOutputStallDurationlomOqCM = merchantConfig;
        this.state = function1.invoke(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl$state$1(this));
        attestation.getState().addObserver(new com.zettle.sdk.commons.state.StateObserver<com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State>() { // from class: com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl$special$$inlined$stateObserver$1
            @Override // com.zettle.sdk.commons.state.StateObserver
            public final void onNext(com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State state) {
                com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State state2 = state;
                com.zettle.sdk.core.log.LogKt.warn$default(com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this, "the state is:".concat(java.lang.String.valueOf(state2)), null, 2, null);
                if (state2 instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Failed) {
                    com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Attest.FailAttestation(((com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Failed) state2).getReason()));
                } else if (state2 instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Succeeded) {
                    com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Attest.SucceedAttestation.INSTANCE);
                } else if (state2 instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Ready) {
                    com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.ReadyToAttest.INSTANCE);
                }
            }
        });
        this.toString = new com.zettle.sdk.feature.taptopay.core.transaction.TransactionEvents() { // from class: com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl$transactionListener$1
            @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionEvents
            public final void onCardEvent(com.zettle.sdk.feature.taptopay.core.transaction.CardEvent event) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
                com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl transactionInternalImpl = com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this;
                java.lang.String name2 = event.name();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("onCardEvent(");
                sb.append(name2);
                sb.append(")");
                com.zettle.sdk.core.log.LogKt.debug(transactionInternalImpl, sb.toString());
                switch (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl$transactionListener$1.WhenMappings.$EnumSwitchMapping$0[event.ordinal()]) {
                    case 1:
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction.UnknownCardEvent.INSTANCE);
                        break;
                    case 2:
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction.NFCUnexpectedError.INSTANCE);
                        break;
                    case 3:
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction.CardTapped.INSTANCE);
                        break;
                    case 4:
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction.CardReadError.INSTANCE);
                        break;
                    case 5:
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction.CardReadTimeout.INSTANCE);
                        break;
                    case 6:
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction.CardReadDuplicate.INSTANCE);
                        break;
                }
            }

            @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionEvents
            public final void onTransactionUIEvent(com.zettle.sdk.feature.taptopay.core.transaction.TransactionUIEvent event) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
                com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl transactionInternalImpl = com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this;
                java.lang.String name2 = event.name();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("onTransactionUIEvent(");
                sb.append(name2);
                sb.append(")");
                com.zettle.sdk.core.log.LogKt.debug(transactionInternalImpl, sb.toString());
                int i = com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl$transactionListener$1.WhenMappings.$EnumSwitchMapping$1[event.ordinal()];
                if (i == 1) {
                    com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionUIAction.UnknownEvent.INSTANCE);
                    return;
                }
                if (i == 2) {
                    com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionUIAction.EventCardReadOk.INSTANCE);
                    return;
                }
                com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl transactionInternalImpl2 = com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this;
                java.lang.String name3 = event.name();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("transactionUIEvent = ");
                sb2.append(name3);
                sb2.append(" not mapped");
                com.zettle.sdk.core.log.LogKt.warn$default(transactionInternalImpl2, sb2.toString(), null, 2, null);
            }

            @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionEvents
            public final void onTransactionResult(com.zettle.sdk.feature.taptopay.core.transaction.TransactionResultEvent event, byte[] onlineResponse) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
                com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl transactionInternalImpl = com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this;
                java.lang.String name2 = event.name();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("onTransactionResult(");
                sb.append(name2);
                sb.append(")");
                com.zettle.sdk.core.log.LogKt.debug(transactionInternalImpl, sb.toString());
                switch (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl$transactionListener$1.WhenMappings.$EnumSwitchMapping$2[event.ordinal()]) {
                    case 1:
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionSelectNextInterface.INSTANCE);
                        break;
                    case 2:
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionCardError.INSTANCE);
                        break;
                    case 3:
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionTryAgain.INSTANCE);
                        break;
                    case 4:
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionFailed.INSTANCE);
                        break;
                    case 5:
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionDeclined.INSTANCE);
                        break;
                    case 6:
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionEndApplicationError.INSTANCE);
                        break;
                    case 7:
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionFailedAllowFallback.INSTANCE);
                        break;
                    case 8:
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionRequireCDCVM.INSTANCE);
                        break;
                    case 9:
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionNoAppError.INSTANCE);
                        break;
                    default:
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl transactionInternalImpl2 = com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this;
                        java.lang.String name3 = event.name();
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("onTransactionResult = ");
                        sb2.append(name3);
                        sb2.append(" not mapped");
                        com.zettle.sdk.core.log.LogKt.warn$default(transactionInternalImpl2, sb2.toString(), null, 2, null);
                        break;
                }
            }

            @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionEvents
            public final byte[] onTransactionRequestOnlineAuthentication(byte[] bytes, java.util.Map<java.lang.String, byte[]> map) {
                com.zettle.sdk.feature.taptopay.core.transaction.usecase.RequestOnlineAuthUseCase requestOnlineAuthUseCase2;
                requestOnlineAuthUseCase2 = com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.getValidOutputFormatsForInputhNQ4ISI;
                final com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl transactionInternalImpl = com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this;
                requestOnlineAuthUseCase2.invoke(bytes, map, (kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.RequestOnlineAuthUseCase.Result, kotlin.Unit>) new kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.transaction.usecase.RequestOnlineAuthUseCase.Result, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl$transactionListener$1$onTransactionRequestOnlineAuthentication$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.feature.taptopay.core.transaction.usecase.RequestOnlineAuthUseCase.Result result) {
                        getHighSpeedVideoFpsRangesFor(result);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void getHighSpeedVideoFpsRangesFor(com.zettle.sdk.feature.taptopay.core.transaction.usecase.RequestOnlineAuthUseCase.Result result) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                        if (result instanceof com.zettle.sdk.feature.taptopay.core.transaction.usecase.RequestOnlineAuthUseCase.Result.Failed) {
                            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel(((com.zettle.sdk.feature.taptopay.core.transaction.usecase.RequestOnlineAuthUseCase.Result.Failed) result).getReason(), null, 2, null));
                        } else if (result instanceof com.zettle.sdk.feature.taptopay.core.transaction.usecase.RequestOnlineAuthUseCase.Result.RequestOnlineAuth) {
                            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionRequestOnlineAuthentication(((com.zettle.sdk.feature.taptopay.core.transaction.usecase.RequestOnlineAuthUseCase.Result.RequestOnlineAuth) result).getOnlineHostRequestMessage()));
                        }
                    }

                    {
                        super(1);
                    }
                });
                return null;
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;
                public static final /* synthetic */ int[] $EnumSwitchMapping$1;
                public static final /* synthetic */ int[] $EnumSwitchMapping$2;

                static {
                    int[] iArr = new int[com.zettle.sdk.feature.taptopay.core.transaction.CardEvent.values().length];
                    try {
                        iArr[com.zettle.sdk.feature.taptopay.core.transaction.CardEvent.UnknownCardEvent.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    try {
                        iArr[com.zettle.sdk.feature.taptopay.core.transaction.CardEvent.NfcUnexpectedError.ordinal()] = 2;
                    } catch (java.lang.NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[com.zettle.sdk.feature.taptopay.core.transaction.CardEvent.CardTapped.ordinal()] = 3;
                    } catch (java.lang.NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[com.zettle.sdk.feature.taptopay.core.transaction.CardEvent.CardReadError.ordinal()] = 4;
                    } catch (java.lang.NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[com.zettle.sdk.feature.taptopay.core.transaction.CardEvent.CardReadTimeout.ordinal()] = 5;
                    } catch (java.lang.NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[com.zettle.sdk.feature.taptopay.core.transaction.CardEvent.CardReadDuplicate.ordinal()] = 6;
                    } catch (java.lang.NoSuchFieldError unused6) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                    int[] iArr2 = new int[com.zettle.sdk.feature.taptopay.core.transaction.TransactionUIEvent.values().length];
                    try {
                        iArr2[com.zettle.sdk.feature.taptopay.core.transaction.TransactionUIEvent.UnknownEvent.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused7) {
                    }
                    try {
                        iArr2[com.zettle.sdk.feature.taptopay.core.transaction.TransactionUIEvent.EventCardReadOk.ordinal()] = 2;
                    } catch (java.lang.NoSuchFieldError unused8) {
                    }
                    $EnumSwitchMapping$1 = iArr2;
                    int[] iArr3 = new int[com.zettle.sdk.feature.taptopay.core.transaction.TransactionResultEvent.values().length];
                    try {
                        iArr3[com.zettle.sdk.feature.taptopay.core.transaction.TransactionResultEvent.TransactionSelectNextInterface.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused9) {
                    }
                    try {
                        iArr3[com.zettle.sdk.feature.taptopay.core.transaction.TransactionResultEvent.TransactionCardError.ordinal()] = 2;
                    } catch (java.lang.NoSuchFieldError unused10) {
                    }
                    try {
                        iArr3[com.zettle.sdk.feature.taptopay.core.transaction.TransactionResultEvent.TransactionTryAgain.ordinal()] = 3;
                    } catch (java.lang.NoSuchFieldError unused11) {
                    }
                    try {
                        iArr3[com.zettle.sdk.feature.taptopay.core.transaction.TransactionResultEvent.TransactionFailed.ordinal()] = 4;
                    } catch (java.lang.NoSuchFieldError unused12) {
                    }
                    try {
                        iArr3[com.zettle.sdk.feature.taptopay.core.transaction.TransactionResultEvent.TransactionDeclined.ordinal()] = 5;
                    } catch (java.lang.NoSuchFieldError unused13) {
                    }
                    try {
                        iArr3[com.zettle.sdk.feature.taptopay.core.transaction.TransactionResultEvent.TransactionEndApplicationError.ordinal()] = 6;
                    } catch (java.lang.NoSuchFieldError unused14) {
                    }
                    try {
                        iArr3[com.zettle.sdk.feature.taptopay.core.transaction.TransactionResultEvent.TransactionFailedAllowFallback.ordinal()] = 7;
                    } catch (java.lang.NoSuchFieldError unused15) {
                    }
                    try {
                        iArr3[com.zettle.sdk.feature.taptopay.core.transaction.TransactionResultEvent.TransactionRequireCDCVM.ordinal()] = 8;
                    } catch (java.lang.NoSuchFieldError unused16) {
                    }
                    try {
                        iArr3[com.zettle.sdk.feature.taptopay.core.transaction.TransactionResultEvent.TransactionNoAppError.ordinal()] = 9;
                    } catch (java.lang.NoSuchFieldError unused17) {
                    }
                    $EnumSwitchMapping$2 = iArr3;
                }
            }
        };
    }

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
    }

    public /* synthetic */ TransactionInternalImpl(com.zettle.sdk.feature.taptopay.core.attestation.Attestation attestation, com.zettle.sdk.feature.taptopay.core.transaction.analytics.TransactionAnalytics transactionAnalytics, com.zettle.sdk.feature.taptopay.core.transaction.analytics.TransactionHerdAnalytics transactionHerdAnalytics, com.zettle.sdk.commons.thread.EventsLoop eventsLoop, com.zettle.sdk.core.network.NetworkModule networkModule, com.zettle.sdk.core.os.LocationInfo locationInfo, com.zettle.sdk.feature.taptopay.core.transaction.usecase.StartTransactionUseCase startTransactionUseCase, com.zettle.sdk.feature.taptopay.core.transaction.usecase.EnterPinUseCase enterPinUseCase, com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecase cvmLimitsUsecase, com.zettle.sdk.feature.taptopay.core.transaction.usecase.CancelTransactionUseCase cancelTransactionUseCase, com.zettle.sdk.feature.taptopay.core.transaction.usecase.RequestOnlineAuthUseCase requestOnlineAuthUseCase, com.zettle.sdk.feature.taptopay.core.transaction.usecase.TransactionRequestUseCase transactionRequestUseCase, com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCase recoverTransactionRequestUseCase, com.zettle.sdk.feature.taptopay.core.transaction.usecase.FinalizeRequestUseCase finalizeRequestUseCase, com.zettle.sdk.feature.taptopay.core.transaction.usecase.AbortRequestUseCase abortRequestUseCase, com.zettle.sdk.feature.taptopay.core.transaction.usecase.PermissiveSignatureUseCase permissiveSignatureUseCase, com.zettle.sdk.feature.taptopay.core.transaction.usecase.UploadSignatureUseCase uploadSignatureUseCase, com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUsecase configurationInitUsecase, com.zettle.sdk.feature.taptopay.core.transaction.usecase.ReinitialiseUseCase reinitialiseUseCase, kotlin.jvm.functions.Function0 function0, com.zettle.sdk.feature.taptopay.core.Translations translations, com.zettle.sdk.core.auth.merchant.MerchantConfig merchantConfig, kotlin.jvm.functions.Function1 function1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(attestation, transactionAnalytics, transactionHerdAnalytics, eventsLoop, networkModule, locationInfo, startTransactionUseCase, enterPinUseCase, cvmLimitsUsecase, cancelTransactionUseCase, requestOnlineAuthUseCase, transactionRequestUseCase, recoverTransactionRequestUseCase, finalizeRequestUseCase, abortRequestUseCase, permissiveSignatureUseCase, uploadSignatureUseCase, configurationInitUsecase, reinitialiseUseCase, function0, translations, merchantConfig, (i & 4194304) != 0 ? new kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function2<? super com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State, ? super com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State, ? extends kotlin.Unit>, com.zettle.sdk.commons.state.MutableState<com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State>>() { // from class: com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final com.zettle.sdk.commons.state.MutableState<com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State> invoke(kotlin.jvm.functions.Function2<? super com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State, ? super com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State, kotlin.Unit> function2) {
                return com.zettle.sdk.commons.state.MutableState.INSTANCE.create(com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Initial.INSTANCE, function2);
            }
        } : function1);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal
    public final com.zettle.sdk.commons.state.MutableState<com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State> getState() {
        return this.state;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal
    public final void startTransaction(java.lang.ref.WeakReference<android.app.Activity> weakReferenceActivity, long amount, long gratuity, com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference reference, com.zettle.sdk.feature.taptopay.core.transaction.models.PaymentProperties paymentProperties) {
        com.zettle.sdk.core.user.TransactionConfigEntry transactionConfigEntry;
        java.lang.Long maxTransactionAmount;
        com.zettle.sdk.core.user.TransactionConfigEntry transactionConfigEntry2;
        java.lang.Long minTransactionAmount;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weakReferenceActivity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentProperties, "");
        java.util.UUID createUUID1 = com.zettle.sdk.commons.UUIDFactory.createUUID1();
        com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference prepareMagnesClientId$core_publicRelease = reference.prepareMagnesClientId$core_publicRelease(this.getInputSizeshNQ4ISI.invoke());
        java.lang.Object mo23163getUserConfigd1pmJ48 = this.getOutputStallDurationlomOqCM.mo23163getUserConfigd1pmJ48();
        if (kotlin.Result.m23441isFailureimpl(mo23163getUserConfigd1pmJ48)) {
            mo23163getUserConfigd1pmJ48 = null;
        }
        com.zettle.sdk.core.user.userconfig.UserConfig userConfig = (com.zettle.sdk.core.user.userconfig.UserConfig) mo23163getUserConfigd1pmJ48;
        if (userConfig != null) {
            int i = com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.WhenMappings.$EnumSwitchMapping$0[com.zettle.sdk.feature.taptopay.core.transaction.GratuityAmountValidationHelperKt.getGratuityValidationResult(amount, gratuity, new com.zettle.sdk.core.payment.GratuityPercentageConfiguration(com.zettle.sdk.core.user.userconfig.UserConfigKt.gratuityMaxPercentage(userConfig))).ordinal()];
            if (i == 1) {
                action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel(com.zettle.sdk.feature.taptopay.core.FailureReason.GratuityAmountTooHigh.INSTANCE, null, 2, null));
                return;
            }
            if (i == 2) {
                action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel(com.zettle.sdk.feature.taptopay.core.FailureReason.GratuityAmountTooLow.INSTANCE, null, 2, null));
                return;
            }
            if (i != 3) {
                return;
            }
            java.util.Currency currency = java.util.Currency.getInstance(userConfig.getCurrency().name());
            java.lang.String publicName = com.zettle.sdk.core.user.userconfig.UserConfigKt.publicName(userConfig);
            java.util.Map<java.lang.String, com.zettle.sdk.core.user.TransactionConfigEntry> map = userConfig.getConfigByCurrency().get(userConfig.getCurrency());
            long longValue = (map == null || (transactionConfigEntry2 = map.get("CONTACTLESS_EMV")) == null || (minTransactionAmount = transactionConfigEntry2.getMinTransactionAmount()) == null) ? 0L : minTransactionAmount.longValue();
            java.util.Map<java.lang.String, com.zettle.sdk.core.user.TransactionConfigEntry> map2 = userConfig.getConfigByCurrency().get(userConfig.getCurrency());
            long longValue2 = (map2 == null || (transactionConfigEntry = map2.get("CONTACTLESS_EMV")) == null || (maxTransactionAmount = transactionConfigEntry.getMaxTransactionAmount()) == null) ? 0L : maxTransactionAmount.longValue();
            com.zettle.sdk.feature.taptopay.core.transaction.models.MerchantInfo merchantInfo = new com.zettle.sdk.feature.taptopay.core.transaction.models.MerchantInfo(publicName);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(currency, "");
            com.zettle.sdk.feature.taptopay.core.transaction.models.PaymentConfiguration paymentConfiguration = new com.zettle.sdk.feature.taptopay.core.transaction.models.PaymentConfiguration(merchantInfo, currency, userConfig.getCurrency(), com.zettle.sdk.core.user.userconfig.UserConfigKt.countryId(userConfig), longValue, longValue2, true, null, 128, null);
            com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo.Companion companion = com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createUUID1, "");
            action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CheckAttestation(weakReferenceActivity, companion.invoke$core_publicRelease(createUUID1, amount + gratuity, gratuity, prepareMagnesClientId$core_publicRelease, paymentConfiguration, paymentProperties), com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig.INSTANCE.invoke$core_publicRelease("it", com.zettle.sdk.feature.taptopay.core.configuration.TapToPayNetworkKt.createTapToPayNetworkClient(this.getOutputMinFrameDurationlomOqCM, com.zettle.sdk.commons.network.Service.CardPayment, com.zettle.sdk.commons.network.Scope.Payment))));
            return;
        }
        action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel(com.zettle.sdk.feature.taptopay.core.FailureReason.AuthRequired.INSTANCE, null, 2, null));
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal
    public final void uploadSignature(com.zettle.sdk.feature.taptopay.core.transaction.models.Signature signature) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signature, "");
        action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.UploadSignature(signature));
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal
    public final void reset() {
        action$core_publicRelease(com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Stop.INSTANCE);
    }

    public final void action$core_publicRelease(final com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        this.getInputFormats.post(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl$action$1
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                Camera2StreamConfigurationMap();
                return kotlin.Unit.INSTANCE;
            }

            public final void Camera2StreamConfigurationMap() {
                com.zettle.sdk.commons.state.MutableState<com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State> state = com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.getState();
                final com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl transactionInternalImpl = com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this;
                final com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action action2 = action;
                state.update(new kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State, com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State>() { // from class: com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl$action$1.1
                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                    public final com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State invoke(com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State state2) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state2, "");
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State access$reduce = com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.access$reduce(com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this, state2, action2);
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl transactionInternalImpl2 = com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this;
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action action3 = action2;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Action: ");
                        sb.append(action3);
                        sb.append(" State: ");
                        sb.append(state2);
                        sb.append(" -> ");
                        sb.append(access$reduce);
                        sb.append(" ");
                        com.zettle.sdk.core.log.LogKt.warn$default(transactionInternalImpl2, sb.toString(), null, 2, null);
                        return access$reduce;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                });
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    private static boolean Camera2StreamConfigurationMap(com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed failed) {
        com.zettle.sdk.feature.taptopay.core.FailureReason reason = failed.getReason();
        if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.PinEntranceCanceled) {
            com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig config = failed.getConfig();
            return kotlin.jvm.internal.Intrinsics.areEqual(config != null ? config.getGetHighSpeedVideoFpsRanges() : null, "op");
        }
        if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.SignatureCanceled) {
            return true;
        }
        return reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.BackendError ? ((com.zettle.sdk.feature.taptopay.core.FailureReason.BackendError) failed.getReason()).getError() == null : (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.CancelledByNetworkTimeout) || (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.NetworkError);
    }

    public static final /* synthetic */ void access$handleTransactionPayload(com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl transactionInternalImpl, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload transactionApprovedPayload) {
        if (transactionApprovedPayload.getSignatureRequired()) {
            if (transactionApprovedPayload.getSignaturePermissive()) {
                transactionInternalImpl.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.PermissiveSignature(transactionApprovedPayload));
                return;
            } else {
                transactionInternalImpl.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.RequestSignature(new com.zettle.sdk.feature.taptopay.core.transaction.models.CardInfo(transactionApprovedPayload.getCardHolderName(), transactionApprovedPayload.getCardLastDigits(), transactionApprovedPayload.getCardType()), transactionApprovedPayload));
                return;
            }
        }
        transactionInternalImpl.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Approved(com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionResultKt.toResult(transactionApprovedPayload)));
    }

    public static final /* synthetic */ void access$onMutate(final com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl transactionInternalImpl, com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State state, com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State state2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(state);
        sb.append(" -> ");
        sb.append(state2);
        com.zettle.sdk.core.log.LogKt.warn$default(transactionInternalImpl, sb.toString(), null, 2, null);
        transactionInternalImpl.isOutputSupportedFor.track(state, state2);
        transactionInternalImpl.unwrapAs.track(state, state2);
        if (state2 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Initial) {
            if (state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Reinitialising) {
                com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Reinitialising reinitialising = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Reinitialising) state;
                transactionInternalImpl.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CheckAttestation(reinitialising.getWeakReferenceActivity(), reinitialising.getInfo(), reinitialising.getConfig()));
            } else {
                transactionInternalImpl.getHighSpeedVideoFpsRanges.action(com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.Stop.INSTANCE);
            }
        }
        if ((state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Initial) && (state2 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InitialisingTransaction)) {
            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InitialisingTransaction initialisingTransaction = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InitialisingTransaction) state2;
            android.app.Activity activity = initialisingTransaction.getWeakReferenceActivity().get();
            if (activity != null) {
                transactionInternalImpl.getHighSpeedVideoFpsRanges.action(new com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.Attest.DoAttestation(activity, initialisingTransaction.getInfo()));
            } else {
                transactionInternalImpl.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel(com.zettle.sdk.feature.taptopay.core.FailureReason.InvalidArguments.INSTANCE, null, 2, null));
            }
        }
        boolean z = state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InitialisingTransaction;
        if (z && (state2 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Reinitialising)) {
            final com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Reinitialising reinitialising2 = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Reinitialising) state2;
            java.lang.Object mo23163getUserConfigd1pmJ48 = transactionInternalImpl.getOutputStallDurationlomOqCM.mo23163getUserConfigd1pmJ48();
            if (kotlin.Result.m23441isFailureimpl(mo23163getUserConfigd1pmJ48)) {
                mo23163getUserConfigd1pmJ48 = null;
            }
            com.zettle.sdk.core.user.userconfig.UserConfig userConfig = (com.zettle.sdk.core.user.userconfig.UserConfig) mo23163getUserConfigd1pmJ48;
            if (userConfig != null) {
                transactionInternalImpl.getHighResolutionOutputSizeshNQ4ISI.invoke(com.zettle.sdk.core.user.userconfig.UserConfigKt.principalId(userConfig), (kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUsecase.Result, kotlin.Unit>) new kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUsecase.Result, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl$fetchConfigurations$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUsecase.Result result) {
                        getHighSpeedVideoFpsRangesFor(result);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void getHighSpeedVideoFpsRangesFor(com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUsecase.Result result) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                        if (result instanceof com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUsecase.Result.Failed) {
                            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel(com.zettle.sdk.feature.taptopay.core.FailureReason.FailedToReinitialize.INSTANCE, null, 2, null));
                        } else if (result instanceof com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUsecase.Result.Success) {
                            r0.getOutputStallDuration.invoke(((com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUsecase.Result.Success) result).getConfigurationInit(), (kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.ReinitialiseUseCase.Result, kotlin.Unit>) new kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.transaction.usecase.ReinitialiseUseCase.Result, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl$reinitializeTapToPay$1
                                @Override // kotlin.jvm.functions.Function1
                                public final /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.feature.taptopay.core.transaction.usecase.ReinitialiseUseCase.Result result2) {
                                    getHighSpeedVideoFpsRanges(result2);
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void getHighSpeedVideoFpsRanges(com.zettle.sdk.feature.taptopay.core.transaction.usecase.ReinitialiseUseCase.Result result2) {
                                    java.lang.Object mo23163getUserConfigd1pmJ482;
                                    com.zettle.sdk.feature.taptopay.core.attestation.Attestation attestation;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result2, "");
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(result2, com.zettle.sdk.feature.taptopay.core.transaction.usecase.ReinitialiseUseCase.Result.Failed.INSTANCE)) {
                                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel(com.zettle.sdk.feature.taptopay.core.FailureReason.FailedToReinitialize.INSTANCE, null, 2, null));
                                        return;
                                    }
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(result2, com.zettle.sdk.feature.taptopay.core.transaction.usecase.ReinitialiseUseCase.Result.Success.INSTANCE)) {
                                        mo23163getUserConfigd1pmJ482 = com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.getOutputStallDurationlomOqCM.mo23163getUserConfigd1pmJ48();
                                        if (kotlin.Result.m23441isFailureimpl(mo23163getUserConfigd1pmJ482)) {
                                            mo23163getUserConfigd1pmJ482 = null;
                                        }
                                        com.zettle.sdk.core.user.userconfig.UserConfig userConfig2 = (com.zettle.sdk.core.user.userconfig.UserConfig) mo23163getUserConfigd1pmJ482;
                                        if (userConfig2 != null) {
                                            android.app.Activity activity2 = r2.getWeakReferenceActivity().get();
                                            android.content.Context applicationContext = activity2 != null ? activity2.getApplicationContext() : null;
                                            if (applicationContext != null) {
                                                attestation = com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.getHighSpeedVideoFpsRanges;
                                                attestation.action(new com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.LogIn(applicationContext, com.zettle.sdk.core.user.userconfig.UserConfigKt.principalId(userConfig2)));
                                                return;
                                            } else {
                                                com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel(com.zettle.sdk.feature.taptopay.core.FailureReason.InvalidArguments.INSTANCE, null, 2, null));
                                                return;
                                            }
                                        }
                                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel(com.zettle.sdk.feature.taptopay.core.FailureReason.AuthRequired.INSTANCE, null, 2, null));
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }
                            });
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                });
            } else {
                transactionInternalImpl.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel(com.zettle.sdk.feature.taptopay.core.FailureReason.FailedToReinitialize.INSTANCE, null, 2, null));
            }
        }
        if ((z || (state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Reinitialising)) && (state2 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.FetchCvmLimits)) {
            final com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.FetchCvmLimits fetchCvmLimits = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.FetchCvmLimits) state2;
            java.lang.Object mo23163getUserConfigd1pmJ482 = transactionInternalImpl.getOutputStallDurationlomOqCM.mo23163getUserConfigd1pmJ48();
            if (kotlin.Result.m23441isFailureimpl(mo23163getUserConfigd1pmJ482)) {
                mo23163getUserConfigd1pmJ482 = null;
            }
            com.zettle.sdk.core.user.userconfig.UserConfig userConfig2 = (com.zettle.sdk.core.user.userconfig.UserConfig) mo23163getUserConfigd1pmJ482;
            if (userConfig2 != null) {
                transactionInternalImpl.getHighSpeedVideoFpsRangesFor.invoke(com.zettle.sdk.core.user.userconfig.UserConfigKt.principalId(userConfig2), (kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecase.Result, kotlin.Unit>) new kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecase.Result, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl$fetchCvmLimit$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecase.Result result) {
                        getHighSpeedVideoFpsRanges(result);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void getHighSpeedVideoFpsRanges(com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecase.Result result) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl transactionInternalImpl2 = com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this;
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("fetchCvmLimit::cvmLimitsUsecaseResult(");
                        sb2.append(result);
                        sb2.append(")");
                        com.zettle.sdk.core.log.LogKt.warn$default(transactionInternalImpl2, sb2.toString(), null, 2, null);
                        if (result instanceof com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecase.Result.Failed) {
                            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel(((com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecase.Result.Failed) result).getReason(), null, 2, null));
                        } else if (result instanceof com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecase.Result.Success) {
                            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.PresentCard(fetchCvmLimits.getWeakReferenceActivity(), fetchCvmLimits.getInfo().mutate$core_publicRelease(((com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecase.Result.Success) result).getCvmLimits()), fetchCvmLimits.getConfig()));
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                });
            } else {
                transactionInternalImpl.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel(com.zettle.sdk.feature.taptopay.core.FailureReason.AuthRequired.INSTANCE, null, 2, null));
            }
        }
        if (state2 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.PresentCard) {
            transactionInternalImpl.getHighSpeedVideoSizes.invoke();
            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.PresentCard presentCard = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.PresentCard) state2;
            transactionInternalImpl.isOutputSupportedForhNQ4ISI.invoke(presentCard.getWeakReferenceActivity(), presentCard.getInfo(), transactionInternalImpl.toString, (kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.StartTransactionUseCase.Result, kotlin.Unit>) new kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.transaction.usecase.StartTransactionUseCase.Result, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl$triggerTransaction$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.feature.taptopay.core.transaction.usecase.StartTransactionUseCase.Result result) {
                    getHighSpeedVideoFpsRangesFor(result);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoFpsRangesFor(com.zettle.sdk.feature.taptopay.core.transaction.usecase.StartTransactionUseCase.Result result) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                    if (result instanceof com.zettle.sdk.feature.taptopay.core.transaction.usecase.StartTransactionUseCase.Result.NoActivityFound) {
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel(com.zettle.sdk.feature.taptopay.core.FailureReason.InvalidArguments.INSTANCE, null, 2, null));
                    } else if (result instanceof com.zettle.sdk.feature.taptopay.core.transaction.usecase.StartTransactionUseCase.Result.NoCvmLimits) {
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel(com.zettle.sdk.feature.taptopay.core.FailureReason.TechnicalError.INSTANCE, null, 2, null));
                    } else if (result instanceof com.zettle.sdk.feature.taptopay.core.transaction.usecase.StartTransactionUseCase.Result.NotSupportedCountry) {
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel(com.zettle.sdk.feature.taptopay.core.FailureReason.NotSupportedCountry.INSTANCE, null, 2, null));
                    }
                }

                {
                    super(1);
                }
            });
        }
        boolean z2 = state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.PresentCard;
        if ((z2 || (state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.ReadingCard) || (state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.PINEntrance)) && (state2 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed) && com.zettle.sdk.feature.taptopay.core.FailureReasonKt.isCancelledReason(((com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed) state2).getReason())) {
            transactionInternalImpl.getHighSpeedVideoSizes.invoke();
        }
        boolean z3 = state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.CardReadOk;
        if ((z3 || (state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.ReadingCard) || z2) && (state2 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Retry)) {
            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Retry retry = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Retry) state2;
            transactionInternalImpl.getHighSpeedVideoSizes.invoke();
            transactionInternalImpl.isOutputSupportedForhNQ4ISI.invoke(retry.getWeakReferenceActivity(), retry.getInfo(), transactionInternalImpl.toString, (kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.StartTransactionUseCase.Result, kotlin.Unit>) new kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.transaction.usecase.StartTransactionUseCase.Result, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl$triggerTransaction$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.feature.taptopay.core.transaction.usecase.StartTransactionUseCase.Result result) {
                    getHighSpeedVideoFpsRangesFor(result);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoFpsRangesFor(com.zettle.sdk.feature.taptopay.core.transaction.usecase.StartTransactionUseCase.Result result) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                    if (result instanceof com.zettle.sdk.feature.taptopay.core.transaction.usecase.StartTransactionUseCase.Result.NoActivityFound) {
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel(com.zettle.sdk.feature.taptopay.core.FailureReason.InvalidArguments.INSTANCE, null, 2, null));
                    } else if (result instanceof com.zettle.sdk.feature.taptopay.core.transaction.usecase.StartTransactionUseCase.Result.NoCvmLimits) {
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel(com.zettle.sdk.feature.taptopay.core.FailureReason.TechnicalError.INSTANCE, null, 2, null));
                    } else if (result instanceof com.zettle.sdk.feature.taptopay.core.transaction.usecase.StartTransactionUseCase.Result.NotSupportedCountry) {
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel(com.zettle.sdk.feature.taptopay.core.FailureReason.NotSupportedCountry.INSTANCE, null, 2, null));
                    }
                }

                {
                    super(1);
                }
            });
        }
        if ((state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InTransaction) && (state2 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Authorizing)) {
            final com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Authorizing authorizing = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Authorizing) state2;
            transactionInternalImpl.coroutineBoundary.invoke(authorizing.getConfig().getGetHighSpeedVideoFpsRangesFor(), authorizing.getInfo(), authorizing.getConfig(), authorizing.getOnlineHostRequestMessage(), authorizing.getPinBlock(), transactionInternalImpl.getOutputMinFrameDuration, (kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.TransactionRequestUseCase.Result, kotlin.Unit>) new kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.transaction.usecase.TransactionRequestUseCase.Result, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl$processPayment$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.feature.taptopay.core.transaction.usecase.TransactionRequestUseCase.Result result) {
                    getHighSpeedVideoFpsRanges(result);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoFpsRanges(com.zettle.sdk.feature.taptopay.core.transaction.usecase.TransactionRequestUseCase.Result result) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                    if (result instanceof com.zettle.sdk.feature.taptopay.core.transaction.usecase.TransactionRequestUseCase.Result.Failed) {
                        com.zettle.sdk.feature.taptopay.core.transaction.usecase.TransactionRequestUseCase.Result.Failed failed = (com.zettle.sdk.feature.taptopay.core.transaction.usecase.TransactionRequestUseCase.Result.Failed) result;
                        if (failed.getReason() instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.NetworkError) {
                            com.zettle.sdk.core.log.LogKt.log(com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this, "Tx failed start recover tx = ".concat(java.lang.String.valueOf(authorizing.getInfo().getGetHighSpeedVideoSizes())));
                            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Recover(authorizing.getInfo(), authorizing.getConfig()));
                            return;
                        } else {
                            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Failed(failed.getLocalUUID(), failed.getReason()));
                            return;
                        }
                    }
                    if (result instanceof com.zettle.sdk.feature.taptopay.core.transaction.usecase.TransactionRequestUseCase.Result.Success) {
                        com.zettle.sdk.feature.taptopay.core.transaction.usecase.TransactionRequestUseCase.Result.Success success = (com.zettle.sdk.feature.taptopay.core.transaction.usecase.TransactionRequestUseCase.Result.Success) result;
                        com.zettle.sdk.feature.taptopay.core.transaction.models.Payload payload = success.getPayload();
                        if (payload instanceof com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionAppCommandPayload) {
                            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.AppCommand((com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionAppCommandPayload) success.getPayload()));
                            return;
                        }
                        if (payload instanceof com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload) {
                            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.access$handleTransactionPayload(com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this, (com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload) success.getPayload());
                            return;
                        }
                        if (payload instanceof com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionDeclinedPayload) {
                            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Declined((com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionDeclinedPayload) success.getPayload()));
                            return;
                        }
                        if (payload instanceof com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionPayload) {
                            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl transactionInternalImpl2 = com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this;
                            com.zettle.sdk.feature.taptopay.core.transaction.models.Payload payload2 = success.getPayload();
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            sb2.append(payload2);
                            sb2.append(" not handled");
                            com.zettle.sdk.core.log.LogKt.warn$default(transactionInternalImpl2, sb2.toString(), null, 2, null);
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
        }
        boolean z4 = state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Authorizing;
        if (z4 && (state2 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Recover)) {
            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Recover recover = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Recover) state2;
            transactionInternalImpl.getOutputSizeshNQ4ISI.invoke(recover.getConfig().getGetHighSpeedVideoFpsRangesFor(), recover.getInfo(), (kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCase.Result, kotlin.Unit>) new kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCase.Result, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl$recoverPayment$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCase.Result result) {
                    getHighSpeedVideoFpsRanges(result);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoFpsRanges(com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCase.Result result) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                    if (result instanceof com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCase.Result.BackendIssue) {
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Failed(((com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCase.Result.BackendIssue) result).getLocalUUID(), new com.zettle.sdk.feature.taptopay.core.FailureReason.BackendError(null)));
                        return;
                    }
                    if (result instanceof com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCase.Result.Failed) {
                        com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCase.Result.Failed failed = (com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCase.Result.Failed) result;
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Failed(failed.getLocalUUID(), failed.getReason()));
                        return;
                    }
                    if (result instanceof com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCase.Result.Success) {
                        com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCase.Result.Success success = (com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCase.Result.Success) result;
                        com.zettle.sdk.feature.taptopay.core.transaction.models.Payload payload = success.getPayload();
                        if (payload instanceof com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionAppCommandPayload) {
                            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.AppCommand((com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionAppCommandPayload) success.getPayload()));
                            return;
                        }
                        if (payload instanceof com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload) {
                            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.access$handleTransactionPayload(com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this, (com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload) success.getPayload());
                            return;
                        }
                        if (payload instanceof com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionDeclinedPayload) {
                            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Declined((com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionDeclinedPayload) success.getPayload()));
                            return;
                        }
                        if (payload instanceof com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionPayload) {
                            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl transactionInternalImpl2 = com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this;
                            com.zettle.sdk.feature.taptopay.core.transaction.models.Payload payload2 = success.getPayload();
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            sb2.append(payload2);
                            sb2.append(" not handled");
                            com.zettle.sdk.core.log.LogKt.warn$default(transactionInternalImpl2, sb2.toString(), null, 2, null);
                        }
                    }
                }

                {
                    super(1);
                }
            });
        }
        if ((z3 || z4 || (state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Recover)) && (state2 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.PINEntrance)) {
            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.PINEntrance pINEntrance = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.PINEntrance) state2;
            transactionInternalImpl.getOutputFormats.invoke(pINEntrance.getWeakReferenceActivity(), pINEntrance.getInfo(), pINEntrance.getOnlineHostRequestMessage(), (kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.EnterPinUseCase.Result, kotlin.Unit>) new kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.transaction.usecase.EnterPinUseCase.Result, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl$onMutate$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.feature.taptopay.core.transaction.usecase.EnterPinUseCase.Result result) {
                    getHighSpeedVideoFpsRanges(result);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoFpsRanges(com.zettle.sdk.feature.taptopay.core.transaction.usecase.EnterPinUseCase.Result result) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                    if (result instanceof com.zettle.sdk.feature.taptopay.core.transaction.usecase.EnterPinUseCase.Result.Canceled) {
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.PINResultAction.Cancelled.INSTANCE);
                        return;
                    }
                    if (result instanceof com.zettle.sdk.feature.taptopay.core.transaction.usecase.EnterPinUseCase.Result.Completed) {
                        com.zettle.sdk.feature.taptopay.core.transaction.usecase.EnterPinUseCase.Result.Completed completed = (com.zettle.sdk.feature.taptopay.core.transaction.usecase.EnterPinUseCase.Result.Completed) result;
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.PINResultAction.Completed(completed.getKsn(), completed.getPinBlock()));
                    } else if (result instanceof com.zettle.sdk.feature.taptopay.core.transaction.usecase.EnterPinUseCase.Result.NoActivityFound) {
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel(com.zettle.sdk.feature.taptopay.core.FailureReason.InvalidArguments.INSTANCE, null, 2, null));
                    }
                }

                {
                    super(1);
                }
            });
        }
        if (z3 && (state2 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed)) {
            transactionInternalImpl.getHighSpeedVideoSizes.invoke();
        }
        if ((z4 || (state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.PermissiveSignature) || (state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.UploadingSignature) || (state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Recover)) && (state2 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Approved)) {
            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Approved approved = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Approved) state2;
            transactionInternalImpl.getHighSpeedVideoSizesFor.invoke(approved.getConfig().getGetHighSpeedVideoFpsRangesFor(), transactionInternalImpl.getOutputMinFrameDuration, approved.getInfo(), (kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.FinalizeRequestUseCase.Result, kotlin.Unit>) new kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.transaction.usecase.FinalizeRequestUseCase.Result, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl$onMutate$2
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.feature.taptopay.core.transaction.usecase.FinalizeRequestUseCase.Result result) {
                    getHighResolutionOutputSizeshNQ4ISI(result);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighResolutionOutputSizeshNQ4ISI(com.zettle.sdk.feature.taptopay.core.transaction.usecase.FinalizeRequestUseCase.Result result) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                    if (result instanceof com.zettle.sdk.feature.taptopay.core.transaction.usecase.FinalizeRequestUseCase.Result.Success) {
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Finalized.INSTANCE);
                        return;
                    }
                    com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl transactionInternalImpl2 = com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("finalizeRequestUseCase ");
                    sb2.append(result);
                    sb2.append(" not handled");
                    com.zettle.sdk.core.log.LogKt.debug(transactionInternalImpl2, sb2.toString());
                }

                {
                    super(1);
                }
            });
        }
        if (z4 && (state2 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.PermissiveSignature)) {
            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.PermissiveSignature permissiveSignature = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.PermissiveSignature) state2;
            transactionInternalImpl.getOutputSizes.invoke(permissiveSignature.getConfig().getGetHighSpeedVideoFpsRangesFor(), transactionInternalImpl.getOutputMinFrameDuration, permissiveSignature.getInfo(), permissiveSignature.getApprovedPayload(), (kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.PermissiveSignatureUseCase.Result, kotlin.Unit>) new kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.transaction.usecase.PermissiveSignatureUseCase.Result, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl$onMutate$3
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.feature.taptopay.core.transaction.usecase.PermissiveSignatureUseCase.Result result) {
                    getHighSpeedVideoFpsRanges(result);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoFpsRanges(com.zettle.sdk.feature.taptopay.core.transaction.usecase.PermissiveSignatureUseCase.Result result) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                    if (result instanceof com.zettle.sdk.feature.taptopay.core.transaction.usecase.PermissiveSignatureUseCase.Result.Failed) {
                        com.zettle.sdk.feature.taptopay.core.transaction.usecase.PermissiveSignatureUseCase.Result.Failed failed = (com.zettle.sdk.feature.taptopay.core.transaction.usecase.PermissiveSignatureUseCase.Result.Failed) result;
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Failed(failed.getLocalUUID(), failed.getReason()));
                        return;
                    }
                    if (result instanceof com.zettle.sdk.feature.taptopay.core.transaction.usecase.PermissiveSignatureUseCase.Result.Success) {
                        com.zettle.sdk.feature.taptopay.core.transaction.usecase.PermissiveSignatureUseCase.Result.Success success = (com.zettle.sdk.feature.taptopay.core.transaction.usecase.PermissiveSignatureUseCase.Result.Success) result;
                        com.zettle.sdk.feature.taptopay.core.transaction.models.Payload payload = success.getPayload();
                        if (payload instanceof com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload) {
                            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Approved(com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionResultKt.toResult((com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload) success.getPayload())));
                            return;
                        }
                        if (payload instanceof com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionDeclinedPayload) {
                            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Declined((com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionDeclinedPayload) success.getPayload()));
                            return;
                        }
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl transactionInternalImpl2 = com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this;
                        com.zettle.sdk.feature.taptopay.core.transaction.models.Payload payload2 = success.getPayload();
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("permissiveSignatureUse ");
                        sb2.append(payload2);
                        sb2.append(" not handled");
                        com.zettle.sdk.core.log.LogKt.debug(transactionInternalImpl2, sb2.toString());
                    }
                }

                {
                    super(1);
                }
            });
        }
        if (z4 && (state2 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed)) {
            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Authorizing authorizing2 = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Authorizing) state;
            transactionInternalImpl.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Recover(authorizing2.getInfo(), authorizing2.getConfig()));
        }
        if ((state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Recover) && (state2 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed)) {
            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed failed = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed) state2;
            if (Camera2StreamConfigurationMap(failed) && failed.getConfig() != null && failed.getInfo() != null) {
                transactionInternalImpl.Camera2StreamConfigurationMap.invoke(failed.getConfig().getGetHighSpeedVideoFpsRangesFor(), transactionInternalImpl.getOutputMinFrameDuration, failed.getInfo(), failed.getReason(), (kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.AbortRequestUseCase.Result, kotlin.Unit>) new kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.transaction.usecase.AbortRequestUseCase.Result, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl$onMutate$4
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.feature.taptopay.core.transaction.usecase.AbortRequestUseCase.Result result) {
                        getHighSpeedVideoFpsRangesFor(result);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void getHighSpeedVideoFpsRangesFor(com.zettle.sdk.feature.taptopay.core.transaction.usecase.AbortRequestUseCase.Result result) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl transactionInternalImpl2 = com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this;
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("abortRequestUseCase ");
                        sb2.append(result);
                        sb2.append(" not handled");
                        com.zettle.sdk.core.log.LogKt.debug(transactionInternalImpl2, sb2.toString());
                    }

                    {
                        super(1);
                    }
                });
            }
            transactionInternalImpl.action$core_publicRelease(com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Finalized.INSTANCE);
        }
        if (((state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.PINEntrance) || (state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.RequestSignature)) && (state2 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed)) {
            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed failed2 = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed) state2;
            if (Camera2StreamConfigurationMap(failed2) && failed2.getConfig() != null && failed2.getInfo() != null) {
                transactionInternalImpl.Camera2StreamConfigurationMap.invoke(failed2.getConfig().getGetHighSpeedVideoFpsRangesFor(), transactionInternalImpl.getOutputMinFrameDuration, failed2.getInfo(), failed2.getReason(), (kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.AbortRequestUseCase.Result, kotlin.Unit>) new kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.transaction.usecase.AbortRequestUseCase.Result, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl$onMutate$5
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.feature.taptopay.core.transaction.usecase.AbortRequestUseCase.Result result) {
                        Camera2StreamConfigurationMap(result);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void Camera2StreamConfigurationMap(com.zettle.sdk.feature.taptopay.core.transaction.usecase.AbortRequestUseCase.Result result) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl transactionInternalImpl2 = com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this;
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("abortRequestUseCase ");
                        sb2.append(result);
                        sb2.append(" not handled");
                        com.zettle.sdk.core.log.LogKt.debug(transactionInternalImpl2, sb2.toString());
                    }

                    {
                        super(1);
                    }
                });
            }
        }
        if ((state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.RequestSignature) && (state2 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.UploadingSignature)) {
            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.UploadingSignature uploadingSignature = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.UploadingSignature) state2;
            transactionInternalImpl.coroutineCreation.invoke(uploadingSignature.getConfig().getGetHighSpeedVideoFpsRangesFor(), transactionInternalImpl.getOutputMinFrameDuration, uploadingSignature.getInfo(), uploadingSignature.getSignature(), uploadingSignature.getApprovedPayload(), (kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.UploadSignatureUseCase.Result, kotlin.Unit>) new kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.transaction.usecase.UploadSignatureUseCase.Result, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl$onMutate$6
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.feature.taptopay.core.transaction.usecase.UploadSignatureUseCase.Result result) {
                    getHighSpeedVideoFpsRangesFor(result);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoFpsRangesFor(com.zettle.sdk.feature.taptopay.core.transaction.usecase.UploadSignatureUseCase.Result result) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                    if (result instanceof com.zettle.sdk.feature.taptopay.core.transaction.usecase.UploadSignatureUseCase.Result.BackendIssue) {
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Failed(((com.zettle.sdk.feature.taptopay.core.transaction.usecase.UploadSignatureUseCase.Result.BackendIssue) result).getLocalUUID(), new com.zettle.sdk.feature.taptopay.core.FailureReason.BackendError(null)));
                        return;
                    }
                    if (result instanceof com.zettle.sdk.feature.taptopay.core.transaction.usecase.UploadSignatureUseCase.Result.Failed) {
                        com.zettle.sdk.feature.taptopay.core.transaction.usecase.UploadSignatureUseCase.Result.Failed failed3 = (com.zettle.sdk.feature.taptopay.core.transaction.usecase.UploadSignatureUseCase.Result.Failed) result;
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Failed(failed3.getLocalUUID(), failed3.getReason()));
                        return;
                    }
                    if (result instanceof com.zettle.sdk.feature.taptopay.core.transaction.usecase.UploadSignatureUseCase.Result.Success) {
                        com.zettle.sdk.feature.taptopay.core.transaction.usecase.UploadSignatureUseCase.Result.Success success = (com.zettle.sdk.feature.taptopay.core.transaction.usecase.UploadSignatureUseCase.Result.Success) result;
                        com.zettle.sdk.feature.taptopay.core.transaction.models.Payload payload = success.getPayload();
                        if (payload instanceof com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload) {
                            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Approved(com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionResultKt.toResult((com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload) success.getPayload())));
                            return;
                        }
                        if (payload instanceof com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionDeclinedPayload) {
                            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this.action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Declined((com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionDeclinedPayload) success.getPayload()));
                            return;
                        }
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl transactionInternalImpl2 = com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.this;
                        com.zettle.sdk.feature.taptopay.core.transaction.models.Payload payload2 = success.getPayload();
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append(payload2);
                        sb2.append(" not handled");
                        com.zettle.sdk.core.log.LogKt.debug(transactionInternalImpl2, sb2.toString());
                    }
                }

                {
                    super(1);
                }
            });
        }
    }

    public static final /* synthetic */ com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State access$reduce(com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl transactionInternalImpl, com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State state, com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action action) {
        com.zettle.sdk.feature.taptopay.core.FailureReason paymentDeclined;
        com.zettle.sdk.feature.taptopay.core.FailureReason paymentDeclined2;
        com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference getOutputFormats;
        com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference getOutputFormats2;
        com.zettle.sdk.feature.taptopay.core.FailureReason paymentDeclined3;
        com.zettle.sdk.feature.taptopay.core.FailureReason paymentDeclined4;
        java.lang.String str = null;
        if (!(state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Initial)) {
            if (!(state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Reinitialising)) {
                if (!(state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InitialisingTransaction)) {
                    if (!(state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.FetchCvmLimits)) {
                        if (!(state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.PresentCard)) {
                            if (!(state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.ReadingCard)) {
                                if (!(state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.CardReadOk)) {
                                    if (!(state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Authorizing)) {
                                        if (!(state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Recover)) {
                                            if (!(state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Approved)) {
                                                if (!(state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed)) {
                                                    if (!(state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Retry)) {
                                                        if (!(state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Finalized)) {
                                                            if (!(state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.PINEntrance)) {
                                                                if (!(state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.PermissiveSignature)) {
                                                                    if (!(state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.RequestSignature)) {
                                                                        if (!(state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.UploadingSignature)) {
                                                                            throw new kotlin.NoWhenBranchMatchedException();
                                                                        }
                                                                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.UploadingSignature uploadingSignature = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.UploadingSignature) state;
                                                                        if (action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel) {
                                                                            return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed(uploadingSignature.getInfo(), uploadingSignature.getConfig(), com.zettle.sdk.feature.taptopay.core.FailureReason.SignatureCanceled.INSTANCE, uploadingSignature.getOnlineHostRequestMessage());
                                                                        }
                                                                        if (action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction) {
                                                                            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction transactionResultAction = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction) action;
                                                                            if (transactionResultAction instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Approved) {
                                                                                return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Approved(uploadingSignature.getInfo(), uploadingSignature.getConfig(), ((com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Approved) action).getResultPayload(), uploadingSignature.getOnlineHostRequestMessage());
                                                                            }
                                                                            if (transactionResultAction instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Declined) {
                                                                                com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Declined declined = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Declined) action;
                                                                                java.lang.String result = declined.getTransactionDeclined().getResult();
                                                                                if (kotlin.jvm.internal.Intrinsics.areEqual(result, com.zettle.sdk.commons.network.JsonKt.KEY_DECLINED_SCA)) {
                                                                                    paymentDeclined = new com.zettle.sdk.feature.taptopay.core.FailureReason.RequiredSca(declined.getTransactionDeclined().getTransactionId(), null, 2, null);
                                                                                } else if (kotlin.jvm.internal.Intrinsics.areEqual(result, com.zettle.sdk.commons.network.JsonKt.KEY_CONTACTLESS_TOO_MANY_CONSECUTIVE_TX)) {
                                                                                    paymentDeclined = new com.zettle.sdk.feature.taptopay.core.FailureReason.TooManyContactlessTx(declined.getTransactionDeclined().getTransactionId(), null, 2, null);
                                                                                } else {
                                                                                    paymentDeclined = new com.zettle.sdk.feature.taptopay.core.FailureReason.PaymentDeclined(declined.getTransactionDeclined().getTransactionId(), declined.getTransactionDeclined().getResult());
                                                                                }
                                                                                return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed(uploadingSignature.getInfo(), uploadingSignature.getConfig(), paymentDeclined, uploadingSignature.getOnlineHostRequestMessage());
                                                                            }
                                                                            if (transactionResultAction instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Failed) {
                                                                                return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed(uploadingSignature.getInfo(), uploadingSignature.getConfig(), ((com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Failed) action).getReason(), uploadingSignature.getOnlineHostRequestMessage());
                                                                            }
                                                                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Currently at ");
                                                                            sb.append(uploadingSignature);
                                                                            sb.append(" and the action = ");
                                                                            sb.append(action);
                                                                            sb.append(" is not handled");
                                                                            com.zettle.sdk.core.log.LogKt.warn$default(transactionInternalImpl, sb.toString(), null, 2, null);
                                                                            return uploadingSignature;
                                                                        }
                                                                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Currently at ");
                                                                        sb2.append(uploadingSignature);
                                                                        sb2.append(" and the action = ");
                                                                        sb2.append(action);
                                                                        sb2.append(" is not handled");
                                                                        com.zettle.sdk.core.log.LogKt.warn$default(transactionInternalImpl, sb2.toString(), null, 2, null);
                                                                        return uploadingSignature;
                                                                    }
                                                                    com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.RequestSignature requestSignature = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.RequestSignature) state;
                                                                    if (action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel) {
                                                                        return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed(requestSignature.getInfo(), requestSignature.getConfig(), com.zettle.sdk.feature.taptopay.core.FailureReason.SignatureCanceled.INSTANCE, requestSignature.getOnlineHostRequestMessage());
                                                                    }
                                                                    if (action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.UploadSignature) {
                                                                        return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.UploadingSignature(requestSignature.getInfo(), requestSignature.getConfig(), requestSignature.getOnlineHostRequestMessage(), ((com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.UploadSignature) action).getSignature(), requestSignature.getApprovedPayload());
                                                                    }
                                                                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Currently at ");
                                                                    sb3.append(requestSignature);
                                                                    sb3.append(" and the action = ");
                                                                    sb3.append(action);
                                                                    sb3.append(" is not handled");
                                                                    com.zettle.sdk.core.log.LogKt.warn$default(transactionInternalImpl, sb3.toString(), null, 2, null);
                                                                    return requestSignature;
                                                                }
                                                                com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.PermissiveSignature permissiveSignature = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.PermissiveSignature) state;
                                                                if (action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction) {
                                                                    com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction transactionResultAction2 = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction) action;
                                                                    if (transactionResultAction2 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Approved) {
                                                                        return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Approved(permissiveSignature.getInfo(), permissiveSignature.getConfig(), ((com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Approved) action).getResultPayload(), permissiveSignature.getOnlineHostRequestMessage());
                                                                    }
                                                                    if (transactionResultAction2 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Declined) {
                                                                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Declined declined2 = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Declined) action;
                                                                        java.lang.String result2 = declined2.getTransactionDeclined().getResult();
                                                                        if (kotlin.jvm.internal.Intrinsics.areEqual(result2, com.zettle.sdk.commons.network.JsonKt.KEY_DECLINED_SCA)) {
                                                                            paymentDeclined2 = new com.zettle.sdk.feature.taptopay.core.FailureReason.RequiredSca(declined2.getTransactionDeclined().getTransactionId(), null, 2, null);
                                                                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(result2, com.zettle.sdk.commons.network.JsonKt.KEY_CONTACTLESS_TOO_MANY_CONSECUTIVE_TX)) {
                                                                            paymentDeclined2 = new com.zettle.sdk.feature.taptopay.core.FailureReason.TooManyContactlessTx(declined2.getTransactionDeclined().getTransactionId(), null, 2, null);
                                                                        } else {
                                                                            paymentDeclined2 = new com.zettle.sdk.feature.taptopay.core.FailureReason.PaymentDeclined(declined2.getTransactionDeclined().getTransactionId(), declined2.getTransactionDeclined().getResult());
                                                                        }
                                                                        return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed(permissiveSignature.getInfo(), permissiveSignature.getConfig(), paymentDeclined2, permissiveSignature.getOnlineHostRequestMessage());
                                                                    }
                                                                    if (transactionResultAction2 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Failed) {
                                                                        return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed(permissiveSignature.getInfo(), permissiveSignature.getConfig(), ((com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Failed) action).getReason(), permissiveSignature.getOnlineHostRequestMessage());
                                                                    }
                                                                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Currently at ");
                                                                    sb4.append(permissiveSignature);
                                                                    sb4.append(" and the action = ");
                                                                    sb4.append(action);
                                                                    sb4.append(" is not handled");
                                                                    com.zettle.sdk.core.log.LogKt.warn$default(transactionInternalImpl, sb4.toString(), null, 2, null);
                                                                    return permissiveSignature;
                                                                }
                                                                java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Currently at ");
                                                                sb5.append(permissiveSignature);
                                                                sb5.append(" and the action = ");
                                                                sb5.append(action);
                                                                sb5.append(" is not handled");
                                                                com.zettle.sdk.core.log.LogKt.warn$default(transactionInternalImpl, sb5.toString(), null, 2, null);
                                                                return permissiveSignature;
                                                            }
                                                            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.PINEntrance pINEntrance = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.PINEntrance) state;
                                                            if (action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel) {
                                                                com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel cancel = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel) action;
                                                                return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed(pINEntrance.getInfo(), pINEntrance.getConfig(), cancel.getPaymentFailureReason(), cancel.getOnlineHostRequestMessage());
                                                            }
                                                            if (action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.PINResultAction) {
                                                                com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.PINResultAction pINResultAction = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.PINResultAction) action;
                                                                if (pINResultAction instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.PINResultAction.Cancelled) {
                                                                    return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed(pINEntrance.getInfo(), pINEntrance.getConfig(), com.zettle.sdk.feature.taptopay.core.FailureReason.PinEntranceCanceled.INSTANCE, pINEntrance.getOnlineHostRequestMessage());
                                                                }
                                                                if (!(pINResultAction instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.PINResultAction.Completed)) {
                                                                    throw new kotlin.NoWhenBranchMatchedException();
                                                                }
                                                                com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.PINResultAction.Completed completed = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.PINResultAction.Completed) action;
                                                                return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Authorizing(pINEntrance.getWeakReferenceActivity(), pINEntrance.getOnlineHostRequestMessage(), new com.zettle.sdk.feature.taptopay.core.transaction.PinBlock(completed.getPinBlockKsn(), completed.getPinBlock()), pINEntrance.getInfo(), pINEntrance.getConfig());
                                                            }
                                                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Currently at ");
                                                            sb6.append(pINEntrance);
                                                            sb6.append(" and the action = ");
                                                            sb6.append(action);
                                                            sb6.append(" is not handled");
                                                            com.zettle.sdk.core.log.LogKt.warn$default(transactionInternalImpl, sb6.toString(), null, 2, null);
                                                            return pINEntrance;
                                                        }
                                                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Finalized finalized = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Finalized) state;
                                                        if (action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Stop) {
                                                            return com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Initial.INSTANCE;
                                                        }
                                                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Currently at ");
                                                        sb7.append(finalized);
                                                        sb7.append(" and the action = ");
                                                        sb7.append(action);
                                                        sb7.append(" is not handled");
                                                        com.zettle.sdk.core.log.LogKt.warn$default(transactionInternalImpl, sb7.toString(), null, 2, null);
                                                        return finalized;
                                                    }
                                                    com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Retry retry = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Retry) state;
                                                    if (action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Stop) {
                                                        return com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Initial.INSTANCE;
                                                    }
                                                    if (action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.InitializingTransaction) {
                                                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.InitializingTransaction initializingTransaction = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.InitializingTransaction) action;
                                                        return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.PresentCard(initializingTransaction.getWeakReferenceActivity(), initializingTransaction.getInfo(), initializingTransaction.getConfig());
                                                    }
                                                    if (!(action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction)) {
                                                        if (action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel) {
                                                            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel cancel2 = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel) action;
                                                            return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed(retry.getInfo(), retry.getConfig(), cancel2.getPaymentFailureReason(), cancel2.getOnlineHostRequestMessage());
                                                        }
                                                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("Currently at ");
                                                        sb8.append(retry);
                                                        sb8.append(" and the action = ");
                                                        sb8.append(action);
                                                        sb8.append(" is not handled");
                                                        com.zettle.sdk.core.log.LogKt.warn$default(transactionInternalImpl, sb8.toString(), null, 2, null);
                                                        return retry;
                                                    }
                                                    com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction cardAction = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction) action;
                                                    if (cardAction instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction.CardTapped) {
                                                        return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.ReadingCard(retry.getWeakReferenceActivity(), retry.getInfo(), retry.getConfig());
                                                    }
                                                    if (cardAction instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction.CardReadError) {
                                                        return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.PresentCard(retry.getWeakReferenceActivity(), retry.getInfo(), retry.getConfig());
                                                    }
                                                    if (cardAction instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction.CardReadTimeout) {
                                                        return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed(retry.getInfo(), retry.getConfig(), com.zettle.sdk.feature.taptopay.core.FailureReason.CancelledByTimeout.INSTANCE, null, 8, null);
                                                    }
                                                    if (cardAction instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction.CardReadDuplicate) {
                                                        return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed(retry.getInfo(), retry.getConfig(), com.zettle.sdk.feature.taptopay.core.FailureReason.CardReadDuplicate.INSTANCE, null, 8, null);
                                                    }
                                                    if (cardAction instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction.NFCUnexpectedError) {
                                                        return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed(retry.getInfo(), retry.getConfig(), com.zettle.sdk.feature.taptopay.core.FailureReason.NFCUnexpectedError.INSTANCE, null, 8, null);
                                                    }
                                                    if (cardAction instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction.UnknownCardEvent) {
                                                        return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed(retry.getInfo(), retry.getConfig(), com.zettle.sdk.feature.taptopay.core.FailureReason.UnknownCardEvent.INSTANCE, null, 8, null);
                                                    }
                                                    throw new kotlin.NoWhenBranchMatchedException();
                                                }
                                                com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed failed = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed) state;
                                                if (action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Finalized) {
                                                    com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info = failed.getInfo();
                                                    if (info != null && (getOutputFormats2 = info.getGetOutputFormats()) != null) {
                                                        str = getOutputFormats2.getGetHighResolutionOutputSizeshNQ4ISI();
                                                    }
                                                    return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Finalized(str);
                                                }
                                                if (action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel) {
                                                    com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info2 = failed.getInfo();
                                                    if (info2 != null && (getOutputFormats = info2.getGetOutputFormats()) != null) {
                                                        str = getOutputFormats.getGetHighResolutionOutputSizeshNQ4ISI();
                                                    }
                                                    return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Finalized(str);
                                                }
                                                if (action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Stop) {
                                                    return com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Initial.INSTANCE;
                                                }
                                                java.lang.StringBuilder sb9 = new java.lang.StringBuilder("Currently at ");
                                                sb9.append(failed);
                                                sb9.append(" and the action = ");
                                                sb9.append(action);
                                                sb9.append(" is not handled");
                                                com.zettle.sdk.core.log.LogKt.warn$default(transactionInternalImpl, sb9.toString(), null, 2, null);
                                                return failed;
                                            }
                                            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Approved approved = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Approved) state;
                                            if (action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Finalized) {
                                                return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Finalized(approved.getInfo().getGetOutputFormats().getGetHighResolutionOutputSizeshNQ4ISI());
                                            }
                                            java.lang.StringBuilder sb10 = new java.lang.StringBuilder("Currently at ");
                                            sb10.append(approved);
                                            sb10.append(" and the action = ");
                                            sb10.append(action);
                                            sb10.append(" is not handled");
                                            com.zettle.sdk.core.log.LogKt.warn$default(transactionInternalImpl, sb10.toString(), null, 2, null);
                                            return approved;
                                        }
                                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Recover recover = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Recover) state;
                                        if (!(action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction)) {
                                            java.lang.StringBuilder sb11 = new java.lang.StringBuilder("Currently at ");
                                            sb11.append(recover);
                                            sb11.append(" and the action = ");
                                            sb11.append(action);
                                            sb11.append(" is not handled");
                                            com.zettle.sdk.core.log.LogKt.warn$default(transactionInternalImpl, sb11.toString(), null, 2, null);
                                            return recover;
                                        }
                                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction transactionResultAction3 = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction) action;
                                        if (transactionResultAction3 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Approved) {
                                            return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Approved(recover.getInfo(), recover.getConfig(), ((com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Approved) transactionResultAction3).getResultPayload(), recover.getOnlineHostRequestMessage());
                                        }
                                        if (transactionResultAction3 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.PermissiveSignature) {
                                            return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.PermissiveSignature(recover.getInfo(), recover.getConfig(), recover.getOnlineHostRequestMessage(), ((com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.PermissiveSignature) transactionResultAction3).getTransactionApprovedPayload());
                                        }
                                        if (transactionResultAction3 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.RequestSignature) {
                                            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.RequestSignature requestSignature2 = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.RequestSignature) transactionResultAction3;
                                            return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.RequestSignature(recover.getInfo(), recover.getConfig(), recover.getOnlineHostRequestMessage(), requestSignature2.getTransactionApprovedPayload(), requestSignature2.getCardInfo());
                                        }
                                        if (transactionResultAction3 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Declined) {
                                            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Declined declined3 = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Declined) transactionResultAction3;
                                            java.lang.String result3 = declined3.getTransactionDeclined().getResult();
                                            if (kotlin.jvm.internal.Intrinsics.areEqual(result3, com.zettle.sdk.commons.network.JsonKt.KEY_DECLINED_SCA)) {
                                                paymentDeclined3 = new com.zettle.sdk.feature.taptopay.core.FailureReason.RequiredSca(declined3.getTransactionDeclined().getTransactionId(), null, 2, null);
                                            } else if (kotlin.jvm.internal.Intrinsics.areEqual(result3, com.zettle.sdk.commons.network.JsonKt.KEY_CONTACTLESS_TOO_MANY_CONSECUTIVE_TX)) {
                                                paymentDeclined3 = new com.zettle.sdk.feature.taptopay.core.FailureReason.TooManyContactlessTx(declined3.getTransactionDeclined().getTransactionId(), null, 2, null);
                                            } else {
                                                paymentDeclined3 = new com.zettle.sdk.feature.taptopay.core.FailureReason.PaymentDeclined(declined3.getTransactionDeclined().getTransactionId(), declined3.getTransactionDeclined().getResult());
                                            }
                                            return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed(recover.getInfo(), recover.getConfig(), paymentDeclined3, recover.getOnlineHostRequestMessage());
                                        }
                                        if (transactionResultAction3 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.AppCommand) {
                                            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.AppCommand appCommand = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.AppCommand) transactionResultAction3;
                                            if (kotlin.jvm.internal.Intrinsics.areEqual(appCommand.getAppCommand().getCommand(), com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.AppCommand.APP_COMMAND_ONLINE_PIN_CAPTURE)) {
                                                return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.PINEntrance(recover.getWeakReferenceActivity(), recover.getOnlineHostRequestMessage(), recover.getInfo(), recover.getConfig().mutate$core_publicRelease(appCommand.getAppCommand().getContext()));
                                            }
                                            return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed(recover.getInfo(), recover.getConfig(), new com.zettle.sdk.feature.taptopay.core.FailureReason.AppCommandNotMapped(appCommand.getAppCommand().getCommand()), recover.getOnlineHostRequestMessage());
                                        }
                                        if (transactionResultAction3 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Failed) {
                                            return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed(recover.getInfo(), recover.getConfig(), ((com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Failed) transactionResultAction3).getReason(), recover.getOnlineHostRequestMessage());
                                        }
                                        java.lang.StringBuilder sb12 = new java.lang.StringBuilder("Currently at ");
                                        sb12.append(recover);
                                        sb12.append(" and the action = ");
                                        sb12.append(transactionResultAction3);
                                        sb12.append(" is not handled");
                                        com.zettle.sdk.core.log.LogKt.warn$default(transactionInternalImpl, sb12.toString(), null, 2, null);
                                        return recover;
                                    }
                                    com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Authorizing authorizing = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Authorizing) state;
                                    if (action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Recover) {
                                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Recover recover2 = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Recover) action;
                                        return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Recover(authorizing.getWeakReferenceActivity(), authorizing.getOnlineHostRequestMessage(), recover2.getInfo(), recover2.getConfig());
                                    }
                                    if (!(action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction)) {
                                        java.lang.StringBuilder sb13 = new java.lang.StringBuilder("Currently at ");
                                        sb13.append(authorizing);
                                        sb13.append(" and the action = ");
                                        sb13.append(action);
                                        sb13.append(" is not handled");
                                        com.zettle.sdk.core.log.LogKt.warn$default(transactionInternalImpl, sb13.toString(), null, 2, null);
                                        return authorizing;
                                    }
                                    com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction transactionResultAction4 = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction) action;
                                    if (transactionResultAction4 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Approved) {
                                        return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Approved(authorizing.getInfo(), authorizing.getConfig(), ((com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Approved) transactionResultAction4).getResultPayload(), authorizing.getOnlineHostRequestMessage());
                                    }
                                    if (transactionResultAction4 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.PermissiveSignature) {
                                        return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.PermissiveSignature(authorizing.getInfo(), authorizing.getConfig(), authorizing.getOnlineHostRequestMessage(), ((com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.PermissiveSignature) transactionResultAction4).getTransactionApprovedPayload());
                                    }
                                    if (transactionResultAction4 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.RequestSignature) {
                                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.RequestSignature requestSignature3 = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.RequestSignature) transactionResultAction4;
                                        return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.RequestSignature(authorizing.getInfo(), authorizing.getConfig(), authorizing.getOnlineHostRequestMessage(), requestSignature3.getTransactionApprovedPayload(), requestSignature3.getCardInfo());
                                    }
                                    if (transactionResultAction4 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Declined) {
                                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Declined declined4 = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Declined) transactionResultAction4;
                                        java.lang.String result4 = declined4.getTransactionDeclined().getResult();
                                        if (kotlin.jvm.internal.Intrinsics.areEqual(result4, com.zettle.sdk.commons.network.JsonKt.KEY_DECLINED_SCA)) {
                                            paymentDeclined4 = new com.zettle.sdk.feature.taptopay.core.FailureReason.RequiredSca(declined4.getTransactionDeclined().getTransactionId(), null, 2, null);
                                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(result4, com.zettle.sdk.commons.network.JsonKt.KEY_CONTACTLESS_TOO_MANY_CONSECUTIVE_TX)) {
                                            paymentDeclined4 = new com.zettle.sdk.feature.taptopay.core.FailureReason.TooManyContactlessTx(declined4.getTransactionDeclined().getTransactionId(), null, 2, null);
                                        } else {
                                            paymentDeclined4 = new com.zettle.sdk.feature.taptopay.core.FailureReason.PaymentDeclined(declined4.getTransactionDeclined().getTransactionId(), declined4.getTransactionDeclined().getResult());
                                        }
                                        return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed(authorizing.getInfo(), authorizing.getConfig(), paymentDeclined4, authorizing.getOnlineHostRequestMessage());
                                    }
                                    if (transactionResultAction4 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.AppCommand) {
                                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.AppCommand appCommand2 = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.AppCommand) transactionResultAction4;
                                        if (kotlin.jvm.internal.Intrinsics.areEqual(appCommand2.getAppCommand().getCommand(), com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.AppCommand.APP_COMMAND_ONLINE_PIN_CAPTURE)) {
                                            return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.PINEntrance(authorizing.getWeakReferenceActivity(), authorizing.getOnlineHostRequestMessage(), authorizing.getInfo(), authorizing.getConfig().mutate$core_publicRelease(appCommand2.getAppCommand().getContext()));
                                        }
                                        return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed(authorizing.getInfo(), authorizing.getConfig(), new com.zettle.sdk.feature.taptopay.core.FailureReason.AppCommandNotMapped(appCommand2.getAppCommand().getCommand()), authorizing.getOnlineHostRequestMessage());
                                    }
                                    if (transactionResultAction4 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Failed) {
                                        return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed(authorizing.getInfo(), authorizing.getConfig(), ((com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Failed) transactionResultAction4).getReason(), authorizing.getOnlineHostRequestMessage());
                                    }
                                    java.lang.StringBuilder sb14 = new java.lang.StringBuilder("Currently at ");
                                    sb14.append(authorizing);
                                    sb14.append(" and the action = ");
                                    sb14.append(transactionResultAction4);
                                    sb14.append(" is not handled");
                                    com.zettle.sdk.core.log.LogKt.warn$default(transactionInternalImpl, sb14.toString(), null, 2, null);
                                    return authorizing;
                                }
                                com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.CardReadOk cardReadOk = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.CardReadOk) state;
                                if (action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionRequestOnlineAuthentication) {
                                    com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionRequestOnlineAuthentication transactionRequestOnlineAuthentication = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionRequestOnlineAuthentication) action;
                                    int i = com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl.WhenMappings.$EnumSwitchMapping$1[transactionRequestOnlineAuthentication.getOnlineHostRequestMessage().getCvmType().ordinal()];
                                    if (i == 1 || i == 2 || i == 3) {
                                        return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Authorizing(cardReadOk.getWeakReferenceActivity(), transactionRequestOnlineAuthentication.getOnlineHostRequestMessage(), null, cardReadOk.getInfo(), cardReadOk.getConfig());
                                    }
                                    if (i != 4) {
                                        if (i == 5) {
                                            return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed(cardReadOk.getInfo(), cardReadOk.getConfig(), com.zettle.sdk.feature.taptopay.core.FailureReason.TransactionOfflinePinRequested.INSTANCE, transactionRequestOnlineAuthentication.getOnlineHostRequestMessage());
                                        }
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    }
                                    if (cardReadOk.getInfo().getGetHighSpeedVideoFpsRanges().isPinSupported()) {
                                        return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.PINEntrance(cardReadOk.getWeakReferenceActivity(), transactionRequestOnlineAuthentication.getOnlineHostRequestMessage(), cardReadOk.getInfo(), cardReadOk.getConfig());
                                    }
                                    return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed(cardReadOk.getInfo(), cardReadOk.getConfig(), com.zettle.sdk.feature.taptopay.core.FailureReason.TransactionOnlinePinRequested.INSTANCE, transactionRequestOnlineAuthentication.getOnlineHostRequestMessage());
                                }
                                if (!(action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction)) {
                                    if (action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel) {
                                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel cancel3 = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel) action;
                                        return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed(cardReadOk.getInfo(), cardReadOk.getConfig(), cancel3.getPaymentFailureReason(), cancel3.getOnlineHostRequestMessage());
                                    }
                                    java.lang.StringBuilder sb15 = new java.lang.StringBuilder("Currently at ");
                                    sb15.append(cardReadOk);
                                    sb15.append(" and the action = ");
                                    sb15.append(action);
                                    sb15.append(" is not handled");
                                    com.zettle.sdk.core.log.LogKt.warn$default(transactionInternalImpl, sb15.toString(), null, 2, null);
                                    return cardReadOk;
                                }
                                com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction sDKTransactionResultAction = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction) action;
                                if ((sDKTransactionResultAction instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionCardError) || kotlin.jvm.internal.Intrinsics.areEqual(sDKTransactionResultAction, com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionRequireCDCVM.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(sDKTransactionResultAction, com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionSelectNextInterface.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(sDKTransactionResultAction, com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionTryAgain.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(sDKTransactionResultAction, com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionFailed.INSTANCE)) {
                                    return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Retry(cardReadOk.getWeakReferenceActivity(), cardReadOk.getInfo(), cardReadOk.getConfig());
                                }
                                if ((sDKTransactionResultAction instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionDeclined) || kotlin.jvm.internal.Intrinsics.areEqual(sDKTransactionResultAction, com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionEndApplicationError.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(sDKTransactionResultAction, com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionFailedAllowFallback.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(sDKTransactionResultAction, com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionNoAppError.INSTANCE)) {
                                    return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed(cardReadOk.getInfo(), cardReadOk.getConfig(), com.zettle.sdk.feature.taptopay.core.FailureReasonKt.toPaymentFailureReason(sDKTransactionResultAction), null, 8, null);
                                }
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.ReadingCard readingCard = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.ReadingCard) state;
                            if (action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel) {
                                com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel cancel4 = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel) action;
                                return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed(readingCard.getInfo(), readingCard.getConfig(), cancel4.getPaymentFailureReason(), cancel4.getOnlineHostRequestMessage());
                            }
                            if (!(action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionUIAction)) {
                                if (!(action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction)) {
                                    java.lang.StringBuilder sb16 = new java.lang.StringBuilder("Currently at ");
                                    sb16.append(readingCard);
                                    sb16.append(" and the action = ");
                                    sb16.append(action);
                                    sb16.append(" is not handled");
                                    com.zettle.sdk.core.log.LogKt.warn$default(transactionInternalImpl, sb16.toString(), null, 2, null);
                                    return readingCard;
                                }
                                com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction sDKTransactionResultAction2 = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction) action;
                                if ((sDKTransactionResultAction2 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionDeclined) || kotlin.jvm.internal.Intrinsics.areEqual(sDKTransactionResultAction2, com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionEndApplicationError.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(sDKTransactionResultAction2, com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionFailedAllowFallback.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(sDKTransactionResultAction2, com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionNoAppError.INSTANCE)) {
                                    return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed(readingCard.getInfo(), readingCard.getConfig(), com.zettle.sdk.feature.taptopay.core.FailureReasonKt.toPaymentFailureReason(sDKTransactionResultAction2), null);
                                }
                                if ((sDKTransactionResultAction2 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionCardError) || kotlin.jvm.internal.Intrinsics.areEqual(sDKTransactionResultAction2, com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionRequireCDCVM.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(sDKTransactionResultAction2, com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionSelectNextInterface.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(sDKTransactionResultAction2, com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionTryAgain.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(sDKTransactionResultAction2, com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionFailed.INSTANCE)) {
                                    return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Retry(readingCard.getWeakReferenceActivity(), readingCard.getInfo(), readingCard.getConfig());
                                }
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionUIAction transactionUIAction = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionUIAction) action;
                            if (transactionUIAction instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionUIAction.EventCardReadOk) {
                                return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.CardReadOk(readingCard.getWeakReferenceActivity(), readingCard.getInfo(), readingCard.getConfig());
                            }
                            java.lang.StringBuilder sb17 = new java.lang.StringBuilder("Currently at ");
                            sb17.append(readingCard);
                            sb17.append(" and the action = ");
                            sb17.append(transactionUIAction);
                            sb17.append(" is not handled");
                            com.zettle.sdk.core.log.LogKt.warn$default(transactionInternalImpl, sb17.toString(), null, 2, null);
                            return readingCard;
                        }
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.PresentCard presentCard = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.PresentCard) state;
                        if (!(action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction)) {
                            if (!(action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionUIAction)) {
                                if (!(action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction)) {
                                    if (action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel) {
                                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel cancel5 = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel) action;
                                        return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed(presentCard.getInfo(), presentCard.getConfig(), cancel5.getPaymentFailureReason(), cancel5.getOnlineHostRequestMessage());
                                    }
                                    java.lang.StringBuilder sb18 = new java.lang.StringBuilder("Currently at ");
                                    sb18.append(presentCard);
                                    sb18.append(" and the action = ");
                                    sb18.append(action);
                                    sb18.append(" is not handled");
                                    com.zettle.sdk.core.log.LogKt.warn$default(transactionInternalImpl, sb18.toString(), null, 2, null);
                                    return presentCard;
                                }
                                java.lang.StringBuilder sb19 = new java.lang.StringBuilder("Currently at ");
                                sb19.append(presentCard);
                                sb19.append(" and the action = ");
                                sb19.append((com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction) action);
                                sb19.append(" is not handled");
                                com.zettle.sdk.core.log.LogKt.warn$default(transactionInternalImpl, sb19.toString(), null, 2, null);
                                return presentCard;
                            }
                            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionUIAction transactionUIAction2 = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionUIAction) action;
                            if (kotlin.jvm.internal.Intrinsics.areEqual(transactionUIAction2, com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionUIAction.EventCardReadOk.INSTANCE)) {
                                return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.CardReadOk(presentCard.getWeakReferenceActivity(), presentCard.getInfo(), presentCard.getConfig());
                            }
                            java.lang.StringBuilder sb20 = new java.lang.StringBuilder("Currently at ");
                            sb20.append(presentCard);
                            sb20.append(" and the action = ");
                            sb20.append(transactionUIAction2);
                            sb20.append(" is not handled");
                            com.zettle.sdk.core.log.LogKt.warn$default(transactionInternalImpl, sb20.toString(), null, 2, null);
                            return presentCard;
                        }
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction cardAction2 = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction) action;
                        if (cardAction2 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction.CardTapped) {
                            return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.ReadingCard(presentCard.getWeakReferenceActivity(), presentCard.getInfo(), presentCard.getConfig());
                        }
                        if (cardAction2 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction.CardReadError) {
                            return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Retry(presentCard.getWeakReferenceActivity(), presentCard.getInfo(), presentCard.getConfig());
                        }
                        if (cardAction2 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction.CardReadTimeout) {
                            return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed(presentCard.getInfo(), presentCard.getConfig(), com.zettle.sdk.feature.taptopay.core.FailureReason.CancelledByTimeout.INSTANCE, null, 8, null);
                        }
                        if (cardAction2 instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction.NFCUnexpectedError) {
                            return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed(presentCard.getInfo(), presentCard.getConfig(), com.zettle.sdk.feature.taptopay.core.FailureReason.NFCUnexpectedError.INSTANCE, null, 8, null);
                        }
                        java.lang.StringBuilder sb21 = new java.lang.StringBuilder("Currently at ");
                        sb21.append(presentCard);
                        sb21.append(" and the action = ");
                        sb21.append(cardAction2);
                        sb21.append(" is not handled");
                        com.zettle.sdk.core.log.LogKt.warn$default(transactionInternalImpl, sb21.toString(), null, 2, null);
                        return presentCard;
                    }
                    com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.FetchCvmLimits fetchCvmLimits = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.FetchCvmLimits) state;
                    if (action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.PresentCard) {
                        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.PresentCard presentCard2 = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.PresentCard) action;
                        return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.PresentCard(presentCard2.getWeakReferenceActivity(), presentCard2.getInfo(), presentCard2.getConfig());
                    }
                    java.lang.StringBuilder sb22 = new java.lang.StringBuilder("Currently at ");
                    sb22.append(fetchCvmLimits);
                    sb22.append(" and the action = ");
                    sb22.append(action);
                    sb22.append(" is not handled");
                    com.zettle.sdk.core.log.LogKt.warn$default(transactionInternalImpl, sb22.toString(), null, 2, null);
                    return fetchCvmLimits;
                }
                com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InitialisingTransaction initialisingTransaction = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InitialisingTransaction) state;
                if (action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Attest.FailAttestation) {
                    com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Attest.FailAttestation failAttestation = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Attest.FailAttestation) action;
                    return failAttestation.getReason() instanceof com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.NotInit ? new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Reinitialising(initialisingTransaction.getWeakReferenceActivity(), initialisingTransaction.getInfo(), initialisingTransaction.getConfig()) : new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed(initialisingTransaction.getInfo(), initialisingTransaction.getConfig(), new com.zettle.sdk.feature.taptopay.core.FailureReason.AttestationError(failAttestation.getReason()), null, 8, null);
                }
                if (action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Attest.SucceedAttestation) {
                    return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.FetchCvmLimits(initialisingTransaction.getWeakReferenceActivity(), initialisingTransaction.getInfo(), initialisingTransaction.getConfig());
                }
                if (action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel) {
                    return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed(initialisingTransaction.getInfo(), initialisingTransaction.getConfig(), com.zettle.sdk.feature.taptopay.core.FailureReason.CanceledByUser.INSTANCE, null, 8, null);
                }
                java.lang.StringBuilder sb23 = new java.lang.StringBuilder("Currently at ");
                sb23.append(initialisingTransaction);
                sb23.append(" and the action = ");
                sb23.append(action);
                sb23.append(" is not handled");
                com.zettle.sdk.core.log.LogKt.warn$default(transactionInternalImpl, sb23.toString(), null, 2, null);
                return initialisingTransaction;
            }
            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Reinitialising reinitialising = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Reinitialising) state;
            if (action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel) {
                return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed(reinitialising.getInfo(), reinitialising.getConfig(), ((com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel) action).getPaymentFailureReason(), null, 8, null);
            }
            if (action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.ReadyToAttest) {
                return com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Initial.INSTANCE;
            }
            if (action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Attest.FailAttestation) {
                return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed(reinitialising.getInfo(), reinitialising.getConfig(), new com.zettle.sdk.feature.taptopay.core.FailureReason.AttestationError(((com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Attest.FailAttestation) action).getReason()), null, 8, null);
            }
            if (action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Attest.SucceedAttestation) {
                return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.FetchCvmLimits(reinitialising.getWeakReferenceActivity(), reinitialising.getInfo(), reinitialising.getConfig());
            }
            java.lang.StringBuilder sb24 = new java.lang.StringBuilder("Currently at ");
            sb24.append(reinitialising);
            sb24.append(" and the action = ");
            sb24.append(action);
            sb24.append(" is not handled");
            com.zettle.sdk.core.log.LogKt.warn$default(transactionInternalImpl, sb24.toString(), null, 2, null);
            return reinitialising;
        }
        com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Initial initial = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Initial) state;
        if (action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Finalized) {
            return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Finalized(null);
        }
        if (action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CheckAttestation) {
            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CheckAttestation checkAttestation = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CheckAttestation) action;
            long maxAmountAllowed = checkAttestation.getInfo().getGetHighSpeedVideoFpsRanges().getMaxAmountAllowed();
            long minAmountAllowed = checkAttestation.getInfo().getGetHighSpeedVideoFpsRanges().getMinAmountAllowed();
            long getHighSpeedVideoFpsRangesFor = checkAttestation.getInfo().getGetHighSpeedVideoFpsRangesFor();
            java.util.Currency currency = checkAttestation.getInfo().getGetHighSpeedVideoFpsRanges().getCurrency();
            if (maxAmountAllowed == 0) {
                return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed(checkAttestation.getInfo(), checkAttestation.getConfig(), com.zettle.sdk.feature.taptopay.core.FailureReason.RequireBankVerification.INSTANCE, null, 8, null);
            }
            if (getHighSpeedVideoFpsRangesFor > maxAmountAllowed) {
                return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed(checkAttestation.getInfo(), checkAttestation.getConfig(), new com.zettle.sdk.feature.taptopay.core.FailureReason.AboveMaximum(transactionInternalImpl.ArtificialStackFrames.translate(com.zettle.sdk.feature.taptopay.core.Translations.LocaleSource.Device, com.zettle.sdk.feature.taptopay.core.R.string.error_high_amount_title, new java.lang.Object[0]), transactionInternalImpl.ArtificialStackFrames.translate(com.zettle.sdk.feature.taptopay.core.Translations.LocaleSource.Device, com.zettle.sdk.feature.taptopay.core.R.string.error_high_amount_subtitle, new java.lang.Object[0]), maxAmountAllowed, currency), null, 8, null);
            }
            if (getHighSpeedVideoFpsRangesFor < minAmountAllowed) {
                return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed(checkAttestation.getInfo(), checkAttestation.getConfig(), new com.zettle.sdk.feature.taptopay.core.FailureReason.BelowMinimum(transactionInternalImpl.ArtificialStackFrames.translate(com.zettle.sdk.feature.taptopay.core.Translations.LocaleSource.Device, com.zettle.sdk.feature.taptopay.core.R.string.error_low_amount_title, new java.lang.Object[0]), transactionInternalImpl.ArtificialStackFrames.translate(com.zettle.sdk.feature.taptopay.core.Translations.LocaleSource.Device, com.zettle.sdk.feature.taptopay.core.R.string.error_low_amount_subtitle, new java.lang.Object[0]), minAmountAllowed, currency), null, 8, null);
            }
            return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InitialisingTransaction(checkAttestation.getWeakReferenceActivity(), checkAttestation.getInfo(), checkAttestation.getConfig());
        }
        if (action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel) {
            return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed(null, null, ((com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel) action).getPaymentFailureReason(), null, 8, null);
        }
        if (action instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.ReinitializeTapToPay) {
            com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.ReinitializeTapToPay reinitializeTapToPay = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.ReinitializeTapToPay) action;
            return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Reinitialising(reinitializeTapToPay.getWeakReferenceActivity(), reinitializeTapToPay.getInfo(), reinitializeTapToPay.getConfig());
        }
        java.lang.StringBuilder sb25 = new java.lang.StringBuilder("Currently at ");
        sb25.append(initial);
        sb25.append(" and the action = ");
        sb25.append(action);
        sb25.append(" is not handled");
        com.zettle.sdk.core.log.LogKt.warn$default(transactionInternalImpl, sb25.toString(), null, 2, null);
        return initial;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal
    public final void cancel(com.zettle.sdk.feature.taptopay.core.FailureReason reason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
        this.getHighSpeedVideoSizes.invoke();
        action$core_publicRelease(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Cancel(com.zettle.sdk.feature.taptopay.core.FailureReason.CanceledByUser.INSTANCE, null, 2, null));
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.zettle.sdk.feature.taptopay.core.transaction.GratuityValidationHelperResult.values().length];
            try {
                iArr[com.zettle.sdk.feature.taptopay.core.transaction.GratuityValidationHelperResult.TooHigh.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.zettle.sdk.feature.taptopay.core.transaction.GratuityValidationHelperResult.TooLow.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.zettle.sdk.feature.taptopay.core.transaction.GratuityValidationHelperResult.Valid.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage.Companion.CvmType.values().length];
            try {
                iArr2[com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage.Companion.CvmType.SIGNATURE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage.Companion.CvmType.CDCVM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage.Companion.CvmType.NO_CVM.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage.Companion.CvmType.ONLINE_PIN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage.Companion.CvmType.OFFLINE_PIN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
