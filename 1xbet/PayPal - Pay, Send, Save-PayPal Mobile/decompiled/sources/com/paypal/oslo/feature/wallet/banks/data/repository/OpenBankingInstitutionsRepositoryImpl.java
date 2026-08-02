package com.paypal.oslo.feature.wallet.banks.data.repository;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\t*\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/data/repository/OpenBankingInstitutionsRepositoryImpl;", "Lcom/paypal/oslo/feature/wallet/banks/domain/repository/OpenBankingInstitutionsRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/OpenBankingInstitutionsParams;", "params", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/OpenBankingInstitutionsError;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/OpenBankingInstitutionsResult;", "searchInstitutions", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/OpenBankingInstitutionsParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/OpenBankingInstitutionsError;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OpenBankingInstitutionsRepositoryImpl implements com.paypal.oslo.feature.wallet.banks.domain.repository.OpenBankingInstitutionsRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public OpenBankingInstitutionsRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoFpsRangesFor = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x017a A[Catch: all -> 0x0064, RaiseCancellationException -> 0x0067, TRY_ENTER, TRY_LEAVE, TryCatch #5 {RaiseCancellationException -> 0x0067, all -> 0x0064, blocks: (B:11:0x005e, B:13:0x0174, B:16:0x017a, B:17:0x01b9, B:20:0x01cc, B:22:0x01e2, B:24:0x01e8, B:27:0x01f3, B:29:0x0216, B:31:0x021c, B:33:0x0224, B:34:0x0265, B:36:0x026b, B:38:0x027f, B:39:0x0288, B:41:0x028e, B:42:0x0297, B:44:0x02a9, B:45:0x02b2, B:47:0x02bc, B:56:0x02cf, B:57:0x02d4, B:59:0x02d5, B:61:0x02e5, B:63:0x02eb, B:66:0x02f3, B:69:0x02d8, B:70:0x02dc, B:76:0x0308, B:78:0x031c, B:80:0x0324, B:82:0x032c, B:83:0x034c, B:92:0x0197, B:93:0x01b3, B:94:0x01b8), top: B:10:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0224 A[Catch: all -> 0x0064, RaiseCancellationException -> 0x0067, TryCatch #5 {RaiseCancellationException -> 0x0067, all -> 0x0064, blocks: (B:11:0x005e, B:13:0x0174, B:16:0x017a, B:17:0x01b9, B:20:0x01cc, B:22:0x01e2, B:24:0x01e8, B:27:0x01f3, B:29:0x0216, B:31:0x021c, B:33:0x0224, B:34:0x0265, B:36:0x026b, B:38:0x027f, B:39:0x0288, B:41:0x028e, B:42:0x0297, B:44:0x02a9, B:45:0x02b2, B:47:0x02bc, B:56:0x02cf, B:57:0x02d4, B:59:0x02d5, B:61:0x02e5, B:63:0x02eb, B:66:0x02f3, B:69:0x02d8, B:70:0x02dc, B:76:0x0308, B:78:0x031c, B:80:0x0324, B:82:0x032c, B:83:0x034c, B:92:0x0197, B:93:0x01b3, B:94:0x01b8), top: B:10:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x032c A[Catch: all -> 0x0064, RaiseCancellationException -> 0x0067, TryCatch #5 {RaiseCancellationException -> 0x0067, all -> 0x0064, blocks: (B:11:0x005e, B:13:0x0174, B:16:0x017a, B:17:0x01b9, B:20:0x01cc, B:22:0x01e2, B:24:0x01e8, B:27:0x01f3, B:29:0x0216, B:31:0x021c, B:33:0x0224, B:34:0x0265, B:36:0x026b, B:38:0x027f, B:39:0x0288, B:41:0x028e, B:42:0x0297, B:44:0x02a9, B:45:0x02b2, B:47:0x02bc, B:56:0x02cf, B:57:0x02d4, B:59:0x02d5, B:61:0x02e5, B:63:0x02eb, B:66:0x02f3, B:69:0x02d8, B:70:0x02dc, B:76:0x0308, B:78:0x031c, B:80:0x0324, B:82:0x032c, B:83:0x034c, B:92:0x0197, B:93:0x01b3, B:94:0x01b8), top: B:10:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0378  */
    @Override // com.paypal.oslo.feature.wallet.banks.domain.repository.OpenBankingInstitutionsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object searchInstitutions(com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingInstitutionsParams openBankingInstitutionsParams, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingInstitutionsError, com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingInstitutionsResult>> continuation) {
        com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingInstitutionsRepositoryImpl$searchInstitutions$1 openBankingInstitutionsRepositoryImpl$searchInstitutions$1;
        int i;
        kotlin.jvm.functions.Function2 function2;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.DefaultRaise defaultRaise3;
        com.apollographql.apollo.api.Optional optional;
        com.apollographql.apollo.api.Optional optional2;
        java.lang.String str;
        com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingInstitutionsParams openBankingInstitutionsParams2;
        arrow.core.raise.IorRaise iorRaise;
        arrow.core.raise.DefaultRaise defaultRaise4;
        java.util.concurrent.atomic.AtomicReference atomicReference2;
        arrow.core.raise.IorRaise iorRaise2;
        java.lang.Object obj;
        arrow.core.Ior.Both both;
        java.util.List<com.paypal.oslo.feature.wallet.graphql.OpenBankingInstitutionsQuery.Item> items;
        com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType;
        java.lang.String str2;
        com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType2;
        com.paypal.oslo.feature.wallet.graphql.OpenBankingInstitutionsQuery.OpenBankingInstitutions openBankingInstitutions;
        com.paypal.oslo.feature.wallet.graphql.OpenBankingInstitutionsQuery.OpenBankingInstitutions openBankingInstitutions2;
        if (continuation instanceof com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingInstitutionsRepositoryImpl$searchInstitutions$1) {
            openBankingInstitutionsRepositoryImpl$searchInstitutions$1 = (com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingInstitutionsRepositoryImpl$searchInstitutions$1) continuation;
            if ((openBankingInstitutionsRepositoryImpl$searchInstitutions$1.getOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                openBankingInstitutionsRepositoryImpl$searchInstitutions$1.getOutputSizeshNQ4ISI -= 2147483648;
                com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingInstitutionsRepositoryImpl$searchInstitutions$1 openBankingInstitutionsRepositoryImpl$searchInstitutions$12 = openBankingInstitutionsRepositoryImpl$searchInstitutions$1;
                java.lang.Object obj2 = openBankingInstitutionsRepositoryImpl$searchInstitutions$12.toString;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = openBankingInstitutionsRepositoryImpl$searchInstitutions$12.getOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingInstitutionsRepositoryImpl$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                            return com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingInstitutionsRepositoryImpl.$r8$lambda$9GZHtEKURxlGcvTHvL6XO1_HznQ((com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingInstitutionsError) obj3, (com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingInstitutionsError) obj4);
                        }
                    };
                    atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
                    arrow.core.raise.DefaultRaise defaultRaise5 = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise6 = defaultRaise5;
                        arrow.core.raise.IorRaise iorRaise3 = new arrow.core.raise.IorRaise(function2, atomicReference, defaultRaise6);
                        com.paypal.oslo.api.graphql.schema.type.BankAggregatorName safeValueOf = com.paypal.oslo.api.graphql.schema.type.BankAggregatorName.INSTANCE.safeValueOf(openBankingInstitutionsParams.getAggregatorName());
                        java.lang.String searchQuery = openBankingInstitutionsParams.getSearchQuery();
                        if (searchQuery == null || (optional = com.apollographql.apollo.api.Optional.INSTANCE.present(searchQuery)) == null) {
                            optional = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
                        }
                        com.apollographql.apollo.api.Optional optional3 = optional;
                        java.lang.Integer maxResults = openBankingInstitutionsParams.getMaxResults();
                        if (maxResults == null || (optional2 = com.apollographql.apollo.api.Optional.INSTANCE.present(java.lang.Integer.valueOf(maxResults.intValue()))) == null) {
                            optional2 = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
                        }
                        com.paypal.oslo.api.graphql.schema.type.OpenBankingInstitutionsInput openBankingInstitutionsInput = new com.paypal.oslo.api.graphql.schema.type.OpenBankingInstitutionsInput(safeValueOf, optional3, optional2, null, 8, null);
                        com.paypal.oslo.feature.wallet.graphql.OpenBankingInstitutionsQuery openBankingInstitutionsQuery = new com.paypal.oslo.feature.wallet.graphql.OpenBankingInstitutionsQuery(openBankingInstitutionsInput);
                        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.wallet.LoggerKt.log;
                        kotlin.Pair[] pairArr = new kotlin.Pair[3];
                        pairArr[0] = kotlin.TuplesKt.to("aggregatorName", openBankingInstitutionsParams.getAggregatorName());
                        java.lang.String searchQuery2 = openBankingInstitutionsParams.getSearchQuery();
                        if (searchQuery2 == null) {
                            searchQuery2 = "null";
                        }
                        pairArr[1] = kotlin.TuplesKt.to("searchQuery", searchQuery2);
                        java.lang.Integer maxResults2 = openBankingInstitutionsParams.getMaxResults();
                        if (maxResults2 == null || (str = java.lang.String.valueOf(maxResults2.intValue())) == null) {
                            str = "null";
                        }
                        pairArr[2] = kotlin.TuplesKt.to("maxResults", str);
                        com.paypal.android.logger.Logger.d$default(logger, "GraphQL Input being sent", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoFpsRangesFor;
                        com.paypal.oslo.feature.wallet.graphql.OpenBankingInstitutionsQuery openBankingInstitutionsQuery2 = openBankingInstitutionsQuery;
                        openBankingInstitutionsParams2 = openBankingInstitutionsParams;
                        openBankingInstitutionsRepositoryImpl$searchInstitutions$12.getOutputFormats = openBankingInstitutionsParams2;
                        openBankingInstitutionsRepositoryImpl$searchInstitutions$12.getInputSizeshNQ4ISI = function2;
                        openBankingInstitutionsRepositoryImpl$searchInstitutions$12.getInputFormats = atomicReference;
                        openBankingInstitutionsRepositoryImpl$searchInstitutions$12.getOutputMinFrameDuration = defaultRaise5;
                        openBankingInstitutionsRepositoryImpl$searchInstitutions$12.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise6);
                        openBankingInstitutionsRepositoryImpl$searchInstitutions$12.getOutputStallDuration = iorRaise3;
                        openBankingInstitutionsRepositoryImpl$searchInstitutions$12.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(openBankingInstitutionsInput);
                        openBankingInstitutionsRepositoryImpl$searchInstitutions$12.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(openBankingInstitutionsQuery);
                        openBankingInstitutionsRepositoryImpl$searchInstitutions$12.getOutputSizes = iorRaise3;
                        openBankingInstitutionsRepositoryImpl$searchInstitutions$12.getHighResolutionOutputSizeshNQ4ISI = 0;
                        openBankingInstitutionsRepositoryImpl$searchInstitutions$12.Camera2StreamConfigurationMap = 0;
                        openBankingInstitutionsRepositoryImpl$searchInstitutions$12.getHighSpeedVideoFpsRanges = 0;
                        openBankingInstitutionsRepositoryImpl$searchInstitutions$12.getHighSpeedVideoSizes = 0;
                        openBankingInstitutionsRepositoryImpl$searchInstitutions$12.getHighSpeedVideoFpsRangesFor = 0;
                        openBankingInstitutionsRepositoryImpl$searchInstitutions$12.getOutputSizeshNQ4ISI = 1;
                        defaultRaise = defaultRaise5;
                        try {
                            java.lang.Object execute$default = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, openBankingInstitutionsQuery2, (com.paypal.oslo.core.network.graphql.CallConfig) null, openBankingInstitutionsRepositoryImpl$searchInstitutions$12, 2, (java.lang.Object) null);
                            if (execute$default == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            iorRaise = iorRaise3;
                            defaultRaise4 = defaultRaise;
                            atomicReference2 = atomicReference;
                            obj2 = execute$default;
                            iorRaise2 = iorRaise;
                        } catch (arrow.core.raise.RaiseCancellationException e) {
                            e = e;
                            defaultRaise3 = defaultRaise;
                            defaultRaise3.complete();
                            java.lang.Object raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise3);
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
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise5;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise5;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = openBankingInstitutionsRepositoryImpl$searchInstitutions$12.getHighSpeedVideoFpsRangesFor;
                    int i3 = openBankingInstitutionsRepositoryImpl$searchInstitutions$12.getHighSpeedVideoSizes;
                    int i4 = openBankingInstitutionsRepositoryImpl$searchInstitutions$12.getHighSpeedVideoFpsRanges;
                    int i5 = openBankingInstitutionsRepositoryImpl$searchInstitutions$12.Camera2StreamConfigurationMap;
                    int i6 = openBankingInstitutionsRepositoryImpl$searchInstitutions$12.getHighResolutionOutputSizeshNQ4ISI;
                    iorRaise = (arrow.core.raise.IorRaise) openBankingInstitutionsRepositoryImpl$searchInstitutions$12.getOutputSizes;
                    iorRaise2 = (arrow.core.raise.IorRaise) openBankingInstitutionsRepositoryImpl$searchInstitutions$12.getOutputStallDuration;
                    defaultRaise4 = (arrow.core.raise.DefaultRaise) openBankingInstitutionsRepositoryImpl$searchInstitutions$12.getOutputMinFrameDuration;
                    atomicReference2 = (java.util.concurrent.atomic.AtomicReference) openBankingInstitutionsRepositoryImpl$searchInstitutions$12.getInputFormats;
                    kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) openBankingInstitutionsRepositoryImpl$searchInstitutions$12.getInputSizeshNQ4ISI;
                    com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingInstitutionsParams openBankingInstitutionsParams3 = (com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingInstitutionsParams) openBankingInstitutionsRepositoryImpl$searchInstitutions$12.getOutputFormats;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        openBankingInstitutionsParams2 = openBankingInstitutionsParams3;
                    } catch (arrow.core.raise.RaiseCancellationException e3) {
                        e = e3;
                        defaultRaise3 = defaultRaise4;
                        atomicReference = atomicReference2;
                        function2 = function22;
                        defaultRaise3.complete();
                        java.lang.Object raisedOrRethrow2 = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise3);
                        arrow.core.EmptyValue emptyValue2 = arrow.core.EmptyValue.INSTANCE;
                        obj = atomicReference.get();
                        if (obj != arrow.core.EmptyValue.INSTANCE) {
                        }
                        return new arrow.core.Ior.Left(raisedOrRethrow2);
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        defaultRaise2 = defaultRaise4;
                        defaultRaise2.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                both = (arrow.core.Ior) obj2;
                if (!(both instanceof arrow.core.Ior.Left)) {
                    both = new arrow.core.Ior.Left(getHighSpeedVideoFpsRanges((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue()));
                } else if (!(both instanceof arrow.core.Ior.Right)) {
                    if (!(both instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    both = new arrow.core.Ior.Both(getHighSpeedVideoFpsRanges((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) both).getLeftValue()), ((arrow.core.Ior.Both) both).getRightValue());
                }
                com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both);
                com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.wallet.LoggerKt.log;
                kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
                pairArr2[0] = kotlin.TuplesKt.to("hasData", java.lang.String.valueOf(graphQLData.getData() == null));
                com.paypal.oslo.feature.wallet.graphql.OpenBankingInstitutionsQuery.Data data = (com.paypal.oslo.feature.wallet.graphql.OpenBankingInstitutionsQuery.Data) graphQLData.getData();
                pairArr2[1] = kotlin.TuplesKt.to("hasItems", java.lang.String.valueOf(((data != null || (openBankingInstitutions2 = data.getOpenBankingInstitutions()) == null) ? null : openBankingInstitutions2.getItems()) == null));
                com.paypal.android.logger.Logger.d$default(logger2, "Raw GraphQL response", kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
                com.paypal.oslo.feature.wallet.graphql.OpenBankingInstitutionsQuery.Data data2 = (com.paypal.oslo.feature.wallet.graphql.OpenBankingInstitutionsQuery.Data) graphQLData.getData();
                items = (data2 != null || (openBankingInstitutions = data2.getOpenBankingInstitutions()) == null) ? null : openBankingInstitutions.getItems();
                if (items != null) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "No institutions returned from API", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("aggregatorName", openBankingInstitutionsParams2.getAggregatorName())), null, 4, null);
                    iorRaise2.raise(com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingInstitutionsError.Business.MissingResults.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Search completed successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("aggregatorName", openBankingInstitutionsParams2.getAggregatorName()), kotlin.TuplesKt.to("institutionsCount", java.lang.String.valueOf(items.size()))), null, 4, null);
                java.util.List<com.paypal.oslo.feature.wallet.graphql.OpenBankingInstitutionsQuery.Item> list = items;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                for (com.paypal.oslo.feature.wallet.graphql.OpenBankingInstitutionsQuery.Item item : list) {
                    java.lang.String externalBankId = item.getExternalBankId();
                    java.lang.String bankName = item.getBankName();
                    java.lang.Object inlineLogoUrl = item.getInlineLogoUrl();
                    java.lang.String obj3 = inlineLogoUrl != null ? inlineLogoUrl.toString() : null;
                    java.lang.Object primaryLogoUrl = item.getPrimaryLogoUrl();
                    java.lang.String obj4 = primaryLogoUrl != null ? primaryLogoUrl.toString() : null;
                    java.lang.String obj5 = item.getCountryCode().toString();
                    java.lang.Integer rank = item.getRank();
                    java.lang.Object institutionUrl = item.getInstitutionUrl();
                    java.lang.String obj6 = institutionUrl != null ? institutionUrl.toString() : null;
                    java.lang.String internalInstitutionId = item.getInternalInstitutionId();
                    com.paypal.oslo.api.graphql.schema.type.BankIntegrationType integrationType3 = item.getIntegrationType();
                    if (integrationType3 != null) {
                        int i7 = com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingInstitutionsRepositoryImpl.WhenMappings.$EnumSwitchMapping$0[integrationType3.ordinal()];
                        if (i7 == 1) {
                            integrationType2 = com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType.HOSTED_URL;
                        } else if (i7 == 2) {
                            integrationType2 = com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType.OAUTH2;
                        } else {
                            if (i7 != 3 && i7 != 4) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            integrationType2 = com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType.OAUTH2;
                        }
                        integrationType = integrationType2;
                    } else {
                        integrationType = null;
                    }
                    com.paypal.oslo.api.graphql.schema.type.BankAggregatorName aggregatorName = item.getAggregatorName();
                    if (aggregatorName == null || (str2 = aggregatorName.getRawValue()) == null) {
                        str2 = "UNKNOWN";
                    }
                    arrayList.add(new com.paypal.oslo.feature.wallet.banks.domain.model.FinancialInstitution(externalBankId, bankName, obj3, obj4, obj5, rank, obj6, internalInstitutionId, integrationType, str2, item.getGroupName(), item.getGroupRank()));
                }
                com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingInstitutionsResult openBankingInstitutionsResult = new com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingInstitutionsResult(arrayList);
                defaultRaise4.complete();
                arrow.core.EmptyValue emptyValue3 = arrow.core.EmptyValue.INSTANCE;
                java.lang.Object obj7 = atomicReference2.get();
                return obj7 == arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(openBankingInstitutionsResult) : new arrow.core.Ior.Both(obj7, openBankingInstitutionsResult);
            }
        }
        openBankingInstitutionsRepositoryImpl$searchInstitutions$1 = new com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingInstitutionsRepositoryImpl$searchInstitutions$1(this, continuation);
        com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingInstitutionsRepositoryImpl$searchInstitutions$1 openBankingInstitutionsRepositoryImpl$searchInstitutions$122 = openBankingInstitutionsRepositoryImpl$searchInstitutions$1;
        java.lang.Object obj22 = openBankingInstitutionsRepositoryImpl$searchInstitutions$122.toString;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = openBankingInstitutionsRepositoryImpl$searchInstitutions$122.getOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj22;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both);
        com.paypal.android.logger.Logger logger22 = com.paypal.oslo.feature.wallet.LoggerKt.log;
        kotlin.Pair[] pairArr22 = new kotlin.Pair[2];
        pairArr22[0] = kotlin.TuplesKt.to("hasData", java.lang.String.valueOf(graphQLData2.getData() == null));
        com.paypal.oslo.feature.wallet.graphql.OpenBankingInstitutionsQuery.Data data3 = (com.paypal.oslo.feature.wallet.graphql.OpenBankingInstitutionsQuery.Data) graphQLData2.getData();
        pairArr22[1] = kotlin.TuplesKt.to("hasItems", java.lang.String.valueOf(((data3 != null || (openBankingInstitutions2 = data3.getOpenBankingInstitutions()) == null) ? null : openBankingInstitutions2.getItems()) == null));
        com.paypal.android.logger.Logger.d$default(logger22, "Raw GraphQL response", kotlin.collections.MapsKt.mapOf(pairArr22), null, 4, null);
        com.paypal.oslo.feature.wallet.graphql.OpenBankingInstitutionsQuery.Data data22 = (com.paypal.oslo.feature.wallet.graphql.OpenBankingInstitutionsQuery.Data) graphQLData2.getData();
        if (data22 != null) {
        }
        if (items != null) {
        }
    }

    private static com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingInstitutionsError getHighSpeedVideoFpsRanges(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingInstitutionsError.Network.INSTANCE;
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.util.List<com.paypal.oslo.core.network.graphql.error.GraphQLError> m11659getErrors1X0FAY = ((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(m11659getErrors1X0FAY, 10));
        java.util.Iterator<T> it = m11659getErrors1X0FAY.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.paypal.oslo.core.network.graphql.error.GraphQLError) it.next()).getMessage());
        }
        return new com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingInstitutionsError.Business.PartialDataAvailable(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(arrayList)));
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingInstitutionsError $r8$lambda$9GZHtEKURxlGcvTHvL6XO1_HznQ(com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingInstitutionsError openBankingInstitutionsError, com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingInstitutionsError openBankingInstitutionsError2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openBankingInstitutionsError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openBankingInstitutionsError2, "");
        return openBankingInstitutionsError;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.BankIntegrationType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BankIntegrationType.HOSTED_URL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BankIntegrationType.OAUTH2.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BankIntegrationType.UNKNOWN__.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BankIntegrationType.UNKNOWN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
