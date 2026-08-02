package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes5.dex */
public interface FunctionDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor {

    public interface CopyBuilder<D extends kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> {
        D build();

        <V> kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<D> putUserData(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<V> userDataKey, V v);

        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<D> setAdditionalAnnotations(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations);

        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<D> setCopyOverrides(boolean z);

        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<D> setDispatchReceiverParameter(kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptor);

        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<D> setDropOriginalInContainingParts();

        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<D> setExtensionReceiverParameter(kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptor);

        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<D> setHiddenForResolutionEverywhereBesideSupercalls();

        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<D> setHiddenToOvercomeSignatureClash();

        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<D> setKind(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind);

        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<D> setModality(kotlin.reflect.jvm.internal.impl.descriptors.Modality modality);

        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<D> setName(kotlin.reflect.jvm.internal.impl.name.Name name2);

        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<D> setOriginal(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor);

        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<D> setOwner(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor);

        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<D> setPreserveSourceElement();

        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<D> setReturnType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType);

        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<D> setSignatureChange();

        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<D> setSubstitution(kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution);

        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<D> setTypeParameters(java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list);

        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<D> setValueParameters(java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list);

        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<D> setVisibility(kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getContainingDeclaration();

    kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor getInitialSignatureDescriptor();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor getOriginal();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> getOverriddenDescriptors();

    boolean isHiddenForResolutionEverywhereBesideSupercalls();

    boolean isHiddenToOvercomeSignatureClash();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    boolean isSuspend();

    boolean isTailrec();

    kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<? extends kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> newCopyBuilder();

    kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor substitute(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutor);
}
