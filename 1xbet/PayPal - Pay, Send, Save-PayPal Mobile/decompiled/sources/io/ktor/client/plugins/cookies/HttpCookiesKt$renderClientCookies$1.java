package io.ktor.client.plugins.cookies;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final /* synthetic */ class HttpCookiesKt$renderClientCookies$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<io.ktor.http.Cookie, java.lang.String> {
    public static final io.ktor.client.plugins.cookies.HttpCookiesKt$renderClientCookies$1 getHighSpeedVideoFpsRanges = new io.ktor.client.plugins.cookies.HttpCookiesKt$renderClientCookies$1();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.String invoke(io.ktor.http.Cookie cookie) {
        io.ktor.http.Cookie cookie2 = cookie;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookie2, "");
        return io.ktor.http.CookieKt.renderCookieHeader(cookie2);
    }

    HttpCookiesKt$renderClientCookies$1() {
        super(1, io.ktor.http.CookieKt.class, "renderCookieHeader", "renderCookieHeader(Lio/ktor/http/Cookie;)Ljava/lang/String;", 1);
    }
}
