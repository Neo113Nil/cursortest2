package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class L5 {
    public static final int e = -1;

    /* renamed from: a, reason: collision with root package name */
    private Runnable f7730a = new a();
    private int b;
    private InterfaceC4558o c;
    private C4695vb d;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("loaded ads are expired");
            InterfaceC4558o interfaceC4558o = L5.this.c;
            if (interfaceC4558o != null) {
                interfaceC4558o.a();
            }
        }
    }

    public L5(int i, InterfaceC4558o interfaceC4558o) {
        this.c = interfaceC4558o;
        this.b = i;
    }

    public void a(long j) {
        if (b()) {
            long millis = TimeUnit.MINUTES.toMillis(this.b) - Math.max(j, 0L);
            if (millis <= 0) {
                IronLog.INTERNAL.verbose("no delay - onAdExpired called");
                this.c.a();
                return;
            }
            a();
            this.d = new C4695vb(millis, this.f7730a, true);
            Calendar calendar = Calendar.getInstance();
            calendar.add(14, (int) millis);
            IronLog.INTERNAL.verbose("loaded ads will expire on: " + calendar.getTime() + " in " + String.format(Locale.getDefault(), "%.2f", Double.valueOf((millis / 1000.0d) / 60.0d)) + " minutes");
        }
    }

    public boolean b() {
        return this.b > 0;
    }

    public void a() {
        if (!b() || this.d == null) {
            return;
        }
        IronLog.INTERNAL.verbose("canceling expiration timer");
        this.d.e();
        this.d = null;
    }
}
