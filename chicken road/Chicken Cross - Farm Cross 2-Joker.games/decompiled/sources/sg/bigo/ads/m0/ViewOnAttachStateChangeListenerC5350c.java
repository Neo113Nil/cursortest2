package sg.bigo.ads.m0;

import android.view.View;
import sg.bigo.ads.q0.AbstractC5446j;

/* renamed from: sg.bigo.ads.m0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnAttachStateChangeListenerC5350c implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5353f f13111a;

    public ViewOnAttachStateChangeListenerC5350c(C5353f c5353f) {
        this.f13111a = c5353f;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AbstractC5446j.a(2, null, this.f13111a.l, 0L);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C5353f c5353f = this.f13111a;
        c5353f.a(12, c5353f.i, System.currentTimeMillis() - this.f13111a.h);
    }
}
