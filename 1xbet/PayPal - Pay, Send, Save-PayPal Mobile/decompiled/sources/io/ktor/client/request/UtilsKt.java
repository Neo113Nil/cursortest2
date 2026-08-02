package io.ktor.client.request;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a{\u0010\u0014\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001a#\u0010\u0017\u001a\u00020\u0005*\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0019\u0010\u001b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001c\u001a!\u0010\u001f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0001¢\u0006\u0004\b\u001f\u0010 \u001a\u0019\u0010\"\u001a\u00020\u0005*\u00020\u00002\u0006\u0010!\u001a\u00020\u0001¢\u0006\u0004\b\"\u0010#\"(\u0010(\u001a\u00020\u0001*\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00018G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'\"(\u0010-\u001a\u00020\t*\u00020\u00162\u0006\u0010\u0004\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,"}, d2 = {"Lio/ktor/http/HttpMessageBuilder;", "", "key", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, "(Lio/ktor/http/HttpMessageBuilder;Ljava/lang/String;Ljava/lang/Object;)V", "name", "", "maxAge", "Lio/ktor/util/date/GMTDate;", "expires", "domain", "path", "", "secure", "httpOnly", "", com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS, "cookie", "(Lio/ktor/http/HttpMessageBuilder;Ljava/lang/String;Ljava/lang/String;ILio/ktor/util/date/GMTDate;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;)V", "Lio/ktor/client/request/HttpRequestBuilder;", "parameter", "(Lio/ktor/client/request/HttpRequestBuilder;Ljava/lang/String;Ljava/lang/Object;)V", "Lio/ktor/http/ContentType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "accept", "(Lio/ktor/http/HttpMessageBuilder;Lio/ktor/http/ContentType;)V", androidx.autofill.HintConstants.AUTOFILL_HINT_USERNAME, "password", "basicAuth", "(Lio/ktor/http/HttpMessageBuilder;Ljava/lang/String;Ljava/lang/String;)V", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "bearerAuth", "(Lio/ktor/http/HttpMessageBuilder;Ljava/lang/String;)V", "getHost", "(Lio/ktor/client/request/HttpRequestBuilder;)Ljava/lang/String;", "setHost", "(Lio/ktor/client/request/HttpRequestBuilder;Ljava/lang/String;)V", com.datadog.android.log.LogAttributes.HOST, "getPort", "(Lio/ktor/client/request/HttpRequestBuilder;)I", "setPort", "(Lio/ktor/client/request/HttpRequestBuilder;I)V", "port"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UtilsKt {
    public static final java.lang.String getHost(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return httpRequestBuilder.getUrl().getHost();
    }

    public static final void setHost(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        httpRequestBuilder.getUrl().setHost(str);
    }

    public static final int getPort(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return httpRequestBuilder.getUrl().getPort();
    }

    public static final void setPort(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        httpRequestBuilder.getUrl().setPort(i);
    }

    public static final void header(io.ktor.http.HttpMessageBuilder httpMessageBuilder, java.lang.String str, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMessageBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (obj != null) {
            httpMessageBuilder.getHeaders().append(str, obj.toString());
        }
    }

    public static final void cookie(io.ktor.http.HttpMessageBuilder httpMessageBuilder, java.lang.String str, java.lang.String str2, int i, io.ktor.util.date.GMTDate gMTDate, java.lang.String str3, java.lang.String str4, boolean z, boolean z2, java.util.Map<java.lang.String, java.lang.String> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMessageBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        java.lang.String renderCookieHeader = io.ktor.http.CookieKt.renderCookieHeader(new io.ktor.http.Cookie(str, str2, (io.ktor.http.CookieEncoding) null, java.lang.Integer.valueOf(i), gMTDate, str3, str4, z, z2, map, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        if (!httpMessageBuilder.getHeaders().contains(io.ktor.http.HttpHeaders.INSTANCE.getCookie())) {
            httpMessageBuilder.getHeaders().append(io.ktor.http.HttpHeaders.INSTANCE.getCookie(), renderCookieHeader);
            return;
        }
        io.ktor.http.HeadersBuilder headers = httpMessageBuilder.getHeaders();
        java.lang.String cookie = io.ktor.http.HttpHeaders.INSTANCE.getCookie();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(httpMessageBuilder.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getCookie()));
        sb.append("; ");
        sb.append(renderCookieHeader);
        headers.set(cookie, sb.toString());
    }

    public static final void parameter(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, java.lang.String str, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (obj != null) {
            httpRequestBuilder.getUrl().getParameters().append(str, obj.toString());
        }
    }

    public static final void accept(io.ktor.http.HttpMessageBuilder httpMessageBuilder, io.ktor.http.ContentType contentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMessageBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "");
        httpMessageBuilder.getHeaders().append(io.ktor.http.HttpHeaders.INSTANCE.getAccept(), contentType.toString());
    }

    public static final void basicAuth(io.ktor.http.HttpMessageBuilder httpMessageBuilder, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMessageBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String authorization = io.ktor.http.HttpHeaders.INSTANCE.getAuthorization();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Basic ");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str);
        sb2.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        sb2.append(str2);
        sb.append(io.ktor.util.Base64Kt.encodeBase64(sb2.toString()));
        header(httpMessageBuilder, authorization, sb.toString());
    }

    public static final void bearerAuth(io.ktor.http.HttpMessageBuilder httpMessageBuilder, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMessageBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        header(httpMessageBuilder, io.ktor.http.HttpHeaders.INSTANCE.getAuthorization(), "Bearer ".concat(java.lang.String.valueOf(str)));
    }
}
