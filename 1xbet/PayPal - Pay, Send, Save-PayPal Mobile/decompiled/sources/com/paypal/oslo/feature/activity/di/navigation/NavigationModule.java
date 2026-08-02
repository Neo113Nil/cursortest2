package com.paypal.oslo.feature.activity.di.navigation;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\t\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/activity/di/navigation/NavigationModule;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideEntryProviderInstaller", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes10.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.di.navigation.NavigationModule INSTANCE = new com.paypal.oslo.feature.activity.di.navigation.NavigationModule();

    private NavigationModule() {
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CsjljTuRc3dmQgawo3YwD235oLc(androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.activity.api.navigation.PayPalActivityWidgetFScreenDestinationKey, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m11773getLambda$598155824$activity_prodRelease = com.paypal.oslo.feature.activity.di.navigation.ComposableSingletons$NavigationModuleKt.INSTANCE.m11773getLambda$598155824$activity_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.activity.api.navigation.PayPalActivityWidgetFScreenDestinationKey.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.activity.api.navigation.PayPalActivityWidgetFScreenDestinationKey, java.lang.Object>() { // from class: com.paypal.oslo.feature.activity.di.navigation.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.activity.api.navigation.PayPalActivityWidgetFScreenDestinationKey payPalActivityWidgetFScreenDestinationKey) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(payPalActivityWidgetFScreenDestinationKey);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.activity.api.navigation.PayPalActivityWidgetFScreenDestinationKey, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.activity.di.navigation.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.activity.api.navigation.PayPalActivityWidgetFScreenDestinationKey payPalActivityWidgetFScreenDestinationKey) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) m11773getLambda$598155824$activity_prodRelease);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.activity.api.navigation.PayPalActivityTransactionDetailScreenDestinationKey, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> lambda$1761489612$activity_prodRelease = com.paypal.oslo.feature.activity.di.navigation.ComposableSingletons$NavigationModuleKt.INSTANCE.getLambda$1761489612$activity_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.activity.api.navigation.PayPalActivityTransactionDetailScreenDestinationKey.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.activity.api.navigation.PayPalActivityTransactionDetailScreenDestinationKey, java.lang.Object>() { // from class: com.paypal.oslo.feature.activity.di.navigation.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.activity.api.navigation.PayPalActivityTransactionDetailScreenDestinationKey payPalActivityTransactionDetailScreenDestinationKey) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(payPalActivityTransactionDetailScreenDestinationKey);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.activity.api.navigation.PayPalActivityTransactionDetailScreenDestinationKey, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.activity.di.navigation.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$4
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.activity.api.navigation.PayPalActivityTransactionDetailScreenDestinationKey payPalActivityTransactionDetailScreenDestinationKey) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) lambda$1761489612$activity_prodRelease);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.activity.api.navigation.PayPalActivitySearchScreenDestinationKey, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> lambda$934522648$activity_prodRelease = com.paypal.oslo.feature.activity.di.navigation.ComposableSingletons$NavigationModuleKt.INSTANCE.getLambda$934522648$activity_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.activity.api.navigation.PayPalActivitySearchScreenDestinationKey.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.activity.api.navigation.PayPalActivitySearchScreenDestinationKey, java.lang.Object>() { // from class: com.paypal.oslo.feature.activity.di.navigation.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.activity.api.navigation.PayPalActivitySearchScreenDestinationKey payPalActivitySearchScreenDestinationKey) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(payPalActivitySearchScreenDestinationKey);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.activity.api.navigation.PayPalActivitySearchScreenDestinationKey, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.activity.di.navigation.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$6
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.activity.api.navigation.PayPalActivitySearchScreenDestinationKey payPalActivitySearchScreenDestinationKey) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) lambda$934522648$activity_prodRelease);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.activity.api.navigation.ActivityFilteredLandingScreenDestinationKey, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m11772getLambda$245507194$activity_prodRelease = com.paypal.oslo.feature.activity.di.navigation.ComposableSingletons$NavigationModuleKt.INSTANCE.m11772getLambda$245507194$activity_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.activity.api.navigation.ActivityFilteredLandingScreenDestinationKey.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.activity.api.navigation.ActivityFilteredLandingScreenDestinationKey, java.lang.Object>() { // from class: com.paypal.oslo.feature.activity.di.navigation.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.activity.api.navigation.ActivityFilteredLandingScreenDestinationKey activityFilteredLandingScreenDestinationKey) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(activityFilteredLandingScreenDestinationKey);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.activity.api.navigation.ActivityFilteredLandingScreenDestinationKey, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.activity.di.navigation.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$8
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.activity.api.navigation.ActivityFilteredLandingScreenDestinationKey activityFilteredLandingScreenDestinationKey) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) m11772getLambda$245507194$activity_prodRelease);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.activity.api.navigation.ActivityPromotionalRewardsDetailsDestinationKey, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> lambda$1034767365$activity_prodRelease = com.paypal.oslo.feature.activity.di.navigation.ComposableSingletons$NavigationModuleKt.INSTANCE.getLambda$1034767365$activity_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.activity.api.navigation.ActivityPromotionalRewardsDetailsDestinationKey.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.activity.api.navigation.ActivityPromotionalRewardsDetailsDestinationKey, java.lang.Object>() { // from class: com.paypal.oslo.feature.activity.di.navigation.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.activity.api.navigation.ActivityPromotionalRewardsDetailsDestinationKey activityPromotionalRewardsDetailsDestinationKey) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(activityPromotionalRewardsDetailsDestinationKey);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.activity.api.navigation.ActivityPromotionalRewardsDetailsDestinationKey, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.activity.di.navigation.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$10
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.activity.api.navigation.ActivityPromotionalRewardsDetailsDestinationKey activityPromotionalRewardsDetailsDestinationKey) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) lambda$1034767365$activity_prodRelease);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.activity.api.navigation.PayPalActivityCommonWebViewScreenDestinationKey, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m11774getLambda$700062135$activity_prodRelease = com.paypal.oslo.feature.activity.di.navigation.ComposableSingletons$NavigationModuleKt.INSTANCE.m11774getLambda$700062135$activity_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.activity.api.navigation.PayPalActivityCommonWebViewScreenDestinationKey.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.activity.api.navigation.PayPalActivityCommonWebViewScreenDestinationKey, java.lang.Object>() { // from class: com.paypal.oslo.feature.activity.di.navigation.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.activity.api.navigation.PayPalActivityCommonWebViewScreenDestinationKey payPalActivityCommonWebViewScreenDestinationKey) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(payPalActivityCommonWebViewScreenDestinationKey);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.activity.api.navigation.PayPalActivityCommonWebViewScreenDestinationKey, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.activity.di.navigation.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$12
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.activity.api.navigation.PayPalActivityCommonWebViewScreenDestinationKey payPalActivityCommonWebViewScreenDestinationKey) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) m11774getLambda$700062135$activity_prodRelease);
        return kotlin.Unit.INSTANCE;
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstaller() {
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.di.navigation.NavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.activity.di.navigation.NavigationModule.$r8$lambda$CsjljTuRc3dmQgawo3YwD235oLc((androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }
}
