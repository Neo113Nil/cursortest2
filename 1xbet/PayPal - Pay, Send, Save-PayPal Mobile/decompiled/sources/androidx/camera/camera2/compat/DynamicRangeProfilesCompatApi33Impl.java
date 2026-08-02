package androidx.camera.camera2.compat;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/camera/camera2/compat/DynamicRangeProfilesCompatApi33Impl;", "Landroidx/camera/camera2/compat/DynamicRangeProfilesCompat$DynamicRangeProfilesCompatImpl;", "Landroid/hardware/camera2/params/DynamicRangeProfiles;", "dynamicRangeProfiles", "<init>", "(Landroid/hardware/camera2/params/DynamicRangeProfiles;)V", "Landroidx/camera/core/DynamicRange;", "dynamicRange", "", "getDynamicRangeCaptureRequestConstraints", "(Landroidx/camera/core/DynamicRange;)Ljava/util/Set;", "", "isExtraLatencyPresent", "(Landroidx/camera/core/DynamicRange;)Z", "unwrap", "()Landroid/hardware/camera2/params/DynamicRangeProfiles;", "p0", "", "getHighSpeedVideoSizes", "(Landroidx/camera/core/DynamicRange;)Ljava/lang/Long;", "getHighResolutionOutputSizeshNQ4ISI", "(J)Landroidx/camera/core/DynamicRange;", "(Ljava/util/Set;)Ljava/util/Set;", "Camera2StreamConfigurationMap", "Landroid/hardware/camera2/params/DynamicRangeProfiles;", "getHighSpeedVideoFpsRanges", "getSupportedDynamicRanges", "()Ljava/util/Set;", "supportedDynamicRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DynamicRangeProfilesCompatApi33Impl implements androidx.camera.camera2.compat.DynamicRangeProfilesCompat.DynamicRangeProfilesCompatImpl {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final android.hardware.camera2.params.DynamicRangeProfiles getHighSpeedVideoFpsRanges;

    public DynamicRangeProfilesCompatApi33Impl(android.hardware.camera2.params.DynamicRangeProfiles dynamicRangeProfiles) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicRangeProfiles, "");
        this.getHighSpeedVideoFpsRanges = dynamicRangeProfiles;
    }

    @Override // androidx.camera.camera2.compat.DynamicRangeProfilesCompat.DynamicRangeProfilesCompatImpl
    public final java.util.Set<androidx.camera.core.DynamicRange> getSupportedDynamicRanges() {
        java.util.Set<java.lang.Long> supportedProfiles = this.getHighSpeedVideoFpsRanges.getSupportedProfiles();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportedProfiles, "");
        return getHighResolutionOutputSizeshNQ4ISI(supportedProfiles);
    }

    @Override // androidx.camera.camera2.compat.DynamicRangeProfilesCompat.DynamicRangeProfilesCompatImpl
    public final java.util.Set<androidx.camera.core.DynamicRange> getDynamicRangeCaptureRequestConstraints(androidx.camera.core.DynamicRange dynamicRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicRange, "");
        java.lang.Long highSpeedVideoSizes = getHighSpeedVideoSizes(dynamicRange);
        if (highSpeedVideoSizes == null) {
            throw new java.lang.IllegalArgumentException("DynamicRange is not supported: ".concat(java.lang.String.valueOf(dynamicRange)).toString());
        }
        java.util.Set<java.lang.Long> profileCaptureRequestConstraints = this.getHighSpeedVideoFpsRanges.getProfileCaptureRequestConstraints(highSpeedVideoSizes.longValue());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(profileCaptureRequestConstraints, "");
        return getHighResolutionOutputSizeshNQ4ISI(profileCaptureRequestConstraints);
    }

    @Override // androidx.camera.camera2.compat.DynamicRangeProfilesCompat.DynamicRangeProfilesCompatImpl
    public final boolean isExtraLatencyPresent(androidx.camera.core.DynamicRange dynamicRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicRange, "");
        java.lang.Long highSpeedVideoSizes = getHighSpeedVideoSizes(dynamicRange);
        if (highSpeedVideoSizes == null) {
            throw new java.lang.IllegalArgumentException("DynamicRange is not supported: ".concat(java.lang.String.valueOf(dynamicRange)).toString());
        }
        return this.getHighSpeedVideoFpsRanges.isExtraLatencyPresent(highSpeedVideoSizes.longValue());
    }

    @Override // androidx.camera.camera2.compat.DynamicRangeProfilesCompat.DynamicRangeProfilesCompatImpl
    /* renamed from: unwrap, reason: from getter */
    public final android.hardware.camera2.params.DynamicRangeProfiles getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    private final java.lang.Long getHighSpeedVideoSizes(androidx.camera.core.DynamicRange p0) {
        return androidx.camera.camera2.internal.DynamicRangeConversions.INSTANCE.dynamicRangeToFirstSupportedProfile(p0, this.getHighSpeedVideoFpsRanges);
    }

    private final androidx.camera.core.DynamicRange getHighResolutionOutputSizeshNQ4ISI(long p0) {
        androidx.camera.core.DynamicRange profileToDynamicRange = androidx.camera.camera2.internal.DynamicRangeConversions.INSTANCE.profileToDynamicRange(p0);
        if (profileToDynamicRange == null) {
            androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isWarnEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            }
        }
        return profileToDynamicRange;
    }

    private final java.util.Set<androidx.camera.core.DynamicRange> getHighResolutionOutputSizeshNQ4ISI(java.util.Set<java.lang.Long> p0) {
        if (p0.isEmpty()) {
            return kotlin.collections.SetsKt.emptySet();
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator<java.lang.Long> it = p0.iterator();
        while (it.hasNext()) {
            androidx.camera.core.DynamicRange highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(it.next().longValue());
            if (highResolutionOutputSizeshNQ4ISI != null) {
                linkedHashSet.add(highResolutionOutputSizeshNQ4ISI);
            }
        }
        java.util.Set<androidx.camera.core.DynamicRange> unmodifiableSet = java.util.Collections.unmodifiableSet(linkedHashSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "");
        return unmodifiableSet;
    }
}
