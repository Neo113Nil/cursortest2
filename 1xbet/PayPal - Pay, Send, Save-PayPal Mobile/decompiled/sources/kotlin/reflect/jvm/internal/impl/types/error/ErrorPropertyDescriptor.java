package kotlin.reflect.jvm.internal.impl.types.error;

/* loaded from: classes5.dex */
public final class ErrorPropertyDescriptor implements kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor {
    private final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl Camera2StreamConfigurationMap;

    public ErrorPropertyDescriptor() {
        kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl create = kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl.create(kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.INSTANCE.getErrorClass(), kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.PUBLIC, true, kotlin.reflect.jvm.internal.impl.name.Name.special(kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity.ERROR_PROPERTY.getDebugText()), kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE, false, false, false, false, false, false);
        create.setType(kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.INSTANCE.getErrorPropertyType(), kotlin.collections.CollectionsKt.emptyList(), null, null, kotlin.collections.CollectionsKt.emptyList());
        this.Camera2StreamConfigurationMap = create;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public final kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor substitute(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSubstitutor, "");
        return this.Camera2StreamConfigurationMap.substitute(typeSubstitutor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final void setOverriddenDescriptors(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        this.Camera2StreamConfigurationMap.setOverriddenDescriptors(collection);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public final boolean isVar() {
        return this.Camera2StreamConfigurationMap.isVar();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public final boolean isLateInit() {
        return this.Camera2StreamConfigurationMap.isLateInit();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean isExternal() {
        return this.Camera2StreamConfigurationMap.isExternal();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean isExpect() {
        return this.Camera2StreamConfigurationMap.isExpect();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptorWithAccessors
    public final boolean isDelegated() {
        return this.Camera2StreamConfigurationMap.isDelegated();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public final boolean isConst() {
        return this.Camera2StreamConfigurationMap.isConst();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean isActual() {
        return this.Camera2StreamConfigurationMap.isActual();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final boolean hasSynthesizedParameterNames() {
        return this.Camera2StreamConfigurationMap.hasSynthesizedParameterNames();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public final kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility visibility = this.Camera2StreamConfigurationMap.getVisibility();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(visibility, "");
        return visibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> getValueParameters() {
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = this.Camera2StreamConfigurationMap.getValueParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters, "");
        return valueParameters;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final <V> V getUserData(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<V> userDataKey) {
        return (V) this.Camera2StreamConfigurationMap.getUserData(userDataKey);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getTypeParameters() {
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameters = this.Camera2StreamConfigurationMap.getTypeParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeParameters, "");
        return typeParameters;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueDescriptor
    public final kotlin.reflect.jvm.internal.impl.types.KotlinType getType() {
        kotlin.reflect.jvm.internal.impl.types.KotlinType type = this.Camera2StreamConfigurationMap.getType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
        return type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public final kotlin.reflect.jvm.internal.impl.descriptors.SourceElement getSource() {
        kotlin.reflect.jvm.internal.impl.descriptors.SourceElement source = this.Camera2StreamConfigurationMap.getSource();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(source, "");
        return source;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public final kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor getSetter() {
        return this.Camera2StreamConfigurationMap.getSetter();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final kotlin.reflect.jvm.internal.impl.types.KotlinType getReturnType() {
        return this.Camera2StreamConfigurationMap.getReturnType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getOverriddenDescriptors() {
        java.util.Collection overriddenDescriptors = this.Camera2StreamConfigurationMap.getOverriddenDescriptors();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "");
        return overriddenDescriptors;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor getOriginal() {
        kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor original = this.Camera2StreamConfigurationMap.getOriginal();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(original, "");
        return original;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    public final kotlin.reflect.jvm.internal.impl.name.Name getName() {
        kotlin.reflect.jvm.internal.impl.name.Name name2 = this.Camera2StreamConfigurationMap.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        return name2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final kotlin.reflect.jvm.internal.impl.descriptors.Modality getModality() {
        kotlin.reflect.jvm.internal.impl.descriptors.Modality modality = this.Camera2StreamConfigurationMap.getModality();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(modality, "");
        return modality;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind getKind() {
        kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind = this.Camera2StreamConfigurationMap.getKind();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(kind, "");
        return kind;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public final kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor getGetter() {
        return this.Camera2StreamConfigurationMap.getGetter();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor getExtensionReceiverParameter() {
        return this.Camera2StreamConfigurationMap.getExtensionReceiverParameter();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor getDispatchReceiverParameter() {
        return this.Camera2StreamConfigurationMap.getDispatchReceiverParameter();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public final kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor getDelegateField() {
        return this.Camera2StreamConfigurationMap.getDelegateField();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> getContextReceiverParameters() {
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> contextReceiverParameters = this.Camera2StreamConfigurationMap.getContextReceiverParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contextReceiverParameters, "");
        return contextReceiverParameters;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getContainingDeclaration() {
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = this.Camera2StreamConfigurationMap.getContainingDeclaration();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(containingDeclaration, "");
        return containingDeclaration;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    /* renamed from: getCompileTimeInitializer */
    public final kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> mo23891getCompileTimeInitializer() {
        return this.Camera2StreamConfigurationMap.mo23891getCompileTimeInitializer();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public final kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor getBackingField() {
        return this.Camera2StreamConfigurationMap.getBackingField();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getAnnotations() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations = this.Camera2StreamConfigurationMap.getAnnotations();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(annotations, "");
        return annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor> getAccessors() {
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor> accessors = this.Camera2StreamConfigurationMap.getAccessors();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(accessors, "");
        return accessors;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor copy(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Modality modality, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, boolean z) {
        kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor copy = this.Camera2StreamConfigurationMap.copy(declarationDescriptor, modality, descriptorVisibility, kind, z);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copy, "");
        return copy;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final <R, D> R accept(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return (R) this.Camera2StreamConfigurationMap.accept(declarationDescriptorVisitor, d);
    }
}
