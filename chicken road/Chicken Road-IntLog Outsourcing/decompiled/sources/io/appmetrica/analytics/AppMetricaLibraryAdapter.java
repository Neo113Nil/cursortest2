package io.appmetrica.analytics;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.impl.C0500a0;
import io.appmetrica.analytics.impl.C0526b0;
import io.appmetrica.analytics.impl.C0736j4;
import io.appmetrica.analytics.impl.D0;
import io.appmetrica.analytics.impl.Ib;
import io.appmetrica.analytics.impl.Jb;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

/* loaded from: classes.dex */
public class AppMetricaLibraryAdapter {

    /* renamed from: a, reason: collision with root package name */
    private static D0 f5877a = new D0();

    public static void activate(Context context) {
        D0 d02 = f5877a;
        if (!d02.f6657a.f6942a.a(context).f9268a) {
            ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Activation failed due to context is null", new Object[0]);
            return;
        }
        Jb jb = d02.f6658b;
        Context applicationContext = context.getApplicationContext();
        jb.getClass();
        C0736j4.l().f8488g.a(applicationContext);
        C0736j4.l().b().a(applicationContext, AppMetricaLibraryAdapterConfig.newConfigBuilder().build());
    }

    public static void reportEvent(String str, String str2, String str3) {
        f5877a.a(str, str2, str3);
    }

    public static void setAdvIdentifiersTracking(boolean z) {
        D0 d02 = f5877a;
        if (d02.f6657a.f6944c.a((Void) null).f9268a) {
            d02.f6658b.getClass();
            ModulesFacade.setAdvIdentifiersTracking(z);
        }
    }

    public static void setProxy(D0 d02) {
        f5877a = d02;
    }

    public static void subscribeForAutoCollectedData(Context context, String str) {
        D0 d02 = f5877a;
        d02.getClass();
        ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Subscribe for auto-collected data with api key: " + ApiKeyUtils.createPartialApiKey(str), new Object[0]);
        Ib ib = d02.f6657a;
        if (ib.f6948g.a(str).f9268a && ib.f6942a.a(context).f9268a) {
            d02.f6658b.getClass();
            C0736j4.l().f8488g.a(context);
            C0526b0 b6 = C0736j4.l().b();
            b6.f7904c.a().executeDelayed(new C0500a0(b6, context), b6.f7905d);
            ModulesFacade.subscribeForAutoCollectedData(context, str);
        }
    }

    public static void activate(Context context, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        D0 d02 = f5877a;
        Ib ib = d02.f6657a;
        if (ib.f6942a.a(context).f9268a && ib.f6943b.a(appMetricaLibraryAdapterConfig).f9268a) {
            Jb jb = d02.f6658b;
            Context applicationContext = context.getApplicationContext();
            jb.getClass();
            C0736j4.l().f8488g.a(applicationContext);
            C0736j4.l().b().a(applicationContext, appMetricaLibraryAdapterConfig);
            return;
        }
        ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Activation failed due to context is null or invalid config", new Object[0]);
    }
}
