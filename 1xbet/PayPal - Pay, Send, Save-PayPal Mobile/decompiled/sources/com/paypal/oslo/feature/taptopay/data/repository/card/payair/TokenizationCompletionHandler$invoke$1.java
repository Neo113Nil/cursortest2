package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationCompletionHandler$invoke$1", f = "TokenizationCompletionHandler.kt", i = {0, 1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5}, l = {64, 67, 77, 96, 113, 127}, m = "invokeSuspend", n = {"$this$channelFlow", "$this$channelFlow", "$this$channelFlow", "result", "$this$channelFlow", "result", "completeTokenizeData", "$this$channelFlow", "result", "completeTokenizeData", "$this$channelFlow", "result", "completeTokenizeData"}, nl = {65, 74, 80, 99, 117, 74}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes15.dex */
final class TokenizationCompletionHandler$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.payair.model.StartTokenizeData getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationCompletionHandler getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputFormats;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x01c5, code lost:
    
        if (r4.invoke(r3.getNetworkTokenReference(), com.paypal.oslo.feature.taptopay.data.repository.card.payair.ExtensionsKt.toIdentityVerificationMethod(r3.getAuthenticationMethods())).collect(new com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationCompletionHandler$invoke$1.AnonymousClass2<>(), r26) == r2) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0273, code lost:
    
        if (com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler.m20013invokeHG0u8IE$default(r13, r3.getNetworkTokenReference(), 0, 2, null).collect(new com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationCompletionHandler$invoke$1.AnonymousClass1(), r26) == r2) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00da, code lost:
    
        if (r1.send(new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DigitizationFailed("Failed to complete tokenization", null, 2, null), r26) == r2) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0155, code lost:
    
        if (r1.send(new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.DigitizationCompleted(r3.getNetworkTokenReference()), r26) != r2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0091, code lost:
    
        if (r3 != r2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0064, code lost:
    
        if (r1.send(com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.DigitizingCard.INSTANCE, r26) != r2) goto L13;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher;
        java.lang.Object withContext;
        com.payair.model.Response response;
        com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource cardDataSource;
        com.payair.model.CompleteTokenizeData completeTokenizeData;
        com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler cardProvisionHandler;
        com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler activationCodeRequestHandler;
        final kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getInputFormats;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.getHighSpeedVideoFpsRanges) {
            case 0:
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Running TokenizationCompletionHandler", null, null, 6, null);
                this.getInputFormats = producerScope;
                this.getHighSpeedVideoFpsRanges = 1;
                break;
            case 1:
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Digitization in progress", null, null, 6, null);
                coroutineDispatcher = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
                this.getInputFormats = producerScope;
                this.getHighSpeedVideoFpsRanges = 2;
                withContext = kotlinx.coroutines.BuildersKt.withContext(coroutineDispatcher, new com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationCompletionHandler$invoke$1$result$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, null), this);
                break;
            case 2:
                kotlin.ResultKt.throwOnFailure(obj);
                withContext = obj;
                response = (com.payair.model.Response) withContext;
                if (response instanceof com.payair.model.Response.Error) {
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "TokenizationCompletionHandler failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", kotlin.coroutines.jvm.internal.Boxing.boxInt(((com.payair.model.Response.Error) response).getErrorCode()))), null, null, 12, null);
                    this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope);
                    this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response);
                    this.getHighSpeedVideoFpsRanges = 3;
                    break;
                } else if (response instanceof com.payair.model.Response.Success) {
                    cardDataSource = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
                    cardDataSource.rehydrate$taptopay_prodRelease();
                    java.lang.Object data = ((com.payair.model.Response.Success) response).getData();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(data, "");
                    completeTokenizeData = (com.payair.model.CompleteTokenizeData) data;
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "TokenizationCompletionHandler completed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("networkTokenReference", completeTokenizeData.getNetworkTokenReference()), kotlin.TuplesKt.to("status", completeTokenizeData.getStatus())), null, 4, null);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Digitization Completed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("networkTokenReference", completeTokenizeData.getNetworkTokenReference())), null, 4, null);
                    this.getInputFormats = producerScope;
                    this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response);
                    this.getHighSpeedVideoFpsRangesFor = completeTokenizeData;
                    this.getHighSpeedVideoFpsRanges = 4;
                    break;
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return coroutine_suspended;
            case 3:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            case 4:
                completeTokenizeData = (com.payair.model.CompleteTokenizeData) this.getHighSpeedVideoFpsRangesFor;
                response = (com.payair.model.Response) this.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                java.util.List<com.payair.model.CompleteTokenizeData.AuthenticationMethod> authenticationMethods = completeTokenizeData.getAuthenticationMethods();
                if (authenticationMethods == null || authenticationMethods.isEmpty()) {
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
                    kotlin.Pair[] pairArr = new kotlin.Pair[6];
                    pairArr[0] = kotlin.TuplesKt.to("cardReference", this.getHighResolutionOutputSizeshNQ4ISI.getCardReference());
                    pairArr[1] = kotlin.TuplesKt.to("cardStatus", completeTokenizeData.getStatus());
                    pairArr[2] = kotlin.TuplesKt.to("issuerPanReference", this.getHighResolutionOutputSizeshNQ4ISI.getIssuerPanReference());
                    pairArr[3] = kotlin.TuplesKt.to("panEnrollmentId", this.getHighResolutionOutputSizeshNQ4ISI.getPanEnrollmentId());
                    com.payair.model.ProductConfig productConfig = completeTokenizeData.getProductConfig();
                    pairArr[4] = kotlin.TuplesKt.to("issuerName", productConfig != null ? productConfig.getIssuerName() : null);
                    com.payair.model.ProductConfig productConfig2 = completeTokenizeData.getProductConfig();
                    pairArr[5] = kotlin.TuplesKt.to("bankAppName", productConfig2 != null ? productConfig2.getBankAppName() : null);
                    com.paypal.android.logger.Logger.d$default(logger, "Completed card provisioning", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                    cardProvisionHandler = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
                    this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope);
                    this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response);
                    this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(completeTokenizeData);
                    this.getHighSpeedVideoFpsRanges = 5;
                    break;
                } else {
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Yellow path encountered", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("networkTokenReference", completeTokenizeData.getNetworkTokenReference()), kotlin.TuplesKt.to("status", completeTokenizeData.getStatus())), null, 4, null);
                    activationCodeRequestHandler = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
                    this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope);
                    this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response);
                    this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(completeTokenizeData);
                    this.getHighSpeedVideoFpsRanges = 6;
                    break;
                }
            case 5:
            case 6:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationCompletionHandler$invoke$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationCompletionHandler$invoke$1 tokenizationCompletionHandler$invoke$1 = new com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationCompletionHandler$invoke$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        tokenizationCompletionHandler$invoke$1.getInputFormats = obj;
        return tokenizationCompletionHandler$invoke$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TokenizationCompletionHandler$invoke$1(com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationCompletionHandler tokenizationCompletionHandler, com.payair.model.StartTokenizeData startTokenizeData, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationCompletionHandler$invoke$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = tokenizationCompletionHandler;
        this.getHighResolutionOutputSizeshNQ4ISI = startTokenizeData;
    }
}
