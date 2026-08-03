package androidx.compose.foundation.gestures;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: AnchoredDraggable.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "anchors", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "latestTarget"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2", f = "AnchoredDraggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class AnchoredDraggableKt$snapTo$2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function4<androidx.compose.foundation.gestures.AnchoredDragScope, androidx.compose.foundation.gestures.DraggableAnchors<T>, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    /* synthetic */ java.lang.Object L$1;
    /* synthetic */ java.lang.Object L$2;
    int label;

    AnchoredDraggableKt$snapTo$2(kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2> continuation) {
        super(4, continuation);
    }

    public final java.lang.Object invoke(androidx.compose.foundation.gestures.AnchoredDragScope anchoredDragScope, androidx.compose.foundation.gestures.DraggableAnchors<T> draggableAnchors, T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2 anchoredDraggableKt$snapTo$2 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2(continuation);
        anchoredDraggableKt$snapTo$2.L$0 = anchoredDragScope;
        anchoredDraggableKt$snapTo$2.L$1 = draggableAnchors;
        anchoredDraggableKt$snapTo$2.L$2 = t;
        return anchoredDraggableKt$snapTo$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ java.lang.Object invoke(androidx.compose.foundation.gestures.AnchoredDragScope anchoredDragScope, java.lang.Object obj, java.lang.Object obj2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return invoke(anchoredDragScope, (androidx.compose.foundation.gestures.DraggableAnchors<androidx.compose.foundation.gestures.DraggableAnchors<T>>) obj, (androidx.compose.foundation.gestures.DraggableAnchors<T>) obj2, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.compose.foundation.gestures.AnchoredDragScope anchoredDragScope = (androidx.compose.foundation.gestures.AnchoredDragScope) this.L$0;
        float positionOf = ((androidx.compose.foundation.gestures.DraggableAnchors) this.L$1).positionOf(this.L$2);
        if (!java.lang.Float.isNaN(positionOf)) {
            androidx.compose.foundation.gestures.AnchoredDragScope.CC.dragTo$default(anchoredDragScope, positionOf, 0.0f, 2, null);
        }
        return kotlin.Unit.INSTANCE;
    }
}
