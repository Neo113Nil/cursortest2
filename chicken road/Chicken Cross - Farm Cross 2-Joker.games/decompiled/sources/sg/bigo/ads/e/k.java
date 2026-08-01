package sg.bigo.ads.e;

import android.view.View;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class k implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12748a;
    public final /* synthetic */ l b;

    public k(l lVar, View view) {
        this.b = lVar;
        this.f12748a = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        l.a(this.b);
        this.f12748a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        l lVar = this.b;
        AbstractC5446j.a(lVar.k);
        lVar.j = false;
    }
}
