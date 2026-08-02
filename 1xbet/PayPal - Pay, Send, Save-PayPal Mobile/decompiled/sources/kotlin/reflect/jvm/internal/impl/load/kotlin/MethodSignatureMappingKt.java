package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* loaded from: classes5.dex */
public final class MethodSignatureMappingKt {
    public static final java.lang.String computeJvmDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor, boolean z, boolean z2) {
        java.lang.String asString;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionDescriptor, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (z2) {
            if (functionDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor) {
                asString = "<init>";
            } else {
                asString = functionDescriptor.getName().asString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
            }
            sb.append(asString);
        }
        sb.append("(");
        kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor extensionReceiverParameter = functionDescriptor.getExtensionReceiverParameter();
        if (extensionReceiverParameter != null) {
            kotlin.reflect.jvm.internal.impl.types.KotlinType type = extensionReceiverParameter.getType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
            sb.append(mapToJvmType(type));
        }
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> it = functionDescriptor.getValueParameters().iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.types.KotlinType type2 = it.next().getType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type2, "");
            sb.append(mapToJvmType(type2));
        }
        sb.append(")");
        if (z) {
            if (kotlin.reflect.jvm.internal.impl.load.kotlin.DescriptorBasedTypeSignatureMappingKt.hasVoidReturnType(functionDescriptor)) {
                sb.append("V");
            } else {
                kotlin.reflect.jvm.internal.impl.types.KotlinType returnType = functionDescriptor.getReturnType();
                kotlin.jvm.internal.Intrinsics.checkNotNull(returnType);
                sb.append(mapToJvmType(returnType));
            }
        }
        return sb.toString();
    }

    public static /* synthetic */ java.lang.String computeJvmDescriptor$default(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return computeJvmDescriptor(functionDescriptor, z, z2);
    }

    public static final boolean forceSingleValueParameterBoxing(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor overriddenBuiltinFunctionWithErasedValueParametersInJava;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableDescriptor, "");
        if (!(callableDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) callableDescriptor;
        if (kotlin.jvm.internal.Intrinsics.areEqual(functionDescriptor.getName().asString(), "remove") && functionDescriptor.getValueParameters().size() == 1 && !kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.isFromJavaOrBuiltins((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) callableDescriptor)) {
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = functionDescriptor.getOriginal().getValueParameters();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters, "");
            kotlin.reflect.jvm.internal.impl.types.KotlinType type = ((kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) kotlin.collections.CollectionsKt.single((java.util.List) valueParameters)).getType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
            kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType mapToJvmType = mapToJvmType(type);
            kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive primitive = mapToJvmType instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive ? (kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive) mapToJvmType : null;
            if ((primitive != null ? primitive.getJvmPrimitiveType() : null) != kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.INT || (overriddenBuiltinFunctionWithErasedValueParametersInJava = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(functionDescriptor)) == null) {
                return false;
            }
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters2 = overriddenBuiltinFunctionWithErasedValueParametersInJava.getOriginal().getValueParameters();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters2, "");
            kotlin.reflect.jvm.internal.impl.types.KotlinType type2 = ((kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) kotlin.collections.CollectionsKt.single((java.util.List) valueParameters2)).getType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type2, "");
            kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType mapToJvmType2 = mapToJvmType(type2);
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = overriddenBuiltinFunctionWithErasedValueParametersInJava.getContainingDeclaration();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(containingDeclaration, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameUnsafe(containingDeclaration), kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.mutableCollection.toUnsafe()) && (mapToJvmType2 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Object) && kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Object) mapToJvmType2).getInternalName(), "java/lang/Object")) {
                return true;
            }
        }
        return false;
    }

    public static final java.lang.String getInternalName(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        kotlin.reflect.jvm.internal.impl.name.ClassId mapKotlinToJava = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(classDescriptor).toUnsafe());
        if (mapKotlinToJava != null) {
            java.lang.String internalNameByClassId = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName.internalNameByClassId(mapKotlinToJava);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(internalNameByClassId, "");
            return internalNameByClassId;
        }
        return kotlin.reflect.jvm.internal.impl.load.kotlin.DescriptorBasedTypeSignatureMappingKt.computeInternalName$default(classDescriptor, null, 2, null);
    }

    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType mapToJvmType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        return (kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType) kotlin.reflect.jvm.internal.impl.load.kotlin.DescriptorBasedTypeSignatureMappingKt.mapType$default(kotlinType, kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactoryImpl.getHighSpeedVideoFpsRanges, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode.DEFAULT, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfigurationImpl.INSTANCE, null, null, 32, null);
    }

    public static final java.lang.String computeJvmSignature(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableDescriptor, "");
        kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents signatureBuildingComponents = kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE;
        if (kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isLocal(callableDescriptor)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = callableDescriptor.getContainingDeclaration();
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration : null;
        if (classDescriptor == null || classDescriptor.getName().isSpecial()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor original = callableDescriptor.getOriginal();
        kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor = original instanceof kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) original : null;
        if (simpleFunctionDescriptor == null) {
            return null;
        }
        return kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureBuildingUtilsKt.signature(signatureBuildingComponents, classDescriptor, computeJvmDescriptor$default(simpleFunctionDescriptor, false, false, 3, null));
    }
}
