package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* loaded from: classes5.dex */
public class PropertyGetterDescriptorImpl extends kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl implements kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor {
    private final kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor Camera2StreamConfigurationMap;
    private kotlin.reflect.jvm.internal.impl.types.KotlinType getHighSpeedVideoFpsRanges;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PropertyGetterDescriptorImpl(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.descriptors.Modality modality, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility, boolean z, boolean z2, boolean z3, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor propertyGetterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        super(modality, descriptorVisibility, propertyDescriptor, annotations, kotlin.reflect.jvm.internal.impl.name.Name.special(r0.toString()), z, z2, z3, kind, sourceElement);
        kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl propertyGetterDescriptorImpl2;
        if (propertyDescriptor == null) {
            getHighResolutionOutputSizeshNQ4ISI(0);
        }
        if (annotations == null) {
            getHighResolutionOutputSizeshNQ4ISI(1);
        }
        if (modality == null) {
            getHighResolutionOutputSizeshNQ4ISI(2);
        }
        if (descriptorVisibility == null) {
            getHighResolutionOutputSizeshNQ4ISI(3);
        }
        if (kind == null) {
            getHighResolutionOutputSizeshNQ4ISI(4);
        }
        if (sourceElement == null) {
            getHighResolutionOutputSizeshNQ4ISI(5);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("<get-");
        sb.append(propertyDescriptor.getName());
        sb.append(">");
        if (propertyGetterDescriptor == 0) {
            propertyGetterDescriptorImpl2 = this;
            propertyGetterDescriptorImpl = propertyGetterDescriptorImpl2;
        } else {
            propertyGetterDescriptorImpl = this;
            propertyGetterDescriptorImpl2 = propertyGetterDescriptor;
        }
        propertyGetterDescriptorImpl.Camera2StreamConfigurationMap = propertyGetterDescriptorImpl2;
    }

    public void initialize(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            kotlinType = getCorrespondingProperty().getType();
        }
        this.getHighSpeedVideoFpsRanges = kotlinType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor> getOverriddenDescriptors() {
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor> overriddenDescriptors = super.getOverriddenDescriptors(true);
        if (overriddenDescriptors == null) {
            getHighResolutionOutputSizeshNQ4ISI(6);
        }
        return overriddenDescriptors;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> getValueParameters() {
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> emptyList = java.util.Collections.emptyList();
        if (emptyList == null) {
            getHighResolutionOutputSizeshNQ4ISI(7);
        }
        return emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public kotlin.reflect.jvm.internal.impl.types.KotlinType getReturnType() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.visitPropertyGetterDescriptor(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor getOriginal() {
        kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor propertyGetterDescriptor = this.Camera2StreamConfigurationMap;
        if (propertyGetterDescriptor == null) {
            getHighResolutionOutputSizeshNQ4ISI(8);
        }
        return propertyGetterDescriptor;
    }

    private static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(int i) {
        java.lang.String str = (i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 6 || i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i == 7) {
            objArr[1] = "getValueParameters";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 6 && i != 7 && i != 8) {
            objArr[2] = "<init>";
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i != 6 && i != 7 && i != 8) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }
}
