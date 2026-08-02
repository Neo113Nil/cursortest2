package androidx.compose.material.pullrefresh;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001BQ\u0012\u0017\u0010\u0005\u001a\u0013\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00030\u0002\u0012'\u0010\t\u001a#\b\u0001\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018R%\u0010\u001c\u001a\u0013\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR5\u0010\u001f\u001a#\b\u0001\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Landroidx/compose/material/pullrefresh/PullRefreshNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "p0", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "p1", "", "p2", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Z)V", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreFling", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function2;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class PullRefreshNestedScrollConnection implements androidx.compose.ui.input.nestedscroll.NestedScrollConnection {
    private final boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<java.lang.Float, kotlin.coroutines.Continuation<? super java.lang.Float>, java.lang.Object> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.Float, java.lang.Float> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public PullRefreshNestedScrollConnection(kotlin.jvm.functions.Function1<? super java.lang.Float, java.lang.Float> function1, kotlin.jvm.functions.Function2<? super java.lang.Float, ? super kotlin.coroutines.Continuation<? super java.lang.Float>, ? extends java.lang.Object> function2, boolean z) {
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.Camera2StreamConfigurationMap = function2;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public final long mo1754onPreScrollOzD1aCk(long p0, int p1) {
        if (!this.getHighResolutionOutputSizeshNQ4ISI) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        }
        if (androidx.compose.ui.input.nestedscroll.NestedScrollSource.m7114equalsimpl0(p1, androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m7126getUserInputWNlRxjI())) {
            int i = (int) (p0 & 4294967295L);
            if (java.lang.Float.intBitsToFloat(i) < 0.0f) {
                float floatValue = this.getHighSpeedVideoFpsRangesFor.invoke(java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(i))).floatValue();
                return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.0f) << 32) | (4294967295L & java.lang.Float.floatToRawIntBits(floatValue)));
            }
        }
        return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public final long mo1529onPostScrollDzOQY0M(long p0, long p1, int p2) {
        if (!this.getHighResolutionOutputSizeshNQ4ISI) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        }
        if (androidx.compose.ui.input.nestedscroll.NestedScrollSource.m7114equalsimpl0(p2, androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m7126getUserInputWNlRxjI())) {
            if (java.lang.Float.intBitsToFloat((int) (p1 & 4294967295L)) > 0.0f) {
                return androidx.compose.ui.geometry.Offset.m5744constructorimpl((4294967295L & java.lang.Float.floatToRawIntBits(this.getHighSpeedVideoFpsRangesFor.invoke(java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(r5))).floatValue())) | (java.lang.Float.floatToRawIntBits(0.0f) << 32));
            }
        }
        return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo1753onPreFlingQWom1Mo(long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
        androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1 pullRefreshNestedScrollConnection$onPreFling$1;
        int i;
        float f;
        if (continuation instanceof androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1) {
            pullRefreshNestedScrollConnection$onPreFling$1 = (androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1) continuation;
            if ((pullRefreshNestedScrollConnection$onPreFling$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                pullRefreshNestedScrollConnection$onPreFling$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = pullRefreshNestedScrollConnection$onPreFling$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pullRefreshNestedScrollConnection$onPreFling$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.functions.Function2<java.lang.Float, kotlin.coroutines.Continuation<? super java.lang.Float>, java.lang.Object> function2 = this.Camera2StreamConfigurationMap;
                    java.lang.Float boxFloat = kotlin.coroutines.jvm.internal.Boxing.boxFloat(androidx.compose.ui.unit.Velocity.m8840getYimpl(j));
                    pullRefreshNestedScrollConnection$onPreFling$1.Camera2StreamConfigurationMap = 0.0f;
                    pullRefreshNestedScrollConnection$onPreFling$1.getHighSpeedVideoSizes = 1;
                    obj = function2.invoke(boxFloat, pullRefreshNestedScrollConnection$onPreFling$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    f = 0.0f;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f = pullRefreshNestedScrollConnection$onPreFling$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return androidx.compose.ui.unit.Velocity.m8830boximpl(androidx.compose.ui.unit.VelocityKt.Velocity(f, ((java.lang.Number) obj).floatValue()));
            }
        }
        pullRefreshNestedScrollConnection$onPreFling$1 = new androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1(this, continuation);
        java.lang.Object obj2 = pullRefreshNestedScrollConnection$onPreFling$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pullRefreshNestedScrollConnection$onPreFling$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        return androidx.compose.ui.unit.Velocity.m8830boximpl(androidx.compose.ui.unit.VelocityKt.Velocity(f, ((java.lang.Number) obj2).floatValue()));
    }
}
