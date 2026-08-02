package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0013\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0011\u0010!\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0011\u0010\"\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\"\u0010#R\u0019\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0006¢\u0006\u0006\n\u0004\b$\u0010%"}, d2 = {"Landroidx/compose/foundation/text/HorizontalScrollLayoutModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "p0", "", "p1", "Landroidx/compose/ui/text/input/TransformedText;", "p2", "Lkotlin/Function0;", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "p3", "<init>", "(Landroidx/compose/foundation/text/TextFieldScrollerPosition;ILandroidx/compose/ui/text/input/TransformedText;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/text/input/TransformedText;", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function0;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class HorizontalScrollLayoutModifier implements androidx.compose.ui.layout.LayoutModifier {
    private final androidx.compose.foundation.text.TextFieldScrollerPosition Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<androidx.compose.foundation.text.TextLayoutResultProxy> getHighSpeedVideoSizes;
    private final androidx.compose.ui.text.input.TransformedText getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;

    public HorizontalScrollLayoutModifier(androidx.compose.foundation.text.TextFieldScrollerPosition textFieldScrollerPosition, int i, androidx.compose.ui.text.input.TransformedText transformedText, kotlin.jvm.functions.Function0<androidx.compose.foundation.text.TextLayoutResultProxy> function0) {
        this.Camera2StreamConfigurationMap = textFieldScrollerPosition;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRangesFor = transformedText;
        this.getHighSpeedVideoSizes = function0;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    public final androidx.compose.ui.layout.MeasureResult mo2052measure3p2s80s(final androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(measurable.maxIntrinsicWidth(androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j)) < androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j) ? j : androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(j, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        final int min = java.lang.Math.min(mo7353measureBRTryo0.getWidth(), androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j));
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, min, mo7353measureBRTryo0.getHeight(), null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.HorizontalScrollLayoutModifier$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.text.HorizontalScrollLayoutModifier.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.HorizontalScrollLayoutModifier.this, measureScope, mo7353measureBRTryo0, min, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                return highResolutionOutputSizeshNQ4ISI;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.HorizontalScrollLayoutModifier horizontalScrollLayoutModifier, androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Placeable placeable, int i, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.geometry.Rect Camera2StreamConfigurationMap;
        androidx.compose.ui.layout.Placeable.PlacementScope placementScope2 = placementScope;
        int i2 = horizontalScrollLayoutModifier.getHighResolutionOutputSizeshNQ4ISI;
        androidx.compose.ui.text.input.TransformedText transformedText = horizontalScrollLayoutModifier.getHighSpeedVideoFpsRangesFor;
        androidx.compose.foundation.text.TextLayoutResultProxy invoke = horizontalScrollLayoutModifier.getHighSpeedVideoSizes.invoke();
        Camera2StreamConfigurationMap = androidx.compose.foundation.text.TextFieldScrollKt.Camera2StreamConfigurationMap(placementScope2, i2, transformedText, invoke != null ? invoke.getValue() : null, measureScope.getLayoutDirection() == androidx.compose.ui.unit.LayoutDirection.Rtl, placeable.getWidth());
        horizontalScrollLayoutModifier.Camera2StreamConfigurationMap.update(androidx.compose.foundation.gestures.Orientation.Horizontal, Camera2StreamConfigurationMap, i, placeable.getWidth());
        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, java.lang.Math.round(-horizontalScrollLayoutModifier.Camera2StreamConfigurationMap.getOffset()), 0, 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HorizontalScrollLayoutModifier(Camera2StreamConfigurationMap=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", getHighSpeedVideoFpsRangesFor=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.Camera2StreamConfigurationMap.hashCode() * 31) + java.lang.Integer.hashCode(this.getHighResolutionOutputSizeshNQ4ISI)) * 31) + this.getHighSpeedVideoFpsRangesFor.hashCode()) * 31) + this.getHighSpeedVideoSizes.hashCode();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.foundation.text.HorizontalScrollLayoutModifier)) {
            return false;
        }
        androidx.compose.foundation.text.HorizontalScrollLayoutModifier horizontalScrollLayoutModifier = (androidx.compose.foundation.text.HorizontalScrollLayoutModifier) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, horizontalScrollLayoutModifier.Camera2StreamConfigurationMap) && this.getHighResolutionOutputSizeshNQ4ISI == horizontalScrollLayoutModifier.getHighResolutionOutputSizeshNQ4ISI && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, horizontalScrollLayoutModifier.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, horizontalScrollLayoutModifier.getHighSpeedVideoSizes);
    }
}
