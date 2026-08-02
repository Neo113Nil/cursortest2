package com.paypal.oslo.feature.home.di;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JB\u0010\u000f\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`\r¢\u0006\u0002\b\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/home/di/NavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/feature/ads/api/provider/AdWidgetProvider;", "adWidgetProvider", "Lcom/paypal/oslo/feature/home/featureflags/HomeConfigManager;", "homeConfigManager", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideEntryProviderInstaller", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/ads/api/provider/AdWidgetProvider;Lcom/paypal/oslo/feature/home/featureflags/HomeConfigManager;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes12.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.home.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.home.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator, final com.paypal.oslo.feature.ads.api.provider.AdWidgetProvider adWidgetProvider, final com.paypal.oslo.feature.home.featureflags.HomeConfigManager homeConfigManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adWidgetProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(homeConfigManager, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.di.NavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.home.di.NavigationModule.m14866$r8$lambda$GM5AoMzbNDomh9AaTxDPgHks3M(com.paypal.oslo.feature.home.featureflags.HomeConfigManager.this, navigator, adWidgetProvider, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1hXrmrtLaou9AmNGQuRlSCxCW6w(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.di.NavigationModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.home.di.NavigationModule.m14867$r8$lambda$xyc2Oz3K01PYDi15K1qwGcIbKU((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$64H9kzlHaoTlpECac31v8-UD_7s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14865$r8$lambda$64H9kzlHaoTlpECac31v8UD_7s(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.ads.api.provider.AdWidgetProvider adWidgetProvider, com.paypal.oslo.feature.home.api.navigation.HomeDestination homeDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(homeDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1081732464, i, -1, "com.paypal.oslo.feature.home.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:49)");
            }
            com.paypal.oslo.feature.home.ui.HomeScreenKt.HomeScreen(appNavigator, adWidgetProvider, null, composer, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8m7E1tzjlZWjTafxfBrLUwu7jGc(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.home.api.navigation.HomeWebViewDestination homeWebViewDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(homeWebViewDestination, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(homeWebViewDestination) : composer.changedInstance(homeWebViewDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1813104510, i, -1, "com.paypal.oslo.feature.home.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:57)");
            }
            java.lang.String url = homeWebViewDestination.getUrl();
            java.lang.String title = homeWebViewDestination.getTitle();
            java.lang.String source = homeWebViewDestination.getSource();
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.home.di.NavigationModule$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.home.di.NavigationModule.$r8$lambda$1hXrmrtLaou9AmNGQuRlSCxCW6w(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.home.ui.webview.HomeWebViewScreenKt.HomeWebViewScreen(url, title, source, (kotlin.jvm.functions.Function0) rememberedValue, null, composer, 0, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$GM5AoM-zbNDomh9AaTxDPgHks3M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14866$r8$lambda$GM5AoMzbNDomh9AaTxDPgHks3M(com.paypal.oslo.feature.home.featureflags.HomeConfigManager homeConfigManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.ads.api.provider.AdWidgetProvider adWidgetProvider, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map<java.lang.String, java.lang.Object> l1PlainMetadata = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l1PlainMetadata();
        if (!homeConfigManager.isLightThemeEnabled()) {
            l1PlainMetadata = kotlin.collections.MapsKt.plus(l1PlainMetadata, com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.navigationMetadata(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.di.NavigationModule$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.home.di.NavigationModule.$r8$lambda$T8bKCK9X2wQz6Gxe6HTMNSj0myM((com.paypal.oslo.core.navigation.NavigationMetadataBuilder) obj);
                }
            }));
        }
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1081732464, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.home.di.NavigationModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.home.di.NavigationModule.m14865$r8$lambda$64H9kzlHaoTlpECac31v8UD_7s(com.paypal.oslo.core.navigation.AppNavigator.this, adWidgetProvider, (com.paypal.oslo.feature.home.api.navigation.HomeDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.home.api.navigation.HomeDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.home.api.navigation.HomeDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.home.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.home.api.navigation.HomeDestination homeDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(homeDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.home.api.navigation.HomeDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.home.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.home.api.navigation.HomeDestination homeDestination) {
                return l1PlainMetadata;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1813104510, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.home.di.NavigationModule$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.home.di.NavigationModule.$r8$lambda$8m7E1tzjlZWjTafxfBrLUwu7jGc(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.home.api.navigation.HomeWebViewDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.home.api.navigation.HomeWebViewDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.home.api.navigation.HomeWebViewDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.home.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.home.api.navigation.HomeWebViewDestination homeWebViewDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(homeWebViewDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.home.api.navigation.HomeWebViewDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.home.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$4
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.home.api.navigation.HomeWebViewDestination homeWebViewDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$T8bKCK9X2wQz6Gxe6HTMNSj0myM(com.paypal.oslo.core.navigation.NavigationMetadataBuilder navigationMetadataBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationMetadataBuilder, "");
        navigationMetadataBuilder.forceDarkTheme();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$xyc2Oz3K01PYDi15K-1qwGcIbKU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14867$r8$lambda$xyc2Oz3K01PYDi15K1qwGcIbKU(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }
}
