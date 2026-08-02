package com.paypal.oslo.feature.identity.connect.partnerlinking.di;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u000b\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/partnerlinking/di/PartnerLinkingNavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "providePartnerLinkingEntryProviderInstaller", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes12.dex */
public final class PartnerLinkingNavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.identity.connect.partnerlinking.di.PartnerLinkingNavigationModule INSTANCE = new com.paypal.oslo.feature.identity.connect.partnerlinking.di.PartnerLinkingNavigationModule();

    private PartnerLinkingNavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> providePartnerLinkingEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.connect.partnerlinking.di.PartnerLinkingNavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.connect.partnerlinking.di.PartnerLinkingNavigationModule.$r8$lambda$qJrG3qmWNDAYF8hkJpQdvU6e85k(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    /* renamed from: $r8$lambda$HvGhRuqkncTfpyy0xwRVrz-gH-o, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15118$r8$lambda$HvGhRuqkncTfpyy0xwRVrzgHo(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.api.navigation.PartnerLinkingDestination partnerLinkingDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partnerLinkingDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(847291400, i, -1, "com.paypal.oslo.feature.identity.connect.partnerlinking.di.PartnerLinkingNavigationModule.providePartnerLinkingEntryProviderInstaller.<anonymous>.<anonymous> (PartnerLinkingNavigationModule.kt:91)");
        }
        com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingScreenDestination partnerLinkingScreenDestination = new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingScreenDestination(partnerLinkingDestination.getRequest(), com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11593fromValuekh8nfeM(partnerLinkingDestination.getRequestId()), (kotlin.jvm.internal.DefaultConstructorMarker) null);
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "PartnerLinkingNavigationModule: Creating screen destination", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("publicRequestId", partnerLinkingDestination.getRequestId()), kotlin.TuplesKt.to("screenDestinationRequestId", partnerLinkingScreenDestination.m15123getRequestIdQDVFmTU()), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, partnerLinkingDestination.getRequest().getFlowType())), null, 4, null);
        com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingScreenDestinationKt.PartnerLinkingScreenDestinationContent(partnerLinkingScreenDestination, appNavigator, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qJrG3qmWNDAYF8hkJpQdvU6e85k(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_X, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(847291400, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.identity.connect.partnerlinking.di.PartnerLinkingNavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.identity.connect.partnerlinking.di.PartnerLinkingNavigationModule.m15118$r8$lambda$HvGhRuqkncTfpyy0xwRVrzgHo(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.identity.api.navigation.PartnerLinkingDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.PartnerLinkingDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.api.navigation.PartnerLinkingDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.identity.connect.partnerlinking.di.PartnerLinkingNavigationModule$providePartnerLinkingEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.identity.api.navigation.PartnerLinkingDestination partnerLinkingDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(partnerLinkingDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.api.navigation.PartnerLinkingDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.identity.connect.partnerlinking.di.PartnerLinkingNavigationModule$providePartnerLinkingEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.identity.api.navigation.PartnerLinkingDestination partnerLinkingDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }
}
