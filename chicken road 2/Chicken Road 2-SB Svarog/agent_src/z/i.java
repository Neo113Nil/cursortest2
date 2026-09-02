package z;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class i implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final j f1330a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f1331b;

    public i(j jVar, Activity activity) {
        g0.h.e(jVar, "sidecarCompat");
        this.f1330a = jVar;
        this.f1331b = new WeakReference(activity);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Window window;
        WindowManager.LayoutParams attributes;
        g0.h.e(view, "view");
        view.removeOnAttachStateChangeListener(this);
        Activity activity = (Activity) this.f1331b.get();
        IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (activity == null || iBinder == null) {
            return;
        }
        this.f1330a.c(iBinder, activity);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        g0.h.e(view, "view");
    }
}
