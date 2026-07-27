package io.appmetrica.analytics;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.impl.C0351a0;
import io.appmetrica.analytics.impl.C0377b0;
import io.appmetrica.analytics.impl.C0587j4;
import io.appmetrica.analytics.impl.D0;
import io.appmetrica.analytics.impl.Ib;
import io.appmetrica.analytics.impl.Jb;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

/* loaded from: classes.dex */
public class AppMetricaLibraryAdapter {

    /* renamed from: a, reason: collision with root package name */
    private static D0 f5076a = new D0();

    public static void activate(Context context) {
        D0 d02 = f5076a;
        if (!d02.f5821a.f6093a.a(context).f8320a) {
            ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Activation failed due to context is null", new Object[0]);
            return;
        }
        Jb jb = d02.f5822b;
        Context applicationContext = context.getApplicationContext();
        jb.getClass();
        C0587j4.l().f7575g.a(applicationContext);
        C0587j4.l().b().a(applicationContext, AppMetricaLibraryAdapterConfig.newConfigBuilder().build());
    }

    public static void reportEvent(String str, String str2, String str3) {
        f5076a.a(str, str2, str3);
    }

    public static void setAdvIdentifiersTracking(boolean z3) {
        D0 d02 = f5076a;
        if (d02.f5821a.f6095c.a((Void) null).f8320a) {
            d02.f5822b.getClass();
            ModulesFacade.setAdvIdentifiersTracking(z3);
        }
    }

    public static void setProxy(D0 d02) {
        f5076a = d02;
    }

    public static void subscribeForAutoCollectedData(Context context, String str) {
        D0 d02 = f5076a;
        d02.getClass();
        ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Subscribe for auto-collected data with api key: " + ApiKeyUtils.createPartialApiKey(str), new Object[0]);
        Ib ib = d02.f5821a;
        if (ib.f6098g.a(str).f8320a && ib.f6093a.a(context).f8320a) {
            d02.f5822b.getClass();
            C0587j4.l().f7575g.a(context);
            C0377b0 b3 = C0587j4.l().b();
            b3.f7020c.a().executeDelayed(new C0351a0(b3, context), b3.f7021d);
            ModulesFacade.subscribeForAutoCollectedData(context, str);
        }
    }

    public static void activate(Context context, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        D0 d02 = f5076a;
        Ib ib = d02.f5821a;
        if (ib.f6093a.a(context).f8320a && ib.f6094b.a(appMetricaLibraryAdapterConfig).f8320a) {
            Jb jb = d02.f5822b;
            Context applicationContext = context.getApplicationContext();
            jb.getClass();
            C0587j4.l().f7575g.a(applicationContext);
            C0587j4.l().b().a(applicationContext, appMetricaLibraryAdapterConfig);
            return;
        }
        ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Activation failed due to context is null or invalid config", new Object[0]);
    }
}
