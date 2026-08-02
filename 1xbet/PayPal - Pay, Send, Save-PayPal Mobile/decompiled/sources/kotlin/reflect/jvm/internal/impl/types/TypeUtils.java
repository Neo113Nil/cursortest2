package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public class TypeUtils {
    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType DONT_CARE = kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.createErrorType(kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.DONT_CARE, new java.lang.String[0]);
    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType CANNOT_INFER_FUNCTION_PARAM_TYPE = kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.createErrorType(kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.UNINFERRED_LAMBDA_PARAMETER_TYPE, new java.lang.String[0]);
    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType NO_EXPECTED_TYPE = new kotlin.reflect.jvm.internal.impl.types.TypeUtils.SpecialType("NO_EXPECTED_TYPE");
    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType UNIT_EXPECTED_TYPE = new kotlin.reflect.jvm.internal.impl.types.TypeUtils.SpecialType("UNIT_EXPECTED_TYPE");

    public static class SpecialType extends kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType {
        private final java.lang.String Camera2StreamConfigurationMap;

        @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.UnwrappedType makeNullableAsSpecified(boolean z) {
            return makeNullableAsSpecified(z);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.UnwrappedType replaceAttributes(kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes) {
            return replaceAttributes(typeAttributes);
        }

        public SpecialType(java.lang.String str) {
            this.Camera2StreamConfigurationMap = str;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
        protected kotlin.reflect.jvm.internal.impl.types.SimpleType getDelegate() {
            throw new java.lang.IllegalStateException(this.Camera2StreamConfigurationMap);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
        public kotlin.reflect.jvm.internal.impl.types.SimpleType replaceAttributes(kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes) {
            if (typeAttributes == null) {
                getHighSpeedVideoFpsRanges(0);
            }
            throw new java.lang.IllegalStateException(this.Camera2StreamConfigurationMap);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
        public kotlin.reflect.jvm.internal.impl.types.SimpleType makeNullableAsSpecified(boolean z) {
            throw new java.lang.IllegalStateException(this.Camera2StreamConfigurationMap);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
        public java.lang.String toString() {
            java.lang.String str = this.Camera2StreamConfigurationMap;
            if (str == null) {
                getHighSpeedVideoFpsRanges(1);
            }
            return str;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
        public kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType replaceDelegate(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType) {
            if (simpleType == null) {
                getHighSpeedVideoFpsRanges(2);
            }
            throw new java.lang.IllegalStateException(this.Camera2StreamConfigurationMap);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
        public kotlin.reflect.jvm.internal.impl.types.TypeUtils.SpecialType refine(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
            if (kotlinTypeRefiner == null) {
                getHighSpeedVideoFpsRanges(3);
            }
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x003e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static /* synthetic */ void getHighSpeedVideoFpsRanges(int i) {
            java.lang.String format;
            java.lang.String str = (i == 1 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            java.lang.Object[] objArr = new java.lang.Object[(i == 1 || i == 4) ? 2 : 3];
            if (i != 1) {
                if (i == 2) {
                    objArr[0] = "delegate";
                } else if (i == 3) {
                    objArr[0] = "kotlinTypeRefiner";
                } else if (i != 4) {
                    objArr[0] = "newAttributes";
                }
                if (i != 1) {
                    objArr[1] = "toString";
                } else if (i != 4) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
                } else {
                    objArr[1] = "refine";
                }
                if (i != 1) {
                    if (i == 2) {
                        objArr[2] = "replaceDelegate";
                    } else if (i == 3) {
                        objArr[2] = "refine";
                    } else if (i != 4) {
                        objArr[2] = "replaceAttributes";
                    }
                }
                format = java.lang.String.format(str, objArr);
                if (i == 1 && i != 4) {
                    throw new java.lang.IllegalArgumentException(format);
                }
                throw new java.lang.IllegalStateException(format);
            }
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            if (i != 1) {
            }
            if (i != 1) {
            }
            format = java.lang.String.format(str, objArr);
            if (i == 1) {
            }
            throw new java.lang.IllegalStateException(format);
        }
    }

    public static boolean noExpectedType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            getHighResolutionOutputSizeshNQ4ISI(0);
        }
        return kotlinType == NO_EXPECTED_TYPE || kotlinType == UNIT_EXPECTED_TYPE;
    }

    public static boolean isDontCarePlaceholder(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        return kotlinType != null && kotlinType.getConstructor() == DONT_CARE.getConstructor();
    }

    public static kotlin.reflect.jvm.internal.impl.types.KotlinType makeNullable(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            getHighResolutionOutputSizeshNQ4ISI(1);
        }
        return makeNullableAsSpecified(kotlinType, true);
    }

    public static kotlin.reflect.jvm.internal.impl.types.KotlinType makeNotNullable(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            getHighResolutionOutputSizeshNQ4ISI(2);
        }
        return makeNullableAsSpecified(kotlinType, false);
    }

    public static kotlin.reflect.jvm.internal.impl.types.KotlinType makeNullableAsSpecified(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, boolean z) {
        if (kotlinType == null) {
            getHighResolutionOutputSizeshNQ4ISI(3);
        }
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType makeNullableAsSpecified = kotlinType.unwrap().makeNullableAsSpecified(z);
        if (makeNullableAsSpecified == null) {
            getHighResolutionOutputSizeshNQ4ISI(4);
        }
        return makeNullableAsSpecified;
    }

    public static kotlin.reflect.jvm.internal.impl.types.SimpleType makeNullableIfNeeded(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, boolean z) {
        if (simpleType == null) {
            getHighResolutionOutputSizeshNQ4ISI(5);
        }
        if (!z) {
            if (simpleType == null) {
                getHighResolutionOutputSizeshNQ4ISI(7);
            }
            return simpleType;
        }
        kotlin.reflect.jvm.internal.impl.types.SimpleType makeNullableAsSpecified = simpleType.makeNullableAsSpecified(true);
        if (makeNullableAsSpecified == null) {
            getHighResolutionOutputSizeshNQ4ISI(6);
        }
        return makeNullableAsSpecified;
    }

    public static kotlin.reflect.jvm.internal.impl.types.KotlinType makeNullableIfNeeded(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, boolean z) {
        if (kotlinType == null) {
            getHighResolutionOutputSizeshNQ4ISI(8);
        }
        if (z) {
            return makeNullable(kotlinType);
        }
        if (kotlinType == null) {
            getHighResolutionOutputSizeshNQ4ISI(9);
        }
        return kotlinType;
    }

    public static kotlin.reflect.jvm.internal.impl.types.SimpleType makeUnsubstitutedType(kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptor, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope, kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner, kotlin.reflect.jvm.internal.impl.types.SimpleType> function1) {
        if (kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.isError(classifierDescriptor)) {
            kotlin.reflect.jvm.internal.impl.types.error.ErrorType createErrorType = kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.createErrorType(kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, classifierDescriptor.toString());
            if (createErrorType == null) {
                getHighResolutionOutputSizeshNQ4ISI(11);
            }
            return createErrorType;
        }
        return makeUnsubstitutedType(classifierDescriptor.getTypeConstructor(), memberScope, function1);
    }

    public static kotlin.reflect.jvm.internal.impl.types.SimpleType makeUnsubstitutedType(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope, kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner, kotlin.reflect.jvm.internal.impl.types.SimpleType> function1) {
        if (typeConstructor == null) {
            getHighResolutionOutputSizeshNQ4ISI(12);
        }
        if (memberScope == null) {
            getHighResolutionOutputSizeshNQ4ISI(13);
        }
        if (function1 == null) {
            getHighResolutionOutputSizeshNQ4ISI(14);
        }
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeWithNonTrivialMemberScope = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(kotlin.reflect.jvm.internal.impl.types.TypeAttributes.Companion.getEmpty(), typeConstructor, getDefaultTypeProjections(typeConstructor.getParameters()), false, memberScope, function1);
        if (simpleTypeWithNonTrivialMemberScope == null) {
            getHighResolutionOutputSizeshNQ4ISI(15);
        }
        return simpleTypeWithNonTrivialMemberScope;
    }

    public static java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> getDefaultTypeProjections(java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list) {
        if (list == null) {
            getHighResolutionOutputSizeshNQ4ISI(16);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(it.next().getDefaultType()));
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> list2 = kotlin.collections.CollectionsKt.toList(arrayList);
        if (list2 == null) {
            getHighResolutionOutputSizeshNQ4ISI(17);
        }
        return list2;
    }

    public static java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> getImmediateSupertypes(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            getHighResolutionOutputSizeshNQ4ISI(18);
        }
        kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor create = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.create(kotlinType);
        java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> supertypes = kotlinType.getConstructor().getSupertypes();
        java.util.ArrayList arrayList = new java.util.ArrayList(supertypes.size());
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.types.KotlinType> it = supertypes.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.types.KotlinType createSubstitutedSupertype = createSubstitutedSupertype(kotlinType, it.next(), create);
            if (createSubstitutedSupertype != null) {
                arrayList.add(createSubstitutedSupertype);
            }
        }
        return arrayList;
    }

    public static kotlin.reflect.jvm.internal.impl.types.KotlinType createSubstitutedSupertype(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2, kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutor) {
        if (kotlinType == null) {
            getHighResolutionOutputSizeshNQ4ISI(20);
        }
        if (kotlinType2 == null) {
            getHighResolutionOutputSizeshNQ4ISI(21);
        }
        if (typeSubstitutor == null) {
            getHighResolutionOutputSizeshNQ4ISI(22);
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType substitute = typeSubstitutor.substitute(kotlinType2, kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT);
        if (substitute != null) {
            return makeNullableIfNeeded(substitute, kotlinType.isMarkedNullable());
        }
        return null;
    }

    public static boolean isNullableType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            getHighResolutionOutputSizeshNQ4ISI(27);
        }
        if (kotlinType.isMarkedNullable()) {
            return true;
        }
        if (kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.isFlexible(kotlinType) && isNullableType(kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.asFlexibleType(kotlinType).getUpperBound())) {
            return true;
        }
        if (kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt.isDefinitelyNotNullType(kotlinType)) {
            return false;
        }
        if (isTypeParameter(kotlinType)) {
            return hasNullableSuperType(kotlinType);
        }
        if (kotlinType instanceof kotlin.reflect.jvm.internal.impl.types.AbstractStubType) {
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor originalTypeParameter = ((kotlin.reflect.jvm.internal.impl.types.AbstractStubType) kotlinType).getOriginalTypeVariable().getOriginalTypeParameter();
            return originalTypeParameter == null || hasNullableSuperType(originalTypeParameter.getDefaultType());
        }
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor = kotlinType.getConstructor();
        if (constructor instanceof kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor) {
            java.util.Iterator<kotlin.reflect.jvm.internal.impl.types.KotlinType> it = constructor.getSupertypes().iterator();
            while (it.hasNext()) {
                if (isNullableType(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean acceptsNullable(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            getHighResolutionOutputSizeshNQ4ISI(28);
        }
        if (kotlinType.isMarkedNullable()) {
            return true;
        }
        return kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.isFlexible(kotlinType) && acceptsNullable(kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.asFlexibleType(kotlinType).getUpperBound());
    }

    public static boolean hasNullableSuperType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            getHighResolutionOutputSizeshNQ4ISI(29);
        }
        if (kotlinType.getConstructor().mo23898getDeclarationDescriptor() instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
            return false;
        }
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.types.KotlinType> it = getImmediateSupertypes(kotlinType).iterator();
        while (it.hasNext()) {
            if (isNullableType(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getClassDescriptor(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            getHighResolutionOutputSizeshNQ4ISI(30);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = kotlinType.getConstructor().mo23898getDeclarationDescriptor();
        if (mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) mo23898getDeclarationDescriptor;
        }
        return null;
    }

    public static boolean contains(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.UnwrappedType, java.lang.Boolean> function1) {
        if (function1 == null) {
            getHighResolutionOutputSizeshNQ4ISI(43);
        }
        return getHighSpeedVideoSizes(kotlinType, function1, null);
    }

    private static boolean getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.UnwrappedType, java.lang.Boolean> function1, kotlin.reflect.jvm.internal.impl.utils.SmartSet<kotlin.reflect.jvm.internal.impl.types.KotlinType> smartSet) {
        if (function1 == null) {
            getHighResolutionOutputSizeshNQ4ISI(44);
        }
        if (kotlinType == null) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrap = kotlinType.unwrap();
        if (noExpectedType(kotlinType)) {
            return function1.invoke(unwrap).booleanValue();
        }
        if (smartSet != null && smartSet.contains(kotlinType)) {
            return false;
        }
        if (function1.invoke(unwrap).booleanValue()) {
            return true;
        }
        if (smartSet == null) {
            smartSet = kotlin.reflect.jvm.internal.impl.utils.SmartSet.create();
        }
        smartSet.add(kotlinType);
        kotlin.reflect.jvm.internal.impl.types.FlexibleType flexibleType = unwrap instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType ? (kotlin.reflect.jvm.internal.impl.types.FlexibleType) unwrap : null;
        if (flexibleType != null && (getHighSpeedVideoSizes(flexibleType.getLowerBound(), function1, smartSet) || getHighSpeedVideoSizes(flexibleType.getUpperBound(), function1, smartSet))) {
            return true;
        }
        if ((unwrap instanceof kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType) && getHighSpeedVideoSizes(((kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType) unwrap).getOriginal(), function1, smartSet)) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor = kotlinType.getConstructor();
        if (constructor instanceof kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor) {
            java.util.Iterator<kotlin.reflect.jvm.internal.impl.types.KotlinType> it = ((kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor) constructor).getSupertypes().iterator();
            while (it.hasNext()) {
                if (getHighSpeedVideoSizes(it.next(), function1, smartSet)) {
                    return true;
                }
            }
            return false;
        }
        for (kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection : kotlinType.getArguments()) {
            if (!typeProjection.isStarProjection() && getHighSpeedVideoSizes(typeProjection.getType(), function1, smartSet)) {
                return true;
            }
        }
        return false;
    }

    public static kotlin.reflect.jvm.internal.impl.types.TypeProjection makeStarProjection(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor) {
        if (typeParameterDescriptor == null) {
            getHighResolutionOutputSizeshNQ4ISI(45);
        }
        return new kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl(typeParameterDescriptor);
    }

    public static kotlin.reflect.jvm.internal.impl.types.TypeProjection makeStarProjection(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes erasureTypeAttributes) {
        if (typeParameterDescriptor == null) {
            getHighResolutionOutputSizeshNQ4ISI(46);
        }
        if (erasureTypeAttributes.getHowThisTypeIsUsed() == kotlin.reflect.jvm.internal.impl.types.TypeUsage.SUPERTYPE) {
            return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(kotlin.reflect.jvm.internal.impl.types.StarProjectionImplKt.starProjectionType(typeParameterDescriptor));
        }
        return new kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl(typeParameterDescriptor);
    }

    public static boolean isTypeParameter(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            getHighResolutionOutputSizeshNQ4ISI(60);
        }
        return getTypeParameterDescriptorOrNull(kotlinType) != null || (kotlinType.getConstructor() instanceof kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor);
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor getTypeParameterDescriptorOrNull(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            getHighResolutionOutputSizeshNQ4ISI(63);
        }
        if (kotlinType.getConstructor().mo23898getDeclarationDescriptor() instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) kotlinType.getConstructor().mo23898getDeclarationDescriptor();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(int i) {
        java.lang.String str;
        int i2;
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
                switch (i) {
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        break;
                    default:
                        i2 = 3;
                        break;
                }
                java.lang.Object[] objArr = new java.lang.Object[i2];
                switch (i) {
                    case 4:
                    case 6:
                    case 7:
                    case 9:
                    case 11:
                    case 15:
                    case 17:
                    case 19:
                    case 26:
                    case 35:
                    case 48:
                    case 53:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                        break;
                    case 5:
                    case 8:
                    case 10:
                    case 18:
                    case 23:
                    case 25:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 38:
                    case 40:
                    default:
                        objArr[0] = "type";
                        break;
                    case 12:
                        objArr[0] = "typeConstructor";
                        break;
                    case 13:
                        objArr[0] = "unsubstitutedMemberScope";
                        break;
                    case 14:
                        objArr[0] = "refinedTypeFactory";
                        break;
                    case 16:
                        objArr[0] = "parameters";
                        break;
                    case 20:
                        objArr[0] = "subType";
                        break;
                    case 21:
                        objArr[0] = "superType";
                        break;
                    case 22:
                        objArr[0] = "substitutor";
                        break;
                    case 24:
                        objArr[0] = "result";
                        break;
                    case 31:
                    case 33:
                        objArr[0] = "clazz";
                        break;
                    case 32:
                        objArr[0] = "typeArguments";
                        break;
                    case 34:
                        objArr[0] = "projections";
                        break;
                    case 36:
                        objArr[0] = "a";
                        break;
                    case 37:
                        objArr[0] = util.h.xy.cb.b.f1091;
                        break;
                    case 39:
                        objArr[0] = "typeParameters";
                        break;
                    case 41:
                        objArr[0] = "typeParameterConstructors";
                        break;
                    case 42:
                        objArr[0] = "specialType";
                        break;
                    case 43:
                    case 44:
                        objArr[0] = "isSpecialType";
                        break;
                    case 45:
                    case 46:
                        objArr[0] = "parameterDescriptor";
                        break;
                    case 47:
                    case 51:
                        objArr[0] = "numberValueTypeConstructor";
                        break;
                    case 49:
                    case 50:
                        objArr[0] = "supertypes";
                        break;
                    case 52:
                    case 55:
                        objArr[0] = "expectedType";
                        break;
                    case 54:
                        objArr[0] = "literalTypeConstructor";
                        break;
                }
                if (i == 4) {
                    if (i != 9) {
                        if (i == 11 || i == 15) {
                            objArr[1] = "makeUnsubstitutedType";
                        } else if (i == 17) {
                            objArr[1] = "getDefaultTypeProjections";
                        } else if (i == 19) {
                            objArr[1] = "getImmediateSupertypes";
                        } else if (i == 26) {
                            objArr[1] = "getAllSupertypes";
                        } else if (i == 35) {
                            objArr[1] = "substituteProjectionsForParameters";
                        } else if (i != 48) {
                            if (i != 53) {
                                if (i != 6 && i != 7) {
                                    switch (i) {
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                                            break;
                                    }
                                }
                            }
                            objArr[1] = "getPrimitiveNumberType";
                        } else {
                            objArr[1] = "getDefaultPrimitiveNumberType";
                        }
                    }
                    objArr[1] = "makeNullableIfNeeded";
                } else {
                    objArr[1] = "makeNullableAsSpecified";
                }
                switch (i) {
                    case 1:
                        objArr[2] = "makeNullable";
                        break;
                    case 2:
                        objArr[2] = "makeNotNullable";
                        break;
                    case 3:
                        objArr[2] = "makeNullableAsSpecified";
                        break;
                    case 4:
                    case 6:
                    case 7:
                    case 9:
                    case 11:
                    case 15:
                    case 17:
                    case 19:
                    case 26:
                    case 35:
                    case 48:
                    case 53:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        break;
                    case 5:
                    case 8:
                        objArr[2] = "makeNullableIfNeeded";
                        break;
                    case 10:
                        objArr[2] = "canHaveSubtypes";
                        break;
                    case 12:
                    case 13:
                    case 14:
                        objArr[2] = "makeUnsubstitutedType";
                        break;
                    case 16:
                        objArr[2] = "getDefaultTypeProjections";
                        break;
                    case 18:
                        objArr[2] = "getImmediateSupertypes";
                        break;
                    case 20:
                    case 21:
                    case 22:
                        objArr[2] = "createSubstitutedSupertype";
                        break;
                    case 23:
                    case 24:
                        objArr[2] = "collectAllSupertypes";
                        break;
                    case 25:
                        objArr[2] = "getAllSupertypes";
                        break;
                    case 27:
                        objArr[2] = "isNullableType";
                        break;
                    case 28:
                        objArr[2] = "acceptsNullable";
                        break;
                    case 29:
                        objArr[2] = "hasNullableSuperType";
                        break;
                    case 30:
                        objArr[2] = "getClassDescriptor";
                        break;
                    case 31:
                    case 32:
                        objArr[2] = "substituteParameters";
                        break;
                    case 33:
                    case 34:
                        objArr[2] = "substituteProjectionsForParameters";
                        break;
                    case 36:
                    case 37:
                        objArr[2] = "equalTypes";
                        break;
                    case 38:
                    case 39:
                        objArr[2] = "dependsOnTypeParameters";
                        break;
                    case 40:
                    case 41:
                        objArr[2] = "dependsOnTypeConstructors";
                        break;
                    case 42:
                    case 43:
                    case 44:
                        objArr[2] = "contains";
                        break;
                    case 45:
                    case 46:
                        objArr[2] = "makeStarProjection";
                        break;
                    case 47:
                    case 49:
                        objArr[2] = "getDefaultPrimitiveNumberType";
                        break;
                    case 50:
                        objArr[2] = "findByFqName";
                        break;
                    case 51:
                    case 52:
                    case 54:
                    case 55:
                        objArr[2] = "getPrimitiveNumberType";
                        break;
                    case 60:
                        objArr[2] = "isTypeParameter";
                        break;
                    case 61:
                        objArr[2] = "isReifiedTypeParameter";
                        break;
                    case 62:
                        objArr[2] = "isNonReifiedTypeParameter";
                        break;
                    case 63:
                        objArr[2] = "getTypeParameterDescriptorOrNull";
                        break;
                    default:
                        objArr[2] = "noExpectedType";
                        break;
                }
                java.lang.String format = java.lang.String.format(str, objArr);
                if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
                    switch (i) {
                        case 56:
                        case 57:
                        case 58:
                        case 59:
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
            if (i == 4) {
            }
            switch (i) {
            }
            java.lang.String format2 = java.lang.String.format(str, objArr2);
            if (i != 4) {
                switch (i) {
                }
            }
            throw new java.lang.IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i != 4) {
            switch (i) {
            }
            java.lang.Object[] objArr22 = new java.lang.Object[i2];
            switch (i) {
            }
            if (i == 4) {
            }
            switch (i) {
            }
            java.lang.String format22 = java.lang.String.format(str, objArr22);
            if (i != 4) {
            }
            throw new java.lang.IllegalStateException(format22);
        }
        i2 = 2;
        java.lang.Object[] objArr222 = new java.lang.Object[i2];
        switch (i) {
        }
        if (i == 4) {
        }
        switch (i) {
        }
        java.lang.String format222 = java.lang.String.format(str, objArr222);
        if (i != 4) {
        }
        throw new java.lang.IllegalStateException(format222);
    }
}
