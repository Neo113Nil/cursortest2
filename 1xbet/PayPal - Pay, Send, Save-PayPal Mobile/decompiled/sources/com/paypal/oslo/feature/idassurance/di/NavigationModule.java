package com.paypal.oslo.feature.idassurance.di;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\r\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b¢\u0006\u0002\b\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/idassurance/di/NavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/core/network/rest/config/RestConfig;", "restConfig", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideIdassuranceEntry", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/core/network/rest/config/RestConfig;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes12.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.idassurance.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.idassurance.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideIdassuranceEntry(final com.paypal.oslo.core.navigation.AppNavigator navigator, final com.paypal.oslo.core.network.rest.config.RestConfig restConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restConfig, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.idassurance.di.NavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.idassurance.di.NavigationModule.$r8$lambda$uy1Fv8DOkB3b6UYVE9AeT01_gLY(com.paypal.oslo.core.network.rest.config.RestConfig.this, navigator, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FNkeg4FpseNJacow2TwGJhn1hjI(com.paypal.oslo.core.network.rest.config.RestConfig restConfig, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.idassurance.api.navigation.IdAssuranceDestination idAssuranceDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(idAssuranceDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(74129583, i, -1, "com.paypal.oslo.feature.idassurance.di.NavigationModule.provideIdassuranceEntry.<anonymous>.<anonymous> (NavigationModule.kt:39)");
        }
        com.paypal.oslo.feature.idassurance.ui.IdAssuranceWebViewScreenKt.IdAssuranceWebViewScreen(appNavigator, com.paypal.oslo.feature.idassurance.utils.IdAssuranceUrlGenerator.INSTANCE.generateUrl(idAssuranceDestination.getIdAssuranceConfiguration(), restConfig), idAssuranceDestination.getIdAssuranceConfiguration().isAuthRequired(), null, composer, 0, 8);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uy1Fv8DOkB3b6UYVE9AeT01_gLY(final com.paypal.oslo.core.network.rest.config.RestConfig restConfig, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(74129583, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.idassurance.di.NavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.idassurance.di.NavigationModule.$r8$lambda$FNkeg4FpseNJacow2TwGJhn1hjI(com.paypal.oslo.core.network.rest.config.RestConfig.this, appNavigator, (com.paypal.oslo.feature.idassurance.api.navigation.IdAssuranceDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.idassurance.api.navigation.IdAssuranceDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.idassurance.api.navigation.IdAssuranceDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.idassurance.di.NavigationModule$provideIdassuranceEntry$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.idassurance.api.navigation.IdAssuranceDestination idAssuranceDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(idAssuranceDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.idassurance.api.navigation.IdAssuranceDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.idassurance.di.NavigationModule$provideIdassuranceEntry$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.idassurance.api.navigation.IdAssuranceDestination idAssuranceDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }
}
