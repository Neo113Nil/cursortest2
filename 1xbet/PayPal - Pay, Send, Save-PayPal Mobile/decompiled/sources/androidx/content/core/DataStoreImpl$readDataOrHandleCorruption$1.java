package androidx.content.core;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", i = {0, 1, 2, 3, 4, 4, 4, 5, 5, 5}, l = {385, 386, 388, 389, 396, 400}, m = "readDataOrHandleCorruption", n = {"hasWriteFileLock", "hasWriteFileLock", "hasWriteFileLock", "hasWriteFileLock", "ex", "newData", "hasWriteFileLock", "ex", "newData", "version"}, s = {"Z$0", "Z$0", "Z$0", "Z$0", "L$0", "L$1", "Z$0", "L$0", "L$1", "L$2"}, v = 1)
/* loaded from: classes3.dex */
final class DataStoreImpl$readDataOrHandleCorruption$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    boolean Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ androidx.content.core.DataStoreImpl<T> getInputFormats;
    int getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getInputFormats.getHighSpeedVideoFpsRangesFor(false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$readDataOrHandleCorruption$1(androidx.content.core.DataStoreImpl<T> dataStoreImpl, kotlin.coroutines.Continuation<? super androidx.content.core.DataStoreImpl$readDataOrHandleCorruption$1> continuation) {
        super(continuation);
        this.getInputFormats = dataStoreImpl;
    }
}
