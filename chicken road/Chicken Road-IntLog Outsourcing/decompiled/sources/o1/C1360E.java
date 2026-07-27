package o1;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;

/* renamed from: o1.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1360E implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1361F f11514a;

    public /* synthetic */ C1360E(C1361F c1361f) {
        this.f11514a = c1361f;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            synchronized (this.f11514a.f11518a) {
                try {
                    C1358C c1358c = (C1358C) message.obj;
                    ServiceConnectionC1359D serviceConnectionC1359D = (ServiceConnectionC1359D) this.f11514a.f11518a.get(c1358c);
                    if (serviceConnectionC1359D != null && serviceConnectionC1359D.f11507a.isEmpty()) {
                        if (serviceConnectionC1359D.f11509c) {
                            serviceConnectionC1359D.f11513g.f11520c.removeMessages(1, serviceConnectionC1359D.f11511e);
                            C1361F c1361f = serviceConnectionC1359D.f11513g;
                            c1361f.f11521d.b(c1361f.f11519b, serviceConnectionC1359D);
                            serviceConnectionC1359D.f11509c = false;
                            serviceConnectionC1359D.f11508b = 2;
                        }
                        this.f11514a.f11518a.remove(c1358c);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i2 != 1) {
            return false;
        }
        synchronized (this.f11514a.f11518a) {
            try {
                C1358C c1358c2 = (C1358C) message.obj;
                ServiceConnectionC1359D serviceConnectionC1359D2 = (ServiceConnectionC1359D) this.f11514a.f11518a.get(c1358c2);
                if (serviceConnectionC1359D2 != null && serviceConnectionC1359D2.f11508b == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(c1358c2)), new Exception());
                    ComponentName componentName = serviceConnectionC1359D2.f11512f;
                    if (componentName == null) {
                        c1358c2.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = c1358c2.f11505b;
                        u.g(str);
                        componentName = new ComponentName(str, CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE);
                    }
                    serviceConnectionC1359D2.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
