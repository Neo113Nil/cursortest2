package androidx.window.area;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/window/area/WindowAreaCapability;", "", "Landroidx/window/area/WindowAreaCapability$Operation;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "Landroidx/window/area/WindowAreaCapability$Status;", "status", "<init>", "(Landroidx/window/area/WindowAreaCapability$Operation;Landroidx/window/area/WindowAreaCapability$Status;)V", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/window/area/WindowAreaCapability$Operation;", "getOperation", "()Landroidx/window/area/WindowAreaCapability$Operation;", "Landroidx/window/area/WindowAreaCapability$Status;", "getStatus", "()Landroidx/window/area/WindowAreaCapability$Status;", "Status", "Operation"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WindowAreaCapability {
    private final androidx.window.area.WindowAreaCapability.Operation operation;
    private final androidx.window.area.WindowAreaCapability.Status status;

    public WindowAreaCapability(androidx.window.area.WindowAreaCapability.Operation operation, androidx.window.area.WindowAreaCapability.Status status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        this.operation = operation;
        this.status = status;
    }

    public final androidx.window.area.WindowAreaCapability.Operation getOperation() {
        return this.operation;
    }

    public final androidx.window.area.WindowAreaCapability.Status getStatus() {
        return this.status;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Operation: ");
        sb.append(this.operation);
        sb.append(": Status: ");
        sb.append(this.status);
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Landroidx/window/area/WindowAreaCapability$Status;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Status {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final java.lang.String getHighSpeedVideoFpsRanges;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.window.area.WindowAreaCapability.Status.Companion INSTANCE = new androidx.window.area.WindowAreaCapability.Status.Companion(null);
        private static final androidx.window.area.WindowAreaCapability.Status WINDOW_AREA_STATUS_UNKNOWN = new androidx.window.area.WindowAreaCapability.Status("UNKNOWN");
        public static final androidx.window.area.WindowAreaCapability.Status WINDOW_AREA_STATUS_UNSUPPORTED = new androidx.window.area.WindowAreaCapability.Status("UNSUPPORTED");
        public static final androidx.window.area.WindowAreaCapability.Status WINDOW_AREA_STATUS_UNAVAILABLE = new androidx.window.area.WindowAreaCapability.Status("UNAVAILABLE");
        public static final androidx.window.area.WindowAreaCapability.Status WINDOW_AREA_STATUS_AVAILABLE = new androidx.window.area.WindowAreaCapability.Status("AVAILABLE");
        public static final androidx.window.area.WindowAreaCapability.Status WINDOW_AREA_STATUS_ACTIVE = new androidx.window.area.WindowAreaCapability.Status(com.payair.model.TokenStatusKt.TOKEN_ACTIVE);

        private Status(java.lang.String str) {
            this.getHighSpeedVideoFpsRanges = str;
        }

        /* renamed from: toString, reason: from getter */
        public final java.lang.String getGetHighSpeedVideoFpsRanges() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006"}, d2 = {"Landroidx/window/area/WindowAreaCapability$Status$Companion;", "", "<init>", "()V", "Landroidx/window/area/WindowAreaCapability$Status;", "WINDOW_AREA_STATUS_UNKNOWN", "Landroidx/window/area/WindowAreaCapability$Status;", "getWINDOW_AREA_STATUS_UNKNOWN$window_release", "()Landroidx/window/area/WindowAreaCapability$Status;", "WINDOW_AREA_STATUS_UNSUPPORTED", "WINDOW_AREA_STATUS_UNAVAILABLE", "WINDOW_AREA_STATUS_AVAILABLE", "WINDOW_AREA_STATUS_ACTIVE"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final androidx.window.area.WindowAreaCapability.Status getWINDOW_AREA_STATUS_UNKNOWN$window_release() {
                return androidx.window.area.WindowAreaCapability.Status.WINDOW_AREA_STATUS_UNKNOWN;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Landroidx/window/area/WindowAreaCapability$Operation;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Operation {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final java.lang.String Camera2StreamConfigurationMap;
        public static final androidx.window.area.WindowAreaCapability.Operation OPERATION_TRANSFER_ACTIVITY_TO_AREA = new androidx.window.area.WindowAreaCapability.Operation("TRANSFER");
        public static final androidx.window.area.WindowAreaCapability.Operation OPERATION_PRESENT_ON_AREA = new androidx.window.area.WindowAreaCapability.Operation("PRESENT");

        private Operation(java.lang.String str) {
            this.Camera2StreamConfigurationMap = str;
        }

        /* renamed from: toString, reason: from getter */
        public final java.lang.String getCamera2StreamConfigurationMap() {
            return this.Camera2StreamConfigurationMap;
        }
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof androidx.window.area.WindowAreaCapability)) {
            return false;
        }
        androidx.window.area.WindowAreaCapability windowAreaCapability = (androidx.window.area.WindowAreaCapability) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.operation, windowAreaCapability.operation) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, windowAreaCapability.status);
    }

    public final int hashCode() {
        return (this.operation.hashCode() * 31) + this.status.hashCode();
    }
}
