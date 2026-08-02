package com.apollographql.apollo.cache.normalized;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 >2\u00020\u0001:\u0002>?BE\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB5\b\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\r\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001a\u0010\u001f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u001a\u0010!\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u001a\u0010#\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0018\u00101\u001a\u0006\u0012\u0002\b\u00030.8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u001a\u0010\u000f\u001a\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010\u001cR\u001a\u0010\u0010\u001a\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b6\u00104\u001a\u0004\b5\u0010\u001cR\u001a\u0010\u0011\u001a\u00020\u00078GX\u0087\u0004¢\u0006\f\u0012\u0004\b8\u00104\u001a\u0004\b7\u0010%R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128GX\u0087\u0004¢\u0006\f\u0012\u0004\b;\u00104\u001a\u0004\b9\u0010:R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00128GX\u0087\u0004¢\u0006\f\u0012\u0004\b=\u00104\u001a\u0004\b<\u0010:"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/CacheInfo;", "Lcom/apollographql/apollo/api/ExecutionContext$Element;", "", "p0", "p1", "p2", "p3", "", "p4", "Lcom/apollographql/apollo/exception/CacheMissException;", "p5", "Lcom/apollographql/apollo/exception/ApolloException;", "p6", "<init>", "(JJJJZLcom/apollographql/apollo/exception/CacheMissException;Lcom/apollographql/apollo/exception/ApolloException;)V", "millisStart", "millisEnd", "hit", "", "missedKey", "missedField", "(JJZLjava/lang/String;Ljava/lang/String;)V", "Lcom/apollographql/apollo/cache/normalized/CacheInfo$Builder;", "newBuilder", "()Lcom/apollographql/apollo/cache/normalized/CacheInfo$Builder;", "cacheStartMillis", "J", "getCacheStartMillis", "()J", "cacheEndMillis", "getCacheEndMillis", "networkStartMillis", "getNetworkStartMillis", "networkEndMillis", "getNetworkEndMillis", "isCacheHit", "Z", "()Z", "cacheMissException", "Lcom/apollographql/apollo/exception/CacheMissException;", "getCacheMissException", "()Lcom/apollographql/apollo/exception/CacheMissException;", "networkException", "Lcom/apollographql/apollo/exception/ApolloException;", "getNetworkException", "()Lcom/apollographql/apollo/exception/ApolloException;", "Lcom/apollographql/apollo/api/ExecutionContext$Key;", "getKey", "()Lcom/apollographql/apollo/api/ExecutionContext$Key;", "key", "getMillisStart", "getMillisStart$annotations", "()V", "getMillisEnd", "getMillisEnd$annotations", "getHit", "getHit$annotations", "getMissedKey", "()Ljava/lang/String;", "getMissedKey$annotations", "getMissedField", "getMissedField$annotations", "Key", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CacheInfo implements com.apollographql.apollo.api.ExecutionContext.Element {

    /* renamed from: Key, reason: from kotlin metadata */
    public static final com.apollographql.apollo.cache.normalized.CacheInfo.Companion INSTANCE = new com.apollographql.apollo.cache.normalized.CacheInfo.Companion(null);
    private final long cacheEndMillis;
    private final com.apollographql.apollo.exception.CacheMissException cacheMissException;
    private final long cacheStartMillis;
    private final boolean isCacheHit;
    private final long networkEndMillis;
    private final com.apollographql.apollo.exception.ApolloException networkException;
    private final long networkStartMillis;

    @kotlin.Deprecated(message = "Use cacheHit instead", replaceWith = @kotlin.ReplaceWith(expression = "cacheHit", imports = {}))
    public static /* synthetic */ void getHit$annotations() {
    }

    @kotlin.Deprecated(message = "Use cacheEndMillis instead", replaceWith = @kotlin.ReplaceWith(expression = "cacheEndMillis", imports = {}))
    public static /* synthetic */ void getMillisEnd$annotations() {
    }

    @kotlin.Deprecated(message = "Use cacheStartMillis instead", replaceWith = @kotlin.ReplaceWith(expression = "cacheStartMillis", imports = {}))
    public static /* synthetic */ void getMillisStart$annotations() {
    }

    @kotlin.Deprecated(message = "Use cacheMissException?.fieldName instead", replaceWith = @kotlin.ReplaceWith(expression = "cacheMissException?.fieldName", imports = {}))
    public static /* synthetic */ void getMissedField$annotations() {
    }

    @kotlin.Deprecated(message = "Use cacheMissException?.key instead", replaceWith = @kotlin.ReplaceWith(expression = "cacheMissException?.key", imports = {}))
    public static /* synthetic */ void getMissedKey$annotations() {
    }

    private CacheInfo(long j, long j2, long j3, long j4, boolean z, com.apollographql.apollo.exception.CacheMissException cacheMissException, com.apollographql.apollo.exception.ApolloException apolloException) {
        this.cacheStartMillis = j;
        this.cacheEndMillis = j2;
        this.networkStartMillis = j3;
        this.networkEndMillis = j4;
        this.isCacheHit = z;
        this.cacheMissException = cacheMissException;
        this.networkException = apolloException;
    }

    public final long getCacheStartMillis() {
        return this.cacheStartMillis;
    }

    public final long getCacheEndMillis() {
        return this.cacheEndMillis;
    }

    public final long getNetworkStartMillis() {
        return this.networkStartMillis;
    }

    public final long getNetworkEndMillis() {
        return this.networkEndMillis;
    }

    public final boolean isCacheHit() {
        return this.isCacheHit;
    }

    public final com.apollographql.apollo.exception.CacheMissException getCacheMissException() {
        return this.cacheMissException;
    }

    public final com.apollographql.apollo.exception.ApolloException getNetworkException() {
        return this.networkException;
    }

    @kotlin.Deprecated(message = "Use CacheInfo.Builder")
    public CacheInfo(long j, long j2, boolean z, java.lang.String str, java.lang.String str2) {
        this(j, j2, 0L, 0L, z, str != null ? new com.apollographql.apollo.exception.CacheMissException(str, str2) : null, null);
    }

    @Override // com.apollographql.apollo.api.ExecutionContext.Element
    public final com.apollographql.apollo.api.ExecutionContext.Key<?> getKey() {
        return INSTANCE;
    }

    public final long getMillisStart() {
        return this.cacheStartMillis;
    }

    public final long getMillisEnd() {
        return this.cacheEndMillis;
    }

    /* renamed from: getHit, reason: from getter */
    public final boolean getIsCacheHit() {
        return this.isCacheHit;
    }

    public final java.lang.String getMissedKey() {
        com.apollographql.apollo.exception.CacheMissException cacheMissException = this.cacheMissException;
        if (cacheMissException != null) {
            return cacheMissException.getKey();
        }
        return null;
    }

    public final java.lang.String getMissedField() {
        com.apollographql.apollo.exception.CacheMissException cacheMissException = this.cacheMissException;
        if (cacheMissException != null) {
            return cacheMissException.getFieldName();
        }
        return null;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/CacheInfo$Key;", "Lcom/apollographql/apollo/api/ExecutionContext$Key;", "Lcom/apollographql/apollo/cache/normalized/CacheInfo;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.apollographql.apollo.cache.normalized.CacheInfo$Key, reason: from kotlin metadata */
    public static final class Companion implements com.apollographql.apollo.api.ExecutionContext.Key<com.apollographql.apollo.cache.normalized.CacheInfo> {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final com.apollographql.apollo.cache.normalized.CacheInfo.Builder newBuilder() {
        return new com.apollographql.apollo.cache.normalized.CacheInfo.Builder().cacheStartMillis(this.cacheStartMillis).cacheEndMillis(this.cacheEndMillis).networkStartMillis(this.networkStartMillis).networkEndMillis(this.networkEndMillis).cacheHit(this.isCacheHit).networkException(this.networkException);
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0006J\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/CacheInfo$Builder;", "", "<init>", "()V", "", "cacheStartMillis", "(J)Lcom/apollographql/apollo/cache/normalized/CacheInfo$Builder;", "cacheEndMillis", "networkStartMillis", "networkEndMillis", "", "cacheHit", "(Z)Lcom/apollographql/apollo/cache/normalized/CacheInfo$Builder;", "Lcom/apollographql/apollo/exception/CacheMissException;", "cacheMissException", "(Lcom/apollographql/apollo/exception/CacheMissException;)Lcom/apollographql/apollo/cache/normalized/CacheInfo$Builder;", "Lcom/apollographql/apollo/exception/ApolloException;", "networkException", "(Lcom/apollographql/apollo/exception/ApolloException;)Lcom/apollographql/apollo/cache/normalized/CacheInfo$Builder;", "Lcom/apollographql/apollo/cache/normalized/CacheInfo;", "build", "()Lcom/apollographql/apollo/cache/normalized/CacheInfo;", "getHighSpeedVideoFpsRangesFor", "J", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizesFor", "Camera2StreamConfigurationMap", "Z", "Lcom/apollographql/apollo/exception/CacheMissException;", "getInputSizeshNQ4ISI", "getInputFormats", "Lcom/apollographql/apollo/exception/ApolloException;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private long getHighSpeedVideoSizes;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private com.apollographql.apollo.exception.CacheMissException getInputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private boolean Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private long getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private long getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
        private long getHighSpeedVideoFpsRangesFor;
        private com.apollographql.apollo.exception.ApolloException getInputFormats;

        public final com.apollographql.apollo.cache.normalized.CacheInfo.Builder cacheStartMillis(long cacheStartMillis) {
            this.getHighResolutionOutputSizeshNQ4ISI = cacheStartMillis;
            return this;
        }

        public final com.apollographql.apollo.cache.normalized.CacheInfo.Builder cacheEndMillis(long cacheEndMillis) {
            this.getHighSpeedVideoFpsRanges = cacheEndMillis;
            return this;
        }

        public final com.apollographql.apollo.cache.normalized.CacheInfo.Builder networkStartMillis(long networkStartMillis) {
            this.getHighSpeedVideoFpsRangesFor = networkStartMillis;
            return this;
        }

        public final com.apollographql.apollo.cache.normalized.CacheInfo.Builder networkEndMillis(long networkEndMillis) {
            this.getHighSpeedVideoSizes = networkEndMillis;
            return this;
        }

        public final com.apollographql.apollo.cache.normalized.CacheInfo.Builder cacheHit(boolean cacheHit) {
            this.Camera2StreamConfigurationMap = cacheHit;
            return this;
        }

        public final com.apollographql.apollo.cache.normalized.CacheInfo.Builder cacheMissException(com.apollographql.apollo.exception.CacheMissException cacheMissException) {
            this.getInputSizeshNQ4ISI = cacheMissException;
            return this;
        }

        public final com.apollographql.apollo.cache.normalized.CacheInfo.Builder networkException(com.apollographql.apollo.exception.ApolloException networkException) {
            this.getInputFormats = networkException;
            return this;
        }

        public final com.apollographql.apollo.cache.normalized.CacheInfo build() {
            return new com.apollographql.apollo.cache.normalized.CacheInfo(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI, this.getInputFormats, null);
        }
    }

    public /* synthetic */ CacheInfo(long j, long j2, long j3, long j4, boolean z, com.apollographql.apollo.exception.CacheMissException cacheMissException, com.apollographql.apollo.exception.ApolloException apolloException, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, z, cacheMissException, apolloException);
    }
}
