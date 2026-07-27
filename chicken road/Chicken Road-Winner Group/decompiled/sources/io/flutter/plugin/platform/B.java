package io.flutter.plugin.platform;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class B implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9234a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9235b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9236c;

    public B(View view, n nVar) {
        this.f9235b = view;
        this.f9236c = nVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Window window;
        WindowManager.LayoutParams attributes;
        switch (this.f9234a) {
            case 0:
                A a3 = new A(0, this);
                View view2 = (View) this.f9235b;
                view2.getViewTreeObserver().addOnDrawListener(new C(view2, a3));
                view2.removeOnAttachStateChangeListener(this);
                break;
            default:
                kotlin.jvm.internal.j.e(view, "view");
                view.removeOnAttachStateChangeListener(this);
                Activity activity = (Activity) ((WeakReference) this.f9236c).get();
                IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                if (activity != null && iBinder != null) {
                    ((j0.i) this.f9235b).c(iBinder, activity);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f9234a) {
            case 0:
                break;
            default:
                kotlin.jvm.internal.j.e(view, "view");
                break;
        }
    }

    public B(j0.i sidecarCompat, Activity activity) {
        kotlin.jvm.internal.j.e(sidecarCompat, "sidecarCompat");
        this.f9235b = sidecarCompat;
        this.f9236c = new WeakReference(activity);
    }

    private final void a(View view) {
    }
}
