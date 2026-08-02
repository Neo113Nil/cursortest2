package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* loaded from: classes5.dex */
public class AnnotationDescriptorImpl implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor {
    private final kotlin.reflect.jvm.internal.impl.types.KotlinType getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.descriptors.SourceElement getHighSpeedVideoFpsRanges;
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> getHighSpeedVideoFpsRangesFor;

    public AnnotationDescriptorImpl(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> map, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        if (kotlinType == null) {
            getHighResolutionOutputSizeshNQ4ISI(0);
        }
        if (map == null) {
            getHighResolutionOutputSizeshNQ4ISI(1);
        }
        if (sourceElement == null) {
            getHighResolutionOutputSizeshNQ4ISI(2);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = kotlinType;
        this.getHighSpeedVideoFpsRangesFor = map;
        this.getHighSpeedVideoFpsRanges = sourceElement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public kotlin.reflect.jvm.internal.impl.types.KotlinType getType() {
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType = this.getHighResolutionOutputSizeshNQ4ISI;
        if (kotlinType == null) {
            getHighResolutionOutputSizeshNQ4ISI(3);
        }
        return kotlinType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public kotlin.reflect.jvm.internal.impl.name.FqName getFqName() {
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor.DefaultImpls.getFqName(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> getAllValueArguments() {
        java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> map = this.getHighSpeedVideoFpsRangesFor;
        if (map == null) {
            getHighResolutionOutputSizeshNQ4ISI(4);
        }
        return map;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.SourceElement getSource() {
        kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement = this.getHighSpeedVideoFpsRanges;
        if (sourceElement == null) {
            getHighResolutionOutputSizeshNQ4ISI(5);
        }
        return sourceElement;
    }

    public java.lang.String toString() {
        return kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.FQ_NAMES_IN_TYPES.renderAnnotation(this, null);
    }

    private static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(int i) {
        java.lang.String str = (i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 3 || i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "valueArguments";
        } else if (i == 2) {
            objArr[0] = "source";
        } else if (i == 3 || i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i == 3) {
            objArr[1] = "getType";
        } else if (i == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 3 && i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i != 3 && i != 4 && i != 5) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }
}
