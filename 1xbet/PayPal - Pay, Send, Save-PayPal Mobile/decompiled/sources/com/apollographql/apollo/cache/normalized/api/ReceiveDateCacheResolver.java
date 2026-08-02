package com.apollographql.apollo.cache.normalized.api;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JD\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0019\u0010\u000e\u001a\u0015\u0012\u0004\u0012\u00020\u000b\u0012\u000b\u0012\t\u0018\u00010\f¢\u0006\u0002\b\r0\n2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/api/ReceiveDateCacheResolver;", "Lcom/apollographql/apollo/cache/normalized/api/CacheResolver;", "", "maxAge", "<init>", "(I)V", "Lcom/apollographql/apollo/api/CompiledField;", "field", "Lcom/apollographql/apollo/api/Executable$Variables;", "variables", "", "", "", "Lkotlin/jvm/JvmSuppressWildcards;", "parent", "parentId", "resolveField", "(Lcom/apollographql/apollo/api/CompiledField;Lcom/apollographql/apollo/api/Executable$Variables;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReceiveDateCacheResolver implements com.apollographql.apollo.cache.normalized.api.CacheResolver {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;

    public ReceiveDateCacheResolver(int i) {
        this.getHighSpeedVideoSizes = i;
    }

    @Override // com.apollographql.apollo.cache.normalized.api.CacheResolver
    public final java.lang.Object resolveField(com.apollographql.apollo.api.CompiledField field, com.apollographql.apollo.api.Executable.Variables variables, java.util.Map<java.lang.String, java.lang.Object> parent, java.lang.String parentId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variables, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentId, "");
        java.lang.String nameWithArguments = field.nameWithArguments(variables);
        if (!parent.containsKey(nameWithArguments)) {
            throw new com.apollographql.apollo.exception.CacheMissException(parentId, nameWithArguments);
        }
        if (parent instanceof com.apollographql.apollo.cache.normalized.api.Record) {
            java.util.Map<java.lang.String, java.lang.Long> date = ((com.apollographql.apollo.cache.normalized.api.Record) parent).getDate();
            java.lang.Long l = date != null ? date.get(nameWithArguments) : null;
            if (l != null && (com.apollographql.apollo.mpp.UtilsKt.currentTimeMillis() / 1000) - l.longValue() > this.getHighSpeedVideoSizes) {
                throw new com.apollographql.apollo.exception.CacheMissException(parentId, nameWithArguments, true);
            }
        }
        return parent.get(nameWithArguments);
    }
}
