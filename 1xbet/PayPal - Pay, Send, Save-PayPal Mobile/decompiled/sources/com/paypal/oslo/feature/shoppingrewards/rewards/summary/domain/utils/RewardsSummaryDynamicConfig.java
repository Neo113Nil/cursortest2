package com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.utils;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\r\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/utils/RewardsSummaryDynamicConfig;", "", "", "getPpdcPoints", "()J", "ppdcPoints", "", "getPpdcPointsPerUnit", "()Ljava/lang/String;", "ppdcPointsPerUnit", "getPpdcCurrencyUnit", "ppdcCurrencyUnit", "getPpdcMonthlyCap", "ppdcMonthlyCap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface RewardsSummaryDynamicConfig {
    java.lang.String getPpdcCurrencyUnit();

    java.lang.String getPpdcMonthlyCap();

    long getPpdcPoints();

    java.lang.String getPpdcPointsPerUnit();
}
