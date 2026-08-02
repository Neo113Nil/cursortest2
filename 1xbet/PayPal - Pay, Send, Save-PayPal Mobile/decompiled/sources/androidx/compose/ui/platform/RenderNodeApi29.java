package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\n*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010 \u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001bH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u001bH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u001bH\u0016¢\u0006\u0004\b%\u0010$J5\u0010-\u001a\u00020\n2\u0006\u0010'\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010(2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\n0*H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\n2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\n2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b3\u00102J\u0017\u00106\u001a\u00020\n2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u0006H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\nH\u0016¢\u0006\u0004\b>\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010\u000b\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010BR\u0018\u0010E\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010DR\u0016\u0010\u000e\u001a\u00020\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010GR\u0014\u0010K\u001a\u00020H8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010\u001c\u001a\u00020\u001b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010\u001d\u001a\u00020\u001b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010MR\u0014\u0010\u001e\u001a\u00020\u001b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010MR\u0014\u0010\u001f\u001a\u00020\u001b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010MR\u0014\u0010R\u001a\u00020\u001b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010MR\u0014\u0010T\u001a\u00020\u001b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010MR$\u0010[\u001a\u00020U2\u0006\u0010V\u001a\u00020U8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR$\u0010^\u001a\u00020U2\u0006\u0010V\u001a\u00020U8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\\\u0010X\"\u0004\b]\u0010ZR$\u0010a\u001a\u00020U2\u0006\u0010V\u001a\u00020U8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b_\u0010X\"\u0004\b`\u0010ZR$\u0010d\u001a\u00020U2\u0006\u0010V\u001a\u00020U8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bb\u0010X\"\u0004\bc\u0010ZR$\u0010g\u001a\u00020U2\u0006\u0010V\u001a\u00020U8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\be\u0010X\"\u0004\bf\u0010ZR$\u0010j\u001a\u00020\u001b2\u0006\u0010V\u001a\u00020\u001b8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bh\u0010M\"\u0004\bi\u0010$R$\u0010m\u001a\u00020\u001b2\u0006\u0010V\u001a\u00020\u001b8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bk\u0010M\"\u0004\bl\u0010$R$\u0010p\u001a\u00020U2\u0006\u0010V\u001a\u00020U8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bn\u0010X\"\u0004\bo\u0010ZR$\u0010s\u001a\u00020U2\u0006\u0010V\u001a\u00020U8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bq\u0010X\"\u0004\br\u0010ZR$\u0010v\u001a\u00020U2\u0006\u0010V\u001a\u00020U8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bt\u0010X\"\u0004\bu\u0010ZR$\u0010y\u001a\u00020U2\u0006\u0010V\u001a\u00020U8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bw\u0010X\"\u0004\bx\u0010ZR$\u0010|\u001a\u00020U2\u0006\u0010V\u001a\u00020U8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bz\u0010X\"\u0004\b{\u0010ZR$\u0010\u007f\u001a\u00020U2\u0006\u0010V\u001a\u00020U8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b}\u0010X\"\u0004\b~\u0010ZR(\u0010\u0083\u0001\u001a\u00020\u00062\u0006\u0010V\u001a\u00020\u00068W@WX\u0096\u000e¢\u0006\u000f\u001a\u0005\b\u0080\u0001\u0010\b\"\u0006\b\u0081\u0001\u0010\u0082\u0001R(\u0010\u0086\u0001\u001a\u00020\u00062\u0006\u0010V\u001a\u00020\u00068W@WX\u0096\u000e¢\u0006\u000f\u001a\u0005\b\u0084\u0001\u0010\b\"\u0006\b\u0085\u0001\u0010\u0082\u0001R'\u0010\u0089\u0001\u001a\u00020U2\u0006\u0010V\u001a\u00020U8W@WX\u0096\u000e¢\u0006\u000e\u001a\u0005\b\u0087\u0001\u0010X\"\u0005\b\u0088\u0001\u0010ZR0\u0010\u008b\u0001\u001a\u00030\u008a\u00012\u0007\u0010V\u001a\u00030\u008a\u00018\u0017@WX\u0097\u000e¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010F\u001a\u0005\b\u008c\u0001\u0010M\"\u0005\b\u008d\u0001\u0010$R7\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008e\u00012\t\u0010V\u001a\u0005\u0018\u00010\u008e\u00018\u0017@WX\u0097\u000e¢\u0006\u0018\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R-\u0010\u0099\u0001\u001a\u0004\u0018\u00010C2\b\u0010V\u001a\u0004\u0018\u00010C8W@WX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R'\u0010\u009c\u0001\u001a\u00020\u00132\u0006\u0010V\u001a\u00020\u00138W@WX\u0096\u000e¢\u0006\u000e\u001a\u0005\b\u009a\u0001\u0010M\"\u0005\b\u009b\u0001\u0010$R\u0016\u0010\u009e\u0001\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010\b"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeApi29;", "Landroidx/compose/ui/platform/DeviceRenderNode;", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "", "isUsingCompositingLayer$ui", "()Z", "hasOverlappingRendering$ui", "", "getHighResolutionOutputSizeshNQ4ISI", "()V", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Landroidx/compose/ui/graphics/Paint;", "getHighSpeedVideoFpsRangesFor", "()Landroidx/compose/ui/graphics/Paint;", "Landroid/graphics/RenderNode;", "Landroidx/compose/ui/graphics/CompositingStrategy;", "p0", "aL_", "(Landroid/graphics/RenderNode;I)V", "Landroid/graphics/Outline;", "outline", "setOutline", "(Landroid/graphics/Outline;)V", "", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, "setPosition", "(IIII)Z", "offset", "offsetLeftAndRight", "(I)V", "offsetTopAndBottom", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "Landroidx/compose/ui/graphics/Path;", "clipPath", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "drawBlock", "record", "(Landroidx/compose/ui/graphics/CanvasHolder;Landroidx/compose/ui/graphics/Path;Lkotlin/jvm/functions/Function1;)V", "Landroid/graphics/Matrix;", "matrix", "getMatrix", "(Landroid/graphics/Matrix;)V", "getInverseMatrix", "Landroid/graphics/Canvas;", "canvas", "drawInto", "(Landroid/graphics/Canvas;)V", "hasOverlappingRendering", "setHasOverlappingRendering", "(Z)Z", "Landroidx/compose/ui/platform/DeviceRenderNodeData;", "dumpRenderNodeData", "()Landroidx/compose/ui/platform/DeviceRenderNodeData;", "discardDisplayList", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/graphics/RenderNode;", "Landroidx/compose/ui/graphics/RenderEffect;", "Landroidx/compose/ui/graphics/RenderEffect;", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "Landroidx/compose/ui/graphics/Paint;", "", "getUniqueId", "()J", "uniqueId", "getLeft", "()I", "getTop", "getRight", "getBottom", "getWidth", "width", "getHeight", "height", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getScaleX", "()F", "setScaleX", "(F)V", "scaleX", "getScaleY", "setScaleY", "scaleY", "getTranslationX", "setTranslationX", "translationX", "getTranslationY", "setTranslationY", "translationY", "getElevation", "setElevation", "elevation", "getAmbientShadowColor", "setAmbientShadowColor", "ambientShadowColor", "getSpotShadowColor", "setSpotShadowColor", "spotShadowColor", "getRotationZ", "setRotationZ", "rotationZ", "getRotationX", "setRotationX", "rotationX", "getRotationY", "setRotationY", "rotationY", "getCameraDistance", "setCameraDistance", "cameraDistance", "getPivotX", "setPivotX", "pivotX", "getPivotY", "setPivotY", "pivotY", "getClipToOutline", "setClipToOutline", "(Z)V", "clipToOutline", "getClipToBounds", "setClipToBounds", "clipToBounds", "getAlpha", "setAlpha", "alpha", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "getBlendMode-0nO6VwU", "setBlendMode-s9anfk8", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "renderEffect", "getCompositingStrategy--NrFUSI", "setCompositingStrategy-aDBOjCE", "compositingStrategy", "getHasDisplayList", "hasDisplayList"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RenderNodeApi29 implements androidx.compose.ui.platform.DeviceRenderNode {
    public static final int $stable = 8;
    private androidx.compose.ui.graphics.ColorFilter colorFilter;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.RenderEffect Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.Paint getHighSpeedVideoFpsRangesFor;
    private final androidx.compose.ui.platform.AndroidComposeView ownerView;
    private final android.graphics.RenderNode getHighResolutionOutputSizeshNQ4ISI = new android.graphics.RenderNode("Compose");

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private int getHighSpeedVideoSizes = androidx.compose.ui.graphics.CompositingStrategy.INSTANCE.m6080getAutoNrFUSI();
    private int blendMode = androidx.compose.ui.graphics.BlendMode.INSTANCE.m5937getSrcOver0nO6VwU();

    public RenderNodeApi29(androidx.compose.ui.platform.AndroidComposeView androidComposeView) {
        this.ownerView = androidComposeView;
    }

    public final androidx.compose.ui.platform.AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    public final boolean isUsingCompositingLayer$ui() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getUseCompositingLayer();
    }

    public final boolean hasOverlappingRendering$ui() {
        return this.getHighResolutionOutputSizeshNQ4ISI.hasOverlappingRendering();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final long getUniqueId() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getUniqueId();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int getLeft() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getLeft();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int getTop() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getTop();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int getRight() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getRight();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int getBottom() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getBottom();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int getWidth() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getWidth();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int getHeight() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getHeight();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float getScaleX() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getScaleX();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setScaleX(float f) {
        this.getHighResolutionOutputSizeshNQ4ISI.setScaleX(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float getScaleY() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getScaleY();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setScaleY(float f) {
        this.getHighResolutionOutputSizeshNQ4ISI.setScaleY(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float getTranslationX() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getTranslationX();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setTranslationX(float f) {
        this.getHighResolutionOutputSizeshNQ4ISI.setTranslationX(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float getTranslationY() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getTranslationY();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setTranslationY(float f) {
        this.getHighResolutionOutputSizeshNQ4ISI.setTranslationY(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float getElevation() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getElevation();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setElevation(float f) {
        this.getHighResolutionOutputSizeshNQ4ISI.setElevation(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int getAmbientShadowColor() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getAmbientShadowColor();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setAmbientShadowColor(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI.setAmbientShadowColor(i);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int getSpotShadowColor() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getSpotShadowColor();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setSpotShadowColor(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI.setSpotShadowColor(i);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float getRotationZ() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getRotationZ();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setRotationZ(float f) {
        this.getHighResolutionOutputSizeshNQ4ISI.setRotationZ(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float getRotationX() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getRotationX();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setRotationX(float f) {
        this.getHighResolutionOutputSizeshNQ4ISI.setRotationX(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float getRotationY() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getRotationY();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setRotationY(float f) {
        this.getHighResolutionOutputSizeshNQ4ISI.setRotationY(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float getCameraDistance() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getCameraDistance();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setCameraDistance(float f) {
        this.getHighResolutionOutputSizeshNQ4ISI.setCameraDistance(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float getPivotX() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getPivotX();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setPivotX(float f) {
        this.getHighResolutionOutputSizeshNQ4ISI.setPivotX(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float getPivotY() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getPivotY();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setPivotY(float f) {
        this.getHighResolutionOutputSizeshNQ4ISI.setPivotY(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final boolean getClipToOutline() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setClipToOutline(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI.setClipToOutline(z);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final boolean getClipToBounds() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getClipToBounds();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setClipToBounds(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI.setClipToBounds(z);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float getAlpha() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getAlpha();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setAlpha(float f) {
        this.getHighResolutionOutputSizeshNQ4ISI.setAlpha(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* renamed from: getBlendMode-0nO6VwU, reason: from getter */
    public final int getBlendMode() {
        return this.blendMode;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* renamed from: setBlendMode-s9anfk8 */
    public final void mo7741setBlendModes9anfk8(int i) {
        this.blendMode = i;
        getHighSpeedVideoFpsRangesFor().mo5872setBlendModes9anfk8(i);
        getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final androidx.compose.ui.graphics.ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setColorFilter(androidx.compose.ui.graphics.ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        getHighSpeedVideoFpsRangesFor().setColorFilter(colorFilter);
        getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* renamed from: getRenderEffect, reason: from getter */
    public final androidx.compose.ui.graphics.RenderEffect getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setRenderEffect(androidx.compose.ui.graphics.RenderEffect renderEffect) {
        this.Camera2StreamConfigurationMap = renderEffect;
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            androidx.compose.ui.platform.RenderNodeApi29VerificationHelper.INSTANCE.aM_(this.getHighResolutionOutputSizeshNQ4ISI, renderEffect);
        }
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* renamed from: getCompositingStrategy--NrFUSI, reason: from getter */
    public final int getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* renamed from: setCompositingStrategy-aDBOjCE */
    public final void mo7742setCompositingStrategyaDBOjCE(int i) {
        this.getHighSpeedVideoSizes = i;
        getHighResolutionOutputSizeshNQ4ISI();
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        if (getHighSpeedVideoFpsRanges()) {
            aL_(this.getHighResolutionOutputSizeshNQ4ISI, androidx.compose.ui.graphics.CompositingStrategy.INSTANCE.m6082getOffscreenNrFUSI());
        } else {
            aL_(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
        }
    }

    private final boolean getHighSpeedVideoFpsRanges() {
        return androidx.compose.ui.graphics.CompositingStrategy.m6076equalsimpl0(getGetHighSpeedVideoSizes(), androidx.compose.ui.graphics.CompositingStrategy.INSTANCE.m6082getOffscreenNrFUSI()) || getHighSpeedVideoSizes();
    }

    private final boolean getHighSpeedVideoSizes() {
        return (androidx.compose.ui.graphics.BlendMode.m5906equalsimpl0(getBlendMode(), androidx.compose.ui.graphics.BlendMode.INSTANCE.m5937getSrcOver0nO6VwU()) && getColorFilter() == null) ? false : true;
    }

    private final androidx.compose.ui.graphics.Paint getHighSpeedVideoFpsRangesFor() {
        androidx.compose.ui.graphics.Paint paint = this.getHighSpeedVideoFpsRangesFor;
        if (paint != null) {
            return paint;
        }
        androidx.compose.ui.graphics.Paint Paint = androidx.compose.ui.graphics.AndroidPaint_androidKt.Paint();
        this.getHighSpeedVideoFpsRangesFor = Paint;
        return Paint;
    }

    private final void aL_(android.graphics.RenderNode renderNode, int i) {
        if (androidx.compose.ui.graphics.CompositingStrategy.m6076equalsimpl0(i, androidx.compose.ui.graphics.CompositingStrategy.INSTANCE.m6082getOffscreenNrFUSI())) {
            androidx.compose.ui.graphics.Paint paint = this.getHighSpeedVideoFpsRangesFor;
            renderNode.setUseCompositingLayer(true, paint != null ? paint.getGetHighSpeedVideoFpsRangesFor() : null);
            renderNode.setHasOverlappingRendering(true);
        } else if (androidx.compose.ui.graphics.CompositingStrategy.m6076equalsimpl0(i, androidx.compose.ui.graphics.CompositingStrategy.INSTANCE.m6081getModulateAlphaNrFUSI())) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final boolean getHasDisplayList() {
        return this.getHighResolutionOutputSizeshNQ4ISI.hasDisplayList();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setOutline(android.graphics.Outline outline) {
        this.getHighResolutionOutputSizeshNQ4ISI.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final boolean setPosition(int left, int top, int right, int bottom) {
        return this.getHighResolutionOutputSizeshNQ4ISI.setPosition(left, top, right, bottom);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void offsetLeftAndRight(int offset) {
        this.getHighResolutionOutputSizeshNQ4ISI.offsetLeftAndRight(offset);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void offsetTopAndBottom(int offset) {
        this.getHighResolutionOutputSizeshNQ4ISI.offsetTopAndBottom(offset);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void record(androidx.compose.ui.graphics.CanvasHolder canvasHolder, androidx.compose.ui.graphics.Path clipPath, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.Canvas, kotlin.Unit> drawBlock) {
        android.graphics.RecordingCanvas beginRecording = this.getHighResolutionOutputSizeshNQ4ISI.beginRecording();
        android.graphics.Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(beginRecording);
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
        this.getHighResolutionOutputSizeshNQ4ISI.endRecording();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void getMatrix(android.graphics.Matrix matrix) {
        this.getHighResolutionOutputSizeshNQ4ISI.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void getInverseMatrix(android.graphics.Matrix matrix) {
        this.getHighResolutionOutputSizeshNQ4ISI.getInverseMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void drawInto(android.graphics.Canvas canvas) {
        canvas.drawRenderNode(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final boolean setHasOverlappingRendering(boolean hasOverlappingRendering) {
        return this.getHighResolutionOutputSizeshNQ4ISI.setHasOverlappingRendering(hasOverlappingRendering);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final androidx.compose.ui.platform.DeviceRenderNodeData dumpRenderNodeData() {
        return new androidx.compose.ui.platform.DeviceRenderNodeData(this.getHighResolutionOutputSizeshNQ4ISI.getUniqueId(), this.getHighResolutionOutputSizeshNQ4ISI.getLeft(), this.getHighResolutionOutputSizeshNQ4ISI.getTop(), this.getHighResolutionOutputSizeshNQ4ISI.getRight(), this.getHighResolutionOutputSizeshNQ4ISI.getBottom(), this.getHighResolutionOutputSizeshNQ4ISI.getWidth(), this.getHighResolutionOutputSizeshNQ4ISI.getHeight(), this.getHighResolutionOutputSizeshNQ4ISI.getScaleX(), this.getHighResolutionOutputSizeshNQ4ISI.getScaleY(), this.getHighResolutionOutputSizeshNQ4ISI.getTranslationX(), this.getHighResolutionOutputSizeshNQ4ISI.getTranslationY(), this.getHighResolutionOutputSizeshNQ4ISI.getElevation(), this.getHighResolutionOutputSizeshNQ4ISI.getAmbientShadowColor(), this.getHighResolutionOutputSizeshNQ4ISI.getSpotShadowColor(), this.getHighResolutionOutputSizeshNQ4ISI.getRotationZ(), this.getHighResolutionOutputSizeshNQ4ISI.getRotationX(), this.getHighResolutionOutputSizeshNQ4ISI.getRotationY(), this.getHighResolutionOutputSizeshNQ4ISI.getCameraDistance(), this.getHighResolutionOutputSizeshNQ4ISI.getPivotX(), this.getHighResolutionOutputSizeshNQ4ISI.getPivotY(), this.getHighResolutionOutputSizeshNQ4ISI.getClipToOutline(), this.getHighResolutionOutputSizeshNQ4ISI.getClipToBounds(), this.getHighResolutionOutputSizeshNQ4ISI.getAlpha(), this.Camera2StreamConfigurationMap, getBlendMode(), getColorFilter(), this.getHighSpeedVideoSizes, null);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void discardDisplayList() {
        this.getHighResolutionOutputSizeshNQ4ISI.discardDisplayList();
    }
}
