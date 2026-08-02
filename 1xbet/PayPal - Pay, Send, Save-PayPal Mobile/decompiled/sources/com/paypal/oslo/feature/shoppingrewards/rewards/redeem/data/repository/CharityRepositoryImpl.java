package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.data.repository;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J:\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e0\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/data/repository/CharityRepositoryImpl;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/repository/CharityRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Ldagger/Lazy;)V", "Lcom/paypal/oslo/api/graphql/schema/type/CharityListType;", "listType", "", "limit", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult;", "", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/model/Charity;", "getCharities", "(Lcom/paypal/oslo/api/graphql/schema/type/CharityListType;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Ldagger/Lazy;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CharityRepositoryImpl extends com.paypal.oslo.feature.shoppingrewards.shared.data.repository.BaseRepository implements com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.CharityRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public CharityRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        this.getHighSpeedVideoFpsRangesFor = lazy;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002d, code lost:
    
        if (r10 == null) goto L6;
     */
    @Override // com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.CharityRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getCharities(com.paypal.oslo.api.graphql.schema.type.CharityListType charityListType, java.lang.Integer num, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.Charity>>>> continuation) {
        com.apollographql.apollo.api.Optional optional;
        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.data.repository.CharityRepositoryImpl charityRepositoryImpl = this;
        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoFpsRangesFor.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
        com.apollographql.apollo.ApolloClient apolloClient2 = apolloClient;
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        com.apollographql.apollo.api.Optional.Present present = com.apollographql.apollo.api.Optional.INSTANCE.present(charityListType);
        if (num != null) {
            optional = com.apollographql.apollo.api.Optional.INSTANCE.present(kotlin.coroutines.jvm.internal.Boxing.boxInt(num.intValue()));
        }
        optional = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
        return com.paypal.oslo.feature.shoppingrewards.shared.data.repository.BaseRepository.fetchData$default(charityRepositoryImpl, apolloClient2, new com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery(companion.present(new com.paypal.oslo.api.graphql.schema.type.CharitiesInput(present, null, optional, 2, null))), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.data.repository.CharityRepositoryImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.data.repository.CharityRepositoryImpl.$r8$lambda$kJY_90ELHbeC1cXWeCzB3kbxjwc((com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Data) obj);
            }
        }, null, null, continuation, 12, null);
    }

    public static /* synthetic */ java.util.List $r8$lambda$kJY_90ELHbeC1cXWeCzB3kbxjwc(com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.data.mapper.CharityMapperKt.toCharityList(data);
    }
}
