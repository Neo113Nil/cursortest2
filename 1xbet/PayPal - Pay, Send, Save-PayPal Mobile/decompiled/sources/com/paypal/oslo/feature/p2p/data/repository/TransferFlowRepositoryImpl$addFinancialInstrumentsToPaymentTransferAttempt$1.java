package com.paypal.oslo.feature.p2p.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/p2p/domain/error/TransferError;", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$addFinancialInstrumentsToPaymentTransferAttempt$1", f = "TransferFlowRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1}, l = {562, com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.ENROLLMENT_OS_UPGRADE_REQUIRED}, m = "invokeSuspend", n = {"$this$flow", "combineError$iv", "state$iv", "raise$iv$iv$iv", "$this$ior_u24lambda_u240$iv", "$this$invokeSuspend_u24lambda_u241", "input", "$i$f$ior", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-_foldOrThrow-RaiseKt__BuildersKt$ior$1$iv", "$i$a$-ior-TransferFlowRepositoryImpl$addFinancialInstrumentsToPaymentTransferAttempt$1$result$2", "$this$flow", "result"}, nl = {com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST, 599}, s = {"L$0", "L$1", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class TransferFlowRepositoryImpl$addFinancialInstrumentsToPaymentTransferAttempt$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.TransferError, ? extends com.paypal.oslo.feature.p2p.domain.model.FundingOptions>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ java.util.List<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    private /* synthetic */ java.lang.Object getValidOutputFormatsForInputhNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl isOutputSupportedFor;
    int isOutputSupportedForhNQ4ISI;
    java.lang.Object unwrapAs;

    public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.error.TransferError getHighSpeedVideoSizes(com.paypal.oslo.feature.p2p.domain.error.TransferError transferError) {
        return transferError;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x01ea, code lost:
    
        if (r2.emit(r4, r24) == r3) goto L50;
     */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x01b8: INVOKE (r0 I:java.lang.Object) = (r12 I:kotlin.jvm.functions.Function2), (r4 I:java.lang.Object), (r0 I:java.lang.Object) INTERFACE call: kotlin.jvm.functions.Function2.invoke(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(P1, P2):R (m)] (LINE:959), block:B:48:0x01b8 */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x019c: INVOKE (r8 I:arrow.core.raise.DefaultRaise) VIRTUAL call: arrow.core.raise.DefaultRaise.complete():boolean A[MD:():boolean (m)] (LINE:965), block:B:51:0x019c */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x01a5: INVOKE (r8 I:arrow.core.raise.DefaultRaise) VIRTUAL call: arrow.core.raise.DefaultRaise.complete():boolean A[MD:():boolean (m)] (LINE:956), block:B:46:0x01a5 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x01b0: INVOKE (r4 I:java.lang.Object) = (r9 I:java.util.concurrent.atomic.AtomicReference) VIRTUAL call: java.util.concurrent.atomic.AtomicReference.get():java.lang.Object A[MD:():V (c)], block:B:46:0x01a5 */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.concurrent.atomic.AtomicReference] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        arrow.core.raise.DefaultRaise complete;
        arrow.core.raise.DefaultRaise complete2;
        ?? r9;
        arrow.core.Ior.Left left;
        ?? invoke;
        java.lang.String str;
        com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl transferFlowRepositoryImpl;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.IorRaise iorRaise;
        dagger.Lazy lazy;
        java.lang.Object executeMutation;
        arrow.core.raise.IorRaise iorRaise2;
        com.paypal.oslo.feature.p2p.data.mapper.TransferFlowMappers transferFlowMappers;
        kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getValidOutputFormatsForInputhNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.isOutputSupportedForhNQ4ISI;
        try {
        } catch (arrow.core.raise.RaiseCancellationException e) {
            complete2.complete();
            java.lang.Object raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e, complete2);
            arrow.core.EmptyValue emptyValue = arrow.core.EmptyValue.INSTANCE;
            java.lang.Object obj2 = r9.get();
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
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.ADD_FINANCIAL_INSTRUMENTS_REQUEST, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, this.getHighSpeedVideoFpsRanges)), null, 4, null);
            kotlin.jvm.functions.Function2 function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$addFinancialInstrumentsToPaymentTransferAttempt$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$addFinancialInstrumentsToPaymentTransferAttempt$1.getHighSpeedVideoSizes((com.paypal.oslo.feature.p2p.domain.error.TransferError) obj3);
                }
            };
            str = this.getHighSpeedVideoFpsRanges;
            java.util.List<java.lang.String> list = this.getHighResolutionOutputSizeshNQ4ISI;
            transferFlowRepositoryImpl = this.isOutputSupportedFor;
            atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
            defaultRaise = new arrow.core.raise.DefaultRaise(false);
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            iorRaise = new arrow.core.raise.IorRaise(function2, atomicReference, defaultRaise2);
            com.paypal.oslo.api.graphql.schema.type.AddFinancialInstrumentsToPaymentTransferAttemptInput addFinancialInstrumentsToPaymentTransferAttemptInput = new com.paypal.oslo.api.graphql.schema.type.AddFinancialInstrumentsToPaymentTransferAttemptInput(str, list);
            lazy = transferFlowRepositoryImpl.getHighSpeedVideoSizes;
            java.lang.Object obj3 = lazy.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj3, "");
            com.paypal.oslo.feature.p2p.graphql.AddFinancialInstrumentsToPaymentTransferAttemptMutation addFinancialInstrumentsToPaymentTransferAttemptMutation = new com.paypal.oslo.feature.p2p.graphql.AddFinancialInstrumentsToPaymentTransferAttemptMutation(addFinancialInstrumentsToPaymentTransferAttemptInput);
            com.paypal.oslo.core.network.graphql.RiskSourceId addFinancialInstruments = com.paypal.oslo.core.network.graphql.RiskSourceId.P2P.INSTANCE.getAddFinancialInstruments();
            this.getValidOutputFormatsForInputhNQ4ISI = flowCollector;
            this.getInputFormats = function2;
            this.getInputSizeshNQ4ISI = str;
            this.getOutputMinFrameDuration = transferFlowRepositoryImpl;
            this.getOutputSizeshNQ4ISI = atomicReference;
            this.getOutputStallDuration = defaultRaise;
            this.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise2);
            this.getOutputSizes = iorRaise;
            this.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addFinancialInstrumentsToPaymentTransferAttemptInput);
            this.unwrapAs = iorRaise;
            this.Camera2StreamConfigurationMap = 0;
            this.getHighSpeedVideoSizes = 0;
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.getOutputFormats = 0;
            this.getHighSpeedVideoSizesFor = 0;
            this.isOutputSupportedForhNQ4ISI = 1;
            executeMutation = com.paypal.oslo.feature.p2p.data.ApolloClientExtensionsKt.executeMutation((com.apollographql.apollo.ApolloClient) obj3, addFinancialInstrumentsToPaymentTransferAttemptMutation, addFinancialInstruments, this);
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
        arrow.core.raise.IorRaise iorRaise3 = (arrow.core.raise.IorRaise) this.unwrapAs;
        iorRaise2 = (arrow.core.raise.IorRaise) this.getOutputSizes;
        defaultRaise = (arrow.core.raise.DefaultRaise) this.getOutputStallDuration;
        atomicReference = (java.util.concurrent.atomic.AtomicReference) this.getOutputSizeshNQ4ISI;
        transferFlowRepositoryImpl = (com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl) this.getOutputMinFrameDuration;
        str = (java.lang.String) this.getInputSizeshNQ4ISI;
        kotlin.ResultKt.throwOnFailure(obj);
        iorRaise = iorRaise3;
        executeMutation = obj;
        arrow.core.Ior.Both both = (arrow.core.Ior) executeMutation;
        if (both instanceof arrow.core.Ior.Left) {
            com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.logCallError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue(), com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.ADD_FINANCIAL_INSTRUMENTS_ERROR_NETWORK, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.ADD_FINANCIAL_INSTRUMENTS_ERROR_GRAPHQL);
            both = new arrow.core.Ior.Left(com.paypal.oslo.feature.p2p.domain.error.TransferError.Network.INSTANCE);
        } else if (!(both instanceof arrow.core.Ior.Right)) {
            if (both instanceof arrow.core.Ior.Both) {
                com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.logCallError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) both).getLeftValue(), com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.ADD_FINANCIAL_INSTRUMENTS_ERROR_NETWORK, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.ADD_FINANCIAL_INSTRUMENTS_ERROR_GRAPHQL);
                both = new arrow.core.Ior.Both(com.paypal.oslo.feature.p2p.domain.error.TransferError.Network.INSTANCE, ((arrow.core.Ior.Both) both).getRightValue());
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both);
        com.paypal.oslo.feature.p2p.graphql.AddFinancialInstrumentsToPaymentTransferAttemptMutation.Data data = (com.paypal.oslo.feature.p2p.graphql.AddFinancialInstrumentsToPaymentTransferAttemptMutation.Data) graphQLData.getData();
        if (data == null) {
            com.paypal.oslo.feature.p2p.domain.error.TransferError.DataNotFound dataNotFound = com.paypal.oslo.feature.p2p.domain.error.TransferError.DataNotFound.INSTANCE;
            com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.logNoDataError(graphQLData, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.ADD_FINANCIAL_INSTRUMENTS_ERROR_NO_DATA);
            iorRaise2.raise(dataNotFound);
            throw new kotlin.KotlinNothingValueException();
        }
        com.paypal.oslo.feature.p2p.graphql.AddFinancialInstrumentsToPaymentTransferAttemptMutation.PaymentTransferAttempt paymentTransferAttempt = data.getAddFinancialInstrumentsToPaymentTransferAttempt().getPaymentTransferAttempt();
        transferFlowMappers = transferFlowRepositoryImpl.Camera2StreamConfigurationMap;
        com.paypal.oslo.feature.p2p.data.mapper.PaymentTransferAttemptFundingOptionsMapper fundingOptionsMapper = transferFlowMappers.getFundingOptionsMapper();
        com.paypal.oslo.feature.p2p.graphql.AddFinancialInstrumentsToPaymentTransferAttemptMutation.FundingOptions fundingOptions = paymentTransferAttempt.getFundingOptions();
        com.paypal.oslo.feature.p2p.domain.model.FundingOptions map = fundingOptionsMapper.map(fundingOptions != null ? fundingOptions.getP2PFundingOptionsFragment() : null);
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.ADD_FINANCIAL_INSTRUMENTS_SUCCESS, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, str)), null, 4, null);
        defaultRaise.complete();
        arrow.core.EmptyValue emptyValue2 = arrow.core.EmptyValue.INSTANCE;
        java.lang.Object obj4 = atomicReference.get();
        left = obj4 == arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(map) : new arrow.core.Ior.Both(obj4, map);
        this.getValidOutputFormatsForInputhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
        this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(left);
        this.getInputSizeshNQ4ISI = null;
        this.getOutputMinFrameDuration = null;
        this.getOutputSizeshNQ4ISI = null;
        this.getOutputStallDuration = null;
        this.getOutputMinFrameDurationlomOqCM = null;
        this.getOutputSizes = null;
        this.getOutputStallDurationlomOqCM = null;
        this.unwrapAs = null;
        this.isOutputSupportedForhNQ4ISI = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.TransferError, ? extends com.paypal.oslo.feature.p2p.domain.model.FundingOptions>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$addFinancialInstrumentsToPaymentTransferAttempt$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$addFinancialInstrumentsToPaymentTransferAttempt$1 transferFlowRepositoryImpl$addFinancialInstrumentsToPaymentTransferAttempt$1 = new com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$addFinancialInstrumentsToPaymentTransferAttempt$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.isOutputSupportedFor, continuation);
        transferFlowRepositoryImpl$addFinancialInstrumentsToPaymentTransferAttempt$1.getValidOutputFormatsForInputhNQ4ISI = obj;
        return transferFlowRepositoryImpl$addFinancialInstrumentsToPaymentTransferAttempt$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransferFlowRepositoryImpl$addFinancialInstrumentsToPaymentTransferAttempt$1(java.lang.String str, java.util.List<java.lang.String> list, com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl transferFlowRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$addFinancialInstrumentsToPaymentTransferAttempt$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighResolutionOutputSizeshNQ4ISI = list;
        this.isOutputSupportedFor = transferFlowRepositoryImpl;
    }
}
