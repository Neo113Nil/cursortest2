package kotlin.reflect.jvm.internal.calls;

@kotlin.Metadata(d1 = {"\u0000l\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a \u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\u001a\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a(\u0010\u000b\u001a\u00020\f*\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002\u001a9\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00110\u0017¢\u0006\u0002\b\u0019H\u0002\u001a\f\u0010\u001a\u001a\u00020\u0011*\u00020\u0015H\u0002\u001a6\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u001c0\r\"\n\b\u0000\u0010\u001c*\u0004\u0018\u00010\u0015*\b\u0012\u0004\u0012\u0002H\u001c0\r2\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0000\u001a\f\u0010\u001d\u001a\u00020\u0011*\u00020\tH\u0002\u001a\u0018\u0010\u001e\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u001f2\u0006\u0010\b\u001a\u00020\tH\u0000\u001a\u0018\u0010 \u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u001f2\u0006\u0010\b\u001a\u00020\tH\u0002\u001a\u0012\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001f*\u00020\u0013H\u0002\u001a\u0014\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001f*\u0004\u0018\u00010\"H\u0000\u001a\u0018\u0010&\u001a\u0004\u0018\u00010'*\u0004\u0018\u00010'2\u0006\u0010\b\u001a\u00020\tH\u0000\"\u001a\u0010#\u001a\u0004\u0018\u00010\u0013*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"toJvmDescriptor", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassifierDescriptor;", "getValueClassUnboxMethods", "", "Ljava/lang/reflect/Method;", "type", "Lkotlin/reflect/jvm/internal/impl/types/SimpleType;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "getMfvcUnboxMethods", "checkParametersSize", "", "Lkotlin/reflect/jvm/internal/calls/Caller;", "expectedArgsSize", "", "isDefault", "", "makeKotlinParameterTypes", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "member", "Ljava/lang/reflect/Member;", "isSpecificClass", "Lkotlin/Function1;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "Lkotlin/ExtensionFunctionType;", "acceptsBoxedReceiverParameter", "createValueClassAwareCallerIfNeeded", "M", "hasValueClassReceiver", "getInlineClassUnboxMethod", "Ljava/lang/Class;", "getBoxMethod", "toInlineClass", "Lkotlin/reflect/jvm/internal/impl/descriptors/DeclarationDescriptor;", "expectedReceiverType", "getExpectedReceiverType", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;)Lorg/jetbrains/kotlin/types/KotlinType;", "coerceToExpectedReceiverType", "", "kotlin-reflection"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ValueClassAwareCallerKt {
    public static final java.lang.String toJvmDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classifierDescriptor, "");
        kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getClassId(classifierDescriptor);
        kotlin.jvm.internal.Intrinsics.checkNotNull(classId);
        return kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite.mapClass(classId.asString());
    }

    private static final java.util.List<java.lang.String> getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType) {
        java.util.ArrayList listOf;
        if (!kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.needsMfvcFlattening(simpleType)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = simpleType.getConstructor().mo23898getDeclarationDescriptor();
        kotlin.jvm.internal.Intrinsics.checkNotNull(mo23898getDeclarationDescriptor, "");
        kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation<kotlin.reflect.jvm.internal.impl.types.SimpleType> multiFieldValueClassRepresentation = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getMultiFieldValueClassRepresentation((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) mo23898getDeclarationDescriptor);
        kotlin.jvm.internal.Intrinsics.checkNotNull(multiFieldValueClassRepresentation);
        java.util.List<kotlin.Pair<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.types.SimpleType>> underlyingPropertyNamesToTypes = multiFieldValueClassRepresentation.getUnderlyingPropertyNamesToTypes();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = underlyingPropertyNamesToTypes.iterator();
        while (it.hasNext()) {
            kotlin.Pair pair = (kotlin.Pair) it.next();
            kotlin.reflect.jvm.internal.impl.name.Name name2 = (kotlin.reflect.jvm.internal.impl.name.Name) pair.component1();
            java.util.List<java.lang.String> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges((kotlin.reflect.jvm.internal.impl.types.SimpleType) pair.component2());
            if (highSpeedVideoFpsRanges == null) {
                listOf = kotlin.collections.CollectionsKt.listOf(name2.getIdentifier());
            } else {
                java.util.List<java.lang.String> list = highSpeedVideoFpsRanges;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                for (java.lang.String str : list) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(name2.getIdentifier());
                    sb.append('-');
                    sb.append(str);
                    arrayList2.add(sb.toString());
                }
                listOf = arrayList2;
            }
            kotlin.collections.CollectionsKt.addAll(arrayList, listOf);
        }
        return arrayList;
    }

    public static final java.util.List<java.lang.reflect.Method> getMfvcUnboxMethods(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleType, "");
        java.util.List<java.lang.String> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt.asSimpleType(simpleType));
        if (highSpeedVideoFpsRanges == null) {
            return null;
        }
        java.util.List<java.lang.String> list = highSpeedVideoFpsRanges;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-".concat(java.lang.String.valueOf((java.lang.String) it.next())));
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = simpleType.getConstructor().mo23898getDeclarationDescriptor();
        kotlin.jvm.internal.Intrinsics.checkNotNull(mo23898getDeclarationDescriptor, "");
        java.lang.Class<?> javaClass = kotlin.reflect.jvm.internal.UtilKt.toJavaClass((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) mo23898getDeclarationDescriptor);
        kotlin.jvm.internal.Intrinsics.checkNotNull(javaClass);
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        java.util.Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(javaClass.getDeclaredMethod((java.lang.String) it2.next(), new java.lang.Class[0]));
        }
        return arrayList3;
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.calls.Caller createValueClassAwareCallerIfNeeded$default(kotlin.reflect.jvm.internal.calls.Caller caller, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return createValueClassAwareCallerIfNeeded(caller, callableMemberDescriptor, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends java.lang.reflect.Member> kotlin.reflect.jvm.internal.calls.Caller<M> createValueClassAwareCallerIfNeeded(kotlin.reflect.jvm.internal.calls.Caller<? extends M> caller, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, boolean z) {
        kotlin.reflect.jvm.internal.impl.types.KotlinType highSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(caller, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        if (!kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isGetterOfUnderlyingPropertyOfValueClass(callableMemberDescriptor)) {
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> contextReceiverParameters = callableMemberDescriptor.getContextReceiverParameters();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contextReceiverParameters, "");
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> list = contextReceiverParameters;
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    kotlin.reflect.jvm.internal.impl.types.KotlinType type = ((kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor) it.next()).getType();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
                    if (kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isValueClassType(type)) {
                        break;
                    }
                }
            }
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = callableMemberDescriptor.getValueParameters();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters, "");
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list2 = valueParameters;
            if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                java.util.Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    kotlin.reflect.jvm.internal.impl.types.KotlinType type2 = ((kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) it2.next()).getType();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type2, "");
                    if (kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isValueClassType(type2)) {
                        break;
                    }
                }
            }
            kotlin.reflect.jvm.internal.impl.types.KotlinType returnType = callableMemberDescriptor.getReturnType();
            if ((returnType == null || !kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isInlineClassType(returnType)) && ((highSpeedVideoSizes = getHighSpeedVideoSizes(callableMemberDescriptor)) == null || !kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isValueClassType(highSpeedVideoSizes))) {
                return caller;
            }
        }
        return new kotlin.reflect.jvm.internal.calls.ValueClassAwareCaller(callableMemberDescriptor, caller, z);
    }

    public static final java.lang.reflect.Method getInlineClassUnboxMethod(java.lang.Class<?> cls, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        try {
            java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("unbox-impl", new java.lang.Class[0]);
            kotlin.jvm.internal.Intrinsics.checkNotNull(declaredMethod);
            return declaredMethod;
        } catch (java.lang.NoSuchMethodException unused) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("No unbox method found in inline class: ");
            sb.append(cls);
            sb.append(" (calling ");
            sb.append(callableMemberDescriptor);
            sb.append(')');
            throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError(sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.reflect.Method getHighSpeedVideoFpsRangesFor(java.lang.Class<?> cls, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        try {
            java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("box-impl", getInlineClassUnboxMethod(cls, callableMemberDescriptor).getReturnType());
            kotlin.jvm.internal.Intrinsics.checkNotNull(declaredMethod);
            return declaredMethod;
        } catch (java.lang.NoSuchMethodException unused) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("No box method found in inline class: ");
            sb.append(cls);
            sb.append(" (calling ");
            sb.append(callableMemberDescriptor);
            sb.append(')');
            throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError(sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Class<?> Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.reflect.jvm.internal.impl.types.KotlinType unsubstitutedUnderlyingType;
        java.lang.Class<?> inlineClass = toInlineClass(kotlinType.getConstructor().mo23898getDeclarationDescriptor());
        if (inlineClass == null) {
            return null;
        }
        if (kotlin.reflect.jvm.internal.impl.types.TypeUtils.isNullableType(kotlinType) && ((unsubstitutedUnderlyingType = kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.unsubstitutedUnderlyingType(kotlinType)) == null || kotlin.reflect.jvm.internal.impl.types.TypeUtils.isNullableType(unsubstitutedUnderlyingType) || kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isPrimitiveType(unsubstitutedUnderlyingType))) {
            return null;
        }
        return inlineClass;
    }

    public static final java.lang.Class<?> toInlineClass(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        if (!(declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) || !kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isInlineClass(declarationDescriptor)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) declarationDescriptor;
        java.lang.Class<?> javaClass = kotlin.reflect.jvm.internal.UtilKt.toJavaClass(classDescriptor);
        if (javaClass != null) {
            return javaClass;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Class object for the class ");
        sb.append(classDescriptor.getName());
        sb.append(" cannot be found (classId=");
        sb.append(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getClassId((kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor) declarationDescriptor));
        sb.append(')');
        throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError(sb.toString());
    }

    private static final kotlin.reflect.jvm.internal.impl.types.KotlinType getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor extensionReceiverParameter = callableMemberDescriptor.getExtensionReceiverParameter();
        kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor dispatchReceiverParameter = callableMemberDescriptor.getDispatchReceiverParameter();
        if (extensionReceiverParameter != null) {
            return extensionReceiverParameter.getType();
        }
        if (dispatchReceiverParameter == null) {
            return null;
        }
        if (callableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor) {
            return dispatchReceiverParameter.getType();
        }
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = callableMemberDescriptor.getContainingDeclaration();
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration : null;
        return classDescriptor != null ? classDescriptor.getDefaultType() : null;
    }

    public static final java.lang.Object coerceToExpectedReceiverType(java.lang.Object obj, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.reflect.jvm.internal.impl.types.KotlinType highSpeedVideoSizes;
        java.lang.Class<?> Camera2StreamConfigurationMap;
        java.lang.reflect.Method inlineClassUnboxMethod;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        return (((callableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) && kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isUnderlyingPropertyOfInlineClass((kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor) callableMemberDescriptor)) || (highSpeedVideoSizes = getHighSpeedVideoSizes(callableMemberDescriptor)) == null || (Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(highSpeedVideoSizes)) == null || (inlineClassUnboxMethod = getInlineClassUnboxMethod(Camera2StreamConfigurationMap, callableMemberDescriptor)) == null) ? obj : inlineClassUnboxMethod.invoke(obj, new java.lang.Object[0]);
    }

    public static final /* synthetic */ void access$checkParametersSize(kotlin.reflect.jvm.internal.calls.Caller caller, int i, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, boolean z) {
        if (kotlin.reflect.jvm.internal.calls.CallerKt.getArity(caller) == i) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Inconsistent number of parameters in the descriptor and Java reflection object: ");
        sb.append(kotlin.reflect.jvm.internal.calls.CallerKt.getArity(caller));
        sb.append(" != ");
        sb.append(i);
        sb.append("\nCalling: ");
        sb.append(callableMemberDescriptor);
        sb.append("\nParameter types: ");
        sb.append(caller.getParameterTypes());
        sb.append(")\nDefault: ");
        sb.append(z);
        throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError(sb.toString());
    }

    public static final /* synthetic */ java.util.List access$getValueClassUnboxMethods(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        java.lang.reflect.Method inlineClassUnboxMethod;
        java.util.List<java.lang.reflect.Method> mfvcUnboxMethods = getMfvcUnboxMethods(simpleType);
        if (mfvcUnboxMethods != null) {
            return mfvcUnboxMethods;
        }
        java.lang.Class<?> Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(simpleType);
        if (Camera2StreamConfigurationMap == null || (inlineClassUnboxMethod = getInlineClassUnboxMethod(Camera2StreamConfigurationMap, callableMemberDescriptor)) == null) {
            return null;
        }
        return kotlin.collections.CollectionsKt.listOf(inlineClassUnboxMethod);
    }

    public static final /* synthetic */ java.util.List access$makeKotlinParameterTypes(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, java.lang.reflect.Member member, kotlin.jvm.functions.Function1 function1) {
        java.lang.Class<?> declaringClass;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor extensionReceiverParameter = callableMemberDescriptor.getExtensionReceiverParameter();
        kotlin.reflect.jvm.internal.impl.types.KotlinType type = extensionReceiverParameter != null ? extensionReceiverParameter.getType() : null;
        if (type != null) {
            arrayList.add(type);
        } else if (callableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor constructedClass = ((kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor) callableMemberDescriptor).getConstructedClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constructedClass, "");
            if (constructedClass.isInner()) {
                kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = constructedClass.getContainingDeclaration();
                kotlin.jvm.internal.Intrinsics.checkNotNull(containingDeclaration, "");
                arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration).getDefaultType());
            }
        } else {
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration2 = callableMemberDescriptor.getContainingDeclaration();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(containingDeclaration2, "");
            if ((containingDeclaration2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) && ((java.lang.Boolean) function1.invoke(containingDeclaration2)).booleanValue()) {
                if (member != null && (declaringClass = member.getDeclaringClass()) != null && (!kotlin.jvm.JvmClassMappingKt.getKotlinClass(declaringClass).isValue())) {
                    kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = ((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration2).getDefaultType();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultType, "");
                    arrayList.add(kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.makeNullable(defaultType));
                } else {
                    arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration2).getDefaultType());
                }
            }
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = callableMemberDescriptor.getValueParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters, "");
        java.util.ArrayList arrayList2 = arrayList;
        java.util.Iterator<T> it = valueParameters.iterator();
        while (it.hasNext()) {
            arrayList2.add(((kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) it.next()).getType());
        }
        return arrayList;
    }
}
