package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u001aG\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\u0010\u001a\u00020\u000e*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u0018\u0010\u0018\u001a\u00020\u0017*\u00020\u00168CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u0018\u0010\u0013\u001a\u00020\u0017*\u00020\u00168CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0019"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/gestures/Scrollable2DState;", "state", "", "enabled", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "scrollable2D", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/Scrollable2DState;ZLandroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/gestures/ScrollingLogic2D;", "Landroidx/compose/ui/geometry/Offset;", "p0", "Camera2StreamConfigurationMap", "(Landroidx/compose/foundation/gestures/ScrollingLogic2D;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/Scroll2DScope;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/foundation/gestures/Scroll2DScope;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/unit/Velocity;", "", "getHighSpeedVideoSizes", "(J)F"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Scrollable2DKt {
    private static final androidx.compose.foundation.gestures.Scroll2DScope getHighSpeedVideoFpsRangesFor = new androidx.compose.foundation.gestures.Scroll2DScope() { // from class: androidx.compose.foundation.gestures.Scrollable2DKt$NoOpScrollScope$1
        @Override // androidx.compose.foundation.gestures.Scroll2DScope
        /* renamed from: scrollBy-MK-Hz9U */
        public final long mo1438scrollByMKHz9U(long delta) {
            return delta;
        }
    };

    public static /* synthetic */ androidx.compose.ui.Modifier scrollable2D$default(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.gestures.Scrollable2DState scrollable2DState, boolean z, androidx.compose.foundation.OverscrollEffect overscrollEffect, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return scrollable2D(modifier, scrollable2DState, z, (i & 4) != 0 ? null : overscrollEffect, (i & 8) != 0 ? null : flingBehavior, (i & 16) != 0 ? null : mutableInteractionSource);
    }

    public static final androidx.compose.ui.Modifier scrollable2D(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.gestures.Scrollable2DState scrollable2DState, boolean z, androidx.compose.foundation.OverscrollEffect overscrollEffect, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource) {
        return modifier.then(new androidx.compose.foundation.gestures.Scrollable2DElement(scrollable2DState, overscrollEffect, z, flingBehavior, mutableInteractionSource));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object Camera2StreamConfigurationMap(androidx.compose.foundation.gestures.ScrollingLogic2D scrollingLogic2D, long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.geometry.Offset> continuation) {
        androidx.compose.foundation.gestures.Scrollable2DKt$semanticsScrollBy$1 scrollable2DKt$semanticsScrollBy$1;
        int i;
        kotlin.jvm.internal.Ref.LongRef longRef;
        if (continuation instanceof androidx.compose.foundation.gestures.Scrollable2DKt$semanticsScrollBy$1) {
            scrollable2DKt$semanticsScrollBy$1 = (androidx.compose.foundation.gestures.Scrollable2DKt$semanticsScrollBy$1) continuation;
            if ((scrollable2DKt$semanticsScrollBy$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                scrollable2DKt$semanticsScrollBy$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = scrollable2DKt$semanticsScrollBy$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = scrollable2DKt$semanticsScrollBy$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.LongRef longRef2 = new kotlin.jvm.internal.Ref.LongRef();
                    longRef2.element = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
                    androidx.compose.foundation.MutatePriority mutatePriority = androidx.compose.foundation.MutatePriority.Default;
                    kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.NestedScrollScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> scrollable2DKt$semanticsScrollBy$2 = new androidx.compose.foundation.gestures.Scrollable2DKt$semanticsScrollBy$2(j, longRef2, null);
                    scrollable2DKt$semanticsScrollBy$1.getHighSpeedVideoFpsRanges = longRef2;
                    scrollable2DKt$semanticsScrollBy$1.getHighSpeedVideoSizes = 1;
                    if (scrollingLogic2D.getHighSpeedVideoFpsRangesFor(mutatePriority, scrollable2DKt$semanticsScrollBy$2, scrollable2DKt$semanticsScrollBy$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    longRef = longRef2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    longRef = (kotlin.jvm.internal.Ref.LongRef) scrollable2DKt$semanticsScrollBy$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return androidx.compose.ui.geometry.Offset.m5741boximpl(longRef.element);
            }
        }
        scrollable2DKt$semanticsScrollBy$1 = new androidx.compose.foundation.gestures.Scrollable2DKt$semanticsScrollBy$1(continuation);
        java.lang.Object obj2 = scrollable2DKt$semanticsScrollBy$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = scrollable2DKt$semanticsScrollBy$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        return androidx.compose.ui.geometry.Offset.m5741boximpl(longRef.element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getHighSpeedVideoSizes(long j) {
        return (float) java.lang.Math.sqrt(((float) java.lang.Math.pow(androidx.compose.ui.unit.Velocity.m8839getXimpl(j), 2.0d)) + ((float) java.lang.Math.pow(androidx.compose.ui.unit.Velocity.m8840getYimpl(j), 2.0d)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getHighSpeedVideoFpsRanges(long j) {
        return (float) java.lang.Math.atan2(androidx.compose.ui.unit.Velocity.m8840getYimpl(j), androidx.compose.ui.unit.Velocity.m8839getXimpl(j));
    }
}
