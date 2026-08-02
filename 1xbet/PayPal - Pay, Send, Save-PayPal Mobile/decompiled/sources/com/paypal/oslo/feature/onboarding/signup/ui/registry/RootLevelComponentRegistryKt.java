package com.paypal.oslo.feature.onboarding.signup.ui.registry;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/registry/RootLevelComponentRegistry;", "emptyRootLevelComponentRegistry", "()Lcom/paypal/oslo/feature/onboarding/signup/ui/registry/RootLevelComponentRegistry;", "rememberRootLevelComponentRegistry", "(Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/onboarding/signup/ui/registry/RootLevelComponentRegistry;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RootLevelComponentRegistryKt {
    public static final com.paypal.oslo.feature.onboarding.signup.ui.registry.RootLevelComponentRegistry emptyRootLevelComponentRegistry() {
        return com.paypal.oslo.feature.onboarding.signup.ui.registry.EmptyRootLevelComponentRegistry.INSTANCE;
    }

    public static final com.paypal.oslo.feature.onboarding.signup.ui.registry.RootLevelComponentRegistry rememberRootLevelComponentRegistry(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1600682590, i, -1, "com.paypal.oslo.feature.onboarding.signup.ui.registry.rememberRootLevelComponentRegistry (RootLevelComponentRegistry.kt:111)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new com.paypal.oslo.feature.onboarding.signup.ui.registry.RootLevelComponentRegistry();
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.onboarding.signup.ui.registry.RootLevelComponentRegistry rootLevelComponentRegistry = (com.paypal.oslo.feature.onboarding.signup.ui.registry.RootLevelComponentRegistry) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return rootLevelComponentRegistry;
    }
}
