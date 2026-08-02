package A0;

import android.view.View;

/* loaded from: classes.dex */
public final class y1 implements View.OnAttachStateChangeListener {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f598k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ P.F0 f599l;

    public y1(View view, P.F0 f02) {
        this.f598k = view;
        this.f599l = f02;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f598k.removeOnAttachStateChangeListener(this);
        this.f599l.x();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
