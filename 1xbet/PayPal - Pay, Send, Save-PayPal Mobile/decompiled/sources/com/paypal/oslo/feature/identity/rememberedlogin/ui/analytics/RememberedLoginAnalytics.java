package com.paypal.oslo.feature.identity.rememberedlogin.ui.analytics;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\tJ\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\tJ%\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0011J\r\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0013J%\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0011J\u0015\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001cJ)\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0 2\u0006\u0010\u001f\u001a\u00020\u0019H\u0002¢\u0006\u0004\b!\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/analytics/RememberedLoginAnalytics;", "", "<init>", "()V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ScreenAvailable;", "createScreenLoadedEvent", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ScreenAvailable;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ItemPressed;", "createLoginButtonClickedEvent", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ItemPressed;", "createChangeUserClickedEvent", "", "errorCode", "errorDescription", "errorType", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ModuleAppeared;", "createWelcomeBackErrorEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ModuleAppeared;", "createPasskeyAutoTriggeredEvent", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ModuleAppeared;", "createPasskeyCtaClickedEvent", "createPasskeyDismissClickedEvent", "createPasskeyErrorEvent", "createBiometricAutoTriggeredEvent", "createBiometricErrorEvent", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/AuthMethod;", "authMethod", "createAuthSuccessEvent", "(Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/AuthMethod;)Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ModuleAppeared;", "source", "createErrorBannerShownEvent", "p0", "Lkotlin/Triple;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/AuthMethod;)Lkotlin/Triple;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RememberedLoginAnalytics {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.identity.rememberedlogin.ui.analytics.RememberedLoginAnalytics INSTANCE = new com.paypal.oslo.feature.identity.rememberedlogin.ui.analytics.RememberedLoginAnalytics();

    private RememberedLoginAnalytics() {
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenAvailable createScreenLoadedEvent() {
        return new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenAvailable(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.identity.analytics.domain.Screen.WelcomeBack.getValue()), null, null, null, 14, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("identity", com.paypal.oslo.feature.identity.analytics.domain.Feature.ReturningUserLogin.getValue(), com.paypal.oslo.feature.identity.analytics.domain.Action.LoginWithSavedCreds.getValue()), null, null, null, 28, null);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed createLoginButtonClickedEvent() {
        return new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.identity.analytics.domain.Screen.WelcomeBack.getValue()), null, null, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.identity.analytics.domain.ItemName.Cta.getValue(), 0, 2, null), 6, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("identity", com.paypal.oslo.feature.identity.analytics.domain.Feature.ReturningUserLogin.getValue(), com.paypal.oslo.feature.identity.analytics.domain.Action.LoginWithSavedCreds.getValue()), null, 4, null);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed createChangeUserClickedEvent() {
        return new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.identity.analytics.domain.Screen.WelcomeBack.getValue()), null, null, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.identity.analytics.domain.ItemName.Edit.getValue(), 0, 2, null), 6, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("identity", com.paypal.oslo.feature.identity.analytics.domain.Feature.ReturningUserLogin.getValue(), com.paypal.oslo.feature.identity.analytics.domain.Action.LoginWithSavedCreds.getValue()), null, 4, null);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleAppeared createWelcomeBackErrorEvent(java.lang.String errorCode, java.lang.String errorDescription, java.lang.String errorType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDescription, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleAppeared(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.identity.analytics.domain.Screen.WelcomeBack.getValue()), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(com.paypal.oslo.feature.identity.analytics.domain.Screen.WelcomeBack.getValue(), 0, null, null, 14, null), null, null, 12, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("identity", com.paypal.oslo.feature.identity.analytics.domain.Feature.ReturningUserLogin.getValue(), com.paypal.oslo.feature.identity.analytics.domain.Action.LoginWithSavedCreds.getValue()), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext(errorCode, errorDescription, errorType, com.paypal.oslo.feature.identity.analytics.domain.ErrorSource.AuthAttempt.getValue())));
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleAppeared createPasskeyAutoTriggeredEvent() {
        return new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleAppeared(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.identity.analytics.domain.Screen.PasskeyPrompt.getValue()), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(com.paypal.oslo.feature.identity.analytics.domain.Screen.PasskeyPrompt.getValue(), 0, null, null, 14, null), null, null, 12, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("identity", com.paypal.oslo.feature.identity.analytics.domain.Feature.ReturningUserLogin.getValue(), com.paypal.oslo.feature.identity.analytics.domain.Action.LoginWithPasskey.getValue()), null, 4, null);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed createPasskeyCtaClickedEvent() {
        return new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.identity.analytics.domain.Screen.PasskeyPrompt.getValue()), null, null, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.identity.analytics.domain.ItemName.Cta.getValue(), 0, 2, null), 6, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("identity", com.paypal.oslo.feature.identity.analytics.domain.Feature.ReturningUserLogin.getValue(), com.paypal.oslo.feature.identity.analytics.domain.Action.LoginWithPasskey.getValue()), null, 4, null);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed createPasskeyDismissClickedEvent() {
        return new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.identity.analytics.domain.Screen.PasskeyPrompt.getValue()), null, null, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.identity.analytics.domain.ItemName.Dismiss.getValue(), 0, 2, null), 6, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("identity", com.paypal.oslo.feature.identity.analytics.domain.Feature.ReturningUserLogin.getValue(), com.paypal.oslo.feature.identity.analytics.domain.Action.LoginWithPasskey.getValue()), null, 4, null);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleAppeared createPasskeyErrorEvent(java.lang.String errorCode, java.lang.String errorDescription, java.lang.String errorType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDescription, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleAppeared(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.identity.analytics.domain.Screen.PasskeyPrompt.getValue()), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(com.paypal.oslo.feature.identity.analytics.domain.Screen.PasskeyPrompt.getValue(), 0, null, null, 14, null), null, null, 12, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("identity", com.paypal.oslo.feature.identity.analytics.domain.Feature.ReturningUserLogin.getValue(), com.paypal.oslo.feature.identity.analytics.domain.Action.LoginWithPasskey.getValue()), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext(errorCode, errorDescription, errorType, com.paypal.oslo.feature.identity.analytics.domain.ErrorSource.AuthAttempt.getValue())));
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleAppeared createBiometricAutoTriggeredEvent() {
        return new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleAppeared(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.identity.analytics.domain.Screen.BiometricFaceId.getValue()), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(com.paypal.oslo.feature.identity.analytics.domain.Screen.BiometricFaceId.getValue(), 0, null, null, 14, null), null, null, 12, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("identity", com.paypal.oslo.feature.identity.analytics.domain.Feature.ReturningUserBioLogin.getValue(), com.paypal.oslo.feature.identity.analytics.domain.Action.LoginWithFaceId.getValue()), null, 4, null);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleAppeared createBiometricErrorEvent(java.lang.String errorCode, java.lang.String errorDescription, java.lang.String errorType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDescription, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleAppeared(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.identity.analytics.domain.Screen.BiometricFaceId.getValue()), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(com.paypal.oslo.feature.identity.analytics.domain.Screen.BiometricFaceId.getValue(), 0, null, null, 14, null), null, null, 12, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("identity", com.paypal.oslo.feature.identity.analytics.domain.Feature.ReturningUserBioLogin.getValue(), com.paypal.oslo.feature.identity.analytics.domain.Action.LoginWithFaceId.getValue()), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext(errorCode, errorDescription, errorType, com.paypal.oslo.feature.identity.analytics.domain.ErrorSource.AuthAttempt.getValue())));
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleAppeared createAuthSuccessEvent(com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod authMethod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authMethod, "");
        kotlin.Triple<java.lang.String, java.lang.String, java.lang.String> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(authMethod);
        java.lang.String component1 = highSpeedVideoFpsRanges.component1();
        return new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleAppeared(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(component1), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(component1, 0, null, null, 14, null), null, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.identity.analytics.domain.ItemName.Cta.getValue(), 0, 2, null), 4, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("identity", highSpeedVideoFpsRanges.component2(), highSpeedVideoFpsRanges.component3()), null, 4, null);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleAppeared createErrorBannerShownEvent(com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.Triple<java.lang.String, java.lang.String, java.lang.String> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(source);
        java.lang.String component1 = highSpeedVideoFpsRanges.component1();
        return new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleAppeared(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(component1), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(component1, 0, null, null, 14, null), null, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("ErrorBannerShown", 0, 2, null), 4, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("identity", highSpeedVideoFpsRanges.component2(), highSpeedVideoFpsRanges.component3()), null, 4, null);
    }

    private static kotlin.Triple<java.lang.String, java.lang.String, java.lang.String> getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod p0) {
        int i = com.paypal.oslo.feature.identity.rememberedlogin.ui.analytics.RememberedLoginAnalytics.WhenMappings.$EnumSwitchMapping$0[p0.ordinal()];
        if (i == 1) {
            return new kotlin.Triple<>(com.paypal.oslo.feature.identity.analytics.domain.Screen.BiometricFaceId.getValue(), com.paypal.oslo.feature.identity.analytics.domain.Feature.ReturningUserBioLogin.getValue(), com.paypal.oslo.feature.identity.analytics.domain.Action.LoginWithFaceId.getValue());
        }
        if (i == 2) {
            return new kotlin.Triple<>(com.paypal.oslo.feature.identity.analytics.domain.Screen.PasskeyPrompt.getValue(), com.paypal.oslo.feature.identity.analytics.domain.Feature.ReturningUserLogin.getValue(), com.paypal.oslo.feature.identity.analytics.domain.Action.LoginWithPasskey.getValue());
        }
        if (i == 3 || i == 4) {
            return new kotlin.Triple<>(com.paypal.oslo.feature.identity.analytics.domain.Screen.WelcomeBack.getValue(), com.paypal.oslo.feature.identity.analytics.domain.Feature.ReturningUserLogin.getValue(), com.paypal.oslo.feature.identity.analytics.domain.Action.LoginWithSavedCreds.getValue());
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod.values().length];
            try {
                iArr[com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod.BIOMETRIC.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod.PASSKEY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod.OTP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod.PASSWORD.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
