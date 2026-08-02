package androidx.camera.camera2.adapter;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J>\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010("}, d2 = {"Landroidx/camera/camera2/adapter/EvCompValue;", "Landroidx/camera/core/ExposureState;", "", "supported", "", "index", "Landroid/util/Range;", "range", "Landroid/util/Rational;", "step", "<init>", "(ZILandroid/util/Range;Landroid/util/Rational;)V", "getExposureCompensationIndex", "()I", "getExposureCompensationRange", "()Landroid/util/Range;", "getExposureCompensationStep", "()Landroid/util/Rational;", "isExposureCompensationSupported", "()Z", "newIndex", "updateIndex$camera_camera2", "(I)Landroidx/camera/camera2/adapter/EvCompValue;", "copy", "(ZILandroid/util/Range;Landroid/util/Rational;)Landroidx/camera/camera2/adapter/EvCompValue;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Z", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor", "Landroid/util/Range;", "Landroid/util/Rational;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class EvCompValue implements androidx.camera.core.ExposureState {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.util.Rational Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final android.util.Range<java.lang.Integer> getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoSizes;

    public EvCompValue(boolean z, int i, android.util.Range<java.lang.Integer> range, android.util.Rational rational) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rational, "");
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRanges = range;
        this.Camera2StreamConfigurationMap = rational;
    }

    @Override // androidx.camera.core.ExposureState
    /* renamed from: getExposureCompensationIndex, reason: from getter */
    public final int getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.core.ExposureState
    public final android.util.Range<java.lang.Integer> getExposureCompensationRange() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.core.ExposureState
    /* renamed from: getExposureCompensationStep, reason: from getter */
    public final android.util.Rational getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.camera.core.ExposureState
    /* renamed from: isExposureCompensationSupported, reason: from getter */
    public final boolean getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final androidx.camera.camera2.adapter.EvCompValue updateIndex$camera_camera2(int newIndex) {
        return copy$default(this, false, newIndex, null, null, 13, null);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EvCompValue(getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((((java.lang.Boolean.hashCode(this.getHighResolutionOutputSizeshNQ4ISI) * 31) + java.lang.Integer.hashCode(this.getHighSpeedVideoSizes)) * 31) + this.getHighSpeedVideoFpsRanges.hashCode()) * 31) + this.Camera2StreamConfigurationMap.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.camera.camera2.adapter.EvCompValue)) {
            return false;
        }
        androidx.camera.camera2.adapter.EvCompValue evCompValue = (androidx.camera.camera2.adapter.EvCompValue) other;
        return this.getHighResolutionOutputSizeshNQ4ISI == evCompValue.getHighResolutionOutputSizeshNQ4ISI && this.getHighSpeedVideoSizes == evCompValue.getHighSpeedVideoSizes && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, evCompValue.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, evCompValue.Camera2StreamConfigurationMap);
    }

    public final androidx.camera.camera2.adapter.EvCompValue copy(boolean supported, int index, android.util.Range<java.lang.Integer> range, android.util.Rational step) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
        return new androidx.camera.camera2.adapter.EvCompValue(supported, index, range, step);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ androidx.camera.camera2.adapter.EvCompValue copy$default(androidx.camera.camera2.adapter.EvCompValue evCompValue, boolean z, int i, android.util.Range range, android.util.Rational rational, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            z = evCompValue.getHighResolutionOutputSizeshNQ4ISI;
        }
        if ((i2 & 2) != 0) {
            i = evCompValue.getHighSpeedVideoSizes;
        }
        if ((i2 & 4) != 0) {
            range = evCompValue.getHighSpeedVideoFpsRanges;
        }
        if ((i2 & 8) != 0) {
            rational = evCompValue.Camera2StreamConfigurationMap;
        }
        return evCompValue.copy(z, i, range, rational);
    }
}
