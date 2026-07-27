package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;

/* loaded from: classes.dex */
public final class Te implements IPluginReporter {

    /* renamed from: a, reason: collision with root package name */
    public final We f6665a = new We();

    /* renamed from: b, reason: collision with root package name */
    public final Xe f6666b = new Xe();

    /* renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f6667c = C0587j4.l().g().a();

    /* renamed from: d, reason: collision with root package name */
    public final Provider f6668d;

    public Te(Provider<Ya> provider) {
        this.f6668d = provider;
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        We we = this.f6665a;
        we.f6793a.a(pluginErrorDetails);
        if (we.f6795c.a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).f8320a) {
            this.f6666b.getClass();
            this.f6667c.execute(new Re(this, pluginErrorDetails, str));
        }
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        this.f6665a.f6793a.a(pluginErrorDetails);
        this.f6666b.getClass();
        this.f6667c.execute(new Qe(this, pluginErrorDetails));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f6665a.f6794b.a(str);
        this.f6666b.getClass();
        this.f6667c.execute(new Se(this, str, str2, pluginErrorDetails));
    }
}
