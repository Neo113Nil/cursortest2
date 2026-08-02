package kotlin.reflect.jvm.internal.impl.resolve.jvm;

/* loaded from: classes5.dex */
public final class InlineClassManglingRulesKt {
    public static final boolean shouldHideConstructorDueToValueClassTypeValueParameters(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor classConstructorDescriptor = callableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor) callableMemberDescriptor : null;
        if (classConstructorDescriptor == null || kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.isPrivate(classConstructorDescriptor.getVisibility())) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor constructedClass = classConstructorDescriptor.getConstructedClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constructedClass, "");
        if (kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isValueClass(constructedClass) || kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isSealedClass(classConstructorDescriptor.getConstructedClass())) {
            return false;
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = classConstructorDescriptor.getValueParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list = valueParameters;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return false;
        }
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.types.KotlinType type = ((kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) it.next()).getType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
            if (isValueClassThatRequiresMangling(type) || getHighSpeedVideoSizes(type)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isValueClassThatRequiresMangling(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
        return kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isValueClass(declarationDescriptor) && !kotlin.jvm.internal.Intrinsics.areEqual(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) declarationDescriptor), kotlin.reflect.jvm.internal.impl.builtins.StandardNames.RESULT_FQ_NAME);
    }

    public static final boolean isValueClassThatRequiresMangling(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = kotlinType.getConstructor().mo23898getDeclarationDescriptor();
        if (mo23898getDeclarationDescriptor == null) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptor = mo23898getDeclarationDescriptor;
        return (kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isInlineClass(classifierDescriptor) && isValueClassThatRequiresMangling(classifierDescriptor)) || kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.needsMfvcFlattening(kotlinType);
    }

    private static final boolean getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = kotlinType.getConstructor().mo23898getDeclarationDescriptor();
        kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor = mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) mo23898getDeclarationDescriptor : null;
        if (typeParameterDescriptor == null) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType representativeUpperBound = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.getRepresentativeUpperBound(typeParameterDescriptor);
        return isValueClassThatRequiresMangling(representativeUpperBound) || getHighSpeedVideoSizes(representativeUpperBound);
    }
}
