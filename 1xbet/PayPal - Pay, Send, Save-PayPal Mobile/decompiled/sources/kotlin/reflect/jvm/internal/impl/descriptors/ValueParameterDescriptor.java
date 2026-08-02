package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes5.dex */
public interface ValueParameterDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor {

    public static final class DefaultImpls {
        public static boolean isLateInit(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor) {
            return false;
        }
    }

    kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor copy(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.name.Name name2, int i);

    boolean declaresDefaultValue();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor getContainingDeclaration();

    int getIndex();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor getOriginal();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> getOverriddenDescriptors();

    kotlin.reflect.jvm.internal.impl.types.KotlinType getVarargElementType();

    boolean isCrossinline();

    boolean isNoinline();
}
