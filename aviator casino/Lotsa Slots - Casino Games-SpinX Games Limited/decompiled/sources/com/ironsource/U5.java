package com.ironsource;

/* loaded from: classes5.dex */
public class U5 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.Nc> f5998a;

    public U5(android.os.Looper looper) {
        super(looper);
        this.f5998a = new java.util.concurrent.ConcurrentHashMap<>();
    }

    private boolean a(int i) {
        return i == 1016 || i == 1015;
    }

    void a(java.lang.String str, com.ironsource.Nc nc) {
        if (str == null || nc == null) {
            return;
        }
        this.f5998a.put(str, nc);
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        try {
            com.ironsource.C3381y8 c3381y8 = (com.ironsource.C3381y8) message.obj;
            java.lang.String path = c3381y8.getPath();
            com.ironsource.Nc nc = this.f5998a.get(path);
            if (nc == null) {
                return;
            }
            if (a(message.what)) {
                nc.a(c3381y8);
            } else {
                int i = message.what;
                nc.a(c3381y8, new com.ironsource.C3220p8(i, com.ironsource.C3263rg.a(i)));
            }
            this.f5998a.remove(path);
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(th.toString());
        }
    }
}
