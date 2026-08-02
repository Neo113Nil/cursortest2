package com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.data.repository;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/data/repository/CategorySelectionRepositoryImpl;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/repository/CategorySelectionRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Ldagger/Lazy;)V", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/repository/CategorySelectionRepository$CategorySelectionGraphQLRequest;", "input", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/models/CategorySelectionResponse;", "getSelectionCategories", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/repository/CategorySelectionRepository$CategorySelectionGraphQLRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Ldagger/Lazy;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CategorySelectionRepositoryImpl extends com.paypal.oslo.feature.shoppingrewards.shared.data.repository.BaseRepository implements com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.repository.CategorySelectionRepository {
    public static final int $stable = 8;
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    @javax.inject.Inject
    public CategorySelectionRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        this.getHighSpeedVideoSizes = lazy;
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.repository.CategorySelectionRepository
    public final java.lang.Object getSelectionCategories(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.repository.CategorySelectionRepository.CategorySelectionGraphQLRequest categorySelectionGraphQLRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.CategorySelectionResponse>>> continuation) {
        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoSizes.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
        return com.paypal.oslo.feature.shoppingrewards.shared.data.repository.BaseRepository.fetchData$default(this, apolloClient, new com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery(new com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput(com.paypal.oslo.feature.shoppingrewards.rewards.common.utils.RewardsTouchpoints.CATEGORY_OFFERS, com.paypal.oslo.api.graphql.schema.type.PromotionPlatform.ANDROID, null, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null)), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.data.repository.CategorySelectionRepositoryImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.data.repository.CategorySelectionRepositoryImpl.m19382$r8$lambda$9djyrqsTV4YEJnuSqD74kbaUJk((com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.Data) obj);
            }
        }, null, com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly, continuation, 4, null);
    }

    /* renamed from: $r8$lambda$9djyrqsTV4YEJnuSqD7-4kbaUJk, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.CategorySelectionResponse m19382$r8$lambda$9djyrqsTV4YEJnuSqD74kbaUJk(com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.data.mapper.CategorySelectionResponseMapperKt.toCategorySelectionResponse(data);
    }
}
