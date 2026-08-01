package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.w1;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class l0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f5361a;
    public final /* synthetic */ p0 b;

    public l0(p0 p0Var, long j) {
        this.b = p0Var;
        this.f5361a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.I()) {
            p0 p0Var = this.b;
            p0Var.n = new k0(this);
            long a2 = p0Var.a(this.f5361a);
            p0 p0Var2 = this.b;
            p0Var2.getClass();
            w1 w1Var = new w1(TimeUnit.MILLISECONDS, a2);
            p0Var2.o = w1Var;
            w1Var.e = new o0(p0Var2);
            w1Var.d = false;
            w1Var.c.sendEmptyMessage(1932593528);
            p0 p0Var3 = this.b;
            p0Var3.getClass();
            IAlog.a("%sad contains custom close. Will show transparent x in %d", IAlog.a(p0Var3), Long.valueOf(a2));
            this.b.l = null;
        } else {
            p0 p0Var4 = this.b;
            p0Var4.getClass();
            IAlog.a("%sad does not contain custom close. Showing close button", IAlog.a(p0Var4));
            this.b.e(false);
        }
        Runnable runnable = this.b.l;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.r.b.removeCallbacks(runnable);
            this.b.l = null;
        }
    }
}
