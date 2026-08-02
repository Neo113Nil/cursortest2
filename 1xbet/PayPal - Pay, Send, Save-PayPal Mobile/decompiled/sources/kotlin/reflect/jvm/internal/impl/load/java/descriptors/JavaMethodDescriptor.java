package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

/* loaded from: classes5.dex */
public class JavaMethodDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl implements kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor {
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor.ParameterNamesStatus getHighSpeedVideoSizes;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER = new kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor.1
    };
    public static final kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<java.lang.Boolean> HAS_ERASED_VALUE_PARAMETERS = new kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<java.lang.Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor.2
    };

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor enhance(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, java.util.List list, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2, kotlin.Pair pair) {
        return enhance(kotlinType, (java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType>) list, kotlinType2, (kotlin.Pair<kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<?>, ?>) pair);
    }

    enum ParameterNamesStatus {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);

        public final boolean getHighSpeedVideoSizes;
        public final boolean getInputSizeshNQ4ISI;

        ParameterNamesStatus(boolean z, boolean z2) {
            this.getHighSpeedVideoSizes = z;
            this.getInputSizeshNQ4ISI = z2;
        }

        public static kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor.ParameterNamesStatus getHighSpeedVideoSizes(boolean z, boolean z2) {
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor.ParameterNamesStatus parameterNamesStatus;
            if (z) {
                parameterNamesStatus = z2 ? STABLE_SYNTHESIZED : STABLE_DECLARED;
            } else {
                parameterNamesStatus = z2 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
            }
            if (parameterNamesStatus != null) {
                return parameterNamesStatus;
            }
            throw new java.lang.IllegalStateException(java.lang.String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus", "get"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected JavaMethodDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement, boolean z) {
        super(declarationDescriptor, simpleFunctionDescriptor, annotations, name2, kind, sourceElement);
        if (declarationDescriptor == null) {
            getHighSpeedVideoFpsRanges(0);
        }
        if (annotations == null) {
            getHighSpeedVideoFpsRanges(1);
        }
        if (name2 == null) {
            getHighSpeedVideoFpsRanges(2);
        }
        if (kind == null) {
            getHighSpeedVideoFpsRanges(3);
        }
        if (sourceElement == null) {
            getHighSpeedVideoFpsRanges(4);
        }
        this.getHighSpeedVideoSizes = null;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    public static kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor createJavaMethod(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement, boolean z) {
        if (declarationDescriptor == null) {
            getHighSpeedVideoFpsRanges(5);
        }
        if (annotations == null) {
            getHighSpeedVideoFpsRanges(6);
        }
        if (name2 == null) {
            getHighSpeedVideoFpsRanges(7);
        }
        if (sourceElement == null) {
            getHighSpeedVideoFpsRanges(8);
        }
        return new kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor(declarationDescriptor, null, annotations, name2, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION, sourceElement, z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl
    public kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl initialize(kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptor2, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> list, java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list2, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list3, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.descriptors.Modality modality, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility, java.util.Map<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<?>, ?> map) {
        if (list == null) {
            getHighSpeedVideoFpsRanges(9);
        }
        if (list2 == null) {
            getHighSpeedVideoFpsRanges(10);
        }
        if (list3 == null) {
            getHighSpeedVideoFpsRanges(11);
        }
        if (descriptorVisibility == null) {
            getHighSpeedVideoFpsRanges(12);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl initialize = super.initialize(receiverParameterDescriptor, receiverParameterDescriptor2, list, list2, list3, kotlinType, modality, descriptorVisibility, map);
        setOperator(kotlin.reflect.jvm.internal.impl.util.OperatorChecks.INSTANCE.check(initialize).isSuccess());
        if (initialize == null) {
            getHighSpeedVideoFpsRanges(13);
        }
        return initialize;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public boolean hasStableParameterNames() {
        return this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public boolean hasSynthesizedParameterNames() {
        return this.getHighSpeedVideoSizes.getInputSizeshNQ4ISI;
    }

    public void setParameterNamesStatus(boolean z, boolean z2) {
        this.getHighSpeedVideoSizes = kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor.ParameterNamesStatus.getHighSpeedVideoSizes(z, z2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor createSubstitutedCopy(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            getHighSpeedVideoFpsRanges(14);
        }
        if (kind == null) {
            getHighSpeedVideoFpsRanges(15);
        }
        if (annotations == null) {
            getHighSpeedVideoFpsRanges(16);
        }
        if (sourceElement == null) {
            getHighSpeedVideoFpsRanges(17);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) functionDescriptor;
        if (name2 == null) {
            name2 = getName();
        }
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor javaMethodDescriptor = new kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor(declarationDescriptor, simpleFunctionDescriptor, annotations, name2, kind, sourceElement, this.getHighResolutionOutputSizeshNQ4ISI);
        javaMethodDescriptor.setParameterNamesStatus(hasStableParameterNames(), hasSynthesizedParameterNames());
        return javaMethodDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor
    public kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor enhance(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> list, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2, kotlin.Pair<kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<?>, ?> pair) {
        if (list == null) {
            getHighSpeedVideoFpsRanges(19);
        }
        if (kotlinType2 == null) {
            getHighSpeedVideoFpsRanges(20);
        }
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor javaMethodDescriptor = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor) newCopyBuilder().setValueParameters(kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt.copyValueParameters(list, getValueParameters(), this)).setReturnType(kotlinType2).setExtensionReceiverParameter(kotlinType == null ? null : kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createExtensionReceiverParameterForCallable(this, kotlinType, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY())).setDropOriginalInContainingParts().setPreserveSourceElement().build();
        if (pair != null) {
            javaMethodDescriptor.putInUserDataMap(pair.getFirst(), pair.getSecond());
        }
        if (javaMethodDescriptor == null) {
            getHighSpeedVideoFpsRanges(21);
        }
        return javaMethodDescriptor;
    }

    private static /* synthetic */ void getHighSpeedVideoFpsRanges(int i) {
        java.lang.String str = (i == 13 || i == 18 || i == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 13 || i == 18 || i == 21) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 13) {
            objArr[1] = "initialize";
        } else if (i == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i != 13 && i != 18 && i != 21) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }
}
