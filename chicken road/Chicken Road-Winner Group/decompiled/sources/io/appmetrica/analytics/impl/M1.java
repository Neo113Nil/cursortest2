package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
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
public final class M1 implements A1, InterfaceC0816s0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6266a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f6267b;

    /* renamed from: c, reason: collision with root package name */
    public volatile InterfaceC0997z1 f6268c;

    /* renamed from: d, reason: collision with root package name */
    public final C0562i4 f6269d;

    /* renamed from: e, reason: collision with root package name */
    public final T1 f6270e;
    public Xg f;

    /* renamed from: g, reason: collision with root package name */
    public final C0645la f6271g;

    /* renamed from: h, reason: collision with root package name */
    public final C0741p2 f6272h;

    /* renamed from: i, reason: collision with root package name */
    public final N1 f6273i;

    /* renamed from: j, reason: collision with root package name */
    public final C0574ih f6274j;

    public M1(Context context, InterfaceC0997z1 interfaceC0997z1) {
        this(context, interfaceC0997z1, new C0614k5(context));
    }

    public final void a() {
        this.f6270e.c(new Vo(2, this));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void b(Intent intent) {
        this.f6270e.d(intent);
        if (intent != null) {
            String action = intent.getAction();
            Uri data = intent.getData();
            String encodedAuthority = data == null ? null : data.getEncodedAuthority();
            if (!"io.appmetrica.analytics.IAppMetricaService".equals(action) || encodedAuthority == null || data == null || !Objects.equals(data.getPath(), "/client")) {
                return;
            }
            int parseInt = Integer.parseInt(data.getQueryParameter("pid"));
            this.f6269d.a(encodedAuthority, Integer.valueOf(parseInt), data.getQueryParameter("psid"));
            this.f6272h.a(parseInt);
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void c(Intent intent) {
        T1 t1 = this.f6270e;
        if (intent == null) {
            t1.getClass();
            return;
        }
        t1.getClass();
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            t1.f6635a.a(action, Integer.valueOf(T1.a(intent)));
        }
        for (Map.Entry entry : t1.f6636b.entrySet()) {
            S1 s12 = (S1) entry.getKey();
            if (((R1) entry.getValue()).a(intent)) {
                s12.a(intent);
            }
        }
    }

    public final void d(Intent intent) {
        C0878ua.f8414H.v().a(AbstractC0698nb.e(intent.getStringExtra("screen_size")));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void onConfigurationChanged(Configuration configuration) {
        C0878ua.f8414H.v().a(configuration);
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void onCreate() {
        if (this.f6266a) {
            C0878ua.f8414H.v().a(this.f6267b.getResources().getConfiguration());
        } else {
            this.f6271g.b(this.f6267b);
            C0878ua c0878ua = C0878ua.f8414H;
            synchronized (c0878ua) {
                c0878ua.f8416B.initAsync();
                c0878ua.f8441u.a(c0878ua.f8422a);
                c0878ua.f8441u.a(new C0659lo(c0878ua.f8416B));
                NetworkServiceLocator.init(new C0666m5(new C0886ui(c0878ua.h()), new C0925w5(c0878ua.f8422a)));
                c0878ua.l().a(c0878ua.f8437q);
                c0878ua.E();
            }
            AbstractC0397bk.f7063a.e();
            C0657lm c0657lm = C0878ua.f8414H.f8441u;
            c0657lm.b();
            C0605jm b3 = c0657lm.b();
            Ck p3 = C0878ua.f8414H.p();
            p3.a(new C0552hk(new C0545hd(this.f6270e)), b3);
            c0657lm.a(p3);
            ((El) C0878ua.f8414H.A()).getClass();
            a();
            C0878ua.f8414H.m().init();
            C0878ua.f8414H.c().init();
            N1 n12 = this.f6273i;
            Context context = this.f6267b;
            C0562i4 c0562i4 = this.f6269d;
            n12.getClass();
            this.f = new Xg(context, c0562i4);
            Context context2 = this.f6267b;
            AbstractC0843t1.f8325a.b(context2);
            AppMetrica.getReporter(context2, "20799a27-fa80-4b36-b2db-0f8141f24180");
            Context context3 = this.f6267b;
            Xg xg = this.f;
            Vd r3 = C0878ua.k().r();
            IHandlerExecutor e3 = C0878ua.k().x().e();
            C0693n6 c0693n6 = new C0693n6(context3, xg, EnumC0569ib.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE, new X(), new BlockingExecutor(), "previous");
            C0693n6 c0693n62 = new C0693n6(context3, xg, EnumC0569ib.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new C0853tb(), e3, "actual");
            File crashesDirectory = FileUtils.getCrashesDirectory(context3);
            if (crashesDirectory != null) {
                FileObserverC0641l6 fileObserverC0641l6 = new FileObserverC0641l6(crashesDirectory, c0693n62, new C0542ha());
                e3.execute(new Zf(crashesDirectory, c0693n6));
                if (!crashesDirectory.exists()) {
                    crashesDirectory.mkdir();
                } else if (!crashesDirectory.isDirectory() && crashesDirectory.delete()) {
                    crashesDirectory.mkdir();
                }
                fileObserverC0641l6.startWatching();
                C0878ua.f8414H.f8419E.storeReference(fileObserverC0641l6);
            }
            r3.getClass();
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context3);
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                r3.f6752a.init(context3, new NativeCrashServiceConfig(absolutePath));
                List<NativeCrash> allCrashes = r3.f6752a.getAllCrashes();
                if (!allCrashes.isEmpty()) {
                    Qd b4 = r3.f6753b.b(context3, xg);
                    Iterator<T> it = allCrashes.iterator();
                    while (it.hasNext()) {
                        b4.newCrash((NativeCrash) it.next());
                    }
                }
                r3.f6752a.setDefaultCrashHandler(r3.f6753b.a(context3, xg));
            }
            new P5(X0.a.z(new RunnableC0446dh())).run();
            this.f6266a = true;
        }
        C0878ua.f8414H.l().a();
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void onDestroy() {
        Mb l3 = C0878ua.f8414H.l();
        synchronized (l3) {
            Iterator it = l3.f6283c.iterator();
            while (it.hasNext()) {
                ((InterfaceC0759pk) it.next()).onDestroy();
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void pauseUserSession(Bundle bundle) {
        Gf gf;
        bundle.setClassLoader(Gf.class.getClassLoader());
        String str = Gf.f5991c;
        try {
            gf = (Gf) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            gf = null;
        }
        Integer asInteger = gf != null ? gf.f5992a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.f6272h.b(asInteger.intValue());
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void reportData(int i3, Bundle bundle) {
        this.f6274j.getClass();
        List list = (List) C0878ua.f8414H.f8442v.f7637a.get(Integer.valueOf(i3));
        if (list == null) {
            list = e2.o.f4877a;
        }
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC0577ik) it.next()).reportData(i3, bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void resumeUserSession(Bundle bundle) {
        Gf gf;
        bundle.setClassLoader(Gf.class.getClassLoader());
        String str = Gf.f5991c;
        try {
            gf = (Gf) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            gf = null;
        }
        Integer asInteger = gf != null ? gf.f5992a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.f6272h.c(asInteger.intValue());
        }
    }

    public M1(Context context, InterfaceC0997z1 interfaceC0997z1, C0614k5 c0614k5) {
        this(context, interfaceC0997z1, new C0562i4(context, c0614k5), new T1(), C0645la.f7800d, C0878ua.k().e(), new N1());
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(Intent intent) {
        T1 t1 = this.f6270e;
        if (intent == null) {
            t1.getClass();
            return;
        }
        t1.getClass();
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            t1.f6635a.a(action, Integer.valueOf(T1.a(intent)));
        }
        for (Map.Entry entry : t1.f6636b.entrySet()) {
            S1 s12 = (S1) entry.getKey();
            if (((R1) entry.getValue()).a(intent)) {
                s12.a(intent);
            }
        }
    }

    public M1(Context context, InterfaceC0997z1 interfaceC0997z1, C0562i4 c0562i4, T1 t1, C0645la c0645la, C0741p2 c0741p2, N1 n12) {
        this.f6266a = false;
        this.f6267b = context;
        this.f6268c = interfaceC0997z1;
        this.f6269d = c0562i4;
        this.f6270e = t1;
        this.f6271g = c0645la;
        this.f6272h = c0741p2;
        this.f6273i = n12;
        this.f6274j = new C0574ih();
    }

    public final void a(Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        W5.b(bundle);
        Xg xg = this.f;
        if (xg != null) {
            xg.a(W5.b(bundle), bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(InterfaceC0997z1 interfaceC0997z1) {
        this.f6268c = interfaceC0997z1;
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(Intent intent, int i3) {
        ((C0947x1) this.f6268c).f8602a.stopSelfResult(i3);
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(Intent intent, int i3, int i4) {
        ((C0947x1) this.f6268c).f8602a.stopSelfResult(i4);
    }
}
