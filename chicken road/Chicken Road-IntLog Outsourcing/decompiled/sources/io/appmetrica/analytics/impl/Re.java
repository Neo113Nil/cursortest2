package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes.dex */
public final class Re implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f7371a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7372b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Te f7373c;

    public Re(Te te, PluginErrorDetails pluginErrorDetails, String str) {
        this.f7373c = te;
        this.f7371a = pluginErrorDetails;
        this.f7372b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Ya) this.f7373c.f7540d.get()).getPluginExtension().reportError(this.f7371a, this.f7372b);
    }
}
