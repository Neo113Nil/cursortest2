package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.WeakHashMap;
import p0.f;

/* loaded from: classes.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* renamed from: b, reason: collision with root package name */
    public SidecarDeviceState f4702b;

    /* renamed from: d, reason: collision with root package name */
    public final f f4704d;

    /* renamed from: e, reason: collision with root package name */
    public final SidecarInterface.SidecarCallback f4705e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f4701a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f4703c = new WeakHashMap();

    public DistinctElementSidecarCallback(f fVar, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f4704d = fVar;
        this.f4705e = sidecarCallback;
    }

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.f4701a) {
            try {
                f fVar = this.f4704d;
                SidecarDeviceState sidecarDeviceState2 = this.f4702b;
                fVar.getClass();
                if (f.a(sidecarDeviceState2, sidecarDeviceState)) {
                    return;
                }
                this.f4702b = sidecarDeviceState;
                this.f4705e.onDeviceStateChanged(sidecarDeviceState);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.f4701a) {
            try {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.f4703c.get(iBinder);
                this.f4704d.getClass();
                if (f.d(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                    return;
                }
                this.f4703c.put(iBinder, sidecarWindowLayoutInfo);
                this.f4705e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
