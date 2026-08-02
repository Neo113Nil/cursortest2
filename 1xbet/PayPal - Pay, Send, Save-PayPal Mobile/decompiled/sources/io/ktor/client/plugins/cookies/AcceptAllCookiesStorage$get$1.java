package io.ktor.client.plugins.cookies;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.cookies.AcceptAllCookiesStorage", f = "AcceptAllCookiesStorage.kt", i = {0, 0}, l = {79}, m = "get", n = {"requestUrl", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
/* loaded from: classes17.dex */
final class AcceptAllCookiesStorage$get$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ io.ktor.client.plugins.cookies.AcceptAllCookiesStorage Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.get(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcceptAllCookiesStorage$get$1(io.ktor.client.plugins.cookies.AcceptAllCookiesStorage acceptAllCookiesStorage, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$get$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = acceptAllCookiesStorage;
    }
}
