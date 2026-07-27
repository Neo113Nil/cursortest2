package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes.dex */
public final class Qe implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f7334a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Te f7335b;

    public Qe(Te te, PluginErrorDetails pluginErrorDetails) {
        this.f7335b = te;
        this.f7334a = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Ya) this.f7335b.f7540d.get()).getPluginExtension().reportUnhandledException(this.f7334a);
    }
}
