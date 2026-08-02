package com.paypal.oslo.feature.searchandintelligence.ui.analytics;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a5\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a5\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\t\u001a\u001d\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\b\u0006\u0010\u000b"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lcom/paypal/oslo/feature/searchandintelligence/api/analytics/SearchAndIntelligenceAnalyticsConfig$Module;", "config", "", "verticalPosition", "horizontalPosition", "instrument", "(Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/searchandintelligence/api/analytics/SearchAndIntelligenceAnalyticsConfig$Module;Ljava/lang/Integer;Ljava/lang/Integer;)Landroidx/compose/ui/Modifier;", "Lcom/paypal/oslo/feature/searchandintelligence/api/analytics/SearchAndIntelligenceAnalyticsConfig$Component;", "(Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/searchandintelligence/api/analytics/SearchAndIntelligenceAnalyticsConfig$Component;Ljava/lang/Integer;Ljava/lang/Integer;)Landroidx/compose/ui/Modifier;", "Lcom/paypal/oslo/feature/searchandintelligence/api/analytics/SearchAndIntelligenceAnalyticsConfig$Item;", "(Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/searchandintelligence/api/analytics/SearchAndIntelligenceAnalyticsConfig$Item;)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class InstrumentationUtilsKt {
    public static /* synthetic */ androidx.compose.ui.Modifier instrument$default(androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.searchandintelligence.api.analytics.SearchAndIntelligenceAnalyticsConfig.Module module, java.lang.Integer num, java.lang.Integer num2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        return instrument(modifier, module, num, num2);
    }

    public static final androidx.compose.ui.Modifier instrument(androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.searchandintelligence.api.analytics.SearchAndIntelligenceAnalyticsConfig.Module module, java.lang.Integer num, java.lang.Integer num2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        return module == null ? modifier : com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(modifier, module.getContexts()), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(module.getName(), 0, num2, num, 2, null));
    }

    public static /* synthetic */ androidx.compose.ui.Modifier instrument$default(androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.searchandintelligence.api.analytics.SearchAndIntelligenceAnalyticsConfig.Component component, java.lang.Integer num, java.lang.Integer num2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        return instrument(modifier, component, num, num2);
    }

    public static final androidx.compose.ui.Modifier instrument(androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.searchandintelligence.api.analytics.SearchAndIntelligenceAnalyticsConfig.Component component, java.lang.Integer num, java.lang.Integer num2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        return component == null ? modifier : com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(modifier, component.getContexts()), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component(component.getName(), 0, num2, num, 2, null));
    }

    public static final androidx.compose.ui.Modifier instrument(androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.searchandintelligence.api.analytics.SearchAndIntelligenceAnalyticsConfig.Item item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        return item == null ? modifier : com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(modifier, item.getContexts()), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(item.getName(), 0, 2, null));
    }
}
