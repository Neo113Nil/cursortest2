package kotlin.reflect.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a=\u0010\u0013\u001a\u00020\u0012\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\"&\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006*\u00020\u00000\u00000\u00040\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00190\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017\"\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017\"\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017\"<\u0010\u001c\u001a*\u0012&\u0012$\u0012\u001a\u0012\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00100\u001ej\u0002`\u001f\u0012\u0004\u0012\u00020\u00120\u001d0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017*0\b\u0002\u0010 \"\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00100\u001e2\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00100\u001e"}, d2 = {"", "T", "Ljava/lang/Class;", "jClass", "Lkotlin/reflect/jvm/internal/KClassImpl;", "getOrCreateKotlinClass", "(Ljava/lang/Class;)Lkotlin/reflect/jvm/internal/KClassImpl;", "Lkotlin/reflect/KDeclarationContainer;", "getOrCreateKotlinPackage", "(Ljava/lang/Class;)Lkotlin/reflect/KDeclarationContainer;", "", "clearCaches", "()V", "", "Lkotlin/reflect/KTypeProjection;", "arguments", "", "isMarkedNullable", "Lkotlin/reflect/KType;", "getOrCreateKType", "(Ljava/lang/Class;Ljava/util/List;Z)Lkotlin/reflect/KType;", "Lkotlin/reflect/jvm/internal/CacheByClass;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/reflect/jvm/internal/CacheByClass;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/reflect/jvm/internal/KPackageImpl;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlin/Pair;", "Lkotlin/reflect/jvm/internal/Key;", "Key"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CachesKt {
    private static final kotlin.reflect.jvm.internal.CacheByClass<kotlin.reflect.jvm.internal.KClassImpl<? extends java.lang.Object>> getHighSpeedVideoFpsRangesFor = kotlin.reflect.jvm.internal.CacheByClassKt.createCache(new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.CachesKt$$Lambda$0
        @Override // kotlin.jvm.functions.Function1
        public java.lang.Object invoke(java.lang.Object obj) {
            return kotlin.reflect.jvm.internal.CachesKt.getHighSpeedVideoFpsRangesFor((java.lang.Class) obj);
        }
    });
    private static final kotlin.reflect.jvm.internal.CacheByClass<kotlin.reflect.jvm.internal.KPackageImpl> getHighSpeedVideoSizes = kotlin.reflect.jvm.internal.CacheByClassKt.createCache(new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.CachesKt$$Lambda$1
        @Override // kotlin.jvm.functions.Function1
        public java.lang.Object invoke(java.lang.Object obj) {
            return kotlin.reflect.jvm.internal.CachesKt.getHighResolutionOutputSizeshNQ4ISI((java.lang.Class) obj);
        }
    });
    private static final kotlin.reflect.jvm.internal.CacheByClass<kotlin.reflect.KType> getHighSpeedVideoFpsRanges = kotlin.reflect.jvm.internal.CacheByClassKt.createCache(new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.CachesKt$$Lambda$2
        @Override // kotlin.jvm.functions.Function1
        public java.lang.Object invoke(java.lang.Object obj) {
            return kotlin.reflect.jvm.internal.CachesKt.getHighSpeedVideoFpsRanges((java.lang.Class) obj);
        }
    });
    private static final kotlin.reflect.jvm.internal.CacheByClass<kotlin.reflect.KType> Camera2StreamConfigurationMap = kotlin.reflect.jvm.internal.CacheByClassKt.createCache(new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.CachesKt$$Lambda$3
        @Override // kotlin.jvm.functions.Function1
        public java.lang.Object invoke(java.lang.Object obj) {
            return kotlin.reflect.jvm.internal.CachesKt.Camera2StreamConfigurationMap((java.lang.Class) obj);
        }
    });
    private static final kotlin.reflect.jvm.internal.CacheByClass<java.util.concurrent.ConcurrentHashMap<kotlin.Pair<java.util.List<kotlin.reflect.KTypeProjection>, java.lang.Boolean>, kotlin.reflect.KType>> getHighResolutionOutputSizeshNQ4ISI = kotlin.reflect.jvm.internal.CacheByClassKt.createCache(new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.CachesKt$$Lambda$4
        @Override // kotlin.jvm.functions.Function1
        public java.lang.Object invoke(java.lang.Object obj) {
            return kotlin.reflect.jvm.internal.CachesKt.getHighSpeedVideoSizes((java.lang.Class) obj);
        }
    });

    public static final <T> kotlin.reflect.jvm.internal.KClassImpl<T> getOrCreateKotlinClass(java.lang.Class<T> cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        kotlin.reflect.KAnnotatedElement kAnnotatedElement = getHighSpeedVideoFpsRangesFor.get(cls);
        kotlin.jvm.internal.Intrinsics.checkNotNull(kAnnotatedElement, "");
        return (kotlin.reflect.jvm.internal.KClassImpl) kAnnotatedElement;
    }

    public static final <T> kotlin.reflect.KDeclarationContainer getOrCreateKotlinPackage(java.lang.Class<T> cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        return getHighSpeedVideoSizes.get(cls);
    }

    public static final void clearCaches() {
        getHighSpeedVideoFpsRangesFor.clear();
        getHighSpeedVideoSizes.clear();
        getHighSpeedVideoFpsRanges.clear();
        Camera2StreamConfigurationMap.clear();
        getHighResolutionOutputSizeshNQ4ISI.clear();
    }

    public static final <T> kotlin.reflect.KType getOrCreateKType(java.lang.Class<T> cls, java.util.List<kotlin.reflect.KTypeProjection> list, boolean z) {
        kotlin.reflect.KType putIfAbsent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            if (z) {
                return Camera2StreamConfigurationMap.get(cls);
            }
            return getHighSpeedVideoFpsRanges.get(cls);
        }
        java.util.concurrent.ConcurrentHashMap<kotlin.Pair<java.util.List<kotlin.reflect.KTypeProjection>, java.lang.Boolean>, kotlin.reflect.KType> concurrentHashMap = getHighResolutionOutputSizeshNQ4ISI.get(cls);
        kotlin.Pair<java.util.List<kotlin.reflect.KTypeProjection>, java.lang.Boolean> pair = kotlin.TuplesKt.to(list, java.lang.Boolean.valueOf(z));
        kotlin.reflect.KType kType = concurrentHashMap.get(pair);
        if (kType == null && (putIfAbsent = concurrentHashMap.putIfAbsent(pair, (kType = kotlin.reflect.full.KClassifiers.createType(getOrCreateKotlinClass(cls), list, z, kotlin.collections.CollectionsKt.emptyList())))) != null) {
            kType = putIfAbsent;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(kType, "");
        return kType;
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.KClassImpl getHighSpeedVideoFpsRangesFor(java.lang.Class cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        return new kotlin.reflect.jvm.internal.KClassImpl(cls);
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.KPackageImpl getHighResolutionOutputSizeshNQ4ISI(java.lang.Class cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        return new kotlin.reflect.jvm.internal.KPackageImpl(cls);
    }

    static /* synthetic */ kotlin.reflect.KType getHighSpeedVideoFpsRanges(java.lang.Class cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        return kotlin.reflect.full.KClassifiers.createType(getOrCreateKotlinClass(cls), kotlin.collections.CollectionsKt.emptyList(), false, kotlin.collections.CollectionsKt.emptyList());
    }

    static /* synthetic */ kotlin.reflect.KType Camera2StreamConfigurationMap(java.lang.Class cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        return kotlin.reflect.full.KClassifiers.createType(getOrCreateKotlinClass(cls), kotlin.collections.CollectionsKt.emptyList(), true, kotlin.collections.CollectionsKt.emptyList());
    }

    static /* synthetic */ java.util.concurrent.ConcurrentHashMap getHighSpeedVideoSizes(java.lang.Class cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        return new java.util.concurrent.ConcurrentHashMap();
    }
}
