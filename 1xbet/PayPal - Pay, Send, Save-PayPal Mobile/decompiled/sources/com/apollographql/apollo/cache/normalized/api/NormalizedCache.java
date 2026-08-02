package com.apollographql.apollo.cache.normalized.api;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\b&\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0003J\u001f\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0015\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\tH&¢\u0006\u0004\b\u0015\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001cR(\u0010\u001e\u001a\u0004\u0018\u00010\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u00008\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/api/NormalizedCache;", "Lcom/apollographql/apollo/cache/normalized/api/ReadOnlyNormalizedCache;", "<init>", "()V", "Lcom/apollographql/apollo/cache/normalized/api/Record;", "record", "Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;", "cacheHeaders", "", "", "merge", "(Lcom/apollographql/apollo/cache/normalized/api/Record;Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;)Ljava/util/Set;", "", "records", "(Ljava/util/Collection;Lcom/apollographql/apollo/cache/normalized/api/CacheHeaders;)Ljava/util/Set;", "", "clearAll", "Lcom/apollographql/apollo/cache/normalized/api/CacheKey;", "cacheKey", "", "cascade", "remove", "(Lcom/apollographql/apollo/cache/normalized/api/CacheKey;Z)Z", "pattern", "", "(Ljava/lang/String;)I", com.datadog.trace.api.DDSpanTypes.CACHE, "chain", "(Lcom/apollographql/apollo/cache/normalized/api/NormalizedCache;)Lcom/apollographql/apollo/cache/normalized/api/NormalizedCache;", "p0", "nextCache", "Lcom/apollographql/apollo/cache/normalized/api/NormalizedCache;", "getNextCache", "()Lcom/apollographql/apollo/cache/normalized/api/NormalizedCache;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class NormalizedCache implements com.apollographql.apollo.cache.normalized.api.ReadOnlyNormalizedCache {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.apollographql.apollo.cache.normalized.api.NormalizedCache.Companion INSTANCE = new com.apollographql.apollo.cache.normalized.api.NormalizedCache.Companion(null);
    private static final java.lang.String getHighSpeedVideoFpsRangesFor = "()^$.*?+{}";
    private com.apollographql.apollo.cache.normalized.api.NormalizedCache nextCache;

    public abstract void clearAll();

    public abstract java.util.Set<java.lang.String> merge(com.apollographql.apollo.cache.normalized.api.Record record, com.apollographql.apollo.cache.normalized.api.CacheHeaders cacheHeaders);

    public abstract java.util.Set<java.lang.String> merge(java.util.Collection<com.apollographql.apollo.cache.normalized.api.Record> records, com.apollographql.apollo.cache.normalized.api.CacheHeaders cacheHeaders);

    public abstract int remove(java.lang.String pattern);

    public abstract boolean remove(com.apollographql.apollo.cache.normalized.api.CacheKey cacheKey, boolean cascade);

    public final com.apollographql.apollo.cache.normalized.api.NormalizedCache getNextCache() {
        return this.nextCache;
    }

    public final com.apollographql.apollo.cache.normalized.api.NormalizedCache chain(com.apollographql.apollo.cache.normalized.api.NormalizedCache cache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cache, "");
        com.apollographql.apollo.cache.normalized.api.NormalizedCache normalizedCache = this;
        while (true) {
            com.apollographql.apollo.cache.normalized.api.NormalizedCache normalizedCache2 = normalizedCache.nextCache;
            if (normalizedCache2 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(normalizedCache2);
                normalizedCache = normalizedCache2;
            } else {
                normalizedCache.nextCache = cache;
                return this;
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\n\u001a\u00020\u00072'\u0010\t\u001a#\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0005¢\u0006\u0002\b\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00040\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/api/NormalizedCache$Companion;", "", "<init>", "()V", "", "Lkotlin/reflect/KClass;", "Lkotlin/jvm/JvmSuppressWildcards;", "", "Lcom/apollographql/apollo/cache/normalized/api/Record;", "dump", "prettifyDump", "(Ljava/util/Map;)Ljava/lang/String;", "pattern", "Lkotlin/text/Regex;", "patternToRegex", "(Ljava/lang/String;)Lkotlin/text/Regex;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String prettifyDump(java.util.Map<kotlin.reflect.KClass<?>, ? extends java.util.Map<java.lang.String, com.apollographql.apollo.cache.normalized.api.Record>> dump) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dump, "");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (java.util.Map.Entry<kotlin.reflect.KClass<?>, ? extends java.util.Map<java.lang.String, com.apollographql.apollo.cache.normalized.api.Record>> entry : dump.entrySet()) {
                kotlin.reflect.KClass<?> key = entry.getKey();
                java.util.Map<java.lang.String, com.apollographql.apollo.cache.normalized.api.Record> value = entry.getValue();
                sb.append(key.getSimpleName());
                sb.append(" {");
                for (java.util.Map.Entry<java.lang.String, com.apollographql.apollo.cache.normalized.api.Record> entry2 : value.entrySet()) {
                    java.lang.String key2 = entry2.getKey();
                    com.apollographql.apollo.cache.normalized.api.Record value2 = entry2.getValue();
                    sb.append("\n  \"");
                    sb.append(key2);
                    sb.append("\" : {");
                    for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry3 : value2.getFields().entrySet()) {
                        java.lang.String key3 = entry3.getKey();
                        java.lang.Object value3 = entry3.getValue();
                        sb.append("\n    \"");
                        sb.append(key3);
                        sb.append("\" : ");
                        if (value3 instanceof com.apollographql.apollo.cache.normalized.api.CacheKey) {
                            sb.append(value3);
                        } else if (value3 instanceof java.util.List) {
                            sb.append("[");
                            for (java.lang.Object obj : (java.util.List) value3) {
                                sb.append("\n      ");
                                sb.append(obj);
                            }
                            sb.append("\n    ]");
                        } else {
                            sb.append(value3);
                        }
                    }
                    sb.append("\n  }\n");
                }
                sb.append("}\n");
            }
            java.lang.String obj2 = sb.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
            return obj2;
        }

        public final kotlin.text.Regex patternToRegex(java.lang.String pattern) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pattern, "");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int length = pattern.length();
            boolean z = false;
            for (int i = 0; i < length; i++) {
                char charAt = pattern.charAt(i);
                if (z) {
                    if (charAt == '%') {
                        sb.append("%");
                    } else if (charAt == '\\') {
                        sb.append("\\\\");
                    } else if (charAt == '_') {
                        sb.append("_");
                    } else {
                        throw new java.lang.IllegalStateException("Invalid escape in pattern: ".concat(java.lang.String.valueOf(pattern)).toString());
                    }
                } else if (charAt == '\\') {
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    z = true;
                } else if (charAt == '%') {
                    sb.append(".*");
                } else if (charAt != '_') {
                    if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) com.apollographql.apollo.cache.normalized.api.NormalizedCache.getHighSpeedVideoFpsRangesFor, charAt, false, 2, (java.lang.Object) null)) {
                        sb.append("\\");
                    }
                    sb.append(charAt);
                } else {
                    sb.append(".");
                }
            }
            java.lang.String obj = sb.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            return new kotlin.text.Regex(obj, kotlin.text.RegexOption.IGNORE_CASE);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String prettifyDump(java.util.Map<kotlin.reflect.KClass<?>, ? extends java.util.Map<java.lang.String, com.apollographql.apollo.cache.normalized.api.Record>> map) {
        return INSTANCE.prettifyDump(map);
    }
}
