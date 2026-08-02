package androidx.compose.ui.input.pointer;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0006\u001aG\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\f\u001a\u00020\t*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u0010\u001a\u00020\t*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0010\u0010\r\u001a\u001b\u0010\u0011\u001a\u00020\t*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001aA\u0010\u001d\u001a\u00020\u0017*\u001e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0013j\u0002`\u00182\u0006\u0010\u0019\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001aI\u0010!\u001a\u00020\u0017*\u001e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0013j\u0002`\u00182\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u001f\u0010 \u001aU\u0010&\u001a\u00020\u0017*\u001e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0013j\u0002`\u00182\u0006\u0010\u0019\u001a\u00020\u00142\u0012\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\"\"\u00020\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u0016H\u0000¢\u0006\u0004\b$\u0010%\u001aO\u0010&\u001a\u00020\u0017*\u001e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0013j\u0002`\u00182\u0006\u0010\u0019\u001a\u00020\u00142\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u0016H\u0000¢\u0006\u0004\b$\u0010'*<\b\u0000\u0010(\"\u001a\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00132\u001a\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0013"}, d2 = {"", "id", "durationMillis", "", "x", "y", "", "Landroidx/compose/ui/input/pointer/HistoricalChange;", "historicalData", "Landroidx/compose/ui/input/pointer/PointerInputChange;", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_DOWN, "(JJFFLjava/util/List;)Landroidx/compose/ui/input/pointer/PointerInputChange;", "moveTo", "(Landroidx/compose/ui/input/pointer/PointerInputChange;JFF)Landroidx/compose/ui/input/pointer/PointerInputChange;", "dx", "dy", "moveBy", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_UP, "(Landroidx/compose/ui/input/pointer/PointerInputChange;J)Landroidx/compose/ui/input/pointer/PointerInputChange;", "Lkotlin/Function3;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "Landroidx/compose/ui/unit/IntSize;", "", "Landroidx/compose/ui/input/pointer/PointerInputHandler;", "pointerEvent", io.ktor.http.ContentDisposition.Parameters.Size, "invokeOverAllPasses-H0pRuoY", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/input/pointer/PointerEvent;J)V", "invokeOverAllPasses", "pointerEventPass", "invokeOverPass-hUlJWOE", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "invokeOverPass", "", "pointerEventPasses", "invokeOverPasses-hUlJWOE", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/input/pointer/PointerEvent;[Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "invokeOverPasses", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/input/pointer/PointerEvent;Ljava/util/List;J)V", "PointerInputHandler"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PointerInputTestUtilKt {
    public static /* synthetic */ androidx.compose.ui.input.pointer.PointerInputChange down$default(long j, long j2, float f, float f2, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long j3 = j2;
        float f3 = (i & 4) != 0 ? 0.0f : f;
        float f4 = (i & 8) != 0 ? 0.0f : f2;
        if ((i & 16) != 0) {
            list = null;
        }
        return down(j, j3, f3, f4, list);
    }

    public static final androidx.compose.ui.input.pointer.PointerInputChange down(long j, long j2, float f, float f2, java.util.List<androidx.compose.ui.input.pointer.HistoricalChange> list) {
        androidx.compose.ui.input.pointer.PointerInputChange m7226copyOHpmEuE;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = new androidx.compose.ui.input.pointer.PointerInputChange(androidx.compose.ui.input.pointer.PointerId.m7211constructorimpl(j), j2, androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f) << 32) | (java.lang.Float.floatToRawIntBits(f2) & 4294967295L)), true, 1.0f, j2, androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f) << 32) | (4294967295L & java.lang.Float.floatToRawIntBits(f2))), false, false, 0, 0L, 1536, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        java.util.List<androidx.compose.ui.input.pointer.HistoricalChange> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return pointerInputChange;
        }
        m7226copyOHpmEuE = pointerInputChange.m7226copyOHpmEuE((r34 & 1) != 0 ? pointerInputChange.id : 0L, (r34 & 2) != 0 ? pointerInputChange.uptimeMillis : 0L, (r34 & 4) != 0 ? pointerInputChange.position : 0L, (r34 & 8) != 0 ? pointerInputChange.pressed : false, (r34 & 16) != 0 ? pointerInputChange.previousUptimeMillis : 0L, (r34 & 32) != 0 ? pointerInputChange.previousPosition : 0L, (r34 & 64) != 0 ? pointerInputChange.previousPressed : false, (r34 & 128) != 0 ? pointerInputChange.type : 0, list, (r34 & 512) != 0 ? pointerInputChange.scrollDelta : 0L);
        return m7226copyOHpmEuE;
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
        return new androidx.compose.ui.input.pointer.PointerInputChange(pointerInputChange.getId(), j, androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f) << 32) | (java.lang.Float.floatToRawIntBits(f2) & 4294967295L)), true, 1.0f, pointerInputChange.getUptimeMillis(), pointerInputChange.getPosition(), pointerInputChange.getPressed(), false, 0, 0L, 1536, (kotlin.jvm.internal.DefaultConstructorMarker) null);
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
        long position = pointerInputChange.getPosition();
        long uptimeMillis2 = pointerInputChange.getUptimeMillis();
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (pointerInputChange.getPosition() >> 32));
        return new androidx.compose.ui.input.pointer.PointerInputChange(id, uptimeMillis2 + j, androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (pointerInputChange.getPosition() & 4294967295L)) + f2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat + f) << 32)), true, 1.0f, uptimeMillis, position, pressed, false, 0, 0L, 1536, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public static final androidx.compose.ui.input.pointer.PointerInputChange up(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, long j) {
        long id = pointerInputChange.getId();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return new androidx.compose.ui.input.pointer.PointerInputChange(id, j, pointerInputChange.getPosition(), false, 1.0f, uptimeMillis, pointerInputChange.getPosition(), pressed, false, 0, 0L, 1536, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* renamed from: invokeOverAllPasses-H0pRuoY, reason: not valid java name */
    public static final void m7280invokeOverAllPassesH0pRuoY(kotlin.jvm.functions.Function3<? super androidx.compose.ui.input.pointer.PointerEvent, ? super androidx.compose.ui.input.pointer.PointerEventPass, ? super androidx.compose.ui.unit.IntSize, kotlin.Unit> function3, androidx.compose.ui.input.pointer.PointerEvent pointerEvent, long j) {
        m7284invokeOverPasseshUlJWOE(function3, pointerEvent, (java.util.List<? extends androidx.compose.ui.input.pointer.PointerEventPass>) kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.compose.ui.input.pointer.PointerEventPass[]{androidx.compose.ui.input.pointer.PointerEventPass.Initial, androidx.compose.ui.input.pointer.PointerEventPass.Main, androidx.compose.ui.input.pointer.PointerEventPass.Final}), j);
    }

    /* renamed from: invokeOverPass-hUlJWOE, reason: not valid java name */
    public static final void m7282invokeOverPasshUlJWOE(kotlin.jvm.functions.Function3<? super androidx.compose.ui.input.pointer.PointerEvent, ? super androidx.compose.ui.input.pointer.PointerEventPass, ? super androidx.compose.ui.unit.IntSize, kotlin.Unit> function3, androidx.compose.ui.input.pointer.PointerEvent pointerEvent, androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass, long j) {
        m7284invokeOverPasseshUlJWOE(function3, pointerEvent, (java.util.List<? extends androidx.compose.ui.input.pointer.PointerEventPass>) kotlin.collections.CollectionsKt.listOf(pointerEventPass), j);
    }

    /* renamed from: invokeOverPasses-hUlJWOE, reason: not valid java name */
    public static final void m7285invokeOverPasseshUlJWOE(kotlin.jvm.functions.Function3<? super androidx.compose.ui.input.pointer.PointerEvent, ? super androidx.compose.ui.input.pointer.PointerEventPass, ? super androidx.compose.ui.unit.IntSize, kotlin.Unit> function3, androidx.compose.ui.input.pointer.PointerEvent pointerEvent, androidx.compose.ui.input.pointer.PointerEventPass[] pointerEventPassArr, long j) {
        m7284invokeOverPasseshUlJWOE(function3, pointerEvent, (java.util.List<? extends androidx.compose.ui.input.pointer.PointerEventPass>) kotlin.collections.ArraysKt.toList(pointerEventPassArr), j);
    }

    /* renamed from: invokeOverPasses-hUlJWOE, reason: not valid java name */
    public static final void m7284invokeOverPasseshUlJWOE(kotlin.jvm.functions.Function3<? super androidx.compose.ui.input.pointer.PointerEvent, ? super androidx.compose.ui.input.pointer.PointerEventPass, ? super androidx.compose.ui.unit.IntSize, kotlin.Unit> function3, androidx.compose.ui.input.pointer.PointerEvent pointerEvent, java.util.List<? extends androidx.compose.ui.input.pointer.PointerEventPass> list, long j) {
        if (pointerEvent.getChanges().isEmpty()) {
            throw new java.lang.IllegalArgumentException("invokeOverPasses called with no changes".toString());
        }
        java.util.List<? extends androidx.compose.ui.input.pointer.PointerEventPass> list2 = list;
        if (list2.isEmpty()) {
            throw new java.lang.IllegalArgumentException("invokeOverPasses called with no passes".toString());
        }
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            function3.invoke(pointerEvent, list.get(i), androidx.compose.ui.unit.IntSize.m8764boximpl(j));
        }
    }

    /* renamed from: invokeOverAllPasses-H0pRuoY$default, reason: not valid java name */
    public static /* synthetic */ void m7281invokeOverAllPassesH0pRuoY$default(kotlin.jvm.functions.Function3 function3, androidx.compose.ui.input.pointer.PointerEvent pointerEvent, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = androidx.compose.ui.unit.IntSize.m8767constructorimpl(9223372034707292159L);
        }
        m7280invokeOverAllPassesH0pRuoY(function3, pointerEvent, j);
    }

    /* renamed from: invokeOverPass-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m7283invokeOverPasshUlJWOE$default(kotlin.jvm.functions.Function3 function3, androidx.compose.ui.input.pointer.PointerEvent pointerEvent, androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass, long j, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            j = androidx.compose.ui.unit.IntSize.m8767constructorimpl(9223372034707292159L);
        }
        m7282invokeOverPasshUlJWOE(function3, pointerEvent, pointerEventPass, j);
    }

    /* renamed from: invokeOverPasses-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m7287invokeOverPasseshUlJWOE$default(kotlin.jvm.functions.Function3 function3, androidx.compose.ui.input.pointer.PointerEvent pointerEvent, androidx.compose.ui.input.pointer.PointerEventPass[] pointerEventPassArr, long j, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            j = androidx.compose.ui.unit.IntSize.m8767constructorimpl(9223372034707292159L);
        }
        m7285invokeOverPasseshUlJWOE((kotlin.jvm.functions.Function3<? super androidx.compose.ui.input.pointer.PointerEvent, ? super androidx.compose.ui.input.pointer.PointerEventPass, ? super androidx.compose.ui.unit.IntSize, kotlin.Unit>) function3, pointerEvent, pointerEventPassArr, j);
    }

    /* renamed from: invokeOverPasses-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m7286invokeOverPasseshUlJWOE$default(kotlin.jvm.functions.Function3 function3, androidx.compose.ui.input.pointer.PointerEvent pointerEvent, java.util.List list, long j, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            j = androidx.compose.ui.unit.IntSize.m8767constructorimpl(9223372034707292159L);
        }
        m7284invokeOverPasseshUlJWOE((kotlin.jvm.functions.Function3<? super androidx.compose.ui.input.pointer.PointerEvent, ? super androidx.compose.ui.input.pointer.PointerEventPass, ? super androidx.compose.ui.unit.IntSize, kotlin.Unit>) function3, pointerEvent, (java.util.List<? extends androidx.compose.ui.input.pointer.PointerEventPass>) list, j);
    }
}
