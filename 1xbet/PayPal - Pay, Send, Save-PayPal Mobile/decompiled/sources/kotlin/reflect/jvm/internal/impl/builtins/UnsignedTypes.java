package kotlin.reflect.jvm.internal.impl.builtins;

/* loaded from: classes5.dex */
public final class UnsignedTypes {
    private static final java.util.HashMap<kotlin.reflect.jvm.internal.impl.name.ClassId, kotlin.reflect.jvm.internal.impl.name.ClassId> Camera2StreamConfigurationMap;
    public static final kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes INSTANCE = new kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes();
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getHighResolutionOutputSizeshNQ4ISI;
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getHighSpeedVideoFpsRanges;
    private static final java.util.HashMap<kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType, kotlin.reflect.jvm.internal.impl.name.Name> getHighSpeedVideoFpsRangesFor;
    private static final java.util.HashMap<kotlin.reflect.jvm.internal.impl.name.ClassId, kotlin.reflect.jvm.internal.impl.name.ClassId> getHighSpeedVideoSizes;
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getInputFormats;

    private UnsignedTypes() {
    }

    static {
        kotlin.reflect.jvm.internal.impl.builtins.UnsignedType[] values = kotlin.reflect.jvm.internal.impl.builtins.UnsignedType.values();
        java.util.ArrayList arrayList = new java.util.ArrayList(values.length);
        for (kotlin.reflect.jvm.internal.impl.builtins.UnsignedType unsignedType : values) {
            arrayList.add(unsignedType.getTypeName());
        }
        getInputFormats = kotlin.collections.CollectionsKt.toSet(arrayList);
        kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType[] values2 = kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType.values();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(values2.length);
        for (kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType unsignedArrayType : values2) {
            arrayList2.add(unsignedArrayType.getTypeName());
        }
        getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.CollectionsKt.toSet(arrayList2);
        Camera2StreamConfigurationMap = new java.util.HashMap<>();
        getHighSpeedVideoSizes = new java.util.HashMap<>();
        getHighSpeedVideoFpsRangesFor = kotlin.collections.MapsKt.hashMapOf(kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType.UBYTEARRAY, kotlin.reflect.jvm.internal.impl.name.Name.identifier("ubyteArrayOf")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType.USHORTARRAY, kotlin.reflect.jvm.internal.impl.name.Name.identifier("ushortArrayOf")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType.UINTARRAY, kotlin.reflect.jvm.internal.impl.name.Name.identifier("uintArrayOf")), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType.ULONGARRAY, kotlin.reflect.jvm.internal.impl.name.Name.identifier("ulongArrayOf")));
        kotlin.reflect.jvm.internal.impl.builtins.UnsignedType[] values3 = kotlin.reflect.jvm.internal.impl.builtins.UnsignedType.values();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (kotlin.reflect.jvm.internal.impl.builtins.UnsignedType unsignedType2 : values3) {
            linkedHashSet.add(unsignedType2.getArrayClassId().getShortClassName());
        }
        getHighSpeedVideoFpsRanges = linkedHashSet;
        for (kotlin.reflect.jvm.internal.impl.builtins.UnsignedType unsignedType3 : kotlin.reflect.jvm.internal.impl.builtins.UnsignedType.values()) {
            Camera2StreamConfigurationMap.put(unsignedType3.getArrayClassId(), unsignedType3.getClassId());
            getHighSpeedVideoSizes.put(unsignedType3.getClassId(), unsignedType3.getArrayClassId());
        }
    }

    public final boolean isShortNameOfUnsignedArray(kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return getHighSpeedVideoFpsRanges.contains(name2);
    }

    public final kotlin.reflect.jvm.internal.impl.name.ClassId getUnsignedClassIdByArrayClassId(kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId, "");
        return Camera2StreamConfigurationMap.get(classId);
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isUnsignedType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        if (kotlin.reflect.jvm.internal.impl.types.TypeUtils.noExpectedType(kotlinType) || (mo23898getDeclarationDescriptor = kotlinType.getConstructor().mo23898getDeclarationDescriptor()) == null) {
            return false;
        }
        return INSTANCE.isUnsignedClass(mo23898getDeclarationDescriptor);
    }

    public final boolean isUnsignedClass(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = declarationDescriptor.getContainingDeclaration();
        return (containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) && kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) containingDeclaration).getFqName(), kotlin.reflect.jvm.internal.impl.builtins.StandardNames.BUILT_INS_PACKAGE_FQ_NAME) && getInputFormats.contains(declarationDescriptor.getName());
    }
}
