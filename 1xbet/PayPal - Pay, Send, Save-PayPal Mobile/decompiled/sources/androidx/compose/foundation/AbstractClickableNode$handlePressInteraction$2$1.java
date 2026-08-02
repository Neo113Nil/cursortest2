package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1", f = "Clickable.kt", i = {0, 1, 2}, l = {androidx.compose.material3.ProgressIndicatorKt.LinearAnimationDuration, 1752, 1759, 1760, 1770}, m = "invokeSuspend", n = {"delayJob", "success", "release"}, s = {"L$0", "Z$0", "L$0"}, v = 1)
/* loaded from: classes6.dex */
final class AbstractClickableNode$handlePressInteraction$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.interaction.MutableInteractionSource Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.gestures.PressGestureScope getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ long getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getOutputFormats;
    final /* synthetic */ androidx.compose.foundation.AbstractClickableNode getOutputMinFrameDuration;

    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.Job launch$default;
        java.lang.Object tryAwaitRelease;
        androidx.compose.foundation.interaction.PressInteraction.Press press;
        androidx.compose.foundation.interaction.PressInteraction.Cancel cancel;
        boolean z;
        androidx.compose.foundation.interaction.PressInteraction.Release release;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default((kotlinx.coroutines.CoroutineScope) this.getOutputFormats, null, null, new androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1$delayJob$1(this.getOutputMinFrameDuration, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, null), 3, null);
            this.getOutputFormats = launch$default;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            tryAwaitRelease = this.getHighSpeedVideoFpsRanges.tryAwaitRelease(this);
            if (tryAwaitRelease == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4 && i != 5) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        this.getOutputMinFrameDuration.getHighSpeedVideoSizesFor = null;
                        return kotlin.Unit.INSTANCE;
                    }
                    release = (androidx.compose.foundation.interaction.PressInteraction.Release) this.getOutputFormats;
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.getOutputFormats = null;
                    this.getHighResolutionOutputSizeshNQ4ISI = 4;
                    if (this.Camera2StreamConfigurationMap.emit(release, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.getOutputMinFrameDuration.getHighSpeedVideoSizesFor = null;
                    return kotlin.Unit.INSTANCE;
                }
                z = this.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                if (z) {
                    androidx.compose.foundation.interaction.PressInteraction.Press press2 = new androidx.compose.foundation.interaction.PressInteraction.Press(this.getHighSpeedVideoSizes, null);
                    androidx.compose.foundation.interaction.PressInteraction.Release release2 = new androidx.compose.foundation.interaction.PressInteraction.Release(press2);
                    this.getOutputFormats = release2;
                    this.getHighResolutionOutputSizeshNQ4ISI = 3;
                    if (this.Camera2StreamConfigurationMap.emit(press2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    release = release2;
                    this.getOutputFormats = null;
                    this.getHighResolutionOutputSizeshNQ4ISI = 4;
                    if (this.Camera2StreamConfigurationMap.emit(release, this) == coroutine_suspended) {
                    }
                }
                this.getOutputMinFrameDuration.getHighSpeedVideoSizesFor = null;
                return kotlin.Unit.INSTANCE;
            }
            launch$default = (kotlinx.coroutines.Job) this.getOutputFormats;
            kotlin.ResultKt.throwOnFailure(obj);
            tryAwaitRelease = obj;
        }
        boolean booleanValue = ((java.lang.Boolean) tryAwaitRelease).booleanValue();
        if (!launch$default.isActive()) {
            press = this.getOutputMinFrameDuration.getHighSpeedVideoSizesFor;
            if (press != null) {
                androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.Camera2StreamConfigurationMap;
                if (booleanValue) {
                    cancel = new androidx.compose.foundation.interaction.PressInteraction.Release(press);
                } else {
                    cancel = new androidx.compose.foundation.interaction.PressInteraction.Cancel(press);
                }
                this.getOutputFormats = null;
                this.getHighResolutionOutputSizeshNQ4ISI = 5;
                if (mutableInteractionSource.emit(cancel, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.getOutputMinFrameDuration.getHighSpeedVideoSizesFor = null;
            return kotlin.Unit.INSTANCE;
        }
        this.getOutputFormats = null;
        this.getHighSpeedVideoFpsRangesFor = booleanValue;
        this.getHighResolutionOutputSizeshNQ4ISI = 2;
        if (kotlinx.coroutines.JobKt.cancelAndJoin(launch$default, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        z = booleanValue;
        if (z) {
        }
        this.getOutputMinFrameDuration.getHighSpeedVideoSizesFor = null;
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1 abstractClickableNode$handlePressInteraction$2$1 = new androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getOutputMinFrameDuration, continuation);
        abstractClickableNode$handlePressInteraction$2$1.getOutputFormats = obj;
        return abstractClickableNode$handlePressInteraction$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractClickableNode$handlePressInteraction$2$1(androidx.compose.foundation.gestures.PressGestureScope pressGestureScope, long j, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.AbstractClickableNode abstractClickableNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = pressGestureScope;
        this.getHighSpeedVideoSizes = j;
        this.Camera2StreamConfigurationMap = mutableInteractionSource;
        this.getOutputMinFrameDuration = abstractClickableNode;
    }
}
