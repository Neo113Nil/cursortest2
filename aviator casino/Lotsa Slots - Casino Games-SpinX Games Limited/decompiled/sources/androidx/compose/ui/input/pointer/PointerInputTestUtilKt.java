package androidx.compose.ui.input.pointer;

/* compiled from: PointerInputTestUtil.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0000\u001aD\u0010\b\u001a\u00020\t*\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\nj\u0002`\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001aL\u0010\u0013\u001a\u00020\t*\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\nj\u0002`\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001aX\u0010\u0017\u001a\u00020\t*\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\nj\u0002`\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0012\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0019\"\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aR\u0010\u0017\u001a\u00020\t*\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\nj\u0002`\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u001c2\b\b\u0002\u0010\u0010\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001d\u001a(\u0010\u001e\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010 \u001a\u00020\u0006H\u0000\u001a(\u0010!\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0014\u0010\"\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000*<\b\u0000\u0010#\"\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\n2\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"down", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "id", "", "durationMillis", "x", "", "y", "invokeOverAllPasses", "", "Lkotlin/Function3;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/input/pointer/PointerInputHandler;", "pointerEvent", "size", "invokeOverAllPasses-H0pRuoY", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/input/pointer/PointerEvent;J)V", "invokeOverPass", "pointerEventPass", "invokeOverPass-hUlJWOE", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "invokeOverPasses", "pointerEventPasses", "", "invokeOverPasses-hUlJWOE", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/input/pointer/PointerEvent;[Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/input/pointer/PointerEvent;Ljava/util/List;J)V", "moveBy", "dx", "dy", "moveTo", "up", "PointerInputHandler", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PointerInputTestUtilKt {
    public static /* synthetic */ androidx.compose.ui.input.pointer.PointerInputChange down$default(long j, long j2, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        return down(j, j2, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? 0.0f : f2);
    }

    public static final androidx.compose.ui.input.pointer.PointerInputChange down(long j, long j2, float f, float f2) {
        return new androidx.compose.ui.input.pointer.PointerInputChange(androidx.compose.ui.input.pointer.PointerId.m3255constructorimpl(j), j2, androidx.compose.ui.geometry.OffsetKt.Offset(f, f2), true, 1.0f, j2, androidx.compose.ui.geometry.OffsetKt.Offset(f, f2), false, false, 0, 0L, 1536, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public static /* synthetic */ androidx.compose.ui.input.pointer.PointerInputChange moveTo$default(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, long j, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            f2 = 0.0f;
        }
        return moveTo(pointerInputChange, j, f, f2);
    }

    public static final androidx.compose.ui.input.pointer.PointerInputChange moveTo(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, long j, float f, float f2) {
        long id = pointerInputChange.getId();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return new androidx.compose.ui.input.pointer.PointerInputChange(id, j, androidx.compose.ui.geometry.OffsetKt.Offset(f, f2), true, 1.0f, uptimeMillis, pointerInputChange.getPosition(), pressed, false, 0, 0L, 1536, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public static /* synthetic */ androidx.compose.ui.input.pointer.PointerInputChange moveBy$default(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, long j, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            f2 = 0.0f;
        }
        return moveBy(pointerInputChange, j, f, f2);
    }

    public static final androidx.compose.ui.input.pointer.PointerInputChange moveBy(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, long j, float f, float f2) {
        long id = pointerInputChange.getId();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return new androidx.compose.ui.input.pointer.PointerInputChange(id, pointerInputChange.getUptimeMillis() + j, androidx.compose.ui.geometry.OffsetKt.Offset(androidx.compose.ui.geometry.Offset.m1871getXimpl(pointerInputChange.getPosition()) + f, androidx.compose.ui.geometry.Offset.m1872getYimpl(pointerInputChange.getPosition()) + f2), true, 1.0f, uptimeMillis, pointerInputChange.getPosition(), pressed, false, 0, 0L, 1536, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public static final androidx.compose.ui.input.pointer.PointerInputChange up(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, long j) {
        long id = pointerInputChange.getId();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return new androidx.compose.ui.input.pointer.PointerInputChange(id, j, pointerInputChange.getPosition(), false, 1.0f, uptimeMillis, pointerInputChange.getPosition(), pressed, false, 0, 0L, 1536, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* renamed from: invokeOverAllPasses-H0pRuoY$default, reason: not valid java name */
    public static /* synthetic */ void m3328invokeOverAllPassesH0pRuoY$default(kotlin.jvm.functions.Function3 function3, androidx.compose.ui.input.pointer.PointerEvent pointerEvent, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = androidx.compose.ui.unit.IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m3327invokeOverAllPassesH0pRuoY(function3, pointerEvent, j);
    }

    /* renamed from: invokeOverAllPasses-H0pRuoY, reason: not valid java name */
    public static final void m3327invokeOverAllPassesH0pRuoY(kotlin.jvm.functions.Function3<? super androidx.compose.ui.input.pointer.PointerEvent, ? super androidx.compose.ui.input.pointer.PointerEventPass, ? super androidx.compose.ui.unit.IntSize, kotlin.Unit> function3, androidx.compose.ui.input.pointer.PointerEvent pointerEvent, long j) {
        m3331invokeOverPasseshUlJWOE(function3, pointerEvent, (java.util.List<? extends androidx.compose.ui.input.pointer.PointerEventPass>) kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.compose.ui.input.pointer.PointerEventPass[]{androidx.compose.ui.input.pointer.PointerEventPass.Initial, androidx.compose.ui.input.pointer.PointerEventPass.Main, androidx.compose.ui.input.pointer.PointerEventPass.Final}), j);
    }

    /* renamed from: invokeOverPass-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m3330invokeOverPasshUlJWOE$default(kotlin.jvm.functions.Function3 function3, androidx.compose.ui.input.pointer.PointerEvent pointerEvent, androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass, long j, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            j = androidx.compose.ui.unit.IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m3329invokeOverPasshUlJWOE(function3, pointerEvent, pointerEventPass, j);
    }

    /* renamed from: invokeOverPass-hUlJWOE, reason: not valid java name */
    public static final void m3329invokeOverPasshUlJWOE(kotlin.jvm.functions.Function3<? super androidx.compose.ui.input.pointer.PointerEvent, ? super androidx.compose.ui.input.pointer.PointerEventPass, ? super androidx.compose.ui.unit.IntSize, kotlin.Unit> function3, androidx.compose.ui.input.pointer.PointerEvent pointerEvent, androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass, long j) {
        m3331invokeOverPasseshUlJWOE(function3, pointerEvent, (java.util.List<? extends androidx.compose.ui.input.pointer.PointerEventPass>) kotlin.collections.CollectionsKt.listOf(pointerEventPass), j);
    }

    /* renamed from: invokeOverPasses-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m3334invokeOverPasseshUlJWOE$default(kotlin.jvm.functions.Function3 function3, androidx.compose.ui.input.pointer.PointerEvent pointerEvent, androidx.compose.ui.input.pointer.PointerEventPass[] pointerEventPassArr, long j, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            j = androidx.compose.ui.unit.IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m3332invokeOverPasseshUlJWOE((kotlin.jvm.functions.Function3<? super androidx.compose.ui.input.pointer.PointerEvent, ? super androidx.compose.ui.input.pointer.PointerEventPass, ? super androidx.compose.ui.unit.IntSize, kotlin.Unit>) function3, pointerEvent, pointerEventPassArr, j);
    }

    /* renamed from: invokeOverPasses-hUlJWOE, reason: not valid java name */
    public static final void m3332invokeOverPasseshUlJWOE(kotlin.jvm.functions.Function3<? super androidx.compose.ui.input.pointer.PointerEvent, ? super androidx.compose.ui.input.pointer.PointerEventPass, ? super androidx.compose.ui.unit.IntSize, kotlin.Unit> function3, androidx.compose.ui.input.pointer.PointerEvent pointerEvent, androidx.compose.ui.input.pointer.PointerEventPass[] pointerEventPassArr, long j) {
        m3331invokeOverPasseshUlJWOE(function3, pointerEvent, (java.util.List<? extends androidx.compose.ui.input.pointer.PointerEventPass>) kotlin.collections.ArraysKt.toList(pointerEventPassArr), j);
    }

    /* renamed from: invokeOverPasses-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m3333invokeOverPasseshUlJWOE$default(kotlin.jvm.functions.Function3 function3, androidx.compose.ui.input.pointer.PointerEvent pointerEvent, java.util.List list, long j, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            j = androidx.compose.ui.unit.IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m3331invokeOverPasseshUlJWOE((kotlin.jvm.functions.Function3<? super androidx.compose.ui.input.pointer.PointerEvent, ? super androidx.compose.ui.input.pointer.PointerEventPass, ? super androidx.compose.ui.unit.IntSize, kotlin.Unit>) function3, pointerEvent, (java.util.List<? extends androidx.compose.ui.input.pointer.PointerEventPass>) list, j);
    }

    /* renamed from: invokeOverPasses-hUlJWOE, reason: not valid java name */
    public static final void m3331invokeOverPasseshUlJWOE(kotlin.jvm.functions.Function3<? super androidx.compose.ui.input.pointer.PointerEvent, ? super androidx.compose.ui.input.pointer.PointerEventPass, ? super androidx.compose.ui.unit.IntSize, kotlin.Unit> function3, androidx.compose.ui.input.pointer.PointerEvent pointerEvent, java.util.List<? extends androidx.compose.ui.input.pointer.PointerEventPass> list, long j) {
        if (!(!pointerEvent.getChanges().isEmpty())) {
            throw new java.lang.IllegalArgumentException("invokeOverPasses called with no changes".toString());
        }
        if (!(!list.isEmpty())) {
            throw new java.lang.IllegalArgumentException("invokeOverPasses called with no passes".toString());
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            function3.invoke(pointerEvent, list.get(i), androidx.compose.ui.unit.IntSize.m4644boximpl(j));
        }
    }
}
