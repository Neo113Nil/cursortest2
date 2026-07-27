package io.appmetrica.analytics;

import android.content.Context;
import io.appmetrica.analytics.impl.AbstractC0983si;
import io.appmetrica.analytics.impl.C0823md;
import io.appmetrica.analytics.impl.C0875od;
import io.appmetrica.analytics.impl.C0901pd;
import io.appmetrica.analytics.impl.C0927qd;
import io.appmetrica.analytics.impl.C0952rd;
import io.appmetrica.analytics.impl.C0978sd;
import io.appmetrica.analytics.impl.C1004td;
import io.appmetrica.analytics.impl.C1030ud;
import io.appmetrica.analytics.impl.C1095x0;

/* loaded from: classes.dex */
public final class ModulesFacade {
    public static final int EXTERNAL_ATTRIBUTION_ADJUST = 2;
    public static final int EXTERNAL_ATTRIBUTION_AIRBRIDGE = 5;
    public static final int EXTERNAL_ATTRIBUTION_APPSFLYER = 1;
    public static final int EXTERNAL_ATTRIBUTION_KOCHAVA = 3;
    public static final int EXTERNAL_ATTRIBUTION_SINGULAR = 6;
    public static final int EXTERNAL_ATTRIBUTION_TENJIN = 4;

    /* renamed from: a, reason: collision with root package name */
    private static C1030ud f5900a = new C1030ud();

    public static IModuleReporter getModuleReporter(Context context, String str) {
        C1030ud c1030ud = f5900a;
        C0823md c0823md = c1030ud.f9400b;
        c0823md.f8787b.a(context);
        c0823md.f8789d.a(str);
        c1030ud.f9401c.f6597a.a(context.getApplicationContext().getApplicationContext());
        return AbstractC0983si.f9260a.a(context.getApplicationContext(), str);
    }

    public static boolean isActivatedForApp() {
        C1030ud c1030ud = f5900a;
        c1030ud.f9400b.getClass();
        c1030ud.f9401c.getClass();
        c1030ud.f9399a.getClass();
        return C1095x0.a();
    }

    public static void reportAdRevenue(AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, Boolean.TRUE);
    }

    public static void reportEvent(ModuleEvent moduleEvent) {
        C1030ud c1030ud = f5900a;
        c1030ud.f9400b.f8786a.a(null);
        c1030ud.f9401c.getClass();
        c1030ud.f9402d.execute(new C0901pd(c1030ud, moduleEvent));
    }

    public static void reportExternalAttribution(int i2, String str) {
        C1030ud c1030ud = f5900a;
        c1030ud.f9400b.getClass();
        c1030ud.f9401c.getClass();
        c1030ud.f9402d.execute(new C0927qd(c1030ud, i2, str));
    }

    public static void sendEventsBuffer() {
        C1030ud c1030ud = f5900a;
        c1030ud.f9400b.getClass();
        c1030ud.f9401c.getClass();
        AppMetrica.sendEventsBuffer();
    }

    public static void setAdvIdentifiersTracking(boolean z) {
        C1030ud c1030ud = f5900a;
        c1030ud.f9400b.getClass();
        c1030ud.f9401c.getClass();
        c1030ud.f9402d.execute(new C0952rd(c1030ud, z));
    }

    public static void setProxy(C1030ud c1030ud) {
        f5900a = c1030ud;
    }

    public static void setSessionExtra(String str, byte[] bArr) {
        C1030ud c1030ud = f5900a;
        c1030ud.f9400b.f8788c.a(str);
        c1030ud.f9401c.getClass();
        c1030ud.f9402d.execute(new C0978sd(c1030ud, str, bArr));
    }

    public static void subscribeForAutoCollectedData(Context context, String str) {
        C1030ud c1030ud = f5900a;
        C0823md c0823md = c1030ud.f9400b;
        c0823md.f8787b.a(context);
        c0823md.f8789d.a(str);
        c1030ud.f9401c.f6597a.a(context.getApplicationContext());
        c1030ud.f9402d.execute(new C1004td(str));
    }

    public static void reportAdRevenue(AdRevenue adRevenue, Boolean bool) {
        C1030ud c1030ud = f5900a;
        boolean booleanValue = bool.booleanValue();
        c1030ud.f9400b.getClass();
        c1030ud.f9401c.getClass();
        c1030ud.f9402d.execute(new C0875od(c1030ud, adRevenue, booleanValue));
    }
}
