package com.paypal.oslo.feature.consumerprivacy.di;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u000b\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\r\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\fJ2\u0010\u000e\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\fJ2\u0010\u000f\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\fJ2\u0010\u0010\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/di/NavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideAccountVisibilityEntryProviderInstaller", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)Lkotlin/jvm/functions/Function1;", "providePersonalizedAdsEntryProviderInstaller", "providePersonalizedShoppingEntryProviderInstaller", "provideFaceScanEntryProviderInstaller", "provideConnectedAppsAndSitesEntryProviderInstaller"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes12.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.consumerprivacy.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.consumerprivacy.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideAccountVisibilityEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.di.NavigationModule$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.consumerprivacy.di.NavigationModule.$r8$lambda$_zLM9QdWjgpHFfjsGIubrp9GdwM(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> providePersonalizedAdsEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.di.NavigationModule$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.consumerprivacy.di.NavigationModule.$r8$lambda$rs9ff9iEcmXBhU_Yo39SVRSMZ74(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> providePersonalizedShoppingEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.di.NavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.consumerprivacy.di.NavigationModule.$r8$lambda$xn0RnyPbg8vDxUylefTfzloYy7c(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideFaceScanEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.di.NavigationModule$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.consumerprivacy.di.NavigationModule.$r8$lambda$b5FE8dwqn6rxA_40GoSmfRQV5Sk(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideConnectedAppsAndSitesEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.di.NavigationModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.consumerprivacy.di.NavigationModule.$r8$lambda$3nksKXjzXYiPkPV5gpXUWrLCYSI(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3nksKXjzXYiPkPV5gpXUWrLCYSI(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(408124204, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.consumerprivacy.di.NavigationModule$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.consumerprivacy.di.NavigationModule.m13502$r8$lambda$TXNoTips0TgcsZ45XZRyx3I8Xg(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.consumerprivacy.api.navigation.ConnectedAppsAndSitesDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.consumerprivacy.api.navigation.ConnectedAppsAndSitesDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.consumerprivacy.api.navigation.ConnectedAppsAndSitesDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.consumerprivacy.di.NavigationModule$provideConnectedAppsAndSitesEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.consumerprivacy.api.navigation.ConnectedAppsAndSitesDestination connectedAppsAndSitesDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(connectedAppsAndSitesDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.consumerprivacy.api.navigation.ConnectedAppsAndSitesDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.consumerprivacy.di.NavigationModule$provideConnectedAppsAndSitesEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.consumerprivacy.api.navigation.ConnectedAppsAndSitesDestination connectedAppsAndSitesDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$TXNoTips0TgcsZ45XZRyx3-I8Xg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13502$r8$lambda$TXNoTips0TgcsZ45XZRyx3I8Xg(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.consumerprivacy.api.navigation.ConnectedAppsAndSitesDestination connectedAppsAndSitesDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedAppsAndSitesDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(408124204, i, -1, "com.paypal.oslo.feature.consumerprivacy.di.NavigationModule.provideConnectedAppsAndSitesEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:95)");
        }
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.ConnectedAppsAndSitesScreen(appNavigator, (com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0), null, composer, 0, 4);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_zLM9QdWjgpHFfjsGIubrp9GdwM(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1904378060, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.consumerprivacy.di.NavigationModule$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.consumerprivacy.di.NavigationModule.$r8$lambda$sGzlPfxnZyYegwY9BI5mzMvZo8w(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.consumerprivacy.api.navigation.AccountVisibilityDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.consumerprivacy.api.navigation.AccountVisibilityDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.consumerprivacy.api.navigation.AccountVisibilityDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.consumerprivacy.di.NavigationModule$provideAccountVisibilityEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.consumerprivacy.api.navigation.AccountVisibilityDestination accountVisibilityDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(accountVisibilityDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.consumerprivacy.api.navigation.AccountVisibilityDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.consumerprivacy.di.NavigationModule$provideAccountVisibilityEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.consumerprivacy.api.navigation.AccountVisibilityDestination accountVisibilityDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$b5FE8dwqn6rxA_40GoSmfRQV5Sk(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1418956678, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.consumerprivacy.di.NavigationModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.consumerprivacy.di.NavigationModule.m13504$r8$lambda$nyeSpQB73Ol0E0wqT2anlfFtxA(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.consumerprivacy.api.navigation.FaceScanDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.consumerprivacy.api.navigation.FaceScanDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.consumerprivacy.api.navigation.FaceScanDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.consumerprivacy.di.NavigationModule$provideFaceScanEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.consumerprivacy.api.navigation.FaceScanDestination faceScanDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(faceScanDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.consumerprivacy.api.navigation.FaceScanDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.consumerprivacy.di.NavigationModule$provideFaceScanEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.consumerprivacy.api.navigation.FaceScanDestination faceScanDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$i4sBbRAYDc-QTgR9Ad95LEJJDNs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13503$r8$lambda$i4sBbRAYDcQTgR9Ad95LEJJDNs(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.consumerprivacy.api.navigation.PersonalizedAdsDestination personalizedAdsDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalizedAdsDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(394649580, i, -1, "com.paypal.oslo.feature.consumerprivacy.di.NavigationModule.providePersonalizedAdsEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:57)");
        }
        com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedAdsScreenKt.PersonalizedAdsScreen(appNavigator, null, null, composer, 0, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lpE7_FYUJ808y5j6MGYa_IF_HpQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.consumerprivacy.api.navigation.PersonalizedShoppingDestination personalizedShoppingDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalizedShoppingDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1298410294, i, -1, "com.paypal.oslo.feature.consumerprivacy.di.NavigationModule.providePersonalizedShoppingEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:69)");
        }
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt.PersonalizedShoppingScreen(appNavigator, null, (com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0), composer, 0, 2);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$nyeSpQB73Ol0E0wqT2-anlfFtxA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13504$r8$lambda$nyeSpQB73Ol0E0wqT2anlfFtxA(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.consumerprivacy.api.navigation.FaceScanDestination faceScanDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(faceScanDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1418956678, i, -1, "com.paypal.oslo.feature.consumerprivacy.di.NavigationModule.provideFaceScanEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:82)");
        }
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.consumerprivacy.ui.screens.FaceScanScreenKt.FaceScanScreen(appNavigator, null, (com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ManageFaceScanViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ManageFaceScanViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0), composer, 0, 2);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rs9ff9iEcmXBhU_Yo39SVRSMZ74(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(394649580, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.consumerprivacy.di.NavigationModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.consumerprivacy.di.NavigationModule.m13503$r8$lambda$i4sBbRAYDcQTgR9Ad95LEJJDNs(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.consumerprivacy.api.navigation.PersonalizedAdsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.consumerprivacy.api.navigation.PersonalizedAdsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.consumerprivacy.api.navigation.PersonalizedAdsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.consumerprivacy.di.NavigationModule$providePersonalizedAdsEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.consumerprivacy.api.navigation.PersonalizedAdsDestination personalizedAdsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(personalizedAdsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.consumerprivacy.api.navigation.PersonalizedAdsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.consumerprivacy.di.NavigationModule$providePersonalizedAdsEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.consumerprivacy.api.navigation.PersonalizedAdsDestination personalizedAdsDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sGzlPfxnZyYegwY9BI5mzMvZo8w(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.consumerprivacy.api.navigation.AccountVisibilityDestination accountVisibilityDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountVisibilityDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1904378060, i, -1, "com.paypal.oslo.feature.consumerprivacy.di.NavigationModule.provideAccountVisibilityEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:45)");
        }
        com.paypal.oslo.feature.consumerprivacy.ui.screens.AccountVisibilityScreenKt.AccountVisibilityScreen(appNavigator, null, null, composer, 0, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xn0RnyPbg8vDxUylefTfzloYy7c(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1298410294, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.consumerprivacy.di.NavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.consumerprivacy.di.NavigationModule.$r8$lambda$lpE7_FYUJ808y5j6MGYa_IF_HpQ(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.consumerprivacy.api.navigation.PersonalizedShoppingDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.consumerprivacy.api.navigation.PersonalizedShoppingDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.consumerprivacy.api.navigation.PersonalizedShoppingDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.consumerprivacy.di.NavigationModule$providePersonalizedShoppingEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.consumerprivacy.api.navigation.PersonalizedShoppingDestination personalizedShoppingDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(personalizedShoppingDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.consumerprivacy.api.navigation.PersonalizedShoppingDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.consumerprivacy.di.NavigationModule$providePersonalizedShoppingEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.consumerprivacy.api.navigation.PersonalizedShoppingDestination personalizedShoppingDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }
}
