package kotlin.reflect.jvm.internal.impl.resolve;

/* loaded from: classes5.dex */
public final class InlineClassesUtilsKt {
    private static final kotlin.reflect.jvm.internal.impl.name.ClassId Camera2StreamConfigurationMap;
    private static final kotlin.reflect.jvm.internal.impl.name.FqName getHighSpeedVideoFpsRanges;
    private static final kotlin.reflect.jvm.internal.impl.name.FqName getHighSpeedVideoSizes;

    static {
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.jvm.JvmInline");
        getHighSpeedVideoSizes = fqName;
        Camera2StreamConfigurationMap = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.topLevel(fqName);
        getHighSpeedVideoFpsRanges = new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.jvm.JvmName");
    }

    public static final boolean isInlineClass(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
        return (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) && (((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) declarationDescriptor).getValueClassRepresentation() instanceof kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation);
    }

    public static final boolean isMultiFieldValueClass(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
        return (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) && (((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) declarationDescriptor).getValueClassRepresentation() instanceof kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation);
    }

    public static final boolean isValueClass(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
        return isInlineClass(declarationDescriptor) || isMultiFieldValueClass(declarationDescriptor);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType unsubstitutedUnderlyingType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation<kotlin.reflect.jvm.internal.impl.types.SimpleType> inlineClassRepresentation;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = kotlinType.getConstructor().mo23898getDeclarationDescriptor();
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType = null;
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) mo23898getDeclarationDescriptor : null;
        if (classDescriptor != null && (inlineClassRepresentation = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getInlineClassRepresentation(classDescriptor)) != null) {
            simpleType = inlineClassRepresentation.getUnderlyingType();
        }
        return simpleType;
    }

    public static final boolean isInlineClassType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = kotlinType.getConstructor().mo23898getDeclarationDescriptor();
        if (mo23898getDeclarationDescriptor != null) {
            return isInlineClass(mo23898getDeclarationDescriptor);
        }
        return false;
    }

    public static final boolean isValueClassType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = kotlinType.getConstructor().mo23898getDeclarationDescriptor();
        if (mo23898getDeclarationDescriptor != null) {
            return isValueClass(mo23898getDeclarationDescriptor);
        }
        return false;
    }

    public static final boolean needsMfvcFlattening(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = kotlinType.getConstructor().mo23898getDeclarationDescriptor();
        return (mo23898getDeclarationDescriptor == null || !isMultiFieldValueClass(mo23898getDeclarationDescriptor) || kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext.INSTANCE.isNullableType(kotlinType)) ? false : true;
    }

    public static final boolean isGetterOfUnderlyingPropertyOfValueClass(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableDescriptor, "");
        if (!(callableDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor correspondingProperty = ((kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor) callableDescriptor).getCorrespondingProperty();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(correspondingProperty, "");
        return isUnderlyingPropertyOfValueClass(correspondingProperty);
    }

    public static final boolean isUnderlyingPropertyOfInlineClass(kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor variableDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation<kotlin.reflect.jvm.internal.impl.types.SimpleType> inlineClassRepresentation;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variableDescriptor, "");
        if (variableDescriptor.getExtensionReceiverParameter() != null) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = variableDescriptor.getContainingDeclaration();
        kotlin.reflect.jvm.internal.impl.name.Name name2 = null;
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration : null;
        if (classDescriptor != null && (inlineClassRepresentation = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getInlineClassRepresentation(classDescriptor)) != null) {
            name2 = inlineClassRepresentation.getUnderlyingPropertyName();
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(name2, variableDescriptor.getName());
    }

    public static final boolean isUnderlyingPropertyOfValueClass(kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor variableDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation<kotlin.reflect.jvm.internal.impl.types.SimpleType> valueClassRepresentation;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variableDescriptor, "");
        if (variableDescriptor.getExtensionReceiverParameter() != null) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = variableDescriptor.getContainingDeclaration();
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration : null;
        if (classDescriptor == null || (valueClassRepresentation = classDescriptor.getValueClassRepresentation()) == null) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.name.Name name2 = variableDescriptor.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        return valueClassRepresentation.containsPropertyWithName(name2);
    }
}
