package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a2\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0080@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pointerEventPass", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "", "onMove", "detectMoves", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PointerMoveDetectorKt {
    public static /* synthetic */ java.lang.Object detectMoves$default(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            pointerEventPass = androidx.compose.ui.input.pointer.PointerEventPass.Initial;
        }
        return detectMoves(pointerInputScope, pointerEventPass, function1, continuation);
    }

    public static final java.lang.Object detectMoves(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2(pointerInputScope, pointerEventPass, function1, null), continuation);
        return coroutineScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : kotlin.Unit.INSTANCE;
    }
}
