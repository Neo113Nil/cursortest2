package androidx.compose.ui.graphics.layer;

@kotlin.Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b`\u0018\u0000 {2\u00020\u0001:\u0001{J'\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ!\u0010\u0010\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u0005H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00070\u001b¢\u0006\u0002\b\u001dH&¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0007H&¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H&¢\u0006\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8'X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020&8'X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010(R\u001c\u00101\u001a\u00020,8'@'X¦\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u00106\u001a\u0002028'@'X¦\u000e¢\u0006\f\u001a\u0004\b3\u0010(\"\u0004\b4\u00105R\u001c\u0010<\u001a\u0002078'@'X¦\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001c\u0010@\u001a\u00020=8'@'X¦\u000e¢\u0006\f\u001a\u0004\b>\u0010.\"\u0004\b?\u00100R\u001e\u0010F\u001a\u0004\u0018\u00010A8'@'X¦\u000e¢\u0006\f\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001c\u0010I\u001a\u0002078'@'X¦\u000e¢\u0006\f\u001a\u0004\bG\u00109\"\u0004\bH\u0010;R\u001c\u0010L\u001a\u0002078'@'X¦\u000e¢\u0006\f\u001a\u0004\bJ\u00109\"\u0004\bK\u0010;R\u001c\u0010O\u001a\u0002078'@'X¦\u000e¢\u0006\f\u001a\u0004\bM\u00109\"\u0004\bN\u0010;R\u001c\u0010R\u001a\u0002078'@'X¦\u000e¢\u0006\f\u001a\u0004\bP\u00109\"\u0004\bQ\u0010;R\u001c\u0010U\u001a\u0002078'@'X¦\u000e¢\u0006\f\u001a\u0004\bS\u00109\"\u0004\bT\u0010;R\u001c\u0010Y\u001a\u00020V8'@'X¦\u000e¢\u0006\f\u001a\u0004\bW\u0010(\"\u0004\bX\u00105R\u001c\u0010\\\u001a\u00020V8'@'X¦\u000e¢\u0006\f\u001a\u0004\bZ\u0010(\"\u0004\b[\u00105R\u001c\u0010_\u001a\u0002078'@'X¦\u000e¢\u0006\f\u001a\u0004\b]\u00109\"\u0004\b^\u0010;R\u001c\u0010b\u001a\u0002078'@'X¦\u000e¢\u0006\f\u001a\u0004\b`\u00109\"\u0004\ba\u0010;R\u001c\u0010e\u001a\u0002078'@'X¦\u000e¢\u0006\f\u001a\u0004\bc\u00109\"\u0004\bd\u0010;R\u001c\u0010h\u001a\u0002078'@'X¦\u000e¢\u0006\f\u001a\u0004\bf\u00109\"\u0004\bg\u0010;R\u001c\u0010n\u001a\u00020i8'@'X¦\u000e¢\u0006\f\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u001e\u0010t\u001a\u0004\u0018\u00010o8'@'X¦\u000e¢\u0006\f\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u001c\u0010u\u001a\u00020i8'@'X¦\u000e¢\u0006\f\u001a\u0004\bu\u0010k\"\u0004\bv\u0010mR\u0014\u0010x\u001a\u00020i8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bw\u0010kR\u0014\u0010z\u001a\u00020i8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010kø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "", "", "x", "y", "Landroidx/compose/ui/unit/IntSize;", io.ktor.http.ContentDisposition.Parameters.Size, "", "setPosition-H0pRuoY", "(IIJ)V", "setPosition", "Landroid/graphics/Outline;", "outline", "outlineSize", "setOutline-O0kMr_c", "(Landroid/graphics/Outline;J)V", "setOutline", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "draw", "(Landroidx/compose/ui/graphics/Canvas;)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "block", "record", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/jvm/functions/Function1;)V", "discardDisplayList", "()V", "Landroid/graphics/Matrix;", "calculateMatrix", "()Landroid/graphics/Matrix;", "", "getLayerId", "()J", "layerId", "getOwnerId", "ownerId", "Landroidx/compose/ui/graphics/layer/CompositingStrategy;", "getCompositingStrategy-ke2Ky5w", "()I", "setCompositingStrategy-Wpw9cng", "(I)V", "compositingStrategy", "Landroidx/compose/ui/geometry/Offset;", "getPivotOffset-F1C5BW0", "setPivotOffset-k-4lQ0M", "(J)V", "pivotOffset", "", "getAlpha", "()F", "setAlpha", "(F)V", "alpha", "Landroidx/compose/ui/graphics/BlendMode;", "getBlendMode-0nO6VwU", "setBlendMode-s9anfk8", "blendMode", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "colorFilter", "getScaleX", "setScaleX", "scaleX", "getScaleY", "setScaleY", "scaleY", "getTranslationX", "setTranslationX", "translationX", "getTranslationY", "setTranslationY", "translationY", "getShadowElevation", "setShadowElevation", "shadowElevation", "Landroidx/compose/ui/graphics/Color;", "getAmbientShadowColor-0d7_KjU", "setAmbientShadowColor-8_81llA", "ambientShadowColor", "getSpotShadowColor-0d7_KjU", "setSpotShadowColor-8_81llA", "spotShadowColor", "getRotationX", "setRotationX", "rotationX", "getRotationY", "setRotationY", "rotationY", "getRotationZ", "setRotationZ", "rotationZ", "getCameraDistance", "setCameraDistance", "cameraDistance", "", "getClip", "()Z", "setClip", "(Z)V", "clip", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "renderEffect", "isInvalidated", "setInvalidated", "getSupportsSoftwareRendering", "supportsSoftwareRendering", "getHasDisplayList", "hasDisplayList", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface GraphicsLayerImpl {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.graphics.layer.GraphicsLayerImpl.Companion INSTANCE = androidx.compose.ui.graphics.layer.GraphicsLayerImpl.Companion.getHighResolutionOutputSizeshNQ4ISI;

    android.graphics.Matrix calculateMatrix();

    void discardDisplayList();

    void draw(androidx.compose.ui.graphics.Canvas canvas);

    float getAlpha();

    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    long getAmbientShadowColor();

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    int getBlendMode();

    float getCameraDistance();

    boolean getClip();

    androidx.compose.ui.graphics.ColorFilter getColorFilter();

    /* renamed from: getCompositingStrategy-ke2Ky5w, reason: not valid java name */
    int getCompositingStrategy();

    default boolean getHasDisplayList() {
        return true;
    }

    long getLayerId();

    long getOwnerId();

    /* renamed from: getPivotOffset-F1C5BW0, reason: not valid java name */
    long getPivotOffset();

    androidx.compose.ui.graphics.RenderEffect getRenderEffect();

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    float getShadowElevation();

    /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    long getSpotShadowColor();

    default boolean getSupportsSoftwareRendering() {
        return false;
    }

    float getTranslationX();

    float getTranslationY();

    /* renamed from: isInvalidated */
    boolean getIsInvalidated();

    void record(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.graphics.layer.GraphicsLayer layer, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> block);

    void setAlpha(float f);

    /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    void mo6638setAmbientShadowColor8_81llA(long j);

    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    void mo6639setBlendModes9anfk8(int i);

    void setCameraDistance(float f);

    void setClip(boolean z);

    void setColorFilter(androidx.compose.ui.graphics.ColorFilter colorFilter);

    /* renamed from: setCompositingStrategy-Wpw9cng, reason: not valid java name */
    void mo6640setCompositingStrategyWpw9cng(int i);

    void setInvalidated(boolean z);

    /* renamed from: setOutline-O0kMr_c, reason: not valid java name */
    void mo6641setOutlineO0kMr_c(android.graphics.Outline outline, long outlineSize);

    /* renamed from: setPivotOffset-k-4lQ0M, reason: not valid java name */
    void mo6642setPivotOffsetk4lQ0M(long j);

    /* renamed from: setPosition-H0pRuoY, reason: not valid java name */
    void mo6643setPositionH0pRuoY(int x, int y, long size);

    void setRenderEffect(androidx.compose.ui.graphics.RenderEffect renderEffect);

    void setRotationX(float f);

    void setRotationY(float f);

    void setRotationZ(float f);

    void setScaleX(float f);

    void setScaleY(float f);

    void setShadowElevation(float f);

    /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    void mo6644setSpotShadowColor8_81llA(long j);

    void setTranslationX(float f);

    void setTranslationY(float f);

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "DefaultDrawBlock", "Lkotlin/jvm/functions/Function1;", "getDefaultDrawBlock", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.compose.ui.graphics.layer.GraphicsLayerImpl.Companion getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.ui.graphics.layer.GraphicsLayerImpl.Companion();
        private static final kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> DefaultDrawBlock = new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayerImpl$Companion$DefaultDrawBlock$1
            public final void getHighSpeedVideoSizes(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
                androidx.compose.ui.graphics.drawscope.DrawScope.m6526drawRectnJ9OG0$default(drawScope, androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU(), 0L, 0L, 0.0f, null, null, 0, 126, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
                getHighSpeedVideoSizes(drawScope);
                return kotlin.Unit.INSTANCE;
            }
        };

        private Companion() {
        }

        public final kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> getDefaultDrawBlock() {
            return DefaultDrawBlock;
        }
    }
}
