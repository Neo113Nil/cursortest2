package com.paypal.oslo.feature.p2p.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/p2p/domain/error/TransferError;", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptReceiver;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$updatePaymentTransferAttemptReceiver$1", f = "TransferFlowRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1}, l = {207, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE}, m = "invokeSuspend", n = {"$this$flow", "combineError$iv", "state$iv", "raise$iv$iv$iv", "$this$ior_u24lambda_u240$iv", "$this$invokeSuspend_u24lambda_u241", "request", "$i$f$ior", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-_foldOrThrow-RaiseKt__BuildersKt$ior$1$iv", "$i$a$-ior-TransferFlowRepositoryImpl$updatePaymentTransferAttemptReceiver$1$result$2", "$this$flow", "result"}, nl = {211, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE}, s = {"L$0", "L$1", "L$3", "L$4", "L$5", "L$6", "L$8", "I$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class TransferFlowRepositoryImpl$updatePaymentTransferAttemptReceiver$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.TransferError, ? extends com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentReceiverInput getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    int getOutputStallDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl isOutputSupportedFor;
    private /* synthetic */ java.lang.Object isOutputSupportedForhNQ4ISI;

    public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.error.TransferError getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.p2p.domain.error.TransferError transferError) {
        return transferError;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0221, code lost:
    
        if (r2.emit(r5, r23) == r3) goto L53;
     */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x01d6: INVOKE (r6 I:arrow.core.raise.DefaultRaise) VIRTUAL call: arrow.core.raise.DefaultRaise.complete():boolean A[MD:():boolean (m)] (LINE:965), block:B:54:0x01d6 */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x01df: INVOKE (r6 I:arrow.core.raise.DefaultRaise) VIRTUAL call: arrow.core.raise.DefaultRaise.complete():boolean A[MD:():boolean (m)] (LINE:956), block:B:49:0x01df */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x01ea: INVOKE (r5 I:java.lang.Object) = (r7 I:java.util.concurrent.atomic.AtomicReference) VIRTUAL call: java.util.concurrent.atomic.AtomicReference.get():java.lang.Object A[MD:():V (c)], block:B:49:0x01df */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x01f2: INVOKE (r0 I:java.lang.Object) = (r9 I:kotlin.jvm.functions.Function2), (r5 I:java.lang.Object), (r0 I:java.lang.Object) INTERFACE call: kotlin.jvm.functions.Function2.invoke(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(P1, P2):R (m)] (LINE:959), block:B:51:0x01f2 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        arrow.core.raise.DefaultRaise complete;
        arrow.core.raise.DefaultRaise complete2;
        ?? r7;
        arrow.core.Ior.Left left;
        ?? invoke;
        com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl transferFlowRepositoryImpl;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.IorRaise iorRaise;
        com.paypal.oslo.feature.p2p.data.mapper.TransferFlowMappers transferFlowMappers;
        dagger.Lazy lazy;
        java.lang.Object executeMutation;
        arrow.core.raise.IorRaise iorRaise2;
        com.paypal.oslo.feature.p2p.data.mapper.TransferFlowMappers transferFlowMappers2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt copy;
        kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.isOutputSupportedForhNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputStallDurationlomOqCM;
        try {
        } catch (arrow.core.raise.RaiseCancellationException e) {
            complete2.complete();
            java.lang.Object raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e, complete2);
            arrow.core.EmptyValue emptyValue = arrow.core.EmptyValue.INSTANCE;
            java.lang.Object obj2 = r7.get();
            if (obj2 != arrow.core.EmptyValue.INSTANCE) {
                raisedOrRethrow = invoke.invoke(obj2, raisedOrRethrow);
            }
            left = new arrow.core.Ior.Left(raisedOrRethrow);
        } catch (java.lang.Throwable th) {
            complete.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UPDATE_RECEIVER_REQUEST, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("receiverType", this.getHighSpeedVideoFpsRanges.getReceiverType().name())), null, 4, null);
            kotlin.jvm.functions.Function2 function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$updatePaymentTransferAttemptReceiver$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$updatePaymentTransferAttemptReceiver$1.getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.feature.p2p.domain.error.TransferError) obj3);
                }
            };
            transferFlowRepositoryImpl = this.isOutputSupportedFor;
            com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentReceiverInput updatePaymentReceiverInput = this.getHighSpeedVideoFpsRanges;
            atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
            defaultRaise = new arrow.core.raise.DefaultRaise(false);
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            iorRaise = new arrow.core.raise.IorRaise(function2, atomicReference, defaultRaise2);
            transferFlowMappers = transferFlowRepositoryImpl.Camera2StreamConfigurationMap;
            com.paypal.oslo.api.graphql.schema.type.UpdatePaymentTransferAttemptReceiverInput mapRequest = transferFlowMappers.getReceiverMapper().mapRequest(updatePaymentReceiverInput);
            if (mapRequest != null) {
                lazy = transferFlowRepositoryImpl.getHighSpeedVideoSizes;
                java.lang.Object obj3 = lazy.get();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj3, "");
                com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptReceiverMutation updatePaymentTransferAttemptReceiverMutation = new com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptReceiverMutation(mapRequest);
                com.paypal.oslo.core.network.graphql.RiskSourceId updatePaymentTransferAttemptReceiver = com.paypal.oslo.core.network.graphql.RiskSourceId.P2P.INSTANCE.getUpdatePaymentTransferAttemptReceiver();
                this.isOutputSupportedForhNQ4ISI = flowCollector;
                this.getOutputFormats = function2;
                this.getHighSpeedVideoSizesFor = transferFlowRepositoryImpl;
                this.getInputFormats = atomicReference;
                this.getInputSizeshNQ4ISI = defaultRaise;
                this.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise2);
                this.getOutputMinFrameDurationlomOqCM = iorRaise;
                this.getOutputSizeshNQ4ISI = iorRaise;
                this.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(mapRequest);
                this.getHighResolutionOutputSizeshNQ4ISI = 0;
                this.getHighSpeedVideoFpsRangesFor = 0;
                this.getHighSpeedVideoSizes = 0;
                this.Camera2StreamConfigurationMap = 0;
                this.getOutputMinFrameDuration = 0;
                this.getOutputStallDurationlomOqCM = 1;
                executeMutation = com.paypal.oslo.feature.p2p.data.ApolloClientExtensionsKt.executeMutation((com.apollographql.apollo.ApolloClient) obj3, updatePaymentTransferAttemptReceiverMutation, updatePaymentTransferAttemptReceiver, this);
                if (executeMutation != coroutine_suspended) {
                    iorRaise2 = iorRaise;
                }
                return coroutine_suspended;
            }
            com.paypal.oslo.feature.p2p.domain.error.TransferError.Unknown unknown = new com.paypal.oslo.feature.p2p.domain.error.TransferError.Unknown(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UPDATE_RECEIVER_ERROR_UNKNOWN_TYPE);
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UPDATE_RECEIVER_ERROR_UNKNOWN_TYPE, null, null, 6, null);
            iorRaise.raise(unknown);
            throw new kotlin.KotlinNothingValueException();
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        arrow.core.raise.IorRaise iorRaise3 = (arrow.core.raise.IorRaise) this.getOutputSizeshNQ4ISI;
        iorRaise2 = (arrow.core.raise.IorRaise) this.getOutputMinFrameDurationlomOqCM;
        defaultRaise = (arrow.core.raise.DefaultRaise) this.getInputSizeshNQ4ISI;
        atomicReference = (java.util.concurrent.atomic.AtomicReference) this.getInputFormats;
        transferFlowRepositoryImpl = (com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl) this.getHighSpeedVideoSizesFor;
        kotlin.ResultKt.throwOnFailure(obj);
        iorRaise = iorRaise3;
        executeMutation = obj;
        arrow.core.Ior.Both both = (arrow.core.Ior) executeMutation;
        if (both instanceof arrow.core.Ior.Left) {
            com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue();
            com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.logCallError(callError, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UPDATE_RECEIVER_ERROR_NETWORK, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UPDATE_RECEIVER_ERROR_GRAPHQL);
            both = new arrow.core.Ior.Left(com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImplKt.access$toTransferError(callError));
        } else if (!(both instanceof arrow.core.Ior.Right)) {
            if (both instanceof arrow.core.Ior.Both) {
                com.paypal.oslo.core.network.graphql.error.CallError callError2 = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) both).getLeftValue();
                com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.logCallError(callError2, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UPDATE_RECEIVER_ERROR_NETWORK, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UPDATE_RECEIVER_ERROR_GRAPHQL);
                both = new arrow.core.Ior.Both(com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImplKt.access$toTransferError(callError2), ((arrow.core.Ior.Both) both).getRightValue());
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both);
        com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptReceiverMutation.Data data = (com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptReceiverMutation.Data) graphQLData.getData();
        if (data != null) {
            transferFlowMappers2 = transferFlowRepositoryImpl.Camera2StreamConfigurationMap;
            com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver mapResponse = transferFlowMappers2.getReceiverMapper().mapResponse(data);
            mutableStateFlow = transferFlowRepositoryImpl.getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt paymentTransferAttempt = (com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt) mutableStateFlow.getValue();
            if (paymentTransferAttempt != null) {
                mutableStateFlow2 = transferFlowRepositoryImpl.getHighResolutionOutputSizeshNQ4ISI;
                copy = paymentTransferAttempt.copy((r22 & 1) != 0 ? paymentTransferAttempt.id : mapResponse.getId(), (r22 & 2) != 0 ? paymentTransferAttempt.transferAmount : null, (r22 & 4) != 0 ? paymentTransferAttempt.supportedIntents : null, (r22 & 8) != 0 ? paymentTransferAttempt.selectedIntent : null, (r22 & 16) != 0 ? paymentTransferAttempt.recommendedContacts : null, (r22 & 32) != 0 ? paymentTransferAttempt.receiver : null, (r22 & 64) != 0 ? paymentTransferAttempt.supportedTransferTypes : null, (r22 & 128) != 0 ? paymentTransferAttempt.selectedTransferType : null, (r22 & 256) != 0 ? paymentTransferAttempt.fundingOptions : null, (r22 & 512) != 0 ? paymentTransferAttempt.paymentLink : null);
                mutableStateFlow2.setValue(copy);
            }
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UPDATE_RECEIVER_SUCCESS, kotlin.collections.MapsKt.emptyMap(), null, 4, null);
            defaultRaise.complete();
            arrow.core.EmptyValue emptyValue2 = arrow.core.EmptyValue.INSTANCE;
            java.lang.Object obj4 = atomicReference.get();
            left = obj4 == arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(mapResponse) : new arrow.core.Ior.Both(obj4, mapResponse);
            this.isOutputSupportedForhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
            this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(left);
            this.getHighSpeedVideoSizesFor = null;
            this.getInputFormats = null;
            this.getInputSizeshNQ4ISI = null;
            this.getOutputStallDuration = null;
            this.getOutputMinFrameDurationlomOqCM = null;
            this.getOutputSizeshNQ4ISI = null;
            this.getOutputSizes = null;
            this.getOutputStallDurationlomOqCM = 2;
        } else {
            com.paypal.oslo.feature.p2p.domain.error.TransferError.DataNotFound dataNotFound = com.paypal.oslo.feature.p2p.domain.error.TransferError.DataNotFound.INSTANCE;
            com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.logNoDataError(graphQLData, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UPDATE_RECEIVER_ERROR_NO_DATA);
            iorRaise2.raise(dataNotFound);
            throw new kotlin.KotlinNothingValueException();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.TransferError, ? extends com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$updatePaymentTransferAttemptReceiver$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$updatePaymentTransferAttemptReceiver$1 transferFlowRepositoryImpl$updatePaymentTransferAttemptReceiver$1 = new com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$updatePaymentTransferAttemptReceiver$1(this.getHighSpeedVideoFpsRanges, this.isOutputSupportedFor, continuation);
        transferFlowRepositoryImpl$updatePaymentTransferAttemptReceiver$1.isOutputSupportedForhNQ4ISI = obj;
        return transferFlowRepositoryImpl$updatePaymentTransferAttemptReceiver$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransferFlowRepositoryImpl$updatePaymentTransferAttemptReceiver$1(com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentReceiverInput updatePaymentReceiverInput, com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl transferFlowRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$updatePaymentTransferAttemptReceiver$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = updatePaymentReceiverInput;
        this.isOutputSupportedFor = transferFlowRepositoryImpl;
    }
}
