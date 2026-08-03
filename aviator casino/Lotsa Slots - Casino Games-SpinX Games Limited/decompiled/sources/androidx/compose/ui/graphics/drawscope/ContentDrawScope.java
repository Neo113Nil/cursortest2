package androidx.compose.ui.graphics.drawscope;

/* compiled from: ContentDrawScope.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawContent", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ContentDrawScope extends androidx.compose.ui.graphics.drawscope.DrawScope {
    void drawContent();

    /* compiled from: ContentDrawScope.kt */
    /* renamed from: androidx.compose.ui.graphics.drawscope.ContentDrawScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    /* compiled from: ContentDrawScope.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m2622drawImageAZ2fEMs(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope, androidx.compose.ui.graphics.ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, androidx.compose.ui.graphics.ColorFilter colorFilter, int i, int i2) {
            androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2661drawImageAZ2fEMs$default(contentDrawScope, imageBitmap, j, j2, j3, j4, f, drawStyle, colorFilter, i, 0, 512, null);
        }

        @java.lang.Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m2623getCenterF1C5BW0(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
            return androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2638$default$getCenterF1C5BW0(contentDrawScope);
        }

        @java.lang.Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m2624getSizeNHjbRc(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
            return androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2639$default$getSizeNHjbRc(contentDrawScope);
        }

        @java.lang.Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m2625roundToPxR2X_6o(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope, long j) {
            return androidx.compose.ui.unit.Density.CC.m4442$default$roundToPxR2X_6o(contentDrawScope, j);
        }

        @java.lang.Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m2626roundToPx0680j_4(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope, float f) {
            return androidx.compose.ui.unit.Density.CC.m4443$default$roundToPx0680j_4(contentDrawScope, f);
        }

        @java.lang.Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m2627toDpGaN1DYA(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope, long j) {
            return androidx.compose.ui.unit.FontScaling.CC.m4587$default$toDpGaN1DYA(contentDrawScope, j);
        }

        @java.lang.Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m2628toDpu2uoSUM(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope, float f) {
            return androidx.compose.ui.unit.Density.CC.m4444$default$toDpu2uoSUM(contentDrawScope, f);
        }

        @java.lang.Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m2629toDpu2uoSUM(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope, int i) {
            return androidx.compose.ui.unit.Density.CC.m4445$default$toDpu2uoSUM((androidx.compose.ui.unit.Density) contentDrawScope, i);
        }

        @java.lang.Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m2630toDpSizekrfVVM(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope, long j) {
            return androidx.compose.ui.unit.Density.CC.m4446$default$toDpSizekrfVVM(contentDrawScope, j);
        }

        @java.lang.Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m2631toPxR2X_6o(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope, long j) {
            return androidx.compose.ui.unit.Density.CC.m4447$default$toPxR2X_6o(contentDrawScope, j);
        }

        @java.lang.Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m2632toPx0680j_4(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope, float f) {
            return androidx.compose.ui.unit.Density.CC.m4448$default$toPx0680j_4(contentDrawScope, f);
        }

        @java.lang.Deprecated
        public static androidx.compose.ui.geometry.Rect toRect(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope, androidx.compose.ui.unit.DpRect dpRect) {
            return androidx.compose.ui.unit.Density.CC.$default$toRect(contentDrawScope, dpRect);
        }

        @java.lang.Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m2633toSizeXkaWNTQ(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope, long j) {
            return androidx.compose.ui.unit.Density.CC.m4449$default$toSizeXkaWNTQ(contentDrawScope, j);
        }

        @java.lang.Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m2634toSp0xMU5do(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope, float f) {
            return androidx.compose.ui.unit.FontScaling.CC.m4588$default$toSp0xMU5do(contentDrawScope, f);
        }

        @java.lang.Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m2635toSpkPz2Gy4(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope, float f) {
            return androidx.compose.ui.unit.Density.CC.m4450$default$toSpkPz2Gy4(contentDrawScope, f);
        }

        @java.lang.Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m2636toSpkPz2Gy4(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope, int i) {
            return androidx.compose.ui.unit.Density.CC.m4451$default$toSpkPz2Gy4((androidx.compose.ui.unit.Density) contentDrawScope, i);
        }
    }
}
