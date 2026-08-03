package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Me implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.plugins.PluginErrorDetails f4667a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4668b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.Oe f4669c;

    public Me(io.appmetrica.analytics.impl.Oe oe, io.appmetrica.analytics.plugins.PluginErrorDetails pluginErrorDetails, java.lang.String str) {
        this.f4669c = oe;
        this.f4667a = pluginErrorDetails;
        this.f4668b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((io.appmetrica.analytics.impl.Ra) this.f4669c.f4774d.get()).getPluginExtension().reportError(this.f4667a, this.f4668b);
    }
}
