package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Cj implements io.appmetrica.analytics.impl.Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.plugins.PluginErrorDetails f4179a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4180b;

    public Cj(io.appmetrica.analytics.plugins.PluginErrorDetails pluginErrorDetails, java.lang.String str) {
        this.f4179a = pluginErrorDetails;
        this.f4180b = str;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(io.appmetrica.analytics.impl.Ra ra) {
        ra.getPluginExtension().reportError(this.f4179a, this.f4180b);
    }
}
