package androidx.window.layout.adapter.sidecar;

/* loaded from: classes.dex */
public class DistinctElementSidecarCallback implements androidx.window.sidecar.SidecarInterface.SidecarCallback {

    /* renamed from: b, reason: collision with root package name */
    public androidx.window.sidecar.SidecarDeviceState f2511b;

    /* renamed from: d, reason: collision with root package name */
    public final c0.C0101f f2513d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.window.sidecar.SidecarInterface.SidecarCallback f2514e;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f2510a = new java.lang.Object();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.WeakHashMap f2512c = new java.util.WeakHashMap();

    public DistinctElementSidecarCallback(c0.C0101f c0101f, androidx.window.sidecar.SidecarInterface.SidecarCallback sidecarCallback) {
        this.f2513d = c0101f;
        this.f2514e = sidecarCallback;
    }

    public void onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.f2510a) {
            try {
                c0.C0101f c0101f = this.f2513d;
                androidx.window.sidecar.SidecarDeviceState sidecarDeviceState2 = this.f2511b;
                c0101f.getClass();
                if (c0.C0101f.a(sidecarDeviceState2, sidecarDeviceState)) {
                    return;
                }
                this.f2511b = sidecarDeviceState;
                this.f2514e.onDeviceStateChanged(sidecarDeviceState);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public void onWindowLayoutChanged(android.os.IBinder iBinder, androidx.window.sidecar.SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.f2510a) {
            try {
                androidx.window.sidecar.SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (androidx.window.sidecar.SidecarWindowLayoutInfo) this.f2512c.get(iBinder);
                this.f2513d.getClass();
                if (c0.C0101f.d(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                    return;
                }
                this.f2512c.put(iBinder, sidecarWindowLayoutInfo);
                this.f2514e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
