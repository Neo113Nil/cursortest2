package com.paypal.oslo.feature.onboarding.otp.analytics;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ1\u0010#\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u00152\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\bH\u0002¢\u0006\u0004\b#\u0010$R\u0017\u0010%\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u001a\u0010+\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010/\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u001a\u00101\u001a\u00020\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u00105\u001a\u00020\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b6\u00104"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/otp/analytics/OtpVerificationAnalytics;", "", "<init>", "()V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Screen;", "screenContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "item", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "userIntentContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;", "businessFlowContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ItemPressed;", "trackItemPressed$onboarding_prodRelease", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Screen;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;)Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ItemPressed;", "", "errorCode", "errorDescription", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ErrorShown;", "trackPageError$onboarding_prodRelease", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Screen;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;)Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ErrorShown;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", com.paypal.oslo.feature.p2p.analytics.P2pReviewAnalytics.FEATURE_MODULE, "trackFieldError$onboarding_prodRelease", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Screen;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;)Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ErrorShown;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/OtpErrorDisplay;", "error", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "trackErrorDisplayed$onboarding_prodRelease", "(Lcom/paypal/oslo/feature/onboarding/signup/ui/model/OtpErrorDisplay;Ljava/lang/String;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Screen;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;)Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ErrorShown;", "p0", "p1", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "p2", "p3", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Screen;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;)Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ErrorShown;", "SCREEN_EMAIL_CONFIRMATION", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Screen;", "getSCREEN_EMAIL_CONFIRMATION", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Screen;", "SCREEN_PHONE_CONFIRMATION", "getSCREEN_PHONE_CONFIRMATION", "ITEM_DISMISS", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getITEM_DISMISS", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "ITEM_RESEND_CODE", "getITEM_RESEND_CODE", "MODULE_PHONE_OTP", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "getMODULE_PHONE_OTP", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "MODULE_EMAIL_OTP", "getMODULE_EMAIL_OTP"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OtpVerificationAnalytics {
    public static final int $stable;
    public static final com.paypal.oslo.feature.onboarding.otp.analytics.OtpVerificationAnalytics INSTANCE = new com.paypal.oslo.feature.onboarding.otp.analytics.OtpVerificationAnalytics();
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen SCREEN_EMAIL_CONFIRMATION = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen("email_confirmation");
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen SCREEN_PHONE_CONFIRMATION = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.onboarding.api.analytics.OnboardingAnalytics.PHONE_OTP_SCREEN_ID);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item ITEM_DISMISS = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("dismiss", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item ITEM_RESEND_CODE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("resend_code", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module MODULE_PHONE_OTP = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("phone_otp", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module MODULE_EMAIL_OTP = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("email_otp", 0, null, null, 14, null);

    private OtpVerificationAnalytics() {
    }

    static {
        int i = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable;
        $stable = i | i | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen.$stable;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen getSCREEN_EMAIL_CONFIRMATION() {
        return SCREEN_EMAIL_CONFIRMATION;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen getSCREEN_PHONE_CONFIRMATION() {
        return SCREEN_PHONE_CONFIRMATION;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getITEM_DISMISS() {
        return ITEM_DISMISS;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getITEM_RESEND_CODE() {
        return ITEM_RESEND_CODE;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getMODULE_PHONE_OTP() {
        return MODULE_PHONE_OTP;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getMODULE_EMAIL_OTP() {
        return MODULE_EMAIL_OTP;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed trackItemPressed$onboarding_prodRelease(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen screenContext, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntentContext, "");
        com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed itemPressed = new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(screenContext, null, null, item, 6, null), userIntentContext, kotlin.collections.CollectionsKt.listOfNotNull(businessFlowContext));
        itemPressed.track(com.paypal.oslo.feature.onboarding.AnalyticsTrackerKt.analyticsTracker);
        return itemPressed;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ErrorShown trackPageError$onboarding_prodRelease(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen screenContext, java.lang.String errorCode, java.lang.String errorDescription, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDescription, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntentContext, "");
        return Camera2StreamConfigurationMap(screenContext, null, new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext(errorCode, errorDescription, "page", screenContext.getName()), userIntentContext);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ErrorShown trackFieldError$onboarding_prodRelease(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen screenContext, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module module, java.lang.String errorCode, java.lang.String errorDescription, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(module, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDescription, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntentContext, "");
        return Camera2StreamConfigurationMap(screenContext, module, new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext(errorCode, errorDescription, "field", module.getName()), userIntentContext);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ErrorShown trackErrorDisplayed$onboarding_prodRelease(com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay error, java.lang.String description, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen screenContext, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module module, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(module, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntentContext, "");
        if (error instanceof com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay.PageLevel) {
            return trackPageError$onboarding_prodRelease(screenContext, ((com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay.PageLevel) error).getErrorCode(), description, userIntentContext);
        }
        if (!(error instanceof com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay.FieldLevel)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return trackFieldError$onboarding_prodRelease(screenContext, module, ((com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay.FieldLevel) error).getErrorCode(), description, userIntentContext);
    }

    private static com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ErrorShown Camera2StreamConfigurationMap(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen p0, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module p1, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext p2, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext p3) {
        com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ErrorShown errorShown = new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ErrorShown(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(p0, p1, null, null, 12, null), p3, p2);
        errorShown.track(com.paypal.oslo.feature.onboarding.AnalyticsTrackerKt.analyticsTracker);
        return errorShown;
    }
}
