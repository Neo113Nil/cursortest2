package com.paypal.oslo.feature.subscriptions.di;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JJ\u0010\u0011\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\r\u0012\u0004\u0012\u00020\u000e0\fj\u0002`\u000f¢\u0006\u0002\b\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015JB\u0010\u0018\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\r\u0012\u0004\u0012\u00020\u000e0\fj\u0002`\u000f¢\u0006\u0002\b\u00102\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/di/NavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/feature/subscriptions/di/ConfiguredBottomSheetConfigProvider;", "configuredBottomSheetConfigProvider", "Lcom/paypal/oslo/feature/subscriptions/shared/navigation/BulkUpdateFiNavigationCache;", "navigationCache", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/AnalyticsScreenProvider;", "analyticsScreenProvider", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideUpdateFIBottomSheetsEntryProvider", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/subscriptions/di/ConfiguredBottomSheetConfigProvider;Lcom/paypal/oslo/feature/subscriptions/shared/navigation/BulkUpdateFiNavigationCache;Lcom/paypal/oslo/feature/subscriptions/analytics/shared/AnalyticsScreenProvider;)Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/feature/subscriptions/shared/navigation/SuccessModalNavigationHandler;", "provideSuccessModalNavigationHandler", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)Lcom/paypal/oslo/feature/subscriptions/shared/navigation/SuccessModalNavigationHandler;", "appNavigator", "navigationHandler", "provideSuccessModalEntryProvider", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/subscriptions/shared/navigation/SuccessModalNavigationHandler;Lcom/paypal/oslo/feature/subscriptions/di/ConfiguredBottomSheetConfigProvider;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes15.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.subscriptions.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.subscriptions.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideUpdateFIBottomSheetsEntryProvider(final com.paypal.oslo.core.navigation.AppNavigator navigator, final com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider configuredBottomSheetConfigProvider, final com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache navigationCache, final com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider analyticsScreenProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuredBottomSheetConfigProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationCache, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsScreenProvider, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.di.NavigationModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.subscriptions.di.NavigationModule.$r8$lambda$i4W8lr84fPPGOeP_XGd0i3wMpMw(com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider.this, analyticsScreenProvider, navigationCache, navigator, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.subscriptions.shared.navigation.SuccessModalNavigationHandler provideSuccessModalNavigationHandler(com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new com.paypal.oslo.feature.subscriptions.shared.navigation.SuccessModalNavigationHandler(navigator);
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideSuccessModalEntryProvider(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.subscriptions.shared.navigation.SuccessModalNavigationHandler navigationHandler, final com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider configuredBottomSheetConfigProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuredBottomSheetConfigProvider, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.di.NavigationModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.subscriptions.di.NavigationModule.$r8$lambda$MNuo_ZYAGCHTj6fL1HIvAz8i2y8(com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider.this, appNavigator, navigationHandler, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    /* renamed from: $r8$lambda$3ceX2BNboG46pHOZ31bk-cq8xKs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19853$r8$lambda$3ceX2BNboG46pHOZ31bkcq8xKs(kotlin.jvm.internal.Ref.ObjectRef objectRef, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.subscriptions.shared.navigation.SuccessModalNavigationHandler successModalNavigationHandler) {
        com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType successModalType = (com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType) objectRef.element;
        if (successModalType != null) {
            successModalNavigationHandler.invoke(successModalType);
        } else {
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.di.NavigationModule$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.subscriptions.di.NavigationModule.$r8$lambda$y2VlzQ25W8cw17VAjERE0fsjooQ((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [T, com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType] */
    public static /* synthetic */ kotlin.Unit $r8$lambda$HBBTOqLxFWkOtBTL1N5JxNCnDho(final kotlin.jvm.internal.Ref.ObjectRef objectRef, final com.paypal.oslo.feature.subscriptions.shared.navigation.SuccessModalNavigationHandler successModalNavigationHandler, com.paypal.oslo.feature.subscriptions.shared.navigation.SuccessBottomSheetDestination successBottomSheetDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successBottomSheetDestination, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(successBottomSheetDestination) : composer.changedInstance(successBottomSheetDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2011180000, i, -1, "com.paypal.oslo.feature.subscriptions.di.NavigationModule.provideSuccessModalEntryProvider.<anonymous>.<anonymous> (NavigationModule.kt:109)");
            }
            objectRef.element = successBottomSheetDestination.getType();
            com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalKt.SuccessModal((com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType) objectRef.element, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.di.NavigationModule$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.subscriptions.di.NavigationModule.m19854$r8$lambda$VWdaPs5DFGAPO2HeXaYUMw_4H8(com.paypal.oslo.feature.subscriptions.shared.navigation.SuccessModalNavigationHandler.this, objectRef);
                }
            }, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MNuo_ZYAGCHTj6fL1HIvAz8i2y8(com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider configuredBottomSheetConfigProvider, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.subscriptions.shared.navigation.SuccessModalNavigationHandler successModalNavigationHandler, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        final java.util.Map baseSubscriptionsBottomSheetsMetadata$default = com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider.getBaseSubscriptionsBottomSheetsMetadata$default(configuredBottomSheetConfigProvider, null, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.di.NavigationModule$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.subscriptions.di.NavigationModule.m19853$r8$lambda$3ceX2BNboG46pHOZ31bkcq8xKs(kotlin.jvm.internal.Ref.ObjectRef.this, appNavigator, successModalNavigationHandler);
            }
        }, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.di.NavigationModule$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.subscriptions.di.NavigationModule.$r8$lambda$vo0SEHnvCI5dgb4RbPk0UvIbdkY(kotlin.jvm.internal.Ref.ObjectRef.this, appNavigator, successModalNavigationHandler);
            }
        }, 1, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2011180000, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.subscriptions.di.NavigationModule$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.subscriptions.di.NavigationModule.$r8$lambda$HBBTOqLxFWkOtBTL1N5JxNCnDho(kotlin.jvm.internal.Ref.ObjectRef.this, successModalNavigationHandler, (com.paypal.oslo.feature.subscriptions.shared.navigation.SuccessBottomSheetDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.shared.navigation.SuccessBottomSheetDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.subscriptions.shared.navigation.SuccessBottomSheetDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.subscriptions.di.NavigationModule$provideSuccessModalEntryProvider$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.subscriptions.shared.navigation.SuccessBottomSheetDestination successBottomSheetDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(successBottomSheetDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.subscriptions.shared.navigation.SuccessBottomSheetDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.subscriptions.di.NavigationModule$provideSuccessModalEntryProvider$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.subscriptions.shared.navigation.SuccessBottomSheetDestination successBottomSheetDestination) {
                return baseSubscriptionsBottomSheetsMetadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$VWdaPs5DFGAPO2HeXaYUMw_4H-8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19854$r8$lambda$VWdaPs5DFGAPO2HeXaYUMw_4H8(com.paypal.oslo.feature.subscriptions.shared.navigation.SuccessModalNavigationHandler successModalNavigationHandler, kotlin.jvm.internal.Ref.ObjectRef objectRef) {
        successModalNavigationHandler.invoke((com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType) objectRef.element);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dEGfKXRDMjekV2Y6rJQMOsNR6UE(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider analyticsScreenProvider, final com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache bulkUpdateFiNavigationCache, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFIBottomSheetDestination updateFIBottomSheetDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateFIBottomSheetDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(881282467, i, -1, "com.paypal.oslo.feature.subscriptions.di.NavigationModule.provideUpdateFIBottomSheetsEntryProvider.<anonymous>.<anonymous> (NavigationModule.kt:50)");
        }
        final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementTypeFromString = com.paypal.oslo.feature.subscriptions.shared.domain.AgreementTypeMapperKt.agreementTypeFromString(updateFIBottomSheetDestination.getAgreementType());
        androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsCompositionLocalKt.getLocalScreenAnalytics().provides(analyticsScreenProvider.updateFiScreen(agreementTypeFromString)), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1563488029, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.di.NavigationModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.subscriptions.di.NavigationModule.$r8$lambda$re61gUkZBsttiQyHwgF4R_JDRo0(com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache.this, updateFIBottomSheetDestination, agreementTypeFromString, appNavigator, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composer, androidx.compose.runtime.ProvidedValue.$stable | 48);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$i4W8lr84fPPGOeP_XGd0i3wMpMw(com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider configuredBottomSheetConfigProvider, final com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider analyticsScreenProvider, final com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache bulkUpdateFiNavigationCache, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map baseSubscriptionsBottomSheetsMetadata$default = com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider.getBaseSubscriptionsBottomSheetsMetadata$default(configuredBottomSheetConfigProvider, null, null, null, 7, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(881282467, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.subscriptions.di.NavigationModule$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.subscriptions.di.NavigationModule.$r8$lambda$dEGfKXRDMjekV2Y6rJQMOsNR6UE(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider.this, bulkUpdateFiNavigationCache, appNavigator, (com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFIBottomSheetDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFIBottomSheetDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFIBottomSheetDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.subscriptions.di.NavigationModule$provideUpdateFIBottomSheetsEntryProvider$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFIBottomSheetDestination updateFIBottomSheetDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(updateFIBottomSheetDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFIBottomSheetDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.subscriptions.di.NavigationModule$provideUpdateFIBottomSheetsEntryProvider$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFIBottomSheetDestination updateFIBottomSheetDestination) {
                return baseSubscriptionsBottomSheetsMetadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pPq7_NpmbfsaLheSktbse701l0M(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$re61gUkZBsttiQyHwgF4R_JDRo0(final com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache bulkUpdateFiNavigationCache, final com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFIBottomSheetDestination updateFIBottomSheetDestination, final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1563488029, i, -1, "com.paypal.oslo.feature.subscriptions.di.NavigationModule.provideUpdateFIBottomSheetsEntryProvider.<anonymous>.<anonymous>.<anonymous> (NavigationModule.kt:54)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            boolean changedInstance = composer.changedInstance(bulkUpdateFiNavigationCache);
            boolean changedInstance2 = composer.changedInstance(updateFIBottomSheetDestination);
            boolean changedInstance3 = composer.changedInstance(agreementType);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changedInstance | changedInstance2 | changedInstance3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.di.NavigationModule$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.di.NavigationModule.$r8$lambda$tiIs_XtesYCvj4LYOVBMrygbwRw(com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache.this, updateFIBottomSheetDestination, agreementType, (com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiBottomSheetScreenKt.UpdateFiBottomSheetScreen(updateFIBottomSheetDestination, appNavigator, (com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), fillMaxWidth$default, composer, 3072, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel $r8$lambda$tiIs_XtesYCvj4LYOVBMrygbwRw(com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache bulkUpdateFiNavigationCache, com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFIBottomSheetDestination updateFIBottomSheetDestination, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(updateFIBottomSheetDestination.getAgreementIds(), agreementType, bulkUpdateFiNavigationCache.getAgreementsMap(), updateFIBottomSheetDestination.getBulkFiCommonFiId(), updateFIBottomSheetDestination.getSource());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vo0SEHnvCI5dgb4RbPk0UvIbdkY(kotlin.jvm.internal.Ref.ObjectRef objectRef, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.subscriptions.shared.navigation.SuccessModalNavigationHandler successModalNavigationHandler) {
        com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType successModalType = (com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType) objectRef.element;
        if (successModalType != null) {
            successModalNavigationHandler.invoke(successModalType);
        } else {
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.di.NavigationModule$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.subscriptions.di.NavigationModule.$r8$lambda$pPq7_NpmbfsaLheSktbse701l0M((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$y2VlzQ25W8cw17VAjERE0fsjooQ(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }
}
