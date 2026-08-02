package androidx.camera.camera2.adapter;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001$B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\""}, d2 = {"Landroidx/camera/camera2/adapter/ZoomValue;", "Landroidx/camera/core/ZoomState;", "", "zoomRatio", "minZoomRatio", "maxZoomRatio", "<init>", "(FFF)V", "Landroidx/camera/camera2/adapter/ZoomValue$LinearZoom;", "linearZoom", "(Landroidx/camera/camera2/adapter/ZoomValue$LinearZoom;FF)V", "getZoomRatio", "()F", "getMaxZoomRatio", "getMinZoomRatio", "getLinearZoom", "copy", "(FFF)Landroidx/camera/camera2/adapter/ZoomValue;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Ljava/lang/Float;", "Camera2StreamConfigurationMap", "LinearZoom"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ZoomValue implements androidx.camera.core.ZoomState {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.lang.Float Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final float getHighResolutionOutputSizeshNQ4ISI;
    private final float getHighSpeedVideoFpsRangesFor;
    private final float getHighSpeedVideoSizes;

    public ZoomValue(float f, float f2, float f3) {
        this.getHighResolutionOutputSizeshNQ4ISI = f;
        this.getHighSpeedVideoFpsRangesFor = f2;
        this.getHighSpeedVideoSizes = f3;
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Landroidx/camera/camera2/adapter/ZoomValue$LinearZoom;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(F)V", "component1", "()F", "copy", "(F)Landroidx/camera/camera2/adapter/ZoomValue$LinearZoom;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getValue"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinearZoom {
        private final float value;

        public LinearZoom(float f) {
            this.value = f;
        }

        public final float getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LinearZoom(value=");
            sb.append(this.value);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Float.hashCode(this.value);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof androidx.camera.camera2.adapter.ZoomValue.LinearZoom) && java.lang.Float.compare(this.value, ((androidx.camera.camera2.adapter.ZoomValue.LinearZoom) other).value) == 0;
        }

        public final androidx.camera.camera2.adapter.ZoomValue.LinearZoom copy(float value) {
            return new androidx.camera.camera2.adapter.ZoomValue.LinearZoom(value);
        }

        /* renamed from: component1, reason: from getter */
        public final float getValue() {
            return this.value;
        }

        public static /* synthetic */ androidx.camera.camera2.adapter.ZoomValue.LinearZoom copy$default(androidx.camera.camera2.adapter.ZoomValue.LinearZoom linearZoom, float f, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = linearZoom.value;
            }
            return linearZoom.copy(f);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ZoomValue(androidx.camera.camera2.adapter.ZoomValue.LinearZoom linearZoom, float f, float f2) {
        this(androidx.camera.camera2.internal.ZoomMath.INSTANCE.getZoomRatioFromLinearZoom(linearZoom.getValue(), f, f2), f, f2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linearZoom, "");
        this.Camera2StreamConfigurationMap = java.lang.Float.valueOf(linearZoom.getValue());
    }

    @Override // androidx.camera.core.ZoomState
    /* renamed from: getZoomRatio, reason: from getter */
    public final float getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.camera.core.ZoomState
    /* renamed from: getMaxZoomRatio, reason: from getter */
    public final float getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.core.ZoomState
    /* renamed from: getMinZoomRatio, reason: from getter */
    public final float getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.core.ZoomState
    public final float getLinearZoom() {
        java.lang.Float f = this.Camera2StreamConfigurationMap;
        return f != null ? f.floatValue() : androidx.camera.camera2.internal.ZoomMath.INSTANCE.getLinearZoomFromZoomRatio(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ZoomValue(getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", getHighSpeedVideoFpsRangesFor=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Float.hashCode(this.getHighResolutionOutputSizeshNQ4ISI) * 31) + java.lang.Float.hashCode(this.getHighSpeedVideoFpsRangesFor)) * 31) + java.lang.Float.hashCode(this.getHighSpeedVideoSizes);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.camera.camera2.adapter.ZoomValue)) {
            return false;
        }
        androidx.camera.camera2.adapter.ZoomValue zoomValue = (androidx.camera.camera2.adapter.ZoomValue) other;
        return java.lang.Float.compare(this.getHighResolutionOutputSizeshNQ4ISI, zoomValue.getHighResolutionOutputSizeshNQ4ISI) == 0 && java.lang.Float.compare(this.getHighSpeedVideoFpsRangesFor, zoomValue.getHighSpeedVideoFpsRangesFor) == 0 && java.lang.Float.compare(this.getHighSpeedVideoSizes, zoomValue.getHighSpeedVideoSizes) == 0;
    }

    public final androidx.camera.camera2.adapter.ZoomValue copy(float zoomRatio, float minZoomRatio, float maxZoomRatio) {
        return new androidx.camera.camera2.adapter.ZoomValue(zoomRatio, minZoomRatio, maxZoomRatio);
    }

    public static /* synthetic */ androidx.camera.camera2.adapter.ZoomValue copy$default(androidx.camera.camera2.adapter.ZoomValue zoomValue, float f, float f2, float f3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = zoomValue.getHighResolutionOutputSizeshNQ4ISI;
        }
        if ((i & 2) != 0) {
            f2 = zoomValue.getHighSpeedVideoFpsRangesFor;
        }
        if ((i & 4) != 0) {
            f3 = zoomValue.getHighSpeedVideoSizes;
        }
        return zoomValue.copy(f, f2, f3);
    }
}
