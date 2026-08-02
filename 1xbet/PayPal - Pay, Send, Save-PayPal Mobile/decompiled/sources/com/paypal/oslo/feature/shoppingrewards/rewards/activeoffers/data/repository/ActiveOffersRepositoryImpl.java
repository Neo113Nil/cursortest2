package com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.data.repository;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/data/repository/ActiveOffersRepositoryImpl;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/domain/repository/ActiveOffersRepository;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/data/source/ActiveOffersCache;", "activeOffersCache", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/data/source/ActiveOffersCache;)V", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/domain/repository/ActiveOffersRepository$ActiveOfferGraphQLRequest;", "input", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/domain/usecase/GetActiveOffersUseCase$Response;", "getActiveOffers", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/domain/repository/ActiveOffersRepository$ActiveOfferGraphQLRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/data/source/ActiveOffersCache;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ActiveOffersRepositoryImpl extends com.paypal.oslo.feature.shoppingrewards.shared.data.repository.BaseRepository implements com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.repository.ActiveOffersRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.data.source.ActiveOffersCache getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public ActiveOffersRepositoryImpl(com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.data.source.ActiveOffersCache activeOffersCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activeOffersCache, "");
        this.getHighSpeedVideoFpsRanges = activeOffersCache;
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.repository.ActiveOffersRepository
    public final java.lang.Object getActiveOffers(com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.repository.ActiveOffersRepository.ActiveOfferGraphQLRequest activeOfferGraphQLRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase.Response>>> continuation) {
        int i = com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.data.repository.ActiveOffersRepositoryImpl.WhenMappings.$EnumSwitchMapping$0[activeOfferGraphQLRequest.getOrigin().ordinal()];
        if (i == 1) {
            return arrow.core.IorKt.rightIor(new com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success("cached", new com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase.Response(this.getHighSpeedVideoFpsRanges.getOffers())));
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.shoppingrewards.LoggerKt.log, "Deep link navigation to active offers not yet implemented", null, null, 6, null);
        return arrow.core.IorKt.leftIor(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError.Unknown.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersOrigin.values().length];
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersOrigin.RewardsSummary.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.api.rewards.activeoffers.navigation.ActiveOffersOrigin.DeepLink.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
