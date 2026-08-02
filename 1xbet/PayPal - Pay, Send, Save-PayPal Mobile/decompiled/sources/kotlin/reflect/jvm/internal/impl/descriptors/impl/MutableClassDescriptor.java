package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* loaded from: classes5.dex */
public class MutableClassDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase {
    private final java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> Camera2StreamConfigurationMap;
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ClassKind getHighSpeedVideoFpsRanges;
    private kotlin.reflect.jvm.internal.impl.descriptors.Modality getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.storage.StorageManager getHighSpeedVideoSizes;
    private kotlin.reflect.jvm.internal.impl.types.TypeConstructor getHighSpeedVideoSizesFor;
    private kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility getInputFormats;
    private java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getOutputFormats;

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: getCompanionObjectDescriptor */
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor mo23888getCompanionObjectDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: getUnsubstitutedPrimaryConstructor */
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor mo23889getUnsubstitutedPrimaryConstructor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation<kotlin.reflect.jvm.internal.impl.types.SimpleType> getValueClassRepresentation() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isCompanionObject() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isData() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isFun() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isValue() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableClassDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassKind classKind, boolean z, boolean z2, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement, kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager) {
        super(storageManager, declarationDescriptor, name2, sourceElement, z2);
        if (declarationDescriptor == null) {
            getHighResolutionOutputSizeshNQ4ISI(0);
        }
        if (classKind == null) {
            getHighResolutionOutputSizeshNQ4ISI(1);
        }
        if (name2 == null) {
            getHighResolutionOutputSizeshNQ4ISI(2);
        }
        if (sourceElement == null) {
            getHighResolutionOutputSizeshNQ4ISI(3);
        }
        if (storageManager == null) {
            getHighResolutionOutputSizeshNQ4ISI(4);
        }
        this.Camera2StreamConfigurationMap = new java.util.ArrayList();
        this.getHighSpeedVideoSizes = storageManager;
        this.getHighSpeedVideoFpsRanges = classKind;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getAnnotations() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations empty = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY();
        if (empty == null) {
            getHighResolutionOutputSizeshNQ4ISI(5);
        }
        return empty;
    }

    public void setModality(kotlin.reflect.jvm.internal.impl.descriptors.Modality modality) {
        if (modality == null) {
            getHighResolutionOutputSizeshNQ4ISI(6);
        }
        this.getHighSpeedVideoFpsRangesFor = modality;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.Modality getModality() {
        kotlin.reflect.jvm.internal.impl.descriptors.Modality modality = this.getHighSpeedVideoFpsRangesFor;
        if (modality == null) {
            getHighResolutionOutputSizeshNQ4ISI(7);
        }
        return modality;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassKind getKind() {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassKind classKind = this.getHighSpeedVideoFpsRanges;
        if (classKind == null) {
            getHighResolutionOutputSizeshNQ4ISI(8);
        }
        return classKind;
    }

    public void setVisibility(kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility) {
        if (descriptorVisibility == null) {
            getHighResolutionOutputSizeshNQ4ISI(9);
        }
        this.getInputFormats = descriptorVisibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility = this.getInputFormats;
        if (descriptorVisibility == null) {
            getHighResolutionOutputSizeshNQ4ISI(10);
        }
        return descriptorVisibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public kotlin.reflect.jvm.internal.impl.types.TypeConstructor getTypeConstructor() {
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = this.getHighSpeedVideoSizesFor;
        if (typeConstructor == null) {
            getHighResolutionOutputSizeshNQ4ISI(11);
        }
        return typeConstructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> getConstructors() {
        java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> emptySet = java.util.Collections.emptySet();
        if (emptySet == null) {
            getHighResolutionOutputSizeshNQ4ISI(13);
        }
        return emptySet;
    }

    public void setTypeParameterDescriptors(java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list) {
        if (list == null) {
            getHighResolutionOutputSizeshNQ4ISI(14);
        }
        if (this.getOutputFormats != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Type parameters are already set for ");
            sb.append(getName());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        this.getOutputFormats = new java.util.ArrayList(list);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getDeclaredTypeParameters() {
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list = this.getOutputFormats;
        if (list == null) {
            getHighResolutionOutputSizeshNQ4ISI(15);
        }
        return list;
    }

    public void createTypeConstructor() {
        this.getHighSpeedVideoSizesFor = new kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl(this, this.getOutputFormats, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> it = getConstructors().iterator();
        while (it.hasNext()) {
            ((kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl) it.next()).setReturnType(getDefaultType());
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getUnsubstitutedMemberScope(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner == null) {
            getHighResolutionOutputSizeshNQ4ISI(16);
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty empty = kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty.INSTANCE;
        if (empty == null) {
            getHighResolutionOutputSizeshNQ4ISI(17);
        }
        return empty;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getStaticScope() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty empty = kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty.INSTANCE;
        if (empty == null) {
            getHighResolutionOutputSizeshNQ4ISI(18);
        }
        return empty;
    }

    public java.lang.String toString() {
        return kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl.toString(this);
    }

    private static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(int i) {
        java.lang.String str;
        int i2;
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i2 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new java.lang.IllegalStateException(format);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                throw new java.lang.IllegalArgumentException(format);
        }
    }
}
