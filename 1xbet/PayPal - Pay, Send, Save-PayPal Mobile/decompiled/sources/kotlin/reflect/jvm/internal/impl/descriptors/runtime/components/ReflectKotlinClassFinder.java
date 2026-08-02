package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

/* loaded from: classes5.dex */
public final class ReflectKotlinClassFinder implements kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder {
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsResourceLoader Camera2StreamConfigurationMap;
    private final java.lang.ClassLoader getHighSpeedVideoSizes;

    public ReflectKotlinClassFinder(java.lang.ClassLoader classLoader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classLoader, "");
        this.getHighSpeedVideoSizes = classLoader;
        this.Camera2StreamConfigurationMap = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsResourceLoader();
    }

    private final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result getHighSpeedVideoSizes(java.lang.String str) {
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass create;
        java.lang.Class<?> tryLoadClass = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectJavaClassFinderKt.tryLoadClass(this.getHighSpeedVideoSizes, str);
        kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result.KotlinClass kotlinClass = null;
        if (tryLoadClass != null && (create = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass.Factory.create(tryLoadClass)) != null) {
            kotlinClass = new kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result.KotlinClass(create, null, 2, null);
        }
        return kotlinClass;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder
    public final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result findKotlinClassOrContent(kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion metadataVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadataVersion, "");
        return getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClassFinderKt.access$toRuntimeFqName(classId));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder
    public final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result findKotlinClassOrContent(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass, kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion metadataVersion) {
        java.lang.String asString;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadataVersion, "");
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = javaClass.getFqName();
        if (fqName == null || (asString = fqName.asString()) == null) {
            return null;
        }
        return getHighSpeedVideoSizes(asString);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.KotlinMetadataFinder
    public final java.io.InputStream findBuiltInsData(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        if (fqName.startsWith(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.BUILT_INS_PACKAGE_NAME)) {
            return this.Camera2StreamConfigurationMap.loadResource(kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol.INSTANCE.getBuiltInsFilePath(fqName));
        }
        return null;
    }
}
