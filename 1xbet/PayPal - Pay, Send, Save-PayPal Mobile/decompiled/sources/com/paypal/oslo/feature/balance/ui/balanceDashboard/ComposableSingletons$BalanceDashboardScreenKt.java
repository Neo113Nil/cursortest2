package com.paypal.oslo.feature.balance.ui.balanceDashboard;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComposableSingletons$BalanceDashboardScreenKt {
    public static final com.paypal.oslo.feature.balance.ui.balanceDashboard.ComposableSingletons$BalanceDashboardScreenKt INSTANCE = new com.paypal.oslo.feature.balance.ui.balanceDashboard.ComposableSingletons$BalanceDashboardScreenKt();
    private static kotlin.jvm.functions.Function4<com.paypal.oslo.core.navigation.AppNavigator, com.paypal.oslo.core.navigation.result.NavResultRequestId, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1734647059, false, new kotlin.jvm.functions.Function4<com.paypal.oslo.core.navigation.AppNavigator, com.paypal.oslo.core.navigation.result.NavResultRequestId, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.ComposableSingletons$BalanceDashboardScreenKt$lambda$1734647059$1
        @Override // kotlin.jvm.functions.Function4
        public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            int i;
            com.paypal.oslo.core.navigation.AppNavigator appNavigator2 = appNavigator;
            com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId2 = navResultRequestId;
            java.lang.String m11592unboximpl = navResultRequestId2 != null ? navResultRequestId2.m11592unboximpl() : null;
            androidx.compose.runtime.Composer composer2 = composer;
            int intValue = num.intValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator2, "");
            if ((intValue & 6) == 0) {
                i = (composer2.changed(appNavigator2) ? 4 : 2) | intValue;
            } else {
                i = intValue;
            }
            if ((intValue & 48) == 0) {
                i |= composer2.changed(m11592unboximpl != null ? com.paypal.oslo.core.navigation.result.NavResultRequestId.m11587boximpl(m11592unboximpl) : null) ? 32 : 16;
            }
            if (!composer2.shouldExecute((i & 147) != 146, i & 1)) {
                composer2.skipToGroupEnd();
            } else {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1734647059, i, -1, "com.paypal.oslo.feature.balance.ui.balanceDashboard.ComposableSingletons$BalanceDashboardScreenKt.lambda$1734647059.<anonymous> (BalanceDashboardScreen.kt:123)");
                }
                com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetKt.m14170DebitCardWidgetTgLG0vA(appNavigator2, com.paypal.oslo.feature.debitcard.api.model.DebitCardEntryPoint.BALANCE, null, m11592unboximpl, composer2, (i & 14) | 48 | ((i << 6) & 7168), 4);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            return kotlin.Unit.INSTANCE;
        }
    });

    public final kotlin.jvm.functions.Function4<com.paypal.oslo.core.navigation.AppNavigator, com.paypal.oslo.core.navigation.result.NavResultRequestId, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1734647059$balance_prodRelease() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
