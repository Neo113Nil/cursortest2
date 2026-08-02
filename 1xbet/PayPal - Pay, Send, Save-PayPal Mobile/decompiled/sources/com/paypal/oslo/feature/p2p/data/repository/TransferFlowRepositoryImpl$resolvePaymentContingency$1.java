package com.paypal.oslo.feature.p2p.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/p2p/domain/error/TransferError;", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptReceiver;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$resolvePaymentContingency$1", f = "TransferFlowRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {714, com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameStart}, m = "invokeSuspend", n = {"$this$flow", "action", "combineError$iv", "state$iv", "raise$iv$iv$iv", "$this$ior_u24lambda_u240$iv", "$this$invokeSuspend_u24lambda_u241", "input", "$i$f$ior", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-_foldOrThrow-RaiseKt__BuildersKt$ior$1$iv", "$i$a$-ior-TransferFlowRepositoryImpl$resolvePaymentContingency$1$result$2", "$this$flow", "action", "result"}, nl = {718, 751}, s = {"L$0", "L$1", "L$2", "L$5", "L$6", "L$7", "L$8", "L$9", "I$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes5.dex */
final class TransferFlowRepositoryImpl$resolvePaymentContingency$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.TransferError, ? extends com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.ContingencyResolutionData getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    private /* synthetic */ java.lang.Object getValidOutputFormatsForInputhNQ4ISI;
    int isOutputSupportedFor;
    java.lang.Object isOutputSupportedForhNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl toString;
    java.lang.Object unwrapAs;

    public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.error.TransferError getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.p2p.domain.error.TransferError transferError) {
        return transferError;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(1:(1:(3:5|6|7)(2:9|10))(4:11|12|13|14))(8:55|56|57|58|59|60|(1:62)|31)|15|16|17|(1:19)(2:35|(2:37|(1:39)(2:40|41)))|20|(2:33|34)(3:26|(1:28)(1:32)|29)|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x021d, code lost:
    
        if (r18.emit(r2, r25) == r3) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01bf, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01e3, code lost:
    
        r0 = r11.invoke(r2, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01e3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.p2p.domain.model.ContingencyAction action;
        kotlin.jvm.functions.Function2 function2;
        com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl transferFlowRepositoryImpl;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        arrow.core.raise.DefaultRaise defaultRaise;
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.IorRaise iorRaise;
        com.paypal.oslo.api.graphql.schema.type.ResolvePaymentContingencyForTransferAttemptInput access$buildContingencyResolutionInput;
        dagger.Lazy lazy;
        com.apollographql.apollo.ApolloClient apolloClient;
        com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation resolvePaymentContingencyForTransferAttemptMutation;
        com.paypal.oslo.core.network.graphql.RiskSourceId resolvePaymentContingencyForTransferAttempt;
        java.lang.Object executeMutation;
        java.lang.String str;
        arrow.core.raise.DefaultRaise defaultRaise3;
        arrow.core.raise.IorRaise iorRaise2;
        arrow.core.raise.IorRaise iorRaise3;
        java.lang.Object obj2;
        arrow.core.Ior.Left left;
        com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.ResolvePaymentContingencyForTransferAttempt resolvePaymentContingencyForTransferAttempt2;
        com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.PaymentTransferAttempt paymentTransferAttempt;
        kotlinx.coroutines.flow.FlowCollector flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.getValidOutputFormatsForInputhNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.isOutputSupportedFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            action = this.getHighResolutionOutputSizeshNQ4ISI.getAction();
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.RESOLVE_CONTINGENCY_REQUEST, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("attemptId", this.getHighSpeedVideoFpsRangesFor), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONTINGENCY_ACTION, action.name())), null, 4, null);
            function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$resolvePaymentContingency$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$resolvePaymentContingency$1.getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.p2p.domain.error.TransferError) obj3);
                }
            };
            transferFlowRepositoryImpl = this.toString;
            java.lang.String str2 = this.getHighSpeedVideoFpsRangesFor;
            com.paypal.oslo.feature.p2p.domain.model.ContingencyResolutionData contingencyResolutionData = this.getHighResolutionOutputSizeshNQ4ISI;
            atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
            defaultRaise = new arrow.core.raise.DefaultRaise(false);
            try {
                try {
                    defaultRaise2 = defaultRaise;
                    iorRaise = new arrow.core.raise.IorRaise(function2, atomicReference, defaultRaise2);
                    access$buildContingencyResolutionInput = com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl.access$buildContingencyResolutionInput(transferFlowRepositoryImpl, str2, action, contingencyResolutionData);
                    lazy = transferFlowRepositoryImpl.getHighSpeedVideoSizes;
                    java.lang.Object obj3 = lazy.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj3, "");
                    apolloClient = (com.apollographql.apollo.ApolloClient) obj3;
                    resolvePaymentContingencyForTransferAttemptMutation = new com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation(access$buildContingencyResolutionInput);
                    resolvePaymentContingencyForTransferAttempt = com.paypal.oslo.core.network.graphql.RiskSourceId.P2P.INSTANCE.getResolvePaymentContingencyForTransferAttempt();
                    this.getValidOutputFormatsForInputhNQ4ISI = flowCollector2;
                    flowCollector = flowCollector2;
                } catch (java.lang.Throwable th) {
                    th = th;
                    defaultRaise.complete();
                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                }
            } catch (arrow.core.raise.RaiseCancellationException e) {
                e = e;
                flowCollector = flowCollector2;
            }
            try {
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(action);
                this.getHighSpeedVideoSizesFor = function2;
                this.getOutputSizes = transferFlowRepositoryImpl;
                this.getOutputMinFrameDurationlomOqCM = str2;
                this.getOutputStallDuration = atomicReference;
                this.getOutputStallDurationlomOqCM = defaultRaise;
                this.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise2);
                this.unwrapAs = iorRaise;
                this.isOutputSupportedForhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(access$buildContingencyResolutionInput);
                this.getInputSizeshNQ4ISI = iorRaise;
                this.getHighSpeedVideoSizes = 0;
                this.Camera2StreamConfigurationMap = 0;
                this.getHighSpeedVideoFpsRanges = 0;
                this.getOutputMinFrameDuration = 0;
                this.getInputFormats = 0;
                this.isOutputSupportedFor = 1;
                executeMutation = com.paypal.oslo.feature.p2p.data.ApolloClientExtensionsKt.executeMutation(apolloClient, resolvePaymentContingencyForTransferAttemptMutation, resolvePaymentContingencyForTransferAttempt, this);
                if (executeMutation != coroutine_suspended) {
                    str = str2;
                    defaultRaise3 = defaultRaise;
                    iorRaise2 = iorRaise;
                    iorRaise3 = iorRaise2;
                }
            } catch (arrow.core.raise.RaiseCancellationException e2) {
                e = e2;
                defaultRaise.complete();
                java.lang.Object raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                arrow.core.EmptyValue emptyValue = arrow.core.EmptyValue.INSTANCE;
                obj2 = atomicReference.get();
                if (obj2 != arrow.core.EmptyValue.INSTANCE) {
                }
                left = new arrow.core.Ior.Left(raisedOrRethrow);
                this.getValidOutputFormatsForInputhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(action);
                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(left);
                this.getOutputSizes = null;
                this.getOutputMinFrameDurationlomOqCM = null;
                this.getOutputStallDuration = null;
                this.getOutputStallDurationlomOqCM = null;
                this.getOutputSizeshNQ4ISI = null;
                this.unwrapAs = null;
                this.isOutputSupportedForhNQ4ISI = null;
                this.getInputSizeshNQ4ISI = null;
                this.isOutputSupportedFor = 2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        iorRaise2 = (arrow.core.raise.IorRaise) this.getInputSizeshNQ4ISI;
        iorRaise3 = (arrow.core.raise.IorRaise) this.unwrapAs;
        defaultRaise3 = (arrow.core.raise.DefaultRaise) this.getOutputStallDurationlomOqCM;
        atomicReference = (java.util.concurrent.atomic.AtomicReference) this.getOutputStallDuration;
        str = (java.lang.String) this.getOutputMinFrameDurationlomOqCM;
        transferFlowRepositoryImpl = (com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl) this.getOutputSizes;
        function2 = (kotlin.jvm.functions.Function2) this.getHighSpeedVideoSizesFor;
        action = (com.paypal.oslo.feature.p2p.domain.model.ContingencyAction) this.getOutputFormats;
        try {
            try {
                kotlin.ResultKt.throwOnFailure(obj);
                flowCollector = flowCollector2;
                executeMutation = obj;
            } catch (arrow.core.raise.RaiseCancellationException e3) {
                e = e3;
                flowCollector = flowCollector2;
                defaultRaise = defaultRaise3;
                defaultRaise.complete();
                java.lang.Object raisedOrRethrow2 = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                arrow.core.EmptyValue emptyValue2 = arrow.core.EmptyValue.INSTANCE;
                obj2 = atomicReference.get();
                if (obj2 != arrow.core.EmptyValue.INSTANCE) {
                }
                left = new arrow.core.Ior.Left(raisedOrRethrow2);
                this.getValidOutputFormatsForInputhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(action);
                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(left);
                this.getOutputSizes = null;
                this.getOutputMinFrameDurationlomOqCM = null;
                this.getOutputStallDuration = null;
                this.getOutputStallDurationlomOqCM = null;
                this.getOutputSizeshNQ4ISI = null;
                this.unwrapAs = null;
                this.isOutputSupportedForhNQ4ISI = null;
                this.getInputSizeshNQ4ISI = null;
                this.isOutputSupportedFor = 2;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            defaultRaise = defaultRaise3;
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
        arrow.core.Ior.Both both = (arrow.core.Ior) executeMutation;
        if (both instanceof arrow.core.Ior.Left) {
            com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.logCallError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue(), com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.RESOLVE_CONTINGENCY_ERROR_NETWORK, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.RESOLVE_CONTINGENCY_ERROR_GRAPHQL);
            both = new arrow.core.Ior.Left(com.paypal.oslo.feature.p2p.domain.error.TransferError.Network.INSTANCE);
        } else if (!(both instanceof arrow.core.Ior.Right)) {
            if (both instanceof arrow.core.Ior.Both) {
                com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.logCallError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) both).getLeftValue(), com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.RESOLVE_CONTINGENCY_ERROR_NETWORK, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.RESOLVE_CONTINGENCY_ERROR_GRAPHQL);
                both = new arrow.core.Ior.Both(com.paypal.oslo.feature.p2p.domain.error.TransferError.Network.INSTANCE, ((arrow.core.Ior.Both) both).getRightValue());
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise2.bind(both);
        com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Data data = (com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Data) graphQLData.getData();
        if (data == null || (resolvePaymentContingencyForTransferAttempt2 = data.getResolvePaymentContingencyForTransferAttempt()) == null || (paymentTransferAttempt = resolvePaymentContingencyForTransferAttempt2.getPaymentTransferAttempt()) == null) {
            com.paypal.oslo.feature.p2p.domain.error.TransferError.DataNotFound dataNotFound = com.paypal.oslo.feature.p2p.domain.error.TransferError.DataNotFound.INSTANCE;
            com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.logNoDataError(graphQLData, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.RESOLVE_CONTINGENCY_ERROR_NO_DATA);
            iorRaise3.raise(dataNotFound);
            throw new kotlin.KotlinNothingValueException();
        }
        com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver access$mapContingencyResponse = com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl.access$mapContingencyResponse(transferFlowRepositoryImpl, paymentTransferAttempt);
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.RESOLVE_CONTINGENCY_SUCCESS, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("attemptId", str)), null, 4, null);
        defaultRaise3.complete();
        arrow.core.EmptyValue emptyValue3 = arrow.core.EmptyValue.INSTANCE;
        java.lang.Object obj4 = atomicReference.get();
        left = obj4 == arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(access$mapContingencyResponse) : new arrow.core.Ior.Both(obj4, access$mapContingencyResponse);
        this.getValidOutputFormatsForInputhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
        this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(action);
        this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(left);
        this.getOutputSizes = null;
        this.getOutputMinFrameDurationlomOqCM = null;
        this.getOutputStallDuration = null;
        this.getOutputStallDurationlomOqCM = null;
        this.getOutputSizeshNQ4ISI = null;
        this.unwrapAs = null;
        this.isOutputSupportedForhNQ4ISI = null;
        this.getInputSizeshNQ4ISI = null;
        this.isOutputSupportedFor = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.TransferError, ? extends com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$resolvePaymentContingency$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$resolvePaymentContingency$1 transferFlowRepositoryImpl$resolvePaymentContingency$1 = new com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$resolvePaymentContingency$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.toString, continuation);
        transferFlowRepositoryImpl$resolvePaymentContingency$1.getValidOutputFormatsForInputhNQ4ISI = obj;
        return transferFlowRepositoryImpl$resolvePaymentContingency$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransferFlowRepositoryImpl$resolvePaymentContingency$1(com.paypal.oslo.feature.p2p.domain.model.ContingencyResolutionData contingencyResolutionData, java.lang.String str, com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl transferFlowRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$resolvePaymentContingency$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = contingencyResolutionData;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.toString = transferFlowRepositoryImpl;
    }
}
