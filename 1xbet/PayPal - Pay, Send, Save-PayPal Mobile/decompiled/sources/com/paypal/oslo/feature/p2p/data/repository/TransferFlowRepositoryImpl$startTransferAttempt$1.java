package com.paypal.oslo.feature.p2p.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/p2p/domain/error/TransferError;", "Lcom/paypal/oslo/feature/p2p/domain/model/StartPaymentTransferAttempt;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$startTransferAttempt$1", f = "TransferFlowRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1}, l = {148, 183}, m = "invokeSuspend", n = {"$this$flow", "combineError$iv", "state$iv", "raise$iv$iv$iv", "$this$ior_u24lambda_u240$iv", "$this$invokeSuspend_u24lambda_u241", "$i$f$ior", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-_foldOrThrow-RaiseKt__BuildersKt$ior$1$iv", "$i$a$-ior-TransferFlowRepositoryImpl$startTransferAttempt$1$result$2", "$this$flow", "result"}, nl = {149, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE}, s = {"L$0", "L$1", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class TransferFlowRepositoryImpl$startTransferAttempt$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.TransferError, ? extends com.paypal.oslo.feature.p2p.domain.model.StartPaymentTransferAttempt>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl getOutputMinFrameDurationlomOqCM;
    private /* synthetic */ java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    int getOutputStallDurationlomOqCM;

    public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.error.TransferError getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.p2p.domain.error.TransferError transferError) {
        return transferError;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x01ff, code lost:
    
        if (r2.emit(r4, r20) != r3) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlin.jvm.functions.Function2 function2;
        com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl transferFlowRepositoryImpl;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.IorRaise iorRaise;
        dagger.Lazy lazy;
        java.lang.Object executeMutation;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.IorRaise iorRaise2;
        java.lang.Object obj2;
        arrow.core.Ior.Left left;
        com.paypal.oslo.feature.p2p.data.mapper.TransferFlowMappers transferFlowMappers;
        java.lang.String str;
        kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getOutputSizes;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputStallDurationlomOqCM;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoFpsRanges;
            mutableStateFlow.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.START_TRANSFER_ATTEMPT_REQUEST, kotlin.collections.MapsKt.emptyMap(), null, 4, null);
            function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$startTransferAttempt$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$startTransferAttempt$1.getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.p2p.domain.error.TransferError) obj3);
                }
            };
            transferFlowRepositoryImpl = this.getOutputMinFrameDurationlomOqCM;
            atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
            defaultRaise = new arrow.core.raise.DefaultRaise(false);
            try {
                arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                iorRaise = new arrow.core.raise.IorRaise(function2, atomicReference, defaultRaise3);
                lazy = transferFlowRepositoryImpl.getHighSpeedVideoSizes;
                java.lang.Object obj3 = lazy.get();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj3, "");
                com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation startPaymentTransferAttemptMutation = new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation();
                com.paypal.oslo.core.network.graphql.RiskSourceId startPaymentTransferAttempt = com.paypal.oslo.core.network.graphql.RiskSourceId.P2P.INSTANCE.getStartPaymentTransferAttempt();
                this.getOutputSizes = flowCollector;
                this.getOutputMinFrameDuration = function2;
                this.getInputSizeshNQ4ISI = transferFlowRepositoryImpl;
                this.getInputFormats = atomicReference;
                this.getHighSpeedVideoSizesFor = defaultRaise;
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                this.getOutputStallDuration = iorRaise;
                this.getOutputSizeshNQ4ISI = iorRaise;
                this.getHighSpeedVideoFpsRanges = 0;
                this.getHighSpeedVideoFpsRangesFor = 0;
                this.Camera2StreamConfigurationMap = 0;
                this.getHighResolutionOutputSizeshNQ4ISI = 0;
                this.getHighSpeedVideoSizes = 0;
                this.getOutputStallDurationlomOqCM = 1;
                executeMutation = com.paypal.oslo.feature.p2p.data.ApolloClientExtensionsKt.executeMutation((com.apollographql.apollo.ApolloClient) obj3, startPaymentTransferAttemptMutation, startPaymentTransferAttempt, this);
                if (executeMutation != coroutine_suspended) {
                    defaultRaise2 = defaultRaise;
                    iorRaise2 = iorRaise;
                }
            } catch (arrow.core.raise.RaiseCancellationException e) {
                e = e;
                defaultRaise.complete();
                java.lang.Object raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                arrow.core.EmptyValue emptyValue = arrow.core.EmptyValue.INSTANCE;
                obj2 = atomicReference.get();
                if (obj2 != arrow.core.EmptyValue.INSTANCE) {
                    raisedOrRethrow = function2.invoke(obj2, raisedOrRethrow);
                }
                left = new arrow.core.Ior.Left(raisedOrRethrow);
                this.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(left);
                this.getInputSizeshNQ4ISI = null;
                this.getInputFormats = null;
                this.getHighSpeedVideoSizesFor = null;
                this.getOutputFormats = null;
                this.getOutputStallDuration = null;
                this.getOutputSizeshNQ4ISI = null;
                this.getOutputStallDurationlomOqCM = 2;
            } catch (java.lang.Throwable th) {
                th = th;
                defaultRaise.complete();
                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
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
        iorRaise2 = (arrow.core.raise.IorRaise) this.getOutputSizeshNQ4ISI;
        arrow.core.raise.IorRaise iorRaise3 = (arrow.core.raise.IorRaise) this.getOutputStallDuration;
        defaultRaise2 = (arrow.core.raise.DefaultRaise) this.getHighSpeedVideoSizesFor;
        atomicReference = (java.util.concurrent.atomic.AtomicReference) this.getInputFormats;
        transferFlowRepositoryImpl = (com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl) this.getInputSizeshNQ4ISI;
        function2 = (kotlin.jvm.functions.Function2) this.getOutputMinFrameDuration;
        try {
            kotlin.ResultKt.throwOnFailure(obj);
            iorRaise = iorRaise3;
            executeMutation = obj;
        } catch (arrow.core.raise.RaiseCancellationException e2) {
            e = e2;
            defaultRaise = defaultRaise2;
            defaultRaise.complete();
            java.lang.Object raisedOrRethrow2 = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
            arrow.core.EmptyValue emptyValue2 = arrow.core.EmptyValue.INSTANCE;
            obj2 = atomicReference.get();
            if (obj2 != arrow.core.EmptyValue.INSTANCE) {
            }
            left = new arrow.core.Ior.Left(raisedOrRethrow2);
            this.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(left);
            this.getInputSizeshNQ4ISI = null;
            this.getInputFormats = null;
            this.getHighSpeedVideoSizesFor = null;
            this.getOutputFormats = null;
            this.getOutputStallDuration = null;
            this.getOutputSizeshNQ4ISI = null;
            this.getOutputStallDurationlomOqCM = 2;
        } catch (java.lang.Throwable th2) {
            th = th2;
            defaultRaise = defaultRaise2;
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
        arrow.core.Ior.Both both = (arrow.core.Ior) executeMutation;
        if (both instanceof arrow.core.Ior.Left) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.START_TRANSFER_ATTEMPT_ERROR_NETWORK, com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.toLoggingAttributes((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue()), null, null, 12, null);
            both = new arrow.core.Ior.Left(com.paypal.oslo.feature.p2p.domain.error.TransferError.Network.INSTANCE);
        } else if (!(both instanceof arrow.core.Ior.Right)) {
            if (!(both instanceof arrow.core.Ior.Both)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.START_TRANSFER_ATTEMPT_ERROR_NETWORK, com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.toLoggingAttributes((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) both).getLeftValue()), null, null, 12, null);
            both = new arrow.core.Ior.Both(com.paypal.oslo.feature.p2p.domain.error.TransferError.Network.INSTANCE, ((arrow.core.Ior.Both) both).getRightValue());
        }
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise2.bind(both);
        com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Data data = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Data) graphQLData.getData();
        if (data == null) {
            com.paypal.oslo.feature.p2p.domain.error.TransferError.DataNotFound dataNotFound = com.paypal.oslo.feature.p2p.domain.error.TransferError.DataNotFound.INSTANCE;
            java.lang.Object obj4 = graphQLData.getExtensions().get("correlationId");
            if (obj4 == null || (str = obj4.toString()) == null) {
                str = "none";
            }
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.START_TRANSFER_ATTEMPT_ERROR_NO_DATA, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("correlationId", str)), null, null, 12, null);
            iorRaise.raise(dataNotFound);
            throw new kotlin.KotlinNothingValueException();
        }
        transferFlowMappers = transferFlowRepositoryImpl.Camera2StreamConfigurationMap;
        com.paypal.oslo.feature.p2p.domain.model.StartPaymentTransferAttempt map = transferFlowMappers.getStartTransferAttemptMapper().map(data);
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.START_TRANSFER_ATTEMPT_SUCCESS, kotlin.collections.MapsKt.emptyMap(), null, 4, null);
        defaultRaise2.complete();
        arrow.core.EmptyValue emptyValue3 = arrow.core.EmptyValue.INSTANCE;
        java.lang.Object obj5 = atomicReference.get();
        left = obj5 == arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(map) : new arrow.core.Ior.Both(obj5, map);
        this.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
        this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(left);
        this.getInputSizeshNQ4ISI = null;
        this.getInputFormats = null;
        this.getHighSpeedVideoSizesFor = null;
        this.getOutputFormats = null;
        this.getOutputStallDuration = null;
        this.getOutputSizeshNQ4ISI = null;
        this.getOutputStallDurationlomOqCM = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.TransferError, ? extends com.paypal.oslo.feature.p2p.domain.model.StartPaymentTransferAttempt>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$startTransferAttempt$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$startTransferAttempt$1 transferFlowRepositoryImpl$startTransferAttempt$1 = new com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$startTransferAttempt$1(this.getOutputMinFrameDurationlomOqCM, continuation);
        transferFlowRepositoryImpl$startTransferAttempt$1.getOutputSizes = obj;
        return transferFlowRepositoryImpl$startTransferAttempt$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransferFlowRepositoryImpl$startTransferAttempt$1(com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl transferFlowRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$startTransferAttempt$1> continuation) {
        super(2, continuation);
        this.getOutputMinFrameDurationlomOqCM = transferFlowRepositoryImpl;
    }
}
