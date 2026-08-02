package com.paypal.oslo.feature.savings.di.navigation;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u000b\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ2\u0010\u000f\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\fJ2\u0010\u0010\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\fJ2\u0010\u0011\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/savings/di/navigation/InternalNavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideMoneyManagementNavigation", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)Lkotlin/jvm/functions/Function1;", "provideGoalNavigation", "()Lkotlin/jvm/functions/Function1;", "provideContentNavigation", "provideInfoSheetNavigation", "provideDocumentSheetNavigation"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes14.dex */
public final class InternalNavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule INSTANCE = new com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule();

    private InternalNavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideMoneyManagementNavigation(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule.m18707$r8$lambda$KOMyPGc1WceBj7prJwZUEmnDSs(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideContentNavigation(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule.$r8$lambda$ZeaUXlxBqVWicwPNJD5ocyVrsyw(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideInfoSheetNavigation(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule.m18704$r8$lambda$6b3maIwsq3OCy2RYv1HHP31xP4(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideDocumentSheetNavigation(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule.$r8$lambda$ZjA_JWuNwl7NkZkqfa9B9o_nhxU(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    /* renamed from: $r8$lambda$1PlCPowOO2bGgE-aGkemoMC7mXk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18703$r8$lambda$1PlCPowOO2bGgEaGkemoMC7mXk(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.savings.di.navigation.SavingsAddMoneyDestination savingsAddMoneyDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsAddMoneyDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-966210102, i, -1, "com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule.provideMoneyManagementNavigation.<anonymous>.<anonymous> (InternalNavigationModule.kt:62)");
            }
            com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsBaseMoneyManagementScreenKt.SavingsBaseMoneyManagementScreen(com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.ADD_MONEY, appNavigator, null, composer, 6, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4pFD4L3l_QbuAwlZu_wb9xST9d4(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final boolean z) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule.$r8$lambda$qQ3HAar6XnXk_DwYEYMf__sDAho(z, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$6b-3maIwsq3OCy2RYv1HHP31xP4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18704$r8$lambda$6b3maIwsq3OCy2RYv1HHP31xP4(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map bottomSheetMetadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(null, false, true, false, null, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule.m18711$r8$lambda$xaqD3HJLNcJoOdS1JZIgFmWsnU(com.paypal.oslo.core.navigation.AppNavigator.this);
            }
        }, null, 91, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.savings.di.navigation.AutoSaveInfoSheetDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m18690getLambda$1802694432$savings_prodRelease = com.paypal.oslo.feature.savings.di.navigation.ComposableSingletons$InternalNavigationModuleKt.INSTANCE.m18690getLambda$1802694432$savings_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.di.navigation.AutoSaveInfoSheetDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.di.navigation.AutoSaveInfoSheetDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$provideInfoSheetNavigation$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.savings.di.navigation.AutoSaveInfoSheetDestination autoSaveInfoSheetDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(autoSaveInfoSheetDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.di.navigation.AutoSaveInfoSheetDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$provideInfoSheetNavigation$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.savings.di.navigation.AutoSaveInfoSheetDestination autoSaveInfoSheetDestination) {
                return bottomSheetMetadata$default;
            }
        }, (kotlin.jvm.functions.Function3) m18690getLambda$1802694432$savings_prodRelease);
        final java.util.Map bottomSheetMetadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(null, false, true, false, null, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule.m18708$r8$lambda$N_MFm8GXJ2V1w3CuWIewA4Pudg(com.paypal.oslo.core.navigation.AppNavigator.this);
            }
        }, null, 91, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.savings.di.navigation.SavingsStatementsSheetDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m18691getLambda$1942426084$savings_prodRelease = com.paypal.oslo.feature.savings.di.navigation.ComposableSingletons$InternalNavigationModuleKt.INSTANCE.m18691getLambda$1942426084$savings_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.di.navigation.SavingsStatementsSheetDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.di.navigation.SavingsStatementsSheetDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$provideInfoSheetNavigation$lambda$0$$inlined$entry$default$3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.savings.di.navigation.SavingsStatementsSheetDestination savingsStatementsSheetDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(savingsStatementsSheetDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.di.navigation.SavingsStatementsSheetDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$provideInfoSheetNavigation$lambda$0$$inlined$entry$default$4
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.savings.di.navigation.SavingsStatementsSheetDestination savingsStatementsSheetDestination) {
                return bottomSheetMetadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) m18691getLambda$1942426084$savings_prodRelease);
        final java.util.Map bottomSheetMetadata$default3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(null, false, true, false, null, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule.m18710$r8$lambda$rNO6pVQPIT85BEsZD_WTIpKQy8(com.paypal.oslo.core.navigation.AppNavigator.this);
            }
        }, null, 91, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.savings.di.navigation.ApyInfoSheetDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> lambda$1034823392$savings_prodRelease = com.paypal.oslo.feature.savings.di.navigation.ComposableSingletons$InternalNavigationModuleKt.INSTANCE.getLambda$1034823392$savings_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.di.navigation.ApyInfoSheetDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.di.navigation.ApyInfoSheetDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$provideInfoSheetNavigation$lambda$0$$inlined$entry$default$5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.savings.di.navigation.ApyInfoSheetDestination apyInfoSheetDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(apyInfoSheetDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.di.navigation.ApyInfoSheetDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$provideInfoSheetNavigation$lambda$0$$inlined$entry$default$6
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.savings.di.navigation.ApyInfoSheetDestination apyInfoSheetDestination) {
                return bottomSheetMetadata$default3;
            }
        }, (kotlin.jvm.functions.Function3) lambda$1034823392$savings_prodRelease);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8_lsc8EksUfwNEk1JfIzOedbsKQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.savings.di.navigation.SavingsTransferMoneyDestination savingsTransferMoneyDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsTransferMoneyDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1745812325, i, -1, "com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule.provideMoneyManagementNavigation.<anonymous>.<anonymous> (InternalNavigationModule.kt:52)");
            }
            com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsBaseMoneyManagementScreenKt.SavingsBaseMoneyManagementScreen(com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.TRANSFER_MONEY, appNavigator, null, composer, 6, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8ebkrmBhfTV1jmyBL2MFS8Cug24(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$DUzIh9DQFU2LGqJ44TyQa8Zn-kc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18705$r8$lambda$DUzIh9DQFU2LGqJ44TyQa8Znkc(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EolhCCQ4kifSunbkq9ugMGVc65o(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule.m18709$r8$lambda$SqcIXnKUaYKgm00xLUyFVK2Xk((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Insbtg7NNUrTirxUzo0wGxEJa4w(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$JFYRf2iCz0Z_-j9vwLAn52C6rTo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18706$r8$lambda$JFYRf2iCz0Z_j9vwLAn52C6rTo(android.content.Context context) {
        com.paypal.oslo.feature.savings.ui.savingshub.webview.SavingsWebViewScreenKt.openPdfInExternalViewer(context, com.paypal.oslo.feature.savings.constants.SavingsConstants.DocumentUrls.SYNCHRONY_E_DELIVERY_TERMS);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$KOMyPGc-1WceBj7prJwZUEmnDSs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18707$r8$lambda$KOMyPGc1WceBj7prJwZUEmnDSs(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1745812325, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule.$r8$lambda$8_lsc8EksUfwNEk1JfIzOedbsKQ(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.savings.di.navigation.SavingsTransferMoneyDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.di.navigation.SavingsTransferMoneyDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.di.navigation.SavingsTransferMoneyDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$provideMoneyManagementNavigation$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.savings.di.navigation.SavingsTransferMoneyDestination savingsTransferMoneyDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(savingsTransferMoneyDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.di.navigation.SavingsTransferMoneyDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$provideMoneyManagementNavigation$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.savings.di.navigation.SavingsTransferMoneyDestination savingsTransferMoneyDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        final java.util.Map l2Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-966210102, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule.m18703$r8$lambda$1PlCPowOO2bGgEaGkemoMC7mXk(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.savings.di.navigation.SavingsAddMoneyDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.di.navigation.SavingsAddMoneyDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.di.navigation.SavingsAddMoneyDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$provideMoneyManagementNavigation$lambda$0$$inlined$entry$default$3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.savings.di.navigation.SavingsAddMoneyDestination savingsAddMoneyDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(savingsAddMoneyDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.di.navigation.SavingsAddMoneyDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$provideMoneyManagementNavigation$lambda$0$$inlined$entry$default$4
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.savings.di.navigation.SavingsAddMoneyDestination savingsAddMoneyDestination) {
                return l2Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance2);
        final java.util.Map l2Metadata$default3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.savings.di.navigation.SavingsAmountInputDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m18689getLambda$1663432864$savings_prodRelease = com.paypal.oslo.feature.savings.di.navigation.ComposableSingletons$InternalNavigationModuleKt.INSTANCE.m18689getLambda$1663432864$savings_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.di.navigation.SavingsAmountInputDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.di.navigation.SavingsAmountInputDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$provideMoneyManagementNavigation$lambda$0$$inlined$entry$default$5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.savings.di.navigation.SavingsAmountInputDestination savingsAmountInputDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(savingsAmountInputDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.di.navigation.SavingsAmountInputDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$provideMoneyManagementNavigation$lambda$0$$inlined$entry$default$6
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.savings.di.navigation.SavingsAmountInputDestination savingsAmountInputDestination) {
                return l2Metadata$default3;
            }
        }, (kotlin.jvm.functions.Function3) m18689getLambda$1663432864$savings_prodRelease);
        final java.util.Map bottomSheetMetadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(null, false, false, false, null, null, null, 127, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.savings.di.navigation.SavingsReviewDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> lambda$690533505$savings_prodRelease = com.paypal.oslo.feature.savings.di.navigation.ComposableSingletons$InternalNavigationModuleKt.INSTANCE.getLambda$690533505$savings_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.di.navigation.SavingsReviewDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.di.navigation.SavingsReviewDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$provideMoneyManagementNavigation$lambda$0$$inlined$entry$default$7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.savings.di.navigation.SavingsReviewDestination savingsReviewDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(savingsReviewDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.di.navigation.SavingsReviewDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$provideMoneyManagementNavigation$lambda$0$$inlined$entry$default$8
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.savings.di.navigation.SavingsReviewDestination savingsReviewDestination) {
                return bottomSheetMetadata$default;
            }
        }, (kotlin.jvm.functions.Function3) lambda$690533505$savings_prodRelease);
        final java.util.Map l2Metadata$default4 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.savings.di.navigation.AutoSaveManageDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> lambda$1928150294$savings_prodRelease = com.paypal.oslo.feature.savings.di.navigation.ComposableSingletons$InternalNavigationModuleKt.INSTANCE.getLambda$1928150294$savings_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.di.navigation.AutoSaveManageDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.di.navigation.AutoSaveManageDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$provideMoneyManagementNavigation$lambda$0$$inlined$entry$default$9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.savings.di.navigation.AutoSaveManageDestination autoSaveManageDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(autoSaveManageDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.di.navigation.AutoSaveManageDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$provideMoneyManagementNavigation$lambda$0$$inlined$entry$default$10
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.savings.di.navigation.AutoSaveManageDestination autoSaveManageDestination) {
                return l2Metadata$default4;
            }
        }, (kotlin.jvm.functions.Function3) lambda$1928150294$savings_prodRelease);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$N_M-Fm8GXJ2V1w3CuWIewA4Pudg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18708$r8$lambda$N_MFm8GXJ2V1w3CuWIewA4Pudg(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule.$r8$lambda$_ogDNonC2ok4iYWhbH4Kk71MXJQ((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RbNRLeMNAbWTd2Zl2N9GPytnfxw(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule.$r8$lambda$8ebkrmBhfTV1jmyBL2MFS8Cug24((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ReY_EzOY6UmWcqYe4eF9vpqUL9M(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.savings.di.navigation.TaxStatementDeliveryPreferenceSheetDestination taxStatementDeliveryPreferenceSheetDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxStatementDeliveryPreferenceSheetDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(taxStatementDeliveryPreferenceSheetDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2127042932, i, -1, "com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule.provideDocumentSheetNavigation.<anonymous>.<anonymous> (InternalNavigationModule.kt:221)");
            }
            final android.content.Context context = (android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            boolean electronic1099OptIn = taxStatementDeliveryPreferenceSheetDestination.getElectronic1099OptIn();
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule.$r8$lambda$4pFD4L3l_QbuAwlZu_wb9xST9d4(com.paypal.oslo.core.navigation.AppNavigator.this, ((java.lang.Boolean) obj).booleanValue());
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            boolean changedInstance = composer.changedInstance(context);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule.m18706$r8$lambda$JFYRf2iCz0Z_j9vwLAn52C6rTo(context);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.savings.ui.savingshub.documentzone.TaxStatementDeliveryPreferenceHalfSheetKt.TaxStatementDeliveryPreferenceHalfSheet(electronic1099OptIn, function1, (kotlin.jvm.functions.Function0) rememberedValue2, null, composer, 0, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$SqcIXnK-Ua-YKgm00xLUyFVK2Xk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18709$r8$lambda$SqcIXnKUaYKgm00xLUyFVK2Xk(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UXpNfd5Z8NXxaKKft5afKGL8NPc(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.savings.di.navigation.SavingsWebViewDestination savingsWebViewDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsWebViewDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(savingsWebViewDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1993726578, i, -1, "com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule.provideContentNavigation.<anonymous>.<anonymous> (InternalNavigationModule.kt:157)");
            }
            java.lang.String url = savingsWebViewDestination.getUrl();
            java.lang.String title = savingsWebViewDestination.getTitle();
            boolean requiresAuth = savingsWebViewDestination.getRequiresAuth();
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule.$r8$lambda$EolhCCQ4kifSunbkq9ugMGVc65o(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.savings.ui.savingshub.webview.SavingsWebViewScreenKt.SavingsWebViewScreen(url, title, (kotlin.jvm.functions.Function0) rememberedValue, null, requiresAuth, composer, 0, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZeaUXlxBqVWicwPNJD5ocyVrsyw(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.savings.di.navigation.SavingsEducationalDetailsDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m18692getLambda$1956490725$savings_prodRelease = com.paypal.oslo.feature.savings.di.navigation.ComposableSingletons$InternalNavigationModuleKt.INSTANCE.m18692getLambda$1956490725$savings_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.di.navigation.SavingsEducationalDetailsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.di.navigation.SavingsEducationalDetailsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$provideContentNavigation$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.savings.di.navigation.SavingsEducationalDetailsDestination savingsEducationalDetailsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(savingsEducationalDetailsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.di.navigation.SavingsEducationalDetailsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$provideContentNavigation$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.savings.di.navigation.SavingsEducationalDetailsDestination savingsEducationalDetailsDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) m18692getLambda$1956490725$savings_prodRelease);
        final java.util.Map l2Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1993726578, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule.$r8$lambda$UXpNfd5Z8NXxaKKft5afKGL8NPc(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.savings.di.navigation.SavingsWebViewDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.di.navigation.SavingsWebViewDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.di.navigation.SavingsWebViewDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$provideContentNavigation$lambda$0$$inlined$entry$default$3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.savings.di.navigation.SavingsWebViewDestination savingsWebViewDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(savingsWebViewDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.di.navigation.SavingsWebViewDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$provideContentNavigation$lambda$0$$inlined$entry$default$4
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.savings.di.navigation.SavingsWebViewDestination savingsWebViewDestination) {
                return l2Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZjA_JWuNwl7NkZkqfa9B9o_nhxU(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map bottomSheetMetadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(null, false, true, false, null, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule.$r8$lambda$tQTTc1ryE0sULasDqVZa2pMVEFw(com.paypal.oslo.core.navigation.AppNavigator.this);
            }
        }, null, 91, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2127042932, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule.$r8$lambda$ReY_EzOY6UmWcqYe4eF9vpqUL9M(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.savings.di.navigation.TaxStatementDeliveryPreferenceSheetDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.di.navigation.TaxStatementDeliveryPreferenceSheetDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.di.navigation.TaxStatementDeliveryPreferenceSheetDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$provideDocumentSheetNavigation$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.savings.di.navigation.TaxStatementDeliveryPreferenceSheetDestination taxStatementDeliveryPreferenceSheetDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(taxStatementDeliveryPreferenceSheetDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.di.navigation.TaxStatementDeliveryPreferenceSheetDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$provideDocumentSheetNavigation$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.savings.di.navigation.TaxStatementDeliveryPreferenceSheetDestination taxStatementDeliveryPreferenceSheetDestination) {
                return bottomSheetMetadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        final java.util.Map bottomSheetMetadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(null, false, true, false, null, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule.$r8$lambda$RbNRLeMNAbWTd2Zl2N9GPytnfxw(com.paypal.oslo.core.navigation.AppNavigator.this);
            }
        }, null, 91, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.savings.di.navigation.FdicInsuranceSheetDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m18688getLambda$1095047996$savings_prodRelease = com.paypal.oslo.feature.savings.di.navigation.ComposableSingletons$InternalNavigationModuleKt.INSTANCE.m18688getLambda$1095047996$savings_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.di.navigation.FdicInsuranceSheetDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.di.navigation.FdicInsuranceSheetDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$provideDocumentSheetNavigation$lambda$0$$inlined$entry$default$3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.savings.di.navigation.FdicInsuranceSheetDestination fdicInsuranceSheetDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(fdicInsuranceSheetDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.di.navigation.FdicInsuranceSheetDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$provideDocumentSheetNavigation$lambda$0$$inlined$entry$default$4
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.savings.di.navigation.FdicInsuranceSheetDestination fdicInsuranceSheetDestination) {
                return bottomSheetMetadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) m18688getLambda$1095047996$savings_prodRelease);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_ogDNonC2ok4iYWhbH4Kk71MXJQ(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$caly1xkus86mqOdHkdxErxJYESs(androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.savings.di.navigation.SavingsInterestEarningsDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> lambda$1200949139$savings_prodRelease = com.paypal.oslo.feature.savings.di.navigation.ComposableSingletons$InternalNavigationModuleKt.INSTANCE.getLambda$1200949139$savings_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.di.navigation.SavingsInterestEarningsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.di.navigation.SavingsInterestEarningsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$provideGoalNavigation$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.savings.di.navigation.SavingsInterestEarningsDestination savingsInterestEarningsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(savingsInterestEarningsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.di.navigation.SavingsInterestEarningsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$provideGoalNavigation$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.savings.di.navigation.SavingsInterestEarningsDestination savingsInterestEarningsDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) lambda$1200949139$savings_prodRelease);
        final java.util.Map l2Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.savings.di.navigation.SavingsCreateGoalDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m18693getLambda$244360946$savings_prodRelease = com.paypal.oslo.feature.savings.di.navigation.ComposableSingletons$InternalNavigationModuleKt.INSTANCE.m18693getLambda$244360946$savings_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.di.navigation.SavingsCreateGoalDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.di.navigation.SavingsCreateGoalDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$provideGoalNavigation$lambda$0$$inlined$entry$default$3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.savings.di.navigation.SavingsCreateGoalDestination savingsCreateGoalDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(savingsCreateGoalDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.di.navigation.SavingsCreateGoalDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$provideGoalNavigation$lambda$0$$inlined$entry$default$4
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.savings.di.navigation.SavingsCreateGoalDestination savingsCreateGoalDestination) {
                return l2Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) m18693getLambda$244360946$savings_prodRelease);
        final java.util.Map l2Metadata$default3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.savings.di.navigation.SavingsEditGoalDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> lambda$1691166913$savings_prodRelease = com.paypal.oslo.feature.savings.di.navigation.ComposableSingletons$InternalNavigationModuleKt.INSTANCE.getLambda$1691166913$savings_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.di.navigation.SavingsEditGoalDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.di.navigation.SavingsEditGoalDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$provideGoalNavigation$lambda$0$$inlined$entry$default$5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.savings.di.navigation.SavingsEditGoalDestination savingsEditGoalDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(savingsEditGoalDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.di.navigation.SavingsEditGoalDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$provideGoalNavigation$lambda$0$$inlined$entry$default$6
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.savings.di.navigation.SavingsEditGoalDestination savingsEditGoalDestination) {
                return l2Metadata$default3;
            }
        }, (kotlin.jvm.functions.Function3) lambda$1691166913$savings_prodRelease);
        final java.util.Map l2Metadata$default4 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.savings.di.navigation.SavingsGoalDetailsDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m18694getLambda$320225844$savings_prodRelease = com.paypal.oslo.feature.savings.di.navigation.ComposableSingletons$InternalNavigationModuleKt.INSTANCE.m18694getLambda$320225844$savings_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.di.navigation.SavingsGoalDetailsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.di.navigation.SavingsGoalDetailsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$provideGoalNavigation$lambda$0$$inlined$entry$default$7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.savings.di.navigation.SavingsGoalDetailsDestination savingsGoalDetailsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(savingsGoalDetailsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.di.navigation.SavingsGoalDetailsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$provideGoalNavigation$lambda$0$$inlined$entry$default$8
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.savings.di.navigation.SavingsGoalDetailsDestination savingsGoalDetailsDestination) {
                return l2Metadata$default4;
            }
        }, (kotlin.jvm.functions.Function3) m18694getLambda$320225844$savings_prodRelease);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iF9dgqnwrABnPVx8HEDxb9jw1Xg(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qQ3HAar6XnXk_DwYEYMf__sDAho(boolean z, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.savings.navigation.result.TaxStatementPreferenceNavResult(z));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$rNO6-pVQPIT85BEsZD_WTIpKQy8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18710$r8$lambda$rNO6pVQPIT85BEsZD_WTIpKQy8(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule.m18705$r8$lambda$DUzIh9DQFU2LGqJ44TyQa8Znkc((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tQTTc1ryE0sULasDqVZa2pMVEFw(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule.$r8$lambda$iF9dgqnwrABnPVx8HEDxb9jw1Xg((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$xaqD-3HJLNcJoOdS1JZIgFmWsnU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18711$r8$lambda$xaqD3HJLNcJoOdS1JZIgFmWsnU(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule.$r8$lambda$Insbtg7NNUrTirxUzo0wGxEJa4w((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideGoalNavigation() {
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule.$r8$lambda$caly1xkus86mqOdHkdxErxJYESs((androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }
}
