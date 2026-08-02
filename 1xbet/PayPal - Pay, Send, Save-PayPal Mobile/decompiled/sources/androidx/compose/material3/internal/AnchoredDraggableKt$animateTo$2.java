package androidx.compose.material3.internal;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0002H\n"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/material3/internal/AnchoredDragScope;", "anchors", "Landroidx/compose/material3/internal/DraggableAnchors;", "latestTarget"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", i = {}, l = {682}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class AnchoredDraggableKt$animateTo$2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function4<androidx.compose.material3.internal.AnchoredDragScope, androidx.compose.material3.internal.DraggableAnchors<T>, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ float Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.material3.internal.AnchoredDraggableState<T> getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputFormats;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.material3.internal.AnchoredDragScope anchoredDragScope = (androidx.compose.material3.internal.AnchoredDragScope) this.getInputFormats;
            float positionOf = ((androidx.compose.material3.internal.DraggableAnchors) this.getHighSpeedVideoFpsRangesFor).positionOf(this.getHighResolutionOutputSizeshNQ4ISI);
            if (!java.lang.Float.isNaN(positionOf)) {
                final kotlin.jvm.internal.Ref.FloatRef floatRef = new kotlin.jvm.internal.Ref.FloatRef();
                floatRef.element = java.lang.Float.isNaN(this.getHighSpeedVideoSizes.getOffset()) ? 0.0f : this.getHighSpeedVideoSizes.getOffset();
                this.getInputFormats = null;
                this.getHighSpeedVideoFpsRangesFor = null;
                this.getHighSpeedVideoFpsRanges = 1;
                if (androidx.compose.animation.core.SuspendAnimationKt.animate(floatRef.element, positionOf, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes.getAnimationSpec().invoke(), new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.internal.AnchoredDraggableKt$animateTo$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return androidx.compose.material3.internal.AnchoredDraggableKt$animateTo$2.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.material3.internal.AnchoredDragScope.this, floatRef, ((java.lang.Float) obj2).floatValue(), ((java.lang.Float) obj3).floatValue());
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.material3.internal.AnchoredDragScope anchoredDragScope, kotlin.jvm.internal.Ref.FloatRef floatRef, float f, float f2) {
        anchoredDragScope.dragTo(f, f2);
        floatRef.element = f;
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function4
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.material3.internal.AnchoredDragScope anchoredDragScope, java.lang.Object obj, java.lang.Object obj2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.material3.internal.AnchoredDraggableKt$animateTo$2 anchoredDraggableKt$animateTo$2 = new androidx.compose.material3.internal.AnchoredDraggableKt$animateTo$2(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
        anchoredDraggableKt$animateTo$2.getInputFormats = anchoredDragScope;
        anchoredDraggableKt$animateTo$2.getHighSpeedVideoFpsRangesFor = (androidx.compose.material3.internal.DraggableAnchors) obj;
        anchoredDraggableKt$animateTo$2.getHighResolutionOutputSizeshNQ4ISI = obj2;
        return anchoredDraggableKt$animateTo$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnchoredDraggableKt$animateTo$2(androidx.compose.material3.internal.AnchoredDraggableState<T> anchoredDraggableState, float f, kotlin.coroutines.Continuation<? super androidx.compose.material3.internal.AnchoredDraggableKt$animateTo$2> continuation) {
        super(4, continuation);
        this.getHighSpeedVideoSizes = anchoredDraggableState;
        this.Camera2StreamConfigurationMap = f;
    }
}
