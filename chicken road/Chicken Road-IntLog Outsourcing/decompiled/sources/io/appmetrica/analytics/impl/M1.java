package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import g4.C0471p;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceConfig;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class M1 implements A1, InterfaceC0965s0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7121a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f7122b;

    /* renamed from: c, reason: collision with root package name */
    public volatile InterfaceC1146z1 f7123c;

    /* renamed from: d, reason: collision with root package name */
    public final C0711i4 f7124d;

    /* renamed from: e, reason: collision with root package name */
    public final T1 f7125e;

    /* renamed from: f, reason: collision with root package name */
    public Xg f7126f;

    /* renamed from: g, reason: collision with root package name */
    public final C0794la f7127g;

    /* renamed from: h, reason: collision with root package name */
    public final C0890p2 f7128h;

    /* renamed from: i, reason: collision with root package name */
    public final N1 f7129i;

    /* renamed from: j, reason: collision with root package name */
    public final C0723ih f7130j;

    public M1(Context context, InterfaceC1146z1 interfaceC1146z1) {
        this(context, interfaceC1146z1, new C0763k5(context));
    }

    public final void a() {
        this.f7125e.c(new Uo(2, this));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void b(Intent intent) {
        this.f7125e.d(intent);
        if (intent != null) {
            String action = intent.getAction();
            Uri data = intent.getData();
            String encodedAuthority = data == null ? null : data.getEncodedAuthority();
            if (!"io.appmetrica.analytics.IAppMetricaService".equals(action) || encodedAuthority == null || data == null || !Objects.equals(data.getPath(), "/client")) {
                return;
            }
            int parseInt = Integer.parseInt(data.getQueryParameter("pid"));
            this.f7124d.a(encodedAuthority, Integer.valueOf(parseInt), data.getQueryParameter("psid"));
            this.f7128h.a(parseInt);
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void c(Intent intent) {
        T1 t1 = this.f7125e;
        if (intent == null) {
            t1.getClass();
            return;
        }
        t1.getClass();
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            t1.f7506a.a(action, Integer.valueOf(T1.a(intent)));
        }
        for (Map.Entry entry : t1.f7507b.entrySet()) {
            S1 s12 = (S1) entry.getKey();
            if (((R1) entry.getValue()).a(intent)) {
                s12.a(intent);
            }
        }
    }

    public final void d(Intent intent) {
        C1027ua.f9366H.v().a(AbstractC0847nb.e(intent.getStringExtra("screen_size")));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void onConfigurationChanged(Configuration configuration) {
        C1027ua.f9366H.v().a(configuration);
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void onCreate() {
        if (this.f7121a) {
            C1027ua.f9366H.v().a(this.f7122b.getResources().getConfiguration());
        } else {
            this.f7127g.b(this.f7122b);
            C1027ua c1027ua = C1027ua.f9366H;
            synchronized (c1027ua) {
                c1027ua.f9368B.initAsync();
                c1027ua.f9394u.a(c1027ua.f9374a);
                c1027ua.f9394u.a(new C0808lo(c1027ua.f9368B));
                NetworkServiceLocator.init(new C0815m5(new C1035ui(c1027ua.h()), new C1074w5(c1027ua.f9374a)));
                c1027ua.l().a(c1027ua.f9390q);
                c1027ua.E();
            }
            AbstractC0546bk.f7949a.e();
            C0806lm c0806lm = C1027ua.f9366H.f9394u;
            c0806lm.b();
            C0754jm b6 = c0806lm.b();
            Ck p5 = C1027ua.f9366H.p();
            p5.a(new C0701hk(new C0694hd(this.f7125e)), b6);
            c0806lm.a(p5);
            ((El) C1027ua.f9366H.A()).getClass();
            a();
            C1027ua.f9366H.m().init();
            C1027ua.f9366H.c().init();
            N1 n12 = this.f7129i;
            Context context = this.f7122b;
            C0711i4 c0711i4 = this.f7124d;
            n12.getClass();
            this.f7126f = new Xg(context, c0711i4);
            Context context2 = this.f7122b;
            AbstractC0992t1.f9273a.b(context2);
            AppMetrica.getReporter(context2, "20799a27-fa80-4b36-b2db-0f8141f24180");
            Context context3 = this.f7122b;
            Xg xg = this.f7126f;
            Vd r5 = C1027ua.k().r();
            IHandlerExecutor e3 = C1027ua.k().x().e();
            C0842n6 c0842n6 = new C0842n6(context3, xg, EnumC0718ib.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE, new X(), new BlockingExecutor(), "previous");
            C0842n6 c0842n62 = new C0842n6(context3, xg, EnumC0718ib.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new C1002tb(), e3, "actual");
            File crashesDirectory = FileUtils.getCrashesDirectory(context3);
            if (crashesDirectory != null) {
                FileObserverC0790l6 fileObserverC0790l6 = new FileObserverC0790l6(crashesDirectory, c0842n62, new C0691ha());
                e3.execute(new Zf(crashesDirectory, c0842n6));
                if (!crashesDirectory.exists()) {
                    crashesDirectory.mkdir();
                } else if (!crashesDirectory.isDirectory() && crashesDirectory.delete()) {
                    crashesDirectory.mkdir();
                }
                fileObserverC0790l6.startWatching();
                C1027ua.f9366H.f9371E.storeReference(fileObserverC0790l6);
            }
            r5.getClass();
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context3);
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                r5.f7626a.init(context3, new NativeCrashServiceConfig(absolutePath));
                List<NativeCrash> allCrashes = r5.f7626a.getAllCrashes();
                if (!allCrashes.isEmpty()) {
                    Qd b7 = r5.f7627b.b(context3, xg);
                    Iterator<T> it = allCrashes.iterator();
                    while (it.hasNext()) {
                        b7.newCrash((NativeCrash) it.next());
                    }
                }
                r5.f7626a.setDefaultCrashHandler(r5.f7627b.a(context3, xg));
            }
            new P5(K1.b.W(new RunnableC0595dh())).run();
            this.f7121a = true;
        }
        C1027ua.f9366H.l().a();
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void onDestroy() {
        Mb l2 = C1027ua.f9366H.l();
        synchronized (l2) {
            Iterator it = l2.f7139c.iterator();
            while (it.hasNext()) {
                ((InterfaceC0908pk) it.next()).onDestroy();
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void pauseUserSession(Bundle bundle) {
        Gf gf;
        bundle.setClassLoader(Gf.class.getClassLoader());
        String str = Gf.f6836c;
        try {
            gf = (Gf) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            gf = null;
        }
        Integer asInteger = gf != null ? gf.f6837a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.f7128h.b(asInteger.intValue());
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void reportData(int i2, Bundle bundle) {
        this.f7130j.getClass();
        List list = (List) C1027ua.f9366H.f9395v.f8554a.get(Integer.valueOf(i2));
        if (list == null) {
            list = C0471p.f5750a;
        }
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC0726ik) it.next()).reportData(i2, bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void resumeUserSession(Bundle bundle) {
        Gf gf;
        bundle.setClassLoader(Gf.class.getClassLoader());
        String str = Gf.f6836c;
        try {
            gf = (Gf) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            gf = null;
        }
        Integer asInteger = gf != null ? gf.f6837a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.f7128h.c(asInteger.intValue());
        }
    }

    public M1(Context context, InterfaceC1146z1 interfaceC1146z1, C0763k5 c0763k5) {
        this(context, interfaceC1146z1, new C0711i4(context, c0763k5), new T1(), C0794la.f8723d, C1027ua.k().e(), new N1());
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(Intent intent) {
        T1 t1 = this.f7125e;
        if (intent == null) {
            t1.getClass();
            return;
        }
        t1.getClass();
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            t1.f7506a.a(action, Integer.valueOf(T1.a(intent)));
        }
        for (Map.Entry entry : t1.f7507b.entrySet()) {
            S1 s12 = (S1) entry.getKey();
            if (((R1) entry.getValue()).a(intent)) {
                s12.a(intent);
            }
        }
    }

    public M1(Context context, InterfaceC1146z1 interfaceC1146z1, C0711i4 c0711i4, T1 t1, C0794la c0794la, C0890p2 c0890p2, N1 n12) {
        this.f7121a = false;
        this.f7122b = context;
        this.f7123c = interfaceC1146z1;
        this.f7124d = c0711i4;
        this.f7125e = t1;
        this.f7127g = c0794la;
        this.f7128h = c0890p2;
        this.f7129i = n12;
        this.f7130j = new C0723ih();
    }

    public final void a(Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        W5.b(bundle);
        Xg xg = this.f7126f;
        if (xg != null) {
            xg.a(W5.b(bundle), bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(InterfaceC1146z1 interfaceC1146z1) {
        this.f7123c = interfaceC1146z1;
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(Intent intent, int i2) {
        ((C1096x1) this.f7123c).f9561a.stopSelfResult(i2);
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(Intent intent, int i2, int i3) {
        ((C1096x1) this.f7123c).f9561a.stopSelfResult(i3);
    }
}
