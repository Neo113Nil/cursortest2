package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J#\u0010\n\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\r*\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\u00020\r*\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\rH&¢\u0006\u0004\b\u0012\u0010\u0010J#\u0010\u0013\u001a\u00020\r*\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0013\u0010\u0010J#\u0010\u0014\u001a\u00020\r*\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\rH&¢\u0006\u0004\b\u0014\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface LayoutModifierNode extends androidx.compose.ui.node.DelegatableNode {
    /* renamed from: measure-3p2s80s */
    androidx.compose.ui.layout.MeasureResult mo1117measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j);

    default int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return androidx.compose.ui.node.NodeMeasuringIntrinsics.INSTANCE.minWidth$ui(new androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode$minIntrinsicWidth$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final androidx.compose.ui.layout.MeasureResult mo7546measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
                return androidx.compose.ui.node.LayoutModifierNode.this.mo1117measure3p2s80s(measureScope, measurable, j);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    default int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return androidx.compose.ui.node.NodeMeasuringIntrinsics.INSTANCE.minHeight$ui(new androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode$minIntrinsicHeight$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final androidx.compose.ui.layout.MeasureResult mo7546measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
                return androidx.compose.ui.node.LayoutModifierNode.this.mo1117measure3p2s80s(measureScope, measurable, j);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    default int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return androidx.compose.ui.node.NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui(new androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode$maxIntrinsicWidth$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final androidx.compose.ui.layout.MeasureResult mo7546measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
                return androidx.compose.ui.node.LayoutModifierNode.this.mo1117measure3p2s80s(measureScope, measurable, j);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    default int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return androidx.compose.ui.node.NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui(new androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode$maxIntrinsicHeight$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s, reason: not valid java name */
            public final androidx.compose.ui.layout.MeasureResult mo7546measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
                return androidx.compose.ui.node.LayoutModifierNode.this.mo1117measure3p2s80s(measureScope, measurable, j);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i);
    }
}
