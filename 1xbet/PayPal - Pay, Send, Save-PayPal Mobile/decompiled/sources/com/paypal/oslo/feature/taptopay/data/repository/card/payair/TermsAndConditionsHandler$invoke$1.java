package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler$invoke$1", f = "TermsAndConditionsHandler.kt", i = {0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6}, l = {60, 64, 73, 80, 171, 103, 108}, m = "invokeSuspend", n = {"$this$channelFlow", "$this$channelFlow", "result", "$this$channelFlow", "result", "successResult", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "$this$channelFlow", "result", "successResult", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "firstAsset", "$this$channelFlow", "result", "successResult", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "firstAsset", "tacContent", "$i$f$suspendCancellableCoroutine", "$this$channelFlow", "result", "successResult", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "firstAsset", "tacContent", "tncAccepted", "$this$channelFlow", "result", "successResult", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "firstAsset", "tacContent", "tncAccepted"}, nl = {62, 65, 74, 81, 181, 107, 110}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0"}, v = 2)
/* loaded from: classes15.dex */
final class TermsAndConditionsHandler$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.payair.model.StartTokenizeData Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    boolean getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    private /* synthetic */ java.lang.Object getOutputStallDuration;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x021f, code lost:
    
        if (r8.invoke(r19.Camera2StreamConfigurationMap).collect(new com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler$invoke$1.AnonymousClass1<>(), r19) == r2) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0261, code lost:
    
        if (r1.send(com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.UserDeclinedTermsAndConditions.INSTANCE, r19) == r2) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c8, code lost:
    
        if (r1.send(new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DigitizationFailed("Failed to fetch terms and conditions", null, 2, null), r19) != r2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0115, code lost:
    
        if (r1.send(new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DigitizationFailed("Unexpected response data type for T&C", null, 2, null), r19) != r2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0165, code lost:
    
        if (r1.send(new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DigitizationFailed("Failed to fetch terms and conditions", null, 2, null), r19) != r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0094, code lost:
    
        if (r3 != r2) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0222  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object withContext;
        com.payair.model.Response response;
        com.payair.model.Asset asset;
        com.paypal.oslo.feature.taptopay.data.repository.card.payair.TACContent access$createTACContent;
        java.lang.Object result;
        com.payair.model.Response.Success success;
        java.lang.Object obj2;
        boolean booleanValue;
        com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationCompletionHandler tokenizationCompletionHandler;
        final kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getOutputStallDuration;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.getInputFormats) {
            case 0:
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Invoking TermsAndConditionsHandler", null, null, 6, null);
                com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler termsAndConditionsHandler = this.getHighSpeedVideoSizesFor;
                java.lang.String termsAndConditionsAssetId = this.Camera2StreamConfigurationMap.getTermsAndConditionsAssetId();
                this.getOutputStallDuration = producerScope;
                this.getInputFormats = 1;
                withContext = kotlinx.coroutines.BuildersKt.withContext(termsAndConditionsHandler.getHighSpeedVideoSizes, new com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler$fetchTermsAndConditions$2(termsAndConditionsHandler, termsAndConditionsAssetId, null), this);
                break;
            case 1:
                kotlin.ResultKt.throwOnFailure(obj);
                withContext = obj;
                response = (com.payair.model.Response) withContext;
                if (response instanceof com.payair.model.Response.Error) {
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed to fetch T&C", null, null, null, 14, null);
                    this.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope);
                    this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response);
                    this.getInputFormats = 2;
                    break;
                } else {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(response, "");
                    com.payair.model.Response.Success success2 = (com.payair.model.Response.Success) response;
                    java.lang.Object data = success2.getData();
                    if (!(data instanceof com.payair.model.MediaContents)) {
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Unexpected response data type for T&C", null, null, null, 14, null);
                        this.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope);
                        this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response);
                        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(success2);
                        this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(data);
                        this.getInputFormats = 3;
                        break;
                    } else {
                        asset = (com.payair.model.Asset) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) ((com.payair.model.MediaContents) data).getAssets());
                        if (asset == null) {
                            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "No assets found in MediaContents", null, null, null, 14, null);
                            this.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope);
                            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response);
                            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(success2);
                            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(data);
                            this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(asset);
                            this.getInputFormats = 4;
                            break;
                        } else {
                            com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler termsAndConditionsHandler2 = this.getHighSpeedVideoSizesFor;
                            com.payair.model.AssetType assetType = asset.getAssetType();
                            java.lang.String stringFormatData = com.payair.model.AssetKt.getStringFormatData(asset);
                            access$createTACContent = com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler.access$createTACContent(termsAndConditionsHandler2, assetType, stringFormatData != null ? stringFormatData : "");
                            this.getOutputStallDuration = producerScope;
                            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response);
                            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(success2);
                            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(data);
                            this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(asset);
                            this.getOutputMinFrameDuration = access$createTACContent;
                            this.getHighSpeedVideoSizes = 0;
                            this.getInputFormats = 5;
                            com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler$invoke$1 termsAndConditionsHandler$invoke$1 = this;
                            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(termsAndConditionsHandler$invoke$1), 1);
                            cancellableContinuationImpl.initCancellability();
                            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(producerScope, null, null, new com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler$invoke$1$tncAccepted$1$1(producerScope, access$createTACContent, cancellableContinuationImpl, null), 3, null);
                            result = cancellableContinuationImpl.getResult();
                            if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(termsAndConditionsHandler$invoke$1);
                            }
                            if (result != coroutine_suspended) {
                                success = success2;
                                obj2 = data;
                                booleanValue = ((java.lang.Boolean) result).booleanValue();
                                if (!booleanValue) {
                                    tokenizationCompletionHandler = this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRangesFor;
                                    this.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope);
                                    this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response);
                                    this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(success);
                                    this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
                                    this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(asset);
                                    this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(access$createTACContent);
                                    this.getOutputFormats = booleanValue;
                                    this.getInputFormats = 6;
                                    break;
                                } else {
                                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "User declined terms and conditions", null, null, 6, null);
                                    this.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope);
                                    this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response);
                                    this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(success);
                                    this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
                                    this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(asset);
                                    this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(access$createTACContent);
                                    this.getOutputFormats = booleanValue;
                                    this.getInputFormats = 7;
                                    break;
                                }
                            }
                        }
                    }
                }
                return coroutine_suspended;
            case 2:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            case 3:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            case 4:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            case 5:
                access$createTACContent = (com.paypal.oslo.feature.taptopay.data.repository.card.payair.TACContent) this.getOutputMinFrameDuration;
                com.payair.model.Asset asset2 = (com.payair.model.Asset) this.getInputSizeshNQ4ISI;
                obj2 = this.getHighSpeedVideoFpsRangesFor;
                success = (com.payair.model.Response.Success) this.getHighResolutionOutputSizeshNQ4ISI;
                response = (com.payair.model.Response) this.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj);
                asset = asset2;
                result = obj;
                booleanValue = ((java.lang.Boolean) result).booleanValue();
                if (!booleanValue) {
                }
                break;
            case 6:
            case 7:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler$invoke$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler$invoke$1 termsAndConditionsHandler$invoke$1 = new com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler$invoke$1(this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap, continuation);
        termsAndConditionsHandler$invoke$1.getOutputStallDuration = obj;
        return termsAndConditionsHandler$invoke$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TermsAndConditionsHandler$invoke$1(com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler termsAndConditionsHandler, com.payair.model.StartTokenizeData startTokenizeData, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler$invoke$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = termsAndConditionsHandler;
        this.Camera2StreamConfigurationMap = startTokenizeData;
    }
}
