package com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activity;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/activity/api/provider/IActivityWidgetProvider;", "activityWidgetProvider", "", "ActivityScreen", "(Lcom/paypal/oslo/feature/activity/api/provider/IActivityWidgetProvider;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ActivityScreenKt {
    public static final void ActivityScreen(final com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider iActivityWidgetProvider, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iActivityWidgetProvider, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1182706937);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(iActivityWidgetProvider) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1182706937, i2, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activity.ActivityScreen (ActivityScreen.kt:29)");
            }
            com.paypal.oslo.feature.activity.api.widget.IActivityWidget createWidget = iActivityWidgetProvider.createWidget(com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration.INSTANCE.builder("RewardsActivityWidget").setWidgetTxnFetchCount(10).setUiConfig(new com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetUIConfig(false, com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFailureVisibilityEnum.WIDGET_VISIBLE_IN_ALL_CASES, false, com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetViewType.WIDGET_WITH_MULTIPLE_COUNTER_PARTY, false, 5, null)).setFiltersConfig(new com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFiltersConfig((java.util.Date) null, (java.util.Date) null, (java.lang.String) null, (java.lang.Boolean) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.PAYMENT, "REWARDS"}), (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, kotlin.collections.CollectionsKt.listOf("REWARDS"), (java.util.List) null, (java.lang.String) null, 14671871, (kotlin.jvm.internal.DefaultConstructorMarker) null)).build());
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            createWidget.getContent().invoke(startRestartGroup, 0);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activity.ActivityScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activity.ActivityScreenKt.m19528$r8$lambda$iI92HmpG6vfJ8AMZFpQZk7IUxY(com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$iI92HmpG6vfJ8AMZFpQZk7IUx-Y, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19528$r8$lambda$iI92HmpG6vfJ8AMZFpQZk7IUxY(com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider iActivityWidgetProvider, int i, androidx.compose.runtime.Composer composer, int i2) {
        ActivityScreen(iActivityWidgetProvider, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
