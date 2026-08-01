package sg.bigo.ads.f;

import android.view.View;

/* renamed from: sg.bigo.ads.f.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnAttachStateChangeListenerC5101f implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5111p f12764a;

    public ViewOnAttachStateChangeListenerC5101f(C5111p c5111p) {
        this.f12764a = c5111p;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AbstractC5098c.a(this.f12764a, 4);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AbstractC5098c.a(this.f12764a, 5);
        view.removeOnAttachStateChangeListener(this);
    }
}
