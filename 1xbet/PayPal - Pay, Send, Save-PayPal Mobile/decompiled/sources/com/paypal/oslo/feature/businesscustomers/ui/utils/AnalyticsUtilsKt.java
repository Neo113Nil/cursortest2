package com.paypal.oslo.feature.businesscustomers.ui.utils;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\f\u001a\u00020\u0000*\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "feature", "action", "userIntent", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;)Landroidx/compose/ui/Modifier;", "Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode;", "presentationMode", "businessFlow", "(Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode;)Landroidx/compose/ui/Modifier;", "Lcom/paypal/oslo/feature/businesscustomers/ui/utils/TrackedElement;", "element", "tracked", "(Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/businesscustomers/ui/utils/TrackedElement;)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AnalyticsUtilsKt {
    public static final androidx.compose.ui.Modifier userIntent(androidx.compose.ui.Modifier modifier, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(modifier, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.CUSTOMER_DIRECTORY, str, str2)));
    }

    public static final androidx.compose.ui.Modifier businessFlow(androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode customersPresentationMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customersPresentationMode, "");
        return com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(modifier, kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.businesscustomers.navigation.InternalDestinationsKt.toBusinessFlowContext$default(customersPresentationMode, null, 1, null)));
    }

    public static final androidx.compose.ui.Modifier tracked(androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement trackedElement) {
        androidx.compose.ui.Modifier item;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        if (trackedElement == null) {
            return modifier;
        }
        if (trackedElement instanceof com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement.Module) {
            item = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(modifier, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(((com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement.Module) trackedElement).getName(), 0, null, null, 14, null));
        } else if (trackedElement instanceof com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement.Component) {
            item = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(modifier, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component(((com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement.Component) trackedElement).getName(), 0, null, null, 14, null));
        } else {
            if (!(trackedElement instanceof com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement.Item)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            item = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(modifier, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(((com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement.Item) trackedElement).getName(), 0, 2, null));
        }
        java.lang.String feature = trackedElement.getFeature();
        if (feature != null) {
            java.lang.String action = trackedElement.getAction();
            androidx.compose.ui.Modifier userIntent = action != null ? userIntent(item, feature, action) : null;
            if (userIntent != null) {
                item = userIntent;
            }
        }
        return com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(item, trackedElement.getContexts());
    }
}
