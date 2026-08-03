package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class L0 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor f4567a = io.appmetrica.analytics.impl.C0244b4.l().g().a();

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0861z0 f4568b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Qe f4569c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Te f4570d;

    public L0() {
        io.appmetrica.analytics.impl.C0861z0 c0861z0 = new io.appmetrica.analytics.impl.C0861z0();
        this.f4568b = c0861z0;
        this.f4569c = new io.appmetrica.analytics.impl.Qe(c0861z0);
        this.f4570d = new io.appmetrica.analytics.impl.Te();
    }

    public final void a(io.appmetrica.analytics.plugins.PluginErrorDetails pluginErrorDetails) {
        io.appmetrica.analytics.impl.Qe qe = this.f4569c;
        qe.f4863a.a(null);
        qe.f4864b.a(pluginErrorDetails);
        io.appmetrica.analytics.impl.Te te = this.f4570d;
        kotlin.jvm.internal.i.b(pluginErrorDetails);
        te.getClass();
        this.f4567a.execute(new F0.c(5, this, pluginErrorDetails));
    }

    public final void a(io.appmetrica.analytics.plugins.PluginErrorDetails pluginErrorDetails, java.lang.String str) {
        io.appmetrica.analytics.impl.Qe qe = this.f4569c;
        qe.f4863a.a(null);
        qe.f4864b.a(pluginErrorDetails);
        if (qe.f4866d.a((java.util.Collection<java.lang.Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).f6701a) {
            io.appmetrica.analytics.impl.Te te = this.f4570d;
            kotlin.jvm.internal.i.b(pluginErrorDetails);
            te.getClass();
            this.f4567a.execute(new F0.b(this, pluginErrorDetails, str));
        }
    }

    public final void a(java.lang.String str, java.lang.String str2, io.appmetrica.analytics.plugins.PluginErrorDetails pluginErrorDetails) {
        io.appmetrica.analytics.impl.Qe qe = this.f4569c;
        qe.f4863a.a(null);
        qe.f4865c.a(str);
        io.appmetrica.analytics.impl.Te te = this.f4570d;
        kotlin.jvm.internal.i.b(str);
        te.getClass();
        this.f4567a.execute(new io.appmetrica.analytics.impl.Ko(this, str, str2, pluginErrorDetails, 1));
    }

    public static final void a(io.appmetrica.analytics.impl.L0 l02, io.appmetrica.analytics.plugins.PluginErrorDetails pluginErrorDetails, java.lang.String str) {
        l02.f4568b.getClass();
        io.appmetrica.analytics.impl.C0835y0 c0835y0 = io.appmetrica.analytics.impl.C0835y0.f7125e;
        kotlin.jvm.internal.i.b(c0835y0);
        io.appmetrica.analytics.impl.C0458jc i2 = c0835y0.f().i();
        kotlin.jvm.internal.i.b(i2);
        i2.f6186a.getPluginExtension().reportError(pluginErrorDetails, str);
    }

    public static final void a(io.appmetrica.analytics.impl.L0 l02, java.lang.String str, java.lang.String str2, io.appmetrica.analytics.plugins.PluginErrorDetails pluginErrorDetails) {
        l02.f4568b.getClass();
        io.appmetrica.analytics.impl.C0835y0 c0835y0 = io.appmetrica.analytics.impl.C0835y0.f7125e;
        kotlin.jvm.internal.i.b(c0835y0);
        io.appmetrica.analytics.impl.C0458jc i2 = c0835y0.f().i();
        kotlin.jvm.internal.i.b(i2);
        i2.f6186a.getPluginExtension().reportError(str, str2, pluginErrorDetails);
    }

    public static final void a(io.appmetrica.analytics.impl.L0 l02, io.appmetrica.analytics.plugins.PluginErrorDetails pluginErrorDetails) {
        l02.f4568b.getClass();
        io.appmetrica.analytics.impl.C0835y0 c0835y0 = io.appmetrica.analytics.impl.C0835y0.f7125e;
        kotlin.jvm.internal.i.b(c0835y0);
        io.appmetrica.analytics.impl.C0458jc i2 = c0835y0.f().i();
        kotlin.jvm.internal.i.b(i2);
        i2.f6186a.getPluginExtension().reportUnhandledException(pluginErrorDetails);
    }
}
