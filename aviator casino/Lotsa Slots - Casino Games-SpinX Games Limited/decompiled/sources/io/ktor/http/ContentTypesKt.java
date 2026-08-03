package io.ktor.http;

/* compiled from: ContentTypes.kt */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0019\u0010\u0003\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002*\u00020\u0007¢\u0006\u0004\b\u0003\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/http/ContentType;", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "charset", "withCharset", "(Lio/ktor/http/ContentType;Ljava/nio/charset/Charset;)Lio/ktor/http/ContentType;", "withCharsetIfNeeded", "Lio/ktor/http/HeaderValueWithParameters;", "(Lio/ktor/http/HeaderValueWithParameters;)Ljava/nio/charset/Charset;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ContentTypesKt {
    public static final io.ktor.http.ContentType withCharset(io.ktor.http.ContentType contentType, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        return contentType.withParameter("charset", io.ktor.utils.io.charsets.CharsetJVMKt.getName(charset));
    }

    public static final io.ktor.http.ContentType withCharsetIfNeeded(io.ktor.http.ContentType contentType, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        java.lang.String lowerCase = contentType.getContentType().toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return !kotlin.jvm.internal.Intrinsics.areEqual(lowerCase, "text") ? contentType : contentType.withParameter("charset", io.ktor.utils.io.charsets.CharsetJVMKt.getName(charset));
    }

    public static final java.nio.charset.Charset charset(io.ktor.http.HeaderValueWithParameters headerValueWithParameters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerValueWithParameters, "<this>");
        java.lang.String parameter = headerValueWithParameters.parameter("charset");
        if (parameter == null) {
            return null;
        }
        try {
            return io.ktor.utils.io.charsets.CharsetJVMKt.forName(kotlin.text.Charsets.INSTANCE, parameter);
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }
}
