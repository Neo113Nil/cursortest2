package kotlin.reflect.jvm.internal.impl.load.java.lazy;

/* loaded from: classes5.dex */
public final class LazyJavaAnnotations implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations {
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> getHighSpeedVideoSizes;

    public LazyJavaAnnotations(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner javaAnnotationOwner, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaAnnotationOwner, "");
        this.getHighSpeedVideoFpsRangesFor = lazyJavaResolverContext;
        this.getHighSpeedVideoFpsRanges = javaAnnotationOwner;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoSizes = lazyJavaResolverContext.getComponents().getStorageManager().createMemoizedFunctionWithNullableValues(new kotlin.jvm.functions.Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI, (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation) obj);
            }

            {
                this.getHighResolutionOutputSizeshNQ4ISI = this;
            }
        });
    }

    public /* synthetic */ LazyJavaAnnotations(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner javaAnnotationOwner, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, javaAnnotationOwner, (i & 4) != 0 ? false : z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final /* bridge */ boolean hasAnnotation(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.DefaultImpls.hasAnnotation(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* renamed from: findAnnotation */
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor mo23890findAnnotation(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor invoke;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation findAnnotation = this.getHighSpeedVideoFpsRanges.findAnnotation(fqName);
        return (findAnnotation == null || (invoke = this.getHighSpeedVideoSizes.invoke(findAnnotation)) == null) ? kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper.INSTANCE.findMappedJavaAnnotation(fqName, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor) : invoke;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> iterator() {
        return kotlin.sequences.SequencesKt.filterNotNull(kotlin.sequences.SequencesKt.plus((kotlin.sequences.Sequence<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor>) kotlin.sequences.SequencesKt.map(kotlin.collections.CollectionsKt.asSequence(this.getHighSpeedVideoFpsRanges.getAnnotations()), this.getHighSpeedVideoSizes), kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper.INSTANCE.findMappedJavaAnnotation(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.deprecated, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor))).iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final boolean isEmpty() {
        return this.getHighSpeedVideoFpsRanges.getAnnotations().isEmpty() && !this.getHighSpeedVideoFpsRanges.isDeprecatedInJavaDoc();
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations lazyJavaAnnotations, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation javaAnnotation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaAnnotation, "");
        return kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper.INSTANCE.mapOrResolveJavaAnnotation(javaAnnotation, lazyJavaAnnotations.getHighSpeedVideoFpsRangesFor, lazyJavaAnnotations.getHighResolutionOutputSizeshNQ4ISI);
    }
}
