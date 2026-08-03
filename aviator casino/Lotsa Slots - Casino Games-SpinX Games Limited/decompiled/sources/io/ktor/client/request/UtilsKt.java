package io.ktor.client.request;

/* compiled from: utils.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a{\u0010\u0014\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001a#\u0010\u0017\u001a\u00020\u0005*\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0019\u0010\u001b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001c\u001a!\u0010\u001f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0001¢\u0006\u0004\b\u001f\u0010 \u001a\u0019\u0010\"\u001a\u00020\u0005*\u00020\u00002\u0006\u0010!\u001a\u00020\u0001¢\u0006\u0004\b\"\u0010#\"(\u0010(\u001a\u00020\u0001*\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'\"(\u0010-\u001a\u00020\t*\u00020\u00162\u0006\u0010\u0004\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006."}, d2 = {"Lio/ktor/http/HttpMessageBuilder;", "", com.ironsource.X3.i.W, "", "value", "", "header", "(Lio/ktor/http/HttpMessageBuilder;Ljava/lang/String;Ljava/lang/Object;)V", "name", "", "maxAge", "Lio/ktor/util/date/GMTDate;", "expires", com.ironsource.X3.j.D, "path", "", "secure", "httpOnly", "", "extensions", "cookie", "(Lio/ktor/http/HttpMessageBuilder;Ljava/lang/String;Ljava/lang/String;ILio/ktor/util/date/GMTDate;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;)V", "Lio/ktor/client/request/HttpRequestBuilder;", com.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "(Lio/ktor/client/request/HttpRequestBuilder;Ljava/lang/String;Ljava/lang/Object;)V", "Lio/ktor/http/ContentType;", com.helpshift.HelpshiftEvent.DATA_CONTENT_TYPE, "accept", "(Lio/ktor/http/HttpMessageBuilder;Lio/ktor/http/ContentType;)V", androidx.autofill.HintConstants.AUTOFILL_HINT_USERNAME, androidx.autofill.HintConstants.AUTOFILL_HINT_PASSWORD, "basicAuth", "(Lio/ktor/http/HttpMessageBuilder;Ljava/lang/String;Ljava/lang/String;)V", "token", "bearerAuth", "(Lio/ktor/http/HttpMessageBuilder;Ljava/lang/String;)V", "getHost", "(Lio/ktor/client/request/HttpRequestBuilder;)Ljava/lang/String;", "setHost", "(Lio/ktor/client/request/HttpRequestBuilder;Ljava/lang/String;)V", "host", "getPort", "(Lio/ktor/client/request/HttpRequestBuilder;)I", "setPort", "(Lio/ktor/client/request/HttpRequestBuilder;I)V", "port", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UtilsKt {
    public static final java.lang.String getHost(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return httpRequestBuilder.getUrl().getHost();
    }

    public static final void setHost(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        httpRequestBuilder.getUrl().setHost(value);
    }

    public static final int getPort(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return httpRequestBuilder.getUrl().getPort();
    }

    public static final void setPort(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        httpRequestBuilder.getUrl().setPort(i);
    }

    public static final void header(io.ktor.http.HttpMessageBuilder httpMessageBuilder, java.lang.String key, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        if (obj != null) {
            httpMessageBuilder.getHeaders().append(key, obj.toString());
        }
    }

    public static final void cookie(io.ktor.http.HttpMessageBuilder httpMessageBuilder, java.lang.String name, java.lang.String value, int i, io.ktor.util.date.GMTDate gMTDate, java.lang.String str, java.lang.String str2, boolean z, boolean z2, java.util.Map<java.lang.String, java.lang.String> extensions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensions, "extensions");
        java.lang.String renderCookieHeader = io.ktor.http.CookieKt.renderCookieHeader(new io.ktor.http.Cookie(name, value, (io.ktor.http.CookieEncoding) null, java.lang.Integer.valueOf(i), gMTDate, str, str2, z, z2, extensions, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        if (!httpMessageBuilder.getHeaders().contains(io.ktor.http.HttpHeaders.INSTANCE.getCookie())) {
            httpMessageBuilder.getHeaders().append(io.ktor.http.HttpHeaders.INSTANCE.getCookie(), renderCookieHeader);
            return;
        }
        httpMessageBuilder.getHeaders().set(io.ktor.http.HttpHeaders.INSTANCE.getCookie(), httpMessageBuilder.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getCookie()) + "; " + renderCookieHeader);
    }

    public static final void parameter(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, java.lang.String key, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        if (obj != null) {
            httpRequestBuilder.getUrl().getParameters().append(key, obj.toString());
        }
    }

    public static final void accept(io.ktor.http.HttpMessageBuilder httpMessageBuilder, io.ktor.http.ContentType contentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "contentType");
        httpMessageBuilder.getHeaders().append(io.ktor.http.HttpHeaders.INSTANCE.getAccept(), contentType.toString());
    }

    public static final void basicAuth(io.ktor.http.HttpMessageBuilder httpMessageBuilder, java.lang.String username, java.lang.String password) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(username, "username");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(password, "password");
        java.lang.String authorization = io.ktor.http.HttpHeaders.INSTANCE.getAuthorization();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Basic ");
        sb.append(io.ktor.util.Base64Kt.encodeBase64(username + kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON + password));
        header(httpMessageBuilder, authorization, sb.toString());
    }

    public static final void bearerAuth(io.ktor.http.HttpMessageBuilder httpMessageBuilder, java.lang.String token) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "token");
        header(httpMessageBuilder, io.ktor.http.HttpHeaders.INSTANCE.getAuthorization(), "Bearer " + token);
    }
}
