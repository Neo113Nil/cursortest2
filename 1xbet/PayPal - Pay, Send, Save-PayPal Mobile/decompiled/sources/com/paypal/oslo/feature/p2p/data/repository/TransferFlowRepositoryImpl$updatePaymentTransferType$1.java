package com.paypal.oslo.feature.p2p.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/p2p/domain/error/TransferError;", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdateTransferTypeResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$updatePaymentTransferType$1", f = "TransferFlowRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1}, l = {475, androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_X}, m = "invokeSuspend", n = {"$this$flow", "combineError$iv", "state$iv", "raise$iv$iv$iv", "$this$ior_u24lambda_u240$iv", "$this$invokeSuspend_u24lambda_u241", "input", "graphqlTransferType", "$i$f$ior", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-_foldOrThrow-RaiseKt__BuildersKt$ior$1$iv", "$i$a$-ior-TransferFlowRepositoryImpl$updatePaymentTransferType$1$result$2", "$this$flow", "result"}, nl = {479, 507}, s = {"L$0", "L$1", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class TransferFlowRepositoryImpl$updatePaymentTransferType$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.TransferError, ? extends com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResult>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.PaymentType getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    int getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    java.lang.Object getValidOutputFormatsForInputhNQ4ISI;
    java.lang.Object isOutputSupportedFor;
    private /* synthetic */ java.lang.Object isOutputSupportedForhNQ4ISI;
    int toString;
    final /* synthetic */ com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl unwrapAs;

    public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.error.TransferError getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.p2p.domain.error.TransferError transferError) {
        return transferError;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x01fe, code lost:
    
        if (r2.emit(r4, r16) != r3) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01cc  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.functions.Function2 function2;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.IorRaise iorRaise;
        com.paypal.oslo.api.graphql.schema.type.PaymentTransferType paymentTransferType;
        dagger.Lazy lazy;
        java.lang.Object executeMutation;
        com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl transferFlowRepositoryImpl;
        java.util.concurrent.atomic.AtomicReference atomicReference2;
        arrow.core.raise.IorRaise iorRaise2;
        arrow.core.raise.DefaultRaise defaultRaise2;
        java.lang.Object obj2;
        arrow.core.Ior.Left left;
        kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.isOutputSupportedForhNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.toString;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UPDATE_TRANSFER_TYPE_REQUEST, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_TYPE, this.getHighSpeedVideoFpsRangesFor.name())), null, 4, null);
            function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$updatePaymentTransferType$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$updatePaymentTransferType$1.getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.p2p.domain.error.TransferError) obj3);
                }
            };
            com.paypal.oslo.feature.p2p.domain.model.PaymentType paymentType = this.getHighSpeedVideoFpsRangesFor;
            java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.String str2 = this.getHighSpeedVideoSizes;
            com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl transferFlowRepositoryImpl2 = this.unwrapAs;
            atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
            defaultRaise = new arrow.core.raise.DefaultRaise(false);
            try {
                arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                iorRaise = new arrow.core.raise.IorRaise(function2, atomicReference, defaultRaise3);
                int i2 = com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$updatePaymentTransferType$1.WhenMappings.$EnumSwitchMapping$0[paymentType.ordinal()];
                if (i2 == 1) {
                    paymentTransferType = com.paypal.oslo.api.graphql.schema.type.PaymentTransferType.PERSONAL;
                } else {
                    if (i2 != 2) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    paymentTransferType = com.paypal.oslo.api.graphql.schema.type.PaymentTransferType.PURCHASE;
                }
                com.paypal.oslo.api.graphql.schema.type.UpdatePaymentTransferAttemptTransferTypeInput updatePaymentTransferAttemptTransferTypeInput = new com.paypal.oslo.api.graphql.schema.type.UpdatePaymentTransferAttemptTransferTypeInput(str, paymentTransferType, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(str2));
                lazy = transferFlowRepositoryImpl2.getHighSpeedVideoSizes;
                java.lang.Object obj3 = lazy.get();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj3, "");
                com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptTransferTypeMutation updatePaymentTransferAttemptTransferTypeMutation = new com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptTransferTypeMutation(updatePaymentTransferAttemptTransferTypeInput);
                com.paypal.oslo.core.network.graphql.RiskSourceId updatePaymentTransferAttemptTransferType = com.paypal.oslo.core.network.graphql.RiskSourceId.P2P.INSTANCE.getUpdatePaymentTransferAttemptTransferType();
                this.isOutputSupportedForhNQ4ISI = flowCollector;
                this.getOutputFormats = function2;
                this.getOutputMinFrameDuration = transferFlowRepositoryImpl2;
                this.getOutputMinFrameDurationlomOqCM = atomicReference;
                this.getOutputStallDuration = defaultRaise;
                this.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                this.getOutputSizeshNQ4ISI = iorRaise;
                this.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updatePaymentTransferAttemptTransferTypeInput);
                this.getValidOutputFormatsForInputhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentTransferType);
                this.isOutputSupportedFor = iorRaise;
                this.Camera2StreamConfigurationMap = 0;
                this.getHighSpeedVideoFpsRanges = 0;
                this.getHighSpeedVideoSizesFor = 0;
                this.getInputSizeshNQ4ISI = 0;
                this.getInputFormats = 0;
                this.toString = 1;
                executeMutation = com.paypal.oslo.feature.p2p.data.ApolloClientExtensionsKt.executeMutation((com.apollographql.apollo.ApolloClient) obj3, updatePaymentTransferAttemptTransferTypeMutation, updatePaymentTransferAttemptTransferType, this);
                if (executeMutation != coroutine_suspended) {
                    transferFlowRepositoryImpl = transferFlowRepositoryImpl2;
                    atomicReference2 = atomicReference;
                    iorRaise2 = iorRaise;
                    defaultRaise2 = defaultRaise;
                }
            } catch (arrow.core.raise.RaiseCancellationException e) {
                e = e;
                defaultRaise.complete();
                java.lang.Object raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                arrow.core.EmptyValue emptyValue = arrow.core.EmptyValue.INSTANCE;
                obj2 = atomicReference.get();
                if (obj2 != arrow.core.EmptyValue.INSTANCE) {
                }
                left = new arrow.core.Ior.Left(raisedOrRethrow);
                this.isOutputSupportedForhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(left);
                this.getOutputMinFrameDuration = null;
                this.getOutputMinFrameDurationlomOqCM = null;
                this.getOutputStallDuration = null;
                this.getOutputStallDurationlomOqCM = null;
                this.getOutputSizeshNQ4ISI = null;
                this.getOutputSizes = null;
                this.getValidOutputFormatsForInputhNQ4ISI = null;
                this.isOutputSupportedFor = null;
                this.toString = 2;
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
        arrow.core.raise.IorRaise iorRaise3 = (arrow.core.raise.IorRaise) this.isOutputSupportedFor;
        iorRaise2 = (arrow.core.raise.IorRaise) this.getOutputSizeshNQ4ISI;
        defaultRaise2 = (arrow.core.raise.DefaultRaise) this.getOutputStallDuration;
        atomicReference2 = (java.util.concurrent.atomic.AtomicReference) this.getOutputMinFrameDurationlomOqCM;
        transferFlowRepositoryImpl = (com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl) this.getOutputMinFrameDuration;
        try {
            kotlin.ResultKt.throwOnFailure(obj);
            iorRaise = iorRaise3;
            executeMutation = obj;
        } catch (arrow.core.raise.RaiseCancellationException e2) {
            e = e2;
            defaultRaise = defaultRaise2;
            atomicReference = atomicReference2;
            function2 = (kotlin.jvm.functions.Function2) this.getOutputFormats;
            defaultRaise.complete();
            java.lang.Object raisedOrRethrow2 = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
            arrow.core.EmptyValue emptyValue2 = arrow.core.EmptyValue.INSTANCE;
            obj2 = atomicReference.get();
            if (obj2 != arrow.core.EmptyValue.INSTANCE) {
                raisedOrRethrow2 = function2.invoke(obj2, raisedOrRethrow2);
            }
            left = new arrow.core.Ior.Left(raisedOrRethrow2);
            this.isOutputSupportedForhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
            this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(left);
            this.getOutputMinFrameDuration = null;
            this.getOutputMinFrameDurationlomOqCM = null;
            this.getOutputStallDuration = null;
            this.getOutputStallDurationlomOqCM = null;
            this.getOutputSizeshNQ4ISI = null;
            this.getOutputSizes = null;
            this.getValidOutputFormatsForInputhNQ4ISI = null;
            this.isOutputSupportedFor = null;
            this.toString = 2;
        } catch (java.lang.Throwable th2) {
            th = th2;
            defaultRaise = defaultRaise2;
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
        arrow.core.Ior.Both both = (arrow.core.Ior) executeMutation;
        if (both instanceof arrow.core.Ior.Left) {
            com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue();
            com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.logCallError(callError, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UPDATE_TRANSFER_TYPE_ERROR_NETWORK, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UPDATE_TRANSFER_TYPE_ERROR_GRAPHQL);
            both = new arrow.core.Ior.Left(com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImplKt.access$toTransferError(callError));
        } else if (!(both instanceof arrow.core.Ior.Right)) {
            if (both instanceof arrow.core.Ior.Both) {
                com.paypal.oslo.core.network.graphql.error.CallError callError2 = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) both).getLeftValue();
                com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.logCallError(callError2, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UPDATE_TRANSFER_TYPE_ERROR_NETWORK, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UPDATE_TRANSFER_TYPE_ERROR_GRAPHQL);
                both = new arrow.core.Ior.Both(com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImplKt.access$toTransferError(callError2), ((arrow.core.Ior.Both) both).getRightValue());
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both);
        com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptTransferTypeMutation.Data data = (com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptTransferTypeMutation.Data) graphQLData.getData();
        if (data == null) {
            com.paypal.oslo.feature.p2p.domain.error.TransferError.DataNotFound dataNotFound = com.paypal.oslo.feature.p2p.domain.error.TransferError.DataNotFound.INSTANCE;
            com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.logNoDataError(graphQLData, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UPDATE_TRANSFER_TYPE_ERROR_NO_DATA);
            iorRaise2.raise(dataNotFound);
            throw new kotlin.KotlinNothingValueException();
        }
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UPDATE_TRANSFER_TYPE_SUCCESS, kotlin.collections.MapsKt.emptyMap(), null, 4, null);
        com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResult access$mapUpdateTransferTypeResult = com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl.access$mapUpdateTransferTypeResult(transferFlowRepositoryImpl, data);
        defaultRaise2.complete();
        arrow.core.EmptyValue emptyValue3 = arrow.core.EmptyValue.INSTANCE;
        java.lang.Object obj4 = atomicReference2.get();
        left = obj4 == arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(access$mapUpdateTransferTypeResult) : new arrow.core.Ior.Both(obj4, access$mapUpdateTransferTypeResult);
        this.isOutputSupportedForhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
        this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(left);
        this.getOutputMinFrameDuration = null;
        this.getOutputMinFrameDurationlomOqCM = null;
        this.getOutputStallDuration = null;
        this.getOutputStallDurationlomOqCM = null;
        this.getOutputSizeshNQ4ISI = null;
        this.getOutputSizes = null;
        this.getValidOutputFormatsForInputhNQ4ISI = null;
        this.isOutputSupportedFor = null;
        this.toString = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.TransferError, ? extends com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResult>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$updatePaymentTransferType$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.p2p.domain.model.PaymentType.values().length];
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.PaymentType.PERSONAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.PaymentType.PURCHASE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$updatePaymentTransferType$1 transferFlowRepositoryImpl$updatePaymentTransferType$1 = new com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$updatePaymentTransferType$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.unwrapAs, continuation);
        transferFlowRepositoryImpl$updatePaymentTransferType$1.isOutputSupportedForhNQ4ISI = obj;
        return transferFlowRepositoryImpl$updatePaymentTransferType$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransferFlowRepositoryImpl$updatePaymentTransferType$1(com.paypal.oslo.feature.p2p.domain.model.PaymentType paymentType, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl transferFlowRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$updatePaymentTransferType$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = paymentType;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoSizes = str2;
        this.unwrapAs = transferFlowRepositoryImpl;
    }
}
