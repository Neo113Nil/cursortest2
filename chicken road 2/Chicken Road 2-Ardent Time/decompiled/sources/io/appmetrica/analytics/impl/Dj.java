package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Dj implements io.appmetrica.analytics.impl.Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4216a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4217b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.plugins.PluginErrorDetails f4218c;

    public Dj(java.lang.String str, java.lang.String str2, io.appmetrica.analytics.plugins.PluginErrorDetails pluginErrorDetails) {
        this.f4216a = str;
        this.f4217b = str2;
        this.f4218c = pluginErrorDetails;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(io.appmetrica.analytics.impl.Ra ra) {
        ra.getPluginExtension().reportError(this.f4216a, this.f4217b, this.f4218c);
    }
}
