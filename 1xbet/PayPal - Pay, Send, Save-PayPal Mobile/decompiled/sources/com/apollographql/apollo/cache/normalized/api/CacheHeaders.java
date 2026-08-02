package com.apollographql.apollo.cache.normalized.api;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B\u001d\b\u0000\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;", "", "", "", "headerMap", "<init>", "(Ljava/util/Map;)V", "Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders$Builder;", "newBuilder", "()Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders$Builder;", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, "headerValue", "(Ljava/lang/String;)Ljava/lang/String;", "headerName", "", "hasHeader", "(Ljava/lang/String;)Z", "cacheHeaders", "plus", "(Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;)Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Map;", "getHighSpeedVideoSizes", "Companion", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CacheHeaders {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.apollographql.apollo.cache.normalized.api.CacheHeaders.Companion INSTANCE = new com.apollographql.apollo.cache.normalized.api.CacheHeaders.Companion(null);
    public static final com.apollographql.apollo.cache.normalized.api.CacheHeaders NONE = new com.apollographql.apollo.cache.normalized.api.CacheHeaders(kotlin.collections.MapsKt.emptyMap());

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoSizes;

    public CacheHeaders(java.util.Map<java.lang.String, java.lang.String> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.getHighSpeedVideoSizes = map;
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders$Builder;", "", "<init>", "()V", "", "headerName", "headerValue", "addHeader", "(Ljava/lang/String;Ljava/lang/String;)Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders$Builder;", "", "headerMap", "addHeaders", "(Ljava/util/Map;)Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders$Builder;", "Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;", "build", "()Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;", "", "Camera2StreamConfigurationMap", "Ljava/util/Map;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Builder {
        private final java.util.Map<java.lang.String, java.lang.String> Camera2StreamConfigurationMap = new java.util.LinkedHashMap();

        public final com.apollographql.apollo.cache.normalized.api.CacheHeaders.Builder addHeader(java.lang.String headerName, java.lang.String headerValue) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerValue, "");
            this.Camera2StreamConfigurationMap.put(headerName, headerValue);
            return this;
        }

        public final com.apollographql.apollo.cache.normalized.api.CacheHeaders.Builder addHeaders(java.util.Map<java.lang.String, java.lang.String> headerMap) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerMap, "");
            this.Camera2StreamConfigurationMap.putAll(headerMap);
            return this;
        }

        public final com.apollographql.apollo.cache.normalized.api.CacheHeaders build() {
            return new com.apollographql.apollo.cache.normalized.api.CacheHeaders(this.Camera2StreamConfigurationMap);
        }
    }

    public final com.apollographql.apollo.cache.normalized.api.CacheHeaders.Builder newBuilder() {
        return INSTANCE.builder().addHeaders(this.getHighSpeedVideoSizes);
    }

    public final java.lang.String headerValue(java.lang.String header) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(header, "");
        return this.getHighSpeedVideoSizes.get(header);
    }

    public final boolean hasHeader(java.lang.String headerName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerName, "");
        return this.getHighSpeedVideoSizes.containsKey(headerName);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\b\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders$Companion;", "", "<init>", "()V", "Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders$Builder;", "builder", "()Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders$Builder;", "Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;", "NONE", "Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final com.apollographql.apollo.cache.normalized.api.CacheHeaders.Builder builder() {
            return new com.apollographql.apollo.cache.normalized.api.CacheHeaders.Builder();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final com.apollographql.apollo.cache.normalized.api.CacheHeaders plus(com.apollographql.apollo.cache.normalized.api.CacheHeaders cacheHeaders) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheHeaders, "");
        return newBuilder().addHeaders(cacheHeaders.getHighSpeedVideoSizes).build();
    }

    @kotlin.jvm.JvmStatic
    public static final com.apollographql.apollo.cache.normalized.api.CacheHeaders.Builder builder() {
        return INSTANCE.builder();
    }
}
