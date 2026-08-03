package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Bj implements io.appmetrica.analytics.impl.Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.plugins.PluginErrorDetails f4131a;

    public Bj(io.appmetrica.analytics.plugins.PluginErrorDetails pluginErrorDetails) {
        this.f4131a = pluginErrorDetails;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(io.appmetrica.analytics.impl.Ra ra) {
        ra.getPluginExtension().reportUnhandledException(this.f4131a);
    }
}
