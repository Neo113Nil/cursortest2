package com.apollographql.apollo.cache.normalized.api;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ)\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJB\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0019\u0010\u0012\u001a\u0015\u0012\u0004\u0012\u00020\u000f\u0012\u000b\u0012\t\u0018\u00010\u0010¢\u0006\u0002\b\u00110\u000e2\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/api/CacheKeyResolver;", "Lcom/apollographql/apollo/cache/normalized/api/CacheResolver;", "<init>", "()V", "Lcom/apollographql/apollo/api/CompiledField;", "field", "Lcom/apollographql/apollo/api/Executable$Variables;", "variables", "Lcom/apollographql/apollo/cache/normalized/api/CacheKey;", "cacheKeyForField", "(Lcom/apollographql/apollo/api/CompiledField;Lcom/apollographql/apollo/api/Executable$Variables;)Lcom/apollographql/apollo/cache/normalized/api/CacheKey;", "", "listOfCacheKeysForField", "(Lcom/apollographql/apollo/api/CompiledField;Lcom/apollographql/apollo/api/Executable$Variables;)Ljava/util/List;", "", "", "", "Lkotlin/jvm/JvmSuppressWildcards;", "parent", "parentId", "resolveField", "(Lcom/apollographql/apollo/api/CompiledField;Lcom/apollographql/apollo/api/Executable$Variables;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class CacheKeyResolver implements com.apollographql.apollo.cache.normalized.api.CacheResolver {
    public abstract com.apollographql.apollo.cache.normalized.api.CacheKey cacheKeyForField(com.apollographql.apollo.api.CompiledField field, com.apollographql.apollo.api.Executable.Variables variables);

    @Override // com.apollographql.apollo.cache.normalized.api.CacheResolver
    public final java.lang.Object resolveField(com.apollographql.apollo.api.CompiledField field, com.apollographql.apollo.api.Executable.Variables variables, java.util.Map<java.lang.String, java.lang.Object> parent, java.lang.String parentId) {
        java.util.List<com.apollographql.apollo.cache.normalized.api.CacheKey> listOfCacheKeysForField;
        com.apollographql.apollo.cache.normalized.api.CacheKey cacheKeyForField;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variables, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentId, "");
        com.apollographql.apollo.api.CompiledType type = field.getType();
        if (type instanceof com.apollographql.apollo.api.CompiledNotNullType) {
            type = ((com.apollographql.apollo.api.CompiledNotNullType) type).getOfType();
        }
        if ((type instanceof com.apollographql.apollo.api.CompiledNamedType) && com.apollographql.apollo.api.CompiledGraphQL.isComposite((com.apollographql.apollo.api.CompiledNamedType) type) && (cacheKeyForField = cacheKeyForField(field, variables)) != null) {
            return cacheKeyForField;
        }
        if (type instanceof com.apollographql.apollo.api.CompiledListType) {
            com.apollographql.apollo.api.CompiledType ofType = ((com.apollographql.apollo.api.CompiledListType) type).getOfType();
            if (ofType instanceof com.apollographql.apollo.api.CompiledNotNullType) {
                ofType = ((com.apollographql.apollo.api.CompiledNotNullType) ofType).getOfType();
            }
            if ((ofType instanceof com.apollographql.apollo.api.CompiledNamedType) && com.apollographql.apollo.api.CompiledGraphQL.isComposite((com.apollographql.apollo.api.CompiledNamedType) ofType) && (listOfCacheKeysForField = listOfCacheKeysForField(field, variables)) != null) {
                return listOfCacheKeysForField;
            }
        }
        return com.apollographql.apollo.cache.normalized.api.DefaultCacheResolver.INSTANCE.resolveField(field, variables, parent, parentId);
    }

    public java.util.List<com.apollographql.apollo.cache.normalized.api.CacheKey> listOfCacheKeysForField(com.apollographql.apollo.api.CompiledField field, com.apollographql.apollo.api.Executable.Variables variables) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variables, "");
        return null;
    }
}
