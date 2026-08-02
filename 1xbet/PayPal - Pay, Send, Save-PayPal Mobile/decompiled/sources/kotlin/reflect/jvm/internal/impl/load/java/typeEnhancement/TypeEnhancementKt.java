package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* loaded from: classes5.dex */
public final class TypeEnhancementKt {
    private static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getHighResolutionOutputSizeshNQ4ISI;
    private static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.EnhancedTypeAnnotations getHighSpeedVideoFpsRanges;

    public static final boolean hasEnhancedNullability(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementUtilsKt.hasEnhancedNullability(kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext.INSTANCE, kotlinType);
    }

    static {
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fqName, "");
        getHighResolutionOutputSizeshNQ4ISI = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.EnhancedTypeAnnotations(fqName);
        kotlin.reflect.jvm.internal.impl.name.FqName fqName2 = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.ENHANCED_MUTABILITY_ANNOTATION;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fqName2, "");
        getHighSpeedVideoFpsRanges = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.EnhancedTypeAnnotations(fqName2);
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getENHANCED_NULLABILITY_ANNOTATIONS() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations access$compositeAnnotationsOrSingle(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            throw new java.lang.IllegalStateException("At least one Annotations object expected".toString());
        }
        if (size == 1) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations) kotlin.collections.CollectionsKt.single(list);
        }
        return new kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations((java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations>) kotlin.collections.CollectionsKt.toList(list));
    }

    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor access$enhanceMutability(kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptor, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition typeComponentPosition) {
        kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper javaToKotlinClassMapper = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper.INSTANCE;
        if (!kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPositionKt.shouldEnhance(typeComponentPosition) || !(classifierDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor)) {
            return null;
        }
        if (javaTypeQualifiers.getMutability() == kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.READ_ONLY && typeComponentPosition == kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.FLEXIBLE_LOWER) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) classifierDescriptor;
            if (javaToKotlinClassMapper.isMutable(classDescriptor)) {
                return javaToKotlinClassMapper.convertMutableToReadOnly(classDescriptor);
            }
        }
        if (javaTypeQualifiers.getMutability() != kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.MUTABLE || typeComponentPosition != kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.FLEXIBLE_UPPER) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor2 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) classifierDescriptor;
        if (javaToKotlinClassMapper.isReadOnly(classDescriptor2)) {
            return javaToKotlinClassMapper.convertReadOnlyToMutable(classDescriptor2);
        }
        return null;
    }

    public static final /* synthetic */ java.lang.Boolean access$getEnhancedNullability(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition typeComponentPosition) {
        if (!kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPositionKt.shouldEnhance(typeComponentPosition)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier nullability = javaTypeQualifiers.getNullability();
        int i = nullability == null ? -1 : kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementKt.WhenMappings.$EnumSwitchMapping$0[nullability.ordinal()];
        if (i == 1) {
            return java.lang.Boolean.TRUE;
        }
        if (i != 2) {
            return null;
        }
        return java.lang.Boolean.FALSE;
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.values().length];
            try {
                iArr[kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
