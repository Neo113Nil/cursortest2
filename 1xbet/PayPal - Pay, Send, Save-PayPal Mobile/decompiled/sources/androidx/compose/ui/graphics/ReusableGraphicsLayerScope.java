package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0003R\"\u0010\b\u001a\u00020\u00078\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R*\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R*\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R*\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0011\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R*\u0010\"\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0011\u001a\u0004\b#\u0010\u0013\"\u0004\b$\u0010\u0015R*\u0010&\u001a\u00020%2\u0006\u0010\u000f\u001a\u00020%8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R*\u0010,\u001a\u00020%2\u0006\u0010\u000f\u001a\u00020%8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R*\u0010/\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b/\u0010\u0011\u001a\u0004\b0\u0010\u0013\"\u0004\b1\u0010\u0015R*\u00102\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b2\u0010\u0011\u001a\u0004\b3\u0010\u0013\"\u0004\b4\u0010\u0015R*\u00105\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b5\u0010\u0011\u001a\u0004\b6\u0010\u0013\"\u0004\b7\u0010\u0015R*\u00108\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b8\u0010\u0011\u001a\u0004\b9\u0010\u0013\"\u0004\b:\u0010\u0015R*\u0010<\u001a\u00020;2\u0006\u0010\u000f\u001a\u00020;8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b<\u0010'\u001a\u0004\b=\u0010)\"\u0004\b>\u0010+R*\u0010@\u001a\u00020?2\u0006\u0010\u000f\u001a\u00020?8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER*\u0010G\u001a\u00020F2\u0006\u0010\u000f\u001a\u00020F8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR*\u0010N\u001a\u00020M2\u0006\u0010\u000f\u001a\u00020M8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bN\u0010\t\u001a\u0004\bO\u0010\u000b\"\u0004\bP\u0010\rR\"\u0010R\u001a\u00020Q8\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\bR\u0010'\u001a\u0004\bS\u0010)\"\u0004\bT\u0010+R\"\u0010V\u001a\u00020U8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010]\u001a\u00020\\8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u0014\u0010d\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010\u0013R\u0014\u0010f\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010\u0013R.\u0010h\u001a\u0004\u0018\u00010g2\b\u0010\u000f\u001a\u0004\u0018\u00010g8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR.\u0010o\u001a\u0004\u0018\u00010n2\b\u0010\u000f\u001a\u0004\u0018\u00010n8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR*\u0010v\u001a\u00020u2\u0006\u0010\u000f\u001a\u00020u8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bv\u0010\t\u001a\u0004\bw\u0010\u000b\"\u0004\bx\u0010\rR$\u0010z\u001a\u0004\u0018\u00010y8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007f"}, d2 = {"Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "<init>", "()V", "", "reset", "updateOutline$ui", "", "mutatedFields", com.visa.cbp.getEncExpo.warmup, "getMutatedFields$ui", "()I", "setMutatedFields$ui", "(I)V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "scaleX", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getScaleX", "()F", "setScaleX", "(F)V", "scaleY", "getScaleY", "setScaleY", "alpha", "getAlpha", "setAlpha", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "shadowElevation", "getShadowElevation", "setShadowElevation", "Landroidx/compose/ui/graphics/Color;", "ambientShadowColor", "J", "getAmbientShadowColor-0d7_KjU", "()J", "setAmbientShadowColor-8_81llA", "(J)V", "spotShadowColor", "getSpotShadowColor-0d7_KjU", "setSpotShadowColor-8_81llA", "rotationX", "getRotationX", "setRotationX", "rotationY", "getRotationY", "setRotationY", "rotationZ", "getRotationZ", "setRotationZ", "cameraDistance", "getCameraDistance", "setCameraDistance", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "getTransformOrigin-SzJe1aQ", "setTransformOrigin-__ExYCQ", "Landroidx/compose/ui/graphics/Shape;", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "setShape", "(Landroidx/compose/ui/graphics/Shape;)V", "", "clip", "Z", "getClip", "()Z", "setClip", "(Z)V", "Landroidx/compose/ui/graphics/CompositingStrategy;", "compositingStrategy", "getCompositingStrategy--NrFUSI", "setCompositingStrategy-aDBOjCE", "Landroidx/compose/ui/geometry/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "getSize-NH-jbRc", "setSize-uvyYCjk", "Landroidx/compose/ui/unit/Density;", "graphicsDensity", "Landroidx/compose/ui/unit/Density;", "getGraphicsDensity$ui", "()Landroidx/compose/ui/unit/Density;", "setGraphicsDensity$ui", "(Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection$ui", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection$ui", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "getDensity", "density", "getFontScale", "fontScale", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "getBlendMode-0nO6VwU", "setBlendMode-s9anfk8", "Landroidx/compose/ui/graphics/Outline;", "outline", "Landroidx/compose/ui/graphics/Outline;", "getOutline$ui", "()Landroidx/compose/ui/graphics/Outline;", "setOutline$ui", "(Landroidx/compose/ui/graphics/Outline;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ReusableGraphicsLayerScope implements androidx.compose.ui.graphics.GraphicsLayerScope {
    public static final int $stable = 0;
    private boolean clip;
    private androidx.compose.ui.graphics.ColorFilter colorFilter;
    private int mutatedFields;
    private androidx.compose.ui.graphics.Outline outline;
    private androidx.compose.ui.graphics.RenderEffect renderEffect;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float shadowElevation;
    private float translationX;
    private float translationY;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float alpha = 1.0f;
    private long ambientShadowColor = androidx.compose.ui.graphics.GraphicsLayerScopeKt.getDefaultShadowColor();
    private long spotShadowColor = androidx.compose.ui.graphics.GraphicsLayerScopeKt.getDefaultShadowColor();
    private float cameraDistance = 8.0f;
    private long transformOrigin = androidx.compose.ui.graphics.TransformOrigin.INSTANCE.m6378getCenterSzJe1aQ();
    private androidx.compose.ui.graphics.Shape shape = androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape();
    private int compositingStrategy = androidx.compose.ui.graphics.CompositingStrategy.INSTANCE.m6080getAutoNrFUSI();
    private long size = androidx.compose.ui.geometry.Size.INSTANCE.m5829getUnspecifiedNHjbRc();
    private androidx.compose.ui.unit.Density graphicsDensity = androidx.compose.ui.unit.DensityKt.Density$default(1.0f, 0.0f, 2, null);
    private androidx.compose.ui.unit.LayoutDirection layoutDirection = androidx.compose.ui.unit.LayoutDirection.Ltr;
    private int blendMode = androidx.compose.ui.graphics.BlendMode.INSTANCE.m5937getSrcOver0nO6VwU();

    /* renamed from: getMutatedFields$ui, reason: from getter */
    public final int getMutatedFields() {
        return this.mutatedFields;
    }

    public final void setMutatedFields$ui(int i) {
        this.mutatedFields = i;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final float getScaleX() {
        return this.scaleX;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void setScaleX(float f) {
        if (this.scaleX == f) {
            return;
        }
        this.mutatedFields |= 1;
        this.scaleX = f;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final float getScaleY() {
        return this.scaleY;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void setScaleY(float f) {
        if (this.scaleY == f) {
            return;
        }
        this.mutatedFields |= 2;
        this.scaleY = f;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void setAlpha(float f) {
        if (this.alpha == f) {
            return;
        }
        this.mutatedFields |= 4;
        this.alpha = f;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final float getTranslationX() {
        return this.translationX;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void setTranslationX(float f) {
        if (this.translationX == f) {
            return;
        }
        this.mutatedFields |= 8;
        this.translationX = f;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final float getTranslationY() {
        return this.translationY;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void setTranslationY(float f) {
        if (this.translationY == f) {
            return;
        }
        this.mutatedFields |= 16;
        this.translationY = f;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final float getShadowElevation() {
        return this.shadowElevation;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void setShadowElevation(float f) {
        if (this.shadowElevation == f) {
            return;
        }
        this.mutatedFields |= 32;
        this.shadowElevation = f;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: from getter */
    public final long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: setAmbientShadowColor-8_81llA */
    public final void mo6176setAmbientShadowColor8_81llA(long j) {
        if (androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.ambientShadowColor, j)) {
            return;
        }
        this.mutatedFields |= 64;
        this.ambientShadowColor = j;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: getSpotShadowColor-0d7_KjU, reason: from getter */
    public final long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: setSpotShadowColor-8_81llA */
    public final void mo6179setSpotShadowColor8_81llA(long j) {
        if (androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.spotShadowColor, j)) {
            return;
        }
        this.mutatedFields |= 128;
        this.spotShadowColor = j;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final float getRotationX() {
        return this.rotationX;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void setRotationX(float f) {
        if (this.rotationX == f) {
            return;
        }
        this.mutatedFields |= 256;
        this.rotationX = f;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final float getRotationY() {
        return this.rotationY;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void setRotationY(float f) {
        if (this.rotationY == f) {
            return;
        }
        this.mutatedFields |= 512;
        this.rotationY = f;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final float getRotationZ() {
        return this.rotationZ;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void setRotationZ(float f) {
        if (this.rotationZ == f) {
            return;
        }
        this.mutatedFields |= 1024;
        this.rotationZ = f;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void setCameraDistance(float f) {
        if (this.cameraDistance == f) {
            return;
        }
        this.mutatedFields |= 2048;
        this.cameraDistance = f;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: getTransformOrigin-SzJe1aQ, reason: from getter */
    public final long getTransformOrigin() {
        return this.transformOrigin;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: setTransformOrigin-__ExYCQ */
    public final void mo6180setTransformOrigin__ExYCQ(long j) {
        if (androidx.compose.ui.graphics.TransformOrigin.m6372equalsimpl0(this.transformOrigin, j)) {
            return;
        }
        this.mutatedFields |= 4096;
        this.transformOrigin = j;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final androidx.compose.ui.graphics.Shape getShape() {
        return this.shape;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void setShape(androidx.compose.ui.graphics.Shape shape) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.shape, shape)) {
            return;
        }
        this.mutatedFields |= 8192;
        this.shape = shape;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final boolean getClip() {
        return this.clip;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void setClip(boolean z) {
        if (this.clip != z) {
            this.mutatedFields |= 16384;
            this.clip = z;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: getCompositingStrategy--NrFUSI, reason: from getter */
    public final int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: setCompositingStrategy-aDBOjCE */
    public final void mo6178setCompositingStrategyaDBOjCE(int i) {
        if (androidx.compose.ui.graphics.CompositingStrategy.m6076equalsimpl0(this.compositingStrategy, i)) {
            return;
        }
        this.mutatedFields |= 32768;
        this.compositingStrategy = i;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: getSize-NH-jbRc, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    /* renamed from: setSize-uvyYCjk, reason: not valid java name */
    public final void m6304setSizeuvyYCjk(long j) {
        this.size = j;
    }

    /* renamed from: getGraphicsDensity$ui, reason: from getter */
    public final androidx.compose.ui.unit.Density getGraphicsDensity() {
        return this.graphicsDensity;
    }

    public final void setGraphicsDensity$ui(androidx.compose.ui.unit.Density density) {
        this.graphicsDensity = density;
    }

    /* renamed from: getLayoutDirection$ui, reason: from getter */
    public final androidx.compose.ui.unit.LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    public final void setLayoutDirection$ui(androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.graphicsDensity.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final float getFontScale() {
        return this.graphicsDensity.getFontScale();
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final androidx.compose.ui.graphics.RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void setRenderEffect(androidx.compose.ui.graphics.RenderEffect renderEffect) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.renderEffect, renderEffect)) {
            return;
        }
        this.mutatedFields |= 131072;
        this.renderEffect = renderEffect;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final androidx.compose.ui.graphics.ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void setColorFilter(androidx.compose.ui.graphics.ColorFilter colorFilter) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.colorFilter, colorFilter)) {
            return;
        }
        this.mutatedFields |= 262144;
        this.colorFilter = colorFilter;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: getBlendMode-0nO6VwU, reason: from getter */
    public final int getBlendMode() {
        return this.blendMode;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: setBlendMode-s9anfk8 */
    public final void mo6177setBlendModes9anfk8(int i) {
        if (androidx.compose.ui.graphics.BlendMode.m5906equalsimpl0(this.blendMode, i)) {
            return;
        }
        this.mutatedFields |= 524288;
        this.blendMode = i;
    }

    /* renamed from: getOutline$ui, reason: from getter */
    public final androidx.compose.ui.graphics.Outline getOutline() {
        return this.outline;
    }

    public final void setOutline$ui(androidx.compose.ui.graphics.Outline outline) {
        this.outline = outline;
    }

    public final void reset() {
        setScaleX(1.0f);
        setScaleY(1.0f);
        setAlpha(1.0f);
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        setShadowElevation(0.0f);
        mo6176setAmbientShadowColor8_81llA(androidx.compose.ui.graphics.GraphicsLayerScopeKt.getDefaultShadowColor());
        mo6179setSpotShadowColor8_81llA(androidx.compose.ui.graphics.GraphicsLayerScopeKt.getDefaultShadowColor());
        setRotationX(0.0f);
        setRotationY(0.0f);
        setRotationZ(0.0f);
        setCameraDistance(8.0f);
        mo6180setTransformOrigin__ExYCQ(androidx.compose.ui.graphics.TransformOrigin.INSTANCE.m6378getCenterSzJe1aQ());
        setShape(androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape());
        setClip(false);
        setRenderEffect(null);
        setColorFilter(null);
        mo6177setBlendModes9anfk8(androidx.compose.ui.graphics.BlendMode.INSTANCE.m5937getSrcOver0nO6VwU());
        mo6178setCompositingStrategyaDBOjCE(androidx.compose.ui.graphics.CompositingStrategy.INSTANCE.m6080getAutoNrFUSI());
        m6304setSizeuvyYCjk(androidx.compose.ui.geometry.Size.INSTANCE.m5829getUnspecifiedNHjbRc());
        this.outline = null;
        this.mutatedFields = 0;
    }

    public final void updateOutline$ui() {
        this.outline = getShape().mo1334createOutlinePq9zytI(getSize(), this.layoutDirection, this.graphicsDensity);
    }
}
