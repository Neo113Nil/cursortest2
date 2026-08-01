package sg.bigo.ads.k1;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f13033a;
    public C5268i d;
    public final WeakReference e;
    public boolean f;
    public float g = -1.0f;
    public Rect h = new Rect();
    public boolean i = false;
    public final Handler c = new Handler();
    public final c0 b = new c0(this);

    public d0(View view) {
        String str;
        this.f13033a = new WeakReference(view);
        b0 b0Var = new b0(this);
        WeakReference weakReference = new WeakReference(null);
        this.e = weakReference;
        Context context = view.getContext();
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            View a2 = sg.bigo.ads.K0.X.a(context, view);
            if (a2 == null) {
                str = "Unable to set Visibility Tracker due to no available root view.";
            } else {
                ViewTreeObserver viewTreeObserver2 = a2.getViewTreeObserver();
                if (viewTreeObserver2.isAlive()) {
                    this.e = new WeakReference(viewTreeObserver2);
                    viewTreeObserver2.addOnPreDrawListener(b0Var);
                    return;
                }
                str = "Visibility Tracker was unable to track views because the root view tree observer was not alive";
            }
            AbstractC5496a.a("VisibilityTracker", str);
        }
    }
}
