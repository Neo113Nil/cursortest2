package com.paypal.oslo.feature.mosaic.di;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JB\u0010\u000f\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`\r¢\u0006\u0002\b\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/di/NavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/feature/verificationcapture/api/webview/VerificationCaptureWebViewConfigurer;", "configurer", "Lcom/paypal/oslo/feature/mosaic/widget/DocUploadWidgetFactoryProvider;", "widgetFactoryProvider", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideEntryProviderInstaller", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/verificationcapture/api/webview/VerificationCaptureWebViewConfigurer;Lcom/paypal/oslo/feature/mosaic/widget/DocUploadWidgetFactoryProvider;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.mosaic.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.mosaic.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator, final com.paypal.oslo.feature.verificationcapture.api.webview.VerificationCaptureWebViewConfigurer configurer, com.paypal.oslo.feature.mosaic.widget.DocUploadWidgetFactoryProvider widgetFactoryProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configurer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(widgetFactoryProvider, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.di.NavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.mosaic.di.NavigationModule.$r8$lambda$ZXSQiH4DyUVCli99IN6A9JUxSJM(com.paypal.oslo.core.navigation.AppNavigator.this, configurer, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AJ5w4rni_U2Hhv3XiVOTqbRj9Nw(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.verificationcapture.api.webview.VerificationCaptureWebViewConfigurer verificationCaptureWebViewConfigurer, final com.paypal.oslo.feature.mosaic.api.navigation.MosaicLegacyDestination mosaicLegacyDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicLegacyDestination, "");
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? composer.changed(mosaicLegacyDestination) : composer.changedInstance(mosaicLegacyDestination) ? 4 : 2);
        } else {
            i2 = i;
        }
        boolean z = true;
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1039894613, i2, -1, "com.paypal.oslo.feature.mosaic.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:45)");
            }
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !composer.changedInstance(mosaicLegacyDestination))) {
                z = false;
            }
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.di.NavigationModule$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.mosaic.di.NavigationModule.$r8$lambda$OuUFsZO1dKiZRUsaQKjlYHSpFMs(com.paypal.oslo.feature.mosaic.api.navigation.MosaicLegacyDestination.this, (com.paypal.oslo.feature.mosaic.ui.legacy.MosaicLegacyFlowViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.mosaic.ui.legacy.MosaicLegacyFlowViewModel mosaicLegacyFlowViewModel = (com.paypal.oslo.feature.mosaic.ui.legacy.MosaicLegacyFlowViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.mosaic.ui.legacy.MosaicLegacyFlowViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.di.NavigationModule$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.mosaic.di.NavigationModule.m15776$r8$lambda$lyqC3r4c7a5AZjBIasN71tXcVw((com.paypal.oslo.feature.mosaic.ui.webview.ComplianceWebViewViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue2;
            androidx.view.ViewModelStoreOwner current2 = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current2 == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.mosaic.ui.legacy.MosaicLegacyFlowScreenKt.MosaicLegacyFlowScreen(appNavigator, mosaicLegacyDestination, verificationCaptureWebViewConfigurer, mosaicLegacyFlowViewModel, (com.paypal.oslo.feature.mosaic.ui.webview.ComplianceWebViewViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.mosaic.ui.webview.ComplianceWebViewViewModel.class), current2, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current2, composer, 0), current2 instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras(), function12) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function12), composer, 0, 0), composer, (com.paypal.oslo.feature.mosaic.api.navigation.MosaicLegacyDestination.$stable << 3) | ((i2 << 3) & 112));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.mosaic.ui.legacy.MosaicLegacyFlowViewModel $r8$lambda$OuUFsZO1dKiZRUsaQKjlYHSpFMs(com.paypal.oslo.feature.mosaic.api.navigation.MosaicLegacyDestination mosaicLegacyDestination, com.paypal.oslo.feature.mosaic.ui.legacy.MosaicLegacyFlowViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(mosaicLegacyDestination);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZXSQiH4DyUVCli99IN6A9JUxSJM(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.verificationcapture.api.webview.VerificationCaptureWebViewConfigurer verificationCaptureWebViewConfigurer, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, true, null, null, false, 475, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1039894613, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.mosaic.di.NavigationModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.mosaic.di.NavigationModule.$r8$lambda$AJ5w4rni_U2Hhv3XiVOTqbRj9Nw(com.paypal.oslo.core.navigation.AppNavigator.this, verificationCaptureWebViewConfigurer, (com.paypal.oslo.feature.mosaic.api.navigation.MosaicLegacyDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.mosaic.api.navigation.MosaicLegacyDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.mosaic.api.navigation.MosaicLegacyDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.mosaic.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.mosaic.api.navigation.MosaicLegacyDestination mosaicLegacyDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(mosaicLegacyDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.mosaic.api.navigation.MosaicLegacyDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.mosaic.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.mosaic.api.navigation.MosaicLegacyDestination mosaicLegacyDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$lyqC3r4c7a5A-ZjBIasN71tXcVw, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.mosaic.ui.webview.ComplianceWebViewViewModel m15776$r8$lambda$lyqC3r4c7a5AZjBIasN71tXcVw(com.paypal.oslo.feature.mosaic.ui.webview.ComplianceWebViewViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(new com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUIModel((java.lang.String) null, false, false, false, false, 31, (kotlin.jvm.internal.DefaultConstructorMarker) null));
    }
}
