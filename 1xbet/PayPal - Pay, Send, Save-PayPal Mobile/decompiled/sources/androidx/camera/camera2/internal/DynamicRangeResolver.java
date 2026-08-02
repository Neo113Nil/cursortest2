package androidx.camera.camera2.internal;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010\"\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001*B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJK\u0010\u0012\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0010\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u001a\u001a\u00020\u00192\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00142\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ5\u0010\u001e\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u001c2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u001dH\u0002¢\u0006\u0004\b\u001e\u0010 J\u001f\u0010!\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010&R\u0014\u0010)\u001a\u00020\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010("}, d2 = {"Landroidx/camera/camera2/internal/DynamicRangeResolver;", "", "Landroidx/camera/camera2/pipe/CameraMetadata;", "cameraMetadata", "<init>", "(Landroidx/camera/camera2/pipe/CameraMetadata;)V", "", "is10BitDynamicRangeSupported", "()Z", "", "Landroidx/camera/core/impl/AttachedSurfaceInfo;", "existingSurfaces", "Landroidx/camera/core/impl/UseCaseConfig;", "newUseCaseConfigs", "", "useCasePriorityOrder", "", "Landroidx/camera/core/DynamicRange;", "resolveAndValidateDynamicRanges", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/Map;", "", "p0", "p1", "Landroidx/camera/camera2/compat/DynamicRangeProfilesCompat;", "p2", "", "getHighSpeedVideoSizes", "(Ljava/util/Set;Landroidx/camera/core/DynamicRange;Landroidx/camera/camera2/compat/DynamicRangeProfilesCompat;)V", "", "", "getHighSpeedVideoFpsRangesFor", "(Landroidx/camera/core/DynamicRange;Ljava/util/Collection;Ljava/util/Set;)Landroidx/camera/core/DynamicRange;", "(Landroidx/camera/core/DynamicRange;Landroidx/camera/core/DynamicRange;Ljava/util/Set;)Z", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/camera/core/DynamicRange;Landroidx/camera/core/DynamicRange;)Z", "Landroidx/camera/camera2/pipe/CameraMetadata;", "getCameraMetadata", "()Landroidx/camera/camera2/pipe/CameraMetadata;", "Z", "getHighSpeedVideoFpsRanges", "Landroidx/camera/camera2/compat/DynamicRangeProfilesCompat;", "Camera2StreamConfigurationMap", "Api33Impl"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DynamicRangeResolver {
    private final androidx.camera.camera2.pipe.CameraMetadata cameraMetadata;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.camera.camera2.compat.DynamicRangeProfilesCompat Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoFpsRanges;

    public DynamicRangeResolver(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraMetadata, "");
        this.cameraMetadata = cameraMetadata;
        android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        int[] iArr = (int[]) cameraMetadata.get(key);
        this.getHighSpeedVideoFpsRanges = iArr != null ? kotlin.collections.ArraysKt.contains(iArr, 18) : false;
        this.Camera2StreamConfigurationMap = androidx.camera.camera2.compat.DynamicRangeProfilesCompat.INSTANCE.fromCameraMetaData(cameraMetadata);
    }

    public final androidx.camera.camera2.pipe.CameraMetadata getCameraMetadata() {
        return this.cameraMetadata;
    }

    /* renamed from: is10BitDynamicRangeSupported, reason: from getter */
    public final boolean getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, androidx.camera.core.DynamicRange> resolveAndValidateDynamicRanges(java.util.List<? extends androidx.camera.core.impl.AttachedSurfaceInfo> existingSurfaces, java.util.List<? extends androidx.camera.core.impl.UseCaseConfig<?>> newUseCaseConfigs, java.util.List<java.lang.Integer> useCasePriorityOrder) {
        androidx.camera.core.DynamicRange dynamicRange;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(existingSurfaces, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newUseCaseConfigs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCasePriorityOrder, "");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator<? extends androidx.camera.core.impl.AttachedSurfaceInfo> it = existingSurfaces.iterator();
        while (it.hasNext()) {
            androidx.camera.core.DynamicRange dynamicRange2 = it.next().getDynamicRange();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dynamicRange2, "");
            linkedHashSet.add(dynamicRange2);
        }
        java.util.Set<androidx.camera.core.DynamicRange> supportedDynamicRanges = this.Camera2StreamConfigurationMap.getSupportedDynamicRanges();
        java.util.Set<androidx.camera.core.DynamicRange> mutableSet = kotlin.collections.CollectionsKt.toMutableSet(supportedDynamicRanges);
        java.util.Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            getHighSpeedVideoSizes(mutableSet, (androidx.camera.core.DynamicRange) it2.next(), this.Camera2StreamConfigurationMap);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator<java.lang.Integer> it3 = useCasePriorityOrder.iterator();
        while (it3.hasNext()) {
            androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig = newUseCaseConfigs.get(it3.next().intValue());
            androidx.camera.core.DynamicRange dynamicRange3 = useCaseConfig.getDynamicRange();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dynamicRange3, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(dynamicRange3, androidx.camera.core.DynamicRange.UNSPECIFIED)) {
                arrayList3.add(useCaseConfig);
            } else if (dynamicRange3.getEncoding() == 2 || ((dynamicRange3.getEncoding() != 0 && dynamicRange3.getBitDepth() == 0) || (dynamicRange3.getEncoding() == 0 && dynamicRange3.getBitDepth() != 0))) {
                arrayList2.add(useCaseConfig);
            } else {
                arrayList.add(useCaseConfig);
            }
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
        java.util.ArrayList<androidx.camera.core.impl.UseCaseConfig> arrayList4 = new java.util.ArrayList();
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        for (androidx.camera.core.impl.UseCaseConfig useCaseConfig2 : arrayList4) {
            androidx.camera.core.DynamicRange dynamicRange4 = useCaseConfig2.getDynamicRange();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dynamicRange4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(useCaseConfig2.getTargetName(), "");
            androidx.camera.core.DynamicRange dynamicRange5 = null;
            if (dynamicRange4.isFullySpecified()) {
                if (mutableSet.contains(dynamicRange4)) {
                    dynamicRange5 = dynamicRange4;
                }
            } else {
                int encoding = dynamicRange4.getEncoding();
                int bitDepth = dynamicRange4.getBitDepth();
                if (encoding == 1 && bitDepth == 0) {
                    if (mutableSet.contains(androidx.camera.core.DynamicRange.SDR)) {
                        dynamicRange5 = androidx.camera.core.DynamicRange.SDR;
                    }
                } else {
                    androidx.camera.core.DynamicRange highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(dynamicRange4, linkedHashSet, mutableSet);
                    if (highSpeedVideoFpsRangesFor != null) {
                        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                        }
                    } else {
                        highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(dynamicRange4, linkedHashSet2, mutableSet);
                        if (highSpeedVideoFpsRangesFor != null) {
                            androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                            }
                        } else {
                            androidx.camera.core.DynamicRange dynamicRange6 = androidx.camera.core.DynamicRange.SDR;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dynamicRange6, "");
                            if (getHighSpeedVideoFpsRangesFor(dynamicRange4, dynamicRange6, mutableSet)) {
                                androidx.camera.camera2.impl.Camera2Logger camera2Logger3 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                    java.lang.String unused3 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                                    androidx.camera.core.DynamicRange dynamicRange7 = androidx.camera.core.DynamicRange.SDR;
                                }
                                dynamicRange5 = androidx.camera.core.DynamicRange.SDR;
                            } else {
                                if (encoding == 2 && (bitDepth == 10 || bitDepth == 0)) {
                                    java.util.LinkedHashSet linkedHashSet3 = new java.util.LinkedHashSet();
                                    if (android.os.Build.VERSION.SDK_INT >= 33) {
                                        dynamicRange = androidx.camera.camera2.internal.DynamicRangeResolver.Api33Impl.INSTANCE.getRecommended10BitDynamicRange(this.cameraMetadata);
                                        if (dynamicRange != null) {
                                            linkedHashSet3.add(dynamicRange);
                                        }
                                    } else {
                                        dynamicRange = null;
                                    }
                                    androidx.camera.core.DynamicRange dynamicRange8 = androidx.camera.core.DynamicRange.HLG_10_BIT;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dynamicRange8, "");
                                    linkedHashSet3.add(dynamicRange8);
                                    androidx.camera.core.DynamicRange highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(dynamicRange4, linkedHashSet3, mutableSet);
                                    if (highSpeedVideoFpsRangesFor2 != null) {
                                        androidx.camera.camera2.impl.Camera2Logger camera2Logger4 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                                        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                            java.lang.String unused4 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                                            kotlin.jvm.internal.Intrinsics.areEqual(highSpeedVideoFpsRangesFor2, dynamicRange);
                                        }
                                        dynamicRange5 = highSpeedVideoFpsRangesFor2;
                                    }
                                }
                                java.util.Iterator<androidx.camera.core.DynamicRange> it4 = mutableSet.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        break;
                                    }
                                    androidx.camera.core.DynamicRange next = it4.next();
                                    if (!next.isFullySpecified()) {
                                        throw new java.lang.IllegalStateException("Candidate dynamic range must be fully specified.".toString());
                                    }
                                    if (!kotlin.jvm.internal.Intrinsics.areEqual(next, androidx.camera.core.DynamicRange.SDR) && getHighResolutionOutputSizeshNQ4ISI(dynamicRange4, next)) {
                                        androidx.camera.camera2.impl.Camera2Logger camera2Logger5 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                                        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                            java.lang.String unused5 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                                        }
                                        dynamicRange5 = next;
                                    }
                                }
                            }
                        }
                    }
                    dynamicRange5 = highSpeedVideoFpsRangesFor;
                }
            }
            if (dynamicRange5 != null) {
                getHighSpeedVideoSizes(mutableSet, dynamicRange5, this.Camera2StreamConfigurationMap);
                linkedHashMap.put(useCaseConfig2, dynamicRange5);
                if (!linkedHashSet.contains(dynamicRange5)) {
                    linkedHashSet2.add(dynamicRange5);
                }
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  ");
                sb.append(useCaseConfig2.getTargetName());
                sb.append("\nRequested dynamic range:\n  ");
                sb.append(dynamicRange4);
                sb.append("\nSupported dynamic ranges:\n  ");
                sb.append(supportedDynamicRanges);
                sb.append("\nConstrained set of concurrent dynamic ranges:\n  ");
                sb.append(mutableSet);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        return linkedHashMap;
    }

    private static void getHighSpeedVideoSizes(java.util.Set<androidx.camera.core.DynamicRange> p0, androidx.camera.core.DynamicRange p1, androidx.camera.camera2.compat.DynamicRangeProfilesCompat p2) {
        java.util.Set<androidx.camera.core.DynamicRange> set = p0;
        androidx.core.util.Preconditions.checkState(!set.isEmpty(), "Cannot update already-empty constraints.");
        java.util.Set<androidx.camera.core.DynamicRange> dynamicRangeCaptureRequestConstraints = p2.getDynamicRangeCaptureRequestConstraints(p1);
        java.util.Set<androidx.camera.core.DynamicRange> set2 = dynamicRangeCaptureRequestConstraints;
        if (set2.isEmpty()) {
            return;
        }
        java.util.Set set3 = kotlin.collections.CollectionsKt.toSet(p0);
        p0.retainAll(set2);
        if (set.isEmpty()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  ");
            sb.append(p1);
            sb.append("\nConstraints:\n  ");
            sb.append(dynamicRangeCaptureRequestConstraints);
            sb.append("\nExisting constraints:\n  ");
            sb.append(set3);
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
    }

    private final androidx.camera.core.DynamicRange getHighSpeedVideoFpsRangesFor(androidx.camera.core.DynamicRange p0, java.util.Collection<androidx.camera.core.DynamicRange> p1, java.util.Set<androidx.camera.core.DynamicRange> p2) {
        if (p0.getEncoding() == 1) {
            return null;
        }
        for (androidx.camera.core.DynamicRange dynamicRange : p1) {
            int encoding = dynamicRange.getEncoding();
            if (!dynamicRange.isFullySpecified()) {
                throw new java.lang.IllegalStateException("Fully specified DynamicRange must have fully defined encoding.".toString());
            }
            if (encoding != 1 && getHighSpeedVideoFpsRangesFor(p0, dynamicRange, p2)) {
                return dynamicRange;
            }
        }
        return null;
    }

    private static boolean getHighSpeedVideoFpsRangesFor(androidx.camera.core.DynamicRange p0, androidx.camera.core.DynamicRange p1, java.util.Set<androidx.camera.core.DynamicRange> p2) {
        if (!p2.contains(p1)) {
            androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (!androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                return false;
            }
            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            return false;
        }
        return getHighResolutionOutputSizeshNQ4ISI(p0, p1);
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(androidx.camera.core.DynamicRange p0, androidx.camera.core.DynamicRange p1) {
        if (!p1.isFullySpecified()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Fully specified range ");
            sb.append(p1);
            sb.append(" not actually fully specified.");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        if (p0.getEncoding() == 2 && p1.getEncoding() == 1) {
            return false;
        }
        if (p0.getEncoding() == 2 || p0.getEncoding() == 0 || p0.getEncoding() == p1.getEncoding()) {
            return p0.getBitDepth() == 0 || p0.getBitDepth() == p1.getBitDepth();
        }
        return false;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/internal/DynamicRangeResolver$Api33Impl;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/CameraMetadata;", "cameraMetadata", "Landroidx/camera/core/DynamicRange;", "getRecommended10BitDynamicRange", "(Landroidx/camera/camera2/pipe/CameraMetadata;)Landroidx/camera/core/DynamicRange;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Api33Impl {
        public static final androidx.camera.camera2.internal.DynamicRangeResolver.Api33Impl INSTANCE = new androidx.camera.camera2.internal.DynamicRangeResolver.Api33Impl();

        private Api33Impl() {
        }

        public final androidx.camera.core.DynamicRange getRecommended10BitDynamicRange(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraMetadata, "");
            android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
            java.lang.Long l = (java.lang.Long) cameraMetadata.get(key);
            if (l != null) {
                return androidx.camera.camera2.internal.DynamicRangeConversions.INSTANCE.profileToDynamicRange(l.longValue());
            }
            return null;
        }
    }
}
