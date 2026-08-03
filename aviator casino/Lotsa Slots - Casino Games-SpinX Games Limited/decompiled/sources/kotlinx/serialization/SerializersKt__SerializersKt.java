package kotlinx.serialization;

/* compiled from: Serializers.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001H\u0086\b\u001a\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\u0086\b\u001a\u0016\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u0006\u001a6\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0010\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007\u001a\u0018\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u001a\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006\u001a:\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001*\u00020\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0010\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007\u001a\u001c\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006\u001a+\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0002\b\u0010\u001aG\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0001*\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002¢\u0006\u0002\b\u0013\u001a2\u0010\u0014\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001\u0018\u00010\n*\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u000f\u001a\u00020\fH\u0000\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00020\bH\u0007\u001a$\u0010\r\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00020\bH\u0007\u001aB\u0010\u0016\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00040\b2\u0014\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00010\n2\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019H\u0000\u001a7\u0010\u001b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00040\b2\u0014\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00010\nH\u0002¢\u0006\u0002\b\u001c\u001aG\u0010\u001d\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00040\b2\u0014\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00010\n2\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019H\u0002¢\u0006\u0002\b\u001e\u001a1\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010 \u001a\u00020\fH\u0002¢\u0006\u0002\b!\u001a\u0014\u0010\"\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010#\u001a\u00020$H\u0001\u001a \u0010\"\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010%\u001a\u00020\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0001\u001a7\u0010\"\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010%\u001a\u00020\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0010\u0010&\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010'H\u0001¢\u0006\u0002\u0010(\u001a \u0010)\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010%\u001a\u00020\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0001\u001a7\u0010)\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010%\u001a\u00020\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0010\u0010&\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010'H\u0001¢\u0006\u0002\u0010(¨\u0006*"}, d2 = {"serializer", "Lkotlinx/serialization/KSerializer;", "T", "Lkotlinx/serialization/modules/SerializersModule;", "", "type", "Lkotlin/reflect/KType;", "kClass", "Lkotlin/reflect/KClass;", "typeArgumentsSerializers", "", "isNullable", "", "serializerOrNull", "serializerByKTypeImpl", "failOnMissingTypeArgSerializer", "serializerByKTypeImpl$SerializersKt__SerializersKt", "serializerByKClassImpl", "rootClass", "serializerByKClassImpl$SerializersKt__SerializersKt", "serializersForParameters", "typeArguments", "parametrizedSerializerOrNull", "serializers", "elementClassifierIfArray", "Lkotlin/Function0;", "Lkotlin/reflect/KClassifier;", "compiledParametrizedSerializer", "compiledParametrizedSerializer$SerializersKt__SerializersKt", "builtinParametrizedSerializer", "builtinParametrizedSerializer$SerializersKt__SerializersKt", "nullable", "shouldBeNullable", "nullable$SerializersKt__SerializersKt", "noCompiledSerializer", "forClass", "", "module", "argSerializers", "", "(Lkotlinx/serialization/modules/SerializersModule;Lkotlin/reflect/KClass;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "moduleThenPolymorphic", "kotlinx-serialization-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/serialization/SerializersKt")
/* loaded from: classes6.dex */
final /* synthetic */ class SerializersKt__SerializersKt {
    public static final /* synthetic */ <T> kotlinx.serialization.KSerializer<T> serializer() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlinx.serialization.KSerializer serializer = kotlinx.serialization.SerializersKt.serializer((kotlin.reflect.KType) null);
        kotlin.jvm.internal.Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return serializer;
    }

    public static final /* synthetic */ <T> kotlinx.serialization.KSerializer<T> serializer(kotlinx.serialization.modules.SerializersModule serializersModule) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializersModule, "<this>");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlinx.serialization.KSerializer serializer = kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null);
        kotlin.jvm.internal.Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return serializer;
    }

    public static final kotlinx.serialization.KSerializer<java.lang.Object> serializer(kotlin.reflect.KType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        return kotlinx.serialization.SerializersKt.serializer(kotlinx.serialization.modules.SerializersModuleBuildersKt.EmptySerializersModule(), type);
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final kotlinx.serialization.KSerializer<java.lang.Object> serializer(kotlin.reflect.KClass<?> kClass, java.util.List<? extends kotlinx.serialization.KSerializer<?>> typeArgumentsSerializers, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "kClass");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        return kotlinx.serialization.SerializersKt.serializer(kotlinx.serialization.modules.SerializersModuleBuildersKt.EmptySerializersModule(), kClass, typeArgumentsSerializers, z);
    }

    public static final kotlinx.serialization.KSerializer<java.lang.Object> serializerOrNull(kotlin.reflect.KType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        return kotlinx.serialization.SerializersKt.serializerOrNull(kotlinx.serialization.modules.SerializersModuleBuildersKt.EmptySerializersModule(), type);
    }

    public static final kotlinx.serialization.KSerializer<java.lang.Object> serializer(kotlinx.serialization.modules.SerializersModule serializersModule, kotlin.reflect.KType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializersModule, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        kotlinx.serialization.KSerializer<java.lang.Object> serializerByKTypeImpl$SerializersKt__SerializersKt = serializerByKTypeImpl$SerializersKt__SerializersKt(serializersModule, type, true);
        if (serializerByKTypeImpl$SerializersKt__SerializersKt != null) {
            return serializerByKTypeImpl$SerializersKt__SerializersKt;
        }
        kotlinx.serialization.internal.PlatformKt.platformSpecificSerializerNotRegistered(kotlinx.serialization.internal.Platform_commonKt.kclass(type));
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final kotlinx.serialization.KSerializer<java.lang.Object> serializer(kotlinx.serialization.modules.SerializersModule serializersModule, kotlin.reflect.KClass<?> kClass, java.util.List<? extends kotlinx.serialization.KSerializer<?>> typeArgumentsSerializers, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializersModule, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "kClass");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        kotlinx.serialization.KSerializer<java.lang.Object> serializerByKClassImpl$SerializersKt__SerializersKt = serializerByKClassImpl$SerializersKt__SerializersKt(serializersModule, kClass, typeArgumentsSerializers, z);
        if (serializerByKClassImpl$SerializersKt__SerializersKt != null) {
            return serializerByKClassImpl$SerializersKt__SerializersKt;
        }
        kotlinx.serialization.internal.PlatformKt.platformSpecificSerializerNotRegistered(kClass);
        throw new kotlin.KotlinNothingValueException();
    }

    public static final kotlinx.serialization.KSerializer<java.lang.Object> serializerOrNull(kotlinx.serialization.modules.SerializersModule serializersModule, kotlin.reflect.KType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializersModule, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        return serializerByKTypeImpl$SerializersKt__SerializersKt(serializersModule, type, false);
    }

    private static final kotlinx.serialization.KSerializer<java.lang.Object> serializerByKTypeImpl$SerializersKt__SerializersKt(kotlinx.serialization.modules.SerializersModule serializersModule, kotlin.reflect.KType kType, boolean z) {
        kotlinx.serialization.KSerializer<java.lang.Object> kSerializer;
        kotlinx.serialization.PolymorphicSerializer polymorphicSerializer;
        kotlin.reflect.KClass<java.lang.Object> kclass = kotlinx.serialization.internal.Platform_commonKt.kclass(kType);
        boolean isMarkedNullable = kType.isMarkedNullable();
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
                if (kotlin.Result.m10804isFailureimpl(findParametrizedCachedSerializer)) {
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
                    kotlin.reflect.KClassifier serializerByKTypeImpl$lambda$0$SerializersKt__SerializersKt;
                    serializerByKTypeImpl$lambda$0$SerializersKt__SerializersKt = kotlinx.serialization.SerializersKt__SerializersKt.serializerByKTypeImpl$lambda$0$SerializersKt__SerializersKt(arrayList2);
                    return serializerByKTypeImpl$lambda$0$SerializersKt__SerializersKt;
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
        if (polymorphicSerializer != null) {
            return nullable$SerializersKt__SerializersKt(polymorphicSerializer, isMarkedNullable);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.reflect.KClassifier serializerByKTypeImpl$lambda$0$SerializersKt__SerializersKt(java.util.List list) {
        return ((kotlin.reflect.KType) list.get(0)).getClassifier();
    }

    private static final kotlinx.serialization.KSerializer<java.lang.Object> serializerByKClassImpl$SerializersKt__SerializersKt(kotlinx.serialization.modules.SerializersModule serializersModule, kotlin.reflect.KClass<java.lang.Object> kClass, java.util.List<? extends kotlinx.serialization.KSerializer<java.lang.Object>> list, boolean z) {
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
                        kotlin.reflect.KClassifier serializerByKClassImpl$lambda$1$SerializersKt__SerializersKt;
                        serializerByKClassImpl$lambda$1$SerializersKt__SerializersKt = kotlinx.serialization.SerializersKt__SerializersKt.serializerByKClassImpl$lambda$1$SerializersKt__SerializersKt();
                        return serializerByKClassImpl$lambda$1$SerializersKt__SerializersKt;
                    }
                });
                contextual = parametrizedSerializerOrNull == null ? serializersModule.getContextual(kClass, list) : parametrizedSerializerOrNull;
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new kotlinx.serialization.SerializationException("Unable to retrieve a serializer, the number of passed type serializers differs from the actual number of generic parameters", e);
            }
        }
        if (contextual != null) {
            return nullable$SerializersKt__SerializersKt(contextual, z);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.reflect.KClassifier serializerByKClassImpl$lambda$1$SerializersKt__SerializersKt() {
        throw new kotlinx.serialization.SerializationException("It is not possible to retrieve an array serializer using KClass alone, use KType instead or ArraySerializer factory");
    }

    public static final java.util.List<kotlinx.serialization.KSerializer<java.lang.Object>> serializersForParameters(kotlinx.serialization.modules.SerializersModule serializersModule, java.util.List<? extends kotlin.reflect.KType> typeArguments, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializersModule, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        if (z) {
            java.util.List<? extends kotlin.reflect.KType> list = typeArguments;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) it.next()));
            }
            return arrayList;
        }
        java.util.List<? extends kotlin.reflect.KType> list2 = typeArguments;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it2 = list2.iterator();
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
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "<this>");
        kotlinx.serialization.KSerializer<T> serializerOrNull = kotlinx.serialization.SerializersKt.serializerOrNull(kClass);
        if (serializerOrNull != null) {
            return serializerOrNull;
        }
        kotlinx.serialization.internal.Platform_commonKt.serializerNotRegistered(kClass);
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlinx.serialization.InternalSerializationApi
    public static final <T> kotlinx.serialization.KSerializer<T> serializerOrNull(kotlin.reflect.KClass<T> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "<this>");
        kotlinx.serialization.KSerializer<T> compiledSerializerImpl = kotlinx.serialization.internal.PlatformKt.compiledSerializerImpl(kClass);
        return compiledSerializerImpl == null ? kotlinx.serialization.internal.PrimitivesKt.builtinSerializerOrNull(kClass) : compiledSerializerImpl;
    }

    public static final kotlinx.serialization.KSerializer<? extends java.lang.Object> parametrizedSerializerOrNull(kotlin.reflect.KClass<java.lang.Object> kClass, java.util.List<? extends kotlinx.serialization.KSerializer<java.lang.Object>> serializers, kotlin.jvm.functions.Function0<? extends kotlin.reflect.KClassifier> elementClassifierIfArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializers, "serializers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elementClassifierIfArray, "elementClassifierIfArray");
        kotlinx.serialization.KSerializer<? extends java.lang.Object> builtinParametrizedSerializer$SerializersKt__SerializersKt = builtinParametrizedSerializer$SerializersKt__SerializersKt(kClass, serializers, elementClassifierIfArray);
        return builtinParametrizedSerializer$SerializersKt__SerializersKt == null ? compiledParametrizedSerializer$SerializersKt__SerializersKt(kClass, serializers) : builtinParametrizedSerializer$SerializersKt__SerializersKt;
    }

    private static final kotlinx.serialization.KSerializer<? extends java.lang.Object> compiledParametrizedSerializer$SerializersKt__SerializersKt(kotlin.reflect.KClass<java.lang.Object> kClass, java.util.List<? extends kotlinx.serialization.KSerializer<java.lang.Object>> list) {
        kotlinx.serialization.KSerializer[] kSerializerArr = (kotlinx.serialization.KSerializer[]) list.toArray(new kotlinx.serialization.KSerializer[0]);
        return kotlinx.serialization.internal.PlatformKt.constructSerializerForGivenTypeArgs(kClass, (kotlinx.serialization.KSerializer<java.lang.Object>[]) java.util.Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    private static final kotlinx.serialization.KSerializer<? extends java.lang.Object> builtinParametrizedSerializer$SerializersKt__SerializersKt(kotlin.reflect.KClass<java.lang.Object> kClass, java.util.List<? extends kotlinx.serialization.KSerializer<java.lang.Object>> list, kotlin.jvm.functions.Function0<? extends kotlin.reflect.KClassifier> function0) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.Collection.class)) || kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.List.class)) || kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.List.class)) || kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.ArrayList.class))) {
            return new kotlinx.serialization.internal.ArrayListSerializer(list.get(0));
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.HashSet.class))) {
            return new kotlinx.serialization.internal.HashSetSerializer(list.get(0));
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.Set.class)) || kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.Set.class)) || kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.LinkedHashSet.class))) {
            return new kotlinx.serialization.internal.LinkedHashSetSerializer(list.get(0));
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.HashMap.class))) {
            return new kotlinx.serialization.internal.HashMapSerializer(list.get(0), list.get(1));
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.Map.class)) || kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.Map.class)) || kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.LinkedHashMap.class))) {
            return new kotlinx.serialization.internal.LinkedHashMapSerializer(list.get(0), list.get(1));
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.Map.Entry.class))) {
            return kotlinx.serialization.builtins.BuiltinSerializersKt.MapEntrySerializer(list.get(0), list.get(1));
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.Pair.class))) {
            return kotlinx.serialization.builtins.BuiltinSerializersKt.PairSerializer(list.get(0), list.get(1));
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(kClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.Triple.class))) {
            return kotlinx.serialization.builtins.BuiltinSerializersKt.TripleSerializer(list.get(0), list.get(1), list.get(2));
        }
        if (!kotlinx.serialization.internal.PlatformKt.isReferenceArray(kClass)) {
            return null;
        }
        kotlin.reflect.KClassifier invoke = function0.invoke();
        kotlin.jvm.internal.Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        return kotlinx.serialization.builtins.BuiltinSerializersKt.ArraySerializer((kotlin.reflect.KClass) invoke, list.get(0));
    }

    private static final <T> kotlinx.serialization.KSerializer<T> nullable$SerializersKt__SerializersKt(kotlinx.serialization.KSerializer<T> kSerializer, boolean z) {
        if (z) {
            return kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kSerializer);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
        return kSerializer;
    }

    public static final kotlinx.serialization.KSerializer<?> noCompiledSerializer(java.lang.String forClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(forClass, "forClass");
        throw new kotlinx.serialization.SerializationException(kotlinx.serialization.internal.Platform_commonKt.notRegisteredMessage(forClass));
    }

    public static final kotlinx.serialization.KSerializer<?> noCompiledSerializer(kotlinx.serialization.modules.SerializersModule module, kotlin.reflect.KClass<?> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(module, "module");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "kClass");
        kotlinx.serialization.KSerializer<?> contextual$default = kotlinx.serialization.modules.SerializersModule.getContextual$default(module, kClass, null, 2, null);
        if (contextual$default != null) {
            return contextual$default;
        }
        kotlinx.serialization.internal.Platform_commonKt.serializerNotRegistered(kClass);
        throw new kotlin.KotlinNothingValueException();
    }

    public static final kotlinx.serialization.KSerializer<?> noCompiledSerializer(kotlinx.serialization.modules.SerializersModule module, kotlin.reflect.KClass<?> kClass, kotlinx.serialization.KSerializer<?>[] argSerializers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(module, "module");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "kClass");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(argSerializers, "argSerializers");
        kotlinx.serialization.KSerializer<?> contextual = module.getContextual(kClass, kotlin.collections.ArraysKt.asList(argSerializers));
        if (contextual != null) {
            return contextual;
        }
        kotlinx.serialization.internal.Platform_commonKt.serializerNotRegistered(kClass);
        throw new kotlin.KotlinNothingValueException();
    }

    public static final kotlinx.serialization.KSerializer<?> moduleThenPolymorphic(kotlinx.serialization.modules.SerializersModule module, kotlin.reflect.KClass<?> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(module, "module");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "kClass");
        kotlinx.serialization.KSerializer<?> contextual$default = kotlinx.serialization.modules.SerializersModule.getContextual$default(module, kClass, null, 2, null);
        return contextual$default == null ? new kotlinx.serialization.PolymorphicSerializer(kClass) : contextual$default;
    }

    public static final kotlinx.serialization.KSerializer<?> moduleThenPolymorphic(kotlinx.serialization.modules.SerializersModule module, kotlin.reflect.KClass<?> kClass, kotlinx.serialization.KSerializer<?>[] argSerializers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(module, "module");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "kClass");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(argSerializers, "argSerializers");
        kotlinx.serialization.KSerializer<?> contextual = module.getContextual(kClass, kotlin.collections.ArraysKt.asList(argSerializers));
        return contextual == null ? new kotlinx.serialization.PolymorphicSerializer(kClass) : contextual;
    }
}
