package io.ktor.client.plugins.cookies;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.cookies.AcceptAllCookiesStorage", f = "AcceptAllCookiesStorage.kt", i = {0, 0, 0}, l = {79}, m = "addCookie", n = {"requestUrl", "cookie", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes17.dex */
final class AcceptAllCookiesStorage$addCookie$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ io.ktor.client.plugins.cookies.AcceptAllCookiesStorage getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getOutputFormats.addCookie(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcceptAllCookiesStorage$addCookie$1(io.ktor.client.plugins.cookies.AcceptAllCookiesStorage acceptAllCookiesStorage, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$addCookie$1> continuation) {
        super(continuation);
        this.getOutputFormats = acceptAllCookiesStorage;
    }
}
