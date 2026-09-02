package p0;

/* renamed from: p0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0947B {

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.Object f8211g = new java.lang.Object();

    /* renamed from: h, reason: collision with root package name */
    public static p0.C0947B f8212h;

    /* renamed from: i, reason: collision with root package name */
    public static android.os.HandlerThread f8213i;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f8214a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f8215b;

    /* renamed from: c, reason: collision with root package name */
    public volatile A0.a f8216c;

    /* renamed from: d, reason: collision with root package name */
    public final s0.C0990a f8217d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8218e;

    /* renamed from: f, reason: collision with root package name */
    public final long f8219f;

    public C0947B(android.content.Context context, android.os.Looper looper) {
        p0.C0946A c0946a = new p0.C0946A(this);
        this.f8215b = context.getApplicationContext();
        A0.a aVar = new A0.a(looper, c0946a);
        android.os.Looper.getMainLooper();
        this.f8216c = aVar;
        this.f8217d = s0.C0990a.a();
        this.f8218e = 5000L;
        this.f8219f = 300000L;
    }

    public final void a(java.lang.String str, android.content.ServiceConnection serviceConnection, boolean z2) {
        p0.C0973y c0973y = new p0.C0973y(str, z2);
        p0.AbstractC0966r.d(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f8214a) {
            try {
                p0.ServiceConnectionC0974z serviceConnectionC0974z = (p0.ServiceConnectionC0974z) this.f8214a.get(c0973y);
                if (serviceConnectionC0974z == null) {
                    throw new java.lang.IllegalStateException("Nonexistent connection status for service config: ".concat(c0973y.toString()));
                }
                if (!serviceConnectionC0974z.f8304a.containsKey(serviceConnection)) {
                    throw new java.lang.IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(c0973y.toString()));
                }
                serviceConnectionC0974z.f8304a.remove(serviceConnection);
                if (serviceConnectionC0974z.f8304a.isEmpty()) {
                    this.f8216c.sendMessageDelayed(this.f8216c.obtainMessage(0, c0973y), this.f8218e);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(p0.C0973y c0973y, p0.ServiceConnectionC0969u serviceConnectionC0969u, java.lang.String str) {
        boolean z2;
        synchronized (this.f8214a) {
            try {
                p0.ServiceConnectionC0974z serviceConnectionC0974z = (p0.ServiceConnectionC0974z) this.f8214a.get(c0973y);
                if (serviceConnectionC0974z == null) {
                    serviceConnectionC0974z = new p0.ServiceConnectionC0974z(this, c0973y);
                    serviceConnectionC0974z.f8304a.put(serviceConnectionC0969u, serviceConnectionC0969u);
                    serviceConnectionC0974z.a(str, null);
                    this.f8214a.put(c0973y, serviceConnectionC0974z);
                } else {
                    this.f8216c.removeMessages(0, c0973y);
                    if (serviceConnectionC0974z.f8304a.containsKey(serviceConnectionC0969u)) {
                        throw new java.lang.IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(c0973y.toString()));
                    }
                    serviceConnectionC0974z.f8304a.put(serviceConnectionC0969u, serviceConnectionC0969u);
                    int i2 = serviceConnectionC0974z.f8305b;
                    if (i2 == 1) {
                        serviceConnectionC0969u.onServiceConnected(serviceConnectionC0974z.f8309f, serviceConnectionC0974z.f8307d);
                    } else if (i2 == 2) {
                        serviceConnectionC0974z.a(str, null);
                    }
                }
                z2 = serviceConnectionC0974z.f8306c;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return z2;
    }
}
