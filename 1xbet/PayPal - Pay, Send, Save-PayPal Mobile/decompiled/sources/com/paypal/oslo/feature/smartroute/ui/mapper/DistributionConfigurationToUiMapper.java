package com.paypal.oslo.feature.smartroute.ui.mapper;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mapper/DistributionConfigurationToUiMapper;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;", "config", "Lcom/paypal/oslo/feature/smartroute/ui/model/DistributionScreenState;", "toScreenState", "(Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;)Lcom/paypal/oslo/feature/smartroute/ui/model/DistributionScreenState;", "", "amount", "formatCurrency$smart_route_prodRelease", "(Ljava/lang/String;)Ljava/lang/String;", "getHighSpeedVideoSizes", "Landroid/content/Context;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DistributionConfigurationToUiMapper {
    public static final int $stable = 8;
    private final android.content.Context getHighSpeedVideoSizes;

    @javax.inject.Inject
    public DistributionConfigurationToUiMapper(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoSizes = context;
    }

    public final com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState toScreenState(com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration config) {
        boolean z;
        boolean z2;
        com.paypal.oslo.feature.smartroute.ui.model.AutoReloadUi autoReloadUi;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        java.lang.String string = this.getHighSpeedVideoSizes.getString(com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_distribution_heading);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = this.getHighSpeedVideoSizes.getString(com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_distribution_split_label);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (config.isSavingsTargetAvailable()) {
            float savingsPercentage = config.getSavingsPercentage();
            java.lang.String savingsApy = config.getSavingsApy();
            boolean z3 = config.getSavingsEligibilityStatus() == com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus.ELIGIBLE;
            java.lang.String string3 = this.getHighSpeedVideoSizes.getString(com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_distribution_target_title_savings);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "");
            arrayList.add(new com.paypal.oslo.feature.smartroute.ui.model.DistributionAccountUi("savings", string3, z3 ? this.getHighSpeedVideoSizes.getString(com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_distribution_target_enrollment_required) : null, savingsApy != null ? this.getHighSpeedVideoSizes.getString(com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_distribution_target_rate_apy, savingsApy) : null, com.paypal.pds.core.Icon.Safe.INSTANCE, com.paypal.oslo.feature.smartroute.ui.model.DistributionAccountUi.INSTANCE.getInfoEmphasis(), savingsPercentage, true, new com.paypal.oslo.feature.smartroute.utils.SliderTarget((int) savingsPercentage, 100, "savings", 1.0f)));
        }
        if (config.isPyusdTargetAvailable()) {
            float cryptoPercentage = config.getCryptoPercentage();
            java.lang.String cryptoApyRate = config.getCryptoApyRate();
            java.lang.String string4 = this.getHighSpeedVideoSizes.getString(com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_distribution_target_title_pyusd);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "");
            arrayList.add(new com.paypal.oslo.feature.smartroute.ui.model.DistributionAccountUi("crypto", string4, null, cryptoApyRate != null ? this.getHighSpeedVideoSizes.getString(com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_distribution_target_rate_reward, cryptoApyRate) : null, com.paypal.pds.core.Icon.LogoPaypalMarkColor.INSTANCE, com.paypal.pds.components.AvatarEmphasis.High.INSTANCE, cryptoPercentage, true, new com.paypal.oslo.feature.smartroute.utils.SliderTarget((int) cryptoPercentage, 100, "crypto", 1.0f)));
        }
        double d = 0.0d;
        while (arrayList.iterator().hasNext()) {
            d += ((com.paypal.oslo.feature.smartroute.ui.model.DistributionAccountUi) r2.next()).getPercentage();
        }
        float f = 100.0f - ((float) d);
        java.lang.String string5 = this.getHighSpeedVideoSizes.getString(com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_distribution_target_title_balance);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "");
        arrayList.add(new com.paypal.oslo.feature.smartroute.ui.model.DistributionAccountUi("balance", string5, null, null, com.paypal.pds.core.Icon.Wallet.INSTANCE, com.paypal.oslo.feature.smartroute.ui.model.DistributionAccountUi.INSTANCE.getInfoEmphasis(), f, false, new com.paypal.oslo.feature.smartroute.utils.SliderTarget((int) f, 100, "balance", 1.0f)));
        if (config.getAutoReloadEnabled() && config.getAutoReloadThresholdAmount() != null && config.getAutoReloadAmount() != null) {
            z = true;
            autoReloadUi = new com.paypal.oslo.feature.smartroute.ui.model.AutoReloadUi(true, formatCurrency$smart_route_prodRelease(config.getAutoReloadThresholdAmount()), formatCurrency$smart_route_prodRelease(config.getAutoReloadAmount()));
            z2 = false;
        } else {
            z = true;
            z2 = false;
            autoReloadUi = new com.paypal.oslo.feature.smartroute.ui.model.AutoReloadUi(false, "25", "25");
        }
        boolean isSavingsTargetAvailable = config.isSavingsTargetAvailable();
        boolean z4 = (!config.isAutoReloadConfigured() || config.isUsingSavingsForAutoReload()) ? z : z2;
        java.lang.String string6 = this.getHighSpeedVideoSizes.getString(com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_distribution_cta_agree);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string6, "");
        com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus status = config.getStatus();
        boolean isPyusdTargetAvailable = config.isPyusdTargetAvailable();
        java.lang.String string7 = this.getHighSpeedVideoSizes.getString(com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_split_disclaimer_directdeposit_savings);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string7, "");
        java.lang.String string8 = this.getHighSpeedVideoSizes.getString(com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_split_disclaimer_directdeposit_pyusd);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string8, "");
        java.lang.String string9 = this.getHighSpeedVideoSizes.getString(com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_split_disclaimer_directdeposit_savingsandpyusd);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string9, "");
        java.lang.String string10 = this.getHighSpeedVideoSizes.getString(com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_split_disclaimer_directdeposit_autoreload);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string10, "");
        return new com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState(string, string2, arrayList, autoReloadUi, true, isSavingsTargetAvailable, z4, string6, true, "4", status, config, false, false, false, false, false, isPyusdTargetAvailable, false, null, 0, false, false, false, false, false, false, false, false, null, null, false, false, 0, string7, string8, string9, string10, config.isSavingsTargetAvailable(), config.isPyusdTargetAvailable(), -147456, 3, null);
    }

    public final java.lang.String formatCurrency$smart_route_prodRelease(java.lang.String amount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        return amount;
    }
}
