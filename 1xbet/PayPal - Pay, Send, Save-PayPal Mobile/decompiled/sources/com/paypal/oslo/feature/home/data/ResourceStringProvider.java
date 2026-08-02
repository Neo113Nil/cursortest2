package com.paypal.oslo.feature.home.data;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\bJ\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/home/data/ResourceStringProvider;", "Lcom/paypal/oslo/feature/home/domain/StringProvider;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "getSeeMoreButtonText", "()Ljava/lang/String;", "getExploreMoreButtonText", "getShopButtonText", "getOrderButtonText", "getAddMoneyText", "getBanksAndCardsText", "getAddPaymentMethodsText", "getNoInternetErrorMessage", "getServiceUnavailableErrorMessage", "getUnableToLoadSectionErrorMessage", "getSeeMoreDefaultPrompt", "getAvailableValue", "rate", "getPyUsdAnnualRewardsRate", "(Ljava/lang/String;)Ljava/lang/String;", "getCryptoProductName", "percentage", "getTotalReturn", "getHighSpeedVideoFpsRanges", "Landroid/content/Context;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ResourceStringProvider implements com.paypal.oslo.feature.home.domain.StringProvider {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.content.Context getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public ResourceStringProvider(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighResolutionOutputSizeshNQ4ISI = context;
    }

    @Override // com.paypal.oslo.feature.home.domain.StringProvider
    public final java.lang.String getSeeMoreButtonText() {
        java.lang.String string = this.getHighResolutionOutputSizeshNQ4ISI.getString(com.paypal.oslo.feature.home.R.string.feature_home_button_cta_see_more);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // com.paypal.oslo.feature.home.domain.StringProvider
    public final java.lang.String getExploreMoreButtonText() {
        java.lang.String string = this.getHighResolutionOutputSizeshNQ4ISI.getString(com.paypal.oslo.feature.home.R.string.feature_home_button_cta_explore_more);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // com.paypal.oslo.feature.home.domain.StringProvider
    public final java.lang.String getShopButtonText() {
        java.lang.String string = this.getHighResolutionOutputSizeshNQ4ISI.getString(com.paypal.oslo.feature.home.R.string.feature_home_button_cta_shop);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // com.paypal.oslo.feature.home.domain.StringProvider
    public final java.lang.String getOrderButtonText() {
        java.lang.String string = this.getHighResolutionOutputSizeshNQ4ISI.getString(com.paypal.oslo.feature.home.R.string.feature_home_button_cta_order);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // com.paypal.oslo.feature.home.domain.StringProvider
    public final java.lang.String getAddMoneyText() {
        java.lang.String string = this.getHighResolutionOutputSizeshNQ4ISI.getString(com.paypal.oslo.feature.home.R.string.feature_home_add_money);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // com.paypal.oslo.feature.home.domain.StringProvider
    public final java.lang.String getBanksAndCardsText() {
        java.lang.String string = this.getHighResolutionOutputSizeshNQ4ISI.getString(com.paypal.oslo.feature.home.R.string.feature_home_banks_and_cards_product_name);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // com.paypal.oslo.feature.home.domain.StringProvider
    public final java.lang.String getAddPaymentMethodsText() {
        java.lang.String string = this.getHighResolutionOutputSizeshNQ4ISI.getString(com.paypal.oslo.feature.home.R.string.feature_home_add_payment_methods);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // com.paypal.oslo.feature.home.domain.StringProvider
    public final java.lang.String getNoInternetErrorMessage() {
        java.lang.String string = this.getHighResolutionOutputSizeshNQ4ISI.getString(com.paypal.oslo.feature.home.R.string.feature_home_error_no_internet);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // com.paypal.oslo.feature.home.domain.StringProvider
    public final java.lang.String getServiceUnavailableErrorMessage() {
        java.lang.String string = this.getHighResolutionOutputSizeshNQ4ISI.getString(com.paypal.oslo.feature.home.R.string.feature_home_error_service_unavailable);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // com.paypal.oslo.feature.home.domain.StringProvider
    public final java.lang.String getUnableToLoadSectionErrorMessage() {
        java.lang.String string = this.getHighResolutionOutputSizeshNQ4ISI.getString(com.paypal.oslo.feature.home.R.string.feature_home_section_error_description);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // com.paypal.oslo.feature.home.domain.StringProvider
    public final java.lang.String getSeeMoreDefaultPrompt() {
        java.lang.String string = this.getHighResolutionOutputSizeshNQ4ISI.getString(com.paypal.oslo.feature.home.R.string.feature_home_see_more_default_prompt);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // com.paypal.oslo.feature.home.domain.StringProvider
    public final java.lang.String getAvailableValue() {
        java.lang.String string = this.getHighResolutionOutputSizeshNQ4ISI.getString(com.paypal.oslo.feature.home.R.string.feature_home_available_value);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // com.paypal.oslo.feature.home.domain.StringProvider
    public final java.lang.String getPyUsdAnnualRewardsRate(java.lang.String rate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rate, "");
        java.lang.String string = this.getHighResolutionOutputSizeshNQ4ISI.getString(com.paypal.oslo.feature.home.R.string.feature_home_pyusd_annual_rewards_rate, rate);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // com.paypal.oslo.feature.home.domain.StringProvider
    public final java.lang.String getCryptoProductName() {
        java.lang.String string = this.getHighResolutionOutputSizeshNQ4ISI.getString(com.paypal.oslo.feature.home.R.string.feature_home_crypto_product_name);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // com.paypal.oslo.feature.home.domain.StringProvider
    public final java.lang.String getTotalReturn(java.lang.String percentage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(percentage, "");
        java.lang.String string = this.getHighResolutionOutputSizeshNQ4ISI.getString(com.paypal.oslo.feature.home.R.string.feature_home_total_return, percentage);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
