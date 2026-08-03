package androidx.compose.animation.core;

/* JADX INFO: Add missing generic type declarations: [T, V] */
/* compiled from: Animatable.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationResult;", "T", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", i = {0, 0}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE}, m = "invokeSuspend", n = {"endState", "clampingNeeded"}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
final class Animatable$runAnimation$2<T, V> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super androidx.compose.animation.core.AnimationResult<T, V>>, java.lang.Object> {
    final /* synthetic */ androidx.compose.animation.core.Animation<T, V> $animation;
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.compose.animation.core.Animatable<T, V>, kotlin.Unit> $block;
    final /* synthetic */ T $initialVelocity;
    final /* synthetic */ long $startTime;
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    final /* synthetic */ androidx.compose.animation.core.Animatable<T, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Animatable$runAnimation$2(androidx.compose.animation.core.Animatable<T, V> animatable, T t, androidx.compose.animation.core.Animation<T, V> animation, long j, kotlin.jvm.functions.Function1<? super androidx.compose.animation.core.Animatable<T, V>, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super androidx.compose.animation.core.Animatable$runAnimation$2> continuation) {
        super(1, continuation);
        this.this$0 = animatable;
        this.$initialVelocity = t;
        this.$animation = animation;
        this.$startTime = j;
        this.$block = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.animation.core.Animatable$runAnimation$2(this.this$0, this.$initialVelocity, this.$animation, this.$startTime, this.$block, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super androidx.compose.animation.core.AnimationResult<T, V>> continuation) {
        return ((androidx.compose.animation.core.Animatable$runAnimation$2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        final androidx.compose.animation.core.AnimationState copy$default;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.this$0.getInternalState$animation_core_release().setVelocityVector$animation_core_release((androidx.compose.animation.core.AnimationVector) this.this$0.getTypeConverter().getConvertToVector().invoke(this.$initialVelocity));
                this.this$0.setTargetValue(this.$animation.getTargetValue());
                this.this$0.setRunning(true);
                copy$default = androidx.compose.animation.core.AnimationStateKt.copy$default((androidx.compose.animation.core.AnimationState) this.this$0.getInternalState$animation_core_release(), (java.lang.Object) null, (androidx.compose.animation.core.AnimationVector) null, 0L, Long.MIN_VALUE, false, 23, (java.lang.Object) null);
                final kotlin.jvm.internal.Ref.BooleanRef booleanRef2 = new kotlin.jvm.internal.Ref.BooleanRef();
                androidx.compose.animation.core.Animation<T, V> animation = this.$animation;
                long j = this.$startTime;
                final androidx.compose.animation.core.Animatable<T, V> animatable = this.this$0;
                final kotlin.jvm.functions.Function1<androidx.compose.animation.core.Animatable<T, V>, kotlin.Unit> function1 = this.$block;
                this.L$0 = copy$default;
                this.L$1 = booleanRef2;
                this.label = 1;
                if (androidx.compose.animation.core.SuspendAnimationKt.animate(copy$default, animation, j, new kotlin.jvm.functions.Function1<androidx.compose.animation.core.AnimationScope<T, V>, kotlin.Unit>() { // from class: androidx.compose.animation.core.Animatable$runAnimation$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj2) {
                        invoke((androidx.compose.animation.core.AnimationScope) obj2);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final void invoke(androidx.compose.animation.core.AnimationScope<T, V> animationScope) {
                        java.lang.Object clampToBounds;
                        androidx.compose.animation.core.SuspendAnimationKt.updateState(animationScope, animatable.getInternalState$animation_core_release());
                        clampToBounds = animatable.clampToBounds(animationScope.getValue());
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(clampToBounds, animationScope.getValue())) {
                            animatable.getInternalState$animation_core_release().setValue$animation_core_release(clampToBounds);
                            copy$default.setValue$animation_core_release(clampToBounds);
                            kotlin.jvm.functions.Function1<androidx.compose.animation.core.Animatable<T, V>, kotlin.Unit> function12 = function1;
                            if (function12 != null) {
                                function12.invoke(animatable);
                            }
                            animationScope.cancelAnimation();
                            booleanRef2.element = true;
                            return;
                        }
                        kotlin.jvm.functions.Function1<androidx.compose.animation.core.Animatable<T, V>, kotlin.Unit> function13 = function1;
                        if (function13 != null) {
                            function13.invoke(animatable);
                        }
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                booleanRef = booleanRef2;
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                booleanRef = (kotlin.jvm.internal.Ref.BooleanRef) this.L$1;
                copy$default = (androidx.compose.animation.core.AnimationState) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            androidx.compose.animation.core.AnimationEndReason animationEndReason = booleanRef.element ? androidx.compose.animation.core.AnimationEndReason.BoundReached : androidx.compose.animation.core.AnimationEndReason.Finished;
            this.this$0.endAnimation();
            return new androidx.compose.animation.core.AnimationResult(copy$default, animationEndReason);
        } catch (java.util.concurrent.CancellationException e) {
            this.this$0.endAnimation();
            throw e;
        }
    }
}
