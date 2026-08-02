package androidx.compose.foundation.gestures;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0002H\n"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "anchors", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "latestTarget"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2", f = "AnchoredDraggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class AnchoredDraggableKt$snapTo$2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function4<androidx.compose.foundation.gestures.AnchoredDragScope, androidx.compose.foundation.gestures.DraggableAnchors<T>, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.compose.foundation.gestures.AnchoredDragScope anchoredDragScope = (androidx.compose.foundation.gestures.AnchoredDragScope) this.getHighSpeedVideoSizes;
        float positionOf = ((androidx.compose.foundation.gestures.DraggableAnchors) this.getHighResolutionOutputSizeshNQ4ISI).positionOf(this.getHighSpeedVideoFpsRanges);
        if (!java.lang.Float.isNaN(positionOf)) {
            androidx.compose.foundation.gestures.AnchoredDragScope.dragTo$default(anchoredDragScope, positionOf, 0.0f, 2, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function4
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.foundation.gestures.AnchoredDragScope anchoredDragScope, java.lang.Object obj, java.lang.Object obj2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return getHighSpeedVideoFpsRanges(anchoredDragScope, (androidx.compose.foundation.gestures.DraggableAnchors) obj, obj2, continuation);
    }

    private static java.lang.Object getHighSpeedVideoFpsRanges(androidx.compose.foundation.gestures.AnchoredDragScope anchoredDragScope, androidx.compose.foundation.gestures.DraggableAnchors<T> draggableAnchors, T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2 anchoredDraggableKt$snapTo$2 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2(continuation);
        anchoredDraggableKt$snapTo$2.getHighSpeedVideoSizes = anchoredDragScope;
        anchoredDraggableKt$snapTo$2.getHighResolutionOutputSizeshNQ4ISI = draggableAnchors;
        anchoredDraggableKt$snapTo$2.getHighSpeedVideoFpsRanges = t;
        return anchoredDraggableKt$snapTo$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    AnchoredDraggableKt$snapTo$2(kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2> continuation) {
        super(4, continuation);
    }
}
