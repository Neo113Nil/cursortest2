package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u0006\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/unit/Density;", "", "awaitRelease", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "tryAwaitRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface PressGestureScope extends androidx.compose.ui.unit.Density {
    java.lang.Object awaitRelease(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object tryAwaitRelease(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m1506roundToPxR2X_6o(androidx.compose.foundation.gestures.PressGestureScope pressGestureScope, long j) {
            return androidx.compose.foundation.gestures.PressGestureScope.super.mo1411roundToPxR2X_6o(j);
        }

        @java.lang.Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m1507roundToPx0680j_4(androidx.compose.foundation.gestures.PressGestureScope pressGestureScope, float f) {
            return androidx.compose.foundation.gestures.PressGestureScope.super.mo1412roundToPx0680j_4(f);
        }

        @java.lang.Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m1508toDpGaN1DYA(androidx.compose.foundation.gestures.PressGestureScope pressGestureScope, long j) {
            return androidx.compose.foundation.gestures.PressGestureScope.super.mo1413toDpGaN1DYA(j);
        }

        @java.lang.Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m1509toDpu2uoSUM(androidx.compose.foundation.gestures.PressGestureScope pressGestureScope, float f) {
            return androidx.compose.foundation.gestures.PressGestureScope.super.mo1414toDpu2uoSUM(f);
        }

        @java.lang.Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m1510toDpu2uoSUM(androidx.compose.foundation.gestures.PressGestureScope pressGestureScope, int i) {
            return androidx.compose.foundation.gestures.PressGestureScope.super.mo1415toDpu2uoSUM(i);
        }

        @java.lang.Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m1511toDpSizekrfVVM(androidx.compose.foundation.gestures.PressGestureScope pressGestureScope, long j) {
            return androidx.compose.foundation.gestures.PressGestureScope.super.mo1416toDpSizekrfVVM(j);
        }

        @java.lang.Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m1512toPxR2X_6o(androidx.compose.foundation.gestures.PressGestureScope pressGestureScope, long j) {
            return androidx.compose.foundation.gestures.PressGestureScope.super.mo1417toPxR2X_6o(j);
        }

        @java.lang.Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m1513toPx0680j_4(androidx.compose.foundation.gestures.PressGestureScope pressGestureScope, float f) {
            return androidx.compose.foundation.gestures.PressGestureScope.super.mo1418toPx0680j_4(f);
        }

        @java.lang.Deprecated
        public static androidx.compose.ui.geometry.Rect toRect(androidx.compose.foundation.gestures.PressGestureScope pressGestureScope, androidx.compose.ui.unit.DpRect dpRect) {
            return androidx.compose.foundation.gestures.PressGestureScope.super.toRect(dpRect);
        }

        @java.lang.Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m1514toSizeXkaWNTQ(androidx.compose.foundation.gestures.PressGestureScope pressGestureScope, long j) {
            return androidx.compose.foundation.gestures.PressGestureScope.super.mo1419toSizeXkaWNTQ(j);
        }

        @java.lang.Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m1515toSp0xMU5do(androidx.compose.foundation.gestures.PressGestureScope pressGestureScope, float f) {
            return androidx.compose.foundation.gestures.PressGestureScope.super.mo1420toSp0xMU5do(f);
        }

        @java.lang.Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m1516toSpkPz2Gy4(androidx.compose.foundation.gestures.PressGestureScope pressGestureScope, float f) {
            return androidx.compose.foundation.gestures.PressGestureScope.super.mo1421toSpkPz2Gy4(f);
        }

        @java.lang.Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m1517toSpkPz2Gy4(androidx.compose.foundation.gestures.PressGestureScope pressGestureScope, int i) {
            return androidx.compose.foundation.gestures.PressGestureScope.super.mo1422toSpkPz2Gy4(i);
        }
    }
}
