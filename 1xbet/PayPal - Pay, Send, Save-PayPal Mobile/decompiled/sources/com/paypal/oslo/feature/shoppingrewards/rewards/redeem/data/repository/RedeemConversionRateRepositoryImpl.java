package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.data.repository;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/data/repository/RedeemConversionRateRepositoryImpl;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/repository/RedeemConversionRateRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Ldagger/Lazy;)V", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/model/RedemptionType;", "redemptionType", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/model/ConversionRateResult;", "getConversionRate", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/model/RedemptionType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Ldagger/Lazy;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RedeemConversionRateRepositoryImpl extends com.paypal.oslo.feature.shoppingrewards.shared.data.repository.BaseRepository implements com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemConversionRateRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    @javax.inject.Inject
    public RedeemConversionRateRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        this.getHighSpeedVideoSizes = lazy;
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemConversionRateRepository
    public final java.lang.Object getConversionRate(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.RedemptionType redemptionType, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.ConversionRateResult>>> continuation) {
        com.paypal.oslo.api.graphql.schema.type.RedeemablePointBalanceInput redeemablePointBalanceInput;
        if (redemptionType != null) {
            com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
            if (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.data.repository.RedeemConversionRateRepositoryImpl.WhenMappings.$EnumSwitchMapping$0[redemptionType.ordinal()] == 1) {
                redeemablePointBalanceInput = new com.paypal.oslo.api.graphql.schema.type.RedeemablePointBalanceInput(companion.present(com.paypal.oslo.api.graphql.schema.type.PointsRedemptionType.CHARITY));
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        } else {
            redeemablePointBalanceInput = null;
        }
        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoSizes.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
        return com.paypal.oslo.feature.shoppingrewards.shared.data.repository.BaseRepository.fetchData$default(this, apolloClient, new com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsRedeemablePointBalanceQuery(com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(redeemablePointBalanceInput)), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.data.repository.RedeemConversionRateRepositoryImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.data.repository.RedeemConversionRateRepositoryImpl.m19467$r8$lambda$oW7nhlfvpkldYBs32kx_OhS0ok((com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsRedeemablePointBalanceQuery.Data) obj);
            }
        }, null, com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly, continuation, 4, null);
    }

    /* renamed from: $r8$lambda$oW7nhlfvpkldYBs32-kx_OhS0ok, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.ConversionRateResult m19467$r8$lambda$oW7nhlfvpkldYBs32kx_OhS0ok(com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsRedeemablePointBalanceQuery.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment redeemablePointBalanceFragment = data.getRedeemablePointBalance().getRedeemablePointBalanceFragment();
        java.lang.Integer intOrNull = kotlin.text.StringsKt.toIntOrNull(redeemablePointBalanceFragment.getPointsAvailable().toString());
        if (intOrNull != null) {
            int intValue = intOrNull.intValue();
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.ExchangeRate exchangeRate = redeemablePointBalanceFragment.getExchangeRate();
            if (exchangeRate != null) {
                com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RewardsMoneyFragment rewardsMoneyFragment = exchangeRate.getAmount().getRewardsMoneyFragment();
                java.lang.String obj = exchangeRate.getPoints().toString();
                java.lang.String value = rewardsMoneyFragment.getValue();
                java.lang.String obj2 = rewardsMoneyFragment.getCurrencyCode().toString();
                java.lang.Double doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(obj);
                if (doubleOrNull != null) {
                    if (doubleOrNull.doubleValue() == 0.0d) {
                        doubleOrNull = null;
                    }
                    if (doubleOrNull != null) {
                        double doubleValue = doubleOrNull.doubleValue();
                        java.lang.Double doubleOrNull2 = kotlin.text.StringsKt.toDoubleOrNull(value);
                        if (doubleOrNull2 != null) {
                            return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.ConversionRateResult(doubleOrNull2.doubleValue() / doubleValue, obj, value, obj2, intValue);
                        }
                    }
                }
            }
        }
        return null;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.RedemptionType.values().length];
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.RedemptionType.CHARITY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
