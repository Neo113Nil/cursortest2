package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Jd implements io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler {

    /* renamed from: a, reason: collision with root package name */
    public final s1.l f4498a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor f4499b = io.appmetrica.analytics.impl.C0560na.k().w().d();

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Md f4500c;

    public Jd(android.content.Context context, io.appmetrica.analytics.impl.Sg sg, s1.l lVar, io.appmetrica.analytics.impl.Rd rd, io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb, java.lang.String str) {
        this.f4498a = lVar;
        this.f4500c = new io.appmetrica.analytics.impl.Md(context, sg, rd, enumC0251bb);
    }

    public static final void a(io.appmetrica.analytics.impl.Jd jd, io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash nativeCrash, java.io.File file) {
        jd.f4498a.invoke(nativeCrash.getUuid());
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler
    public final void newCrash(final io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash nativeCrash) {
        io.appmetrica.analytics.impl.G0 g02;
        try {
            io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource source = nativeCrash.getSource();
            java.lang.String handlerVersion = nativeCrash.getHandlerVersion();
            java.lang.String uuid = nativeCrash.getUuid();
            java.lang.String dumpFile = nativeCrash.getDumpFile();
            long creationTime = nativeCrash.getCreationTime();
            io.appmetrica.analytics.impl.H0 a2 = io.appmetrica.analytics.impl.I0.a(nativeCrash.getMetadata());
            kotlin.jvm.internal.i.b(a2);
            g02 = new io.appmetrica.analytics.impl.G0(source, handlerVersion, uuid, dumpFile, creationTime, a2);
        } catch (java.lang.Throwable unused) {
            g02 = null;
        }
        if (g02 == null) {
            this.f4498a.invoke(nativeCrash.getUuid());
            return;
        }
        io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage.getOrCreatePublicLogger(g02.f4317f.f4360a).info("Detected native crash with uuid = " + g02.f4314c, new java.lang.Object[0]);
        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor iHandlerExecutor = this.f4499b;
        io.appmetrica.analytics.impl.Md md = this.f4500c;
        io.appmetrica.analytics.coreapi.internal.backport.Consumer consumer = new io.appmetrica.analytics.coreapi.internal.backport.Consumer() { // from class: io.appmetrica.analytics.impl.Mo
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(java.lang.Object obj) {
                io.appmetrica.analytics.impl.Jd.a(io.appmetrica.analytics.impl.Jd.this, nativeCrash, (java.io.File) obj);
            }
        };
        md.getClass();
        io.appmetrica.analytics.impl.Fd fd = new io.appmetrica.analytics.impl.Fd(new io.appmetrica.analytics.impl.Hd(g02.f4312a, g02.f4313b), md.f4666f);
        io.appmetrica.analytics.impl.Cd cd = new io.appmetrica.analytics.impl.Cd(md.f4662b, g02.f4317f, new io.appmetrica.analytics.impl.Ld(g02, md.f4664d));
        io.appmetrica.analytics.impl.C0224aa c0224aa = md.f4665e;
        java.lang.String str = g02.f4315d;
        c0224aa.getClass();
        java.io.File file = new java.io.File(str);
        android.content.Context context = md.f4661a;
        if (io.appmetrica.analytics.impl.Z9.f5399c == null) {
            synchronized (kotlin.jvm.internal.q.a(io.appmetrica.analytics.impl.Z9.class)) {
                if (io.appmetrica.analytics.impl.Z9.f5399c == null) {
                    io.appmetrica.analytics.impl.Z9.f5399c = new io.appmetrica.analytics.impl.Z9(context);
                }
            }
        }
        io.appmetrica.analytics.impl.Z9 z9 = io.appmetrica.analytics.impl.Z9.f5399c;
        if (z9 != null) {
            iHandlerExecutor.execute(new io.appmetrica.analytics.impl.Tf(file, fd, consumer, cd, z9, md.f4663c.a(g02)));
        } else {
            kotlin.jvm.internal.i.i("INSTANCE");
            throw null;
        }
    }
}
