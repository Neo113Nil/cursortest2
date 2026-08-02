package androidx.navigation3.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$12$1$1$1", f = "NavDisplay.kt", i = {}, l = {801, 805}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class NavDisplayKt__NavDisplayKt$NavDisplay$12$1$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.animation.core.SeekableTransitionState<androidx.navigation3.scene.Scene<T>> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ float getHighSpeedVideoFpsRanges;
    final /* synthetic */ float getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.navigation3.scene.Scene<T> getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (r9.getHighResolutionOutputSizeshNQ4ISI.snapTo(r9.getHighSpeedVideoSizes, r9) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
    
        if (androidx.compose.animation.core.SeekableTransitionState.seekTo$default(r9.getHighResolutionOutputSizeshNQ4ISI, r4, null, r9, 2, null) != r0) goto L14;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            float f = this.getHighSpeedVideoFpsRanges;
            if (f != this.getHighSpeedVideoFpsRangesFor) {
                this.Camera2StreamConfigurationMap = 1;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (this.getHighSpeedVideoFpsRanges == this.getHighSpeedVideoFpsRangesFor) {
            this.Camera2StreamConfigurationMap = 2;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$12$1$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$12$1$1$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavDisplayKt__NavDisplayKt$NavDisplay$12$1$1$1(float f, float f2, androidx.compose.animation.core.SeekableTransitionState<androidx.navigation3.scene.Scene<T>> seekableTransitionState, androidx.navigation3.scene.Scene<T> scene, kotlin.coroutines.Continuation<? super androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$12$1$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = f;
        this.getHighSpeedVideoFpsRangesFor = f2;
        this.getHighResolutionOutputSizeshNQ4ISI = seekableTransitionState;
        this.getHighSpeedVideoSizes = scene;
    }
}
