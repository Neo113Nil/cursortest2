package com.fyber.inneractive.sdk.util;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name */
    public final TimeUnit f5976a;
    public final long b;
    public final u1 c;
    public v1 e;
    public boolean d = false;
    public long f = 0;

    public w1(TimeUnit timeUnit, long j) {
        this.b = j;
        this.f5976a = timeUnit;
        IAlog.a("Visible time counter init - time %d", Long.valueOf(j));
        this.c = new u1(this);
    }

    public final void a(long j) {
        long uptimeMillis = (SystemClock.uptimeMillis() - j) + 50 + this.f;
        this.f = uptimeMillis;
        if (this.e != null && uptimeMillis > this.f5976a.toMillis(this.b)) {
            this.e.a();
            return;
        }
        u1 u1Var = this.c;
        if (u1Var == null || this.e == null) {
            return;
        }
        u1Var.removeMessages(1932593528);
        this.c.sendEmptyMessageDelayed(1932593528, 50L);
    }
}
