package com.paypal.oslo.feature.identity.connect.inboundconnect.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel$retrieveConnectUrl$1", f = "InboundConnectViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE}, m = "invokeSuspend", n = {}, nl = {489}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class InboundConnectViewModel$retrieveConnectUrl$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectRequest getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ba, code lost:
    
        r2 = r0.getHighSpeedVideoFpsRangesFor;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.identity.connect.inboundconnect.domain.usecase.InboundConnectUseCase inboundConnectUseCase;
        java.lang.String highResolutionOutputSizeshNQ4ISI;
        com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsHelper connectAnalyticsHelper;
        java.lang.String highResolutionOutputSizeshNQ4ISI2;
        com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsHelper connectAnalyticsHelper2;
        com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsHelper connectAnalyticsHelper3;
        com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsHelper connectAnalyticsHelper4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            inboundConnectUseCase = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = inboundConnectUseCase.invoke(this.getHighSpeedVideoFpsRangesFor, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel inboundConnectViewModel = this.getHighSpeedVideoSizes;
        com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectRequest inboundConnectRequest = this.getHighSpeedVideoFpsRangesFor;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectResult inboundConnectResult = (com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectResult) ((arrow.core.Either.Right) either).getValue();
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Inbound Connect URL retrieved successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("urlLength", kotlin.coroutines.jvm.internal.Boxing.boxInt(inboundConnectResult.getConnectUrl().length()))), null, 4, null);
            if (!kotlin.text.StringsKt.isBlank(inboundConnectResult.getConnectUrl())) {
                connectAnalyticsHelper4 = inboundConnectViewModel.getHighSpeedVideoFpsRangesFor;
                if (connectAnalyticsHelper4 != null) {
                    connectAnalyticsHelper4.trackUrlRetrievalSucceeded$identity_prodRelease();
                }
                inboundConnectViewModel.processEvent(new com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.ConnectUrlRetrieved(inboundConnectResult.getConnectUrl()));
            } else {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Empty connect URL received from backend - treating as error", null, null, 6, null);
                java.lang.String valueOf = java.lang.String.valueOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectError.InvalidRedirectUri.class).getSimpleName());
                highResolutionOutputSizeshNQ4ISI2 = com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel.getHighResolutionOutputSizeshNQ4ISI(inboundConnectRequest, com.paypal.oslo.feature.identity.connect.shared.utils.ConnectConstants.COMMON_ERROR);
                connectAnalyticsHelper2 = inboundConnectViewModel.getHighSpeedVideoFpsRangesFor;
                if (connectAnalyticsHelper2 != null) {
                    connectAnalyticsHelper2.trackUrlRetrievalFailed$identity_prodRelease(valueOf, highResolutionOutputSizeshNQ4ISI2, com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectError.InvalidRedirectUri.INSTANCE.toString());
                }
                if (!kotlin.text.StringsKt.isBlank(highResolutionOutputSizeshNQ4ISI2) && connectAnalyticsHelper3 != null) {
                    connectAnalyticsHelper3.trackFlowFailed$identity_prodRelease(valueOf, highResolutionOutputSizeshNQ4ISI2);
                }
                inboundConnectViewModel.processEvent(new com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.UrlRetrievalFailed(highResolutionOutputSizeshNQ4ISI2));
            }
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectError inboundConnectError = (com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectError) ((arrow.core.Either.Left) either).getValue();
            highResolutionOutputSizeshNQ4ISI = com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel.getHighResolutionOutputSizeshNQ4ISI(inboundConnectRequest, com.paypal.oslo.feature.identity.connect.shared.utils.ConnectConstants.COMMON_ERROR);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Inbound Connect URL retrieval failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(inboundConnectError.getClass()).getSimpleName()), kotlin.TuplesKt.to("error", inboundConnectError.toString())), null, 4, null);
            connectAnalyticsHelper = inboundConnectViewModel.getHighSpeedVideoFpsRangesFor;
            if (connectAnalyticsHelper != null) {
                connectAnalyticsHelper.trackUrlRetrievalFailed$identity_prodRelease(java.lang.String.valueOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(inboundConnectError.getClass()).getSimpleName()), highResolutionOutputSizeshNQ4ISI, inboundConnectError.toString());
            }
            inboundConnectViewModel.processEvent(new com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectEvent.UrlRetrievalFailed(highResolutionOutputSizeshNQ4ISI));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel$retrieveConnectUrl$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel$retrieveConnectUrl$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InboundConnectViewModel$retrieveConnectUrl$1(com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel inboundConnectViewModel, com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectRequest inboundConnectRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel$retrieveConnectUrl$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = inboundConnectViewModel;
        this.getHighSpeedVideoFpsRangesFor = inboundConnectRequest;
    }
}
