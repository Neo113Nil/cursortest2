package androidx.compose.ui.graphics.layer;

@kotlin.Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00020\n*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\fJ'\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010 \u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ@\u0010+\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0017\u0010*\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\n0'¢\u0006\u0002\b)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\n2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\nH\u0016¢\u0006\u0004\b4\u0010\fJ\u000f\u00106\u001a\u000205H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u000208H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u000208H\u0002¢\u0006\u0004\b;\u0010:R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010>R\u0014\u00106\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010?R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010@R\u0014\u0010;\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u00109\u001a\u00020C8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bD\u0010<R\u0018\u0010\u000b\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b;\u0010ER\u0018\u0010H\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010D\u001a\u0002088\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bI\u0010JR*\u0010M\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR*\u0010T\u001a\u00020S2\u0006\u0010L\u001a\u00020S8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR.\u0010[\u001a\u0004\u0018\u00010Z2\b\u0010L\u001a\u0004\u0018\u00010Z8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R*\u0010b\u001a\u00020a2\u0006\u0010L\u001a\u00020a8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bb\u0010<\u001a\u0004\bc\u0010>\"\u0004\bd\u0010eR*\u0010f\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bf\u0010N\u001a\u0004\bg\u0010P\"\u0004\bh\u0010RR*\u0010i\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bi\u0010N\u001a\u0004\bj\u0010P\"\u0004\bk\u0010RR*\u0010l\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bl\u0010N\u001a\u0004\bm\u0010P\"\u0004\bn\u0010RR*\u0010o\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bo\u0010N\u001a\u0004\bp\u0010P\"\u0004\bq\u0010RR*\u0010r\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\br\u0010N\u001a\u0004\bs\u0010P\"\u0004\bt\u0010RR*\u0010v\u001a\u00020u2\u0006\u0010L\u001a\u00020u8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bv\u0010<\u001a\u0004\bw\u0010>\"\u0004\bx\u0010eR*\u0010y\u001a\u00020u2\u0006\u0010L\u001a\u00020u8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\by\u0010<\u001a\u0004\bz\u0010>\"\u0004\b{\u0010eR*\u0010|\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b|\u0010N\u001a\u0004\b}\u0010P\"\u0004\b~\u0010RR,\u0010\u007f\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0017@WX\u0097\u000e¢\u0006\u0014\n\u0004\b\u007f\u0010N\u001a\u0005\b\u0080\u0001\u0010P\"\u0005\b\u0081\u0001\u0010RR.\u0010\u0082\u0001\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0017@WX\u0097\u000e¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010N\u001a\u0005\b\u0083\u0001\u0010P\"\u0005\b\u0084\u0001\u0010RR.\u0010\u0085\u0001\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0017@WX\u0097\u000e¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010N\u001a\u0005\b\u0086\u0001\u0010P\"\u0005\b\u0087\u0001\u0010RR/\u0010\u0088\u0001\u001a\u0002082\u0006\u0010L\u001a\u0002088\u0017@WX\u0097\u000e¢\u0006\u0016\n\u0005\b\u0088\u0001\u0010J\u001a\u0005\b\u0089\u0001\u0010:\"\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0016\u0010I\u001a\u0002088\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b6\u0010JR\u0016\u0010A\u001a\u0002088\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b9\u0010JR7\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008c\u00012\t\u0010L\u001a\u0005\u0018\u00010\u008c\u00018\u0017@WX\u0097\u000e¢\u0006\u0018\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R.\u0010\u0093\u0001\u001a\u00020\u000e2\u0006\u0010L\u001a\u00020\u000e8\u0017@WX\u0097\u000e¢\u0006\u0015\n\u0005\b\u0093\u0001\u0010U\u001a\u0005\b\u0094\u0001\u0010W\"\u0005\b\u0095\u0001\u0010YR'\u0010\u0096\u0001\u001a\u0002088\u0017@\u0017X\u0097\u000e¢\u0006\u0016\n\u0005\b\u0096\u0001\u0010J\u001a\u0005\b\u0096\u0001\u0010:\"\u0006\b\u0097\u0001\u0010\u008b\u0001R\u0016\u0010\u0099\u0001\u001a\u0002088WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010:R\u0016\u0010\u009b\u0001\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010>"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayerV29;", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "", "ownerId", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "canvasDrawScope", "<init>", "(JLandroidx/compose/ui/graphics/CanvasHolder;Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;)V", "", "getHighSpeedVideoFpsRanges", "()V", "Landroid/graphics/RenderNode;", "Landroidx/compose/ui/graphics/layer/CompositingStrategy;", "p0", "aK_", "(Landroid/graphics/RenderNode;I)V", "Camera2StreamConfigurationMap", "", "x", "y", "Landroidx/compose/ui/unit/IntSize;", io.ktor.http.ContentDisposition.Parameters.Size, "setPosition-H0pRuoY", "(IIJ)V", "setPosition", "Landroid/graphics/Outline;", "outline", "outlineSize", "setOutline-O0kMr_c", "(Landroid/graphics/Outline;J)V", "setOutline", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "block", "record", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "draw", "(Landroidx/compose/ui/graphics/Canvas;)V", "Landroid/graphics/Matrix;", "calculateMatrix", "()Landroid/graphics/Matrix;", "discardDisplayList", "Landroid/graphics/Paint;", "getHighSpeedVideoFpsRangesFor", "()Landroid/graphics/Paint;", "", "getHighResolutionOutputSizeshNQ4ISI", "()Z", "getHighSpeedVideoSizes", "J", "getOwnerId", "()J", "Landroidx/compose/ui/graphics/CanvasHolder;", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "getHighSpeedVideoSizesFor", "Landroid/graphics/RenderNode;", "Landroidx/compose/ui/geometry/Size;", "getOutputFormats", "Landroid/graphics/Paint;", "getOutputMinFrameDuration", "Landroid/graphics/Matrix;", "getInputSizeshNQ4ISI", "getInputFormats", "Z", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "alpha", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getAlpha", "()F", "setAlpha", "(F)V", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", com.visa.cbp.getEncExpo.warmup, "getBlendMode-0nO6VwU", "()I", "setBlendMode-s9anfk8", "(I)V", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "Landroidx/compose/ui/geometry/Offset;", "pivotOffset", "getPivotOffset-F1C5BW0", "setPivotOffset-k-4lQ0M", "(J)V", "scaleX", "getScaleX", "setScaleX", "scaleY", "getScaleY", "setScaleY", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "shadowElevation", "getShadowElevation", "setShadowElevation", "Landroidx/compose/ui/graphics/Color;", "ambientShadowColor", "getAmbientShadowColor-0d7_KjU", "setAmbientShadowColor-8_81llA", "spotShadowColor", "getSpotShadowColor-0d7_KjU", "setSpotShadowColor-8_81llA", "rotationX", "getRotationX", "setRotationX", "rotationY", "getRotationY", "setRotationY", "rotationZ", "getRotationZ", "setRotationZ", "cameraDistance", "getCameraDistance", "setCameraDistance", "clip", "getClip", "setClip", "(Z)V", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "compositingStrategy", "getCompositingStrategy-ke2Ky5w", "setCompositingStrategy-Wpw9cng", "isInvalidated", "setInvalidated", "getHasDisplayList", "hasDisplayList", "getLayerId", "layerId"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GraphicsLayerV29 implements androidx.compose.ui.graphics.layer.GraphicsLayerImpl {
    public static final int $stable = 8;
    private final androidx.compose.ui.graphics.drawscope.CanvasDrawScope Camera2StreamConfigurationMap;
    private float alpha;
    private long ambientShadowColor;
    private int blendMode;
    private float cameraDistance;
    private boolean clip;
    private androidx.compose.ui.graphics.ColorFilter colorFilter;
    private int compositingStrategy;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.CanvasHolder getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean getInputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private android.graphics.Paint getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final android.graphics.RenderNode getHighSpeedVideoSizes;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private boolean getOutputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private long getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private android.graphics.Matrix getInputSizeshNQ4ISI;
    private boolean isInvalidated;
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
    private float translationX;
    private float translationY;

    public GraphicsLayerV29(long j, androidx.compose.ui.graphics.CanvasHolder canvasHolder, androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope) {
        this.ownerId = j;
        this.getHighSpeedVideoFpsRangesFor = canvasHolder;
        this.Camera2StreamConfigurationMap = canvasDrawScope;
        android.graphics.RenderNode renderNode = new android.graphics.RenderNode("graphicsLayer");
        this.getHighSpeedVideoSizes = renderNode;
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.compose.ui.geometry.Size.INSTANCE.m5830getZeroNHjbRc();
        renderNode.setClipToBounds(false);
        aK_(renderNode, androidx.compose.ui.graphics.layer.CompositingStrategy.INSTANCE.m6611getAutoke2Ky5w());
        this.alpha = 1.0f;
        this.blendMode = androidx.compose.ui.graphics.BlendMode.INSTANCE.m5937getSrcOver0nO6VwU();
        this.pivotOffset = androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.ambientShadowColor = androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU();
        this.spotShadowColor = androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU();
        this.cameraDistance = 8.0f;
        this.compositingStrategy = androidx.compose.ui.graphics.layer.CompositingStrategy.INSTANCE.m6611getAutoke2Ky5w();
        this.isInvalidated = true;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final long getOwnerId() {
        return this.ownerId;
    }

    public /* synthetic */ GraphicsLayerV29(long j, androidx.compose.ui.graphics.CanvasHolder canvasHolder, androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? new androidx.compose.ui.graphics.CanvasHolder() : canvasHolder, (i & 4) != 0 ? new androidx.compose.ui.graphics.drawscope.CanvasDrawScope() : canvasDrawScope);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setAlpha(float f) {
        this.alpha = f;
        this.getHighSpeedVideoSizes.setAlpha(f);
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
        getHighSpeedVideoFpsRangesFor().setBlendMode(androidx.compose.ui.graphics.AndroidBlendMode_androidKt.m5844toAndroidBlendModes9anfk8(i));
        Camera2StreamConfigurationMap();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final androidx.compose.ui.graphics.ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setColorFilter(androidx.compose.ui.graphics.ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        getHighSpeedVideoFpsRangesFor().setColorFilter(colorFilter != null ? androidx.compose.ui.graphics.AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter) : null);
        Camera2StreamConfigurationMap();
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
            this.getHighSpeedVideoSizes.resetPivot();
        } else {
            this.getHighSpeedVideoSizes.setPivotX(java.lang.Float.intBitsToFloat((int) (j >> 32)));
            this.getHighSpeedVideoSizes.setPivotY(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getScaleX() {
        return this.scaleX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setScaleX(float f) {
        this.scaleX = f;
        this.getHighSpeedVideoSizes.setScaleX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getScaleY() {
        return this.scaleY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setScaleY(float f) {
        this.scaleY = f;
        this.getHighSpeedVideoSizes.setScaleY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getTranslationX() {
        return this.translationX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setTranslationX(float f) {
        this.translationX = f;
        this.getHighSpeedVideoSizes.setTranslationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getTranslationY() {
        return this.translationY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setTranslationY(float f) {
        this.translationY = f;
        this.getHighSpeedVideoSizes.setTranslationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getShadowElevation() {
        return this.shadowElevation;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setShadowElevation(float f) {
        this.shadowElevation = f;
        this.getHighSpeedVideoSizes.setElevation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: from getter */
    public final long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setAmbientShadowColor-8_81llA */
    public final void mo6638setAmbientShadowColor8_81llA(long j) {
        this.ambientShadowColor = j;
        this.getHighSpeedVideoSizes.setAmbientShadowColor(androidx.compose.ui.graphics.ColorKt.m6049toArgb8_81llA(j));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getSpotShadowColor-0d7_KjU, reason: from getter */
    public final long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setSpotShadowColor-8_81llA */
    public final void mo6644setSpotShadowColor8_81llA(long j) {
        this.spotShadowColor = j;
        this.getHighSpeedVideoSizes.setSpotShadowColor(androidx.compose.ui.graphics.ColorKt.m6049toArgb8_81llA(j));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getRotationX() {
        return this.rotationX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setRotationX(float f) {
        this.rotationX = f;
        this.getHighSpeedVideoSizes.setRotationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getRotationY() {
        return this.rotationY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setRotationY(float f) {
        this.rotationY = f;
        this.getHighSpeedVideoSizes.setRotationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getRotationZ() {
        return this.rotationZ;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setRotationZ(float f) {
        this.rotationZ = f;
        this.getHighSpeedVideoSizes.setRotationZ(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setCameraDistance(float f) {
        this.cameraDistance = f;
        this.getHighSpeedVideoSizes.setCameraDistance(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final boolean getClip() {
        return this.clip;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setClip(boolean z) {
        this.clip = z;
        getHighSpeedVideoFpsRanges();
    }

    private final void getHighSpeedVideoFpsRanges() {
        boolean z = false;
        boolean z2 = getClip() && !this.getOutputFormats;
        if (getClip() && this.getOutputFormats) {
            z = true;
        }
        if (z2 != this.getInputFormats) {
            this.getInputFormats = z2;
            this.getHighSpeedVideoSizes.setClipToBounds(z2);
        }
        if (z != this.getHighSpeedVideoSizesFor) {
            this.getHighSpeedVideoSizesFor = z;
            this.getHighSpeedVideoSizes.setClipToOutline(z);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final androidx.compose.ui.graphics.RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setRenderEffect(androidx.compose.ui.graphics.RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            androidx.compose.ui.graphics.layer.RenderNodeVerificationHelper.INSTANCE.setRenderEffect(this.getHighSpeedVideoSizes, renderEffect);
        }
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
        Camera2StreamConfigurationMap();
    }

    private final void aK_(android.graphics.RenderNode renderNode, int i) {
        if (androidx.compose.ui.graphics.layer.CompositingStrategy.m6607equalsimpl0(i, androidx.compose.ui.graphics.layer.CompositingStrategy.INSTANCE.m6613getOffscreenke2Ky5w())) {
            renderNode.setUseCompositingLayer(true, this.getHighSpeedVideoFpsRanges);
            renderNode.setHasOverlappingRendering(true);
        } else if (androidx.compose.ui.graphics.layer.CompositingStrategy.m6607equalsimpl0(i, androidx.compose.ui.graphics.layer.CompositingStrategy.INSTANCE.m6612getModulateAlphake2Ky5w())) {
            renderNode.setUseCompositingLayer(false, this.getHighSpeedVideoFpsRanges);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.getHighSpeedVideoFpsRanges);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final void Camera2StreamConfigurationMap() {
        if (getHighResolutionOutputSizeshNQ4ISI()) {
            aK_(this.getHighSpeedVideoSizes, androidx.compose.ui.graphics.layer.CompositingStrategy.INSTANCE.m6613getOffscreenke2Ky5w());
        } else {
            aK_(this.getHighSpeedVideoSizes, getCompositingStrategy());
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setPosition-H0pRuoY */
    public final void mo6643setPositionH0pRuoY(int x, int y, long size) {
        this.getHighSpeedVideoSizes.setPosition(x, y, ((int) (size >> 32)) + x, ((int) (4294967295L & size)) + y);
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.compose.ui.unit.IntSizeKt.m8784toSizeozmzZPI(size);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setOutline-O0kMr_c */
    public final void mo6641setOutlineO0kMr_c(android.graphics.Outline outline, long outlineSize) {
        this.getHighSpeedVideoSizes.setOutline(outline);
        this.getOutputFormats = outline != null;
        getHighSpeedVideoFpsRanges();
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
    public final void record(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.graphics.layer.GraphicsLayer layer, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> block) {
        android.graphics.RecordingCanvas beginRecording = this.getHighSpeedVideoSizes.beginRecording();
        try {
            androidx.compose.ui.graphics.CanvasHolder canvasHolder = this.getHighSpeedVideoFpsRangesFor;
            android.graphics.Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
            canvasHolder.getAndroidCanvas().setInternalCanvas(beginRecording);
            androidx.compose.ui.graphics.AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
            androidx.compose.ui.graphics.drawscope.DrawContext drawContext = this.Camera2StreamConfigurationMap.getDrawContext();
            drawContext.setDensity(density);
            drawContext.setLayoutDirection(layoutDirection);
            drawContext.setGraphicsLayer(layer);
            drawContext.mo6454setSizeuvyYCjk(this.getHighResolutionOutputSizeshNQ4ISI);
            drawContext.setCanvas(androidCanvas);
            block.invoke(this.Camera2StreamConfigurationMap);
            canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
            this.getHighSpeedVideoSizes.endRecording();
            setInvalidated(false);
        } catch (java.lang.Throwable th) {
            this.getHighSpeedVideoSizes.endRecording();
            throw th;
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void draw(androidx.compose.ui.graphics.Canvas canvas) {
        androidx.compose.ui.graphics.AndroidCanvas_androidKt.getNativeCanvas(canvas).drawRenderNode(this.getHighSpeedVideoSizes);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final android.graphics.Matrix calculateMatrix() {
        android.graphics.Matrix matrix = this.getInputSizeshNQ4ISI;
        if (matrix == null) {
            matrix = new android.graphics.Matrix();
            this.getInputSizeshNQ4ISI = matrix;
        }
        this.getHighSpeedVideoSizes.getMatrix(matrix);
        return matrix;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final boolean getHasDisplayList() {
        return this.getHighSpeedVideoSizes.hasDisplayList();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void discardDisplayList() {
        this.getHighSpeedVideoSizes.discardDisplayList();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final long getLayerId() {
        return this.getHighSpeedVideoSizes.getUniqueId();
    }

    private final android.graphics.Paint getHighSpeedVideoFpsRangesFor() {
        android.graphics.Paint paint = this.getHighSpeedVideoFpsRanges;
        if (paint != null) {
            return paint;
        }
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.getHighSpeedVideoFpsRanges = paint2;
        return paint2;
    }

    private final boolean getHighResolutionOutputSizeshNQ4ISI() {
        return androidx.compose.ui.graphics.layer.CompositingStrategy.m6607equalsimpl0(getCompositingStrategy(), androidx.compose.ui.graphics.layer.CompositingStrategy.INSTANCE.m6613getOffscreenke2Ky5w()) || getHighSpeedVideoSizes() || getRenderEffect() != null;
    }

    private final boolean getHighSpeedVideoSizes() {
        return (androidx.compose.ui.graphics.BlendMode.m5906equalsimpl0(getBlendMode(), androidx.compose.ui.graphics.BlendMode.INSTANCE.m5937getSrcOver0nO6VwU()) && getColorFilter() == null) ? false : true;
    }
}
