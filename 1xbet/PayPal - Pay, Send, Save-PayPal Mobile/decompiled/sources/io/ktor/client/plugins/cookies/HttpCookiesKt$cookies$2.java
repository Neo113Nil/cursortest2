package io.ktor.client.plugins.cookies;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.cookies.HttpCookiesKt", f = "HttpCookies.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE}, m = "cookies", n = {}, s = {})
/* loaded from: classes17.dex */
final class HttpCookiesKt$cookies$2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return io.ktor.client.plugins.cookies.HttpCookiesKt.cookies((io.ktor.client.HttpClient) null, (java.lang.String) null, this);
    }

    HttpCookiesKt$cookies$2(kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cookies.HttpCookiesKt$cookies$2> continuation) {
        super(continuation);
    }
}
