package kotlin.reflect.jvm.internal.impl.load.java;

/* loaded from: classes5.dex */
public final class BuiltinMethodsWithSpecialGenericSignature extends kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures {
    public static final kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature INSTANCE = new kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature();

    private BuiltinMethodsWithSpecialGenericSignature() {
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor getOverriddenBuiltinFunctionWithErasedValueParametersInJava(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionDescriptor, "");
        kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = INSTANCE;
        kotlin.reflect.jvm.internal.impl.name.Name name2 = functionDescriptor.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        if (builtinMethodsWithSpecialGenericSignature.getSameAsBuiltinMethodWithErasedValueParameters(name2)) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.firstOverridden$default(functionDescriptor, false, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature$$Lambda$0
                @Override // kotlin.jvm.functions.Function1
                public java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.getHighSpeedVideoFpsRangesFor((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) obj));
                }
            }, 1, null);
        }
        return null;
    }

    public final boolean getSameAsBuiltinMethodWithErasedValueParameters(kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.getERASED_VALUE_PARAMETERS_SHORT_NAMES().contains(name2);
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo getSpecialSignatureInfo(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor firstOverridden$default;
        java.lang.String computeJvmSignature;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        if (!kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.getERASED_VALUE_PARAMETERS_SHORT_NAMES().contains(callableMemberDescriptor.getName()) || (firstOverridden$default = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.firstOverridden$default(callableMemberDescriptor, false, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature$$Lambda$2
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.getHighResolutionOutputSizeshNQ4ISI((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) obj));
            }
        }, 1, null)) == null || (computeJvmSignature = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmSignature(firstOverridden$default)) == null) {
            return null;
        }
        return kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.getSpecialSignatureInfo(computeJvmSignature);
    }

    static /* synthetic */ boolean getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        return kotlin.collections.CollectionsKt.contains(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.getERASED_VALUE_PARAMETERS_SIGNATURES(), kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmSignature(callableMemberDescriptor));
    }

    static /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        return (callableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) && kotlin.collections.CollectionsKt.contains(kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.getERASED_VALUE_PARAMETERS_SIGNATURES(), kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmSignature(callableMemberDescriptor));
    }
}
