package com.paypal.oslo.feature.businessprofile.di;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\r\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b¢\u0006\u0002\b\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businessprofile/di/NavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/feature/businessprofile/api/common/featuregate/BusinessProfileFeatureGatesManager;", "businessProfileFeatureGatesManager", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideEntryProviderInstaller", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/businessprofile/api/common/featuregate/BusinessProfileFeatureGatesManager;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes11.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.businessprofile.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.businessprofile.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator, final com.paypal.oslo.feature.businessprofile.api.common.featuregate.BusinessProfileFeatureGatesManager businessProfileFeatureGatesManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessProfileFeatureGatesManager, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessprofile.di.NavigationModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businessprofile.di.NavigationModule.$r8$lambda$GHr9uc4v5XlPJKGgGjG17uPN24I(com.paypal.oslo.core.navigation.AppNavigator.this, businessProfileFeatureGatesManager, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GHr9uc4v5XlPJKGgGjG17uPN24I(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businessprofile.api.common.featuregate.BusinessProfileFeatureGatesManager businessProfileFeatureGatesManager, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(518605501, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businessprofile.di.NavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businessprofile.di.NavigationModule.m13366$r8$lambda$WoNnH3rTHuNpNyHgr3SCUZoug0(com.paypal.oslo.core.navigation.AppNavigator.this, businessProfileFeatureGatesManager, (com.paypal.oslo.feature.businessprofile.navigation.SalesToolsBusinessProfileDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businessprofile.navigation.SalesToolsBusinessProfileDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businessprofile.navigation.SalesToolsBusinessProfileDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businessprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businessprofile.navigation.SalesToolsBusinessProfileDestination salesToolsBusinessProfileDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(salesToolsBusinessProfileDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businessprofile.navigation.SalesToolsBusinessProfileDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businessprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businessprofile.navigation.SalesToolsBusinessProfileDestination salesToolsBusinessProfileDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        final java.util.Map l2Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-212855400, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businessprofile.di.NavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businessprofile.di.NavigationModule.m13367$r8$lambda$Zr8pmzKnpeWK_fsdrL9qgp3TGQ(com.paypal.oslo.core.navigation.AppNavigator.this, businessProfileFeatureGatesManager, (com.paypal.oslo.feature.businessprofile.navigation.SalesToolsInquiriesDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businessprofile.navigation.SalesToolsInquiriesDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businessprofile.navigation.SalesToolsInquiriesDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businessprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businessprofile.navigation.SalesToolsInquiriesDestination salesToolsInquiriesDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(salesToolsInquiriesDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businessprofile.navigation.SalesToolsInquiriesDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businessprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$4
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businessprofile.navigation.SalesToolsInquiriesDestination salesToolsInquiriesDestination) {
                return l2Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$WoNn-H3rTHuNpNyHgr3SCUZoug0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13366$r8$lambda$WoNnH3rTHuNpNyHgr3SCUZoug0(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.businessprofile.api.common.featuregate.BusinessProfileFeatureGatesManager businessProfileFeatureGatesManager, com.paypal.oslo.feature.businessprofile.navigation.SalesToolsBusinessProfileDestination salesToolsBusinessProfileDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(salesToolsBusinessProfileDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(518605501, i, -1, "com.paypal.oslo.feature.businessprofile.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:41)");
            }
            com.paypal.oslo.feature.businessprofile.di.NavigationModuleKt.getHighSpeedVideoFpsRanges(appNavigator, businessProfileFeatureGatesManager, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Zr8-pmzKnpeWK_fsdrL9qgp3TGQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13367$r8$lambda$Zr8pmzKnpeWK_fsdrL9qgp3TGQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.businessprofile.api.common.featuregate.BusinessProfileFeatureGatesManager businessProfileFeatureGatesManager, com.paypal.oslo.feature.businessprofile.navigation.SalesToolsInquiriesDestination salesToolsInquiriesDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(salesToolsInquiriesDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-212855400, i, -1, "com.paypal.oslo.feature.businessprofile.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:44)");
            }
            com.paypal.oslo.feature.businessprofile.di.NavigationModuleKt.Camera2StreamConfigurationMap(appNavigator, businessProfileFeatureGatesManager, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
