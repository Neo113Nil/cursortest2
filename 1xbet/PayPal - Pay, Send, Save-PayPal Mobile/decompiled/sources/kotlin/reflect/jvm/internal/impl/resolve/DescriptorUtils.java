package kotlin.reflect.jvm.internal.impl.resolve;

/* loaded from: classes5.dex */
public class DescriptorUtils {
    public static final kotlin.reflect.jvm.internal.impl.name.FqName JVM_NAME = new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.jvm.JvmName");

    private DescriptorUtils() {
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor getDispatchReceiverParameterIfNeeded(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            getHighSpeedVideoSizes(0);
        }
        if (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
            return ((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) declarationDescriptor).getThisAsReceiverParameter();
        }
        return null;
    }

    public static boolean isLocal(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            getHighSpeedVideoSizes(1);
        }
        while (declarationDescriptor != null) {
            if (isAnonymousObject(declarationDescriptor) || isDescriptorWithLocalVisibility(declarationDescriptor)) {
                return true;
            }
            declarationDescriptor = declarationDescriptor.getContainingDeclaration();
        }
        return false;
    }

    public static boolean isDescriptorWithLocalVisibility(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        return (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility) && ((kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility) declarationDescriptor).getVisibility() == kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.LOCAL;
    }

    public static kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe getFqName(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            getHighSpeedVideoSizes(2);
        }
        kotlin.reflect.jvm.internal.impl.name.FqName highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(declarationDescriptor);
        return highSpeedVideoFpsRanges != null ? highSpeedVideoFpsRanges.toUnsafe() : Camera2StreamConfigurationMap(declarationDescriptor);
    }

    public static kotlin.reflect.jvm.internal.impl.name.FqName getFqNameSafe(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            getHighSpeedVideoSizes(3);
        }
        kotlin.reflect.jvm.internal.impl.name.FqName highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(declarationDescriptor);
        if (highSpeedVideoFpsRanges == null) {
            highSpeedVideoFpsRanges = Camera2StreamConfigurationMap(declarationDescriptor).toSafe();
        }
        if (highSpeedVideoFpsRanges == null) {
            getHighSpeedVideoSizes(4);
        }
        return highSpeedVideoFpsRanges;
    }

    private static kotlin.reflect.jvm.internal.impl.name.FqName getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            getHighSpeedVideoSizes(5);
        }
        if ((declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor) || kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.isError(declarationDescriptor)) {
            return kotlin.reflect.jvm.internal.impl.name.FqName.ROOT;
        }
        if (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor) {
            return ((kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor) declarationDescriptor).getFqName();
        }
        if (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) {
            return ((kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) declarationDescriptor).getFqName();
        }
        return null;
    }

    private static kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            getHighSpeedVideoSizes(6);
        }
        kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe child = getFqName(declarationDescriptor.getContainingDeclaration()).child(declarationDescriptor.getName());
        if (child == null) {
            getHighSpeedVideoSizes(7);
        }
        return child;
    }

    public static boolean isTopLevelDeclaration(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        return declarationDescriptor != null && (declarationDescriptor.getContainingDeclaration() instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor);
    }

    public static boolean areInSameModule(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor2) {
        if (declarationDescriptor == null) {
            getHighSpeedVideoSizes(16);
        }
        if (declarationDescriptor2 == null) {
            getHighSpeedVideoSizes(17);
        }
        return getContainingModule(declarationDescriptor).equals(getContainingModule(declarationDescriptor2));
    }

    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> D getParentOfType(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, java.lang.Class<D> cls) {
        if (cls == null) {
            getHighSpeedVideoSizes(18);
        }
        return (D) getParentOfType(declarationDescriptor, cls, true);
    }

    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> D getParentOfType(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, java.lang.Class<D> cls, boolean z) {
        if (cls == null) {
            getHighSpeedVideoSizes(19);
        }
        if (declarationDescriptor == null) {
            return null;
        }
        if (z) {
            declarationDescriptor = (D) declarationDescriptor.getContainingDeclaration();
        }
        while (declarationDescriptor != null) {
            if (cls.isInstance(declarationDescriptor)) {
                return (D) declarationDescriptor;
            }
            declarationDescriptor = (D) declarationDescriptor.getContainingDeclaration();
        }
        return null;
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor getContainingModuleOrNull(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            getHighSpeedVideoSizes(20);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = kotlinType.getConstructor().mo23898getDeclarationDescriptor();
        if (mo23898getDeclarationDescriptor == null) {
            return null;
        }
        return getContainingModuleOrNull(mo23898getDeclarationDescriptor);
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor getContainingModule(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            getHighSpeedVideoSizes(21);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor containingModuleOrNull = getContainingModuleOrNull(declarationDescriptor);
        if (containingModuleOrNull == null) {
            getHighSpeedVideoSizes(22);
        }
        return containingModuleOrNull;
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor getContainingModuleOrNull(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            getHighSpeedVideoSizes(23);
        }
        while (declarationDescriptor != null) {
            if (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor) {
                return (kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor) declarationDescriptor;
            }
            if (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor) {
                return ((kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor) declarationDescriptor).getModule();
            }
            declarationDescriptor = declarationDescriptor.getContainingDeclaration();
        }
        return null;
    }

    public static boolean isDirectSubclass(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor2) {
        if (classDescriptor == null) {
            getHighSpeedVideoSizes(26);
        }
        if (classDescriptor2 == null) {
            getHighSpeedVideoSizes(27);
        }
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.types.KotlinType> it = classDescriptor.getTypeConstructor().getSupertypes().iterator();
        while (it.hasNext()) {
            if (Camera2StreamConfigurationMap(it.next(), classDescriptor2.getOriginal())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSubclass(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor2) {
        if (classDescriptor == null) {
            getHighSpeedVideoSizes(28);
        }
        if (classDescriptor2 == null) {
            getHighSpeedVideoSizes(29);
        }
        return isSubtypeOfClass(classDescriptor.getDefaultType(), classDescriptor2.getOriginal());
    }

    private static boolean Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        if (kotlinType == null) {
            getHighSpeedVideoSizes(30);
        }
        if (declarationDescriptor == null) {
            getHighSpeedVideoSizes(31);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = kotlinType.getConstructor().mo23898getDeclarationDescriptor();
        if (mo23898getDeclarationDescriptor == null) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor original = mo23898getDeclarationDescriptor.getOriginal();
        return (original instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor) && (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor) && ((kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor) declarationDescriptor).getTypeConstructor().equals(((kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor) original).getTypeConstructor());
    }

    public static boolean isSubtypeOfClass(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        if (kotlinType == null) {
            getHighSpeedVideoSizes(32);
        }
        if (declarationDescriptor == null) {
            getHighSpeedVideoSizes(33);
        }
        if (Camera2StreamConfigurationMap(kotlinType, declarationDescriptor)) {
            return true;
        }
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.types.KotlinType> it = kotlinType.getConstructor().getSupertypes().iterator();
        while (it.hasNext()) {
            if (isSubtypeOfClass(it.next(), declarationDescriptor)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isCompanionObject(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        return getHighResolutionOutputSizeshNQ4ISI(declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.OBJECT) && ((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) declarationDescriptor).isCompanionObject();
    }

    public static boolean isSealedClass(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        return (getHighResolutionOutputSizeshNQ4ISI(declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.CLASS) || getHighResolutionOutputSizeshNQ4ISI(declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE)) && ((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) declarationDescriptor).getModality() == kotlin.reflect.jvm.internal.impl.descriptors.Modality.SEALED;
    }

    public static boolean isAnonymousObject(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            getHighSpeedVideoSizes(34);
        }
        return isClass(declarationDescriptor) && declarationDescriptor.getName().equals(kotlin.reflect.jvm.internal.impl.name.SpecialNames.NO_NAME_PROVIDED);
    }

    public static boolean isEnumEntry(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            getHighSpeedVideoSizes(36);
        }
        return getHighResolutionOutputSizeshNQ4ISI(declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_ENTRY);
    }

    public static boolean isEnumClass(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        return getHighResolutionOutputSizeshNQ4ISI(declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_CLASS);
    }

    public static boolean isAnnotationClass(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        return getHighResolutionOutputSizeshNQ4ISI(declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ANNOTATION_CLASS);
    }

    public static boolean isInterface(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        return getHighResolutionOutputSizeshNQ4ISI(declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE);
    }

    public static boolean isClass(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        return getHighResolutionOutputSizeshNQ4ISI(declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.CLASS);
    }

    public static boolean isClassOrEnumClass(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        return isClass(declarationDescriptor) || isEnumClass(declarationDescriptor);
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassKind classKind) {
        if (classKind == null) {
            getHighSpeedVideoSizes(37);
        }
        return (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) && ((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) declarationDescriptor).getKind() == classKind;
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getSuperClassDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            getHighSpeedVideoSizes(44);
        }
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.types.KotlinType> it = classDescriptor.getTypeConstructor().getSupertypes().iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptorForType = getClassDescriptorForType(it.next());
            if (classDescriptorForType.getKind() != kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE) {
                return classDescriptorForType;
            }
        }
        return null;
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getClassDescriptorForType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            getHighSpeedVideoSizes(45);
        }
        return getClassDescriptorForTypeConstructor(kotlinType.getConstructor());
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getClassDescriptorForTypeConstructor(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor) {
        if (typeConstructor == null) {
            getHighSpeedVideoSizes(46);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) typeConstructor.mo23898getDeclarationDescriptor();
        if (classDescriptor == null) {
            getHighSpeedVideoSizes(47);
        }
        return classDescriptor;
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility getDefaultConstructorVisibility(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, boolean z) {
        if (classDescriptor == null) {
            getHighSpeedVideoSizes(48);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassKind kind = classDescriptor.getKind();
        if (kind == kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_CLASS || kind.isSingleton()) {
            kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.PRIVATE;
            if (descriptorVisibility == null) {
                getHighSpeedVideoSizes(49);
            }
            return descriptorVisibility;
        }
        if (isSealedClass(classDescriptor)) {
            if (z) {
                kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility2 = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.PROTECTED;
                if (descriptorVisibility2 == null) {
                    getHighSpeedVideoSizes(50);
                }
                return descriptorVisibility2;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility3 = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.PRIVATE;
            if (descriptorVisibility3 == null) {
                getHighSpeedVideoSizes(51);
            }
            return descriptorVisibility3;
        }
        if (isAnonymousObject(classDescriptor)) {
            kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility4 = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.DEFAULT_VISIBILITY;
            if (descriptorVisibility4 == null) {
                getHighSpeedVideoSizes(52);
            }
            return descriptorVisibility4;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility5 = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.PUBLIC;
        if (descriptorVisibility5 == null) {
            getHighSpeedVideoSizes(53);
        }
        return descriptorVisibility5;
    }

    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> D unwrapFakeOverride(D d) {
        if (d == null) {
            getHighSpeedVideoSizes(58);
        }
        while (d.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> overriddenDescriptors = d.getOverriddenDescriptors();
            if (overriddenDescriptors.isEmpty()) {
                throw new java.lang.IllegalStateException("Fake override should have at least one overridden descriptor: ".concat(java.lang.String.valueOf(d)));
            }
            d = (D) overriddenDescriptors.iterator().next();
        }
        if (d == null) {
            getHighSpeedVideoSizes(59);
        }
        return d;
    }

    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility> D unwrapFakeOverrideToAnyDeclaration(D d) {
        if (d == null) {
            getHighSpeedVideoSizes(63);
        }
        if (d instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) {
            return unwrapFakeOverride((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) d);
        }
        if (d == null) {
            getHighSpeedVideoSizes(64);
        }
        return d;
    }

    public static boolean shouldRecordInitializerForProperty(kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor variableDescriptor, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (variableDescriptor == null) {
            getHighSpeedVideoSizes(65);
        }
        if (kotlinType == null) {
            getHighSpeedVideoSizes(66);
        }
        if (variableDescriptor.isVar() || kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(kotlinType)) {
            return false;
        }
        if (kotlin.reflect.jvm.internal.impl.types.TypeUtils.acceptsNullable(kotlinType)) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns builtIns = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getBuiltIns(variableDescriptor);
        if (!kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isPrimitiveType(kotlinType) && !kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.DEFAULT.equalTypes(builtIns.getStringType(), kotlinType) && !kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.DEFAULT.equalTypes(builtIns.getNumber().getDefaultType(), kotlinType) && !kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.DEFAULT.equalTypes(builtIns.getAnyType(), kotlinType)) {
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes unsignedTypes = kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes.INSTANCE;
            if (!kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes.isUnsignedType(kotlinType)) {
                return false;
            }
        }
        return true;
    }

    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor> java.util.Set<D> getAllOverriddenDescriptors(D d) {
        if (d == null) {
            getHighSpeedVideoSizes(70);
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        getHighSpeedVideoSizes(d.getOriginal(), linkedHashSet);
        return linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor> void getHighSpeedVideoSizes(D d, java.util.Set<D> set) {
        if (d == null) {
            getHighSpeedVideoSizes(72);
        }
        if (set == 0) {
            getHighSpeedVideoSizes(73);
        }
        if (set.contains(d)) {
            return;
        }
        java.util.Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor> it = d.getOriginal().getOverriddenDescriptors().iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor original = it.next().getOriginal();
            getHighSpeedVideoSizes(original, set);
            set.add(original);
        }
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.SourceFile getContainingSourceFile(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            getHighSpeedVideoSizes(81);
        }
        if (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor) {
            declarationDescriptor = ((kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor) declarationDescriptor).getCorrespondingProperty();
        }
        if (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource) {
            kotlin.reflect.jvm.internal.impl.descriptors.SourceFile containingFile = ((kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource) declarationDescriptor).getSource().getContainingFile();
            if (containingFile == null) {
                getHighSpeedVideoSizes(82);
            }
            return containingFile;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.SourceFile sourceFile = kotlin.reflect.jvm.internal.impl.descriptors.SourceFile.NO_SOURCE_FILE;
        if (sourceFile == null) {
            getHighSpeedVideoSizes(83);
        }
        return sourceFile;
    }

    private static /* synthetic */ void getHighSpeedVideoSizes(int i) {
        java.lang.String str;
        int i2;
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 60:
            case 63:
            case 81:
            case 94:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 66:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 67:
            case 68:
            case 69:
            case 76:
            case 77:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 65:
                objArr[0] = "variable";
                break;
            case 70:
                objArr[0] = "f";
                break;
            case 72:
                objArr[0] = "current";
                break;
            case 73:
                objArr[0] = "result";
                break;
            case 74:
                objArr[0] = "memberDescriptor";
                break;
            case 78:
            case 79:
            case 80:
                objArr[0] = "annotated";
                break;
            case 84:
            case 86:
            case 89:
            case 91:
                objArr[0] = com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY;
                break;
            case 87:
            case 90:
            case 92:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 59:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 61:
            case 62:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 71:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 75:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 82:
            case 83:
                objArr[1] = "getContainingSourceFile";
                break;
            case 85:
                objArr[1] = "getAllDescriptors";
                break;
            case 88:
                objArr[1] = "getFunctionByName";
                break;
            case 93:
                objArr[1] = "getPropertyByName";
                break;
            case 95:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 60:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 63:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 65:
            case 66:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 67:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 69:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 70:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 72:
            case 73:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 74:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 76:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 77:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 78:
                objArr[2] = "getJvmName";
                break;
            case 79:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 80:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "getContainingSourceFile";
                break;
            case 84:
                objArr[2] = "getAllDescriptors";
                break;
            case 86:
            case 87:
                objArr[2] = "getFunctionByName";
                break;
            case 89:
            case 90:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 91:
            case 92:
                objArr[2] = "getPropertyByName";
                break;
            case 94:
                objArr[2] = "getDirectMember";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                throw new java.lang.IllegalStateException(format);
            default:
                throw new java.lang.IllegalArgumentException(format);
        }
    }
}
