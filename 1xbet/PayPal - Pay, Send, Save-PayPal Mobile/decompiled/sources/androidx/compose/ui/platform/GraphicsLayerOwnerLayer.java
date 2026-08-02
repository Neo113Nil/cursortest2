package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BU\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012$\u0010\r\u001a \u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b\u0012\u000b\u0012\t\u0018\u00010\u0003¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\f0\t\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\"\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010&\u001a\u00020\f2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010!J!\u0010)\u001a\u00020\f2\u0006\u0010'\u001a\u00020\n2\b\u0010(\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\fH\u0016¢\u0006\u0004\b+\u0010\u0017J\u000f\u0010,\u001a\u00020\fH\u0016¢\u0006\u0004\b,\u0010\u0017J\u000f\u0010-\u001a\u00020\fH\u0016¢\u0006\u0004\b-\u0010\u0017J\u001f\u00102\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\u001bH\u0016¢\u0006\u0004\b0\u00101J\u001f\u00105\u001a\u00020\f2\u0006\u00104\u001a\u0002032\u0006\u0010/\u001a\u00020\u001bH\u0016¢\u0006\u0004\b5\u00106JC\u00107\u001a\u00020\f2$\u0010\r\u001a \u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b\u0012\u000b\u0012\t\u0018\u00010\u0003¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\f0\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010=\u001a\u00020\f2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020\f2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b>\u0010<J\u000f\u0010@\u001a\u000209H\u0002¢\u0006\u0004\b@\u0010AJ\u0011\u0010B\u001a\u0004\u0018\u000109H\u0002¢\u0006\u0004\bB\u0010AJ\u000f\u0010C\u001a\u00020\fH\u0002¢\u0006\u0004\bC\u0010\u0017R\u0016\u0010@\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010B\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010ER\u0014\u0010\u0016\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR6\u0010C\u001a\"\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b\u0012\u000b\u0012\t\u0018\u00010\u0003¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010HR\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010M\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010N\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010I\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010R\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010QR$\u0010U\u001a\u00020\u001b2\u0006\u0010S\u001a\u00020\u001b8\u0002@CX\u0082\u000e¢\u0006\f\n\u0004\bM\u0010O\"\u0004\b@\u0010TR\u0016\u0010X\u001a\u00020V8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010WR\u0016\u0010P\u001a\u00020Y8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010Z\u001a\u00020\\8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010a\u001a\u00020_8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bX\u0010`R\u0016\u0010d\u001a\u00020b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bc\u0010LR\u0018\u0010F\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010f\u001a\u00020\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bd\u0010OR\u0016\u0010h\u001a\u00020\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\ba\u0010OR\u0016\u0010]\u001a\u00020\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bU\u0010OR\"\u0010j\u001a\u00020i8\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\"\u0010p\u001a\u00020\u001b8\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\bp\u0010O\u001a\u0004\bp\u0010q\"\u0004\br\u0010TR\u0016\u0010K\u001a\u00020\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b@\u0010OR%\u0010w\u001a\u0013\u0012\u0004\u0012\u00020t\u0012\u0004\u0012\u00020\f0s¢\u0006\u0002\bu8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bh\u0010vR\u0014\u0010{\u001a\u00020x8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0014\u0010}\u001a\u00020x8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b|\u0010zR\u0014\u0010\u007f\u001a\u0002098WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b~\u0010A"}, d2 = {"Landroidx/compose/ui/platform/GraphicsLayerOwnerLayer;", "Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/layout/GraphicLayerInfo;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "graphicsLayer", "Landroidx/compose/ui/graphics/GraphicsContext;", "context", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/ParameterName;", "", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "<init>", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "updateLayerProperties", "(Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;)V", "getHighSpeedVideoSizes", "()V", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/geometry/Offset;", com.daon.sdk.face.license.License.FEATURE_POSITION, "", "isInLayer-k-4lQ0M", "(J)Z", "isInLayer", "Landroidx/compose/ui/unit/IntOffset;", "move--gyyYBs", "(J)V", "move", "Landroidx/compose/ui/unit/IntSize;", io.ktor.http.ContentDisposition.Parameters.Size, "resize-ozmzZPI", "resize", "canvas", "parentLayer", "drawLayer", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "updateDisplayList", "invalidate", "destroy", "point", "inverse", "mapOffset-8S9VItk", "(JZ)J", "mapOffset", "Landroidx/compose/ui/geometry/MutableRect;", "rect", "mapBounds", "(Landroidx/compose/ui/geometry/MutableRect;Z)V", "reuseLayer", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "transform-58bKbWc", "([F)V", "transform", "inverseTransform-58bKbWc", "inverseTransform", "getHighSpeedVideoFpsRangesFor", "()[F", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "Landroidx/compose/ui/graphics/GraphicsContext;", "getValidOutputFormatsForInputhNQ4ISI", "Landroidx/compose/ui/platform/AndroidComposeView;", "Lkotlin/jvm/functions/Function2;", "getInputFormats", "Lkotlin/jvm/functions/Function0;", "isOutputSupportedForhNQ4ISI", "J", "getHighSpeedVideoSizesFor", "getOutputMinFrameDuration", "Z", "getOutputStallDurationlomOqCM", "[F", "getOutputFormats", "p0", "(Z)V", "getInputSizeshNQ4ISI", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Density;", "getOutputMinFrameDurationlomOqCM", "Landroidx/compose/ui/unit/LayoutDirection;", "getOutputSizes", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "unwrapAs", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "", com.visa.cbp.getEncExpo.warmup, "getOutputStallDuration", "Landroidx/compose/ui/graphics/TransformOrigin;", "ArtificialStackFrames", "getOutputSizeshNQ4ISI", "Landroidx/compose/ui/graphics/Outline;", "toString", "Landroidx/compose/ui/graphics/Outline;", "isOutputSupportedFor", "", "frameRate", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getFrameRate", "()F", "setFrameRate", "(F)V", "isFrameRateFromParent", "()Z", "setFrameRateFromParent", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "Lkotlin/jvm/functions/Function1;", "coroutineCreation", "", "getLayerId", "()J", "layerId", "getOwnerViewId", "ownerViewId", "getUnderlyingMatrix-sQKQjiQ", "underlyingMatrix"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GraphicsLayerOwnerLayer implements androidx.compose.ui.node.OwnedLayer, androidx.compose.ui.layout.GraphicLayerInfo {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.layer.GraphicsLayer getHighSpeedVideoFpsRangesFor;
    private float frameRate;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.GraphicsContext getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function2<? super androidx.compose.ui.graphics.Canvas, ? super androidx.compose.ui.graphics.layer.GraphicsLayer, kotlin.Unit> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean isOutputSupportedForhNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private boolean getInputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    private float[] getOutputFormats;
    private boolean getOutputMinFrameDuration;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private int getOutputStallDuration;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean toString;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private boolean isOutputSupportedFor;

    /* renamed from: getValidOutputFormatsForInputhNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.platform.AndroidComposeView getHighSpeedVideoSizes;
    private boolean isFrameRateFromParent;

    /* renamed from: toString, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.Outline getValidOutputFormatsForInputhNQ4ISI;

    /* renamed from: isOutputSupportedForhNQ4ISI, reason: from kotlin metadata */
    private long getHighSpeedVideoSizesFor = androidx.compose.ui.unit.IntSize.m8767constructorimpl(9223372034707292159L);

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final float[] getInputFormats = androidx.compose.ui.graphics.Matrix.m6223constructorimpl$default(null, 1, null);

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.compose.ui.unit.Density getOutputMinFrameDurationlomOqCM = androidx.compose.ui.unit.DensityKt.Density$default(1.0f, 0.0f, 2, null);

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private androidx.compose.ui.unit.LayoutDirection getOutputStallDurationlomOqCM = androidx.compose.ui.unit.LayoutDirection.Ltr;

    /* renamed from: unwrapAs, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.drawscope.CanvasDrawScope getOutputSizes = new androidx.compose.ui.graphics.drawscope.CanvasDrawScope();

    /* renamed from: ArtificialStackFrames, reason: from kotlin metadata */
    private long getOutputSizeshNQ4ISI = androidx.compose.ui.graphics.TransformOrigin.INSTANCE.m6378getCenterSzJe1aQ();

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean unwrapAs = true;

    /* renamed from: isOutputSupportedFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> coroutineCreation = new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>() { // from class: androidx.compose.ui.platform.GraphicsLayerOwnerLayer$recordLambda$1
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
            getHighResolutionOutputSizeshNQ4ISI(drawScope);
            return kotlin.Unit.INSTANCE;
        }

        public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
            kotlin.jvm.functions.Function2 function2;
            androidx.compose.ui.platform.GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = androidx.compose.ui.platform.GraphicsLayerOwnerLayer.this;
            androidx.compose.ui.graphics.Canvas canvas = drawScope.getDrawContext().getCanvas();
            function2 = graphicsLayerOwnerLayer.Camera2StreamConfigurationMap;
            if (function2 != null) {
                function2.invoke(canvas, drawScope.getDrawContext().getGraphicsLayer());
            }
        }

        {
            super(1);
        }
    };

    public GraphicsLayerOwnerLayer(androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer, androidx.compose.ui.graphics.GraphicsContext graphicsContext, androidx.compose.ui.platform.AndroidComposeView androidComposeView, kotlin.jvm.functions.Function2<? super androidx.compose.ui.graphics.Canvas, ? super androidx.compose.ui.graphics.layer.GraphicsLayer, kotlin.Unit> function2, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.getHighSpeedVideoFpsRangesFor = graphicsLayer;
        this.getHighSpeedVideoFpsRanges = graphicsContext;
        this.getHighSpeedVideoSizes = androidComposeView;
        this.Camera2StreamConfigurationMap = function2;
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
    }

    private final void getHighSpeedVideoFpsRangesFor(boolean z) {
        if (z != this.getInputSizeshNQ4ISI) {
            this.getInputSizeshNQ4ISI = z;
            this.getHighSpeedVideoSizes.notifyLayerIsDirty$ui(this, z);
        }
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

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void updateLayerProperties(androidx.compose.ui.graphics.ReusableGraphicsLayerScope scope) {
        int m6612getModulateAlphake2Ky5w;
        kotlin.jvm.functions.Function0<kotlin.Unit> function0;
        int mutatedFields = scope.getMutatedFields() | this.getOutputStallDuration;
        this.getOutputStallDurationlomOqCM = scope.getLayoutDirection();
        this.getOutputMinFrameDurationlomOqCM = scope.getGraphicsDensity();
        int i = mutatedFields & 4096;
        if (i != 0) {
            this.getOutputSizeshNQ4ISI = scope.getTransformOrigin();
        }
        if ((mutatedFields & 1) != 0) {
            this.getHighSpeedVideoFpsRangesFor.setScaleX(scope.getScaleX());
        }
        if ((mutatedFields & 2) != 0) {
            this.getHighSpeedVideoFpsRangesFor.setScaleY(scope.getScaleY());
        }
        if ((mutatedFields & 4) != 0) {
            this.getHighSpeedVideoFpsRangesFor.setAlpha(scope.getAlpha());
        }
        if ((mutatedFields & 8) != 0) {
            this.getHighSpeedVideoFpsRangesFor.setTranslationX(scope.getTranslationX());
        }
        if ((mutatedFields & 16) != 0) {
            this.getHighSpeedVideoFpsRangesFor.setTranslationY(scope.getTranslationY());
        }
        if ((mutatedFields & 32) != 0) {
            this.getHighSpeedVideoFpsRangesFor.setShadowElevation(scope.getShadowElevation());
            if (scope.getShadowElevation() > 0.0f && !this.isOutputSupportedForhNQ4ISI && (function0 = this.getHighResolutionOutputSizeshNQ4ISI) != null) {
                function0.invoke();
            }
        }
        if ((mutatedFields & 64) != 0) {
            this.getHighSpeedVideoFpsRangesFor.m6625setAmbientShadowColor8_81llA(scope.getAmbientShadowColor());
        }
        if ((mutatedFields & 128) != 0) {
            this.getHighSpeedVideoFpsRangesFor.m6631setSpotShadowColor8_81llA(scope.getSpotShadowColor());
        }
        if ((mutatedFields & 1024) != 0) {
            this.getHighSpeedVideoFpsRangesFor.setRotationZ(scope.getRotationZ());
        }
        if ((mutatedFields & 256) != 0) {
            this.getHighSpeedVideoFpsRangesFor.setRotationX(scope.getRotationX());
        }
        if ((mutatedFields & 512) != 0) {
            this.getHighSpeedVideoFpsRangesFor.setRotationY(scope.getRotationY());
        }
        if ((mutatedFields & 2048) != 0) {
            this.getHighSpeedVideoFpsRangesFor.setCameraDistance(scope.getCameraDistance());
        }
        if (i != 0) {
            if (androidx.compose.ui.graphics.TransformOrigin.m6372equalsimpl0(this.getOutputSizeshNQ4ISI, androidx.compose.ui.graphics.TransformOrigin.INSTANCE.m6378getCenterSzJe1aQ())) {
                this.getHighSpeedVideoFpsRangesFor.m6628setPivotOffsetk4lQ0M(androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0());
            } else {
                this.getHighSpeedVideoFpsRangesFor.m6628setPivotOffsetk4lQ0M(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(androidx.compose.ui.graphics.TransformOrigin.m6373getPivotFractionXimpl(this.getOutputSizeshNQ4ISI) * ((int) (this.getHighSpeedVideoSizesFor >> 32))) << 32) | (java.lang.Float.floatToRawIntBits(androidx.compose.ui.graphics.TransformOrigin.m6374getPivotFractionYimpl(this.getOutputSizeshNQ4ISI) * ((int) (this.getHighSpeedVideoSizesFor & 4294967295L))) & 4294967295L)));
            }
        }
        if ((mutatedFields & 16384) != 0) {
            this.getHighSpeedVideoFpsRangesFor.setClip(scope.getClip());
        }
        if ((131072 & mutatedFields) != 0) {
            this.getHighSpeedVideoFpsRangesFor.setRenderEffect(scope.getRenderEffect());
        }
        if ((262144 & mutatedFields) != 0) {
            this.getHighSpeedVideoFpsRangesFor.setColorFilter(scope.getColorFilter());
        }
        if ((524288 & mutatedFields) != 0) {
            this.getHighSpeedVideoFpsRangesFor.m6626setBlendModes9anfk8(scope.getBlendMode());
        }
        if ((32768 & mutatedFields) != 0) {
            androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer = this.getHighSpeedVideoFpsRangesFor;
            int compositingStrategy = scope.getCompositingStrategy();
            if (androidx.compose.ui.graphics.CompositingStrategy.m6076equalsimpl0(compositingStrategy, androidx.compose.ui.graphics.CompositingStrategy.INSTANCE.m6080getAutoNrFUSI())) {
                m6612getModulateAlphake2Ky5w = androidx.compose.ui.graphics.layer.CompositingStrategy.INSTANCE.m6611getAutoke2Ky5w();
            } else if (androidx.compose.ui.graphics.CompositingStrategy.m6076equalsimpl0(compositingStrategy, androidx.compose.ui.graphics.CompositingStrategy.INSTANCE.m6082getOffscreenNrFUSI())) {
                m6612getModulateAlphake2Ky5w = androidx.compose.ui.graphics.layer.CompositingStrategy.INSTANCE.m6613getOffscreenke2Ky5w();
            } else {
                if (!androidx.compose.ui.graphics.CompositingStrategy.m6076equalsimpl0(compositingStrategy, androidx.compose.ui.graphics.CompositingStrategy.INSTANCE.m6081getModulateAlphaNrFUSI())) {
                    throw new java.lang.IllegalStateException("Not supported composition strategy");
                }
                m6612getModulateAlphake2Ky5w = androidx.compose.ui.graphics.layer.CompositingStrategy.INSTANCE.m6612getModulateAlphake2Ky5w();
            }
            graphicsLayer.m6627setCompositingStrategyWpw9cng(m6612getModulateAlphake2Ky5w);
        }
        boolean z = true;
        if ((mutatedFields & androidx.compose.ui.graphics.Fields.MatrixAffectingFields) != 0) {
            this.toString = true;
            this.isOutputSupportedFor = true;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.getValidOutputFormatsForInputhNQ4ISI, scope.getOutline())) {
            z = false;
        } else {
            this.getValidOutputFormatsForInputhNQ4ISI = scope.getOutline();
            getHighResolutionOutputSizeshNQ4ISI();
        }
        this.getOutputStallDuration = scope.getMutatedFields();
        if (mutatedFields != 0 || z) {
            getHighSpeedVideoSizes();
            if (this.getHighSpeedVideoSizes.getIsArrEnabled()) {
                this.getHighSpeedVideoSizes.voteFrameRate(getFrameRate());
            }
        }
    }

    private final void getHighSpeedVideoSizes() {
        androidx.compose.ui.platform.WrapperRenderNodeLayerHelperMethods.INSTANCE.onDescendantInvalidated(this.getHighSpeedVideoSizes);
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        kotlin.jvm.functions.Function0<kotlin.Unit> function0;
        androidx.compose.ui.graphics.Outline outline = this.getValidOutputFormatsForInputhNQ4ISI;
        if (outline != null) {
            androidx.compose.ui.graphics.layer.GraphicsLayerKt.setOutline(this.getHighSpeedVideoFpsRangesFor, outline);
            if (!(outline instanceof androidx.compose.ui.graphics.Outline.Generic) || android.os.Build.VERSION.SDK_INT >= 33 || (function0 = this.getHighResolutionOutputSizeshNQ4ISI) == null) {
                return;
            }
            function0.invoke();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: move--gyyYBs */
    public final void mo7682movegyyYBs(long position) {
        if (this.getHighSpeedVideoSizes.getIsArrEnabled()) {
            this.getHighSpeedVideoSizes.voteFrameRate(androidx.compose.ui.FrameRateCategory.INSTANCE.m5512getHighNSsRyOo());
        }
        this.getHighSpeedVideoFpsRangesFor.m6632setTopLeftgyyYBs(position);
        getHighSpeedVideoSizes();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: resize-ozmzZPI */
    public final void mo7683resizeozmzZPI(long size) {
        if (androidx.compose.ui.unit.IntSize.m8770equalsimpl0(size, this.getHighSpeedVideoSizesFor)) {
            return;
        }
        if (this.getHighSpeedVideoSizes.getIsArrEnabled()) {
            this.getHighSpeedVideoSizes.voteFrameRate(androidx.compose.ui.FrameRateCategory.INSTANCE.m5512getHighNSsRyOo());
        }
        this.getHighSpeedVideoSizesFor = size;
        invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void drawLayer(androidx.compose.ui.graphics.Canvas canvas, androidx.compose.ui.graphics.layer.GraphicsLayer parentLayer) {
        updateDisplayList();
        this.isOutputSupportedForhNQ4ISI = this.getHighSpeedVideoFpsRangesFor.getShadowElevation() > 0.0f;
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = this.getOutputSizes.getDrawContext();
        drawContext.setCanvas(canvas);
        drawContext.setGraphicsLayer(parentLayer);
        androidx.compose.ui.graphics.layer.GraphicsLayerKt.drawLayer(this.getOutputSizes, this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void updateDisplayList() {
        if (this.getHighSpeedVideoSizes.getIsArrEnabled() && getFrameRate() != 0.0f) {
            this.getHighSpeedVideoSizes.voteFrameRate(getFrameRate());
        }
        if (this.getInputSizeshNQ4ISI) {
            if (!androidx.compose.ui.graphics.TransformOrigin.m6372equalsimpl0(this.getOutputSizeshNQ4ISI, androidx.compose.ui.graphics.TransformOrigin.INSTANCE.m6378getCenterSzJe1aQ()) && !androidx.compose.ui.unit.IntSize.m8770equalsimpl0(this.getHighSpeedVideoFpsRangesFor.getSize(), this.getHighSpeedVideoSizesFor)) {
                androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer = this.getHighSpeedVideoFpsRangesFor;
                float m6373getPivotFractionXimpl = androidx.compose.ui.graphics.TransformOrigin.m6373getPivotFractionXimpl(this.getOutputSizeshNQ4ISI);
                float f = (int) (this.getHighSpeedVideoSizesFor >> 32);
                float m6374getPivotFractionYimpl = androidx.compose.ui.graphics.TransformOrigin.m6374getPivotFractionYimpl(this.getOutputSizeshNQ4ISI);
                float f2 = (int) (this.getHighSpeedVideoSizesFor & 4294967295L);
                graphicsLayer.m6628setPivotOffsetk4lQ0M(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(m6373getPivotFractionXimpl * f) << 32) | (java.lang.Float.floatToRawIntBits(m6374getPivotFractionYimpl * f2) & 4294967295L)));
            }
            this.getHighSpeedVideoFpsRangesFor.m6624recordmLhObY(this.getOutputMinFrameDurationlomOqCM, this.getOutputStallDurationlomOqCM, this.getHighSpeedVideoSizesFor, this.coroutineCreation);
            getHighSpeedVideoFpsRangesFor(false);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void invalidate() {
        if (this.getInputSizeshNQ4ISI || this.getOutputMinFrameDuration) {
            return;
        }
        this.getHighSpeedVideoSizes.invalidate();
        getHighSpeedVideoFpsRangesFor(true);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void destroy() {
        setFrameRate(0.0f);
        setFrameRateFromParent(false);
        this.Camera2StreamConfigurationMap = null;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getOutputMinFrameDuration = true;
        getHighSpeedVideoFpsRangesFor(false);
        androidx.compose.ui.graphics.GraphicsContext graphicsContext = this.getHighSpeedVideoFpsRanges;
        if (graphicsContext != null) {
            graphicsContext.releaseGraphicsLayer(this.getHighSpeedVideoFpsRangesFor);
            this.getHighSpeedVideoSizes.recycle$ui(this);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: mapOffset-8S9VItk */
    public final long mo7681mapOffset8S9VItk(long point, boolean inverse) {
        float[] highSpeedVideoFpsRangesFor;
        if (inverse) {
            highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRanges();
            if (highSpeedVideoFpsRangesFor == null) {
                return androidx.compose.ui.geometry.Offset.INSTANCE.m5766getInfiniteF1C5BW0();
            }
        } else {
            highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        }
        return this.unwrapAs ? point : androidx.compose.ui.graphics.Matrix.m6229mapMKHz9U(highSpeedVideoFpsRangesFor, point);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void mapBounds(androidx.compose.ui.geometry.MutableRect rect, boolean inverse) {
        float[] highSpeedVideoFpsRanges = inverse ? getHighSpeedVideoFpsRanges() : getHighSpeedVideoFpsRangesFor();
        if (this.unwrapAs) {
            return;
        }
        if (highSpeedVideoFpsRanges == null) {
            rect.set(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            androidx.compose.ui.graphics.Matrix.m6231mapimpl(highSpeedVideoFpsRanges, rect);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void reuseLayer(kotlin.jvm.functions.Function2<? super androidx.compose.ui.graphics.Canvas, ? super androidx.compose.ui.graphics.layer.GraphicsLayer, kotlin.Unit> drawBlock, kotlin.jvm.functions.Function0<kotlin.Unit> invalidateParentLayer) {
        androidx.compose.ui.graphics.GraphicsContext graphicsContext = this.getHighSpeedVideoFpsRanges;
        if (graphicsContext != null) {
            if (!this.getHighSpeedVideoFpsRangesFor.getIsReleased()) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("layer should have been released before reuse");
            }
            this.getHighSpeedVideoFpsRangesFor = graphicsContext.createGraphicsLayer();
            this.getOutputMinFrameDuration = false;
            this.Camera2StreamConfigurationMap = drawBlock;
            this.getHighResolutionOutputSizeshNQ4ISI = invalidateParentLayer;
            this.toString = false;
            this.isOutputSupportedFor = false;
            this.unwrapAs = true;
            androidx.compose.ui.graphics.Matrix.m6232resetimpl(this.getInputFormats);
            float[] fArr = this.getOutputFormats;
            if (fArr != null) {
                androidx.compose.ui.graphics.Matrix.m6232resetimpl(fArr);
            }
            this.getOutputSizeshNQ4ISI = androidx.compose.ui.graphics.TransformOrigin.INSTANCE.m6378getCenterSzJe1aQ();
            this.isOutputSupportedForhNQ4ISI = false;
            this.getHighSpeedVideoSizesFor = androidx.compose.ui.unit.IntSize.m8767constructorimpl(9223372034707292159L);
            this.getValidOutputFormatsForInputhNQ4ISI = null;
            this.getOutputStallDuration = 0;
            return;
        }
        androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("currently reuse is only supported when we manage the layer lifecycle");
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: transform-58bKbWc */
    public final void mo7684transform58bKbWc(float[] matrix) {
        androidx.compose.ui.graphics.Matrix.m6242timesAssign58bKbWc(matrix, getHighSpeedVideoFpsRangesFor());
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: inverseTransform-58bKbWc */
    public final void mo7679inverseTransform58bKbWc(float[] matrix) {
        float[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        if (highSpeedVideoFpsRanges != null) {
            androidx.compose.ui.graphics.Matrix.m6242timesAssign58bKbWc(matrix, highSpeedVideoFpsRanges);
        }
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public final long getLayerId() {
        return this.getHighSpeedVideoFpsRangesFor.getLayerId();
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public final long getOwnerViewId() {
        return this.getHighSpeedVideoFpsRangesFor.getOwnerViewId();
    }

    private final float[] getHighSpeedVideoFpsRangesFor() {
        Camera2StreamConfigurationMap();
        return this.getInputFormats;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: getUnderlyingMatrix-sQKQjiQ */
    public final float[] mo7678getUnderlyingMatrixsQKQjiQ() {
        return getHighSpeedVideoFpsRangesFor();
    }

    private final float[] getHighSpeedVideoFpsRanges() {
        float[] fArr = this.getOutputFormats;
        if (fArr == null) {
            fArr = androidx.compose.ui.graphics.Matrix.m6223constructorimpl$default(null, 1, null);
            this.getOutputFormats = fArr;
        }
        if (!this.isOutputSupportedFor) {
            if (java.lang.Float.isNaN(fArr[0])) {
                return null;
            }
        } else {
            this.isOutputSupportedFor = false;
            float[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
            if (this.unwrapAs) {
                return highSpeedVideoFpsRangesFor;
            }
            if (!androidx.compose.ui.platform.InvertMatrixKt.m7760invertToJiSxe2E(highSpeedVideoFpsRangesFor, fArr)) {
                fArr[0] = Float.NaN;
                return null;
            }
        }
        return fArr;
    }

    private final void Camera2StreamConfigurationMap() {
        long pivotOffset;
        if (this.toString) {
            androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer = this.getHighSpeedVideoFpsRangesFor;
            if ((graphicsLayer.getPivotOffset() & 9223372034707292159L) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                pivotOffset = androidx.compose.ui.geometry.SizeKt.m5831getCenteruvyYCjk(androidx.compose.ui.unit.IntSizeKt.m8784toSizeozmzZPI(this.getHighSpeedVideoSizesFor));
            } else {
                pivotOffset = graphicsLayer.getPivotOffset();
            }
            androidx.compose.ui.graphics.Matrix.m6234resetToPivotedTransformimpl$default(this.getInputFormats, java.lang.Float.intBitsToFloat((int) (pivotOffset >> 32)), java.lang.Float.intBitsToFloat((int) (pivotOffset & 4294967295L)), graphicsLayer.getTranslationX(), graphicsLayer.getTranslationY(), 0.0f, graphicsLayer.getRotationX(), graphicsLayer.getRotationY(), graphicsLayer.getRotationZ(), graphicsLayer.getScaleX(), graphicsLayer.getScaleY(), 0.0f, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_WATERMARK, null);
            this.toString = false;
            this.unwrapAs = androidx.compose.ui.graphics.MatrixKt.m6247isIdentity58bKbWc(this.getInputFormats);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: isInLayer-k-4lQ0M */
    public final boolean mo7680isInLayerk4lQ0M(long position) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (position >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (position & 4294967295L));
        if (this.getHighSpeedVideoFpsRangesFor.getClip()) {
            return androidx.compose.ui.platform.ShapeContainingUtilKt.isInOutline$default(this.getHighSpeedVideoFpsRangesFor.getOutline(), intBitsToFloat, intBitsToFloat2, null, null, 24, null);
        }
        return true;
    }
}
