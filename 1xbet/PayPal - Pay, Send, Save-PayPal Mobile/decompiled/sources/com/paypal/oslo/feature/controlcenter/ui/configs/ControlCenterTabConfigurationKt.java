package com.paypal.oslo.feature.controlcenter.ui.configs;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/core/navigation/ui/l1/TabDestination;", "tab", "", "resolveTabLabel", "(Lcom/paypal/oslo/core/navigation/ui/l1/TabDestination;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ControlCenterTabConfigurationKt {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final java.lang.String resolveTabLabel(com.paypal.oslo.core.navigation.ui.l1.TabDestination tabDestination, androidx.compose.runtime.Composer composer, int i) {
        java.lang.Integer num;
        java.lang.String label;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tabDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(377566820, i, -1, "com.paypal.oslo.feature.controlcenter.ui.configs.resolveTabLabel (ControlCenterTabConfiguration.kt:135)");
        }
        java.lang.String label2 = tabDestination.getLabel();
        switch (label2.hashCode()) {
            case -2124595294:
                if (label2.equals("feature_control_center_tab_wallet")) {
                    num = java.lang.Integer.valueOf(com.paypal.oslo.feature.controlcenter.R.string.feature_control_center_tab_wallet);
                    break;
                }
                num = null;
                break;
            case -516333172:
                if (label2.equals("feature_control_center_tab_settings")) {
                    num = java.lang.Integer.valueOf(com.paypal.oslo.feature.controlcenter.R.string.feature_control_center_tab_settings);
                    break;
                }
                num = null;
                break;
            case 52458207:
                if (label2.equals("feature_control_center_tab_sales_tools")) {
                    num = java.lang.Integer.valueOf(com.paypal.oslo.feature.controlcenter.R.string.feature_control_center_tab_sales_tools);
                    break;
                }
                num = null;
                break;
            case 256515885:
                if (label2.equals("feature_control_center_tab_subscriptions")) {
                    num = java.lang.Integer.valueOf(com.paypal.oslo.feature.controlcenter.R.string.feature_control_center_tab_subscriptions);
                    break;
                }
                num = null;
                break;
            case 688035960:
                if (label2.equals("feature_control_center_tab_activity")) {
                    num = java.lang.Integer.valueOf(com.paypal.oslo.feature.controlcenter.R.string.feature_control_center_tab_activity);
                    break;
                }
                num = null;
                break;
            default:
                num = null;
                break;
        }
        if (num != null) {
            composer.startReplaceGroup(-426075404);
            label = androidx.compose.ui.res.StringResources_androidKt.stringResource(num.intValue(), composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-426019542);
            composer.endReplaceGroup();
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.controlcenter.LoggerKt.log, "Missing string resource mapping for tab label", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("tabLabel", tabDestination.getLabel()), kotlin.TuplesKt.to("instruction", "Add mapping to getStringResourceId() to display localized string")), null, 4, null);
            label = tabDestination.getLabel();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return label;
    }
}
