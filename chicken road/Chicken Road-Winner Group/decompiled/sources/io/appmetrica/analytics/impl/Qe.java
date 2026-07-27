package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes.dex */
public final class Qe implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f6473a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Te f6474b;

    public Qe(Te te, PluginErrorDetails pluginErrorDetails) {
        this.f6474b = te;
        this.f6473a = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Ya) this.f6474b.f6668d.get()).getPluginExtension().reportUnhandledException(this.f6473a);
    }
}
