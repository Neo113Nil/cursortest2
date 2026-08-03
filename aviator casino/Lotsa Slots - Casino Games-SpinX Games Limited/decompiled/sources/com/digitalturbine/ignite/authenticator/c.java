package com.digitalturbine.ignite.authenticator;

/* loaded from: classes2.dex */
public final class c implements com.digitalturbine.ignite.authenticator.listeners.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public com.digitalturbine.ignite.authenticator.receiver.a f3499a = new com.digitalturbine.ignite.authenticator.receiver.a(this);
    public android.content.Context b;
    public com.digitalturbine.ignite.authenticator.decorator.a c;
    public com.digitalturbine.ignite.authenticator.decorator.h d;

    public c(android.content.Context context, com.digitalturbine.ignite.authenticator.decorator.a aVar, com.digitalturbine.ignite.authenticator.decorator.h hVar) {
        this.b = context.getApplicationContext();
        this.c = aVar;
        this.d = hVar;
    }

    public final void a() {
        com.digitalturbine.ignite.authenticator.receiver.a aVar;
        com.digitalturbine.ignite.authenticator.logger.a.a("%s : start", "OneDTPropertyWatchdog");
        android.content.Context context = this.b;
        if (context == null || (aVar = this.f3499a) == null || aVar.b) {
            return;
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("com.dt.ignite.service.action.PROPERTY_CHANGED");
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(aVar, intentFilter, 4);
        } else {
            context.registerReceiver(aVar, intentFilter);
        }
        this.f3499a.b = true;
    }
}
