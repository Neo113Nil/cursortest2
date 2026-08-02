package kotlin.reflect.jvm.internal.impl.load.java.components;

/* loaded from: classes5.dex */
public final class JavaTargetAnnotationDescriptor extends kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoSizes = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.load.java.components.JavaTargetAnnotationDescriptor.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue getHighSpeedVideoFpsRanges;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaTargetAnnotationDescriptor(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation javaAnnotation, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext) {
        super(lazyJavaResolverContext, javaAnnotation, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.target);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaAnnotation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
        this.getHighSpeedVideoFpsRanges = lazyJavaResolverContext.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaTargetAnnotationDescriptor$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.load.java.components.JavaTargetAnnotationDescriptor getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.load.java.components.JavaTargetAnnotationDescriptor.getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI);
            }

            {
                this.getHighResolutionOutputSizeshNQ4ISI = this;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<java.lang.Object>> getAllValueArguments() {
        return (java.util.Map) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getHighSpeedVideoFpsRanges, this, (kotlin.reflect.KProperty<?>) getHighSpeedVideoSizes[0]);
    }

    static /* synthetic */ java.util.Map getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.load.java.components.JavaTargetAnnotationDescriptor javaTargetAnnotationDescriptor) {
        kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> mapJavaTargetArguments$descriptors_jvm;
        kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument firstArgument = javaTargetAnnotationDescriptor.getFirstArgument();
        if (firstArgument instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument) {
            mapJavaTargetArguments$descriptors_jvm = kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationTargetMapper.INSTANCE.mapJavaTargetArguments$descriptors_jvm(((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument) javaTargetAnnotationDescriptor.getFirstArgument()).getElements());
        } else {
            mapJavaTargetArguments$descriptors_jvm = firstArgument instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument ? kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationTargetMapper.INSTANCE.mapJavaTargetArguments$descriptors_jvm(kotlin.collections.CollectionsKt.listOf(javaTargetAnnotationDescriptor.getFirstArgument())) : null;
        }
        java.util.Map mapOf = mapJavaTargetArguments$descriptors_jvm != null ? kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper.INSTANCE.getTARGET_ANNOTATION_ALLOWED_TARGETS$descriptors_jvm(), mapJavaTargetArguments$descriptors_jvm)) : null;
        return mapOf == null ? kotlin.collections.MapsKt.emptyMap() : mapOf;
    }
}
