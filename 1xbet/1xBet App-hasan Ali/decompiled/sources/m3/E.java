package m3;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
public final class E implements Handler.Callback {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ F f18013k;

    public /* synthetic */ E(F f) {
        this.f18013k = f;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f18013k.f18016a) {
                try {
                    C c5 = (C) message.obj;
                    D d5 = (D) this.f18013k.f18016a.get(c5);
                    if (d5 != null && d5.f18007a.isEmpty()) {
                        if (d5.f18009c) {
                            d5.f18012g.f18018c.removeMessages(1, d5.f18011e);
                            F f = d5.f18012g;
                            f.f18019d.b(f.f18017b, d5);
                            d5.f18009c = false;
                            d5.f18008b = 2;
                        }
                        this.f18013k.f18016a.remove(c5);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        synchronized (this.f18013k.f18016a) {
            try {
                C c6 = (C) message.obj;
                D d6 = (D) this.f18013k.f18016a.get(c6);
                if (d6 != null && d6.f18008b == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(c6)), new Exception());
                    ComponentName componentName = d6.f;
                    if (componentName == null) {
                        c6.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = c6.f18005b;
                        v.e(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    d6.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
