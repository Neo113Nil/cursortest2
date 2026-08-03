package com.ironsource;

/* loaded from: classes5.dex */
public class M5 {
    public static final int e = -1;

    /* renamed from: a, reason: collision with root package name */
    private java.lang.Runnable f5821a = new com.ironsource.M5.a();
    private int b;
    private com.ironsource.InterfaceC3193o c;
    private com.ironsource.C3348wb d;

    class a implements java.lang.Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("loaded ads are expired");
            com.ironsource.InterfaceC3193o interfaceC3193o = com.ironsource.M5.this.c;
            if (interfaceC3193o != null) {
                interfaceC3193o.a();
            }
        }
    }

    public M5(int i, com.ironsource.InterfaceC3193o interfaceC3193o) {
        this.c = interfaceC3193o;
        this.b = i;
    }

    public void a(long j) {
        if (b()) {
            long millis = java.util.concurrent.TimeUnit.MINUTES.toMillis(this.b) - java.lang.Math.max(j, 0L);
            if (millis <= 0) {
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("no delay - onAdExpired called");
                this.c.a();
                return;
            }
            a();
            this.d = new com.ironsource.C3348wb(millis, this.f5821a, true);
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.add(14, (int) millis);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("loaded ads will expire on: " + calendar.getTime() + " in " + java.lang.String.format(java.util.Locale.getDefault(), "%.2f", java.lang.Double.valueOf((millis / 1000.0d) / 60.0d)) + " minutes");
        }
    }

    public boolean b() {
        return this.b > 0;
    }

    public void a() {
        if (!b() || this.d == null) {
            return;
        }
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("canceling expiration timer");
        this.d.e();
        this.d = null;
    }
}
