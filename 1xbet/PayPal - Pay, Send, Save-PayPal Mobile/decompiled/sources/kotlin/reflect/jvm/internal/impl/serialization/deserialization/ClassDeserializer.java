package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* loaded from: classes5.dex */
public final class ClassDeserializer {
    public static final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer.Companion Companion = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer.Companion(null);
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.ClassId> getHighSpeedVideoSizes = kotlin.collections.SetsKt.setOf(kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.topLevel(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.cloneable.toSafe()));
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents Camera2StreamConfigurationMap;
    private final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer.ClassKey, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> getHighSpeedVideoFpsRanges;

    public ClassDeserializer(kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents deserializationComponents) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationComponents, "");
        this.Camera2StreamConfigurationMap = deserializationComponents;
        this.getHighSpeedVideoFpsRanges = deserializationComponents.getStorageManager().createMemoizedFunctionWithNullableValues(new kotlin.jvm.functions.Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes, (kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer.ClassKey) obj);
            }

            {
                this.getHighSpeedVideoSizes = this;
            }
        });
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor deserializeClass$default(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer classDeserializer, kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData classData, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            classData = null;
        }
        return classDeserializer.deserializeClass(classId, classData);
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor deserializeClass(kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData classData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId, "");
        return this.getHighSpeedVideoFpsRanges.invoke(new kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer.ClassKey(classId, classData));
    }

    static final class ClassKey {
        final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData getHighResolutionOutputSizeshNQ4ISI;
        final kotlin.reflect.jvm.internal.impl.name.ClassId getHighSpeedVideoFpsRanges;

        public ClassKey(kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData classData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId, "");
            this.getHighSpeedVideoFpsRanges = classId;
            this.getHighResolutionOutputSizeshNQ4ISI = classData;
        }

        public final boolean equals(java.lang.Object obj) {
            return (obj instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer.ClassKey) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer.ClassKey) obj).getHighSpeedVideoFpsRanges);
        }

        public final int hashCode() {
            return this.getHighSpeedVideoFpsRanges.hashCode();
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.ClassId> getBLACK_LIST() {
            return kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer.getHighSpeedVideoSizes;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer classDeserializer, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer.ClassKey classKey) {
        java.lang.Object obj;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext createContext;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classKey, "");
        kotlin.reflect.jvm.internal.impl.name.ClassId classId = classKey.getHighSpeedVideoFpsRanges;
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory> it = classDeserializer.Camera2StreamConfigurationMap.getFictitiousClassDescriptorFactories().iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor createClass = it.next().createClass(classId);
            if (createClass != null) {
                return createClass;
            }
        }
        if (getHighSpeedVideoSizes.contains(classId)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData classData = classKey.getHighResolutionOutputSizeshNQ4ISI;
        if (classData == null && (classData = classDeserializer.Camera2StreamConfigurationMap.getClassDataFinder().findClassData(classId)) == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver component1 = classData.component1();
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class component2 = classData.component2();
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion component3 = classData.component3();
        kotlin.reflect.jvm.internal.impl.descriptors.SourceElement component4 = classData.component4();
        kotlin.reflect.jvm.internal.impl.name.ClassId outerClassId = classId.getOuterClassId();
        if (outerClassId != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor deserializeClass$default = deserializeClass$default(classDeserializer, outerClassId, null, 2, null);
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor deserializedClassDescriptor = deserializeClass$default instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor ? (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor) deserializeClass$default : null;
            if (deserializedClassDescriptor == null || !deserializedClassDescriptor.hasNestedClass$deserialization(classId.getShortClassName())) {
                return null;
            }
            createContext = deserializedClassDescriptor.getC();
        } else {
            java.util.Iterator<T> it2 = kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt.packageFragments(classDeserializer.Camera2StreamConfigurationMap.getPackageFragmentProvider(), classId.getPackageFqName()).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor packageFragmentDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) obj;
                if (!(packageFragmentDescriptor instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment) || ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment) packageFragmentDescriptor).hasTopLevelClass(classId.getShortClassName())) {
                    break;
                }
            }
            kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor packageFragmentDescriptor2 = (kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) obj;
            if (packageFragmentDescriptor2 == null) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents deserializationComponents = classDeserializer.Camera2StreamConfigurationMap;
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable = component2.getTypeTable();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeTable, "");
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable2 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable(typeTable);
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable.Companion companion = kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable.Companion;
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable versionRequirementTable = component2.getVersionRequirementTable();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(versionRequirementTable, "");
            createContext = deserializationComponents.createContext(packageFragmentDescriptor2, component1, typeTable2, companion.create(versionRequirementTable), component3, null);
        }
        return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor(createContext, component2, component1, component3, component4);
    }
}
