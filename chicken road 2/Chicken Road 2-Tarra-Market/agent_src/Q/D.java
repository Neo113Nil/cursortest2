package Q;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f387g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static D f388h;

    /* renamed from: i, reason: collision with root package name */
    public static HandlerThread f389i;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f390a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f391b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Z.e f392c;

    /* renamed from: d, reason: collision with root package name */
    public final T.b f393d;

    /* renamed from: e, reason: collision with root package name */
    public final long f394e;

    /* renamed from: f, reason: collision with root package name */
    public final long f395f;

    public D(Context context, Looper looper) {
        C c2 = new C(this);
        this.f391b = context.getApplicationContext();
        Z.e eVar = new Z.e(looper, c2);
        Looper.getMainLooper();
        this.f392c = eVar;
        this.f393d = T.b.a();
        this.f394e = 5000L;
        this.f395f = 300000L;
    }

    public final void a(String str, ServiceConnection serviceConnection, boolean z2) {
        z zVar = new z(str, z2);
        s.d(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f390a) {
            try {
                B b2 = (B) this.f390a.get(zVar);
                if (b2 == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(zVar.toString()));
                }
                if (!b2.f379a.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(zVar.toString()));
                }
                b2.f379a.remove(serviceConnection);
                if (b2.f379a.isEmpty()) {
                    this.f392c.sendMessageDelayed(this.f392c.obtainMessage(0, zVar), this.f394e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(z zVar, v vVar, String str) {
        boolean z2;
        synchronized (this.f390a) {
            try {
                B b2 = (B) this.f390a.get(zVar);
                if (b2 == null) {
                    b2 = new B(this, zVar);
                    b2.f379a.put(vVar, vVar);
                    b2.a(str, null);
                    this.f390a.put(zVar, b2);
                } else {
                    this.f392c.removeMessages(0, zVar);
                    if (b2.f379a.containsKey(vVar)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(zVar.toString()));
                    }
                    b2.f379a.put(vVar, vVar);
                    int i2 = b2.f380b;
                    if (i2 == 1) {
                        vVar.onServiceConnected(b2.f384f, b2.f382d);
                    } else if (i2 == 2) {
                        b2.a(str, null);
                    }
                }
                z2 = b2.f381c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }
}
