package com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.data.repository;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J:\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/data/repository/CategoryConfirmationRepositoryImpl;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/repository/CategoryConfirmationRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Ldagger/Lazy;)V", "", "offerId", "touchpointId", com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/usecase/ConfirmCategoryUseCase$Response;", "confirmCategory", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Ldagger/Lazy;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CategoryConfirmationRepositoryImpl extends com.paypal.oslo.feature.shoppingrewards.shared.data.repository.BaseRepository implements com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.repository.CategoryConfirmationRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public CategoryConfirmationRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        this.Camera2StreamConfigurationMap = lazy;
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.repository.CategoryConfirmationRepository
    public final java.lang.Object confirmCategory(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.ConfirmCategoryUseCase.Response>>> continuation) {
        com.apollographql.apollo.ApolloClient apolloClient = this.Camera2StreamConfigurationMap.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
        return com.paypal.oslo.feature.shoppingrewards.shared.data.repository.BaseRepository.fetchData$default(this, apolloClient, new com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation(new com.paypal.oslo.api.graphql.schema.type.EnrollInPromotionOfferInput(str, str2, com.paypal.oslo.api.graphql.schema.type.PromotionPlatform.ANDROID)), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.data.repository.CategoryConfirmationRepositoryImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.data.repository.CategoryConfirmationRepositoryImpl.$r8$lambda$7G10M2mjn4vXUZDalthvCN5nxOk((com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.Data) obj);
            }
        }, null, continuation, 4, null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.ConfirmCategoryUseCase.Response $r8$lambda$7G10M2mjn4vXUZDalthvCN5nxOk(com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.data.mapper.CategoryConfirmationMapperKt.toConfirmCategoryResponse(data);
    }
}
