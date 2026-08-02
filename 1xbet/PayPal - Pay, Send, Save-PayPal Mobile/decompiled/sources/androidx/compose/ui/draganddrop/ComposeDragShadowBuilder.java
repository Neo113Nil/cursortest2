package androidx.compose.ui.draganddrop;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B0\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R%\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/ui/draganddrop/ComposeDragShadowBuilder;", "Landroid/view/View$DragShadowBuilder;", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/geometry/Size;", "decorationSize", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "drawDragDecoration", "<init>", "(Landroidx/compose/ui/unit/Density;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/graphics/Point;", "outShadowSize", "outShadowTouchPoint", "onProvideShadowMetrics", "(Landroid/graphics/Point;Landroid/graphics/Point;)V", "Landroid/graphics/Canvas;", "canvas", "onDrawShadow", "(Landroid/graphics/Canvas;)V", "getHighSpeedVideoSizes", "Landroidx/compose/ui/unit/Density;", "Camera2StreamConfigurationMap", "J", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposeDragShadowBuilder extends android.view.View.DragShadowBuilder {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final long getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.ui.unit.Density Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    private ComposeDragShadowBuilder(androidx.compose.ui.unit.Density density, long j, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1) {
        this.Camera2StreamConfigurationMap = density;
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.getHighSpeedVideoSizes = function1;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(android.graphics.Point outShadowSize, android.graphics.Point outShadowTouchPoint) {
        androidx.compose.ui.unit.Density density = this.Camera2StreamConfigurationMap;
        outShadowSize.set(density.mo1412roundToPx0680j_4(density.mo1414toDpu2uoSUM(java.lang.Float.intBitsToFloat((int) (this.getHighResolutionOutputSizeshNQ4ISI >> 32)))), density.mo1412roundToPx0680j_4(density.mo1414toDpu2uoSUM(java.lang.Float.intBitsToFloat((int) (this.getHighResolutionOutputSizeshNQ4ISI & 4294967295L)))));
        outShadowTouchPoint.set(outShadowSize.x / 2, outShadowSize.y / 2);
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(android.graphics.Canvas canvas) {
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope = new androidx.compose.ui.graphics.drawscope.CanvasDrawScope();
        androidx.compose.ui.unit.Density density = this.Camera2StreamConfigurationMap;
        long j = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.compose.ui.unit.LayoutDirection layoutDirection = androidx.compose.ui.unit.LayoutDirection.Ltr;
        androidx.compose.ui.graphics.Canvas Canvas = androidx.compose.ui.graphics.AndroidCanvas_androidKt.Canvas(canvas);
        kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1 = this.getHighSpeedVideoSizes;
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
        androidx.compose.ui.unit.Density density2 = drawParams.getDensity();
        androidx.compose.ui.unit.LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
        androidx.compose.ui.graphics.Canvas canvas2 = drawParams.getCanvas();
        long size = drawParams.getSize();
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
        drawParams2.setDensity(density);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(Canvas);
        drawParams2.m6452setSizeuvyYCjk(j);
        Canvas.save();
        function1.invoke(canvasDrawScope);
        Canvas.restore();
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
        drawParams3.setDensity(density2);
        drawParams3.setLayoutDirection(layoutDirection2);
        drawParams3.setCanvas(canvas2);
        drawParams3.m6452setSizeuvyYCjk(size);
    }

    public /* synthetic */ ComposeDragShadowBuilder(androidx.compose.ui.unit.Density density, long j, kotlin.jvm.functions.Function1 function1, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(density, j, function1);
    }
}
