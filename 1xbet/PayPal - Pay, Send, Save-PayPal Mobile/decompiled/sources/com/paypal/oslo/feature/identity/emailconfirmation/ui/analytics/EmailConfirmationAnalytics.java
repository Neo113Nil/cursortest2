package com.paypal.oslo.feature.identity.emailconfirmation.ui.analytics;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\r2\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/analytics/EmailConfirmationAnalytics;", "", "<init>", "()V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ModuleAppeared;", "createOutcomeSuccessEvent", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ModuleAppeared;", "Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationErrorType;", "errorType", "", "message", "createOutcomeErrorEvent", "(Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationErrorType;Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ModuleAppeared;", "Lkotlin/Pair;", "errorCodeAndType$identity_prodRelease", "(Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationErrorType;)Lkotlin/Pair;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EmailConfirmationAnalytics {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.identity.emailconfirmation.ui.analytics.EmailConfirmationAnalytics INSTANCE = new com.paypal.oslo.feature.identity.emailconfirmation.ui.analytics.EmailConfirmationAnalytics();

    private EmailConfirmationAnalytics() {
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleAppeared createOutcomeSuccessEvent() {
        return new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleAppeared(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.identity.analytics.domain.Screen.EmailConfirmation.getValue()), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(com.paypal.oslo.feature.identity.analytics.domain.Screen.EmailConfirmation.getValue(), 0, null, null, 14, null), null, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_OUTCOME_SUCCESS, 0, 2, null), 4, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("identity", com.paypal.oslo.feature.identity.analytics.domain.Feature.EmailConfirmation.getValue(), "confirmed"), null, 4, null);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleAppeared createOutcomeErrorEvent(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType errorType, java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.identity.analytics.domain.Screen.EmailConfirmation.getValue()), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(com.paypal.oslo.feature.identity.analytics.domain.Screen.EmailConfirmation.getValue(), 0, null, null, 14, null), null, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_OUTCOME_ERROR, 0, 2, null), 4, null);
        com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext = new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("identity", com.paypal.oslo.feature.identity.analytics.domain.Feature.EmailConfirmation.getValue(), "error");
        kotlin.Pair<java.lang.String, java.lang.String> errorCodeAndType$identity_prodRelease = errorCodeAndType$identity_prodRelease(errorType);
        java.lang.String component1 = errorCodeAndType$identity_prodRelease.component1();
        java.lang.String component2 = errorCodeAndType$identity_prodRelease.component2();
        if (message == null) {
            message = component1;
        }
        return new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleAppeared(uIContext, userIntentContext, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext(component1, message, component2, "api_call")));
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> errorCodeAndType$identity_prodRelease(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType errorType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
        int i = com.paypal.oslo.feature.identity.emailconfirmation.ui.analytics.EmailConfirmationAnalytics.WhenMappings.$EnumSwitchMapping$0[errorType.ordinal()];
        if (i == 1) {
            return kotlin.TuplesKt.to("CONFIRMATION_FAILED", "business_rule");
        }
        if (i == 2) {
            return kotlin.TuplesKt.to("NETWORK_ERROR", "network");
        }
        if (i == 3) {
            return kotlin.TuplesKt.to("INVALID_LINK", "business_rule");
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.TuplesKt.to("UNKNOWN_ERROR", "system");
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType.values().length];
            try {
                iArr[com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType.CONFIRMATION_FAILED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType.NETWORK_ERROR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType.INVALID_LINK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType.UNKNOWN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
