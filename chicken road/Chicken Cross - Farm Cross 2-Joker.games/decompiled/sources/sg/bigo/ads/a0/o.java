package sg.bigo.ads.a0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import sg.bigo.ads.X0.B;
import sg.bigo.ads.X0.C;
import sg.bigo.ads.X0.D;
import sg.bigo.ads.X0.E;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class o implements Application.ActivityLifecycleCallbacks {
    public static boolean c = false;
    public static int d = -1;
    public static int e = -1;
    public static Application f;

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f12678a;
    public final WeakHashMap b = new WeakHashMap();

    public static Activity a() {
        WeakReference weakReference = n.f12677a.f12678a;
        if (weakReference == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public static int b() {
        int i;
        if (!c || (i = e) < 0) {
            return 0;
        }
        return i > 0 ? 1 : 2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        d++;
        AbstractC5446j.b(new f(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        d--;
        AbstractC5446j.b(new l(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f12678a = null;
        AbstractC5446j.b(new j(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f12678a = new WeakReference(activity);
        AbstractC5446j.b(new h(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (e == 0) {
            C5018b c5018b = C5018b.e;
            c5018b.getClass();
            c5018b.b = SystemClock.elapsedRealtime();
            long currentTimeMillis = System.currentTimeMillis();
            c5018b.c = currentTimeMillis;
            InterfaceC5017a interfaceC5017a = c5018b.d;
            if (interfaceC5017a != null) {
                long j = c5018b.b;
                if (j > 0) {
                    E e2 = (E) interfaceC5017a;
                    e2.d = true;
                    e2.g = j;
                    D d2 = e2.i;
                    d2.b = currentTimeMillis;
                    long j2 = e2.c;
                    if (j2 > 0) {
                        long j3 = e2.h;
                        if (j3 > 0 && j - j3 >= j2) {
                            e2.e = 0L;
                            e2.f = 0L;
                            d2.c = System.currentTimeMillis();
                            C.c.f12597a.clear();
                        }
                    }
                    D d3 = e2.i;
                    if (d3.c == 0) {
                        d3.c = System.currentTimeMillis();
                    }
                    C c2 = C.c;
                    c2.b = true;
                    Iterator it = c2.f12597a.entrySet().iterator();
                    while (it.hasNext()) {
                        B b = (B) ((Map.Entry) it.next()).getValue();
                        if (b != null) {
                            b.c.set(0);
                        }
                    }
                }
            }
        }
        e++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i = e - 1;
        e = i;
        if (i == 0) {
            C5018b c5018b = C5018b.e;
            InterfaceC5017a interfaceC5017a = c5018b.d;
            if (interfaceC5017a != null) {
                long j = c5018b.b;
                if (j > 0) {
                    boolean z = c5018b.f12666a;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j2 = c5018b.c;
                    System.currentTimeMillis();
                    E e2 = (E) interfaceC5017a;
                    e2.d = false;
                    e2.h = elapsedRealtime;
                    e2.g = 0L;
                    long j3 = elapsedRealtime - j;
                    if (j3 > 0 && j3 > e2.b) {
                        e2.e += j3;
                        e2.f = j3;
                        if (e2.f12599a) {
                            int i2 = z ? 1 : 2;
                            HashMap hashMap = new HashMap();
                            hashMap.put("start_type", String.valueOf(i2));
                            hashMap.put("start_time", String.valueOf(j2));
                            hashMap.put(IronSourceConstants.EVENTS_DURATION, String.valueOf(j3));
                            sg.bigo.ads.s1.b.a("06002044", hashMap);
                        }
                    }
                    C.c.b = false;
                }
            }
            c5018b.f12666a = false;
        }
    }

    public static synchronized void a(Application application) {
        synchronized (o.class) {
            if (c) {
                return;
            }
            c = true;
            d = 0;
            e = 0;
            f = application;
            application.registerActivityLifecycleCallbacks(n.f12677a);
        }
    }
}
