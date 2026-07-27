package com.fyber.inneractive.sdk.flow.storepromo.ui;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class a implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f5406a;

    public a(c cVar) {
        this.f5406a = cVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        c cVar;
        View view;
        c cVar2 = this.f5406a;
        ViewGroup viewGroup = cVar2.b;
        if (viewGroup != null) {
            viewGroup.removeView(cVar2.f5408a);
            this.f5406a.b.setAnimation(null);
            this.f5406a.b.setVisibility(8);
        }
        com.fyber.inneractive.sdk.flow.storepromo.b bVar = this.f5406a.f;
        if (bVar != null) {
            com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar2 = bVar.d;
            com.fyber.inneractive.sdk.flow.storepromo.observer.b bVar3 = new com.fyber.inneractive.sdk.flow.storepromo.observer.b((bVar2 == null || (cVar = bVar2.d) == null || cVar.b == null || (view = cVar.f5408a) == null || view.getParent() == null || cVar.b.getVisibility() != 0) ? false : true, bVar.i);
            Iterator it = bVar.h.iterator();
            while (it.hasNext()) {
                ((com.fyber.inneractive.sdk.flow.storepromo.observer.a) it.next()).a(bVar3);
            }
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
