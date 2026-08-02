package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J0\u0010\b\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H¦@¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\b\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H¦@¢\u0006\u0004\b\b\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "Landroidx/compose/foundation/gestures/ScrollScope;", "", "initialVelocity", "Lkotlin/Function1;", "", "onRemainingDistanceUpdated", "performFling", "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface TargetedFlingBehavior extends androidx.compose.foundation.gestures.FlingBehavior {
    java.lang.Object performFling(androidx.compose.foundation.gestures.ScrollScope scrollScope, float f, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super java.lang.Float> continuation);

    static /* synthetic */ java.lang.Object performFling$suspendImpl(androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior, androidx.compose.foundation.gestures.ScrollScope scrollScope, float f, kotlin.coroutines.Continuation<? super java.lang.Float> continuation) {
        kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1;
        function1 = androidx.compose.foundation.gestures.TargetedFlingBehaviorKt.getHighSpeedVideoFpsRanges;
        return targetedFlingBehavior.performFling(scrollScope, f, function1, continuation);
    }

    @Override // androidx.compose.foundation.gestures.FlingBehavior
    default java.lang.Object performFling(androidx.compose.foundation.gestures.ScrollScope scrollScope, float f, kotlin.coroutines.Continuation<? super java.lang.Float> continuation) {
        return performFling$suspendImpl(this, scrollScope, f, continuation);
    }
}
