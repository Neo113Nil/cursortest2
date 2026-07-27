package S0;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f1289g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static B f1290h;

    /* renamed from: i, reason: collision with root package name */
    public static HandlerThread f1291i;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1292a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f1293b;

    /* renamed from: c, reason: collision with root package name */
    public volatile b1.e f1294c;

    /* renamed from: d, reason: collision with root package name */
    public final V0.a f1295d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1296e;
    public final long f;

    public B(Context context, Looper looper) {
        A a3 = new A(this);
        this.f1293b = context.getApplicationContext();
        b1.e eVar = new b1.e(looper, a3);
        Looper.getMainLooper();
        this.f1294c = eVar;
        this.f1295d = V0.a.a();
        this.f1296e = 5000L;
        this.f = 300000L;
    }

    public final void a(String str, ServiceConnection serviceConnection, boolean z3) {
        y yVar = new y(str, z3);
        r.d(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f1292a) {
            try {
                z zVar = (z) this.f1292a.get(yVar);
                if (zVar == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(yVar.toString()));
                }
                if (!zVar.f1377a.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(yVar.toString()));
                }
                zVar.f1377a.remove(serviceConnection);
                if (zVar.f1377a.isEmpty()) {
                    this.f1294c.sendMessageDelayed(this.f1294c.obtainMessage(0, yVar), this.f1296e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(y yVar, u uVar, String str) {
        boolean z3;
        synchronized (this.f1292a) {
            try {
                z zVar = (z) this.f1292a.get(yVar);
                if (zVar == null) {
                    zVar = new z(this, yVar);
                    zVar.f1377a.put(uVar, uVar);
                    zVar.a(str, null);
                    this.f1292a.put(yVar, zVar);
                } else {
                    this.f1294c.removeMessages(0, yVar);
                    if (zVar.f1377a.containsKey(uVar)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(yVar.toString()));
                    }
                    zVar.f1377a.put(uVar, uVar);
                    int i3 = zVar.f1378b;
                    if (i3 == 1) {
                        uVar.onServiceConnected(zVar.f, zVar.f1380d);
                    } else if (i3 == 2) {
                        zVar.a(str, null);
                    }
                }
                z3 = zVar.f1379c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }
}
