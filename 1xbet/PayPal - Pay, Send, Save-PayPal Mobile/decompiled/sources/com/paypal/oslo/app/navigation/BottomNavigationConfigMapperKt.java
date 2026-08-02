package com.paypal.oslo.app.navigation;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/app/navigation/BottomNavUiConfig;", "uiConfig", "Lcom/paypal/oslo/core/navigation/ui/BottomNavigationConfig;", "rememberBottomNavConfig", "(Lcom/paypal/oslo/app/navigation/BottomNavUiConfig;Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/core/navigation/ui/BottomNavigationConfig;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BottomNavigationConfigMapperKt {
    public static final com.paypal.oslo.core.navigation.ui.BottomNavigationConfig rememberBottomNavConfig(com.paypal.oslo.app.navigation.BottomNavUiConfig bottomNavUiConfig, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomNavUiConfig, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1012633550, i, -1, "com.paypal.oslo.app.navigation.rememberBottomNavConfig (BottomNavigationConfigMapper.kt:23)");
        }
        composer.startReplaceGroup(-1816729434);
        java.util.List<com.paypal.oslo.app.navigation.BottomNavUiItem> items = bottomNavUiConfig.getItems();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(items, 10));
        for (com.paypal.oslo.app.navigation.BottomNavUiItem bottomNavUiItem : items) {
            arrayList.add(new com.paypal.oslo.core.navigation.ui.BottomNavigationItem(bottomNavUiItem.getIcon(), androidx.compose.ui.res.StringResources_androidKt.stringResource(bottomNavUiItem.getLabelResId(), composer, 0), bottomNavUiItem.getDestination(), bottomNavUiItem.getSelectedIcon(), androidx.compose.ui.res.StringResources_androidKt.stringResource(bottomNavUiItem.getContentDescriptionResId(), composer, 0)));
        }
        composer.endReplaceGroup();
        com.paypal.oslo.core.navigation.ui.BottomNavigationConfig bottomNavigationConfig = new com.paypal.oslo.core.navigation.ui.BottomNavigationConfig(arrayList);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return bottomNavigationConfig;
    }
}
