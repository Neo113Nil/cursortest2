package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR'\u0010\u0013\u001a\u0015\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e¢\u0006\u0002\b\u00108WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00078\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\f"}, d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$createMeasureResult$1;", "Landroidx/compose/ui/layout/MeasureResult;", "", "placeChildren", "()V", "", "Landroidx/compose/ui/layout/AlignmentLine;", "", "getAlignmentLines", "()Ljava/util/Map;", "alignmentLines", "getHeight", "()I", "height", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "Lkotlin/ExtensionFunctionType;", "getRulers", "()Lkotlin/jvm/functions/Function1;", "rulers", "getWidth", "width"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutNodeSubcompositionsState$createMeasureResult$1 implements androidx.compose.ui.layout.MeasureResult {
    private final /* synthetic */ androidx.compose.ui.layout.MeasureResult Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    public LayoutNodeSubcompositionsState$createMeasureResult$1(androidx.compose.ui.layout.MeasureResult measureResult, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.getHighSpeedVideoFpsRangesFor = function0;
        this.Camera2StreamConfigurationMap = measureResult;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final void placeChildren() {
        this.getHighSpeedVideoFpsRangesFor.invoke();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final int getWidth() {
        return this.Camera2StreamConfigurationMap.getWidth();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final kotlin.jvm.functions.Function1<androidx.compose.ui.layout.RulerScope, kotlin.Unit> getRulers() {
        return this.Camera2StreamConfigurationMap.getRulers();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final int getHeight() {
        return this.Camera2StreamConfigurationMap.getHeight();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> getAlignmentLines() {
        return this.Camera2StreamConfigurationMap.getAlignmentLines();
    }
}
