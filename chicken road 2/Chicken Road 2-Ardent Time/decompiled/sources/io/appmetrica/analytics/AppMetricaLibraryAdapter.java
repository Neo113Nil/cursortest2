package io.appmetrica.analytics;

/* loaded from: classes.dex */
public class AppMetricaLibraryAdapter {

    /* renamed from: a, reason: collision with root package name */
    private static io.appmetrica.analytics.impl.F0 f3369a = new io.appmetrica.analytics.impl.F0();

    public static void activate(android.content.Context context) {
        io.appmetrica.analytics.impl.F0 f0 = f3369a;
        if (!f0.f4278a.f4106a.a(context).f6701a) {
            io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Activation failed due to context is null", new java.lang.Object[0]);
            return;
        }
        io.appmetrica.analytics.impl.Cb cb = f0.f4279b;
        android.content.Context applicationContext = context.getApplicationContext();
        cb.getClass();
        io.appmetrica.analytics.impl.C0244b4.l().f5497g.a(applicationContext);
        io.appmetrica.analytics.impl.C0244b4.l().b().a(applicationContext, io.appmetrica.analytics.AppMetricaLibraryAdapterConfig.newConfigBuilder().build());
    }

    public static void reportEvent(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        f3369a.a(str, str2, str3);
    }

    public static void setAdvIdentifiersTracking(boolean z2) {
        io.appmetrica.analytics.impl.F0 f0 = f3369a;
        if (f0.f4278a.f4108c.a((java.lang.Void) null).f6701a) {
            f0.f4279b.getClass();
            io.appmetrica.analytics.ModulesFacade.setAdvIdentifiersTracking(z2);
        }
    }

    public static void setProxy(io.appmetrica.analytics.impl.F0 f0) {
        f3369a = f0;
    }

    public static void subscribeForAutoCollectedData(android.content.Context context, java.lang.String str) {
        io.appmetrica.analytics.impl.F0 f0 = f3369a;
        f0.getClass();
        io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Subscribe for auto-collected data with api key: " + io.appmetrica.analytics.coreutils.internal.ApiKeyUtils.createPartialApiKey(str), new java.lang.Object[0]);
        io.appmetrica.analytics.impl.Bb bb = f0.f4278a;
        if (bb.f4112g.a(str).f6701a && bb.f4106a.a(context).f6701a) {
            f0.f4279b.getClass();
            io.appmetrica.analytics.impl.C0244b4.l().f5497g.a(context);
            io.appmetrica.analytics.impl.C0240b0 b2 = io.appmetrica.analytics.impl.C0244b4.l().b();
            b2.f5485c.a().executeDelayed(new io.appmetrica.analytics.impl.C0214a0(b2, context), b2.f5486d);
            io.appmetrica.analytics.ModulesFacade.subscribeForAutoCollectedData(context, str);
        }
    }

    public static void activate(android.content.Context context, io.appmetrica.analytics.AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        io.appmetrica.analytics.impl.F0 f0 = f3369a;
        io.appmetrica.analytics.impl.Bb bb = f0.f4278a;
        if (bb.f4106a.a(context).f6701a && bb.f4107b.a(appMetricaLibraryAdapterConfig).f6701a) {
            io.appmetrica.analytics.impl.Cb cb = f0.f4279b;
            android.content.Context applicationContext = context.getApplicationContext();
            cb.getClass();
            io.appmetrica.analytics.impl.C0244b4.l().f5497g.a(applicationContext);
            io.appmetrica.analytics.impl.C0244b4.l().b().a(applicationContext, appMetricaLibraryAdapterConfig);
            return;
        }
        io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Activation failed due to context is null or invalid config", new java.lang.Object[0]);
    }
}
