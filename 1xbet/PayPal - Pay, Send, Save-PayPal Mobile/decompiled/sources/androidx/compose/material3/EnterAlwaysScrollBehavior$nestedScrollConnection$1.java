package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/material3/EnterAlwaysScrollBehavior$nestedScrollConnection$1;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/geometry/Offset;", com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostFling"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EnterAlwaysScrollBehavior$nestedScrollConnection$1 implements androidx.compose.ui.input.nestedscroll.NestedScrollConnection {
    final /* synthetic */ androidx.compose.material3.EnterAlwaysScrollBehavior Camera2StreamConfigurationMap;

    EnterAlwaysScrollBehavior$nestedScrollConnection$1(androidx.compose.material3.EnterAlwaysScrollBehavior enterAlwaysScrollBehavior) {
        this.Camera2StreamConfigurationMap = enterAlwaysScrollBehavior;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public final long mo1754onPreScrollOzD1aCk(long available, int source) {
        if (!this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI().invoke().booleanValue()) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        }
        float heightOffset = this.Camera2StreamConfigurationMap.getGetHighSpeedVideoFpsRangesFor().getHeightOffset();
        androidx.compose.material3.TopAppBarState getHighSpeedVideoFpsRangesFor = this.Camera2StreamConfigurationMap.getGetHighSpeedVideoFpsRangesFor();
        getHighSpeedVideoFpsRangesFor.setHeightOffset(getHighSpeedVideoFpsRangesFor.getHeightOffset() + java.lang.Float.intBitsToFloat((int) (4294967295L & available)));
        if (!this.Camera2StreamConfigurationMap.getGetHighSpeedVideoFpsRanges() && heightOffset != this.Camera2StreamConfigurationMap.getGetHighSpeedVideoFpsRangesFor().getHeightOffset()) {
            return androidx.compose.ui.geometry.Offset.m5746copydBAh8RU$default(available, 0.0f, 0.0f, 2, null);
        }
        return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public final long mo1529onPostScrollDzOQY0M(long consumed, long available, int source) {
        if (!this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI().invoke().booleanValue()) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        }
        androidx.compose.material3.TopAppBarState getHighSpeedVideoFpsRangesFor = this.Camera2StreamConfigurationMap.getGetHighSpeedVideoFpsRangesFor();
        int i = (int) (consumed & 4294967295L);
        getHighSpeedVideoFpsRangesFor.setContentOffset(getHighSpeedVideoFpsRangesFor.getContentOffset() + java.lang.Float.intBitsToFloat(i));
        if (!this.Camera2StreamConfigurationMap.getGetHighSpeedVideoFpsRanges()) {
            androidx.compose.material3.TopAppBarState getHighSpeedVideoFpsRangesFor2 = this.Camera2StreamConfigurationMap.getGetHighSpeedVideoFpsRangesFor();
            getHighSpeedVideoFpsRangesFor2.setHeightOffset(getHighSpeedVideoFpsRangesFor2.getHeightOffset() + java.lang.Float.intBitsToFloat(i));
        }
        return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if (r14 != r7) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bd, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0085, code lost:
    
        if (r14 != r7) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo1528onPostFlingRZ2iAVY(long j, long j2, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
        androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1;
        int i;
        long getHighSpeedVideoSizes;
        if (continuation instanceof androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1) {
            enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 = (androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1) continuation;
            if ((enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (androidx.compose.ui.unit.Velocity.m8840getYimpl(j2) > 0.0f && (this.Camera2StreamConfigurationMap.getGetHighSpeedVideoFpsRangesFor().getHeightOffset() == 0.0f || this.Camera2StreamConfigurationMap.getGetHighSpeedVideoFpsRangesFor().getHeightOffset() == this.Camera2StreamConfigurationMap.getGetHighSpeedVideoFpsRangesFor().getHeightOffsetLimit())) {
                        this.Camera2StreamConfigurationMap.getGetHighSpeedVideoFpsRangesFor().setContentOffset(0.0f);
                    }
                    enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.Camera2StreamConfigurationMap = j2;
                    enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.getHighSpeedVideoFpsRanges = 1;
                    obj = super.mo1528onPostFlingRZ2iAVY(j, j2, enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        getHighSpeedVideoSizes = enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return androidx.compose.ui.unit.Velocity.m8830boximpl(androidx.compose.ui.unit.Velocity.m8843plusAH228Gc(getHighSpeedVideoSizes, ((androidx.compose.ui.unit.Velocity) obj).getGetHighSpeedVideoSizes()));
                    }
                    j2 = enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                getHighSpeedVideoSizes = ((androidx.compose.ui.unit.Velocity) obj).getGetHighSpeedVideoSizes();
                androidx.compose.material3.TopAppBarState getHighSpeedVideoFpsRangesFor = this.Camera2StreamConfigurationMap.getGetHighSpeedVideoFpsRangesFor();
                float m8840getYimpl = androidx.compose.ui.unit.Velocity.m8840getYimpl(j2);
                androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> flingAnimationSpec = this.Camera2StreamConfigurationMap.getFlingAnimationSpec();
                androidx.compose.animation.core.AnimationSpec<java.lang.Float> snapAnimationSpec = this.Camera2StreamConfigurationMap.getSnapAnimationSpec();
                enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.Camera2StreamConfigurationMap = getHighSpeedVideoSizes;
                enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.getHighSpeedVideoFpsRanges = 2;
                obj = androidx.compose.material3.AppBarKt.access$settleAppBar(getHighSpeedVideoFpsRangesFor, m8840getYimpl, flingAnimationSpec, snapAnimationSpec, enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1);
            }
        }
        enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 = new androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1(this, continuation);
        java.lang.Object obj2 = enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        getHighSpeedVideoSizes = ((androidx.compose.ui.unit.Velocity) obj2).getGetHighSpeedVideoSizes();
        androidx.compose.material3.TopAppBarState getHighSpeedVideoFpsRangesFor2 = this.Camera2StreamConfigurationMap.getGetHighSpeedVideoFpsRangesFor();
        float m8840getYimpl2 = androidx.compose.ui.unit.Velocity.m8840getYimpl(j2);
        androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> flingAnimationSpec2 = this.Camera2StreamConfigurationMap.getFlingAnimationSpec();
        androidx.compose.animation.core.AnimationSpec<java.lang.Float> snapAnimationSpec2 = this.Camera2StreamConfigurationMap.getSnapAnimationSpec();
        enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.Camera2StreamConfigurationMap = getHighSpeedVideoSizes;
        enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.getHighSpeedVideoFpsRanges = 2;
        obj2 = androidx.compose.material3.AppBarKt.access$settleAppBar(getHighSpeedVideoFpsRangesFor2, m8840getYimpl2, flingAnimationSpec2, snapAnimationSpec2, enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1);
    }
}
