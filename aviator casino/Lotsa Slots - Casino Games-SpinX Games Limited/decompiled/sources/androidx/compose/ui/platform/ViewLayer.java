package androidx.compose.ui.platform;

/* compiled from: ViewLayer.android.kt */
@kotlin.Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 n2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002noB7\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\u0010\u000eJ\b\u00109\u001a\u00020\u000bH\u0016J\u0010\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020<H\u0014J\u0010\u0010=\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\nH\u0016J\b\u0010>\u001a\u00020\u000bH\u0016J\b\u0010?\u001a\u00020\u001bH\u0016J\b\u0010@\u001a\u00020\u000bH\u0016J\u001a\u0010A\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020CH\u0016ø\u0001\u0000¢\u0006\u0004\bD\u0010EJ\u001a\u0010F\u001a\u00020\u001b2\u0006\u0010G\u001a\u00020HH\u0016ø\u0001\u0000¢\u0006\u0004\bI\u0010JJ\u0018\u0010K\u001a\u00020\u000b2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020\u001bH\u0016J\"\u0010O\u001a\u00020H2\u0006\u0010P\u001a\u00020H2\u0006\u0010N\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\bQ\u0010RJ\u001a\u0010S\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020TH\u0016ø\u0001\u0000¢\u0006\u0004\bU\u0010VJ0\u0010W\u001a\u00020\u000b2\u0006\u0010X\u001a\u00020\u001b2\u0006\u0010Y\u001a\u0002022\u0006\u0010Z\u001a\u0002022\u0006\u0010[\u001a\u0002022\u0006\u0010\\\u001a\u000202H\u0014J\b\u0010]\u001a\u00020\u000bH\u0002J\u001a\u0010^\u001a\u00020\u000b2\u0006\u0010_\u001a\u00020`H\u0016ø\u0001\u0000¢\u0006\u0004\ba\u0010VJ*\u0010b\u001a\u00020\u000b2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0016J\u001a\u0010c\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020CH\u0016ø\u0001\u0000¢\u0006\u0004\bd\u0010EJ\b\u0010e\u001a\u00020\u000bH\u0016J \u0010f\u001a\u00020\u000b2\u0006\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020j2\u0006\u0010k\u001a\u00020lH\u0016J\b\u0010m\u001a\u00020\u000bH\u0002R$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u001b@BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020$X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u000e\u0010'\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010(\u001a\u00020)X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010*R\u0016\u0010+\u001a\u0004\u0018\u00010,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000100X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0014\u00107\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006p"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer;", "Landroid/view/View;", "Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/layout/GraphicLayerInfo;", "ownerView", "Landroidx/compose/ui/platform/AndroidComposeView;", "container", "Landroidx/compose/ui/platform/DrawChildContainer;", "drawBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "", "invalidateParentLayer", "Lkotlin/Function0;", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/ui/platform/DrawChildContainer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "value", "", "cameraDistancePx", "getCameraDistancePx", "()F", "setCameraDistancePx", "(F)V", "canvasHolder", "Landroidx/compose/ui/graphics/CanvasHolder;", "clipBoundsCache", "Landroid/graphics/Rect;", "clipToBounds", "", "getContainer", "()Landroidx/compose/ui/platform/DrawChildContainer;", "drawnWithZ", "isInvalidated", "()Z", "setInvalidated", "(Z)V", "layerId", "", "getLayerId", "()J", "mHasOverlappingRendering", "mTransformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "J", "manualClipPath", "Landroidx/compose/ui/graphics/Path;", "getManualClipPath", "()Landroidx/compose/ui/graphics/Path;", "matrixCache", "Landroidx/compose/ui/platform/LayerMatrixCache;", "mutatedFields", "", "outlineResolver", "Landroidx/compose/ui/platform/OutlineResolver;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "ownerViewId", "getOwnerViewId", "destroy", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "drawLayer", "forceLayout", "hasOverlappingRendering", "invalidate", "inverseTransform", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "inverseTransform-58bKbWc", "([F)V", "isInLayer", "position", "Landroidx/compose/ui/geometry/Offset;", "isInLayer-k-4lQ0M", "(J)Z", "mapBounds", "rect", "Landroidx/compose/ui/geometry/MutableRect;", "inverse", "mapOffset", "point", "mapOffset-8S9VItk", "(JZ)J", "move", "Landroidx/compose/ui/unit/IntOffset;", "move--gyyYBs", "(J)V", "onLayout", "changed", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE, "t", com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, "b", "resetClipBounds", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.g, "size", "Landroidx/compose/ui/unit/IntSize;", "resize-ozmzZPI", "reuseLayer", "transform", "transform-58bKbWc", "updateDisplayList", "updateLayerProperties", "scope", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "updateOutlineResolver", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "UniqueDrawingIdApi29", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ViewLayer extends android.view.View implements androidx.compose.ui.node.OwnedLayer, androidx.compose.ui.layout.GraphicLayerInfo {
    private static boolean hasRetrievedMethod;
    private static java.lang.reflect.Field recreateDisplayList;
    private static boolean shouldUseDispatchDraw;
    private static java.lang.reflect.Method updateDisplayListIfDirtyMethod;
    private final androidx.compose.ui.graphics.CanvasHolder canvasHolder;
    private android.graphics.Rect clipBoundsCache;
    private boolean clipToBounds;
    private final androidx.compose.ui.platform.DrawChildContainer container;
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.Canvas, kotlin.Unit> drawBlock;
    private boolean drawnWithZ;
    private kotlin.jvm.functions.Function0<kotlin.Unit> invalidateParentLayer;
    private boolean isInvalidated;
    private final long layerId;
    private boolean mHasOverlappingRendering;
    private long mTransformOrigin;
    private final androidx.compose.ui.platform.LayerMatrixCache<android.view.View> matrixCache;
    private int mutatedFields;
    private final androidx.compose.ui.platform.OutlineResolver outlineResolver;
    private final androidx.compose.ui.platform.AndroidComposeView ownerView;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.platform.ViewLayer.Companion INSTANCE = new androidx.compose.ui.platform.ViewLayer.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.jvm.functions.Function2<android.view.View, android.graphics.Matrix, kotlin.Unit> getMatrix = new kotlin.jvm.functions.Function2<android.view.View, android.graphics.Matrix, kotlin.Unit>() { // from class: androidx.compose.ui.platform.ViewLayer$Companion$getMatrix$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.view.View view, android.graphics.Matrix matrix) {
            invoke2(view, matrix);
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(android.view.View view, android.graphics.Matrix matrix) {
            matrix.set(view.getMatrix());
        }
    };
    private static final android.view.ViewOutlineProvider OutlineProvider = new android.view.ViewOutlineProvider() { // from class: androidx.compose.ui.platform.ViewLayer$Companion$OutlineProvider$1
        @Override // android.view.ViewOutlineProvider
        public void getOutline(android.view.View view, android.graphics.Outline outline) {
            androidx.compose.ui.platform.OutlineResolver outlineResolver;
            kotlin.jvm.internal.Intrinsics.checkNotNull(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            outlineResolver = ((androidx.compose.ui.platform.ViewLayer) view).outlineResolver;
            android.graphics.Outline outline2 = outlineResolver.getOutline();
            kotlin.jvm.internal.Intrinsics.checkNotNull(outline2);
            outline.set(outline2);
        }
    };

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
    }

    public final androidx.compose.ui.platform.AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    public final androidx.compose.ui.platform.DrawChildContainer getContainer() {
        return this.container;
    }

    public ViewLayer(androidx.compose.ui.platform.AndroidComposeView androidComposeView, androidx.compose.ui.platform.DrawChildContainer drawChildContainer, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.Canvas, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        super(androidComposeView.getContext());
        this.ownerView = androidComposeView;
        this.container = drawChildContainer;
        this.drawBlock = function1;
        this.invalidateParentLayer = function0;
        this.outlineResolver = new androidx.compose.ui.platform.OutlineResolver(androidComposeView.getDensity());
        this.canvasHolder = new androidx.compose.ui.graphics.CanvasHolder();
        this.matrixCache = new androidx.compose.ui.platform.LayerMatrixCache<>(getMatrix);
        this.mTransformOrigin = androidx.compose.ui.graphics.TransformOrigin.INSTANCE.m2512getCenterSzJe1aQ();
        this.mHasOverlappingRendering = true;
        setWillNotDraw(false);
        drawChildContainer.addView(this);
        this.layerId = android.view.View.generateViewId();
    }

    private final androidx.compose.ui.graphics.Path getManualClipPath() {
        if (!getClipToOutline() || this.outlineResolver.getOutlineClipSupported()) {
            return null;
        }
        return this.outlineResolver.getClipPath();
    }

    /* renamed from: isInvalidated, reason: from getter */
    public final boolean getIsInvalidated() {
        return this.isInvalidated;
    }

    private final void setInvalidated(boolean z) {
        if (z != this.isInvalidated) {
            this.isInvalidated = z;
            this.ownerView.notifyLayerIsDirty$ui_release(this, z);
        }
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.layerId;
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getOwnerViewId() {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return androidx.compose.ui.platform.ViewLayer.UniqueDrawingIdApi29.getUniqueDrawingId(this.ownerView);
        }
        return -1L;
    }

    /* compiled from: ViewLayer.android.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer$UniqueDrawingIdApi29;", "", "()V", "getUniqueDrawingId", "", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class UniqueDrawingIdApi29 {
        public static final androidx.compose.ui.platform.ViewLayer.UniqueDrawingIdApi29 INSTANCE = new androidx.compose.ui.platform.ViewLayer.UniqueDrawingIdApi29();

        private UniqueDrawingIdApi29() {
        }

        @kotlin.jvm.JvmStatic
        public static final long getUniqueDrawingId(android.view.View view) {
            return view.getUniqueDrawingId();
        }
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * getResources().getDisplayMetrics().densityDpi);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateLayerProperties(androidx.compose.ui.graphics.ReusableGraphicsLayerScope scope, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.unit.Density density) {
        kotlin.jvm.functions.Function0<kotlin.Unit> function0;
        int mutatedFields = scope.getMutatedFields() | this.mutatedFields;
        if ((mutatedFields & 4096) != 0) {
            long transformOrigin = scope.getTransformOrigin();
            this.mTransformOrigin = transformOrigin;
            setPivotX(androidx.compose.ui.graphics.TransformOrigin.m2507getPivotFractionXimpl(transformOrigin) * getWidth());
            setPivotY(androidx.compose.ui.graphics.TransformOrigin.m2508getPivotFractionYimpl(this.mTransformOrigin) * getHeight());
        }
        if ((mutatedFields & 1) != 0) {
            setScaleX(scope.getScaleX());
        }
        if ((mutatedFields & 2) != 0) {
            setScaleY(scope.getScaleY());
        }
        if ((mutatedFields & 4) != 0) {
            setAlpha(scope.getAlpha());
        }
        if ((mutatedFields & 8) != 0) {
            setTranslationX(scope.getTranslationX());
        }
        if ((mutatedFields & 16) != 0) {
            setTranslationY(scope.getTranslationY());
        }
        if ((mutatedFields & 32) != 0) {
            setElevation(scope.getShadowElevation());
        }
        if ((mutatedFields & 1024) != 0) {
            setRotation(scope.getRotationZ());
        }
        if ((mutatedFields & 256) != 0) {
            setRotationX(scope.getRotationX());
        }
        if ((mutatedFields & 512) != 0) {
            setRotationY(scope.getRotationY());
        }
        if ((mutatedFields & 2048) != 0) {
            setCameraDistancePx(scope.getCameraDistance());
        }
        boolean z = false;
        boolean z2 = getManualClipPath() != null;
        boolean z3 = scope.getClip() && scope.getShape() != androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape();
        if ((mutatedFields & 24576) != 0) {
            this.clipToBounds = scope.getClip() && scope.getShape() == androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape();
            resetClipBounds();
            setClipToOutline(z3);
        }
        boolean update = this.outlineResolver.update(scope.getShape(), scope.getAlpha(), z3, scope.getShadowElevation(), layoutDirection, density);
        if (this.outlineResolver.getCacheIsDirty()) {
            updateOutlineResolver();
        }
        boolean z4 = getManualClipPath() != null;
        if (z2 != z4 || (z4 && update)) {
            invalidate();
        }
        if (!this.drawnWithZ && getElevation() > 0.0f && (function0 = this.invalidateParentLayer) != null) {
            function0.invoke();
        }
        if ((mutatedFields & androidx.compose.ui.graphics.Fields.MatrixAffectingFields) != 0) {
            this.matrixCache.invalidate();
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            if ((mutatedFields & 64) != 0) {
                androidx.compose.ui.platform.ViewLayerVerificationHelper28.INSTANCE.setOutlineAmbientShadowColor(this, androidx.compose.ui.graphics.ColorKt.m2167toArgb8_81llA(scope.getAmbientShadowColor()));
            }
            if ((mutatedFields & 128) != 0) {
                androidx.compose.ui.platform.ViewLayerVerificationHelper28.INSTANCE.setOutlineSpotShadowColor(this, androidx.compose.ui.graphics.ColorKt.m2167toArgb8_81llA(scope.getSpotShadowColor()));
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 31 && (131072 & mutatedFields) != 0) {
            androidx.compose.ui.platform.ViewLayerVerificationHelper31.INSTANCE.setRenderEffect(this, scope.getRenderEffect());
        }
        if ((mutatedFields & 32768) != 0) {
            int compositingStrategy = scope.getCompositingStrategy();
            if (androidx.compose.ui.graphics.CompositingStrategy.m2199equalsimpl0(compositingStrategy, androidx.compose.ui.graphics.CompositingStrategy.INSTANCE.m2205getOffscreenNrFUSI())) {
                setLayerType(2, null);
            } else if (androidx.compose.ui.graphics.CompositingStrategy.m2199equalsimpl0(compositingStrategy, androidx.compose.ui.graphics.CompositingStrategy.INSTANCE.m2204getModulateAlphaNrFUSI())) {
                setLayerType(0, null);
                this.mHasOverlappingRendering = z;
            } else {
                setLayerType(0, null);
            }
            z = true;
            this.mHasOverlappingRendering = z;
        }
        this.mutatedFields = scope.getMutatedFields();
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.mHasOverlappingRendering;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: isInLayer-k-4lQ0M */
    public boolean mo3661isInLayerk4lQ0M(long position) {
        float m1871getXimpl = androidx.compose.ui.geometry.Offset.m1871getXimpl(position);
        float m1872getYimpl = androidx.compose.ui.geometry.Offset.m1872getYimpl(position);
        if (this.clipToBounds) {
            return 0.0f <= m1871getXimpl && m1871getXimpl < ((float) getWidth()) && 0.0f <= m1872getYimpl && m1872getYimpl < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.outlineResolver.m3762isInOutlinek4lQ0M(position);
        }
        return true;
    }

    private final void updateOutlineResolver() {
        setOutlineProvider(this.outlineResolver.getOutline() != null ? OutlineProvider : null);
    }

    private final void resetClipBounds() {
        android.graphics.Rect rect;
        if (this.clipToBounds) {
            android.graphics.Rect rect2 = this.clipBoundsCache;
            if (rect2 == null) {
                this.clipBoundsCache = new android.graphics.Rect(0, 0, getWidth(), getHeight());
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNull(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.clipBoundsCache;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: resize-ozmzZPI */
    public void mo3664resizeozmzZPI(long size) {
        int m4652getWidthimpl = androidx.compose.ui.unit.IntSize.m4652getWidthimpl(size);
        int m4651getHeightimpl = androidx.compose.ui.unit.IntSize.m4651getHeightimpl(size);
        if (m4652getWidthimpl == getWidth() && m4651getHeightimpl == getHeight()) {
            return;
        }
        float f = m4652getWidthimpl;
        setPivotX(androidx.compose.ui.graphics.TransformOrigin.m2507getPivotFractionXimpl(this.mTransformOrigin) * f);
        float f2 = m4651getHeightimpl;
        setPivotY(androidx.compose.ui.graphics.TransformOrigin.m2508getPivotFractionYimpl(this.mTransformOrigin) * f2);
        this.outlineResolver.m3763updateuvyYCjk(androidx.compose.ui.geometry.SizeKt.Size(f, f2));
        updateOutlineResolver();
        layout(getLeft(), getTop(), getLeft() + m4652getWidthimpl, getTop() + m4651getHeightimpl);
        resetClipBounds();
        this.matrixCache.invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: move--gyyYBs */
    public void mo3663movegyyYBs(long position) {
        int m4610getXimpl = androidx.compose.ui.unit.IntOffset.m4610getXimpl(position);
        if (m4610getXimpl != getLeft()) {
            offsetLeftAndRight(m4610getXimpl - getLeft());
            this.matrixCache.invalidate();
        }
        int m4611getYimpl = androidx.compose.ui.unit.IntOffset.m4611getYimpl(position);
        if (m4611getYimpl != getTop()) {
            offsetTopAndBottom(m4611getYimpl - getTop());
            this.matrixCache.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void drawLayer(androidx.compose.ui.graphics.Canvas canvas) {
        boolean z = getElevation() > 0.0f;
        this.drawnWithZ = z;
        if (z) {
            canvas.enableZ();
        }
        this.container.drawChild$ui_release(canvas, this, getDrawingTime());
        if (this.drawnWithZ) {
            canvas.disableZ();
        }
    }

    @Override // android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
        boolean z;
        androidx.compose.ui.graphics.CanvasHolder canvasHolder = this.canvasHolder;
        android.graphics.Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
        androidx.compose.ui.graphics.AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z = false;
        } else {
            androidCanvas.save();
            this.outlineResolver.clipToOutline(androidCanvas);
            z = true;
        }
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.Canvas, kotlin.Unit> function1 = this.drawBlock;
        if (function1 != null) {
            function1.invoke(androidCanvas);
        }
        if (z) {
            androidCanvas.restore();
        }
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        setInvalidated(false);
    }

    @Override // android.view.View, androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.ownerView.invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        setInvalidated(false);
        this.ownerView.requestClearInvalidObservations();
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        boolean recycle$ui_release = this.ownerView.recycle$ui_release(this);
        if (android.os.Build.VERSION.SDK_INT >= 23 || shouldUseDispatchDraw || !recycle$ui_release) {
            this.container.removeViewInLayout(this);
        } else {
            setVisibility(8);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateDisplayList() {
        if (!this.isInvalidated || shouldUseDispatchDraw) {
            return;
        }
        INSTANCE.updateDisplayList(this);
        setInvalidated(false);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: mapOffset-8S9VItk */
    public long mo3662mapOffset8S9VItk(long point, boolean inverse) {
        if (inverse) {
            float[] m3739calculateInverseMatrixbWbORWo = this.matrixCache.m3739calculateInverseMatrixbWbORWo(this);
            return m3739calculateInverseMatrixbWbORWo != null ? androidx.compose.ui.graphics.Matrix.m2358mapMKHz9U(m3739calculateInverseMatrixbWbORWo, point) : androidx.compose.ui.geometry.Offset.INSTANCE.m1885getInfiniteF1C5BW0();
        }
        return androidx.compose.ui.graphics.Matrix.m2358mapMKHz9U(this.matrixCache.m3740calculateMatrixGrdbGEg(this), point);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void mapBounds(androidx.compose.ui.geometry.MutableRect rect, boolean inverse) {
        if (inverse) {
            float[] m3739calculateInverseMatrixbWbORWo = this.matrixCache.m3739calculateInverseMatrixbWbORWo(this);
            if (m3739calculateInverseMatrixbWbORWo != null) {
                androidx.compose.ui.graphics.Matrix.m2360mapimpl(m3739calculateInverseMatrixbWbORWo, rect);
                return;
            } else {
                rect.set(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            }
        }
        androidx.compose.ui.graphics.Matrix.m2360mapimpl(this.matrixCache.m3740calculateMatrixGrdbGEg(this), rect);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void reuseLayer(kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.Canvas, kotlin.Unit> drawBlock, kotlin.jvm.functions.Function0<kotlin.Unit> invalidateParentLayer) {
        if (android.os.Build.VERSION.SDK_INT >= 23 || shouldUseDispatchDraw) {
            this.container.addView(this);
        } else {
            setVisibility(0);
        }
        this.clipToBounds = false;
        this.drawnWithZ = false;
        this.mTransformOrigin = androidx.compose.ui.graphics.TransformOrigin.INSTANCE.m2512getCenterSzJe1aQ();
        this.drawBlock = drawBlock;
        this.invalidateParentLayer = invalidateParentLayer;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: transform-58bKbWc */
    public void mo3665transform58bKbWc(float[] matrix) {
        androidx.compose.ui.graphics.Matrix.m2369timesAssign58bKbWc(matrix, this.matrixCache.m3740calculateMatrixGrdbGEg(this));
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: inverseTransform-58bKbWc */
    public void mo3660inverseTransform58bKbWc(float[] matrix) {
        float[] m3739calculateInverseMatrixbWbORWo = this.matrixCache.m3739calculateInverseMatrixbWbORWo(this);
        if (m3739calculateInverseMatrixbWbORWo != null) {
            androidx.compose.ui.graphics.Matrix.m2369timesAssign58bKbWc(matrix, m3739calculateInverseMatrixbWbORWo);
        }
    }

    /* compiled from: ViewLayer.android.kt */
    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\tH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer$Companion;", "", "()V", "OutlineProvider", "Landroid/view/ViewOutlineProvider;", "getOutlineProvider", "()Landroid/view/ViewOutlineProvider;", "getMatrix", "Lkotlin/Function2;", "Landroid/view/View;", "Landroid/graphics/Matrix;", "", "<set-?>", "", "hasRetrievedMethod", "getHasRetrievedMethod", "()Z", "recreateDisplayList", "Ljava/lang/reflect/Field;", "shouldUseDispatchDraw", "getShouldUseDispatchDraw", "setShouldUseDispatchDraw$ui_release", "(Z)V", "updateDisplayListIfDirtyMethod", "Ljava/lang/reflect/Method;", "updateDisplayList", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final android.view.ViewOutlineProvider getOutlineProvider() {
            return androidx.compose.ui.platform.ViewLayer.OutlineProvider;
        }

        public final boolean getHasRetrievedMethod() {
            return androidx.compose.ui.platform.ViewLayer.hasRetrievedMethod;
        }

        public final boolean getShouldUseDispatchDraw() {
            return androidx.compose.ui.platform.ViewLayer.shouldUseDispatchDraw;
        }

        public final void setShouldUseDispatchDraw$ui_release(boolean z) {
            androidx.compose.ui.platform.ViewLayer.shouldUseDispatchDraw = z;
        }

        public final void updateDisplayList(android.view.View view) {
            try {
                if (!getHasRetrievedMethod()) {
                    androidx.compose.ui.platform.ViewLayer.hasRetrievedMethod = true;
                    if (android.os.Build.VERSION.SDK_INT < 28) {
                        androidx.compose.ui.platform.ViewLayer.updateDisplayListIfDirtyMethod = android.view.View.class.getDeclaredMethod("updateDisplayListIfDirty", new java.lang.Class[0]);
                        androidx.compose.ui.platform.ViewLayer.recreateDisplayList = android.view.View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        androidx.compose.ui.platform.ViewLayer.updateDisplayListIfDirtyMethod = (java.lang.reflect.Method) java.lang.Class.class.getDeclaredMethod("getDeclaredMethod", java.lang.String.class, new java.lang.Class[0].getClass()).invoke(android.view.View.class, "updateDisplayListIfDirty", new java.lang.Class[0]);
                        androidx.compose.ui.platform.ViewLayer.recreateDisplayList = (java.lang.reflect.Field) java.lang.Class.class.getDeclaredMethod("getDeclaredField", java.lang.String.class).invoke(android.view.View.class, "mRecreateDisplayList");
                    }
                    java.lang.reflect.Method method = androidx.compose.ui.platform.ViewLayer.updateDisplayListIfDirtyMethod;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    java.lang.reflect.Field field = androidx.compose.ui.platform.ViewLayer.recreateDisplayList;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                java.lang.reflect.Field field2 = androidx.compose.ui.platform.ViewLayer.recreateDisplayList;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                java.lang.reflect.Method method2 = androidx.compose.ui.platform.ViewLayer.updateDisplayListIfDirtyMethod;
                if (method2 != null) {
                    method2.invoke(view, new java.lang.Object[0]);
                }
            } catch (java.lang.Throwable unused) {
                setShouldUseDispatchDraw$ui_release(true);
            }
        }
    }
}
