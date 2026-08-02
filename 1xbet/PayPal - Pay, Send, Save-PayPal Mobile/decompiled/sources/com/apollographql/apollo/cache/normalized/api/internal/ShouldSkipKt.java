package com.apollographql.apollo.cache.normalized.api.internal;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a)\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a/\u0010\u000b\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\t0\b2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a)\u0010\u0006\u001a\u00020\u0005*\u00020\r2\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u000e"}, d2 = {"Lcom/apollographql/apollo/api/CompiledField;", "", "", "", "variableValues", "", "shouldSkip", "(Lcom/apollographql/apollo/api/CompiledField;Ljava/util/Map;)Z", "", "Lcom/apollographql/apollo/api/CompiledCondition;", "p0", "getHighSpeedVideoFpsRangesFor", "(Ljava/util/List;Ljava/util/Map;)Z", "Lcom/apollographql/apollo/api/CompiledFragment;", "(Lcom/apollographql/apollo/api/CompiledFragment;Ljava/util/Map;)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShouldSkipKt {
    public static final boolean shouldSkip(com.apollographql.apollo.api.CompiledField compiledField, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compiledField, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        return getHighSpeedVideoFpsRangesFor(compiledField.getCondition(), map);
    }

    private static final boolean getHighSpeedVideoFpsRangesFor(java.util.List<com.apollographql.apollo.api.CompiledCondition> list, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        boolean booleanValue;
        java.util.Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                return false;
            }
            com.apollographql.apollo.api.CompiledCondition compiledCondition = (com.apollographql.apollo.api.CompiledCondition) it.next();
            java.lang.Object obj = map.get(compiledCondition.getName());
            java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
            booleanValue = bool != null ? bool.booleanValue() : false;
            if (compiledCondition.getInverted()) {
                booleanValue = !booleanValue;
            }
        } while (booleanValue);
        return true;
    }

    public static final boolean shouldSkip(com.apollographql.apollo.api.CompiledFragment compiledFragment, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compiledFragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        return getHighSpeedVideoFpsRangesFor(compiledFragment.getCondition(), map);
    }
}
