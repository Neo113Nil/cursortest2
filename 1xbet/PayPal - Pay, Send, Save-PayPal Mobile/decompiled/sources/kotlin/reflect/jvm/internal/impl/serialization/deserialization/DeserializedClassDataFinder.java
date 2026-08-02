package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* loaded from: classes5.dex */
public final class DeserializedClassDataFinder implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder {
    private final kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider Camera2StreamConfigurationMap;

    public DeserializedClassDataFinder(kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider packageFragmentProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageFragmentProvider, "");
        this.Camera2StreamConfigurationMap = packageFragmentProvider;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData findClassData(kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData findClassData;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId, "");
        for (kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor packageFragmentDescriptor : kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt.packageFragments(this.Camera2StreamConfigurationMap, classId.getPackageFqName())) {
            if ((packageFragmentDescriptor instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment) && (findClassData = ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment) packageFragmentDescriptor).getClassDataFinder().findClassData(classId)) != null) {
                return findClassData;
            }
        }
        return null;
    }
}
