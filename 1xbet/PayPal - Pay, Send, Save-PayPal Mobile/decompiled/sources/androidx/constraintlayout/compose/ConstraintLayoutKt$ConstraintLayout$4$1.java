package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$4$1", f = "ConstraintLayout.kt", i = {}, l = {779, 789}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class ConstraintLayoutKt$ConstraintLayout$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlinx.coroutines.channels.Channel<androidx.constraintlayout.compose.ConstraintSet> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.animation.core.AnimationSpec<java.lang.Float> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableIntState getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getOutputFormats;
    int getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ab, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r14.getOutputFormats, kotlin.coroutines.jvm.internal.Boxing.boxFloat(r14.getHighSpeedVideoSizes.getIntValue()), r14.getHighSpeedVideoFpsRangesFor, null, null, r14, 12, null) == r0) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00ab -> B:6:0x0015). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00c5 -> B:12:0x0031). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ChannelIterator<androidx.constraintlayout.compose.ConstraintSet> it;
        kotlinx.coroutines.channels.ChannelIterator<androidx.constraintlayout.compose.ConstraintSet> channelIterator;
        java.lang.Object hasNext;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            it = this.getHighSpeedVideoFpsRanges.iterator();
            this.getInputSizeshNQ4ISI = it;
            this.getOutputMinFrameDuration = 1;
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
            androidx.compose.runtime.MutableIntState mutableIntState = this.getHighSpeedVideoSizes;
            mutableIntState.setIntValue(mutableIntState.getIntValue() == 1 ? 0 : 1);
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.Camera2StreamConfigurationMap;
            if (function0 != null) {
                function0.invoke();
            }
            this.getInputSizeshNQ4ISI = it;
            this.getOutputMinFrameDuration = 1;
            hasNext = it.hasNext(this);
            if (hasNext != coroutine_suspended) {
                channelIterator = it;
                obj = hasNext;
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    androidx.constraintlayout.compose.ConstraintSet next = channelIterator.next();
                    androidx.constraintlayout.compose.ConstraintSet constraintSet = (androidx.constraintlayout.compose.ConstraintSet) kotlinx.coroutines.channels.ChannelResult.m24084getOrNullimpl(this.getHighSpeedVideoFpsRanges.mo24073tryReceivePtdJZtk());
                    if (constraintSet != null) {
                        next = constraintSet;
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(next, this.getHighSpeedVideoSizes.getIntValue() == 1 ? androidx.constraintlayout.compose.ConstraintLayoutKt.m8923access$ConstraintLayout$lambda17(this.getInputFormats) : androidx.constraintlayout.compose.ConstraintLayoutKt.m8925access$ConstraintLayout$lambda20(this.getHighResolutionOutputSizeshNQ4ISI))) {
                        it = channelIterator;
                        this.getInputSizeshNQ4ISI = it;
                        this.getOutputMinFrameDuration = 1;
                        hasNext = it.hasNext(this);
                        if (hasNext != coroutine_suspended) {
                        }
                    } else {
                        if (this.getHighSpeedVideoSizes.getIntValue() != 1) {
                            this.getInputFormats.setValue(next);
                        } else {
                            this.getHighResolutionOutputSizeshNQ4ISI.setValue(next);
                        }
                        this.getInputSizeshNQ4ISI = channelIterator;
                        this.getOutputMinFrameDuration = 2;
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
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$4$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$4$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getOutputFormats, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutKt$ConstraintLayout$4$1(kotlinx.coroutines.channels.Channel<androidx.constraintlayout.compose.ConstraintSet> channel, androidx.compose.runtime.MutableIntState mutableIntState, androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> mutableState, androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> mutableState2, kotlin.coroutines.Continuation<? super androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$4$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = channel;
        this.getHighSpeedVideoSizes = mutableIntState;
        this.getOutputFormats = animatable;
        this.getHighSpeedVideoFpsRangesFor = animationSpec;
        this.Camera2StreamConfigurationMap = function0;
        this.getInputFormats = mutableState;
        this.getHighResolutionOutputSizeshNQ4ISI = mutableState2;
    }
}
