package com.paypal.oslo.feature.controlcenter.di;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u000b\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/controlcenter/di/NavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideEntryProviderInstaller", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes12.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.controlcenter.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.controlcenter.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.controlcenter.di.NavigationModule$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.controlcenter.di.NavigationModule.$r8$lambda$Gjd20MRgEe3czbqyNy_vk10RMJM(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Gjd20MRgEe3czbqyNy_vk10RMJM(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map<java.lang.String, java.lang.Object> l1TabbedMetadata = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l1TabbedMetadata("Me");
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-352504284, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.controlcenter.di.NavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.controlcenter.di.NavigationModule.$r8$lambda$qnKqIJ0zmbL4u4MA0Kd_ywb5RZE(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.controlcenter.api.navigation.ControlCenterEntrypoint) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.controlcenter.api.navigation.ControlCenterEntrypoint.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.controlcenter.api.navigation.ControlCenterEntrypoint, java.lang.Object>() { // from class: com.paypal.oslo.feature.controlcenter.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.controlcenter.api.navigation.ControlCenterEntrypoint controlCenterEntrypoint) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(controlCenterEntrypoint);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.controlcenter.api.navigation.ControlCenterEntrypoint, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.controlcenter.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.controlcenter.api.navigation.ControlCenterEntrypoint controlCenterEntrypoint) {
                return l1TabbedMetadata;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        final java.util.Map<java.lang.String, java.lang.Object> l1TabbedMetadata2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l1TabbedMetadata("Me");
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-115984427, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.controlcenter.di.NavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.controlcenter.di.NavigationModule.m13721$r8$lambda$hSNkgR8GSU417QFsosRxA3evho(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.wallet.api.navigation.AccountsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.AccountsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.AccountsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.controlcenter.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.AccountsDestination accountsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(accountsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.AccountsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.controlcenter.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$4
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.api.navigation.AccountsDestination accountsDestination) {
                return l1TabbedMetadata2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance2);
        final java.util.Map<java.lang.String, java.lang.Object> l1TabbedMetadata3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l1TabbedMetadata("Me");
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-292828590, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.controlcenter.di.NavigationModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.controlcenter.di.NavigationModule.$r8$lambda$vJTCPf4KbCwVAJP1e4lEUMnvIwM(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.activity.api.navigation.PayPalActivityLedgerTabbedScreenDestinationKey) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.activity.api.navigation.PayPalActivityLedgerTabbedScreenDestinationKey.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.activity.api.navigation.PayPalActivityLedgerTabbedScreenDestinationKey, java.lang.Object>() { // from class: com.paypal.oslo.feature.controlcenter.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.activity.api.navigation.PayPalActivityLedgerTabbedScreenDestinationKey payPalActivityLedgerTabbedScreenDestinationKey) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(payPalActivityLedgerTabbedScreenDestinationKey);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.activity.api.navigation.PayPalActivityLedgerTabbedScreenDestinationKey, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.controlcenter.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$6
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.activity.api.navigation.PayPalActivityLedgerTabbedScreenDestinationKey payPalActivityLedgerTabbedScreenDestinationKey) {
                return l1TabbedMetadata3;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance3);
        final java.util.Map<java.lang.String, java.lang.Object> l1TabbedMetadata4 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l1TabbedMetadata("Me");
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance4 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-2047166324, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.controlcenter.di.NavigationModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.controlcenter.di.NavigationModule.m13719$r8$lambda$K8GIC4nsJiZWwbqfWAVhs6xUm8(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.subscriptions.api.navigation.SubscriptionsHubDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.api.navigation.SubscriptionsHubDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.subscriptions.api.navigation.SubscriptionsHubDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.controlcenter.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.subscriptions.api.navigation.SubscriptionsHubDestination subscriptionsHubDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(subscriptionsHubDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.subscriptions.api.navigation.SubscriptionsHubDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.controlcenter.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$8
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.subscriptions.api.navigation.SubscriptionsHubDestination subscriptionsHubDestination) {
                return l1TabbedMetadata4;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance4);
        final java.util.Map<java.lang.String, java.lang.Object> l1TabbedMetadata5 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l1TabbedMetadata("Me");
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance5 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1311118225, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.controlcenter.di.NavigationModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.controlcenter.di.NavigationModule.m13720$r8$lambda$ahNsNLS3FvSTTlh27dkvsZo0V4(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.settings.api.navigation.SettingsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.settings.api.navigation.SettingsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.settings.api.navigation.SettingsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.controlcenter.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.settings.api.navigation.SettingsDestination settingsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(settingsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.settings.api.navigation.SettingsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.controlcenter.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$10
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.settings.api.navigation.SettingsDestination settingsDestination) {
                return l1TabbedMetadata5;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance5);
        final java.util.Map<java.lang.String, java.lang.Object> l1TabbedMetadata6 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l1TabbedMetadata("Me");
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance6 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1530698451, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.controlcenter.di.NavigationModule$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.controlcenter.di.NavigationModule.$r8$lambda$adHWIB05WaSBlLGds1zBP9riu_Y(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businessprofile.api.navigation.BusinessProfileSalesToolsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businessprofile.api.navigation.BusinessProfileSalesToolsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businessprofile.api.navigation.BusinessProfileSalesToolsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.controlcenter.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businessprofile.api.navigation.BusinessProfileSalesToolsDestination businessProfileSalesToolsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(businessProfileSalesToolsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businessprofile.api.navigation.BusinessProfileSalesToolsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.controlcenter.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$12
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businessprofile.api.navigation.BusinessProfileSalesToolsDestination businessProfileSalesToolsDestination) {
                return l1TabbedMetadata6;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance6);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$K8GI-C4nsJiZWwbqfWAVhs6xUm8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13719$r8$lambda$K8GIC4nsJiZWwbqfWAVhs6xUm8(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.subscriptions.api.navigation.SubscriptionsHubDestination subscriptionsHubDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionsHubDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-2047166324, i, -1, "com.paypal.oslo.feature.controlcenter.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:87)");
        }
        com.paypal.oslo.feature.controlcenter.ui.screens.ControlCenterScreenKt.ControlCenterScreen(subscriptionsHubDestination, appNavigator, null, null, composer, i & 14, 12);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$adHWIB05WaSBlLGds1zBP9riu_Y(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.businessprofile.api.navigation.BusinessProfileSalesToolsDestination businessProfileSalesToolsDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessProfileSalesToolsDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1530698451, i, -1, "com.paypal.oslo.feature.controlcenter.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:102)");
        }
        com.paypal.oslo.feature.controlcenter.ui.screens.ControlCenterScreenKt.ControlCenterScreen(businessProfileSalesToolsDestination, appNavigator, null, null, composer, i & 14, 12);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ahNsNLS3FvST-Tlh27dkvsZo0V4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13720$r8$lambda$ahNsNLS3FvSTTlh27dkvsZo0V4(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.settings.api.navigation.SettingsDestination settingsDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1311118225, i, -1, "com.paypal.oslo.feature.controlcenter.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:94)");
        }
        com.paypal.oslo.feature.controlcenter.ui.screens.ControlCenterScreenKt.ControlCenterScreen(settingsDestination, appNavigator, null, null, composer, i & 14, 12);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$hSNk-gR8GSU417QFsosRxA3evho, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13721$r8$lambda$hSNkgR8GSU417QFsosRxA3evho(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.api.navigation.AccountsDestination accountsDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountsDestination, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(accountsDestination) : composer.changedInstance(accountsDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-115984427, i, -1, "com.paypal.oslo.feature.controlcenter.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:73)");
            }
            com.paypal.oslo.feature.controlcenter.ui.screens.ControlCenterScreenKt.ControlCenterScreen(accountsDestination, appNavigator, null, null, composer, com.paypal.oslo.feature.wallet.api.navigation.AccountsDestination.$stable | (i & 14), 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qnKqIJ0zmbL4u4MA0Kd_ywb5RZE(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.controlcenter.api.navigation.ControlCenterEntrypoint controlCenterEntrypoint, androidx.compose.runtime.Composer composer, int i) {
        androidx.navigation3.runtime.NavKey navKey;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(controlCenterEntrypoint, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-352504284, i, -1, "com.paypal.oslo.feature.controlcenter.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:48)");
            }
            java.util.Set<kotlin.reflect.KClass<?>> allTabDestinationTypes = com.paypal.oslo.feature.controlcenter.ui.configs.ControlCenterTabConfiguration.INSTANCE.getAllTabDestinationTypes();
            java.util.List<androidx.navigation3.runtime.NavKey> backStack = appNavigator.getBackStack();
            java.util.ListIterator<androidx.navigation3.runtime.NavKey> listIterator = backStack.listIterator(backStack.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    navKey = null;
                    break;
                }
                navKey = listIterator.previous();
                if (allTabDestinationTypes.contains(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(navKey.getClass()))) {
                    break;
                }
            }
            androidx.navigation3.runtime.NavKey navKey2 = navKey;
            if (navKey2 != null) {
                composer.startReplaceGroup(-259591999);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean changed = composer.changed(appNavigator);
                boolean changedInstance = composer.changedInstance(navKey2);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.controlcenter.di.NavigationModule$provideEntryProviderInstaller$1$1$1$1(appNavigator, navKey2, null);
                    composer.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer, 6);
                composer.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                return kotlin.Unit.INSTANCE;
            }
            composer.startReplaceGroup(-259348866);
            composer.endReplaceGroup();
            com.paypal.oslo.feature.controlcenter.ui.screens.ControlCenterScreenKt.ControlCenterScreen(((com.paypal.oslo.core.navigation.ui.l1.TabDestination) kotlin.collections.CollectionsKt.first((java.util.List) com.paypal.oslo.feature.controlcenter.ui.configs.ControlCenterTabConfiguration.INSTANCE.getTabsPersonal())).getDestination(), appNavigator, null, null, composer, 0, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vJTCPf4KbCwVAJP1e4lEUMnvIwM(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.activity.api.navigation.PayPalActivityLedgerTabbedScreenDestinationKey payPalActivityLedgerTabbedScreenDestinationKey, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalActivityLedgerTabbedScreenDestinationKey, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(payPalActivityLedgerTabbedScreenDestinationKey) : composer.changedInstance(payPalActivityLedgerTabbedScreenDestinationKey) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-292828590, i, -1, "com.paypal.oslo.feature.controlcenter.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:80)");
            }
            com.paypal.oslo.feature.controlcenter.ui.screens.ControlCenterScreenKt.ControlCenterScreen(payPalActivityLedgerTabbedScreenDestinationKey, appNavigator, null, null, composer, com.paypal.oslo.feature.activity.api.navigation.PayPalActivityLedgerTabbedScreenDestinationKey.$stable | (i & 14), 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
