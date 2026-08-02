package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/paypal/android/taptopay/domain/model/card/AddCardState;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$addCard$1", f = "ThalesCardRepository.kt", i = {0, 2, 4, 5, 6, 6, 7, 7}, l = {110, 120, 126, 132, 137, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 143, 145, 146, 149, 160}, m = "invokeSuspend", n = {"$this$channelFlow", "$this$channelFlow", "$this$channelFlow", "$this$channelFlow", "$this$channelFlow", "tc", "$this$channelFlow", "tc"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes4.dex */
final class ThalesCardRepository$addCard$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.paypal.android.taptopay.domain.model.card.AddCardState>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ byte[] Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.android.taptopay.data.thales.card.ThalesCardRepository getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x01d7, code lost:
    
        if (com.paypal.android.taptopay.data.thales.card.ThalesCardRepository.access$digitizeCard(r13.getHighSpeedVideoSizes, r2, r1.accept(), r13) == r0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x01c0, code lost:
    
        if (r2.send(com.paypal.android.taptopay.domain.model.card.AddCardState.Success.DigitizingCard.INSTANCE, r13) != r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x01f8, code lost:
    
        if (r2.send(com.paypal.android.taptopay.domain.model.card.AddCardState.Failure.UserDeclinedTermsAndConditions.INSTANCE, r13) == r0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x022c, code lost:
    
        if (r1.send(r14.getError(), r13) == r0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0167, code lost:
    
        if (r14 != r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0135, code lost:
    
        if (r1.send(new com.paypal.android.taptopay.domain.model.card.AddCardState.Failure.InitCheckFailed("Thales MG not initialized.\nWas ThalesMobileGateway.init() call successful?", null, 2, null), r13) != r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0155, code lost:
    
        if (r1.send(com.paypal.android.taptopay.domain.model.card.AddCardState.Success.EligibilityCheck.INSTANCE, r13) != r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e3, code lost:
    
        if (r1.send(new com.paypal.android.taptopay.domain.model.card.AddCardState.Failure.InitCheckFailed(r14.getDebugMessage(), r14.getThrowable()), r13) != r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0107, code lost:
    
        if (r1.send(com.paypal.android.taptopay.domain.model.card.AddCardState.Success.AddCardInitiated.INSTANCE, r13) != r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ProducerScope producerScope;
        com.paypal.android.taptopay.domain.Result result;
        com.gemalto.mfs.mwsdk.mobilegateway.enrollment.TermsAndConditions termsAndConditions;
        kotlinx.coroutines.channels.ProducerScope producerScope2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.getHighSpeedVideoFpsRanges) {
            case 0:
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.channels.ProducerScope producerScope3 = (kotlinx.coroutines.channels.ProducerScope) this.getHighResolutionOutputSizeshNQ4ISI;
                com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Running add card", null, null, 6, null);
                this.getHighResolutionOutputSizeshNQ4ISI = producerScope3;
                this.getHighSpeedVideoFpsRanges = 1;
                java.lang.Object init$tap_to_pay_data_thales_release = com.paypal.android.taptopay.data.thales.card.ThalesCardRepository.access$getThalesWalletSecureEnrollment(this.getHighSpeedVideoSizes).init$tap_to_pay_data_thales_release(this);
                if (init$tap_to_pay_data_thales_release != coroutine_suspended) {
                    producerScope = producerScope3;
                    obj = init$tap_to_pay_data_thales_release;
                    result = (com.paypal.android.taptopay.domain.Result) obj;
                    if (!(result instanceof com.paypal.android.taptopay.domain.Result.Failure)) {
                        com.paypal.android.taptopay.data.thales.init.InitError initError = (com.paypal.android.taptopay.data.thales.init.InitError) ((com.paypal.android.taptopay.domain.Result.Failure) result).getError();
                        com.paypal.android.logger.Logger log = com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog();
                        kotlin.Pair[] pairArr = new kotlin.Pair[2];
                        java.lang.Throwable throwable = initError.getThrowable();
                        pairArr[0] = kotlin.TuplesKt.to("errorMessage", throwable != null ? throwable.getMessage() : null);
                        pairArr[1] = kotlin.TuplesKt.to("debugMessage", initError.getDebugMessage());
                        com.paypal.android.logger.Logger.i$default(log, "Add card call failed", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                        this.getHighResolutionOutputSizeshNQ4ISI = null;
                        this.getHighSpeedVideoFpsRanges = 2;
                        break;
                    } else {
                        if (result instanceof com.paypal.android.taptopay.domain.Result.Success) {
                            com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Add card call succeeded", null, null, 6, null);
                            this.getHighResolutionOutputSizeshNQ4ISI = producerScope;
                            this.getHighSpeedVideoFpsRanges = 3;
                            break;
                        }
                        if (com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayManager.INSTANCE.getConfigurationState() == com.gemalto.mfs.mwsdk.mobilegateway.MGSDKConfigurationState.CONFIGURED) {
                            com.paypal.android.logger.Logger.e$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Unexpected add card error, sdk not initialized", null, null, null, 14, null);
                            this.getHighResolutionOutputSizeshNQ4ISI = null;
                            this.getHighSpeedVideoFpsRanges = 4;
                            break;
                        } else {
                            com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Starting eligibility check", null, null, 6, null);
                            this.getHighResolutionOutputSizeshNQ4ISI = producerScope;
                            this.getHighSpeedVideoFpsRanges = 5;
                            break;
                        }
                    }
                }
                return coroutine_suspended;
            case 1:
                producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                result = (com.paypal.android.taptopay.domain.Result) obj;
                if (!(result instanceof com.paypal.android.taptopay.domain.Result.Failure)) {
                }
                return coroutine_suspended;
            case 2:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            case 3:
                producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                if (com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayManager.INSTANCE.getConfigurationState() == com.gemalto.mfs.mwsdk.mobilegateway.MGSDKConfigurationState.CONFIGURED) {
                }
                return coroutine_suspended;
            case 4:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            case 5:
                producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighResolutionOutputSizeshNQ4ISI = producerScope;
                this.getHighSpeedVideoFpsRanges = 6;
                obj = com.paypal.android.taptopay.data.thales.card.ThalesCardRepository.access$checkEligibility(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this);
                break;
            case 6:
                producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.android.taptopay.domain.Result result2 = (com.paypal.android.taptopay.domain.Result) obj;
                if (result2 instanceof com.paypal.android.taptopay.domain.Result.Success) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Successfully completed eligibility check", null, null, 6, null);
                    com.gemalto.mfs.mwsdk.mobilegateway.enrollment.TermsAndConditions termsAndConditions2 = (com.gemalto.mfs.mwsdk.mobilegateway.enrollment.TermsAndConditions) ((com.paypal.android.taptopay.domain.Result.Success) result2).getResult();
                    this.getHighResolutionOutputSizeshNQ4ISI = producerScope;
                    this.getHighSpeedVideoFpsRangesFor = termsAndConditions2;
                    this.getHighSpeedVideoFpsRanges = 7;
                    java.lang.Object access$handleTermsAndConditions = com.paypal.android.taptopay.data.thales.card.ThalesCardRepository.access$handleTermsAndConditions(this.getHighSpeedVideoSizes, producerScope, termsAndConditions2, this);
                    if (access$handleTermsAndConditions != coroutine_suspended) {
                        kotlinx.coroutines.channels.ProducerScope producerScope4 = producerScope;
                        termsAndConditions = termsAndConditions2;
                        obj = access$handleTermsAndConditions;
                        producerScope2 = producerScope4;
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Handling t&c acceptance", null, null, 6, null);
                            this.getHighResolutionOutputSizeshNQ4ISI = producerScope2;
                            this.getHighSpeedVideoFpsRangesFor = termsAndConditions;
                            this.getHighSpeedVideoFpsRanges = 8;
                            break;
                        } else {
                            com.paypal.android.logger.Logger.i$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Handling t&c decline", null, null, 6, null);
                            this.getHighResolutionOutputSizeshNQ4ISI = null;
                            this.getHighSpeedVideoFpsRangesFor = null;
                            this.getHighSpeedVideoFpsRanges = 10;
                            break;
                        }
                    }
                } else {
                    if (result2 instanceof com.paypal.android.taptopay.domain.Result.Failure) {
                        com.paypal.android.taptopay.domain.Result.Failure failure = (com.paypal.android.taptopay.domain.Result.Failure) result2;
                        com.paypal.android.logger.Logger.i$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Eligibility check failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", failure.getError())), null, 4, null);
                        this.getHighResolutionOutputSizeshNQ4ISI = null;
                        this.getHighSpeedVideoFpsRanges = 11;
                        break;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                return coroutine_suspended;
            case 7:
                termsAndConditions = (com.gemalto.mfs.mwsdk.mobilegateway.enrollment.TermsAndConditions) this.getHighSpeedVideoFpsRangesFor;
                producerScope2 = (kotlinx.coroutines.channels.ProducerScope) this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                if (!((java.lang.Boolean) obj).booleanValue()) {
                }
                return coroutine_suspended;
            case 8:
                termsAndConditions = (com.gemalto.mfs.mwsdk.mobilegateway.enrollment.TermsAndConditions) this.getHighSpeedVideoFpsRangesFor;
                producerScope2 = (kotlinx.coroutines.channels.ProducerScope) this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                this.getHighSpeedVideoFpsRangesFor = null;
                this.getHighSpeedVideoFpsRanges = 9;
                break;
            case 9:
            case 10:
            case 11:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.android.taptopay.domain.model.card.AddCardState> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$addCard$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$addCard$1 thalesCardRepository$addCard$1 = new com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$addCard$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
        thalesCardRepository$addCard$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return thalesCardRepository$addCard$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThalesCardRepository$addCard$1(com.paypal.android.taptopay.data.thales.card.ThalesCardRepository thalesCardRepository, byte[] bArr, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$addCard$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = thalesCardRepository;
        this.Camera2StreamConfigurationMap = bArr;
    }
}
