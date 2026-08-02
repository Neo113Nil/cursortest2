package kotlin.reflect.jvm.internal.impl.builtins;

/* loaded from: classes5.dex */
public abstract class KotlinBuiltIns {
    public static final kotlin.reflect.jvm.internal.impl.name.Name BUILTINS_MODULE_NAME = kotlin.reflect.jvm.internal.impl.name.Name.special("<built-ins module>");
    private final kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor>> getHighResolutionOutputSizeshNQ4ISI;
    private kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl> getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.Primitives> getHighSpeedVideoFpsRangesFor;
    private kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl getHighSpeedVideoSizes;
    private final kotlin.reflect.jvm.internal.impl.storage.StorageManager getInputFormats;

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.SimpleType Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns kotlinBuiltIns, java.lang.String str) {
        if (str == null) {
            getHighSpeedVideoSizes(47);
        }
        kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = kotlinBuiltIns.getHighResolutionOutputSizeshNQ4ISI(str).getDefaultType();
        if (defaultType == null) {
            getHighSpeedVideoSizes(48);
        }
        return defaultType;
    }

    public KotlinBuiltIns(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager) {
        if (storageManager == null) {
            getHighSpeedVideoSizes(0);
        }
        this.getInputFormats = storageManager;
        this.getHighResolutionOutputSizeshNQ4ISI = storageManager.createLazyValue(new kotlin.jvm.functions.Function0<java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.1
            @Override // kotlin.jvm.functions.Function0
            public /* synthetic */ java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor> invoke() {
                return java.util.Arrays.asList(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.this.getBuiltInsModule().getPackage(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.BUILT_INS_PACKAGE_FQ_NAME), kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.this.getBuiltInsModule().getPackage(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.COLLECTIONS_PACKAGE_FQ_NAME), kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.this.getBuiltInsModule().getPackage(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.RANGES_PACKAGE_FQ_NAME), kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.this.getBuiltInsModule().getPackage(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.ANNOTATION_PACKAGE_FQ_NAME));
            }
        });
        this.getHighSpeedVideoFpsRangesFor = storageManager.createLazyValue(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.Primitives>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.2
            @Override // kotlin.jvm.functions.Function0
            public /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.Primitives invoke() {
                java.util.EnumMap enumMap = new java.util.EnumMap(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.class);
                java.util.HashMap hashMap = new java.util.HashMap();
                java.util.HashMap hashMap2 = new java.util.HashMap();
                byte b = 0;
                for (kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveType : kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.values()) {
                    kotlin.reflect.jvm.internal.impl.types.SimpleType Camera2StreamConfigurationMap = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.this, primitiveType.getTypeName().asString());
                    kotlin.reflect.jvm.internal.impl.types.SimpleType Camera2StreamConfigurationMap2 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.this, primitiveType.getArrayTypeName().asString());
                    enumMap.put((java.util.EnumMap) primitiveType, (kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType) Camera2StreamConfigurationMap2);
                    hashMap.put(Camera2StreamConfigurationMap, Camera2StreamConfigurationMap2);
                    hashMap2.put(Camera2StreamConfigurationMap2, Camera2StreamConfigurationMap);
                }
                return new kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.Primitives(enumMap, hashMap, hashMap2, b);
            }
        });
        this.Camera2StreamConfigurationMap = storageManager.createMemoizedFunction(new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.3
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor invoke(kotlin.reflect.jvm.internal.impl.name.Name name2) {
                kotlin.reflect.jvm.internal.impl.name.Name name3 = name2;
                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor contributedClassifier = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.this.getBuiltInsPackageScope().mo23899getContributedClassifier(name3, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_BUILTINS);
                if (contributedClassifier == null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Built-in class ");
                    sb.append(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.BUILT_INS_PACKAGE_FQ_NAME.child(name3));
                    sb.append(" is not found");
                    throw new java.lang.AssertionError(sb.toString());
                }
                if (!(contributedClassifier instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor)) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Must be a class descriptor ");
                    sb2.append(name3);
                    sb2.append(", but was ");
                    sb2.append(contributedClassifier);
                    throw new java.lang.AssertionError(sb2.toString());
                }
                return (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) contributedClassifier;
            }
        });
    }

    protected void createBuiltInsModule(boolean z) {
        kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl moduleDescriptorImpl = new kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl(BUILTINS_MODULE_NAME, this.getInputFormats, this, null);
        this.getHighSpeedVideoSizes = moduleDescriptorImpl;
        moduleDescriptorImpl.initialize(kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader.Companion.getInstance().createPackageFragmentProvider(this.getInputFormats, this.getHighSpeedVideoSizes, getClassDescriptorFactories(), getPlatformDependentDeclarationFilter(), getAdditionalClassPartsProvider(), z));
        kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl moduleDescriptorImpl2 = this.getHighSpeedVideoSizes;
        moduleDescriptorImpl2.setDependencies(moduleDescriptorImpl2);
    }

    public void setBuiltInsModule(final kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl moduleDescriptorImpl) {
        if (moduleDescriptorImpl == null) {
            getHighSpeedVideoSizes(1);
        }
        this.getInputFormats.compute(new kotlin.jvm.functions.Function0<java.lang.Void>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.4
            @Override // kotlin.jvm.functions.Function0
            public /* synthetic */ java.lang.Void invoke() {
                if (kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.this.getHighSpeedVideoSizes != null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Built-ins module is already set: ");
                    sb.append(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.this.getHighSpeedVideoSizes);
                    sb.append(" (attempting to reset to ");
                    sb.append(moduleDescriptorImpl);
                    sb.append(")");
                    throw new java.lang.AssertionError(sb.toString());
                }
                kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.this.getHighSpeedVideoSizes = moduleDescriptorImpl;
                return null;
            }
        });
    }

    protected kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider getAdditionalClassPartsProvider() {
        kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider.None none = kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider.None.INSTANCE;
        if (none == null) {
            getHighSpeedVideoSizes(3);
        }
        return none;
    }

    protected kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter getPlatformDependentDeclarationFilter() {
        kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter.NoPlatformDependent noPlatformDependent = kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter.NoPlatformDependent.INSTANCE;
        if (noPlatformDependent == null) {
            getHighSpeedVideoSizes(4);
        }
        return noPlatformDependent;
    }

    public java.lang.Iterable<kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory> getClassDescriptorFactories() {
        java.util.List singletonList = java.util.Collections.singletonList(new kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory(this.getInputFormats, getBuiltInsModule()));
        if (singletonList == null) {
            getHighSpeedVideoSizes(5);
        }
        return singletonList;
    }

    protected kotlin.reflect.jvm.internal.impl.storage.StorageManager getStorageManager() {
        kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager = this.getInputFormats;
        if (storageManager == null) {
            getHighSpeedVideoSizes(6);
        }
        return storageManager;
    }

    static class Primitives {
        public final java.util.Map<kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.types.SimpleType> getHighResolutionOutputSizeshNQ4ISI;
        public final java.util.Map<kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.SimpleType> getHighSpeedVideoFpsRanges;
        public final java.util.Map<kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType, kotlin.reflect.jvm.internal.impl.types.SimpleType> getHighSpeedVideoSizes;

        /* synthetic */ Primitives(java.util.Map map, java.util.Map map2, java.util.Map map3, byte b) {
            this(map, map2, map3);
        }

        private Primitives(java.util.Map<kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType, kotlin.reflect.jvm.internal.impl.types.SimpleType> map, java.util.Map<kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.types.SimpleType> map2, java.util.Map<kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.SimpleType> map3) {
            if (map == null) {
                getHighSpeedVideoSizes(0);
            }
            if (map2 == null) {
                getHighSpeedVideoSizes(1);
            }
            if (map3 == null) {
                getHighSpeedVideoSizes(2);
            }
            this.getHighSpeedVideoSizes = map;
            this.getHighResolutionOutputSizeshNQ4ISI = map2;
            this.getHighSpeedVideoFpsRanges = map3;
        }

        private static /* synthetic */ void getHighSpeedVideoSizes(int i) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i == 1) {
                objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
            } else if (i != 2) {
                objArr[0] = "primitiveTypeToArrayKotlinType";
            } else {
                objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
            objArr[2] = "<init>";
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl getBuiltInsModule() {
        if (this.getHighSpeedVideoSizes == null) {
            this.getHighSpeedVideoSizes = this.getHighSpeedVideoFpsRanges.invoke();
        }
        kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl moduleDescriptorImpl = this.getHighSpeedVideoSizes;
        if (moduleDescriptorImpl == null) {
            getHighSpeedVideoSizes(7);
        }
        return moduleDescriptorImpl;
    }

    public static boolean isBuiltIn(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            getHighSpeedVideoSizes(9);
        }
        return kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getParentOfType(declarationDescriptor, kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment.class, false) != null;
    }

    public static boolean isUnderKotlinPackage(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            getHighSpeedVideoSizes(10);
        }
        while (declarationDescriptor != null) {
            if (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) {
                return ((kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) declarationDescriptor).getFqName().startsWith(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.BUILT_INS_PACKAGE_NAME);
            }
            declarationDescriptor = declarationDescriptor.getContainingDeclaration();
        }
        return false;
    }

    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getBuiltInsPackageScope() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope = getBuiltInsModule().getPackage(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.BUILT_INS_PACKAGE_FQ_NAME).getMemberScope();
        if (memberScope == null) {
            getHighSpeedVideoSizes(11);
        }
        return memberScope;
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getBuiltInClassByFqName(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        if (fqName == null) {
            getHighSpeedVideoSizes(12);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor resolveClassByFqName = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt.resolveClassByFqName(getBuiltInsModule(), fqName, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_BUILTINS);
        if (resolveClassByFqName == null) {
            getHighSpeedVideoSizes(13);
        }
        return resolveClassByFqName;
    }

    private kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        if (str == null) {
            getHighSpeedVideoSizes(14);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor invoke = this.Camera2StreamConfigurationMap.invoke(kotlin.reflect.jvm.internal.impl.name.Name.identifier(str));
        if (invoke == null) {
            getHighSpeedVideoSizes(15);
        }
        return invoke;
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getAny() {
        return getHighResolutionOutputSizeshNQ4ISI("Any");
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getNothing() {
        return getHighResolutionOutputSizeshNQ4ISI("Nothing");
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getArray() {
        return getHighResolutionOutputSizeshNQ4ISI("Array");
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getNumber() {
        return getHighResolutionOutputSizeshNQ4ISI("Number");
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getUnit() {
        return getHighResolutionOutputSizeshNQ4ISI("Unit");
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getFunction(int i) {
        return getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.getFunctionName(i));
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getSuspendFunction(int i) {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor builtInClassByFqName = getBuiltInClassByFqName(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.COROUTINES_PACKAGE_FQ_NAME.child(kotlin.reflect.jvm.internal.impl.name.Name.identifier(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.getSuspendFunctionName(i))));
        if (builtInClassByFqName == null) {
            getHighSpeedVideoSizes(18);
        }
        return builtInClassByFqName;
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getString() {
        return getHighResolutionOutputSizeshNQ4ISI("String");
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getComparable() {
        return getHighResolutionOutputSizeshNQ4ISI("Comparable");
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getKClass() {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor builtInClassByFqName = getBuiltInClassByFqName(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.kClass.toSafe());
        if (builtInClassByFqName == null) {
            getHighSpeedVideoSizes(21);
        }
        return builtInClassByFqName;
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getCollection() {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor builtInClassByFqName = getBuiltInClassByFqName(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.collection);
        if (builtInClassByFqName == null) {
            getHighSpeedVideoSizes(35);
        }
        return builtInClassByFqName;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getNothingType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = getNothing().getDefaultType();
        if (defaultType == null) {
            getHighSpeedVideoSizes(49);
        }
        return defaultType;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getNullableNothingType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType makeNullableAsSpecified = getNothingType().makeNullableAsSpecified(true);
        if (makeNullableAsSpecified == null) {
            getHighSpeedVideoSizes(50);
        }
        return makeNullableAsSpecified;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getAnyType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = getAny().getDefaultType();
        if (defaultType == null) {
            getHighSpeedVideoSizes(51);
        }
        return defaultType;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getNullableAnyType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType makeNullableAsSpecified = getAnyType().makeNullableAsSpecified(true);
        if (makeNullableAsSpecified == null) {
            getHighSpeedVideoSizes(52);
        }
        return makeNullableAsSpecified;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getDefaultBound() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType nullableAnyType = getNullableAnyType();
        if (nullableAnyType == null) {
            getHighSpeedVideoSizes(53);
        }
        return nullableAnyType;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getPrimitiveKotlinType(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveType) {
        if (primitiveType == null) {
            getHighSpeedVideoSizes(54);
        }
        if (primitiveType == null) {
            getHighSpeedVideoSizes(16);
        }
        kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = getHighResolutionOutputSizeshNQ4ISI(primitiveType.getTypeName().asString()).getDefaultType();
        if (defaultType == null) {
            getHighSpeedVideoSizes(55);
        }
        return defaultType;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getNumberType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = getNumber().getDefaultType();
        if (defaultType == null) {
            getHighSpeedVideoSizes(56);
        }
        return defaultType;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getByteType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType primitiveKotlinType = getPrimitiveKotlinType(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.BYTE);
        if (primitiveKotlinType == null) {
            getHighSpeedVideoSizes(57);
        }
        return primitiveKotlinType;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getShortType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType primitiveKotlinType = getPrimitiveKotlinType(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.SHORT);
        if (primitiveKotlinType == null) {
            getHighSpeedVideoSizes(58);
        }
        return primitiveKotlinType;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getIntType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType primitiveKotlinType = getPrimitiveKotlinType(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.INT);
        if (primitiveKotlinType == null) {
            getHighSpeedVideoSizes(59);
        }
        return primitiveKotlinType;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getLongType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType primitiveKotlinType = getPrimitiveKotlinType(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.LONG);
        if (primitiveKotlinType == null) {
            getHighSpeedVideoSizes(60);
        }
        return primitiveKotlinType;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getFloatType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType primitiveKotlinType = getPrimitiveKotlinType(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.FLOAT);
        if (primitiveKotlinType == null) {
            getHighSpeedVideoSizes(61);
        }
        return primitiveKotlinType;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getDoubleType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType primitiveKotlinType = getPrimitiveKotlinType(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.DOUBLE);
        if (primitiveKotlinType == null) {
            getHighSpeedVideoSizes(62);
        }
        return primitiveKotlinType;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getCharType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType primitiveKotlinType = getPrimitiveKotlinType(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.CHAR);
        if (primitiveKotlinType == null) {
            getHighSpeedVideoSizes(63);
        }
        return primitiveKotlinType;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getBooleanType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType primitiveKotlinType = getPrimitiveKotlinType(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.BOOLEAN);
        if (primitiveKotlinType == null) {
            getHighSpeedVideoSizes(64);
        }
        return primitiveKotlinType;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getUnitType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = getUnit().getDefaultType();
        if (defaultType == null) {
            getHighSpeedVideoSizes(65);
        }
        return defaultType;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getStringType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = getString().getDefaultType();
        if (defaultType == null) {
            getHighSpeedVideoSizes(66);
        }
        return defaultType;
    }

    public kotlin.reflect.jvm.internal.impl.types.KotlinType getArrayElementType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            getHighSpeedVideoSizes(68);
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType arrayElementTypeOrNull = getArrayElementTypeOrNull(kotlinType);
        if (arrayElementTypeOrNull == null) {
            throw new java.lang.IllegalStateException("not array: ".concat(java.lang.String.valueOf(kotlinType)));
        }
        if (arrayElementTypeOrNull == null) {
            getHighSpeedVideoSizes(69);
        }
        return arrayElementTypeOrNull;
    }

    public kotlin.reflect.jvm.internal.impl.types.KotlinType getArrayElementTypeOrNull(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.reflect.jvm.internal.impl.name.ClassId classId;
        kotlin.reflect.jvm.internal.impl.name.ClassId unsignedClassIdByArrayClassId;
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor findClassAcrossModuleDependencies;
        if (kotlinType == null) {
            getHighSpeedVideoSizes(70);
        }
        if (isArray(kotlinType)) {
            if (kotlinType.getArguments().size() != 1) {
                return null;
            }
            return kotlinType.getArguments().get(0).getType();
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType makeNotNullable = kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeNotNullable(kotlinType);
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType = this.getHighSpeedVideoFpsRangesFor.invoke().getHighSpeedVideoFpsRanges.get(makeNotNullable);
        if (simpleType != null) {
            return simpleType;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor containingModuleOrNull = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getContainingModuleOrNull(makeNotNullable);
        if (containingModuleOrNull != null) {
            if (makeNotNullable == null) {
                getHighSpeedVideoSizes(71);
            }
            if (containingModuleOrNull == null) {
                getHighSpeedVideoSizes(72);
            }
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = makeNotNullable.getConstructor().mo23898getDeclarationDescriptor();
            kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = (mo23898getDeclarationDescriptor == null || !kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes.INSTANCE.isShortNameOfUnsignedArray(mo23898getDeclarationDescriptor.getName()) || (classId = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getClassId(mo23898getDeclarationDescriptor)) == null || (unsignedClassIdByArrayClassId = kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes.INSTANCE.getUnsignedClassIdByArrayClassId(classId)) == null || (findClassAcrossModuleDependencies = kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt.findClassAcrossModuleDependencies(containingModuleOrNull, unsignedClassIdByArrayClassId)) == null) ? null : findClassAcrossModuleDependencies.getDefaultType();
            if (defaultType != null) {
                return defaultType;
            }
        }
        return null;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getPrimitiveArrayKotlinType(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveType) {
        if (primitiveType == null) {
            getHighSpeedVideoSizes(73);
        }
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType = this.getHighSpeedVideoFpsRangesFor.invoke().getHighSpeedVideoSizes.get(primitiveType);
        if (simpleType == null) {
            getHighSpeedVideoSizes(74);
        }
        return simpleType;
    }

    public static kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType getPrimitiveType(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            getHighSpeedVideoSizes(76);
        }
        if (kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.primitiveTypeShortNames.contains(declarationDescriptor.getName())) {
            return kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.fqNameToPrimitiveType.get(kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getFqName(declarationDescriptor));
        }
        return null;
    }

    public static kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType getPrimitiveArrayType(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            getHighSpeedVideoSizes(77);
        }
        if (kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.primitiveArrayTypeShortNames.contains(declarationDescriptor.getName())) {
            return kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.arrayClassFqNameToPrimitiveType.get(kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getFqName(declarationDescriptor));
        }
        return null;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getArrayType(kotlin.reflect.jvm.internal.impl.types.Variance variance, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations) {
        if (variance == null) {
            getHighSpeedVideoSizes(78);
        }
        if (kotlinType == null) {
            getHighSpeedVideoSizes(79);
        }
        if (annotations == null) {
            getHighSpeedVideoSizes(80);
        }
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleNotNullType = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleNotNullType(kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt.toDefaultAttributes(annotations), getArray(), java.util.Collections.singletonList(new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(variance, kotlinType)));
        if (simpleNotNullType == null) {
            getHighSpeedVideoSizes(81);
        }
        return simpleNotNullType;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getArrayType(kotlin.reflect.jvm.internal.impl.types.Variance variance, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (variance == null) {
            getHighSpeedVideoSizes(82);
        }
        if (kotlinType == null) {
            getHighSpeedVideoSizes(83);
        }
        kotlin.reflect.jvm.internal.impl.types.SimpleType arrayType = getArrayType(variance, kotlinType, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY());
        if (arrayType == null) {
            getHighSpeedVideoSizes(84);
        }
        return arrayType;
    }

    public static boolean isArray(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            getHighSpeedVideoSizes(88);
        }
        kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.array;
        if (kotlinType == null) {
            getHighSpeedVideoSizes(97);
        }
        if (fqNameUnsafe == null) {
            getHighSpeedVideoSizes(98);
        }
        return isTypeConstructorForGivenClass(kotlinType.getConstructor(), fqNameUnsafe);
    }

    public static boolean isArrayOrPrimitiveArray(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            getHighSpeedVideoSizes(89);
        }
        return getHighResolutionOutputSizeshNQ4ISI(classDescriptor, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.array) || getPrimitiveArrayType(classDescriptor) != null;
    }

    public static boolean isArrayOrPrimitiveArray(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            getHighSpeedVideoSizes(90);
        }
        return isArray(kotlinType) || isPrimitiveArray(kotlinType);
    }

    public static boolean isPrimitiveArray(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            getHighSpeedVideoSizes(91);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = kotlinType.getConstructor().mo23898getDeclarationDescriptor();
        return (mo23898getDeclarationDescriptor == null || getPrimitiveArrayType(mo23898getDeclarationDescriptor) == null) ? false : true;
    }

    public static kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType getPrimitiveArrayElementType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            getHighSpeedVideoSizes(92);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = kotlinType.getConstructor().mo23898getDeclarationDescriptor();
        if (mo23898getDeclarationDescriptor == null) {
            return null;
        }
        return getPrimitiveArrayType(mo23898getDeclarationDescriptor);
    }

    public static boolean isPrimitiveType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            getHighSpeedVideoSizes(94);
        }
        return !kotlinType.isMarkedNullable() && isPrimitiveTypeOrNullablePrimitiveType(kotlinType);
    }

    public static boolean isPrimitiveTypeOrNullablePrimitiveType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            getHighSpeedVideoSizes(95);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = kotlinType.getConstructor().mo23898getDeclarationDescriptor();
        return (mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) && isPrimitiveClass((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) mo23898getDeclarationDescriptor);
    }

    public static boolean isPrimitiveClass(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            getHighSpeedVideoSizes(96);
        }
        return getPrimitiveType(classDescriptor) != null;
    }

    public static boolean isTypeConstructorForGivenClass(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe) {
        if (typeConstructor == null) {
            getHighSpeedVideoSizes(101);
        }
        if (fqNameUnsafe == null) {
            getHighSpeedVideoSizes(102);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = typeConstructor.mo23898getDeclarationDescriptor();
        return (mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) && getHighResolutionOutputSizeshNQ4ISI(mo23898getDeclarationDescriptor, fqNameUnsafe);
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptor, kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe) {
        if (classifierDescriptor == null) {
            getHighSpeedVideoSizes(103);
        }
        if (fqNameUnsafe == null) {
            getHighSpeedVideoSizes(104);
        }
        return classifierDescriptor.getName().equals(fqNameUnsafe.shortName()) && fqNameUnsafe.equals(kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getFqName(classifierDescriptor));
    }

    private static boolean getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe) {
        if (kotlinType == null) {
            getHighSpeedVideoSizes(105);
        }
        if (fqNameUnsafe == null) {
            getHighSpeedVideoSizes(106);
        }
        if (kotlinType.isMarkedNullable()) {
            return false;
        }
        if (kotlinType == null) {
            getHighSpeedVideoSizes(97);
        }
        if (fqNameUnsafe == null) {
            getHighSpeedVideoSizes(98);
        }
        return isTypeConstructorForGivenClass(kotlinType.getConstructor(), fqNameUnsafe);
    }

    public static boolean isSpecialClassWithNoSupertypes(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            getHighSpeedVideoSizes(107);
        }
        return getHighResolutionOutputSizeshNQ4ISI(classDescriptor, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.any) || getHighResolutionOutputSizeshNQ4ISI(classDescriptor, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.nothing);
    }

    public static boolean isAny(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            getHighSpeedVideoSizes(108);
        }
        return getHighResolutionOutputSizeshNQ4ISI(classDescriptor, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.any);
    }

    public static boolean isBoolean(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            getHighSpeedVideoSizes(110);
        }
        return getHighSpeedVideoFpsRanges(kotlinType, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames._boolean);
    }

    public static boolean isUByteArray(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            getHighSpeedVideoSizes(128);
        }
        return getHighSpeedVideoFpsRanges(kotlinType, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.uByteArrayFqName.toUnsafe());
    }

    public static boolean isUShortArray(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            getHighSpeedVideoSizes(129);
        }
        return getHighSpeedVideoFpsRanges(kotlinType, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.uShortArrayFqName.toUnsafe());
    }

    public static boolean isUIntArray(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            getHighSpeedVideoSizes(130);
        }
        return getHighSpeedVideoFpsRanges(kotlinType, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.uIntArrayFqName.toUnsafe());
    }

    public static boolean isULongArray(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            getHighSpeedVideoSizes(131);
        }
        return getHighSpeedVideoFpsRanges(kotlinType, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.uLongArrayFqName.toUnsafe());
    }

    public static boolean isUnsignedArrayType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            getHighSpeedVideoSizes(132);
        }
        return isUByteArray(kotlinType) || isUShortArray(kotlinType) || isUIntArray(kotlinType) || isULongArray(kotlinType);
    }

    private static boolean getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe) {
        if (kotlinType == null) {
            getHighSpeedVideoSizes(134);
        }
        if (fqNameUnsafe == null) {
            getHighSpeedVideoSizes(135);
        }
        if (kotlinType == null) {
            getHighSpeedVideoSizes(97);
        }
        if (fqNameUnsafe == null) {
            getHighSpeedVideoSizes(98);
        }
        return isTypeConstructorForGivenClass(kotlinType.getConstructor(), fqNameUnsafe) && !kotlinType.isMarkedNullable();
    }

    public static boolean isNothing(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            getHighSpeedVideoSizes(136);
        }
        return isNothingOrNullableNothing(kotlinType) && !kotlin.reflect.jvm.internal.impl.types.TypeUtils.isNullableType(kotlinType);
    }

    public static boolean isNothingOrNullableNothing(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            getHighSpeedVideoSizes(138);
        }
        kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.nothing;
        if (kotlinType == null) {
            getHighSpeedVideoSizes(97);
        }
        if (fqNameUnsafe == null) {
            getHighSpeedVideoSizes(98);
        }
        return isTypeConstructorForGivenClass(kotlinType.getConstructor(), fqNameUnsafe);
    }

    public static boolean isAnyOrNullableAny(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            getHighSpeedVideoSizes(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE);
        }
        kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.any;
        if (kotlinType == null) {
            getHighSpeedVideoSizes(97);
        }
        if (fqNameUnsafe == null) {
            getHighSpeedVideoSizes(98);
        }
        return isTypeConstructorForGivenClass(kotlinType.getConstructor(), fqNameUnsafe);
    }

    public static boolean isNullableAny(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            getHighSpeedVideoSizes(140);
        }
        return isAnyOrNullableAny(kotlinType) && kotlinType.isMarkedNullable();
    }

    public static boolean isDefaultBound(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            getHighSpeedVideoSizes(141);
        }
        return isNullableAny(kotlinType);
    }

    public static boolean isUnit(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            getHighSpeedVideoSizes(142);
        }
        return getHighSpeedVideoFpsRangesFor(kotlinType, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.unit);
    }

    public static boolean isString(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        return kotlinType != null && getHighSpeedVideoFpsRangesFor(kotlinType, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.string);
    }

    public static boolean isKClass(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            getHighSpeedVideoSizes(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE);
        }
        return getHighResolutionOutputSizeshNQ4ISI(classDescriptor, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.kClass);
    }

    public static boolean isDeprecated(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            getHighSpeedVideoSizes(160);
        }
        if (declarationDescriptor.getOriginal().getAnnotations().hasAnnotation(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.deprecated)) {
            return true;
        }
        if (!(declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) declarationDescriptor;
        boolean isVar = propertyDescriptor.isVar();
        kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
        kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor setter = propertyDescriptor.getSetter();
        if (getter == null || !isDeprecated(getter)) {
            return false;
        }
        return !isVar || (setter != null && isDeprecated(setter));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0408 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0058 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0368  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void getHighSpeedVideoSizes(int i) {
        java.lang.String str;
        int i2;
        if (i != 11 && i != 13 && i != 15 && i != 69 && i != 74 && i != 81 && i != 84 && i != 86 && i != 87) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            break;
                    }
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    break;
            }
            if (i != 11 && i != 13 && i != 15 && i != 69 && i != 74 && i != 81 && i != 84 && i != 86 && i != 87) {
                switch (i) {
                    default:
                        switch (i) {
                            default:
                                switch (i) {
                                    default:
                                        switch (i) {
                                            case 55:
                                            case 56:
                                            case 57:
                                            case 58:
                                            case 59:
                                            case 60:
                                            case 61:
                                            case 62:
                                            case 63:
                                            case 64:
                                            case 65:
                                            case 66:
                                            case 67:
                                                break;
                                            default:
                                                i2 = 3;
                                                break;
                                        }
                                    case 48:
                                    case 49:
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                        i2 = 2;
                                        break;
                                }
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                                break;
                        }
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        break;
                }
                java.lang.Object[] objArr = new java.lang.Object[i2];
                switch (i) {
                    case 1:
                    case 72:
                        objArr[0] = com.paypal.oslo.feature.p2p.analytics.P2pReviewAnalytics.FEATURE_MODULE;
                        break;
                    case 2:
                        objArr[0] = "computation";
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 11:
                    case 13:
                    case 15:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 69:
                    case 74:
                    case 81:
                    case 84:
                    case 86:
                    case 87:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                        break;
                    case 9:
                    case 10:
                    case 76:
                    case 77:
                    case 89:
                    case 96:
                    case 103:
                    case 107:
                    case 108:
                    case 143:
                    case 146:
                    case 147:
                    case 149:
                    case 157:
                    case SDK_ASSET_ILLUSTRATION_WALLET_VALUE:
                    case 159:
                        objArr[0] = "descriptor";
                        break;
                    case 12:
                    case 98:
                    case 100:
                    case 102:
                    case 104:
                    case 106:
                    case 135:
                        objArr[0] = "fqName";
                        break;
                    case 14:
                        objArr[0] = "simpleName";
                        break;
                    case 16:
                    case 17:
                    case 54:
                    case 88:
                    case 90:
                    case 91:
                    case 92:
                    case 93:
                    case 94:
                    case 95:
                    case 97:
                    case 99:
                    case 105:
                    case 109:
                    case 110:
                    case 111:
                    case 113:
                    case 114:
                    case 115:
                    case 116:
                    case 117:
                    case 118:
                    case 119:
                    case 120:
                    case 121:
                    case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                    case SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE:
                    case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                    case 125:
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                    case 131:
                    case 132:
                    case SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE:
                    case 134:
                    case 136:
                    case 137:
                    case 138:
                    case SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE:
                    case 140:
                    case 141:
                    case 142:
                    case 144:
                    case 145:
                    case 148:
                    case 150:
                    case 151:
                    case 152:
                    case 153:
                    case 154:
                    case 155:
                    case 156:
                    case 161:
                        objArr[0] = "type";
                        break;
                    case 47:
                        objArr[0] = "classSimpleName";
                        break;
                    case 68:
                    case 70:
                        objArr[0] = "arrayType";
                        break;
                    case 71:
                        objArr[0] = "notNullArrayType";
                        break;
                    case 73:
                        objArr[0] = "primitiveType";
                        break;
                    case 75:
                        objArr[0] = "kotlinType";
                        break;
                    case 78:
                    case 82:
                        objArr[0] = "projectionType";
                        break;
                    case 79:
                    case 83:
                    case 85:
                        objArr[0] = "argument";
                        break;
                    case 80:
                        objArr[0] = "annotations";
                        break;
                    case 101:
                        objArr[0] = "typeConstructor";
                        break;
                    case 112:
                        objArr[0] = "classDescriptor";
                        break;
                    case 160:
                        objArr[0] = "declarationDescriptor";
                        break;
                    default:
                        objArr[0] = "storageManager";
                        break;
                }
                if (i != 11) {
                    objArr[1] = "getBuiltInsPackageScope";
                } else if (i == 13) {
                    objArr[1] = "getBuiltInClassByFqName";
                } else if (i == 15) {
                    objArr[1] = "getBuiltInClassByName";
                } else if (i == 69) {
                    objArr[1] = "getArrayElementType";
                } else if (i == 74) {
                    objArr[1] = "getPrimitiveArrayKotlinType";
                } else if (i == 81 || i == 84) {
                    objArr[1] = "getArrayType";
                } else if (i == 86) {
                    objArr[1] = "getEnumType";
                } else if (i != 87) {
                    switch (i) {
                        case 3:
                            objArr[1] = "getAdditionalClassPartsProvider";
                            break;
                        case 4:
                            objArr[1] = "getPlatformDependentDeclarationFilter";
                            break;
                        case 5:
                            objArr[1] = "getClassDescriptorFactories";
                            break;
                        case 6:
                            objArr[1] = "getStorageManager";
                            break;
                        case 7:
                            objArr[1] = "getBuiltInsModule";
                            break;
                        case 8:
                            objArr[1] = "getBuiltInPackagesImportedByDefault";
                            break;
                        default:
                            switch (i) {
                                case 18:
                                    objArr[1] = "getSuspendFunction";
                                    break;
                                case 19:
                                    objArr[1] = "getKFunction";
                                    break;
                                case 20:
                                    objArr[1] = "getKSuspendFunction";
                                    break;
                                case 21:
                                    objArr[1] = "getKClass";
                                    break;
                                case 22:
                                    objArr[1] = "getKType";
                                    break;
                                case 23:
                                    objArr[1] = "getKCallable";
                                    break;
                                case 24:
                                    objArr[1] = "getKProperty";
                                    break;
                                case 25:
                                    objArr[1] = "getKProperty0";
                                    break;
                                case 26:
                                    objArr[1] = "getKProperty1";
                                    break;
                                case 27:
                                    objArr[1] = "getKProperty2";
                                    break;
                                case 28:
                                    objArr[1] = "getKMutableProperty0";
                                    break;
                                case 29:
                                    objArr[1] = "getKMutableProperty1";
                                    break;
                                case 30:
                                    objArr[1] = "getKMutableProperty2";
                                    break;
                                case 31:
                                    objArr[1] = "getIterator";
                                    break;
                                case 32:
                                    objArr[1] = "getIterable";
                                    break;
                                case 33:
                                    objArr[1] = "getMutableIterable";
                                    break;
                                case 34:
                                    objArr[1] = "getMutableIterator";
                                    break;
                                case 35:
                                    objArr[1] = "getCollection";
                                    break;
                                case 36:
                                    objArr[1] = "getMutableCollection";
                                    break;
                                case 37:
                                    objArr[1] = "getList";
                                    break;
                                case 38:
                                    objArr[1] = "getMutableList";
                                    break;
                                case 39:
                                    objArr[1] = "getSet";
                                    break;
                                case 40:
                                    objArr[1] = "getMutableSet";
                                    break;
                                case 41:
                                    objArr[1] = "getMap";
                                    break;
                                case 42:
                                    objArr[1] = "getMutableMap";
                                    break;
                                case 43:
                                    objArr[1] = "getMapEntry";
                                    break;
                                case 44:
                                    objArr[1] = "getMutableMapEntry";
                                    break;
                                case 45:
                                    objArr[1] = "getListIterator";
                                    break;
                                case 46:
                                    objArr[1] = "getMutableListIterator";
                                    break;
                                default:
                                    switch (i) {
                                        case 48:
                                            objArr[1] = "getBuiltInTypeByClassName";
                                            break;
                                        case 49:
                                            objArr[1] = "getNothingType";
                                            break;
                                        case 50:
                                            objArr[1] = "getNullableNothingType";
                                            break;
                                        case 51:
                                            objArr[1] = "getAnyType";
                                            break;
                                        case 52:
                                            objArr[1] = "getNullableAnyType";
                                            break;
                                        case 53:
                                            objArr[1] = "getDefaultBound";
                                            break;
                                        default:
                                            switch (i) {
                                                case 55:
                                                    objArr[1] = "getPrimitiveKotlinType";
                                                    break;
                                                case 56:
                                                    objArr[1] = "getNumberType";
                                                    break;
                                                case 57:
                                                    objArr[1] = "getByteType";
                                                    break;
                                                case 58:
                                                    objArr[1] = "getShortType";
                                                    break;
                                                case 59:
                                                    objArr[1] = "getIntType";
                                                    break;
                                                case 60:
                                                    objArr[1] = "getLongType";
                                                    break;
                                                case 61:
                                                    objArr[1] = "getFloatType";
                                                    break;
                                                case 62:
                                                    objArr[1] = "getDoubleType";
                                                    break;
                                                case 63:
                                                    objArr[1] = "getCharType";
                                                    break;
                                                case 64:
                                                    objArr[1] = "getBooleanType";
                                                    break;
                                                case 65:
                                                    objArr[1] = "getUnitType";
                                                    break;
                                                case 66:
                                                    objArr[1] = "getStringType";
                                                    break;
                                                case 67:
                                                    objArr[1] = "getIterableType";
                                                    break;
                                                default:
                                                    objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    objArr[1] = "getAnnotationType";
                }
                switch (i) {
                    case 1:
                        objArr[2] = "setBuiltInsModule";
                        break;
                    case 2:
                        objArr[2] = "setPostponedBuiltinsModuleComputation";
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 11:
                    case 13:
                    case 15:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 69:
                    case 74:
                    case 81:
                    case 84:
                    case 86:
                    case 87:
                        break;
                    case 9:
                        objArr[2] = "isBuiltIn";
                        break;
                    case 10:
                        objArr[2] = "isUnderKotlinPackage";
                        break;
                    case 12:
                        objArr[2] = "getBuiltInClassByFqName";
                        break;
                    case 14:
                        objArr[2] = "getBuiltInClassByName";
                        break;
                    case 16:
                        objArr[2] = "getPrimitiveClassDescriptor";
                        break;
                    case 17:
                        objArr[2] = "getPrimitiveArrayClassDescriptor";
                        break;
                    case 47:
                        objArr[2] = "getBuiltInTypeByClassName";
                        break;
                    case 54:
                        objArr[2] = "getPrimitiveKotlinType";
                        break;
                    case 68:
                        objArr[2] = "getArrayElementType";
                        break;
                    case 70:
                        objArr[2] = "getArrayElementTypeOrNull";
                        break;
                    case 71:
                    case 72:
                        objArr[2] = "getElementTypeForUnsignedArray";
                        break;
                    case 73:
                        objArr[2] = "getPrimitiveArrayKotlinType";
                        break;
                    case 75:
                        objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                        break;
                    case 76:
                    case 93:
                        objArr[2] = "getPrimitiveType";
                        break;
                    case 77:
                        objArr[2] = "getPrimitiveArrayType";
                        break;
                    case 78:
                    case 79:
                    case 80:
                    case 82:
                    case 83:
                        objArr[2] = "getArrayType";
                        break;
                    case 85:
                        objArr[2] = "getEnumType";
                        break;
                    case 88:
                        objArr[2] = "isArray";
                        break;
                    case 89:
                    case 90:
                        objArr[2] = "isArrayOrPrimitiveArray";
                        break;
                    case 91:
                        objArr[2] = "isPrimitiveArray";
                        break;
                    case 92:
                        objArr[2] = "getPrimitiveArrayElementType";
                        break;
                    case 94:
                        objArr[2] = "isPrimitiveType";
                        break;
                    case 95:
                        objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                        break;
                    case 96:
                        objArr[2] = "isPrimitiveClass";
                        break;
                    case 97:
                    case 98:
                    case 99:
                    case 100:
                        objArr[2] = "isConstructedFromGivenClass";
                        break;
                    case 101:
                    case 102:
                        objArr[2] = "isTypeConstructorForGivenClass";
                        break;
                    case 103:
                    case 104:
                        objArr[2] = "classFqNameEquals";
                        break;
                    case 105:
                    case 106:
                        objArr[2] = "isNotNullConstructedFromGivenClass";
                        break;
                    case 107:
                        objArr[2] = "isSpecialClassWithNoSupertypes";
                        break;
                    case 108:
                    case 109:
                        objArr[2] = "isAny";
                        break;
                    case 110:
                    case 112:
                        objArr[2] = "isBoolean";
                        break;
                    case 111:
                        objArr[2] = "isBooleanOrNullableBoolean";
                        break;
                    case 113:
                        objArr[2] = "isNumber";
                        break;
                    case 114:
                        objArr[2] = "isChar";
                        break;
                    case 115:
                        objArr[2] = "isCharOrNullableChar";
                        break;
                    case 116:
                        objArr[2] = "isInt";
                        break;
                    case 117:
                        objArr[2] = "isByte";
                        break;
                    case 118:
                        objArr[2] = "isLong";
                        break;
                    case 119:
                        objArr[2] = "isLongOrNullableLong";
                        break;
                    case 120:
                        objArr[2] = "isShort";
                        break;
                    case 121:
                        objArr[2] = "isFloat";
                        break;
                    case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                        objArr[2] = "isFloatOrNullableFloat";
                        break;
                    case SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE:
                        objArr[2] = "isDouble";
                        break;
                    case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                        objArr[2] = "isUByte";
                        break;
                    case 125:
                        objArr[2] = "isUShort";
                        break;
                    case 126:
                        objArr[2] = "isUInt";
                        break;
                    case 127:
                        objArr[2] = "isULong";
                        break;
                    case 128:
                        objArr[2] = "isUByteArray";
                        break;
                    case 129:
                        objArr[2] = "isUShortArray";
                        break;
                    case 130:
                        objArr[2] = "isUIntArray";
                        break;
                    case 131:
                        objArr[2] = "isULongArray";
                        break;
                    case 132:
                        objArr[2] = "isUnsignedArrayType";
                        break;
                    case SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE:
                        objArr[2] = "isDoubleOrNullableDouble";
                        break;
                    case 134:
                    case 135:
                        objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                        break;
                    case 136:
                        objArr[2] = "isNothing";
                        break;
                    case 137:
                        objArr[2] = "isNullableNothing";
                        break;
                    case 138:
                        objArr[2] = "isNothingOrNullableNothing";
                        break;
                    case SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE:
                        objArr[2] = "isAnyOrNullableAny";
                        break;
                    case 140:
                        objArr[2] = "isNullableAny";
                        break;
                    case 141:
                        objArr[2] = "isDefaultBound";
                        break;
                    case 142:
                        objArr[2] = "isUnit";
                        break;
                    case 143:
                        objArr[2] = "mayReturnNonUnitValue";
                        break;
                    case 144:
                        objArr[2] = "isUnitOrNullableUnit";
                        break;
                    case 145:
                        objArr[2] = "isBooleanOrSubtype";
                        break;
                    case 146:
                        objArr[2] = "isMemberOfAny";
                        break;
                    case 147:
                    case 148:
                        objArr[2] = "isEnum";
                        break;
                    case 149:
                    case 150:
                        objArr[2] = "isComparable";
                        break;
                    case 151:
                        objArr[2] = "isCollectionOrNullableCollection";
                        break;
                    case 152:
                        objArr[2] = "isListOrNullableList";
                        break;
                    case 153:
                        objArr[2] = "isSetOrNullableSet";
                        break;
                    case 154:
                        objArr[2] = "isMapOrNullableMap";
                        break;
                    case 155:
                        objArr[2] = "isIterableOrNullableIterable";
                        break;
                    case 156:
                        objArr[2] = "isThrowableOrNullableThrowable";
                        break;
                    case 157:
                        objArr[2] = "isThrowable";
                        break;
                    case SDK_ASSET_ILLUSTRATION_WALLET_VALUE:
                        objArr[2] = "isKClass";
                        break;
                    case 159:
                        objArr[2] = "isNonPrimitiveArray";
                        break;
                    case 160:
                        objArr[2] = "isDeprecated";
                        break;
                    case 161:
                        objArr[2] = "isNotNullOrNullableFunctionSupertype";
                        break;
                    default:
                        objArr[2] = "<init>";
                        break;
                }
                java.lang.String format = java.lang.String.format(str, objArr);
                if (i != 11 && i != 13 && i != 15 && i != 69 && i != 74 && i != 81 && i != 84 && i != 86 && i != 87) {
                    switch (i) {
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            break;
                        default:
                            switch (i) {
                                case 18:
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                case 25:
                                case 26:
                                case 27:
                                case 28:
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                case 33:
                                case 34:
                                case 35:
                                case 36:
                                case 37:
                                case 38:
                                case 39:
                                case 40:
                                case 41:
                                case 42:
                                case 43:
                                case 44:
                                case 45:
                                case 46:
                                    break;
                                default:
                                    switch (i) {
                                        case 48:
                                        case 49:
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                            break;
                                        default:
                                            switch (i) {
                                                case 55:
                                                case 56:
                                                case 57:
                                                case 58:
                                                case 59:
                                                case 60:
                                                case 61:
                                                case 62:
                                                case 63:
                                                case 64:
                                                case 65:
                                                case 66:
                                                case 67:
                                                    break;
                                                default:
                                                    throw new java.lang.IllegalArgumentException(format);
                                            }
                                    }
                            }
                    }
                }
                throw new java.lang.IllegalStateException(format);
            }
            i2 = 2;
            java.lang.Object[] objArr2 = new java.lang.Object[i2];
            switch (i) {
            }
            if (i != 11) {
            }
            switch (i) {
            }
            java.lang.String format2 = java.lang.String.format(str, objArr2);
            if (i != 11) {
                switch (i) {
                }
            }
            throw new java.lang.IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i != 11) {
            switch (i) {
            }
            java.lang.Object[] objArr22 = new java.lang.Object[i2];
            switch (i) {
            }
            if (i != 11) {
            }
            switch (i) {
            }
            java.lang.String format22 = java.lang.String.format(str, objArr22);
            if (i != 11) {
            }
            throw new java.lang.IllegalStateException(format22);
        }
        i2 = 2;
        java.lang.Object[] objArr222 = new java.lang.Object[i2];
        switch (i) {
        }
        if (i != 11) {
        }
        switch (i) {
        }
        java.lang.String format222 = java.lang.String.format(str, objArr222);
        if (i != 11) {
        }
        throw new java.lang.IllegalStateException(format222);
    }
}
