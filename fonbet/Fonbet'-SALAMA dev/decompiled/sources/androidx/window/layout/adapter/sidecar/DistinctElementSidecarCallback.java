package androidx.window.layout.adapter.sidecar;

import a1.C0610f;
import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* renamed from: b, reason: collision with root package name */
    public SidecarDeviceState f9848b;

    /* renamed from: d, reason: collision with root package name */
    public final C0610f f9850d;

    /* renamed from: e, reason: collision with root package name */
    public final SidecarInterface.SidecarCallback f9851e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f9847a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f9849c = new WeakHashMap();

    public DistinctElementSidecarCallback(C0610f c0610f, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f9850d = c0610f;
        this.f9851e = sidecarCallback;
    }

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.f9847a) {
            try {
                C0610f c0610f = this.f9850d;
                SidecarDeviceState sidecarDeviceState2 = this.f9848b;
                c0610f.getClass();
                if (C0610f.a(sidecarDeviceState2, sidecarDeviceState)) {
                    return;
                }
                this.f9848b = sidecarDeviceState;
                this.f9851e.onDeviceStateChanged(sidecarDeviceState);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.f9847a) {
            try {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.f9849c.get(iBinder);
                this.f9850d.getClass();
                if (C0610f.d(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                    return;
                }
                this.f9849c.put(iBinder, sidecarWindowLayoutInfo);
                this.f9851e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
