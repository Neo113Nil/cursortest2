package io.ktor.client.plugins.cookies;

/* compiled from: HttpCookies.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class HttpCookiesKt$renderClientCookies$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<io.ktor.http.Cookie, java.lang.String> {
    public static final io.ktor.client.plugins.cookies.HttpCookiesKt$renderClientCookies$1 INSTANCE = new io.ktor.client.plugins.cookies.HttpCookiesKt$renderClientCookies$1();

    HttpCookiesKt$renderClientCookies$1() {
        super(1, io.ktor.http.CookieKt.class, "renderCookieHeader", "renderCookieHeader(Lio/ktor/http/Cookie;)Ljava/lang/String;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.String invoke(io.ktor.http.Cookie p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "p0");
        return io.ktor.http.CookieKt.renderCookieHeader(p0);
    }
}
