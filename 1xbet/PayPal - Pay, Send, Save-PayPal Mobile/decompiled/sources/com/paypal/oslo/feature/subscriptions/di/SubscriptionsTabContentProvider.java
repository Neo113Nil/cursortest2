package com.paypal.oslo.feature.subscriptions.di;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\u00020\t8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR4\u0010\u0014\u001a\u001c\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\u0010\u0012\u0004\u0012\u00020\u00110\u000ej\u0002`\u0012¢\u0006\u0002\b\u00138\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/di/SubscriptionsTabContentProvider;", "Lcom/paypal/oslo/feature/controlcenter/api/provider/TabContentProvider;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/AnalyticsScreenProvider;", "analyticsScreenProvider", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/analytics/shared/AnalyticsScreenProvider;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/AnalyticsScreenProvider;", "getHighSpeedVideoSizes", "Landroidx/navigation3/runtime/NavKey;", "tabDestination", "Landroidx/navigation3/runtime/NavKey;", "getTabDestination", "()Landroidx/navigation3/runtime/NavKey;", "Lkotlin/Function1;", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "Lkotlin/ParameterName;", "", "Lcom/paypal/oslo/feature/controlcenter/api/provider/TabContent;", "Landroidx/compose/runtime/Composable;", "content", "Lkotlin/jvm/functions/Function3;", "getContent", "()Lkotlin/jvm/functions/Function3;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SubscriptionsTabContentProvider implements com.paypal.oslo.feature.controlcenter.api.provider.TabContentProvider {
    public static final int $stable = 8;
    private final kotlin.jvm.functions.Function3<com.paypal.oslo.core.navigation.AppNavigator, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> content;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider getHighSpeedVideoSizes;
    private final androidx.navigation3.runtime.NavKey tabDestination;

    /* JADX WARN: Multi-variable type inference failed */
    @javax.inject.Inject
    public SubscriptionsTabContentProvider(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider analyticsScreenProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsScreenProvider, "");
        this.getHighSpeedVideoSizes = analyticsScreenProvider;
        this.tabDestination = new com.paypal.oslo.feature.subscriptions.api.navigation.SubscriptionsHubDestination((java.lang.String) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
        this.content = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-806518901, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.subscriptions.di.SubscriptionsTabContentProvider$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.subscriptions.di.SubscriptionsTabContentProvider.$r8$lambda$Dai4_7sxDXmSpf_xKUVTQFhBRSk(com.paypal.oslo.feature.subscriptions.di.SubscriptionsTabContentProvider.this, (com.paypal.oslo.core.navigation.AppNavigator) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
    }

    @Override // com.paypal.oslo.feature.controlcenter.api.provider.TabContentProvider
    public final androidx.navigation3.runtime.NavKey getTabDestination() {
        return this.tabDestination;
    }

    @Override // com.paypal.oslo.feature.controlcenter.api.provider.TabContentProvider
    public final kotlin.jvm.functions.Function3<com.paypal.oslo.core.navigation.AppNavigator, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getContent() {
        return this.content;
    }

    /* renamed from: $r8$lambda$1LwieiR7ioDJlCa-VDwPQXeRMcM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19855$r8$lambda$1LwieiR7ioDJlCaVDwPQXeRMcM(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-419466549, i, -1, "com.paypal.oslo.feature.subscriptions.di.SubscriptionsTabContentProvider.content.<anonymous>.<anonymous> (SubscriptionsTabContentProvider.kt:29)");
            }
            com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubScreenKt.SubscriptionsHubScreen(appNavigator, null, null, composer, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Dai4_7sxDXmSpf_xKUVTQFhBRSk(com.paypal.oslo.feature.subscriptions.di.SubscriptionsTabContentProvider subscriptionsTabContentProvider, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        if ((i & 6) == 0) {
            i |= composer.changed(appNavigator) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-806518901, i, -1, "com.paypal.oslo.feature.subscriptions.di.SubscriptionsTabContentProvider.content.<anonymous> (SubscriptionsTabContentProvider.kt:28)");
            }
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsCompositionLocalKt.getLocalScreenAnalytics().provides(subscriptionsTabContentProvider.getHighSpeedVideoSizes.subscriptionsHubScreen()), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-419466549, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.di.SubscriptionsTabContentProvider$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.di.SubscriptionsTabContentProvider.m19855$r8$lambda$1LwieiR7ioDJlCaVDwPQXeRMcM(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, androidx.compose.runtime.ProvidedValue.$stable | 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
