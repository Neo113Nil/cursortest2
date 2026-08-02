package com.paypal.oslo.feature.contacts.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0005H\n"}, d2 = {"<anonymous>", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/contacts/api/RecentSearchError;", "", "Lcom/paypal/oslo/feature/contacts/api/RecentSearch;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.contacts.data.repository.RecentSearchesRepositoryImpl$getRecentSearches$2", f = "RecentSearchRepositoryImpls.kt", i = {0, 0}, l = {59}, m = "invokeSuspend", n = {"input", "query"}, nl = {60}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class RecentSearchesRepositoryImpl$getRecentSearches$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.contacts.api.RecentSearchError, ? extends java.util.List<? extends com.paypal.oslo.feature.contacts.api.RecentSearch>>>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.contacts.data.repository.RecentSearchesRepositoryImpl getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.contacts.api.NetworkType getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper contactDomainModelMapper;
        dagger.Lazy lazy;
        com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.RecentSearches recentSearches;
        java.util.List<com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.RecentSearch> recentSearches2;
        com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper contactDomainModelMapper2;
        com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.RecentSearches recentSearches3;
        java.util.List<com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.RecentSearch> recentSearches4;
        com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper contactDomainModelMapper3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            contactDomainModelMapper = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            com.paypal.oslo.api.graphql.schema.type.RecentSearchesInput recentSearchesInput = new com.paypal.oslo.api.graphql.schema.type.RecentSearchesInput(contactDomainModelMapper.mapNetworkTypeToGraphQL(this.getHighSpeedVideoFpsRanges));
            com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery getContactsRecentSearchesQuery = new com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery(recentSearchesInput);
            lazy = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
            java.lang.Object obj2 = lazy.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(recentSearchesInput);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getContactsRecentSearchesQuery);
            this.Camera2StreamConfigurationMap = 1;
            obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default((com.apollographql.apollo.ApolloClient) obj2, getContactsRecentSearchesQuery, (com.paypal.oslo.core.network.graphql.CallConfig) null, this, 2, (java.lang.Object) null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Ior ior = (arrow.core.Ior) obj;
        com.paypal.oslo.feature.contacts.data.repository.RecentSearchesRepositoryImpl recentSearchesRepositoryImpl = this.getHighResolutionOutputSizeshNQ4ISI;
        if (ior instanceof arrow.core.Ior.Left) {
            return new arrow.core.Ior.Left(com.paypal.oslo.feature.contacts.data.repository.RecentSearchesRepositoryImpl.access$toRecentSearchError(recentSearchesRepositoryImpl, (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
        }
        java.util.ArrayList arrayList = null;
        if (ior instanceof arrow.core.Ior.Right) {
            com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.Data data = (com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
            if (data != null && (recentSearches3 = data.getRecentSearches()) != null && (recentSearches4 = recentSearches3.getRecentSearches()) != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.RecentSearch recentSearch : recentSearches4) {
                    contactDomainModelMapper3 = recentSearchesRepositoryImpl.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.contacts.api.RecentSearch mapRecentSearch = contactDomainModelMapper3.mapRecentSearch(recentSearch);
                    if (mapRecentSearch != null) {
                        arrayList2.add(mapRecentSearch);
                    }
                }
                arrayList = arrayList2;
            }
            if (arrayList == null) {
                arrayList = kotlin.collections.CollectionsKt.emptyList();
            }
            return new arrow.core.Ior.Right(arrayList);
        }
        if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue();
            com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.Data data2 = (com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData();
            if (data2 != null && (recentSearches = data2.getRecentSearches()) != null && (recentSearches2 = recentSearches.getRecentSearches()) != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.RecentSearch recentSearch2 : recentSearches2) {
                    contactDomainModelMapper2 = recentSearchesRepositoryImpl.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.contacts.api.RecentSearch mapRecentSearch2 = contactDomainModelMapper2.mapRecentSearch(recentSearch2);
                    if (mapRecentSearch2 != null) {
                        arrayList3.add(mapRecentSearch2);
                    }
                }
                arrayList = arrayList3;
            }
            com.paypal.oslo.feature.contacts.api.RecentSearchError access$toRecentSearchError = com.paypal.oslo.feature.contacts.data.repository.RecentSearchesRepositoryImpl.access$toRecentSearchError(recentSearchesRepositoryImpl, callError);
            if (arrayList == null) {
                arrayList = kotlin.collections.CollectionsKt.emptyList();
            }
            return new arrow.core.Ior.Both(access$toRecentSearchError, arrayList);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.contacts.api.RecentSearchError, ? extends java.util.List<? extends com.paypal.oslo.feature.contacts.api.RecentSearch>>> continuation) {
        return ((com.paypal.oslo.feature.contacts.data.repository.RecentSearchesRepositoryImpl$getRecentSearches$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.contacts.data.repository.RecentSearchesRepositoryImpl$getRecentSearches$2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecentSearchesRepositoryImpl$getRecentSearches$2(com.paypal.oslo.feature.contacts.data.repository.RecentSearchesRepositoryImpl recentSearchesRepositoryImpl, com.paypal.oslo.feature.contacts.api.NetworkType networkType, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.contacts.data.repository.RecentSearchesRepositoryImpl$getRecentSearches$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = recentSearchesRepositoryImpl;
        this.getHighSpeedVideoFpsRanges = networkType;
    }
}
