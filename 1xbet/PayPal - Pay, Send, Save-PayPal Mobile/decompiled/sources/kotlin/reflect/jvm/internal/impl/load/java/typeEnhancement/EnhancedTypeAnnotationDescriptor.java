package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* loaded from: classes5.dex */
final class EnhancedTypeAnnotationDescriptor implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor {
    public static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.EnhancedTypeAnnotationDescriptor getHighSpeedVideoFpsRanges = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.EnhancedTypeAnnotationDescriptor();

    private EnhancedTypeAnnotationDescriptor() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.name.FqName getFqName() {
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor.DefaultImpls.getFqName(this);
    }

    public final java.lang.String toString() {
        return "[EnhancedType]";
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> getAllValueArguments() {
        throw new java.lang.IllegalStateException("No methods should be called on this descriptor. Only its presence matters".toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final kotlin.reflect.jvm.internal.impl.descriptors.SourceElement getSource() {
        throw new java.lang.IllegalStateException("No methods should be called on this descriptor. Only its presence matters".toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final kotlin.reflect.jvm.internal.impl.types.KotlinType getType() {
        throw new java.lang.IllegalStateException("No methods should be called on this descriptor. Only its presence matters".toString());
    }
}
