package m3;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.ads.Jt;
import java.util.HashMap;
import java.util.concurrent.Executor;
import p3.C2258a;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f18014g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static F f18015h;
    public static HandlerThread i;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f18016a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f18017b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Jt f18018c;

    /* renamed from: d, reason: collision with root package name */
    public final C2258a f18019d;

    /* renamed from: e, reason: collision with root package name */
    public final long f18020e;
    public final long f;

    public F(Context context, Looper looper) {
        E e3 = new E(this);
        this.f18017b = context.getApplicationContext();
        Jt jt = new Jt(looper, e3, 2);
        Looper.getMainLooper();
        this.f18018c = jt;
        this.f18019d = C2258a.a();
        this.f18020e = 5000L;
        this.f = 300000L;
    }

    public static F a(Context context) {
        synchronized (f18014g) {
            try {
                if (f18015h == null) {
                    f18015h = new F(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f18015h;
    }

    public static HandlerThread b() {
        synchronized (f18014g) {
            try {
                HandlerThread handlerThread = i;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                i = handlerThread2;
                handlerThread2.start();
                return i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str, ServiceConnection serviceConnection, boolean z3) {
        C c5 = new C(str, z3);
        v.f("ServiceConnection must not be null", serviceConnection);
        synchronized (this.f18016a) {
            try {
                D d5 = (D) this.f18016a.get(c5);
                if (d5 == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(c5.toString()));
                }
                if (!d5.f18007a.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(c5.toString()));
                }
                d5.f18007a.remove(serviceConnection);
                if (d5.f18007a.isEmpty()) {
                    this.f18018c.sendMessageDelayed(this.f18018c.obtainMessage(0, c5), this.f18020e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(C c5, y yVar, String str, Executor executor) {
        boolean z3;
        synchronized (this.f18016a) {
            try {
                D d5 = (D) this.f18016a.get(c5);
                if (executor == null) {
                    executor = null;
                }
                if (d5 == null) {
                    d5 = new D(this, c5);
                    d5.f18007a.put(yVar, yVar);
                    d5.a(str, executor);
                    this.f18016a.put(c5, d5);
                } else {
                    this.f18018c.removeMessages(0, c5);
                    if (d5.f18007a.containsKey(yVar)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(c5.toString()));
                    }
                    d5.f18007a.put(yVar, yVar);
                    int i5 = d5.f18008b;
                    if (i5 == 1) {
                        yVar.onServiceConnected(d5.f, d5.f18010d);
                    } else if (i5 == 2) {
                        d5.a(str, executor);
                    }
                }
                z3 = d5.f18009c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }
}
