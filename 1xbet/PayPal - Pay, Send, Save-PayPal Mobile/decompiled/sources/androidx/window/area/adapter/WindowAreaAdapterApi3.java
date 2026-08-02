package androidx.window.area.adapter;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/window/area/adapter/WindowAreaAdapterApi3;", "", "<init>", "()V", "", "status", "", "sessionActive", "Landroidx/window/area/WindowAreaCapability$Status;", "translate", "(IZ)Landroidx/window/area/WindowAreaCapability$Status;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WindowAreaAdapterApi3 {
    public static final androidx.window.area.adapter.WindowAreaAdapterApi3 INSTANCE = new androidx.window.area.adapter.WindowAreaAdapterApi3();

    private WindowAreaAdapterApi3() {
    }

    public final androidx.window.area.WindowAreaCapability.Status translate(int status, boolean sessionActive) {
        if (status == 0) {
            return androidx.window.area.WindowAreaCapability.Status.WINDOW_AREA_STATUS_UNSUPPORTED;
        }
        if (status == 1) {
            return sessionActive ? androidx.window.area.WindowAreaCapability.Status.WINDOW_AREA_STATUS_ACTIVE : androidx.window.area.WindowAreaCapability.Status.WINDOW_AREA_STATUS_UNAVAILABLE;
        }
        if (status == 2) {
            return androidx.window.area.WindowAreaCapability.Status.WINDOW_AREA_STATUS_AVAILABLE;
        }
        if (status == 3) {
            return androidx.window.area.WindowAreaCapability.Status.WINDOW_AREA_STATUS_ACTIVE;
        }
        return androidx.window.area.WindowAreaCapability.Status.WINDOW_AREA_STATUS_UNSUPPORTED;
    }
}
