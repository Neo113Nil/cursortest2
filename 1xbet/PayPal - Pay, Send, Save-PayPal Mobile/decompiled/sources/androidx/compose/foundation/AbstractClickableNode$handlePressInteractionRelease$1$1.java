package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1", f = "Clickable.kt", i = {1}, l = {1669, 1674, 1675}, m = "invokeSuspend", n = {"release"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class AbstractClickableNode$handlePressInteractionRelease$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.interaction.MutableInteractionSource Camera2StreamConfigurationMap;
    final /* synthetic */ kotlinx.coroutines.Job getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ long getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        if (r7.Camera2StreamConfigurationMap.emit(r1, r7) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (r7.Camera2StreamConfigurationMap.emit(r8, r7) != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
    
        if (r7.getHighResolutionOutputSizeshNQ4ISI.join(r7) != r0) goto L14;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.foundation.interaction.PressInteraction.Release release;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
        } else if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            release = (androidx.compose.foundation.interaction.PressInteraction.Release) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRanges = null;
            this.getHighSpeedVideoSizes = 3;
        }
        androidx.compose.foundation.interaction.PressInteraction.Press press = new androidx.compose.foundation.interaction.PressInteraction.Press(this.getHighSpeedVideoFpsRangesFor, null);
        release = new androidx.compose.foundation.interaction.PressInteraction.Release(press);
        this.getHighSpeedVideoFpsRanges = release;
        this.getHighSpeedVideoSizes = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractClickableNode$handlePressInteractionRelease$1$1(kotlinx.coroutines.Job job, long j, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, kotlin.coroutines.Continuation<? super androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = job;
        this.getHighSpeedVideoFpsRangesFor = j;
        this.Camera2StreamConfigurationMap = mutableInteractionSource;
    }
}
