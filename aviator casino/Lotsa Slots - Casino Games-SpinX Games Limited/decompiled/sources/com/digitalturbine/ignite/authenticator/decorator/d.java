package com.digitalturbine.ignite.authenticator.decorator;

/* loaded from: classes2.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.ComponentName f3504a;
    public final /* synthetic */ android.os.IBinder b;
    public final /* synthetic */ com.digitalturbine.ignite.authenticator.decorator.e c;

    public d(com.digitalturbine.ignite.authenticator.decorator.e eVar, android.content.ComponentName componentName, android.os.IBinder iBinder) {
        this.c = eVar;
        this.f3504a = componentName;
        this.b = iBinder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a(this.f3504a, this.b);
    }
}
