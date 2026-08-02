package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* loaded from: classes5.dex */
public final class JavaClassDataFinder implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder {
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder getHighSpeedVideoSizes;

    public JavaClassDataFinder(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder kotlinClassFinder, kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver deserializedDescriptorResolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinClassFinder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "");
        this.getHighSpeedVideoSizes = kotlinClassFinder;
        this.Camera2StreamConfigurationMap = deserializedDescriptorResolver;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData findClassData(kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId, "");
        kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass findKotlinClass = kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt.findKotlinClass(this.getHighSpeedVideoSizes, classId, this.Camera2StreamConfigurationMap.getComponents().getConfiguration().getMetadataVersion());
        if (findKotlinClass == null) {
            return null;
        }
        kotlin.jvm.internal.Intrinsics.areEqual(findKotlinClass.getClassId(), classId);
        return this.Camera2StreamConfigurationMap.readClassData$descriptors_jvm(findKotlinClass);
    }
}
