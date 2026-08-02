package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\b\u0000\u0018\u0000 \u008d\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u008e\u0001\u008d\u0001BK\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012$\u0010\r\u001a \u0012\t\u0012\u00070\t¢\u0006\u0002\b\n\u0012\u000b\u0012\t\u0018\u00010\u000b¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\f0\b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010 \u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010\"J\u0017\u0010(\u001a\u00020\f2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010+\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010'J!\u0010.\u001a\u00020\f2\u0006\u0010,\u001a\u00020\t2\b\u0010-\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\f2\u0006\u0010,\u001a\u000200H\u0014¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\fH\u0016¢\u0006\u0004\b3\u0010\"J7\u0010:\u001a\u00020\f2\u0006\u00104\u001a\u00020\u00192\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u0002052\u0006\u00108\u001a\u0002052\u0006\u00109\u001a\u000205H\u0014¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\fH\u0016¢\u0006\u0004\b<\u0010\"J\u000f\u0010=\u001a\u00020\fH\u0016¢\u0006\u0004\b=\u0010\"J\u000f\u0010>\u001a\u00020\fH\u0016¢\u0006\u0004\b>\u0010\"J\u001f\u0010C\u001a\u00020\u001c2\u0006\u0010?\u001a\u00020\u001c2\u0006\u0010@\u001a\u00020\u0019H\u0016¢\u0006\u0004\bA\u0010BJ\u001f\u0010F\u001a\u00020\f2\u0006\u0010E\u001a\u00020D2\u0006\u0010@\u001a\u00020\u0019H\u0016¢\u0006\u0004\bF\u0010GJC\u0010H\u001a\u00020\f2$\u0010\r\u001a \u0012\t\u0012\u00070\t¢\u0006\u0002\b\n\u0012\u000b\u0012\t\u0018\u00010\u000b¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\f0\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010N\u001a\u00020\f2\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bL\u0010MJ\u0017\u0010P\u001a\u00020\f2\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bO\u0010MR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010Q\u001a\u0004\bR\u0010SR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010T\u001a\u0004\bU\u0010VR6\u0010Y\u001a\"\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n\u0012\u000b\u0012\t\u0018\u00010\u000b¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\f\u0018\u00010\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u0017\u001a\u00020\\8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010a\u001a\u00020\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0018\u0010#\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010cR\u0016\u0010f\u001a\u0004\u0018\u00010d8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bY\u0010eR*\u0010h\u001a\u00020\u00192\u0006\u0010g\u001a\u00020\u00198\u0007@CX\u0087\u000e¢\u0006\u0012\n\u0004\bh\u0010`\u001a\u0004\bh\u0010\u001b\"\u0004\bi\u0010jR\u0018\u0010_\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010k\u001a\u00020\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bf\u0010`R\u0014\u0010W\u001a\u00020m8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\ba\u0010nR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00010o8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010t\u001a\u00020J8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR\"\u0010v\u001a\u00020u8\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R\"\u0010|\u001a\u00020\u00198\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b|\u0010`\u001a\u0004\b|\u0010\u001b\"\u0004\b}\u0010jR\u0017\u0010]\u001a\u00020~8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0017\u0010\u007f\u001a\u00020\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010`R \u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0017X\u0097\u0004¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0080\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0082\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0085\u0001R'\u0010\u008a\u0001\u001a\u00020u2\u0006\u0010g\u001a\u00020u8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0088\u0001\u0010y\"\u0005\b\u0089\u0001\u0010{R\u0019\u0010\u008b\u0001\u001a\u0002058\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer;", "Landroid/view/View;", "Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/layout/GraphicLayerInfo;", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Landroidx/compose/ui/platform/DrawChildContainer;", "container", "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/ParameterName;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/ui/platform/DrawChildContainer;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "updateLayerProperties", "(Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;)V", "Landroidx/compose/ui/graphics/Paint;", "getHighSpeedVideoFpsRanges", "()Landroidx/compose/ui/graphics/Paint;", "", "hasOverlappingRendering", "()Z", "Landroidx/compose/ui/geometry/Offset;", com.daon.sdk.face.license.License.FEATURE_POSITION, "isInLayer-k-4lQ0M", "(J)Z", "isInLayer", "getHighSpeedVideoFpsRangesFor", "()V", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/unit/IntSize;", io.ktor.http.ContentDisposition.Parameters.Size, "resize-ozmzZPI", "(J)V", "resize", "Landroidx/compose/ui/unit/IntOffset;", "move--gyyYBs", "move", "canvas", "parentLayer", "drawLayer", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroid/graphics/Canvas;", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "invalidate", "changed", "", "l", "t", "r", util.h.xy.cb.b.f1091, "onLayout", "(ZIIII)V", "destroy", "updateDisplayList", "forceLayout", "point", "inverse", "mapOffset-8S9VItk", "(JZ)J", "mapOffset", "Landroidx/compose/ui/geometry/MutableRect;", "rect", "mapBounds", "(Landroidx/compose/ui/geometry/MutableRect;Z)V", "reuseLayer", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "transform-58bKbWc", "([F)V", "transform", "inverseTransform-58bKbWc", "inverseTransform", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "Landroidx/compose/ui/platform/DrawChildContainer;", "getContainer", "()Landroidx/compose/ui/platform/DrawChildContainer;", "getOutputFormats", "Lkotlin/jvm/functions/Function2;", "getHighSpeedVideoSizes", "getInputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function0;", "Landroidx/compose/ui/platform/OutlineResolver;", "getOutputStallDurationlomOqCM", "Landroidx/compose/ui/platform/OutlineResolver;", "getHighSpeedVideoSizesFor", "Z", "Camera2StreamConfigurationMap", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "Landroidx/compose/ui/graphics/Path;", "()Landroidx/compose/ui/graphics/Path;", "getInputFormats", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "isInvalidated", "setInvalidated", "(Z)V", "getOutputMinFrameDuration", "Landroidx/compose/ui/graphics/Paint;", "Landroidx/compose/ui/graphics/CanvasHolder;", "Landroidx/compose/ui/graphics/CanvasHolder;", "Landroidx/compose/ui/platform/LayerMatrixCache;", "getOutputSizeshNQ4ISI", "Landroidx/compose/ui/platform/LayerMatrixCache;", "getUnderlyingMatrix-sQKQjiQ", "()[F", "underlyingMatrix", "", "frameRate", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getFrameRate", "()F", "setFrameRate", "(F)V", "isFrameRateFromParent", "setFrameRateFromParent", "Landroidx/compose/ui/graphics/TransformOrigin;", "getOutputMinFrameDurationlomOqCM", "J", "getOutputStallDuration", "", "layerId", "getLayerId", "()J", "getOwnerViewId", "ownerViewId", "getCameraDistancePx", "setCameraDistancePx", "cameraDistancePx", "getOutputSizes", com.visa.cbp.getEncExpo.warmup, "Companion", "UniqueDrawingIdApi29"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ViewLayer extends android.view.View implements androidx.compose.ui.node.OwnedLayer, androidx.compose.ui.layout.GraphicLayerInfo {
    private static java.lang.reflect.Method getHighSpeedVideoFpsRanges;
    private static java.lang.reflect.Field getHighSpeedVideoSizes;
    private static boolean hasRetrievedMethod;
    private static boolean shouldUseDispatchDraw;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.CanvasHolder getOutputFormats;
    private final androidx.compose.ui.platform.DrawChildContainer container;
    private float frameRate;
    private android.graphics.Rect getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private boolean Camera2StreamConfigurationMap;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private boolean getOutputMinFrameDuration;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function2<? super androidx.compose.ui.graphics.Canvas, ? super androidx.compose.ui.graphics.layer.GraphicsLayer, kotlin.Unit> getHighSpeedVideoSizes;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.Paint getHighSpeedVideoSizesFor;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private long getOutputStallDurationlomOqCM;
    private int getOutputSizes;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.platform.LayerMatrixCache<android.view.View> getInputSizeshNQ4ISI;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private boolean getOutputMinFrameDurationlomOqCM;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final androidx.compose.ui.platform.OutlineResolver getHighSpeedVideoFpsRanges;
    private boolean isFrameRateFromParent;
    private boolean isInvalidated;
    private final long layerId;
    private final androidx.compose.ui.platform.AndroidComposeView ownerView;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.platform.ViewLayer.Companion INSTANCE = new androidx.compose.ui.platform.ViewLayer.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.jvm.functions.Function2<android.view.View, android.graphics.Matrix, kotlin.Unit> getHighSpeedVideoFpsRangesFor = new kotlin.jvm.functions.Function2<android.view.View, android.graphics.Matrix, kotlin.Unit>() { // from class: androidx.compose.ui.platform.ViewLayer$Companion$getMatrix$1
        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ kotlin.Unit invoke(android.view.View view, android.graphics.Matrix matrix) {
            Camera2StreamConfigurationMap(view, matrix);
            return kotlin.Unit.INSTANCE;
        }

        public final void Camera2StreamConfigurationMap(android.view.View view, android.graphics.Matrix matrix) {
            matrix.set(view.getMatrix());
        }
    };
    private static final android.view.ViewOutlineProvider OutlineProvider = new android.view.ViewOutlineProvider() { // from class: androidx.compose.ui.platform.ViewLayer$Companion$OutlineProvider$1
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(android.view.View view, android.graphics.Outline outline) {
            androidx.compose.ui.platform.OutlineResolver outlineResolver;
            kotlin.jvm.internal.Intrinsics.checkNotNull(view, "");
            outlineResolver = ((androidx.compose.ui.platform.ViewLayer) view).getHighSpeedVideoFpsRanges;
            android.graphics.Outline androidOutline = outlineResolver.getAndroidOutline();
            kotlin.jvm.internal.Intrinsics.checkNotNull(androidOutline);
            outline.set(androidOutline);
        }
    };

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    protected final void onLayout(boolean changed, int l, int t, int r, int b) {
    }

    public final androidx.compose.ui.platform.AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    public final androidx.compose.ui.platform.DrawChildContainer getContainer() {
        return this.container;
    }

    public ViewLayer(androidx.compose.ui.platform.AndroidComposeView androidComposeView, androidx.compose.ui.platform.DrawChildContainer drawChildContainer, kotlin.jvm.functions.Function2<? super androidx.compose.ui.graphics.Canvas, ? super androidx.compose.ui.graphics.layer.GraphicsLayer, kotlin.Unit> function2, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        super(androidComposeView.getContext());
        this.ownerView = androidComposeView;
        this.container = drawChildContainer;
        this.getHighSpeedVideoSizes = function2;
        this.getHighSpeedVideoFpsRangesFor = function0;
        this.getHighSpeedVideoFpsRanges = new androidx.compose.ui.platform.OutlineResolver();
        this.getOutputFormats = new androidx.compose.ui.graphics.CanvasHolder();
        this.getInputSizeshNQ4ISI = new androidx.compose.ui.platform.LayerMatrixCache<>(getHighSpeedVideoFpsRangesFor);
        this.getOutputStallDurationlomOqCM = androidx.compose.ui.graphics.TransformOrigin.INSTANCE.m6378getCenterSzJe1aQ();
        this.getOutputMinFrameDurationlomOqCM = true;
        setWillNotDraw(false);
        drawChildContainer.addView(this);
        this.layerId = android.view.View.generateViewId();
    }

    private final androidx.compose.ui.graphics.Path getHighSpeedVideoSizes() {
        if (!getClipToOutline() || this.getHighSpeedVideoFpsRanges.getOutlineClipSupported()) {
            return null;
        }
        return this.getHighSpeedVideoFpsRanges.getClipPath();
    }

    /* renamed from: isInvalidated, reason: from getter */
    public final boolean getIsInvalidated() {
        return this.isInvalidated;
    }

    private final void setInvalidated(boolean z) {
        if (z != this.isInvalidated) {
            this.isInvalidated = z;
            this.ownerView.notifyLayerIsDirty$ui(this, z);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: getUnderlyingMatrix-sQKQjiQ */
    public final float[] mo7678getUnderlyingMatrixsQKQjiQ() {
        return this.getInputSizeshNQ4ISI.m7763calculateMatrixGrdbGEg(this);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final float getFrameRate() {
        return this.frameRate;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void setFrameRate(float f) {
        this.frameRate = f;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: isFrameRateFromParent, reason: from getter */
    public final boolean getIsFrameRateFromParent() {
        return this.isFrameRateFromParent;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void setFrameRateFromParent(boolean z) {
        this.isFrameRateFromParent = z;
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public final long getLayerId() {
        return this.layerId;
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public final long getOwnerViewId() {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return androidx.compose.ui.platform.ViewLayer.UniqueDrawingIdApi29.getHighSpeedVideoFpsRangesFor(this.ownerView);
        }
        return -1L;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer$UniqueDrawingIdApi29;", "", "<init>", "()V", "Landroid/view/View;", "p0", "", "getHighSpeedVideoFpsRangesFor", "(Landroid/view/View;)J"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class UniqueDrawingIdApi29 {
        public static final androidx.compose.ui.platform.ViewLayer.UniqueDrawingIdApi29 INSTANCE = new androidx.compose.ui.platform.ViewLayer.UniqueDrawingIdApi29();

        private UniqueDrawingIdApi29() {
        }

        @kotlin.jvm.JvmStatic
        public static final long getHighSpeedVideoFpsRangesFor(android.view.View p0) {
            return p0.getUniqueDrawingId();
        }
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * getResources().getDisplayMetrics().densityDpi);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void updateLayerProperties(androidx.compose.ui.graphics.ReusableGraphicsLayerScope scope) {
        int compositingStrategy;
        kotlin.jvm.functions.Function0<kotlin.Unit> function0;
        int mutatedFields = scope.getMutatedFields() | this.getOutputSizes;
        if ((mutatedFields & 4096) != 0) {
            long transformOrigin = scope.getTransformOrigin();
            this.getOutputStallDurationlomOqCM = transformOrigin;
            setPivotX(androidx.compose.ui.graphics.TransformOrigin.m6373getPivotFractionXimpl(transformOrigin) * getWidth());
            setPivotY(androidx.compose.ui.graphics.TransformOrigin.m6374getPivotFractionYimpl(this.getOutputStallDurationlomOqCM) * getHeight());
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
        boolean z = true;
        boolean z2 = getHighSpeedVideoSizes() != null;
        boolean z3 = scope.getClip() && scope.getShape() != androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape();
        if ((mutatedFields & 24576) != 0) {
            this.Camera2StreamConfigurationMap = scope.getClip() && scope.getShape() == androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape();
            getHighResolutionOutputSizeshNQ4ISI();
            setClipToOutline(z3);
        }
        boolean m7774updateS_szKao = this.getHighSpeedVideoFpsRanges.m7774updateS_szKao(scope.getOutline(), scope.getAlpha(), z3, scope.getShadowElevation(), scope.getSize());
        if (this.getHighSpeedVideoFpsRanges.getCacheIsDirty()) {
            getHighSpeedVideoFpsRangesFor();
        }
        boolean z4 = getHighSpeedVideoSizes() != null;
        if (z2 != z4 || (z4 && m7774updateS_szKao)) {
            invalidate();
        }
        if (!this.getOutputMinFrameDuration && getElevation() > 0.0f && (function0 = this.getHighSpeedVideoFpsRangesFor) != null) {
            function0.invoke();
        }
        if ((mutatedFields & androidx.compose.ui.graphics.Fields.MatrixAffectingFields) != 0) {
            this.getInputSizeshNQ4ISI.invalidate();
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            if ((mutatedFields & 64) != 0) {
                androidx.compose.ui.platform.ViewLayerVerificationHelper28 viewLayerVerificationHelper28 = androidx.compose.ui.platform.ViewLayerVerificationHelper28.INSTANCE;
                androidx.compose.ui.platform.ViewLayerVerificationHelper28.Camera2StreamConfigurationMap(this, androidx.compose.ui.graphics.ColorKt.m6049toArgb8_81llA(scope.getAmbientShadowColor()));
            }
            if ((mutatedFields & 128) != 0) {
                androidx.compose.ui.platform.ViewLayerVerificationHelper28 viewLayerVerificationHelper282 = androidx.compose.ui.platform.ViewLayerVerificationHelper28.INSTANCE;
                androidx.compose.ui.platform.ViewLayerVerificationHelper28.getHighSpeedVideoFpsRangesFor(this, androidx.compose.ui.graphics.ColorKt.m6049toArgb8_81llA(scope.getSpotShadowColor()));
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 31 && (131072 & mutatedFields) != 0) {
            androidx.compose.ui.platform.ViewLayerVerificationHelper31 viewLayerVerificationHelper31 = androidx.compose.ui.platform.ViewLayerVerificationHelper31.INSTANCE;
            androidx.compose.ui.platform.ViewLayerVerificationHelper31.getHighSpeedVideoSizes(this, scope.getRenderEffect());
        }
        boolean z5 = ((262144 & mutatedFields) == 0 && (524288 & mutatedFields) == 0) ? false : true;
        if ((mutatedFields & 32768) != 0 || z5) {
            if (z5) {
                compositingStrategy = androidx.compose.ui.graphics.CompositingStrategy.INSTANCE.m6082getOffscreenNrFUSI();
            } else {
                compositingStrategy = scope.getCompositingStrategy();
            }
            android.graphics.Paint paint = null;
            if (androidx.compose.ui.graphics.CompositingStrategy.m6076equalsimpl0(compositingStrategy, androidx.compose.ui.graphics.CompositingStrategy.INSTANCE.m6082getOffscreenNrFUSI())) {
                if (z5) {
                    androidx.compose.ui.graphics.Paint highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
                    highSpeedVideoFpsRanges.setColorFilter(scope.getColorFilter());
                    highSpeedVideoFpsRanges.mo5872setBlendModes9anfk8(scope.getBlendMode());
                    paint = highSpeedVideoFpsRanges.getGetHighSpeedVideoFpsRangesFor();
                }
                setLayerType(2, paint);
            } else if (androidx.compose.ui.graphics.CompositingStrategy.m6076equalsimpl0(compositingStrategy, androidx.compose.ui.graphics.CompositingStrategy.INSTANCE.m6081getModulateAlphaNrFUSI())) {
                setLayerType(0, null);
                z = false;
            } else {
                setLayerType(0, null);
            }
            this.getOutputMinFrameDurationlomOqCM = z;
        }
        this.getOutputSizes = scope.getMutatedFields();
    }

    private final androidx.compose.ui.graphics.Paint getHighSpeedVideoFpsRanges() {
        androidx.compose.ui.graphics.Paint paint = this.getHighSpeedVideoSizesFor;
        if (paint != null) {
            return paint;
        }
        androidx.compose.ui.graphics.Paint Paint = androidx.compose.ui.graphics.AndroidPaint_androidKt.Paint();
        this.getHighSpeedVideoSizesFor = Paint;
        return Paint;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        setOutlineProvider(this.getHighSpeedVideoFpsRanges.getAndroidOutline() != null ? OutlineProvider : null);
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        android.graphics.Rect rect;
        if (this.Camera2StreamConfigurationMap) {
            android.graphics.Rect rect2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (rect2 == null) {
                this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.Rect(0, 0, getWidth(), getHeight());
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNull(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.getHighResolutionOutputSizeshNQ4ISI;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: resize-ozmzZPI */
    public final void mo7683resizeozmzZPI(long size) {
        int i = (int) (size >> 32);
        int i2 = (int) (size & 4294967295L);
        if (i == getWidth() && i2 == getHeight()) {
            return;
        }
        setPivotX(androidx.compose.ui.graphics.TransformOrigin.m6373getPivotFractionXimpl(this.getOutputStallDurationlomOqCM) * i);
        setPivotY(androidx.compose.ui.graphics.TransformOrigin.m6374getPivotFractionYimpl(this.getOutputStallDurationlomOqCM) * i2);
        getHighSpeedVideoFpsRangesFor();
        layout(getLeft(), getTop(), getLeft() + i, getTop() + i2);
        getHighResolutionOutputSizeshNQ4ISI();
        this.getInputSizeshNQ4ISI.invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: move--gyyYBs */
    public final void mo7682movegyyYBs(long position) {
        int m8729getXimpl = androidx.compose.ui.unit.IntOffset.m8729getXimpl(position);
        if (m8729getXimpl != getLeft()) {
            offsetLeftAndRight(m8729getXimpl - getLeft());
            this.getInputSizeshNQ4ISI.invalidate();
        }
        int m8730getYimpl = androidx.compose.ui.unit.IntOffset.m8730getYimpl(position);
        if (m8730getYimpl != getTop()) {
            offsetTopAndBottom(m8730getYimpl - getTop());
            this.getInputSizeshNQ4ISI.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void drawLayer(androidx.compose.ui.graphics.Canvas canvas, androidx.compose.ui.graphics.layer.GraphicsLayer parentLayer) {
        boolean z = getElevation() > 0.0f;
        this.getOutputMinFrameDuration = z;
        if (z) {
            canvas.enableZ();
        }
        this.container.drawChild$ui(canvas, this, getDrawingTime());
        if (this.getOutputMinFrameDuration) {
            canvas.disableZ();
        }
    }

    @Override // android.view.View
    protected final void dispatchDraw(android.graphics.Canvas canvas) {
        boolean z;
        androidx.compose.ui.graphics.CanvasHolder canvasHolder = this.getOutputFormats;
        android.graphics.Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
        androidx.compose.ui.graphics.AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
        if (getHighSpeedVideoSizes() == null && canvas.isHardwareAccelerated()) {
            z = false;
        } else {
            androidCanvas.save();
            this.getHighSpeedVideoFpsRanges.clipToOutline(androidCanvas);
            z = true;
        }
        kotlin.jvm.functions.Function2<? super androidx.compose.ui.graphics.Canvas, ? super androidx.compose.ui.graphics.layer.GraphicsLayer, kotlin.Unit> function2 = this.getHighSpeedVideoSizes;
        if (function2 != null) {
            function2.invoke(androidCanvas, null);
        }
        if (z) {
            androidCanvas.restore();
        }
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        setInvalidated(false);
    }

    @Override // android.view.View, androidx.compose.ui.node.OwnedLayer
    public final void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.ownerView.invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void destroy() {
        setInvalidated(false);
        this.ownerView.requestClearInvalidObservations();
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.ownerView.recycle$ui(this);
        this.container.removeViewInLayout(this);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void updateDisplayList() {
        if (!this.isInvalidated || shouldUseDispatchDraw) {
            return;
        }
        INSTANCE.updateDisplayList(this);
        setInvalidated(false);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: mapOffset-8S9VItk */
    public final long mo7681mapOffset8S9VItk(long point, boolean inverse) {
        if (inverse) {
            return this.getInputSizeshNQ4ISI.m7765mapInverseR5De75A(this, point);
        }
        return this.getInputSizeshNQ4ISI.m7764mapR5De75A(this, point);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void mapBounds(androidx.compose.ui.geometry.MutableRect rect, boolean inverse) {
        if (inverse) {
            this.getInputSizeshNQ4ISI.mapInverse(this, rect);
        } else {
            this.getInputSizeshNQ4ISI.map(this, rect);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void reuseLayer(kotlin.jvm.functions.Function2<? super androidx.compose.ui.graphics.Canvas, ? super androidx.compose.ui.graphics.layer.GraphicsLayer, kotlin.Unit> drawBlock, kotlin.jvm.functions.Function0<kotlin.Unit> invalidateParentLayer) {
        this.container.addView(this);
        this.getInputSizeshNQ4ISI.reset();
        this.Camera2StreamConfigurationMap = false;
        this.getOutputMinFrameDuration = false;
        this.getOutputStallDurationlomOqCM = androidx.compose.ui.graphics.TransformOrigin.INSTANCE.m6378getCenterSzJe1aQ();
        this.getHighSpeedVideoSizes = drawBlock;
        this.getHighSpeedVideoFpsRangesFor = invalidateParentLayer;
        setInvalidated(false);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: transform-58bKbWc */
    public final void mo7684transform58bKbWc(float[] matrix) {
        androidx.compose.ui.graphics.Matrix.m6242timesAssign58bKbWc(matrix, this.getInputSizeshNQ4ISI.m7763calculateMatrixGrdbGEg(this));
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: inverseTransform-58bKbWc */
    public final void mo7679inverseTransform58bKbWc(float[] matrix) {
        float[] m7762calculateInverseMatrixbWbORWo = this.getInputSizeshNQ4ISI.m7762calculateInverseMatrixbWbORWo(this);
        if (m7762calculateInverseMatrixbWbORWo != null) {
            androidx.compose.ui.graphics.Matrix.m6242timesAssign58bKbWc(matrix, m7762calculateInverseMatrixbWbORWo);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR&\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u000e8\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0017R$\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR*\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00188\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\""}, d2 = {"Landroidx/compose/ui/platform/ViewLayer$Companion;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "updateDisplayList", "(Landroid/view/View;)V", "Lkotlin/Function2;", "Landroid/graphics/Matrix;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function2;", "getHighSpeedVideoSizes", "Landroid/view/ViewOutlineProvider;", "OutlineProvider", "Landroid/view/ViewOutlineProvider;", "getOutlineProvider", "()Landroid/view/ViewOutlineProvider;", "Ljava/lang/reflect/Method;", "getHighSpeedVideoFpsRanges", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Field;", "Ljava/lang/reflect/Field;", "", "p0", "hasRetrievedMethod", "Z", "getHasRetrievedMethod", "()Z", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "shouldUseDispatchDraw", "getShouldUseDispatchDraw", "setShouldUseDispatchDraw$ui", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
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

        public final void setShouldUseDispatchDraw$ui(boolean z) {
            androidx.compose.ui.platform.ViewLayer.shouldUseDispatchDraw = z;
        }

        public final void updateDisplayList(android.view.View view) {
            try {
                if (!getHasRetrievedMethod()) {
                    androidx.compose.ui.platform.ViewLayer.hasRetrievedMethod = true;
                    if (android.os.Build.VERSION.SDK_INT < 28) {
                        androidx.compose.ui.platform.ViewLayer.getHighSpeedVideoFpsRanges = android.view.View.class.getDeclaredMethod("updateDisplayListIfDirty", new java.lang.Class[0]);
                        androidx.compose.ui.platform.ViewLayer.getHighSpeedVideoSizes = android.view.View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        androidx.compose.ui.platform.ViewLayer.getHighSpeedVideoFpsRanges = (java.lang.reflect.Method) java.lang.Class.class.getDeclaredMethod("getDeclaredMethod", java.lang.String.class, new java.lang.Class[0].getClass()).invoke(android.view.View.class, "updateDisplayListIfDirty", new java.lang.Class[0]);
                        androidx.compose.ui.platform.ViewLayer.getHighSpeedVideoSizes = (java.lang.reflect.Field) java.lang.Class.class.getDeclaredMethod("getDeclaredField", java.lang.String.class).invoke(android.view.View.class, "mRecreateDisplayList");
                    }
                    java.lang.reflect.Method method = androidx.compose.ui.platform.ViewLayer.getHighSpeedVideoFpsRanges;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    java.lang.reflect.Field field = androidx.compose.ui.platform.ViewLayer.getHighSpeedVideoSizes;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                java.lang.reflect.Field field2 = androidx.compose.ui.platform.ViewLayer.getHighSpeedVideoSizes;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                java.lang.reflect.Method method2 = androidx.compose.ui.platform.ViewLayer.getHighSpeedVideoFpsRanges;
                if (method2 != null) {
                    method2.invoke(view, new java.lang.Object[0]);
                }
            } catch (java.lang.Throwable unused) {
                setShouldUseDispatchDraw$ui(true);
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: isInLayer-k-4lQ0M */
    public final boolean mo7680isInLayerk4lQ0M(long position) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (position >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (4294967295L & position));
        if (this.Camera2StreamConfigurationMap) {
            return 0.0f <= intBitsToFloat && intBitsToFloat < ((float) getWidth()) && 0.0f <= intBitsToFloat2 && intBitsToFloat2 < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.getHighSpeedVideoFpsRanges.m7773isInOutlinek4lQ0M(position);
        }
        return true;
    }
}
