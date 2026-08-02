package kotlin.reflect.jvm.internal.impl.load.java;

/* loaded from: classes5.dex */
public final class SpecialBuiltinMembers {
    public static final <T extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> T getOverriddenBuiltinWithDifferentJvmName(T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        if (!kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.getORIGINAL_SHORT_NAMES().contains(t.getName()) && !kotlin.reflect.jvm.internal.impl.load.java.BuiltinSpecialProperties.INSTANCE.getSPECIAL_SHORT_NAMES().contains(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getPropertyIfAccessor(t).getName())) {
            return null;
        }
        if ((t instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) || (t instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor)) {
            return (T) kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.firstOverridden$default(t, false, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers$$Lambda$0
                @Override // kotlin.jvm.functions.Function1
                public java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.getHighResolutionOutputSizeshNQ4ISI((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) obj));
                }
            }, 1, null);
        }
        if (t instanceof kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) {
            return (T) kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.firstOverridden$default(t, false, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers$$Lambda$1
                @Override // kotlin.jvm.functions.Function1
                public java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.getHighSpeedVideoSizes((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) obj));
                }
            }, 1, null);
        }
        return null;
    }

    public static final boolean doesOverrideBuiltinWithDifferentJvmName(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        return getOverriddenBuiltinWithDifferentJvmName(callableMemberDescriptor) != null;
    }

    public static final <T extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> T getOverriddenSpecialBuiltin(T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        T t2 = (T) getOverriddenBuiltinWithDifferentJvmName(t);
        if (t2 != null) {
            return t2;
        }
        kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.INSTANCE;
        kotlin.reflect.jvm.internal.impl.name.Name name2 = t.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        if (builtinMethodsWithSpecialGenericSignature.getSameAsBuiltinMethodWithErasedValueParameters(name2)) {
            return (T) kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.firstOverridden$default(t, false, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers$$Lambda$2
                @Override // kotlin.jvm.functions.Function1
                public java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.Camera2StreamConfigurationMap((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) obj));
                }
            }, 1, null);
        }
        return null;
    }

    public static final boolean hasRealKotlinSuperClassWithOverrideOf(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableDescriptor, "");
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = callableDescriptor.getContainingDeclaration();
        kotlin.jvm.internal.Intrinsics.checkNotNull(containingDeclaration, "");
        kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = ((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration).getDefaultType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultType, "");
        for (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor superClassDescriptor = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getSuperClassDescriptor(classDescriptor); superClassDescriptor != null; superClassDescriptor = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getSuperClassDescriptor(superClassDescriptor)) {
            if (!(superClassDescriptor instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor) && kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedure.findCorrespondingSupertype(superClassDescriptor.getDefaultType(), defaultType) != null) {
                return !kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isBuiltIn(superClassDescriptor);
            }
        }
        return false;
    }

    public static final boolean isFromJava(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        return kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getPropertyIfAccessor(callableMemberDescriptor).getContainingDeclaration() instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
    }

    public static final boolean isFromJavaOrBuiltins(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        return isFromJava(callableMemberDescriptor) || kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isBuiltIn(callableMemberDescriptor);
    }

    static /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        return kotlin.reflect.jvm.internal.impl.load.java.ClassicBuiltinSpecialProperties.INSTANCE.hasBuiltinSpecialPropertyFqName(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getPropertyIfAccessor(callableMemberDescriptor));
    }

    static /* synthetic */ boolean getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        return kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName.INSTANCE.isBuiltinFunctionWithDifferentNameInJvm((kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) callableMemberDescriptor);
    }

    static /* synthetic */ boolean Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        return kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isBuiltIn(callableMemberDescriptor) && kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.getSpecialSignatureInfo(callableMemberDescriptor) != null;
    }

    public static final java.lang.String getJvmMethodNameIfSpecial(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor propertyIfAccessor;
        kotlin.reflect.jvm.internal.impl.name.Name jvmName;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor overriddenBuiltinWithDifferentJvmName = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isBuiltIn(callableMemberDescriptor) ? getOverriddenBuiltinWithDifferentJvmName(callableMemberDescriptor) : null;
        if (overriddenBuiltinWithDifferentJvmName != null && (propertyIfAccessor = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getPropertyIfAccessor(overriddenBuiltinWithDifferentJvmName)) != null) {
            if (propertyIfAccessor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) {
                return kotlin.reflect.jvm.internal.impl.load.java.ClassicBuiltinSpecialProperties.INSTANCE.getBuiltinSpecialPropertyGetterName(propertyIfAccessor);
            }
            if ((propertyIfAccessor instanceof kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) && (jvmName = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName.INSTANCE.getJvmName((kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) propertyIfAccessor)) != null) {
                return jvmName.asString();
            }
        }
        return null;
    }
}
