package io.ktor.client.plugins.cache.storage;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001c\u001a\u00020\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b'\u0010&R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u000b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b+\u0010&R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\u0012\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b3\u00104"}, d2 = {"Lio/ktor/client/plugins/cache/storage/CachedResponseData;", "", "Lio/ktor/http/Url;", "url", "Lio/ktor/http/HttpStatusCode;", "statusCode", "Lio/ktor/util/date/GMTDate;", "requestTime", "responseTime", "Lio/ktor/http/HttpProtocolVersion;", "version", "expires", "Lio/ktor/http/Headers;", "headers", "", "", "varyKeys", "", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "<init>", "(Lio/ktor/http/Url;Lio/ktor/http/HttpStatusCode;Lio/ktor/util/date/GMTDate;Lio/ktor/util/date/GMTDate;Lio/ktor/http/HttpProtocolVersion;Lio/ktor/util/date/GMTDate;Lio/ktor/http/Headers;Ljava/util/Map;[B)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "copy$ktor_client_core", "(Ljava/util/Map;Lio/ktor/util/date/GMTDate;)Lio/ktor/client/plugins/cache/storage/CachedResponseData;", "Lio/ktor/http/Url;", "getUrl", "()Lio/ktor/http/Url;", "Lio/ktor/http/HttpStatusCode;", "getStatusCode", "()Lio/ktor/http/HttpStatusCode;", "Lio/ktor/util/date/GMTDate;", "getRequestTime", "()Lio/ktor/util/date/GMTDate;", "getResponseTime", "Lio/ktor/http/HttpProtocolVersion;", "getVersion", "()Lio/ktor/http/HttpProtocolVersion;", "getExpires", "Lio/ktor/http/Headers;", "getHeaders", "()Lio/ktor/http/Headers;", "Ljava/util/Map;", "getVaryKeys", "()Ljava/util/Map;", "[B", "getBody", "()[B"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CachedResponseData {
    private final byte[] body;
    private final io.ktor.util.date.GMTDate expires;
    private final io.ktor.http.Headers headers;
    private final io.ktor.util.date.GMTDate requestTime;
    private final io.ktor.util.date.GMTDate responseTime;
    private final io.ktor.http.HttpStatusCode statusCode;
    private final io.ktor.http.Url url;
    private final java.util.Map<java.lang.String, java.lang.String> varyKeys;
    private final io.ktor.http.HttpProtocolVersion version;

    public CachedResponseData(io.ktor.http.Url url, io.ktor.http.HttpStatusCode httpStatusCode, io.ktor.util.date.GMTDate gMTDate, io.ktor.util.date.GMTDate gMTDate2, io.ktor.http.HttpProtocolVersion httpProtocolVersion, io.ktor.util.date.GMTDate gMTDate3, io.ktor.http.Headers headers, java.util.Map<java.lang.String, java.lang.String> map, byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpStatusCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gMTDate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gMTDate2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpProtocolVersion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gMTDate3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        this.url = url;
        this.statusCode = httpStatusCode;
        this.requestTime = gMTDate;
        this.responseTime = gMTDate2;
        this.version = httpProtocolVersion;
        this.expires = gMTDate3;
        this.headers = headers;
        this.varyKeys = map;
        this.body = bArr;
    }

    public final io.ktor.http.Url getUrl() {
        return this.url;
    }

    public final io.ktor.http.HttpStatusCode getStatusCode() {
        return this.statusCode;
    }

    public final io.ktor.util.date.GMTDate getRequestTime() {
        return this.requestTime;
    }

    public final io.ktor.util.date.GMTDate getResponseTime() {
        return this.responseTime;
    }

    public final io.ktor.http.HttpProtocolVersion getVersion() {
        return this.version;
    }

    public final io.ktor.util.date.GMTDate getExpires() {
        return this.expires;
    }

    public final io.ktor.http.Headers getHeaders() {
        return this.headers;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getVaryKeys() {
        return this.varyKeys;
    }

    public final byte[] getBody() {
        return this.body;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.ktor.client.plugins.cache.storage.CachedResponseData)) {
            return false;
        }
        io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData = (io.ktor.client.plugins.cache.storage.CachedResponseData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.url, cachedResponseData.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.varyKeys, cachedResponseData.varyKeys);
    }

    public final int hashCode() {
        return (this.url.hashCode() * 31) + this.varyKeys.hashCode();
    }

    public final io.ktor.client.plugins.cache.storage.CachedResponseData copy$ktor_client_core(java.util.Map<java.lang.String, java.lang.String> varyKeys, io.ktor.util.date.GMTDate expires) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(varyKeys, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expires, "");
        return new io.ktor.client.plugins.cache.storage.CachedResponseData(this.url, this.statusCode, this.requestTime, this.responseTime, this.version, expires, this.headers, varyKeys, this.body);
    }
}
