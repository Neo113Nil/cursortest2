package androidx.camera.camera2.compat;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/camera/camera2/compat/DynamicRangeProfilesCompatBaseImpl;", "Landroidx/camera/camera2/compat/DynamicRangeProfilesCompat$DynamicRangeProfilesCompatImpl;", "<init>", "()V", "Landroidx/camera/core/DynamicRange;", "dynamicRange", "", "getDynamicRangeCaptureRequestConstraints", "(Landroidx/camera/core/DynamicRange;)Ljava/util/Set;", "", "isExtraLatencyPresent", "(Landroidx/camera/core/DynamicRange;)Z", "Landroid/hardware/camera2/params/DynamicRangeProfiles;", "unwrap", "()Landroid/hardware/camera2/params/DynamicRangeProfiles;", "getSupportedDynamicRanges", "()Ljava/util/Set;", "supportedDynamicRanges", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DynamicRangeProfilesCompatBaseImpl implements androidx.camera.camera2.compat.DynamicRangeProfilesCompat.DynamicRangeProfilesCompatImpl {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.compat.DynamicRangeProfilesCompatBaseImpl.Companion INSTANCE = new androidx.camera.camera2.compat.DynamicRangeProfilesCompatBaseImpl.Companion(null);
    private static final androidx.camera.camera2.compat.DynamicRangeProfilesCompat Camera2StreamConfigurationMap = new androidx.camera.camera2.compat.DynamicRangeProfilesCompat(new androidx.camera.camera2.compat.DynamicRangeProfilesCompatBaseImpl());
    private static final java.util.Set<androidx.camera.core.DynamicRange> getHighSpeedVideoFpsRangesFor = kotlin.collections.SetsKt.setOf(androidx.camera.core.DynamicRange.SDR);

    @Override // androidx.camera.camera2.compat.DynamicRangeProfilesCompat.DynamicRangeProfilesCompatImpl
    /* renamed from: unwrap */
    public final android.hardware.camera2.params.DynamicRangeProfiles getGetHighSpeedVideoFpsRanges() {
        return null;
    }

    @Override // androidx.camera.camera2.compat.DynamicRangeProfilesCompat.DynamicRangeProfilesCompatImpl
    public final java.util.Set<androidx.camera.core.DynamicRange> getSupportedDynamicRanges() {
        return getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.camera2.compat.DynamicRangeProfilesCompat.DynamicRangeProfilesCompatImpl
    public final java.util.Set<androidx.camera.core.DynamicRange> getDynamicRangeCaptureRequestConstraints(androidx.camera.core.DynamicRange dynamicRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicRange, "");
        androidx.core.util.Preconditions.checkArgument(kotlin.jvm.internal.Intrinsics.areEqual(androidx.camera.core.DynamicRange.SDR, dynamicRange), "DynamicRange is not supported: ".concat(java.lang.String.valueOf(dynamicRange)));
        return getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.camera2.compat.DynamicRangeProfilesCompat.DynamicRangeProfilesCompatImpl
    public final boolean isExtraLatencyPresent(androidx.camera.core.DynamicRange dynamicRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicRange, "");
        androidx.core.util.Preconditions.checkArgument(kotlin.jvm.internal.Intrinsics.areEqual(androidx.camera.core.DynamicRange.SDR, dynamicRange), "DynamicRange is not supported: ".concat(java.lang.String.valueOf(dynamicRange)));
        return false;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u0012\u0012\u000e\u0012\f0\n¢\u0006\u0002\b\u000b¢\u0006\u0002\b\f0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/camera/camera2/compat/DynamicRangeProfilesCompatBaseImpl$Companion;", "", "<init>", "()V", "COMPAT_INSTANCE", "Landroidx/camera/camera2/compat/DynamicRangeProfilesCompat;", "getCOMPAT_INSTANCE", "()Landroidx/camera/camera2/compat/DynamicRangeProfilesCompat;", "SDR_ONLY", "", "Landroidx/camera/core/DynamicRange;", "Lorg/jspecify/annotations/NonNull;", "Lkotlin/jvm/internal/EnhancedNullability;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.camera.camera2.compat.DynamicRangeProfilesCompat getCOMPAT_INSTANCE() {
            return androidx.camera.camera2.compat.DynamicRangeProfilesCompatBaseImpl.Camera2StreamConfigurationMap;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
