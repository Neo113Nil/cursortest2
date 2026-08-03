package androidx.compose.ui.node;

/* compiled from: LayoutModifierNode.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\bÀ\u0002\u0018\u00002\u00020\u0001:\u0005\u0014\u0015\u0016\u0017\u0018B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J-\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\fJ-\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u000fJ-\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0011J-\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0013¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/node/NodeMeasuringIntrinsics;", "", "()V", com.helpshift.proactive.InAppViewConstants.MAX_HEIGHT, "", "measureBlock", "Landroidx/compose/ui/node/NodeMeasuringIntrinsics$MeasureBlock;", "intrinsicMeasureScope", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "intrinsicMeasurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "w", "maxHeight$ui_release", com.helpshift.proactive.InAppViewConstants.MAX_WIDTH, androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "maxWidth$ui_release", com.helpshift.proactive.InAppViewConstants.MIN_HEIGHT, "minHeight$ui_release", com.helpshift.proactive.InAppViewConstants.MIN_WIDTH, "minWidth$ui_release", "DefaultIntrinsicMeasurable", "EmptyPlaceable", "IntrinsicMinMax", "IntrinsicWidthHeight", "MeasureBlock", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NodeMeasuringIntrinsics {
    public static final int $stable = 0;
    public static final androidx.compose.ui.node.NodeMeasuringIntrinsics INSTANCE = new androidx.compose.ui.node.NodeMeasuringIntrinsics();

    /* compiled from: LayoutModifierNode.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicMinMax;", "", "(Ljava/lang/String;I)V", "Min", "Max", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private enum IntrinsicMinMax {
        Min,
        Max
    }

    /* compiled from: LayoutModifierNode.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicWidthHeight;", "", "(Ljava/lang/String;I)V", com.google.common.net.HttpHeaders.WIDTH, "Height", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private enum IntrinsicWidthHeight {
        Width,
        Height
    }

    /* compiled from: LayoutModifierNode.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/NodeMeasuringIntrinsics$MeasureBlock;", "", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface MeasureBlock {
        /* renamed from: measure-3p2s80s */
        androidx.compose.ui.layout.MeasureResult mo3408measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j);
    }

    private NodeMeasuringIntrinsics() {
    }

    public final int minWidth$ui_release(androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock measureBlock, androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int h) {
        return measureBlock.mo3408measure3p2s80s(new androidx.compose.ui.layout.IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new androidx.compose.ui.node.NodeMeasuringIntrinsics.DefaultIntrinsicMeasurable(intrinsicMeasurable, androidx.compose.ui.node.NodeMeasuringIntrinsics.IntrinsicMinMax.Min, androidx.compose.ui.node.NodeMeasuringIntrinsics.IntrinsicWidthHeight.Width), androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, h, 7, null)).get$w();
    }

    public final int minHeight$ui_release(androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock measureBlock, androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int w) {
        return measureBlock.mo3408measure3p2s80s(new androidx.compose.ui.layout.IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new androidx.compose.ui.node.NodeMeasuringIntrinsics.DefaultIntrinsicMeasurable(intrinsicMeasurable, androidx.compose.ui.node.NodeMeasuringIntrinsics.IntrinsicMinMax.Min, androidx.compose.ui.node.NodeMeasuringIntrinsics.IntrinsicWidthHeight.Height), androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, w, 0, 0, 13, null)).get$h();
    }

    public final int maxWidth$ui_release(androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock measureBlock, androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int h) {
        return measureBlock.mo3408measure3p2s80s(new androidx.compose.ui.layout.IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new androidx.compose.ui.node.NodeMeasuringIntrinsics.DefaultIntrinsicMeasurable(intrinsicMeasurable, androidx.compose.ui.node.NodeMeasuringIntrinsics.IntrinsicMinMax.Max, androidx.compose.ui.node.NodeMeasuringIntrinsics.IntrinsicWidthHeight.Width), androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, h, 7, null)).get$w();
    }

    public final int maxHeight$ui_release(androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock measureBlock, androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int w) {
        return measureBlock.mo3408measure3p2s80s(new androidx.compose.ui.layout.IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new androidx.compose.ui.node.NodeMeasuringIntrinsics.DefaultIntrinsicMeasurable(intrinsicMeasurable, androidx.compose.ui.node.NodeMeasuringIntrinsics.IntrinsicMinMax.Max, androidx.compose.ui.node.NodeMeasuringIntrinsics.IntrinsicWidthHeight.Height), androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, w, 0, 0, 13, null)).get$h();
    }

    /* compiled from: LayoutModifierNode.kt */
    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/ui/node/NodeMeasuringIntrinsics$DefaultIntrinsicMeasurable;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "minMax", "Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicMinMax;", "widthHeight", "Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicWidthHeight;", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicMinMax;Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicWidthHeight;)V", "getMeasurable", "()Landroidx/compose/ui/layout/IntrinsicMeasurable;", "getMinMax", "()Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicMinMax;", "parentData", "", "getParentData", "()Ljava/lang/Object;", "getWidthHeight", "()Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicWidthHeight;", "maxIntrinsicHeight", "", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class DefaultIntrinsicMeasurable implements androidx.compose.ui.layout.Measurable {
        private final androidx.compose.ui.layout.IntrinsicMeasurable measurable;
        private final androidx.compose.ui.node.NodeMeasuringIntrinsics.IntrinsicMinMax minMax;
        private final androidx.compose.ui.node.NodeMeasuringIntrinsics.IntrinsicWidthHeight widthHeight;

        public DefaultIntrinsicMeasurable(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, androidx.compose.ui.node.NodeMeasuringIntrinsics.IntrinsicMinMax intrinsicMinMax, androidx.compose.ui.node.NodeMeasuringIntrinsics.IntrinsicWidthHeight intrinsicWidthHeight) {
            this.measurable = intrinsicMeasurable;
            this.minMax = intrinsicMinMax;
            this.widthHeight = intrinsicWidthHeight;
        }

        public final androidx.compose.ui.layout.IntrinsicMeasurable getMeasurable() {
            return this.measurable;
        }

        public final androidx.compose.ui.node.NodeMeasuringIntrinsics.IntrinsicMinMax getMinMax() {
            return this.minMax;
        }

        public final androidx.compose.ui.node.NodeMeasuringIntrinsics.IntrinsicWidthHeight getWidthHeight() {
            return this.widthHeight;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public java.lang.Object getParentData() {
            return this.measurable.getParentData();
        }

        @Override // androidx.compose.ui.layout.Measurable
        /* renamed from: measure-BRTryo0 */
        public androidx.compose.ui.layout.Placeable mo3402measureBRTryo0(long constraints) {
            int minIntrinsicHeight;
            int minIntrinsicWidth;
            androidx.compose.ui.node.NodeMeasuringIntrinsics.IntrinsicWidthHeight intrinsicWidthHeight = this.widthHeight;
            androidx.compose.ui.node.NodeMeasuringIntrinsics.IntrinsicWidthHeight intrinsicWidthHeight2 = androidx.compose.ui.node.NodeMeasuringIntrinsics.IntrinsicWidthHeight.Width;
            int i = androidx.compose.ui.layout.LayoutKt.LargeDimension;
            if (intrinsicWidthHeight == intrinsicWidthHeight2) {
                if (this.minMax == androidx.compose.ui.node.NodeMeasuringIntrinsics.IntrinsicMinMax.Max) {
                    minIntrinsicWidth = this.measurable.maxIntrinsicWidth(androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(constraints));
                } else {
                    minIntrinsicWidth = this.measurable.minIntrinsicWidth(androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(constraints));
                }
                if (androidx.compose.ui.unit.Constraints.m4419getHasBoundedHeightimpl(constraints)) {
                    i = androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(constraints);
                }
                return new androidx.compose.ui.node.NodeMeasuringIntrinsics.EmptyPlaceable(minIntrinsicWidth, i);
            }
            if (this.minMax == androidx.compose.ui.node.NodeMeasuringIntrinsics.IntrinsicMinMax.Max) {
                minIntrinsicHeight = this.measurable.maxIntrinsicHeight(androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(constraints));
            } else {
                minIntrinsicHeight = this.measurable.minIntrinsicHeight(androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(constraints));
            }
            if (androidx.compose.ui.unit.Constraints.m4420getHasBoundedWidthimpl(constraints)) {
                i = androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(constraints);
            }
            return new androidx.compose.ui.node.NodeMeasuringIntrinsics.EmptyPlaceable(i, minIntrinsicHeight);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int height) {
            return this.measurable.minIntrinsicWidth(height);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int height) {
            return this.measurable.maxIntrinsicWidth(height);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int width) {
            return this.measurable.minIntrinsicHeight(width);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int width) {
            return this.measurable.maxIntrinsicHeight(width);
        }
    }

    /* compiled from: LayoutModifierNode.kt */
    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0096\u0002J=\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0019\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n\u0018\u00010\u0010¢\u0006\u0002\b\u0012H\u0014ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/node/NodeMeasuringIntrinsics$EmptyPlaceable;", "Landroidx/compose/ui/layout/Placeable;", "width", "", "height", "(II)V", "get", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "placeAt", "", "position", "Landroidx/compose/ui/unit/IntOffset;", "zIndex", "", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class EmptyPlaceable extends androidx.compose.ui.layout.Placeable {
        @Override // androidx.compose.ui.layout.Measured
        public int get(androidx.compose.ui.layout.AlignmentLine alignmentLine) {
            return Integer.MIN_VALUE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.compose.ui.layout.Placeable
        /* renamed from: placeAt-f8xVGno */
        public void mo3403placeAtf8xVGno(long position, float zIndex, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> layerBlock) {
        }

        public EmptyPlaceable(int i, int i2) {
            m3454setMeasuredSizeozmzZPI(androidx.compose.ui.unit.IntSizeKt.IntSize(i, i2));
        }
    }
}
