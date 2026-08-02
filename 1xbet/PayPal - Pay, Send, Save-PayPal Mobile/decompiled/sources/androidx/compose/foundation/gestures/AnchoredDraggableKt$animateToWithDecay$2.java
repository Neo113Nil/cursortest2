package androidx.compose.foundation.gestures;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0002H\n"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "anchors", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "latestTarget"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2", f = "AnchoredDraggable.kt", i = {}, l = {1394, 1412, 1436}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class AnchoredDraggableKt$animateToWithDecay$2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function4<androidx.compose.foundation.gestures.AnchoredDragScope, androidx.compose.foundation.gestures.DraggableAnchors<T>, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.animation.core.AnimationSpec<java.lang.Float> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.internal.Ref.FloatRef getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.gestures.AnchoredDraggableState<T> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ float getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d8, code lost:
    
        if (r2 != r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c3, code lost:
    
        if (androidx.compose.animation.core.SuspendAnimationKt.animateDecay$default(r22, r3, false, new androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2$$ExternalSyntheticLambda0(r2, r7, r9, r6), r29, 2, null) == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f3, code lost:
    
        if (r2 == r1) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        java.lang.Object highSpeedVideoSizes2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.foundation.gestures.AnchoredDragScope anchoredDragScope = (androidx.compose.foundation.gestures.AnchoredDragScope) this.getHighSpeedVideoSizesFor;
            androidx.compose.foundation.gestures.DraggableAnchors draggableAnchors = (androidx.compose.foundation.gestures.DraggableAnchors) this.getOutputMinFrameDuration;
            java.lang.Object obj2 = this.getInputFormats;
            final float positionOf = draggableAnchors.positionOf(obj2);
            if (!java.lang.Float.isNaN(positionOf)) {
                final kotlin.jvm.internal.Ref.FloatRef floatRef = new kotlin.jvm.internal.Ref.FloatRef();
                floatRef.element = java.lang.Float.isNaN(this.getHighSpeedVideoFpsRanges.getOffset()) ? 0.0f : this.getHighSpeedVideoFpsRanges.getOffset();
                if (floatRef.element != positionOf) {
                    if (this.getHighSpeedVideoSizes * (positionOf - floatRef.element) < 0.0f || this.getHighSpeedVideoSizes == 0.0f) {
                        this.getHighSpeedVideoSizesFor = null;
                        this.getOutputMinFrameDuration = null;
                        this.getInputSizeshNQ4ISI = 1;
                        highSpeedVideoSizes = androidx.compose.foundation.gestures.AnchoredDraggableKt.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, anchoredDragScope, draggableAnchors, obj2, this.Camera2StreamConfigurationMap, this);
                    } else {
                        float calculateTargetValue = androidx.compose.animation.core.DecayAnimationSpecKt.calculateTargetValue(this.getHighSpeedVideoFpsRangesFor, floatRef.element, this.getHighSpeedVideoSizes);
                        float f = this.getHighSpeedVideoSizes;
                        if (f <= 0.0f ? calculateTargetValue > positionOf : calculateTargetValue < positionOf) {
                            this.getHighSpeedVideoSizesFor = null;
                            this.getOutputMinFrameDuration = null;
                            this.getInputSizeshNQ4ISI = 3;
                            highSpeedVideoSizes2 = androidx.compose.foundation.gestures.AnchoredDraggableKt.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, f, anchoredDragScope, draggableAnchors, obj2, this.Camera2StreamConfigurationMap, this);
                        } else {
                            androidx.compose.animation.core.AnimationState AnimationState$default = androidx.compose.animation.core.AnimationStateKt.AnimationState$default(floatRef.element, this.getHighSpeedVideoSizes, 0L, 0L, false, 28, null);
                            androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> decayAnimationSpec = this.getHighSpeedVideoFpsRangesFor;
                            final kotlin.jvm.internal.Ref.FloatRef floatRef2 = this.getHighResolutionOutputSizeshNQ4ISI;
                            this.getHighSpeedVideoSizesFor = null;
                            this.getOutputMinFrameDuration = null;
                            this.getInputSizeshNQ4ISI = 2;
                        }
                    }
                    return coroutine_suspended;
                }
            }
        } else if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI.element = 0.0f;
        } else if (i == 2) {
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            if (i != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI.element = 0.0f;
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(float f, kotlin.jvm.internal.Ref.FloatRef floatRef, androidx.compose.foundation.gestures.AnchoredDragScope anchoredDragScope, kotlin.jvm.internal.Ref.FloatRef floatRef2, androidx.compose.animation.core.AnimationScope animationScope) {
        float highSpeedVideoFpsRangesFor;
        if ((((java.lang.Number) animationScope.getValue()).floatValue() < f && floatRef.element > f) || (((java.lang.Number) animationScope.getValue()).floatValue() > f && floatRef.element < f)) {
            highSpeedVideoFpsRangesFor = androidx.compose.foundation.gestures.AnchoredDraggableKt.getHighSpeedVideoFpsRangesFor(((java.lang.Number) animationScope.getValue()).floatValue(), f);
            anchoredDragScope.dragTo(highSpeedVideoFpsRangesFor, ((java.lang.Number) animationScope.getVelocity()).floatValue());
            floatRef2.element = java.lang.Float.isNaN(((java.lang.Number) animationScope.getVelocity()).floatValue()) ? 0.0f : ((java.lang.Number) animationScope.getVelocity()).floatValue();
            floatRef.element = highSpeedVideoFpsRangesFor;
            animationScope.cancelAnimation();
        } else {
            anchoredDragScope.dragTo(((java.lang.Number) animationScope.getValue()).floatValue(), ((java.lang.Number) animationScope.getVelocity()).floatValue());
            floatRef2.element = ((java.lang.Number) animationScope.getVelocity()).floatValue();
            floatRef.element = ((java.lang.Number) animationScope.getValue()).floatValue();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function4
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(androidx.compose.foundation.gestures.AnchoredDragScope anchoredDragScope, androidx.compose.foundation.gestures.DraggableAnchors<T> draggableAnchors, T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2 anchoredDraggableKt$animateToWithDecay$2 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
        anchoredDraggableKt$animateToWithDecay$2.getHighSpeedVideoSizesFor = anchoredDragScope;
        anchoredDraggableKt$animateToWithDecay$2.getOutputMinFrameDuration = draggableAnchors;
        anchoredDraggableKt$animateToWithDecay$2.getInputFormats = t;
        return anchoredDraggableKt$animateToWithDecay$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnchoredDraggableKt$animateToWithDecay$2(androidx.compose.foundation.gestures.AnchoredDraggableState<T> anchoredDraggableState, float f, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.jvm.internal.Ref.FloatRef floatRef, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> decayAnimationSpec, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2> continuation) {
        super(4, continuation);
        this.getHighSpeedVideoFpsRanges = anchoredDraggableState;
        this.getHighSpeedVideoSizes = f;
        this.Camera2StreamConfigurationMap = animationSpec;
        this.getHighResolutionOutputSizeshNQ4ISI = floatRef;
        this.getHighSpeedVideoFpsRangesFor = decayAnimationSpec;
    }
}
