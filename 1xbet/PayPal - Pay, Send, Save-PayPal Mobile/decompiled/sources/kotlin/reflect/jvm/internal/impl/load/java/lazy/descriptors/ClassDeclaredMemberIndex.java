package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* loaded from: classes5.dex */
public class ClassDeclaredMemberIndex implements kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex {
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField> Camera2StreamConfigurationMap;
    private final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod, java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass getHighSpeedVideoFpsRanges;
    private final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember, java.lang.Boolean> getHighSpeedVideoFpsRangesFor;
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent> getHighSpeedVideoSizes;
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, java.util.List<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod>> getInputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public ClassDeclaredMemberIndex(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoFpsRanges = javaClass;
        this.getHighSpeedVideoFpsRangesFor = function1;
        kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod, java.lang.Boolean> function12 = new kotlin.jvm.functions.Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.ClassDeclaredMemberIndex$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.ClassDeclaredMemberIndex getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.ClassDeclaredMemberIndex.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod) obj));
            }

            {
                this.getHighSpeedVideoFpsRanges = this;
            }
        };
        this.getHighResolutionOutputSizeshNQ4ISI = function12;
        kotlin.sequences.Sequence filter = kotlin.sequences.SequencesKt.filter(kotlin.collections.CollectionsKt.asSequence(javaClass.getMethods()), function12);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj : filter) {
            kotlin.reflect.jvm.internal.impl.name.Name name2 = ((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod) obj).getName();
            java.lang.Object obj2 = linkedHashMap.get(name2);
            if (obj2 == null) {
                obj2 = (java.util.List) new java.util.ArrayList();
                linkedHashMap.put(name2, obj2);
            }
            ((java.util.List) obj2).add(obj);
        }
        this.getInputSizeshNQ4ISI = linkedHashMap;
        kotlin.sequences.Sequence filter2 = kotlin.sequences.SequencesKt.filter(kotlin.collections.CollectionsKt.asSequence(this.getHighSpeedVideoFpsRanges.getFields()), this.getHighSpeedVideoFpsRangesFor);
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        for (java.lang.Object obj3 : filter2) {
            linkedHashMap2.put(((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField) obj3).getName(), obj3);
        }
        this.Camera2StreamConfigurationMap = linkedHashMap2;
        java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent> recordComponents = this.getHighSpeedVideoFpsRanges.getRecordComponents();
        kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember, java.lang.Boolean> function13 = this.getHighSpeedVideoFpsRangesFor;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj4 : recordComponents) {
            if (((java.lang.Boolean) function13.invoke(obj4)).booleanValue()) {
                arrayList.add(obj4);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
        for (java.lang.Object obj5 : arrayList2) {
            linkedHashMap3.put(((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent) obj5).getName(), obj5);
        }
        this.getHighSpeedVideoSizes = linkedHashMap3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod> findMethodsByName(kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod> list = this.getInputSizeshNQ4ISI.get(name2);
        return list != null ? list : kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getMethodNames() {
        kotlin.sequences.Sequence filter = kotlin.sequences.SequencesKt.filter(kotlin.collections.CollectionsKt.asSequence(this.getHighSpeedVideoFpsRanges.getMethods()), this.getHighResolutionOutputSizeshNQ4ISI);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator it = filter.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField findFieldByName(kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return this.Camera2StreamConfigurationMap.get(name2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getFieldNames() {
        kotlin.sequences.Sequence filter = kotlin.sequences.SequencesKt.filter(kotlin.collections.CollectionsKt.asSequence(this.getHighSpeedVideoFpsRanges.getFields()), this.getHighSpeedVideoFpsRangesFor);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator it = filter.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getRecordComponentNames() {
        return this.getHighSpeedVideoSizes.keySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent findRecordComponentByName(kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return this.getHighSpeedVideoSizes.get(name2);
    }

    static /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.ClassDeclaredMemberIndex classDeclaredMemberIndex, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod javaMethod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaMethod, "");
        return classDeclaredMemberIndex.getHighSpeedVideoFpsRangesFor.invoke(javaMethod).booleanValue() && !kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLoadingKt.isObjectMethodInInterface(javaMethod);
    }
}
