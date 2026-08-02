package com.paypal.oslo.feature.onboarding.mgm.di;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\r\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b¢\u0006\u0002\b\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/mgm/di/MGMNavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/feature/onboarding/mgm/domain/MGMUrlProvider;", "mgmUrlProvider", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideEntryProviderInstaller", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/onboarding/mgm/domain/MGMUrlProvider;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public final class MGMNavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.onboarding.mgm.di.MGMNavigationModule INSTANCE = new com.paypal.oslo.feature.onboarding.mgm.di.MGMNavigationModule();

    private MGMNavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator, final com.paypal.oslo.feature.onboarding.mgm.domain.MGMUrlProvider mgmUrlProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mgmUrlProvider, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.mgm.di.MGMNavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.onboarding.mgm.di.MGMNavigationModule.m16071$r8$lambda$AgHTsE5faZajNuk6bTJHcauTFY(com.paypal.oslo.feature.onboarding.mgm.domain.MGMUrlProvider.this, navigator, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    /* renamed from: $r8$lambda$0JnLNTwF1-S8XMAmiNaI9-qvlYg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16070$r8$lambda$0JnLNTwF1S8XMAmiNaI9qvlYg(com.paypal.oslo.feature.onboarding.mgm.domain.MGMUrlProvider mGMUrlProvider, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.onboarding.api.navigation.MGMInviteFriendsDestination mGMInviteFriendsDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mGMInviteFriendsDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1171761336, i, -1, "com.paypal.oslo.feature.onboarding.mgm.di.MGMNavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (MGMNavigationModule.kt:38)");
        }
        com.paypal.oslo.feature.onboarding.mgm.ui.MGMInviteFriendsScreenKt.MGMInviteFriendsScreen(mGMUrlProvider, appNavigator, null, null, composer, 0, 12);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$AgHTsE-5faZajNuk6bTJHcauTFY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16071$r8$lambda$AgHTsE5faZajNuk6bTJHcauTFY(final com.paypal.oslo.feature.onboarding.mgm.domain.MGMUrlProvider mGMUrlProvider, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1171761336, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.onboarding.mgm.di.MGMNavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.onboarding.mgm.di.MGMNavigationModule.m16070$r8$lambda$0JnLNTwF1S8XMAmiNaI9qvlYg(com.paypal.oslo.feature.onboarding.mgm.domain.MGMUrlProvider.this, appNavigator, (com.paypal.oslo.feature.onboarding.api.navigation.MGMInviteFriendsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.api.navigation.MGMInviteFriendsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.onboarding.api.navigation.MGMInviteFriendsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.onboarding.mgm.di.MGMNavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.onboarding.api.navigation.MGMInviteFriendsDestination mGMInviteFriendsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(mGMInviteFriendsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.onboarding.api.navigation.MGMInviteFriendsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.onboarding.mgm.di.MGMNavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.onboarding.api.navigation.MGMInviteFriendsDestination mGMInviteFriendsDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }
}
