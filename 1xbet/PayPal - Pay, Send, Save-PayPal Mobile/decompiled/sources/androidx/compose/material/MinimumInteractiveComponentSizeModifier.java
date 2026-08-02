package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001J#\u0010\n\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0015\u001a\u00020\u00128\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/material/MinimumInteractiveComponentSizeModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "p0", "Landroidx/compose/ui/unit/Constraints;", "p1", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/unit/DpSize;", "getHighSpeedVideoSizes", "J", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class MinimumInteractiveComponentSizeModifier implements androidx.compose.ui.layout.LayoutModifier {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final long getHighResolutionOutputSizeshNQ4ISI;

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo2052measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(j);
        final int max = java.lang.Math.max(mo7353measureBRTryo0.getWidth(), measureScope.mo1412roundToPx0680j_4(androidx.compose.ui.unit.DpSize.m8699getWidthD9Ej5fM(this.getHighResolutionOutputSizeshNQ4ISI)));
        final int max2 = java.lang.Math.max(mo7353measureBRTryo0.getHeight(), measureScope.mo1412roundToPx0680j_4(androidx.compose.ui.unit.DpSize.m8697getHeightD9Ej5fM(this.getHighResolutionOutputSizeshNQ4ISI)));
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, max, max2, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.MinimumInteractiveComponentSizeModifier$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material.MinimumInteractiveComponentSizeModifier.Camera2StreamConfigurationMap(max, mo7353measureBRTryo0, max2, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    public final boolean equals(java.lang.Object p0) {
        androidx.compose.material.MinimumInteractiveComponentSizeModifier minimumInteractiveComponentSizeModifier = p0 instanceof androidx.compose.material.MinimumInteractiveComponentSizeModifier ? (androidx.compose.material.MinimumInteractiveComponentSizeModifier) p0 : null;
        if (minimumInteractiveComponentSizeModifier == null) {
            return false;
        }
        return androidx.compose.ui.unit.DpSize.m8696equalsimpl0(this.getHighResolutionOutputSizeshNQ4ISI, minimumInteractiveComponentSizeModifier.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final int hashCode() {
        return androidx.compose.ui.unit.DpSize.m8701hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(int i, androidx.compose.ui.layout.Placeable placeable, int i2, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, kotlin.math.MathKt.roundToInt((i - placeable.getWidth()) / 2.0f), kotlin.math.MathKt.roundToInt((i2 - placeable.getHeight()) / 2.0f), 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }
}
