package com.apollographql.apollo.cache.normalized.api;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JD\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0019\u0010\f\u001a\u0015\u0012\u0004\u0012\u00020\t\u0012\u000b\u0012\t\u0018\u00010\n¢\u0006\u0002\b\u000b0\b2\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/api/FieldPolicyCacheResolver;", "Lcom/apollographql/apollo/cache/normalized/api/CacheResolver;", "<init>", "()V", "Lcom/apollographql/apollo/api/CompiledField;", "field", "Lcom/apollographql/apollo/api/Executable$Variables;", "variables", "", "", "", "Lkotlin/jvm/JvmSuppressWildcards;", "parent", "parentId", "resolveField", "(Lcom/apollographql/apollo/api/CompiledField;Lcom/apollographql/apollo/api/Executable$Variables;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FieldPolicyCacheResolver implements com.apollographql.apollo.cache.normalized.api.CacheResolver {
    public static final com.apollographql.apollo.cache.normalized.api.FieldPolicyCacheResolver INSTANCE = new com.apollographql.apollo.cache.normalized.api.FieldPolicyCacheResolver();

    private FieldPolicyCacheResolver() {
    }

    @Override // com.apollographql.apollo.cache.normalized.api.CacheResolver
    public final java.lang.Object resolveField(com.apollographql.apollo.api.CompiledField field, com.apollographql.apollo.api.Executable.Variables variables, java.util.Map<java.lang.String, java.lang.Object> parent, java.lang.String parentId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variables, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentId, "");
        java.util.Collection<java.lang.Object> values = field.argumentValues(variables, new kotlin.jvm.functions.Function1() { // from class: com.apollographql.apollo.cache.normalized.api.FieldPolicyCacheResolver$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(com.apollographql.apollo.cache.normalized.api.FieldPolicyCacheResolver.$r8$lambda$FLuCDLOywa7uM8peHdEWQDry_kM((com.apollographql.apollo.api.CompiledArgument) obj));
            }
        }).values();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(values, 10));
        java.util.Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.String.valueOf(it.next()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            return new com.apollographql.apollo.cache.normalized.api.CacheKey(field.getType().rawType().getName(), arrayList2);
        }
        return com.apollographql.apollo.cache.normalized.api.DefaultCacheResolver.INSTANCE.resolveField(field, variables, parent, parentId);
    }

    public static /* synthetic */ boolean $r8$lambda$FLuCDLOywa7uM8peHdEWQDry_kM(com.apollographql.apollo.api.CompiledArgument compiledArgument) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compiledArgument, "");
        return compiledArgument.getDefinition().getIsKey();
    }
}
