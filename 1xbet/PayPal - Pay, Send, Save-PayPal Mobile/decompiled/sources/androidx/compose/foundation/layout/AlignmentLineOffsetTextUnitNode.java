package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ#\u0010\u0010\u001a\u00020\r*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\u00020\u00038\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0011\u001a\u00020\u00058\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\"\u0004\b\u0013\u0010\u0017R\u001c\u0010\u0018\u001a\u00020\u00058\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0016\"\u0004\b\u0011\u0010\u0017"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineOffsetTextUnitNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/layout/AlignmentLine;", "p0", "Landroidx/compose/ui/unit/TextUnit;", "p1", "p2", "<init>", "(Landroidx/compose/ui/layout/AlignmentLine;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/layout/AlignmentLine;", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/ui/layout/AlignmentLine;)V", "getHighSpeedVideoFpsRanges", "J", "(J)V", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AlignmentLineOffsetTextUnitNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.LayoutModifierNode {
    private long Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.ui.layout.AlignmentLine getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private long getHighResolutionOutputSizeshNQ4ISI;

    private AlignmentLineOffsetTextUnitNode(androidx.compose.ui.layout.AlignmentLine alignmentLine, long j, long j2) {
        this.getHighSpeedVideoFpsRanges = alignmentLine;
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.Camera2StreamConfigurationMap = j2;
    }

    public final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.layout.AlignmentLine alignmentLine) {
        this.getHighSpeedVideoFpsRanges = alignmentLine;
    }

    public final void getHighSpeedVideoFpsRangesFor(long j) {
        this.getHighResolutionOutputSizeshNQ4ISI = j;
    }

    public final void getHighResolutionOutputSizeshNQ4ISI(long j) {
        this.Camera2StreamConfigurationMap = j;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1117measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        androidx.compose.ui.layout.MeasureResult highSpeedVideoFpsRanges;
        highSpeedVideoFpsRanges = androidx.compose.foundation.layout.AlignmentLineKt.getHighSpeedVideoFpsRanges(measureScope, this.getHighSpeedVideoFpsRanges, androidx.compose.ui.unit.TextUnit.m8793getRawTypeimpl(this.getHighResolutionOutputSizeshNQ4ISI) == 0 ? androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM() : measureScope.mo1413toDpGaN1DYA(this.getHighResolutionOutputSizeshNQ4ISI), androidx.compose.ui.unit.TextUnit.m8793getRawTypeimpl(this.Camera2StreamConfigurationMap) == 0 ? androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM() : measureScope.mo1413toDpGaN1DYA(this.Camera2StreamConfigurationMap), measurable, j);
        return highSpeedVideoFpsRanges;
    }

    public /* synthetic */ AlignmentLineOffsetTextUnitNode(androidx.compose.ui.layout.AlignmentLine alignmentLine, long j, long j2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(alignmentLine, j, j2);
    }
}
