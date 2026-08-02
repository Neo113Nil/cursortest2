package androidx.compose.material3.internal;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0002H\n"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/material3/internal/AnchoredDragScope;", "anchors", "Landroidx/compose/material3/internal/DraggableAnchors;", "latestTarget"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableKt$snapTo$2", f = "AnchoredDraggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class AnchoredDraggableKt$snapTo$2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function4<androidx.compose.material3.internal.AnchoredDragScope, androidx.compose.material3.internal.DraggableAnchors<T>, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.compose.material3.internal.AnchoredDragScope anchoredDragScope = (androidx.compose.material3.internal.AnchoredDragScope) this.getHighResolutionOutputSizeshNQ4ISI;
        float positionOf = ((androidx.compose.material3.internal.DraggableAnchors) this.Camera2StreamConfigurationMap).positionOf(this.getHighSpeedVideoSizes);
        if (!java.lang.Float.isNaN(positionOf)) {
            androidx.compose.material3.internal.AnchoredDragScope.dragTo$default(anchoredDragScope, positionOf, 0.0f, 2, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function4
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.material3.internal.AnchoredDragScope anchoredDragScope, java.lang.Object obj, java.lang.Object obj2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.material3.internal.AnchoredDraggableKt$snapTo$2 anchoredDraggableKt$snapTo$2 = new androidx.compose.material3.internal.AnchoredDraggableKt$snapTo$2(continuation);
        anchoredDraggableKt$snapTo$2.getHighResolutionOutputSizeshNQ4ISI = anchoredDragScope;
        anchoredDraggableKt$snapTo$2.Camera2StreamConfigurationMap = (androidx.compose.material3.internal.DraggableAnchors) obj;
        anchoredDraggableKt$snapTo$2.getHighSpeedVideoSizes = obj2;
        return anchoredDraggableKt$snapTo$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    AnchoredDraggableKt$snapTo$2(kotlin.coroutines.Continuation<? super androidx.compose.material3.internal.AnchoredDraggableKt$snapTo$2> continuation) {
        super(4, continuation);
    }
}
