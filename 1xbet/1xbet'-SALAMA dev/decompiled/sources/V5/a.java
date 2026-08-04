package V5;

import D6.y0;
import H2.r;
import K4.C0318e;
import K4.C0319f;
import K4.t;
import U5.AbstractC0439f;
import U5.C0437d;
import U5.EnumC0446m;
import U5.Q;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends Q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Q f6675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f6676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConnectivityManager f6677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f6678g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Runnable f6679h;

    public a(Q q7, Context context) {
        this.f6675d = q7;
        this.f6676e = context;
        if (context == null) {
            this.f6677f = null;
            return;
        }
        this.f6677f = (ConnectivityManager) context.getSystemService("connectivity");
        try {
            y();
        } catch (SecurityException e7) {
            Log.w("AndroidChannelBuilder", "Failed to configure network monitoring. Does app have ACCESS_NETWORK_STATE permission?", e7);
        }
    }

    @Override // U5.AbstractC0438e
    public final AbstractC0439f n(r rVar, C0437d c0437d) {
        return this.f6675d.n(rVar, c0437d);
    }

    @Override // U5.Q
    public final boolean s(long j, TimeUnit timeUnit) {
        return this.f6675d.s(j, timeUnit);
    }

    @Override // U5.Q
    public final void t() {
        this.f6675d.t();
    }

    @Override // U5.Q
    public final EnumC0446m u() {
        return this.f6675d.u();
    }

    @Override // U5.Q
    public final void v(EnumC0446m enumC0446m, t tVar) {
        this.f6675d.v(enumC0446m, tVar);
    }

    @Override // U5.Q
    public final Q w() {
        synchronized (this.f6678g) {
            try {
                Runnable runnable = this.f6679h;
                if (runnable != null) {
                    runnable.run();
                    this.f6679h = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f6675d.w();
    }

    @Override // U5.Q
    public final Q x() {
        synchronized (this.f6678g) {
            try {
                Runnable runnable = this.f6679h;
                if (runnable != null) {
                    runnable.run();
                    this.f6679h = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f6675d.x();
    }

    public final void y() {
        ConnectivityManager connectivityManager = this.f6677f;
        if (connectivityManager != null) {
            C0318e c0318e = new C0318e(this, 1);
            connectivityManager.registerDefaultNetworkCallback(c0318e);
            this.f6679h = new y0(17, this, c0318e, false);
        } else {
            C0319f c0319f = new C0319f(this, 1);
            this.f6676e.registerReceiver(c0319f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f6679h = new y0(18, this, c0319f, false);
        }
    }
}
