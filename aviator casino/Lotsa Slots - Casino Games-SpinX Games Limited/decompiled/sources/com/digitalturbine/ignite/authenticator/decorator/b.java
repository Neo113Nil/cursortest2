package com.digitalturbine.ignite.authenticator.decorator;

/* loaded from: classes2.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.digitalturbine.ignite.authenticator.decorator.e f3502a;

    public b(com.digitalturbine.ignite.authenticator.decorator.e eVar) {
        this.f3502a = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f3502a.l) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClassName(this.f3502a.h, "com.digitalturbine.ignite.cl.IgniteRemoteService");
            com.digitalturbine.ignite.authenticator.decorator.e eVar = this.f3502a;
            android.content.Context context = eVar.e;
            if (context != null) {
                try {
                    context.bindService(intent, eVar, 1);
                } catch (java.lang.Throwable th) {
                    java.lang.Object[] objArr = {th};
                    com.digitalturbine.ignite.authenticator.logger.ILogger iLogger = com.digitalturbine.ignite.authenticator.logger.a.b.f3510a;
                    if (iLogger != null) {
                        iLogger.e("Failed to bind IgniteRemoteService", objArr);
                    }
                    if (th.getMessage() != null && th.getMessage().contains("Too many bind requests")) {
                    } else {
                        com.digitalturbine.ignite.authenticator.events.b.a(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_GENERAL_ERROR, com.digitalturbine.ignite.authenticator.utils.events.a.a(th, com.digitalturbine.ignite.authenticator.events.c.IGNITE_SERVICE_UNAVAILABLE));
                    }
                }
            }
        }
    }
}
