package kotlin.reflect.jvm.internal.impl.load.java.lazy;

/* loaded from: classes5.dex */
public final class LazyJavaTypeParameterResolver implements kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver {
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor> getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter, java.lang.Integer> getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getHighSpeedVideoSizes;

    public LazyJavaTypeParameterResolver(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner javaTypeParameterListOwner, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaTypeParameterListOwner, "");
        this.Camera2StreamConfigurationMap = lazyJavaResolverContext;
        this.getHighSpeedVideoSizes = declarationDescriptor;
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoFpsRangesFor = kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.mapToIndex(javaTypeParameterListOwner.getTypeParameters());
        this.getHighResolutionOutputSizeshNQ4ISI = lazyJavaResolverContext.getStorageManager().createMemoizedFunctionWithNullableValues(new kotlin.jvm.functions.Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter) obj);
            }

            {
                this.getHighSpeedVideoSizes = this;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver
    public final kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor resolveTypeParameter(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter javaTypeParameter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaTypeParameter, "");
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor invoke = this.getHighResolutionOutputSizeshNQ4ISI.invoke(javaTypeParameter);
        return invoke != null ? invoke : this.Camera2StreamConfigurationMap.getTypeParameterResolver().resolveTypeParameter(javaTypeParameter);
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter javaTypeParameter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaTypeParameter, "");
        java.lang.Integer num = lazyJavaTypeParameterResolver.getHighSpeedVideoFpsRangesFor.get(javaTypeParameter);
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor(kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt.copyWithNewDefaultTypeQualifiers(kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt.child(lazyJavaTypeParameterResolver.Camera2StreamConfigurationMap, lazyJavaTypeParameterResolver), lazyJavaTypeParameterResolver.getHighSpeedVideoSizes.getAnnotations()), javaTypeParameter, lazyJavaTypeParameterResolver.getHighSpeedVideoFpsRanges + intValue, lazyJavaTypeParameterResolver.getHighSpeedVideoSizes);
    }
}
