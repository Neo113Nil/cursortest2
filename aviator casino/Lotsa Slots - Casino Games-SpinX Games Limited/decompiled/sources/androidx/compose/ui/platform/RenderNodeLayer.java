package androidx.compose.ui.platform;

/* compiled from: RenderNodeLayer.android.kt */
@kotlin.Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 U2\u00020\u00012\u00020\u0002:\u0002UVB/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\u0007H\u0002J\b\u0010,\u001a\u00020\bH\u0016J\u0010\u0010-\u001a\u00020\b2\u0006\u0010+\u001a\u00020\u0007H\u0016J\b\u0010.\u001a\u00020\bH\u0016J\u001a\u0010/\u001a\u00020\b2\u0006\u00100\u001a\u000201H\u0016ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u001a\u00104\u001a\u00020\u000f2\u0006\u00105\u001a\u000206H\u0016ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u0018\u00109\u001a\u00020\b2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u000fH\u0016J\"\u0010=\u001a\u0002062\u0006\u0010>\u001a\u0002062\u0006\u0010<\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b?\u0010@J\u001a\u0010A\u001a\u00020\b2\u0006\u00105\u001a\u00020BH\u0016ø\u0001\u0000¢\u0006\u0004\bC\u0010DJ\u001a\u0010E\u001a\u00020\b2\u0006\u0010F\u001a\u00020GH\u0016ø\u0001\u0000¢\u0006\u0004\bH\u0010DJ*\u0010I\u001a\u00020\b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0016J\u001a\u0010J\u001a\u00020\b2\u0006\u00100\u001a\u000201H\u0016ø\u0001\u0000¢\u0006\u0004\bK\u00103J\b\u0010L\u001a\u00020\bH\u0002J\b\u0010M\u001a\u00020\bH\u0016J \u0010N\u001a\u00020\b2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020TH\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0018R\u000e\u0010$\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010'\u001a\u00020(X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010)\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006W"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer;", "Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/layout/GraphicLayerInfo;", "ownerView", "Landroidx/compose/ui/platform/AndroidComposeView;", "drawBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "", "invalidateParentLayer", "Lkotlin/Function0;", "(Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "canvasHolder", "Landroidx/compose/ui/graphics/CanvasHolder;", "drawnWithZ", "", "isDestroyed", "value", "isDirty", "setDirty", "(Z)V", "layerId", "", "getLayerId", "()J", "matrixCache", "Landroidx/compose/ui/platform/LayerMatrixCache;", "Landroidx/compose/ui/platform/DeviceRenderNode;", "mutatedFields", "", "outlineResolver", "Landroidx/compose/ui/platform/OutlineResolver;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "ownerViewId", "getOwnerViewId", "renderNode", "softwareLayerPaint", "Landroidx/compose/ui/graphics/Paint;", "transformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "J", "clipRenderNode", "canvas", "destroy", "drawLayer", "invalidate", "inverseTransform", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "inverseTransform-58bKbWc", "([F)V", "isInLayer", "position", "Landroidx/compose/ui/geometry/Offset;", "isInLayer-k-4lQ0M", "(J)Z", "mapBounds", "rect", "Landroidx/compose/ui/geometry/MutableRect;", "inverse", "mapOffset", "point", "mapOffset-8S9VItk", "(JZ)J", "move", "Landroidx/compose/ui/unit/IntOffset;", "move--gyyYBs", "(J)V", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.g, "size", "Landroidx/compose/ui/unit/IntSize;", "resize-ozmzZPI", "reuseLayer", "transform", "transform-58bKbWc", "triggerRepaint", "updateDisplayList", "updateLayerProperties", "scope", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "UniqueDrawingIdApi29", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RenderNodeLayer implements androidx.compose.ui.node.OwnedLayer, androidx.compose.ui.layout.GraphicLayerInfo {
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.Canvas, kotlin.Unit> drawBlock;
    private boolean drawnWithZ;
    private kotlin.jvm.functions.Function0<kotlin.Unit> invalidateParentLayer;
    private boolean isDestroyed;
    private boolean isDirty;
    private int mutatedFields;
    private final androidx.compose.ui.platform.OutlineResolver outlineResolver;
    private final androidx.compose.ui.platform.AndroidComposeView ownerView;
    private final androidx.compose.ui.platform.DeviceRenderNode renderNode;
    private androidx.compose.ui.graphics.Paint softwareLayerPaint;
    public static final int $stable = 8;
    private static final kotlin.jvm.functions.Function2<androidx.compose.ui.platform.DeviceRenderNode, android.graphics.Matrix, kotlin.Unit> getMatrix = new kotlin.jvm.functions.Function2<androidx.compose.ui.platform.DeviceRenderNode, android.graphics.Matrix, kotlin.Unit>() { // from class: androidx.compose.ui.platform.RenderNodeLayer$Companion$getMatrix$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.DeviceRenderNode deviceRenderNode, android.graphics.Matrix matrix) {
            invoke2(deviceRenderNode, matrix);
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(androidx.compose.ui.platform.DeviceRenderNode deviceRenderNode, android.graphics.Matrix matrix) {
            deviceRenderNode.getMatrix(matrix);
        }
    };
    private final androidx.compose.ui.platform.LayerMatrixCache<androidx.compose.ui.platform.DeviceRenderNode> matrixCache = new androidx.compose.ui.platform.LayerMatrixCache<>(getMatrix);
    private final androidx.compose.ui.graphics.CanvasHolder canvasHolder = new androidx.compose.ui.graphics.CanvasHolder();
    private long transformOrigin = androidx.compose.ui.graphics.TransformOrigin.INSTANCE.m2512getCenterSzJe1aQ();

    public RenderNodeLayer(androidx.compose.ui.platform.AndroidComposeView androidComposeView, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.Canvas, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        androidx.compose.ui.platform.RenderNodeApi23 renderNodeApi23;
        this.ownerView = androidComposeView;
        this.drawBlock = function1;
        this.invalidateParentLayer = function0;
        this.outlineResolver = new androidx.compose.ui.platform.OutlineResolver(androidComposeView.getDensity());
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            renderNodeApi23 = new androidx.compose.ui.platform.RenderNodeApi29(androidComposeView);
        } else {
            renderNodeApi23 = new androidx.compose.ui.platform.RenderNodeApi23(androidComposeView);
        }
        renderNodeApi23.setHasOverlappingRendering(true);
        renderNodeApi23.setClipToBounds(false);
        this.renderNode = renderNodeApi23;
    }

    public final androidx.compose.ui.platform.AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    private final void setDirty(boolean z) {
        if (z != this.isDirty) {
            this.isDirty = z;
            this.ownerView.notifyLayerIsDirty$ui_release(this, z);
        }
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.renderNode.getUniqueId();
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getOwnerViewId() {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return androidx.compose.ui.platform.RenderNodeLayer.UniqueDrawingIdApi29.getUniqueDrawingId(this.ownerView);
        }
        return -1L;
    }

    /* compiled from: RenderNodeLayer.android.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer$UniqueDrawingIdApi29;", "", "()V", "getUniqueDrawingId", "", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class UniqueDrawingIdApi29 {
        public static final androidx.compose.ui.platform.RenderNodeLayer.UniqueDrawingIdApi29 INSTANCE = new androidx.compose.ui.platform.RenderNodeLayer.UniqueDrawingIdApi29();

        private UniqueDrawingIdApi29() {
        }

        @kotlin.jvm.JvmStatic
        public static final long getUniqueDrawingId(android.view.View view) {
            return view.getUniqueDrawingId();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateLayerProperties(androidx.compose.ui.graphics.ReusableGraphicsLayerScope scope, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.unit.Density density) {
        kotlin.jvm.functions.Function0<kotlin.Unit> function0;
        int mutatedFields = scope.getMutatedFields() | this.mutatedFields;
        int i = mutatedFields & 4096;
        if (i != 0) {
            this.transformOrigin = scope.getTransformOrigin();
        }
        boolean z = false;
        boolean z2 = this.renderNode.getClipToOutline() && !this.outlineResolver.getOutlineClipSupported();
        if ((mutatedFields & 1) != 0) {
            this.renderNode.setScaleX(scope.getScaleX());
        }
        if ((mutatedFields & 2) != 0) {
            this.renderNode.setScaleY(scope.getScaleY());
        }
        if ((mutatedFields & 4) != 0) {
            this.renderNode.setAlpha(scope.getAlpha());
        }
        if ((mutatedFields & 8) != 0) {
            this.renderNode.setTranslationX(scope.getTranslationX());
        }
        if ((mutatedFields & 16) != 0) {
            this.renderNode.setTranslationY(scope.getTranslationY());
        }
        if ((mutatedFields & 32) != 0) {
            this.renderNode.setElevation(scope.getShadowElevation());
        }
        if ((mutatedFields & 64) != 0) {
            this.renderNode.setAmbientShadowColor(androidx.compose.ui.graphics.ColorKt.m2167toArgb8_81llA(scope.getAmbientShadowColor()));
        }
        if ((mutatedFields & 128) != 0) {
            this.renderNode.setSpotShadowColor(androidx.compose.ui.graphics.ColorKt.m2167toArgb8_81llA(scope.getSpotShadowColor()));
        }
        if ((mutatedFields & 1024) != 0) {
            this.renderNode.setRotationZ(scope.getRotationZ());
        }
        if ((mutatedFields & 256) != 0) {
            this.renderNode.setRotationX(scope.getRotationX());
        }
        if ((mutatedFields & 512) != 0) {
            this.renderNode.setRotationY(scope.getRotationY());
        }
        if ((mutatedFields & 2048) != 0) {
            this.renderNode.setCameraDistance(scope.getCameraDistance());
        }
        if (i != 0) {
            this.renderNode.setPivotX(androidx.compose.ui.graphics.TransformOrigin.m2507getPivotFractionXimpl(this.transformOrigin) * this.renderNode.getWidth());
            this.renderNode.setPivotY(androidx.compose.ui.graphics.TransformOrigin.m2508getPivotFractionYimpl(this.transformOrigin) * this.renderNode.getHeight());
        }
        boolean z3 = scope.getClip() && scope.getShape() != androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape();
        if ((mutatedFields & 24576) != 0) {
            this.renderNode.setClipToOutline(z3);
            this.renderNode.setClipToBounds(scope.getClip() && scope.getShape() == androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape());
        }
        if ((131072 & mutatedFields) != 0) {
            this.renderNode.setRenderEffect(scope.getRenderEffect());
        }
        if ((32768 & mutatedFields) != 0) {
            this.renderNode.mo3725setCompositingStrategyaDBOjCE(scope.getCompositingStrategy());
        }
        boolean update = this.outlineResolver.update(scope.getShape(), scope.getAlpha(), z3, scope.getShadowElevation(), layoutDirection, density);
        if (this.outlineResolver.getCacheIsDirty()) {
            this.renderNode.setOutline(this.outlineResolver.getOutline());
        }
        if (z3 && !this.outlineResolver.getOutlineClipSupported()) {
            z = true;
        }
        if (z2 != z || (z && update)) {
            invalidate();
        } else {
            triggerRepaint();
        }
        if (!this.drawnWithZ && this.renderNode.getElevation() > 0.0f && (function0 = this.invalidateParentLayer) != null) {
            function0.invoke();
        }
        if ((mutatedFields & androidx.compose.ui.graphics.Fields.MatrixAffectingFields) != 0) {
            this.matrixCache.invalidate();
        }
        this.mutatedFields = scope.getMutatedFields();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: isInLayer-k-4lQ0M */
    public boolean mo3661isInLayerk4lQ0M(long position) {
        float m1871getXimpl = androidx.compose.ui.geometry.Offset.m1871getXimpl(position);
        float m1872getYimpl = androidx.compose.ui.geometry.Offset.m1872getYimpl(position);
        if (this.renderNode.getClipToBounds()) {
            return 0.0f <= m1871getXimpl && m1871getXimpl < ((float) this.renderNode.getWidth()) && 0.0f <= m1872getYimpl && m1872getYimpl < ((float) this.renderNode.getHeight());
        }
        if (this.renderNode.getClipToOutline()) {
            return this.outlineResolver.m3762isInOutlinek4lQ0M(position);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: resize-ozmzZPI */
    public void mo3664resizeozmzZPI(long size) {
        int m4652getWidthimpl = androidx.compose.ui.unit.IntSize.m4652getWidthimpl(size);
        int m4651getHeightimpl = androidx.compose.ui.unit.IntSize.m4651getHeightimpl(size);
        float f = m4652getWidthimpl;
        this.renderNode.setPivotX(androidx.compose.ui.graphics.TransformOrigin.m2507getPivotFractionXimpl(this.transformOrigin) * f);
        float f2 = m4651getHeightimpl;
        this.renderNode.setPivotY(androidx.compose.ui.graphics.TransformOrigin.m2508getPivotFractionYimpl(this.transformOrigin) * f2);
        androidx.compose.ui.platform.DeviceRenderNode deviceRenderNode = this.renderNode;
        if (deviceRenderNode.setPosition(deviceRenderNode.getLeft(), this.renderNode.getTop(), this.renderNode.getLeft() + m4652getWidthimpl, this.renderNode.getTop() + m4651getHeightimpl)) {
            this.outlineResolver.m3763updateuvyYCjk(androidx.compose.ui.geometry.SizeKt.Size(f, f2));
            this.renderNode.setOutline(this.outlineResolver.getOutline());
            invalidate();
            this.matrixCache.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: move--gyyYBs */
    public void mo3663movegyyYBs(long position) {
        int left = this.renderNode.getLeft();
        int top = this.renderNode.getTop();
        int m4610getXimpl = androidx.compose.ui.unit.IntOffset.m4610getXimpl(position);
        int m4611getYimpl = androidx.compose.ui.unit.IntOffset.m4611getYimpl(position);
        if (left == m4610getXimpl && top == m4611getYimpl) {
            return;
        }
        if (left != m4610getXimpl) {
            this.renderNode.offsetLeftAndRight(m4610getXimpl - left);
        }
        if (top != m4611getYimpl) {
            this.renderNode.offsetTopAndBottom(m4611getYimpl - top);
        }
        triggerRepaint();
        this.matrixCache.invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if (this.isDirty || this.isDestroyed) {
            return;
        }
        this.ownerView.invalidate();
        setDirty(true);
    }

    private final void triggerRepaint() {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.compose.ui.platform.WrapperRenderNodeLayerHelperMethods.INSTANCE.onDescendantInvalidated(this.ownerView);
        } else {
            this.ownerView.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void drawLayer(androidx.compose.ui.graphics.Canvas canvas) {
        android.graphics.Canvas nativeCanvas = androidx.compose.ui.graphics.AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (nativeCanvas.isHardwareAccelerated()) {
            updateDisplayList();
            boolean z = this.renderNode.getElevation() > 0.0f;
            this.drawnWithZ = z;
            if (z) {
                canvas.enableZ();
            }
            this.renderNode.drawInto(nativeCanvas);
            if (this.drawnWithZ) {
                canvas.disableZ();
                return;
            }
            return;
        }
        float left = this.renderNode.getLeft();
        float top = this.renderNode.getTop();
        float right = this.renderNode.getRight();
        float bottom = this.renderNode.getBottom();
        if (this.renderNode.getAlpha() < 1.0f) {
            androidx.compose.ui.graphics.Paint paint = this.softwareLayerPaint;
            if (paint == null) {
                paint = androidx.compose.ui.graphics.AndroidPaint_androidKt.Paint();
                this.softwareLayerPaint = paint;
            }
            paint.setAlpha(this.renderNode.getAlpha());
            nativeCanvas.saveLayer(left, top, right, bottom, paint.getInternalPaint());
        } else {
            canvas.save();
        }
        canvas.translate(left, top);
        canvas.mo1968concat58bKbWc(this.matrixCache.m3740calculateMatrixGrdbGEg(this.renderNode));
        clipRenderNode(canvas);
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.Canvas, kotlin.Unit> function1 = this.drawBlock;
        if (function1 != null) {
            function1.invoke(canvas);
        }
        canvas.restore();
        setDirty(false);
    }

    private final void clipRenderNode(androidx.compose.ui.graphics.Canvas canvas) {
        if (this.renderNode.getClipToOutline() || this.renderNode.getClipToBounds()) {
            this.outlineResolver.clipToOutline(canvas);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateDisplayList() {
        if (this.isDirty || !this.renderNode.getHasDisplayList()) {
            androidx.compose.ui.graphics.Path clipPath = (!this.renderNode.getClipToOutline() || this.outlineResolver.getOutlineClipSupported()) ? null : this.outlineResolver.getClipPath();
            kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.Canvas, kotlin.Unit> function1 = this.drawBlock;
            if (function1 != null) {
                this.renderNode.record(this.canvasHolder, clipPath, function1);
            }
            setDirty(false);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        if (this.renderNode.getHasDisplayList()) {
            this.renderNode.discardDisplayList();
        }
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.isDestroyed = true;
        setDirty(false);
        this.ownerView.requestClearInvalidObservations();
        this.ownerView.recycle$ui_release(this);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: mapOffset-8S9VItk */
    public long mo3662mapOffset8S9VItk(long point, boolean inverse) {
        if (inverse) {
            float[] m3739calculateInverseMatrixbWbORWo = this.matrixCache.m3739calculateInverseMatrixbWbORWo(this.renderNode);
            return m3739calculateInverseMatrixbWbORWo != null ? androidx.compose.ui.graphics.Matrix.m2358mapMKHz9U(m3739calculateInverseMatrixbWbORWo, point) : androidx.compose.ui.geometry.Offset.INSTANCE.m1885getInfiniteF1C5BW0();
        }
        return androidx.compose.ui.graphics.Matrix.m2358mapMKHz9U(this.matrixCache.m3740calculateMatrixGrdbGEg(this.renderNode), point);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void mapBounds(androidx.compose.ui.geometry.MutableRect rect, boolean inverse) {
        if (inverse) {
            float[] m3739calculateInverseMatrixbWbORWo = this.matrixCache.m3739calculateInverseMatrixbWbORWo(this.renderNode);
            if (m3739calculateInverseMatrixbWbORWo == null) {
                rect.set(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            } else {
                androidx.compose.ui.graphics.Matrix.m2360mapimpl(m3739calculateInverseMatrixbWbORWo, rect);
                return;
            }
        }
        androidx.compose.ui.graphics.Matrix.m2360mapimpl(this.matrixCache.m3740calculateMatrixGrdbGEg(this.renderNode), rect);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void reuseLayer(kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.Canvas, kotlin.Unit> drawBlock, kotlin.jvm.functions.Function0<kotlin.Unit> invalidateParentLayer) {
        setDirty(false);
        this.isDestroyed = false;
        this.drawnWithZ = false;
        this.transformOrigin = androidx.compose.ui.graphics.TransformOrigin.INSTANCE.m2512getCenterSzJe1aQ();
        this.drawBlock = drawBlock;
        this.invalidateParentLayer = invalidateParentLayer;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: transform-58bKbWc */
    public void mo3665transform58bKbWc(float[] matrix) {
        androidx.compose.ui.graphics.Matrix.m2369timesAssign58bKbWc(matrix, this.matrixCache.m3740calculateMatrixGrdbGEg(this.renderNode));
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: inverseTransform-58bKbWc */
    public void mo3660inverseTransform58bKbWc(float[] matrix) {
        float[] m3739calculateInverseMatrixbWbORWo = this.matrixCache.m3739calculateInverseMatrixbWbORWo(this.renderNode);
        if (m3739calculateInverseMatrixbWbORWo != null) {
            androidx.compose.ui.graphics.Matrix.m2369timesAssign58bKbWc(matrix, m3739calculateInverseMatrixbWbORWo);
        }
    }
}
