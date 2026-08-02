package io.ktor.client.plugins.cookies;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a$\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\u000b\u001a\u00020\n*\u00020\u00032\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\r\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lio/ktor/client/plugins/cookies/CookiesStorage;", "", "urlString", "Lio/ktor/http/Cookie;", "cookie", "", "addCookie", "(Lio/ktor/client/plugins/cookies/CookiesStorage;Ljava/lang/String;Lio/ktor/http/Cookie;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/http/Url;", "requestUrl", "", "matches", "(Lio/ktor/http/Cookie;Lio/ktor/http/Url;)Z", "fillDefaults", "(Lio/ktor/http/Cookie;Lio/ktor/http/Url;)Lio/ktor/http/Cookie;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CookiesStorageKt {
    public static final java.lang.Object addCookie(io.ktor.client.plugins.cookies.CookiesStorage cookiesStorage, java.lang.String str, io.ktor.http.Cookie cookie, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object addCookie = cookiesStorage.addCookie(io.ktor.http.URLUtilsKt.Url(str), cookie, continuation);
        return addCookie == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? addCookie : kotlin.Unit.INSTANCE;
    }

    public static final boolean matches(io.ktor.http.Cookie cookie, io.ktor.http.Url url) {
        java.lang.String lowerCasePreservingASCIIRules;
        java.lang.String trimStart;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookie, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        java.lang.String domain = cookie.getDomain();
        if (domain == null || (lowerCasePreservingASCIIRules = io.ktor.util.TextKt.toLowerCasePreservingASCIIRules(domain)) == null || (trimStart = kotlin.text.StringsKt.trimStart(lowerCasePreservingASCIIRules, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR)) == null) {
            throw new java.lang.IllegalStateException("Domain field should have the default value".toString());
        }
        cookie.getPath();
        java.lang.String path = cookie.getPath();
        if (path == null) {
            throw new java.lang.IllegalStateException("Path field should have the default value".toString());
        }
        if (!kotlin.text.StringsKt.endsWith$default((java.lang.CharSequence) path, kotlinx.io.files.FileSystemKt.UnixPathSeparator, false, 2, (java.lang.Object) null)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(cookie.getPath());
            sb.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
            path = sb.toString();
        }
        java.lang.String lowerCasePreservingASCIIRules2 = io.ktor.util.TextKt.toLowerCasePreservingASCIIRules(url.getHost());
        java.lang.String encodedPath = url.getEncodedPath();
        if (!kotlin.text.StringsKt.endsWith$default((java.lang.CharSequence) encodedPath, kotlinx.io.files.FileSystemKt.UnixPathSeparator, false, 2, (java.lang.Object) null)) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(encodedPath);
            sb2.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
            encodedPath = sb2.toString();
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(lowerCasePreservingASCIIRules2, trimStart) && (io.ktor.http.IpParserKt.hostIsIp(lowerCasePreservingASCIIRules2) || !kotlin.text.StringsKt.endsWith$default(lowerCasePreservingASCIIRules2, ".".concat(java.lang.String.valueOf(trimStart)), false, 2, (java.lang.Object) null))) {
            return false;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(path, androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR) || kotlin.jvm.internal.Intrinsics.areEqual(encodedPath, path) || kotlin.text.StringsKt.startsWith$default(encodedPath, path, false, 2, (java.lang.Object) null)) {
            return !cookie.getSecure() || io.ktor.http.URLProtocolKt.isSecure(url.getProtocol());
        }
        return false;
    }

    public static final io.ktor.http.Cookie fillDefaults(io.ktor.http.Cookie cookie, io.ktor.http.Url url) {
        io.ktor.http.Cookie copy;
        io.ktor.http.Cookie copy2;
        io.ktor.http.Cookie cookie2 = cookie;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookie, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        java.lang.String path = cookie.getPath();
        if (path == null || !kotlin.text.StringsKt.startsWith$default(path, androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, false, 2, (java.lang.Object) null)) {
            copy = cookie.copy((r22 & 1) != 0 ? cookie.name : null, (r22 & 2) != 0 ? cookie.value : null, (r22 & 4) != 0 ? cookie.encoding : null, (r22 & 8) != 0 ? cookie.maxAge : null, (r22 & 16) != 0 ? cookie.expires : null, (r22 & 32) != 0 ? cookie.domain : null, (r22 & 64) != 0 ? cookie.path : url.getEncodedPath(), (r22 & 128) != 0 ? cookie.secure : false, (r22 & 256) != 0 ? cookie.httpOnly : false, (r22 & 512) != 0 ? cookie.extensions : null);
            cookie2 = copy;
        }
        java.lang.String domain = cookie2.getDomain();
        if (domain != null && !kotlin.text.StringsKt.isBlank(domain)) {
            return cookie2;
        }
        copy2 = cookie2.copy((r22 & 1) != 0 ? cookie2.name : null, (r22 & 2) != 0 ? cookie2.value : null, (r22 & 4) != 0 ? cookie2.encoding : null, (r22 & 8) != 0 ? cookie2.maxAge : null, (r22 & 16) != 0 ? cookie2.expires : null, (r22 & 32) != 0 ? cookie2.domain : url.getHost(), (r22 & 64) != 0 ? cookie2.path : null, (r22 & 128) != 0 ? cookie2.secure : false, (r22 & 256) != 0 ? cookie2.httpOnly : false, (r22 & 512) != 0 ? cookie2.extensions : null);
        return copy2;
    }
}
