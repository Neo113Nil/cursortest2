package androidx.compose.material;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ListItemKt$OffsetToBaselineOrCenter$1$1 implements androidx.compose.ui.layout.MeasurePolicy {
    final /* synthetic */ float getHighSpeedVideoSizes;

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        int max;
        final int m8730getYimpl;
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = list.get(0).mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
        int i = mo7353measureBRTryo0.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline());
        if (i != Integer.MIN_VALUE) {
            m8730getYimpl = measureScope.mo1412roundToPx0680j_4(this.getHighSpeedVideoSizes) - i;
            max = java.lang.Math.max(androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j), mo7353measureBRTryo0.getHeight() + m8730getYimpl);
        } else {
            max = java.lang.Math.max(androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j), mo7353measureBRTryo0.getHeight());
            m8730getYimpl = androidx.compose.ui.unit.IntOffset.m8730getYimpl(androidx.compose.ui.Alignment.INSTANCE.getCenter().mo5504alignKFBX0sM(androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g(), androidx.compose.ui.unit.IntSize.m8767constructorimpl((max - mo7353measureBRTryo0.getHeight()) & 4294967295L), measureScope.getLayoutDirection()));
        }
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, mo7353measureBRTryo0.getWidth(), max, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$1$1.Camera2StreamConfigurationMap(androidx.compose.ui.layout.Placeable.this, m8730getYimpl, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.ui.layout.Placeable placeable, int i, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, i, 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    ListItemKt$OffsetToBaselineOrCenter$1$1(float f) {
        this.getHighSpeedVideoSizes = f;
    }
}
