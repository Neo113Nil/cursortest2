package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.TimeUnit f4317a;
    public final long b;
    public final com.fyber.inneractive.sdk.util.t1 c;
    public com.fyber.inneractive.sdk.util.u1 e;
    public boolean d = false;
    public long f = 0;

    public v1(java.util.concurrent.TimeUnit timeUnit, long j) {
        this.b = j;
        this.f4317a = timeUnit;
        com.fyber.inneractive.sdk.util.IAlog.a("Visible time counter init - time %d", java.lang.Long.valueOf(j));
        this.c = new com.fyber.inneractive.sdk.util.t1(this);
    }

    public final void a(long j) {
        long uptimeMillis = (android.os.SystemClock.uptimeMillis() - j) + 50 + this.f;
        this.f = uptimeMillis;
        if (this.e != null && uptimeMillis > this.f4317a.toMillis(this.b)) {
            this.e.a();
            return;
        }
        com.fyber.inneractive.sdk.util.t1 t1Var = this.c;
        if (t1Var == null || this.e == null) {
            return;
        }
        t1Var.removeMessages(1932593528);
        this.c.sendEmptyMessageDelayed(1932593528, 50L);
    }
}
