package androidx.compose.ui.graphics.layer;

@kotlin.Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 ¨\u00012\u00020\u0001:\u0002¨\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u000f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u000f\u0010\u0018J'\u0010 \u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010&\u001a\u00020\u000e2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010#\u001a\u00020\u001cH\u0016¢\u0006\u0004\b$\u0010%J@\u00101\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0017\u00100\u001a\u0013\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u000e0-¢\u0006\u0002\b/H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u000eH\u0002¢\u0006\u0004\b3\u0010\u0012J\u0017\u00106\u001a\u00020\u000e2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u000208H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u000eH\u0002¢\u0006\u0004\b;\u0010\u0012J\u000f\u0010<\u001a\u00020\u000eH\u0016¢\u0006\u0004\b<\u0010\u0012R\u0014\u00103\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010=R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010A\u001a\u0004\bB\u0010CR\u0014\u0010\u0017\u001a\u00020D8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010\u0014\u001a\u0006*\u00020G0G8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u000f\u001a\u00020J8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010KR\u0018\u0010;\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u0010LR\u0016\u0010P\u001a\u0004\u0018\u00010M8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010R\u001a\u0004\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010QR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bR\u0010AR\u0016\u0010N\u001a\u00020\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010H\u001a\u00020\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bU\u0010TR\u0016\u0010V\u001a\u00020\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bV\u0010>R\u0016\u0010E\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010WR\"\u0010X\u001a\u00020\u00168\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\bX\u0010W\u001a\u0004\bX\u0010\u0018\"\u0004\bY\u0010ZR\u0016\u0010S\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bP\u0010WR\u0016\u0010U\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010WR\u001a\u0010[\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b[\u0010>\u001a\u0004\b\\\u0010@R*\u0010_\u001a\u00020]2\u0006\u0010^\u001a\u00020]8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b_\u0010T\u001a\u0004\b`\u0010a\"\u0004\bb\u0010\u0010R.\u0010d\u001a\u0004\u0018\u00010c2\b\u0010^\u001a\u0004\u0018\u00010c8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR*\u0010j\u001a\u00020\f2\u0006\u0010^\u001a\u00020\f8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bj\u0010T\u001a\u0004\bk\u0010a\"\u0004\bl\u0010\u0010R*\u0010n\u001a\u00020m2\u0006\u0010^\u001a\u00020m8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u0016\u0010t\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bt\u0010WR*\u0010v\u001a\u00020u2\u0006\u0010^\u001a\u00020u8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bv\u0010>\u001a\u0004\bw\u0010@\"\u0004\bx\u0010yR*\u0010z\u001a\u00020m2\u0006\u0010^\u001a\u00020m8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bz\u0010o\u001a\u0004\b{\u0010q\"\u0004\b|\u0010sR*\u0010}\u001a\u00020m2\u0006\u0010^\u001a\u00020m8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b}\u0010o\u001a\u0004\b~\u0010q\"\u0004\b\u007f\u0010sR.\u0010\u0080\u0001\u001a\u00020m2\u0006\u0010^\u001a\u00020m8\u0017@WX\u0097\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010o\u001a\u0005\b\u0081\u0001\u0010q\"\u0005\b\u0082\u0001\u0010sR.\u0010\u0083\u0001\u001a\u00020m2\u0006\u0010^\u001a\u00020m8\u0017@WX\u0097\u000e¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010o\u001a\u0005\b\u0084\u0001\u0010q\"\u0005\b\u0085\u0001\u0010sR.\u0010\u0086\u0001\u001a\u00020m2\u0006\u0010^\u001a\u00020m8\u0017@WX\u0097\u000e¢\u0006\u0015\n\u0005\b\u0086\u0001\u0010o\u001a\u0005\b\u0087\u0001\u0010q\"\u0005\b\u0088\u0001\u0010sR0\u0010\u008a\u0001\u001a\u00030\u0089\u00012\u0007\u0010^\u001a\u00030\u0089\u00018\u0017@WX\u0097\u000e¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010>\u001a\u0005\b\u008b\u0001\u0010@\"\u0005\b\u008c\u0001\u0010yR0\u0010\u008d\u0001\u001a\u00030\u0089\u00012\u0007\u0010^\u001a\u00030\u0089\u00018\u0017@WX\u0097\u000e¢\u0006\u0015\n\u0005\b\u008d\u0001\u0010>\u001a\u0005\b\u008e\u0001\u0010@\"\u0005\b\u008f\u0001\u0010yR.\u0010\u0090\u0001\u001a\u00020m2\u0006\u0010^\u001a\u00020m8\u0017@WX\u0097\u000e¢\u0006\u0015\n\u0005\b\u0090\u0001\u0010o\u001a\u0005\b\u0091\u0001\u0010q\"\u0005\b\u0092\u0001\u0010sR.\u0010\u0093\u0001\u001a\u00020m2\u0006\u0010^\u001a\u00020m8\u0017@WX\u0097\u000e¢\u0006\u0015\n\u0005\b\u0093\u0001\u0010o\u001a\u0005\b\u0094\u0001\u0010q\"\u0005\b\u0095\u0001\u0010sR.\u0010\u0096\u0001\u001a\u00020m2\u0006\u0010^\u001a\u00020m8\u0017@WX\u0097\u000e¢\u0006\u0015\n\u0005\b\u0096\u0001\u0010o\u001a\u0005\b\u0097\u0001\u0010q\"\u0005\b\u0098\u0001\u0010sR'\u0010\u009b\u0001\u001a\u00020m2\u0006\u0010^\u001a\u00020m8W@WX\u0096\u000e¢\u0006\u000e\u001a\u0005\b\u0099\u0001\u0010q\"\u0005\b\u009a\u0001\u0010sR'\u0010\u009e\u0001\u001a\u00020\u00162\u0006\u0010^\u001a\u00020\u00168W@WX\u0096\u000e¢\u0006\u000e\u001a\u0005\b\u009c\u0001\u0010\u0018\"\u0005\b\u009d\u0001\u0010ZR7\u0010 \u0001\u001a\u0005\u0018\u00010\u009f\u00012\t\u0010^\u001a\u0005\u0018\u00010\u009f\u00018\u0017@WX\u0097\u000e¢\u0006\u0018\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R\u001d\u0010¦\u0001\u001a\u00020\u00168\u0017X\u0097\u0004¢\u0006\u000e\n\u0005\b¦\u0001\u0010W\u001a\u0005\b§\u0001\u0010\u0018"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsViewLayer;", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;", "layerContainer", "", "ownerId", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "canvasDrawScope", "<init>", "(Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;JLandroidx/compose/ui/graphics/CanvasHolder;Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;)V", "Landroidx/compose/ui/graphics/layer/CompositingStrategy;", "p0", "", "Camera2StreamConfigurationMap", "(I)V", "getOutputFormats", "()V", "Landroid/graphics/Paint;", "getHighSpeedVideoSizes", "()Landroid/graphics/Paint;", "", "getHighSpeedVideoFpsRangesFor", "()Z", "", "x", "y", "Landroidx/compose/ui/unit/IntSize;", io.ktor.http.ContentDisposition.Parameters.Size, "setPosition-H0pRuoY", "(IIJ)V", "setPosition", "Landroid/graphics/Outline;", "outline", "outlineSize", "setOutline-O0kMr_c", "(Landroid/graphics/Outline;J)V", "setOutline", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "block", "record", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/jvm/functions/Function1;)V", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "draw", "(Landroidx/compose/ui/graphics/Canvas;)V", "Landroid/graphics/Matrix;", "calculateMatrix", "()Landroid/graphics/Matrix;", "getHighSpeedVideoFpsRanges", "discardDisplayList", "Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;", "J", "getOwnerId", "()J", "Landroidx/compose/ui/graphics/CanvasHolder;", "getCanvasHolder", "()Landroidx/compose/ui/graphics/CanvasHolder;", "Landroidx/compose/ui/graphics/layer/ViewLayer;", "getOutputSizeshNQ4ISI", "Landroidx/compose/ui/graphics/layer/ViewLayer;", "Landroid/content/res/Resources;", "getOutputMinFrameDuration", "Landroid/content/res/Resources;", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "Landroid/graphics/Paint;", "Landroid/graphics/Picture;", "getInputSizeshNQ4ISI", "Landroid/graphics/Picture;", "getHighSpeedVideoSizesFor", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "getInputFormats", "getOutputMinFrameDurationlomOqCM", com.visa.cbp.getEncExpo.warmup, "getOutputStallDurationlomOqCM", "getOutputSizes", "Z", "isInvalidated", "setInvalidated", "(Z)V", "layerId", "getLayerId", "Landroidx/compose/ui/graphics/BlendMode;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "blendMode", "getBlendMode-0nO6VwU", "()I", "setBlendMode-s9anfk8", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "compositingStrategy", "getCompositingStrategy-ke2Ky5w", "setCompositingStrategy-Wpw9cng", "", "alpha", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getAlpha", "()F", "setAlpha", "(F)V", "getOutputStallDuration", "Landroidx/compose/ui/geometry/Offset;", "pivotOffset", "getPivotOffset-F1C5BW0", "setPivotOffset-k-4lQ0M", "(J)V", "scaleX", "getScaleX", "setScaleX", "scaleY", "getScaleY", "setScaleY", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "shadowElevation", "getShadowElevation", "setShadowElevation", "Landroidx/compose/ui/graphics/Color;", "ambientShadowColor", "getAmbientShadowColor-0d7_KjU", "setAmbientShadowColor-8_81llA", "spotShadowColor", "getSpotShadowColor-0d7_KjU", "setSpotShadowColor-8_81llA", "rotationX", "getRotationX", "setRotationX", "rotationY", "getRotationY", "setRotationY", "rotationZ", "getRotationZ", "setRotationZ", "getCameraDistance", "setCameraDistance", "cameraDistance", "getClip", "setClip", "clip", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "supportsSoftwareRendering", "getSupportsSoftwareRendering", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GraphicsViewLayer implements androidx.compose.ui.graphics.layer.GraphicsLayerImpl {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getOutputSizeshNQ4ISI;
    private float alpha;
    private long ambientShadowColor;
    private int blendMode;
    private final androidx.compose.ui.graphics.CanvasHolder canvasHolder;
    private androidx.compose.ui.graphics.ColorFilter colorFilter;
    private int compositingStrategy;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private android.graphics.Paint getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.layer.view.DrawChildContainer getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final android.graphics.Rect Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean getOutputStallDurationlomOqCM;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private boolean getOutputMinFrameDurationlomOqCM;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.CanvasHolder getOutputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.graphics.Picture getHighSpeedVideoSizesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.drawscope.CanvasDrawScope getInputFormats;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final android.content.res.Resources getHighSpeedVideoSizes;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private int getInputSizeshNQ4ISI;
    private long getOutputSizes;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.layer.ViewLayer getHighSpeedVideoFpsRangesFor;
    private boolean getOutputStallDuration;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private int getOutputMinFrameDuration;
    private boolean isInvalidated;
    private final long layerId;
    private final long ownerId;
    private long pivotOffset;
    private androidx.compose.ui.graphics.RenderEffect renderEffect;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private float shadowElevation;
    private long spotShadowColor;
    private final boolean supportsSoftwareRendering;
    private float translationX;
    private float translationY;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.graphics.layer.GraphicsViewLayer.Companion INSTANCE = new androidx.compose.ui.graphics.layer.GraphicsViewLayer.Companion(null);
    public static final int $stable = 8;
    private static final boolean mayRenderInSoftware = !androidx.compose.ui.graphics.layer.SurfaceUtils.INSTANCE.isLockHardwareCanvasAvailable();
    private static final android.graphics.Canvas PlaceholderCanvas = new android.graphics.Canvas() { // from class: androidx.compose.ui.graphics.layer.GraphicsViewLayer$Companion$PlaceholderCanvas$1
        @Override // android.graphics.Canvas
        public final boolean isHardwareAccelerated() {
            return true;
        }
    };

    public GraphicsViewLayer(androidx.compose.ui.graphics.layer.view.DrawChildContainer drawChildContainer, long j, androidx.compose.ui.graphics.CanvasHolder canvasHolder, androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope) {
        this.getHighResolutionOutputSizeshNQ4ISI = drawChildContainer;
        this.ownerId = j;
        this.canvasHolder = canvasHolder;
        androidx.compose.ui.graphics.layer.ViewLayer viewLayer = new androidx.compose.ui.graphics.layer.ViewLayer(drawChildContainer, canvasHolder, canvasDrawScope);
        this.getHighSpeedVideoFpsRangesFor = viewLayer;
        this.getHighSpeedVideoSizes = drawChildContainer.getResources();
        this.Camera2StreamConfigurationMap = new android.graphics.Rect();
        boolean z = mayRenderInSoftware;
        this.getHighSpeedVideoSizesFor = z ? new android.graphics.Picture() : null;
        this.getInputFormats = z ? new androidx.compose.ui.graphics.drawscope.CanvasDrawScope() : null;
        this.getOutputFormats = z ? new androidx.compose.ui.graphics.CanvasHolder() : null;
        drawChildContainer.addView(viewLayer);
        viewLayer.setClipBounds(null);
        this.getOutputSizes = androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g();
        this.isInvalidated = true;
        this.layerId = android.view.View.generateViewId();
        this.blendMode = androidx.compose.ui.graphics.BlendMode.INSTANCE.m5937getSrcOver0nO6VwU();
        this.compositingStrategy = androidx.compose.ui.graphics.layer.CompositingStrategy.INSTANCE.m6611getAutoke2Ky5w();
        this.alpha = 1.0f;
        this.pivotOffset = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.ambientShadowColor = androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU();
        this.spotShadowColor = androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU();
        this.supportsSoftwareRendering = z;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final long getOwnerId() {
        return this.ownerId;
    }

    public /* synthetic */ GraphicsViewLayer(androidx.compose.ui.graphics.layer.view.DrawChildContainer drawChildContainer, long j, androidx.compose.ui.graphics.CanvasHolder canvasHolder, androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(drawChildContainer, j, (i & 4) != 0 ? new androidx.compose.ui.graphics.CanvasHolder() : canvasHolder, (i & 8) != 0 ? new androidx.compose.ui.graphics.drawscope.CanvasDrawScope() : canvasDrawScope);
    }

    public final androidx.compose.ui.graphics.CanvasHolder getCanvasHolder() {
        return this.canvasHolder;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: isInvalidated, reason: from getter */
    public final boolean getIsInvalidated() {
        return this.isInvalidated;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setInvalidated(boolean z) {
        this.isInvalidated = z;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final long getLayerId() {
        return this.layerId;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getBlendMode-0nO6VwU, reason: from getter */
    public final int getBlendMode() {
        return this.blendMode;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setBlendMode-s9anfk8 */
    public final void mo6639setBlendModes9anfk8(int i) {
        this.blendMode = i;
        getHighSpeedVideoSizes().setXfermode(new android.graphics.PorterDuffXfermode(androidx.compose.ui.graphics.AndroidBlendMode_androidKt.m5845toPorterDuffModes9anfk8(i)));
        getOutputFormats();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final androidx.compose.ui.graphics.ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setColorFilter(androidx.compose.ui.graphics.ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        getHighSpeedVideoSizes().setColorFilter(colorFilter != null ? androidx.compose.ui.graphics.AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter) : null);
        getOutputFormats();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getCompositingStrategy-ke2Ky5w, reason: from getter */
    public final int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setCompositingStrategy-Wpw9cng */
    public final void mo6640setCompositingStrategyWpw9cng(int i) {
        this.compositingStrategy = i;
        getOutputFormats();
    }

    private final void Camera2StreamConfigurationMap(int p0) {
        boolean z;
        androidx.compose.ui.graphics.layer.ViewLayer viewLayer = this.getHighSpeedVideoFpsRangesFor;
        if (androidx.compose.ui.graphics.layer.CompositingStrategy.m6607equalsimpl0(p0, androidx.compose.ui.graphics.layer.CompositingStrategy.INSTANCE.m6613getOffscreenke2Ky5w())) {
            this.getHighSpeedVideoFpsRangesFor.setLayerType(2, this.getHighSpeedVideoFpsRanges);
        } else {
            z = false;
            if (androidx.compose.ui.graphics.layer.CompositingStrategy.m6607equalsimpl0(p0, androidx.compose.ui.graphics.layer.CompositingStrategy.INSTANCE.m6612getModulateAlphake2Ky5w())) {
                this.getHighSpeedVideoFpsRangesFor.setLayerType(0, this.getHighSpeedVideoFpsRanges);
                viewLayer.setCanUseCompositingLayer$ui_graphics(z);
            }
            this.getHighSpeedVideoFpsRangesFor.setLayerType(0, this.getHighSpeedVideoFpsRanges);
        }
        z = true;
        viewLayer.setCanUseCompositingLayer$ui_graphics(z);
    }

    private final void getOutputFormats() {
        if (getHighSpeedVideoFpsRangesFor()) {
            Camera2StreamConfigurationMap(androidx.compose.ui.graphics.layer.CompositingStrategy.INSTANCE.m6613getOffscreenke2Ky5w());
        } else {
            Camera2StreamConfigurationMap(getCompositingStrategy());
        }
    }

    private final android.graphics.Paint getHighSpeedVideoSizes() {
        android.graphics.Paint paint = this.getHighSpeedVideoFpsRanges;
        if (paint != null) {
            return paint;
        }
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.getHighSpeedVideoFpsRanges = paint2;
        return paint2;
    }

    private final boolean getHighSpeedVideoFpsRangesFor() {
        return androidx.compose.ui.graphics.layer.CompositingStrategy.m6607equalsimpl0(getCompositingStrategy(), androidx.compose.ui.graphics.layer.CompositingStrategy.INSTANCE.m6613getOffscreenke2Ky5w()) || Camera2StreamConfigurationMap();
    }

    private final boolean Camera2StreamConfigurationMap() {
        return (androidx.compose.ui.graphics.BlendMode.m5906equalsimpl0(getBlendMode(), androidx.compose.ui.graphics.BlendMode.INSTANCE.m5937getSrcOver0nO6VwU()) && getColorFilter() == null) ? false : true;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setAlpha(float f) {
        this.alpha = f;
        this.getHighSpeedVideoFpsRangesFor.setAlpha(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getPivotOffset-F1C5BW0, reason: from getter */
    public final long getPivotOffset() {
        return this.pivotOffset;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setPivotOffset-k-4lQ0M */
    public final void mo6642setPivotOffsetk4lQ0M(long j) {
        this.pivotOffset = j;
        if ((9223372034707292159L & j) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                androidx.compose.ui.graphics.layer.ViewLayerVerificationHelper28 viewLayerVerificationHelper28 = androidx.compose.ui.graphics.layer.ViewLayerVerificationHelper28.INSTANCE;
                androidx.compose.ui.graphics.layer.ViewLayerVerificationHelper28.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor);
                return;
            } else {
                this.getOutputStallDuration = true;
                this.getHighSpeedVideoFpsRangesFor.setPivotX(((int) (this.getOutputSizes >> 32)) / 2.0f);
                this.getHighSpeedVideoFpsRangesFor.setPivotY(((int) (4294967295L & this.getOutputSizes)) / 2.0f);
                return;
            }
        }
        this.getOutputStallDuration = false;
        this.getHighSpeedVideoFpsRangesFor.setPivotX(java.lang.Float.intBitsToFloat((int) (j >> 32)));
        this.getHighSpeedVideoFpsRangesFor.setPivotY(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getScaleX() {
        return this.scaleX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setScaleX(float f) {
        this.scaleX = f;
        this.getHighSpeedVideoFpsRangesFor.setScaleX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getScaleY() {
        return this.scaleY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setScaleY(float f) {
        this.scaleY = f;
        this.getHighSpeedVideoFpsRangesFor.setScaleY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getTranslationX() {
        return this.translationX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setTranslationX(float f) {
        this.translationX = f;
        this.getHighSpeedVideoFpsRangesFor.setTranslationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getTranslationY() {
        return this.translationY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setTranslationY(float f) {
        this.translationY = f;
        this.getHighSpeedVideoFpsRangesFor.setTranslationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getShadowElevation() {
        return this.shadowElevation;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setShadowElevation(float f) {
        this.shadowElevation = f;
        this.getHighSpeedVideoFpsRangesFor.setElevation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: from getter */
    public final long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setAmbientShadowColor-8_81llA */
    public final void mo6638setAmbientShadowColor8_81llA(long j) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.ambientShadowColor = j;
            androidx.compose.ui.graphics.layer.ViewLayerVerificationHelper28 viewLayerVerificationHelper28 = androidx.compose.ui.graphics.layer.ViewLayerVerificationHelper28.INSTANCE;
            androidx.compose.ui.graphics.layer.ViewLayerVerificationHelper28.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor, androidx.compose.ui.graphics.ColorKt.m6049toArgb8_81llA(j));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getSpotShadowColor-0d7_KjU, reason: from getter */
    public final long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setSpotShadowColor-8_81llA */
    public final void mo6644setSpotShadowColor8_81llA(long j) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.spotShadowColor = j;
            androidx.compose.ui.graphics.layer.ViewLayerVerificationHelper28 viewLayerVerificationHelper28 = androidx.compose.ui.graphics.layer.ViewLayerVerificationHelper28.INSTANCE;
            androidx.compose.ui.graphics.layer.ViewLayerVerificationHelper28.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor, androidx.compose.ui.graphics.ColorKt.m6049toArgb8_81llA(j));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getRotationX() {
        return this.rotationX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setRotationX(float f) {
        this.rotationX = f;
        this.getHighSpeedVideoFpsRangesFor.setRotationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getRotationY() {
        return this.rotationY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setRotationY(float f) {
        this.rotationY = f;
        this.getHighSpeedVideoFpsRangesFor.setRotationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getRotationZ() {
        return this.rotationZ;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setRotationZ(float f) {
        this.rotationZ = f;
        this.getHighSpeedVideoFpsRangesFor.setRotation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getCameraDistance() {
        return this.getHighSpeedVideoFpsRangesFor.getCameraDistance() / this.getHighSpeedVideoSizes.getDisplayMetrics().densityDpi;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setCameraDistance(float f) {
        this.getHighSpeedVideoFpsRangesFor.setCameraDistance(f * this.getHighSpeedVideoSizes.getDisplayMetrics().densityDpi);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final boolean getClip() {
        return this.getOutputStallDurationlomOqCM || this.getHighSpeedVideoFpsRangesFor.getClipToOutline();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setClip(boolean z) {
        this.getOutputStallDurationlomOqCM = z && !this.getOutputMinFrameDurationlomOqCM;
        this.getOutputSizeshNQ4ISI = true;
        this.getHighSpeedVideoFpsRangesFor.setClipToOutline(z && this.getOutputMinFrameDurationlomOqCM);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final androidx.compose.ui.graphics.RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setRenderEffect(androidx.compose.ui.graphics.RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            androidx.compose.ui.graphics.layer.ViewLayerVerificationHelper31 viewLayerVerificationHelper31 = androidx.compose.ui.graphics.layer.ViewLayerVerificationHelper31.INSTANCE;
            androidx.compose.ui.graphics.layer.ViewLayerVerificationHelper31.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, renderEffect);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setPosition-H0pRuoY */
    public final void mo6643setPositionH0pRuoY(int x, int y, long size) {
        if (!androidx.compose.ui.unit.IntSize.m8770equalsimpl0(this.getOutputSizes, size)) {
            if (getClip()) {
                this.getOutputSizeshNQ4ISI = true;
            }
            int i = (int) (size >> 32);
            int i2 = (int) (4294967295L & size);
            this.getHighSpeedVideoFpsRangesFor.layout(x, y, x + i, y + i2);
            this.getOutputSizes = size;
            if (this.getOutputStallDuration) {
                this.getHighSpeedVideoFpsRangesFor.setPivotX(i / 2.0f);
                this.getHighSpeedVideoFpsRangesFor.setPivotY(i2 / 2.0f);
            }
        } else {
            int i3 = this.getInputSizeshNQ4ISI;
            if (i3 != x) {
                this.getHighSpeedVideoFpsRangesFor.offsetLeftAndRight(x - i3);
            }
            int i4 = this.getOutputMinFrameDuration;
            if (i4 != y) {
                this.getHighSpeedVideoFpsRangesFor.offsetTopAndBottom(y - i4);
            }
        }
        this.getInputSizeshNQ4ISI = x;
        this.getOutputMinFrameDuration = y;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setOutline-O0kMr_c */
    public final void mo6641setOutlineO0kMr_c(android.graphics.Outline outline, long outlineSize) {
        boolean layerOutline = this.getHighSpeedVideoFpsRangesFor.setLayerOutline(outline);
        if (getClip() && outline != null) {
            this.getHighSpeedVideoFpsRangesFor.setClipToOutline(true);
            if (this.getOutputStallDurationlomOqCM) {
                this.getOutputStallDurationlomOqCM = false;
                this.getOutputSizeshNQ4ISI = true;
            }
        }
        this.getOutputMinFrameDurationlomOqCM = outline != null;
        if (layerOutline) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor.invalidate();
        getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void record(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.graphics.layer.GraphicsLayer layer, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> block) {
        androidx.compose.ui.graphics.CanvasHolder canvasHolder;
        android.graphics.Canvas canvas;
        if (this.getHighSpeedVideoFpsRangesFor.getParent() == null) {
            this.getHighResolutionOutputSizeshNQ4ISI.addView(this.getHighSpeedVideoFpsRangesFor);
        }
        this.getHighSpeedVideoFpsRangesFor.setDrawParams(density, layoutDirection, layer, block);
        if (this.getHighSpeedVideoFpsRangesFor.isAttachedToWindow()) {
            this.getHighSpeedVideoFpsRangesFor.setVisibility(4);
            this.getHighSpeedVideoFpsRangesFor.setVisibility(0);
            getHighResolutionOutputSizeshNQ4ISI();
            android.graphics.Picture picture = this.getHighSpeedVideoSizesFor;
            if (picture != null) {
                long j = this.getOutputSizes;
                android.graphics.Canvas beginRecording = picture.beginRecording((int) (j >> 32), (int) (j & 4294967295L));
                try {
                    androidx.compose.ui.graphics.CanvasHolder canvasHolder2 = this.getOutputFormats;
                    if (canvasHolder2 != null) {
                        android.graphics.Canvas internalCanvas = canvasHolder2.getAndroidCanvas().getInternalCanvas();
                        canvasHolder2.getAndroidCanvas().setInternalCanvas(beginRecording);
                        androidx.compose.ui.graphics.AndroidCanvas androidCanvas = canvasHolder2.getAndroidCanvas();
                        androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope = this.getInputFormats;
                        if (canvasDrawScope != null) {
                            androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
                            long m8784toSizeozmzZPI = androidx.compose.ui.unit.IntSizeKt.m8784toSizeozmzZPI(this.getOutputSizes);
                            androidx.compose.ui.unit.Density density2 = canvasDrawScope2.getDrawContext().getDensity();
                            androidx.compose.ui.unit.LayoutDirection layoutDirection2 = canvasDrawScope2.getDrawContext().getLayoutDirection();
                            androidx.compose.ui.graphics.Canvas canvas2 = canvasDrawScope2.getDrawContext().getCanvas();
                            canvasHolder = canvasHolder2;
                            canvas = internalCanvas;
                            long mo6453getSizeNHjbRc = canvasDrawScope2.getDrawContext().mo6453getSizeNHjbRc();
                            androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer = canvasDrawScope2.getDrawContext().getGraphicsLayer();
                            androidx.compose.ui.graphics.drawscope.DrawContext drawContext = canvasDrawScope2.getDrawContext();
                            drawContext.setDensity(density);
                            drawContext.setLayoutDirection(layoutDirection);
                            drawContext.setCanvas(androidCanvas);
                            drawContext.mo6454setSizeuvyYCjk(m8784toSizeozmzZPI);
                            drawContext.setGraphicsLayer(layer);
                            androidCanvas.save();
                            try {
                                block.invoke(canvasDrawScope2);
                                androidCanvas.restore();
                                androidx.compose.ui.graphics.drawscope.DrawContext drawContext2 = canvasDrawScope2.getDrawContext();
                                drawContext2.setDensity(density2);
                                drawContext2.setLayoutDirection(layoutDirection2);
                                drawContext2.setCanvas(canvas2);
                                drawContext2.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
                                drawContext2.setGraphicsLayer(graphicsLayer);
                            } catch (java.lang.Throwable th) {
                                androidCanvas.restore();
                                androidx.compose.ui.graphics.drawscope.DrawContext drawContext3 = canvasDrawScope2.getDrawContext();
                                drawContext3.setDensity(density2);
                                drawContext3.setLayoutDirection(layoutDirection2);
                                drawContext3.setCanvas(canvas2);
                                drawContext3.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
                                drawContext3.setGraphicsLayer(graphicsLayer);
                                throw th;
                            }
                        } else {
                            canvasHolder = canvasHolder2;
                            canvas = internalCanvas;
                        }
                        canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    }
                } finally {
                    picture.endRecording();
                }
            }
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final boolean getSupportsSoftwareRendering() {
        return this.supportsSoftwareRendering;
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        try {
            androidx.compose.ui.graphics.CanvasHolder canvasHolder = this.canvasHolder;
            android.graphics.Canvas canvas = PlaceholderCanvas;
            android.graphics.Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
            canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
            androidx.compose.ui.graphics.AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
            androidx.compose.ui.graphics.layer.view.DrawChildContainer drawChildContainer = this.getHighResolutionOutputSizeshNQ4ISI;
            androidx.compose.ui.graphics.layer.ViewLayer viewLayer = this.getHighSpeedVideoFpsRangesFor;
            drawChildContainer.drawChild$ui_graphics(androidCanvas, viewLayer, viewLayer.getDrawingTime());
            canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        } catch (java.lang.ClassCastException unused) {
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void draw(androidx.compose.ui.graphics.Canvas canvas) {
        getHighSpeedVideoFpsRanges();
        android.graphics.Canvas nativeCanvas = androidx.compose.ui.graphics.AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (nativeCanvas.isHardwareAccelerated()) {
            androidx.compose.ui.graphics.layer.view.DrawChildContainer drawChildContainer = this.getHighResolutionOutputSizeshNQ4ISI;
            androidx.compose.ui.graphics.layer.ViewLayer viewLayer = this.getHighSpeedVideoFpsRangesFor;
            drawChildContainer.drawChild$ui_graphics(canvas, viewLayer, viewLayer.getDrawingTime());
        } else {
            android.graphics.Picture picture = this.getHighSpeedVideoSizesFor;
            if (picture != null) {
                nativeCanvas.drawPicture(picture);
            }
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final android.graphics.Matrix calculateMatrix() {
        return this.getHighSpeedVideoFpsRangesFor.getMatrix();
    }

    private final void getHighSpeedVideoFpsRanges() {
        android.graphics.Rect rect;
        if (this.getOutputSizeshNQ4ISI) {
            androidx.compose.ui.graphics.layer.ViewLayer viewLayer = this.getHighSpeedVideoFpsRangesFor;
            if (!getClip() || this.getOutputMinFrameDurationlomOqCM) {
                rect = null;
            } else {
                rect = this.Camera2StreamConfigurationMap;
                rect.left = 0;
                rect.top = 0;
                rect.right = this.getHighSpeedVideoFpsRangesFor.getWidth();
                rect.bottom = this.getHighSpeedVideoFpsRangesFor.getHeight();
            }
            viewLayer.setClipBounds(rect);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void discardDisplayList() {
        this.getHighResolutionOutputSizeshNQ4ISI.removeViewInLayout(this.getHighSpeedVideoFpsRangesFor);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsViewLayer$Companion;", "", "<init>", "()V", "", "mayRenderInSoftware", "Z", "getMayRenderInSoftware", "()Z", "Landroid/graphics/Canvas;", "PlaceholderCanvas", "Landroid/graphics/Canvas;", "getPlaceholderCanvas", "()Landroid/graphics/Canvas;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean getMayRenderInSoftware() {
            return androidx.compose.ui.graphics.layer.GraphicsViewLayer.mayRenderInSoftware;
        }

        public final android.graphics.Canvas getPlaceholderCanvas() {
            return androidx.compose.ui.graphics.layer.GraphicsViewLayer.PlaceholderCanvas;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
