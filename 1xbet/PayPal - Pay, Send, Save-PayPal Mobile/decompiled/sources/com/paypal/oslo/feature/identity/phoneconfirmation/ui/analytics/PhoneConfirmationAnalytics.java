package com.paypal.oslo.feature.identity.phoneconfirmation.ui.analytics;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/analytics/PhoneConfirmationAnalytics;", "", "<init>", "()V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ModuleAppeared;", "createConfirmationInitiatedEvent", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ModuleAppeared;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError;", "error", "createConfirmationFailedEvent", "(Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError;)Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ModuleAppeared;", "Lkotlin/Pair;", "", "errorCodeAndType$identity_prodRelease", "(Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError;)Lkotlin/Pair;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhoneConfirmationAnalytics {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.identity.phoneconfirmation.ui.analytics.PhoneConfirmationAnalytics INSTANCE = new com.paypal.oslo.feature.identity.phoneconfirmation.ui.analytics.PhoneConfirmationAnalytics();

    private PhoneConfirmationAnalytics() {
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleAppeared createConfirmationInitiatedEvent() {
        return new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleAppeared(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.identity.analytics.domain.Screen.PhoneConfirmation.getValue()), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(com.paypal.oslo.feature.identity.analytics.domain.Screen.PhoneConfirmation.getValue(), 0, null, null, 14, null), null, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_OUTCOME_SUCCESS, 0, 2, null), 4, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("identity", com.paypal.oslo.feature.identity.analytics.domain.Feature.PhoneConfirmation.getValue(), "initiated"), null, 4, null);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleAppeared createConfirmationFailedEvent(com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.identity.analytics.domain.Screen.PhoneConfirmation.getValue()), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(com.paypal.oslo.feature.identity.analytics.domain.Screen.PhoneConfirmation.getValue(), 0, null, null, 14, null), null, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_OUTCOME_ERROR, 0, 2, null), 4, null);
        com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext = new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("identity", com.paypal.oslo.feature.identity.analytics.domain.Feature.PhoneConfirmation.getValue(), "error");
        kotlin.Pair<java.lang.String, java.lang.String> errorCodeAndType$identity_prodRelease = errorCodeAndType$identity_prodRelease(error);
        java.lang.String component1 = errorCodeAndType$identity_prodRelease.component1();
        return new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleAppeared(uIContext, userIntentContext, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext(component1, component1, errorCodeAndType$identity_prodRelease.component2(), error instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Validation ? "app_ui" : "api_call")));
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> errorCodeAndType$identity_prodRelease(com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        if (!(error instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Api)) {
            if (error instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Validation.InvalidPhoneContact) {
                return kotlin.TuplesKt.to("INVALID_PHONE_CONTACT", "validation");
            }
            if (error instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Validation.InvalidOTPCode) {
                return kotlin.TuplesKt.to("INVALID_OTP_CODE", "validation");
            }
            if (error instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Validation.InvalidDeviceId) {
                return kotlin.TuplesKt.to("INVALID_DEVICE_ID", "validation");
            }
            if (error instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business.CodeExpired) {
                return kotlin.TuplesKt.to("CODE_EXPIRED", "business_rule");
            }
            if (error instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business.TooManyAttempts) {
                return kotlin.TuplesKt.to("TOO_MANY_ATTEMPTS", "business_rule");
            }
            if (error instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business.PhoneNumberBlocked) {
                return kotlin.TuplesKt.to("PHONE_NUMBER_BLOCKED", "business_rule");
            }
            if (error instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business.InvalidCode) {
                return kotlin.TuplesKt.to("INVALID_CODE", "business_rule");
            }
            if (error instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Unauthorized) {
                return kotlin.TuplesKt.to(com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.UNAUTHORIZED, "auth");
            }
            if (error instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.ServerError) {
                return kotlin.TuplesKt.to("SERVER_ERROR", "system");
            }
            if (error instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Unknown) {
                return kotlin.TuplesKt.to("UNKNOWN_ERROR", "system");
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.identity.shared.domain.model.ApiError error2 = ((com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Api) error).getError();
        if (error2 instanceof com.paypal.oslo.feature.identity.shared.domain.model.ApiError.NetworkError) {
            return kotlin.TuplesKt.to("NETWORK_ERROR", "network");
        }
        if (error2 instanceof com.paypal.oslo.feature.identity.shared.domain.model.ApiError.HttpError) {
            return kotlin.TuplesKt.to("HTTP_ERROR", "http");
        }
        if (error2 instanceof com.paypal.oslo.feature.identity.shared.domain.model.ApiError.UnknownError) {
            return kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.Constants.UNKNOWN_API_ERROR, "system");
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
