package androidx.content.core;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", i = {}, l = {120}, m = "currentData", n = {}, s = {}, v = 1)
/* loaded from: classes3.dex */
final class DataStoreImpl$currentData$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ androidx.content.core.DataStoreImpl<T> Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.currentData(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$currentData$1(androidx.content.core.DataStoreImpl<T> dataStoreImpl, kotlin.coroutines.Continuation<? super androidx.content.core.DataStoreImpl$currentData$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = dataStoreImpl;
    }
}
