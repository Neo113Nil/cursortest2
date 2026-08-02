package com.paypal.oslo.feature.savings.di.navigation;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u000b\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000b\u0010\fR;\u0010\u000e\u001a)\u0012\u0004\u0012\u00020\u0004\u0012\u001f\u0012\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n0\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/savings/di/navigation/NavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "appNavigator", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideEntryProviderInstallerSavings$savings_prodRelease", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)Lkotlin/jvm/functions/Function1;", "", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes14.dex */
public final class NavigationModule {
    public static final com.paypal.oslo.feature.savings.di.navigation.NavigationModule INSTANCE = new com.paypal.oslo.feature.savings.di.navigation.NavigationModule();
    private static final java.util.Map<com.paypal.oslo.core.navigation.AppNavigator, kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> getHighSpeedVideoFpsRanges = new java.util.LinkedHashMap();
    public static final int $stable = 8;

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstallerSavings$savings_prodRelease(final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        java.util.Map<com.paypal.oslo.core.navigation.AppNavigator, kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> map = getHighSpeedVideoFpsRanges;
        kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> function1 = map.get(appNavigator);
        if (function1 == null) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.di.navigation.NavigationModule$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.savings.di.navigation.NavigationModule.$r8$lambda$Or0bsIunf9TOLy0La8pIpAjoxOI(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
                }
            };
            map.put(appNavigator, function1);
        }
        return function1;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Or0bsIunf9TOLy0La8pIpAjoxOI(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.savings.api.navigation.SavingsHomeDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> lambda$171302541$savings_prodRelease = com.paypal.oslo.feature.savings.di.navigation.ComposableSingletons$NavigationModuleKt.INSTANCE.getLambda$171302541$savings_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.api.navigation.SavingsHomeDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.api.navigation.SavingsHomeDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.savings.di.navigation.NavigationModule$provideEntryProviderInstallerSavings$lambda$0$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.savings.api.navigation.SavingsHomeDestination savingsHomeDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(savingsHomeDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.api.navigation.SavingsHomeDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.savings.di.navigation.NavigationModule$provideEntryProviderInstallerSavings$lambda$0$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.savings.api.navigation.SavingsHomeDestination savingsHomeDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) lambda$171302541$savings_prodRelease);
        final java.util.Map l2Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.savings.api.navigation.SavingsHubDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> lambda$1283715050$savings_prodRelease = com.paypal.oslo.feature.savings.di.navigation.ComposableSingletons$NavigationModuleKt.INSTANCE.getLambda$1283715050$savings_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.api.navigation.SavingsHubDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.api.navigation.SavingsHubDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.savings.di.navigation.NavigationModule$provideEntryProviderInstallerSavings$lambda$0$0$$inlined$entry$default$3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.savings.api.navigation.SavingsHubDestination savingsHubDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(savingsHubDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.api.navigation.SavingsHubDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.savings.di.navigation.NavigationModule$provideEntryProviderInstallerSavings$lambda$0$0$$inlined$entry$default$4
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.savings.api.navigation.SavingsHubDestination savingsHubDestination) {
                return l2Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) lambda$1283715050$savings_prodRelease);
        final java.util.Map l2Metadata$default3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.savings.api.navigation.SavingsOnBoardingDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> lambda$195822569$savings_prodRelease = com.paypal.oslo.feature.savings.di.navigation.ComposableSingletons$NavigationModuleKt.INSTANCE.getLambda$195822569$savings_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.api.navigation.SavingsOnBoardingDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.api.navigation.SavingsOnBoardingDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.savings.di.navigation.NavigationModule$provideEntryProviderInstallerSavings$lambda$0$0$$inlined$entry$default$5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.savings.api.navigation.SavingsOnBoardingDestination savingsOnBoardingDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(savingsOnBoardingDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.api.navigation.SavingsOnBoardingDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.savings.di.navigation.NavigationModule$provideEntryProviderInstallerSavings$lambda$0$0$$inlined$entry$default$6
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.savings.api.navigation.SavingsOnBoardingDestination savingsOnBoardingDestination) {
                return l2Metadata$default3;
            }
        }, (kotlin.jvm.functions.Function3) lambda$195822569$savings_prodRelease);
        final java.util.Map l2Metadata$default4 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1042096839, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.savings.di.navigation.NavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.savings.di.navigation.NavigationModule.m18712$r8$lambda$nYj4uglqgznNDTSRHLehmmtklY(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.savings.api.navigation.SavingsAutoSaveDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.api.navigation.SavingsAutoSaveDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.api.navigation.SavingsAutoSaveDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.savings.di.navigation.NavigationModule$provideEntryProviderInstallerSavings$lambda$0$0$$inlined$entry$default$7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.savings.api.navigation.SavingsAutoSaveDestination savingsAutoSaveDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(savingsAutoSaveDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.api.navigation.SavingsAutoSaveDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.savings.di.navigation.NavigationModule$provideEntryProviderInstallerSavings$lambda$0$0$$inlined$entry$default$8
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.savings.api.navigation.SavingsAutoSaveDestination savingsAutoSaveDestination) {
                return l2Metadata$default4;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        final java.util.Map l2Metadata$default5 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-2062189460, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.savings.di.navigation.NavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.savings.di.navigation.NavigationModule.$r8$lambda$qaSJ5NPw7gwkE3LhPvkOe095FMQ(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.savings.api.navigation.SavingsAutoSaveFlowDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.api.navigation.SavingsAutoSaveFlowDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.api.navigation.SavingsAutoSaveFlowDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.savings.di.navigation.NavigationModule$provideEntryProviderInstallerSavings$lambda$0$0$$inlined$entry$default$9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.savings.api.navigation.SavingsAutoSaveFlowDestination savingsAutoSaveFlowDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(savingsAutoSaveFlowDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.api.navigation.SavingsAutoSaveFlowDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.savings.di.navigation.NavigationModule$provideEntryProviderInstallerSavings$lambda$0$0$$inlined$entry$default$10
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.savings.api.navigation.SavingsAutoSaveFlowDestination savingsAutoSaveFlowDestination) {
                return l2Metadata$default5;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance2);
        final java.util.Map l2Metadata$default6 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.savings.api.navigation.SavingsDlHubDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> lambda$1543486486$savings_prodRelease = com.paypal.oslo.feature.savings.di.navigation.ComposableSingletons$NavigationModuleKt.INSTANCE.getLambda$1543486486$savings_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.api.navigation.SavingsDlHubDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.api.navigation.SavingsDlHubDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.savings.di.navigation.NavigationModule$provideEntryProviderInstallerSavings$lambda$0$0$$inlined$entry$default$11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.savings.api.navigation.SavingsDlHubDestination savingsDlHubDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(savingsDlHubDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.api.navigation.SavingsDlHubDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.savings.di.navigation.NavigationModule$provideEntryProviderInstallerSavings$lambda$0$0$$inlined$entry$default$12
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.savings.api.navigation.SavingsDlHubDestination savingsDlHubDestination) {
                return l2Metadata$default6;
            }
        }, (kotlin.jvm.functions.Function3) lambda$1543486486$savings_prodRelease);
        final java.util.Map l2Metadata$default7 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.savings.api.navigation.SavingsDlCreateGoalDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m18700getLambda$1927243439$savings_prodRelease = com.paypal.oslo.feature.savings.di.navigation.ComposableSingletons$NavigationModuleKt.INSTANCE.m18700getLambda$1927243439$savings_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.api.navigation.SavingsDlCreateGoalDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.api.navigation.SavingsDlCreateGoalDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.savings.di.navigation.NavigationModule$provideEntryProviderInstallerSavings$lambda$0$0$$inlined$entry$default$13
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.savings.api.navigation.SavingsDlCreateGoalDestination savingsDlCreateGoalDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(savingsDlCreateGoalDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.api.navigation.SavingsDlCreateGoalDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.savings.di.navigation.NavigationModule$provideEntryProviderInstallerSavings$lambda$0$0$$inlined$entry$default$14
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.savings.api.navigation.SavingsDlCreateGoalDestination savingsDlCreateGoalDestination) {
                return l2Metadata$default7;
            }
        }, (kotlin.jvm.functions.Function3) m18700getLambda$1927243439$savings_prodRelease);
        final java.util.Map l2Metadata$default8 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.savings.api.navigation.SavingsDeepLinkGoalDetailsDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m18702getLambda$414504676$savings_prodRelease = com.paypal.oslo.feature.savings.di.navigation.ComposableSingletons$NavigationModuleKt.INSTANCE.m18702getLambda$414504676$savings_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.api.navigation.SavingsDeepLinkGoalDetailsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.api.navigation.SavingsDeepLinkGoalDetailsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.savings.di.navigation.NavigationModule$provideEntryProviderInstallerSavings$lambda$0$0$$inlined$entry$default$15
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.savings.api.navigation.SavingsDeepLinkGoalDetailsDestination savingsDeepLinkGoalDetailsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(savingsDeepLinkGoalDetailsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.api.navigation.SavingsDeepLinkGoalDetailsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.savings.di.navigation.NavigationModule$provideEntryProviderInstallerSavings$lambda$0$0$$inlined$entry$default$16
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.savings.api.navigation.SavingsDeepLinkGoalDetailsDestination savingsDeepLinkGoalDetailsDestination) {
                return l2Metadata$default8;
            }
        }, (kotlin.jvm.functions.Function3) m18702getLambda$414504676$savings_prodRelease);
        final java.util.Map l2Metadata$default9 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.savings.api.navigation.SavingsDlTransferToSavingsDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m18701getLambda$202802309$savings_prodRelease = com.paypal.oslo.feature.savings.di.navigation.ComposableSingletons$NavigationModuleKt.INSTANCE.m18701getLambda$202802309$savings_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.api.navigation.SavingsDlTransferToSavingsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.api.navigation.SavingsDlTransferToSavingsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.savings.di.navigation.NavigationModule$provideEntryProviderInstallerSavings$lambda$0$0$$inlined$entry$default$17
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.savings.api.navigation.SavingsDlTransferToSavingsDestination savingsDlTransferToSavingsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(savingsDlTransferToSavingsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.api.navigation.SavingsDlTransferToSavingsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.savings.di.navigation.NavigationModule$provideEntryProviderInstallerSavings$lambda$0$0$$inlined$entry$default$18
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.savings.api.navigation.SavingsDlTransferToSavingsDestination savingsDlTransferToSavingsDestination) {
                return l2Metadata$default9;
            }
        }, (kotlin.jvm.functions.Function3) m18701getLambda$202802309$savings_prodRelease);
        final java.util.Map l2Metadata$default10 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.savings.api.navigation.SavingsDlAutoSaveDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m18699getLambda$1871537769$savings_prodRelease = com.paypal.oslo.feature.savings.di.navigation.ComposableSingletons$NavigationModuleKt.INSTANCE.m18699getLambda$1871537769$savings_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.api.navigation.SavingsDlAutoSaveDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.api.navigation.SavingsDlAutoSaveDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.savings.di.navigation.NavigationModule$provideEntryProviderInstallerSavings$lambda$0$0$$inlined$entry$default$19
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.savings.api.navigation.SavingsDlAutoSaveDestination savingsDlAutoSaveDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(savingsDlAutoSaveDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.api.navigation.SavingsDlAutoSaveDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.savings.di.navigation.NavigationModule$provideEntryProviderInstallerSavings$lambda$0$0$$inlined$entry$default$20
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.savings.api.navigation.SavingsDlAutoSaveDestination savingsDlAutoSaveDestination) {
                return l2Metadata$default10;
            }
        }, (kotlin.jvm.functions.Function3) m18699getLambda$1871537769$savings_prodRelease);
        final java.util.Map l2Metadata$default11 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.savings.api.navigation.SavingsDlAddMoneyDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> lambda$663379258$savings_prodRelease = com.paypal.oslo.feature.savings.di.navigation.ComposableSingletons$NavigationModuleKt.INSTANCE.getLambda$663379258$savings_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.api.navigation.SavingsDlAddMoneyDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.api.navigation.SavingsDlAddMoneyDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.savings.di.navigation.NavigationModule$provideEntryProviderInstallerSavings$lambda$0$0$$inlined$entry$default$21
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.savings.api.navigation.SavingsDlAddMoneyDestination savingsDlAddMoneyDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(savingsDlAddMoneyDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.api.navigation.SavingsDlAddMoneyDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.savings.di.navigation.NavigationModule$provideEntryProviderInstallerSavings$lambda$0$0$$inlined$entry$default$22
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.savings.api.navigation.SavingsDlAddMoneyDestination savingsDlAddMoneyDestination) {
                return l2Metadata$default11;
            }
        }, (kotlin.jvm.functions.Function3) lambda$663379258$savings_prodRelease);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$nYj4uglqgznNDTSRH-LehmmtklY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18712$r8$lambda$nYj4uglqgznNDTSRHLehmmtklY(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.savings.api.navigation.SavingsAutoSaveDestination savingsAutoSaveDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsAutoSaveDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1042096839, i, -1, "com.paypal.oslo.feature.savings.di.navigation.NavigationModule.provideEntryProviderInstallerSavings.<anonymous>.<anonymous>.<anonymous> (NavigationModule.kt:84)");
        }
        com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt.AutoSaveFullScreen(appNavigator, "NONE", null, null, composer, 0, 12);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qaSJ5NPw7gwkE3LhPvkOe095FMQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.savings.api.navigation.SavingsAutoSaveFlowDestination savingsAutoSaveFlowDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsAutoSaveFlowDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-2062189460, i, -1, "com.paypal.oslo.feature.savings.di.navigation.NavigationModule.provideEntryProviderInstallerSavings.<anonymous>.<anonymous>.<anonymous> (NavigationModule.kt:94)");
        }
        com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt.AutoSaveFullScreen(appNavigator, savingsAutoSaveFlowDestination.getSource(), null, null, composer, 0, 12);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
