package kotlin.reflect.jvm.internal.types;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/reflect/KType;", "type", "captureKTypeFromArguments", "(Lkotlin/reflect/KType;)Lkotlin/reflect/KType;", "Lkotlin/reflect/KClass;", "", "Lkotlin/reflect/KTypeParameter;", "allTypeParameters", "(Lkotlin/reflect/KClass;)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CapturedKTypeKt {
    public static final kotlin.reflect.KType captureKTypeFromArguments(kotlin.reflect.KType kType) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kType, "");
        kotlin.reflect.KClassifier classifier = kType.getClassifier();
        kotlin.reflect.KClass<?> kClass = classifier instanceof kotlin.reflect.KClass ? (kotlin.reflect.KClass) classifier : null;
        if (kClass == null) {
            return null;
        }
        java.util.List<kotlin.reflect.KTypeProjection> arguments = kType.getArguments();
        java.util.List<kotlin.reflect.KTypeProjection> list = arguments;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((kotlin.reflect.KTypeProjection) it.next()).getVariance() != kotlin.reflect.KVariance.INVARIANT) {
                    java.util.List<kotlin.reflect.KTypeParameter> allTypeParameters = allTypeParameters(kClass);
                    if (allTypeParameters.size() != arguments.size()) {
                        return null;
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                    java.util.Iterator<T> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        kotlin.reflect.KTypeProjection kTypeProjection = (kotlin.reflect.KTypeProjection) it2.next();
                        if (kTypeProjection.getVariance() != kotlin.reflect.KVariance.INVARIANT) {
                            kotlin.reflect.KType type = kTypeProjection.getType();
                            if (kTypeProjection.getVariance() != kotlin.reflect.KVariance.IN) {
                                type = null;
                            }
                            kTypeProjection = kotlin.reflect.KTypeProjection.INSTANCE.invariant(new kotlin.reflect.jvm.internal.types.CapturedKType(type, new kotlin.reflect.jvm.internal.types.CapturedKTypeConstructor(kTypeProjection), false));
                        }
                        arrayList.add(kTypeProjection);
                    }
                    java.util.ArrayList arrayList2 = arrayList;
                    kotlin.reflect.jvm.internal.types.KTypeSubstitutor create = kotlin.reflect.jvm.internal.types.KTypeSubstitutor.INSTANCE.create(kClass, arrayList2);
                    int size = arguments.size();
                    for (i = 0; i < size; i++) {
                        kotlin.reflect.KTypeProjection kTypeProjection2 = arguments.get(i);
                        if (kTypeProjection2.getVariance() != kotlin.reflect.KVariance.INVARIANT) {
                            java.util.List<kotlin.reflect.KType> upperBounds = allTypeParameters.get(i).getUpperBounds();
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            java.util.Iterator<T> it3 = upperBounds.iterator();
                            while (it3.hasNext()) {
                                kotlin.reflect.KType type2 = create.substitute((kotlin.reflect.KType) it3.next()).getType();
                                kotlin.jvm.internal.Intrinsics.checkNotNull(type2);
                                arrayList3.add(type2);
                            }
                            java.util.ArrayList arrayList4 = arrayList3;
                            if (kTypeProjection2.getVariance() == kotlin.reflect.KVariance.OUT) {
                                kotlin.reflect.KType type3 = kTypeProjection2.getType();
                                kotlin.jvm.internal.Intrinsics.checkNotNull(type3);
                                arrayList4.add(type3);
                            }
                            kotlin.reflect.KType type4 = ((kotlin.reflect.KTypeProjection) arrayList2.get(i)).getType();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(type4, "");
                            ((kotlin.reflect.jvm.internal.types.CapturedKType) type4).getTypeConstructor().setSupertypes(arrayList4);
                        }
                    }
                    kotlin.reflect.KClass<?> kClass2 = kClass;
                    boolean isMarkedNullable = kType.getIsMarkedNullable();
                    java.util.List<java.lang.annotation.Annotation> annotations = kType.getAnnotations();
                    boolean z = kType instanceof kotlin.reflect.jvm.internal.types.AbstractKType;
                    kotlin.reflect.jvm.internal.types.AbstractKType abstractKType = z ? (kotlin.reflect.jvm.internal.types.AbstractKType) kType : null;
                    kotlin.reflect.KType abbreviation = abstractKType != null ? abstractKType.getAbbreviation() : null;
                    kotlin.reflect.jvm.internal.types.AbstractKType abstractKType2 = z ? (kotlin.reflect.jvm.internal.types.AbstractKType) kType : null;
                    return new kotlin.reflect.jvm.internal.types.SimpleKType(kClass2, arrayList2, isMarkedNullable, annotations, abbreviation, false, false, false, abstractKType2 != null ? abstractKType2.getMutableCollectionClass() : null, null, 512, null);
                }
            }
        }
        return null;
    }

    public static final java.util.List<kotlin.reflect.KTypeParameter> allTypeParameters(kotlin.reflect.KClass<?> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        return kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.flatMapIterable(kotlin.sequences.SequencesKt.generateSequence(kClass, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.types.CapturedKTypeKt$$Lambda$0
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.types.CapturedKTypeKt.Camera2StreamConfigurationMap((kotlin.reflect.KClass) obj);
            }
        }), new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.types.CapturedKTypeKt$$Lambda$1
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.types.CapturedKTypeKt.getHighSpeedVideoFpsRanges((kotlin.reflect.KClass) obj);
            }
        }));
    }

    public static final /* synthetic */ java.lang.Void access$javaTypeNotSupported() {
        throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("javaType for captured types is not supported");
    }

    static /* synthetic */ kotlin.reflect.KClass Camera2StreamConfigurationMap(kotlin.reflect.KClass kClass) {
        java.lang.Class<?> declaringClass;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        if (!kClass.isInner() || (declaringClass = kotlin.jvm.JvmClassMappingKt.getJavaClass(kClass).getDeclaringClass()) == null) {
            return null;
        }
        return kotlin.jvm.JvmClassMappingKt.getKotlinClass(declaringClass);
    }

    static /* synthetic */ java.lang.Iterable getHighSpeedVideoFpsRanges(kotlin.reflect.KClass kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        return kClass.getTypeParameters();
    }
}
