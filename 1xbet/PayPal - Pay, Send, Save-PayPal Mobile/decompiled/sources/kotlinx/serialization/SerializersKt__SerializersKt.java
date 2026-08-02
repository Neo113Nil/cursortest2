package kotlinx.serialization;

@kotlin.Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\u001a\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0004H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u001d\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0002\u0010\t\u001a=\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0010\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0002\u0010\u0010\u001a\u001f\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\t\u001a!\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0001*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0002\u0010\u0013\u001aA\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0001*\u00020\u00042\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0010\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0002\u0010\u0014\u001a#\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0001*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013\u001a-\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0001*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001aI\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0001*\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0014\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00010\f2\u0006\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u0014\u001a9\u0010\u001a\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0001\u0018\u00010\f*\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0015\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a)\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\b*\b\u0012\u0004\u0012\u00028\u00000\nH\u0007¢\u0006\u0004\b\u0002\u0010\u001c\u001a+\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0001\"\b\b\u0000\u0010\u0000*\u00020\b*\b\u0012\u0004\u0012\u00028\u00000\nH\u0007¢\u0006\u0004\b\u0012\u0010\u001c\u001aI\u0010\u001f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\b0\n2\u0014\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00010\f2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u001b\u0010\"\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0011\u001a\u00020!H\u0000¢\u0006\u0004\b\"\u0010#\u001a'\u0010\"\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0011\u001a\u00020\u00042\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\nH\u0000¢\u0006\u0004\b\"\u0010$\u001a9\u0010\"\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0011\u001a\u00020\u00042\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\n2\u0010\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010%H\u0000¢\u0006\u0004\b\"\u0010&\u001a'\u0010'\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0011\u001a\u00020\u00042\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\nH\u0000¢\u0006\u0004\b'\u0010$\u001a9\u0010'\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0011\u001a\u00020\u00042\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\n2\u0010\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010%H\u0000¢\u0006\u0004\b'\u0010&"}, d2 = {"T", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/modules/SerializersModule;", "(Lkotlinx/serialization/modules/SerializersModule;)Lkotlinx/serialization/KSerializer;", "Lkotlin/reflect/KType;", "type", "", "(Lkotlin/reflect/KType;)Lkotlinx/serialization/KSerializer;", "Lkotlin/reflect/KClass;", "kClass", "", "typeArgumentsSerializers", "", "isNullable", "(Lkotlin/reflect/KClass;Ljava/util/List;Z)Lkotlinx/serialization/KSerializer;", "p0", "serializerOrNull", "(Lkotlinx/serialization/modules/SerializersModule;Lkotlin/reflect/KType;)Lkotlinx/serialization/KSerializer;", "(Lkotlinx/serialization/modules/SerializersModule;Lkotlin/reflect/KClass;Ljava/util/List;Z)Lkotlinx/serialization/KSerializer;", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(Lkotlinx/serialization/modules/SerializersModule;Lkotlin/reflect/KType;Z)Lkotlinx/serialization/KSerializer;", "p2", "Camera2StreamConfigurationMap", "serializersForParameters", "(Lkotlinx/serialization/modules/SerializersModule;Ljava/util/List;Z)Ljava/util/List;", "(Lkotlin/reflect/KClass;)Lkotlinx/serialization/KSerializer;", "Lkotlin/Function0;", "Lkotlin/reflect/KClassifier;", "parametrizedSerializerOrNull", "(Lkotlin/reflect/KClass;Ljava/util/List;Lkotlin/jvm/functions/Function0;)Lkotlinx/serialization/KSerializer;", "", "noCompiledSerializer", "(Ljava/lang/String;)Lkotlinx/serialization/KSerializer;", "(Lkotlinx/serialization/modules/SerializersModule;Lkotlin/reflect/KClass;)Lkotlinx/serialization/KSerializer;", "", "(Lkotlinx/serialization/modules/SerializersModule;Lkotlin/reflect/KClass;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "moduleThenPolymorphic"}, k = 5, mv = {2, 3, 0}, xi = 48, xs = "kotlinx/serialization/SerializersKt")
/* loaded from: classes17.dex */
final /* synthetic */ class SerializersKt__SerializersKt {
    public static final /* synthetic */ <T> kotlinx.serialization.KSerializer<T> serializer() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlinx.serialization.KSerializer serializer = kotlinx.serialization.SerializersKt.serializer((kotlin.reflect.KType) null);
        kotlin.jvm.internal.Intrinsics.checkNotNull(serializer, "");
        return serializer;
    }

    public static final /* synthetic */ <T> kotlinx.serialization.KSerializer<T> serializer(kotlinx.serialization.modules.SerializersModule serializersModule) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializersModule, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlinx.serialization.KSerializer serializer = kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null);
        kotlin.jvm.internal.Intrinsics.checkNotNull(serializer, "");
        return serializer;
    }

    public static final kotlinx.serialization.KSerializer<java.lang.Object> serializer(kotlin.reflect.KType kType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kType, "");
        return kotlinx.serialization.SerializersKt.serializer(kotlinx.serialization.modules.SerializersModuleBuildersKt.EmptySerializersModule(), kType);
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final kotlinx.serialization.KSerializer<java.lang.Object> serializer(kotlin.reflect.KClass<?> kClass, java.util.List<? extends kotlinx.serialization.KSerializer<?>> list, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return kotlinx.serialization.SerializersKt.serializer(kotlinx.serialization.modules.SerializersModuleBuildersKt.EmptySerializersModule(), kClass, list, z);
    }

    public static final kotlinx.serialization.KSerializer<java.lang.Object> serializerOrNull(kotlin.reflect.KType kType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kType, "");
        return kotlinx.serialization.SerializersKt.serializerOrNull(kotlinx.serialization.modules.SerializersModuleBuildersKt.EmptySerializersModule(), kType);
    }

    public static final kotlinx.serialization.KSerializer<java.lang.Object> serializer(kotlinx.serialization.modules.SerializersModule serializersModule, kotlin.reflect.KType kType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializersModule, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kType, "");
        kotlinx.serialization.KSerializer<java.lang.Object> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(serializersModule, kType, true);
        if (highResolutionOutputSizeshNQ4ISI != null) {
            return highResolutionOutputSizeshNQ4ISI;
        }
        kotlinx.serialization.internal.PlatformKt.platformSpecificSerializerNotRegistered(kotlinx.serialization.internal.Platform_commonKt.kclass(kType));
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final kotlinx.serialization.KSerializer<java.lang.Object> serializer(kotlinx.serialization.modules.SerializersModule serializersModule, kotlin.reflect.KClass<?> kClass, java.util.List<? extends kotlinx.serialization.KSerializer<?>> list, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializersModule, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlinx.serialization.KSerializer<java.lang.Object> Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(serializersModule, kClass, list, z);
        if (Camera2StreamConfigurationMap != null) {
            return Camera2StreamConfigurationMap;
        }
        kotlinx.serialization.internal.PlatformKt.platformSpecificSerializerNotRegistered(kClass);
        throw new kotlin.KotlinNothingValueException();
    }

    public static final kotlinx.serialization.KSerializer<java.lang.Object> serializerOrNull(kotlinx.serialization.modules.SerializersModule serializersModule, kotlin.reflect.KType kType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializersModule, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kType, "");
        return getHighResolutionOutputSizeshNQ4ISI(serializersModule, kType, false);
    }

    private static final kotlinx.serialization.KSerializer<java.lang.Object> getHighResolutionOutputSizeshNQ4ISI(kotlinx.serialization.modules.SerializersModule serializersModule, kotlin.reflect.KType kType, boolean z) {
        kotlinx.serialization.KSerializer<java.lang.Object> kSerializer;
        kotlinx.serialization.PolymorphicSerializer polymorphicSerializer;
        kotlin.reflect.KClass<java.lang.Object> kclass = kotlinx.serialization.internal.Platform_commonKt.kclass(kType);
        boolean isMarkedNullable = kType.getIsMarkedNullable();
        java.util.List<kotlin.reflect.KTypeProjection> arguments = kType.getArguments();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arguments, 10));
        java.util.Iterator<T> it = arguments.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlinx.serialization.internal.Platform_commonKt.typeOrThrow((kotlin.reflect.KTypeProjection) it.next()));
        }
        final java.util.ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            if (!kotlinx.serialization.internal.PlatformKt.isInterface(kclass) || kotlinx.serialization.modules.SerializersModule.getContextual$default(serializersModule, kclass, null, 2, null) == null) {
                kSerializer = kotlinx.serialization.SerializersCacheKt.findCachedSerializer(kclass, isMarkedNullable);
            }
            kSerializer = null;
        } else {
            if (!serializersModule.getHasInterfaceContextualSerializers()) {
                java.lang.Object findParametrizedCachedSerializer = kotlinx.serialization.SerializersCacheKt.findParametrizedCachedSerializer(kclass, arrayList2, isMarkedNullable);
                if (kotlin.Result.m23441isFailureimpl(findParametrizedCachedSerializer)) {
                    findParametrizedCachedSerializer = null;
                }
                kSerializer = (kotlinx.serialization.KSerializer) findParametrizedCachedSerializer;
            }
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        if (arrayList2.isEmpty()) {
            polymorphicSerializer = kotlinx.serialization.SerializersKt.serializerOrNull(kclass);
            if (polymorphicSerializer == null && (polymorphicSerializer = kotlinx.serialization.modules.SerializersModule.getContextual$default(serializersModule, kclass, null, 2, null)) == null) {
                polymorphicSerializer = kotlinx.serialization.internal.PlatformKt.isInterface(kclass) ? new kotlinx.serialization.PolymorphicSerializer(kclass) : null;
            }
        } else {
            java.util.List<kotlinx.serialization.KSerializer<java.lang.Object>> serializersForParameters = kotlinx.serialization.SerializersKt.serializersForParameters(serializersModule, arrayList2, z);
            if (serializersForParameters == null) {
                return null;
            }
            kotlinx.serialization.KSerializer<? extends java.lang.Object> parametrizedSerializerOrNull = kotlinx.serialization.SerializersKt.parametrizedSerializerOrNull(kclass, serializersForParameters, new kotlin.jvm.functions.Function0() { // from class: kotlinx.serialization.SerializersKt__SerializersKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlin.reflect.KClassifier classifier;
                    classifier = ((kotlin.reflect.KType) arrayList2.get(0)).getClassifier();
                    return classifier;
                }
            });
            if (parametrizedSerializerOrNull == null) {
                polymorphicSerializer = serializersModule.getContextual(kclass, serializersForParameters);
                if (polymorphicSerializer == null) {
                    polymorphicSerializer = kotlinx.serialization.internal.PlatformKt.isInterface(kclass) ? new kotlinx.serialization.PolymorphicSerializer(kclass) : null;
                }
            } else {
                polymorphicSerializer = parametrizedSerializerOrNull;
            }
        }
        if (polymorphicSerializer == null) {
            return null;
        }
        if (isMarkedNullable) {
            return kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(polymorphicSerializer);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(polymorphicSerializer, "");
        return polymorphicSerializer;
    }

    private static final kotlinx.serialization.KSerializer<java.lang.Object> Camera2StreamConfigurationMap(kotlinx.serialization.modules.SerializersModule serializersModule, kotlin.reflect.KClass<java.lang.Object> kClass, java.util.List<? extends kotlinx.serialization.KSerializer<java.lang.Object>> list, boolean z) {
        kotlinx.serialization.KSerializer<? extends java.lang.Object> contextual;
        if (list.isEmpty()) {
            contextual = kotlinx.serialization.SerializersKt.serializerOrNull(kClass);
            if (contextual == null) {
                contextual = kotlinx.serialization.modules.SerializersModule.getContextual$default(serializersModule, kClass, null, 2, null);
            }
        } else {
            try {
                kotlinx.serialization.KSerializer<? extends java.lang.Object> parametrizedSerializerOrNull = kotlinx.serialization.SerializersKt.parametrizedSerializerOrNull(kClass, list, new kotlin.jvm.functions.Function0() { // from class: kotlinx.serialization.SerializersKt__SerializersKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return kotlinx.serialization.SerializersKt__SerializersKt.getHighSpeedVideoSizes();
                    }
                });
                contextual = parametrizedSerializerOrNull == null ? serializersModule.getContextual(kClass, list) : parametrizedSerializerOrNull;
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new kotlinx.serialization.SerializationException("Unable to retrieve a serializer, the number of passed type serializers differs from the actual number of generic parameters", e);
            }
        }
        if (contextual == null) {
            return null;
        }
        if (z) {
            return kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(contextual);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(contextual, "");
        return contextual;
    }

    public static final java.util.List<kotlinx.serialization.KSerializer<java.lang.Object>> serializersForParameters(kotlinx.serialization.modules.SerializersModule serializersModule, java.util.List<? extends kotlin.reflect.KType> list, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializersModule, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        if (z) {
            java.util.List<? extends kotlin.reflect.KType> list2 = list;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) it.next()));
            }
            return arrayList;
        }
        java.util.List<? extends kotlin.reflect.KType> list3 = list;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
        java.util.Iterator<T> it2 = list3.iterator();
        while (it2.hasNext()) {
            kotlinx.serialization.KSerializer<java.lang.Object> serializerOrNull = kotlinx.serialization.SerializersKt.serializerOrNull(serializersModule, (kotlin.reflect.KType) it2.next());
            if (serializerOrNull == null) {
                return null;
            }
            arrayList2.add(serializerOrNull);
        }
        return arrayList2;
    }

    @kotlinx.serialization.InternalSerializationApi
    public static final <T> kotlinx.serialization.KSerializer<T> serializer(kotlin.reflect.KClass<T> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlinx.serialization.KSerializer<T> serializerOrNull = kotlinx.serialization.SerializersKt.serializerOrNull(kClass);
        if (serializerOrNull != null) {
            return serializerOrNull;
        }
        kotlinx.serialization.internal.Platform_commonKt.serializerNotRegistered(kClass);
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlinx.serialization.InternalSerializationApi
    public static final <T> kotlinx.serialization.KSerializer<T> serializerOrNull(kotlin.reflect.KClass<T> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlinx.serialization.KSerializer<T> compiledSerializerImpl = kotlinx.serialization.internal.PlatformKt.compiledSerializerImpl(kClass);
        return compiledSerializerImpl == null ? kotlinx.serialization.internal.PrimitivesKt.builtinSerializerOrNull(kClass) : compiledSerializerImpl;
    }

    public static final kotlinx.serialization.KSerializer<?> noCompiledSerializer(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        throw new kotlinx.serialization.SerializationException(kotlinx.serialization.internal.Platform_commonKt.notRegisteredMessage(str));
    }

    public static final kotlinx.serialization.KSerializer<?> noCompiledSerializer(kotlinx.serialization.modules.SerializersModule serializersModule, kotlin.reflect.KClass<?> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializersModule, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlinx.serialization.KSerializer<?> contextual$default = kotlinx.serialization.modules.SerializersModule.getContextual$default(serializersModule, kClass, null, 2, null);
        if (contextual$default != null) {
            return contextual$default;
        }
        kotlinx.serialization.internal.Platform_commonKt.serializerNotRegistered(kClass);
        throw new kotlin.KotlinNothingValueException();
    }

    public static final kotlinx.serialization.KSerializer<?> noCompiledSerializer(kotlinx.serialization.modules.SerializersModule serializersModule, kotlin.reflect.KClass<?> kClass, kotlinx.serialization.KSerializer<?>[] kSerializerArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializersModule, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializerArr, "");
        kotlinx.serialization.KSerializer<?> contextual = serializersModule.getContextual(kClass, kotlin.collections.ArraysKt.asList(kSerializerArr));
        if (contextual != null) {
            return contextual;
        }
        kotlinx.serialization.internal.Platform_commonKt.serializerNotRegistered(kClass);
        throw new kotlin.KotlinNothingValueException();
    }

    public static final kotlinx.serialization.KSerializer<?> moduleThenPolymorphic(kotlinx.serialization.modules.SerializersModule serializersModule, kotlin.reflect.KClass<?> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializersModule, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlinx.serialization.KSerializer<?> contextual$default = kotlinx.serialization.modules.SerializersModule.getContextual$default(serializersModule, kClass, null, 2, null);
        return contextual$default == null ? new kotlinx.serialization.PolymorphicSerializer(kClass) : contextual$default;
    }

    public static final kotlinx.serialization.KSerializer<?> moduleThenPolymorphic(kotlinx.serialization.modules.SerializersModule serializersModule, kotlin.reflect.KClass<?> kClass, kotlinx.serialization.KSerializer<?>[] kSerializerArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializersModule, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializerArr, "");
        kotlinx.serialization.KSerializer<?> contextual = serializersModule.getContextual(kClass, kotlin.collections.ArraysKt.asList(kSerializerArr));
        return contextual == null ? new kotlinx.serialization.PolymorphicSerializer(kClass) : contextual;
    }

    public static /* synthetic */ kotlin.reflect.KClassifier getHighSpeedVideoSizes() {
        throw new kotlinx.serialization.SerializationException("It is not possible to retrieve an array serializer using KClass alone, use KType instead or ArraySerializer factory");
    }

    public static final kotlinx.serialization.KSerializer<? extends java.lang.Object> parametrizedSerializerOrNull(kotlin.reflect.KClass<java.lang.Object> kClass, java.util.List<? extends kotlinx.serialization.KSerializer<java.lang.Object>> list, kotlin.jvm.functions.Function0<? extends kotlin.reflect.KClassifier> function0) {
        kotlinx.serialization.internal.ArrayListSerializer arrayListSerializer;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.Collection.class)) || kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.List.class)) || kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.List.class)) || kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.ArrayList.class))) {
            arrayListSerializer = new kotlinx.serialization.internal.ArrayListSerializer(list.get(0));
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.HashSet.class))) {
            arrayListSerializer = new kotlinx.serialization.internal.HashSetSerializer(list.get(0));
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.Set.class)) || kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.Set.class)) || kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.LinkedHashSet.class))) {
            arrayListSerializer = new kotlinx.serialization.internal.LinkedHashSetSerializer(list.get(0));
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.HashMap.class))) {
            arrayListSerializer = new kotlinx.serialization.internal.HashMapSerializer(list.get(0), list.get(1));
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.Map.class)) || kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.Map.class)) || kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.LinkedHashMap.class))) {
            arrayListSerializer = new kotlinx.serialization.internal.LinkedHashMapSerializer(list.get(0), list.get(1));
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.Map.Entry.class))) {
            arrayListSerializer = kotlinx.serialization.builtins.BuiltinSerializersKt.MapEntrySerializer(list.get(0), list.get(1));
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.Pair.class))) {
            arrayListSerializer = kotlinx.serialization.builtins.BuiltinSerializersKt.PairSerializer(list.get(0), list.get(1));
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.Triple.class))) {
            arrayListSerializer = kotlinx.serialization.builtins.BuiltinSerializersKt.TripleSerializer(list.get(0), list.get(1), list.get(2));
        } else if (kotlinx.serialization.internal.PlatformKt.isReferenceArray(kClass)) {
            kotlin.reflect.KClassifier invoke = function0.invoke();
            kotlin.jvm.internal.Intrinsics.checkNotNull(invoke, "");
            arrayListSerializer = kotlinx.serialization.builtins.BuiltinSerializersKt.ArraySerializer((kotlin.reflect.KClass) invoke, list.get(0));
        } else {
            arrayListSerializer = null;
        }
        if (arrayListSerializer != null) {
            return arrayListSerializer;
        }
        kotlinx.serialization.KSerializer[] kSerializerArr = (kotlinx.serialization.KSerializer[]) list.toArray(new kotlinx.serialization.KSerializer[0]);
        return kotlinx.serialization.internal.PlatformKt.constructSerializerForGivenTypeArgs(kClass, (kotlinx.serialization.KSerializer<java.lang.Object>[]) java.util.Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }
}
