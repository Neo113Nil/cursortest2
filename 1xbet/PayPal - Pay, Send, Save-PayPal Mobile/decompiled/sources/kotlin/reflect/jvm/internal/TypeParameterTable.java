package kotlin.reflect.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B5\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lkotlin/reflect/jvm/internal/TypeParameterTable;", "", "", "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "p0", "", "", "Lkotlin/reflect/KTypeParameter;", "p1", "p2", "<init>", "(Ljava/util/List;Ljava/util/Map;Lkotlin/reflect/jvm/internal/TypeParameterTable;)V", "id", "get", "(I)Lkotlin/reflect/KTypeParameter;", "ownTypeParameters", "Ljava/util/List;", "getOwnTypeParameters", "()Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Map;", "Camera2StreamConfigurationMap", "Lkotlin/reflect/jvm/internal/TypeParameterTable;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TypeParameterTable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.reflect.jvm.internal.TypeParameterTable.Companion INSTANCE = new kotlin.reflect.jvm.internal.TypeParameterTable.Companion(null);
    public static final kotlin.reflect.jvm.internal.TypeParameterTable EMPTY = new kotlin.reflect.jvm.internal.TypeParameterTable(kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.MapsKt.emptyMap(), null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.reflect.jvm.internal.TypeParameterTable getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.Map<java.lang.Integer, kotlin.reflect.KTypeParameter> Camera2StreamConfigurationMap;
    private final java.util.List<kotlin.reflect.jvm.internal.KTypeParameterImpl> ownTypeParameters;

    /* JADX WARN: Multi-variable type inference failed */
    private TypeParameterTable(java.util.List<kotlin.reflect.jvm.internal.KTypeParameterImpl> list, java.util.Map<java.lang.Integer, ? extends kotlin.reflect.KTypeParameter> map, kotlin.reflect.jvm.internal.TypeParameterTable typeParameterTable) {
        this.ownTypeParameters = list;
        this.Camera2StreamConfigurationMap = map;
        this.getHighResolutionOutputSizeshNQ4ISI = typeParameterTable;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.KTypeParameterImpl> getOwnTypeParameters() {
        return this.ownTypeParameters;
    }

    public final kotlin.reflect.KTypeParameter get(int id) {
        kotlin.reflect.jvm.internal.TypeParameterTable typeParameterTable = this;
        do {
            kotlin.reflect.KTypeParameter kTypeParameter = typeParameterTable.Camera2StreamConfigurationMap.get(java.lang.Integer.valueOf(id));
            if (kTypeParameter != null) {
                return kTypeParameter;
            }
            typeParameterTable = typeParameterTable.getHighResolutionOutputSizeshNQ4ISI;
        } while (typeParameterTable != null);
        return null;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lkotlin/reflect/jvm/internal/TypeParameterTable$Companion;", "", "<init>", "()V", "", "Lkotlin/reflect/jvm/internal/impl/km/KmTypeParameter;", "kmTypeParameters", "Lkotlin/reflect/jvm/internal/TypeParameterTable;", "parent", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "container", "Ljava/lang/ClassLoader;", "classLoader", "create", "(Ljava/util/List;Lkotlin/reflect/jvm/internal/TypeParameterTable;Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;Ljava/lang/ClassLoader;)Lkotlin/reflect/jvm/internal/TypeParameterTable;", "EMPTY", "Lkotlin/reflect/jvm/internal/TypeParameterTable;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlin.reflect.jvm.internal.TypeParameterTable create(java.util.List<kotlin.reflect.jvm.internal.impl.km.KmTypeParameter> kmTypeParameters, kotlin.reflect.jvm.internal.TypeParameterTable parent, kotlin.reflect.jvm.internal.KTypeParameterOwnerImpl container, java.lang.ClassLoader classLoader) {
            kotlin.reflect.KVariance highResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmTypeParameters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(container, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classLoader, "");
            java.util.List<kotlin.reflect.jvm.internal.impl.km.KmTypeParameter> list = kmTypeParameters;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (kotlin.reflect.jvm.internal.impl.km.KmTypeParameter kmTypeParameter : list) {
                java.lang.String name2 = kmTypeParameter.getName();
                highResolutionOutputSizeshNQ4ISI = kotlin.reflect.jvm.internal.ConvertFromMetadataKt.getHighResolutionOutputSizeshNQ4ISI(kmTypeParameter.getVariance());
                arrayList.add(new kotlin.reflect.jvm.internal.KTypeParameterImpl(container, name2, highResolutionOutputSizeshNQ4ISI, kotlin.reflect.jvm.internal.impl.km.Attributes.isReified(kmTypeParameter)));
            }
            java.util.ArrayList<kotlin.reflect.jvm.internal.KTypeParameterImpl> arrayList2 = arrayList;
            java.lang.Iterable<kotlin.collections.IndexedValue> withIndex = kotlin.collections.CollectionsKt.withIndex(list);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(withIndex, 10)), 16));
            for (kotlin.collections.IndexedValue indexedValue : withIndex) {
                kotlin.Pair pair = kotlin.TuplesKt.to(java.lang.Integer.valueOf(((kotlin.reflect.jvm.internal.impl.km.KmTypeParameter) indexedValue.component2()).getId()), arrayList2.get(indexedValue.getIndex()));
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            kotlin.reflect.jvm.internal.TypeParameterTable typeParameterTable = new kotlin.reflect.jvm.internal.TypeParameterTable(arrayList2, linkedHashMap, parent, null);
            int i = 0;
            for (kotlin.reflect.jvm.internal.KTypeParameterImpl kTypeParameterImpl : arrayList2) {
                java.util.List<kotlin.reflect.jvm.internal.impl.km.KmType> upperBounds = kmTypeParameters.get(i).getUpperBounds();
                java.util.List arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(upperBounds, 10));
                java.util.Iterator<T> it = upperBounds.iterator();
                while (it.hasNext()) {
                    arrayList3.add(kotlin.reflect.jvm.internal.ConvertFromMetadataKt.toKType$default((kotlin.reflect.jvm.internal.impl.km.KmType) it.next(), classLoader, typeParameterTable, null, 4, null));
                }
                java.util.List list2 = arrayList3;
                if (list2.isEmpty()) {
                    list2 = kotlin.collections.CollectionsKt.listOf(kotlin.reflect.jvm.internal.StandardKTypes.INSTANCE.getNULLABLE_ANY());
                }
                kTypeParameterImpl.setUpperBounds(list2);
                i++;
            }
            return typeParameterTable;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TypeParameterTable(java.util.List list, java.util.Map map, kotlin.reflect.jvm.internal.TypeParameterTable typeParameterTable, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, map, typeParameterTable);
    }
}
