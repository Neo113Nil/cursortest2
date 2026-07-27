package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes.dex */
public final class Re implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f6507a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6508b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Te f6509c;

    public Re(Te te, PluginErrorDetails pluginErrorDetails, String str) {
        this.f6509c = te;
        this.f6507a = pluginErrorDetails;
        this.f6508b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Ya) this.f6509c.f6668d.get()).getPluginExtension().reportError(this.f6507a, this.f6508b);
    }
}
