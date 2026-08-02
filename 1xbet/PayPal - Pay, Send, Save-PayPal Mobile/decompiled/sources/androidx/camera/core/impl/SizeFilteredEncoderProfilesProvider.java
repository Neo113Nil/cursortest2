package androidx.camera.core.impl;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u0004\u0018\u00010\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\"\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019"}, d2 = {"Landroidx/camera/core/impl/SizeFilteredEncoderProfilesProvider;", "Landroidx/camera/core/impl/EncoderProfilesProvider;", "provider", "", "Landroid/util/Size;", "supportedSizes", "<init>", "(Landroidx/camera/core/impl/EncoderProfilesProvider;Ljava/util/List;)V", "", com.daon.sdk.face.license.License.FEATURE_QUALITY, "", "hasProfile", "(I)Z", "Landroidx/camera/core/impl/EncoderProfilesProxy;", "getAll", "(I)Landroidx/camera/core/impl/EncoderProfilesProxy;", "p0", "getHighSpeedVideoFpsRanges", "(Ljava/util/List;)Landroidx/camera/core/impl/EncoderProfilesProxy;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/core/impl/EncoderProfilesProvider;", "Camera2StreamConfigurationMap", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "", "Ljava/util/Map;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SizeFilteredEncoderProfilesProvider implements androidx.camera.core.impl.EncoderProfilesProvider {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.Map<java.lang.Integer, androidx.camera.core.impl.EncoderProfilesProxy> getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.core.impl.EncoderProfilesProvider Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.List<android.util.Size> getHighSpeedVideoFpsRangesFor;

    public SizeFilteredEncoderProfilesProvider(androidx.camera.core.impl.EncoderProfilesProvider encoderProfilesProvider, java.util.List<android.util.Size> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoderProfilesProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.Camera2StreamConfigurationMap = encoderProfilesProvider;
        this.getHighSpeedVideoFpsRangesFor = list;
        this.getHighSpeedVideoSizes = new java.util.LinkedHashMap();
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final boolean hasProfile(int quality) {
        return getAll(quality) != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (r4.getHighSpeedVideoFpsRangesFor.contains(r0.getVideoProfiles().get(0).getResolution()) == false) goto L17;
     */
    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final androidx.camera.core.impl.EncoderProfilesProxy getAll(int quality) {
        androidx.camera.core.impl.EncoderProfilesProxy encoderProfilesProxy = null;
        if (!this.Camera2StreamConfigurationMap.hasProfile(quality)) {
            return null;
        }
        if (this.getHighSpeedVideoSizes.containsKey(java.lang.Integer.valueOf(quality))) {
            return this.getHighSpeedVideoSizes.get(java.lang.Integer.valueOf(quality));
        }
        androidx.camera.core.impl.EncoderProfilesProxy all = this.Camera2StreamConfigurationMap.getAll(quality);
        if (all != null) {
            if (!this.getHighSpeedVideoFpsRangesFor.isEmpty() && !all.getVideoProfiles().isEmpty()) {
            }
            if (quality == 0) {
                java.util.List<java.lang.Integer> list = androidx.camera.core.impl.EncoderProfilesProvider.QUALITY_HIGH_TO_LOW;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list, "");
                encoderProfilesProxy = getHighSpeedVideoFpsRanges(kotlin.collections.CollectionsKt.reversed(list));
            } else if (quality == 1) {
                java.util.List<java.lang.Integer> list2 = androidx.camera.core.impl.EncoderProfilesProvider.QUALITY_HIGH_TO_LOW;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list2, "");
                encoderProfilesProxy = getHighSpeedVideoFpsRanges(list2);
            }
            this.getHighSpeedVideoSizes.put(java.lang.Integer.valueOf(quality), encoderProfilesProxy);
            return encoderProfilesProxy;
        }
        encoderProfilesProxy = all;
        this.getHighSpeedVideoSizes.put(java.lang.Integer.valueOf(quality), encoderProfilesProxy);
        return encoderProfilesProxy;
    }

    private final androidx.camera.core.impl.EncoderProfilesProxy getHighSpeedVideoFpsRanges(java.util.List<java.lang.Integer> p0) {
        java.util.Iterator<java.lang.Integer> it = p0.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.EncoderProfilesProxy all = getAll(it.next().intValue());
            if (all != null) {
                return all;
            }
        }
        return null;
    }
}
