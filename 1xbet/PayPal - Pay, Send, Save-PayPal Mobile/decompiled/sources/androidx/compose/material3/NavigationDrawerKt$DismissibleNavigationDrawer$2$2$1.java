package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class NavigationDrawerKt$DismissibleNavigationDrawer$2$2$1 implements androidx.compose.ui.layout.MeasurePolicy {
    final /* synthetic */ androidx.compose.material3.DrawerState Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = list.get(0).mo7353measureBRTryo0(j);
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo02 = list.get(1).mo7353measureBRTryo0(j);
        int width = mo7353measureBRTryo02.getWidth();
        int height = mo7353measureBRTryo02.getHeight();
        final androidx.compose.material3.DrawerState drawerState = this.Camera2StreamConfigurationMap;
        final androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState = this.getHighSpeedVideoFpsRangesFor;
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, width, height, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$2$1.Camera2StreamConfigurationMap(androidx.compose.material3.DrawerState.this, mo7353measureBRTryo0, mo7353measureBRTryo02, mutableState, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(float f, androidx.compose.foundation.gestures.DraggableAnchorsConfig draggableAnchorsConfig) {
        draggableAnchorsConfig.at(androidx.compose.material3.DrawerValue.Closed, f);
        draggableAnchorsConfig.at(androidx.compose.material3.DrawerValue.Open, 0.0f);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.material3.DrawerState drawerState, androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.Placeable placeable2, androidx.compose.runtime.MutableState mutableState, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        boolean booleanValue;
        boolean booleanValue2;
        float positionOf = drawerState.getAnchoredDraggableState$material3().getAnchors().positionOf(androidx.compose.material3.DrawerValue.Closed);
        final float f = -placeable.getWidth();
        booleanValue = ((java.lang.Boolean) mutableState.getValue()).booleanValue();
        if (!booleanValue || positionOf != f) {
            booleanValue2 = ((java.lang.Boolean) mutableState.getValue()).booleanValue();
            if (!booleanValue2) {
                mutableState.setValue(java.lang.Boolean.valueOf(true));
            }
            androidx.compose.foundation.gestures.AnchoredDraggableState.updateAnchors$default(drawerState.getAnchoredDraggableState$material3(), androidx.compose.foundation.gestures.AnchoredDraggableKt.DraggableAnchors(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$2$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$2$1.getHighSpeedVideoFpsRangesFor(f, (androidx.compose.foundation.gestures.DraggableAnchorsConfig) obj);
                }
            }), null, 2, null);
        }
        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, placeable.getWidth() + kotlin.math.MathKt.roundToInt(drawerState.requireOffset$material3()), 0, 0.0f, 4, null);
        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, kotlin.math.MathKt.roundToInt(drawerState.requireOffset$material3()), 0, 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    NavigationDrawerKt$DismissibleNavigationDrawer$2$2$1(androidx.compose.material3.DrawerState drawerState, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState) {
        this.Camera2StreamConfigurationMap = drawerState;
        this.getHighSpeedVideoFpsRangesFor = mutableState;
    }
}
