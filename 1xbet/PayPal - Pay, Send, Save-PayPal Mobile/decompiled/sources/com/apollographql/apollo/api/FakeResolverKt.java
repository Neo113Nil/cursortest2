package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0007\u001a1\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000b*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\r\u001aW\u0010\b\u001a\u0004\u0018\u00010\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\n0\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\b\u0010\u0016\u001aW\u0010\u0017\u001a\u0004\u0018\u00010\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\n0\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016\u001a]\u0010 \u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u001c\u001a\u00020\u00032\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u0014¢\u0006\u0004\b \u0010!\u001a|\u0010 \u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0018\"\f\b\u0001\u0010#*\u0006\u0012\u0002\b\u00030\"2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00010$2\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020'0&¢\u0006\u0002\b(2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u0014¢\u0006\u0004\b \u0010*"}, d2 = {"", "Lcom/apollographql/apollo/api/CompiledSelection;", "p0", "", "p1", "Lcom/apollographql/apollo/api/CompiledField;", "getHighSpeedVideoSizes", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "", "", "Lcom/apollographql/apollo/api/Optional;", "getHighSpeedVideoFpsRanges", "(Ljava/util/Map;Ljava/lang/String;)Lcom/apollographql/apollo/api/Optional;", "p2", "Lcom/apollographql/apollo/api/FakeResolver;", "p3", "p4", "Lcom/apollographql/apollo/api/CompiledType;", "p5", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "p6", "(Ljava/util/List;Ljava/lang/String;Lcom/apollographql/apollo/api/CompiledField;Lcom/apollographql/apollo/api/FakeResolver;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/CompiledType;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "T", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "selections", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TYPENAME, "map", "resolver", "customScalarAdapters", "buildData", "(Lcom/apollographql/apollo/api/Adapter;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Lcom/apollographql/apollo/api/FakeResolver;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Ljava/lang/Object;", "Lcom/apollographql/apollo/api/ObjectBuilder;", "Builder", "Lcom/apollographql/apollo/api/BuilderFactory;", "builderFactory", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "(Lcom/apollographql/apollo/api/BuilderFactory;Lkotlin/jvm/functions/Function1;Lcom/apollographql/apollo/api/Adapter;Ljava/util/List;Ljava/lang/String;Lcom/apollographql/apollo/api/FakeResolver;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FakeResolverKt {
    private static final java.util.List<com.apollographql.apollo.api.CompiledField> getHighSpeedVideoSizes(java.util.List<? extends com.apollographql.apollo.api.CompiledSelection> list, java.lang.String str) {
        java.util.List<com.apollographql.apollo.api.CompiledField> emptyList;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.apollographql.apollo.api.CompiledSelection compiledSelection : list) {
            if (compiledSelection instanceof com.apollographql.apollo.api.CompiledField) {
                emptyList = kotlin.collections.CollectionsKt.listOf(compiledSelection);
            } else {
                if (!(compiledSelection instanceof com.apollographql.apollo.api.CompiledFragment)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.apollographql.apollo.api.CompiledFragment compiledFragment = (com.apollographql.apollo.api.CompiledFragment) compiledSelection;
                if (compiledFragment.getPossibleTypes().contains(str)) {
                    emptyList = getHighSpeedVideoSizes(compiledFragment.getSelections(), str);
                } else {
                    emptyList = kotlin.collections.CollectionsKt.emptyList();
                }
            }
            kotlin.collections.CollectionsKt.addAll(arrayList, emptyList);
        }
        return arrayList;
    }

    private static final java.util.List<com.apollographql.apollo.api.CompiledField> getHighSpeedVideoFpsRangesFor(java.util.List<? extends com.apollographql.apollo.api.CompiledSelection> list, java.lang.String str) {
        java.util.List<com.apollographql.apollo.api.CompiledField> highSpeedVideoSizes = getHighSpeedVideoSizes(list, str);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj : highSpeedVideoSizes) {
            java.lang.String responseName = ((com.apollographql.apollo.api.CompiledField) obj).getResponseName();
            java.lang.Object obj2 = linkedHashMap.get(responseName);
            if (obj2 == null) {
                obj2 = (java.util.List) new java.util.ArrayList();
                linkedHashMap.put(responseName, obj2);
            }
            ((java.util.List) obj2).add(obj);
        }
        java.util.Collection<java.util.List> values = linkedHashMap.values();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(values, 10));
        for (java.util.List list2 : values) {
            com.apollographql.apollo.api.CompiledField compiledField = (com.apollographql.apollo.api.CompiledField) kotlin.collections.CollectionsKt.first(list2);
            com.apollographql.apollo.api.CompiledField.Builder alias = new com.apollographql.apollo.api.CompiledField.Builder(compiledField.getName(), compiledField.getType()).alias(compiledField.getAlias());
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                kotlin.collections.CollectionsKt.addAll(arrayList2, ((com.apollographql.apollo.api.CompiledField) it.next()).getSelections());
            }
            arrayList.add(alias.selections(arrayList2).build());
        }
        return arrayList;
    }

    private static final com.apollographql.apollo.api.Optional<java.lang.Object> getHighSpeedVideoFpsRanges(java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.lang.String str) {
        if (map.containsKey(str)) {
            return new com.apollographql.apollo.api.Optional.Present(map.get(str));
        }
        return com.apollographql.apollo.api.Optional.Absent.INSTANCE;
    }

    private static final java.lang.Object getHighSpeedVideoFpsRangesFor(java.util.List<? extends java.lang.Object> list, java.lang.String str, com.apollographql.apollo.api.CompiledField compiledField, com.apollographql.apollo.api.FakeResolver fakeResolver, com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional, com.apollographql.apollo.api.CompiledType compiledType, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
        while (true) {
            boolean z = optional instanceof com.apollographql.apollo.api.Optional.Present;
            if (z && (((com.apollographql.apollo.api.Optional.Present) optional).getValue() instanceof com.apollographql.apollo.api.Optional.Absent)) {
                return com.apollographql.apollo.api.Optional.Absent.INSTANCE;
            }
            if (compiledType instanceof com.apollographql.apollo.api.CompiledNotNullType) {
                return getHighResolutionOutputSizeshNQ4ISI(list, str, compiledField, fakeResolver, optional, ((com.apollographql.apollo.api.CompiledNotNullType) compiledType).getOfType(), customScalarAdapters);
            }
            if (z) {
                if (((com.apollographql.apollo.api.Optional.Present) optional).getValue() == null) {
                    return null;
                }
                compiledType = new com.apollographql.apollo.api.CompiledNotNullType(compiledType);
            } else {
                if (fakeResolver.resolveMaybeNull(new com.apollographql.apollo.api.FakeResolverContext(list, str, compiledField))) {
                    return null;
                }
                compiledType = new com.apollographql.apollo.api.CompiledNotNullType(compiledType);
            }
        }
    }

    private static final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.util.List<? extends java.lang.Object> list, java.lang.String str, com.apollographql.apollo.api.CompiledField compiledField, com.apollographql.apollo.api.FakeResolver fakeResolver, com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional, com.apollographql.apollo.api.CompiledType compiledType, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
        java.lang.String str2 = str;
        com.apollographql.apollo.api.Adapter adapter = null;
        if (compiledType instanceof com.apollographql.apollo.api.CompiledListType) {
            if (optional instanceof com.apollographql.apollo.api.Optional.Present) {
                java.lang.Object value = ((com.apollographql.apollo.api.Optional.Present) optional).getValue();
                java.util.List list2 = value instanceof java.util.List ? (java.util.List) value : null;
                if (list2 == null) {
                    throw new java.lang.IllegalStateException("".toString());
                }
                java.util.List list3 = list2;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                int i = 0;
                for (java.lang.Object obj : list3) {
                    if (i < 0) {
                        kotlin.collections.CollectionsKt.throwIndexOverflow();
                    }
                    arrayList.add(getHighSpeedVideoFpsRangesFor(kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends java.lang.Integer>) list, java.lang.Integer.valueOf(i)), str, compiledField, fakeResolver, new com.apollographql.apollo.api.Optional.Present(obj), ((com.apollographql.apollo.api.CompiledListType) compiledType).getOfType(), customScalarAdapters));
                    i++;
                }
                return arrayList;
            }
            kotlin.ranges.IntRange until = kotlin.ranges.RangesKt.until(0, fakeResolver.resolveListSize(new com.apollographql.apollo.api.FakeResolverContext(list, str2, compiledField)));
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(until, 10));
            java.util.Iterator<java.lang.Integer> it = until.iterator();
            while (it.hasNext()) {
                int nextInt = ((kotlin.collections.IntIterator) it).nextInt();
                java.util.List plus = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends java.lang.Integer>) list, java.lang.Integer.valueOf(nextInt));
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str2);
                sb.append(nextInt);
                arrayList2.add(getHighSpeedVideoFpsRangesFor(plus, sb.toString(), compiledField, fakeResolver, com.apollographql.apollo.api.Optional.Absent.INSTANCE, ((com.apollographql.apollo.api.CompiledListType) compiledType).getOfType(), customScalarAdapters));
            }
            return arrayList2;
        }
        if (compiledType instanceof com.apollographql.apollo.api.CompiledNamedType) {
            if (optional instanceof com.apollographql.apollo.api.Optional.Present) {
                if (!compiledField.getSelections().isEmpty()) {
                    java.lang.Object value2 = ((com.apollographql.apollo.api.Optional.Present) optional).getValue();
                    java.util.Map<java.lang.String, ? extends java.lang.Object> map = value2 instanceof java.util.Map ? (java.util.Map) value2 : null;
                    if (map == null) {
                        throw new java.lang.IllegalStateException("".toString());
                    }
                    java.lang.Object obj2 = map.get("__typename");
                    java.lang.String str3 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
                    if (str3 == null) {
                        throw new java.lang.IllegalStateException("When building fallback types, you must specify '__typename'".toString());
                    }
                    java.lang.String stableIdForObject = fakeResolver.stableIdForObject(map, compiledField);
                    if (stableIdForObject != null) {
                        str2 = stableIdForObject;
                    }
                    java.util.List<com.apollographql.apollo.api.CompiledField> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(compiledField.getSelections(), str3);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    for (com.apollographql.apollo.api.CompiledField compiledField2 : highSpeedVideoFpsRangesFor) {
                        java.util.List plus2 = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends java.lang.String>) list, compiledField2.getResponseName());
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append(str2);
                        sb2.append(compiledField2.getResponseName());
                        java.lang.Object highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(plus2, sb2.toString(), compiledField2, fakeResolver, getHighSpeedVideoFpsRanges(map, compiledField2.getResponseName()), compiledField2.getType(), customScalarAdapters);
                        kotlin.Pair pair = highSpeedVideoFpsRangesFor2 instanceof com.apollographql.apollo.api.Optional.Absent ? null : kotlin.TuplesKt.to(compiledField2.getResponseName(), highSpeedVideoFpsRangesFor2);
                        if (pair != null) {
                            arrayList3.add(pair);
                        }
                    }
                    return kotlin.collections.MapsKt.toMap(arrayList3);
                }
                return ((com.apollographql.apollo.api.Optional.Present) optional).getValue();
            }
            if (!compiledField.getSelections().isEmpty()) {
                java.lang.String resolveTypename = fakeResolver.resolveTypename(new com.apollographql.apollo.api.FakeResolverContext(list, str2, compiledField));
                java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("__typename", resolveTypename));
                java.util.List<com.apollographql.apollo.api.CompiledField> highSpeedVideoFpsRangesFor3 = getHighSpeedVideoFpsRangesFor(compiledField.getSelections(), resolveTypename);
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(highSpeedVideoFpsRangesFor3, 10)), 16));
                for (com.apollographql.apollo.api.CompiledField compiledField3 : highSpeedVideoFpsRangesFor3) {
                    java.util.List plus3 = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends java.lang.String>) list, compiledField3.getResponseName());
                    kotlin.Pair pair2 = kotlin.TuplesKt.to(compiledField3.getResponseName(), getHighSpeedVideoFpsRangesFor(plus3, kotlin.collections.CollectionsKt.joinToString$default(plus3, null, null, null, 0, null, null, 63, null), compiledField3, fakeResolver, getHighSpeedVideoFpsRanges(mapOf, compiledField3.getResponseName()), compiledField3.getType(), customScalarAdapters));
                    linkedHashMap.put(pair2.getFirst(), pair2.getSecond());
                }
                return linkedHashMap;
            }
            java.lang.Object resolveLeaf = fakeResolver.resolveLeaf(new com.apollographql.apollo.api.FakeResolverContext(list, str2, compiledField));
            if (!(compiledType instanceof com.apollographql.apollo.api.CustomScalarType)) {
                return resolveLeaf;
            }
            try {
                adapter = customScalarAdapters.responseAdapterFor((com.apollographql.apollo.api.CustomScalarType) compiledType);
            } catch (java.lang.Exception unused) {
            }
            return adapter != null ? com.apollographql.apollo.api.ObjectBuilderKt.adaptValue(adapter, resolveLeaf) : resolveLeaf;
        }
        if (compiledType instanceof com.apollographql.apollo.api.CompiledNotNullType) {
            throw new java.lang.IllegalStateException("".toString());
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final <T> T buildData(com.apollographql.apollo.api.Adapter<T> adapter, java.util.List<? extends com.apollographql.apollo.api.CompiledSelection> list, java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map, com.apollographql.apollo.api.FakeResolver fakeResolver, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fakeResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        com.apollographql.apollo.api.ObjectAdapter m9939obj = com.apollographql.apollo.api.Adapters.m9939obj(adapter, false);
        java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(kotlin.collections.CollectionsKt.emptyList(), "", new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, new com.apollographql.apollo.api.CompiledNotNullType(new com.apollographql.apollo.api.ObjectType.Builder(str).build())).selections(list).build(), fakeResolver, new com.apollographql.apollo.api.Optional.Present(map), new com.apollographql.apollo.api.CompiledNotNullType(new com.apollographql.apollo.api.ObjectType.Builder(str).build()), customScalarAdapters);
        kotlin.jvm.internal.Intrinsics.checkNotNull(highSpeedVideoFpsRangesFor, "");
        return (T) m9939obj.fromJson(new com.apollographql.apollo.api.json.MapJsonReader((java.util.Map) highSpeedVideoFpsRangesFor, null, 2, null), com.apollographql.apollo.api.CustomScalarAdapters.PassThrough);
    }

    public static final <T, Builder extends com.apollographql.apollo.api.ObjectBuilder<?>> T buildData(com.apollographql.apollo.api.BuilderFactory<? extends Builder> builderFactory, kotlin.jvm.functions.Function1<? super Builder, kotlin.Unit> function1, com.apollographql.apollo.api.Adapter<T> adapter, java.util.List<? extends com.apollographql.apollo.api.CompiledSelection> list, java.lang.String str, com.apollographql.apollo.api.FakeResolver fakeResolver, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builderFactory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fakeResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        com.apollographql.apollo.api.ObjectBuilder newBuilder = builderFactory.newBuilder(com.apollographql.apollo.api.CustomScalarAdapters.PassThrough);
        function1.invoke(newBuilder);
        return (T) buildData(adapter, list, str, newBuilder.build(), fakeResolver, customScalarAdapters);
    }
}
