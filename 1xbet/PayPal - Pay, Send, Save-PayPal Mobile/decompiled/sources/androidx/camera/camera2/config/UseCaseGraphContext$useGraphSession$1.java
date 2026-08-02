package androidx.camera.camera2.config;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.config.UseCaseGraphContext", f = "UseCaseCameraConfig.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE}, m = "useGraphSession", n = {"block"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class UseCaseGraphContext$useGraphSession$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.camera.camera2.config.UseCaseGraphContext getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.useGraphSession(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UseCaseGraphContext$useGraphSession$1(androidx.camera.camera2.config.UseCaseGraphContext useCaseGraphContext, kotlin.coroutines.Continuation<? super androidx.camera.camera2.config.UseCaseGraphContext$useGraphSession$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = useCaseGraphContext;
    }
}
