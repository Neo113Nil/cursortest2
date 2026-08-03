package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f4312a = new java.util.concurrent.atomic.AtomicBoolean(true);
    public volatile java.lang.String b = null;
    public android.content.Context c = null;
    public final java.util.concurrent.atomic.AtomicBoolean d = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final com.fyber.inneractive.sdk.util.p1 e = new com.fyber.inneractive.sdk.util.p1(this);

    public final java.lang.String a() {
        if (!android.text.TextUtils.isEmpty(this.b)) {
            return this.b;
        }
        if (this.e != null && this.f4312a.get()) {
            android.os.Handler handler = com.fyber.inneractive.sdk.util.r.b;
            handler.removeCallbacks(this.e);
            handler.postDelayed(this.e, 50L);
        }
        return java.lang.System.getProperty("http.agent");
    }

    public final void b() {
        if (this.c == null || !android.text.TextUtils.isEmpty(this.b)) {
            return;
        }
        this.b = this.c.getSharedPreferences("fyber.ua", 0).getString(com.ironsource.M6.d0, null);
        if (!android.text.TextUtils.isEmpty(this.b)) {
            com.fyber.inneractive.sdk.util.IAlog.a("UserAgentProvider | populated user agent from shared prefs", new java.lang.Object[0]);
            this.d.compareAndSet(false, true);
        }
        com.fyber.inneractive.sdk.util.r.f4308a.execute(new com.fyber.inneractive.sdk.util.r1(this));
    }

    public final void c() {
        java.lang.String str;
        android.content.Context context = this.c;
        if (context != null) {
            try {
                str = android.webkit.WebSettings.getDefaultUserAgent(context);
            } catch (java.lang.Throwable unused) {
                this.f4312a.set(false);
                str = null;
            }
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            this.b = str;
            if (!android.text.TextUtils.isEmpty(this.b)) {
                com.fyber.inneractive.sdk.util.IAlog.a("UserAgentProvider | populated user agent form updateUserAgentIfPossible", new java.lang.Object[0]);
                this.d.compareAndSet(false, true);
            }
            com.fyber.inneractive.sdk.util.r.f4308a.execute(new com.fyber.inneractive.sdk.util.q1(this, str));
        }
    }
}
