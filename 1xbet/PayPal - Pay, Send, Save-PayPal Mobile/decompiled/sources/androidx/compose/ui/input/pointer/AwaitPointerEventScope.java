package androidx.compose.ui.input.pointer;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006JI\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n¢\u0006\u0002\b\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010JG\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n¢\u0006\u0002\b\rH\u0096@¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/input/pointer/PointerEvent;", "awaitPointerEvent", "(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "", "timeMillis", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "withTimeoutOrNull", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withTimeout", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/compose/ui/geometry/Size;", "getExtendedTouchPadding-NH-jbRc", "extendedTouchPadding", "getCurrentEvent", "()Landroidx/compose/ui/input/pointer/PointerEvent;", "currentEvent", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AwaitPointerEventScope extends androidx.compose.ui.unit.Density {
    java.lang.Object awaitPointerEvent(androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerEvent> continuation);

    androidx.compose.ui.input.pointer.PointerEvent getCurrentEvent();

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    long mo7142getSizeYbymL2g();

    androidx.compose.ui.platform.ViewConfiguration getViewConfiguration();

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m7144roundToPxR2X_6o(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j) {
            return androidx.compose.ui.input.pointer.AwaitPointerEventScope.super.mo1411roundToPxR2X_6o(j);
        }

        @java.lang.Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m7145roundToPx0680j_4(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, float f) {
            return androidx.compose.ui.input.pointer.AwaitPointerEventScope.super.mo1412roundToPx0680j_4(f);
        }

        @java.lang.Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m7146toDpGaN1DYA(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j) {
            return androidx.compose.ui.input.pointer.AwaitPointerEventScope.super.mo1413toDpGaN1DYA(j);
        }

        @java.lang.Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m7147toDpu2uoSUM(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, float f) {
            return androidx.compose.ui.input.pointer.AwaitPointerEventScope.super.mo1414toDpu2uoSUM(f);
        }

        @java.lang.Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m7148toDpu2uoSUM(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, int i) {
            return androidx.compose.ui.input.pointer.AwaitPointerEventScope.super.mo1415toDpu2uoSUM(i);
        }

        @java.lang.Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m7149toDpSizekrfVVM(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j) {
            return androidx.compose.ui.input.pointer.AwaitPointerEventScope.super.mo1416toDpSizekrfVVM(j);
        }

        @java.lang.Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m7150toPxR2X_6o(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j) {
            return androidx.compose.ui.input.pointer.AwaitPointerEventScope.super.mo1417toPxR2X_6o(j);
        }

        @java.lang.Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m7151toPx0680j_4(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, float f) {
            return androidx.compose.ui.input.pointer.AwaitPointerEventScope.super.mo1418toPx0680j_4(f);
        }

        @java.lang.Deprecated
        public static androidx.compose.ui.geometry.Rect toRect(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, androidx.compose.ui.unit.DpRect dpRect) {
            return androidx.compose.ui.input.pointer.AwaitPointerEventScope.super.toRect(dpRect);
        }

        @java.lang.Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m7152toSizeXkaWNTQ(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j) {
            return androidx.compose.ui.input.pointer.AwaitPointerEventScope.super.mo1419toSizeXkaWNTQ(j);
        }

        @java.lang.Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m7153toSp0xMU5do(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, float f) {
            return androidx.compose.ui.input.pointer.AwaitPointerEventScope.super.mo1420toSp0xMU5do(f);
        }

        @java.lang.Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m7154toSpkPz2Gy4(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, float f) {
            return androidx.compose.ui.input.pointer.AwaitPointerEventScope.super.mo1421toSpkPz2Gy4(f);
        }

        @java.lang.Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m7155toSpkPz2Gy4(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, int i) {
            return androidx.compose.ui.input.pointer.AwaitPointerEventScope.super.mo1422toSpkPz2Gy4(i);
        }

        @java.lang.Deprecated
        /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
        public static long m7143getExtendedTouchPaddingNHjbRc(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope) {
            return androidx.compose.ui.input.pointer.AwaitPointerEventScope.super.mo7141getExtendedTouchPaddingNHjbRc();
        }

        @java.lang.Deprecated
        public static <T> java.lang.Object withTimeoutOrNull(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.AwaitPointerEventScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) {
            return androidx.compose.ui.input.pointer.AwaitPointerEventScope.super.withTimeoutOrNull(j, function2, continuation);
        }

        @java.lang.Deprecated
        public static <T> java.lang.Object withTimeout(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.AwaitPointerEventScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) {
            return androidx.compose.ui.input.pointer.AwaitPointerEventScope.super.withTimeout(j, function2, continuation);
        }
    }

    /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
    default long mo7141getExtendedTouchPaddingNHjbRc() {
        return androidx.compose.ui.geometry.Size.INSTANCE.m5830getZeroNHjbRc();
    }

    static /* synthetic */ java.lang.Object awaitPointerEvent$default(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        }
        if ((i & 1) != 0) {
            pointerEventPass = androidx.compose.ui.input.pointer.PointerEventPass.Main;
        }
        return awaitPointerEventScope.awaitPointerEvent(pointerEventPass, continuation);
    }

    static /* synthetic */ <T> java.lang.Object withTimeoutOrNull$suspendImpl(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.AwaitPointerEventScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) {
        return function2.invoke(awaitPointerEventScope, continuation);
    }

    static /* synthetic */ <T> java.lang.Object withTimeout$suspendImpl(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.AwaitPointerEventScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) {
        return function2.invoke(awaitPointerEventScope, continuation);
    }

    default <T> java.lang.Object withTimeoutOrNull(long j, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.AwaitPointerEventScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) {
        return withTimeoutOrNull$suspendImpl(this, j, function2, continuation);
    }

    default <T> java.lang.Object withTimeout(long j, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.AwaitPointerEventScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) {
        return withTimeout$suspendImpl(this, j, function2, continuation);
    }
}
