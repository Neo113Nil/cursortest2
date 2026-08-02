package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J*\u0010\u0019\u001a\u00020\u0018*\b\u0012\u0004\u0012\u00020\u00120\u00152\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u0014\u0010 \u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u001b\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/ActivationCodeRequestHandler;", "", "Lcom/payair/logic/managers/TokenManager;", "tokenManager", "Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/ActivationCodeSubmissionHandler;", "activationCodeSubmissionHandler", "Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/ThreeDsAuthenticationHandler;", "threeDsAuthenticationHandler", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/payair/logic/managers/TokenManager;Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/ActivationCodeSubmissionHandler;Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/ThreeDsAuthenticationHandler;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "networkTokenReference", "", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/IdentityVerificationMethod;", "methods", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState;", "invoke", "(Ljava/lang/String;Ljava/util/List;)Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/channels/ProducerScope;", "p0", "p1", "", "getHighSpeedVideoSizes", "(Lkotlinx/coroutines/channels/ProducerScope;Lcom/paypal/oslo/feature/taptopay/domain/model/card/IdentityVerificationMethod;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/payair/logic/managers/TokenManager;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/ActivationCodeSubmissionHandler;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/ThreeDsAuthenticationHandler;", "Lkotlinx/coroutines/CoroutineDispatcher;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ActivationCodeRequestHandler {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.payair.logic.managers.TokenManager Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public ActivationCodeRequestHandler(com.payair.logic.managers.TokenManager tokenManager, com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler activationCodeSubmissionHandler, com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler threeDsAuthenticationHandler, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activationCodeSubmissionHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threeDsAuthenticationHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.Camera2StreamConfigurationMap = tokenManager;
        this.getHighSpeedVideoFpsRanges = activationCodeSubmissionHandler;
        this.getHighSpeedVideoFpsRangesFor = threeDsAuthenticationHandler;
        this.getHighResolutionOutputSizeshNQ4ISI = coroutineDispatcher;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> invoke(java.lang.String networkTokenReference, java.util.List<? extends com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod> methods) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTokenReference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(methods, "");
        return kotlinx.coroutines.flow.FlowKt.channelFlow(new com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler$invoke$1(networkTokenReference, methods, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0118, code lost:
    
        if (r11.send(r6, r3) != r4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0155, code lost:
    
        if (r7.collect(r8, r3) == r4) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> producerScope, com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod identityVerificationMethod, java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler$handleOtp$1 activationCodeRequestHandler$handleOtp$1;
        int i;
        final kotlinx.coroutines.channels.ProducerScope producerScope2;
        com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod identityVerificationMethod2;
        com.payair.model.Response response;
        java.lang.String str2 = str;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler$handleOtp$1) {
            activationCodeRequestHandler$handleOtp$1 = (com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler$handleOtp$1) continuation;
            if ((activationCodeRequestHandler$handleOtp$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                activationCodeRequestHandler$handleOtp$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = activationCodeRequestHandler$handleOtp$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = activationCodeRequestHandler$handleOtp$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Requesting OTP activation code", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("activationMethodType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(identityVerificationMethod.getClass()).getSimpleName()), kotlin.TuplesKt.to("activationMethodId", identityVerificationMethod.getId())), null, 4, null);
                    kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = this.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler$handleOtp$result$1 activationCodeRequestHandler$handleOtp$result$1 = new com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler$handleOtp$result$1(this, str2, identityVerificationMethod, null);
                    producerScope2 = producerScope;
                    activationCodeRequestHandler$handleOtp$1.getHighSpeedVideoSizes = producerScope2;
                    activationCodeRequestHandler$handleOtp$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(identityVerificationMethod);
                    activationCodeRequestHandler$handleOtp$1.getHighSpeedVideoFpsRangesFor = str2;
                    activationCodeRequestHandler$handleOtp$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = kotlinx.coroutines.BuildersKt.withContext(coroutineDispatcher, activationCodeRequestHandler$handleOtp$result$1, activationCodeRequestHandler$handleOtp$1);
                    if (obj != coroutine_suspended) {
                        identityVerificationMethod2 = identityVerificationMethod;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                str2 = (java.lang.String) activationCodeRequestHandler$handleOtp$1.getHighSpeedVideoFpsRangesFor;
                identityVerificationMethod2 = (com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod) activationCodeRequestHandler$handleOtp$1.getHighSpeedVideoFpsRanges;
                kotlinx.coroutines.channels.ProducerScope producerScope3 = (kotlinx.coroutines.channels.ProducerScope) activationCodeRequestHandler$handleOtp$1.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                producerScope2 = producerScope3;
                response = (com.payair.model.Response) obj;
                if (!(response instanceof com.payair.model.Response.Error)) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "ActivationCodeRequestHandler failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorCode", kotlin.coroutines.jvm.internal.Boxing.boxInt(((com.payair.model.Response.Error) response).getErrorCode()))), null, 4, null);
                    com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.ActivationFailed activationFailed = new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.ActivationFailed("Failed to request activation code", null, 2, null);
                    activationCodeRequestHandler$handleOtp$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope2);
                    activationCodeRequestHandler$handleOtp$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(identityVerificationMethod2);
                    activationCodeRequestHandler$handleOtp$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    activationCodeRequestHandler$handleOtp$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response);
                    activationCodeRequestHandler$handleOtp$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                } else {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "ActivationCodeRequestHandler succeeded, waiting for user input", null, null, 6, null);
                    kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> invoke = this.getHighSpeedVideoFpsRanges.invoke(str2);
                    kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> flowCollector = new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler$handleOtp$2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation2) {
                            java.lang.Object send = producerScope2.send((com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState) obj2, continuation2);
                            return send == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : kotlin.Unit.INSTANCE;
                        }
                    };
                    activationCodeRequestHandler$handleOtp$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope2);
                    activationCodeRequestHandler$handleOtp$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(identityVerificationMethod2);
                    activationCodeRequestHandler$handleOtp$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    activationCodeRequestHandler$handleOtp$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response);
                    activationCodeRequestHandler$handleOtp$1.getHighResolutionOutputSizeshNQ4ISI = 3;
                }
                return coroutine_suspended;
            }
        }
        activationCodeRequestHandler$handleOtp$1 = new com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler$handleOtp$1(this, continuation);
        java.lang.Object obj2 = activationCodeRequestHandler$handleOtp$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = activationCodeRequestHandler$handleOtp$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        response = (com.payair.model.Response) obj2;
        if (!(response instanceof com.payair.model.Response.Error)) {
        }
        return coroutine_suspended2;
    }

    public static final /* synthetic */ java.lang.Object access$handleAuthenticationMethod(com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler activationCodeRequestHandler, final kotlinx.coroutines.channels.ProducerScope producerScope, com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod identityVerificationMethod, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        if (identityVerificationMethod instanceof com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.Emv3ds) {
            java.lang.Object collect = activationCodeRequestHandler.getHighSpeedVideoFpsRangesFor.invoke(str).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler$handleAuthenticationMethod$2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation2) {
                    java.lang.Object send = producerScope.send((com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState) obj, continuation2);
                    return send == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : kotlin.Unit.INSTANCE;
                }
            }, continuation);
            return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
        }
        if ((identityVerificationMethod instanceof com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.OtpSms) || (identityVerificationMethod instanceof com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.OtpEmail)) {
            java.lang.Object highSpeedVideoSizes = activationCodeRequestHandler.getHighSpeedVideoSizes(producerScope, identityVerificationMethod, str, continuation);
            return highSpeedVideoSizes == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoSizes : kotlin.Unit.INSTANCE;
        }
        if ((identityVerificationMethod instanceof com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.AppToApp) || (identityVerificationMethod instanceof com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.CallCustomerService)) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Unsupported activation method selected", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("activationMethodType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(identityVerificationMethod.getClass()).getSimpleName()), kotlin.TuplesKt.to("activationMethodId", identityVerificationMethod.getId())), null, 4, null);
            java.lang.Object send = producerScope.send(new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DigitizationFailed("Unsupported activation method selected", null, 2, null), continuation);
            return send == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : kotlin.Unit.INSTANCE;
        }
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Unknown activation method selected", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("activationMethodType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(identityVerificationMethod.getClass()).getSimpleName()), kotlin.TuplesKt.to("activationMethodId", identityVerificationMethod.getId())), null, 4, null);
        java.lang.Object send2 = producerScope.send(new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DigitizationFailed("Unknown activation method selected", null, 2, null), continuation);
        return send2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send2 : kotlin.Unit.INSTANCE;
    }
}
