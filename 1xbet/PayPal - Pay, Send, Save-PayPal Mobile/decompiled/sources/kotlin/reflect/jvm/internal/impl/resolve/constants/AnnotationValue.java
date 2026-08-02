package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* loaded from: classes5.dex */
public final class AnnotationValue extends kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotationValue(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptor) {
        super(annotationDescriptor);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotationDescriptor, "");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public final kotlin.reflect.jvm.internal.impl.types.KotlinType getType(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        return getValue().getType();
    }
}
