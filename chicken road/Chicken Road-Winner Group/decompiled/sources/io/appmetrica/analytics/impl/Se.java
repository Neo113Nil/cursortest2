package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes.dex */
public final class Se implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6598a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6599b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f6600c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Te f6601d;

    public Se(Te te, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f6601d = te;
        this.f6598a = str;
        this.f6599b = str2;
        this.f6600c = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Ya) this.f6601d.f6668d.get()).getPluginExtension().reportError(this.f6598a, this.f6599b, this.f6600c);
    }
}
