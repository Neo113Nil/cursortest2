package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class NavigationDrawerKt$ModalNavigationDrawer$2$6$1 implements androidx.compose.ui.layout.MeasurePolicy {
    final /* synthetic */ androidx.compose.material3.DrawerState getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableFloatState getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ float getHighSpeedVideoSizes = 0.0f;

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        java.lang.Integer valueOf;
        long m8545copyZbe2FdA$default = androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(list.get(i).mo7353measureBRTryo0(m8545copyZbe2FdA$default));
        }
        final java.util.ArrayList arrayList2 = arrayList;
        java.lang.Integer num = null;
        int i2 = 1;
        if (arrayList2.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = java.lang.Integer.valueOf(((androidx.compose.ui.layout.Placeable) arrayList2.get(0)).getWidth());
            int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(arrayList2);
            if (lastIndex > 0) {
                int i3 = 1;
                while (true) {
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(((androidx.compose.ui.layout.Placeable) arrayList2.get(i3)).getWidth());
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i3 == lastIndex) {
                        break;
                    }
                    i3++;
                }
            }
        }
        java.lang.Integer num2 = valueOf;
        int intValue = num2 != null ? num2.intValue() : 0;
        if (!arrayList2.isEmpty()) {
            num = java.lang.Integer.valueOf(((androidx.compose.ui.layout.Placeable) arrayList2.get(0)).getHeight());
            int lastIndex2 = kotlin.collections.CollectionsKt.getLastIndex(arrayList2);
            if (lastIndex2 > 0) {
                while (true) {
                    java.lang.Integer valueOf3 = java.lang.Integer.valueOf(((androidx.compose.ui.layout.Placeable) arrayList2.get(i2)).getHeight());
                    if (valueOf3.compareTo(num) > 0) {
                        num = valueOf3;
                    }
                    if (i2 == lastIndex2) {
                        break;
                    }
                    i2++;
                }
            }
        }
        java.lang.Integer num3 = num;
        int intValue2 = num3 != null ? num3.intValue() : 0;
        final androidx.compose.material3.DrawerState drawerState = this.getHighResolutionOutputSizeshNQ4ISI;
        final androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState = this.getHighSpeedVideoFpsRangesFor;
        final androidx.compose.runtime.MutableFloatState mutableFloatState = this.getHighSpeedVideoFpsRanges;
        final float f = this.getHighSpeedVideoSizes;
        final int i4 = intValue;
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, intValue, intValue2, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$6$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$6$1.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.material3.DrawerState.this, i4, arrayList2, mutableState, mutableFloatState, f, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(float f, androidx.compose.runtime.MutableFloatState mutableFloatState, androidx.compose.foundation.gestures.DraggableAnchorsConfig draggableAnchorsConfig) {
        float floatValue;
        androidx.compose.material3.DrawerValue drawerValue = androidx.compose.material3.DrawerValue.Closed;
        floatValue = mutableFloatState.getFloatValue();
        draggableAnchorsConfig.at(drawerValue, floatValue);
        draggableAnchorsConfig.at(androidx.compose.material3.DrawerValue.Open, f);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.material3.DrawerState drawerState, int i, java.util.List list, androidx.compose.runtime.MutableState mutableState, final androidx.compose.runtime.MutableFloatState mutableFloatState, final float f, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        boolean booleanValue;
        boolean booleanValue2;
        float positionOf = drawerState.getAnchoredDraggableState$material3().getAnchors().positionOf(androidx.compose.material3.DrawerValue.Closed);
        float f2 = -i;
        booleanValue = ((java.lang.Boolean) mutableState.getValue()).booleanValue();
        if (!booleanValue || positionOf != f2) {
            booleanValue2 = ((java.lang.Boolean) mutableState.getValue()).booleanValue();
            if (!booleanValue2) {
                mutableState.setValue(java.lang.Boolean.valueOf(true));
            }
            mutableFloatState.setFloatValue(f2);
            androidx.compose.foundation.gestures.AnchoredDraggableState.updateAnchors$default(drawerState.getAnchoredDraggableState$material3(), androidx.compose.foundation.gestures.AnchoredDraggableKt.DraggableAnchors(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$6$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$6$1.getHighSpeedVideoSizes(f, mutableFloatState, (androidx.compose.foundation.gestures.DraggableAnchorsConfig) obj);
                }
            }), null, 2, null);
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, (androidx.compose.ui.layout.Placeable) list.get(i2), 0, 0, 0.0f, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    NavigationDrawerKt$ModalNavigationDrawer$2$6$1(androidx.compose.material3.DrawerState drawerState, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, androidx.compose.runtime.MutableFloatState mutableFloatState) {
        this.getHighResolutionOutputSizeshNQ4ISI = drawerState;
        this.getHighSpeedVideoFpsRangesFor = mutableState;
        this.getHighSpeedVideoFpsRanges = mutableFloatState;
    }
}
