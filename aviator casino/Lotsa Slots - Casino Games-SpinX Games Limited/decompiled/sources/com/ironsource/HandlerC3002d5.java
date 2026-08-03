package com.ironsource;

/* renamed from: com.ironsource.d5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class HandlerC3002d5 extends android.os.Handler {
    private static final java.lang.String b = "DownloadHandler";

    /* renamed from: a, reason: collision with root package name */
    com.ironsource.Nc f6198a;

    public HandlerC3002d5(android.os.Looper looper) {
        super(looper);
    }

    public void a(com.ironsource.Nc nc) {
        if (nc == null) {
            throw new java.lang.IllegalArgumentException();
        }
        this.f6198a = nc;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        com.ironsource.Nc nc = this.f6198a;
        if (nc == null) {
            com.ironsource.sdk.utils.Logger.i(b, "OnPreCacheCompletion listener is null, msg: " + message.toString());
            return;
        }
        try {
            int i = message.what;
            if (i == 1016) {
                nc.a((com.ironsource.C3381y8) message.obj);
            } else {
                this.f6198a.a((com.ironsource.C3381y8) message.obj, new com.ironsource.C3220p8(i, com.ironsource.C3263rg.a(i)));
            }
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            com.ironsource.sdk.utils.Logger.i(b, "handleMessage | Got exception: " + th.getMessage());
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(th.toString());
        }
    }

    public void a() {
        this.f6198a = null;
    }
}
