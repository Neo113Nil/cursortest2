package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes3.dex */
public interface CallableMemberDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor {
    kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor copy(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Modality modality, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, boolean z);

    kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind getKind();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor getOriginal();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> getOverriddenDescriptors();

    void setOverriddenDescriptors(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> collection);

    /* loaded from: classes5.dex */
    public enum Kind {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        public final boolean isReal() {
            return this != FAKE_OVERRIDE;
        }
    }
}
