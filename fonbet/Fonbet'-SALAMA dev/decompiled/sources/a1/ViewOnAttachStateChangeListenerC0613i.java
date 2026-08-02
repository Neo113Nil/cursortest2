package a1;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import io.flutter.plugin.platform.A;
import io.flutter.plugin.platform.B;
import io.flutter.plugin.platform.o;
import java.lang.ref.WeakReference;

/* renamed from: a1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0613i implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7957a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7958b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7959c;

    public ViewOnAttachStateChangeListenerC0613i(View view, o oVar) {
        this.f7958b = view;
        this.f7959c = oVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Window window;
        WindowManager.LayoutParams attributes;
        switch (this.f7957a) {
            case 0:
                t6.h.e(view, "view");
                view.removeOnAttachStateChangeListener(this);
                Activity activity = (Activity) ((WeakReference) this.f7959c).get();
                IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                if (activity != null && iBinder != null) {
                    ((C0614j) this.f7958b).g(iBinder, activity);
                    break;
                }
                break;
            default:
                A a2 = new A(this, 0);
                View view2 = (View) this.f7958b;
                view2.getViewTreeObserver().addOnDrawListener(new B(view2, a2));
                view2.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f7957a) {
            case 0:
                t6.h.e(view, "view");
                break;
        }
    }

    public ViewOnAttachStateChangeListenerC0613i(C0614j c0614j, Activity activity) {
        t6.h.e(c0614j, "sidecarCompat");
        this.f7958b = c0614j;
        this.f7959c = new WeakReference(activity);
    }

    private final void a(View view) {
    }
}
