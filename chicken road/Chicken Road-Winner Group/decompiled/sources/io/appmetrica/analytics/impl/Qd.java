package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.io.File;

/* loaded from: classes.dex */
public final class Qd implements NativeCrashHandler {

    /* renamed from: a, reason: collision with root package name */
    public final o2.l f6470a;

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f6471b = C0878ua.k().x().e();

    /* renamed from: c, reason: collision with root package name */
    public final Td f6472c;

    public Qd(Context context, Xg xg, o2.l lVar, Yd yd, EnumC0569ib enumC0569ib, String str) {
        this.f6470a = lVar;
        this.f6472c = new Td(context, xg, yd, enumC0569ib);
    }

    public static final void a(Qd qd, NativeCrash nativeCrash, File file) {
        qd.f6470a.invoke(nativeCrash.getUuid());
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler
    public final void newCrash(final NativeCrash nativeCrash) {
        E0 e02;
        try {
            NativeCrashSource source = nativeCrash.getSource();
            String handlerVersion = nativeCrash.getHandlerVersion();
            String uuid = nativeCrash.getUuid();
            String dumpFile = nativeCrash.getDumpFile();
            long creationTime = nativeCrash.getCreationTime();
            F0 a3 = G0.a(nativeCrash.getMetadata());
            kotlin.jvm.internal.j.b(a3);
            e02 = new E0(source, handlerVersion, uuid, dumpFile, creationTime, a3);
        } catch (Throwable unused) {
            e02 = null;
        }
        if (e02 == null) {
            this.f6470a.invoke(nativeCrash.getUuid());
            return;
        }
        LoggerStorage.getOrCreatePublicLogger(e02.f.f5920a).info("Detected native crash with uuid = " + e02.f5866c, new Object[0]);
        IHandlerExecutor iHandlerExecutor = this.f6471b;
        Td td = this.f6472c;
        Consumer consumer = new Consumer() { // from class: io.appmetrica.analytics.impl.Mo
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(Object obj) {
                Qd.a(Qd.this, nativeCrash, (File) obj);
            }
        };
        td.getClass();
        Md md = new Md(new Od(e02.f5864a, e02.f5865b), td.f);
        Jd jd = new Jd(td.f6661b, e02.f, new Sd(e02, td.f6663d));
        C0542ha c0542ha = td.f6664e;
        String str = e02.f5867d;
        c0542ha.getClass();
        File file = new File(str);
        Context context = td.f6660a;
        if (C0516ga.f7364c == null) {
            synchronized (kotlin.jvm.internal.r.a(C0516ga.class)) {
                if (C0516ga.f7364c == null) {
                    C0516ga.f7364c = new C0516ga(context);
                }
            }
        }
        C0516ga c0516ga = C0516ga.f7364c;
        if (c0516ga != null) {
            iHandlerExecutor.execute(new Yf(file, md, consumer, jd, c0516ga, td.f6662c.a(e02)));
        } else {
            kotlin.jvm.internal.j.g("INSTANCE");
            throw null;
        }
    }
}
