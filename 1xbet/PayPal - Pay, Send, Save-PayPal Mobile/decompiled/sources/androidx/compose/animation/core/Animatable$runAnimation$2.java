package androidx.compose.animation.core;

/* JADX INFO: Add missing generic type declarations: [T, V] */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationResult;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", i = {0, 0}, l = {308}, m = "invokeSuspend", n = {"endState", "clampingNeeded"}, s = {"L$0", "L$1"}, v = 1)
/* loaded from: classes.dex */
final class Animatable$runAnimation$2<T, V> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super androidx.compose.animation.core.AnimationResult<T, V>>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ T getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ long getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.animation.core.Animation<T, V> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.compose.animation.core.Animatable<T, V>, kotlin.Unit> getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    final /* synthetic */ androidx.compose.animation.core.Animatable<T, V> getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        final androidx.compose.animation.core.AnimationState copy$default;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getOutputFormats.getInternalState$animation_core().setVelocityVector$animation_core((androidx.compose.animation.core.AnimationVector) this.getOutputFormats.getTypeConverter().getConvertToVector().invoke(this.getHighResolutionOutputSizeshNQ4ISI));
                this.getOutputFormats.setTargetValue(this.getHighSpeedVideoFpsRangesFor.getTargetValue());
                this.getOutputFormats.setRunning(true);
                copy$default = androidx.compose.animation.core.AnimationStateKt.copy$default((androidx.compose.animation.core.AnimationState) this.getOutputFormats.getInternalState$animation_core(), (java.lang.Object) null, (androidx.compose.animation.core.AnimationVector) null, 0L, Long.MIN_VALUE, false, 23, (java.lang.Object) null);
                final kotlin.jvm.internal.Ref.BooleanRef booleanRef2 = new kotlin.jvm.internal.Ref.BooleanRef();
                androidx.compose.animation.core.Animation<T, V> animation = this.getHighSpeedVideoFpsRangesFor;
                long j = this.getHighSpeedVideoFpsRanges;
                final androidx.compose.animation.core.Animatable<T, V> animatable = this.getOutputFormats;
                final kotlin.jvm.functions.Function1<androidx.compose.animation.core.Animatable<T, V>, kotlin.Unit> function1 = this.getHighSpeedVideoSizes;
                this.Camera2StreamConfigurationMap = copy$default;
                this.getInputFormats = booleanRef2;
                this.getHighSpeedVideoSizesFor = 1;
                if (androidx.compose.animation.core.SuspendAnimationKt.animate(copy$default, animation, j, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.Animatable$runAnimation$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        kotlin.Unit highSpeedVideoFpsRanges;
                        highSpeedVideoFpsRanges = androidx.compose.animation.core.Animatable$runAnimation$2.getHighSpeedVideoFpsRanges(androidx.compose.animation.core.Animatable.this, copy$default, function1, booleanRef2, (androidx.compose.animation.core.AnimationScope) obj2);
                        return highSpeedVideoFpsRanges;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                booleanRef = booleanRef2;
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                booleanRef = (kotlin.jvm.internal.Ref.BooleanRef) this.getInputFormats;
                copy$default = (androidx.compose.animation.core.AnimationState) this.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            androidx.compose.animation.core.AnimationEndReason animationEndReason = booleanRef.element ? androidx.compose.animation.core.AnimationEndReason.BoundReached : androidx.compose.animation.core.AnimationEndReason.Finished;
            this.getOutputFormats.getHighSpeedVideoSizes();
            return new androidx.compose.animation.core.AnimationResult(copy$default, animationEndReason);
        } catch (java.util.concurrent.CancellationException e) {
            this.getOutputFormats.getHighSpeedVideoSizes();
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.animation.core.Animatable animatable, androidx.compose.animation.core.AnimationState animationState, kotlin.jvm.functions.Function1 function1, kotlin.jvm.internal.Ref.BooleanRef booleanRef, androidx.compose.animation.core.AnimationScope animationScope) {
        java.lang.Object highSpeedVideoSizes;
        androidx.compose.animation.core.SuspendAnimationKt.updateState(animationScope, animatable.getInternalState$animation_core());
        highSpeedVideoSizes = animatable.getHighSpeedVideoSizes(animationScope.getValue());
        if (!kotlin.jvm.internal.Intrinsics.areEqual(highSpeedVideoSizes, animationScope.getValue())) {
            animatable.getInternalState$animation_core().setValue$animation_core(highSpeedVideoSizes);
            animationState.setValue$animation_core(highSpeedVideoSizes);
            if (function1 != null) {
                function1.invoke(animatable);
            }
            animationScope.cancelAnimation();
            booleanRef.element = true;
        } else if (function1 != null) {
            function1.invoke(animatable);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlin.coroutines.Continuation<? super androidx.compose.animation.core.AnimationResult<T, V>> continuation) {
        return ((androidx.compose.animation.core.Animatable$runAnimation$2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.animation.core.Animatable$runAnimation$2(this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Animatable$runAnimation$2(androidx.compose.animation.core.Animatable<T, V> animatable, T t, androidx.compose.animation.core.Animation<T, V> animation, long j, kotlin.jvm.functions.Function1<? super androidx.compose.animation.core.Animatable<T, V>, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super androidx.compose.animation.core.Animatable$runAnimation$2> continuation) {
        super(1, continuation);
        this.getOutputFormats = animatable;
        this.getHighResolutionOutputSizeshNQ4ISI = t;
        this.getHighSpeedVideoFpsRangesFor = animation;
        this.getHighSpeedVideoFpsRanges = j;
        this.getHighSpeedVideoSizes = function1;
    }
}
