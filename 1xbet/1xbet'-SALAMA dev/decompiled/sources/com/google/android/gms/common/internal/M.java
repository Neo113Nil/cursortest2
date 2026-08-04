package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class M implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N f11275a;

    public /* synthetic */ M(N n2) {
        this.f11275a = n2;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        if (i7 == 0) {
            synchronized (this.f11275a.f11285d) {
                try {
                    K k7 = (K) message.obj;
                    L l7 = (L) this.f11275a.f11285d.get(k7);
                    if (l7 != null && l7.f11268a.isEmpty()) {
                        if (l7.f11270c) {
                            l7.f11274g.f11287f.removeMessages(1, l7.f11272e);
                            N n2 = l7.f11274g;
                            n2.f11288g.b(n2.f11286e, l7);
                            l7.f11270c = false;
                            l7.f11269b = 2;
                        }
                        this.f11275a.f11285d.remove(k7);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        if (i7 != 1) {
            return false;
        }
        synchronized (this.f11275a.f11285d) {
            try {
                K k8 = (K) message.obj;
                L l8 = (L) this.f11275a.f11285d.get(k8);
                if (l8 != null && l8.f11269b == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(k8)), new Exception());
                    ComponentName componentName = l8.f11273f;
                    if (componentName == null) {
                        k8.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = k8.f11266b;
                        D.i(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    l8.onServiceDisconnected(componentName);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
