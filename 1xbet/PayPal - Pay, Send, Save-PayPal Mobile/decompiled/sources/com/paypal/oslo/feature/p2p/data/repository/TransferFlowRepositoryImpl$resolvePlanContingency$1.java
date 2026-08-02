package com.paypal.oslo.feature.p2p.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/p2p/domain/error/TransferError;", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$resolvePlanContingency$1", f = "TransferFlowRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1}, l = {my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_DIFF_SCRP_ID, 817}, m = "invokeSuspend", n = {"$this$flow", "combineError$iv", "state$iv", "raise$iv$iv$iv", "$this$ior_u24lambda_u240$iv", "$this$invokeSuspend_u24lambda_u241", "graphQLInput", "$i$f$ior", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-_foldOrThrow-RaiseKt__BuildersKt$ior$1$iv", "$i$a$-ior-TransferFlowRepositoryImpl$resolvePlanContingency$1$result$2", "$this$flow", "result"}, nl = {774, 818}, s = {"L$0", "L$1", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class TransferFlowRepositoryImpl$resolvePlanContingency$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.TransferError, ? extends com.paypal.oslo.feature.p2p.domain.model.FundingOptions>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.ResolvePlanContingencyInput Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl getValidOutputFormatsForInputhNQ4ISI;
    int toString;
    private /* synthetic */ java.lang.Object unwrapAs;

    public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.error.TransferError getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.p2p.domain.error.TransferError transferError) {
        return transferError;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0246, code lost:
    
        if (r2.emit(r4, r27) == r3) goto L56;
     */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x01f8: INVOKE (r10 I:arrow.core.raise.DefaultRaise) VIRTUAL call: arrow.core.raise.DefaultRaise.complete():boolean A[MD:():boolean (m)] (LINE:965), block:B:57:0x01f8 */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0201: INVOKE (r10 I:arrow.core.raise.DefaultRaise) VIRTUAL call: arrow.core.raise.DefaultRaise.complete():boolean A[MD:():boolean (m)] (LINE:956), block:B:52:0x0201 */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x020c: INVOKE (r4 I:java.lang.Object) = (r11 I:java.util.concurrent.atomic.AtomicReference) VIRTUAL call: java.util.concurrent.atomic.AtomicReference.get():java.lang.Object A[MD:():V (c)], block:B:52:0x0201 */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x0214: INVOKE (r0 I:java.lang.Object) = (r14 I:kotlin.jvm.functions.Function2), (r4 I:java.lang.Object), (r0 I:java.lang.Object) INTERFACE call: kotlin.jvm.functions.Function2.invoke(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(P1, P2):R (m)] (LINE:959), block:B:54:0x0214 */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        arrow.core.raise.DefaultRaise complete;
        arrow.core.raise.DefaultRaise complete2;
        ?? r11;
        arrow.core.Ior.Left left;
        ?? invoke;
        com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl transferFlowRepositoryImpl;
        com.paypal.oslo.feature.p2p.domain.model.ResolvePlanContingencyInput resolvePlanContingencyInput;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.IorRaise iorRaise;
        com.paypal.oslo.feature.p2p.data.mapper.TransferFlowMappers transferFlowMappers;
        dagger.Lazy lazy;
        java.lang.Object executeMutation;
        arrow.core.raise.IorRaise iorRaise2;
        com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.ResolvePlanContingencyForTransferAttempt resolvePlanContingencyForTransferAttempt;
        com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.PaymentTransferAttempt paymentTransferAttempt;
        com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.FundingOptions fundingOptions;
        com.paypal.oslo.feature.p2p.data.mapper.TransferFlowMappers transferFlowMappers2;
        kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.unwrapAs;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.toString;
        try {
        } catch (arrow.core.raise.RaiseCancellationException e) {
            complete2.complete();
            java.lang.Object raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e, complete2);
            arrow.core.EmptyValue emptyValue = arrow.core.EmptyValue.INSTANCE;
            java.lang.Object obj2 = r11.get();
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
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.RESOLVE_PLAN_CONTINGENCY_REQUEST, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("attemptId", this.Camera2StreamConfigurationMap.getId()), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FUNDING_OPTION_ID, this.Camera2StreamConfigurationMap.getFundingOptionId())), null, 4, null);
            kotlin.jvm.functions.Function2 function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$resolvePlanContingency$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$resolvePlanContingency$1.getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.p2p.domain.error.TransferError) obj3);
                }
            };
            transferFlowRepositoryImpl = this.getValidOutputFormatsForInputhNQ4ISI;
            resolvePlanContingencyInput = this.Camera2StreamConfigurationMap;
            atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
            defaultRaise = new arrow.core.raise.DefaultRaise(false);
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            iorRaise = new arrow.core.raise.IorRaise(function2, atomicReference, defaultRaise2);
            transferFlowMappers = transferFlowRepositoryImpl.Camera2StreamConfigurationMap;
            com.paypal.oslo.api.graphql.schema.type.ResolvePlanContingencyForTransferAttemptInput map = transferFlowMappers.getResolvePlanContingencyInputMapper().map(resolvePlanContingencyInput);
            lazy = transferFlowRepositoryImpl.getHighSpeedVideoSizes;
            java.lang.Object obj3 = lazy.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj3, "");
            com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation resolvePlanContingencyForTransferAttemptMutation = new com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation(map);
            com.paypal.oslo.core.network.graphql.RiskSourceId resolvePlanContingencyForTransferAttempt2 = com.paypal.oslo.core.network.graphql.RiskSourceId.P2P.INSTANCE.getResolvePlanContingencyForTransferAttempt();
            this.unwrapAs = flowCollector;
            this.getOutputMinFrameDuration = function2;
            this.getHighSpeedVideoSizesFor = transferFlowRepositoryImpl;
            this.getOutputFormats = resolvePlanContingencyInput;
            this.getInputFormats = atomicReference;
            this.getOutputMinFrameDurationlomOqCM = defaultRaise;
            this.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise2);
            this.getOutputSizeshNQ4ISI = iorRaise;
            this.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(map);
            this.getOutputSizes = iorRaise;
            this.getHighSpeedVideoSizes = 0;
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
            this.getHighSpeedVideoFpsRanges = 0;
            this.getInputSizeshNQ4ISI = 0;
            this.toString = 1;
            executeMutation = com.paypal.oslo.feature.p2p.data.ApolloClientExtensionsKt.executeMutation((com.apollographql.apollo.ApolloClient) obj3, resolvePlanContingencyForTransferAttemptMutation, resolvePlanContingencyForTransferAttempt2, this);
            if (executeMutation != coroutine_suspended) {
                iorRaise2 = iorRaise;
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
        arrow.core.raise.IorRaise iorRaise3 = (arrow.core.raise.IorRaise) this.getOutputSizes;
        arrow.core.raise.IorRaise iorRaise4 = (arrow.core.raise.IorRaise) this.getOutputSizeshNQ4ISI;
        defaultRaise = (arrow.core.raise.DefaultRaise) this.getOutputMinFrameDurationlomOqCM;
        atomicReference = (java.util.concurrent.atomic.AtomicReference) this.getInputFormats;
        resolvePlanContingencyInput = (com.paypal.oslo.feature.p2p.domain.model.ResolvePlanContingencyInput) this.getOutputFormats;
        transferFlowRepositoryImpl = (com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl) this.getHighSpeedVideoSizesFor;
        kotlin.ResultKt.throwOnFailure(obj);
        iorRaise2 = iorRaise4;
        iorRaise = iorRaise3;
        executeMutation = obj;
        arrow.core.Ior.Both both = (arrow.core.Ior) executeMutation;
        if (both instanceof arrow.core.Ior.Left) {
            com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.logCallError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue(), com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.RESOLVE_PLAN_CONTINGENCY_ERROR_NETWORK, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.RESOLVE_PLAN_CONTINGENCY_ERROR_GRAPHQL);
            both = new arrow.core.Ior.Left(com.paypal.oslo.feature.p2p.domain.error.TransferError.Network.INSTANCE);
        } else if (!(both instanceof arrow.core.Ior.Right)) {
            if (both instanceof arrow.core.Ior.Both) {
                com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.logCallError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) both).getLeftValue(), com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.RESOLVE_PLAN_CONTINGENCY_ERROR_NETWORK, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.RESOLVE_PLAN_CONTINGENCY_ERROR_GRAPHQL);
                both = new arrow.core.Ior.Both(com.paypal.oslo.feature.p2p.domain.error.TransferError.Network.INSTANCE, ((arrow.core.Ior.Both) both).getRightValue());
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both);
        com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.Data data = (com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.Data) graphQLData.getData();
        if (data != null && (resolvePlanContingencyForTransferAttempt = data.getResolvePlanContingencyForTransferAttempt()) != null && (paymentTransferAttempt = resolvePlanContingencyForTransferAttempt.getPaymentTransferAttempt()) != null && (fundingOptions = paymentTransferAttempt.getFundingOptions()) != null) {
            transferFlowMappers2 = transferFlowRepositoryImpl.Camera2StreamConfigurationMap;
            com.paypal.oslo.feature.p2p.domain.model.FundingOptions map2 = transferFlowMappers2.getFundingOptionsMapper().map(fundingOptions.getP2PFundingOptionsFragment());
            if (map2 == null) {
                com.paypal.oslo.feature.p2p.domain.error.TransferError.DataNotFound dataNotFound = com.paypal.oslo.feature.p2p.domain.error.TransferError.DataNotFound.INSTANCE;
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.RESOLVE_PLAN_CONTINGENCY_ERROR_MAPPER_RETURNED_NULL, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("attemptId", resolvePlanContingencyInput.getId()), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FUNDING_OPTION_ID, resolvePlanContingencyInput.getFundingOptionId())), null, null, 12, null);
                iorRaise2.raise(dataNotFound);
                throw new kotlin.KotlinNothingValueException();
            }
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.RESOLVE_PLAN_CONTINGENCY_SUCCESS, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("attemptId", resolvePlanContingencyInput.getId())), null, 4, null);
            defaultRaise.complete();
            arrow.core.EmptyValue emptyValue2 = arrow.core.EmptyValue.INSTANCE;
            java.lang.Object obj4 = atomicReference.get();
            left = obj4 == arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(map2) : new arrow.core.Ior.Both(obj4, map2);
            this.unwrapAs = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(left);
            this.getHighSpeedVideoSizesFor = null;
            this.getOutputFormats = null;
            this.getInputFormats = null;
            this.getOutputMinFrameDurationlomOqCM = null;
            this.getOutputStallDuration = null;
            this.getOutputSizeshNQ4ISI = null;
            this.getOutputStallDurationlomOqCM = null;
            this.getOutputSizes = null;
            this.toString = 2;
        } else {
            com.paypal.oslo.feature.p2p.domain.error.TransferError.DataNotFound dataNotFound2 = com.paypal.oslo.feature.p2p.domain.error.TransferError.DataNotFound.INSTANCE;
            com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.logNoDataError(graphQLData, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.RESOLVE_PLAN_CONTINGENCY_ERROR_NO_DATA);
            iorRaise2.raise(dataNotFound2);
            throw new kotlin.KotlinNothingValueException();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.TransferError, ? extends com.paypal.oslo.feature.p2p.domain.model.FundingOptions>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$resolvePlanContingency$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$resolvePlanContingency$1 transferFlowRepositoryImpl$resolvePlanContingency$1 = new com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$resolvePlanContingency$1(this.Camera2StreamConfigurationMap, this.getValidOutputFormatsForInputhNQ4ISI, continuation);
        transferFlowRepositoryImpl$resolvePlanContingency$1.unwrapAs = obj;
        return transferFlowRepositoryImpl$resolvePlanContingency$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransferFlowRepositoryImpl$resolvePlanContingency$1(com.paypal.oslo.feature.p2p.domain.model.ResolvePlanContingencyInput resolvePlanContingencyInput, com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl transferFlowRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$resolvePlanContingency$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = resolvePlanContingencyInput;
        this.getValidOutputFormatsForInputhNQ4ISI = transferFlowRepositoryImpl;
    }
}
