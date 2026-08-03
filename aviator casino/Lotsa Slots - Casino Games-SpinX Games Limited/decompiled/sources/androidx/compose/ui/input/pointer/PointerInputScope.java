package androidx.compose.ui.input.pointer;

/* compiled from: SuspendingPointerInputFilter.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J=\u0010\u0016\u001a\u0002H\u0017\"\u0004\b\u0000\u0010\u00172'\u0010\u0018\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00170\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0019¢\u0006\u0002\b\u001dH¦@¢\u0006\u0002\u0010\u001eR\u001a\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R*\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u00020\u0010X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/ui/unit/Density;", "extendedTouchPadding", "Landroidx/compose/ui/geometry/Size;", "getExtendedTouchPadding-NH-jbRc", "()J", "<anonymous parameter 0>", "", "interceptOutOfBoundsChildEvents", "getInterceptOutOfBoundsChildEvents$annotations", "()V", "getInterceptOutOfBoundsChildEvents", "()Z", "setInterceptOutOfBoundsChildEvents", "(Z)V", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "awaitPointerEventScope", "R", "block", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface PointerInputScope extends androidx.compose.ui.unit.Density {
    <R> java.lang.Object awaitPointerEventScope(kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.AwaitPointerEventScope, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super R> continuation);

    /* renamed from: getExtendedTouchPadding-NH-jbRc */
    long mo306getExtendedTouchPaddingNHjbRc();

    boolean getInterceptOutOfBoundsChildEvents();

    /* renamed from: getSize-YbymL2g */
    long mo307getSizeYbymL2g();

    androidx.compose.ui.platform.ViewConfiguration getViewConfiguration();

    void setInterceptOutOfBoundsChildEvents(boolean z);

    /* compiled from: SuspendingPointerInputFilter.kt */
    /* renamed from: androidx.compose.ui.input.pointer.PointerInputScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$getInterceptOutOfBoundsChildEvents(androidx.compose.ui.input.pointer.PointerInputScope _this) {
            return false;
        }

        public static void $default$setInterceptOutOfBoundsChildEvents(androidx.compose.ui.input.pointer.PointerInputScope _this, boolean z) {
        }

        /* renamed from: $default$getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
        public static long m3300$default$getExtendedTouchPaddingNHjbRc(androidx.compose.ui.input.pointer.PointerInputScope _this) {
            return androidx.compose.ui.geometry.Size.INSTANCE.m1949getZeroNHjbRc();
        }
    }

    /* compiled from: SuspendingPointerInputFilter.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void getInterceptOutOfBoundsChildEvents$annotations() {
        }

        @java.lang.Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m3315roundToPxR2X_6o(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, long j) {
            return androidx.compose.ui.unit.Density.CC.m4442$default$roundToPxR2X_6o(pointerInputScope, j);
        }

        @java.lang.Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m3316roundToPx0680j_4(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, float f) {
            return androidx.compose.ui.unit.Density.CC.m4443$default$roundToPx0680j_4(pointerInputScope, f);
        }

        @java.lang.Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m3317toDpGaN1DYA(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, long j) {
            return androidx.compose.ui.unit.FontScaling.CC.m4587$default$toDpGaN1DYA(pointerInputScope, j);
        }

        @java.lang.Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3318toDpu2uoSUM(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, float f) {
            return androidx.compose.ui.unit.Density.CC.m4444$default$toDpu2uoSUM(pointerInputScope, f);
        }

        @java.lang.Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3319toDpu2uoSUM(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, int i) {
            return androidx.compose.ui.unit.Density.CC.m4445$default$toDpu2uoSUM((androidx.compose.ui.unit.Density) pointerInputScope, i);
        }

        @java.lang.Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m3320toDpSizekrfVVM(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, long j) {
            return androidx.compose.ui.unit.Density.CC.m4446$default$toDpSizekrfVVM(pointerInputScope, j);
        }

        @java.lang.Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m3321toPxR2X_6o(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, long j) {
            return androidx.compose.ui.unit.Density.CC.m4447$default$toPxR2X_6o(pointerInputScope, j);
        }

        @java.lang.Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m3322toPx0680j_4(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, float f) {
            return androidx.compose.ui.unit.Density.CC.m4448$default$toPx0680j_4(pointerInputScope, f);
        }

        @java.lang.Deprecated
        public static androidx.compose.ui.geometry.Rect toRect(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, androidx.compose.ui.unit.DpRect dpRect) {
            return androidx.compose.ui.unit.Density.CC.$default$toRect(pointerInputScope, dpRect);
        }

        @java.lang.Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m3323toSizeXkaWNTQ(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, long j) {
            return androidx.compose.ui.unit.Density.CC.m4449$default$toSizeXkaWNTQ(pointerInputScope, j);
        }

        @java.lang.Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m3324toSp0xMU5do(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, float f) {
            return androidx.compose.ui.unit.FontScaling.CC.m4588$default$toSp0xMU5do(pointerInputScope, f);
        }

        @java.lang.Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3325toSpkPz2Gy4(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, float f) {
            return androidx.compose.ui.unit.Density.CC.m4450$default$toSpkPz2Gy4(pointerInputScope, f);
        }

        @java.lang.Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3326toSpkPz2Gy4(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, int i) {
            return androidx.compose.ui.unit.Density.CC.m4451$default$toSpkPz2Gy4((androidx.compose.ui.unit.Density) pointerInputScope, i);
        }

        @java.lang.Deprecated
        /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
        public static long m3314getExtendedTouchPaddingNHjbRc(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope) {
            return androidx.compose.ui.input.pointer.PointerInputScope.CC.m3300$default$getExtendedTouchPaddingNHjbRc(pointerInputScope);
        }

        @java.lang.Deprecated
        public static boolean getInterceptOutOfBoundsChildEvents(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope) {
            return androidx.compose.ui.input.pointer.PointerInputScope.CC.$default$getInterceptOutOfBoundsChildEvents(pointerInputScope);
        }

        @java.lang.Deprecated
        public static void setInterceptOutOfBoundsChildEvents(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, boolean z) {
            androidx.compose.ui.input.pointer.PointerInputScope.CC.$default$setInterceptOutOfBoundsChildEvents(pointerInputScope, z);
        }
    }
}
