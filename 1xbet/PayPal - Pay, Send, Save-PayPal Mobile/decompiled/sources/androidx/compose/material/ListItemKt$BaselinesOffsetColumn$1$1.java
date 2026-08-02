package androidx.compose.material;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ListItemKt$BaselinesOffsetColumn$1$1 implements androidx.compose.ui.layout.MeasurePolicy {
    final /* synthetic */ java.util.List<androidx.compose.ui.unit.Dp> getHighSpeedVideoFpsRangesFor;

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        int i;
        long m8545copyZbe2FdA$default = androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(j, 0, 0, 0, Integer.MAX_VALUE, 3, null);
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(list.get(i2).mo7353measureBRTryo0(m8545copyZbe2FdA$default));
        }
        final java.util.ArrayList arrayList2 = arrayList;
        int i3 = 0;
        java.util.ArrayList arrayList3 = arrayList2;
        int size2 = arrayList3.size();
        for (int i4 = 0; i4 < size2; i4++) {
            i3 = java.lang.Integer.valueOf(java.lang.Math.max(i3.intValue(), ((androidx.compose.ui.layout.Placeable) arrayList2.get(i4)).getWidth()));
        }
        int intValue = i3.intValue();
        final int[] iArr = new int[arrayList2.size()];
        java.util.List<androidx.compose.ui.unit.Dp> list2 = this.getHighSpeedVideoFpsRangesFor;
        int size3 = arrayList3.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size3; i6++) {
            androidx.compose.ui.layout.Placeable placeable = (androidx.compose.ui.layout.Placeable) arrayList2.get(i6);
            if (i6 > 0) {
                int i7 = i6 - 1;
                i = ((androidx.compose.ui.layout.Placeable) arrayList2.get(i7)).getHeight() - ((androidx.compose.ui.layout.Placeable) arrayList2.get(i7)).get(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline());
            } else {
                i = 0;
            }
            int max = java.lang.Math.max(0, (measureScope.mo1412roundToPx0680j_4(list2.get(i6).m8615unboximpl()) - placeable.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline())) - i);
            iArr[i6] = max + i5;
            i5 += max + placeable.getHeight();
        }
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, intValue, i5, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.ListItemKt$BaselinesOffsetColumn$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material.ListItemKt$BaselinesOffsetColumn$1$1.getHighResolutionOutputSizeshNQ4ISI(arrayList2, iArr, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(java.util.List list, int[] iArr, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, (androidx.compose.ui.layout.Placeable) list.get(i), 0, iArr[i], 0.0f, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    ListItemKt$BaselinesOffsetColumn$1$1(java.util.List<androidx.compose.ui.unit.Dp> list) {
        this.getHighSpeedVideoFpsRangesFor = list;
    }
}
