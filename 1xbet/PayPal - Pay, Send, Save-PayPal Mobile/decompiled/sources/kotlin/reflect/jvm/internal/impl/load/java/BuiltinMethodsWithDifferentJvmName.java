package kotlin.reflect.jvm.internal.impl.load.java;

/* loaded from: classes5.dex */
public final class BuiltinMethodsWithDifferentJvmName extends kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures {
    public static final kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName INSTANCE = new kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName();

    private BuiltinMethodsWithDifferentJvmName() {
    }

    public final kotlin.reflect.jvm.internal.impl.name.Name getJvmName(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleFunctionDescriptor, "");
        java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.name.Name> signature_to_jvm_representation_name = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.getSIGNATURE_TO_JVM_REPRESENTATION_NAME();
        java.lang.String computeJvmSignature = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmSignature(simpleFunctionDescriptor);
        if (computeJvmSignature == null) {
            return null;
        }
        return signature_to_jvm_representation_name.get(computeJvmSignature);
    }

    public final boolean isBuiltinFunctionWithDifferentNameInJvm(final kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleFunctionDescriptor, "");
        return kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isBuiltIn(simpleFunctionDescriptor) && kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.firstOverridden$default(simpleFunctionDescriptor, false, new kotlin.jvm.functions.Function1(simpleFunctionDescriptor) { // from class: kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor Camera2StreamConfigurationMap;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName.getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap, (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) obj));
            }

            {
                this.Camera2StreamConfigurationMap = simpleFunctionDescriptor;
            }
        }, 1, null) != null;
    }

    public final boolean isRemoveAtByIndex(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleFunctionDescriptor, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(simpleFunctionDescriptor.getName().asString(), "removeAt") && kotlin.jvm.internal.Intrinsics.areEqual(kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmSignature(simpleFunctionDescriptor), kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.getREMOVE_AT_NAME_AND_SIGNATURE().getSignature());
    }

    static /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        return kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.getSIGNATURE_TO_JVM_REPRESENTATION_NAME().containsKey(kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmSignature(simpleFunctionDescriptor));
    }
}
