package kotlin.reflect.jvm.internal.impl.load.java.components;

/* loaded from: classes5.dex */
public class JavaAnnotationDescriptor implements kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighResolutionOutputSizeshNQ4ISI = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0))};
    private final kotlin.reflect.jvm.internal.impl.descriptors.SourceElement Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.name.FqName getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument getHighSpeedVideoFpsRangesFor;
    private final boolean getHighSpeedVideoSizes;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue getOutputFormats;

    public JavaAnnotationDescriptor(final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation javaAnnotation, kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement javaSourceElement;
        java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument> arguments;
        kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement source;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        this.getHighSpeedVideoFpsRanges = fqName;
        if (javaAnnotation == null || (source = lazyJavaResolverContext.getComponents().getSourceElementFactory().source(javaAnnotation)) == null) {
            javaSourceElement = kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(javaSourceElement, "");
        } else {
            javaSourceElement = source;
        }
        this.Camera2StreamConfigurationMap = javaSourceElement;
        this.getOutputFormats = lazyJavaResolverContext.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0(lazyJavaResolverContext, this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext getHighResolutionOutputSizeshNQ4ISI;
            private final kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor.getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor);
            }

            {
                this.getHighResolutionOutputSizeshNQ4ISI = lazyJavaResolverContext;
                this.getHighSpeedVideoFpsRangesFor = this;
            }
        });
        this.getHighSpeedVideoFpsRangesFor = (javaAnnotation == null || (arguments = javaAnnotation.getArguments()) == null) ? null : (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument) kotlin.collections.CollectionsKt.firstOrNull(arguments);
        boolean z = false;
        if (javaAnnotation != null && javaAnnotation.isIdeExternalAnnotation()) {
            z = true;
        }
        this.getHighSpeedVideoSizes = z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public kotlin.reflect.jvm.internal.impl.name.FqName getFqName() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.SourceElement getSource() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public kotlin.reflect.jvm.internal.impl.types.SimpleType getType() {
        return (kotlin.reflect.jvm.internal.impl.types.SimpleType) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getOutputFormats, this, (kotlin.reflect.KProperty<?>) getHighResolutionOutputSizeshNQ4ISI[0]);
    }

    protected final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument getFirstArgument() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> getAllValueArguments() {
        return kotlin.collections.MapsKt.emptyMap();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor
    public boolean isIdeExternalAnnotation() {
        return this.getHighSpeedVideoSizes;
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.SimpleType getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor javaAnnotationDescriptor) {
        kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = lazyJavaResolverContext.getModule().getBuiltIns().getBuiltInClassByFqName(javaAnnotationDescriptor.getFqName()).getDefaultType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultType, "");
        return defaultType;
    }
}
