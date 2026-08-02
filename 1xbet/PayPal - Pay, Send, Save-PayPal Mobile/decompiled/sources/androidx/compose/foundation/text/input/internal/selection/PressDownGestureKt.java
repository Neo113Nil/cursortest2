package androidx.compose.foundation.text.input.internal.selection;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a.\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0080@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/foundation/text/input/internal/selection/TapOnPosition;", "onDown", "Lkotlin/Function0;", "", "onUp", "detectPressDownGesture", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/text/input/internal/selection/TapOnPosition;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PressDownGestureKt {
    public static /* synthetic */ java.lang.Object detectPressDownGesture$default(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, androidx.compose.foundation.text.input.internal.selection.TapOnPosition tapOnPosition, kotlin.jvm.functions.Function0 function0, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        return detectPressDownGesture(pointerInputScope, tapOnPosition, function0, continuation);
    }

    public static final java.lang.Object detectPressDownGesture(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, androidx.compose.foundation.text.input.internal.selection.TapOnPosition tapOnPosition, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object awaitEachGesture = androidx.compose.foundation.gestures.ForEachGestureKt.awaitEachGesture(pointerInputScope, new androidx.compose.foundation.text.input.internal.selection.PressDownGestureKt$detectPressDownGesture$2(tapOnPosition, function0, null), continuation);
        return awaitEachGesture == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : kotlin.Unit.INSTANCE;
    }
}
