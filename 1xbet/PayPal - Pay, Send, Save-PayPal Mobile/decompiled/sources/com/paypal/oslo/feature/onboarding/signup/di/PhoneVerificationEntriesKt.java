package com.paypal.oslo.feature.onboarding.signup.di;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "", "phoneOtpVerificationModalEntry", "(Landroidx/navigation3/runtime/EntryProviderScope;Lcom/paypal/oslo/core/navigation/AppNavigator;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhoneVerificationEntriesKt {
    /* JADX WARN: Type inference failed for: r1v0, types: [T, com.paypal.oslo.feature.onboarding.signup.di.PhoneVerificationEntriesKt$$ExternalSyntheticLambda3] */
    public static final void phoneOtpVerificationModalEntry(androidx.navigation3.runtime.EntryProviderScope<java.lang.Object> entryProviderScope, final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.signup.di.PhoneVerificationEntriesKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        };
        kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.signup.di.PhoneVerificationEntriesKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.onboarding.signup.di.PhoneVerificationEntriesKt.$r8$lambda$e02ZHoxCMXrrDmf0wyDt7j79Bts(kotlin.jvm.internal.Ref.ObjectRef.this);
            }
        };
        final java.util.Map bottomSheetMetadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default("", false, false, false, null, function0, function0, 22, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-101122594, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.onboarding.signup.di.PhoneVerificationEntriesKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.onboarding.signup.di.PhoneVerificationEntriesKt.$r8$lambda$fX7a3MvgF4HSOTZaLib8ztxDg3o(kotlin.jvm.internal.Ref.ObjectRef.this, appNavigator, (com.paypal.oslo.feature.onboarding.api.navigation.PhoneOtpVerificationModalDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.api.navigation.PhoneOtpVerificationModalDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.onboarding.api.navigation.PhoneOtpVerificationModalDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.onboarding.signup.di.PhoneVerificationEntriesKt$phoneOtpVerificationModalEntry$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.onboarding.api.navigation.PhoneOtpVerificationModalDestination phoneOtpVerificationModalDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(phoneOtpVerificationModalDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.onboarding.api.navigation.PhoneOtpVerificationModalDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.onboarding.signup.di.PhoneVerificationEntriesKt$phoneOtpVerificationModalEntry$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.onboarding.api.navigation.PhoneOtpVerificationModalDestination phoneOtpVerificationModalDestination) {
                return bottomSheetMetadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1NmRASRzlgwCJCgQW2vV9wa8kVY(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MxilAxZClh58x93R1qZZf9Wrsec(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay otpErrorDisplay, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otpErrorDisplay, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.paypal.oslo.feature.onboarding.otp.analytics.OtpVerificationAnalytics.INSTANCE.trackErrorDisplayed$onboarding_prodRelease(otpErrorDisplay, str, com.paypal.oslo.feature.onboarding.otp.analytics.OtpVerificationAnalytics.INSTANCE.getSCREEN_PHONE_CONFIRMATION(), com.paypal.oslo.feature.onboarding.otp.analytics.OtpVerificationAnalytics.INSTANCE.getMODULE_PHONE_OTP(), userIntentContext);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$X6pQ7gEP_77Lncoik-AOZ6OGpmQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16293$r8$lambda$X6pQ7gEP_77LncoikAOZ6OGpmQ(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        com.paypal.oslo.feature.onboarding.otp.analytics.OtpVerificationAnalytics.INSTANCE.trackItemPressed$onboarding_prodRelease(com.paypal.oslo.feature.onboarding.otp.analytics.OtpVerificationAnalytics.INSTANCE.getSCREEN_PHONE_CONFIRMATION(), com.paypal.oslo.feature.onboarding.otp.analytics.OtpVerificationAnalytics.INSTANCE.getITEM_DISMISS(), userIntentContext, businessFlowContext);
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.signup.di.PhoneVerificationEntriesKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.onboarding.signup.di.PhoneVerificationEntriesKt.$r8$lambda$1NmRASRzlgwCJCgQW2vV9wa8kVY((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$e02ZHoxCMXrrDmf0wyDt7j79Bts(kotlin.jvm.internal.Ref.ObjectRef objectRef) {
        ((kotlin.jvm.functions.Function0) objectRef.element).invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [T, kotlin.jvm.functions.Function0] */
    public static /* synthetic */ kotlin.Unit $r8$lambda$fX7a3MvgF4HSOTZaLib8ztxDg3o(kotlin.jvm.internal.Ref.ObjectRef objectRef, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.onboarding.api.navigation.PhoneOtpVerificationModalDestination phoneOtpVerificationModalDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneOtpVerificationModalDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-101122594, i, -1, "com.paypal.oslo.feature.onboarding.signup.di.phoneOtpVerificationModalEntry.<anonymous> (PhoneVerificationEntries.kt:43)");
        }
        final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext = com.paypal.oslo.feature.onboarding.analytics.AnalyticsContextMappersKt.toUserIntentContext(phoneOtpVerificationModalDestination.getUserIntent());
        com.paypal.oslo.feature.onboarding.api.analytics.BusinessFlow businessFlow = phoneOtpVerificationModalDestination.getBusinessFlow();
        final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext = businessFlow != null ? com.paypal.oslo.feature.onboarding.analytics.AnalyticsContextMappersKt.toBusinessFlowContext(businessFlow) : null;
        boolean changedInstance = composer.changedInstance(userIntentContext);
        boolean changedInstance2 = composer.changedInstance(businessFlowContext);
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changedInstance | changedInstance2 | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.signup.di.PhoneVerificationEntriesKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.onboarding.signup.di.PhoneVerificationEntriesKt.m16293$r8$lambda$X6pQ7gEP_77LncoikAOZ6OGpmQ(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.this, businessFlowContext, appNavigator);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        objectRef.element = (kotlin.jvm.functions.Function0) rememberedValue;
        java.lang.String m15902getPhoneNumbervCycbc = phoneOtpVerificationModalDestination.m15902getPhoneNumbervCycbc();
        java.lang.String countryCode = phoneOtpVerificationModalDestination.getCountryCode();
        int m15901getDialingCodeWKAk_us = phoneOtpVerificationModalDestination.m15901getDialingCodeWKAk_us();
        androidx.compose.ui.Modifier context = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(androidx.compose.ui.Modifier.INSTANCE, kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(com.paypal.oslo.feature.onboarding.otp.analytics.OtpVerificationAnalytics.INSTANCE.getSCREEN_PHONE_CONFIRMATION(), null, null, null, 14, null), userIntentContext, businessFlowContext}));
        boolean changedInstance3 = composer.changedInstance(userIntentContext);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.di.PhoneVerificationEntriesKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.signup.di.PhoneVerificationEntriesKt.$r8$lambda$MxilAxZClh58x93R1qZZf9Wrsec(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.this, (com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay) obj, (java.lang.String) obj2);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationScreenKt.m16414PhoneOtpVerificationScreenlwAJJJI(m15902getPhoneNumbervCycbc, countryCode, m15901getDialingCodeWKAk_us, appNavigator, context, (kotlin.jvm.functions.Function2) rememberedValue2, null, composer, 0, 64);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
