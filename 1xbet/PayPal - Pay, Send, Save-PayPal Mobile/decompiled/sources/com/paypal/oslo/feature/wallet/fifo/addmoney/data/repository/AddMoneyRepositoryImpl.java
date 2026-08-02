package com.paypal.oslo.feature.wallet.fifo.addmoney.data.repository;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u0007\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/data/repository/AddMoneyRepositoryImpl;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/repository/AddMoneyRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/BalanceDepositSelectionRequest;", "input", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/BalanceDepositSelectionError;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/BalanceDepositSelectionCategories;", "getDepositOptions", "(Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/BalanceDepositSelectionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositFulfillmentRequest;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositFulfillmentError;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositFulfillmentResult;", "processDepositFulfillment", "(Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositFulfillmentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/AutoReloadScheduleType;", "scheduleType", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "", "isAutoReloadEnabled", "(Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/AutoReloadScheduleType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddMoneyRepositoryImpl implements com.paypal.oslo.feature.wallet.fifo.addmoney.domain.repository.AddMoneyRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public AddMoneyRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoFpsRangesFor = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0141 A[Catch: all -> 0x0061, RaiseCancellationException -> 0x0064, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x0064, all -> 0x0061, blocks: (B:11:0x005c, B:12:0x013b, B:15:0x0141, B:16:0x0180, B:19:0x0193, B:21:0x01a7, B:24:0x01b2, B:26:0x01d5, B:28:0x01db, B:30:0x0238, B:33:0x0240, B:35:0x0248, B:36:0x0252, B:44:0x015e, B:45:0x017a, B:46:0x017f), top: B:10:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01a7 A[Catch: all -> 0x0061, RaiseCancellationException -> 0x0064, TryCatch #4 {RaiseCancellationException -> 0x0064, all -> 0x0061, blocks: (B:11:0x005c, B:12:0x013b, B:15:0x0141, B:16:0x0180, B:19:0x0193, B:21:0x01a7, B:24:0x01b2, B:26:0x01d5, B:28:0x01db, B:30:0x0238, B:33:0x0240, B:35:0x0248, B:36:0x0252, B:44:0x015e, B:45:0x017a, B:46:0x017f), top: B:10:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // com.paypal.oslo.feature.wallet.fifo.addmoney.domain.repository.AddMoneyRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getDepositOptions(com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionRequest balanceDepositSelectionRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionError, com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionCategories>> continuation) {
        com.paypal.oslo.feature.wallet.fifo.addmoney.data.repository.AddMoneyRepositoryImpl$getDepositOptions$1 addMoneyRepositoryImpl$getDepositOptions$1;
        int i;
        kotlin.jvm.functions.Function2 function2;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        arrow.core.raise.DefaultRaise defaultRaise;
        java.lang.String str;
        arrow.core.raise.IorRaise iorRaise;
        java.util.concurrent.atomic.AtomicReference atomicReference2;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.IorRaise iorRaise2;
        java.lang.Object obj;
        arrow.core.Ior.Both both;
        com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.Data data;
        com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.DepositOptions depositOptions;
        if (continuation instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.data.repository.AddMoneyRepositoryImpl$getDepositOptions$1) {
            addMoneyRepositoryImpl$getDepositOptions$1 = (com.paypal.oslo.feature.wallet.fifo.addmoney.data.repository.AddMoneyRepositoryImpl$getDepositOptions$1) continuation;
            if ((addMoneyRepositoryImpl$getDepositOptions$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                addMoneyRepositoryImpl$getDepositOptions$1.getOutputStallDurationlomOqCM -= 2147483648;
                com.paypal.oslo.feature.wallet.fifo.addmoney.data.repository.AddMoneyRepositoryImpl$getDepositOptions$1 addMoneyRepositoryImpl$getDepositOptions$12 = addMoneyRepositoryImpl$getDepositOptions$1;
                java.lang.Object obj2 = addMoneyRepositoryImpl$getDepositOptions$12.isOutputSupportedFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = addMoneyRepositoryImpl$getDepositOptions$12.getOutputStallDurationlomOqCM;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.data.repository.AddMoneyRepositoryImpl$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                            return com.paypal.oslo.feature.wallet.fifo.addmoney.data.repository.AddMoneyRepositoryImpl.m21256$r8$lambda$66oHlgLQ90vn33rx6iiQJPl6HY((com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionError) obj3, (com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionError) obj4);
                        }
                    };
                    atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        arrow.core.raise.IorRaise iorRaise3 = new arrow.core.raise.IorRaise(function2, atomicReference, defaultRaise3);
                        com.paypal.oslo.api.graphql.schema.type.DepositOptionsInput depositOptionsGraphQLInput = com.paypal.oslo.feature.wallet.fifo.addmoney.data.mapper.GetDepositOptionsMapperKt.toDepositOptionsGraphQLInput(balanceDepositSelectionRequest);
                        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.wallet.LoggerKt.log;
                        kotlin.Pair[] pairArr = new kotlin.Pair[4];
                        pairArr[0] = kotlin.TuplesKt.to("depositType", depositOptionsGraphQLInput.getType().toString());
                        pairArr[1] = kotlin.TuplesKt.to("currencyCode", balanceDepositSelectionRequest.getDepositAmount().getCurrencyCode());
                        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed = balanceDepositSelectionRequest.getTransferSpeed();
                        if (transferSpeed == null || (str = transferSpeed.toString()) == null) {
                            str = "ALL";
                        }
                        pairArr[2] = kotlin.TuplesKt.to("speed", str);
                        pairArr[3] = kotlin.TuplesKt.to("transferFlowContext", depositOptionsGraphQLInput.getTransferFlowContext().toString());
                        com.paypal.android.logger.Logger.d$default(logger, "Fetching deposit options", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                        com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery getDepositOptionsQuery = new com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery(depositOptionsGraphQLInput);
                        addMoneyRepositoryImpl$getDepositOptions$12.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(balanceDepositSelectionRequest);
                        addMoneyRepositoryImpl$getDepositOptions$12.getOutputFormats = function2;
                        addMoneyRepositoryImpl$getDepositOptions$12.getInputSizeshNQ4ISI = atomicReference;
                        addMoneyRepositoryImpl$getDepositOptions$12.getOutputMinFrameDuration = defaultRaise;
                        addMoneyRepositoryImpl$getDepositOptions$12.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        addMoneyRepositoryImpl$getDepositOptions$12.getOutputStallDuration = iorRaise3;
                        addMoneyRepositoryImpl$getDepositOptions$12.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(depositOptionsGraphQLInput);
                        addMoneyRepositoryImpl$getDepositOptions$12.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getDepositOptionsQuery);
                        addMoneyRepositoryImpl$getDepositOptions$12.getOutputMinFrameDurationlomOqCM = iorRaise3;
                        addMoneyRepositoryImpl$getDepositOptions$12.getHighSpeedVideoFpsRanges = 0;
                        addMoneyRepositoryImpl$getDepositOptions$12.getHighResolutionOutputSizeshNQ4ISI = 0;
                        addMoneyRepositoryImpl$getDepositOptions$12.getHighSpeedVideoSizes = 0;
                        addMoneyRepositoryImpl$getDepositOptions$12.Camera2StreamConfigurationMap = 0;
                        addMoneyRepositoryImpl$getDepositOptions$12.getHighSpeedVideoFpsRangesFor = 0;
                        addMoneyRepositoryImpl$getDepositOptions$12.getOutputStallDurationlomOqCM = 1;
                        java.lang.Object execute$default = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.getHighSpeedVideoFpsRangesFor, getDepositOptionsQuery, (com.paypal.oslo.core.network.graphql.CallConfig) null, addMoneyRepositoryImpl$getDepositOptions$12, 2, (java.lang.Object) null);
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
                    int i2 = addMoneyRepositoryImpl$getDepositOptions$12.getHighSpeedVideoFpsRangesFor;
                    int i3 = addMoneyRepositoryImpl$getDepositOptions$12.Camera2StreamConfigurationMap;
                    int i4 = addMoneyRepositoryImpl$getDepositOptions$12.getHighSpeedVideoSizes;
                    int i5 = addMoneyRepositoryImpl$getDepositOptions$12.getHighResolutionOutputSizeshNQ4ISI;
                    int i6 = addMoneyRepositoryImpl$getDepositOptions$12.getHighSpeedVideoFpsRanges;
                    iorRaise = (arrow.core.raise.IorRaise) addMoneyRepositoryImpl$getDepositOptions$12.getOutputMinFrameDurationlomOqCM;
                    iorRaise2 = (arrow.core.raise.IorRaise) addMoneyRepositoryImpl$getDepositOptions$12.getOutputStallDuration;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) addMoneyRepositoryImpl$getDepositOptions$12.getOutputMinFrameDuration;
                    atomicReference2 = (java.util.concurrent.atomic.AtomicReference) addMoneyRepositoryImpl$getDepositOptions$12.getInputSizeshNQ4ISI;
                    kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) addMoneyRepositoryImpl$getDepositOptions$12.getOutputFormats;
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
                    both = new arrow.core.Ior.Left(com.paypal.oslo.feature.wallet.fifo.addmoney.data.mapper.GetDepositOptionsMapperKt.toBalanceDepositSelectionError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue()));
                } else if (!(both instanceof arrow.core.Ior.Right)) {
                    if (!(both instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    both = new arrow.core.Ior.Both(com.paypal.oslo.feature.wallet.fifo.addmoney.data.mapper.GetDepositOptionsMapperKt.toBalanceDepositSelectionError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) both).getLeftValue()), ((arrow.core.Ior.Both) both).getRightValue());
                }
                com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both);
                com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.wallet.LoggerKt.log;
                kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
                pairArr2[0] = kotlin.TuplesKt.to("hasData", java.lang.String.valueOf(graphQLData.getData() == null));
                com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.Data data2 = (com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.Data) graphQLData.getData();
                pairArr2[1] = kotlin.TuplesKt.to("hasDepositOptions", java.lang.String.valueOf((data2 == null ? data2.getDepositOptions() : null) == null));
                com.paypal.android.logger.Logger.d$default(logger2, "Raw GraphQL response received", kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
                data = (com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.Data) graphQLData.getData();
                if (data != null || (depositOptions = data.getDepositOptions()) == null) {
                    iorRaise2.raise(com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionError.Business.MissingData.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionCategories balanceDepositSelectionCategories = com.paypal.oslo.feature.wallet.fifo.addmoney.data.mapper.GetDepositOptionsMapperKt.toBalanceDepositSelectionCategories(depositOptions);
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Successfully fetched deposit options", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("optionsCount", java.lang.String.valueOf(balanceDepositSelectionCategories.getOptions().size())), kotlin.TuplesKt.to("potentialInstrumentsCount", java.lang.String.valueOf(balanceDepositSelectionCategories.getPotentialInstruments().size())), kotlin.TuplesKt.to("recommendedSpeed", balanceDepositSelectionCategories.getRecommendedTransferSpeed().toString())), null, 4, null);
                defaultRaise2.complete();
                arrow.core.EmptyValue emptyValue3 = arrow.core.EmptyValue.INSTANCE;
                java.lang.Object obj3 = atomicReference2.get();
                return obj3 == arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(balanceDepositSelectionCategories) : new arrow.core.Ior.Both(obj3, balanceDepositSelectionCategories);
            }
        }
        addMoneyRepositoryImpl$getDepositOptions$1 = new com.paypal.oslo.feature.wallet.fifo.addmoney.data.repository.AddMoneyRepositoryImpl$getDepositOptions$1(this, continuation);
        com.paypal.oslo.feature.wallet.fifo.addmoney.data.repository.AddMoneyRepositoryImpl$getDepositOptions$1 addMoneyRepositoryImpl$getDepositOptions$122 = addMoneyRepositoryImpl$getDepositOptions$1;
        java.lang.Object obj22 = addMoneyRepositoryImpl$getDepositOptions$122.isOutputSupportedFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = addMoneyRepositoryImpl$getDepositOptions$122.getOutputStallDurationlomOqCM;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj22;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both);
        com.paypal.android.logger.Logger logger22 = com.paypal.oslo.feature.wallet.LoggerKt.log;
        kotlin.Pair[] pairArr22 = new kotlin.Pair[2];
        pairArr22[0] = kotlin.TuplesKt.to("hasData", java.lang.String.valueOf(graphQLData2.getData() == null));
        com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.Data data22 = (com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.Data) graphQLData2.getData();
        pairArr22[1] = kotlin.TuplesKt.to("hasDepositOptions", java.lang.String.valueOf((data22 == null ? data22.getDepositOptions() : null) == null));
        com.paypal.android.logger.Logger.d$default(logger22, "Raw GraphQL response received", kotlin.collections.MapsKt.mapOf(pairArr22), null, 4, null);
        data = (com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.Data) graphQLData2.getData();
        if (data != null) {
        }
        iorRaise2.raise(com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionError.Business.MissingData.INSTANCE);
        throw new kotlin.KotlinNothingValueException();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x016f A[Catch: all -> 0x0060, RaiseCancellationException -> 0x0063, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x0063, all -> 0x0060, blocks: (B:11:0x005b, B:12:0x0169, B:15:0x016f, B:16:0x01ae, B:19:0x01c1, B:21:0x01d6, B:24:0x01e1, B:26:0x0203, B:28:0x020f, B:29:0x0213, B:31:0x0281, B:34:0x0289, B:36:0x0291, B:37:0x029b, B:45:0x018c, B:46:0x01a8, B:47:0x01ad), top: B:10:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01d6 A[Catch: all -> 0x0060, RaiseCancellationException -> 0x0063, TryCatch #4 {RaiseCancellationException -> 0x0063, all -> 0x0060, blocks: (B:11:0x005b, B:12:0x0169, B:15:0x016f, B:16:0x01ae, B:19:0x01c1, B:21:0x01d6, B:24:0x01e1, B:26:0x0203, B:28:0x020f, B:29:0x0213, B:31:0x0281, B:34:0x0289, B:36:0x0291, B:37:0x029b, B:45:0x018c, B:46:0x01a8, B:47:0x01ad), top: B:10:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0203 A[Catch: all -> 0x0060, RaiseCancellationException -> 0x0063, TryCatch #4 {RaiseCancellationException -> 0x0063, all -> 0x0060, blocks: (B:11:0x005b, B:12:0x0169, B:15:0x016f, B:16:0x01ae, B:19:0x01c1, B:21:0x01d6, B:24:0x01e1, B:26:0x0203, B:28:0x020f, B:29:0x0213, B:31:0x0281, B:34:0x0289, B:36:0x0291, B:37:0x029b, B:45:0x018c, B:46:0x01a8, B:47:0x01ad), top: B:10:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0291 A[Catch: all -> 0x0060, RaiseCancellationException -> 0x0063, TryCatch #4 {RaiseCancellationException -> 0x0063, all -> 0x0060, blocks: (B:11:0x005b, B:12:0x0169, B:15:0x016f, B:16:0x01ae, B:19:0x01c1, B:21:0x01d6, B:24:0x01e1, B:26:0x0203, B:28:0x020f, B:29:0x0213, B:31:0x0281, B:34:0x0289, B:36:0x0291, B:37:0x029b, B:45:0x018c, B:46:0x01a8, B:47:0x01ad), top: B:10:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // com.paypal.oslo.feature.wallet.fifo.addmoney.domain.repository.AddMoneyRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object processDepositFulfillment(com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentRequest depositFulfillmentRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentError, com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentResult>> continuation) {
        com.paypal.oslo.feature.wallet.fifo.addmoney.data.repository.AddMoneyRepositoryImpl$processDepositFulfillment$1 addMoneyRepositoryImpl$processDepositFulfillment$1;
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
        com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.Data data;
        if (continuation instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.data.repository.AddMoneyRepositoryImpl$processDepositFulfillment$1) {
            addMoneyRepositoryImpl$processDepositFulfillment$1 = (com.paypal.oslo.feature.wallet.fifo.addmoney.data.repository.AddMoneyRepositoryImpl$processDepositFulfillment$1) continuation;
            if ((addMoneyRepositoryImpl$processDepositFulfillment$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                addMoneyRepositoryImpl$processDepositFulfillment$1.getOutputStallDurationlomOqCM -= 2147483648;
                com.paypal.oslo.feature.wallet.fifo.addmoney.data.repository.AddMoneyRepositoryImpl$processDepositFulfillment$1 addMoneyRepositoryImpl$processDepositFulfillment$12 = addMoneyRepositoryImpl$processDepositFulfillment$1;
                java.lang.Object obj2 = addMoneyRepositoryImpl$processDepositFulfillment$12.isOutputSupportedFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = addMoneyRepositoryImpl$processDepositFulfillment$12.getOutputStallDurationlomOqCM;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.data.repository.AddMoneyRepositoryImpl$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                            return com.paypal.oslo.feature.wallet.fifo.addmoney.data.repository.AddMoneyRepositoryImpl.$r8$lambda$Qs0xym6n5o0H_d80lWNBhuY_ya0((com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentError) obj3, (com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentError) obj4);
                        }
                    };
                    atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        arrow.core.raise.IorRaise iorRaise3 = new arrow.core.raise.IorRaise(function2, atomicReference, defaultRaise3);
                        com.paypal.oslo.api.graphql.schema.type.AddDepositInput addDepositInput = new com.paypal.oslo.api.graphql.schema.type.AddDepositInput(null, null, null, new com.apollographql.apollo.api.Optional.Present(depositFulfillmentRequest.getDepositOptionId()), null, null, new com.apollographql.apollo.api.Optional.Present(new com.paypal.oslo.api.graphql.schema.type.TransferFlowContextInput(null, new com.apollographql.apollo.api.Optional.Present(new com.paypal.oslo.api.graphql.schema.type.ProductFlowInput(com.paypal.oslo.feature.wallet.fifo.common.data.repository.TransferCapabilitiesMapperKt.toGraphProductIdentifier(depositFulfillmentRequest.getIdentifier()), null, null, 6, null)), null, null, null, 29, null)), null, null, null, null, 1975, null);
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Processing deposit fulfillment", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("depositOptionId", depositFulfillmentRequest.getDepositOptionId()), kotlin.TuplesKt.to("identifier", depositFulfillmentRequest.getIdentifier())), null, 4, null);
                        com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation createWalletDepositMutation = new com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation(addDepositInput);
                        addMoneyRepositoryImpl$processDepositFulfillment$12.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(depositFulfillmentRequest);
                        addMoneyRepositoryImpl$processDepositFulfillment$12.getOutputFormats = function2;
                        addMoneyRepositoryImpl$processDepositFulfillment$12.getOutputMinFrameDuration = atomicReference;
                        addMoneyRepositoryImpl$processDepositFulfillment$12.getInputFormats = defaultRaise;
                        addMoneyRepositoryImpl$processDepositFulfillment$12.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        addMoneyRepositoryImpl$processDepositFulfillment$12.getOutputMinFrameDurationlomOqCM = iorRaise3;
                        addMoneyRepositoryImpl$processDepositFulfillment$12.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addDepositInput);
                        addMoneyRepositoryImpl$processDepositFulfillment$12.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(createWalletDepositMutation);
                        addMoneyRepositoryImpl$processDepositFulfillment$12.getOutputStallDuration = iorRaise3;
                        addMoneyRepositoryImpl$processDepositFulfillment$12.getHighResolutionOutputSizeshNQ4ISI = 0;
                        addMoneyRepositoryImpl$processDepositFulfillment$12.getHighSpeedVideoFpsRanges = 0;
                        addMoneyRepositoryImpl$processDepositFulfillment$12.Camera2StreamConfigurationMap = 0;
                        addMoneyRepositoryImpl$processDepositFulfillment$12.getHighSpeedVideoSizes = 0;
                        addMoneyRepositoryImpl$processDepositFulfillment$12.getHighSpeedVideoFpsRangesFor = 0;
                        addMoneyRepositoryImpl$processDepositFulfillment$12.getOutputStallDurationlomOqCM = 1;
                        obj2 = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.getHighSpeedVideoFpsRangesFor, createWalletDepositMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, addMoneyRepositoryImpl$processDepositFulfillment$12, 2, (java.lang.Object) null);
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
                    int i2 = addMoneyRepositoryImpl$processDepositFulfillment$12.getHighSpeedVideoFpsRangesFor;
                    int i3 = addMoneyRepositoryImpl$processDepositFulfillment$12.getHighSpeedVideoSizes;
                    int i4 = addMoneyRepositoryImpl$processDepositFulfillment$12.Camera2StreamConfigurationMap;
                    int i5 = addMoneyRepositoryImpl$processDepositFulfillment$12.getHighSpeedVideoFpsRanges;
                    int i6 = addMoneyRepositoryImpl$processDepositFulfillment$12.getHighResolutionOutputSizeshNQ4ISI;
                    iorRaise = (arrow.core.raise.IorRaise) addMoneyRepositoryImpl$processDepositFulfillment$12.getOutputStallDuration;
                    iorRaise2 = (arrow.core.raise.IorRaise) addMoneyRepositoryImpl$processDepositFulfillment$12.getOutputMinFrameDurationlomOqCM;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) addMoneyRepositoryImpl$processDepositFulfillment$12.getInputFormats;
                    atomicReference2 = (java.util.concurrent.atomic.AtomicReference) addMoneyRepositoryImpl$processDepositFulfillment$12.getOutputMinFrameDuration;
                    kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) addMoneyRepositoryImpl$processDepositFulfillment$12.getOutputFormats;
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
                    both = new arrow.core.Ior.Left(com.paypal.oslo.feature.wallet.fifo.addmoney.data.mapper.AddDepositMapperKt.toDepositFulfillmentError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue()));
                } else if (!(both instanceof arrow.core.Ior.Right)) {
                    if (!(both instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    both = new arrow.core.Ior.Both(com.paypal.oslo.feature.wallet.fifo.addmoney.data.mapper.AddDepositMapperKt.toDepositFulfillmentError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) both).getLeftValue()), ((arrow.core.Ior.Both) both).getRightValue());
                }
                com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both);
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.wallet.LoggerKt.log;
                kotlin.Pair[] pairArr = new kotlin.Pair[2];
                pairArr[0] = kotlin.TuplesKt.to("hasData", java.lang.String.valueOf(graphQLData.getData() == null));
                com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.Data data2 = (com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.Data) graphQLData.getData();
                pairArr[1] = kotlin.TuplesKt.to("hasAddDeposit", java.lang.String.valueOf((data2 == null ? data2.getAddDeposit() : null) == null));
                com.paypal.android.logger.Logger.d$default(logger, "Raw GraphQL mutation response received", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                data = (com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.Data) graphQLData.getData();
                if (data != null) {
                    iorRaise2.raise(com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentError.Business.MissingData.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                java.lang.Object obj3 = graphQLData.getExtensions().get("correlationId");
                com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentResult depositFulfillmentResult = com.paypal.oslo.feature.wallet.fifo.addmoney.data.mapper.AddDepositMapperKt.toDepositFulfillmentResult(data, obj3 != null ? obj3.toString() : null);
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Successfully processed deposit fulfillment", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("depositId", depositFulfillmentResult.getData().getAddDeposit().getDeposit().getId()), kotlin.TuplesKt.to("status", depositFulfillmentResult.getData().getAddDeposit().getDeposit().getStatus()), kotlin.TuplesKt.to("type", depositFulfillmentResult.getData().getAddDeposit().getDeposit().getType())), null, 4, null);
                defaultRaise2.complete();
                arrow.core.EmptyValue emptyValue3 = arrow.core.EmptyValue.INSTANCE;
                java.lang.Object obj4 = atomicReference2.get();
                return obj4 == arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(depositFulfillmentResult) : new arrow.core.Ior.Both(obj4, depositFulfillmentResult);
            }
        }
        addMoneyRepositoryImpl$processDepositFulfillment$1 = new com.paypal.oslo.feature.wallet.fifo.addmoney.data.repository.AddMoneyRepositoryImpl$processDepositFulfillment$1(this, continuation);
        com.paypal.oslo.feature.wallet.fifo.addmoney.data.repository.AddMoneyRepositoryImpl$processDepositFulfillment$1 addMoneyRepositoryImpl$processDepositFulfillment$122 = addMoneyRepositoryImpl$processDepositFulfillment$1;
        java.lang.Object obj22 = addMoneyRepositoryImpl$processDepositFulfillment$122.isOutputSupportedFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = addMoneyRepositoryImpl$processDepositFulfillment$122.getOutputStallDurationlomOqCM;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj22;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both);
        com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.wallet.LoggerKt.log;
        kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
        pairArr2[0] = kotlin.TuplesKt.to("hasData", java.lang.String.valueOf(graphQLData2.getData() == null));
        com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.Data data22 = (com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.Data) graphQLData2.getData();
        pairArr2[1] = kotlin.TuplesKt.to("hasAddDeposit", java.lang.String.valueOf((data22 == null ? data22.getAddDeposit() : null) == null));
        com.paypal.android.logger.Logger.d$default(logger2, "Raw GraphQL mutation response received", kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
        data = (com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.Data) graphQLData2.getData();
        if (data != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00fd A[Catch: all -> 0x005f, RaiseCancellationException -> 0x0062, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x0062, all -> 0x005f, blocks: (B:11:0x005a, B:12:0x00f7, B:15:0x00fd, B:16:0x0134, B:19:0x0148, B:21:0x015d, B:24:0x0168, B:26:0x0189, B:29:0x0191, B:31:0x01ba, B:34:0x01c2, B:44:0x0116, B:45:0x012e, B:46:0x0133), top: B:10:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x015d A[Catch: all -> 0x005f, RaiseCancellationException -> 0x0062, TryCatch #3 {RaiseCancellationException -> 0x0062, all -> 0x005f, blocks: (B:11:0x005a, B:12:0x00f7, B:15:0x00fd, B:16:0x0134, B:19:0x0148, B:21:0x015d, B:24:0x0168, B:26:0x0189, B:29:0x0191, B:31:0x01ba, B:34:0x01c2, B:44:0x0116, B:45:0x012e, B:46:0x0133), top: B:10:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0189 A[Catch: all -> 0x005f, RaiseCancellationException -> 0x0062, TryCatch #3 {RaiseCancellationException -> 0x0062, all -> 0x005f, blocks: (B:11:0x005a, B:12:0x00f7, B:15:0x00fd, B:16:0x0134, B:19:0x0148, B:21:0x015d, B:24:0x0168, B:26:0x0189, B:29:0x0191, B:31:0x01ba, B:34:0x01c2, B:44:0x0116, B:45:0x012e, B:46:0x0133), top: B:10:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01ba A[Catch: all -> 0x005f, RaiseCancellationException -> 0x0062, TryCatch #3 {RaiseCancellationException -> 0x0062, all -> 0x005f, blocks: (B:11:0x005a, B:12:0x00f7, B:15:0x00fd, B:16:0x0134, B:19:0x0148, B:21:0x015d, B:24:0x0168, B:26:0x0189, B:29:0x0191, B:31:0x01ba, B:34:0x01c2, B:44:0x0116, B:45:0x012e, B:46:0x0133), top: B:10:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01c2 A[Catch: all -> 0x005f, RaiseCancellationException -> 0x0062, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x0062, all -> 0x005f, blocks: (B:11:0x005a, B:12:0x00f7, B:15:0x00fd, B:16:0x0134, B:19:0x0148, B:21:0x015d, B:24:0x0168, B:26:0x0189, B:29:0x0191, B:31:0x01ba, B:34:0x01c2, B:44:0x0116, B:45:0x012e, B:46:0x0133), top: B:10:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.paypal.oslo.feature.wallet.fifo.addmoney.domain.repository.AddMoneyRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object isAutoReloadEnabled(com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.AutoReloadScheduleType autoReloadScheduleType, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.wallet.fifo.addmoney.data.repository.AddMoneyRepositoryImpl$isAutoReloadEnabled$1 addMoneyRepositoryImpl$isAutoReloadEnabled$1;
        int i;
        kotlin.jvm.functions.Function2 function2;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        arrow.core.raise.DefaultRaise defaultRaise;
        java.util.concurrent.atomic.AtomicReference atomicReference2;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.IorRaise iorRaise;
        java.lang.Object obj;
        arrow.core.Ior.Both both;
        com.paypal.oslo.feature.wallet.graphql.IsAutoReloadEnabledQuery.Data data;
        if (continuation instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.data.repository.AddMoneyRepositoryImpl$isAutoReloadEnabled$1) {
            addMoneyRepositoryImpl$isAutoReloadEnabled$1 = (com.paypal.oslo.feature.wallet.fifo.addmoney.data.repository.AddMoneyRepositoryImpl$isAutoReloadEnabled$1) continuation;
            if ((addMoneyRepositoryImpl$isAutoReloadEnabled$1.getOutputMinFrameDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                addMoneyRepositoryImpl$isAutoReloadEnabled$1.getOutputMinFrameDurationlomOqCM -= 2147483648;
                com.paypal.oslo.feature.wallet.fifo.addmoney.data.repository.AddMoneyRepositoryImpl$isAutoReloadEnabled$1 addMoneyRepositoryImpl$isAutoReloadEnabled$12 = addMoneyRepositoryImpl$isAutoReloadEnabled$1;
                java.lang.Object obj2 = addMoneyRepositoryImpl$isAutoReloadEnabled$12.getValidOutputFormatsForInputhNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = addMoneyRepositoryImpl$isAutoReloadEnabled$12.getOutputMinFrameDurationlomOqCM;
                boolean z = true;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.data.repository.AddMoneyRepositoryImpl$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                            return com.paypal.oslo.feature.wallet.fifo.addmoney.data.repository.AddMoneyRepositoryImpl.$r8$lambda$JSzLjb17y4au8OG4ILrlJTiidVE((com.paypal.oslo.core.network.graphql.error.CallError) obj3, (com.paypal.oslo.core.network.graphql.error.CallError) obj4);
                        }
                    };
                    atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        arrow.core.raise.IorRaise iorRaise2 = new arrow.core.raise.IorRaise(function2, atomicReference, defaultRaise3);
                        com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadInput balanceAutoReloadInput = com.paypal.oslo.feature.wallet.fifo.addmoney.data.mapper.AutoReloadEnabledMapperKt.toBalanceAutoReloadInput(autoReloadScheduleType);
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Checking if auto-reload is enabled", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("scheduleType", autoReloadScheduleType.name())), null, 4, null);
                        com.paypal.oslo.feature.wallet.graphql.IsAutoReloadEnabledQuery isAutoReloadEnabledQuery = new com.paypal.oslo.feature.wallet.graphql.IsAutoReloadEnabledQuery(balanceAutoReloadInput);
                        addMoneyRepositoryImpl$isAutoReloadEnabled$12.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(autoReloadScheduleType);
                        addMoneyRepositoryImpl$isAutoReloadEnabled$12.getInputFormats = function2;
                        addMoneyRepositoryImpl$isAutoReloadEnabled$12.getInputSizeshNQ4ISI = atomicReference;
                        addMoneyRepositoryImpl$isAutoReloadEnabled$12.getHighSpeedVideoSizesFor = defaultRaise;
                        addMoneyRepositoryImpl$isAutoReloadEnabled$12.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        addMoneyRepositoryImpl$isAutoReloadEnabled$12.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iorRaise2);
                        addMoneyRepositoryImpl$isAutoReloadEnabled$12.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(balanceAutoReloadInput);
                        addMoneyRepositoryImpl$isAutoReloadEnabled$12.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(isAutoReloadEnabledQuery);
                        addMoneyRepositoryImpl$isAutoReloadEnabled$12.getOutputSizeshNQ4ISI = iorRaise2;
                        addMoneyRepositoryImpl$isAutoReloadEnabled$12.getHighResolutionOutputSizeshNQ4ISI = 0;
                        addMoneyRepositoryImpl$isAutoReloadEnabled$12.Camera2StreamConfigurationMap = 0;
                        addMoneyRepositoryImpl$isAutoReloadEnabled$12.getHighSpeedVideoFpsRangesFor = 0;
                        addMoneyRepositoryImpl$isAutoReloadEnabled$12.getHighSpeedVideoFpsRanges = 0;
                        addMoneyRepositoryImpl$isAutoReloadEnabled$12.getHighSpeedVideoSizes = 0;
                        addMoneyRepositoryImpl$isAutoReloadEnabled$12.getOutputMinFrameDurationlomOqCM = 1;
                        obj2 = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.getHighSpeedVideoFpsRangesFor, isAutoReloadEnabledQuery, (com.paypal.oslo.core.network.graphql.CallConfig) null, addMoneyRepositoryImpl$isAutoReloadEnabled$12, 2, (java.lang.Object) null);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        atomicReference2 = atomicReference;
                        defaultRaise2 = defaultRaise;
                        iorRaise = iorRaise2;
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
                    int i2 = addMoneyRepositoryImpl$isAutoReloadEnabled$12.getHighSpeedVideoSizes;
                    int i3 = addMoneyRepositoryImpl$isAutoReloadEnabled$12.getHighSpeedVideoFpsRanges;
                    int i4 = addMoneyRepositoryImpl$isAutoReloadEnabled$12.getHighSpeedVideoFpsRangesFor;
                    int i5 = addMoneyRepositoryImpl$isAutoReloadEnabled$12.Camera2StreamConfigurationMap;
                    int i6 = addMoneyRepositoryImpl$isAutoReloadEnabled$12.getHighResolutionOutputSizeshNQ4ISI;
                    iorRaise = (arrow.core.raise.IorRaise) addMoneyRepositoryImpl$isAutoReloadEnabled$12.getOutputSizeshNQ4ISI;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) addMoneyRepositoryImpl$isAutoReloadEnabled$12.getHighSpeedVideoSizesFor;
                    atomicReference2 = (java.util.concurrent.atomic.AtomicReference) addMoneyRepositoryImpl$isAutoReloadEnabled$12.getInputSizeshNQ4ISI;
                    kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) addMoneyRepositoryImpl$isAutoReloadEnabled$12.getInputFormats;
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
                    both = new arrow.core.Ior.Left((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue());
                } else if (!(both instanceof arrow.core.Ior.Right)) {
                    if (!(both instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    both = new arrow.core.Ior.Both((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) both).getLeftValue(), ((arrow.core.Ior.Both) both).getRightValue());
                }
                com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both);
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.wallet.LoggerKt.log;
                kotlin.Pair[] pairArr = new kotlin.Pair[2];
                pairArr[0] = kotlin.TuplesKt.to("hasData", java.lang.String.valueOf(graphQLData.getData() == null));
                com.paypal.oslo.feature.wallet.graphql.IsAutoReloadEnabledQuery.Data data2 = (com.paypal.oslo.feature.wallet.graphql.IsAutoReloadEnabledQuery.Data) graphQLData.getData();
                pairArr[1] = kotlin.TuplesKt.to("hasThreshold", java.lang.String.valueOf((data2 == null ? data2.getThreshold() : null) == null));
                com.paypal.android.logger.Logger.d$default(logger, "Raw GraphQL response received", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                data = (com.paypal.oslo.feature.wallet.graphql.IsAutoReloadEnabledQuery.Data) graphQLData.getData();
                if ((data != null ? data.getThreshold() : null) != null) {
                    z = false;
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Auto-reload enabled check complete", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("isEnabled", java.lang.String.valueOf(z))), null, 4, null);
                java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
                defaultRaise2.complete();
                arrow.core.EmptyValue emptyValue3 = arrow.core.EmptyValue.INSTANCE;
                java.lang.Object obj3 = atomicReference2.get();
                return obj3 != arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(boxBoolean) : new arrow.core.Ior.Both(obj3, boxBoolean);
            }
        }
        addMoneyRepositoryImpl$isAutoReloadEnabled$1 = new com.paypal.oslo.feature.wallet.fifo.addmoney.data.repository.AddMoneyRepositoryImpl$isAutoReloadEnabled$1(this, continuation);
        com.paypal.oslo.feature.wallet.fifo.addmoney.data.repository.AddMoneyRepositoryImpl$isAutoReloadEnabled$1 addMoneyRepositoryImpl$isAutoReloadEnabled$122 = addMoneyRepositoryImpl$isAutoReloadEnabled$1;
        java.lang.Object obj22 = addMoneyRepositoryImpl$isAutoReloadEnabled$122.getValidOutputFormatsForInputhNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = addMoneyRepositoryImpl$isAutoReloadEnabled$122.getOutputMinFrameDurationlomOqCM;
        boolean z2 = true;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj22;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both);
        com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.wallet.LoggerKt.log;
        kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
        pairArr2[0] = kotlin.TuplesKt.to("hasData", java.lang.String.valueOf(graphQLData2.getData() == null));
        com.paypal.oslo.feature.wallet.graphql.IsAutoReloadEnabledQuery.Data data22 = (com.paypal.oslo.feature.wallet.graphql.IsAutoReloadEnabledQuery.Data) graphQLData2.getData();
        pairArr2[1] = kotlin.TuplesKt.to("hasThreshold", java.lang.String.valueOf((data22 == null ? data22.getThreshold() : null) == null));
        com.paypal.android.logger.Logger.d$default(logger2, "Raw GraphQL response received", kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
        data = (com.paypal.oslo.feature.wallet.graphql.IsAutoReloadEnabledQuery.Data) graphQLData2.getData();
        if ((data != null ? data.getThreshold() : null) != null) {
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Auto-reload enabled check complete", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("isEnabled", java.lang.String.valueOf(z2))), null, 4, null);
        java.lang.Boolean boxBoolean2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z2);
        defaultRaise2.complete();
        arrow.core.EmptyValue emptyValue32 = arrow.core.EmptyValue.INSTANCE;
        java.lang.Object obj32 = atomicReference2.get();
        if (obj32 != arrow.core.EmptyValue.INSTANCE) {
        }
    }

    /* renamed from: $r8$lambda$66oHlgLQ90vn3-3rx6iiQJPl6HY, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionError m21256$r8$lambda$66oHlgLQ90vn33rx6iiQJPl6HY(com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionError balanceDepositSelectionError, com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionError balanceDepositSelectionError2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceDepositSelectionError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceDepositSelectionError2, "");
        return balanceDepositSelectionError;
    }

    public static /* synthetic */ com.paypal.oslo.core.network.graphql.error.CallError $r8$lambda$JSzLjb17y4au8OG4ILrlJTiidVE(com.paypal.oslo.core.network.graphql.error.CallError callError, com.paypal.oslo.core.network.graphql.error.CallError callError2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError2, "");
        return callError;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentError $r8$lambda$Qs0xym6n5o0H_d80lWNBhuY_ya0(com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentError depositFulfillmentError, com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentError depositFulfillmentError2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(depositFulfillmentError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(depositFulfillmentError2, "");
        return depositFulfillmentError;
    }
}
