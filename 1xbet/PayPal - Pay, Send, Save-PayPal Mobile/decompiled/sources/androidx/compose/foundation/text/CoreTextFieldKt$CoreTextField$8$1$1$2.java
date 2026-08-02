package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J)\u0010\u000b\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0010\u001a\u00020\u000e*\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$8$1$1$2;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "maxIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CoreTextFieldKt$CoreTextField$8$1$1$2 implements androidx.compose.ui.layout.MeasurePolicy {
    final /* synthetic */ int Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.text.LegacyTextFieldState getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.ui.text.input.OffsetMapping getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.ui.unit.Density getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.ui.text.input.TextFieldValue getOutputFormats;

    /* JADX WARN: Multi-variable type inference failed */
    CoreTextFieldKt$CoreTextField$8$1$1$2(androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function1, androidx.compose.ui.text.input.TextFieldValue textFieldValue, androidx.compose.ui.text.input.OffsetMapping offsetMapping, androidx.compose.ui.unit.Density density, int i) {
        this.getHighSpeedVideoFpsRanges = legacyTextFieldState;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.getOutputFormats = textFieldValue;
        this.getHighSpeedVideoFpsRangesFor = offsetMapping;
        this.getHighSpeedVideoSizes = density;
        this.Camera2StreamConfigurationMap = i;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState = this.getHighSpeedVideoFpsRanges;
        androidx.compose.runtime.snapshots.Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        androidx.compose.runtime.snapshots.Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
            androidx.compose.ui.text.TextLayoutResult value = layoutResult != null ? layoutResult.getValue() : null;
            kotlin.Triple<java.lang.Integer, java.lang.Integer, androidx.compose.ui.text.TextLayoutResult> m2112layout_EkL_Y$foundation = androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.m2112layout_EkL_Y$foundation(this.getHighSpeedVideoFpsRanges.getTextDelegate(), j, measureScope.getLayoutDirection(), value);
            int intValue = m2112layout_EkL_Y$foundation.component1().intValue();
            int intValue2 = m2112layout_EkL_Y$foundation.component2().intValue();
            androidx.compose.ui.text.TextLayoutResult component3 = m2112layout_EkL_Y$foundation.component3();
            if (!kotlin.jvm.internal.Intrinsics.areEqual(value, component3)) {
                this.getHighSpeedVideoFpsRanges.setLayoutResult(new androidx.compose.foundation.text.TextLayoutResultProxy(component3, null, layoutResult != null ? layoutResult.getDecorationBoxCoordinates() : null, 2, null));
                this.getHighResolutionOutputSizeshNQ4ISI.invoke(component3);
                androidx.compose.foundation.text.CoreTextFieldKt.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, this.getOutputFormats, this.getHighSpeedVideoFpsRangesFor);
            }
            this.getHighSpeedVideoFpsRanges.m2074setMinHeightForSingleLineField0680j_4(this.getHighSpeedVideoSizes.mo1415toDpu2uoSUM(this.Camera2StreamConfigurationMap == 1 ? androidx.compose.foundation.text.TextDelegateKt.ceilToIntPx(component3.getLineBottom(0)) : 0));
            return measureScope.layout(intValue, intValue2, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), java.lang.Integer.valueOf(java.lang.Math.round(component3.getFirstBaseline()))), kotlin.TuplesKt.to(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), java.lang.Integer.valueOf(java.lang.Math.round(component3.getLastBaseline())))), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$8$1$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$8$1$1$2.getHighResolutionOutputSizeshNQ4ISI();
                    return highResolutionOutputSizeshNQ4ISI;
                }
            });
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI() {
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        this.getHighSpeedVideoFpsRanges.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
        return this.getHighSpeedVideoFpsRanges.getTextDelegate().getMaxIntrinsicWidth();
    }
}
