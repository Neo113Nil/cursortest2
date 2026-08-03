package io.ktor.http;

/* compiled from: HttpMessageProperties.kt */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u000f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\r\u001a\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0010\u001a\u0019\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012*\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0015\u001a\u0004\u0018\u00010\n*\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017*\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u001d¢\u0006\u0004\b\u0004\u0010\u001e\u001a\u0019\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012*\u00020\u001d¢\u0006\u0004\b\u0013\u0010\u001f\u001a\u0013\u0010\u0015\u001a\u0004\u0018\u00010\n*\u00020\u001d¢\u0006\u0004\b\u0015\u0010 \u001a\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017*\u00020\u001d¢\u0006\u0004\b\u0018\u0010!\u001a\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u00020\u001d¢\u0006\u0004\b\u001b\u0010\"\u001a\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u0017*\u00020\u001d¢\u0006\u0004\b$\u0010!\u001a\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u0017*\u00020\u0000¢\u0006\u0004\b%\u0010\u0019\u001a\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0017*\u00020\u001d¢\u0006\u0004\b'\u0010!\u001a\u0019\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0\u0017*\u00020\nH\u0000¢\u0006\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lio/ktor/http/HttpMessageBuilder;", "Lio/ktor/http/ContentType;", "type", "", com.helpshift.HelpshiftEvent.DATA_CONTENT_TYPE, "(Lio/ktor/http/HttpMessageBuilder;Lio/ktor/http/ContentType;)V", "", "seconds", "maxAge", "(Lio/ktor/http/HttpMessageBuilder;I)V", "", "value", "ifNoneMatch", "(Lio/ktor/http/HttpMessageBuilder;Ljava/lang/String;)V", "content", "userAgent", "(Lio/ktor/http/HttpMessageBuilder;)Lio/ktor/http/ContentType;", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "charset", "(Lio/ktor/http/HttpMessageBuilder;)Ljava/nio/charset/Charset;", "etag", "(Lio/ktor/http/HttpMessageBuilder;)Ljava/lang/String;", "", "vary", "(Lio/ktor/http/HttpMessageBuilder;)Ljava/util/List;", "", "contentLength", "(Lio/ktor/http/HttpMessageBuilder;)Ljava/lang/Long;", "Lio/ktor/http/HttpMessage;", "(Lio/ktor/http/HttpMessage;)Lio/ktor/http/ContentType;", "(Lio/ktor/http/HttpMessage;)Ljava/nio/charset/Charset;", "(Lio/ktor/http/HttpMessage;)Ljava/lang/String;", "(Lio/ktor/http/HttpMessage;)Ljava/util/List;", "(Lio/ktor/http/HttpMessage;)Ljava/lang/Long;", "Lio/ktor/http/Cookie;", "setCookie", "cookies", "Lio/ktor/http/HeaderValue;", "cacheControl", "splitSetCookieHeader", "(Ljava/lang/String;)Ljava/util/List;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpMessagePropertiesKt {
    public static final void contentType(io.ktor.http.HttpMessageBuilder httpMessageBuilder, io.ktor.http.ContentType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        httpMessageBuilder.getHeaders().set(io.ktor.http.HttpHeaders.INSTANCE.getContentType(), type.toString());
    }

    public static final void maxAge(io.ktor.http.HttpMessageBuilder httpMessageBuilder, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        httpMessageBuilder.getHeaders().append(io.ktor.http.HttpHeaders.INSTANCE.getCacheControl(), "max-age=" + i);
    }

    public static final void ifNoneMatch(io.ktor.http.HttpMessageBuilder httpMessageBuilder, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        httpMessageBuilder.getHeaders().set(io.ktor.http.HttpHeaders.INSTANCE.getIfNoneMatch(), value);
    }

    public static final void userAgent(io.ktor.http.HttpMessageBuilder httpMessageBuilder, java.lang.String content) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        httpMessageBuilder.getHeaders().set(io.ktor.http.HttpHeaders.INSTANCE.getUserAgent(), content);
    }

    public static final io.ktor.http.ContentType contentType(io.ktor.http.HttpMessageBuilder httpMessageBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        java.lang.String str = httpMessageBuilder.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getContentType());
        if (str != null) {
            return io.ktor.http.ContentType.INSTANCE.parse(str);
        }
        return null;
    }

    public static final java.nio.charset.Charset charset(io.ktor.http.HttpMessageBuilder httpMessageBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        io.ktor.http.ContentType contentType = contentType(httpMessageBuilder);
        if (contentType != null) {
            return io.ktor.http.ContentTypesKt.charset(contentType);
        }
        return null;
    }

    public static final java.lang.String etag(io.ktor.http.HttpMessageBuilder httpMessageBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        return httpMessageBuilder.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getETag());
    }

    public static final java.util.List<java.lang.String> vary(io.ktor.http.HttpMessageBuilder httpMessageBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        java.util.List<java.lang.String> all = httpMessageBuilder.getHeaders().getAll(io.ktor.http.HttpHeaders.INSTANCE.getVary());
        if (all == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = all.iterator();
        while (it.hasNext()) {
            java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) it.next(), new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(split$default, 10));
            java.util.Iterator it2 = split$default.iterator();
            while (it2.hasNext()) {
                arrayList2.add(kotlin.text.StringsKt.trim((java.lang.CharSequence) it2.next()).toString());
            }
            kotlin.collections.CollectionsKt.addAll(arrayList, arrayList2);
        }
        return arrayList;
    }

    public static final java.lang.Long contentLength(io.ktor.http.HttpMessageBuilder httpMessageBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        java.lang.String str = httpMessageBuilder.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getContentLength());
        if (str != null) {
            return java.lang.Long.valueOf(java.lang.Long.parseLong(str));
        }
        return null;
    }

    public static final io.ktor.http.ContentType contentType(io.ktor.http.HttpMessage httpMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMessage, "<this>");
        java.lang.String str = httpMessage.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getContentType());
        if (str != null) {
            return io.ktor.http.ContentType.INSTANCE.parse(str);
        }
        return null;
    }

    public static final java.nio.charset.Charset charset(io.ktor.http.HttpMessage httpMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMessage, "<this>");
        io.ktor.http.ContentType contentType = contentType(httpMessage);
        if (contentType != null) {
            return io.ktor.http.ContentTypesKt.charset(contentType);
        }
        return null;
    }

    public static final java.lang.String etag(io.ktor.http.HttpMessage httpMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMessage, "<this>");
        return httpMessage.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getETag());
    }

    public static final java.util.List<java.lang.String> vary(io.ktor.http.HttpMessage httpMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMessage, "<this>");
        java.util.List<java.lang.String> all = httpMessage.getHeaders().getAll(io.ktor.http.HttpHeaders.INSTANCE.getVary());
        if (all == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = all.iterator();
        while (it.hasNext()) {
            java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) it.next(), new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(split$default, 10));
            java.util.Iterator it2 = split$default.iterator();
            while (it2.hasNext()) {
                arrayList2.add(kotlin.text.StringsKt.trim((java.lang.CharSequence) it2.next()).toString());
            }
            kotlin.collections.CollectionsKt.addAll(arrayList, arrayList2);
        }
        return arrayList;
    }

    public static final java.lang.Long contentLength(io.ktor.http.HttpMessage httpMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMessage, "<this>");
        java.lang.String str = httpMessage.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getContentLength());
        if (str != null) {
            return java.lang.Long.valueOf(java.lang.Long.parseLong(str));
        }
        return null;
    }

    public static final java.util.List<io.ktor.http.Cookie> setCookie(io.ktor.http.HttpMessage httpMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMessage, "<this>");
        java.util.List<java.lang.String> all = httpMessage.getHeaders().getAll(io.ktor.http.HttpHeaders.INSTANCE.getSetCookie());
        if (all == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = all.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList, splitSetCookieHeader((java.lang.String) it.next()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        java.util.Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(io.ktor.http.CookieKt.parseServerSetCookieHeader((java.lang.String) it2.next()));
        }
        return arrayList3;
    }

    public static final java.util.List<io.ktor.http.Cookie> cookies(io.ktor.http.HttpMessageBuilder httpMessageBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        java.util.List<java.lang.String> all = httpMessageBuilder.getHeaders().getAll(io.ktor.http.HttpHeaders.INSTANCE.getSetCookie());
        if (all == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List<java.lang.String> list = all;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(io.ktor.http.CookieKt.parseServerSetCookieHeader((java.lang.String) it.next()));
        }
        return arrayList;
    }

    public static final java.util.List<io.ktor.http.HeaderValue> cacheControl(io.ktor.http.HttpMessage httpMessage) {
        java.util.List<io.ktor.http.HeaderValue> parseHeaderValue;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMessage, "<this>");
        java.lang.String str = httpMessage.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getCacheControl());
        return (str == null || (parseHeaderValue = io.ktor.http.HttpHeaderValueParserKt.parseHeaderValue(str)) == null) ? kotlin.collections.CollectionsKt.emptyList() : parseHeaderValue;
    }

    public static final java.util.List<java.lang.String> splitSetCookieHeader(java.lang.String str) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        java.lang.String str2 = str;
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str2, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA, 0, false, 6, (java.lang.Object) null);
        if (indexOf$default == -1) {
            return kotlin.collections.CollectionsKt.listOf(str);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int indexOf$default2 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str2, com.ironsource.B5.U, indexOf$default, false, 4, (java.lang.Object) null);
        int i2 = indexOf$default;
        int indexOf$default3 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str2, ';', indexOf$default, false, 4, (java.lang.Object) null);
        int i3 = indexOf$default2;
        int i4 = 0;
        while (i4 < str.length() && i2 > 0) {
            if (i3 < i2) {
                i3 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str2, com.ironsource.B5.U, i2, false, 4, (java.lang.Object) null);
            }
            int i5 = i3;
            int indexOf$default4 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str2, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA, i2 + 1, false, 4, (java.lang.Object) null);
            while (true) {
                i = i2;
                i2 = indexOf$default4;
                if (i2 < 0 || i2 >= i5) {
                    break;
                }
                indexOf$default4 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str2, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA, i2 + 1, false, 4, (java.lang.Object) null);
            }
            if (indexOf$default3 < i) {
                indexOf$default3 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str2, ';', i, false, 4, (java.lang.Object) null);
            }
            if (i5 < 0) {
                java.lang.String substring = str.substring(i4);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                arrayList.add(substring);
                return arrayList;
            }
            if (indexOf$default3 == -1 || indexOf$default3 > i5) {
                java.lang.String substring2 = str.substring(i4, i);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                arrayList.add(substring2);
                i4 = i + 1;
            }
            i3 = i5;
        }
        if (i4 < str.length()) {
            java.lang.String substring3 = str.substring(i4);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
            arrayList.add(substring3);
        }
        return arrayList;
    }
}
