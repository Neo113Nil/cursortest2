package kotlin.reflect.jvm.internal.impl.load.java.lazy;

/* loaded from: classes3.dex */
public final class LazyJavaResolverContext {
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.Lazy<kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType> getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver getHighSpeedVideoSizes;

    public LazyJavaResolverContext(kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents javaResolverComponents, kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver typeParameterResolver, kotlin.Lazy<kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaResolverComponents, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameterResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        this.getHighSpeedVideoFpsRangesFor = javaResolverComponents;
        this.getHighResolutionOutputSizeshNQ4ISI = typeParameterResolver;
        this.getHighSpeedVideoFpsRanges = lazy;
        this.getHighSpeedVideoSizes = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver(this, typeParameterResolver);
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents getComponents() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver getTypeParameterResolver() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final kotlin.Lazy<kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType> getDelegateForDefaultTypeQualifiers$descriptors_jvm() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType getDefaultTypeQualifiers() {
        return this.getHighSpeedVideoFpsRanges.getValue();
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver getTypeResolver() {
        return this.getHighSpeedVideoSizes;
    }

    public final kotlin.reflect.jvm.internal.impl.storage.StorageManager getStorageManager() {
        return this.getHighSpeedVideoFpsRangesFor.getStorageManager();
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor getModule() {
        return this.getHighSpeedVideoFpsRangesFor.getModule();
    }
}
