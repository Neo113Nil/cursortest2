package androidx.compose.material;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SnackbarKt$TextOnlySnackbar$2$1 implements androidx.compose.ui.layout.MeasurePolicy {
    public static final androidx.compose.material.SnackbarKt$TextOnlySnackbar$2$1 getHighSpeedVideoFpsRangesFor = new androidx.compose.material.SnackbarKt$TextOnlySnackbar$2$1();

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        final java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        boolean z = false;
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MIN_VALUE;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = list.get(i4).mo7353measureBRTryo0(j);
            arrayList.add(mo7353measureBRTryo0);
            if (mo7353measureBRTryo0.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline()) != Integer.MIN_VALUE && (i == Integer.MIN_VALUE || mo7353measureBRTryo0.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline()) < i)) {
                i = mo7353measureBRTryo0.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline());
            }
            if (mo7353measureBRTryo0.get(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline()) != Integer.MIN_VALUE && (i2 == Integer.MIN_VALUE || mo7353measureBRTryo0.get(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline()) > i2)) {
                i2 = mo7353measureBRTryo0.get(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline());
            }
            i3 = java.lang.Math.max(i3, mo7353measureBRTryo0.getHeight());
        }
        if (i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE) {
            z = true;
        }
        final int max = java.lang.Math.max(measureScope.mo1412roundToPx0680j_4((i == i2 || !z) ? androidx.compose.material.SnackbarKt.getHighSpeedVideoSizesFor : androidx.compose.material.SnackbarKt.getOutputFormats), i3);
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j), max, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.SnackbarKt$TextOnlySnackbar$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material.SnackbarKt$TextOnlySnackbar$2$1.getHighSpeedVideoSizes(arrayList, max, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(java.util.ArrayList arrayList, int i, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        java.util.ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.compose.ui.layout.Placeable placeable = (androidx.compose.ui.layout.Placeable) arrayList2.get(i2);
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, (i - placeable.getHeight()) / 2, 0.0f, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    SnackbarKt$TextOnlySnackbar$2$1() {
    }
}
