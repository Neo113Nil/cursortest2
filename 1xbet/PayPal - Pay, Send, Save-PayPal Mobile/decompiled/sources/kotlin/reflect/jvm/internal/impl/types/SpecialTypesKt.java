package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public final class SpecialTypesKt {
    public static final kotlin.reflect.jvm.internal.impl.types.AbbreviatedType getAbbreviatedType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrap = kotlinType.unwrap();
        if (unwrap instanceof kotlin.reflect.jvm.internal.impl.types.AbbreviatedType) {
            return (kotlin.reflect.jvm.internal.impl.types.AbbreviatedType) unwrap;
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType getAbbreviation(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.reflect.jvm.internal.impl.types.AbbreviatedType abbreviatedType = getAbbreviatedType(kotlinType);
        if (abbreviatedType != null) {
            return abbreviatedType.getAbbreviation();
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType withAbbreviation(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleType2, "");
        return kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(simpleType) ? simpleType : new kotlin.reflect.jvm.internal.impl.types.AbbreviatedType(simpleType, simpleType2);
    }

    public static final boolean isDefinitelyNotNullType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        return kotlinType.unwrap() instanceof kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.SimpleType makeSimpleTypeDefinitelyNotNullOrNotNull$default(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return makeSimpleTypeDefinitelyNotNullOrNotNull(simpleType, z);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType makeSimpleTypeDefinitelyNotNullOrNotNull(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleType, "");
        kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType makeDefinitelyNotNull$default = kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType.Companion.makeDefinitelyNotNull$default(kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType.Companion, simpleType, z, false, 4, null);
        if (makeDefinitelyNotNull$default != null) {
            return makeDefinitelyNotNull$default;
        }
        kotlin.reflect.jvm.internal.impl.types.SimpleType Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(simpleType);
        return Camera2StreamConfigurationMap == null ? simpleType.makeNullableAsSpecified(false) : Camera2StreamConfigurationMap;
    }

    public static final kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType withNotNullProjection(kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType newCapturedType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newCapturedType, "");
        return new kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType(newCapturedType.getCaptureStatus(), newCapturedType.getConstructor(), newCapturedType.getLowerType(), newCapturedType.getAttributes(), newCapturedType.isMarkedNullable(), true);
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.UnwrappedType makeDefinitelyNotNullOrNotNull$default(kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return makeDefinitelyNotNullOrNotNull(unwrappedType, z);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.UnwrappedType makeDefinitelyNotNullOrNotNull(kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unwrappedType, "");
        kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType makeDefinitelyNotNull$default = kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType.Companion.makeDefinitelyNotNull$default(kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType.Companion, unwrappedType, z, false, 4, null);
        if (makeDefinitelyNotNull$default != null) {
            return makeDefinitelyNotNull$default;
        }
        kotlin.reflect.jvm.internal.impl.types.SimpleType Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(unwrappedType);
        if (Camera2StreamConfigurationMap != null) {
            return Camera2StreamConfigurationMap;
        }
        return unwrappedType.makeNullableAsSpecified(false);
    }

    private static final kotlin.reflect.jvm.internal.impl.types.SimpleType Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor highSpeedVideoFpsRanges;
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor = kotlinType.getConstructor();
        kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor intersectionTypeConstructor = constructor instanceof kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor ? (kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor) constructor : null;
        if (intersectionTypeConstructor == null || (highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(intersectionTypeConstructor)) == null) {
            return null;
        }
        return highSpeedVideoFpsRanges.createType();
    }

    private static final kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor intersectionTypeConstructor) {
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType;
        java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> supertypes = intersectionTypeConstructor.getSupertypes();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(supertypes, 10));
        java.util.Iterator<T> it = supertypes.iterator();
        boolean z = false;
        while (true) {
            unwrappedType = null;
            if (!it.hasNext()) {
                break;
            }
            kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType2 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) it.next();
            if (kotlin.reflect.jvm.internal.impl.types.TypeUtils.isNullableType(unwrappedType2)) {
                unwrappedType2 = makeDefinitelyNotNullOrNotNull$default(unwrappedType2.unwrap(), false, 1, null);
                z = true;
            }
            arrayList.add(unwrappedType2);
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (!z) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType alternativeType = intersectionTypeConstructor.getAlternativeType();
        if (alternativeType != null) {
            unwrappedType = kotlin.reflect.jvm.internal.impl.types.TypeUtils.isNullableType(alternativeType) ? makeDefinitelyNotNullOrNotNull$default(alternativeType.unwrap(), false, 1, null) : alternativeType;
        }
        return new kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor(arrayList2).setAlternative(unwrappedType);
    }
}
