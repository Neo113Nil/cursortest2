package androidx.camera.camera2.internal;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R(\u0010\u0013\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00120\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010"}, d2 = {"Landroidx/camera/camera2/internal/DynamicRangeConversions;", "", "<init>", "()V", "", "profile", "Landroidx/camera/core/DynamicRange;", "profileToDynamicRange", "(J)Landroidx/camera/core/DynamicRange;", "dynamicRange", "Landroid/hardware/camera2/params/DynamicRangeProfiles;", "dynamicRangeProfiles", "dynamicRangeToFirstSupportedProfile", "(Landroidx/camera/core/DynamicRange;Landroid/hardware/camera2/params/DynamicRangeProfiles;)Ljava/lang/Long;", "", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Map;", "getHighResolutionOutputSizeshNQ4ISI", "", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DynamicRangeConversions {
    public static final androidx.camera.camera2.internal.DynamicRangeConversions INSTANCE = new androidx.camera.camera2.internal.DynamicRangeConversions();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final java.util.Map<java.lang.Long, androidx.camera.core.DynamicRange> getHighResolutionOutputSizeshNQ4ISI;
    private static final java.util.Map<androidx.camera.core.DynamicRange, java.util.List<java.lang.Long>> getHighSpeedVideoSizes;

    private DynamicRangeConversions() {
    }

    static {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        getHighResolutionOutputSizeshNQ4ISI = linkedHashMap;
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        getHighSpeedVideoSizes = linkedHashMap2;
        linkedHashMap.put(1L, androidx.camera.core.DynamicRange.SDR);
        linkedHashMap2.put(androidx.camera.core.DynamicRange.SDR, kotlin.collections.CollectionsKt.listOf(1L));
        linkedHashMap.put(2L, androidx.camera.core.DynamicRange.HLG_10_BIT);
        linkedHashMap2.put(linkedHashMap.get(2L), kotlin.collections.CollectionsKt.listOf(2L));
        linkedHashMap.put(4L, androidx.camera.core.DynamicRange.HDR10_10_BIT);
        linkedHashMap2.put(androidx.camera.core.DynamicRange.HDR10_10_BIT, kotlin.collections.CollectionsKt.listOf(4L));
        linkedHashMap.put(8L, androidx.camera.core.DynamicRange.HDR10_PLUS_10_BIT);
        linkedHashMap2.put(androidx.camera.core.DynamicRange.HDR10_PLUS_10_BIT, kotlin.collections.CollectionsKt.listOf(8L));
        java.util.List<java.lang.Long> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Long[]{64L, 128L, 16L, 32L});
        java.util.Iterator<java.lang.Long> it = listOf.iterator();
        while (it.hasNext()) {
            getHighResolutionOutputSizeshNQ4ISI.put(java.lang.Long.valueOf(it.next().longValue()), androidx.camera.core.DynamicRange.DOLBY_VISION_10_BIT);
        }
        getHighSpeedVideoSizes.put(androidx.camera.core.DynamicRange.DOLBY_VISION_10_BIT, listOf);
        java.util.List<java.lang.Long> listOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Long[]{java.lang.Long.valueOf(okhttp3.internal.ws.RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE), java.lang.Long.valueOf(coil3.svg.internal.UtilsKt.SVG_SIZE_BYTES), 256L, 512L});
        java.util.Iterator<java.lang.Long> it2 = listOf2.iterator();
        while (it2.hasNext()) {
            getHighResolutionOutputSizeshNQ4ISI.put(java.lang.Long.valueOf(it2.next().longValue()), androidx.camera.core.DynamicRange.DOLBY_VISION_8_BIT);
        }
        getHighSpeedVideoSizes.put(androidx.camera.core.DynamicRange.DOLBY_VISION_8_BIT, listOf2);
    }

    public final androidx.camera.core.DynamicRange profileToDynamicRange(long profile) {
        return getHighResolutionOutputSizeshNQ4ISI.get(java.lang.Long.valueOf(profile));
    }

    public final java.lang.Long dynamicRangeToFirstSupportedProfile(androidx.camera.core.DynamicRange dynamicRange, android.hardware.camera2.params.DynamicRangeProfiles dynamicRangeProfiles) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicRange, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicRangeProfiles, "");
        java.util.List<java.lang.Long> list = getHighSpeedVideoSizes.get(dynamicRange);
        if (list == null) {
            return null;
        }
        java.util.Set<java.lang.Long> supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportedProfiles, "");
        java.util.Iterator<java.lang.Long> it = list.iterator();
        while (it.hasNext()) {
            long longValue = it.next().longValue();
            if (supportedProfiles.contains(java.lang.Long.valueOf(longValue))) {
                return java.lang.Long.valueOf(longValue);
            }
        }
        return null;
    }
}
