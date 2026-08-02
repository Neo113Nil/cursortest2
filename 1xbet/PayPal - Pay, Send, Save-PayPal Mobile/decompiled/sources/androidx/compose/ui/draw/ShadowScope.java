package androidx.compose.ui.draw;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u00020\u00028'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u00020\u00028'@'X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\u0004\"\u0004\b\t\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u000b8'@'X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00118'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0019\u001a\u00020\u00028'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0004\"\u0004\b\u0018\u0010\u0006R\u001c\u0010\u001f\u001a\u00020\u001a8'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010#\u001a\u00020 8'@'X¦\u000e¢\u0006\f\u001a\u0004\b!\u0010\r\"\u0004\b\"\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/ShadowScope;", "Landroidx/compose/ui/unit/Density;", "", "getRadius", "()F", "setRadius", "(F)V", "radius", "getSpread", "setSpread", "spread", "Landroidx/compose/ui/graphics/Color;", "getColor-0d7_KjU", "()J", "setColor-8_81llA", "(J)V", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "setBrush", "(Landroidx/compose/ui/graphics/Brush;)V", "brush", "getAlpha", "setAlpha", "alpha", "Landroidx/compose/ui/graphics/BlendMode;", "getBlendMode-0nO6VwU", "()I", "setBlendMode-s9anfk8", "(I)V", "blendMode", "Landroidx/compose/ui/geometry/Offset;", "getOffset-F1C5BW0", "setOffset-k-4lQ0M", "offset"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ShadowScope extends androidx.compose.ui.unit.Density {
    float getAlpha();

    /* renamed from: getBlendMode-0nO6VwU */
    int mo5533getBlendMode0nO6VwU();

    androidx.compose.ui.graphics.Brush getBrush();

    /* renamed from: getColor-0d7_KjU */
    long mo5534getColor0d7_KjU();

    /* renamed from: getOffset-F1C5BW0 */
    long mo5535getOffsetF1C5BW0();

    float getRadius();

    float getSpread();

    void setAlpha(float f);

    /* renamed from: setBlendMode-s9anfk8 */
    void mo5536setBlendModes9anfk8(int i);

    void setBrush(androidx.compose.ui.graphics.Brush brush);

    /* renamed from: setColor-8_81llA */
    void mo5537setColor8_81llA(long j);

    /* renamed from: setOffset-k-4lQ0M */
    void mo5538setOffsetk4lQ0M(long j);

    void setRadius(float f);

    void setSpread(float f);

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m5628roundToPxR2X_6o(androidx.compose.ui.draw.ShadowScope shadowScope, long j) {
            return androidx.compose.ui.draw.ShadowScope.super.mo1411roundToPxR2X_6o(j);
        }

        @java.lang.Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m5629roundToPx0680j_4(androidx.compose.ui.draw.ShadowScope shadowScope, float f) {
            return androidx.compose.ui.draw.ShadowScope.super.mo1412roundToPx0680j_4(f);
        }

        @java.lang.Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m5630toDpGaN1DYA(androidx.compose.ui.draw.ShadowScope shadowScope, long j) {
            return androidx.compose.ui.draw.ShadowScope.super.mo1413toDpGaN1DYA(j);
        }

        @java.lang.Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m5631toDpu2uoSUM(androidx.compose.ui.draw.ShadowScope shadowScope, float f) {
            return androidx.compose.ui.draw.ShadowScope.super.mo1414toDpu2uoSUM(f);
        }

        @java.lang.Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m5632toDpu2uoSUM(androidx.compose.ui.draw.ShadowScope shadowScope, int i) {
            return androidx.compose.ui.draw.ShadowScope.super.mo1415toDpu2uoSUM(i);
        }

        @java.lang.Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m5633toDpSizekrfVVM(androidx.compose.ui.draw.ShadowScope shadowScope, long j) {
            return androidx.compose.ui.draw.ShadowScope.super.mo1416toDpSizekrfVVM(j);
        }

        @java.lang.Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m5634toPxR2X_6o(androidx.compose.ui.draw.ShadowScope shadowScope, long j) {
            return androidx.compose.ui.draw.ShadowScope.super.mo1417toPxR2X_6o(j);
        }

        @java.lang.Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m5635toPx0680j_4(androidx.compose.ui.draw.ShadowScope shadowScope, float f) {
            return androidx.compose.ui.draw.ShadowScope.super.mo1418toPx0680j_4(f);
        }

        @java.lang.Deprecated
        public static androidx.compose.ui.geometry.Rect toRect(androidx.compose.ui.draw.ShadowScope shadowScope, androidx.compose.ui.unit.DpRect dpRect) {
            return androidx.compose.ui.draw.ShadowScope.super.toRect(dpRect);
        }

        @java.lang.Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m5636toSizeXkaWNTQ(androidx.compose.ui.draw.ShadowScope shadowScope, long j) {
            return androidx.compose.ui.draw.ShadowScope.super.mo1419toSizeXkaWNTQ(j);
        }

        @java.lang.Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m5637toSp0xMU5do(androidx.compose.ui.draw.ShadowScope shadowScope, float f) {
            return androidx.compose.ui.draw.ShadowScope.super.mo1420toSp0xMU5do(f);
        }

        @java.lang.Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m5638toSpkPz2Gy4(androidx.compose.ui.draw.ShadowScope shadowScope, float f) {
            return androidx.compose.ui.draw.ShadowScope.super.mo1421toSpkPz2Gy4(f);
        }

        @java.lang.Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m5639toSpkPz2Gy4(androidx.compose.ui.draw.ShadowScope shadowScope, int i) {
            return androidx.compose.ui.draw.ShadowScope.super.mo1422toSpkPz2Gy4(i);
        }
    }
}
