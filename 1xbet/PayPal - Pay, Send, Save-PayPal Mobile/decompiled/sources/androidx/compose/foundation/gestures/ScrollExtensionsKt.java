package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a,\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a,\u0010\u0005\u001a\u00020\b*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\b2\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u0086@¢\u0006\u0004\b\t\u0010\n\u001a\u001c\u0010\u000b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\u000b\u001a\u00020\b*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\bH\u0086@¢\u0006\u0004\b\r\u0010\u000e\u001a\u001e\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001e\u0010\u0012\u001a\u00020\u0011*\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0014"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableState;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "animateScrollBy", "(Landroidx/compose/foundation/gestures/ScrollableState;FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/Scrollable2DState;", "Landroidx/compose/ui/geometry/Offset;", "animateScrollBy-ubNVwUQ", "(Landroidx/compose/foundation/gestures/Scrollable2DState;JLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollBy", "(Landroidx/compose/foundation/gestures/ScrollableState;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollBy-d-4ec7I", "(Landroidx/compose/foundation/gestures/Scrollable2DState;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "", "stopScroll", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/MutatePriority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Landroidx/compose/foundation/gestures/Scrollable2DState;Landroidx/compose/foundation/MutatePriority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScrollExtensionsKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object animateScrollBy(androidx.compose.foundation.gestures.ScrollableState scrollableState, float f, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.coroutines.Continuation<? super java.lang.Float> continuation) {
        androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1 scrollExtensionsKt$animateScrollBy$1;
        int i;
        kotlin.jvm.internal.Ref.FloatRef floatRef;
        if (continuation instanceof androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1) {
            scrollExtensionsKt$animateScrollBy$1 = (androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1) continuation;
            if ((scrollExtensionsKt$animateScrollBy$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                scrollExtensionsKt$animateScrollBy$1.getHighSpeedVideoFpsRanges -= 2147483648;
                androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1 scrollExtensionsKt$animateScrollBy$12 = scrollExtensionsKt$animateScrollBy$1;
                java.lang.Object obj = scrollExtensionsKt$animateScrollBy$12.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = scrollExtensionsKt$animateScrollBy$12.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.FloatRef floatRef2 = new kotlin.jvm.internal.Ref.FloatRef();
                    androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2 scrollExtensionsKt$animateScrollBy$2 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2(f, animationSpec, floatRef2, null);
                    scrollExtensionsKt$animateScrollBy$12.getHighSpeedVideoSizes = floatRef2;
                    scrollExtensionsKt$animateScrollBy$12.getHighSpeedVideoFpsRanges = 1;
                    if (androidx.compose.foundation.gestures.ScrollableState.scroll$default(scrollableState, null, scrollExtensionsKt$animateScrollBy$2, scrollExtensionsKt$animateScrollBy$12, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    floatRef = floatRef2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    floatRef = (kotlin.jvm.internal.Ref.FloatRef) scrollExtensionsKt$animateScrollBy$12.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxFloat(floatRef.element);
            }
        }
        scrollExtensionsKt$animateScrollBy$1 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1(continuation);
        androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1 scrollExtensionsKt$animateScrollBy$122 = scrollExtensionsKt$animateScrollBy$1;
        java.lang.Object obj2 = scrollExtensionsKt$animateScrollBy$122.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = scrollExtensionsKt$animateScrollBy$122.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxFloat(floatRef.element);
    }

    public static /* synthetic */ java.lang.Object animateScrollBy$default(androidx.compose.foundation.gestures.ScrollableState scrollableState, float f, androidx.compose.animation.core.AnimationSpec animationSpec, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            animationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animateScrollBy(scrollableState, f, animationSpec, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: animateScrollBy-ubNVwUQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m1518animateScrollByubNVwUQ(androidx.compose.foundation.gestures.Scrollable2DState scrollable2DState, long j, androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.geometry.Offset> animationSpec, kotlin.coroutines.Continuation<? super androidx.compose.ui.geometry.Offset> continuation) {
        androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$3 scrollExtensionsKt$animateScrollBy$3;
        int i;
        kotlin.jvm.internal.Ref.LongRef longRef;
        if (continuation instanceof androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$3) {
            scrollExtensionsKt$animateScrollBy$3 = (androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$3) continuation;
            if ((scrollExtensionsKt$animateScrollBy$3.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                scrollExtensionsKt$animateScrollBy$3.getHighSpeedVideoFpsRanges -= 2147483648;
                androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$3 scrollExtensionsKt$animateScrollBy$32 = scrollExtensionsKt$animateScrollBy$3;
                java.lang.Object obj = scrollExtensionsKt$animateScrollBy$32.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = scrollExtensionsKt$animateScrollBy$32.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.LongRef longRef2 = new kotlin.jvm.internal.Ref.LongRef();
                    longRef2.element = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
                    androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$4 scrollExtensionsKt$animateScrollBy$4 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$4(j, animationSpec, longRef2, null);
                    scrollExtensionsKt$animateScrollBy$32.Camera2StreamConfigurationMap = longRef2;
                    scrollExtensionsKt$animateScrollBy$32.getHighSpeedVideoFpsRanges = 1;
                    if (androidx.compose.foundation.gestures.Scrollable2DState.scroll$default(scrollable2DState, null, scrollExtensionsKt$animateScrollBy$4, scrollExtensionsKt$animateScrollBy$32, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    longRef = longRef2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    longRef = (kotlin.jvm.internal.Ref.LongRef) scrollExtensionsKt$animateScrollBy$32.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return androidx.compose.ui.geometry.Offset.m5741boximpl(longRef.element);
            }
        }
        scrollExtensionsKt$animateScrollBy$3 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$3(continuation);
        androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$3 scrollExtensionsKt$animateScrollBy$322 = scrollExtensionsKt$animateScrollBy$3;
        java.lang.Object obj2 = scrollExtensionsKt$animateScrollBy$322.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = scrollExtensionsKt$animateScrollBy$322.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        return androidx.compose.ui.geometry.Offset.m5741boximpl(longRef.element);
    }

    /* renamed from: animateScrollBy-ubNVwUQ$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m1519animateScrollByubNVwUQ$default(androidx.compose.foundation.gestures.Scrollable2DState scrollable2DState, long j, androidx.compose.animation.core.AnimationSpec animationSpec, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            animationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return m1518animateScrollByubNVwUQ(scrollable2DState, j, animationSpec, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object scrollBy(androidx.compose.foundation.gestures.ScrollableState scrollableState, float f, kotlin.coroutines.Continuation<? super java.lang.Float> continuation) {
        androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1 scrollExtensionsKt$scrollBy$1;
        int i;
        kotlin.jvm.internal.Ref.FloatRef floatRef;
        if (continuation instanceof androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1) {
            scrollExtensionsKt$scrollBy$1 = (androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1) continuation;
            if ((scrollExtensionsKt$scrollBy$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                scrollExtensionsKt$scrollBy$1.Camera2StreamConfigurationMap -= 2147483648;
                androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1 scrollExtensionsKt$scrollBy$12 = scrollExtensionsKt$scrollBy$1;
                java.lang.Object obj = scrollExtensionsKt$scrollBy$12.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = scrollExtensionsKt$scrollBy$12.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.FloatRef floatRef2 = new kotlin.jvm.internal.Ref.FloatRef();
                    androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2 scrollExtensionsKt$scrollBy$2 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2(floatRef2, f, null);
                    scrollExtensionsKt$scrollBy$12.getHighSpeedVideoSizes = floatRef2;
                    scrollExtensionsKt$scrollBy$12.Camera2StreamConfigurationMap = 1;
                    if (androidx.compose.foundation.gestures.ScrollableState.scroll$default(scrollableState, null, scrollExtensionsKt$scrollBy$2, scrollExtensionsKt$scrollBy$12, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    floatRef = floatRef2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    floatRef = (kotlin.jvm.internal.Ref.FloatRef) scrollExtensionsKt$scrollBy$12.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxFloat(floatRef.element);
            }
        }
        scrollExtensionsKt$scrollBy$1 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1(continuation);
        androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1 scrollExtensionsKt$scrollBy$122 = scrollExtensionsKt$scrollBy$1;
        java.lang.Object obj2 = scrollExtensionsKt$scrollBy$122.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = scrollExtensionsKt$scrollBy$122.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxFloat(floatRef.element);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: scrollBy-d-4ec7I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m1520scrollByd4ec7I(androidx.compose.foundation.gestures.Scrollable2DState scrollable2DState, long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.geometry.Offset> continuation) {
        androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$3 scrollExtensionsKt$scrollBy$3;
        int i;
        kotlin.jvm.internal.Ref.LongRef longRef;
        if (continuation instanceof androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$3) {
            scrollExtensionsKt$scrollBy$3 = (androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$3) continuation;
            if ((scrollExtensionsKt$scrollBy$3.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                scrollExtensionsKt$scrollBy$3.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$3 scrollExtensionsKt$scrollBy$32 = scrollExtensionsKt$scrollBy$3;
                java.lang.Object obj = scrollExtensionsKt$scrollBy$32.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = scrollExtensionsKt$scrollBy$32.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.LongRef longRef2 = new kotlin.jvm.internal.Ref.LongRef();
                    longRef2.element = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
                    androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$4 scrollExtensionsKt$scrollBy$4 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$4(longRef2, j, null);
                    scrollExtensionsKt$scrollBy$32.getHighSpeedVideoSizes = longRef2;
                    scrollExtensionsKt$scrollBy$32.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (androidx.compose.foundation.gestures.Scrollable2DState.scroll$default(scrollable2DState, null, scrollExtensionsKt$scrollBy$4, scrollExtensionsKt$scrollBy$32, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    longRef = longRef2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    longRef = (kotlin.jvm.internal.Ref.LongRef) scrollExtensionsKt$scrollBy$32.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return androidx.compose.ui.geometry.Offset.m5741boximpl(longRef.element);
            }
        }
        scrollExtensionsKt$scrollBy$3 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$3(continuation);
        androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$3 scrollExtensionsKt$scrollBy$322 = scrollExtensionsKt$scrollBy$3;
        java.lang.Object obj2 = scrollExtensionsKt$scrollBy$322.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = scrollExtensionsKt$scrollBy$322.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        return androidx.compose.ui.geometry.Offset.m5741boximpl(longRef.element);
    }

    public static /* synthetic */ java.lang.Object stopScroll$default(androidx.compose.foundation.gestures.ScrollableState scrollableState, androidx.compose.foundation.MutatePriority mutatePriority, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = androidx.compose.foundation.MutatePriority.Default;
        }
        return stopScroll(scrollableState, mutatePriority, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    public static final java.lang.Object stopScroll(androidx.compose.foundation.gestures.ScrollableState scrollableState, androidx.compose.foundation.MutatePriority mutatePriority, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object scroll = scrollableState.scroll(mutatePriority, new androidx.compose.foundation.gestures.ScrollExtensionsKt$stopScroll$2(null), continuation);
        return scroll == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scroll : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object stopScroll$default(androidx.compose.foundation.gestures.Scrollable2DState scrollable2DState, androidx.compose.foundation.MutatePriority mutatePriority, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = androidx.compose.foundation.MutatePriority.Default;
        }
        return stopScroll(scrollable2DState, mutatePriority, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    public static final java.lang.Object stopScroll(androidx.compose.foundation.gestures.Scrollable2DState scrollable2DState, androidx.compose.foundation.MutatePriority mutatePriority, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object scroll = scrollable2DState.scroll(mutatePriority, new androidx.compose.foundation.gestures.ScrollExtensionsKt$stopScroll$4(null), continuation);
        return scroll == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scroll : kotlin.Unit.INSTANCE;
    }
}
