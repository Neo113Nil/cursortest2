package androidx.window.area.adapter;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/window/area/adapter/WindowAreaAdapter;", "", "<init>", "()V", "", "status", "", "sessionActive", "vendorApiLevel", "Landroidx/window/area/WindowAreaCapability$Status;", "translate$window_release", "(IZI)Landroidx/window/area/WindowAreaCapability$Status;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WindowAreaAdapter {
    public static final androidx.window.area.adapter.WindowAreaAdapter INSTANCE = new androidx.window.area.adapter.WindowAreaAdapter();

    private WindowAreaAdapter() {
    }

    public static /* synthetic */ androidx.window.area.WindowAreaCapability.Status translate$window_release$default(androidx.window.area.adapter.WindowAreaAdapter windowAreaAdapter, int i, boolean z, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            i2 = androidx.window.core.ExtensionsUtil.INSTANCE.getSafeVendorApiLevel();
        }
        return windowAreaAdapter.translate$window_release(i, z, i2);
    }

    public final androidx.window.area.WindowAreaCapability.Status translate$window_release(int status, boolean sessionActive, int vendorApiLevel) {
        if (vendorApiLevel <= 3) {
            return androidx.window.area.adapter.WindowAreaAdapterApi3.INSTANCE.translate(status, sessionActive);
        }
        return androidx.window.area.adapter.WindowAreaAdapterApi4.INSTANCE.translate(status);
    }
}
