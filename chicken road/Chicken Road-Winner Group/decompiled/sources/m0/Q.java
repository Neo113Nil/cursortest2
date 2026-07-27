package m0;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9995a;

    /* renamed from: b, reason: collision with root package name */
    public final r f9996b;

    /* renamed from: c, reason: collision with root package name */
    public final G0.j f9997c;

    /* renamed from: d, reason: collision with root package name */
    public final V1.b f9998d;

    /* renamed from: e, reason: collision with root package name */
    public final P f9999e = new P(this, true);
    public final P f = new P(this, false);

    /* renamed from: g, reason: collision with root package name */
    public boolean f10000g;

    public Q(Context context, r rVar, G0.j jVar, V1.b bVar) {
        this.f9995a = context;
        this.f9996b = rVar;
        this.f9997c = jVar;
        this.f9998d = bVar;
    }

    public final void a(boolean z3) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f10000g = z3;
        this.f.a(this.f9995a, intentFilter2);
        if (!this.f10000g) {
            this.f9999e.a(this.f9995a, intentFilter);
            return;
        }
        P p3 = this.f9999e;
        Context context = this.f9995a;
        synchronized (p3) {
            try {
                if (p3.f9992a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    context.registerReceiver(p3, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != p3.f9993b ? 4 : 2);
                } else {
                    context.registerReceiver(p3, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                p3.f9992a = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
