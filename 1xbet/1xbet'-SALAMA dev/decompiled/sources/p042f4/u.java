package p042f4;

import D6.y0;
import Y3.i;
import android.app.Application;
import android.content.Context;
import android.os.HandlerThread;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C0782c;
import com.google.android.gms.internal.p002firebaseauthapi.zzg;

/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile int f12973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0899h f12974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f12975c;

    public u(i iVar) {
        iVar.b();
        Context context = iVar.f7663a;
        C0899h c0899h = new C0899h();
        C0899h.f12943f.e("Initializing TokenRefresher", new Object[0]);
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        handlerThread.start();
        c0899h.f12947d = new zzg(handlerThread.getLooper());
        iVar.b();
        c0899h.f12948e = new y0(c0899h, iVar.f7664b);
        c0899h.f12946c = 300000L;
        this.f12975c = false;
        this.f12973a = 0;
        this.f12974b = c0899h;
        ComponentCallbacks2C0782c.b((Application) context.getApplicationContext());
        ComponentCallbacks2C0782c.f11168e.a(new x(this));
    }

    public final void a(int i7) {
        if (i7 > 0 && this.f12973a == 0) {
            this.f12973a = i7;
            if (this.f12973a > 0 && !this.f12975c) {
                this.f12974b.a();
            }
        } else if (i7 == 0 && this.f12973a != 0) {
            C0899h c0899h = this.f12974b;
            c0899h.f12947d.removeCallbacks(c0899h.f12948e);
        }
        this.f12973a = i7;
    }
}
