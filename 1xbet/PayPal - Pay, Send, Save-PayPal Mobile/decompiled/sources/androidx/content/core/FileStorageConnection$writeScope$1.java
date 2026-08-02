package androidx.content.core;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", i = {0, 0, 1, 1, 1}, l = {238, 112}, m = "writeScope", n = {"block", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "scratchFile", "$this$use$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"}, v = 1)
/* loaded from: classes3.dex */
final class FileStorageConnection$writeScope$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ androidx.content.core.FileStorageConnection<T> getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.writeScope(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileStorageConnection$writeScope$1(androidx.content.core.FileStorageConnection<T> fileStorageConnection, kotlin.coroutines.Continuation<? super androidx.content.core.FileStorageConnection$writeScope$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = fileStorageConnection;
    }
}
