package io.appmetrica.analytics.impl;

import a1.RunnableC0177a;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;

/* loaded from: classes.dex */
public final class J0 {

    /* renamed from: a, reason: collision with root package name */
    public final IHandlerExecutor f6991a = C0736j4.l().g().a();

    /* renamed from: b, reason: collision with root package name */
    public final C1095x0 f6992b;

    /* renamed from: c, reason: collision with root package name */
    public final Ve f6993c;

    /* renamed from: d, reason: collision with root package name */
    public final Ye f6994d;

    public J0() {
        C1095x0 c1095x0 = new C1095x0();
        this.f6992b = c1095x0;
        this.f6993c = new Ve(c1095x0);
        this.f6994d = new Ye();
    }

    public final void a(PluginErrorDetails pluginErrorDetails) {
        Ve ve = this.f6993c;
        ve.f7628a.a(null);
        ve.f7629b.a(pluginErrorDetails);
        Ye ye = this.f6994d;
        kotlin.jvm.internal.i.b(pluginErrorDetails);
        ye.getClass();
        this.f6991a.execute(new B3.c(this, 15, pluginErrorDetails));
    }

    public final void a(PluginErrorDetails pluginErrorDetails, String str) {
        Ve ve = this.f6993c;
        ve.f7628a.a(null);
        ve.f7629b.a(pluginErrorDetails);
        if (ve.f7631d.a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).f9268a) {
            Ye ye = this.f6994d;
            kotlin.jvm.internal.i.b(pluginErrorDetails);
            ye.getClass();
            this.f6991a.execute(new J0.a(this, pluginErrorDetails, str));
        }
    }

    public final void a(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        Ve ve = this.f6993c;
        ve.f7628a.a(null);
        ve.f7630c.a(str);
        Ye ye = this.f6994d;
        kotlin.jvm.internal.i.b(str);
        ye.getClass();
        this.f6991a.execute(new RunnableC0177a(this, str, str2, pluginErrorDetails, 2));
    }

    public static final void a(J0 j02, PluginErrorDetails pluginErrorDetails, String str) {
        j02.f6992b.getClass();
        C1069w0 c1069w0 = C1069w0.f9490e;
        kotlin.jvm.internal.i.b(c1069w0);
        C0926qc i2 = c1069w0.f().i();
        kotlin.jvm.internal.i.b(i2);
        i2.f9092a.getPluginExtension().reportError(pluginErrorDetails, str);
    }

    public static final void a(J0 j02, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        j02.f6992b.getClass();
        C1069w0 c1069w0 = C1069w0.f9490e;
        kotlin.jvm.internal.i.b(c1069w0);
        C0926qc i2 = c1069w0.f().i();
        kotlin.jvm.internal.i.b(i2);
        i2.f9092a.getPluginExtension().reportError(str, str2, pluginErrorDetails);
    }

    public static final void a(J0 j02, PluginErrorDetails pluginErrorDetails) {
        j02.f6992b.getClass();
        C1069w0 c1069w0 = C1069w0.f9490e;
        kotlin.jvm.internal.i.b(c1069w0);
        C0926qc i2 = c1069w0.f().i();
        kotlin.jvm.internal.i.b(i2);
        i2.f9092a.getPluginExtension().reportUnhandledException(pluginErrorDetails);
    }
}
