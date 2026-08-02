package io.ktor.client.plugins.cache;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B5\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\u00020!8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%"}, d2 = {"Lio/ktor/client/plugins/cache/HttpCacheEntry;", "", "Lio/ktor/util/date/GMTDate;", "expires", "", "", "varyKeys", "Lio/ktor/client/statement/HttpResponse;", "response", "", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "<init>", "(Lio/ktor/util/date/GMTDate;Ljava/util/Map;Lio/ktor/client/statement/HttpResponse;[B)V", "produceResponse$ktor_client_core", "()Lio/ktor/client/statement/HttpResponse;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lio/ktor/util/date/GMTDate;", "getExpires", "()Lio/ktor/util/date/GMTDate;", "Ljava/util/Map;", "getVaryKeys", "()Ljava/util/Map;", "Lio/ktor/client/statement/HttpResponse;", "getResponse", "[B", "getBody", "()[B", "Lio/ktor/http/Headers;", "responseHeaders", "Lio/ktor/http/Headers;", "getResponseHeaders$ktor_client_core", "()Lio/ktor/http/Headers;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HttpCacheEntry {
    private final byte[] body;
    private final io.ktor.util.date.GMTDate expires;
    private final io.ktor.client.statement.HttpResponse response;
    private final io.ktor.http.Headers responseHeaders;
    private final java.util.Map<java.lang.String, java.lang.String> varyKeys;

    public HttpCacheEntry(io.ktor.util.date.GMTDate gMTDate, java.util.Map<java.lang.String, java.lang.String> map, io.ktor.client.statement.HttpResponse httpResponse, byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gMTDate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpResponse, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        this.expires = gMTDate;
        this.varyKeys = map;
        this.response = httpResponse;
        this.body = bArr;
        io.ktor.http.Headers.Companion companion = io.ktor.http.Headers.INSTANCE;
        io.ktor.http.HeadersBuilder headersBuilder = new io.ktor.http.HeadersBuilder(0, 1, null);
        headersBuilder.appendAll(httpResponse.getHeaders());
        this.responseHeaders = headersBuilder.build();
    }

    public final io.ktor.util.date.GMTDate getExpires() {
        return this.expires;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getVaryKeys() {
        return this.varyKeys;
    }

    public final io.ktor.client.statement.HttpResponse getResponse() {
        return this.response;
    }

    public final byte[] getBody() {
        return this.body;
    }

    /* renamed from: getResponseHeaders$ktor_client_core, reason: from getter */
    public final io.ktor.http.Headers getResponseHeaders() {
        return this.responseHeaders;
    }

    public final io.ktor.client.statement.HttpResponse produceResponse$ktor_client_core() {
        return new io.ktor.client.call.SavedHttpCall(this.response.getCall().getClient(), this.response.getCall().getRequest(), this.response, this.body).getResponse();
    }

    public final boolean equals(java.lang.Object other) {
        if (other == null || !(other instanceof io.ktor.client.plugins.cache.HttpCacheEntry)) {
            return false;
        }
        if (other == this) {
            return true;
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(this.varyKeys, ((io.ktor.client.plugins.cache.HttpCacheEntry) other).varyKeys);
    }

    public final int hashCode() {
        return this.varyKeys.hashCode();
    }
}
