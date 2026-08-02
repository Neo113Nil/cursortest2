package com.paypal.oslo.feature.debitcard.pushprovisioning.di;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u000b\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/di/NavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "appNavigator", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideEntryProviderInstaller", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes12.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.debitcard.pushprovisioning.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.debitcard.pushprovisioning.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.di.NavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.debitcard.pushprovisioning.di.NavigationModule.m14258$r8$lambda$6Zu12vZhZ3248KkXkdRI6FAzU(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    /* renamed from: $r8$lambda$6Zu12vZhZ3-248KkXkdRI6FAz-U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14258$r8$lambda$6Zu12vZhZ3248KkXkdRI6FAzU(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.debitcard.pushprovisioning.navigation.DebitAddToWalletDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m14257getLambda$976314688$debit_card_prodRelease = com.paypal.oslo.feature.debitcard.pushprovisioning.di.ComposableSingletons$NavigationModuleKt.INSTANCE.m14257getLambda$976314688$debit_card_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.pushprovisioning.navigation.DebitAddToWalletDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.pushprovisioning.navigation.DebitAddToWalletDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.debitcard.pushprovisioning.navigation.DebitAddToWalletDestination debitAddToWalletDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(debitAddToWalletDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.pushprovisioning.navigation.DebitAddToWalletDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.debitcard.pushprovisioning.navigation.DebitAddToWalletDestination debitAddToWalletDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) m14257getLambda$976314688$debit_card_prodRelease);
        final java.util.Map l2Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1005910944, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.di.NavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.debitcard.pushprovisioning.di.NavigationModule.$r8$lambda$jUDZRegCAz7T3Vw46BB8i6Mfwtc(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.debitcard.pushprovisioning.navigation.PushProvisioningSetupDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.pushprovisioning.navigation.PushProvisioningSetupDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.pushprovisioning.navigation.PushProvisioningSetupDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.debitcard.pushprovisioning.navigation.PushProvisioningSetupDestination pushProvisioningSetupDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(pushProvisioningSetupDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.pushprovisioning.navigation.PushProvisioningSetupDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$4
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.debitcard.pushprovisioning.navigation.PushProvisioningSetupDestination pushProvisioningSetupDestination) {
                return l2Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jUDZRegCAz7T3Vw46BB8i6Mfwtc(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.debitcard.pushprovisioning.navigation.PushProvisioningSetupDestination pushProvisioningSetupDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushProvisioningSetupDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1005910944, i, -1, "com.paypal.oslo.feature.debitcard.pushprovisioning.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:37)");
        }
        com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt.PushProvisionSetupScreen(appNavigator, pushProvisioningSetupDestination.getDebitInstrument(), null, composer, 0, 4);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
