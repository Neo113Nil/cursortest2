package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes5.dex */
public interface ClassDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters {
    /* renamed from: getCompanionObjectDescriptor */
    kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor mo23888getCompanionObjectDescriptor();

    java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> getConstructors();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getContainingDeclaration();

    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> getContextReceivers();

    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getDeclaredTypeParameters();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    kotlin.reflect.jvm.internal.impl.types.SimpleType getDefaultType();

    kotlin.reflect.jvm.internal.impl.descriptors.ClassKind getKind();

    kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getMemberScope(kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution);

    kotlin.reflect.jvm.internal.impl.descriptors.Modality getModality();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getOriginal();

    kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getStaticScope();

    kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor getThisAsReceiverParameter();

    kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getUnsubstitutedInnerClassesScope();

    kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getUnsubstitutedMemberScope();

    /* renamed from: getUnsubstitutedPrimaryConstructor */
    kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor mo23889getUnsubstitutedPrimaryConstructor();

    kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation<kotlin.reflect.jvm.internal.impl.types.SimpleType> getValueClassRepresentation();

    kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility getVisibility();

    boolean isCompanionObject();

    boolean isData();

    boolean isFun();

    boolean isInline();

    boolean isValue();
}
