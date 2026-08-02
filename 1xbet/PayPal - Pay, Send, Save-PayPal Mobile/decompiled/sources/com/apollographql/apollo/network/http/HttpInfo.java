package com.apollographql.apollo.network.http;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 !2\u00020\u0001:\u0001!B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u000eR\u001a\u0010\u001c\u001a\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001a\u0010\u000eR\u0018\u0010 \u001a\u0006\u0012\u0002\b\u00030\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/apollographql/apollo/network/http/HttpInfo;", "Lcom/apollographql/apollo/api/ExecutionContext$Element;", "", "startMillis", "endMillis", "", "statusCode", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "headers", "<init>", "(JJILjava/util/List;)V", "J", "getStartMillis", "()J", "getEndMillis", com.visa.cbp.getEncExpo.warmup, "getStatusCode", "()I", "Ljava/util/List;", "getHeaders", "()Ljava/util/List;", "getMillisStart", "getMillisStart$annotations", "()V", "millisStart", "getMillisEnd", "getMillisEnd$annotations", "millisEnd", "Lcom/apollographql/apollo/api/ExecutionContext$Key;", "getKey", "()Lcom/apollographql/apollo/api/ExecutionContext$Key;", "key", "Key"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpInfo implements com.apollographql.apollo.api.ExecutionContext.Element {

    /* renamed from: Key, reason: from kotlin metadata */
    public static final com.apollographql.apollo.network.http.HttpInfo.Companion INSTANCE = new com.apollographql.apollo.network.http.HttpInfo.Companion(null);
    private final long endMillis;
    private final java.util.List<com.apollographql.apollo.api.http.HttpHeader> headers;
    private final long startMillis;
    private final int statusCode;

    @kotlin.Deprecated(message = "Use endMillis instead", replaceWith = @kotlin.ReplaceWith(expression = "endMillis", imports = {}))
    public static /* synthetic */ void getMillisEnd$annotations() {
    }

    @kotlin.Deprecated(message = "Use startMillis instead", replaceWith = @kotlin.ReplaceWith(expression = "startMillis", imports = {}))
    public static /* synthetic */ void getMillisStart$annotations() {
    }

    @kotlin.Deprecated(message = "HttpInfo is only to be constructed internally. Declare your own class if needed")
    public HttpInfo(long j, long j2, int i, java.util.List<com.apollographql.apollo.api.http.HttpHeader> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.startMillis = j;
        this.endMillis = j2;
        this.statusCode = i;
        this.headers = list;
    }

    public final long getStartMillis() {
        return this.startMillis;
    }

    public final long getEndMillis() {
        return this.endMillis;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final java.util.List<com.apollographql.apollo.api.http.HttpHeader> getHeaders() {
        return this.headers;
    }

    /* renamed from: getMillisStart, reason: from getter */
    public final long getStartMillis() {
        return this.startMillis;
    }

    public final long getMillisEnd() {
        return this.endMillis;
    }

    @Override // com.apollographql.apollo.api.ExecutionContext.Element
    public final com.apollographql.apollo.api.ExecutionContext.Key<?> getKey() {
        return INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/apollographql/apollo/network/http/HttpInfo$Key;", "Lcom/apollographql/apollo/api/ExecutionContext$Key;", "Lcom/apollographql/apollo/network/http/HttpInfo;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.apollographql.apollo.network.http.HttpInfo$Key, reason: from kotlin metadata */
    public static final class Companion implements com.apollographql.apollo.api.ExecutionContext.Key<com.apollographql.apollo.network.http.HttpInfo> {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
