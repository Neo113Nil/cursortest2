package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* loaded from: classes5.dex */
public abstract class VariableDescriptorImpl extends kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl implements kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor {
    protected kotlin.reflect.jvm.internal.impl.types.KotlinType outType;

    public kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor getDispatchReceiverParameter() {
        return null;
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor getExtensionReceiverParameter() {
        return null;
    }

    public <V> V getUserData(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<V> userDataKey) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public boolean hasSynthesizedParameterNames() {
        return false;
    }

    public boolean isConst() {
        return false;
    }

    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot substitute(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutor) {
        return substitute(typeSubstitutor);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VariableDescriptorImpl(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        super(declarationDescriptor, annotations, name2, sourceElement);
        if (declarationDescriptor == null) {
            getHighSpeedVideoSizes(0);
        }
        if (annotations == null) {
            getHighSpeedVideoSizes(1);
        }
        if (name2 == null) {
            getHighSpeedVideoSizes(2);
        }
        if (sourceElement == null) {
            getHighSpeedVideoSizes(3);
        }
        this.outType = kotlinType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueDescriptor
    public kotlin.reflect.jvm.internal.impl.types.KotlinType getType() {
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType = this.outType;
        if (kotlinType == null) {
            getHighSpeedVideoSizes(4);
        }
        return kotlinType;
    }

    public void setOutType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        this.outType = kotlinType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor getOriginal() {
        kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor variableDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor) super.getOriginal();
        if (variableDescriptor == null) {
            getHighSpeedVideoSizes(5);
        }
        return variableDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> getValueParameters() {
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> emptyList = java.util.Collections.emptyList();
        if (emptyList == null) {
            getHighSpeedVideoSizes(6);
        }
        return emptyList;
    }

    public java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor> getOverriddenDescriptors() {
        java.util.Set emptySet = java.util.Collections.emptySet();
        if (emptySet == null) {
            getHighSpeedVideoSizes(7);
        }
        return emptySet;
    }

    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getTypeParameters() {
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> emptyList = java.util.Collections.emptyList();
        if (emptyList == null) {
            getHighSpeedVideoSizes(8);
        }
        return emptyList;
    }

    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> getContextReceiverParameters() {
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> emptyList = java.util.Collections.emptyList();
        if (emptyList == null) {
            getHighSpeedVideoSizes(9);
        }
        return emptyList;
    }

    public kotlin.reflect.jvm.internal.impl.types.KotlinType getReturnType() {
        kotlin.reflect.jvm.internal.impl.types.KotlinType type = getType();
        if (type == null) {
            getHighSpeedVideoSizes(10);
        }
        return type;
    }

    private static /* synthetic */ void getHighSpeedVideoSizes(int i) {
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
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
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
                throw new java.lang.IllegalStateException(format);
            default:
                throw new java.lang.IllegalArgumentException(format);
        }
    }
}
