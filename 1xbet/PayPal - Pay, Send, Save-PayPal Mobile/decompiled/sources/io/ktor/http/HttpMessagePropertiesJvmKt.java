package io.ktor.http;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\t¢\u0006\u0004\b\u0006\u0010\n\u001a\u0013\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\t¢\u0006\u0004\b\b\u0010\n\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\t¢\u0006\u0004\b\u0002\u0010\n"}, d2 = {"Lio/ktor/http/HttpMessageBuilder;", "Ljava/util/Date;", "date", "", "ifModifiedSince", "(Lio/ktor/http/HttpMessageBuilder;Ljava/util/Date;)V", "lastModified", "(Lio/ktor/http/HttpMessageBuilder;)Ljava/util/Date;", "expires", "Lio/ktor/http/HttpMessage;", "(Lio/ktor/http/HttpMessage;)Ljava/util/Date;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HttpMessagePropertiesJvmKt {
    public static final void ifModifiedSince(io.ktor.http.HttpMessageBuilder httpMessageBuilder, java.util.Date date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMessageBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
        io.ktor.http.HeadersBuilder headers = httpMessageBuilder.getHeaders();
        java.lang.String ifModifiedSince = io.ktor.http.HttpHeaders.INSTANCE.getIfModifiedSince();
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", java.util.Locale.US);
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("GMT"));
        java.lang.String format = simpleDateFormat.format(date);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        headers.set(ifModifiedSince, format);
    }

    public static final java.util.Date lastModified(io.ktor.http.HttpMessageBuilder httpMessageBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMessageBuilder, "");
        java.lang.String str = httpMessageBuilder.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getLastModified());
        if (str == null) {
            return null;
        }
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", java.util.Locale.US);
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("GMT"));
        java.util.Date parse = simpleDateFormat.parse(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "");
        return parse;
    }

    public static final java.util.Date expires(io.ktor.http.HttpMessageBuilder httpMessageBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMessageBuilder, "");
        java.lang.String str = httpMessageBuilder.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getExpires());
        if (str == null) {
            return null;
        }
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", java.util.Locale.US);
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("GMT"));
        java.util.Date parse = simpleDateFormat.parse(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "");
        return parse;
    }

    public static final java.util.Date lastModified(io.ktor.http.HttpMessage httpMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMessage, "");
        java.lang.String str = httpMessage.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getLastModified());
        if (str == null) {
            return null;
        }
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", java.util.Locale.US);
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("GMT"));
        java.util.Date parse = simpleDateFormat.parse(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "");
        return parse;
    }

    public static final java.util.Date expires(io.ktor.http.HttpMessage httpMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMessage, "");
        java.lang.String str = httpMessage.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getExpires());
        if (str == null) {
            return null;
        }
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", java.util.Locale.US);
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("GMT"));
        java.util.Date parse = simpleDateFormat.parse(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "");
        return parse;
    }

    public static final java.util.Date date(io.ktor.http.HttpMessage httpMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMessage, "");
        java.lang.String str = httpMessage.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getDate());
        if (str == null) {
            return null;
        }
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", java.util.Locale.US);
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("GMT"));
        java.util.Date parse = simpleDateFormat.parse(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "");
        return parse;
    }
}
