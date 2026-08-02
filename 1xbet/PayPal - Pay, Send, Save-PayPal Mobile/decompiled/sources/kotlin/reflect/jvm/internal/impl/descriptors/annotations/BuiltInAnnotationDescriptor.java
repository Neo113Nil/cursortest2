package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* loaded from: classes5.dex */
public final class BuiltInAnnotationDescriptor implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor {
    private final kotlin.Lazy Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.name.FqName getHighSpeedVideoFpsRanges;
    private final boolean getHighSpeedVideoFpsRangesFor;
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public BuiltInAnnotationDescriptor(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns kotlinBuiltIns, kotlin.reflect.jvm.internal.impl.name.FqName fqName, java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> map, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinBuiltIns, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.getHighResolutionOutputSizeshNQ4ISI = kotlinBuiltIns;
        this.getHighSpeedVideoFpsRanges = fqName;
        this.getHighSpeedVideoSizes = map;
        this.getHighSpeedVideoFpsRangesFor = z;
        this.Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType;
                defaultType = r0.getHighResolutionOutputSizeshNQ4ISI.getBuiltInClassByFqName(this.getHighResolutionOutputSizeshNQ4ISI.getFqName()).getDefaultType();
                return defaultType;
            }

            {
                this.getHighResolutionOutputSizeshNQ4ISI = this;
            }
        });
    }

    public /* synthetic */ BuiltInAnnotationDescriptor(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns kotlinBuiltIns, kotlin.reflect.jvm.internal.impl.name.FqName fqName, java.util.Map map, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(kotlinBuiltIns, fqName, map, (i & 8) != 0 ? false : z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final kotlin.reflect.jvm.internal.impl.name.FqName getFqName() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> getAllValueArguments() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final kotlin.reflect.jvm.internal.impl.types.KotlinType getType() {
        java.lang.Object value = this.Camera2StreamConfigurationMap.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
        return (kotlin.reflect.jvm.internal.impl.types.KotlinType) value;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final kotlin.reflect.jvm.internal.impl.descriptors.SourceElement getSource() {
        kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement = kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sourceElement, "");
        return sourceElement;
    }
}
