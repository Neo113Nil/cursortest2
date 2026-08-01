package sg.bigo.ads.K0;

import android.view.View;

/* loaded from: classes3.dex */
public final class V implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View.OnAttachStateChangeListener f12352a;

    public V(View.OnAttachStateChangeListener onAttachStateChangeListener) {
        this.f12352a = onAttachStateChangeListener;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f12352a;
        if (onAttachStateChangeListener != null) {
            onAttachStateChangeListener.onViewAttachedToWindow(view);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f12352a;
        if (onAttachStateChangeListener != null) {
            onAttachStateChangeListener.onViewDetachedFromWindow(view);
        }
    }
}
