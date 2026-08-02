package androidx.content.core;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", i = {0, 0}, l = {305, 314, 322}, m = "readDataAndUpdateCache", n = {"currentState", "requireLock"}, s = {"L$0", "Z$0"}, v = 1)
/* loaded from: classes3.dex */
final class DataStoreImpl$readDataAndUpdateCache$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    boolean Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.content.core.DataStoreImpl<T> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return androidx.content.core.DataStoreImpl.access$readDataAndUpdateCache(this.getHighResolutionOutputSizeshNQ4ISI, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$readDataAndUpdateCache$1(androidx.content.core.DataStoreImpl<T> dataStoreImpl, kotlin.coroutines.Continuation<? super androidx.content.core.DataStoreImpl$readDataAndUpdateCache$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = dataStoreImpl;
    }
}
