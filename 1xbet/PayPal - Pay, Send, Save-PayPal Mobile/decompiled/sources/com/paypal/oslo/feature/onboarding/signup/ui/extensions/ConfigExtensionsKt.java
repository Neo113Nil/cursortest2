package com.paypal.oslo.feature.onboarding.signup.ui.extensions;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/ComponentConfig;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupComponentType;", "toSignupComponentTypeOrNull", "(Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/ComponentConfig;)Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupComponentType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ConfigExtensionsKt {
    public static final com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType toSignupComponentTypeOrNull(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentConfig componentConfig) {
        java.lang.Object m23436constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentConfig, "");
        java.lang.String mo16534getComponentTypeNvngK3s = componentConfig.mo16534getComponentTypeNvngK3s();
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.String upperCase = mo16534getComponentTypeNvngK3s.toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType.valueOf(upperCase));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl) != null) {
            m23436constructorimpl = null;
        }
        return (com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType) ((java.lang.Enum) m23436constructorimpl);
    }
}
