package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Mk {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.GestureDetectorOnGestureListenerC2675pi f4840a;

    public Mk(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi mListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mListener, "mListener");
        this.f4840a = mListener;
    }

    public final void a(android.view.MotionEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.f4840a.a(event.getX(), event.getY());
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f4840a.b(event.getX(), event.getY());
        }
    }
}
