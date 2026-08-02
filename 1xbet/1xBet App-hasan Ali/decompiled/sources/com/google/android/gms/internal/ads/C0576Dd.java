package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.Dd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0576Dd {

    /* renamed from: g, reason: collision with root package name */
    public final String f8204g;

    /* renamed from: h, reason: collision with root package name */
    public final T2.I f8205h;

    /* renamed from: a, reason: collision with root package name */
    public long f8199a = -1;

    /* renamed from: b, reason: collision with root package name */
    public long f8200b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f8201c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f8202d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f8203e = 0;
    public final Object f = new Object();
    public int i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f8206j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f8207k = 0;

    public C0576Dd(String str, T2.I i) {
        this.f8204g = str;
        this.f8205h = i;
    }

    public final int a() {
        int i;
        synchronized (this.f) {
            i = this.f8207k;
        }
        return i;
    }

    public final Bundle b(Context context, String str) {
        Bundle bundle;
        synchronized (this.f) {
            try {
                bundle = new Bundle();
                if (!this.f8205h.n()) {
                    bundle.putString("session_id", this.f8204g);
                }
                bundle.putLong("basets", this.f8200b);
                bundle.putLong("currts", this.f8199a);
                bundle.putString("seq_num", str);
                bundle.putInt("preqs", this.f8201c);
                bundle.putInt("preqs_in_session", this.f8202d);
                bundle.putLong("time_in_session", this.f8203e);
                bundle.putInt("pclick", this.i);
                bundle.putInt("pimp", this.f8206j);
                int i = AbstractC1697vc.f16009a;
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                int identifier = context.getResources().getIdentifier("Theme.Translucent", "style", "android");
                boolean z3 = false;
                if (identifier == 0) {
                    U2.j.h("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                } else {
                    try {
                        if (identifier == context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                            z3 = true;
                        } else {
                            U2.j.h("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        U2.j.i("Fail to fetch AdActivity theme");
                        U2.j.h("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                }
                bundle.putBoolean("support_transparent_background", z3);
                bundle.putInt("consent_form_action_identifier", a());
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }

    public final void c() {
        synchronized (this.f) {
            this.i++;
        }
    }

    public final void d() {
        synchronized (this.f) {
            this.f8206j++;
        }
    }

    public final void e(Q2.X0 x02, long j5) {
        Bundle bundle;
        synchronized (this.f) {
            try {
                long r5 = this.f8205h.r();
                P2.o.f4767B.f4776j.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (this.f8200b == -1) {
                    if (currentTimeMillis - r5 > ((Long) Q2.r.f5053d.f5056c.a(F7.f8767U0)).longValue()) {
                        this.f8202d = -1;
                    } else {
                        this.f8202d = this.f8205h.q();
                    }
                    this.f8200b = j5;
                    this.f8199a = j5;
                } else {
                    this.f8199a = j5;
                }
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.z3)).booleanValue() || (bundle = x02.f4959m) == null || bundle.getInt("gw", 2) != 1) {
                    this.f8201c++;
                    int i = this.f8202d + 1;
                    this.f8202d = i;
                    if (i == 0) {
                        this.f8203e = 0L;
                        this.f8205h.E(currentTimeMillis);
                    } else {
                        this.f8203e = currentTimeMillis - this.f8205h.s();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        synchronized (this.f) {
            this.f8207k++;
        }
    }

    public final void g() {
        if (((Boolean) AbstractC1371o8.f14773a.s()).booleanValue()) {
            synchronized (this.f) {
                this.f8201c--;
                this.f8202d--;
            }
        }
    }
}
