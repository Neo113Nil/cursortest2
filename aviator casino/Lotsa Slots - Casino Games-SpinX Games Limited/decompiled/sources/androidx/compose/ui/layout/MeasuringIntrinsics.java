package androidx.compose.ui.layout;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LayoutModifier.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÂ\u0002\u0018\u00002\u00020\u0001:\u0004\u0010\u0011\u0012\u0013B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004J&\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004J&\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004J&\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/layout/MeasuringIntrinsics;", "", "()V", com.helpshift.proactive.InAppViewConstants.MAX_HEIGHT, "", "modifier", "Landroidx/compose/ui/layout/LayoutModifier;", "intrinsicMeasureScope", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "intrinsicMeasurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "w", com.helpshift.proactive.InAppViewConstants.MAX_WIDTH, androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, com.helpshift.proactive.InAppViewConstants.MIN_HEIGHT, com.helpshift.proactive.InAppViewConstants.MIN_WIDTH, "DefaultIntrinsicMeasurable", "EmptyPlaceable", "IntrinsicMinMax", "IntrinsicWidthHeight", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MeasuringIntrinsics {
    public static final androidx.compose.ui.layout.MeasuringIntrinsics INSTANCE = new androidx.compose.ui.layout.MeasuringIntrinsics();

    /* compiled from: LayoutModifier.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/layout/MeasuringIntrinsics$IntrinsicMinMax;", "", "(Ljava/lang/String;I)V", "Min", "Max", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private enum IntrinsicMinMax {
        Min,
        Max
    }

    /* compiled from: LayoutModifier.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/layout/MeasuringIntrinsics$IntrinsicWidthHeight;", "", "(Ljava/lang/String;I)V", com.google.common.net.HttpHeaders.WIDTH, "Height", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private enum IntrinsicWidthHeight {
        Width,
        Height
    }

    private MeasuringIntrinsics() {
    }

    public final int minWidth(androidx.compose.ui.layout.LayoutModifier modifier, androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int h) {
        return modifier.mo65measure3p2s80s(new androidx.compose.ui.layout.IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new androidx.compose.ui.layout.MeasuringIntrinsics.DefaultIntrinsicMeasurable(intrinsicMeasurable, androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicMinMax.Min, androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicWidthHeight.Width), androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, h, 7, null)).getWidth();
    }

    public final int minHeight(androidx.compose.ui.layout.LayoutModifier modifier, androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int w) {
        return modifier.mo65measure3p2s80s(new androidx.compose.ui.layout.IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new androidx.compose.ui.layout.MeasuringIntrinsics.DefaultIntrinsicMeasurable(intrinsicMeasurable, androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicMinMax.Min, androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicWidthHeight.Height), androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, w, 0, 0, 13, null)).getHeight();
    }

    public final int maxWidth(androidx.compose.ui.layout.LayoutModifier modifier, androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int h) {
        return modifier.mo65measure3p2s80s(new androidx.compose.ui.layout.IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new androidx.compose.ui.layout.MeasuringIntrinsics.DefaultIntrinsicMeasurable(intrinsicMeasurable, androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicMinMax.Max, androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicWidthHeight.Width), androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, h, 7, null)).getWidth();
    }

    public final int maxHeight(androidx.compose.ui.layout.LayoutModifier modifier, androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int w) {
        return modifier.mo65measure3p2s80s(new androidx.compose.ui.layout.IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new androidx.compose.ui.layout.MeasuringIntrinsics.DefaultIntrinsicMeasurable(intrinsicMeasurable, androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicMinMax.Max, androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicWidthHeight.Height), androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, w, 0, 0, 13, null)).getHeight();
    }

    /* compiled from: LayoutModifier.kt */
    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/ui/layout/MeasuringIntrinsics$DefaultIntrinsicMeasurable;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "minMax", "Landroidx/compose/ui/layout/MeasuringIntrinsics$IntrinsicMinMax;", "widthHeight", "Landroidx/compose/ui/layout/MeasuringIntrinsics$IntrinsicWidthHeight;", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;Landroidx/compose/ui/layout/MeasuringIntrinsics$IntrinsicMinMax;Landroidx/compose/ui/layout/MeasuringIntrinsics$IntrinsicWidthHeight;)V", "getMeasurable", "()Landroidx/compose/ui/layout/IntrinsicMeasurable;", "getMinMax", "()Landroidx/compose/ui/layout/MeasuringIntrinsics$IntrinsicMinMax;", "parentData", "", "getParentData", "()Ljava/lang/Object;", "getWidthHeight", "()Landroidx/compose/ui/layout/MeasuringIntrinsics$IntrinsicWidthHeight;", "maxIntrinsicHeight", "", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class DefaultIntrinsicMeasurable implements androidx.compose.ui.layout.Measurable {
        private final androidx.compose.ui.layout.IntrinsicMeasurable measurable;
        private final androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicMinMax minMax;
        private final androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicWidthHeight widthHeight;

        public DefaultIntrinsicMeasurable(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicMinMax intrinsicMinMax, androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicWidthHeight intrinsicWidthHeight) {
            this.measurable = intrinsicMeasurable;
            this.minMax = intrinsicMinMax;
            this.widthHeight = intrinsicWidthHeight;
        }

        public final androidx.compose.ui.layout.IntrinsicMeasurable getMeasurable() {
            return this.measurable;
        }

        public final androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicMinMax getMinMax() {
            return this.minMax;
        }

        public final androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicWidthHeight getWidthHeight() {
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
            androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicWidthHeight intrinsicWidthHeight = this.widthHeight;
            androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicWidthHeight intrinsicWidthHeight2 = androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicWidthHeight.Width;
            int i = androidx.compose.ui.layout.LayoutKt.LargeDimension;
            if (intrinsicWidthHeight == intrinsicWidthHeight2) {
                if (this.minMax == androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicMinMax.Max) {
                    minIntrinsicWidth = this.measurable.maxIntrinsicWidth(androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(constraints));
                } else {
                    minIntrinsicWidth = this.measurable.minIntrinsicWidth(androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(constraints));
                }
                if (androidx.compose.ui.unit.Constraints.m4419getHasBoundedHeightimpl(constraints)) {
                    i = androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(constraints);
                }
                return new androidx.compose.ui.layout.MeasuringIntrinsics.EmptyPlaceable(minIntrinsicWidth, i);
            }
            if (this.minMax == androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicMinMax.Max) {
                minIntrinsicHeight = this.measurable.maxIntrinsicHeight(androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(constraints));
            } else {
                minIntrinsicHeight = this.measurable.minIntrinsicHeight(androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(constraints));
            }
            if (androidx.compose.ui.unit.Constraints.m4420getHasBoundedWidthimpl(constraints)) {
                i = androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(constraints);
            }
            return new androidx.compose.ui.layout.MeasuringIntrinsics.EmptyPlaceable(i, minIntrinsicHeight);
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

    /* compiled from: LayoutModifier.kt */
    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0096\u0002J=\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0019\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n\u0018\u00010\u0010¢\u0006\u0002\b\u0012H\u0014ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/layout/MeasuringIntrinsics$EmptyPlaceable;", "Landroidx/compose/ui/layout/Placeable;", "width", "", "height", "(II)V", "get", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "placeAt", "", "position", "Landroidx/compose/ui/unit/IntOffset;", "zIndex", "", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
