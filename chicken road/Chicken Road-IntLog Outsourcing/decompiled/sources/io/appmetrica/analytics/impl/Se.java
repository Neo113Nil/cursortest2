package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes.dex */
public final class Se implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7467a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7468b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f7469c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Te f7470d;

    public Se(Te te, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f7470d = te;
        this.f7467a = str;
        this.f7468b = str2;
        this.f7469c = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Ya) this.f7470d.f7540d.get()).getPluginExtension().reportError(this.f7467a, this.f7468b, this.f7469c);
    }
}
