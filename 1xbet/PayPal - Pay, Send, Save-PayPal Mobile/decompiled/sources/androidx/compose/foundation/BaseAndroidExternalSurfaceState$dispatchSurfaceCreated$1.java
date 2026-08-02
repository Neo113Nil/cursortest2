package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1", f = "AndroidExternalSurface.android.kt", i = {0}, l = {130, 136}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ android.view.Surface getHighSpeedVideoFpsRanges;
    final /* synthetic */ int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.foundation.BaseAndroidExternalSurfaceState getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        if (r3.invoke(r4, r5, r6, r7, r9) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        if (kotlinx.coroutines.JobKt.cancelAndJoin(r10, r9) != r0) goto L14;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineScope coroutineScope;
        kotlinx.coroutines.Job job;
        kotlin.jvm.functions.Function5 function5;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getInputSizeshNQ4ISI;
            job = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
            if (job != null) {
                this.getInputSizeshNQ4ISI = coroutineScope;
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
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getInputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1 baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1 = new androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1(this.getHighSpeedVideoSizes, coroutineScope);
        function5 = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
        if (function5 != null) {
            android.view.Surface surface = this.getHighSpeedVideoFpsRanges;
            java.lang.Integer boxInt = kotlin.coroutines.jvm.internal.Boxing.boxInt(this.getHighSpeedVideoFpsRangesFor);
            java.lang.Integer boxInt2 = kotlin.coroutines.jvm.internal.Boxing.boxInt(this.getHighResolutionOutputSizeshNQ4ISI);
            this.getInputSizeshNQ4ISI = null;
            this.Camera2StreamConfigurationMap = 2;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1 baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1 = new androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1.getInputSizeshNQ4ISI = obj;
        return baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1(androidx.compose.foundation.BaseAndroidExternalSurfaceState baseAndroidExternalSurfaceState, android.view.Surface surface, int i, int i2, kotlin.coroutines.Continuation<? super androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = baseAndroidExternalSurfaceState;
        this.getHighSpeedVideoFpsRanges = surface;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
    }
}
