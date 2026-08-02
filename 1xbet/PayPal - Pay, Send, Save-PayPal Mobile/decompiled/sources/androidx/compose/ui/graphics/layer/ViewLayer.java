package androidx.compose.ui.graphics.layer;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b#\b\u0000\u0018\u0000 G2\u00020\u0001:\u0001GB#\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ@\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0002\b\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b!\u0010\"J7\u0010)\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020$H\u0014¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0016H\u0016¢\u0006\u0004\b+\u0010\u001cR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u00103R\"\u00105\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b5\u0010\u001e\"\u0004\b7\u00108R\u0018\u0010;\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b9\u0010:R*\u0010=\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u000b8\u0001@AX\u0081\u000e¢\u0006\u0012\n\u0004\b=\u00106\u001a\u0004\b>\u0010\u001e\"\u0004\b?\u00108R\u0016\u0010A\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b4\u0010@R\u0016\u00109\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b;\u0010BR'\u00102\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0002\b\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bA\u0010CR\u0018\u0010F\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bD\u0010E"}, d2 = {"Landroidx/compose/ui/graphics/layer/ViewLayer;", "Landroid/view/View;", "ownerView", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "canvasDrawScope", "<init>", "(Landroid/view/View;Landroidx/compose/ui/graphics/CanvasHolder;Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;)V", "Landroid/graphics/Outline;", "outline", "", "setLayerOutline", "(Landroid/graphics/Outline;)Z", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "parentLayer", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "drawBlock", "setDrawParams", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/jvm/functions/Function1;)V", "invalidate", "()V", "hasOverlappingRendering", "()Z", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "changed", "", "l", "t", "r", util.h.xy.cb.b.f1091, "onLayout", "(ZIIII)V", "forceLayout", "Landroid/view/View;", "getOwnerView", "()Landroid/view/View;", "Landroidx/compose/ui/graphics/CanvasHolder;", "getCanvasHolder", "()Landroidx/compose/ui/graphics/CanvasHolder;", "getHighSpeedVideoSizes", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "getHighSpeedVideoFpsRangesFor", "isInvalidated", "Z", "setInvalidated", "(Z)V", "getHighSpeedVideoFpsRanges", "Landroid/graphics/Outline;", "Camera2StreamConfigurationMap", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "canUseCompositingLayer", "getCanUseCompositingLayer$ui_graphics", "setCanUseCompositingLayer$ui_graphics", "Landroidx/compose/ui/unit/Density;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/unit/LayoutDirection;", "Lkotlin/jvm/functions/Function1;", "getInputFormats", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "getInputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ViewLayer extends android.view.View {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.compose.ui.unit.LayoutDirection getHighSpeedVideoFpsRanges;
    private boolean canUseCompositingLayer;
    private final androidx.compose.ui.graphics.CanvasHolder canvasHolder;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private android.graphics.Outline Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.ui.unit.Density getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.drawscope.CanvasDrawScope getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.layer.GraphicsLayer getInputSizeshNQ4ISI;
    private boolean isInvalidated;
    private final android.view.View ownerView;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.graphics.layer.ViewLayer.Companion INSTANCE = new androidx.compose.ui.graphics.layer.ViewLayer.Companion(null);
    public static final int $stable = 8;
    private static final android.view.ViewOutlineProvider LayerOutlineProvider = new android.view.ViewOutlineProvider() { // from class: androidx.compose.ui.graphics.layer.ViewLayer$Companion$LayerOutlineProvider$1
        /* JADX WARN: Code restructure failed: missing block: B:3:0x0004, code lost:
        
            r2 = ((androidx.compose.ui.graphics.layer.ViewLayer) r2).Camera2StreamConfigurationMap;
         */
        @Override // android.view.ViewOutlineProvider
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void getOutline(android.view.View view, android.graphics.Outline outline) {
            android.graphics.Outline outline2;
            if (!(view instanceof androidx.compose.ui.graphics.layer.ViewLayer) || outline2 == null) {
                return;
            }
            outline.set(outline2);
        }
    };

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    protected final void onLayout(boolean changed, int l, int t, int r, int b) {
    }

    public final android.view.View getOwnerView() {
        return this.ownerView;
    }

    public /* synthetic */ ViewLayer(android.view.View view, androidx.compose.ui.graphics.CanvasHolder canvasHolder, androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(view, (i & 2) != 0 ? new androidx.compose.ui.graphics.CanvasHolder() : canvasHolder, (i & 4) != 0 ? new androidx.compose.ui.graphics.drawscope.CanvasDrawScope() : canvasDrawScope);
    }

    public final androidx.compose.ui.graphics.CanvasHolder getCanvasHolder() {
        return this.canvasHolder;
    }

    public ViewLayer(android.view.View view, androidx.compose.ui.graphics.CanvasHolder canvasHolder, androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope) {
        super(view.getContext());
        this.ownerView = view;
        this.canvasHolder = canvasHolder;
        this.getHighSpeedVideoFpsRangesFor = canvasDrawScope;
        setOutlineProvider(LayerOutlineProvider);
        this.canUseCompositingLayer = true;
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.compose.ui.graphics.drawscope.DrawContextKt.getDefaultDensity();
        this.getHighSpeedVideoFpsRanges = androidx.compose.ui.unit.LayoutDirection.Ltr;
        this.getHighSpeedVideoSizes = androidx.compose.ui.graphics.layer.GraphicsLayerImpl.INSTANCE.getDefaultDrawBlock();
        setWillNotDraw(false);
        setClipBounds(null);
    }

    /* renamed from: isInvalidated, reason: from getter */
    public final boolean getIsInvalidated() {
        return this.isInvalidated;
    }

    public final void setInvalidated(boolean z) {
        this.isInvalidated = z;
    }

    public final boolean setLayerOutline(android.graphics.Outline outline) {
        this.Camera2StreamConfigurationMap = outline;
        androidx.compose.ui.graphics.layer.OutlineUtils outlineUtils = androidx.compose.ui.graphics.layer.OutlineUtils.INSTANCE;
        return androidx.compose.ui.graphics.layer.OutlineUtils.getHighSpeedVideoSizes(this);
    }

    /* renamed from: getCanUseCompositingLayer$ui_graphics, reason: from getter */
    public final boolean getCanUseCompositingLayer() {
        return this.canUseCompositingLayer;
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.canUseCompositingLayer != z) {
            this.canUseCompositingLayer = z;
            invalidate();
        }
    }

    public final void setDrawParams(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.graphics.layer.GraphicsLayer parentLayer, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> drawBlock) {
        this.getHighResolutionOutputSizeshNQ4ISI = density;
        this.getHighSpeedVideoFpsRanges = layoutDirection;
        this.getHighSpeedVideoSizes = drawBlock;
        this.getInputSizeshNQ4ISI = parentLayer;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        this.isInvalidated = true;
        super.invalidate();
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.canUseCompositingLayer;
    }

    @Override // android.view.View
    protected final void dispatchDraw(android.graphics.Canvas canvas) {
        androidx.compose.ui.graphics.CanvasHolder canvasHolder = this.canvasHolder;
        android.graphics.Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
        androidx.compose.ui.graphics.AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope = this.getHighSpeedVideoFpsRangesFor;
        androidx.compose.ui.unit.Density density = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.compose.ui.unit.LayoutDirection layoutDirection = this.getHighSpeedVideoFpsRanges;
        float width = getWidth();
        long m5812constructorimpl = androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(getHeight()) & 4294967295L) | (java.lang.Float.floatToRawIntBits(width) << 32));
        androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer = this.getInputSizeshNQ4ISI;
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1 = this.getHighSpeedVideoSizes;
        androidx.compose.ui.unit.Density density2 = canvasDrawScope.getDrawContext().getDensity();
        androidx.compose.ui.unit.LayoutDirection layoutDirection2 = canvasDrawScope.getDrawContext().getLayoutDirection();
        androidx.compose.ui.graphics.Canvas canvas2 = canvasDrawScope.getDrawContext().getCanvas();
        long mo6453getSizeNHjbRc = canvasDrawScope.getDrawContext().mo6453getSizeNHjbRc();
        androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer2 = canvasDrawScope.getDrawContext().getGraphicsLayer();
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = canvasDrawScope.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(androidCanvas);
        drawContext.mo6454setSizeuvyYCjk(m5812constructorimpl);
        drawContext.setGraphicsLayer(graphicsLayer);
        androidCanvas.save();
        try {
            function1.invoke(canvasDrawScope);
            androidCanvas.restore();
            androidx.compose.ui.graphics.drawscope.DrawContext drawContext2 = canvasDrawScope.getDrawContext();
            drawContext2.setDensity(density2);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer2);
            canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
            this.isInvalidated = false;
        } catch (java.lang.Throwable th) {
            androidCanvas.restore();
            androidx.compose.ui.graphics.drawscope.DrawContext drawContext3 = canvasDrawScope.getDrawContext();
            drawContext3.setDensity(density2);
            drawContext3.setLayoutDirection(layoutDirection2);
            drawContext3.setCanvas(canvas2);
            drawContext3.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
            drawContext3.setGraphicsLayer(graphicsLayer2);
            throw th;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/graphics/layer/ViewLayer$Companion;", "", "<init>", "()V", "Landroid/view/ViewOutlineProvider;", "LayerOutlineProvider", "Landroid/view/ViewOutlineProvider;", "getLayerOutlineProvider$ui_graphics", "()Landroid/view/ViewOutlineProvider;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final android.view.ViewOutlineProvider getLayerOutlineProvider$ui_graphics() {
            return androidx.compose.ui.graphics.layer.ViewLayer.LayerOutlineProvider;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
