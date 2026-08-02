package com.paypal.oslo.feature.onboarding.di;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/di/VariantModule;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/VariantResolver;", "provideVariantResolver", "(Landroid/content/Context;)Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/VariantResolver;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public final class VariantModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.onboarding.di.VariantModule INSTANCE = new com.paypal.oslo.feature.onboarding.di.VariantModule();

    private VariantModule() {
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantResolver provideVariantResolver(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.util.Map<com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey, java.lang.Integer> variants = com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.INSTANCE.getVariants();
        android.content.res.Resources resources = context.getResources();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resources, "");
        return new com.paypal.oslo.feature.onboarding.shared.variants.ui.DefaultVariantResolver(variants, resources);
    }
}
