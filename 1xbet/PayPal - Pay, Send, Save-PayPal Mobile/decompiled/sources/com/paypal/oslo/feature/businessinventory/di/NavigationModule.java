package com.paypal.oslo.feature.businessinventory.di;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JD\u0010\u000f\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`\r¢\u0006\u0002\b\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/di/NavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "appNavigator", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/businessinventory/api/common/BusinessInventoryFeatureGateManager;", "businessInventoryFeatureGateManager", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideBusinessInventoryEntry", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Landroid/content/Context;Lcom/paypal/oslo/feature/businessinventory/api/common/BusinessInventoryFeatureGateManager;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes11.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.businessinventory.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.businessinventory.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideBusinessInventoryEntry(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, @dagger.hilt.android.qualifiers.ApplicationContext final android.content.Context context, final com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager businessInventoryFeatureGateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessInventoryFeatureGateManager, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda79
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$uBXYvwRTyLh3UhDDoTtIKVRFQlo(com.paypal.oslo.core.navigation.AppNavigator.this, businessInventoryFeatureGateManager, context, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    /* renamed from: $r8$lambda$-XGEmPgQ4Ki9m03I4ExoLm_4U_A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12989$r8$lambda$XGEmPgQ4Ki9m03I4ExoLm_4U_A(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str) {
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businessinventory.navigation.result.BusinessInventoryAddItemNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda60
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.m12991$r8$lambda$6tCGLRbXb2nRCCkpARqloBda4U((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$11p_6VQkprF6pL-u9Yagz2pLwN8, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel m12990$r8$lambda$11p_6VQkprF6pLu9Yagz2pLwN8(com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryEditServiceDestination businessInventoryEditServiceDestination, com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(new com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType.Edit(businessInventoryEditServiceDestination.getLibraryItem()));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1JayMdfCgesExPH13tGzMcjn11w(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda59
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$LeVnKTmdGHaId6YkqdfSa0Ct99c((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2_iLncX9QfrxCpfk5MvueCgeL_s(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.m13002$r8$lambda$d4mozNuePFYIjpEXlWK_8DXOts(com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3thAGscjqhrV4sm4Z7wMMB1pCKU(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.m13015$r8$lambda$ww2uQuOCJ2UZ2BG938Fuehkuc((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5IpgXYPgPZ8UIY9Eve2QFSYVZg0(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda68
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$xnsbu1H5ya9DlXPAe1DnkHuQIdo(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5L27vKEZWOQTsaGynkV1ebOudeM(com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager businessInventoryFeatureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventoryTaxListDestination businessInventoryTaxListDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessInventoryTaxListDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(762730124, i, -1, "com.paypal.oslo.feature.businessinventory.di.NavigationModule.businessInventoryTaxListDestination.<anonymous> (NavigationModule.kt:277)");
        }
        com.paypal.oslo.feature.businessinventory.ui.common.FeatureDisabledScreenKt.ShowContentOrFeatureDisabledScreen(businessInventoryFeatureGateManager.isFeatureEnabled(), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_taxes_feature_name, composer, 0), appNavigator, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(595979707, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.m13003$r8$lambda$hdKuM3Cms5iEyk1Mj9bgs5TR5A(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composer, 3072);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6sDWaxngVVLUy16mNkfbEDwZic4(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventorySelectTaxDestination(str));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$6tCGLR-bXb2nRCCkpARqloBda4U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12991$r8$lambda$6tCGLRbXb2nRCCkpARqloBda4U(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryAddProductDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7G8K8wd8UhnYIlyqoBrfbxcavfw(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7jb4Xsmlf4rBsJIh1ONbp8Vd3WU(com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.View view, com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryEditTaxDestination(view, taxOption));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8W64BikVIJ4baxNejVzdVSAOpJs(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$FduQiBlpy9v7v57PwZstBzGnZq8((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AWE931uQw5dURFOdk6xqudNOIks(final com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryEditTaxDestination businessInventoryEditTaxDestination, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-566138693, i, -1, "com.paypal.oslo.feature.businessinventory.di.NavigationModule.businessInventoryEditTaxDestination.<anonymous>.<anonymous> (NavigationModule.kt:374)");
            }
            boolean changedInstance = composer.changedInstance(businessInventoryEditTaxDestination);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda41
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$cZ0tk5CeVguQEGiyO7bJOEi9Zbc(com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryEditTaxDestination.this, (com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel editTaxViewModel = (com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda42
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businessinventory.di.NavigationModule.m13007$r8$lambda$m6pB5QROVQLpr14KKUXFZwxGzA(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean changed2 = composer.changed(appNavigator);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda43
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$b2CS3W6bz4PZq7ZaIdspCXlgN18(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenKt.EditTaxScreen(editTaxViewModel, function0, (kotlin.jvm.functions.Function1) rememberedValue3, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$BTvZd2RqMhWmZ-Fo0vp8PBC4I6A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12992$r8$lambda$BTvZd2RqMhWmZFo0vp8PBC4I6A(com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager businessInventoryFeatureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventoryAddItemDestination businessInventoryAddItemDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessInventoryAddItemDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1103740073, i, -1, "com.paypal.oslo.feature.businessinventory.di.NavigationModule.businessInventoryAddItemDestination.<anonymous> (NavigationModule.kt:426)");
        }
        com.paypal.oslo.feature.businessinventory.ui.common.FeatureDisabledScreenKt.ShowContentOrFeatureDisabledScreen(businessInventoryFeatureGateManager.isFeatureEnabled(), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_items_feature_name, composer, 0), appNavigator, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1323480280, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda66
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.m13000$r8$lambda$aEdV0Su5mopY3gFznN8Q0nsTYM(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composer, 3072);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Crvx0zRxucv4S5zENT09WQPD11A(com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.businessinventory.api.navigation.result.TaxSelectedNavResult(taxOption));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$D0tb94h5XeHO0LRu3OZ3nmJ6tnM(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1457951973, i, -1, "com.paypal.oslo.feature.businessinventory.di.NavigationModule.businessInventoryItemsListDestination.<anonymous>.<anonymous> (NavigationModule.kt:98)");
            }
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businessinventory.di.NavigationModule.m13008$r8$lambda$qJJMkr0PMSG9Usj94Qpkf57qNg(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changed2 = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.di.NavigationModule.m13014$r8$lambda$tnBmn5U0xrjRDN2zgMhY3qials(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            boolean changed3 = composer.changed(appNavigator);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changed3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$1JayMdfCgesExPH13tGzMcjn11w(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
            boolean changed4 = composer.changed(appNavigator);
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if (changed4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$gb9a7G_Dowxlsv43Dhg_YA0uqcA(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue4;
            boolean changed5 = composer.changed(appNavigator);
            java.lang.Object rememberedValue5 = composer.rememberedValue();
            if (changed5 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$P0sekKeV0GhjxAujW7VnDDOlJQQ(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt.BusinessInventoryItemsListScreen(function0, function1, function02, function12, (kotlin.jvm.functions.Function0) rememberedValue5, null, composer, 0, 32);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Ds1-SLIYTmY-7od9ub2Ypynqad8, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel m12993$r8$lambda$Ds1SLIYTmY7od9ub2Ypynqad8(com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryAddTaxDestination businessInventoryAddTaxDestination, com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(businessInventoryAddTaxDestination.getPresentationMode(), null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FOVW6JHc6VqvhCu_UHcoXE3_e2o(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(233571713, i, -1, "com.paypal.oslo.feature.businessinventory.di.NavigationModule.businessInventoryAddProductDestination.<anonymous>.<anonymous> (NavigationModule.kt:171)");
            }
            final java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(composer, 0);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda30
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.di.NavigationModule.m13004$r8$lambda$jrCEvZoAmmhOIBJ_UzsaAxTplw((com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel businessInventoryEditViewModel = (com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda31
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$xtipUk2bV1JXnlN_1SeBGHFjmNk(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue2;
            boolean changed2 = composer.changed(appNavigator);
            boolean changed3 = composer.changed(rememberNavResultRequestId);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if ((changed2 | changed3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda32
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$mpwR1tdMh3A0cxNtwppQWDhVsMQ(com.paypal.oslo.core.navigation.AppNavigator.this, rememberNavResultRequestId, (java.lang.String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditScreenKt.m13036BusinessInventoryItemsEditScreenVvArgOE(businessInventoryEditViewModel, function12, (kotlin.jvm.functions.Function1) rememberedValue3, rememberNavResultRequestId, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FduQiBlpy9v7v57PwZstBzGnZq8(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GtyUXbcQtznY7Nu_9eeHXD2W58M(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, final java.lang.String str2) {
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businessinventory.api.navigation.result.TaxSelectedNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$6sDWaxngVVLUy16mNkfbEDwZic4(str2, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IswZLyUjI8FxfaeNCwcV7VsCwTE(com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.Select select, com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryEditTaxDestination(select, taxOption));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Iszn2YV1v8AT-jWjm9AcWi9liX8, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel m12994$r8$lambda$Iszn2YV1v8ATjWjm9AcWi9liX8(com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(new com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType.Create(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType.SERVICE));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JEtO8ynpmMEic3IeC1gOUiW_uTw(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryAddServiceDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LNtbZ3NsiekZTQQNtCsPzWWFmtw(com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.View view, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryAddTaxDestination(view));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LQM4f8JEHtdMgzvS69Uk0Xy9DMk(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        if (libraryItem != null) {
            navigationScope.setResult(new com.paypal.oslo.feature.businessinventory.navigation.result.BusinessInventoryAddItemNavResult(libraryItem));
        }
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LeVnKTmdGHaId6YkqdfSa0Ct99c(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryAddServiceDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MYgHDWQpfNUiIB1LpzYG6ujqebE(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$Crvx0zRxucv4S5zENT09WQPD11A(com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NZnyqNOR9yLK8tjcgQsELD1AIf8(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.Select select, final com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxOption, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$IswZLyUjI8FxfaeNCwcV7VsCwTE(com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.Select.this, taxOption, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Nab_eeVw8y7vvxeAhd3MvWYp2jQ(final com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryEditProductDestination businessInventoryEditProductDestination, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1154258491, i, -1, "com.paypal.oslo.feature.businessinventory.di.NavigationModule.businessInventoryEditProductDestination.<anonymous>.<anonymous> (NavigationModule.kt:137)");
            }
            final java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(composer, 0);
            boolean changed = composer.changed(businessInventoryEditProductDestination);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$qmWFJObLEoZDqTxhSycnFEqRGok(com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryEditProductDestination.this, (com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel businessInventoryEditViewModel = (com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
            boolean changed2 = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda33
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.di.NavigationModule.m13006$r8$lambda$kTDXq60ylqE9qTDNPmpnyf7mQo(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue2;
            boolean changed3 = composer.changed(appNavigator);
            boolean changed4 = composer.changed(rememberNavResultRequestId);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if ((changed3 | changed4) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda44
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$GtyUXbcQtznY7Nu_9eeHXD2W58M(com.paypal.oslo.core.navigation.AppNavigator.this, rememberNavResultRequestId, (java.lang.String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditScreenKt.m13036BusinessInventoryItemsEditScreenVvArgOE(businessInventoryEditViewModel, function12, (kotlin.jvm.functions.Function1) rememberedValue3, rememberNavResultRequestId, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NgpZkGAaoDsadD3ZKZnaA8CIkSI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ObpF4eZYoCIgH2wZDDgXKyzMst8(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, final java.lang.String str2) {
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businessinventory.api.navigation.result.TaxSelectedNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.m12997$r8$lambda$VCGJD1JVxhC0kXycJMmJmos0E0(str2, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$P0sekKeV0GhjxAujW7VnDDOlJQQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda39
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$7G8K8wd8UhnYIlyqoBrfbxcavfw((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PwmcNzMveWRRA1t3YsN2J726HfM(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryEditProductDestination(libraryItem));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Q6e_PZwCnYVFO5jT4KtTlVpaXtI(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.View view) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$LNtbZ3NsiekZTQQNtCsPzWWFmtw(com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.View.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Tl-6ButK73E-jDMPWGPDIppizXs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12995$r8$lambda$Tl6ButK73EjDMPWGPDIppizXs(final com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryAddTaxDestination businessInventoryAddTaxDestination, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1725033849, i, -1, "com.paypal.oslo.feature.businessinventory.di.NavigationModule.businessInventoryAddTaxDestination.<anonymous>.<anonymous> (NavigationModule.kt:397)");
            }
            boolean changedInstance = composer.changedInstance(businessInventoryAddTaxDestination);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda54
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.di.NavigationModule.m12993$r8$lambda$Ds1SLIYTmY7od9ub2Ypynqad8(com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryAddTaxDestination.this, (com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel editTaxViewModel = (com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda56
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$XTe6jhAbDPiqfGozy9CAVxI54zo(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean changed2 = composer.changed(appNavigator);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda57
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$p2InPtupWBtwbWsz20h17i7ZNpo(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxScreenKt.EditTaxScreen(editTaxViewModel, function0, (kotlin.jvm.functions.Function1) rememberedValue3, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Tw58cHtK2TXW1VQdeJ--sML5B-c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12996$r8$lambda$Tw58cHtK2TXW1VQdeJsML5Bc(com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager businessInventoryFeatureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventorySelectTaxDestination businessInventorySelectTaxDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessInventorySelectTaxDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1119740553, i, -1, "com.paypal.oslo.feature.businessinventory.di.NavigationModule.businessInventorySelectTaxDestination.<anonymous> (NavigationModule.kt:325)");
        }
        com.paypal.oslo.feature.businessinventory.ui.common.FeatureDisabledScreenKt.ShowContentOrFeatureDisabledScreen(businessInventoryFeatureGateManager.isFeatureEnabled(), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_taxes_feature_name, composer, 0), appNavigator, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1389286600, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$vdh8n6Or9CaiMCPESYITvt0c7_g(com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventorySelectTaxDestination.this, appNavigator, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composer, 3072);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$VC-GJD1JVxhC0kXycJMmJmos0E0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12997$r8$lambda$VCGJD1JVxhC0kXycJMmJmos0E0(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventorySelectTaxDestination(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WmgAA8vHYfLkdv6zkIU4vjQnvQ0(com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager businessInventoryFeatureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventoryItemsListDestination businessInventoryItemsListDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessInventoryItemsListDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1508204, i, -1, "com.paypal.oslo.feature.businessinventory.di.NavigationModule.businessInventoryItemsListDestination.<anonymous> (NavigationModule.kt:93)");
        }
        com.paypal.oslo.feature.businessinventory.ui.common.FeatureDisabledScreenKt.ShowContentOrFeatureDisabledScreen(businessInventoryFeatureGateManager.isFeatureEnabled(), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_items_feature_name, composer, 0), appNavigator, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1457951973, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$D0tb94h5XeHO0LRu3OZ3nmJ6tnM(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composer, 3072);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XTe6jhAbDPiqfGozy9CAVxI54zo(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda38
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$s75nqy6wBKVx79OQ60hmjN14V1E((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Y-8T8aWbklEOkumcZ6Z5dXsUiKU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12998$r8$lambda$Y8T8aWbklEOkumcZ6Z5dXsUiKU(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_L-1gVAbBzNz80P3if53n9FxWlc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12999$r8$lambda$_L1gVAbBzNz80P3if53n9FxWlc(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryEditServiceDestination(libraryItem));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$aEdV0Su-5mopY3gFznN8Q0nsTYM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13000$r8$lambda$aEdV0Su5mopY3gFznN8Q0nsTYM(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1323480280, i, -1, "com.paypal.oslo.feature.businessinventory.di.NavigationModule.businessInventoryAddItemDestination.<anonymous>.<anonymous> (NavigationModule.kt:431)");
            }
            final java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(composer, 0);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.businessinventory.di.NavigationModule$businessInventoryAddItemDestination$1$1$1$1(appNavigator, null);
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, composer, 0);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$businessInventoryAddItemDestination$lambda$0$0$$inlined$NavResultEffect-rtGRyWw$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m13017invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m13017invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue2, composer, 3072);
            boolean changed2 = composer.changed(appNavigator);
            boolean changed3 = composer.changed(rememberNavResultRequestId);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if ((changed2 | changed3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda27
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businessinventory.di.NavigationModule.m12989$r8$lambda$XGEmPgQ4Ki9m03I4ExoLm_4U_A(com.paypal.oslo.core.navigation.AppNavigator.this, rememberNavResultRequestId);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
            boolean changed4 = composer.changed(appNavigator);
            boolean changed5 = composer.changed(rememberNavResultRequestId);
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if ((changed4 | changed5) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businessinventory.di.NavigationModule.m13012$r8$lambda$tA2FZsA8t6xeaZhythE4AH6S64(com.paypal.oslo.core.navigation.AppNavigator.this, rememberNavResultRequestId);
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            com.paypal.oslo.feature.businessinventory.ui.edititem.AddItemModalKt.AddItemModal(function0, (kotlin.jvm.functions.Function0) rememberedValue4, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$b2CS3W6bz4PZq7ZaIdspCXlgN18(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxOption, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda50
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.m12998$r8$lambda$Y8T8aWbklEOkumcZ6Z5dXsUiKU((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$bpXZovTGQJqeBjLO9S0VcIVn-wg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13001$r8$lambda$bpXZovTGQJqeBjLO9S0VcIVnwg(com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager businessInventoryFeatureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryAddTaxDestination businessInventoryAddTaxDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessInventoryAddTaxDestination, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(businessInventoryAddTaxDestination) : composer.changedInstance(businessInventoryAddTaxDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1354258058, i, -1, "com.paypal.oslo.feature.businessinventory.di.NavigationModule.businessInventoryAddTaxDestination.<anonymous> (NavigationModule.kt:392)");
            }
            com.paypal.oslo.feature.businessinventory.ui.common.FeatureDisabledScreenKt.ShowContentOrFeatureDisabledScreen(businessInventoryFeatureGateManager.isFeatureEnabled(), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_taxes_feature_name, composer, 0), appNavigator, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1725033849, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda55
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessinventory.di.NavigationModule.m12995$r8$lambda$Tl6ButK73EjDMPWGPDIppizXs(com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryAddTaxDestination.this, appNavigator, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 3072);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel $r8$lambda$cZ0tk5CeVguQEGiyO7bJOEi9Zbc(com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryEditTaxDestination businessInventoryEditTaxDestination, com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.View.INSTANCE, businessInventoryEditTaxDestination.getTax());
    }

    /* renamed from: $r8$lambda$d4mozNuePFYIjpEXlWK_8DXOt-s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13002$r8$lambda$d4mozNuePFYIjpEXlWK_8DXOts(com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.businessinventory.api.navigation.result.TaxSelectedNavResult(taxOption));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gb9a7G_Dowxlsv43Dhg_YA0uqcA(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(libraryItem, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda72
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.m12999$r8$lambda$_L1gVAbBzNz80P3if53n9FxWlc(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$hdKuM3Cms5iEyk1Mj9bgs5T-R5A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13003$r8$lambda$hdKuM3Cms5iEyk1Mj9bgs5TR5A(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(595979707, i, -1, "com.paypal.oslo.feature.businessinventory.di.NavigationModule.businessInventoryTaxListDestination.<anonymous>.<anonymous> (NavigationModule.kt:282)");
            }
            final com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.View view = com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.View.INSTANCE;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda61
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.di.NavigationModule.m13010$r8$lambda$sBAsincdMV7v2OQxkCLouBnhso(com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.View.this, (com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel taxListScreenViewModel = (com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda62
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$8W64BikVIJ4baxNejVzdVSAOpJs(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean changed2 = composer.changed(appNavigator);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda63
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$Q6e_PZwCnYVFO5jT4KtTlVpaXtI(com.paypal.oslo.core.navigation.AppNavigator.this, view);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
            boolean changed3 = composer.changed(appNavigator);
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if (changed3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda64
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$MYgHDWQpfNUiIB1LpzYG6ujqebE(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue4;
            boolean changed4 = composer.changed(appNavigator);
            java.lang.Object rememberedValue5 = composer.rememberedValue();
            if (changed4 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda65
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.di.NavigationModule.m13011$r8$lambda$spwzLpjxGze_YyFHONFx885imA(com.paypal.oslo.core.navigation.AppNavigator.this, view, (com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenKt.TaxListScreen(null, taxListScreenViewModel, function0, function02, function12, (kotlin.jvm.functions.Function1) rememberedValue5, composer, 0, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hgTzF4NqshKqDZmX78rMkq6PvXM(com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.Select select, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryAddTaxDestination(select));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$qJJMkr0PMSG9Usj94Qpkf57qN-g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13008$r8$lambda$qJJMkr0PMSG9Usj94Qpkf57qNg(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.m13013$r8$lambda$tSrpLPH2HP9rq2kvkglA9KJu4((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$tSrpLPH2HP-9rq-2kvkglA9KJu4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13013$r8$lambda$tSrpLPH2HP9rq2kvkglA9KJu4(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryAddProductDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$tnBmn5U0-xrjRDN2zgMhY3qials, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13014$r8$lambda$tnBmn5U0xrjRDN2zgMhY3qials(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(libraryItem, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda40
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$PwmcNzMveWRRA1t3YsN2J726HfM(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$kTDX-q60ylqE9qTDNPmpnyf7mQo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13006$r8$lambda$kTDXq60ylqE9qTDNPmpnyf7mQo(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$p9D4xYdyeqGTDTI5eulP7LLxqGg((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$p9D4xYdyeqGTDTI5eulP7LLxqGg(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel $r8$lambda$qmWFJObLEoZDqTxhSycnFEqRGok(com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryEditProductDestination businessInventoryEditProductDestination, com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(new com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType.Edit(businessInventoryEditProductDestination.getLibraryItem()));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uUpfa5quRWnuS1uKv7Z8UNKDDfg(com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager businessInventoryFeatureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryEditProductDestination businessInventoryEditProductDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessInventoryEditProductDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(businessInventoryEditProductDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(934518284, i, -1, "com.paypal.oslo.feature.businessinventory.di.NavigationModule.businessInventoryEditProductDestination.<anonymous> (NavigationModule.kt:132)");
            }
            com.paypal.oslo.feature.businessinventory.ui.common.FeatureDisabledScreenKt.ShowContentOrFeatureDisabledScreen(businessInventoryFeatureGateManager.isFeatureEnabled(), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_items_feature_name, composer, 0), appNavigator, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1154258491, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda67
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$Nab_eeVw8y7vvxeAhd3MvWYp2jQ(com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryEditProductDestination.this, appNavigator, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 3072);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$jrCEvZoAmmhOIB-J_UzsaAxTplw, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel m13004$r8$lambda$jrCEvZoAmmhOIBJ_UzsaAxTplw(com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(new com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType.Create(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType.PRODUCT));
    }

    /* renamed from: $r8$lambda$qPzgh2yQVkhR84f-xNfAvGx3ds8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13009$r8$lambda$qPzgh2yQVkhR84fxNfAvGx3ds8(com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager businessInventoryFeatureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryAddProductDestination businessInventoryAddProductDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessInventoryAddProductDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1679503982, i, -1, "com.paypal.oslo.feature.businessinventory.di.NavigationModule.businessInventoryAddProductDestination.<anonymous> (NavigationModule.kt:166)");
            }
            com.paypal.oslo.feature.businessinventory.ui.common.FeatureDisabledScreenKt.ShowContentOrFeatureDisabledScreen(businessInventoryFeatureGateManager.isFeatureEnabled(), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_items_feature_name, composer, 0), appNavigator, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(233571713, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda71
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$FOVW6JHc6VqvhCu_UHcoXE3_e2o(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 3072);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mpwR1tdMh3A0cxNtwppQWDhVsMQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, final java.lang.String str2) {
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businessinventory.api.navigation.result.TaxSelectedNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda46
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$vek5xQxzAVMUIy02h3YTHNlee6o(str2, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$jvZUF9R3U-a_Y9WfqJc0HLH1lL8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13005$r8$lambda$jvZUF9R3Ua_Y9WfqJc0HLH1lL8(final com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryEditServiceDestination businessInventoryEditServiceDestination, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1757557253, i, -1, "com.paypal.oslo.feature.businessinventory.di.NavigationModule.businessInventoryEditServiceDestination.<anonymous>.<anonymous> (NavigationModule.kt:211)");
            }
            final java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(composer, 0);
            boolean changed = composer.changed(businessInventoryEditServiceDestination);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda47
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.di.NavigationModule.m12990$r8$lambda$11p_6VQkprF6pLu9Yagz2pLwN8(com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryEditServiceDestination.this, (com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel businessInventoryEditViewModel = (com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
            boolean changed2 = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda48
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$3thAGscjqhrV4sm4Z7wMMB1pCKU(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue2;
            boolean changed3 = composer.changed(appNavigator);
            boolean changed4 = composer.changed(rememberNavResultRequestId);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if ((changed3 | changed4) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda49
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$y_CjNUuTA4NyNNJpGLB8qtv53Vo(com.paypal.oslo.core.navigation.AppNavigator.this, rememberNavResultRequestId, (java.lang.String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditScreenKt.m13036BusinessInventoryItemsEditScreenVvArgOE(businessInventoryEditViewModel, function12, (kotlin.jvm.functions.Function1) rememberedValue3, rememberNavResultRequestId, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pLt5jpQytmpcpu5qwtlAFL9oXts(com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager businessInventoryFeatureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryEditServiceDestination businessInventoryEditServiceDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessInventoryEditServiceDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(businessInventoryEditServiceDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1977297460, i, -1, "com.paypal.oslo.feature.businessinventory.di.NavigationModule.businessInventoryEditServiceDestination.<anonymous> (NavigationModule.kt:206)");
            }
            com.paypal.oslo.feature.businessinventory.ui.common.FeatureDisabledScreenKt.ShowContentOrFeatureDisabledScreen(businessInventoryFeatureGateManager.isFeatureEnabled(), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_items_feature_name, composer, 0), appNavigator, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1757557253, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda53
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessinventory.di.NavigationModule.m13005$r8$lambda$jvZUF9R3Ua_Y9WfqJc0HLH1lL8(com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryEditServiceDestination.this, appNavigator, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 3072);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xtipUk2bV1JXnlN_1SeBGHFjmNk(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$LQM4f8JEHtdMgzvS69Uk0Xy9DMk(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vek5xQxzAVMUIy02h3YTHNlee6o(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventorySelectTaxDestination(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rEE3GXVeSyvM68RMBvCbzrUnJt0(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventorySelectTaxDestination(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pXiXmDi2P6Zoyoy_qu9lxBodL70(com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager businessInventoryFeatureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryAddServiceDestination businessInventoryAddServiceDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessInventoryAddServiceDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(579473182, i, -1, "com.paypal.oslo.feature.businessinventory.di.NavigationModule.businessInventoryAddServiceDestination.<anonymous> (NavigationModule.kt:239)");
            }
            com.paypal.oslo.feature.businessinventory.ui.common.FeatureDisabledScreenKt.ShowContentOrFeatureDisabledScreen(businessInventoryFeatureGateManager.isFeatureEnabled(), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_items_feature_name, composer, 0), appNavigator, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1802418419, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessinventory.di.NavigationModule.m13016$r8$lambda$xGA9KUjKccXWqosSXncONASWMg(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 3072);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ww2uQuOCJ2UZ2BG938Fuehk--uc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13015$r8$lambda$ww2uQuOCJ2UZ2BG938Fuehkuc(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$y_CjNUuTA4NyNNJpGLB8qtv53Vo(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, final java.lang.String str2) {
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businessinventory.api.navigation.result.TaxSelectedNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda52
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$rEE3GXVeSyvM68RMBvCbzrUnJt0(str2, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$xG-A9KUjKccXWqosSXncONASWMg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13016$r8$lambda$xGA9KUjKccXWqosSXncONASWMg(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1802418419, i, -1, "com.paypal.oslo.feature.businessinventory.di.NavigationModule.businessInventoryAddServiceDestination.<anonymous>.<anonymous> (NavigationModule.kt:244)");
            }
            final java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(composer, 0);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda73
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.di.NavigationModule.m12994$r8$lambda$Iszn2YV1v8ATjWjm9AcWi9liX8((com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel businessInventoryEditViewModel = (com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda74
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$5IpgXYPgPZ8UIY9Eve2QFSYVZg0(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue2;
            boolean changed2 = composer.changed(appNavigator);
            boolean changed3 = composer.changed(rememberNavResultRequestId);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if ((changed2 | changed3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda75
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$ObpF4eZYoCIgH2wZDDgXKyzMst8(com.paypal.oslo.core.navigation.AppNavigator.this, rememberNavResultRequestId, (java.lang.String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditScreenKt.m13036BusinessInventoryItemsEditScreenVvArgOE(businessInventoryEditViewModel, function12, (kotlin.jvm.functions.Function1) rememberedValue3, rememberNavResultRequestId, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$sBAsincdMV7v2OQxkCLo-uBnhso, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel m13010$r8$lambda$sBAsincdMV7v2OQxkCLouBnhso(com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.View view, com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(view);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xnsbu1H5ya9DlXPAe1DnkHuQIdo(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        if (libraryItem != null) {
            navigationScope.setResult(new com.paypal.oslo.feature.businessinventory.navigation.result.BusinessInventoryAddItemNavResult(libraryItem));
        }
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$spwzLpjxGze_YyFHONFx88-5imA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13011$r8$lambda$spwzLpjxGze_YyFHONFx885imA(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.View view, final com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxOption, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$7jb4Xsmlf4rBsJIh1ONbp8Vd3WU(com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.View.this, taxOption, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel $r8$lambda$p357LyM2fqWbAtleLMeQUPmjU5w(com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.Select select, com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(select);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$p5qgCmzpJzGF1OvtdSaRFZRdmTU(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.Select select) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$hgTzF4NqshKqDZmX78rMkq6PvXM(com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.Select.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vdh8n6Or9CaiMCPESYITvt0c7_g(com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventorySelectTaxDestination businessInventorySelectTaxDestination, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1389286600, i, -1, "com.paypal.oslo.feature.businessinventory.di.NavigationModule.businessInventorySelectTaxDestination.<anonymous>.<anonymous> (NavigationModule.kt:330)");
            }
            final com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.Select select = new com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.Select(businessInventorySelectTaxDestination.getSelectedTaxId());
            boolean changed = composer.changed(select);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda77
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$p357LyM2fqWbAtleLMeQUPmjU5w(com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.Select.this, (com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel taxListScreenViewModel = (com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
            androidx.compose.ui.Modifier fillMaxHeight = androidx.compose.foundation.layout.SizeKt.fillMaxHeight(androidx.compose.ui.Modifier.INSTANCE, 0.5f);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda80
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean changed2 = composer.changed(appNavigator);
            boolean changed3 = composer.changed(select);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if ((changed2 | changed3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda81
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$p5qgCmzpJzGF1OvtdSaRFZRdmTU(com.paypal.oslo.core.navigation.AppNavigator.this, select);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
            boolean changed4 = composer.changed(appNavigator);
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if (changed4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$2_iLncX9QfrxCpfk5MvueCgeL_s(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue4;
            boolean changed5 = composer.changed(appNavigator);
            boolean changed6 = composer.changed(select);
            java.lang.Object rememberedValue5 = composer.rememberedValue();
            if ((changed5 | changed6) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$NZnyqNOR9yLK8tjcgQsELD1AIf8(com.paypal.oslo.core.navigation.AppNavigator.this, select, (com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenKt.TaxListScreen(fillMaxHeight, taxListScreenViewModel, function0, function02, function12, (kotlin.jvm.functions.Function1) rememberedValue5, composer, 390, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$m6pB5-QROVQLpr14KKUXFZwxGzA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13007$r8$lambda$m6pB5QROVQLpr14KKUXFZwxGzA(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$NgpZkGAaoDsadD3ZKZnaA8CIkSI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mVaozbHdu3_cWgkcLvaXEWV911c(com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.setResult(new com.paypal.oslo.feature.businessinventory.api.navigation.result.TaxSelectedNavResult(taxOption));
        navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventoryTaxNavKey.class));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$p2InPtupWBtwbWsz20h17i7ZNpo(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxOption, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$mVaozbHdu3_cWgkcLvaXEWV911c(com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wEoM4yWJWLew6dcEP1L9qkMxISc(com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager businessInventoryFeatureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryEditTaxDestination businessInventoryEditTaxDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessInventoryEditTaxDestination, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(businessInventoryEditTaxDestination) : composer.changedInstance(businessInventoryEditTaxDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-399388276, i, -1, "com.paypal.oslo.feature.businessinventory.di.NavigationModule.businessInventoryEditTaxDestination.<anonymous> (NavigationModule.kt:369)");
            }
            com.paypal.oslo.feature.businessinventory.ui.common.FeatureDisabledScreenKt.ShowContentOrFeatureDisabledScreen(businessInventoryFeatureGateManager.isFeatureEnabled(), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_taxes_feature_name, composer, 0), appNavigator, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-566138693, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$AWE931uQw5dURFOdk6xqudNOIks(com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryEditTaxDestination.this, appNavigator, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 3072);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$s75nqy6wBKVx79OQ60hmjN14V1E(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$tA2FZsA8-t6xeaZhythE4AH6S64, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13012$r8$lambda$tA2FZsA8t6xeaZhythE4AH6S64(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str) {
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businessinventory.navigation.result.BusinessInventoryAddItemNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda69
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$JEtO8ynpmMEic3IeC1gOUiW_uTw((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uBXYvwRTyLh3UhDDoTtIKVRFQlo(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager businessInventoryFeatureGateManager, android.content.Context context, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1508204, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda58
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$WmgAA8vHYfLkdv6zkIU4vjQnvQ0(com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventoryItemsListDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventoryItemsListDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventoryItemsListDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$businessInventoryItemsListDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventoryItemsListDestination businessInventoryItemsListDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(businessInventoryItemsListDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventoryItemsListDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$businessInventoryItemsListDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventoryItemsListDestination businessInventoryItemsListDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        final java.util.Map l2Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(934518284, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda78
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$uUpfa5quRWnuS1uKv7Z8UNKDDfg(com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryEditProductDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryEditProductDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryEditProductDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$businessInventoryEditProductDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryEditProductDestination businessInventoryEditProductDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(businessInventoryEditProductDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryEditProductDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$businessInventoryEditProductDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryEditProductDestination businessInventoryEditProductDestination) {
                return l2Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance2);
        final java.util.Map l2Metadata$default3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1679503982, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.m13009$r8$lambda$qPzgh2yQVkhR84fxNfAvGx3ds8(com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryAddProductDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryAddProductDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryAddProductDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$businessInventoryAddProductDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryAddProductDestination businessInventoryAddProductDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(businessInventoryAddProductDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryAddProductDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$businessInventoryAddProductDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryAddProductDestination businessInventoryAddProductDestination) {
                return l2Metadata$default3;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance3);
        final java.util.Map l2Metadata$default4 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance4 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1977297460, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$pLt5jpQytmpcpu5qwtlAFL9oXts(com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryEditServiceDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryEditServiceDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryEditServiceDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$businessInventoryEditServiceDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryEditServiceDestination businessInventoryEditServiceDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(businessInventoryEditServiceDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryEditServiceDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$businessInventoryEditServiceDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryEditServiceDestination businessInventoryEditServiceDestination) {
                return l2Metadata$default4;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance4);
        final java.util.Map l2Metadata$default5 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance5 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(579473182, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda51
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$pXiXmDi2P6Zoyoy_qu9lxBodL70(com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryAddServiceDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryAddServiceDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryAddServiceDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$businessInventoryAddServiceDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryAddServiceDestination businessInventoryAddServiceDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(businessInventoryAddServiceDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryAddServiceDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$businessInventoryAddServiceDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryAddServiceDestination businessInventoryAddServiceDestination) {
                return l2Metadata$default5;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance5);
        final java.util.Map l2Metadata$default6 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance6 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(762730124, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda70
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$5L27vKEZWOQTsaGynkV1ebOudeM(com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventoryTaxListDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventoryTaxListDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventoryTaxListDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$businessInventoryTaxListDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventoryTaxListDestination businessInventoryTaxListDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(businessInventoryTaxListDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventoryTaxListDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$businessInventoryTaxListDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventoryTaxListDestination businessInventoryTaxListDestination) {
                return l2Metadata$default6;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance6);
        final java.util.Map bottomSheetMetadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(androidx.core.content.ContextCompat.getString(context, com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_choose_tax), false, false, false, null, null, null, 126, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance7 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1119740553, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda76
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.m12996$r8$lambda$Tw58cHtK2TXW1VQdeJsML5Bc(com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventorySelectTaxDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventorySelectTaxDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventorySelectTaxDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$businessInventorySelectTaxDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventorySelectTaxDestination businessInventorySelectTaxDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(businessInventorySelectTaxDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventorySelectTaxDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$businessInventorySelectTaxDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventorySelectTaxDestination businessInventorySelectTaxDestination) {
                return bottomSheetMetadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance7);
        final java.util.Map l2Metadata$default7 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance8 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-399388276, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda45
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.$r8$lambda$wEoM4yWJWLew6dcEP1L9qkMxISc(com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryEditTaxDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryEditTaxDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryEditTaxDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$businessInventoryEditTaxDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryEditTaxDestination businessInventoryEditTaxDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(businessInventoryEditTaxDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryEditTaxDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$businessInventoryEditTaxDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryEditTaxDestination businessInventoryEditTaxDestination) {
                return l2Metadata$default7;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance8);
        final java.util.Map l2Metadata$default8 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance9 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1354258058, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.m13001$r8$lambda$bpXZovTGQJqeBjLO9S0VcIVnwg(com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryAddTaxDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryAddTaxDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryAddTaxDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$businessInventoryAddTaxDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryAddTaxDestination businessInventoryAddTaxDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(businessInventoryAddTaxDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryAddTaxDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$businessInventoryAddTaxDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryAddTaxDestination businessInventoryAddTaxDestination) {
                return l2Metadata$default8;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance9);
        final java.util.Map bottomSheetMetadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(androidx.core.content.ContextCompat.getString(context, com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_add_item_modal_title), false, true, false, null, null, null, 114, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance10 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1103740073, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule.m12992$r8$lambda$BTvZd2RqMhWmZFo0vp8PBC4I6A(com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventoryAddItemDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventoryAddItemDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventoryAddItemDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$businessInventoryAddItemDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventoryAddItemDestination businessInventoryAddItemDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(businessInventoryAddItemDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventoryAddItemDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$businessInventoryAddItemDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventoryAddItemDestination businessInventoryAddItemDestination) {
                return bottomSheetMetadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance10);
        return kotlin.Unit.INSTANCE;
    }
}
