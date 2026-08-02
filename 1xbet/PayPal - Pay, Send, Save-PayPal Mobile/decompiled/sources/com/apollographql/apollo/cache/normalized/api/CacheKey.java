package com.apollographql.apollo.cache.normalized.api;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001f\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\u0004\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0013"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/api/CacheKey;", "", "", "key", "<init>", "(Ljava/lang/String;)V", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TYPENAME, "", "values", "(Ljava/lang/String;Ljava/util/List;)V", "(Ljava/lang/String;[Ljava/lang/String;)V", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "serialize", "Ljava/lang/String;", "getKey", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CacheKey {
    private final java.lang.String key;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.apollographql.apollo.cache.normalized.api.CacheKey.Companion INSTANCE = new com.apollographql.apollo.cache.normalized.api.CacheKey.Companion(null);
    private static final kotlin.text.Regex Camera2StreamConfigurationMap = new kotlin.text.Regex("ApolloCacheReference\\{(.*)\\}");
    private static final com.apollographql.apollo.cache.normalized.api.CacheKey getHighSpeedVideoFpsRangesFor = new com.apollographql.apollo.cache.normalized.api.CacheKey("QUERY_ROOT");

    public CacheKey(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.key = str;
    }

    public final java.lang.String getKey() {
        return this.key;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CacheKey(java.lang.String str, java.util.List<java.lang.String> list) {
        this(r3);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(io.ktor.sse.ServerSentEventKt.COLON);
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            sb.append((java.lang.String) it.next());
        }
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CacheKey(java.lang.String str, java.lang.String... strArr) {
        this(str, (java.util.List<java.lang.String>) kotlin.collections.ArraysKt.toList(strArr));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
    }

    public final int hashCode() {
        return this.key.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        java.lang.String str = this.key;
        com.apollographql.apollo.cache.normalized.api.CacheKey cacheKey = other instanceof com.apollographql.apollo.cache.normalized.api.CacheKey ? (com.apollographql.apollo.cache.normalized.api.CacheKey) other : null;
        return kotlin.jvm.internal.Intrinsics.areEqual(str, cacheKey != null ? cacheKey.key : null);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CacheKey(");
        sb.append(this.key);
        sb.append(')');
        return sb.toString();
    }

    public final java.lang.String serialize() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ApolloCacheReference{");
        sb.append(this.key);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0014\"\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/api/CacheKey$Companion;", "", "<init>", "()V", "", "serializedCacheKey", "Lcom/apollographql/apollo/cache/normalized/api/CacheKey;", "deserialize", "(Ljava/lang/String;)Lcom/apollographql/apollo/cache/normalized/api/CacheKey;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "canDeserialize", "(Ljava/lang/String;)Z", "rootKey", "()Lcom/apollographql/apollo/cache/normalized/api/CacheKey;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TYPENAME, "", "values", "from", "(Ljava/lang/String;Ljava/util/List;)Lcom/apollographql/apollo/cache/normalized/api/CacheKey;", "", "(Ljava/lang/String;[Ljava/lang/String;)Lcom/apollographql/apollo/cache/normalized/api/CacheKey;", "Lkotlin/text/Regex;", "Camera2StreamConfigurationMap", "Lkotlin/text/Regex;", "getHighSpeedVideoFpsRangesFor", "Lcom/apollographql/apollo/cache/normalized/api/CacheKey;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final com.apollographql.apollo.cache.normalized.api.CacheKey deserialize(java.lang.String serializedCacheKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializedCacheKey, "");
            kotlin.text.MatchResult matchEntire = com.apollographql.apollo.cache.normalized.api.CacheKey.Camera2StreamConfigurationMap.matchEntire(serializedCacheKey);
            java.util.List<java.lang.String> groupValues = matchEntire != null ? matchEntire.getGroupValues() : null;
            if (groupValues == null || groupValues.size() <= 1) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Not a cache reference: ");
                sb.append(serializedCacheKey);
                sb.append(" Must be of the form: ApolloCacheReference{%s}");
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            return new com.apollographql.apollo.cache.normalized.api.CacheKey(groupValues.get(1));
        }

        @kotlin.jvm.JvmStatic
        public final boolean canDeserialize(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return com.apollographql.apollo.cache.normalized.api.CacheKey.Camera2StreamConfigurationMap.matches(value);
        }

        @kotlin.jvm.JvmStatic
        public final com.apollographql.apollo.cache.normalized.api.CacheKey rootKey() {
            return com.apollographql.apollo.cache.normalized.api.CacheKey.getHighSpeedVideoFpsRangesFor;
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use the constructor instead", replaceWith = @kotlin.ReplaceWith(expression = "CacheKey(typename, values)", imports = {}))
        public final com.apollographql.apollo.cache.normalized.api.CacheKey from(java.lang.String typename, java.util.List<java.lang.String> values) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "");
            return new com.apollographql.apollo.cache.normalized.api.CacheKey(typename, values);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use the constructor instead", replaceWith = @kotlin.ReplaceWith(expression = "CacheKey(typename, values)", imports = {}))
        public final com.apollographql.apollo.cache.normalized.api.CacheKey from(java.lang.String typename, java.lang.String... values) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "");
            return new com.apollographql.apollo.cache.normalized.api.CacheKey(typename, (java.util.List<java.lang.String>) kotlin.collections.ArraysKt.toList(values));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final com.apollographql.apollo.cache.normalized.api.CacheKey rootKey() {
        return INSTANCE.rootKey();
    }

    @kotlin.jvm.JvmStatic
    public static final com.apollographql.apollo.cache.normalized.api.CacheKey deserialize(java.lang.String str) {
        return INSTANCE.deserialize(str);
    }

    @kotlin.jvm.JvmStatic
    public static final boolean canDeserialize(java.lang.String str) {
        return INSTANCE.canDeserialize(str);
    }
}
