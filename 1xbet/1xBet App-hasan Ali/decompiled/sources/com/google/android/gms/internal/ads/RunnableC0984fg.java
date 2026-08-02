package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.fg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0984fg implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13479k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1074hg f13480l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Throwable f13481m;

    public /* synthetic */ RunnableC0984fg(C1074hg c1074hg, Throwable th, int i) {
        this.f13479k = i;
        this.f13480l = c1074hg;
        this.f13481m = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13479k) {
            case 0:
                C1074hg c1074hg = this.f13480l;
                c1074hg.getClass();
                boolean booleanValue = ((Boolean) Q2.r.f5053d.f5056c.a(F7.S9)).booleanValue();
                Context context = c1074hg.f13770a;
                Throwable th = this.f13481m;
                if (!booleanValue) {
                    InterfaceC0846cc a5 = C0802bc.a(context);
                    c1074hg.f13776h = a5;
                    a5.b("AttributionReportingSampled", th);
                    break;
                } else {
                    InterfaceC0846cc e3 = C0802bc.e(context);
                    c1074hg.i = e3;
                    e3.b("AttributionReporting", th);
                    break;
                }
            default:
                C1074hg c1074hg2 = this.f13480l;
                c1074hg2.getClass();
                boolean booleanValue2 = ((Boolean) Q2.r.f5053d.f5056c.a(F7.S9)).booleanValue();
                Context context2 = c1074hg2.f13770a;
                Throwable th2 = this.f13481m;
                if (!booleanValue2) {
                    InterfaceC0846cc a6 = C0802bc.a(context2);
                    c1074hg2.f13776h = a6;
                    a6.b("AttributionReportingSampled.getUpdatedUrlAndRegisterSource", th2);
                    break;
                } else {
                    InterfaceC0846cc e5 = C0802bc.e(context2);
                    c1074hg2.i = e5;
                    e5.b("AttributionReporting.getUpdatedUrlAndRegisterSource", th2);
                    break;
                }
        }
    }
}
