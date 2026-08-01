package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TapGestureDetector.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/unit/Density;", "awaitRelease", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryAwaitRelease", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public interface PressGestureScope extends Density {
    Object awaitRelease(Continuation<? super Unit> continuation);

    Object tryAwaitRelease(Continuation<? super Boolean> continuation);

    /* compiled from: TapGestureDetector.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m296roundToPxR2X_6o(PressGestureScope pressGestureScope, long j) {
            return PressGestureScope.super.mo308roundToPxR2X_6o(j);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m297roundToPx0680j_4(PressGestureScope pressGestureScope, float f) {
            return PressGestureScope.super.mo309roundToPx0680j_4(f);
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m298toDpGaN1DYA(PressGestureScope pressGestureScope, long j) {
            return PressGestureScope.super.mo310toDpGaN1DYA(j);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m299toDpu2uoSUM(PressGestureScope pressGestureScope, float f) {
            return PressGestureScope.super.mo311toDpu2uoSUM(f);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m300toDpu2uoSUM(PressGestureScope pressGestureScope, int i) {
            return PressGestureScope.super.mo312toDpu2uoSUM(i);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m301toDpSizekrfVVM(PressGestureScope pressGestureScope, long j) {
            return PressGestureScope.super.mo313toDpSizekrfVVM(j);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m302toPxR2X_6o(PressGestureScope pressGestureScope, long j) {
            return PressGestureScope.super.mo314toPxR2X_6o(j);
        }

        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m303toPx0680j_4(PressGestureScope pressGestureScope, float f) {
            return PressGestureScope.super.mo315toPx0680j_4(f);
        }

        @Deprecated
        public static Rect toRect(PressGestureScope pressGestureScope, DpRect receiver) {
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return PressGestureScope.super.toRect(receiver);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m304toSizeXkaWNTQ(PressGestureScope pressGestureScope, long j) {
            return PressGestureScope.super.mo316toSizeXkaWNTQ(j);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m305toSp0xMU5do(PressGestureScope pressGestureScope, float f) {
            return PressGestureScope.super.mo317toSp0xMU5do(f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m306toSpkPz2Gy4(PressGestureScope pressGestureScope, float f) {
            return PressGestureScope.super.mo318toSpkPz2Gy4(f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m307toSpkPz2Gy4(PressGestureScope pressGestureScope, int i) {
            return PressGestureScope.super.mo319toSpkPz2Gy4(i);
        }
    }
}
