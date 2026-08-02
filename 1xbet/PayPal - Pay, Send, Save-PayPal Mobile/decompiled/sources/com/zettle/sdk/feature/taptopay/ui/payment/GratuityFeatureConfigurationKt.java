package com.zettle.sdk.feature.taptopay.ui.payment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/GratuityPreference;", "Lcom/zettle/sdk/feature/taptopay/ui/payment/GratuityFeatureConfiguration;", "toGratuityFeatureConfiguration", "(Lcom/zettle/sdk/feature/taptopay/ui/models/GratuityPreference;)Lcom/zettle/sdk/feature/taptopay/ui/payment/GratuityFeatureConfiguration;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class GratuityFeatureConfigurationKt {
    public static final com.zettle.sdk.feature.taptopay.ui.payment.GratuityFeatureConfiguration toGratuityFeatureConfiguration(com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference gratuityPreference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gratuityPreference, "");
        if (gratuityPreference instanceof com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference.Fixed) {
            return new com.zettle.sdk.feature.taptopay.ui.payment.GratuityFeatureConfiguration.Headless(((com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference.Fixed) gratuityPreference).getGratuityAmount());
        }
        if (gratuityPreference instanceof com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference.ShowScreenWithOptions) {
            return new com.zettle.sdk.feature.taptopay.ui.payment.GratuityFeatureConfiguration.TippingScreen(((com.zettle.sdk.feature.taptopay.ui.models.GratuityPreference.ShowScreenWithOptions) gratuityPreference).getPercentageOptions());
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
