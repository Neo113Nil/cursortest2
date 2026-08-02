package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* loaded from: classes5.dex */
public abstract class AbstractReceiverParameterDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl implements kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor getDispatchReceiverParameter() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor getExtensionReceiverParameter() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor getOriginal() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public <V> V getUserData(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<V> userDataKey) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public boolean hasSynthesizedParameterNames() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractReceiverParameterDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations) {
        super(annotations, kotlin.reflect.jvm.internal.impl.name.SpecialNames.THIS);
        if (annotations == null) {
            getHighSpeedVideoFpsRanges(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractReceiverParameterDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.name.Name name2) {
        super(annotations, name2);
        if (annotations == null) {
            getHighSpeedVideoFpsRanges(1);
        }
        if (name2 == null) {
            getHighSpeedVideoFpsRanges(2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor substitute(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutor) {
        kotlin.reflect.jvm.internal.impl.types.KotlinType substitute;
        if (typeSubstitutor == null) {
            getHighSpeedVideoFpsRanges(3);
        }
        if (!typeSubstitutor.isEmpty()) {
            if (getContainingDeclaration() instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
                substitute = typeSubstitutor.substitute(getType(), kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE);
            } else {
                substitute = typeSubstitutor.substitute(getType(), kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT);
            }
            if (substitute == null) {
                return null;
            }
            if (substitute != getType()) {
                return new kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl(getContainingDeclaration(), new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.TransientReceiver(substitute), getAnnotations());
            }
        }
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.visitReceiverParameterDescriptor(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> getContextReceiverParameters() {
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> emptyList = java.util.Collections.emptyList();
        if (emptyList == null) {
            getHighSpeedVideoFpsRanges(4);
        }
        return emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getTypeParameters() {
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> emptyList = java.util.Collections.emptyList();
        if (emptyList == null) {
            getHighSpeedVideoFpsRanges(5);
        }
        return emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public kotlin.reflect.jvm.internal.impl.types.KotlinType getReturnType() {
        return getType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueDescriptor
    public kotlin.reflect.jvm.internal.impl.types.KotlinType getType() {
        kotlin.reflect.jvm.internal.impl.types.KotlinType type = getValue().getType();
        if (type == null) {
            getHighSpeedVideoFpsRanges(6);
        }
        return type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> getValueParameters() {
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> emptyList = java.util.Collections.emptyList();
        if (emptyList == null) {
            getHighSpeedVideoFpsRanges(7);
        }
        return emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor> getOverriddenDescriptors() {
        java.util.Set emptySet = java.util.Collections.emptySet();
        if (emptySet == null) {
            getHighSpeedVideoFpsRanges(8);
        }
        return emptySet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.LOCAL;
        if (descriptorVisibility == null) {
            getHighSpeedVideoFpsRanges(9);
        }
        return descriptorVisibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public kotlin.reflect.jvm.internal.impl.descriptors.SourceElement getSource() {
        kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement = kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE;
        if (sourceElement == null) {
            getHighSpeedVideoFpsRanges(11);
        }
        return sourceElement;
    }

    private static /* synthetic */ void getHighSpeedVideoFpsRanges(int i) {
        java.lang.String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i2];
        switch (i) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                throw new java.lang.IllegalStateException(format);
            default:
                throw new java.lang.IllegalArgumentException(format);
        }
    }
}
