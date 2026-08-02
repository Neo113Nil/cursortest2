package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$3$1", f = "MotionLayout.kt", i = {}, l = {475, 485}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class MotionLayoutKt$MotionLayoutCore$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.channels.Channel<androidx.constraintlayout.compose.ConstraintSet> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.animation.core.AnimationSpec<java.lang.Float> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getInputSizeshNQ4ISI;
    int getOutputFormats;
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> getOutputMinFrameDuration;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0083 -> B:8:0x0034). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b0 -> B:6:0x00b3). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ChannelIterator<androidx.constraintlayout.compose.ConstraintSet> it;
        java.lang.Object obj2;
        boolean booleanValue;
        boolean booleanValue2;
        boolean booleanValue3;
        boolean booleanValue4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            it = this.Camera2StreamConfigurationMap.iterator();
            this.getHighSpeedVideoSizesFor = it;
            this.getOutputFormats = 1;
            obj2 = it.hasNext(this);
            if (obj2 == coroutine_suspended) {
            }
            if (!((java.lang.Boolean) obj2).booleanValue()) {
            }
        } else if (i == 1) {
            it = (kotlinx.coroutines.channels.ChannelIterator) this.getHighSpeedVideoSizesFor;
            kotlin.ResultKt.throwOnFailure(obj);
            obj2 = obj;
            if (!((java.lang.Boolean) obj2).booleanValue()) {
            }
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (kotlinx.coroutines.channels.ChannelIterator) this.getHighSpeedVideoSizesFor;
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState = this.getHighSpeedVideoSizes;
            booleanValue4 = ((java.lang.Boolean) mutableState.getValue()).booleanValue();
            mutableState.setValue(java.lang.Boolean.valueOf(!booleanValue4));
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (function0 != null) {
                function0.invoke();
            }
            this.getHighSpeedVideoSizesFor = it;
            this.getOutputFormats = 1;
            obj2 = it.hasNext(this);
            if (obj2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (!((java.lang.Boolean) obj2).booleanValue()) {
                androidx.constraintlayout.compose.ConstraintSet next = it.next();
                androidx.constraintlayout.compose.ConstraintSet constraintSet = (androidx.constraintlayout.compose.ConstraintSet) kotlinx.coroutines.channels.ChannelResult.m24084getOrNullimpl(this.Camera2StreamConfigurationMap.mo24073tryReceivePtdJZtk());
                if (constraintSet != null) {
                    next = constraintSet;
                }
                booleanValue = ((java.lang.Boolean) this.getHighSpeedVideoSizes.getValue()).booleanValue();
                float f = booleanValue ? 1.0f : 0.0f;
                booleanValue2 = ((java.lang.Boolean) this.getHighSpeedVideoSizes.getValue()).booleanValue();
                if (!kotlin.jvm.internal.Intrinsics.areEqual(next, booleanValue2 ? androidx.constraintlayout.compose.MotionLayoutKt.access$MotionLayoutCore_TEds9UA$lambda$14(this.getOutputMinFrameDuration) : androidx.constraintlayout.compose.MotionLayoutKt.access$MotionLayoutCore_TEds9UA$lambda$17(this.getHighSpeedVideoFpsRanges))) {
                    booleanValue3 = ((java.lang.Boolean) this.getHighSpeedVideoSizes.getValue()).booleanValue();
                    if (!booleanValue3) {
                        this.getOutputMinFrameDuration.setValue(next);
                    } else {
                        this.getHighSpeedVideoFpsRanges.setValue(next);
                    }
                    this.getHighSpeedVideoSizesFor = it;
                    this.getOutputFormats = 2;
                    if (androidx.compose.animation.core.Animatable.animateTo$default(this.getInputSizeshNQ4ISI, kotlin.coroutines.jvm.internal.Boxing.boxFloat(f), this.getHighSpeedVideoFpsRangesFor, null, null, this, 12, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState2 = this.getHighSpeedVideoSizes;
                    booleanValue4 = ((java.lang.Boolean) mutableState2.getValue()).booleanValue();
                    mutableState2.setValue(java.lang.Boolean.valueOf(!booleanValue4));
                    kotlin.jvm.functions.Function0<kotlin.Unit> function02 = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (function02 != null) {
                    }
                }
                this.getHighSpeedVideoSizesFor = it;
                this.getOutputFormats = 1;
                obj2 = it.hasNext(this);
                if (obj2 == coroutine_suspended) {
                }
                if (!((java.lang.Boolean) obj2).booleanValue()) {
                    return kotlin.Unit.INSTANCE;
                }
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$3$1(this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MotionLayoutKt$MotionLayoutCore$3$1(kotlinx.coroutines.channels.Channel<androidx.constraintlayout.compose.ConstraintSet> channel, androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> mutableState2, androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> mutableState3, kotlin.coroutines.Continuation<? super androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$3$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = channel;
        this.getInputSizeshNQ4ISI = animatable;
        this.getHighSpeedVideoFpsRangesFor = animationSpec;
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
        this.getHighSpeedVideoSizes = mutableState;
        this.getOutputMinFrameDuration = mutableState2;
        this.getHighSpeedVideoFpsRanges = mutableState3;
    }
}
