package p155w1;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class U0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ V0 f17561a;

    public U0(V0 v6) {
        this.f17561a = v6;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.toString();
        for (S0 s7 : (ArrayList) this.f17561a.f17569c) {
            switch (s7.f17534a) {
                case 0:
                    break;
                default:
                    ((X0) s7.f17535b).f17586e = System.nanoTime();
                    break;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Q0 q1;
        activity.toString();
        for (S0 s7 : (ArrayList) this.f17561a.f17569c) {
            switch (s7.f17534a) {
                case 0:
                    ((T0) s7.f17535b).b(activity, "fl.resume.time", "fl.resume.runtime.memory", "fl.resume.system.memory");
                    break;
                default:
                    X0 x1 = (X0) s7.f17535b;
                    if (x1.f17585d && (q1 = x1.f17583b) != null) {
                        q1.f17523f = (long) ((System.nanoTime() - x1.f17586e) / 1000000.0d);
                    }
                    break;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.toString();
        for (S0 s7 : (ArrayList) this.f17561a.f17569c) {
            switch (s7.f17534a) {
                case 0:
                    activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new R0(s7, activity, 0));
                    break;
                default:
                    activity.toString();
                    X0 x1 = (X0) s7.f17535b;
                    Q0 q1 = x1.f17583b;
                    x1.f17583b = new Q0(activity.getClass().getSimpleName(), q1 == null ? null : q1.f17518a);
                    x1.f17584c.put(activity.toString(), x1.f17583b);
                    int i7 = x1.f17588g + 1;
                    x1.f17588g = i7;
                    if (i7 == 1 && !x1.f17589h) {
                        activity.toString();
                        long jNanoTime = System.nanoTime();
                        long j = (long) ((jNanoTime - x1.f17587f) / 1000000.0d);
                        x1.f17587f = jNanoTime;
                        x1.f17586e = jNanoTime;
                        if (x1.f17585d) {
                            HashMap mapM = k.m("fl.current.screen", activity.getClass().getSimpleName());
                            mapM.put("fl.background.time", Long.toString(j));
                            r.i().j("Flurry.ForegroundTime", 6, mapM);
                        }
                    }
                    activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new R0(s7, activity, 1));
                    break;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.toString();
        for (S0 s7 : (ArrayList) this.f17561a.f17569c) {
            switch (s7.f17534a) {
                case 0:
                    break;
                default:
                    X0 x1 = (X0) s7.f17535b;
                    Q0 q1 = (Q0) x1.f17584c.remove(activity.toString());
                    boolean zIsChangingConfigurations = activity.isChangingConfigurations();
                    x1.f17589h = zIsChangingConfigurations;
                    int i7 = x1.f17588g - 1;
                    x1.f17588g = i7;
                    if (i7 == 0 && !zIsChangingConfigurations) {
                        activity.toString();
                        long jNanoTime = System.nanoTime();
                        long j = (long) ((jNanoTime - x1.f17587f) / 1000000.0d);
                        x1.f17587f = jNanoTime;
                        if (x1.f17585d) {
                            HashMap mapM = k.m("fl.current.screen", activity.getClass().getSimpleName());
                            mapM.put("fl.foreground.time", Long.toString(j));
                            r.i().j("Flurry.ForegroundTime", 6, mapM);
                        }
                    }
                    if (x1.f17585d && q1 != null && q1.f17522e) {
                        r rVarI = r.i();
                        long jNanoTime2 = (long) ((System.nanoTime() - q1.f17520c) / 1000000.0d);
                        HashMap map = q1.f17521d;
                        map.put("fl.duration", Long.toString(jNanoTime2));
                        if (AbstractC0997i0.k(16)) {
                            rVarI.h("Flurry.ScreenTime", 6, map, true, false, null);
                        }
                        q1.f17522e = false;
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
