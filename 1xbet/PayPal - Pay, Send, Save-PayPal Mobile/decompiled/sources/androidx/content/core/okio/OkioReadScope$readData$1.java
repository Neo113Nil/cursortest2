package androidx.content.core.okio;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.okio.OkioReadScope", f = "OkioStorage.kt", i = {0, 0, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE}, m = "readData$suspendImpl", n = {"$this", "$this$use$iv$iv", "$this", "$this$use$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 1)
/* loaded from: classes7.dex */
final class OkioReadScope$readData$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ androidx.content.core.okio.OkioReadScope<T> Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return androidx.content.core.okio.OkioReadScope.getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OkioReadScope$readData$1(androidx.content.core.okio.OkioReadScope<T> okioReadScope, kotlin.coroutines.Continuation<? super androidx.content.core.okio.OkioReadScope$readData$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = okioReadScope;
    }
}
