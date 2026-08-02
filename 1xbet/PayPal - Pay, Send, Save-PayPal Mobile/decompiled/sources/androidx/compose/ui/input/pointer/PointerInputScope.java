package androidx.compose.ui.input.pointer;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J?\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H¦@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\rR\u0014\u0010\u0015\u001a\u00020\u00128'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R*\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168W@WX\u0096\u000e¢\u0006\u0012\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/ui/unit/Density;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "awaitPointerEventScope", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/compose/ui/geometry/Size;", "getExtendedTouchPadding-NH-jbRc", "extendedTouchPadding", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "", "_", "getInterceptOutOfBoundsChildEvents", "()Z", "setInterceptOutOfBoundsChildEvents", "(Z)V", "getInterceptOutOfBoundsChildEvents$annotations", "()V", "interceptOutOfBoundsChildEvents"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface PointerInputScope extends androidx.compose.ui.unit.Density {
    <R> java.lang.Object awaitPointerEventScope(kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.AwaitPointerEventScope, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super R> continuation);

    default boolean getInterceptOutOfBoundsChildEvents() {
        return false;
    }

    /* renamed from: getSize-YbymL2g */
    long mo1409getSizeYbymL2g();

    androidx.compose.ui.platform.ViewConfiguration getViewConfiguration();

    default void setInterceptOutOfBoundsChildEvents(boolean z) {
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void getInterceptOutOfBoundsChildEvents$annotations() {
        }

        @java.lang.Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m7268roundToPxR2X_6o(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, long j) {
            return androidx.compose.ui.input.pointer.PointerInputScope.super.mo1411roundToPxR2X_6o(j);
        }

        @java.lang.Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m7269roundToPx0680j_4(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, float f) {
            return androidx.compose.ui.input.pointer.PointerInputScope.super.mo1412roundToPx0680j_4(f);
        }

        @java.lang.Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m7270toDpGaN1DYA(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, long j) {
            return androidx.compose.ui.input.pointer.PointerInputScope.super.mo1413toDpGaN1DYA(j);
        }

        @java.lang.Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m7271toDpu2uoSUM(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, float f) {
            return androidx.compose.ui.input.pointer.PointerInputScope.super.mo1414toDpu2uoSUM(f);
        }

        @java.lang.Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m7272toDpu2uoSUM(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, int i) {
            return androidx.compose.ui.input.pointer.PointerInputScope.super.mo1415toDpu2uoSUM(i);
        }

        @java.lang.Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m7273toDpSizekrfVVM(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, long j) {
            return androidx.compose.ui.input.pointer.PointerInputScope.super.mo1416toDpSizekrfVVM(j);
        }

        @java.lang.Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m7274toPxR2X_6o(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, long j) {
            return androidx.compose.ui.input.pointer.PointerInputScope.super.mo1417toPxR2X_6o(j);
        }

        @java.lang.Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m7275toPx0680j_4(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, float f) {
            return androidx.compose.ui.input.pointer.PointerInputScope.super.mo1418toPx0680j_4(f);
        }

        @java.lang.Deprecated
        public static androidx.compose.ui.geometry.Rect toRect(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, androidx.compose.ui.unit.DpRect dpRect) {
            return androidx.compose.ui.input.pointer.PointerInputScope.super.toRect(dpRect);
        }

        @java.lang.Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m7276toSizeXkaWNTQ(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, long j) {
            return androidx.compose.ui.input.pointer.PointerInputScope.super.mo1419toSizeXkaWNTQ(j);
        }

        @java.lang.Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m7277toSp0xMU5do(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, float f) {
            return androidx.compose.ui.input.pointer.PointerInputScope.super.mo1420toSp0xMU5do(f);
        }

        @java.lang.Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m7278toSpkPz2Gy4(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, float f) {
            return androidx.compose.ui.input.pointer.PointerInputScope.super.mo1421toSpkPz2Gy4(f);
        }

        @java.lang.Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m7279toSpkPz2Gy4(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, int i) {
            return androidx.compose.ui.input.pointer.PointerInputScope.super.mo1422toSpkPz2Gy4(i);
        }

        @java.lang.Deprecated
        /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
        public static long m7267getExtendedTouchPaddingNHjbRc(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope) {
            return androidx.compose.ui.input.pointer.PointerInputScope.super.mo1408getExtendedTouchPaddingNHjbRc();
        }

        @java.lang.Deprecated
        public static boolean getInterceptOutOfBoundsChildEvents(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope) {
            return androidx.compose.ui.input.pointer.PointerInputScope.super.getInterceptOutOfBoundsChildEvents();
        }

        @java.lang.Deprecated
        public static void setInterceptOutOfBoundsChildEvents(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, boolean z) {
            androidx.compose.ui.input.pointer.PointerInputScope.super.setInterceptOutOfBoundsChildEvents(z);
        }
    }

    /* renamed from: getExtendedTouchPadding-NH-jbRc */
    default long mo1408getExtendedTouchPaddingNHjbRc() {
        return androidx.compose.ui.geometry.Size.INSTANCE.m5830getZeroNHjbRc();
    }
}
