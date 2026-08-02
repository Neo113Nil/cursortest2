package com.paypal.oslo.feature.pushnotification.preferences.di;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u000b\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/preferences/di/PushPreferencesNavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideEntryProviderInstaller", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public final class PushPreferencesNavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.pushnotification.preferences.di.PushPreferencesNavigationModule INSTANCE = new com.paypal.oslo.feature.pushnotification.preferences.di.PushPreferencesNavigationModule();

    private PushPreferencesNavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.pushnotification.preferences.di.PushPreferencesNavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.pushnotification.preferences.di.PushPreferencesNavigationModule.m17744$r8$lambda$HajsOv8X3kJJiWntJPC0HqB3p4(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    /* renamed from: $r8$lambda$-uZJQE2OaxaR35yeqb_6J87vnKk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17743$r8$lambda$uZJQE2OaxaR35yeqb_6J87vnKk(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.pushnotification.api.PushNotificationPreferencesDestination pushNotificationPreferencesDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationPreferencesDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-435308596, i, -1, "com.paypal.oslo.feature.pushnotification.preferences.di.PushPreferencesNavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (PushPreferencesNavigationModule.kt:60)");
            }
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.pushnotification.preferences.di.PushPreferencesNavigationModule$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.pushnotification.preferences.di.PushPreferencesNavigationModule.m17745$r8$lambda$gZDAAjnwHmffNm7WYjc0Ck8u7w(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.pushnotification.preferences.ui.NotificationPreferencesKt.NotificationPreferences(null, null, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0, 3);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$HajsOv8X3kJJiWn-tJPC0HqB3p4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17744$r8$lambda$HajsOv8X3kJJiWntJPC0HqB3p4(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-435308596, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.pushnotification.preferences.di.PushPreferencesNavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.pushnotification.preferences.di.PushPreferencesNavigationModule.m17743$r8$lambda$uZJQE2OaxaR35yeqb_6J87vnKk(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.pushnotification.api.PushNotificationPreferencesDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.pushnotification.api.PushNotificationPreferencesDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.pushnotification.api.PushNotificationPreferencesDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.pushnotification.preferences.di.PushPreferencesNavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.pushnotification.api.PushNotificationPreferencesDestination pushNotificationPreferencesDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(pushNotificationPreferencesDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.pushnotification.api.PushNotificationPreferencesDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.pushnotification.preferences.di.PushPreferencesNavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.pushnotification.api.PushNotificationPreferencesDestination pushNotificationPreferencesDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eOAoUOCKX3VhAf2Eedb4MOwPzwg(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$g-ZDAAjnwHmffNm7WYjc0Ck8u7w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17745$r8$lambda$gZDAAjnwHmffNm7WYjc0Ck8u7w(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.pushnotification.preferences.di.PushPreferencesNavigationModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.pushnotification.preferences.di.PushPreferencesNavigationModule.$r8$lambda$eOAoUOCKX3VhAf2Eedb4MOwPzwg((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }
}
