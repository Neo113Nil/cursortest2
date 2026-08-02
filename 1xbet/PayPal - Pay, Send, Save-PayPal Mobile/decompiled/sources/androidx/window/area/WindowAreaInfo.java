package androidx.window.area;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001'B)\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0016J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001c\u001a\u00020\u0016J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u0016H\u0002J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020&H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R0\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015j\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017`\u0018X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, d2 = {"Landroidx/window/area/WindowAreaInfo;", "", com.datadog.android.trace.internal.domain.event.SpanEventSerializer.METRICS_KEY_PREFIX, "Landroidx/window/layout/WindowMetrics;", "type", "Landroidx/window/area/WindowAreaInfo$Type;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Landroid/os/Binder;", "windowAreaComponent", "Landroidx/window/extensions/area/WindowAreaComponent;", "<init>", "(Landroidx/window/layout/WindowMetrics;Landroidx/window/area/WindowAreaInfo$Type;Landroid/os/Binder;Landroidx/window/extensions/area/WindowAreaComponent;)V", "getMetrics", "()Landroidx/window/layout/WindowMetrics;", "setMetrics", "(Landroidx/window/layout/WindowMetrics;)V", "getType", "()Landroidx/window/area/WindowAreaInfo$Type;", "getToken", "()Landroid/os/Binder;", "capabilityMap", "Ljava/util/HashMap;", "Landroidx/window/area/WindowAreaCapability$Operation;", "Landroidx/window/area/WindowAreaCapability;", "Lkotlin/collections/HashMap;", "getCapabilityMap$window_release", "()Ljava/util/HashMap;", "getCapability", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "getActiveSession", "Landroidx/window/area/WindowAreaSession;", "createRearFacingSession", "equals", "", "other", "hashCode", "", "toString", "", com.miteksystems.misnap.core.MibiData.KEY_MICROPHONE_TYPE, "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WindowAreaInfo {
    private androidx.window.layout.WindowMetrics Camera2StreamConfigurationMap;
    private final androidx.window.extensions.area.WindowAreaComponent getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.HashMap<androidx.window.area.WindowAreaCapability.Operation, androidx.window.area.WindowAreaCapability> getHighSpeedVideoFpsRanges;
    private final android.os.Binder getHighSpeedVideoFpsRangesFor;
    private final androidx.window.area.WindowAreaInfo.Type getHighSpeedVideoSizes;

    public WindowAreaInfo(androidx.window.layout.WindowMetrics windowMetrics, androidx.window.area.WindowAreaInfo.Type type, android.os.Binder binder, androidx.window.extensions.area.WindowAreaComponent windowAreaComponent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowMetrics, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowAreaComponent, "");
        this.Camera2StreamConfigurationMap = windowMetrics;
        this.getHighSpeedVideoSizes = type;
        this.getHighSpeedVideoFpsRangesFor = binder;
        this.getHighResolutionOutputSizeshNQ4ISI = windowAreaComponent;
        this.getHighSpeedVideoFpsRanges = new java.util.HashMap<>();
    }

    /* renamed from: getMetrics, reason: from getter */
    public final androidx.window.layout.WindowMetrics getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    public final void setMetrics(androidx.window.layout.WindowMetrics windowMetrics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowMetrics, "");
        this.Camera2StreamConfigurationMap = windowMetrics;
    }

    /* renamed from: getType, reason: from getter */
    public final androidx.window.area.WindowAreaInfo.Type getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    /* renamed from: getToken, reason: from getter */
    public final android.os.Binder getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.util.HashMap<androidx.window.area.WindowAreaCapability.Operation, androidx.window.area.WindowAreaCapability> getCapabilityMap$window_release() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final androidx.window.area.WindowAreaCapability getCapability(androidx.window.area.WindowAreaCapability.Operation operation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        androidx.window.area.WindowAreaCapability windowAreaCapability = this.getHighSpeedVideoFpsRanges.get(operation);
        return windowAreaCapability == null ? new androidx.window.area.WindowAreaCapability(operation, androidx.window.area.WindowAreaCapability.Status.WINDOW_AREA_STATUS_UNSUPPORTED) : windowAreaCapability;
    }

    public final androidx.window.area.WindowAreaSession getActiveSession(androidx.window.area.WindowAreaCapability.Operation operation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getCapability(operation).getStatus(), androidx.window.area.WindowAreaCapability.Status.WINDOW_AREA_STATUS_ACTIVE)) {
            throw new java.lang.IllegalStateException("No session is currently active");
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, androidx.window.area.WindowAreaInfo.Type.TYPE_REAR_FACING)) {
            return null;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(operation, androidx.window.area.WindowAreaCapability.Operation.OPERATION_TRANSFER_ACTIVITY_TO_AREA)) {
            return new androidx.window.area.RearDisplaySessionImpl(this.getHighResolutionOutputSizeshNQ4ISI);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(operation, androidx.window.area.WindowAreaCapability.Operation.OPERATION_PRESENT_ON_AREA)) {
            androidx.window.extensions.area.WindowAreaComponent windowAreaComponent = this.getHighResolutionOutputSizeshNQ4ISI;
            androidx.window.extensions.area.ExtensionWindowAreaPresentation rearDisplayPresentation = windowAreaComponent.getRearDisplayPresentation();
            kotlin.jvm.internal.Intrinsics.checkNotNull(rearDisplayPresentation);
            return new androidx.window.area.RearDisplayPresentationSessionPresenterImpl(windowAreaComponent, rearDisplayPresentation, androidx.window.core.ExtensionsUtil.INSTANCE.getSafeVendorApiLevel());
        }
        throw new java.lang.IllegalArgumentException("Invalid operation provided");
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Landroidx/window/area/WindowAreaInfo$Type;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Type {
        public static final androidx.window.area.WindowAreaInfo.Type TYPE_REAR_FACING = new androidx.window.area.WindowAreaInfo.Type("REAR FACING");
        private final java.lang.String getHighSpeedVideoSizes;

        private Type(java.lang.String str) {
            this.getHighSpeedVideoSizes = str;
        }

        /* renamed from: toString, reason: from getter */
        public final java.lang.String getGetHighSpeedVideoSizes() {
            return this.getHighSpeedVideoSizes;
        }
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof androidx.window.area.WindowAreaInfo)) {
            return false;
        }
        androidx.window.area.WindowAreaInfo windowAreaInfo = (androidx.window.area.WindowAreaInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, windowAreaInfo.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, windowAreaInfo.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges.entrySet(), windowAreaInfo.getHighSpeedVideoFpsRanges.entrySet());
    }

    public final int hashCode() {
        return (((this.Camera2StreamConfigurationMap.hashCode() * 31) + this.getHighSpeedVideoSizes.hashCode()) * 31) + this.getHighSpeedVideoFpsRanges.entrySet().hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WindowAreaInfo{ Metrics: ");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", type: ");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", Capabilities: ");
        sb.append(this.getHighSpeedVideoFpsRanges.entrySet());
        sb.append(" }");
        return sb.toString();
    }
}
