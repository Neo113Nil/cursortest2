package com.apollographql.apollo.cache.normalized.api;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/api/TypePolicyCacheKeyGenerator;", "Lcom/apollographql/apollo/cache/normalized/api/CacheKeyGenerator;", "<init>", "()V", "", "", "", "obj", "Lcom/apollographql/apollo/cache/normalized/api/CacheKeyGeneratorContext;", "context", "Lcom/apollographql/apollo/cache/normalized/api/CacheKey;", "cacheKeyForObject", "(Ljava/util/Map;Lcom/apollographql/apollo/cache/normalized/api/CacheKeyGeneratorContext;)Lcom/apollographql/apollo/cache/normalized/api/CacheKey;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TypePolicyCacheKeyGenerator implements com.apollographql.apollo.cache.normalized.api.CacheKeyGenerator {
    public static final com.apollographql.apollo.cache.normalized.api.TypePolicyCacheKeyGenerator INSTANCE = new com.apollographql.apollo.cache.normalized.api.TypePolicyCacheKeyGenerator();

    private TypePolicyCacheKeyGenerator() {
    }

    @Override // com.apollographql.apollo.cache.normalized.api.CacheKeyGenerator
    public final com.apollographql.apollo.cache.normalized.api.CacheKey cacheKeyForObject(java.util.Map<java.lang.String, ? extends java.lang.Object> obj, com.apollographql.apollo.cache.normalized.api.CacheKeyGeneratorContext context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.util.List<java.lang.String> keyFields = com.apollographql.apollo.api.CompiledGraphQL.keyFields(context.getField().getType().rawType());
        if (keyFields.isEmpty()) {
            return null;
        }
        java.lang.String valueOf = java.lang.String.valueOf(obj.get("__typename"));
        java.util.List<java.lang.String> list = keyFields;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.String.valueOf(obj.get((java.lang.String) it.next())));
        }
        return new com.apollographql.apollo.cache.normalized.api.CacheKey(valueOf, arrayList);
    }
}
