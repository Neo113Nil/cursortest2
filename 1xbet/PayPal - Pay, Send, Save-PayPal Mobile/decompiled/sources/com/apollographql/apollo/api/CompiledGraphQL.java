package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\f\u001a\u0004\u0018\u00010\u00072\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u0010\u001a\u00020\u000f*\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015\"\u001a\u0010\u0017\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u0019\u0010\u001a\"\u001a\u0010\u001b\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u0012\u0004\b\u001c\u0010\u001a\"\u001a\u0010\u001d\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u0012\u0004\b\u001e\u0010\u001a\"\u001a\u0010\u001f\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u0012\u0004\b \u0010\u001a\"\u001a\u0010!\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0018\u0012\u0004\b\"\u0010\u001a\"\u001a\u0010#\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0018\u0012\u0004\b$\u0010\u001a*\u000e\u0010%\"\u0004\u0018\u00010\u00072\u0004\u0018\u00010\u0007"}, d2 = {"Lcom/apollographql/apollo/api/CompiledType;", "Lcom/apollographql/apollo/api/CompiledNotNullType;", "-notNull", "(Lcom/apollographql/apollo/api/CompiledType;)Lcom/apollographql/apollo/api/CompiledNotNullType;", "Lcom/apollographql/apollo/api/CompiledListType;", "-list", "(Lcom/apollographql/apollo/api/CompiledType;)Lcom/apollographql/apollo/api/CompiledListType;", "", "Lcom/apollographql/apollo/api/json/ApolloJsonElement;", "p0", "Lcom/apollographql/apollo/api/Executable$Variables;", "p1", "getHighSpeedVideoFpsRanges", "(Ljava/lang/Object;Lcom/apollographql/apollo/api/Executable$Variables;)Ljava/lang/Object;", "Lcom/apollographql/apollo/api/CompiledNamedType;", "", "isComposite", "(Lcom/apollographql/apollo/api/CompiledNamedType;)Z", "", "", "keyFields", "(Lcom/apollographql/apollo/api/CompiledNamedType;)Ljava/util/List;", "Lcom/apollographql/apollo/api/ObjectType;", "CompiledSchemaType", "Lcom/apollographql/apollo/api/ObjectType;", "getCompiledSchemaType$annotations", "()V", "CompiledTypeType", "getCompiledTypeType$annotations", "CompiledFieldType", "getCompiledFieldType$annotations", "CompiledInputValueType", "getCompiledInputValueType$annotations", "CompiledEnumValueType", "getCompiledEnumValueType$annotations", "CompiledDirectiveType", "getCompiledDirectiveType$annotations", "CompiledValue"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CompiledGraphQL {
    public static final com.apollographql.apollo.api.ObjectType CompiledSchemaType = new com.apollographql.apollo.api.ObjectType.Builder("__Schema").build();
    public static final com.apollographql.apollo.api.ObjectType CompiledTypeType = new com.apollographql.apollo.api.ObjectType.Builder("__Type").build();
    public static final com.apollographql.apollo.api.ObjectType CompiledFieldType = new com.apollographql.apollo.api.ObjectType.Builder("__Field").build();
    public static final com.apollographql.apollo.api.ObjectType CompiledInputValueType = new com.apollographql.apollo.api.ObjectType.Builder("__InputValue").build();
    public static final com.apollographql.apollo.api.ObjectType CompiledEnumValueType = new com.apollographql.apollo.api.ObjectType.Builder("__EnumValue").build();
    public static final com.apollographql.apollo.api.ObjectType CompiledDirectiveType = new com.apollographql.apollo.api.ObjectType.Builder("__Directive").build();

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Introspection types are now generated like other types. Use the generated class instead.")
    public static /* synthetic */ void getCompiledDirectiveType$annotations() {
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Introspection types are now generated like other types. Use the generated class instead.")
    public static /* synthetic */ void getCompiledEnumValueType$annotations() {
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Introspection types are now generated like other types. Use the generated class instead.")
    public static /* synthetic */ void getCompiledFieldType$annotations() {
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Introspection types are now generated like other types. Use the generated class instead.")
    public static /* synthetic */ void getCompiledInputValueType$annotations() {
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Introspection types are now generated like other types. Use the generated class instead.")
    public static /* synthetic */ void getCompiledSchemaType$annotations() {
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Introspection types are now generated like other types. Use the generated class instead.")
    public static /* synthetic */ void getCompiledTypeType$annotations() {
    }

    /* renamed from: -notNull, reason: not valid java name */
    public static final com.apollographql.apollo.api.CompiledNotNullType m9948notNull(com.apollographql.apollo.api.CompiledType compiledType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compiledType, "");
        return new com.apollographql.apollo.api.CompiledNotNullType(compiledType);
    }

    /* renamed from: -list, reason: not valid java name */
    public static final com.apollographql.apollo.api.CompiledListType m9947list(com.apollographql.apollo.api.CompiledType compiledType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compiledType, "");
        return new com.apollographql.apollo.api.CompiledListType(compiledType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object getHighSpeedVideoFpsRanges(java.lang.Object obj, com.apollographql.apollo.api.Executable.Variables variables) {
        java.lang.Object highSpeedVideoFpsRanges;
        kotlin.Pair pair;
        if (obj == null) {
            return null;
        }
        if (obj instanceof com.apollographql.apollo.api.CompiledVariable) {
            throw new java.lang.IllegalStateException("must be checked by the caller".toString());
        }
        if (obj instanceof java.util.Map) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.util.Map.Entry entry : ((java.util.Map) obj).entrySet()) {
                java.lang.Object value = entry.getValue();
                if (value instanceof com.apollographql.apollo.api.CompiledVariable) {
                    com.apollographql.apollo.api.CompiledVariable compiledVariable = (com.apollographql.apollo.api.CompiledVariable) value;
                    pair = variables.getValueMap().containsKey(compiledVariable.getName()) ? kotlin.TuplesKt.to(entry.getKey(), variables.getValueMap().get(compiledVariable.getName())) : null;
                } else {
                    pair = kotlin.TuplesKt.to(entry.getKey(), getHighSpeedVideoFpsRanges(value, variables));
                }
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            return kotlin.collections.MapsKt.toMap(kotlin.collections.CollectionsKt.sortedWith(kotlin.collections.CollectionsKt.toList(arrayList), new java.util.Comparator() { // from class: com.apollographql.apollo.api.CompiledGraphQL$resolveVariables$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return kotlin.comparisons.ComparisonsKt.compareValues((java.lang.String) ((kotlin.Pair) t).getFirst(), (java.lang.String) ((kotlin.Pair) t2).getFirst());
                }
            }));
        }
        if (!(obj instanceof java.util.List)) {
            return obj;
        }
        java.lang.Iterable iterable = (java.lang.Iterable) obj;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (java.lang.Object obj2 : iterable) {
            if (obj2 instanceof com.apollographql.apollo.api.CompiledVariable) {
                com.apollographql.apollo.api.CompiledVariable compiledVariable2 = (com.apollographql.apollo.api.CompiledVariable) obj2;
                highSpeedVideoFpsRanges = variables.getValueMap().containsKey(compiledVariable2.getName()) ? variables.getValueMap().get(compiledVariable2.getName()) : null;
            } else {
                highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(obj2, variables);
            }
            arrayList2.add(highSpeedVideoFpsRanges);
        }
        return arrayList2;
    }

    public static final boolean isComposite(com.apollographql.apollo.api.CompiledNamedType compiledNamedType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compiledNamedType, "");
        return (compiledNamedType instanceof com.apollographql.apollo.api.UnionType) || (compiledNamedType instanceof com.apollographql.apollo.api.InterfaceType) || (compiledNamedType instanceof com.apollographql.apollo.api.ObjectType);
    }

    public static final java.util.List<java.lang.String> keyFields(com.apollographql.apollo.api.CompiledNamedType compiledNamedType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compiledNamedType, "");
        return compiledNamedType instanceof com.apollographql.apollo.api.InterfaceType ? ((com.apollographql.apollo.api.InterfaceType) compiledNamedType).getKeyFields() : compiledNamedType instanceof com.apollographql.apollo.api.ObjectType ? ((com.apollographql.apollo.api.ObjectType) compiledNamedType).getKeyFields() : kotlin.collections.CollectionsKt.emptyList();
    }
}
