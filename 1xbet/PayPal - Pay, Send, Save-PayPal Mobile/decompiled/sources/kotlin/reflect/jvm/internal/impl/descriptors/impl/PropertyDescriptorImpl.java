package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* loaded from: classes5.dex */
public class PropertyDescriptorImpl extends kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorWithInitializerImpl implements kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor {
    private kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor Camera2StreamConfigurationMap;
    private kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor getHighResolutionOutputSizeshNQ4ISI;
    private java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> getHighSpeedVideoFpsRanges;
    private kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor getHighSpeedVideoFpsRangesFor;
    private kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor getHighSpeedVideoSizes;
    private kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl getHighSpeedVideoSizesFor;
    private final boolean getInputFormats;
    private final boolean getInputSizeshNQ4ISI;
    private final boolean getOutputFormats;
    private final boolean getOutputMinFrameDuration;
    private final kotlin.reflect.jvm.internal.impl.descriptors.Modality getOutputMinFrameDurationlomOqCM;
    private final kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind getOutputSizes;
    private final kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor getOutputSizeshNQ4ISI;
    private final boolean getOutputStallDuration;
    private final boolean getOutputStallDurationlomOqCM;
    private kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility getValidOutputFormatsForInputhNQ4ISI;
    private java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> isOutputSupportedFor;
    private kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor isOutputSupportedForhNQ4ISI;
    private java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> toString;
    private boolean unwrapAs;

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public <V> V getUserData(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<V> userDataKey) {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyDescriptorImpl(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.descriptors.Modality modality, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility, boolean z, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        super(declarationDescriptor, annotations, name2, null, z, sourceElement);
        if (declarationDescriptor == null) {
            getHighSpeedVideoFpsRangesFor(0);
        }
        if (annotations == null) {
            getHighSpeedVideoFpsRangesFor(1);
        }
        if (modality == null) {
            getHighSpeedVideoFpsRangesFor(2);
        }
        if (descriptorVisibility == null) {
            getHighSpeedVideoFpsRangesFor(3);
        }
        if (name2 == null) {
            getHighSpeedVideoFpsRangesFor(4);
        }
        if (kind == null) {
            getHighSpeedVideoFpsRangesFor(5);
        }
        if (sourceElement == null) {
            getHighSpeedVideoFpsRangesFor(6);
        }
        this.toString = null;
        this.getHighSpeedVideoFpsRanges = java.util.Collections.emptyList();
        this.getOutputMinFrameDurationlomOqCM = modality;
        this.getValidOutputFormatsForInputhNQ4ISI = descriptorVisibility;
        this.getOutputSizeshNQ4ISI = propertyDescriptor == null ? this : propertyDescriptor;
        this.getOutputSizes = kind;
        this.getOutputStallDurationlomOqCM = z2;
        this.getInputFormats = z3;
        this.getOutputFormats = z4;
        this.getInputSizeshNQ4ISI = z5;
        this.getOutputStallDuration = z6;
        this.getOutputMinFrameDuration = z7;
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl create(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.descriptors.Modality modality, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility, boolean z, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        if (declarationDescriptor == null) {
            getHighSpeedVideoFpsRangesFor(7);
        }
        if (annotations == null) {
            getHighSpeedVideoFpsRangesFor(8);
        }
        if (modality == null) {
            getHighSpeedVideoFpsRangesFor(9);
        }
        if (descriptorVisibility == null) {
            getHighSpeedVideoFpsRangesFor(10);
        }
        if (name2 == null) {
            getHighSpeedVideoFpsRangesFor(11);
        }
        if (kind == null) {
            getHighSpeedVideoFpsRangesFor(12);
        }
        if (sourceElement == null) {
            getHighSpeedVideoFpsRangesFor(13);
        }
        return new kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl(declarationDescriptor, null, annotations, modality, descriptorVisibility, z, name2, kind, sourceElement, z2, z3, z4, z5, z6, z7);
    }

    public void setType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list, kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptor2, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> list2) {
        if (kotlinType == null) {
            getHighSpeedVideoFpsRangesFor(17);
        }
        if (list == null) {
            getHighSpeedVideoFpsRangesFor(18);
        }
        if (list2 == null) {
            getHighSpeedVideoFpsRangesFor(19);
        }
        setOutType(kotlinType);
        this.isOutputSupportedFor = new java.util.ArrayList(list);
        this.getHighResolutionOutputSizeshNQ4ISI = receiverParameterDescriptor2;
        this.getHighSpeedVideoSizes = receiverParameterDescriptor;
        this.getHighSpeedVideoFpsRanges = list2;
    }

    public void initialize(kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl propertyGetterDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor propertySetterDescriptor) {
        initialize(propertyGetterDescriptorImpl, propertySetterDescriptor, null, null);
    }

    public void initialize(kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl propertyGetterDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor propertySetterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor fieldDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor fieldDescriptor2) {
        this.getHighSpeedVideoSizesFor = propertyGetterDescriptorImpl;
        this.isOutputSupportedForhNQ4ISI = propertySetterDescriptor;
        this.getHighSpeedVideoFpsRangesFor = fieldDescriptor;
        this.Camera2StreamConfigurationMap = fieldDescriptor2;
    }

    public void setSetterProjectedOut(boolean z) {
        this.unwrapAs = z;
    }

    public void setVisibility(kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility) {
        if (descriptorVisibility == null) {
            getHighSpeedVideoFpsRangesFor(20);
        }
        this.getValidOutputFormatsForInputhNQ4ISI = descriptorVisibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getTypeParameters() {
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list = this.isOutputSupportedFor;
        if (list == null) {
            throw new java.lang.IllegalStateException("typeParameters == null for ".concat(java.lang.String.valueOf(this)));
        }
        if (list == null) {
            getHighSpeedVideoFpsRangesFor(21);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> getContextReceiverParameters() {
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> list = this.getHighSpeedVideoFpsRanges;
        if (list == null) {
            getHighSpeedVideoFpsRangesFor(22);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor getExtensionReceiverParameter() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor getDispatchReceiverParameter() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public kotlin.reflect.jvm.internal.impl.types.KotlinType getReturnType() {
        kotlin.reflect.jvm.internal.impl.types.KotlinType type = getType();
        if (type == null) {
            getHighSpeedVideoFpsRangesFor(23);
        }
        return type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.Modality getModality() {
        kotlin.reflect.jvm.internal.impl.descriptors.Modality modality = this.getOutputMinFrameDurationlomOqCM;
        if (modality == null) {
            getHighSpeedVideoFpsRangesFor(24);
        }
        return modality;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility = this.getValidOutputFormatsForInputhNQ4ISI;
        if (descriptorVisibility == null) {
            getHighSpeedVideoFpsRangesFor(25);
        }
        return descriptorVisibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl getGetter() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor getSetter() {
        return this.isOutputSupportedForhNQ4ISI;
    }

    public boolean isSetterProjectedOut() {
        return this.unwrapAs;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isLateInit() {
        return this.getOutputStallDurationlomOqCM;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isConst() {
        return this.getInputFormats;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return this.getOutputStallDuration;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptorWithAccessors
    public boolean isDelegated() {
        return this.getOutputMinFrameDuration;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor> getAccessors() {
        java.util.ArrayList arrayList = new java.util.ArrayList(2);
        kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl propertyGetterDescriptorImpl = this.getHighSpeedVideoSizesFor;
        if (propertyGetterDescriptorImpl != null) {
            arrayList.add(propertyGetterDescriptorImpl);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor propertySetterDescriptor = this.isOutputSupportedForhNQ4ISI;
        if (propertySetterDescriptor != null) {
            arrayList.add(propertySetterDescriptor);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor substitute(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            getHighSpeedVideoFpsRangesFor(27);
        }
        return typeSubstitutor.isEmpty() ? this : newCopyBuilder().setSubstitution(typeSubstitutor.getSubstitution()).setOriginal(getOriginal()).build();
    }

    public class CopyConfiguration {
        private kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind Camera2StreamConfigurationMap;
        private kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor getHighResolutionOutputSizeshNQ4ISI;
        private kotlin.reflect.jvm.internal.impl.descriptors.Modality getHighSpeedVideoSizesFor;
        private kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getInputFormats;
        private kotlin.reflect.jvm.internal.impl.name.Name getOutputMinFrameDuration;
        private kotlin.reflect.jvm.internal.impl.types.KotlinType getOutputMinFrameDurationlomOqCM;
        private kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility getOutputStallDurationlomOqCM;
        kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor getHighSpeedVideoSizes = null;
        private boolean getOutputFormats = false;
        private kotlin.reflect.jvm.internal.impl.types.TypeSubstitution getOutputSizeshNQ4ISI = kotlin.reflect.jvm.internal.impl.types.TypeSubstitution.EMPTY;
        private boolean getHighSpeedVideoFpsRanges = true;
        private java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getInputSizeshNQ4ISI = null;

        public CopyConfiguration() {
            this.getInputFormats = kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl.this.getContainingDeclaration();
            this.getHighSpeedVideoSizesFor = kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl.this.getModality();
            this.getOutputStallDurationlomOqCM = kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl.this.getVisibility();
            this.Camera2StreamConfigurationMap = kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl.this.getKind();
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl.this.getHighSpeedVideoSizes;
            this.getOutputMinFrameDuration = kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl.this.getName();
            this.getOutputMinFrameDurationlomOqCM = kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl.this.getType();
        }

        public kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl.CopyConfiguration setOwner(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor == null) {
                getHighSpeedVideoFpsRanges(0);
            }
            this.getInputFormats = declarationDescriptor;
            return this;
        }

        public kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl.CopyConfiguration setOriginal(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
            this.getHighSpeedVideoSizes = (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) callableMemberDescriptor;
            return this;
        }

        public kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl.CopyConfiguration setModality(kotlin.reflect.jvm.internal.impl.descriptors.Modality modality) {
            if (modality == null) {
                getHighSpeedVideoFpsRanges(6);
            }
            this.getHighSpeedVideoSizesFor = modality;
            return this;
        }

        public kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl.CopyConfiguration setVisibility(kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility) {
            if (descriptorVisibility == null) {
                getHighSpeedVideoFpsRanges(8);
            }
            this.getOutputStallDurationlomOqCM = descriptorVisibility;
            return this;
        }

        public kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl.CopyConfiguration setKind(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind) {
            if (kind == null) {
                getHighSpeedVideoFpsRanges(10);
            }
            this.Camera2StreamConfigurationMap = kind;
            return this;
        }

        public kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl.CopyConfiguration setSubstitution(kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution) {
            if (typeSubstitution == null) {
                getHighSpeedVideoFpsRanges(15);
            }
            this.getOutputSizeshNQ4ISI = typeSubstitution;
            return this;
        }

        public kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl.CopyConfiguration setCopyOverrides(boolean z) {
            this.getHighSpeedVideoFpsRanges = z;
            return this;
        }

        public kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor build() {
            return kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl.this.doSubstitute(this);
        }

        private static /* synthetic */ void getHighSpeedVideoFpsRanges(int i) {
            java.lang.String str = (i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            java.lang.Object[] objArr = new java.lang.Object[(i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? 2 : 3];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner;
                    break;
            }
            if (i == 1) {
                objArr[1] = "setOwner";
            } else if (i == 2) {
                objArr[1] = "setOriginal";
            } else if (i == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i == 5) {
                objArr[1] = "setReturnType";
            } else if (i == 7) {
                objArr[1] = "setModality";
            } else if (i == 9) {
                objArr[1] = "setVisibility";
            } else if (i == 11) {
                objArr[1] = "setKind";
            } else if (i == 19) {
                objArr[1] = "setName";
            } else if (i == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i == 16) {
                objArr[1] = "setSubstitution";
            } else if (i != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            java.lang.String format = java.lang.String.format(str, objArr);
            if (i != 1 && i != 2 && i != 3 && i != 5 && i != 7 && i != 9 && i != 11 && i != 19 && i != 13 && i != 14 && i != 16 && i != 17) {
                throw new java.lang.IllegalArgumentException(format);
            }
            throw new java.lang.IllegalStateException(format);
        }
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl.CopyConfiguration newCopyBuilder() {
        return new kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl.CopyConfiguration();
    }

    protected kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor doSubstitute(kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl.CopyConfiguration copyConfiguration) {
        kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement;
        kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptor;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl propertySetterDescriptorImpl;
        if (copyConfiguration == null) {
            getHighSpeedVideoFpsRangesFor(29);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor = copyConfiguration.getInputFormats;
        kotlin.reflect.jvm.internal.impl.descriptors.Modality modality = copyConfiguration.getHighSpeedVideoSizesFor;
        kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility = copyConfiguration.getOutputStallDurationlomOqCM;
        kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor = copyConfiguration.getHighSpeedVideoSizes;
        kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind = copyConfiguration.Camera2StreamConfigurationMap;
        kotlin.reflect.jvm.internal.impl.name.Name name2 = copyConfiguration.getOutputMinFrameDuration;
        boolean z = copyConfiguration.getOutputFormats;
        kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor2 = copyConfiguration.getHighSpeedVideoSizes;
        if (z) {
            if (propertyDescriptor2 == null) {
                propertyDescriptor2 = getOriginal();
            }
            sourceElement = propertyDescriptor2.getSource();
        } else {
            sourceElement = kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement2 = sourceElement;
        if (sourceElement2 == null) {
            getHighSpeedVideoFpsRangesFor(28);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl createSubstitutedCopy = createSubstitutedCopy(declarationDescriptor, modality, descriptorVisibility, propertyDescriptor, kind, name2, sourceElement2);
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameters = copyConfiguration.getInputSizeshNQ4ISI == null ? getTypeParameters() : copyConfiguration.getInputSizeshNQ4ISI;
        java.util.ArrayList arrayList = new java.util.ArrayList(typeParameters.size());
        kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor substituteTypeParameters = kotlin.reflect.jvm.internal.impl.types.DescriptorSubstitutor.substituteTypeParameters(typeParameters, copyConfiguration.getOutputSizeshNQ4ISI, createSubstitutedCopy, arrayList);
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType = copyConfiguration.getOutputMinFrameDurationlomOqCM;
        kotlin.reflect.jvm.internal.impl.types.KotlinType substitute = substituteTypeParameters.substitute(kotlinType, kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE);
        if (substitute == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType substitute2 = substituteTypeParameters.substitute(kotlinType, kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE);
        if (substitute2 != null) {
            createSubstitutedCopy.setInType(substitute2);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptor2 = copyConfiguration.getHighResolutionOutputSizeshNQ4ISI;
        if (receiverParameterDescriptor2 != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor substitute3 = receiverParameterDescriptor2.substitute(substituteTypeParameters);
            if (substitute3 == null) {
                return null;
            }
            receiverParameterDescriptor = substitute3;
        } else {
            receiverParameterDescriptor = null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptor3 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (receiverParameterDescriptor3 != null) {
            kotlin.reflect.jvm.internal.impl.types.KotlinType substitute4 = substituteTypeParameters.substitute(receiverParameterDescriptor3.getType(), kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE);
            receiverParameterDescriptorImpl = substitute4 == null ? null : new kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl(createSubstitutedCopy, new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ExtensionReceiver(createSubstitutedCopy, substitute4, receiverParameterDescriptor3.getValue()), receiverParameterDescriptor3.getAnnotations());
        } else {
            receiverParameterDescriptorImpl = null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptor4 : this.getHighSpeedVideoFpsRanges) {
            kotlin.reflect.jvm.internal.impl.types.KotlinType substitute5 = substituteTypeParameters.substitute(receiverParameterDescriptor4.getType(), kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE);
            kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl2 = substitute5 == null ? null : new kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl(createSubstitutedCopy, new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextReceiver(createSubstitutedCopy, substitute5, ((kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver) receiverParameterDescriptor4.getValue()).getCustomLabelName(), receiverParameterDescriptor4.getValue()), receiverParameterDescriptor4.getAnnotations());
            if (receiverParameterDescriptorImpl2 != null) {
                arrayList2.add(receiverParameterDescriptorImpl2);
            }
        }
        createSubstitutedCopy.setType(substitute, arrayList, receiverParameterDescriptor, receiverParameterDescriptorImpl, arrayList2);
        kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl propertyGetterDescriptorImpl2 = this.getHighSpeedVideoSizesFor;
        if (propertyGetterDescriptorImpl2 == null) {
            propertyGetterDescriptorImpl = null;
        } else {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations = propertyGetterDescriptorImpl2.getAnnotations();
            kotlin.reflect.jvm.internal.impl.descriptors.Modality modality2 = copyConfiguration.getHighSpeedVideoSizesFor;
            kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility visibility = this.getHighSpeedVideoSizesFor.getVisibility();
            if (copyConfiguration.Camera2StreamConfigurationMap == kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE && kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.isPrivate(visibility.normalize())) {
                visibility = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.INVISIBLE_FAKE;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility2 = visibility;
            boolean isDefault = this.getHighSpeedVideoSizesFor.isDefault();
            boolean isExternal = this.getHighSpeedVideoSizesFor.isExternal();
            boolean isInline = this.getHighSpeedVideoSizesFor.isInline();
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind2 = copyConfiguration.Camera2StreamConfigurationMap;
            kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor3 = copyConfiguration.getHighSpeedVideoSizes;
            propertyGetterDescriptorImpl = new kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl(createSubstitutedCopy, annotations, modality2, descriptorVisibility2, isDefault, isExternal, isInline, kind2, propertyDescriptor3 == null ? null : propertyDescriptor3.getGetter(), kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE);
        }
        if (propertyGetterDescriptorImpl != null) {
            kotlin.reflect.jvm.internal.impl.types.KotlinType returnType = this.getHighSpeedVideoSizesFor.getReturnType();
            propertyGetterDescriptorImpl.setInitialSignatureDescriptor(Camera2StreamConfigurationMap(substituteTypeParameters, this.getHighSpeedVideoSizesFor));
            propertyGetterDescriptorImpl.initialize(returnType != null ? substituteTypeParameters.substitute(returnType, kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE) : null);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor propertySetterDescriptor = this.isOutputSupportedForhNQ4ISI;
        if (propertySetterDescriptor == null) {
            propertySetterDescriptorImpl = null;
        } else {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations2 = propertySetterDescriptor.getAnnotations();
            kotlin.reflect.jvm.internal.impl.descriptors.Modality modality3 = copyConfiguration.getHighSpeedVideoSizesFor;
            kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility visibility2 = this.isOutputSupportedForhNQ4ISI.getVisibility();
            if (copyConfiguration.Camera2StreamConfigurationMap == kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE && kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.isPrivate(visibility2.normalize())) {
                visibility2 = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.INVISIBLE_FAKE;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility3 = visibility2;
            boolean isDefault2 = this.isOutputSupportedForhNQ4ISI.isDefault();
            boolean isExternal2 = this.isOutputSupportedForhNQ4ISI.isExternal();
            boolean isInline2 = this.isOutputSupportedForhNQ4ISI.isInline();
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind3 = copyConfiguration.Camera2StreamConfigurationMap;
            kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor4 = copyConfiguration.getHighSpeedVideoSizes;
            propertySetterDescriptorImpl = new kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl(createSubstitutedCopy, annotations2, modality3, descriptorVisibility3, isDefault2, isExternal2, isInline2, kind3, propertyDescriptor4 == null ? null : propertyDescriptor4.getSetter(), kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE);
        }
        if (propertySetterDescriptorImpl != null) {
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> substitutedValueParameters = kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl.getSubstitutedValueParameters(propertySetterDescriptorImpl, this.isOutputSupportedForhNQ4ISI.getValueParameters(), substituteTypeParameters, false, false, null);
            if (substitutedValueParameters == null) {
                createSubstitutedCopy.setSetterProjectedOut(true);
                substitutedValueParameters = java.util.Collections.singletonList(kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl.createSetterParameter(propertySetterDescriptorImpl, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getBuiltIns(copyConfiguration.getInputFormats).getNothingType(), this.isOutputSupportedForhNQ4ISI.getValueParameters().get(0).getAnnotations()));
            }
            if (substitutedValueParameters.size() != 1) {
                throw new java.lang.IllegalStateException();
            }
            propertySetterDescriptorImpl.setInitialSignatureDescriptor(Camera2StreamConfigurationMap(substituteTypeParameters, this.isOutputSupportedForhNQ4ISI));
            propertySetterDescriptorImpl.initialize(substitutedValueParameters.get(0));
        }
        kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor fieldDescriptor = this.getHighSpeedVideoFpsRangesFor;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.FieldDescriptorImpl fieldDescriptorImpl = fieldDescriptor == null ? null : new kotlin.reflect.jvm.internal.impl.descriptors.impl.FieldDescriptorImpl(fieldDescriptor.getAnnotations(), createSubstitutedCopy);
        kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor fieldDescriptor2 = this.Camera2StreamConfigurationMap;
        createSubstitutedCopy.initialize(propertyGetterDescriptorImpl, propertySetterDescriptorImpl, fieldDescriptorImpl, fieldDescriptor2 != null ? new kotlin.reflect.jvm.internal.impl.descriptors.impl.FieldDescriptorImpl(fieldDescriptor2.getAnnotations(), createSubstitutedCopy) : null);
        if (copyConfiguration.getHighSpeedVideoFpsRanges) {
            kotlin.reflect.jvm.internal.impl.utils.SmartSet create = kotlin.reflect.jvm.internal.impl.utils.SmartSet.create();
            java.util.Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor> it = getOverriddenDescriptors().iterator();
            while (it.hasNext()) {
                create.add(((kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) it.next()).substitute(substituteTypeParameters));
            }
            createSubstitutedCopy.setOverriddenDescriptors(create);
        }
        if (isConst() && this.compileTimeInitializerFactory != null) {
            createSubstitutedCopy.setCompileTimeInitializer(this.compileTimeInitializer, this.compileTimeInitializerFactory);
        }
        return createSubstitutedCopy;
    }

    private static kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutor, kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor propertyAccessorDescriptor) {
        if (typeSubstitutor == null) {
            getHighSpeedVideoFpsRangesFor(30);
        }
        if (propertyAccessorDescriptor == null) {
            getHighSpeedVideoFpsRangesFor(31);
        }
        if (propertyAccessorDescriptor.getInitialSignatureDescriptor() != null) {
            return propertyAccessorDescriptor.getInitialSignatureDescriptor().substitute(typeSubstitutor);
        }
        return null;
    }

    protected kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl createSubstitutedCopy(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Modality modality, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility, kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            getHighSpeedVideoFpsRangesFor(32);
        }
        if (modality == null) {
            getHighSpeedVideoFpsRangesFor(33);
        }
        if (descriptorVisibility == null) {
            getHighSpeedVideoFpsRangesFor(34);
        }
        if (kind == null) {
            getHighSpeedVideoFpsRangesFor(35);
        }
        if (name2 == null) {
            getHighSpeedVideoFpsRangesFor(36);
        }
        if (sourceElement == null) {
            getHighSpeedVideoFpsRangesFor(37);
        }
        return new kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl(declarationDescriptor, propertyDescriptor, getAnnotations(), modality, descriptorVisibility, isVar(), name2, kind, sourceElement, isLateInit(), isConst(), isExpect(), isActual(), isExternal(), isDelegated());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.visitPropertyDescriptor(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor getOriginal() {
        kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor = this.getOutputSizeshNQ4ISI;
        kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor original = propertyDescriptor == this ? this : propertyDescriptor.getOriginal();
        if (original == null) {
            getHighSpeedVideoFpsRangesFor(38);
        }
        return original;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind getKind() {
        kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind = this.getOutputSizes;
        if (kind == null) {
            getHighSpeedVideoFpsRangesFor(39);
        }
        return kind;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return this.getOutputFormats;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return this.getInputSizeshNQ4ISI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor getBackingField() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor getDelegateField() {
        return this.Camera2StreamConfigurationMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void setOverriddenDescriptors(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> collection) {
        if (collection == 0) {
            getHighSpeedVideoFpsRangesFor(40);
        }
        this.toString = collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getOverriddenDescriptors() {
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> collection = this.toString;
        if (collection == null) {
            collection = java.util.Collections.emptyList();
        }
        if (collection == null) {
            getHighSpeedVideoFpsRangesFor(41);
        }
        return collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor copy(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Modality modality, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, boolean z) {
        kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor build = newCopyBuilder().setOwner(declarationDescriptor).setOriginal(null).setModality(modality).setVisibility(descriptorVisibility).setKind(kind).setCopyOverrides(z).build();
        if (build == null) {
            getHighSpeedVideoFpsRangesFor(42);
        }
        return build;
    }

    public void setInType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            getHighSpeedVideoFpsRangesFor(14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void getHighSpeedVideoFpsRangesFor(int i) {
        java.lang.String str;
        int i2;
        if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
                switch (i) {
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                        break;
                    default:
                        i2 = 3;
                        break;
                }
                java.lang.Object[] objArr = new java.lang.Object[i2];
                switch (i) {
                    case 1:
                    case 8:
                        objArr[0] = "annotations";
                        break;
                    case 2:
                    case 9:
                        objArr[0] = "modality";
                        break;
                    case 3:
                    case 10:
                    case 20:
                        objArr[0] = "visibility";
                        break;
                    case 4:
                    case 11:
                        objArr[0] = "name";
                        break;
                    case 5:
                    case 12:
                    case 35:
                        objArr[0] = "kind";
                        break;
                    case 6:
                    case 13:
                    case 37:
                        objArr[0] = "source";
                        break;
                    case 7:
                    default:
                        objArr[0] = "containingDeclaration";
                        break;
                    case 14:
                        objArr[0] = "inType";
                        break;
                    case 15:
                    case 17:
                        objArr[0] = "outType";
                        break;
                    case 16:
                    case 18:
                        objArr[0] = "typeParameters";
                        break;
                    case 19:
                        objArr[0] = "contextReceiverParameters";
                        break;
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 28:
                    case 38:
                    case 39:
                    case 41:
                    case 42:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                        break;
                    case 27:
                        objArr[0] = "originalSubstitutor";
                        break;
                    case 29:
                        objArr[0] = "copyConfiguration";
                        break;
                    case 30:
                        objArr[0] = "substitutor";
                        break;
                    case 31:
                        objArr[0] = "accessorDescriptor";
                        break;
                    case 32:
                        objArr[0] = "newOwner";
                        break;
                    case 33:
                        objArr[0] = "newModality";
                        break;
                    case 34:
                        objArr[0] = "newVisibility";
                        break;
                    case 36:
                        objArr[0] = "newName";
                        break;
                    case 40:
                        objArr[0] = "overriddenDescriptors";
                        break;
                }
                if (i != 28) {
                    objArr[1] = "getSourceToUseForCopy";
                } else if (i == 38) {
                    objArr[1] = "getOriginal";
                } else if (i == 39) {
                    objArr[1] = "getKind";
                } else if (i == 41) {
                    objArr[1] = "getOverriddenDescriptors";
                } else if (i != 42) {
                    switch (i) {
                        case 21:
                            objArr[1] = "getTypeParameters";
                            break;
                        case 22:
                            objArr[1] = "getContextReceiverParameters";
                            break;
                        case 23:
                            objArr[1] = "getReturnType";
                            break;
                        case 24:
                            objArr[1] = "getModality";
                            break;
                        case 25:
                            objArr[1] = "getVisibility";
                            break;
                        case 26:
                            objArr[1] = "getAccessors";
                            break;
                        default:
                            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                            break;
                    }
                } else {
                    objArr[1] = "copy";
                }
                switch (i) {
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        objArr[2] = "create";
                        break;
                    case 14:
                        objArr[2] = "setInType";
                        break;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        objArr[2] = "setType";
                        break;
                    case 20:
                        objArr[2] = "setVisibility";
                        break;
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 28:
                    case 38:
                    case 39:
                    case 41:
                    case 42:
                        break;
                    case 27:
                        objArr[2] = "substitute";
                        break;
                    case 29:
                        objArr[2] = "doSubstitute";
                        break;
                    case 30:
                    case 31:
                        objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                        break;
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                        objArr[2] = "createSubstitutedCopy";
                        break;
                    case 40:
                        objArr[2] = "setOverriddenDescriptors";
                        break;
                    default:
                        objArr[2] = "<init>";
                        break;
                }
                java.lang.String format = java.lang.String.format(str, objArr);
                if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
                    switch (i) {
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                            break;
                        default:
                            throw new java.lang.IllegalArgumentException(format);
                    }
                }
                throw new java.lang.IllegalStateException(format);
            }
            i2 = 2;
            java.lang.Object[] objArr2 = new java.lang.Object[i2];
            switch (i) {
            }
            if (i != 28) {
            }
            switch (i) {
            }
            java.lang.String format2 = java.lang.String.format(str, objArr2);
            if (i != 28) {
                switch (i) {
                }
            }
            throw new java.lang.IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i != 28) {
            switch (i) {
            }
            java.lang.Object[] objArr22 = new java.lang.Object[i2];
            switch (i) {
            }
            if (i != 28) {
            }
            switch (i) {
            }
            java.lang.String format22 = java.lang.String.format(str, objArr22);
            if (i != 28) {
            }
            throw new java.lang.IllegalStateException(format22);
        }
        i2 = 2;
        java.lang.Object[] objArr222 = new java.lang.Object[i2];
        switch (i) {
        }
        if (i != 28) {
        }
        switch (i) {
        }
        java.lang.String format222 = java.lang.String.format(str, objArr222);
        if (i != 28) {
        }
        throw new java.lang.IllegalStateException(format222);
    }
}
