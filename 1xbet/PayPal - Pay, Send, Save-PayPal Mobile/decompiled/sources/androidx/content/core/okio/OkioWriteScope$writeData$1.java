package androidx.content.core.okio;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.okio.OkioWriteScope", f = "OkioStorage.kt", i = {0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PIN_VALUE}, m = "writeData", n = {"$this$use$iv", "handle", "$this$use$iv"}, s = {"L$0", "L$1", "L$2"}, v = 1)
/* loaded from: classes7.dex */
final class OkioWriteScope$writeData$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ androidx.content.core.okio.OkioWriteScope<T> getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getOutputFormats.writeData(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OkioWriteScope$writeData$1(androidx.content.core.okio.OkioWriteScope<T> okioWriteScope, kotlin.coroutines.Continuation<? super androidx.content.core.okio.OkioWriteScope$writeData$1> continuation) {
        super(continuation);
        this.getOutputFormats = okioWriteScope;
    }
}
