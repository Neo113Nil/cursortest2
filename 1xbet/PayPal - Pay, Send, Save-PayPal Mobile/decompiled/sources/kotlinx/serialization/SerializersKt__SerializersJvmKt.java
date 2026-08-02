package kotlinx.serialization;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\t\u001a!\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002*\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\t\u001a+\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002*\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002*\u00020\b2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001aI\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\b\b\u0000\u0010\u0011*\u00020\u0003*\u00020\b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002*\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Ljava/lang/reflect/Type;", "type", "Lkotlinx/serialization/KSerializer;", "", "serializer", "(Ljava/lang/reflect/Type;)Lkotlinx/serialization/KSerializer;", "p0", "serializerOrNull", "Lkotlinx/serialization/modules/SerializersModule;", "(Lkotlinx/serialization/modules/SerializersModule;Ljava/lang/reflect/Type;)Lkotlinx/serialization/KSerializer;", "", "p1", "getHighSpeedVideoFpsRanges", "(Lkotlinx/serialization/modules/SerializersModule;Ljava/lang/reflect/Type;Z)Lkotlinx/serialization/KSerializer;", "Ljava/lang/Class;", "getHighSpeedVideoFpsRangesFor", "(Lkotlinx/serialization/modules/SerializersModule;Ljava/lang/Class;Z)Lkotlinx/serialization/KSerializer;", "T", "", "Camera2StreamConfigurationMap", "(Lkotlinx/serialization/modules/SerializersModule;Ljava/lang/Class;Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "Ljava/lang/reflect/GenericArrayType;", "getHighResolutionOutputSizeshNQ4ISI", "(Lkotlinx/serialization/modules/SerializersModule;Ljava/lang/reflect/GenericArrayType;Z)Lkotlinx/serialization/KSerializer;"}, k = 5, mv = {2, 3, 0}, xi = 48, xs = "kotlinx/serialization/SerializersKt")
/* loaded from: classes5.dex */
final /* synthetic */ class SerializersKt__SerializersJvmKt {
    public static final kotlinx.serialization.KSerializer<java.lang.Object> serializer(java.lang.reflect.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return kotlinx.serialization.SerializersKt.serializer(kotlinx.serialization.modules.SerializersModuleBuildersKt.EmptySerializersModule(), type);
    }

    public static final kotlinx.serialization.KSerializer<java.lang.Object> serializerOrNull(java.lang.reflect.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return kotlinx.serialization.SerializersKt.serializerOrNull(kotlinx.serialization.modules.SerializersModuleBuildersKt.EmptySerializersModule(), type);
    }

    public static final kotlinx.serialization.KSerializer<java.lang.Object> serializer(kotlinx.serialization.modules.SerializersModule serializersModule, java.lang.reflect.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializersModule, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlinx.serialization.KSerializer<java.lang.Object> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(serializersModule, type, true);
        if (highSpeedVideoFpsRanges != null) {
            return highSpeedVideoFpsRanges;
        }
        while (!(type instanceof java.lang.Class)) {
            if (type instanceof java.lang.reflect.ParameterizedType) {
                type = ((java.lang.reflect.ParameterizedType) type).getRawType();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
            } else if (type instanceof java.lang.reflect.WildcardType) {
                java.lang.reflect.Type[] upperBounds = ((java.lang.reflect.WildcardType) type).getUpperBounds();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperBounds, "");
                java.lang.Object first = kotlin.collections.ArraysKt.first(upperBounds);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(first, "");
                type = (java.lang.reflect.Type) first;
            } else {
                if (!(type instanceof java.lang.reflect.GenericArrayType)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
                    sb.append(type);
                    sb.append(" has type ");
                    sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(type.getClass()));
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                type = ((java.lang.reflect.GenericArrayType) type).getGenericComponentType();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
            }
        }
        kotlinx.serialization.internal.PlatformKt.serializerNotRegistered((java.lang.Class) type);
        throw new kotlin.KotlinNothingValueException();
    }

    public static final kotlinx.serialization.KSerializer<java.lang.Object> serializerOrNull(kotlinx.serialization.modules.SerializersModule serializersModule, java.lang.reflect.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializersModule, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return getHighSpeedVideoFpsRanges(serializersModule, type, false);
    }

    private static final kotlinx.serialization.KSerializer<java.lang.Object> getHighSpeedVideoFpsRanges(kotlinx.serialization.modules.SerializersModule serializersModule, java.lang.reflect.Type type, boolean z) {
        java.util.ArrayList arrayList;
        while (!(type instanceof java.lang.reflect.GenericArrayType)) {
            if (type instanceof java.lang.Class) {
                return getHighSpeedVideoFpsRangesFor(serializersModule, (java.lang.Class) type, z);
            }
            if (type instanceof java.lang.reflect.ParameterizedType) {
                java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) type;
                java.lang.reflect.Type rawType = parameterizedType.getRawType();
                kotlin.jvm.internal.Intrinsics.checkNotNull(rawType, "");
                java.lang.Class cls = (java.lang.Class) rawType;
                java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                kotlin.jvm.internal.Intrinsics.checkNotNull(actualTypeArguments);
                if (z) {
                    arrayList = new java.util.ArrayList(actualTypeArguments.length);
                    for (java.lang.reflect.Type type2 : actualTypeArguments) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(type2);
                        arrayList.add(kotlinx.serialization.SerializersKt.serializer(serializersModule, type2));
                    }
                } else {
                    arrayList = new java.util.ArrayList(actualTypeArguments.length);
                    for (java.lang.reflect.Type type3 : actualTypeArguments) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(type3);
                        kotlinx.serialization.KSerializer<java.lang.Object> serializerOrNull = kotlinx.serialization.SerializersKt.serializerOrNull(serializersModule, type3);
                        if (serializerOrNull == null) {
                            return null;
                        }
                        arrayList.add(serializerOrNull);
                    }
                }
                java.util.ArrayList arrayList2 = arrayList;
                if (java.util.Set.class.isAssignableFrom(cls)) {
                    kotlinx.serialization.KSerializer<java.lang.Object> SetSerializer = kotlinx.serialization.builtins.BuiltinSerializersKt.SetSerializer((kotlinx.serialization.KSerializer) arrayList2.get(0));
                    kotlin.jvm.internal.Intrinsics.checkNotNull(SetSerializer, "");
                    return SetSerializer;
                }
                if (java.util.List.class.isAssignableFrom(cls) || java.util.Collection.class.isAssignableFrom(cls)) {
                    kotlinx.serialization.KSerializer<java.lang.Object> ListSerializer = kotlinx.serialization.builtins.BuiltinSerializersKt.ListSerializer((kotlinx.serialization.KSerializer) arrayList2.get(0));
                    kotlin.jvm.internal.Intrinsics.checkNotNull(ListSerializer, "");
                    return ListSerializer;
                }
                if (java.util.Map.class.isAssignableFrom(cls)) {
                    kotlinx.serialization.KSerializer<java.lang.Object> MapSerializer = kotlinx.serialization.builtins.BuiltinSerializersKt.MapSerializer((kotlinx.serialization.KSerializer) arrayList2.get(0), (kotlinx.serialization.KSerializer) arrayList2.get(1));
                    kotlin.jvm.internal.Intrinsics.checkNotNull(MapSerializer, "");
                    return MapSerializer;
                }
                if (java.util.Map.Entry.class.isAssignableFrom(cls)) {
                    kotlinx.serialization.KSerializer<java.lang.Object> MapEntrySerializer = kotlinx.serialization.builtins.BuiltinSerializersKt.MapEntrySerializer((kotlinx.serialization.KSerializer) arrayList2.get(0), (kotlinx.serialization.KSerializer) arrayList2.get(1));
                    kotlin.jvm.internal.Intrinsics.checkNotNull(MapEntrySerializer, "");
                    return MapEntrySerializer;
                }
                if (kotlin.Pair.class.isAssignableFrom(cls)) {
                    kotlinx.serialization.KSerializer<java.lang.Object> PairSerializer = kotlinx.serialization.builtins.BuiltinSerializersKt.PairSerializer((kotlinx.serialization.KSerializer) arrayList2.get(0), (kotlinx.serialization.KSerializer) arrayList2.get(1));
                    kotlin.jvm.internal.Intrinsics.checkNotNull(PairSerializer, "");
                    return PairSerializer;
                }
                if (kotlin.Triple.class.isAssignableFrom(cls)) {
                    kotlinx.serialization.KSerializer<java.lang.Object> TripleSerializer = kotlinx.serialization.builtins.BuiltinSerializersKt.TripleSerializer((kotlinx.serialization.KSerializer) arrayList2.get(0), (kotlinx.serialization.KSerializer) arrayList2.get(1), (kotlinx.serialization.KSerializer) arrayList2.get(2));
                    kotlin.jvm.internal.Intrinsics.checkNotNull(TripleSerializer, "");
                    return TripleSerializer;
                }
                java.util.ArrayList<kotlinx.serialization.KSerializer> arrayList3 = arrayList2;
                java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                for (kotlinx.serialization.KSerializer kSerializer : arrayList3) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(kSerializer, "");
                    arrayList4.add(kSerializer);
                }
                return Camera2StreamConfigurationMap(serializersModule, cls, arrayList4);
            }
            if (!(type instanceof java.lang.reflect.WildcardType)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
                sb.append(type);
                sb.append(" has type ");
                sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(type.getClass()));
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            java.lang.reflect.Type[] upperBounds = ((java.lang.reflect.WildcardType) type).getUpperBounds();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperBounds, "");
            java.lang.Object first = kotlin.collections.ArraysKt.first(upperBounds);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(first, "");
            type = (java.lang.reflect.Type) first;
            z = true;
        }
        return getHighResolutionOutputSizeshNQ4ISI(serializersModule, (java.lang.reflect.GenericArrayType) type, z);
    }

    private static final kotlinx.serialization.KSerializer<java.lang.Object> getHighSpeedVideoFpsRangesFor(kotlinx.serialization.modules.SerializersModule serializersModule, java.lang.Class<?> cls, boolean z) {
        kotlinx.serialization.KSerializer<java.lang.Object> serializerOrNull;
        if (cls.isArray() && !cls.getComponentType().isPrimitive()) {
            java.lang.Class<?> componentType = cls.getComponentType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(componentType, "");
            if (z) {
                serializerOrNull = kotlinx.serialization.SerializersKt.serializer(serializersModule, componentType);
            } else {
                serializerOrNull = kotlinx.serialization.SerializersKt.serializerOrNull(serializersModule, componentType);
                if (serializerOrNull == null) {
                    return null;
                }
            }
            kotlin.reflect.KClass kotlinClass = kotlin.jvm.JvmClassMappingKt.getKotlinClass(componentType);
            kotlin.jvm.internal.Intrinsics.checkNotNull(kotlinClass, "");
            kotlinx.serialization.KSerializer<java.lang.Object> ArraySerializer = kotlinx.serialization.builtins.BuiltinSerializersKt.ArraySerializer(kotlinClass, serializerOrNull);
            kotlin.jvm.internal.Intrinsics.checkNotNull(ArraySerializer, "");
            return ArraySerializer;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(cls, "");
        return Camera2StreamConfigurationMap(serializersModule, cls, kotlin.collections.CollectionsKt.emptyList());
    }

    private static final <T> kotlinx.serialization.KSerializer<T> Camera2StreamConfigurationMap(kotlinx.serialization.modules.SerializersModule serializersModule, java.lang.Class<T> cls, java.util.List<? extends kotlinx.serialization.KSerializer<java.lang.Object>> list) {
        kotlinx.serialization.KSerializer[] kSerializerArr = (kotlinx.serialization.KSerializer[]) list.toArray(new kotlinx.serialization.KSerializer[0]);
        kotlinx.serialization.KSerializer<T> constructSerializerForGivenTypeArgs = kotlinx.serialization.internal.PlatformKt.constructSerializerForGivenTypeArgs(cls, (kotlinx.serialization.KSerializer<java.lang.Object>[]) java.util.Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (constructSerializerForGivenTypeArgs != null) {
            return constructSerializerForGivenTypeArgs;
        }
        kotlin.reflect.KClass<T> kotlinClass = kotlin.jvm.JvmClassMappingKt.getKotlinClass(cls);
        kotlinx.serialization.KSerializer<T> builtinSerializerOrNull = kotlinx.serialization.internal.PrimitivesKt.builtinSerializerOrNull(kotlinClass);
        if (builtinSerializerOrNull != null) {
            return builtinSerializerOrNull;
        }
        kotlinx.serialization.KSerializer<T> contextual = serializersModule.getContextual(kotlinClass, list);
        if (contextual != null) {
            return contextual;
        }
        if (cls.isInterface()) {
            return new kotlinx.serialization.PolymorphicSerializer(kotlin.jvm.JvmClassMappingKt.getKotlinClass(cls));
        }
        return null;
    }

    private static final kotlinx.serialization.KSerializer<java.lang.Object> getHighResolutionOutputSizeshNQ4ISI(kotlinx.serialization.modules.SerializersModule serializersModule, java.lang.reflect.GenericArrayType genericArrayType, boolean z) {
        kotlinx.serialization.KSerializer<java.lang.Object> serializerOrNull;
        kotlin.reflect.KClass kClass;
        java.lang.reflect.Type genericComponentType = genericArrayType.getGenericComponentType();
        if (genericComponentType instanceof java.lang.reflect.WildcardType) {
            java.lang.reflect.Type[] upperBounds = ((java.lang.reflect.WildcardType) genericComponentType).getUpperBounds();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperBounds, "");
            genericComponentType = (java.lang.reflect.Type) kotlin.collections.ArraysKt.first(upperBounds);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(genericComponentType);
        if (z) {
            serializerOrNull = kotlinx.serialization.SerializersKt.serializer(serializersModule, genericComponentType);
        } else {
            serializerOrNull = kotlinx.serialization.SerializersKt.serializerOrNull(serializersModule, genericComponentType);
            if (serializerOrNull == null) {
                return null;
            }
        }
        if (genericComponentType instanceof java.lang.reflect.ParameterizedType) {
            java.lang.reflect.Type rawType = ((java.lang.reflect.ParameterizedType) genericComponentType).getRawType();
            kotlin.jvm.internal.Intrinsics.checkNotNull(rawType, "");
            kClass = kotlin.jvm.JvmClassMappingKt.getKotlinClass((java.lang.Class) rawType);
        } else {
            if (!(genericComponentType instanceof kotlin.reflect.KClass)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("unsupported type in GenericArray: ");
                sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(genericComponentType.getClass()));
                throw new java.lang.IllegalStateException(sb.toString());
            }
            kClass = (kotlin.reflect.KClass) genericComponentType;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(kClass, "");
        kotlinx.serialization.KSerializer<java.lang.Object> ArraySerializer = kotlinx.serialization.builtins.BuiltinSerializersKt.ArraySerializer(kClass, serializerOrNull);
        kotlin.jvm.internal.Intrinsics.checkNotNull(ArraySerializer, "");
        return ArraySerializer;
    }
}
