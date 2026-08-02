package kotlin.reflect.jvm.internal.impl.builtins;

/* loaded from: classes5.dex */
public final class FunctionTypesKt {
    public static final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind getFunctionTypeKind(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = kotlinType.getConstructor().mo23898getDeclarationDescriptor();
        if (mo23898getDeclarationDescriptor != null) {
            return getFunctionTypeKind(mo23898getDeclarationDescriptor);
        }
        return null;
    }

    public static final boolean isFunctionType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(getFunctionTypeKind(kotlinType), kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.Function.INSTANCE);
    }

    public static final boolean isSuspendFunctionType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(getFunctionTypeKind(kotlinType), kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.SuspendFunction.INSTANCE);
    }

    public static final boolean isBuiltinFunctionalType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = kotlinType.getConstructor().mo23898getDeclarationDescriptor();
        return mo23898getDeclarationDescriptor != null && isBuiltinFunctionalClassDescriptor(mo23898getDeclarationDescriptor);
    }

    public static final boolean isBuiltinFunctionalClassDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
        kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind functionTypeKind = getFunctionTypeKind(declarationDescriptor);
        return kotlin.jvm.internal.Intrinsics.areEqual(functionTypeKind, kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.Function.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(functionTypeKind, kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.SuspendFunction.INSTANCE);
    }

    public static final boolean isBuiltinExtensionFunctionalType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        return isBuiltinFunctionalType(kotlinType) && kotlinType.getAnnotations().mo23890findAnnotation(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.extensionFunctionType) != null;
    }

    public static final boolean isNumberedFunctionClassFqName(kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqNameUnsafe, "");
        return fqNameUnsafe.startsWith(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.BUILT_INS_PACKAGE_NAME) && kotlin.jvm.internal.Intrinsics.areEqual(getHighSpeedVideoSizes(fqNameUnsafe), kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.Function.INSTANCE);
    }

    public static final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind getFunctionTypeKind(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
        if ((declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) && kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isUnderKotlinPackage(declarationDescriptor)) {
            return getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameUnsafe(declarationDescriptor));
        }
        return null;
    }

    private static final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe) {
        if (!fqNameUnsafe.isSafe() || fqNameUnsafe.isRoot()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKindExtractor functionTypeKindExtractor = kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKindExtractor.Companion.getDefault();
        kotlin.reflect.jvm.internal.impl.name.FqName parent = fqNameUnsafe.toSafe().parent();
        java.lang.String asString = fqNameUnsafe.shortName().asString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
        return functionTypeKindExtractor.getFunctionalClassKind(parent, asString);
    }

    public static final int contextFunctionTypeParamsCount(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor mo23890findAnnotation = kotlinType.getAnnotations().mo23890findAnnotation(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.contextFunctionTypeParams);
        if (mo23890findAnnotation == null) {
            return 0;
        }
        kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue constantValue = (kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue) kotlin.collections.MapsKt.getValue(mo23890findAnnotation.getAllValueArguments(), kotlin.reflect.jvm.internal.impl.builtins.StandardNames.CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME);
        kotlin.jvm.internal.Intrinsics.checkNotNull(constantValue, "");
        return ((kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue) constantValue).getValue().intValue();
    }

    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType getReceiverTypeFromFunctionType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        isBuiltinFunctionalType(kotlinType);
        if (kotlinType.getAnnotations().mo23890findAnnotation(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.extensionFunctionType) == null) {
            return null;
        }
        return kotlinType.getArguments().get(contextFunctionTypeParamsCount(kotlinType)).getType();
    }

    public static final java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> getContextReceiverTypesFromFunctionType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        isBuiltinFunctionalType(kotlinType);
        int contextFunctionTypeParamsCount = contextFunctionTypeParamsCount(kotlinType);
        if (contextFunctionTypeParamsCount == 0) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> subList = kotlinType.getArguments().subList(0, contextFunctionTypeParamsCount);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(subList, 10));
        java.util.Iterator<T> it = subList.iterator();
        while (it.hasNext()) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.types.TypeProjection) it.next()).getType());
        }
        return arrayList;
    }

    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType getReturnTypeFromFunctionType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        isBuiltinFunctionalType(kotlinType);
        kotlin.reflect.jvm.internal.impl.types.KotlinType type = ((kotlin.reflect.jvm.internal.impl.types.TypeProjection) kotlin.collections.CollectionsKt.last((java.util.List) kotlinType.getArguments())).getType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
        return type;
    }

    public static final java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> getValueParameterTypesFromFunctionType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        isBuiltinFunctionalType(kotlinType);
        return kotlinType.getArguments().subList(contextFunctionTypeParamsCount(kotlinType) + (isBuiltinExtensionFunctionalType(kotlinType) ? 1 : 0), r0.size() - 1);
    }

    public static final kotlin.reflect.jvm.internal.impl.name.Name extractParameterNameFromFunctionTypeArgument(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        java.lang.String value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor mo23890findAnnotation = kotlinType.getAnnotations().mo23890findAnnotation(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.parameterName);
        if (mo23890findAnnotation == null) {
            return null;
        }
        java.lang.Object singleOrNull = kotlin.collections.CollectionsKt.singleOrNull(mo23890findAnnotation.getAllValueArguments().values());
        kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue stringValue = singleOrNull instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue ? (kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue) singleOrNull : null;
        if (stringValue != null && (value = stringValue.getValue()) != null) {
            if (!kotlin.reflect.jvm.internal.impl.name.Name.isValidIdentifier(value)) {
                value = null;
            }
            if (value != null) {
                return kotlin.reflect.jvm.internal.impl.name.Name.identifier(value);
            }
        }
        return null;
    }

    public static final java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> getFunctionTypeArgumentProjections(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> list, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> list2, java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> list3, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns kotlinBuiltIns) {
        kotlin.reflect.jvm.internal.impl.name.Name name2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinBuiltIns, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(list2.size() + list.size() + (kotlinType != null ? 1 : 0) + 1);
        java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> list4 = list;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10));
        java.util.Iterator<T> it = list4.iterator();
        while (it.hasNext()) {
            arrayList2.add(kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.asTypeProjection((kotlin.reflect.jvm.internal.impl.types.KotlinType) it.next()));
        }
        arrayList.addAll(arrayList2);
        java.util.ArrayList arrayList3 = arrayList;
        kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(arrayList3, kotlinType != null ? kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.asTypeProjection(kotlinType) : null);
        int i = 0;
        for (java.lang.Object obj : list2) {
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType3 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) obj;
            if (list3 == null || (name2 = list3.get(i)) == null || name2.isSpecial()) {
                name2 = null;
            }
            if (name2 != null) {
                kotlin.reflect.jvm.internal.impl.name.FqName fqName = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.parameterName;
                kotlin.reflect.jvm.internal.impl.name.Name name3 = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.NAME;
                java.lang.String asString = name2.asString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                kotlinType3 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.replaceAnnotations(kotlinType3, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.create(kotlin.collections.CollectionsKt.plus(kotlinType3.getAnnotations(), new kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(name3, new kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue(asString))), false, 8, null))));
            }
            arrayList3.add(kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.asTypeProjection(kotlinType3));
            i++;
        }
        arrayList.add(kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.asTypeProjection(kotlinType2));
        return arrayList;
    }

    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType createFunctionType(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns kotlinBuiltIns, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> list, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> list2, java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> list3, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinBuiltIns, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotations, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType2, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> functionTypeArgumentProjections = getFunctionTypeArgumentProjections(kotlinType, list, list2, list3, kotlinType2, kotlinBuiltIns);
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor functionDescriptor = getFunctionDescriptor(kotlinBuiltIns, list2.size() + list.size() + (kotlinType == null ? 0 : 1), z);
        if (kotlinType != null) {
            annotations = withExtensionFunctionAnnotation(annotations, kotlinBuiltIns);
        }
        if (!list.isEmpty()) {
            annotations = withContextReceiversFunctionAnnotation(annotations, kotlinBuiltIns, list.size());
        }
        return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleNotNullType(kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt.toDefaultAttributes(annotations), functionDescriptor, functionTypeArgumentProjections);
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations withExtensionFunctionAnnotation(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns kotlinBuiltIns) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotations, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinBuiltIns, "");
        return annotations.hasAnnotation(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.extensionFunctionType) ? annotations : kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.create(kotlin.collections.CollectionsKt.plus(annotations, new kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor(kotlinBuiltIns, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.extensionFunctionType, kotlin.collections.MapsKt.emptyMap(), false, 8, null)));
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations withContextReceiversFunctionAnnotation(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns kotlinBuiltIns, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotations, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinBuiltIns, "");
        return annotations.hasAnnotation(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.contextFunctionTypeParams) ? annotations : kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.create(kotlin.collections.CollectionsKt.plus(annotations, new kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor(kotlinBuiltIns, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.contextFunctionTypeParams, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME, new kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue(i))), false, 8, null)));
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getFunctionDescriptor(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns kotlinBuiltIns, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinBuiltIns, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor suspendFunction = z ? kotlinBuiltIns.getSuspendFunction(i) : kotlinBuiltIns.getFunction(i);
        kotlin.jvm.internal.Intrinsics.checkNotNull(suspendFunction);
        return suspendFunction;
    }
}
