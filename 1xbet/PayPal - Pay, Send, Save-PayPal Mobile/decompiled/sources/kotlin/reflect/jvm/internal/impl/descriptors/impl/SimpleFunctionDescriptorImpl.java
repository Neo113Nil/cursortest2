package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* loaded from: classes5.dex */
public class SimpleFunctionDescriptorImpl extends kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl implements kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl initialize(kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptor2, java.util.List list, java.util.List list2, java.util.List list3, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.descriptors.Modality modality, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility) {
        return initialize(receiverParameterDescriptor, receiverParameterDescriptor2, (java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor>) list, (java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor>) list2, (java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor>) list3, kotlinType, modality, descriptorVisibility);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleFunctionDescriptorImpl(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
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
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl create(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            getHighSpeedVideoFpsRanges(5);
        }
        if (annotations == null) {
            getHighSpeedVideoFpsRanges(6);
        }
        if (name2 == null) {
            getHighSpeedVideoFpsRanges(7);
        }
        if (kind == null) {
            getHighSpeedVideoFpsRanges(8);
        }
        if (sourceElement == null) {
            getHighSpeedVideoFpsRanges(9);
        }
        return new kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl(declarationDescriptor, null, annotations, name2, kind, sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl initialize(kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptor2, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> list, java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list2, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list3, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.descriptors.Modality modality, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility) {
        if (list == null) {
            getHighSpeedVideoFpsRanges(14);
        }
        if (list2 == null) {
            getHighSpeedVideoFpsRanges(15);
        }
        if (list3 == null) {
            getHighSpeedVideoFpsRanges(16);
        }
        if (descriptorVisibility == null) {
            getHighSpeedVideoFpsRanges(17);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl initialize = initialize(receiverParameterDescriptor, receiverParameterDescriptor2, list, list2, list3, kotlinType, modality, descriptorVisibility, null);
        if (initialize == null) {
            getHighSpeedVideoFpsRanges(18);
        }
        return initialize;
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl initialize(kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptor2, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> list, java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list2, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list3, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.descriptors.Modality modality, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility, java.util.Map<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<?>, ?> map) {
        if (list == null) {
            getHighSpeedVideoFpsRanges(19);
        }
        if (list2 == null) {
            getHighSpeedVideoFpsRanges(20);
        }
        if (list3 == null) {
            getHighSpeedVideoFpsRanges(21);
        }
        if (descriptorVisibility == null) {
            getHighSpeedVideoFpsRanges(22);
        }
        super.initialize(receiverParameterDescriptor, receiverParameterDescriptor2, list, list2, list3, kotlinType, modality, descriptorVisibility);
        if (map != null && !map.isEmpty()) {
            this.userDataMap = new java.util.LinkedHashMap(map);
        }
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor getOriginal() {
        kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) super.getOriginal();
        if (simpleFunctionDescriptor == null) {
            getHighSpeedVideoFpsRanges(24);
        }
        return simpleFunctionDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    protected kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl createSubstitutedCopy(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            getHighSpeedVideoFpsRanges(25);
        }
        if (kind == null) {
            getHighSpeedVideoFpsRanges(26);
        }
        if (annotations == null) {
            getHighSpeedVideoFpsRanges(27);
        }
        if (sourceElement == null) {
            getHighSpeedVideoFpsRanges(28);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) functionDescriptor;
        if (name2 == null) {
            name2 = getName();
        }
        return new kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl(declarationDescriptor, simpleFunctionDescriptor, annotations, name2, kind, sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor copy(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Modality modality, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, boolean z) {
        kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) super.copy(declarationDescriptor, modality, descriptorVisibility, kind, z);
        if (simpleFunctionDescriptor == null) {
            getHighSpeedVideoFpsRanges(29);
        }
        return simpleFunctionDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> newCopyBuilder() {
        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder newCopyBuilder = super.newCopyBuilder();
        if (newCopyBuilder == null) {
            getHighSpeedVideoFpsRanges(30);
        }
        return newCopyBuilder;
    }

    private static /* synthetic */ void getHighSpeedVideoFpsRanges(int i) {
        java.lang.String str = (i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 13 || i == 18 || i == 23) {
            objArr[1] = "initialize";
        } else if (i == 24) {
            objArr[1] = "getOriginal";
        } else if (i == 29) {
            objArr[1] = "copy";
        } else if (i != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i != 13 && i != 18 && i != 23 && i != 24 && i != 29 && i != 30) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }
}
