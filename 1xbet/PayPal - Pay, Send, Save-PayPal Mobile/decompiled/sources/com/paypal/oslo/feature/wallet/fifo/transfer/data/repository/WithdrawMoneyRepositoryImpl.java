package com.paypal.oslo.feature.wallet.fifo.transfer.data.repository;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u0007\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/data/repository/WithdrawMoneyRepositoryImpl;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/repository/WithdrawMoneyRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/GetWithdrawalOptionsInput;", "input", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/GetWithdrawalOptionsError;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/GetWithdrawalOptionsResult;", "getWithdrawalOptions", "(Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/GetWithdrawalOptionsInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsInput;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsError;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsResult;", "withdrawFunds", "(Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/apollographql/apollo/ApolloClient;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class WithdrawMoneyRepositoryImpl implements com.paypal.oslo.feature.wallet.fifo.transfer.domain.repository.WithdrawMoneyRepository {
    public static final int $stable = 8;
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public WithdrawMoneyRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoFpsRangesFor = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0126 A[Catch: all -> 0x0060, RaiseCancellationException -> 0x0063, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x0063, all -> 0x0060, blocks: (B:11:0x005b, B:12:0x0120, B:15:0x0126, B:16:0x0165, B:19:0x0178, B:21:0x018c, B:24:0x0197, B:26:0x01ba, B:28:0x01c0, B:30:0x020c, B:33:0x0214, B:35:0x021c, B:36:0x0226, B:44:0x0143, B:45:0x015f, B:46:0x0164), top: B:10:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x018c A[Catch: all -> 0x0060, RaiseCancellationException -> 0x0063, TryCatch #4 {RaiseCancellationException -> 0x0063, all -> 0x0060, blocks: (B:11:0x005b, B:12:0x0120, B:15:0x0126, B:16:0x0165, B:19:0x0178, B:21:0x018c, B:24:0x0197, B:26:0x01ba, B:28:0x01c0, B:30:0x020c, B:33:0x0214, B:35:0x021c, B:36:0x0226, B:44:0x0143, B:45:0x015f, B:46:0x0164), top: B:10:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // com.paypal.oslo.feature.wallet.fifo.transfer.domain.repository.WithdrawMoneyRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getWithdrawalOptions(com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.GetWithdrawalOptionsInput getWithdrawalOptionsInput, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetWithdrawalOptionsError, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.GetWithdrawalOptionsResult>> continuation) {
        com.paypal.oslo.feature.wallet.fifo.transfer.data.repository.WithdrawMoneyRepositoryImpl$getWithdrawalOptions$1 withdrawMoneyRepositoryImpl$getWithdrawalOptions$1;
        int i;
        kotlin.jvm.functions.Function2 function2;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.IorRaise iorRaise;
        java.util.concurrent.atomic.AtomicReference atomicReference2;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.IorRaise iorRaise2;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.FiatCurrencyInput fiatCurrencyInput;
        java.lang.Object obj;
        arrow.core.Ior.Both both;
        com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.Data data;
        com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.WithdrawalOption withdrawalOption;
        if (continuation instanceof com.paypal.oslo.feature.wallet.fifo.transfer.data.repository.WithdrawMoneyRepositoryImpl$getWithdrawalOptions$1) {
            withdrawMoneyRepositoryImpl$getWithdrawalOptions$1 = (com.paypal.oslo.feature.wallet.fifo.transfer.data.repository.WithdrawMoneyRepositoryImpl$getWithdrawalOptions$1) continuation;
            if ((withdrawMoneyRepositoryImpl$getWithdrawalOptions$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                withdrawMoneyRepositoryImpl$getWithdrawalOptions$1.getOutputStallDurationlomOqCM -= 2147483648;
                com.paypal.oslo.feature.wallet.fifo.transfer.data.repository.WithdrawMoneyRepositoryImpl$getWithdrawalOptions$1 withdrawMoneyRepositoryImpl$getWithdrawalOptions$12 = withdrawMoneyRepositoryImpl$getWithdrawalOptions$1;
                java.lang.Object obj2 = withdrawMoneyRepositoryImpl$getWithdrawalOptions$12.isOutputSupportedFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = withdrawMoneyRepositoryImpl$getWithdrawalOptions$12.getOutputStallDurationlomOqCM;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.data.repository.WithdrawMoneyRepositoryImpl$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                            return com.paypal.oslo.feature.wallet.fifo.transfer.data.repository.WithdrawMoneyRepositoryImpl.m21300$r8$lambda$895oACjYsxeUK6pe5c_yINyPWs((com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetWithdrawalOptionsError) obj3, (com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetWithdrawalOptionsError) obj4);
                        }
                    };
                    atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        arrow.core.raise.IorRaise iorRaise3 = new arrow.core.raise.IorRaise(function2, atomicReference, defaultRaise3);
                        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.wallet.LoggerKt.log;
                        kotlin.Pair[] pairArr = new kotlin.Pair[2];
                        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalSource source = getWithdrawalOptionsInput.getSource();
                        pairArr[0] = kotlin.TuplesKt.to("sourceType", source != null ? source.getType() : null);
                        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalAmount amount = getWithdrawalOptionsInput.getAmount();
                        pairArr[1] = kotlin.TuplesKt.to("currencyCode", (amount == null || (fiatCurrencyInput = amount.getFiatCurrencyInput()) == null) ? null : fiatCurrencyInput.getCurrencyCode());
                        com.paypal.android.logger.Logger.d$default(logger, "Fetching withdrawal options", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                        com.paypal.oslo.api.graphql.schema.type.WithdrawalOptionsInput withdrawalOptionsInput = com.paypal.oslo.feature.wallet.fifo.transfer.data.repository.GetWithdrawalOptionsMapperKt.toWithdrawalOptionsInput(getWithdrawalOptionsInput);
                        com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery getWithdrawalOptionsQuery = new com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery(withdrawalOptionsInput);
                        withdrawMoneyRepositoryImpl$getWithdrawalOptions$12.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getWithdrawalOptionsInput);
                        withdrawMoneyRepositoryImpl$getWithdrawalOptions$12.getInputSizeshNQ4ISI = function2;
                        withdrawMoneyRepositoryImpl$getWithdrawalOptions$12.getHighSpeedVideoSizesFor = atomicReference;
                        withdrawMoneyRepositoryImpl$getWithdrawalOptions$12.getOutputFormats = defaultRaise;
                        withdrawMoneyRepositoryImpl$getWithdrawalOptions$12.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        withdrawMoneyRepositoryImpl$getWithdrawalOptions$12.getOutputSizes = iorRaise3;
                        withdrawMoneyRepositoryImpl$getWithdrawalOptions$12.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(withdrawalOptionsInput);
                        withdrawMoneyRepositoryImpl$getWithdrawalOptions$12.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getWithdrawalOptionsQuery);
                        withdrawMoneyRepositoryImpl$getWithdrawalOptions$12.getOutputSizeshNQ4ISI = iorRaise3;
                        withdrawMoneyRepositoryImpl$getWithdrawalOptions$12.getHighSpeedVideoFpsRangesFor = 0;
                        withdrawMoneyRepositoryImpl$getWithdrawalOptions$12.getHighSpeedVideoFpsRanges = 0;
                        withdrawMoneyRepositoryImpl$getWithdrawalOptions$12.Camera2StreamConfigurationMap = 0;
                        withdrawMoneyRepositoryImpl$getWithdrawalOptions$12.getHighSpeedVideoSizes = 0;
                        withdrawMoneyRepositoryImpl$getWithdrawalOptions$12.getHighResolutionOutputSizeshNQ4ISI = 0;
                        withdrawMoneyRepositoryImpl$getWithdrawalOptions$12.getOutputStallDurationlomOqCM = 1;
                        java.lang.Object execute$default = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.getHighSpeedVideoFpsRangesFor, getWithdrawalOptionsQuery, (com.paypal.oslo.core.network.graphql.CallConfig) null, withdrawMoneyRepositoryImpl$getWithdrawalOptions$12, 2, (java.lang.Object) null);
                        if (execute$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        iorRaise = iorRaise3;
                        atomicReference2 = atomicReference;
                        defaultRaise2 = defaultRaise;
                        obj2 = execute$default;
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
                    int i2 = withdrawMoneyRepositoryImpl$getWithdrawalOptions$12.getHighResolutionOutputSizeshNQ4ISI;
                    int i3 = withdrawMoneyRepositoryImpl$getWithdrawalOptions$12.getHighSpeedVideoSizes;
                    int i4 = withdrawMoneyRepositoryImpl$getWithdrawalOptions$12.Camera2StreamConfigurationMap;
                    int i5 = withdrawMoneyRepositoryImpl$getWithdrawalOptions$12.getHighSpeedVideoFpsRanges;
                    int i6 = withdrawMoneyRepositoryImpl$getWithdrawalOptions$12.getHighSpeedVideoFpsRangesFor;
                    iorRaise = (arrow.core.raise.IorRaise) withdrawMoneyRepositoryImpl$getWithdrawalOptions$12.getOutputSizeshNQ4ISI;
                    iorRaise2 = (arrow.core.raise.IorRaise) withdrawMoneyRepositoryImpl$getWithdrawalOptions$12.getOutputSizes;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) withdrawMoneyRepositoryImpl$getWithdrawalOptions$12.getOutputFormats;
                    atomicReference2 = (java.util.concurrent.atomic.AtomicReference) withdrawMoneyRepositoryImpl$getWithdrawalOptions$12.getHighSpeedVideoSizesFor;
                    kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) withdrawMoneyRepositoryImpl$getWithdrawalOptions$12.getInputSizeshNQ4ISI;
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
                    both = new arrow.core.Ior.Left(com.paypal.oslo.feature.wallet.fifo.transfer.data.repository.GetWithdrawalOptionsMapperKt.toGetWithdrawalOptionsError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue()));
                } else if (!(both instanceof arrow.core.Ior.Right)) {
                    if (!(both instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    both = new arrow.core.Ior.Both(com.paypal.oslo.feature.wallet.fifo.transfer.data.repository.GetWithdrawalOptionsMapperKt.toGetWithdrawalOptionsError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) both).getLeftValue()), ((arrow.core.Ior.Both) both).getRightValue());
                }
                com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both);
                com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.wallet.LoggerKt.log;
                kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
                pairArr2[0] = kotlin.TuplesKt.to("hasData", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(graphQLData.getData() == null));
                com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.Data data2 = (com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.Data) graphQLData.getData();
                pairArr2[1] = kotlin.TuplesKt.to("hasWithdrawalOption", kotlin.coroutines.jvm.internal.Boxing.boxBoolean((data2 == null ? data2.getWithdrawalOption() : null) == null));
                com.paypal.android.logger.Logger.d$default(logger2, "Raw GraphQL response received", kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
                data = (com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.Data) graphQLData.getData();
                if (data != null || (withdrawalOption = data.getWithdrawalOption()) == null) {
                    iorRaise2.raise(com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetWithdrawalOptionsError.Business.MissingData.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.GetWithdrawalOptionsResult getWithdrawalOptionsResult = com.paypal.oslo.feature.wallet.fifo.transfer.data.repository.GetWithdrawalOptionsMapperKt.toGetWithdrawalOptionsResult(withdrawalOption);
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Successfully fetched withdrawal options", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("optionsCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(getWithdrawalOptionsResult.getOptions().size())), kotlin.TuplesKt.to("potentialInstrumentsCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(getWithdrawalOptionsResult.getPotentialInstruments().size()))), null, 4, null);
                defaultRaise2.complete();
                arrow.core.EmptyValue emptyValue3 = arrow.core.EmptyValue.INSTANCE;
                java.lang.Object obj3 = atomicReference2.get();
                return obj3 == arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(getWithdrawalOptionsResult) : new arrow.core.Ior.Both(obj3, getWithdrawalOptionsResult);
            }
        }
        withdrawMoneyRepositoryImpl$getWithdrawalOptions$1 = new com.paypal.oslo.feature.wallet.fifo.transfer.data.repository.WithdrawMoneyRepositoryImpl$getWithdrawalOptions$1(this, continuation);
        com.paypal.oslo.feature.wallet.fifo.transfer.data.repository.WithdrawMoneyRepositoryImpl$getWithdrawalOptions$1 withdrawMoneyRepositoryImpl$getWithdrawalOptions$122 = withdrawMoneyRepositoryImpl$getWithdrawalOptions$1;
        java.lang.Object obj22 = withdrawMoneyRepositoryImpl$getWithdrawalOptions$122.isOutputSupportedFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = withdrawMoneyRepositoryImpl$getWithdrawalOptions$122.getOutputStallDurationlomOqCM;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj22;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both);
        com.paypal.android.logger.Logger logger22 = com.paypal.oslo.feature.wallet.LoggerKt.log;
        kotlin.Pair[] pairArr22 = new kotlin.Pair[2];
        pairArr22[0] = kotlin.TuplesKt.to("hasData", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(graphQLData2.getData() == null));
        com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.Data data22 = (com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.Data) graphQLData2.getData();
        pairArr22[1] = kotlin.TuplesKt.to("hasWithdrawalOption", kotlin.coroutines.jvm.internal.Boxing.boxBoolean((data22 == null ? data22.getWithdrawalOption() : null) == null));
        com.paypal.android.logger.Logger.d$default(logger22, "Raw GraphQL response received", kotlin.collections.MapsKt.mapOf(pairArr22), null, 4, null);
        data = (com.paypal.oslo.feature.wallet.graphql.GetWithdrawalOptionsQuery.Data) graphQLData2.getData();
        if (data != null) {
        }
        iorRaise2.raise(com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetWithdrawalOptionsError.Business.MissingData.INSTANCE);
        throw new kotlin.KotlinNothingValueException();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0120 A[Catch: all -> 0x0060, RaiseCancellationException -> 0x0063, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x0063, all -> 0x0060, blocks: (B:11:0x005b, B:12:0x011a, B:15:0x0120, B:16:0x015f, B:19:0x0172, B:21:0x0186, B:24:0x0191, B:26:0x01b3, B:28:0x01b9, B:30:0x01f9, B:33:0x0201, B:35:0x0209, B:36:0x0213, B:44:0x013d, B:45:0x0159, B:46:0x015e), top: B:10:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0186 A[Catch: all -> 0x0060, RaiseCancellationException -> 0x0063, TryCatch #4 {RaiseCancellationException -> 0x0063, all -> 0x0060, blocks: (B:11:0x005b, B:12:0x011a, B:15:0x0120, B:16:0x015f, B:19:0x0172, B:21:0x0186, B:24:0x0191, B:26:0x01b3, B:28:0x01b9, B:30:0x01f9, B:33:0x0201, B:35:0x0209, B:36:0x0213, B:44:0x013d, B:45:0x0159, B:46:0x015e), top: B:10:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // com.paypal.oslo.feature.wallet.fifo.transfer.domain.repository.WithdrawMoneyRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object withdrawFunds(com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsInput withdrawFundsInput, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsError, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsResult>> continuation) {
        com.paypal.oslo.feature.wallet.fifo.transfer.data.repository.WithdrawMoneyRepositoryImpl$withdrawFunds$1 withdrawMoneyRepositoryImpl$withdrawFunds$1;
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
        com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Data data;
        com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.WithdrawFunds withdrawFunds;
        if (continuation instanceof com.paypal.oslo.feature.wallet.fifo.transfer.data.repository.WithdrawMoneyRepositoryImpl$withdrawFunds$1) {
            withdrawMoneyRepositoryImpl$withdrawFunds$1 = (com.paypal.oslo.feature.wallet.fifo.transfer.data.repository.WithdrawMoneyRepositoryImpl$withdrawFunds$1) continuation;
            if ((withdrawMoneyRepositoryImpl$withdrawFunds$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                withdrawMoneyRepositoryImpl$withdrawFunds$1.getOutputStallDurationlomOqCM -= 2147483648;
                com.paypal.oslo.feature.wallet.fifo.transfer.data.repository.WithdrawMoneyRepositoryImpl$withdrawFunds$1 withdrawMoneyRepositoryImpl$withdrawFunds$12 = withdrawMoneyRepositoryImpl$withdrawFunds$1;
                java.lang.Object obj2 = withdrawMoneyRepositoryImpl$withdrawFunds$12.getValidOutputFormatsForInputhNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = withdrawMoneyRepositoryImpl$withdrawFunds$12.getOutputStallDurationlomOqCM;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.data.repository.WithdrawMoneyRepositoryImpl$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                            return com.paypal.oslo.feature.wallet.fifo.transfer.data.repository.WithdrawMoneyRepositoryImpl.$r8$lambda$VQS3R4jOqtIC4hK1o1fFvrAjtBo((com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsError) obj3, (com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsError) obj4);
                        }
                    };
                    atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        arrow.core.raise.IorRaise iorRaise3 = new arrow.core.raise.IorRaise(function2, atomicReference, defaultRaise3);
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Withdrawing funds", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("transferMethod", withdrawFundsInput.getTransferMethod()), kotlin.TuplesKt.to("transferMode", withdrawFundsInput.getTransferMode()), kotlin.TuplesKt.to("currencyCode", withdrawFundsInput.getAmount().getCurrencyCode())), null, 4, null);
                        com.paypal.oslo.api.graphql.schema.type.WithdrawFundsInput graphQLInput = com.paypal.oslo.feature.wallet.fifo.transfer.data.repository.WithdrawFundsMapperKt.toGraphQLInput(withdrawFundsInput);
                        com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation withdrawFundsMutation = new com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation(graphQLInput);
                        withdrawMoneyRepositoryImpl$withdrawFunds$12.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(withdrawFundsInput);
                        withdrawMoneyRepositoryImpl$withdrawFunds$12.getHighSpeedVideoSizesFor = function2;
                        withdrawMoneyRepositoryImpl$withdrawFunds$12.getInputSizeshNQ4ISI = atomicReference;
                        withdrawMoneyRepositoryImpl$withdrawFunds$12.getOutputFormats = defaultRaise;
                        withdrawMoneyRepositoryImpl$withdrawFunds$12.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        withdrawMoneyRepositoryImpl$withdrawFunds$12.getOutputStallDuration = iorRaise3;
                        withdrawMoneyRepositoryImpl$withdrawFunds$12.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(graphQLInput);
                        withdrawMoneyRepositoryImpl$withdrawFunds$12.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(withdrawFundsMutation);
                        withdrawMoneyRepositoryImpl$withdrawFunds$12.getOutputSizeshNQ4ISI = iorRaise3;
                        withdrawMoneyRepositoryImpl$withdrawFunds$12.getHighResolutionOutputSizeshNQ4ISI = 0;
                        withdrawMoneyRepositoryImpl$withdrawFunds$12.getHighSpeedVideoSizes = 0;
                        withdrawMoneyRepositoryImpl$withdrawFunds$12.Camera2StreamConfigurationMap = 0;
                        withdrawMoneyRepositoryImpl$withdrawFunds$12.getHighSpeedVideoFpsRangesFor = 0;
                        withdrawMoneyRepositoryImpl$withdrawFunds$12.getHighSpeedVideoFpsRanges = 0;
                        withdrawMoneyRepositoryImpl$withdrawFunds$12.getOutputStallDurationlomOqCM = 1;
                        obj2 = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.getHighSpeedVideoFpsRangesFor, withdrawFundsMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, withdrawMoneyRepositoryImpl$withdrawFunds$12, 2, (java.lang.Object) null);
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
                    int i2 = withdrawMoneyRepositoryImpl$withdrawFunds$12.getHighSpeedVideoFpsRanges;
                    int i3 = withdrawMoneyRepositoryImpl$withdrawFunds$12.getHighSpeedVideoFpsRangesFor;
                    int i4 = withdrawMoneyRepositoryImpl$withdrawFunds$12.Camera2StreamConfigurationMap;
                    int i5 = withdrawMoneyRepositoryImpl$withdrawFunds$12.getHighSpeedVideoSizes;
                    int i6 = withdrawMoneyRepositoryImpl$withdrawFunds$12.getHighResolutionOutputSizeshNQ4ISI;
                    iorRaise = (arrow.core.raise.IorRaise) withdrawMoneyRepositoryImpl$withdrawFunds$12.getOutputSizeshNQ4ISI;
                    iorRaise2 = (arrow.core.raise.IorRaise) withdrawMoneyRepositoryImpl$withdrawFunds$12.getOutputStallDuration;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) withdrawMoneyRepositoryImpl$withdrawFunds$12.getOutputFormats;
                    atomicReference2 = (java.util.concurrent.atomic.AtomicReference) withdrawMoneyRepositoryImpl$withdrawFunds$12.getInputSizeshNQ4ISI;
                    kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) withdrawMoneyRepositoryImpl$withdrawFunds$12.getHighSpeedVideoSizesFor;
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
                    both = new arrow.core.Ior.Left(com.paypal.oslo.feature.wallet.fifo.transfer.data.repository.WithdrawFundsMapperKt.toWithdrawFundsError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue()));
                } else if (!(both instanceof arrow.core.Ior.Right)) {
                    if (!(both instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    both = new arrow.core.Ior.Both(com.paypal.oslo.feature.wallet.fifo.transfer.data.repository.WithdrawFundsMapperKt.toWithdrawFundsError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) both).getLeftValue()), ((arrow.core.Ior.Both) both).getRightValue());
                }
                com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both);
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.wallet.LoggerKt.log;
                kotlin.Pair[] pairArr = new kotlin.Pair[2];
                pairArr[0] = kotlin.TuplesKt.to("hasData", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(graphQLData.getData() == null));
                com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Data data2 = (com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Data) graphQLData.getData();
                pairArr[1] = kotlin.TuplesKt.to("hasWithdrawFunds", kotlin.coroutines.jvm.internal.Boxing.boxBoolean((data2 == null ? data2.getWithdrawFunds() : null) == null));
                com.paypal.android.logger.Logger.d$default(logger, "Withdraw funds response received", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                data = (com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Data) graphQLData.getData();
                if (data != null || (withdrawFunds = data.getWithdrawFunds()) == null) {
                    iorRaise2.raise(com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsError.Business.MissingData.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsResult withdrawFundsResult = com.paypal.oslo.feature.wallet.fifo.transfer.data.repository.WithdrawFundsMapperKt.toWithdrawFundsResult(withdrawFunds);
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Successfully withdrew funds", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("id", withdrawFundsResult.getId()), kotlin.TuplesKt.to("status", withdrawFundsResult.getStatus().name())), null, 4, null);
                defaultRaise2.complete();
                arrow.core.EmptyValue emptyValue3 = arrow.core.EmptyValue.INSTANCE;
                java.lang.Object obj3 = atomicReference2.get();
                return obj3 == arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(withdrawFundsResult) : new arrow.core.Ior.Both(obj3, withdrawFundsResult);
            }
        }
        withdrawMoneyRepositoryImpl$withdrawFunds$1 = new com.paypal.oslo.feature.wallet.fifo.transfer.data.repository.WithdrawMoneyRepositoryImpl$withdrawFunds$1(this, continuation);
        com.paypal.oslo.feature.wallet.fifo.transfer.data.repository.WithdrawMoneyRepositoryImpl$withdrawFunds$1 withdrawMoneyRepositoryImpl$withdrawFunds$122 = withdrawMoneyRepositoryImpl$withdrawFunds$1;
        java.lang.Object obj22 = withdrawMoneyRepositoryImpl$withdrawFunds$122.getValidOutputFormatsForInputhNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = withdrawMoneyRepositoryImpl$withdrawFunds$122.getOutputStallDurationlomOqCM;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj22;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both);
        com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.wallet.LoggerKt.log;
        kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
        pairArr2[0] = kotlin.TuplesKt.to("hasData", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(graphQLData2.getData() == null));
        com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Data data22 = (com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Data) graphQLData2.getData();
        pairArr2[1] = kotlin.TuplesKt.to("hasWithdrawFunds", kotlin.coroutines.jvm.internal.Boxing.boxBoolean((data22 == null ? data22.getWithdrawFunds() : null) == null));
        com.paypal.android.logger.Logger.d$default(logger2, "Withdraw funds response received", kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
        data = (com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Data) graphQLData2.getData();
        if (data != null) {
        }
        iorRaise2.raise(com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsError.Business.MissingData.INSTANCE);
        throw new kotlin.KotlinNothingValueException();
    }

    /* renamed from: $r8$lambda$895oACjYsx-eUK6pe5c_yINyPWs, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetWithdrawalOptionsError m21300$r8$lambda$895oACjYsxeUK6pe5c_yINyPWs(com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetWithdrawalOptionsError getWithdrawalOptionsError, com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetWithdrawalOptionsError getWithdrawalOptionsError2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getWithdrawalOptionsError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getWithdrawalOptionsError2, "");
        return getWithdrawalOptionsError;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsError $r8$lambda$VQS3R4jOqtIC4hK1o1fFvrAjtBo(com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsError withdrawFundsError, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsError withdrawFundsError2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawFundsError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawFundsError2, "");
        return withdrawFundsError;
    }
}
