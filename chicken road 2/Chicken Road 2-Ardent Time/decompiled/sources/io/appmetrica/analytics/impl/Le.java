package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Le implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.plugins.PluginErrorDetails f4613a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.Oe f4614b;

    public Le(io.appmetrica.analytics.impl.Oe oe, io.appmetrica.analytics.plugins.PluginErrorDetails pluginErrorDetails) {
        this.f4614b = oe;
        this.f4613a = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((io.appmetrica.analytics.impl.Ra) this.f4614b.f4774d.get()).getPluginExtension().reportUnhandledException(this.f4613a);
    }
}
