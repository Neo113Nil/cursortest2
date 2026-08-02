package w1;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class U0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ V0 f17555a;

    public U0(V0 v02) {
        this.f17555a = v02;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.toString();
        Iterator it = ((ArrayList) this.f17555a.f17563c).iterator();
        while (it.hasNext()) {
            S0 s02 = (S0) it.next();
            switch (s02.f17528a) {
                case 0:
                    break;
                default:
                    ((X0) s02.f17529b).f17580e = System.nanoTime();
                    break;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Q0 q02;
        activity.toString();
        Iterator it = ((ArrayList) this.f17555a.f17563c).iterator();
        while (it.hasNext()) {
            S0 s02 = (S0) it.next();
            switch (s02.f17528a) {
                case 0:
                    ((T0) s02.f17529b).b(activity, "fl.resume.time", "fl.resume.runtime.memory", "fl.resume.system.memory");
                    break;
                default:
                    X0 x02 = (X0) s02.f17529b;
                    if (x02.f17579d && (q02 = x02.f17577b) != null) {
                        q02.f17517f = (long) ((System.nanoTime() - x02.f17580e) / 1000000.0d);
                        break;
                    }
                    break;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.toString();
        Iterator it = ((ArrayList) this.f17555a.f17563c).iterator();
        while (it.hasNext()) {
            S0 s02 = (S0) it.next();
            switch (s02.f17528a) {
                case 0:
                    activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new R0(s02, activity, 0));
                    break;
                default:
                    activity.toString();
                    X0 x02 = (X0) s02.f17529b;
                    Q0 q02 = x02.f17577b;
                    x02.f17577b = new Q0(activity.getClass().getSimpleName(), q02 == null ? null : q02.f17512a);
                    x02.f17578c.put(activity.toString(), x02.f17577b);
                    int i7 = x02.f17582g + 1;
                    x02.f17582g = i7;
                    if (i7 == 1 && !x02.f17583h) {
                        activity.toString();
                        long nanoTime = System.nanoTime();
                        long j = (long) ((nanoTime - x02.f17581f) / 1000000.0d);
                        x02.f17581f = nanoTime;
                        x02.f17580e = nanoTime;
                        if (x02.f17579d) {
                            HashMap m7 = e1.k.m("fl.current.screen", activity.getClass().getSimpleName());
                            m7.put("fl.background.time", Long.toString(j));
                            r.i().j("Flurry.ForegroundTime", 6, m7);
                        }
                    }
                    activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new R0(s02, activity, 1));
                    break;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.toString();
        Iterator it = ((ArrayList) this.f17555a.f17563c).iterator();
        while (it.hasNext()) {
            S0 s02 = (S0) it.next();
            switch (s02.f17528a) {
                case 0:
                    break;
                default:
                    X0 x02 = (X0) s02.f17529b;
                    Q0 q02 = (Q0) x02.f17578c.remove(activity.toString());
                    boolean isChangingConfigurations = activity.isChangingConfigurations();
                    x02.f17583h = isChangingConfigurations;
                    int i7 = x02.f17582g - 1;
                    x02.f17582g = i7;
                    if (i7 == 0 && !isChangingConfigurations) {
                        activity.toString();
                        long j = (long) ((r3 - x02.f17581f) / 1000000.0d);
                        x02.f17581f = System.nanoTime();
                        if (x02.f17579d) {
                            HashMap m7 = e1.k.m("fl.current.screen", activity.getClass().getSimpleName());
                            m7.put("fl.foreground.time", Long.toString(j));
                            r.i().j("Flurry.ForegroundTime", 6, m7);
                        }
                    }
                    if (x02.f17579d && q02 != null && q02.f17516e) {
                        r i8 = r.i();
                        HashMap hashMap = q02.f17515d;
                        hashMap.put("fl.duration", Long.toString((long) ((System.nanoTime() - q02.f17514c) / 1000000.0d)));
                        if (AbstractC1706i0.k(16)) {
                            i8.h("Flurry.ScreenTime", 6, hashMap, true, false, null);
                        }
                        q02.f17516e = false;
                        break;
                    }
                    break;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
