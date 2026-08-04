package p155w1;

import android.app.Activity;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class R0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f17527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S0 f17528c;

    public /* synthetic */ R0(S0 s7, Activity activity, int i7) {
        this.f17526a = i7;
        this.f17528c = s7;
        this.f17527b = activity;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Q0 q1;
        switch (this.f17526a) {
            case 0:
                this.f17527b.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                T0 t7 = (T0) this.f17528c.f17535b;
                this.f17527b.getApplication();
                if (t7.f17547e != null) {
                    V0 v0D = V0.d();
                    S0 s7 = t7.f17547e;
                    synchronized (((ArrayList) v0D.f17569c)) {
                        ((ArrayList) v0D.f17569c).remove(s7);
                        break;
                    }
                    t7.f17547e = null;
                }
                ((T0) this.f17528c.f17535b).b(this.f17527b, "fl.layout.time", "fl.layout.runtime.memory", "fl.layout.system.memory");
                T0 t8 = (T0) this.f17528c.f17535b;
                t8.f17550h = true;
                if (t8.f17548f) {
                    t8.c();
                    return;
                }
                return;
            default:
                this.f17527b.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                S0 s8 = this.f17528c;
                X0 x1 = (X0) s8.f17535b;
                if (!x1.f17585d || (q1 = x1.f17583b) == null) {
                    return;
                }
                long jNanoTime = System.nanoTime();
                X0 x4 = (X0) s8.f17535b;
                q1.f17524g = (long) ((jNanoTime - x4.f17586e) / 1000000.0d);
                Q0 q7 = x4.f17583b;
                String str = q7.f17518a;
                if (q7.f17522e) {
                    return;
                }
                r rVarI = r.i();
                HashMap map = q7.f17521d;
                String str2 = q7.f17519b;
                if (str2 != null) {
                    map.put("fl.previous.screen", str2);
                }
                map.put("fl.current.screen", q7.f17518a);
                map.put("fl.resume.time", Long.toString(q7.f17523f));
                map.put("fl.layout.time", Long.toString(q7.f17524g));
                if (AbstractC0997i0.k(16)) {
                    rVarI.h("Flurry.ScreenTime", 6, map, true, true, null);
                }
                q7.f17522e = true;
                return;
        }
    }
}
