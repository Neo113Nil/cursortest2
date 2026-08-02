package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.constraintlayout.compose.LateMotionLayoutKt$LateMotionLayout$2$1", f = "LateMotionLayout.kt", i = {}, l = {87, 100}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class LateMotionLayoutKt$LateMotionLayout$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.channels.Channel<androidx.constraintlayout.compose.ConstraintSet> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableIntState getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.ui.node.Ref<androidx.constraintlayout.compose.CompositionSource> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.animation.core.AnimationSpec<java.lang.Float> getHighSpeedVideoSizes;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> getOutputFormats;
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b0, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r14.getHighSpeedVideoFpsRanges, kotlin.coroutines.jvm.internal.Boxing.boxFloat(r14.getHighResolutionOutputSizeshNQ4ISI.getIntValue()), r14.getHighSpeedVideoSizes, null, null, r14, 12, null) == r0) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b0 -> B:6:0x0015). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00ca -> B:12:0x0031). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ChannelIterator<androidx.constraintlayout.compose.ConstraintSet> it;
        kotlinx.coroutines.channels.ChannelIterator<androidx.constraintlayout.compose.ConstraintSet> channelIterator;
        java.lang.Object hasNext;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            it = this.Camera2StreamConfigurationMap.iterator();
            this.getInputSizeshNQ4ISI = it;
            this.getInputFormats = 1;
            hasNext = it.hasNext(this);
            if (hasNext != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channelIterator = (kotlinx.coroutines.channels.ChannelIterator) this.getInputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
            it = channelIterator;
            androidx.compose.runtime.MutableIntState mutableIntState = this.getHighResolutionOutputSizeshNQ4ISI;
            mutableIntState.setIntValue(mutableIntState.getIntValue() == 1 ? 0 : 1);
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.getHighSpeedVideoSizesFor;
            if (function0 != null) {
                function0.invoke();
            }
            this.getInputSizeshNQ4ISI = it;
            this.getInputFormats = 1;
            hasNext = it.hasNext(this);
            if (hasNext != coroutine_suspended) {
                channelIterator = it;
                obj = hasNext;
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    androidx.constraintlayout.compose.ConstraintSet next = channelIterator.next();
                    androidx.constraintlayout.compose.ConstraintSet constraintSet = (androidx.constraintlayout.compose.ConstraintSet) kotlinx.coroutines.channels.ChannelResult.m24084getOrNullimpl(this.Camera2StreamConfigurationMap.mo24073tryReceivePtdJZtk());
                    if (constraintSet != null) {
                        next = constraintSet;
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(next, (this.getHighResolutionOutputSizeshNQ4ISI.getIntValue() == 1 ? this.getOutputFormats : this.getOutputMinFrameDuration).getValue())) {
                        it = channelIterator;
                        this.getInputSizeshNQ4ISI = it;
                        this.getInputFormats = 1;
                        hasNext = it.hasNext(this);
                        if (hasNext != coroutine_suspended) {
                        }
                    } else {
                        if (this.getHighResolutionOutputSizeshNQ4ISI.getIntValue() == 1) {
                            this.getOutputMinFrameDuration.setValue(next);
                        } else {
                            this.getOutputFormats.setValue(next);
                        }
                        this.getHighSpeedVideoFpsRangesFor.setValue(androidx.constraintlayout.compose.CompositionSource.Content);
                        this.getInputSizeshNQ4ISI = channelIterator;
                        this.getInputFormats = 2;
                    }
                } else {
                    return kotlin.Unit.INSTANCE;
                }
            }
            return coroutine_suspended;
        }
        channelIterator = (kotlinx.coroutines.channels.ChannelIterator) this.getInputSizeshNQ4ISI;
        kotlin.ResultKt.throwOnFailure(obj);
        if (!((java.lang.Boolean) obj).booleanValue()) {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.constraintlayout.compose.LateMotionLayoutKt$LateMotionLayout$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.constraintlayout.compose.LateMotionLayoutKt$LateMotionLayout$2$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputFormats, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighSpeedVideoSizesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LateMotionLayoutKt$LateMotionLayout$2$1(kotlinx.coroutines.channels.Channel<androidx.constraintlayout.compose.ConstraintSet> channel, androidx.compose.runtime.MutableIntState mutableIntState, androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> mutableState, androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> mutableState2, androidx.compose.ui.node.Ref<androidx.constraintlayout.compose.CompositionSource> ref, androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super androidx.constraintlayout.compose.LateMotionLayoutKt$LateMotionLayout$2$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = channel;
        this.getHighResolutionOutputSizeshNQ4ISI = mutableIntState;
        this.getOutputFormats = mutableState;
        this.getOutputMinFrameDuration = mutableState2;
        this.getHighSpeedVideoFpsRangesFor = ref;
        this.getHighSpeedVideoFpsRanges = animatable;
        this.getHighSpeedVideoSizes = animationSpec;
        this.getHighSpeedVideoSizesFor = function0;
    }
}
