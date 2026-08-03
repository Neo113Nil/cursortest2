package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.eg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0333eg {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0514lg f5845a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0871za f5846b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0799wg f5847c;

    /* renamed from: d, reason: collision with root package name */
    public final h1.InterfaceC0171c f5848d = Q1.l.q(new io.appmetrica.analytics.impl.C0256bg(this));

    /* renamed from: e, reason: collision with root package name */
    public final h1.InterfaceC0171c f5849e = Q1.l.q(new io.appmetrica.analytics.impl.Zf(this));

    /* renamed from: f, reason: collision with root package name */
    public final h1.InterfaceC0171c f5850f = Q1.l.q(new io.appmetrica.analytics.impl.C0308dg(this));

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f5851g = new java.util.ArrayList();

    public C0333eg(io.appmetrica.analytics.impl.C0514lg c0514lg, io.appmetrica.analytics.impl.C0773vg c0773vg, io.appmetrica.analytics.impl.C0871za c0871za, io.appmetrica.analytics.impl.C0799wg c0799wg) {
        this.f5845a = c0514lg;
        this.f5846b = c0871za;
        this.f5847c = c0799wg;
    }

    public static final io.appmetrica.analytics.impl.Wf a(io.appmetrica.analytics.impl.C0333eg c0333eg) {
        return (io.appmetrica.analytics.impl.Wf) ((h1.C0175g) c0333eg.f5848d).a();
    }

    public static final void a(io.appmetrica.analytics.impl.C0333eg c0333eg, io.appmetrica.analytics.impl.C0566ng c0566ng, io.appmetrica.analytics.impl.Wf wf) {
        boolean a2;
        c0333eg.f5851g.add(c0566ng);
        io.appmetrica.analytics.impl.C0799wg c0799wg = c0333eg.f5847c;
        if (c0566ng == null) {
            c0799wg.getClass();
        } else {
            io.appmetrica.analytics.coreutils.internal.services.SafePackageManager safePackageManager = c0799wg.f7019b;
            android.content.Context context = c0799wg.f7018a;
            java.lang.String installerPackageName = safePackageManager.getInstallerPackageName(context, context.getPackageName());
            int ordinal = c0566ng.f6536d.ordinal();
            if (ordinal == 1) {
                a2 = kotlin.jvm.internal.i.a(c0799wg.f7023f, installerPackageName);
            } else if (ordinal == 2) {
                a2 = kotlin.jvm.internal.i.a(c0799wg.f7024g, installerPackageName);
            }
            if (a2) {
                c0333eg.a(c0566ng);
                return;
            }
        }
        wf.a();
    }

    public final void a(io.appmetrica.analytics.impl.C0566ng c0566ng) {
        io.appmetrica.analytics.impl.C0514lg c0514lg = this.f5845a;
        synchronized (c0514lg) {
            c0514lg.f6364b = c0566ng;
            c0514lg.f6365c = true;
            c0514lg.f6366d.a(c0566ng);
            c0514lg.f6366d.d();
            c0514lg.a(c0514lg.f6364b);
        }
    }
}
