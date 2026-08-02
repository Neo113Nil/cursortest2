package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes5.dex */
public final class TypeParameterUtilsKt {
    public static final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> computeConstructorTypeParameters(kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters) {
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list;
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor;
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classifierDescriptorWithTypeParameters, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> declaredTypeParameters = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredTypeParameters, "");
        if (!classifierDescriptorWithTypeParameters.isInner() && !(classifierDescriptorWithTypeParameters.getContainingDeclaration() instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor)) {
            return declaredTypeParameters;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters2 = classifierDescriptorWithTypeParameters;
        java.util.List list2 = kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.flatMap(kotlin.sequences.SequencesKt.filter(kotlin.sequences.SequencesKt.takeWhile(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getParents(classifierDescriptorWithTypeParameters2), new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt$$Lambda$0
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt.getHighSpeedVideoSizes((kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor) obj));
            }
        }), new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt$$Lambda$1
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt.getHighSpeedVideoFpsRanges((kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor) obj));
            }
        }), new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt$$Lambda$2
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt.Camera2StreamConfigurationMap((kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor) obj);
            }
        }));
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> it = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getParents(classifierDescriptorWithTypeParameters2).iterator();
        while (true) {
            list = null;
            if (!it.hasNext()) {
                declarationDescriptor = null;
                break;
            }
            declarationDescriptor = it.next();
            if (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
                break;
            }
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) declarationDescriptor;
        if (classDescriptor != null && (typeConstructor = classDescriptor.getTypeConstructor()) != null) {
            list = typeConstructor.getParameters();
        }
        if (list == null) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        if (list2.isEmpty() && list.isEmpty()) {
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> declaredTypeParameters2 = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredTypeParameters2, "");
            return declaredTypeParameters2;
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) list2, (java.lang.Iterable) list);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(plus, 10));
        for (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor : plus) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(typeParameterDescriptor);
            arrayList.add(new kotlin.reflect.jvm.internal.impl.descriptors.CapturedTypeParameterDescriptor(typeParameterDescriptor, classifierDescriptorWithTypeParameters2, declaredTypeParameters.size()));
        }
        return kotlin.collections.CollectionsKt.plus((java.util.Collection) declaredTypeParameters, (java.lang.Iterable) arrayList);
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType buildPossiblyInnerType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = kotlinType.getConstructor().mo23898getDeclarationDescriptor();
        return getHighSpeedVideoSizes(kotlinType, mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters ? (kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters) mo23898getDeclarationDescriptor : null, 0);
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, int i) {
        if (classifierDescriptorWithTypeParameters == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters2 = classifierDescriptorWithTypeParameters;
        if (kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.isError(classifierDescriptorWithTypeParameters2)) {
            return null;
        }
        int size = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters().size() + i;
        if (!classifierDescriptorWithTypeParameters.isInner()) {
            if (size != kotlinType.getArguments().size()) {
                kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isLocal(classifierDescriptorWithTypeParameters2);
            }
            return new kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType(classifierDescriptorWithTypeParameters, kotlinType.getArguments().subList(i, kotlinType.getArguments().size()), null);
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> subList = kotlinType.getArguments().subList(i, size);
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = classifierDescriptorWithTypeParameters.getContainingDeclaration();
        return new kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType(classifierDescriptorWithTypeParameters, subList, getHighSpeedVideoSizes(kotlinType, containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters ? (kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters) containingDeclaration : null, size));
    }

    static /* synthetic */ boolean getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
        return declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
    }

    static /* synthetic */ boolean getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
        return !(declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor);
    }

    static /* synthetic */ kotlin.sequences.Sequence Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameters = ((kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor) declarationDescriptor).getTypeParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeParameters, "");
        return kotlin.collections.CollectionsKt.asSequence(typeParameters);
    }
}
