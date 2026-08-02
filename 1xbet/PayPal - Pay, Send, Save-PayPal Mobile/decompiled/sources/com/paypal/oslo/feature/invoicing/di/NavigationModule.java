package com.paypal.oslo.feature.invoicing.di;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JB\u0010\u000f\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`\r¢\u0006\u0002\b\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/invoicing/di/NavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "Lcom/paypal/oslo/feature/invoicing/domain/InvoiceUrlBuilder;", "invoiceUrlBuilder", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideViewInvoiceEntryProviderInstaller", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;Lcom/paypal/oslo/feature/invoicing/domain/InvoiceUrlBuilder;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.invoicing.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.invoicing.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideViewInvoiceEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator, final com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, final com.paypal.oslo.feature.invoicing.domain.InvoiceUrlBuilder invoiceUrlBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceUrlBuilder, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.invoicing.di.NavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.invoicing.di.NavigationModule.m15580$r8$lambda$aisrfz8rL7jGa13rC24f_oNvDA(com.paypal.oslo.feature.invoicing.domain.InvoiceUrlBuilder.this, featureGate, navigator, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    public static /* synthetic */ com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel $r8$lambda$BFwxR28M0ZX_BXYbBssil5Ao_x0(com.paypal.oslo.feature.invoicing.api.navigation.ViewInvoiceDestination viewInvoiceDestination, java.lang.String str, com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(viewInvoiceDestination, str);
    }

    /* renamed from: $r8$lambda$aisrfz8rL7jGa13rC24f_oNvD-A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15580$r8$lambda$aisrfz8rL7jGa13rC24f_oNvDA(final com.paypal.oslo.feature.invoicing.domain.InvoiceUrlBuilder invoiceUrlBuilder, final com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-296360446, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.invoicing.di.NavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.invoicing.di.NavigationModule.$r8$lambda$d_ifsMGt28zg1XVbd8z2n5Zm5dk(com.paypal.oslo.feature.invoicing.domain.InvoiceUrlBuilder.this, featureGate, appNavigator, (com.paypal.oslo.feature.invoicing.api.navigation.ViewInvoiceDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.invoicing.api.navigation.ViewInvoiceDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.invoicing.api.navigation.ViewInvoiceDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.invoicing.di.NavigationModule$provideViewInvoiceEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.invoicing.api.navigation.ViewInvoiceDestination viewInvoiceDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(viewInvoiceDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.invoicing.api.navigation.ViewInvoiceDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.invoicing.di.NavigationModule$provideViewInvoiceEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.invoicing.api.navigation.ViewInvoiceDestination viewInvoiceDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$d_ifsMGt28zg1XVbd8z2n5Zm5dk(com.paypal.oslo.feature.invoicing.domain.InvoiceUrlBuilder invoiceUrlBuilder, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.invoicing.api.navigation.ViewInvoiceDestination viewInvoiceDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewInvoiceDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-296360446, i, -1, "com.paypal.oslo.feature.invoicing.di.NavigationModule.provideViewInvoiceEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:47)");
        }
        final java.lang.String build = invoiceUrlBuilder.build(viewInvoiceDestination);
        boolean changedInstance = composer.changedInstance(viewInvoiceDestination);
        boolean changed = composer.changed(build);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changedInstance | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.invoicing.di.NavigationModule$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.invoicing.di.NavigationModule.$r8$lambda$BFwxR28M0ZX_BXYbBssil5Ao_x0(com.paypal.oslo.feature.invoicing.api.navigation.ViewInvoiceDestination.this, build, (com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel.Factory) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.invoicing.ui.viewinvoice.ViewInvoiceLauncherKt.ViewInvoiceLauncher(featureGate, appNavigator, (com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), com.paypal.oslo.feature.invoicing.di.ComposableSingletons$NavigationModuleKt.INSTANCE.getLambda$2102631808$invoicing_prodRelease(), composer, 3072);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
