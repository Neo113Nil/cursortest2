package G0;

import M2.C0097a;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public final Context f801a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0069t f802b;

    /* renamed from: c, reason: collision with root package name */
    public final C0097a f803c;

    /* renamed from: d, reason: collision with root package name */
    public final B0.l f804d;

    /* renamed from: e, reason: collision with root package name */
    public final Q f805e = new Q(this, true);

    /* renamed from: f, reason: collision with root package name */
    public final Q f806f = new Q(this, false);

    /* renamed from: g, reason: collision with root package name */
    public boolean f807g;

    public S(Context context, InterfaceC0069t interfaceC0069t, C0097a c0097a, B0.l lVar) {
        this.f801a = context;
        this.f802b = interfaceC0069t;
        this.f803c = c0097a;
        this.f804d = lVar;
    }

    public final void a(boolean z) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f807g = z;
        this.f806f.a(this.f801a, intentFilter2);
        if (!this.f807g) {
            this.f805e.a(this.f801a, intentFilter);
            return;
        }
        Q q5 = this.f805e;
        Context context = this.f801a;
        synchronized (q5) {
            try {
                if (!q5.f798a) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        context.registerReceiver(q5, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != q5.f799b ? 4 : 2);
                    } else {
                        context.registerReceiver(q5, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                    }
                    q5.f798a = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
