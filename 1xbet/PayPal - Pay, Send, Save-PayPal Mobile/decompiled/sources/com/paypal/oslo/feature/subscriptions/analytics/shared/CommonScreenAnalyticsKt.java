package com.paypal.oslo.feature.subscriptions.analytics.shared;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ModuleAnalytics;", "moduleAnalytics", "toSubscriptionsAnalyticsModule", "(Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ModuleAnalytics;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "itemAnalytics", "toSubscriptionsAnalyticsItem", "(Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CommonScreenAnalyticsKt {
    public static final androidx.compose.ui.Modifier toSubscriptionsAnalyticsModule(androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.subscriptions.analytics.shared.ModuleAnalytics moduleAnalytics, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        composer.startReplaceGroup(-969934750);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-969934750, i, -1, "com.paypal.oslo.feature.subscriptions.analytics.shared.toSubscriptionsAnalyticsModule (CommonScreenAnalytics.kt:40)");
        }
        if (moduleAnalytics == null) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return modifier;
        }
        androidx.compose.ui.Modifier module = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(modifier, moduleAnalytics.getContexts()), moduleAnalytics.getModule());
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return module;
    }

    public static final androidx.compose.ui.Modifier toSubscriptionsAnalyticsItem(androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics itemAnalytics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        return itemAnalytics == null ? modifier : com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(modifier, itemAnalytics.getItem()), kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext>) itemAnalytics.getContexts(), itemAnalytics.getUserIntentContext()));
    }
}
