package com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.data.repository;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J>\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000e0\f2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/data/repository/OffersRepositoryImpl;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/repository/OffersRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Ldagger/Lazy;)V", "", "offerId", "touchpointId", com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/usecase/GetOfferDetailsUseCase$Response;", "getOfferDetails", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/usecase/ActivateOfferUseCase$Response;", "activateOffer", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Ldagger/Lazy;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OffersRepositoryImpl extends com.paypal.oslo.feature.shoppingrewards.shared.data.repository.BaseRepository implements com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.repository.OffersRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public OffersRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        this.getHighResolutionOutputSizeshNQ4ISI = lazy;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r1 == null) goto L8;
     */
    @Override // com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.repository.OffersRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getOfferDetails(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.GetOfferDetailsUseCase.Response>>> continuation) {
        com.paypal.oslo.api.graphql.schema.type.PromotionPlatform promotionPlatform;
        if (str3 != null) {
            promotionPlatform = com.paypal.oslo.api.graphql.schema.type.PromotionPlatform.INSTANCE.safeValueOf(str3);
            if (promotionPlatform == com.paypal.oslo.api.graphql.schema.type.PromotionPlatform.UNKNOWN__) {
                promotionPlatform = null;
            }
        }
        promotionPlatform = com.paypal.oslo.api.graphql.schema.type.PromotionPlatform.ANDROID;
        com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput promotionOffersInput = new com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput(str2 == null ? com.paypal.oslo.feature.shoppingrewards.rewards.common.utils.RewardsTouchpoints.OFFER_DETAILS_HALFSHEET : str2, promotionPlatform, com.apollographql.apollo.api.Optional.INSTANCE.present(kotlin.collections.CollectionsKt.listOf(str)), null, null, null, null, 120, null);
        com.apollographql.apollo.ApolloClient apolloClient = this.getHighResolutionOutputSizeshNQ4ISI.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
        return com.paypal.oslo.feature.shoppingrewards.shared.data.repository.BaseRepository.fetchData$default(this, apolloClient, new com.paypal.oslo.feature.shoppingrewards.graphql.GetOfferDetailsQuery(promotionOffersInput), com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.data.mapper.OfferDetailsMapperKt.getGetOfferDetailsDataMapper(), null, com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly, continuation, 4, null);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.repository.OffersRepository
    public final java.lang.Object activateOffer(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.ActivateOfferUseCase.Response>>> continuation) {
        com.paypal.oslo.api.graphql.schema.type.EnrollInPromotionOfferInput enrollInPromotionOfferInput = new com.paypal.oslo.api.graphql.schema.type.EnrollInPromotionOfferInput(str, com.paypal.oslo.feature.shoppingrewards.rewards.common.utils.RewardsTouchpoints.OFFER_DETAILS_HALFSHEET, com.paypal.oslo.api.graphql.schema.type.PromotionPlatform.ANDROID);
        com.apollographql.apollo.ApolloClient apolloClient = this.getHighResolutionOutputSizeshNQ4ISI.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
        return com.paypal.oslo.feature.shoppingrewards.shared.data.repository.BaseRepository.fetchData$default(this, apolloClient, new com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInPromotionOfferMutation(enrollInPromotionOfferInput), com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.data.mapper.OfferDetailsMapperKt.getActivateOfferDataMapper(), null, continuation, 4, null);
    }
}
