package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ne implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4731a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4732b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.plugins.PluginErrorDetails f4733c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.Oe f4734d;

    public Ne(io.appmetrica.analytics.impl.Oe oe, java.lang.String str, java.lang.String str2, io.appmetrica.analytics.plugins.PluginErrorDetails pluginErrorDetails) {
        this.f4734d = oe;
        this.f4731a = str;
        this.f4732b = str2;
        this.f4733c = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((io.appmetrica.analytics.impl.Ra) this.f4734d.f4774d.get()).getPluginExtension().reportError(this.f4731a, this.f4732b, this.f4733c);
    }
}
