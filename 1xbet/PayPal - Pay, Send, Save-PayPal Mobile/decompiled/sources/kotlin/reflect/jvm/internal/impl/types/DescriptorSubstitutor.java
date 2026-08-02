package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public class DescriptorSubstitutor {
    public static kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor substituteTypeParameters(java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list2) {
        if (list == null) {
            getHighSpeedVideoFpsRangesFor(0);
        }
        if (typeSubstitution == null) {
            getHighSpeedVideoFpsRangesFor(1);
        }
        if (declarationDescriptor == null) {
            getHighSpeedVideoFpsRangesFor(2);
        }
        if (list2 == null) {
            getHighSpeedVideoFpsRangesFor(3);
        }
        kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor substituteTypeParameters = substituteTypeParameters(list, typeSubstitution, declarationDescriptor, list2, null);
        if (substituteTypeParameters == null) {
            throw new java.lang.AssertionError("Substitution failed");
        }
        if (substituteTypeParameters == null) {
            getHighSpeedVideoFpsRangesFor(4);
        }
        return substituteTypeParameters;
    }

    public static kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor substituteTypeParameters(java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list2, boolean[] zArr) {
        if (list == null) {
            getHighSpeedVideoFpsRangesFor(5);
        }
        if (typeSubstitution == null) {
            getHighSpeedVideoFpsRangesFor(6);
        }
        if (declarationDescriptor == null) {
            getHighSpeedVideoFpsRangesFor(7);
        }
        if (list2 == null) {
            getHighSpeedVideoFpsRangesFor(8);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        int i = 0;
        for (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor : list) {
            kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl createForFurtherModification = kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl.createForFurtherModification(declarationDescriptor, typeParameterDescriptor.getAnnotations(), typeParameterDescriptor.isReified(), typeParameterDescriptor.getVariance(), typeParameterDescriptor.getName(), i, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE, typeParameterDescriptor.getStorageManager());
            hashMap.put(typeParameterDescriptor.getTypeConstructor(), new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(createForFurtherModification.getDefaultType()));
            hashMap2.put(typeParameterDescriptor, createForFurtherModification);
            list2.add(createForFurtherModification);
            i++;
        }
        kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution createByConstructorsMap = kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution.createByConstructorsMap(hashMap);
        kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor createChainedSubstitutor = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.createChainedSubstitutor(typeSubstitution, createByConstructorsMap);
        kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor createChainedSubstitutor2 = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.createChainedSubstitutor(typeSubstitution.replaceWithNonApproximating(), createByConstructorsMap);
        for (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor2 : list) {
            kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl typeParameterDescriptorImpl = (kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl) hashMap2.get(typeParameterDescriptor2);
            for (kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType : typeParameterDescriptor2.getUpperBounds()) {
                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = kotlinType.getConstructor().mo23898getDeclarationDescriptor();
                kotlin.reflect.jvm.internal.impl.types.KotlinType substitute = (((mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) && kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.hasTypeParameterRecursiveBounds((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) mo23898getDeclarationDescriptor)) ? createChainedSubstitutor : createChainedSubstitutor2).substitute(kotlinType, kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE);
                if (substitute == null) {
                    return null;
                }
                if (substitute != kotlinType && zArr != null) {
                    zArr[0] = true;
                }
                typeParameterDescriptorImpl.addUpperBound(substitute);
            }
            typeParameterDescriptorImpl.setInitialized();
        }
        return createChainedSubstitutor;
    }

    private static /* synthetic */ void getHighSpeedVideoFpsRangesFor(int i) {
        java.lang.String str = i != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i != 4 ? 3 : 2];
        switch (i) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i == 4) {
            throw new java.lang.IllegalStateException(format);
        }
    }
}
