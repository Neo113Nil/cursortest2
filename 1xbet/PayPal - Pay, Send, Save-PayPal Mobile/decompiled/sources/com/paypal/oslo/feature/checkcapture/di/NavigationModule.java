package com.paypal.oslo.feature.checkcapture.di;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JJ\u0010\u0011\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\r\u0012\u0004\u0012\u00020\u000e0\fj\u0002`\u000f¢\u0006\u0002\b\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/di/NavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/feature/checkcapture/domain/remoteconfig/CheckCaptureConfig$Manager;", "configManager", "Lcom/paypal/oslo/feature/checkcapture/ingo/IngoSdkLauncher;", "ingoSdkLauncher", "Lcom/paypal/oslo/feature/checkcapture/ingo/IngoResultHandler;", "ingoResultHandler", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideEntryProviderInstaller", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/checkcapture/domain/remoteconfig/CheckCaptureConfig$Manager;Lcom/paypal/oslo/feature/checkcapture/ingo/IngoSdkLauncher;Lcom/paypal/oslo/feature/checkcapture/ingo/IngoResultHandler;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes11.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.checkcapture.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.checkcapture.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator, final com.paypal.oslo.feature.checkcapture.domain.remoteconfig.CheckCaptureConfig.Manager configManager, final com.paypal.oslo.feature.checkcapture.ingo.IngoSdkLauncher ingoSdkLauncher, final com.paypal.oslo.feature.checkcapture.ingo.IngoResultHandler ingoResultHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ingoSdkLauncher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ingoResultHandler, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.checkcapture.di.NavigationModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.checkcapture.di.NavigationModule.$r8$lambda$KkB379_hRByQIkPceQpQj0jjIW4(com.paypal.oslo.core.navigation.AppNavigator.this, configManager, ingoSdkLauncher, ingoResultHandler, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    /* renamed from: $r8$lambda$AsYY7Vwr-cmpe3T4mebkER7MlNw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13486$r8$lambda$AsYY7Vwrcmpe3T4mebkER7MlNw(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.checkcapture.domain.remoteconfig.CheckCaptureConfig.Manager manager, final com.paypal.oslo.feature.checkcapture.ingo.IngoSdkLauncher ingoSdkLauncher, final com.paypal.oslo.feature.checkcapture.ingo.IngoResultHandler ingoResultHandler, com.paypal.oslo.feature.checkcapture.api.navigation.CheckCaptureDestination checkCaptureDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkCaptureDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1069490970, i, -1, "com.paypal.oslo.feature.checkcapture.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:46)");
        }
        com.paypal.oslo.feature.checkcapture.ui.CheckCaptureWindowInsetsWrapperKt.CheckCaptureWindowInsetsWrapper(androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(170165098, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.checkcapture.di.NavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.checkcapture.di.NavigationModule.m13488$r8$lambda$PR6Ji_JDVs9ysdZKg6lr3X6UXw(com.paypal.oslo.core.navigation.AppNavigator.this, manager, ingoSdkLauncher, ingoResultHandler, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KkB379_hRByQIkPceQpQj0jjIW4(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.checkcapture.domain.remoteconfig.CheckCaptureConfig.Manager manager, final com.paypal.oslo.feature.checkcapture.ingo.IngoSdkLauncher ingoSdkLauncher, final com.paypal.oslo.feature.checkcapture.ingo.IngoResultHandler ingoResultHandler, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1069490970, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.checkcapture.di.NavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.checkcapture.di.NavigationModule.m13486$r8$lambda$AsYY7Vwrcmpe3T4mebkER7MlNw(com.paypal.oslo.core.navigation.AppNavigator.this, manager, ingoSdkLauncher, ingoResultHandler, (com.paypal.oslo.feature.checkcapture.api.navigation.CheckCaptureDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.checkcapture.api.navigation.CheckCaptureDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.checkcapture.api.navigation.CheckCaptureDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.checkcapture.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.checkcapture.api.navigation.CheckCaptureDestination checkCaptureDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(checkCaptureDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.checkcapture.api.navigation.CheckCaptureDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.checkcapture.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.checkcapture.api.navigation.CheckCaptureDestination checkCaptureDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Nedm0JlEt5TiYVPiTtA9g-bkZ0k, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13487$r8$lambda$Nedm0JlEt5TiYVPiTtA9gbkZ0k(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.checkcapture.di.NavigationModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.checkcapture.di.NavigationModule.$r8$lambda$s6FRNNFUGe5QQsrMTWGa4r7Xdlg((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$PR6Ji_JDVs9ysd-ZKg6lr3X6UXw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13488$r8$lambda$PR6Ji_JDVs9ysdZKg6lr3X6UXw(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.checkcapture.domain.remoteconfig.CheckCaptureConfig.Manager manager, com.paypal.oslo.feature.checkcapture.ingo.IngoSdkLauncher ingoSdkLauncher, com.paypal.oslo.feature.checkcapture.ingo.IngoResultHandler ingoResultHandler, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(170165098, i, -1, "com.paypal.oslo.feature.checkcapture.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous>.<anonymous> (NavigationModule.kt:47)");
            }
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.checkcapture.di.NavigationModule$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.checkcapture.di.NavigationModule.m13487$r8$lambda$Nedm0JlEt5TiYVPiTtA9gbkZ0k(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenKt.CheckCaptureScreen(function0, (com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0), manager, ingoSdkLauncher, ingoResultHandler, appNavigator, null, null, composer, 0, 192);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$s6FRNNFUGe5QQsrMTWGa4r7Xdlg(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }
}
