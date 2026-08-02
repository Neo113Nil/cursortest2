package com.paypal.oslo.feature.taxanddocumentcenter.di.navigation;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u000b\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/di/navigation/NavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideEntryProviderInstaller", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes15.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule.$r8$lambda$CKqQc9X6W9w9deNjq8i8NiH9a6Q(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    /* renamed from: $r8$lambda$0BS-UXluUAT1B3SH94VIj4PZ6r0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20292$r8$lambda$0BSUXluUAT1B3SH94VIj4PZ6r0(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2LKlUgAk8kTVGYWzXhVuSO_Zjyo(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$AAN36i3K-Iv4jC83Q5DUb-mLH4E, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20293$r8$lambda$AAN36i3KIv4jC83Q5DUbmLH4E(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CKqQc9X6W9w9deNjq8i8NiH9a6Q(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_menu_top_nav_title), false, null, null, false, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule.$r8$lambda$ZJe4FzETC3eA3OkjYxtTUQeMp8A(com.paypal.oslo.core.navigation.AppNavigator.this);
            }
        }, null, false, 445, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.StatementsAndTaxesDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m20291getLambda$658325534$tax_and_document_center_prodRelease = com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.ComposableSingletons$NavigationModuleKt.INSTANCE.m20291getLambda$658325534$tax_and_document_center_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.StatementsAndTaxesDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.StatementsAndTaxesDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.StatementsAndTaxesDestination statementsAndTaxesDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(statementsAndTaxesDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.StatementsAndTaxesDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.StatementsAndTaxesDestination statementsAndTaxesDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) m20291getLambda$658325534$tax_and_document_center_prodRelease);
        final java.util.Map l2Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1774658030, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule.$r8$lambda$JrA2dsME1RZItw_qhf0ZXd5phDQ(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.TaxDocumentsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.TaxDocumentsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.TaxDocumentsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.TaxDocumentsDestination taxDocumentsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(taxDocumentsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.TaxDocumentsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$4
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.TaxDocumentsDestination taxDocumentsDestination) {
                return l2Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        final java.util.Map l2Metadata$default3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-679640924, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule.$r8$lambda$r2pKMn72b5d7fReGIjOv6PsAx7Q(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.AllTransactionsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.AllTransactionsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.AllTransactionsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.AllTransactionsDestination allTransactionsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(allTransactionsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.AllTransactionsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$6
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.AllTransactionsDestination allTransactionsDestination) {
                return l2Metadata$default3;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance2);
        final java.util.Map l2Metadata$default4 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(792786475, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule.m20294$r8$lambda$VmhrkoI_C3B1XTeQsm8_kB4s0U(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.CustomStatementDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.CustomStatementDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.CustomStatementDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.CustomStatementDestination customStatementDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(customStatementDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.CustomStatementDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$8
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.CustomStatementDestination customStatementDestination) {
                return l2Metadata$default4;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance3);
        final java.util.Map l2Metadata$default5 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance4 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(335627762, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule.m20295$r8$lambda$swNEJ7TazmfyAoar63vtW7ZeQc(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.CustomStatementDownloadDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.CustomStatementDownloadDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.CustomStatementDownloadDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.CustomStatementDownloadDestination customStatementDownloadDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(customStatementDownloadDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.CustomStatementDownloadDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$10
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.CustomStatementDownloadDestination customStatementDownloadDestination) {
                return l2Metadata$default5;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance4);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IkxC4vNr7sehcH0sCNlrnKq0ViM(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule.m20292$r8$lambda$0BSUXluUAT1B3SH94VIj4PZ6r0((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JrA2dsME1RZItw_qhf0ZXd5phDQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.TaxDocumentsDestination taxDocumentsDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxDocumentsDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1774658030, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:53)");
        }
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt.TaxDocumentsScreen(appNavigator, null, null, composer, 0, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OYZ2W8p32K8mZagCDIQl87zk6jQ(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$VmhrkoI_C3B1XTeQsm8_kB-4s0U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20294$r8$lambda$VmhrkoI_C3B1XTeQsm8_kB4s0U(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.CustomStatementDestination customStatementDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customStatementDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(792786475, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:73)");
        }
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule.$r8$lambda$ZzbAuglUsWJuCHhuy45m_Xqiinc(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.screen.CustomStatementScreenKt.CustomStatementScreen(null, null, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0, 3);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZJe4FzETC3eA3OkjYxtTUQeMp8A(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule.$r8$lambda$2LKlUgAk8kTVGYWzXhVuSO_Zjyo((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZzbAuglUsWJuCHhuy45m_Xqiinc(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule.m20293$r8$lambda$AAN36i3KIv4jC83Q5DUbmLH4E((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$r2pKMn72b5d7fReGIjOv6PsAx7Q(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.AllTransactionsDestination allTransactionsDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allTransactionsDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-679640924, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:63)");
        }
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule.$r8$lambda$uewBjk3YWPJHczCFO0dknRhjc58(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt.AllTransactionsScreen(null, null, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0, 3);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$swNEJ7Tazmf-yAoar63vtW7ZeQc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20295$r8$lambda$swNEJ7TazmfyAoar63vtW7ZeQc(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.CustomStatementDownloadDestination customStatementDownloadDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customStatementDownloadDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(335627762, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:83)");
        }
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule.$r8$lambda$IkxC4vNr7sehcH0sCNlrnKq0ViM(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.view.screen.CustomStatementDownloadScreenKt.CustomStatementDownloadScreen((kotlin.jvm.functions.Function0) rememberedValue, null, null, composer, 0, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uewBjk3YWPJHczCFO0dknRhjc58(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.taxanddocumentcenter.di.navigation.NavigationModule.$r8$lambda$OYZ2W8p32K8mZagCDIQl87zk6jQ((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }
}
