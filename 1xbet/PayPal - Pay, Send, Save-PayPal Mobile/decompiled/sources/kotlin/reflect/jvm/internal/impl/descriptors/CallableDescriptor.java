package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes3.dex */
public interface CallableDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable<kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor> {

    /* loaded from: classes5.dex */
    public interface UserDataKey<V> {
    }

    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> getContextReceiverParameters();

    kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor getDispatchReceiverParameter();

    kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor getExtensionReceiverParameter();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor getOriginal();

    java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor> getOverriddenDescriptors();

    kotlin.reflect.jvm.internal.impl.types.KotlinType getReturnType();

    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getTypeParameters();

    <V> V getUserData(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<V> userDataKey);

    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> getValueParameters();

    boolean hasSynthesizedParameterNames();
}
