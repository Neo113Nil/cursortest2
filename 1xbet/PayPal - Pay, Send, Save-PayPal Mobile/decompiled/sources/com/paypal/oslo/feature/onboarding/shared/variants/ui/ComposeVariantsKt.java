package com.paypal.oslo.feature.onboarding.shared.variants.ui;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\"\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/VariantKey;", "key", "", "", "formatArgs", "", "variant-CBRiV3w", "(Ljava/lang/String;[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "variant", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/VariantResolver;", "LocalVariantResolver", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalVariantResolver", "()Landroidx/compose/runtime/ProvidableCompositionLocal;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComposeVariantsKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantResolver> LocalVariantResolver = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.shared.variants.ui.ComposeVariantsKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.onboarding.shared.variants.ui.ComposeVariantsKt.$r8$lambda$qslFZdFvfV9OZjitNIZdpoBppM0();
        }
    });

    public static final androidx.compose.runtime.ProvidableCompositionLocal<com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantResolver> getLocalVariantResolver() {
        return LocalVariantResolver;
    }

    /* renamed from: variant-CBRiV3w, reason: not valid java name */
    public static final java.lang.String m16200variantCBRiV3w(java.lang.String str, java.lang.Object[] objArr, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1884080424, i, -1, "com.paypal.oslo.feature.onboarding.shared.variants.ui.variant (ComposeVariants.kt:52)");
        }
        java.lang.String mo16199textsTNpmkc = ((com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantResolver) composer.consume(LocalVariantResolver)).mo16199textsTNpmkc(str, java.util.Arrays.copyOf(objArr, objArr.length));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return mo16199textsTNpmkc;
    }

    public static /* synthetic */ com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantResolver $r8$lambda$qslFZdFvfV9OZjitNIZdpoBppM0() {
        throw new java.lang.IllegalStateException("No VariantResolver provided. Ensure CompositionLocalProvider is wrapping your screen.\nExample: CompositionLocalProvider(LocalVariantResolver provides variantResolver) { /* your content */ }".toString());
    }
}
