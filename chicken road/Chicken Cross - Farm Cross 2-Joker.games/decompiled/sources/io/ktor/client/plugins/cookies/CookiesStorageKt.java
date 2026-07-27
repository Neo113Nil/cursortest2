package io.ktor.client.plugins.cookies;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.ktor.http.Cookie;
import io.ktor.http.IpParserKt;
import io.ktor.http.URLProtocolKt;
import io.ktor.http.URLUtilsKt;
import io.ktor.http.Url;
import io.ktor.util.TextKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.io.files.FileSystemKt;

/* compiled from: CookiesStorage.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a$\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\u000b\u001a\u00020\n*\u00020\u00032\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\r\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/client/plugins/cookies/CookiesStorage;", "", "urlString", "Lio/ktor/http/Cookie;", "cookie", "", "addCookie", "(Lio/ktor/client/plugins/cookies/CookiesStorage;Ljava/lang/String;Lio/ktor/http/Cookie;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/http/Url;", IronSourceConstants.REQUEST_URL, "", "matches", "(Lio/ktor/http/Cookie;Lio/ktor/http/Url;)Z", "fillDefaults", "(Lio/ktor/http/Cookie;Lio/ktor/http/Url;)Lio/ktor/http/Cookie;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CookiesStorageKt {
    public static final Object addCookie(CookiesStorage cookiesStorage, String str, Cookie cookie, Continuation<? super Unit> continuation) {
        Object addCookie = cookiesStorage.addCookie(URLUtilsKt.Url(str), cookie, continuation);
        return addCookie == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? addCookie : Unit.INSTANCE;
    }

    public static final boolean matches(Cookie cookie, Url requestUrl) {
        String lowerCasePreservingASCIIRules;
        String trimStart;
        Intrinsics.checkNotNullParameter(cookie, "<this>");
        Intrinsics.checkNotNullParameter(requestUrl, "requestUrl");
        String domain = cookie.getDomain();
        if (domain == null || (lowerCasePreservingASCIIRules = TextKt.toLowerCasePreservingASCIIRules(domain)) == null || (trimStart = StringsKt.trimStart(lowerCasePreservingASCIIRules, '.')) == null) {
            throw new IllegalStateException("Domain field should have the default value".toString());
        }
        cookie.getPath();
        String path = cookie.getPath();
        if (path == null) {
            throw new IllegalStateException("Path field should have the default value".toString());
        }
        if (!StringsKt.endsWith$default((CharSequence) path, FileSystemKt.UnixPathSeparator, false, 2, (Object) null)) {
            path = cookie.getPath() + FileSystemKt.UnixPathSeparator;
        }
        String lowerCasePreservingASCIIRules2 = TextKt.toLowerCasePreservingASCIIRules(requestUrl.getHost());
        String encodedPath = requestUrl.getEncodedPath();
        if (!StringsKt.endsWith$default((CharSequence) encodedPath, FileSystemKt.UnixPathSeparator, false, 2, (Object) null)) {
            encodedPath = encodedPath + FileSystemKt.UnixPathSeparator;
        }
        if (!Intrinsics.areEqual(lowerCasePreservingASCIIRules2, trimStart) && (IpParserKt.hostIsIp(lowerCasePreservingASCIIRules2) || !StringsKt.endsWith$default(lowerCasePreservingASCIIRules2, "." + trimStart, false, 2, (Object) null))) {
            return false;
        }
        if (Intrinsics.areEqual(path, "/") || Intrinsics.areEqual(encodedPath, path) || StringsKt.startsWith$default(encodedPath, path, false, 2, (Object) null)) {
            return !cookie.getSecure() || URLProtocolKt.isSecure(requestUrl.getProtocol());
        }
        return false;
    }

    public static final Cookie fillDefaults(Cookie cookie, Url requestUrl) {
        Cookie copy;
        Cookie copy2;
        Cookie cookie2 = cookie;
        Intrinsics.checkNotNullParameter(cookie, "<this>");
        Intrinsics.checkNotNullParameter(requestUrl, "requestUrl");
        String path = cookie.getPath();
        if (path == null || !StringsKt.startsWith$default(path, "/", false, 2, (Object) null)) {
            copy = cookie.copy((r22 & 1) != 0 ? cookie.name : null, (r22 & 2) != 0 ? cookie.value : null, (r22 & 4) != 0 ? cookie.encoding : null, (r22 & 8) != 0 ? cookie.maxAge : null, (r22 & 16) != 0 ? cookie.expires : null, (r22 & 32) != 0 ? cookie.domain : null, (r22 & 64) != 0 ? cookie.path : requestUrl.getEncodedPath(), (r22 & 128) != 0 ? cookie.secure : false, (r22 & 256) != 0 ? cookie.httpOnly : false, (r22 & 512) != 0 ? cookie.extensions : null);
            cookie2 = copy;
        }
        String domain = cookie2.getDomain();
        if (domain != null && !StringsKt.isBlank(domain)) {
            return cookie2;
        }
        copy2 = cookie2.copy((r22 & 1) != 0 ? cookie2.name : null, (r22 & 2) != 0 ? cookie2.value : null, (r22 & 4) != 0 ? cookie2.encoding : null, (r22 & 8) != 0 ? cookie2.maxAge : null, (r22 & 16) != 0 ? cookie2.expires : null, (r22 & 32) != 0 ? cookie2.domain : requestUrl.getHost(), (r22 & 64) != 0 ? cookie2.path : null, (r22 & 128) != 0 ? cookie2.secure : false, (r22 & 256) != 0 ? cookie2.httpOnly : false, (r22 & 512) != 0 ? cookie2.extensions : null);
        return copy2;
    }
}
