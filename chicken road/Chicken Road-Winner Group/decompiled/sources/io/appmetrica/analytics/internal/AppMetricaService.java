package io.appmetrica.analytics.internal;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import io.appmetrica.analytics.impl.B1;
import io.appmetrica.analytics.impl.BinderC0972y1;
import io.appmetrica.analytics.impl.C0603jk;
import io.appmetrica.analytics.impl.C0614k5;
import io.appmetrica.analytics.impl.C0809rj;
import io.appmetrica.analytics.impl.C0835sj;
import io.appmetrica.analytics.impl.C0878ua;
import io.appmetrica.analytics.impl.C0947x1;
import io.appmetrica.analytics.impl.D1;
import io.appmetrica.analytics.impl.E1;
import io.appmetrica.analytics.impl.F1;
import io.appmetrica.analytics.impl.G1;
import io.appmetrica.analytics.impl.H1;
import io.appmetrica.analytics.impl.L1;
import io.appmetrica.analytics.impl.M1;
import io.appmetrica.analytics.impl.P1;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public class AppMetricaService extends Service {

    /* renamed from: c, reason: collision with root package name */
    private static L1 f8716c;

    /* renamed from: a, reason: collision with root package name */
    private final C0947x1 f8717a = new C0947x1(this);

    /* renamed from: b, reason: collision with root package name */
    private final a f8718b = new a();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        String action = intent.getAction();
        IBinder binderC0972y1 = (action == null || !action.startsWith("io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK")) ? this.f8718b : new BinderC0972y1();
        L1 l12 = f8716c;
        l12.f6201a.execute(new F1(l12, intent));
        return binderC0972y1;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        L1 l12 = f8716c;
        l12.f6201a.execute(new B1(l12, configuration));
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        C0878ua.a(getApplicationContext());
        BaseReleaseLogger.init(getApplicationContext());
        L1 l12 = f8716c;
        if (l12 == null) {
            Context applicationContext = getApplicationContext();
            M1 m12 = new M1(applicationContext, this.f8717a, new C0614k5(applicationContext));
            C0603jk c0603jk = C0878ua.f8414H.f8442v;
            P1 p12 = new P1(m12);
            LinkedHashMap linkedHashMap = c0603jk.f7637a;
            Object obj = linkedHashMap.get(1);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(1, obj);
            }
            ((List) obj).add(p12);
            f8716c = new L1(C0878ua.f8414H.f8425d.b(), m12);
        } else {
            l12.f6202b.a(this.f8717a);
        }
        C0878ua c0878ua = C0878ua.f8414H;
        C0835sj c0835sj = new C0835sj(f8716c);
        synchronized (c0878ua) {
            c0878ua.f = new C0809rj(c0878ua.f8422a, c0835sj);
        }
        f8716c.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        f8716c.onDestroy();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        super.onRebind(intent);
        L1 l12 = f8716c;
        l12.f6201a.execute(new G1(l12, intent));
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i3) {
        L1 l12 = f8716c;
        l12.f6201a.execute(new D1(l12, intent, i3));
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i3, int i4) {
        L1 l12 = f8716c;
        l12.f6201a.execute(new E1(l12, intent, i3, i4));
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        L1 l12 = f8716c;
        l12.f6201a.execute(new H1(l12, intent));
        String action = intent.getAction();
        return (action == null || !action.startsWith("io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK")) && intent.getData() != null;
    }
}
