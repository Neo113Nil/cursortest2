package kotlin.reflect.jvm.internal.types;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\u0007"}, d2 = {"Lkotlin/reflect/KType;", "lowerBound", "upperBound", "createPlatformKType", "(Lkotlin/reflect/KType;Lkotlin/reflect/KType;)Lkotlin/reflect/KType;", "type", "createMutableCollectionKType", "(Lkotlin/reflect/KType;)Lkotlin/reflect/KType;", "createNothingType"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TypeOfImplKt {
    public static final kotlin.reflect.KType createPlatformKType(kotlin.reflect.KType kType, kotlin.reflect.KType kType2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kType2, "");
        if (kotlin.reflect.jvm.internal.SystemPropertiesKt.getUseK1Implementation()) {
            kotlin.reflect.jvm.internal.impl.types.KotlinType getHighResolutionOutputSizeshNQ4ISI = ((kotlin.reflect.jvm.internal.types.DescriptorKType) kType).getGetHighResolutionOutputSizeshNQ4ISI();
            kotlin.jvm.internal.Intrinsics.checkNotNull(getHighResolutionOutputSizeshNQ4ISI, "");
            kotlin.reflect.jvm.internal.impl.types.KotlinType getHighResolutionOutputSizeshNQ4ISI2 = ((kotlin.reflect.jvm.internal.types.DescriptorKType) kType2).getGetHighResolutionOutputSizeshNQ4ISI();
            kotlin.jvm.internal.Intrinsics.checkNotNull(getHighResolutionOutputSizeshNQ4ISI2, "");
            return new kotlin.reflect.jvm.internal.types.DescriptorKType(kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType((kotlin.reflect.jvm.internal.impl.types.SimpleType) getHighResolutionOutputSizeshNQ4ISI, (kotlin.reflect.jvm.internal.impl.types.SimpleType) getHighResolutionOutputSizeshNQ4ISI2), null, 2, null);
        }
        return kotlin.reflect.jvm.internal.types.FlexibleKType.Companion.create$default(kotlin.reflect.jvm.internal.types.FlexibleKType.INSTANCE, (kotlin.reflect.jvm.internal.types.AbstractKType) kType, (kotlin.reflect.jvm.internal.types.AbstractKType) kType2, false, null, 8, null);
    }

    public static final kotlin.reflect.KType createMutableCollectionKType(kotlin.reflect.KType kType) {
        java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kType, "");
        if (kotlin.reflect.jvm.internal.SystemPropertiesKt.getUseK1Implementation()) {
            kotlin.reflect.jvm.internal.impl.types.KotlinType getHighResolutionOutputSizeshNQ4ISI2 = ((kotlin.reflect.jvm.internal.types.DescriptorKType) kType).getGetHighResolutionOutputSizeshNQ4ISI();
            if (!(getHighResolutionOutputSizeshNQ4ISI2 instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType)) {
                throw new java.lang.IllegalArgumentException("Non-simple type cannot be a mutable collection type: ".concat(java.lang.String.valueOf(kType)).toString());
            }
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = getHighResolutionOutputSizeshNQ4ISI2.getConstructor().mo23898getDeclarationDescriptor();
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) mo23898getDeclarationDescriptor : null;
            if (classDescriptor == null) {
                throw new java.lang.IllegalArgumentException("Non-class type cannot be a mutable collection type: ".concat(java.lang.String.valueOf(kType)));
            }
            kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType = (kotlin.reflect.jvm.internal.impl.types.SimpleType) getHighResolutionOutputSizeshNQ4ISI2;
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor2 = classDescriptor;
            kotlin.reflect.jvm.internal.impl.name.FqName readOnlyToMutable = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.INSTANCE.readOnlyToMutable(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameUnsafe(classDescriptor2));
            if (readOnlyToMutable == null) {
                throw new java.lang.IllegalArgumentException("Not a readonly collection: ".concat(java.lang.String.valueOf(classDescriptor)));
            }
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor builtInClassByFqName = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getBuiltIns(classDescriptor2).getBuiltInClassByFqName(readOnlyToMutable);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builtInClassByFqName, "");
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = builtInClassByFqName.getTypeConstructor();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeConstructor, "");
            return new kotlin.reflect.jvm.internal.types.DescriptorKType(kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleType$default(simpleType, (kotlin.reflect.jvm.internal.impl.types.TypeAttributes) null, typeConstructor, (java.util.List) null, false, 26, (java.lang.Object) null), null, 2, null);
        }
        kotlin.reflect.jvm.internal.types.SimpleKType simpleKType = (kotlin.reflect.jvm.internal.types.SimpleKType) kType;
        kotlin.reflect.KClassifier classifier = simpleKType.getClassifier();
        kotlin.reflect.KClass kClass = classifier instanceof kotlin.reflect.KClass ? (kotlin.reflect.KClass) classifier : null;
        if (kClass == null || (getHighResolutionOutputSizeshNQ4ISI = kClass.getGetHighResolutionOutputSizeshNQ4ISI()) == null) {
            throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("Non-class type cannot be a mutable collection type: ".concat(java.lang.String.valueOf(kType)));
        }
        kotlin.reflect.jvm.internal.impl.name.FqName readOnlyToMutable2 = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.INSTANCE.readOnlyToMutable(new kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe(getHighResolutionOutputSizeshNQ4ISI));
        if (readOnlyToMutable2 == null) {
            throw new java.lang.IllegalArgumentException("Not a readonly collection: ".concat(java.lang.String.valueOf(kType)));
        }
        return new kotlin.reflect.jvm.internal.types.SimpleKType(simpleKType.getClassifier(), simpleKType.getArguments(), simpleKType.getIsMarkedNullable(), simpleKType.getAnnotations(), simpleKType.getAbbreviation(), simpleKType.getIsDefinitelyNotNullType(), simpleKType.getIsNothingType(), simpleKType.getIsSuspendFunctionType(), kotlin.reflect.jvm.internal.types.MutableCollectionKClassKt.getMutableCollectionKClass(readOnlyToMutable2, (kotlin.reflect.KClass) classifier), null, 512, null);
    }

    public static final kotlin.reflect.KType createNothingType(kotlin.reflect.KType kType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kType, "");
        if (kotlin.reflect.jvm.internal.SystemPropertiesKt.getUseK1Implementation()) {
            kotlin.reflect.jvm.internal.impl.types.KotlinType getHighResolutionOutputSizeshNQ4ISI = ((kotlin.reflect.jvm.internal.types.DescriptorKType) kType).getGetHighResolutionOutputSizeshNQ4ISI();
            if (!(getHighResolutionOutputSizeshNQ4ISI instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType)) {
                throw new java.lang.IllegalArgumentException("Non-simple type cannot be a Nothing type: ".concat(java.lang.String.valueOf(kType)).toString());
            }
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.getBuiltIns(getHighResolutionOutputSizeshNQ4ISI).getNothing().getTypeConstructor();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeConstructor, "");
            return new kotlin.reflect.jvm.internal.types.DescriptorKType(kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleType$default((kotlin.reflect.jvm.internal.impl.types.SimpleType) getHighResolutionOutputSizeshNQ4ISI, (kotlin.reflect.jvm.internal.impl.types.TypeAttributes) null, typeConstructor, (java.util.List) null, false, 26, (java.lang.Object) null), null, 2, null);
        }
        kotlin.reflect.jvm.internal.types.SimpleKType simpleKType = (kotlin.reflect.jvm.internal.types.SimpleKType) kType;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(simpleKType.getClassifier(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Void.class))) {
            throw new java.lang.IllegalArgumentException("Nothing type's classifier must be Void::class: ".concat(java.lang.String.valueOf(kType)).toString());
        }
        return new kotlin.reflect.jvm.internal.types.SimpleKType(simpleKType.getClassifier(), simpleKType.getArguments(), simpleKType.getIsMarkedNullable(), simpleKType.getAnnotations(), simpleKType.getAbbreviation(), simpleKType.getIsDefinitelyNotNullType(), true, simpleKType.getIsSuspendFunctionType(), simpleKType.getMutableCollectionClass(), null, 512, null);
    }
}
