package androidx.camera.camera2.pipe.graph;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.graph.Controller3A", f = "Controller3A.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {373}, m = "lock3A-Qz1gx5w", n = {"aeLockBehavior", "awbLockBehavior", "afTriggerStartAeMode", "lockedCondition", "lockedTimeLimitNs", "afLockBehaviorSanitized", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "frameLimit"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0"}, v = 1)
/* loaded from: classes6.dex */
final class Controller3A$lock3A$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ androidx.camera.camera2.pipe.graph.Controller3A getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return this.getOutputStallDurationlomOqCM.m908lock3AQz1gx5w(null, null, null, null, null, null, null, null, null, 0, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Controller3A$lock3A$1(androidx.camera.camera2.pipe.graph.Controller3A controller3A, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.graph.Controller3A$lock3A$1> continuation) {
        super(continuation);
        this.getOutputStallDurationlomOqCM = controller3A;
    }
}
