package kotlin.reflect;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\n\u001a\u00020\u00032\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\"\u001b\u0010\u0010\u001a\u00020\u0003*\u00020\u00008G¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\"\u0018\u0010\n\u001a\u00020\u0003*\u00020\b8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0011"}, d2 = {"Lkotlin/reflect/KType;", "", "p0", "Ljava/lang/reflect/Type;", "getHighResolutionOutputSizeshNQ4ISI", "(Lkotlin/reflect/KType;Z)Ljava/lang/reflect/Type;", "Ljava/lang/Class;", "", "Lkotlin/reflect/KTypeProjection;", "p1", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Type;", "getJavaType", "(Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;", "getJavaType$annotations", "(Lkotlin/reflect/KType;)V", "javaType", "(Lkotlin/reflect/KTypeProjection;)Ljava/lang/reflect/Type;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TypesJVMKt {
    public static /* synthetic */ void getJavaType$annotations(kotlin.reflect.KType kType) {
    }

    public static final java.lang.reflect.Type getJavaType(kotlin.reflect.KType kType) {
        java.lang.reflect.Type javaType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kType, "");
        return (!(kType instanceof kotlin.jvm.internal.KTypeBase) || (javaType = ((kotlin.jvm.internal.KTypeBase) kType).getJavaType()) == null) ? getHighResolutionOutputSizeshNQ4ISI(kType, false) : javaType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.reflect.Type getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.KType kType, boolean z) {
        kotlin.reflect.KClassifier classifier = kType.getClassifier();
        if (classifier instanceof kotlin.reflect.KTypeParameter) {
            if (!(classifier instanceof kotlin.jvm.internal.KTypeParameterBase)) {
                return new kotlin.reflect.ObsoleteFallbackTypeVariableImpl((kotlin.reflect.KTypeParameter) classifier);
            }
            kotlin.jvm.internal.KTypeParameterBase kTypeParameterBase = (kotlin.jvm.internal.KTypeParameterBase) classifier;
            java.lang.reflect.GenericDeclaration javaContainingDeclaration$kotlin_stdlib = kTypeParameterBase.getJavaContainingDeclaration$kotlin_stdlib();
            if (javaContainingDeclaration$kotlin_stdlib == null) {
                throw new java.lang.UnsupportedOperationException("javaType is not supported for this type: ".concat(java.lang.String.valueOf(kType)));
            }
            java.lang.reflect.TypeVariable<?>[] typeParameters = javaContainingDeclaration$kotlin_stdlib.getTypeParameters();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeParameters, "");
            java.lang.reflect.TypeVariable<?> typeVariable = null;
            boolean z2 = false;
            for (java.lang.reflect.TypeVariable<?> typeVariable2 : typeParameters) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(typeVariable2.getName(), kTypeParameterBase.getName())) {
                    if (z2) {
                        throw new java.lang.IllegalArgumentException("Array contains more than one matching element.");
                    }
                    z2 = true;
                    typeVariable = typeVariable2;
                }
            }
            if (z2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeVariable, "");
                return typeVariable;
            }
            throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
        }
        if (classifier instanceof kotlin.reflect.KClass) {
            kotlin.reflect.KClass kClass = (kotlin.reflect.KClass) classifier;
            java.lang.Class javaObjectType = z ? kotlin.jvm.JvmClassMappingKt.getJavaObjectType(kClass) : kotlin.jvm.JvmClassMappingKt.getJavaClass(kClass);
            java.util.List<kotlin.reflect.KTypeProjection> arguments = kType.getArguments();
            if (arguments.isEmpty()) {
                return javaObjectType;
            }
            if (javaObjectType.isArray()) {
                if (javaObjectType.getComponentType().isPrimitive()) {
                    return javaObjectType;
                }
                kotlin.reflect.KTypeProjection kTypeProjection = (kotlin.reflect.KTypeProjection) kotlin.collections.CollectionsKt.singleOrNull((java.util.List) arguments);
                if (kTypeProjection == null) {
                    throw new java.lang.IllegalArgumentException("kotlin.Array must have exactly one type argument: ".concat(java.lang.String.valueOf(kType)));
                }
                kotlin.reflect.KVariance variance = kTypeProjection.getVariance();
                kotlin.reflect.KType type = kTypeProjection.getType();
                int i = variance == null ? -1 : kotlin.reflect.TypesJVMKt.WhenMappings.$EnumSwitchMapping$0[variance.ordinal()];
                if (i == -1 || i == 1) {
                    return javaObjectType;
                }
                if (i != 2 && i != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(type);
                java.lang.reflect.Type highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(type, false);
                return highResolutionOutputSizeshNQ4ISI instanceof java.lang.Class ? javaObjectType : new kotlin.reflect.GenericArrayTypeImpl(highResolutionOutputSizeshNQ4ISI);
            }
            return getHighSpeedVideoFpsRangesFor(javaObjectType, arguments);
        }
        throw new java.lang.UnsupportedOperationException("Unsupported type classifier: ".concat(java.lang.String.valueOf(kType)));
    }

    private static final java.lang.reflect.Type getHighSpeedVideoFpsRangesFor(java.lang.Class<?> cls, java.util.List<kotlin.reflect.KTypeProjection> list) {
        java.lang.Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            java.util.List<kotlin.reflect.KTypeProjection> list2 = list;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(getHighSpeedVideoFpsRangesFor((kotlin.reflect.KTypeProjection) it.next()));
            }
            return new kotlin.reflect.ParameterizedTypeImpl(cls, null, arrayList);
        }
        if (java.lang.reflect.Modifier.isStatic(cls.getModifiers())) {
            java.lang.Class<?> cls2 = declaringClass;
            java.util.List<kotlin.reflect.KTypeProjection> list3 = list;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
            java.util.Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(getHighSpeedVideoFpsRangesFor((kotlin.reflect.KTypeProjection) it2.next()));
            }
            return new kotlin.reflect.ParameterizedTypeImpl(cls, cls2, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        java.lang.reflect.Type highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(declaringClass, list.subList(length, list.size()));
        java.util.List<kotlin.reflect.KTypeProjection> subList = list.subList(0, length);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(subList, 10));
        java.util.Iterator<T> it3 = subList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(getHighSpeedVideoFpsRangesFor((kotlin.reflect.KTypeProjection) it3.next()));
        }
        return new kotlin.reflect.ParameterizedTypeImpl(cls, highSpeedVideoFpsRangesFor, arrayList3);
    }

    private static final java.lang.reflect.Type getHighSpeedVideoFpsRangesFor(kotlin.reflect.KTypeProjection kTypeProjection) {
        kotlin.reflect.KVariance variance = kTypeProjection.getVariance();
        if (variance == null) {
            return kotlin.reflect.WildcardTypeImpl.Companion.getSTAR();
        }
        kotlin.reflect.KType type = kTypeProjection.getType();
        kotlin.jvm.internal.Intrinsics.checkNotNull(type);
        int i = kotlin.reflect.TypesJVMKt.WhenMappings.$EnumSwitchMapping$0[variance.ordinal()];
        if (i == 1) {
            return new kotlin.reflect.WildcardTypeImpl(null, getHighResolutionOutputSizeshNQ4ISI(type, true));
        }
        if (i == 2) {
            return getHighResolutionOutputSizeshNQ4ISI(type, true);
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new kotlin.reflect.WildcardTypeImpl(getHighResolutionOutputSizeshNQ4ISI(type, true), null);
    }

    public static final /* synthetic */ java.lang.String access$typeToString(java.lang.reflect.Type type) {
        if (type instanceof java.lang.Class) {
            java.lang.Class cls = (java.lang.Class) type;
            if (cls.isArray()) {
                kotlin.sequences.Sequence generateSequence = kotlin.sequences.SequencesKt.generateSequence(type, kotlin.reflect.TypesJVMKt$typeToString$unwrap$1.getHighResolutionOutputSizeshNQ4ISI);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(((java.lang.Class) kotlin.sequences.SequencesKt.last(generateSequence)).getName());
                sb.append(kotlin.text.StringsKt.repeat(okhttp3.internal.url._UrlKt.PATH_SEGMENT_ENCODE_SET_URI, kotlin.sequences.SequencesKt.count(generateSequence)));
                return sb.toString();
            }
            java.lang.String name2 = cls.getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
            return name2;
        }
        return type.toString();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.KVariance.values().length];
            try {
                iArr[kotlin.reflect.KVariance.IN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.reflect.KVariance.INVARIANT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.reflect.KVariance.OUT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
