package com.paypal.oslo.feature.balance.data.repository.nba;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/balance/data/repository/nba/NbaRepositoryImpl;", "Lcom/paypal/oslo/feature/balance/domain/repository/nba/NbaRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "", "surface", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/balance/api/errors/NbaError;", "", "Lcom/paypal/oslo/feature/balance/domain/model/nba/NbaRecommendation;", "fetchNbaRecommendations", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NbaRepositoryImpl implements com.paypal.oslo.feature.balance.domain.repository.nba.NbaRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoSizes;

    @javax.inject.Inject
    public NbaRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoSizes = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.balance.domain.repository.nba.NbaRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchNbaRecommendations(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.balance.api.errors.NbaError, ? extends java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation>>> continuation) {
        com.paypal.oslo.feature.balance.data.repository.nba.NbaRepositoryImpl$fetchNbaRecommendations$1 nbaRepositoryImpl$fetchNbaRecommendations$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.balance.data.repository.nba.NbaRepositoryImpl$fetchNbaRecommendations$1) {
            nbaRepositoryImpl$fetchNbaRecommendations$1 = (com.paypal.oslo.feature.balance.data.repository.nba.NbaRepositoryImpl$fetchNbaRecommendations$1) continuation;
            if ((nbaRepositoryImpl$fetchNbaRecommendations$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                nbaRepositoryImpl$fetchNbaRecommendations$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = nbaRepositoryImpl$fetchNbaRecommendations$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = nbaRepositoryImpl$fetchNbaRecommendations$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery getBalanceNextBestActionsQuery = new com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery(str, null, null, 6, null);
                    com.apollographql.apollo.ApolloCall query = this.getHighSpeedVideoSizes.query(getBalanceNextBestActionsQuery);
                    nbaRepositoryImpl$fetchNbaRecommendations$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    nbaRepositoryImpl$fetchNbaRecommendations$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getBalanceNextBestActionsQuery);
                    nbaRepositoryImpl$fetchNbaRecommendations$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(query);
                    nbaRepositoryImpl$fetchNbaRecommendations$1.getHighSpeedVideoSizes = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(query, null, nbaRepositoryImpl$fetchNbaRecommendations$1, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.balance.LoggerKt.log;
                    java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(callError.getClass()).getSimpleName();
                    com.paypal.android.logger.Logger.w$default(logger, "Failed to fetch NBA recommendations", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", simpleName != null ? simpleName : "")), null, 4, null);
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.balance.api.errors.NbaError.Network("Failed to fetch NBA recommendations", null));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.Data data = (com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    java.util.List<com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.MoneyManagementNextBestAction> moneyManagementNextBestActions = data != null ? data.getMoneyManagementNextBestActions() : null;
                    java.util.List<com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.MoneyManagementNextBestAction> list = moneyManagementNextBestActions;
                    if (list == null || list.isEmpty()) {
                        return arrow.core.EitherKt.left(com.paypal.oslo.feature.balance.api.errors.NbaError.NoRecommendations.INSTANCE);
                    }
                    java.util.List<com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.MoneyManagementNextBestAction> list2 = moneyManagementNextBestActions;
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                    java.util.Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(com.paypal.oslo.feature.balance.data.repository.nba.NbaRepositoryImplKt.access$toNbaRecommendation((com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.MoneyManagementNextBestAction) it.next()));
                    }
                    return arrow.core.EitherKt.right(arrayList);
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.core.network.graphql.error.CallError callError2 = (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue();
                    com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.Data data2 = (com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData();
                    java.util.List<com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.MoneyManagementNextBestAction> moneyManagementNextBestActions2 = data2 != null ? data2.getMoneyManagementNextBestActions() : null;
                    java.util.List<com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.MoneyManagementNextBestAction> list3 = moneyManagementNextBestActions2;
                    if (list3 == null || list3.isEmpty()) {
                        com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.balance.LoggerKt.log;
                        java.lang.String simpleName2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(callError2.getClass()).getSimpleName();
                        com.paypal.android.logger.Logger.w$default(logger2, "NBA query returned errors with no data", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", simpleName2 != null ? simpleName2 : "")), null, 4, null);
                        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.balance.api.errors.NbaError.Network("NBA query returned errors", null));
                    }
                    java.util.List<com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.MoneyManagementNextBestAction> list4 = moneyManagementNextBestActions2;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10));
                    java.util.Iterator<T> it2 = list4.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(com.paypal.oslo.feature.balance.data.repository.nba.NbaRepositoryImplKt.access$toNbaRecommendation((com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.MoneyManagementNextBestAction) it2.next()));
                    }
                    return arrow.core.EitherKt.right(arrayList2);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        nbaRepositoryImpl$fetchNbaRecommendations$1 = new com.paypal.oslo.feature.balance.data.repository.nba.NbaRepositoryImpl$fetchNbaRecommendations$1(this, continuation);
        java.lang.Object obj2 = nbaRepositoryImpl$fetchNbaRecommendations$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = nbaRepositoryImpl$fetchNbaRecommendations$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }
}
