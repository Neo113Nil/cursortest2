package com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.domain.error;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;", "Lcom/paypal/oslo/feature/oneonboarding/domain/error/ContextualErrorMessage;", "toPhoneErrorMessage", "(Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/oneonboarding/domain/error/ContextualErrorMessage;", "", "InitiateFail", "Ljava/lang/String;", "InitiateMaxAttempts"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhoneContextualErrorMapperKt {
    public static final java.lang.String InitiateFail = "INITIATE_FAIL";
    public static final java.lang.String InitiateMaxAttempts = "INITIATE_MAX_ATTEMPTS";

    public static final com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorMessage toPhoneErrorMessage(com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo contextualInfo, androidx.compose.runtime.Composer composer, int i) {
        com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorMessage contextualErrorMessage;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contextualInfo, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-741367160, i, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.domain.error.toPhoneErrorMessage (PhoneContextualErrorMapper.kt:31)");
        }
        java.lang.String issue = contextualInfo.getIssue();
        if (kotlin.jvm.internal.Intrinsics.areEqual(issue, InitiateFail)) {
            composer.startReplaceGroup(510734383);
            contextualErrorMessage = new com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorMessage(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_error_could_not_deliver_otp, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_could_not_deliver_otp_desc, composer, 0));
            composer.endReplaceGroup();
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(issue, InitiateMaxAttempts)) {
            composer.startReplaceGroup(510742845);
            contextualErrorMessage = new com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorMessage(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_error_verification_max_attempts, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_error_verification_max_attempts_desc, composer, 0));
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1346587563);
            composer.endReplaceGroup();
            contextualErrorMessage = null;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return contextualErrorMessage;
    }
}
