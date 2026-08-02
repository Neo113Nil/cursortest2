package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public final class ExpandedTypeUtilsKt {
    public static final kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker computeExpandedTypeForInlineClass(kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext typeSystemCommonBackendContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemCommonBackendContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        return Camera2StreamConfigurationMap(typeSystemCommonBackendContext, kotlinTypeMarker, new java.util.HashSet());
    }

    private static final kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext typeSystemCommonBackendContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker, java.util.HashSet<kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker> hashSet) {
        kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker Camera2StreamConfigurationMap;
        kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructor = typeSystemCommonBackendContext.typeConstructor(kotlinTypeMarker);
        if (!hashSet.add(typeConstructor)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker typeParameterClassifier = typeSystemCommonBackendContext.getTypeParameterClassifier(typeConstructor);
        if (typeParameterClassifier != null) {
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker representativeUpperBound = typeSystemCommonBackendContext.getRepresentativeUpperBound(typeParameterClassifier);
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(typeSystemCommonBackendContext, representativeUpperBound, hashSet);
            if (Camera2StreamConfigurationMap2 != null) {
                return ((Camera2StreamConfigurationMap2 instanceof kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) && typeSystemCommonBackendContext.isPrimitiveType((kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) Camera2StreamConfigurationMap2) && typeSystemCommonBackendContext.isNullableType(kotlinTypeMarker) && (typeSystemCommonBackendContext.isInlineClass(typeSystemCommonBackendContext.typeConstructor(representativeUpperBound)) || ((representativeUpperBound instanceof kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) && typeSystemCommonBackendContext.isPrimitiveType((kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) representativeUpperBound)))) ? typeSystemCommonBackendContext.makeNullable(representativeUpperBound) : (typeSystemCommonBackendContext.isNullableType(Camera2StreamConfigurationMap2) || !typeSystemCommonBackendContext.isMarkedNullable(kotlinTypeMarker)) ? Camera2StreamConfigurationMap2 : typeSystemCommonBackendContext.makeNullable(Camera2StreamConfigurationMap2);
            }
            return null;
        }
        if (typeSystemCommonBackendContext.isInlineClass(typeConstructor)) {
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker highSpeedVideoSizes = getHighSpeedVideoSizes(typeSystemCommonBackendContext, kotlinTypeMarker);
            if (highSpeedVideoSizes == null || (Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(typeSystemCommonBackendContext, highSpeedVideoSizes, hashSet)) == null) {
                return null;
            }
            if (!typeSystemCommonBackendContext.isNullableType(kotlinTypeMarker)) {
                return Camera2StreamConfigurationMap;
            }
            if (!typeSystemCommonBackendContext.isNullableType(Camera2StreamConfigurationMap) && (!(Camera2StreamConfigurationMap instanceof kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) || !typeSystemCommonBackendContext.isPrimitiveType((kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) Camera2StreamConfigurationMap))) {
                return typeSystemCommonBackendContext.makeNullable(Camera2StreamConfigurationMap);
            }
        }
        return kotlinTypeMarker;
    }

    private static final kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext typeSystemCommonBackendContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        java.util.List<kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker> parameters = typeSystemCommonBackendContext.getParameters(typeSystemCommonBackendContext.typeConstructor(kotlinTypeMarker));
        java.util.List<kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker> arguments = typeSystemCommonBackendContext.getArguments(kotlinTypeMarker);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arguments, 10));
        int i = 0;
        for (java.lang.Object obj : arguments) {
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker type = typeSystemCommonBackendContext.getType((kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker) obj);
            if (type == null) {
                type = typeSystemCommonBackendContext.getRepresentativeUpperBound(parameters.get(i));
            }
            arrayList.add(type);
            i++;
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.List<kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker> list = parameters;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList3.add(typeSystemCommonBackendContext.getTypeConstructor((kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker) it.next()));
        }
        kotlin.reflect.jvm.internal.impl.types.model.TypeSubstitutorMarker typeSubstitutorForUnderlyingType = typeSystemCommonBackendContext.typeSubstitutorForUnderlyingType(kotlin.collections.MapsKt.toMap(kotlin.collections.CollectionsKt.zip(arrayList3, arrayList2)));
        kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker unsubstitutedUnderlyingType = typeSystemCommonBackendContext.getUnsubstitutedUnderlyingType(kotlinTypeMarker);
        if (unsubstitutedUnderlyingType == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(typeSystemCommonBackendContext, unsubstitutedUnderlyingType);
        if (Camera2StreamConfigurationMap == null) {
            return typeSystemCommonBackendContext.safeSubstitute(typeSubstitutorForUnderlyingType, unsubstitutedUnderlyingType);
        }
        return getHighSpeedVideoFpsRanges(typeSystemCommonBackendContext, unsubstitutedUnderlyingType, typeSystemCommonBackendContext.safeSubstitute(typeSubstitutorForUnderlyingType, typeSystemCommonBackendContext.getRepresentativeUpperBound(Camera2StreamConfigurationMap)));
    }

    private static final kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext typeSystemCommonBackendContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        do {
            kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker typeParameterClassifier = typeSystemCommonBackendContext.getTypeParameterClassifier(typeSystemCommonBackendContext.typeConstructor(kotlinTypeMarker));
            if (typeParameterClassifier != null) {
                return typeParameterClassifier;
            }
            if (!typeSystemCommonBackendContext.isArrayOrNullableArray(kotlinTypeMarker)) {
                return null;
            }
            kotlinTypeMarker = typeSystemCommonBackendContext.getType((kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker) kotlin.collections.CollectionsKt.single((java.util.List) typeSystemCommonBackendContext.getArguments(kotlinTypeMarker)));
        } while (kotlinTypeMarker != null);
        return null;
    }

    private static final kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext typeSystemCommonBackendContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker2) {
        kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker highSpeedVideoFpsRanges;
        if (typeSystemCommonBackendContext.getTypeParameterClassifier(typeSystemCommonBackendContext.typeConstructor(kotlinTypeMarker)) != null) {
            return typeSystemCommonBackendContext.isNullableType(kotlinTypeMarker) ? typeSystemCommonBackendContext.makeNullable(kotlinTypeMarker2) : kotlinTypeMarker2;
        }
        kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker typeArgumentMarker = (kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker) kotlin.collections.CollectionsKt.single((java.util.List) typeSystemCommonBackendContext.getArguments(kotlinTypeMarker));
        if (kotlin.reflect.jvm.internal.impl.types.ExpandedTypeUtilsKt.WhenMappings.$EnumSwitchMapping$0[typeSystemCommonBackendContext.getVariance(typeArgumentMarker).ordinal()] == 1) {
            highSpeedVideoFpsRanges = typeSystemCommonBackendContext.nullableAnyType();
        } else {
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker type = typeSystemCommonBackendContext.getType(typeArgumentMarker);
            kotlin.jvm.internal.Intrinsics.checkNotNull(type);
            highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(typeSystemCommonBackendContext, type, kotlinTypeMarker2);
        }
        kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker arrayType = typeSystemCommonBackendContext.arrayType(highSpeedVideoFpsRanges);
        return typeSystemCommonBackendContext.isNullableType(kotlinTypeMarker) ? typeSystemCommonBackendContext.makeNullable(arrayType) : arrayType;
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.values().length];
            try {
                iArr[kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.IN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
