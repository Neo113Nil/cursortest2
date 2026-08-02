package com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010R\u0014\u0010\u0018\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u0014\u0010\u0019\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0010R\u001a\u0010\u001a\u001a\u00020\f8\u0006X\u0086T¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u0012\u0004\b\u001b\u0010\u0003R\u001a\u0010\u001c\u001a\u00020\f8\u0006X\u0086T¢\u0006\f\n\u0004\b\u001c\u0010\u0010\u0012\u0004\b\u001d\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/ui/analytics/PasswordRecoveryAnalytics;", "", "<init>", "()V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ModuleAppeared;", "createPasswordCreatedEvent", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ModuleAppeared;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError;", "error", "createPasswordFailedEvent", "(Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError;)Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ModuleAppeared;", "Lkotlin/Pair;", "", "errorCodeAndType$identity_prodRelease", "(Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError;)Lkotlin/Pair;", "ACTION_PASSWORD_CREATED", "Ljava/lang/String;", "ACTION_ERROR", "SOURCE_ERROR_CONTEXT_APP_UI", "SOURCE_ERROR_CONTEXT_API_CALL", "ITEM_PASSWORD_FIELD", "ITEM_REENTER_PASSWORD_FIELD", "ITEM_LOG_OUT_DEVICES_CHECKBOX", "ITEM_SAVE", "ITEM_CANCEL", "ITEM_ERROR_BANNER", "ITEM_OUTCOME_SUCCESS", "getITEM_OUTCOME_SUCCESS$annotations", "ITEM_OUTCOME_ERROR", "getITEM_OUTCOME_ERROR$annotations"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PasswordRecoveryAnalytics {
    public static final int $stable = 0;
    public static final java.lang.String ACTION_ERROR = "error";
    public static final java.lang.String ACTION_PASSWORD_CREATED = "create_new_password";
    public static final com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics INSTANCE = new com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics();
    public static final java.lang.String ITEM_CANCEL = "cancel";
    public static final java.lang.String ITEM_ERROR_BANNER = "error_banner";
    public static final java.lang.String ITEM_LOG_OUT_DEVICES_CHECKBOX = "log_out_devices_checkbox";
    public static final java.lang.String ITEM_OUTCOME_ERROR = "outcome_error";
    public static final java.lang.String ITEM_OUTCOME_SUCCESS = "outcome_success";
    public static final java.lang.String ITEM_PASSWORD_FIELD = "password_field";
    public static final java.lang.String ITEM_REENTER_PASSWORD_FIELD = "reenter_password_field";
    public static final java.lang.String ITEM_SAVE = "save";
    public static final java.lang.String SOURCE_ERROR_CONTEXT_API_CALL = "api_call";
    public static final java.lang.String SOURCE_ERROR_CONTEXT_APP_UI = "app_ui";

    public static /* synthetic */ void getITEM_OUTCOME_ERROR$annotations() {
    }

    public static /* synthetic */ void getITEM_OUTCOME_SUCCESS$annotations() {
    }

    private PasswordRecoveryAnalytics() {
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleAppeared createPasswordCreatedEvent() {
        return new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleAppeared(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.identity.analytics.domain.Screen.PASSWORD_RECOVERY.getValue()), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(com.paypal.oslo.feature.identity.analytics.domain.Screen.PASSWORD_RECOVERY.getValue(), 0, null, null, 14, null), null, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(ITEM_OUTCOME_SUCCESS, 0, 2, null), 4, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.IDENTITY, com.paypal.oslo.feature.identity.analytics.domain.Feature.PASSWORD_RECOVERY.getValue(), ACTION_PASSWORD_CREATED), null, 4, null);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleAppeared createPasswordFailedEvent(com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError error) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.identity.analytics.domain.Screen.PASSWORD_RECOVERY.getValue()), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(com.paypal.oslo.feature.identity.analytics.domain.Screen.PASSWORD_RECOVERY.getValue(), 0, null, null, 14, null), null, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(ITEM_OUTCOME_ERROR, 0, 2, null), 4, null);
        com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext = new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.IDENTITY, com.paypal.oslo.feature.identity.analytics.domain.Feature.PASSWORD_RECOVERY.getValue(), "error");
        kotlin.Pair<java.lang.String, java.lang.String> errorCodeAndType$identity_prodRelease = errorCodeAndType$identity_prodRelease(error);
        java.lang.String component1 = errorCodeAndType$identity_prodRelease.component1();
        java.lang.String component2 = errorCodeAndType$identity_prodRelease.component2();
        if ((error instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.EmptyPassword) || (error instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.EmptyConfirmPassword) || (error instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordTooShort) || (error instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordTooLong) || (error instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordTooWeak) || (error instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordsDoNotMatch)) {
            str = "app_ui";
        } else {
            str = "api_call";
        }
        return new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleAppeared(uIContext, userIntentContext, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext(component1, component1, component2, str)));
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> errorCodeAndType$identity_prodRelease(com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        if (error instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.EmptyPassword) {
            return kotlin.TuplesKt.to("PWD_EMPTY", "validation");
        }
        if (error instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.EmptyConfirmPassword) {
            return kotlin.TuplesKt.to("PWD_CONFIRM_EMPTY", "validation");
        }
        if (error instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordTooShort) {
            return kotlin.TuplesKt.to("PWD_TOO_SHORT", "validation");
        }
        if (error instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordTooLong) {
            return kotlin.TuplesKt.to("PWD_TOO_LONG", "validation");
        }
        if (error instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordTooWeak) {
            return kotlin.TuplesKt.to("PWD_TOO_WEAK", "validation");
        }
        if (error instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordsDoNotMatch) {
            return kotlin.TuplesKt.to("PWD_FIELDS_MISMATCH", "validation");
        }
        if (error instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordRecentlyUsed) {
            return kotlin.TuplesKt.to("PWD_SAME_AS_OLD", "business_rule");
        }
        if (error instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordIllegalCharacters) {
            return kotlin.TuplesKt.to("PWD_ILLEGAL_CHARS", "business_rule");
        }
        if (error instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordMatchesCredential) {
            return kotlin.TuplesKt.to("PWD_CONTAINS_PERSONAL_INFO", "business_rule");
        }
        if (error instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordSequence) {
            return kotlin.TuplesKt.to("PWD_SEQUENCE", "business_rule");
        }
        if (error instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordRepeatedCharacters) {
            return kotlin.TuplesKt.to("PWD_REPEATED_CHARS", "business_rule");
        }
        if (error instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordForbiddenWord) {
            return kotlin.TuplesKt.to("PWD_COMMON", "business_rule");
        }
        if (error instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.InvalidResetToken) {
            return kotlin.TuplesKt.to("INVALID_RESET_TOKEN", "auth");
        }
        if (error instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.ExpiredResetToken) {
            return kotlin.TuplesKt.to("EXPIRED_RESET_TOKEN", "auth");
        }
        if (error instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.NetworkError) {
            return kotlin.TuplesKt.to("NETWORK_ERROR", "network");
        }
        if (error instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.ServerError) {
            return kotlin.TuplesKt.to("SERVER_ERROR", "system");
        }
        if (error instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.UnknownError) {
            return kotlin.TuplesKt.to("UNKNOWN_ERROR", "system");
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
