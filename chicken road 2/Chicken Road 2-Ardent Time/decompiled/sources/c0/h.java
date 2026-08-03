package c0;

/* loaded from: classes.dex */
public final class h implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final c0.i f2558a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f2559b;

    public h(c0.i sidecarCompat, android.app.Activity activity) {
        kotlin.jvm.internal.i.e(sidecarCompat, "sidecarCompat");
        this.f2558a = sidecarCompat;
        this.f2559b = new java.lang.ref.WeakReference(activity);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        android.view.Window window;
        android.view.WindowManager.LayoutParams attributes;
        kotlin.jvm.internal.i.e(view, "view");
        view.removeOnAttachStateChangeListener(this);
        android.app.Activity activity = (android.app.Activity) this.f2559b.get();
        android.os.IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (activity == null || iBinder == null) {
            return;
        }
        this.f2558a.g(iBinder, activity);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        kotlin.jvm.internal.i.e(view, "view");
    }
}
