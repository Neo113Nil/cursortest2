package P;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.ads.V9;
import com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC0655Od;
import com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC0805bf;
import java.lang.ref.WeakReference;

/* renamed from: P.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0322v0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4565a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4566b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4567c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4568d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4569e;
    public final Object f;

    public C0322v0(Activity activity, ViewTreeObserverOnGlobalLayoutListenerC0805bf viewTreeObserverOnGlobalLayoutListenerC0805bf, ViewTreeObserverOnGlobalLayoutListenerC0805bf viewTreeObserverOnGlobalLayoutListenerC0805bf2) {
        this.f4569e = activity;
        this.f4568d = viewTreeObserverOnGlobalLayoutListenerC0805bf;
        this.f = viewTreeObserverOnGlobalLayoutListenerC0805bf2;
    }

    public Object a() {
        if (this.f4565a) {
            return null;
        }
        Object obj = this.f;
        if (obj != null) {
            return obj;
        }
        AbstractC0317t.d("Unexpected form of a provided value");
        throw new D2.e();
    }

    public void b() {
        ViewTreeObserver viewTreeObserver;
        View decorView;
        if (this.f4565a) {
            return;
        }
        Activity activity = (Activity) this.f4569e;
        ViewTreeObserverOnGlobalLayoutListenerC0805bf viewTreeObserverOnGlobalLayoutListenerC0805bf = (ViewTreeObserverOnGlobalLayoutListenerC0805bf) this.f;
        ViewTreeObserver viewTreeObserver2 = null;
        if (activity != null) {
            Window window = activity.getWindow();
            ViewTreeObserver viewTreeObserver3 = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
            if (viewTreeObserver3 != null) {
                viewTreeObserver3.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0805bf);
            }
        }
        V9 v9 = P2.o.f4767B.f4768A;
        ViewTreeObserverOnGlobalLayoutListenerC0655Od viewTreeObserverOnGlobalLayoutListenerC0655Od = new ViewTreeObserverOnGlobalLayoutListenerC0655Od((ViewTreeObserverOnGlobalLayoutListenerC0805bf) this.f4568d, viewTreeObserverOnGlobalLayoutListenerC0805bf);
        View view = (View) ((WeakReference) viewTreeObserverOnGlobalLayoutListenerC0655Od.f7794k).get();
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            viewTreeObserverOnGlobalLayoutListenerC0655Od.p1(viewTreeObserver2);
        }
        this.f4565a = true;
    }

    public C0322v0(AbstractC0320u0 abstractC0320u0, Object obj, boolean z3, U0 u02, boolean z5) {
        this.f4568d = abstractC0320u0;
        this.f4565a = z3;
        this.f4569e = u02;
        this.f4566b = z5;
        this.f = obj;
        this.f4567c = true;
    }
}
