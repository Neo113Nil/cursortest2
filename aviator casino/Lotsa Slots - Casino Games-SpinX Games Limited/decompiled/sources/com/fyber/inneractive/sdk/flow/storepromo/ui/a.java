package com.fyber.inneractive.sdk.flow.storepromo.ui;

/* loaded from: classes3.dex */
public final class a implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.flow.storepromo.ui.c f3753a;

    public a(com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar) {
        this.f3753a = cVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(android.view.animation.Animation animation) {
        com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar;
        android.view.View view;
        com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar2 = this.f3753a;
        android.view.ViewGroup viewGroup = cVar2.b;
        if (viewGroup != null) {
            viewGroup.removeView(cVar2.f3755a);
            this.f3753a.b.setAnimation(null);
            this.f3753a.b.setVisibility(8);
        }
        com.fyber.inneractive.sdk.flow.storepromo.b bVar = this.f3753a.f;
        if (bVar != null) {
            com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar2 = bVar.d;
            com.fyber.inneractive.sdk.flow.storepromo.observer.b bVar3 = new com.fyber.inneractive.sdk.flow.storepromo.observer.b((bVar2 == null || (cVar = bVar2.d) == null || cVar.b == null || (view = cVar.f3755a) == null || view.getParent() == null || cVar.b.getVisibility() != 0) ? false : true, bVar.i);
            java.util.Iterator it = bVar.h.iterator();
            while (it.hasNext()) {
                ((com.fyber.inneractive.sdk.flow.storepromo.observer.a) it.next()).a(bVar3);
            }
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(android.view.animation.Animation animation) {
    }
}
