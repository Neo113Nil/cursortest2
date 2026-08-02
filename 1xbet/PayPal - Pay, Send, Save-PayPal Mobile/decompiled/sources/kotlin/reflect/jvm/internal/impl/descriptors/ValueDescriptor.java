package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes5.dex */
public interface ValueDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getContainingDeclaration();

    kotlin.reflect.jvm.internal.impl.types.KotlinType getType();
}
