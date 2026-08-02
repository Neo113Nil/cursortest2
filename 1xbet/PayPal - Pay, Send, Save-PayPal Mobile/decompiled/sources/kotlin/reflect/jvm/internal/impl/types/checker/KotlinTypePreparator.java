package kotlin.reflect.jvm.internal.impl.types.checker;

/* loaded from: classes5.dex */
public abstract class KotlinTypePreparator extends kotlin.reflect.jvm.internal.impl.types.AbstractTypePreparator {
    private static kotlin.reflect.jvm.internal.impl.types.SimpleType Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType) {
        kotlin.reflect.jvm.internal.impl.types.KotlinType type;
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor = simpleType.getConstructor();
        kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor intersectionTypeConstructor = null;
        r3 = null;
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType = null;
        if (constructor instanceof kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorImpl) {
            kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorImpl capturedTypeConstructorImpl = (kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorImpl) constructor;
            kotlin.reflect.jvm.internal.impl.types.TypeProjection projection = capturedTypeConstructorImpl.getProjection();
            if (projection.getProjectionKind() != kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE) {
                projection = null;
            }
            if (projection != null && (type = projection.getType()) != null) {
                unwrappedType = type.unwrap();
            }
            kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType2 = unwrappedType;
            if (capturedTypeConstructorImpl.getNewTypeConstructor() == null) {
                kotlin.reflect.jvm.internal.impl.types.TypeProjection projection2 = capturedTypeConstructorImpl.getProjection();
                java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> supertypes = capturedTypeConstructorImpl.getSupertypes();
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(supertypes, 10));
                java.util.Iterator<T> it = supertypes.iterator();
                while (it.hasNext()) {
                    arrayList.add(((kotlin.reflect.jvm.internal.impl.types.KotlinType) it.next()).unwrap());
                }
                capturedTypeConstructorImpl.setNewTypeConstructor(new kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor(projection2, arrayList, null, 4, null));
            }
            kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus captureStatus = kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus.FOR_SUBTYPING;
            kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor newTypeConstructor = capturedTypeConstructorImpl.getNewTypeConstructor();
            kotlin.jvm.internal.Intrinsics.checkNotNull(newTypeConstructor);
            return new kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType(captureStatus, newTypeConstructor, unwrappedType2, simpleType.getAttributes(), simpleType.isMarkedNullable(), false, 32, null);
        }
        boolean z = false;
        if (constructor instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerValueTypeConstructor) {
            java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> supertypes2 = ((kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerValueTypeConstructor) constructor).getSupertypes();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(supertypes2, 10));
            java.util.Iterator<T> it2 = supertypes2.iterator();
            while (it2.hasNext()) {
                kotlin.reflect.jvm.internal.impl.types.KotlinType makeNullableAsSpecified = kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeNullableAsSpecified((kotlin.reflect.jvm.internal.impl.types.KotlinType) it2.next(), simpleType.isMarkedNullable());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(makeNullableAsSpecified, "");
                arrayList2.add(makeNullableAsSpecified);
            }
            return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(simpleType.getAttributes(), new kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor(arrayList2), kotlin.collections.CollectionsKt.emptyList(), false, simpleType.getMemberScope());
        }
        if (!(constructor instanceof kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor) || !simpleType.isMarkedNullable()) {
            return simpleType;
        }
        kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor intersectionTypeConstructor2 = (kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor) constructor;
        java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> supertypes3 = intersectionTypeConstructor2.getSupertypes();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(supertypes3, 10));
        java.util.Iterator<T> it3 = supertypes3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.makeNullable((kotlin.reflect.jvm.internal.impl.types.KotlinType) it3.next()));
            z = true;
        }
        java.util.ArrayList arrayList4 = arrayList3;
        if (z) {
            kotlin.reflect.jvm.internal.impl.types.KotlinType alternativeType = intersectionTypeConstructor2.getAlternativeType();
            intersectionTypeConstructor = new kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor(arrayList4).setAlternative(alternativeType != null ? kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.makeNullable(alternativeType) : null);
        }
        if (intersectionTypeConstructor != null) {
            intersectionTypeConstructor2 = intersectionTypeConstructor;
        }
        return intersectionTypeConstructor2.createType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypePreparator
    public kotlin.reflect.jvm.internal.impl.types.UnwrappedType prepareType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.reflect.jvm.internal.impl.types.SimpleType flexibleType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        if (!(kotlinTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.KotlinType)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrap = ((kotlin.reflect.jvm.internal.impl.types.KotlinType) kotlinTypeMarker).unwrap();
        if (unwrap instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
            flexibleType = Camera2StreamConfigurationMap((kotlin.reflect.jvm.internal.impl.types.SimpleType) unwrap);
        } else {
            if (!(unwrap instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            kotlin.reflect.jvm.internal.impl.types.FlexibleType flexibleType2 = (kotlin.reflect.jvm.internal.impl.types.FlexibleType) unwrap;
            kotlin.reflect.jvm.internal.impl.types.SimpleType Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(flexibleType2.getLowerBound());
            kotlin.reflect.jvm.internal.impl.types.SimpleType Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(flexibleType2.getUpperBound());
            flexibleType = (Camera2StreamConfigurationMap == flexibleType2.getLowerBound() && Camera2StreamConfigurationMap2 == flexibleType2.getUpperBound()) ? unwrap : kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(Camera2StreamConfigurationMap, Camera2StreamConfigurationMap2);
        }
        return kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.inheritEnhancement(flexibleType, unwrap, new kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator$prepareType$1(this));
    }

    public static final class Default extends kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator {
        public static final kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator.Default INSTANCE = new kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator.Default();

        private Default() {
        }
    }
}
