package androidx.content.core;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.FileStorageKt", f = "FileStorage.kt", i = {0}, l = {224}, m = "runFileDiagnosticsIfNotCorruption", n = {"file"}, s = {"L$0"}, v = 1)
/* loaded from: classes3.dex */
final class FileStorageKt$runFileDiagnosticsIfNotCorruption$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = androidx.content.core.FileStorageKt.getHighResolutionOutputSizeshNQ4ISI(null, null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    FileStorageKt$runFileDiagnosticsIfNotCorruption$1(kotlin.coroutines.Continuation<? super androidx.content.core.FileStorageKt$runFileDiagnosticsIfNotCorruption$1> continuation) {
        super(continuation);
    }
}
