package androidx.content.core;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", i = {0}, l = {com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST}, m = "decrementCollector", n = {"$this$withLock_u24default$iv"}, s = {"L$0"}, v = 1)
/* loaded from: classes3.dex */
final class DataStoreImpl$decrementCollector$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ androidx.content.core.DataStoreImpl<T> Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$decrementCollector$1(androidx.content.core.DataStoreImpl<T> dataStoreImpl, kotlin.coroutines.Continuation<? super androidx.content.core.DataStoreImpl$decrementCollector$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = dataStoreImpl;
    }
}
