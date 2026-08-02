package com.paypal.oslo.feature.merchantbanking.di.navigation;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u000b\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/di/navigation/NavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideEntryProviderInstaller", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.merchantbanking.di.navigation.NavigationModule INSTANCE = new com.paypal.oslo.feature.merchantbanking.di.navigation.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.merchantbanking.di.navigation.NavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.merchantbanking.di.navigation.NavigationModule.m15586$r8$lambda$gtsj3iVnkhvhOX2SD1pzW9GB1U(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    /* renamed from: $r8$lambda$1Jnd09jHE-spG4yfDLDcBjqt-2c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15585$r8$lambda$1Jnd09jHEspG4yfDLDcBjqt2c(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.merchantbanking.api.navigation.AccountRoutingNumbersDestination accountRoutingNumbersDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountRoutingNumbersDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-388915438, i, -1, "com.paypal.oslo.feature.merchantbanking.di.navigation.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:40)");
        }
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumbersScreenKt.AccountRoutingNumbersScreen(accountRoutingNumbersDestination, (com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0), appNavigator, composer, i & 14);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$gtsj3iVnkhvhOX-2SD1pzW9GB1U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15586$r8$lambda$gtsj3iVnkhvhOX2SD1pzW9GB1U(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-190100610, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.merchantbanking.di.navigation.NavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.merchantbanking.di.navigation.NavigationModule.$r8$lambda$sRRooH4TTqG3SwtOdjVL1L1G824(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.merchantbanking.api.navigation.AccountRoutingTermsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.merchantbanking.api.navigation.AccountRoutingTermsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.merchantbanking.api.navigation.AccountRoutingTermsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.merchantbanking.di.navigation.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.merchantbanking.api.navigation.AccountRoutingTermsDestination accountRoutingTermsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(accountRoutingTermsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.merchantbanking.api.navigation.AccountRoutingTermsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.merchantbanking.di.navigation.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.merchantbanking.api.navigation.AccountRoutingTermsDestination accountRoutingTermsDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        final java.util.Map l2Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-388915438, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.merchantbanking.di.navigation.NavigationModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.merchantbanking.di.navigation.NavigationModule.m15585$r8$lambda$1Jnd09jHEspG4yfDLDcBjqt2c(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.merchantbanking.api.navigation.AccountRoutingNumbersDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.merchantbanking.api.navigation.AccountRoutingNumbersDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.merchantbanking.api.navigation.AccountRoutingNumbersDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.merchantbanking.di.navigation.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.merchantbanking.api.navigation.AccountRoutingNumbersDestination accountRoutingNumbersDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(accountRoutingNumbersDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.merchantbanking.api.navigation.AccountRoutingNumbersDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.merchantbanking.di.navigation.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$4
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.merchantbanking.api.navigation.AccountRoutingNumbersDestination accountRoutingNumbersDestination) {
                return l2Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sRRooH4TTqG3SwtOdjVL1L1G824(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.merchantbanking.api.navigation.AccountRoutingTermsDestination accountRoutingTermsDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountRoutingTermsDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-190100610, i, -1, "com.paypal.oslo.feature.merchantbanking.di.navigation.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:34)");
        }
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsScreenKt.AccountRoutingTermsScreen((com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0), appNavigator, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
