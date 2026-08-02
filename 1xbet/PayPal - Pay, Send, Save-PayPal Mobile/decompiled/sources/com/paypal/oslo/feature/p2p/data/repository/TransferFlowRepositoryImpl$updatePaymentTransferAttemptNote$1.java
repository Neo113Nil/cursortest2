package com.paypal.oslo.feature.p2p.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/p2p/domain/error/TransferError;", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptNoteResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$updatePaymentTransferAttemptNote$1", f = "TransferFlowRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1}, l = {408, 442}, m = "invokeSuspend", n = {"$this$flow", "combineError$iv", "state$iv", "raise$iv$iv$iv", "$this$ior_u24lambda_u240$iv", "$this$invokeSuspend_u24lambda_u241", "input", "$i$f$ior", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-_foldOrThrow-RaiseKt__BuildersKt$ior$1$iv", "$i$a$-ior-TransferFlowRepositoryImpl$updatePaymentTransferAttemptNote$1$result$2", "$this$flow", "result"}, nl = {412, 443}, s = {"L$0", "L$1", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class TransferFlowRepositoryImpl$updatePaymentTransferAttemptNote$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.TransferError, ? extends com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptNoteResult>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.Note getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
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
    int toString;
    final /* synthetic */ com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl unwrapAs;

    public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.error.TransferError getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.p2p.domain.error.TransferError transferError) {
        return transferError;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x023f, code lost:
    
        if (r2.emit(r4, r26) == r3) goto L62;
     */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x01f2: INVOKE (r10 I:arrow.core.raise.DefaultRaise) VIRTUAL call: arrow.core.raise.DefaultRaise.complete():boolean A[MD:():boolean (m)] (LINE:965), block:B:61:0x01f2 */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x01fa: INVOKE (r10 I:arrow.core.raise.DefaultRaise) VIRTUAL call: arrow.core.raise.DefaultRaise.complete():boolean A[MD:():boolean (m)] (LINE:956), block:B:56:0x01fa */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0205: INVOKE (r4 I:java.lang.Object) = (r11 I:java.util.concurrent.atomic.AtomicReference) VIRTUAL call: java.util.concurrent.atomic.AtomicReference.get():java.lang.Object A[MD:():V (c)], block:B:56:0x01fa */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x020d: INVOKE (r0 I:java.lang.Object) = (r14 I:kotlin.jvm.functions.Function2), (r4 I:java.lang.Object), (r0 I:java.lang.Object) INTERFACE call: kotlin.jvm.functions.Function2.invoke(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(P1, P2):R (m)] (LINE:959), block:B:58:0x020d */
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
        com.paypal.oslo.feature.p2p.domain.model.Note note;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.IorRaise iorRaise;
        com.paypal.oslo.feature.p2p.data.mapper.TransferFlowMappers transferFlowMappers;
        dagger.Lazy lazy;
        java.lang.Object executeMutation;
        arrow.core.raise.IorRaise iorRaise2;
        java.lang.String memo;
        com.paypal.oslo.feature.p2p.data.mapper.TransferFlowMappers transferFlowMappers2;
        kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getValidOutputFormatsForInputhNQ4ISI;
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
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.p2p.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[3];
            pairArr[0] = kotlin.TuplesKt.to("attemptId", this.getHighSpeedVideoSizes.getPaymentTransferAttemptId());
            pairArr[1] = kotlin.TuplesKt.to("hasNote", java.lang.String.valueOf(this.getHighSpeedVideoSizes.getNote() != null));
            com.paypal.oslo.feature.p2p.domain.model.NoteDetails note2 = this.getHighSpeedVideoSizes.getNote();
            pairArr[2] = kotlin.TuplesKt.to("noteLength", java.lang.String.valueOf((note2 == null || (memo = note2.getMemo()) == null) ? 0 : memo.length()));
            com.paypal.android.logger.Logger.i$default(logger, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UPDATE_NOTE_REQUEST, kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            kotlin.jvm.functions.Function2 function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$updatePaymentTransferAttemptNote$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$updatePaymentTransferAttemptNote$1.getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.p2p.domain.error.TransferError) obj3);
                }
            };
            transferFlowRepositoryImpl = this.unwrapAs;
            note = this.getHighSpeedVideoSizes;
            atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
            defaultRaise = new arrow.core.raise.DefaultRaise(false);
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            iorRaise = new arrow.core.raise.IorRaise(function2, atomicReference, defaultRaise2);
            transferFlowMappers = transferFlowRepositoryImpl.Camera2StreamConfigurationMap;
            com.paypal.oslo.api.graphql.schema.type.UpdatePaymentTransferAttemptNoteInput mapRequest = transferFlowMappers.getNoteMapper().mapRequest(note);
            lazy = transferFlowRepositoryImpl.getHighSpeedVideoSizes;
            java.lang.Object obj3 = lazy.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj3, "");
            com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptNoteMutation updatePaymentTransferAttemptNoteMutation = new com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptNoteMutation(mapRequest);
            com.paypal.oslo.core.network.graphql.RiskSourceId updatePaymentTransferAttemptNote = com.paypal.oslo.core.network.graphql.RiskSourceId.P2P.INSTANCE.getUpdatePaymentTransferAttemptNote();
            this.getValidOutputFormatsForInputhNQ4ISI = flowCollector;
            this.getOutputMinFrameDuration = function2;
            this.getHighSpeedVideoSizesFor = transferFlowRepositoryImpl;
            this.getInputFormats = note;
            this.getInputSizeshNQ4ISI = atomicReference;
            this.getOutputStallDurationlomOqCM = defaultRaise;
            this.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise2);
            this.getOutputMinFrameDurationlomOqCM = iorRaise;
            this.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(mapRequest);
            this.getOutputSizes = iorRaise;
            this.getHighSpeedVideoFpsRanges = 0;
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
            this.Camera2StreamConfigurationMap = 0;
            this.getOutputFormats = 0;
            this.toString = 1;
            executeMutation = com.paypal.oslo.feature.p2p.data.ApolloClientExtensionsKt.executeMutation((com.apollographql.apollo.ApolloClient) obj3, updatePaymentTransferAttemptNoteMutation, updatePaymentTransferAttemptNote, this);
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
        arrow.core.raise.IorRaise iorRaise4 = (arrow.core.raise.IorRaise) this.getOutputMinFrameDurationlomOqCM;
        defaultRaise = (arrow.core.raise.DefaultRaise) this.getOutputStallDurationlomOqCM;
        atomicReference = (java.util.concurrent.atomic.AtomicReference) this.getInputSizeshNQ4ISI;
        note = (com.paypal.oslo.feature.p2p.domain.model.Note) this.getInputFormats;
        transferFlowRepositoryImpl = (com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl) this.getHighSpeedVideoSizesFor;
        kotlin.ResultKt.throwOnFailure(obj);
        iorRaise2 = iorRaise4;
        iorRaise = iorRaise3;
        executeMutation = obj;
        arrow.core.Ior.Both both = (arrow.core.Ior) executeMutation;
        if (both instanceof arrow.core.Ior.Left) {
            com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.logCallError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue(), com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UPDATE_NOTE_ERROR_NETWORK, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UPDATE_NOTE_ERROR_GRAPHQL);
            both = new arrow.core.Ior.Left(com.paypal.oslo.feature.p2p.domain.error.TransferError.Network.INSTANCE);
        } else if (!(both instanceof arrow.core.Ior.Right)) {
            if (both instanceof arrow.core.Ior.Both) {
                com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.logCallError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) both).getLeftValue(), com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UPDATE_NOTE_ERROR_NETWORK, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UPDATE_NOTE_ERROR_GRAPHQL);
                both = new arrow.core.Ior.Both(com.paypal.oslo.feature.p2p.domain.error.TransferError.Network.INSTANCE, ((arrow.core.Ior.Both) both).getRightValue());
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both);
        com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptNoteMutation.Data data = (com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptNoteMutation.Data) graphQLData.getData();
        if (data != null) {
            transferFlowMappers2 = transferFlowRepositoryImpl.Camera2StreamConfigurationMap;
            com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptNoteResult mapResponse = transferFlowMappers2.getNoteMapper().mapResponse(data);
            com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.p2p.LoggerKt.log;
            kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
            pairArr2[0] = kotlin.TuplesKt.to("attemptId", note.getPaymentTransferAttemptId());
            pairArr2[1] = kotlin.TuplesKt.to("hasNote", java.lang.String.valueOf(note.getNote() != null));
            com.paypal.android.logger.Logger.i$default(logger2, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UPDATE_NOTE_SUCCESS, kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
            defaultRaise.complete();
            arrow.core.EmptyValue emptyValue2 = arrow.core.EmptyValue.INSTANCE;
            java.lang.Object obj4 = atomicReference.get();
            left = obj4 == arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(mapResponse) : new arrow.core.Ior.Both(obj4, mapResponse);
            this.getValidOutputFormatsForInputhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(left);
            this.getHighSpeedVideoSizesFor = null;
            this.getInputFormats = null;
            this.getInputSizeshNQ4ISI = null;
            this.getOutputStallDurationlomOqCM = null;
            this.getOutputSizeshNQ4ISI = null;
            this.getOutputMinFrameDurationlomOqCM = null;
            this.getOutputStallDuration = null;
            this.getOutputSizes = null;
            this.toString = 2;
        } else {
            com.paypal.oslo.feature.p2p.domain.error.TransferError.DataNotFound dataNotFound = com.paypal.oslo.feature.p2p.domain.error.TransferError.DataNotFound.INSTANCE;
            com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.logNoDataError(graphQLData, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UPDATE_NOTE_ERROR_NO_DATA);
            iorRaise2.raise(dataNotFound);
            throw new kotlin.KotlinNothingValueException();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.TransferError, ? extends com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptNoteResult>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$updatePaymentTransferAttemptNote$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$updatePaymentTransferAttemptNote$1 transferFlowRepositoryImpl$updatePaymentTransferAttemptNote$1 = new com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$updatePaymentTransferAttemptNote$1(this.getHighSpeedVideoSizes, this.unwrapAs, continuation);
        transferFlowRepositoryImpl$updatePaymentTransferAttemptNote$1.getValidOutputFormatsForInputhNQ4ISI = obj;
        return transferFlowRepositoryImpl$updatePaymentTransferAttemptNote$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransferFlowRepositoryImpl$updatePaymentTransferAttemptNote$1(com.paypal.oslo.feature.p2p.domain.model.Note note, com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl transferFlowRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$updatePaymentTransferAttemptNote$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = note;
        this.unwrapAs = transferFlowRepositoryImpl;
    }
}
