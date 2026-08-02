package com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\r0\u000b2\u0006\u0010\u0011\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0015\u0010\u001b\u001a\u00020\u00018CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/data/repository/ShoppingIABRepositoryImpl;", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/repository/ShoppingIABRepository;", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/featureflags/ShoppingConfig$Manager;", "shoppingConfigManager", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/featureflags/ShoppingConfig$Manager;Ldagger/Lazy;)V", "", "honeyStoreId", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult;", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabOfferDetails;", "fetchStoreInfoByHoneyStoreId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "offerId", "", "enrollInOffer", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/featureflags/ShoppingConfig$Manager;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Ldagger/Lazy;", "getHighSpeedVideoFpsRanges", "Lkotlin/Lazy;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ShoppingIABRepositoryImpl implements com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.ShoppingIABRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shoppingrewards.shopping.common.featureflags.ShoppingConfig.Manager Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public ShoppingIABRepositoryImpl(com.paypal.oslo.feature.shoppingrewards.shopping.common.featureflags.ShoppingConfig.Manager manager, dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        this.Camera2StreamConfigurationMap = manager;
        this.getHighSpeedVideoFpsRanges = lazy;
        this.getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.ShoppingIABRepositoryImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.ShoppingIABRepository create;
                create = com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.ShoppingIABRepositoryFactory.INSTANCE.create(r0.Camera2StreamConfigurationMap, com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.ShoppingIABRepositoryImpl.this.getHighSpeedVideoFpsRanges);
                return create;
            }
        });
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.ShoppingIABRepository
    public final java.lang.Object enrollInOffer(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<kotlin.Unit>>> continuation) {
        return ((com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.ShoppingIABRepository) this.getHighSpeedVideoFpsRangesFor.getValue()).enrollInOffer(str, continuation);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.ShoppingIABRepository
    public final java.lang.Object fetchStoreInfoByHoneyStoreId(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails>>> continuation) {
        return ((com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.ShoppingIABRepository) this.getHighSpeedVideoFpsRangesFor.getValue()).fetchStoreInfoByHoneyStoreId(str, continuation);
    }
}
