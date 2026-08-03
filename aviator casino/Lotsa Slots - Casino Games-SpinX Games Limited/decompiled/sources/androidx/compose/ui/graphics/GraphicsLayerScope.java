package androidx.compose.ui.graphics;

/* compiled from: GraphicsLayerScope.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R*\u0010\b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007R \u0010\u0011\u001a\u00020\u00128fX¦\u000e¢\u0006\u0012\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u001f\u001a\u0004\u0018\u00010 8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0018\u0010&\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b'\u0010\u0005\"\u0004\b(\u0010\u0007R\u0018\u0010)\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b*\u0010\u0005\"\u0004\b+\u0010\u0007R\u0018\u0010,\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b-\u0010\u0005\"\u0004\b.\u0010\u0007R\u0018\u0010/\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b0\u0010\u0005\"\u0004\b1\u0010\u0007R\u0018\u00102\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b3\u0010\u0005\"\u0004\b4\u0010\u0007R\u0018\u00105\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b6\u0010\u0005\"\u0004\b7\u0010\u0007R\u0018\u00108\u001a\u000209X¦\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010>\u001a\u00020?8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b@\u0010\u000bR*\u0010A\u001a\u00020\t2\u0006\u0010A\u001a\u00020\t8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bB\u0010\u000b\"\u0004\bC\u0010\rR\u001e\u0010D\u001a\u00020EX¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bF\u0010\u000b\"\u0004\bG\u0010\rR\u0018\u0010H\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\bI\u0010\u0005\"\u0004\bJ\u0010\u0007R\u0018\u0010K\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\bL\u0010\u0005\"\u0004\bM\u0010\u0007ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006NÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Landroidx/compose/ui/unit/Density;", "alpha", "", "getAlpha", "()F", "setAlpha", "(F)V", "ambientShadowColor", "Landroidx/compose/ui/graphics/Color;", "getAmbientShadowColor-0d7_KjU", "()J", "setAmbientShadowColor-8_81llA", "(J)V", "cameraDistance", "getCameraDistance", "setCameraDistance", "clip", "", "getClip$annotations", "()V", "getClip", "()Z", "setClip", "(Z)V", "compositingStrategy", "Landroidx/compose/ui/graphics/CompositingStrategy;", "getCompositingStrategy--NrFUSI", "()I", "setCompositingStrategy-aDBOjCE", "(I)V", "<anonymous parameter 0>", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "rotationX", "getRotationX", "setRotationX", "rotationY", "getRotationY", "setRotationY", "rotationZ", "getRotationZ", "setRotationZ", "scaleX", "getScaleX", "setScaleX", "scaleY", "getScaleY", "setScaleY", "shadowElevation", "getShadowElevation", "setShadowElevation", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "setShape", "(Landroidx/compose/ui/graphics/Shape;)V", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "spotShadowColor", "getSpotShadowColor-0d7_KjU", "setSpotShadowColor-8_81llA", "transformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "getTransformOrigin-SzJe1aQ", "setTransformOrigin-__ExYCQ", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface GraphicsLayerScope extends androidx.compose.ui.unit.Density {
    float getAlpha();

    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    long mo2280getAmbientShadowColor0d7_KjU();

    float getCameraDistance();

    boolean getClip();

    /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    int mo2281getCompositingStrategyNrFUSI();

    androidx.compose.ui.graphics.RenderEffect getRenderEffect();

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    float getShadowElevation();

    androidx.compose.ui.graphics.Shape getShape();

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    long mo2282getSizeNHjbRc();

    /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    long mo2283getSpotShadowColor0d7_KjU();

    /* renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    long mo2284getTransformOriginSzJe1aQ();

    float getTranslationX();

    float getTranslationY();

    void setAlpha(float f);

    /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    void mo2285setAmbientShadowColor8_81llA(long j);

    void setCameraDistance(float f);

    void setClip(boolean z);

    /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    void mo2286setCompositingStrategyaDBOjCE(int i);

    void setRenderEffect(androidx.compose.ui.graphics.RenderEffect renderEffect);

    void setRotationX(float f);

    void setRotationY(float f);

    void setRotationZ(float f);

    void setScaleX(float f);

    void setScaleY(float f);

    void setShadowElevation(float f);

    void setShape(androidx.compose.ui.graphics.Shape shape);

    /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    void mo2287setSpotShadowColor8_81llA(long j);

    /* renamed from: setTransformOrigin-__ExYCQ, reason: not valid java name */
    void mo2288setTransformOrigin__ExYCQ(long j);

    void setTranslationX(float f);

    void setTranslationY(float f);

    /* compiled from: GraphicsLayerScope.kt */
    /* renamed from: androidx.compose.ui.graphics.GraphicsLayerScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static androidx.compose.ui.graphics.RenderEffect $default$getRenderEffect(androidx.compose.ui.graphics.GraphicsLayerScope _this) {
            return null;
        }

        /* renamed from: $default$setAmbientShadowColor-8_81llA, reason: not valid java name */
        public static void m2293$default$setAmbientShadowColor8_81llA(androidx.compose.ui.graphics.GraphicsLayerScope _this, long j) {
        }

        /* renamed from: $default$setCompositingStrategy-aDBOjCE, reason: not valid java name */
        public static void m2294$default$setCompositingStrategyaDBOjCE(androidx.compose.ui.graphics.GraphicsLayerScope _this, int i) {
        }

        public static void $default$setRenderEffect(androidx.compose.ui.graphics.GraphicsLayerScope _this, androidx.compose.ui.graphics.RenderEffect renderEffect) {
        }

        /* renamed from: $default$setSpotShadowColor-8_81llA, reason: not valid java name */
        public static void m2295$default$setSpotShadowColor8_81llA(androidx.compose.ui.graphics.GraphicsLayerScope _this, long j) {
        }

        /* renamed from: $default$getAmbientShadowColor-0d7_KjU, reason: not valid java name */
        public static long m2289$default$getAmbientShadowColor0d7_KjU(androidx.compose.ui.graphics.GraphicsLayerScope _this) {
            return androidx.compose.ui.graphics.GraphicsLayerScopeKt.getDefaultShadowColor();
        }

        /* renamed from: $default$getSpotShadowColor-0d7_KjU, reason: not valid java name */
        public static long m2292$default$getSpotShadowColor0d7_KjU(androidx.compose.ui.graphics.GraphicsLayerScope _this) {
            return androidx.compose.ui.graphics.GraphicsLayerScopeKt.getDefaultShadowColor();
        }

        /* renamed from: $default$getCompositingStrategy--NrFUSI, reason: not valid java name */
        public static int m2290$default$getCompositingStrategyNrFUSI(androidx.compose.ui.graphics.GraphicsLayerScope _this) {
            return androidx.compose.ui.graphics.CompositingStrategy.INSTANCE.m2203getAutoNrFUSI();
        }

        /* renamed from: $default$getSize-NH-jbRc, reason: not valid java name */
        public static long m2291$default$getSizeNHjbRc(androidx.compose.ui.graphics.GraphicsLayerScope _this) {
            return androidx.compose.ui.geometry.Size.INSTANCE.m1948getUnspecifiedNHjbRc();
        }
    }

    /* compiled from: GraphicsLayerScope.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void getClip$annotations() {
        }

        @java.lang.Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m2319roundToPxR2X_6o(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope, long j) {
            return androidx.compose.ui.unit.Density.CC.m4442$default$roundToPxR2X_6o(graphicsLayerScope, j);
        }

        @java.lang.Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m2320roundToPx0680j_4(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope, float f) {
            return androidx.compose.ui.unit.Density.CC.m4443$default$roundToPx0680j_4(graphicsLayerScope, f);
        }

        @java.lang.Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m2324toDpGaN1DYA(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope, long j) {
            return androidx.compose.ui.unit.FontScaling.CC.m4587$default$toDpGaN1DYA(graphicsLayerScope, j);
        }

        @java.lang.Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m2325toDpu2uoSUM(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope, float f) {
            return androidx.compose.ui.unit.Density.CC.m4444$default$toDpu2uoSUM(graphicsLayerScope, f);
        }

        @java.lang.Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m2326toDpu2uoSUM(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope, int i) {
            return androidx.compose.ui.unit.Density.CC.m4445$default$toDpu2uoSUM((androidx.compose.ui.unit.Density) graphicsLayerScope, i);
        }

        @java.lang.Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m2327toDpSizekrfVVM(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope, long j) {
            return androidx.compose.ui.unit.Density.CC.m4446$default$toDpSizekrfVVM(graphicsLayerScope, j);
        }

        @java.lang.Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m2328toPxR2X_6o(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope, long j) {
            return androidx.compose.ui.unit.Density.CC.m4447$default$toPxR2X_6o(graphicsLayerScope, j);
        }

        @java.lang.Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m2329toPx0680j_4(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope, float f) {
            return androidx.compose.ui.unit.Density.CC.m4448$default$toPx0680j_4(graphicsLayerScope, f);
        }

        @java.lang.Deprecated
        public static androidx.compose.ui.geometry.Rect toRect(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope, androidx.compose.ui.unit.DpRect dpRect) {
            return androidx.compose.ui.unit.Density.CC.$default$toRect(graphicsLayerScope, dpRect);
        }

        @java.lang.Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m2330toSizeXkaWNTQ(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope, long j) {
            return androidx.compose.ui.unit.Density.CC.m4449$default$toSizeXkaWNTQ(graphicsLayerScope, j);
        }

        @java.lang.Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m2331toSp0xMU5do(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope, float f) {
            return androidx.compose.ui.unit.FontScaling.CC.m4588$default$toSp0xMU5do(graphicsLayerScope, f);
        }

        @java.lang.Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m2332toSpkPz2Gy4(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope, float f) {
            return androidx.compose.ui.unit.Density.CC.m4450$default$toSpkPz2Gy4(graphicsLayerScope, f);
        }

        @java.lang.Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m2333toSpkPz2Gy4(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope, int i) {
            return androidx.compose.ui.unit.Density.CC.m4451$default$toSpkPz2Gy4((androidx.compose.ui.unit.Density) graphicsLayerScope, i);
        }

        @java.lang.Deprecated
        /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
        public static long m2315getAmbientShadowColor0d7_KjU(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
            return androidx.compose.ui.graphics.GraphicsLayerScope.CC.m2289$default$getAmbientShadowColor0d7_KjU(graphicsLayerScope);
        }

        @java.lang.Deprecated
        /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
        public static void m2321setAmbientShadowColor8_81llA(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope, long j) {
            androidx.compose.ui.graphics.GraphicsLayerScope.CC.m2293$default$setAmbientShadowColor8_81llA(graphicsLayerScope, j);
        }

        @java.lang.Deprecated
        /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
        public static long m2318getSpotShadowColor0d7_KjU(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
            return androidx.compose.ui.graphics.GraphicsLayerScope.CC.m2292$default$getSpotShadowColor0d7_KjU(graphicsLayerScope);
        }

        @java.lang.Deprecated
        /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
        public static void m2323setSpotShadowColor8_81llA(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope, long j) {
            androidx.compose.ui.graphics.GraphicsLayerScope.CC.m2295$default$setSpotShadowColor8_81llA(graphicsLayerScope, j);
        }

        @java.lang.Deprecated
        public static androidx.compose.ui.graphics.RenderEffect getRenderEffect(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
            return androidx.compose.ui.graphics.GraphicsLayerScope.CC.$default$getRenderEffect(graphicsLayerScope);
        }

        @java.lang.Deprecated
        public static void setRenderEffect(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope, androidx.compose.ui.graphics.RenderEffect renderEffect) {
            androidx.compose.ui.graphics.GraphicsLayerScope.CC.$default$setRenderEffect(graphicsLayerScope, renderEffect);
        }

        @java.lang.Deprecated
        /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
        public static int m2316getCompositingStrategyNrFUSI(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
            return androidx.compose.ui.graphics.GraphicsLayerScope.CC.m2290$default$getCompositingStrategyNrFUSI(graphicsLayerScope);
        }

        @java.lang.Deprecated
        /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
        public static void m2322setCompositingStrategyaDBOjCE(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope, int i) {
            androidx.compose.ui.graphics.GraphicsLayerScope.CC.m2294$default$setCompositingStrategyaDBOjCE(graphicsLayerScope, i);
        }

        @java.lang.Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m2317getSizeNHjbRc(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
            return androidx.compose.ui.graphics.GraphicsLayerScope.CC.m2291$default$getSizeNHjbRc(graphicsLayerScope);
        }
    }
}
