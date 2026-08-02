package com.paypal.oslo.feature.packagetracking.di;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u0004\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\t¢\u0006\u0002\b\b2\u0006\u0010\n\u001a\u00020\u000bH\u0007J+\u0010\f\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\t¢\u0006\u0002\b\b2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u008e\u0002"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/di/NavigationModule;", "", "<init>", "()V", "providePackageDetailEntry", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lkotlin/ExtensionFunctionType;", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "providePackageSettingsEntry", "package-tracking_prodRelease", "refreshTrigger", ""}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.packagetracking.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.packagetracking.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> providePackageDetailEntry(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.packagetracking.di.NavigationModule$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.packagetracking.di.NavigationModule.$r8$lambda$WEiEYzfMk5o74gxPb0bGGy8gWLc(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> providePackageSettingsEntry(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.packagetracking.di.NavigationModule$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.packagetracking.di.NavigationModule.$r8$lambda$0hAnUzTzh3GWKLEQV36r_wkZ3uA(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0hAnUzTzh3GWKLEQV36r_wkZ3uA(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1805069672, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.packagetracking.di.NavigationModule$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.packagetracking.di.NavigationModule.m17471$r8$lambda$RYuJP0MP7vmufRIcKCOgVscsOw(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.packagetracking.api.navigation.PackageSettingsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.packagetracking.api.navigation.PackageSettingsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.packagetracking.api.navigation.PackageSettingsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.packagetracking.di.NavigationModule$providePackageSettingsEntry$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.packagetracking.api.navigation.PackageSettingsDestination packageSettingsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(packageSettingsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.packagetracking.api.navigation.PackageSettingsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.packagetracking.di.NavigationModule$providePackageSettingsEntry$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.packagetracking.api.navigation.PackageSettingsDestination packageSettingsDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$MCRNJa4fU-4Qk57uJ7Rf6eSF_cE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17470$r8$lambda$MCRNJa4fU4Qk57uJ7Rf6eSF_cE(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str) {
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.packagetracking.api.navigation.result.PackageSettingsNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.packagetracking.di.NavigationModule$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.packagetracking.di.NavigationModule.$r8$lambda$Z6MY_8G_EiKQRsAM7pnzcq_l5Yo((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NQbFlNW_eeRwRm5nQPltuKG4NTw(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.packagetracking.di.NavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.packagetracking.di.NavigationModule.m17474$r8$lambda$nmus1vSMTux06iHuoKZ0kOQO9k((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$RY-uJP0MP7vmufRIcKCOgVscsOw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17471$r8$lambda$RYuJP0MP7vmufRIcKCOgVscsOw(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.packagetracking.api.navigation.PackageSettingsDestination packageSettingsDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageSettingsDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1805069672, i, -1, "com.paypal.oslo.feature.packagetracking.di.NavigationModule.providePackageSettingsEntry.<anonymous>.<anonymous> (NavigationModule.kt:86)");
        }
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.packagetracking.di.NavigationModule$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.packagetracking.di.NavigationModule.$r8$lambda$rWODmsMGirfqRqtdMM8ziBLece0(com.paypal.oslo.core.navigation.AppNavigator.this, ((java.lang.Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsScreenKt.PackageSettingsScreen(packageSettingsDestination, null, (kotlin.jvm.functions.Function1) rememberedValue, composer, i & 14, 2);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WEiEYzfMk5o74gxPb0bGGy8gWLc(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-936075224, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.packagetracking.di.NavigationModule$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.packagetracking.di.NavigationModule.$r8$lambda$vRr64SOhvliJGViItEAU2Hcyfps(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.packagetracking.api.navigation.PackageDetailDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.packagetracking.api.navigation.PackageDetailDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.packagetracking.api.navigation.PackageDetailDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.packagetracking.di.NavigationModule$providePackageDetailEntry$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.packagetracking.api.navigation.PackageDetailDestination packageDetailDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(packageDetailDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.packagetracking.api.navigation.PackageDetailDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.packagetracking.di.NavigationModule$providePackageDetailEntry$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.packagetracking.api.navigation.PackageDetailDestination packageDetailDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Ytck-0Hl8vDdQabOh7B_U9yqkPo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17472$r8$lambda$Ytck0Hl8vDdQabOh7B_U9yqkPo(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.packagetracking.api.navigation.result.PackageSettingsNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.packagetracking.di.NavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.packagetracking.di.NavigationModule.m17473$r8$lambda$anv4lfSbC8GrmvT_zMEE0Jy8H0(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Z6MY_8G_EiKQRsAM7pnzcq_l5Yo(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.packagetracking.api.navigation.PackageSettingsDestination((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$anv4lfSbC8-GrmvT_zMEE0Jy8H0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17473$r8$lambda$anv4lfSbC8GrmvT_zMEE0Jy8H0(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        java.lang.String lowerCase = emailProvider.name().toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        navigationScope.push(new com.paypal.oslo.feature.packagetracking.api.navigation.PackageSettingsDestination("relink_banner", "resume_email_sync", lowerCase));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$nmus1vSMTux06iHuoKZ0kO-QO9k, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17474$r8$lambda$nmus1vSMTux06iHuoKZ0kOQO9k(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qeX7OtKAMw1OptMbbWBSR2x6Gk0(boolean z, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.packagetracking.api.navigation.result.PackageSettingsNavResult(z));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rWODmsMGirfqRqtdMM8ziBLece0(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final boolean z) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.packagetracking.di.NavigationModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.packagetracking.di.NavigationModule.$r8$lambda$qeX7OtKAMw1OptMbbWBSR2x6Gk0(z, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vRr64SOhvliJGViItEAU2Hcyfps(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.packagetracking.api.navigation.PackageDetailDestination packageDetailDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageDetailDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-936075224, i, -1, "com.paypal.oslo.feature.packagetracking.di.NavigationModule.providePackageDetailEntry.<anonymous>.<anonymous> (NavigationModule.kt:47)");
        }
        final java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(composer, 0);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(0);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.runtime.MutableIntState mutableIntState = (androidx.compose.runtime.MutableIntState) rememberedValue;
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.packagetracking.di.NavigationModule$providePackageDetailEntry$1$1$1$1(mutableIntState, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue2;
        com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, composer, 0);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.packagetracking.di.NavigationModule$providePackageDetailEntry$lambda$0$0$$inlined$NavResultEffect-rtGRyWw$1
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                    return m17475invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                }

                /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                public final kotlinx.coroutines.flow.Flow<java.lang.Object> m17475invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                    return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue3, composer, 3072);
        boolean changed = composer.changed(appNavigator);
        boolean changed2 = composer.changed(rememberNavResultRequestId);
        java.lang.Object rememberedValue4 = composer.rememberedValue();
        if ((changed | changed2) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.di.NavigationModule$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.packagetracking.di.NavigationModule.m17470$r8$lambda$MCRNJa4fU4Qk57uJ7Rf6eSF_cE(com.paypal.oslo.core.navigation.AppNavigator.this, rememberNavResultRequestId);
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue4;
        boolean changed3 = composer.changed(appNavigator);
        java.lang.Object rememberedValue5 = composer.rememberedValue();
        if (changed3 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.di.NavigationModule$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.packagetracking.di.NavigationModule.$r8$lambda$NQbFlNW_eeRwRm5nQPltuKG4NTw(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue5);
        }
        kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue5;
        boolean changed4 = composer.changed(appNavigator);
        boolean changed5 = composer.changed(rememberNavResultRequestId);
        java.lang.Object rememberedValue6 = composer.rememberedValue();
        if ((changed4 | changed5) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.packagetracking.di.NavigationModule$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.packagetracking.di.NavigationModule.m17472$r8$lambda$Ytck0Hl8vDdQabOh7B_U9yqkPo(com.paypal.oslo.core.navigation.AppNavigator.this, rememberNavResultRequestId, (com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue6);
        }
        com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailScreenKt.PackageDetailScreen(packageDetailDestination, null, function02, function0, (kotlin.jvm.functions.Function1) rememberedValue6, mutableIntState.getIntValue(), null, null, composer, i & 14, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
