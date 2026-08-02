package androidx.compose.foundation.contextmenu;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¢\u0006\u0004\b\u0003\u0010\t"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/contextmenu/ContextMenuState;", "state", "contextMenuGestures", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/contextmenu/ContextMenuState;)Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "", "onOpenGesture", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ContextMenuGesturesKt {
    public static final androidx.compose.ui.Modifier contextMenuGestures(androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.contextmenu.ContextMenuState contextMenuState) {
        return contextMenuGestures(modifier, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit>) new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.contextmenu.ContextMenuGesturesKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.contextmenu.ContextMenuGesturesKt.$r8$lambda$e9eh_qZl5W20p_GnnSdOn8J5AEU(androidx.compose.foundation.contextmenu.ContextMenuState.this, (androidx.compose.ui.geometry.Offset) obj);
            }
        });
    }

    public static final androidx.compose.ui.Modifier contextMenuGestures(androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function1) {
        return androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(modifier, androidx.compose.foundation.contextmenu.ContextMenuKey.INSTANCE, new androidx.compose.ui.input.pointer.PointerInputEventHandler() { // from class: androidx.compose.foundation.contextmenu.ContextMenuGesturesKt$contextMenuGestures$2
            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                java.lang.Object onRightClickDown = androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt.onRightClickDown(pointerInputScope, function1, continuation);
                return onRightClickDown == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? onRightClickDown : kotlin.Unit.INSTANCE;
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$e9eh_qZl5W20p_GnnSdOn8J5AEU(androidx.compose.foundation.contextmenu.ContextMenuState contextMenuState, androidx.compose.ui.geometry.Offset offset) {
        contextMenuState.setStatus(new androidx.compose.foundation.contextmenu.ContextMenuState.Status.Open(offset.m5762unboximpl(), null));
        return kotlin.Unit.INSTANCE;
    }
}
