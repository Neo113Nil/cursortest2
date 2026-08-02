package com.paypal.oslo.feature.oneonboarding.inventory.steps.password.domain.error;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;", "Lcom/paypal/oslo/feature/oneonboarding/domain/error/ContextualErrorMessage;", "toPasswordErrorMessage", "(Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/oneonboarding/domain/error/ContextualErrorMessage;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PasswordContextualErrorMapperKt {
    public static final com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorMessage toPasswordErrorMessage(com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo contextualInfo, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contextualInfo, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2044403213, i, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.password.domain.error.toPasswordErrorMessage (PasswordContextualErrorMapper.kt:25)");
        }
        com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorMessage contextualErrorMessage = new com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorMessage(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_api_error_title, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_api_error_description, composer, 0));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return contextualErrorMessage;
    }
}
