package Q;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;

/* loaded from: classes.dex */
public final class C implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ D f386a;

    public /* synthetic */ C(D d2) {
        this.f386a = d2;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            synchronized (this.f386a.f390a) {
                try {
                    z zVar = (z) message.obj;
                    B b2 = (B) this.f386a.f390a.get(zVar);
                    if (b2 != null && b2.f379a.isEmpty()) {
                        if (b2.f381c) {
                            b2.f385g.f392c.removeMessages(1, b2.f383e);
                            D d2 = b2.f385g;
                            d2.f393d.b(d2.f391b, b2);
                            b2.f381c = false;
                            b2.f380b = 2;
                        }
                        this.f386a.f390a.remove(zVar);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i2 != 1) {
            return false;
        }
        synchronized (this.f386a.f390a) {
            try {
                z zVar2 = (z) message.obj;
                B b3 = (B) this.f386a.f390a.get(zVar2);
                if (b3 != null && b3.f380b == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(zVar2)), new Exception());
                    ComponentName componentName = b3.f384f;
                    if (componentName == null) {
                        zVar2.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = zVar2.f486b;
                        s.c(str);
                        componentName = new ComponentName(str, CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE);
                    }
                    b3.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
