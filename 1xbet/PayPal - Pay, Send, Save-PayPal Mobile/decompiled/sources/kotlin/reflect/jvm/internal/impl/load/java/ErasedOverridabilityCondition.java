package kotlin.reflect.jvm.internal.impl.load.java;

/* loaded from: classes17.dex */
public final class ErasedOverridabilityCondition implements kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public final kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result isOverridable(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor2, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableDescriptor2, "");
        if (callableDescriptor2 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor) {
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor javaMethodDescriptor = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor) callableDescriptor2;
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameters = javaMethodDescriptor.getTypeParameters();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeParameters, "");
            if (typeParameters.isEmpty()) {
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo basicOverridabilityProblem = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.getBasicOverridabilityProblem(callableDescriptor, callableDescriptor2);
                if ((basicOverridabilityProblem != null ? basicOverridabilityProblem.getResult() : null) != null) {
                    return kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = javaMethodDescriptor.getValueParameters();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters, "");
                kotlin.sequences.Sequence map = kotlin.sequences.SequencesKt.map(kotlin.collections.CollectionsKt.asSequence(valueParameters), new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.ErasedOverridabilityCondition$$Lambda$0
                    @Override // kotlin.jvm.functions.Function1
                    public java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.reflect.jvm.internal.impl.types.KotlinType type;
                        type = ((kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) obj).getType();
                        return type;
                    }
                });
                kotlin.reflect.jvm.internal.impl.types.KotlinType returnType = javaMethodDescriptor.getReturnType();
                kotlin.jvm.internal.Intrinsics.checkNotNull(returnType);
                kotlin.sequences.Sequence plus = kotlin.sequences.SequencesKt.plus((kotlin.sequences.Sequence<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType>) map, returnType);
                kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor extensionReceiverParameter = javaMethodDescriptor.getExtensionReceiverParameter();
                for (kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType : kotlin.sequences.SequencesKt.plus(plus, (java.lang.Iterable) kotlin.collections.CollectionsKt.listOfNotNull(extensionReceiverParameter != null ? extensionReceiverParameter.getType() : null))) {
                    if (!kotlinType.getArguments().isEmpty() && !(kotlinType.unwrap() instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl)) {
                        return kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN;
                    }
                }
                kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor substitute = callableDescriptor.substitute(new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution(null, 1, null).buildSubstitutor());
                if (substitute == null) {
                    return kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                if (substitute instanceof kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) {
                    kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) substitute;
                    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameters2 = simpleFunctionDescriptor.getTypeParameters();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeParameters2, "");
                    if (!typeParameters2.isEmpty()) {
                        kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor build = simpleFunctionDescriptor.newCopyBuilder().setTypeParameters(kotlin.collections.CollectionsKt.emptyList()).build();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(build);
                        substitute = build;
                    }
                }
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result result = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.DEFAULT.isOverridableByWithoutExternalConditions(substitute, callableDescriptor2, false).getResult();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(result, "");
                if (kotlin.reflect.jvm.internal.impl.load.java.ErasedOverridabilityCondition.WhenMappings.$EnumSwitchMapping$0[result.ordinal()] == 1) {
                    return kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.OVERRIDABLE;
                }
                return kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN;
            }
        }
        return kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public final kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract getContract() {
        return kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract.SUCCESS_ONLY;
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.values().length];
            try {
                iArr[kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
