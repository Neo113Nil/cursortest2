package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0019\u001a\u0004\u0018\u00010\u00122\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d"}, d2 = {"Lcom/apollographql/apollo/api/DefaultFakeResolver;", "Lcom/apollographql/apollo/api/FakeResolver;", "", "Lcom/apollographql/apollo/api/CompiledNamedType;", "types", "<init>", "(Ljava/util/List;)V", "Lcom/apollographql/apollo/api/FakeResolverContext;", "context", "", "resolveLeaf", "(Lcom/apollographql/apollo/api/FakeResolverContext;)Ljava/lang/Object;", "", "resolveListSize", "(Lcom/apollographql/apollo/api/FakeResolverContext;)I", "", "resolveMaybeNull", "(Lcom/apollographql/apollo/api/FakeResolverContext;)Z", "", "resolveTypename", "(Lcom/apollographql/apollo/api/FakeResolverContext;)Ljava/lang/String;", "", "obj", "Lcom/apollographql/apollo/api/CompiledField;", "mergedField", "stableIdForObject", "(Ljava/util/Map;Lcom/apollographql/apollo/api/CompiledField;)Ljava/lang/String;", "Lcom/apollographql/apollo/api/EnumType;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public class DefaultFakeResolver implements com.apollographql.apollo.api.FakeResolver {
    private final java.util.List<com.apollographql.apollo.api.CompiledNamedType> getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.List<com.apollographql.apollo.api.EnumType> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultFakeResolver(java.util.List<? extends com.apollographql.apollo.api.CompiledNamedType> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (obj instanceof com.apollographql.apollo.api.EnumType) {
                arrayList.add(obj);
            }
        }
        this.getHighSpeedVideoFpsRangesFor = arrayList;
        this.getHighResolutionOutputSizeshNQ4ISI = list;
    }

    @Override // com.apollographql.apollo.api.FakeResolver
    public java.lang.Object resolveLeaf(com.apollographql.apollo.api.FakeResolverContext context) {
        java.lang.Object obj;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.String name2 = context.getMergedField().getType().rawType().getName();
        switch (name2.hashCode()) {
            case -1808118735:
                if (name2.equals("String")) {
                    java.util.List<java.lang.Object> path = context.getPath();
                    java.util.ListIterator<java.lang.Object> listIterator = path.listIterator(path.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            i = -1;
                        } else if (listIterator.previous() instanceof java.lang.String) {
                            i = listIterator.nextIndex();
                        }
                    }
                    return kotlin.collections.CollectionsKt.joinToString$default(context.getPath().subList(i, context.getPath().size()), "", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.apollographql.apollo.api.DefaultFakeResolver$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.apollographql.apollo.api.DefaultFakeResolver.$r8$lambda$m8o7MEyCI_Pd3OvU5pve1IzgpP4(com.apollographql.apollo.api.DefaultFakeResolver.this, obj2);
                        }
                    }, 30, null);
                }
                break;
            case 2331:
                if (name2.equals("ID")) {
                    return java.lang.String.valueOf(java.lang.Math.abs(context.getId().hashCode()));
                }
                break;
            case 73679:
                if (name2.equals("Int")) {
                    return java.lang.Integer.valueOf(context.getId().hashCode() % 100);
                }
                break;
            case 67973692:
                if (name2.equals("Float")) {
                    return java.lang.Double.valueOf((context.getId().hashCode() % androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength) / 100.0d);
                }
                break;
            case 1729365000:
                if (name2.equals("Boolean")) {
                    return java.lang.Boolean.valueOf(context.getId().hashCode() % 2 == 0);
                }
                break;
        }
        java.util.Iterator<T> it = this.getHighSpeedVideoFpsRangesFor.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.apollographql.apollo.api.EnumType) obj).getName(), name2)) {
                }
            } else {
                obj = null;
            }
        }
        com.apollographql.apollo.api.EnumType enumType = (com.apollographql.apollo.api.EnumType) obj;
        if (enumType == null) {
            throw new java.lang.IllegalStateException("Don't know how to instantiate leaf ".concat(java.lang.String.valueOf(name2)).toString());
        }
        java.util.List<java.lang.String> values = enumType.getValues();
        int hashCode = context.getId().hashCode();
        int size = enumType.getValues().size();
        int i2 = hashCode % size;
        return values.get(i2 + (size & (((i2 ^ size) & ((-i2) | i2)) >> 31)));
    }

    @Override // com.apollographql.apollo.api.FakeResolver
    public java.lang.String resolveTypename(com.apollographql.apollo.api.FakeResolverContext context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.util.List<com.apollographql.apollo.api.ObjectType> possibleTypes = com.apollographql.apollo.api.PossibleTypes.possibleTypes(this.getHighResolutionOutputSizeshNQ4ISI, context.getMergedField().getType().rawType());
        int hashCode = context.getId().hashCode();
        int size = possibleTypes.size();
        int i = hashCode % size;
        return possibleTypes.get(i + (size & ((((-i) | i) & (i ^ size)) >> 31))).getName();
    }

    @Override // com.apollographql.apollo.api.FakeResolver
    public java.lang.String stableIdForObject(java.util.Map<java.lang.String, ? extends java.lang.Object> obj, com.apollographql.apollo.api.CompiledField mergedField) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mergedField, "");
        java.util.List<java.lang.String> keyFields = com.apollographql.apollo.api.CompiledGraphQL.keyFields(mergedField.getType().rawType());
        if (obj.containsKey("__stableId")) {
            return java.lang.String.valueOf(obj.get("__stableId"));
        }
        if (keyFields.isEmpty()) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(java.lang.String.valueOf(obj.get("__typename")));
        java.util.Iterator<T> it = keyFields.iterator();
        while (it.hasNext()) {
            sb.append(java.lang.String.valueOf(obj.get((java.lang.String) it.next())));
        }
        java.lang.String obj2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
        return obj2;
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$m8o7MEyCI_Pd3OvU5pve1IzgpP4(com.apollographql.apollo.api.DefaultFakeResolver defaultFakeResolver, java.lang.Object obj) {
        java.lang.String obj2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        if (obj instanceof java.lang.Integer) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
            sb.append(((java.lang.Number) obj).intValue());
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
            obj2 = sb.toString();
        } else {
            obj2 = obj.toString();
        }
        return obj2;
    }

    @Override // com.apollographql.apollo.api.FakeResolver
    public boolean resolveMaybeNull(com.apollographql.apollo.api.FakeResolverContext context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return false;
    }

    @Override // com.apollographql.apollo.api.FakeResolver
    public int resolveListSize(com.apollographql.apollo.api.FakeResolverContext context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return 3;
    }
}
