package com.paypal.oslo.feature.onboarding.shared.variants.preview;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/VariantResolver;", "previewVariantResolver", "(Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/VariantResolver;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PreviewScaffoldKt {
    public static final com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantResolver previewVariantResolver(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-115627487, i, -1, "com.paypal.oslo.feature.onboarding.shared.variants.preview.previewVariantResolver (PreviewScaffold.kt:49)");
        }
        com.paypal.oslo.feature.onboarding.shared.variants.ui.DefaultVariantResolver defaultVariantResolver = new com.paypal.oslo.feature.onboarding.shared.variants.ui.DefaultVariantResolver(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.INSTANCE.getVariants(), (android.content.res.Resources) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalResources()));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return defaultVariantResolver;
    }
}
