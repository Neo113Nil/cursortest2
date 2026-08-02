package com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/mapper/PYUSDRewardsStatusUiMapper;", "", "Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/formatter/PYUSDRateFormatter;", "pyusdRateFormatter", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/formatter/PYUSDRateFormatter;)V", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/rewards/pyusd/PYUSDRewardsStatus;", "input", "Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsStatusUi;", "map", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/rewards/pyusd/PYUSDRewardsStatus;)Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsStatusUi;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/formatter/PYUSDRateFormatter;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PYUSDRewardsStatusUiMapper {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.formatter.PYUSDRateFormatter getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public PYUSDRewardsStatusUiMapper(com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.formatter.PYUSDRateFormatter pYUSDRateFormatter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pYUSDRateFormatter, "");
        this.getHighSpeedVideoFpsRangesFor = pYUSDRateFormatter;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsStatusUi map(com.paypal.oslo.feature.cryptocurrency.domain.model.rewards.pyusd.PYUSDRewardsStatus input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsStatusUi(input.isOptIn() || input.getPreviouslyEnrolled(), input.isOptIn(), com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.formatter.PYUSDRateFormatter.format$default(this.getHighSpeedVideoFpsRangesFor, input.getRate(), null, 2, null), input.getAssetSymbol());
    }
}
