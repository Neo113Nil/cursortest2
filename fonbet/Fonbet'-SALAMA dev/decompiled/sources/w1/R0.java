package w1;

import android.app.Activity;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class R0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17520a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f17521b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S0 f17522c;

    public /* synthetic */ R0(S0 s02, Activity activity, int i7) {
        this.f17520a = i7;
        this.f17522c = s02;
        this.f17521b = activity;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Q0 q02;
        switch (this.f17520a) {
            case 0:
                this.f17521b.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                T0 t02 = (T0) this.f17522c.f17529b;
                this.f17521b.getApplication();
                if (t02.f17541e != null) {
                    V0 d7 = V0.d();
                    S0 s02 = t02.f17541e;
                    synchronized (((ArrayList) d7.f17563c)) {
                        ((ArrayList) d7.f17563c).remove(s02);
                    }
                    t02.f17541e = null;
                }
                ((T0) this.f17522c.f17529b).b(this.f17521b, "fl.layout.time", "fl.layout.runtime.memory", "fl.layout.system.memory");
                T0 t03 = (T0) this.f17522c.f17529b;
                t03.f17544h = true;
                if (t03.f17542f) {
                    t03.c();
                    return;
                }
                return;
            default:
                this.f17521b.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                S0 s03 = this.f17522c;
                X0 x02 = (X0) s03.f17529b;
                if (!x02.f17579d || (q02 = x02.f17577b) == null) {
                    return;
                }
                long nanoTime = System.nanoTime();
                X0 x03 = (X0) s03.f17529b;
                q02.f17518g = (long) ((nanoTime - x03.f17580e) / 1000000.0d);
                Q0 q03 = x03.f17577b;
                String str = q03.f17512a;
                if (q03.f17516e) {
                    return;
                }
                r i7 = r.i();
                HashMap hashMap = q03.f17515d;
                String str2 = q03.f17513b;
                if (str2 != null) {
                    hashMap.put("fl.previous.screen", str2);
                }
                hashMap.put("fl.current.screen", q03.f17512a);
                hashMap.put("fl.resume.time", Long.toString(q03.f17517f));
                hashMap.put("fl.layout.time", Long.toString(q03.f17518g));
                if (AbstractC1706i0.k(16)) {
                    i7.h("Flurry.ScreenTime", 6, hashMap, true, true, null);
                }
                q03.f17516e = true;
                return;
        }
    }
}
