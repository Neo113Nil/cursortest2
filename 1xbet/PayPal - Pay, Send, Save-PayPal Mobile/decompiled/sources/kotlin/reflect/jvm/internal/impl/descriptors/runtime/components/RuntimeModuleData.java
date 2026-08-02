package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

/* loaded from: classes5.dex */
public final class RuntimeModuleData {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData.Companion Companion = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData.Companion(null);
    private final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.PackagePartScopeCache getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents getHighSpeedVideoFpsRangesFor;

    private RuntimeModuleData(kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents deserializationComponents, kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.PackagePartScopeCache packagePartScopeCache) {
        this.getHighSpeedVideoFpsRangesFor = deserializationComponents;
        this.getHighSpeedVideoFpsRanges = packagePartScopeCache;
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents getDeserialization() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.PackagePartScopeCache getPackagePartScopeCache() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor getModule() {
        return this.getHighSpeedVideoFpsRangesFor.getModuleDescriptor();
    }

    public static final class Companion {
        private Companion() {
        }

        public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData create(java.lang.ClassLoader classLoader) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classLoader, "");
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClassFinder reflectKotlinClassFinder = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClassFinder(classLoader);
            java.lang.ClassLoader classLoader2 = kotlin.Unit.class.getClassLoader();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(classLoader2, "");
            kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJava.Companion.ModuleData createModuleData = kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJava.Companion.createModuleData(reflectKotlinClassFinder, new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClassFinder(classLoader2), new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectJavaClassFinder(classLoader), "runtime module for ".concat(java.lang.String.valueOf(classLoader)), kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeErrorReporter.INSTANCE, kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeSourceElementFactory.INSTANCE);
            return new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData(createModuleData.getDeserializationComponentsForJava().getComponents(), new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.PackagePartScopeCache(createModuleData.getDeserializedDescriptorResolver(), reflectKotlinClassFinder), null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ RuntimeModuleData(kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents deserializationComponents, kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.PackagePartScopeCache packagePartScopeCache, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(deserializationComponents, packagePartScopeCache);
    }
}
