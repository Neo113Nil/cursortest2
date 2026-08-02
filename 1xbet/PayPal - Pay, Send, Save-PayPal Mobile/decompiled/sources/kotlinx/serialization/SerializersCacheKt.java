package kotlinx.serialization;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aC\u0010\f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00050\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\"\u0010\u000f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u000e*\u0006\u0012\u0002\b\u00030\u0000H\u0080\b¢\u0006\u0004\b\u000f\u0010\u0010\"\"\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00118\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013\"\u001c\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001a"}, d2 = {"Lkotlin/reflect/KClass;", "", "clazz", "", "isNullable", "Lkotlinx/serialization/KSerializer;", "findCachedSerializer", "(Lkotlin/reflect/KClass;Z)Lkotlinx/serialization/KSerializer;", "", "Lkotlin/reflect/KType;", "types", "Lkotlin/Result;", "findParametrizedCachedSerializer", "(Lkotlin/reflect/KClass;Ljava/util/List;Z)Ljava/lang/Object;", "Lkotlinx/serialization/PolymorphicSerializer;", "polymorphicIfInterface", "(Lkotlin/reflect/KClass;)Lkotlinx/serialization/PolymorphicSerializer;", "Lkotlinx/serialization/internal/SerializerCache;", "SERIALIZERS_CACHE", "Lkotlinx/serialization/internal/SerializerCache;", "getSERIALIZERS_CACHE", "()Lkotlinx/serialization/internal/SerializerCache;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lkotlinx/serialization/internal/ParametrizedSerializerCache;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/serialization/internal/ParametrizedSerializerCache;", "Camera2StreamConfigurationMap"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SerializersCacheKt {
    private static final kotlinx.serialization.internal.SerializerCache<? extends java.lang.Object> SERIALIZERS_CACHE = kotlinx.serialization.internal.CachingKt.createCache(new kotlin.jvm.functions.Function1() { // from class: kotlinx.serialization.SerializersCacheKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return kotlinx.serialization.SerializersCacheKt.$r8$lambda$CDUGQm1n7K9pqzo8P9YZwMyhBIA((kotlin.reflect.KClass) obj);
        }
    });
    private static final kotlinx.serialization.internal.SerializerCache<java.lang.Object> getHighSpeedVideoSizes = kotlinx.serialization.internal.CachingKt.createCache(new kotlin.jvm.functions.Function1() { // from class: kotlinx.serialization.SerializersCacheKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return kotlinx.serialization.SerializersCacheKt.m24212$r8$lambda$O6dx0zm3R_yoJPVfPYH1wBLkak((kotlin.reflect.KClass) obj);
        }
    });
    private static final kotlinx.serialization.internal.ParametrizedSerializerCache<? extends java.lang.Object> getHighResolutionOutputSizeshNQ4ISI = kotlinx.serialization.internal.CachingKt.createParametrizedCache(new kotlin.jvm.functions.Function2() { // from class: kotlinx.serialization.SerializersCacheKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return kotlinx.serialization.SerializersCacheKt.m24213$r8$lambda$SdjQmoJUhxAtGA9kS8GNGdA4tM((kotlin.reflect.KClass) obj, (java.util.List) obj2);
        }
    });
    private static final kotlinx.serialization.internal.ParametrizedSerializerCache<java.lang.Object> getHighSpeedVideoFpsRanges = kotlinx.serialization.internal.CachingKt.createParametrizedCache(new kotlin.jvm.functions.Function2() { // from class: kotlinx.serialization.SerializersCacheKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return kotlinx.serialization.SerializersCacheKt.$r8$lambda$uKlWOz5AfxdrEgIbZPibMTSf1uM((kotlin.reflect.KClass) obj, (java.util.List) obj2);
        }
    });

    public static final kotlinx.serialization.internal.SerializerCache<? extends java.lang.Object> getSERIALIZERS_CACHE() {
        return SERIALIZERS_CACHE;
    }

    public static final kotlinx.serialization.KSerializer<java.lang.Object> findCachedSerializer(kotlin.reflect.KClass<java.lang.Object> kClass, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        if (!z) {
            kotlinx.serialization.KSerializer<? extends java.lang.Object> kSerializer = SERIALIZERS_CACHE.get(kClass);
            if (kSerializer != null) {
                return kSerializer;
            }
            return null;
        }
        return getHighSpeedVideoSizes.get(kClass);
    }

    public static final java.lang.Object findParametrizedCachedSerializer(kotlin.reflect.KClass<java.lang.Object> kClass, java.util.List<? extends kotlin.reflect.KType> list, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        if (!z) {
            return getHighResolutionOutputSizeshNQ4ISI.mo24214getgIAlus(kClass, list);
        }
        return getHighSpeedVideoFpsRanges.mo24214getgIAlus(kClass, list);
    }

    public static final kotlinx.serialization.PolymorphicSerializer<? extends java.lang.Object> polymorphicIfInterface(kotlin.reflect.KClass<?> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        if (kotlinx.serialization.internal.PlatformKt.isInterface(kClass)) {
            return new kotlinx.serialization.PolymorphicSerializer<>(kClass);
        }
        return null;
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$CDUGQm1n7K9pqzo8P9YZwMyhBIA(kotlin.reflect.KClass kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlinx.serialization.KSerializer serializerOrNull = kotlinx.serialization.SerializersKt.serializerOrNull(kClass);
        if (serializerOrNull == null) {
            return kotlinx.serialization.internal.PlatformKt.isInterface(kClass) ? new kotlinx.serialization.PolymorphicSerializer(kClass) : null;
        }
        return serializerOrNull;
    }

    /* renamed from: $r8$lambda$O6d-x0zm3R_yoJPVfPYH1wBLkak, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m24212$r8$lambda$O6dx0zm3R_yoJPVfPYH1wBLkak(kotlin.reflect.KClass kClass) {
        kotlinx.serialization.KSerializer nullable;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlinx.serialization.PolymorphicSerializer serializerOrNull = kotlinx.serialization.SerializersKt.serializerOrNull(kClass);
        if (serializerOrNull == null) {
            serializerOrNull = kotlinx.serialization.internal.PlatformKt.isInterface(kClass) ? new kotlinx.serialization.PolymorphicSerializer(kClass) : null;
        }
        if (serializerOrNull == null || (nullable = kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(serializerOrNull)) == null) {
            return null;
        }
        return nullable;
    }

    /* renamed from: $r8$lambda$SdjQmoJUhx-AtGA9kS8GNGdA4tM, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m24213$r8$lambda$SdjQmoJUhxAtGA9kS8GNGdA4tM(kotlin.reflect.KClass kClass, final java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.List<kotlinx.serialization.KSerializer<java.lang.Object>> serializersForParameters = kotlinx.serialization.SerializersKt.serializersForParameters(kotlinx.serialization.modules.SerializersModuleBuildersKt.EmptySerializersModule(), list, true);
        kotlin.jvm.internal.Intrinsics.checkNotNull(serializersForParameters);
        return kotlinx.serialization.SerializersKt.parametrizedSerializerOrNull(kClass, serializersForParameters, new kotlin.jvm.functions.Function0() { // from class: kotlinx.serialization.SerializersCacheKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.reflect.KClassifier classifier;
                classifier = ((kotlin.reflect.KType) list.get(0)).getClassifier();
                return classifier;
            }
        });
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$uKlWOz5AfxdrEgIbZPibMTSf1uM(kotlin.reflect.KClass kClass, final java.util.List list) {
        kotlinx.serialization.KSerializer nullable;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.List<kotlinx.serialization.KSerializer<java.lang.Object>> serializersForParameters = kotlinx.serialization.SerializersKt.serializersForParameters(kotlinx.serialization.modules.SerializersModuleBuildersKt.EmptySerializersModule(), list, true);
        kotlin.jvm.internal.Intrinsics.checkNotNull(serializersForParameters);
        kotlinx.serialization.KSerializer<? extends java.lang.Object> parametrizedSerializerOrNull = kotlinx.serialization.SerializersKt.parametrizedSerializerOrNull(kClass, serializersForParameters, new kotlin.jvm.functions.Function0() { // from class: kotlinx.serialization.SerializersCacheKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.reflect.KClassifier classifier;
                classifier = ((kotlin.reflect.KType) list.get(0)).getClassifier();
                return classifier;
            }
        });
        if (parametrizedSerializerOrNull == null || (nullable = kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(parametrizedSerializerOrNull)) == null) {
            return null;
        }
        return nullable;
    }
}
