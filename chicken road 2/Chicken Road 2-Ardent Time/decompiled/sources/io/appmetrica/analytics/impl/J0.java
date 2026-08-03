package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class J0 implements io.appmetrica.analytics.plugins.AppMetricaPlugins {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.L0 f4473a;

    public J0(io.appmetrica.analytics.impl.L0 l02) {
        this.f4473a = l02;
    }

    @Override // io.appmetrica.analytics.plugins.AppMetricaPlugins
    public final void reportError(io.appmetrica.analytics.plugins.PluginErrorDetails pluginErrorDetails, java.lang.String str) {
        this.f4473a.a(pluginErrorDetails, str);
    }

    @Override // io.appmetrica.analytics.plugins.AppMetricaPlugins
    public final void reportUnhandledException(io.appmetrica.analytics.plugins.PluginErrorDetails pluginErrorDetails) {
        this.f4473a.a(pluginErrorDetails);
    }

    public J0() {
        this(new io.appmetrica.analytics.impl.L0());
    }

    @Override // io.appmetrica.analytics.plugins.AppMetricaPlugins
    public final void reportError(java.lang.String str, java.lang.String str2, io.appmetrica.analytics.plugins.PluginErrorDetails pluginErrorDetails) {
        this.f4473a.a(str, str2, pluginErrorDetails);
    }
}
