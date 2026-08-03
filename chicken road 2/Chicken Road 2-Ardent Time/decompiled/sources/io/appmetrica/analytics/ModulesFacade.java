package io.appmetrica.analytics;

/* loaded from: classes.dex */
public final class ModulesFacade {
    public static final int EXTERNAL_ATTRIBUTION_ADJUST = 2;
    public static final int EXTERNAL_ATTRIBUTION_AIRBRIDGE = 5;
    public static final int EXTERNAL_ATTRIBUTION_APPSFLYER = 1;
    public static final int EXTERNAL_ATTRIBUTION_KOCHAVA = 3;
    public static final int EXTERNAL_ATTRIBUTION_SINGULAR = 6;
    public static final int EXTERNAL_ATTRIBUTION_TENJIN = 4;

    /* renamed from: a, reason: collision with root package name */
    private static io.appmetrica.analytics.impl.C0563nd f3392a = new io.appmetrica.analytics.impl.C0563nd();

    public static io.appmetrica.analytics.IModuleReporter getModuleReporter(android.content.Context context, java.lang.String str) {
        io.appmetrica.analytics.impl.C0563nd c0563nd = f3392a;
        io.appmetrica.analytics.impl.C0356fd c0356fd = c0563nd.f6518b;
        c0356fd.f5887b.a(context);
        c0356fd.f5889d.a(str);
        c0563nd.f6519c.f6905a.a(context.getApplicationContext().getApplicationContext());
        return io.appmetrica.analytics.impl.AbstractC0568ni.f6537a.a(context.getApplicationContext(), str);
    }

    public static boolean isActivatedForApp() {
        io.appmetrica.analytics.impl.C0563nd c0563nd = f3392a;
        c0563nd.f6518b.getClass();
        c0563nd.f6519c.getClass();
        c0563nd.f6517a.getClass();
        return io.appmetrica.analytics.impl.C0861z0.a();
    }

    public static void reportAdRevenue(io.appmetrica.analytics.AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, java.lang.Boolean.TRUE);
    }

    public static void reportEvent(io.appmetrica.analytics.ModuleEvent moduleEvent) {
        io.appmetrica.analytics.impl.C0563nd c0563nd = f3392a;
        c0563nd.f6518b.f5886a.a(null);
        c0563nd.f6519c.getClass();
        c0563nd.f6520d.execute(new io.appmetrica.analytics.impl.C0434id(c0563nd, moduleEvent));
    }

    public static void reportExternalAttribution(int i2, java.lang.String str) {
        io.appmetrica.analytics.impl.C0563nd c0563nd = f3392a;
        c0563nd.f6518b.getClass();
        c0563nd.f6519c.getClass();
        c0563nd.f6520d.execute(new io.appmetrica.analytics.impl.C0459jd(c0563nd, i2, str));
    }

    public static void sendEventsBuffer() {
        io.appmetrica.analytics.impl.C0563nd c0563nd = f3392a;
        c0563nd.f6518b.getClass();
        c0563nd.f6519c.getClass();
        io.appmetrica.analytics.AppMetrica.sendEventsBuffer();
    }

    public static void setAdvIdentifiersTracking(boolean z2) {
        io.appmetrica.analytics.impl.C0563nd c0563nd = f3392a;
        c0563nd.f6518b.getClass();
        c0563nd.f6519c.getClass();
        c0563nd.f6520d.execute(new io.appmetrica.analytics.impl.C0485kd(c0563nd, z2));
    }

    public static void setProxy(io.appmetrica.analytics.impl.C0563nd c0563nd) {
        f3392a = c0563nd;
    }

    public static void setSessionExtra(java.lang.String str, byte[] bArr) {
        io.appmetrica.analytics.impl.C0563nd c0563nd = f3392a;
        c0563nd.f6518b.f5888c.a(str);
        c0563nd.f6519c.getClass();
        c0563nd.f6520d.execute(new io.appmetrica.analytics.impl.C0511ld(c0563nd, str, bArr));
    }

    public static void subscribeForAutoCollectedData(android.content.Context context, java.lang.String str) {
        io.appmetrica.analytics.impl.C0563nd c0563nd = f3392a;
        io.appmetrica.analytics.impl.C0356fd c0356fd = c0563nd.f6518b;
        c0356fd.f5887b.a(context);
        c0356fd.f5889d.a(str);
        c0563nd.f6519c.f6905a.a(context.getApplicationContext());
        c0563nd.f6520d.execute(new io.appmetrica.analytics.impl.C0537md(str));
    }

    public static void reportAdRevenue(io.appmetrica.analytics.AdRevenue adRevenue, java.lang.Boolean bool) {
        io.appmetrica.analytics.impl.C0563nd c0563nd = f3392a;
        boolean booleanValue = bool.booleanValue();
        c0563nd.f6518b.getClass();
        c0563nd.f6519c.getClass();
        c0563nd.f6520d.execute(new io.appmetrica.analytics.impl.C0408hd(c0563nd, adRevenue, booleanValue));
    }
}
