package kotlin.reflect.jvm.internal.impl.types.error;

/* loaded from: classes5.dex */
public final class ErrorFunctionDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public final boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor copy(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Modality modality, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, boolean z) {
        return copy(declarationDescriptor, modality, descriptorVisibility, kind, z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor copy(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Modality modality, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, boolean z) {
        return copy(declarationDescriptor, modality, descriptorVisibility, kind, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorFunctionDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        super(classDescriptor, null, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), kotlin.reflect.jvm.internal.impl.name.Name.special(kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity.ERROR_FUNCTION.getDebugText()), kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        initialize((kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor) null, (kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor) null, kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.CollectionsKt.emptyList(), (kotlin.reflect.jvm.internal.impl.types.KotlinType) kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.createErrorType(kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.RETURN_TYPE_FOR_FUNCTION, new java.lang.String[0]), kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.PUBLIC);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public final kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl createSubstitutedCopy(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kind, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotations, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceElement, "");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor copy(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Modality modality, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modality, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorVisibility, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kind, "");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public final kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> newCopyBuilder() {
        return new kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.types.error.ErrorFunctionDescriptor$newCopyBuilder$1
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> setOwner(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> setModality(kotlin.reflect.jvm.internal.impl.descriptors.Modality modality) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modality, "");
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> setVisibility(kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorVisibility, "");
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> setKind(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kind, "");
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> setCopyOverrides(boolean z) {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> setName(kotlin.reflect.jvm.internal.impl.name.Name name2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> setSubstitution(kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSubstitution, "");
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> setValueParameters(java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final <V> kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> putUserData(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<V> userDataKey, V v) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userDataKey, "");
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> setTypeParameters(java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> setReturnType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> setExtensionReceiverParameter(kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptor) {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> setDispatchReceiverParameter(kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptor) {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> setOriginal(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> setSignatureChange() {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> setPreserveSourceElement() {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> setDropOriginalInContainingParts() {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> setHiddenToOvercomeSignatureClash() {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> setHiddenForResolutionEverywhereBesideSupercalls() {
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> setAdditionalAnnotations(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotations, "");
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
            public final kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor build() {
                return kotlin.reflect.jvm.internal.impl.types.error.ErrorFunctionDescriptor.this;
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final void setOverriddenDescriptors(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final <V> V getUserData(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<V> userDataKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userDataKey, "");
        return null;
    }
}
