package io.appmetrica.analytics;

import android.content.Context;
import io.appmetrica.analytics.impl.AbstractC0834si;
import io.appmetrica.analytics.impl.C0674md;
import io.appmetrica.analytics.impl.C0726od;
import io.appmetrica.analytics.impl.C0752pd;
import io.appmetrica.analytics.impl.C0778qd;
import io.appmetrica.analytics.impl.C0803rd;
import io.appmetrica.analytics.impl.C0829sd;
import io.appmetrica.analytics.impl.C0855td;
import io.appmetrica.analytics.impl.C0881ud;
import io.appmetrica.analytics.impl.C0946x0;

/* loaded from: classes.dex */
public final class ModulesFacade {
    public static final int EXTERNAL_ATTRIBUTION_ADJUST = 2;
    public static final int EXTERNAL_ATTRIBUTION_AIRBRIDGE = 5;
    public static final int EXTERNAL_ATTRIBUTION_APPSFLYER = 1;
    public static final int EXTERNAL_ATTRIBUTION_KOCHAVA = 3;
    public static final int EXTERNAL_ATTRIBUTION_SINGULAR = 6;
    public static final int EXTERNAL_ATTRIBUTION_TENJIN = 4;

    /* renamed from: a, reason: collision with root package name */
    private static C0881ud f5097a = new C0881ud();

    public static IModuleReporter getModuleReporter(Context context, String str) {
        C0881ud c0881ud = f5097a;
        C0674md c0674md = c0881ud.f8447b;
        c0674md.f7860b.a(context);
        c0674md.f7862d.a(str);
        c0881ud.f8448c.f5765a.a(context.getApplicationContext().getApplicationContext());
        return AbstractC0834si.f8312a.a(context.getApplicationContext(), str);
    }

    public static boolean isActivatedForApp() {
        C0881ud c0881ud = f5097a;
        c0881ud.f8447b.getClass();
        c0881ud.f8448c.getClass();
        c0881ud.f8446a.getClass();
        return C0946x0.a();
    }

    public static void reportAdRevenue(AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, Boolean.TRUE);
    }

    public static void reportEvent(ModuleEvent moduleEvent) {
        C0881ud c0881ud = f5097a;
        c0881ud.f8447b.f7859a.a(null);
        c0881ud.f8448c.getClass();
        c0881ud.f8449d.execute(new C0752pd(c0881ud, moduleEvent));
    }

    public static void reportExternalAttribution(int i3, String str) {
        C0881ud c0881ud = f5097a;
        c0881ud.f8447b.getClass();
        c0881ud.f8448c.getClass();
        c0881ud.f8449d.execute(new C0778qd(c0881ud, i3, str));
    }

    public static void sendEventsBuffer() {
        C0881ud c0881ud = f5097a;
        c0881ud.f8447b.getClass();
        c0881ud.f8448c.getClass();
        AppMetrica.sendEventsBuffer();
    }

    public static void setAdvIdentifiersTracking(boolean z3) {
        C0881ud c0881ud = f5097a;
        c0881ud.f8447b.getClass();
        c0881ud.f8448c.getClass();
        c0881ud.f8449d.execute(new C0803rd(c0881ud, z3));
    }

    public static void setProxy(C0881ud c0881ud) {
        f5097a = c0881ud;
    }

    public static void setSessionExtra(String str, byte[] bArr) {
        C0881ud c0881ud = f5097a;
        c0881ud.f8447b.f7861c.a(str);
        c0881ud.f8448c.getClass();
        c0881ud.f8449d.execute(new C0829sd(c0881ud, str, bArr));
    }

    public static void subscribeForAutoCollectedData(Context context, String str) {
        C0881ud c0881ud = f5097a;
        C0674md c0674md = c0881ud.f8447b;
        c0674md.f7860b.a(context);
        c0674md.f7862d.a(str);
        c0881ud.f8448c.f5765a.a(context.getApplicationContext());
        c0881ud.f8449d.execute(new C0855td(str));
    }

    public static void reportAdRevenue(AdRevenue adRevenue, Boolean bool) {
        C0881ud c0881ud = f5097a;
        boolean booleanValue = bool.booleanValue();
        c0881ud.f8447b.getClass();
        c0881ud.f8448c.getClass();
        c0881ud.f8449d.execute(new C0726od(c0881ud, adRevenue, booleanValue));
    }
}
