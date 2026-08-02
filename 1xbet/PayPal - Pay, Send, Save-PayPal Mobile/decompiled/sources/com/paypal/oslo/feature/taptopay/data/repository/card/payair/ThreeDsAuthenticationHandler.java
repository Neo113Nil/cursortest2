package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0014\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/ThreeDsAuthenticationHandler;", "", "Lcom/payair/logic/managers/TokenManager;", "tokenManager", "Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/CardProvisionHandler;", "cardProvisionHandler", "Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/TokenizationTimer;", "tokenizationTimer", "Lcom/paypal/oslo/feature/taptopay/data/payair/replenishment/PayairCardPaymentKeysReplenisher;", "payairCardPaymentKeysReplenisher", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/payair/logic/managers/TokenManager;Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/CardProvisionHandler;Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/TokenizationTimer;Lcom/paypal/oslo/feature/taptopay/data/payair/replenishment/PayairCardPaymentKeysReplenisher;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "networkTokenReference", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState;", "invoke", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoFpsRangesFor", "Lcom/payair/logic/managers/TokenManager;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/CardProvisionHandler;", "Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/TokenizationTimer;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/data/payair/replenishment/PayairCardPaymentKeysReplenisher;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/CoroutineDispatcher;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ThreeDsAuthenticationHandler {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.payair.replenishment.PayairCardPaymentKeysReplenisher Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.payair.logic.managers.TokenManager getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimer getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public ThreeDsAuthenticationHandler(com.payair.logic.managers.TokenManager tokenManager, com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler cardProvisionHandler, com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimer tokenizationTimer, com.paypal.oslo.feature.taptopay.data.payair.replenishment.PayairCardPaymentKeysReplenisher payairCardPaymentKeysReplenisher, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardProvisionHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenizationTimer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payairCardPaymentKeysReplenisher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoSizes = tokenManager;
        this.getHighResolutionOutputSizeshNQ4ISI = cardProvisionHandler;
        this.getHighSpeedVideoFpsRanges = tokenizationTimer;
        this.Camera2StreamConfigurationMap = payairCardPaymentKeysReplenisher;
        this.getHighSpeedVideoFpsRangesFor = coroutineDispatcher;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0251, code lost:
    
        if (r0.collect(r7, r3) != r4) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0136, code lost:
    
        if (r2.send(r0, r3) != r4) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x018b, code lost:
    
        if (r2.send(r0, r3) != r4) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01d3, code lost:
    
        if (r2.send(r0, r3) != r4) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e8, code lost:
    
        if (r5 != r4) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$handleSuccess(com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler threeDsAuthenticationHandler, kotlinx.coroutines.channels.ProducerScope producerScope, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler$handleSuccess$1 threeDsAuthenticationHandler$handleSuccess$1;
        kotlinx.coroutines.channels.ProducerScope producerScope2;
        java.lang.String str3;
        java.lang.Object withContext;
        com.payair.model.Response response;
        final kotlinx.coroutines.channels.ProducerScope producerScope3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.Object obj;
        java.lang.String str6 = str;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler$handleSuccess$1) {
            threeDsAuthenticationHandler$handleSuccess$1 = (com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler$handleSuccess$1) continuation;
            if ((threeDsAuthenticationHandler$handleSuccess$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                threeDsAuthenticationHandler$handleSuccess$1.getOutputFormats -= 2147483648;
                java.lang.Object obj2 = threeDsAuthenticationHandler$handleSuccess$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (threeDsAuthenticationHandler$handleSuccess$1.getOutputFormats) {
                    case 0:
                        kotlin.ResultKt.throwOnFailure(obj2);
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "3DS authentication succeeded", null, null, 6, null);
                        producerScope2 = producerScope;
                        threeDsAuthenticationHandler$handleSuccess$1.getHighSpeedVideoSizes = producerScope2;
                        threeDsAuthenticationHandler$handleSuccess$1.getHighSpeedVideoFpsRangesFor = str6;
                        threeDsAuthenticationHandler$handleSuccess$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                        threeDsAuthenticationHandler$handleSuccess$1.getOutputFormats = 1;
                        str3 = str2;
                        withContext = kotlinx.coroutines.BuildersKt.withContext(threeDsAuthenticationHandler.getHighSpeedVideoFpsRangesFor, new com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler$send3dsAuthenticationEvidence$2(threeDsAuthenticationHandler, str6, str3, null), threeDsAuthenticationHandler$handleSuccess$1);
                        break;
                    case 1:
                        java.lang.String str7 = (java.lang.String) threeDsAuthenticationHandler$handleSuccess$1.getHighSpeedVideoFpsRanges;
                        java.lang.String str8 = (java.lang.String) threeDsAuthenticationHandler$handleSuccess$1.getHighSpeedVideoFpsRangesFor;
                        kotlinx.coroutines.channels.ProducerScope producerScope4 = (kotlinx.coroutines.channels.ProducerScope) threeDsAuthenticationHandler$handleSuccess$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        str3 = str7;
                        str6 = str8;
                        withContext = obj2;
                        producerScope2 = producerScope4;
                        response = (com.payair.model.Response) withContext;
                        if (response instanceof com.payair.model.Response.Error) {
                            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "ThreeDsAuthenticationHandler failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorCode", kotlin.coroutines.jvm.internal.Boxing.boxInt(((com.payair.model.Response.Error) response).getErrorCode()))), null, 4, null);
                            com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DigitizationFailed digitizationFailed = new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DigitizationFailed("3DS activation failed", null, 2, null);
                            threeDsAuthenticationHandler$handleSuccess$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope2);
                            threeDsAuthenticationHandler$handleSuccess$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str6);
                            threeDsAuthenticationHandler$handleSuccess$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                            threeDsAuthenticationHandler$handleSuccess$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response);
                            threeDsAuthenticationHandler$handleSuccess$1.getOutputFormats = 2;
                            break;
                        } else {
                            if (!(response instanceof com.payair.model.Response.Success)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            java.lang.Object data = ((com.payair.model.Response.Success) response).getData();
                            if (!(data instanceof com.payair.model.ActivateCodeResponse)) {
                                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "ThreeDsAuthenticationHandler: invalid response type", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("responseData", data)), null, 4, null);
                                com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DigitizationFailed digitizationFailed2 = new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DigitizationFailed("3DS activation failed", null, 2, null);
                                threeDsAuthenticationHandler$handleSuccess$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope2);
                                threeDsAuthenticationHandler$handleSuccess$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str6);
                                threeDsAuthenticationHandler$handleSuccess$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                                threeDsAuthenticationHandler$handleSuccess$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response);
                                threeDsAuthenticationHandler$handleSuccess$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(data);
                                threeDsAuthenticationHandler$handleSuccess$1.getOutputFormats = 3;
                                break;
                            } else if (data != com.payair.model.ActivateCodeResponse.SUCCESS) {
                                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "ThreeDsAuthenticationHandler: unexpected response", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("responseData", data)), null, 4, null);
                                com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DigitizationFailed digitizationFailed3 = new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DigitizationFailed("3DS activation failed", null, 2, null);
                                threeDsAuthenticationHandler$handleSuccess$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope2);
                                threeDsAuthenticationHandler$handleSuccess$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str6);
                                threeDsAuthenticationHandler$handleSuccess$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                                threeDsAuthenticationHandler$handleSuccess$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response);
                                threeDsAuthenticationHandler$handleSuccess$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(data);
                                threeDsAuthenticationHandler$handleSuccess$1.getOutputFormats = 4;
                                break;
                            } else {
                                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Digitization Completed after yellow path", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("networkTokenReference", str6)), null, 4, null);
                                threeDsAuthenticationHandler.Camera2StreamConfigurationMap.replenishKeysIfNeeded(str6, false);
                                com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.DigitizationCompleted digitizationCompleted = new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.DigitizationCompleted(str6);
                                threeDsAuthenticationHandler$handleSuccess$1.getHighSpeedVideoSizes = producerScope2;
                                threeDsAuthenticationHandler$handleSuccess$1.getHighSpeedVideoFpsRangesFor = str6;
                                threeDsAuthenticationHandler$handleSuccess$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                                threeDsAuthenticationHandler$handleSuccess$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response);
                                threeDsAuthenticationHandler$handleSuccess$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(data);
                                threeDsAuthenticationHandler$handleSuccess$1.getOutputFormats = 5;
                                if (producerScope2.send(digitizationCompleted, threeDsAuthenticationHandler$handleSuccess$1) != coroutine_suspended) {
                                    producerScope3 = producerScope2;
                                    str4 = str3;
                                    str5 = str6;
                                    obj = data;
                                    kotlinx.coroutines.flow.Flow m20013invokeHG0u8IE$default = com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler.m20013invokeHG0u8IE$default(threeDsAuthenticationHandler.getHighResolutionOutputSizeshNQ4ISI, str5, 0L, 2, null);
                                    kotlinx.coroutines.flow.FlowCollector flowCollector = new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler$handleSuccess$2
                                        @Override // kotlinx.coroutines.flow.FlowCollector
                                        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj3, kotlin.coroutines.Continuation continuation2) {
                                            java.lang.Object send = producerScope3.send((com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState) obj3, continuation2);
                                            return send == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : kotlin.Unit.INSTANCE;
                                        }
                                    };
                                    threeDsAuthenticationHandler$handleSuccess$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope3);
                                    threeDsAuthenticationHandler$handleSuccess$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str5);
                                    threeDsAuthenticationHandler$handleSuccess$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                                    threeDsAuthenticationHandler$handleSuccess$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response);
                                    threeDsAuthenticationHandler$handleSuccess$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                    threeDsAuthenticationHandler$handleSuccess$1.getOutputFormats = 6;
                                    break;
                                }
                            }
                        }
                        return coroutine_suspended;
                    case 2:
                        kotlin.ResultKt.throwOnFailure(obj2);
                        return kotlin.Unit.INSTANCE;
                    case 3:
                        java.lang.Object obj3 = threeDsAuthenticationHandler$handleSuccess$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        return kotlin.Unit.INSTANCE;
                    case 4:
                        java.lang.Object obj4 = threeDsAuthenticationHandler$handleSuccess$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        return kotlin.Unit.INSTANCE;
                    case 5:
                        obj = threeDsAuthenticationHandler$handleSuccess$1.getHighResolutionOutputSizeshNQ4ISI;
                        response = (com.payair.model.Response) threeDsAuthenticationHandler$handleSuccess$1.Camera2StreamConfigurationMap;
                        str4 = (java.lang.String) threeDsAuthenticationHandler$handleSuccess$1.getHighSpeedVideoFpsRanges;
                        java.lang.String str9 = (java.lang.String) threeDsAuthenticationHandler$handleSuccess$1.getHighSpeedVideoFpsRangesFor;
                        kotlinx.coroutines.channels.ProducerScope producerScope5 = (kotlinx.coroutines.channels.ProducerScope) threeDsAuthenticationHandler$handleSuccess$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        str5 = str9;
                        producerScope3 = producerScope5;
                        kotlinx.coroutines.flow.Flow m20013invokeHG0u8IE$default2 = com.paypal.oslo.feature.taptopay.data.repository.card.payair.CardProvisionHandler.m20013invokeHG0u8IE$default(threeDsAuthenticationHandler.getHighResolutionOutputSizeshNQ4ISI, str5, 0L, 2, null);
                        kotlinx.coroutines.flow.FlowCollector flowCollector2 = new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler$handleSuccess$2
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            public final /* synthetic */ java.lang.Object emit(java.lang.Object obj32, kotlin.coroutines.Continuation continuation2) {
                                java.lang.Object send = producerScope3.send((com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState) obj32, continuation2);
                                return send == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : kotlin.Unit.INSTANCE;
                            }
                        };
                        threeDsAuthenticationHandler$handleSuccess$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope3);
                        threeDsAuthenticationHandler$handleSuccess$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str5);
                        threeDsAuthenticationHandler$handleSuccess$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                        threeDsAuthenticationHandler$handleSuccess$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response);
                        threeDsAuthenticationHandler$handleSuccess$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                        threeDsAuthenticationHandler$handleSuccess$1.getOutputFormats = 6;
                        break;
                    case 6:
                        java.lang.Object obj5 = threeDsAuthenticationHandler$handleSuccess$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        return kotlin.Unit.INSTANCE;
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        threeDsAuthenticationHandler$handleSuccess$1 = new com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler$handleSuccess$1(threeDsAuthenticationHandler, continuation);
        java.lang.Object obj22 = threeDsAuthenticationHandler$handleSuccess$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (threeDsAuthenticationHandler$handleSuccess$1.getOutputFormats) {
        }
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> invoke(java.lang.String networkTokenReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTokenReference, "");
        return kotlinx.coroutines.flow.FlowKt.channelFlow(new com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler$invoke$1(this, networkTokenReference, null));
    }
}
