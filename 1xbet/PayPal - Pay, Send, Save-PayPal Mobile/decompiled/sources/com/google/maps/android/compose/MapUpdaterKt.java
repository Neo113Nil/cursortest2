package com.google.maps.android.compose;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\n\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\"\u001a\u0010\f\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/google/maps/android/compose/MapUpdaterState;", "mapUpdaterState", "", "MapUpdater", "(Lcom/google/maps/android/compose/MapUpdaterState;Landroidx/compose/runtime/Composer;I)V", "Lcom/google/maps/android/compose/MapPropertiesNode;", "Lcom/google/android/gms/maps/GoogleMap;", "map", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "applyContentPadding", "(Lcom/google/maps/android/compose/MapPropertiesNode;Lcom/google/android/gms/maps/GoogleMap;Landroidx/compose/foundation/layout/PaddingValues;)V", "DefaultMapContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getDefaultMapContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MapUpdaterKt {
    private static final androidx.compose.foundation.layout.PaddingValues DefaultMapContentPadding = androidx.compose.foundation.layout.PaddingKt.m1701PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);

    public static final androidx.compose.foundation.layout.PaddingValues getDefaultMapContentPadding() {
        return DefaultMapContentPadding;
    }

    public static final void MapUpdater(com.google.maps.android.compose.MapUpdaterState mapUpdaterState, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapUpdaterState, "");
        composer.startReplaceGroup(-1929098053);
        androidx.compose.runtime.Applier<?> applier = composer.getApplier();
        kotlin.jvm.internal.Intrinsics.checkNotNull(applier, "");
        com.google.android.gms.maps.GoogleMap map = ((com.google.maps.android.compose.MapApplier) applier).getMap();
        androidx.compose.runtime.Applier<?> applier2 = composer.getApplier();
        kotlin.jvm.internal.Intrinsics.checkNotNull(applier2, "");
        com.google.android.gms.maps.MapView mapView = ((com.google.maps.android.compose.MapApplier) applier2).getMapView();
        if (mapUpdaterState.getMergeDescendants()) {
            mapView.setImportantForAccessibility(4);
        }
        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
        androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection());
        boolean changed = composer.changed(mapUpdaterState);
        boolean changedInstance = composer.changedInstance(map);
        boolean changed2 = composer.changed(density);
        boolean changed3 = composer.changed(layoutDirection.ordinal());
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changed | changedInstance | changed2 | changed3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = (kotlin.jvm.functions.Function0) new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$1$1(mapUpdaterState, map, density, layoutDirection);
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
        if (!(composer.getApplier() instanceof com.google.maps.android.compose.MapApplier)) {
            androidx.compose.runtime.ComposablesKt.invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(function0);
        } else {
            composer.useNode();
        }
        androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
        androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, density, com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$1.INSTANCE);
        androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, layoutDirection, com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$2.INSTANCE);
        androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, mapUpdaterState.getContentDescription(), com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$3.INSTANCE);
        androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, mapUpdaterState.getContentPadding(), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$4(map));
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, mapUpdaterState.getLocationSource(), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$5(map));
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Boolean.valueOf(mapUpdaterState.getMapProperties().getIsBuildingEnabled()), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$6(map));
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Boolean.valueOf(mapUpdaterState.getMapProperties().getIsIndoorEnabled()), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$7(map));
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Boolean.valueOf(mapUpdaterState.getMapProperties().getIsMyLocationEnabled()), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$8(map));
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Boolean.valueOf(mapUpdaterState.getMapProperties().getIsTrafficEnabled()), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$9(map));
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, mapUpdaterState.getMapProperties().getLatLngBoundsForCameraTarget(), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$10(map));
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, mapUpdaterState.getMapProperties().getMapStyleOptions(), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$11(map));
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, mapUpdaterState.getMapProperties().getMapType(), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$12(map));
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Float.valueOf(mapUpdaterState.getMapProperties().getMaxZoomPreference()), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$13(map));
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Float.valueOf(mapUpdaterState.getMapProperties().getMinZoomPreference()), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$14(map));
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, mapUpdaterState.getMapColorScheme(), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$15(map));
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Boolean.valueOf(mapUpdaterState.getMapUiSettings().getCompassEnabled()), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$16(map));
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Boolean.valueOf(mapUpdaterState.getMapUiSettings().getIndoorLevelPickerEnabled()), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$17(map));
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Boolean.valueOf(mapUpdaterState.getMapUiSettings().getMapToolbarEnabled()), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$18(map));
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Boolean.valueOf(mapUpdaterState.getMapUiSettings().getMyLocationButtonEnabled()), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$19(map));
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Boolean.valueOf(mapUpdaterState.getMapUiSettings().getRotationGesturesEnabled()), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$20(map));
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Boolean.valueOf(mapUpdaterState.getMapUiSettings().getScrollGesturesEnabled()), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$21(map));
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Boolean.valueOf(mapUpdaterState.getMapUiSettings().getScrollGesturesEnabledDuringRotateOrZoom()), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$22(map));
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Boolean.valueOf(mapUpdaterState.getMapUiSettings().getTiltGesturesEnabled()), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$23(map));
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Boolean.valueOf(mapUpdaterState.getMapUiSettings().getZoomControlsEnabled()), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$24(map));
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Boolean.valueOf(mapUpdaterState.getMapUiSettings().getZoomGesturesEnabled()), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$25(map));
        androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, mapUpdaterState.getCameraPositionState(), com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$26.INSTANCE);
        composer.endNode();
        composer.endReplaceGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyContentPadding(com.google.maps.android.compose.MapPropertiesNode mapPropertiesNode, com.google.android.gms.maps.GoogleMap googleMap, androidx.compose.foundation.layout.PaddingValues paddingValues) {
        androidx.compose.ui.unit.Density density = mapPropertiesNode.getDensity();
        googleMap.setPadding(density.mo1412roundToPx0680j_4(paddingValues.mo1672calculateLeftPaddingu2uoSUM(mapPropertiesNode.getLayoutDirection())), density.mo1412roundToPx0680j_4(paddingValues.getTop()), density.mo1412roundToPx0680j_4(paddingValues.mo1673calculateRightPaddingu2uoSUM(mapPropertiesNode.getLayoutDirection())), density.mo1412roundToPx0680j_4(paddingValues.getBottom()));
    }
}
