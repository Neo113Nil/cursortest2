package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a)\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u0007"}, d2 = {"", "Lcom/apollographql/apollo/api/CompiledType;", "p0", "Lcom/apollographql/apollo/api/CompiledNamedType;", "p1", "Lcom/apollographql/apollo/api/ObjectType;", "getHighSpeedVideoFpsRangesFor", "(Ljava/util/List;Lcom/apollographql/apollo/api/CompiledNamedType;)Ljava/util/List;", "allTypes", "type", "possibleTypes"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PossibleTypes {
    private static final java.util.List<com.apollographql.apollo.api.ObjectType> getHighSpeedVideoFpsRangesFor(java.util.List<? extends com.apollographql.apollo.api.CompiledType> list, com.apollographql.apollo.api.CompiledNamedType compiledNamedType) {
        java.util.List<com.apollographql.apollo.api.ObjectType> emptyList;
        if (compiledNamedType instanceof com.apollographql.apollo.api.ObjectType) {
            return kotlin.collections.CollectionsKt.listOf(compiledNamedType);
        }
        if (compiledNamedType instanceof com.apollographql.apollo.api.UnionType) {
            return kotlin.collections.ArraysKt.toList(((com.apollographql.apollo.api.UnionType) compiledNamedType).getMembers());
        }
        if (!(compiledNamedType instanceof com.apollographql.apollo.api.InterfaceType)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Type '");
            sb.append(compiledNamedType);
            sb.append("' can only have one possible type");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.apollographql.apollo.api.CompiledType compiledType : list) {
            if (compiledType instanceof com.apollographql.apollo.api.ObjectType) {
                java.util.List<com.apollographql.apollo.api.InterfaceType> list2 = ((com.apollographql.apollo.api.ObjectType) compiledType).getImplements();
                if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                    java.util.Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.apollographql.apollo.api.InterfaceType) it.next()).getName(), compiledNamedType.getName())) {
                            emptyList = getHighSpeedVideoFpsRangesFor(list, (com.apollographql.apollo.api.CompiledNamedType) compiledType);
                            break;
                        }
                    }
                }
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            } else if (compiledType instanceof com.apollographql.apollo.api.InterfaceType) {
                java.util.List<com.apollographql.apollo.api.InterfaceType> list3 = ((com.apollographql.apollo.api.InterfaceType) compiledType).getImplements();
                if (!(list3 instanceof java.util.Collection) || !list3.isEmpty()) {
                    java.util.Iterator<T> it2 = list3.iterator();
                    while (it2.hasNext()) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.apollographql.apollo.api.InterfaceType) it2.next()).getName(), compiledNamedType.getName())) {
                            emptyList = getHighSpeedVideoFpsRangesFor(list, (com.apollographql.apollo.api.CompiledNamedType) compiledType);
                            break;
                        }
                    }
                }
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            } else {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            kotlin.collections.CollectionsKt.addAll(arrayList, emptyList);
        }
        return arrayList;
    }

    public static final java.util.List<com.apollographql.apollo.api.ObjectType> possibleTypes(java.util.List<? extends com.apollographql.apollo.api.CompiledType> list, com.apollographql.apollo.api.CompiledNamedType compiledNamedType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compiledNamedType, "");
        java.util.List<com.apollographql.apollo.api.ObjectType> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(list, compiledNamedType);
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : highSpeedVideoFpsRangesFor) {
            if (hashSet.add(((com.apollographql.apollo.api.ObjectType) obj).getName())) {
                arrayList.add(obj);
            }
        }
        return kotlin.collections.CollectionsKt.sortedWith(arrayList, new java.util.Comparator() { // from class: com.apollographql.apollo.api.PossibleTypes$possibleTypes$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(((com.apollographql.apollo.api.ObjectType) t).getName(), ((com.apollographql.apollo.api.ObjectType) t2).getName());
            }
        });
    }
}
