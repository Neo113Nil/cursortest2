package com.paypal.android.taptopay.data.thales.replenishment;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Lcom/paypal/android/taptopay/domain/Result;", "", "Lcom/paypal/android/taptopay/domain/model/replenishment/ReplenishPaymentKeysError;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.replenishment.ReplenishPaymentKeysUseCase$invoke$2", f = "ReplenishPaymentKeysUseCase.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class ReplenishPaymentKeysUseCase$invoke$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<? extends kotlin.Unit, com.paypal.android.taptopay.domain.model.replenishment.ReplenishPaymentKeysError>>, java.lang.Object> {
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        boolean z = this.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizes = str;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoFpsRanges = 1;
        com.paypal.android.taptopay.data.thales.replenishment.ReplenishPaymentKeysUseCase$invoke$2 replenishPaymentKeysUseCase$invoke$2 = this;
        kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(replenishPaymentKeysUseCase$invoke$2));
        final kotlin.coroutines.SafeContinuation safeContinuation2 = safeContinuation;
        com.gemalto.mfs.mwsdk.provisioning.ProvisioningServiceManager.getProvisioningBusinessService().sendRequestForReplenishment(str, new com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener() { // from class: com.paypal.android.taptopay.data.thales.replenishment.ReplenishPaymentKeysUseCase$invoke$2$1$1
            private final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicBoolean(false);

            private final void getHighSpeedVideoFpsRanges(com.paypal.android.taptopay.domain.Result<kotlin.Unit, com.paypal.android.taptopay.domain.model.replenishment.ReplenishPaymentKeysError> p0) {
                if (this.getHighSpeedVideoFpsRangesFor.compareAndSet(false, true)) {
                    kotlin.coroutines.Continuation<com.paypal.android.taptopay.domain.Result<kotlin.Unit, com.paypal.android.taptopay.domain.model.replenishment.ReplenishPaymentKeysError>> continuation = safeContinuation2;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    continuation.resumeWith(kotlin.Result.m23436constructorimpl(p0));
                    return;
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Ignoring callback as continuation is already resumed", null, null, 6, null);
            }

            @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
            public final void onError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError error) {
                com.paypal.android.logger.LogLevel logLevel;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes sdkErrorCode = error.getSdkErrorCode();
                int i2 = sdkErrorCode == null ? -1 : com.paypal.android.taptopay.data.thales.replenishment.ReplenishPaymentKeysUseCase$invoke$2$1$1.WhenMappings.$EnumSwitchMapping$0[sdkErrorCode.ordinal()];
                if (i2 == 1 || i2 == 2 || i2 == 3) {
                    logLevel = com.paypal.android.logger.LogLevel.WARN;
                } else {
                    logLevel = com.paypal.android.logger.LogLevel.ERROR;
                }
                java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorMessage", error.getErrorMessage()), kotlin.TuplesKt.to("cpsErrorCode", java.lang.Integer.valueOf(error.getCpsErrorCode())), kotlin.TuplesKt.to("sdkErrorCode", error.getSdkErrorCode().name()));
                if (com.paypal.android.logger.LogLevel.ERROR == logLevel) {
                    com.paypal.android.logger.Logger.e$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "PushServiceListener onError", mapOf, null, error.getCausingException(), 4, null);
                } else {
                    com.paypal.android.logger.Logger.w$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "PushServiceListener onError", mapOf, null, 4, null);
                }
                getHighSpeedVideoFpsRanges(new com.paypal.android.taptopay.domain.Result.Failure(new com.paypal.android.taptopay.domain.model.replenishment.ReplenishPaymentKeysError.DefaultError("PushServiceListener onError")));
            }

            @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
            public final void onUnsupportedPushContent(android.os.Bundle bundle) {
                com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "onUnsupportedPushContent", null, null, 6, null);
            }

            @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
            public final void onServerMessage(java.lang.String tokenizedCardId, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceMessage message) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
                com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Received replenishment service message", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("tokenizedCardId", tokenizedCardId), kotlin.TuplesKt.to("msgCode", message.getMsgCode()), kotlin.TuplesKt.to("msgSeverity", message.getMsgSeverity()), kotlin.TuplesKt.to("msgText", message.getMsgText()), kotlin.TuplesKt.to("msgParams", message.getMsgParams())), null, 4, null);
            }

            @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
            public final void onComplete() {
                com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Completed processing of replenishment service message", null, null, 6, null);
                getHighSpeedVideoFpsRanges(new com.paypal.android.taptopay.domain.Result.Success(kotlin.Unit.INSTANCE));
            }

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.values().length];
                    try {
                        iArr[com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_NO_INTERNET.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    try {
                        iArr[com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_COMM_ERROR.ordinal()] = 2;
                    } catch (java.lang.NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_COMM_TIMEOUT_ERROR.ordinal()] = 3;
                    } catch (java.lang.NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }
        }, z);
        java.lang.Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(replenishPaymentKeysUseCase$invoke$2);
        }
        return orThrow == coroutine_suspended ? coroutine_suspended : orThrow;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<? extends kotlin.Unit, com.paypal.android.taptopay.domain.model.replenishment.ReplenishPaymentKeysError>> continuation) {
        return ((com.paypal.android.taptopay.data.thales.replenishment.ReplenishPaymentKeysUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.android.taptopay.data.thales.replenishment.ReplenishPaymentKeysUseCase$invoke$2(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReplenishPaymentKeysUseCase$invoke$2(java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.replenishment.ReplenishPaymentKeysUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = z;
    }
}
