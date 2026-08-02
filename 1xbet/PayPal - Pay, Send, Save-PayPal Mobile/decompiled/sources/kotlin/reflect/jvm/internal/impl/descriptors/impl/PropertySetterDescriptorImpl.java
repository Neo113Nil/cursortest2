package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* loaded from: classes5.dex */
public class PropertySetterDescriptorImpl extends kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl implements kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor {
    private final kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor Camera2StreamConfigurationMap;
    private kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PropertySetterDescriptorImpl(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.descriptors.Modality modality, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility, boolean z, boolean z2, boolean z3, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor propertySetterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        super(modality, descriptorVisibility, propertyDescriptor, annotations, kotlin.reflect.jvm.internal.impl.name.Name.special(r0.toString()), z, z2, z3, kind, sourceElement);
        kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl propertySetterDescriptorImpl;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl propertySetterDescriptorImpl2;
        if (propertyDescriptor == null) {
            getHighSpeedVideoFpsRanges(0);
        }
        if (annotations == null) {
            getHighSpeedVideoFpsRanges(1);
        }
        if (modality == null) {
            getHighSpeedVideoFpsRanges(2);
        }
        if (descriptorVisibility == null) {
            getHighSpeedVideoFpsRanges(3);
        }
        if (kind == null) {
            getHighSpeedVideoFpsRanges(4);
        }
        if (sourceElement == null) {
            getHighSpeedVideoFpsRanges(5);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("<set-");
        sb.append(propertyDescriptor.getName());
        sb.append(">");
        if (propertySetterDescriptor == 0) {
            propertySetterDescriptorImpl2 = this;
            propertySetterDescriptorImpl = propertySetterDescriptorImpl2;
        } else {
            propertySetterDescriptorImpl = this;
            propertySetterDescriptorImpl2 = propertySetterDescriptor;
        }
        propertySetterDescriptorImpl.Camera2StreamConfigurationMap = propertySetterDescriptorImpl2;
    }

    public void initialize(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor) {
        if (valueParameterDescriptor == null) {
            getHighSpeedVideoFpsRanges(6);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = valueParameterDescriptor;
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl createSetterParameter(kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor propertySetterDescriptor, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations) {
        if (propertySetterDescriptor == null) {
            getHighSpeedVideoFpsRanges(7);
        }
        if (kotlinType == null) {
            getHighSpeedVideoFpsRanges(8);
        }
        if (annotations == null) {
            getHighSpeedVideoFpsRanges(9);
        }
        return new kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl(propertySetterDescriptor, null, 0, annotations, kotlin.reflect.jvm.internal.impl.name.SpecialNames.IMPLICIT_SET_PARAMETER, kotlinType, false, false, false, null, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor> getOverriddenDescriptors() {
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor> overriddenDescriptors = super.getOverriddenDescriptors(false);
        if (overriddenDescriptors == null) {
            getHighSpeedVideoFpsRanges(10);
        }
        return overriddenDescriptors;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> getValueParameters() {
        kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor = this.getHighResolutionOutputSizeshNQ4ISI;
        if (valueParameterDescriptor == null) {
            throw new java.lang.IllegalStateException();
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> singletonList = java.util.Collections.singletonList(valueParameterDescriptor);
        if (singletonList == null) {
            getHighSpeedVideoFpsRanges(11);
        }
        return singletonList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public kotlin.reflect.jvm.internal.impl.types.KotlinType getReturnType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType unitType = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getBuiltIns(this).getUnitType();
        if (unitType == null) {
            getHighSpeedVideoFpsRanges(12);
        }
        return unitType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.visitPropertySetterDescriptor(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor getOriginal() {
        kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor propertySetterDescriptor = this.Camera2StreamConfigurationMap;
        if (propertySetterDescriptor == null) {
            getHighSpeedVideoFpsRanges(13);
        }
        return propertySetterDescriptor;
    }

    private static /* synthetic */ void getHighSpeedVideoFpsRanges(int i) {
        java.lang.String str;
        int i2;
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i2];
        switch (i) {
            case 1:
            case 9:
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
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new java.lang.IllegalStateException(format);
            default:
                throw new java.lang.IllegalArgumentException(format);
        }
    }
}
