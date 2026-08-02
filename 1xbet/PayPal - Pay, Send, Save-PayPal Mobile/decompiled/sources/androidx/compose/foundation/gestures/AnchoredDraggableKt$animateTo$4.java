package androidx.compose.foundation.gestures;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0002H\n"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "anchors", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "latestTarget"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$4", f = "AnchoredDraggable.kt", i = {}, l = {1347}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class AnchoredDraggableKt$animateTo$4<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function4<androidx.compose.foundation.gestures.AnchoredDragScope, androidx.compose.foundation.gestures.DraggableAnchors<T>, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.animation.core.AnimationSpec<java.lang.Float> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.foundation.gestures.AnchoredDraggableState<T> getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.compose.foundation.gestures.AnchoredDragScope anchoredDragScope = (androidx.compose.foundation.gestures.AnchoredDragScope) this.getOutputMinFrameDuration;
            androidx.compose.foundation.gestures.DraggableAnchors draggableAnchors = (androidx.compose.foundation.gestures.DraggableAnchors) this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object obj2 = this.Camera2StreamConfigurationMap;
            androidx.compose.foundation.gestures.AnchoredDraggableState<T> anchoredDraggableState = this.getHighSpeedVideoSizes;
            this.getOutputMinFrameDuration = null;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.getHighSpeedVideoFpsRanges = 1;
            highSpeedVideoSizes = androidx.compose.foundation.gestures.AnchoredDraggableKt.getHighSpeedVideoSizes(anchoredDraggableState, anchoredDraggableState.getLastVelocity(), anchoredDragScope, draggableAnchors, obj2, this.getHighSpeedVideoFpsRangesFor, this);
            if (highSpeedVideoSizes == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function4
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(androidx.compose.foundation.gestures.AnchoredDragScope anchoredDragScope, androidx.compose.foundation.gestures.DraggableAnchors<T> draggableAnchors, T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$4 anchoredDraggableKt$animateTo$4 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$4(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
        anchoredDraggableKt$animateTo$4.getOutputMinFrameDuration = anchoredDragScope;
        anchoredDraggableKt$animateTo$4.getHighResolutionOutputSizeshNQ4ISI = draggableAnchors;
        anchoredDraggableKt$animateTo$4.Camera2StreamConfigurationMap = t;
        return anchoredDraggableKt$animateTo$4.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnchoredDraggableKt$animateTo$4(androidx.compose.foundation.gestures.AnchoredDraggableState<T> anchoredDraggableState, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$4> continuation) {
        super(4, continuation);
        this.getHighSpeedVideoSizes = anchoredDraggableState;
        this.getHighSpeedVideoFpsRangesFor = animationSpec;
    }
}
