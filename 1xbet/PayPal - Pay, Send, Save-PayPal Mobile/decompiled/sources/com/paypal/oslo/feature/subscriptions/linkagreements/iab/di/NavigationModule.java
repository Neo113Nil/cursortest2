package com.paypal.oslo.feature.subscriptions.linkagreements.iab.di;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u000b\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/iab/di/NavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideInAppBrowserEntryProvider", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes15.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.subscriptions.linkagreements.iab.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.subscriptions.linkagreements.iab.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideInAppBrowserEntryProvider(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.iab.di.NavigationModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.subscriptions.linkagreements.iab.di.NavigationModule.$r8$lambda$CO689Qq2HlFiMMKrZ7sr1bDvLLg(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CO689Qq2HlFiMMKrZ7sr1bDvLLg(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l3Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1140757515, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.iab.di.NavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.subscriptions.linkagreements.iab.di.NavigationModule.$r8$lambda$oJKZCrtlhYZVfXZriweNUtygF4c(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.subscriptions.shared.navigation.LinkAgreementInAppBrowserDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.shared.navigation.LinkAgreementInAppBrowserDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.subscriptions.shared.navigation.LinkAgreementInAppBrowserDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.iab.di.NavigationModule$provideInAppBrowserEntryProvider$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.subscriptions.shared.navigation.LinkAgreementInAppBrowserDestination linkAgreementInAppBrowserDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(linkAgreementInAppBrowserDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.subscriptions.shared.navigation.LinkAgreementInAppBrowserDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.iab.di.NavigationModule$provideInAppBrowserEntryProvider$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.subscriptions.shared.navigation.LinkAgreementInAppBrowserDestination linkAgreementInAppBrowserDestination) {
                return l3Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Uq0oNIuTMLZ2m-UtxtPOdRaHCSw, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel m19953$r8$lambda$Uq0oNIuTMLZ2mUtxtPOdRaHCSw(com.paypal.oslo.feature.subscriptions.shared.navigation.LinkAgreementInAppBrowserDestination linkAgreementInAppBrowserDestination, com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(new com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserArgs(linkAgreementInAppBrowserDestination.getUrl(), linkAgreementInAppBrowserDestination.getSource(), linkAgreementInAppBrowserDestination.getMerchantName()));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$oJKZCrtlhYZVfXZriweNUtygF4c(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.subscriptions.shared.navigation.LinkAgreementInAppBrowserDestination linkAgreementInAppBrowserDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkAgreementInAppBrowserDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(linkAgreementInAppBrowserDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1140757515, i2, -1, "com.paypal.oslo.feature.subscriptions.linkagreements.iab.di.NavigationModule.provideInAppBrowserEntryProvider.<anonymous>.<anonymous> (NavigationModule.kt:42)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.iab.di.NavigationModule$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.linkagreements.iab.di.NavigationModule.m19953$r8$lambda$Uq0oNIuTMLZ2mUtxtPOdRaHCSw(com.paypal.oslo.feature.subscriptions.shared.navigation.LinkAgreementInAppBrowserDestination.this, (com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserScreenKt.LinkAgreementInAppBrowserScreen(appNavigator, (com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.linkagreements.iab.LinkAgreementInAppBrowserViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.displayCutoutPadding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.ui.Modifier.INSTANCE))), composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
