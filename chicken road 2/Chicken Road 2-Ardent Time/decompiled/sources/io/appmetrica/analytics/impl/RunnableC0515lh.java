package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.lh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0515lh implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f6368a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.P5 f6369b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Bundle f6370c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0218a4 f6371d;

    public RunnableC0515lh(android.content.Context context, io.appmetrica.analytics.impl.P5 p5, android.os.Bundle bundle, io.appmetrica.analytics.impl.C0218a4 c0218a4) {
        this.f6368a = context;
        this.f6369b = p5;
        this.f6370c = bundle;
        this.f6371d = c0218a4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            io.appmetrica.analytics.impl.H3 a2 = io.appmetrica.analytics.impl.H3.a(this.f6368a, this.f6370c);
            if (a2 == null) {
                return;
            }
            io.appmetrica.analytics.impl.P3 a3 = io.appmetrica.analytics.impl.P3.a(a2);
            io.appmetrica.analytics.impl.C0336ej v2 = io.appmetrica.analytics.impl.C0560na.f6484I.v();
            v2.a(a2.f4368b.getAppVersion(), a2.f4368b.getAppBuildNumber());
            v2.a(a2.f4368b.getDeviceType());
            io.appmetrica.analytics.impl.C0606p4 c0606p4 = new io.appmetrica.analytics.impl.C0606p4(new io.appmetrica.analytics.impl.Zl(a2), new io.appmetrica.analytics.impl.C0580o4(a2.f4368b, io.appmetrica.analytics.impl.AbstractC0380gb.c(a2.f4367a.f4123a.getAsString("PROCESS_CFG_CLIDS"))), a2.f4367a.f4124b);
            this.f6371d.a(a3, c0606p4).a(this.f6369b, c0606p4);
        } catch (java.lang.Throwable th) {
            io.appmetrica.analytics.impl.Qj qj = io.appmetrica.analytics.impl.AbstractC0595oj.f6598a;
            java.lang.String str = "Exception during processing event with type: " + this.f6369b.f4816d + " (" + this.f6369b.f4817e + "): " + th.getMessage();
            qj.getClass();
            qj.a(new io.appmetrica.analytics.impl.C0621pj(str, th));
        }
    }
}
