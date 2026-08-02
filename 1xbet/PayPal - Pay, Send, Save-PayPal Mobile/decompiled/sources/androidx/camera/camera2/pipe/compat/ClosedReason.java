package androidx.camera.camera2.pipe.compat;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Landroidx/camera/camera2/pipe/compat/ClosedReason;", "", "<init>", "(Ljava/lang/String;I)V", "APP_CLOSED", "APP_DISCONNECTED", "CAMERA2_CLOSED", "CAMERA2_DISCONNECTED", "CAMERA2_ERROR", "CAMERA2_EXCEPTION"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ClosedReason {
    public static final androidx.camera.camera2.pipe.compat.ClosedReason APP_CLOSED;
    public static final androidx.camera.camera2.pipe.compat.ClosedReason APP_DISCONNECTED;
    public static final androidx.camera.camera2.pipe.compat.ClosedReason CAMERA2_CLOSED;
    public static final androidx.camera.camera2.pipe.compat.ClosedReason CAMERA2_DISCONNECTED;
    public static final androidx.camera.camera2.pipe.compat.ClosedReason CAMERA2_ERROR;
    public static final androidx.camera.camera2.pipe.compat.ClosedReason CAMERA2_EXCEPTION;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ androidx.camera.camera2.pipe.compat.ClosedReason[] getHighSpeedVideoSizes;

    private ClosedReason(java.lang.String str, int i) {
    }

    static {
        androidx.camera.camera2.pipe.compat.ClosedReason closedReason = new androidx.camera.camera2.pipe.compat.ClosedReason("APP_CLOSED", 0);
        APP_CLOSED = closedReason;
        androidx.camera.camera2.pipe.compat.ClosedReason closedReason2 = new androidx.camera.camera2.pipe.compat.ClosedReason("APP_DISCONNECTED", 1);
        APP_DISCONNECTED = closedReason2;
        androidx.camera.camera2.pipe.compat.ClosedReason closedReason3 = new androidx.camera.camera2.pipe.compat.ClosedReason("CAMERA2_CLOSED", 2);
        CAMERA2_CLOSED = closedReason3;
        androidx.camera.camera2.pipe.compat.ClosedReason closedReason4 = new androidx.camera.camera2.pipe.compat.ClosedReason("CAMERA2_DISCONNECTED", 3);
        CAMERA2_DISCONNECTED = closedReason4;
        androidx.camera.camera2.pipe.compat.ClosedReason closedReason5 = new androidx.camera.camera2.pipe.compat.ClosedReason("CAMERA2_ERROR", 4);
        CAMERA2_ERROR = closedReason5;
        androidx.camera.camera2.pipe.compat.ClosedReason closedReason6 = new androidx.camera.camera2.pipe.compat.ClosedReason("CAMERA2_EXCEPTION", 5);
        CAMERA2_EXCEPTION = closedReason6;
        androidx.camera.camera2.pipe.compat.ClosedReason[] closedReasonArr = {closedReason, closedReason2, closedReason3, closedReason4, closedReason5, closedReason6};
        getHighSpeedVideoSizes = closedReasonArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(closedReasonArr);
    }

    public static androidx.camera.camera2.pipe.compat.ClosedReason[] values() {
        return (androidx.camera.camera2.pipe.compat.ClosedReason[]) getHighSpeedVideoSizes.clone();
    }

    public static androidx.camera.camera2.pipe.compat.ClosedReason valueOf(java.lang.String str) {
        return (androidx.camera.camera2.pipe.compat.ClosedReason) java.lang.Enum.valueOf(androidx.camera.camera2.pipe.compat.ClosedReason.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.camera.camera2.pipe.compat.ClosedReason> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
