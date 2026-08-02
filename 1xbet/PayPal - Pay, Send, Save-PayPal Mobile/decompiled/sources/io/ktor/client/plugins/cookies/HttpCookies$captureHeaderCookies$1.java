package io.ktor.client.plugins.cookies;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.cookies.HttpCookies", f = "HttpCookies.kt", i = {0}, l = {60}, m = "captureHeaderCookies$ktor_client_core", n = {"url"}, s = {"L$0"})
/* loaded from: classes17.dex */
final class HttpCookies$captureHeaderCookies$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ io.ktor.client.plugins.cookies.HttpCookies getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.captureHeaderCookies$ktor_client_core(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpCookies$captureHeaderCookies$1(io.ktor.client.plugins.cookies.HttpCookies httpCookies, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cookies.HttpCookies$captureHeaderCookies$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = httpCookies;
    }
}
