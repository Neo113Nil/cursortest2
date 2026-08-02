package com.paypal.android.taptopay.data.thales.payment;

@kotlin.Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001Bg\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u00060\nj\u0002`\u000b0\b\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\b\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\b¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u001a2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J-\u0010)\u001a\u00020\u001a2\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*J\u0019\u0010+\u001a\u00020\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\tH\u0016¢\u0006\u0004\b.\u0010/J)\u00105\u001a\u00020\u001a2\u0006\u00101\u001a\u0002002\b\u00103\u001a\u0004\u0018\u0001022\u0006\u00104\u001a\u000200H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u001aH\u0016¢\u0006\u0004\b7\u0010\"R\u0014\u0010:\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b:\u0010;R \u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b>\u0010?R \u0010@\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b@\u0010=R$\u0010B\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u00060\nj\u0002`\u000b0\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bA\u0010="}, d2 = {"Lcom/paypal/android/taptopay/data/thales/payment/ThalesPaymentListener;", "Lcom/gemalto/mfs/mwsdk/payment/engine/ContactlessPaymentServiceListener;", "Lcom/paypal/android/taptopay/data/thales/payment/ThalesPaymentDataSource;", "paymentDataSource", "Lcom/paypal/android/taptopay/data/thales/replenishment/CardPaymentKeysReplenisher;", "cardPaymentKeysReplenisher", "Lcom/paypal/android/taptopay/data/thales/card/CardDataSource;", "cardDataSource", "Lcom/paypal/android/taptopay/domain/core/Mapper;", "Lcom/gemalto/mfs/mwsdk/payment/engine/TransactionContext;", "Lcom/paypal/android/taptopay/domain/model/payment/TransactionContext;", "Lcom/paypal/android/taptopay/data/thales/payment/DomainTransactionContext;", "transactionContextMapper", "Lcom/gemalto/mfs/mwsdk/payment/PaymentServiceErrorCode;", "Lcom/paypal/android/taptopay/domain/model/payment/PaymentErrorCode;", "paymentErrorCodeMapper", "Lcom/gemalto/mfs/mwsdk/payment/CHVerificationMethod;", "Lcom/paypal/android/taptopay/domain/model/payment/AuthenticationMethod;", "chvVerificationMethodMapper", "<init>", "(Lcom/paypal/android/taptopay/data/thales/payment/ThalesPaymentDataSource;Lcom/paypal/android/taptopay/data/thales/replenishment/CardPaymentKeysReplenisher;Lcom/paypal/android/taptopay/data/thales/card/CardDataSource;Lcom/paypal/android/taptopay/domain/core/Mapper;Lcom/paypal/android/taptopay/domain/core/Mapper;Lcom/paypal/android/taptopay/domain/core/Mapper;)V", "Lcom/gemalto/mfs/mwsdk/payment/engine/PaymentService;", "paymentService", "cvm", "", "cvmResetTimeout", "", "onAuthenticationRequired", "(Lcom/gemalto/mfs/mwsdk/payment/engine/PaymentService;Lcom/gemalto/mfs/mwsdk/payment/CHVerificationMethod;J)V", "Lcom/gemalto/mfs/mwsdk/sdkconfig/SDKError;", "error", "onError", "(Lcom/gemalto/mfs/mwsdk/sdkconfig/SDKError;)V", "onFirstTapCompleted", "()V", "Lcom/gemalto/mfs/mwsdk/payment/engine/DeactivationStatus;", "deactivationStatus", "Lcom/gemalto/mfs/mwsdk/dcm/DigitalizedCardStatus;", "digitalizedCardStatus", "Lcom/gemalto/mfs/mwsdk/dcm/DigitalizedCard;", "digitalizedCard", "onNextTransactionReady", "(Lcom/gemalto/mfs/mwsdk/payment/engine/DeactivationStatus;Lcom/gemalto/mfs/mwsdk/dcm/DigitalizedCardStatus;Lcom/gemalto/mfs/mwsdk/dcm/DigitalizedCard;)V", "onReadyToTap", "(Lcom/gemalto/mfs/mwsdk/payment/engine/PaymentService;)V", "transactionContext", "onTransactionCompleted", "(Lcom/gemalto/mfs/mwsdk/payment/engine/TransactionContext;)V", "", "transactionInterruptedCode", "", "transactionInterruptedMessage", "retryCount", "onTransactionInterrupted", "(ILjava/lang/String;I)V", "onTransactionStarted", "Camera2StreamConfigurationMap", "Lcom/paypal/android/taptopay/data/thales/card/CardDataSource;", "getHighSpeedVideoSizes", "Lcom/paypal/android/taptopay/data/thales/replenishment/CardPaymentKeysReplenisher;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/android/taptopay/domain/core/Mapper;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/android/taptopay/data/thales/payment/ThalesPaymentDataSource;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizesFor", "getInputSizeshNQ4ISI"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ThalesPaymentListener implements com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.data.thales.card.CardDataSource getHighSpeedVideoSizes;
    private final com.paypal.android.taptopay.domain.core.Mapper<com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode, com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.domain.core.Mapper<com.gemalto.mfs.mwsdk.payment.CHVerificationMethod, com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod> Camera2StreamConfigurationMap;
    private final com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.domain.core.Mapper<com.gemalto.mfs.mwsdk.payment.engine.TransactionContext, com.paypal.android.taptopay.domain.model.payment.TransactionContext> getInputSizeshNQ4ISI;

    @javax.inject.Inject
    public ThalesPaymentListener(com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource thalesPaymentDataSource, com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher cardPaymentKeysReplenisher, com.paypal.android.taptopay.data.thales.card.CardDataSource cardDataSource, com.paypal.android.taptopay.domain.core.Mapper<com.gemalto.mfs.mwsdk.payment.engine.TransactionContext, com.paypal.android.taptopay.domain.model.payment.TransactionContext> mapper, com.paypal.android.taptopay.domain.core.Mapper<com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode, com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode> mapper2, com.paypal.android.taptopay.domain.core.Mapper<com.gemalto.mfs.mwsdk.payment.CHVerificationMethod, com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod> mapper3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thalesPaymentDataSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardPaymentKeysReplenisher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDataSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapper2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapper3, "");
        this.getHighSpeedVideoFpsRangesFor = thalesPaymentDataSource;
        this.getHighSpeedVideoFpsRanges = cardPaymentKeysReplenisher;
        this.getHighSpeedVideoSizes = cardDataSource;
        this.getInputSizeshNQ4ISI = mapper;
        this.getHighResolutionOutputSizeshNQ4ISI = mapper2;
        this.Camera2StreamConfigurationMap = mapper3;
    }

    public /* synthetic */ ThalesPaymentListener(com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource thalesPaymentDataSource, com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher cardPaymentKeysReplenisher, com.paypal.android.taptopay.data.thales.card.CardDataSource cardDataSource, com.paypal.android.taptopay.data.thales.payment.mapper.TransactionContextMapper transactionContextMapper, com.paypal.android.taptopay.data.thales.payment.mapper.PaymentErrorCodeMapper paymentErrorCodeMapper, com.paypal.android.taptopay.data.thales.payment.mapper.CHVVerificationMethodMapper cHVVerificationMethodMapper, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(thalesPaymentDataSource, cardPaymentKeysReplenisher, cardDataSource, (i & 8) != 0 ? new com.paypal.android.taptopay.data.thales.payment.mapper.TransactionContextMapper(null, null, null, null, 15, null) : transactionContextMapper, (i & 16) != 0 ? new com.paypal.android.taptopay.data.thales.payment.mapper.PaymentErrorCodeMapper() : paymentErrorCodeMapper, (i & 32) != 0 ? new com.paypal.android.taptopay.data.thales.payment.mapper.CHVVerificationMethodMapper() : cHVVerificationMethodMapper);
    }

    @Override // com.gemalto.mfs.mwsdk.payment.PaymentServiceListener
    public final void onAuthenticationRequired(com.gemalto.mfs.mwsdk.payment.engine.PaymentService paymentService, final com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cvm, long cvmResetTimeout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cvm, "");
        try {
            com.paypal.android.logger.Logger.i$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Authentication required", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cvm", cvm), kotlin.TuplesKt.to("cvmResetTimeout", java.lang.Long.valueOf(cvmResetTimeout))), null, 4, null);
            this.getHighSpeedVideoFpsRangesFor.updateState(new com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.AuthenticationRequired(this.Camera2StreamConfigurationMap.map(cvm), cvmResetTimeout, null, null, null, null, new kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit>() { // from class: com.paypal.android.taptopay.data.thales.payment.ThalesPaymentListener$onAuthenticationRequired$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool) {
                    getHighSpeedVideoFpsRangesFor(bool.booleanValue());
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.payment.ThalesPaymentListener$onAuthenticationRequired$1$1", f = "ThalesPaymentListener.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.paypal.android.taptopay.data.thales.payment.ThalesPaymentListener$onAuthenticationRequired$1$1, reason: invalid class name */
                static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                    final /* synthetic */ boolean Camera2StreamConfigurationMap;
                    int getHighSpeedVideoFpsRanges;
                    final /* synthetic */ com.gemalto.mfs.mwsdk.payment.CHVerificationMethod getHighSpeedVideoSizes;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.getHighSpeedVideoFpsRanges != 0) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.lang.Object cHVerifier = com.gemalto.mfs.mwsdk.payment.PaymentBusinessManager.getPaymentBusinessService().getActivatedPaymentService().getCHVerifier(this.getHighSpeedVideoSizes);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(cHVerifier, "");
                        com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMVerifier deviceCVMVerifier = (com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMVerifier) cHVerifier;
                        deviceCVMVerifier.setDeviceCVMVerifyListener(new com.paypal.android.taptopay.data.thales.payment.ThalesDeviceCvmVerifyListener());
                        if (this.Camera2StreamConfigurationMap) {
                            deviceCVMVerifier.onDelegatedAuthPerformed(java.lang.System.currentTimeMillis());
                        } else {
                            deviceCVMVerifier.onDelegatedAuthCancelled();
                        }
                        return kotlin.Unit.INSTANCE;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        return ((com.paypal.android.taptopay.data.thales.payment.ThalesPaymentListener$onAuthenticationRequired$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                        return new com.paypal.android.taptopay.data.thales.payment.ThalesPaymentListener$onAuthenticationRequired$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod, boolean z, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.payment.ThalesPaymentListener$onAuthenticationRequired$1.AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.getHighSpeedVideoSizes = cHVerificationMethod;
                        this.Camera2StreamConfigurationMap = z;
                    }
                }

                public final void getHighSpeedVideoFpsRangesFor(boolean z) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getMain()), null, null, new com.paypal.android.taptopay.data.thales.payment.ThalesPaymentListener$onAuthenticationRequired$1.AnonymousClass1(com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.this, z, null), 3, null);
                }

                {
                    super(1);
                }
            }, 60, null));
        } catch (java.lang.Throwable th) {
            com.paypal.android.logger.Logger.e$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Failed to update payment state", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("state", "AuthenticationRequired")), null, th, 4, null);
        }
    }

    @Override // com.gemalto.mfs.mwsdk.payment.PaymentServiceListener
    public final void onError(com.gemalto.mfs.mwsdk.sdkconfig.SDKError<com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode> error) {
        com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode;
        com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode errorCode;
        try {
            com.paypal.android.logger.Logger log = com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog();
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = kotlin.TuplesKt.to("errorCode", java.lang.String.valueOf(error != null ? error.getErrorCode() : null));
            pairArr[1] = kotlin.TuplesKt.to("errorMessage", error != null ? error.getErrorMessage() : null);
            com.paypal.android.logger.Logger.w$default(log, "Transaction error", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getMain()), null, null, new com.paypal.android.taptopay.data.thales.payment.ThalesPaymentListener$onError$1(this, null), 3, null);
            if (error == null || (errorCode = error.getErrorCode()) == null || (paymentErrorCode = this.getHighResolutionOutputSizeshNQ4ISI.map(errorCode)) == null) {
                paymentErrorCode = com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.UNKNOWN;
            }
            this.getHighSpeedVideoFpsRangesFor.updateState(new com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.TransactionError(paymentErrorCode));
        } catch (java.lang.Throwable th) {
            com.paypal.android.logger.Logger.e$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Failed to update payment state", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("state", "TransactionError")), null, th, 4, null);
        }
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener
    public final void onReadyToTap(com.gemalto.mfs.mwsdk.payment.engine.PaymentService paymentService) {
        com.paypal.android.logger.Logger.i$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Device is ready for tap", null, null, 6, null);
        this.getHighSpeedVideoFpsRangesFor.updateState(com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.ReadyForSecondTap.INSTANCE);
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener
    public final void onTransactionCompleted(com.gemalto.mfs.mwsdk.payment.engine.TransactionContext transactionContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionContext, "");
        try {
            com.paypal.android.logger.Logger.i$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Transaction completed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("transactionContext", com.paypal.android.taptopay.data.thales.payment.ExtensionsKt.toLogAttributes(transactionContext))), null, 4, null);
            this.getHighSpeedVideoFpsRangesFor.updateState(new com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.TransactionCompleted(this.getInputSizeshNQ4ISI.map(transactionContext)));
        } catch (java.lang.Throwable th) {
            com.paypal.android.logger.Logger.e$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Failed to update payment state", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("state", "TransactionError")), null, th, 4, null);
        }
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener
    public final void onNextTransactionReady(com.gemalto.mfs.mwsdk.payment.engine.DeactivationStatus deactivationStatus, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus digitalizedCardStatus, com.gemalto.mfs.mwsdk.dcm.DigitalizedCard digitalizedCard) {
        try {
            com.paypal.android.logger.Logger log = com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog();
            kotlin.Pair[] pairArr = new kotlin.Pair[3];
            pairArr[0] = kotlin.TuplesKt.to("deactivationStatus", deactivationStatus != null ? deactivationStatus.getSdkStatusCode() : null);
            pairArr[1] = kotlin.TuplesKt.to("digitalizedCardStatus", digitalizedCardStatus);
            pairArr[2] = kotlin.TuplesKt.to("digitalizedCardId", digitalizedCard != null ? digitalizedCard.getTokenizedCardID() : null);
            com.paypal.android.logger.Logger.i$default(log, "onNextTransactionReady", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            this.getHighSpeedVideoFpsRangesFor.updateState(com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.Idle.INSTANCE);
        } catch (java.lang.Throwable th) {
            com.paypal.android.logger.Logger.e$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Failed to update payment state", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("state", "TransactionError")), null, th, 4, null);
        }
        if (digitalizedCard == null || digitalizedCardStatus == null) {
            return;
        }
        try {
            com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher.replenishKeysIfNeeded$default(this.getHighSpeedVideoFpsRanges, digitalizedCard, digitalizedCardStatus, false, 4, null);
        } catch (java.lang.Throwable th2) {
            com.paypal.android.logger.Logger.e$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Failed attempt to replenish card payment keys", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("tokenizedCardId", digitalizedCard.getTokenizedCardID()), kotlin.TuplesKt.to("numberOfPaymentsLeft", java.lang.Integer.valueOf(digitalizedCardStatus.getNumberOfPaymentsLeft()))), null, th2, 4, null);
        }
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener
    public final void onTransactionStarted() {
        com.paypal.android.logger.Logger.i$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Transaction started", null, null, 6, null);
        this.getHighSpeedVideoFpsRangesFor.updateState(com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.TransactionStarted.INSTANCE);
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener
    public final void onFirstTapCompleted() {
        com.paypal.android.logger.Logger.i$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "First tap completed", null, null, 6, null);
        this.getHighSpeedVideoFpsRangesFor.updateState(com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.FirstTapCompleted.INSTANCE);
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener
    public final void onTransactionInterrupted(int transactionInterruptedCode, java.lang.String transactionInterruptedMessage, int retryCount) {
        com.paypal.android.logger.Logger.i$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Transaction interrupted", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("transactionInterruptedCode", java.lang.Integer.valueOf(transactionInterruptedCode)), kotlin.TuplesKt.to("transactionInterruptedMessage", transactionInterruptedMessage), kotlin.TuplesKt.to("retryCount", java.lang.Integer.valueOf(retryCount))), null, 4, null);
        if (transactionInterruptedMessage == null) {
            transactionInterruptedMessage = "";
        }
        this.getHighSpeedVideoFpsRangesFor.updateState(new com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.TransactionInterrupted(transactionInterruptedCode, transactionInterruptedMessage, 3));
    }
}
