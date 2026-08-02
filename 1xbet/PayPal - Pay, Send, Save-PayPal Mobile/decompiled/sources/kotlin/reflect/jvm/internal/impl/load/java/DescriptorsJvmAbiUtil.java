package kotlin.reflect.jvm.internal.impl.load.java;

/* loaded from: classes5.dex */
public final class DescriptorsJvmAbiUtil {
    public static boolean isPropertyWithBackingFieldInOuterClass(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor) {
        if (propertyDescriptor == null) {
            getHighResolutionOutputSizeshNQ4ISI(0);
        }
        if (propertyDescriptor.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            return false;
        }
        if (isClassCompanionObjectWithBackingFieldsInOuter(propertyDescriptor.getContainingDeclaration())) {
            return true;
        }
        return kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isCompanionObject(propertyDescriptor.getContainingDeclaration()) && hasJvmFieldAnnotation(propertyDescriptor);
    }

    public static boolean isClassCompanionObjectWithBackingFieldsInOuter(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            getHighResolutionOutputSizeshNQ4ISI(1);
        }
        return kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isCompanionObject(declarationDescriptor) && kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isClassOrEnumClass(declarationDescriptor.getContainingDeclaration()) && !isMappedIntrinsicCompanionObject((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) declarationDescriptor);
    }

    public static boolean isMappedIntrinsicCompanionObject(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            getHighResolutionOutputSizeshNQ4ISI(2);
        }
        return kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMappingUtilsKt.isMappedIntrinsicCompanionObject(kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping.INSTANCE, classDescriptor);
    }

    public static boolean hasJvmFieldAnnotation(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor backingField;
        if (callableMemberDescriptor == null) {
            getHighResolutionOutputSizeshNQ4ISI(3);
        }
        if ((callableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) && (backingField = ((kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) callableMemberDescriptor).getBackingField()) != null && backingField.getAnnotations().hasAnnotation(kotlin.reflect.jvm.internal.impl.load.java.JvmAbi.JVM_FIELD_ANNOTATION_FQ_NAME)) {
            return true;
        }
        return callableMemberDescriptor.getAnnotations().hasAnnotation(kotlin.reflect.jvm.internal.impl.load.java.JvmAbi.JVM_FIELD_ANNOTATION_FQ_NAME);
    }

    private static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(int i) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i == 1 || i == 2) {
            objArr[0] = "companionObject";
        } else if (i != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
