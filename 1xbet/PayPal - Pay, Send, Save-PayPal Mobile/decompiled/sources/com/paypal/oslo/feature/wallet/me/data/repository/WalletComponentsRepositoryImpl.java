package com.paypal.oslo.feature.wallet.me.data.repository;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J@\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\n0\r2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/data/repository/WalletComponentsRepositoryImpl;", "Lcom/paypal/oslo/feature/wallet/me/domain/repository/WalletComponentsRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/wallet/common/config/WalletFeatureManager;", "manager", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/wallet/common/config/WalletFeatureManager;)V", "", "placementId", "", "Lcom/paypal/oslo/feature/wallet/me/domain/Product$Type;", "filters", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/wallet/me/domain/ProductError;", "Lcom/paypal/oslo/feature/wallet/me/domain/Product;", "components", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/apollographql/apollo/ApolloClient;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/wallet/common/config/WalletFeatureManager;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class WalletComponentsRepositoryImpl implements com.paypal.oslo.feature.wallet.me.domain.repository.WalletComponentsRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public WalletComponentsRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager walletFeatureManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletFeatureManager, "");
        this.Camera2StreamConfigurationMap = apolloClient;
        this.getHighSpeedVideoFpsRanges = walletFeatureManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.paypal.oslo.feature.wallet.me.domain.repository.WalletComponentsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object components(java.lang.String str, java.util.List<? extends com.paypal.oslo.feature.wallet.me.domain.Product.Type> list, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.wallet.me.domain.ProductError, ? extends java.util.List<? extends com.paypal.oslo.feature.wallet.me.domain.Product<?>>>> continuation) {
        com.paypal.oslo.feature.wallet.me.data.repository.WalletComponentsRepositoryImpl$components$1 walletComponentsRepositoryImpl$components$1;
        int i;
        java.util.List<com.paypal.oslo.api.graphql.schema.type.WalletAccountType> asWalletAccountTypes;
        arrow.core.Ior ior;
        java.util.List asProducts$default;
        arrow.core.Either right;
        java.util.List asProducts$default2;
        arrow.core.Either right2;
        if (continuation instanceof com.paypal.oslo.feature.wallet.me.data.repository.WalletComponentsRepositoryImpl$components$1) {
            walletComponentsRepositoryImpl$components$1 = (com.paypal.oslo.feature.wallet.me.data.repository.WalletComponentsRepositoryImpl$components$1) continuation;
            if ((walletComponentsRepositoryImpl$components$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                walletComponentsRepositoryImpl$components$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = walletComponentsRepositoryImpl$components$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = walletComponentsRepositoryImpl$components$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery getWalletComponentsQuery = new com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery(com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.WalletComponentsInput(com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull((list == null || (asWalletAccountTypes = com.paypal.oslo.feature.wallet.me.data.repository.ProductKtKt.asWalletAccountTypes(list, this.getHighSpeedVideoFpsRanges)) == null) ? null : kotlin.collections.CollectionsKt.distinct(asWalletAccountTypes)), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(str), null, 4, null)));
                    com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.Camera2StreamConfigurationMap.query(getWalletComponentsQuery), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                    walletComponentsRepositoryImpl$components$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    walletComponentsRepositoryImpl$components$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                    walletComponentsRepositoryImpl$components$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getWalletComponentsQuery);
                    walletComponentsRepositoryImpl$components$1.Camera2StreamConfigurationMap = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall, null, walletComponentsRepositoryImpl$components$1, 2, null);
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
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.wallet.me.data.repository.WalletComponentsMapperKtKt.asProductError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Data data = (com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    return (data == null || (asProducts$default2 = com.paypal.oslo.feature.wallet.me.data.repository.WalletComponentsMapperKtKt.asProducts$default(data, this.getHighSpeedVideoFpsRanges, null, 2, null)) == null || (right2 = arrow.core.EitherKt.right(asProducts$default2)) == null) ? arrow.core.EitherKt.left(com.paypal.oslo.feature.wallet.me.domain.ProductError.Unknown.INSTANCE) : right2;
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue();
                    com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Data data2 = (com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData();
                    return (data2 == null || (asProducts$default = com.paypal.oslo.feature.wallet.me.data.repository.WalletComponentsMapperKtKt.asProducts$default(data2, this.getHighSpeedVideoFpsRanges, null, 2, null)) == null || (right = arrow.core.EitherKt.right(asProducts$default)) == null) ? arrow.core.EitherKt.left(com.paypal.oslo.feature.wallet.me.data.repository.WalletComponentsMapperKtKt.asProductError(callError)) : right;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        walletComponentsRepositoryImpl$components$1 = new com.paypal.oslo.feature.wallet.me.data.repository.WalletComponentsRepositoryImpl$components$1(this, continuation);
        java.lang.Object obj2 = walletComponentsRepositoryImpl$components$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = walletComponentsRepositoryImpl$components$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }
}
