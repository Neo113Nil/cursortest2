package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes.dex */
public final class Ij implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6112a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6113b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f6114c;

    public Ij(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f6112a = str;
        this.f6113b = str2;
        this.f6114c = pluginErrorDetails;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.getPluginExtension().reportError(this.f6112a, this.f6113b, this.f6114c);
    }
}
