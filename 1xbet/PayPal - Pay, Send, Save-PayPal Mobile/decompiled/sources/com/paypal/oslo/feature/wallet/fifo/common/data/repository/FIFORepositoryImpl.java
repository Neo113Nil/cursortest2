package com.paypal.oslo.feature.wallet.fifo.common.data.repository;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/common/data/repository/FIFORepositoryImpl;", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/repository/FIFORepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/GetEligibilityInput;", "input", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/GetEligibilityError;", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/GetEligibilityResult;", "getAddWithdrawEligibility", "(Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/GetEligibilityInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/GetAccountBalancesError;", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/AccountBalancesResult;", "getAccountBalances", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FIFORepositoryImpl implements com.paypal.oslo.feature.wallet.fifo.common.domain.repository.FIFORepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoSizes;

    @javax.inject.Inject
    public FIFORepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoSizes = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0116 A[Catch: all -> 0x0060, RaiseCancellationException -> 0x0063, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x0063, all -> 0x0060, blocks: (B:11:0x005b, B:12:0x0110, B:15:0x0116, B:16:0x0155, B:19:0x0168, B:21:0x017d, B:24:0x0188, B:26:0x01aa, B:28:0x01b0, B:30:0x01f8, B:33:0x0200, B:35:0x0208, B:36:0x0212, B:44:0x0133, B:45:0x014f, B:46:0x0154), top: B:10:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x017d A[Catch: all -> 0x0060, RaiseCancellationException -> 0x0063, TryCatch #4 {RaiseCancellationException -> 0x0063, all -> 0x0060, blocks: (B:11:0x005b, B:12:0x0110, B:15:0x0116, B:16:0x0155, B:19:0x0168, B:21:0x017d, B:24:0x0188, B:26:0x01aa, B:28:0x01b0, B:30:0x01f8, B:33:0x0200, B:35:0x0208, B:36:0x0212, B:44:0x0133, B:45:0x014f, B:46:0x0154), top: B:10:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01aa A[Catch: all -> 0x0060, RaiseCancellationException -> 0x0063, TryCatch #4 {RaiseCancellationException -> 0x0063, all -> 0x0060, blocks: (B:11:0x005b, B:12:0x0110, B:15:0x0116, B:16:0x0155, B:19:0x0168, B:21:0x017d, B:24:0x0188, B:26:0x01aa, B:28:0x01b0, B:30:0x01f8, B:33:0x0200, B:35:0x0208, B:36:0x0212, B:44:0x0133, B:45:0x014f, B:46:0x0154), top: B:10:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01b0 A[Catch: all -> 0x0060, RaiseCancellationException -> 0x0063, TryCatch #4 {RaiseCancellationException -> 0x0063, all -> 0x0060, blocks: (B:11:0x005b, B:12:0x0110, B:15:0x0116, B:16:0x0155, B:19:0x0168, B:21:0x017d, B:24:0x0188, B:26:0x01aa, B:28:0x01b0, B:30:0x01f8, B:33:0x0200, B:35:0x0208, B:36:0x0212, B:44:0x0133, B:45:0x014f, B:46:0x0154), top: B:10:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0208 A[Catch: all -> 0x0060, RaiseCancellationException -> 0x0063, TryCatch #4 {RaiseCancellationException -> 0x0063, all -> 0x0060, blocks: (B:11:0x005b, B:12:0x0110, B:15:0x0116, B:16:0x0155, B:19:0x0168, B:21:0x017d, B:24:0x0188, B:26:0x01aa, B:28:0x01b0, B:30:0x01f8, B:33:0x0200, B:35:0x0208, B:36:0x0212, B:44:0x0133, B:45:0x014f, B:46:0x0154), top: B:10:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // com.paypal.oslo.feature.wallet.fifo.common.domain.repository.FIFORepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getAddWithdrawEligibility(com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityInput getEligibilityInput, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityError, com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityResult>> continuation) {
        com.paypal.oslo.feature.wallet.fifo.common.data.repository.FIFORepositoryImpl$getAddWithdrawEligibility$1 fIFORepositoryImpl$getAddWithdrawEligibility$1;
        int i;
        kotlin.jvm.functions.Function2 function2;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        arrow.core.raise.DefaultRaise defaultRaise;
        java.util.concurrent.atomic.AtomicReference atomicReference2;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.IorRaise iorRaise;
        arrow.core.raise.IorRaise iorRaise2;
        java.lang.Object obj;
        arrow.core.Ior.Both both;
        com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.TransferCapabilitiesEvaluation transferCapabilitiesEvaluation;
        if (continuation instanceof com.paypal.oslo.feature.wallet.fifo.common.data.repository.FIFORepositoryImpl$getAddWithdrawEligibility$1) {
            fIFORepositoryImpl$getAddWithdrawEligibility$1 = (com.paypal.oslo.feature.wallet.fifo.common.data.repository.FIFORepositoryImpl$getAddWithdrawEligibility$1) continuation;
            if ((fIFORepositoryImpl$getAddWithdrawEligibility$1.getOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                fIFORepositoryImpl$getAddWithdrawEligibility$1.getOutputSizeshNQ4ISI -= 2147483648;
                com.paypal.oslo.feature.wallet.fifo.common.data.repository.FIFORepositoryImpl$getAddWithdrawEligibility$1 fIFORepositoryImpl$getAddWithdrawEligibility$12 = fIFORepositoryImpl$getAddWithdrawEligibility$1;
                java.lang.Object obj2 = fIFORepositoryImpl$getAddWithdrawEligibility$12.unwrapAs;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fIFORepositoryImpl$getAddWithdrawEligibility$12.getOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.common.data.repository.FIFORepositoryImpl$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                            return com.paypal.oslo.feature.wallet.fifo.common.data.repository.FIFORepositoryImpl.$r8$lambda$BojzlLaHMUcyCvFMViNdpOIsiv8((com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityError) obj3, (com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityError) obj4);
                        }
                    };
                    atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        arrow.core.raise.IorRaise iorRaise3 = new arrow.core.raise.IorRaise(function2, atomicReference, defaultRaise3);
                        com.paypal.oslo.api.graphql.schema.type.TransferCapabilitiesEvaluationInput transferCapabilitiesEvaluationInput = com.paypal.oslo.feature.wallet.fifo.common.data.repository.TransferCapabilitiesMapperKt.toTransferCapabilitiesEvaluationInput(getEligibilityInput);
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Fetching balance add/withdraw eligibility", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("productFlow", transferCapabilitiesEvaluationInput.getProductFlow().getIdentifier()), kotlin.TuplesKt.to("transferChannel", transferCapabilitiesEvaluationInput.getProductFlow().getChannel())), null, 4, null);
                        com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery getTransferCapabilitiesEvaluationQuery = new com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery(transferCapabilitiesEvaluationInput);
                        fIFORepositoryImpl$getAddWithdrawEligibility$12.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getEligibilityInput);
                        fIFORepositoryImpl$getAddWithdrawEligibility$12.getHighSpeedVideoSizesFor = function2;
                        fIFORepositoryImpl$getAddWithdrawEligibility$12.getOutputFormats = atomicReference;
                        fIFORepositoryImpl$getAddWithdrawEligibility$12.getOutputMinFrameDuration = defaultRaise;
                        fIFORepositoryImpl$getAddWithdrawEligibility$12.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        fIFORepositoryImpl$getAddWithdrawEligibility$12.getOutputStallDuration = iorRaise3;
                        fIFORepositoryImpl$getAddWithdrawEligibility$12.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(transferCapabilitiesEvaluationInput);
                        fIFORepositoryImpl$getAddWithdrawEligibility$12.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getTransferCapabilitiesEvaluationQuery);
                        fIFORepositoryImpl$getAddWithdrawEligibility$12.getOutputStallDurationlomOqCM = iorRaise3;
                        fIFORepositoryImpl$getAddWithdrawEligibility$12.getHighResolutionOutputSizeshNQ4ISI = 0;
                        fIFORepositoryImpl$getAddWithdrawEligibility$12.Camera2StreamConfigurationMap = 0;
                        fIFORepositoryImpl$getAddWithdrawEligibility$12.getHighSpeedVideoFpsRangesFor = 0;
                        fIFORepositoryImpl$getAddWithdrawEligibility$12.getHighSpeedVideoFpsRanges = 0;
                        fIFORepositoryImpl$getAddWithdrawEligibility$12.getHighSpeedVideoSizes = 0;
                        fIFORepositoryImpl$getAddWithdrawEligibility$12.getOutputSizeshNQ4ISI = 1;
                        obj2 = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.getHighSpeedVideoSizes, getTransferCapabilitiesEvaluationQuery, (com.paypal.oslo.core.network.graphql.CallConfig) null, fIFORepositoryImpl$getAddWithdrawEligibility$12, 2, (java.lang.Object) null);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        atomicReference2 = atomicReference;
                        defaultRaise2 = defaultRaise;
                        iorRaise = iorRaise3;
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
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = fIFORepositoryImpl$getAddWithdrawEligibility$12.getHighSpeedVideoSizes;
                    int i3 = fIFORepositoryImpl$getAddWithdrawEligibility$12.getHighSpeedVideoFpsRanges;
                    int i4 = fIFORepositoryImpl$getAddWithdrawEligibility$12.getHighSpeedVideoFpsRangesFor;
                    int i5 = fIFORepositoryImpl$getAddWithdrawEligibility$12.Camera2StreamConfigurationMap;
                    int i6 = fIFORepositoryImpl$getAddWithdrawEligibility$12.getHighResolutionOutputSizeshNQ4ISI;
                    iorRaise = (arrow.core.raise.IorRaise) fIFORepositoryImpl$getAddWithdrawEligibility$12.getOutputStallDurationlomOqCM;
                    iorRaise2 = (arrow.core.raise.IorRaise) fIFORepositoryImpl$getAddWithdrawEligibility$12.getOutputStallDuration;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) fIFORepositoryImpl$getAddWithdrawEligibility$12.getOutputMinFrameDuration;
                    atomicReference2 = (java.util.concurrent.atomic.AtomicReference) fIFORepositoryImpl$getAddWithdrawEligibility$12.getOutputFormats;
                    kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) fIFORepositoryImpl$getAddWithdrawEligibility$12.getHighSpeedVideoSizesFor;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj2);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise2;
                        atomicReference = atomicReference2;
                        function2 = function22;
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
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                both = (arrow.core.Ior) obj2;
                if (!(both instanceof arrow.core.Ior.Left)) {
                    both = new arrow.core.Ior.Left(com.paypal.oslo.feature.wallet.fifo.common.data.repository.TransferCapabilitiesMapperKt.toGetEligibilityError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue()));
                } else if (!(both instanceof arrow.core.Ior.Right)) {
                    if (!(both instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    both = new arrow.core.Ior.Both(com.paypal.oslo.feature.wallet.fifo.common.data.repository.TransferCapabilitiesMapperKt.toGetEligibilityError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) both).getLeftValue()), ((arrow.core.Ior.Both) both).getRightValue());
                }
                com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both);
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.wallet.LoggerKt.log;
                kotlin.Pair[] pairArr = new kotlin.Pair[2];
                pairArr[0] = kotlin.TuplesKt.to("hasData", java.lang.String.valueOf(graphQLData.getData() == null));
                com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.Data data = (com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.Data) graphQLData.getData();
                pairArr[1] = kotlin.TuplesKt.to("hasResult", java.lang.String.valueOf((data == null ? data.getTransferCapabilitiesEvaluation() : null) == null));
                com.paypal.android.logger.Logger.d$default(logger, "Raw GraphQL response received", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.Data data2 = (com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.Data) graphQLData.getData();
                transferCapabilitiesEvaluation = data2 != null ? data2.getTransferCapabilitiesEvaluation() : null;
                if (transferCapabilitiesEvaluation != null) {
                    iorRaise2.raise(com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityError.Business.MissingData.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.oslo.feature.wallet.fifo.common.domain.model.BalanceAddWithdrawEligibility balanceAddWithdrawEligibility = com.paypal.oslo.feature.wallet.fifo.common.data.repository.TransferCapabilitiesMapperKt.toBalanceAddWithdrawEligibility(transferCapabilitiesEvaluation);
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Successfully fetched eligibility", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("balanceAddEligibility", java.lang.String.valueOf(balanceAddWithdrawEligibility.getBalanceAddEligibility())), kotlin.TuplesKt.to("balanceWithdrawalEligibility", java.lang.String.valueOf(balanceAddWithdrawEligibility.getBalanceWithdrawalEligibility()))), null, 4, null);
                com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityResult getEligibilityResult = new com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityResult(balanceAddWithdrawEligibility);
                defaultRaise2.complete();
                arrow.core.EmptyValue emptyValue3 = arrow.core.EmptyValue.INSTANCE;
                java.lang.Object obj3 = atomicReference2.get();
                return obj3 == arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(getEligibilityResult) : new arrow.core.Ior.Both(obj3, getEligibilityResult);
            }
        }
        fIFORepositoryImpl$getAddWithdrawEligibility$1 = new com.paypal.oslo.feature.wallet.fifo.common.data.repository.FIFORepositoryImpl$getAddWithdrawEligibility$1(this, continuation);
        com.paypal.oslo.feature.wallet.fifo.common.data.repository.FIFORepositoryImpl$getAddWithdrawEligibility$1 fIFORepositoryImpl$getAddWithdrawEligibility$122 = fIFORepositoryImpl$getAddWithdrawEligibility$1;
        java.lang.Object obj22 = fIFORepositoryImpl$getAddWithdrawEligibility$122.unwrapAs;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fIFORepositoryImpl$getAddWithdrawEligibility$122.getOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj22;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both);
        com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.wallet.LoggerKt.log;
        kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
        pairArr2[0] = kotlin.TuplesKt.to("hasData", java.lang.String.valueOf(graphQLData2.getData() == null));
        com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.Data data3 = (com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.Data) graphQLData2.getData();
        pairArr2[1] = kotlin.TuplesKt.to("hasResult", java.lang.String.valueOf((data3 == null ? data3.getTransferCapabilitiesEvaluation() : null) == null));
        com.paypal.android.logger.Logger.d$default(logger2, "Raw GraphQL response received", kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
        com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.Data data22 = (com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.Data) graphQLData2.getData();
        if (data22 != null) {
        }
        if (transferCapabilitiesEvaluation != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d4 A[Catch: all -> 0x0057, RaiseCancellationException -> 0x005a, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x005a, all -> 0x0057, blocks: (B:11:0x0052, B:12:0x00ce, B:15:0x00d4, B:16:0x0113, B:19:0x0127, B:21:0x013b, B:24:0x0146, B:26:0x0167, B:28:0x016d, B:30:0x01b6, B:33:0x01be, B:35:0x01c6, B:36:0x01d0, B:44:0x00f1, B:45:0x010d, B:46:0x0112), top: B:10:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x013b A[Catch: all -> 0x0057, RaiseCancellationException -> 0x005a, TryCatch #3 {RaiseCancellationException -> 0x005a, all -> 0x0057, blocks: (B:11:0x0052, B:12:0x00ce, B:15:0x00d4, B:16:0x0113, B:19:0x0127, B:21:0x013b, B:24:0x0146, B:26:0x0167, B:28:0x016d, B:30:0x01b6, B:33:0x01be, B:35:0x01c6, B:36:0x01d0, B:44:0x00f1, B:45:0x010d, B:46:0x0112), top: B:10:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.paypal.oslo.feature.wallet.fifo.common.domain.repository.FIFORepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getAccountBalances(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetAccountBalancesError, com.paypal.oslo.feature.wallet.fifo.common.domain.model.AccountBalancesResult>> continuation) {
        com.paypal.oslo.feature.wallet.fifo.common.data.repository.FIFORepositoryImpl$getAccountBalances$1 fIFORepositoryImpl$getAccountBalances$1;
        int i;
        kotlin.jvm.functions.Function2 function2;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        arrow.core.raise.DefaultRaise defaultRaise;
        java.util.concurrent.atomic.AtomicReference atomicReference2;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.IorRaise iorRaise;
        arrow.core.raise.IorRaise iorRaise2;
        java.lang.Object obj;
        arrow.core.Ior.Both both;
        com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Data data;
        com.paypal.oslo.feature.wallet.fifo.common.domain.model.AccountBalancesResult accountBalances;
        if (continuation instanceof com.paypal.oslo.feature.wallet.fifo.common.data.repository.FIFORepositoryImpl$getAccountBalances$1) {
            fIFORepositoryImpl$getAccountBalances$1 = (com.paypal.oslo.feature.wallet.fifo.common.data.repository.FIFORepositoryImpl$getAccountBalances$1) continuation;
            if ((fIFORepositoryImpl$getAccountBalances$1.getOutputStallDuration & Integer.MIN_VALUE) != 0) {
                fIFORepositoryImpl$getAccountBalances$1.getOutputStallDuration -= 2147483648;
                com.paypal.oslo.feature.wallet.fifo.common.data.repository.FIFORepositoryImpl$getAccountBalances$1 fIFORepositoryImpl$getAccountBalances$12 = fIFORepositoryImpl$getAccountBalances$1;
                java.lang.Object obj2 = fIFORepositoryImpl$getAccountBalances$12.getOutputSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fIFORepositoryImpl$getAccountBalances$12.getOutputStallDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.common.data.repository.FIFORepositoryImpl$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                            return com.paypal.oslo.feature.wallet.fifo.common.data.repository.FIFORepositoryImpl.$r8$lambda$HMaHdwuW6gMB3MK_nlXdirRdISY((com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetAccountBalancesError) obj3, (com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetAccountBalancesError) obj4);
                        }
                    };
                    atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        arrow.core.raise.IorRaise iorRaise3 = new arrow.core.raise.IorRaise(function2, atomicReference, defaultRaise3);
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Fetching account balances", null, null, 6, null);
                        com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery getAccountBalancesQuery = new com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery();
                        fIFORepositoryImpl$getAccountBalances$12.getOutputFormats = function2;
                        fIFORepositoryImpl$getAccountBalances$12.getHighSpeedVideoSizesFor = atomicReference;
                        fIFORepositoryImpl$getAccountBalances$12.getInputFormats = defaultRaise;
                        fIFORepositoryImpl$getAccountBalances$12.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        fIFORepositoryImpl$getAccountBalances$12.getOutputMinFrameDuration = iorRaise3;
                        fIFORepositoryImpl$getAccountBalances$12.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getAccountBalancesQuery);
                        fIFORepositoryImpl$getAccountBalances$12.getOutputSizeshNQ4ISI = iorRaise3;
                        fIFORepositoryImpl$getAccountBalances$12.getHighSpeedVideoFpsRangesFor = 0;
                        fIFORepositoryImpl$getAccountBalances$12.getHighResolutionOutputSizeshNQ4ISI = 0;
                        fIFORepositoryImpl$getAccountBalances$12.getHighSpeedVideoFpsRanges = 0;
                        fIFORepositoryImpl$getAccountBalances$12.getHighSpeedVideoSizes = 0;
                        fIFORepositoryImpl$getAccountBalances$12.Camera2StreamConfigurationMap = 0;
                        fIFORepositoryImpl$getAccountBalances$12.getOutputStallDuration = 1;
                        obj2 = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.getHighSpeedVideoSizes, getAccountBalancesQuery, (com.paypal.oslo.core.network.graphql.CallConfig) null, fIFORepositoryImpl$getAccountBalances$12, 2, (java.lang.Object) null);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        atomicReference2 = atomicReference;
                        defaultRaise2 = defaultRaise;
                        iorRaise = iorRaise3;
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
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = fIFORepositoryImpl$getAccountBalances$12.Camera2StreamConfigurationMap;
                    int i3 = fIFORepositoryImpl$getAccountBalances$12.getHighSpeedVideoSizes;
                    int i4 = fIFORepositoryImpl$getAccountBalances$12.getHighSpeedVideoFpsRanges;
                    int i5 = fIFORepositoryImpl$getAccountBalances$12.getHighResolutionOutputSizeshNQ4ISI;
                    int i6 = fIFORepositoryImpl$getAccountBalances$12.getHighSpeedVideoFpsRangesFor;
                    iorRaise = (arrow.core.raise.IorRaise) fIFORepositoryImpl$getAccountBalances$12.getOutputSizeshNQ4ISI;
                    iorRaise2 = (arrow.core.raise.IorRaise) fIFORepositoryImpl$getAccountBalances$12.getOutputMinFrameDuration;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) fIFORepositoryImpl$getAccountBalances$12.getInputFormats;
                    atomicReference2 = (java.util.concurrent.atomic.AtomicReference) fIFORepositoryImpl$getAccountBalances$12.getHighSpeedVideoSizesFor;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj2);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise2;
                        atomicReference = atomicReference2;
                        function2 = (kotlin.jvm.functions.Function2) fIFORepositoryImpl$getAccountBalances$12.getOutputFormats;
                        defaultRaise.complete();
                        java.lang.Object raisedOrRethrow2 = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                        arrow.core.EmptyValue emptyValue2 = arrow.core.EmptyValue.INSTANCE;
                        obj = atomicReference.get();
                        if (obj != arrow.core.EmptyValue.INSTANCE) {
                        }
                        return new arrow.core.Ior.Left(raisedOrRethrow2);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                both = (arrow.core.Ior) obj2;
                if (!(both instanceof arrow.core.Ior.Left)) {
                    both = new arrow.core.Ior.Left(com.paypal.oslo.feature.wallet.fifo.common.data.repository.AccountBalancesMapperKt.toGetAccountBalancesError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue()));
                } else if (!(both instanceof arrow.core.Ior.Right)) {
                    if (!(both instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    both = new arrow.core.Ior.Both(com.paypal.oslo.feature.wallet.fifo.common.data.repository.AccountBalancesMapperKt.toGetAccountBalancesError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) both).getLeftValue()), ((arrow.core.Ior.Both) both).getRightValue());
                }
                com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both);
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.wallet.LoggerKt.log;
                kotlin.Pair[] pairArr = new kotlin.Pair[2];
                pairArr[0] = kotlin.TuplesKt.to("hasData", java.lang.String.valueOf(graphQLData.getData() == null));
                com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Data data2 = (com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Data) graphQLData.getData();
                pairArr[1] = kotlin.TuplesKt.to("hasBalances", java.lang.String.valueOf((data2 == null ? data2.getBalances() : null) == null));
                com.paypal.android.logger.Logger.d$default(logger, "Raw GraphQL response received", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                data = (com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Data) graphQLData.getData();
                if (data != null || (accountBalances = com.paypal.oslo.feature.wallet.fifo.common.data.repository.AccountBalancesMapperKt.toAccountBalances(data)) == null) {
                    iorRaise2.raise(com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetAccountBalancesError.Business.MissingData.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.wallet.LoggerKt.log;
                kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("currencyCode", accountBalances.getAvailableAmount().getCurrencyCode()), kotlin.TuplesKt.to("currencyCount", java.lang.String.valueOf(accountBalances.getCurrencies().size())));
                kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("availableAmount", accountBalances.getAvailableAmount().getValue()));
                defaultRaise2.complete();
                arrow.core.EmptyValue emptyValue3 = arrow.core.EmptyValue.INSTANCE;
                java.lang.Object obj3 = atomicReference2.get();
                return obj3 == arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(accountBalances) : new arrow.core.Ior.Both(obj3, accountBalances);
            }
        }
        fIFORepositoryImpl$getAccountBalances$1 = new com.paypal.oslo.feature.wallet.fifo.common.data.repository.FIFORepositoryImpl$getAccountBalances$1(this, continuation);
        com.paypal.oslo.feature.wallet.fifo.common.data.repository.FIFORepositoryImpl$getAccountBalances$1 fIFORepositoryImpl$getAccountBalances$122 = fIFORepositoryImpl$getAccountBalances$1;
        java.lang.Object obj22 = fIFORepositoryImpl$getAccountBalances$122.getOutputSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fIFORepositoryImpl$getAccountBalances$122.getOutputStallDuration;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj22;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both);
        com.paypal.android.logger.Logger logger3 = com.paypal.oslo.feature.wallet.LoggerKt.log;
        kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
        pairArr2[0] = kotlin.TuplesKt.to("hasData", java.lang.String.valueOf(graphQLData2.getData() == null));
        com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Data data22 = (com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Data) graphQLData2.getData();
        pairArr2[1] = kotlin.TuplesKt.to("hasBalances", java.lang.String.valueOf((data22 == null ? data22.getBalances() : null) == null));
        com.paypal.android.logger.Logger.d$default(logger3, "Raw GraphQL response received", kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
        data = (com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Data) graphQLData2.getData();
        if (data != null) {
        }
        iorRaise2.raise(com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetAccountBalancesError.Business.MissingData.INSTANCE);
        throw new kotlin.KotlinNothingValueException();
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityError $r8$lambda$BojzlLaHMUcyCvFMViNdpOIsiv8(com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityError getEligibilityError, com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityError getEligibilityError2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getEligibilityError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getEligibilityError2, "");
        return getEligibilityError;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetAccountBalancesError $r8$lambda$HMaHdwuW6gMB3MK_nlXdirRdISY(com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetAccountBalancesError getAccountBalancesError, com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetAccountBalancesError getAccountBalancesError2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAccountBalancesError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAccountBalancesError2, "");
        return getAccountBalancesError;
    }
}
