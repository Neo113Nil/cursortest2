package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* loaded from: classes5.dex */
public class ClassDescriptorImpl extends kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase {
    private kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.descriptors.Modality getHighResolutionOutputSizeshNQ4ISI;
    private java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.types.TypeConstructor getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ClassKind getHighSpeedVideoSizes;
    private kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getInputFormats;

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: getCompanionObjectDescriptor */
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor mo23888getCompanionObjectDescriptor() {
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

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isValue() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassDescriptorImpl(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.descriptors.Modality modality, kotlin.reflect.jvm.internal.impl.descriptors.ClassKind classKind, java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> collection, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement, boolean z, kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager) {
        super(storageManager, declarationDescriptor, name2, sourceElement, z);
        if (declarationDescriptor == null) {
            Camera2StreamConfigurationMap(0);
        }
        if (name2 == null) {
            Camera2StreamConfigurationMap(1);
        }
        if (modality == null) {
            Camera2StreamConfigurationMap(2);
        }
        if (classKind == null) {
            Camera2StreamConfigurationMap(3);
        }
        if (collection == null) {
            Camera2StreamConfigurationMap(4);
        }
        if (sourceElement == null) {
            Camera2StreamConfigurationMap(5);
        }
        if (storageManager == null) {
            Camera2StreamConfigurationMap(6);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = modality;
        this.getHighSpeedVideoSizes = classKind;
        this.getHighSpeedVideoFpsRangesFor = new kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl(this, java.util.Collections.emptyList(), collection, storageManager);
    }

    public final void initialize(kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope, java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> set, kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor classConstructorDescriptor) {
        if (memberScope == null) {
            Camera2StreamConfigurationMap(7);
        }
        if (set == null) {
            Camera2StreamConfigurationMap(8);
        }
        this.getInputFormats = memberScope;
        this.getHighSpeedVideoFpsRanges = set;
        this.Camera2StreamConfigurationMap = classConstructorDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getAnnotations() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations empty = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY();
        if (empty == null) {
            Camera2StreamConfigurationMap(9);
        }
        return empty;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public kotlin.reflect.jvm.internal.impl.types.TypeConstructor getTypeConstructor() {
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = this.getHighSpeedVideoFpsRangesFor;
        if (typeConstructor == null) {
            Camera2StreamConfigurationMap(10);
        }
        return typeConstructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> getConstructors() {
        java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> set = this.getHighSpeedVideoFpsRanges;
        if (set == null) {
            Camera2StreamConfigurationMap(11);
        }
        return set;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getUnsubstitutedMemberScope(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner == null) {
            Camera2StreamConfigurationMap(12);
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope = this.getInputFormats;
        if (memberScope == null) {
            Camera2StreamConfigurationMap(13);
        }
        return memberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getStaticScope() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty empty = kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty.INSTANCE;
        if (empty == null) {
            Camera2StreamConfigurationMap(14);
        }
        return empty;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassKind getKind() {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassKind classKind = this.getHighSpeedVideoSizes;
        if (classKind == null) {
            Camera2StreamConfigurationMap(15);
        }
        return classKind;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: getUnsubstitutedPrimaryConstructor */
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor mo23889getUnsubstitutedPrimaryConstructor() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.Modality getModality() {
        kotlin.reflect.jvm.internal.impl.descriptors.Modality modality = this.getHighResolutionOutputSizeshNQ4ISI;
        if (modality == null) {
            Camera2StreamConfigurationMap(16);
        }
        return modality;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.PUBLIC;
        if (descriptorVisibility == null) {
            Camera2StreamConfigurationMap(17);
        }
        return descriptorVisibility;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("class ");
        sb.append(getName());
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getDeclaredTypeParameters() {
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> emptyList = java.util.Collections.emptyList();
        if (emptyList == null) {
            Camera2StreamConfigurationMap(18);
        }
        return emptyList;
    }

    private static /* synthetic */ void Camera2StreamConfigurationMap(int i) {
        java.lang.String str;
        int i2;
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            case 12:
            default:
                i2 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new java.lang.IllegalStateException(format);
            case 12:
            default:
                throw new java.lang.IllegalArgumentException(format);
        }
    }
}
