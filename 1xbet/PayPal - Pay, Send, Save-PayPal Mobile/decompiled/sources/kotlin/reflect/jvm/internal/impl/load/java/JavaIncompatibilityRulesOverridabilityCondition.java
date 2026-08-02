package kotlin.reflect.jvm.internal.impl.load.java;

/* loaded from: classes5.dex */
public final class JavaIncompatibilityRulesOverridabilityCondition implements kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition {
    public static final kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition.Companion Companion = new kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition.Companion(null);

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public final kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract getContract() {
        return kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY;
    }

    public static final class Companion {
        private Companion() {
        }

        public final boolean doesJavaOverrideHaveIncompatibleValueParameterKinds(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableDescriptor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableDescriptor2, "");
            if (!(callableDescriptor2 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor) || !(callableDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor)) {
                return false;
            }
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor javaMethodDescriptor = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor) callableDescriptor2;
            javaMethodDescriptor.getValueParameters().size();
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) callableDescriptor;
            functionDescriptor.getValueParameters().size();
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = javaMethodDescriptor.getOriginal().getValueParameters();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters, "");
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters2 = functionDescriptor.getOriginal().getValueParameters();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters2, "");
            for (kotlin.Pair pair : kotlin.collections.CollectionsKt.zip(valueParameters, valueParameters2)) {
                kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) pair.component1();
                kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor2 = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) pair.component2();
                kotlin.jvm.internal.Intrinsics.checkNotNull(valueParameterDescriptor);
                boolean z = getHighSpeedVideoFpsRanges((kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) callableDescriptor2, valueParameterDescriptor) instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive;
                kotlin.jvm.internal.Intrinsics.checkNotNull(valueParameterDescriptor2);
                if (z != (getHighSpeedVideoFpsRanges(functionDescriptor, valueParameterDescriptor2) instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(r0), kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(r3)) != false) goto L22;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor) {
            if (!kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.forceSingleValueParameterBoxing(functionDescriptor)) {
                if (functionDescriptor.getValueParameters().size() == 1) {
                    kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = functionDescriptor.getContainingDeclaration();
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration : null;
                    if (classDescriptor != null) {
                        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = functionDescriptor.getValueParameters();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters, "");
                        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = ((kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) kotlin.collections.CollectionsKt.single((java.util.List) valueParameters)).getType().getConstructor().mo23898getDeclarationDescriptor();
                        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor2 = mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) mo23898getDeclarationDescriptor : null;
                        if (classDescriptor2 != null) {
                            if (kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isPrimitiveClass(classDescriptor)) {
                            }
                        }
                    }
                }
                kotlin.reflect.jvm.internal.impl.types.KotlinType type = valueParameterDescriptor.getType();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
                return kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.mapToJvmType(type);
            }
            kotlin.reflect.jvm.internal.impl.types.KotlinType type2 = valueParameterDescriptor.getType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type2, "");
            return kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.mapToJvmType(kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.makeNullable(type2));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if (r1.getSameAsRenamedInJvmBuiltin(r3) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r2, kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmDescriptor$default(r3, false, false, 2, null)) == false) goto L38;
     */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result isOverridable(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor2, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableDescriptor2, "");
        if ((callableDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) && (callableDescriptor2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) && !kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isBuiltIn(callableDescriptor2)) {
            kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.INSTANCE;
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) callableDescriptor2;
            kotlin.reflect.jvm.internal.impl.name.Name name2 = functionDescriptor.getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
            if (!builtinMethodsWithSpecialGenericSignature.getSameAsBuiltinMethodWithErasedValueParameters(name2)) {
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion companion = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion;
                kotlin.reflect.jvm.internal.impl.name.Name name3 = functionDescriptor.getName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name3, "");
            }
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor overriddenSpecialBuiltin = kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.getOverriddenSpecialBuiltin((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) callableDescriptor);
            boolean z = callableDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor2 = z ? (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) callableDescriptor : null;
            if ((functionDescriptor2 != null && functionDescriptor.isHiddenToOvercomeSignatureClash() == functionDescriptor2.isHiddenToOvercomeSignatureClash()) || (overriddenSpecialBuiltin != null && functionDescriptor.isHiddenToOvercomeSignatureClash())) {
                if ((classDescriptor instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor) && functionDescriptor.getInitialSignatureDescriptor() == null && overriddenSpecialBuiltin != null && !kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.hasRealKotlinSuperClassWithOverrideOf(classDescriptor, overriddenSpecialBuiltin)) {
                    if ((overriddenSpecialBuiltin instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) && z && kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava((kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) overriddenSpecialBuiltin) != null) {
                        java.lang.String computeJvmDescriptor$default = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmDescriptor$default(functionDescriptor, false, false, 2, null);
                        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor original = ((kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) callableDescriptor).getOriginal();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(original, "");
                    }
                }
            }
            return kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.INCOMPATIBLE;
        }
        if (Companion.doesJavaOverrideHaveIncompatibleValueParameterKinds(callableDescriptor, callableDescriptor2)) {
            return kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.INCOMPATIBLE;
        }
        return kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN;
    }
}
