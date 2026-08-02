package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* loaded from: classes5.dex */
public abstract class PropertyAccessorDescriptorImpl extends kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl implements kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor {
    private final boolean Camera2StreamConfigurationMap;
    private kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;
    private kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility getHighSpeedVideoSizesFor;
    private final kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind getInputFormats;
    private final kotlin.reflect.jvm.internal.impl.descriptors.Modality getOutputFormats;

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor getOriginal();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public <V> V getUserData(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<V> userDataKey) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public boolean hasSynthesizedParameterNames() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isHiddenForResolutionEverywhereBesideSupercalls() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isHiddenToOvercomeSignatureClash() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isInfix() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isOperator() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isTailrec() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyAccessorDescriptorImpl(kotlin.reflect.jvm.internal.impl.descriptors.Modality modality, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility, kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.name.Name name2, boolean z, boolean z2, boolean z3, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        super(propertyDescriptor.getContainingDeclaration(), annotations, name2, sourceElement);
        if (modality == null) {
            getHighSpeedVideoSizes(0);
        }
        if (descriptorVisibility == null) {
            getHighSpeedVideoSizes(1);
        }
        if (propertyDescriptor == null) {
            getHighSpeedVideoSizes(2);
        }
        if (annotations == null) {
            getHighSpeedVideoSizes(3);
        }
        if (name2 == null) {
            getHighSpeedVideoSizes(4);
        }
        if (sourceElement == null) {
            getHighSpeedVideoSizes(5);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getOutputFormats = modality;
        this.getHighSpeedVideoSizesFor = descriptorVisibility;
        this.getHighSpeedVideoFpsRangesFor = propertyDescriptor;
        this.getHighSpeedVideoSizes = z;
        this.Camera2StreamConfigurationMap = z2;
        this.getHighSpeedVideoFpsRanges = z3;
        this.getInputFormats = kind;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor
    public boolean isDefault() {
        return this.getHighSpeedVideoSizes;
    }

    public void setDefault(boolean z) {
        this.getHighSpeedVideoSizes = z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind getKind() {
        kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind = this.getInputFormats;
        if (kind == null) {
            getHighSpeedVideoSizes(6);
        }
        return kind;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isInline() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getTypeParameters() {
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> emptyList = java.util.Collections.emptyList();
        if (emptyList == null) {
            getHighSpeedVideoSizes(9);
        }
        return emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.Modality getModality() {
        kotlin.reflect.jvm.internal.impl.descriptors.Modality modality = this.getOutputFormats;
        if (modality == null) {
            getHighSpeedVideoSizes(10);
        }
        return modality;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility = this.getHighSpeedVideoSizesFor;
        if (descriptorVisibility == null) {
            getHighSpeedVideoSizes(11);
        }
        return descriptorVisibility;
    }

    public void setVisibility(kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility) {
        this.getHighSpeedVideoSizesFor = descriptorVisibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor getCorrespondingProperty() {
        kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor = this.getHighSpeedVideoFpsRangesFor;
        if (propertyDescriptor == null) {
            getHighSpeedVideoSizes(13);
        }
        return propertyDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> getContextReceiverParameters() {
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> contextReceiverParameters = getCorrespondingProperty().getContextReceiverParameters();
        if (contextReceiverParameters == null) {
            getHighSpeedVideoSizes(14);
        }
        return contextReceiverParameters;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor getExtensionReceiverParameter() {
        return getCorrespondingProperty().getExtensionReceiverParameter();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor getDispatchReceiverParameter() {
        return getCorrespondingProperty().getDispatchReceiverParameter();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<? extends kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> newCopyBuilder() {
        throw new java.lang.UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor copy(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Modality modality, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, boolean z) {
        throw new java.lang.UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    protected java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor> getOverriddenDescriptors(boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList(0);
        for (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor : getCorrespondingProperty().getOverriddenDescriptors()) {
            kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor getter = z ? propertyDescriptor.getGetter() : propertyDescriptor.getSetter();
            if (getter != null) {
                arrayList.add(getter);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor getInitialSignatureDescriptor() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setInitialSignatureDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
        this.getHighResolutionOutputSizeshNQ4ISI = functionDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor substitute(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            getHighSpeedVideoSizes(7);
        }
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void setOverriddenDescriptors(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> collection) {
        if (collection == null) {
            getHighSpeedVideoSizes(16);
        }
    }

    private static /* synthetic */ void getHighSpeedVideoSizes(int i) {
        java.lang.String str;
        int i2;
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i2 = 2;
                break;
            case 7:
            default:
                i2 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new java.lang.IllegalStateException(format);
            case 7:
            default:
                throw new java.lang.IllegalArgumentException(format);
        }
    }
}
