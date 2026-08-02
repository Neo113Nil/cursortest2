package androidx.content.core.okio;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.okio.OkioStorageConnection", f = "OkioStorage.kt", i = {0, 0}, l = {113}, m = "readScope", n = {"$this$use$iv", "lock"}, s = {"L$0", "Z$0"}, v = 1)
/* loaded from: classes7.dex */
final class OkioStorageConnection$readScope$1<R> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.content.core.okio.OkioStorageConnection<T> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.readScope(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OkioStorageConnection$readScope$1(androidx.content.core.okio.OkioStorageConnection<T> okioStorageConnection, kotlin.coroutines.Continuation<? super androidx.content.core.okio.OkioStorageConnection$readScope$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = okioStorageConnection;
    }
}
