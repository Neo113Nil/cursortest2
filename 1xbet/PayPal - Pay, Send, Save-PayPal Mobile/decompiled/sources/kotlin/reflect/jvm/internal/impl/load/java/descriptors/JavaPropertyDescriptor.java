package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

/* loaded from: classes5.dex */
public class JavaPropertyDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl implements kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor {
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.Pair<kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<?>, ?> getHighSpeedVideoFpsRangesFor;
    private kotlin.reflect.jvm.internal.impl.types.KotlinType getHighSpeedVideoSizes;

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public boolean hasSynthesizedParameterNames() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected JavaPropertyDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.descriptors.Modality modality, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility, boolean z, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement, kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, boolean z2, kotlin.Pair<kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<?>, ?> pair) {
        super(declarationDescriptor, propertyDescriptor, annotations, modality, descriptorVisibility, z, name2, kind, sourceElement, false, false, false, false, false, false);
        if (declarationDescriptor == null) {
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
        if (name2 == null) {
            getHighSpeedVideoFpsRanges(4);
        }
        if (sourceElement == null) {
            getHighSpeedVideoFpsRanges(5);
        }
        if (kind == null) {
            getHighSpeedVideoFpsRanges(6);
        }
        this.getHighSpeedVideoSizes = null;
        this.getHighResolutionOutputSizeshNQ4ISI = z2;
        this.getHighSpeedVideoFpsRangesFor = pair;
    }

    public static kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor create(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.descriptors.Modality modality, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility, boolean z, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement, boolean z2) {
        if (declarationDescriptor == null) {
            getHighSpeedVideoFpsRanges(7);
        }
        if (annotations == null) {
            getHighSpeedVideoFpsRanges(8);
        }
        if (modality == null) {
            getHighSpeedVideoFpsRanges(9);
        }
        if (descriptorVisibility == null) {
            getHighSpeedVideoFpsRanges(10);
        }
        if (name2 == null) {
            getHighSpeedVideoFpsRanges(11);
        }
        if (sourceElement == null) {
            getHighSpeedVideoFpsRanges(12);
        }
        return new kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor(declarationDescriptor, annotations, modality, descriptorVisibility, z, name2, sourceElement, null, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION, z2, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl
    public kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl createSubstitutedCopy(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Modality modality, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility, kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            getHighSpeedVideoFpsRanges(13);
        }
        if (modality == null) {
            getHighSpeedVideoFpsRanges(14);
        }
        if (descriptorVisibility == null) {
            getHighSpeedVideoFpsRanges(15);
        }
        if (kind == null) {
            getHighSpeedVideoFpsRanges(16);
        }
        if (name2 == null) {
            getHighSpeedVideoFpsRanges(17);
        }
        if (sourceElement == null) {
            getHighSpeedVideoFpsRanges(18);
        }
        return new kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor(declarationDescriptor, getAnnotations(), modality, descriptorVisibility, isVar(), name2, sourceElement, propertyDescriptor, kind, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor
    public kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor enhance(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> list, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2, kotlin.Pair<kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<?>, ?> pair) {
        kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl propertySetterDescriptorImpl;
        if (list == null) {
            getHighSpeedVideoFpsRanges(19);
        }
        if (kotlinType2 == null) {
            getHighSpeedVideoFpsRanges(20);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor original = getOriginal() == this ? null : getOriginal();
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor javaPropertyDescriptor = new kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor(getContainingDeclaration(), getAnnotations(), getModality(), getVisibility(), isVar(), getName(), getSource(), original, getKind(), this.getHighResolutionOutputSizeshNQ4ISI, pair);
        kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl getter = getGetter();
        if (getter != null) {
            propertyGetterDescriptorImpl = new kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl(javaPropertyDescriptor, getter.getAnnotations(), getter.getModality(), getter.getVisibility(), getter.isDefault(), getter.isExternal(), getter.isInline(), getKind(), original == null ? null : original.getGetter(), getter.getSource());
            propertyGetterDescriptorImpl.setInitialSignatureDescriptor(getter.getInitialSignatureDescriptor());
            propertyGetterDescriptorImpl.initialize(kotlinType2);
        } else {
            propertyGetterDescriptorImpl = null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor setter = getSetter();
        if (setter != null) {
            propertySetterDescriptorImpl = new kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl(javaPropertyDescriptor, setter.getAnnotations(), setter.getModality(), setter.getVisibility(), setter.isDefault(), setter.isExternal(), setter.isInline(), getKind(), original == null ? null : original.getSetter(), setter.getSource());
            propertySetterDescriptorImpl.setInitialSignatureDescriptor(propertySetterDescriptorImpl.getInitialSignatureDescriptor());
            propertySetterDescriptorImpl.initialize(setter.getValueParameters().get(0));
        } else {
            propertySetterDescriptorImpl = null;
        }
        javaPropertyDescriptor.initialize(propertyGetterDescriptorImpl, propertySetterDescriptorImpl, getBackingField(), getDelegateField());
        javaPropertyDescriptor.setSetterProjectedOut(isSetterProjectedOut());
        if (this.compileTimeInitializerFactory != null) {
            javaPropertyDescriptor.setCompileTimeInitializer(this.compileTimeInitializer, this.compileTimeInitializerFactory);
        }
        javaPropertyDescriptor.setOverriddenDescriptors(getOverriddenDescriptors());
        javaPropertyDescriptor.setType(kotlinType2, getTypeParameters(), getDispatchReceiverParameter(), kotlinType == null ? null : kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createExtensionReceiverParameterForCallable(this, kotlinType, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY()), kotlin.collections.CollectionsKt.emptyList());
        return javaPropertyDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isConst() {
        kotlin.reflect.jvm.internal.impl.types.KotlinType type = getType();
        if (this.getHighResolutionOutputSizeshNQ4ISI && kotlin.reflect.jvm.internal.impl.descriptors.ConstUtil.canBeUsedForConstVal(type)) {
            return !kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementKt.hasEnhancedNullability(type) || kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isString(type);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl
    public void setInType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            getHighSpeedVideoFpsRanges(22);
        }
        this.getHighSpeedVideoSizes = kotlinType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public <V> V getUserData(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<V> userDataKey) {
        kotlin.Pair<kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<?>, ?> pair = this.getHighSpeedVideoFpsRangesFor;
        if (pair == null || !pair.getFirst().equals(userDataKey)) {
            return null;
        }
        return (V) this.getHighSpeedVideoFpsRangesFor.getSecond();
    }

    private static /* synthetic */ void getHighSpeedVideoFpsRanges(int i) {
        java.lang.String str = i != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i != 21 ? 3 : 2];
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
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i == 21) {
            throw new java.lang.IllegalStateException(format);
        }
    }
}
