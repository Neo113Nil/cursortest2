package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u000e\n\u0002\b<\b\u0080\b\u0018\u00002\u00020\u0001Bã\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u000b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b+\u0010*J\u0010\u0010,\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b,\u0010*J\u0010\u0010-\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b-\u0010*J\u0010\u0010.\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b.\u0010*J\u0010\u0010/\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b/\u0010*J\u0010\u00100\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b2\u00101J\u0010\u00103\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b3\u00101J\u0010\u00104\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b4\u00101J\u0010\u00105\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b5\u00101J\u0010\u00106\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b6\u0010*J\u0010\u00107\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b7\u0010*J\u0010\u00108\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b8\u00101J\u0010\u00109\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b9\u00101J\u0010\u0010:\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b:\u00101J\u0010\u0010;\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b;\u00101J\u0010\u0010<\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b<\u00101J\u0010\u0010=\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b=\u00101J\u0010\u0010>\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\b@\u0010?J\u0010\u0010A\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bA\u00101J\u0012\u0010B\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0010\u0010E\u001a\u00020\u001fHÆ\u0003¢\u0006\u0004\bD\u0010*J\u0012\u0010F\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0010\u0010I\u001a\u00020#HÆ\u0003¢\u0006\u0004\bH\u0010*J¢\u0002\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\b\b\u0002\u0010$\u001a\u00020#HÆ\u0001¢\u0006\u0004\bJ\u0010KJ\u001a\u0010N\u001a\u00020\u00192\b\u0010M\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bN\u0010OJ\u0010\u0010P\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bP\u0010*J\u0010\u0010R\u001a\u00020QHÖ\u0001¢\u0006\u0004\bR\u0010SR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010T\u001a\u0004\bU\u0010(R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010V\u001a\u0004\bW\u0010*R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010V\u001a\u0004\bX\u0010*R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010V\u001a\u0004\bY\u0010*R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010V\u001a\u0004\bZ\u0010*R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010V\u001a\u0004\b[\u0010*R\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010V\u001a\u0004\b\\\u0010*R\"\u0010\f\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010]\u001a\u0004\b^\u00101\"\u0004\b_\u0010`R\"\u0010\r\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010]\u001a\u0004\ba\u00101\"\u0004\bb\u0010`R\"\u0010\u000e\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010]\u001a\u0004\bc\u00101\"\u0004\bd\u0010`R\"\u0010\u000f\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010]\u001a\u0004\be\u00101\"\u0004\bf\u0010`R\"\u0010\u0010\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010]\u001a\u0004\bg\u00101\"\u0004\bh\u0010`R\"\u0010\u0011\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010V\u001a\u0004\bi\u0010*\"\u0004\bj\u0010kR\"\u0010\u0012\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010V\u001a\u0004\bl\u0010*\"\u0004\bm\u0010kR\"\u0010\u0013\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010]\u001a\u0004\bn\u00101\"\u0004\bo\u0010`R\"\u0010\u0014\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010]\u001a\u0004\bp\u00101\"\u0004\bq\u0010`R\"\u0010\u0015\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010]\u001a\u0004\br\u00101\"\u0004\bs\u0010`R\"\u0010\u0016\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010]\u001a\u0004\bt\u00101\"\u0004\bu\u0010`R\"\u0010\u0017\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010]\u001a\u0004\bv\u00101\"\u0004\bw\u0010`R\"\u0010\u0018\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010]\u001a\u0004\bx\u00101\"\u0004\by\u0010`R\"\u0010\u001a\u001a\u00020\u00198\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010z\u001a\u0004\b{\u0010?\"\u0004\b|\u0010}R\"\u0010\u001b\u001a\u00020\u00198\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010z\u001a\u0004\b~\u0010?\"\u0004\b\u007f\u0010}R$\u0010\u001c\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0014\n\u0004\b\u001c\u0010]\u001a\u0005\b\u0080\u0001\u00101\"\u0005\b\u0081\u0001\u0010`R(\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0007@\u0007X\u0087\u000e¢\u0006\u0016\n\u0005\b\u001e\u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u0010C\"\u0006\b\u0084\u0001\u0010\u0085\u0001R$\u0010 \u001a\u00020\u001f8\u0007@\u0007X\u0087\u000e¢\u0006\u0014\n\u0004\b \u0010V\u001a\u0005\b\u0086\u0001\u0010*\"\u0005\b\u0087\u0001\u0010kR(\u0010\"\u001a\u0004\u0018\u00010!8\u0007@\u0007X\u0087\u000e¢\u0006\u0016\n\u0005\b\"\u0010\u0088\u0001\u001a\u0005\b\u0089\u0001\u0010G\"\u0006\b\u008a\u0001\u0010\u008b\u0001R$\u0010$\u001a\u00020#8\u0007@\u0007X\u0087\u000e¢\u0006\u0014\n\u0004\b$\u0010V\u001a\u0005\b\u008c\u0001\u0010*\"\u0005\b\u008d\u0001\u0010k"}, d2 = {"Landroidx/compose/ui/platform/DeviceRenderNodeData;", "", "", "uniqueId", "", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, "width", "height", "", "scaleX", "scaleY", "translationX", "translationY", "elevation", "ambientShadowColor", "spotShadowColor", "rotationZ", "rotationX", "rotationY", "cameraDistance", "pivotX", "pivotY", "", "clipToOutline", "clipToBounds", "alpha", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/CompositingStrategy;", "compositingStrategy", "<init>", "(JIIIIIIFFFFFIIFFFFFFZZFLandroidx/compose/ui/graphics/RenderEffect;ILandroidx/compose/ui/graphics/ColorFilter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()J", "component2", "()I", "component3", "component4", "component5", "component6", "component7", "component8", "()F", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "()Z", "component22", "component23", "component24", "()Landroidx/compose/ui/graphics/RenderEffect;", "component25-0nO6VwU", "component25", "component26", "()Landroidx/compose/ui/graphics/ColorFilter;", "component27--NrFUSI", "component27", "copy-qCc9W8c", "(JIIIIIIFFFFFIIFFFFFFZZFLandroidx/compose/ui/graphics/RenderEffect;ILandroidx/compose/ui/graphics/ColorFilter;I)Landroidx/compose/ui/platform/DeviceRenderNodeData;", "copy", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "J", "getUniqueId", com.visa.cbp.getEncExpo.warmup, "getLeft", "getTop", "getRight", "getBottom", "getWidth", "getHeight", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getScaleX", "setScaleX", "(F)V", "getScaleY", "setScaleY", "getTranslationX", "setTranslationX", "getTranslationY", "setTranslationY", "getElevation", "setElevation", "getAmbientShadowColor", "setAmbientShadowColor", "(I)V", "getSpotShadowColor", "setSpotShadowColor", "getRotationZ", "setRotationZ", "getRotationX", "setRotationX", "getRotationY", "setRotationY", "getCameraDistance", "setCameraDistance", "getPivotX", "setPivotX", "getPivotY", "setPivotY", "Z", "getClipToOutline", "setClipToOutline", "(Z)V", "getClipToBounds", "setClipToBounds", "getAlpha", "setAlpha", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "getBlendMode-0nO6VwU", "setBlendMode-s9anfk8", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "getCompositingStrategy--NrFUSI", "setCompositingStrategy-aDBOjCE"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class DeviceRenderNodeData {
    public static final int $stable = 8;
    private float alpha;
    private int ambientShadowColor;
    private int blendMode;
    private final int bottom;
    private float cameraDistance;
    private boolean clipToBounds;
    private boolean clipToOutline;
    private androidx.compose.ui.graphics.ColorFilter colorFilter;
    private int compositingStrategy;
    private float elevation;
    private final int height;
    private final int left;
    private float pivotX;
    private float pivotY;
    private androidx.compose.ui.graphics.RenderEffect renderEffect;
    private final int right;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private int spotShadowColor;
    private final int top;
    private float translationX;
    private float translationY;
    private final long uniqueId;
    private final int width;

    private DeviceRenderNodeData(long j, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2, float f3, float f4, float f5, int i7, int i8, float f6, float f7, float f8, float f9, float f10, float f11, boolean z, boolean z2, float f12, androidx.compose.ui.graphics.RenderEffect renderEffect, int i9, androidx.compose.ui.graphics.ColorFilter colorFilter, int i10) {
        this.uniqueId = j;
        this.left = i;
        this.top = i2;
        this.right = i3;
        this.bottom = i4;
        this.width = i5;
        this.height = i6;
        this.scaleX = f;
        this.scaleY = f2;
        this.translationX = f3;
        this.translationY = f4;
        this.elevation = f5;
        this.ambientShadowColor = i7;
        this.spotShadowColor = i8;
        this.rotationZ = f6;
        this.rotationX = f7;
        this.rotationY = f8;
        this.cameraDistance = f9;
        this.pivotX = f10;
        this.pivotY = f11;
        this.clipToOutline = z;
        this.clipToBounds = z2;
        this.alpha = f12;
        this.renderEffect = renderEffect;
        this.blendMode = i9;
        this.colorFilter = colorFilter;
        this.compositingStrategy = i10;
    }

    public final long getUniqueId() {
        return this.uniqueId;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getTop() {
        return this.top;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final void setScaleX(float f) {
        this.scaleX = f;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final void setScaleY(float f) {
        this.scaleY = f;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final void setTranslationX(float f) {
        this.translationX = f;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final void setTranslationY(float f) {
        this.translationY = f;
    }

    public final float getElevation() {
        return this.elevation;
    }

    public final void setElevation(float f) {
        this.elevation = f;
    }

    public final int getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    public final void setAmbientShadowColor(int i) {
        this.ambientShadowColor = i;
    }

    public final int getSpotShadowColor() {
        return this.spotShadowColor;
    }

    public final void setSpotShadowColor(int i) {
        this.spotShadowColor = i;
    }

    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final void setRotationZ(float f) {
        this.rotationZ = f;
    }

    public final float getRotationX() {
        return this.rotationX;
    }

    public final void setRotationX(float f) {
        this.rotationX = f;
    }

    public final float getRotationY() {
        return this.rotationY;
    }

    public final void setRotationY(float f) {
        this.rotationY = f;
    }

    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    public final void setCameraDistance(float f) {
        this.cameraDistance = f;
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final void setPivotX(float f) {
        this.pivotX = f;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    public final void setPivotY(float f) {
        this.pivotY = f;
    }

    public final boolean getClipToOutline() {
        return this.clipToOutline;
    }

    public final void setClipToOutline(boolean z) {
        this.clipToOutline = z;
    }

    public final boolean getClipToBounds() {
        return this.clipToBounds;
    }

    public final void setClipToBounds(boolean z) {
        this.clipToBounds = z;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final void setAlpha(float f) {
        this.alpha = f;
    }

    public final androidx.compose.ui.graphics.RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    public final void setRenderEffect(androidx.compose.ui.graphics.RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m7747getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public final void m7749setBlendModes9anfk8(int i) {
        this.blendMode = i;
    }

    public final androidx.compose.ui.graphics.ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    public final void setColorFilter(androidx.compose.ui.graphics.ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    public final int m7748getCompositingStrategyNrFUSI() {
        return this.compositingStrategy;
    }

    /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    public final void m7750setCompositingStrategyaDBOjCE(int i) {
        this.compositingStrategy = i;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeviceRenderNodeData(uniqueId=");
        sb.append(this.uniqueId);
        sb.append(", left=");
        sb.append(this.left);
        sb.append(", top=");
        sb.append(this.top);
        sb.append(", right=");
        sb.append(this.right);
        sb.append(", bottom=");
        sb.append(this.bottom);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", scaleX=");
        sb.append(this.scaleX);
        sb.append(", scaleY=");
        sb.append(this.scaleY);
        sb.append(", translationX=");
        sb.append(this.translationX);
        sb.append(", translationY=");
        sb.append(this.translationY);
        sb.append(", elevation=");
        sb.append(this.elevation);
        sb.append(", ambientShadowColor=");
        sb.append(this.ambientShadowColor);
        sb.append(", spotShadowColor=");
        sb.append(this.spotShadowColor);
        sb.append(", rotationZ=");
        sb.append(this.rotationZ);
        sb.append(", rotationX=");
        sb.append(this.rotationX);
        sb.append(", rotationY=");
        sb.append(this.rotationY);
        sb.append(", cameraDistance=");
        sb.append(this.cameraDistance);
        sb.append(", pivotX=");
        sb.append(this.pivotX);
        sb.append(", pivotY=");
        sb.append(this.pivotY);
        sb.append(", clipToOutline=");
        sb.append(this.clipToOutline);
        sb.append(", clipToBounds=");
        sb.append(this.clipToBounds);
        sb.append(", alpha=");
        sb.append(this.alpha);
        sb.append(", renderEffect=");
        sb.append(this.renderEffect);
        sb.append(", blendMode=");
        sb.append((java.lang.Object) androidx.compose.ui.graphics.BlendMode.m5908toStringimpl(this.blendMode));
        sb.append(", colorFilter=");
        sb.append(this.colorFilter);
        sb.append(", compositingStrategy=");
        sb.append((java.lang.Object) androidx.compose.ui.graphics.CompositingStrategy.m6078toStringimpl(this.compositingStrategy));
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Long.hashCode(this.uniqueId);
        int hashCode2 = java.lang.Integer.hashCode(this.left);
        int hashCode3 = java.lang.Integer.hashCode(this.top);
        int hashCode4 = java.lang.Integer.hashCode(this.right);
        int hashCode5 = java.lang.Integer.hashCode(this.bottom);
        int hashCode6 = java.lang.Integer.hashCode(this.width);
        int hashCode7 = java.lang.Integer.hashCode(this.height);
        int hashCode8 = java.lang.Float.hashCode(this.scaleX);
        int hashCode9 = java.lang.Float.hashCode(this.scaleY);
        int hashCode10 = java.lang.Float.hashCode(this.translationX);
        int hashCode11 = java.lang.Float.hashCode(this.translationY);
        int hashCode12 = java.lang.Float.hashCode(this.elevation);
        int hashCode13 = java.lang.Integer.hashCode(this.ambientShadowColor);
        int hashCode14 = java.lang.Integer.hashCode(this.spotShadowColor);
        int hashCode15 = java.lang.Float.hashCode(this.rotationZ);
        int hashCode16 = java.lang.Float.hashCode(this.rotationX);
        int hashCode17 = java.lang.Float.hashCode(this.rotationY);
        int hashCode18 = java.lang.Float.hashCode(this.cameraDistance);
        int hashCode19 = java.lang.Float.hashCode(this.pivotX);
        int hashCode20 = java.lang.Float.hashCode(this.pivotY);
        int hashCode21 = java.lang.Boolean.hashCode(this.clipToOutline);
        int hashCode22 = java.lang.Boolean.hashCode(this.clipToBounds);
        int hashCode23 = java.lang.Float.hashCode(this.alpha);
        androidx.compose.ui.graphics.RenderEffect renderEffect = this.renderEffect;
        int hashCode24 = renderEffect == null ? 0 : renderEffect.hashCode();
        int m5907hashCodeimpl = androidx.compose.ui.graphics.BlendMode.m5907hashCodeimpl(this.blendMode);
        androidx.compose.ui.graphics.ColorFilter colorFilter = this.colorFilter;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + hashCode20) * 31) + hashCode21) * 31) + hashCode22) * 31) + hashCode23) * 31) + hashCode24) * 31) + m5907hashCodeimpl) * 31) + (colorFilter != null ? colorFilter.hashCode() : 0)) * 31) + androidx.compose.ui.graphics.CompositingStrategy.m6077hashCodeimpl(this.compositingStrategy);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.platform.DeviceRenderNodeData)) {
            return false;
        }
        androidx.compose.ui.platform.DeviceRenderNodeData deviceRenderNodeData = (androidx.compose.ui.platform.DeviceRenderNodeData) other;
        return this.uniqueId == deviceRenderNodeData.uniqueId && this.left == deviceRenderNodeData.left && this.top == deviceRenderNodeData.top && this.right == deviceRenderNodeData.right && this.bottom == deviceRenderNodeData.bottom && this.width == deviceRenderNodeData.width && this.height == deviceRenderNodeData.height && java.lang.Float.compare(this.scaleX, deviceRenderNodeData.scaleX) == 0 && java.lang.Float.compare(this.scaleY, deviceRenderNodeData.scaleY) == 0 && java.lang.Float.compare(this.translationX, deviceRenderNodeData.translationX) == 0 && java.lang.Float.compare(this.translationY, deviceRenderNodeData.translationY) == 0 && java.lang.Float.compare(this.elevation, deviceRenderNodeData.elevation) == 0 && this.ambientShadowColor == deviceRenderNodeData.ambientShadowColor && this.spotShadowColor == deviceRenderNodeData.spotShadowColor && java.lang.Float.compare(this.rotationZ, deviceRenderNodeData.rotationZ) == 0 && java.lang.Float.compare(this.rotationX, deviceRenderNodeData.rotationX) == 0 && java.lang.Float.compare(this.rotationY, deviceRenderNodeData.rotationY) == 0 && java.lang.Float.compare(this.cameraDistance, deviceRenderNodeData.cameraDistance) == 0 && java.lang.Float.compare(this.pivotX, deviceRenderNodeData.pivotX) == 0 && java.lang.Float.compare(this.pivotY, deviceRenderNodeData.pivotY) == 0 && this.clipToOutline == deviceRenderNodeData.clipToOutline && this.clipToBounds == deviceRenderNodeData.clipToBounds && java.lang.Float.compare(this.alpha, deviceRenderNodeData.alpha) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.renderEffect, deviceRenderNodeData.renderEffect) && androidx.compose.ui.graphics.BlendMode.m5906equalsimpl0(this.blendMode, deviceRenderNodeData.blendMode) && kotlin.jvm.internal.Intrinsics.areEqual(this.colorFilter, deviceRenderNodeData.colorFilter) && androidx.compose.ui.graphics.CompositingStrategy.m6076equalsimpl0(this.compositingStrategy, deviceRenderNodeData.compositingStrategy);
    }

    /* renamed from: copy-qCc9W8c, reason: not valid java name */
    public final androidx.compose.ui.platform.DeviceRenderNodeData m7746copyqCc9W8c(long uniqueId, int left, int top, int right, int bottom, int width, int height, float scaleX, float scaleY, float translationX, float translationY, float elevation, int ambientShadowColor, int spotShadowColor, float rotationZ, float rotationX, float rotationY, float cameraDistance, float pivotX, float pivotY, boolean clipToOutline, boolean clipToBounds, float alpha, androidx.compose.ui.graphics.RenderEffect renderEffect, int blendMode, androidx.compose.ui.graphics.ColorFilter colorFilter, int compositingStrategy) {
        return new androidx.compose.ui.platform.DeviceRenderNodeData(uniqueId, left, top, right, bottom, width, height, scaleX, scaleY, translationX, translationY, elevation, ambientShadowColor, spotShadowColor, rotationZ, rotationX, rotationY, cameraDistance, pivotX, pivotY, clipToOutline, clipToBounds, alpha, renderEffect, blendMode, colorFilter, compositingStrategy, null);
    }

    /* renamed from: component9, reason: from getter */
    public final float getScaleY() {
        return this.scaleY;
    }

    /* renamed from: component8, reason: from getter */
    public final float getScaleX() {
        return this.scaleX;
    }

    /* renamed from: component7, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: component6, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component5, reason: from getter */
    public final int getBottom() {
        return this.bottom;
    }

    /* renamed from: component4, reason: from getter */
    public final int getRight() {
        return this.right;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTop() {
        return this.top;
    }

    /* renamed from: component27--NrFUSI, reason: not valid java name and from getter */
    public final int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    /* renamed from: component26, reason: from getter */
    public final androidx.compose.ui.graphics.ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    /* renamed from: component25-0nO6VwU, reason: not valid java name and from getter */
    public final int getBlendMode() {
        return this.blendMode;
    }

    /* renamed from: component24, reason: from getter */
    public final androidx.compose.ui.graphics.RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    /* renamed from: component23, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getClipToBounds() {
        return this.clipToBounds;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getClipToOutline() {
        return this.clipToOutline;
    }

    /* renamed from: component20, reason: from getter */
    public final float getPivotY() {
        return this.pivotY;
    }

    /* renamed from: component2, reason: from getter */
    public final int getLeft() {
        return this.left;
    }

    /* renamed from: component19, reason: from getter */
    public final float getPivotX() {
        return this.pivotX;
    }

    /* renamed from: component18, reason: from getter */
    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    /* renamed from: component17, reason: from getter */
    public final float getRotationY() {
        return this.rotationY;
    }

    /* renamed from: component16, reason: from getter */
    public final float getRotationX() {
        return this.rotationX;
    }

    /* renamed from: component15, reason: from getter */
    public final float getRotationZ() {
        return this.rotationZ;
    }

    /* renamed from: component14, reason: from getter */
    public final int getSpotShadowColor() {
        return this.spotShadowColor;
    }

    /* renamed from: component13, reason: from getter */
    public final int getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    /* renamed from: component12, reason: from getter */
    public final float getElevation() {
        return this.elevation;
    }

    /* renamed from: component11, reason: from getter */
    public final float getTranslationY() {
        return this.translationY;
    }

    /* renamed from: component10, reason: from getter */
    public final float getTranslationX() {
        return this.translationX;
    }

    /* renamed from: component1, reason: from getter */
    public final long getUniqueId() {
        return this.uniqueId;
    }

    public /* synthetic */ DeviceRenderNodeData(long j, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2, float f3, float f4, float f5, int i7, int i8, float f6, float f7, float f8, float f9, float f10, float f11, boolean z, boolean z2, float f12, androidx.compose.ui.graphics.RenderEffect renderEffect, int i9, androidx.compose.ui.graphics.ColorFilter colorFilter, int i10, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, i2, i3, i4, i5, i6, f, f2, f3, f4, f5, i7, i8, f6, f7, f8, f9, f10, f11, z, z2, f12, renderEffect, i9, colorFilter, i10);
    }
}
