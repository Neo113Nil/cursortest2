package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import j0.a;
import j0.f;
import java.util.WeakHashMap;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* renamed from: b, reason: collision with root package name */
    public SidecarDeviceState f2440b;

    /* renamed from: d, reason: collision with root package name */
    public final f f2442d;

    /* renamed from: e, reason: collision with root package name */
    public final SidecarInterface.SidecarCallback f2443e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f2439a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f2441c = new WeakHashMap();

    public DistinctElementSidecarCallback(f fVar, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f2442d = fVar;
        this.f2443e = sidecarCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x001f, code lost:
    
        if (j0.a.b(r2) == j0.a.b(r4)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.f2439a) {
            try {
                f fVar = this.f2442d;
                SidecarDeviceState sidecarDeviceState2 = this.f2440b;
                fVar.getClass();
                if (!j.a(sidecarDeviceState2, sidecarDeviceState)) {
                    if (sidecarDeviceState2 == null) {
                    }
                    this.f2440b = sidecarDeviceState;
                    this.f2443e.onDeviceStateChanged(sidecarDeviceState);
                }
            } finally {
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        boolean b3;
        synchronized (this.f2439a) {
            try {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.f2441c.get(iBinder);
                this.f2442d.getClass();
                if (j.a(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                    b3 = true;
                } else {
                    if (sidecarWindowLayoutInfo2 != null && sidecarWindowLayoutInfo != null) {
                        b3 = f.b(a.c(sidecarWindowLayoutInfo2), a.c(sidecarWindowLayoutInfo));
                    }
                    b3 = false;
                }
                if (b3) {
                    return;
                }
                this.f2441c.put(iBinder, sidecarWindowLayoutInfo);
                this.f2443e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } finally {
            }
        }
    }
}
