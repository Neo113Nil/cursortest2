package io.ktor.client.plugins.cookies;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.cookies.HttpCookiesKt", f = "HttpCookies.kt", i = {}, l = {150}, m = "cookies", n = {}, s = {})
/* loaded from: classes17.dex */
final class HttpCookiesKt$cookies$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return io.ktor.client.plugins.cookies.HttpCookiesKt.cookies((io.ktor.client.HttpClient) null, (io.ktor.http.Url) null, this);
    }

    HttpCookiesKt$cookies$1(kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cookies.HttpCookiesKt$cookies$1> continuation) {
        super(continuation);
    }
}
