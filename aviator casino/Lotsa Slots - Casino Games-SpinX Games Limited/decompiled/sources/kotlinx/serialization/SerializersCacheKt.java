package kotlinx.serialization;

/* compiled from: SerializersCache.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u001aA\u0010\u0014\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u000f0\u00152\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0012\u001a\u00020\u0013H\u0000¢\u0006\u0002\u0010\u0019\u001a\u001b\u0010\u001a\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u001b*\u0006\u0012\u0002\b\u00030\u0011H\u0080\b\"$\u0010\u0000\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0004\"\u001e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\n8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0004\"\u001e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0004¨\u0006\u001c"}, d2 = {"SERIALIZERS_CACHE", "Lkotlinx/serialization/internal/SerializerCache;", "", "getSERIALIZERS_CACHE$annotations", "()V", "getSERIALIZERS_CACHE", "()Lkotlinx/serialization/internal/SerializerCache;", "SERIALIZERS_CACHE_NULLABLE", "getSERIALIZERS_CACHE_NULLABLE$annotations", "PARAMETRIZED_SERIALIZERS_CACHE", "Lkotlinx/serialization/internal/ParametrizedSerializerCache;", "getPARAMETRIZED_SERIALIZERS_CACHE$annotations", "PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE", "getPARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$annotations", "findCachedSerializer", "Lkotlinx/serialization/KSerializer;", "clazz", "Lkotlin/reflect/KClass;", "isNullable", "", "findParametrizedCachedSerializer", "Lkotlin/Result;", "types", "", "Lkotlin/reflect/KType;", "(Lkotlin/reflect/KClass;Ljava/util/List;Z)Ljava/lang/Object;", "polymorphicIfInterface", "Lkotlinx/serialization/PolymorphicSerializer;", "kotlinx-serialization-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SerializersCacheKt {
    private static final kotlinx.serialization.internal.SerializerCache<? extends java.lang.Object> SERIALIZERS_CACHE = kotlinx.serialization.internal.CachingKt.createCache(new kotlin.jvm.functions.Function1() { // from class: kotlinx.serialization.SerializersCacheKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            kotlinx.serialization.KSerializer SERIALIZERS_CACHE$lambda$0;
            SERIALIZERS_CACHE$lambda$0 = kotlinx.serialization.SerializersCacheKt.SERIALIZERS_CACHE$lambda$0((kotlin.reflect.KClass) obj);
            return SERIALIZERS_CACHE$lambda$0;
        }
    });
    private static final kotlinx.serialization.internal.SerializerCache<java.lang.Object> SERIALIZERS_CACHE_NULLABLE = kotlinx.serialization.internal.CachingKt.createCache(new kotlin.jvm.functions.Function1() { // from class: kotlinx.serialization.SerializersCacheKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            kotlinx.serialization.KSerializer SERIALIZERS_CACHE_NULLABLE$lambda$1;
            SERIALIZERS_CACHE_NULLABLE$lambda$1 = kotlinx.serialization.SerializersCacheKt.SERIALIZERS_CACHE_NULLABLE$lambda$1((kotlin.reflect.KClass) obj);
            return SERIALIZERS_CACHE_NULLABLE$lambda$1;
        }
    });
    private static final kotlinx.serialization.internal.ParametrizedSerializerCache<? extends java.lang.Object> PARAMETRIZED_SERIALIZERS_CACHE = kotlinx.serialization.internal.CachingKt.createParametrizedCache(new kotlin.jvm.functions.Function2() { // from class: kotlinx.serialization.SerializersCacheKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            kotlinx.serialization.KSerializer PARAMETRIZED_SERIALIZERS_CACHE$lambda$3;
            PARAMETRIZED_SERIALIZERS_CACHE$lambda$3 = kotlinx.serialization.SerializersCacheKt.PARAMETRIZED_SERIALIZERS_CACHE$lambda$3((kotlin.reflect.KClass) obj, (java.util.List) obj2);
            return PARAMETRIZED_SERIALIZERS_CACHE$lambda$3;
        }
    });
    private static final kotlinx.serialization.internal.ParametrizedSerializerCache<java.lang.Object> PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE = kotlinx.serialization.internal.CachingKt.createParametrizedCache(new kotlin.jvm.functions.Function2() { // from class: kotlinx.serialization.SerializersCacheKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            kotlinx.serialization.KSerializer PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5;
            PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5 = kotlinx.serialization.SerializersCacheKt.PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5((kotlin.reflect.KClass) obj, (java.util.List) obj2);
            return PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5;
        }
    });

    private static /* synthetic */ void getPARAMETRIZED_SERIALIZERS_CACHE$annotations() {
    }

    private static /* synthetic */ void getPARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$annotations() {
    }

    public static /* synthetic */ void getSERIALIZERS_CACHE$annotations() {
    }

    private static /* synthetic */ void getSERIALIZERS_CACHE_NULLABLE$annotations() {
    }

    public static final kotlinx.serialization.internal.SerializerCache<? extends java.lang.Object> getSERIALIZERS_CACHE() {
        return SERIALIZERS_CACHE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.serialization.KSerializer SERIALIZERS_CACHE$lambda$0(kotlin.reflect.KClass it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        kotlinx.serialization.KSerializer serializerOrNull = kotlinx.serialization.SerializersKt.serializerOrNull(it);
        if (serializerOrNull == null) {
            return kotlinx.serialization.internal.PlatformKt.isInterface(it) ? new kotlinx.serialization.PolymorphicSerializer(it) : null;
        }
        return serializerOrNull;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.serialization.KSerializer SERIALIZERS_CACHE_NULLABLE$lambda$1(kotlin.reflect.KClass it) {
        kotlinx.serialization.KSerializer nullable;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        kotlinx.serialization.PolymorphicSerializer serializerOrNull = kotlinx.serialization.SerializersKt.serializerOrNull(it);
        if (serializerOrNull == null) {
            serializerOrNull = kotlinx.serialization.internal.PlatformKt.isInterface(it) ? new kotlinx.serialization.PolymorphicSerializer(it) : null;
        }
        if (serializerOrNull == null || (nullable = kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(serializerOrNull)) == null) {
            return null;
        }
        return nullable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.serialization.KSerializer PARAMETRIZED_SERIALIZERS_CACHE$lambda$3(kotlin.reflect.KClass clazz, final java.util.List types) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clazz, "clazz");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(types, "types");
        java.util.List<kotlinx.serialization.KSerializer<java.lang.Object>> serializersForParameters = kotlinx.serialization.SerializersKt.serializersForParameters(kotlinx.serialization.modules.SerializersModuleBuildersKt.EmptySerializersModule(), types, true);
        kotlin.jvm.internal.Intrinsics.checkNotNull(serializersForParameters);
        return kotlinx.serialization.SerializersKt.parametrizedSerializerOrNull(clazz, serializersForParameters, new kotlin.jvm.functions.Function0() { // from class: kotlinx.serialization.SerializersCacheKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.reflect.KClassifier PARAMETRIZED_SERIALIZERS_CACHE$lambda$3$lambda$2;
                PARAMETRIZED_SERIALIZERS_CACHE$lambda$3$lambda$2 = kotlinx.serialization.SerializersCacheKt.PARAMETRIZED_SERIALIZERS_CACHE$lambda$3$lambda$2(types);
                return PARAMETRIZED_SERIALIZERS_CACHE$lambda$3$lambda$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.reflect.KClassifier PARAMETRIZED_SERIALIZERS_CACHE$lambda$3$lambda$2(java.util.List list) {
        return ((kotlin.reflect.KType) list.get(0)).getClassifier();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.serialization.KSerializer PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5(kotlin.reflect.KClass clazz, final java.util.List types) {
        kotlinx.serialization.KSerializer nullable;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clazz, "clazz");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(types, "types");
        java.util.List<kotlinx.serialization.KSerializer<java.lang.Object>> serializersForParameters = kotlinx.serialization.SerializersKt.serializersForParameters(kotlinx.serialization.modules.SerializersModuleBuildersKt.EmptySerializersModule(), types, true);
        kotlin.jvm.internal.Intrinsics.checkNotNull(serializersForParameters);
        kotlinx.serialization.KSerializer<? extends java.lang.Object> parametrizedSerializerOrNull = kotlinx.serialization.SerializersKt.parametrizedSerializerOrNull(clazz, serializersForParameters, new kotlin.jvm.functions.Function0() { // from class: kotlinx.serialization.SerializersCacheKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.reflect.KClassifier PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5$lambda$4;
                PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5$lambda$4 = kotlinx.serialization.SerializersCacheKt.PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5$lambda$4(types);
                return PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5$lambda$4;
            }
        });
        if (parametrizedSerializerOrNull == null || (nullable = kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(parametrizedSerializerOrNull)) == null) {
            return null;
        }
        return nullable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.reflect.KClassifier PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5$lambda$4(java.util.List list) {
        return ((kotlin.reflect.KType) list.get(0)).getClassifier();
    }

    public static final kotlinx.serialization.KSerializer<java.lang.Object> findCachedSerializer(kotlin.reflect.KClass<java.lang.Object> clazz, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (!z) {
            kotlinx.serialization.KSerializer<? extends java.lang.Object> kSerializer = SERIALIZERS_CACHE.get(clazz);
            if (kSerializer != null) {
                return kSerializer;
            }
            return null;
        }
        return SERIALIZERS_CACHE_NULLABLE.get(clazz);
    }

    public static final java.lang.Object findParametrizedCachedSerializer(kotlin.reflect.KClass<java.lang.Object> clazz, java.util.List<? extends kotlin.reflect.KType> types, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clazz, "clazz");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(types, "types");
        if (!z) {
            return PARAMETRIZED_SERIALIZERS_CACHE.mo12403getgIAlus(clazz, types);
        }
        return PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE.mo12403getgIAlus(clazz, types);
    }

    public static final kotlinx.serialization.PolymorphicSerializer<? extends java.lang.Object> polymorphicIfInterface(kotlin.reflect.KClass<?> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "<this>");
        if (kotlinx.serialization.internal.PlatformKt.isInterface(kClass)) {
            return new kotlinx.serialization.PolymorphicSerializer<>(kClass);
        }
        return null;
    }
}
