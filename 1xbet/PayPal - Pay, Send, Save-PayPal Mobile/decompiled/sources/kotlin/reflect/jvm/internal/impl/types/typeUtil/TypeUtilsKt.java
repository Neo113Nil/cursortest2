package kotlin.reflect.jvm.internal.impl.types.typeUtil;

/* loaded from: classes5.dex */
public final class TypeUtilsKt {
    public static final kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns getBuiltIns(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns builtIns = kotlinType.getConstructor().getBuiltIns();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builtIns, "");
        return builtIns;
    }

    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType makeNullable(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.reflect.jvm.internal.impl.types.KotlinType makeNullable = kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeNullable(kotlinType);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(makeNullable, "");
        return makeNullable;
    }

    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType makeNotNullable(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.reflect.jvm.internal.impl.types.KotlinType makeNotNullable = kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeNotNullable(kotlinType);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(makeNotNullable, "");
        return makeNotNullable;
    }

    public static final boolean isNothing(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        return kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isNothing(kotlinType);
    }

    public static final boolean isBoolean(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        return kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isBoolean(kotlinType);
    }

    public static final boolean isTypeParameter(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        return kotlin.reflect.jvm.internal.impl.types.TypeUtils.isTypeParameter(kotlinType);
    }

    public static final boolean containsTypeParameter(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        return kotlin.reflect.jvm.internal.impl.types.TypeUtils.contains(kotlinType, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt$$Lambda$0
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Boolean valueOf;
                valueOf = java.lang.Boolean.valueOf(kotlin.reflect.jvm.internal.impl.types.TypeUtils.isTypeParameter((kotlin.reflect.jvm.internal.impl.types.UnwrappedType) obj));
                return valueOf;
            }
        });
    }

    public static final boolean isSubtypeOf(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType2, "");
        return kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.DEFAULT.isSubtypeOf(kotlinType, kotlinType2);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType replaceAnnotations(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotations, "");
        return (kotlinType.getAnnotations().isEmpty() && annotations.isEmpty()) ? kotlinType : kotlinType.unwrap().replaceAttributes(kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt.replaceAnnotations(kotlinType.getAttributes(), annotations));
    }

    public static final kotlin.reflect.jvm.internal.impl.types.TypeProjection createProjection(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.Variance variance, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variance, "");
        if ((typeParameterDescriptor != null ? typeParameterDescriptor.getVariance() : null) == variance) {
            variance = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT;
        }
        return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(variance, kotlinType);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.TypeProjection asTypeProjection(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(kotlinType);
    }

    public static final boolean contains(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.types.UnwrappedType, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return kotlin.reflect.jvm.internal.impl.types.TypeUtils.contains(kotlinType, function1);
    }

    public static final java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> extractTypeParametersFromUpperBounds(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, java.util.Set<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        getHighSpeedVideoFpsRangesFor(kotlinType, kotlinType, linkedHashSet, set);
        return linkedHashSet;
    }

    private static final void getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2, java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> set, java.util.Set<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> set2) {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = kotlinType.getConstructor().mo23898getDeclarationDescriptor();
        if (mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(kotlinType.getConstructor(), kotlinType2.getConstructor())) {
                set.add(mo23898getDeclarationDescriptor);
                return;
            }
            for (kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType3 : ((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) mo23898getDeclarationDescriptor).getUpperBounds()) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(kotlinType3);
                getHighSpeedVideoFpsRangesFor(kotlinType3, kotlinType2, set, set2);
            }
            return;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor2 = kotlinType.getConstructor().mo23898getDeclarationDescriptor();
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters = mo23898getDeclarationDescriptor2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters ? (kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters) mo23898getDeclarationDescriptor2 : null;
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> declaredTypeParameters = classifierDescriptorWithTypeParameters != null ? classifierDescriptorWithTypeParameters.getDeclaredTypeParameters() : null;
        int i = 0;
        for (kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection : kotlinType.getArguments()) {
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor = declaredTypeParameters != null ? (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) kotlin.collections.CollectionsKt.getOrNull(declaredTypeParameters, i) : null;
            if ((typeParameterDescriptor == null || set2 == null || !set2.contains(typeParameterDescriptor)) && !typeProjection.isStarProjection() && !kotlin.collections.CollectionsKt.contains(set, typeProjection.getType().getConstructor().mo23898getDeclarationDescriptor()) && !kotlin.jvm.internal.Intrinsics.areEqual(typeProjection.getType().getConstructor(), kotlinType2.getConstructor())) {
                kotlin.reflect.jvm.internal.impl.types.KotlinType type = typeProjection.getType();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
                getHighSpeedVideoFpsRangesFor(type, kotlinType2, set, set2);
            }
            i++;
        }
    }

    public static /* synthetic */ boolean hasTypeParameterRecursiveBounds$default(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, java.util.Set set, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            typeConstructor = null;
        }
        if ((i & 4) != 0) {
            set = null;
        }
        return hasTypeParameterRecursiveBounds(typeParameterDescriptor, typeConstructor, set);
    }

    public static final boolean hasTypeParameterRecursiveBounds(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, java.util.Set<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameterDescriptor, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperBounds, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> list = upperBounds;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return false;
        }
        for (kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType : list) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(kotlinType);
            if (getHighSpeedVideoSizes(kotlinType, typeParameterDescriptor.getDefaultType().getConstructor(), set) && (typeConstructor == null || kotlin.jvm.internal.Intrinsics.areEqual(kotlinType.getConstructor(), typeConstructor))) {
                return true;
            }
        }
        return false;
    }

    private static final boolean getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, java.util.Set<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> set) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(kotlinType.getConstructor(), typeConstructor)) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = kotlinType.getConstructor().mo23898getDeclarationDescriptor();
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters = mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters ? (kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters) mo23898getDeclarationDescriptor : null;
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> declaredTypeParameters = classifierDescriptorWithTypeParameters != null ? classifierDescriptorWithTypeParameters.getDeclaredTypeParameters() : null;
        java.lang.Iterable<kotlin.collections.IndexedValue> withIndex = kotlin.collections.CollectionsKt.withIndex(kotlinType.getArguments());
        if ((withIndex instanceof java.util.Collection) && ((java.util.Collection) withIndex).isEmpty()) {
            return false;
        }
        for (kotlin.collections.IndexedValue indexedValue : withIndex) {
            int index = indexedValue.getIndex();
            kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection = (kotlin.reflect.jvm.internal.impl.types.TypeProjection) indexedValue.component2();
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor = declaredTypeParameters != null ? (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) kotlin.collections.CollectionsKt.getOrNull(declaredTypeParameters, index) : null;
            if (typeParameterDescriptor == null || set == null || !set.contains(typeParameterDescriptor)) {
                if (typeProjection.isStarProjection()) {
                    continue;
                } else {
                    kotlin.reflect.jvm.internal.impl.types.KotlinType type = typeProjection.getType();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
                    if (getHighSpeedVideoSizes(type, typeConstructor, set)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean containsTypeAliasParameters(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        return contains(kotlinType, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt$$Lambda$2
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.getHighSpeedVideoSizes((kotlin.reflect.jvm.internal.impl.types.UnwrappedType) obj));
            }
        });
    }

    public static final boolean isTypeAliasParameter(kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classifierDescriptor, "");
        return (classifierDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) && (((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) classifierDescriptor).getContainingDeclaration() instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor);
    }

    public static final boolean requiresTypeAliasExpansion(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        return contains(kotlinType, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt$$Lambda$4
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.Camera2StreamConfigurationMap((kotlin.reflect.jvm.internal.impl.types.UnwrappedType) obj));
            }
        });
    }

    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType getRepresentativeUpperBound(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameterDescriptor, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperBounds, "");
        upperBounds.isEmpty();
        java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> upperBounds2 = typeParameterDescriptor.getUpperBounds();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperBounds2, "");
        java.util.Iterator<T> it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = ((kotlin.reflect.jvm.internal.impl.types.KotlinType) next).getConstructor().mo23898getDeclarationDescriptor();
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) mo23898getDeclarationDescriptor : null;
            if (classDescriptor != null && classDescriptor.getKind() != kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE && classDescriptor.getKind() != kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType = (kotlin.reflect.jvm.internal.impl.types.KotlinType) obj;
        if (kotlinType != null) {
            return kotlinType;
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> upperBounds3 = typeParameterDescriptor.getUpperBounds();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperBounds3, "");
        java.lang.Object first = kotlin.collections.CollectionsKt.first((java.util.List<? extends java.lang.Object>) upperBounds3);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(first, "");
        return (kotlin.reflect.jvm.internal.impl.types.KotlinType) first;
    }

    public static final boolean shouldBeUpdated(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        return kotlinType == null || contains(kotlinType, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt$$Lambda$5
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.getHighResolutionOutputSizeshNQ4ISI((kotlin.reflect.jvm.internal.impl.types.UnwrappedType) obj));
            }
        });
    }

    public static final boolean isStubType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        if (kotlinType instanceof kotlin.reflect.jvm.internal.impl.types.AbstractStubType) {
            return true;
        }
        return (kotlinType instanceof kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType) && (((kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType) kotlinType).getOriginal() instanceof kotlin.reflect.jvm.internal.impl.types.AbstractStubType);
    }

    public static final boolean isStubTypeForBuilderInference(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        if (kotlinType instanceof kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference) {
            return true;
        }
        return (kotlinType instanceof kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType) && (((kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType) kotlinType).getOriginal() instanceof kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference);
    }

    public static final boolean isUnresolvedType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        return (kotlinType instanceof kotlin.reflect.jvm.internal.impl.types.error.ErrorType) && ((kotlin.reflect.jvm.internal.impl.types.error.ErrorType) kotlinType).getKind().isUnresolved();
    }

    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType replaceArgumentsWithStarProjections(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrap = kotlinType.unwrap();
        if (unwrap instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType) {
            kotlin.reflect.jvm.internal.impl.types.FlexibleType flexibleType = (kotlin.reflect.jvm.internal.impl.types.FlexibleType) unwrap;
            kotlin.reflect.jvm.internal.impl.types.SimpleType lowerBound = flexibleType.getLowerBound();
            if (!lowerBound.getConstructor().getParameters().isEmpty() && lowerBound.getConstructor().mo23898getDeclarationDescriptor() != null) {
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters = lowerBound.getConstructor().getParameters();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameters, "");
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list = parameters;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) it.next()));
                }
                lowerBound = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt.replace$default(lowerBound, arrayList, null, 2, null);
            }
            kotlin.reflect.jvm.internal.impl.types.SimpleType upperBound = flexibleType.getUpperBound();
            if (!upperBound.getConstructor().getParameters().isEmpty() && upperBound.getConstructor().mo23898getDeclarationDescriptor() != null) {
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters2 = upperBound.getConstructor().getParameters();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameters2, "");
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list2 = parameters2;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                java.util.Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) it2.next()));
                }
                upperBound = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt.replace$default(upperBound, arrayList2, null, 2, null);
            }
            simpleType = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(lowerBound, upperBound);
        } else {
            if (!(unwrap instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType2 = (kotlin.reflect.jvm.internal.impl.types.SimpleType) unwrap;
            if (!simpleType2.getConstructor().getParameters().isEmpty() && simpleType2.getConstructor().mo23898getDeclarationDescriptor() != null) {
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters3 = simpleType2.getConstructor().getParameters();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameters3, "");
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list3 = parameters3;
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                java.util.Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) it3.next()));
                }
                simpleType2 = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt.replace$default(simpleType2, arrayList3, null, 2, null);
            }
            simpleType = simpleType2;
        }
        return kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.inheritEnhancement(simpleType, unwrap);
    }

    static /* synthetic */ boolean getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unwrappedType, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = unwrappedType.getConstructor().mo23898getDeclarationDescriptor();
        if (mo23898getDeclarationDescriptor != null) {
            return isTypeAliasParameter(mo23898getDeclarationDescriptor);
        }
        return false;
    }

    static /* synthetic */ boolean Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unwrappedType, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = unwrappedType.getConstructor().mo23898getDeclarationDescriptor();
        if (mo23898getDeclarationDescriptor != null) {
            return (mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor) || (mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor);
        }
        return false;
    }

    static /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unwrappedType, "");
        return (unwrappedType instanceof kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference) || (unwrappedType.getConstructor() instanceof kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker) || kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(unwrappedType);
    }

    public static final boolean hasTypeParameterRecursiveBounds(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameterDescriptor, "");
        return hasTypeParameterRecursiveBounds$default(typeParameterDescriptor, null, null, 6, null);
    }
}
