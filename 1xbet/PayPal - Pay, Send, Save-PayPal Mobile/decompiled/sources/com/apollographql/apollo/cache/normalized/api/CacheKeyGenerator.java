package com.apollographql.apollo.cache.normalized.api;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/api/CacheKeyGenerator;", "", "", "", "obj", "Lcom/apollographql/apollo/cache/normalized/api/CacheKeyGeneratorContext;", "context", "Lcom/apollographql/apollo/cache/normalized/api/CacheKey;", "cacheKeyForObject", "(Ljava/util/Map;Lcom/apollographql/apollo/cache/normalized/api/CacheKeyGeneratorContext;)Lcom/apollographql/apollo/cache/normalized/api/CacheKey;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CacheKeyGenerator {
    com.apollographql.apollo.cache.normalized.api.CacheKey cacheKeyForObject(java.util.Map<java.lang.String, ? extends java.lang.Object> obj, com.apollographql.apollo.cache.normalized.api.CacheKeyGeneratorContext context);
}
