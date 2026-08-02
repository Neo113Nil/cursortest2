package androidx.content.core;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.RunOnce", f = "DataStoreImpl.kt", i = {0, 1}, l = {com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST, my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CERTIFICATE}, m = "runIfNeeded", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"}, v = 1)
/* loaded from: classes3.dex */
final class RunOnce$runIfNeeded$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ androidx.content.core.RunOnce Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.runIfNeeded(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RunOnce$runIfNeeded$1(androidx.content.core.RunOnce runOnce, kotlin.coroutines.Continuation<? super androidx.content.core.RunOnce$runIfNeeded$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = runOnce;
    }
}
