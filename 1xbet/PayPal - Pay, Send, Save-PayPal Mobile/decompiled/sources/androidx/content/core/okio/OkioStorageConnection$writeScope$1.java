package androidx.content.core.okio;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.okio.OkioStorageConnection", f = "OkioStorage.kt", i = {0, 0, 0, 1, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE, 131}, m = "writeScope", n = {"block", "parentDir", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "scratchPath", "$this$use$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, v = 1)
/* loaded from: classes7.dex */
final class OkioStorageConnection$writeScope$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ androidx.content.core.okio.OkioStorageConnection<T> getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.writeScope(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OkioStorageConnection$writeScope$1(androidx.content.core.okio.OkioStorageConnection<T> okioStorageConnection, kotlin.coroutines.Continuation<? super androidx.content.core.okio.OkioStorageConnection$writeScope$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = okioStorageConnection;
    }
}
