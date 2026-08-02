package com.paypal.oslo.feature.wallet.banks.data.repository.addbankmanual;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/data/repository/addbankmanual/BankDefinitionsRepositoryImpl;", "Lcom/paypal/oslo/feature/wallet/banks/domain/repository/addbankmanual/BankDefinitionsRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/BankDefinitionsError;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/BankDefinitionsResult;", "getBankDefinitions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/apollographql/apollo/ApolloClient;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BankDefinitionsRepositoryImpl implements com.paypal.oslo.feature.wallet.banks.domain.repository.addbankmanual.BankDefinitionsRepository {
    public static final int $stable = 8;
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public BankDefinitionsRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoFpsRanges = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d6 A[Catch: all -> 0x0057, RaiseCancellationException -> 0x005a, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x005a, all -> 0x0057, blocks: (B:11:0x0052, B:12:0x00d0, B:15:0x00d6, B:16:0x0115, B:18:0x0136, B:20:0x013c, B:22:0x0146, B:23:0x0184, B:24:0x0197, B:26:0x019d, B:27:0x01c8, B:29:0x01ce, B:31:0x020a, B:33:0x0217, B:35:0x022b, B:38:0x0233, B:40:0x015a, B:41:0x023b, B:42:0x0259, B:47:0x00f3, B:48:0x010f, B:49:0x0114), top: B:10:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    @Override // com.paypal.oslo.feature.wallet.banks.domain.repository.addbankmanual.BankDefinitionsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getBankDefinitions(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinitionsError, com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinitionsResult>> continuation) {
        com.paypal.oslo.feature.wallet.banks.data.repository.addbankmanual.BankDefinitionsRepositoryImpl$getBankDefinitions$1 bankDefinitionsRepositoryImpl$getBankDefinitions$1;
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
        com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Data data;
        com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.BankDefinitions bankDefinitions;
        if (continuation instanceof com.paypal.oslo.feature.wallet.banks.data.repository.addbankmanual.BankDefinitionsRepositoryImpl$getBankDefinitions$1) {
            bankDefinitionsRepositoryImpl$getBankDefinitions$1 = (com.paypal.oslo.feature.wallet.banks.data.repository.addbankmanual.BankDefinitionsRepositoryImpl$getBankDefinitions$1) continuation;
            if ((bankDefinitionsRepositoryImpl$getBankDefinitions$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                bankDefinitionsRepositoryImpl$getBankDefinitions$1.getOutputStallDurationlomOqCM -= 2147483648;
                com.paypal.oslo.feature.wallet.banks.data.repository.addbankmanual.BankDefinitionsRepositoryImpl$getBankDefinitions$1 bankDefinitionsRepositoryImpl$getBankDefinitions$12 = bankDefinitionsRepositoryImpl$getBankDefinitions$1;
                java.lang.Object obj2 = bankDefinitionsRepositoryImpl$getBankDefinitions$12.getOutputMinFrameDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bankDefinitionsRepositoryImpl$getBankDefinitions$12.getOutputStallDurationlomOqCM;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.data.repository.addbankmanual.BankDefinitionsRepositoryImpl$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                            return com.paypal.oslo.feature.wallet.banks.data.repository.addbankmanual.BankDefinitionsRepositoryImpl.m20769$r8$lambda$8efLTQhSvs8CYCUnYOycVxOZ2g((com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinitionsError) obj3, (com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinitionsError) obj4);
                        }
                    };
                    atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        arrow.core.raise.IorRaise iorRaise3 = new arrow.core.raise.IorRaise(function2, atomicReference, defaultRaise3);
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Fetching bank definitions for manual add bank", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("tag", "BankDefinitions")), null, 4, null);
                        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoFpsRanges;
                        com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery getAddBankDefinitionsQuery = new com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery();
                        bankDefinitionsRepositoryImpl$getBankDefinitions$12.getInputSizeshNQ4ISI = function2;
                        bankDefinitionsRepositoryImpl$getBankDefinitions$12.getInputFormats = atomicReference;
                        bankDefinitionsRepositoryImpl$getBankDefinitions$12.getOutputMinFrameDuration = defaultRaise;
                        bankDefinitionsRepositoryImpl$getBankDefinitions$12.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        bankDefinitionsRepositoryImpl$getBankDefinitions$12.getOutputFormats = iorRaise3;
                        bankDefinitionsRepositoryImpl$getBankDefinitions$12.getOutputSizes = iorRaise3;
                        bankDefinitionsRepositoryImpl$getBankDefinitions$12.getHighSpeedVideoFpsRanges = 0;
                        bankDefinitionsRepositoryImpl$getBankDefinitions$12.getHighResolutionOutputSizeshNQ4ISI = 0;
                        bankDefinitionsRepositoryImpl$getBankDefinitions$12.getHighSpeedVideoSizes = 0;
                        bankDefinitionsRepositoryImpl$getBankDefinitions$12.getHighSpeedVideoFpsRangesFor = 0;
                        bankDefinitionsRepositoryImpl$getBankDefinitions$12.Camera2StreamConfigurationMap = 0;
                        bankDefinitionsRepositoryImpl$getBankDefinitions$12.getOutputStallDurationlomOqCM = 1;
                        obj2 = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, getAddBankDefinitionsQuery, (com.paypal.oslo.core.network.graphql.CallConfig) null, bankDefinitionsRepositoryImpl$getBankDefinitions$12, 2, (java.lang.Object) null);
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
                    int i2 = bankDefinitionsRepositoryImpl$getBankDefinitions$12.Camera2StreamConfigurationMap;
                    int i3 = bankDefinitionsRepositoryImpl$getBankDefinitions$12.getHighSpeedVideoFpsRangesFor;
                    int i4 = bankDefinitionsRepositoryImpl$getBankDefinitions$12.getHighSpeedVideoSizes;
                    int i5 = bankDefinitionsRepositoryImpl$getBankDefinitions$12.getHighResolutionOutputSizeshNQ4ISI;
                    int i6 = bankDefinitionsRepositoryImpl$getBankDefinitions$12.getHighSpeedVideoFpsRanges;
                    iorRaise = (arrow.core.raise.IorRaise) bankDefinitionsRepositoryImpl$getBankDefinitions$12.getOutputSizes;
                    iorRaise2 = (arrow.core.raise.IorRaise) bankDefinitionsRepositoryImpl$getBankDefinitions$12.getOutputFormats;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) bankDefinitionsRepositoryImpl$getBankDefinitions$12.getOutputMinFrameDuration;
                    atomicReference2 = (java.util.concurrent.atomic.AtomicReference) bankDefinitionsRepositoryImpl$getBankDefinitions$12.getInputFormats;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj2);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise2;
                        atomicReference = atomicReference2;
                        function2 = (kotlin.jvm.functions.Function2) bankDefinitionsRepositoryImpl$getBankDefinitions$12.getInputSizeshNQ4ISI;
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
                    both = new arrow.core.Ior.Left(com.paypal.oslo.feature.wallet.banks.data.error.manualbank.BankDefinitionsErrorMapperKt.toBankDefinitionsError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue()));
                } else if (!(both instanceof arrow.core.Ior.Right)) {
                    if (!(both instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    both = new arrow.core.Ior.Both(com.paypal.oslo.feature.wallet.banks.data.error.manualbank.BankDefinitionsErrorMapperKt.toBankDefinitionsError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) both).getLeftValue()), ((arrow.core.Ior.Both) both).getRightValue());
                }
                com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both);
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "GraphQL response received", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("tag", "BankDefinitions")), null, 4, null);
                data = (com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Data) graphQLData.getData();
                if (data != null || (bankDefinitions = data.getBankDefinitions()) == null) {
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Bank definitions data is null in response", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("tag", "BankDefinitions")), null, null, 12, null);
                    iorRaise2.raise(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinitionsError.Business.MissingDefinitions.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                java.util.List<com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Item> items = bankDefinitions.getItems();
                if (items.isEmpty()) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Bank definitions returned empty list", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("tag", "BankDefinitions")), null, 4, null);
                } else {
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.wallet.LoggerKt.log;
                    int size = items.size();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Successfully fetched ");
                    sb.append(size);
                    sb.append(" bank definition(s)");
                    com.paypal.android.logger.Logger.i$default(logger, sb.toString(), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("tag", "BankDefinitions")), null, 4, null);
                }
                java.util.List<com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Item> list = items;
                int i7 = 10;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                for (com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Item item : list) {
                    java.lang.String obj3 = item.getCurrencyCode().toString();
                    com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDataFormatType domain = com.paypal.oslo.feature.wallet.banks.data.repository.addbankmanual.BankDataFormatMapperKt.toDomain(item.getDataFormat());
                    java.util.List<com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Input> inputs = item.getInputs();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(inputs, i7));
                    for (com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Input input : inputs) {
                        arrayList2.add(new com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankInputField(input.getName(), input.getGroup(), input.getMaximumLength(), input.getMinimumLength(), input.getPrepopulatedValues(), null, input.getRegex(), input.getRequired(), 32, null));
                    }
                    arrayList.add(new com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinition(obj3, domain, arrayList2));
                    i7 = 10;
                }
                com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinitionsResult bankDefinitionsResult = new com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinitionsResult(arrayList);
                defaultRaise2.complete();
                arrow.core.EmptyValue emptyValue3 = arrow.core.EmptyValue.INSTANCE;
                java.lang.Object obj4 = atomicReference2.get();
                return obj4 == arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(bankDefinitionsResult) : new arrow.core.Ior.Both(obj4, bankDefinitionsResult);
            }
        }
        bankDefinitionsRepositoryImpl$getBankDefinitions$1 = new com.paypal.oslo.feature.wallet.banks.data.repository.addbankmanual.BankDefinitionsRepositoryImpl$getBankDefinitions$1(this, continuation);
        com.paypal.oslo.feature.wallet.banks.data.repository.addbankmanual.BankDefinitionsRepositoryImpl$getBankDefinitions$1 bankDefinitionsRepositoryImpl$getBankDefinitions$122 = bankDefinitionsRepositoryImpl$getBankDefinitions$1;
        java.lang.Object obj22 = bankDefinitionsRepositoryImpl$getBankDefinitions$122.getOutputMinFrameDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bankDefinitionsRepositoryImpl$getBankDefinitions$122.getOutputStallDurationlomOqCM;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj22;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both);
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "GraphQL response received", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("tag", "BankDefinitions")), null, 4, null);
        data = (com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Data) graphQLData2.getData();
        if (data != null) {
        }
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Bank definitions data is null in response", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("tag", "BankDefinitions")), null, null, 12, null);
        iorRaise2.raise(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinitionsError.Business.MissingDefinitions.INSTANCE);
        throw new kotlin.KotlinNothingValueException();
    }

    /* renamed from: $r8$lambda$8efLTQhSvs8CYCUnYO-ycVxOZ2g, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinitionsError m20769$r8$lambda$8efLTQhSvs8CYCUnYOycVxOZ2g(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinitionsError bankDefinitionsError, com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinitionsError bankDefinitionsError2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankDefinitionsError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankDefinitionsError2, "");
        return bankDefinitionsError;
    }
}
