package com.paypal.oslo.feature.home.data;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\bR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/home/data/ResourceRewardsStringProvider;", "Lcom/paypal/oslo/feature/home/domain/RewardsStringProvider;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "getRewardsProductName", "()Ljava/lang/String;", "formattedPoints", "getRewardsPoints", "(Ljava/lang/String;)Ljava/lang/String;", "getAvailableToRedeem", "Camera2StreamConfigurationMap", "Landroid/content/Context;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ResourceRewardsStringProvider implements com.paypal.oslo.feature.home.domain.RewardsStringProvider {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public ResourceRewardsStringProvider(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoFpsRangesFor = context;
    }

    @Override // com.paypal.oslo.feature.home.domain.RewardsStringProvider
    public final java.lang.String getRewardsProductName() {
        java.lang.String string = this.getHighSpeedVideoFpsRangesFor.getString(com.paypal.oslo.feature.home.R.string.feature_home_rewards);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // com.paypal.oslo.feature.home.domain.RewardsStringProvider
    public final java.lang.String getRewardsPoints(java.lang.String formattedPoints) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedPoints, "");
        java.lang.String string = this.getHighSpeedVideoFpsRangesFor.getString(com.paypal.oslo.feature.home.R.string.feature_home_rewards_points, formattedPoints);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // com.paypal.oslo.feature.home.domain.RewardsStringProvider
    public final java.lang.String getAvailableToRedeem() {
        java.lang.String string = this.getHighSpeedVideoFpsRangesFor.getString(com.paypal.oslo.feature.home.R.string.feature_home_available_to_redeem);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
