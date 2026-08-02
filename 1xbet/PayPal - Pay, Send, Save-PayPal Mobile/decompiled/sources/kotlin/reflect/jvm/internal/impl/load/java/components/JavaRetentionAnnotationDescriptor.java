package kotlin.reflect.jvm.internal.impl.load.java.components;

/* loaded from: classes5.dex */
public final class JavaRetentionAnnotationDescriptor extends kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoSizes = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.load.java.components.JavaRetentionAnnotationDescriptor.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue Camera2StreamConfigurationMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaRetentionAnnotationDescriptor(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation javaAnnotation, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext) {
        super(lazyJavaResolverContext, javaAnnotation, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.retention);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaAnnotation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
        this.Camera2StreamConfigurationMap = lazyJavaResolverContext.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaRetentionAnnotationDescriptor$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.load.java.components.JavaRetentionAnnotationDescriptor getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.load.java.components.JavaRetentionAnnotationDescriptor.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges);
            }

            {
                this.getHighSpeedVideoFpsRanges = this;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> getAllValueArguments() {
        return (java.util.Map) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.Camera2StreamConfigurationMap, this, (kotlin.reflect.KProperty<?>) getHighSpeedVideoSizes[0]);
    }

    static /* synthetic */ java.util.Map getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.load.java.components.JavaRetentionAnnotationDescriptor javaRetentionAnnotationDescriptor) {
        kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> mapJavaRetentionArgument$descriptors_jvm = kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationTargetMapper.INSTANCE.mapJavaRetentionArgument$descriptors_jvm(javaRetentionAnnotationDescriptor.getFirstArgument());
        java.util.Map mapOf = mapJavaRetentionArgument$descriptors_jvm != null ? kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper.INSTANCE.getRETENTION_ANNOTATION_VALUE$descriptors_jvm(), mapJavaRetentionArgument$descriptors_jvm)) : null;
        return mapOf == null ? kotlin.collections.MapsKt.emptyMap() : mapOf;
    }
}
