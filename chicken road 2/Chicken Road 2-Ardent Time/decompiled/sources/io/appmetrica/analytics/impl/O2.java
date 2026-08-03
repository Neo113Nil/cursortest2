package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class O2 implements io.appmetrica.analytics.impl.InterfaceC0518lk {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f4758a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Intent f4759b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f4760c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.G5 f4761d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor f4762e;

    public O2(android.content.Context context, io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor iHandlerExecutor) {
        this(context, iHandlerExecutor, 0);
    }

    public final synchronized android.content.Intent a(io.appmetrica.analytics.coreapi.internal.backport.Consumer<android.content.Intent> consumer) {
        this.f4758a.add(consumer);
        return this.f4759b;
    }

    public final void b() {
        this.f4759b = null;
        io.appmetrica.analytics.impl.G5 g5 = this.f4761d;
        android.content.Context context = this.f4760c;
        synchronized (g5) {
            if (g5.f4321b) {
                try {
                    context.unregisterReceiver(g5.f4320a);
                    g5.f4321b = false;
                } catch (java.lang.Throwable unused) {
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0518lk
    public final synchronized void onCreate() {
        android.content.Intent a2 = a();
        this.f4759b = a2;
        java.util.Iterator it = this.f4758a.iterator();
        while (it.hasNext()) {
            ((io.appmetrica.analytics.coreapi.internal.backport.Consumer) it.next()).consume(a2);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0518lk
    public final synchronized void onDestroy() {
        this.f4759b = null;
        b();
        java.util.Iterator it = this.f4758a.iterator();
        while (it.hasNext()) {
            ((io.appmetrica.analytics.coreapi.internal.backport.Consumer) it.next()).consume(null);
        }
    }

    public O2(android.content.Context context, io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor iHandlerExecutor, int i2) {
        this.f4758a = new java.util.ArrayList();
        this.f4759b = null;
        this.f4760c = context;
        this.f4762e = iHandlerExecutor;
        this.f4761d = io.appmetrica.analytics.impl.F5.a(new io.appmetrica.analytics.impl.C0707t2(new io.appmetrica.analytics.impl.N2(this), iHandlerExecutor));
    }

    public final android.content.Intent a() {
        android.content.Intent intent;
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED");
        io.appmetrica.analytics.impl.G5 g5 = this.f4761d;
        android.content.Context context = this.f4760c;
        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor iHandlerExecutor = this.f4762e;
        synchronized (g5) {
            intent = null;
            try {
                intent = context.registerReceiver(g5.f4320a, intentFilter, null, iHandlerExecutor.getHandler());
                g5.f4321b = true;
            } catch (java.lang.Throwable unused) {
            }
        }
        return intent;
    }
}
