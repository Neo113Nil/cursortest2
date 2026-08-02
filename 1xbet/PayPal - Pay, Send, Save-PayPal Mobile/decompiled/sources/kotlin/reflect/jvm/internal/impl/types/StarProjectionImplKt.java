package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public final class StarProjectionImplKt {
    private static final kotlin.reflect.jvm.internal.impl.types.KotlinType Camera2StreamConfigurationMap(final java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeConstructor> list, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> list2, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns kotlinBuiltIns) {
        kotlin.reflect.jvm.internal.impl.types.KotlinType substitute = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.create(new kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.StarProjectionImplKt$buildStarProjectionTypeByTypeParameters$1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
            public final kotlin.reflect.jvm.internal.impl.types.TypeProjection get(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructor, "");
                if (!list.contains(typeConstructor)) {
                    return null;
                }
                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = typeConstructor.mo23898getDeclarationDescriptor();
                kotlin.jvm.internal.Intrinsics.checkNotNull(mo23898getDeclarationDescriptor, "");
                return kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeStarProjection((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) mo23898getDeclarationDescriptor);
            }
        }).substitute((kotlin.reflect.jvm.internal.impl.types.KotlinType) kotlin.collections.CollectionsKt.first((java.util.List) list2), kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE);
        if (substitute != null) {
            return substitute;
        }
        kotlin.reflect.jvm.internal.impl.types.SimpleType defaultBound = kotlinBuiltIns.getDefaultBound();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultBound, "");
        return defaultBound;
    }

    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType starProjectionType(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameterDescriptor, "");
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = typeParameterDescriptor.getContainingDeclaration();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(containingDeclaration, "");
        if (containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters) {
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters = ((kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters) containingDeclaration).getTypeConstructor().getParameters();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameters, "");
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list = parameters;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = ((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) it.next()).getTypeConstructor();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeConstructor, "");
                arrayList.add(typeConstructor);
            }
            java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperBounds, "");
            return Camera2StreamConfigurationMap(arrayList, upperBounds, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor));
        }
        if (containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) {
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameters = ((kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) containingDeclaration).getTypeParameters();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeParameters, "");
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list2 = typeParameters;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor2 = ((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) it2.next()).getTypeConstructor();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeConstructor2, "");
                arrayList2.add(typeConstructor2);
            }
            java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> upperBounds2 = typeParameterDescriptor.getUpperBounds();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperBounds2, "");
            return Camera2StreamConfigurationMap(arrayList2, upperBounds2, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor));
        }
        throw new java.lang.IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
    }
}
