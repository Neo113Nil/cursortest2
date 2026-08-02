package androidx.constraintlayout.compose.carousel;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/constraintlayout/compose/carousel/CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/unit/Velocity;", "consumed", com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostFling", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreFling", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1 implements androidx.compose.ui.input.nestedscroll.NestedScrollConnection {
    final /* synthetic */ androidx.constraintlayout.compose.carousel.CarouselSwipeableState<T> Camera2StreamConfigurationMap;

    CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1(androidx.constraintlayout.compose.carousel.CarouselSwipeableState<T> carouselSwipeableState) {
        this.Camera2StreamConfigurationMap = carouselSwipeableState;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public final long mo1529onPostScrollDzOQY0M(long consumed, long available, int source) {
        if (!androidx.compose.ui.input.nestedscroll.NestedScrollSource.m7114equalsimpl0(source, androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m7126getUserInputWNlRxjI())) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        }
        return androidx.compose.ui.geometry.OffsetKt.Offset(0.0f, this.Camera2StreamConfigurationMap.performDrag(androidx.compose.ui.geometry.Offset.m5753getYimpl(available)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo1753onPreFlingQWom1Mo(long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
        androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1;
        int i;
        if (continuation instanceof androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1) {
            carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 = (androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1) continuation;
            if ((carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    float m5753getYimpl = androidx.compose.ui.geometry.Offset.m5753getYimpl(androidx.compose.ui.geometry.OffsetKt.Offset(androidx.compose.ui.unit.Velocity.m8839getXimpl(j), androidx.compose.ui.unit.Velocity.m8840getYimpl(j)));
                    if (m5753getYimpl < 0.0f && this.Camera2StreamConfigurationMap.getOffset().getFloatValue() > this.Camera2StreamConfigurationMap.getMinBound()) {
                        androidx.constraintlayout.compose.carousel.CarouselSwipeableState<T> carouselSwipeableState = this.Camera2StreamConfigurationMap;
                        carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.getHighSpeedVideoSizes = j;
                        carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.getHighSpeedVideoFpsRangesFor = 1;
                        if (carouselSwipeableState.performFling(m5753getYimpl, carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        j = androidx.compose.ui.unit.Velocity.INSTANCE.m8850getZero9UxMQ8M();
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return androidx.compose.ui.unit.Velocity.m8830boximpl(j);
            }
        }
        carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 = new androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1(this, continuation);
        java.lang.Object obj2 = carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.getHighSpeedVideoFpsRangesFor;
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
        androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1;
        int i;
        if (continuation instanceof androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1) {
            carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 = (androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1) continuation;
            if ((carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.constraintlayout.compose.carousel.CarouselSwipeableState<T> carouselSwipeableState = this.Camera2StreamConfigurationMap;
                    float m5753getYimpl = androidx.compose.ui.geometry.Offset.m5753getYimpl(androidx.compose.ui.geometry.OffsetKt.Offset(androidx.compose.ui.unit.Velocity.m8839getXimpl(j2), androidx.compose.ui.unit.Velocity.m8840getYimpl(j2)));
                    carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.getHighSpeedVideoSizes = j2;
                    carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.Camera2StreamConfigurationMap = 1;
                    if (carouselSwipeableState.performFling(m5753getYimpl, carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j2 = carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return androidx.compose.ui.unit.Velocity.m8830boximpl(j2);
            }
        }
        carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 = new androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1(this, continuation);
        java.lang.Object obj2 = carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        return androidx.compose.ui.unit.Velocity.m8830boximpl(j2);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public final long mo1754onPreScrollOzD1aCk(long available, int source) {
        float m5753getYimpl = androidx.compose.ui.geometry.Offset.m5753getYimpl(available);
        if (m5753getYimpl >= 0.0f || !androidx.compose.ui.input.nestedscroll.NestedScrollSource.m7114equalsimpl0(source, androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m7126getUserInputWNlRxjI())) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        }
        return androidx.compose.ui.geometry.OffsetKt.Offset(0.0f, this.Camera2StreamConfigurationMap.performDrag(m5753getYimpl));
    }
}
