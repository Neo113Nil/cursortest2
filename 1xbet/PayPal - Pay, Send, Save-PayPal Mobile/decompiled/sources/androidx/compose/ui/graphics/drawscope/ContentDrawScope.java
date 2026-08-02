package androidx.compose.ui.graphics.drawscope;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "drawContent", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ContentDrawScope extends androidx.compose.ui.graphics.drawscope.DrawScope {
    void drawContent();

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m6478drawImageAZ2fEMs(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope, androidx.compose.ui.graphics.ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, androidx.compose.ui.graphics.ColorFilter colorFilter, int i, int i2) {
            androidx.compose.ui.graphics.drawscope.ContentDrawScope.super.mo6434drawImageAZ2fEMs(imageBitmap, j, j2, j3, j4, f, drawStyle, colorFilter, i, i2);
        }

        @java.lang.Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m6479getCenterF1C5BW0(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
            return androidx.compose.ui.graphics.drawscope.ContentDrawScope.super.mo6530getCenterF1C5BW0();
        }

        @java.lang.Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m6480getSizeNHjbRc(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
            return androidx.compose.ui.graphics.drawscope.ContentDrawScope.super.mo6531getSizeNHjbRc();
        }

        @java.lang.Deprecated
        /* renamed from: record-JVtK1S4, reason: not valid java name */
        public static void m6481recordJVtK1S4(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope, androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer, long j, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1) {
            androidx.compose.ui.graphics.drawscope.ContentDrawScope.super.mo6532recordJVtK1S4(graphicsLayer, j, function1);
        }

        @java.lang.Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m6482roundToPxR2X_6o(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope, long j) {
            return androidx.compose.ui.graphics.drawscope.ContentDrawScope.super.mo1411roundToPxR2X_6o(j);
        }

        @java.lang.Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m6483roundToPx0680j_4(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope, float f) {
            return androidx.compose.ui.graphics.drawscope.ContentDrawScope.super.mo1412roundToPx0680j_4(f);
        }

        @java.lang.Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m6484toDpGaN1DYA(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope, long j) {
            return androidx.compose.ui.graphics.drawscope.ContentDrawScope.super.mo1413toDpGaN1DYA(j);
        }

        @java.lang.Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m6485toDpu2uoSUM(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope, float f) {
            return androidx.compose.ui.graphics.drawscope.ContentDrawScope.super.mo1414toDpu2uoSUM(f);
        }

        @java.lang.Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m6486toDpu2uoSUM(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope, int i) {
            return androidx.compose.ui.graphics.drawscope.ContentDrawScope.super.mo1415toDpu2uoSUM(i);
        }

        @java.lang.Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m6487toDpSizekrfVVM(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope, long j) {
            return androidx.compose.ui.graphics.drawscope.ContentDrawScope.super.mo1416toDpSizekrfVVM(j);
        }

        @java.lang.Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m6488toPxR2X_6o(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope, long j) {
            return androidx.compose.ui.graphics.drawscope.ContentDrawScope.super.mo1417toPxR2X_6o(j);
        }

        @java.lang.Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m6489toPx0680j_4(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope, float f) {
            return androidx.compose.ui.graphics.drawscope.ContentDrawScope.super.mo1418toPx0680j_4(f);
        }

        @java.lang.Deprecated
        public static androidx.compose.ui.geometry.Rect toRect(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope, androidx.compose.ui.unit.DpRect dpRect) {
            return androidx.compose.ui.graphics.drawscope.ContentDrawScope.super.toRect(dpRect);
        }

        @java.lang.Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m6490toSizeXkaWNTQ(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope, long j) {
            return androidx.compose.ui.graphics.drawscope.ContentDrawScope.super.mo1419toSizeXkaWNTQ(j);
        }

        @java.lang.Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m6491toSp0xMU5do(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope, float f) {
            return androidx.compose.ui.graphics.drawscope.ContentDrawScope.super.mo1420toSp0xMU5do(f);
        }

        @java.lang.Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m6492toSpkPz2Gy4(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope, float f) {
            return androidx.compose.ui.graphics.drawscope.ContentDrawScope.super.mo1421toSpkPz2Gy4(f);
        }

        @java.lang.Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m6493toSpkPz2Gy4(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope, int i) {
            return androidx.compose.ui.graphics.drawscope.ContentDrawScope.super.mo1422toSpkPz2Gy4(i);
        }
    }
}
