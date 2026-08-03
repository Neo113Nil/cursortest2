package io.ktor.client.plugins.cookies;

/* compiled from: CookiesStorage.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a$\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\u000b\u001a\u00020\n*\u00020\u00032\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\r\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/client/plugins/cookies/CookiesStorage;", "", "urlString", "Lio/ktor/http/Cookie;", "cookie", "", "addCookie", "(Lio/ktor/client/plugins/cookies/CookiesStorage;Ljava/lang/String;Lio/ktor/http/Cookie;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/http/Url;", com.ironsource.mediationsdk.utils.IronSourceConstants.REQUEST_URL, "", "matches", "(Lio/ktor/http/Cookie;Lio/ktor/http/Url;)Z", "fillDefaults", "(Lio/ktor/http/Cookie;Lio/ktor/http/Url;)Lio/ktor/http/Cookie;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CookiesStorageKt {
    public static final java.lang.Object addCookie(io.ktor.client.plugins.cookies.CookiesStorage cookiesStorage, java.lang.String str, io.ktor.http.Cookie cookie, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object addCookie = cookiesStorage.addCookie(io.ktor.http.URLUtilsKt.Url(str), cookie, continuation);
        return addCookie == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? addCookie : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0091, code lost:
    
        if (kotlin.text.StringsKt.endsWith$default(r3, "." + r0, false, 2, (java.lang.Object) null) == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean matches(io.ktor.http.Cookie cookie, io.ktor.http.Url requestUrl) {
        java.lang.String lowerCasePreservingASCIIRules;
        java.lang.String trimStart;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookie, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestUrl, "requestUrl");
        java.lang.String domain = cookie.getDomain();
        if (domain == null || (lowerCasePreservingASCIIRules = io.ktor.util.TextKt.toLowerCasePreservingASCIIRules(domain)) == null || (trimStart = kotlin.text.StringsKt.trimStart(lowerCasePreservingASCIIRules, '.')) == null) {
            throw new java.lang.IllegalStateException("Domain field should have the default value".toString());
        }
        cookie.getPath();
        java.lang.String path = cookie.getPath();
        if (path == null) {
            throw new java.lang.IllegalStateException("Path field should have the default value".toString());
        }
        if (!kotlin.text.StringsKt.endsWith$default((java.lang.CharSequence) path, kotlinx.io.files.FileSystemKt.UnixPathSeparator, false, 2, (java.lang.Object) null)) {
            path = cookie.getPath() + kotlinx.io.files.FileSystemKt.UnixPathSeparator;
        }
        java.lang.String lowerCasePreservingASCIIRules2 = io.ktor.util.TextKt.toLowerCasePreservingASCIIRules(requestUrl.getHost());
        java.lang.String encodedPath = requestUrl.getEncodedPath();
        if (!kotlin.text.StringsKt.endsWith$default((java.lang.CharSequence) encodedPath, kotlinx.io.files.FileSystemKt.UnixPathSeparator, false, 2, (java.lang.Object) null)) {
            encodedPath = encodedPath + kotlinx.io.files.FileSystemKt.UnixPathSeparator;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(lowerCasePreservingASCIIRules2, trimStart)) {
            if (!io.ktor.http.IpParserKt.hostIsIp(lowerCasePreservingASCIIRules2)) {
            }
            return false;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(path, com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING) || kotlin.jvm.internal.Intrinsics.areEqual(encodedPath, path) || kotlin.text.StringsKt.startsWith$default(encodedPath, path, false, 2, (java.lang.Object) null)) {
            return !cookie.getSecure() || io.ktor.http.URLProtocolKt.isSecure(requestUrl.getProtocol());
        }
        return false;
    }

    public static final io.ktor.http.Cookie fillDefaults(io.ktor.http.Cookie cookie, io.ktor.http.Url requestUrl) {
        io.ktor.http.Cookie copy;
        io.ktor.http.Cookie copy2;
        io.ktor.http.Cookie cookie2 = cookie;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookie, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestUrl, "requestUrl");
        java.lang.String path = cookie.getPath();
        if (path == null || !kotlin.text.StringsKt.startsWith$default(path, com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING, false, 2, (java.lang.Object) null)) {
            copy = cookie.copy((r22 & 1) != 0 ? cookie.name : null, (r22 & 2) != 0 ? cookie.value : null, (r22 & 4) != 0 ? cookie.encoding : null, (r22 & 8) != 0 ? cookie.maxAge : null, (r22 & 16) != 0 ? cookie.expires : null, (r22 & 32) != 0 ? cookie.domain : null, (r22 & 64) != 0 ? cookie.path : requestUrl.getEncodedPath(), (r22 & 128) != 0 ? cookie.secure : false, (r22 & 256) != 0 ? cookie.httpOnly : false, (r22 & 512) != 0 ? cookie.extensions : null);
            cookie2 = copy;
        }
        java.lang.String domain = cookie2.getDomain();
        if (domain != null && !kotlin.text.StringsKt.isBlank(domain)) {
            return cookie2;
        }
        copy2 = cookie2.copy((r22 & 1) != 0 ? cookie2.name : null, (r22 & 2) != 0 ? cookie2.value : null, (r22 & 4) != 0 ? cookie2.encoding : null, (r22 & 8) != 0 ? cookie2.maxAge : null, (r22 & 16) != 0 ? cookie2.expires : null, (r22 & 32) != 0 ? cookie2.domain : requestUrl.getHost(), (r22 & 64) != 0 ? cookie2.path : null, (r22 & 128) != 0 ? cookie2.secure : false, (r22 & 256) != 0 ? cookie2.httpOnly : false, (r22 & 512) != 0 ? cookie2.extensions : null);
        return copy2;
    }
}
