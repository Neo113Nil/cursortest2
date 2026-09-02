package p0;

/* renamed from: p0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC0969u implements android.content.ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final int f8291a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f8292b;

    public ServiceConnectionC0969u(com.google.android.gms.common.internal.a aVar, int i2) {
        this.f8292b = aVar;
        this.f8291a = i2;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        int i2;
        int i3;
        com.google.android.gms.common.internal.a aVar = this.f8292b;
        if (iBinder == null) {
            synchronized (aVar.f2604f) {
                i2 = aVar.f2611m;
            }
            if (i2 == 3) {
                aVar.t = true;
                i3 = 5;
            } else {
                i3 = 4;
            }
            p0.HandlerC0967s handlerC0967s = aVar.f2603e;
            handlerC0967s.sendMessage(handlerC0967s.obtainMessage(i3, aVar.f2619v.get(), 16));
            return;
        }
        synchronized (aVar.f2605g) {
            try {
                com.google.android.gms.common.internal.a aVar2 = this.f8292b;
                android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                aVar2.f2606h = (queryLocalInterface == null || !(queryLocalInterface instanceof p0.C0965q)) ? new p0.C0965q(iBinder) : (p0.C0965q) queryLocalInterface;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.common.internal.a aVar3 = this.f8292b;
        int i4 = this.f8291a;
        aVar3.getClass();
        p0.C0971w c0971w = new p0.C0971w(aVar3, 0);
        p0.HandlerC0967s handlerC0967s2 = aVar3.f2603e;
        handlerC0967s2.sendMessage(handlerC0967s2.obtainMessage(7, i4, -1, c0971w));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        com.google.android.gms.common.internal.a aVar;
        synchronized (this.f8292b.f2605g) {
            aVar = this.f8292b;
            aVar.f2606h = null;
        }
        int i2 = this.f8291a;
        p0.HandlerC0967s handlerC0967s = aVar.f2603e;
        handlerC0967s.sendMessage(handlerC0967s.obtainMessage(6, i2, 1));
    }
}
