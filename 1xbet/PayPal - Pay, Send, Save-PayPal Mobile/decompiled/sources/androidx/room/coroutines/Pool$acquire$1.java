package androidx.room.coroutines;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.coroutines.Pool", f = "ConnectionPoolImpl.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE}, m = "acquire", n = {}, s = {})
/* loaded from: classes3.dex */
final class Pool$acquire$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.room.coroutines.Pool getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Pool$acquire$1(androidx.room.coroutines.Pool pool, kotlin.coroutines.Continuation<? super androidx.room.coroutines.Pool$acquire$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = pool;
    }
}
