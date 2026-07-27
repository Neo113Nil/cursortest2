package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;

/* loaded from: classes.dex */
public final class J0 {

    /* renamed from: a, reason: collision with root package name */
    public final IHandlerExecutor f6139a = C0587j4.l().g().a();

    /* renamed from: b, reason: collision with root package name */
    public final C0946x0 f6140b;

    /* renamed from: c, reason: collision with root package name */
    public final Ve f6141c;

    /* renamed from: d, reason: collision with root package name */
    public final Ye f6142d;

    public J0() {
        C0946x0 c0946x0 = new C0946x0();
        this.f6140b = c0946x0;
        this.f6141c = new Ve(c0946x0);
        this.f6142d = new Ye();
    }

    public final void a(PluginErrorDetails pluginErrorDetails) {
        Ve ve = this.f6141c;
        ve.f6754a.a(null);
        ve.f6755b.a(pluginErrorDetails);
        Ye ye = this.f6142d;
        kotlin.jvm.internal.j.b(pluginErrorDetails);
        ye.getClass();
        this.f6139a.execute(new D1.a(this, 13, pluginErrorDetails));
    }

    public final void a(PluginErrorDetails pluginErrorDetails, String str) {
        Ve ve = this.f6141c;
        ve.f6754a.a(null);
        ve.f6755b.a(pluginErrorDetails);
        if (ve.f6757d.a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).f8320a) {
            Ye ye = this.f6142d;
            kotlin.jvm.internal.j.b(pluginErrorDetails);
            ye.getClass();
            this.f6139a.execute(new F0.a(this, pluginErrorDetails, str, 6));
        }
    }

    public final void a(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        Ve ve = this.f6141c;
        ve.f6754a.a(null);
        ve.f6756c.a(str);
        Ye ye = this.f6142d;
        kotlin.jvm.internal.j.b(str);
        ye.getClass();
        this.f6139a.execute(new Lo(this, str, str2, pluginErrorDetails, 1));
    }

    public static final void a(J0 j02, PluginErrorDetails pluginErrorDetails, String str) {
        j02.f6140b.getClass();
        C0920w0 c0920w0 = C0920w0.f8534e;
        kotlin.jvm.internal.j.b(c0920w0);
        C0777qc i3 = c0920w0.f().i();
        kotlin.jvm.internal.j.b(i3);
        i3.f8150a.getPluginExtension().reportError(pluginErrorDetails, str);
    }

    public static final void a(J0 j02, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        j02.f6140b.getClass();
        C0920w0 c0920w0 = C0920w0.f8534e;
        kotlin.jvm.internal.j.b(c0920w0);
        C0777qc i3 = c0920w0.f().i();
        kotlin.jvm.internal.j.b(i3);
        i3.f8150a.getPluginExtension().reportError(str, str2, pluginErrorDetails);
    }

    public static final void a(J0 j02, PluginErrorDetails pluginErrorDetails) {
        j02.f6140b.getClass();
        C0920w0 c0920w0 = C0920w0.f8534e;
        kotlin.jvm.internal.j.b(c0920w0);
        C0777qc i3 = c0920w0.f().i();
        kotlin.jvm.internal.j.b(i3);
        i3.f8150a.getPluginExtension().reportUnhandledException(pluginErrorDetails);
    }
}
