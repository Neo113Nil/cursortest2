package com.paypal.oslo.feature.p2p.data.repository;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0012\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/data/repository/ClaimMoneyRepositoryImpl;", "Lcom/paypal/oslo/feature/p2p/domain/repository/ClaimMoneyRepository;", "Ljavax/inject/Provider;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/p2p/data/mapper/ClaimMoneyTransferMapper;", "getPaymentTransferMapper", "Lcom/paypal/oslo/feature/p2p/data/mapper/CompletePaymentTransferMapper;", "completePaymentTransferMapper", "<init>", "(Ljavax/inject/Provider;Lcom/paypal/oslo/feature/p2p/data/mapper/ClaimMoneyTransferMapper;Lcom/paypal/oslo/feature/p2p/data/mapper/CompletePaymentTransferMapper;)V", "", "id", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/p2p/domain/error/ClaimMoneyError;", "Lcom/paypal/oslo/feature/p2p/domain/model/ClaimMoneyTransfer;", "getPaymentTransfer", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transactionId", "completePendingPaymentTransfer", "getHighSpeedVideoFpsRangesFor", "Ljavax/inject/Provider;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/p2p/data/mapper/ClaimMoneyTransferMapper;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/p2p/data/mapper/CompletePaymentTransferMapper;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ClaimMoneyRepositoryImpl implements com.paypal.oslo.feature.p2p.domain.repository.ClaimMoneyRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.data.mapper.ClaimMoneyTransferMapper getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.p2p.data.mapper.CompletePaymentTransferMapper getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final javax.inject.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    @javax.inject.Inject
    public ClaimMoneyRepositoryImpl(javax.inject.Provider<com.apollographql.apollo.ApolloClient> provider, com.paypal.oslo.feature.p2p.data.mapper.ClaimMoneyTransferMapper claimMoneyTransferMapper, com.paypal.oslo.feature.p2p.data.mapper.CompletePaymentTransferMapper completePaymentTransferMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(claimMoneyTransferMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completePaymentTransferMapper, "");
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = claimMoneyTransferMapper;
        this.getHighSpeedVideoFpsRanges = completePaymentTransferMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d2 A[Catch: all -> 0x0051, RaiseCancellationException -> 0x0054, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x0054, all -> 0x0051, blocks: (B:11:0x004c, B:12:0x00cc, B:15:0x00d2, B:18:0x00de, B:19:0x011b, B:20:0x018b, B:22:0x0199, B:24:0x019f, B:26:0x01a5, B:28:0x01b8, B:31:0x01c0, B:33:0x01c8, B:34:0x01d2, B:37:0x00f5, B:38:0x0124, B:39:0x0129, B:44:0x0133, B:47:0x0140, B:48:0x017d, B:51:0x0157, B:52:0x01d3, B:53:0x01d8, B:54:0x01d9, B:55:0x01de), top: B:10:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.p2p.domain.repository.ClaimMoneyRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getPaymentTransfer(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.ClaimMoneyError, com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyTransfer>> continuation) {
        com.paypal.oslo.feature.p2p.data.repository.ClaimMoneyRepositoryImpl$getPaymentTransfer$1 claimMoneyRepositoryImpl$getPaymentTransfer$1;
        int i;
        kotlin.jvm.functions.Function2 function2;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        java.util.concurrent.atomic.AtomicReference atomicReference2;
        arrow.core.raise.IorRaise iorRaise;
        arrow.core.raise.IorRaise iorRaise2;
        java.lang.Object obj;
        arrow.core.Ior.Both both;
        com.paypal.oslo.feature.p2p.domain.error.ClaimMoneyError.Unknown unknown;
        com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferQuery.Data data;
        com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferQuery.PaymentTransfer paymentTransfer;
        com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferQuery.OnPaymentTransfer onPaymentTransfer;
        com.paypal.oslo.feature.p2p.domain.error.ClaimMoneyError.Unknown unknown2;
        if (continuation instanceof com.paypal.oslo.feature.p2p.data.repository.ClaimMoneyRepositoryImpl$getPaymentTransfer$1) {
            claimMoneyRepositoryImpl$getPaymentTransfer$1 = (com.paypal.oslo.feature.p2p.data.repository.ClaimMoneyRepositoryImpl$getPaymentTransfer$1) continuation;
            if ((claimMoneyRepositoryImpl$getPaymentTransfer$1.getOutputSizes & Integer.MIN_VALUE) != 0) {
                claimMoneyRepositoryImpl$getPaymentTransfer$1.getOutputSizes -= 2147483648;
                java.lang.Object obj2 = claimMoneyRepositoryImpl$getPaymentTransfer$1.getOutputStallDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = claimMoneyRepositoryImpl$getPaymentTransfer$1.getOutputSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.data.repository.ClaimMoneyRepositoryImpl$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                            return com.paypal.oslo.feature.p2p.data.repository.ClaimMoneyRepositoryImpl.$r8$lambda$XdEVZv_5eqQi14JjXVHLclij2mU((com.paypal.oslo.feature.p2p.domain.error.ClaimMoneyError) obj3, (com.paypal.oslo.feature.p2p.domain.error.ClaimMoneyError) obj4);
                        }
                    };
                    atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        arrow.core.raise.IorRaise iorRaise3 = new arrow.core.raise.IorRaise(function2, atomicReference, defaultRaise3);
                        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoSizes.get();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                        com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferQuery getPaymentTransferQuery = new com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferQuery(new com.paypal.oslo.api.graphql.schema.type.PaymentTransferInput(str, com.paypal.oslo.api.graphql.schema.type.PaymentTransferAlternativeIdentifierType.PAYMENT_CODE));
                        com.paypal.oslo.core.network.graphql.RiskSourceId getPaymentTransfer = com.paypal.oslo.core.network.graphql.RiskSourceId.P2P.INSTANCE.getGetPaymentTransfer();
                        claimMoneyRepositoryImpl$getPaymentTransfer$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        claimMoneyRepositoryImpl$getPaymentTransfer$1.getOutputFormats = function2;
                        claimMoneyRepositoryImpl$getPaymentTransfer$1.getOutputMinFrameDuration = atomicReference;
                        claimMoneyRepositoryImpl$getPaymentTransfer$1.getHighSpeedVideoSizesFor = defaultRaise;
                        claimMoneyRepositoryImpl$getPaymentTransfer$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        claimMoneyRepositoryImpl$getPaymentTransfer$1.getOutputSizeshNQ4ISI = iorRaise3;
                        claimMoneyRepositoryImpl$getPaymentTransfer$1.getOutputStallDuration = iorRaise3;
                        claimMoneyRepositoryImpl$getPaymentTransfer$1.getHighSpeedVideoFpsRangesFor = 0;
                        claimMoneyRepositoryImpl$getPaymentTransfer$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        claimMoneyRepositoryImpl$getPaymentTransfer$1.getHighSpeedVideoSizes = 0;
                        claimMoneyRepositoryImpl$getPaymentTransfer$1.Camera2StreamConfigurationMap = 0;
                        claimMoneyRepositoryImpl$getPaymentTransfer$1.getHighSpeedVideoFpsRanges = 0;
                        claimMoneyRepositoryImpl$getPaymentTransfer$1.getOutputSizes = 1;
                        java.lang.Object executeQuery = com.paypal.oslo.feature.p2p.data.ApolloClientExtensionsKt.executeQuery(apolloClient, getPaymentTransferQuery, getPaymentTransfer, claimMoneyRepositoryImpl$getPaymentTransfer$1);
                        if (executeQuery == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        atomicReference2 = atomicReference;
                        defaultRaise2 = defaultRaise;
                        iorRaise = iorRaise3;
                        obj2 = executeQuery;
                        iorRaise2 = iorRaise;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        java.lang.Object raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                        arrow.core.EmptyValue emptyValue = arrow.core.EmptyValue.INSTANCE;
                        obj = atomicReference.get();
                        if (obj != arrow.core.EmptyValue.INSTANCE) {
                        }
                        return new arrow.core.Ior.Left(raisedOrRethrow);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise2 = defaultRaise;
                        defaultRaise2.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = claimMoneyRepositoryImpl$getPaymentTransfer$1.getHighSpeedVideoFpsRanges;
                    int i3 = claimMoneyRepositoryImpl$getPaymentTransfer$1.Camera2StreamConfigurationMap;
                    int i4 = claimMoneyRepositoryImpl$getPaymentTransfer$1.getHighSpeedVideoSizes;
                    int i5 = claimMoneyRepositoryImpl$getPaymentTransfer$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i6 = claimMoneyRepositoryImpl$getPaymentTransfer$1.getHighSpeedVideoFpsRangesFor;
                    iorRaise2 = (arrow.core.raise.IorRaise) claimMoneyRepositoryImpl$getPaymentTransfer$1.getOutputStallDuration;
                    iorRaise = (arrow.core.raise.IorRaise) claimMoneyRepositoryImpl$getPaymentTransfer$1.getOutputSizeshNQ4ISI;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) claimMoneyRepositoryImpl$getPaymentTransfer$1.getHighSpeedVideoSizesFor;
                    atomicReference2 = (java.util.concurrent.atomic.AtomicReference) claimMoneyRepositoryImpl$getPaymentTransfer$1.getOutputMinFrameDuration;
                    kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) claimMoneyRepositoryImpl$getPaymentTransfer$1.getOutputFormats;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj2);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        function2 = function22;
                        defaultRaise = defaultRaise2;
                        atomicReference = atomicReference2;
                        defaultRaise.complete();
                        java.lang.Object raisedOrRethrow2 = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                        arrow.core.EmptyValue emptyValue2 = arrow.core.EmptyValue.INSTANCE;
                        obj = atomicReference.get();
                        if (obj != arrow.core.EmptyValue.INSTANCE) {
                            raisedOrRethrow2 = function2.invoke(obj, raisedOrRethrow2);
                        }
                        return new arrow.core.Ior.Left(raisedOrRethrow2);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise2.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                both = (arrow.core.Ior) obj2;
                if (!(both instanceof arrow.core.Ior.Left)) {
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue();
                    if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.GET_PAYMENT_TRANSFER_ERROR_NETWORK, com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.toLoggingAttributes(callError), null, 4, null);
                        unknown2 = com.paypal.oslo.feature.p2p.domain.error.ClaimMoneyError.Network.INSTANCE;
                    } else {
                        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.GET_PAYMENT_TRANSFER_ERROR_GRAPHQL, com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.toLoggingAttributes(callError), null, 4, null);
                        unknown2 = new com.paypal.oslo.feature.p2p.domain.error.ClaimMoneyError.Unknown(((com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9583getHeadimpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY())).getMessage());
                    }
                    both = new arrow.core.Ior.Left(unknown2);
                } else if (!(both instanceof arrow.core.Ior.Right)) {
                    if (!(both instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.core.network.graphql.error.CallError callError2 = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) both).getLeftValue();
                    if (callError2 instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.GET_PAYMENT_TRANSFER_ERROR_NETWORK, com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.toLoggingAttributes(callError2), null, 4, null);
                        unknown = com.paypal.oslo.feature.p2p.domain.error.ClaimMoneyError.Network.INSTANCE;
                    } else {
                        if (!(callError2 instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.GET_PAYMENT_TRANSFER_ERROR_GRAPHQL, com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.toLoggingAttributes(callError2), null, 4, null);
                        unknown = new com.paypal.oslo.feature.p2p.domain.error.ClaimMoneyError.Unknown(((com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9583getHeadimpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError2).m11659getErrors1X0FAY())).getMessage());
                    }
                    both = new arrow.core.Ior.Both(unknown, ((arrow.core.Ior.Both) both).getRightValue());
                }
                data = (com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise2.bind(both)).getData();
                if (data != null || (paymentTransfer = data.getPaymentTransfer()) == null || (onPaymentTransfer = paymentTransfer.getOnPaymentTransfer()) == null) {
                    iorRaise.raise(com.paypal.oslo.feature.p2p.domain.error.ClaimMoneyError.DataNotFound.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyTransfer map = this.getHighResolutionOutputSizeshNQ4ISI.map(onPaymentTransfer);
                defaultRaise2.complete();
                arrow.core.EmptyValue emptyValue3 = arrow.core.EmptyValue.INSTANCE;
                java.lang.Object obj3 = atomicReference2.get();
                return obj3 == arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(map) : new arrow.core.Ior.Both(obj3, map);
            }
        }
        claimMoneyRepositoryImpl$getPaymentTransfer$1 = new com.paypal.oslo.feature.p2p.data.repository.ClaimMoneyRepositoryImpl$getPaymentTransfer$1(this, continuation);
        java.lang.Object obj22 = claimMoneyRepositoryImpl$getPaymentTransfer$1.getOutputStallDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = claimMoneyRepositoryImpl$getPaymentTransfer$1.getOutputSizes;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj22;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        data = (com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise2.bind(both)).getData();
        if (data != null) {
        }
        iorRaise.raise(com.paypal.oslo.feature.p2p.domain.error.ClaimMoneyError.DataNotFound.INSTANCE);
        throw new kotlin.KotlinNothingValueException();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d0 A[Catch: all -> 0x0051, RaiseCancellationException -> 0x0054, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x0054, all -> 0x0051, blocks: (B:11:0x004c, B:12:0x00ca, B:15:0x00d0, B:18:0x00dc, B:19:0x0119, B:20:0x0189, B:22:0x0197, B:24:0x019d, B:26:0x01a3, B:28:0x01b6, B:31:0x01be, B:33:0x01c6, B:34:0x01d0, B:37:0x00f3, B:38:0x0122, B:39:0x0127, B:44:0x0131, B:47:0x013e, B:48:0x017b, B:51:0x0155, B:52:0x01d1, B:53:0x01d6, B:54:0x01d7, B:55:0x01dc), top: B:10:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.p2p.domain.repository.ClaimMoneyRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object completePendingPaymentTransfer(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.ClaimMoneyError, com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyTransfer>> continuation) {
        com.paypal.oslo.feature.p2p.data.repository.ClaimMoneyRepositoryImpl$completePendingPaymentTransfer$1 claimMoneyRepositoryImpl$completePendingPaymentTransfer$1;
        int i;
        kotlin.jvm.functions.Function2 function2;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        java.util.concurrent.atomic.AtomicReference atomicReference2;
        arrow.core.raise.IorRaise iorRaise;
        arrow.core.raise.IorRaise iorRaise2;
        java.lang.Object obj;
        arrow.core.Ior.Both both;
        com.paypal.oslo.feature.p2p.domain.error.ClaimMoneyError.Unknown unknown;
        com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Data data;
        com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.CompletePendingPaymentTransfer completePendingPaymentTransfer;
        com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnPaymentTransfer onPaymentTransfer;
        com.paypal.oslo.feature.p2p.domain.error.ClaimMoneyError.Unknown unknown2;
        if (continuation instanceof com.paypal.oslo.feature.p2p.data.repository.ClaimMoneyRepositoryImpl$completePendingPaymentTransfer$1) {
            claimMoneyRepositoryImpl$completePendingPaymentTransfer$1 = (com.paypal.oslo.feature.p2p.data.repository.ClaimMoneyRepositoryImpl$completePendingPaymentTransfer$1) continuation;
            if ((claimMoneyRepositoryImpl$completePendingPaymentTransfer$1.getOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                claimMoneyRepositoryImpl$completePendingPaymentTransfer$1.getOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj2 = claimMoneyRepositoryImpl$completePendingPaymentTransfer$1.getOutputStallDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = claimMoneyRepositoryImpl$completePendingPaymentTransfer$1.getOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.data.repository.ClaimMoneyRepositoryImpl$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                            return com.paypal.oslo.feature.p2p.data.repository.ClaimMoneyRepositoryImpl.m17174$r8$lambda$83lVmLiBBy3_Rk7qBAkfSejHLE((com.paypal.oslo.feature.p2p.domain.error.ClaimMoneyError) obj3, (com.paypal.oslo.feature.p2p.domain.error.ClaimMoneyError) obj4);
                        }
                    };
                    atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        arrow.core.raise.IorRaise iorRaise3 = new arrow.core.raise.IorRaise(function2, atomicReference, defaultRaise3);
                        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoSizes.get();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                        com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation completePaymentTransferMutation = new com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation(new com.paypal.oslo.api.graphql.schema.type.CompletePendingPaymentTransferInput(str));
                        com.paypal.oslo.core.network.graphql.RiskSourceId completePendingPaymentTransfer2 = com.paypal.oslo.core.network.graphql.RiskSourceId.P2P.INSTANCE.getCompletePendingPaymentTransfer();
                        claimMoneyRepositoryImpl$completePendingPaymentTransfer$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        claimMoneyRepositoryImpl$completePendingPaymentTransfer$1.getInputSizeshNQ4ISI = function2;
                        claimMoneyRepositoryImpl$completePendingPaymentTransfer$1.getInputFormats = atomicReference;
                        claimMoneyRepositoryImpl$completePendingPaymentTransfer$1.getOutputMinFrameDuration = defaultRaise;
                        claimMoneyRepositoryImpl$completePendingPaymentTransfer$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        claimMoneyRepositoryImpl$completePendingPaymentTransfer$1.getOutputSizes = iorRaise3;
                        claimMoneyRepositoryImpl$completePendingPaymentTransfer$1.getOutputMinFrameDurationlomOqCM = iorRaise3;
                        claimMoneyRepositoryImpl$completePendingPaymentTransfer$1.getHighSpeedVideoFpsRanges = 0;
                        claimMoneyRepositoryImpl$completePendingPaymentTransfer$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        claimMoneyRepositoryImpl$completePendingPaymentTransfer$1.getHighSpeedVideoFpsRangesFor = 0;
                        claimMoneyRepositoryImpl$completePendingPaymentTransfer$1.Camera2StreamConfigurationMap = 0;
                        claimMoneyRepositoryImpl$completePendingPaymentTransfer$1.getHighSpeedVideoSizes = 0;
                        claimMoneyRepositoryImpl$completePendingPaymentTransfer$1.getOutputSizeshNQ4ISI = 1;
                        java.lang.Object executeMutation = com.paypal.oslo.feature.p2p.data.ApolloClientExtensionsKt.executeMutation(apolloClient, completePaymentTransferMutation, completePendingPaymentTransfer2, claimMoneyRepositoryImpl$completePendingPaymentTransfer$1);
                        if (executeMutation == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        atomicReference2 = atomicReference;
                        defaultRaise2 = defaultRaise;
                        iorRaise = iorRaise3;
                        obj2 = executeMutation;
                        iorRaise2 = iorRaise;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        java.lang.Object raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                        arrow.core.EmptyValue emptyValue = arrow.core.EmptyValue.INSTANCE;
                        obj = atomicReference.get();
                        if (obj != arrow.core.EmptyValue.INSTANCE) {
                            raisedOrRethrow = function2.invoke(obj, raisedOrRethrow);
                        }
                        return new arrow.core.Ior.Left(raisedOrRethrow);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise2 = defaultRaise;
                        defaultRaise2.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = claimMoneyRepositoryImpl$completePendingPaymentTransfer$1.getHighSpeedVideoSizes;
                    int i3 = claimMoneyRepositoryImpl$completePendingPaymentTransfer$1.Camera2StreamConfigurationMap;
                    int i4 = claimMoneyRepositoryImpl$completePendingPaymentTransfer$1.getHighSpeedVideoFpsRangesFor;
                    int i5 = claimMoneyRepositoryImpl$completePendingPaymentTransfer$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i6 = claimMoneyRepositoryImpl$completePendingPaymentTransfer$1.getHighSpeedVideoFpsRanges;
                    iorRaise2 = (arrow.core.raise.IorRaise) claimMoneyRepositoryImpl$completePendingPaymentTransfer$1.getOutputMinFrameDurationlomOqCM;
                    iorRaise = (arrow.core.raise.IorRaise) claimMoneyRepositoryImpl$completePendingPaymentTransfer$1.getOutputSizes;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) claimMoneyRepositoryImpl$completePendingPaymentTransfer$1.getOutputMinFrameDuration;
                    atomicReference2 = (java.util.concurrent.atomic.AtomicReference) claimMoneyRepositoryImpl$completePendingPaymentTransfer$1.getInputFormats;
                    kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) claimMoneyRepositoryImpl$completePendingPaymentTransfer$1.getInputSizeshNQ4ISI;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj2);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        function2 = function22;
                        defaultRaise = defaultRaise2;
                        atomicReference = atomicReference2;
                        defaultRaise.complete();
                        java.lang.Object raisedOrRethrow2 = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                        arrow.core.EmptyValue emptyValue2 = arrow.core.EmptyValue.INSTANCE;
                        obj = atomicReference.get();
                        if (obj != arrow.core.EmptyValue.INSTANCE) {
                        }
                        return new arrow.core.Ior.Left(raisedOrRethrow2);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise2.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                both = (arrow.core.Ior) obj2;
                if (!(both instanceof arrow.core.Ior.Left)) {
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue();
                    if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.COMPLETE_PENDING_PAYMENT_TRANSFER_ERROR_NETWORK, com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.toLoggingAttributes(callError), null, 4, null);
                        unknown2 = com.paypal.oslo.feature.p2p.domain.error.ClaimMoneyError.Network.INSTANCE;
                    } else {
                        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.COMPLETE_PENDING_PAYMENT_TRANSFER_ERROR_GRAPHQL, com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.toLoggingAttributes(callError), null, 4, null);
                        unknown2 = new com.paypal.oslo.feature.p2p.domain.error.ClaimMoneyError.Unknown(((com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9583getHeadimpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY())).getMessage());
                    }
                    both = new arrow.core.Ior.Left(unknown2);
                } else if (!(both instanceof arrow.core.Ior.Right)) {
                    if (!(both instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.core.network.graphql.error.CallError callError2 = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) both).getLeftValue();
                    if (callError2 instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.COMPLETE_PENDING_PAYMENT_TRANSFER_ERROR_NETWORK, com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.toLoggingAttributes(callError2), null, 4, null);
                        unknown = com.paypal.oslo.feature.p2p.domain.error.ClaimMoneyError.Network.INSTANCE;
                    } else {
                        if (!(callError2 instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.COMPLETE_PENDING_PAYMENT_TRANSFER_ERROR_GRAPHQL, com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.toLoggingAttributes(callError2), null, 4, null);
                        unknown = new com.paypal.oslo.feature.p2p.domain.error.ClaimMoneyError.Unknown(((com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9583getHeadimpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError2).m11659getErrors1X0FAY())).getMessage());
                    }
                    both = new arrow.core.Ior.Both(unknown, ((arrow.core.Ior.Both) both).getRightValue());
                }
                data = (com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise2.bind(both)).getData();
                if (data != null || (completePendingPaymentTransfer = data.getCompletePendingPaymentTransfer()) == null || (onPaymentTransfer = completePendingPaymentTransfer.getOnPaymentTransfer()) == null) {
                    iorRaise.raise(com.paypal.oslo.feature.p2p.domain.error.ClaimMoneyError.DataNotFound.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyTransfer map = this.getHighSpeedVideoFpsRanges.map(onPaymentTransfer);
                defaultRaise2.complete();
                arrow.core.EmptyValue emptyValue3 = arrow.core.EmptyValue.INSTANCE;
                java.lang.Object obj3 = atomicReference2.get();
                return obj3 == arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(map) : new arrow.core.Ior.Both(obj3, map);
            }
        }
        claimMoneyRepositoryImpl$completePendingPaymentTransfer$1 = new com.paypal.oslo.feature.p2p.data.repository.ClaimMoneyRepositoryImpl$completePendingPaymentTransfer$1(this, continuation);
        java.lang.Object obj22 = claimMoneyRepositoryImpl$completePendingPaymentTransfer$1.getOutputStallDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = claimMoneyRepositoryImpl$completePendingPaymentTransfer$1.getOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj22;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        data = (com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise2.bind(both)).getData();
        if (data != null) {
        }
        iorRaise.raise(com.paypal.oslo.feature.p2p.domain.error.ClaimMoneyError.DataNotFound.INSTANCE);
        throw new kotlin.KotlinNothingValueException();
    }

    /* renamed from: $r8$lambda$83lVmLiBB-y3_Rk7qBAkfSejHLE, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.error.ClaimMoneyError m17174$r8$lambda$83lVmLiBBy3_Rk7qBAkfSejHLE(com.paypal.oslo.feature.p2p.domain.error.ClaimMoneyError claimMoneyError, com.paypal.oslo.feature.p2p.domain.error.ClaimMoneyError claimMoneyError2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(claimMoneyError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(claimMoneyError2, "");
        return claimMoneyError;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.error.ClaimMoneyError $r8$lambda$XdEVZv_5eqQi14JjXVHLclij2mU(com.paypal.oslo.feature.p2p.domain.error.ClaimMoneyError claimMoneyError, com.paypal.oslo.feature.p2p.domain.error.ClaimMoneyError claimMoneyError2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(claimMoneyError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(claimMoneyError2, "");
        return claimMoneyError;
    }
}
