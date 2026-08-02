package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0013\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0015\u001a\u00020\u0002*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u0014*\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/compose/material/SwipeableKt$PreUpPostDownNestedScrollConnection$1;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/geometry/Offset;", com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreFling", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostFling", "", "Camera2StreamConfigurationMap", "(F)J", "getHighResolutionOutputSizeshNQ4ISI", "(J)F"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SwipeableKt$PreUpPostDownNestedScrollConnection$1 implements androidx.compose.ui.input.nestedscroll.NestedScrollConnection {
    final /* synthetic */ androidx.compose.material.SwipeableState<T> getHighResolutionOutputSizeshNQ4ISI;

    SwipeableKt$PreUpPostDownNestedScrollConnection$1(androidx.compose.material.SwipeableState<T> swipeableState) {
        this.getHighResolutionOutputSizeshNQ4ISI = swipeableState;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public final long mo1754onPreScrollOzD1aCk(long available, int source) {
        float highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(available);
        if (highResolutionOutputSizeshNQ4ISI < 0.0f && androidx.compose.ui.input.nestedscroll.NestedScrollSource.m7114equalsimpl0(source, androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m7126getUserInputWNlRxjI())) {
            return Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI.performDrag(highResolutionOutputSizeshNQ4ISI));
        }
        return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public final long mo1529onPostScrollDzOQY0M(long consumed, long available, int source) {
        if (androidx.compose.ui.input.nestedscroll.NestedScrollSource.m7114equalsimpl0(source, androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m7126getUserInputWNlRxjI())) {
            return Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI.performDrag(getHighResolutionOutputSizeshNQ4ISI(available)));
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
        androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1;
        int i;
        if (continuation instanceof androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1) {
            swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 = (androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1) continuation;
            if ((swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    float m8839getXimpl = androidx.compose.ui.unit.Velocity.m8839getXimpl(j);
                    float m8840getYimpl = androidx.compose.ui.unit.Velocity.m8840getYimpl(j);
                    float highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(m8839getXimpl) << 32) | (java.lang.Float.floatToRawIntBits(m8840getYimpl) & 4294967295L)));
                    if (highResolutionOutputSizeshNQ4ISI < 0.0f && this.getHighResolutionOutputSizeshNQ4ISI.getOffset().getValue().floatValue() > this.getHighResolutionOutputSizeshNQ4ISI.getMinBound()) {
                        androidx.compose.material.SwipeableState<T> swipeableState = this.getHighResolutionOutputSizeshNQ4ISI;
                        swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.getHighSpeedVideoFpsRanges = j;
                        swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        if (swipeableState.performFling(highResolutionOutputSizeshNQ4ISI, swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        j = androidx.compose.ui.unit.Velocity.INSTANCE.m8850getZero9UxMQ8M();
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return androidx.compose.ui.unit.Velocity.m8830boximpl(j);
            }
        }
        swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 = new androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1(this, continuation);
        java.lang.Object obj2 = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        return androidx.compose.ui.unit.Velocity.m8830boximpl(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo1528onPostFlingRZ2iAVY(long j, long j2, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
        androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1;
        int i;
        if (continuation instanceof androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1) {
            swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 = (androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1) continuation;
            if ((swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.material.SwipeableState<T> swipeableState = this.getHighResolutionOutputSizeshNQ4ISI;
                    float m8839getXimpl = androidx.compose.ui.unit.Velocity.m8839getXimpl(j2);
                    float m8840getYimpl = androidx.compose.ui.unit.Velocity.m8840getYimpl(j2);
                    float highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(m8839getXimpl) << 32) | (java.lang.Float.floatToRawIntBits(m8840getYimpl) & 4294967295L)));
                    swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.getHighSpeedVideoSizes = j2;
                    swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.getHighSpeedVideoFpsRanges = 1;
                    if (swipeableState.performFling(highResolutionOutputSizeshNQ4ISI, swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j2 = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return androidx.compose.ui.unit.Velocity.m8830boximpl(j2);
            }
        }
        swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 = new androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1(this, continuation);
        java.lang.Object obj2 = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        return androidx.compose.ui.unit.Velocity.m8830boximpl(j2);
    }

    private static long Camera2StreamConfigurationMap(float f) {
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.0f) << 32) | (java.lang.Float.floatToRawIntBits(f) & 4294967295L));
    }

    private static float getHighResolutionOutputSizeshNQ4ISI(long j) {
        return java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
    }
}
