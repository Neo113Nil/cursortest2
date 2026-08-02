package androidx.content.core;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1", f = "DataStoreImpl.kt", i = {0, 0, 1, 2, 2}, l = {com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST, 467, 469}, m = "updateData", n = {"transform", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "newData"}, s = {"L$0", "L$1", "L$0", "L$0", "L$2"}, v = 1)
/* loaded from: classes3.dex */
final class DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ androidx.content.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1 getHighSpeedVideoSizesFor;
    int getOutputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.updateData(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1(androidx.content.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$1, kotlin.coroutines.Continuation<? super androidx.content.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
    }
}
