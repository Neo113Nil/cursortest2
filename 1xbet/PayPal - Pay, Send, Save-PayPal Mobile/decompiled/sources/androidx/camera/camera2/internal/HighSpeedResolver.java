package androidx.camera.camera2.internal;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 -2\u00020\u0001:\u0001-B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J?\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\"\u0004\b\u0000\u0010\u00062\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\b2\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\b¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0016\u0018\u00010\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0006*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\bH\u0002¢\u0006\u0004\b\u0019\u0010\u0013J#\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00160\b2\u0006\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001b\u0010\"\u001a\u00020\u001f8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010'\u001a\u0004\u0018\u00010\t8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010&R\u001b\u0010\u001d\u001a\u00020(8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b\u0019\u0010*R!\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0\b8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b\u001b\u0010,"}, d2 = {"Landroidx/camera/camera2/internal/HighSpeedResolver;", "", "Landroidx/camera/camera2/pipe/CameraMetadata;", "cameraMetadata", "<init>", "(Landroidx/camera/camera2/pipe/CameraMetadata;)V", "T", "", "", "Landroid/util/Size;", "sizesMap", "filterCommonSupportedSizes", "(Ljava/util/Map;)Ljava/util/Map;", io.ktor.http.ContentDisposition.Parameters.Size, "", "getMaxFrameRate", "(Landroid/util/Size;)I", "sizesList", "getSizeArrangements", "(Ljava/util/List;)Ljava/util/List;", "surfaceSizes", "", "Landroid/util/Range;", "getFrameRateRangesFor", "(Ljava/util/List;)[Landroid/util/Range;", "getHighSpeedVideoSizes", "p0", "Camera2StreamConfigurationMap", "(Landroid/util/Size;)Ljava/util/List;", "getHighSpeedVideoFpsRanges", "Landroidx/camera/camera2/pipe/CameraMetadata;", "", "isHighSpeedSupported$delegate", "Lkotlin/Lazy;", "isHighSpeedSupported", "()Z", "maxSize$delegate", "getMaxSize", "()Landroid/util/Size;", "maxSize", "Landroidx/camera/camera2/compat/StreamConfigurationMapCompat;", "getHighSpeedVideoFpsRangesFor", "()Landroidx/camera/camera2/compat/StreamConfigurationMapCompat;", "getHighResolutionOutputSizeshNQ4ISI", "()Ljava/util/List;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HighSpeedResolver {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.internal.HighSpeedResolver.Companion INSTANCE = new androidx.camera.camera2.internal.HighSpeedResolver.Companion(null);
    private static final android.util.Range<java.lang.Integer> DEFAULT_FPS;
    private final kotlin.Lazy getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.CameraMetadata getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoFpsRanges;

    /* renamed from: isHighSpeedSupported$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy isHighSpeedSupported;

    /* renamed from: maxSize$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy maxSize;

    public HighSpeedResolver(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraMetadata, "");
        this.getHighSpeedVideoSizes = cameraMetadata;
        this.isHighSpeedSupported = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.camera.camera2.internal.HighSpeedResolver$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.camera.camera2.internal.HighSpeedResolver.$r8$lambda$O5QZeAnVoeGmQjN2Jc9dlH23mag(androidx.camera.camera2.internal.HighSpeedResolver.this));
            }
        });
        this.maxSize = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.camera.camera2.internal.HighSpeedResolver$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.camera.camera2.internal.HighSpeedResolver.$r8$lambda$ZNvvifbt712SApORMdG7iRlzVn4(androidx.camera.camera2.internal.HighSpeedResolver.this);
            }
        });
        this.getHighSpeedVideoFpsRanges = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.camera.camera2.internal.HighSpeedResolver$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.camera.camera2.internal.HighSpeedResolver.$r8$lambda$F31AeowgvxM3uU8JKUsYWGum9Ro(androidx.camera.camera2.internal.HighSpeedResolver.this);
            }
        });
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.camera.camera2.internal.HighSpeedResolver$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.camera.camera2.internal.HighSpeedResolver.$r8$lambda$y1qpmO2j3UYk6EnWiZS3G3Hx_Sw(androidx.camera.camera2.internal.HighSpeedResolver.this);
            }
        });
    }

    public final boolean isHighSpeedSupported() {
        return ((java.lang.Boolean) this.isHighSpeedSupported.getValue()).booleanValue();
    }

    public final android.util.Size getMaxSize() {
        return (android.util.Size) this.maxSize.getValue();
    }

    private final androidx.camera.camera2.compat.StreamConfigurationMapCompat getHighSpeedVideoSizes() {
        return (androidx.camera.camera2.compat.StreamConfigurationMapCompat) this.getHighSpeedVideoFpsRanges.getValue();
    }

    private final java.util.List<android.util.Size> Camera2StreamConfigurationMap() {
        return (java.util.List) this.getHighResolutionOutputSizeshNQ4ISI.getValue();
    }

    public final <T> java.util.Map<T, java.util.List<android.util.Size>> filterCommonSupportedSizes(java.util.Map<T, ? extends java.util.List<android.util.Size>> sizesMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sizesMap, "");
        java.util.List highSpeedVideoSizes = getHighSpeedVideoSizes(kotlin.collections.CollectionsKt.toList(sizesMap.values()));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (T t : highSpeedVideoSizes) {
            if (Camera2StreamConfigurationMap().contains((android.util.Size) t)) {
                arrayList.add(t);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(sizesMap.size()));
        java.util.Iterator<T> it = sizesMap.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.Object key = entry.getKey();
            java.util.List list = (java.util.List) entry.getValue();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (arrayList2.contains((android.util.Size) obj)) {
                    arrayList3.add(obj);
                }
            }
            linkedHashMap.put(key, arrayList3);
        }
        return linkedHashMap;
    }

    public final int getMaxFrameRate(android.util.Size size) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "");
        java.util.List<android.util.Range<java.lang.Integer>> Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(size);
        if (Camera2StreamConfigurationMap.isEmpty()) {
            Camera2StreamConfigurationMap = null;
        }
        if (Camera2StreamConfigurationMap == null) {
            androidx.camera.core.Logger.w("HighSpeedResolver", "No supported high speed  fps for ".concat(java.lang.String.valueOf(size)));
            return 0;
        }
        java.util.Iterator<T> it = Camera2StreamConfigurationMap.iterator();
        if (!it.hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Integer num = (java.lang.Integer) ((android.util.Range) it.next()).getUpper();
        while (it.hasNext()) {
            java.lang.Integer num2 = (java.lang.Integer) ((android.util.Range) it.next()).getUpper();
            if (num.compareTo(num2) < 0) {
                num = num2;
            }
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(num, "");
        return num.intValue();
    }

    public final java.util.List<java.util.List<android.util.Size>> getSizeArrangements(java.util.List<? extends java.util.List<android.util.Size>> sizesList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sizesList, "");
        if (sizesList.isEmpty()) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List<android.util.Size> highSpeedVideoSizes = getHighSpeedVideoSizes(sizesList);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(highSpeedVideoSizes, 10));
        for (android.util.Size size : highSpeedVideoSizes) {
            int size2 = sizesList.size();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(size2);
            for (int i = 0; i < size2; i++) {
                arrayList2.add(size);
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    public final android.util.Range<java.lang.Integer>[] getFrameRateRangesFor(java.util.List<android.util.Size> surfaceSizes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surfaceSizes, "");
        int size = surfaceSizes.size();
        if (size <= 0 || size >= 3 || kotlin.collections.CollectionsKt.distinct(surfaceSizes).size() != 1) {
            return null;
        }
        java.util.ArrayList Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(surfaceSizes.get(0));
        if (Camera2StreamConfigurationMap.isEmpty()) {
            Camera2StreamConfigurationMap = null;
        }
        if (Camera2StreamConfigurationMap == null) {
            return null;
        }
        if (surfaceSizes.size() == 2) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : Camera2StreamConfigurationMap) {
                android.util.Range range = (android.util.Range) obj;
                if (kotlin.jvm.internal.Intrinsics.areEqual(range.getLower(), range.getUpper())) {
                    arrayList.add(obj);
                }
            }
            Camera2StreamConfigurationMap = arrayList;
        }
        return (android.util.Range[]) Camera2StreamConfigurationMap.toArray(new android.util.Range[0]);
    }

    private static <T> java.util.List<T> getHighSpeedVideoSizes(java.util.List<? extends java.util.List<? extends T>> list) {
        if (list.isEmpty()) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List<T> mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) kotlin.collections.CollectionsKt.first((java.util.List) list));
        java.util.Iterator<T> it = kotlin.collections.CollectionsKt.drop(list, 1).iterator();
        while (it.hasNext()) {
            mutableList.retainAll((java.util.List) it.next());
        }
        return mutableList;
    }

    private final java.util.List<android.util.Range<java.lang.Integer>> Camera2StreamConfigurationMap(android.util.Size p0) {
        java.lang.Object m23436constructorimpl;
        java.util.List filterNotNull;
        java.util.List<android.util.Range<java.lang.Integer>> list;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            androidx.camera.camera2.internal.HighSpeedResolver highSpeedResolver = this;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(getHighSpeedVideoSizes().getHighSpeedVideoFpsRangesFor(p0));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = null;
        }
        android.util.Range[] rangeArr = (android.util.Range[]) m23436constructorimpl;
        return (rangeArr == null || (filterNotNull = kotlin.collections.ArraysKt.filterNotNull(rangeArr)) == null || (list = kotlin.collections.CollectionsKt.toList(filterNotNull)) == null) ? kotlin.collections.CollectionsKt.emptyList() : list;
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/camera/camera2/internal/HighSpeedResolver$Companion;", "", "<init>", "()V", "", "Landroidx/camera/core/impl/AttachedSurfaceInfo;", "attachedSurfaces", "Landroidx/camera/core/impl/UseCaseConfig;", "newUseCaseConfigs", "", "isHighSpeedOn", "(Ljava/util/Collection;Ljava/util/Collection;)Z", "Landroid/util/Range;", "", "DEFAULT_FPS", "Landroid/util/Range;", "getDEFAULT_FPS", "()Landroid/util/Range;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final android.util.Range<java.lang.Integer> getDEFAULT_FPS() {
            return androidx.camera.camera2.internal.HighSpeedResolver.DEFAULT_FPS;
        }

        @kotlin.jvm.JvmStatic
        public final boolean isHighSpeedOn(java.util.Collection<? extends androidx.camera.core.impl.AttachedSurfaceInfo> attachedSurfaces, java.util.Collection<? extends androidx.camera.core.impl.UseCaseConfig<?>> newUseCaseConfigs) {
            boolean z;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attachedSurfaces, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newUseCaseConfigs, "");
            java.util.Collection<? extends androidx.camera.core.impl.AttachedSurfaceInfo> collection = attachedSurfaces;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collection, 10));
            java.util.Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Integer.valueOf(((androidx.camera.core.impl.AttachedSurfaceInfo) it.next()).getSessionType()));
            }
            java.util.ArrayList arrayList2 = arrayList;
            java.util.Collection<? extends androidx.camera.core.impl.UseCaseConfig<?>> collection2 = newUseCaseConfigs;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collection2, 10));
            java.util.Iterator<T> it2 = collection2.iterator();
            while (true) {
                z = false;
                if (!it2.hasNext()) {
                    break;
                }
                arrayList3.add(java.lang.Integer.valueOf(((androidx.camera.core.impl.UseCaseConfig) it2.next()).getSessionType(0)));
            }
            java.util.List plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) arrayList2, (java.lang.Iterable) arrayList3);
            boolean z2 = plus instanceof java.util.Collection;
            if (!z2 || !plus.isEmpty()) {
                java.util.Iterator it3 = plus.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (((java.lang.Number) it3.next()).intValue() == 1) {
                        z = true;
                        break;
                    }
                }
            }
            if (z) {
                if (z2 && plus.isEmpty()) {
                    return true;
                }
                java.util.Iterator it4 = plus.iterator();
                while (it4.hasNext()) {
                    if (((java.lang.Number) it4.next()).intValue() != 1) {
                        throw new java.lang.IllegalArgumentException("All sessionTypes should be high-speed when any of them is high-speed".toString());
                    }
                }
            }
            return z;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        java.lang.Integer num = (java.lang.Comparable) 120;
        DEFAULT_FPS = new android.util.Range<>(num, num);
    }

    public static /* synthetic */ androidx.camera.camera2.compat.StreamConfigurationMapCompat $r8$lambda$F31AeowgvxM3uU8JKUsYWGum9Ro(androidx.camera.camera2.internal.HighSpeedResolver highSpeedResolver) {
        androidx.camera.camera2.pipe.CameraMetadata cameraMetadata = highSpeedResolver.getHighSpeedVideoSizes;
        android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap = (android.hardware.camera2.params.StreamConfigurationMap) cameraMetadata.get(key);
        if (streamConfigurationMap == null) {
            throw new java.lang.IllegalArgumentException("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
        }
        return new androidx.camera.camera2.compat.StreamConfigurationMapCompat(streamConfigurationMap, new androidx.camera.camera2.compat.workaround.OutputSizesCorrector(highSpeedResolver.getHighSpeedVideoSizes, streamConfigurationMap));
    }

    public static /* synthetic */ boolean $r8$lambda$O5QZeAnVoeGmQjN2Jc9dlH23mag(androidx.camera.camera2.internal.HighSpeedResolver highSpeedResolver) {
        androidx.camera.camera2.pipe.CameraMetadata cameraMetadata = highSpeedResolver.getHighSpeedVideoSizes;
        android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        int[] iArr = (int[]) cameraMetadata.get(key);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 9) {
                    return true;
                }
            }
        }
        return false;
    }

    public static /* synthetic */ android.util.Size $r8$lambda$ZNvvifbt712SApORMdG7iRlzVn4(androidx.camera.camera2.internal.HighSpeedResolver highSpeedResolver) {
        java.util.List<android.util.Size> Camera2StreamConfigurationMap = highSpeedResolver.Camera2StreamConfigurationMap();
        if (Camera2StreamConfigurationMap.isEmpty()) {
            Camera2StreamConfigurationMap = null;
        }
        if (Camera2StreamConfigurationMap == null) {
            return null;
        }
        java.util.Iterator<T> it = Camera2StreamConfigurationMap.iterator();
        if (!it.hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object next = it.next();
        if (it.hasNext()) {
            int area = androidx.camera.core.internal.utils.SizeUtil.getArea((android.util.Size) next);
            do {
                java.lang.Object next2 = it.next();
                int area2 = androidx.camera.core.internal.utils.SizeUtil.getArea((android.util.Size) next2);
                if (area < area2) {
                    next = next2;
                    area = area2;
                }
            } while (it.hasNext());
        }
        return (android.util.Size) next;
    }

    public static /* synthetic */ java.util.List $r8$lambda$y1qpmO2j3UYk6EnWiZS3G3Hx_Sw(androidx.camera.camera2.internal.HighSpeedResolver highSpeedResolver) {
        java.util.List list;
        android.util.Size[] highSpeedVideoSizes = highSpeedResolver.getHighSpeedVideoSizes().getHighSpeedVideoSizes();
        return (highSpeedVideoSizes == null || (list = kotlin.collections.ArraysKt.toList(highSpeedVideoSizes)) == null) ? kotlin.collections.CollectionsKt.emptyList() : list;
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isHighSpeedOn(java.util.Collection<? extends androidx.camera.core.impl.AttachedSurfaceInfo> collection, java.util.Collection<? extends androidx.camera.core.impl.UseCaseConfig<?>> collection2) {
        return INSTANCE.isHighSpeedOn(collection, collection2);
    }
}
