package o1;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import com.onesignal.debug.internal.crash.AnrConstants;
import java.util.HashMap;
import r1.C1403a;

/* renamed from: o1.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1361F {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f11515g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static C1361F f11516h;

    /* renamed from: i, reason: collision with root package name */
    public static HandlerThread f11517i;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f11518a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f11519b;

    /* renamed from: c, reason: collision with root package name */
    public volatile A1.c f11520c;

    /* renamed from: d, reason: collision with root package name */
    public final C1403a f11521d;

    /* renamed from: e, reason: collision with root package name */
    public final long f11522e;

    /* renamed from: f, reason: collision with root package name */
    public final long f11523f;

    public C1361F(Context context, Looper looper) {
        C1360E c1360e = new C1360E(this);
        this.f11519b = context.getApplicationContext();
        A1.c cVar = new A1.c(looper, c1360e);
        Looper.getMainLooper();
        this.f11520c = cVar;
        this.f11521d = C1403a.a();
        this.f11522e = AnrConstants.DEFAULT_ANR_THRESHOLD_MS;
        this.f11523f = 300000L;
    }

    public final void a(String str, ServiceConnection serviceConnection, boolean z) {
        C1358C c1358c = new C1358C(str, z);
        u.h(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f11518a) {
            try {
                ServiceConnectionC1359D serviceConnectionC1359D = (ServiceConnectionC1359D) this.f11518a.get(c1358c);
                if (serviceConnectionC1359D == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(c1358c.toString()));
                }
                if (!serviceConnectionC1359D.f11507a.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(c1358c.toString()));
                }
                serviceConnectionC1359D.f11507a.remove(serviceConnection);
                if (serviceConnectionC1359D.f11507a.isEmpty()) {
                    this.f11520c.sendMessageDelayed(this.f11520c.obtainMessage(0, c1358c), this.f11522e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(C1358C c1358c, x xVar, String str) {
        boolean z;
        synchronized (this.f11518a) {
            try {
                ServiceConnectionC1359D serviceConnectionC1359D = (ServiceConnectionC1359D) this.f11518a.get(c1358c);
                if (serviceConnectionC1359D == null) {
                    serviceConnectionC1359D = new ServiceConnectionC1359D(this, c1358c);
                    serviceConnectionC1359D.f11507a.put(xVar, xVar);
                    serviceConnectionC1359D.a(str, null);
                    this.f11518a.put(c1358c, serviceConnectionC1359D);
                } else {
                    this.f11520c.removeMessages(0, c1358c);
                    if (serviceConnectionC1359D.f11507a.containsKey(xVar)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(c1358c.toString()));
                    }
                    serviceConnectionC1359D.f11507a.put(xVar, xVar);
                    int i2 = serviceConnectionC1359D.f11508b;
                    if (i2 == 1) {
                        xVar.onServiceConnected(serviceConnectionC1359D.f11512f, serviceConnectionC1359D.f11510d);
                    } else if (i2 == 2) {
                        serviceConnectionC1359D.a(str, null);
                    }
                }
                z = serviceConnectionC1359D.f11509c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
