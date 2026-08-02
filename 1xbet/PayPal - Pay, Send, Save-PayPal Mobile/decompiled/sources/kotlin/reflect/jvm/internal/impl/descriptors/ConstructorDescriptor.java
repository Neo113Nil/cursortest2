package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes3.dex */
public interface ConstructorDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor {
    kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getConstructedClass();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters getContainingDeclaration();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    kotlin.reflect.jvm.internal.impl.types.KotlinType getReturnType();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getTypeParameters();

    boolean isPrimary();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor substitute(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutor);
}
