package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* loaded from: classes5.dex */
public final class ProtoBasedClassDataFinder implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder {
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.name.ClassId, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class> Camera2StreamConfigurationMap;
    private final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.ClassId, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement> getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public ProtoBasedClassDataFinder(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment packageFragment, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion binaryVersion, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.ClassId, ? extends kotlin.reflect.jvm.internal.impl.descriptors.SourceElement> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageFragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binaryVersion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoFpsRangesFor = nameResolver;
        this.getHighSpeedVideoSizes = binaryVersion;
        this.getHighSpeedVideoFpsRanges = function1;
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class> class_List = packageFragment.getClass_List();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(class_List, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class> list = class_List;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (java.lang.Object obj : list) {
            linkedHashMap.put(kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getClassId(this.getHighSpeedVideoFpsRangesFor, ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class) obj).getFqName()), obj);
        }
        this.Camera2StreamConfigurationMap = linkedHashMap;
    }

    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.name.ClassId> getAllClassIds() {
        return this.Camera2StreamConfigurationMap.keySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData findClassData(kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId, "");
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class r0 = this.Camera2StreamConfigurationMap.get(classId);
        if (r0 == null) {
            return null;
        }
        return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData(this.getHighSpeedVideoFpsRangesFor, r0, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges.invoke(classId));
    }
}
