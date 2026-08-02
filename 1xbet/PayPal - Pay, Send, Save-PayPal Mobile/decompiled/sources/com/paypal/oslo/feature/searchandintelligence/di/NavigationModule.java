package com.paypal.oslo.feature.searchandintelligence.di;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\r\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b¢\u0006\u0002\b\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/di/NavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/searchandintelligence/ui/renderer/UiComponentRendererRegistry;", "rendererRegistry", "Lcom/paypal/oslo/feature/searchandintelligence/ui/PrivacyDisclosureOpener;", "privacyDisclosureOpener", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideEntryProviderInstaller", "(Lcom/paypal/oslo/feature/searchandintelligence/ui/renderer/UiComponentRendererRegistry;Lcom/paypal/oslo/feature/searchandintelligence/ui/PrivacyDisclosureOpener;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes14.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.searchandintelligence.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.searchandintelligence.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstaller(final com.paypal.oslo.feature.searchandintelligence.ui.renderer.UiComponentRendererRegistry rendererRegistry, final com.paypal.oslo.feature.searchandintelligence.ui.PrivacyDisclosureOpener privacyDisclosureOpener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rendererRegistry, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(privacyDisclosureOpener, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.di.NavigationModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.searchandintelligence.di.NavigationModule.$r8$lambda$7XlyZU6XLGBhItqap7cvG93Yzyc(com.paypal.oslo.feature.searchandintelligence.ui.renderer.UiComponentRendererRegistry.this, privacyDisclosureOpener, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7XlyZU6XLGBhItqap7cvG93Yzyc(final com.paypal.oslo.feature.searchandintelligence.ui.renderer.UiComponentRendererRegistry uiComponentRendererRegistry, final com.paypal.oslo.feature.searchandintelligence.ui.PrivacyDisclosureOpener privacyDisclosureOpener, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.di.NavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.searchandintelligence.di.NavigationModule.$r8$lambda$cY8edLgRhwr2H921kq3p_wl6MqU((com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination) obj);
            }
        };
        final java.util.Map plus = kotlin.collections.MapsKt.plus(com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l0Metadata(), com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.navigationMetadata(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.di.NavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.searchandintelligence.di.NavigationModule.$r8$lambda$P4E0jDtXBDjEj_jmzRwonSEeAl4((com.paypal.oslo.core.navigation.NavigationMetadataBuilder) obj);
            }
        }));
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.class), function1, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.searchandintelligence.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$1
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination searchAndIntelligenceDestination) {
                return plus;
            }
        }, (kotlin.jvm.functions.Function3) androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1775345549, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.searchandintelligence.di.NavigationModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.searchandintelligence.di.NavigationModule.$r8$lambda$xAba0XLnBEedHDcg4tLer82b5Bk(com.paypal.oslo.feature.searchandintelligence.ui.renderer.UiComponentRendererRegistry.this, privacyDisclosureOpener, (com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$P4E0jDtXBDjEj_jmzRwonSEeAl4(com.paypal.oslo.core.navigation.NavigationMetadataBuilder navigationMetadataBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationMetadataBuilder, "");
        navigationMetadataBuilder.forceDarkTheme();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$cY8edLgRhwr2H921kq3p_wl6MqU(com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination searchAndIntelligenceDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchAndIntelligenceDestination, "");
        java.lang.String getHighResolutionOutputSizeshNQ4ISI = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.class).getGetHighResolutionOutputSizeshNQ4ISI();
        if (getHighResolutionOutputSizeshNQ4ISI != null) {
            return getHighResolutionOutputSizeshNQ4ISI;
        }
        java.lang.String name2 = com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.class.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        return name2;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xAba0XLnBEedHDcg4tLer82b5Bk(com.paypal.oslo.feature.searchandintelligence.ui.renderer.UiComponentRendererRegistry uiComponentRendererRegistry, com.paypal.oslo.feature.searchandintelligence.ui.PrivacyDisclosureOpener privacyDisclosureOpener, com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination searchAndIntelligenceDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchAndIntelligenceDestination, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(searchAndIntelligenceDestination) : composer.changedInstance(searchAndIntelligenceDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1775345549, i, -1, "com.paypal.oslo.feature.searchandintelligence.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:52)");
            }
            com.paypal.oslo.feature.searchandintelligence.ui.SearchAndIntelligenceScreenKt.SearchAndIntelligenceScreen(uiComponentRendererRegistry, privacyDisclosureOpener, searchAndIntelligenceDestination, null, composer, (com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.$stable << 6) | ((i << 6) & 896), 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
