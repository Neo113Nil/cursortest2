package kotlin.reflect.jvm.internal.impl.load.java.lazy;

/* loaded from: classes5.dex */
public final class ContextKt {
    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext child(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver typeParameterResolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameterResolver, "");
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext(lazyJavaResolverContext.getComponents(), typeParameterResolver, lazyJavaResolverContext.getDelegateForDefaultTypeQualifiers$descriptors_jvm());
    }

    public static final kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType computeNewDefaultTypeQualifiers(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotations, "");
        return kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver.extractAndMergeDefaultQualifiers$default(lazyJavaResolverContext.getComponents().getAnnotationTypeQualifierResolver(), lazyJavaResolverContext.getDefaultTypeQualifiers(), annotations, false, 4, null);
    }

    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext replaceComponents(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents javaResolverComponents) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaResolverComponents, "");
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext(javaResolverComponents, lazyJavaResolverContext.getTypeParameterResolver(), lazyJavaResolverContext.getDelegateForDefaultTypeQualifiers$descriptors_jvm());
    }

    private static final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner javaTypeParameterListOwner, int i, kotlin.Lazy<kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType> lazy) {
        kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver typeParameterResolver;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents components = lazyJavaResolverContext.getComponents();
        if (javaTypeParameterListOwner != null) {
            typeParameterResolver = new kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver(lazyJavaResolverContext, declarationDescriptor, javaTypeParameterListOwner, i);
        } else {
            typeParameterResolver = lazyJavaResolverContext.getTypeParameterResolver();
        }
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext(components, typeParameterResolver, lazy);
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext childForMethod$default(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner javaTypeParameterListOwner, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return childForMethod(lazyJavaResolverContext, declarationDescriptor, javaTypeParameterListOwner, i);
    }

    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext childForMethod(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner javaTypeParameterListOwner, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaTypeParameterListOwner, "");
        return getHighSpeedVideoSizes(lazyJavaResolverContext, declarationDescriptor, javaTypeParameterListOwner, i, lazyJavaResolverContext.getDelegateForDefaultTypeQualifiers$descriptors_jvm());
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext childForClassOrPackage$default(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner javaTypeParameterListOwner, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            javaTypeParameterListOwner = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return childForClassOrPackage(lazyJavaResolverContext, classOrPackageFragmentDescriptor, javaTypeParameterListOwner, i);
    }

    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext childForClassOrPackage(final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, final kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner javaTypeParameterListOwner, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classOrPackageFragmentDescriptor, "");
        return getHighSpeedVideoSizes(lazyJavaResolverContext, classOrPackageFragmentDescriptor, javaTypeParameterListOwner, i, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, new kotlin.jvm.functions.Function0(lazyJavaResolverContext, classOrPackageFragmentDescriptor) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor getHighSpeedVideoFpsRangesFor;
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType computeNewDefaultTypeQualifiers;
                computeNewDefaultTypeQualifiers = kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt.computeNewDefaultTypeQualifiers(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor.getAnnotations());
                return computeNewDefaultTypeQualifiers;
            }

            {
                this.getHighSpeedVideoSizes = lazyJavaResolverContext;
                this.getHighSpeedVideoFpsRangesFor = classOrPackageFragmentDescriptor;
            }
        }));
    }

    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext copyWithNewDefaultTypeQualifiers(final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotations, "");
        return annotations.isEmpty() ? lazyJavaResolverContext : new kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext(lazyJavaResolverContext.getComponents(), lazyJavaResolverContext.getTypeParameterResolver(), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, new kotlin.jvm.functions.Function0(lazyJavaResolverContext, annotations) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt$$Lambda$1
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext getHighResolutionOutputSizeshNQ4ISI;
            private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType computeNewDefaultTypeQualifiers;
                computeNewDefaultTypeQualifiers = kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt.computeNewDefaultTypeQualifiers(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor);
                return computeNewDefaultTypeQualifiers;
            }

            {
                this.getHighResolutionOutputSizeshNQ4ISI = lazyJavaResolverContext;
                this.getHighSpeedVideoFpsRangesFor = annotations;
            }
        }));
    }
}
