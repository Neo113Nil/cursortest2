package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* loaded from: classes5.dex */
public class ClassConstructorDescriptorImpl extends kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl implements kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor {
    protected final boolean isPrimary;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassConstructorDescriptorImpl(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor constructorDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, boolean z, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        super(classDescriptor, constructorDescriptor, annotations, kotlin.reflect.jvm.internal.impl.name.SpecialNames.INIT, kind, sourceElement);
        if (classDescriptor == null) {
            getHighSpeedVideoFpsRanges(0);
        }
        if (annotations == null) {
            getHighSpeedVideoFpsRanges(1);
        }
        if (kind == null) {
            getHighSpeedVideoFpsRanges(2);
        }
        if (sourceElement == null) {
            getHighSpeedVideoFpsRanges(3);
        }
        this.isPrimary = z;
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl create(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, boolean z, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        if (classDescriptor == null) {
            getHighSpeedVideoFpsRanges(4);
        }
        if (annotations == null) {
            getHighSpeedVideoFpsRanges(5);
        }
        if (sourceElement == null) {
            getHighSpeedVideoFpsRanges(6);
        }
        return new kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl(classDescriptor, null, annotations, z, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION, sourceElement);
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl initialize(java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list2) {
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> emptyList;
        if (list == null) {
            getHighSpeedVideoFpsRanges(10);
        }
        if (descriptorVisibility == null) {
            getHighSpeedVideoFpsRanges(11);
        }
        if (list2 == null) {
            getHighSpeedVideoFpsRanges(12);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor calculateDispatchReceiverParameter = calculateDispatchReceiverParameter();
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor containingDeclaration = getContainingDeclaration();
        if (!containingDeclaration.getContextReceivers().isEmpty()) {
            emptyList = containingDeclaration.getContextReceivers();
            if (emptyList == null) {
                getHighSpeedVideoFpsRanges(15);
            }
        } else {
            emptyList = java.util.Collections.emptyList();
            if (emptyList == null) {
                getHighSpeedVideoFpsRanges(16);
            }
        }
        super.initialize(null, calculateDispatchReceiverParameter, emptyList, list2, list, null, kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL, descriptorVisibility);
        return this;
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl initialize(java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility) {
        if (list == null) {
            getHighSpeedVideoFpsRanges(13);
        }
        if (descriptorVisibility == null) {
            getHighSpeedVideoFpsRanges(14);
        }
        initialize(list, descriptorVisibility, getContainingDeclaration().getDeclaredTypeParameters());
        return this;
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor calculateDispatchReceiverParameter() {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor containingDeclaration = getContainingDeclaration();
        if (!containingDeclaration.isInner()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration2 = containingDeclaration.getContainingDeclaration();
        if (containingDeclaration2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
            return ((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration2).getThisAsReceiverParameter();
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getContainingDeclaration() {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) super.getContainingDeclaration();
        if (classDescriptor == null) {
            getHighSpeedVideoFpsRanges(17);
        }
        return classDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getConstructedClass() {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor containingDeclaration = getContainingDeclaration();
        if (containingDeclaration == null) {
            getHighSpeedVideoFpsRanges(18);
        }
        return containingDeclaration;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor getOriginal() {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor classConstructorDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor) super.getOriginal();
        if (classConstructorDescriptor == null) {
            getHighSpeedVideoFpsRanges(19);
        }
        return classConstructorDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor substitute(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            getHighSpeedVideoFpsRanges(20);
        }
        return (kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor) super.substitute(typeSubstitutor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.visitConstructorDescriptor(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
    public boolean isPrimary() {
        return this.isPrimary;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> getOverriddenDescriptors() {
        java.util.Set emptySet = java.util.Collections.emptySet();
        if (emptySet == null) {
            getHighSpeedVideoFpsRanges(21);
        }
        return emptySet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl createSubstitutedCopy(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            getHighSpeedVideoFpsRanges(23);
        }
        if (kind == null) {
            getHighSpeedVideoFpsRanges(24);
        }
        if (annotations == null) {
            getHighSpeedVideoFpsRanges(25);
        }
        if (sourceElement == null) {
            getHighSpeedVideoFpsRanges(26);
        }
        if (kind != kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION && kind != kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.SYNTHESIZED) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Attempt at creating a constructor that is not a declaration: \ncopy from: ");
            sb.append(this);
            sb.append("\nnewOwner: ");
            sb.append(declarationDescriptor);
            sb.append("\nkind: ");
            sb.append(kind);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        return new kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) declarationDescriptor, this, annotations, this.isPrimary, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION, sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor copy(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Modality modality, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, boolean z) {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor classConstructorDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor) super.copy(declarationDescriptor, modality, descriptorVisibility, kind, z);
        if (classConstructorDescriptor == null) {
            getHighSpeedVideoFpsRanges(27);
        }
        return classConstructorDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void setOverriddenDescriptors(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> collection) {
        if (collection == null) {
            getHighSpeedVideoFpsRanges(22);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void getHighSpeedVideoFpsRanges(int i) {
        java.lang.String str;
        int i2;
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i != 21 && i != 27) {
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        i2 = 3;
                        break;
                }
                java.lang.Object[] objArr = new java.lang.Object[i2];
                switch (i) {
                    case 1:
                    case 5:
                    case 8:
                    case 25:
                        objArr[0] = "annotations";
                        break;
                    case 2:
                    case 24:
                        objArr[0] = "kind";
                        break;
                    case 3:
                    case 6:
                    case 9:
                    case 26:
                        objArr[0] = "source";
                        break;
                    case 4:
                    case 7:
                    default:
                        objArr[0] = "containingDeclaration";
                        break;
                    case 10:
                    case 13:
                        objArr[0] = "unsubstitutedValueParameters";
                        break;
                    case 11:
                    case 14:
                        objArr[0] = "visibility";
                        break;
                    case 12:
                        objArr[0] = "typeParameterDescriptors";
                        break;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 21:
                    case 27:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                        break;
                    case 20:
                        objArr[0] = "originalSubstitutor";
                        break;
                    case 22:
                        objArr[0] = "overriddenDescriptors";
                        break;
                    case 23:
                        objArr[0] = "newOwner";
                        break;
                }
                if (i != 21) {
                    objArr[1] = "getOverriddenDescriptors";
                } else if (i != 27) {
                    switch (i) {
                        case 15:
                        case 16:
                            objArr[1] = "calculateContextReceiverParameters";
                            break;
                        case 17:
                            objArr[1] = "getContainingDeclaration";
                            break;
                        case 18:
                            objArr[1] = "getConstructedClass";
                            break;
                        case 19:
                            objArr[1] = "getOriginal";
                            break;
                        default:
                            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                            break;
                    }
                } else {
                    objArr[1] = "copy";
                }
                switch (i) {
                    case 4:
                    case 5:
                    case 6:
                        objArr[2] = "create";
                        break;
                    case 7:
                    case 8:
                    case 9:
                        objArr[2] = "createSynthesized";
                        break;
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                        objArr[2] = "initialize";
                        break;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 21:
                    case 27:
                        break;
                    case 20:
                        objArr[2] = "substitute";
                        break;
                    case 22:
                        objArr[2] = "setOverriddenDescriptors";
                        break;
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                        objArr[2] = "createSubstitutedCopy";
                        break;
                    default:
                        objArr[2] = "<init>";
                        break;
                }
                java.lang.String format = java.lang.String.format(str, objArr);
                if (i != 21 && i != 27) {
                    switch (i) {
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
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
            if (i != 21) {
            }
            switch (i) {
            }
            java.lang.String format2 = java.lang.String.format(str, objArr2);
            if (i != 21) {
                switch (i) {
                }
            }
            throw new java.lang.IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i != 21) {
            switch (i) {
            }
            java.lang.Object[] objArr22 = new java.lang.Object[i2];
            switch (i) {
            }
            if (i != 21) {
            }
            switch (i) {
            }
            java.lang.String format22 = java.lang.String.format(str, objArr22);
            if (i != 21) {
            }
            throw new java.lang.IllegalStateException(format22);
        }
        i2 = 2;
        java.lang.Object[] objArr222 = new java.lang.Object[i2];
        switch (i) {
        }
        if (i != 21) {
        }
        switch (i) {
        }
        java.lang.String format222 = java.lang.String.format(str, objArr222);
        if (i != 21) {
        }
        throw new java.lang.IllegalStateException(format222);
    }
}
