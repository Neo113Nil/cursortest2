package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes5.dex */
public interface PropertyDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptorWithAccessors {
    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor> getAccessors();

    kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor getBackingField();

    kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor getDelegateField();

    kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor getGetter();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor getOriginal();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getOverriddenDescriptors();

    kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor getSetter();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor substitute(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutor);
}
