package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/DragScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SwipeableState$animateInternalToOffset$2", f = "Swipeable.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class SwipeableState$animateInternalToOffset$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.foundation.gestures.DragScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.animation.core.AnimationSpec<java.lang.Float> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ float getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.material.SwipeableState<T> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.runtime.MutableState mutableState;
        androidx.compose.runtime.MutableFloatState mutableFloatState;
        androidx.compose.runtime.MutableState mutableState2;
        java.lang.Object animateTo$default;
        androidx.compose.runtime.MutableState mutableState3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                final androidx.compose.foundation.gestures.DragScope dragScope = (androidx.compose.foundation.gestures.DragScope) this.getHighSpeedVideoFpsRangesFor;
                final kotlin.jvm.internal.Ref.FloatRef floatRef = new kotlin.jvm.internal.Ref.FloatRef();
                mutableFloatState = ((androidx.compose.material.SwipeableState) this.getHighSpeedVideoSizes).getHighSpeedVideoFpsRanges;
                floatRef.element = mutableFloatState.getFloatValue();
                mutableState2 = ((androidx.compose.material.SwipeableState) this.getHighSpeedVideoSizes).getHighSpeedVideoFpsRangesFor;
                mutableState2.setValue(kotlin.coroutines.jvm.internal.Boxing.boxFloat(this.getHighSpeedVideoFpsRanges));
                this.getHighSpeedVideoSizes.setAnimationRunning(true);
                this.Camera2StreamConfigurationMap = 1;
                animateTo$default = androidx.compose.animation.core.Animatable.animateTo$default(androidx.compose.animation.core.AnimatableKt.Animatable$default(floatRef.element, 0.0f, 2, null), kotlin.coroutines.jvm.internal.Boxing.boxFloat(this.getHighSpeedVideoFpsRanges), this.getHighResolutionOutputSizeshNQ4ISI, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.SwipeableState$animateInternalToOffset$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        kotlin.Unit highSpeedVideoSizes;
                        highSpeedVideoSizes = androidx.compose.material.SwipeableState$animateInternalToOffset$2.getHighSpeedVideoSizes(androidx.compose.foundation.gestures.DragScope.this, floatRef, (androidx.compose.animation.core.Animatable) obj2);
                        return highSpeedVideoSizes;
                    }
                }, this, 4, null);
                if (animateTo$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                animateTo$default = obj;
            }
            mutableState3 = ((androidx.compose.material.SwipeableState) this.getHighSpeedVideoSizes).getHighSpeedVideoFpsRangesFor;
            mutableState3.setValue(null);
            this.getHighSpeedVideoSizes.setAnimationRunning(false);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            mutableState = ((androidx.compose.material.SwipeableState) this.getHighSpeedVideoSizes).getHighSpeedVideoFpsRangesFor;
            mutableState.setValue(null);
            this.getHighSpeedVideoSizes.setAnimationRunning(false);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.foundation.gestures.DragScope dragScope, kotlin.jvm.internal.Ref.FloatRef floatRef, androidx.compose.animation.core.Animatable animatable) {
        dragScope.dragBy(((java.lang.Number) animatable.getValue()).floatValue() - floatRef.element);
        floatRef.element = ((java.lang.Number) animatable.getValue()).floatValue();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(androidx.compose.foundation.gestures.DragScope dragScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.material.SwipeableState$animateInternalToOffset$2) create(dragScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.material.SwipeableState$animateInternalToOffset$2 swipeableState$animateInternalToOffset$2 = new androidx.compose.material.SwipeableState$animateInternalToOffset$2(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        swipeableState$animateInternalToOffset$2.getHighSpeedVideoFpsRangesFor = obj;
        return swipeableState$animateInternalToOffset$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeableState$animateInternalToOffset$2(androidx.compose.material.SwipeableState<T> swipeableState, float f, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.coroutines.Continuation<? super androidx.compose.material.SwipeableState$animateInternalToOffset$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = swipeableState;
        this.getHighSpeedVideoFpsRanges = f;
        this.getHighResolutionOutputSizeshNQ4ISI = animationSpec;
    }
}
