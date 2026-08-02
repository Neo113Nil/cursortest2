package okhttp3;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001>B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0004\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\t\u0010\u0013J\u001e\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0014\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0019\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0014*\u00020\u00012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0019\u0010\u0016J%\u0010\u0019\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00142\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001b¢\u0006\u0004\b\u0019\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\nH\u0007¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\bH\u0007¢\u0006\u0004\b#\u0010$J\u0011\u0010%\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\nH\u0016¢\u0006\u0004\b*\u0010\"J\u0017\u0010-\u001a\u00020\n2\b\b\u0002\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b\u0007\u0010 R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b\u000b\u0010\"R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b\t\u0010$R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b\r\u0010&R\u001c\u00103\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b3\u0010 R\u001a\u00105\u001a\u0002048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0018\u00109\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0011\u0010;\u001a\u00020+8G¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0011\u0010=\u001a\u00020'8G¢\u0006\u0006\u001a\u0004\b=\u0010)"}, d2 = {"Lokhttp3/Request;", "", "Lokhttp3/Request$Builder;", "builder", "<init>", "(Lokhttp3/Request$Builder;)V", "Lokhttp3/HttpUrl;", "url", "Lokhttp3/Headers;", "headers", "", "method", "Lokhttp3/RequestBody;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "(Lokhttp3/HttpUrl;Lokhttp3/Headers;Ljava/lang/String;Lokhttp3/RequestBody;)V", "name", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, "(Ljava/lang/String;)Ljava/lang/String;", "", "(Ljava/lang/String;)Ljava/util/List;", "T", "reifiedTag", "()Ljava/lang/Object;", "Lkotlin/reflect/KClass;", "type", "tag", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "newBuilder", "()Lokhttp3/Request$Builder;", "-deprecated_url", "()Lokhttp3/HttpUrl;", "-deprecated_method", "()Ljava/lang/String;", "-deprecated_headers", "()Lokhttp3/Headers;", "-deprecated_body", "()Lokhttp3/RequestBody;", "Lokhttp3/CacheControl;", "-deprecated_cacheControl", "()Lokhttp3/CacheControl;", "toString", "", "includeBody", "toCurl", "(Z)Ljava/lang/String;", "Lokhttp3/HttpUrl;", "Ljava/lang/String;", "Lokhttp3/Headers;", "Lokhttp3/RequestBody;", "cacheUrlOverride", "Lokhttp3/internal/Tags;", "tags", "Lokhttp3/internal/Tags;", "getTags$okhttp", "()Lokhttp3/internal/Tags;", "lazyCacheControl", "Lokhttp3/CacheControl;", "isHttps", "()Z", "cacheControl", "Builder"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Request {
    private final okhttp3.RequestBody body;
    private final okhttp3.HttpUrl cacheUrlOverride;
    private final okhttp3.Headers headers;
    private okhttp3.CacheControl lazyCacheControl;
    private final java.lang.String method;
    private final okhttp3.internal.Tags tags;
    private final okhttp3.HttpUrl url;

    public Request(okhttp3.Request.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        okhttp3.HttpUrl url = builder.getUrl();
        if (url == null) {
            throw new java.lang.IllegalStateException("url == null".toString());
        }
        this.url = url;
        this.method = builder.getMethod();
        this.headers = builder.getHeaders().build();
        this.body = builder.getBody();
        this.cacheUrlOverride = builder.getCacheUrlOverride();
        this.tags = builder.getTags();
    }

    public final okhttp3.HttpUrl url() {
        return this.url;
    }

    public final java.lang.String method() {
        return this.method;
    }

    public final okhttp3.Headers headers() {
        return this.headers;
    }

    public final okhttp3.RequestBody body() {
        return this.body;
    }

    /* renamed from: cacheUrlOverride, reason: from getter */
    public final okhttp3.HttpUrl getCacheUrlOverride() {
        return this.cacheUrlOverride;
    }

    /* renamed from: getTags$okhttp, reason: from getter */
    public final okhttp3.internal.Tags getTags() {
        return this.tags;
    }

    public final boolean isHttps() {
        return this.url.isHttps();
    }

    public /* synthetic */ Request(okhttp3.HttpUrl httpUrl, okhttp3.Headers headers, java.lang.String str, okhttp3.RequestBody requestBody, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(httpUrl, (i & 2) != 0 ? okhttp3.Headers.INSTANCE.of(new java.lang.String[0]) : headers, (i & 4) != 0 ? "\u0000" : str, (i & 8) != 0 ? null : requestBody);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Request(okhttp3.HttpUrl httpUrl, okhttp3.Headers headers, java.lang.String str, okhttp3.RequestBody requestBody) {
        this(r2.method(str, requestBody));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        okhttp3.Request.Builder headers2 = new okhttp3.Request.Builder().url(httpUrl).headers(headers);
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, "\u0000")) {
            if (requestBody != null) {
                str = "POST";
            } else {
                str = "GET";
            }
        }
    }

    public final java.lang.String header(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return this.headers.get(name2);
    }

    public final java.util.List<java.lang.String> headers(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return this.headers.values(name2);
    }

    public final /* synthetic */ <T> T reifiedTag() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return (T) tag(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
    }

    public final <T> T tag(kotlin.reflect.KClass<T> type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return (T) kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) type).cast(this.tags.get(type));
    }

    public final <T> T tag(java.lang.Class<? extends T> type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return (T) tag(kotlin.jvm.JvmClassMappingKt.getKotlinClass(type));
    }

    public final okhttp3.Request.Builder newBuilder() {
        return new okhttp3.Request.Builder(this);
    }

    public final okhttp3.CacheControl cacheControl() {
        okhttp3.CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl != null) {
            return cacheControl;
        }
        okhttp3.CacheControl parse = okhttp3.CacheControl.INSTANCE.parse(this.headers);
        this.lazyCacheControl = parse;
        return parse;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "url", imports = {}))
    /* renamed from: -deprecated_url, reason: not valid java name and from getter */
    public final okhttp3.HttpUrl getUrl() {
        return this.url;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "method", imports = {}))
    /* renamed from: -deprecated_method, reason: not valid java name and from getter */
    public final java.lang.String getMethod() {
        return this.method;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "headers", imports = {}))
    /* renamed from: -deprecated_headers, reason: not valid java name and from getter */
    public final okhttp3.Headers getHeaders() {
        return this.headers;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, imports = {}))
    /* renamed from: -deprecated_body, reason: not valid java name and from getter */
    public final okhttp3.RequestBody getBody() {
        return this.body;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "cacheControl", imports = {}))
    /* renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final okhttp3.CacheControl m24395deprecated_cacheControl() {
        return cacheControl();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(32);
        sb.append("Request{method=");
        sb.append(this.method);
        sb.append(", url=");
        sb.append(this.url);
        if (this.headers.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair : this.headers) {
                if (i < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair2 = pair;
                java.lang.String component1 = pair2.component1();
                java.lang.String component2 = pair2.component2();
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(component1);
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
                if (okhttp3.internal._UtilCommonKt.isSensitiveHeader(component1)) {
                    component2 = "██";
                }
                sb.append(component2);
                i++;
            }
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.tags, okhttp3.internal.EmptyTags.INSTANCE)) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\nH\u0016¢\u0006\u0004\b\b\u0010\u000bJ\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\fH\u0016¢\u0006\u0004\b\b\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u000bJ\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b!\u0010 J\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\"\u0010 J\u0017\u0010#\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b#\u0010 J\u0017\u0010$\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010 J!\u0010%\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b%\u0010&J&\u0010)\u001a\u00020\u0000\"\n\b\u0000\u0010'\u0018\u0001*\u00020\u00012\b\u0010(\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\b)\u0010*J/\u0010(\u001a\u00020\u0000\"\b\b\u0000\u0010'*\u00020\u00012\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+2\b\u0010(\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b(\u0010-J\u0019\u0010(\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b(\u0010*J/\u0010(\u001a\u00020\u0000\"\u0004\b\u0000\u0010'2\u000e\u0010,\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000.2\b\u0010(\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b(\u0010/J\u0017\u00100\u001a\u00020\u00002\b\u00100\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b0\u0010\tJ\r\u00101\u001a\u00020\u0000¢\u0006\u0004\b1\u0010\u001bJ\u000f\u00102\u001a\u00020\u0004H\u0016¢\u0006\u0004\b2\u00103R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010%\u001a\u00020\n8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b%\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010\u0015\u001a\u00020>8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u00100\u001a\u0004\u0018\u00010\u00078\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b0\u00104\u001a\u0004\bI\u00106\"\u0004\bJ\u00108R\"\u0010L\u001a\u00020K8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010Q"}, d2 = {"Lokhttp3/Request$Builder;", "", "<init>", "()V", "Lokhttp3/Request;", "request", "(Lokhttp3/Request;)V", "Lokhttp3/HttpUrl;", "url", "(Lokhttp3/HttpUrl;)Lokhttp3/Request$Builder;", "", "(Ljava/lang/String;)Lokhttp3/Request$Builder;", "Ljava/net/URL;", "(Ljava/net/URL;)Lokhttp3/Request$Builder;", "name", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;", "addHeader", "removeHeader", "Lokhttp3/Headers;", "headers", "(Lokhttp3/Headers;)Lokhttp3/Request$Builder;", "Lokhttp3/CacheControl;", "cacheControl", "(Lokhttp3/CacheControl;)Lokhttp3/Request$Builder;", "get", "()Lokhttp3/Request$Builder;", "head", "Lokhttp3/RequestBody;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "post", "(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, "put", "patch", "query", "method", "(Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;", "T", "tag", "reifiedTag", "(Ljava/lang/Object;)Lokhttp3/Request$Builder;", "Lkotlin/reflect/KClass;", "type", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Lokhttp3/Request$Builder;", "Ljava/lang/Class;", "(Ljava/lang/Class;Ljava/lang/Object;)Lokhttp3/Request$Builder;", "cacheUrlOverride", com.statsig.androidsdk.HttpUtils.ENCODING_GZIP, "build", "()Lokhttp3/Request;", "Lokhttp3/HttpUrl;", "getUrl$okhttp", "()Lokhttp3/HttpUrl;", "setUrl$okhttp", "(Lokhttp3/HttpUrl;)V", "Ljava/lang/String;", "getMethod$okhttp", "()Ljava/lang/String;", "setMethod$okhttp", "(Ljava/lang/String;)V", "Lokhttp3/Headers$Builder;", "Lokhttp3/Headers$Builder;", "getHeaders$okhttp", "()Lokhttp3/Headers$Builder;", "setHeaders$okhttp", "(Lokhttp3/Headers$Builder;)V", "Lokhttp3/RequestBody;", "getBody$okhttp", "()Lokhttp3/RequestBody;", "setBody$okhttp", "(Lokhttp3/RequestBody;)V", "getCacheUrlOverride$okhttp", "setCacheUrlOverride$okhttp", "Lokhttp3/internal/Tags;", "tags", "Lokhttp3/internal/Tags;", "getTags$okhttp", "()Lokhttp3/internal/Tags;", "setTags$okhttp", "(Lokhttp3/internal/Tags;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static class Builder {
        private okhttp3.RequestBody body;
        private okhttp3.HttpUrl cacheUrlOverride;
        private okhttp3.Headers.Builder headers;
        private java.lang.String method;
        private okhttp3.internal.Tags tags;
        private okhttp3.HttpUrl url;

        /* renamed from: getUrl$okhttp, reason: from getter */
        public final okhttp3.HttpUrl getUrl() {
            return this.url;
        }

        public final void setUrl$okhttp(okhttp3.HttpUrl httpUrl) {
            this.url = httpUrl;
        }

        /* renamed from: getMethod$okhttp, reason: from getter */
        public final java.lang.String getMethod() {
            return this.method;
        }

        public final void setMethod$okhttp(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.method = str;
        }

        /* renamed from: getHeaders$okhttp, reason: from getter */
        public final okhttp3.Headers.Builder getHeaders() {
            return this.headers;
        }

        public final void setHeaders$okhttp(okhttp3.Headers.Builder builder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
            this.headers = builder;
        }

        /* renamed from: getBody$okhttp, reason: from getter */
        public final okhttp3.RequestBody getBody() {
            return this.body;
        }

        public final void setBody$okhttp(okhttp3.RequestBody requestBody) {
            this.body = requestBody;
        }

        /* renamed from: getCacheUrlOverride$okhttp, reason: from getter */
        public final okhttp3.HttpUrl getCacheUrlOverride() {
            return this.cacheUrlOverride;
        }

        public final void setCacheUrlOverride$okhttp(okhttp3.HttpUrl httpUrl) {
            this.cacheUrlOverride = httpUrl;
        }

        /* renamed from: getTags$okhttp, reason: from getter */
        public final okhttp3.internal.Tags getTags() {
            return this.tags;
        }

        public final void setTags$okhttp(okhttp3.internal.Tags tags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tags, "");
            this.tags = tags;
        }

        public Builder() {
            this.tags = okhttp3.internal.EmptyTags.INSTANCE;
            this.method = "GET";
            this.headers = new okhttp3.Headers.Builder();
        }

        public Builder(okhttp3.Request request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            this.tags = okhttp3.internal.EmptyTags.INSTANCE;
            this.url = request.url();
            this.method = request.method();
            this.body = request.body();
            this.tags = request.getTags();
            this.headers = request.headers().newBuilder();
            this.cacheUrlOverride = request.getCacheUrlOverride();
        }

        public okhttp3.Request.Builder url(okhttp3.HttpUrl url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            this.url = url;
            return this;
        }

        public okhttp3.Request.Builder url(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            okhttp3.HttpUrl.Companion companion = okhttp3.HttpUrl.INSTANCE;
            if (kotlin.text.StringsKt.startsWith(url, "ws:", true)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("http:");
                java.lang.String substring = url.substring(3);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                sb.append(substring);
                url = sb.toString();
            } else if (kotlin.text.StringsKt.startsWith(url, "wss:", true)) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("https:");
                java.lang.String substring2 = url.substring(4);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
                sb2.append(substring2);
                url = sb2.toString();
            }
            return url(companion.get(url));
        }

        public okhttp3.Request.Builder url(java.net.URL url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            okhttp3.HttpUrl.Companion companion = okhttp3.HttpUrl.INSTANCE;
            java.lang.String obj = url.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            return url(companion.get(obj));
        }

        public okhttp3.Request.Builder header(java.lang.String name2, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            this.headers.set(name2, value);
            return this;
        }

        public okhttp3.Request.Builder addHeader(java.lang.String name2, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            this.headers.add(name2, value);
            return this;
        }

        public okhttp3.Request.Builder removeHeader(java.lang.String name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            this.headers.removeAll(name2);
            return this;
        }

        public okhttp3.Request.Builder headers(okhttp3.Headers headers) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
            this.headers = headers.newBuilder();
            return this;
        }

        public okhttp3.Request.Builder cacheControl(okhttp3.CacheControl cacheControl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheControl, "");
            java.lang.String obj = cacheControl.toString();
            return obj.length() == 0 ? removeHeader("Cache-Control") : header("Cache-Control", obj);
        }

        public okhttp3.Request.Builder get() {
            return method("GET", null);
        }

        public okhttp3.Request.Builder head() {
            return method(com.datadog.android.internal.network.HttpSpec.Method.HEAD, null);
        }

        public okhttp3.Request.Builder post(okhttp3.RequestBody body) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "");
            return method("POST", body);
        }

        public static /* synthetic */ okhttp3.Request.Builder delete$default(okhttp3.Request.Builder builder, okhttp3.RequestBody requestBody, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i & 1) != 0) {
                requestBody = okhttp3.RequestBody.EMPTY;
            }
            return builder.delete(requestBody);
        }

        public okhttp3.Request.Builder delete(okhttp3.RequestBody body) {
            return method(com.datadog.android.internal.network.HttpSpec.Method.DELETE, body);
        }

        public okhttp3.Request.Builder put(okhttp3.RequestBody body) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "");
            return method(com.datadog.android.internal.network.HttpSpec.Method.PUT, body);
        }

        public okhttp3.Request.Builder patch(okhttp3.RequestBody body) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "");
            return method("PATCH", body);
        }

        public okhttp3.Request.Builder query(okhttp3.RequestBody body) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "");
            return method("QUERY", body);
        }

        public okhttp3.Request.Builder method(java.lang.String method, okhttp3.RequestBody body) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
            if (method.length() <= 0) {
                throw new java.lang.IllegalArgumentException("method.isEmpty() == true".toString());
            }
            if (body == null) {
                if (okhttp3.internal.http.HttpMethod.requiresRequestBody(method)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("method ");
                    sb.append(method);
                    sb.append(" must have a request body.");
                    throw new java.lang.IllegalArgumentException(sb.toString().toString());
                }
            } else if (!okhttp3.internal.http.HttpMethod.permitsRequestBody(method)) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("method ");
                sb2.append(method);
                sb2.append(" must not have a request body.");
                throw new java.lang.IllegalArgumentException(sb2.toString().toString());
            }
            this.method = method;
            this.body = body;
            return this;
        }

        public final /* synthetic */ <T> okhttp3.Request.Builder reifiedTag(T tag) {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
            return tag((kotlin.reflect.KClass<kotlin.reflect.KClass<T>>) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), (kotlin.reflect.KClass<T>) tag);
        }

        public final <T> okhttp3.Request.Builder tag(kotlin.reflect.KClass<T> type, T tag) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            this.tags = this.tags.plus(type, tag);
            return this;
        }

        public okhttp3.Request.Builder tag(java.lang.Object tag) {
            return tag((kotlin.reflect.KClass<kotlin.reflect.KClass>) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), (kotlin.reflect.KClass) tag);
        }

        public <T> okhttp3.Request.Builder tag(java.lang.Class<? super T> type, T tag) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return tag((kotlin.reflect.KClass<kotlin.reflect.KClass<T>>) kotlin.jvm.JvmClassMappingKt.getKotlinClass(type), (kotlin.reflect.KClass<T>) tag);
        }

        public final okhttp3.Request.Builder cacheUrlOverride(okhttp3.HttpUrl cacheUrlOverride) {
            this.cacheUrlOverride = cacheUrlOverride;
            return this;
        }

        public final okhttp3.Request.Builder gzip() {
            okhttp3.RequestBody requestBody = this.body;
            if (requestBody == null) {
                throw new java.lang.IllegalStateException("cannot gzip a request that has no body");
            }
            java.lang.String str = this.headers.get("Content-Encoding");
            if (str != null) {
                throw new java.lang.IllegalStateException("Content-Encoding already set: ".concat(java.lang.String.valueOf(str)).toString());
            }
            this.headers.add("Content-Encoding", com.statsig.androidsdk.HttpUtils.ENCODING_GZIP);
            this.body = new okhttp3.internal.http.GzipRequestBody(requestBody);
            return this;
        }

        public okhttp3.Request build() {
            return new okhttp3.Request(this);
        }

        public final okhttp3.Request.Builder delete() {
            return delete$default(this, null, 1, null);
        }
    }

    public static /* synthetic */ java.lang.String toCurl$default(okhttp3.Request request, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return request.toCurl(z);
    }

    public final java.lang.String toCurl(boolean includeBody) {
        okhttp3.MediaType getHighSpeedVideoFpsRangesFor;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("curl ");
        java.lang.String obj = this.url.toString();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("'");
        sb3.append(kotlin.text.StringsKt.replace$default(obj, "'", "'\\''", false, 4, (java.lang.Object) null));
        sb3.append('\'');
        sb2.append(sb3.toString());
        sb.append(sb2.toString());
        okhttp3.RequestBody requestBody = this.body;
        java.lang.String obj2 = (requestBody == null || (getHighSpeedVideoFpsRangesFor = requestBody.getGetHighSpeedVideoFpsRangesFor()) == null) ? null : getHighSpeedVideoFpsRangesFor.toString();
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.method, (!includeBody || this.body == null) ? "GET" : "POST")) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder(" \\\n  -X ");
            java.lang.String str = this.method;
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("'");
            sb5.append(kotlin.text.StringsKt.replace$default(str, "'", "'\\''", false, 4, (java.lang.Object) null));
            sb5.append('\'');
            sb4.append(sb5.toString());
            sb.append(sb4.toString());
        }
        java.util.Iterator<kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>> it = this.headers.iterator();
        while (it.hasNext()) {
            kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> next = it.next();
            java.lang.String component1 = next.component1();
            java.lang.String component2 = next.component2();
            if (obj2 == null || !kotlin.text.StringsKt.equals(component1, "Content-Type", true)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" \\\n  -H ");
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(component1);
                sb7.append(": ");
                sb7.append(component2);
                java.lang.String obj3 = sb7.toString();
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("'");
                sb8.append(kotlin.text.StringsKt.replace$default(obj3, "'", "'\\''", false, 4, (java.lang.Object) null));
                sb8.append('\'');
                sb6.append(sb8.toString());
                sb.append(sb6.toString());
            }
        }
        if (obj2 != null) {
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder(" \\\n  -H ");
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder("Content-Type: ");
            sb10.append(obj2);
            java.lang.String obj4 = sb10.toString();
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder("'");
            sb11.append(kotlin.text.StringsKt.replace$default(obj4, "'", "'\\''", false, 4, (java.lang.Object) null));
            sb11.append('\'');
            sb9.append(sb11.toString());
            sb.append(sb9.toString());
        }
        if (includeBody && this.body != null) {
            okio.Buffer buffer = new okio.Buffer();
            this.body.writeTo(buffer);
            if (okhttp3.internal.IsProbablyUtf8Kt.isProbablyUtf8$default(buffer, 0L, 1, null)) {
                java.lang.StringBuilder sb12 = new java.lang.StringBuilder(" \\\n  --data ");
                java.lang.String readUtf8 = buffer.readUtf8();
                java.lang.StringBuilder sb13 = new java.lang.StringBuilder("'");
                sb13.append(kotlin.text.StringsKt.replace$default(readUtf8, "'", "'\\''", false, 4, (java.lang.Object) null));
                sb13.append('\'');
                sb12.append(sb13.toString());
                sb.append(sb12.toString());
            } else {
                java.lang.StringBuilder sb14 = new java.lang.StringBuilder(" \\\n  --data-binary ");
                java.lang.String hex = buffer.readByteString().hex();
                java.lang.StringBuilder sb15 = new java.lang.StringBuilder("'");
                sb15.append(kotlin.text.StringsKt.replace$default(hex, "'", "'\\''", false, 4, (java.lang.Object) null));
                sb15.append('\'');
                sb14.append(sb15.toString());
                sb.append(sb14.toString());
            }
        }
        return sb.toString();
    }

    public final java.lang.Object tag() {
        return tag(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
    }

    public final java.lang.String toCurl() {
        return toCurl$default(this, false, 1, null);
    }
}
