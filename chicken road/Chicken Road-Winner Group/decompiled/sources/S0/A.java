package S0;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;

/* loaded from: classes.dex */
public final class A implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B f1288a;

    public /* synthetic */ A(B b3) {
        this.f1288a = b3;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i3 = message.what;
        if (i3 == 0) {
            synchronized (this.f1288a.f1292a) {
                try {
                    y yVar = (y) message.obj;
                    z zVar = (z) this.f1288a.f1292a.get(yVar);
                    if (zVar != null && zVar.f1377a.isEmpty()) {
                        if (zVar.f1379c) {
                            zVar.f1382g.f1294c.removeMessages(1, zVar.f1381e);
                            B b3 = zVar.f1382g;
                            b3.f1295d.b(b3.f1293b, zVar);
                            zVar.f1379c = false;
                            zVar.f1378b = 2;
                        }
                        this.f1288a.f1292a.remove(yVar);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i3 != 1) {
            return false;
        }
        synchronized (this.f1288a.f1292a) {
            try {
                y yVar2 = (y) message.obj;
                z zVar2 = (z) this.f1288a.f1292a.get(yVar2);
                if (zVar2 != null && zVar2.f1378b == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(yVar2)), new Exception());
                    ComponentName componentName = zVar2.f;
                    if (componentName == null) {
                        yVar2.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = yVar2.f1375b;
                        r.c(str);
                        componentName = new ComponentName(str, CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE);
                    }
                    zVar2.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
