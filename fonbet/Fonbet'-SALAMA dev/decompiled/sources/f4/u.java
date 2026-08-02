package f4;

import D6.y0;
import android.app.Application;
import android.content.Context;
import android.os.HandlerThread;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C0826c;
import com.google.android.gms.internal.p002firebaseauthapi.zzg;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public volatile int f12967a;

    /* renamed from: b, reason: collision with root package name */
    public final C1096h f12968b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f12969c;

    public u(Y3.i iVar) {
        iVar.b();
        Context context = iVar.f7663a;
        C1096h c1096h = new C1096h();
        C1096h.f12937f.e("Initializing TokenRefresher", new Object[0]);
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        handlerThread.start();
        c1096h.f12941d = new zzg(handlerThread.getLooper());
        iVar.b();
        c1096h.f12942e = new y0(c1096h, iVar.f7664b);
        c1096h.f12940c = 300000L;
        this.f12969c = false;
        this.f12967a = 0;
        this.f12968b = c1096h;
        ComponentCallbacks2C0826c.b((Application) context.getApplicationContext());
        ComponentCallbacks2C0826c.f11168e.a(new x(this));
    }

    public final void a(int i7) {
        if (i7 > 0 && this.f12967a == 0) {
            this.f12967a = i7;
            if (this.f12967a > 0 && !this.f12969c) {
                this.f12968b.a();
            }
        } else if (i7 == 0 && this.f12967a != 0) {
            C1096h c1096h = this.f12968b;
            c1096h.f12941d.removeCallbacks(c1096h.f12942e);
        }
        this.f12967a = i7;
    }
}
