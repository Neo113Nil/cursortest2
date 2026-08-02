package com.paypal.oslo.feature.notificationcenter.di;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\r\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b¢\u0006\u0002\b\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/di/NotificationCenterNavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/feature/notificationcenter/domain/provider/NotificationCenterDeeplinkHandler;", "deeplinkHandler", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideEntryProviderInstaller", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/notificationcenter/domain/provider/NotificationCenterDeeplinkHandler;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public final class NotificationCenterNavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.notificationcenter.di.NotificationCenterNavigationModule INSTANCE = new com.paypal.oslo.feature.notificationcenter.di.NotificationCenterNavigationModule();

    private NotificationCenterNavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator, final com.paypal.oslo.feature.notificationcenter.domain.provider.NotificationCenterDeeplinkHandler deeplinkHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deeplinkHandler, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.notificationcenter.di.NotificationCenterNavigationModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.notificationcenter.di.NotificationCenterNavigationModule.m15826$r8$lambda$KR6Kujz2Xqe1J2YGuOpjMHBnhQ(com.paypal.oslo.core.navigation.AppNavigator.this, deeplinkHandler, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    /* renamed from: $r8$lambda$GdQFnri-wVEmBZKjYbg-awLLBPU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15825$r8$lambda$GdQFnriwVEmBZKjYbgawLLBPU(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$K-R6Kujz2Xqe1J2YGuOpjMHBnhQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15826$r8$lambda$KR6Kujz2Xqe1J2YGuOpjMHBnhQ(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.notificationcenter.domain.provider.NotificationCenterDeeplinkHandler notificationCenterDeeplinkHandler, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-449061304, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.notificationcenter.di.NotificationCenterNavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.notificationcenter.di.NotificationCenterNavigationModule.$r8$lambda$p1mMFXcUU0KbFaWZ1B76LRxTJ4c(com.paypal.oslo.core.navigation.AppNavigator.this, notificationCenterDeeplinkHandler, (com.paypal.oslo.feature.notificationcenter.api.navigation.NotificationCenterDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.notificationcenter.api.navigation.NotificationCenterDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.notificationcenter.api.navigation.NotificationCenterDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.notificationcenter.di.NotificationCenterNavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.notificationcenter.api.navigation.NotificationCenterDestination notificationCenterDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(notificationCenterDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.notificationcenter.api.navigation.NotificationCenterDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.notificationcenter.di.NotificationCenterNavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.notificationcenter.api.navigation.NotificationCenterDestination notificationCenterDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$YsaRrLk-JgJMjFZIO7idCrfTvI4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15827$r8$lambda$YsaRrLkJgJMjFZIO7idCrfTvI4(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.notificationcenter.di.NotificationCenterNavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.notificationcenter.di.NotificationCenterNavigationModule.m15825$r8$lambda$GdQFnriwVEmBZKjYbgawLLBPU((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$p1mMFXcUU0KbFaWZ1B76LRxTJ4c(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.notificationcenter.domain.provider.NotificationCenterDeeplinkHandler notificationCenterDeeplinkHandler, com.paypal.oslo.feature.notificationcenter.api.navigation.NotificationCenterDestination notificationCenterDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationCenterDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-449061304, i, -1, "com.paypal.oslo.feature.notificationcenter.di.NotificationCenterNavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NotificationCenterNavigationModule.kt:71)");
        }
        com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState rememberPushOptInState = com.paypal.oslo.feature.pushnotification.api.optin.RememberPushOptInStateKt.rememberPushOptInState(com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterOptInSource.INSTANCE, composer, 6, 0);
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.notificationcenter.di.NotificationCenterNavigationModule$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.notificationcenter.di.NotificationCenterNavigationModule.m15827$r8$lambda$YsaRrLkJgJMjFZIO7idCrfTvI4(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function0<kotlin.Unit> dropUnlessResumed = androidx.view.compose.DropUnlessLifecycleKt.dropUnlessResumed(null, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0, 1);
        boolean changedInstance = composer.changedInstance(notificationCenterDeeplinkHandler);
        com.paypal.oslo.feature.notificationcenter.di.NotificationCenterNavigationModule$provideEntryProviderInstaller$1$1$2$1 rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new com.paypal.oslo.feature.notificationcenter.di.NotificationCenterNavigationModule$provideEntryProviderInstaller$1$1$2$1(notificationCenterDeeplinkHandler);
            composer.updateRememberedValue(rememberedValue2);
        }
        com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterKt.NotificationCenter(null, null, rememberPushOptInState, dropUnlessResumed, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue2), composer, 0, 3);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
