package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Oe implements io.appmetrica.analytics.plugins.IPluginReporter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Re f4771a = new io.appmetrica.analytics.impl.Re();

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Se f4772b = new io.appmetrica.analytics.impl.Se();

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor f4773c = io.appmetrica.analytics.impl.C0244b4.l().g().a();

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.backport.Provider f4774d;

    public Oe(io.appmetrica.analytics.coreapi.internal.backport.Provider<io.appmetrica.analytics.impl.Ra> provider) {
        this.f4774d = provider;
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(io.appmetrica.analytics.plugins.PluginErrorDetails pluginErrorDetails, java.lang.String str) {
        io.appmetrica.analytics.impl.Re re = this.f4771a;
        re.f4904a.a(pluginErrorDetails);
        if (re.f4906c.a((java.util.Collection<java.lang.Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).f6701a) {
            this.f4772b.getClass();
            this.f4773c.execute(new io.appmetrica.analytics.impl.Me(this, pluginErrorDetails, str));
        }
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(io.appmetrica.analytics.plugins.PluginErrorDetails pluginErrorDetails) {
        this.f4771a.f4904a.a(pluginErrorDetails);
        this.f4772b.getClass();
        this.f4773c.execute(new io.appmetrica.analytics.impl.Le(this, pluginErrorDetails));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(java.lang.String str, java.lang.String str2, io.appmetrica.analytics.plugins.PluginErrorDetails pluginErrorDetails) {
        this.f4771a.f4905b.a(str);
        this.f4772b.getClass();
        this.f4773c.execute(new io.appmetrica.analytics.impl.Ne(this, str, str2, pluginErrorDetails));
    }
}
