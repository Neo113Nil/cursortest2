package com.paypal.oslo.feature.cashin.di;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u000b\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\r\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\fJ2\u0010\u000e\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/cashin/di/CashInNavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideEntryProviderInstaller", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)Lkotlin/jvm/functions/Function1;", "provideMethodSelectionNavigation", "provideFeatureDisabledNavigation"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes11.dex */
public final class CashInNavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.cashin.di.CashInNavigationModule INSTANCE = new com.paypal.oslo.feature.cashin.di.CashInNavigationModule();

    private CashInNavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.cashin.di.CashInNavigationModule.$r8$lambda$PT3oUbqU5rutzam0ph9IU0RwHD0(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideMethodSelectionNavigation(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.cashin.di.CashInNavigationModule.$r8$lambda$rVdcLLi4NO_g9NRvxNFCF_MbDMQ(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideFeatureDisabledNavigation(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.cashin.di.CashInNavigationModule.m13386$r8$lambda$KplAxsnuSCNk9F5zzF4Xns5XWQ(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    /* renamed from: $r8$lambda$-B_si508hHBjtcyKCzBuKO_OX6U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13381$r8$lambda$B_si508hHBjtcyKCzBuKO_OX6U(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.cashin.di.CashInNavigationModule.m13393$r8$lambda$o678RTNUem4NyGTsWTFO_4HJ5s((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$052JYScT8sh-MpS68EThRyN_6U0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13382$r8$lambda$052JYScT8shMpS68EThRyN_6U0(com.paypal.oslo.core.navigation.AppNavigator appNavigator, boolean z, com.paypal.oslo.feature.cashin.api.navigation.CashInLocationPermissionDestination cashInLocationPermissionDestination) {
        final java.lang.String source = cashInLocationPermissionDestination.getSource();
        if (z) {
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.cashin.di.CashInNavigationModule.$r8$lambda$aSLPLXoAJfgkc1A6fx8yArYTH6M((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        } else {
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.cashin.di.CashInNavigationModule.$r8$lambda$AL1SEOkkyF_2n3So5fdR3ewKZt8(source, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3hCXyAJDZY83diFq8a2osuWZYwE(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(386876675, i, -1, "com.paypal.oslo.feature.cashin.di.CashInNavigationModule.provideFeatureDisabledNavigation.<anonymous>.<anonymous>.<anonymous> (CashInNavigationModule.kt:152)");
            }
            com.paypal.oslo.feature.cashin.ui.model.RetryErrorConfig featureDisabled = com.paypal.oslo.feature.cashin.ui.model.RetryErrorConfig.INSTANCE.getFeatureDisabled();
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.cashin.di.CashInNavigationModule.m13383$r8$lambda$52QBPlYKgyhL7kAt1jEwksfaW8(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changed2 = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.cashin.di.CashInNavigationModule.m13381$r8$lambda$B_si508hHBjtcyKCzBuKO_OX6U(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean changed3 = composer.changed(appNavigator);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changed3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.cashin.di.CashInNavigationModule.m13390$r8$lambda$U0V9oWyI1N96VKgNByaa8TpB7g(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.cashin.ui.screens.CashInErrorScreenKt.CashInErrorScreen(0, (kotlin.jvm.functions.Function0<kotlin.Unit>) function0, (kotlin.jvm.functions.Function0<kotlin.Unit>) function02, (kotlin.jvm.functions.Function0<kotlin.Unit>) rememberedValue3, (androidx.compose.ui.Modifier) null, featureDisabled, true, composer, 1572870, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$52-QBPlYKgyhL7kAt1jEwksfaW8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13383$r8$lambda$52QBPlYKgyhL7kAt1jEwksfaW8(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.cashin.di.CashInNavigationModule.m13388$r8$lambda$Psf4u2kARg342BnYK4us4YQtBE((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9yBb2ZEzC2J3dVFXcxgBuiheAUk(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(new com.paypal.oslo.feature.cashin.api.navigation.CashInMainDestination(1, str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AL1SEOkkyF_2n3So5fdR3ewKZt8(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(new com.paypal.oslo.feature.cashin.api.navigation.CashInEntryDestination(str));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$DHq8P-jQjaL021b3UsIOd1fqpew, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13384$r8$lambda$DHq8PjQjaL021b3UsIOd1fqpew(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.cashin.api.navigation.CashInBalanceLandingDestination cashInBalanceLandingDestination, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-774296985, i, -1, "com.paypal.oslo.feature.cashin.di.CashInNavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous>.<anonymous> (CashInNavigationModule.kt:79)");
            }
            com.paypal.oslo.feature.cashin.ui.screens.CashInBalanceLandingScreenKt.CashInBalanceLandingScreen(appNavigator, cashInBalanceLandingDestination.getSource(), null, composer, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FygEXSJ0F10pRU0IvBSLZrT3nig(com.paypal.oslo.core.navigation.AppNavigator appNavigator, boolean z, com.paypal.oslo.feature.cashin.api.navigation.CashInLocationPermissionDestination cashInLocationPermissionDestination) {
        java.lang.String source = cashInLocationPermissionDestination.getSource();
        if (z) {
            appNavigator.navigate(new com.paypal.oslo.feature.cashin.di.CashInNavigationModule$$ExternalSyntheticLambda27());
        } else {
            appNavigator.navigate(new com.paypal.oslo.feature.cashin.di.CashInNavigationModule$$ExternalSyntheticLambda1(source));
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HcZMp9DA2T7tf5x4JtKfvoBw1pQ(final com.paypal.oslo.feature.cashin.api.navigation.CashInLocationPermissionDestination cashInLocationPermissionDestination, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final boolean z, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-24010883, i, -1, "com.paypal.oslo.feature.cashin.di.CashInNavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous>.<anonymous> (CashInNavigationModule.kt:60)");
            }
            java.lang.String source = cashInLocationPermissionDestination.getSource();
            boolean changed = composer.changed(appNavigator);
            boolean changed2 = composer.changed(z);
            boolean changedInstance = composer.changedInstance(cashInLocationPermissionDestination);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changed2 | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.cashin.di.CashInNavigationModule.m13382$r8$lambda$052JYScT8shMpS68EThRyN_6U0(com.paypal.oslo.core.navigation.AppNavigator.this, z, cashInLocationPermissionDestination);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changed3 = composer.changed(appNavigator);
            boolean changed4 = composer.changed(z);
            boolean changedInstance2 = composer.changedInstance(cashInLocationPermissionDestination);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changed3 | changed4 | changedInstance2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.cashin.di.CashInNavigationModule.m13391$r8$lambda$UbF5jnFYDyYez6_2vDfyM40MM4(com.paypal.oslo.core.navigation.AppNavigator.this, z, cashInLocationPermissionDestination);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean changed5 = composer.changed(appNavigator);
            boolean changed6 = composer.changed(z);
            boolean changedInstance3 = composer.changedInstance(cashInLocationPermissionDestination);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if ((changed5 | changed6 | changedInstance3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.cashin.di.CashInNavigationModule.$r8$lambda$FygEXSJ0F10pRU0IvBSLZrT3nig(com.paypal.oslo.core.navigation.AppNavigator.this, z, cashInLocationPermissionDestination);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.cashin.ui.screens.CashInLocationPermissionScreenKt.CashInLocationPermissionScreen(function0, function02, (kotlin.jvm.functions.Function0) rememberedValue3, null, source, null, composer, 0, 40);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$KB_-rMl2ADHqm_LwlhzI2TBYzws, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13385$r8$lambda$KB_rMl2ADHqm_LwlhzI2TBYzws(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.cashin.api.navigation.CashInLocationPermissionDestination cashInLocationPermissionDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashInLocationPermissionDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(59349971, i, -1, "com.paypal.oslo.feature.cashin.di.CashInNavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (CashInNavigationModule.kt:58)");
        }
        final boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(cashInLocationPermissionDestination.getSource(), com.paypal.oslo.feature.cashin.domain.LocationConstants.SOURCE_TAB_CLICK);
        com.paypal.oslo.feature.cashin.ui.components.CashInWindowInsetsWrapperKt.CashInWindowInsetsWrapper(androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-24010883, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.cashin.di.CashInNavigationModule.$r8$lambda$HcZMp9DA2T7tf5x4JtKfvoBw1pQ(com.paypal.oslo.feature.cashin.api.navigation.CashInLocationPermissionDestination.this, appNavigator, areEqual, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$KplAxsnuSCNk-9F5zzF4Xns5XWQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13386$r8$lambda$KplAxsnuSCNk9F5zzF4Xns5XWQ(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1528993901, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.cashin.di.CashInNavigationModule.$r8$lambda$rzJ3z3fGPw_VhJuvu7klWMjA4gQ(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.cashin.api.navigation.CashInDisableFeatureDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cashin.api.navigation.CashInDisableFeatureDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cashin.api.navigation.CashInDisableFeatureDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$provideFeatureDisabledNavigation$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.cashin.api.navigation.CashInDisableFeatureDestination cashInDisableFeatureDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(cashInDisableFeatureDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cashin.api.navigation.CashInDisableFeatureDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$provideFeatureDisabledNavigation$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.cashin.api.navigation.CashInDisableFeatureDestination cashInDisableFeatureDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$LVc1IUWUm2PGYodgiP_sP484a-g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13387$r8$lambda$LVc1IUWUm2PGYodgiP_sP484ag(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PT3oUbqU5rutzam0ph9IU0RwHD0(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.cashin.api.navigation.CashInEntryDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m13396getLambda$1623418348$cash_in_prodRelease = com.paypal.oslo.feature.cashin.di.ComposableSingletons$CashInNavigationModuleKt.INSTANCE.m13396getLambda$1623418348$cash_in_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cashin.api.navigation.CashInEntryDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cashin.api.navigation.CashInEntryDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.cashin.api.navigation.CashInEntryDestination cashInEntryDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(cashInEntryDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cashin.api.navigation.CashInEntryDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.cashin.api.navigation.CashInEntryDestination cashInEntryDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) m13396getLambda$1623418348$cash_in_prodRelease);
        final java.util.Map l2Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(59349971, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.cashin.di.CashInNavigationModule.m13385$r8$lambda$KB_rMl2ADHqm_LwlhzI2TBYzws(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.cashin.api.navigation.CashInLocationPermissionDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cashin.api.navigation.CashInLocationPermissionDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cashin.api.navigation.CashInLocationPermissionDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.cashin.api.navigation.CashInLocationPermissionDestination cashInLocationPermissionDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(cashInLocationPermissionDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cashin.api.navigation.CashInLocationPermissionDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$4
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.cashin.api.navigation.CashInLocationPermissionDestination cashInLocationPermissionDestination) {
                return l2Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        final java.util.Map l2Metadata$default3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1984380483, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.cashin.di.CashInNavigationModule.m13394$r8$lambda$qEBk7dIrtms_7RAYomd20Q7dfg(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.cashin.api.navigation.CashInBalanceLandingDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cashin.api.navigation.CashInBalanceLandingDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cashin.api.navigation.CashInBalanceLandingDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.cashin.api.navigation.CashInBalanceLandingDestination cashInBalanceLandingDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(cashInBalanceLandingDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cashin.api.navigation.CashInBalanceLandingDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$6
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.cashin.api.navigation.CashInBalanceLandingDestination cashInBalanceLandingDestination) {
                return l2Metadata$default3;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance2);
        final java.util.Map l2Metadata$default4 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1673723203, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.cashin.di.CashInNavigationModule.$r8$lambda$YEQZQk_2rzxwtXhHCB0N4io3y_0(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.cashin.api.navigation.CashInNoBalanceLandingDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cashin.api.navigation.CashInNoBalanceLandingDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cashin.api.navigation.CashInNoBalanceLandingDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.cashin.api.navigation.CashInNoBalanceLandingDestination cashInNoBalanceLandingDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(cashInNoBalanceLandingDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cashin.api.navigation.CashInNoBalanceLandingDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$8
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.cashin.api.navigation.CashInNoBalanceLandingDestination cashInNoBalanceLandingDestination) {
                return l2Metadata$default4;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance3);
        final java.util.Map l2Metadata$default5 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance4 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1176316639, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.cashin.di.CashInNavigationModule.m13389$r8$lambda$QvggbS6wlh9BJuHg0crApxF8f8(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.cashin.api.navigation.CashInMainDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cashin.api.navigation.CashInMainDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cashin.api.navigation.CashInMainDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.cashin.api.navigation.CashInMainDestination cashInMainDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(cashInMainDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cashin.api.navigation.CashInMainDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$10
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.cashin.api.navigation.CashInMainDestination cashInMainDestination) {
                return l2Metadata$default5;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance4);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Psf4u2kARg342BnYK4us4-YQtBE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13388$r8$lambda$Psf4u2kARg342BnYK4us4YQtBE(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Qv-ggbS6wlh9BJuHg0crApxF8f8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13389$r8$lambda$QvggbS6wlh9BJuHg0crApxF8f8(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.cashin.api.navigation.CashInMainDestination cashInMainDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashInMainDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1176316639, i, -1, "com.paypal.oslo.feature.cashin.di.CashInNavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (CashInNavigationModule.kt:94)");
        }
        com.paypal.oslo.feature.cashin.ui.components.CashInWindowInsetsWrapperKt.CashInWindowInsetsWrapper(androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1838929333, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.cashin.di.CashInNavigationModule.m13392$r8$lambda$fFPy50_gkOVQ44JqjxUc45IbQU(com.paypal.oslo.core.navigation.AppNavigator.this, cashInMainDestination, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SWZklkc5B6tVC88thJGLLzQlzxI(com.paypal.oslo.feature.cashin.api.navigation.MethodSelectionDestination methodSelectionDestination, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(464044013, i, -1, "com.paypal.oslo.feature.cashin.di.CashInNavigationModule.provideMethodSelectionNavigation.<anonymous>.<anonymous>.<anonymous> (CashInNavigationModule.kt:112)");
            }
            com.paypal.oslo.feature.cashin.ui.barcode.composable.CashInMethodSelectionScreenKt.CashInMethodSelectionScreen(methodSelectionDestination.getPartnerId(), methodSelectionDestination.getRetailerId(), appNavigator, null, methodSelectionDestination.getAddress(), methodSelectionDestination.getDistance(), null, composer, 0, 72);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$U0V9oWyI1N96VKgNByaa8-TpB7g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13390$r8$lambda$U0V9oWyI1N96VKgNByaa8TpB7g(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.cashin.di.CashInNavigationModule.$r8$lambda$ex9IsYTiLIYmtVxaWlHmZo4bHRw((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$UbF5jnFYDyYez6_2-vDfyM40MM4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13391$r8$lambda$UbF5jnFYDyYez6_2vDfyM40MM4(com.paypal.oslo.core.navigation.AppNavigator appNavigator, boolean z, com.paypal.oslo.feature.cashin.api.navigation.CashInLocationPermissionDestination cashInLocationPermissionDestination) {
        java.lang.String source = cashInLocationPermissionDestination.getSource();
        if (z) {
            appNavigator.navigate(new com.paypal.oslo.feature.cashin.di.CashInNavigationModule$$ExternalSyntheticLambda27());
        } else {
            appNavigator.navigate(new com.paypal.oslo.feature.cashin.di.CashInNavigationModule$$ExternalSyntheticLambda1(source));
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YEQZQk_2rzxwtXhHCB0N4io3y_0(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.cashin.api.navigation.CashInNoBalanceLandingDestination cashInNoBalanceLandingDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashInNoBalanceLandingDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1673723203, i, -1, "com.paypal.oslo.feature.cashin.di.CashInNavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (CashInNavigationModule.kt:86)");
        }
        com.paypal.oslo.feature.cashin.ui.components.CashInWindowInsetsWrapperKt.CashInWindowInsetsWrapper(androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1575348455, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.cashin.di.CashInNavigationModule.$r8$lambda$pfQNVfyYCv_cOSIQEYt841_XeVA(com.paypal.oslo.core.navigation.AppNavigator.this, cashInNoBalanceLandingDestination, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$aSLPLXoAJfgkc1A6fx8yArYTH6M(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ex9IsYTiLIYmtVxaWlHmZo4bHRw(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$fFPy50-_gkOVQ44JqjxUc45IbQU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13392$r8$lambda$fFPy50_gkOVQ44JqjxUc45IbQU(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.cashin.api.navigation.CashInMainDestination cashInMainDestination, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1838929333, i, -1, "com.paypal.oslo.feature.cashin.di.CashInNavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous>.<anonymous> (CashInNavigationModule.kt:95)");
            }
            com.paypal.oslo.feature.cashin.ui.screens.CashInMainScreenKt.CashInMainScreen(appNavigator, cashInMainDestination.getInitialTab(), null, null, null, null, composer, 0, 60);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$o678RT-NUem4NyGTsWTFO_4HJ5s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13393$r8$lambda$o678RTNUem4NyGTsWTFO_4HJ5s(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pfQNVfyYCv_cOSIQEYt841_XeVA(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.cashin.api.navigation.CashInNoBalanceLandingDestination cashInNoBalanceLandingDestination, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1575348455, i, -1, "com.paypal.oslo.feature.cashin.di.CashInNavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous>.<anonymous> (CashInNavigationModule.kt:87)");
            }
            com.paypal.oslo.feature.cashin.ui.screens.CashInNoBalanceLandingScreenKt.CashInNoBalanceLandingScreen(appNavigator, cashInNoBalanceLandingDestination.getSource(), null, composer, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$qEBk7dIrt-ms_7RAYomd20Q7dfg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13394$r8$lambda$qEBk7dIrtms_7RAYomd20Q7dfg(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.cashin.api.navigation.CashInBalanceLandingDestination cashInBalanceLandingDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashInBalanceLandingDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1984380483, i, -1, "com.paypal.oslo.feature.cashin.di.CashInNavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (CashInNavigationModule.kt:78)");
        }
        com.paypal.oslo.feature.cashin.ui.components.CashInWindowInsetsWrapperKt.CashInWindowInsetsWrapper(androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-774296985, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.cashin.di.CashInNavigationModule.m13384$r8$lambda$DHq8PjQjaL021b3UsIOd1fqpew(com.paypal.oslo.core.navigation.AppNavigator.this, cashInBalanceLandingDestination, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rVdcLLi4NO_g9NRvxNFCF_MbDMQ(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1215656515, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.cashin.di.CashInNavigationModule.$r8$lambda$sWB9fwzlrM9aMyL413JMyFsAWj8(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.cashin.api.navigation.MethodSelectionDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cashin.api.navigation.MethodSelectionDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cashin.api.navigation.MethodSelectionDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$provideMethodSelectionNavigation$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.cashin.api.navigation.MethodSelectionDestination methodSelectionDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(methodSelectionDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cashin.api.navigation.MethodSelectionDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$provideMethodSelectionNavigation$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.cashin.api.navigation.MethodSelectionDestination methodSelectionDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rzJ3z3fGPw_VhJuvu7klWMjA4gQ(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.cashin.api.navigation.CashInDisableFeatureDestination cashInDisableFeatureDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashInDisableFeatureDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1528993901, i, -1, "com.paypal.oslo.feature.cashin.di.CashInNavigationModule.provideFeatureDisabledNavigation.<anonymous>.<anonymous> (CashInNavigationModule.kt:151)");
        }
        com.paypal.oslo.feature.cashin.ui.components.CashInWindowInsetsWrapperKt.CashInWindowInsetsWrapper(androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(386876675, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.cashin.di.CashInNavigationModule.$r8$lambda$3hCXyAJDZY83diFq8a2osuWZYwE(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sWB9fwzlrM9aMyL413JMyFsAWj8(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.cashin.api.navigation.MethodSelectionDestination methodSelectionDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(methodSelectionDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1215656515, i, -1, "com.paypal.oslo.feature.cashin.di.CashInNavigationModule.provideMethodSelectionNavigation.<anonymous>.<anonymous> (CashInNavigationModule.kt:111)");
        }
        com.paypal.oslo.feature.cashin.ui.components.CashInWindowInsetsWrapperKt.CashInWindowInsetsWrapper(androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(464044013, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.di.CashInNavigationModule$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.cashin.di.CashInNavigationModule.$r8$lambda$SWZklkc5B6tVC88thJGLLzQlzxI(com.paypal.oslo.feature.cashin.api.navigation.MethodSelectionDestination.this, appNavigator, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
