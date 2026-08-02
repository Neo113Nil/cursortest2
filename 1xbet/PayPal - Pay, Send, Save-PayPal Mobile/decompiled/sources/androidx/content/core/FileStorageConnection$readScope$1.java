package androidx.content.core;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", i = {0, 0}, l = {96}, m = "readScope", n = {"$this$use$iv", "lock"}, s = {"L$0", "Z$0"}, v = 1)
/* loaded from: classes3.dex */
final class FileStorageConnection$readScope$1<R> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.content.core.FileStorageConnection<T> getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.readScope(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileStorageConnection$readScope$1(androidx.content.core.FileStorageConnection<T> fileStorageConnection, kotlin.coroutines.Continuation<? super androidx.content.core.FileStorageConnection$readScope$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = fileStorageConnection;
    }
}
