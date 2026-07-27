package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes.dex */
public final class Hj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f6038a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6039b;

    public Hj(PluginErrorDetails pluginErrorDetails, String str) {
        this.f6038a = pluginErrorDetails;
        this.f6039b = str;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.getPluginExtension().reportError(this.f6038a, this.f6039b);
    }
}
