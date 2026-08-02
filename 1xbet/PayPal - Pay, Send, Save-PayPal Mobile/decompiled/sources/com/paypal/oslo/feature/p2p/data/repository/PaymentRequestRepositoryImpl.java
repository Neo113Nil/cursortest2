package com.paypal.oslo.feature.p2p.data.repository;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ,\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00150\u000f2\u0006\u0010\u0014\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/data/repository/PaymentRequestRepositoryImpl;", "Lcom/paypal/oslo/feature/p2p/domain/repository/PaymentRequestRepository;", "Ljavax/inject/Provider;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/p2p/data/mapper/GetPaymentRequestMapper;", "getPaymentRequestMapper", "Lcom/paypal/oslo/feature/p2p/data/mapper/StartPaymentTransferAttemptForSubflowMapper;", "subflowMapper", "<init>", "(Ljavax/inject/Provider;Lcom/paypal/oslo/feature/p2p/data/mapper/GetPaymentRequestMapper;Lcom/paypal/oslo/feature/p2p/data/mapper/StartPaymentTransferAttemptForSubflowMapper;)V", "", "id", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentRequestIdType;", "type", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/p2p/domain/error/PaymentTransferError;", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentRequest;", "getPaymentRequest", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/PaymentRequestIdType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestId", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferAttempt;", "startPaymentTransferAttemptForSubflow", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Ljavax/inject/Provider;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/p2p/data/mapper/GetPaymentRequestMapper;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/p2p/data/mapper/StartPaymentTransferAttemptForSubflowMapper;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentRequestRepositoryImpl implements com.paypal.oslo.feature.p2p.domain.repository.PaymentRequestRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.data.mapper.GetPaymentRequestMapper getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.data.mapper.StartPaymentTransferAttemptForSubflowMapper Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final javax.inject.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public PaymentRequestRepositoryImpl(javax.inject.Provider<com.apollographql.apollo.ApolloClient> provider, com.paypal.oslo.feature.p2p.data.mapper.GetPaymentRequestMapper getPaymentRequestMapper, com.paypal.oslo.feature.p2p.data.mapper.StartPaymentTransferAttemptForSubflowMapper startPaymentTransferAttemptForSubflowMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPaymentRequestMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startPaymentTransferAttemptForSubflowMapper, "");
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = getPaymentRequestMapper;
        this.Camera2StreamConfigurationMap = startPaymentTransferAttemptForSubflowMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00cf A[Catch: all -> 0x004b, RaiseCancellationException -> 0x004e, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x004e, all -> 0x004b, blocks: (B:11:0x0046, B:12:0x00c9, B:15:0x00cf, B:16:0x0126, B:18:0x0138, B:20:0x013e, B:23:0x014f, B:24:0x0164, B:29:0x00f8, B:30:0x0120, B:31:0x0125), top: B:10:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.p2p.domain.repository.PaymentRequestRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getPaymentRequest(java.lang.String str, com.paypal.oslo.feature.p2p.domain.model.PaymentRequestIdType paymentRequestIdType, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.p2p.domain.error.PaymentTransferError, com.paypal.oslo.feature.p2p.domain.model.PaymentRequest>> continuation) {
        com.paypal.oslo.feature.p2p.data.repository.PaymentRequestRepositoryImpl$getPaymentRequest$1 paymentRequestRepositoryImpl$getPaymentRequest$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        com.paypal.oslo.api.graphql.schema.type.PaymentRequestAlternativeIdentifierType paymentRequestAlternativeIdentifierType;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        arrow.core.raise.Raise raise2;
        arrow.core.Ior.Both both;
        com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Data data;
        com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.PaymentRequest paymentRequest;
        if (continuation instanceof com.paypal.oslo.feature.p2p.data.repository.PaymentRequestRepositoryImpl$getPaymentRequest$1) {
            paymentRequestRepositoryImpl$getPaymentRequest$1 = (com.paypal.oslo.feature.p2p.data.repository.PaymentRequestRepositoryImpl$getPaymentRequest$1) continuation;
            if ((paymentRequestRepositoryImpl$getPaymentRequest$1.getOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                paymentRequestRepositoryImpl$getPaymentRequest$1.getOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = paymentRequestRepositoryImpl$getPaymentRequest$1.getOutputStallDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = paymentRequestRepositoryImpl$getPaymentRequest$1.getOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        int i2 = com.paypal.oslo.feature.p2p.data.repository.PaymentRequestRepositoryImpl.WhenMappings.$EnumSwitchMapping$0[paymentRequestIdType.ordinal()];
                        if (i2 == 1) {
                            paymentRequestAlternativeIdentifierType = com.paypal.oslo.api.graphql.schema.type.PaymentRequestAlternativeIdentifierType.PAYMENT_CODE;
                        } else {
                            if (i2 != 2) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            paymentRequestAlternativeIdentifierType = com.paypal.oslo.api.graphql.schema.type.PaymentRequestAlternativeIdentifierType.PAYMENT_REQUEST_ID;
                        }
                        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoFpsRanges.get();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                        com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery getPaymentRequestQuery = new com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery(new com.paypal.oslo.api.graphql.schema.type.PaymentRequestInput(str, paymentRequestAlternativeIdentifierType));
                        com.paypal.oslo.core.network.graphql.RiskSourceId getPaymentRequest = com.paypal.oslo.core.network.graphql.RiskSourceId.P2P.INSTANCE.getGetPaymentRequest();
                        paymentRequestRepositoryImpl$getPaymentRequest$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        paymentRequestRepositoryImpl$getPaymentRequest$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentRequestIdType);
                        paymentRequestRepositoryImpl$getPaymentRequest$1.getOutputFormats = defaultRaise;
                        paymentRequestRepositoryImpl$getPaymentRequest$1.getOutputMinFrameDuration = defaultRaise3;
                        paymentRequestRepositoryImpl$getPaymentRequest$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentRequestAlternativeIdentifierType);
                        paymentRequestRepositoryImpl$getPaymentRequest$1.getHighSpeedVideoSizesFor = defaultRaise3;
                        paymentRequestRepositoryImpl$getPaymentRequest$1.getHighSpeedVideoSizes = 0;
                        paymentRequestRepositoryImpl$getPaymentRequest$1.getHighSpeedVideoFpsRangesFor = 0;
                        paymentRequestRepositoryImpl$getPaymentRequest$1.Camera2StreamConfigurationMap = 0;
                        paymentRequestRepositoryImpl$getPaymentRequest$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        paymentRequestRepositoryImpl$getPaymentRequest$1.getOutputSizeshNQ4ISI = 1;
                        java.lang.Object executeQuery = com.paypal.oslo.feature.p2p.data.ApolloClientExtensionsKt.executeQuery(apolloClient, getPaymentRequestQuery, getPaymentRequest, paymentRequestRepositoryImpl$getPaymentRequest$1);
                        if (executeQuery == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
                        raise = defaultRaise3;
                        obj = executeQuery;
                        raise2 = raise;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = paymentRequestRepositoryImpl$getPaymentRequest$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i4 = paymentRequestRepositoryImpl$getPaymentRequest$1.Camera2StreamConfigurationMap;
                    int i5 = paymentRequestRepositoryImpl$getPaymentRequest$1.getHighSpeedVideoFpsRangesFor;
                    int i6 = paymentRequestRepositoryImpl$getPaymentRequest$1.getHighSpeedVideoSizes;
                    raise2 = (arrow.core.raise.Raise) paymentRequestRepositoryImpl$getPaymentRequest$1.getHighSpeedVideoSizesFor;
                    raise = (arrow.core.raise.Raise) paymentRequestRepositoryImpl$getPaymentRequest$1.getOutputMinFrameDuration;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) paymentRequestRepositoryImpl$getPaymentRequest$1.getOutputFormats;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                both = (arrow.core.Ior) obj;
                if (!(both instanceof arrow.core.Ior.Left)) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.GET_PAYMENT_REQUEST_ERROR_NETWORK, com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.toLoggingAttributes((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue()), null, 4, null);
                    both = new arrow.core.Ior.Left(com.paypal.oslo.feature.p2p.domain.error.PaymentTransferError.Network.INSTANCE);
                } else if (!(both instanceof arrow.core.Ior.Right)) {
                    if (!(both instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.GET_PAYMENT_REQUEST_ERROR_NETWORK, com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.toLoggingAttributes((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) both).getLeftValue()), null, 4, null);
                    both = new arrow.core.Ior.Both(com.paypal.oslo.feature.p2p.domain.error.PaymentTransferError.Network.INSTANCE, ((arrow.core.Ior.Both) both).getRightValue());
                }
                data = (com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) raise2.bind(both.toEither())).getData();
                if (data == null && (paymentRequest = data.getPaymentRequest()) != null) {
                    com.paypal.oslo.feature.p2p.domain.model.PaymentRequest map = this.getHighResolutionOutputSizeshNQ4ISI.map(paymentRequest);
                    defaultRaise2.complete();
                    return new arrow.core.Either.Right(map);
                }
                com.paypal.oslo.feature.p2p.domain.error.PaymentTransferError.DataNotFound dataNotFound = com.paypal.oslo.feature.p2p.domain.error.PaymentTransferError.DataNotFound.INSTANCE;
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.GET_PAYMENT_REQUEST_ERROR_DATA_NOT_FOUND, null, null, 6, null);
                raise.raise(dataNotFound);
                throw new kotlin.KotlinNothingValueException();
            }
        }
        paymentRequestRepositoryImpl$getPaymentRequest$1 = new com.paypal.oslo.feature.p2p.data.repository.PaymentRequestRepositoryImpl$getPaymentRequest$1(this, continuation);
        java.lang.Object obj2 = paymentRequestRepositoryImpl$getPaymentRequest$1.getOutputStallDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = paymentRequestRepositoryImpl$getPaymentRequest$1.getOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj2;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        data = (com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) raise2.bind(both.toEither())).getData();
        if (data == null) {
        }
        com.paypal.oslo.feature.p2p.domain.error.PaymentTransferError.DataNotFound dataNotFound2 = com.paypal.oslo.feature.p2p.domain.error.PaymentTransferError.DataNotFound.INSTANCE;
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.GET_PAYMENT_REQUEST_ERROR_DATA_NOT_FOUND, null, null, 6, null);
        raise.raise(dataNotFound2);
        throw new kotlin.KotlinNothingValueException();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a6 A[Catch: all -> 0x0148, RaiseCancellationException -> 0x0151, TRY_ENTER, TRY_LEAVE, TryCatch #2 {RaiseCancellationException -> 0x0151, all -> 0x0148, blocks: (B:11:0x0042, B:12:0x00a0, B:15:0x00a6, B:16:0x00fd, B:18:0x010f, B:20:0x0115, B:22:0x011b, B:25:0x0132, B:26:0x0147, B:31:0x00cf, B:32:0x00f7, B:33:0x00fc, B:37:0x0057), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r2v0, types: [arrow.core.raise.DefaultRaise, int] */
    @Override // com.paypal.oslo.feature.p2p.domain.repository.PaymentRequestRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object startPaymentTransferAttemptForSubflow(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.p2p.domain.error.PaymentTransferError, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt>> continuation) {
        com.paypal.oslo.feature.p2p.data.repository.PaymentRequestRepositoryImpl$startPaymentTransferAttemptForSubflow$1 paymentRequestRepositoryImpl$startPaymentTransferAttemptForSubflow$1;
        ?? r2;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.Raise raise;
        arrow.core.raise.Raise raise2;
        arrow.core.Ior.Both both;
        com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Data data;
        com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.StartPaymentTransferAttemptForSubflow startPaymentTransferAttemptForSubflow;
        com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.PaymentTransferAttempt paymentTransferAttempt;
        try {
            if (continuation instanceof com.paypal.oslo.feature.p2p.data.repository.PaymentRequestRepositoryImpl$startPaymentTransferAttemptForSubflow$1) {
                paymentRequestRepositoryImpl$startPaymentTransferAttemptForSubflow$1 = (com.paypal.oslo.feature.p2p.data.repository.PaymentRequestRepositoryImpl$startPaymentTransferAttemptForSubflow$1) continuation;
                if ((paymentRequestRepositoryImpl$startPaymentTransferAttemptForSubflow$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    paymentRequestRepositoryImpl$startPaymentTransferAttemptForSubflow$1.getInputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = paymentRequestRepositoryImpl$startPaymentTransferAttemptForSubflow$1.getOutputMinFrameDurationlomOqCM;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r2 = paymentRequestRepositoryImpl$startPaymentTransferAttemptForSubflow$1.getInputSizeshNQ4ISI;
                    if (r2 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                        com.paypal.oslo.api.graphql.schema.type.StartPaymentTransferAttemptForSubflowInput startPaymentTransferAttemptForSubflowInput = new com.paypal.oslo.api.graphql.schema.type.StartPaymentTransferAttemptForSubflowInput(com.paypal.oslo.api.graphql.schema.type.PaymentSubflow.PAY_REQUEST, str);
                        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoFpsRanges.get();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                        com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation startPaymentTransferAttemptForSubflowMutation = new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation(startPaymentTransferAttemptForSubflowInput);
                        com.paypal.oslo.core.network.graphql.RiskSourceId startPaymentTransferAttemptForSubflow2 = com.paypal.oslo.core.network.graphql.RiskSourceId.P2P.INSTANCE.getStartPaymentTransferAttemptForSubflow();
                        paymentRequestRepositoryImpl$startPaymentTransferAttemptForSubflow$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        paymentRequestRepositoryImpl$startPaymentTransferAttemptForSubflow$1.getOutputFormats = defaultRaise;
                        paymentRequestRepositoryImpl$startPaymentTransferAttemptForSubflow$1.getHighSpeedVideoSizesFor = defaultRaise2;
                        paymentRequestRepositoryImpl$startPaymentTransferAttemptForSubflow$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(startPaymentTransferAttemptForSubflowInput);
                        paymentRequestRepositoryImpl$startPaymentTransferAttemptForSubflow$1.getOutputMinFrameDuration = defaultRaise2;
                        paymentRequestRepositoryImpl$startPaymentTransferAttemptForSubflow$1.Camera2StreamConfigurationMap = 0;
                        paymentRequestRepositoryImpl$startPaymentTransferAttemptForSubflow$1.getHighSpeedVideoFpsRanges = 0;
                        paymentRequestRepositoryImpl$startPaymentTransferAttemptForSubflow$1.getHighSpeedVideoFpsRangesFor = 0;
                        paymentRequestRepositoryImpl$startPaymentTransferAttemptForSubflow$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        paymentRequestRepositoryImpl$startPaymentTransferAttemptForSubflow$1.getInputSizeshNQ4ISI = 1;
                        obj = com.paypal.oslo.feature.p2p.data.ApolloClientExtensionsKt.executeMutation(apolloClient, startPaymentTransferAttemptForSubflowMutation, startPaymentTransferAttemptForSubflow2, paymentRequestRepositoryImpl$startPaymentTransferAttemptForSubflow$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        raise = defaultRaise2;
                        raise2 = raise;
                    } else {
                        if (r2 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i = paymentRequestRepositoryImpl$startPaymentTransferAttemptForSubflow$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i2 = paymentRequestRepositoryImpl$startPaymentTransferAttemptForSubflow$1.getHighSpeedVideoFpsRangesFor;
                        int i3 = paymentRequestRepositoryImpl$startPaymentTransferAttemptForSubflow$1.getHighSpeedVideoFpsRanges;
                        int i4 = paymentRequestRepositoryImpl$startPaymentTransferAttemptForSubflow$1.Camera2StreamConfigurationMap;
                        raise = (arrow.core.raise.Raise) paymentRequestRepositoryImpl$startPaymentTransferAttemptForSubflow$1.getOutputMinFrameDuration;
                        raise2 = (arrow.core.raise.Raise) paymentRequestRepositoryImpl$startPaymentTransferAttemptForSubflow$1.getHighSpeedVideoSizesFor;
                        defaultRaise = (arrow.core.raise.DefaultRaise) paymentRequestRepositoryImpl$startPaymentTransferAttemptForSubflow$1.getOutputFormats;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    both = (arrow.core.Ior) obj;
                    if (!(both instanceof arrow.core.Ior.Left)) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.START_PAYMENT_TRANSFER_SUBFLOW_ERROR_NETWORK, com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.toLoggingAttributes((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue()), null, 4, null);
                        both = new arrow.core.Ior.Left(com.paypal.oslo.feature.p2p.domain.error.PaymentTransferError.Network.INSTANCE);
                    } else if (!(both instanceof arrow.core.Ior.Right)) {
                        if (!(both instanceof arrow.core.Ior.Both)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.START_PAYMENT_TRANSFER_SUBFLOW_ERROR_NETWORK, com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.toLoggingAttributes((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) both).getLeftValue()), null, 4, null);
                        both = new arrow.core.Ior.Both(com.paypal.oslo.feature.p2p.domain.error.PaymentTransferError.Network.INSTANCE, ((arrow.core.Ior.Both) both).getRightValue());
                    }
                    data = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) raise.bind(both.toEither())).getData();
                    if (data == null && (startPaymentTransferAttemptForSubflow = data.getStartPaymentTransferAttemptForSubflow()) != null && (paymentTransferAttempt = startPaymentTransferAttemptForSubflow.getPaymentTransferAttempt()) != null) {
                        com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt paymentTransferAttempt2 = (com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt) raise2.bind(this.Camera2StreamConfigurationMap.map(paymentTransferAttempt));
                        defaultRaise.complete();
                        return new arrow.core.Either.Right(paymentTransferAttempt2);
                    }
                    com.paypal.oslo.feature.p2p.domain.error.PaymentTransferError.DataNotFound dataNotFound = com.paypal.oslo.feature.p2p.domain.error.PaymentTransferError.DataNotFound.INSTANCE;
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.START_PAYMENT_TRANSFER_SUBFLOW_ERROR_DATA_NOT_FOUND, null, null, 6, null);
                    raise2.raise(dataNotFound);
                    throw new kotlin.KotlinNothingValueException();
                }
            }
            if (r2 != 0) {
            }
            both = (arrow.core.Ior) obj;
            if (!(both instanceof arrow.core.Ior.Left)) {
            }
            data = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) raise.bind(both.toEither())).getData();
            if (data == null) {
            }
            com.paypal.oslo.feature.p2p.domain.error.PaymentTransferError.DataNotFound dataNotFound2 = com.paypal.oslo.feature.p2p.domain.error.PaymentTransferError.DataNotFound.INSTANCE;
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.START_PAYMENT_TRANSFER_SUBFLOW_ERROR_DATA_NOT_FOUND, null, null, 6, null);
            raise2.raise(dataNotFound2);
            throw new kotlin.KotlinNothingValueException();
        } catch (arrow.core.raise.RaiseCancellationException e) {
            r2.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, r2));
        } catch (java.lang.Throwable th) {
            r2.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
        paymentRequestRepositoryImpl$startPaymentTransferAttemptForSubflow$1 = new com.paypal.oslo.feature.p2p.data.repository.PaymentRequestRepositoryImpl$startPaymentTransferAttemptForSubflow$1(this, continuation);
        java.lang.Object obj2 = paymentRequestRepositoryImpl$startPaymentTransferAttemptForSubflow$1.getOutputMinFrameDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = paymentRequestRepositoryImpl$startPaymentTransferAttemptForSubflow$1.getInputSizeshNQ4ISI;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.p2p.domain.model.PaymentRequestIdType.values().length];
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.PaymentRequestIdType.PAYMENT_CODE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.PaymentRequestIdType.PAYMENT_REQUEST_ID.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
