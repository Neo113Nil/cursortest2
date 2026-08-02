package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0013\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0011\u0010\"\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b \u0010!R\u0011\u0010 \u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b#\u0010$R\u0019\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0006¢\u0006\u0006\n\u0004\b\u001f\u0010%"}, d2 = {"Landroidx/compose/foundation/text/VerticalScrollLayoutModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "p0", "", "p1", "Landroidx/compose/ui/text/input/TransformedText;", "p2", "Lkotlin/Function0;", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "p3", "<init>", "(Landroidx/compose/foundation/text/TextFieldScrollerPosition;ILandroidx/compose/ui/text/input/TransformedText;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/text/input/TransformedText;", "Lkotlin/jvm/functions/Function0;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class VerticalScrollLayoutModifier implements androidx.compose.ui.layout.LayoutModifier {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.TextFieldScrollerPosition getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.ui.text.input.TransformedText getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<androidx.compose.foundation.text.TextLayoutResultProxy> getHighSpeedVideoFpsRanges;

    public VerticalScrollLayoutModifier(androidx.compose.foundation.text.TextFieldScrollerPosition textFieldScrollerPosition, int i, androidx.compose.ui.text.input.TransformedText transformedText, kotlin.jvm.functions.Function0<androidx.compose.foundation.text.TextLayoutResultProxy> function0) {
        this.getHighSpeedVideoSizes = textFieldScrollerPosition;
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRangesFor = transformedText;
        this.getHighSpeedVideoFpsRanges = function0;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo2052measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(j, 0, 0, 0, Integer.MAX_VALUE, 7, null));
        final int min = java.lang.Math.min(mo7353measureBRTryo0.getHeight(), androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j));
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, mo7353measureBRTryo0.getWidth(), min, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.VerticalScrollLayoutModifier$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.text.VerticalScrollLayoutModifier.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.VerticalScrollLayoutModifier.this, mo7353measureBRTryo0, min, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                return highResolutionOutputSizeshNQ4ISI;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.VerticalScrollLayoutModifier verticalScrollLayoutModifier, androidx.compose.ui.layout.Placeable placeable, int i, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.geometry.Rect Camera2StreamConfigurationMap;
        androidx.compose.ui.layout.Placeable.PlacementScope placementScope2 = placementScope;
        int i2 = verticalScrollLayoutModifier.Camera2StreamConfigurationMap;
        androidx.compose.ui.text.input.TransformedText transformedText = verticalScrollLayoutModifier.getHighSpeedVideoFpsRangesFor;
        androidx.compose.foundation.text.TextLayoutResultProxy invoke = verticalScrollLayoutModifier.getHighSpeedVideoFpsRanges.invoke();
        Camera2StreamConfigurationMap = androidx.compose.foundation.text.TextFieldScrollKt.Camera2StreamConfigurationMap(placementScope2, i2, transformedText, invoke != null ? invoke.getValue() : null, false, placeable.getWidth());
        verticalScrollLayoutModifier.getHighSpeedVideoSizes.update(androidx.compose.foundation.gestures.Orientation.Vertical, Camera2StreamConfigurationMap, i, placeable.getHeight());
        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, java.lang.Math.round(-verticalScrollLayoutModifier.getHighSpeedVideoSizes.getOffset()), 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VerticalScrollLayoutModifier(getHighSpeedVideoSizes=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", getHighSpeedVideoFpsRangesFor=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.getHighSpeedVideoSizes.hashCode() * 31) + java.lang.Integer.hashCode(this.Camera2StreamConfigurationMap)) * 31) + this.getHighSpeedVideoFpsRangesFor.hashCode()) * 31) + this.getHighSpeedVideoFpsRanges.hashCode();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.foundation.text.VerticalScrollLayoutModifier)) {
            return false;
        }
        androidx.compose.foundation.text.VerticalScrollLayoutModifier verticalScrollLayoutModifier = (androidx.compose.foundation.text.VerticalScrollLayoutModifier) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, verticalScrollLayoutModifier.getHighSpeedVideoSizes) && this.Camera2StreamConfigurationMap == verticalScrollLayoutModifier.Camera2StreamConfigurationMap && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, verticalScrollLayoutModifier.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, verticalScrollLayoutModifier.getHighSpeedVideoFpsRanges);
    }
}
