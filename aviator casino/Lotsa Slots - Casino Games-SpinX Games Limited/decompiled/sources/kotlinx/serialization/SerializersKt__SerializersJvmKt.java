package kotlinx.serialization;

/* compiled from: SerializersJvm.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001a\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004\u001a+\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tH\u0002¢\u0006\u0002\b\n\u001a-\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\b\u001a\u00020\tH\u0002¢\u0006\u0002\b\r\u001aG\u0010\u000e\u001a\n\u0012\u0004\u0012\u0002H\u000f\u0018\u00010\u0001\"\b\b\u0000\u0010\u000f*\u00020\u0002*\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\f2\u0014\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0012H\u0002¢\u0006\u0002\b\u0013\u001a)\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\tH\u0002¢\u0006\u0002\b\u0016\u001a\u0015\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\f*\u00020\u0004H\u0002¢\u0006\u0002\b\u0018¨\u0006\u0019"}, d2 = {"serializer", "Lkotlinx/serialization/KSerializer;", "", "type", "Ljava/lang/reflect/Type;", "serializerOrNull", "Lkotlinx/serialization/modules/SerializersModule;", "serializerByJavaTypeImpl", "failOnMissingTypeArgSerializer", "", "serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt", "typeSerializer", "Ljava/lang/Class;", "typeSerializer$SerializersKt__SerializersJvmKt", "reflectiveOrContextual", "T", "jClass", "typeArgumentsSerializers", "", "reflectiveOrContextual$SerializersKt__SerializersJvmKt", "genericArraySerializer", "Ljava/lang/reflect/GenericArrayType;", "genericArraySerializer$SerializersKt__SerializersJvmKt", "prettyClass", "prettyClass$SerializersKt__SerializersJvmKt", "kotlinx-serialization-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/serialization/SerializersKt")
/* loaded from: classes6.dex */
final /* synthetic */ class SerializersKt__SerializersJvmKt {
    public static final kotlinx.serialization.KSerializer<java.lang.Object> serializer(java.lang.reflect.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        return kotlinx.serialization.SerializersKt.serializer(kotlinx.serialization.modules.SerializersModuleBuildersKt.EmptySerializersModule(), type);
    }

    public static final kotlinx.serialization.KSerializer<java.lang.Object> serializerOrNull(java.lang.reflect.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        return kotlinx.serialization.SerializersKt.serializerOrNull(kotlinx.serialization.modules.SerializersModuleBuildersKt.EmptySerializersModule(), type);
    }

    public static final kotlinx.serialization.KSerializer<java.lang.Object> serializer(kotlinx.serialization.modules.SerializersModule serializersModule, java.lang.reflect.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializersModule, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        kotlinx.serialization.KSerializer<java.lang.Object> serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt = serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt(serializersModule, type, true);
        if (serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt != null) {
            return serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt;
        }
        kotlinx.serialization.internal.PlatformKt.serializerNotRegistered(prettyClass$SerializersKt__SerializersJvmKt(type));
        throw new kotlin.KotlinNothingValueException();
    }

    public static final kotlinx.serialization.KSerializer<java.lang.Object> serializerOrNull(kotlinx.serialization.modules.SerializersModule serializersModule, java.lang.reflect.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializersModule, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        return serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt(serializersModule, type, false);
    }

    static /* synthetic */ kotlinx.serialization.KSerializer serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt$default(kotlinx.serialization.modules.SerializersModule serializersModule, java.lang.reflect.Type type, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt(serializersModule, type, z);
    }

    private static final kotlinx.serialization.KSerializer<java.lang.Object> serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt(kotlinx.serialization.modules.SerializersModule serializersModule, java.lang.reflect.Type type, boolean z) {
        java.util.ArrayList arrayList;
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return genericArraySerializer$SerializersKt__SerializersJvmKt(serializersModule, (java.lang.reflect.GenericArrayType) type, z);
        }
        if (type instanceof java.lang.Class) {
            return typeSerializer$SerializersKt__SerializersJvmKt(serializersModule, (java.lang.Class) type, z);
        }
        if (type instanceof java.lang.reflect.ParameterizedType) {
            java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) type;
            java.lang.reflect.Type rawType = parameterizedType.getRawType();
            kotlin.jvm.internal.Intrinsics.checkNotNull(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
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
                kotlin.jvm.internal.Intrinsics.checkNotNull(SetSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return SetSerializer;
            }
            if (java.util.List.class.isAssignableFrom(cls) || java.util.Collection.class.isAssignableFrom(cls)) {
                kotlinx.serialization.KSerializer<java.lang.Object> ListSerializer = kotlinx.serialization.builtins.BuiltinSerializersKt.ListSerializer((kotlinx.serialization.KSerializer) arrayList2.get(0));
                kotlin.jvm.internal.Intrinsics.checkNotNull(ListSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return ListSerializer;
            }
            if (java.util.Map.class.isAssignableFrom(cls)) {
                kotlinx.serialization.KSerializer<java.lang.Object> MapSerializer = kotlinx.serialization.builtins.BuiltinSerializersKt.MapSerializer((kotlinx.serialization.KSerializer) arrayList2.get(0), (kotlinx.serialization.KSerializer) arrayList2.get(1));
                kotlin.jvm.internal.Intrinsics.checkNotNull(MapSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return MapSerializer;
            }
            if (java.util.Map.Entry.class.isAssignableFrom(cls)) {
                kotlinx.serialization.KSerializer<java.lang.Object> MapEntrySerializer = kotlinx.serialization.builtins.BuiltinSerializersKt.MapEntrySerializer((kotlinx.serialization.KSerializer) arrayList2.get(0), (kotlinx.serialization.KSerializer) arrayList2.get(1));
                kotlin.jvm.internal.Intrinsics.checkNotNull(MapEntrySerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return MapEntrySerializer;
            }
            if (kotlin.Pair.class.isAssignableFrom(cls)) {
                kotlinx.serialization.KSerializer<java.lang.Object> PairSerializer = kotlinx.serialization.builtins.BuiltinSerializersKt.PairSerializer((kotlinx.serialization.KSerializer) arrayList2.get(0), (kotlinx.serialization.KSerializer) arrayList2.get(1));
                kotlin.jvm.internal.Intrinsics.checkNotNull(PairSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return PairSerializer;
            }
            if (kotlin.Triple.class.isAssignableFrom(cls)) {
                kotlinx.serialization.KSerializer<java.lang.Object> TripleSerializer = kotlinx.serialization.builtins.BuiltinSerializersKt.TripleSerializer((kotlinx.serialization.KSerializer) arrayList2.get(0), (kotlinx.serialization.KSerializer) arrayList2.get(1), (kotlinx.serialization.KSerializer) arrayList2.get(2));
                kotlin.jvm.internal.Intrinsics.checkNotNull(TripleSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return TripleSerializer;
            }
            java.util.ArrayList<kotlinx.serialization.KSerializer> arrayList3 = arrayList2;
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
            for (kotlinx.serialization.KSerializer kSerializer : arrayList3) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
                arrayList4.add(kSerializer);
            }
            return reflectiveOrContextual$SerializersKt__SerializersJvmKt(serializersModule, cls, arrayList4);
        }
        if (type instanceof java.lang.reflect.WildcardType) {
            java.lang.reflect.Type[] upperBounds = ((java.lang.reflect.WildcardType) type).getUpperBounds();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            java.lang.Object first = kotlin.collections.ArraysKt.first(upperBounds);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(first, "first(...)");
            return serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt$default(serializersModule, (java.lang.reflect.Type) first, false, 2, null);
        }
        throw new java.lang.IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(type.getClass()));
    }

    private static final kotlinx.serialization.KSerializer<java.lang.Object> typeSerializer$SerializersKt__SerializersJvmKt(kotlinx.serialization.modules.SerializersModule serializersModule, java.lang.Class<?> cls, boolean z) {
        kotlinx.serialization.KSerializer<java.lang.Object> serializerOrNull;
        if (cls.isArray() && !cls.getComponentType().isPrimitive()) {
            java.lang.Class<?> componentType = cls.getComponentType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(componentType, "getComponentType(...)");
            if (z) {
                serializerOrNull = kotlinx.serialization.SerializersKt.serializer(serializersModule, componentType);
            } else {
                serializerOrNull = kotlinx.serialization.SerializersKt.serializerOrNull(serializersModule, componentType);
                if (serializerOrNull == null) {
                    return null;
                }
            }
            kotlin.reflect.KClass kotlinClass = kotlin.jvm.JvmClassMappingKt.getKotlinClass(componentType);
            kotlin.jvm.internal.Intrinsics.checkNotNull(kotlinClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            kotlinx.serialization.KSerializer<java.lang.Object> ArraySerializer = kotlinx.serialization.builtins.BuiltinSerializersKt.ArraySerializer(kotlinClass, serializerOrNull);
            kotlin.jvm.internal.Intrinsics.checkNotNull(ArraySerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return ArraySerializer;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
        return reflectiveOrContextual$SerializersKt__SerializersJvmKt(serializersModule, cls, kotlin.collections.CollectionsKt.emptyList());
    }

    private static final <T> kotlinx.serialization.KSerializer<T> reflectiveOrContextual$SerializersKt__SerializersJvmKt(kotlinx.serialization.modules.SerializersModule serializersModule, java.lang.Class<T> cls, java.util.List<? extends kotlinx.serialization.KSerializer<java.lang.Object>> list) {
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

    private static final kotlinx.serialization.KSerializer<java.lang.Object> genericArraySerializer$SerializersKt__SerializersJvmKt(kotlinx.serialization.modules.SerializersModule serializersModule, java.lang.reflect.GenericArrayType genericArrayType, boolean z) {
        kotlinx.serialization.KSerializer<java.lang.Object> serializerOrNull;
        kotlin.reflect.KClass kClass;
        java.lang.reflect.Type genericComponentType = genericArrayType.getGenericComponentType();
        if (genericComponentType instanceof java.lang.reflect.WildcardType) {
            java.lang.reflect.Type[] upperBounds = ((java.lang.reflect.WildcardType) genericComponentType).getUpperBounds();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
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
            kotlin.jvm.internal.Intrinsics.checkNotNull(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            kClass = kotlin.jvm.JvmClassMappingKt.getKotlinClass((java.lang.Class) rawType);
        } else {
            if (!(genericComponentType instanceof kotlin.reflect.KClass)) {
                throw new java.lang.IllegalStateException("unsupported type in GenericArray: " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(genericComponentType.getClass()));
            }
            kClass = (kotlin.reflect.KClass) genericComponentType;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(kClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        kotlinx.serialization.KSerializer<java.lang.Object> ArraySerializer = kotlinx.serialization.builtins.BuiltinSerializersKt.ArraySerializer(kClass, serializerOrNull);
        kotlin.jvm.internal.Intrinsics.checkNotNull(ArraySerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return ArraySerializer;
    }

    private static final java.lang.Class<?> prettyClass$SerializersKt__SerializersJvmKt(java.lang.reflect.Type type) {
        if (type instanceof java.lang.Class) {
            return (java.lang.Class) type;
        }
        if (type instanceof java.lang.reflect.ParameterizedType) {
            java.lang.reflect.Type rawType = ((java.lang.reflect.ParameterizedType) type).getRawType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rawType, "getRawType(...)");
            return prettyClass$SerializersKt__SerializersJvmKt(rawType);
        }
        if (type instanceof java.lang.reflect.WildcardType) {
            java.lang.reflect.Type[] upperBounds = ((java.lang.reflect.WildcardType) type).getUpperBounds();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            java.lang.Object first = kotlin.collections.ArraysKt.first(upperBounds);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(first, "first(...)");
            return prettyClass$SerializersKt__SerializersJvmKt((java.lang.reflect.Type) first);
        }
        if (type instanceof java.lang.reflect.GenericArrayType) {
            java.lang.reflect.Type genericComponentType = ((java.lang.reflect.GenericArrayType) type).getGenericComponentType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(genericComponentType, "getGenericComponentType(...)");
            return prettyClass$SerializersKt__SerializersJvmKt(genericComponentType);
        }
        throw new java.lang.IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(type.getClass()));
    }
}
