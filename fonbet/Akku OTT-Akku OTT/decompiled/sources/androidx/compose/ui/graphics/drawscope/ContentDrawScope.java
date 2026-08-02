package androidx.compose.ui.graphics.drawscope;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawContent", "", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ContentDrawScope extends DrawScope {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m891drawImageAZ2fEMs(ContentDrawScope contentDrawScope, ImageBitmap image, long j, long j2, long j3, long j4, float f, DrawStyle style, ColorFilter colorFilter, int i, int i2) {
            Intrinsics.checkNotNullParameter(contentDrawScope, "this");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(style, "style");
            DrawScope.DefaultImpls.m913drawImageAZ2fEMs(contentDrawScope, image, j, j2, j3, j4, f, style, colorFilter, i, i2);
        }

        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m892getCenterF1C5BW0(ContentDrawScope contentDrawScope) {
            Intrinsics.checkNotNullParameter(contentDrawScope, "this");
            return DrawScope.DefaultImpls.m928getCenterF1C5BW0(contentDrawScope);
        }

        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m893getSizeNHjbRc(ContentDrawScope contentDrawScope) {
            Intrinsics.checkNotNullParameter(contentDrawScope, "this");
            return DrawScope.DefaultImpls.m929getSizeNHjbRc(contentDrawScope);
        }

        @Stable
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m894roundToPxR2X_6o(ContentDrawScope contentDrawScope, long j) {
            Intrinsics.checkNotNullParameter(contentDrawScope, "this");
            return DrawScope.DefaultImpls.m931roundToPxR2X_6o(contentDrawScope, j);
        }

        @Stable
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m895roundToPx0680j_4(ContentDrawScope contentDrawScope, float f) {
            Intrinsics.checkNotNullParameter(contentDrawScope, "this");
            return DrawScope.DefaultImpls.m932roundToPx0680j_4(contentDrawScope, f);
        }

        @Stable
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m896toDpGaN1DYA(ContentDrawScope contentDrawScope, long j) {
            Intrinsics.checkNotNullParameter(contentDrawScope, "this");
            return DrawScope.DefaultImpls.m933toDpGaN1DYA(contentDrawScope, j);
        }

        @Stable
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m897toDpu2uoSUM(ContentDrawScope contentDrawScope, float f) {
            Intrinsics.checkNotNullParameter(contentDrawScope, "this");
            return DrawScope.DefaultImpls.m934toDpu2uoSUM(contentDrawScope, f);
        }

        @Stable
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m899toDpSizekrfVVM(ContentDrawScope contentDrawScope, long j) {
            Intrinsics.checkNotNullParameter(contentDrawScope, "this");
            return DrawScope.DefaultImpls.m936toDpSizekrfVVM(contentDrawScope, j);
        }

        @Stable
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m900toPxR2X_6o(ContentDrawScope contentDrawScope, long j) {
            Intrinsics.checkNotNullParameter(contentDrawScope, "this");
            return DrawScope.DefaultImpls.m937toPxR2X_6o(contentDrawScope, j);
        }

        @Stable
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m901toPx0680j_4(ContentDrawScope contentDrawScope, float f) {
            Intrinsics.checkNotNullParameter(contentDrawScope, "this");
            return DrawScope.DefaultImpls.m938toPx0680j_4(contentDrawScope, f);
        }

        @Stable
        public static Rect toRect(ContentDrawScope contentDrawScope, DpRect receiver) {
            Intrinsics.checkNotNullParameter(contentDrawScope, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return DrawScope.DefaultImpls.toRect(contentDrawScope, receiver);
        }

        @Stable
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m902toSizeXkaWNTQ(ContentDrawScope contentDrawScope, long j) {
            Intrinsics.checkNotNullParameter(contentDrawScope, "this");
            return DrawScope.DefaultImpls.m939toSizeXkaWNTQ(contentDrawScope, j);
        }

        @Stable
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m903toSp0xMU5do(ContentDrawScope contentDrawScope, float f) {
            Intrinsics.checkNotNullParameter(contentDrawScope, "this");
            return DrawScope.DefaultImpls.m940toSp0xMU5do(contentDrawScope, f);
        }

        @Stable
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m904toSpkPz2Gy4(ContentDrawScope contentDrawScope, float f) {
            Intrinsics.checkNotNullParameter(contentDrawScope, "this");
            return DrawScope.DefaultImpls.m941toSpkPz2Gy4(contentDrawScope, f);
        }

        @Stable
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m898toDpu2uoSUM(ContentDrawScope contentDrawScope, int i) {
            Intrinsics.checkNotNullParameter(contentDrawScope, "this");
            return DrawScope.DefaultImpls.m935toDpu2uoSUM((DrawScope) contentDrawScope, i);
        }

        @Stable
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m905toSpkPz2Gy4(ContentDrawScope contentDrawScope, int i) {
            Intrinsics.checkNotNullParameter(contentDrawScope, "this");
            return DrawScope.DefaultImpls.m942toSpkPz2Gy4((DrawScope) contentDrawScope, i);
        }
    }

    void drawContent();
}
