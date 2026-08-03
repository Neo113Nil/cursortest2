package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC0705t0 extends android.app.Service {

    /* renamed from: a, reason: collision with root package name */
    public io.appmetrica.analytics.impl.L1 f6830a;

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        io.appmetrica.analytics.impl.L1 l12 = this.f6830a;
        if (l12 != null) {
            return l12.a(intent);
        }
        kotlin.jvm.internal.i.i("serviceDelegate");
        throw null;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        io.appmetrica.analytics.impl.L1 l12 = this.f6830a;
        if (l12 != null) {
            l12.a(configuration);
        } else {
            kotlin.jvm.internal.i.i("serviceDelegate");
            throw null;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (this.f6830a == null) {
            this.f6830a = new io.appmetrica.analytics.impl.L1(this, new io.appmetrica.analytics.impl.C0731u0(this));
        }
        io.appmetrica.analytics.impl.L1 l12 = this.f6830a;
        if (l12 != null) {
            l12.b();
        } else {
            kotlin.jvm.internal.i.i("serviceDelegate");
            throw null;
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        io.appmetrica.analytics.impl.L1 l12 = this.f6830a;
        if (l12 != null) {
            l12.c();
        } else {
            kotlin.jvm.internal.i.i("serviceDelegate");
            throw null;
        }
    }

    @Override // android.app.Service
    public void onRebind(android.content.Intent intent) {
        super.onRebind(intent);
        io.appmetrica.analytics.impl.L1 l12 = this.f6830a;
        if (l12 != null) {
            l12.b(intent);
        } else {
            kotlin.jvm.internal.i.i("serviceDelegate");
            throw null;
        }
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i2, int i3) {
        io.appmetrica.analytics.impl.L1 l12 = this.f6830a;
        if (l12 != null) {
            return l12.a(intent, i2, i3);
        }
        kotlin.jvm.internal.i.i("serviceDelegate");
        throw null;
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        io.appmetrica.analytics.impl.L1 l12 = this.f6830a;
        if (l12 != null) {
            return l12.c(intent);
        }
        kotlin.jvm.internal.i.i("serviceDelegate");
        throw null;
    }
}
