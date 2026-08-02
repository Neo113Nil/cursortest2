package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/ProduceStateScope;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1", f = "AnimatedVisibility.kt", i = {}, l = {736}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.runtime.ProduceStateScope<java.lang.Boolean>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function2<androidx.compose.animation.EnterExitState, androidx.compose.animation.EnterExitState, java.lang.Boolean>> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.runtime.ProduceStateScope produceStateScope = (androidx.compose.runtime.ProduceStateScope) this.Camera2StreamConfigurationMap;
            final androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> transition = this.getHighSpeedVideoFpsRanges;
            kotlinx.coroutines.flow.Flow snapshotFlow = androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1.1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.Boolean invoke() {
                    boolean highSpeedVideoFpsRanges;
                    highSpeedVideoFpsRanges = androidx.compose.animation.AnimatedVisibilityKt.getHighSpeedVideoFpsRanges(transition);
                    return java.lang.Boolean.valueOf(highSpeedVideoFpsRanges);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            });
            final androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> transition2 = this.getHighSpeedVideoFpsRanges;
            final androidx.compose.runtime.State<kotlin.jvm.functions.Function2<androidx.compose.animation.EnterExitState, androidx.compose.animation.EnterExitState, java.lang.Boolean>> state = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (snapshotFlow.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    return getHighSpeedVideoSizes(((java.lang.Boolean) obj2).booleanValue(), continuation);
                }

                public final java.lang.Object getHighSpeedVideoSizes(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    boolean z2;
                    kotlin.jvm.functions.Function2 highSpeedVideoSizes;
                    androidx.compose.runtime.ProduceStateScope<java.lang.Boolean> produceStateScope2 = produceStateScope;
                    if (z) {
                        highSpeedVideoSizes = androidx.compose.animation.AnimatedVisibilityKt.getHighSpeedVideoSizes(state);
                        z2 = ((java.lang.Boolean) highSpeedVideoSizes.invoke(transition2.getCurrentState(), transition2.getTargetState())).booleanValue();
                    } else {
                        z2 = false;
                    }
                    produceStateScope2.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z2));
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
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
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(androidx.compose.runtime.ProduceStateScope<java.lang.Boolean> produceStateScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1) create(produceStateScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
        animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1.Camera2StreamConfigurationMap = obj;
        return animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> transition, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function2<? super androidx.compose.animation.EnterExitState, ? super androidx.compose.animation.EnterExitState, java.lang.Boolean>> state, kotlin.coroutines.Continuation<? super androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = transition;
        this.getHighSpeedVideoSizes = state;
    }
}
