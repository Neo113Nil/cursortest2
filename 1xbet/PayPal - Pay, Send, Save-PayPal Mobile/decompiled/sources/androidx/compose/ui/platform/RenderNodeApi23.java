package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u009a\u00012\u00020\u0001:\u0002\u009a\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010p\u001a\u00020qH\u0002J\b\u0010r\u001a\u00020WH\u0002J\b\u0010s\u001a\u00020WH\u0002J\b\u0010t\u001a\u00020\u000eH\u0002J\u001b\u0010u\u001a\u00020q*\u00020\t2\u0006\u0010m\u001a\u00020\u000bH\u0002¢\u0006\u0004\bv\u0010wJ\r\u0010x\u001a\u00020\u0014H\u0000¢\u0006\u0002\byJ\r\u0010z\u001a\u00020WH\u0000¢\u0006\u0002\b{J\u0013\u0010~\u001a\u00020q2\t\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u0001H\u0016J)\u0010\u0081\u0001\u001a\u00020W2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0014H\u0016J\u0012\u0010\u0082\u0001\u001a\u00020q2\u0007\u0010\u0083\u0001\u001a\u00020\u0014H\u0016J\u0012\u0010\u0084\u0001\u001a\u00020q2\u0007\u0010\u0083\u0001\u001a\u00020\u0014H\u0016J6\u0010\u0085\u0001\u001a\u00020q2\b\u0010\u0086\u0001\u001a\u00030\u0087\u00012\n\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0089\u00012\u0015\u0010\u008a\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u008c\u0001\u0012\u0004\u0012\u00020q0\u008b\u0001H\u0016J\u0013\u0010\u008d\u0001\u001a\u00020q2\b\u0010\u008e\u0001\u001a\u00030\u008f\u0001H\u0016J\u0013\u0010\u0090\u0001\u001a\u00020q2\b\u0010\u008e\u0001\u001a\u00030\u008f\u0001H\u0016J\u0013\u0010\u0091\u0001\u001a\u00020q2\b\u0010\u0092\u0001\u001a\u00030\u0093\u0001H\u0016J\u0011\u0010\u0094\u0001\u001a\u00020W2\u0006\u0010z\u001a\u00020WH\u0016J\n\u0010\u0095\u0001\u001a\u00030\u0096\u0001H\u0016J\t\u0010\u0097\u0001\u001a\u00020qH\u0016J\t\u0010\u0098\u0001\u001a\u00020qH\u0002J\u0011\u0010\u0099\u0001\u001a\u00020q2\u0006\u0010\b\u001a\u00020\tH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0014X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u0014X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\u0014X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R\u0014\u0010\"\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0016R\u0014\u0010$\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0016R\u001c\u0010&\u001a\u0004\u0018\u00010'X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020-8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00103\u001a\u00020-2\u0006\u0010,\u001a\u00020-8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b4\u00100\"\u0004\b5\u00102R$\u00106\u001a\u00020-2\u0006\u0010,\u001a\u00020-8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b7\u00100\"\u0004\b8\u00102R$\u00109\u001a\u00020-2\u0006\u0010,\u001a\u00020-8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b:\u00100\"\u0004\b;\u00102R$\u0010<\u001a\u00020-2\u0006\u0010,\u001a\u00020-8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b=\u00100\"\u0004\b>\u00102R$\u0010?\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u00148V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b@\u0010\u0016\"\u0004\bA\u0010\u0018R$\u0010B\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u00148V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bC\u0010\u0016\"\u0004\bD\u0010\u0018R$\u0010E\u001a\u00020-2\u0006\u0010,\u001a\u00020-8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bF\u00100\"\u0004\bG\u00102R$\u0010H\u001a\u00020-2\u0006\u0010,\u001a\u00020-8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bI\u00100\"\u0004\bJ\u00102R$\u0010K\u001a\u00020-2\u0006\u0010,\u001a\u00020-8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bL\u00100\"\u0004\bM\u00102R$\u0010N\u001a\u00020-2\u0006\u0010,\u001a\u00020-8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bO\u00100\"\u0004\bP\u00102R$\u0010Q\u001a\u00020-2\u0006\u0010,\u001a\u00020-8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bR\u00100\"\u0004\bS\u00102R$\u0010T\u001a\u00020-2\u0006\u0010,\u001a\u00020-8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bU\u00100\"\u0004\bV\u00102R$\u0010X\u001a\u00020W2\u0006\u0010,\u001a\u00020W8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u0010]\u001a\u00020W2\u0006\u0010,\u001a\u00020W@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010Z\"\u0004\b_\u0010\\R$\u0010`\u001a\u00020-2\u0006\u0010,\u001a\u00020-8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\ba\u00100\"\u0004\bb\u00102R&\u0010d\u001a\u00020c2\u0006\u0010,\u001a\u00020c@VX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\be\u0010\u0016\"\u0004\bf\u0010\u0018R(\u0010h\u001a\u0004\u0018\u00010g2\b\u0010,\u001a\u0004\u0018\u00010g@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR$\u0010m\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bn\u0010\u0016\"\u0004\bo\u0010\u0018R\u0014\u0010|\u001a\u00020W8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b}\u0010Z¨\u0006\u009b\u0001"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeApi23;", "Landroidx/compose/ui/platform/DeviceRenderNode;", "ownerView", "Landroidx/compose/ui/platform/AndroidComposeView;", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "renderNode", "Landroid/view/RenderNode;", "internalCompositingStrategy", "Landroidx/compose/ui/graphics/CompositingStrategy;", com.visa.cbp.getEncExpo.warmup, "layerPaint", "Landroidx/compose/ui/graphics/Paint;", "uniqueId", "", "getUniqueId", "()J", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, "", "getLeft", "()I", "setLeft", "(I)V", com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, "getTop", "setTop", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, "getRight", "setRight", com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, "getBottom", "setBottom", "width", "getWidth", "height", "getHeight", "renderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "scaleX", "getScaleX", "()F", "setScaleX", "(F)V", "scaleY", "getScaleY", "setScaleY", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "elevation", "getElevation", "setElevation", "ambientShadowColor", "getAmbientShadowColor", "setAmbientShadowColor", "spotShadowColor", "getSpotShadowColor", "setSpotShadowColor", "rotationZ", "getRotationZ", "setRotationZ", "rotationX", "getRotationX", "setRotationX", "rotationY", "getRotationY", "setRotationY", "cameraDistance", "getCameraDistance", "setCameraDistance", "pivotX", "getPivotX", "setPivotX", "pivotY", "getPivotY", "setPivotY", "", "clipToOutline", "getClipToOutline", "()Z", "setClipToOutline", "(Z)V", "clipToBounds", "getClipToBounds", "setClipToBounds", "alpha", "getAlpha", "setAlpha", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "getBlendMode-0nO6VwU", "setBlendMode-s9anfk8", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "compositingStrategy", "getCompositingStrategy--NrFUSI", "setCompositingStrategy-aDBOjCE", "updateLayerProperties", "", "requiresCompositingLayer", "requiresLayerPaint", "obtainLayerPaint", "applyCompositingStrategy", "applyCompositingStrategy-Qu9p0E8", "(Landroid/view/RenderNode;I)V", "getLayerType", "getLayerType$ui", "hasOverlappingRendering", "hasOverlappingRendering$ui", "hasDisplayList", "getHasDisplayList", "setOutline", "outline", "Landroid/graphics/Outline;", "setPosition", "offsetLeftAndRight", "offset", "offsetTopAndBottom", "record", "canvasHolder", "Landroidx/compose/ui/graphics/CanvasHolder;", "clipPath", "Landroidx/compose/ui/graphics/Path;", "drawBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "getMatrix", "matrix", "Landroid/graphics/Matrix;", "getInverseMatrix", "drawInto", "canvas", "Landroid/graphics/Canvas;", "setHasOverlappingRendering", "dumpRenderNodeData", "Landroidx/compose/ui/platform/DeviceRenderNodeData;", "discardDisplayList", "discardDisplayListInternal", "verifyShadowColorProperties", "Companion", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RenderNodeApi23 implements androidx.compose.ui.platform.DeviceRenderNode {
    private static boolean testFailCreateRenderNode;
    private int Camera2StreamConfigurationMap;
    private androidx.compose.ui.graphics.ColorFilter getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;
    private androidx.compose.ui.graphics.Paint getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private final androidx.compose.ui.platform.AndroidComposeView getInputSizeshNQ4ISI;
    private androidx.compose.ui.graphics.RenderEffect getOutputFormats;
    private int getOutputMinFrameDuration;
    private int getOutputMinFrameDurationlomOqCM;
    private int getOutputSizeshNQ4ISI;
    private final android.view.RenderNode getOutputStallDurationlomOqCM;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.platform.RenderNodeApi23.Companion INSTANCE = new androidx.compose.ui.platform.RenderNodeApi23.Companion(null);
    public static final int $stable = 8;
    private static boolean getHighSpeedVideoSizes = true;

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final long getUniqueId() {
        return 0L;
    }

    public RenderNodeApi23(androidx.compose.ui.platform.AndroidComposeView androidComposeView) {
        this.getInputSizeshNQ4ISI = androidComposeView;
        android.view.RenderNode create = android.view.RenderNode.create("Compose", androidComposeView);
        this.getOutputStallDurationlomOqCM = create;
        this.getInputFormats = androidx.compose.ui.graphics.CompositingStrategy.INSTANCE.m6080getAutoNrFUSI();
        if (getHighSpeedVideoSizes) {
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
            getHighSpeedVideoFpsRangesFor();
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
            getHighSpeedVideoSizes = false;
        }
        if (testFailCreateRenderNode) {
            throw new java.lang.NoClassDefFoundError();
        }
        this.getHighSpeedVideoFpsRanges = androidx.compose.ui.graphics.BlendMode.INSTANCE.m5937getSrcOver0nO6VwU();
    }

    /* renamed from: getOwnerView, reason: from getter */
    public final androidx.compose.ui.platform.AndroidComposeView getGetInputSizeshNQ4ISI() {
        return this.getInputSizeshNQ4ISI;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* renamed from: getLeft, reason: from getter */
    public final int getGetOutputMinFrameDuration() {
        return this.getOutputMinFrameDuration;
    }

    public final void setLeft(int i) {
        this.getOutputMinFrameDuration = i;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* renamed from: getTop, reason: from getter */
    public final int getGetOutputMinFrameDurationlomOqCM() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public final void setTop(int i) {
        this.getOutputMinFrameDurationlomOqCM = i;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* renamed from: getRight, reason: from getter */
    public final int getGetOutputSizeshNQ4ISI() {
        return this.getOutputSizeshNQ4ISI;
    }

    public final void setRight(int i) {
        this.getOutputSizeshNQ4ISI = i;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* renamed from: getBottom, reason: from getter */
    public final int getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    public final void setBottom(int i) {
        this.Camera2StreamConfigurationMap = i;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int getWidth() {
        return getGetOutputSizeshNQ4ISI() - getGetOutputMinFrameDuration();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int getHeight() {
        return getCamera2StreamConfigurationMap() - getGetOutputMinFrameDurationlomOqCM();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* renamed from: getRenderEffect, reason: from getter */
    public final androidx.compose.ui.graphics.RenderEffect getGetOutputFormats() {
        return this.getOutputFormats;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setRenderEffect(androidx.compose.ui.graphics.RenderEffect renderEffect) {
        this.getOutputFormats = renderEffect;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float getScaleX() {
        return this.getOutputStallDurationlomOqCM.getScaleX();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setScaleX(float f) {
        this.getOutputStallDurationlomOqCM.setScaleX(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float getScaleY() {
        return this.getOutputStallDurationlomOqCM.getScaleY();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setScaleY(float f) {
        this.getOutputStallDurationlomOqCM.setScaleY(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float getTranslationX() {
        return this.getOutputStallDurationlomOqCM.getTranslationX();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setTranslationX(float f) {
        this.getOutputStallDurationlomOqCM.setTranslationX(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float getTranslationY() {
        return this.getOutputStallDurationlomOqCM.getTranslationY();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setTranslationY(float f) {
        this.getOutputStallDurationlomOqCM.setTranslationY(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float getElevation() {
        return this.getOutputStallDurationlomOqCM.getElevation();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setElevation(float f) {
        this.getOutputStallDurationlomOqCM.setElevation(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int getAmbientShadowColor() {
        if (android.os.Build.VERSION.SDK_INT < 28) {
            return -16777216;
        }
        androidx.compose.ui.platform.RenderNodeVerificationHelper28 renderNodeVerificationHelper28 = androidx.compose.ui.platform.RenderNodeVerificationHelper28.getHighSpeedVideoSizes;
        return androidx.compose.ui.platform.RenderNodeVerificationHelper28.getHighResolutionOutputSizeshNQ4ISI(this.getOutputStallDurationlomOqCM);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setAmbientShadowColor(int i) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            androidx.compose.ui.platform.RenderNodeVerificationHelper28 renderNodeVerificationHelper28 = androidx.compose.ui.platform.RenderNodeVerificationHelper28.getHighSpeedVideoSizes;
            androidx.compose.ui.platform.RenderNodeVerificationHelper28.getHighSpeedVideoFpsRangesFor(this.getOutputStallDurationlomOqCM, i);
        }
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int getSpotShadowColor() {
        if (android.os.Build.VERSION.SDK_INT < 28) {
            return -16777216;
        }
        androidx.compose.ui.platform.RenderNodeVerificationHelper28 renderNodeVerificationHelper28 = androidx.compose.ui.platform.RenderNodeVerificationHelper28.getHighSpeedVideoSizes;
        return androidx.compose.ui.platform.RenderNodeVerificationHelper28.Camera2StreamConfigurationMap(this.getOutputStallDurationlomOqCM);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setSpotShadowColor(int i) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            androidx.compose.ui.platform.RenderNodeVerificationHelper28 renderNodeVerificationHelper28 = androidx.compose.ui.platform.RenderNodeVerificationHelper28.getHighSpeedVideoSizes;
            androidx.compose.ui.platform.RenderNodeVerificationHelper28.getHighSpeedVideoFpsRanges(this.getOutputStallDurationlomOqCM, i);
        }
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float getRotationZ() {
        return this.getOutputStallDurationlomOqCM.getRotation();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setRotationZ(float f) {
        this.getOutputStallDurationlomOqCM.setRotation(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float getRotationX() {
        return this.getOutputStallDurationlomOqCM.getRotationX();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setRotationX(float f) {
        this.getOutputStallDurationlomOqCM.setRotationX(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float getRotationY() {
        return this.getOutputStallDurationlomOqCM.getRotationY();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setRotationY(float f) {
        this.getOutputStallDurationlomOqCM.setRotationY(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float getCameraDistance() {
        return -this.getOutputStallDurationlomOqCM.getCameraDistance();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setCameraDistance(float f) {
        this.getOutputStallDurationlomOqCM.setCameraDistance(-f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float getPivotX() {
        return this.getOutputStallDurationlomOqCM.getPivotX();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setPivotX(float f) {
        this.getOutputStallDurationlomOqCM.setPivotX(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float getPivotY() {
        return this.getOutputStallDurationlomOqCM.getPivotY();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setPivotY(float f) {
        this.getOutputStallDurationlomOqCM.setPivotY(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final boolean getClipToOutline() {
        return this.getOutputStallDurationlomOqCM.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setClipToOutline(boolean z) {
        this.getOutputStallDurationlomOqCM.setClipToOutline(z);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* renamed from: getClipToBounds, reason: from getter */
    public final boolean getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setClipToBounds(boolean z) {
        this.getHighSpeedVideoFpsRangesFor = z;
        this.getOutputStallDurationlomOqCM.setClipToBounds(z);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float getAlpha() {
        return this.getOutputStallDurationlomOqCM.getAlpha();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setAlpha(float f) {
        this.getOutputStallDurationlomOqCM.setAlpha(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* renamed from: getBlendMode-0nO6VwU, reason: from getter */
    public final int getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* renamed from: setBlendMode-s9anfk8 */
    public final void mo7741setBlendModes9anfk8(int i) {
        this.getHighSpeedVideoFpsRanges = i;
        Camera2StreamConfigurationMap().mo5872setBlendModes9anfk8(i);
        getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* renamed from: getColorFilter, reason: from getter */
    public final androidx.compose.ui.graphics.ColorFilter getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setColorFilter(androidx.compose.ui.graphics.ColorFilter colorFilter) {
        this.getHighResolutionOutputSizeshNQ4ISI = colorFilter;
        Camera2StreamConfigurationMap().setColorFilter(colorFilter);
        getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* renamed from: getCompositingStrategy--NrFUSI, reason: from getter */
    public final int getGetInputFormats() {
        return this.getInputFormats;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* renamed from: setCompositingStrategy-aDBOjCE */
    public final void mo7742setCompositingStrategyaDBOjCE(int i) {
        this.getInputFormats = i;
        getHighResolutionOutputSizeshNQ4ISI();
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        if (getHighSpeedVideoFpsRanges()) {
            getHighSpeedVideoSizes(this.getOutputStallDurationlomOqCM, androidx.compose.ui.graphics.CompositingStrategy.INSTANCE.m6082getOffscreenNrFUSI());
        } else {
            getHighSpeedVideoSizes(this.getOutputStallDurationlomOqCM, this.getInputFormats);
        }
    }

    private final boolean getHighSpeedVideoFpsRanges() {
        return androidx.compose.ui.graphics.CompositingStrategy.m6076equalsimpl0(getGetInputFormats(), androidx.compose.ui.graphics.CompositingStrategy.INSTANCE.m6082getOffscreenNrFUSI()) || getHighSpeedVideoSizes();
    }

    private final boolean getHighSpeedVideoSizes() {
        return (androidx.compose.ui.graphics.BlendMode.m5906equalsimpl0(getGetHighSpeedVideoFpsRanges(), androidx.compose.ui.graphics.BlendMode.INSTANCE.m5937getSrcOver0nO6VwU()) && getGetHighResolutionOutputSizeshNQ4ISI() == null) ? false : true;
    }

    private final androidx.compose.ui.graphics.Paint Camera2StreamConfigurationMap() {
        androidx.compose.ui.graphics.Paint paint = this.getHighSpeedVideoSizesFor;
        if (paint != null) {
            return paint;
        }
        androidx.compose.ui.graphics.Paint Paint = androidx.compose.ui.graphics.AndroidPaint_androidKt.Paint();
        this.getHighSpeedVideoSizesFor = Paint;
        return Paint;
    }

    private final void getHighSpeedVideoSizes(android.view.RenderNode renderNode, int i) {
        if (androidx.compose.ui.graphics.CompositingStrategy.m6076equalsimpl0(i, androidx.compose.ui.graphics.CompositingStrategy.INSTANCE.m6082getOffscreenNrFUSI())) {
            renderNode.setLayerType(2);
            androidx.compose.ui.graphics.Paint paint = this.getHighSpeedVideoSizesFor;
            renderNode.setLayerPaint(paint != null ? paint.getGetHighSpeedVideoFpsRangesFor() : null);
            renderNode.setHasOverlappingRendering(true);
            return;
        }
        if (androidx.compose.ui.graphics.CompositingStrategy.m6076equalsimpl0(i, androidx.compose.ui.graphics.CompositingStrategy.INSTANCE.m6081getModulateAlphaNrFUSI())) {
            renderNode.setLayerType(0);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final int getLayerType$ui() {
        return androidx.compose.ui.graphics.CompositingStrategy.m6076equalsimpl0(this.getInputFormats, androidx.compose.ui.graphics.CompositingStrategy.INSTANCE.m6082getOffscreenNrFUSI()) ? 2 : 0;
    }

    public final boolean hasOverlappingRendering$ui() {
        return this.getOutputStallDurationlomOqCM.hasOverlappingRendering();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final boolean getHasDisplayList() {
        return this.getOutputStallDurationlomOqCM.isValid();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setOutline(android.graphics.Outline outline) {
        this.getOutputStallDurationlomOqCM.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final boolean setPosition(int left, int top, int right, int bottom) {
        setLeft(left);
        setTop(top);
        setRight(right);
        setBottom(bottom);
        return this.getOutputStallDurationlomOqCM.setLeftTopRightBottom(left, top, right, bottom);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void offsetLeftAndRight(int offset) {
        setLeft(getGetOutputMinFrameDuration() + offset);
        setRight(getGetOutputSizeshNQ4ISI() + offset);
        this.getOutputStallDurationlomOqCM.offsetLeftAndRight(offset);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void offsetTopAndBottom(int offset) {
        setTop(getGetOutputMinFrameDurationlomOqCM() + offset);
        setBottom(getCamera2StreamConfigurationMap() + offset);
        this.getOutputStallDurationlomOqCM.offsetTopAndBottom(offset);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void record(androidx.compose.ui.graphics.CanvasHolder canvasHolder, androidx.compose.ui.graphics.Path clipPath, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.Canvas, kotlin.Unit> drawBlock) {
        android.view.DisplayListCanvas start = this.getOutputStallDurationlomOqCM.start(getWidth(), getHeight());
        android.graphics.Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas((android.graphics.Canvas) start);
        androidx.compose.ui.graphics.AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
        if (clipPath != null) {
            androidCanvas.save();
            androidx.compose.ui.graphics.Canvas.m5967clipPathmtrdDE$default(androidCanvas, clipPath, 0, 2, null);
        }
        drawBlock.invoke(androidCanvas);
        if (clipPath != null) {
            androidCanvas.restore();
        }
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        this.getOutputStallDurationlomOqCM.end(start);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void getMatrix(android.graphics.Matrix matrix) {
        this.getOutputStallDurationlomOqCM.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void getInverseMatrix(android.graphics.Matrix matrix) {
        this.getOutputStallDurationlomOqCM.getInverseMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void drawInto(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(canvas, "");
        ((android.view.DisplayListCanvas) canvas).drawRenderNode(this.getOutputStallDurationlomOqCM);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final boolean setHasOverlappingRendering(boolean hasOverlappingRendering) {
        return this.getOutputStallDurationlomOqCM.setHasOverlappingRendering(hasOverlappingRendering);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final androidx.compose.ui.platform.DeviceRenderNodeData dumpRenderNodeData() {
        return new androidx.compose.ui.platform.DeviceRenderNodeData(0L, 0, 0, 0, 0, 0, 0, this.getOutputStallDurationlomOqCM.getScaleX(), this.getOutputStallDurationlomOqCM.getScaleY(), this.getOutputStallDurationlomOqCM.getTranslationX(), this.getOutputStallDurationlomOqCM.getTranslationY(), this.getOutputStallDurationlomOqCM.getElevation(), getAmbientShadowColor(), getSpotShadowColor(), this.getOutputStallDurationlomOqCM.getRotation(), this.getOutputStallDurationlomOqCM.getRotationX(), this.getOutputStallDurationlomOqCM.getRotationY(), this.getOutputStallDurationlomOqCM.getCameraDistance(), this.getOutputStallDurationlomOqCM.getPivotX(), this.getOutputStallDurationlomOqCM.getPivotY(), this.getOutputStallDurationlomOqCM.getClipToOutline(), getGetHighSpeedVideoFpsRangesFor(), this.getOutputStallDurationlomOqCM.getAlpha(), getGetOutputFormats(), getGetHighSpeedVideoFpsRanges(), getGetHighResolutionOutputSizeshNQ4ISI(), this.getInputFormats, null);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void discardDisplayList() {
        getHighSpeedVideoFpsRangesFor();
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        androidx.compose.ui.platform.RenderNodeVerificationHelper24.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(this.getOutputStallDurationlomOqCM);
    }

    private final void Camera2StreamConfigurationMap(android.view.RenderNode renderNode) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            androidx.compose.ui.platform.RenderNodeVerificationHelper28 renderNodeVerificationHelper28 = androidx.compose.ui.platform.RenderNodeVerificationHelper28.getHighSpeedVideoSizes;
            androidx.compose.ui.platform.RenderNodeVerificationHelper28 renderNodeVerificationHelper282 = androidx.compose.ui.platform.RenderNodeVerificationHelper28.getHighSpeedVideoSizes;
            androidx.compose.ui.platform.RenderNodeVerificationHelper28.getHighSpeedVideoFpsRangesFor(renderNode, androidx.compose.ui.platform.RenderNodeVerificationHelper28.getHighResolutionOutputSizeshNQ4ISI(renderNode));
            androidx.compose.ui.platform.RenderNodeVerificationHelper28 renderNodeVerificationHelper283 = androidx.compose.ui.platform.RenderNodeVerificationHelper28.getHighSpeedVideoSizes;
            androidx.compose.ui.platform.RenderNodeVerificationHelper28 renderNodeVerificationHelper284 = androidx.compose.ui.platform.RenderNodeVerificationHelper28.getHighSpeedVideoSizes;
            androidx.compose.ui.platform.RenderNodeVerificationHelper28.getHighSpeedVideoFpsRanges(renderNode, androidx.compose.ui.platform.RenderNodeVerificationHelper28.Camera2StreamConfigurationMap(renderNode));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeApi23$Companion;", "", "<init>", "()V", "", "testFailCreateRenderNode", "Z", "getTestFailCreateRenderNode$ui", "()Z", "setTestFailCreateRenderNode$ui", "(Z)V", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean getTestFailCreateRenderNode$ui() {
            return androidx.compose.ui.platform.RenderNodeApi23.testFailCreateRenderNode;
        }

        public final void setTestFailCreateRenderNode$ui(boolean z) {
            androidx.compose.ui.platform.RenderNodeApi23.testFailCreateRenderNode = z;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
