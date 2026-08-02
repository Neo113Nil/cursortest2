package androidx.compose.ui.graphics.layer;

@kotlin.Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u0092\u00012\u00020\u0001:\u0002\u0092\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u001a\u001a\u00020\u0014H\u0002J\u0017\u0010#\u001a\u00020$2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b%\u0010!J\b\u0010*\u001a\u00020\u0018H\u0002J\b\u0010+\u001a\u00020$H\u0002J\b\u0010g\u001a\u00020$H\u0002J'\u0010n\u001a\u00020$2\u0006\u0010o\u001a\u00020p2\u0006\u0010q\u001a\u00020p2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¢\u0006\u0004\br\u0010sJ!\u0010t\u001a\u00020$2\b\u0010u\u001a\u0004\u0018\u00010v2\u0006\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\bw\u0010xJA\u0010}\u001a\u00020$2\u0006\u0010~\u001a\u00020\u007f2\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\b\u0010\u0082\u0001\u001a\u00030\u0083\u00012\u001b\u0010\u0084\u0001\u001a\u0016\u0012\u0005\u0012\u00030\u0086\u0001\u0012\u0004\u0012\u00020$0\u0085\u0001¢\u0006\u0003\b\u0087\u0001H\u0016J\u0013\u0010\u0088\u0001\u001a\u00020$2\b\u0010\u0089\u0001\u001a\u00030\u008a\u0001H\u0016J\t\u0010\u008b\u0001\u001a\u00020\u0016H\u0016J\t\u0010\u008c\u0001\u001a\u00020$H\u0016J\u0011\u0010\u008f\u0001\u001a\u00020$2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u000f\u0010\u0090\u0001\u001a\u00020$H\u0000¢\u0006\u0003\b\u0091\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R&\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c@VX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R&\u0010'\u001a\u00020&2\u0006\u0010\u001b\u001a\u00020&@VX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b(\u0010\u001f\"\u0004\b)\u0010!R(\u0010-\u001a\u0004\u0018\u00010,2\b\u0010\u001b\u001a\u0004\u0018\u00010,@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00103\u001a\u0002022\u0006\u0010\u001b\u001a\u000202@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u000e\u00108\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010:\u001a\u0002092\u0006\u0010\u001b\u001a\u000209@VX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b;\u0010\r\"\u0004\b<\u0010=R$\u0010>\u001a\u0002022\u0006\u0010\u001b\u001a\u000202@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u00105\"\u0004\b@\u00107R$\u0010A\u001a\u0002022\u0006\u0010\u001b\u001a\u000202@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u00105\"\u0004\bC\u00107R$\u0010D\u001a\u0002022\u0006\u0010\u001b\u001a\u000202@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u00105\"\u0004\bF\u00107R$\u0010G\u001a\u0002022\u0006\u0010\u001b\u001a\u000202@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u00105\"\u0004\bI\u00107R$\u0010J\u001a\u0002022\u0006\u0010\u001b\u001a\u000202@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u00105\"\u0004\bL\u00107R&\u0010N\u001a\u00020M2\u0006\u0010\u001b\u001a\u00020M@VX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\bO\u0010\r\"\u0004\bP\u0010=R&\u0010Q\u001a\u00020M2\u0006\u0010\u001b\u001a\u00020M@VX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\bR\u0010\r\"\u0004\bS\u0010=R$\u0010T\u001a\u0002022\u0006\u0010\u001b\u001a\u000202@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u00105\"\u0004\bV\u00107R$\u0010W\u001a\u0002022\u0006\u0010\u001b\u001a\u000202@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u00105\"\u0004\bY\u00107R$\u0010Z\u001a\u0002022\u0006\u0010\u001b\u001a\u000202@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u00105\"\u0004\b\\\u00107R$\u0010]\u001a\u0002022\u0006\u0010\u001b\u001a\u000202@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u00105\"\u0004\b_\u00107R$\u0010`\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0018@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u000e\u0010e\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010f\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010h\u001a\u0004\u0018\u00010iX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u001a\u0010y\u001a\u00020\u0018X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010b\"\u0004\bz\u0010dR\u0014\u0010{\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b|\u0010bR\u0016\u0010\u008d\u0001\u001a\u00020\u0005X\u0096D¢\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010\r¨\u0006\u0093\u0001"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayerV23;", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "ownerView", "Landroid/view/View;", "ownerId", "", "canvasHolder", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasDrawScope", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "<init>", "(Landroid/view/View;JLandroidx/compose/ui/graphics/CanvasHolder;Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;)V", "getOwnerId", "()J", "renderNode", "Landroid/view/RenderNode;", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/compose/ui/unit/IntSize;", "J", "layerPaint", "Landroid/graphics/Paint;", "matrix", "Landroid/graphics/Matrix;", "outlineIsProvided", "", "outlineSize", "obtainLayerPaint", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/compose/ui/graphics/layer/CompositingStrategy;", "compositingStrategy", "getCompositingStrategy-ke2Ky5w", "()I", "setCompositingStrategy-Wpw9cng", "(I)V", com.visa.cbp.getEncExpo.warmup, "applyCompositingStrategy", "", "applyCompositingStrategy-Wpw9cng", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "getBlendMode-0nO6VwU", "setBlendMode-s9anfk8", "requiresCompositingLayer", "updateLayerProperties", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "", "alpha", "getAlpha", "()F", "setAlpha", "(F)V", "shouldManuallySetCenterPivot", "Landroidx/compose/ui/geometry/Offset;", "pivotOffset", "getPivotOffset-F1C5BW0", "setPivotOffset-k-4lQ0M", "(J)V", "scaleX", "getScaleX", "setScaleX", "scaleY", "getScaleY", "setScaleY", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "shadowElevation", "getShadowElevation", "setShadowElevation", "Landroidx/compose/ui/graphics/Color;", "ambientShadowColor", "getAmbientShadowColor-0d7_KjU", "setAmbientShadowColor-8_81llA", "spotShadowColor", "getSpotShadowColor-0d7_KjU", "setSpotShadowColor-8_81llA", "rotationX", "getRotationX", "setRotationX", "rotationY", "getRotationY", "setRotationY", "rotationZ", "getRotationZ", "setRotationZ", "cameraDistance", "getCameraDistance", "setCameraDistance", "clip", "getClip", "()Z", "setClip", "(Z)V", "clipToBounds", "clipToOutline", "applyClip", "renderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "setPosition", "x", "", "y", "setPosition-H0pRuoY", "(IIJ)V", "setOutline", "outline", "Landroid/graphics/Outline;", "setOutline-O0kMr_c", "(Landroid/graphics/Outline;J)V", "isInvalidated", "setInvalidated", "hasDisplayList", "getHasDisplayList", "record", "density", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "layer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "draw", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "calculateMatrix", "discardDisplayList", "layerId", "getLayerId", "verifyShadowColorProperties", "discardDisplayListInternal", "discardDisplayListInternal$ui_graphics", "Companion", "ui-graphics"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GraphicsLayerV23 implements androidx.compose.ui.graphics.layer.GraphicsLayerImpl {
    private static boolean testFailCreateRenderNode;
    private float ArtificialStackFrames;
    private int Camera2StreamConfigurationMap;
    private float CoroutineDebuggingKt;
    private long _BOUNDARY;
    private float _CREATION;

    /* renamed from: a, reason: collision with root package name */
    private float f2685a;
    private androidx.compose.ui.graphics.RenderEffect accessartificialFrame;
    private float b;
    private float coroutineBoundary;
    private final android.view.RenderNode coroutineCreation;
    private long d;
    private boolean getARTIFICIAL_FRAME_PACKAGE_NAME;
    private float getHighResolutionOutputSizeshNQ4ISI;
    private long getHighSpeedVideoFpsRangesFor;
    private float getHighSpeedVideoSizes;
    private final androidx.compose.ui.graphics.CanvasHolder getHighSpeedVideoSizesFor;
    private final androidx.compose.ui.graphics.drawscope.CanvasDrawScope getInputFormats;
    private boolean getInputSizeshNQ4ISI;
    private boolean getOutputFormats;
    private boolean getOutputMinFrameDuration;
    private androidx.compose.ui.graphics.ColorFilter getOutputMinFrameDurationlomOqCM;
    private int getOutputSizes;
    private final long getOutputSizeshNQ4ISI;
    private android.graphics.Paint getOutputStallDuration;
    private boolean getOutputStallDurationlomOqCM;
    private long getValidOutputFormatsForInputhNQ4ISI;
    private float init;
    private boolean isOutputSupportedFor;
    private android.graphics.Matrix isOutputSupportedForhNQ4ISI;
    private float kernelVersion;
    private final long toString;
    private long unwrapAs;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.graphics.layer.GraphicsLayerV23.Companion INSTANCE = new androidx.compose.ui.graphics.layer.GraphicsLayerV23.Companion(null);
    public static final int $stable = 8;
    private static final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicBoolean(true);

    public GraphicsLayerV23(android.view.View view, long j, androidx.compose.ui.graphics.CanvasHolder canvasHolder, androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope) {
        this.toString = j;
        this.getHighSpeedVideoSizesFor = canvasHolder;
        this.getInputFormats = canvasDrawScope;
        android.view.RenderNode create = android.view.RenderNode.create("Compose", view);
        this.coroutineCreation = create;
        this._BOUNDARY = androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g();
        this.unwrapAs = androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g();
        if (getHighSpeedVideoFpsRanges.getAndSet(false)) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            Camera2StreamConfigurationMap(create);
            discardDisplayListInternal$ui_graphics();
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        if (testFailCreateRenderNode) {
            throw new java.lang.NoClassDefFoundError();
        }
        create.setClipToBounds(false);
        Camera2StreamConfigurationMap(androidx.compose.ui.graphics.layer.CompositingStrategy.INSTANCE.m6611getAutoke2Ky5w());
        this.getOutputSizes = androidx.compose.ui.graphics.layer.CompositingStrategy.INSTANCE.m6611getAutoke2Ky5w();
        this.Camera2StreamConfigurationMap = androidx.compose.ui.graphics.BlendMode.INSTANCE.m5937getSrcOver0nO6VwU();
        this.getHighSpeedVideoSizes = 1.0f;
        this.getValidOutputFormatsForInputhNQ4ISI = androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
        this.b = 1.0f;
        this._CREATION = 1.0f;
        this.getHighSpeedVideoFpsRangesFor = androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU();
        this.d = androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU();
        this.getHighResolutionOutputSizeshNQ4ISI = 8.0f;
        this.getOutputStallDurationlomOqCM = true;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final long getOwnerId() {
        return this.toString;
    }

    public /* synthetic */ GraphicsLayerV23(android.view.View view, long j, androidx.compose.ui.graphics.CanvasHolder canvasHolder, androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(view, j, (i & 4) != 0 ? new androidx.compose.ui.graphics.CanvasHolder() : canvasHolder, (i & 8) != 0 ? new androidx.compose.ui.graphics.drawscope.CanvasDrawScope() : canvasDrawScope);
    }

    private final android.graphics.Paint Camera2StreamConfigurationMap() {
        android.graphics.Paint paint = this.getOutputStallDuration;
        if (paint != null) {
            return paint;
        }
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.getOutputStallDuration = paint2;
        return paint2;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getCompositingStrategy-ke2Ky5w, reason: from getter */
    public final int getCompositingStrategy() {
        return this.getOutputSizes;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setCompositingStrategy-Wpw9cng */
    public final void mo6640setCompositingStrategyWpw9cng(int i) {
        this.getOutputSizes = i;
        getHighResolutionOutputSizeshNQ4ISI();
    }

    private final void Camera2StreamConfigurationMap(int i) {
        android.view.RenderNode renderNode = this.coroutineCreation;
        if (androidx.compose.ui.graphics.layer.CompositingStrategy.m6607equalsimpl0(i, androidx.compose.ui.graphics.layer.CompositingStrategy.INSTANCE.m6613getOffscreenke2Ky5w())) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.getOutputStallDuration);
            renderNode.setHasOverlappingRendering(true);
        } else if (androidx.compose.ui.graphics.layer.CompositingStrategy.m6607equalsimpl0(i, androidx.compose.ui.graphics.layer.CompositingStrategy.INSTANCE.m6612getModulateAlphake2Ky5w())) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.getOutputStallDuration);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.getOutputStallDuration);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getBlendMode-0nO6VwU, reason: from getter */
    public final int getBlendMode() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setBlendMode-s9anfk8 */
    public final void mo6639setBlendModes9anfk8(int i) {
        if (androidx.compose.ui.graphics.BlendMode.m5906equalsimpl0(this.Camera2StreamConfigurationMap, i)) {
            return;
        }
        this.Camera2StreamConfigurationMap = i;
        Camera2StreamConfigurationMap().setXfermode(new android.graphics.PorterDuffXfermode(androidx.compose.ui.graphics.AndroidBlendMode_androidKt.m5845toPorterDuffModes9anfk8(i)));
        getHighResolutionOutputSizeshNQ4ISI();
    }

    private final boolean getHighSpeedVideoFpsRanges() {
        return (!androidx.compose.ui.graphics.layer.CompositingStrategy.m6607equalsimpl0(getCompositingStrategy(), androidx.compose.ui.graphics.layer.CompositingStrategy.INSTANCE.m6613getOffscreenke2Ky5w()) && androidx.compose.ui.graphics.BlendMode.m5906equalsimpl0(getBlendMode(), androidx.compose.ui.graphics.BlendMode.INSTANCE.m5937getSrcOver0nO6VwU()) && getColorFilter() == null) ? false : true;
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        if (getHighSpeedVideoFpsRanges()) {
            Camera2StreamConfigurationMap(androidx.compose.ui.graphics.layer.CompositingStrategy.INSTANCE.m6613getOffscreenke2Ky5w());
        } else {
            Camera2StreamConfigurationMap(getCompositingStrategy());
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final androidx.compose.ui.graphics.ColorFilter getColorFilter() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setColorFilter(androidx.compose.ui.graphics.ColorFilter colorFilter) {
        this.getOutputMinFrameDurationlomOqCM = colorFilter;
        if (colorFilter != null) {
            Camera2StreamConfigurationMap(androidx.compose.ui.graphics.layer.CompositingStrategy.INSTANCE.m6613getOffscreenke2Ky5w());
            android.view.RenderNode renderNode = this.coroutineCreation;
            android.graphics.Paint Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
            Camera2StreamConfigurationMap.setColorFilter(androidx.compose.ui.graphics.AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter));
            renderNode.setLayerPaint(Camera2StreamConfigurationMap);
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getAlpha() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setAlpha(float f) {
        this.getHighSpeedVideoSizes = f;
        this.coroutineCreation.setAlpha(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getPivotOffset-F1C5BW0, reason: from getter */
    public final long getPivotOffset() {
        return this.getValidOutputFormatsForInputhNQ4ISI;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setPivotOffset-k-4lQ0M */
    public final void mo6642setPivotOffsetk4lQ0M(long j) {
        this.getValidOutputFormatsForInputhNQ4ISI = j;
        if ((9223372034707292159L & j) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.getARTIFICIAL_FRAME_PACKAGE_NAME = true;
            this.coroutineCreation.setPivotX(((int) (this._BOUNDARY >> 32)) / 2.0f);
            this.coroutineCreation.setPivotY(((int) (4294967295L & this._BOUNDARY)) / 2.0f);
        } else {
            this.getARTIFICIAL_FRAME_PACKAGE_NAME = false;
            this.coroutineCreation.setPivotX(java.lang.Float.intBitsToFloat((int) (j >> 32)));
            this.coroutineCreation.setPivotY(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getScaleX() {
        return this.b;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setScaleX(float f) {
        this.b = f;
        this.coroutineCreation.setScaleX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getScaleY() {
        return this._CREATION;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setScaleY(float f) {
        this._CREATION = f;
        this.coroutineCreation.setScaleY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getTranslationX() {
        return this.init;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setTranslationX(float f) {
        this.init = f;
        this.coroutineCreation.setTranslationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getTranslationY() {
        return this.kernelVersion;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setTranslationY(float f) {
        this.kernelVersion = f;
        this.coroutineCreation.setTranslationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getShadowElevation() {
        return this.f2685a;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setShadowElevation(float f) {
        this.f2685a = f;
        this.coroutineCreation.setElevation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: from getter */
    public final long getAmbientShadowColor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setAmbientShadowColor-8_81llA */
    public final void mo6638setAmbientShadowColor8_81llA(long j) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.getHighSpeedVideoFpsRangesFor = j;
            androidx.compose.ui.graphics.layer.RenderNodeVerificationHelper28 renderNodeVerificationHelper28 = androidx.compose.ui.graphics.layer.RenderNodeVerificationHelper28.getHighSpeedVideoFpsRanges;
            androidx.compose.ui.graphics.layer.RenderNodeVerificationHelper28.getHighSpeedVideoFpsRangesFor(this.coroutineCreation, androidx.compose.ui.graphics.ColorKt.m6049toArgb8_81llA(j));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getSpotShadowColor-0d7_KjU, reason: from getter */
    public final long getSpotShadowColor() {
        return this.d;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setSpotShadowColor-8_81llA */
    public final void mo6644setSpotShadowColor8_81llA(long j) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.d = j;
            androidx.compose.ui.graphics.layer.RenderNodeVerificationHelper28 renderNodeVerificationHelper28 = androidx.compose.ui.graphics.layer.RenderNodeVerificationHelper28.getHighSpeedVideoFpsRanges;
            androidx.compose.ui.graphics.layer.RenderNodeVerificationHelper28.getHighSpeedVideoSizes(this.coroutineCreation, androidx.compose.ui.graphics.ColorKt.m6049toArgb8_81llA(j));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getRotationX() {
        return this.ArtificialStackFrames;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setRotationX(float f) {
        this.ArtificialStackFrames = f;
        this.coroutineCreation.setRotationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getRotationY() {
        return this.CoroutineDebuggingKt;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setRotationY(float f) {
        this.CoroutineDebuggingKt = f;
        this.coroutineCreation.setRotationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getRotationZ() {
        return this.coroutineBoundary;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setRotationZ(float f) {
        this.coroutineBoundary = f;
        this.coroutineCreation.setRotation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getCameraDistance() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setCameraDistance(float f) {
        this.getHighResolutionOutputSizeshNQ4ISI = f;
        this.coroutineCreation.setCameraDistance(-f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final boolean getClip() {
        return this.getInputSizeshNQ4ISI;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setClip(boolean z) {
        this.getInputSizeshNQ4ISI = z;
        getHighSpeedVideoFpsRangesFor();
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        boolean z = false;
        boolean z2 = getClip() && !this.isOutputSupportedFor;
        if (getClip() && this.isOutputSupportedFor) {
            z = true;
        }
        if (z2 != this.getOutputFormats) {
            this.getOutputFormats = z2;
            this.coroutineCreation.setClipToBounds(z2);
        }
        if (z != this.getOutputMinFrameDuration) {
            this.getOutputMinFrameDuration = z;
            this.coroutineCreation.setClipToOutline(z);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final androidx.compose.ui.graphics.RenderEffect getRenderEffect() {
        return this.accessartificialFrame;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setRenderEffect(androidx.compose.ui.graphics.RenderEffect renderEffect) {
        this.accessartificialFrame = renderEffect;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setPosition-H0pRuoY */
    public final void mo6643setPositionH0pRuoY(int x, int y, long size) {
        int i = (int) (size >> 32);
        int i2 = (int) (4294967295L & size);
        this.coroutineCreation.setLeftTopRightBottom(x, y, x + i, y + i2);
        if (androidx.compose.ui.unit.IntSize.m8770equalsimpl0(this._BOUNDARY, size)) {
            return;
        }
        if (this.getARTIFICIAL_FRAME_PACKAGE_NAME) {
            this.coroutineCreation.setPivotX(i / 2.0f);
            this.coroutineCreation.setPivotY(i2 / 2.0f);
        }
        this._BOUNDARY = size;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setOutline-O0kMr_c */
    public final void mo6641setOutlineO0kMr_c(android.graphics.Outline outline, long outlineSize) {
        this.unwrapAs = outlineSize;
        this.coroutineCreation.setOutline(outline);
        this.isOutputSupportedFor = outline != null;
        getHighSpeedVideoFpsRangesFor();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: isInvalidated, reason: from getter */
    public final boolean getIsInvalidated() {
        return this.getOutputStallDurationlomOqCM;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setInvalidated(boolean z) {
        this.getOutputStallDurationlomOqCM = z;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final boolean getHasDisplayList() {
        return this.coroutineCreation.isValid();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void record(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.graphics.layer.GraphicsLayer layer, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> block) {
        android.graphics.Canvas start = this.coroutineCreation.start(java.lang.Math.max((int) (this._BOUNDARY >> 32), (int) (this.unwrapAs >> 32)), java.lang.Math.max((int) (this._BOUNDARY & 4294967295L), (int) (this.unwrapAs & 4294967295L)));
        try {
            androidx.compose.ui.graphics.CanvasHolder canvasHolder = this.getHighSpeedVideoSizesFor;
            android.graphics.Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
            canvasHolder.getAndroidCanvas().setInternalCanvas(start);
            androidx.compose.ui.graphics.AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
            androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope = this.getInputFormats;
            long m8784toSizeozmzZPI = androidx.compose.ui.unit.IntSizeKt.m8784toSizeozmzZPI(this._BOUNDARY);
            androidx.compose.ui.unit.Density density2 = canvasDrawScope.getDrawContext().getDensity();
            androidx.compose.ui.unit.LayoutDirection layoutDirection2 = canvasDrawScope.getDrawContext().getLayoutDirection();
            androidx.compose.ui.graphics.Canvas canvas = canvasDrawScope.getDrawContext().getCanvas();
            long mo6453getSizeNHjbRc = canvasDrawScope.getDrawContext().mo6453getSizeNHjbRc();
            androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer = canvasDrawScope.getDrawContext().getGraphicsLayer();
            androidx.compose.ui.graphics.drawscope.DrawContext drawContext = canvasDrawScope.getDrawContext();
            drawContext.setDensity(density);
            drawContext.setLayoutDirection(layoutDirection);
            drawContext.setCanvas(androidCanvas);
            drawContext.mo6454setSizeuvyYCjk(m8784toSizeozmzZPI);
            drawContext.setGraphicsLayer(layer);
            androidCanvas.save();
            try {
                block.invoke(canvasDrawScope);
                androidCanvas.restore();
                androidx.compose.ui.graphics.drawscope.DrawContext drawContext2 = canvasDrawScope.getDrawContext();
                drawContext2.setDensity(density2);
                drawContext2.setLayoutDirection(layoutDirection2);
                drawContext2.setCanvas(canvas);
                drawContext2.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
                drawContext2.setGraphicsLayer(graphicsLayer);
                canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
                this.coroutineCreation.end(start);
                setInvalidated(false);
            } catch (java.lang.Throwable th) {
                androidCanvas.restore();
                androidx.compose.ui.graphics.drawscope.DrawContext drawContext3 = canvasDrawScope.getDrawContext();
                drawContext3.setDensity(density2);
                drawContext3.setLayoutDirection(layoutDirection2);
                drawContext3.setCanvas(canvas);
                drawContext3.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
                drawContext3.setGraphicsLayer(graphicsLayer);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            this.coroutineCreation.end(start);
            throw th2;
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void draw(androidx.compose.ui.graphics.Canvas canvas) {
        android.view.DisplayListCanvas nativeCanvas = androidx.compose.ui.graphics.AndroidCanvas_androidKt.getNativeCanvas(canvas);
        kotlin.jvm.internal.Intrinsics.checkNotNull(nativeCanvas, "");
        nativeCanvas.drawRenderNode(this.coroutineCreation);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final android.graphics.Matrix calculateMatrix() {
        android.graphics.Matrix matrix = this.isOutputSupportedForhNQ4ISI;
        if (matrix == null) {
            matrix = new android.graphics.Matrix();
            this.isOutputSupportedForhNQ4ISI = matrix;
        }
        this.coroutineCreation.getMatrix(matrix);
        return matrix;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void discardDisplayList() {
        discardDisplayListInternal$ui_graphics();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final long getLayerId() {
        return this.getOutputSizeshNQ4ISI;
    }

    private final void Camera2StreamConfigurationMap(android.view.RenderNode renderNode) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            androidx.compose.ui.graphics.layer.RenderNodeVerificationHelper28 renderNodeVerificationHelper28 = androidx.compose.ui.graphics.layer.RenderNodeVerificationHelper28.getHighSpeedVideoFpsRanges;
            androidx.compose.ui.graphics.layer.RenderNodeVerificationHelper28 renderNodeVerificationHelper282 = androidx.compose.ui.graphics.layer.RenderNodeVerificationHelper28.getHighSpeedVideoFpsRanges;
            androidx.compose.ui.graphics.layer.RenderNodeVerificationHelper28.getHighSpeedVideoFpsRangesFor(renderNode, androidx.compose.ui.graphics.layer.RenderNodeVerificationHelper28.getHighResolutionOutputSizeshNQ4ISI(renderNode));
            androidx.compose.ui.graphics.layer.RenderNodeVerificationHelper28 renderNodeVerificationHelper283 = androidx.compose.ui.graphics.layer.RenderNodeVerificationHelper28.getHighSpeedVideoFpsRanges;
            androidx.compose.ui.graphics.layer.RenderNodeVerificationHelper28 renderNodeVerificationHelper284 = androidx.compose.ui.graphics.layer.RenderNodeVerificationHelper28.getHighSpeedVideoFpsRanges;
            androidx.compose.ui.graphics.layer.RenderNodeVerificationHelper28.getHighSpeedVideoSizes(renderNode, androidx.compose.ui.graphics.layer.RenderNodeVerificationHelper28.getHighSpeedVideoSizes(renderNode));
        }
    }

    public final void discardDisplayListInternal$ui_graphics() {
        androidx.compose.ui.graphics.layer.RenderNodeVerificationHelper24.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(this.coroutineCreation);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayerV23$Companion;", "", "<init>", "()V", "", "testFailCreateRenderNode", "Z", "getTestFailCreateRenderNode$ui_graphics", "()Z", "setTestFailCreateRenderNode$ui_graphics", "(Z)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getHighSpeedVideoFpsRanges", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean getTestFailCreateRenderNode$ui_graphics() {
            return androidx.compose.ui.graphics.layer.GraphicsLayerV23.testFailCreateRenderNode;
        }

        public final void setTestFailCreateRenderNode$ui_graphics(boolean z) {
            androidx.compose.ui.graphics.layer.GraphicsLayerV23.testFailCreateRenderNode = z;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
