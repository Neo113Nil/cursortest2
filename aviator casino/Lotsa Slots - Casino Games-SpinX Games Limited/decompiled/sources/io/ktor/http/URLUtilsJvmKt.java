package io.ktor.http;

/* compiled from: URLUtilsJvm.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007\u001a\u0011\u0010\t\u001a\u00020\u0001*\u00020\b¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/ktor/http/URLBuilder;", "Ljava/net/URI;", com.facebook.share.internal.ShareConstants.MEDIA_URI, "takeFrom", "(Lio/ktor/http/URLBuilder;Ljava/net/URI;)Lio/ktor/http/URLBuilder;", "Ljava/net/URL;", "url", "(Lio/ktor/http/URLBuilder;Ljava/net/URL;)Lio/ktor/http/URLBuilder;", "Lio/ktor/http/Url;", "toURI", "(Lio/ktor/http/Url;)Ljava/net/URI;", "Url", "(Ljava/net/URI;)Lio/ktor/http/Url;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class URLUtilsJvmKt {
    public static final io.ktor.http.URLBuilder takeFrom(io.ktor.http.URLBuilder uRLBuilder, java.net.URI uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        java.lang.String scheme = uri.getScheme();
        if (scheme != null) {
            uRLBuilder.setProtocol(io.ktor.http.URLProtocol.INSTANCE.createOrDefault(scheme));
            uRLBuilder.setPort(uRLBuilder.getProtocol().getDefaultPort());
        }
        if (uri.getPort() > 0) {
            uRLBuilder.setPort(uri.getPort());
        } else {
            java.lang.String scheme2 = uri.getScheme();
            if (kotlin.jvm.internal.Intrinsics.areEqual(scheme2, androidx.webkit.ProxyConfig.MATCH_HTTP)) {
                uRLBuilder.setPort(80);
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(scheme2, "https")) {
                uRLBuilder.setPort(443);
            }
        }
        if (uri.getRawUserInfo() != null) {
            java.lang.String rawUserInfo = uri.getRawUserInfo();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rawUserInfo, "getRawUserInfo(...)");
            if (rawUserInfo.length() > 0) {
                java.lang.String rawUserInfo2 = uri.getRawUserInfo();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rawUserInfo2, "getRawUserInfo(...)");
                java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) rawUserInfo2, new java.lang.String[]{":"}, false, 0, 6, (java.lang.Object) null);
                uRLBuilder.setEncodedUser((java.lang.String) kotlin.collections.CollectionsKt.first(split$default));
                uRLBuilder.setEncodedPassword((java.lang.String) kotlin.collections.CollectionsKt.getOrNull(split$default, 1));
            }
        }
        java.lang.String host = uri.getHost();
        if (host != null) {
            uRLBuilder.setHost(host);
        }
        java.lang.String rawPath = uri.getRawPath();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rawPath, "getRawPath(...)");
        io.ktor.http.URLBuilderKt.setEncodedPath(uRLBuilder, rawPath);
        java.lang.String rawQuery = uri.getRawQuery();
        if (rawQuery != null) {
            io.ktor.http.ParametersBuilder ParametersBuilder$default = io.ktor.http.ParametersKt.ParametersBuilder$default(0, 1, null);
            ParametersBuilder$default.appendAll(io.ktor.http.QueryKt.parseQueryString$default(rawQuery, 0, 0, false, 6, null));
            uRLBuilder.setEncodedParameters(ParametersBuilder$default);
        }
        java.lang.String query = uri.getQuery();
        if (query != null && query.length() == 0) {
            uRLBuilder.setTrailingQuery(true);
        }
        java.lang.String rawFragment = uri.getRawFragment();
        if (rawFragment != null) {
            uRLBuilder.setEncodedFragment(rawFragment);
        }
        return uRLBuilder;
    }

    public static final io.ktor.http.URLBuilder takeFrom(io.ktor.http.URLBuilder uRLBuilder, java.net.URL url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        java.lang.String host = url.getHost();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(host, "getHost(...)");
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) host, '_', false, 2, (java.lang.Object) null)) {
            java.lang.String url2 = url.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(url2, "toString(...)");
            return io.ktor.http.URLParserKt.takeFrom(uRLBuilder, url2);
        }
        java.net.URI uri = url.toURI();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri, "toURI(...)");
        return takeFrom(uRLBuilder, uri);
    }

    public static final java.net.URI toURI(io.ktor.http.Url url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "<this>");
        return new java.net.URI(url.getUrlString());
    }

    public static final io.ktor.http.Url Url(java.net.URI uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        return takeFrom(new io.ktor.http.URLBuilder(null, null, 0, null, null, null, null, null, false, androidx.core.app.FrameMetricsAggregator.EVERY_DURATION, null), uri).build();
    }
}
